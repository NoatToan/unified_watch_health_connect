package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public final class bx7 extends ak8<bx7> {
    public jx7 c;
    public kx7 d;
    public int e;
    public int f;
    public int g;
    public sw7 h;
    public sw7 i;
    public lx7 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f4693k;
    public int l;
    public int m;

    public bx7() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b();
        jx7 jx7Var = this.c;
        if (jx7Var != null) {
            iB += CodedOutputByteBufferNano.n(1, jx7Var);
        }
        kx7 kx7Var = this.d;
        if (kx7Var != null) {
            iB += CodedOutputByteBufferNano.n(2, kx7Var);
        }
        int iY = iB + CodedOutputByteBufferNano.y(3, this.e) + CodedOutputByteBufferNano.y(4, this.f) + CodedOutputByteBufferNano.y(5, this.g);
        sw7 sw7Var = this.h;
        if (sw7Var != null) {
            iY += CodedOutputByteBufferNano.n(6, sw7Var);
        }
        sw7 sw7Var2 = this.i;
        if (sw7Var2 != null) {
            iY += CodedOutputByteBufferNano.n(7, sw7Var2);
        }
        lx7 lx7Var = this.j;
        if (lx7Var != null) {
            iY += CodedOutputByteBufferNano.n(8, lx7Var);
        }
        return iY + CodedOutputByteBufferNano.y(9, this.f4693k) + CodedOutputByteBufferNano.y(10, this.l) + CodedOutputByteBufferNano.y(11, this.m);
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        jx7 jx7Var = this.c;
        if (jx7Var != null) {
            codedOutputByteBufferNano.Y(1, jx7Var);
        }
        kx7 kx7Var = this.d;
        if (kx7Var != null) {
            codedOutputByteBufferNano.Y(2, kx7Var);
        }
        codedOutputByteBufferNano.p0(3, this.e);
        codedOutputByteBufferNano.p0(4, this.f);
        codedOutputByteBufferNano.p0(5, this.g);
        sw7 sw7Var = this.h;
        if (sw7Var != null) {
            codedOutputByteBufferNano.Y(6, sw7Var);
        }
        sw7 sw7Var2 = this.i;
        if (sw7Var2 != null) {
            codedOutputByteBufferNano.Y(7, sw7Var2);
        }
        lx7 lx7Var = this.j;
        if (lx7Var != null) {
            codedOutputByteBufferNano.Y(8, lx7Var);
        }
        codedOutputByteBufferNano.p0(9, this.f4693k);
        codedOutputByteBufferNano.p0(10, this.l);
        codedOutputByteBufferNano.p0(11, this.m);
        super.j(codedOutputByteBufferNano);
    }

    public bx7 m() {
        this.c = null;
        this.d = null;
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.h = null;
        this.i = null;
        this.j = null;
        this.f4693k = 0;
        this.l = 0;
        this.m = 0;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public bx7 e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            switch (iA) {
                case 0:
                    return this;
                case 10:
                    if (this.c == null) {
                        this.c = new jx7();
                    }
                    o34Var.q(this.c);
                    break;
                case 18:
                    if (this.d == null) {
                        this.d = new kx7();
                    }
                    o34Var.q(this.d);
                    break;
                case 24:
                    this.e = o34Var.B();
                    break;
                case 32:
                    this.f = o34Var.B();
                    break;
                case 40:
                    this.g = o34Var.B();
                    break;
                case 50:
                    if (this.h == null) {
                        this.h = new sw7();
                    }
                    o34Var.q(this.h);
                    break;
                case 58:
                    if (this.i == null) {
                        this.i = new sw7();
                    }
                    o34Var.q(this.i);
                    break;
                case 66:
                    if (this.j == null) {
                        this.j = new lx7();
                    }
                    o34Var.q(this.j);
                    break;
                case 72:
                    this.f4693k = o34Var.B();
                    break;
                case 80:
                    this.l = o34Var.B();
                    break;
                case 88:
                    this.m = o34Var.B();
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
