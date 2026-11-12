package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class x5r extends ak8<x5r> {
    public static volatile x5r[] d;
    public String c;

    public static final class a extends ak8<a> {
        public x5r[] c;

        public a() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            int iB = super.b();
            x5r[] x5rVarArr = this.c;
            if (x5rVarArr != null && x5rVarArr.length > 0) {
                int i = 0;
                while (true) {
                    x5r[] x5rVarArr2 = this.c;
                    if (i >= x5rVarArr2.length) {
                        break;
                    }
                    x5r x5rVar = x5rVarArr2[i];
                    if (x5rVar != null) {
                        iB += CodedOutputByteBufferNano.n(1, x5rVar);
                    }
                    i++;
                }
            }
            return iB;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            x5r[] x5rVarArr = this.c;
            if (x5rVarArr != null && x5rVarArr.length > 0) {
                int i = 0;
                while (true) {
                    x5r[] x5rVarArr2 = this.c;
                    if (i >= x5rVarArr2.length) {
                        break;
                    }
                    x5r x5rVar = x5rVarArr2[i];
                    if (x5rVar != null) {
                        codedOutputByteBufferNano.Y(1, x5rVar);
                    }
                    i++;
                }
            }
            super.j(codedOutputByteBufferNano);
        }

        public a m() {
            this.c = x5r.n();
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
                    x5r[] x5rVarArr = this.c;
                    int length = x5rVarArr == null ? 0 : x5rVarArr.length;
                    int i = iA2 + length;
                    x5r[] x5rVarArr2 = new x5r[i];
                    if (length != 0) {
                        System.arraycopy(x5rVarArr, 0, x5rVarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        x5r x5rVar = new x5r();
                        x5rVarArr2[length] = x5rVar;
                        o34Var.q(x5rVar);
                        o34Var.A();
                        length++;
                    }
                    x5r x5rVar2 = new x5r();
                    x5rVarArr2[length] = x5rVar2;
                    o34Var.q(x5rVar2);
                    this.c = x5rVarArr2;
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public x5r() {
        m();
    }

    public static x5r[] n() {
        if (d == null) {
            synchronized (afd.c) {
                try {
                    if (d == null) {
                        d = new x5r[0];
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
        return super.b() + CodedOutputByteBufferNano.v(1, this.c);
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.m0(1, this.c);
        super.j(codedOutputByteBufferNano);
    }

    public x5r m() {
        this.c = "";
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public x5r e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 10) {
                this.c = o34Var.z();
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
