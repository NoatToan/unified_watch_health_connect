package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class z93 extends ak8<z93> {
    public int c = 0;
    public Object d;

    public z93() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b();
        if (this.c == 1) {
            iB += CodedOutputByteBufferNano.n(1, (dsf) this.d);
        }
        return this.c == 2 ? iB + CodedOutputByteBufferNano.n(2, (dsf) this.d) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (this.c == 1) {
            codedOutputByteBufferNano.Y(1, (dsf) this.d);
        }
        if (this.c == 2) {
            codedOutputByteBufferNano.Y(2, (dsf) this.d);
        }
        super.j(codedOutputByteBufferNano);
    }

    public z93 m() {
        n();
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    public z93 n() {
        this.c = 0;
        this.d = null;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public z93 e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 10) {
                if (this.c != 1) {
                    this.d = new aa3();
                }
                o34Var.q((dsf) this.d);
                this.c = 1;
            } else if (iA == 18) {
                if (this.c != 2) {
                    this.d = new aa3.a();
                }
                o34Var.q((dsf) this.d);
                this.c = 2;
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }

    public z93 p(aa3.a aVar) {
        aVar.getClass();
        this.c = 2;
        this.d = aVar;
        return this;
    }
}
