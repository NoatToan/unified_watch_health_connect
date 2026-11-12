package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class u11 extends ak8<u11> {
    public static volatile u11[] e;
    public f21 c;
    public String d;

    public static final class a extends ak8<a> {
        public u11[] c;

        public a() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            int iB = super.b();
            u11[] u11VarArr = this.c;
            if (u11VarArr != null && u11VarArr.length > 0) {
                int i = 0;
                while (true) {
                    u11[] u11VarArr2 = this.c;
                    if (i >= u11VarArr2.length) {
                        break;
                    }
                    u11 u11Var = u11VarArr2[i];
                    if (u11Var != null) {
                        iB += CodedOutputByteBufferNano.n(1, u11Var);
                    }
                    i++;
                }
            }
            return iB;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            u11[] u11VarArr = this.c;
            if (u11VarArr != null && u11VarArr.length > 0) {
                int i = 0;
                while (true) {
                    u11[] u11VarArr2 = this.c;
                    if (i >= u11VarArr2.length) {
                        break;
                    }
                    u11 u11Var = u11VarArr2[i];
                    if (u11Var != null) {
                        codedOutputByteBufferNano.Y(1, u11Var);
                    }
                    i++;
                }
            }
            super.j(codedOutputByteBufferNano);
        }

        public a m() {
            this.c = u11.n();
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
                    u11[] u11VarArr = this.c;
                    int length = u11VarArr == null ? 0 : u11VarArr.length;
                    int i = iA2 + length;
                    u11[] u11VarArr2 = new u11[i];
                    if (length != 0) {
                        System.arraycopy(u11VarArr, 0, u11VarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        u11 u11Var = new u11();
                        u11VarArr2[length] = u11Var;
                        o34Var.q(u11Var);
                        o34Var.A();
                        length++;
                    }
                    u11 u11Var2 = new u11();
                    u11VarArr2[length] = u11Var2;
                    o34Var.q(u11Var2);
                    this.c = u11VarArr2;
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public u11() {
        m();
    }

    public static u11[] n() {
        if (e == null) {
            synchronized (afd.c) {
                try {
                    if (e == null) {
                        e = new u11[0];
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
        int iB = super.b();
        f21 f21Var = this.c;
        if (f21Var != null) {
            iB += CodedOutputByteBufferNano.n(1, f21Var);
        }
        return !this.d.equals("") ? iB + CodedOutputByteBufferNano.v(2, this.d) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        f21 f21Var = this.c;
        if (f21Var != null) {
            codedOutputByteBufferNano.Y(1, f21Var);
        }
        if (!this.d.equals("")) {
            codedOutputByteBufferNano.m0(2, this.d);
        }
        super.j(codedOutputByteBufferNano);
    }

    public u11 m() {
        this.c = null;
        this.d = "";
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public u11 e(o34 o34Var) throws IOException {
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
            } else if (iA == 18) {
                this.d = o34Var.z();
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
