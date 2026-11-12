package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class lwo extends ak8<lwo> {
    public static volatile lwo[] e;
    public int c;
    public boolean d;

    public static final class a extends ak8<a> {
        public lwo[] c;

        public a() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            int iB = super.b();
            lwo[] lwoVarArr = this.c;
            if (lwoVarArr != null && lwoVarArr.length > 0) {
                int i = 0;
                while (true) {
                    lwo[] lwoVarArr2 = this.c;
                    if (i >= lwoVarArr2.length) {
                        break;
                    }
                    lwo lwoVar = lwoVarArr2[i];
                    if (lwoVar != null) {
                        iB += CodedOutputByteBufferNano.n(1, lwoVar);
                    }
                    i++;
                }
            }
            return iB;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            lwo[] lwoVarArr = this.c;
            if (lwoVarArr != null && lwoVarArr.length > 0) {
                int i = 0;
                while (true) {
                    lwo[] lwoVarArr2 = this.c;
                    if (i >= lwoVarArr2.length) {
                        break;
                    }
                    lwo lwoVar = lwoVarArr2[i];
                    if (lwoVar != null) {
                        codedOutputByteBufferNano.Y(1, lwoVar);
                    }
                    i++;
                }
            }
            super.j(codedOutputByteBufferNano);
        }

        public a m() {
            this.c = lwo.n();
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
                    lwo[] lwoVarArr = this.c;
                    int length = lwoVarArr == null ? 0 : lwoVarArr.length;
                    int i = iA2 + length;
                    lwo[] lwoVarArr2 = new lwo[i];
                    if (length != 0) {
                        System.arraycopy(lwoVarArr, 0, lwoVarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        lwo lwoVar = new lwo();
                        lwoVarArr2[length] = lwoVar;
                        o34Var.q(lwoVar);
                        o34Var.A();
                        length++;
                    }
                    lwo lwoVar2 = new lwo();
                    lwoVarArr2[length] = lwoVar2;
                    o34Var.q(lwoVar2);
                    this.c = lwoVarArr2;
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public lwo() {
        m();
    }

    public static lwo[] n() {
        if (e == null) {
            synchronized (afd.c) {
                try {
                    if (e == null) {
                        e = new lwo[0];
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
        return super.b() + CodedOutputByteBufferNano.l(1, this.c) + CodedOutputByteBufferNano.b(2, this.d);
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.W(1, this.c);
        codedOutputByteBufferNano.M(2, this.d);
        super.j(codedOutputByteBufferNano);
    }

    public lwo m() {
        this.c = 0;
        this.d = false;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public lwo e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 8) {
                int iP = o34Var.p();
                if (iP == 0 || iP == 1 || iP == 2) {
                    this.c = iP;
                }
            } else if (iA == 16) {
                this.d = o34Var.k();
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
