package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class zrg extends ak8<zrg> {
    public urg c;
    public asg[] d;
    public int e;

    public zrg() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b();
        urg urgVar = this.c;
        if (urgVar != null) {
            iB += CodedOutputByteBufferNano.n(1, urgVar);
        }
        asg[] asgVarArr = this.d;
        if (asgVarArr != null && asgVarArr.length > 0) {
            int i = 0;
            while (true) {
                asg[] asgVarArr2 = this.d;
                if (i >= asgVarArr2.length) {
                    break;
                }
                asg asgVar = asgVarArr2[i];
                if (asgVar != null) {
                    iB += CodedOutputByteBufferNano.n(2, asgVar);
                }
                i++;
            }
        }
        return iB + CodedOutputByteBufferNano.y(3, this.e);
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        urg urgVar = this.c;
        if (urgVar != null) {
            codedOutputByteBufferNano.Y(1, urgVar);
        }
        asg[] asgVarArr = this.d;
        if (asgVarArr != null && asgVarArr.length > 0) {
            int i = 0;
            while (true) {
                asg[] asgVarArr2 = this.d;
                if (i >= asgVarArr2.length) {
                    break;
                }
                asg asgVar = asgVarArr2[i];
                if (asgVar != null) {
                    codedOutputByteBufferNano.Y(2, asgVar);
                }
                i++;
            }
        }
        codedOutputByteBufferNano.p0(3, this.e);
        super.j(codedOutputByteBufferNano);
    }

    public zrg m() {
        this.c = null;
        this.d = asg.n();
        this.e = 0;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public zrg e(o34 o34Var) throws IOException {
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
                asg[] asgVarArr = this.d;
                int length = asgVarArr == null ? 0 : asgVarArr.length;
                int i = iA2 + length;
                asg[] asgVarArr2 = new asg[i];
                if (length != 0) {
                    System.arraycopy(asgVarArr, 0, asgVarArr2, 0, length);
                }
                while (length < i - 1) {
                    asg asgVar = new asg();
                    asgVarArr2[length] = asgVar;
                    o34Var.q(asgVar);
                    o34Var.A();
                    length++;
                }
                asg asgVar2 = new asg();
                asgVarArr2[length] = asgVar2;
                o34Var.q(asgVar2);
                this.d = asgVarArr2;
            } else if (iA == 24) {
                this.e = o34Var.B();
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
