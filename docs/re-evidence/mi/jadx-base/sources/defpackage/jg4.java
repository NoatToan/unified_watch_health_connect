package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class jg4 extends ak8<jg4> {
    public static volatile jg4[] g;
    public String c;
    public String d;
    public b[] e;
    public boolean f;

    public static final class a extends ak8<a> {
        public jg4[] c;

        public a() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            int iB = super.b();
            jg4[] jg4VarArr = this.c;
            if (jg4VarArr != null && jg4VarArr.length > 0) {
                int i = 0;
                while (true) {
                    jg4[] jg4VarArr2 = this.c;
                    if (i >= jg4VarArr2.length) {
                        break;
                    }
                    jg4 jg4Var = jg4VarArr2[i];
                    if (jg4Var != null) {
                        iB += CodedOutputByteBufferNano.n(1, jg4Var);
                    }
                    i++;
                }
            }
            return iB;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            jg4[] jg4VarArr = this.c;
            if (jg4VarArr != null && jg4VarArr.length > 0) {
                int i = 0;
                while (true) {
                    jg4[] jg4VarArr2 = this.c;
                    if (i >= jg4VarArr2.length) {
                        break;
                    }
                    jg4 jg4Var = jg4VarArr2[i];
                    if (jg4Var != null) {
                        codedOutputByteBufferNano.Y(1, jg4Var);
                    }
                    i++;
                }
            }
            super.j(codedOutputByteBufferNano);
        }

        public a m() {
            this.c = jg4.n();
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
                    jg4[] jg4VarArr = this.c;
                    int length = jg4VarArr == null ? 0 : jg4VarArr.length;
                    int i = iA2 + length;
                    jg4[] jg4VarArr2 = new jg4[i];
                    if (length != 0) {
                        System.arraycopy(jg4VarArr, 0, jg4VarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        jg4 jg4Var = new jg4();
                        jg4VarArr2[length] = jg4Var;
                        o34Var.q(jg4Var);
                        o34Var.A();
                        length++;
                    }
                    jg4 jg4Var2 = new jg4();
                    jg4VarArr2[length] = jg4Var2;
                    o34Var.q(jg4Var2);
                    this.c = jg4VarArr2;
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public static final class b extends ak8<b> {
        public static volatile b[] f;
        public String c;
        public int d;
        public String e;

        public b() {
            m();
        }

        public static b[] n() {
            if (f == null) {
                synchronized (afd.c) {
                    try {
                        if (f == null) {
                            f = new b[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return f;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            int iB = super.b() + CodedOutputByteBufferNano.v(1, this.c) + CodedOutputByteBufferNano.y(2, this.d);
            return !this.e.equals("") ? iB + CodedOutputByteBufferNano.v(3, this.e) : iB;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m0(1, this.c);
            codedOutputByteBufferNano.p0(2, this.d);
            if (!this.e.equals("")) {
                codedOutputByteBufferNano.m0(3, this.e);
            }
            super.j(codedOutputByteBufferNano);
        }

        public b m() {
            this.c = "";
            this.d = 0;
            this.e = "";
            this.f1122b = null;
            this.f15887a = -1;
            return this;
        }

        @Override // defpackage.dsf
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public b e(o34 o34Var) throws IOException {
            while (true) {
                int iA = o34Var.A();
                if (iA == 0) {
                    return this;
                }
                if (iA == 10) {
                    this.c = o34Var.z();
                } else if (iA == 16) {
                    this.d = o34Var.B();
                } else if (iA == 26) {
                    this.e = o34Var.z();
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public static final class c extends ak8<c> {
        public String[] c;

        public c() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            int iB = super.b();
            String[] strArr = this.c;
            if (strArr == null || strArr.length <= 0) {
                return iB;
            }
            int i = 0;
            int iW = 0;
            int i2 = 0;
            while (true) {
                String[] strArr2 = this.c;
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
            String[] strArr = this.c;
            if (strArr != null && strArr.length > 0) {
                int i = 0;
                while (true) {
                    String[] strArr2 = this.c;
                    if (i >= strArr2.length) {
                        break;
                    }
                    String str = strArr2[i];
                    if (str != null) {
                        codedOutputByteBufferNano.m0(1, str);
                    }
                    i++;
                }
            }
            super.j(codedOutputByteBufferNano);
        }

        public c m() {
            this.c = bmr.f;
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
                if (iA == 10) {
                    int iA2 = bmr.a(o34Var, 10);
                    String[] strArr = this.c;
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
                    this.c = strArr2;
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public static final class d extends ak8<d> {
        public int c;

        public d() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            return super.b() + CodedOutputByteBufferNano.y(1, this.c);
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.p0(1, this.c);
            super.j(codedOutputByteBufferNano);
        }

        public d m() {
            this.c = 0;
            this.f1122b = null;
            this.f15887a = -1;
            return this;
        }

        @Override // defpackage.dsf
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public d e(o34 o34Var) throws IOException {
            while (true) {
                int iA = o34Var.A();
                if (iA == 0) {
                    return this;
                }
                if (iA == 8) {
                    this.c = o34Var.B();
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public jg4() {
        m();
    }

    public static jg4[] n() {
        if (g == null) {
            synchronized (afd.c) {
                try {
                    if (g == null) {
                        g = new jg4[0];
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
        int iB = super.b() + CodedOutputByteBufferNano.v(1, this.c) + CodedOutputByteBufferNano.v(2, this.d);
        b[] bVarArr = this.e;
        if (bVarArr != null && bVarArr.length > 0) {
            int i = 0;
            while (true) {
                b[] bVarArr2 = this.e;
                if (i >= bVarArr2.length) {
                    break;
                }
                b bVar = bVarArr2[i];
                if (bVar != null) {
                    iB += CodedOutputByteBufferNano.n(3, bVar);
                }
                i++;
            }
        }
        boolean z = this.f;
        return z ? iB + CodedOutputByteBufferNano.b(4, z) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.m0(1, this.c);
        codedOutputByteBufferNano.m0(2, this.d);
        b[] bVarArr = this.e;
        if (bVarArr != null && bVarArr.length > 0) {
            int i = 0;
            while (true) {
                b[] bVarArr2 = this.e;
                if (i >= bVarArr2.length) {
                    break;
                }
                b bVar = bVarArr2[i];
                if (bVar != null) {
                    codedOutputByteBufferNano.Y(3, bVar);
                }
                i++;
            }
        }
        boolean z = this.f;
        if (z) {
            codedOutputByteBufferNano.M(4, z);
        }
        super.j(codedOutputByteBufferNano);
    }

    public jg4 m() {
        this.c = "";
        this.d = "";
        this.e = b.n();
        this.f = false;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public jg4 e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 10) {
                this.c = o34Var.z();
            } else if (iA == 18) {
                this.d = o34Var.z();
            } else if (iA == 26) {
                int iA2 = bmr.a(o34Var, 26);
                b[] bVarArr = this.e;
                int length = bVarArr == null ? 0 : bVarArr.length;
                int i = iA2 + length;
                b[] bVarArr2 = new b[i];
                if (length != 0) {
                    System.arraycopy(bVarArr, 0, bVarArr2, 0, length);
                }
                while (length < i - 1) {
                    b bVar = new b();
                    bVarArr2[length] = bVar;
                    o34Var.q(bVar);
                    o34Var.A();
                    length++;
                }
                b bVar2 = new b();
                bVarArr2[length] = bVar2;
                o34Var.q(bVar2);
                this.e = bVarArr2;
            } else if (iA == 32) {
                this.f = o34Var.k();
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
