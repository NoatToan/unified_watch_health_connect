package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class acp extends ak8<acp> {
    public static volatile acp[] h;
    public String c;
    public byte[] d;
    public int e;
    public boolean f;
    public String g;

    public static final class a extends ak8<a> {
        public acp[] c;

        public a() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            int iB = super.b();
            acp[] acpVarArr = this.c;
            if (acpVarArr != null && acpVarArr.length > 0) {
                int i = 0;
                while (true) {
                    acp[] acpVarArr2 = this.c;
                    if (i >= acpVarArr2.length) {
                        break;
                    }
                    acp acpVar = acpVarArr2[i];
                    if (acpVar != null) {
                        iB += CodedOutputByteBufferNano.n(1, acpVar);
                    }
                    i++;
                }
            }
            return iB;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            acp[] acpVarArr = this.c;
            if (acpVarArr != null && acpVarArr.length > 0) {
                int i = 0;
                while (true) {
                    acp[] acpVarArr2 = this.c;
                    if (i >= acpVarArr2.length) {
                        break;
                    }
                    acp acpVar = acpVarArr2[i];
                    if (acpVar != null) {
                        codedOutputByteBufferNano.Y(1, acpVar);
                    }
                    i++;
                }
            }
            super.j(codedOutputByteBufferNano);
        }

        public a m() {
            this.c = acp.n();
            this.f1122b = null;
            this.f15887a = -1;
            return this;
        }

        @Override // defpackage.dsf
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public a e(o34 o34Var) throws IOException {
            while (true) {
                int iA = o34Var.A();
                if (iA == 0) {
                    return this;
                }
                if (iA == 10) {
                    int iA2 = bmr.a(o34Var, 10);
                    acp[] acpVarArr = this.c;
                    int length = acpVarArr == null ? 0 : acpVarArr.length;
                    int i = iA2 + length;
                    acp[] acpVarArr2 = new acp[i];
                    if (length != 0) {
                        System.arraycopy(acpVarArr, 0, acpVarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        acp acpVar = new acp();
                        acpVarArr2[length] = acpVar;
                        o34Var.q(acpVar);
                        o34Var.A();
                        length++;
                    }
                    acp acpVar2 = new acp();
                    acpVarArr2[length] = acpVar2;
                    o34Var.q(acpVar2);
                    this.c = acpVarArr2;
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public acp() {
        m();
    }

    public static acp[] n() {
        if (h == null) {
            synchronized (afd.c) {
                try {
                    if (h == null) {
                        h = new acp[0];
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return h;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b() + CodedOutputByteBufferNano.v(1, this.c) + CodedOutputByteBufferNano.d(2, this.d) + CodedOutputByteBufferNano.y(3, this.e) + CodedOutputByteBufferNano.b(4, this.f);
        return !this.g.equals("") ? iB + CodedOutputByteBufferNano.v(5, this.g) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.m0(1, this.c);
        codedOutputByteBufferNano.O(2, this.d);
        codedOutputByteBufferNano.p0(3, this.e);
        codedOutputByteBufferNano.M(4, this.f);
        if (!this.g.equals("")) {
            codedOutputByteBufferNano.m0(5, this.g);
        }
        super.j(codedOutputByteBufferNano);
    }

    public acp m() {
        this.c = "";
        this.d = bmr.h;
        this.e = 0;
        this.f = false;
        this.g = "";
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public acp e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 10) {
                this.c = o34Var.z();
            } else if (iA == 18) {
                this.d = o34Var.l();
            } else if (iA == 24) {
                this.e = o34Var.B();
            } else if (iA == 32) {
                this.f = o34Var.k();
            } else if (iA == 42) {
                this.g = o34Var.z();
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
