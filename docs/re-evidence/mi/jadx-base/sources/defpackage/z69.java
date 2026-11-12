package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class z69 extends ak8<z69> {
    public static volatile z69[] e;
    public String c;
    public byte[] d;

    public static final class a extends ak8<a> {
        public z69[] c;

        public a() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            int iB = super.b();
            z69[] z69VarArr = this.c;
            if (z69VarArr != null && z69VarArr.length > 0) {
                int i = 0;
                while (true) {
                    z69[] z69VarArr2 = this.c;
                    if (i >= z69VarArr2.length) {
                        break;
                    }
                    z69 z69Var = z69VarArr2[i];
                    if (z69Var != null) {
                        iB += CodedOutputByteBufferNano.n(1, z69Var);
                    }
                    i++;
                }
            }
            return iB;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            z69[] z69VarArr = this.c;
            if (z69VarArr != null && z69VarArr.length > 0) {
                int i = 0;
                while (true) {
                    z69[] z69VarArr2 = this.c;
                    if (i >= z69VarArr2.length) {
                        break;
                    }
                    z69 z69Var = z69VarArr2[i];
                    if (z69Var != null) {
                        codedOutputByteBufferNano.Y(1, z69Var);
                    }
                    i++;
                }
            }
            super.j(codedOutputByteBufferNano);
        }

        public a m() {
            this.c = z69.n();
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
                    z69[] z69VarArr = this.c;
                    int length = z69VarArr == null ? 0 : z69VarArr.length;
                    int i = iA2 + length;
                    z69[] z69VarArr2 = new z69[i];
                    if (length != 0) {
                        System.arraycopy(z69VarArr, 0, z69VarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        z69 z69Var = new z69();
                        z69VarArr2[length] = z69Var;
                        o34Var.q(z69Var);
                        o34Var.A();
                        length++;
                    }
                    z69 z69Var2 = new z69();
                    z69VarArr2[length] = z69Var2;
                    o34Var.q(z69Var2);
                    this.c = z69VarArr2;
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public z69() {
        m();
    }

    public static z69[] n() {
        if (e == null) {
            synchronized (afd.c) {
                try {
                    if (e == null) {
                        e = new z69[0];
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
        return super.b() + CodedOutputByteBufferNano.v(1, this.c) + CodedOutputByteBufferNano.d(2, this.d);
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.m0(1, this.c);
        codedOutputByteBufferNano.O(2, this.d);
        super.j(codedOutputByteBufferNano);
    }

    public z69 m() {
        this.c = "";
        this.d = bmr.h;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public z69 e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 10) {
                this.c = o34Var.z();
            } else if (iA == 18) {
                this.d = o34Var.l();
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
