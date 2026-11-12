package com.airoha.android.lib.fota.nvr;

import com.airoha.android.lib.util.Converter;

/* JADX INFO: loaded from: classes2.dex */
public class NvrDescriptor {
    private String a;
    private String b;
    private int c;
    private byte[] d;

    public NvrDescriptor(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public int getNvKey() {
        return Integer.valueOf(this.a, 16).intValue();
    }

    public byte[] getNvValue() {
        return Converter.hexStringToByteArray(this.b);
    }
}
