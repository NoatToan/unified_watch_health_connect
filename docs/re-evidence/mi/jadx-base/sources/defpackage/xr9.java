package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public final class xr9 extends ak8<xr9> {
    public int c;
    public float d;
    public int e;
    public int f;
    public int g;
    public boolean h;

    public xr9() {
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
            iB += CodedOutputByteBufferNano.y(4, i3);
        }
        int i4 = this.g;
        if (i4 != 0) {
            iB += CodedOutputByteBufferNano.y(5, i4);
        }
        boolean z = this.h;
        return z ? iB + CodedOutputByteBufferNano.b(6, z) : iB;
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
            codedOutputByteBufferNano.p0(4, i3);
        }
        int i4 = this.g;
        if (i4 != 0) {
            codedOutputByteBufferNano.p0(5, i4);
        }
        boolean z = this.h;
        if (z) {
            codedOutputByteBufferNano.M(6, z);
        }
        super.j(codedOutputByteBufferNano);
    }

    public xr9 m() {
        this.c = 0;
        this.d = 0.0f;
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.h = false;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public xr9 e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 8) {
                this.c = o34Var.B();
            } else if (iA == 21) {
                this.d = o34Var.o();
            } else if (iA == 24) {
                this.e = o34Var.B();
            } else if (iA == 32) {
                this.f = o34Var.B();
            } else if (iA == 40) {
                this.g = o34Var.B();
            } else if (iA == 48) {
                this.h = o34Var.k();
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
