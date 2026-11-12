package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public final class k6f extends ak8<k6f> {
    public int c;
    public byte[] d;
    public int e;
    public int f;

    public k6f() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b() + CodedOutputByteBufferNano.y(1, this.c) + CodedOutputByteBufferNano.d(2, this.d) + CodedOutputByteBufferNano.y(3, this.e);
        int i = this.f;
        return i != 0 ? iB + CodedOutputByteBufferNano.y(4, i) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.p0(1, this.c);
        codedOutputByteBufferNano.O(2, this.d);
        codedOutputByteBufferNano.p0(3, this.e);
        int i = this.f;
        if (i != 0) {
            codedOutputByteBufferNano.p0(4, i);
        }
        super.j(codedOutputByteBufferNano);
    }

    public k6f m() {
        this.c = 0;
        this.d = bmr.h;
        this.e = 0;
        this.f = 0;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public k6f e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 8) {
                this.c = o34Var.B();
            } else if (iA == 18) {
                this.d = o34Var.l();
            } else if (iA == 24) {
                this.e = o34Var.B();
            } else if (iA == 32) {
                this.f = o34Var.B();
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
