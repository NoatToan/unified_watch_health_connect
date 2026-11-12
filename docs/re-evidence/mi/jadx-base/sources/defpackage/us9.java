package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public final class us9 extends ak8<us9> {
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f36083k;
    public float l;
    public float m;
    public int n;
    public int o;
    public int p;
    public int q;

    public us9() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b() + CodedOutputByteBufferNano.y(1, this.c) + CodedOutputByteBufferNano.y(2, this.d) + CodedOutputByteBufferNano.y(3, this.e);
        int i = this.f;
        if (i != 0) {
            iB += CodedOutputByteBufferNano.y(4, i);
        }
        int i2 = this.g;
        if (i2 != 0) {
            iB += CodedOutputByteBufferNano.y(5, i2);
        }
        int i3 = this.h;
        if (i3 != 0) {
            iB += CodedOutputByteBufferNano.y(6, i3);
        }
        int i4 = this.i;
        if (i4 != 0) {
            iB += CodedOutputByteBufferNano.y(7, i4);
        }
        int i5 = this.j;
        if (i5 != 0) {
            iB += CodedOutputByteBufferNano.y(8, i5);
        }
        int i6 = this.f36083k;
        if (i6 != 0) {
            iB += CodedOutputByteBufferNano.y(9, i6);
        }
        if (Float.floatToIntBits(this.l) != Float.floatToIntBits(0.0f)) {
            iB += CodedOutputByteBufferNano.j(10, this.l);
        }
        if (Float.floatToIntBits(this.m) != Float.floatToIntBits(0.0f)) {
            iB += CodedOutputByteBufferNano.j(11, this.m);
        }
        int i7 = this.n;
        if (i7 != 0) {
            iB += CodedOutputByteBufferNano.y(12, i7);
        }
        int i8 = this.o;
        if (i8 != 0) {
            iB += CodedOutputByteBufferNano.y(13, i8);
        }
        int i9 = this.p;
        if (i9 != 0) {
            iB += CodedOutputByteBufferNano.y(14, i9);
        }
        int i10 = this.q;
        return i10 != 0 ? iB + CodedOutputByteBufferNano.y(15, i10) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.p0(1, this.c);
        codedOutputByteBufferNano.p0(2, this.d);
        codedOutputByteBufferNano.p0(3, this.e);
        int i = this.f;
        if (i != 0) {
            codedOutputByteBufferNano.p0(4, i);
        }
        int i2 = this.g;
        if (i2 != 0) {
            codedOutputByteBufferNano.p0(5, i2);
        }
        int i3 = this.h;
        if (i3 != 0) {
            codedOutputByteBufferNano.p0(6, i3);
        }
        int i4 = this.i;
        if (i4 != 0) {
            codedOutputByteBufferNano.p0(7, i4);
        }
        int i5 = this.j;
        if (i5 != 0) {
            codedOutputByteBufferNano.p0(8, i5);
        }
        int i6 = this.f36083k;
        if (i6 != 0) {
            codedOutputByteBufferNano.p0(9, i6);
        }
        if (Float.floatToIntBits(this.l) != Float.floatToIntBits(0.0f)) {
            codedOutputByteBufferNano.U(10, this.l);
        }
        if (Float.floatToIntBits(this.m) != Float.floatToIntBits(0.0f)) {
            codedOutputByteBufferNano.U(11, this.m);
        }
        int i7 = this.n;
        if (i7 != 0) {
            codedOutputByteBufferNano.p0(12, i7);
        }
        int i8 = this.o;
        if (i8 != 0) {
            codedOutputByteBufferNano.p0(13, i8);
        }
        int i9 = this.p;
        if (i9 != 0) {
            codedOutputByteBufferNano.p0(14, i9);
        }
        int i10 = this.q;
        if (i10 != 0) {
            codedOutputByteBufferNano.p0(15, i10);
        }
        super.j(codedOutputByteBufferNano);
    }

    public us9 m() {
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.h = 0;
        this.i = 0;
        this.j = 0;
        this.f36083k = 0;
        this.l = 0.0f;
        this.m = 0.0f;
        this.n = 0;
        this.o = 0;
        this.p = 0;
        this.q = 0;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public us9 e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            switch (iA) {
                case 0:
                    return this;
                case 8:
                    this.c = o34Var.B();
                    break;
                case 16:
                    this.d = o34Var.B();
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
                    this.f36083k = o34Var.B();
                    break;
                case 85:
                    this.l = o34Var.o();
                    break;
                case 93:
                    this.m = o34Var.o();
                    break;
                case 96:
                    this.n = o34Var.B();
                    break;
                case 104:
                    this.o = o34Var.B();
                    break;
                case 112:
                    this.p = o34Var.B();
                    break;
                case 120:
                    this.q = o34Var.B();
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
