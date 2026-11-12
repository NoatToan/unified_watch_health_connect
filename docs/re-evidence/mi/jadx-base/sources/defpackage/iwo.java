package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class iwo extends ak8<iwo> {
    public a c;
    public h d;
    public g e;
    public e f;
    public c g;
    public b h;
    public i i;
    public f j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public d f22177k;

    public static final class a extends ak8<a> {
        public int c;
        public int d;

        public a() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            return super.b() + CodedOutputByteBufferNano.y(1, this.c) + CodedOutputByteBufferNano.y(2, this.d);
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.p0(1, this.c);
            codedOutputByteBufferNano.p0(2, this.d);
            super.j(codedOutputByteBufferNano);
        }

        public a m() {
            this.c = 0;
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

    public static final class b extends ak8<b> {
        public int c;

        public b() {
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

        public b m() {
            this.c = 0;
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
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public static final class c extends ak8<c> {
        public int c;
        public int d;

        public c() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            return super.b() + CodedOutputByteBufferNano.y(1, this.c) + CodedOutputByteBufferNano.y(2, this.d);
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.p0(1, this.c);
            codedOutputByteBufferNano.p0(2, this.d);
            super.j(codedOutputByteBufferNano);
        }

        public c m() {
            this.c = 0;
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

    public static final class e extends ak8<e> {
        public int c;
        public int d;

        public e() {
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

        public e m() {
            this.c = 0;
            this.d = 0;
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
                    this.d = o34Var.B();
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
        public boolean c;
        public int d;

        public h() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            return super.b() + CodedOutputByteBufferNano.b(1, this.c) + CodedOutputByteBufferNano.r(2, this.d);
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.M(1, this.c);
            codedOutputByteBufferNano.i0(2, this.d);
            super.j(codedOutputByteBufferNano);
        }

        public h m() {
            this.c = false;
            this.d = 0;
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
                } else if (iA == 16) {
                    this.d = o34Var.x();
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

    public iwo() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b();
        a aVar = this.c;
        if (aVar != null) {
            iB += CodedOutputByteBufferNano.n(1, aVar);
        }
        h hVar = this.d;
        if (hVar != null) {
            iB += CodedOutputByteBufferNano.n(2, hVar);
        }
        g gVar = this.e;
        if (gVar != null) {
            iB += CodedOutputByteBufferNano.n(3, gVar);
        }
        e eVar = this.f;
        if (eVar != null) {
            iB += CodedOutputByteBufferNano.n(4, eVar);
        }
        c cVar = this.g;
        if (cVar != null) {
            iB += CodedOutputByteBufferNano.n(5, cVar);
        }
        b bVar = this.h;
        if (bVar != null) {
            iB += CodedOutputByteBufferNano.n(6, bVar);
        }
        i iVar = this.i;
        if (iVar != null) {
            iB += CodedOutputByteBufferNano.n(7, iVar);
        }
        f fVar = this.j;
        if (fVar != null) {
            iB += CodedOutputByteBufferNano.n(8, fVar);
        }
        d dVar = this.f22177k;
        return dVar != null ? iB + CodedOutputByteBufferNano.n(9, dVar) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        a aVar = this.c;
        if (aVar != null) {
            codedOutputByteBufferNano.Y(1, aVar);
        }
        h hVar = this.d;
        if (hVar != null) {
            codedOutputByteBufferNano.Y(2, hVar);
        }
        g gVar = this.e;
        if (gVar != null) {
            codedOutputByteBufferNano.Y(3, gVar);
        }
        e eVar = this.f;
        if (eVar != null) {
            codedOutputByteBufferNano.Y(4, eVar);
        }
        c cVar = this.g;
        if (cVar != null) {
            codedOutputByteBufferNano.Y(5, cVar);
        }
        b bVar = this.h;
        if (bVar != null) {
            codedOutputByteBufferNano.Y(6, bVar);
        }
        i iVar = this.i;
        if (iVar != null) {
            codedOutputByteBufferNano.Y(7, iVar);
        }
        f fVar = this.j;
        if (fVar != null) {
            codedOutputByteBufferNano.Y(8, fVar);
        }
        d dVar = this.f22177k;
        if (dVar != null) {
            codedOutputByteBufferNano.Y(9, dVar);
        }
        super.j(codedOutputByteBufferNano);
    }

    public iwo m() {
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.f22177k = null;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public iwo e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 10) {
                if (this.c == null) {
                    this.c = new a();
                }
                o34Var.q(this.c);
            } else if (iA == 18) {
                if (this.d == null) {
                    this.d = new h();
                }
                o34Var.q(this.d);
            } else if (iA == 26) {
                if (this.e == null) {
                    this.e = new g();
                }
                o34Var.q(this.e);
            } else if (iA == 34) {
                if (this.f == null) {
                    this.f = new e();
                }
                o34Var.q(this.f);
            } else if (iA == 42) {
                if (this.g == null) {
                    this.g = new c();
                }
                o34Var.q(this.g);
            } else if (iA == 50) {
                if (this.h == null) {
                    this.h = new b();
                }
                o34Var.q(this.h);
            } else if (iA == 58) {
                if (this.i == null) {
                    this.i = new i();
                }
                o34Var.q(this.i);
            } else if (iA == 66) {
                if (this.j == null) {
                    this.j = new f();
                }
                o34Var.q(this.j);
            } else if (iA == 74) {
                if (this.f22177k == null) {
                    this.f22177k = new d();
                }
                o34Var.q(this.f22177k);
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
