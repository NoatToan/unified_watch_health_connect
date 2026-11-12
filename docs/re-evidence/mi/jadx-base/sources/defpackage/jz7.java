package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public final class jz7 extends ak8<jz7> {
    public int c;
    public String d;

    public jz7() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        return super.b() + CodedOutputByteBufferNano.y(1, this.c) + CodedOutputByteBufferNano.v(2, this.d);
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.p0(1, this.c);
        codedOutputByteBufferNano.m0(2, this.d);
        super.j(codedOutputByteBufferNano);
    }

    public jz7 m() {
        this.c = 0;
        this.d = "";
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public jz7 e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 8) {
                this.c = o34Var.B();
            } else if (iA == 18) {
                this.d = o34Var.z();
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
