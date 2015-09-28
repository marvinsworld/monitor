package com.marvin.monitor;

import org.perf4j.StopWatch;
import org.perf4j.slf4j.Slf4JStopWatch;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Description:.
 *
 * @author zhiqiang.ge
 * @version V1.0
 * @since 2015/9/26 16:09
 */
public class Demo {

    private static final Logger logger = LoggerFactory.getLogger(Demo.class);

    public static void main(String[] args) throws InterruptedException {
        StopWatch stopWatch = new Slf4JStopWatch();
        Thread.sleep(1000L);
        stopWatch.stop();
    }
}
