package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class csg extends ak8<csg> {
    public int c = 0;
    public Object d;

    public csg() {
        m();
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public csg e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            switch (iA) {
                case 0:
                    return this;
                case 10:
                    this.d = o34Var.l();
                    this.c = 1;
                    break;
                case 18:
                    if (this.c != 2) {
                        this.d = new bsg();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 2;
                    break;
                case 26:
                    if (this.c != 3) {
                        this.d = new vrg();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 3;
                    break;
                case 34:
                    if (this.c != 4) {
                        this.d = new wrg();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 4;
                    break;
                case 42:
                    if (this.c != 5) {
                        this.d = new wrg.a();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 5;
                    break;
                case 50:
                    this.d = o34Var.z();
                    this.c = 6;
                    break;
                case 58:
                    if (this.c != 7) {
                        this.d = new trg();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 7;
                    break;
                case 66:
                    this.d = o34Var.z();
                    this.c = 8;
                    break;
                case 74:
                    if (this.c != 9) {
                        this.d = new yrg.a();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 9;
                    break;
                case 80:
                    this.d = Integer.valueOf(o34Var.B());
                    this.c = 10;
                    break;
                case 90:
                    if (this.c != 11) {
                        this.d = new xrg.a();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 11;
                    break;
                case 98:
                    if (this.c != 12) {
                        this.d = new xrg();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 12;
                    break;
                case 106:
                    if (this.c != 13) {
                        this.d = new xrg.b();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 13;
                    break;
                case 114:
                    if (this.c != 14) {
                        this.d = new lsg();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 14;
                    break;
                case 122:
                    if (this.c != 15) {
                        this.d = new gsg();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 15;
                    break;
                case 130:
                    if (this.c != 16) {
                        this.d = new hsg();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 16;
                    break;
                case 138:
                    if (this.c != 17) {
                        this.d = new ksg.a();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 17;
                    break;
                case 146:
                    if (this.c != 18) {
                        this.d = new zrg();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 18;
                    break;
                case 154:
                    if (this.c != 19) {
                        this.d = new xrg.c();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 19;
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

    public csg B(String str) {
        this.c = 6;
        this.d = str;
        return this;
    }

    public csg C(trg trgVar) {
        trgVar.getClass();
        this.c = 7;
        this.d = trgVar;
        return this;
    }

    public csg D(wrg wrgVar) {
        wrgVar.getClass();
        this.c = 4;
        this.d = wrgVar;
        return this;
    }

    public csg E(wrg.a aVar) {
        aVar.getClass();
        this.c = 5;
        this.d = aVar;
        return this;
    }

    public csg F(xrg xrgVar) {
        xrgVar.getClass();
        this.c = 12;
        this.d = xrgVar;
        return this;
    }

    public csg G(xrg.c cVar) {
        cVar.getClass();
        this.c = 19;
        this.d = cVar;
        return this;
    }

    public csg H(byte[] bArr) {
        this.c = 1;
        this.d = bArr;
        return this;
    }

    public csg I(yrg.a aVar) {
        aVar.getClass();
        this.c = 9;
        this.d = aVar;
        return this;
    }

    public csg J(bsg bsgVar) {
        bsgVar.getClass();
        this.c = 2;
        this.d = bsgVar;
        return this;
    }

    public csg K(ksg.a aVar) {
        aVar.getClass();
        this.c = 17;
        this.d = aVar;
        return this;
    }

    public csg L(gsg gsgVar) {
        gsgVar.getClass();
        this.c = 15;
        this.d = gsgVar;
        return this;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b();
        if (this.c == 1) {
            iB += CodedOutputByteBufferNano.d(1, (byte[]) this.d);
        }
        if (this.c == 2) {
            iB += CodedOutputByteBufferNano.n(2, (dsf) this.d);
        }
        if (this.c == 3) {
            iB += CodedOutputByteBufferNano.n(3, (dsf) this.d);
        }
        if (this.c == 4) {
            iB += CodedOutputByteBufferNano.n(4, (dsf) this.d);
        }
        if (this.c == 5) {
            iB += CodedOutputByteBufferNano.n(5, (dsf) this.d);
        }
        if (this.c == 6) {
            iB += CodedOutputByteBufferNano.v(6, (String) this.d);
        }
        if (this.c == 7) {
            iB += CodedOutputByteBufferNano.n(7, (dsf) this.d);
        }
        if (this.c == 8) {
            iB += CodedOutputByteBufferNano.v(8, (String) this.d);
        }
        if (this.c == 9) {
            iB += CodedOutputByteBufferNano.n(9, (dsf) this.d);
        }
        if (this.c == 10) {
            iB += CodedOutputByteBufferNano.y(10, ((Integer) this.d).intValue());
        }
        if (this.c == 11) {
            iB += CodedOutputByteBufferNano.n(11, (dsf) this.d);
        }
        if (this.c == 12) {
            iB += CodedOutputByteBufferNano.n(12, (dsf) this.d);
        }
        if (this.c == 13) {
            iB += CodedOutputByteBufferNano.n(13, (dsf) this.d);
        }
        if (this.c == 14) {
            iB += CodedOutputByteBufferNano.n(14, (dsf) this.d);
        }
        if (this.c == 15) {
            iB += CodedOutputByteBufferNano.n(15, (dsf) this.d);
        }
        if (this.c == 16) {
            iB += CodedOutputByteBufferNano.n(16, (dsf) this.d);
        }
        if (this.c == 17) {
            iB += CodedOutputByteBufferNano.n(17, (dsf) this.d);
        }
        if (this.c == 18) {
            iB += CodedOutputByteBufferNano.n(18, (dsf) this.d);
        }
        return this.c == 19 ? iB + CodedOutputByteBufferNano.n(19, (dsf) this.d) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (this.c == 1) {
            codedOutputByteBufferNano.O(1, (byte[]) this.d);
        }
        if (this.c == 2) {
            codedOutputByteBufferNano.Y(2, (dsf) this.d);
        }
        if (this.c == 3) {
            codedOutputByteBufferNano.Y(3, (dsf) this.d);
        }
        if (this.c == 4) {
            codedOutputByteBufferNano.Y(4, (dsf) this.d);
        }
        if (this.c == 5) {
            codedOutputByteBufferNano.Y(5, (dsf) this.d);
        }
        if (this.c == 6) {
            codedOutputByteBufferNano.m0(6, (String) this.d);
        }
        if (this.c == 7) {
            codedOutputByteBufferNano.Y(7, (dsf) this.d);
        }
        if (this.c == 8) {
            codedOutputByteBufferNano.m0(8, (String) this.d);
        }
        if (this.c == 9) {
            codedOutputByteBufferNano.Y(9, (dsf) this.d);
        }
        if (this.c == 10) {
            codedOutputByteBufferNano.p0(10, ((Integer) this.d).intValue());
        }
        if (this.c == 11) {
            codedOutputByteBufferNano.Y(11, (dsf) this.d);
        }
        if (this.c == 12) {
            codedOutputByteBufferNano.Y(12, (dsf) this.d);
        }
        if (this.c == 13) {
            codedOutputByteBufferNano.Y(13, (dsf) this.d);
        }
        if (this.c == 14) {
            codedOutputByteBufferNano.Y(14, (dsf) this.d);
        }
        if (this.c == 15) {
            codedOutputByteBufferNano.Y(15, (dsf) this.d);
        }
        if (this.c == 16) {
            codedOutputByteBufferNano.Y(16, (dsf) this.d);
        }
        if (this.c == 17) {
            codedOutputByteBufferNano.Y(17, (dsf) this.d);
        }
        if (this.c == 18) {
            codedOutputByteBufferNano.Y(18, (dsf) this.d);
        }
        if (this.c == 19) {
            codedOutputByteBufferNano.Y(19, (dsf) this.d);
        }
        super.j(codedOutputByteBufferNano);
    }

    public csg m() {
        n();
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    public csg n() {
        this.c = 0;
        this.d = null;
        return this;
    }

    public String o() {
        return this.c == 6 ? (String) this.d : "";
    }

    public trg p() {
        if (this.c == 7) {
            return (trg) this.d;
        }
        return null;
    }

    public int q() {
        if (this.c == 10) {
            return ((Integer) this.d).intValue();
        }
        return 0;
    }

    public vrg r() {
        if (this.c == 3) {
            return (vrg) this.d;
        }
        return null;
    }

    public xrg.a s() {
        if (this.c == 11) {
            return (xrg.a) this.d;
        }
        return null;
    }

    public xrg.b t() {
        if (this.c == 13) {
            return (xrg.b) this.d;
        }
        return null;
    }

    public xrg.c u() {
        if (this.c == 19) {
            return (xrg.c) this.d;
        }
        return null;
    }

    public byte[] v() {
        return this.c == 1 ? (byte[]) this.d : bmr.h;
    }

    public yrg.a w() {
        if (this.c == 9) {
            return (yrg.a) this.d;
        }
        return null;
    }

    public zrg x() {
        if (this.c == 18) {
            return (zrg) this.d;
        }
        return null;
    }

    public hsg y() {
        if (this.c == 16) {
            return (hsg) this.d;
        }
        return null;
    }

    public lsg z() {
        if (this.c == 14) {
            return (lsg) this.d;
        }
        return null;
    }
}
