package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class z5r extends ak8<z5r> {
    public a.C1163a c;
    public String d;
    public int e;

    public static final class a extends ak8<a> {
        public static volatile a[] f;
        public String c;
        public String[] d;
        public int e;

        /* JADX INFO: renamed from: z5r$a$a, reason: collision with other inner class name */
        public static final class C1163a extends ak8<C1163a> {
            public a[] c;

            public C1163a() {
                m();
            }

            @Override // defpackage.ak8, defpackage.dsf
            public int b() {
                int iB = super.b();
                a[] aVarArr = this.c;
                if (aVarArr != null && aVarArr.length > 0) {
                    int i = 0;
                    while (true) {
                        a[] aVarArr2 = this.c;
                        if (i >= aVarArr2.length) {
                            break;
                        }
                        a aVar = aVarArr2[i];
                        if (aVar != null) {
                            iB += CodedOutputByteBufferNano.n(1, aVar);
                        }
                        i++;
                    }
                }
                return iB;
            }

            @Override // defpackage.ak8, defpackage.dsf
            public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
                a[] aVarArr = this.c;
                if (aVarArr != null && aVarArr.length > 0) {
                    int i = 0;
                    while (true) {
                        a[] aVarArr2 = this.c;
                        if (i >= aVarArr2.length) {
                            break;
                        }
                        a aVar = aVarArr2[i];
                        if (aVar != null) {
                            codedOutputByteBufferNano.Y(1, aVar);
                        }
                        i++;
                    }
                }
                super.j(codedOutputByteBufferNano);
            }

            public C1163a m() {
                this.c = a.n();
                this.f1122b = null;
                this.f15887a = -1;
                return this;
            }

            @Override // defpackage.dsf
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public C1163a e(o34 o34Var) throws IOException {
                while (true) {
                    int iA = o34Var.A();
                    if (iA == 0) {
                        return this;
                    }
                    if (iA == 10) {
                        int iA2 = bmr.a(o34Var, 10);
                        a[] aVarArr = this.c;
                        int length = aVarArr == null ? 0 : aVarArr.length;
                        int i = iA2 + length;
                        a[] aVarArr2 = new a[i];
                        if (length != 0) {
                            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                        }
                        while (length < i - 1) {
                            a aVar = new a();
                            aVarArr2[length] = aVar;
                            o34Var.q(aVar);
                            o34Var.A();
                            length++;
                        }
                        a aVar2 = new a();
                        aVarArr2[length] = aVar2;
                        o34Var.q(aVar2);
                        this.c = aVarArr2;
                    } else if (!l(o34Var, iA)) {
                        return this;
                    }
                }
            }
        }

        public a() {
            m();
        }

        public static a[] n() {
            if (f == null) {
                synchronized (afd.c) {
                    try {
                        if (f == null) {
                            f = new a[0];
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
            int iB = super.b() + CodedOutputByteBufferNano.v(1, this.c);
            String[] strArr = this.d;
            if (strArr != null && strArr.length > 0) {
                int i = 0;
                int iW = 0;
                int i2 = 0;
                while (true) {
                    String[] strArr2 = this.d;
                    if (i >= strArr2.length) {
                        break;
                    }
                    String str = strArr2[i];
                    if (str != null) {
                        i2++;
                        iW += CodedOutputByteBufferNano.w(str);
                    }
                    i++;
                }
                iB = iB + iW + i2;
            }
            int i3 = this.e;
            return i3 != 0 ? iB + CodedOutputByteBufferNano.y(3, i3) : iB;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m0(1, this.c);
            String[] strArr = this.d;
            if (strArr != null && strArr.length > 0) {
                int i = 0;
                while (true) {
                    String[] strArr2 = this.d;
                    if (i >= strArr2.length) {
                        break;
                    }
                    String str = strArr2[i];
                    if (str != null) {
                        codedOutputByteBufferNano.m0(2, str);
                    }
                    i++;
                }
            }
            int i2 = this.e;
            if (i2 != 0) {
                codedOutputByteBufferNano.p0(3, i2);
            }
            super.j(codedOutputByteBufferNano);
        }

        public a m() {
            this.c = "";
            this.d = bmr.f;
            this.e = 0;
            this.f1122b = null;
            this.f15887a = -1;
            return this;
        }

        @Override // defpackage.dsf
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public a e(o34 o34Var) throws IOException {
            while (true) {
                int iA = o34Var.A();
                if (iA == 0) {
                    return this;
                }
                if (iA == 10) {
                    this.c = o34Var.z();
                } else if (iA == 18) {
                    int iA2 = bmr.a(o34Var, 18);
                    String[] strArr = this.d;
                    int length = strArr == null ? 0 : strArr.length;
                    int i = iA2 + length;
                    String[] strArr2 = new String[i];
                    if (length != 0) {
                        System.arraycopy(strArr, 0, strArr2, 0, length);
                    }
                    while (length < i - 1) {
                        strArr2[length] = o34Var.z();
                        o34Var.A();
                        length++;
                    }
                    strArr2[length] = o34Var.z();
                    this.d = strArr2;
                } else if (iA == 24) {
                    this.e = o34Var.B();
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public z5r() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b();
        a.C1163a c1163a = this.c;
        if (c1163a != null) {
            iB += CodedOutputByteBufferNano.n(1, c1163a);
        }
        if (!this.d.equals("")) {
            iB += CodedOutputByteBufferNano.v(2, this.d);
        }
        int i = this.e;
        return i != 0 ? iB + CodedOutputByteBufferNano.y(3, i) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        a.C1163a c1163a = this.c;
        if (c1163a != null) {
            codedOutputByteBufferNano.Y(1, c1163a);
        }
        if (!this.d.equals("")) {
            codedOutputByteBufferNano.m0(2, this.d);
        }
        int i = this.e;
        if (i != 0) {
            codedOutputByteBufferNano.p0(3, i);
        }
        super.j(codedOutputByteBufferNano);
    }

    public z5r m() {
        this.c = null;
        this.d = "";
        this.e = 0;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public z5r e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 10) {
                if (this.c == null) {
                    this.c = new a.C1163a();
                }
                o34Var.q(this.c);
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
