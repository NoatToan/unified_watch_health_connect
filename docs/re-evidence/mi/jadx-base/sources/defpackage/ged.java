package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class ged extends ak8<ged> {
    public int c;
    public v64 d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f18887k;
    public int l;
    public int m;
    public int n;
    public int o;

    public ged() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b() + CodedOutputByteBufferNano.y(1, this.c);
        v64 v64Var = this.d;
        if (v64Var != null) {
            iB += CodedOutputByteBufferNano.n(2, v64Var);
        }
        return iB + CodedOutputByteBufferNano.y(3, this.e) + CodedOutputByteBufferNano.y(4, this.f) + CodedOutputByteBufferNano.y(5, this.g) + CodedOutputByteBufferNano.y(6, this.h) + CodedOutputByteBufferNano.y(7, this.i) + CodedOutputByteBufferNano.y(8, this.j) + CodedOutputByteBufferNano.y(9, this.f18887k) + CodedOutputByteBufferNano.y(10, this.l) + CodedOutputByteBufferNano.y(11, this.m) + CodedOutputByteBufferNano.y(12, this.n) + CodedOutputByteBufferNano.y(13, this.o);
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.p0(1, this.c);
        v64 v64Var = this.d;
        if (v64Var != null) {
            codedOutputByteBufferNano.Y(2, v64Var);
        }
        codedOutputByteBufferNano.p0(3, this.e);
        codedOutputByteBufferNano.p0(4, this.f);
        codedOutputByteBufferNano.p0(5, this.g);
        codedOutputByteBufferNano.p0(6, this.h);
        codedOutputByteBufferNano.p0(7, this.i);
        codedOutputByteBufferNano.p0(8, this.j);
        codedOutputByteBufferNano.p0(9, this.f18887k);
        codedOutputByteBufferNano.p0(10, this.l);
        codedOutputByteBufferNano.p0(11, this.m);
        codedOutputByteBufferNano.p0(12, this.n);
        codedOutputByteBufferNano.p0(13, this.o);
        super.j(codedOutputByteBufferNano);
    }

    public ged m() {
        this.c = 0;
        this.d = null;
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.h = 0;
        this.i = 0;
        this.j = 0;
        this.f18887k = 0;
        this.l = 0;
        this.m = 0;
        this.n = 0;
        this.o = 0;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public ged e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            switch (iA) {
                case 0:
                    return this;
                case 8:
                    this.c = o34Var.B();
                    break;
                case 18:
                    if (this.d == null) {
                        this.d = new v64();
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
                case 48:
                    this.h = o34Var.B();
                    break;
                case 56:
                    this.i = o34Var.B();
                    break;
                case 64:
                    this.j = o34Var.B();
                    break;
                case 72:
                    this.f18887k = o34Var.B();
                    break;
                case 80:
                    this.l = o34Var.B();
                    break;
                case 88:
                    this.m = o34Var.B();
                    break;
                case 96:
                    this.n = o34Var.B();
                    break;
                case 104:
                    this.o = o34Var.B();
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
