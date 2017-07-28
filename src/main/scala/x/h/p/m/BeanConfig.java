package x.h.p.m;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.module.scala.DefaultScalaModule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by xrry on 7/20/16.
 */
@Configuration
public class BeanConfig {
    @Bean(name = "JsonMapper")
    public ObjectMapper jsonMapper(){
        ObjectMapper objectMapper = new ObjectMapper();

        objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        objectMapper.registerModule(new DefaultScalaModule());

        return objectMapper;
    }
}
