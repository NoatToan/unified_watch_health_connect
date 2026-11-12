package defpackage;

import com.google.zxing.FormatException;

/* JADX INFO: loaded from: classes5.dex */
public final class ep2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cp2 f16912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public bpq f16913b;
    public b1a c;
    public boolean d;

    public ep2(cp2 cp2Var) throws FormatException {
        int iH = cp2Var.h();
        if (iH < 21 || (iH & 3) != 1) {
            throw FormatException.getFormatInstance();
        }
        this.f16912a = cp2Var;
    }

    public final int a(int i, int i2, int i3) {
        return this.d ? this.f16912a.e(i2, i) : this.f16912a.e(i, i2) ? (i3 << 1) | 1 : i3 << 1;
    }

    public void b() {
        int i = 0;
        while (i < this.f16912a.k()) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < this.f16912a.h(); i3++) {
                if (this.f16912a.e(i, i3) != this.f16912a.e(i3, i)) {
                    this.f16912a.d(i3, i);
                    this.f16912a.d(i, i3);
                }
            }
            i = i2;
        }
    }

    public byte[] c() throws FormatException {
        b1a b1aVarD = d();
        bpq bpqVarE = e();
        gm5 gm5Var = gm5.values()[b1aVarD.c()];
        int iH = this.f16912a.h();
        gm5Var.b(this.f16912a, iH);
        cp2 cp2VarA = bpqVarE.a();
        byte[] bArr = new byte[bpqVarE.h()];
        int i = iH - 1;
        boolean z = true;
        int i2 = i;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i2 > 0) {
            if (i2 == 6) {
                i2--;
            }
            for (int i6 = 0; i6 < iH; i6++) {
                int i7 = z ? i - i6 : i6;
                for (int i8 = 0; i8 < 2; i8++) {
                    int i9 = i2 - i8;
                    if (!cp2VarA.e(i9, i7)) {
                        i4++;
                        i5 <<= 1;
                        if (this.f16912a.e(i9, i7)) {
                            i5 |= 1;
                        }
                        if (i4 == 8) {
                            bArr[i3] = (byte) i5;
                            i3++;
                            i4 = 0;
                            i5 = 0;
                        }
                    }
                }
            }
            z = !z;
            i2 -= 2;
        }
        if (i3 == bpqVarE.h()) {
            return bArr;
        }
        throw FormatException.getFormatInstance();
    }

    public b1a d() throws FormatException {
        b1a b1aVar = this.c;
        if (b1aVar != null) {
            return b1aVar;
        }
        int iA = 0;
        int iA2 = 0;
        for (int i = 0; i < 6; i++) {
            iA2 = a(i, 8, iA2);
        }
        int iA3 = a(8, 7, a(8, 8, a(7, 8, iA2)));
        for (int i2 = 5; i2 >= 0; i2--) {
            iA3 = a(8, i2, iA3);
        }
        int iH = this.f16912a.h();
        int i3 = iH - 7;
        for (int i4 = iH - 1; i4 >= i3; i4--) {
            iA = a(8, i4, iA);
        }
        for (int i5 = iH - 8; i5 < iH; i5++) {
            iA = a(i5, 8, iA);
        }
        b1a b1aVarA = b1a.a(iA3, iA);
        this.c = b1aVarA;
        if (b1aVarA != null) {
            return b1aVarA;
        }
        throw FormatException.getFormatInstance();
    }

    public bpq e() throws FormatException {
        bpq bpqVar = this.f16913b;
        if (bpqVar != null) {
            return bpqVar;
        }
        int iH = this.f16912a.h();
        int i = (iH - 17) / 4;
        if (i <= 6) {
            return bpq.i(i);
        }
        int i2 = iH - 11;
        int iA = 0;
        int iA2 = 0;
        for (int i3 = 5; i3 >= 0; i3--) {
            for (int i4 = iH - 9; i4 >= i2; i4--) {
                iA2 = a(i4, i3, iA2);
            }
        }
        bpq bpqVarC = bpq.c(iA2);
        if (bpqVarC != null && bpqVarC.e() == iH) {
            this.f16913b = bpqVarC;
            return bpqVarC;
        }
        for (int i5 = 5; i5 >= 0; i5--) {
            for (int i6 = iH - 9; i6 >= i2; i6--) {
                iA = a(i5, i6, iA);
            }
        }
        bpq bpqVarC2 = bpq.c(iA);
        if (bpqVarC2 == null || bpqVarC2.e() != iH) {
            throw FormatException.getFormatInstance();
        }
        this.f16913b = bpqVarC2;
        return bpqVarC2;
    }

    public void f() {
        if (this.c == null) {
            return;
        }
        gm5.values()[this.c.c()].b(this.f16912a, this.f16912a.h());
    }

    public void g(boolean z) {
        this.f16913b = null;
        this.c = null;
        this.d = z;
    }
}
