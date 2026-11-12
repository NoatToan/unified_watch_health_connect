package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class wxg extends ak8<wxg> {
    public int c = 0;
    public Object d;
    public int e;
    public String f;
    public boolean g;

    public wxg() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b() + CodedOutputByteBufferNano.l(1, this.e) + CodedOutputByteBufferNano.v(2, this.f) + CodedOutputByteBufferNano.b(3, this.g);
        if (this.c == 4) {
            iB += CodedOutputByteBufferNano.v(4, (String) this.d);
        }
        return this.c == 5 ? iB + CodedOutputByteBufferNano.n(5, (dsf) this.d) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.W(1, this.e);
        codedOutputByteBufferNano.m0(2, this.f);
        codedOutputByteBufferNano.M(3, this.g);
        if (this.c == 4) {
            codedOutputByteBufferNano.m0(4, (String) this.d);
        }
        if (this.c == 5) {
            codedOutputByteBufferNano.Y(5, (dsf) this.d);
        }
        super.j(codedOutputByteBufferNano);
    }

    public wxg m() {
        this.e = 1;
        this.f = "";
        this.g = false;
        n();
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    public wxg n() {
        this.c = 0;
        this.d = null;
        return this;
    }

    public String o() {
        return this.c == 4 ? (String) this.d : "";
    }

    public boolean p() {
        return this.c == 4;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public wxg e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 8) {
                int iP = o34Var.p();
                if (iP == 1 || iP == 2) {
                    this.e = iP;
                }
            } else if (iA == 18) {
                this.f = o34Var.z();
            } else if (iA == 24) {
                this.g = o34Var.k();
            } else if (iA == 34) {
                this.d = o34Var.z();
                this.c = 4;
            } else if (iA == 42) {
                if (this.c != 5) {
                    this.d = new sxg();
                }
                o34Var.q((dsf) this.d);
                this.c = 5;
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
