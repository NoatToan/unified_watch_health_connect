package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public final class iv9 extends ak8<iv9> {
    public boolean c;
    public boolean d;
    public b.a e;
    public a.C0976a f;

    public static final class a extends ak8<a> {
        public static volatile a[] e;
        public int c;
        public boolean d;

        /* JADX INFO: renamed from: iv9$a$a, reason: collision with other inner class name */
        public static final class C0976a extends ak8<C0976a> {
            public int c;
            public w64 d;
            public a[] e;
            public int f;
            public int g;
            public int h;
            public int i;

            public C0976a() {
                m();
            }

            @Override // defpackage.ak8, defpackage.dsf
            public int b() {
                int iB = super.b() + CodedOutputByteBufferNano.y(1, this.c);
                w64 w64Var = this.d;
                if (w64Var != null) {
                    iB += CodedOutputByteBufferNano.n(2, w64Var);
                }
                a[] aVarArr = this.e;
                if (aVarArr != null && aVarArr.length > 0) {
                    int i = 0;
                    while (true) {
                        a[] aVarArr2 = this.e;
                        if (i >= aVarArr2.length) {
                            break;
                        }
                        a aVar = aVarArr2[i];
                        if (aVar != null) {
                            iB += CodedOutputByteBufferNano.n(3, aVar);
                        }
                        i++;
                    }
                }
                int i2 = this.f;
                if (i2 != 0) {
                    iB += CodedOutputByteBufferNano.y(4, i2);
                }
                int i3 = this.g;
                if (i3 != 0) {
                    iB += CodedOutputByteBufferNano.y(5, i3);
                }
                int i4 = this.h;
                if (i4 != 0) {
                    iB += CodedOutputByteBufferNano.y(6, i4);
                }
                int i5 = this.i;
                return i5 != 0 ? iB + CodedOutputByteBufferNano.l(7, i5) : iB;
            }

            @Override // defpackage.ak8, defpackage.dsf
            public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
                codedOutputByteBufferNano.p0(1, this.c);
                w64 w64Var = this.d;
                if (w64Var != null) {
                    codedOutputByteBufferNano.Y(2, w64Var);
                }
                a[] aVarArr = this.e;
                if (aVarArr != null && aVarArr.length > 0) {
                    int i = 0;
                    while (true) {
                        a[] aVarArr2 = this.e;
                        if (i >= aVarArr2.length) {
                            break;
                        }
                        a aVar = aVarArr2[i];
                        if (aVar != null) {
                            codedOutputByteBufferNano.Y(3, aVar);
                        }
                        i++;
                    }
                }
                int i2 = this.f;
                if (i2 != 0) {
                    codedOutputByteBufferNano.p0(4, i2);
                }
                int i3 = this.g;
                if (i3 != 0) {
                    codedOutputByteBufferNano.p0(5, i3);
                }
                int i4 = this.h;
                if (i4 != 0) {
                    codedOutputByteBufferNano.p0(6, i4);
                }
                int i5 = this.i;
                if (i5 != 0) {
                    codedOutputByteBufferNano.W(7, i5);
                }
                super.j(codedOutputByteBufferNano);
            }

            public C0976a m() {
                this.c = 0;
                this.d = null;
                this.e = a.n();
                this.f = 0;
                this.g = 0;
                this.h = 0;
                this.i = 0;
                this.f1122b = null;
                this.f15887a = -1;
                return this;
            }

            @Override // defpackage.dsf
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public C0976a e(o34 o34Var) throws IOException {
                while (true) {
                    int iA = o34Var.A();
                    if (iA == 0) {
                        return this;
                    }
                    if (iA == 8) {
                        this.c = o34Var.B();
                    } else if (iA == 18) {
                        if (this.d == null) {
                            this.d = new w64();
                        }
                        o34Var.q(this.d);
                    } else if (iA == 26) {
                        int iA2 = bmr.a(o34Var, 26);
                        a[] aVarArr = this.e;
                        int length = aVarArr == null ? 0 : aVarArr.length;
                        int i = iA2 + length;
                        a[] aVarArr2 = new a[i];
                        if (length != 0) {
                            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                        }
                        while (length < i - 1) {
                            a aVar = new a();
                            aVarArr2[length] = aVar;
                            o34Var.q(aVar);
                            o34Var.A();
                            length++;
                        }
                        a aVar2 = new a();
                        aVarArr2[length] = aVar2;
                        o34Var.q(aVar2);
                        this.e = aVarArr2;
                    } else if (iA == 32) {
                        this.f = o34Var.B();
                    } else if (iA == 40) {
                        this.g = o34Var.B();
                    } else if (iA == 48) {
                        this.h = o34Var.B();
                    } else if (iA == 56) {
                        int iP = o34Var.p();
                        if (iP == 0 || iP == 1 || iP == 2 || iP == 3) {
                            this.i = iP;
                        }
                    } else if (!l(o34Var, iA)) {
                        return this;
                    }
                }
            }
        }

        public a() {
            m();
        }

        public static a[] n() {
            if (e == null) {
                synchronized (afd.c) {
                    try {
                        if (e == null) {
                            e = new a[0];
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
            return super.b() + CodedOutputByteBufferNano.l(1, this.c) + CodedOutputByteBufferNano.b(2, this.d);
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.W(1, this.c);
            codedOutputByteBufferNano.M(2, this.d);
            super.j(codedOutputByteBufferNano);
        }

        public a m() {
            this.c = 0;
            this.d = false;
            this.f1122b = null;
            this.f15887a = -1;
            return this;
        }

        @Override // defpackage.dsf
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public a e(o34 o34Var) throws IOException {
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
                    this.d = o34Var.k();
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public static final class b extends ak8<b> {
        public static volatile b[] e;
        public int c;
        public int d;

        public static final class a extends ak8<a> {
            public b[] c;

            public a() {
                m();
            }

            @Override // defpackage.ak8, defpackage.dsf
            public int b() {
                int iB = super.b();
                b[] bVarArr = this.c;
                if (bVarArr != null && bVarArr.length > 0) {
                    int i = 0;
                    while (true) {
                        b[] bVarArr2 = this.c;
                        if (i >= bVarArr2.length) {
                            break;
                        }
                        b bVar = bVarArr2[i];
                        if (bVar != null) {
                            iB += CodedOutputByteBufferNano.n(1, bVar);
                        }
                        i++;
                    }
                }
                return iB;
            }

            @Override // defpackage.ak8, defpackage.dsf
            public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
                b[] bVarArr = this.c;
                if (bVarArr != null && bVarArr.length > 0) {
                    int i = 0;
                    while (true) {
                        b[] bVarArr2 = this.c;
                        if (i >= bVarArr2.length) {
                            break;
                        }
                        b bVar = bVarArr2[i];
                        if (bVar != null) {
                            codedOutputByteBufferNano.Y(1, bVar);
                        }
                        i++;
                    }
                }
                super.j(codedOutputByteBufferNano);
            }

            public a m() {
                this.c = b.n();
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
                        b[] bVarArr = this.c;
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
                        this.c = bVarArr2;
                    } else if (!l(o34Var, iA)) {
                        return this;
                    }
                }
            }
        }

        public b() {
            m();
        }

        public static b[] n() {
            if (e == null) {
                synchronized (afd.c) {
                    try {
                        if (e == null) {
                            e = new b[0];
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
            return super.b() + CodedOutputByteBufferNano.l(1, this.c) + CodedOutputByteBufferNano.y(2, this.d);
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.W(1, this.c);
            codedOutputByteBufferNano.p0(2, this.d);
            super.j(codedOutputByteBufferNano);
        }

        public b m() {
            this.c = 0;
            this.d = 0;
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

    public iv9() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b() + CodedOutputByteBufferNano.b(1, this.c);
        boolean z = this.d;
        if (z) {
            iB += CodedOutputByteBufferNano.b(2, z);
        }
        b.a aVar = this.e;
        if (aVar != null) {
            iB += CodedOutputByteBufferNano.n(3, aVar);
        }
        a.C0976a c0976a = this.f;
        return c0976a != null ? iB + CodedOutputByteBufferNano.n(4, c0976a) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.M(1, this.c);
        boolean z = this.d;
        if (z) {
            codedOutputByteBufferNano.M(2, z);
        }
        b.a aVar = this.e;
        if (aVar != null) {
            codedOutputByteBufferNano.Y(3, aVar);
        }
        a.C0976a c0976a = this.f;
        if (c0976a != null) {
            codedOutputByteBufferNano.Y(4, c0976a);
        }
        super.j(codedOutputByteBufferNano);
    }

    public iv9 m() {
        this.c = false;
        this.d = false;
        this.e = null;
        this.f = null;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public iv9 e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 8) {
                this.c = o34Var.k();
            } else if (iA == 16) {
                this.d = o34Var.k();
            } else if (iA == 26) {
                if (this.e == null) {
                    this.e = new b.a();
                }
                o34Var.q(this.e);
            } else if (iA == 34) {
                if (this.f == null) {
                    this.f = new a.C0976a();
                }
                o34Var.q(this.f);
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
