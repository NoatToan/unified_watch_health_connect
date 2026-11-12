package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class odd extends ak8<odd> {
    public int c;
    public String d;

    public odd() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b() + CodedOutputByteBufferNano.l(1, this.c);
        return !this.d.equals("") ? iB + CodedOutputByteBufferNano.v(2, this.d) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.W(1, this.c);
        if (!this.d.equals("")) {
            codedOutputByteBufferNano.m0(2, this.d);
        }
        super.j(codedOutputByteBufferNano);
    }

    public odd m() {
        this.c = 0;
        this.d = "";
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public odd e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 8) {
                this.c = o34Var.p();
            } else if (iA == 18) {
                this.d = o34Var.z();
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
