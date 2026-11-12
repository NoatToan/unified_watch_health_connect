package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class y11 extends ak8<y11> {
    public f21 c;
    public String d;
    public l01.a e;
    public String f;

    public y11() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b();
        f21 f21Var = this.c;
        if (f21Var != null) {
            iB += CodedOutputByteBufferNano.n(1, f21Var);
        }
        int iV = iB + CodedOutputByteBufferNano.v(2, this.d);
        l01.a aVar = this.e;
        if (aVar != null) {
            iV += CodedOutputByteBufferNano.n(3, aVar);
        }
        return iV + CodedOutputByteBufferNano.v(4, this.f);
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        f21 f21Var = this.c;
        if (f21Var != null) {
            codedOutputByteBufferNano.Y(1, f21Var);
        }
        codedOutputByteBufferNano.m0(2, this.d);
        l01.a aVar = this.e;
        if (aVar != null) {
            codedOutputByteBufferNano.Y(3, aVar);
        }
        codedOutputByteBufferNano.m0(4, this.f);
        super.j(codedOutputByteBufferNano);
    }

    public y11 m() {
        this.c = null;
        this.d = "";
        this.e = null;
        this.f = "";
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public y11 e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 10) {
                if (this.c == null) {
                    this.c = new f21();
                }
                o34Var.q(this.c);
            } else if (iA == 18) {
                this.d = o34Var.z();
            } else if (iA == 26) {
                if (this.e == null) {
                    this.e = new l01.a();
                }
                o34Var.q(this.e);
            } else if (iA == 34) {
                this.f = o34Var.z();
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
