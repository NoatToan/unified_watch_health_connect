package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class g9r extends ak8<g9r> {
    public h9r c;
    public a.C0942a d;

    public static final class a extends ak8<a> {
        public static volatile a[] i;
        public p64 c;
        public s64 d;
        public s64 e;
        public String f;
        public d9r g;
        public p64 h;

        /* JADX INFO: renamed from: g9r$a$a, reason: collision with other inner class name */
        public static final class C0942a extends ak8<C0942a> {
            public a[] c;

            public C0942a() {
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

            public C0942a m() {
                this.c = a.n();
                this.f1122b = null;
                this.f15887a = -1;
                return this;
            }

            @Override // defpackage.dsf
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public C0942a e(o34 o34Var) throws IOException {
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
            int iB = super.b();
            p64 p64Var = this.c;
            if (p64Var != null) {
                iB += CodedOutputByteBufferNano.n(1, p64Var);
            }
            s64 s64Var = this.d;
            if (s64Var != null) {
                iB += CodedOutputByteBufferNano.n(2, s64Var);
            }
            s64 s64Var2 = this.e;
            if (s64Var2 != null) {
                iB += CodedOutputByteBufferNano.n(3, s64Var2);
            }
            if (!this.f.equals("")) {
                iB += CodedOutputByteBufferNano.v(4, this.f);
            }
            d9r d9rVar = this.g;
            if (d9rVar != null) {
                iB += CodedOutputByteBufferNano.n(5, d9rVar);
            }
            p64 p64Var2 = this.h;
            return p64Var2 != null ? iB + CodedOutputByteBufferNano.n(6, p64Var2) : iB;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            p64 p64Var = this.c;
            if (p64Var != null) {
                codedOutputByteBufferNano.Y(1, p64Var);
            }
            s64 s64Var = this.d;
            if (s64Var != null) {
                codedOutputByteBufferNano.Y(2, s64Var);
            }
            s64 s64Var2 = this.e;
            if (s64Var2 != null) {
                codedOutputByteBufferNano.Y(3, s64Var2);
            }
            if (!this.f.equals("")) {
                codedOutputByteBufferNano.m0(4, this.f);
            }
            d9r d9rVar = this.g;
            if (d9rVar != null) {
                codedOutputByteBufferNano.Y(5, d9rVar);
            }
            p64 p64Var2 = this.h;
            if (p64Var2 != null) {
                codedOutputByteBufferNano.Y(6, p64Var2);
            }
            super.j(codedOutputByteBufferNano);
        }

        public a m() {
            this.c = null;
            this.d = null;
            this.e = null;
            this.f = "";
            this.g = null;
            this.h = null;
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
                    if (this.c == null) {
                        this.c = new p64();
                    }
                    o34Var.q(this.c);
                } else if (iA == 18) {
                    if (this.d == null) {
                        this.d = new s64();
                    }
                    o34Var.q(this.d);
                } else if (iA == 26) {
                    if (this.e == null) {
                        this.e = new s64();
                    }
                    o34Var.q(this.e);
                } else if (iA == 34) {
                    this.f = o34Var.z();
                } else if (iA == 42) {
                    if (this.g == null) {
                        this.g = new d9r();
                    }
                    o34Var.q(this.g);
                } else if (iA == 50) {
                    if (this.h == null) {
                        this.h = new p64();
                    }
                    o34Var.q(this.h);
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public g9r() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b();
        h9r h9rVar = this.c;
        if (h9rVar != null) {
            iB += CodedOutputByteBufferNano.n(1, h9rVar);
        }
        a.C0942a c0942a = this.d;
        return c0942a != null ? iB + CodedOutputByteBufferNano.n(2, c0942a) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        h9r h9rVar = this.c;
        if (h9rVar != null) {
            codedOutputByteBufferNano.Y(1, h9rVar);
        }
        a.C0942a c0942a = this.d;
        if (c0942a != null) {
            codedOutputByteBufferNano.Y(2, c0942a);
        }
        super.j(codedOutputByteBufferNano);
    }

    public g9r m() {
        this.c = null;
        this.d = null;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public g9r e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 10) {
                if (this.c == null) {
                    this.c = new h9r();
                }
                o34Var.q(this.c);
            } else if (iA == 18) {
                if (this.d == null) {
                    this.d = new a.C0942a();
                }
                o34Var.q(this.d);
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
