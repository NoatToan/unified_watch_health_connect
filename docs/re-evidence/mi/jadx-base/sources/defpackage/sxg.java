package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class sxg extends ak8<sxg> {
    public static volatile sxg[] g;
    public int c;
    public String d;
    public String e;
    public String f;

    public static final class a extends ak8<a> {
        public sxg[] c;

        public a() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            int iB = super.b();
            sxg[] sxgVarArr = this.c;
            if (sxgVarArr != null && sxgVarArr.length > 0) {
                int i = 0;
                while (true) {
                    sxg[] sxgVarArr2 = this.c;
                    if (i >= sxgVarArr2.length) {
                        break;
                    }
                    sxg sxgVar = sxgVarArr2[i];
                    if (sxgVar != null) {
                        iB += CodedOutputByteBufferNano.n(1, sxgVar);
                    }
                    i++;
                }
            }
            return iB;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            sxg[] sxgVarArr = this.c;
            if (sxgVarArr != null && sxgVarArr.length > 0) {
                int i = 0;
                while (true) {
                    sxg[] sxgVarArr2 = this.c;
                    if (i >= sxgVarArr2.length) {
                        break;
                    }
                    sxg sxgVar = sxgVarArr2[i];
                    if (sxgVar != null) {
                        codedOutputByteBufferNano.Y(1, sxgVar);
                    }
                    i++;
                }
            }
            super.j(codedOutputByteBufferNano);
        }

        public a m() {
            this.c = sxg.n();
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
                    sxg[] sxgVarArr = this.c;
                    int length = sxgVarArr == null ? 0 : sxgVarArr.length;
                    int i = iA2 + length;
                    sxg[] sxgVarArr2 = new sxg[i];
                    if (length != 0) {
                        System.arraycopy(sxgVarArr, 0, sxgVarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        sxg sxgVar = new sxg();
                        sxgVarArr2[length] = sxgVar;
                        o34Var.q(sxgVar);
                        o34Var.A();
                        length++;
                    }
                    sxg sxgVar2 = new sxg();
                    sxgVarArr2[length] = sxgVar2;
                    o34Var.q(sxgVar2);
                    this.c = sxgVarArr2;
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public sxg() {
        m();
    }

    public static sxg[] n() {
        if (g == null) {
            synchronized (afd.c) {
                try {
                    if (g == null) {
                        g = new sxg[0];
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return g;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b() + CodedOutputByteBufferNano.y(1, this.c);
        if (!this.d.equals("")) {
            iB += CodedOutputByteBufferNano.v(2, this.d);
        }
        if (!this.e.equals("")) {
            iB += CodedOutputByteBufferNano.v(3, this.e);
        }
        return !this.f.equals("") ? iB + CodedOutputByteBufferNano.v(4, this.f) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.p0(1, this.c);
        if (!this.d.equals("")) {
            codedOutputByteBufferNano.m0(2, this.d);
        }
        if (!this.e.equals("")) {
            codedOutputByteBufferNano.m0(3, this.e);
        }
        if (!this.f.equals("")) {
            codedOutputByteBufferNano.m0(4, this.f);
        }
        super.j(codedOutputByteBufferNano);
    }

    public sxg m() {
        this.c = 0;
        this.d = "";
        this.e = "";
        this.f = "";
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public sxg e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 8) {
                this.c = o34Var.B();
            } else if (iA == 18) {
                this.d = o34Var.z();
            } else if (iA == 26) {
                this.e = o34Var.z();
            } else if (iA == 34) {
                this.f = o34Var.z();
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
