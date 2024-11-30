package com.digitalhome.raaga;

import com.digitalhome.raaga.config.AsyncSyncConfiguration;
import com.digitalhome.raaga.config.EmbeddedElasticsearch;
import com.digitalhome.raaga.config.EmbeddedKafka;
import com.digitalhome.raaga.config.EmbeddedMongo;
import com.digitalhome.raaga.config.JacksonConfiguration;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { RaagaApp.class, JacksonConfiguration.class, AsyncSyncConfiguration.class })
@EmbeddedMongo
@EmbeddedElasticsearch
@EmbeddedKafka
public @interface IntegrationTest {
}
