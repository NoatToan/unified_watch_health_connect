package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class kyo extends ak8<kyo> {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static volatile kyo[] f24428k;
    public int c;
    public int d;
    public int e;
    public String f;
    public int g;
    public String h;
    public String i;
    public int j;

    public static final class a extends ak8<a> {
        public kyo[] c;

        public a() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            int iB = super.b();
            kyo[] kyoVarArr = this.c;
            if (kyoVarArr != null && kyoVarArr.length > 0) {
                int i = 0;
                while (true) {
                    kyo[] kyoVarArr2 = this.c;
                    if (i >= kyoVarArr2.length) {
                        break;
                    }
                    kyo kyoVar = kyoVarArr2[i];
                    if (kyoVar != null) {
                        iB += CodedOutputByteBufferNano.n(1, kyoVar);
                    }
                    i++;
                }
            }
            return iB;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            kyo[] kyoVarArr = this.c;
            if (kyoVarArr != null && kyoVarArr.length > 0) {
                int i = 0;
                while (true) {
                    kyo[] kyoVarArr2 = this.c;
                    if (i >= kyoVarArr2.length) {
                        break;
                    }
                    kyo kyoVar = kyoVarArr2[i];
                    if (kyoVar != null) {
                        codedOutputByteBufferNano.Y(1, kyoVar);
                    }
                    i++;
                }
            }
            super.j(codedOutputByteBufferNano);
        }

        public a m() {
            this.c = kyo.n();
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
                    kyo[] kyoVarArr = this.c;
                    int length = kyoVarArr == null ? 0 : kyoVarArr.length;
                    int i = iA2 + length;
                    kyo[] kyoVarArr2 = new kyo[i];
                    if (length != 0) {
                        System.arraycopy(kyoVarArr, 0, kyoVarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        kyo kyoVar = new kyo();
                        kyoVarArr2[length] = kyoVar;
                        o34Var.q(kyoVar);
                        o34Var.A();
                        length++;
                    }
                    kyo kyoVar2 = new kyo();
                    kyoVarArr2[length] = kyoVar2;
                    o34Var.q(kyoVar2);
                    this.c = kyoVarArr2;
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public kyo() {
        m();
    }

    public static kyo[] n() {
        if (f24428k == null) {
            synchronized (afd.c) {
                try {
                    if (f24428k == null) {
                        f24428k = new kyo[0];
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f24428k;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b() + CodedOutputByteBufferNano.l(1, this.c) + CodedOutputByteBufferNano.y(2, this.d) + CodedOutputByteBufferNano.y(3, this.e);
        if (!this.f.equals("")) {
            iB += CodedOutputByteBufferNano.v(4, this.f);
        }
        int i = this.g;
        if (i != 0) {
            iB += CodedOutputByteBufferNano.l(5, i);
        }
        if (!this.h.equals("")) {
            iB += CodedOutputByteBufferNano.v(6, this.h);
        }
        if (!this.i.equals("")) {
            iB += CodedOutputByteBufferNano.v(7, this.i);
        }
        int i2 = this.j;
        return i2 != 0 ? iB + CodedOutputByteBufferNano.y(8, i2) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.W(1, this.c);
        codedOutputByteBufferNano.p0(2, this.d);
        codedOutputByteBufferNano.p0(3, this.e);
        if (!this.f.equals("")) {
            codedOutputByteBufferNano.m0(4, this.f);
        }
        int i = this.g;
        if (i != 0) {
            codedOutputByteBufferNano.W(5, i);
        }
        if (!this.h.equals("")) {
            codedOutputByteBufferNano.m0(6, this.h);
        }
        if (!this.i.equals("")) {
            codedOutputByteBufferNano.m0(7, this.i);
        }
        int i2 = this.j;
        if (i2 != 0) {
            codedOutputByteBufferNano.p0(8, i2);
        }
        super.j(codedOutputByteBufferNano);
    }

    public kyo m() {
        this.c = 1;
        this.d = 0;
        this.e = 0;
        this.f = "";
        this.g = 0;
        this.h = "";
        this.i = "";
        this.j = 0;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public kyo e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 8) {
                int iP = o34Var.p();
                switch (iP) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 8:
                    case 9:
                    case 10:
                        this.c = iP;
                        break;
                }
            } else if (iA == 16) {
                this.d = o34Var.B();
            } else if (iA == 24) {
                this.e = o34Var.B();
            } else if (iA == 34) {
                this.f = o34Var.z();
            } else if (iA == 40) {
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
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                        this.g = iP2;
                        break;
                    default:
                        switch (iP2) {
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
                                this.g = iP2;
                                break;
                            default:
                                switch (iP2) {
                                    case 200:
                                    case 201:
                                    case 202:
                                    case 203:
                                    case 204:
                                    case 205:
                                    case 206:
                                    case 207:
                                        this.g = iP2;
                                        break;
                                    default:
                                        switch (iP2) {
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
                                                this.g = iP2;
                                                break;
                                            default:
                                                switch (iP2) {
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
                                                        this.g = iP2;
                                                        break;
                                                    default:
                                                        switch (iP2) {
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
                                                                this.g = iP2;
                                                                break;
                                                            default:
                                                                switch (iP2) {
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
                                                                        this.g = iP2;
                                                                        break;
                                                                    default:
                                                                        switch (iP2) {
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
                                                                                this.g = iP2;
                                                                                break;
                                                                            default:
                                                                                switch (iP2) {
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
                                                                                        this.g = iP2;
                                                                                        break;
                                                                                    default:
                                                                                        switch (iP2) {
                                                                                            case 900:
                                                                                            case 901:
                                                                                            case 902:
                                                                                            case 903:
                                                                                            case 904:
                                                                                                break;
                                                                                            default:
                                                                                                continue;
                                                                                        }
                                                                                        this.g = iP2;
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
            } else if (iA == 50) {
                this.h = o34Var.z();
            } else if (iA == 58) {
                this.i = o34Var.z();
            } else if (iA == 64) {
                this.j = o34Var.B();
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
