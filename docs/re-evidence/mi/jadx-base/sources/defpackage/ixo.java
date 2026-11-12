package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class ixo extends ak8<ixo> {
    public boolean c;
    public int d;
    public String e;
    public String f;
    public String g;
    public int h;
    public String i;

    public ixo() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b() + CodedOutputByteBufferNano.b(1, this.c) + CodedOutputByteBufferNano.l(2, this.d) + CodedOutputByteBufferNano.v(3, this.e);
        if (!this.f.equals("")) {
            iB += CodedOutputByteBufferNano.v(4, this.f);
        }
        if (!this.g.equals("")) {
            iB += CodedOutputByteBufferNano.v(5, this.g);
        }
        if (!this.i.equals("")) {
            iB += CodedOutputByteBufferNano.v(6, this.i);
        }
        int i = this.h;
        return i != 0 ? iB + CodedOutputByteBufferNano.y(7, i) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.M(1, this.c);
        codedOutputByteBufferNano.W(2, this.d);
        codedOutputByteBufferNano.m0(3, this.e);
        if (!this.f.equals("")) {
            codedOutputByteBufferNano.m0(4, this.f);
        }
        if (!this.g.equals("")) {
            codedOutputByteBufferNano.m0(5, this.g);
        }
        if (!this.i.equals("")) {
            codedOutputByteBufferNano.m0(6, this.i);
        }
        int i = this.h;
        if (i != 0) {
            codedOutputByteBufferNano.p0(7, i);
        }
        super.j(codedOutputByteBufferNano);
    }

    public ixo m() {
        this.c = false;
        this.d = 0;
        this.e = "";
        this.f = "";
        this.g = "";
        this.h = 0;
        this.i = "";
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public ixo e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 8) {
                this.c = o34Var.k();
            } else if (iA == 16) {
                int iP = o34Var.p();
                if (iP == 0 || iP == 1 || iP == 2 || iP == 15) {
                    this.d = iP;
                }
            } else if (iA == 26) {
                this.e = o34Var.z();
            } else if (iA == 34) {
                this.f = o34Var.z();
            } else if (iA == 42) {
                this.g = o34Var.z();
            } else if (iA == 50) {
                this.i = o34Var.z();
            } else if (iA == 56) {
                this.h = o34Var.B();
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
