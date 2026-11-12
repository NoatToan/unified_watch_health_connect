package com.google.android.play.core.splitinstall.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzbh extends RuntimeException {
    public zzbh(String str) {
        super(str);
    }

    public zzbh(String str, Throwable th) {
        super("Failed to initialize FileStorage", th);
    }
}
