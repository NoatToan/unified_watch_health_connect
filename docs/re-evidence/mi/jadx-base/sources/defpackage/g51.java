package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class g51 extends ak8<g51> {
    public i51 c;
    public b51.a d;
    public boolean e;

    public g51() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b();
        i51 i51Var = this.c;
        if (i51Var != null) {
            iB += CodedOutputByteBufferNano.n(1, i51Var);
        }
        b51.a aVar = this.d;
        if (aVar != null) {
            iB += CodedOutputByteBufferNano.n(2, aVar);
        }
        return iB + CodedOutputByteBufferNano.b(3, this.e);
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        i51 i51Var = this.c;
        if (i51Var != null) {
            codedOutputByteBufferNano.Y(1, i51Var);
        }
        b51.a aVar = this.d;
        if (aVar != null) {
            codedOutputByteBufferNano.Y(2, aVar);
        }
        codedOutputByteBufferNano.M(3, this.e);
        super.j(codedOutputByteBufferNano);
    }

    public g51 m() {
        this.c = null;
        this.d = null;
        this.e = false;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public g51 e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 10) {
                if (this.c == null) {
                    this.c = new i51();
                }
                o34Var.q(this.c);
            } else if (iA == 18) {
                if (this.d == null) {
                    this.d = new b51.a();
                }
                o34Var.q(this.d);
            } else if (iA == 24) {
                this.e = o34Var.k();
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
