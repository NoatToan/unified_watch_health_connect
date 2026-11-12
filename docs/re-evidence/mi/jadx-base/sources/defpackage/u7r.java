package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public final class u7r extends ak8<u7r> {
    public int c = 0;
    public Object d;
    public int e;
    public int f;

    public u7r() {
        m();
    }

    public static u7r y(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (u7r) dsf.f(new u7r(), bArr);
    }

    public u7r A(cz7 cz7Var) {
        cz7Var.getClass();
        this.c = 31;
        this.d = cz7Var;
        return this;
    }

    public u7r B(vr9 vr9Var) {
        vr9Var.getClass();
        this.c = 10;
        this.d = vr9Var;
        return this;
    }

    public u7r C(g6f g6fVar) {
        g6fVar.getClass();
        this.c = 24;
        this.d = g6fVar;
        return this;
    }

    public u7r D(ww7 ww7Var) {
        ww7Var.getClass();
        this.c = 30;
        this.d = ww7Var;
        return this;
    }

    public u7r E(uxo uxoVar) {
        uxoVar.getClass();
        this.c = 4;
        this.d = uxoVar;
        return this;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b() + CodedOutputByteBufferNano.l(1, this.e) + CodedOutputByteBufferNano.y(2, this.f);
        if (this.c == 3) {
            iB += CodedOutputByteBufferNano.n(3, (dsf) this.d);
        }
        if (this.c == 4) {
            iB += CodedOutputByteBufferNano.n(4, (dsf) this.d);
        }
        if (this.c == 10) {
            iB += CodedOutputByteBufferNano.n(10, (dsf) this.d);
        }
        if (this.c == 15) {
            iB += CodedOutputByteBufferNano.n(15, (dsf) this.d);
        }
        if (this.c == 24) {
            iB += CodedOutputByteBufferNano.n(24, (dsf) this.d);
        }
        if (this.c == 30) {
            iB += CodedOutputByteBufferNano.n(30, (dsf) this.d);
        }
        if (this.c == 31) {
            iB += CodedOutputByteBufferNano.n(31, (dsf) this.d);
        }
        return this.c == 100 ? iB + CodedOutputByteBufferNano.h(100, ((Integer) this.d).intValue()) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.W(1, this.e);
        codedOutputByteBufferNano.p0(2, this.f);
        if (this.c == 3) {
            codedOutputByteBufferNano.Y(3, (dsf) this.d);
        }
        if (this.c == 4) {
            codedOutputByteBufferNano.Y(4, (dsf) this.d);
        }
        if (this.c == 10) {
            codedOutputByteBufferNano.Y(10, (dsf) this.d);
        }
        if (this.c == 15) {
            codedOutputByteBufferNano.Y(15, (dsf) this.d);
        }
        if (this.c == 24) {
            codedOutputByteBufferNano.Y(24, (dsf) this.d);
        }
        if (this.c == 30) {
            codedOutputByteBufferNano.Y(30, (dsf) this.d);
        }
        if (this.c == 31) {
            codedOutputByteBufferNano.Y(31, (dsf) this.d);
        }
        if (this.c == 100) {
            codedOutputByteBufferNano.S(100, ((Integer) this.d).intValue());
        }
        super.j(codedOutputByteBufferNano);
    }

    public u7r m() {
        this.e = 0;
        this.f = 0;
        n();
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    public u7r n() {
        this.c = 0;
        this.d = null;
        return this;
    }

    public r90 o() {
        if (this.c == 3) {
            return (r90) this.d;
        }
        return null;
    }

    public cz7 p() {
        if (this.c == 31) {
            return (cz7) this.d;
        }
        return null;
    }

    public int q() {
        if (this.c == 100) {
            return ((Integer) this.d).intValue();
        }
        return 0;
    }

    public vr9 r() {
        if (this.c == 10) {
            return (vr9) this.d;
        }
        return null;
    }

    public g6f s() {
        if (this.c == 24) {
            return (g6f) this.d;
        }
        return null;
    }

    public ww7 t() {
        if (this.c == 30) {
            return (ww7) this.d;
        }
        return null;
    }

    public uxo u() {
        if (this.c == 4) {
            return (uxo) this.d;
        }
        return null;
    }

    public boolean v() {
        return this.c == 3;
    }

    public boolean w() {
        return this.c == 100;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public u7r e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 8) {
                int iP = o34Var.p();
                if (iP != 0 && iP != 1 && iP != 2 && iP != 4 && iP != 5 && iP != 32 && iP != 33) {
                    switch (iP) {
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
                            break;
                        default:
                            continue;
                    }
                }
                this.e = iP;
            } else if (iA == 16) {
                this.f = o34Var.B();
            } else if (iA == 26) {
                if (this.c != 3) {
                    this.d = new r90();
                }
                o34Var.q((dsf) this.d);
                this.c = 3;
            } else if (iA == 34) {
                if (this.c != 4) {
                    this.d = new uxo();
                }
                o34Var.q((dsf) this.d);
                this.c = 4;
            } else if (iA == 82) {
                if (this.c != 10) {
                    this.d = new vr9();
                }
                o34Var.q((dsf) this.d);
                this.c = 10;
            } else if (iA == 194) {
                if (this.c != 24) {
                    this.d = new g6f();
                }
                o34Var.q((dsf) this.d);
                this.c = 24;
            } else if (iA == 242) {
                if (this.c != 30) {
                    this.d = new ww7();
                }
                o34Var.q((dsf) this.d);
                this.c = 30;
            } else if (iA == 250) {
                if (this.c != 31) {
                    this.d = new cz7();
                }
                o34Var.q((dsf) this.d);
                this.c = 31;
            } else if (iA == 800) {
                this.d = Integer.valueOf(o34Var.n());
                this.c = 100;
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }

    public u7r z(r90 r90Var) {
        r90Var.getClass();
        this.c = 3;
        this.d = r90Var;
        return this;
    }
}
