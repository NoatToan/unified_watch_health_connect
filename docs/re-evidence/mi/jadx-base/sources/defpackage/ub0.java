package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public final class ub0 extends ak8<ub0> {
    public boolean c;
    public byte[] d;

    public ub0() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b() + CodedOutputByteBufferNano.b(1, this.c);
        return !Arrays.equals(this.d, bmr.h) ? iB + CodedOutputByteBufferNano.d(2, this.d) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.M(1, this.c);
        if (!Arrays.equals(this.d, bmr.h)) {
            codedOutputByteBufferNano.O(2, this.d);
        }
        super.j(codedOutputByteBufferNano);
    }

    public ub0 m() {
        this.c = false;
        this.d = bmr.h;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public ub0 e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 8) {
                this.c = o34Var.k();
            } else if (iA == 18) {
                this.d = o34Var.l();
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
