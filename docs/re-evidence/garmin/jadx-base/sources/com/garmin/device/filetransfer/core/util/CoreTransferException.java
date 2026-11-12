package com.garmin.device.filetransfer.core.util;

import i3.e5;
import ok2.e;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0016\u0018\u00002\u00060\u0001j\u0002`\u0002B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0002¢\u0006\u0004\b\b\u0010\tB!\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0007\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0002¢\u0006\u0004\b\b\u0010\nB\u0011\b\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/garmin/device/filetransfer/core/util/CoreTransferException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lok2/e;", "failure", "", "details", "ex", "<init>", "(Lok2/e;Ljava/lang/String;Ljava/lang/Exception;)V", "(Lok2/e;Ljava/lang/Exception;)V", "(Lok2/e;)V", "Lok2/e;", "getFailure", "()Lok2/e;", "Ljava/lang/String;", "getDetails", "()Ljava/lang/String;", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class CoreTransferException extends Exception {
    private final String details;
    private final e failure;

    /* JADX WARN: Illegal instructions before constructor call */
    public CoreTransferException(e eVar, String str, Exception exc) {
        String message;
        Throwable cause;
        eVar.getClass();
        String strName = eVar.name();
        if (str == null) {
            message = null;
            String message2 = exc != null ? exc.getMessage() : null;
            if (message2 != null) {
                message = message2;
            } else if (exc != null && (cause = exc.getCause()) != null) {
                message = cause.getMessage();
            }
        } else {
            message = str;
        }
        super(e5.g(strName, ": ", message), exc);
        this.failure = eVar;
        this.details = str;
    }

    public final String getDetails() {
        return this.details;
    }

    public final e getFailure() {
        return this.failure;
    }

    public /* synthetic */ CoreTransferException(e eVar, String str, Exception exc, int i14, j jVar) {
        this(eVar, str, (i14 & 4) != 0 ? null : exc);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CoreTransferException(e eVar, Exception exc) {
        this(eVar, exc != null ? exc.getMessage() : null, exc);
        eVar.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CoreTransferException(e eVar) {
        this(eVar, null, null);
        eVar.getClass();
    }
}
