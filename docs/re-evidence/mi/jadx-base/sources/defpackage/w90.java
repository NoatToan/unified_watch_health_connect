package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class w90 extends ak8<w90> {
    public byte[] c;
    public String d;
    public boolean e;

    public w90() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b() + CodedOutputByteBufferNano.d(1, this.c);
        if (!this.d.equals("")) {
            iB += CodedOutputByteBufferNano.v(2, this.d);
        }
        boolean z = this.e;
        return z ? iB + CodedOutputByteBufferNano.b(3, z) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.O(1, this.c);
        if (!this.d.equals("")) {
            codedOutputByteBufferNano.m0(2, this.d);
        }
        boolean z = this.e;
        if (z) {
            codedOutputByteBufferNano.M(3, z);
        }
        super.j(codedOutputByteBufferNano);
    }

    public w90 m() {
        this.c = bmr.h;
        this.d = "";
        this.e = false;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public w90 e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 10) {
                this.c = o34Var.l();
            } else if (iA == 18) {
                this.d = o34Var.z();
            } else if (iA == 24) {
                this.e = o34Var.k();
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
