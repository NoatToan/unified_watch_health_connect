package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class z11 extends ak8<z11> {
    public String c;
    public i11.a d;
    public f21 e;

    public z11() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b() + CodedOutputByteBufferNano.v(1, this.c);
        i11.a aVar = this.d;
        if (aVar != null) {
            iB += CodedOutputByteBufferNano.n(2, aVar);
        }
        f21 f21Var = this.e;
        return f21Var != null ? iB + CodedOutputByteBufferNano.n(3, f21Var) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.m0(1, this.c);
        i11.a aVar = this.d;
        if (aVar != null) {
            codedOutputByteBufferNano.Y(2, aVar);
        }
        f21 f21Var = this.e;
        if (f21Var != null) {
            codedOutputByteBufferNano.Y(3, f21Var);
        }
        super.j(codedOutputByteBufferNano);
    }

    public z11 m() {
        this.c = "";
        this.d = null;
        this.e = null;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public z11 e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 10) {
                this.c = o34Var.z();
            } else if (iA == 18) {
                if (this.d == null) {
                    this.d = new i11.a();
                }
                o34Var.q(this.d);
            } else if (iA == 26) {
                if (this.e == null) {
                    this.e = new f21();
                }
                o34Var.q(this.e);
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
