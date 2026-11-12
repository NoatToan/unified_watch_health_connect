package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class kdd extends ak8<kdd> {
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public long i;
    public a j;

    public static final class a extends ak8<a> {
        public int c;
        public int d;
        public int e;

        public a() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            return super.b() + CodedOutputByteBufferNano.y(1, this.c) + CodedOutputByteBufferNano.y(2, this.d) + CodedOutputByteBufferNano.y(3, this.e);
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.p0(1, this.c);
            codedOutputByteBufferNano.p0(2, this.d);
            codedOutputByteBufferNano.p0(3, this.e);
            super.j(codedOutputByteBufferNano);
        }

        public a m() {
            this.c = 0;
            this.d = 0;
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
                if (iA == 8) {
                    this.c = o34Var.B();
                } else if (iA == 16) {
                    this.d = o34Var.B();
                } else if (iA == 24) {
                    this.e = o34Var.B();
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public kdd() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b() + CodedOutputByteBufferNano.y(1, this.c) + CodedOutputByteBufferNano.y(2, this.d) + CodedOutputByteBufferNano.y(3, this.e) + CodedOutputByteBufferNano.y(4, this.f);
        int i = this.h;
        if (i != 0) {
            iB += CodedOutputByteBufferNano.y(5, i);
        }
        int iY = iB + CodedOutputByteBufferNano.y(6, this.g);
        long j = this.i;
        if (j != 0) {
            iY += CodedOutputByteBufferNano.A(7, j);
        }
        a aVar = this.j;
        return aVar != null ? iY + CodedOutputByteBufferNano.n(8, aVar) : iY;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.p0(1, this.c);
        codedOutputByteBufferNano.p0(2, this.d);
        codedOutputByteBufferNano.p0(3, this.e);
        codedOutputByteBufferNano.p0(4, this.f);
        int i = this.h;
        if (i != 0) {
            codedOutputByteBufferNano.p0(5, i);
        }
        codedOutputByteBufferNano.p0(6, this.g);
        long j = this.i;
        if (j != 0) {
            codedOutputByteBufferNano.r0(7, j);
        }
        a aVar = this.j;
        if (aVar != null) {
            codedOutputByteBufferNano.Y(8, aVar);
        }
        super.j(codedOutputByteBufferNano);
    }

    public kdd m() {
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.h = 0;
        this.i = 0L;
        this.j = null;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public kdd e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 8) {
                this.c = o34Var.B();
            } else if (iA == 16) {
                this.d = o34Var.B();
            } else if (iA == 24) {
                this.e = o34Var.B();
            } else if (iA == 32) {
                this.f = o34Var.B();
            } else if (iA == 40) {
                this.h = o34Var.B();
            } else if (iA == 48) {
                this.g = o34Var.B();
            } else if (iA == 56) {
                this.i = o34Var.C();
            } else if (iA == 66) {
                if (this.j == null) {
                    this.j = new a();
                }
                o34Var.q(this.j);
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
