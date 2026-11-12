package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class zbp extends ak8<zbp> {
    public int c = 0;
    public Object d;
    public int e;

    public zbp() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b() + CodedOutputByteBufferNano.l(1, this.e);
        if (this.c == 2) {
            iB += CodedOutputByteBufferNano.v(2, (String) this.d);
        }
        return this.c == 3 ? iB + CodedOutputByteBufferNano.n(3, (dsf) this.d) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.W(1, this.e);
        if (this.c == 2) {
            codedOutputByteBufferNano.m0(2, (String) this.d);
        }
        if (this.c == 3) {
            codedOutputByteBufferNano.Y(3, (dsf) this.d);
        }
        super.j(codedOutputByteBufferNano);
    }

    public zbp m() {
        this.e = 0;
        n();
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    public zbp n() {
        this.c = 0;
        this.d = null;
        return this;
    }

    public acp o() {
        if (this.c == 3) {
            return (acp) this.d;
        }
        return null;
    }

    public String p() {
        return this.c == 2 ? (String) this.d : "";
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public zbp e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 8) {
                int iP = o34Var.p();
                if (iP == 0 || iP == 1 || iP == 2) {
                    this.e = iP;
                }
            } else if (iA == 18) {
                this.d = o34Var.z();
                this.c = 2;
            } else if (iA == 26) {
                if (this.c != 3) {
                    this.d = new acp();
                }
                o34Var.q((dsf) this.d);
                this.c = 3;
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
