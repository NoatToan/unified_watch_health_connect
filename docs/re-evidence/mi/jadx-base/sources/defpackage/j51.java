package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class j51 extends ak8<j51> {
    public static volatile j51[] i;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public int h;

    public static final class a extends ak8<a> {
        public j51[] c;

        public a() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            int iB = super.b();
            j51[] j51VarArr = this.c;
            if (j51VarArr != null && j51VarArr.length > 0) {
                int i = 0;
                while (true) {
                    j51[] j51VarArr2 = this.c;
                    if (i >= j51VarArr2.length) {
                        break;
                    }
                    j51 j51Var = j51VarArr2[i];
                    if (j51Var != null) {
                        iB += CodedOutputByteBufferNano.n(1, j51Var);
                    }
                    i++;
                }
            }
            return iB;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            j51[] j51VarArr = this.c;
            if (j51VarArr != null && j51VarArr.length > 0) {
                int i = 0;
                while (true) {
                    j51[] j51VarArr2 = this.c;
                    if (i >= j51VarArr2.length) {
                        break;
                    }
                    j51 j51Var = j51VarArr2[i];
                    if (j51Var != null) {
                        codedOutputByteBufferNano.Y(1, j51Var);
                    }
                    i++;
                }
            }
            super.j(codedOutputByteBufferNano);
        }

        public a m() {
            this.c = j51.n();
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
                    j51[] j51VarArr = this.c;
                    int length = j51VarArr == null ? 0 : j51VarArr.length;
                    int i = iA2 + length;
                    j51[] j51VarArr2 = new j51[i];
                    if (length != 0) {
                        System.arraycopy(j51VarArr, 0, j51VarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        j51 j51Var = new j51();
                        j51VarArr2[length] = j51Var;
                        o34Var.q(j51Var);
                        o34Var.A();
                        length++;
                    }
                    j51 j51Var2 = new j51();
                    j51VarArr2[length] = j51Var2;
                    o34Var.q(j51Var2);
                    this.c = j51VarArr2;
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public j51() {
        m();
    }

    public static j51[] n() {
        if (i == null) {
            synchronized (afd.c) {
                try {
                    if (i == null) {
                        i = new j51[0];
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
        return super.b() + CodedOutputByteBufferNano.v(1, this.c) + CodedOutputByteBufferNano.v(2, this.d) + CodedOutputByteBufferNano.v(3, this.e) + CodedOutputByteBufferNano.v(4, this.f) + CodedOutputByteBufferNano.v(5, this.g) + CodedOutputByteBufferNano.l(6, this.h);
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.m0(1, this.c);
        codedOutputByteBufferNano.m0(2, this.d);
        codedOutputByteBufferNano.m0(3, this.e);
        codedOutputByteBufferNano.m0(4, this.f);
        codedOutputByteBufferNano.m0(5, this.g);
        codedOutputByteBufferNano.W(6, this.h);
        super.j(codedOutputByteBufferNano);
    }

    public j51 m() {
        this.c = "";
        this.d = "";
        this.e = "";
        this.f = "";
        this.g = "";
        this.h = 0;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public j51 e(o34 o34Var) throws IOException {
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
            } else if (iA == 42) {
                this.g = o34Var.z();
            } else if (iA == 48) {
                this.h = o34Var.p();
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
