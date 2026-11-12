package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class h11 extends ak8<h11> {
    public w01 c;

    public h11() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b();
        w01 w01Var = this.c;
        return w01Var != null ? iB + CodedOutputByteBufferNano.n(1, w01Var) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        w01 w01Var = this.c;
        if (w01Var != null) {
            codedOutputByteBufferNano.Y(1, w01Var);
        }
        super.j(codedOutputByteBufferNano);
    }

    public h11 m() {
        this.c = null;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public h11 e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 10) {
                if (this.c == null) {
                    this.c = new w01();
                }
                o34Var.q(this.c);
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
