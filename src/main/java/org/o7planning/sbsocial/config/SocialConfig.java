package org.o7planning.sbsocial.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.social.config.annotation.EnableSocial;
import org.springframework.social.config.annotation.SocialConfigurer;

@Configuration
@EnableSocial
// Load to Environment.
@PropertySource("classpath:social-cfg.properties")
public class SocialConfig implements SocialConfigurer {

}
