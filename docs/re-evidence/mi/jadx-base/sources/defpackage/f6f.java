package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class f6f extends ak8<f6f> {
    public int c = 0;
    public Object d;

    public f6f() {
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

    public f6f m() {
        n();
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    public f6f n() {
        this.c = 0;
        this.d = null;
        return this;
    }

    public h6f o() {
        if (this.c == 3) {
            return (h6f) this.d;
        }
        return null;
    }

    public l6f p() {
        if (this.c == 2) {
            return (l6f) this.d;
        }
        return null;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public f6f e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 10) {
                if (this.c != 1) {
                    this.d = new j6f();
                }
                o34Var.q((dsf) this.d);
                this.c = 1;
            } else if (iA == 18) {
                if (this.c != 2) {
                    this.d = new l6f();
                }
                o34Var.q((dsf) this.d);
                this.c = 2;
            } else if (iA == 26) {
                if (this.c != 3) {
                    this.d = new h6f();
                }
                o34Var.q((dsf) this.d);
                this.c = 3;
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }

    public f6f r(h6f h6fVar) {
        h6fVar.getClass();
        this.c = 3;
        this.d = h6fVar;
        return this;
    }

    public f6f s(j6f j6fVar) {
        j6fVar.getClass();
        this.c = 1;
        this.d = j6fVar;
        return this;
    }
}
