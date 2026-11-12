package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class fyo extends ak8<fyo> {
    public String c;
    public String d;
    public String e;

    public static final class a extends ak8<a> {
        public int c;
        public fyo d;

        public a() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            int iB = super.b() + CodedOutputByteBufferNano.y(1, this.c);
            fyo fyoVar = this.d;
            return fyoVar != null ? iB + CodedOutputByteBufferNano.n(2, fyoVar) : iB;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.p0(1, this.c);
            fyo fyoVar = this.d;
            if (fyoVar != null) {
                codedOutputByteBufferNano.Y(2, fyoVar);
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
                    this.c = o34Var.B();
                } else if (iA == 18) {
                    if (this.d == null) {
                        this.d = new fyo();
                    }
                    o34Var.q(this.d);
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public fyo() {
        m();
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

    public fyo m() {
        this.c = "";
        this.d = "";
        this.e = "";
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public fyo e(o34 o34Var) throws IOException {
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
