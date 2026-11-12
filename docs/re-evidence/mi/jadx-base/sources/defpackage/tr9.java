package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public final class tr9 extends ak8<tr9> {
    public static volatile tr9[] h;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;

    public static final class a extends ak8<a> {
        public tr9[] c;

        public a() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            int iB = super.b();
            tr9[] tr9VarArr = this.c;
            if (tr9VarArr != null && tr9VarArr.length > 0) {
                int i = 0;
                while (true) {
                    tr9[] tr9VarArr2 = this.c;
                    if (i >= tr9VarArr2.length) {
                        break;
                    }
                    tr9 tr9Var = tr9VarArr2[i];
                    if (tr9Var != null) {
                        iB += CodedOutputByteBufferNano.n(1, tr9Var);
                    }
                    i++;
                }
            }
            return iB;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            tr9[] tr9VarArr = this.c;
            if (tr9VarArr != null && tr9VarArr.length > 0) {
                int i = 0;
                while (true) {
                    tr9[] tr9VarArr2 = this.c;
                    if (i >= tr9VarArr2.length) {
                        break;
                    }
                    tr9 tr9Var = tr9VarArr2[i];
                    if (tr9Var != null) {
                        codedOutputByteBufferNano.Y(1, tr9Var);
                    }
                    i++;
                }
            }
            super.j(codedOutputByteBufferNano);
        }

        public a m() {
            this.c = tr9.n();
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
                    tr9[] tr9VarArr = this.c;
                    int length = tr9VarArr == null ? 0 : tr9VarArr.length;
                    int i = iA2 + length;
                    tr9[] tr9VarArr2 = new tr9[i];
                    if (length != 0) {
                        System.arraycopy(tr9VarArr, 0, tr9VarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        tr9 tr9Var = new tr9();
                        tr9VarArr2[length] = tr9Var;
                        o34Var.q(tr9Var);
                        o34Var.A();
                        length++;
                    }
                    tr9 tr9Var2 = new tr9();
                    tr9VarArr2[length] = tr9Var2;
                    o34Var.q(tr9Var2);
                    this.c = tr9VarArr2;
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public tr9() {
        m();
    }

    public static tr9[] n() {
        if (h == null) {
            synchronized (afd.c) {
                try {
                    if (h == null) {
                        h = new tr9[0];
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return h;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        return super.b() + CodedOutputByteBufferNano.l(1, this.c) + CodedOutputByteBufferNano.y(2, this.d) + CodedOutputByteBufferNano.y(3, this.e) + CodedOutputByteBufferNano.y(4, this.f) + CodedOutputByteBufferNano.y(5, this.g);
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.W(1, this.c);
        codedOutputByteBufferNano.p0(2, this.d);
        codedOutputByteBufferNano.p0(3, this.e);
        codedOutputByteBufferNano.p0(4, this.f);
        codedOutputByteBufferNano.p0(5, this.g);
        super.j(codedOutputByteBufferNano);
    }

    public tr9 m() {
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public tr9 e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 8) {
                int iP = o34Var.p();
                if (iP == 0 || iP == 1) {
                    this.c = iP;
                }
            } else if (iA == 16) {
                this.d = o34Var.B();
            } else if (iA == 24) {
                this.e = o34Var.B();
            } else if (iA == 32) {
                this.f = o34Var.B();
            } else if (iA == 40) {
                this.g = o34Var.B();
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
