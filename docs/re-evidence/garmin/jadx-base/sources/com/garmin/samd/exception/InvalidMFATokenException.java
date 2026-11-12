package com.garmin.samd.exception;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0011\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/samd/exception/InvalidMFATokenException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "message", "", "(Ljava/lang/String;)V", "SaMD_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class InvalidMFATokenException extends Exception {
    public /* synthetic */ InvalidMFATokenException(String str, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : str);
    }

    public InvalidMFATokenException(String str) {
        super(str == null ? "" : str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public InvalidMFATokenException() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
