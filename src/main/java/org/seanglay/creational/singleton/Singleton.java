package org.seanglay.creational.singleton;

public class Singleton {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.info("Application started");
        logger.debug("User logged in");
        logger.warn("Memory usage high");
        logger.error("Database connection failed");
    }
}
