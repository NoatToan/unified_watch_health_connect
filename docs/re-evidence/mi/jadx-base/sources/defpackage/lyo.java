package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class lyo extends ak8<lyo> {
    public a[] c;
    public int d;
    public int e;

    public static final class a extends ak8<a> {
        public static volatile a[] e;
        public int c;
        public String d;

        public a() {
            m();
        }

        public static a[] n() {
            if (e == null) {
                synchronized (afd.c) {
                    try {
                        if (e == null) {
                            e = new a[0];
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
            int iB = super.b() + CodedOutputByteBufferNano.y(1, this.c);
            return !this.d.equals("") ? iB + CodedOutputByteBufferNano.v(2, this.d) : iB;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.p0(1, this.c);
            if (!this.d.equals("")) {
                codedOutputByteBufferNano.m0(2, this.d);
            }
            super.j(codedOutputByteBufferNano);
        }

        public a m() {
            this.c = 0;
            this.d = "";
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
                if (iA == 8) {
                    this.c = o34Var.B();
                } else if (iA == 18) {
                    this.d = o34Var.z();
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public static final class b extends ak8<b> {
        public static volatile b[] f;
        public int c;
        public String d;
        public a[] e;

        public b() {
            m();
        }

        public static b[] n() {
            if (f == null) {
                synchronized (afd.c) {
                    try {
                        if (f == null) {
                            f = new b[0];
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
            int iB = super.b() + CodedOutputByteBufferNano.y(1, this.c);
            if (!this.d.equals("")) {
                iB += CodedOutputByteBufferNano.v(2, this.d);
            }
            a[] aVarArr = this.e;
            if (aVarArr != null && aVarArr.length > 0) {
                int i = 0;
                while (true) {
                    a[] aVarArr2 = this.e;
                    if (i >= aVarArr2.length) {
                        break;
                    }
                    a aVar = aVarArr2[i];
                    if (aVar != null) {
                        iB += CodedOutputByteBufferNano.n(3, aVar);
                    }
                    i++;
                }
            }
            return iB;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.p0(1, this.c);
            if (!this.d.equals("")) {
                codedOutputByteBufferNano.m0(2, this.d);
            }
            a[] aVarArr = this.e;
            if (aVarArr != null && aVarArr.length > 0) {
                int i = 0;
                while (true) {
                    a[] aVarArr2 = this.e;
                    if (i >= aVarArr2.length) {
                        break;
                    }
                    a aVar = aVarArr2[i];
                    if (aVar != null) {
                        codedOutputByteBufferNano.Y(3, aVar);
                    }
                    i++;
                }
            }
            super.j(codedOutputByteBufferNano);
        }

        public b m() {
            this.c = 0;
            this.d = "";
            this.e = a.n();
            this.f1122b = null;
            this.f15887a = -1;
            return this;
        }

        @Override // defpackage.dsf
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public b e(o34 o34Var) throws IOException {
            while (true) {
                int iA = o34Var.A();
                if (iA == 0) {
                    return this;
                }
                if (iA == 8) {
                    this.c = o34Var.B();
                } else if (iA == 18) {
                    this.d = o34Var.z();
                } else if (iA == 26) {
                    int iA2 = bmr.a(o34Var, 26);
                    a[] aVarArr = this.e;
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
                    this.e = aVarArr2;
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public static final class c extends ak8<c> {
        public b[] c;

        public c() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            int iB = super.b();
            b[] bVarArr = this.c;
            if (bVarArr != null && bVarArr.length > 0) {
                int i = 0;
                while (true) {
                    b[] bVarArr2 = this.c;
                    if (i >= bVarArr2.length) {
                        break;
                    }
                    b bVar = bVarArr2[i];
                    if (bVar != null) {
                        iB += CodedOutputByteBufferNano.n(1, bVar);
                    }
                    i++;
                }
            }
            return iB;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            b[] bVarArr = this.c;
            if (bVarArr != null && bVarArr.length > 0) {
                int i = 0;
                while (true) {
                    b[] bVarArr2 = this.c;
                    if (i >= bVarArr2.length) {
                        break;
                    }
                    b bVar = bVarArr2[i];
                    if (bVar != null) {
                        codedOutputByteBufferNano.Y(1, bVar);
                    }
                    i++;
                }
            }
            super.j(codedOutputByteBufferNano);
        }

        public c m() {
            this.c = b.n();
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
                if (iA == 10) {
                    int iA2 = bmr.a(o34Var, 10);
                    b[] bVarArr = this.c;
                    int length = bVarArr == null ? 0 : bVarArr.length;
                    int i = iA2 + length;
                    b[] bVarArr2 = new b[i];
                    if (length != 0) {
                        System.arraycopy(bVarArr, 0, bVarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        b bVar = new b();
                        bVarArr2[length] = bVar;
                        o34Var.q(bVar);
                        o34Var.A();
                        length++;
                    }
                    b bVar2 = new b();
                    bVarArr2[length] = bVar2;
                    o34Var.q(bVar2);
                    this.c = bVarArr2;
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public lyo() {
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
        int i2 = this.d;
        if (i2 != 0) {
            iB += CodedOutputByteBufferNano.y(2, i2);
        }
        int i3 = this.e;
        return i3 != 0 ? iB + CodedOutputByteBufferNano.y(3, i3) : iB;
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
        int i2 = this.d;
        if (i2 != 0) {
            codedOutputByteBufferNano.p0(2, i2);
        }
        int i3 = this.e;
        if (i3 != 0) {
            codedOutputByteBufferNano.p0(3, i3);
        }
        super.j(codedOutputByteBufferNano);
    }

    public lyo m() {
        this.c = a.n();
        this.d = 0;
        this.e = 0;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public lyo e(o34 o34Var) throws IOException {
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
            } else if (iA == 16) {
                this.d = o34Var.B();
            } else if (iA == 24) {
                this.e = o34Var.B();
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
