package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class ded extends ak8<ded> {
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f15440k;
    public int l;
    public int m;
    public c n;
    public boolean o;
    public int p;
    public a.C0911a q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f15441r;
    public d s;
    public b t;

    public static final class a extends ak8<a> {
        public static volatile a[] f;
        public int c;
        public int d;
        public int e;

        /* JADX INFO: renamed from: ded$a$a, reason: collision with other inner class name */
        public static final class C0911a extends ak8<C0911a> {
            public a[] c;

            public C0911a() {
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

            public C0911a m() {
                this.c = a.n();
                this.f1122b = null;
                this.f15887a = -1;
                return this;
            }

            @Override // defpackage.dsf
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public C0911a e(o34 o34Var) throws IOException {
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
            return super.b() + CodedOutputByteBufferNano.y(1, this.c) + CodedOutputByteBufferNano.y(2, this.d) + CodedOutputByteBufferNano.y(3, this.e);
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.p0(1, this.c);
            codedOutputByteBufferNano.p0(2, this.d);
            codedOutputByteBufferNano.p0(3, this.e);
            super.j(codedOutputByteBufferNano);
        }

        public a m() {
            this.c = 0;
            this.d = 0;
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
                if (iA == 8) {
                    this.c = o34Var.B();
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

    public static final class b extends ak8<b> {
        public float c;
        public float d;
        public float e;
        public int f;

        public b() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            int iB = super.b() + CodedOutputByteBufferNano.j(1, this.c) + CodedOutputByteBufferNano.j(2, this.d) + CodedOutputByteBufferNano.j(3, this.e);
            int i = this.f;
            return i != 0 ? iB + CodedOutputByteBufferNano.y(4, i) : iB;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.U(1, this.c);
            codedOutputByteBufferNano.U(2, this.d);
            codedOutputByteBufferNano.U(3, this.e);
            int i = this.f;
            if (i != 0) {
                codedOutputByteBufferNano.p0(4, i);
            }
            super.j(codedOutputByteBufferNano);
        }

        public b m() {
            this.c = 0.0f;
            this.d = 0.0f;
            this.e = 0.0f;
            this.f = 0;
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
                if (iA == 13) {
                    this.c = o34Var.o();
                } else if (iA == 21) {
                    this.d = o34Var.o();
                } else if (iA == 29) {
                    this.e = o34Var.o();
                } else if (iA == 32) {
                    this.f = o34Var.B();
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public static final class c extends ak8<c> {
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public int h;
        public int i;

        public c() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            int iB = super.b() + CodedOutputByteBufferNano.y(1, this.c) + CodedOutputByteBufferNano.y(2, this.d) + CodedOutputByteBufferNano.y(3, this.e);
            int i = this.f;
            if (i != 0) {
                iB += CodedOutputByteBufferNano.y(4, i);
            }
            int i2 = this.h;
            if (i2 != 0) {
                iB += CodedOutputByteBufferNano.y(5, i2);
            }
            int i3 = this.i;
            if (i3 != 0) {
                iB += CodedOutputByteBufferNano.y(6, i3);
            }
            int i4 = this.g;
            return i4 != 0 ? iB + CodedOutputByteBufferNano.y(7, i4) : iB;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.p0(1, this.c);
            codedOutputByteBufferNano.p0(2, this.d);
            codedOutputByteBufferNano.p0(3, this.e);
            int i = this.f;
            if (i != 0) {
                codedOutputByteBufferNano.p0(4, i);
            }
            int i2 = this.h;
            if (i2 != 0) {
                codedOutputByteBufferNano.p0(5, i2);
            }
            int i3 = this.i;
            if (i3 != 0) {
                codedOutputByteBufferNano.p0(6, i3);
            }
            int i4 = this.g;
            if (i4 != 0) {
                codedOutputByteBufferNano.p0(7, i4);
            }
            super.j(codedOutputByteBufferNano);
        }

        public c m() {
            this.c = 0;
            this.d = 0;
            this.e = 0;
            this.f = 0;
            this.g = 0;
            this.h = 0;
            this.i = 0;
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
                } else if (iA == 16) {
                    this.d = o34Var.B();
                } else if (iA == 24) {
                    this.e = o34Var.B();
                } else if (iA == 32) {
                    this.f = o34Var.B();
                } else if (iA == 40) {
                    this.h = o34Var.B();
                } else if (iA == 48) {
                    this.i = o34Var.B();
                } else if (iA == 56) {
                    this.g = o34Var.B();
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public static final class d extends ak8<d> {
        public double c;
        public double d;

        public d() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            return super.b() + CodedOutputByteBufferNano.f(1, this.c) + CodedOutputByteBufferNano.f(2, this.d);
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.Q(1, this.c);
            codedOutputByteBufferNano.Q(2, this.d);
            super.j(codedOutputByteBufferNano);
        }

        public d m() {
            this.c = 0.0d;
            this.d = 0.0d;
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
                if (iA == 9) {
                    this.c = o34Var.m();
                } else if (iA == 17) {
                    this.d = o34Var.m();
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public ded() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b() + CodedOutputByteBufferNano.l(1, this.c) + CodedOutputByteBufferNano.y(2, this.d) + CodedOutputByteBufferNano.y(3, this.e) + CodedOutputByteBufferNano.y(4, this.f) + CodedOutputByteBufferNano.y(5, this.g);
        int i = this.h;
        if (i != 0) {
            iB += CodedOutputByteBufferNano.y(6, i);
        }
        int i2 = this.i;
        if (i2 != 0) {
            iB += CodedOutputByteBufferNano.y(7, i2);
        }
        int i3 = this.j;
        if (i3 != 0) {
            iB += CodedOutputByteBufferNano.y(8, i3);
        }
        if (Float.floatToIntBits(this.f15440k) != Float.floatToIntBits(0.0f)) {
            iB += CodedOutputByteBufferNano.j(9, this.f15440k);
        }
        int i4 = this.l;
        if (i4 != 0) {
            iB += CodedOutputByteBufferNano.y(10, i4);
        }
        int i5 = this.m;
        if (i5 != 0) {
            iB += CodedOutputByteBufferNano.y(11, i5);
        }
        c cVar = this.n;
        if (cVar != null) {
            iB += CodedOutputByteBufferNano.n(12, cVar);
        }
        boolean z = this.o;
        if (z) {
            iB += CodedOutputByteBufferNano.b(13, z);
        }
        int i6 = this.p;
        if (i6 != 0) {
            iB += CodedOutputByteBufferNano.l(14, i6);
        }
        a.C0911a c0911a = this.q;
        if (c0911a != null) {
            iB += CodedOutputByteBufferNano.n(15, c0911a);
        }
        int i7 = this.f15441r;
        if (i7 != 0) {
            iB += CodedOutputByteBufferNano.l(16, i7);
        }
        d dVar = this.s;
        if (dVar != null) {
            iB += CodedOutputByteBufferNano.n(17, dVar);
        }
        b bVar = this.t;
        return bVar != null ? iB + CodedOutputByteBufferNano.n(18, bVar) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.W(1, this.c);
        codedOutputByteBufferNano.p0(2, this.d);
        codedOutputByteBufferNano.p0(3, this.e);
        codedOutputByteBufferNano.p0(4, this.f);
        codedOutputByteBufferNano.p0(5, this.g);
        int i = this.h;
        if (i != 0) {
            codedOutputByteBufferNano.p0(6, i);
        }
        int i2 = this.i;
        if (i2 != 0) {
            codedOutputByteBufferNano.p0(7, i2);
        }
        int i3 = this.j;
        if (i3 != 0) {
            codedOutputByteBufferNano.p0(8, i3);
        }
        if (Float.floatToIntBits(this.f15440k) != Float.floatToIntBits(0.0f)) {
            codedOutputByteBufferNano.U(9, this.f15440k);
        }
        int i4 = this.l;
        if (i4 != 0) {
            codedOutputByteBufferNano.p0(10, i4);
        }
        int i5 = this.m;
        if (i5 != 0) {
            codedOutputByteBufferNano.p0(11, i5);
        }
        c cVar = this.n;
        if (cVar != null) {
            codedOutputByteBufferNano.Y(12, cVar);
        }
        boolean z = this.o;
        if (z) {
            codedOutputByteBufferNano.M(13, z);
        }
        int i6 = this.p;
        if (i6 != 0) {
            codedOutputByteBufferNano.W(14, i6);
        }
        a.C0911a c0911a = this.q;
        if (c0911a != null) {
            codedOutputByteBufferNano.Y(15, c0911a);
        }
        int i7 = this.f15441r;
        if (i7 != 0) {
            codedOutputByteBufferNano.W(16, i7);
        }
        d dVar = this.s;
        if (dVar != null) {
            codedOutputByteBufferNano.Y(17, dVar);
        }
        b bVar = this.t;
        if (bVar != null) {
            codedOutputByteBufferNano.Y(18, bVar);
        }
        super.j(codedOutputByteBufferNano);
    }

    public ded m() {
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.h = 0;
        this.i = 0;
        this.j = 0;
        this.f15440k = 0.0f;
        this.l = 0;
        this.m = 0;
        this.n = null;
        this.o = false;
        this.p = 0;
        this.q = null;
        this.f15441r = 0;
        this.s = null;
        this.t = null;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public ded e(o34 o34Var) throws IOException {
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
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            this.c = iP;
                            break;
                        default:
                            switch (iP) {
                                case 100:
                                case 101:
                                case 102:
                                case 103:
                                case 104:
                                case 105:
                                case 106:
                                case 107:
                                case 108:
                                case 109:
                                case 110:
                                case 111:
                                case 112:
                                case 113:
                                case 114:
                                case 115:
                                case 116:
                                case 117:
                                case 118:
                                    this.c = iP;
                                    break;
                                default:
                                    switch (iP) {
                                        case 200:
                                        case 201:
                                        case 202:
                                        case 203:
                                        case 204:
                                        case 205:
                                        case 206:
                                        case 207:
                                            this.c = iP;
                                            break;
                                        default:
                                            switch (iP) {
                                                case 300:
                                                case 301:
                                                case 302:
                                                case 303:
                                                case 304:
                                                case 305:
                                                case 306:
                                                case 307:
                                                case 308:
                                                case 309:
                                                case 310:
                                                case 311:
                                                case 312:
                                                case 313:
                                                case 314:
                                                case 315:
                                                case 316:
                                                case 317:
                                                case 318:
                                                case 319:
                                                case 320:
                                                case 321:
                                                case 322:
                                                case 323:
                                                case 324:
                                                case 325:
                                                case 326:
                                                case 327:
                                                case 328:
                                                case 329:
                                                case 330:
                                                case 331:
                                                case 332:
                                                case 333:
                                                case 334:
                                                case 1000:
                                                case 1001:
                                                case 10000:
                                                case 10001:
                                                case 10002:
                                                    this.c = iP;
                                                    break;
                                                default:
                                                    switch (iP) {
                                                        case 399:
                                                        case 400:
                                                        case 401:
                                                        case 402:
                                                        case 403:
                                                        case 404:
                                                        case 405:
                                                        case 406:
                                                        case 407:
                                                        case 408:
                                                        case 409:
                                                        case 410:
                                                        case 411:
                                                        case 412:
                                                            this.c = iP;
                                                            break;
                                                        default:
                                                            switch (iP) {
                                                                case 499:
                                                                case 500:
                                                                case 501:
                                                                case 502:
                                                                case 503:
                                                                case 504:
                                                                case 505:
                                                                case 506:
                                                                case 507:
                                                                case 508:
                                                                case 509:
                                                                case 510:
                                                                case 511:
                                                                    this.c = iP;
                                                                    break;
                                                                default:
                                                                    switch (iP) {
                                                                        case 600:
                                                                        case 601:
                                                                        case 602:
                                                                        case 603:
                                                                        case 604:
                                                                        case 605:
                                                                        case 606:
                                                                        case 607:
                                                                        case 608:
                                                                        case 609:
                                                                        case 610:
                                                                        case 611:
                                                                        case 612:
                                                                        case 613:
                                                                        case 614:
                                                                        case 615:
                                                                        case 616:
                                                                        case 617:
                                                                        case 618:
                                                                        case 619:
                                                                        case 620:
                                                                        case 621:
                                                                        case 622:
                                                                        case 623:
                                                                        case 624:
                                                                        case 625:
                                                                        case 626:
                                                                        case 627:
                                                                            this.c = iP;
                                                                            break;
                                                                        default:
                                                                            switch (iP) {
                                                                                case 700:
                                                                                case 701:
                                                                                case 702:
                                                                                case 703:
                                                                                case 704:
                                                                                case 705:
                                                                                case 706:
                                                                                case 707:
                                                                                case 708:
                                                                                case 709:
                                                                                case 710:
                                                                                    this.c = iP;
                                                                                    break;
                                                                                default:
                                                                                    switch (iP) {
                                                                                        case 800:
                                                                                        case 801:
                                                                                        case 802:
                                                                                        case 803:
                                                                                        case 804:
                                                                                        case 805:
                                                                                        case 806:
                                                                                        case 807:
                                                                                        case 808:
                                                                                        case 809:
                                                                                        case 810:
                                                                                        case 811:
                                                                                        case 812:
                                                                                            this.c = iP;
                                                                                            break;
                                                                                        default:
                                                                                            switch (iP) {
                                                                                                case 900:
                                                                                                case 901:
                                                                                                case 902:
                                                                                                case 903:
                                                                                                case 904:
                                                                                                    break;
                                                                                                default:
                                                                                                    continue;
                                                                                            }
                                                                                            this.c = iP;
                                                                                            break;
                                                                                    }
                                                                                    break;
                                                                            }
                                                                            break;
                                                                    }
                                                                    break;
                                                            }
                                                            break;
                                                    }
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
                case 16:
                    this.d = o34Var.B();
                    break;
                case 24:
                    this.e = o34Var.B();
                    break;
                case 32:
                    this.f = o34Var.B();
                    break;
                case 40:
                    this.g = o34Var.B();
                    break;
                case 48:
                    this.h = o34Var.B();
                    break;
                case 56:
                    this.i = o34Var.B();
                    break;
                case 64:
                    this.j = o34Var.B();
                    break;
                case 77:
                    this.f15440k = o34Var.o();
                    break;
                case 80:
                    this.l = o34Var.B();
                    break;
                case 88:
                    this.m = o34Var.B();
                    break;
                case 98:
                    if (this.n == null) {
                        this.n = new c();
                    }
                    o34Var.q(this.n);
                    break;
                case 104:
                    this.o = o34Var.k();
                    break;
                case 112:
                    int iP2 = o34Var.p();
                    if (iP2 == 0 || iP2 == 1 || iP2 == 2 || iP2 == 3 || iP2 == 4 || iP2 == 5) {
                        this.p = iP2;
                    }
                    break;
                case 122:
                    if (this.q == null) {
                        this.q = new a.C0911a();
                    }
                    o34Var.q(this.q);
                    break;
                case 128:
                    int iP3 = o34Var.p();
                    if (iP3 == 0 || iP3 == 1 || iP3 == 2 || iP3 == 3) {
                        this.f15441r = iP3;
                    }
                    break;
                case 138:
                    if (this.s == null) {
                        this.s = new d();
                    }
                    o34Var.q(this.s);
                    break;
                case 146:
                    if (this.t == null) {
                        this.t = new b();
                    }
                    o34Var.q(this.t);
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
