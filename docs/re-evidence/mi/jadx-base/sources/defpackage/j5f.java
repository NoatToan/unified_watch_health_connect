package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class j5f extends ak8<j5f> {
    public static volatile j5f[] f;
    public int c = 0;
    public Object d;
    public int e;

    public static final class a extends ak8<a> {
        public j5f[] c;

        public a() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            int iB = super.b();
            j5f[] j5fVarArr = this.c;
            if (j5fVarArr != null && j5fVarArr.length > 0) {
                int i = 0;
                while (true) {
                    j5f[] j5fVarArr2 = this.c;
                    if (i >= j5fVarArr2.length) {
                        break;
                    }
                    j5f j5fVar = j5fVarArr2[i];
                    if (j5fVar != null) {
                        iB += CodedOutputByteBufferNano.n(1, j5fVar);
                    }
                    i++;
                }
            }
            return iB;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            j5f[] j5fVarArr = this.c;
            if (j5fVarArr != null && j5fVarArr.length > 0) {
                int i = 0;
                while (true) {
                    j5f[] j5fVarArr2 = this.c;
                    if (i >= j5fVarArr2.length) {
                        break;
                    }
                    j5f j5fVar = j5fVarArr2[i];
                    if (j5fVar != null) {
                        codedOutputByteBufferNano.Y(1, j5fVar);
                    }
                    i++;
                }
            }
            super.j(codedOutputByteBufferNano);
        }

        public a m() {
            this.c = j5f.o();
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
                    j5f[] j5fVarArr = this.c;
                    int length = j5fVarArr == null ? 0 : j5fVarArr.length;
                    int i = iA2 + length;
                    j5f[] j5fVarArr2 = new j5f[i];
                    if (length != 0) {
                        System.arraycopy(j5fVarArr, 0, j5fVarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        j5f j5fVar = new j5f();
                        j5fVarArr2[length] = j5fVar;
                        o34Var.q(j5fVar);
                        o34Var.A();
                        length++;
                    }
                    j5f j5fVar2 = new j5f();
                    j5fVarArr2[length] = j5fVar2;
                    o34Var.q(j5fVar2);
                    this.c = j5fVarArr2;
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public j5f() {
        m();
    }

    public static j5f[] o() {
        if (f == null) {
            synchronized (afd.c) {
                try {
                    if (f == null) {
                        f = new j5f[0];
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
        int iB = super.b() + CodedOutputByteBufferNano.l(1, this.e);
        if (this.c == 2) {
            iB += CodedOutputByteBufferNano.v(2, (String) this.d);
        }
        if (this.c == 3) {
            iB += CodedOutputByteBufferNano.v(3, (String) this.d);
        }
        return this.c == 4 ? iB + CodedOutputByteBufferNano.n(4, (dsf) this.d) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.W(1, this.e);
        if (this.c == 2) {
            codedOutputByteBufferNano.m0(2, (String) this.d);
        }
        if (this.c == 3) {
            codedOutputByteBufferNano.m0(3, (String) this.d);
        }
        if (this.c == 4) {
            codedOutputByteBufferNano.Y(4, (dsf) this.d);
        }
        super.j(codedOutputByteBufferNano);
    }

    public j5f m() {
        this.e = 0;
        n();
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    public j5f n() {
        this.c = 0;
        this.d = null;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public j5f e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 8) {
                int iP = o34Var.p();
                if (iP == 0 || iP == 1) {
                    this.e = iP;
                }
            } else if (iA == 18) {
                this.d = o34Var.z();
                this.c = 2;
            } else if (iA == 26) {
                this.d = o34Var.z();
                this.c = 3;
            } else if (iA == 34) {
                if (this.c != 4) {
                    this.d = new k5f();
                }
                o34Var.q((dsf) this.d);
                this.c = 4;
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }

    public j5f q(k5f k5fVar) {
        k5fVar.getClass();
        this.c = 4;
        this.d = k5fVar;
        return this;
    }

    public j5f r(String str) {
        this.c = 2;
        this.d = str;
        return this;
    }

    public j5f s(String str) {
        this.c = 3;
        this.d = str;
        return this;
    }
}
