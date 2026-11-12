package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public final class ga0 extends ak8<ga0> {
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;

    public ga0() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b() + CodedOutputByteBufferNano.v(1, this.c) + CodedOutputByteBufferNano.v(2, this.d) + CodedOutputByteBufferNano.v(3, this.e) + CodedOutputByteBufferNano.v(4, this.f) + CodedOutputByteBufferNano.v(5, this.g);
        return !this.h.equals("") ? iB + CodedOutputByteBufferNano.v(6, this.h) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.m0(1, this.c);
        codedOutputByteBufferNano.m0(2, this.d);
        codedOutputByteBufferNano.m0(3, this.e);
        codedOutputByteBufferNano.m0(4, this.f);
        codedOutputByteBufferNano.m0(5, this.g);
        if (!this.h.equals("")) {
            codedOutputByteBufferNano.m0(6, this.h);
        }
        super.j(codedOutputByteBufferNano);
    }

    public ga0 m() {
        this.c = "";
        this.d = "";
        this.e = "";
        this.f = "";
        this.g = "";
        this.h = "";
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public ga0 e(o34 o34Var) throws IOException {
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
            } else if (iA == 42) {
                this.g = o34Var.z();
            } else if (iA == 50) {
                this.h = o34Var.z();
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
