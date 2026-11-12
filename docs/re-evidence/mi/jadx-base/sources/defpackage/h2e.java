package defpackage;

import kotlin.UShort;

/* JADX INFO: loaded from: classes6.dex */
public class h2e {
    public static final h2e n = new h2e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public short f19609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public short f19610b;
    public int[] c;
    public int d;
    public int[] e;
    public short f;
    public short g;
    public short h;
    public short i;
    public eoa j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public h2e f19611k;
    public vz7 l;
    public h2e m;

    public final void a(cuf cufVar, boolean z) {
        short s;
        cufVar.o(this);
        if (!z || (s = this.f19610b) == 0) {
            return;
        }
        cufVar.q(s & UShort.MAX_VALUE, this);
        if (this.c == null) {
            return;
        }
        int i = 1;
        while (true) {
            int[] iArr = this.c;
            if (i > iArr[0]) {
                return;
            }
            cufVar.q(iArr[i], this);
            i++;
        }
    }

    public final void b(int i, int i2, int i3) {
        if (this.e == null) {
            this.e = new int[6];
        }
        int[] iArr = this.e;
        int i4 = iArr[0];
        if (i4 + 2 >= iArr.length) {
            int[] iArr2 = new int[iArr.length + 6];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.e = iArr2;
        }
        int[] iArr3 = this.e;
        iArr3[i4 + 1] = i;
        int i5 = i4 + 2;
        iArr3[i5] = i2 | i3;
        iArr3[0] = i5;
    }

    public final void c(int i) {
        if (this.f19610b == 0) {
            this.f19610b = (short) i;
            return;
        }
        if (this.c == null) {
            this.c = new int[4];
        }
        int[] iArr = this.c;
        int i2 = iArr[0] + 1;
        iArr[0] = i2;
        if (i2 >= iArr.length) {
            int[] iArr2 = new int[iArr.length + 4];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.c = iArr2;
        }
        this.c[i2] = i;
    }

    public final void d(h2e h2eVar) {
        h2e h2eVar2 = n;
        this.m = h2eVar2;
        h2e h2eVar3 = h2eVar2;
        h2e h2eVarG = this;
        while (h2eVarG != n) {
            h2e h2eVar4 = h2eVarG.m;
            h2eVarG.m = h2eVar3;
            if ((h2eVarG.f19609a & 64) != 0 && h2eVarG.i != h2eVar.i) {
                h2eVarG.l = new vz7(h2eVarG.g, h2eVar.l.f37387b, h2eVarG.l);
            }
            h2eVar3 = h2eVarG;
            h2eVarG = h2eVarG.g(h2eVar4);
        }
        while (h2eVar3 != n) {
            h2e h2eVar5 = h2eVar3.m;
            h2eVar3.m = null;
            h2eVar3 = h2eVar5;
        }
    }

    public final h2e e() {
        eoa eoaVar = this.j;
        return eoaVar == null ? this : eoaVar.f16872a;
    }

    public final void f(short s) {
        this.m = n;
        h2e h2eVarG = this;
        while (h2eVarG != n) {
            h2e h2eVar = h2eVarG.m;
            h2eVarG.m = null;
            if (h2eVarG.i == 0) {
                h2eVarG.i = s;
                h2eVarG = h2eVarG.g(h2eVar);
            } else {
                h2eVarG = h2eVar;
            }
        }
    }

    public final h2e g(h2e h2eVar) {
        for (vz7 vz7Var = this.l; vz7Var != null; vz7Var = vz7Var.c) {
            if ((this.f19609a & 16) == 0 || vz7Var != this.l.c) {
                h2e h2eVar2 = vz7Var.f37387b;
                if (h2eVar2.m == null) {
                    h2eVar2.m = h2eVar;
                    h2eVar = h2eVar2;
                }
            }
        }
        return h2eVar;
    }

    public final void h(z73 z73Var, int i, boolean z) {
        if ((this.f19609a & 4) != 0) {
            if (z) {
                z73Var.i(this.d - i);
                return;
            } else {
                z73Var.k(this.d - i);
                return;
            }
        }
        if (z) {
            b(i, 536870912, z73Var.f40971b);
            z73Var.i(-1);
        } else {
            b(i, 268435456, z73Var.f40971b);
            z73Var.k(-1);
        }
    }

    public final boolean i(byte[] bArr, int i) {
        this.f19609a = (short) (this.f19609a | 4);
        this.d = i;
        int[] iArr = this.e;
        boolean z = false;
        if (iArr == null) {
            return false;
        }
        for (int i2 = iArr[0]; i2 > 0; i2 -= 2) {
            int[] iArr2 = this.e;
            int i3 = iArr2[i2 - 1];
            int i4 = iArr2[i2];
            int i5 = i - i3;
            int i6 = 268435455 & i4;
            if ((i4 & (-268435456)) == 268435456) {
                if (i5 < -32768 || i5 > 32767) {
                    int i7 = bArr[i3] & 255;
                    if (i7 < 198) {
                        bArr[i3] = (byte) (i7 + 49);
                    } else {
                        bArr[i3] = (byte) (i7 + 20);
                    }
                    z = true;
                }
                bArr[i6] = (byte) (i5 >>> 8);
                bArr[i6 + 1] = (byte) i5;
            } else {
                bArr[i6] = (byte) (i5 >>> 24);
                bArr[i6 + 1] = (byte) (i5 >>> 16);
                bArr[i6 + 2] = (byte) (i5 >>> 8);
                bArr[i6 + 3] = (byte) i5;
            }
        }
        return z;
    }

    public String toString() {
        return "L" + System.identityHashCode(this);
    }
}
