package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class ot9 extends ak8<ot9> {
    public static volatile ot9[] e;
    public int c;
    public boolean d;

    public static final class a extends ak8<a> {
        public ot9[] c;

        public a() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            int iB = super.b();
            ot9[] ot9VarArr = this.c;
            if (ot9VarArr != null && ot9VarArr.length > 0) {
                int i = 0;
                while (true) {
                    ot9[] ot9VarArr2 = this.c;
                    if (i >= ot9VarArr2.length) {
                        break;
                    }
                    ot9 ot9Var = ot9VarArr2[i];
                    if (ot9Var != null) {
                        iB += CodedOutputByteBufferNano.n(1, ot9Var);
                    }
                    i++;
                }
            }
            return iB;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            ot9[] ot9VarArr = this.c;
            if (ot9VarArr != null && ot9VarArr.length > 0) {
                int i = 0;
                while (true) {
                    ot9[] ot9VarArr2 = this.c;
                    if (i >= ot9VarArr2.length) {
                        break;
                    }
                    ot9 ot9Var = ot9VarArr2[i];
                    if (ot9Var != null) {
                        codedOutputByteBufferNano.Y(1, ot9Var);
                    }
                    i++;
                }
            }
            super.j(codedOutputByteBufferNano);
        }

        public a m() {
            this.c = ot9.n();
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
                    ot9[] ot9VarArr = this.c;
                    int length = ot9VarArr == null ? 0 : ot9VarArr.length;
                    int i = iA2 + length;
                    ot9[] ot9VarArr2 = new ot9[i];
                    if (length != 0) {
                        System.arraycopy(ot9VarArr, 0, ot9VarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        ot9 ot9Var = new ot9();
                        ot9VarArr2[length] = ot9Var;
                        o34Var.q(ot9Var);
                        o34Var.A();
                        length++;
                    }
                    ot9 ot9Var2 = new ot9();
                    ot9VarArr2[length] = ot9Var2;
                    o34Var.q(ot9Var2);
                    this.c = ot9VarArr2;
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public ot9() {
        m();
    }

    public static ot9[] n() {
        if (e == null) {
            synchronized (afd.c) {
                try {
                    if (e == null) {
                        e = new ot9[0];
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
        return super.b() + CodedOutputByteBufferNano.y(1, this.c) + CodedOutputByteBufferNano.b(2, this.d);
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.p0(1, this.c);
        codedOutputByteBufferNano.M(2, this.d);
        super.j(codedOutputByteBufferNano);
    }

    public ot9 m() {
        this.c = 0;
        this.d = false;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public ot9 e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 8) {
                this.c = o34Var.B();
            } else if (iA == 16) {
                this.d = o34Var.k();
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
