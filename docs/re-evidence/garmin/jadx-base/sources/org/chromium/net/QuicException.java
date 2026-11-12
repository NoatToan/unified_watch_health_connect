package org.chromium.net;

/* JADX INFO: loaded from: classes3.dex */
public abstract class QuicException extends NetworkException {
    public QuicException(String str, Throwable th3) {
        super(str, th3);
    }

    public abstract int getQuicDetailedErrorCode();
}
