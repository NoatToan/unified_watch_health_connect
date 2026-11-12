package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class qxg extends ak8<qxg> {
    public int c = 0;
    public Object d;

    public qxg() {
        m();
    }

    public qxg A(boolean z) {
        this.c = 7;
        this.d = Boolean.valueOf(z);
        return this;
    }

    public qxg B(sxg.a aVar) {
        aVar.getClass();
        this.c = 4;
        this.d = aVar;
        return this;
    }

    public qxg C(vxg vxgVar) {
        vxgVar.getClass();
        this.c = 9;
        this.d = vxgVar;
        return this;
    }

    public qxg D(vxg.a aVar) {
        aVar.getClass();
        this.c = 10;
        this.d = aVar;
        return this;
    }

    public qxg E(int i) {
        this.c = 11;
        this.d = Integer.valueOf(i);
        return this;
    }

    public qxg F(int i) {
        this.c = 8;
        this.d = Integer.valueOf(i);
        return this;
    }

    public qxg G(int i) {
        this.c = 13;
        this.d = Integer.valueOf(i);
        return this;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b();
        if (this.c == 1) {
            iB += CodedOutputByteBufferNano.n(1, (dsf) this.d);
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
            iB += CodedOutputByteBufferNano.b(7, ((Boolean) this.d).booleanValue());
        }
        if (this.c == 8) {
            iB += CodedOutputByteBufferNano.h(8, ((Integer) this.d).intValue());
        }
        if (this.c == 9) {
            iB += CodedOutputByteBufferNano.n(9, (dsf) this.d);
        }
        if (this.c == 10) {
            iB += CodedOutputByteBufferNano.n(10, (dsf) this.d);
        }
        if (this.c == 11) {
            iB += CodedOutputByteBufferNano.h(11, ((Integer) this.d).intValue());
        }
        if (this.c == 12) {
            iB += CodedOutputByteBufferNano.n(12, (dsf) this.d);
        }
        if (this.c == 13) {
            iB += CodedOutputByteBufferNano.h(13, ((Integer) this.d).intValue());
        }
        if (this.c == 14) {
            iB += CodedOutputByteBufferNano.n(14, (dsf) this.d);
        }
        if (this.c == 15) {
            iB += CodedOutputByteBufferNano.n(15, (dsf) this.d);
        }
        return this.c == 16 ? iB + CodedOutputByteBufferNano.n(16, (dsf) this.d) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (this.c == 1) {
            codedOutputByteBufferNano.Y(1, (dsf) this.d);
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
            codedOutputByteBufferNano.M(7, ((Boolean) this.d).booleanValue());
        }
        if (this.c == 8) {
            codedOutputByteBufferNano.S(8, ((Integer) this.d).intValue());
        }
        if (this.c == 9) {
            codedOutputByteBufferNano.Y(9, (dsf) this.d);
        }
        if (this.c == 10) {
            codedOutputByteBufferNano.Y(10, (dsf) this.d);
        }
        if (this.c == 11) {
            codedOutputByteBufferNano.S(11, ((Integer) this.d).intValue());
        }
        if (this.c == 12) {
            codedOutputByteBufferNano.Y(12, (dsf) this.d);
        }
        if (this.c == 13) {
            codedOutputByteBufferNano.S(13, ((Integer) this.d).intValue());
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
        super.j(codedOutputByteBufferNano);
    }

    public qxg m() {
        n();
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    public qxg n() {
        this.c = 0;
        this.d = null;
        return this;
    }

    public oxg o() {
        if (this.c == 16) {
            return (oxg) this.d;
        }
        return null;
    }

    public uxg p() {
        if (this.c == 15) {
            return (uxg) this.d;
        }
        return null;
    }

    public boolean q() {
        if (this.c == 7) {
            return ((Boolean) this.d).booleanValue();
        }
        return false;
    }

    public sxg r() {
        if (this.c == 2) {
            return (sxg) this.d;
        }
        return null;
    }

    public sxg.a s() {
        if (this.c == 4) {
            return (sxg.a) this.d;
        }
        return null;
    }

    public vxg t() {
        if (this.c == 9) {
            return (vxg) this.d;
        }
        return null;
    }

    public int u() {
        if (this.c == 11) {
            return ((Integer) this.d).intValue();
        }
        return 0;
    }

    public wxg v() {
        if (this.c == 12) {
            return (wxg) this.d;
        }
        return null;
    }

    public int w() {
        if (this.c == 13) {
            return ((Integer) this.d).intValue();
        }
        return 0;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public qxg e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            switch (iA) {
                case 0:
                    return this;
                case 10:
                    if (this.c != 1) {
                        this.d = new rxg();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 1;
                    break;
                case 18:
                    if (this.c != 2) {
                        this.d = new sxg();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 2;
                    break;
                case 26:
                    if (this.c != 3) {
                        this.d = new rxg.d();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 3;
                    break;
                case 34:
                    if (this.c != 4) {
                        this.d = new sxg.a();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 4;
                    break;
                case 42:
                    if (this.c != 5) {
                        this.d = new pxg();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 5;
                    break;
                case 50:
                    if (this.c != 6) {
                        this.d = new pxg.a();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 6;
                    break;
                case 56:
                    this.d = Boolean.valueOf(o34Var.k());
                    this.c = 7;
                    break;
                case 64:
                    this.d = Integer.valueOf(o34Var.n());
                    this.c = 8;
                    break;
                case 74:
                    if (this.c != 9) {
                        this.d = new vxg();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 9;
                    break;
                case 82:
                    if (this.c != 10) {
                        this.d = new vxg.a();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 10;
                    break;
                case 88:
                    this.d = Integer.valueOf(o34Var.n());
                    this.c = 11;
                    break;
                case 98:
                    if (this.c != 12) {
                        this.d = new wxg();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 12;
                    break;
                case 104:
                    this.d = Integer.valueOf(o34Var.n());
                    this.c = 13;
                    break;
                case 114:
                    if (this.c != 14) {
                        this.d = new txg();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 14;
                    break;
                case 122:
                    if (this.c != 15) {
                        this.d = new uxg();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 15;
                    break;
                case 130:
                    if (this.c != 16) {
                        this.d = new oxg();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 16;
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

    public qxg y(txg txgVar) {
        txgVar.getClass();
        this.c = 14;
        this.d = txgVar;
        return this;
    }

    public qxg z(rxg.d dVar) {
        dVar.getClass();
        this.c = 3;
        this.d = dVar;
        return this;
    }
}
