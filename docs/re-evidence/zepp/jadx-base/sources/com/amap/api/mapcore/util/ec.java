package com.amap.api.mapcore.util;

import kotlinx.serialization.json.internal.JsonLexerKt;

/* JADX INFO: loaded from: classes2.dex */
public final class ec {
    public int[] a;
    public int b;
    public boolean c;

    public ec() {
        this((byte) 0);
    }

    private int[] c(int i) {
        int[] iArr = new int[i];
        System.arraycopy(this.a, 0, iArr, 0, Math.min(this.b, i));
        this.a = iArr;
        return iArr;
    }

    public final void a(int i) {
        int[] iArrC = this.a;
        int i2 = this.b;
        if (i2 == iArrC.length) {
            iArrC = c(Math.max(8, (int) (i2 * 1.75f)));
        }
        int i3 = this.b;
        this.b = i3 + 1;
        iArrC[i3] = i;
    }

    public final int[] b(int i) {
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
        if (!(obj instanceof ec)) {
            return false;
        }
        ec ecVar = (ec) obj;
        int i = this.b;
        if (i != ecVar.b) {
            return false;
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (this.a[i2] != ecVar.a[i2]) {
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
        int[] iArr = this.a;
        StringBuilder sb = new StringBuilder(32);
        sb.append(JsonLexerKt.BEGIN_LIST);
        sb.append(iArr[0]);
        for (int i = 1; i < this.b; i++) {
            sb.append(", ");
            sb.append(iArr[i]);
        }
        sb.append(JsonLexerKt.END_LIST);
        return sb.toString();
    }

    private ec(byte b) {
        this.c = true;
        this.a = new int[16];
    }
}
