package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class eyo extends ak8<eyo> {
    public dyo[] c;
    public int d;
    public ayo[] e;
    public int f;

    public eyo() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b();
        dyo[] dyoVarArr = this.c;
        int i = 0;
        if (dyoVarArr != null && dyoVarArr.length > 0) {
            int i2 = 0;
            while (true) {
                dyo[] dyoVarArr2 = this.c;
                if (i2 >= dyoVarArr2.length) {
                    break;
                }
                dyo dyoVar = dyoVarArr2[i2];
                if (dyoVar != null) {
                    iB += CodedOutputByteBufferNano.n(1, dyoVar);
                }
                i2++;
            }
        }
        int iY = iB + CodedOutputByteBufferNano.y(2, this.d);
        ayo[] ayoVarArr = this.e;
        if (ayoVarArr != null && ayoVarArr.length > 0) {
            while (true) {
                ayo[] ayoVarArr2 = this.e;
                if (i >= ayoVarArr2.length) {
                    break;
                }
                ayo ayoVar = ayoVarArr2[i];
                if (ayoVar != null) {
                    iY += CodedOutputByteBufferNano.n(3, ayoVar);
                }
                i++;
            }
        }
        int i3 = this.f;
        return i3 != 0 ? iY + CodedOutputByteBufferNano.y(4, i3) : iY;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        dyo[] dyoVarArr = this.c;
        int i = 0;
        if (dyoVarArr != null && dyoVarArr.length > 0) {
            int i2 = 0;
            while (true) {
                dyo[] dyoVarArr2 = this.c;
                if (i2 >= dyoVarArr2.length) {
                    break;
                }
                dyo dyoVar = dyoVarArr2[i2];
                if (dyoVar != null) {
                    codedOutputByteBufferNano.Y(1, dyoVar);
                }
                i2++;
            }
        }
        codedOutputByteBufferNano.p0(2, this.d);
        ayo[] ayoVarArr = this.e;
        if (ayoVarArr != null && ayoVarArr.length > 0) {
            while (true) {
                ayo[] ayoVarArr2 = this.e;
                if (i >= ayoVarArr2.length) {
                    break;
                }
                ayo ayoVar = ayoVarArr2[i];
                if (ayoVar != null) {
                    codedOutputByteBufferNano.Y(3, ayoVar);
                }
                i++;
            }
        }
        int i3 = this.f;
        if (i3 != 0) {
            codedOutputByteBufferNano.p0(4, i3);
        }
        super.j(codedOutputByteBufferNano);
    }

    public eyo m() {
        this.c = dyo.n();
        this.d = 0;
        this.e = ayo.n();
        this.f = 0;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public eyo e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 10) {
                int iA2 = bmr.a(o34Var, 10);
                dyo[] dyoVarArr = this.c;
                int length = dyoVarArr == null ? 0 : dyoVarArr.length;
                int i = iA2 + length;
                dyo[] dyoVarArr2 = new dyo[i];
                if (length != 0) {
                    System.arraycopy(dyoVarArr, 0, dyoVarArr2, 0, length);
                }
                while (length < i - 1) {
                    dyo dyoVar = new dyo();
                    dyoVarArr2[length] = dyoVar;
                    o34Var.q(dyoVar);
                    o34Var.A();
                    length++;
                }
                dyo dyoVar2 = new dyo();
                dyoVarArr2[length] = dyoVar2;
                o34Var.q(dyoVar2);
                this.c = dyoVarArr2;
            } else if (iA == 16) {
                this.d = o34Var.B();
            } else if (iA == 26) {
                int iA3 = bmr.a(o34Var, 26);
                ayo[] ayoVarArr = this.e;
                int length2 = ayoVarArr == null ? 0 : ayoVarArr.length;
                int i2 = iA3 + length2;
                ayo[] ayoVarArr2 = new ayo[i2];
                if (length2 != 0) {
                    System.arraycopy(ayoVarArr, 0, ayoVarArr2, 0, length2);
                }
                while (length2 < i2 - 1) {
                    ayo ayoVar = new ayo();
                    ayoVarArr2[length2] = ayoVar;
                    o34Var.q(ayoVar);
                    o34Var.A();
                    length2++;
                }
                ayo ayoVar2 = new ayo();
                ayoVarArr2[length2] = ayoVar2;
                o34Var.q(ayoVar2);
                this.e = ayoVarArr2;
            } else if (iA == 32) {
                this.f = o34Var.B();
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
