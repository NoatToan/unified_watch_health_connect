package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class x41 extends ak8<x41> {
    public static volatile x41[] d;
    public String c;

    public static final class a extends ak8<a> {
        public x41[] c;

        public a() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            int iB = super.b();
            x41[] x41VarArr = this.c;
            if (x41VarArr != null && x41VarArr.length > 0) {
                int i = 0;
                while (true) {
                    x41[] x41VarArr2 = this.c;
                    if (i >= x41VarArr2.length) {
                        break;
                    }
                    x41 x41Var = x41VarArr2[i];
                    if (x41Var != null) {
                        iB += CodedOutputByteBufferNano.n(1, x41Var);
                    }
                    i++;
                }
            }
            return iB;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            x41[] x41VarArr = this.c;
            if (x41VarArr != null && x41VarArr.length > 0) {
                int i = 0;
                while (true) {
                    x41[] x41VarArr2 = this.c;
                    if (i >= x41VarArr2.length) {
                        break;
                    }
                    x41 x41Var = x41VarArr2[i];
                    if (x41Var != null) {
                        codedOutputByteBufferNano.Y(1, x41Var);
                    }
                    i++;
                }
            }
            super.j(codedOutputByteBufferNano);
        }

        public a m() {
            this.c = x41.n();
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
                    x41[] x41VarArr = this.c;
                    int length = x41VarArr == null ? 0 : x41VarArr.length;
                    int i = iA2 + length;
                    x41[] x41VarArr2 = new x41[i];
                    if (length != 0) {
                        System.arraycopy(x41VarArr, 0, x41VarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        x41 x41Var = new x41();
                        x41VarArr2[length] = x41Var;
                        o34Var.q(x41Var);
                        o34Var.A();
                        length++;
                    }
                    x41 x41Var2 = new x41();
                    x41VarArr2[length] = x41Var2;
                    o34Var.q(x41Var2);
                    this.c = x41VarArr2;
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public x41() {
        m();
    }

    public static x41[] n() {
        if (d == null) {
            synchronized (afd.c) {
                try {
                    if (d == null) {
                        d = new x41[0];
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return d;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        return super.b() + CodedOutputByteBufferNano.v(1, this.c);
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.m0(1, this.c);
        super.j(codedOutputByteBufferNano);
    }

    public x41 m() {
        this.c = "";
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public x41 e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 10) {
                this.c = o34Var.z();
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
