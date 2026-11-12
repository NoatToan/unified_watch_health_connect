package org.junit.runner.notification;

import java.io.PrintWriter;
import java.io.Serializable;
import java.io.StringWriter;
import org.junit.runner.Description;

/* JADX INFO: loaded from: classes23.dex */
public class Failure implements Serializable {
    private static final long serialVersionUID = 1;
    private final Description a;
    private final Throwable b;

    public Failure(Description description, Throwable th) {
        this.b = th;
        this.a = description;
    }

    public Description getDescription() {
        return this.a;
    }

    public Throwable getException() {
        return this.b;
    }

    public String getMessage() {
        return getException().getMessage();
    }

    public String getTestHeader() {
        return this.a.getDisplayName();
    }

    public String getTrace() {
        StringWriter stringWriter = new StringWriter();
        getException().printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public String toString() {
        return getTestHeader() + ": " + this.b.getMessage();
    }
}
