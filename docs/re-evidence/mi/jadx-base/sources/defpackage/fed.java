package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class fed extends ak8<fed> {
    public static volatile fed[] g;
    public String c;
    public String d;
    public String e;
    public int f;

    public static final class a extends ak8<a> {
        public fed[] c;

        public a() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            int iB = super.b();
            fed[] fedVarArr = this.c;
            if (fedVarArr != null && fedVarArr.length > 0) {
                int i = 0;
                while (true) {
                    fed[] fedVarArr2 = this.c;
                    if (i >= fedVarArr2.length) {
                        break;
                    }
                    fed fedVar = fedVarArr2[i];
                    if (fedVar != null) {
                        iB += CodedOutputByteBufferNano.n(1, fedVar);
                    }
                    i++;
                }
            }
            return iB;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            fed[] fedVarArr = this.c;
            if (fedVarArr != null && fedVarArr.length > 0) {
                int i = 0;
                while (true) {
                    fed[] fedVarArr2 = this.c;
                    if (i >= fedVarArr2.length) {
                        break;
                    }
                    fed fedVar = fedVarArr2[i];
                    if (fedVar != null) {
                        codedOutputByteBufferNano.Y(1, fedVar);
                    }
                    i++;
                }
            }
            super.j(codedOutputByteBufferNano);
        }

        public a m() {
            this.c = fed.n();
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
                    fed[] fedVarArr = this.c;
                    int length = fedVarArr == null ? 0 : fedVarArr.length;
                    int i = iA2 + length;
                    fed[] fedVarArr2 = new fed[i];
                    if (length != 0) {
                        System.arraycopy(fedVarArr, 0, fedVarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        fed fedVar = new fed();
                        fedVarArr2[length] = fedVar;
                        o34Var.q(fedVar);
                        o34Var.A();
                        length++;
                    }
                    fed fedVar2 = new fed();
                    fedVarArr2[length] = fedVar2;
                    o34Var.q(fedVar2);
                    this.c = fedVarArr2;
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public fed() {
        m();
    }

    public static fed[] n() {
        if (g == null) {
            synchronized (afd.c) {
                try {
                    if (g == null) {
                        g = new fed[0];
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return g;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b() + CodedOutputByteBufferNano.v(1, this.c) + CodedOutputByteBufferNano.v(2, this.d);
        if (!this.e.equals("")) {
            iB += CodedOutputByteBufferNano.v(3, this.e);
        }
        int i = this.f;
        return i != 0 ? iB + CodedOutputByteBufferNano.y(4, i) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.m0(1, this.c);
        codedOutputByteBufferNano.m0(2, this.d);
        if (!this.e.equals("")) {
            codedOutputByteBufferNano.m0(3, this.e);
        }
        int i = this.f;
        if (i != 0) {
            codedOutputByteBufferNano.p0(4, i);
        }
        super.j(codedOutputByteBufferNano);
    }

    public fed m() {
        this.c = "";
        this.d = "";
        this.e = "";
        this.f = 0;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public fed e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 10) {
                this.c = o34Var.z();
            } else if (iA == 18) {
                this.d = o34Var.z();
            } else if (iA == 26) {
                this.e = o34Var.z();
            } else if (iA == 32) {
                this.f = o34Var.B();
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
