package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class h51 extends ak8<h51> {
    public i51 c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public j51.a i;
    public int j;

    public h51() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b();
        i51 i51Var = this.c;
        if (i51Var != null) {
            iB += CodedOutputByteBufferNano.n(1, i51Var);
        }
        int iV = iB + CodedOutputByteBufferNano.v(2, this.d) + CodedOutputByteBufferNano.v(3, this.e) + CodedOutputByteBufferNano.v(4, this.f) + CodedOutputByteBufferNano.v(5, this.g) + CodedOutputByteBufferNano.v(6, this.h);
        j51.a aVar = this.i;
        if (aVar != null) {
            iV += CodedOutputByteBufferNano.n(7, aVar);
        }
        return iV + CodedOutputByteBufferNano.l(8, this.j);
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        i51 i51Var = this.c;
        if (i51Var != null) {
            codedOutputByteBufferNano.Y(1, i51Var);
        }
        codedOutputByteBufferNano.m0(2, this.d);
        codedOutputByteBufferNano.m0(3, this.e);
        codedOutputByteBufferNano.m0(4, this.f);
        codedOutputByteBufferNano.m0(5, this.g);
        codedOutputByteBufferNano.m0(6, this.h);
        j51.a aVar = this.i;
        if (aVar != null) {
            codedOutputByteBufferNano.Y(7, aVar);
        }
        codedOutputByteBufferNano.W(8, this.j);
        super.j(codedOutputByteBufferNano);
    }

    public h51 m() {
        this.c = null;
        this.d = "";
        this.e = "";
        this.f = "";
        this.g = "";
        this.h = "";
        this.i = null;
        this.j = 0;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public h51 e(o34 o34Var) throws IOException {
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
                this.d = o34Var.z();
            } else if (iA == 26) {
                this.e = o34Var.z();
            } else if (iA == 34) {
                this.f = o34Var.z();
            } else if (iA == 42) {
                this.g = o34Var.z();
            } else if (iA == 50) {
                this.h = o34Var.z();
            } else if (iA == 58) {
                if (this.i == null) {
                    this.i = new j51.a();
                }
                o34Var.q(this.i);
            } else if (iA == 64) {
                this.j = o34Var.p();
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
