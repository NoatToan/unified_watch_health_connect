package org.apache.commons.lang3.exception;

/* JADX INFO: loaded from: classes3.dex */
public class CloneFailedException extends RuntimeException {
    private static final long serialVersionUID = 20091223;

    public CloneFailedException(String str) {
        super(str);
    }

    public CloneFailedException(Throwable th3) {
        super(th3);
    }

    public CloneFailedException(String str, Throwable th3) {
        super(str, th3);
    }
}
