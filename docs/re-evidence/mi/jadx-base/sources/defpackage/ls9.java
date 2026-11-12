package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class ls9 extends ak8<ls9> {
    public int c;
    public int d;
    public boolean e;
    public boolean f;
    public int g;
    public av9 h;
    public int i;
    public a j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f25395k;
    public int l;
    public av9 m;

    public static final class a extends ak8<a> {
        public boolean c;

        public a() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            return super.b() + CodedOutputByteBufferNano.b(1, this.c);
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.M(1, this.c);
            super.j(codedOutputByteBufferNano);
        }

        public a m() {
            this.c = false;
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
                    this.c = o34Var.k();
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public ls9() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b() + CodedOutputByteBufferNano.l(1, this.c) + CodedOutputByteBufferNano.y(2, this.d) + CodedOutputByteBufferNano.b(3, this.f) + CodedOutputByteBufferNano.y(4, this.g);
        a aVar = this.j;
        if (aVar != null) {
            iB += CodedOutputByteBufferNano.n(5, aVar);
        }
        av9 av9Var = this.m;
        if (av9Var != null) {
            iB += CodedOutputByteBufferNano.n(6, av9Var);
        }
        boolean z = this.e;
        if (z) {
            iB += CodedOutputByteBufferNano.b(7, z);
        }
        av9 av9Var2 = this.h;
        if (av9Var2 != null) {
            iB += CodedOutputByteBufferNano.n(8, av9Var2);
        }
        int i = this.f25395k;
        if (i != 0) {
            iB += CodedOutputByteBufferNano.l(9, i);
        }
        int i2 = this.i;
        if (i2 != 0) {
            iB += CodedOutputByteBufferNano.l(10, i2);
        }
        int i3 = this.l;
        return i3 != 0 ? iB + CodedOutputByteBufferNano.l(11, i3) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.W(1, this.c);
        codedOutputByteBufferNano.p0(2, this.d);
        codedOutputByteBufferNano.M(3, this.f);
        codedOutputByteBufferNano.p0(4, this.g);
        a aVar = this.j;
        if (aVar != null) {
            codedOutputByteBufferNano.Y(5, aVar);
        }
        av9 av9Var = this.m;
        if (av9Var != null) {
            codedOutputByteBufferNano.Y(6, av9Var);
        }
        boolean z = this.e;
        if (z) {
            codedOutputByteBufferNano.M(7, z);
        }
        av9 av9Var2 = this.h;
        if (av9Var2 != null) {
            codedOutputByteBufferNano.Y(8, av9Var2);
        }
        int i = this.f25395k;
        if (i != 0) {
            codedOutputByteBufferNano.W(9, i);
        }
        int i2 = this.i;
        if (i2 != 0) {
            codedOutputByteBufferNano.W(10, i2);
        }
        int i3 = this.l;
        if (i3 != 0) {
            codedOutputByteBufferNano.W(11, i3);
        }
        super.j(codedOutputByteBufferNano);
    }

    public ls9 m() {
        this.c = 0;
        this.d = 0;
        this.e = false;
        this.f = false;
        this.g = 0;
        this.h = null;
        this.i = 0;
        this.j = null;
        this.f25395k = 0;
        this.l = 0;
        this.m = null;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public ls9 e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            switch (iA) {
                case 0:
                    return this;
                case 8:
                    int iP = o34Var.p();
                    if (iP == 0 || iP == 1) {
                        this.c = iP;
                    }
                    break;
                case 16:
                    this.d = o34Var.B();
                    break;
                case 24:
                    this.f = o34Var.k();
                    break;
                case 32:
                    this.g = o34Var.B();
                    break;
                case 42:
                    if (this.j == null) {
                        this.j = new a();
                    }
                    o34Var.q(this.j);
                    break;
                case 50:
                    if (this.m == null) {
                        this.m = new av9();
                    }
                    o34Var.q(this.m);
                    break;
                case 56:
                    this.e = o34Var.k();
                    break;
                case 66:
                    if (this.h == null) {
                        this.h = new av9();
                    }
                    o34Var.q(this.h);
                    break;
                case 72:
                    int iP2 = o34Var.p();
                    if (iP2 == 0 || iP2 == 1 || iP2 == 2) {
                        this.f25395k = iP2;
                    }
                    break;
                case 80:
                    int iP3 = o34Var.p();
                    if (iP3 == 0 || iP3 == 1 || iP3 == 2) {
                        this.i = iP3;
                    }
                    break;
                case 88:
                    int iP4 = o34Var.p();
                    if (iP4 == 0 || iP4 == 1 || iP4 == 2) {
                        this.l = iP4;
                    }
                    break;
                default:
                    if (!l(o34Var, iA)) {
                        return this;
                    }
                    break;
                    break;
            }
        }
    }
}
