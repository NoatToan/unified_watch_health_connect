package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class ive extends ak8<ive> {
    public int c = 0;
    public Object d;

    public ive() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b();
        if (this.c == 1) {
            iB += CodedOutputByteBufferNano.v(1, (String) this.d);
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
            iB += CodedOutputByteBufferNano.n(6, (dsf) this.d);
        }
        if (this.c == 7) {
            iB += CodedOutputByteBufferNano.n(7, (dsf) this.d);
        }
        if (this.c == 8) {
            iB += CodedOutputByteBufferNano.n(8, (dsf) this.d);
        }
        if (this.c == 9) {
            iB += CodedOutputByteBufferNano.n(9, (dsf) this.d);
        }
        return this.c == 10 ? iB + CodedOutputByteBufferNano.n(10, (dsf) this.d) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (this.c == 1) {
            codedOutputByteBufferNano.m0(1, (String) this.d);
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
            codedOutputByteBufferNano.Y(6, (dsf) this.d);
        }
        if (this.c == 7) {
            codedOutputByteBufferNano.Y(7, (dsf) this.d);
        }
        if (this.c == 8) {
            codedOutputByteBufferNano.Y(8, (dsf) this.d);
        }
        if (this.c == 9) {
            codedOutputByteBufferNano.Y(9, (dsf) this.d);
        }
        if (this.c == 10) {
            codedOutputByteBufferNano.Y(10, (dsf) this.d);
        }
        super.j(codedOutputByteBufferNano);
    }

    public ive m() {
        n();
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    public ive n() {
        this.c = 0;
        this.d = null;
        return this;
    }

    public eve o() {
        if (this.c == 8) {
            return (eve) this.d;
        }
        return null;
    }

    public fve p() {
        if (this.c == 2) {
            return (fve) this.d;
        }
        return null;
    }

    public gve q() {
        if (this.c == 9) {
            return (gve) this.d;
        }
        return null;
    }

    public jve r() {
        if (this.c == 5) {
            return (jve) this.d;
        }
        return null;
    }

    public kve.a s() {
        if (this.c == 3) {
            return (kve.a) this.d;
        }
        return null;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public ive e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            switch (iA) {
                case 0:
                    return this;
                case 10:
                    this.d = o34Var.z();
                    this.c = 1;
                    break;
                case 18:
                    if (this.c != 2) {
                        this.d = new fve();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 2;
                    break;
                case 26:
                    if (this.c != 3) {
                        this.d = new kve.a();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 3;
                    break;
                case 34:
                    if (this.c != 4) {
                        this.d = new mve();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 4;
                    break;
                case 42:
                    if (this.c != 5) {
                        this.d = new jve();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 5;
                    break;
                case 50:
                    if (this.c != 6) {
                        this.d = new nve();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 6;
                    break;
                case 58:
                    if (this.c != 7) {
                        this.d = new lve();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 7;
                    break;
                case 66:
                    if (this.c != 8) {
                        this.d = new eve();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 8;
                    break;
                case 74:
                    if (this.c != 9) {
                        this.d = new gve();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 9;
                    break;
                case 82:
                    if (this.c != 10) {
                        this.d = new hve();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 10;
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

    public ive u(hve hveVar) {
        hveVar.getClass();
        this.c = 10;
        this.d = hveVar;
        return this;
    }

    public ive v(lve lveVar) {
        lveVar.getClass();
        this.c = 7;
        this.d = lveVar;
        return this;
    }

    public ive w(mve mveVar) {
        mveVar.getClass();
        this.c = 4;
        this.d = mveVar;
        return this;
    }

    public ive x(nve nveVar) {
        nveVar.getClass();
        this.c = 6;
        this.d = nveVar;
        return this;
    }
}
