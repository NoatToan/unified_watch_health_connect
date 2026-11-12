package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class bsg extends ak8<bsg> {
    public int c;
    public int d;
    public boolean e;
    public String f;
    public String g;

    public bsg() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b() + CodedOutputByteBufferNano.l(1, this.c);
        int i = this.d;
        if (i != 0) {
            iB += CodedOutputByteBufferNano.l(2, i);
        }
        boolean z = this.e;
        if (z) {
            iB += CodedOutputByteBufferNano.b(3, z);
        }
        if (!this.f.equals("")) {
            iB += CodedOutputByteBufferNano.v(4, this.f);
        }
        return !this.g.equals("") ? iB + CodedOutputByteBufferNano.v(5, this.g) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.W(1, this.c);
        int i = this.d;
        if (i != 0) {
            codedOutputByteBufferNano.W(2, i);
        }
        boolean z = this.e;
        if (z) {
            codedOutputByteBufferNano.M(3, z);
        }
        if (!this.f.equals("")) {
            codedOutputByteBufferNano.m0(4, this.f);
        }
        if (!this.g.equals("")) {
            codedOutputByteBufferNano.m0(5, this.g);
        }
        super.j(codedOutputByteBufferNano);
    }

    public bsg m() {
        this.c = 0;
        this.d = 0;
        this.e = false;
        this.f = "";
        this.g = "";
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public bsg e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 8) {
                int iP = o34Var.p();
                if (iP == 0 || iP == 1 || iP == 2 || iP == 3) {
                    this.c = iP;
                }
            } else if (iA == 16) {
                int iP2 = o34Var.p();
                switch (iP2) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        this.d = iP2;
                        break;
                }
            } else if (iA == 24) {
                this.e = o34Var.k();
            } else if (iA == 34) {
                this.f = o34Var.z();
            } else if (iA == 42) {
                this.g = o34Var.z();
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
