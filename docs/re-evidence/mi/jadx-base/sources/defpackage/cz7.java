package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public final class cz7 extends ak8<cz7> {
    public int c = 0;
    public Object d;

    public cz7() {
        m();
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
        return this.c == 30 ? iB + CodedOutputByteBufferNano.n(30, (dsf) this.d) : iB;
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
        if (this.c == 30) {
            codedOutputByteBufferNano.Y(30, (dsf) this.d);
        }
        super.j(codedOutputByteBufferNano);
    }

    public cz7 m() {
        n();
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    public cz7 n() {
        this.c = 0;
        this.d = null;
        return this;
    }

    public dz7 o() {
        if (this.c == 5) {
            return (dz7) this.d;
        }
        return null;
    }

    public ez7 p() {
        if (this.c == 6) {
            return (ez7) this.d;
        }
        return null;
    }

    public fz7 q() {
        if (this.c == 4) {
            return (fz7) this.d;
        }
        return null;
    }

    public gz7 r() {
        if (this.c == 2) {
            return (gz7) this.d;
        }
        return null;
    }

    public hz7 s() {
        if (this.c == 30) {
            return (hz7) this.d;
        }
        return null;
    }

    public jz7 t() {
        if (this.c == 3) {
            return (jz7) this.d;
        }
        return null;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public cz7 e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 10) {
                if (this.c != 1) {
                    this.d = new iz7();
                }
                o34Var.q((dsf) this.d);
                this.c = 1;
            } else if (iA == 18) {
                if (this.c != 2) {
                    this.d = new gz7();
                }
                o34Var.q((dsf) this.d);
                this.c = 2;
            } else if (iA == 26) {
                if (this.c != 3) {
                    this.d = new jz7();
                }
                o34Var.q((dsf) this.d);
                this.c = 3;
            } else if (iA == 34) {
                if (this.c != 4) {
                    this.d = new fz7();
                }
                o34Var.q((dsf) this.d);
                this.c = 4;
            } else if (iA == 42) {
                if (this.c != 5) {
                    this.d = new dz7();
                }
                o34Var.q((dsf) this.d);
                this.c = 5;
            } else if (iA == 50) {
                if (this.c != 6) {
                    this.d = new ez7();
                }
                o34Var.q((dsf) this.d);
                this.c = 6;
            } else if (iA == 242) {
                if (this.c != 30) {
                    this.d = new hz7();
                }
                o34Var.q((dsf) this.d);
                this.c = 30;
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }

    public cz7 v(dz7 dz7Var) {
        dz7Var.getClass();
        this.c = 5;
        this.d = dz7Var;
        return this;
    }

    public cz7 w(ez7 ez7Var) {
        ez7Var.getClass();
        this.c = 6;
        this.d = ez7Var;
        return this;
    }

    public cz7 x(hz7 hz7Var) {
        hz7Var.getClass();
        this.c = 30;
        this.d = hz7Var;
        return this;
    }

    public cz7 y(iz7 iz7Var) {
        iz7Var.getClass();
        this.c = 1;
        this.d = iz7Var;
        return this;
    }
}
