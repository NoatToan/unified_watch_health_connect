package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class gyo extends ak8<gyo> {
    public static volatile gyo[] f;
    public int c = 0;
    public Object d;
    public a e;

    public static final class a extends ak8<a> {
        public String c;
        public int d;
        public int e;

        public a() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            return super.b() + CodedOutputByteBufferNano.v(1, this.c) + CodedOutputByteBufferNano.l(2, this.d) + CodedOutputByteBufferNano.l(3, this.e);
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m0(1, this.c);
            codedOutputByteBufferNano.W(2, this.d);
            codedOutputByteBufferNano.W(3, this.e);
            super.j(codedOutputByteBufferNano);
        }

        public a m() {
            this.c = "";
            this.d = 1;
            this.e = 1;
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
                    this.c = o34Var.z();
                } else if (iA == 16) {
                    int iP = o34Var.p();
                    if (iP == 1 || iP == 2 || iP == 4) {
                        this.d = iP;
                    }
                } else if (iA == 24) {
                    int iP2 = o34Var.p();
                    if (iP2 == 1 || iP2 == 2) {
                        this.e = iP2;
                    }
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public static final class b extends ak8<b> {
        public int c;
        public int d;

        public b() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            int iB = super.b();
            int i = this.c;
            if (i != 0) {
                iB += CodedOutputByteBufferNano.y(1, i);
            }
            int i2 = this.d;
            return i2 != 0 ? iB + CodedOutputByteBufferNano.y(2, i2) : iB;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            int i = this.c;
            if (i != 0) {
                codedOutputByteBufferNano.p0(1, i);
            }
            int i2 = this.d;
            if (i2 != 0) {
                codedOutputByteBufferNano.p0(2, i2);
            }
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
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public b e(o34 o34Var) throws IOException {
            while (true) {
                int iA = o34Var.A();
                if (iA == 0) {
                    return this;
                }
                if (iA == 8) {
                    this.c = o34Var.B();
                } else if (iA == 16) {
                    this.d = o34Var.B();
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public static final class c extends ak8<c> {
        public String c;
        public String d;

        public c() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            return super.b() + CodedOutputByteBufferNano.v(1, this.c) + CodedOutputByteBufferNano.v(2, this.d);
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m0(1, this.c);
            codedOutputByteBufferNano.m0(2, this.d);
            super.j(codedOutputByteBufferNano);
        }

        public c m() {
            this.c = "";
            this.d = "";
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
                } else if (iA == 18) {
                    this.d = o34Var.z();
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public static final class d extends ak8<d> {
        public gyo[] c;
        public int d;
        public boolean[] e;

        public d() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            int iB = super.b();
            gyo[] gyoVarArr = this.c;
            if (gyoVarArr != null && gyoVarArr.length > 0) {
                int i = 0;
                while (true) {
                    gyo[] gyoVarArr2 = this.c;
                    if (i >= gyoVarArr2.length) {
                        break;
                    }
                    gyo gyoVar = gyoVarArr2[i];
                    if (gyoVar != null) {
                        iB += CodedOutputByteBufferNano.n(1, gyoVar);
                    }
                    i++;
                }
            }
            int i2 = this.d;
            if (i2 != 0) {
                iB += CodedOutputByteBufferNano.r(2, i2);
            }
            boolean[] zArr = this.e;
            return (zArr == null || zArr.length <= 0) ? iB : iB + zArr.length + zArr.length;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            gyo[] gyoVarArr = this.c;
            int i = 0;
            if (gyoVarArr != null && gyoVarArr.length > 0) {
                int i2 = 0;
                while (true) {
                    gyo[] gyoVarArr2 = this.c;
                    if (i2 >= gyoVarArr2.length) {
                        break;
                    }
                    gyo gyoVar = gyoVarArr2[i2];
                    if (gyoVar != null) {
                        codedOutputByteBufferNano.Y(1, gyoVar);
                    }
                    i2++;
                }
            }
            int i3 = this.d;
            if (i3 != 0) {
                codedOutputByteBufferNano.i0(2, i3);
            }
            boolean[] zArr = this.e;
            if (zArr != null && zArr.length > 0) {
                while (true) {
                    boolean[] zArr2 = this.e;
                    if (i >= zArr2.length) {
                        break;
                    }
                    codedOutputByteBufferNano.M(3, zArr2[i]);
                    i++;
                }
            }
            super.j(codedOutputByteBufferNano);
        }

        public d m() {
            this.c = gyo.o();
            this.d = 0;
            this.e = bmr.e;
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
                    gyo[] gyoVarArr = this.c;
                    int length = gyoVarArr == null ? 0 : gyoVarArr.length;
                    int i = iA2 + length;
                    gyo[] gyoVarArr2 = new gyo[i];
                    if (length != 0) {
                        System.arraycopy(gyoVarArr, 0, gyoVarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        gyo gyoVar = new gyo();
                        gyoVarArr2[length] = gyoVar;
                        o34Var.q(gyoVar);
                        o34Var.A();
                        length++;
                    }
                    gyo gyoVar2 = new gyo();
                    gyoVarArr2[length] = gyoVar2;
                    o34Var.q(gyoVar2);
                    this.c = gyoVarArr2;
                } else if (iA == 16) {
                    this.d = o34Var.x();
                } else if (iA == 24) {
                    int iA3 = bmr.a(o34Var, 24);
                    boolean[] zArr = this.e;
                    int length2 = zArr == null ? 0 : zArr.length;
                    int i2 = iA3 + length2;
                    boolean[] zArr2 = new boolean[i2];
                    if (length2 != 0) {
                        System.arraycopy(zArr, 0, zArr2, 0, length2);
                    }
                    while (length2 < i2 - 1) {
                        zArr2[length2] = o34Var.k();
                        o34Var.A();
                        length2++;
                    }
                    zArr2[length2] = o34Var.k();
                    this.e = zArr2;
                } else if (iA == 26) {
                    int iJ = o34Var.j(o34Var.v());
                    int iF = o34Var.f();
                    int i3 = 0;
                    while (o34Var.d() > 0) {
                        o34Var.k();
                        i3++;
                    }
                    o34Var.E(iF);
                    boolean[] zArr3 = this.e;
                    int length3 = zArr3 == null ? 0 : zArr3.length;
                    int i4 = i3 + length3;
                    boolean[] zArr4 = new boolean[i4];
                    if (length3 != 0) {
                        System.arraycopy(zArr3, 0, zArr4, 0, length3);
                    }
                    while (length3 < i4) {
                        zArr4[length3] = o34Var.k();
                        length3++;
                    }
                    this.e = zArr4;
                    o34Var.i(iJ);
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public static final class e extends ak8<e> {
        public String c;

        public e() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            return super.b() + CodedOutputByteBufferNano.v(1, this.c);
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m0(1, this.c);
            super.j(codedOutputByteBufferNano);
        }

        public e m() {
            this.c = "";
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
                    this.c = o34Var.z();
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public static final class f extends ak8<f> {
        public String c;
        public int d;

        public f() {
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

        public f m() {
            this.c = "";
            this.d = 0;
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

    public static final class g extends ak8<g> {
        public int c;

        public g() {
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

        public g m() {
            this.c = 0;
            this.f1122b = null;
            this.f15887a = -1;
            return this;
        }

        @Override // defpackage.dsf
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public g e(o34 o34Var) throws IOException {
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

    public static final class h extends ak8<h> {
        public int c;

        public h() {
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

        public h m() {
            this.c = 0;
            this.f1122b = null;
            this.f15887a = -1;
            return this;
        }

        @Override // defpackage.dsf
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public h e(o34 o34Var) throws IOException {
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

    public static final class i extends ak8<i> {
        public i() {
            m();
        }

        public i m() {
            this.f1122b = null;
            this.f15887a = -1;
            return this;
        }

        @Override // defpackage.dsf
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public i e(o34 o34Var) throws IOException {
            int iA;
            do {
                iA = o34Var.A();
                if (iA == 0) {
                    break;
                }
            } while (l(o34Var, iA));
            return this;
        }
    }

    public gyo() {
        m();
    }

    public static gyo[] o() {
        if (f == null) {
            synchronized (afd.c) {
                try {
                    if (f == null) {
                        f = new gyo[0];
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
        int iB = super.b();
        a aVar = this.e;
        if (aVar != null) {
            iB += CodedOutputByteBufferNano.n(1, aVar);
        }
        if (this.c == 2) {
            iB += CodedOutputByteBufferNano.n(2, (dsf) this.d);
        }
        if (this.c == 3) {
            iB += CodedOutputByteBufferNano.n(3, (dsf) this.d);
        }
        return this.c == 4 ? iB + CodedOutputByteBufferNano.n(4, (dsf) this.d) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        a aVar = this.e;
        if (aVar != null) {
            codedOutputByteBufferNano.Y(1, aVar);
        }
        if (this.c == 2) {
            codedOutputByteBufferNano.Y(2, (dsf) this.d);
        }
        if (this.c == 3) {
            codedOutputByteBufferNano.Y(3, (dsf) this.d);
        }
        if (this.c == 4) {
            codedOutputByteBufferNano.Y(4, (dsf) this.d);
        }
        super.j(codedOutputByteBufferNano);
    }

    public gyo m() {
        this.e = null;
        n();
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    public gyo n() {
        this.c = 0;
        this.d = null;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public gyo e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 10) {
                if (this.e == null) {
                    this.e = new a();
                }
                o34Var.q(this.e);
            } else if (iA == 18) {
                if (this.c != 2) {
                    this.d = new e();
                }
                o34Var.q((dsf) this.d);
                this.c = 2;
            } else if (iA == 26) {
                if (this.c != 3) {
                    this.d = new c();
                }
                o34Var.q((dsf) this.d);
                this.c = 3;
            } else if (iA == 34) {
                if (this.c != 4) {
                    this.d = new i();
                }
                o34Var.q((dsf) this.d);
                this.c = 4;
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }

    public gyo q(c cVar) {
        cVar.getClass();
        this.c = 3;
        this.d = cVar;
        return this;
    }

    public gyo r(e eVar) {
        eVar.getClass();
        this.c = 2;
        this.d = eVar;
        return this;
    }
}
