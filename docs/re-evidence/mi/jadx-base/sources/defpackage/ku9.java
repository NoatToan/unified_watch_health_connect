package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public final class ku9 extends ak8<ku9> {
    public int c;
    public int d;
    public int e;
    public w64 f;
    public int g;
    public boolean h;
    public boolean i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f24295k;
    public mu9[] l;
    public zt9 m;

    public ku9() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b() + CodedOutputByteBufferNano.l(1, this.c);
        int i = this.e;
        if (i != 0) {
            iB += CodedOutputByteBufferNano.y(2, i);
        }
        w64 w64Var = this.f;
        if (w64Var != null) {
            iB += CodedOutputByteBufferNano.n(3, w64Var);
        }
        int i2 = this.g;
        if (i2 != 0) {
            iB += CodedOutputByteBufferNano.y(4, i2);
        }
        boolean z = this.h;
        if (z) {
            iB += CodedOutputByteBufferNano.b(5, z);
        }
        boolean z2 = this.i;
        if (z2) {
            iB += CodedOutputByteBufferNano.b(6, z2);
        }
        int i3 = this.j;
        if (i3 != 0) {
            iB += CodedOutputByteBufferNano.y(7, i3);
        }
        boolean z3 = this.f24295k;
        if (z3) {
            iB += CodedOutputByteBufferNano.b(8, z3);
        }
        mu9[] mu9VarArr = this.l;
        if (mu9VarArr != null && mu9VarArr.length > 0) {
            int i4 = 0;
            while (true) {
                mu9[] mu9VarArr2 = this.l;
                if (i4 >= mu9VarArr2.length) {
                    break;
                }
                mu9 mu9Var = mu9VarArr2[i4];
                if (mu9Var != null) {
                    iB += CodedOutputByteBufferNano.n(9, mu9Var);
                }
                i4++;
            }
        }
        zt9 zt9Var = this.m;
        if (zt9Var != null) {
            iB += CodedOutputByteBufferNano.n(10, zt9Var);
        }
        int i5 = this.d;
        return i5 != 0 ? iB + CodedOutputByteBufferNano.l(11, i5) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.W(1, this.c);
        int i = this.e;
        if (i != 0) {
            codedOutputByteBufferNano.p0(2, i);
        }
        w64 w64Var = this.f;
        if (w64Var != null) {
            codedOutputByteBufferNano.Y(3, w64Var);
        }
        int i2 = this.g;
        if (i2 != 0) {
            codedOutputByteBufferNano.p0(4, i2);
        }
        boolean z = this.h;
        if (z) {
            codedOutputByteBufferNano.M(5, z);
        }
        boolean z2 = this.i;
        if (z2) {
            codedOutputByteBufferNano.M(6, z2);
        }
        int i3 = this.j;
        if (i3 != 0) {
            codedOutputByteBufferNano.p0(7, i3);
        }
        boolean z3 = this.f24295k;
        if (z3) {
            codedOutputByteBufferNano.M(8, z3);
        }
        mu9[] mu9VarArr = this.l;
        if (mu9VarArr != null && mu9VarArr.length > 0) {
            int i4 = 0;
            while (true) {
                mu9[] mu9VarArr2 = this.l;
                if (i4 >= mu9VarArr2.length) {
                    break;
                }
                mu9 mu9Var = mu9VarArr2[i4];
                if (mu9Var != null) {
                    codedOutputByteBufferNano.Y(9, mu9Var);
                }
                i4++;
            }
        }
        zt9 zt9Var = this.m;
        if (zt9Var != null) {
            codedOutputByteBufferNano.Y(10, zt9Var);
        }
        int i5 = this.d;
        if (i5 != 0) {
            codedOutputByteBufferNano.W(11, i5);
        }
        super.j(codedOutputByteBufferNano);
    }

    public ku9 m() {
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = null;
        this.g = 0;
        this.h = false;
        this.i = false;
        this.j = 0;
        this.f24295k = false;
        this.l = mu9.n();
        this.m = null;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public ku9 e(o34 o34Var) throws IOException {
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
                    this.e = o34Var.B();
                    break;
                case 26:
                    if (this.f == null) {
                        this.f = new w64();
                    }
                    o34Var.q(this.f);
                    break;
                case 32:
                    this.g = o34Var.B();
                    break;
                case 40:
                    this.h = o34Var.k();
                    break;
                case 48:
                    this.i = o34Var.k();
                    break;
                case 56:
                    this.j = o34Var.B();
                    break;
                case 64:
                    this.f24295k = o34Var.k();
                    break;
                case 74:
                    int iA2 = bmr.a(o34Var, 74);
                    mu9[] mu9VarArr = this.l;
                    int length = mu9VarArr == null ? 0 : mu9VarArr.length;
                    int i = iA2 + length;
                    mu9[] mu9VarArr2 = new mu9[i];
                    if (length != 0) {
                        System.arraycopy(mu9VarArr, 0, mu9VarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        mu9 mu9Var = new mu9();
                        mu9VarArr2[length] = mu9Var;
                        o34Var.q(mu9Var);
                        o34Var.A();
                        length++;
                    }
                    mu9 mu9Var2 = new mu9();
                    mu9VarArr2[length] = mu9Var2;
                    o34Var.q(mu9Var2);
                    this.l = mu9VarArr2;
                    break;
                case 82:
                    if (this.m == null) {
                        this.m = new zt9();
                    }
                    o34Var.q(this.m);
                    break;
                case 88:
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
