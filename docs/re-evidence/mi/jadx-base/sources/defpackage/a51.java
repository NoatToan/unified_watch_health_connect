package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportSummary;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class a51 extends ak8<a51> {
    public static volatile a51[] l;
    public int c;
    public f51 d;
    public h51 e;
    public g51 f;
    public y41 g;
    public e51 h;
    public int i;
    public x41.a j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public c51 f624k;

    public static final class a extends ak8<a> {
        public a51[] c;

        public a() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            int iB = super.b();
            a51[] a51VarArr = this.c;
            if (a51VarArr != null && a51VarArr.length > 0) {
                int i = 0;
                while (true) {
                    a51[] a51VarArr2 = this.c;
                    if (i >= a51VarArr2.length) {
                        break;
                    }
                    a51 a51Var = a51VarArr2[i];
                    if (a51Var != null) {
                        iB += CodedOutputByteBufferNano.n(1, a51Var);
                    }
                    i++;
                }
            }
            return iB;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            a51[] a51VarArr = this.c;
            if (a51VarArr != null && a51VarArr.length > 0) {
                int i = 0;
                while (true) {
                    a51[] a51VarArr2 = this.c;
                    if (i >= a51VarArr2.length) {
                        break;
                    }
                    a51 a51Var = a51VarArr2[i];
                    if (a51Var != null) {
                        codedOutputByteBufferNano.Y(1, a51Var);
                    }
                    i++;
                }
            }
            super.j(codedOutputByteBufferNano);
        }

        public a m() {
            this.c = a51.n();
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
                    a51[] a51VarArr = this.c;
                    int length = a51VarArr == null ? 0 : a51VarArr.length;
                    int i = iA2 + length;
                    a51[] a51VarArr2 = new a51[i];
                    if (length != 0) {
                        System.arraycopy(a51VarArr, 0, a51VarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        a51 a51Var = new a51();
                        a51VarArr2[length] = a51Var;
                        o34Var.q(a51Var);
                        o34Var.A();
                        length++;
                    }
                    a51 a51Var2 = new a51();
                    a51VarArr2[length] = a51Var2;
                    o34Var.q(a51Var2);
                    this.c = a51VarArr2;
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public a51() {
        m();
    }

    public static a51[] n() {
        if (l == null) {
            synchronized (afd.c) {
                try {
                    if (l == null) {
                        l = new a51[0];
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return l;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b() + CodedOutputByteBufferNano.l(1, this.c);
        f51 f51Var = this.d;
        if (f51Var != null) {
            iB += CodedOutputByteBufferNano.n(2, f51Var);
        }
        h51 h51Var = this.e;
        if (h51Var != null) {
            iB += CodedOutputByteBufferNano.n(3, h51Var);
        }
        g51 g51Var = this.f;
        if (g51Var != null) {
            iB += CodedOutputByteBufferNano.n(4, g51Var);
        }
        y41 y41Var = this.g;
        if (y41Var != null) {
            iB += CodedOutputByteBufferNano.n(5, y41Var);
        }
        e51 e51Var = this.h;
        if (e51Var != null) {
            iB += CodedOutputByteBufferNano.n(6, e51Var);
        }
        int i = this.i;
        if (i != 0) {
            iB += CodedOutputByteBufferNano.l(7, i);
        }
        x41.a aVar = this.j;
        if (aVar != null) {
            iB += CodedOutputByteBufferNano.n(12, aVar);
        }
        c51 c51Var = this.f624k;
        return c51Var != null ? iB + CodedOutputByteBufferNano.n(13, c51Var) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.W(1, this.c);
        f51 f51Var = this.d;
        if (f51Var != null) {
            codedOutputByteBufferNano.Y(2, f51Var);
        }
        h51 h51Var = this.e;
        if (h51Var != null) {
            codedOutputByteBufferNano.Y(3, h51Var);
        }
        g51 g51Var = this.f;
        if (g51Var != null) {
            codedOutputByteBufferNano.Y(4, g51Var);
        }
        y41 y41Var = this.g;
        if (y41Var != null) {
            codedOutputByteBufferNano.Y(5, y41Var);
        }
        e51 e51Var = this.h;
        if (e51Var != null) {
            codedOutputByteBufferNano.Y(6, e51Var);
        }
        int i = this.i;
        if (i != 0) {
            codedOutputByteBufferNano.W(7, i);
        }
        x41.a aVar = this.j;
        if (aVar != null) {
            codedOutputByteBufferNano.Y(12, aVar);
        }
        c51 c51Var = this.f624k;
        if (c51Var != null) {
            codedOutputByteBufferNano.Y(13, c51Var);
        }
        super.j(codedOutputByteBufferNano);
    }

    public a51 m() {
        this.c = 0;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = 0;
        this.j = null;
        this.f624k = null;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public a51 e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 8) {
                int iP = o34Var.p();
                if (iP != 0 && iP != 1 && iP != 3) {
                    switch (iP) {
                        case 80:
                        case 81:
                        case 82:
                        case 83:
                        case 84:
                        case 85:
                        case 86:
                        case 87:
                            break;
                        default:
                            switch (iP) {
                                case 257:
                                case SportSummary.VERSION_102 /* 258 */:
                                case SportSummary.VERSION_103 /* 259 */:
                                case 260:
                                case SportSummary.VERSION_105 /* 261 */:
                                case 262:
                                case 263:
                                case 264:
                                case 265:
                                    break;
                                default:
                                    continue;
                            }
                            break;
                    }
                }
                this.c = iP;
            } else if (iA == 18) {
                if (this.d == null) {
                    this.d = new f51();
                }
                o34Var.q(this.d);
            } else if (iA == 26) {
                if (this.e == null) {
                    this.e = new h51();
                }
                o34Var.q(this.e);
            } else if (iA == 34) {
                if (this.f == null) {
                    this.f = new g51();
                }
                o34Var.q(this.f);
            } else if (iA == 42) {
                if (this.g == null) {
                    this.g = new y41();
                }
                o34Var.q(this.g);
            } else if (iA == 50) {
                if (this.h == null) {
                    this.h = new e51();
                }
                o34Var.q(this.h);
            } else if (iA == 56) {
                int iP2 = o34Var.p();
                if (iP2 == 0 || iP2 == 1) {
                    this.i = iP2;
                }
            } else if (iA == 98) {
                if (this.j == null) {
                    this.j = new x41.a();
                }
                o34Var.q(this.j);
            } else if (iA == 106) {
                if (this.f624k == null) {
                    this.f624k = new c51();
                }
                o34Var.q(this.f624k);
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
