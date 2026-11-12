package defpackage;

import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes5.dex */
public final class dco {
    public static final dco e = new dco(aip.f1071b, 0, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aip f15376b;
    public final int c;
    public final int d;

    public dco(aip aipVar, int i, int i2, int i3) {
        this.f15376b = aipVar;
        this.f15375a = i;
        this.c = i2;
        this.d = i3;
    }

    public dco a(int i) {
        int i2;
        aip aipVarA = this.f15376b;
        int i3 = this.f15375a;
        int i4 = this.d;
        if (i3 == 4 || i3 == 2) {
            int i5 = o7c.c[i3][0];
            int i6 = 65535 & i5;
            int i7 = i5 >> 16;
            aipVarA = aipVarA.a(i6, i7);
            i4 += i7;
            i3 = 0;
        }
        int i8 = this.c;
        if (i8 == 0 || i8 == 31) {
            i2 = 18;
        } else {
            i2 = i8 == 62 ? 9 : 8;
        }
        dco dcoVar = new dco(aipVarA, i3, i8 + 1, i4 + i2);
        return dcoVar.c == 2078 ? dcoVar.b(i + 1) : dcoVar;
    }

    public dco b(int i) {
        int i2 = this.c;
        return i2 == 0 ? this : new dco(this.f15376b.b(i - i2, i2), this.f15375a, 0, this.d);
    }

    public int c() {
        return this.c;
    }

    public int d() {
        return this.d;
    }

    public int e() {
        return this.f15375a;
    }

    public boolean f(dco dcoVar) {
        int i;
        int i2 = this.d + (o7c.c[this.f15375a][dcoVar.f15375a] >> 16);
        int i3 = dcoVar.c;
        if (i3 > 0 && ((i = this.c) == 0 || i > i3)) {
            i2 += 10;
        }
        return i2 <= dcoVar.d;
    }

    public dco g(int i, int i2) {
        int i3 = this.d;
        aip aipVarA = this.f15376b;
        int i4 = this.f15375a;
        if (i != i4) {
            int i5 = o7c.c[i4][i];
            int i6 = 65535 & i5;
            int i7 = i5 >> 16;
            aipVarA = aipVarA.a(i6, i7);
            i3 += i7;
        }
        int i8 = i == 2 ? 4 : 5;
        return new dco(aipVarA.a(i2, i8), i, 0, i3 + i8);
    }

    public dco h(int i, int i2) {
        aip aipVar = this.f15376b;
        int i3 = this.f15375a;
        int i4 = i3 == 2 ? 4 : 5;
        return new dco(aipVar.a(o7c.e[i3][i], i4).a(i2, 5), this.f15375a, 0, this.d + i4 + 5);
    }

    public zo2 i(byte[] bArr) {
        LinkedList linkedList = new LinkedList();
        for (aip aipVarD = b(bArr.length).f15376b; aipVarD != null; aipVarD = aipVarD.d()) {
            linkedList.addFirst(aipVarD);
        }
        zo2 zo2Var = new zo2();
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            ((aip) it.next()).c(zo2Var, bArr);
        }
        return zo2Var;
    }

    public String toString() {
        return String.format("%s bits=%d bytes=%d", o7c.f28815b[this.f15375a], Integer.valueOf(this.d), Integer.valueOf(this.c));
    }
}
