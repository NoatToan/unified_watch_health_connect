package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class ayo extends ak8<ayo> {
    public static volatile ayo[] g;
    public int c;
    public String d;
    public byo.a[] e;
    public int f;

    public static final class a extends ak8<a> {
        public int[] c;

        public a() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            int iB = super.b();
            int[] iArr = this.c;
            if (iArr == null || iArr.length <= 0) {
                return iB;
            }
            int i = 0;
            int iZ = 0;
            while (true) {
                int[] iArr2 = this.c;
                if (i >= iArr2.length) {
                    return iB + iZ + iArr2.length;
                }
                iZ += CodedOutputByteBufferNano.z(iArr2[i]);
                i++;
            }
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            int[] iArr = this.c;
            if (iArr != null && iArr.length > 0) {
                int i = 0;
                while (true) {
                    int[] iArr2 = this.c;
                    if (i >= iArr2.length) {
                        break;
                    }
                    codedOutputByteBufferNano.p0(1, iArr2[i]);
                    i++;
                }
            }
            super.j(codedOutputByteBufferNano);
        }

        public a m() {
            this.c = bmr.f4377a;
            this.f1122b = null;
            this.f15887a = -1;
            return this;
        }

        @Override // defpackage.dsf
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public a e(o34 o34Var) throws IOException {
            while (true) {
                int iA = o34Var.A();
                if (iA == 0) {
                    return this;
                }
                if (iA == 8) {
                    int iA2 = bmr.a(o34Var, 8);
                    int[] iArr = this.c;
                    int length = iArr == null ? 0 : iArr.length;
                    int i = iA2 + length;
                    int[] iArr2 = new int[i];
                    if (length != 0) {
                        System.arraycopy(iArr, 0, iArr2, 0, length);
                    }
                    while (length < i - 1) {
                        iArr2[length] = o34Var.B();
                        o34Var.A();
                        length++;
                    }
                    iArr2[length] = o34Var.B();
                    this.c = iArr2;
                } else if (iA == 10) {
                    int iJ = o34Var.j(o34Var.v());
                    int iF = o34Var.f();
                    int i2 = 0;
                    while (o34Var.d() > 0) {
                        o34Var.B();
                        i2++;
                    }
                    o34Var.E(iF);
                    int[] iArr3 = this.c;
                    int length2 = iArr3 == null ? 0 : iArr3.length;
                    int i3 = i2 + length2;
                    int[] iArr4 = new int[i3];
                    if (length2 != 0) {
                        System.arraycopy(iArr3, 0, iArr4, 0, length2);
                    }
                    while (length2 < i3) {
                        iArr4[length2] = o34Var.B();
                        length2++;
                    }
                    this.c = iArr4;
                    o34Var.i(iJ);
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public ayo() {
        m();
    }

    public static ayo[] n() {
        if (g == null) {
            synchronized (afd.c) {
                try {
                    if (g == null) {
                        g = new ayo[0];
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return g;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b() + CodedOutputByteBufferNano.y(1, this.c) + CodedOutputByteBufferNano.v(2, this.d);
        byo.a[] aVarArr = this.e;
        if (aVarArr != null && aVarArr.length > 0) {
            int i = 0;
            while (true) {
                byo.a[] aVarArr2 = this.e;
                if (i >= aVarArr2.length) {
                    break;
                }
                byo.a aVar = aVarArr2[i];
                if (aVar != null) {
                    iB += CodedOutputByteBufferNano.n(3, aVar);
                }
                i++;
            }
        }
        int i2 = this.f;
        return i2 != 0 ? iB + CodedOutputByteBufferNano.l(4, i2) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.p0(1, this.c);
        codedOutputByteBufferNano.m0(2, this.d);
        byo.a[] aVarArr = this.e;
        if (aVarArr != null && aVarArr.length > 0) {
            int i = 0;
            while (true) {
                byo.a[] aVarArr2 = this.e;
                if (i >= aVarArr2.length) {
                    break;
                }
                byo.a aVar = aVarArr2[i];
                if (aVar != null) {
                    codedOutputByteBufferNano.Y(3, aVar);
                }
                i++;
            }
        }
        int i2 = this.f;
        if (i2 != 0) {
            codedOutputByteBufferNano.W(4, i2);
        }
        super.j(codedOutputByteBufferNano);
    }

    public ayo m() {
        this.c = 0;
        this.d = "";
        this.e = byo.a.n();
        this.f = 0;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public ayo e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 8) {
                this.c = o34Var.B();
            } else if (iA == 18) {
                this.d = o34Var.z();
            } else if (iA == 26) {
                int iA2 = bmr.a(o34Var, 26);
                byo.a[] aVarArr = this.e;
                int length = aVarArr == null ? 0 : aVarArr.length;
                int i = iA2 + length;
                byo.a[] aVarArr2 = new byo.a[i];
                if (length != 0) {
                    System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                }
                while (length < i - 1) {
                    byo.a aVar = new byo.a();
                    aVarArr2[length] = aVar;
                    o34Var.q(aVar);
                    o34Var.A();
                    length++;
                }
                byo.a aVar2 = new byo.a();
                aVarArr2[length] = aVar2;
                o34Var.q(aVar2);
                this.e = aVarArr2;
            } else if (iA == 32) {
                int iP = o34Var.p();
                switch (iP) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        this.f = iP;
                        break;
                }
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
