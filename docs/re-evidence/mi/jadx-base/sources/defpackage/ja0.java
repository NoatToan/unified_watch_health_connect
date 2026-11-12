package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public final class ja0 extends ak8<ja0> {
    public int c;
    public String d;
    public String e;
    public String f;
    public int g;
    public byte[] h;
    public String i;

    public ja0() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b() + CodedOutputByteBufferNano.l(1, this.c) + CodedOutputByteBufferNano.v(2, this.d) + CodedOutputByteBufferNano.v(3, this.e) + CodedOutputByteBufferNano.v(4, this.f) + CodedOutputByteBufferNano.l(5, this.g);
        if (!Arrays.equals(this.h, bmr.h)) {
            iB += CodedOutputByteBufferNano.d(6, this.h);
        }
        return !this.i.equals("") ? iB + CodedOutputByteBufferNano.v(7, this.i) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.W(1, this.c);
        codedOutputByteBufferNano.m0(2, this.d);
        codedOutputByteBufferNano.m0(3, this.e);
        codedOutputByteBufferNano.m0(4, this.f);
        codedOutputByteBufferNano.W(5, this.g);
        if (!Arrays.equals(this.h, bmr.h)) {
            codedOutputByteBufferNano.O(6, this.h);
        }
        if (!this.i.equals("")) {
            codedOutputByteBufferNano.m0(7, this.i);
        }
        super.j(codedOutputByteBufferNano);
    }

    public ja0 m() {
        this.c = 1;
        this.d = "";
        this.e = "";
        this.f = "";
        this.g = 0;
        this.h = bmr.h;
        this.i = "";
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public ja0 e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 8) {
                int iP = o34Var.p();
                if (iP == 1 || iP == 2) {
                    this.c = iP;
                }
            } else if (iA == 18) {
                this.d = o34Var.z();
            } else if (iA == 26) {
                this.e = o34Var.z();
            } else if (iA == 34) {
                this.f = o34Var.z();
            } else if (iA == 40) {
                int iP2 = o34Var.p();
                if (iP2 == 0 || iP2 == 1 || iP2 == 2 || iP2 == 3) {
                    this.g = iP2;
                }
            } else if (iA == 50) {
                this.h = o34Var.l();
            } else if (iA == 58) {
                this.i = o34Var.z();
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
