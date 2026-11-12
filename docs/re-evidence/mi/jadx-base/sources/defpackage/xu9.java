package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class xu9 extends ak8<xu9> {
    public int c;
    public vu9[] d;

    public xu9() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b();
        int i = this.c;
        if (i != 0) {
            iB += CodedOutputByteBufferNano.y(1, i);
        }
        vu9[] vu9VarArr = this.d;
        if (vu9VarArr != null && vu9VarArr.length > 0) {
            int i2 = 0;
            while (true) {
                vu9[] vu9VarArr2 = this.d;
                if (i2 >= vu9VarArr2.length) {
                    break;
                }
                vu9 vu9Var = vu9VarArr2[i2];
                if (vu9Var != null) {
                    iB += CodedOutputByteBufferNano.n(2, vu9Var);
                }
                i2++;
            }
        }
        return iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i = this.c;
        if (i != 0) {
            codedOutputByteBufferNano.p0(1, i);
        }
        vu9[] vu9VarArr = this.d;
        if (vu9VarArr != null && vu9VarArr.length > 0) {
            int i2 = 0;
            while (true) {
                vu9[] vu9VarArr2 = this.d;
                if (i2 >= vu9VarArr2.length) {
                    break;
                }
                vu9 vu9Var = vu9VarArr2[i2];
                if (vu9Var != null) {
                    codedOutputByteBufferNano.Y(2, vu9Var);
                }
                i2++;
            }
        }
        super.j(codedOutputByteBufferNano);
    }

    public xu9 m() {
        this.c = 0;
        this.d = vu9.n();
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public xu9 e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 8) {
                this.c = o34Var.B();
            } else if (iA == 18) {
                int iA2 = bmr.a(o34Var, 18);
                vu9[] vu9VarArr = this.d;
                int length = vu9VarArr == null ? 0 : vu9VarArr.length;
                int i = iA2 + length;
                vu9[] vu9VarArr2 = new vu9[i];
                if (length != 0) {
                    System.arraycopy(vu9VarArr, 0, vu9VarArr2, 0, length);
                }
                while (length < i - 1) {
                    vu9 vu9Var = new vu9();
                    vu9VarArr2[length] = vu9Var;
                    o34Var.q(vu9Var);
                    o34Var.A();
                    length++;
                }
                vu9 vu9Var2 = new vu9();
                vu9VarArr2[length] = vu9Var2;
                o34Var.q(vu9Var2);
                this.d = vu9VarArr2;
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
