package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class js9 extends ak8<js9> {
    public static volatile js9[] e;
    public long c;
    public e d;

    public static final class a extends ak8<a> {
        public long[] c;

        public a() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            int iB = super.b();
            long[] jArr = this.c;
            if (jArr == null || jArr.length <= 0) {
                return iB;
            }
            int i = 0;
            int iB2 = 0;
            while (true) {
                long[] jArr2 = this.c;
                if (i >= jArr2.length) {
                    return iB + iB2 + jArr2.length;
                }
                iB2 += CodedOutputByteBufferNano.B(jArr2[i]);
                i++;
            }
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            long[] jArr = this.c;
            if (jArr != null && jArr.length > 0) {
                int i = 0;
                while (true) {
                    long[] jArr2 = this.c;
                    if (i >= jArr2.length) {
                        break;
                    }
                    codedOutputByteBufferNano.r0(1, jArr2[i]);
                    i++;
                }
            }
            super.j(codedOutputByteBufferNano);
        }

        public a m() {
            this.c = bmr.f4378b;
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
                if (iA == 8) {
                    int iA2 = bmr.a(o34Var, 8);
                    long[] jArr = this.c;
                    int length = jArr == null ? 0 : jArr.length;
                    int i = iA2 + length;
                    long[] jArr2 = new long[i];
                    if (length != 0) {
                        System.arraycopy(jArr, 0, jArr2, 0, length);
                    }
                    while (length < i - 1) {
                        jArr2[length] = o34Var.C();
                        o34Var.A();
                        length++;
                    }
                    jArr2[length] = o34Var.C();
                    this.c = jArr2;
                } else if (iA == 10) {
                    int iJ = o34Var.j(o34Var.v());
                    int iF = o34Var.f();
                    int i2 = 0;
                    while (o34Var.d() > 0) {
                        o34Var.C();
                        i2++;
                    }
                    o34Var.E(iF);
                    long[] jArr3 = this.c;
                    int length2 = jArr3 == null ? 0 : jArr3.length;
                    int i3 = i2 + length2;
                    long[] jArr4 = new long[i3];
                    if (length2 != 0) {
                        System.arraycopy(jArr3, 0, jArr4, 0, length2);
                    }
                    while (length2 < i3) {
                        jArr4[length2] = o34Var.C();
                        length2++;
                    }
                    this.c = jArr4;
                    o34Var.i(iJ);
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public static final class b extends ak8<b> {
        public long c;

        public b() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            return super.b() + CodedOutputByteBufferNano.A(1, this.c);
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.r0(1, this.c);
            super.j(codedOutputByteBufferNano);
        }

        public b m() {
            this.c = 0L;
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
                    this.c = o34Var.C();
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public static final class c extends ak8<c> {
        public int c;

        public c() {
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

        public c m() {
            this.c = 0;
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
                    this.c = o34Var.B();
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public static final class d extends ak8<d> {
        public js9[] c;

        public d() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            int iB = super.b();
            js9[] js9VarArr = this.c;
            if (js9VarArr != null && js9VarArr.length > 0) {
                int i = 0;
                while (true) {
                    js9[] js9VarArr2 = this.c;
                    if (i >= js9VarArr2.length) {
                        break;
                    }
                    js9 js9Var = js9VarArr2[i];
                    if (js9Var != null) {
                        iB += CodedOutputByteBufferNano.n(1, js9Var);
                    }
                    i++;
                }
            }
            return iB;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            js9[] js9VarArr = this.c;
            if (js9VarArr != null && js9VarArr.length > 0) {
                int i = 0;
                while (true) {
                    js9[] js9VarArr2 = this.c;
                    if (i >= js9VarArr2.length) {
                        break;
                    }
                    js9 js9Var = js9VarArr2[i];
                    if (js9Var != null) {
                        codedOutputByteBufferNano.Y(1, js9Var);
                    }
                    i++;
                }
            }
            super.j(codedOutputByteBufferNano);
        }

        public d m() {
            this.c = js9.n();
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
                    js9[] js9VarArr = this.c;
                    int length = js9VarArr == null ? 0 : js9VarArr.length;
                    int i = iA2 + length;
                    js9[] js9VarArr2 = new js9[i];
                    if (length != 0) {
                        System.arraycopy(js9VarArr, 0, js9VarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        js9 js9Var = new js9();
                        js9VarArr2[length] = js9Var;
                        o34Var.q(js9Var);
                        o34Var.A();
                        length++;
                    }
                    js9 js9Var2 = new js9();
                    js9VarArr2[length] = js9Var2;
                    o34Var.q(js9Var2);
                    this.c = js9VarArr2;
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public static final class e extends ak8<e> {
        public int c;
        public boolean d;

        public e() {
            m();
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

        public e m() {
            this.c = 0;
            this.d = false;
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

    public js9() {
        m();
    }

    public static js9[] n() {
        if (e == null) {
            synchronized (afd.c) {
                try {
                    if (e == null) {
                        e = new js9[0];
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
        int iB = super.b() + CodedOutputByteBufferNano.A(1, this.c);
        e eVar = this.d;
        return eVar != null ? iB + CodedOutputByteBufferNano.n(2, eVar) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.r0(1, this.c);
        e eVar = this.d;
        if (eVar != null) {
            codedOutputByteBufferNano.Y(2, eVar);
        }
        super.j(codedOutputByteBufferNano);
    }

    public js9 m() {
        this.c = 0L;
        this.d = null;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public js9 e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 8) {
                this.c = o34Var.C();
            } else if (iA == 18) {
                if (this.d == null) {
                    this.d = new e();
                }
                o34Var.q(this.d);
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
