package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class ta0 extends ak8<ta0> {
    public byte[] c;
    public byte[] d;
    public byte[] e;

    public ta0() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        return super.b() + CodedOutputByteBufferNano.d(1, this.c) + CodedOutputByteBufferNano.d(2, this.d) + CodedOutputByteBufferNano.d(3, this.e);
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.O(1, this.c);
        codedOutputByteBufferNano.O(2, this.d);
        codedOutputByteBufferNano.O(3, this.e);
        super.j(codedOutputByteBufferNano);
    }

    public ta0 m() {
        byte[] bArr = bmr.h;
        this.c = bArr;
        this.d = bArr;
        this.e = bArr;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public ta0 e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 10) {
                this.c = o34Var.l();
            } else if (iA == 18) {
                this.d = o34Var.l();
            } else if (iA == 26) {
                this.e = o34Var.l();
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
