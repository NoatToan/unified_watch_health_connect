package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class xrg extends ak8<xrg> {
    public static volatile xrg[] e;
    public String c;
    public t64[] d;

    public static final class a extends ak8<a> {
        public xrg[] c;

        public a() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            int iB = super.b();
            xrg[] xrgVarArr = this.c;
            if (xrgVarArr != null && xrgVarArr.length > 0) {
                int i = 0;
                while (true) {
                    xrg[] xrgVarArr2 = this.c;
                    if (i >= xrgVarArr2.length) {
                        break;
                    }
                    xrg xrgVar = xrgVarArr2[i];
                    if (xrgVar != null) {
                        iB += CodedOutputByteBufferNano.n(1, xrgVar);
                    }
                    i++;
                }
            }
            return iB;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            xrg[] xrgVarArr = this.c;
            if (xrgVarArr != null && xrgVarArr.length > 0) {
                int i = 0;
                while (true) {
                    xrg[] xrgVarArr2 = this.c;
                    if (i >= xrgVarArr2.length) {
                        break;
                    }
                    xrg xrgVar = xrgVarArr2[i];
                    if (xrgVar != null) {
                        codedOutputByteBufferNano.Y(1, xrgVar);
                    }
                    i++;
                }
            }
            super.j(codedOutputByteBufferNano);
        }

        public a m() {
            this.c = xrg.n();
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
                    xrg[] xrgVarArr = this.c;
                    int length = xrgVarArr == null ? 0 : xrgVarArr.length;
                    int i = iA2 + length;
                    xrg[] xrgVarArr2 = new xrg[i];
                    if (length != 0) {
                        System.arraycopy(xrgVarArr, 0, xrgVarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        xrg xrgVar = new xrg();
                        xrgVarArr2[length] = xrgVar;
                        o34Var.q(xrgVar);
                        o34Var.A();
                        length++;
                    }
                    xrg xrgVar2 = new xrg();
                    xrgVarArr2[length] = xrgVar2;
                    o34Var.q(xrgVar2);
                    this.c = xrgVarArr2;
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public static final class b extends ak8<b> {
        public int c;
        public String d;

        public b() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            int iB = super.b() + CodedOutputByteBufferNano.y(1, this.c);
            return !this.d.equals("") ? iB + CodedOutputByteBufferNano.v(2, this.d) : iB;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.p0(1, this.c);
            if (!this.d.equals("")) {
                codedOutputByteBufferNano.m0(2, this.d);
            }
            super.j(codedOutputByteBufferNano);
        }

        public b m() {
            this.c = 0;
            this.d = "";
            this.f1122b = null;
            this.f15887a = -1;
            return this;
        }

        @Override // defpackage.dsf
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public b e(o34 o34Var) throws IOException {
            while (true) {
                int iA = o34Var.A();
                if (iA == 0) {
                    return this;
                }
                if (iA == 8) {
                    this.c = o34Var.B();
                } else if (iA == 18) {
                    this.d = o34Var.z();
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public static final class c extends ak8<c> {
        public boolean c;
        public String[] d;

        public c() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            int iB = super.b() + CodedOutputByteBufferNano.b(1, this.c);
            String[] strArr = this.d;
            if (strArr == null || strArr.length <= 0) {
                return iB;
            }
            int i = 0;
            int iW = 0;
            int i2 = 0;
            while (true) {
                String[] strArr2 = this.d;
                if (i >= strArr2.length) {
                    return iB + iW + i2;
                }
                String str = strArr2[i];
                if (str != null) {
                    i2++;
                    iW += CodedOutputByteBufferNano.w(str);
                }
                i++;
            }
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.M(1, this.c);
            String[] strArr = this.d;
            if (strArr != null && strArr.length > 0) {
                int i = 0;
                while (true) {
                    String[] strArr2 = this.d;
                    if (i >= strArr2.length) {
                        break;
                    }
                    String str = strArr2[i];
                    if (str != null) {
                        codedOutputByteBufferNano.m0(2, str);
                    }
                    i++;
                }
            }
            super.j(codedOutputByteBufferNano);
        }

        public c m() {
            this.c = false;
            this.d = bmr.f;
            this.f1122b = null;
            this.f15887a = -1;
            return this;
        }

        @Override // defpackage.dsf
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public c e(o34 o34Var) throws IOException {
            while (true) {
                int iA = o34Var.A();
                if (iA == 0) {
                    return this;
                }
                if (iA == 8) {
                    this.c = o34Var.k();
                } else if (iA == 18) {
                    int iA2 = bmr.a(o34Var, 18);
                    String[] strArr = this.d;
                    int length = strArr == null ? 0 : strArr.length;
                    int i = iA2 + length;
                    String[] strArr2 = new String[i];
                    if (length != 0) {
                        System.arraycopy(strArr, 0, strArr2, 0, length);
                    }
                    while (length < i - 1) {
                        strArr2[length] = o34Var.z();
                        o34Var.A();
                        length++;
                    }
                    strArr2[length] = o34Var.z();
                    this.d = strArr2;
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public xrg() {
        m();
    }

    public static xrg[] n() {
        if (e == null) {
            synchronized (afd.c) {
                try {
                    if (e == null) {
                        e = new xrg[0];
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
        int iB = super.b() + CodedOutputByteBufferNano.v(1, this.c);
        t64[] t64VarArr = this.d;
        if (t64VarArr != null && t64VarArr.length > 0) {
            int i = 0;
            while (true) {
                t64[] t64VarArr2 = this.d;
                if (i >= t64VarArr2.length) {
                    break;
                }
                t64 t64Var = t64VarArr2[i];
                if (t64Var != null) {
                    iB += CodedOutputByteBufferNano.n(2, t64Var);
                }
                i++;
            }
        }
        return iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.m0(1, this.c);
        t64[] t64VarArr = this.d;
        if (t64VarArr != null && t64VarArr.length > 0) {
            int i = 0;
            while (true) {
                t64[] t64VarArr2 = this.d;
                if (i >= t64VarArr2.length) {
                    break;
                }
                t64 t64Var = t64VarArr2[i];
                if (t64Var != null) {
                    codedOutputByteBufferNano.Y(2, t64Var);
                }
                i++;
            }
        }
        super.j(codedOutputByteBufferNano);
    }

    public xrg m() {
        this.c = "";
        this.d = t64.n();
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public xrg e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 10) {
                this.c = o34Var.z();
            } else if (iA == 18) {
                int iA2 = bmr.a(o34Var, 18);
                t64[] t64VarArr = this.d;
                int length = t64VarArr == null ? 0 : t64VarArr.length;
                int i = iA2 + length;
                t64[] t64VarArr2 = new t64[i];
                if (length != 0) {
                    System.arraycopy(t64VarArr, 0, t64VarArr2, 0, length);
                }
                while (length < i - 1) {
                    t64 t64Var = new t64();
                    t64VarArr2[length] = t64Var;
                    o34Var.q(t64Var);
                    o34Var.A();
                    length++;
                }
                t64 t64Var2 = new t64();
                t64VarArr2[length] = t64Var2;
                o34Var.q(t64Var2);
                this.d = t64VarArr2;
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
