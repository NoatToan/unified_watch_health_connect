package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public final class jc0 extends ak8<jc0> {
    public String c;
    public String d;
    public long e;
    public int f;
    public String g;
    public boolean h;

    public jc0() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        return super.b() + CodedOutputByteBufferNano.v(1, this.c) + CodedOutputByteBufferNano.v(2, this.d) + CodedOutputByteBufferNano.A(3, this.e) + CodedOutputByteBufferNano.y(4, this.f) + CodedOutputByteBufferNano.v(5, this.g) + CodedOutputByteBufferNano.b(6, this.h);
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.m0(1, this.c);
        codedOutputByteBufferNano.m0(2, this.d);
        codedOutputByteBufferNano.r0(3, this.e);
        codedOutputByteBufferNano.p0(4, this.f);
        codedOutputByteBufferNano.m0(5, this.g);
        codedOutputByteBufferNano.M(6, this.h);
        super.j(codedOutputByteBufferNano);
    }

    public jc0 m() {
        this.c = "";
        this.d = "";
        this.e = 0L;
        this.f = 0;
        this.g = "";
        this.h = false;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public jc0 e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 10) {
                this.c = o34Var.z();
            } else if (iA == 18) {
                this.d = o34Var.z();
            } else if (iA == 24) {
                this.e = o34Var.C();
            } else if (iA == 32) {
                this.f = o34Var.B();
            } else if (iA == 42) {
                this.g = o34Var.z();
            } else if (iA == 48) {
                this.h = o34Var.k();
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
