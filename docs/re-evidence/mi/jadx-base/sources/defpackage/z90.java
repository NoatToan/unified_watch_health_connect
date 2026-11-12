package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class z90 extends ak8<z90> {
    public boolean c;
    public int d;
    public int e;

    public z90() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b() + CodedOutputByteBufferNano.b(1, this.c);
        int i = this.d;
        if (i != 0) {
            iB += CodedOutputByteBufferNano.y(2, i);
        }
        int i2 = this.e;
        return i2 != 0 ? iB + CodedOutputByteBufferNano.y(3, i2) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.M(1, this.c);
        int i = this.d;
        if (i != 0) {
            codedOutputByteBufferNano.p0(2, i);
        }
        int i2 = this.e;
        if (i2 != 0) {
            codedOutputByteBufferNano.p0(3, i2);
        }
        super.j(codedOutputByteBufferNano);
    }

    public z90 m() {
        this.c = false;
        this.d = 0;
        this.e = 0;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public z90 e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 8) {
                this.c = o34Var.k();
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
