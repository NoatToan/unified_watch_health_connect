package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class m14 extends ak8<m14> {
    public static volatile m14[] e;
    public int c;
    public a d;

    public static final class a extends ak8<a> {
        public t64 c;
        public int d;
        public int e;
        public boolean f;
        public String g;
        public int h;
        public k64 i;

        public a() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            int iB = super.b();
            t64 t64Var = this.c;
            if (t64Var != null) {
                iB += CodedOutputByteBufferNano.n(2, t64Var);
            }
            int iL = iB + CodedOutputByteBufferNano.l(3, this.d);
            int i = this.e;
            if (i != 0) {
                iL += CodedOutputByteBufferNano.y(4, i);
            }
            int iB2 = iL + CodedOutputByteBufferNano.b(5, this.f);
            if (!this.g.equals("")) {
                iB2 += CodedOutputByteBufferNano.v(6, this.g);
            }
            int i2 = this.h;
            if (i2 != 0) {
                iB2 += CodedOutputByteBufferNano.l(7, i2);
            }
            k64 k64Var = this.i;
            return k64Var != null ? iB2 + CodedOutputByteBufferNano.n(8, k64Var) : iB2;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            t64 t64Var = this.c;
            if (t64Var != null) {
                codedOutputByteBufferNano.Y(2, t64Var);
            }
            codedOutputByteBufferNano.W(3, this.d);
            int i = this.e;
            if (i != 0) {
                codedOutputByteBufferNano.p0(4, i);
            }
            codedOutputByteBufferNano.M(5, this.f);
            if (!this.g.equals("")) {
                codedOutputByteBufferNano.m0(6, this.g);
            }
            int i2 = this.h;
            if (i2 != 0) {
                codedOutputByteBufferNano.W(7, i2);
            }
            k64 k64Var = this.i;
            if (k64Var != null) {
                codedOutputByteBufferNano.Y(8, k64Var);
            }
            super.j(codedOutputByteBufferNano);
        }

        public a m() {
            this.c = null;
            this.d = 0;
            this.e = 0;
            this.f = false;
            this.g = "";
            this.h = 0;
            this.i = null;
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
                if (iA == 18) {
                    if (this.c == null) {
                        this.c = new t64();
                    }
                    o34Var.q(this.c);
                } else if (iA == 24) {
                    int iP = o34Var.p();
                    if (iP != 15) {
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
                                break;
                            default:
                                continue;
                        }
                    }
                    this.d = iP;
                } else if (iA == 32) {
                    this.e = o34Var.B();
                } else if (iA == 40) {
                    this.f = o34Var.k();
                } else if (iA == 50) {
                    this.g = o34Var.z();
                } else if (iA == 56) {
                    int iP2 = o34Var.p();
                    if (iP2 == 0 || iP2 == 1 || iP2 == 2) {
                        this.h = iP2;
                    }
                } else if (iA == 66) {
                    if (this.i == null) {
                        this.i = new k64();
                    }
                    o34Var.q(this.i);
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public static final class b extends ak8<b> {
        public m14[] c;
        public int d;
        public boolean e;
        public boolean f;

        public b() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            int iB = super.b();
            m14[] m14VarArr = this.c;
            if (m14VarArr != null && m14VarArr.length > 0) {
                int i = 0;
                while (true) {
                    m14[] m14VarArr2 = this.c;
                    if (i >= m14VarArr2.length) {
                        break;
                    }
                    m14 m14Var = m14VarArr2[i];
                    if (m14Var != null) {
                        iB += CodedOutputByteBufferNano.n(1, m14Var);
                    }
                    i++;
                }
            }
            int i2 = this.d;
            if (i2 != 0) {
                iB += CodedOutputByteBufferNano.y(2, i2);
            }
            boolean z = this.e;
            if (z) {
                iB += CodedOutputByteBufferNano.b(3, z);
            }
            boolean z2 = this.f;
            return z2 ? iB + CodedOutputByteBufferNano.b(4, z2) : iB;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            m14[] m14VarArr = this.c;
            if (m14VarArr != null && m14VarArr.length > 0) {
                int i = 0;
                while (true) {
                    m14[] m14VarArr2 = this.c;
                    if (i >= m14VarArr2.length) {
                        break;
                    }
                    m14 m14Var = m14VarArr2[i];
                    if (m14Var != null) {
                        codedOutputByteBufferNano.Y(1, m14Var);
                    }
                    i++;
                }
            }
            int i2 = this.d;
            if (i2 != 0) {
                codedOutputByteBufferNano.p0(2, i2);
            }
            boolean z = this.e;
            if (z) {
                codedOutputByteBufferNano.M(3, z);
            }
            boolean z2 = this.f;
            if (z2) {
                codedOutputByteBufferNano.M(4, z2);
            }
            super.j(codedOutputByteBufferNano);
        }

        public b m() {
            this.c = m14.n();
            this.d = 0;
            this.e = false;
            this.f = false;
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
                    m14[] m14VarArr = this.c;
                    int length = m14VarArr == null ? 0 : m14VarArr.length;
                    int i = iA2 + length;
                    m14[] m14VarArr2 = new m14[i];
                    if (length != 0) {
                        System.arraycopy(m14VarArr, 0, m14VarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        m14 m14Var = new m14();
                        m14VarArr2[length] = m14Var;
                        o34Var.q(m14Var);
                        o34Var.A();
                        length++;
                    }
                    m14 m14Var2 = new m14();
                    m14VarArr2[length] = m14Var2;
                    o34Var.q(m14Var2);
                    this.c = m14VarArr2;
                } else if (iA == 16) {
                    this.d = o34Var.B();
                } else if (iA == 24) {
                    this.e = o34Var.k();
                } else if (iA == 32) {
                    this.f = o34Var.k();
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public m14() {
        m();
    }

    public static m14[] n() {
        if (e == null) {
            synchronized (afd.c) {
                try {
                    if (e == null) {
                        e = new m14[0];
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
        int iB = super.b() + CodedOutputByteBufferNano.y(1, this.c);
        a aVar = this.d;
        return aVar != null ? iB + CodedOutputByteBufferNano.n(2, aVar) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.p0(1, this.c);
        a aVar = this.d;
        if (aVar != null) {
            codedOutputByteBufferNano.Y(2, aVar);
        }
        super.j(codedOutputByteBufferNano);
    }

    public m14 m() {
        this.c = 0;
        this.d = null;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public m14 e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 8) {
                this.c = o34Var.B();
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
