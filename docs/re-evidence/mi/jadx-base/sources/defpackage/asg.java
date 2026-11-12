package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class asg extends ak8<asg> {
    public static volatile asg[] e;
    public jsg c;
    public int d;

    public asg() {
        m();
    }

    public static asg[] n() {
        if (e == null) {
            synchronized (afd.c) {
                try {
                    if (e == null) {
                        e = new asg[0];
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
        jsg jsgVar = this.c;
        if (jsgVar != null) {
            iB += CodedOutputByteBufferNano.n(1, jsgVar);
        }
        return iB + CodedOutputByteBufferNano.y(2, this.d);
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        jsg jsgVar = this.c;
        if (jsgVar != null) {
            codedOutputByteBufferNano.Y(1, jsgVar);
        }
        codedOutputByteBufferNano.p0(2, this.d);
        super.j(codedOutputByteBufferNano);
    }

    public asg m() {
        this.c = null;
        this.d = 0;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public asg e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 10) {
                if (this.c == null) {
                    this.c = new jsg();
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
