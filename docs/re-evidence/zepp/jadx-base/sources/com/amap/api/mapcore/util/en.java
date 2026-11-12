package com.amap.api.mapcore.util;

import kotlinx.serialization.json.internal.JsonLexerKt;

/* JADX INFO: loaded from: classes2.dex */
public final class en {
    public short[] a;
    public int b;
    public boolean c;

    public en() {
        this((byte) 0);
    }

    private short[] c(int i) {
        short[] sArr = new short[i];
        System.arraycopy(this.a, 0, sArr, 0, Math.min(this.b, i));
        this.a = sArr;
        return sArr;
    }

    public final void a(short s) {
        short[] sArrC = this.a;
        int i = this.b;
        if (i == sArrC.length) {
            sArrC = c(Math.max(8, (int) (i * 1.75f)));
        }
        int i2 = this.b;
        this.b = i2 + 1;
        sArrC[i2] = s;
    }

    public final short[] b(int i) {
        int i2 = this.b + i;
        if (i2 > this.a.length) {
            c(Math.max(8, i2));
        }
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof en)) {
            return false;
        }
        en enVar = (en) obj;
        int i = this.b;
        if (i != enVar.b) {
            return false;
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (this.a[i2] != enVar.a[i2]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return 42;
    }

    public final String toString() {
        if (this.b == 0) {
            return "[]";
        }
        short[] sArr = this.a;
        StringBuilder sb = new StringBuilder(32);
        sb.append(JsonLexerKt.BEGIN_LIST);
        sb.append((int) sArr[0]);
        for (int i = 1; i < this.b; i++) {
            sb.append(", ");
            sb.append((int) sArr[i]);
        }
        sb.append(JsonLexerKt.END_LIST);
        return sb.toString();
    }

    private en(byte b) {
        this.c = true;
        this.a = new short[16];
    }

    public final short a(int i) {
        if (i < this.b) {
            return this.a[i];
        }
        throw new IndexOutOfBoundsException("index can't be >= size: " + i + " >= " + this.b);
    }
}
