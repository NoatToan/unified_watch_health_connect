package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class ecp extends ak8<ecp> {
    public long c;
    public int d;
    public b[] e;
    public a[] f;

    public static final class a extends ak8<a> {
        public static volatile a[] i;
        public String c;
        public int d;
        public int e;
        public int f;
        public String g;
        public String h;

        public a() {
            m();
        }

        public static a[] n() {
            if (i == null) {
                synchronized (afd.c) {
                    try {
                        if (i == null) {
                            i = new a[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return i;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            int iB = super.b() + CodedOutputByteBufferNano.v(1, this.c) + CodedOutputByteBufferNano.y(2, this.d) + CodedOutputByteBufferNano.y(3, this.e) + CodedOutputByteBufferNano.y(4, this.f);
            if (!this.g.equals("")) {
                iB += CodedOutputByteBufferNano.v(5, this.g);
            }
            return !this.h.equals("") ? iB + CodedOutputByteBufferNano.v(6, this.h) : iB;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m0(1, this.c);
            codedOutputByteBufferNano.p0(2, this.d);
            codedOutputByteBufferNano.p0(3, this.e);
            codedOutputByteBufferNano.p0(4, this.f);
            if (!this.g.equals("")) {
                codedOutputByteBufferNano.m0(5, this.g);
            }
            if (!this.h.equals("")) {
                codedOutputByteBufferNano.m0(6, this.h);
            }
            super.j(codedOutputByteBufferNano);
        }

        public a m() {
            this.c = "";
            this.d = 0;
            this.e = 0;
            this.f = 0;
            this.g = "";
            this.h = "";
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
                    this.d = o34Var.B();
                } else if (iA == 24) {
                    this.e = o34Var.B();
                } else if (iA == 32) {
                    this.f = o34Var.B();
                } else if (iA == 42) {
                    this.g = o34Var.z();
                } else if (iA == 50) {
                    this.h = o34Var.z();
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public static final class b extends ak8<b> {
        public static volatile b[] e;
        public t64 c;
        public t64 d;

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
            int iB = super.b();
            t64 t64Var = this.c;
            if (t64Var != null) {
                iB += CodedOutputByteBufferNano.n(1, t64Var);
            }
            t64 t64Var2 = this.d;
            return t64Var2 != null ? iB + CodedOutputByteBufferNano.n(2, t64Var2) : iB;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            t64 t64Var = this.c;
            if (t64Var != null) {
                codedOutputByteBufferNano.Y(1, t64Var);
            }
            t64 t64Var2 = this.d;
            if (t64Var2 != null) {
                codedOutputByteBufferNano.Y(2, t64Var2);
            }
            super.j(codedOutputByteBufferNano);
        }

        public b m() {
            this.c = null;
            this.d = null;
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
                if (iA == 10) {
                    if (this.c == null) {
                        this.c = new t64();
                    }
                    o34Var.q(this.c);
                } else if (iA == 18) {
                    if (this.d == null) {
                        this.d = new t64();
                    }
                    o34Var.q(this.d);
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public ecp() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b() + CodedOutputByteBufferNano.A(1, this.c) + CodedOutputByteBufferNano.y(2, this.d);
        b[] bVarArr = this.e;
        int i = 0;
        if (bVarArr != null && bVarArr.length > 0) {
            int i2 = 0;
            while (true) {
                b[] bVarArr2 = this.e;
                if (i2 >= bVarArr2.length) {
                    break;
                }
                b bVar = bVarArr2[i2];
                if (bVar != null) {
                    iB += CodedOutputByteBufferNano.n(3, bVar);
                }
                i2++;
            }
        }
        a[] aVarArr = this.f;
        if (aVarArr != null && aVarArr.length > 0) {
            while (true) {
                a[] aVarArr2 = this.f;
                if (i >= aVarArr2.length) {
                    break;
                }
                a aVar = aVarArr2[i];
                if (aVar != null) {
                    iB += CodedOutputByteBufferNano.n(4, aVar);
                }
                i++;
            }
        }
        return iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.r0(1, this.c);
        codedOutputByteBufferNano.p0(2, this.d);
        b[] bVarArr = this.e;
        int i = 0;
        if (bVarArr != null && bVarArr.length > 0) {
            int i2 = 0;
            while (true) {
                b[] bVarArr2 = this.e;
                if (i2 >= bVarArr2.length) {
                    break;
                }
                b bVar = bVarArr2[i2];
                if (bVar != null) {
                    codedOutputByteBufferNano.Y(3, bVar);
                }
                i2++;
            }
        }
        a[] aVarArr = this.f;
        if (aVarArr != null && aVarArr.length > 0) {
            while (true) {
                a[] aVarArr2 = this.f;
                if (i >= aVarArr2.length) {
                    break;
                }
                a aVar = aVarArr2[i];
                if (aVar != null) {
                    codedOutputByteBufferNano.Y(4, aVar);
                }
                i++;
            }
        }
        super.j(codedOutputByteBufferNano);
    }

    public ecp m() {
        this.c = 0L;
        this.d = 0;
        this.e = b.n();
        this.f = a.n();
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public ecp e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 8) {
                this.c = o34Var.C();
            } else if (iA == 16) {
                this.d = o34Var.B();
            } else if (iA == 26) {
                int iA2 = bmr.a(o34Var, 26);
                b[] bVarArr = this.e;
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
                this.e = bVarArr2;
            } else if (iA == 34) {
                int iA3 = bmr.a(o34Var, 34);
                a[] aVarArr = this.f;
                int length2 = aVarArr == null ? 0 : aVarArr.length;
                int i2 = iA3 + length2;
                a[] aVarArr2 = new a[i2];
                if (length2 != 0) {
                    System.arraycopy(aVarArr, 0, aVarArr2, 0, length2);
                }
                while (length2 < i2 - 1) {
                    a aVar = new a();
                    aVarArr2[length2] = aVar;
                    o34Var.q(aVar);
                    o34Var.A();
                    length2++;
                }
                a aVar2 = new a();
                aVarArr2[length2] = aVar2;
                o34Var.q(aVar2);
                this.f = aVarArr2;
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
