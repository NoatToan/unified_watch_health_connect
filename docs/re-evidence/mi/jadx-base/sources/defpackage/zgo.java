package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class zgo extends ak8<zgo> {
    public static volatile zgo[] f;
    public String c;
    public boolean d;
    public int e;

    public static final class a extends ak8<a> {
        public zgo[] c;

        public a() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            int iB = super.b();
            zgo[] zgoVarArr = this.c;
            if (zgoVarArr != null && zgoVarArr.length > 0) {
                int i = 0;
                while (true) {
                    zgo[] zgoVarArr2 = this.c;
                    if (i >= zgoVarArr2.length) {
                        break;
                    }
                    zgo zgoVar = zgoVarArr2[i];
                    if (zgoVar != null) {
                        iB += CodedOutputByteBufferNano.n(1, zgoVar);
                    }
                    i++;
                }
            }
            return iB;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            zgo[] zgoVarArr = this.c;
            if (zgoVarArr != null && zgoVarArr.length > 0) {
                int i = 0;
                while (true) {
                    zgo[] zgoVarArr2 = this.c;
                    if (i >= zgoVarArr2.length) {
                        break;
                    }
                    zgo zgoVar = zgoVarArr2[i];
                    if (zgoVar != null) {
                        codedOutputByteBufferNano.Y(1, zgoVar);
                    }
                    i++;
                }
            }
            super.j(codedOutputByteBufferNano);
        }

        public a m() {
            this.c = zgo.n();
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
                    zgo[] zgoVarArr = this.c;
                    int length = zgoVarArr == null ? 0 : zgoVarArr.length;
                    int i = iA2 + length;
                    zgo[] zgoVarArr2 = new zgo[i];
                    if (length != 0) {
                        System.arraycopy(zgoVarArr, 0, zgoVarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        zgo zgoVar = new zgo();
                        zgoVarArr2[length] = zgoVar;
                        o34Var.q(zgoVar);
                        o34Var.A();
                        length++;
                    }
                    zgo zgoVar2 = new zgo();
                    zgoVarArr2[length] = zgoVar2;
                    o34Var.q(zgoVar2);
                    this.c = zgoVarArr2;
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public zgo() {
        m();
    }

    public static zgo[] n() {
        if (f == null) {
            synchronized (afd.c) {
                try {
                    if (f == null) {
                        f = new zgo[0];
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
        return super.b() + CodedOutputByteBufferNano.v(1, this.c) + CodedOutputByteBufferNano.b(2, this.d) + CodedOutputByteBufferNano.y(3, this.e);
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.m0(1, this.c);
        codedOutputByteBufferNano.M(2, this.d);
        codedOutputByteBufferNano.p0(3, this.e);
        super.j(codedOutputByteBufferNano);
    }

    public zgo m() {
        this.c = "";
        this.d = false;
        this.e = 0;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public zgo e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 10) {
                this.c = o34Var.z();
            } else if (iA == 16) {
                this.d = o34Var.k();
            } else if (iA == 24) {
                this.e = o34Var.B();
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
