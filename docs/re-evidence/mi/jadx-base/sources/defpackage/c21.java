package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class c21 extends ak8<c21> {
    public u11.a c;
    public String d;
    public int e;
    public u11.a f;

    public c21() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b();
        u11.a aVar = this.c;
        if (aVar != null) {
            iB += CodedOutputByteBufferNano.n(1, aVar);
        }
        int iV = iB + CodedOutputByteBufferNano.v(2, this.d);
        int i = this.e;
        if (i != -1) {
            iV += CodedOutputByteBufferNano.l(3, i);
        }
        u11.a aVar2 = this.f;
        return aVar2 != null ? iV + CodedOutputByteBufferNano.n(4, aVar2) : iV;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        u11.a aVar = this.c;
        if (aVar != null) {
            codedOutputByteBufferNano.Y(1, aVar);
        }
        codedOutputByteBufferNano.m0(2, this.d);
        int i = this.e;
        if (i != -1) {
            codedOutputByteBufferNano.W(3, i);
        }
        u11.a aVar2 = this.f;
        if (aVar2 != null) {
            codedOutputByteBufferNano.Y(4, aVar2);
        }
        super.j(codedOutputByteBufferNano);
    }

    public c21 m() {
        this.c = null;
        this.d = "";
        this.e = -1;
        this.f = null;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public c21 e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 10) {
                if (this.c == null) {
                    this.c = new u11.a();
                }
                o34Var.q(this.c);
            } else if (iA == 18) {
                this.d = o34Var.z();
            } else if (iA == 24) {
                int iP = o34Var.p();
                if (iP == -1 || iP == 0 || iP == 1) {
                    this.e = iP;
                }
            } else if (iA == 34) {
                if (this.f == null) {
                    this.f = new u11.a();
                }
                o34Var.q(this.f);
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
