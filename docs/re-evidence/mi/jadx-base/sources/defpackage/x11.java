package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class x11 extends ak8<x11> {
    public m11 c;
    public m11.a d;
    public m11.a e;
    public String f;

    public x11() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b();
        m11 m11Var = this.c;
        if (m11Var != null) {
            iB += CodedOutputByteBufferNano.n(1, m11Var);
        }
        m11.a aVar = this.d;
        if (aVar != null) {
            iB += CodedOutputByteBufferNano.n(2, aVar);
        }
        m11.a aVar2 = this.e;
        if (aVar2 != null) {
            iB += CodedOutputByteBufferNano.n(3, aVar2);
        }
        return iB + CodedOutputByteBufferNano.v(4, this.f);
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        m11 m11Var = this.c;
        if (m11Var != null) {
            codedOutputByteBufferNano.Y(1, m11Var);
        }
        m11.a aVar = this.d;
        if (aVar != null) {
            codedOutputByteBufferNano.Y(2, aVar);
        }
        m11.a aVar2 = this.e;
        if (aVar2 != null) {
            codedOutputByteBufferNano.Y(3, aVar2);
        }
        codedOutputByteBufferNano.m0(4, this.f);
        super.j(codedOutputByteBufferNano);
    }

    public x11 m() {
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = "";
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public x11 e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 10) {
                if (this.c == null) {
                    this.c = new m11();
                }
                o34Var.q(this.c);
            } else if (iA == 18) {
                if (this.d == null) {
                    this.d = new m11.a();
                }
                o34Var.q(this.d);
            } else if (iA == 26) {
                if (this.e == null) {
                    this.e = new m11.a();
                }
                o34Var.q(this.e);
            } else if (iA == 34) {
                this.f = o34Var.z();
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
