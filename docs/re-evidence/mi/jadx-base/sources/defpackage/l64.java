package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class l64 extends ak8<l64> {
    public static volatile l64[] g;
    public long c;
    public float d;
    public float e;
    public float f;

    public l64() {
        m();
    }

    public static l64[] n() {
        if (g == null) {
            synchronized (afd.c) {
                try {
                    if (g == null) {
                        g = new l64[0];
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return g;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        return super.b() + CodedOutputByteBufferNano.A(1, this.c) + CodedOutputByteBufferNano.j(2, this.d) + CodedOutputByteBufferNano.j(3, this.e) + CodedOutputByteBufferNano.j(4, this.f);
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.r0(1, this.c);
        codedOutputByteBufferNano.U(2, this.d);
        codedOutputByteBufferNano.U(3, this.e);
        codedOutputByteBufferNano.U(4, this.f);
        super.j(codedOutputByteBufferNano);
    }

    public l64 m() {
        this.c = 0L;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 0.0f;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public l64 e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 8) {
                this.c = o34Var.C();
            } else if (iA == 21) {
                this.d = o34Var.o();
            } else if (iA == 29) {
                this.e = o34Var.o();
            } else if (iA == 37) {
                this.f = o34Var.o();
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
