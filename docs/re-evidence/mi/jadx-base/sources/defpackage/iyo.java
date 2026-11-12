package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class iyo extends ak8<iyo> {
    public static volatile iyo[] f;
    public int c;
    public boolean d;
    public int e;

    public static final class a extends ak8<a> {
        public iyo[] c;
        public int d;
        public int e;

        public a() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            int iB = super.b();
            iyo[] iyoVarArr = this.c;
            if (iyoVarArr != null && iyoVarArr.length > 0) {
                int i = 0;
                while (true) {
                    iyo[] iyoVarArr2 = this.c;
                    if (i >= iyoVarArr2.length) {
                        break;
                    }
                    iyo iyoVar = iyoVarArr2[i];
                    if (iyoVar != null) {
                        iB += CodedOutputByteBufferNano.n(1, iyoVar);
                    }
                    i++;
                }
            }
            int i2 = this.d;
            if (i2 != 0) {
                iB += CodedOutputByteBufferNano.y(2, i2);
            }
            int i3 = this.e;
            return i3 != 0 ? iB + CodedOutputByteBufferNano.y(3, i3) : iB;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            iyo[] iyoVarArr = this.c;
            if (iyoVarArr != null && iyoVarArr.length > 0) {
                int i = 0;
                while (true) {
                    iyo[] iyoVarArr2 = this.c;
                    if (i >= iyoVarArr2.length) {
                        break;
                    }
                    iyo iyoVar = iyoVarArr2[i];
                    if (iyoVar != null) {
                        codedOutputByteBufferNano.Y(1, iyoVar);
                    }
                    i++;
                }
            }
            int i2 = this.d;
            if (i2 != 0) {
                codedOutputByteBufferNano.p0(2, i2);
            }
            int i3 = this.e;
            if (i3 != 0) {
                codedOutputByteBufferNano.p0(3, i3);
            }
            super.j(codedOutputByteBufferNano);
        }

        public a m() {
            this.c = iyo.n();
            this.d = 0;
            this.e = 0;
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
                    iyo[] iyoVarArr = this.c;
                    int length = iyoVarArr == null ? 0 : iyoVarArr.length;
                    int i = iA2 + length;
                    iyo[] iyoVarArr2 = new iyo[i];
                    if (length != 0) {
                        System.arraycopy(iyoVarArr, 0, iyoVarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        iyo iyoVar = new iyo();
                        iyoVarArr2[length] = iyoVar;
                        o34Var.q(iyoVar);
                        o34Var.A();
                        length++;
                    }
                    iyo iyoVar2 = new iyo();
                    iyoVarArr2[length] = iyoVar2;
                    o34Var.q(iyoVar2);
                    this.c = iyoVarArr2;
                } else if (iA == 16) {
                    this.d = o34Var.B();
                } else if (iA == 24) {
                    this.e = o34Var.B();
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public iyo() {
        m();
    }

    public static iyo[] n() {
        if (f == null) {
            synchronized (afd.c) {
                try {
                    if (f == null) {
                        f = new iyo[0];
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b() + CodedOutputByteBufferNano.y(1, this.c) + CodedOutputByteBufferNano.b(2, this.d);
        int i = this.e;
        return i != 0 ? iB + CodedOutputByteBufferNano.y(3, i) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.p0(1, this.c);
        codedOutputByteBufferNano.M(2, this.d);
        int i = this.e;
        if (i != 0) {
            codedOutputByteBufferNano.p0(3, i);
        }
        super.j(codedOutputByteBufferNano);
    }

    public iyo m() {
        this.c = 0;
        this.d = false;
        this.e = 0;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public iyo e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 8) {
                this.c = o34Var.B();
            } else if (iA == 16) {
                this.d = o34Var.k();
            } else if (iA == 24) {
                this.e = o34Var.B();
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
