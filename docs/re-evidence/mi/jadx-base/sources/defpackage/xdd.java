package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class xdd extends ak8<xdd> {
    public static volatile xdd[] g;
    public String c;
    public int d;
    public int e;
    public String f;

    public static final class a extends ak8<a> {
        public xdd[] c;
        public boolean d;

        public a() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            int iB = super.b();
            xdd[] xddVarArr = this.c;
            if (xddVarArr != null && xddVarArr.length > 0) {
                int i = 0;
                while (true) {
                    xdd[] xddVarArr2 = this.c;
                    if (i >= xddVarArr2.length) {
                        break;
                    }
                    xdd xddVar = xddVarArr2[i];
                    if (xddVar != null) {
                        iB += CodedOutputByteBufferNano.n(1, xddVar);
                    }
                    i++;
                }
            }
            boolean z = this.d;
            return z ? iB + CodedOutputByteBufferNano.b(2, z) : iB;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            xdd[] xddVarArr = this.c;
            if (xddVarArr != null && xddVarArr.length > 0) {
                int i = 0;
                while (true) {
                    xdd[] xddVarArr2 = this.c;
                    if (i >= xddVarArr2.length) {
                        break;
                    }
                    xdd xddVar = xddVarArr2[i];
                    if (xddVar != null) {
                        codedOutputByteBufferNano.Y(1, xddVar);
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

        public a m() {
            this.c = xdd.n();
            this.d = false;
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
                    xdd[] xddVarArr = this.c;
                    int length = xddVarArr == null ? 0 : xddVarArr.length;
                    int i = iA2 + length;
                    xdd[] xddVarArr2 = new xdd[i];
                    if (length != 0) {
                        System.arraycopy(xddVarArr, 0, xddVarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        xdd xddVar = new xdd();
                        xddVarArr2[length] = xddVar;
                        o34Var.q(xddVar);
                        o34Var.A();
                        length++;
                    }
                    xdd xddVar2 = new xdd();
                    xddVarArr2[length] = xddVar2;
                    o34Var.q(xddVar2);
                    this.c = xddVarArr2;
                } else if (iA == 16) {
                    this.d = o34Var.k();
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public xdd() {
        m();
    }

    public static xdd[] n() {
        if (g == null) {
            synchronized (afd.c) {
                try {
                    if (g == null) {
                        g = new xdd[0];
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
        int iB = super.b() + CodedOutputByteBufferNano.v(1, this.c) + CodedOutputByteBufferNano.y(2, this.d) + CodedOutputByteBufferNano.y(3, this.e);
        return !this.f.equals("") ? iB + CodedOutputByteBufferNano.v(4, this.f) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.m0(1, this.c);
        codedOutputByteBufferNano.p0(2, this.d);
        codedOutputByteBufferNano.p0(3, this.e);
        if (!this.f.equals("")) {
            codedOutputByteBufferNano.m0(4, this.f);
        }
        super.j(codedOutputByteBufferNano);
    }

    public xdd m() {
        this.c = "";
        this.d = 0;
        this.e = 0;
        this.f = "";
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public xdd e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 10) {
                this.c = o34Var.z();
            } else if (iA == 16) {
                this.d = o34Var.B();
            } else if (iA == 24) {
                this.e = o34Var.B();
            } else if (iA == 34) {
                this.f = o34Var.z();
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
