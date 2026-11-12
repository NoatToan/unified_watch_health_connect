package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class wkf extends ak8<wkf> {
    public static volatile wkf[] h;
    public a c;
    public int d;
    public int e;
    public long f;
    public int g;

    public static final class a extends ak8<a> {
        public static volatile a[] e;
        public String c;
        public boolean d;

        /* JADX INFO: renamed from: wkf$a$a, reason: collision with other inner class name */
        public static final class C1133a extends ak8<C1133a> {
            public a[] c;

            public C1133a() {
                m();
            }

            @Override // defpackage.ak8, defpackage.dsf
            public int b() {
                int iB = super.b();
                a[] aVarArr = this.c;
                if (aVarArr != null && aVarArr.length > 0) {
                    int i = 0;
                    while (true) {
                        a[] aVarArr2 = this.c;
                        if (i >= aVarArr2.length) {
                            break;
                        }
                        a aVar = aVarArr2[i];
                        if (aVar != null) {
                            iB += CodedOutputByteBufferNano.n(1, aVar);
                        }
                        i++;
                    }
                }
                return iB;
            }

            @Override // defpackage.ak8, defpackage.dsf
            public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
                a[] aVarArr = this.c;
                if (aVarArr != null && aVarArr.length > 0) {
                    int i = 0;
                    while (true) {
                        a[] aVarArr2 = this.c;
                        if (i >= aVarArr2.length) {
                            break;
                        }
                        a aVar = aVarArr2[i];
                        if (aVar != null) {
                            codedOutputByteBufferNano.Y(1, aVar);
                        }
                        i++;
                    }
                }
                super.j(codedOutputByteBufferNano);
            }

            public C1133a m() {
                this.c = a.n();
                this.f1122b = null;
                this.f15887a = -1;
                return this;
            }

            @Override // defpackage.dsf
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public C1133a e(o34 o34Var) throws IOException {
                while (true) {
                    int iA = o34Var.A();
                    if (iA == 0) {
                        return this;
                    }
                    if (iA == 10) {
                        int iA2 = bmr.a(o34Var, 10);
                        a[] aVarArr = this.c;
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
                        this.c = aVarArr2;
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
            return super.b() + CodedOutputByteBufferNano.v(1, this.c) + CodedOutputByteBufferNano.b(2, this.d);
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m0(1, this.c);
            codedOutputByteBufferNano.M(2, this.d);
            super.j(codedOutputByteBufferNano);
        }

        public a m() {
            this.c = "";
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
                if (iA == 10) {
                    this.c = o34Var.z();
                } else if (iA == 16) {
                    this.d = o34Var.k();
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public static final class b extends ak8<b> {
        public wkf[] c;

        public b() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            int iB = super.b();
            wkf[] wkfVarArr = this.c;
            if (wkfVarArr != null && wkfVarArr.length > 0) {
                int i = 0;
                while (true) {
                    wkf[] wkfVarArr2 = this.c;
                    if (i >= wkfVarArr2.length) {
                        break;
                    }
                    wkf wkfVar = wkfVarArr2[i];
                    if (wkfVar != null) {
                        iB += CodedOutputByteBufferNano.n(1, wkfVar);
                    }
                    i++;
                }
            }
            return iB;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            wkf[] wkfVarArr = this.c;
            if (wkfVarArr != null && wkfVarArr.length > 0) {
                int i = 0;
                while (true) {
                    wkf[] wkfVarArr2 = this.c;
                    if (i >= wkfVarArr2.length) {
                        break;
                    }
                    wkf wkfVar = wkfVarArr2[i];
                    if (wkfVar != null) {
                        codedOutputByteBufferNano.Y(1, wkfVar);
                    }
                    i++;
                }
            }
            super.j(codedOutputByteBufferNano);
        }

        public b m() {
            this.c = wkf.n();
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
                    wkf[] wkfVarArr = this.c;
                    int length = wkfVarArr == null ? 0 : wkfVarArr.length;
                    int i = iA2 + length;
                    wkf[] wkfVarArr2 = new wkf[i];
                    if (length != 0) {
                        System.arraycopy(wkfVarArr, 0, wkfVarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        wkf wkfVar = new wkf();
                        wkfVarArr2[length] = wkfVar;
                        o34Var.q(wkfVar);
                        o34Var.A();
                        length++;
                    }
                    wkf wkfVar2 = new wkf();
                    wkfVarArr2[length] = wkfVar2;
                    o34Var.q(wkfVar2);
                    this.c = wkfVarArr2;
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public static final class c extends ak8<c> {
        public a[] c;

        public static final class a extends ak8<a> {
            public static volatile a[] e;
            public int c;
            public int d;

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
                return super.b() + CodedOutputByteBufferNano.l(1, this.c) + CodedOutputByteBufferNano.y(2, this.d);
            }

            @Override // defpackage.ak8, defpackage.dsf
            public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
                codedOutputByteBufferNano.W(1, this.c);
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
            /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
            public a e(o34 o34Var) throws IOException {
                while (true) {
                    int iA = o34Var.A();
                    if (iA == 0) {
                        return this;
                    }
                    if (iA == 8) {
                        int iP = o34Var.p();
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
                            case 9:
                            case 10:
                            case 11:
                                this.c = iP;
                                break;
                        }
                    } else if (iA == 16) {
                        this.d = o34Var.B();
                    } else if (!l(o34Var, iA)) {
                        return this;
                    }
                }
            }
        }

        public c() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            int iB = super.b();
            a[] aVarArr = this.c;
            if (aVarArr != null && aVarArr.length > 0) {
                int i = 0;
                while (true) {
                    a[] aVarArr2 = this.c;
                    if (i >= aVarArr2.length) {
                        break;
                    }
                    a aVar = aVarArr2[i];
                    if (aVar != null) {
                        iB += CodedOutputByteBufferNano.n(1, aVar);
                    }
                    i++;
                }
            }
            return iB;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            a[] aVarArr = this.c;
            if (aVarArr != null && aVarArr.length > 0) {
                int i = 0;
                while (true) {
                    a[] aVarArr2 = this.c;
                    if (i >= aVarArr2.length) {
                        break;
                    }
                    a aVar = aVarArr2[i];
                    if (aVar != null) {
                        codedOutputByteBufferNano.Y(1, aVar);
                    }
                    i++;
                }
            }
            super.j(codedOutputByteBufferNano);
        }

        public c m() {
            this.c = a.n();
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
                    a[] aVarArr = this.c;
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
                    this.c = aVarArr2;
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public wkf() {
        m();
    }

    public static wkf[] n() {
        if (h == null) {
            synchronized (afd.c) {
                try {
                    if (h == null) {
                        h = new wkf[0];
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
        int iB = super.b();
        a aVar = this.c;
        if (aVar != null) {
            iB += CodedOutputByteBufferNano.n(1, aVar);
        }
        int iL = iB + CodedOutputByteBufferNano.l(2, this.d) + CodedOutputByteBufferNano.y(3, this.e) + CodedOutputByteBufferNano.A(4, this.f);
        int i = this.g;
        return i != 0 ? iL + CodedOutputByteBufferNano.y(5, i) : iL;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        a aVar = this.c;
        if (aVar != null) {
            codedOutputByteBufferNano.Y(1, aVar);
        }
        codedOutputByteBufferNano.W(2, this.d);
        codedOutputByteBufferNano.p0(3, this.e);
        codedOutputByteBufferNano.r0(4, this.f);
        int i = this.g;
        if (i != 0) {
            codedOutputByteBufferNano.p0(5, i);
        }
        super.j(codedOutputByteBufferNano);
    }

    public wkf m() {
        this.c = null;
        this.d = 0;
        this.e = 0;
        this.f = 0L;
        this.g = 0;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public wkf e(o34 o34Var) throws IOException {
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
            } else if (iA == 16) {
                int iP = o34Var.p();
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
                    case 9:
                    case 10:
                    case 11:
                        this.d = iP;
                        break;
                }
            } else if (iA == 24) {
                this.e = o34Var.B();
            } else if (iA == 32) {
                this.f = o34Var.C();
            } else if (iA == 40) {
                this.g = o34Var.B();
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
