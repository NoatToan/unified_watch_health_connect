package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class blf extends ak8<blf> {
    public r64 c;
    public r64 d;
    public a e;

    public static final class a extends ak8<a> {
        public wkf c;
        public int d;

        public a() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            int iB = super.b();
            wkf wkfVar = this.c;
            if (wkfVar != null) {
                iB += CodedOutputByteBufferNano.n(1, wkfVar);
            }
            return iB + CodedOutputByteBufferNano.y(2, this.d);
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            wkf wkfVar = this.c;
            if (wkfVar != null) {
                codedOutputByteBufferNano.Y(1, wkfVar);
            }
            codedOutputByteBufferNano.p0(2, this.d);
            super.j(codedOutputByteBufferNano);
        }

        public a m() {
            this.c = null;
            this.d = 0;
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
                        this.c = new wkf();
                    }
                    o34Var.q(this.c);
                } else if (iA == 16) {
                    this.d = o34Var.B();
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public blf() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b();
        r64 r64Var = this.c;
        if (r64Var != null) {
            iB += CodedOutputByteBufferNano.n(1, r64Var);
        }
        r64 r64Var2 = this.d;
        if (r64Var2 != null) {
            iB += CodedOutputByteBufferNano.n(2, r64Var2);
        }
        a aVar = this.e;
        return aVar != null ? iB + CodedOutputByteBufferNano.n(3, aVar) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        r64 r64Var = this.c;
        if (r64Var != null) {
            codedOutputByteBufferNano.Y(1, r64Var);
        }
        r64 r64Var2 = this.d;
        if (r64Var2 != null) {
            codedOutputByteBufferNano.Y(2, r64Var2);
        }
        a aVar = this.e;
        if (aVar != null) {
            codedOutputByteBufferNano.Y(3, aVar);
        }
        super.j(codedOutputByteBufferNano);
    }

    public blf m() {
        this.c = null;
        this.d = null;
        this.e = null;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public blf e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 10) {
                if (this.c == null) {
                    this.c = new r64();
                }
                o34Var.q(this.c);
            } else if (iA == 18) {
                if (this.d == null) {
                    this.d = new r64();
                }
                o34Var.q(this.d);
            } else if (iA == 26) {
                if (this.e == null) {
                    this.e = new a();
                }
                o34Var.q(this.e);
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
