package com.google.android.gms.iid;

/* JADX INFO: loaded from: classes14.dex */
public final class zzaa extends Exception {
    private final int errorCode;

    public zzaa(int i14, String str) {
        super(str);
        this.errorCode = i14;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }
}
