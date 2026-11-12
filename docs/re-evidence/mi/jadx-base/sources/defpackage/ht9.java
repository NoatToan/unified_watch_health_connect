package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class ht9 extends ak8<ht9> {
    public static volatile ht9[] g;
    public int c;
    public int d;
    public boolean e;
    public int f;

    public static final class a extends ak8<a> {
        public ht9[] c;

        public a() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            int iB = super.b();
            ht9[] ht9VarArr = this.c;
            if (ht9VarArr != null && ht9VarArr.length > 0) {
                int i = 0;
                while (true) {
                    ht9[] ht9VarArr2 = this.c;
                    if (i >= ht9VarArr2.length) {
                        break;
                    }
                    ht9 ht9Var = ht9VarArr2[i];
                    if (ht9Var != null) {
                        iB += CodedOutputByteBufferNano.n(1, ht9Var);
                    }
                    i++;
                }
            }
            return iB;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            ht9[] ht9VarArr = this.c;
            if (ht9VarArr != null && ht9VarArr.length > 0) {
                int i = 0;
                while (true) {
                    ht9[] ht9VarArr2 = this.c;
                    if (i >= ht9VarArr2.length) {
                        break;
                    }
                    ht9 ht9Var = ht9VarArr2[i];
                    if (ht9Var != null) {
                        codedOutputByteBufferNano.Y(1, ht9Var);
                    }
                    i++;
                }
            }
            super.j(codedOutputByteBufferNano);
        }

        public a m() {
            this.c = ht9.n();
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
                    ht9[] ht9VarArr = this.c;
                    int length = ht9VarArr == null ? 0 : ht9VarArr.length;
                    int i = iA2 + length;
                    ht9[] ht9VarArr2 = new ht9[i];
                    if (length != 0) {
                        System.arraycopy(ht9VarArr, 0, ht9VarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        ht9 ht9Var = new ht9();
                        ht9VarArr2[length] = ht9Var;
                        o34Var.q(ht9Var);
                        o34Var.A();
                        length++;
                    }
                    ht9 ht9Var2 = new ht9();
                    ht9VarArr2[length] = ht9Var2;
                    o34Var.q(ht9Var2);
                    this.c = ht9VarArr2;
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public ht9() {
        m();
    }

    public static ht9[] n() {
        if (g == null) {
            synchronized (afd.c) {
                try {
                    if (g == null) {
                        g = new ht9[0];
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
        return super.b() + CodedOutputByteBufferNano.y(1, this.c) + CodedOutputByteBufferNano.y(2, this.d) + CodedOutputByteBufferNano.b(3, this.e) + CodedOutputByteBufferNano.y(4, this.f);
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.p0(1, this.c);
        codedOutputByteBufferNano.p0(2, this.d);
        codedOutputByteBufferNano.M(3, this.e);
        codedOutputByteBufferNano.p0(4, this.f);
        super.j(codedOutputByteBufferNano);
    }

    public ht9 m() {
        this.c = 0;
        this.d = 0;
        this.e = false;
        this.f = 0;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public ht9 e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 8) {
                this.c = o34Var.B();
            } else if (iA == 16) {
                this.d = o34Var.B();
            } else if (iA == 24) {
                this.e = o34Var.k();
            } else if (iA == 32) {
                this.f = o34Var.B();
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
