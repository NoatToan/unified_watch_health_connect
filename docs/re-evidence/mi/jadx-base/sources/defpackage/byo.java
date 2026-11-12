package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class byo extends ak8<byo> {
    public a[] c;
    public dyo d;

    public static final class a extends ak8<a> {
        public static volatile a[] f;
        public boolean c;
        public int d;
        public int e;

        public a() {
            m();
        }

        public static a[] n() {
            if (f == null) {
                synchronized (afd.c) {
                    try {
                        if (f == null) {
                            f = new a[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return f;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            int iB = super.b() + CodedOutputByteBufferNano.b(1, this.c) + CodedOutputByteBufferNano.y(2, this.d);
            int i = this.e;
            return i != 0 ? iB + CodedOutputByteBufferNano.y(3, i) : iB;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.M(1, this.c);
            codedOutputByteBufferNano.p0(2, this.d);
            int i = this.e;
            if (i != 0) {
                codedOutputByteBufferNano.p0(3, i);
            }
            super.j(codedOutputByteBufferNano);
        }

        public a m() {
            this.c = false;
            this.d = 0;
            this.e = 0;
            this.f1122b = null;
            this.f15887a = -1;
            return this;
        }

        @Override // defpackage.dsf
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public a e(o34 o34Var) throws IOException {
            while (true) {
                int iA = o34Var.A();
                if (iA == 0) {
                    return this;
                }
                if (iA == 8) {
                    this.c = o34Var.k();
                } else if (iA == 16) {
                    this.d = o34Var.B();
                } else if (iA == 24) {
                    this.e = o34Var.B();
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public byo() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b();
        a[] aVarArr = this.c;
        if (aVarArr != null && aVarArr.length > 0) {
            int i = 0;
            while (true) {
                a[] aVarArr2 = this.c;
                if (i >= aVarArr2.length) {
                    break;
                }
                a aVar = aVarArr2[i];
                if (aVar != null) {
                    iB += CodedOutputByteBufferNano.n(1, aVar);
                }
                i++;
            }
        }
        dyo dyoVar = this.d;
        return dyoVar != null ? iB + CodedOutputByteBufferNano.n(2, dyoVar) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        a[] aVarArr = this.c;
        if (aVarArr != null && aVarArr.length > 0) {
            int i = 0;
            while (true) {
                a[] aVarArr2 = this.c;
                if (i >= aVarArr2.length) {
                    break;
                }
                a aVar = aVarArr2[i];
                if (aVar != null) {
                    codedOutputByteBufferNano.Y(1, aVar);
                }
                i++;
            }
        }
        dyo dyoVar = this.d;
        if (dyoVar != null) {
            codedOutputByteBufferNano.Y(2, dyoVar);
        }
        super.j(codedOutputByteBufferNano);
    }

    public byo m() {
        this.c = a.n();
        this.d = null;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public byo e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 10) {
                int iA2 = bmr.a(o34Var, 10);
                a[] aVarArr = this.c;
                int length = aVarArr == null ? 0 : aVarArr.length;
                int i = iA2 + length;
                a[] aVarArr2 = new a[i];
                if (length != 0) {
                    System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                }
                while (length < i - 1) {
                    a aVar = new a();
                    aVarArr2[length] = aVar;
                    o34Var.q(aVar);
                    o34Var.A();
                    length++;
                }
                a aVar2 = new a();
                aVarArr2[length] = aVar2;
                o34Var.q(aVar2);
                this.c = aVarArr2;
            } else if (iA == 18) {
                if (this.d == null) {
                    this.d = new dyo();
                }
                o34Var.q(this.d);
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
