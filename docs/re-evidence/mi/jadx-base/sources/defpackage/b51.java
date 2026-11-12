package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class b51 extends ak8<b51> {
    public static volatile b51[] e;
    public String c;
    public String d;

    public static final class a extends ak8<a> {
        public b51[] c;

        public a() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            int iB = super.b();
            b51[] b51VarArr = this.c;
            if (b51VarArr != null && b51VarArr.length > 0) {
                int i = 0;
                while (true) {
                    b51[] b51VarArr2 = this.c;
                    if (i >= b51VarArr2.length) {
                        break;
                    }
                    b51 b51Var = b51VarArr2[i];
                    if (b51Var != null) {
                        iB += CodedOutputByteBufferNano.n(1, b51Var);
                    }
                    i++;
                }
            }
            return iB;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            b51[] b51VarArr = this.c;
            if (b51VarArr != null && b51VarArr.length > 0) {
                int i = 0;
                while (true) {
                    b51[] b51VarArr2 = this.c;
                    if (i >= b51VarArr2.length) {
                        break;
                    }
                    b51 b51Var = b51VarArr2[i];
                    if (b51Var != null) {
                        codedOutputByteBufferNano.Y(1, b51Var);
                    }
                    i++;
                }
            }
            super.j(codedOutputByteBufferNano);
        }

        public a m() {
            this.c = b51.n();
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
                    b51[] b51VarArr = this.c;
                    int length = b51VarArr == null ? 0 : b51VarArr.length;
                    int i = iA2 + length;
                    b51[] b51VarArr2 = new b51[i];
                    if (length != 0) {
                        System.arraycopy(b51VarArr, 0, b51VarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        b51 b51Var = new b51();
                        b51VarArr2[length] = b51Var;
                        o34Var.q(b51Var);
                        o34Var.A();
                        length++;
                    }
                    b51 b51Var2 = new b51();
                    b51VarArr2[length] = b51Var2;
                    o34Var.q(b51Var2);
                    this.c = b51VarArr2;
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public b51() {
        m();
    }

    public static b51[] n() {
        if (e == null) {
            synchronized (afd.c) {
                try {
                    if (e == null) {
                        e = new b51[0];
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
        return super.b() + CodedOutputByteBufferNano.v(1, this.c) + CodedOutputByteBufferNano.v(2, this.d);
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.m0(1, this.c);
        codedOutputByteBufferNano.m0(2, this.d);
        super.j(codedOutputByteBufferNano);
    }

    public b51 m() {
        this.c = "";
        this.d = "";
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public b51 e(o34 o34Var) throws IOException {
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
