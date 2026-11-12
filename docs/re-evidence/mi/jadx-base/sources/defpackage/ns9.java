package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class ns9 extends ak8<ns9> {
    public boolean c;
    public int d;
    public int e;
    public int f;
    public t64[] g;

    public ns9() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b() + CodedOutputByteBufferNano.b(1, this.c);
        int i = this.d;
        if (i != 0) {
            iB += CodedOutputByteBufferNano.l(2, i);
        }
        int i2 = this.e;
        if (i2 != 0) {
            iB += CodedOutputByteBufferNano.l(3, i2);
        }
        int i3 = this.f;
        if (i3 != 0) {
            iB += CodedOutputByteBufferNano.y(4, i3);
        }
        t64[] t64VarArr = this.g;
        if (t64VarArr != null && t64VarArr.length > 0) {
            int i4 = 0;
            while (true) {
                t64[] t64VarArr2 = this.g;
                if (i4 >= t64VarArr2.length) {
                    break;
                }
                t64 t64Var = t64VarArr2[i4];
                if (t64Var != null) {
                    iB += CodedOutputByteBufferNano.n(5, t64Var);
                }
                i4++;
            }
        }
        return iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.M(1, this.c);
        int i = this.d;
        if (i != 0) {
            codedOutputByteBufferNano.W(2, i);
        }
        int i2 = this.e;
        if (i2 != 0) {
            codedOutputByteBufferNano.W(3, i2);
        }
        int i3 = this.f;
        if (i3 != 0) {
            codedOutputByteBufferNano.p0(4, i3);
        }
        t64[] t64VarArr = this.g;
        if (t64VarArr != null && t64VarArr.length > 0) {
            int i4 = 0;
            while (true) {
                t64[] t64VarArr2 = this.g;
                if (i4 >= t64VarArr2.length) {
                    break;
                }
                t64 t64Var = t64VarArr2[i4];
                if (t64Var != null) {
                    codedOutputByteBufferNano.Y(5, t64Var);
                }
                i4++;
            }
        }
        super.j(codedOutputByteBufferNano);
    }

    public ns9 m() {
        this.c = false;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = t64.n();
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public ns9 e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 8) {
                this.c = o34Var.k();
            } else if (iA == 16) {
                int iP = o34Var.p();
                if (iP == 0 || iP == 1 || iP == 2 || iP == 3) {
                    this.d = iP;
                }
            } else if (iA == 24) {
                int iP2 = o34Var.p();
                if (iP2 != 15) {
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
                            break;
                        default:
                            continue;
                    }
                }
                this.e = iP2;
            } else if (iA == 32) {
                this.f = o34Var.B();
            } else if (iA == 42) {
                int iA2 = bmr.a(o34Var, 42);
                t64[] t64VarArr = this.g;
                int length = t64VarArr == null ? 0 : t64VarArr.length;
                int i = iA2 + length;
                t64[] t64VarArr2 = new t64[i];
                if (length != 0) {
                    System.arraycopy(t64VarArr, 0, t64VarArr2, 0, length);
                }
                while (length < i - 1) {
                    t64 t64Var = new t64();
                    t64VarArr2[length] = t64Var;
                    o34Var.q(t64Var);
                    o34Var.A();
                    length++;
                }
                t64 t64Var2 = new t64();
                t64VarArr2[length] = t64Var2;
                o34Var.q(t64Var2);
                this.g = t64VarArr2;
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
