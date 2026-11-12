package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public final class ft9 extends ak8<ft9> {
    public static volatile ft9[] h;
    public byte[] c;
    public int d;
    public long e;
    public int f;
    public int g;

    public static final class a extends ak8<a> {
        public ft9[] c;

        public a() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            int iB = super.b();
            ft9[] ft9VarArr = this.c;
            if (ft9VarArr != null && ft9VarArr.length > 0) {
                int i = 0;
                while (true) {
                    ft9[] ft9VarArr2 = this.c;
                    if (i >= ft9VarArr2.length) {
                        break;
                    }
                    ft9 ft9Var = ft9VarArr2[i];
                    if (ft9Var != null) {
                        iB += CodedOutputByteBufferNano.n(1, ft9Var);
                    }
                    i++;
                }
            }
            return iB;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            ft9[] ft9VarArr = this.c;
            if (ft9VarArr != null && ft9VarArr.length > 0) {
                int i = 0;
                while (true) {
                    ft9[] ft9VarArr2 = this.c;
                    if (i >= ft9VarArr2.length) {
                        break;
                    }
                    ft9 ft9Var = ft9VarArr2[i];
                    if (ft9Var != null) {
                        codedOutputByteBufferNano.Y(1, ft9Var);
                    }
                    i++;
                }
            }
            super.j(codedOutputByteBufferNano);
        }

        public a m() {
            this.c = ft9.n();
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
                    ft9[] ft9VarArr = this.c;
                    int length = ft9VarArr == null ? 0 : ft9VarArr.length;
                    int i = iA2 + length;
                    ft9[] ft9VarArr2 = new ft9[i];
                    if (length != 0) {
                        System.arraycopy(ft9VarArr, 0, ft9VarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        ft9 ft9Var = new ft9();
                        ft9VarArr2[length] = ft9Var;
                        o34Var.q(ft9Var);
                        o34Var.A();
                        length++;
                    }
                    ft9 ft9Var2 = new ft9();
                    ft9VarArr2[length] = ft9Var2;
                    o34Var.q(ft9Var2);
                    this.c = ft9VarArr2;
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public ft9() {
        m();
    }

    public static ft9[] n() {
        if (h == null) {
            synchronized (afd.c) {
                try {
                    if (h == null) {
                        h = new ft9[0];
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
        int iB = super.b() + CodedOutputByteBufferNano.d(1, this.c);
        int i = this.d;
        if (i != 0) {
            iB += CodedOutputByteBufferNano.y(2, i);
        }
        long j = this.e;
        if (j != 0) {
            iB += CodedOutputByteBufferNano.A(3, j);
        }
        int i2 = this.f;
        if (i2 != 0) {
            iB += CodedOutputByteBufferNano.y(4, i2);
        }
        int i3 = this.g;
        return i3 != 0 ? iB + CodedOutputByteBufferNano.y(5, i3) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.O(1, this.c);
        int i = this.d;
        if (i != 0) {
            codedOutputByteBufferNano.p0(2, i);
        }
        long j = this.e;
        if (j != 0) {
            codedOutputByteBufferNano.r0(3, j);
        }
        int i2 = this.f;
        if (i2 != 0) {
            codedOutputByteBufferNano.p0(4, i2);
        }
        int i3 = this.g;
        if (i3 != 0) {
            codedOutputByteBufferNano.p0(5, i3);
        }
        super.j(codedOutputByteBufferNano);
    }

    public ft9 m() {
        this.c = bmr.h;
        this.d = 0;
        this.e = 0L;
        this.f = 0;
        this.g = 0;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public ft9 e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 10) {
                this.c = o34Var.l();
            } else if (iA == 16) {
                this.d = o34Var.B();
            } else if (iA == 24) {
                this.e = o34Var.C();
            } else if (iA == 32) {
                this.f = o34Var.B();
            } else if (iA == 40) {
                this.g = o34Var.B();
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
