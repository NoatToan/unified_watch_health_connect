package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class m5f extends ak8<m5f> {
    public int c = 0;
    public Object d;

    public m5f() {
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
        return this.c == 4 ? iB + CodedOutputByteBufferNano.n(4, (dsf) this.d) : iB;
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
        super.j(codedOutputByteBufferNano);
    }

    public m5f m() {
        n();
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    public m5f n() {
        this.c = 0;
        this.d = null;
        return this;
    }

    public l5f o() {
        if (this.c == 3) {
            return (l5f) this.d;
        }
        return null;
    }

    public n5f p() {
        if (this.c == 4) {
            return (n5f) this.d;
        }
        return null;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public m5f e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 10) {
                if (this.c != 1) {
                    this.d = new j5f();
                }
                o34Var.q((dsf) this.d);
                this.c = 1;
            } else if (iA == 18) {
                if (this.c != 2) {
                    this.d = new j5f.a();
                }
                o34Var.q((dsf) this.d);
                this.c = 2;
            } else if (iA == 26) {
                if (this.c != 3) {
                    this.d = new l5f();
                }
                o34Var.q((dsf) this.d);
                this.c = 3;
            } else if (iA == 34) {
                if (this.c != 4) {
                    this.d = new n5f();
                }
                o34Var.q((dsf) this.d);
                this.c = 4;
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }

    public m5f r(j5f j5fVar) {
        j5fVar.getClass();
        this.c = 1;
        this.d = j5fVar;
        return this;
    }

    public m5f s(n5f n5fVar) {
        n5fVar.getClass();
        this.c = 4;
        this.d = n5fVar;
        return this;
    }
}
