package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class su9 extends ak8<su9> {
    public static volatile su9[] i;
    public int c = 0;
    public Object d;
    public int e;
    public v64 f;
    public int g;
    public int h;

    public static final class a extends ak8<a> {
        public su9[] c;

        public a() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            int iB = super.b();
            su9[] su9VarArr = this.c;
            if (su9VarArr != null && su9VarArr.length > 0) {
                int i = 0;
                while (true) {
                    su9[] su9VarArr2 = this.c;
                    if (i >= su9VarArr2.length) {
                        break;
                    }
                    su9 su9Var = su9VarArr2[i];
                    if (su9Var != null) {
                        iB += CodedOutputByteBufferNano.n(1, su9Var);
                    }
                    i++;
                }
            }
            return iB;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            su9[] su9VarArr = this.c;
            if (su9VarArr != null && su9VarArr.length > 0) {
                int i = 0;
                while (true) {
                    su9[] su9VarArr2 = this.c;
                    if (i >= su9VarArr2.length) {
                        break;
                    }
                    su9 su9Var = su9VarArr2[i];
                    if (su9Var != null) {
                        codedOutputByteBufferNano.Y(1, su9Var);
                    }
                    i++;
                }
            }
            super.j(codedOutputByteBufferNano);
        }

        public a m() {
            this.c = su9.o();
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
                    su9[] su9VarArr = this.c;
                    int length = su9VarArr == null ? 0 : su9VarArr.length;
                    int i = iA2 + length;
                    su9[] su9VarArr2 = new su9[i];
                    if (length != 0) {
                        System.arraycopy(su9VarArr, 0, su9VarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        su9 su9Var = new su9();
                        su9VarArr2[length] = su9Var;
                        o34Var.q(su9Var);
                        o34Var.A();
                        length++;
                    }
                    su9 su9Var2 = new su9();
                    su9VarArr2[length] = su9Var2;
                    o34Var.q(su9Var2);
                    this.c = su9VarArr2;
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public su9() {
        m();
    }

    public static su9[] o() {
        if (i == null) {
            synchronized (afd.c) {
                try {
                    if (i == null) {
                        i = new su9[0];
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
        int iB = super.b() + CodedOutputByteBufferNano.l(1, this.e);
        v64 v64Var = this.f;
        if (v64Var != null) {
            iB += CodedOutputByteBufferNano.n(2, v64Var);
        }
        int iY = iB + CodedOutputByteBufferNano.y(3, this.g) + CodedOutputByteBufferNano.y(4, this.h);
        if (this.c == 5) {
            iY += CodedOutputByteBufferNano.y(5, ((Integer) this.d).intValue());
        }
        return this.c == 6 ? iY + CodedOutputByteBufferNano.y(6, ((Integer) this.d).intValue()) : iY;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.W(1, this.e);
        v64 v64Var = this.f;
        if (v64Var != null) {
            codedOutputByteBufferNano.Y(2, v64Var);
        }
        codedOutputByteBufferNano.p0(3, this.g);
        codedOutputByteBufferNano.p0(4, this.h);
        if (this.c == 5) {
            codedOutputByteBufferNano.p0(5, ((Integer) this.d).intValue());
        }
        if (this.c == 6) {
            codedOutputByteBufferNano.p0(6, ((Integer) this.d).intValue());
        }
        super.j(codedOutputByteBufferNano);
    }

    public su9 m() {
        this.e = 0;
        this.f = null;
        this.g = 0;
        this.h = 0;
        n();
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    public su9 n() {
        this.c = 0;
        this.d = null;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public su9 e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 8) {
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
                        this.e = iP;
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
                                this.e = iP;
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
                                        this.e = iP;
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
                                                this.e = iP;
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
                                                        this.e = iP;
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
                                                                this.e = iP;
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
                                                                        this.e = iP;
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
                                                                                this.e = iP;
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
                                                                                        this.e = iP;
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
                                                                                        this.e = iP;
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
            } else if (iA == 18) {
                if (this.f == null) {
                    this.f = new v64();
                }
                o34Var.q(this.f);
            } else if (iA == 24) {
                this.g = o34Var.B();
            } else if (iA == 32) {
                this.h = o34Var.B();
            } else if (iA == 40) {
                this.d = Integer.valueOf(o34Var.B());
                this.c = 5;
            } else if (iA == 48) {
                this.d = Integer.valueOf(o34Var.B());
                this.c = 6;
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
