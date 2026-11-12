package net.lingala.zip4j.exception;

import java.io.IOException;

/* JADX INFO: loaded from: classes20.dex */
public class ZipException extends IOException {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Type f43015b;

    public enum Type {
        WRONG_PASSWORD,
        TASK_CANCELLED_EXCEPTION,
        CHECKSUM_MISMATCH,
        UNKNOWN_COMPRESSION_METHOD,
        FILE_NOT_FOUND,
        UNSUPPORTED_ENCRYPTION,
        UNKNOWN
    }

    public ZipException(String str) {
        super(str);
        this.f43015b = Type.UNKNOWN;
    }

    public ZipException(Exception exc) {
        super(exc);
        this.f43015b = Type.UNKNOWN;
    }

    public ZipException(String str, Exception exc) {
        super(str, exc);
        this.f43015b = Type.UNKNOWN;
    }

    public ZipException(String str, Type type) {
        super(str);
        Type type2 = Type.UNKNOWN;
        this.f43015b = type;
    }

    public ZipException(String str, Throwable th, Type type) {
        super(str, th);
        Type type2 = Type.UNKNOWN;
        this.f43015b = type;
    }
}
