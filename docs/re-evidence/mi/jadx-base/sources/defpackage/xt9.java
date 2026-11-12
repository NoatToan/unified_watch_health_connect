package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class xt9 extends ak8<xt9> {
    public c[] c;
    public a d;

    public static final class a extends ak8<a> {
        public int c;
        public int d;
        public int e;

        public a() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            int iB = super.b() + CodedOutputByteBufferNano.y(1, this.c);
            int i = this.d;
            if (i != 0) {
                iB += CodedOutputByteBufferNano.y(2, i);
            }
            int i2 = this.e;
            return i2 != 0 ? iB + CodedOutputByteBufferNano.y(3, i2) : iB;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.p0(1, this.c);
            int i = this.d;
            if (i != 0) {
                codedOutputByteBufferNano.p0(2, i);
            }
            int i2 = this.e;
            if (i2 != 0) {
                codedOutputByteBufferNano.p0(3, i2);
            }
            super.j(codedOutputByteBufferNano);
        }

        public a m() {
            this.c = 0;
            this.d = 0;
            this.e = 0;
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
                } else if (iA == 24) {
                    this.e = o34Var.B();
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public static final class b extends ak8<b> {
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;

        public b() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            return super.b() + CodedOutputByteBufferNano.y(1, this.c) + CodedOutputByteBufferNano.y(2, this.d) + CodedOutputByteBufferNano.y(3, this.e) + CodedOutputByteBufferNano.y(4, this.f) + CodedOutputByteBufferNano.y(5, this.g);
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.p0(1, this.c);
            codedOutputByteBufferNano.p0(2, this.d);
            codedOutputByteBufferNano.p0(3, this.e);
            codedOutputByteBufferNano.p0(4, this.f);
            codedOutputByteBufferNano.p0(5, this.g);
            super.j(codedOutputByteBufferNano);
        }

        public b m() {
            this.c = 0;
            this.d = 0;
            this.e = 0;
            this.f = 0;
            this.g = 0;
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
                } else if (iA == 24) {
                    this.e = o34Var.B();
                } else if (iA == 32) {
                    this.f = o34Var.B();
                } else if (iA == 40) {
                    this.g = o34Var.B();
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public static final class c extends ak8<c> {
        public static volatile c[] j;
        public v64 c;
        public int d;
        public int e;
        public int f;
        public int g;
        public int h;
        public b i;

        public c() {
            m();
        }

        public static c[] n() {
            if (j == null) {
                synchronized (afd.c) {
                    try {
                        if (j == null) {
                            j = new c[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return j;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            int iB = super.b();
            v64 v64Var = this.c;
            if (v64Var != null) {
                iB += CodedOutputByteBufferNano.n(1, v64Var);
            }
            int iY = iB + CodedOutputByteBufferNano.y(2, this.d) + CodedOutputByteBufferNano.y(3, this.e) + CodedOutputByteBufferNano.y(4, this.f) + CodedOutputByteBufferNano.y(5, this.g) + CodedOutputByteBufferNano.y(6, this.h);
            b bVar = this.i;
            return bVar != null ? iY + CodedOutputByteBufferNano.n(7, bVar) : iY;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            v64 v64Var = this.c;
            if (v64Var != null) {
                codedOutputByteBufferNano.Y(1, v64Var);
            }
            codedOutputByteBufferNano.p0(2, this.d);
            codedOutputByteBufferNano.p0(3, this.e);
            codedOutputByteBufferNano.p0(4, this.f);
            codedOutputByteBufferNano.p0(5, this.g);
            codedOutputByteBufferNano.p0(6, this.h);
            b bVar = this.i;
            if (bVar != null) {
                codedOutputByteBufferNano.Y(7, bVar);
            }
            super.j(codedOutputByteBufferNano);
        }

        public c m() {
            this.c = null;
            this.d = 0;
            this.e = 0;
            this.f = 0;
            this.g = 0;
            this.h = 0;
            this.i = null;
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
                if (iA == 10) {
                    if (this.c == null) {
                        this.c = new v64();
                    }
                    o34Var.q(this.c);
                } else if (iA == 16) {
                    this.d = o34Var.B();
                } else if (iA == 24) {
                    this.e = o34Var.B();
                } else if (iA == 32) {
                    this.f = o34Var.B();
                } else if (iA == 40) {
                    this.g = o34Var.B();
                } else if (iA == 48) {
                    this.h = o34Var.B();
                } else if (iA == 58) {
                    if (this.i == null) {
                        this.i = new b();
                    }
                    o34Var.q(this.i);
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public xt9() {
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
        a aVar = this.d;
        return aVar != null ? iB + CodedOutputByteBufferNano.n(2, aVar) : iB;
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
        a aVar = this.d;
        if (aVar != null) {
            codedOutputByteBufferNano.Y(2, aVar);
        }
        super.j(codedOutputByteBufferNano);
    }

    public xt9 m() {
        this.c = c.n();
        this.d = null;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public xt9 e(o34 o34Var) throws IOException {
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
