package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class jwo extends ak8<jwo> {
    public static volatile jwo[] i;
    public String c;
    public String d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;

    public static final class a extends ak8<a> {
        public jwo[] c;

        public a() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            int iB = super.b();
            jwo[] jwoVarArr = this.c;
            if (jwoVarArr != null && jwoVarArr.length > 0) {
                int i = 0;
                while (true) {
                    jwo[] jwoVarArr2 = this.c;
                    if (i >= jwoVarArr2.length) {
                        break;
                    }
                    jwo jwoVar = jwoVarArr2[i];
                    if (jwoVar != null) {
                        iB += CodedOutputByteBufferNano.n(1, jwoVar);
                    }
                    i++;
                }
            }
            return iB;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            jwo[] jwoVarArr = this.c;
            if (jwoVarArr != null && jwoVarArr.length > 0) {
                int i = 0;
                while (true) {
                    jwo[] jwoVarArr2 = this.c;
                    if (i >= jwoVarArr2.length) {
                        break;
                    }
                    jwo jwoVar = jwoVarArr2[i];
                    if (jwoVar != null) {
                        codedOutputByteBufferNano.Y(1, jwoVar);
                    }
                    i++;
                }
            }
            super.j(codedOutputByteBufferNano);
        }

        public a m() {
            this.c = jwo.n();
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
                    jwo[] jwoVarArr = this.c;
                    int length = jwoVarArr == null ? 0 : jwoVarArr.length;
                    int i = iA2 + length;
                    jwo[] jwoVarArr2 = new jwo[i];
                    if (length != 0) {
                        System.arraycopy(jwoVarArr, 0, jwoVarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        jwo jwoVar = new jwo();
                        jwoVarArr2[length] = jwoVar;
                        o34Var.q(jwoVar);
                        o34Var.A();
                        length++;
                    }
                    jwo jwoVar2 = new jwo();
                    jwoVarArr2[length] = jwoVar2;
                    o34Var.q(jwoVar2);
                    this.c = jwoVarArr2;
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public jwo() {
        m();
    }

    public static jwo[] n() {
        if (i == null) {
            synchronized (afd.c) {
                try {
                    if (i == null) {
                        i = new jwo[0];
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return i;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b() + CodedOutputByteBufferNano.v(1, this.c);
        if (!this.d.equals("")) {
            iB += CodedOutputByteBufferNano.v(2, this.d);
        }
        boolean z = this.f;
        if (z) {
            iB += CodedOutputByteBufferNano.b(3, z);
        }
        boolean z2 = this.e;
        if (z2) {
            iB += CodedOutputByteBufferNano.b(4, z2);
        }
        boolean z3 = this.g;
        if (z3) {
            iB += CodedOutputByteBufferNano.b(5, z3);
        }
        boolean z4 = this.h;
        return z4 ? iB + CodedOutputByteBufferNano.b(6, z4) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.m0(1, this.c);
        if (!this.d.equals("")) {
            codedOutputByteBufferNano.m0(2, this.d);
        }
        boolean z = this.f;
        if (z) {
            codedOutputByteBufferNano.M(3, z);
        }
        boolean z2 = this.e;
        if (z2) {
            codedOutputByteBufferNano.M(4, z2);
        }
        boolean z3 = this.g;
        if (z3) {
            codedOutputByteBufferNano.M(5, z3);
        }
        boolean z4 = this.h;
        if (z4) {
            codedOutputByteBufferNano.M(6, z4);
        }
        super.j(codedOutputByteBufferNano);
    }

    public jwo m() {
        this.c = "";
        this.d = "";
        this.e = false;
        this.f = false;
        this.g = false;
        this.h = false;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public jwo e(o34 o34Var) throws IOException {
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
                this.f = o34Var.k();
            } else if (iA == 32) {
                this.e = o34Var.k();
            } else if (iA == 40) {
                this.g = o34Var.k();
            } else if (iA == 48) {
                this.h = o34Var.k();
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
