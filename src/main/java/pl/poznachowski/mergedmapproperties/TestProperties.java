/*
* Copyright 2017 Jeppesen. All Rights Reserved
*/
package pl.poznachowski.mergedmapproperties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@Getter
@Setter
@ConfigurationProperties("test")
public class TestProperties {
    private Map<Integer, Integer> map;
    private Map<String, Map<Integer, Integer>> mapOfMap;
}