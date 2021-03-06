package com.amazonaws.kinesisvideo.parser.examples;

import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import com.amazonaws.regions.Regions;
import org.junit.Ignore;
import org.junit.Test;

import java.io.IOException;

public class KinesisVideoRendererExampleTest {

    @Ignore
    @Test
    public void testExample() throws InterruptedException, IOException {
        KinesisVideoRendererExample example = KinesisVideoRendererExample.builder().region(Regions.US_WEST_2)
                .streamName("getmedia-sample-stream")
                .credentialsProvider(new ProfileCredentialsProvider())
                .build();

        example.execute();
    }

}


