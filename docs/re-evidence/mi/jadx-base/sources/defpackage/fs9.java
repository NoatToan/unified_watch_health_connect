package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public final class fs9 extends ak8<fs9> {
    public static volatile fs9[] e;
    public int c;
    public int d;

    public static final class a extends ak8<a> {
        public fs9[] c;

        public a() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            int iB = super.b();
            fs9[] fs9VarArr = this.c;
            if (fs9VarArr != null && fs9VarArr.length > 0) {
                int i = 0;
                while (true) {
                    fs9[] fs9VarArr2 = this.c;
                    if (i >= fs9VarArr2.length) {
                        break;
                    }
                    fs9 fs9Var = fs9VarArr2[i];
                    if (fs9Var != null) {
                        iB += CodedOutputByteBufferNano.n(1, fs9Var);
                    }
                    i++;
                }
            }
            return iB;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            fs9[] fs9VarArr = this.c;
            if (fs9VarArr != null && fs9VarArr.length > 0) {
                int i = 0;
                while (true) {
                    fs9[] fs9VarArr2 = this.c;
                    if (i >= fs9VarArr2.length) {
                        break;
                    }
                    fs9 fs9Var = fs9VarArr2[i];
                    if (fs9Var != null) {
                        codedOutputByteBufferNano.Y(1, fs9Var);
                    }
                    i++;
                }
            }
            super.j(codedOutputByteBufferNano);
        }

        public a m() {
            this.c = fs9.n();
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
                    fs9[] fs9VarArr = this.c;
                    int length = fs9VarArr == null ? 0 : fs9VarArr.length;
                    int i = iA2 + length;
                    fs9[] fs9VarArr2 = new fs9[i];
                    if (length != 0) {
                        System.arraycopy(fs9VarArr, 0, fs9VarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        fs9 fs9Var = new fs9();
                        fs9VarArr2[length] = fs9Var;
                        o34Var.q(fs9Var);
                        o34Var.A();
                        length++;
                    }
                    fs9 fs9Var2 = new fs9();
                    fs9VarArr2[length] = fs9Var2;
                    o34Var.q(fs9Var2);
                    this.c = fs9VarArr2;
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public fs9() {
        m();
    }

    public static fs9[] n() {
        if (e == null) {
            synchronized (afd.c) {
                try {
                    if (e == null) {
                        e = new fs9[0];
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
        return super.b() + CodedOutputByteBufferNano.l(1, this.c) + CodedOutputByteBufferNano.r(2, this.d);
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.W(1, this.c);
        codedOutputByteBufferNano.i0(2, this.d);
        super.j(codedOutputByteBufferNano);
    }

    public fs9 m() {
        this.c = 0;
        this.d = 0;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public fs9 e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 8) {
                int iP = o34Var.p();
                switch (iP) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        this.c = iP;
                        break;
                }
            } else if (iA == 16) {
                this.d = o34Var.x();
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
