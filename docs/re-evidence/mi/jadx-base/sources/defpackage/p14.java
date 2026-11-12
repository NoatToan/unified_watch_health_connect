package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class p14 extends ak8<p14> {
    public static volatile p14[] e;
    public int c;
    public a d;

    public static final class a extends ak8<a> {
        public n64 c;
        public t64 d;
        public int e;
        public int f;
        public String g;
        public boolean h;
        public int i;
        public int j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public long f29901k;
        public d[] l;

        public a() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            int iB = super.b();
            n64 n64Var = this.c;
            if (n64Var != null) {
                iB += CodedOutputByteBufferNano.n(1, n64Var);
            }
            t64 t64Var = this.d;
            if (t64Var != null) {
                iB += CodedOutputByteBufferNano.n(2, t64Var);
            }
            int iL = iB + CodedOutputByteBufferNano.l(3, this.e);
            int i = this.f;
            if (i != 0) {
                iL += CodedOutputByteBufferNano.y(4, i);
            }
            if (!this.g.equals("")) {
                iL += CodedOutputByteBufferNano.v(5, this.g);
            }
            boolean z = this.h;
            if (z) {
                iL += CodedOutputByteBufferNano.b(6, z);
            }
            int i2 = this.i;
            if (i2 != 0) {
                iL += CodedOutputByteBufferNano.y(7, i2);
            }
            int i3 = this.j;
            if (i3 != 0) {
                iL += CodedOutputByteBufferNano.y(8, i3);
            }
            long j = this.f29901k;
            if (j != 0) {
                iL += CodedOutputByteBufferNano.A(9, j);
            }
            d[] dVarArr = this.l;
            if (dVarArr != null && dVarArr.length > 0) {
                int i4 = 0;
                while (true) {
                    d[] dVarArr2 = this.l;
                    if (i4 >= dVarArr2.length) {
                        break;
                    }
                    d dVar = dVarArr2[i4];
                    if (dVar != null) {
                        iL += CodedOutputByteBufferNano.n(10, dVar);
                    }
                    i4++;
                }
            }
            return iL;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            n64 n64Var = this.c;
            if (n64Var != null) {
                codedOutputByteBufferNano.Y(1, n64Var);
            }
            t64 t64Var = this.d;
            if (t64Var != null) {
                codedOutputByteBufferNano.Y(2, t64Var);
            }
            codedOutputByteBufferNano.W(3, this.e);
            int i = this.f;
            if (i != 0) {
                codedOutputByteBufferNano.p0(4, i);
            }
            if (!this.g.equals("")) {
                codedOutputByteBufferNano.m0(5, this.g);
            }
            boolean z = this.h;
            if (z) {
                codedOutputByteBufferNano.M(6, z);
            }
            int i2 = this.i;
            if (i2 != 0) {
                codedOutputByteBufferNano.p0(7, i2);
            }
            int i3 = this.j;
            if (i3 != 0) {
                codedOutputByteBufferNano.p0(8, i3);
            }
            long j = this.f29901k;
            if (j != 0) {
                codedOutputByteBufferNano.r0(9, j);
            }
            d[] dVarArr = this.l;
            if (dVarArr != null && dVarArr.length > 0) {
                int i4 = 0;
                while (true) {
                    d[] dVarArr2 = this.l;
                    if (i4 >= dVarArr2.length) {
                        break;
                    }
                    d dVar = dVarArr2[i4];
                    if (dVar != null) {
                        codedOutputByteBufferNano.Y(10, dVar);
                    }
                    i4++;
                }
            }
            super.j(codedOutputByteBufferNano);
        }

        public a m() {
            this.c = null;
            this.d = null;
            this.e = 0;
            this.f = 0;
            this.g = "";
            this.h = false;
            this.i = 0;
            this.j = 0;
            this.f29901k = 0L;
            this.l = d.n();
            this.f1122b = null;
            this.f15887a = -1;
            return this;
        }

        @Override // defpackage.dsf
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public a e(o34 o34Var) throws IOException {
            while (true) {
                int iA = o34Var.A();
                switch (iA) {
                    case 0:
                        return this;
                    case 10:
                        if (this.c == null) {
                            this.c = new n64();
                        }
                        o34Var.q(this.c);
                        break;
                    case 18:
                        if (this.d == null) {
                            this.d = new t64();
                        }
                        o34Var.q(this.d);
                        break;
                    case 24:
                        int iP = o34Var.p();
                        if (iP != 15) {
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
                        this.e = iP;
                        break;
                    case 32:
                        this.f = o34Var.B();
                        break;
                    case 42:
                        this.g = o34Var.z();
                        break;
                    case 48:
                        this.h = o34Var.k();
                        break;
                    case 56:
                        this.i = o34Var.B();
                        break;
                    case 64:
                        this.j = o34Var.B();
                        break;
                    case 72:
                        this.f29901k = o34Var.C();
                        break;
                    case 82:
                        int iA2 = bmr.a(o34Var, 82);
                        d[] dVarArr = this.l;
                        int length = dVarArr == null ? 0 : dVarArr.length;
                        int i = iA2 + length;
                        d[] dVarArr2 = new d[i];
                        if (length != 0) {
                            System.arraycopy(dVarArr, 0, dVarArr2, 0, length);
                        }
                        while (length < i - 1) {
                            d dVar = new d();
                            dVarArr2[length] = dVar;
                            o34Var.q(dVar);
                            o34Var.A();
                            length++;
                        }
                        d dVar2 = new d();
                        dVarArr2[length] = dVar2;
                        o34Var.q(dVar2);
                        this.l = dVarArr2;
                        break;
                    default:
                        if (!l(o34Var, iA)) {
                            return this;
                        }
                        break;
                        break;
                }
            }
        }
    }

    public static final class b extends ak8<b> {
        public p14[] c;
        public int d;

        public b() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            int iB = super.b();
            p14[] p14VarArr = this.c;
            if (p14VarArr != null && p14VarArr.length > 0) {
                int i = 0;
                while (true) {
                    p14[] p14VarArr2 = this.c;
                    if (i >= p14VarArr2.length) {
                        break;
                    }
                    p14 p14Var = p14VarArr2[i];
                    if (p14Var != null) {
                        iB += CodedOutputByteBufferNano.n(1, p14Var);
                    }
                    i++;
                }
            }
            int i2 = this.d;
            return i2 != 0 ? iB + CodedOutputByteBufferNano.y(2, i2) : iB;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            p14[] p14VarArr = this.c;
            if (p14VarArr != null && p14VarArr.length > 0) {
                int i = 0;
                while (true) {
                    p14[] p14VarArr2 = this.c;
                    if (i >= p14VarArr2.length) {
                        break;
                    }
                    p14 p14Var = p14VarArr2[i];
                    if (p14Var != null) {
                        codedOutputByteBufferNano.Y(1, p14Var);
                    }
                    i++;
                }
            }
            int i2 = this.d;
            if (i2 != 0) {
                codedOutputByteBufferNano.p0(2, i2);
            }
            super.j(codedOutputByteBufferNano);
        }

        public b m() {
            this.c = p14.n();
            this.d = 0;
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
                    int iA2 = bmr.a(o34Var, 10);
                    p14[] p14VarArr = this.c;
                    int length = p14VarArr == null ? 0 : p14VarArr.length;
                    int i = iA2 + length;
                    p14[] p14VarArr2 = new p14[i];
                    if (length != 0) {
                        System.arraycopy(p14VarArr, 0, p14VarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        p14 p14Var = new p14();
                        p14VarArr2[length] = p14Var;
                        o34Var.q(p14Var);
                        o34Var.A();
                        length++;
                    }
                    p14 p14Var2 = new p14();
                    p14VarArr2[length] = p14Var2;
                    o34Var.q(p14Var2);
                    this.c = p14VarArr2;
                } else if (iA == 16) {
                    this.d = o34Var.B();
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public static final class c extends ak8<c> {
        public int c;
        public int d;
        public int e;
        public long f;
        public d[] g;

        public c() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            int iB = super.b() + CodedOutputByteBufferNano.y(1, this.c);
            int i = this.d;
            if (i != 0) {
                iB += CodedOutputByteBufferNano.y(2, i);
            }
            int iY = iB + CodedOutputByteBufferNano.y(3, this.e) + CodedOutputByteBufferNano.A(4, this.f);
            d[] dVarArr = this.g;
            if (dVarArr != null && dVarArr.length > 0) {
                int i2 = 0;
                while (true) {
                    d[] dVarArr2 = this.g;
                    if (i2 >= dVarArr2.length) {
                        break;
                    }
                    d dVar = dVarArr2[i2];
                    if (dVar != null) {
                        iY += CodedOutputByteBufferNano.n(5, dVar);
                    }
                    i2++;
                }
            }
            return iY;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.p0(1, this.c);
            int i = this.d;
            if (i != 0) {
                codedOutputByteBufferNano.p0(2, i);
            }
            codedOutputByteBufferNano.p0(3, this.e);
            codedOutputByteBufferNano.r0(4, this.f);
            d[] dVarArr = this.g;
            if (dVarArr != null && dVarArr.length > 0) {
                int i2 = 0;
                while (true) {
                    d[] dVarArr2 = this.g;
                    if (i2 >= dVarArr2.length) {
                        break;
                    }
                    d dVar = dVarArr2[i2];
                    if (dVar != null) {
                        codedOutputByteBufferNano.Y(5, dVar);
                    }
                    i2++;
                }
            }
            super.j(codedOutputByteBufferNano);
        }

        public c m() {
            this.c = 0;
            this.d = 0;
            this.e = 0;
            this.f = 0L;
            this.g = d.n();
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
                } else if (iA == 16) {
                    this.d = o34Var.B();
                } else if (iA == 24) {
                    this.e = o34Var.B();
                } else if (iA == 32) {
                    this.f = o34Var.C();
                } else if (iA == 42) {
                    int iA2 = bmr.a(o34Var, 42);
                    d[] dVarArr = this.g;
                    int length = dVarArr == null ? 0 : dVarArr.length;
                    int i = iA2 + length;
                    d[] dVarArr2 = new d[i];
                    if (length != 0) {
                        System.arraycopy(dVarArr, 0, dVarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        d dVar = new d();
                        dVarArr2[length] = dVar;
                        o34Var.q(dVar);
                        o34Var.A();
                        length++;
                    }
                    d dVar2 = new d();
                    dVarArr2[length] = dVar2;
                    o34Var.q(dVar2);
                    this.g = dVarArr2;
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public static final class d extends ak8<d> {
        public static volatile d[] g;
        public int c;
        public int d;
        public String e;
        public boolean f;

        public d() {
            m();
        }

        public static d[] n() {
            if (g == null) {
                synchronized (afd.c) {
                    try {
                        if (g == null) {
                            g = new d[0];
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
            int iB = super.b() + CodedOutputByteBufferNano.y(1, this.c) + CodedOutputByteBufferNano.y(2, this.d) + CodedOutputByteBufferNano.v(3, this.e);
            boolean z = this.f;
            return z ? iB + CodedOutputByteBufferNano.b(4, z) : iB;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.p0(1, this.c);
            codedOutputByteBufferNano.p0(2, this.d);
            codedOutputByteBufferNano.m0(3, this.e);
            boolean z = this.f;
            if (z) {
                codedOutputByteBufferNano.M(4, z);
            }
            super.j(codedOutputByteBufferNano);
        }

        public d m() {
            this.c = 0;
            this.d = 0;
            this.e = "";
            this.f = false;
            this.f1122b = null;
            this.f15887a = -1;
            return this;
        }

        @Override // defpackage.dsf
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public d e(o34 o34Var) throws IOException {
            while (true) {
                int iA = o34Var.A();
                if (iA == 0) {
                    return this;
                }
                if (iA == 8) {
                    this.c = o34Var.B();
                } else if (iA == 16) {
                    this.d = o34Var.B();
                } else if (iA == 26) {
                    this.e = o34Var.z();
                } else if (iA == 32) {
                    this.f = o34Var.k();
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public p14() {
        m();
    }

    public static p14[] n() {
        if (e == null) {
            synchronized (afd.c) {
                try {
                    if (e == null) {
                        e = new p14[0];
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
        int iB = super.b() + CodedOutputByteBufferNano.y(1, this.c);
        a aVar = this.d;
        return aVar != null ? iB + CodedOutputByteBufferNano.n(2, aVar) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.p0(1, this.c);
        a aVar = this.d;
        if (aVar != null) {
            codedOutputByteBufferNano.Y(2, aVar);
        }
        super.j(codedOutputByteBufferNano);
    }

    public p14 m() {
        this.c = 0;
        this.d = null;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public p14 e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 8) {
                this.c = o34Var.B();
            } else if (iA == 18) {
                if (this.d == null) {
                    this.d = new a();
                }
                o34Var.q(this.d);
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
