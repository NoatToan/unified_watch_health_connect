package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class sxo extends ak8<sxo> {
    public long c;
    public long d;

    public sxo() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        return super.b() + CodedOutputByteBufferNano.A(1, this.c) + CodedOutputByteBufferNano.A(2, this.d);
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.r0(1, this.c);
        codedOutputByteBufferNano.r0(2, this.d);
        super.j(codedOutputByteBufferNano);
    }

    public sxo m() {
        this.c = 0L;
        this.d = 0L;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public sxo e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 8) {
                this.c = o34Var.C();
            } else if (iA == 16) {
                this.d = o34Var.C();
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
