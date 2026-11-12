package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class hr9 extends ak8<hr9> {
    public int c;
    public long d;
    public a e;

    public static final class a extends ak8<a> {
        public String c;
        public int d;
        public int e;
        public String f;
        public b[] g;

        public a() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            int iB = super.b() + CodedOutputByteBufferNano.v(1, this.c);
            int i = this.d;
            if (i != 0) {
                iB += CodedOutputByteBufferNano.y(2, i);
            }
            int i2 = this.e;
            if (i2 != 0) {
                iB += CodedOutputByteBufferNano.y(3, i2);
            }
            if (!this.f.equals("")) {
                iB += CodedOutputByteBufferNano.v(4, this.f);
            }
            b[] bVarArr = this.g;
            if (bVarArr != null && bVarArr.length > 0) {
                int i3 = 0;
                while (true) {
                    b[] bVarArr2 = this.g;
                    if (i3 >= bVarArr2.length) {
                        break;
                    }
                    b bVar = bVarArr2[i3];
                    if (bVar != null) {
                        iB += CodedOutputByteBufferNano.n(5, bVar);
                    }
                    i3++;
                }
            }
            return iB;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m0(1, this.c);
            int i = this.d;
            if (i != 0) {
                codedOutputByteBufferNano.p0(2, i);
            }
            int i2 = this.e;
            if (i2 != 0) {
                codedOutputByteBufferNano.p0(3, i2);
            }
            if (!this.f.equals("")) {
                codedOutputByteBufferNano.m0(4, this.f);
            }
            b[] bVarArr = this.g;
            if (bVarArr != null && bVarArr.length > 0) {
                int i3 = 0;
                while (true) {
                    b[] bVarArr2 = this.g;
                    if (i3 >= bVarArr2.length) {
                        break;
                    }
                    b bVar = bVarArr2[i3];
                    if (bVar != null) {
                        codedOutputByteBufferNano.Y(5, bVar);
                    }
                    i3++;
                }
            }
            super.j(codedOutputByteBufferNano);
        }

        public a m() {
            this.c = "";
            this.d = 0;
            this.e = 0;
            this.f = "";
            this.g = b.n();
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
                    this.d = o34Var.B();
                } else if (iA == 24) {
                    this.e = o34Var.B();
                } else if (iA == 34) {
                    this.f = o34Var.z();
                } else if (iA == 42) {
                    int iA2 = bmr.a(o34Var, 42);
                    b[] bVarArr = this.g;
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
                    this.g = bVarArr2;
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public static final class b extends ak8<b> {
        public static volatile b[] f;
        public int c;
        public int d;
        public c e;

        public b() {
            m();
        }

        public static b[] n() {
            if (f == null) {
                synchronized (afd.c) {
                    try {
                        if (f == null) {
                            f = new b[0];
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
            int iB = super.b() + CodedOutputByteBufferNano.y(1, this.c) + CodedOutputByteBufferNano.y(2, this.d);
            c cVar = this.e;
            return cVar != null ? iB + CodedOutputByteBufferNano.n(3, cVar) : iB;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.p0(1, this.c);
            codedOutputByteBufferNano.p0(2, this.d);
            c cVar = this.e;
            if (cVar != null) {
                codedOutputByteBufferNano.Y(3, cVar);
            }
            super.j(codedOutputByteBufferNano);
        }

        public b m() {
            this.c = 0;
            this.d = 0;
            this.e = null;
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
                    this.c = o34Var.B();
                } else if (iA == 16) {
                    this.d = o34Var.B();
                } else if (iA == 26) {
                    if (this.e == null) {
                        this.e = new c();
                    }
                    o34Var.q(this.e);
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

        public c() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            int iB = super.b() + CodedOutputByteBufferNano.l(1, this.c) + CodedOutputByteBufferNano.y(2, this.d);
            int i = this.e;
            return i != 0 ? iB + CodedOutputByteBufferNano.y(3, i) : iB;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.W(1, this.c);
            codedOutputByteBufferNano.p0(2, this.d);
            int i = this.e;
            if (i != 0) {
                codedOutputByteBufferNano.p0(3, i);
            }
            super.j(codedOutputByteBufferNano);
        }

        public c m() {
            this.c = 1;
            this.d = 0;
            this.e = 0;
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
                    int iP = o34Var.p();
                    switch (iP) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            this.c = iP;
                            break;
                    }
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

    public hr9() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b() + CodedOutputByteBufferNano.y(1, this.c) + CodedOutputByteBufferNano.A(2, this.d);
        a aVar = this.e;
        return aVar != null ? iB + CodedOutputByteBufferNano.n(3, aVar) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.p0(1, this.c);
        codedOutputByteBufferNano.r0(2, this.d);
        a aVar = this.e;
        if (aVar != null) {
            codedOutputByteBufferNano.Y(3, aVar);
        }
        super.j(codedOutputByteBufferNano);
    }

    public hr9 m() {
        this.c = 0;
        this.d = 0L;
        this.e = null;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public hr9 e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 8) {
                this.c = o34Var.B();
            } else if (iA == 16) {
                this.d = o34Var.C();
            } else if (iA == 26) {
                if (this.e == null) {
                    this.e = new a();
                }
                o34Var.q(this.e);
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
