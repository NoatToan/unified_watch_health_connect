package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class x0b extends ak8<x0b> {
    public int c = 0;
    public Object d;

    public x0b() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b();
        if (this.c == 1) {
            iB += CodedOutputByteBufferNano.y(1, ((Integer) this.d).intValue());
        }
        if (this.c == 2) {
            iB += CodedOutputByteBufferNano.n(2, (dsf) this.d);
        }
        return this.c == 3 ? iB + CodedOutputByteBufferNano.n(3, (dsf) this.d) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (this.c == 1) {
            codedOutputByteBufferNano.p0(1, ((Integer) this.d).intValue());
        }
        if (this.c == 2) {
            codedOutputByteBufferNano.Y(2, (dsf) this.d);
        }
        if (this.c == 3) {
            codedOutputByteBufferNano.Y(3, (dsf) this.d);
        }
        super.j(codedOutputByteBufferNano);
    }

    public x0b m() {
        n();
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    public x0b n() {
        this.c = 0;
        this.d = null;
        return this;
    }

    public w0b o() {
        if (this.c == 2) {
            return (w0b) this.d;
        }
        return null;
    }

    public int p() {
        if (this.c == 1) {
            return ((Integer) this.d).intValue();
        }
        return 0;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public x0b e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 8) {
                this.d = Integer.valueOf(o34Var.B());
                this.c = 1;
            } else if (iA == 18) {
                if (this.c != 2) {
                    this.d = new w0b();
                }
                o34Var.q((dsf) this.d);
                this.c = 2;
            } else if (iA == 26) {
                if (this.c != 3) {
                    this.d = new y0b();
                }
                o34Var.q((dsf) this.d);
                this.c = 3;
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }

    public x0b r(y0b y0bVar) {
        y0bVar.getClass();
        this.c = 3;
        this.d = y0bVar;
        return this;
    }
}
