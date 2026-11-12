package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class jyo extends ak8<jyo> {
    public static volatile jyo[] f;
    public int c;
    public int d;
    public kyo[] e;

    public static final class a extends ak8<a> {
        public int c;
        public int d;
        public int e;

        public a() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            return super.b() + CodedOutputByteBufferNano.y(1, this.c) + CodedOutputByteBufferNano.y(2, this.d) + CodedOutputByteBufferNano.y(3, this.e);
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.p0(1, this.c);
            codedOutputByteBufferNano.p0(2, this.d);
            codedOutputByteBufferNano.p0(3, this.e);
            super.j(codedOutputByteBufferNano);
        }

        public a m() {
            this.c = 0;
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
                if (iA == 8) {
                    this.c = o34Var.B();
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

    public static final class b extends ak8<b> {
        public jyo[] c;
        public boolean d;
        public a e;

        public b() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            int iB = super.b();
            jyo[] jyoVarArr = this.c;
            if (jyoVarArr != null && jyoVarArr.length > 0) {
                int i = 0;
                while (true) {
                    jyo[] jyoVarArr2 = this.c;
                    if (i >= jyoVarArr2.length) {
                        break;
                    }
                    jyo jyoVar = jyoVarArr2[i];
                    if (jyoVar != null) {
                        iB += CodedOutputByteBufferNano.n(1, jyoVar);
                    }
                    i++;
                }
            }
            boolean z = this.d;
            if (z) {
                iB += CodedOutputByteBufferNano.b(2, z);
            }
            a aVar = this.e;
            return aVar != null ? iB + CodedOutputByteBufferNano.n(3, aVar) : iB;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            jyo[] jyoVarArr = this.c;
            if (jyoVarArr != null && jyoVarArr.length > 0) {
                int i = 0;
                while (true) {
                    jyo[] jyoVarArr2 = this.c;
                    if (i >= jyoVarArr2.length) {
                        break;
                    }
                    jyo jyoVar = jyoVarArr2[i];
                    if (jyoVar != null) {
                        codedOutputByteBufferNano.Y(1, jyoVar);
                    }
                    i++;
                }
            }
            boolean z = this.d;
            if (z) {
                codedOutputByteBufferNano.M(2, z);
            }
            a aVar = this.e;
            if (aVar != null) {
                codedOutputByteBufferNano.Y(3, aVar);
            }
            super.j(codedOutputByteBufferNano);
        }

        public b m() {
            this.c = jyo.n();
            this.d = false;
            this.e = null;
            this.f1122b = null;
            this.f15887a = -1;
            return this;
        }

        @Override // defpackage.dsf
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public b e(o34 o34Var) throws IOException {
            while (true) {
                int iA = o34Var.A();
                if (iA == 0) {
                    return this;
                }
                if (iA == 10) {
                    int iA2 = bmr.a(o34Var, 10);
                    jyo[] jyoVarArr = this.c;
                    int length = jyoVarArr == null ? 0 : jyoVarArr.length;
                    int i = iA2 + length;
                    jyo[] jyoVarArr2 = new jyo[i];
                    if (length != 0) {
                        System.arraycopy(jyoVarArr, 0, jyoVarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        jyo jyoVar = new jyo();
                        jyoVarArr2[length] = jyoVar;
                        o34Var.q(jyoVar);
                        o34Var.A();
                        length++;
                    }
                    jyo jyoVar2 = new jyo();
                    jyoVarArr2[length] = jyoVar2;
                    o34Var.q(jyoVar2);
                    this.c = jyoVarArr2;
                } else if (iA == 16) {
                    this.d = o34Var.k();
                } else if (iA == 26) {
                    if (this.e == null) {
                        this.e = new a();
                    }
                    o34Var.q(this.e);
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public jyo() {
        m();
    }

    public static jyo[] n() {
        if (f == null) {
            synchronized (afd.c) {
                try {
                    if (f == null) {
                        f = new jyo[0];
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
        int iB = super.b() + CodedOutputByteBufferNano.y(1, this.c) + CodedOutputByteBufferNano.l(2, this.d);
        kyo[] kyoVarArr = this.e;
        if (kyoVarArr != null && kyoVarArr.length > 0) {
            int i = 0;
            while (true) {
                kyo[] kyoVarArr2 = this.e;
                if (i >= kyoVarArr2.length) {
                    break;
                }
                kyo kyoVar = kyoVarArr2[i];
                if (kyoVar != null) {
                    iB += CodedOutputByteBufferNano.n(3, kyoVar);
                }
                i++;
            }
        }
        return iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.p0(1, this.c);
        codedOutputByteBufferNano.W(2, this.d);
        kyo[] kyoVarArr = this.e;
        if (kyoVarArr != null && kyoVarArr.length > 0) {
            int i = 0;
            while (true) {
                kyo[] kyoVarArr2 = this.e;
                if (i >= kyoVarArr2.length) {
                    break;
                }
                kyo kyoVar = kyoVarArr2[i];
                if (kyoVar != null) {
                    codedOutputByteBufferNano.Y(3, kyoVar);
                }
                i++;
            }
        }
        super.j(codedOutputByteBufferNano);
    }

    public jyo m() {
        this.c = 0;
        this.d = 1;
        this.e = kyo.n();
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public jyo e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 8) {
                this.c = o34Var.B();
            } else if (iA == 16) {
                int iP = o34Var.p();
                if (iP != 1 && iP != 2) {
                    switch (iP) {
                        case 4:
                        case 8:
                        case 16:
                        case 32:
                        case 64:
                        case 128:
                        case 256:
                        case 512:
                        case 1024:
                        case 2048:
                        case 4096:
                        case 8192:
                        case 16384:
                            break;
                        default:
                            continue;
                    }
                }
                this.d = iP;
            } else if (iA == 26) {
                int iA2 = bmr.a(o34Var, 26);
                kyo[] kyoVarArr = this.e;
                int length = kyoVarArr == null ? 0 : kyoVarArr.length;
                int i = iA2 + length;
                kyo[] kyoVarArr2 = new kyo[i];
                if (length != 0) {
                    System.arraycopy(kyoVarArr, 0, kyoVarArr2, 0, length);
                }
                while (length < i - 1) {
                    kyo kyoVar = new kyo();
                    kyoVarArr2[length] = kyoVar;
                    o34Var.q(kyoVar);
                    o34Var.A();
                    length++;
                }
                kyo kyoVar2 = new kyo();
                kyoVarArr2[length] = kyoVar2;
                o34Var.q(kyoVar2);
                this.e = kyoVarArr2;
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
