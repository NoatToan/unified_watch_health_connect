package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class eg4 extends ak8<eg4> {
    public static volatile eg4[] e;
    public String c;
    public String d;

    public static final class a extends ak8<a> {
        public eg4[] c;
        public int d;
        public int e;
        public int f;

        public a() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            int iB = super.b();
            eg4[] eg4VarArr = this.c;
            if (eg4VarArr != null && eg4VarArr.length > 0) {
                int i = 0;
                while (true) {
                    eg4[] eg4VarArr2 = this.c;
                    if (i >= eg4VarArr2.length) {
                        break;
                    }
                    eg4 eg4Var = eg4VarArr2[i];
                    if (eg4Var != null) {
                        iB += CodedOutputByteBufferNano.n(1, eg4Var);
                    }
                    i++;
                }
            }
            int i2 = this.e;
            if (i2 != 0) {
                iB += CodedOutputByteBufferNano.y(2, i2);
            }
            int i3 = this.f;
            if (i3 != 0) {
                iB += CodedOutputByteBufferNano.y(3, i3);
            }
            int i4 = this.d;
            return i4 != 0 ? iB + CodedOutputByteBufferNano.y(4, i4) : iB;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            eg4[] eg4VarArr = this.c;
            if (eg4VarArr != null && eg4VarArr.length > 0) {
                int i = 0;
                while (true) {
                    eg4[] eg4VarArr2 = this.c;
                    if (i >= eg4VarArr2.length) {
                        break;
                    }
                    eg4 eg4Var = eg4VarArr2[i];
                    if (eg4Var != null) {
                        codedOutputByteBufferNano.Y(1, eg4Var);
                    }
                    i++;
                }
            }
            int i2 = this.e;
            if (i2 != 0) {
                codedOutputByteBufferNano.p0(2, i2);
            }
            int i3 = this.f;
            if (i3 != 0) {
                codedOutputByteBufferNano.p0(3, i3);
            }
            int i4 = this.d;
            if (i4 != 0) {
                codedOutputByteBufferNano.p0(4, i4);
            }
            super.j(codedOutputByteBufferNano);
        }

        public a m() {
            this.c = eg4.n();
            this.d = 0;
            this.e = 0;
            this.f = 0;
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
                    eg4[] eg4VarArr = this.c;
                    int length = eg4VarArr == null ? 0 : eg4VarArr.length;
                    int i = iA2 + length;
                    eg4[] eg4VarArr2 = new eg4[i];
                    if (length != 0) {
                        System.arraycopy(eg4VarArr, 0, eg4VarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        eg4 eg4Var = new eg4();
                        eg4VarArr2[length] = eg4Var;
                        o34Var.q(eg4Var);
                        o34Var.A();
                        length++;
                    }
                    eg4 eg4Var2 = new eg4();
                    eg4VarArr2[length] = eg4Var2;
                    o34Var.q(eg4Var2);
                    this.c = eg4VarArr2;
                } else if (iA == 16) {
                    this.e = o34Var.B();
                } else if (iA == 24) {
                    this.f = o34Var.B();
                } else if (iA == 32) {
                    this.d = o34Var.B();
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public eg4() {
        m();
    }

    public static eg4[] n() {
        if (e == null) {
            synchronized (afd.c) {
                try {
                    if (e == null) {
                        e = new eg4[0];
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

    public eg4 m() {
        this.c = "";
        this.d = "";
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public eg4 e(o34 o34Var) throws IOException {
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
