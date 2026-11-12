package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class ccp extends ak8<ccp> {
    public String c;
    public byte[] d;

    public ccp() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b() + CodedOutputByteBufferNano.v(1, this.c);
        return !Arrays.equals(this.d, bmr.h) ? iB + CodedOutputByteBufferNano.d(2, this.d) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.m0(1, this.c);
        if (!Arrays.equals(this.d, bmr.h)) {
            codedOutputByteBufferNano.O(2, this.d);
        }
        super.j(codedOutputByteBufferNano);
    }

    public ccp m() {
        this.c = "";
        this.d = bmr.h;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public ccp e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 10) {
                this.c = o34Var.z();
            } else if (iA == 18) {
                this.d = o34Var.l();
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
