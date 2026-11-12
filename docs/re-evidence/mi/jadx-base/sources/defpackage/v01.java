package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class v01 extends ak8<v01> {
    public String c;
    public int d;
    public String e;
    public int f;
    public String g;
    public String h;
    public String i;

    public v01() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b() + CodedOutputByteBufferNano.v(1, this.c) + CodedOutputByteBufferNano.l(2, this.d) + CodedOutputByteBufferNano.v(3, this.e);
        int i = this.f;
        if (i != -1) {
            iB += CodedOutputByteBufferNano.l(4, i);
        }
        if (!this.g.equals("")) {
            iB += CodedOutputByteBufferNano.v(5, this.g);
        }
        if (!this.h.equals("")) {
            iB += CodedOutputByteBufferNano.v(6, this.h);
        }
        return !this.i.equals("") ? iB + CodedOutputByteBufferNano.v(7, this.i) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.m0(1, this.c);
        codedOutputByteBufferNano.W(2, this.d);
        codedOutputByteBufferNano.m0(3, this.e);
        int i = this.f;
        if (i != -1) {
            codedOutputByteBufferNano.W(4, i);
        }
        if (!this.g.equals("")) {
            codedOutputByteBufferNano.m0(5, this.g);
        }
        if (!this.h.equals("")) {
            codedOutputByteBufferNano.m0(6, this.h);
        }
        if (!this.i.equals("")) {
            codedOutputByteBufferNano.m0(7, this.i);
        }
        super.j(codedOutputByteBufferNano);
    }

    public v01 m() {
        this.c = "";
        this.d = -1;
        this.e = "";
        this.f = -1;
        this.g = "";
        this.h = "";
        this.i = "";
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public v01 e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 10) {
                this.c = o34Var.z();
            } else if (iA == 16) {
                int iP = o34Var.p();
                if (iP == -1 || iP == 0 || iP == 1 || iP == 2) {
                    this.d = iP;
                }
            } else if (iA == 26) {
                this.e = o34Var.z();
            } else if (iA == 32) {
                int iP2 = o34Var.p();
                switch (iP2) {
                    case -1:
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        this.f = iP2;
                        break;
                }
            } else if (iA == 42) {
                this.g = o34Var.z();
            } else if (iA == 50) {
                this.h = o34Var.z();
            } else if (iA == 58) {
                this.i = o34Var.z();
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
