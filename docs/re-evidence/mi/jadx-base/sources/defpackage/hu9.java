package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class hu9 extends ak8<hu9> {
    public int c;
    public ju9 d;
    public int e;
    public int f;
    public int g;
    public byte[] h;
    public au9 i;

    public hu9() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b() + CodedOutputByteBufferNano.l(1, this.c);
        if (!Arrays.equals(this.h, bmr.h)) {
            iB += CodedOutputByteBufferNano.d(2, this.h);
        }
        ju9 ju9Var = this.d;
        if (ju9Var != null) {
            iB += CodedOutputByteBufferNano.n(3, ju9Var);
        }
        int i = this.f;
        if (i != 0) {
            iB += CodedOutputByteBufferNano.l(4, i);
        }
        int i2 = this.g;
        if (i2 != 0) {
            iB += CodedOutputByteBufferNano.y(5, i2);
        }
        int i3 = this.e;
        if (i3 != 0) {
            iB += CodedOutputByteBufferNano.l(6, i3);
        }
        au9 au9Var = this.i;
        return au9Var != null ? iB + CodedOutputByteBufferNano.n(7, au9Var) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.W(1, this.c);
        if (!Arrays.equals(this.h, bmr.h)) {
            codedOutputByteBufferNano.O(2, this.h);
        }
        ju9 ju9Var = this.d;
        if (ju9Var != null) {
            codedOutputByteBufferNano.Y(3, ju9Var);
        }
        int i = this.f;
        if (i != 0) {
            codedOutputByteBufferNano.W(4, i);
        }
        int i2 = this.g;
        if (i2 != 0) {
            codedOutputByteBufferNano.p0(5, i2);
        }
        int i3 = this.e;
        if (i3 != 0) {
            codedOutputByteBufferNano.W(6, i3);
        }
        au9 au9Var = this.i;
        if (au9Var != null) {
            codedOutputByteBufferNano.Y(7, au9Var);
        }
        super.j(codedOutputByteBufferNano);
    }

    public hu9 m() {
        this.c = 0;
        this.d = null;
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.h = bmr.h;
        this.i = null;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public hu9 e(o34 o34Var) throws IOException {
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
                    case 9:
                    case 10:
                        this.c = iP;
                        break;
                }
            } else if (iA == 18) {
                this.h = o34Var.l();
            } else if (iA == 26) {
                if (this.d == null) {
                    this.d = new ju9();
                }
                o34Var.q(this.d);
            } else if (iA == 32) {
                int iP2 = o34Var.p();
                if (iP2 == 0 || iP2 == 1 || iP2 == 2 || iP2 == 10) {
                    this.f = iP2;
                }
            } else if (iA == 40) {
                this.g = o34Var.B();
            } else if (iA == 48) {
                int iP3 = o34Var.p();
                if (iP3 == 0 || iP3 == 1 || iP3 == 2 || iP3 == 3) {
                    this.e = iP3;
                }
            } else if (iA == 58) {
                if (this.i == null) {
                    this.i = new au9();
                }
                o34Var.q(this.i);
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
