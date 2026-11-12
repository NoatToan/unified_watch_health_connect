package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class wrg extends ak8<wrg> {
    public static volatile wrg[] p;
    public int c;
    public String d;
    public String e;
    public String f;
    public String g;
    public int h;
    public boolean i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f38284k;
    public int l;
    public b[] m;
    public String[] n;
    public byte[] o;

    public static final class a extends ak8<a> {
        public wrg[] c;
        public boolean d;

        public a() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            int iB = super.b();
            wrg[] wrgVarArr = this.c;
            if (wrgVarArr != null && wrgVarArr.length > 0) {
                int i = 0;
                while (true) {
                    wrg[] wrgVarArr2 = this.c;
                    if (i >= wrgVarArr2.length) {
                        break;
                    }
                    wrg wrgVar = wrgVarArr2[i];
                    if (wrgVar != null) {
                        iB += CodedOutputByteBufferNano.n(1, wrgVar);
                    }
                    i++;
                }
            }
            boolean z = this.d;
            return z ? iB + CodedOutputByteBufferNano.b(2, z) : iB;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            wrg[] wrgVarArr = this.c;
            if (wrgVarArr != null && wrgVarArr.length > 0) {
                int i = 0;
                while (true) {
                    wrg[] wrgVarArr2 = this.c;
                    if (i >= wrgVarArr2.length) {
                        break;
                    }
                    wrg wrgVar = wrgVarArr2[i];
                    if (wrgVar != null) {
                        codedOutputByteBufferNano.Y(1, wrgVar);
                    }
                    i++;
                }
            }
            boolean z = this.d;
            if (z) {
                codedOutputByteBufferNano.M(2, z);
            }
            super.j(codedOutputByteBufferNano);
        }

        public a m() {
            this.c = wrg.n();
            this.d = false;
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
                    wrg[] wrgVarArr = this.c;
                    int length = wrgVarArr == null ? 0 : wrgVarArr.length;
                    int i = iA2 + length;
                    wrg[] wrgVarArr2 = new wrg[i];
                    if (length != 0) {
                        System.arraycopy(wrgVarArr, 0, wrgVarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        wrg wrgVar = new wrg();
                        wrgVarArr2[length] = wrgVar;
                        o34Var.q(wrgVar);
                        o34Var.A();
                        length++;
                    }
                    wrg wrgVar2 = new wrg();
                    wrgVarArr2[length] = wrgVar2;
                    o34Var.q(wrgVar2);
                    this.c = wrgVarArr2;
                } else if (iA == 16) {
                    this.d = o34Var.k();
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public static final class b extends ak8<b> {
        public static volatile b[] j;
        public String c;
        public int d;
        public String e;
        public String[] f;
        public int g;
        public String[] h;
        public int i;

        public b() {
            m();
        }

        public static b[] n() {
            if (j == null) {
                synchronized (afd.c) {
                    try {
                        if (j == null) {
                            j = new b[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return j;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            int iB = super.b() + CodedOutputByteBufferNano.v(1, this.c) + CodedOutputByteBufferNano.y(2, this.d);
            if (!this.e.equals("")) {
                iB += CodedOutputByteBufferNano.v(3, this.e);
            }
            String[] strArr = this.f;
            int i = 0;
            if (strArr != null && strArr.length > 0) {
                int i2 = 0;
                int iW = 0;
                int i3 = 0;
                while (true) {
                    String[] strArr2 = this.f;
                    if (i2 >= strArr2.length) {
                        break;
                    }
                    String str = strArr2[i2];
                    if (str != null) {
                        i3++;
                        iW += CodedOutputByteBufferNano.w(str);
                    }
                    i2++;
                }
                iB = iB + iW + i3;
            }
            int i4 = this.g;
            if (i4 != 0) {
                iB += CodedOutputByteBufferNano.y(5, i4);
            }
            String[] strArr3 = this.h;
            if (strArr3 != null && strArr3.length > 0) {
                int iW2 = 0;
                int i5 = 0;
                while (true) {
                    String[] strArr4 = this.h;
                    if (i >= strArr4.length) {
                        break;
                    }
                    String str2 = strArr4[i];
                    if (str2 != null) {
                        i5++;
                        iW2 += CodedOutputByteBufferNano.w(str2);
                    }
                    i++;
                }
                iB = iB + iW2 + i5;
            }
            int i6 = this.i;
            return i6 != 0 ? iB + CodedOutputByteBufferNano.y(7, i6) : iB;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m0(1, this.c);
            codedOutputByteBufferNano.p0(2, this.d);
            if (!this.e.equals("")) {
                codedOutputByteBufferNano.m0(3, this.e);
            }
            String[] strArr = this.f;
            int i = 0;
            if (strArr != null && strArr.length > 0) {
                int i2 = 0;
                while (true) {
                    String[] strArr2 = this.f;
                    if (i2 >= strArr2.length) {
                        break;
                    }
                    String str = strArr2[i2];
                    if (str != null) {
                        codedOutputByteBufferNano.m0(4, str);
                    }
                    i2++;
                }
            }
            int i3 = this.g;
            if (i3 != 0) {
                codedOutputByteBufferNano.p0(5, i3);
            }
            String[] strArr3 = this.h;
            if (strArr3 != null && strArr3.length > 0) {
                while (true) {
                    String[] strArr4 = this.h;
                    if (i >= strArr4.length) {
                        break;
                    }
                    String str2 = strArr4[i];
                    if (str2 != null) {
                        codedOutputByteBufferNano.m0(6, str2);
                    }
                    i++;
                }
            }
            int i4 = this.i;
            if (i4 != 0) {
                codedOutputByteBufferNano.p0(7, i4);
            }
            super.j(codedOutputByteBufferNano);
        }

        public b m() {
            this.c = "";
            this.d = 0;
            this.e = "";
            String[] strArr = bmr.f;
            this.f = strArr;
            this.g = 0;
            this.h = strArr;
            this.i = 0;
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
                if (iA == 10) {
                    this.c = o34Var.z();
                } else if (iA == 16) {
                    this.d = o34Var.B();
                } else if (iA == 26) {
                    this.e = o34Var.z();
                } else if (iA == 34) {
                    int iA2 = bmr.a(o34Var, 34);
                    String[] strArr = this.f;
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
                    this.f = strArr2;
                } else if (iA == 40) {
                    this.g = o34Var.B();
                } else if (iA == 50) {
                    int iA3 = bmr.a(o34Var, 50);
                    String[] strArr3 = this.h;
                    int length2 = strArr3 == null ? 0 : strArr3.length;
                    int i2 = iA3 + length2;
                    String[] strArr4 = new String[i2];
                    if (length2 != 0) {
                        System.arraycopy(strArr3, 0, strArr4, 0, length2);
                    }
                    while (length2 < i2 - 1) {
                        strArr4[length2] = o34Var.z();
                        o34Var.A();
                        length2++;
                    }
                    strArr4[length2] = o34Var.z();
                    this.h = strArr4;
                } else if (iA == 56) {
                    this.i = o34Var.B();
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public wrg() {
        m();
    }

    public static wrg[] n() {
        if (p == null) {
            synchronized (afd.c) {
                try {
                    if (p == null) {
                        p = new wrg[0];
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return p;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b() + CodedOutputByteBufferNano.l(1, this.c) + CodedOutputByteBufferNano.v(2, this.d) + CodedOutputByteBufferNano.v(3, this.e);
        if (!this.f.equals("")) {
            iB += CodedOutputByteBufferNano.v(4, this.f);
        }
        if (!this.g.equals("")) {
            iB += CodedOutputByteBufferNano.v(5, this.g);
        }
        int i = this.h;
        if (i != 0) {
            iB += CodedOutputByteBufferNano.l(6, i);
        }
        boolean z = this.i;
        if (z) {
            iB += CodedOutputByteBufferNano.b(7, z);
        }
        int i2 = this.j;
        if (i2 != 0) {
            iB += CodedOutputByteBufferNano.y(8, i2);
        }
        int i3 = this.f38284k;
        if (i3 != 0) {
            iB += CodedOutputByteBufferNano.y(9, i3);
        }
        int i4 = this.l;
        if (i4 != 0) {
            iB += CodedOutputByteBufferNano.y(10, i4);
        }
        b[] bVarArr = this.m;
        int i5 = 0;
        if (bVarArr != null && bVarArr.length > 0) {
            int i6 = 0;
            while (true) {
                b[] bVarArr2 = this.m;
                if (i6 >= bVarArr2.length) {
                    break;
                }
                b bVar = bVarArr2[i6];
                if (bVar != null) {
                    iB += CodedOutputByteBufferNano.n(11, bVar);
                }
                i6++;
            }
        }
        String[] strArr = this.n;
        if (strArr != null && strArr.length > 0) {
            int iW = 0;
            int i7 = 0;
            while (true) {
                String[] strArr2 = this.n;
                if (i5 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i5];
                if (str != null) {
                    i7++;
                    iW += CodedOutputByteBufferNano.w(str);
                }
                i5++;
            }
            iB = iB + iW + i7;
        }
        return !Arrays.equals(this.o, bmr.h) ? iB + CodedOutputByteBufferNano.d(13, this.o) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.W(1, this.c);
        codedOutputByteBufferNano.m0(2, this.d);
        codedOutputByteBufferNano.m0(3, this.e);
        if (!this.f.equals("")) {
            codedOutputByteBufferNano.m0(4, this.f);
        }
        if (!this.g.equals("")) {
            codedOutputByteBufferNano.m0(5, this.g);
        }
        int i = this.h;
        if (i != 0) {
            codedOutputByteBufferNano.W(6, i);
        }
        boolean z = this.i;
        if (z) {
            codedOutputByteBufferNano.M(7, z);
        }
        int i2 = this.j;
        if (i2 != 0) {
            codedOutputByteBufferNano.p0(8, i2);
        }
        int i3 = this.f38284k;
        if (i3 != 0) {
            codedOutputByteBufferNano.p0(9, i3);
        }
        int i4 = this.l;
        if (i4 != 0) {
            codedOutputByteBufferNano.p0(10, i4);
        }
        b[] bVarArr = this.m;
        int i5 = 0;
        if (bVarArr != null && bVarArr.length > 0) {
            int i6 = 0;
            while (true) {
                b[] bVarArr2 = this.m;
                if (i6 >= bVarArr2.length) {
                    break;
                }
                b bVar = bVarArr2[i6];
                if (bVar != null) {
                    codedOutputByteBufferNano.Y(11, bVar);
                }
                i6++;
            }
        }
        String[] strArr = this.n;
        if (strArr != null && strArr.length > 0) {
            while (true) {
                String[] strArr2 = this.n;
                if (i5 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i5];
                if (str != null) {
                    codedOutputByteBufferNano.m0(12, str);
                }
                i5++;
            }
        }
        if (!Arrays.equals(this.o, bmr.h)) {
            codedOutputByteBufferNano.O(13, this.o);
        }
        super.j(codedOutputByteBufferNano);
    }

    public wrg m() {
        this.c = 0;
        this.d = "";
        this.e = "";
        this.f = "";
        this.g = "";
        this.h = 0;
        this.i = false;
        this.j = 0;
        this.f38284k = 0;
        this.l = 0;
        this.m = b.n();
        this.n = bmr.f;
        this.o = bmr.h;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public wrg e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            switch (iA) {
                case 0:
                    return this;
                case 8:
                    int iP = o34Var.p();
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
                            this.c = iP;
                            break;
                    }
                    break;
                case 18:
                    this.d = o34Var.z();
                    break;
                case 26:
                    this.e = o34Var.z();
                    break;
                case 34:
                    this.f = o34Var.z();
                    break;
                case 42:
                    this.g = o34Var.z();
                    break;
                case 48:
                    this.h = o34Var.p();
                    break;
                case 56:
                    this.i = o34Var.k();
                    break;
                case 64:
                    this.j = o34Var.B();
                    break;
                case 72:
                    this.f38284k = o34Var.B();
                    break;
                case 80:
                    this.l = o34Var.B();
                    break;
                case 90:
                    int iA2 = bmr.a(o34Var, 90);
                    b[] bVarArr = this.m;
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
                    this.m = bVarArr2;
                    break;
                case 98:
                    int iA3 = bmr.a(o34Var, 98);
                    String[] strArr = this.n;
                    int length2 = strArr == null ? 0 : strArr.length;
                    int i2 = iA3 + length2;
                    String[] strArr2 = new String[i2];
                    if (length2 != 0) {
                        System.arraycopy(strArr, 0, strArr2, 0, length2);
                    }
                    while (length2 < i2 - 1) {
                        strArr2[length2] = o34Var.z();
                        o34Var.A();
                        length2++;
                    }
                    strArr2[length2] = o34Var.z();
                    this.n = strArr2;
                    break;
                case 106:
                    this.o = o34Var.l();
                    break;
                default:
                    if (!l(o34Var, iA)) {
                        return this;
                    }
                    break;
                    break;
            }
        }
    }
}
