package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class ykf extends ak8<ykf> {
    public int c;
    public int d;
    public String e;
    public String f;
    public String g;
    public int h;
    public int i;

    public ykf() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b() + CodedOutputByteBufferNano.l(1, this.c);
        int i = this.d;
        if (i != 0) {
            iB += CodedOutputByteBufferNano.y(2, i);
        }
        if (!this.e.equals("")) {
            iB += CodedOutputByteBufferNano.v(3, this.e);
        }
        if (!this.f.equals("")) {
            iB += CodedOutputByteBufferNano.v(4, this.f);
        }
        if (!this.g.equals("")) {
            iB += CodedOutputByteBufferNano.v(5, this.g);
        }
        int i2 = this.h;
        if (i2 != 0) {
            iB += CodedOutputByteBufferNano.y(6, i2);
        }
        int i3 = this.i;
        return i3 != 0 ? iB + CodedOutputByteBufferNano.y(7, i3) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.W(1, this.c);
        int i = this.d;
        if (i != 0) {
            codedOutputByteBufferNano.p0(2, i);
        }
        if (!this.e.equals("")) {
            codedOutputByteBufferNano.m0(3, this.e);
        }
        if (!this.f.equals("")) {
            codedOutputByteBufferNano.m0(4, this.f);
        }
        if (!this.g.equals("")) {
            codedOutputByteBufferNano.m0(5, this.g);
        }
        int i2 = this.h;
        if (i2 != 0) {
            codedOutputByteBufferNano.p0(6, i2);
        }
        int i3 = this.i;
        if (i3 != 0) {
            codedOutputByteBufferNano.p0(7, i3);
        }
        super.j(codedOutputByteBufferNano);
    }

    public ykf m() {
        this.c = 0;
        this.d = 0;
        this.e = "";
        this.f = "";
        this.g = "";
        this.h = 0;
        this.i = 0;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public ykf e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 8) {
                int iP = o34Var.p();
                if (iP == 0 || iP == 1 || iP == 2 || iP == 3 || iP == 10) {
                    this.c = iP;
                }
            } else if (iA == 16) {
                this.d = o34Var.B();
            } else if (iA == 26) {
                this.e = o34Var.z();
            } else if (iA == 34) {
                this.f = o34Var.z();
            } else if (iA == 42) {
                this.g = o34Var.z();
            } else if (iA == 48) {
                this.h = o34Var.B();
            } else if (iA == 56) {
                this.i = o34Var.B();
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
