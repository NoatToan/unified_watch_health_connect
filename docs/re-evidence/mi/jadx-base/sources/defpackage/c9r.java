package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class c9r extends ak8<c9r> {
    public static volatile c9r[] e;
    public String c;
    public String d;

    public static final class a extends ak8<a> {
        public c9r[] c;

        public a() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            int iB = super.b();
            c9r[] c9rVarArr = this.c;
            if (c9rVarArr != null && c9rVarArr.length > 0) {
                int i = 0;
                while (true) {
                    c9r[] c9rVarArr2 = this.c;
                    if (i >= c9rVarArr2.length) {
                        break;
                    }
                    c9r c9rVar = c9rVarArr2[i];
                    if (c9rVar != null) {
                        iB += CodedOutputByteBufferNano.n(1, c9rVar);
                    }
                    i++;
                }
            }
            return iB;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            c9r[] c9rVarArr = this.c;
            if (c9rVarArr != null && c9rVarArr.length > 0) {
                int i = 0;
                while (true) {
                    c9r[] c9rVarArr2 = this.c;
                    if (i >= c9rVarArr2.length) {
                        break;
                    }
                    c9r c9rVar = c9rVarArr2[i];
                    if (c9rVar != null) {
                        codedOutputByteBufferNano.Y(1, c9rVar);
                    }
                    i++;
                }
            }
            super.j(codedOutputByteBufferNano);
        }

        public a m() {
            this.c = c9r.n();
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
                    c9r[] c9rVarArr = this.c;
                    int length = c9rVarArr == null ? 0 : c9rVarArr.length;
                    int i = iA2 + length;
                    c9r[] c9rVarArr2 = new c9r[i];
                    if (length != 0) {
                        System.arraycopy(c9rVarArr, 0, c9rVarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        c9r c9rVar = new c9r();
                        c9rVarArr2[length] = c9rVar;
                        o34Var.q(c9rVar);
                        o34Var.A();
                        length++;
                    }
                    c9r c9rVar2 = new c9r();
                    c9rVarArr2[length] = c9rVar2;
                    o34Var.q(c9rVar2);
                    this.c = c9rVarArr2;
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public c9r() {
        m();
    }

    public static c9r[] n() {
        if (e == null) {
            synchronized (afd.c) {
                try {
                    if (e == null) {
                        e = new c9r[0];
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
        int iB = super.b() + CodedOutputByteBufferNano.v(1, this.c);
        return !this.d.equals("") ? iB + CodedOutputByteBufferNano.v(2, this.d) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.m0(1, this.c);
        if (!this.d.equals("")) {
            codedOutputByteBufferNano.m0(2, this.d);
        }
        super.j(codedOutputByteBufferNano);
    }

    public c9r m() {
        this.c = "";
        this.d = "";
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public c9r e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 10) {
                this.c = o34Var.z();
            } else if (iA == 18) {
                this.d = o34Var.z();
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
