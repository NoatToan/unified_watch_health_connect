package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class gs9 extends ak8<gs9> {
    public static volatile gs9[] e;
    public int c;
    public int d;

    public static final class a extends ak8<a> {
        public gs9[] c;

        public a() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            int iB = super.b();
            gs9[] gs9VarArr = this.c;
            if (gs9VarArr != null && gs9VarArr.length > 0) {
                int i = 0;
                while (true) {
                    gs9[] gs9VarArr2 = this.c;
                    if (i >= gs9VarArr2.length) {
                        break;
                    }
                    gs9 gs9Var = gs9VarArr2[i];
                    if (gs9Var != null) {
                        iB += CodedOutputByteBufferNano.n(1, gs9Var);
                    }
                    i++;
                }
            }
            return iB;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            gs9[] gs9VarArr = this.c;
            if (gs9VarArr != null && gs9VarArr.length > 0) {
                int i = 0;
                while (true) {
                    gs9[] gs9VarArr2 = this.c;
                    if (i >= gs9VarArr2.length) {
                        break;
                    }
                    gs9 gs9Var = gs9VarArr2[i];
                    if (gs9Var != null) {
                        codedOutputByteBufferNano.Y(1, gs9Var);
                    }
                    i++;
                }
            }
            super.j(codedOutputByteBufferNano);
        }

        public a m() {
            this.c = gs9.n();
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
                    gs9[] gs9VarArr = this.c;
                    int length = gs9VarArr == null ? 0 : gs9VarArr.length;
                    int i = iA2 + length;
                    gs9[] gs9VarArr2 = new gs9[i];
                    if (length != 0) {
                        System.arraycopy(gs9VarArr, 0, gs9VarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        gs9 gs9Var = new gs9();
                        gs9VarArr2[length] = gs9Var;
                        o34Var.q(gs9Var);
                        o34Var.A();
                        length++;
                    }
                    gs9 gs9Var2 = new gs9();
                    gs9VarArr2[length] = gs9Var2;
                    o34Var.q(gs9Var2);
                    this.c = gs9VarArr2;
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public gs9() {
        m();
    }

    public static gs9[] n() {
        if (e == null) {
            synchronized (afd.c) {
                try {
                    if (e == null) {
                        e = new gs9[0];
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return e;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        return super.b() + CodedOutputByteBufferNano.l(1, this.c) + CodedOutputByteBufferNano.r(2, this.d);
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.W(1, this.c);
        codedOutputByteBufferNano.i0(2, this.d);
        super.j(codedOutputByteBufferNano);
    }

    public gs9 m() {
        this.c = 0;
        this.d = 0;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public gs9 e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 8) {
                int iP = o34Var.p();
                if (iP == 0 || iP == 1 || iP == 2 || iP == 3 || iP == 4) {
                    this.c = iP;
                }
            } else if (iA == 16) {
                this.d = o34Var.x();
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
