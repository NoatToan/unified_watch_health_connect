package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class jsg extends ak8<jsg> {
    public static volatile jsg[] h;
    public int c;
    public boolean d;
    public byte[] e;
    public byte[] f;
    public byte[] g;

    public jsg() {
        m();
    }

    public static jsg[] n() {
        if (h == null) {
            synchronized (afd.c) {
                try {
                    if (h == null) {
                        h = new jsg[0];
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return h;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b() + CodedOutputByteBufferNano.y(1, this.c) + CodedOutputByteBufferNano.b(2, this.d);
        byte[] bArr = this.e;
        byte[] bArr2 = bmr.h;
        if (!Arrays.equals(bArr, bArr2)) {
            iB += CodedOutputByteBufferNano.d(3, this.e);
        }
        if (!Arrays.equals(this.f, bArr2)) {
            iB += CodedOutputByteBufferNano.d(4, this.f);
        }
        return !Arrays.equals(this.g, bArr2) ? iB + CodedOutputByteBufferNano.d(5, this.g) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.p0(1, this.c);
        codedOutputByteBufferNano.M(2, this.d);
        byte[] bArr = this.e;
        byte[] bArr2 = bmr.h;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.O(3, this.e);
        }
        if (!Arrays.equals(this.f, bArr2)) {
            codedOutputByteBufferNano.O(4, this.f);
        }
        if (!Arrays.equals(this.g, bArr2)) {
            codedOutputByteBufferNano.O(5, this.g);
        }
        super.j(codedOutputByteBufferNano);
    }

    public jsg m() {
        this.c = 0;
        this.d = false;
        byte[] bArr = bmr.h;
        this.e = bArr;
        this.f = bArr;
        this.g = bArr;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public jsg e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 8) {
                this.c = o34Var.B();
            } else if (iA == 16) {
                this.d = o34Var.k();
            } else if (iA == 26) {
                this.e = o34Var.l();
            } else if (iA == 34) {
                this.f = o34Var.l();
            } else if (iA == 42) {
                this.g = o34Var.l();
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
