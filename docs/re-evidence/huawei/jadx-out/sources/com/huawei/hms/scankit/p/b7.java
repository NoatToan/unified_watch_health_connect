package com.huawei.hms.scankit.p;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;

/* JADX INFO: loaded from: classes10.dex */
final class b7 {
    static final b7 e = new b7(i7.f16140b, 0, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f16002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i7 f16003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f16004c;
    private final int d;

    public String toString() {
        String[] strArr = c4.f16023b;
        if (!w7.a(strArr, this.f16002a)) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return String.format(Locale.ENGLISH, "%s bits=%d bytes=%d", strArr[this.f16002a], Integer.valueOf(this.d), Integer.valueOf(this.f16004c));
    }

    private b7(i7 i7Var, int i, int i2, int i3) {
        this.f16003b = i7Var;
        this.f16002a = i;
        this.f16004c = i2;
        this.d = i3;
    }

    int c() {
        return this.f16002a;
    }

    b7 a(int i) {
        int i2;
        i7 i7VarA = this.f16003b;
        int i3 = this.f16002a;
        int i4 = this.d;
        if (i3 == 4 || i3 == 2) {
            int i5 = c4.f16024c[i3][0];
            int i6 = i5 >> 16;
            i7VarA = i7VarA.a(i5 & 65535, i6);
            i4 += i6;
            i3 = 0;
        }
        int i7 = this.f16004c;
        if (i7 == 0 || i7 == 31) {
            i2 = 18;
        } else {
            i2 = i7 == 62 ? 9 : 8;
        }
        b7 b7Var = new b7(i7VarA, i3, i7 + 1, i4 + i2);
        return b7Var.f16004c == 2078 ? b7Var.b(i + 1) : b7Var;
    }

    b7 b(int i) {
        int i2 = this.f16004c;
        return i2 == 0 ? this : new b7(this.f16003b.b(i - i2, i2), this.f16002a, 0, this.d);
    }

    int a() {
        return this.f16004c;
    }

    int b() {
        return this.d;
    }

    b7 b(int i, int i2) {
        i7 i7VarA = this.f16003b;
        int i3 = this.f16002a;
        int i4 = i3 == 2 ? 4 : 5;
        if (i3 >= 0) {
            int[][] iArr = c4.e;
            if (i3 < iArr.length && i > 0) {
                int[] iArr2 = iArr[i3];
                if (i < iArr2.length) {
                    i7VarA = i7VarA.a(iArr2[i], i4);
                }
            }
        }
        return new b7(i7VarA.a(i2, 5), this.f16002a, 0, this.d + i4 + 5);
    }

    boolean a(b7 b7Var) {
        int i;
        int i2 = this.d + (c4.f16024c[this.f16002a][b7Var.f16002a] >> 16);
        int i3 = b7Var.f16004c;
        if (i3 > 0 && ((i = this.f16004c) == 0 || i > i3)) {
            i2 += 10;
        }
        return i2 <= b7Var.d;
    }

    b7 a(int i, int i2) {
        int i3 = this.d;
        i7 i7VarA = this.f16003b;
        int i4 = this.f16002a;
        if (i != i4) {
            int i5 = c4.f16024c[i4][i];
            int i6 = i5 >> 16;
            i7VarA = i7VarA.a(i5 & 65535, i6);
            i3 += i6;
        }
        int i7 = i == 2 ? 4 : 5;
        return new b7(i7VarA.a(i2, i7), i, 0, i3 + i7);
    }

    r a(byte[] bArr) {
        LinkedList linkedList = new LinkedList();
        for (i7 i7VarA = b(bArr.length).f16003b; i7VarA != null; i7VarA = i7VarA.a()) {
            linkedList.addFirst(i7VarA);
        }
        r rVar = new r();
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            ((i7) it.next()).a(rVar, bArr);
        }
        return rVar;
    }
}
