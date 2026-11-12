package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class w5r extends ak8<w5r> {
    public String c;
    public int d;

    public static final class a extends ak8<a> {
        public static volatile a[] g;
        public String c;
        public int d;
        public w5r e;
        public w5r f;

        public a() {
            m();
        }

        public static a[] n() {
            if (g == null) {
                synchronized (afd.c) {
                    try {
                        if (g == null) {
                            g = new a[0];
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
            int iB = super.b() + CodedOutputByteBufferNano.v(1, this.c) + CodedOutputByteBufferNano.y(2, this.d);
            w5r w5rVar = this.e;
            if (w5rVar != null) {
                iB += CodedOutputByteBufferNano.n(3, w5rVar);
            }
            w5r w5rVar2 = this.f;
            return w5rVar2 != null ? iB + CodedOutputByteBufferNano.n(4, w5rVar2) : iB;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m0(1, this.c);
            codedOutputByteBufferNano.p0(2, this.d);
            w5r w5rVar = this.e;
            if (w5rVar != null) {
                codedOutputByteBufferNano.Y(3, w5rVar);
            }
            w5r w5rVar2 = this.f;
            if (w5rVar2 != null) {
                codedOutputByteBufferNano.Y(4, w5rVar2);
            }
            super.j(codedOutputByteBufferNano);
        }

        public a m() {
            this.c = "";
            this.d = 0;
            this.e = null;
            this.f = null;
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
                    this.c = o34Var.z();
                } else if (iA == 16) {
                    this.d = o34Var.B();
                } else if (iA == 26) {
                    if (this.e == null) {
                        this.e = new w5r();
                    }
                    o34Var.q(this.e);
                } else if (iA == 34) {
                    if (this.f == null) {
                        this.f = new w5r();
                    }
                    o34Var.q(this.f);
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public static final class b extends ak8<b> {
        public a[] c;
        public int d;

        public b() {
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
            int i2 = this.d;
            return i2 != 0 ? iB + CodedOutputByteBufferNano.y(2, i2) : iB;
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
            int i2 = this.d;
            if (i2 != 0) {
                codedOutputByteBufferNano.p0(2, i2);
            }
            super.j(codedOutputByteBufferNano);
        }

        public b m() {
            this.c = a.n();
            this.d = 0;
            this.f1122b = null;
            this.f15887a = -1;
            return this;
        }

        @Override // defpackage.dsf
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public b e(o34 o34Var) throws IOException {
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
                } else if (iA == 16) {
                    this.d = o34Var.B();
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public w5r() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b() + CodedOutputByteBufferNano.v(1, this.c);
        int i = this.d;
        return i != 0 ? iB + CodedOutputByteBufferNano.y(2, i) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.m0(1, this.c);
        int i = this.d;
        if (i != 0) {
            codedOutputByteBufferNano.p0(2, i);
        }
        super.j(codedOutputByteBufferNano);
    }

    public w5r m() {
        this.c = "";
        this.d = 0;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public w5r e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 10) {
                this.c = o34Var.z();
            } else if (iA == 16) {
                this.d = o34Var.B();
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
