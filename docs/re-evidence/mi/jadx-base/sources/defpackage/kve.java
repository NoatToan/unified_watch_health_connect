package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class kve extends ak8<kve> {
    public static volatile kve[] i;
    public byte[] c;
    public String d;
    public String e;
    public boolean f;
    public String g;
    public String h;

    public static final class a extends ak8<a> {
        public kve[] c;

        public a() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            int iB = super.b();
            kve[] kveVarArr = this.c;
            if (kveVarArr != null && kveVarArr.length > 0) {
                int i = 0;
                while (true) {
                    kve[] kveVarArr2 = this.c;
                    if (i >= kveVarArr2.length) {
                        break;
                    }
                    kve kveVar = kveVarArr2[i];
                    if (kveVar != null) {
                        iB += CodedOutputByteBufferNano.n(1, kveVar);
                    }
                    i++;
                }
            }
            return iB;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            kve[] kveVarArr = this.c;
            if (kveVarArr != null && kveVarArr.length > 0) {
                int i = 0;
                while (true) {
                    kve[] kveVarArr2 = this.c;
                    if (i >= kveVarArr2.length) {
                        break;
                    }
                    kve kveVar = kveVarArr2[i];
                    if (kveVar != null) {
                        codedOutputByteBufferNano.Y(1, kveVar);
                    }
                    i++;
                }
            }
            super.j(codedOutputByteBufferNano);
        }

        public a m() {
            this.c = kve.n();
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
                    kve[] kveVarArr = this.c;
                    int length = kveVarArr == null ? 0 : kveVarArr.length;
                    int i = iA2 + length;
                    kve[] kveVarArr2 = new kve[i];
                    if (length != 0) {
                        System.arraycopy(kveVarArr, 0, kveVarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        kve kveVar = new kve();
                        kveVarArr2[length] = kveVar;
                        o34Var.q(kveVar);
                        o34Var.A();
                        length++;
                    }
                    kve kveVar2 = new kve();
                    kveVarArr2[length] = kveVar2;
                    o34Var.q(kveVar2);
                    this.c = kveVarArr2;
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public kve() {
        m();
    }

    public static kve[] n() {
        if (i == null) {
            synchronized (afd.c) {
                try {
                    if (i == null) {
                        i = new kve[0];
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
        int iB = super.b() + CodedOutputByteBufferNano.d(1, this.c) + CodedOutputByteBufferNano.v(2, this.d) + CodedOutputByteBufferNano.v(3, this.e) + CodedOutputByteBufferNano.b(4, this.f);
        if (!this.g.equals("")) {
            iB += CodedOutputByteBufferNano.v(5, this.g);
        }
        return !this.h.equals("") ? iB + CodedOutputByteBufferNano.v(6, this.h) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.O(1, this.c);
        codedOutputByteBufferNano.m0(2, this.d);
        codedOutputByteBufferNano.m0(3, this.e);
        codedOutputByteBufferNano.M(4, this.f);
        if (!this.g.equals("")) {
            codedOutputByteBufferNano.m0(5, this.g);
        }
        if (!this.h.equals("")) {
            codedOutputByteBufferNano.m0(6, this.h);
        }
        super.j(codedOutputByteBufferNano);
    }

    public kve m() {
        this.c = bmr.h;
        this.d = "";
        this.e = "";
        this.f = false;
        this.g = "";
        this.h = "";
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public kve e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 10) {
                this.c = o34Var.l();
            } else if (iA == 18) {
                this.d = o34Var.z();
            } else if (iA == 26) {
                this.e = o34Var.z();
            } else if (iA == 32) {
                this.f = o34Var.k();
            } else if (iA == 42) {
                this.g = o34Var.z();
            } else if (iA == 50) {
                this.h = o34Var.z();
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
