package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class xgo extends ak8<xgo> {
    public int c = 0;
    public Object d;

    public xgo() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b();
        if (this.c == 1) {
            iB += CodedOutputByteBufferNano.n(1, (dsf) this.d);
        }
        if (this.c == 2) {
            iB += CodedOutputByteBufferNano.n(2, (dsf) this.d);
        }
        if (this.c == 3) {
            iB += CodedOutputByteBufferNano.v(3, (String) this.d);
        }
        return this.c == 4 ? iB + CodedOutputByteBufferNano.n(4, (dsf) this.d) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (this.c == 1) {
            codedOutputByteBufferNano.Y(1, (dsf) this.d);
        }
        if (this.c == 2) {
            codedOutputByteBufferNano.Y(2, (dsf) this.d);
        }
        if (this.c == 3) {
            codedOutputByteBufferNano.m0(3, (String) this.d);
        }
        if (this.c == 4) {
            codedOutputByteBufferNano.Y(4, (dsf) this.d);
        }
        super.j(codedOutputByteBufferNano);
    }

    public xgo m() {
        n();
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    public xgo n() {
        this.c = 0;
        this.d = null;
        return this;
    }

    public zgo.a o() {
        if (this.c == 4) {
            return (zgo.a) this.d;
        }
        return null;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public xgo e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 10) {
                if (this.c != 1) {
                    this.d = new ygo();
                }
                o34Var.q((dsf) this.d);
                this.c = 1;
            } else if (iA == 18) {
                if (this.c != 2) {
                    this.d = new ygo.a();
                }
                o34Var.q((dsf) this.d);
                this.c = 2;
            } else if (iA == 26) {
                this.d = o34Var.z();
                this.c = 3;
            } else if (iA == 34) {
                if (this.c != 4) {
                    this.d = new zgo.a();
                }
                o34Var.q((dsf) this.d);
                this.c = 4;
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }

    public xgo q(ygo ygoVar) {
        ygoVar.getClass();
        this.c = 1;
        this.d = ygoVar;
        return this;
    }

    public xgo r(ygo.a aVar) {
        aVar.getClass();
        this.c = 2;
        this.d = aVar;
        return this;
    }

    public xgo s(zgo.a aVar) {
        aVar.getClass();
        this.c = 4;
        this.d = aVar;
        return this;
    }

    public xgo t(String str) {
        this.c = 3;
        this.d = str;
        return this;
    }
}
