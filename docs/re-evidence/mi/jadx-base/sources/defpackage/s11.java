package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class s11 extends ak8<s11> {
    public static volatile s11[] d;
    public String c;

    public static final class a extends ak8<a> {
        public s11[] c;

        public a() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            int iB = super.b();
            s11[] s11VarArr = this.c;
            if (s11VarArr != null && s11VarArr.length > 0) {
                int i = 0;
                while (true) {
                    s11[] s11VarArr2 = this.c;
                    if (i >= s11VarArr2.length) {
                        break;
                    }
                    s11 s11Var = s11VarArr2[i];
                    if (s11Var != null) {
                        iB += CodedOutputByteBufferNano.n(1, s11Var);
                    }
                    i++;
                }
            }
            return iB;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            s11[] s11VarArr = this.c;
            if (s11VarArr != null && s11VarArr.length > 0) {
                int i = 0;
                while (true) {
                    s11[] s11VarArr2 = this.c;
                    if (i >= s11VarArr2.length) {
                        break;
                    }
                    s11 s11Var = s11VarArr2[i];
                    if (s11Var != null) {
                        codedOutputByteBufferNano.Y(1, s11Var);
                    }
                    i++;
                }
            }
            super.j(codedOutputByteBufferNano);
        }

        public a m() {
            this.c = s11.n();
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
                    s11[] s11VarArr = this.c;
                    int length = s11VarArr == null ? 0 : s11VarArr.length;
                    int i = iA2 + length;
                    s11[] s11VarArr2 = new s11[i];
                    if (length != 0) {
                        System.arraycopy(s11VarArr, 0, s11VarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        s11 s11Var = new s11();
                        s11VarArr2[length] = s11Var;
                        o34Var.q(s11Var);
                        o34Var.A();
                        length++;
                    }
                    s11 s11Var2 = new s11();
                    s11VarArr2[length] = s11Var2;
                    o34Var.q(s11Var2);
                    this.c = s11VarArr2;
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public s11() {
        m();
    }

    public static s11[] n() {
        if (d == null) {
            synchronized (afd.c) {
                try {
                    if (d == null) {
                        d = new s11[0];
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

    public s11 m() {
        this.c = "";
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public s11 e(o34 o34Var) throws IOException {
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
