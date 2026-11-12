package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public final class kc0 extends ak8<kc0> {
    public jc0 c;
    public int d;

    public kc0() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b();
        jc0 jc0Var = this.c;
        if (jc0Var != null) {
            iB += CodedOutputByteBufferNano.n(1, jc0Var);
        }
        return iB + CodedOutputByteBufferNano.y(2, this.d);
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        jc0 jc0Var = this.c;
        if (jc0Var != null) {
            codedOutputByteBufferNano.Y(1, jc0Var);
        }
        codedOutputByteBufferNano.p0(2, this.d);
        super.j(codedOutputByteBufferNano);
    }

    public kc0 m() {
        this.c = null;
        this.d = 0;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public kc0 e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 10) {
                if (this.c == null) {
                    this.c = new jc0();
                }
                o34Var.q(this.c);
            } else if (iA == 16) {
                this.d = o34Var.B();
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
