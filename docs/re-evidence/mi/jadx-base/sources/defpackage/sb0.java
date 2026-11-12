package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class sb0 extends ak8<sb0> {
    public boolean c;
    public byte[] d;
    public String e;
    public int f;

    public sb0() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b() + CodedOutputByteBufferNano.b(1, this.c);
        if (!Arrays.equals(this.d, bmr.h)) {
            iB += CodedOutputByteBufferNano.d(2, this.d);
        }
        if (!this.e.equals("")) {
            iB += CodedOutputByteBufferNano.v(3, this.e);
        }
        int i = this.f;
        return i != 0 ? iB + CodedOutputByteBufferNano.y(4, i) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.M(1, this.c);
        if (!Arrays.equals(this.d, bmr.h)) {
            codedOutputByteBufferNano.O(2, this.d);
        }
        if (!this.e.equals("")) {
            codedOutputByteBufferNano.m0(3, this.e);
        }
        int i = this.f;
        if (i != 0) {
            codedOutputByteBufferNano.p0(4, i);
        }
        super.j(codedOutputByteBufferNano);
    }

    public sb0 m() {
        this.c = false;
        this.d = bmr.h;
        this.e = "";
        this.f = 0;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public sb0 e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 8) {
                this.c = o34Var.k();
            } else if (iA == 18) {
                this.d = o34Var.l();
            } else if (iA == 26) {
                this.e = o34Var.z();
            } else if (iA == 32) {
                this.f = o34Var.B();
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
