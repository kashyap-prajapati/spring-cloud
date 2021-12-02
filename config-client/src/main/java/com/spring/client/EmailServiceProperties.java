package com.spring.client;


import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;



@Configuration
@ConfigurationProperties(prefix = "email.service")
@Component
public class EmailServiceProperties {

	private Map<String, Property> properties = new HashMap<>();

    public Map<String, Property> getProperties() {
        return properties;
    }


    public static class Property {
        private String apiKey;
        private String consumerAppId;
        private String consumerAppName;
        private String emailFrom;
        private String emailFromName;
        private String logoURL;
		public String getApiKey() {
			return apiKey;
		}
		public void setApiKey(String apiKey) {
			this.apiKey = apiKey;
		}
		public String getConsumerAppId() {
			return consumerAppId;
		}
		public void setConsumerAppId(String consumerAppId) {
			this.consumerAppId = consumerAppId;
		}
		public String getConsumerAppName() {
			return consumerAppName;
		}
		public void setConsumerAppName(String consumerAppName) {
			this.consumerAppName = consumerAppName;
		}
		public String getEmailFrom() {
			return emailFrom;
		}
		public void setEmailFrom(String emailFrom) {
			this.emailFrom = emailFrom;
		}
		public String getEmailFromName() {
			return emailFromName;
		}
		public void setEmailFromName(String emailFromName) {
			this.emailFromName = emailFromName;
		}
		public String getLogoURL() {
			return logoURL;
		}
		public void setLogoURL(String logoURL) {
			this.logoURL = logoURL;
		}
		@Override
		public String toString() {
			return "Property [apiKey=" + apiKey + ", consumerAppId=" + consumerAppId + ", consumerAppName="
					+ consumerAppName + ", emailFrom=" + emailFrom + ", emailFromName=" + emailFromName + ", logoURL="
					+ logoURL + "]";
		}
        
        
    }
    
    
}
