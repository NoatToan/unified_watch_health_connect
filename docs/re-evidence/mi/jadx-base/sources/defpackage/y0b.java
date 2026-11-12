package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class y0b extends ak8<y0b> {
    public int c;
    public double d;
    public double e;
    public double f;

    public y0b() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b() + CodedOutputByteBufferNano.y(1, this.c) + CodedOutputByteBufferNano.f(2, this.d) + CodedOutputByteBufferNano.f(3, this.e);
        return Double.doubleToLongBits(this.f) != Double.doubleToLongBits(0.0d) ? iB + CodedOutputByteBufferNano.f(4, this.f) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.p0(1, this.c);
        codedOutputByteBufferNano.Q(2, this.d);
        codedOutputByteBufferNano.Q(3, this.e);
        if (Double.doubleToLongBits(this.f) != Double.doubleToLongBits(0.0d)) {
            codedOutputByteBufferNano.Q(4, this.f);
        }
        super.j(codedOutputByteBufferNano);
    }

    public y0b m() {
        this.c = 0;
        this.d = 0.0d;
        this.e = 0.0d;
        this.f = 0.0d;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public y0b e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 8) {
                this.c = o34Var.B();
            } else if (iA == 17) {
                this.d = o34Var.m();
            } else if (iA == 25) {
                this.e = o34Var.m();
            } else if (iA == 33) {
                this.f = o34Var.m();
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
