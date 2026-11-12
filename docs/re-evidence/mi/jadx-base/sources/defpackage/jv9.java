package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class jv9 extends ak8<jv9> {
    public boolean c;
    public boolean d;
    public b.a e;
    public a.C0984a f;
    public int g;
    public int h;
    public int i;
    public c.a j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f23171k;

    public static final class a extends ak8<a> {
        public static volatile a[] e;
        public int c;
        public boolean d;

        /* JADX INFO: renamed from: jv9$a$a, reason: collision with other inner class name */
        public static final class C0984a extends ak8<C0984a> {
            public int c;
            public v64 d;
            public a[] e;
            public int f;
            public int g;
            public int h;
            public int i;

            public C0984a() {
                m();
            }

            @Override // defpackage.ak8, defpackage.dsf
            public int b() {
                int iB = super.b() + CodedOutputByteBufferNano.y(1, this.c);
                v64 v64Var = this.d;
                if (v64Var != null) {
                    iB += CodedOutputByteBufferNano.n(2, v64Var);
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
                v64 v64Var = this.d;
                if (v64Var != null) {
                    codedOutputByteBufferNano.Y(2, v64Var);
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

            public C0984a m() {
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
            public C0984a e(o34 o34Var) throws IOException {
                while (true) {
                    int iA = o34Var.A();
                    if (iA == 0) {
                        return this;
                    }
                    if (iA == 8) {
                        this.c = o34Var.B();
                    } else if (iA == 18) {
                        if (this.d == null) {
                            this.d = new v64();
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

    public static final class c extends ak8<c> {
        public static volatile c[] h;
        public int c;
        public int d;
        public int e;
        public boolean f;
        public int g;

        public static final class a extends ak8<a> {
            public c[] c;

            public a() {
                m();
            }

            @Override // defpackage.ak8, defpackage.dsf
            public int b() {
                int iB = super.b();
                c[] cVarArr = this.c;
                if (cVarArr != null && cVarArr.length > 0) {
                    int i = 0;
                    while (true) {
                        c[] cVarArr2 = this.c;
                        if (i >= cVarArr2.length) {
                            break;
                        }
                        c cVar = cVarArr2[i];
                        if (cVar != null) {
                            iB += CodedOutputByteBufferNano.n(1, cVar);
                        }
                        i++;
                    }
                }
                return iB;
            }

            @Override // defpackage.ak8, defpackage.dsf
            public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
                c[] cVarArr = this.c;
                if (cVarArr != null && cVarArr.length > 0) {
                    int i = 0;
                    while (true) {
                        c[] cVarArr2 = this.c;
                        if (i >= cVarArr2.length) {
                            break;
                        }
                        c cVar = cVarArr2[i];
                        if (cVar != null) {
                            codedOutputByteBufferNano.Y(1, cVar);
                        }
                        i++;
                    }
                }
                super.j(codedOutputByteBufferNano);
            }

            public a m() {
                this.c = c.n();
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
                        c[] cVarArr = this.c;
                        int length = cVarArr == null ? 0 : cVarArr.length;
                        int i = iA2 + length;
                        c[] cVarArr2 = new c[i];
                        if (length != 0) {
                            System.arraycopy(cVarArr, 0, cVarArr2, 0, length);
                        }
                        while (length < i - 1) {
                            c cVar = new c();
                            cVarArr2[length] = cVar;
                            o34Var.q(cVar);
                            o34Var.A();
                            length++;
                        }
                        c cVar2 = new c();
                        cVarArr2[length] = cVar2;
                        o34Var.q(cVar2);
                        this.c = cVarArr2;
                    } else if (!l(o34Var, iA)) {
                        return this;
                    }
                }
            }
        }

        public c() {
            m();
        }

        public static c[] n() {
            if (h == null) {
                synchronized (afd.c) {
                    try {
                        if (h == null) {
                            h = new c[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return h;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            int iB = super.b() + CodedOutputByteBufferNano.y(1, this.c) + CodedOutputByteBufferNano.y(2, this.d) + CodedOutputByteBufferNano.y(3, this.e);
            boolean z = this.f;
            if (z) {
                iB += CodedOutputByteBufferNano.b(4, z);
            }
            int i = this.g;
            return i != 0 ? iB + CodedOutputByteBufferNano.y(5, i) : iB;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.p0(1, this.c);
            codedOutputByteBufferNano.p0(2, this.d);
            codedOutputByteBufferNano.p0(3, this.e);
            boolean z = this.f;
            if (z) {
                codedOutputByteBufferNano.M(4, z);
            }
            int i = this.g;
            if (i != 0) {
                codedOutputByteBufferNano.p0(5, i);
            }
            super.j(codedOutputByteBufferNano);
        }

        public c m() {
            this.c = 0;
            this.d = 0;
            this.e = 0;
            this.f = false;
            this.g = 0;
            this.f1122b = null;
            this.f15887a = -1;
            return this;
        }

        @Override // defpackage.dsf
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public c e(o34 o34Var) throws IOException {
            while (true) {
                int iA = o34Var.A();
                if (iA == 0) {
                    return this;
                }
                if (iA == 8) {
                    this.c = o34Var.B();
                } else if (iA == 16) {
                    this.d = o34Var.B();
                } else if (iA == 24) {
                    this.e = o34Var.B();
                } else if (iA == 32) {
                    this.f = o34Var.k();
                } else if (iA == 40) {
                    this.g = o34Var.B();
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public jv9() {
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
        a.C0984a c0984a = this.f;
        if (c0984a != null) {
            iB += CodedOutputByteBufferNano.n(4, c0984a);
        }
        int i = this.g;
        if (i != 0) {
            iB += CodedOutputByteBufferNano.y(5, i);
        }
        int i2 = this.h;
        if (i2 != 0) {
            iB += CodedOutputByteBufferNano.y(6, i2);
        }
        int i3 = this.i;
        if (i3 != 0) {
            iB += CodedOutputByteBufferNano.y(7, i3);
        }
        c.a aVar2 = this.j;
        if (aVar2 != null) {
            iB += CodedOutputByteBufferNano.n(8, aVar2);
        }
        int i4 = this.f23171k;
        return i4 != 0 ? iB + CodedOutputByteBufferNano.y(9, i4) : iB;
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
        a.C0984a c0984a = this.f;
        if (c0984a != null) {
            codedOutputByteBufferNano.Y(4, c0984a);
        }
        int i = this.g;
        if (i != 0) {
            codedOutputByteBufferNano.p0(5, i);
        }
        int i2 = this.h;
        if (i2 != 0) {
            codedOutputByteBufferNano.p0(6, i2);
        }
        int i3 = this.i;
        if (i3 != 0) {
            codedOutputByteBufferNano.p0(7, i3);
        }
        c.a aVar2 = this.j;
        if (aVar2 != null) {
            codedOutputByteBufferNano.Y(8, aVar2);
        }
        int i4 = this.f23171k;
        if (i4 != 0) {
            codedOutputByteBufferNano.p0(9, i4);
        }
        super.j(codedOutputByteBufferNano);
    }

    public jv9 m() {
        this.c = false;
        this.d = false;
        this.e = null;
        this.f = null;
        this.g = 0;
        this.h = 0;
        this.i = 0;
        this.j = null;
        this.f23171k = 0;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public jv9 e(o34 o34Var) throws IOException {
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
                    this.f = new a.C0984a();
                }
                o34Var.q(this.f);
            } else if (iA == 40) {
                this.g = o34Var.B();
            } else if (iA == 48) {
                this.h = o34Var.B();
            } else if (iA == 56) {
                this.i = o34Var.B();
            } else if (iA == 66) {
                if (this.j == null) {
                    this.j = new c.a();
                }
                o34Var.q(this.j);
            } else if (iA == 72) {
                this.f23171k = o34Var.B();
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
