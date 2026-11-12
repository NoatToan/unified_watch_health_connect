package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class l01 extends ak8<l01> {
    public static volatile l01[] e;
    public String c;
    public String d;

    public static final class a extends ak8<a> {
        public l01[] c;

        public a() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            int iB = super.b();
            l01[] l01VarArr = this.c;
            if (l01VarArr != null && l01VarArr.length > 0) {
                int i = 0;
                while (true) {
                    l01[] l01VarArr2 = this.c;
                    if (i >= l01VarArr2.length) {
                        break;
                    }
                    l01 l01Var = l01VarArr2[i];
                    if (l01Var != null) {
                        iB += CodedOutputByteBufferNano.n(1, l01Var);
                    }
                    i++;
                }
            }
            return iB;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            l01[] l01VarArr = this.c;
            if (l01VarArr != null && l01VarArr.length > 0) {
                int i = 0;
                while (true) {
                    l01[] l01VarArr2 = this.c;
                    if (i >= l01VarArr2.length) {
                        break;
                    }
                    l01 l01Var = l01VarArr2[i];
                    if (l01Var != null) {
                        codedOutputByteBufferNano.Y(1, l01Var);
                    }
                    i++;
                }
            }
            super.j(codedOutputByteBufferNano);
        }

        public a m() {
            this.c = l01.n();
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
                    l01[] l01VarArr = this.c;
                    int length = l01VarArr == null ? 0 : l01VarArr.length;
                    int i = iA2 + length;
                    l01[] l01VarArr2 = new l01[i];
                    if (length != 0) {
                        System.arraycopy(l01VarArr, 0, l01VarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        l01 l01Var = new l01();
                        l01VarArr2[length] = l01Var;
                        o34Var.q(l01Var);
                        o34Var.A();
                        length++;
                    }
                    l01 l01Var2 = new l01();
                    l01VarArr2[length] = l01Var2;
                    o34Var.q(l01Var2);
                    this.c = l01VarArr2;
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public l01() {
        m();
    }

    public static l01[] n() {
        if (e == null) {
            synchronized (afd.c) {
                try {
                    if (e == null) {
                        e = new l01[0];
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

    public l01 m() {
        this.c = "";
        this.d = "";
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public l01 e(o34 o34Var) throws IOException {
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
