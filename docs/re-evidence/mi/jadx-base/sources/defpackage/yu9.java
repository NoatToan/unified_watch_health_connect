package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public final class yu9 extends ak8<yu9> {
    public int c;
    public wu9[] d;

    public yu9() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b();
        int i = this.c;
        if (i != 0) {
            iB += CodedOutputByteBufferNano.y(1, i);
        }
        wu9[] wu9VarArr = this.d;
        if (wu9VarArr != null && wu9VarArr.length > 0) {
            int i2 = 0;
            while (true) {
                wu9[] wu9VarArr2 = this.d;
                if (i2 >= wu9VarArr2.length) {
                    break;
                }
                wu9 wu9Var = wu9VarArr2[i2];
                if (wu9Var != null) {
                    iB += CodedOutputByteBufferNano.n(2, wu9Var);
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
        wu9[] wu9VarArr = this.d;
        if (wu9VarArr != null && wu9VarArr.length > 0) {
            int i2 = 0;
            while (true) {
                wu9[] wu9VarArr2 = this.d;
                if (i2 >= wu9VarArr2.length) {
                    break;
                }
                wu9 wu9Var = wu9VarArr2[i2];
                if (wu9Var != null) {
                    codedOutputByteBufferNano.Y(2, wu9Var);
                }
                i2++;
            }
        }
        super.j(codedOutputByteBufferNano);
    }

    public yu9 m() {
        this.c = 0;
        this.d = wu9.n();
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public yu9 e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 8) {
                this.c = o34Var.B();
            } else if (iA == 18) {
                int iA2 = bmr.a(o34Var, 18);
                wu9[] wu9VarArr = this.d;
                int length = wu9VarArr == null ? 0 : wu9VarArr.length;
                int i = iA2 + length;
                wu9[] wu9VarArr2 = new wu9[i];
                if (length != 0) {
                    System.arraycopy(wu9VarArr, 0, wu9VarArr2, 0, length);
                }
                while (length < i - 1) {
                    wu9 wu9Var = new wu9();
                    wu9VarArr2[length] = wu9Var;
                    o34Var.q(wu9Var);
                    o34Var.A();
                    length++;
                }
                wu9 wu9Var2 = new wu9();
                wu9VarArr2[length] = wu9Var2;
                o34Var.q(wu9Var2);
                this.d = wu9VarArr2;
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
