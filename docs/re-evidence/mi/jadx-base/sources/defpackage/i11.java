package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class i11 extends ak8<i11> {
    public static volatile i11[] f;
    public f21 c;
    public String d;
    public String e;

    public static final class a extends ak8<a> {
        public i11[] c;

        public a() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            int iB = super.b();
            i11[] i11VarArr = this.c;
            if (i11VarArr != null && i11VarArr.length > 0) {
                int i = 0;
                while (true) {
                    i11[] i11VarArr2 = this.c;
                    if (i >= i11VarArr2.length) {
                        break;
                    }
                    i11 i11Var = i11VarArr2[i];
                    if (i11Var != null) {
                        iB += CodedOutputByteBufferNano.n(1, i11Var);
                    }
                    i++;
                }
            }
            return iB;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            i11[] i11VarArr = this.c;
            if (i11VarArr != null && i11VarArr.length > 0) {
                int i = 0;
                while (true) {
                    i11[] i11VarArr2 = this.c;
                    if (i >= i11VarArr2.length) {
                        break;
                    }
                    i11 i11Var = i11VarArr2[i];
                    if (i11Var != null) {
                        codedOutputByteBufferNano.Y(1, i11Var);
                    }
                    i++;
                }
            }
            super.j(codedOutputByteBufferNano);
        }

        public a m() {
            this.c = i11.n();
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
                    i11[] i11VarArr = this.c;
                    int length = i11VarArr == null ? 0 : i11VarArr.length;
                    int i = iA2 + length;
                    i11[] i11VarArr2 = new i11[i];
                    if (length != 0) {
                        System.arraycopy(i11VarArr, 0, i11VarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        i11 i11Var = new i11();
                        i11VarArr2[length] = i11Var;
                        o34Var.q(i11Var);
                        o34Var.A();
                        length++;
                    }
                    i11 i11Var2 = new i11();
                    i11VarArr2[length] = i11Var2;
                    o34Var.q(i11Var2);
                    this.c = i11VarArr2;
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public i11() {
        m();
    }

    public static i11[] n() {
        if (f == null) {
            synchronized (afd.c) {
                try {
                    if (f == null) {
                        f = new i11[0];
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
        int iV = iB + CodedOutputByteBufferNano.v(2, this.d);
        return !this.e.equals("") ? iV + CodedOutputByteBufferNano.v(3, this.e) : iV;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        f21 f21Var = this.c;
        if (f21Var != null) {
            codedOutputByteBufferNano.Y(1, f21Var);
        }
        codedOutputByteBufferNano.m0(2, this.d);
        if (!this.e.equals("")) {
            codedOutputByteBufferNano.m0(3, this.e);
        }
        super.j(codedOutputByteBufferNano);
    }

    public i11 m() {
        this.c = null;
        this.d = "";
        this.e = "";
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public i11 e(o34 o34Var) throws IOException {
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
            } else if (iA == 18) {
                this.d = o34Var.z();
            } else if (iA == 26) {
                this.e = o34Var.z();
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
