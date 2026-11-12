package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class w0b extends ak8<w0b> {
    public int c;
    public String d;
    public int e;
    public boolean f;
    public int g;

    public w0b() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b() + CodedOutputByteBufferNano.l(1, this.c) + CodedOutputByteBufferNano.v(2, this.d);
        int i = this.e;
        if (i != 0) {
            iB += CodedOutputByteBufferNano.y(3, i);
        }
        boolean z = this.f;
        if (z) {
            iB += CodedOutputByteBufferNano.b(4, z);
        }
        int i2 = this.g;
        return i2 != 0 ? iB + CodedOutputByteBufferNano.y(5, i2) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.W(1, this.c);
        codedOutputByteBufferNano.m0(2, this.d);
        int i = this.e;
        if (i != 0) {
            codedOutputByteBufferNano.p0(3, i);
        }
        boolean z = this.f;
        if (z) {
            codedOutputByteBufferNano.M(4, z);
        }
        int i2 = this.g;
        if (i2 != 0) {
            codedOutputByteBufferNano.p0(5, i2);
        }
        super.j(codedOutputByteBufferNano);
    }

    public w0b m() {
        this.c = 1;
        this.d = "";
        this.e = 0;
        this.f = false;
        this.g = 0;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public w0b e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 8) {
                int iP = o34Var.p();
                if (iP == 1 || iP == 2 || iP == 3) {
                    this.c = iP;
                }
            } else if (iA == 18) {
                this.d = o34Var.z();
            } else if (iA == 24) {
                this.e = o34Var.B();
            } else if (iA == 32) {
                this.f = o34Var.k();
            } else if (iA == 40) {
                this.g = o34Var.B();
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
