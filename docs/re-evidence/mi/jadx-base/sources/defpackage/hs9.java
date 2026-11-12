package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public final class hs9 extends ak8<hs9> {
    public static volatile hs9[] d;
    public int c;

    public static final class a extends ak8<a> {
        public hs9[] c;
        public hs9[] d;

        public a() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            int iB = super.b();
            hs9[] hs9VarArr = this.c;
            int i = 0;
            if (hs9VarArr != null && hs9VarArr.length > 0) {
                int i2 = 0;
                while (true) {
                    hs9[] hs9VarArr2 = this.c;
                    if (i2 >= hs9VarArr2.length) {
                        break;
                    }
                    hs9 hs9Var = hs9VarArr2[i2];
                    if (hs9Var != null) {
                        iB += CodedOutputByteBufferNano.n(1, hs9Var);
                    }
                    i2++;
                }
            }
            hs9[] hs9VarArr3 = this.d;
            if (hs9VarArr3 != null && hs9VarArr3.length > 0) {
                while (true) {
                    hs9[] hs9VarArr4 = this.d;
                    if (i >= hs9VarArr4.length) {
                        break;
                    }
                    hs9 hs9Var2 = hs9VarArr4[i];
                    if (hs9Var2 != null) {
                        iB += CodedOutputByteBufferNano.n(2, hs9Var2);
                    }
                    i++;
                }
            }
            return iB;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            hs9[] hs9VarArr = this.c;
            int i = 0;
            if (hs9VarArr != null && hs9VarArr.length > 0) {
                int i2 = 0;
                while (true) {
                    hs9[] hs9VarArr2 = this.c;
                    if (i2 >= hs9VarArr2.length) {
                        break;
                    }
                    hs9 hs9Var = hs9VarArr2[i2];
                    if (hs9Var != null) {
                        codedOutputByteBufferNano.Y(1, hs9Var);
                    }
                    i2++;
                }
            }
            hs9[] hs9VarArr3 = this.d;
            if (hs9VarArr3 != null && hs9VarArr3.length > 0) {
                while (true) {
                    hs9[] hs9VarArr4 = this.d;
                    if (i >= hs9VarArr4.length) {
                        break;
                    }
                    hs9 hs9Var2 = hs9VarArr4[i];
                    if (hs9Var2 != null) {
                        codedOutputByteBufferNano.Y(2, hs9Var2);
                    }
                    i++;
                }
            }
            super.j(codedOutputByteBufferNano);
        }

        public a m() {
            this.c = hs9.n();
            this.d = hs9.n();
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
                    hs9[] hs9VarArr = this.c;
                    int length = hs9VarArr == null ? 0 : hs9VarArr.length;
                    int i = iA2 + length;
                    hs9[] hs9VarArr2 = new hs9[i];
                    if (length != 0) {
                        System.arraycopy(hs9VarArr, 0, hs9VarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        hs9 hs9Var = new hs9();
                        hs9VarArr2[length] = hs9Var;
                        o34Var.q(hs9Var);
                        o34Var.A();
                        length++;
                    }
                    hs9 hs9Var2 = new hs9();
                    hs9VarArr2[length] = hs9Var2;
                    o34Var.q(hs9Var2);
                    this.c = hs9VarArr2;
                } else if (iA == 18) {
                    int iA3 = bmr.a(o34Var, 18);
                    hs9[] hs9VarArr3 = this.d;
                    int length2 = hs9VarArr3 == null ? 0 : hs9VarArr3.length;
                    int i2 = iA3 + length2;
                    hs9[] hs9VarArr4 = new hs9[i2];
                    if (length2 != 0) {
                        System.arraycopy(hs9VarArr3, 0, hs9VarArr4, 0, length2);
                    }
                    while (length2 < i2 - 1) {
                        hs9 hs9Var3 = new hs9();
                        hs9VarArr4[length2] = hs9Var3;
                        o34Var.q(hs9Var3);
                        o34Var.A();
                        length2++;
                    }
                    hs9 hs9Var4 = new hs9();
                    hs9VarArr4[length2] = hs9Var4;
                    o34Var.q(hs9Var4);
                    this.d = hs9VarArr4;
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public hs9() {
        m();
    }

    public static hs9[] n() {
        if (d == null) {
            synchronized (afd.c) {
                try {
                    if (d == null) {
                        d = new hs9[0];
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return d;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        return super.b() + CodedOutputByteBufferNano.l(1, this.c);
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.W(1, this.c);
        super.j(codedOutputByteBufferNano);
    }

    public hs9 m() {
        this.c = 1;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public hs9 e(o34 o34Var) throws IOException {
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
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
