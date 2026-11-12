package defpackage;

import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public class jp5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile jp5 f22995b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HashMap<Integer, kp5> f22996a = new HashMap<>();

    public static jp5 c() {
        if (f22995b == null) {
            synchronized (jp5.class) {
                try {
                    if (f22995b == null) {
                        f22995b = new jp5();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f22995b;
    }

    public kp5 a(int i) {
        kp5 kp5Var = this.f22996a.get(Integer.valueOf(i));
        if (kp5Var != null) {
            return kp5Var;
        }
        kp5 kp5VarB = b(i);
        this.f22996a.put(Integer.valueOf(i), kp5VarB);
        return kp5VarB;
    }

    public final kp5 b(int i) {
        if (i == 0) {
            return new kp5(i, 0, 0, 0);
        }
        switch (i) {
            case 20:
                return new kp5(i, kzi.R, bni.F, wii.c);
            case 21:
                return new kp5(i, kzi.H1, bni.o1, wii.f38008a);
            case 22:
                return new kp5(i, kzi.I1, bni.p1, wii.c);
            case 23:
                return new kp5(i, kzi.m2, bni.Q1, wii.d);
            case 24:
                return new kp5(i, kzi.n2, bni.R1, wii.d);
            case 25:
                return new kp5(i, kzi.U, bni.J, wii.f38008a);
            case 26:
                return new kp5(i, kzi.V, bni.K, wii.c);
            case 27:
                return new kp5(i, kzi.j1, bni.B, wii.c);
            case 28:
                return new kp5(i, kzi.z0, bni.m0, wii.c);
            case 29:
                return new kp5(i, kzi.o0, bni.c0, wii.f38009b);
            case 30:
                return new kp5(i, kzi.K2, bni.l2, wii.f38008a);
            case 31:
                return new kp5(i, kzi.D1, bni.l1, wii.f38008a);
            case 32:
                return new kp5(i, kzi.e0, bni.U, wii.f38008a);
            case 33:
                return new kp5(i, kzi.F1, bni.m1, wii.f38008a);
            case 34:
                return new kp5(i, kzi.n1, bni.V0, wii.c);
            case 35:
                return new kp5(i, kzi.C0, bni.p0, wii.f38008a);
            case 36:
                return new kp5(i, kzi.w2, bni.Z1, wii.f38008a);
            default:
                switch (i) {
                    case 38:
                        return new kp5(i, kzi.K1, bni.q1, wii.f38009b);
                    case 39:
                        return new kp5(i, kzi.q1, bni.Y0, wii.f38009b);
                    case 40:
                        return new kp5(i, kzi.G2, bni.g2, wii.f38009b);
                    case 41:
                        return new kp5(i, kzi.h, bni.i2, wii.f38009b);
                    case 42:
                        return new kp5(i, kzi.l2, bni.h2, wii.f38009b);
                    case 43:
                        return new kp5(i, kzi.K, bni.J0, wii.f38009b);
                    case 44:
                        return new kp5(i, kzi.X0, bni.I0, wii.f38009b);
                    case 45:
                        return new kp5(i, kzi.E1, bni.s, wii.f38009b);
                    case 46:
                        return new kp5(i, kzi.i1, bni.S0, wii.f38009b);
                    case 47:
                        return new kp5(i, kzi.H2, bni.X, wii.f38009b);
                    case 48:
                        return new kp5(i, kzi.c0, bni.O, wii.f38009b);
                    case 49:
                        return new kp5(i, kzi.i0, bni.P1, wii.f38009b);
                    case 50:
                        return new kp5(i, kzi.T1, bni.z1, wii.f38009b);
                    case 51:
                        return new kp5(i, kzi.a1, bni.M0, wii.f38009b);
                    case 52:
                        return new kp5(i, kzi.B1, bni.j1, wii.f38009b);
                    case 53:
                        return new kp5(i, kzi.Q1, bni.w1, wii.f38009b);
                    case 54:
                        return new kp5(i, kzi.C1, bni.k1, wii.f38009b);
                    case 55:
                        return new kp5(i, kzi.t1, bni.b1, wii.f38009b);
                    case 56:
                        return new kp5(i, kzi.j, bni.l, wii.f38009b);
                    case 57:
                        return new kp5(i, kzi.r1, bni.Z0, wii.f38009b);
                    case 58:
                        return new kp5(i, kzi.N, bni.C, wii.f38009b);
                    case 59:
                        return new kp5(i, kzi.M, bni.A, wii.f38009b);
                    case 60:
                        return new kp5(i, kzi.g2, bni.K1, wii.f38009b);
                    case 61:
                        return new kp5(i, kzi.O, bni.D, wii.f38009b);
                    case 62:
                        return new kp5(i, kzi.l0, bni.Z, wii.f38009b);
                    case 63:
                        return new kp5(i, kzi.v1, bni.d1, wii.f38009b);
                    case 64:
                        return new kp5(i, kzi.x0, bni.k0, wii.f38009b);
                    case 65:
                        return new kp5(i, kzi.j2, bni.N1, wii.f38009b);
                    case 66:
                        return new kp5(i, kzi.i2, bni.M1, wii.f38009b);
                    case 67:
                        return new kp5(i, kzi.S, bni.H, wii.f38009b);
                    case 68:
                        return new kp5(i, kzi.f, bni.f4398b, wii.f38009b);
                    case 69:
                        return new kp5(i, kzi.u1, bni.c1, wii.f38009b);
                    case 70:
                        return new kp5(i, kzi.F2, bni.f2, wii.f38009b);
                    case 71:
                        return new kp5(i, kzi.d0, bni.S, wii.f38009b);
                    case 72:
                        return new kp5(i, kzi.o, bni.h, wii.f38009b);
                    case 73:
                        return new kp5(i, kzi.I2, bni.j2, wii.f38009b);
                    case 74:
                        return new kp5(i, kzi.Y, bni.N, wii.f38009b);
                    case 75:
                        return new kp5(i, kzi.E, bni.t, wii.f38009b);
                    case 76:
                        return new kp5(i, kzi.P1, bni.v1, wii.f38009b);
                    case 77:
                        return new kp5(i, kzi.t0, bni.g0, wii.f38009b);
                    case 78:
                        return new kp5(i, kzi.y2, bni.b2, wii.f38009b);
                    case 79:
                        return new kp5(i, kzi.d1, bni.O0, wii.f38009b);
                    case 80:
                        return new kp5(i, kzi.A2, bni.d2, wii.f38009b);
                    case 81:
                        return new kp5(i, kzi.f24451k, bni.d, wii.f38009b);
                    case 82:
                        return new kp5(i, kzi.d2, bni.H1, wii.f38009b);
                    case 83:
                        return new kp5(i, kzi.z, bni.o, wii.f38009b);
                    case 84:
                        return new kp5(i, kzi.m, bni.f, wii.f38009b);
                    case 85:
                        return new kp5(i, kzi.h2, bni.L1, wii.f38009b);
                    case 86:
                        return new kp5(i, kzi.L2, bni.m2, wii.f38009b);
                    case 87:
                        return new kp5(i, kzi.l1, bni.U0, wii.f38009b);
                    case 88:
                        return new kp5(i, kzi.T0, bni.D0, wii.f38009b);
                    case 89:
                        return new kp5(i, kzi.c1, bni.N0, wii.f38009b);
                    case 90:
                        return new kp5(i, kzi.H, bni.w, wii.f38009b);
                    case 91:
                        return new kp5(i, kzi.J2, bni.k2, wii.f38009b);
                    case 92:
                        return new kp5(i, kzi.e1, bni.P0, wii.f38009b);
                    case 93:
                        return new kp5(i, kzi.t2, bni.W1, wii.f38009b);
                    case 94:
                        return new kp5(i, kzi.k1, bni.T0, wii.f38009b);
                    case 95:
                        return new kp5(i, kzi.U0, bni.E0, wii.f38009b);
                    case 96:
                        return new kp5(i, kzi.s2, bni.V1, wii.f38009b);
                    case 97:
                        return new kp5(i, kzi.W0, bni.H0, wii.f38009b);
                    case 98:
                        return new kp5(i, kzi.q0, bni.e0, wii.f38009b);
                    case 99:
                        return new kp5(i, kzi.q2, bni.T1, wii.f38009b);
                    case 100:
                        return new kp5(i, kzi.j0, bni.W, wii.f38009b);
                    case 101:
                        return new kp5(i, kzi.n0, bni.b0, wii.f38009b);
                    case 102:
                    case 141:
                        return new kp5(i, kzi.v, bni.j, wii.f38009b);
                    case 103:
                        return new kp5(i, kzi.z2, bni.c2, wii.f38009b);
                    case 104:
                        return new kp5(i, kzi.p, bni.i, wii.f38009b);
                    case 105:
                        return new kp5(i, kzi.Y1, bni.E1, wii.f38009b);
                    case 106:
                        return new kp5(i, kzi.G1, bni.n1, wii.f38009b);
                    case 107:
                        return new kp5(i, kzi.G0, bni.r0, wii.f38009b);
                    case 108:
                        return new kp5(i, kzi.w1, bni.e1, wii.f38009b);
                    case 109:
                        return new kp5(i, kzi.l, bni.e, wii.f38009b);
                    case 110:
                        return new kp5(i, kzi.u2, bni.X1, wii.f38009b);
                    case 111:
                        return new kp5(i, kzi.Q, bni.E, wii.f38009b);
                    case 112:
                        return new kp5(i, kzi.y0, bni.l0, wii.f38009b);
                    case 113:
                        return new kp5(i, kzi.G, bni.v, wii.f38009b);
                    case 114:
                        return new kp5(i, kzi.e2, bni.I1, wii.f38009b);
                    case 115:
                        return new kp5(i, kzi.B, bni.q, wii.f38009b);
                    case 116:
                        return new kp5(i, kzi.O1, bni.u1, wii.f38009b);
                    case 117:
                        return new kp5(i, kzi.x, bni.m, wii.f38009b);
                    case 118:
                        return new kp5(i, kzi.y, bni.n, wii.f38009b);
                    case 119:
                        return new kp5(i, kzi.M1, bni.s1, wii.f38009b);
                    case 120:
                        return new kp5(i, kzi.p1, bni.X0, wii.f38009b);
                    case 121:
                        return new kp5(i, kzi.T, bni.I, wii.f38009b);
                    case 122:
                        return new kp5(i, kzi.W1, bni.B1, wii.f38009b);
                    case 123:
                        return new kp5(i, kzi.X1, bni.D1, wii.f38009b);
                    case 124:
                        return new kp5(i, kzi.y1, bni.g1, wii.f38009b);
                    case 125:
                        return new kp5(i, kzi.V1, bni.A1, wii.f38009b);
                    case 126:
                        return new kp5(i, kzi.S1, bni.y1, wii.f38009b);
                    case 127:
                        return new kp5(i, kzi.i, bni.c, wii.f38009b);
                    case 128:
                        return new kp5(i, kzi.X, bni.M, wii.f38009b);
                    case 129:
                        return new kp5(i, kzi.I0, bni.s0, wii.f38009b);
                    case 130:
                        return new kp5(i, kzi.x2, bni.a2, wii.f38009b);
                    case 131:
                        return new kp5(i, kzi.J0, bni.t0, wii.f38009b);
                    case 132:
                        return new kp5(i, kzi.m0, bni.a0, wii.f38009b);
                    case 133:
                        return new kp5(i, kzi.k0, bni.Y, wii.f38009b);
                    case 134:
                        return new kp5(i, kzi.s0, bni.f0, wii.f38009b);
                    case 135:
                        return new kp5(i, kzi.f0, bni.V, wii.f38009b);
                    case 136:
                        return new kp5(i, kzi.v2, bni.Y1, wii.f38009b);
                    case 137:
                        return new kp5(i, kzi.z1, bni.h1, wii.f38009b);
                    case 138:
                        return new kp5(i, kzi.W, bni.L, wii.f38009b);
                    case 139:
                        return new kp5(i, kzi.L0, bni.v0, wii.f38009b);
                    case 140:
                        return new kp5(i, kzi.N0, bni.y0, wii.f38009b);
                    default:
                        switch (i) {
                            case 143:
                            case 147:
                                return new kp5(i, kzi.v0, bni.i0, wii.f38009b);
                            case 144:
                                return new kp5(i, kzi.U1, bni.C1, wii.f38009b);
                            case 145:
                                return new kp5(i, kzi.R1, bni.x1, wii.f38009b);
                            case 146:
                                return new kp5(i, kzi.P, bni.G, wii.f38009b);
                            case 148:
                                return new kp5(i, kzi.P0, bni.z0, wii.f38009b);
                            case 149:
                                return new kp5(i, kzi.b0, bni.R, wii.f38009b);
                            case 150:
                                return new kp5(i, kzi.C, bni.p, wii.f38009b);
                            case 151:
                                return new kp5(i, kzi.B2, bni.n0, wii.f38009b);
                            case 152:
                                return new kp5(i, kzi.a2, bni.G1, wii.f38009b);
                            case 153:
                                return new kp5(i, kzi.k2, bni.O1, wii.f38009b);
                            case 154:
                                return new kp5(i, kzi.f2, bni.J1, wii.f38009b);
                            case 155:
                                return new kp5(i, kzi.H0, bni.o0, wii.f38009b);
                            case 156:
                                return new kp5(i, kzi.s1, bni.a1, wii.f38009b);
                            case 157:
                                return new kp5(i, kzi.w0, bni.j0, wii.f38009b);
                            case 158:
                                return new kp5(i, kzi.Y0, bni.L0, wii.f38009b);
                            case 159:
                                return new kp5(i, kzi.w, bni.f4399k, wii.f38009b);
                            case 160:
                                return new kp5(i, kzi.g1, bni.Q0, wii.f38009b);
                            case 161:
                                return new kp5(i, kzi.C2, bni.e2, wii.f38009b);
                            case 162:
                                return new kp5(i, kzi.F0, bni.q0, wii.f38009b);
                            case 163:
                                return new kp5(i, kzi.x1, bni.f1, wii.f38009b);
                            case 164:
                                return new kp5(i, kzi.I, bni.x, wii.f38009b);
                            case 165:
                                return new kp5(i, kzi.n, bni.g, wii.f38009b);
                            case 166:
                                return new kp5(i, kzi.V0, bni.F0, wii.f38009b);
                            case 167:
                                return new kp5(i, kzi.r2, bni.U1, wii.f38009b);
                            case 168:
                                return new kp5(i, kzi.O0, bni.w0, wii.f38009b);
                            case 169:
                                return new kp5(i, kzi.L1, bni.r1, wii.f38009b);
                            case 170:
                                return new kp5(i, kzi.F, bni.u, wii.f38009b);
                            case 171:
                                return new kp5(i, kzi.S0, bni.C0, wii.f38009b);
                            case 172:
                                return new kp5(i, kzi.a0, bni.Q, wii.f38009b);
                            case 173:
                                return new kp5(i, kzi.Z, bni.P, wii.f38009b);
                            case 174:
                                return new kp5(i, kzi.N1, bni.t1, wii.f38009b);
                            case 175:
                                return new kp5(i, kzi.Z0, bni.K0, wii.f38009b);
                            case 176:
                                return new kp5(i, kzi.p2, bni.S1, wii.f38009b);
                            case 177:
                                return new kp5(i, kzi.Z1, bni.F1, wii.f38009b);
                            case 178:
                                return new kp5(i, kzi.g0, bni.T, wii.f38009b);
                            case 179:
                                return new kp5(i, kzi.R0, bni.B0, wii.f38009b);
                            case 180:
                                return new kp5(i, kzi.L, bni.z, wii.f38009b);
                            case 181:
                                return new kp5(i, kzi.u0, bni.h0, wii.f38009b);
                            case 182:
                                return new kp5(i, kzi.J, bni.y, wii.f38009b);
                            case SportReportBaseParser.ReportType.entryTime /* 183 */:
                                return new kp5(i, kzi.D, bni.f4400r, wii.f38009b);
                            case SportReportBaseParser.ReportType.exitTime /* 184 */:
                                return new kp5(i, kzi.K0, bni.u0, wii.f38009b);
                            case 185:
                                return new kp5(i, kzi.h1, bni.R0, wii.f38009b);
                            case SportReportBaseParser.ReportType.avgDivingDepth /* 186 */:
                                return new kp5(i, kzi.p0, bni.d0, wii.f38009b);
                            case SportReportBaseParser.ReportType.avgAscentRate /* 187 */:
                                return new kp5(i, kzi.A1, bni.i1, wii.f38009b);
                            case SportReportBaseParser.ReportType.avgDescentRate /* 188 */:
                                return new kp5(i, kzi.Q0, bni.A0, wii.f38009b);
                            case SportReportBaseParser.ReportType.descentCount /* 189 */:
                                return new kp5(i, kzi.M0, bni.x0, wii.f38009b);
                            case SportReportBaseParser.ReportType.maxWaterTemperature /* 190 */:
                                return new kp5(i, kzi.o1, bni.W0, wii.f38009b);
                            case SportReportBaseParser.ReportType.minWaterTemperature /* 191 */:
                                return new kp5(i, kzi.m1, bni.G0, wii.f38009b);
                            case 192:
                                return new kp5(i, kzi.f24449a, bni.f4397a, wii.f38009b);
                            default:
                                return new kp5(i, 0, 0, 0);
                        }
                }
        }
    }
}
