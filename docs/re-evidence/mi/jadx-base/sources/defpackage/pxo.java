package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class pxo extends ak8<pxo> {
    public static volatile pxo[] e;
    public int c;
    public int d;

    public static final class a extends ak8<a> {
        public pxo[] c;

        public a() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            int iB = super.b();
            pxo[] pxoVarArr = this.c;
            if (pxoVarArr != null && pxoVarArr.length > 0) {
                int i = 0;
                while (true) {
                    pxo[] pxoVarArr2 = this.c;
                    if (i >= pxoVarArr2.length) {
                        break;
                    }
                    pxo pxoVar = pxoVarArr2[i];
                    if (pxoVar != null) {
                        iB += CodedOutputByteBufferNano.n(1, pxoVar);
                    }
                    i++;
                }
            }
            return iB;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            pxo[] pxoVarArr = this.c;
            if (pxoVarArr != null && pxoVarArr.length > 0) {
                int i = 0;
                while (true) {
                    pxo[] pxoVarArr2 = this.c;
                    if (i >= pxoVarArr2.length) {
                        break;
                    }
                    pxo pxoVar = pxoVarArr2[i];
                    if (pxoVar != null) {
                        codedOutputByteBufferNano.Y(1, pxoVar);
                    }
                    i++;
                }
            }
            super.j(codedOutputByteBufferNano);
        }

        public a m() {
            this.c = pxo.n();
            this.f1122b = null;
            this.f15887a = -1;
            return this;
        }

        @Override // defpackage.dsf
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public a e(o34 o34Var) throws IOException {
            while (true) {
                int iA = o34Var.A();
                if (iA == 0) {
                    return this;
                }
                if (iA == 10) {
                    int iA2 = bmr.a(o34Var, 10);
                    pxo[] pxoVarArr = this.c;
                    int length = pxoVarArr == null ? 0 : pxoVarArr.length;
                    int i = iA2 + length;
                    pxo[] pxoVarArr2 = new pxo[i];
                    if (length != 0) {
                        System.arraycopy(pxoVarArr, 0, pxoVarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        pxo pxoVar = new pxo();
                        pxoVarArr2[length] = pxoVar;
                        o34Var.q(pxoVar);
                        o34Var.A();
                        length++;
                    }
                    pxo pxoVar2 = new pxo();
                    pxoVarArr2[length] = pxoVar2;
                    o34Var.q(pxoVar2);
                    this.c = pxoVarArr2;
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public pxo() {
        m();
    }

    public static pxo[] n() {
        if (e == null) {
            synchronized (afd.c) {
                try {
                    if (e == null) {
                        e = new pxo[0];
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return e;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b() + CodedOutputByteBufferNano.l(1, this.c);
        int i = this.d;
        return i != 0 ? iB + CodedOutputByteBufferNano.y(2, i) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.W(1, this.c);
        int i = this.d;
        if (i != 0) {
            codedOutputByteBufferNano.p0(2, i);
        }
        super.j(codedOutputByteBufferNano);
    }

    public pxo m() {
        this.c = 0;
        this.d = 0;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public pxo e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 8) {
                int iP = o34Var.p();
                if (iP == 0 || iP == 1 || iP == 2 || iP == 3) {
                    this.c = iP;
                }
            } else if (iA == 16) {
                this.d = o34Var.B();
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
