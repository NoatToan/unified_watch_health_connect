package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class hcp extends ak8<hcp> {
    public static volatile hcp[] f;
    public long c;
    public long d;
    public String e;

    public static final class a extends ak8<a> {
        public hcp[] c;

        public a() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            int iB = super.b();
            hcp[] hcpVarArr = this.c;
            if (hcpVarArr != null && hcpVarArr.length > 0) {
                int i = 0;
                while (true) {
                    hcp[] hcpVarArr2 = this.c;
                    if (i >= hcpVarArr2.length) {
                        break;
                    }
                    hcp hcpVar = hcpVarArr2[i];
                    if (hcpVar != null) {
                        iB += CodedOutputByteBufferNano.n(1, hcpVar);
                    }
                    i++;
                }
            }
            return iB;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            hcp[] hcpVarArr = this.c;
            if (hcpVarArr != null && hcpVarArr.length > 0) {
                int i = 0;
                while (true) {
                    hcp[] hcpVarArr2 = this.c;
                    if (i >= hcpVarArr2.length) {
                        break;
                    }
                    hcp hcpVar = hcpVarArr2[i];
                    if (hcpVar != null) {
                        codedOutputByteBufferNano.Y(1, hcpVar);
                    }
                    i++;
                }
            }
            super.j(codedOutputByteBufferNano);
        }

        public a m() {
            this.c = hcp.n();
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
                    hcp[] hcpVarArr = this.c;
                    int length = hcpVarArr == null ? 0 : hcpVarArr.length;
                    int i = iA2 + length;
                    hcp[] hcpVarArr2 = new hcp[i];
                    if (length != 0) {
                        System.arraycopy(hcpVarArr, 0, hcpVarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        hcp hcpVar = new hcp();
                        hcpVarArr2[length] = hcpVar;
                        o34Var.q(hcpVar);
                        o34Var.A();
                        length++;
                    }
                    hcp hcpVar2 = new hcp();
                    hcpVarArr2[length] = hcpVar2;
                    o34Var.q(hcpVar2);
                    this.c = hcpVarArr2;
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public static final class b extends ak8<b> {
        public b() {
            m();
        }

        public b m() {
            this.f1122b = null;
            this.f15887a = -1;
            return this;
        }

        @Override // defpackage.dsf
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public b e(o34 o34Var) throws IOException {
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

    public static final class c extends ak8<c> {
        public static volatile c[] g;
        public long c;
        public String d;
        public int e;
        public long f;

        public static final class a extends ak8<a> {
            public long c;
            public int d;

            public a() {
                m();
            }

            @Override // defpackage.ak8, defpackage.dsf
            public int b() {
                return super.b() + CodedOutputByteBufferNano.A(1, this.c) + CodedOutputByteBufferNano.y(2, this.d);
            }

            @Override // defpackage.ak8, defpackage.dsf
            public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
                codedOutputByteBufferNano.r0(1, this.c);
                codedOutputByteBufferNano.p0(2, this.d);
                super.j(codedOutputByteBufferNano);
            }

            public a m() {
                this.c = 0L;
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
                        this.c = o34Var.C();
                    } else if (iA == 16) {
                        this.d = o34Var.B();
                    } else if (!l(o34Var, iA)) {
                        return this;
                    }
                }
            }
        }

        public static final class b extends ak8<b> {
            public long c;
            public c[] d;

            public b() {
                m();
            }

            @Override // defpackage.ak8, defpackage.dsf
            public int b() {
                int iB = super.b() + CodedOutputByteBufferNano.A(1, this.c);
                c[] cVarArr = this.d;
                if (cVarArr != null && cVarArr.length > 0) {
                    int i = 0;
                    while (true) {
                        c[] cVarArr2 = this.d;
                        if (i >= cVarArr2.length) {
                            break;
                        }
                        c cVar = cVarArr2[i];
                        if (cVar != null) {
                            iB += CodedOutputByteBufferNano.n(2, cVar);
                        }
                        i++;
                    }
                }
                return iB;
            }

            @Override // defpackage.ak8, defpackage.dsf
            public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
                codedOutputByteBufferNano.r0(1, this.c);
                c[] cVarArr = this.d;
                if (cVarArr != null && cVarArr.length > 0) {
                    int i = 0;
                    while (true) {
                        c[] cVarArr2 = this.d;
                        if (i >= cVarArr2.length) {
                            break;
                        }
                        c cVar = cVarArr2[i];
                        if (cVar != null) {
                            codedOutputByteBufferNano.Y(2, cVar);
                        }
                        i++;
                    }
                }
                super.j(codedOutputByteBufferNano);
            }

            public b m() {
                this.c = 0L;
                this.d = c.n();
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
                    } else if (iA == 18) {
                        int iA2 = bmr.a(o34Var, 18);
                        c[] cVarArr = this.d;
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
                        this.d = cVarArr2;
                    } else if (!l(o34Var, iA)) {
                        return this;
                    }
                }
            }
        }

        /* JADX INFO: renamed from: hcp$c$c, reason: collision with other inner class name */
        public static final class C0953c extends ak8<C0953c> {
            public long c;
            public long d;

            public C0953c() {
                m();
            }

            @Override // defpackage.ak8, defpackage.dsf
            public int b() {
                return super.b() + CodedOutputByteBufferNano.A(1, this.c) + CodedOutputByteBufferNano.A(2, this.d);
            }

            @Override // defpackage.ak8, defpackage.dsf
            public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
                codedOutputByteBufferNano.r0(1, this.c);
                codedOutputByteBufferNano.r0(2, this.d);
                super.j(codedOutputByteBufferNano);
            }

            public C0953c m() {
                this.c = 0L;
                this.d = 0L;
                this.f1122b = null;
                this.f15887a = -1;
                return this;
            }

            @Override // defpackage.dsf
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public C0953c e(o34 o34Var) throws IOException {
                while (true) {
                    int iA = o34Var.A();
                    if (iA == 0) {
                        return this;
                    }
                    if (iA == 8) {
                        this.c = o34Var.C();
                    } else if (iA == 16) {
                        this.d = o34Var.C();
                    } else if (!l(o34Var, iA)) {
                        return this;
                    }
                }
            }
        }

        public static final class d extends ak8<d> {
            public boolean c;

            public d() {
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

            public d m() {
                this.c = false;
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
            if (g == null) {
                synchronized (afd.c) {
                    try {
                        if (g == null) {
                            g = new c[0];
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
            int iB = super.b() + CodedOutputByteBufferNano.A(1, this.c) + CodedOutputByteBufferNano.v(2, this.d) + CodedOutputByteBufferNano.y(3, this.e);
            long j = this.f;
            return j != 0 ? iB + CodedOutputByteBufferNano.A(4, j) : iB;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.r0(1, this.c);
            codedOutputByteBufferNano.m0(2, this.d);
            codedOutputByteBufferNano.p0(3, this.e);
            long j = this.f;
            if (j != 0) {
                codedOutputByteBufferNano.r0(4, j);
            }
            super.j(codedOutputByteBufferNano);
        }

        public c m() {
            this.c = 0L;
            this.d = "";
            this.e = 0;
            this.f = 0L;
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
                    this.c = o34Var.C();
                } else if (iA == 18) {
                    this.d = o34Var.z();
                } else if (iA == 24) {
                    this.e = o34Var.B();
                } else if (iA == 32) {
                    this.f = o34Var.C();
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public hcp() {
        m();
    }

    public static hcp[] n() {
        if (f == null) {
            synchronized (afd.c) {
                try {
                    if (f == null) {
                        f = new hcp[0];
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
        return super.b() + CodedOutputByteBufferNano.A(1, this.c) + CodedOutputByteBufferNano.A(2, this.d) + CodedOutputByteBufferNano.v(3, this.e);
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.r0(1, this.c);
        codedOutputByteBufferNano.r0(2, this.d);
        codedOutputByteBufferNano.m0(3, this.e);
        super.j(codedOutputByteBufferNano);
    }

    public hcp m() {
        this.c = 0L;
        this.d = 0L;
        this.e = "";
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public hcp e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 8) {
                this.c = o34Var.C();
            } else if (iA == 16) {
                this.d = o34Var.C();
            } else if (iA == 26) {
                this.e = o34Var.z();
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
