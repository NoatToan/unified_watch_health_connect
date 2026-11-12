package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportSummary;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class p01 extends ak8<p01> {
    public static volatile p01[] J;
    public n11 A;
    public n11.a B;
    public j21 C;
    public i21 D;
    public h21 E;
    public f11 F;
    public b11 G;
    public c11 H;
    public g11 I;
    public int c;
    public int d;
    public r11 e;
    public d21 f;
    public y11 g;
    public x11 h;
    public e21 i;
    public a21 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public z11 f29860k;
    public b21 l;
    public v01 m;
    public t11 n;
    public h11 o;
    public c21 p;
    public y01 q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public v11 f29861r;
    public x01 s;
    public u01 t;
    public int u;
    public p11 v;
    public q11 w;
    public o11 x;
    public w11 y;
    public a11 z;

    public static final class a extends ak8<a> {
        public p01[] c;

        public a() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            int iB = super.b();
            p01[] p01VarArr = this.c;
            if (p01VarArr != null && p01VarArr.length > 0) {
                int i = 0;
                while (true) {
                    p01[] p01VarArr2 = this.c;
                    if (i >= p01VarArr2.length) {
                        break;
                    }
                    p01 p01Var = p01VarArr2[i];
                    if (p01Var != null) {
                        iB += CodedOutputByteBufferNano.n(1, p01Var);
                    }
                    i++;
                }
            }
            return iB;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            p01[] p01VarArr = this.c;
            if (p01VarArr != null && p01VarArr.length > 0) {
                int i = 0;
                while (true) {
                    p01[] p01VarArr2 = this.c;
                    if (i >= p01VarArr2.length) {
                        break;
                    }
                    p01 p01Var = p01VarArr2[i];
                    if (p01Var != null) {
                        codedOutputByteBufferNano.Y(1, p01Var);
                    }
                    i++;
                }
            }
            super.j(codedOutputByteBufferNano);
        }

        public a m() {
            this.c = p01.n();
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
                    p01[] p01VarArr = this.c;
                    int length = p01VarArr == null ? 0 : p01VarArr.length;
                    int i = iA2 + length;
                    p01[] p01VarArr2 = new p01[i];
                    if (length != 0) {
                        System.arraycopy(p01VarArr, 0, p01VarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        p01 p01Var = new p01();
                        p01VarArr2[length] = p01Var;
                        o34Var.q(p01Var);
                        o34Var.A();
                        length++;
                    }
                    p01 p01Var2 = new p01();
                    p01VarArr2[length] = p01Var2;
                    o34Var.q(p01Var2);
                    this.c = p01VarArr2;
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public p01() {
        m();
    }

    public static p01[] n() {
        if (J == null) {
            synchronized (afd.c) {
                try {
                    if (J == null) {
                        J = new p01[0];
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return J;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b() + CodedOutputByteBufferNano.l(1, this.c);
        r11 r11Var = this.e;
        if (r11Var != null) {
            iB += CodedOutputByteBufferNano.n(2, r11Var);
        }
        d21 d21Var = this.f;
        if (d21Var != null) {
            iB += CodedOutputByteBufferNano.n(3, d21Var);
        }
        y11 y11Var = this.g;
        if (y11Var != null) {
            iB += CodedOutputByteBufferNano.n(4, y11Var);
        }
        x11 x11Var = this.h;
        if (x11Var != null) {
            iB += CodedOutputByteBufferNano.n(5, x11Var);
        }
        e21 e21Var = this.i;
        if (e21Var != null) {
            iB += CodedOutputByteBufferNano.n(6, e21Var);
        }
        a21 a21Var = this.j;
        if (a21Var != null) {
            iB += CodedOutputByteBufferNano.n(7, a21Var);
        }
        z11 z11Var = this.f29860k;
        if (z11Var != null) {
            iB += CodedOutputByteBufferNano.n(8, z11Var);
        }
        b21 b21Var = this.l;
        if (b21Var != null) {
            iB += CodedOutputByteBufferNano.n(9, b21Var);
        }
        v01 v01Var = this.m;
        if (v01Var != null) {
            iB += CodedOutputByteBufferNano.n(10, v01Var);
        }
        t11 t11Var = this.n;
        if (t11Var != null) {
            iB += CodedOutputByteBufferNano.n(11, t11Var);
        }
        int iY = iB + CodedOutputByteBufferNano.y(13, this.d);
        h11 h11Var = this.o;
        if (h11Var != null) {
            iY += CodedOutputByteBufferNano.n(14, h11Var);
        }
        c21 c21Var = this.p;
        if (c21Var != null) {
            iY += CodedOutputByteBufferNano.n(15, c21Var);
        }
        y01 y01Var = this.q;
        if (y01Var != null) {
            iY += CodedOutputByteBufferNano.n(16, y01Var);
        }
        v11 v11Var = this.f29861r;
        if (v11Var != null) {
            iY += CodedOutputByteBufferNano.n(17, v11Var);
        }
        x01 x01Var = this.s;
        if (x01Var != null) {
            iY += CodedOutputByteBufferNano.n(18, x01Var);
        }
        u01 u01Var = this.t;
        if (u01Var != null) {
            iY += CodedOutputByteBufferNano.n(19, u01Var);
        }
        int i = this.u;
        if (i != 0) {
            iY += CodedOutputByteBufferNano.l(20, i);
        }
        p11 p11Var = this.v;
        if (p11Var != null) {
            iY += CodedOutputByteBufferNano.n(21, p11Var);
        }
        q11 q11Var = this.w;
        if (q11Var != null) {
            iY += CodedOutputByteBufferNano.n(22, q11Var);
        }
        o11 o11Var = this.x;
        if (o11Var != null) {
            iY += CodedOutputByteBufferNano.n(23, o11Var);
        }
        w11 w11Var = this.y;
        if (w11Var != null) {
            iY += CodedOutputByteBufferNano.n(24, w11Var);
        }
        a11 a11Var = this.z;
        if (a11Var != null) {
            iY += CodedOutputByteBufferNano.n(25, a11Var);
        }
        n11 n11Var = this.A;
        if (n11Var != null) {
            iY += CodedOutputByteBufferNano.n(26, n11Var);
        }
        n11.a aVar = this.B;
        if (aVar != null) {
            iY += CodedOutputByteBufferNano.n(27, aVar);
        }
        j21 j21Var = this.C;
        if (j21Var != null) {
            iY += CodedOutputByteBufferNano.n(28, j21Var);
        }
        i21 i21Var = this.D;
        if (i21Var != null) {
            iY += CodedOutputByteBufferNano.n(29, i21Var);
        }
        f11 f11Var = this.F;
        if (f11Var != null) {
            iY += CodedOutputByteBufferNano.n(30, f11Var);
        }
        b11 b11Var = this.G;
        if (b11Var != null) {
            iY += CodedOutputByteBufferNano.n(31, b11Var);
        }
        c11 c11Var = this.H;
        if (c11Var != null) {
            iY += CodedOutputByteBufferNano.n(32, c11Var);
        }
        g11 g11Var = this.I;
        if (g11Var != null) {
            iY += CodedOutputByteBufferNano.n(33, g11Var);
        }
        h21 h21Var = this.E;
        return h21Var != null ? iY + CodedOutputByteBufferNano.n(34, h21Var) : iY;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.W(1, this.c);
        r11 r11Var = this.e;
        if (r11Var != null) {
            codedOutputByteBufferNano.Y(2, r11Var);
        }
        d21 d21Var = this.f;
        if (d21Var != null) {
            codedOutputByteBufferNano.Y(3, d21Var);
        }
        y11 y11Var = this.g;
        if (y11Var != null) {
            codedOutputByteBufferNano.Y(4, y11Var);
        }
        x11 x11Var = this.h;
        if (x11Var != null) {
            codedOutputByteBufferNano.Y(5, x11Var);
        }
        e21 e21Var = this.i;
        if (e21Var != null) {
            codedOutputByteBufferNano.Y(6, e21Var);
        }
        a21 a21Var = this.j;
        if (a21Var != null) {
            codedOutputByteBufferNano.Y(7, a21Var);
        }
        z11 z11Var = this.f29860k;
        if (z11Var != null) {
            codedOutputByteBufferNano.Y(8, z11Var);
        }
        b21 b21Var = this.l;
        if (b21Var != null) {
            codedOutputByteBufferNano.Y(9, b21Var);
        }
        v01 v01Var = this.m;
        if (v01Var != null) {
            codedOutputByteBufferNano.Y(10, v01Var);
        }
        t11 t11Var = this.n;
        if (t11Var != null) {
            codedOutputByteBufferNano.Y(11, t11Var);
        }
        codedOutputByteBufferNano.p0(13, this.d);
        h11 h11Var = this.o;
        if (h11Var != null) {
            codedOutputByteBufferNano.Y(14, h11Var);
        }
        c21 c21Var = this.p;
        if (c21Var != null) {
            codedOutputByteBufferNano.Y(15, c21Var);
        }
        y01 y01Var = this.q;
        if (y01Var != null) {
            codedOutputByteBufferNano.Y(16, y01Var);
        }
        v11 v11Var = this.f29861r;
        if (v11Var != null) {
            codedOutputByteBufferNano.Y(17, v11Var);
        }
        x01 x01Var = this.s;
        if (x01Var != null) {
            codedOutputByteBufferNano.Y(18, x01Var);
        }
        u01 u01Var = this.t;
        if (u01Var != null) {
            codedOutputByteBufferNano.Y(19, u01Var);
        }
        int i = this.u;
        if (i != 0) {
            codedOutputByteBufferNano.W(20, i);
        }
        p11 p11Var = this.v;
        if (p11Var != null) {
            codedOutputByteBufferNano.Y(21, p11Var);
        }
        q11 q11Var = this.w;
        if (q11Var != null) {
            codedOutputByteBufferNano.Y(22, q11Var);
        }
        o11 o11Var = this.x;
        if (o11Var != null) {
            codedOutputByteBufferNano.Y(23, o11Var);
        }
        w11 w11Var = this.y;
        if (w11Var != null) {
            codedOutputByteBufferNano.Y(24, w11Var);
        }
        a11 a11Var = this.z;
        if (a11Var != null) {
            codedOutputByteBufferNano.Y(25, a11Var);
        }
        n11 n11Var = this.A;
        if (n11Var != null) {
            codedOutputByteBufferNano.Y(26, n11Var);
        }
        n11.a aVar = this.B;
        if (aVar != null) {
            codedOutputByteBufferNano.Y(27, aVar);
        }
        j21 j21Var = this.C;
        if (j21Var != null) {
            codedOutputByteBufferNano.Y(28, j21Var);
        }
        i21 i21Var = this.D;
        if (i21Var != null) {
            codedOutputByteBufferNano.Y(29, i21Var);
        }
        f11 f11Var = this.F;
        if (f11Var != null) {
            codedOutputByteBufferNano.Y(30, f11Var);
        }
        b11 b11Var = this.G;
        if (b11Var != null) {
            codedOutputByteBufferNano.Y(31, b11Var);
        }
        c11 c11Var = this.H;
        if (c11Var != null) {
            codedOutputByteBufferNano.Y(32, c11Var);
        }
        g11 g11Var = this.I;
        if (g11Var != null) {
            codedOutputByteBufferNano.Y(33, g11Var);
        }
        h21 h21Var = this.E;
        if (h21Var != null) {
            codedOutputByteBufferNano.Y(34, h21Var);
        }
        super.j(codedOutputByteBufferNano);
    }

    public p01 m() {
        this.c = 0;
        this.d = 0;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.f29860k = null;
        this.l = null;
        this.m = null;
        this.n = null;
        this.o = null;
        this.p = null;
        this.q = null;
        this.f29861r = null;
        this.s = null;
        this.t = null;
        this.u = 0;
        this.v = null;
        this.w = null;
        this.x = null;
        this.y = null;
        this.z = null;
        this.A = null;
        this.B = null;
        this.C = null;
        this.D = null;
        this.E = null;
        this.F = null;
        this.G = null;
        this.H = null;
        this.I = null;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public p01 e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            switch (iA) {
                case 0:
                    return this;
                case 8:
                    int iP = o34Var.p();
                    if (iP != 0 && iP != 1 && iP != 2 && iP != 3 && iP != 4 && iP != 5 && iP != 112 && iP != 113) {
                        switch (iP) {
                            case 80:
                            case 81:
                            case 82:
                            case 83:
                            case 84:
                            case 85:
                            case 86:
                            case 87:
                            case 88:
                            case 89:
                            case 90:
                            case 91:
                                break;
                            default:
                                switch (iP) {
                                    case 256:
                                    case 257:
                                    case SportSummary.VERSION_102 /* 258 */:
                                    case SportSummary.VERSION_103 /* 259 */:
                                    case 260:
                                    case SportSummary.VERSION_105 /* 261 */:
                                    case 262:
                                    case 263:
                                    case 264:
                                    case 265:
                                    case 266:
                                    case 267:
                                    case 268:
                                    case 269:
                                    case 270:
                                    case 271:
                                    case 272:
                                    case 273:
                                    case 274:
                                    case 275:
                                    case 276:
                                    case 277:
                                    case 278:
                                    case 279:
                                    case 280:
                                    case 281:
                                    case 282:
                                    case 283:
                                    case 284:
                                    case 285:
                                    case 286:
                                    case 287:
                                    case 288:
                                    case 289:
                                    case 290:
                                    case 291:
                                    case 292:
                                    case 293:
                                    case 294:
                                        break;
                                    default:
                                        continue;
                                }
                                break;
                        }
                    }
                    this.c = iP;
                    break;
                case 18:
                    if (this.e == null) {
                        this.e = new r11();
                    }
                    o34Var.q(this.e);
                    break;
                case 26:
                    if (this.f == null) {
                        this.f = new d21();
                    }
                    o34Var.q(this.f);
                    break;
                case 34:
                    if (this.g == null) {
                        this.g = new y11();
                    }
                    o34Var.q(this.g);
                    break;
                case 42:
                    if (this.h == null) {
                        this.h = new x11();
                    }
                    o34Var.q(this.h);
                    break;
                case 50:
                    if (this.i == null) {
                        this.i = new e21();
                    }
                    o34Var.q(this.i);
                    break;
                case 58:
                    if (this.j == null) {
                        this.j = new a21();
                    }
                    o34Var.q(this.j);
                    break;
                case 66:
                    if (this.f29860k == null) {
                        this.f29860k = new z11();
                    }
                    o34Var.q(this.f29860k);
                    break;
                case 74:
                    if (this.l == null) {
                        this.l = new b21();
                    }
                    o34Var.q(this.l);
                    break;
                case 82:
                    if (this.m == null) {
                        this.m = new v01();
                    }
                    o34Var.q(this.m);
                    break;
                case 90:
                    if (this.n == null) {
                        this.n = new t11();
                    }
                    o34Var.q(this.n);
                    break;
                case 104:
                    this.d = o34Var.B();
                    break;
                case 114:
                    if (this.o == null) {
                        this.o = new h11();
                    }
                    o34Var.q(this.o);
                    break;
                case 122:
                    if (this.p == null) {
                        this.p = new c21();
                    }
                    o34Var.q(this.p);
                    break;
                case 130:
                    if (this.q == null) {
                        this.q = new y01();
                    }
                    o34Var.q(this.q);
                    break;
                case 138:
                    if (this.f29861r == null) {
                        this.f29861r = new v11();
                    }
                    o34Var.q(this.f29861r);
                    break;
                case 146:
                    if (this.s == null) {
                        this.s = new x01();
                    }
                    o34Var.q(this.s);
                    break;
                case 154:
                    if (this.t == null) {
                        this.t = new u01();
                    }
                    o34Var.q(this.t);
                    break;
                case 160:
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
                            this.u = iP2;
                            break;
                    }
                    break;
                case 170:
                    if (this.v == null) {
                        this.v = new p11();
                    }
                    o34Var.q(this.v);
                    break;
                case 178:
                    if (this.w == null) {
                        this.w = new q11();
                    }
                    o34Var.q(this.w);
                    break;
                case SportReportBaseParser.ReportType.avgDivingDepth /* 186 */:
                    if (this.x == null) {
                        this.x = new o11();
                    }
                    o34Var.q(this.x);
                    break;
                case SportReportBaseParser.ReportType.divingCNS /* 194 */:
                    if (this.y == null) {
                        this.y = new w11();
                    }
                    o34Var.q(this.y);
                    break;
                case 202:
                    if (this.z == null) {
                        this.z = new a11();
                    }
                    o34Var.q(this.z);
                    break;
                case 210:
                    if (this.A == null) {
                        this.A = new n11();
                    }
                    o34Var.q(this.A);
                    break;
                case 218:
                    if (this.B == null) {
                        this.B = new n11.a();
                    }
                    o34Var.q(this.B);
                    break;
                case 226:
                    if (this.C == null) {
                        this.C = new j21();
                    }
                    o34Var.q(this.C);
                    break;
                case 234:
                    if (this.D == null) {
                        this.D = new i21();
                    }
                    o34Var.q(this.D);
                    break;
                case 242:
                    if (this.F == null) {
                        this.F = new f11();
                    }
                    o34Var.q(this.F);
                    break;
                case 250:
                    if (this.G == null) {
                        this.G = new b11();
                    }
                    o34Var.q(this.G);
                    break;
                case SportSummary.VERSION_102 /* 258 */:
                    if (this.H == null) {
                        this.H = new c11();
                    }
                    o34Var.q(this.H);
                    break;
                case 266:
                    if (this.I == null) {
                        this.I = new g11();
                    }
                    o34Var.q(this.I);
                    break;
                case 274:
                    if (this.E == null) {
                        this.E = new h21();
                    }
                    o34Var.q(this.E);
                    break;
                default:
                    if (!l(o34Var, iA)) {
                        return this;
                    }
                    break;
                    break;
            }
        }
    }
}
