package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class y69 extends ak8<y69> {
    public String c;
    public boolean d;
    public byte[] e;

    public y69() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        return super.b() + CodedOutputByteBufferNano.v(1, this.c) + CodedOutputByteBufferNano.b(2, this.d) + CodedOutputByteBufferNano.d(3, this.e);
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.m0(1, this.c);
        codedOutputByteBufferNano.M(2, this.d);
        codedOutputByteBufferNano.O(3, this.e);
        super.j(codedOutputByteBufferNano);
    }

    public y69 m() {
        this.c = "";
        this.d = false;
        this.e = bmr.h;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public y69 e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 10) {
                this.c = o34Var.z();
            } else if (iA == 16) {
                this.d = o34Var.k();
            } else if (iA == 26) {
                this.e = o34Var.l();
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
