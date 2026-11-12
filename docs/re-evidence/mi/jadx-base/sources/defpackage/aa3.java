package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class aa3 extends ak8<aa3> {
    public static volatile aa3[] j;
    public String c;
    public String d;
    public String e;
    public int f;
    public int g;
    public boolean h;
    public int i;

    public static final class a extends ak8<a> {
        public aa3[] c;
        public boolean d;

        public a() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            int iB = super.b();
            aa3[] aa3VarArr = this.c;
            if (aa3VarArr != null && aa3VarArr.length > 0) {
                int i = 0;
                while (true) {
                    aa3[] aa3VarArr2 = this.c;
                    if (i >= aa3VarArr2.length) {
                        break;
                    }
                    aa3 aa3Var = aa3VarArr2[i];
                    if (aa3Var != null) {
                        iB += CodedOutputByteBufferNano.n(1, aa3Var);
                    }
                    i++;
                }
            }
            boolean z = this.d;
            return z ? iB + CodedOutputByteBufferNano.b(2, z) : iB;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            aa3[] aa3VarArr = this.c;
            if (aa3VarArr != null && aa3VarArr.length > 0) {
                int i = 0;
                while (true) {
                    aa3[] aa3VarArr2 = this.c;
                    if (i >= aa3VarArr2.length) {
                        break;
                    }
                    aa3 aa3Var = aa3VarArr2[i];
                    if (aa3Var != null) {
                        codedOutputByteBufferNano.Y(1, aa3Var);
                    }
                    i++;
                }
            }
            boolean z = this.d;
            if (z) {
                codedOutputByteBufferNano.M(2, z);
            }
            super.j(codedOutputByteBufferNano);
        }

        public a m() {
            this.c = aa3.n();
            this.d = false;
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
                if (iA == 10) {
                    int iA2 = bmr.a(o34Var, 10);
                    aa3[] aa3VarArr = this.c;
                    int length = aa3VarArr == null ? 0 : aa3VarArr.length;
                    int i = iA2 + length;
                    aa3[] aa3VarArr2 = new aa3[i];
                    if (length != 0) {
                        System.arraycopy(aa3VarArr, 0, aa3VarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        aa3 aa3Var = new aa3();
                        aa3VarArr2[length] = aa3Var;
                        o34Var.q(aa3Var);
                        o34Var.A();
                        length++;
                    }
                    aa3 aa3Var2 = new aa3();
                    aa3VarArr2[length] = aa3Var2;
                    o34Var.q(aa3Var2);
                    this.c = aa3VarArr2;
                } else if (iA == 16) {
                    this.d = o34Var.k();
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public aa3() {
        m();
    }

    public static aa3[] n() {
        if (j == null) {
            synchronized (afd.c) {
                try {
                    if (j == null) {
                        j = new aa3[0];
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return j;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        return super.b() + CodedOutputByteBufferNano.v(1, this.c) + CodedOutputByteBufferNano.v(2, this.d) + CodedOutputByteBufferNano.v(3, this.e) + CodedOutputByteBufferNano.y(4, this.f) + CodedOutputByteBufferNano.y(5, this.g) + CodedOutputByteBufferNano.b(6, this.h) + CodedOutputByteBufferNano.l(7, this.i);
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.m0(1, this.c);
        codedOutputByteBufferNano.m0(2, this.d);
        codedOutputByteBufferNano.m0(3, this.e);
        codedOutputByteBufferNano.p0(4, this.f);
        codedOutputByteBufferNano.p0(5, this.g);
        codedOutputByteBufferNano.M(6, this.h);
        codedOutputByteBufferNano.W(7, this.i);
        super.j(codedOutputByteBufferNano);
    }

    public aa3 m() {
        this.c = "";
        this.d = "";
        this.e = "";
        this.f = 0;
        this.g = 0;
        this.h = false;
        this.i = 0;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public aa3 e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 10) {
                this.c = o34Var.z();
            } else if (iA == 18) {
                this.d = o34Var.z();
            } else if (iA == 26) {
                this.e = o34Var.z();
            } else if (iA == 32) {
                this.f = o34Var.B();
            } else if (iA == 40) {
                this.g = o34Var.B();
            } else if (iA == 48) {
                this.h = o34Var.k();
            } else if (iA == 56) {
                this.i = o34Var.p();
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
