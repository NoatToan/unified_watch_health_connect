package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class pxg extends ak8<pxg> {
    public static volatile pxg[] e;
    public int c;
    public boolean d;

    public static final class a extends ak8<a> {
        public pxg[] c;

        public a() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            int iB = super.b();
            pxg[] pxgVarArr = this.c;
            if (pxgVarArr != null && pxgVarArr.length > 0) {
                int i = 0;
                while (true) {
                    pxg[] pxgVarArr2 = this.c;
                    if (i >= pxgVarArr2.length) {
                        break;
                    }
                    pxg pxgVar = pxgVarArr2[i];
                    if (pxgVar != null) {
                        iB += CodedOutputByteBufferNano.n(1, pxgVar);
                    }
                    i++;
                }
            }
            return iB;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            pxg[] pxgVarArr = this.c;
            if (pxgVarArr != null && pxgVarArr.length > 0) {
                int i = 0;
                while (true) {
                    pxg[] pxgVarArr2 = this.c;
                    if (i >= pxgVarArr2.length) {
                        break;
                    }
                    pxg pxgVar = pxgVarArr2[i];
                    if (pxgVar != null) {
                        codedOutputByteBufferNano.Y(1, pxgVar);
                    }
                    i++;
                }
            }
            super.j(codedOutputByteBufferNano);
        }

        public a m() {
            this.c = pxg.n();
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
                    pxg[] pxgVarArr = this.c;
                    int length = pxgVarArr == null ? 0 : pxgVarArr.length;
                    int i = iA2 + length;
                    pxg[] pxgVarArr2 = new pxg[i];
                    if (length != 0) {
                        System.arraycopy(pxgVarArr, 0, pxgVarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        pxg pxgVar = new pxg();
                        pxgVarArr2[length] = pxgVar;
                        o34Var.q(pxgVar);
                        o34Var.A();
                        length++;
                    }
                    pxg pxgVar2 = new pxg();
                    pxgVarArr2[length] = pxgVar2;
                    o34Var.q(pxgVar2);
                    this.c = pxgVarArr2;
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public pxg() {
        m();
    }

    public static pxg[] n() {
        if (e == null) {
            synchronized (afd.c) {
                try {
                    if (e == null) {
                        e = new pxg[0];
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
        return super.b() + CodedOutputByteBufferNano.y(1, this.c) + CodedOutputByteBufferNano.b(2, this.d);
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.p0(1, this.c);
        codedOutputByteBufferNano.M(2, this.d);
        super.j(codedOutputByteBufferNano);
    }

    public pxg m() {
        this.c = 0;
        this.d = false;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public pxg e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 8) {
                this.c = o34Var.B();
            } else if (iA == 16) {
                this.d = o34Var.k();
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
