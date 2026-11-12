package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class clf extends ak8<clf> {
    public static volatile clf[] i;
    public byte[] c;
    public String d;
    public int e;
    public int f;
    public String g;
    public String h;

    public static final class a extends ak8<a> {
        public clf c;

        public a() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            int iB = super.b();
            clf clfVar = this.c;
            return clfVar != null ? iB + CodedOutputByteBufferNano.n(1, clfVar) : iB;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            clf clfVar = this.c;
            if (clfVar != null) {
                codedOutputByteBufferNano.Y(1, clfVar);
            }
            super.j(codedOutputByteBufferNano);
        }

        public a m() {
            this.c = null;
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
                    if (this.c == null) {
                        this.c = new clf();
                    }
                    o34Var.q(this.c);
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public static final class b extends ak8<b> {
        public int c;
        public int d;

        public b() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            int iB = super.b() + CodedOutputByteBufferNano.l(1, this.c);
            int i = this.d;
            return i != 0 ? iB + CodedOutputByteBufferNano.y(2, i) : iB;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.W(1, this.c);
            int i = this.d;
            if (i != 0) {
                codedOutputByteBufferNano.p0(2, i);
            }
            super.j(codedOutputByteBufferNano);
        }

        public b m() {
            this.c = 0;
            this.d = 0;
            this.f1122b = null;
            this.f15887a = -1;
            return this;
        }

        @Override // defpackage.dsf
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public b e(o34 o34Var) throws IOException {
            while (true) {
                int iA = o34Var.A();
                if (iA == 0) {
                    return this;
                }
                if (iA == 8) {
                    int iP = o34Var.p();
                    if (iP != 255) {
                        switch (iP) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                                break;
                            default:
                                continue;
                        }
                    }
                    this.c = iP;
                } else if (iA == 16) {
                    this.d = o34Var.B();
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public static final class c extends ak8<c> {
        public int c;

        public c() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            return super.b() + CodedOutputByteBufferNano.y(1, this.c);
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.p0(1, this.c);
            super.j(codedOutputByteBufferNano);
        }

        public c m() {
            this.c = 0;
            this.f1122b = null;
            this.f15887a = -1;
            return this;
        }

        @Override // defpackage.dsf
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public c e(o34 o34Var) throws IOException {
            while (true) {
                int iA = o34Var.A();
                if (iA == 0) {
                    return this;
                }
                if (iA == 8) {
                    this.c = o34Var.B();
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public static final class d extends ak8<d> {
        public clf[] c;
        public int d;

        public d() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            int iB = super.b();
            clf[] clfVarArr = this.c;
            if (clfVarArr != null && clfVarArr.length > 0) {
                int i = 0;
                while (true) {
                    clf[] clfVarArr2 = this.c;
                    if (i >= clfVarArr2.length) {
                        break;
                    }
                    clf clfVar = clfVarArr2[i];
                    if (clfVar != null) {
                        iB += CodedOutputByteBufferNano.n(1, clfVar);
                    }
                    i++;
                }
            }
            return iB + CodedOutputByteBufferNano.y(2, this.d);
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            clf[] clfVarArr = this.c;
            if (clfVarArr != null && clfVarArr.length > 0) {
                int i = 0;
                while (true) {
                    clf[] clfVarArr2 = this.c;
                    if (i >= clfVarArr2.length) {
                        break;
                    }
                    clf clfVar = clfVarArr2[i];
                    if (clfVar != null) {
                        codedOutputByteBufferNano.Y(1, clfVar);
                    }
                    i++;
                }
            }
            codedOutputByteBufferNano.p0(2, this.d);
            super.j(codedOutputByteBufferNano);
        }

        public d m() {
            this.c = clf.n();
            this.d = 0;
            this.f1122b = null;
            this.f15887a = -1;
            return this;
        }

        @Override // defpackage.dsf
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public d e(o34 o34Var) throws IOException {
            while (true) {
                int iA = o34Var.A();
                if (iA == 0) {
                    return this;
                }
                if (iA == 10) {
                    int iA2 = bmr.a(o34Var, 10);
                    clf[] clfVarArr = this.c;
                    int length = clfVarArr == null ? 0 : clfVarArr.length;
                    int i = iA2 + length;
                    clf[] clfVarArr2 = new clf[i];
                    if (length != 0) {
                        System.arraycopy(clfVarArr, 0, clfVarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        clf clfVar = new clf();
                        clfVarArr2[length] = clfVar;
                        o34Var.q(clfVar);
                        o34Var.A();
                        length++;
                    }
                    clf clfVar2 = new clf();
                    clfVarArr2[length] = clfVar2;
                    o34Var.q(clfVar2);
                    this.c = clfVarArr2;
                } else if (iA == 16) {
                    this.d = o34Var.B();
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public static final class e extends ak8<e> {
        public byte[] c;

        public e() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            return super.b() + CodedOutputByteBufferNano.d(1, this.c);
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.O(1, this.c);
            super.j(codedOutputByteBufferNano);
        }

        public e m() {
            this.c = bmr.h;
            this.f1122b = null;
            this.f15887a = -1;
            return this;
        }

        @Override // defpackage.dsf
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public e e(o34 o34Var) throws IOException {
            while (true) {
                int iA = o34Var.A();
                if (iA == 0) {
                    return this;
                }
                if (iA == 10) {
                    this.c = o34Var.l();
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public static final class f extends ak8<f> {
        public boolean c;

        public f() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            return super.b() + CodedOutputByteBufferNano.b(1, this.c);
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.M(1, this.c);
            super.j(codedOutputByteBufferNano);
        }

        public f m() {
            this.c = false;
            this.f1122b = null;
            this.f15887a = -1;
            return this;
        }

        @Override // defpackage.dsf
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public f e(o34 o34Var) throws IOException {
            while (true) {
                int iA = o34Var.A();
                if (iA == 0) {
                    return this;
                }
                if (iA == 8) {
                    this.c = o34Var.k();
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public static final class g extends ak8<g> {
        public int c;
        public byte[] d;

        public g() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            int iB = super.b() + CodedOutputByteBufferNano.l(1, this.c);
            return !Arrays.equals(this.d, bmr.h) ? iB + CodedOutputByteBufferNano.d(2, this.d) : iB;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.W(1, this.c);
            if (!Arrays.equals(this.d, bmr.h)) {
                codedOutputByteBufferNano.O(2, this.d);
            }
            super.j(codedOutputByteBufferNano);
        }

        public g m() {
            this.c = 0;
            this.d = bmr.h;
            this.f1122b = null;
            this.f15887a = -1;
            return this;
        }

        @Override // defpackage.dsf
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public g e(o34 o34Var) throws IOException {
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
                } else if (iA == 18) {
                    this.d = o34Var.l();
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public clf() {
        m();
    }

    public static clf[] n() {
        if (i == null) {
            synchronized (afd.c) {
                try {
                    if (i == null) {
                        i = new clf[0];
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
        int iB = super.b() + CodedOutputByteBufferNano.d(1, this.c) + CodedOutputByteBufferNano.v(2, this.d) + CodedOutputByteBufferNano.y(3, this.e);
        int i2 = this.f;
        if (i2 != 0) {
            iB += CodedOutputByteBufferNano.y(4, i2);
        }
        if (!this.g.equals("")) {
            iB += CodedOutputByteBufferNano.v(5, this.g);
        }
        return !this.h.equals("") ? iB + CodedOutputByteBufferNano.v(6, this.h) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.O(1, this.c);
        codedOutputByteBufferNano.m0(2, this.d);
        codedOutputByteBufferNano.p0(3, this.e);
        int i2 = this.f;
        if (i2 != 0) {
            codedOutputByteBufferNano.p0(4, i2);
        }
        if (!this.g.equals("")) {
            codedOutputByteBufferNano.m0(5, this.g);
        }
        if (!this.h.equals("")) {
            codedOutputByteBufferNano.m0(6, this.h);
        }
        super.j(codedOutputByteBufferNano);
    }

    public clf m() {
        this.c = bmr.h;
        this.d = "";
        this.e = 0;
        this.f = 0;
        this.g = "";
        this.h = "";
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public clf e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 10) {
                this.c = o34Var.l();
            } else if (iA == 18) {
                this.d = o34Var.z();
            } else if (iA == 24) {
                this.e = o34Var.B();
            } else if (iA == 32) {
                this.f = o34Var.B();
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
