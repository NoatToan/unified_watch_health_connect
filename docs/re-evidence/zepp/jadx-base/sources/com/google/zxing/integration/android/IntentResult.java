package com.google.zxing.integration.android;

/* JADX INFO: loaded from: classes4.dex */
public final class IntentResult {
    private final String a;
    private final String b;
    private final byte[] c;
    private final Integer d;
    private final String e;
    private final String f;

    public IntentResult() {
        this(null, null, null, null, null, null);
    }

    public String getBarcodeImagePath() {
        return this.f;
    }

    public String getContents() {
        return this.a;
    }

    public String getErrorCorrectionLevel() {
        return this.e;
    }

    public String getFormatName() {
        return this.b;
    }

    public Integer getOrientation() {
        return this.d;
    }

    public byte[] getRawBytes() {
        return this.c;
    }

    public String toString() {
        byte[] bArr = this.c;
        return "Format: " + this.b + "\nContents: " + this.a + "\nRaw bytes: (" + (bArr == null ? 0 : bArr.length) + " bytes)\nOrientation: " + this.d + "\nEC level: " + this.e + "\nBarcode image: " + this.f + '\n';
    }

    public IntentResult(String str, String str2, byte[] bArr, Integer num, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = bArr;
        this.d = num;
        this.e = str3;
        this.f = str4;
    }
}
