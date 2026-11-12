package com.google.zxing.aztec.encoder;

import com.google.zxing.common.BitArray;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes4.dex */
final class c {
    public static final c e = new c(d.b, 0, 0, 0);
    private final int a;
    private final d b;
    private final int c;
    private final int d;

    private c(d dVar, int i, int i2, int i3) {
        this.b = dVar;
        this.a = i;
        this.c = i2;
        this.d = i3;
    }

    public c a(int i) {
        int i2;
        d dVarA = this.b;
        int i3 = this.a;
        int i4 = this.d;
        if (i3 == 4 || i3 == 2) {
            int i5 = HighLevelEncoder.h[i3][0];
            int i6 = 65535 & i5;
            int i7 = i5 >> 16;
            dVarA = dVarA.a(i6, i7);
            i4 += i7;
            i3 = 0;
        }
        int i8 = this.c;
        if (i8 == 0 || i8 == 31) {
            i2 = 18;
        } else {
            i2 = i8 == 62 ? 9 : 8;
        }
        c cVar = new c(dVarA, i3, i8 + 1, i4 + i2);
        return cVar.c == 2078 ? cVar.b(i + 1) : cVar;
    }

    public c b(int i) {
        int i2 = this.c;
        return i2 == 0 ? this : new c(this.b.b(i - i2, i2), this.a, 0, this.d);
    }

    public int c() {
        return this.c;
    }

    public int d() {
        return this.d;
    }

    public int e() {
        return this.a;
    }

    public d f() {
        return this.b;
    }

    public boolean g(c cVar) {
        int i;
        int i2 = this.d + (HighLevelEncoder.h[this.a][cVar.a] >> 16);
        int i3 = cVar.c;
        if (i3 > 0 && ((i = this.c) == 0 || i > i3)) {
            i2 += 10;
        }
        return i2 <= cVar.d;
    }

    public c h(int i, int i2) {
        int i3 = this.d;
        d dVarA = this.b;
        int i4 = this.a;
        if (i != i4) {
            int i5 = HighLevelEncoder.h[i4][i];
            int i6 = 65535 & i5;
            int i7 = i5 >> 16;
            dVarA = dVarA.a(i6, i7);
            i3 += i7;
        }
        int i8 = i == 2 ? 4 : 5;
        return new c(dVarA.a(i2, i8), i, 0, i3 + i8);
    }

    public c i(int i, int i2) {
        d dVar = this.b;
        int i3 = this.a;
        int i4 = i3 == 2 ? 4 : 5;
        return new c(dVar.a(HighLevelEncoder.j[i3][i], i4).a(i2, 5), this.a, 0, this.d + i4 + 5);
    }

    public BitArray j(byte[] bArr) {
        LinkedList linkedList = new LinkedList();
        for (d dVarD = b(bArr.length).b; dVarD != null; dVarD = dVarD.d()) {
            linkedList.addFirst(dVarD);
        }
        BitArray bitArray = new BitArray();
        Iterator it2 = linkedList.iterator();
        while (it2.hasNext()) {
            ((d) it2.next()).c(bitArray, bArr);
        }
        return bitArray;
    }

    public String toString() {
        return String.format("%s bits=%d bytes=%d", HighLevelEncoder.b[this.a], Integer.valueOf(this.d), Integer.valueOf(this.c));
    }
}
