package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class ut9 extends ak8<ut9> {
    public boolean c;
    public t64[] d;

    public ut9() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b() + CodedOutputByteBufferNano.b(1, this.c);
        t64[] t64VarArr = this.d;
        if (t64VarArr != null && t64VarArr.length > 0) {
            int i = 0;
            while (true) {
                t64[] t64VarArr2 = this.d;
                if (i >= t64VarArr2.length) {
                    break;
                }
                t64 t64Var = t64VarArr2[i];
                if (t64Var != null) {
                    iB += CodedOutputByteBufferNano.n(2, t64Var);
                }
                i++;
            }
        }
        return iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.M(1, this.c);
        t64[] t64VarArr = this.d;
        if (t64VarArr != null && t64VarArr.length > 0) {
            int i = 0;
            while (true) {
                t64[] t64VarArr2 = this.d;
                if (i >= t64VarArr2.length) {
                    break;
                }
                t64 t64Var = t64VarArr2[i];
                if (t64Var != null) {
                    codedOutputByteBufferNano.Y(2, t64Var);
                }
                i++;
            }
        }
        super.j(codedOutputByteBufferNano);
    }

    public ut9 m() {
        this.c = false;
        this.d = t64.n();
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public ut9 e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 8) {
                this.c = o34Var.k();
            } else if (iA == 18) {
                int iA2 = bmr.a(o34Var, 18);
                t64[] t64VarArr = this.d;
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
                this.d = t64VarArr2;
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
