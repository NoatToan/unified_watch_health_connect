package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class h9r extends ak8<h9r> {
    public String c;
    public String d;
    public String e;
    public String f;
    public boolean g;

    public h9r() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b() + CodedOutputByteBufferNano.v(1, this.c) + CodedOutputByteBufferNano.v(2, this.d) + CodedOutputByteBufferNano.v(3, this.e);
        if (!this.f.equals("")) {
            iB += CodedOutputByteBufferNano.v(4, this.f);
        }
        boolean z = this.g;
        return z ? iB + CodedOutputByteBufferNano.b(5, z) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.m0(1, this.c);
        codedOutputByteBufferNano.m0(2, this.d);
        codedOutputByteBufferNano.m0(3, this.e);
        if (!this.f.equals("")) {
            codedOutputByteBufferNano.m0(4, this.f);
        }
        boolean z = this.g;
        if (z) {
            codedOutputByteBufferNano.M(5, z);
        }
        super.j(codedOutputByteBufferNano);
    }

    public h9r m() {
        this.c = "";
        this.d = "";
        this.e = "";
        this.f = "";
        this.g = false;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public h9r e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 10) {
                this.c = o34Var.z();
            } else if (iA == 18) {
                this.d = o34Var.z();
            } else if (iA == 26) {
                this.e = o34Var.z();
            } else if (iA == 34) {
                this.f = o34Var.z();
            } else if (iA == 40) {
                this.g = o34Var.k();
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
