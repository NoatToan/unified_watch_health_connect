package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class vwo extends ak8<vwo> {
    public a c;

    public static final class a extends ak8<a> {
        public int c;
        public int d;
        public C1129a e;

        /* JADX INFO: renamed from: vwo$a$a, reason: collision with other inner class name */
        public static final class C1129a extends ak8<C1129a> {
            public int c;
            public int d;

            public C1129a() {
                m();
            }

            @Override // defpackage.ak8, defpackage.dsf
            public int b() {
                int iB = super.b() + CodedOutputByteBufferNano.y(1, this.c);
                int i = this.d;
                return i != 0 ? iB + CodedOutputByteBufferNano.y(2, i) : iB;
            }

            @Override // defpackage.ak8, defpackage.dsf
            public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
                codedOutputByteBufferNano.p0(1, this.c);
                int i = this.d;
                if (i != 0) {
                    codedOutputByteBufferNano.p0(2, i);
                }
                super.j(codedOutputByteBufferNano);
            }

            public C1129a m() {
                this.c = 0;
                this.d = 0;
                this.f1122b = null;
                this.f15887a = -1;
                return this;
            }

            @Override // defpackage.dsf
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public C1129a e(o34 o34Var) throws IOException {
                while (true) {
                    int iA = o34Var.A();
                    if (iA == 0) {
                        return this;
                    }
                    if (iA == 8) {
                        this.c = o34Var.B();
                    } else if (iA == 16) {
                        this.d = o34Var.B();
                    } else if (!l(o34Var, iA)) {
                        return this;
                    }
                }
            }
        }

        public a() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            int iB = super.b() + CodedOutputByteBufferNano.y(1, this.c);
            int i = this.d;
            if (i != 0) {
                iB += CodedOutputByteBufferNano.l(2, i);
            }
            C1129a c1129a = this.e;
            return c1129a != null ? iB + CodedOutputByteBufferNano.n(3, c1129a) : iB;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.p0(1, this.c);
            int i = this.d;
            if (i != 0) {
                codedOutputByteBufferNano.W(2, i);
            }
            C1129a c1129a = this.e;
            if (c1129a != null) {
                codedOutputByteBufferNano.Y(3, c1129a);
            }
            super.j(codedOutputByteBufferNano);
        }

        public a m() {
            this.c = 0;
            this.d = 0;
            this.e = null;
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
                    this.c = o34Var.B();
                } else if (iA == 16) {
                    int iP = o34Var.p();
                    if (iP == 0 || iP == 1 || iP == 2 || iP == 3) {
                        this.d = iP;
                    }
                } else if (iA == 26) {
                    if (this.e == null) {
                        this.e = new C1129a();
                    }
                    o34Var.q(this.e);
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public vwo() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b();
        a aVar = this.c;
        return aVar != null ? iB + CodedOutputByteBufferNano.n(1, aVar) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        a aVar = this.c;
        if (aVar != null) {
            codedOutputByteBufferNano.Y(1, aVar);
        }
        super.j(codedOutputByteBufferNano);
    }

    public vwo m() {
        this.c = null;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public vwo e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 10) {
                if (this.c == null) {
                    this.c = new a();
                }
                o34Var.q(this.c);
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
