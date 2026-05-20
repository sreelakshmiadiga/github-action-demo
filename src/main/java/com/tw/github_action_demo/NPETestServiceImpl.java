package com.tw.github_action_demo;

import java.util.Optional;
import java.util.logging.Logger;

public class NPETestServiceImpl {

    private static final Logger logger = Logger.getLogger(NPETestServiceImpl.class.getName());

    public void testNPE() {
        final Integer p = null;
        Optional.ofNullable(p)
                .ifPresent(value -> logger.info(String.valueOf(value.compareTo(10))));
    }
}