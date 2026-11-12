package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class y5r extends ak8<y5r> {
    public static volatile y5r[] w;
    public String c;
    public String d;
    public boolean e;
    public boolean f;
    public long g;
    public boolean h;
    public String i;
    public byte[] j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f39821k;
    public int l;
    public String m;
    public String[] n;
    public boolean o;
    public w5r.b p;
    public int[] q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public a6r[] f39822r;
    public String s;
    public int t;
    public boolean u;
    public z5r.a.C1163a v;

    public static final class a extends ak8<a> {
        public y5r[] c;

        public a() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            int iB = super.b();
            y5r[] y5rVarArr = this.c;
            if (y5rVarArr != null && y5rVarArr.length > 0) {
                int i = 0;
                while (true) {
                    y5r[] y5rVarArr2 = this.c;
                    if (i >= y5rVarArr2.length) {
                        break;
                    }
                    y5r y5rVar = y5rVarArr2[i];
                    if (y5rVar != null) {
                        iB += CodedOutputByteBufferNano.n(1, y5rVar);
                    }
                    i++;
                }
            }
            return iB;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            y5r[] y5rVarArr = this.c;
            if (y5rVarArr != null && y5rVarArr.length > 0) {
                int i = 0;
                while (true) {
                    y5r[] y5rVarArr2 = this.c;
                    if (i >= y5rVarArr2.length) {
                        break;
                    }
                    y5r y5rVar = y5rVarArr2[i];
                    if (y5rVar != null) {
                        codedOutputByteBufferNano.Y(1, y5rVar);
                    }
                    i++;
                }
            }
            super.j(codedOutputByteBufferNano);
        }

        public a m() {
            this.c = y5r.n();
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
                    y5r[] y5rVarArr = this.c;
                    int length = y5rVarArr == null ? 0 : y5rVarArr.length;
                    int i = iA2 + length;
                    y5r[] y5rVarArr2 = new y5r[i];
                    if (length != 0) {
                        System.arraycopy(y5rVarArr, 0, y5rVarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        y5r y5rVar = new y5r();
                        y5rVarArr2[length] = y5rVar;
                        o34Var.q(y5rVar);
                        o34Var.A();
                        length++;
                    }
                    y5r y5rVar2 = new y5r();
                    y5rVarArr2[length] = y5rVar2;
                    o34Var.q(y5rVar2);
                    this.c = y5rVarArr2;
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public y5r() {
        m();
    }

    public static y5r[] n() {
        if (w == null) {
            synchronized (afd.c) {
                try {
                    if (w == null) {
                        w = new y5r[0];
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return w;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int[] iArr;
        int iB = super.b() + CodedOutputByteBufferNano.v(1, this.c) + CodedOutputByteBufferNano.v(2, this.d) + CodedOutputByteBufferNano.b(3, this.e);
        boolean z = this.f;
        if (z) {
            iB += CodedOutputByteBufferNano.b(4, z);
        }
        long j = this.g;
        if (j != 0) {
            iB += CodedOutputByteBufferNano.A(5, j);
        }
        boolean z2 = this.h;
        if (z2) {
            iB += CodedOutputByteBufferNano.b(6, z2);
        }
        if (!this.i.equals("")) {
            iB += CodedOutputByteBufferNano.v(7, this.i);
        }
        if (!this.m.equals("")) {
            iB += CodedOutputByteBufferNano.v(8, this.m);
        }
        if (!this.s.equals("")) {
            iB += CodedOutputByteBufferNano.v(9, this.s);
        }
        int[] iArr2 = this.q;
        int i = 0;
        if (iArr2 != null && iArr2.length > 0) {
            int i2 = 0;
            int iM = 0;
            while (true) {
                iArr = this.q;
                if (i2 >= iArr.length) {
                    break;
                }
                iM += CodedOutputByteBufferNano.m(iArr[i2]);
                i2++;
            }
            iB = iB + iM + iArr.length;
        }
        int i3 = this.f39821k;
        if (i3 != 0) {
            iB += CodedOutputByteBufferNano.l(11, i3);
        }
        String[] strArr = this.n;
        if (strArr != null && strArr.length > 0) {
            int i4 = 0;
            int iW = 0;
            int i5 = 0;
            while (true) {
                String[] strArr2 = this.n;
                if (i4 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i4];
                if (str != null) {
                    i5++;
                    iW += CodedOutputByteBufferNano.w(str);
                }
                i4++;
            }
            iB = iB + iW + i5;
        }
        a6r[] a6rVarArr = this.f39822r;
        if (a6rVarArr != null && a6rVarArr.length > 0) {
            while (true) {
                a6r[] a6rVarArr2 = this.f39822r;
                if (i >= a6rVarArr2.length) {
                    break;
                }
                a6r a6rVar = a6rVarArr2[i];
                if (a6rVar != null) {
                    iB += CodedOutputByteBufferNano.n(13, a6rVar);
                }
                i++;
            }
        }
        if (!Arrays.equals(this.j, bmr.h)) {
            iB += CodedOutputByteBufferNano.d(14, this.j);
        }
        int i6 = this.t;
        if (i6 != 0) {
            iB += CodedOutputByteBufferNano.y(15, i6);
        }
        boolean z3 = this.o;
        if (z3) {
            iB += CodedOutputByteBufferNano.b(16, z3);
        }
        w5r.b bVar = this.p;
        if (bVar != null) {
            iB += CodedOutputByteBufferNano.n(17, bVar);
        }
        boolean z4 = this.u;
        if (z4) {
            iB += CodedOutputByteBufferNano.b(18, z4);
        }
        z5r.a.C1163a c1163a = this.v;
        if (c1163a != null) {
            iB += CodedOutputByteBufferNano.n(19, c1163a);
        }
        int i7 = this.l;
        return i7 != 1 ? iB + CodedOutputByteBufferNano.l(20, i7) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.m0(1, this.c);
        codedOutputByteBufferNano.m0(2, this.d);
        codedOutputByteBufferNano.M(3, this.e);
        boolean z = this.f;
        if (z) {
            codedOutputByteBufferNano.M(4, z);
        }
        long j = this.g;
        if (j != 0) {
            codedOutputByteBufferNano.r0(5, j);
        }
        boolean z2 = this.h;
        if (z2) {
            codedOutputByteBufferNano.M(6, z2);
        }
        if (!this.i.equals("")) {
            codedOutputByteBufferNano.m0(7, this.i);
        }
        if (!this.m.equals("")) {
            codedOutputByteBufferNano.m0(8, this.m);
        }
        if (!this.s.equals("")) {
            codedOutputByteBufferNano.m0(9, this.s);
        }
        int[] iArr = this.q;
        int i = 0;
        if (iArr != null && iArr.length > 0) {
            int i2 = 0;
            while (true) {
                int[] iArr2 = this.q;
                if (i2 >= iArr2.length) {
                    break;
                }
                codedOutputByteBufferNano.W(10, iArr2[i2]);
                i2++;
            }
        }
        int i3 = this.f39821k;
        if (i3 != 0) {
            codedOutputByteBufferNano.W(11, i3);
        }
        String[] strArr = this.n;
        if (strArr != null && strArr.length > 0) {
            int i4 = 0;
            while (true) {
                String[] strArr2 = this.n;
                if (i4 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i4];
                if (str != null) {
                    codedOutputByteBufferNano.m0(12, str);
                }
                i4++;
            }
        }
        a6r[] a6rVarArr = this.f39822r;
        if (a6rVarArr != null && a6rVarArr.length > 0) {
            while (true) {
                a6r[] a6rVarArr2 = this.f39822r;
                if (i >= a6rVarArr2.length) {
                    break;
                }
                a6r a6rVar = a6rVarArr2[i];
                if (a6rVar != null) {
                    codedOutputByteBufferNano.Y(13, a6rVar);
                }
                i++;
            }
        }
        if (!Arrays.equals(this.j, bmr.h)) {
            codedOutputByteBufferNano.O(14, this.j);
        }
        int i5 = this.t;
        if (i5 != 0) {
            codedOutputByteBufferNano.p0(15, i5);
        }
        boolean z3 = this.o;
        if (z3) {
            codedOutputByteBufferNano.M(16, z3);
        }
        w5r.b bVar = this.p;
        if (bVar != null) {
            codedOutputByteBufferNano.Y(17, bVar);
        }
        boolean z4 = this.u;
        if (z4) {
            codedOutputByteBufferNano.M(18, z4);
        }
        z5r.a.C1163a c1163a = this.v;
        if (c1163a != null) {
            codedOutputByteBufferNano.Y(19, c1163a);
        }
        int i6 = this.l;
        if (i6 != 1) {
            codedOutputByteBufferNano.W(20, i6);
        }
        super.j(codedOutputByteBufferNano);
    }

    public y5r m() {
        this.c = "";
        this.d = "";
        this.e = false;
        this.f = false;
        this.g = 0L;
        this.h = false;
        this.i = "";
        this.j = bmr.h;
        this.f39821k = 0;
        this.l = 1;
        this.m = "";
        this.n = bmr.f;
        this.o = false;
        this.p = null;
        this.q = bmr.f4377a;
        this.f39822r = a6r.n();
        this.s = "";
        this.t = 0;
        this.u = false;
        this.v = null;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public y5r e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            switch (iA) {
                case 0:
                    return this;
                case 10:
                    this.c = o34Var.z();
                    break;
                case 18:
                    this.d = o34Var.z();
                    break;
                case 24:
                    this.e = o34Var.k();
                    break;
                case 32:
                    this.f = o34Var.k();
                    break;
                case 40:
                    this.g = o34Var.C();
                    break;
                case 48:
                    this.h = o34Var.k();
                    break;
                case 58:
                    this.i = o34Var.z();
                    break;
                case 66:
                    this.m = o34Var.z();
                    break;
                case 74:
                    this.s = o34Var.z();
                    break;
                case 80:
                    int iA2 = bmr.a(o34Var, 80);
                    int[] iArr = new int[iA2];
                    int i = 0;
                    for (int i2 = 0; i2 < iA2; i2++) {
                        if (i2 != 0) {
                            o34Var.A();
                        }
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
                            case 9:
                            case 10:
                            case 11:
                            case 12:
                            case 13:
                            case 14:
                            case 15:
                            case 16:
                            case 17:
                            case 18:
                            case 19:
                            case 20:
                                iArr[i] = iP;
                                i++;
                                break;
                        }
                    }
                    if (i != 0) {
                        int[] iArr2 = this.q;
                        int length = iArr2 == null ? 0 : iArr2.length;
                        if (length == 0 && i == iA2) {
                            this.q = iArr;
                        } else {
                            int[] iArr3 = new int[length + i];
                            if (length != 0) {
                                System.arraycopy(iArr2, 0, iArr3, 0, length);
                            }
                            System.arraycopy(iArr, 0, iArr3, length, i);
                            this.q = iArr3;
                        }
                    }
                    break;
                case 82:
                    int iJ = o34Var.j(o34Var.v());
                    int iF = o34Var.f();
                    int i3 = 0;
                    while (o34Var.d() > 0) {
                        switch (o34Var.p()) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                            case 12:
                            case 13:
                            case 14:
                            case 15:
                            case 16:
                            case 17:
                            case 18:
                            case 19:
                            case 20:
                                i3++;
                                break;
                        }
                    }
                    if (i3 != 0) {
                        o34Var.E(iF);
                        int[] iArr4 = this.q;
                        int length2 = iArr4 == null ? 0 : iArr4.length;
                        int[] iArr5 = new int[i3 + length2];
                        if (length2 != 0) {
                            System.arraycopy(iArr4, 0, iArr5, 0, length2);
                        }
                        while (o34Var.d() > 0) {
                            int iP2 = o34Var.p();
                            switch (iP2) {
                                case 0:
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                case 8:
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                case 13:
                                case 14:
                                case 15:
                                case 16:
                                case 17:
                                case 18:
                                case 19:
                                case 20:
                                    iArr5[length2] = iP2;
                                    length2++;
                                    break;
                            }
                        }
                        this.q = iArr5;
                    }
                    o34Var.i(iJ);
                    break;
                case 88:
                    int iP3 = o34Var.p();
                    switch (iP3) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                            this.f39821k = iP3;
                            break;
                    }
                    break;
                case 98:
                    int iA3 = bmr.a(o34Var, 98);
                    String[] strArr = this.n;
                    int length3 = strArr == null ? 0 : strArr.length;
                    int i4 = iA3 + length3;
                    String[] strArr2 = new String[i4];
                    if (length3 != 0) {
                        System.arraycopy(strArr, 0, strArr2, 0, length3);
                    }
                    while (length3 < i4 - 1) {
                        strArr2[length3] = o34Var.z();
                        o34Var.A();
                        length3++;
                    }
                    strArr2[length3] = o34Var.z();
                    this.n = strArr2;
                    break;
                case 106:
                    int iA4 = bmr.a(o34Var, 106);
                    a6r[] a6rVarArr = this.f39822r;
                    int length4 = a6rVarArr == null ? 0 : a6rVarArr.length;
                    int i5 = iA4 + length4;
                    a6r[] a6rVarArr2 = new a6r[i5];
                    if (length4 != 0) {
                        System.arraycopy(a6rVarArr, 0, a6rVarArr2, 0, length4);
                    }
                    while (length4 < i5 - 1) {
                        a6r a6rVar = new a6r();
                        a6rVarArr2[length4] = a6rVar;
                        o34Var.q(a6rVar);
                        o34Var.A();
                        length4++;
                    }
                    a6r a6rVar2 = new a6r();
                    a6rVarArr2[length4] = a6rVar2;
                    o34Var.q(a6rVar2);
                    this.f39822r = a6rVarArr2;
                    break;
                case 114:
                    this.j = o34Var.l();
                    break;
                case 120:
                    this.t = o34Var.B();
                    break;
                case 128:
                    this.o = o34Var.k();
                    break;
                case 138:
                    if (this.p == null) {
                        this.p = new w5r.b();
                    }
                    o34Var.q(this.p);
                    break;
                case 144:
                    this.u = o34Var.k();
                    break;
                case 154:
                    if (this.v == null) {
                        this.v = new z5r.a.C1163a();
                    }
                    o34Var.q(this.v);
                    break;
                case 160:
                    int iP4 = o34Var.p();
                    if (iP4 == 1) {
                        this.l = iP4;
                    }
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
