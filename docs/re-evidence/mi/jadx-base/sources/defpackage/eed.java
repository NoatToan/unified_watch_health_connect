package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class eed extends ak8<eed> {
    public static volatile eed[] f;
    public String c;
    public String d;
    public int e;

    public static final class a extends ak8<a> {
        public eed[] c;

        public a() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            int iB = super.b();
            eed[] eedVarArr = this.c;
            if (eedVarArr != null && eedVarArr.length > 0) {
                int i = 0;
                while (true) {
                    eed[] eedVarArr2 = this.c;
                    if (i >= eedVarArr2.length) {
                        break;
                    }
                    eed eedVar = eedVarArr2[i];
                    if (eedVar != null) {
                        iB += CodedOutputByteBufferNano.n(1, eedVar);
                    }
                    i++;
                }
            }
            return iB;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            eed[] eedVarArr = this.c;
            if (eedVarArr != null && eedVarArr.length > 0) {
                int i = 0;
                while (true) {
                    eed[] eedVarArr2 = this.c;
                    if (i >= eedVarArr2.length) {
                        break;
                    }
                    eed eedVar = eedVarArr2[i];
                    if (eedVar != null) {
                        codedOutputByteBufferNano.Y(1, eedVar);
                    }
                    i++;
                }
            }
            super.j(codedOutputByteBufferNano);
        }

        public a m() {
            this.c = eed.n();
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
                    eed[] eedVarArr = this.c;
                    int length = eedVarArr == null ? 0 : eedVarArr.length;
                    int i = iA2 + length;
                    eed[] eedVarArr2 = new eed[i];
                    if (length != 0) {
                        System.arraycopy(eedVarArr, 0, eedVarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        eed eedVar = new eed();
                        eedVarArr2[length] = eedVar;
                        o34Var.q(eedVar);
                        o34Var.A();
                        length++;
                    }
                    eed eedVar2 = new eed();
                    eedVarArr2[length] = eedVar2;
                    o34Var.q(eedVar2);
                    this.c = eedVarArr2;
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public eed() {
        m();
    }

    public static eed[] n() {
        if (f == null) {
            synchronized (afd.c) {
                try {
                    if (f == null) {
                        f = new eed[0];
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
        return super.b() + CodedOutputByteBufferNano.v(1, this.c) + CodedOutputByteBufferNano.v(2, this.d) + CodedOutputByteBufferNano.y(3, this.e);
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.m0(1, this.c);
        codedOutputByteBufferNano.m0(2, this.d);
        codedOutputByteBufferNano.p0(3, this.e);
        super.j(codedOutputByteBufferNano);
    }

    public eed m() {
        this.c = "";
        this.d = "";
        this.e = 0;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public eed e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 10) {
                this.c = o34Var.z();
            } else if (iA == 18) {
                this.d = o34Var.z();
            } else if (iA == 24) {
                this.e = o34Var.B();
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
