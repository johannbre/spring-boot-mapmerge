package pl.poznachowski.mergedmapproperties;

import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.hamcrest.collection.IsMapContaining;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsMapContaining.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("dev")
public class MergedMapPropertiesApplicationTests {

    @Autowired
    TestProperties testProperties;

    @Test
    public void contextLoads() {
        assertThat(testProperties.getMap(), allOf(
                hasEntry(1, 10),
                hasEntry(2, 20),
                hasEntry(100, 100)));

        assertThat(testProperties.getMapOfMap().get("KEY1"), allOf(
                hasEntry(1, 10),
                hasEntry(2, 20),
                hasEntry(100, 100)));

        assertThat(testProperties.getMapOfMap().get("KEY2"), allOf(
                hasEntry(3, 30),
                hasEntry(4, 40)));
    }

}
