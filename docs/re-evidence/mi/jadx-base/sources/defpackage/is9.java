package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class is9 extends ak8<is9> {
    public static volatile is9[] d;
    public int c;

    public static final class a extends ak8<a> {
        public is9[] c;
        public is9[] d;

        public a() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            int iB = super.b();
            is9[] is9VarArr = this.c;
            int i = 0;
            if (is9VarArr != null && is9VarArr.length > 0) {
                int i2 = 0;
                while (true) {
                    is9[] is9VarArr2 = this.c;
                    if (i2 >= is9VarArr2.length) {
                        break;
                    }
                    is9 is9Var = is9VarArr2[i2];
                    if (is9Var != null) {
                        iB += CodedOutputByteBufferNano.n(1, is9Var);
                    }
                    i2++;
                }
            }
            is9[] is9VarArr3 = this.d;
            if (is9VarArr3 != null && is9VarArr3.length > 0) {
                while (true) {
                    is9[] is9VarArr4 = this.d;
                    if (i >= is9VarArr4.length) {
                        break;
                    }
                    is9 is9Var2 = is9VarArr4[i];
                    if (is9Var2 != null) {
                        iB += CodedOutputByteBufferNano.n(2, is9Var2);
                    }
                    i++;
                }
            }
            return iB;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            is9[] is9VarArr = this.c;
            int i = 0;
            if (is9VarArr != null && is9VarArr.length > 0) {
                int i2 = 0;
                while (true) {
                    is9[] is9VarArr2 = this.c;
                    if (i2 >= is9VarArr2.length) {
                        break;
                    }
                    is9 is9Var = is9VarArr2[i2];
                    if (is9Var != null) {
                        codedOutputByteBufferNano.Y(1, is9Var);
                    }
                    i2++;
                }
            }
            is9[] is9VarArr3 = this.d;
            if (is9VarArr3 != null && is9VarArr3.length > 0) {
                while (true) {
                    is9[] is9VarArr4 = this.d;
                    if (i >= is9VarArr4.length) {
                        break;
                    }
                    is9 is9Var2 = is9VarArr4[i];
                    if (is9Var2 != null) {
                        codedOutputByteBufferNano.Y(2, is9Var2);
                    }
                    i++;
                }
            }
            super.j(codedOutputByteBufferNano);
        }

        public a m() {
            this.c = is9.n();
            this.d = is9.n();
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
                    is9[] is9VarArr = this.c;
                    int length = is9VarArr == null ? 0 : is9VarArr.length;
                    int i = iA2 + length;
                    is9[] is9VarArr2 = new is9[i];
                    if (length != 0) {
                        System.arraycopy(is9VarArr, 0, is9VarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        is9 is9Var = new is9();
                        is9VarArr2[length] = is9Var;
                        o34Var.q(is9Var);
                        o34Var.A();
                        length++;
                    }
                    is9 is9Var2 = new is9();
                    is9VarArr2[length] = is9Var2;
                    o34Var.q(is9Var2);
                    this.c = is9VarArr2;
                } else if (iA == 18) {
                    int iA3 = bmr.a(o34Var, 18);
                    is9[] is9VarArr3 = this.d;
                    int length2 = is9VarArr3 == null ? 0 : is9VarArr3.length;
                    int i2 = iA3 + length2;
                    is9[] is9VarArr4 = new is9[i2];
                    if (length2 != 0) {
                        System.arraycopy(is9VarArr3, 0, is9VarArr4, 0, length2);
                    }
                    while (length2 < i2 - 1) {
                        is9 is9Var3 = new is9();
                        is9VarArr4[length2] = is9Var3;
                        o34Var.q(is9Var3);
                        o34Var.A();
                        length2++;
                    }
                    is9 is9Var4 = new is9();
                    is9VarArr4[length2] = is9Var4;
                    o34Var.q(is9Var4);
                    this.d = is9VarArr4;
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public is9() {
        m();
    }

    public static is9[] n() {
        if (d == null) {
            synchronized (afd.c) {
                try {
                    if (d == null) {
                        d = new is9[0];
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

    public is9 m() {
        this.c = 1;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public is9 e(o34 o34Var) throws IOException {
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
