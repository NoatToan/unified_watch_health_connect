package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportSummary;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class q90 extends ak8<q90> {
    public int c = 0;
    public Object d;

    public q90() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b();
        if (this.c == 1) {
            iB += CodedOutputByteBufferNano.b(1, ((Boolean) this.d).booleanValue());
        }
        if (this.c == 2) {
            iB += CodedOutputByteBufferNano.v(2, (String) this.d);
        }
        if (this.c == 3) {
            iB += CodedOutputByteBufferNano.h(3, ((Integer) this.d).intValue());
        }
        if (this.c == 4) {
            iB += CodedOutputByteBufferNano.n(4, (dsf) this.d);
        }
        if (this.c == 5) {
            iB += CodedOutputByteBufferNano.n(5, (dsf) this.d);
        }
        if (this.c == 6) {
            iB += CodedOutputByteBufferNano.b(6, ((Boolean) this.d).booleanValue());
        }
        if (this.c == 7) {
            iB += CodedOutputByteBufferNano.v(7, (String) this.d);
        }
        if (this.c == 8) {
            iB += CodedOutputByteBufferNano.b(8, ((Boolean) this.d).booleanValue());
        }
        if (this.c == 9) {
            iB += CodedOutputByteBufferNano.n(9, (dsf) this.d);
        }
        if (this.c == 10) {
            iB += CodedOutputByteBufferNano.n(10, (dsf) this.d);
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
        if (this.c == 19) {
            iB += CodedOutputByteBufferNano.n(19, (dsf) this.d);
        }
        if (this.c == 20) {
            iB += CodedOutputByteBufferNano.n(20, (dsf) this.d);
        }
        if (this.c == 29) {
            iB += CodedOutputByteBufferNano.n(29, (dsf) this.d);
        }
        if (this.c == 30) {
            iB += CodedOutputByteBufferNano.n(30, (dsf) this.d);
        }
        if (this.c == 31) {
            iB += CodedOutputByteBufferNano.n(31, (dsf) this.d);
        }
        if (this.c == 32) {
            iB += CodedOutputByteBufferNano.n(32, (dsf) this.d);
        }
        return this.c == 33 ? iB + CodedOutputByteBufferNano.n(33, (dsf) this.d) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (this.c == 1) {
            codedOutputByteBufferNano.M(1, ((Boolean) this.d).booleanValue());
        }
        if (this.c == 2) {
            codedOutputByteBufferNano.m0(2, (String) this.d);
        }
        if (this.c == 3) {
            codedOutputByteBufferNano.S(3, ((Integer) this.d).intValue());
        }
        if (this.c == 4) {
            codedOutputByteBufferNano.Y(4, (dsf) this.d);
        }
        if (this.c == 5) {
            codedOutputByteBufferNano.Y(5, (dsf) this.d);
        }
        if (this.c == 6) {
            codedOutputByteBufferNano.M(6, ((Boolean) this.d).booleanValue());
        }
        if (this.c == 7) {
            codedOutputByteBufferNano.m0(7, (String) this.d);
        }
        if (this.c == 8) {
            codedOutputByteBufferNano.M(8, ((Boolean) this.d).booleanValue());
        }
        if (this.c == 9) {
            codedOutputByteBufferNano.Y(9, (dsf) this.d);
        }
        if (this.c == 10) {
            codedOutputByteBufferNano.Y(10, (dsf) this.d);
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
        if (this.c == 20) {
            codedOutputByteBufferNano.Y(20, (dsf) this.d);
        }
        if (this.c == 29) {
            codedOutputByteBufferNano.Y(29, (dsf) this.d);
        }
        if (this.c == 30) {
            codedOutputByteBufferNano.Y(30, (dsf) this.d);
        }
        if (this.c == 31) {
            codedOutputByteBufferNano.Y(31, (dsf) this.d);
        }
        if (this.c == 32) {
            codedOutputByteBufferNano.Y(32, (dsf) this.d);
        }
        if (this.c == 33) {
            codedOutputByteBufferNano.Y(33, (dsf) this.d);
        }
        super.j(codedOutputByteBufferNano);
    }

    public q90 m() {
        n();
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    public q90 n() {
        this.c = 0;
        this.d = null;
        return this;
    }

    public z90 o() {
        if (this.c == 33) {
            return (z90) this.d;
        }
        return null;
    }

    public ca0 p() {
        if (this.c == 31) {
            return (ca0) this.d;
        }
        return null;
    }

    public int q() {
        if (this.c == 3) {
            return ((Integer) this.d).intValue();
        }
        return 0;
    }

    public boolean r() {
        if (this.c == 8) {
            return ((Boolean) this.d).booleanValue();
        }
        return false;
    }

    public boolean s() {
        return this.c == 33;
    }

    public boolean t() {
        return this.c == 31;
    }

    public boolean u() {
        return this.c == 3;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public q90 e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            switch (iA) {
                case 0:
                    return this;
                case 8:
                    this.d = Boolean.valueOf(o34Var.k());
                    this.c = 1;
                    break;
                case 18:
                    this.d = o34Var.z();
                    this.c = 2;
                    break;
                case 24:
                    this.d = Integer.valueOf(o34Var.n());
                    this.c = 3;
                    break;
                case 34:
                    if (this.c != 4) {
                        this.d = new fa0();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 4;
                    break;
                case 42:
                    if (this.c != 5) {
                        this.d = new nb0();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 5;
                    break;
                case 48:
                    this.d = Boolean.valueOf(o34Var.k());
                    this.c = 6;
                    break;
                case 58:
                    this.d = o34Var.z();
                    this.c = 7;
                    break;
                case 64:
                    this.d = Boolean.valueOf(o34Var.k());
                    this.c = 8;
                    break;
                case 74:
                    if (this.c != 9) {
                        this.d = new wb0();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 9;
                    break;
                case 82:
                    if (this.c != 10) {
                        this.d = new zb0();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 10;
                    break;
                case 90:
                    if (this.c != 11) {
                        this.d = new tb0();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 11;
                    break;
                case 98:
                    if (this.c != 12) {
                        this.d = new ia0();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 12;
                    break;
                case 106:
                    if (this.c != 13) {
                        this.d = new kb0();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 13;
                    break;
                case 114:
                    if (this.c != 14) {
                        this.d = new fb0();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 14;
                    break;
                case 122:
                    if (this.c != 15) {
                        this.d = new za0();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 15;
                    break;
                case 130:
                    if (this.c != 16) {
                        this.d = new cb0();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 16;
                    break;
                case 138:
                    if (this.c != 17) {
                        this.d = new oa0();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 17;
                    break;
                case 146:
                    if (this.c != 18) {
                        this.d = new ua0();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 18;
                    break;
                case 154:
                    if (this.c != 19) {
                        this.d = new la0();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 19;
                    break;
                case 162:
                    if (this.c != 20) {
                        this.d = new ra0();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 20;
                    break;
                case 234:
                    if (this.c != 29) {
                        this.d = new qb0();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 29;
                    break;
                case 242:
                    if (this.c != 30) {
                        this.d = new w90();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 30;
                    break;
                case 250:
                    if (this.c != 31) {
                        this.d = new ca0();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 31;
                    break;
                case SportSummary.VERSION_102 /* 258 */:
                    if (this.c != 32) {
                        this.d = new t90();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 32;
                    break;
                case 266:
                    if (this.c != 33) {
                        this.d = new z90();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 33;
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

    public q90 w(t90 t90Var) {
        t90Var.getClass();
        this.c = 32;
        this.d = t90Var;
        return this;
    }

    public q90 x(w90 w90Var) {
        w90Var.getClass();
        this.c = 30;
        this.d = w90Var;
        return this;
    }

    public q90 y(String str) {
        this.c = 7;
        this.d = str;
        return this;
    }
}
