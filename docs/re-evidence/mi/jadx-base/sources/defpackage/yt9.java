package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class yt9 extends ak8<yt9> {
    public int c;
    public long d;
    public String e;

    public yt9() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b() + CodedOutputByteBufferNano.y(1, this.c);
        long j = this.d;
        if (j != 0) {
            iB += CodedOutputByteBufferNano.A(2, j);
        }
        return !this.e.equals("") ? iB + CodedOutputByteBufferNano.v(3, this.e) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.p0(1, this.c);
        long j = this.d;
        if (j != 0) {
            codedOutputByteBufferNano.r0(2, j);
        }
        if (!this.e.equals("")) {
            codedOutputByteBufferNano.m0(3, this.e);
        }
        super.j(codedOutputByteBufferNano);
    }

    public yt9 m() {
        this.c = 0;
        this.d = 0L;
        this.e = "";
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public yt9 e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 8) {
                this.c = o34Var.B();
            } else if (iA == 16) {
                this.d = o34Var.C();
            } else if (iA == 26) {
                this.e = o34Var.z();
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
