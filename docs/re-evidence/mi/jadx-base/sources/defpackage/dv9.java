package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class dv9 extends ak8<dv9> {
    public l64[] c;
    public l64[] d;

    public dv9() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b();
        l64[] l64VarArr = this.c;
        int i = 0;
        if (l64VarArr != null && l64VarArr.length > 0) {
            int i2 = 0;
            while (true) {
                l64[] l64VarArr2 = this.c;
                if (i2 >= l64VarArr2.length) {
                    break;
                }
                l64 l64Var = l64VarArr2[i2];
                if (l64Var != null) {
                    iB += CodedOutputByteBufferNano.n(5, l64Var);
                }
                i2++;
            }
        }
        l64[] l64VarArr3 = this.d;
        if (l64VarArr3 != null && l64VarArr3.length > 0) {
            while (true) {
                l64[] l64VarArr4 = this.d;
                if (i >= l64VarArr4.length) {
                    break;
                }
                l64 l64Var2 = l64VarArr4[i];
                if (l64Var2 != null) {
                    iB += CodedOutputByteBufferNano.n(6, l64Var2);
                }
                i++;
            }
        }
        return iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        l64[] l64VarArr = this.c;
        int i = 0;
        if (l64VarArr != null && l64VarArr.length > 0) {
            int i2 = 0;
            while (true) {
                l64[] l64VarArr2 = this.c;
                if (i2 >= l64VarArr2.length) {
                    break;
                }
                l64 l64Var = l64VarArr2[i2];
                if (l64Var != null) {
                    codedOutputByteBufferNano.Y(5, l64Var);
                }
                i2++;
            }
        }
        l64[] l64VarArr3 = this.d;
        if (l64VarArr3 != null && l64VarArr3.length > 0) {
            while (true) {
                l64[] l64VarArr4 = this.d;
                if (i >= l64VarArr4.length) {
                    break;
                }
                l64 l64Var2 = l64VarArr4[i];
                if (l64Var2 != null) {
                    codedOutputByteBufferNano.Y(6, l64Var2);
                }
                i++;
            }
        }
        super.j(codedOutputByteBufferNano);
    }

    public dv9 m() {
        this.c = l64.n();
        this.d = l64.n();
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public dv9 e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 42) {
                int iA2 = bmr.a(o34Var, 42);
                l64[] l64VarArr = this.c;
                int length = l64VarArr == null ? 0 : l64VarArr.length;
                int i = iA2 + length;
                l64[] l64VarArr2 = new l64[i];
                if (length != 0) {
                    System.arraycopy(l64VarArr, 0, l64VarArr2, 0, length);
                }
                while (length < i - 1) {
                    l64 l64Var = new l64();
                    l64VarArr2[length] = l64Var;
                    o34Var.q(l64Var);
                    o34Var.A();
                    length++;
                }
                l64 l64Var2 = new l64();
                l64VarArr2[length] = l64Var2;
                o34Var.q(l64Var2);
                this.c = l64VarArr2;
            } else if (iA == 50) {
                int iA3 = bmr.a(o34Var, 50);
                l64[] l64VarArr3 = this.d;
                int length2 = l64VarArr3 == null ? 0 : l64VarArr3.length;
                int i2 = iA3 + length2;
                l64[] l64VarArr4 = new l64[i2];
                if (length2 != 0) {
                    System.arraycopy(l64VarArr3, 0, l64VarArr4, 0, length2);
                }
                while (length2 < i2 - 1) {
                    l64 l64Var3 = new l64();
                    l64VarArr4[length2] = l64Var3;
                    o34Var.q(l64Var3);
                    o34Var.A();
                    length2++;
                }
                l64 l64Var4 = new l64();
                l64VarArr4[length2] = l64Var4;
                o34Var.q(l64Var4);
                this.d = l64VarArr4;
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
