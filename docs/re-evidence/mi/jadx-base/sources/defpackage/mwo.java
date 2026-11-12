package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class mwo extends ak8<mwo> {
    public boolean c;
    public int d;
    public boolean e;
    public boolean f;
    public qwo g;

    public mwo() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b() + CodedOutputByteBufferNano.b(1, this.c);
        int i = this.d;
        if (i != 0) {
            iB += CodedOutputByteBufferNano.y(2, i);
        }
        int iB2 = iB + CodedOutputByteBufferNano.b(3, this.e) + CodedOutputByteBufferNano.b(4, this.f);
        qwo qwoVar = this.g;
        return qwoVar != null ? iB2 + CodedOutputByteBufferNano.n(5, qwoVar) : iB2;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.M(1, this.c);
        int i = this.d;
        if (i != 0) {
            codedOutputByteBufferNano.p0(2, i);
        }
        codedOutputByteBufferNano.M(3, this.e);
        codedOutputByteBufferNano.M(4, this.f);
        qwo qwoVar = this.g;
        if (qwoVar != null) {
            codedOutputByteBufferNano.Y(5, qwoVar);
        }
        super.j(codedOutputByteBufferNano);
    }

    public mwo m() {
        this.c = false;
        this.d = 0;
        this.e = false;
        this.f = false;
        this.g = null;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public mwo e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 8) {
                this.c = o34Var.k();
            } else if (iA == 16) {
                this.d = o34Var.B();
            } else if (iA == 24) {
                this.e = o34Var.k();
            } else if (iA == 32) {
                this.f = o34Var.k();
            } else if (iA == 42) {
                if (this.g == null) {
                    this.g = new qwo();
                }
                o34Var.q(this.g);
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
