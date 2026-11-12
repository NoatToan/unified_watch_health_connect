package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public final class uu9 extends ak8<uu9> {
    public int c;
    public float d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public float j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f36152k;
    public int l;
    public int m;

    public uu9() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b();
        int i = this.c;
        if (i != 0) {
            iB += CodedOutputByteBufferNano.y(1, i);
        }
        if (Float.floatToIntBits(this.d) != Float.floatToIntBits(0.0f)) {
            iB += CodedOutputByteBufferNano.j(2, this.d);
        }
        int i2 = this.e;
        if (i2 != 0) {
            iB += CodedOutputByteBufferNano.y(3, i2);
        }
        int i3 = this.f;
        if (i3 != 0) {
            iB += CodedOutputByteBufferNano.l(4, i3);
        }
        int i4 = this.g;
        if (i4 != 0) {
            iB += CodedOutputByteBufferNano.y(5, i4);
        }
        int i5 = this.h;
        if (i5 != 0) {
            iB += CodedOutputByteBufferNano.y(6, i5);
        }
        int i6 = this.i;
        if (i6 != 0) {
            iB += CodedOutputByteBufferNano.y(7, i6);
        }
        if (Float.floatToIntBits(this.j) != Float.floatToIntBits(0.0f)) {
            iB += CodedOutputByteBufferNano.j(8, this.j);
        }
        int i7 = this.f36152k;
        if (i7 != 0) {
            iB += CodedOutputByteBufferNano.y(9, i7);
        }
        int i8 = this.l;
        if (i8 != 0) {
            iB += CodedOutputByteBufferNano.y(10, i8);
        }
        int i9 = this.m;
        return i9 != 0 ? iB + CodedOutputByteBufferNano.y(11, i9) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i = this.c;
        if (i != 0) {
            codedOutputByteBufferNano.p0(1, i);
        }
        if (Float.floatToIntBits(this.d) != Float.floatToIntBits(0.0f)) {
            codedOutputByteBufferNano.U(2, this.d);
        }
        int i2 = this.e;
        if (i2 != 0) {
            codedOutputByteBufferNano.p0(3, i2);
        }
        int i3 = this.f;
        if (i3 != 0) {
            codedOutputByteBufferNano.W(4, i3);
        }
        int i4 = this.g;
        if (i4 != 0) {
            codedOutputByteBufferNano.p0(5, i4);
        }
        int i5 = this.h;
        if (i5 != 0) {
            codedOutputByteBufferNano.p0(6, i5);
        }
        int i6 = this.i;
        if (i6 != 0) {
            codedOutputByteBufferNano.p0(7, i6);
        }
        if (Float.floatToIntBits(this.j) != Float.floatToIntBits(0.0f)) {
            codedOutputByteBufferNano.U(8, this.j);
        }
        int i7 = this.f36152k;
        if (i7 != 0) {
            codedOutputByteBufferNano.p0(9, i7);
        }
        int i8 = this.l;
        if (i8 != 0) {
            codedOutputByteBufferNano.p0(10, i8);
        }
        int i9 = this.m;
        if (i9 != 0) {
            codedOutputByteBufferNano.p0(11, i9);
        }
        super.j(codedOutputByteBufferNano);
    }

    public uu9 m() {
        this.c = 0;
        this.d = 0.0f;
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.h = 0;
        this.i = 0;
        this.j = 0.0f;
        this.f36152k = 0;
        this.l = 0;
        this.m = 0;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public uu9 e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            switch (iA) {
                case 0:
                    return this;
                case 8:
                    this.c = o34Var.B();
                    break;
                case 21:
                    this.d = o34Var.o();
                    break;
                case 24:
                    this.e = o34Var.B();
                    break;
                case 32:
                    int iP = o34Var.p();
                    if (iP == 0 || iP == 1 || iP == 2) {
                        this.f = iP;
                    }
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
                case 69:
                    this.j = o34Var.o();
                    break;
                case 72:
                    this.f36152k = o34Var.B();
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
