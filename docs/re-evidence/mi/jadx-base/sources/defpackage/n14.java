package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class n14 extends ak8<n14> {
    public int c;
    public int d;
    public String e;

    public static final class a extends ak8<a> {
        public int c;
        public n14 d;

        public a() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            int iB = super.b() + CodedOutputByteBufferNano.l(1, this.c);
            n14 n14Var = this.d;
            return n14Var != null ? iB + CodedOutputByteBufferNano.n(2, n14Var) : iB;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.W(1, this.c);
            n14 n14Var = this.d;
            if (n14Var != null) {
                codedOutputByteBufferNano.Y(2, n14Var);
            }
            super.j(codedOutputByteBufferNano);
        }

        public a m() {
            this.c = 0;
            this.d = null;
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
                if (iA == 8) {
                    int iP = o34Var.p();
                    if (iP == 0 || iP == 1 || iP == 2) {
                        this.c = iP;
                    }
                } else if (iA == 18) {
                    if (this.d == null) {
                        this.d = new n14();
                    }
                    o34Var.q(this.d);
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public n14() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b() + CodedOutputByteBufferNano.y(1, this.c);
        int i = this.d;
        if (i != 0) {
            iB += CodedOutputByteBufferNano.y(2, i);
        }
        return !this.e.equals("") ? iB + CodedOutputByteBufferNano.v(3, this.e) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.p0(1, this.c);
        int i = this.d;
        if (i != 0) {
            codedOutputByteBufferNano.p0(2, i);
        }
        if (!this.e.equals("")) {
            codedOutputByteBufferNano.m0(3, this.e);
        }
        super.j(codedOutputByteBufferNano);
    }

    public n14 m() {
        this.c = 0;
        this.d = 0;
        this.e = "";
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public n14 e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 8) {
                this.c = o34Var.B();
            } else if (iA == 16) {
                this.d = o34Var.B();
            } else if (iA == 26) {
                this.e = o34Var.z();
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
