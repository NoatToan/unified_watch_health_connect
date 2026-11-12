package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class qxo extends ak8<qxo> {
    public static volatile qxo[] i;
    public int c;
    public t64[] d;
    public int e;
    public int f;
    public boolean g;
    public String h;

    public static final class a extends ak8<a> {
        public qxo[] c;

        public a() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            int iB = super.b();
            qxo[] qxoVarArr = this.c;
            if (qxoVarArr != null && qxoVarArr.length > 0) {
                int i = 0;
                while (true) {
                    qxo[] qxoVarArr2 = this.c;
                    if (i >= qxoVarArr2.length) {
                        break;
                    }
                    qxo qxoVar = qxoVarArr2[i];
                    if (qxoVar != null) {
                        iB += CodedOutputByteBufferNano.n(1, qxoVar);
                    }
                    i++;
                }
            }
            return iB;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            qxo[] qxoVarArr = this.c;
            if (qxoVarArr != null && qxoVarArr.length > 0) {
                int i = 0;
                while (true) {
                    qxo[] qxoVarArr2 = this.c;
                    if (i >= qxoVarArr2.length) {
                        break;
                    }
                    qxo qxoVar = qxoVarArr2[i];
                    if (qxoVar != null) {
                        codedOutputByteBufferNano.Y(1, qxoVar);
                    }
                    i++;
                }
            }
            super.j(codedOutputByteBufferNano);
        }

        public a m() {
            this.c = qxo.n();
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
                    qxo[] qxoVarArr = this.c;
                    int length = qxoVarArr == null ? 0 : qxoVarArr.length;
                    int i = iA2 + length;
                    qxo[] qxoVarArr2 = new qxo[i];
                    if (length != 0) {
                        System.arraycopy(qxoVarArr, 0, qxoVarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        qxo qxoVar = new qxo();
                        qxoVarArr2[length] = qxoVar;
                        o34Var.q(qxoVar);
                        o34Var.A();
                        length++;
                    }
                    qxo qxoVar2 = new qxo();
                    qxoVarArr2[length] = qxoVar2;
                    o34Var.q(qxoVar2);
                    this.c = qxoVarArr2;
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public static final class b extends ak8<b> {
        public int[] c;

        public b() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            int iB = super.b();
            int[] iArr = this.c;
            if (iArr == null || iArr.length <= 0) {
                return iB;
            }
            int i = 0;
            int iM = 0;
            while (true) {
                int[] iArr2 = this.c;
                if (i >= iArr2.length) {
                    return iB + iM + iArr2.length;
                }
                iM += CodedOutputByteBufferNano.m(iArr2[i]);
                i++;
            }
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            int[] iArr = this.c;
            if (iArr != null && iArr.length > 0) {
                int i = 0;
                while (true) {
                    int[] iArr2 = this.c;
                    if (i >= iArr2.length) {
                        break;
                    }
                    codedOutputByteBufferNano.W(1, iArr2[i]);
                    i++;
                }
            }
            super.j(codedOutputByteBufferNano);
        }

        public b m() {
            this.c = bmr.f4377a;
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
                if (iA == 8) {
                    int iA2 = bmr.a(o34Var, 8);
                    int[] iArr = new int[iA2];
                    int i = 0;
                    for (int i2 = 0; i2 < iA2; i2++) {
                        if (i2 != 0) {
                            o34Var.A();
                        }
                        int iP = o34Var.p();
                        switch (iP) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                            case 12:
                            case 13:
                            case 14:
                            case 15:
                            case 16:
                            case 17:
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                                iArr[i] = iP;
                                i++;
                                break;
                        }
                    }
                    if (i != 0) {
                        int[] iArr2 = this.c;
                        int length = iArr2 == null ? 0 : iArr2.length;
                        if (length == 0 && i == iA2) {
                            this.c = iArr;
                        } else {
                            int[] iArr3 = new int[length + i];
                            if (length != 0) {
                                System.arraycopy(iArr2, 0, iArr3, 0, length);
                            }
                            System.arraycopy(iArr, 0, iArr3, length, i);
                            this.c = iArr3;
                        }
                    }
                } else if (iA == 10) {
                    int iJ = o34Var.j(o34Var.v());
                    int iF = o34Var.f();
                    int i3 = 0;
                    while (o34Var.d() > 0) {
                        switch (o34Var.p()) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                            case 12:
                            case 13:
                            case 14:
                            case 15:
                            case 16:
                            case 17:
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                                i3++;
                                break;
                        }
                    }
                    if (i3 != 0) {
                        o34Var.E(iF);
                        int[] iArr4 = this.c;
                        int length2 = iArr4 == null ? 0 : iArr4.length;
                        int[] iArr5 = new int[i3 + length2];
                        if (length2 != 0) {
                            System.arraycopy(iArr4, 0, iArr5, 0, length2);
                        }
                        while (o34Var.d() > 0) {
                            int iP2 = o34Var.p();
                            switch (iP2) {
                                case 0:
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                case 8:
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                case 13:
                                case 14:
                                case 15:
                                case 16:
                                case 17:
                                case 18:
                                case 19:
                                case 20:
                                case 21:
                                case 22:
                                case 23:
                                case 24:
                                case 25:
                                case 26:
                                case 27:
                                case 28:
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                case 33:
                                    iArr5[length2] = iP2;
                                    length2++;
                                    break;
                            }
                        }
                        this.c = iArr5;
                    }
                    o34Var.i(iJ);
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public qxo() {
        m();
    }

    public static qxo[] n() {
        if (i == null) {
            synchronized (afd.c) {
                try {
                    if (i == null) {
                        i = new qxo[0];
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return i;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b() + CodedOutputByteBufferNano.l(1, this.c);
        t64[] t64VarArr = this.d;
        if (t64VarArr != null && t64VarArr.length > 0) {
            int i2 = 0;
            while (true) {
                t64[] t64VarArr2 = this.d;
                if (i2 >= t64VarArr2.length) {
                    break;
                }
                t64 t64Var = t64VarArr2[i2];
                if (t64Var != null) {
                    iB += CodedOutputByteBufferNano.n(2, t64Var);
                }
                i2++;
            }
        }
        int iL = iB + CodedOutputByteBufferNano.l(3, this.e);
        int i3 = this.f;
        if (i3 != 0) {
            iL += CodedOutputByteBufferNano.y(4, i3);
        }
        int iB2 = iL + CodedOutputByteBufferNano.b(5, this.g);
        return !this.h.equals("") ? iB2 + CodedOutputByteBufferNano.v(6, this.h) : iB2;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.W(1, this.c);
        t64[] t64VarArr = this.d;
        if (t64VarArr != null && t64VarArr.length > 0) {
            int i2 = 0;
            while (true) {
                t64[] t64VarArr2 = this.d;
                if (i2 >= t64VarArr2.length) {
                    break;
                }
                t64 t64Var = t64VarArr2[i2];
                if (t64Var != null) {
                    codedOutputByteBufferNano.Y(2, t64Var);
                }
                i2++;
            }
        }
        codedOutputByteBufferNano.W(3, this.e);
        int i3 = this.f;
        if (i3 != 0) {
            codedOutputByteBufferNano.p0(4, i3);
        }
        codedOutputByteBufferNano.M(5, this.g);
        if (!this.h.equals("")) {
            codedOutputByteBufferNano.m0(6, this.h);
        }
        super.j(codedOutputByteBufferNano);
    }

    public qxo m() {
        this.c = 0;
        this.d = t64.n();
        this.e = 0;
        this.f = 0;
        this.g = false;
        this.h = "";
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public qxo e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 8) {
                int iP = o34Var.p();
                switch (iP) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                        this.c = iP;
                        break;
                }
            } else if (iA == 18) {
                int iA2 = bmr.a(o34Var, 18);
                t64[] t64VarArr = this.d;
                int length = t64VarArr == null ? 0 : t64VarArr.length;
                int i2 = iA2 + length;
                t64[] t64VarArr2 = new t64[i2];
                if (length != 0) {
                    System.arraycopy(t64VarArr, 0, t64VarArr2, 0, length);
                }
                while (length < i2 - 1) {
                    t64 t64Var = new t64();
                    t64VarArr2[length] = t64Var;
                    o34Var.q(t64Var);
                    o34Var.A();
                    length++;
                }
                t64 t64Var2 = new t64();
                t64VarArr2[length] = t64Var2;
                o34Var.q(t64Var2);
                this.d = t64VarArr2;
            } else if (iA == 24) {
                int iP2 = o34Var.p();
                if (iP2 != 15) {
                    switch (iP2) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                            break;
                        default:
                            continue;
                    }
                }
                this.e = iP2;
            } else if (iA == 32) {
                this.f = o34Var.B();
            } else if (iA == 40) {
                this.g = o34Var.k();
            } else if (iA == 50) {
                this.h = o34Var.z();
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
