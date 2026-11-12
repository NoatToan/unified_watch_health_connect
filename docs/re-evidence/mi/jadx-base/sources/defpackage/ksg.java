package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class ksg extends ak8<ksg> {
    public static volatile ksg[] e;
    public int c;
    public byte[][] d;

    public static final class a extends ak8<a> {
        public ksg[] c;

        public a() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            int iB = super.b();
            ksg[] ksgVarArr = this.c;
            if (ksgVarArr != null && ksgVarArr.length > 0) {
                int i = 0;
                while (true) {
                    ksg[] ksgVarArr2 = this.c;
                    if (i >= ksgVarArr2.length) {
                        break;
                    }
                    ksg ksgVar = ksgVarArr2[i];
                    if (ksgVar != null) {
                        iB += CodedOutputByteBufferNano.n(1, ksgVar);
                    }
                    i++;
                }
            }
            return iB;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            ksg[] ksgVarArr = this.c;
            if (ksgVarArr != null && ksgVarArr.length > 0) {
                int i = 0;
                while (true) {
                    ksg[] ksgVarArr2 = this.c;
                    if (i >= ksgVarArr2.length) {
                        break;
                    }
                    ksg ksgVar = ksgVarArr2[i];
                    if (ksgVar != null) {
                        codedOutputByteBufferNano.Y(1, ksgVar);
                    }
                    i++;
                }
            }
            super.j(codedOutputByteBufferNano);
        }

        public a m() {
            this.c = ksg.n();
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
                    ksg[] ksgVarArr = this.c;
                    int length = ksgVarArr == null ? 0 : ksgVarArr.length;
                    int i = iA2 + length;
                    ksg[] ksgVarArr2 = new ksg[i];
                    if (length != 0) {
                        System.arraycopy(ksgVarArr, 0, ksgVarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        ksg ksgVar = new ksg();
                        ksgVarArr2[length] = ksgVar;
                        o34Var.q(ksgVar);
                        o34Var.A();
                        length++;
                    }
                    ksg ksgVar2 = new ksg();
                    ksgVarArr2[length] = ksgVar2;
                    o34Var.q(ksgVar2);
                    this.c = ksgVarArr2;
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public ksg() {
        m();
    }

    public static ksg[] n() {
        if (e == null) {
            synchronized (afd.c) {
                try {
                    if (e == null) {
                        e = new ksg[0];
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return e;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b() + CodedOutputByteBufferNano.y(1, this.c);
        byte[][] bArr = this.d;
        if (bArr == null || bArr.length <= 0) {
            return iB;
        }
        int i = 0;
        int iE = 0;
        int i2 = 0;
        while (true) {
            byte[][] bArr2 = this.d;
            if (i >= bArr2.length) {
                return iB + iE + i2;
            }
            byte[] bArr3 = bArr2[i];
            if (bArr3 != null) {
                i2++;
                iE += CodedOutputByteBufferNano.e(bArr3);
            }
            i++;
        }
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.p0(1, this.c);
        byte[][] bArr = this.d;
        if (bArr != null && bArr.length > 0) {
            int i = 0;
            while (true) {
                byte[][] bArr2 = this.d;
                if (i >= bArr2.length) {
                    break;
                }
                byte[] bArr3 = bArr2[i];
                if (bArr3 != null) {
                    codedOutputByteBufferNano.O(2, bArr3);
                }
                i++;
            }
        }
        super.j(codedOutputByteBufferNano);
    }

    public ksg m() {
        this.c = 0;
        this.d = bmr.g;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public ksg e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 8) {
                this.c = o34Var.B();
            } else if (iA == 18) {
                int iA2 = bmr.a(o34Var, 18);
                byte[][] bArr = this.d;
                int length = bArr == null ? 0 : bArr.length;
                int i = iA2 + length;
                byte[][] bArr2 = new byte[i][];
                if (length != 0) {
                    System.arraycopy(bArr, 0, bArr2, 0, length);
                }
                while (length < i - 1) {
                    bArr2[length] = o34Var.l();
                    o34Var.A();
                    length++;
                }
                bArr2[length] = o34Var.l();
                this.d = bArr2;
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
