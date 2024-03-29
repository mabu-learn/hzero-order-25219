package com.hand;

import io.choerodon.resource.annoation.EnableChoerodonResourceServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author MSI1
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableChoerodonResourceServer
public class HzeroOrder25219Application {

    public static void main(String[] args) {
        SpringApplication.run(HzeroOrder25219Application.class, args);
    }

}
