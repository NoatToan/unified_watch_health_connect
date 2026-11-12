package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class w11 extends ak8<w11> {
    public z01.a c;
    public boolean d;
    public boolean e;

    public w11() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b();
        z01.a aVar = this.c;
        if (aVar != null) {
            iB += CodedOutputByteBufferNano.n(1, aVar);
        }
        return iB + CodedOutputByteBufferNano.b(2, this.d) + CodedOutputByteBufferNano.b(3, this.e);
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        z01.a aVar = this.c;
        if (aVar != null) {
            codedOutputByteBufferNano.Y(1, aVar);
        }
        codedOutputByteBufferNano.M(2, this.d);
        codedOutputByteBufferNano.M(3, this.e);
        super.j(codedOutputByteBufferNano);
    }

    public w11 m() {
        this.c = null;
        this.d = false;
        this.e = false;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public w11 e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 10) {
                if (this.c == null) {
                    this.c = new z01.a();
                }
                o34Var.q(this.c);
            } else if (iA == 16) {
                this.d = o34Var.k();
            } else if (iA == 24) {
                this.e = o34Var.k();
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
