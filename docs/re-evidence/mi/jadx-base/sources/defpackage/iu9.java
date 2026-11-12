package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public final class iu9 extends ak8<iu9> {
    public int c;
    public byte[] d;
    public ku9 e;
    public int f;
    public int g;

    public iu9() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b() + CodedOutputByteBufferNano.l(1, this.c);
        if (!Arrays.equals(this.d, bmr.h)) {
            iB += CodedOutputByteBufferNano.d(2, this.d);
        }
        ku9 ku9Var = this.e;
        if (ku9Var != null) {
            iB += CodedOutputByteBufferNano.n(3, ku9Var);
        }
        int i = this.f;
        if (i != 0) {
            iB += CodedOutputByteBufferNano.l(4, i);
        }
        int i2 = this.g;
        return i2 != 0 ? iB + CodedOutputByteBufferNano.y(5, i2) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.W(1, this.c);
        if (!Arrays.equals(this.d, bmr.h)) {
            codedOutputByteBufferNano.O(2, this.d);
        }
        ku9 ku9Var = this.e;
        if (ku9Var != null) {
            codedOutputByteBufferNano.Y(3, ku9Var);
        }
        int i = this.f;
        if (i != 0) {
            codedOutputByteBufferNano.W(4, i);
        }
        int i2 = this.g;
        if (i2 != 0) {
            codedOutputByteBufferNano.p0(5, i2);
        }
        super.j(codedOutputByteBufferNano);
    }

    public iu9 m() {
        this.c = 0;
        this.d = bmr.h;
        this.e = null;
        this.f = 0;
        this.g = 0;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public iu9 e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 8) {
                int iP = o34Var.p();
                switch (iP) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 10:
                        this.c = iP;
                        break;
                }
            } else if (iA == 18) {
                this.d = o34Var.l();
            } else if (iA == 26) {
                if (this.e == null) {
                    this.e = new ku9();
                }
                o34Var.q(this.e);
            } else if (iA == 32) {
                int iP2 = o34Var.p();
                if (iP2 == 0 || iP2 == 1 || iP2 == 2 || iP2 == 10) {
                    this.f = iP2;
                }
            } else if (iA == 40) {
                this.g = o34Var.B();
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
