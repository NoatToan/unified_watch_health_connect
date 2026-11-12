package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class v64 extends ak8<v64> {
    public int c;
    public int d;
    public String e;
    public String f;

    public v64() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b() + CodedOutputByteBufferNano.r(1, this.c);
        int i = this.d;
        if (i != 0) {
            iB += CodedOutputByteBufferNano.r(2, i);
        }
        if (!this.e.equals("")) {
            iB += CodedOutputByteBufferNano.v(3, this.e);
        }
        return !this.f.equals("") ? iB + CodedOutputByteBufferNano.v(4, this.f) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.i0(1, this.c);
        int i = this.d;
        if (i != 0) {
            codedOutputByteBufferNano.i0(2, i);
        }
        if (!this.e.equals("")) {
            codedOutputByteBufferNano.m0(3, this.e);
        }
        if (!this.f.equals("")) {
            codedOutputByteBufferNano.m0(4, this.f);
        }
        super.j(codedOutputByteBufferNano);
    }

    public v64 m() {
        this.c = 0;
        this.d = 0;
        this.e = "";
        this.f = "";
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public v64 e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 8) {
                this.c = o34Var.x();
            } else if (iA == 16) {
                this.d = o34Var.x();
            } else if (iA == 26) {
                this.e = o34Var.z();
            } else if (iA == 34) {
                this.f = o34Var.z();
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
