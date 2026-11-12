package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class kt9 extends ak8<kt9> {
    public static volatile kt9[] e;
    public int c;
    public int d;

    public static final class a extends ak8<a> {
        public kt9[] c;

        public a() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            int iB = super.b();
            kt9[] kt9VarArr = this.c;
            if (kt9VarArr != null && kt9VarArr.length > 0) {
                int i = 0;
                while (true) {
                    kt9[] kt9VarArr2 = this.c;
                    if (i >= kt9VarArr2.length) {
                        break;
                    }
                    kt9 kt9Var = kt9VarArr2[i];
                    if (kt9Var != null) {
                        iB += CodedOutputByteBufferNano.n(1, kt9Var);
                    }
                    i++;
                }
            }
            return iB;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            kt9[] kt9VarArr = this.c;
            if (kt9VarArr != null && kt9VarArr.length > 0) {
                int i = 0;
                while (true) {
                    kt9[] kt9VarArr2 = this.c;
                    if (i >= kt9VarArr2.length) {
                        break;
                    }
                    kt9 kt9Var = kt9VarArr2[i];
                    if (kt9Var != null) {
                        codedOutputByteBufferNano.Y(1, kt9Var);
                    }
                    i++;
                }
            }
            super.j(codedOutputByteBufferNano);
        }

        public a m() {
            this.c = kt9.n();
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
                    kt9[] kt9VarArr = this.c;
                    int length = kt9VarArr == null ? 0 : kt9VarArr.length;
                    int i = iA2 + length;
                    kt9[] kt9VarArr2 = new kt9[i];
                    if (length != 0) {
                        System.arraycopy(kt9VarArr, 0, kt9VarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        kt9 kt9Var = new kt9();
                        kt9VarArr2[length] = kt9Var;
                        o34Var.q(kt9Var);
                        o34Var.A();
                        length++;
                    }
                    kt9 kt9Var2 = new kt9();
                    kt9VarArr2[length] = kt9Var2;
                    o34Var.q(kt9Var2);
                    this.c = kt9VarArr2;
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public kt9() {
        m();
    }

    public static kt9[] n() {
        if (e == null) {
            synchronized (afd.c) {
                try {
                    if (e == null) {
                        e = new kt9[0];
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

    public kt9 m() {
        this.c = 0;
        this.d = 0;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public kt9 e(o34 o34Var) throws IOException {
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
