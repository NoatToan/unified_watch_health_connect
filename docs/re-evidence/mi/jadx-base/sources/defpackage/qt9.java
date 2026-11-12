package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class qt9 extends ak8<qt9> {
    public static volatile qt9[] g;
    public int c;
    public int d;
    public int e;
    public int f;

    public static final class a extends ak8<a> {
        public qt9[] c;

        public a() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            int iB = super.b();
            qt9[] qt9VarArr = this.c;
            if (qt9VarArr != null && qt9VarArr.length > 0) {
                int i = 0;
                while (true) {
                    qt9[] qt9VarArr2 = this.c;
                    if (i >= qt9VarArr2.length) {
                        break;
                    }
                    qt9 qt9Var = qt9VarArr2[i];
                    if (qt9Var != null) {
                        iB += CodedOutputByteBufferNano.n(1, qt9Var);
                    }
                    i++;
                }
            }
            return iB;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            qt9[] qt9VarArr = this.c;
            if (qt9VarArr != null && qt9VarArr.length > 0) {
                int i = 0;
                while (true) {
                    qt9[] qt9VarArr2 = this.c;
                    if (i >= qt9VarArr2.length) {
                        break;
                    }
                    qt9 qt9Var = qt9VarArr2[i];
                    if (qt9Var != null) {
                        codedOutputByteBufferNano.Y(1, qt9Var);
                    }
                    i++;
                }
            }
            super.j(codedOutputByteBufferNano);
        }

        public a m() {
            this.c = qt9.n();
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
                    qt9[] qt9VarArr = this.c;
                    int length = qt9VarArr == null ? 0 : qt9VarArr.length;
                    int i = iA2 + length;
                    qt9[] qt9VarArr2 = new qt9[i];
                    if (length != 0) {
                        System.arraycopy(qt9VarArr, 0, qt9VarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        qt9 qt9Var = new qt9();
                        qt9VarArr2[length] = qt9Var;
                        o34Var.q(qt9Var);
                        o34Var.A();
                        length++;
                    }
                    qt9 qt9Var2 = new qt9();
                    qt9VarArr2[length] = qt9Var2;
                    o34Var.q(qt9Var2);
                    this.c = qt9VarArr2;
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public qt9() {
        m();
    }

    public static qt9[] n() {
        if (g == null) {
            synchronized (afd.c) {
                try {
                    if (g == null) {
                        g = new qt9[0];
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
        return super.b() + CodedOutputByteBufferNano.y(1, this.c) + CodedOutputByteBufferNano.y(2, this.d) + CodedOutputByteBufferNano.y(3, this.e) + CodedOutputByteBufferNano.y(4, this.f);
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.p0(1, this.c);
        codedOutputByteBufferNano.p0(2, this.d);
        codedOutputByteBufferNano.p0(3, this.e);
        codedOutputByteBufferNano.p0(4, this.f);
        super.j(codedOutputByteBufferNano);
    }

    public qt9 m() {
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public qt9 e(o34 o34Var) throws IOException {
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
                this.e = o34Var.B();
            } else if (iA == 32) {
                this.f = o34Var.B();
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
