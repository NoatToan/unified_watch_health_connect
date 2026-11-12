package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class z01 extends ak8<z01> {
    public static volatile z01[] d;
    public f21 c;

    public static final class a extends ak8<a> {
        public z01[] c;

        public a() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            int iB = super.b();
            z01[] z01VarArr = this.c;
            if (z01VarArr != null && z01VarArr.length > 0) {
                int i = 0;
                while (true) {
                    z01[] z01VarArr2 = this.c;
                    if (i >= z01VarArr2.length) {
                        break;
                    }
                    z01 z01Var = z01VarArr2[i];
                    if (z01Var != null) {
                        iB += CodedOutputByteBufferNano.n(1, z01Var);
                    }
                    i++;
                }
            }
            return iB;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            z01[] z01VarArr = this.c;
            if (z01VarArr != null && z01VarArr.length > 0) {
                int i = 0;
                while (true) {
                    z01[] z01VarArr2 = this.c;
                    if (i >= z01VarArr2.length) {
                        break;
                    }
                    z01 z01Var = z01VarArr2[i];
                    if (z01Var != null) {
                        codedOutputByteBufferNano.Y(1, z01Var);
                    }
                    i++;
                }
            }
            super.j(codedOutputByteBufferNano);
        }

        public a m() {
            this.c = z01.n();
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
                    z01[] z01VarArr = this.c;
                    int length = z01VarArr == null ? 0 : z01VarArr.length;
                    int i = iA2 + length;
                    z01[] z01VarArr2 = new z01[i];
                    if (length != 0) {
                        System.arraycopy(z01VarArr, 0, z01VarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        z01 z01Var = new z01();
                        z01VarArr2[length] = z01Var;
                        o34Var.q(z01Var);
                        o34Var.A();
                        length++;
                    }
                    z01 z01Var2 = new z01();
                    z01VarArr2[length] = z01Var2;
                    o34Var.q(z01Var2);
                    this.c = z01VarArr2;
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public z01() {
        m();
    }

    public static z01[] n() {
        if (d == null) {
            synchronized (afd.c) {
                try {
                    if (d == null) {
                        d = new z01[0];
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
        int iB = super.b();
        f21 f21Var = this.c;
        return f21Var != null ? iB + CodedOutputByteBufferNano.n(1, f21Var) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        f21 f21Var = this.c;
        if (f21Var != null) {
            codedOutputByteBufferNano.Y(1, f21Var);
        }
        super.j(codedOutputByteBufferNano);
    }

    public z01 m() {
        this.c = null;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public z01 e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 10) {
                if (this.c == null) {
                    this.c = new f21();
                }
                o34Var.q(this.c);
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
