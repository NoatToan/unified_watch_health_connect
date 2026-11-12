package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class q14 extends ak8<q14> {
    public int c;
    public a d;
    public int e;

    public static final class a extends ak8<a> {
        public t64 c;
        public t64 d;
        public int e;

        public a() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            int iB = super.b();
            t64 t64Var = this.c;
            if (t64Var != null) {
                iB += CodedOutputByteBufferNano.n(1, t64Var);
            }
            t64 t64Var2 = this.d;
            if (t64Var2 != null) {
                iB += CodedOutputByteBufferNano.n(2, t64Var2);
            }
            return iB + CodedOutputByteBufferNano.r(3, this.e);
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            t64 t64Var = this.c;
            if (t64Var != null) {
                codedOutputByteBufferNano.Y(1, t64Var);
            }
            t64 t64Var2 = this.d;
            if (t64Var2 != null) {
                codedOutputByteBufferNano.Y(2, t64Var2);
            }
            codedOutputByteBufferNano.i0(3, this.e);
            super.j(codedOutputByteBufferNano);
        }

        public a m() {
            this.c = null;
            this.d = null;
            this.e = 0;
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
                    if (this.c == null) {
                        this.c = new t64();
                    }
                    o34Var.q(this.c);
                } else if (iA == 18) {
                    if (this.d == null) {
                        this.d = new t64();
                    }
                    o34Var.q(this.d);
                } else if (iA == 24) {
                    this.e = o34Var.x();
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public q14() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b() + CodedOutputByteBufferNano.l(1, this.c);
        a aVar = this.d;
        if (aVar != null) {
            iB += CodedOutputByteBufferNano.n(2, aVar);
        }
        int i = this.e;
        return i != 0 ? iB + CodedOutputByteBufferNano.l(3, i) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.W(1, this.c);
        a aVar = this.d;
        if (aVar != null) {
            codedOutputByteBufferNano.Y(2, aVar);
        }
        int i = this.e;
        if (i != 0) {
            codedOutputByteBufferNano.W(3, i);
        }
        super.j(codedOutputByteBufferNano);
    }

    public q14 m() {
        this.c = 0;
        this.d = null;
        this.e = 0;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public q14 e(o34 o34Var) throws IOException {
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
                    this.d = new a();
                }
                o34Var.q(this.d);
            } else if (iA == 24) {
                int iP2 = o34Var.p();
                if (iP2 == 0 || iP2 == 1 || iP2 == 2) {
                    this.e = iP2;
                }
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
