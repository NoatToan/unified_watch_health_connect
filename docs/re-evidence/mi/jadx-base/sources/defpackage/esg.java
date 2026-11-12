package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class esg extends ak8<esg> {
    public boolean c;
    public boolean d;
    public byte[] e;
    public byte[] f;

    public esg() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b() + CodedOutputByteBufferNano.b(1, this.c) + CodedOutputByteBufferNano.b(2, this.d);
        byte[] bArr = this.e;
        byte[] bArr2 = bmr.h;
        if (!Arrays.equals(bArr, bArr2)) {
            iB += CodedOutputByteBufferNano.d(3, this.e);
        }
        return !Arrays.equals(this.f, bArr2) ? iB + CodedOutputByteBufferNano.d(4, this.f) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.M(1, this.c);
        codedOutputByteBufferNano.M(2, this.d);
        byte[] bArr = this.e;
        byte[] bArr2 = bmr.h;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.O(3, this.e);
        }
        if (!Arrays.equals(this.f, bArr2)) {
            codedOutputByteBufferNano.O(4, this.f);
        }
        super.j(codedOutputByteBufferNano);
    }

    public esg m() {
        this.c = false;
        this.d = false;
        byte[] bArr = bmr.h;
        this.e = bArr;
        this.f = bArr;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public esg e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 8) {
                this.c = o34Var.k();
            } else if (iA == 16) {
                this.d = o34Var.k();
            } else if (iA == 26) {
                this.e = o34Var.l();
            } else if (iA == 34) {
                this.f = o34Var.l();
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
