package com.airoha.android.lib.peq;

import com.airoha.android.lib.util.Converter;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class PeqBandInfo {
    private byte a;
    private byte b;
    private byte[] c;
    private byte[] d;
    private byte[] e;
    private byte[] f;
    private float g;
    private float h;
    private float i;
    private float j;

    public PeqBandInfo(float f, float f2, float f3, byte b) {
        this.a = (byte) 1;
        this.b = (byte) 2;
        this.g = f;
        this.i = f2;
        this.h = f3;
        this.j = f / f2;
        this.a = b;
        this.b = (byte) 2;
        this.c = Converter.intToBytes((int) (f * 100.0f));
        this.d = Converter.intToBytes((int) (this.h * 100.0f));
        this.e = Converter.intToBytes((int) (this.i * 100.0f));
        this.f = Converter.intToBytes((int) (this.j * 100.0f));
    }

    public float getBw() {
        return this.i;
    }

    public float getFreq() {
        return this.g;
    }

    public float getGain() {
        return this.h;
    }

    public float getQ() {
        return this.j;
    }

    public byte[] getRaw() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Byte.valueOf(this.a));
        arrayList.add(Byte.valueOf(this.b));
        for (byte b : this.c) {
            arrayList.add(Byte.valueOf(b));
        }
        for (byte b2 : this.d) {
            arrayList.add(Byte.valueOf(b2));
        }
        for (byte b3 : this.e) {
            arrayList.add(Byte.valueOf(b3));
        }
        for (byte b4 : this.f) {
            arrayList.add(Byte.valueOf(b4));
        }
        byte[] bArr = new byte[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            bArr[i] = ((Byte) arrayList.get(i)).byteValue();
        }
        return bArr;
    }

    public boolean isEnable() {
        return this.a == 1;
    }

    public PeqBandInfo(byte[] bArr) {
        this.a = (byte) 1;
        this.b = (byte) 2;
        this.a = bArr[0];
        this.b = bArr[1];
        byte[] bArr2 = new byte[4];
        this.c = bArr2;
        System.arraycopy(bArr, 2, bArr2, 0, 4);
        byte[] bArr3 = new byte[4];
        this.d = bArr3;
        System.arraycopy(bArr, 6, bArr3, 0, 4);
        byte[] bArr4 = new byte[4];
        this.e = bArr4;
        System.arraycopy(bArr, 10, bArr4, 0, 4);
        byte[] bArr5 = new byte[4];
        this.f = bArr5;
        System.arraycopy(bArr, 14, bArr5, 0, 4);
        this.g = (float) (((double) Converter.bytesToInt32(this.c)) / 100.0d);
        this.h = (float) (((double) Converter.bytesToInt32(this.d)) / 100.0d);
        this.i = (float) (((double) Converter.bytesToInt32(this.e)) / 100.0d);
        this.j = (float) (((double) Converter.bytesToInt32(this.f)) / 100.0d);
    }
}
