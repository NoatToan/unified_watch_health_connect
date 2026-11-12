package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class dg4 extends ak8<dg4> {
    public int c = 0;
    public Object d;

    public dg4() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b();
        if (this.c == 1) {
            iB += CodedOutputByteBufferNano.n(1, (dsf) this.d);
        }
        if (this.c == 2) {
            iB += CodedOutputByteBufferNano.v(2, (String) this.d);
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
            codedOutputByteBufferNano.Y(1, (dsf) this.d);
        }
        if (this.c == 2) {
            codedOutputByteBufferNano.m0(2, (String) this.d);
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

    public dg4 m() {
        n();
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    public dg4 n() {
        this.c = 0;
        this.d = null;
        return this;
    }

    public eg4.a o() {
        if (this.c == 4) {
            return (eg4.a) this.d;
        }
        return null;
    }

    public fg4 p() {
        if (this.c == 1) {
            return (fg4) this.d;
        }
        return null;
    }

    public gg4 q() {
        if (this.c == 7) {
            return (gg4) this.d;
        }
        return null;
    }

    public String r() {
        return this.c == 2 ? (String) this.d : "";
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public dg4 e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            switch (iA) {
                case 0:
                    return this;
                case 10:
                    if (this.c != 1) {
                        this.d = new fg4();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 1;
                    break;
                case 18:
                    this.d = o34Var.z();
                    this.c = 2;
                    break;
                case 26:
                    if (this.c != 3) {
                        this.d = new eg4();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 3;
                    break;
                case 34:
                    if (this.c != 4) {
                        this.d = new eg4.a();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 4;
                    break;
                case 42:
                    if (this.c != 5) {
                        this.d = new hg4();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 5;
                    break;
                case 50:
                    if (this.c != 6) {
                        this.d = new ig4();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 6;
                    break;
                case 58:
                    if (this.c != 7) {
                        this.d = new gg4();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 7;
                    break;
                case 66:
                    if (this.c != 8) {
                        this.d = new jg4.a();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 8;
                    break;
                case 74:
                    if (this.c != 9) {
                        this.d = new jg4.c();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 9;
                    break;
                case 82:
                    if (this.c != 10) {
                        this.d = new jg4.d();
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

    public dg4 t(eg4 eg4Var) {
        eg4Var.getClass();
        this.c = 3;
        this.d = eg4Var;
        return this;
    }

    public dg4 u(eg4.a aVar) {
        aVar.getClass();
        this.c = 4;
        this.d = aVar;
        return this;
    }

    public dg4 v(fg4 fg4Var) {
        fg4Var.getClass();
        this.c = 1;
        this.d = fg4Var;
        return this;
    }

    public dg4 w(ig4 ig4Var) {
        ig4Var.getClass();
        this.c = 6;
        this.d = ig4Var;
        return this;
    }
}
