package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class m11 extends ak8<m11> {
    public static volatile m11[] f;
    public String c;
    public String d;
    public String e;

    public static final class a extends ak8<a> {
        public m11[] c;

        public a() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            int iB = super.b();
            m11[] m11VarArr = this.c;
            if (m11VarArr != null && m11VarArr.length > 0) {
                int i = 0;
                while (true) {
                    m11[] m11VarArr2 = this.c;
                    if (i >= m11VarArr2.length) {
                        break;
                    }
                    m11 m11Var = m11VarArr2[i];
                    if (m11Var != null) {
                        iB += CodedOutputByteBufferNano.n(1, m11Var);
                    }
                    i++;
                }
            }
            return iB;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            m11[] m11VarArr = this.c;
            if (m11VarArr != null && m11VarArr.length > 0) {
                int i = 0;
                while (true) {
                    m11[] m11VarArr2 = this.c;
                    if (i >= m11VarArr2.length) {
                        break;
                    }
                    m11 m11Var = m11VarArr2[i];
                    if (m11Var != null) {
                        codedOutputByteBufferNano.Y(1, m11Var);
                    }
                    i++;
                }
            }
            super.j(codedOutputByteBufferNano);
        }

        public a m() {
            this.c = m11.n();
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
                    m11[] m11VarArr = this.c;
                    int length = m11VarArr == null ? 0 : m11VarArr.length;
                    int i = iA2 + length;
                    m11[] m11VarArr2 = new m11[i];
                    if (length != 0) {
                        System.arraycopy(m11VarArr, 0, m11VarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        m11 m11Var = new m11();
                        m11VarArr2[length] = m11Var;
                        o34Var.q(m11Var);
                        o34Var.A();
                        length++;
                    }
                    m11 m11Var2 = new m11();
                    m11VarArr2[length] = m11Var2;
                    o34Var.q(m11Var2);
                    this.c = m11VarArr2;
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public m11() {
        m();
    }

    public static m11[] n() {
        if (f == null) {
            synchronized (afd.c) {
                try {
                    if (f == null) {
                        f = new m11[0];
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b() + CodedOutputByteBufferNano.v(1, this.c);
        if (!this.d.equals("")) {
            iB += CodedOutputByteBufferNano.v(2, this.d);
        }
        return !this.e.equals("") ? iB + CodedOutputByteBufferNano.v(3, this.e) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.m0(1, this.c);
        if (!this.d.equals("")) {
            codedOutputByteBufferNano.m0(2, this.d);
        }
        if (!this.e.equals("")) {
            codedOutputByteBufferNano.m0(3, this.e);
        }
        super.j(codedOutputByteBufferNano);
    }

    public m11 m() {
        this.c = "";
        this.d = "";
        this.e = "";
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public m11 e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 10) {
                this.c = o34Var.z();
            } else if (iA == 18) {
                this.d = o34Var.z();
            } else if (iA == 26) {
                this.e = o34Var.z();
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
