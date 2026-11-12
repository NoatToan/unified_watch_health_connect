package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class ps9 extends ak8<ps9> {
    public static volatile ps9[] f;
    public String c;
    public String d;
    public int e;

    public static final class a extends ak8<a> {
        public ps9 c;
        public int d;

        public a() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            int iB = super.b();
            ps9 ps9Var = this.c;
            if (ps9Var != null) {
                iB += CodedOutputByteBufferNano.n(1, ps9Var);
            }
            return iB + CodedOutputByteBufferNano.y(2, this.d);
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            ps9 ps9Var = this.c;
            if (ps9Var != null) {
                codedOutputByteBufferNano.Y(1, ps9Var);
            }
            codedOutputByteBufferNano.p0(2, this.d);
            super.j(codedOutputByteBufferNano);
        }

        public a m() {
            this.c = null;
            this.d = 0;
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
                    if (this.c == null) {
                        this.c = new ps9();
                    }
                    o34Var.q(this.c);
                } else if (iA == 16) {
                    this.d = o34Var.B();
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public static final class b extends ak8<b> {
        public String c;
        public int d;
        public int e;

        public b() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            int iB = super.b() + CodedOutputByteBufferNano.v(1, this.c) + CodedOutputByteBufferNano.l(2, this.d);
            int i = this.e;
            return i != 0 ? iB + CodedOutputByteBufferNano.y(3, i) : iB;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m0(1, this.c);
            codedOutputByteBufferNano.W(2, this.d);
            int i = this.e;
            if (i != 0) {
                codedOutputByteBufferNano.p0(3, i);
            }
            super.j(codedOutputByteBufferNano);
        }

        public b m() {
            this.c = "";
            this.d = 0;
            this.e = 0;
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
                if (iA == 10) {
                    this.c = o34Var.z();
                } else if (iA == 16) {
                    int iP = o34Var.p();
                    if (iP != 255) {
                        switch (iP) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                                break;
                            default:
                                continue;
                        }
                    }
                    this.d = iP;
                } else if (iA == 24) {
                    this.e = o34Var.B();
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public static final class c extends ak8<c> {
        public String c;
        public int d;

        public c() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            return super.b() + CodedOutputByteBufferNano.v(1, this.c) + CodedOutputByteBufferNano.y(2, this.d);
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m0(1, this.c);
            codedOutputByteBufferNano.p0(2, this.d);
            super.j(codedOutputByteBufferNano);
        }

        public c m() {
            this.c = "";
            this.d = 0;
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
                    this.c = o34Var.z();
                } else if (iA == 16) {
                    this.d = o34Var.B();
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public static final class d extends ak8<d> {
        public ps9[] c;
        public int d;

        public d() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            int iB = super.b();
            ps9[] ps9VarArr = this.c;
            if (ps9VarArr != null && ps9VarArr.length > 0) {
                int i = 0;
                while (true) {
                    ps9[] ps9VarArr2 = this.c;
                    if (i >= ps9VarArr2.length) {
                        break;
                    }
                    ps9 ps9Var = ps9VarArr2[i];
                    if (ps9Var != null) {
                        iB += CodedOutputByteBufferNano.n(1, ps9Var);
                    }
                    i++;
                }
            }
            return iB + CodedOutputByteBufferNano.y(2, this.d);
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            ps9[] ps9VarArr = this.c;
            if (ps9VarArr != null && ps9VarArr.length > 0) {
                int i = 0;
                while (true) {
                    ps9[] ps9VarArr2 = this.c;
                    if (i >= ps9VarArr2.length) {
                        break;
                    }
                    ps9 ps9Var = ps9VarArr2[i];
                    if (ps9Var != null) {
                        codedOutputByteBufferNano.Y(1, ps9Var);
                    }
                    i++;
                }
            }
            codedOutputByteBufferNano.p0(2, this.d);
            super.j(codedOutputByteBufferNano);
        }

        public d m() {
            this.c = ps9.n();
            this.d = 0;
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
                if (iA == 10) {
                    int iA2 = bmr.a(o34Var, 10);
                    ps9[] ps9VarArr = this.c;
                    int length = ps9VarArr == null ? 0 : ps9VarArr.length;
                    int i = iA2 + length;
                    ps9[] ps9VarArr2 = new ps9[i];
                    if (length != 0) {
                        System.arraycopy(ps9VarArr, 0, ps9VarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        ps9 ps9Var = new ps9();
                        ps9VarArr2[length] = ps9Var;
                        o34Var.q(ps9Var);
                        o34Var.A();
                        length++;
                    }
                    ps9 ps9Var2 = new ps9();
                    ps9VarArr2[length] = ps9Var2;
                    o34Var.q(ps9Var2);
                    this.c = ps9VarArr2;
                } else if (iA == 16) {
                    this.d = o34Var.B();
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public static final class e extends ak8<e> {
        public String[] c;

        public e() {
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

        public e m() {
            this.c = bmr.f;
            this.f1122b = null;
            this.f15887a = -1;
            return this;
        }

        @Override // defpackage.dsf
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public e e(o34 o34Var) throws IOException {
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

    public static final class f extends ak8<f> {
        public int c;

        public f() {
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

        public f m() {
            this.c = 0;
            this.f1122b = null;
            this.f15887a = -1;
            return this;
        }

        @Override // defpackage.dsf
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public f e(o34 o34Var) throws IOException {
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

    public ps9() {
        m();
    }

    public static ps9[] n() {
        if (f == null) {
            synchronized (afd.c) {
                try {
                    if (f == null) {
                        f = new ps9[0];
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
        return super.b() + CodedOutputByteBufferNano.v(1, this.c) + CodedOutputByteBufferNano.v(2, this.d) + CodedOutputByteBufferNano.y(3, this.e);
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.m0(1, this.c);
        codedOutputByteBufferNano.m0(2, this.d);
        codedOutputByteBufferNano.p0(3, this.e);
        super.j(codedOutputByteBufferNano);
    }

    public ps9 m() {
        this.c = "";
        this.d = "";
        this.e = 0;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public ps9 e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 10) {
                this.c = o34Var.z();
            } else if (iA == 18) {
                this.d = o34Var.z();
            } else if (iA == 24) {
                this.e = o34Var.B();
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
