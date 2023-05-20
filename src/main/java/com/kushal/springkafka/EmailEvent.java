package com.kushal.springkafka;

import java.util.Objects;

public class EmailEvent {
    private String subject;
    private String message;

    public EmailEvent() {}
    public EmailEvent(String subject, String message) {
        this.subject = subject;
        this.message = message;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        EmailEvent that = (EmailEvent) o;
        return Objects.equals(subject, that.subject) && Objects.equals(message, that.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subject, message);
    }
}
