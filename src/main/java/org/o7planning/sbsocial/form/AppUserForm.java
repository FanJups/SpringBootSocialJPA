package org.o7planning.sbsocial.form;

import org.springframework.social.connect.Connection;
import org.springframework.social.connect.ConnectionKey;
import org.springframework.social.connect.UserProfile;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AppUserForm {
	
	private Long userId;
    private String email;
    private String userName;
 
    private String firstName;
    private String lastName;
    private String password;
    private String role;
    private String signInProvider;
    private String providerUserId;
    
    public AppUserForm(Connection<?> connection) {
        UserProfile socialUserProfile = connection.fetchUserProfile();
        this.userId = null;
        this.email = socialUserProfile.getEmail();
        this.userName = socialUserProfile.getUsername();
        this.firstName = socialUserProfile.getFirstName();
        this.lastName = socialUserProfile.getLastName();
 
        ConnectionKey key = connection.getKey();
        // google, facebook
        this.signInProvider = key.getProviderId();
 
        // ID of User on google, facebook
        
        this.providerUserId = key.getProviderUserId();
    }

}
