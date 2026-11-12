package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class b9r extends ak8<b9r> {
    public static volatile b9r[] h;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;

    public static final class a extends ak8<a> {
        public b9r[] c;

        public a() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            int iB = super.b();
            b9r[] b9rVarArr = this.c;
            if (b9rVarArr != null && b9rVarArr.length > 0) {
                int i = 0;
                while (true) {
                    b9r[] b9rVarArr2 = this.c;
                    if (i >= b9rVarArr2.length) {
                        break;
                    }
                    b9r b9rVar = b9rVarArr2[i];
                    if (b9rVar != null) {
                        iB += CodedOutputByteBufferNano.n(1, b9rVar);
                    }
                    i++;
                }
            }
            return iB;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            b9r[] b9rVarArr = this.c;
            if (b9rVarArr != null && b9rVarArr.length > 0) {
                int i = 0;
                while (true) {
                    b9r[] b9rVarArr2 = this.c;
                    if (i >= b9rVarArr2.length) {
                        break;
                    }
                    b9r b9rVar = b9rVarArr2[i];
                    if (b9rVar != null) {
                        codedOutputByteBufferNano.Y(1, b9rVar);
                    }
                    i++;
                }
            }
            super.j(codedOutputByteBufferNano);
        }

        public a m() {
            this.c = b9r.n();
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
                    b9r[] b9rVarArr = this.c;
                    int length = b9rVarArr == null ? 0 : b9rVarArr.length;
                    int i = iA2 + length;
                    b9r[] b9rVarArr2 = new b9r[i];
                    if (length != 0) {
                        System.arraycopy(b9rVarArr, 0, b9rVarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        b9r b9rVar = new b9r();
                        b9rVarArr2[length] = b9rVar;
                        o34Var.q(b9rVar);
                        o34Var.A();
                        length++;
                    }
                    b9r b9rVar2 = new b9r();
                    b9rVarArr2[length] = b9rVar2;
                    o34Var.q(b9rVar2);
                    this.c = b9rVarArr2;
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public b9r() {
        m();
    }

    public static b9r[] n() {
        if (h == null) {
            synchronized (afd.c) {
                try {
                    if (h == null) {
                        h = new b9r[0];
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
        int iB = super.b() + CodedOutputByteBufferNano.v(1, this.d) + CodedOutputByteBufferNano.v(2, this.e);
        if (!this.f.equals("")) {
            iB += CodedOutputByteBufferNano.v(3, this.f);
        }
        if (!this.g.equals("")) {
            iB += CodedOutputByteBufferNano.v(4, this.g);
        }
        return !this.c.equals("") ? iB + CodedOutputByteBufferNano.v(5, this.c) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.m0(1, this.d);
        codedOutputByteBufferNano.m0(2, this.e);
        if (!this.f.equals("")) {
            codedOutputByteBufferNano.m0(3, this.f);
        }
        if (!this.g.equals("")) {
            codedOutputByteBufferNano.m0(4, this.g);
        }
        if (!this.c.equals("")) {
            codedOutputByteBufferNano.m0(5, this.c);
        }
        super.j(codedOutputByteBufferNano);
    }

    public b9r m() {
        this.c = "";
        this.d = "";
        this.e = "";
        this.f = "";
        this.g = "";
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public b9r e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 10) {
                this.d = o34Var.z();
            } else if (iA == 18) {
                this.e = o34Var.z();
            } else if (iA == 26) {
                this.f = o34Var.z();
            } else if (iA == 34) {
                this.g = o34Var.z();
            } else if (iA == 42) {
                this.c = o34Var.z();
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
