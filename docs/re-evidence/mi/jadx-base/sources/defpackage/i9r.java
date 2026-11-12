package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class i9r extends ak8<i9r> {
    public h9r c;
    public int d;
    public p64 e;
    public p64 f;
    public p64 g;
    public p64 h;
    public p64 i;
    public b9r.a j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f20918k;

    public i9r() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b();
        h9r h9rVar = this.c;
        if (h9rVar != null) {
            iB += CodedOutputByteBufferNano.n(1, h9rVar);
        }
        int iY = iB + CodedOutputByteBufferNano.y(2, this.d);
        p64 p64Var = this.e;
        if (p64Var != null) {
            iY += CodedOutputByteBufferNano.n(3, p64Var);
        }
        p64 p64Var2 = this.f;
        if (p64Var2 != null) {
            iY += CodedOutputByteBufferNano.n(4, p64Var2);
        }
        p64 p64Var3 = this.g;
        if (p64Var3 != null) {
            iY += CodedOutputByteBufferNano.n(5, p64Var3);
        }
        p64 p64Var4 = this.h;
        if (p64Var4 != null) {
            iY += CodedOutputByteBufferNano.n(6, p64Var4);
        }
        p64 p64Var5 = this.i;
        if (p64Var5 != null) {
            iY += CodedOutputByteBufferNano.n(7, p64Var5);
        }
        b9r.a aVar = this.j;
        if (aVar != null) {
            iY += CodedOutputByteBufferNano.n(8, aVar);
        }
        return Float.floatToIntBits(this.f20918k) != Float.floatToIntBits(0.0f) ? iY + CodedOutputByteBufferNano.j(9, this.f20918k) : iY;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        h9r h9rVar = this.c;
        if (h9rVar != null) {
            codedOutputByteBufferNano.Y(1, h9rVar);
        }
        codedOutputByteBufferNano.p0(2, this.d);
        p64 p64Var = this.e;
        if (p64Var != null) {
            codedOutputByteBufferNano.Y(3, p64Var);
        }
        p64 p64Var2 = this.f;
        if (p64Var2 != null) {
            codedOutputByteBufferNano.Y(4, p64Var2);
        }
        p64 p64Var3 = this.g;
        if (p64Var3 != null) {
            codedOutputByteBufferNano.Y(5, p64Var3);
        }
        p64 p64Var4 = this.h;
        if (p64Var4 != null) {
            codedOutputByteBufferNano.Y(6, p64Var4);
        }
        p64 p64Var5 = this.i;
        if (p64Var5 != null) {
            codedOutputByteBufferNano.Y(7, p64Var5);
        }
        b9r.a aVar = this.j;
        if (aVar != null) {
            codedOutputByteBufferNano.Y(8, aVar);
        }
        if (Float.floatToIntBits(this.f20918k) != Float.floatToIntBits(0.0f)) {
            codedOutputByteBufferNano.U(9, this.f20918k);
        }
        super.j(codedOutputByteBufferNano);
    }

    public i9r m() {
        this.c = null;
        this.d = 0;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.f20918k = 0.0f;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public i9r e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 10) {
                if (this.c == null) {
                    this.c = new h9r();
                }
                o34Var.q(this.c);
            } else if (iA == 16) {
                this.d = o34Var.B();
            } else if (iA == 26) {
                if (this.e == null) {
                    this.e = new p64();
                }
                o34Var.q(this.e);
            } else if (iA == 34) {
                if (this.f == null) {
                    this.f = new p64();
                }
                o34Var.q(this.f);
            } else if (iA == 42) {
                if (this.g == null) {
                    this.g = new p64();
                }
                o34Var.q(this.g);
            } else if (iA == 50) {
                if (this.h == null) {
                    this.h = new p64();
                }
                o34Var.q(this.h);
            } else if (iA == 58) {
                if (this.i == null) {
                    this.i = new p64();
                }
                o34Var.q(this.i);
            } else if (iA == 66) {
                if (this.j == null) {
                    this.j = new b9r.a();
                }
                o34Var.q(this.j);
            } else if (iA == 77) {
                this.f20918k = o34Var.o();
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
