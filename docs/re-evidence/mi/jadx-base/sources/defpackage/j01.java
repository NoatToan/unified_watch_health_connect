package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class j01 extends ak8<j01> {
    public int c;
    public boolean d;
    public String e;
    public a f;

    public static final class a extends ak8<a> {
        public String c;
        public int d;

        public a() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            return super.b() + CodedOutputByteBufferNano.v(1, this.c) + CodedOutputByteBufferNano.l(2, this.d);
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m0(1, this.c);
            codedOutputByteBufferNano.W(2, this.d);
            super.j(codedOutputByteBufferNano);
        }

        public a m() {
            this.c = "";
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
                    this.c = o34Var.z();
                } else if (iA == 16) {
                    int iP = o34Var.p();
                    switch (iP) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                            this.d = iP;
                            break;
                    }
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public j01() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b() + CodedOutputByteBufferNano.l(1, this.c) + CodedOutputByteBufferNano.b(2, this.d);
        if (!this.e.equals("")) {
            iB += CodedOutputByteBufferNano.v(3, this.e);
        }
        a aVar = this.f;
        return aVar != null ? iB + CodedOutputByteBufferNano.n(4, aVar) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.W(1, this.c);
        codedOutputByteBufferNano.M(2, this.d);
        if (!this.e.equals("")) {
            codedOutputByteBufferNano.m0(3, this.e);
        }
        a aVar = this.f;
        if (aVar != null) {
            codedOutputByteBufferNano.Y(4, aVar);
        }
        super.j(codedOutputByteBufferNano);
    }

    public j01 m() {
        this.c = 0;
        this.d = false;
        this.e = "";
        this.f = null;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public j01 e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 8) {
                int iP = o34Var.p();
                if (iP == 0 || iP == 1) {
                    this.c = iP;
                }
            } else if (iA == 16) {
                this.d = o34Var.k();
            } else if (iA == 26) {
                this.e = o34Var.z();
            } else if (iA == 34) {
                if (this.f == null) {
                    this.f = new a();
                }
                o34Var.q(this.f);
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
