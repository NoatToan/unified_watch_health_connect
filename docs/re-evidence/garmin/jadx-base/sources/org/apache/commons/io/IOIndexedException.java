package org.apache.commons.io;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class IOIndexedException extends IOException {
    private static final long serialVersionUID = 1;
    private final int index;

    public IOIndexedException(int i14, Throwable th3) {
        super(toMessage(i14, th3), th3);
        this.index = i14;
    }

    public static String toMessage(int i14, Throwable th3) {
        return String.format("%s #%,d: %s", th3 == null ? "Null" : th3.getClass().getSimpleName(), Integer.valueOf(i14), th3 != null ? th3.getMessage() : "Null");
    }

    public int getIndex() {
        return this.index;
    }
}
