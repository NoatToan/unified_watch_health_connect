package org.java_websocket.exceptions;

/* JADX INFO: loaded from: classes23.dex */
public class LimitExceededException extends InvalidDataException {
    private static final long serialVersionUID = 6908339749836826785L;
    private final int b;

    public LimitExceededException() {
        this(Integer.MAX_VALUE);
    }

    public int getLimit() {
        return this.b;
    }

    public LimitExceededException(int i) {
        super(1009);
        this.b = i;
    }

    public LimitExceededException(String str, int i) {
        super(1009, str);
        this.b = i;
    }

    public LimitExceededException(String str) {
        this(str, Integer.MAX_VALUE);
    }
}
