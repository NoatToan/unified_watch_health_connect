package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class w69 extends ak8<w69> {
    public static volatile w69[] g;
    public String c;
    public String d;
    public String e;
    public String f;

    public static final class a extends ak8<a> {
        public w69[] c;

        public a() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            int iB = super.b();
            w69[] w69VarArr = this.c;
            if (w69VarArr != null && w69VarArr.length > 0) {
                int i = 0;
                while (true) {
                    w69[] w69VarArr2 = this.c;
                    if (i >= w69VarArr2.length) {
                        break;
                    }
                    w69 w69Var = w69VarArr2[i];
                    if (w69Var != null) {
                        iB += CodedOutputByteBufferNano.n(1, w69Var);
                    }
                    i++;
                }
            }
            return iB;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            w69[] w69VarArr = this.c;
            if (w69VarArr != null && w69VarArr.length > 0) {
                int i = 0;
                while (true) {
                    w69[] w69VarArr2 = this.c;
                    if (i >= w69VarArr2.length) {
                        break;
                    }
                    w69 w69Var = w69VarArr2[i];
                    if (w69Var != null) {
                        codedOutputByteBufferNano.Y(1, w69Var);
                    }
                    i++;
                }
            }
            super.j(codedOutputByteBufferNano);
        }

        public a m() {
            this.c = w69.n();
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
                    w69[] w69VarArr = this.c;
                    int length = w69VarArr == null ? 0 : w69VarArr.length;
                    int i = iA2 + length;
                    w69[] w69VarArr2 = new w69[i];
                    if (length != 0) {
                        System.arraycopy(w69VarArr, 0, w69VarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        w69 w69Var = new w69();
                        w69VarArr2[length] = w69Var;
                        o34Var.q(w69Var);
                        o34Var.A();
                        length++;
                    }
                    w69 w69Var2 = new w69();
                    w69VarArr2[length] = w69Var2;
                    o34Var.q(w69Var2);
                    this.c = w69VarArr2;
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public w69() {
        m();
    }

    public static w69[] n() {
        if (g == null) {
            synchronized (afd.c) {
                try {
                    if (g == null) {
                        g = new w69[0];
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
        return super.b() + CodedOutputByteBufferNano.v(1, this.c) + CodedOutputByteBufferNano.v(2, this.d) + CodedOutputByteBufferNano.v(3, this.e) + CodedOutputByteBufferNano.v(4, this.f);
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.m0(1, this.c);
        codedOutputByteBufferNano.m0(2, this.d);
        codedOutputByteBufferNano.m0(3, this.e);
        codedOutputByteBufferNano.m0(4, this.f);
        super.j(codedOutputByteBufferNano);
    }

    public w69 m() {
        this.c = "";
        this.d = "";
        this.e = "";
        this.f = "";
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public w69 e(o34 o34Var) throws IOException {
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
            } else if (iA == 34) {
                this.f = o34Var.z();
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
