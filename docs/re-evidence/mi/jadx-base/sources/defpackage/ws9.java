package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public final class ws9 extends ak8<ws9> {
    public int c;
    public int d;
    public double e;
    public double f;
    public double g;
    public float h;
    public float i;
    public float j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f38307k;

    public ws9() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b() + CodedOutputByteBufferNano.l(1, this.c) + CodedOutputByteBufferNano.y(2, this.d) + CodedOutputByteBufferNano.f(3, this.e) + CodedOutputByteBufferNano.f(4, this.f);
        if (Double.doubleToLongBits(this.g) != Double.doubleToLongBits(0.0d)) {
            iB += CodedOutputByteBufferNano.f(5, this.g);
        }
        if (Float.floatToIntBits(this.h) != Float.floatToIntBits(0.0f)) {
            iB += CodedOutputByteBufferNano.j(6, this.h);
        }
        if (Float.floatToIntBits(this.i) != Float.floatToIntBits(0.0f)) {
            iB += CodedOutputByteBufferNano.j(7, this.i);
        }
        if (Float.floatToIntBits(this.j) != Float.floatToIntBits(0.0f)) {
            iB += CodedOutputByteBufferNano.j(8, this.j);
        }
        return Float.floatToIntBits(this.f38307k) != Float.floatToIntBits(0.0f) ? iB + CodedOutputByteBufferNano.j(9, this.f38307k) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.W(1, this.c);
        codedOutputByteBufferNano.p0(2, this.d);
        codedOutputByteBufferNano.Q(3, this.e);
        codedOutputByteBufferNano.Q(4, this.f);
        if (Double.doubleToLongBits(this.g) != Double.doubleToLongBits(0.0d)) {
            codedOutputByteBufferNano.Q(5, this.g);
        }
        if (Float.floatToIntBits(this.h) != Float.floatToIntBits(0.0f)) {
            codedOutputByteBufferNano.U(6, this.h);
        }
        if (Float.floatToIntBits(this.i) != Float.floatToIntBits(0.0f)) {
            codedOutputByteBufferNano.U(7, this.i);
        }
        if (Float.floatToIntBits(this.j) != Float.floatToIntBits(0.0f)) {
            codedOutputByteBufferNano.U(8, this.j);
        }
        if (Float.floatToIntBits(this.f38307k) != Float.floatToIntBits(0.0f)) {
            codedOutputByteBufferNano.U(9, this.f38307k);
        }
        super.j(codedOutputByteBufferNano);
    }

    public ws9 m() {
        this.c = 0;
        this.d = 0;
        this.e = 0.0d;
        this.f = 0.0d;
        this.g = 0.0d;
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = 0.0f;
        this.f38307k = 0.0f;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public ws9 e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 8) {
                int iP = o34Var.p();
                if (iP == 0 || iP == 1 || iP == 2 || iP == 10) {
                    this.c = iP;
                }
            } else if (iA == 16) {
                this.d = o34Var.B();
            } else if (iA == 25) {
                this.e = o34Var.m();
            } else if (iA == 33) {
                this.f = o34Var.m();
            } else if (iA == 41) {
                this.g = o34Var.m();
            } else if (iA == 53) {
                this.h = o34Var.o();
            } else if (iA == 61) {
                this.i = o34Var.o();
            } else if (iA == 69) {
                this.j = o34Var.o();
            } else if (iA == 77) {
                this.f38307k = o34Var.o();
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
