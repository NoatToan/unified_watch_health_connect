package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class t5r extends ak8<t5r> {
    public String c;
    public int d;
    public long e;
    public int f;
    public a g;

    public static final class a extends ak8<a> {
        public String c;
        public String d;
        public int e;

        public a() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            int iB = super.b() + CodedOutputByteBufferNano.v(1, this.c) + CodedOutputByteBufferNano.v(2, this.d);
            int i = this.e;
            return i != 0 ? iB + CodedOutputByteBufferNano.y(3, i) : iB;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m0(1, this.c);
            codedOutputByteBufferNano.m0(2, this.d);
            int i = this.e;
            if (i != 0) {
                codedOutputByteBufferNano.p0(3, i);
            }
            super.j(codedOutputByteBufferNano);
        }

        public a m() {
            this.c = "";
            this.d = "";
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
                    this.c = o34Var.z();
                } else if (iA == 18) {
                    this.d = o34Var.z();
                } else if (iA == 24) {
                    this.e = o34Var.B();
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public t5r() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b() + CodedOutputByteBufferNano.v(1, this.c) + CodedOutputByteBufferNano.y(2, this.d);
        long j = this.e;
        if (j != 0) {
            iB += CodedOutputByteBufferNano.A(3, j);
        }
        int i = this.f;
        if (i != 0) {
            iB += CodedOutputByteBufferNano.y(4, i);
        }
        a aVar = this.g;
        return aVar != null ? iB + CodedOutputByteBufferNano.n(5, aVar) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.m0(1, this.c);
        codedOutputByteBufferNano.p0(2, this.d);
        long j = this.e;
        if (j != 0) {
            codedOutputByteBufferNano.r0(3, j);
        }
        int i = this.f;
        if (i != 0) {
            codedOutputByteBufferNano.p0(4, i);
        }
        a aVar = this.g;
        if (aVar != null) {
            codedOutputByteBufferNano.Y(5, aVar);
        }
        super.j(codedOutputByteBufferNano);
    }

    public t5r m() {
        this.c = "";
        this.d = 0;
        this.e = 0L;
        this.f = 0;
        this.g = null;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public t5r e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 10) {
                this.c = o34Var.z();
            } else if (iA == 16) {
                this.d = o34Var.B();
            } else if (iA == 24) {
                this.e = o34Var.C();
            } else if (iA == 32) {
                this.f = o34Var.B();
            } else if (iA == 42) {
                if (this.g == null) {
                    this.g = new a();
                }
                o34Var.q(this.g);
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
