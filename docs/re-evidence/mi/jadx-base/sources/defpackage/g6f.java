package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public final class g6f extends ak8<g6f> {
    public int c = 0;
    public Object d;

    public g6f() {
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
        return this.c == 3 ? iB + CodedOutputByteBufferNano.n(3, (dsf) this.d) : iB;
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
        super.j(codedOutputByteBufferNano);
    }

    public g6f m() {
        n();
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    public g6f n() {
        this.c = 0;
        this.d = null;
        return this;
    }

    public m6f o() {
        if (this.c == 2) {
            return (m6f) this.d;
        }
        return null;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public g6f e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 10) {
                if (this.c != 1) {
                    this.d = new k6f();
                }
                o34Var.q((dsf) this.d);
                this.c = 1;
            } else if (iA == 18) {
                if (this.c != 2) {
                    this.d = new m6f();
                }
                o34Var.q((dsf) this.d);
                this.c = 2;
            } else if (iA == 26) {
                if (this.c != 3) {
                    this.d = new i6f();
                }
                o34Var.q((dsf) this.d);
                this.c = 3;
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }

    public g6f q(i6f i6fVar) {
        i6fVar.getClass();
        this.c = 3;
        this.d = i6fVar;
        return this;
    }

    public g6f r(k6f k6fVar) {
        k6fVar.getClass();
        this.c = 1;
        this.d = k6fVar;
        return this;
    }
}
