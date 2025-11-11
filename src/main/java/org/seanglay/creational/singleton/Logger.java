package org.seanglay.creational.singleton;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.io.PrintStream;
import java.time.LocalDateTime;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Logger {
    private static final Logger INSTANCE = new Logger();

    public static Logger getInstance() {
        return INSTANCE;
    }

    public void info(String message) {
        log("INFO", message, System.out);
    }

    public void error(String message) {
        log("ERROR", message, System.err);
    }

    public void warn(String message) {
        log("WARN", message, System.out);
    }

    public void debug(String message) {
        log("DEBUG", message, System.out);
    }

    private void log(String level, String message, PrintStream stream) {
        String timestamp = LocalDateTime.now().toString();
        String logEntry = String.format("[%s] %s: %s", timestamp, level, message);
        stream.println(logEntry);
    }
}
