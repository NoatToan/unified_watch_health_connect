package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class a6r extends ak8<a6r> {
    public static volatile a6r[] f;
    public String c;
    public String d;
    public int e;

    public a6r() {
        m();
    }

    public static a6r[] n() {
        if (f == null) {
            synchronized (afd.c) {
                try {
                    if (f == null) {
                        f = new a6r[0];
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b() + CodedOutputByteBufferNano.v(1, this.c) + CodedOutputByteBufferNano.v(2, this.d);
        int i = this.e;
        return i != 0 ? iB + CodedOutputByteBufferNano.y(3, i) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.m0(1, this.c);
        codedOutputByteBufferNano.m0(2, this.d);
        int i = this.e;
        if (i != 0) {
            codedOutputByteBufferNano.p0(3, i);
        }
        super.j(codedOutputByteBufferNano);
    }

    public a6r m() {
        this.c = "";
        this.d = "";
        this.e = 0;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public a6r e(o34 o34Var) throws IOException {
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
                this.e = o34Var.B();
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
