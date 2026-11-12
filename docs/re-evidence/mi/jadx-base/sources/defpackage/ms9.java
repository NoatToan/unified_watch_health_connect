package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public final class ms9 extends ak8<ms9> {
    public static volatile ms9[] e;
    public mu9 c;
    public int d;

    public ms9() {
        m();
    }

    public static ms9[] n() {
        if (e == null) {
            synchronized (afd.c) {
                try {
                    if (e == null) {
                        e = new ms9[0];
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return e;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b();
        mu9 mu9Var = this.c;
        if (mu9Var != null) {
            iB += CodedOutputByteBufferNano.n(1, mu9Var);
        }
        return iB + CodedOutputByteBufferNano.y(2, this.d);
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        mu9 mu9Var = this.c;
        if (mu9Var != null) {
            codedOutputByteBufferNano.Y(1, mu9Var);
        }
        codedOutputByteBufferNano.p0(2, this.d);
        super.j(codedOutputByteBufferNano);
    }

    public ms9 m() {
        this.c = null;
        this.d = 0;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public ms9 e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 10) {
                if (this.c == null) {
                    this.c = new mu9();
                }
                o34Var.q(this.c);
            } else if (iA == 16) {
                this.d = o34Var.B();
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
