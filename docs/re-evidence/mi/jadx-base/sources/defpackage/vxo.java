package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class vxo extends ak8<vxo> {
    public g c;
    public b d;
    public j e;
    public c f;
    public e g;
    public a h;
    public f i;
    public d j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public h f37340k;

    public static final class a extends ak8<a> {
        public boolean c;
        public boolean d;
        public boolean e;

        public a() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            int iB = super.b() + CodedOutputByteBufferNano.b(1, this.c);
            boolean z = this.d;
            if (z) {
                iB += CodedOutputByteBufferNano.b(2, z);
            }
            boolean z2 = this.e;
            return z2 ? iB + CodedOutputByteBufferNano.b(3, z2) : iB;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.M(1, this.c);
            boolean z = this.d;
            if (z) {
                codedOutputByteBufferNano.M(2, z);
            }
            boolean z2 = this.e;
            if (z2) {
                codedOutputByteBufferNano.M(3, z2);
            }
            super.j(codedOutputByteBufferNano);
        }

        public a m() {
            this.c = false;
            this.d = false;
            this.e = false;
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
                    this.c = o34Var.k();
                } else if (iA == 16) {
                    this.d = o34Var.k();
                } else if (iA == 24) {
                    this.e = o34Var.k();
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public static final class b extends ak8<b> {
        public boolean c;

        public b() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            return super.b() + CodedOutputByteBufferNano.b(1, this.c);
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.M(1, this.c);
            super.j(codedOutputByteBufferNano);
        }

        public b m() {
            this.c = false;
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
                    this.c = o34Var.k();
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public static final class c extends ak8<c> {
        public boolean c;

        public c() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            return super.b() + CodedOutputByteBufferNano.b(1, this.c);
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.M(1, this.c);
            super.j(codedOutputByteBufferNano);
        }

        public c m() {
            this.c = false;
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
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public static final class d extends ak8<d> {
        public boolean c;
        public boolean d;
        public boolean e;
        public int f;

        public d() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            int iB = super.b() + CodedOutputByteBufferNano.b(1, this.c);
            boolean z = this.d;
            if (z) {
                iB += CodedOutputByteBufferNano.b(2, z);
            }
            boolean z2 = this.e;
            if (z2) {
                iB += CodedOutputByteBufferNano.b(3, z2);
            }
            int i = this.f;
            return i != 0 ? iB + CodedOutputByteBufferNano.y(4, i) : iB;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.M(1, this.c);
            boolean z = this.d;
            if (z) {
                codedOutputByteBufferNano.M(2, z);
            }
            boolean z2 = this.e;
            if (z2) {
                codedOutputByteBufferNano.M(3, z2);
            }
            int i = this.f;
            if (i != 0) {
                codedOutputByteBufferNano.p0(4, i);
            }
            super.j(codedOutputByteBufferNano);
        }

        public d m() {
            this.c = false;
            this.d = false;
            this.e = false;
            this.f = 0;
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
                    this.c = o34Var.k();
                } else if (iA == 16) {
                    this.d = o34Var.k();
                } else if (iA == 24) {
                    this.e = o34Var.k();
                } else if (iA == 32) {
                    this.f = o34Var.B();
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public static final class e extends ak8<e> {
        public int c;

        public e() {
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

        public e m() {
            this.c = 0;
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
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public static final class f extends ak8<f> {
        public int c;
        public int d;
        public boolean e;
        public int f;
        public int g;
        public int h;

        public f() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            int iB = super.b() + CodedOutputByteBufferNano.y(1, this.c) + CodedOutputByteBufferNano.y(2, this.d) + CodedOutputByteBufferNano.b(3, this.e);
            int i = this.f;
            if (i != 0) {
                iB += CodedOutputByteBufferNano.y(4, i);
            }
            int i2 = this.g;
            if (i2 != 0) {
                iB += CodedOutputByteBufferNano.y(5, i2);
            }
            int i3 = this.h;
            return i3 != 0 ? iB + CodedOutputByteBufferNano.y(6, i3) : iB;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.p0(1, this.c);
            codedOutputByteBufferNano.p0(2, this.d);
            codedOutputByteBufferNano.M(3, this.e);
            int i = this.f;
            if (i != 0) {
                codedOutputByteBufferNano.p0(4, i);
            }
            int i2 = this.g;
            if (i2 != 0) {
                codedOutputByteBufferNano.p0(5, i2);
            }
            int i3 = this.h;
            if (i3 != 0) {
                codedOutputByteBufferNano.p0(6, i3);
            }
            super.j(codedOutputByteBufferNano);
        }

        public f m() {
            this.c = 0;
            this.d = 0;
            this.e = false;
            this.f = 0;
            this.g = 0;
            this.h = 0;
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
                } else if (iA == 16) {
                    this.d = o34Var.B();
                } else if (iA == 24) {
                    this.e = o34Var.k();
                } else if (iA == 32) {
                    this.f = o34Var.B();
                } else if (iA == 40) {
                    this.g = o34Var.B();
                } else if (iA == 48) {
                    this.h = o34Var.B();
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public static final class g extends ak8<g> {
        public int c;
        public int d;
        public int e;

        public g() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            int iB = super.b() + CodedOutputByteBufferNano.l(1, this.c) + CodedOutputByteBufferNano.l(2, this.d);
            int i = this.e;
            return i != 0 ? iB + CodedOutputByteBufferNano.l(3, i) : iB;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.W(1, this.c);
            codedOutputByteBufferNano.W(2, this.d);
            int i = this.e;
            if (i != 0) {
                codedOutputByteBufferNano.W(3, i);
            }
            super.j(codedOutputByteBufferNano);
        }

        public g m() {
            this.c = 0;
            this.d = 0;
            this.e = 0;
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
                    int iP = o34Var.p();
                    if (iP == 0 || iP == 1 || iP == 2) {
                        this.c = iP;
                    }
                } else if (iA == 16) {
                    int iP2 = o34Var.p();
                    if (iP2 == 0 || iP2 == 1 || iP2 == 2) {
                        this.d = iP2;
                    }
                } else if (iA == 24) {
                    int iP3 = o34Var.p();
                    if (iP3 == 0 || iP3 == 1 || iP3 == 2) {
                        this.e = iP3;
                    }
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public static final class h extends ak8<h> {
        public boolean c;
        public a d;

        public static final class a extends ak8<a> {
            public boolean c;
            public boolean d;

            public a() {
                m();
            }

            @Override // defpackage.ak8, defpackage.dsf
            public int b() {
                return super.b() + CodedOutputByteBufferNano.b(1, this.c) + CodedOutputByteBufferNano.b(2, this.d);
            }

            @Override // defpackage.ak8, defpackage.dsf
            public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
                codedOutputByteBufferNano.M(1, this.c);
                codedOutputByteBufferNano.M(2, this.d);
                super.j(codedOutputByteBufferNano);
            }

            public a m() {
                this.c = false;
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
                    if (iA == 8) {
                        this.c = o34Var.k();
                    } else if (iA == 16) {
                        this.d = o34Var.k();
                    } else if (!l(o34Var, iA)) {
                        return this;
                    }
                }
            }
        }

        public h() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            int iB = super.b() + CodedOutputByteBufferNano.b(1, this.c);
            a aVar = this.d;
            return aVar != null ? iB + CodedOutputByteBufferNano.n(2, aVar) : iB;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.M(1, this.c);
            a aVar = this.d;
            if (aVar != null) {
                codedOutputByteBufferNano.Y(2, aVar);
            }
            super.j(codedOutputByteBufferNano);
        }

        public h m() {
            this.c = false;
            this.d = null;
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
                    this.c = o34Var.k();
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

    public static final class i extends ak8<i> {
        public int c;

        public i() {
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

        public i m() {
            this.c = 0;
            this.f1122b = null;
            this.f15887a = -1;
            return this;
        }

        @Override // defpackage.dsf
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public i e(o34 o34Var) throws IOException {
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

    public static final class j extends ak8<j> {
        public int c;
        public a d;

        public static final class a extends ak8<a> {
            public int c;
            public long d;

            public a() {
                m();
            }

            @Override // defpackage.ak8, defpackage.dsf
            public int b() {
                int iB = super.b() + CodedOutputByteBufferNano.l(1, this.c);
                long j = this.d;
                return j != 0 ? iB + CodedOutputByteBufferNano.A(2, j) : iB;
            }

            @Override // defpackage.ak8, defpackage.dsf
            public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
                codedOutputByteBufferNano.W(1, this.c);
                long j = this.d;
                if (j != 0) {
                    codedOutputByteBufferNano.r0(2, j);
                }
                super.j(codedOutputByteBufferNano);
            }

            public a m() {
                this.c = 0;
                this.d = 0L;
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
                        int iP = o34Var.p();
                        if (iP == 0 || iP == 1 || iP == 2) {
                            this.c = iP;
                        }
                    } else if (iA == 16) {
                        this.d = o34Var.C();
                    } else if (!l(o34Var, iA)) {
                        return this;
                    }
                }
            }
        }

        public j() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            int iB = super.b() + CodedOutputByteBufferNano.l(1, this.c);
            a aVar = this.d;
            return aVar != null ? iB + CodedOutputByteBufferNano.n(2, aVar) : iB;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.W(1, this.c);
            a aVar = this.d;
            if (aVar != null) {
                codedOutputByteBufferNano.Y(2, aVar);
            }
            super.j(codedOutputByteBufferNano);
        }

        public j m() {
            this.c = 0;
            this.d = null;
            this.f1122b = null;
            this.f15887a = -1;
            return this;
        }

        @Override // defpackage.dsf
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public j e(o34 o34Var) throws IOException {
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

    public vxo() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b();
        g gVar = this.c;
        if (gVar != null) {
            iB += CodedOutputByteBufferNano.n(1, gVar);
        }
        b bVar = this.d;
        if (bVar != null) {
            iB += CodedOutputByteBufferNano.n(2, bVar);
        }
        j jVar = this.e;
        if (jVar != null) {
            iB += CodedOutputByteBufferNano.n(3, jVar);
        }
        c cVar = this.f;
        if (cVar != null) {
            iB += CodedOutputByteBufferNano.n(4, cVar);
        }
        e eVar = this.g;
        if (eVar != null) {
            iB += CodedOutputByteBufferNano.n(5, eVar);
        }
        a aVar = this.h;
        if (aVar != null) {
            iB += CodedOutputByteBufferNano.n(6, aVar);
        }
        f fVar = this.i;
        if (fVar != null) {
            iB += CodedOutputByteBufferNano.n(7, fVar);
        }
        d dVar = this.j;
        if (dVar != null) {
            iB += CodedOutputByteBufferNano.n(8, dVar);
        }
        h hVar = this.f37340k;
        return hVar != null ? iB + CodedOutputByteBufferNano.n(9, hVar) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        g gVar = this.c;
        if (gVar != null) {
            codedOutputByteBufferNano.Y(1, gVar);
        }
        b bVar = this.d;
        if (bVar != null) {
            codedOutputByteBufferNano.Y(2, bVar);
        }
        j jVar = this.e;
        if (jVar != null) {
            codedOutputByteBufferNano.Y(3, jVar);
        }
        c cVar = this.f;
        if (cVar != null) {
            codedOutputByteBufferNano.Y(4, cVar);
        }
        e eVar = this.g;
        if (eVar != null) {
            codedOutputByteBufferNano.Y(5, eVar);
        }
        a aVar = this.h;
        if (aVar != null) {
            codedOutputByteBufferNano.Y(6, aVar);
        }
        f fVar = this.i;
        if (fVar != null) {
            codedOutputByteBufferNano.Y(7, fVar);
        }
        d dVar = this.j;
        if (dVar != null) {
            codedOutputByteBufferNano.Y(8, dVar);
        }
        h hVar = this.f37340k;
        if (hVar != null) {
            codedOutputByteBufferNano.Y(9, hVar);
        }
        super.j(codedOutputByteBufferNano);
    }

    public vxo m() {
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.f37340k = null;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public vxo e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 10) {
                if (this.c == null) {
                    this.c = new g();
                }
                o34Var.q(this.c);
            } else if (iA == 18) {
                if (this.d == null) {
                    this.d = new b();
                }
                o34Var.q(this.d);
            } else if (iA == 26) {
                if (this.e == null) {
                    this.e = new j();
                }
                o34Var.q(this.e);
            } else if (iA == 34) {
                if (this.f == null) {
                    this.f = new c();
                }
                o34Var.q(this.f);
            } else if (iA == 42) {
                if (this.g == null) {
                    this.g = new e();
                }
                o34Var.q(this.g);
            } else if (iA == 50) {
                if (this.h == null) {
                    this.h = new a();
                }
                o34Var.q(this.h);
            } else if (iA == 58) {
                if (this.i == null) {
                    this.i = new f();
                }
                o34Var.q(this.i);
            } else if (iA == 66) {
                if (this.j == null) {
                    this.j = new d();
                }
                o34Var.q(this.j);
            } else if (iA == 74) {
                if (this.f37340k == null) {
                    this.f37340k = new h();
                }
                o34Var.q(this.f37340k);
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
