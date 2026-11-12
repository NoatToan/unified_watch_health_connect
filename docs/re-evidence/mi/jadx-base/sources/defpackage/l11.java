package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class l11 extends ak8<l11> {
    public static volatile l11[] f;
    public f21 c;
    public int d;
    public String e;

    public static final class a extends ak8<a> {
        public l11[] c;

        public a() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            int iB = super.b();
            l11[] l11VarArr = this.c;
            if (l11VarArr != null && l11VarArr.length > 0) {
                int i = 0;
                while (true) {
                    l11[] l11VarArr2 = this.c;
                    if (i >= l11VarArr2.length) {
                        break;
                    }
                    l11 l11Var = l11VarArr2[i];
                    if (l11Var != null) {
                        iB += CodedOutputByteBufferNano.n(1, l11Var);
                    }
                    i++;
                }
            }
            return iB;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            l11[] l11VarArr = this.c;
            if (l11VarArr != null && l11VarArr.length > 0) {
                int i = 0;
                while (true) {
                    l11[] l11VarArr2 = this.c;
                    if (i >= l11VarArr2.length) {
                        break;
                    }
                    l11 l11Var = l11VarArr2[i];
                    if (l11Var != null) {
                        codedOutputByteBufferNano.Y(1, l11Var);
                    }
                    i++;
                }
            }
            super.j(codedOutputByteBufferNano);
        }

        public a m() {
            this.c = l11.n();
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
                    l11[] l11VarArr = this.c;
                    int length = l11VarArr == null ? 0 : l11VarArr.length;
                    int i = iA2 + length;
                    l11[] l11VarArr2 = new l11[i];
                    if (length != 0) {
                        System.arraycopy(l11VarArr, 0, l11VarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        l11 l11Var = new l11();
                        l11VarArr2[length] = l11Var;
                        o34Var.q(l11Var);
                        o34Var.A();
                        length++;
                    }
                    l11 l11Var2 = new l11();
                    l11VarArr2[length] = l11Var2;
                    o34Var.q(l11Var2);
                    this.c = l11VarArr2;
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public l11() {
        m();
    }

    public static l11[] n() {
        if (f == null) {
            synchronized (afd.c) {
                try {
                    if (f == null) {
                        f = new l11[0];
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
        int iB = super.b();
        f21 f21Var = this.c;
        if (f21Var != null) {
            iB += CodedOutputByteBufferNano.n(1, f21Var);
        }
        int i = this.d;
        if (i != 0) {
            iB += CodedOutputByteBufferNano.y(2, i);
        }
        return !this.e.equals("") ? iB + CodedOutputByteBufferNano.v(3, this.e) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        f21 f21Var = this.c;
        if (f21Var != null) {
            codedOutputByteBufferNano.Y(1, f21Var);
        }
        int i = this.d;
        if (i != 0) {
            codedOutputByteBufferNano.p0(2, i);
        }
        if (!this.e.equals("")) {
            codedOutputByteBufferNano.m0(3, this.e);
        }
        super.j(codedOutputByteBufferNano);
    }

    public l11 m() {
        this.c = null;
        this.d = 0;
        this.e = "";
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public l11 e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 10) {
                if (this.c == null) {
                    this.c = new f21();
                }
                o34Var.q(this.c);
            } else if (iA == 16) {
                this.d = o34Var.B();
            } else if (iA == 26) {
                this.e = o34Var.z();
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
