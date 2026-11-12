package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class i79 extends ak8<i79> {
    public int c;
    public int d;
    public int e;
    public a f;
    public b.a g;
    public byte[] h;

    public static final class a extends ak8<a> {
        public String c;
        public int d;
        public int e;
        public int f;
        public float g;
        public String h;
        public String i;

        public a() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            return super.b() + CodedOutputByteBufferNano.v(1, this.c) + CodedOutputByteBufferNano.l(2, this.d) + CodedOutputByteBufferNano.y(3, this.e) + CodedOutputByteBufferNano.y(4, this.f) + CodedOutputByteBufferNano.j(5, this.g) + CodedOutputByteBufferNano.v(6, this.h) + CodedOutputByteBufferNano.v(7, this.i);
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m0(1, this.c);
            codedOutputByteBufferNano.W(2, this.d);
            codedOutputByteBufferNano.p0(3, this.e);
            codedOutputByteBufferNano.p0(4, this.f);
            codedOutputByteBufferNano.U(5, this.g);
            codedOutputByteBufferNano.m0(6, this.h);
            codedOutputByteBufferNano.m0(7, this.i);
            super.j(codedOutputByteBufferNano);
        }

        public a m() {
            this.c = "";
            this.d = 0;
            this.e = 0;
            this.f = 0;
            this.g = 0.0f;
            this.h = "";
            this.i = "";
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
                    if (iP == 0 || iP == 1 || iP == 2) {
                        this.d = iP;
                    }
                } else if (iA == 24) {
                    this.e = o34Var.B();
                } else if (iA == 32) {
                    this.f = o34Var.B();
                } else if (iA == 45) {
                    this.g = o34Var.o();
                } else if (iA == 50) {
                    this.h = o34Var.z();
                } else if (iA == 58) {
                    this.i = o34Var.z();
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public static final class b extends ak8<b> {
        public static volatile b[] e;
        public int c;
        public int d;

        public static final class a extends ak8<a> {
            public b[] c;

            public a() {
                m();
            }

            @Override // defpackage.ak8, defpackage.dsf
            public int b() {
                int iB = super.b();
                b[] bVarArr = this.c;
                if (bVarArr != null && bVarArr.length > 0) {
                    int i = 0;
                    while (true) {
                        b[] bVarArr2 = this.c;
                        if (i >= bVarArr2.length) {
                            break;
                        }
                        b bVar = bVarArr2[i];
                        if (bVar != null) {
                            iB += CodedOutputByteBufferNano.n(1, bVar);
                        }
                        i++;
                    }
                }
                return iB;
            }

            @Override // defpackage.ak8, defpackage.dsf
            public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
                b[] bVarArr = this.c;
                if (bVarArr != null && bVarArr.length > 0) {
                    int i = 0;
                    while (true) {
                        b[] bVarArr2 = this.c;
                        if (i >= bVarArr2.length) {
                            break;
                        }
                        b bVar = bVarArr2[i];
                        if (bVar != null) {
                            codedOutputByteBufferNano.Y(1, bVar);
                        }
                        i++;
                    }
                }
                super.j(codedOutputByteBufferNano);
            }

            public a m() {
                this.c = b.n();
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
                        b[] bVarArr = this.c;
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
                        this.c = bVarArr2;
                    } else if (!l(o34Var, iA)) {
                        return this;
                    }
                }
            }
        }

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
            return super.b() + CodedOutputByteBufferNano.y(1, this.c) + CodedOutputByteBufferNano.y(2, this.d);
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.p0(1, this.c);
            codedOutputByteBufferNano.p0(2, this.d);
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
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public i79() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b() + CodedOutputByteBufferNano.l(1, this.c) + CodedOutputByteBufferNano.l(2, this.d);
        int i = this.e;
        if (i != 0) {
            iB += CodedOutputByteBufferNano.y(3, i);
        }
        a aVar = this.f;
        if (aVar != null) {
            iB += CodedOutputByteBufferNano.n(4, aVar);
        }
        b.a aVar2 = this.g;
        if (aVar2 != null) {
            iB += CodedOutputByteBufferNano.n(5, aVar2);
        }
        return !Arrays.equals(this.h, bmr.h) ? iB + CodedOutputByteBufferNano.d(6, this.h) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.W(1, this.c);
        codedOutputByteBufferNano.W(2, this.d);
        int i = this.e;
        if (i != 0) {
            codedOutputByteBufferNano.p0(3, i);
        }
        a aVar = this.f;
        if (aVar != null) {
            codedOutputByteBufferNano.Y(4, aVar);
        }
        b.a aVar2 = this.g;
        if (aVar2 != null) {
            codedOutputByteBufferNano.Y(5, aVar2);
        }
        if (!Arrays.equals(this.h, bmr.h)) {
            codedOutputByteBufferNano.O(6, this.h);
        }
        super.j(codedOutputByteBufferNano);
    }

    public i79 m() {
        this.c = 1;
        this.d = 1;
        this.e = 0;
        this.f = null;
        this.g = null;
        this.h = bmr.h;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public i79 e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 8) {
                int iP = o34Var.p();
                if (iP == 1 || iP == 2 || iP == 3 || iP == 4) {
                    this.c = iP;
                }
            } else if (iA == 16) {
                int iP2 = o34Var.p();
                if (iP2 == 1 || iP2 == 2 || iP2 == 3) {
                    this.d = iP2;
                }
            } else if (iA == 24) {
                this.e = o34Var.B();
            } else if (iA == 34) {
                if (this.f == null) {
                    this.f = new a();
                }
                o34Var.q(this.f);
            } else if (iA == 42) {
                if (this.g == null) {
                    this.g = new b.a();
                }
                o34Var.q(this.g);
            } else if (iA == 50) {
                this.h = o34Var.l();
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
