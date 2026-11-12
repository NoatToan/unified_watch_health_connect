package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public final class wt9 extends ak8<wt9> {
    public a[] c;

    public static final class a extends ak8<a> {
        public static volatile a[] i;
        public w64 c;
        public int d;
        public int e;
        public int f;
        public int g;
        public int h;

        public a() {
            m();
        }

        public static a[] n() {
            if (i == null) {
                synchronized (afd.c) {
                    try {
                        if (i == null) {
                            i = new a[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return i;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            int iB = super.b();
            w64 w64Var = this.c;
            if (w64Var != null) {
                iB += CodedOutputByteBufferNano.n(1, w64Var);
            }
            return iB + CodedOutputByteBufferNano.y(2, this.d) + CodedOutputByteBufferNano.y(3, this.e) + CodedOutputByteBufferNano.y(4, this.f) + CodedOutputByteBufferNano.y(5, this.g) + CodedOutputByteBufferNano.y(6, this.h);
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            w64 w64Var = this.c;
            if (w64Var != null) {
                codedOutputByteBufferNano.Y(1, w64Var);
            }
            codedOutputByteBufferNano.p0(2, this.d);
            codedOutputByteBufferNano.p0(3, this.e);
            codedOutputByteBufferNano.p0(4, this.f);
            codedOutputByteBufferNano.p0(5, this.g);
            codedOutputByteBufferNano.p0(6, this.h);
            super.j(codedOutputByteBufferNano);
        }

        public a m() {
            this.c = null;
            this.d = 0;
            this.e = 0;
            this.f = 0;
            this.g = 0;
            this.h = 0;
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
                if (iA == 10) {
                    if (this.c == null) {
                        this.c = new w64();
                    }
                    o34Var.q(this.c);
                } else if (iA == 16) {
                    this.d = o34Var.B();
                } else if (iA == 24) {
                    this.e = o34Var.B();
                } else if (iA == 32) {
                    this.f = o34Var.B();
                } else if (iA == 40) {
                    this.g = o34Var.B();
                } else if (iA == 48) {
                    this.h = o34Var.B();
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public wt9() {
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
        return iB;
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
        super.j(codedOutputByteBufferNano);
    }

    public wt9 m() {
        this.c = a.n();
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public wt9 e(o34 o34Var) throws IOException {
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
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
