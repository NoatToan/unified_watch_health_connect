package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class rxo extends ak8<rxo> {
    public static volatile rxo[] e;
    public int c;
    public boolean d;

    public static final class a extends ak8<a> {
        public rxo[] c;
        public int d;

        public a() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            int iB = super.b();
            rxo[] rxoVarArr = this.c;
            if (rxoVarArr != null && rxoVarArr.length > 0) {
                int i = 0;
                while (true) {
                    rxo[] rxoVarArr2 = this.c;
                    if (i >= rxoVarArr2.length) {
                        break;
                    }
                    rxo rxoVar = rxoVarArr2[i];
                    if (rxoVar != null) {
                        iB += CodedOutputByteBufferNano.n(1, rxoVar);
                    }
                    i++;
                }
            }
            int i2 = this.d;
            return i2 != 0 ? iB + CodedOutputByteBufferNano.l(2, i2) : iB;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            rxo[] rxoVarArr = this.c;
            if (rxoVarArr != null && rxoVarArr.length > 0) {
                int i = 0;
                while (true) {
                    rxo[] rxoVarArr2 = this.c;
                    if (i >= rxoVarArr2.length) {
                        break;
                    }
                    rxo rxoVar = rxoVarArr2[i];
                    if (rxoVar != null) {
                        codedOutputByteBufferNano.Y(1, rxoVar);
                    }
                    i++;
                }
            }
            int i2 = this.d;
            if (i2 != 0) {
                codedOutputByteBufferNano.W(2, i2);
            }
            super.j(codedOutputByteBufferNano);
        }

        public a m() {
            this.c = rxo.n();
            this.d = 0;
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
                    rxo[] rxoVarArr = this.c;
                    int length = rxoVarArr == null ? 0 : rxoVarArr.length;
                    int i = iA2 + length;
                    rxo[] rxoVarArr2 = new rxo[i];
                    if (length != 0) {
                        System.arraycopy(rxoVarArr, 0, rxoVarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        rxo rxoVar = new rxo();
                        rxoVarArr2[length] = rxoVar;
                        o34Var.q(rxoVar);
                        o34Var.A();
                        length++;
                    }
                    rxo rxoVar2 = new rxo();
                    rxoVarArr2[length] = rxoVar2;
                    o34Var.q(rxoVar2);
                    this.c = rxoVarArr2;
                } else if (iA == 16) {
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
                            this.d = iP;
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
                                    this.d = iP;
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
                                            this.d = iP;
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
                                                    this.d = iP;
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
                                                            this.d = iP;
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
                                                                    this.d = iP;
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
                                                                            this.d = iP;
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
                                                                                    this.d = iP;
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
                                                                                            this.d = iP;
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
                                                                                            this.d = iP;
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
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public rxo() {
        m();
    }

    public static rxo[] n() {
        if (e == null) {
            synchronized (afd.c) {
                try {
                    if (e == null) {
                        e = new rxo[0];
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

    public rxo m() {
        this.c = 0;
        this.d = false;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public rxo e(o34 o34Var) throws IOException {
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
            } else if (iA == 16) {
                this.d = o34Var.k();
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
