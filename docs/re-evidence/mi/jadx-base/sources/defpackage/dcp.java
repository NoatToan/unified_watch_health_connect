package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class dcp extends ak8<dcp> {
    public long c;
    public float d;
    public int e;
    public boolean f;

    public dcp() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b() + CodedOutputByteBufferNano.A(1, this.c) + CodedOutputByteBufferNano.j(2, this.d) + CodedOutputByteBufferNano.y(3, this.e);
        boolean z = this.f;
        return z ? iB + CodedOutputByteBufferNano.b(4, z) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.r0(1, this.c);
        codedOutputByteBufferNano.U(2, this.d);
        codedOutputByteBufferNano.p0(3, this.e);
        boolean z = this.f;
        if (z) {
            codedOutputByteBufferNano.M(4, z);
        }
        super.j(codedOutputByteBufferNano);
    }

    public dcp m() {
        this.c = 0L;
        this.d = 0.0f;
        this.e = 0;
        this.f = false;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public dcp e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 8) {
                this.c = o34Var.C();
            } else if (iA == 21) {
                this.d = o34Var.o();
            } else if (iA == 24) {
                this.e = o34Var.B();
            } else if (iA == 32) {
                this.f = o34Var.k();
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
