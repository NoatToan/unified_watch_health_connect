package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class e9r extends ak8<e9r> {
    public int c = 0;
    public Object d;

    public e9r() {
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
            iB += CodedOutputByteBufferNano.j(3, ((Float) this.d).floatValue());
        }
        if (this.c == 4) {
            iB += CodedOutputByteBufferNano.n(4, (dsf) this.d);
        }
        if (this.c == 5) {
            iB += CodedOutputByteBufferNano.n(5, (dsf) this.d);
        }
        return this.c == 6 ? iB + CodedOutputByteBufferNano.n(6, (dsf) this.d) : iB;
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
            codedOutputByteBufferNano.U(3, ((Float) this.d).floatValue());
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
        super.j(codedOutputByteBufferNano);
    }

    public e9r m() {
        n();
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    public e9r n() {
        this.c = 0;
        this.d = null;
        return this;
    }

    public c9r o() {
        if (this.c == 5) {
            return (c9r) this.d;
        }
        return null;
    }

    public c9r.a p() {
        if (this.c == 4) {
            return (c9r.a) this.d;
        }
        return null;
    }

    public f9r q() {
        if (this.c == 6) {
            return (f9r) this.d;
        }
        return null;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public e9r e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 10) {
                if (this.c != 1) {
                    this.d = new i9r();
                }
                o34Var.q((dsf) this.d);
                this.c = 1;
            } else if (iA == 18) {
                if (this.c != 2) {
                    this.d = new g9r();
                }
                o34Var.q((dsf) this.d);
                this.c = 2;
            } else if (iA == 29) {
                this.d = Float.valueOf(o34Var.o());
                this.c = 3;
            } else if (iA == 34) {
                if (this.c != 4) {
                    this.d = new c9r.a();
                }
                o34Var.q((dsf) this.d);
                this.c = 4;
            } else if (iA == 42) {
                if (this.c != 5) {
                    this.d = new c9r();
                }
                o34Var.q((dsf) this.d);
                this.c = 5;
            } else if (iA == 50) {
                if (this.c != 6) {
                    this.d = new f9r();
                }
                o34Var.q((dsf) this.d);
                this.c = 6;
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }

    public e9r s(c9r c9rVar) {
        c9rVar.getClass();
        this.c = 5;
        this.d = c9rVar;
        return this;
    }

    public e9r t(c9r.a aVar) {
        aVar.getClass();
        this.c = 4;
        this.d = aVar;
        return this;
    }

    public e9r u(g9r g9rVar) {
        g9rVar.getClass();
        this.c = 2;
        this.d = g9rVar;
        return this;
    }

    public e9r v(i9r i9rVar) {
        i9rVar.getClass();
        this.c = 1;
        this.d = i9rVar;
        return this;
    }

    public e9r w(float f) {
        this.c = 3;
        this.d = Float.valueOf(f);
        return this;
    }

    public e9r x(f9r f9rVar) {
        f9rVar.getClass();
        this.c = 6;
        this.d = f9rVar;
        return this;
    }
}
