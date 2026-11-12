package androidx.core.os;

import defpackage.l4h;

/* JADX INFO: loaded from: classes.dex */
public class OperationCanceledException extends RuntimeException {
    public OperationCanceledException() {
        this(null);
    }

    public OperationCanceledException(String str) {
        super(l4h.e(str, "The operation has been canceled."));
    }
}
