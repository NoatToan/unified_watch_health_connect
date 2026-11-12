package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class oed extends ak8<oed> {
    public int c = 0;
    public Object d;
    public int e;

    public oed() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b() + CodedOutputByteBufferNano.y(1, this.e);
        if (this.c == 2) {
            iB += CodedOutputByteBufferNano.n(2, (dsf) this.d);
        }
        return this.c == 3 ? iB + CodedOutputByteBufferNano.n(3, (dsf) this.d) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.p0(1, this.e);
        if (this.c == 2) {
            codedOutputByteBufferNano.Y(2, (dsf) this.d);
        }
        if (this.c == 3) {
            codedOutputByteBufferNano.Y(3, (dsf) this.d);
        }
        super.j(codedOutputByteBufferNano);
    }

    public oed m() {
        this.e = 0;
        n();
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    public oed n() {
        this.c = 0;
        this.d = null;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public oed e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 8) {
                this.e = o34Var.B();
            } else if (iA == 18) {
                if (this.c != 2) {
                    this.d = new ned();
                }
                o34Var.q((dsf) this.d);
                this.c = 2;
            } else if (iA == 26) {
                if (this.c != 3) {
                    this.d = new qed();
                }
                o34Var.q((dsf) this.d);
                this.c = 3;
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
