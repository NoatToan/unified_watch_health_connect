package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class v69 extends ak8<v69> {
    public String c;
    public q64[] d;

    public v69() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b() + CodedOutputByteBufferNano.v(1, this.c);
        q64[] q64VarArr = this.d;
        if (q64VarArr != null && q64VarArr.length > 0) {
            int i = 0;
            while (true) {
                q64[] q64VarArr2 = this.d;
                if (i >= q64VarArr2.length) {
                    break;
                }
                q64 q64Var = q64VarArr2[i];
                if (q64Var != null) {
                    iB += CodedOutputByteBufferNano.n(2, q64Var);
                }
                i++;
            }
        }
        return iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.m0(1, this.c);
        q64[] q64VarArr = this.d;
        if (q64VarArr != null && q64VarArr.length > 0) {
            int i = 0;
            while (true) {
                q64[] q64VarArr2 = this.d;
                if (i >= q64VarArr2.length) {
                    break;
                }
                q64 q64Var = q64VarArr2[i];
                if (q64Var != null) {
                    codedOutputByteBufferNano.Y(2, q64Var);
                }
                i++;
            }
        }
        super.j(codedOutputByteBufferNano);
    }

    public v69 m() {
        this.c = "";
        this.d = q64.n();
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public v69 e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 10) {
                this.c = o34Var.z();
            } else if (iA == 18) {
                int iA2 = bmr.a(o34Var, 18);
                q64[] q64VarArr = this.d;
                int length = q64VarArr == null ? 0 : q64VarArr.length;
                int i = iA2 + length;
                q64[] q64VarArr2 = new q64[i];
                if (length != 0) {
                    System.arraycopy(q64VarArr, 0, q64VarArr2, 0, length);
                }
                while (length < i - 1) {
                    q64 q64Var = new q64();
                    q64VarArr2[length] = q64Var;
                    o34Var.q(q64Var);
                    o34Var.A();
                    length++;
                }
                q64 q64Var2 = new q64();
                q64VarArr2[length] = q64Var2;
                o34Var.q(q64Var2);
                this.d = q64VarArr2;
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
