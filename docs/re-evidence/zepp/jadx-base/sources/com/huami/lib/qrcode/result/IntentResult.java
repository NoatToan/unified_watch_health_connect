package com.huami.lib.qrcode.result;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes10.dex */
public final class IntentResult {
    private final String a;
    private final String b;
    private final byte[] c;

    public IntentResult() {
        this(null, null, null);
    }

    public String getContents() {
        return this.a;
    }

    public String getFormatName() {
        return this.b;
    }

    public byte[] getRawBytes() {
        return this.c;
    }

    @NonNull
    public String toString() {
        byte[] bArr = this.c;
        return "Format: " + this.b + "\nContents: " + this.a + "\nRaw bytes: (" + (bArr == null ? 0 : bArr.length) + " bytes)\n";
    }

    public IntentResult(String str, String str2, byte[] bArr) {
        this.a = str;
        this.b = str2;
        this.c = bArr;
    }
}
