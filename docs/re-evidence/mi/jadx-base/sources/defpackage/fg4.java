package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class fg4 extends ak8<fg4> {
    public boolean c;
    public boolean d;
    public eg4 e;
    public eg4[] f;
    public int g;
    public int h;
    public boolean i;
    public int j;

    public fg4() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b() + CodedOutputByteBufferNano.b(1, this.c);
        eg4 eg4Var = this.e;
        if (eg4Var != null) {
            iB += CodedOutputByteBufferNano.n(2, eg4Var);
        }
        boolean z = this.d;
        if (z) {
            iB += CodedOutputByteBufferNano.b(3, z);
        }
        eg4[] eg4VarArr = this.f;
        if (eg4VarArr != null && eg4VarArr.length > 0) {
            int i = 0;
            while (true) {
                eg4[] eg4VarArr2 = this.f;
                if (i >= eg4VarArr2.length) {
                    break;
                }
                eg4 eg4Var2 = eg4VarArr2[i];
                if (eg4Var2 != null) {
                    iB += CodedOutputByteBufferNano.n(4, eg4Var2);
                }
                i++;
            }
        }
        int i2 = this.h;
        if (i2 != 0) {
            iB += CodedOutputByteBufferNano.l(5, i2);
        }
        boolean z2 = this.i;
        if (z2) {
            iB += CodedOutputByteBufferNano.b(6, z2);
        }
        int i3 = this.g;
        if (i3 != 0) {
            iB += CodedOutputByteBufferNano.l(7, i3);
        }
        int i4 = this.j;
        return i4 != 0 ? iB + CodedOutputByteBufferNano.l(8, i4) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.M(1, this.c);
        eg4 eg4Var = this.e;
        if (eg4Var != null) {
            codedOutputByteBufferNano.Y(2, eg4Var);
        }
        boolean z = this.d;
        if (z) {
            codedOutputByteBufferNano.M(3, z);
        }
        eg4[] eg4VarArr = this.f;
        if (eg4VarArr != null && eg4VarArr.length > 0) {
            int i = 0;
            while (true) {
                eg4[] eg4VarArr2 = this.f;
                if (i >= eg4VarArr2.length) {
                    break;
                }
                eg4 eg4Var2 = eg4VarArr2[i];
                if (eg4Var2 != null) {
                    codedOutputByteBufferNano.Y(4, eg4Var2);
                }
                i++;
            }
        }
        int i2 = this.h;
        if (i2 != 0) {
            codedOutputByteBufferNano.W(5, i2);
        }
        boolean z2 = this.i;
        if (z2) {
            codedOutputByteBufferNano.M(6, z2);
        }
        int i3 = this.g;
        if (i3 != 0) {
            codedOutputByteBufferNano.W(7, i3);
        }
        int i4 = this.j;
        if (i4 != 0) {
            codedOutputByteBufferNano.W(8, i4);
        }
        super.j(codedOutputByteBufferNano);
    }

    public fg4 m() {
        this.c = false;
        this.d = false;
        this.e = null;
        this.f = eg4.n();
        this.g = 0;
        this.h = 0;
        this.i = false;
        this.j = 0;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public fg4 e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 8) {
                this.c = o34Var.k();
            } else if (iA == 18) {
                if (this.e == null) {
                    this.e = new eg4();
                }
                o34Var.q(this.e);
            } else if (iA == 24) {
                this.d = o34Var.k();
            } else if (iA == 34) {
                int iA2 = bmr.a(o34Var, 34);
                eg4[] eg4VarArr = this.f;
                int length = eg4VarArr == null ? 0 : eg4VarArr.length;
                int i = iA2 + length;
                eg4[] eg4VarArr2 = new eg4[i];
                if (length != 0) {
                    System.arraycopy(eg4VarArr, 0, eg4VarArr2, 0, length);
                }
                while (length < i - 1) {
                    eg4 eg4Var = new eg4();
                    eg4VarArr2[length] = eg4Var;
                    o34Var.q(eg4Var);
                    o34Var.A();
                    length++;
                }
                eg4 eg4Var2 = new eg4();
                eg4VarArr2[length] = eg4Var2;
                o34Var.q(eg4Var2);
                this.f = eg4VarArr2;
            } else if (iA == 40) {
                int iP = o34Var.p();
                if (iP == 0 || iP == 1 || iP == 2) {
                    this.h = iP;
                }
            } else if (iA == 48) {
                this.i = o34Var.k();
            } else if (iA == 56) {
                int iP2 = o34Var.p();
                if (iP2 == 0 || iP2 == 1 || iP2 == 2) {
                    this.g = iP2;
                }
            } else if (iA == 64) {
                int iP3 = o34Var.p();
                if (iP3 == 0 || iP3 == 1 || iP3 == 2) {
                    this.j = iP3;
                }
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
