package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class fu9 extends ak8<fu9> {
    public int c;
    public v64 d;
    public int e;
    public int f;
    public int g;
    public byte[] h;
    public int i;
    public lu9[] j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public yt9 f18246k;
    public int l;
    public au9 m;

    public fu9() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b() + CodedOutputByteBufferNano.y(1, this.c);
        v64 v64Var = this.d;
        if (v64Var != null) {
            iB += CodedOutputByteBufferNano.n(2, v64Var);
        }
        int iL = iB + CodedOutputByteBufferNano.l(3, this.e) + CodedOutputByteBufferNano.l(4, this.g);
        if (!Arrays.equals(this.h, bmr.h)) {
            iL += CodedOutputByteBufferNano.d(5, this.h);
        }
        int i = this.i;
        if (i != 0) {
            iL += CodedOutputByteBufferNano.y(6, i);
        }
        lu9[] lu9VarArr = this.j;
        if (lu9VarArr != null && lu9VarArr.length > 0) {
            int i2 = 0;
            while (true) {
                lu9[] lu9VarArr2 = this.j;
                if (i2 >= lu9VarArr2.length) {
                    break;
                }
                lu9 lu9Var = lu9VarArr2[i2];
                if (lu9Var != null) {
                    iL += CodedOutputByteBufferNano.n(7, lu9Var);
                }
                i2++;
            }
        }
        yt9 yt9Var = this.f18246k;
        if (yt9Var != null) {
            iL += CodedOutputByteBufferNano.n(8, yt9Var);
        }
        int i3 = this.f;
        if (i3 != 0) {
            iL += CodedOutputByteBufferNano.l(9, i3);
        }
        int i4 = this.l;
        if (i4 != 0) {
            iL += CodedOutputByteBufferNano.l(10, i4);
        }
        au9 au9Var = this.m;
        return au9Var != null ? iL + CodedOutputByteBufferNano.n(11, au9Var) : iL;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.p0(1, this.c);
        v64 v64Var = this.d;
        if (v64Var != null) {
            codedOutputByteBufferNano.Y(2, v64Var);
        }
        codedOutputByteBufferNano.W(3, this.e);
        codedOutputByteBufferNano.W(4, this.g);
        if (!Arrays.equals(this.h, bmr.h)) {
            codedOutputByteBufferNano.O(5, this.h);
        }
        int i = this.i;
        if (i != 0) {
            codedOutputByteBufferNano.p0(6, i);
        }
        lu9[] lu9VarArr = this.j;
        if (lu9VarArr != null && lu9VarArr.length > 0) {
            int i2 = 0;
            while (true) {
                lu9[] lu9VarArr2 = this.j;
                if (i2 >= lu9VarArr2.length) {
                    break;
                }
                lu9 lu9Var = lu9VarArr2[i2];
                if (lu9Var != null) {
                    codedOutputByteBufferNano.Y(7, lu9Var);
                }
                i2++;
            }
        }
        yt9 yt9Var = this.f18246k;
        if (yt9Var != null) {
            codedOutputByteBufferNano.Y(8, yt9Var);
        }
        int i3 = this.f;
        if (i3 != 0) {
            codedOutputByteBufferNano.W(9, i3);
        }
        int i4 = this.l;
        if (i4 != 0) {
            codedOutputByteBufferNano.W(10, i4);
        }
        au9 au9Var = this.m;
        if (au9Var != null) {
            codedOutputByteBufferNano.Y(11, au9Var);
        }
        super.j(codedOutputByteBufferNano);
    }

    public fu9 m() {
        this.c = 0;
        this.d = null;
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.h = bmr.h;
        this.i = 0;
        this.j = lu9.n();
        this.f18246k = null;
        this.l = 0;
        this.m = null;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public fu9 e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            switch (iA) {
                case 0:
                    return this;
                case 8:
                    this.c = o34Var.B();
                    break;
                case 18:
                    if (this.d == null) {
                        this.d = new v64();
                    }
                    o34Var.q(this.d);
                    break;
                case 24:
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
                    break;
                case 32:
                    int iP2 = o34Var.p();
                    if (iP2 == 0 || iP2 == 1 || iP2 == 2 || iP2 == 3) {
                        this.g = iP2;
                    }
                    break;
                case 42:
                    this.h = o34Var.l();
                    break;
                case 48:
                    this.i = o34Var.B();
                    break;
                case 58:
                    int iA2 = bmr.a(o34Var, 58);
                    lu9[] lu9VarArr = this.j;
                    int length = lu9VarArr == null ? 0 : lu9VarArr.length;
                    int i = iA2 + length;
                    lu9[] lu9VarArr2 = new lu9[i];
                    if (length != 0) {
                        System.arraycopy(lu9VarArr, 0, lu9VarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        lu9 lu9Var = new lu9();
                        lu9VarArr2[length] = lu9Var;
                        o34Var.q(lu9Var);
                        o34Var.A();
                        length++;
                    }
                    lu9 lu9Var2 = new lu9();
                    lu9VarArr2[length] = lu9Var2;
                    o34Var.q(lu9Var2);
                    this.j = lu9VarArr2;
                    break;
                case 66:
                    if (this.f18246k == null) {
                        this.f18246k = new yt9();
                    }
                    o34Var.q(this.f18246k);
                    break;
                case 72:
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
                            this.f = iP3;
                            break;
                        default:
                            switch (iP3) {
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
                                    this.f = iP3;
                                    break;
                                default:
                                    switch (iP3) {
                                        case 200:
                                        case 201:
                                        case 202:
                                        case 203:
                                        case 204:
                                        case 205:
                                        case 206:
                                        case 207:
                                            this.f = iP3;
                                            break;
                                        default:
                                            switch (iP3) {
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
                                                    this.f = iP3;
                                                    break;
                                                default:
                                                    switch (iP3) {
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
                                                            this.f = iP3;
                                                            break;
                                                        default:
                                                            switch (iP3) {
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
                                                                    this.f = iP3;
                                                                    break;
                                                                default:
                                                                    switch (iP3) {
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
                                                                            this.f = iP3;
                                                                            break;
                                                                        default:
                                                                            switch (iP3) {
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
                                                                                    this.f = iP3;
                                                                                    break;
                                                                                default:
                                                                                    switch (iP3) {
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
                                                                                            this.f = iP3;
                                                                                            break;
                                                                                        default:
                                                                                            switch (iP3) {
                                                                                                case 900:
                                                                                                case 901:
                                                                                                case 902:
                                                                                                case 903:
                                                                                                case 904:
                                                                                                    break;
                                                                                                default:
                                                                                                    continue;
                                                                                            }
                                                                                            this.f = iP3;
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
                case 80:
                    int iP4 = o34Var.p();
                    if (iP4 == 0 || iP4 == 1 || iP4 == 2 || iP4 == 3) {
                        this.l = iP4;
                    }
                    break;
                case 90:
                    if (this.m == null) {
                        this.m = new au9();
                    }
                    o34Var.q(this.m);
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
