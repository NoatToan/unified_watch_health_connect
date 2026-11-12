package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class j21 extends ak8<j21> {
    public int c;
    public int d;

    public j21() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        return super.b() + CodedOutputByteBufferNano.l(1, this.c) + CodedOutputByteBufferNano.l(2, this.d);
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.W(1, this.c);
        codedOutputByteBufferNano.W(2, this.d);
        super.j(codedOutputByteBufferNano);
    }

    public j21 m() {
        this.c = 0;
        this.d = 0;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public j21 e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 8) {
                int iP = o34Var.p();
                if (iP == 0 || iP == 1 || iP == 2 || iP == 3) {
                    this.c = iP;
                }
            } else if (iA == 16) {
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
                        this.d = iP2;
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
                                this.d = iP2;
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
                                        this.d = iP2;
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
                                                this.d = iP2;
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
                                                        this.d = iP2;
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
                                                                this.d = iP2;
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
                                                                        this.d = iP2;
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
                                                                                this.d = iP2;
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
                                                                                        this.d = iP2;
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
                                                                                        this.d = iP2;
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
