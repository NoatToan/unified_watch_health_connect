package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class f79 extends ak8<f79> {
    public c79[] c;
    public boolean d;

    public f79() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b();
        c79[] c79VarArr = this.c;
        if (c79VarArr != null && c79VarArr.length > 0) {
            int i = 0;
            while (true) {
                c79[] c79VarArr2 = this.c;
                if (i >= c79VarArr2.length) {
                    break;
                }
                c79 c79Var = c79VarArr2[i];
                if (c79Var != null) {
                    iB += CodedOutputByteBufferNano.n(1, c79Var);
                }
                i++;
            }
        }
        boolean z = this.d;
        return z ? iB + CodedOutputByteBufferNano.b(2, z) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        c79[] c79VarArr = this.c;
        if (c79VarArr != null && c79VarArr.length > 0) {
            int i = 0;
            while (true) {
                c79[] c79VarArr2 = this.c;
                if (i >= c79VarArr2.length) {
                    break;
                }
                c79 c79Var = c79VarArr2[i];
                if (c79Var != null) {
                    codedOutputByteBufferNano.Y(1, c79Var);
                }
                i++;
            }
        }
        boolean z = this.d;
        if (z) {
            codedOutputByteBufferNano.M(2, z);
        }
        super.j(codedOutputByteBufferNano);
    }

    public f79 m() {
        this.c = c79.n();
        this.d = false;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public f79 e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 10) {
                int iA2 = bmr.a(o34Var, 10);
                c79[] c79VarArr = this.c;
                int length = c79VarArr == null ? 0 : c79VarArr.length;
                int i = iA2 + length;
                c79[] c79VarArr2 = new c79[i];
                if (length != 0) {
                    System.arraycopy(c79VarArr, 0, c79VarArr2, 0, length);
                }
                while (length < i - 1) {
                    c79 c79Var = new c79();
                    c79VarArr2[length] = c79Var;
                    o34Var.q(c79Var);
                    o34Var.A();
                    length++;
                }
                c79 c79Var2 = new c79();
                c79VarArr2[length] = c79Var2;
                o34Var.q(c79Var2);
                this.c = c79VarArr2;
            } else if (iA == 16) {
                this.d = o34Var.k();
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
