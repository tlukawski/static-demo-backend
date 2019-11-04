package it.lukawski.staticdemobackend;

public class DemoResponse {
    private final String message;

    public DemoResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
