package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public final class gx7 extends ak8<gx7> {
    public fx7 c;
    public int d;

    public gx7() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b();
        fx7 fx7Var = this.c;
        if (fx7Var != null) {
            iB += CodedOutputByteBufferNano.n(1, fx7Var);
        }
        int i = this.d;
        return i != 0 ? iB + CodedOutputByteBufferNano.y(2, i) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        fx7 fx7Var = this.c;
        if (fx7Var != null) {
            codedOutputByteBufferNano.Y(1, fx7Var);
        }
        int i = this.d;
        if (i != 0) {
            codedOutputByteBufferNano.p0(2, i);
        }
        super.j(codedOutputByteBufferNano);
    }

    public gx7 m() {
        this.c = null;
        this.d = 0;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public gx7 e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 10) {
                if (this.c == null) {
                    this.c = new fx7();
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
