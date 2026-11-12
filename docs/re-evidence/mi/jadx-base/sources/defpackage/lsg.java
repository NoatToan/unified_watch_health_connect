package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class lsg extends ak8<lsg> {
    public urg c;
    public jsg[] d;

    public lsg() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b();
        urg urgVar = this.c;
        if (urgVar != null) {
            iB += CodedOutputByteBufferNano.n(1, urgVar);
        }
        jsg[] jsgVarArr = this.d;
        if (jsgVarArr != null && jsgVarArr.length > 0) {
            int i = 0;
            while (true) {
                jsg[] jsgVarArr2 = this.d;
                if (i >= jsgVarArr2.length) {
                    break;
                }
                jsg jsgVar = jsgVarArr2[i];
                if (jsgVar != null) {
                    iB += CodedOutputByteBufferNano.n(2, jsgVar);
                }
                i++;
            }
        }
        return iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        urg urgVar = this.c;
        if (urgVar != null) {
            codedOutputByteBufferNano.Y(1, urgVar);
        }
        jsg[] jsgVarArr = this.d;
        if (jsgVarArr != null && jsgVarArr.length > 0) {
            int i = 0;
            while (true) {
                jsg[] jsgVarArr2 = this.d;
                if (i >= jsgVarArr2.length) {
                    break;
                }
                jsg jsgVar = jsgVarArr2[i];
                if (jsgVar != null) {
                    codedOutputByteBufferNano.Y(2, jsgVar);
                }
                i++;
            }
        }
        super.j(codedOutputByteBufferNano);
    }

    public lsg m() {
        this.c = null;
        this.d = jsg.n();
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public lsg e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 10) {
                if (this.c == null) {
                    this.c = new urg();
                }
                o34Var.q(this.c);
            } else if (iA == 18) {
                int iA2 = bmr.a(o34Var, 18);
                jsg[] jsgVarArr = this.d;
                int length = jsgVarArr == null ? 0 : jsgVarArr.length;
                int i = iA2 + length;
                jsg[] jsgVarArr2 = new jsg[i];
                if (length != 0) {
                    System.arraycopy(jsgVarArr, 0, jsgVarArr2, 0, length);
                }
                while (length < i - 1) {
                    jsg jsgVar = new jsg();
                    jsgVarArr2[length] = jsgVar;
                    o34Var.q(jsgVar);
                    o34Var.A();
                    length++;
                }
                jsg jsgVar2 = new jsg();
                jsgVarArr2[length] = jsgVar2;
                o34Var.q(jsgVar2);
                this.d = jsgVarArr2;
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
