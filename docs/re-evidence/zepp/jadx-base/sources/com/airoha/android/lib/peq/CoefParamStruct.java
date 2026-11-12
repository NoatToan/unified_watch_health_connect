package com.airoha.android.lib.peq;

import com.airoha.android.lib.util.Converter;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class CoefParamStruct {
    public byte[] a;
    public byte[] b;
    public byte[] c;

    public CoefParamStruct(short s, short s2, byte[] bArr) {
        this.a = Converter.shortToBytes(s);
        this.b = Converter.shortToBytes(s2);
        this.c = bArr;
    }

    public byte[] getRaw() {
        ArrayList arrayList = new ArrayList();
        for (byte b : this.a) {
            arrayList.add(Byte.valueOf(b));
        }
        for (byte b2 : this.b) {
            arrayList.add(Byte.valueOf(b2));
        }
        for (byte b3 : this.c) {
            arrayList.add(Byte.valueOf(b3));
        }
        byte[] bArr = new byte[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            bArr[i] = ((Byte) arrayList.get(i)).byteValue();
        }
        return bArr;
    }
}
