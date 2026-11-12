package li0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import f5.z0;
import i3.e5;
import i3.i7;
import i3.mh;
import kotlin.t1;
import o4.m1;
import p005kotlin.Unit;
import p3.b4;
import p3.c2;
import p3.i2;
import p3.p1;
import p3.p2;
import p3.x1;
import s1.y0;
import s5.x0;
import v62.o1;

/* JADX INFO: loaded from: classes8.dex */
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f112777a;

    static {
        g6.f.a aVar = g6.f.f75994b;
        f112777a = 80;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0120  */
    /* JADX WARN: Code duplicated, block: B:102:0x0124  */
    /* JADX WARN: Code duplicated, block: B:103:0x0126  */
    /* JADX WARN: Code duplicated, block: B:105:0x0129  */
    /* JADX WARN: Code duplicated, block: B:108:0x012d  */
    /* JADX WARN: Code duplicated, block: B:109:0x012f  */
    /* JADX WARN: Code duplicated, block: B:111:0x0133  */
    /* JADX WARN: Code duplicated, block: B:112:0x0135  */
    /* JADX WARN: Code duplicated, block: B:115:0x0159  */
    /* JADX WARN: Code duplicated, block: B:116:0x015c  */
    /* JADX WARN: Code duplicated, block: B:119:0x0186  */
    /* JADX WARN: Code duplicated, block: B:120:0x0188  */
    /* JADX WARN: Code duplicated, block: B:123:0x019a  */
    /* JADX WARN: Code duplicated, block: B:129:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:132:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:135:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:136:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:139:0x0205  */
    /* JADX WARN: Code duplicated, block: B:141:0x020e  */
    /* JADX WARN: Code duplicated, block: B:142:0x0212  */
    /* JADX WARN: Code duplicated, block: B:145:0x0227  */
    /* JADX WARN: Code duplicated, block: B:148:0x0238  */
    /* JADX WARN: Code duplicated, block: B:152:0x0281  */
    /* JADX WARN: Code duplicated, block: B:154:0x0288  */
    /* JADX WARN: Code duplicated, block: B:155:0x028c  */
    /* JADX WARN: Code duplicated, block: B:158:0x0299  */
    /* JADX WARN: Code duplicated, block: B:160:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:163:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:165:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:166:0x0301  */
    /* JADX WARN: Code duplicated, block: B:169:0x030e  */
    /* JADX WARN: Code duplicated, block: B:171:0x031c  */
    /* JADX WARN: Code duplicated, block: B:174:0x032a  */
    /* JADX WARN: Code duplicated, block: B:177:0x0398  */
    /* JADX WARN: Code duplicated, block: B:178:0x03ed  */
    /* JADX WARN: Code duplicated, block: B:180:0x03f8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:183:0x03fe A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:186:0x0408  */
    /* JADX WARN: Code duplicated, block: B:188:0x0410 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:191:0x0415  */
    /* JADX WARN: Code duplicated, block: B:193:0x042e  */
    /* JADX WARN: Code duplicated, block: B:199:0x0451 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:202:0x0459 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:205:0x0463  */
    /* JADX WARN: Code duplicated, block: B:207:0x046b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:210:0x0470  */
    /* JADX WARN: Code duplicated, block: B:212:0x048d  */
    /* JADX WARN: Code duplicated, block: B:216:0x04ad A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:219:0x04b3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:222:0x0504  */
    /* JADX WARN: Code duplicated, block: B:224:0x050b  */
    /* JADX WARN: Code duplicated, block: B:225:0x0511  */
    /* JADX WARN: Code duplicated, block: B:228:0x051e  */
    /* JADX WARN: Code duplicated, block: B:230:0x052c  */
    /* JADX WARN: Code duplicated, block: B:233:0x0562  */
    /* JADX WARN: Code duplicated, block: B:234:0x0564  */
    /* JADX WARN: Code duplicated, block: B:237:0x0572  */
    /* JADX WARN: Code duplicated, block: B:243:0x057f  */
    /* JADX WARN: Code duplicated, block: B:246:0x0589  */
    /* JADX WARN: Code duplicated, block: B:247:0x058b  */
    /* JADX WARN: Code duplicated, block: B:250:0x0593  */
    /* JADX WARN: Code duplicated, block: B:252:0x059a  */
    /* JADX WARN: Code duplicated, block: B:254:0x05df  */
    /* JADX WARN: Code duplicated, block: B:258:0x0602  */
    /* JADX WARN: Code duplicated, block: B:260:0x0608  */
    /* JADX WARN: Code duplicated, block: B:262:0x060e  */
    /* JADX WARN: Code duplicated, block: B:264:0x0614  */
    /* JADX WARN: Code duplicated, block: B:267:0x0627  */
    /* JADX WARN: Code duplicated, block: B:269:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x006d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0072  */
    /* JADX WARN: Code duplicated, block: B:44:0x0076  */
    /* JADX WARN: Code duplicated, block: B:46:0x007e  */
    /* JADX WARN: Code duplicated, block: B:47:0x0081  */
    /* JADX WARN: Code duplicated, block: B:51:0x008a  */
    /* JADX WARN: Code duplicated, block: B:52:0x008f  */
    /* JADX WARN: Code duplicated, block: B:54:0x0095  */
    /* JADX WARN: Code duplicated, block: B:56:0x009b  */
    /* JADX WARN: Code duplicated, block: B:57:0x009e  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:77:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:87:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:88:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:92:0x010e  */
    /* JADX WARN: Code duplicated, block: B:93:0x0110  */
    /* JADX WARN: Code duplicated, block: B:96:0x0119 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:97:0x011b  */
    /* JADX WARN: Code duplicated, block: B:99:0x011e  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(d0 d0Var, f fVar, h4.r rVar, boolean z14, boolean z15, boolean z16, boolean z17, e23.a<Unit> aVar, e23.p<? super p3.m, ? super Integer, Unit> pVar, p3.m mVar, int i14, int i15) {
        int i16;
        boolean z18;
        int i17;
        int i18;
        int i19;
        boolean z19;
        int i24;
        int i25;
        boolean z24;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i34;
        boolean z25;
        p3.o0 o0Var;
        boolean z26;
        e23.a<Unit> aVar2;
        boolean z27;
        boolean z28;
        boolean z29;
        e23.p<? super p3.m, ? super Integer, Unit> pVar2;
        p2 p2VarI0;
        boolean z34;
        boolean z35;
        e23.a<Unit> aVar3;
        e23.p<? super p3.m, ? super Integer, Unit> pVar3;
        Context context;
        boolean z36;
        h4.g gVar;
        boolean z37;
        boolean z38;
        int i35;
        boolean z39;
        boolean z44;
        Object objQ;
        p3.m.a aVar4;
        e23.a<Unit> aVar5;
        z0 z0VarD;
        int iHashCode;
        i2 i2VarA0;
        h4.r rVarC;
        h5.e0.a aVar6;
        e23.a<Unit> aVar7;
        h5.g.a.e eVar;
        h5.g.a.C1623g c1623g;
        h5.g.a.b bVar;
        boolean z45;
        boolean z46;
        h5.g.a.f fVar2;
        c2.u uVar;
        j92.b bVar2;
        boolean z47;
        h4.r.a aVar8;
        s2 s2VarA;
        int iHashCode2;
        i2 i2VarA1;
        h4.r rVarC2;
        j92.c cVar;
        int i36;
        e23.p<? super p3.m, ? super Integer, Unit> pVar4;
        c2.z zVarA;
        int iHashCode3;
        i2 i2VarA2;
        h4.r rVarC3;
        String str;
        j92.f fVar3;
        int i37;
        boolean z48;
        d0 d0Var2;
        f fVar4;
        boolean z49;
        float f14;
        z0 z0VarD2;
        int iHashCode4;
        i2 i2VarA3;
        h4.r rVarC4;
        boolean z54;
        boolean z55;
        boolean z56;
        boolean z57;
        Object objQ2;
        boolean z58;
        p3.o0 o0VarE = mVar.E(-1062424635);
        p3.c<?> cVar2 = o0VarE.f135177b;
        if ((i14 & 6) == 0) {
            i16 = ((i14 & 8) == 0 ? o0VarE.B(d0Var) : o0VarE.r(d0Var) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.r(fVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= o0VarE.B(rVar) ? 256 : 128;
        }
        int i38 = i15 & 8;
        if (i38 == 0) {
            if ((i14 & 3072) == 0) {
                z18 = z14;
                i16 |= o0VarE.h(z18) ? 2048 : 1024;
            }
            i17 = i15 & 16;
            if (i17 != 0) {
                if ((i14 & 24576) == 0) {
                    if (o0VarE.h(z15)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i16 |= i18;
                }
                i19 = i15 & 32;
                if (i19 != 0) {
                    i16 |= 196608;
                    z19 = z16;
                } else {
                    z19 = z16;
                    if ((i14 & 196608) == 0) {
                        if (o0VarE.h(z19)) {
                            i24 = 131072;
                        } else {
                            i24 = 65536;
                        }
                        i16 |= i24;
                    }
                }
                i25 = i15 & 64;
                if (i25 != 0) {
                    i16 |= 1572864;
                    z24 = z17;
                } else {
                    z24 = z17;
                    if ((i14 & 1572864) == 0) {
                        if (o0VarE.h(z24)) {
                            i26 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                        } else {
                            i26 = 524288;
                        }
                        i16 |= i26;
                    }
                }
                i27 = i15 & 128;
                if (i27 != 0) {
                    i16 |= 12582912;
                } else if ((i14 & 12582912) == 0) {
                    if (o0VarE.r(aVar)) {
                        i28 = 8388608;
                    } else {
                        i28 = 4194304;
                    }
                    i16 |= i28;
                }
                i29 = i15 & 256;
                if (i29 != 0) {
                    if ((i14 & 100663296) == 0) {
                        if (o0VarE.r(pVar)) {
                            i30 = 67108864;
                        } else {
                            i30 = 33554432;
                        }
                        i16 |= i30;
                    }
                    i34 = i16;
                    if ((i16 & 38347923) != 38347922) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    if (o0VarE.n(i34 & 1, z25)) {
                        if (i38 != 0) {
                            z18 = false;
                        }
                        if (i17 != 0) {
                            z34 = false;
                        } else {
                            z34 = z15;
                        }
                        if (i19 != 0) {
                            z35 = false;
                        } else {
                            z35 = z19;
                        }
                        if (i25 != 0) {
                            z24 = false;
                        }
                        if (i27 != 0) {
                            aVar3 = null;
                        } else {
                            aVar3 = aVar;
                        }
                        if (i29 != 0) {
                            pVar3 = null;
                        } else {
                            pVar3 = pVar;
                        }
                        x1 x1Var = p3.n.f135158a;
                        context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                        if (((g6.c) o0VarE.A(t1.f91490h)).getF94882b() >= 1.3d) {
                            z36 = true;
                        } else {
                            z36 = false;
                        }
                        h4.d.f81522a.getClass();
                        gVar = h4.d.a.f81528f;
                        z37 = z34;
                        h4.r rVarE = u1.n.e(x2.x(x2.f(rVar, 1.0f), null, 3), am.j.c(d92.b.f58623a, o0VarE), m1.f128891a);
                        if ((i34 & 29360128) == 8388608) {
                            z38 = true;
                        } else {
                            z38 = false;
                        }
                        boolean zR = z38 | o0VarE.r(fVar) | o0VarE.r(context);
                        i35 = i34 & 14;
                        if (i35 != 4 || ((i34 & 8) != 0 && o0VarE.r(d0Var))) {
                            z39 = true;
                        } else {
                            z39 = false;
                        }
                        z44 = zR | z39;
                        objQ = o0VarE.q();
                        aVar4 = p3.m.f135153a;
                        if (z44) {
                            e23.a<Unit> aVar9 = aVar3;
                            objQ = new ho.d0((Object) aVar9, (Object) fVar, (Object) context, (Object) d0Var, 18, (byte) 0);
                            aVar5 = aVar9;
                            o0VarE.K(objQ);
                        } else {
                            aVar4.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                e23.a<Unit> aVar10 = aVar3;
                                objQ = new ho.d0((Object) aVar10, (Object) fVar, (Object) context, (Object) d0Var, 18, (byte) 0);
                                aVar5 = aVar10;
                                o0VarE.K(objQ);
                            } else {
                                aVar5 = aVar3;
                            }
                        }
                        h4.r rVarD = u1.w.d(rVarE, false, null, null, (e23.a) objQ, 15);
                        z0VarD = c2.q.d(gVar, false);
                        iHashCode = Long.hashCode(o0VarE.U);
                        i2VarA0 = o0VarE.a0();
                        rVarC = h4.k.c(rVarD, o0VarE);
                        h5.g.V.getClass();
                        aVar6 = h5.g.a.f81805b;
                        if (cVar2 != null) {
                            p3.p0.l();
                            throw null;
                        }
                        o0VarE.z();
                        aVar7 = aVar5;
                        if (o0VarE.T) {
                            o0VarE.M(aVar6);
                        } else {
                            o0VarE.c();
                        }
                        eVar = h5.g.a.f81810g;
                        b4.c(eVar, z0VarD, o0VarE);
                        c1623g = h5.g.a.f81809f;
                        b4.c(c1623g, i2VarA0, o0VarE);
                        bVar = h5.g.a.f81813j;
                        z45 = z35;
                        if (o0VarE.T) {
                            z46 = z24;
                        } else {
                            z46 = z24;
                            if (!p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                            }
                            fVar2 = h5.g.a.f81807d;
                            b4.c(fVar2, rVarC, o0VarE);
                            uVar = c2.u.f22885a;
                            c2.j jVar = c2.j.f22691a;
                            bVar2 = d92.b.f58625c;
                            bVar2.getClass();
                            j92.e eVar2 = j92.b.f97899b;
                            float f15 = eVar2.f97920e;
                            jVar.getClass();
                            c2.j.i iVarI = c2.j.i(f15);
                            z47 = z18;
                            h4.g.b bVar3 = h4.d.a.f81534l;
                            aVar8 = h4.r.S;
                            bVar2.getClass();
                            h4.r rVarY = c2.l.y(aVar8, eVar2.f97920e);
                            s2VarA = q2.a(iVarI, bVar3, o0VarE, 48);
                            iHashCode2 = Long.hashCode(o0VarE.U);
                            i2VarA1 = o0VarE.a0();
                            rVarC2 = h4.k.c(rVarY, o0VarE);
                            if (cVar2 != null) {
                                p3.p0.l();
                                throw null;
                            }
                            o0VarE.z();
                            if (o0VarE.T) {
                                o0VarE.M(aVar6);
                            } else {
                                o0VarE.c();
                            }
                            b4.c(eVar, s2VarA, o0VarE);
                            b4.c(c1623g, i2VarA1, o0VarE);
                            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                            }
                            b4.c(fVar2, rVarC2, o0VarE);
                            u2 u2Var = u2.f22900a;
                            bVar2.getClass();
                            cVar = j92.b.f97901d;
                            i36 = i34 & 126;
                            c(d0Var, fVar, cVar.f97906e, null, o0VarE, i36);
                            h4.r rVarX = x2.x(u2Var.a(aVar8, 1.0f, true), null, 3);
                            pVar4 = pVar3;
                            zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, o0VarE, 0);
                            iHashCode3 = Long.hashCode(o0VarE.U);
                            i2VarA2 = o0VarE.a0();
                            rVarC3 = h4.k.c(rVarX, o0VarE);
                            if (cVar2 != null) {
                                p3.p0.l();
                                throw null;
                            }
                            o0VarE.z();
                            if (o0VarE.T) {
                                o0VarE.M(aVar6);
                            } else {
                                o0VarE.c();
                            }
                            b4.c(eVar, zVarA, o0VarE);
                            b4.c(c1623g, i2VarA2, o0VarE);
                            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode3))) {
                                v.h.A(iHashCode3, o0VarE, iHashCode3, bVar);
                            }
                            b4.c(fVar2, rVarC3, o0VarE);
                            c2.b0 b0Var = c2.b0.f22601a;
                            str = d0Var.f112651d;
                            boolean z59 = d0Var.f112652e;
                            if (str == null) {
                                str = "";
                            }
                            String str2 = str;
                            fVar3 = d92.b.f58624b;
                            fVar3.getClass();
                            x0 x0Var = j92.f.f97931h;
                            long jD = com.nimbusds.jose.shaded.gson.internal.a.d(o0VarE);
                            d6.p.f57793b.getClass();
                            i37 = d6.p.f57795d;
                            mh.c(str2, null, jD, null, 0L, null, 0L, null, 0L, i37, false, 1, 0, null, x0Var, o0VarE, 0, 24960, 110586);
                            o0Var = o0VarE;
                            if (g22.n.d(d0Var.f112653f)) {
                                o0Var.C(1814213146);
                                String str3 = d0Var.f112653f;
                                fVar3.getClass();
                                mh.c(str3, null, 0L, null, 0L, null, 0L, null, 0L, i37, false, 2, 0, null, x0.a(j92.f.f97933j, vb.h.g(o0Var), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), o0Var, 0, 24960, 110590);
                                o0Var.g0(false);
                            } else {
                                o0Var.C(1814479901);
                                o0Var.g0(false);
                            }
                            if (!(z37 && z59) && z36) {
                                o0Var.C(1814578171);
                                if (pVar4 == null) {
                                    o0Var.C(1814621416);
                                    if (!z45 || z46) {
                                        z48 = true;
                                    } else {
                                        z48 = false;
                                    }
                                    z.f(d0Var, fVar, z48, null, o0Var, i36, 8);
                                    o0Var.g0(false);
                                } else {
                                    o0Var.C(1814741944);
                                    e5.q((i34 >> 24) & 14, pVar4, o0Var, false);
                                }
                                o0Var.g0(false);
                            } else {
                                i36 = i36;
                                o0Var.C(1814826109);
                                o0Var.g0(false);
                            }
                            o0Var.g0(true);
                            if ((z37 && z59) || z36) {
                                d0Var2 = d0Var;
                                fVar4 = fVar;
                                o0Var.C(1846776019);
                                o0Var.g0(false);
                            } else {
                                o0Var.C(1846551145);
                                if (pVar4 == null) {
                                    o0Var.C(1846590918);
                                    if (!z45 || z46) {
                                        z49 = true;
                                    } else {
                                        z49 = false;
                                    }
                                    z.f(d0Var, fVar, z49, null, o0Var, i36, 8);
                                    d0Var2 = d0Var;
                                    fVar4 = fVar;
                                    o0Var.g0(false);
                                } else {
                                    d0Var2 = d0Var;
                                    fVar4 = fVar;
                                    o0Var.C(1846703510);
                                    e5.q((i34 >> 24) & 14, pVar4, o0Var, false);
                                }
                                o0Var.g0(false);
                            }
                            if (!(z37 && z59) && z47) {
                                o0Var.C(1846903274);
                                bVar2.getClass();
                                f14 = cVar.f97904c;
                                h4.r rVarD2 = u1.n.d(x2.q(aVar8, f14), new o4.t1(((o4.d0) d92.b.a(o0Var).d().a().f76496r.getF182175a()).f128833a, null), k2.i.f102406a, 4);
                                z0VarD2 = c2.q.d(h4.d.a.f81524b, false);
                                x1 x1Var2 = p3.n.f135158a;
                                iHashCode4 = Long.hashCode(o0Var.U);
                                i2VarA3 = o0Var.a0();
                                rVarC4 = h4.k.c(rVarD2, o0Var);
                                if (cVar2 == null) {
                                    p3.p0.l();
                                    throw null;
                                }
                                o0Var.z();
                                if (o0Var.T) {
                                    o0Var.M(aVar6);
                                } else {
                                    o0Var.c();
                                }
                                b4.c(eVar, z0VarD2, o0Var);
                                b4.c(c1623g, i2VarA3, o0Var);
                                if (o0Var.T || !p005kotlin.jvm.internal.s.g(o0Var.q(), Integer.valueOf(iHashCode4))) {
                                    v.h.A(iHashCode4, o0Var, iHashCode4, bVar);
                                }
                                b4.c(fVar2, rVarC4, o0Var);
                                u4.d.b bVar4 = u4.d.f168373k;
                                u4.d dVarB = n5.e.b(R.drawable.close_x_thick, o0Var, 6);
                                String strQ = gl1.y.Q(o0Var, R.string.lbl_dismiss);
                                g6.f.a aVar11 = g6.f.f75994b;
                                h4.r rVarQ = x2.q(uVar.c(aVar8, gVar), f14 / 2);
                                String strQ2 = gl1.y.Q(o0Var, R.string.lbl_dismiss);
                                if ((i34 & 458752) == 131072) {
                                    z54 = true;
                                } else {
                                    z54 = false;
                                }
                                boolean zR2 = z54 | o0Var.r(fVar4) | o0Var.r(context);
                                if (i35 != 4 || ((i34 & 8) != 0 && o0Var.r(d0Var2))) {
                                    z55 = true;
                                } else {
                                    z55 = false;
                                }
                                boolean z64 = zR2 | z55;
                                if ((i34 & 3670016) == 1048576) {
                                    z56 = true;
                                } else {
                                    z56 = false;
                                }
                                z57 = z64 | z56;
                                objQ2 = o0Var.q();
                                if (z57) {
                                    objQ2 = new gw1.g(z45, fVar4, context, d0Var2, z46);
                                    o0Var.K(objQ2);
                                } else {
                                    aVar4.getClass();
                                    if (objQ2 == p3.m.a.f135155b) {
                                        objQ2 = new gw1.g(z45, fVar4, context, d0Var2, z46);
                                        o0Var.K(objQ2);
                                    }
                                }
                                p3.o0 o0Var2 = o0Var;
                                i7.b(dVarB, strQ, u1.w.d(rVarQ, false, strQ2, null, (e23.a) objQ2, 13), am.j.d(o0Var), o0Var2, 0, 0);
                                o0Var = o0Var2;
                                z58 = true;
                                o0Var.g0(true);
                                o0Var.g0(false);
                            } else {
                                z58 = true;
                                o0Var.C(1848418771);
                                o0Var.g0(false);
                            }
                            o0Var.g0(z58);
                            o0Var.g0(z58);
                            x1 x1Var3 = p3.n.f135158a;
                            pVar2 = pVar4;
                            z26 = z37;
                            aVar2 = aVar7;
                            z29 = z45;
                            z27 = z46;
                            z28 = z47;
                        }
                        v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                        fVar2 = h5.g.a.f81807d;
                        b4.c(fVar2, rVarC, o0VarE);
                        uVar = c2.u.f22885a;
                        c2.j jVar2 = c2.j.f22691a;
                        bVar2 = d92.b.f58625c;
                        bVar2.getClass();
                        j92.e eVar3 = j92.b.f97899b;
                        float f16 = eVar3.f97920e;
                        jVar2.getClass();
                        c2.j.i iVarI2 = c2.j.i(f16);
                        z47 = z18;
                        h4.g.b bVar5 = h4.d.a.f81534l;
                        aVar8 = h4.r.S;
                        bVar2.getClass();
                        h4.r rVarY2 = c2.l.y(aVar8, eVar3.f97920e);
                        s2VarA = q2.a(iVarI2, bVar5, o0VarE, 48);
                        iHashCode2 = Long.hashCode(o0VarE.U);
                        i2VarA1 = o0VarE.a0();
                        rVarC2 = h4.k.c(rVarY2, o0VarE);
                        if (cVar2 != null) {
                            p3.p0.l();
                            throw null;
                        }
                        o0VarE.z();
                        if (o0VarE.T) {
                            o0VarE.M(aVar6);
                        } else {
                            o0VarE.c();
                        }
                        b4.c(eVar, s2VarA, o0VarE);
                        b4.c(c1623g, i2VarA1, o0VarE);
                        if (o0VarE.T) {
                            v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                        } else {
                            v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                        }
                        b4.c(fVar2, rVarC2, o0VarE);
                        u2 u2Var2 = u2.f22900a;
                        bVar2.getClass();
                        cVar = j92.b.f97901d;
                        i36 = i34 & 126;
                        c(d0Var, fVar, cVar.f97906e, null, o0VarE, i36);
                        h4.r rVarX2 = x2.x(u2Var2.a(aVar8, 1.0f, true), null, 3);
                        pVar4 = pVar3;
                        zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, o0VarE, 0);
                        iHashCode3 = Long.hashCode(o0VarE.U);
                        i2VarA2 = o0VarE.a0();
                        rVarC3 = h4.k.c(rVarX2, o0VarE);
                        if (cVar2 != null) {
                            p3.p0.l();
                            throw null;
                        }
                        o0VarE.z();
                        if (o0VarE.T) {
                            o0VarE.M(aVar6);
                        } else {
                            o0VarE.c();
                        }
                        b4.c(eVar, zVarA, o0VarE);
                        b4.c(c1623g, i2VarA2, o0VarE);
                        if (o0VarE.T) {
                            v.h.A(iHashCode3, o0VarE, iHashCode3, bVar);
                        } else {
                            v.h.A(iHashCode3, o0VarE, iHashCode3, bVar);
                        }
                        b4.c(fVar2, rVarC3, o0VarE);
                        c2.b0 b0Var2 = c2.b0.f22601a;
                        str = d0Var.f112651d;
                        boolean z510 = d0Var.f112652e;
                        if (str == null) {
                            str = "";
                        }
                        String str4 = str;
                        fVar3 = d92.b.f58624b;
                        fVar3.getClass();
                        x0 x0Var2 = j92.f.f97931h;
                        long jD2 = com.nimbusds.jose.shaded.gson.internal.a.d(o0VarE);
                        d6.p.f57793b.getClass();
                        i37 = d6.p.f57795d;
                        mh.c(str4, null, jD2, null, 0L, null, 0L, null, 0L, i37, false, 1, 0, null, x0Var2, o0VarE, 0, 24960, 110586);
                        o0Var = o0VarE;
                        if (g22.n.d(d0Var.f112653f)) {
                            o0Var.C(1814213146);
                            String str5 = d0Var.f112653f;
                            fVar3.getClass();
                            mh.c(str5, null, 0L, null, 0L, null, 0L, null, 0L, i37, false, 2, 0, null, x0.a(j92.f.f97933j, vb.h.g(o0Var), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), o0Var, 0, 24960, 110590);
                            o0Var.g0(false);
                        } else {
                            o0Var.C(1814479901);
                            o0Var.g0(false);
                        }
                        if (z37) {
                            o0Var.C(1814578171);
                            if (pVar4 == null) {
                                o0Var.C(1814621416);
                                if (z45) {
                                    z48 = true;
                                } else {
                                    z48 = true;
                                }
                                z.f(d0Var, fVar, z48, null, o0Var, i36, 8);
                                o0Var.g0(false);
                            } else {
                                o0Var.C(1814741944);
                                e5.q((i34 >> 24) & 14, pVar4, o0Var, false);
                            }
                            o0Var.g0(false);
                        } else {
                            o0Var.C(1814578171);
                            if (pVar4 == null) {
                                o0Var.C(1814621416);
                                if (z45) {
                                    z48 = true;
                                } else {
                                    z48 = true;
                                }
                                z.f(d0Var, fVar, z48, null, o0Var, i36, 8);
                                o0Var.g0(false);
                            } else {
                                o0Var.C(1814741944);
                                e5.q((i34 >> 24) & 14, pVar4, o0Var, false);
                            }
                            o0Var.g0(false);
                        }
                        o0Var.g0(true);
                        if (z37) {
                            o0Var.C(1846551145);
                            if (pVar4 == null) {
                                o0Var.C(1846590918);
                                if (z45) {
                                    z49 = true;
                                } else {
                                    z49 = true;
                                }
                                z.f(d0Var, fVar, z49, null, o0Var, i36, 8);
                                d0Var2 = d0Var;
                                fVar4 = fVar;
                                o0Var.g0(false);
                            } else {
                                d0Var2 = d0Var;
                                fVar4 = fVar;
                                o0Var.C(1846703510);
                                e5.q((i34 >> 24) & 14, pVar4, o0Var, false);
                            }
                            o0Var.g0(false);
                        } else {
                            o0Var.C(1846551145);
                            if (pVar4 == null) {
                                o0Var.C(1846590918);
                                if (z45) {
                                    z49 = true;
                                } else {
                                    z49 = true;
                                }
                                z.f(d0Var, fVar, z49, null, o0Var, i36, 8);
                                d0Var2 = d0Var;
                                fVar4 = fVar;
                                o0Var.g0(false);
                            } else {
                                d0Var2 = d0Var;
                                fVar4 = fVar;
                                o0Var.C(1846703510);
                                e5.q((i34 >> 24) & 14, pVar4, o0Var, false);
                            }
                            o0Var.g0(false);
                        }
                        if (z37) {
                            o0Var.C(1846903274);
                            bVar2.getClass();
                            f14 = cVar.f97904c;
                            h4.r rVarD3 = u1.n.d(x2.q(aVar8, f14), new o4.t1(((o4.d0) d92.b.a(o0Var).d().a().f76496r.getF182175a()).f128833a, null), k2.i.f102406a, 4);
                            z0VarD2 = c2.q.d(h4.d.a.f81524b, false);
                            x1 x1Var4 = p3.n.f135158a;
                            iHashCode4 = Long.hashCode(o0Var.U);
                            i2VarA3 = o0Var.a0();
                            rVarC4 = h4.k.c(rVarD3, o0Var);
                            if (cVar2 == null) {
                                p3.p0.l();
                                throw null;
                            }
                            o0Var.z();
                            if (o0Var.T) {
                                o0Var.M(aVar6);
                            } else {
                                o0Var.c();
                            }
                            b4.c(eVar, z0VarD2, o0Var);
                            b4.c(c1623g, i2VarA3, o0Var);
                            if (o0Var.T) {
                                v.h.A(iHashCode4, o0Var, iHashCode4, bVar);
                            } else {
                                v.h.A(iHashCode4, o0Var, iHashCode4, bVar);
                            }
                            b4.c(fVar2, rVarC4, o0Var);
                            u4.d.b bVar6 = u4.d.f168373k;
                            u4.d dVarB2 = n5.e.b(R.drawable.close_x_thick, o0Var, 6);
                            String strQ3 = gl1.y.Q(o0Var, R.string.lbl_dismiss);
                            g6.f.a aVar12 = g6.f.f75994b;
                            h4.r rVarQ2 = x2.q(uVar.c(aVar8, gVar), f14 / 2);
                            String strQ4 = gl1.y.Q(o0Var, R.string.lbl_dismiss);
                            if ((i34 & 458752) == 131072) {
                                z54 = true;
                            } else {
                                z54 = false;
                            }
                            boolean zR3 = z54 | o0Var.r(fVar4) | o0Var.r(context);
                            if (i35 != 4) {
                                z55 = true;
                            } else {
                                z55 = true;
                            }
                            boolean z65 = zR3 | z55;
                            if ((i34 & 3670016) == 1048576) {
                                z56 = true;
                            } else {
                                z56 = false;
                            }
                            z57 = z65 | z56;
                            objQ2 = o0Var.q();
                            if (z57) {
                                aVar4.getClass();
                                if (objQ2 == p3.m.a.f135155b) {
                                    objQ2 = new gw1.g(z45, fVar4, context, d0Var2, z46);
                                    o0Var.K(objQ2);
                                }
                            } else {
                                objQ2 = new gw1.g(z45, fVar4, context, d0Var2, z46);
                                o0Var.K(objQ2);
                            }
                            p3.o0 o0Var3 = o0Var;
                            i7.b(dVarB2, strQ3, u1.w.d(rVarQ2, false, strQ4, null, (e23.a) objQ2, 13), am.j.d(o0Var), o0Var3, 0, 0);
                            o0Var = o0Var3;
                            z58 = true;
                            o0Var.g0(true);
                            o0Var.g0(false);
                        } else {
                            o0Var.C(1846903274);
                            bVar2.getClass();
                            f14 = cVar.f97904c;
                            h4.r rVarD4 = u1.n.d(x2.q(aVar8, f14), new o4.t1(((o4.d0) d92.b.a(o0Var).d().a().f76496r.getF182175a()).f128833a, null), k2.i.f102406a, 4);
                            z0VarD2 = c2.q.d(h4.d.a.f81524b, false);
                            x1 x1Var5 = p3.n.f135158a;
                            iHashCode4 = Long.hashCode(o0Var.U);
                            i2VarA3 = o0Var.a0();
                            rVarC4 = h4.k.c(rVarD4, o0Var);
                            if (cVar2 == null) {
                                p3.p0.l();
                                throw null;
                            }
                            o0Var.z();
                            if (o0Var.T) {
                                o0Var.M(aVar6);
                            } else {
                                o0Var.c();
                            }
                            b4.c(eVar, z0VarD2, o0Var);
                            b4.c(c1623g, i2VarA3, o0Var);
                            if (o0Var.T) {
                                v.h.A(iHashCode4, o0Var, iHashCode4, bVar);
                            } else {
                                v.h.A(iHashCode4, o0Var, iHashCode4, bVar);
                            }
                            b4.c(fVar2, rVarC4, o0Var);
                            u4.d.b bVar7 = u4.d.f168373k;
                            u4.d dVarB3 = n5.e.b(R.drawable.close_x_thick, o0Var, 6);
                            String strQ5 = gl1.y.Q(o0Var, R.string.lbl_dismiss);
                            g6.f.a aVar13 = g6.f.f75994b;
                            h4.r rVarQ3 = x2.q(uVar.c(aVar8, gVar), f14 / 2);
                            String strQ6 = gl1.y.Q(o0Var, R.string.lbl_dismiss);
                            if ((i34 & 458752) == 131072) {
                                z54 = true;
                            } else {
                                z54 = false;
                            }
                            boolean zR4 = z54 | o0Var.r(fVar4) | o0Var.r(context);
                            if (i35 != 4) {
                                z55 = true;
                            } else {
                                z55 = true;
                            }
                            boolean z66 = zR4 | z55;
                            if ((i34 & 3670016) == 1048576) {
                                z56 = true;
                            } else {
                                z56 = false;
                            }
                            z57 = z66 | z56;
                            objQ2 = o0Var.q();
                            if (z57) {
                                aVar4.getClass();
                                if (objQ2 == p3.m.a.f135155b) {
                                    objQ2 = new gw1.g(z45, fVar4, context, d0Var2, z46);
                                    o0Var.K(objQ2);
                                }
                            } else {
                                objQ2 = new gw1.g(z45, fVar4, context, d0Var2, z46);
                                o0Var.K(objQ2);
                            }
                            p3.o0 o0Var4 = o0Var;
                            i7.b(dVarB3, strQ5, u1.w.d(rVarQ3, false, strQ6, null, (e23.a) objQ2, 13), am.j.d(o0Var), o0Var4, 0, 0);
                            o0Var = o0Var4;
                            z58 = true;
                            o0Var.g0(true);
                            o0Var.g0(false);
                        }
                        o0Var.g0(z58);
                        o0Var.g0(z58);
                        x1 x1Var6 = p3.n.f135158a;
                        pVar2 = pVar4;
                        z26 = z37;
                        aVar2 = aVar7;
                        z29 = z45;
                        z27 = z46;
                        z28 = z47;
                    } else {
                        o0Var = o0VarE;
                        o0Var.e();
                        z26 = z15;
                        aVar2 = aVar;
                        z27 = z24;
                        z28 = z18;
                        z29 = z19;
                        pVar2 = pVar;
                    }
                    p2VarI0 = o0Var.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new com.google.maps.android.compose.streetview.a(d0Var, fVar, rVar, z28, z26, z29, z27, aVar2, pVar2, i14, i15);
                    }
                }
                i16 |= 100663296;
                i34 = i16;
                if ((i16 & 38347923) != 38347922) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                if (o0VarE.n(i34 & 1, z25)) {
                    if (i38 != 0) {
                        z18 = false;
                    }
                    if (i17 != 0) {
                        z34 = false;
                    } else {
                        z34 = z15;
                    }
                    if (i19 != 0) {
                        z35 = false;
                    } else {
                        z35 = z19;
                    }
                    if (i25 != 0) {
                        z24 = false;
                    }
                    if (i27 != 0) {
                        aVar3 = null;
                    } else {
                        aVar3 = aVar;
                    }
                    if (i29 != 0) {
                        pVar3 = null;
                    } else {
                        pVar3 = pVar;
                    }
                    x1 x1Var7 = p3.n.f135158a;
                    context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                    if (((g6.c) o0VarE.A(t1.f91490h)).getF94882b() >= 1.3d) {
                        z36 = true;
                    } else {
                        z36 = false;
                    }
                    h4.d.f81522a.getClass();
                    gVar = h4.d.a.f81528f;
                    z37 = z34;
                    h4.r rVarE2 = u1.n.e(x2.x(x2.f(rVar, 1.0f), null, 3), am.j.c(d92.b.f58623a, o0VarE), m1.f128891a);
                    if ((i34 & 29360128) == 8388608) {
                        z38 = true;
                    } else {
                        z38 = false;
                    }
                    boolean zR5 = z38 | o0VarE.r(fVar) | o0VarE.r(context);
                    i35 = i34 & 14;
                    if (i35 != 4) {
                        z39 = true;
                    } else {
                        z39 = true;
                    }
                    z44 = zR5 | z39;
                    objQ = o0VarE.q();
                    aVar4 = p3.m.f135153a;
                    if (z44) {
                        aVar4.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            e23.a<Unit> aVar14 = aVar3;
                            objQ = new ho.d0((Object) aVar14, (Object) fVar, (Object) context, (Object) d0Var, 18, (byte) 0);
                            aVar5 = aVar14;
                            o0VarE.K(objQ);
                        } else {
                            aVar5 = aVar3;
                        }
                    } else {
                        e23.a<Unit> aVar15 = aVar3;
                        objQ = new ho.d0((Object) aVar15, (Object) fVar, (Object) context, (Object) d0Var, 18, (byte) 0);
                        aVar5 = aVar15;
                        o0VarE.K(objQ);
                    }
                    h4.r rVarD5 = u1.w.d(rVarE2, false, null, null, (e23.a) objQ, 15);
                    z0VarD = c2.q.d(gVar, false);
                    iHashCode = Long.hashCode(o0VarE.U);
                    i2VarA0 = o0VarE.a0();
                    rVarC = h4.k.c(rVarD5, o0VarE);
                    h5.g.V.getClass();
                    aVar6 = h5.g.a.f81805b;
                    if (cVar2 != null) {
                        p3.p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    aVar7 = aVar5;
                    if (o0VarE.T) {
                        o0VarE.M(aVar6);
                    } else {
                        o0VarE.c();
                    }
                    eVar = h5.g.a.f81810g;
                    b4.c(eVar, z0VarD, o0VarE);
                    c1623g = h5.g.a.f81809f;
                    b4.c(c1623g, i2VarA0, o0VarE);
                    bVar = h5.g.a.f81813j;
                    z45 = z35;
                    if (o0VarE.T) {
                        z46 = z24;
                        if (!p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                        }
                        fVar2 = h5.g.a.f81807d;
                        b4.c(fVar2, rVarC, o0VarE);
                        uVar = c2.u.f22885a;
                        c2.j jVar3 = c2.j.f22691a;
                        bVar2 = d92.b.f58625c;
                        bVar2.getClass();
                        j92.e eVar4 = j92.b.f97899b;
                        float f17 = eVar4.f97920e;
                        jVar3.getClass();
                        c2.j.i iVarI3 = c2.j.i(f17);
                        z47 = z18;
                        h4.g.b bVar8 = h4.d.a.f81534l;
                        aVar8 = h4.r.S;
                        bVar2.getClass();
                        h4.r rVarY3 = c2.l.y(aVar8, eVar4.f97920e);
                        s2VarA = q2.a(iVarI3, bVar8, o0VarE, 48);
                        iHashCode2 = Long.hashCode(o0VarE.U);
                        i2VarA1 = o0VarE.a0();
                        rVarC2 = h4.k.c(rVarY3, o0VarE);
                        if (cVar2 != null) {
                            p3.p0.l();
                            throw null;
                        }
                        o0VarE.z();
                        if (o0VarE.T) {
                            o0VarE.M(aVar6);
                        } else {
                            o0VarE.c();
                        }
                        b4.c(eVar, s2VarA, o0VarE);
                        b4.c(c1623g, i2VarA1, o0VarE);
                        if (o0VarE.T) {
                            v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                        } else {
                            v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                        }
                        b4.c(fVar2, rVarC2, o0VarE);
                        u2 u2Var3 = u2.f22900a;
                        bVar2.getClass();
                        cVar = j92.b.f97901d;
                        i36 = i34 & 126;
                        c(d0Var, fVar, cVar.f97906e, null, o0VarE, i36);
                        h4.r rVarX3 = x2.x(u2Var3.a(aVar8, 1.0f, true), null, 3);
                        pVar4 = pVar3;
                        zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, o0VarE, 0);
                        iHashCode3 = Long.hashCode(o0VarE.U);
                        i2VarA2 = o0VarE.a0();
                        rVarC3 = h4.k.c(rVarX3, o0VarE);
                        if (cVar2 != null) {
                            p3.p0.l();
                            throw null;
                        }
                        o0VarE.z();
                        if (o0VarE.T) {
                            o0VarE.M(aVar6);
                        } else {
                            o0VarE.c();
                        }
                        b4.c(eVar, zVarA, o0VarE);
                        b4.c(c1623g, i2VarA2, o0VarE);
                        if (o0VarE.T) {
                            v.h.A(iHashCode3, o0VarE, iHashCode3, bVar);
                        } else {
                            v.h.A(iHashCode3, o0VarE, iHashCode3, bVar);
                        }
                        b4.c(fVar2, rVarC3, o0VarE);
                        c2.b0 b0Var3 = c2.b0.f22601a;
                        str = d0Var.f112651d;
                        boolean z511 = d0Var.f112652e;
                        if (str == null) {
                            str = "";
                        }
                        String str6 = str;
                        fVar3 = d92.b.f58624b;
                        fVar3.getClass();
                        x0 x0Var3 = j92.f.f97931h;
                        long jD3 = com.nimbusds.jose.shaded.gson.internal.a.d(o0VarE);
                        d6.p.f57793b.getClass();
                        i37 = d6.p.f57795d;
                        mh.c(str6, null, jD3, null, 0L, null, 0L, null, 0L, i37, false, 1, 0, null, x0Var3, o0VarE, 0, 24960, 110586);
                        o0Var = o0VarE;
                        if (g22.n.d(d0Var.f112653f)) {
                            o0Var.C(1814213146);
                            String str7 = d0Var.f112653f;
                            fVar3.getClass();
                            mh.c(str7, null, 0L, null, 0L, null, 0L, null, 0L, i37, false, 2, 0, null, x0.a(j92.f.f97933j, vb.h.g(o0Var), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), o0Var, 0, 24960, 110590);
                            o0Var.g0(false);
                        } else {
                            o0Var.C(1814479901);
                            o0Var.g0(false);
                        }
                        if (z37) {
                            o0Var.C(1814578171);
                            if (pVar4 == null) {
                                o0Var.C(1814621416);
                                if (z45) {
                                    z48 = true;
                                } else {
                                    z48 = true;
                                }
                                z.f(d0Var, fVar, z48, null, o0Var, i36, 8);
                                o0Var.g0(false);
                            } else {
                                o0Var.C(1814741944);
                                e5.q((i34 >> 24) & 14, pVar4, o0Var, false);
                            }
                            o0Var.g0(false);
                        } else {
                            o0Var.C(1814578171);
                            if (pVar4 == null) {
                                o0Var.C(1814621416);
                                if (z45) {
                                    z48 = true;
                                } else {
                                    z48 = true;
                                }
                                z.f(d0Var, fVar, z48, null, o0Var, i36, 8);
                                o0Var.g0(false);
                            } else {
                                o0Var.C(1814741944);
                                e5.q((i34 >> 24) & 14, pVar4, o0Var, false);
                            }
                            o0Var.g0(false);
                        }
                        o0Var.g0(true);
                        if (z37) {
                            o0Var.C(1846551145);
                            if (pVar4 == null) {
                                o0Var.C(1846590918);
                                if (z45) {
                                    z49 = true;
                                } else {
                                    z49 = true;
                                }
                                z.f(d0Var, fVar, z49, null, o0Var, i36, 8);
                                d0Var2 = d0Var;
                                fVar4 = fVar;
                                o0Var.g0(false);
                            } else {
                                d0Var2 = d0Var;
                                fVar4 = fVar;
                                o0Var.C(1846703510);
                                e5.q((i34 >> 24) & 14, pVar4, o0Var, false);
                            }
                            o0Var.g0(false);
                        } else {
                            o0Var.C(1846551145);
                            if (pVar4 == null) {
                                o0Var.C(1846590918);
                                if (z45) {
                                    z49 = true;
                                } else {
                                    z49 = true;
                                }
                                z.f(d0Var, fVar, z49, null, o0Var, i36, 8);
                                d0Var2 = d0Var;
                                fVar4 = fVar;
                                o0Var.g0(false);
                            } else {
                                d0Var2 = d0Var;
                                fVar4 = fVar;
                                o0Var.C(1846703510);
                                e5.q((i34 >> 24) & 14, pVar4, o0Var, false);
                            }
                            o0Var.g0(false);
                        }
                        if (z37) {
                            o0Var.C(1846903274);
                            bVar2.getClass();
                            f14 = cVar.f97904c;
                            h4.r rVarD6 = u1.n.d(x2.q(aVar8, f14), new o4.t1(((o4.d0) d92.b.a(o0Var).d().a().f76496r.getF182175a()).f128833a, null), k2.i.f102406a, 4);
                            z0VarD2 = c2.q.d(h4.d.a.f81524b, false);
                            x1 x1Var8 = p3.n.f135158a;
                            iHashCode4 = Long.hashCode(o0Var.U);
                            i2VarA3 = o0Var.a0();
                            rVarC4 = h4.k.c(rVarD6, o0Var);
                            if (cVar2 == null) {
                                p3.p0.l();
                                throw null;
                            }
                            o0Var.z();
                            if (o0Var.T) {
                                o0Var.M(aVar6);
                            } else {
                                o0Var.c();
                            }
                            b4.c(eVar, z0VarD2, o0Var);
                            b4.c(c1623g, i2VarA3, o0Var);
                            if (o0Var.T) {
                                v.h.A(iHashCode4, o0Var, iHashCode4, bVar);
                            } else {
                                v.h.A(iHashCode4, o0Var, iHashCode4, bVar);
                            }
                            b4.c(fVar2, rVarC4, o0Var);
                            u4.d.b bVar9 = u4.d.f168373k;
                            u4.d dVarB4 = n5.e.b(R.drawable.close_x_thick, o0Var, 6);
                            String strQ7 = gl1.y.Q(o0Var, R.string.lbl_dismiss);
                            g6.f.a aVar16 = g6.f.f75994b;
                            h4.r rVarQ4 = x2.q(uVar.c(aVar8, gVar), f14 / 2);
                            String strQ8 = gl1.y.Q(o0Var, R.string.lbl_dismiss);
                            if ((i34 & 458752) == 131072) {
                                z54 = true;
                            } else {
                                z54 = false;
                            }
                            boolean zR6 = z54 | o0Var.r(fVar4) | o0Var.r(context);
                            if (i35 != 4) {
                                z55 = true;
                            } else {
                                z55 = true;
                            }
                            boolean z67 = zR6 | z55;
                            if ((i34 & 3670016) == 1048576) {
                                z56 = true;
                            } else {
                                z56 = false;
                            }
                            z57 = z67 | z56;
                            objQ2 = o0Var.q();
                            if (z57) {
                                aVar4.getClass();
                                if (objQ2 == p3.m.a.f135155b) {
                                    objQ2 = new gw1.g(z45, fVar4, context, d0Var2, z46);
                                    o0Var.K(objQ2);
                                }
                            } else {
                                objQ2 = new gw1.g(z45, fVar4, context, d0Var2, z46);
                                o0Var.K(objQ2);
                            }
                            p3.o0 o0Var5 = o0Var;
                            i7.b(dVarB4, strQ7, u1.w.d(rVarQ4, false, strQ8, null, (e23.a) objQ2, 13), am.j.d(o0Var), o0Var5, 0, 0);
                            o0Var = o0Var5;
                            z58 = true;
                            o0Var.g0(true);
                            o0Var.g0(false);
                        } else {
                            o0Var.C(1846903274);
                            bVar2.getClass();
                            f14 = cVar.f97904c;
                            h4.r rVarD7 = u1.n.d(x2.q(aVar8, f14), new o4.t1(((o4.d0) d92.b.a(o0Var).d().a().f76496r.getF182175a()).f128833a, null), k2.i.f102406a, 4);
                            z0VarD2 = c2.q.d(h4.d.a.f81524b, false);
                            x1 x1Var9 = p3.n.f135158a;
                            iHashCode4 = Long.hashCode(o0Var.U);
                            i2VarA3 = o0Var.a0();
                            rVarC4 = h4.k.c(rVarD7, o0Var);
                            if (cVar2 == null) {
                                p3.p0.l();
                                throw null;
                            }
                            o0Var.z();
                            if (o0Var.T) {
                                o0Var.M(aVar6);
                            } else {
                                o0Var.c();
                            }
                            b4.c(eVar, z0VarD2, o0Var);
                            b4.c(c1623g, i2VarA3, o0Var);
                            if (o0Var.T) {
                                v.h.A(iHashCode4, o0Var, iHashCode4, bVar);
                            } else {
                                v.h.A(iHashCode4, o0Var, iHashCode4, bVar);
                            }
                            b4.c(fVar2, rVarC4, o0Var);
                            u4.d.b bVar10 = u4.d.f168373k;
                            u4.d dVarB5 = n5.e.b(R.drawable.close_x_thick, o0Var, 6);
                            String strQ9 = gl1.y.Q(o0Var, R.string.lbl_dismiss);
                            g6.f.a aVar17 = g6.f.f75994b;
                            h4.r rVarQ5 = x2.q(uVar.c(aVar8, gVar), f14 / 2);
                            String strQ10 = gl1.y.Q(o0Var, R.string.lbl_dismiss);
                            if ((i34 & 458752) == 131072) {
                                z54 = true;
                            } else {
                                z54 = false;
                            }
                            boolean zR7 = z54 | o0Var.r(fVar4) | o0Var.r(context);
                            if (i35 != 4) {
                                z55 = true;
                            } else {
                                z55 = true;
                            }
                            boolean z68 = zR7 | z55;
                            if ((i34 & 3670016) == 1048576) {
                                z56 = true;
                            } else {
                                z56 = false;
                            }
                            z57 = z68 | z56;
                            objQ2 = o0Var.q();
                            if (z57) {
                                aVar4.getClass();
                                if (objQ2 == p3.m.a.f135155b) {
                                    objQ2 = new gw1.g(z45, fVar4, context, d0Var2, z46);
                                    o0Var.K(objQ2);
                                }
                            } else {
                                objQ2 = new gw1.g(z45, fVar4, context, d0Var2, z46);
                                o0Var.K(objQ2);
                            }
                            p3.o0 o0Var6 = o0Var;
                            i7.b(dVarB5, strQ9, u1.w.d(rVarQ5, false, strQ10, null, (e23.a) objQ2, 13), am.j.d(o0Var), o0Var6, 0, 0);
                            o0Var = o0Var6;
                            z58 = true;
                            o0Var.g0(true);
                            o0Var.g0(false);
                        }
                        o0Var.g0(z58);
                        o0Var.g0(z58);
                        x1 x1Var10 = p3.n.f135158a;
                        pVar2 = pVar4;
                        z26 = z37;
                        aVar2 = aVar7;
                        z29 = z45;
                        z27 = z46;
                        z28 = z47;
                    } else {
                        z46 = z24;
                    }
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                    fVar2 = h5.g.a.f81807d;
                    b4.c(fVar2, rVarC, o0VarE);
                    uVar = c2.u.f22885a;
                    c2.j jVar4 = c2.j.f22691a;
                    bVar2 = d92.b.f58625c;
                    bVar2.getClass();
                    j92.e eVar5 = j92.b.f97899b;
                    float f18 = eVar5.f97920e;
                    jVar4.getClass();
                    c2.j.i iVarI4 = c2.j.i(f18);
                    z47 = z18;
                    h4.g.b bVar11 = h4.d.a.f81534l;
                    aVar8 = h4.r.S;
                    bVar2.getClass();
                    h4.r rVarY4 = c2.l.y(aVar8, eVar5.f97920e);
                    s2VarA = q2.a(iVarI4, bVar11, o0VarE, 48);
                    iHashCode2 = Long.hashCode(o0VarE.U);
                    i2VarA1 = o0VarE.a0();
                    rVarC2 = h4.k.c(rVarY4, o0VarE);
                    if (cVar2 != null) {
                        p3.p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar6);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(eVar, s2VarA, o0VarE);
                    b4.c(c1623g, i2VarA1, o0VarE);
                    if (o0VarE.T) {
                        v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                    } else {
                        v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                    }
                    b4.c(fVar2, rVarC2, o0VarE);
                    u2 u2Var4 = u2.f22900a;
                    bVar2.getClass();
                    cVar = j92.b.f97901d;
                    i36 = i34 & 126;
                    c(d0Var, fVar, cVar.f97906e, null, o0VarE, i36);
                    h4.r rVarX4 = x2.x(u2Var4.a(aVar8, 1.0f, true), null, 3);
                    pVar4 = pVar3;
                    zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, o0VarE, 0);
                    iHashCode3 = Long.hashCode(o0VarE.U);
                    i2VarA2 = o0VarE.a0();
                    rVarC3 = h4.k.c(rVarX4, o0VarE);
                    if (cVar2 != null) {
                        p3.p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar6);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(eVar, zVarA, o0VarE);
                    b4.c(c1623g, i2VarA2, o0VarE);
                    if (o0VarE.T) {
                        v.h.A(iHashCode3, o0VarE, iHashCode3, bVar);
                    } else {
                        v.h.A(iHashCode3, o0VarE, iHashCode3, bVar);
                    }
                    b4.c(fVar2, rVarC3, o0VarE);
                    c2.b0 b0Var4 = c2.b0.f22601a;
                    str = d0Var.f112651d;
                    boolean z512 = d0Var.f112652e;
                    if (str == null) {
                        str = "";
                    }
                    String str8 = str;
                    fVar3 = d92.b.f58624b;
                    fVar3.getClass();
                    x0 x0Var4 = j92.f.f97931h;
                    long jD4 = com.nimbusds.jose.shaded.gson.internal.a.d(o0VarE);
                    d6.p.f57793b.getClass();
                    i37 = d6.p.f57795d;
                    mh.c(str8, null, jD4, null, 0L, null, 0L, null, 0L, i37, false, 1, 0, null, x0Var4, o0VarE, 0, 24960, 110586);
                    o0Var = o0VarE;
                    if (g22.n.d(d0Var.f112653f)) {
                        o0Var.C(1814213146);
                        String str9 = d0Var.f112653f;
                        fVar3.getClass();
                        mh.c(str9, null, 0L, null, 0L, null, 0L, null, 0L, i37, false, 2, 0, null, x0.a(j92.f.f97933j, vb.h.g(o0Var), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), o0Var, 0, 24960, 110590);
                        o0Var.g0(false);
                    } else {
                        o0Var.C(1814479901);
                        o0Var.g0(false);
                    }
                    if (z37) {
                        o0Var.C(1814578171);
                        if (pVar4 == null) {
                            o0Var.C(1814621416);
                            if (z45) {
                                z48 = true;
                            } else {
                                z48 = true;
                            }
                            z.f(d0Var, fVar, z48, null, o0Var, i36, 8);
                            o0Var.g0(false);
                        } else {
                            o0Var.C(1814741944);
                            e5.q((i34 >> 24) & 14, pVar4, o0Var, false);
                        }
                        o0Var.g0(false);
                    } else {
                        o0Var.C(1814578171);
                        if (pVar4 == null) {
                            o0Var.C(1814621416);
                            if (z45) {
                                z48 = true;
                            } else {
                                z48 = true;
                            }
                            z.f(d0Var, fVar, z48, null, o0Var, i36, 8);
                            o0Var.g0(false);
                        } else {
                            o0Var.C(1814741944);
                            e5.q((i34 >> 24) & 14, pVar4, o0Var, false);
                        }
                        o0Var.g0(false);
                    }
                    o0Var.g0(true);
                    if (z37) {
                        o0Var.C(1846551145);
                        if (pVar4 == null) {
                            o0Var.C(1846590918);
                            if (z45) {
                                z49 = true;
                            } else {
                                z49 = true;
                            }
                            z.f(d0Var, fVar, z49, null, o0Var, i36, 8);
                            d0Var2 = d0Var;
                            fVar4 = fVar;
                            o0Var.g0(false);
                        } else {
                            d0Var2 = d0Var;
                            fVar4 = fVar;
                            o0Var.C(1846703510);
                            e5.q((i34 >> 24) & 14, pVar4, o0Var, false);
                        }
                        o0Var.g0(false);
                    } else {
                        o0Var.C(1846551145);
                        if (pVar4 == null) {
                            o0Var.C(1846590918);
                            if (z45) {
                                z49 = true;
                            } else {
                                z49 = true;
                            }
                            z.f(d0Var, fVar, z49, null, o0Var, i36, 8);
                            d0Var2 = d0Var;
                            fVar4 = fVar;
                            o0Var.g0(false);
                        } else {
                            d0Var2 = d0Var;
                            fVar4 = fVar;
                            o0Var.C(1846703510);
                            e5.q((i34 >> 24) & 14, pVar4, o0Var, false);
                        }
                        o0Var.g0(false);
                    }
                    if (z37) {
                        o0Var.C(1846903274);
                        bVar2.getClass();
                        f14 = cVar.f97904c;
                        h4.r rVarD8 = u1.n.d(x2.q(aVar8, f14), new o4.t1(((o4.d0) d92.b.a(o0Var).d().a().f76496r.getF182175a()).f128833a, null), k2.i.f102406a, 4);
                        z0VarD2 = c2.q.d(h4.d.a.f81524b, false);
                        x1 x1Var11 = p3.n.f135158a;
                        iHashCode4 = Long.hashCode(o0Var.U);
                        i2VarA3 = o0Var.a0();
                        rVarC4 = h4.k.c(rVarD8, o0Var);
                        if (cVar2 == null) {
                            p3.p0.l();
                            throw null;
                        }
                        o0Var.z();
                        if (o0Var.T) {
                            o0Var.M(aVar6);
                        } else {
                            o0Var.c();
                        }
                        b4.c(eVar, z0VarD2, o0Var);
                        b4.c(c1623g, i2VarA3, o0Var);
                        if (o0Var.T) {
                            v.h.A(iHashCode4, o0Var, iHashCode4, bVar);
                        } else {
                            v.h.A(iHashCode4, o0Var, iHashCode4, bVar);
                        }
                        b4.c(fVar2, rVarC4, o0Var);
                        u4.d.b bVar12 = u4.d.f168373k;
                        u4.d dVarB6 = n5.e.b(R.drawable.close_x_thick, o0Var, 6);
                        String strQ11 = gl1.y.Q(o0Var, R.string.lbl_dismiss);
                        g6.f.a aVar18 = g6.f.f75994b;
                        h4.r rVarQ6 = x2.q(uVar.c(aVar8, gVar), f14 / 2);
                        String strQ12 = gl1.y.Q(o0Var, R.string.lbl_dismiss);
                        if ((i34 & 458752) == 131072) {
                            z54 = true;
                        } else {
                            z54 = false;
                        }
                        boolean zR8 = z54 | o0Var.r(fVar4) | o0Var.r(context);
                        if (i35 != 4) {
                            z55 = true;
                        } else {
                            z55 = true;
                        }
                        boolean z69 = zR8 | z55;
                        if ((i34 & 3670016) == 1048576) {
                            z56 = true;
                        } else {
                            z56 = false;
                        }
                        z57 = z69 | z56;
                        objQ2 = o0Var.q();
                        if (z57) {
                            aVar4.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = new gw1.g(z45, fVar4, context, d0Var2, z46);
                                o0Var.K(objQ2);
                            }
                        } else {
                            objQ2 = new gw1.g(z45, fVar4, context, d0Var2, z46);
                            o0Var.K(objQ2);
                        }
                        p3.o0 o0Var7 = o0Var;
                        i7.b(dVarB6, strQ11, u1.w.d(rVarQ6, false, strQ12, null, (e23.a) objQ2, 13), am.j.d(o0Var), o0Var7, 0, 0);
                        o0Var = o0Var7;
                        z58 = true;
                        o0Var.g0(true);
                        o0Var.g0(false);
                    } else {
                        o0Var.C(1846903274);
                        bVar2.getClass();
                        f14 = cVar.f97904c;
                        h4.r rVarD9 = u1.n.d(x2.q(aVar8, f14), new o4.t1(((o4.d0) d92.b.a(o0Var).d().a().f76496r.getF182175a()).f128833a, null), k2.i.f102406a, 4);
                        z0VarD2 = c2.q.d(h4.d.a.f81524b, false);
                        x1 x1Var12 = p3.n.f135158a;
                        iHashCode4 = Long.hashCode(o0Var.U);
                        i2VarA3 = o0Var.a0();
                        rVarC4 = h4.k.c(rVarD9, o0Var);
                        if (cVar2 == null) {
                            p3.p0.l();
                            throw null;
                        }
                        o0Var.z();
                        if (o0Var.T) {
                            o0Var.M(aVar6);
                        } else {
                            o0Var.c();
                        }
                        b4.c(eVar, z0VarD2, o0Var);
                        b4.c(c1623g, i2VarA3, o0Var);
                        if (o0Var.T) {
                            v.h.A(iHashCode4, o0Var, iHashCode4, bVar);
                        } else {
                            v.h.A(iHashCode4, o0Var, iHashCode4, bVar);
                        }
                        b4.c(fVar2, rVarC4, o0Var);
                        u4.d.b bVar13 = u4.d.f168373k;
                        u4.d dVarB7 = n5.e.b(R.drawable.close_x_thick, o0Var, 6);
                        String strQ13 = gl1.y.Q(o0Var, R.string.lbl_dismiss);
                        g6.f.a aVar19 = g6.f.f75994b;
                        h4.r rVarQ7 = x2.q(uVar.c(aVar8, gVar), f14 / 2);
                        String strQ14 = gl1.y.Q(o0Var, R.string.lbl_dismiss);
                        if ((i34 & 458752) == 131072) {
                            z54 = true;
                        } else {
                            z54 = false;
                        }
                        boolean zR9 = z54 | o0Var.r(fVar4) | o0Var.r(context);
                        if (i35 != 4) {
                            z55 = true;
                        } else {
                            z55 = true;
                        }
                        boolean z610 = zR9 | z55;
                        if ((i34 & 3670016) == 1048576) {
                            z56 = true;
                        } else {
                            z56 = false;
                        }
                        z57 = z610 | z56;
                        objQ2 = o0Var.q();
                        if (z57) {
                            aVar4.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = new gw1.g(z45, fVar4, context, d0Var2, z46);
                                o0Var.K(objQ2);
                            }
                        } else {
                            objQ2 = new gw1.g(z45, fVar4, context, d0Var2, z46);
                            o0Var.K(objQ2);
                        }
                        p3.o0 o0Var8 = o0Var;
                        i7.b(dVarB7, strQ13, u1.w.d(rVarQ7, false, strQ14, null, (e23.a) objQ2, 13), am.j.d(o0Var), o0Var8, 0, 0);
                        o0Var = o0Var8;
                        z58 = true;
                        o0Var.g0(true);
                        o0Var.g0(false);
                    }
                    o0Var.g0(z58);
                    o0Var.g0(z58);
                    x1 x1Var13 = p3.n.f135158a;
                    pVar2 = pVar4;
                    z26 = z37;
                    aVar2 = aVar7;
                    z29 = z45;
                    z27 = z46;
                    z28 = z47;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    z26 = z15;
                    aVar2 = aVar;
                    z27 = z24;
                    z28 = z18;
                    z29 = z19;
                    pVar2 = pVar;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new com.google.maps.android.compose.streetview.a(d0Var, fVar, rVar, z28, z26, z29, z27, aVar2, pVar2, i14, i15);
                }
            }
            i16 |= 24576;
            i19 = i15 & 32;
            if (i19 != 0) {
                i16 |= 196608;
                z19 = z16;
            } else {
                z19 = z16;
                if ((i14 & 196608) == 0) {
                    if (o0VarE.h(z19)) {
                        i24 = 131072;
                    } else {
                        i24 = 65536;
                    }
                    i16 |= i24;
                }
            }
            i25 = i15 & 64;
            if (i25 != 0) {
                i16 |= 1572864;
                z24 = z17;
            } else {
                z24 = z17;
                if ((i14 & 1572864) == 0) {
                    if (o0VarE.h(z24)) {
                        i26 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    } else {
                        i26 = 524288;
                    }
                    i16 |= i26;
                }
            }
            i27 = i15 & 128;
            if (i27 != 0) {
                i16 |= 12582912;
            } else if ((i14 & 12582912) == 0) {
                if (o0VarE.r(aVar)) {
                    i28 = 8388608;
                } else {
                    i28 = 4194304;
                }
                i16 |= i28;
            }
            i29 = i15 & 256;
            if (i29 != 0) {
                if ((i14 & 100663296) == 0) {
                    if (o0VarE.r(pVar)) {
                        i30 = 67108864;
                    } else {
                        i30 = 33554432;
                    }
                    i16 |= i30;
                }
                i34 = i16;
                if ((i16 & 38347923) != 38347922) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                if (o0VarE.n(i34 & 1, z25)) {
                    if (i38 != 0) {
                        z18 = false;
                    }
                    if (i17 != 0) {
                        z34 = false;
                    } else {
                        z34 = z15;
                    }
                    if (i19 != 0) {
                        z35 = false;
                    } else {
                        z35 = z19;
                    }
                    if (i25 != 0) {
                        z24 = false;
                    }
                    if (i27 != 0) {
                        aVar3 = null;
                    } else {
                        aVar3 = aVar;
                    }
                    if (i29 != 0) {
                        pVar3 = null;
                    } else {
                        pVar3 = pVar;
                    }
                    x1 x1Var14 = p3.n.f135158a;
                    context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                    if (((g6.c) o0VarE.A(t1.f91490h)).getF94882b() >= 1.3d) {
                        z36 = true;
                    } else {
                        z36 = false;
                    }
                    h4.d.f81522a.getClass();
                    gVar = h4.d.a.f81528f;
                    z37 = z34;
                    h4.r rVarE3 = u1.n.e(x2.x(x2.f(rVar, 1.0f), null, 3), am.j.c(d92.b.f58623a, o0VarE), m1.f128891a);
                    if ((i34 & 29360128) == 8388608) {
                        z38 = true;
                    } else {
                        z38 = false;
                    }
                    boolean zR10 = z38 | o0VarE.r(fVar) | o0VarE.r(context);
                    i35 = i34 & 14;
                    if (i35 != 4) {
                        z39 = true;
                    } else {
                        z39 = true;
                    }
                    z44 = zR10 | z39;
                    objQ = o0VarE.q();
                    aVar4 = p3.m.f135153a;
                    if (z44) {
                        aVar4.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            e23.a<Unit> aVar110 = aVar3;
                            objQ = new ho.d0((Object) aVar110, (Object) fVar, (Object) context, (Object) d0Var, 18, (byte) 0);
                            aVar5 = aVar110;
                            o0VarE.K(objQ);
                        } else {
                            aVar5 = aVar3;
                        }
                    } else {
                        e23.a<Unit> aVar111 = aVar3;
                        objQ = new ho.d0((Object) aVar111, (Object) fVar, (Object) context, (Object) d0Var, 18, (byte) 0);
                        aVar5 = aVar111;
                        o0VarE.K(objQ);
                    }
                    h4.r rVarD10 = u1.w.d(rVarE3, false, null, null, (e23.a) objQ, 15);
                    z0VarD = c2.q.d(gVar, false);
                    iHashCode = Long.hashCode(o0VarE.U);
                    i2VarA0 = o0VarE.a0();
                    rVarC = h4.k.c(rVarD10, o0VarE);
                    h5.g.V.getClass();
                    aVar6 = h5.g.a.f81805b;
                    if (cVar2 != null) {
                        p3.p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    aVar7 = aVar5;
                    if (o0VarE.T) {
                        o0VarE.M(aVar6);
                    } else {
                        o0VarE.c();
                    }
                    eVar = h5.g.a.f81810g;
                    b4.c(eVar, z0VarD, o0VarE);
                    c1623g = h5.g.a.f81809f;
                    b4.c(c1623g, i2VarA0, o0VarE);
                    bVar = h5.g.a.f81813j;
                    z45 = z35;
                    if (o0VarE.T) {
                        z46 = z24;
                        if (!p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                        }
                        fVar2 = h5.g.a.f81807d;
                        b4.c(fVar2, rVarC, o0VarE);
                        uVar = c2.u.f22885a;
                        c2.j jVar5 = c2.j.f22691a;
                        bVar2 = d92.b.f58625c;
                        bVar2.getClass();
                        j92.e eVar6 = j92.b.f97899b;
                        float f19 = eVar6.f97920e;
                        jVar5.getClass();
                        c2.j.i iVarI5 = c2.j.i(f19);
                        z47 = z18;
                        h4.g.b bVar14 = h4.d.a.f81534l;
                        aVar8 = h4.r.S;
                        bVar2.getClass();
                        h4.r rVarY5 = c2.l.y(aVar8, eVar6.f97920e);
                        s2VarA = q2.a(iVarI5, bVar14, o0VarE, 48);
                        iHashCode2 = Long.hashCode(o0VarE.U);
                        i2VarA1 = o0VarE.a0();
                        rVarC2 = h4.k.c(rVarY5, o0VarE);
                        if (cVar2 != null) {
                            p3.p0.l();
                            throw null;
                        }
                        o0VarE.z();
                        if (o0VarE.T) {
                            o0VarE.M(aVar6);
                        } else {
                            o0VarE.c();
                        }
                        b4.c(eVar, s2VarA, o0VarE);
                        b4.c(c1623g, i2VarA1, o0VarE);
                        if (o0VarE.T) {
                            v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                        } else {
                            v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                        }
                        b4.c(fVar2, rVarC2, o0VarE);
                        u2 u2Var5 = u2.f22900a;
                        bVar2.getClass();
                        cVar = j92.b.f97901d;
                        i36 = i34 & 126;
                        c(d0Var, fVar, cVar.f97906e, null, o0VarE, i36);
                        h4.r rVarX5 = x2.x(u2Var5.a(aVar8, 1.0f, true), null, 3);
                        pVar4 = pVar3;
                        zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, o0VarE, 0);
                        iHashCode3 = Long.hashCode(o0VarE.U);
                        i2VarA2 = o0VarE.a0();
                        rVarC3 = h4.k.c(rVarX5, o0VarE);
                        if (cVar2 != null) {
                            p3.p0.l();
                            throw null;
                        }
                        o0VarE.z();
                        if (o0VarE.T) {
                            o0VarE.M(aVar6);
                        } else {
                            o0VarE.c();
                        }
                        b4.c(eVar, zVarA, o0VarE);
                        b4.c(c1623g, i2VarA2, o0VarE);
                        if (o0VarE.T) {
                            v.h.A(iHashCode3, o0VarE, iHashCode3, bVar);
                        } else {
                            v.h.A(iHashCode3, o0VarE, iHashCode3, bVar);
                        }
                        b4.c(fVar2, rVarC3, o0VarE);
                        c2.b0 b0Var5 = c2.b0.f22601a;
                        str = d0Var.f112651d;
                        boolean z513 = d0Var.f112652e;
                        if (str == null) {
                            str = "";
                        }
                        String str10 = str;
                        fVar3 = d92.b.f58624b;
                        fVar3.getClass();
                        x0 x0Var5 = j92.f.f97931h;
                        long jD5 = com.nimbusds.jose.shaded.gson.internal.a.d(o0VarE);
                        d6.p.f57793b.getClass();
                        i37 = d6.p.f57795d;
                        mh.c(str10, null, jD5, null, 0L, null, 0L, null, 0L, i37, false, 1, 0, null, x0Var5, o0VarE, 0, 24960, 110586);
                        o0Var = o0VarE;
                        if (g22.n.d(d0Var.f112653f)) {
                            o0Var.C(1814213146);
                            String str11 = d0Var.f112653f;
                            fVar3.getClass();
                            mh.c(str11, null, 0L, null, 0L, null, 0L, null, 0L, i37, false, 2, 0, null, x0.a(j92.f.f97933j, vb.h.g(o0Var), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), o0Var, 0, 24960, 110590);
                            o0Var.g0(false);
                        } else {
                            o0Var.C(1814479901);
                            o0Var.g0(false);
                        }
                        if (z37) {
                            o0Var.C(1814578171);
                            if (pVar4 == null) {
                                o0Var.C(1814621416);
                                if (z45) {
                                    z48 = true;
                                } else {
                                    z48 = true;
                                }
                                z.f(d0Var, fVar, z48, null, o0Var, i36, 8);
                                o0Var.g0(false);
                            } else {
                                o0Var.C(1814741944);
                                e5.q((i34 >> 24) & 14, pVar4, o0Var, false);
                            }
                            o0Var.g0(false);
                        } else {
                            o0Var.C(1814578171);
                            if (pVar4 == null) {
                                o0Var.C(1814621416);
                                if (z45) {
                                    z48 = true;
                                } else {
                                    z48 = true;
                                }
                                z.f(d0Var, fVar, z48, null, o0Var, i36, 8);
                                o0Var.g0(false);
                            } else {
                                o0Var.C(1814741944);
                                e5.q((i34 >> 24) & 14, pVar4, o0Var, false);
                            }
                            o0Var.g0(false);
                        }
                        o0Var.g0(true);
                        if (z37) {
                            o0Var.C(1846551145);
                            if (pVar4 == null) {
                                o0Var.C(1846590918);
                                if (z45) {
                                    z49 = true;
                                } else {
                                    z49 = true;
                                }
                                z.f(d0Var, fVar, z49, null, o0Var, i36, 8);
                                d0Var2 = d0Var;
                                fVar4 = fVar;
                                o0Var.g0(false);
                            } else {
                                d0Var2 = d0Var;
                                fVar4 = fVar;
                                o0Var.C(1846703510);
                                e5.q((i34 >> 24) & 14, pVar4, o0Var, false);
                            }
                            o0Var.g0(false);
                        } else {
                            o0Var.C(1846551145);
                            if (pVar4 == null) {
                                o0Var.C(1846590918);
                                if (z45) {
                                    z49 = true;
                                } else {
                                    z49 = true;
                                }
                                z.f(d0Var, fVar, z49, null, o0Var, i36, 8);
                                d0Var2 = d0Var;
                                fVar4 = fVar;
                                o0Var.g0(false);
                            } else {
                                d0Var2 = d0Var;
                                fVar4 = fVar;
                                o0Var.C(1846703510);
                                e5.q((i34 >> 24) & 14, pVar4, o0Var, false);
                            }
                            o0Var.g0(false);
                        }
                        if (z37) {
                            o0Var.C(1846903274);
                            bVar2.getClass();
                            f14 = cVar.f97904c;
                            h4.r rVarD11 = u1.n.d(x2.q(aVar8, f14), new o4.t1(((o4.d0) d92.b.a(o0Var).d().a().f76496r.getF182175a()).f128833a, null), k2.i.f102406a, 4);
                            z0VarD2 = c2.q.d(h4.d.a.f81524b, false);
                            x1 x1Var15 = p3.n.f135158a;
                            iHashCode4 = Long.hashCode(o0Var.U);
                            i2VarA3 = o0Var.a0();
                            rVarC4 = h4.k.c(rVarD11, o0Var);
                            if (cVar2 == null) {
                                p3.p0.l();
                                throw null;
                            }
                            o0Var.z();
                            if (o0Var.T) {
                                o0Var.M(aVar6);
                            } else {
                                o0Var.c();
                            }
                            b4.c(eVar, z0VarD2, o0Var);
                            b4.c(c1623g, i2VarA3, o0Var);
                            if (o0Var.T) {
                                v.h.A(iHashCode4, o0Var, iHashCode4, bVar);
                            } else {
                                v.h.A(iHashCode4, o0Var, iHashCode4, bVar);
                            }
                            b4.c(fVar2, rVarC4, o0Var);
                            u4.d.b bVar15 = u4.d.f168373k;
                            u4.d dVarB8 = n5.e.b(R.drawable.close_x_thick, o0Var, 6);
                            String strQ15 = gl1.y.Q(o0Var, R.string.lbl_dismiss);
                            g6.f.a aVar112 = g6.f.f75994b;
                            h4.r rVarQ8 = x2.q(uVar.c(aVar8, gVar), f14 / 2);
                            String strQ16 = gl1.y.Q(o0Var, R.string.lbl_dismiss);
                            if ((i34 & 458752) == 131072) {
                                z54 = true;
                            } else {
                                z54 = false;
                            }
                            boolean zR11 = z54 | o0Var.r(fVar4) | o0Var.r(context);
                            if (i35 != 4) {
                                z55 = true;
                            } else {
                                z55 = true;
                            }
                            boolean z611 = zR11 | z55;
                            if ((i34 & 3670016) == 1048576) {
                                z56 = true;
                            } else {
                                z56 = false;
                            }
                            z57 = z611 | z56;
                            objQ2 = o0Var.q();
                            if (z57) {
                                aVar4.getClass();
                                if (objQ2 == p3.m.a.f135155b) {
                                    objQ2 = new gw1.g(z45, fVar4, context, d0Var2, z46);
                                    o0Var.K(objQ2);
                                }
                            } else {
                                objQ2 = new gw1.g(z45, fVar4, context, d0Var2, z46);
                                o0Var.K(objQ2);
                            }
                            p3.o0 o0Var9 = o0Var;
                            i7.b(dVarB8, strQ15, u1.w.d(rVarQ8, false, strQ16, null, (e23.a) objQ2, 13), am.j.d(o0Var), o0Var9, 0, 0);
                            o0Var = o0Var9;
                            z58 = true;
                            o0Var.g0(true);
                            o0Var.g0(false);
                        } else {
                            o0Var.C(1846903274);
                            bVar2.getClass();
                            f14 = cVar.f97904c;
                            h4.r rVarD12 = u1.n.d(x2.q(aVar8, f14), new o4.t1(((o4.d0) d92.b.a(o0Var).d().a().f76496r.getF182175a()).f128833a, null), k2.i.f102406a, 4);
                            z0VarD2 = c2.q.d(h4.d.a.f81524b, false);
                            x1 x1Var16 = p3.n.f135158a;
                            iHashCode4 = Long.hashCode(o0Var.U);
                            i2VarA3 = o0Var.a0();
                            rVarC4 = h4.k.c(rVarD12, o0Var);
                            if (cVar2 == null) {
                                p3.p0.l();
                                throw null;
                            }
                            o0Var.z();
                            if (o0Var.T) {
                                o0Var.M(aVar6);
                            } else {
                                o0Var.c();
                            }
                            b4.c(eVar, z0VarD2, o0Var);
                            b4.c(c1623g, i2VarA3, o0Var);
                            if (o0Var.T) {
                                v.h.A(iHashCode4, o0Var, iHashCode4, bVar);
                            } else {
                                v.h.A(iHashCode4, o0Var, iHashCode4, bVar);
                            }
                            b4.c(fVar2, rVarC4, o0Var);
                            u4.d.b bVar16 = u4.d.f168373k;
                            u4.d dVarB9 = n5.e.b(R.drawable.close_x_thick, o0Var, 6);
                            String strQ17 = gl1.y.Q(o0Var, R.string.lbl_dismiss);
                            g6.f.a aVar113 = g6.f.f75994b;
                            h4.r rVarQ9 = x2.q(uVar.c(aVar8, gVar), f14 / 2);
                            String strQ18 = gl1.y.Q(o0Var, R.string.lbl_dismiss);
                            if ((i34 & 458752) == 131072) {
                                z54 = true;
                            } else {
                                z54 = false;
                            }
                            boolean zR12 = z54 | o0Var.r(fVar4) | o0Var.r(context);
                            if (i35 != 4) {
                                z55 = true;
                            } else {
                                z55 = true;
                            }
                            boolean z612 = zR12 | z55;
                            if ((i34 & 3670016) == 1048576) {
                                z56 = true;
                            } else {
                                z56 = false;
                            }
                            z57 = z612 | z56;
                            objQ2 = o0Var.q();
                            if (z57) {
                                aVar4.getClass();
                                if (objQ2 == p3.m.a.f135155b) {
                                    objQ2 = new gw1.g(z45, fVar4, context, d0Var2, z46);
                                    o0Var.K(objQ2);
                                }
                            } else {
                                objQ2 = new gw1.g(z45, fVar4, context, d0Var2, z46);
                                o0Var.K(objQ2);
                            }
                            p3.o0 o0Var10 = o0Var;
                            i7.b(dVarB9, strQ17, u1.w.d(rVarQ9, false, strQ18, null, (e23.a) objQ2, 13), am.j.d(o0Var), o0Var10, 0, 0);
                            o0Var = o0Var10;
                            z58 = true;
                            o0Var.g0(true);
                            o0Var.g0(false);
                        }
                        o0Var.g0(z58);
                        o0Var.g0(z58);
                        x1 x1Var17 = p3.n.f135158a;
                        pVar2 = pVar4;
                        z26 = z37;
                        aVar2 = aVar7;
                        z29 = z45;
                        z27 = z46;
                        z28 = z47;
                    } else {
                        z46 = z24;
                    }
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                    fVar2 = h5.g.a.f81807d;
                    b4.c(fVar2, rVarC, o0VarE);
                    uVar = c2.u.f22885a;
                    c2.j jVar6 = c2.j.f22691a;
                    bVar2 = d92.b.f58625c;
                    bVar2.getClass();
                    j92.e eVar7 = j92.b.f97899b;
                    float f110 = eVar7.f97920e;
                    jVar6.getClass();
                    c2.j.i iVarI6 = c2.j.i(f110);
                    z47 = z18;
                    h4.g.b bVar17 = h4.d.a.f81534l;
                    aVar8 = h4.r.S;
                    bVar2.getClass();
                    h4.r rVarY6 = c2.l.y(aVar8, eVar7.f97920e);
                    s2VarA = q2.a(iVarI6, bVar17, o0VarE, 48);
                    iHashCode2 = Long.hashCode(o0VarE.U);
                    i2VarA1 = o0VarE.a0();
                    rVarC2 = h4.k.c(rVarY6, o0VarE);
                    if (cVar2 != null) {
                        p3.p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar6);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(eVar, s2VarA, o0VarE);
                    b4.c(c1623g, i2VarA1, o0VarE);
                    if (o0VarE.T) {
                        v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                    } else {
                        v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                    }
                    b4.c(fVar2, rVarC2, o0VarE);
                    u2 u2Var6 = u2.f22900a;
                    bVar2.getClass();
                    cVar = j92.b.f97901d;
                    i36 = i34 & 126;
                    c(d0Var, fVar, cVar.f97906e, null, o0VarE, i36);
                    h4.r rVarX6 = x2.x(u2Var6.a(aVar8, 1.0f, true), null, 3);
                    pVar4 = pVar3;
                    zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, o0VarE, 0);
                    iHashCode3 = Long.hashCode(o0VarE.U);
                    i2VarA2 = o0VarE.a0();
                    rVarC3 = h4.k.c(rVarX6, o0VarE);
                    if (cVar2 != null) {
                        p3.p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar6);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(eVar, zVarA, o0VarE);
                    b4.c(c1623g, i2VarA2, o0VarE);
                    if (o0VarE.T) {
                        v.h.A(iHashCode3, o0VarE, iHashCode3, bVar);
                    } else {
                        v.h.A(iHashCode3, o0VarE, iHashCode3, bVar);
                    }
                    b4.c(fVar2, rVarC3, o0VarE);
                    c2.b0 b0Var6 = c2.b0.f22601a;
                    str = d0Var.f112651d;
                    boolean z514 = d0Var.f112652e;
                    if (str == null) {
                        str = "";
                    }
                    String str12 = str;
                    fVar3 = d92.b.f58624b;
                    fVar3.getClass();
                    x0 x0Var6 = j92.f.f97931h;
                    long jD6 = com.nimbusds.jose.shaded.gson.internal.a.d(o0VarE);
                    d6.p.f57793b.getClass();
                    i37 = d6.p.f57795d;
                    mh.c(str12, null, jD6, null, 0L, null, 0L, null, 0L, i37, false, 1, 0, null, x0Var6, o0VarE, 0, 24960, 110586);
                    o0Var = o0VarE;
                    if (g22.n.d(d0Var.f112653f)) {
                        o0Var.C(1814213146);
                        String str13 = d0Var.f112653f;
                        fVar3.getClass();
                        mh.c(str13, null, 0L, null, 0L, null, 0L, null, 0L, i37, false, 2, 0, null, x0.a(j92.f.f97933j, vb.h.g(o0Var), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), o0Var, 0, 24960, 110590);
                        o0Var.g0(false);
                    } else {
                        o0Var.C(1814479901);
                        o0Var.g0(false);
                    }
                    if (z37) {
                        o0Var.C(1814578171);
                        if (pVar4 == null) {
                            o0Var.C(1814621416);
                            if (z45) {
                                z48 = true;
                            } else {
                                z48 = true;
                            }
                            z.f(d0Var, fVar, z48, null, o0Var, i36, 8);
                            o0Var.g0(false);
                        } else {
                            o0Var.C(1814741944);
                            e5.q((i34 >> 24) & 14, pVar4, o0Var, false);
                        }
                        o0Var.g0(false);
                    } else {
                        o0Var.C(1814578171);
                        if (pVar4 == null) {
                            o0Var.C(1814621416);
                            if (z45) {
                                z48 = true;
                            } else {
                                z48 = true;
                            }
                            z.f(d0Var, fVar, z48, null, o0Var, i36, 8);
                            o0Var.g0(false);
                        } else {
                            o0Var.C(1814741944);
                            e5.q((i34 >> 24) & 14, pVar4, o0Var, false);
                        }
                        o0Var.g0(false);
                    }
                    o0Var.g0(true);
                    if (z37) {
                        o0Var.C(1846551145);
                        if (pVar4 == null) {
                            o0Var.C(1846590918);
                            if (z45) {
                                z49 = true;
                            } else {
                                z49 = true;
                            }
                            z.f(d0Var, fVar, z49, null, o0Var, i36, 8);
                            d0Var2 = d0Var;
                            fVar4 = fVar;
                            o0Var.g0(false);
                        } else {
                            d0Var2 = d0Var;
                            fVar4 = fVar;
                            o0Var.C(1846703510);
                            e5.q((i34 >> 24) & 14, pVar4, o0Var, false);
                        }
                        o0Var.g0(false);
                    } else {
                        o0Var.C(1846551145);
                        if (pVar4 == null) {
                            o0Var.C(1846590918);
                            if (z45) {
                                z49 = true;
                            } else {
                                z49 = true;
                            }
                            z.f(d0Var, fVar, z49, null, o0Var, i36, 8);
                            d0Var2 = d0Var;
                            fVar4 = fVar;
                            o0Var.g0(false);
                        } else {
                            d0Var2 = d0Var;
                            fVar4 = fVar;
                            o0Var.C(1846703510);
                            e5.q((i34 >> 24) & 14, pVar4, o0Var, false);
                        }
                        o0Var.g0(false);
                    }
                    if (z37) {
                        o0Var.C(1846903274);
                        bVar2.getClass();
                        f14 = cVar.f97904c;
                        h4.r rVarD13 = u1.n.d(x2.q(aVar8, f14), new o4.t1(((o4.d0) d92.b.a(o0Var).d().a().f76496r.getF182175a()).f128833a, null), k2.i.f102406a, 4);
                        z0VarD2 = c2.q.d(h4.d.a.f81524b, false);
                        x1 x1Var18 = p3.n.f135158a;
                        iHashCode4 = Long.hashCode(o0Var.U);
                        i2VarA3 = o0Var.a0();
                        rVarC4 = h4.k.c(rVarD13, o0Var);
                        if (cVar2 == null) {
                            p3.p0.l();
                            throw null;
                        }
                        o0Var.z();
                        if (o0Var.T) {
                            o0Var.M(aVar6);
                        } else {
                            o0Var.c();
                        }
                        b4.c(eVar, z0VarD2, o0Var);
                        b4.c(c1623g, i2VarA3, o0Var);
                        if (o0Var.T) {
                            v.h.A(iHashCode4, o0Var, iHashCode4, bVar);
                        } else {
                            v.h.A(iHashCode4, o0Var, iHashCode4, bVar);
                        }
                        b4.c(fVar2, rVarC4, o0Var);
                        u4.d.b bVar18 = u4.d.f168373k;
                        u4.d dVarB10 = n5.e.b(R.drawable.close_x_thick, o0Var, 6);
                        String strQ19 = gl1.y.Q(o0Var, R.string.lbl_dismiss);
                        g6.f.a aVar114 = g6.f.f75994b;
                        h4.r rVarQ10 = x2.q(uVar.c(aVar8, gVar), f14 / 2);
                        String strQ110 = gl1.y.Q(o0Var, R.string.lbl_dismiss);
                        if ((i34 & 458752) == 131072) {
                            z54 = true;
                        } else {
                            z54 = false;
                        }
                        boolean zR13 = z54 | o0Var.r(fVar4) | o0Var.r(context);
                        if (i35 != 4) {
                            z55 = true;
                        } else {
                            z55 = true;
                        }
                        boolean z613 = zR13 | z55;
                        if ((i34 & 3670016) == 1048576) {
                            z56 = true;
                        } else {
                            z56 = false;
                        }
                        z57 = z613 | z56;
                        objQ2 = o0Var.q();
                        if (z57) {
                            aVar4.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = new gw1.g(z45, fVar4, context, d0Var2, z46);
                                o0Var.K(objQ2);
                            }
                        } else {
                            objQ2 = new gw1.g(z45, fVar4, context, d0Var2, z46);
                            o0Var.K(objQ2);
                        }
                        p3.o0 o0Var11 = o0Var;
                        i7.b(dVarB10, strQ19, u1.w.d(rVarQ10, false, strQ110, null, (e23.a) objQ2, 13), am.j.d(o0Var), o0Var11, 0, 0);
                        o0Var = o0Var11;
                        z58 = true;
                        o0Var.g0(true);
                        o0Var.g0(false);
                    } else {
                        o0Var.C(1846903274);
                        bVar2.getClass();
                        f14 = cVar.f97904c;
                        h4.r rVarD14 = u1.n.d(x2.q(aVar8, f14), new o4.t1(((o4.d0) d92.b.a(o0Var).d().a().f76496r.getF182175a()).f128833a, null), k2.i.f102406a, 4);
                        z0VarD2 = c2.q.d(h4.d.a.f81524b, false);
                        x1 x1Var19 = p3.n.f135158a;
                        iHashCode4 = Long.hashCode(o0Var.U);
                        i2VarA3 = o0Var.a0();
                        rVarC4 = h4.k.c(rVarD14, o0Var);
                        if (cVar2 == null) {
                            p3.p0.l();
                            throw null;
                        }
                        o0Var.z();
                        if (o0Var.T) {
                            o0Var.M(aVar6);
                        } else {
                            o0Var.c();
                        }
                        b4.c(eVar, z0VarD2, o0Var);
                        b4.c(c1623g, i2VarA3, o0Var);
                        if (o0Var.T) {
                            v.h.A(iHashCode4, o0Var, iHashCode4, bVar);
                        } else {
                            v.h.A(iHashCode4, o0Var, iHashCode4, bVar);
                        }
                        b4.c(fVar2, rVarC4, o0Var);
                        u4.d.b bVar19 = u4.d.f168373k;
                        u4.d dVarB11 = n5.e.b(R.drawable.close_x_thick, o0Var, 6);
                        String strQ111 = gl1.y.Q(o0Var, R.string.lbl_dismiss);
                        g6.f.a aVar115 = g6.f.f75994b;
                        h4.r rVarQ11 = x2.q(uVar.c(aVar8, gVar), f14 / 2);
                        String strQ112 = gl1.y.Q(o0Var, R.string.lbl_dismiss);
                        if ((i34 & 458752) == 131072) {
                            z54 = true;
                        } else {
                            z54 = false;
                        }
                        boolean zR14 = z54 | o0Var.r(fVar4) | o0Var.r(context);
                        if (i35 != 4) {
                            z55 = true;
                        } else {
                            z55 = true;
                        }
                        boolean z614 = zR14 | z55;
                        if ((i34 & 3670016) == 1048576) {
                            z56 = true;
                        } else {
                            z56 = false;
                        }
                        z57 = z614 | z56;
                        objQ2 = o0Var.q();
                        if (z57) {
                            aVar4.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = new gw1.g(z45, fVar4, context, d0Var2, z46);
                                o0Var.K(objQ2);
                            }
                        } else {
                            objQ2 = new gw1.g(z45, fVar4, context, d0Var2, z46);
                            o0Var.K(objQ2);
                        }
                        p3.o0 o0Var12 = o0Var;
                        i7.b(dVarB11, strQ111, u1.w.d(rVarQ11, false, strQ112, null, (e23.a) objQ2, 13), am.j.d(o0Var), o0Var12, 0, 0);
                        o0Var = o0Var12;
                        z58 = true;
                        o0Var.g0(true);
                        o0Var.g0(false);
                    }
                    o0Var.g0(z58);
                    o0Var.g0(z58);
                    x1 x1Var110 = p3.n.f135158a;
                    pVar2 = pVar4;
                    z26 = z37;
                    aVar2 = aVar7;
                    z29 = z45;
                    z27 = z46;
                    z28 = z47;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    z26 = z15;
                    aVar2 = aVar;
                    z27 = z24;
                    z28 = z18;
                    z29 = z19;
                    pVar2 = pVar;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new com.google.maps.android.compose.streetview.a(d0Var, fVar, rVar, z28, z26, z29, z27, aVar2, pVar2, i14, i15);
                }
            }
            i16 |= 100663296;
            i34 = i16;
            if ((i16 & 38347923) != 38347922) {
                z25 = true;
            } else {
                z25 = false;
            }
            if (o0VarE.n(i34 & 1, z25)) {
                if (i38 != 0) {
                    z18 = false;
                }
                if (i17 != 0) {
                    z34 = false;
                } else {
                    z34 = z15;
                }
                if (i19 != 0) {
                    z35 = false;
                } else {
                    z35 = z19;
                }
                if (i25 != 0) {
                    z24 = false;
                }
                if (i27 != 0) {
                    aVar3 = null;
                } else {
                    aVar3 = aVar;
                }
                if (i29 != 0) {
                    pVar3 = null;
                } else {
                    pVar3 = pVar;
                }
                x1 x1Var111 = p3.n.f135158a;
                context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                if (((g6.c) o0VarE.A(t1.f91490h)).getF94882b() >= 1.3d) {
                    z36 = true;
                } else {
                    z36 = false;
                }
                h4.d.f81522a.getClass();
                gVar = h4.d.a.f81528f;
                z37 = z34;
                h4.r rVarE4 = u1.n.e(x2.x(x2.f(rVar, 1.0f), null, 3), am.j.c(d92.b.f58623a, o0VarE), m1.f128891a);
                if ((i34 & 29360128) == 8388608) {
                    z38 = true;
                } else {
                    z38 = false;
                }
                boolean zR15 = z38 | o0VarE.r(fVar) | o0VarE.r(context);
                i35 = i34 & 14;
                if (i35 != 4) {
                    z39 = true;
                } else {
                    z39 = true;
                }
                z44 = zR15 | z39;
                objQ = o0VarE.q();
                aVar4 = p3.m.f135153a;
                if (z44) {
                    aVar4.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        e23.a<Unit> aVar116 = aVar3;
                        objQ = new ho.d0((Object) aVar116, (Object) fVar, (Object) context, (Object) d0Var, 18, (byte) 0);
                        aVar5 = aVar116;
                        o0VarE.K(objQ);
                    } else {
                        aVar5 = aVar3;
                    }
                } else {
                    e23.a<Unit> aVar117 = aVar3;
                    objQ = new ho.d0((Object) aVar117, (Object) fVar, (Object) context, (Object) d0Var, 18, (byte) 0);
                    aVar5 = aVar117;
                    o0VarE.K(objQ);
                }
                h4.r rVarD15 = u1.w.d(rVarE4, false, null, null, (e23.a) objQ, 15);
                z0VarD = c2.q.d(gVar, false);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarD15, o0VarE);
                h5.g.V.getClass();
                aVar6 = h5.g.a.f81805b;
                if (cVar2 != null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                aVar7 = aVar5;
                if (o0VarE.T) {
                    o0VarE.M(aVar6);
                } else {
                    o0VarE.c();
                }
                eVar = h5.g.a.f81810g;
                b4.c(eVar, z0VarD, o0VarE);
                c1623g = h5.g.a.f81809f;
                b4.c(c1623g, i2VarA0, o0VarE);
                bVar = h5.g.a.f81813j;
                z45 = z35;
                if (o0VarE.T) {
                    z46 = z24;
                    if (!p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    }
                    fVar2 = h5.g.a.f81807d;
                    b4.c(fVar2, rVarC, o0VarE);
                    uVar = c2.u.f22885a;
                    c2.j jVar7 = c2.j.f22691a;
                    bVar2 = d92.b.f58625c;
                    bVar2.getClass();
                    j92.e eVar8 = j92.b.f97899b;
                    float f111 = eVar8.f97920e;
                    jVar7.getClass();
                    c2.j.i iVarI7 = c2.j.i(f111);
                    z47 = z18;
                    h4.g.b bVar110 = h4.d.a.f81534l;
                    aVar8 = h4.r.S;
                    bVar2.getClass();
                    h4.r rVarY7 = c2.l.y(aVar8, eVar8.f97920e);
                    s2VarA = q2.a(iVarI7, bVar110, o0VarE, 48);
                    iHashCode2 = Long.hashCode(o0VarE.U);
                    i2VarA1 = o0VarE.a0();
                    rVarC2 = h4.k.c(rVarY7, o0VarE);
                    if (cVar2 != null) {
                        p3.p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar6);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(eVar, s2VarA, o0VarE);
                    b4.c(c1623g, i2VarA1, o0VarE);
                    if (o0VarE.T) {
                        v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                    } else {
                        v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                    }
                    b4.c(fVar2, rVarC2, o0VarE);
                    u2 u2Var7 = u2.f22900a;
                    bVar2.getClass();
                    cVar = j92.b.f97901d;
                    i36 = i34 & 126;
                    c(d0Var, fVar, cVar.f97906e, null, o0VarE, i36);
                    h4.r rVarX7 = x2.x(u2Var7.a(aVar8, 1.0f, true), null, 3);
                    pVar4 = pVar3;
                    zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, o0VarE, 0);
                    iHashCode3 = Long.hashCode(o0VarE.U);
                    i2VarA2 = o0VarE.a0();
                    rVarC3 = h4.k.c(rVarX7, o0VarE);
                    if (cVar2 != null) {
                        p3.p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar6);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(eVar, zVarA, o0VarE);
                    b4.c(c1623g, i2VarA2, o0VarE);
                    if (o0VarE.T) {
                        v.h.A(iHashCode3, o0VarE, iHashCode3, bVar);
                    } else {
                        v.h.A(iHashCode3, o0VarE, iHashCode3, bVar);
                    }
                    b4.c(fVar2, rVarC3, o0VarE);
                    c2.b0 b0Var7 = c2.b0.f22601a;
                    str = d0Var.f112651d;
                    boolean z515 = d0Var.f112652e;
                    if (str == null) {
                        str = "";
                    }
                    String str14 = str;
                    fVar3 = d92.b.f58624b;
                    fVar3.getClass();
                    x0 x0Var7 = j92.f.f97931h;
                    long jD7 = com.nimbusds.jose.shaded.gson.internal.a.d(o0VarE);
                    d6.p.f57793b.getClass();
                    i37 = d6.p.f57795d;
                    mh.c(str14, null, jD7, null, 0L, null, 0L, null, 0L, i37, false, 1, 0, null, x0Var7, o0VarE, 0, 24960, 110586);
                    o0Var = o0VarE;
                    if (g22.n.d(d0Var.f112653f)) {
                        o0Var.C(1814213146);
                        String str15 = d0Var.f112653f;
                        fVar3.getClass();
                        mh.c(str15, null, 0L, null, 0L, null, 0L, null, 0L, i37, false, 2, 0, null, x0.a(j92.f.f97933j, vb.h.g(o0Var), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), o0Var, 0, 24960, 110590);
                        o0Var.g0(false);
                    } else {
                        o0Var.C(1814479901);
                        o0Var.g0(false);
                    }
                    if (z37) {
                        o0Var.C(1814578171);
                        if (pVar4 == null) {
                            o0Var.C(1814621416);
                            if (z45) {
                                z48 = true;
                            } else {
                                z48 = true;
                            }
                            z.f(d0Var, fVar, z48, null, o0Var, i36, 8);
                            o0Var.g0(false);
                        } else {
                            o0Var.C(1814741944);
                            e5.q((i34 >> 24) & 14, pVar4, o0Var, false);
                        }
                        o0Var.g0(false);
                    } else {
                        o0Var.C(1814578171);
                        if (pVar4 == null) {
                            o0Var.C(1814621416);
                            if (z45) {
                                z48 = true;
                            } else {
                                z48 = true;
                            }
                            z.f(d0Var, fVar, z48, null, o0Var, i36, 8);
                            o0Var.g0(false);
                        } else {
                            o0Var.C(1814741944);
                            e5.q((i34 >> 24) & 14, pVar4, o0Var, false);
                        }
                        o0Var.g0(false);
                    }
                    o0Var.g0(true);
                    if (z37) {
                        o0Var.C(1846551145);
                        if (pVar4 == null) {
                            o0Var.C(1846590918);
                            if (z45) {
                                z49 = true;
                            } else {
                                z49 = true;
                            }
                            z.f(d0Var, fVar, z49, null, o0Var, i36, 8);
                            d0Var2 = d0Var;
                            fVar4 = fVar;
                            o0Var.g0(false);
                        } else {
                            d0Var2 = d0Var;
                            fVar4 = fVar;
                            o0Var.C(1846703510);
                            e5.q((i34 >> 24) & 14, pVar4, o0Var, false);
                        }
                        o0Var.g0(false);
                    } else {
                        o0Var.C(1846551145);
                        if (pVar4 == null) {
                            o0Var.C(1846590918);
                            if (z45) {
                                z49 = true;
                            } else {
                                z49 = true;
                            }
                            z.f(d0Var, fVar, z49, null, o0Var, i36, 8);
                            d0Var2 = d0Var;
                            fVar4 = fVar;
                            o0Var.g0(false);
                        } else {
                            d0Var2 = d0Var;
                            fVar4 = fVar;
                            o0Var.C(1846703510);
                            e5.q((i34 >> 24) & 14, pVar4, o0Var, false);
                        }
                        o0Var.g0(false);
                    }
                    if (z37) {
                        o0Var.C(1846903274);
                        bVar2.getClass();
                        f14 = cVar.f97904c;
                        h4.r rVarD16 = u1.n.d(x2.q(aVar8, f14), new o4.t1(((o4.d0) d92.b.a(o0Var).d().a().f76496r.getF182175a()).f128833a, null), k2.i.f102406a, 4);
                        z0VarD2 = c2.q.d(h4.d.a.f81524b, false);
                        x1 x1Var112 = p3.n.f135158a;
                        iHashCode4 = Long.hashCode(o0Var.U);
                        i2VarA3 = o0Var.a0();
                        rVarC4 = h4.k.c(rVarD16, o0Var);
                        if (cVar2 == null) {
                            p3.p0.l();
                            throw null;
                        }
                        o0Var.z();
                        if (o0Var.T) {
                            o0Var.M(aVar6);
                        } else {
                            o0Var.c();
                        }
                        b4.c(eVar, z0VarD2, o0Var);
                        b4.c(c1623g, i2VarA3, o0Var);
                        if (o0Var.T) {
                            v.h.A(iHashCode4, o0Var, iHashCode4, bVar);
                        } else {
                            v.h.A(iHashCode4, o0Var, iHashCode4, bVar);
                        }
                        b4.c(fVar2, rVarC4, o0Var);
                        u4.d.b bVar111 = u4.d.f168373k;
                        u4.d dVarB12 = n5.e.b(R.drawable.close_x_thick, o0Var, 6);
                        String strQ113 = gl1.y.Q(o0Var, R.string.lbl_dismiss);
                        g6.f.a aVar118 = g6.f.f75994b;
                        h4.r rVarQ12 = x2.q(uVar.c(aVar8, gVar), f14 / 2);
                        String strQ114 = gl1.y.Q(o0Var, R.string.lbl_dismiss);
                        if ((i34 & 458752) == 131072) {
                            z54 = true;
                        } else {
                            z54 = false;
                        }
                        boolean zR16 = z54 | o0Var.r(fVar4) | o0Var.r(context);
                        if (i35 != 4) {
                            z55 = true;
                        } else {
                            z55 = true;
                        }
                        boolean z615 = zR16 | z55;
                        if ((i34 & 3670016) == 1048576) {
                            z56 = true;
                        } else {
                            z56 = false;
                        }
                        z57 = z615 | z56;
                        objQ2 = o0Var.q();
                        if (z57) {
                            aVar4.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = new gw1.g(z45, fVar4, context, d0Var2, z46);
                                o0Var.K(objQ2);
                            }
                        } else {
                            objQ2 = new gw1.g(z45, fVar4, context, d0Var2, z46);
                            o0Var.K(objQ2);
                        }
                        p3.o0 o0Var13 = o0Var;
                        i7.b(dVarB12, strQ113, u1.w.d(rVarQ12, false, strQ114, null, (e23.a) objQ2, 13), am.j.d(o0Var), o0Var13, 0, 0);
                        o0Var = o0Var13;
                        z58 = true;
                        o0Var.g0(true);
                        o0Var.g0(false);
                    } else {
                        o0Var.C(1846903274);
                        bVar2.getClass();
                        f14 = cVar.f97904c;
                        h4.r rVarD17 = u1.n.d(x2.q(aVar8, f14), new o4.t1(((o4.d0) d92.b.a(o0Var).d().a().f76496r.getF182175a()).f128833a, null), k2.i.f102406a, 4);
                        z0VarD2 = c2.q.d(h4.d.a.f81524b, false);
                        x1 x1Var113 = p3.n.f135158a;
                        iHashCode4 = Long.hashCode(o0Var.U);
                        i2VarA3 = o0Var.a0();
                        rVarC4 = h4.k.c(rVarD17, o0Var);
                        if (cVar2 == null) {
                            p3.p0.l();
                            throw null;
                        }
                        o0Var.z();
                        if (o0Var.T) {
                            o0Var.M(aVar6);
                        } else {
                            o0Var.c();
                        }
                        b4.c(eVar, z0VarD2, o0Var);
                        b4.c(c1623g, i2VarA3, o0Var);
                        if (o0Var.T) {
                            v.h.A(iHashCode4, o0Var, iHashCode4, bVar);
                        } else {
                            v.h.A(iHashCode4, o0Var, iHashCode4, bVar);
                        }
                        b4.c(fVar2, rVarC4, o0Var);
                        u4.d.b bVar112 = u4.d.f168373k;
                        u4.d dVarB13 = n5.e.b(R.drawable.close_x_thick, o0Var, 6);
                        String strQ115 = gl1.y.Q(o0Var, R.string.lbl_dismiss);
                        g6.f.a aVar119 = g6.f.f75994b;
                        h4.r rVarQ13 = x2.q(uVar.c(aVar8, gVar), f14 / 2);
                        String strQ116 = gl1.y.Q(o0Var, R.string.lbl_dismiss);
                        if ((i34 & 458752) == 131072) {
                            z54 = true;
                        } else {
                            z54 = false;
                        }
                        boolean zR17 = z54 | o0Var.r(fVar4) | o0Var.r(context);
                        if (i35 != 4) {
                            z55 = true;
                        } else {
                            z55 = true;
                        }
                        boolean z616 = zR17 | z55;
                        if ((i34 & 3670016) == 1048576) {
                            z56 = true;
                        } else {
                            z56 = false;
                        }
                        z57 = z616 | z56;
                        objQ2 = o0Var.q();
                        if (z57) {
                            aVar4.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = new gw1.g(z45, fVar4, context, d0Var2, z46);
                                o0Var.K(objQ2);
                            }
                        } else {
                            objQ2 = new gw1.g(z45, fVar4, context, d0Var2, z46);
                            o0Var.K(objQ2);
                        }
                        p3.o0 o0Var14 = o0Var;
                        i7.b(dVarB13, strQ115, u1.w.d(rVarQ13, false, strQ116, null, (e23.a) objQ2, 13), am.j.d(o0Var), o0Var14, 0, 0);
                        o0Var = o0Var14;
                        z58 = true;
                        o0Var.g0(true);
                        o0Var.g0(false);
                    }
                    o0Var.g0(z58);
                    o0Var.g0(z58);
                    x1 x1Var114 = p3.n.f135158a;
                    pVar2 = pVar4;
                    z26 = z37;
                    aVar2 = aVar7;
                    z29 = z45;
                    z27 = z46;
                    z28 = z47;
                } else {
                    z46 = z24;
                }
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                fVar2 = h5.g.a.f81807d;
                b4.c(fVar2, rVarC, o0VarE);
                uVar = c2.u.f22885a;
                c2.j jVar8 = c2.j.f22691a;
                bVar2 = d92.b.f58625c;
                bVar2.getClass();
                j92.e eVar9 = j92.b.f97899b;
                float f112 = eVar9.f97920e;
                jVar8.getClass();
                c2.j.i iVarI8 = c2.j.i(f112);
                z47 = z18;
                h4.g.b bVar113 = h4.d.a.f81534l;
                aVar8 = h4.r.S;
                bVar2.getClass();
                h4.r rVarY8 = c2.l.y(aVar8, eVar9.f97920e);
                s2VarA = q2.a(iVarI8, bVar113, o0VarE, 48);
                iHashCode2 = Long.hashCode(o0VarE.U);
                i2VarA1 = o0VarE.a0();
                rVarC2 = h4.k.c(rVarY8, o0VarE);
                if (cVar2 != null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar6);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar, s2VarA, o0VarE);
                b4.c(c1623g, i2VarA1, o0VarE);
                if (o0VarE.T) {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                } else {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                }
                b4.c(fVar2, rVarC2, o0VarE);
                u2 u2Var8 = u2.f22900a;
                bVar2.getClass();
                cVar = j92.b.f97901d;
                i36 = i34 & 126;
                c(d0Var, fVar, cVar.f97906e, null, o0VarE, i36);
                h4.r rVarX8 = x2.x(u2Var8.a(aVar8, 1.0f, true), null, 3);
                pVar4 = pVar3;
                zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, o0VarE, 0);
                iHashCode3 = Long.hashCode(o0VarE.U);
                i2VarA2 = o0VarE.a0();
                rVarC3 = h4.k.c(rVarX8, o0VarE);
                if (cVar2 != null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar6);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar, zVarA, o0VarE);
                b4.c(c1623g, i2VarA2, o0VarE);
                if (o0VarE.T) {
                    v.h.A(iHashCode3, o0VarE, iHashCode3, bVar);
                } else {
                    v.h.A(iHashCode3, o0VarE, iHashCode3, bVar);
                }
                b4.c(fVar2, rVarC3, o0VarE);
                c2.b0 b0Var8 = c2.b0.f22601a;
                str = d0Var.f112651d;
                boolean z516 = d0Var.f112652e;
                if (str == null) {
                    str = "";
                }
                String str16 = str;
                fVar3 = d92.b.f58624b;
                fVar3.getClass();
                x0 x0Var8 = j92.f.f97931h;
                long jD8 = com.nimbusds.jose.shaded.gson.internal.a.d(o0VarE);
                d6.p.f57793b.getClass();
                i37 = d6.p.f57795d;
                mh.c(str16, null, jD8, null, 0L, null, 0L, null, 0L, i37, false, 1, 0, null, x0Var8, o0VarE, 0, 24960, 110586);
                o0Var = o0VarE;
                if (g22.n.d(d0Var.f112653f)) {
                    o0Var.C(1814213146);
                    String str17 = d0Var.f112653f;
                    fVar3.getClass();
                    mh.c(str17, null, 0L, null, 0L, null, 0L, null, 0L, i37, false, 2, 0, null, x0.a(j92.f.f97933j, vb.h.g(o0Var), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), o0Var, 0, 24960, 110590);
                    o0Var.g0(false);
                } else {
                    o0Var.C(1814479901);
                    o0Var.g0(false);
                }
                if (z37) {
                    o0Var.C(1814578171);
                    if (pVar4 == null) {
                        o0Var.C(1814621416);
                        if (z45) {
                            z48 = true;
                        } else {
                            z48 = true;
                        }
                        z.f(d0Var, fVar, z48, null, o0Var, i36, 8);
                        o0Var.g0(false);
                    } else {
                        o0Var.C(1814741944);
                        e5.q((i34 >> 24) & 14, pVar4, o0Var, false);
                    }
                    o0Var.g0(false);
                } else {
                    o0Var.C(1814578171);
                    if (pVar4 == null) {
                        o0Var.C(1814621416);
                        if (z45) {
                            z48 = true;
                        } else {
                            z48 = true;
                        }
                        z.f(d0Var, fVar, z48, null, o0Var, i36, 8);
                        o0Var.g0(false);
                    } else {
                        o0Var.C(1814741944);
                        e5.q((i34 >> 24) & 14, pVar4, o0Var, false);
                    }
                    o0Var.g0(false);
                }
                o0Var.g0(true);
                if (z37) {
                    o0Var.C(1846551145);
                    if (pVar4 == null) {
                        o0Var.C(1846590918);
                        if (z45) {
                            z49 = true;
                        } else {
                            z49 = true;
                        }
                        z.f(d0Var, fVar, z49, null, o0Var, i36, 8);
                        d0Var2 = d0Var;
                        fVar4 = fVar;
                        o0Var.g0(false);
                    } else {
                        d0Var2 = d0Var;
                        fVar4 = fVar;
                        o0Var.C(1846703510);
                        e5.q((i34 >> 24) & 14, pVar4, o0Var, false);
                    }
                    o0Var.g0(false);
                } else {
                    o0Var.C(1846551145);
                    if (pVar4 == null) {
                        o0Var.C(1846590918);
                        if (z45) {
                            z49 = true;
                        } else {
                            z49 = true;
                        }
                        z.f(d0Var, fVar, z49, null, o0Var, i36, 8);
                        d0Var2 = d0Var;
                        fVar4 = fVar;
                        o0Var.g0(false);
                    } else {
                        d0Var2 = d0Var;
                        fVar4 = fVar;
                        o0Var.C(1846703510);
                        e5.q((i34 >> 24) & 14, pVar4, o0Var, false);
                    }
                    o0Var.g0(false);
                }
                if (z37) {
                    o0Var.C(1846903274);
                    bVar2.getClass();
                    f14 = cVar.f97904c;
                    h4.r rVarD18 = u1.n.d(x2.q(aVar8, f14), new o4.t1(((o4.d0) d92.b.a(o0Var).d().a().f76496r.getF182175a()).f128833a, null), k2.i.f102406a, 4);
                    z0VarD2 = c2.q.d(h4.d.a.f81524b, false);
                    x1 x1Var115 = p3.n.f135158a;
                    iHashCode4 = Long.hashCode(o0Var.U);
                    i2VarA3 = o0Var.a0();
                    rVarC4 = h4.k.c(rVarD18, o0Var);
                    if (cVar2 == null) {
                        p3.p0.l();
                        throw null;
                    }
                    o0Var.z();
                    if (o0Var.T) {
                        o0Var.M(aVar6);
                    } else {
                        o0Var.c();
                    }
                    b4.c(eVar, z0VarD2, o0Var);
                    b4.c(c1623g, i2VarA3, o0Var);
                    if (o0Var.T) {
                        v.h.A(iHashCode4, o0Var, iHashCode4, bVar);
                    } else {
                        v.h.A(iHashCode4, o0Var, iHashCode4, bVar);
                    }
                    b4.c(fVar2, rVarC4, o0Var);
                    u4.d.b bVar114 = u4.d.f168373k;
                    u4.d dVarB14 = n5.e.b(R.drawable.close_x_thick, o0Var, 6);
                    String strQ117 = gl1.y.Q(o0Var, R.string.lbl_dismiss);
                    g6.f.a aVar1110 = g6.f.f75994b;
                    h4.r rVarQ14 = x2.q(uVar.c(aVar8, gVar), f14 / 2);
                    String strQ118 = gl1.y.Q(o0Var, R.string.lbl_dismiss);
                    if ((i34 & 458752) == 131072) {
                        z54 = true;
                    } else {
                        z54 = false;
                    }
                    boolean zR18 = z54 | o0Var.r(fVar4) | o0Var.r(context);
                    if (i35 != 4) {
                        z55 = true;
                    } else {
                        z55 = true;
                    }
                    boolean z617 = zR18 | z55;
                    if ((i34 & 3670016) == 1048576) {
                        z56 = true;
                    } else {
                        z56 = false;
                    }
                    z57 = z617 | z56;
                    objQ2 = o0Var.q();
                    if (z57) {
                        aVar4.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new gw1.g(z45, fVar4, context, d0Var2, z46);
                            o0Var.K(objQ2);
                        }
                    } else {
                        objQ2 = new gw1.g(z45, fVar4, context, d0Var2, z46);
                        o0Var.K(objQ2);
                    }
                    p3.o0 o0Var15 = o0Var;
                    i7.b(dVarB14, strQ117, u1.w.d(rVarQ14, false, strQ118, null, (e23.a) objQ2, 13), am.j.d(o0Var), o0Var15, 0, 0);
                    o0Var = o0Var15;
                    z58 = true;
                    o0Var.g0(true);
                    o0Var.g0(false);
                } else {
                    o0Var.C(1846903274);
                    bVar2.getClass();
                    f14 = cVar.f97904c;
                    h4.r rVarD19 = u1.n.d(x2.q(aVar8, f14), new o4.t1(((o4.d0) d92.b.a(o0Var).d().a().f76496r.getF182175a()).f128833a, null), k2.i.f102406a, 4);
                    z0VarD2 = c2.q.d(h4.d.a.f81524b, false);
                    x1 x1Var116 = p3.n.f135158a;
                    iHashCode4 = Long.hashCode(o0Var.U);
                    i2VarA3 = o0Var.a0();
                    rVarC4 = h4.k.c(rVarD19, o0Var);
                    if (cVar2 == null) {
                        p3.p0.l();
                        throw null;
                    }
                    o0Var.z();
                    if (o0Var.T) {
                        o0Var.M(aVar6);
                    } else {
                        o0Var.c();
                    }
                    b4.c(eVar, z0VarD2, o0Var);
                    b4.c(c1623g, i2VarA3, o0Var);
                    if (o0Var.T) {
                        v.h.A(iHashCode4, o0Var, iHashCode4, bVar);
                    } else {
                        v.h.A(iHashCode4, o0Var, iHashCode4, bVar);
                    }
                    b4.c(fVar2, rVarC4, o0Var);
                    u4.d.b bVar115 = u4.d.f168373k;
                    u4.d dVarB15 = n5.e.b(R.drawable.close_x_thick, o0Var, 6);
                    String strQ119 = gl1.y.Q(o0Var, R.string.lbl_dismiss);
                    g6.f.a aVar1111 = g6.f.f75994b;
                    h4.r rVarQ15 = x2.q(uVar.c(aVar8, gVar), f14 / 2);
                    String strQ1110 = gl1.y.Q(o0Var, R.string.lbl_dismiss);
                    if ((i34 & 458752) == 131072) {
                        z54 = true;
                    } else {
                        z54 = false;
                    }
                    boolean zR19 = z54 | o0Var.r(fVar4) | o0Var.r(context);
                    if (i35 != 4) {
                        z55 = true;
                    } else {
                        z55 = true;
                    }
                    boolean z618 = zR19 | z55;
                    if ((i34 & 3670016) == 1048576) {
                        z56 = true;
                    } else {
                        z56 = false;
                    }
                    z57 = z618 | z56;
                    objQ2 = o0Var.q();
                    if (z57) {
                        aVar4.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new gw1.g(z45, fVar4, context, d0Var2, z46);
                            o0Var.K(objQ2);
                        }
                    } else {
                        objQ2 = new gw1.g(z45, fVar4, context, d0Var2, z46);
                        o0Var.K(objQ2);
                    }
                    p3.o0 o0Var16 = o0Var;
                    i7.b(dVarB15, strQ119, u1.w.d(rVarQ15, false, strQ1110, null, (e23.a) objQ2, 13), am.j.d(o0Var), o0Var16, 0, 0);
                    o0Var = o0Var16;
                    z58 = true;
                    o0Var.g0(true);
                    o0Var.g0(false);
                }
                o0Var.g0(z58);
                o0Var.g0(z58);
                x1 x1Var117 = p3.n.f135158a;
                pVar2 = pVar4;
                z26 = z37;
                aVar2 = aVar7;
                z29 = z45;
                z27 = z46;
                z28 = z47;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                z26 = z15;
                aVar2 = aVar;
                z27 = z24;
                z28 = z18;
                z29 = z19;
                pVar2 = pVar;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new com.google.maps.android.compose.streetview.a(d0Var, fVar, rVar, z28, z26, z29, z27, aVar2, pVar2, i14, i15);
            }
        }
        i16 |= 3072;
        z18 = z14;
        i17 = i15 & 16;
        if (i17 != 0) {
            if ((i14 & 24576) == 0) {
                if (o0VarE.h(z15)) {
                    i18 = 16384;
                } else {
                    i18 = 8192;
                }
                i16 |= i18;
            }
            i19 = i15 & 32;
            if (i19 != 0) {
                i16 |= 196608;
                z19 = z16;
            } else {
                z19 = z16;
                if ((i14 & 196608) == 0) {
                    if (o0VarE.h(z19)) {
                        i24 = 131072;
                    } else {
                        i24 = 65536;
                    }
                    i16 |= i24;
                }
            }
            i25 = i15 & 64;
            if (i25 != 0) {
                i16 |= 1572864;
                z24 = z17;
            } else {
                z24 = z17;
                if ((i14 & 1572864) == 0) {
                    if (o0VarE.h(z24)) {
                        i26 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    } else {
                        i26 = 524288;
                    }
                    i16 |= i26;
                }
            }
            i27 = i15 & 128;
            if (i27 != 0) {
                i16 |= 12582912;
            } else if ((i14 & 12582912) == 0) {
                if (o0VarE.r(aVar)) {
                    i28 = 8388608;
                } else {
                    i28 = 4194304;
                }
                i16 |= i28;
            }
            i29 = i15 & 256;
            if (i29 != 0) {
                if ((i14 & 100663296) == 0) {
                    if (o0VarE.r(pVar)) {
                        i30 = 67108864;
                    } else {
                        i30 = 33554432;
                    }
                    i16 |= i30;
                }
                i34 = i16;
                if ((i16 & 38347923) != 38347922) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                if (o0VarE.n(i34 & 1, z25)) {
                    if (i38 != 0) {
                        z18 = false;
                    }
                    if (i17 != 0) {
                        z34 = false;
                    } else {
                        z34 = z15;
                    }
                    if (i19 != 0) {
                        z35 = false;
                    } else {
                        z35 = z19;
                    }
                    if (i25 != 0) {
                        z24 = false;
                    }
                    if (i27 != 0) {
                        aVar3 = null;
                    } else {
                        aVar3 = aVar;
                    }
                    if (i29 != 0) {
                        pVar3 = null;
                    } else {
                        pVar3 = pVar;
                    }
                    x1 x1Var118 = p3.n.f135158a;
                    context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                    if (((g6.c) o0VarE.A(t1.f91490h)).getF94882b() >= 1.3d) {
                        z36 = true;
                    } else {
                        z36 = false;
                    }
                    h4.d.f81522a.getClass();
                    gVar = h4.d.a.f81528f;
                    z37 = z34;
                    h4.r rVarE5 = u1.n.e(x2.x(x2.f(rVar, 1.0f), null, 3), am.j.c(d92.b.f58623a, o0VarE), m1.f128891a);
                    if ((i34 & 29360128) == 8388608) {
                        z38 = true;
                    } else {
                        z38 = false;
                    }
                    boolean zR110 = z38 | o0VarE.r(fVar) | o0VarE.r(context);
                    i35 = i34 & 14;
                    if (i35 != 4) {
                        z39 = true;
                    } else {
                        z39 = true;
                    }
                    z44 = zR110 | z39;
                    objQ = o0VarE.q();
                    aVar4 = p3.m.f135153a;
                    if (z44) {
                        aVar4.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            e23.a<Unit> aVar1112 = aVar3;
                            objQ = new ho.d0((Object) aVar1112, (Object) fVar, (Object) context, (Object) d0Var, 18, (byte) 0);
                            aVar5 = aVar1112;
                            o0VarE.K(objQ);
                        } else {
                            aVar5 = aVar3;
                        }
                    } else {
                        e23.a<Unit> aVar1113 = aVar3;
                        objQ = new ho.d0((Object) aVar1113, (Object) fVar, (Object) context, (Object) d0Var, 18, (byte) 0);
                        aVar5 = aVar1113;
                        o0VarE.K(objQ);
                    }
                    h4.r rVarD110 = u1.w.d(rVarE5, false, null, null, (e23.a) objQ, 15);
                    z0VarD = c2.q.d(gVar, false);
                    iHashCode = Long.hashCode(o0VarE.U);
                    i2VarA0 = o0VarE.a0();
                    rVarC = h4.k.c(rVarD110, o0VarE);
                    h5.g.V.getClass();
                    aVar6 = h5.g.a.f81805b;
                    if (cVar2 != null) {
                        p3.p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    aVar7 = aVar5;
                    if (o0VarE.T) {
                        o0VarE.M(aVar6);
                    } else {
                        o0VarE.c();
                    }
                    eVar = h5.g.a.f81810g;
                    b4.c(eVar, z0VarD, o0VarE);
                    c1623g = h5.g.a.f81809f;
                    b4.c(c1623g, i2VarA0, o0VarE);
                    bVar = h5.g.a.f81813j;
                    z45 = z35;
                    if (o0VarE.T) {
                        z46 = z24;
                        if (!p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                        }
                        fVar2 = h5.g.a.f81807d;
                        b4.c(fVar2, rVarC, o0VarE);
                        uVar = c2.u.f22885a;
                        c2.j jVar9 = c2.j.f22691a;
                        bVar2 = d92.b.f58625c;
                        bVar2.getClass();
                        j92.e eVar10 = j92.b.f97899b;
                        float f113 = eVar10.f97920e;
                        jVar9.getClass();
                        c2.j.i iVarI9 = c2.j.i(f113);
                        z47 = z18;
                        h4.g.b bVar116 = h4.d.a.f81534l;
                        aVar8 = h4.r.S;
                        bVar2.getClass();
                        h4.r rVarY9 = c2.l.y(aVar8, eVar10.f97920e);
                        s2VarA = q2.a(iVarI9, bVar116, o0VarE, 48);
                        iHashCode2 = Long.hashCode(o0VarE.U);
                        i2VarA1 = o0VarE.a0();
                        rVarC2 = h4.k.c(rVarY9, o0VarE);
                        if (cVar2 != null) {
                            p3.p0.l();
                            throw null;
                        }
                        o0VarE.z();
                        if (o0VarE.T) {
                            o0VarE.M(aVar6);
                        } else {
                            o0VarE.c();
                        }
                        b4.c(eVar, s2VarA, o0VarE);
                        b4.c(c1623g, i2VarA1, o0VarE);
                        if (o0VarE.T) {
                            v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                        } else {
                            v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                        }
                        b4.c(fVar2, rVarC2, o0VarE);
                        u2 u2Var9 = u2.f22900a;
                        bVar2.getClass();
                        cVar = j92.b.f97901d;
                        i36 = i34 & 126;
                        c(d0Var, fVar, cVar.f97906e, null, o0VarE, i36);
                        h4.r rVarX9 = x2.x(u2Var9.a(aVar8, 1.0f, true), null, 3);
                        pVar4 = pVar3;
                        zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, o0VarE, 0);
                        iHashCode3 = Long.hashCode(o0VarE.U);
                        i2VarA2 = o0VarE.a0();
                        rVarC3 = h4.k.c(rVarX9, o0VarE);
                        if (cVar2 != null) {
                            p3.p0.l();
                            throw null;
                        }
                        o0VarE.z();
                        if (o0VarE.T) {
                            o0VarE.M(aVar6);
                        } else {
                            o0VarE.c();
                        }
                        b4.c(eVar, zVarA, o0VarE);
                        b4.c(c1623g, i2VarA2, o0VarE);
                        if (o0VarE.T) {
                            v.h.A(iHashCode3, o0VarE, iHashCode3, bVar);
                        } else {
                            v.h.A(iHashCode3, o0VarE, iHashCode3, bVar);
                        }
                        b4.c(fVar2, rVarC3, o0VarE);
                        c2.b0 b0Var9 = c2.b0.f22601a;
                        str = d0Var.f112651d;
                        boolean z517 = d0Var.f112652e;
                        if (str == null) {
                            str = "";
                        }
                        String str18 = str;
                        fVar3 = d92.b.f58624b;
                        fVar3.getClass();
                        x0 x0Var9 = j92.f.f97931h;
                        long jD9 = com.nimbusds.jose.shaded.gson.internal.a.d(o0VarE);
                        d6.p.f57793b.getClass();
                        i37 = d6.p.f57795d;
                        mh.c(str18, null, jD9, null, 0L, null, 0L, null, 0L, i37, false, 1, 0, null, x0Var9, o0VarE, 0, 24960, 110586);
                        o0Var = o0VarE;
                        if (g22.n.d(d0Var.f112653f)) {
                            o0Var.C(1814213146);
                            String str19 = d0Var.f112653f;
                            fVar3.getClass();
                            mh.c(str19, null, 0L, null, 0L, null, 0L, null, 0L, i37, false, 2, 0, null, x0.a(j92.f.f97933j, vb.h.g(o0Var), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), o0Var, 0, 24960, 110590);
                            o0Var.g0(false);
                        } else {
                            o0Var.C(1814479901);
                            o0Var.g0(false);
                        }
                        if (z37) {
                            o0Var.C(1814578171);
                            if (pVar4 == null) {
                                o0Var.C(1814621416);
                                if (z45) {
                                    z48 = true;
                                } else {
                                    z48 = true;
                                }
                                z.f(d0Var, fVar, z48, null, o0Var, i36, 8);
                                o0Var.g0(false);
                            } else {
                                o0Var.C(1814741944);
                                e5.q((i34 >> 24) & 14, pVar4, o0Var, false);
                            }
                            o0Var.g0(false);
                        } else {
                            o0Var.C(1814578171);
                            if (pVar4 == null) {
                                o0Var.C(1814621416);
                                if (z45) {
                                    z48 = true;
                                } else {
                                    z48 = true;
                                }
                                z.f(d0Var, fVar, z48, null, o0Var, i36, 8);
                                o0Var.g0(false);
                            } else {
                                o0Var.C(1814741944);
                                e5.q((i34 >> 24) & 14, pVar4, o0Var, false);
                            }
                            o0Var.g0(false);
                        }
                        o0Var.g0(true);
                        if (z37) {
                            o0Var.C(1846551145);
                            if (pVar4 == null) {
                                o0Var.C(1846590918);
                                if (z45) {
                                    z49 = true;
                                } else {
                                    z49 = true;
                                }
                                z.f(d0Var, fVar, z49, null, o0Var, i36, 8);
                                d0Var2 = d0Var;
                                fVar4 = fVar;
                                o0Var.g0(false);
                            } else {
                                d0Var2 = d0Var;
                                fVar4 = fVar;
                                o0Var.C(1846703510);
                                e5.q((i34 >> 24) & 14, pVar4, o0Var, false);
                            }
                            o0Var.g0(false);
                        } else {
                            o0Var.C(1846551145);
                            if (pVar4 == null) {
                                o0Var.C(1846590918);
                                if (z45) {
                                    z49 = true;
                                } else {
                                    z49 = true;
                                }
                                z.f(d0Var, fVar, z49, null, o0Var, i36, 8);
                                d0Var2 = d0Var;
                                fVar4 = fVar;
                                o0Var.g0(false);
                            } else {
                                d0Var2 = d0Var;
                                fVar4 = fVar;
                                o0Var.C(1846703510);
                                e5.q((i34 >> 24) & 14, pVar4, o0Var, false);
                            }
                            o0Var.g0(false);
                        }
                        if (z37) {
                            o0Var.C(1846903274);
                            bVar2.getClass();
                            f14 = cVar.f97904c;
                            h4.r rVarD111 = u1.n.d(x2.q(aVar8, f14), new o4.t1(((o4.d0) d92.b.a(o0Var).d().a().f76496r.getF182175a()).f128833a, null), k2.i.f102406a, 4);
                            z0VarD2 = c2.q.d(h4.d.a.f81524b, false);
                            x1 x1Var119 = p3.n.f135158a;
                            iHashCode4 = Long.hashCode(o0Var.U);
                            i2VarA3 = o0Var.a0();
                            rVarC4 = h4.k.c(rVarD111, o0Var);
                            if (cVar2 == null) {
                                p3.p0.l();
                                throw null;
                            }
                            o0Var.z();
                            if (o0Var.T) {
                                o0Var.M(aVar6);
                            } else {
                                o0Var.c();
                            }
                            b4.c(eVar, z0VarD2, o0Var);
                            b4.c(c1623g, i2VarA3, o0Var);
                            if (o0Var.T) {
                                v.h.A(iHashCode4, o0Var, iHashCode4, bVar);
                            } else {
                                v.h.A(iHashCode4, o0Var, iHashCode4, bVar);
                            }
                            b4.c(fVar2, rVarC4, o0Var);
                            u4.d.b bVar117 = u4.d.f168373k;
                            u4.d dVarB16 = n5.e.b(R.drawable.close_x_thick, o0Var, 6);
                            String strQ1111 = gl1.y.Q(o0Var, R.string.lbl_dismiss);
                            g6.f.a aVar1114 = g6.f.f75994b;
                            h4.r rVarQ16 = x2.q(uVar.c(aVar8, gVar), f14 / 2);
                            String strQ1112 = gl1.y.Q(o0Var, R.string.lbl_dismiss);
                            if ((i34 & 458752) == 131072) {
                                z54 = true;
                            } else {
                                z54 = false;
                            }
                            boolean zR111 = z54 | o0Var.r(fVar4) | o0Var.r(context);
                            if (i35 != 4) {
                                z55 = true;
                            } else {
                                z55 = true;
                            }
                            boolean z619 = zR111 | z55;
                            if ((i34 & 3670016) == 1048576) {
                                z56 = true;
                            } else {
                                z56 = false;
                            }
                            z57 = z619 | z56;
                            objQ2 = o0Var.q();
                            if (z57) {
                                aVar4.getClass();
                                if (objQ2 == p3.m.a.f135155b) {
                                    objQ2 = new gw1.g(z45, fVar4, context, d0Var2, z46);
                                    o0Var.K(objQ2);
                                }
                            } else {
                                objQ2 = new gw1.g(z45, fVar4, context, d0Var2, z46);
                                o0Var.K(objQ2);
                            }
                            p3.o0 o0Var17 = o0Var;
                            i7.b(dVarB16, strQ1111, u1.w.d(rVarQ16, false, strQ1112, null, (e23.a) objQ2, 13), am.j.d(o0Var), o0Var17, 0, 0);
                            o0Var = o0Var17;
                            z58 = true;
                            o0Var.g0(true);
                            o0Var.g0(false);
                        } else {
                            o0Var.C(1846903274);
                            bVar2.getClass();
                            f14 = cVar.f97904c;
                            h4.r rVarD112 = u1.n.d(x2.q(aVar8, f14), new o4.t1(((o4.d0) d92.b.a(o0Var).d().a().f76496r.getF182175a()).f128833a, null), k2.i.f102406a, 4);
                            z0VarD2 = c2.q.d(h4.d.a.f81524b, false);
                            x1 x1Var1110 = p3.n.f135158a;
                            iHashCode4 = Long.hashCode(o0Var.U);
                            i2VarA3 = o0Var.a0();
                            rVarC4 = h4.k.c(rVarD112, o0Var);
                            if (cVar2 == null) {
                                p3.p0.l();
                                throw null;
                            }
                            o0Var.z();
                            if (o0Var.T) {
                                o0Var.M(aVar6);
                            } else {
                                o0Var.c();
                            }
                            b4.c(eVar, z0VarD2, o0Var);
                            b4.c(c1623g, i2VarA3, o0Var);
                            if (o0Var.T) {
                                v.h.A(iHashCode4, o0Var, iHashCode4, bVar);
                            } else {
                                v.h.A(iHashCode4, o0Var, iHashCode4, bVar);
                            }
                            b4.c(fVar2, rVarC4, o0Var);
                            u4.d.b bVar118 = u4.d.f168373k;
                            u4.d dVarB17 = n5.e.b(R.drawable.close_x_thick, o0Var, 6);
                            String strQ1113 = gl1.y.Q(o0Var, R.string.lbl_dismiss);
                            g6.f.a aVar1115 = g6.f.f75994b;
                            h4.r rVarQ17 = x2.q(uVar.c(aVar8, gVar), f14 / 2);
                            String strQ1114 = gl1.y.Q(o0Var, R.string.lbl_dismiss);
                            if ((i34 & 458752) == 131072) {
                                z54 = true;
                            } else {
                                z54 = false;
                            }
                            boolean zR112 = z54 | o0Var.r(fVar4) | o0Var.r(context);
                            if (i35 != 4) {
                                z55 = true;
                            } else {
                                z55 = true;
                            }
                            boolean z6110 = zR112 | z55;
                            if ((i34 & 3670016) == 1048576) {
                                z56 = true;
                            } else {
                                z56 = false;
                            }
                            z57 = z6110 | z56;
                            objQ2 = o0Var.q();
                            if (z57) {
                                aVar4.getClass();
                                if (objQ2 == p3.m.a.f135155b) {
                                    objQ2 = new gw1.g(z45, fVar4, context, d0Var2, z46);
                                    o0Var.K(objQ2);
                                }
                            } else {
                                objQ2 = new gw1.g(z45, fVar4, context, d0Var2, z46);
                                o0Var.K(objQ2);
                            }
                            p3.o0 o0Var18 = o0Var;
                            i7.b(dVarB17, strQ1113, u1.w.d(rVarQ17, false, strQ1114, null, (e23.a) objQ2, 13), am.j.d(o0Var), o0Var18, 0, 0);
                            o0Var = o0Var18;
                            z58 = true;
                            o0Var.g0(true);
                            o0Var.g0(false);
                        }
                        o0Var.g0(z58);
                        o0Var.g0(z58);
                        x1 x1Var1111 = p3.n.f135158a;
                        pVar2 = pVar4;
                        z26 = z37;
                        aVar2 = aVar7;
                        z29 = z45;
                        z27 = z46;
                        z28 = z47;
                    } else {
                        z46 = z24;
                    }
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                    fVar2 = h5.g.a.f81807d;
                    b4.c(fVar2, rVarC, o0VarE);
                    uVar = c2.u.f22885a;
                    c2.j jVar10 = c2.j.f22691a;
                    bVar2 = d92.b.f58625c;
                    bVar2.getClass();
                    j92.e eVar11 = j92.b.f97899b;
                    float f114 = eVar11.f97920e;
                    jVar10.getClass();
                    c2.j.i iVarI10 = c2.j.i(f114);
                    z47 = z18;
                    h4.g.b bVar119 = h4.d.a.f81534l;
                    aVar8 = h4.r.S;
                    bVar2.getClass();
                    h4.r rVarY10 = c2.l.y(aVar8, eVar11.f97920e);
                    s2VarA = q2.a(iVarI10, bVar119, o0VarE, 48);
                    iHashCode2 = Long.hashCode(o0VarE.U);
                    i2VarA1 = o0VarE.a0();
                    rVarC2 = h4.k.c(rVarY10, o0VarE);
                    if (cVar2 != null) {
                        p3.p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar6);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(eVar, s2VarA, o0VarE);
                    b4.c(c1623g, i2VarA1, o0VarE);
                    if (o0VarE.T) {
                        v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                    } else {
                        v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                    }
                    b4.c(fVar2, rVarC2, o0VarE);
                    u2 u2Var10 = u2.f22900a;
                    bVar2.getClass();
                    cVar = j92.b.f97901d;
                    i36 = i34 & 126;
                    c(d0Var, fVar, cVar.f97906e, null, o0VarE, i36);
                    h4.r rVarX10 = x2.x(u2Var10.a(aVar8, 1.0f, true), null, 3);
                    pVar4 = pVar3;
                    zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, o0VarE, 0);
                    iHashCode3 = Long.hashCode(o0VarE.U);
                    i2VarA2 = o0VarE.a0();
                    rVarC3 = h4.k.c(rVarX10, o0VarE);
                    if (cVar2 != null) {
                        p3.p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar6);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(eVar, zVarA, o0VarE);
                    b4.c(c1623g, i2VarA2, o0VarE);
                    if (o0VarE.T) {
                        v.h.A(iHashCode3, o0VarE, iHashCode3, bVar);
                    } else {
                        v.h.A(iHashCode3, o0VarE, iHashCode3, bVar);
                    }
                    b4.c(fVar2, rVarC3, o0VarE);
                    c2.b0 b0Var10 = c2.b0.f22601a;
                    str = d0Var.f112651d;
                    boolean z518 = d0Var.f112652e;
                    if (str == null) {
                        str = "";
                    }
                    String str110 = str;
                    fVar3 = d92.b.f58624b;
                    fVar3.getClass();
                    x0 x0Var10 = j92.f.f97931h;
                    long jD10 = com.nimbusds.jose.shaded.gson.internal.a.d(o0VarE);
                    d6.p.f57793b.getClass();
                    i37 = d6.p.f57795d;
                    mh.c(str110, null, jD10, null, 0L, null, 0L, null, 0L, i37, false, 1, 0, null, x0Var10, o0VarE, 0, 24960, 110586);
                    o0Var = o0VarE;
                    if (g22.n.d(d0Var.f112653f)) {
                        o0Var.C(1814213146);
                        String str111 = d0Var.f112653f;
                        fVar3.getClass();
                        mh.c(str111, null, 0L, null, 0L, null, 0L, null, 0L, i37, false, 2, 0, null, x0.a(j92.f.f97933j, vb.h.g(o0Var), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), o0Var, 0, 24960, 110590);
                        o0Var.g0(false);
                    } else {
                        o0Var.C(1814479901);
                        o0Var.g0(false);
                    }
                    if (z37) {
                        o0Var.C(1814578171);
                        if (pVar4 == null) {
                            o0Var.C(1814621416);
                            if (z45) {
                                z48 = true;
                            } else {
                                z48 = true;
                            }
                            z.f(d0Var, fVar, z48, null, o0Var, i36, 8);
                            o0Var.g0(false);
                        } else {
                            o0Var.C(1814741944);
                            e5.q((i34 >> 24) & 14, pVar4, o0Var, false);
                        }
                        o0Var.g0(false);
                    } else {
                        o0Var.C(1814578171);
                        if (pVar4 == null) {
                            o0Var.C(1814621416);
                            if (z45) {
                                z48 = true;
                            } else {
                                z48 = true;
                            }
                            z.f(d0Var, fVar, z48, null, o0Var, i36, 8);
                            o0Var.g0(false);
                        } else {
                            o0Var.C(1814741944);
                            e5.q((i34 >> 24) & 14, pVar4, o0Var, false);
                        }
                        o0Var.g0(false);
                    }
                    o0Var.g0(true);
                    if (z37) {
                        o0Var.C(1846551145);
                        if (pVar4 == null) {
                            o0Var.C(1846590918);
                            if (z45) {
                                z49 = true;
                            } else {
                                z49 = true;
                            }
                            z.f(d0Var, fVar, z49, null, o0Var, i36, 8);
                            d0Var2 = d0Var;
                            fVar4 = fVar;
                            o0Var.g0(false);
                        } else {
                            d0Var2 = d0Var;
                            fVar4 = fVar;
                            o0Var.C(1846703510);
                            e5.q((i34 >> 24) & 14, pVar4, o0Var, false);
                        }
                        o0Var.g0(false);
                    } else {
                        o0Var.C(1846551145);
                        if (pVar4 == null) {
                            o0Var.C(1846590918);
                            if (z45) {
                                z49 = true;
                            } else {
                                z49 = true;
                            }
                            z.f(d0Var, fVar, z49, null, o0Var, i36, 8);
                            d0Var2 = d0Var;
                            fVar4 = fVar;
                            o0Var.g0(false);
                        } else {
                            d0Var2 = d0Var;
                            fVar4 = fVar;
                            o0Var.C(1846703510);
                            e5.q((i34 >> 24) & 14, pVar4, o0Var, false);
                        }
                        o0Var.g0(false);
                    }
                    if (z37) {
                        o0Var.C(1846903274);
                        bVar2.getClass();
                        f14 = cVar.f97904c;
                        h4.r rVarD113 = u1.n.d(x2.q(aVar8, f14), new o4.t1(((o4.d0) d92.b.a(o0Var).d().a().f76496r.getF182175a()).f128833a, null), k2.i.f102406a, 4);
                        z0VarD2 = c2.q.d(h4.d.a.f81524b, false);
                        x1 x1Var1112 = p3.n.f135158a;
                        iHashCode4 = Long.hashCode(o0Var.U);
                        i2VarA3 = o0Var.a0();
                        rVarC4 = h4.k.c(rVarD113, o0Var);
                        if (cVar2 == null) {
                            p3.p0.l();
                            throw null;
                        }
                        o0Var.z();
                        if (o0Var.T) {
                            o0Var.M(aVar6);
                        } else {
                            o0Var.c();
                        }
                        b4.c(eVar, z0VarD2, o0Var);
                        b4.c(c1623g, i2VarA3, o0Var);
                        if (o0Var.T) {
                            v.h.A(iHashCode4, o0Var, iHashCode4, bVar);
                        } else {
                            v.h.A(iHashCode4, o0Var, iHashCode4, bVar);
                        }
                        b4.c(fVar2, rVarC4, o0Var);
                        u4.d.b bVar1110 = u4.d.f168373k;
                        u4.d dVarB18 = n5.e.b(R.drawable.close_x_thick, o0Var, 6);
                        String strQ1115 = gl1.y.Q(o0Var, R.string.lbl_dismiss);
                        g6.f.a aVar1116 = g6.f.f75994b;
                        h4.r rVarQ18 = x2.q(uVar.c(aVar8, gVar), f14 / 2);
                        String strQ1116 = gl1.y.Q(o0Var, R.string.lbl_dismiss);
                        if ((i34 & 458752) == 131072) {
                            z54 = true;
                        } else {
                            z54 = false;
                        }
                        boolean zR113 = z54 | o0Var.r(fVar4) | o0Var.r(context);
                        if (i35 != 4) {
                            z55 = true;
                        } else {
                            z55 = true;
                        }
                        boolean z6111 = zR113 | z55;
                        if ((i34 & 3670016) == 1048576) {
                            z56 = true;
                        } else {
                            z56 = false;
                        }
                        z57 = z6111 | z56;
                        objQ2 = o0Var.q();
                        if (z57) {
                            aVar4.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = new gw1.g(z45, fVar4, context, d0Var2, z46);
                                o0Var.K(objQ2);
                            }
                        } else {
                            objQ2 = new gw1.g(z45, fVar4, context, d0Var2, z46);
                            o0Var.K(objQ2);
                        }
                        p3.o0 o0Var19 = o0Var;
                        i7.b(dVarB18, strQ1115, u1.w.d(rVarQ18, false, strQ1116, null, (e23.a) objQ2, 13), am.j.d(o0Var), o0Var19, 0, 0);
                        o0Var = o0Var19;
                        z58 = true;
                        o0Var.g0(true);
                        o0Var.g0(false);
                    } else {
                        o0Var.C(1846903274);
                        bVar2.getClass();
                        f14 = cVar.f97904c;
                        h4.r rVarD114 = u1.n.d(x2.q(aVar8, f14), new o4.t1(((o4.d0) d92.b.a(o0Var).d().a().f76496r.getF182175a()).f128833a, null), k2.i.f102406a, 4);
                        z0VarD2 = c2.q.d(h4.d.a.f81524b, false);
                        x1 x1Var1113 = p3.n.f135158a;
                        iHashCode4 = Long.hashCode(o0Var.U);
                        i2VarA3 = o0Var.a0();
                        rVarC4 = h4.k.c(rVarD114, o0Var);
                        if (cVar2 == null) {
                            p3.p0.l();
                            throw null;
                        }
                        o0Var.z();
                        if (o0Var.T) {
                            o0Var.M(aVar6);
                        } else {
                            o0Var.c();
                        }
                        b4.c(eVar, z0VarD2, o0Var);
                        b4.c(c1623g, i2VarA3, o0Var);
                        if (o0Var.T) {
                            v.h.A(iHashCode4, o0Var, iHashCode4, bVar);
                        } else {
                            v.h.A(iHashCode4, o0Var, iHashCode4, bVar);
                        }
                        b4.c(fVar2, rVarC4, o0Var);
                        u4.d.b bVar1111 = u4.d.f168373k;
                        u4.d dVarB19 = n5.e.b(R.drawable.close_x_thick, o0Var, 6);
                        String strQ1117 = gl1.y.Q(o0Var, R.string.lbl_dismiss);
                        g6.f.a aVar1117 = g6.f.f75994b;
                        h4.r rVarQ19 = x2.q(uVar.c(aVar8, gVar), f14 / 2);
                        String strQ1118 = gl1.y.Q(o0Var, R.string.lbl_dismiss);
                        if ((i34 & 458752) == 131072) {
                            z54 = true;
                        } else {
                            z54 = false;
                        }
                        boolean zR114 = z54 | o0Var.r(fVar4) | o0Var.r(context);
                        if (i35 != 4) {
                            z55 = true;
                        } else {
                            z55 = true;
                        }
                        boolean z6112 = zR114 | z55;
                        if ((i34 & 3670016) == 1048576) {
                            z56 = true;
                        } else {
                            z56 = false;
                        }
                        z57 = z6112 | z56;
                        objQ2 = o0Var.q();
                        if (z57) {
                            aVar4.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = new gw1.g(z45, fVar4, context, d0Var2, z46);
                                o0Var.K(objQ2);
                            }
                        } else {
                            objQ2 = new gw1.g(z45, fVar4, context, d0Var2, z46);
                            o0Var.K(objQ2);
                        }
                        p3.o0 o0Var110 = o0Var;
                        i7.b(dVarB19, strQ1117, u1.w.d(rVarQ19, false, strQ1118, null, (e23.a) objQ2, 13), am.j.d(o0Var), o0Var110, 0, 0);
                        o0Var = o0Var110;
                        z58 = true;
                        o0Var.g0(true);
                        o0Var.g0(false);
                    }
                    o0Var.g0(z58);
                    o0Var.g0(z58);
                    x1 x1Var1114 = p3.n.f135158a;
                    pVar2 = pVar4;
                    z26 = z37;
                    aVar2 = aVar7;
                    z29 = z45;
                    z27 = z46;
                    z28 = z47;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    z26 = z15;
                    aVar2 = aVar;
                    z27 = z24;
                    z28 = z18;
                    z29 = z19;
                    pVar2 = pVar;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new com.google.maps.android.compose.streetview.a(d0Var, fVar, rVar, z28, z26, z29, z27, aVar2, pVar2, i14, i15);
                }
            }
            i16 |= 100663296;
            i34 = i16;
            if ((i16 & 38347923) != 38347922) {
                z25 = true;
            } else {
                z25 = false;
            }
            if (o0VarE.n(i34 & 1, z25)) {
                if (i38 != 0) {
                    z18 = false;
                }
                if (i17 != 0) {
                    z34 = false;
                } else {
                    z34 = z15;
                }
                if (i19 != 0) {
                    z35 = false;
                } else {
                    z35 = z19;
                }
                if (i25 != 0) {
                    z24 = false;
                }
                if (i27 != 0) {
                    aVar3 = null;
                } else {
                    aVar3 = aVar;
                }
                if (i29 != 0) {
                    pVar3 = null;
                } else {
                    pVar3 = pVar;
                }
                x1 x1Var1115 = p3.n.f135158a;
                context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                if (((g6.c) o0VarE.A(t1.f91490h)).getF94882b() >= 1.3d) {
                    z36 = true;
                } else {
                    z36 = false;
                }
                h4.d.f81522a.getClass();
                gVar = h4.d.a.f81528f;
                z37 = z34;
                h4.r rVarE6 = u1.n.e(x2.x(x2.f(rVar, 1.0f), null, 3), am.j.c(d92.b.f58623a, o0VarE), m1.f128891a);
                if ((i34 & 29360128) == 8388608) {
                    z38 = true;
                } else {
                    z38 = false;
                }
                boolean zR115 = z38 | o0VarE.r(fVar) | o0VarE.r(context);
                i35 = i34 & 14;
                if (i35 != 4) {
                    z39 = true;
                } else {
                    z39 = true;
                }
                z44 = zR115 | z39;
                objQ = o0VarE.q();
                aVar4 = p3.m.f135153a;
                if (z44) {
                    aVar4.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        e23.a<Unit> aVar1118 = aVar3;
                        objQ = new ho.d0((Object) aVar1118, (Object) fVar, (Object) context, (Object) d0Var, 18, (byte) 0);
                        aVar5 = aVar1118;
                        o0VarE.K(objQ);
                    } else {
                        aVar5 = aVar3;
                    }
                } else {
                    e23.a<Unit> aVar1119 = aVar3;
                    objQ = new ho.d0((Object) aVar1119, (Object) fVar, (Object) context, (Object) d0Var, 18, (byte) 0);
                    aVar5 = aVar1119;
                    o0VarE.K(objQ);
                }
                h4.r rVarD115 = u1.w.d(rVarE6, false, null, null, (e23.a) objQ, 15);
                z0VarD = c2.q.d(gVar, false);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarD115, o0VarE);
                h5.g.V.getClass();
                aVar6 = h5.g.a.f81805b;
                if (cVar2 != null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                aVar7 = aVar5;
                if (o0VarE.T) {
                    o0VarE.M(aVar6);
                } else {
                    o0VarE.c();
                }
                eVar = h5.g.a.f81810g;
                b4.c(eVar, z0VarD, o0VarE);
                c1623g = h5.g.a.f81809f;
                b4.c(c1623g, i2VarA0, o0VarE);
                bVar = h5.g.a.f81813j;
                z45 = z35;
                if (o0VarE.T) {
                    z46 = z24;
                    if (!p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    }
                    fVar2 = h5.g.a.f81807d;
                    b4.c(fVar2, rVarC, o0VarE);
                    uVar = c2.u.f22885a;
                    c2.j jVar11 = c2.j.f22691a;
                    bVar2 = d92.b.f58625c;
                    bVar2.getClass();
                    j92.e eVar12 = j92.b.f97899b;
                    float f115 = eVar12.f97920e;
                    jVar11.getClass();
                    c2.j.i iVarI11 = c2.j.i(f115);
                    z47 = z18;
                    h4.g.b bVar1112 = h4.d.a.f81534l;
                    aVar8 = h4.r.S;
                    bVar2.getClass();
                    h4.r rVarY11 = c2.l.y(aVar8, eVar12.f97920e);
                    s2VarA = q2.a(iVarI11, bVar1112, o0VarE, 48);
                    iHashCode2 = Long.hashCode(o0VarE.U);
                    i2VarA1 = o0VarE.a0();
                    rVarC2 = h4.k.c(rVarY11, o0VarE);
                    if (cVar2 != null) {
                        p3.p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar6);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(eVar, s2VarA, o0VarE);
                    b4.c(c1623g, i2VarA1, o0VarE);
                    if (o0VarE.T) {
                        v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                    } else {
                        v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                    }
                    b4.c(fVar2, rVarC2, o0VarE);
                    u2 u2Var11 = u2.f22900a;
                    bVar2.getClass();
                    cVar = j92.b.f97901d;
                    i36 = i34 & 126;
                    c(d0Var, fVar, cVar.f97906e, null, o0VarE, i36);
                    h4.r rVarX11 = x2.x(u2Var11.a(aVar8, 1.0f, true), null, 3);
                    pVar4 = pVar3;
                    zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, o0VarE, 0);
                    iHashCode3 = Long.hashCode(o0VarE.U);
                    i2VarA2 = o0VarE.a0();
                    rVarC3 = h4.k.c(rVarX11, o0VarE);
                    if (cVar2 != null) {
                        p3.p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar6);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(eVar, zVarA, o0VarE);
                    b4.c(c1623g, i2VarA2, o0VarE);
                    if (o0VarE.T) {
                        v.h.A(iHashCode3, o0VarE, iHashCode3, bVar);
                    } else {
                        v.h.A(iHashCode3, o0VarE, iHashCode3, bVar);
                    }
                    b4.c(fVar2, rVarC3, o0VarE);
                    c2.b0 b0Var11 = c2.b0.f22601a;
                    str = d0Var.f112651d;
                    boolean z519 = d0Var.f112652e;
                    if (str == null) {
                        str = "";
                    }
                    String str112 = str;
                    fVar3 = d92.b.f58624b;
                    fVar3.getClass();
                    x0 x0Var11 = j92.f.f97931h;
                    long jD11 = com.nimbusds.jose.shaded.gson.internal.a.d(o0VarE);
                    d6.p.f57793b.getClass();
                    i37 = d6.p.f57795d;
                    mh.c(str112, null, jD11, null, 0L, null, 0L, null, 0L, i37, false, 1, 0, null, x0Var11, o0VarE, 0, 24960, 110586);
                    o0Var = o0VarE;
                    if (g22.n.d(d0Var.f112653f)) {
                        o0Var.C(1814213146);
                        String str113 = d0Var.f112653f;
                        fVar3.getClass();
                        mh.c(str113, null, 0L, null, 0L, null, 0L, null, 0L, i37, false, 2, 0, null, x0.a(j92.f.f97933j, vb.h.g(o0Var), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), o0Var, 0, 24960, 110590);
                        o0Var.g0(false);
                    } else {
                        o0Var.C(1814479901);
                        o0Var.g0(false);
                    }
                    if (z37) {
                        o0Var.C(1814578171);
                        if (pVar4 == null) {
                            o0Var.C(1814621416);
                            if (z45) {
                                z48 = true;
                            } else {
                                z48 = true;
                            }
                            z.f(d0Var, fVar, z48, null, o0Var, i36, 8);
                            o0Var.g0(false);
                        } else {
                            o0Var.C(1814741944);
                            e5.q((i34 >> 24) & 14, pVar4, o0Var, false);
                        }
                        o0Var.g0(false);
                    } else {
                        o0Var.C(1814578171);
                        if (pVar4 == null) {
                            o0Var.C(1814621416);
                            if (z45) {
                                z48 = true;
                            } else {
                                z48 = true;
                            }
                            z.f(d0Var, fVar, z48, null, o0Var, i36, 8);
                            o0Var.g0(false);
                        } else {
                            o0Var.C(1814741944);
                            e5.q((i34 >> 24) & 14, pVar4, o0Var, false);
                        }
                        o0Var.g0(false);
                    }
                    o0Var.g0(true);
                    if (z37) {
                        o0Var.C(1846551145);
                        if (pVar4 == null) {
                            o0Var.C(1846590918);
                            if (z45) {
                                z49 = true;
                            } else {
                                z49 = true;
                            }
                            z.f(d0Var, fVar, z49, null, o0Var, i36, 8);
                            d0Var2 = d0Var;
                            fVar4 = fVar;
                            o0Var.g0(false);
                        } else {
                            d0Var2 = d0Var;
                            fVar4 = fVar;
                            o0Var.C(1846703510);
                            e5.q((i34 >> 24) & 14, pVar4, o0Var, false);
                        }
                        o0Var.g0(false);
                    } else {
                        o0Var.C(1846551145);
                        if (pVar4 == null) {
                            o0Var.C(1846590918);
                            if (z45) {
                                z49 = true;
                            } else {
                                z49 = true;
                            }
                            z.f(d0Var, fVar, z49, null, o0Var, i36, 8);
                            d0Var2 = d0Var;
                            fVar4 = fVar;
                            o0Var.g0(false);
                        } else {
                            d0Var2 = d0Var;
                            fVar4 = fVar;
                            o0Var.C(1846703510);
                            e5.q((i34 >> 24) & 14, pVar4, o0Var, false);
                        }
                        o0Var.g0(false);
                    }
                    if (z37) {
                        o0Var.C(1846903274);
                        bVar2.getClass();
                        f14 = cVar.f97904c;
                        h4.r rVarD116 = u1.n.d(x2.q(aVar8, f14), new o4.t1(((o4.d0) d92.b.a(o0Var).d().a().f76496r.getF182175a()).f128833a, null), k2.i.f102406a, 4);
                        z0VarD2 = c2.q.d(h4.d.a.f81524b, false);
                        x1 x1Var1116 = p3.n.f135158a;
                        iHashCode4 = Long.hashCode(o0Var.U);
                        i2VarA3 = o0Var.a0();
                        rVarC4 = h4.k.c(rVarD116, o0Var);
                        if (cVar2 == null) {
                            p3.p0.l();
                            throw null;
                        }
                        o0Var.z();
                        if (o0Var.T) {
                            o0Var.M(aVar6);
                        } else {
                            o0Var.c();
                        }
                        b4.c(eVar, z0VarD2, o0Var);
                        b4.c(c1623g, i2VarA3, o0Var);
                        if (o0Var.T) {
                            v.h.A(iHashCode4, o0Var, iHashCode4, bVar);
                        } else {
                            v.h.A(iHashCode4, o0Var, iHashCode4, bVar);
                        }
                        b4.c(fVar2, rVarC4, o0Var);
                        u4.d.b bVar1113 = u4.d.f168373k;
                        u4.d dVarB110 = n5.e.b(R.drawable.close_x_thick, o0Var, 6);
                        String strQ1119 = gl1.y.Q(o0Var, R.string.lbl_dismiss);
                        g6.f.a aVar11110 = g6.f.f75994b;
                        h4.r rVarQ110 = x2.q(uVar.c(aVar8, gVar), f14 / 2);
                        String strQ11110 = gl1.y.Q(o0Var, R.string.lbl_dismiss);
                        if ((i34 & 458752) == 131072) {
                            z54 = true;
                        } else {
                            z54 = false;
                        }
                        boolean zR116 = z54 | o0Var.r(fVar4) | o0Var.r(context);
                        if (i35 != 4) {
                            z55 = true;
                        } else {
                            z55 = true;
                        }
                        boolean z6113 = zR116 | z55;
                        if ((i34 & 3670016) == 1048576) {
                            z56 = true;
                        } else {
                            z56 = false;
                        }
                        z57 = z6113 | z56;
                        objQ2 = o0Var.q();
                        if (z57) {
                            aVar4.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = new gw1.g(z45, fVar4, context, d0Var2, z46);
                                o0Var.K(objQ2);
                            }
                        } else {
                            objQ2 = new gw1.g(z45, fVar4, context, d0Var2, z46);
                            o0Var.K(objQ2);
                        }
                        p3.o0 o0Var111 = o0Var;
                        i7.b(dVarB110, strQ1119, u1.w.d(rVarQ110, false, strQ11110, null, (e23.a) objQ2, 13), am.j.d(o0Var), o0Var111, 0, 0);
                        o0Var = o0Var111;
                        z58 = true;
                        o0Var.g0(true);
                        o0Var.g0(false);
                    } else {
                        o0Var.C(1846903274);
                        bVar2.getClass();
                        f14 = cVar.f97904c;
                        h4.r rVarD117 = u1.n.d(x2.q(aVar8, f14), new o4.t1(((o4.d0) d92.b.a(o0Var).d().a().f76496r.getF182175a()).f128833a, null), k2.i.f102406a, 4);
                        z0VarD2 = c2.q.d(h4.d.a.f81524b, false);
                        x1 x1Var1117 = p3.n.f135158a;
                        iHashCode4 = Long.hashCode(o0Var.U);
                        i2VarA3 = o0Var.a0();
                        rVarC4 = h4.k.c(rVarD117, o0Var);
                        if (cVar2 == null) {
                            p3.p0.l();
                            throw null;
                        }
                        o0Var.z();
                        if (o0Var.T) {
                            o0Var.M(aVar6);
                        } else {
                            o0Var.c();
                        }
                        b4.c(eVar, z0VarD2, o0Var);
                        b4.c(c1623g, i2VarA3, o0Var);
                        if (o0Var.T) {
                            v.h.A(iHashCode4, o0Var, iHashCode4, bVar);
                        } else {
                            v.h.A(iHashCode4, o0Var, iHashCode4, bVar);
                        }
                        b4.c(fVar2, rVarC4, o0Var);
                        u4.d.b bVar1114 = u4.d.f168373k;
                        u4.d dVarB111 = n5.e.b(R.drawable.close_x_thick, o0Var, 6);
                        String strQ11111 = gl1.y.Q(o0Var, R.string.lbl_dismiss);
                        g6.f.a aVar11111 = g6.f.f75994b;
                        h4.r rVarQ111 = x2.q(uVar.c(aVar8, gVar), f14 / 2);
                        String strQ11112 = gl1.y.Q(o0Var, R.string.lbl_dismiss);
                        if ((i34 & 458752) == 131072) {
                            z54 = true;
                        } else {
                            z54 = false;
                        }
                        boolean zR117 = z54 | o0Var.r(fVar4) | o0Var.r(context);
                        if (i35 != 4) {
                            z55 = true;
                        } else {
                            z55 = true;
                        }
                        boolean z6114 = zR117 | z55;
                        if ((i34 & 3670016) == 1048576) {
                            z56 = true;
                        } else {
                            z56 = false;
                        }
                        z57 = z6114 | z56;
                        objQ2 = o0Var.q();
                        if (z57) {
                            aVar4.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = new gw1.g(z45, fVar4, context, d0Var2, z46);
                                o0Var.K(objQ2);
                            }
                        } else {
                            objQ2 = new gw1.g(z45, fVar4, context, d0Var2, z46);
                            o0Var.K(objQ2);
                        }
                        p3.o0 o0Var112 = o0Var;
                        i7.b(dVarB111, strQ11111, u1.w.d(rVarQ111, false, strQ11112, null, (e23.a) objQ2, 13), am.j.d(o0Var), o0Var112, 0, 0);
                        o0Var = o0Var112;
                        z58 = true;
                        o0Var.g0(true);
                        o0Var.g0(false);
                    }
                    o0Var.g0(z58);
                    o0Var.g0(z58);
                    x1 x1Var1118 = p3.n.f135158a;
                    pVar2 = pVar4;
                    z26 = z37;
                    aVar2 = aVar7;
                    z29 = z45;
                    z27 = z46;
                    z28 = z47;
                } else {
                    z46 = z24;
                }
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                fVar2 = h5.g.a.f81807d;
                b4.c(fVar2, rVarC, o0VarE);
                uVar = c2.u.f22885a;
                c2.j jVar12 = c2.j.f22691a;
                bVar2 = d92.b.f58625c;
                bVar2.getClass();
                j92.e eVar13 = j92.b.f97899b;
                float f116 = eVar13.f97920e;
                jVar12.getClass();
                c2.j.i iVarI12 = c2.j.i(f116);
                z47 = z18;
                h4.g.b bVar1115 = h4.d.a.f81534l;
                aVar8 = h4.r.S;
                bVar2.getClass();
                h4.r rVarY12 = c2.l.y(aVar8, eVar13.f97920e);
                s2VarA = q2.a(iVarI12, bVar1115, o0VarE, 48);
                iHashCode2 = Long.hashCode(o0VarE.U);
                i2VarA1 = o0VarE.a0();
                rVarC2 = h4.k.c(rVarY12, o0VarE);
                if (cVar2 != null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar6);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar, s2VarA, o0VarE);
                b4.c(c1623g, i2VarA1, o0VarE);
                if (o0VarE.T) {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                } else {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                }
                b4.c(fVar2, rVarC2, o0VarE);
                u2 u2Var12 = u2.f22900a;
                bVar2.getClass();
                cVar = j92.b.f97901d;
                i36 = i34 & 126;
                c(d0Var, fVar, cVar.f97906e, null, o0VarE, i36);
                h4.r rVarX12 = x2.x(u2Var12.a(aVar8, 1.0f, true), null, 3);
                pVar4 = pVar3;
                zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, o0VarE, 0);
                iHashCode3 = Long.hashCode(o0VarE.U);
                i2VarA2 = o0VarE.a0();
                rVarC3 = h4.k.c(rVarX12, o0VarE);
                if (cVar2 != null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar6);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar, zVarA, o0VarE);
                b4.c(c1623g, i2VarA2, o0VarE);
                if (o0VarE.T) {
                    v.h.A(iHashCode3, o0VarE, iHashCode3, bVar);
                } else {
                    v.h.A(iHashCode3, o0VarE, iHashCode3, bVar);
                }
                b4.c(fVar2, rVarC3, o0VarE);
                c2.b0 b0Var12 = c2.b0.f22601a;
                str = d0Var.f112651d;
                boolean z5110 = d0Var.f112652e;
                if (str == null) {
                    str = "";
                }
                String str114 = str;
                fVar3 = d92.b.f58624b;
                fVar3.getClass();
                x0 x0Var12 = j92.f.f97931h;
                long jD12 = com.nimbusds.jose.shaded.gson.internal.a.d(o0VarE);
                d6.p.f57793b.getClass();
                i37 = d6.p.f57795d;
                mh.c(str114, null, jD12, null, 0L, null, 0L, null, 0L, i37, false, 1, 0, null, x0Var12, o0VarE, 0, 24960, 110586);
                o0Var = o0VarE;
                if (g22.n.d(d0Var.f112653f)) {
                    o0Var.C(1814213146);
                    String str115 = d0Var.f112653f;
                    fVar3.getClass();
                    mh.c(str115, null, 0L, null, 0L, null, 0L, null, 0L, i37, false, 2, 0, null, x0.a(j92.f.f97933j, vb.h.g(o0Var), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), o0Var, 0, 24960, 110590);
                    o0Var.g0(false);
                } else {
                    o0Var.C(1814479901);
                    o0Var.g0(false);
                }
                if (z37) {
                    o0Var.C(1814578171);
                    if (pVar4 == null) {
                        o0Var.C(1814621416);
                        if (z45) {
                            z48 = true;
                        } else {
                            z48 = true;
                        }
                        z.f(d0Var, fVar, z48, null, o0Var, i36, 8);
                        o0Var.g0(false);
                    } else {
                        o0Var.C(1814741944);
                        e5.q((i34 >> 24) & 14, pVar4, o0Var, false);
                    }
                    o0Var.g0(false);
                } else {
                    o0Var.C(1814578171);
                    if (pVar4 == null) {
                        o0Var.C(1814621416);
                        if (z45) {
                            z48 = true;
                        } else {
                            z48 = true;
                        }
                        z.f(d0Var, fVar, z48, null, o0Var, i36, 8);
                        o0Var.g0(false);
                    } else {
                        o0Var.C(1814741944);
                        e5.q((i34 >> 24) & 14, pVar4, o0Var, false);
                    }
                    o0Var.g0(false);
                }
                o0Var.g0(true);
                if (z37) {
                    o0Var.C(1846551145);
                    if (pVar4 == null) {
                        o0Var.C(1846590918);
                        if (z45) {
                            z49 = true;
                        } else {
                            z49 = true;
                        }
                        z.f(d0Var, fVar, z49, null, o0Var, i36, 8);
                        d0Var2 = d0Var;
                        fVar4 = fVar;
                        o0Var.g0(false);
                    } else {
                        d0Var2 = d0Var;
                        fVar4 = fVar;
                        o0Var.C(1846703510);
                        e5.q((i34 >> 24) & 14, pVar4, o0Var, false);
                    }
                    o0Var.g0(false);
                } else {
                    o0Var.C(1846551145);
                    if (pVar4 == null) {
                        o0Var.C(1846590918);
                        if (z45) {
                            z49 = true;
                        } else {
                            z49 = true;
                        }
                        z.f(d0Var, fVar, z49, null, o0Var, i36, 8);
                        d0Var2 = d0Var;
                        fVar4 = fVar;
                        o0Var.g0(false);
                    } else {
                        d0Var2 = d0Var;
                        fVar4 = fVar;
                        o0Var.C(1846703510);
                        e5.q((i34 >> 24) & 14, pVar4, o0Var, false);
                    }
                    o0Var.g0(false);
                }
                if (z37) {
                    o0Var.C(1846903274);
                    bVar2.getClass();
                    f14 = cVar.f97904c;
                    h4.r rVarD118 = u1.n.d(x2.q(aVar8, f14), new o4.t1(((o4.d0) d92.b.a(o0Var).d().a().f76496r.getF182175a()).f128833a, null), k2.i.f102406a, 4);
                    z0VarD2 = c2.q.d(h4.d.a.f81524b, false);
                    x1 x1Var1119 = p3.n.f135158a;
                    iHashCode4 = Long.hashCode(o0Var.U);
                    i2VarA3 = o0Var.a0();
                    rVarC4 = h4.k.c(rVarD118, o0Var);
                    if (cVar2 == null) {
                        p3.p0.l();
                        throw null;
                    }
                    o0Var.z();
                    if (o0Var.T) {
                        o0Var.M(aVar6);
                    } else {
                        o0Var.c();
                    }
                    b4.c(eVar, z0VarD2, o0Var);
                    b4.c(c1623g, i2VarA3, o0Var);
                    if (o0Var.T) {
                        v.h.A(iHashCode4, o0Var, iHashCode4, bVar);
                    } else {
                        v.h.A(iHashCode4, o0Var, iHashCode4, bVar);
                    }
                    b4.c(fVar2, rVarC4, o0Var);
                    u4.d.b bVar1116 = u4.d.f168373k;
                    u4.d dVarB112 = n5.e.b(R.drawable.close_x_thick, o0Var, 6);
                    String strQ11113 = gl1.y.Q(o0Var, R.string.lbl_dismiss);
                    g6.f.a aVar11112 = g6.f.f75994b;
                    h4.r rVarQ112 = x2.q(uVar.c(aVar8, gVar), f14 / 2);
                    String strQ11114 = gl1.y.Q(o0Var, R.string.lbl_dismiss);
                    if ((i34 & 458752) == 131072) {
                        z54 = true;
                    } else {
                        z54 = false;
                    }
                    boolean zR118 = z54 | o0Var.r(fVar4) | o0Var.r(context);
                    if (i35 != 4) {
                        z55 = true;
                    } else {
                        z55 = true;
                    }
                    boolean z6115 = zR118 | z55;
                    if ((i34 & 3670016) == 1048576) {
                        z56 = true;
                    } else {
                        z56 = false;
                    }
                    z57 = z6115 | z56;
                    objQ2 = o0Var.q();
                    if (z57) {
                        aVar4.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new gw1.g(z45, fVar4, context, d0Var2, z46);
                            o0Var.K(objQ2);
                        }
                    } else {
                        objQ2 = new gw1.g(z45, fVar4, context, d0Var2, z46);
                        o0Var.K(objQ2);
                    }
                    p3.o0 o0Var113 = o0Var;
                    i7.b(dVarB112, strQ11113, u1.w.d(rVarQ112, false, strQ11114, null, (e23.a) objQ2, 13), am.j.d(o0Var), o0Var113, 0, 0);
                    o0Var = o0Var113;
                    z58 = true;
                    o0Var.g0(true);
                    o0Var.g0(false);
                } else {
                    o0Var.C(1846903274);
                    bVar2.getClass();
                    f14 = cVar.f97904c;
                    h4.r rVarD119 = u1.n.d(x2.q(aVar8, f14), new o4.t1(((o4.d0) d92.b.a(o0Var).d().a().f76496r.getF182175a()).f128833a, null), k2.i.f102406a, 4);
                    z0VarD2 = c2.q.d(h4.d.a.f81524b, false);
                    x1 x1Var11110 = p3.n.f135158a;
                    iHashCode4 = Long.hashCode(o0Var.U);
                    i2VarA3 = o0Var.a0();
                    rVarC4 = h4.k.c(rVarD119, o0Var);
                    if (cVar2 == null) {
                        p3.p0.l();
                        throw null;
                    }
                    o0Var.z();
                    if (o0Var.T) {
                        o0Var.M(aVar6);
                    } else {
                        o0Var.c();
                    }
                    b4.c(eVar, z0VarD2, o0Var);
                    b4.c(c1623g, i2VarA3, o0Var);
                    if (o0Var.T) {
                        v.h.A(iHashCode4, o0Var, iHashCode4, bVar);
                    } else {
                        v.h.A(iHashCode4, o0Var, iHashCode4, bVar);
                    }
                    b4.c(fVar2, rVarC4, o0Var);
                    u4.d.b bVar1117 = u4.d.f168373k;
                    u4.d dVarB113 = n5.e.b(R.drawable.close_x_thick, o0Var, 6);
                    String strQ11115 = gl1.y.Q(o0Var, R.string.lbl_dismiss);
                    g6.f.a aVar11113 = g6.f.f75994b;
                    h4.r rVarQ113 = x2.q(uVar.c(aVar8, gVar), f14 / 2);
                    String strQ11116 = gl1.y.Q(o0Var, R.string.lbl_dismiss);
                    if ((i34 & 458752) == 131072) {
                        z54 = true;
                    } else {
                        z54 = false;
                    }
                    boolean zR119 = z54 | o0Var.r(fVar4) | o0Var.r(context);
                    if (i35 != 4) {
                        z55 = true;
                    } else {
                        z55 = true;
                    }
                    boolean z6116 = zR119 | z55;
                    if ((i34 & 3670016) == 1048576) {
                        z56 = true;
                    } else {
                        z56 = false;
                    }
                    z57 = z6116 | z56;
                    objQ2 = o0Var.q();
                    if (z57) {
                        aVar4.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new gw1.g(z45, fVar4, context, d0Var2, z46);
                            o0Var.K(objQ2);
                        }
                    } else {
                        objQ2 = new gw1.g(z45, fVar4, context, d0Var2, z46);
                        o0Var.K(objQ2);
                    }
                    p3.o0 o0Var114 = o0Var;
                    i7.b(dVarB113, strQ11115, u1.w.d(rVarQ113, false, strQ11116, null, (e23.a) objQ2, 13), am.j.d(o0Var), o0Var114, 0, 0);
                    o0Var = o0Var114;
                    z58 = true;
                    o0Var.g0(true);
                    o0Var.g0(false);
                }
                o0Var.g0(z58);
                o0Var.g0(z58);
                x1 x1Var11111 = p3.n.f135158a;
                pVar2 = pVar4;
                z26 = z37;
                aVar2 = aVar7;
                z29 = z45;
                z27 = z46;
                z28 = z47;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                z26 = z15;
                aVar2 = aVar;
                z27 = z24;
                z28 = z18;
                z29 = z19;
                pVar2 = pVar;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new com.google.maps.android.compose.streetview.a(d0Var, fVar, rVar, z28, z26, z29, z27, aVar2, pVar2, i14, i15);
            }
        }
        i16 |= 24576;
        i19 = i15 & 32;
        if (i19 != 0) {
            i16 |= 196608;
            z19 = z16;
        } else {
            z19 = z16;
            if ((i14 & 196608) == 0) {
                if (o0VarE.h(z19)) {
                    i24 = 131072;
                } else {
                    i24 = 65536;
                }
                i16 |= i24;
            }
        }
        i25 = i15 & 64;
        if (i25 != 0) {
            i16 |= 1572864;
            z24 = z17;
        } else {
            z24 = z17;
            if ((i14 & 1572864) == 0) {
                if (o0VarE.h(z24)) {
                    i26 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                } else {
                    i26 = 524288;
                }
                i16 |= i26;
            }
        }
        i27 = i15 & 128;
        if (i27 != 0) {
            i16 |= 12582912;
        } else if ((i14 & 12582912) == 0) {
            if (o0VarE.r(aVar)) {
                i28 = 8388608;
            } else {
                i28 = 4194304;
            }
            i16 |= i28;
        }
        i29 = i15 & 256;
        if (i29 != 0) {
            if ((i14 & 100663296) == 0) {
                if (o0VarE.r(pVar)) {
                    i30 = 67108864;
                } else {
                    i30 = 33554432;
                }
                i16 |= i30;
            }
            i34 = i16;
            if ((i16 & 38347923) != 38347922) {
                z25 = true;
            } else {
                z25 = false;
            }
            if (o0VarE.n(i34 & 1, z25)) {
                if (i38 != 0) {
                    z18 = false;
                }
                if (i17 != 0) {
                    z34 = false;
                } else {
                    z34 = z15;
                }
                if (i19 != 0) {
                    z35 = false;
                } else {
                    z35 = z19;
                }
                if (i25 != 0) {
                    z24 = false;
                }
                if (i27 != 0) {
                    aVar3 = null;
                } else {
                    aVar3 = aVar;
                }
                if (i29 != 0) {
                    pVar3 = null;
                } else {
                    pVar3 = pVar;
                }
                x1 x1Var11112 = p3.n.f135158a;
                context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                if (((g6.c) o0VarE.A(t1.f91490h)).getF94882b() >= 1.3d) {
                    z36 = true;
                } else {
                    z36 = false;
                }
                h4.d.f81522a.getClass();
                gVar = h4.d.a.f81528f;
                z37 = z34;
                h4.r rVarE7 = u1.n.e(x2.x(x2.f(rVar, 1.0f), null, 3), am.j.c(d92.b.f58623a, o0VarE), m1.f128891a);
                if ((i34 & 29360128) == 8388608) {
                    z38 = true;
                } else {
                    z38 = false;
                }
                boolean zR1110 = z38 | o0VarE.r(fVar) | o0VarE.r(context);
                i35 = i34 & 14;
                if (i35 != 4) {
                    z39 = true;
                } else {
                    z39 = true;
                }
                z44 = zR1110 | z39;
                objQ = o0VarE.q();
                aVar4 = p3.m.f135153a;
                if (z44) {
                    aVar4.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        e23.a<Unit> aVar11114 = aVar3;
                        objQ = new ho.d0((Object) aVar11114, (Object) fVar, (Object) context, (Object) d0Var, 18, (byte) 0);
                        aVar5 = aVar11114;
                        o0VarE.K(objQ);
                    } else {
                        aVar5 = aVar3;
                    }
                } else {
                    e23.a<Unit> aVar11115 = aVar3;
                    objQ = new ho.d0((Object) aVar11115, (Object) fVar, (Object) context, (Object) d0Var, 18, (byte) 0);
                    aVar5 = aVar11115;
                    o0VarE.K(objQ);
                }
                h4.r rVarD1110 = u1.w.d(rVarE7, false, null, null, (e23.a) objQ, 15);
                z0VarD = c2.q.d(gVar, false);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarD1110, o0VarE);
                h5.g.V.getClass();
                aVar6 = h5.g.a.f81805b;
                if (cVar2 != null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                aVar7 = aVar5;
                if (o0VarE.T) {
                    o0VarE.M(aVar6);
                } else {
                    o0VarE.c();
                }
                eVar = h5.g.a.f81810g;
                b4.c(eVar, z0VarD, o0VarE);
                c1623g = h5.g.a.f81809f;
                b4.c(c1623g, i2VarA0, o0VarE);
                bVar = h5.g.a.f81813j;
                z45 = z35;
                if (o0VarE.T) {
                    z46 = z24;
                    if (!p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    }
                    fVar2 = h5.g.a.f81807d;
                    b4.c(fVar2, rVarC, o0VarE);
                    uVar = c2.u.f22885a;
                    c2.j jVar13 = c2.j.f22691a;
                    bVar2 = d92.b.f58625c;
                    bVar2.getClass();
                    j92.e eVar14 = j92.b.f97899b;
                    float f117 = eVar14.f97920e;
                    jVar13.getClass();
                    c2.j.i iVarI13 = c2.j.i(f117);
                    z47 = z18;
                    h4.g.b bVar1118 = h4.d.a.f81534l;
                    aVar8 = h4.r.S;
                    bVar2.getClass();
                    h4.r rVarY13 = c2.l.y(aVar8, eVar14.f97920e);
                    s2VarA = q2.a(iVarI13, bVar1118, o0VarE, 48);
                    iHashCode2 = Long.hashCode(o0VarE.U);
                    i2VarA1 = o0VarE.a0();
                    rVarC2 = h4.k.c(rVarY13, o0VarE);
                    if (cVar2 != null) {
                        p3.p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar6);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(eVar, s2VarA, o0VarE);
                    b4.c(c1623g, i2VarA1, o0VarE);
                    if (o0VarE.T) {
                        v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                    } else {
                        v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                    }
                    b4.c(fVar2, rVarC2, o0VarE);
                    u2 u2Var13 = u2.f22900a;
                    bVar2.getClass();
                    cVar = j92.b.f97901d;
                    i36 = i34 & 126;
                    c(d0Var, fVar, cVar.f97906e, null, o0VarE, i36);
                    h4.r rVarX13 = x2.x(u2Var13.a(aVar8, 1.0f, true), null, 3);
                    pVar4 = pVar3;
                    zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, o0VarE, 0);
                    iHashCode3 = Long.hashCode(o0VarE.U);
                    i2VarA2 = o0VarE.a0();
                    rVarC3 = h4.k.c(rVarX13, o0VarE);
                    if (cVar2 != null) {
                        p3.p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar6);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(eVar, zVarA, o0VarE);
                    b4.c(c1623g, i2VarA2, o0VarE);
                    if (o0VarE.T) {
                        v.h.A(iHashCode3, o0VarE, iHashCode3, bVar);
                    } else {
                        v.h.A(iHashCode3, o0VarE, iHashCode3, bVar);
                    }
                    b4.c(fVar2, rVarC3, o0VarE);
                    c2.b0 b0Var13 = c2.b0.f22601a;
                    str = d0Var.f112651d;
                    boolean z5111 = d0Var.f112652e;
                    if (str == null) {
                        str = "";
                    }
                    String str116 = str;
                    fVar3 = d92.b.f58624b;
                    fVar3.getClass();
                    x0 x0Var13 = j92.f.f97931h;
                    long jD13 = com.nimbusds.jose.shaded.gson.internal.a.d(o0VarE);
                    d6.p.f57793b.getClass();
                    i37 = d6.p.f57795d;
                    mh.c(str116, null, jD13, null, 0L, null, 0L, null, 0L, i37, false, 1, 0, null, x0Var13, o0VarE, 0, 24960, 110586);
                    o0Var = o0VarE;
                    if (g22.n.d(d0Var.f112653f)) {
                        o0Var.C(1814213146);
                        String str117 = d0Var.f112653f;
                        fVar3.getClass();
                        mh.c(str117, null, 0L, null, 0L, null, 0L, null, 0L, i37, false, 2, 0, null, x0.a(j92.f.f97933j, vb.h.g(o0Var), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), o0Var, 0, 24960, 110590);
                        o0Var.g0(false);
                    } else {
                        o0Var.C(1814479901);
                        o0Var.g0(false);
                    }
                    if (z37) {
                        o0Var.C(1814578171);
                        if (pVar4 == null) {
                            o0Var.C(1814621416);
                            if (z45) {
                                z48 = true;
                            } else {
                                z48 = true;
                            }
                            z.f(d0Var, fVar, z48, null, o0Var, i36, 8);
                            o0Var.g0(false);
                        } else {
                            o0Var.C(1814741944);
                            e5.q((i34 >> 24) & 14, pVar4, o0Var, false);
                        }
                        o0Var.g0(false);
                    } else {
                        o0Var.C(1814578171);
                        if (pVar4 == null) {
                            o0Var.C(1814621416);
                            if (z45) {
                                z48 = true;
                            } else {
                                z48 = true;
                            }
                            z.f(d0Var, fVar, z48, null, o0Var, i36, 8);
                            o0Var.g0(false);
                        } else {
                            o0Var.C(1814741944);
                            e5.q((i34 >> 24) & 14, pVar4, o0Var, false);
                        }
                        o0Var.g0(false);
                    }
                    o0Var.g0(true);
                    if (z37) {
                        o0Var.C(1846551145);
                        if (pVar4 == null) {
                            o0Var.C(1846590918);
                            if (z45) {
                                z49 = true;
                            } else {
                                z49 = true;
                            }
                            z.f(d0Var, fVar, z49, null, o0Var, i36, 8);
                            d0Var2 = d0Var;
                            fVar4 = fVar;
                            o0Var.g0(false);
                        } else {
                            d0Var2 = d0Var;
                            fVar4 = fVar;
                            o0Var.C(1846703510);
                            e5.q((i34 >> 24) & 14, pVar4, o0Var, false);
                        }
                        o0Var.g0(false);
                    } else {
                        o0Var.C(1846551145);
                        if (pVar4 == null) {
                            o0Var.C(1846590918);
                            if (z45) {
                                z49 = true;
                            } else {
                                z49 = true;
                            }
                            z.f(d0Var, fVar, z49, null, o0Var, i36, 8);
                            d0Var2 = d0Var;
                            fVar4 = fVar;
                            o0Var.g0(false);
                        } else {
                            d0Var2 = d0Var;
                            fVar4 = fVar;
                            o0Var.C(1846703510);
                            e5.q((i34 >> 24) & 14, pVar4, o0Var, false);
                        }
                        o0Var.g0(false);
                    }
                    if (z37) {
                        o0Var.C(1846903274);
                        bVar2.getClass();
                        f14 = cVar.f97904c;
                        h4.r rVarD1111 = u1.n.d(x2.q(aVar8, f14), new o4.t1(((o4.d0) d92.b.a(o0Var).d().a().f76496r.getF182175a()).f128833a, null), k2.i.f102406a, 4);
                        z0VarD2 = c2.q.d(h4.d.a.f81524b, false);
                        x1 x1Var11113 = p3.n.f135158a;
                        iHashCode4 = Long.hashCode(o0Var.U);
                        i2VarA3 = o0Var.a0();
                        rVarC4 = h4.k.c(rVarD1111, o0Var);
                        if (cVar2 == null) {
                            p3.p0.l();
                            throw null;
                        }
                        o0Var.z();
                        if (o0Var.T) {
                            o0Var.M(aVar6);
                        } else {
                            o0Var.c();
                        }
                        b4.c(eVar, z0VarD2, o0Var);
                        b4.c(c1623g, i2VarA3, o0Var);
                        if (o0Var.T) {
                            v.h.A(iHashCode4, o0Var, iHashCode4, bVar);
                        } else {
                            v.h.A(iHashCode4, o0Var, iHashCode4, bVar);
                        }
                        b4.c(fVar2, rVarC4, o0Var);
                        u4.d.b bVar1119 = u4.d.f168373k;
                        u4.d dVarB114 = n5.e.b(R.drawable.close_x_thick, o0Var, 6);
                        String strQ11117 = gl1.y.Q(o0Var, R.string.lbl_dismiss);
                        g6.f.a aVar11116 = g6.f.f75994b;
                        h4.r rVarQ114 = x2.q(uVar.c(aVar8, gVar), f14 / 2);
                        String strQ11118 = gl1.y.Q(o0Var, R.string.lbl_dismiss);
                        if ((i34 & 458752) == 131072) {
                            z54 = true;
                        } else {
                            z54 = false;
                        }
                        boolean zR1111 = z54 | o0Var.r(fVar4) | o0Var.r(context);
                        if (i35 != 4) {
                            z55 = true;
                        } else {
                            z55 = true;
                        }
                        boolean z6117 = zR1111 | z55;
                        if ((i34 & 3670016) == 1048576) {
                            z56 = true;
                        } else {
                            z56 = false;
                        }
                        z57 = z6117 | z56;
                        objQ2 = o0Var.q();
                        if (z57) {
                            aVar4.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = new gw1.g(z45, fVar4, context, d0Var2, z46);
                                o0Var.K(objQ2);
                            }
                        } else {
                            objQ2 = new gw1.g(z45, fVar4, context, d0Var2, z46);
                            o0Var.K(objQ2);
                        }
                        p3.o0 o0Var115 = o0Var;
                        i7.b(dVarB114, strQ11117, u1.w.d(rVarQ114, false, strQ11118, null, (e23.a) objQ2, 13), am.j.d(o0Var), o0Var115, 0, 0);
                        o0Var = o0Var115;
                        z58 = true;
                        o0Var.g0(true);
                        o0Var.g0(false);
                    } else {
                        o0Var.C(1846903274);
                        bVar2.getClass();
                        f14 = cVar.f97904c;
                        h4.r rVarD1112 = u1.n.d(x2.q(aVar8, f14), new o4.t1(((o4.d0) d92.b.a(o0Var).d().a().f76496r.getF182175a()).f128833a, null), k2.i.f102406a, 4);
                        z0VarD2 = c2.q.d(h4.d.a.f81524b, false);
                        x1 x1Var11114 = p3.n.f135158a;
                        iHashCode4 = Long.hashCode(o0Var.U);
                        i2VarA3 = o0Var.a0();
                        rVarC4 = h4.k.c(rVarD1112, o0Var);
                        if (cVar2 == null) {
                            p3.p0.l();
                            throw null;
                        }
                        o0Var.z();
                        if (o0Var.T) {
                            o0Var.M(aVar6);
                        } else {
                            o0Var.c();
                        }
                        b4.c(eVar, z0VarD2, o0Var);
                        b4.c(c1623g, i2VarA3, o0Var);
                        if (o0Var.T) {
                            v.h.A(iHashCode4, o0Var, iHashCode4, bVar);
                        } else {
                            v.h.A(iHashCode4, o0Var, iHashCode4, bVar);
                        }
                        b4.c(fVar2, rVarC4, o0Var);
                        u4.d.b bVar11110 = u4.d.f168373k;
                        u4.d dVarB115 = n5.e.b(R.drawable.close_x_thick, o0Var, 6);
                        String strQ11119 = gl1.y.Q(o0Var, R.string.lbl_dismiss);
                        g6.f.a aVar11117 = g6.f.f75994b;
                        h4.r rVarQ115 = x2.q(uVar.c(aVar8, gVar), f14 / 2);
                        String strQ111110 = gl1.y.Q(o0Var, R.string.lbl_dismiss);
                        if ((i34 & 458752) == 131072) {
                            z54 = true;
                        } else {
                            z54 = false;
                        }
                        boolean zR1112 = z54 | o0Var.r(fVar4) | o0Var.r(context);
                        if (i35 != 4) {
                            z55 = true;
                        } else {
                            z55 = true;
                        }
                        boolean z6118 = zR1112 | z55;
                        if ((i34 & 3670016) == 1048576) {
                            z56 = true;
                        } else {
                            z56 = false;
                        }
                        z57 = z6118 | z56;
                        objQ2 = o0Var.q();
                        if (z57) {
                            aVar4.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = new gw1.g(z45, fVar4, context, d0Var2, z46);
                                o0Var.K(objQ2);
                            }
                        } else {
                            objQ2 = new gw1.g(z45, fVar4, context, d0Var2, z46);
                            o0Var.K(objQ2);
                        }
                        p3.o0 o0Var116 = o0Var;
                        i7.b(dVarB115, strQ11119, u1.w.d(rVarQ115, false, strQ111110, null, (e23.a) objQ2, 13), am.j.d(o0Var), o0Var116, 0, 0);
                        o0Var = o0Var116;
                        z58 = true;
                        o0Var.g0(true);
                        o0Var.g0(false);
                    }
                    o0Var.g0(z58);
                    o0Var.g0(z58);
                    x1 x1Var11115 = p3.n.f135158a;
                    pVar2 = pVar4;
                    z26 = z37;
                    aVar2 = aVar7;
                    z29 = z45;
                    z27 = z46;
                    z28 = z47;
                } else {
                    z46 = z24;
                }
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                fVar2 = h5.g.a.f81807d;
                b4.c(fVar2, rVarC, o0VarE);
                uVar = c2.u.f22885a;
                c2.j jVar14 = c2.j.f22691a;
                bVar2 = d92.b.f58625c;
                bVar2.getClass();
                j92.e eVar15 = j92.b.f97899b;
                float f118 = eVar15.f97920e;
                jVar14.getClass();
                c2.j.i iVarI14 = c2.j.i(f118);
                z47 = z18;
                h4.g.b bVar11111 = h4.d.a.f81534l;
                aVar8 = h4.r.S;
                bVar2.getClass();
                h4.r rVarY14 = c2.l.y(aVar8, eVar15.f97920e);
                s2VarA = q2.a(iVarI14, bVar11111, o0VarE, 48);
                iHashCode2 = Long.hashCode(o0VarE.U);
                i2VarA1 = o0VarE.a0();
                rVarC2 = h4.k.c(rVarY14, o0VarE);
                if (cVar2 != null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar6);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar, s2VarA, o0VarE);
                b4.c(c1623g, i2VarA1, o0VarE);
                if (o0VarE.T) {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                } else {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                }
                b4.c(fVar2, rVarC2, o0VarE);
                u2 u2Var14 = u2.f22900a;
                bVar2.getClass();
                cVar = j92.b.f97901d;
                i36 = i34 & 126;
                c(d0Var, fVar, cVar.f97906e, null, o0VarE, i36);
                h4.r rVarX14 = x2.x(u2Var14.a(aVar8, 1.0f, true), null, 3);
                pVar4 = pVar3;
                zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, o0VarE, 0);
                iHashCode3 = Long.hashCode(o0VarE.U);
                i2VarA2 = o0VarE.a0();
                rVarC3 = h4.k.c(rVarX14, o0VarE);
                if (cVar2 != null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar6);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar, zVarA, o0VarE);
                b4.c(c1623g, i2VarA2, o0VarE);
                if (o0VarE.T) {
                    v.h.A(iHashCode3, o0VarE, iHashCode3, bVar);
                } else {
                    v.h.A(iHashCode3, o0VarE, iHashCode3, bVar);
                }
                b4.c(fVar2, rVarC3, o0VarE);
                c2.b0 b0Var14 = c2.b0.f22601a;
                str = d0Var.f112651d;
                boolean z5112 = d0Var.f112652e;
                if (str == null) {
                    str = "";
                }
                String str118 = str;
                fVar3 = d92.b.f58624b;
                fVar3.getClass();
                x0 x0Var14 = j92.f.f97931h;
                long jD14 = com.nimbusds.jose.shaded.gson.internal.a.d(o0VarE);
                d6.p.f57793b.getClass();
                i37 = d6.p.f57795d;
                mh.c(str118, null, jD14, null, 0L, null, 0L, null, 0L, i37, false, 1, 0, null, x0Var14, o0VarE, 0, 24960, 110586);
                o0Var = o0VarE;
                if (g22.n.d(d0Var.f112653f)) {
                    o0Var.C(1814213146);
                    String str119 = d0Var.f112653f;
                    fVar3.getClass();
                    mh.c(str119, null, 0L, null, 0L, null, 0L, null, 0L, i37, false, 2, 0, null, x0.a(j92.f.f97933j, vb.h.g(o0Var), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), o0Var, 0, 24960, 110590);
                    o0Var.g0(false);
                } else {
                    o0Var.C(1814479901);
                    o0Var.g0(false);
                }
                if (z37) {
                    o0Var.C(1814578171);
                    if (pVar4 == null) {
                        o0Var.C(1814621416);
                        if (z45) {
                            z48 = true;
                        } else {
                            z48 = true;
                        }
                        z.f(d0Var, fVar, z48, null, o0Var, i36, 8);
                        o0Var.g0(false);
                    } else {
                        o0Var.C(1814741944);
                        e5.q((i34 >> 24) & 14, pVar4, o0Var, false);
                    }
                    o0Var.g0(false);
                } else {
                    o0Var.C(1814578171);
                    if (pVar4 == null) {
                        o0Var.C(1814621416);
                        if (z45) {
                            z48 = true;
                        } else {
                            z48 = true;
                        }
                        z.f(d0Var, fVar, z48, null, o0Var, i36, 8);
                        o0Var.g0(false);
                    } else {
                        o0Var.C(1814741944);
                        e5.q((i34 >> 24) & 14, pVar4, o0Var, false);
                    }
                    o0Var.g0(false);
                }
                o0Var.g0(true);
                if (z37) {
                    o0Var.C(1846551145);
                    if (pVar4 == null) {
                        o0Var.C(1846590918);
                        if (z45) {
                            z49 = true;
                        } else {
                            z49 = true;
                        }
                        z.f(d0Var, fVar, z49, null, o0Var, i36, 8);
                        d0Var2 = d0Var;
                        fVar4 = fVar;
                        o0Var.g0(false);
                    } else {
                        d0Var2 = d0Var;
                        fVar4 = fVar;
                        o0Var.C(1846703510);
                        e5.q((i34 >> 24) & 14, pVar4, o0Var, false);
                    }
                    o0Var.g0(false);
                } else {
                    o0Var.C(1846551145);
                    if (pVar4 == null) {
                        o0Var.C(1846590918);
                        if (z45) {
                            z49 = true;
                        } else {
                            z49 = true;
                        }
                        z.f(d0Var, fVar, z49, null, o0Var, i36, 8);
                        d0Var2 = d0Var;
                        fVar4 = fVar;
                        o0Var.g0(false);
                    } else {
                        d0Var2 = d0Var;
                        fVar4 = fVar;
                        o0Var.C(1846703510);
                        e5.q((i34 >> 24) & 14, pVar4, o0Var, false);
                    }
                    o0Var.g0(false);
                }
                if (z37) {
                    o0Var.C(1846903274);
                    bVar2.getClass();
                    f14 = cVar.f97904c;
                    h4.r rVarD1113 = u1.n.d(x2.q(aVar8, f14), new o4.t1(((o4.d0) d92.b.a(o0Var).d().a().f76496r.getF182175a()).f128833a, null), k2.i.f102406a, 4);
                    z0VarD2 = c2.q.d(h4.d.a.f81524b, false);
                    x1 x1Var11116 = p3.n.f135158a;
                    iHashCode4 = Long.hashCode(o0Var.U);
                    i2VarA3 = o0Var.a0();
                    rVarC4 = h4.k.c(rVarD1113, o0Var);
                    if (cVar2 == null) {
                        p3.p0.l();
                        throw null;
                    }
                    o0Var.z();
                    if (o0Var.T) {
                        o0Var.M(aVar6);
                    } else {
                        o0Var.c();
                    }
                    b4.c(eVar, z0VarD2, o0Var);
                    b4.c(c1623g, i2VarA3, o0Var);
                    if (o0Var.T) {
                        v.h.A(iHashCode4, o0Var, iHashCode4, bVar);
                    } else {
                        v.h.A(iHashCode4, o0Var, iHashCode4, bVar);
                    }
                    b4.c(fVar2, rVarC4, o0Var);
                    u4.d.b bVar11112 = u4.d.f168373k;
                    u4.d dVarB116 = n5.e.b(R.drawable.close_x_thick, o0Var, 6);
                    String strQ111111 = gl1.y.Q(o0Var, R.string.lbl_dismiss);
                    g6.f.a aVar11118 = g6.f.f75994b;
                    h4.r rVarQ116 = x2.q(uVar.c(aVar8, gVar), f14 / 2);
                    String strQ111112 = gl1.y.Q(o0Var, R.string.lbl_dismiss);
                    if ((i34 & 458752) == 131072) {
                        z54 = true;
                    } else {
                        z54 = false;
                    }
                    boolean zR1113 = z54 | o0Var.r(fVar4) | o0Var.r(context);
                    if (i35 != 4) {
                        z55 = true;
                    } else {
                        z55 = true;
                    }
                    boolean z6119 = zR1113 | z55;
                    if ((i34 & 3670016) == 1048576) {
                        z56 = true;
                    } else {
                        z56 = false;
                    }
                    z57 = z6119 | z56;
                    objQ2 = o0Var.q();
                    if (z57) {
                        aVar4.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new gw1.g(z45, fVar4, context, d0Var2, z46);
                            o0Var.K(objQ2);
                        }
                    } else {
                        objQ2 = new gw1.g(z45, fVar4, context, d0Var2, z46);
                        o0Var.K(objQ2);
                    }
                    p3.o0 o0Var117 = o0Var;
                    i7.b(dVarB116, strQ111111, u1.w.d(rVarQ116, false, strQ111112, null, (e23.a) objQ2, 13), am.j.d(o0Var), o0Var117, 0, 0);
                    o0Var = o0Var117;
                    z58 = true;
                    o0Var.g0(true);
                    o0Var.g0(false);
                } else {
                    o0Var.C(1846903274);
                    bVar2.getClass();
                    f14 = cVar.f97904c;
                    h4.r rVarD1114 = u1.n.d(x2.q(aVar8, f14), new o4.t1(((o4.d0) d92.b.a(o0Var).d().a().f76496r.getF182175a()).f128833a, null), k2.i.f102406a, 4);
                    z0VarD2 = c2.q.d(h4.d.a.f81524b, false);
                    x1 x1Var11117 = p3.n.f135158a;
                    iHashCode4 = Long.hashCode(o0Var.U);
                    i2VarA3 = o0Var.a0();
                    rVarC4 = h4.k.c(rVarD1114, o0Var);
                    if (cVar2 == null) {
                        p3.p0.l();
                        throw null;
                    }
                    o0Var.z();
                    if (o0Var.T) {
                        o0Var.M(aVar6);
                    } else {
                        o0Var.c();
                    }
                    b4.c(eVar, z0VarD2, o0Var);
                    b4.c(c1623g, i2VarA3, o0Var);
                    if (o0Var.T) {
                        v.h.A(iHashCode4, o0Var, iHashCode4, bVar);
                    } else {
                        v.h.A(iHashCode4, o0Var, iHashCode4, bVar);
                    }
                    b4.c(fVar2, rVarC4, o0Var);
                    u4.d.b bVar11113 = u4.d.f168373k;
                    u4.d dVarB117 = n5.e.b(R.drawable.close_x_thick, o0Var, 6);
                    String strQ111113 = gl1.y.Q(o0Var, R.string.lbl_dismiss);
                    g6.f.a aVar11119 = g6.f.f75994b;
                    h4.r rVarQ117 = x2.q(uVar.c(aVar8, gVar), f14 / 2);
                    String strQ111114 = gl1.y.Q(o0Var, R.string.lbl_dismiss);
                    if ((i34 & 458752) == 131072) {
                        z54 = true;
                    } else {
                        z54 = false;
                    }
                    boolean zR1114 = z54 | o0Var.r(fVar4) | o0Var.r(context);
                    if (i35 != 4) {
                        z55 = true;
                    } else {
                        z55 = true;
                    }
                    boolean z61110 = zR1114 | z55;
                    if ((i34 & 3670016) == 1048576) {
                        z56 = true;
                    } else {
                        z56 = false;
                    }
                    z57 = z61110 | z56;
                    objQ2 = o0Var.q();
                    if (z57) {
                        aVar4.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new gw1.g(z45, fVar4, context, d0Var2, z46);
                            o0Var.K(objQ2);
                        }
                    } else {
                        objQ2 = new gw1.g(z45, fVar4, context, d0Var2, z46);
                        o0Var.K(objQ2);
                    }
                    p3.o0 o0Var118 = o0Var;
                    i7.b(dVarB117, strQ111113, u1.w.d(rVarQ117, false, strQ111114, null, (e23.a) objQ2, 13), am.j.d(o0Var), o0Var118, 0, 0);
                    o0Var = o0Var118;
                    z58 = true;
                    o0Var.g0(true);
                    o0Var.g0(false);
                }
                o0Var.g0(z58);
                o0Var.g0(z58);
                x1 x1Var11118 = p3.n.f135158a;
                pVar2 = pVar4;
                z26 = z37;
                aVar2 = aVar7;
                z29 = z45;
                z27 = z46;
                z28 = z47;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                z26 = z15;
                aVar2 = aVar;
                z27 = z24;
                z28 = z18;
                z29 = z19;
                pVar2 = pVar;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new com.google.maps.android.compose.streetview.a(d0Var, fVar, rVar, z28, z26, z29, z27, aVar2, pVar2, i14, i15);
            }
        }
        i16 |= 100663296;
        i34 = i16;
        if ((i16 & 38347923) != 38347922) {
            z25 = true;
        } else {
            z25 = false;
        }
        if (o0VarE.n(i34 & 1, z25)) {
            if (i38 != 0) {
                z18 = false;
            }
            if (i17 != 0) {
                z34 = false;
            } else {
                z34 = z15;
            }
            if (i19 != 0) {
                z35 = false;
            } else {
                z35 = z19;
            }
            if (i25 != 0) {
                z24 = false;
            }
            if (i27 != 0) {
                aVar3 = null;
            } else {
                aVar3 = aVar;
            }
            if (i29 != 0) {
                pVar3 = null;
            } else {
                pVar3 = pVar;
            }
            x1 x1Var11119 = p3.n.f135158a;
            context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            if (((g6.c) o0VarE.A(t1.f91490h)).getF94882b() >= 1.3d) {
                z36 = true;
            } else {
                z36 = false;
            }
            h4.d.f81522a.getClass();
            gVar = h4.d.a.f81528f;
            z37 = z34;
            h4.r rVarE8 = u1.n.e(x2.x(x2.f(rVar, 1.0f), null, 3), am.j.c(d92.b.f58623a, o0VarE), m1.f128891a);
            if ((i34 & 29360128) == 8388608) {
                z38 = true;
            } else {
                z38 = false;
            }
            boolean zR1115 = z38 | o0VarE.r(fVar) | o0VarE.r(context);
            i35 = i34 & 14;
            if (i35 != 4) {
                z39 = true;
            } else {
                z39 = true;
            }
            z44 = zR1115 | z39;
            objQ = o0VarE.q();
            aVar4 = p3.m.f135153a;
            if (z44) {
                aVar4.getClass();
                if (objQ == p3.m.a.f135155b) {
                    e23.a<Unit> aVar111110 = aVar3;
                    objQ = new ho.d0((Object) aVar111110, (Object) fVar, (Object) context, (Object) d0Var, 18, (byte) 0);
                    aVar5 = aVar111110;
                    o0VarE.K(objQ);
                } else {
                    aVar5 = aVar3;
                }
            } else {
                e23.a<Unit> aVar111111 = aVar3;
                objQ = new ho.d0((Object) aVar111111, (Object) fVar, (Object) context, (Object) d0Var, 18, (byte) 0);
                aVar5 = aVar111111;
                o0VarE.K(objQ);
            }
            h4.r rVarD1115 = u1.w.d(rVarE8, false, null, null, (e23.a) objQ, 15);
            z0VarD = c2.q.d(gVar, false);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(rVarD1115, o0VarE);
            h5.g.V.getClass();
            aVar6 = h5.g.a.f81805b;
            if (cVar2 != null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            aVar7 = aVar5;
            if (o0VarE.T) {
                o0VarE.M(aVar6);
            } else {
                o0VarE.c();
            }
            eVar = h5.g.a.f81810g;
            b4.c(eVar, z0VarD, o0VarE);
            c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            bVar = h5.g.a.f81813j;
            z45 = z35;
            if (o0VarE.T) {
                z46 = z24;
                if (!p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                }
                fVar2 = h5.g.a.f81807d;
                b4.c(fVar2, rVarC, o0VarE);
                uVar = c2.u.f22885a;
                c2.j jVar15 = c2.j.f22691a;
                bVar2 = d92.b.f58625c;
                bVar2.getClass();
                j92.e eVar16 = j92.b.f97899b;
                float f119 = eVar16.f97920e;
                jVar15.getClass();
                c2.j.i iVarI15 = c2.j.i(f119);
                z47 = z18;
                h4.g.b bVar11114 = h4.d.a.f81534l;
                aVar8 = h4.r.S;
                bVar2.getClass();
                h4.r rVarY15 = c2.l.y(aVar8, eVar16.f97920e);
                s2VarA = q2.a(iVarI15, bVar11114, o0VarE, 48);
                iHashCode2 = Long.hashCode(o0VarE.U);
                i2VarA1 = o0VarE.a0();
                rVarC2 = h4.k.c(rVarY15, o0VarE);
                if (cVar2 != null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar6);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar, s2VarA, o0VarE);
                b4.c(c1623g, i2VarA1, o0VarE);
                if (o0VarE.T) {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                } else {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                }
                b4.c(fVar2, rVarC2, o0VarE);
                u2 u2Var15 = u2.f22900a;
                bVar2.getClass();
                cVar = j92.b.f97901d;
                i36 = i34 & 126;
                c(d0Var, fVar, cVar.f97906e, null, o0VarE, i36);
                h4.r rVarX15 = x2.x(u2Var15.a(aVar8, 1.0f, true), null, 3);
                pVar4 = pVar3;
                zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, o0VarE, 0);
                iHashCode3 = Long.hashCode(o0VarE.U);
                i2VarA2 = o0VarE.a0();
                rVarC3 = h4.k.c(rVarX15, o0VarE);
                if (cVar2 != null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar6);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar, zVarA, o0VarE);
                b4.c(c1623g, i2VarA2, o0VarE);
                if (o0VarE.T) {
                    v.h.A(iHashCode3, o0VarE, iHashCode3, bVar);
                } else {
                    v.h.A(iHashCode3, o0VarE, iHashCode3, bVar);
                }
                b4.c(fVar2, rVarC3, o0VarE);
                c2.b0 b0Var15 = c2.b0.f22601a;
                str = d0Var.f112651d;
                boolean z5113 = d0Var.f112652e;
                if (str == null) {
                    str = "";
                }
                String str1110 = str;
                fVar3 = d92.b.f58624b;
                fVar3.getClass();
                x0 x0Var15 = j92.f.f97931h;
                long jD15 = com.nimbusds.jose.shaded.gson.internal.a.d(o0VarE);
                d6.p.f57793b.getClass();
                i37 = d6.p.f57795d;
                mh.c(str1110, null, jD15, null, 0L, null, 0L, null, 0L, i37, false, 1, 0, null, x0Var15, o0VarE, 0, 24960, 110586);
                o0Var = o0VarE;
                if (g22.n.d(d0Var.f112653f)) {
                    o0Var.C(1814213146);
                    String str1111 = d0Var.f112653f;
                    fVar3.getClass();
                    mh.c(str1111, null, 0L, null, 0L, null, 0L, null, 0L, i37, false, 2, 0, null, x0.a(j92.f.f97933j, vb.h.g(o0Var), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), o0Var, 0, 24960, 110590);
                    o0Var.g0(false);
                } else {
                    o0Var.C(1814479901);
                    o0Var.g0(false);
                }
                if (z37) {
                    o0Var.C(1814578171);
                    if (pVar4 == null) {
                        o0Var.C(1814621416);
                        if (z45) {
                            z48 = true;
                        } else {
                            z48 = true;
                        }
                        z.f(d0Var, fVar, z48, null, o0Var, i36, 8);
                        o0Var.g0(false);
                    } else {
                        o0Var.C(1814741944);
                        e5.q((i34 >> 24) & 14, pVar4, o0Var, false);
                    }
                    o0Var.g0(false);
                } else {
                    o0Var.C(1814578171);
                    if (pVar4 == null) {
                        o0Var.C(1814621416);
                        if (z45) {
                            z48 = true;
                        } else {
                            z48 = true;
                        }
                        z.f(d0Var, fVar, z48, null, o0Var, i36, 8);
                        o0Var.g0(false);
                    } else {
                        o0Var.C(1814741944);
                        e5.q((i34 >> 24) & 14, pVar4, o0Var, false);
                    }
                    o0Var.g0(false);
                }
                o0Var.g0(true);
                if (z37) {
                    o0Var.C(1846551145);
                    if (pVar4 == null) {
                        o0Var.C(1846590918);
                        if (z45) {
                            z49 = true;
                        } else {
                            z49 = true;
                        }
                        z.f(d0Var, fVar, z49, null, o0Var, i36, 8);
                        d0Var2 = d0Var;
                        fVar4 = fVar;
                        o0Var.g0(false);
                    } else {
                        d0Var2 = d0Var;
                        fVar4 = fVar;
                        o0Var.C(1846703510);
                        e5.q((i34 >> 24) & 14, pVar4, o0Var, false);
                    }
                    o0Var.g0(false);
                } else {
                    o0Var.C(1846551145);
                    if (pVar4 == null) {
                        o0Var.C(1846590918);
                        if (z45) {
                            z49 = true;
                        } else {
                            z49 = true;
                        }
                        z.f(d0Var, fVar, z49, null, o0Var, i36, 8);
                        d0Var2 = d0Var;
                        fVar4 = fVar;
                        o0Var.g0(false);
                    } else {
                        d0Var2 = d0Var;
                        fVar4 = fVar;
                        o0Var.C(1846703510);
                        e5.q((i34 >> 24) & 14, pVar4, o0Var, false);
                    }
                    o0Var.g0(false);
                }
                if (z37) {
                    o0Var.C(1846903274);
                    bVar2.getClass();
                    f14 = cVar.f97904c;
                    h4.r rVarD1116 = u1.n.d(x2.q(aVar8, f14), new o4.t1(((o4.d0) d92.b.a(o0Var).d().a().f76496r.getF182175a()).f128833a, null), k2.i.f102406a, 4);
                    z0VarD2 = c2.q.d(h4.d.a.f81524b, false);
                    x1 x1Var111110 = p3.n.f135158a;
                    iHashCode4 = Long.hashCode(o0Var.U);
                    i2VarA3 = o0Var.a0();
                    rVarC4 = h4.k.c(rVarD1116, o0Var);
                    if (cVar2 == null) {
                        p3.p0.l();
                        throw null;
                    }
                    o0Var.z();
                    if (o0Var.T) {
                        o0Var.M(aVar6);
                    } else {
                        o0Var.c();
                    }
                    b4.c(eVar, z0VarD2, o0Var);
                    b4.c(c1623g, i2VarA3, o0Var);
                    if (o0Var.T) {
                        v.h.A(iHashCode4, o0Var, iHashCode4, bVar);
                    } else {
                        v.h.A(iHashCode4, o0Var, iHashCode4, bVar);
                    }
                    b4.c(fVar2, rVarC4, o0Var);
                    u4.d.b bVar11115 = u4.d.f168373k;
                    u4.d dVarB118 = n5.e.b(R.drawable.close_x_thick, o0Var, 6);
                    String strQ111115 = gl1.y.Q(o0Var, R.string.lbl_dismiss);
                    g6.f.a aVar111112 = g6.f.f75994b;
                    h4.r rVarQ118 = x2.q(uVar.c(aVar8, gVar), f14 / 2);
                    String strQ111116 = gl1.y.Q(o0Var, R.string.lbl_dismiss);
                    if ((i34 & 458752) == 131072) {
                        z54 = true;
                    } else {
                        z54 = false;
                    }
                    boolean zR1116 = z54 | o0Var.r(fVar4) | o0Var.r(context);
                    if (i35 != 4) {
                        z55 = true;
                    } else {
                        z55 = true;
                    }
                    boolean z61111 = zR1116 | z55;
                    if ((i34 & 3670016) == 1048576) {
                        z56 = true;
                    } else {
                        z56 = false;
                    }
                    z57 = z61111 | z56;
                    objQ2 = o0Var.q();
                    if (z57) {
                        aVar4.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new gw1.g(z45, fVar4, context, d0Var2, z46);
                            o0Var.K(objQ2);
                        }
                    } else {
                        objQ2 = new gw1.g(z45, fVar4, context, d0Var2, z46);
                        o0Var.K(objQ2);
                    }
                    p3.o0 o0Var119 = o0Var;
                    i7.b(dVarB118, strQ111115, u1.w.d(rVarQ118, false, strQ111116, null, (e23.a) objQ2, 13), am.j.d(o0Var), o0Var119, 0, 0);
                    o0Var = o0Var119;
                    z58 = true;
                    o0Var.g0(true);
                    o0Var.g0(false);
                } else {
                    o0Var.C(1846903274);
                    bVar2.getClass();
                    f14 = cVar.f97904c;
                    h4.r rVarD1117 = u1.n.d(x2.q(aVar8, f14), new o4.t1(((o4.d0) d92.b.a(o0Var).d().a().f76496r.getF182175a()).f128833a, null), k2.i.f102406a, 4);
                    z0VarD2 = c2.q.d(h4.d.a.f81524b, false);
                    x1 x1Var111111 = p3.n.f135158a;
                    iHashCode4 = Long.hashCode(o0Var.U);
                    i2VarA3 = o0Var.a0();
                    rVarC4 = h4.k.c(rVarD1117, o0Var);
                    if (cVar2 == null) {
                        p3.p0.l();
                        throw null;
                    }
                    o0Var.z();
                    if (o0Var.T) {
                        o0Var.M(aVar6);
                    } else {
                        o0Var.c();
                    }
                    b4.c(eVar, z0VarD2, o0Var);
                    b4.c(c1623g, i2VarA3, o0Var);
                    if (o0Var.T) {
                        v.h.A(iHashCode4, o0Var, iHashCode4, bVar);
                    } else {
                        v.h.A(iHashCode4, o0Var, iHashCode4, bVar);
                    }
                    b4.c(fVar2, rVarC4, o0Var);
                    u4.d.b bVar11116 = u4.d.f168373k;
                    u4.d dVarB119 = n5.e.b(R.drawable.close_x_thick, o0Var, 6);
                    String strQ111117 = gl1.y.Q(o0Var, R.string.lbl_dismiss);
                    g6.f.a aVar111113 = g6.f.f75994b;
                    h4.r rVarQ119 = x2.q(uVar.c(aVar8, gVar), f14 / 2);
                    String strQ111118 = gl1.y.Q(o0Var, R.string.lbl_dismiss);
                    if ((i34 & 458752) == 131072) {
                        z54 = true;
                    } else {
                        z54 = false;
                    }
                    boolean zR1117 = z54 | o0Var.r(fVar4) | o0Var.r(context);
                    if (i35 != 4) {
                        z55 = true;
                    } else {
                        z55 = true;
                    }
                    boolean z61112 = zR1117 | z55;
                    if ((i34 & 3670016) == 1048576) {
                        z56 = true;
                    } else {
                        z56 = false;
                    }
                    z57 = z61112 | z56;
                    objQ2 = o0Var.q();
                    if (z57) {
                        aVar4.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new gw1.g(z45, fVar4, context, d0Var2, z46);
                            o0Var.K(objQ2);
                        }
                    } else {
                        objQ2 = new gw1.g(z45, fVar4, context, d0Var2, z46);
                        o0Var.K(objQ2);
                    }
                    p3.o0 o0Var1110 = o0Var;
                    i7.b(dVarB119, strQ111117, u1.w.d(rVarQ119, false, strQ111118, null, (e23.a) objQ2, 13), am.j.d(o0Var), o0Var1110, 0, 0);
                    o0Var = o0Var1110;
                    z58 = true;
                    o0Var.g0(true);
                    o0Var.g0(false);
                }
                o0Var.g0(z58);
                o0Var.g0(z58);
                x1 x1Var111112 = p3.n.f135158a;
                pVar2 = pVar4;
                z26 = z37;
                aVar2 = aVar7;
                z29 = z45;
                z27 = z46;
                z28 = z47;
            } else {
                z46 = z24;
            }
            v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            fVar2 = h5.g.a.f81807d;
            b4.c(fVar2, rVarC, o0VarE);
            uVar = c2.u.f22885a;
            c2.j jVar16 = c2.j.f22691a;
            bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar17 = j92.b.f97899b;
            float f1110 = eVar17.f97920e;
            jVar16.getClass();
            c2.j.i iVarI16 = c2.j.i(f1110);
            z47 = z18;
            h4.g.b bVar11117 = h4.d.a.f81534l;
            aVar8 = h4.r.S;
            bVar2.getClass();
            h4.r rVarY16 = c2.l.y(aVar8, eVar17.f97920e);
            s2VarA = q2.a(iVarI16, bVar11117, o0VarE, 48);
            iHashCode2 = Long.hashCode(o0VarE.U);
            i2VarA1 = o0VarE.a0();
            rVarC2 = h4.k.c(rVarY16, o0VarE);
            if (cVar2 != null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar6);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, s2VarA, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            } else {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            }
            b4.c(fVar2, rVarC2, o0VarE);
            u2 u2Var16 = u2.f22900a;
            bVar2.getClass();
            cVar = j92.b.f97901d;
            i36 = i34 & 126;
            c(d0Var, fVar, cVar.f97906e, null, o0VarE, i36);
            h4.r rVarX16 = x2.x(u2Var16.a(aVar8, 1.0f, true), null, 3);
            pVar4 = pVar3;
            zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, o0VarE, 0);
            iHashCode3 = Long.hashCode(o0VarE.U);
            i2VarA2 = o0VarE.a0();
            rVarC3 = h4.k.c(rVarX16, o0VarE);
            if (cVar2 != null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar6);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, zVarA, o0VarE);
            b4.c(c1623g, i2VarA2, o0VarE);
            if (o0VarE.T) {
                v.h.A(iHashCode3, o0VarE, iHashCode3, bVar);
            } else {
                v.h.A(iHashCode3, o0VarE, iHashCode3, bVar);
            }
            b4.c(fVar2, rVarC3, o0VarE);
            c2.b0 b0Var16 = c2.b0.f22601a;
            str = d0Var.f112651d;
            boolean z5114 = d0Var.f112652e;
            if (str == null) {
                str = "";
            }
            String str1112 = str;
            fVar3 = d92.b.f58624b;
            fVar3.getClass();
            x0 x0Var16 = j92.f.f97931h;
            long jD16 = com.nimbusds.jose.shaded.gson.internal.a.d(o0VarE);
            d6.p.f57793b.getClass();
            i37 = d6.p.f57795d;
            mh.c(str1112, null, jD16, null, 0L, null, 0L, null, 0L, i37, false, 1, 0, null, x0Var16, o0VarE, 0, 24960, 110586);
            o0Var = o0VarE;
            if (g22.n.d(d0Var.f112653f)) {
                o0Var.C(1814213146);
                String str1113 = d0Var.f112653f;
                fVar3.getClass();
                mh.c(str1113, null, 0L, null, 0L, null, 0L, null, 0L, i37, false, 2, 0, null, x0.a(j92.f.f97933j, vb.h.g(o0Var), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), o0Var, 0, 24960, 110590);
                o0Var.g0(false);
            } else {
                o0Var.C(1814479901);
                o0Var.g0(false);
            }
            if (z37) {
                o0Var.C(1814578171);
                if (pVar4 == null) {
                    o0Var.C(1814621416);
                    if (z45) {
                        z48 = true;
                    } else {
                        z48 = true;
                    }
                    z.f(d0Var, fVar, z48, null, o0Var, i36, 8);
                    o0Var.g0(false);
                } else {
                    o0Var.C(1814741944);
                    e5.q((i34 >> 24) & 14, pVar4, o0Var, false);
                }
                o0Var.g0(false);
            } else {
                o0Var.C(1814578171);
                if (pVar4 == null) {
                    o0Var.C(1814621416);
                    if (z45) {
                        z48 = true;
                    } else {
                        z48 = true;
                    }
                    z.f(d0Var, fVar, z48, null, o0Var, i36, 8);
                    o0Var.g0(false);
                } else {
                    o0Var.C(1814741944);
                    e5.q((i34 >> 24) & 14, pVar4, o0Var, false);
                }
                o0Var.g0(false);
            }
            o0Var.g0(true);
            if (z37) {
                o0Var.C(1846551145);
                if (pVar4 == null) {
                    o0Var.C(1846590918);
                    if (z45) {
                        z49 = true;
                    } else {
                        z49 = true;
                    }
                    z.f(d0Var, fVar, z49, null, o0Var, i36, 8);
                    d0Var2 = d0Var;
                    fVar4 = fVar;
                    o0Var.g0(false);
                } else {
                    d0Var2 = d0Var;
                    fVar4 = fVar;
                    o0Var.C(1846703510);
                    e5.q((i34 >> 24) & 14, pVar4, o0Var, false);
                }
                o0Var.g0(false);
            } else {
                o0Var.C(1846551145);
                if (pVar4 == null) {
                    o0Var.C(1846590918);
                    if (z45) {
                        z49 = true;
                    } else {
                        z49 = true;
                    }
                    z.f(d0Var, fVar, z49, null, o0Var, i36, 8);
                    d0Var2 = d0Var;
                    fVar4 = fVar;
                    o0Var.g0(false);
                } else {
                    d0Var2 = d0Var;
                    fVar4 = fVar;
                    o0Var.C(1846703510);
                    e5.q((i34 >> 24) & 14, pVar4, o0Var, false);
                }
                o0Var.g0(false);
            }
            if (z37) {
                o0Var.C(1846903274);
                bVar2.getClass();
                f14 = cVar.f97904c;
                h4.r rVarD1118 = u1.n.d(x2.q(aVar8, f14), new o4.t1(((o4.d0) d92.b.a(o0Var).d().a().f76496r.getF182175a()).f128833a, null), k2.i.f102406a, 4);
                z0VarD2 = c2.q.d(h4.d.a.f81524b, false);
                x1 x1Var111113 = p3.n.f135158a;
                iHashCode4 = Long.hashCode(o0Var.U);
                i2VarA3 = o0Var.a0();
                rVarC4 = h4.k.c(rVarD1118, o0Var);
                if (cVar2 == null) {
                    p3.p0.l();
                    throw null;
                }
                o0Var.z();
                if (o0Var.T) {
                    o0Var.M(aVar6);
                } else {
                    o0Var.c();
                }
                b4.c(eVar, z0VarD2, o0Var);
                b4.c(c1623g, i2VarA3, o0Var);
                if (o0Var.T) {
                    v.h.A(iHashCode4, o0Var, iHashCode4, bVar);
                } else {
                    v.h.A(iHashCode4, o0Var, iHashCode4, bVar);
                }
                b4.c(fVar2, rVarC4, o0Var);
                u4.d.b bVar11118 = u4.d.f168373k;
                u4.d dVarB1110 = n5.e.b(R.drawable.close_x_thick, o0Var, 6);
                String strQ111119 = gl1.y.Q(o0Var, R.string.lbl_dismiss);
                g6.f.a aVar111114 = g6.f.f75994b;
                h4.r rVarQ1110 = x2.q(uVar.c(aVar8, gVar), f14 / 2);
                String strQ1111110 = gl1.y.Q(o0Var, R.string.lbl_dismiss);
                if ((i34 & 458752) == 131072) {
                    z54 = true;
                } else {
                    z54 = false;
                }
                boolean zR1118 = z54 | o0Var.r(fVar4) | o0Var.r(context);
                if (i35 != 4) {
                    z55 = true;
                } else {
                    z55 = true;
                }
                boolean z61113 = zR1118 | z55;
                if ((i34 & 3670016) == 1048576) {
                    z56 = true;
                } else {
                    z56 = false;
                }
                z57 = z61113 | z56;
                objQ2 = o0Var.q();
                if (z57) {
                    aVar4.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new gw1.g(z45, fVar4, context, d0Var2, z46);
                        o0Var.K(objQ2);
                    }
                } else {
                    objQ2 = new gw1.g(z45, fVar4, context, d0Var2, z46);
                    o0Var.K(objQ2);
                }
                p3.o0 o0Var1111 = o0Var;
                i7.b(dVarB1110, strQ111119, u1.w.d(rVarQ1110, false, strQ1111110, null, (e23.a) objQ2, 13), am.j.d(o0Var), o0Var1111, 0, 0);
                o0Var = o0Var1111;
                z58 = true;
                o0Var.g0(true);
                o0Var.g0(false);
            } else {
                o0Var.C(1846903274);
                bVar2.getClass();
                f14 = cVar.f97904c;
                h4.r rVarD1119 = u1.n.d(x2.q(aVar8, f14), new o4.t1(((o4.d0) d92.b.a(o0Var).d().a().f76496r.getF182175a()).f128833a, null), k2.i.f102406a, 4);
                z0VarD2 = c2.q.d(h4.d.a.f81524b, false);
                x1 x1Var111114 = p3.n.f135158a;
                iHashCode4 = Long.hashCode(o0Var.U);
                i2VarA3 = o0Var.a0();
                rVarC4 = h4.k.c(rVarD1119, o0Var);
                if (cVar2 == null) {
                    p3.p0.l();
                    throw null;
                }
                o0Var.z();
                if (o0Var.T) {
                    o0Var.M(aVar6);
                } else {
                    o0Var.c();
                }
                b4.c(eVar, z0VarD2, o0Var);
                b4.c(c1623g, i2VarA3, o0Var);
                if (o0Var.T) {
                    v.h.A(iHashCode4, o0Var, iHashCode4, bVar);
                } else {
                    v.h.A(iHashCode4, o0Var, iHashCode4, bVar);
                }
                b4.c(fVar2, rVarC4, o0Var);
                u4.d.b bVar11119 = u4.d.f168373k;
                u4.d dVarB1111 = n5.e.b(R.drawable.close_x_thick, o0Var, 6);
                String strQ1111111 = gl1.y.Q(o0Var, R.string.lbl_dismiss);
                g6.f.a aVar111115 = g6.f.f75994b;
                h4.r rVarQ1111 = x2.q(uVar.c(aVar8, gVar), f14 / 2);
                String strQ1111112 = gl1.y.Q(o0Var, R.string.lbl_dismiss);
                if ((i34 & 458752) == 131072) {
                    z54 = true;
                } else {
                    z54 = false;
                }
                boolean zR1119 = z54 | o0Var.r(fVar4) | o0Var.r(context);
                if (i35 != 4) {
                    z55 = true;
                } else {
                    z55 = true;
                }
                boolean z61114 = zR1119 | z55;
                if ((i34 & 3670016) == 1048576) {
                    z56 = true;
                } else {
                    z56 = false;
                }
                z57 = z61114 | z56;
                objQ2 = o0Var.q();
                if (z57) {
                    aVar4.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new gw1.g(z45, fVar4, context, d0Var2, z46);
                        o0Var.K(objQ2);
                    }
                } else {
                    objQ2 = new gw1.g(z45, fVar4, context, d0Var2, z46);
                    o0Var.K(objQ2);
                }
                p3.o0 o0Var1112 = o0Var;
                i7.b(dVarB1111, strQ1111111, u1.w.d(rVarQ1111, false, strQ1111112, null, (e23.a) objQ2, 13), am.j.d(o0Var), o0Var1112, 0, 0);
                o0Var = o0Var1112;
                z58 = true;
                o0Var.g0(true);
                o0Var.g0(false);
            }
            o0Var.g0(z58);
            o0Var.g0(z58);
            x1 x1Var111115 = p3.n.f135158a;
            pVar2 = pVar4;
            z26 = z37;
            aVar2 = aVar7;
            z29 = z45;
            z27 = z46;
            z28 = z47;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            z26 = z15;
            aVar2 = aVar;
            z27 = z24;
            z28 = z18;
            z29 = z19;
            pVar2 = pVar;
        }
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new com.google.maps.android.compose.streetview.a(d0Var, fVar, rVar, z28, z26, z29, z27, aVar2, pVar2, i14, i15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x008c  */
    public static final void b(d0 d0Var, f fVar, h4.r rVar, p3.m mVar, int i14) {
        int i15;
        p3.o0 o0VarE = mVar.E(-386443829);
        p3.c<?> cVar = o0VarE.f135177b;
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(d0Var) : o0VarE.r(d0Var) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(fVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(rVar) ? 256 : 128;
        }
        int i16 = i15 | 3072;
        if (o0VarE.n(i16 & 1, (i16 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            String str = d0Var.f112650c;
            boolean zR = ((i16 & 14) == 4 || ((i16 & 8) != 0 && o0VarE.r(d0Var))) | o0VarE.r(fVar);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new i0(fVar, d0Var, null);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new i0(fVar, d0Var, null);
                    o0VarE.K(objQ);
                }
            }
            p3.l0.e((e23.p) objQ, str, o0VarE);
            h4.d.f81522a.getClass();
            h4.g gVar = h4.d.a.f81528f;
            h4.r rVarE = u1.n.e(x2.x(x2.f(rVar, 1.0f), null, 3), am.j.c(d92.b.f58623a, o0VarE), m1.f128891a);
            z0 z0VarD = c2.q.d(gVar, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarE, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar = h5.g.a.f81805b;
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, z0VarD, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            h5.g.a.f fVar2 = h5.g.a.f81807d;
            b4.c(fVar2, rVarC, o0VarE);
            c2.u uVar = c2.u.f22885a;
            c2.j jVar = c2.j.f22691a;
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar2 = j92.b.f97899b;
            float f14 = eVar2.f97920e;
            jVar.getClass();
            c2.j.i iVarI = c2.j.i(f14);
            h4.g.b bVar3 = h4.d.a.f81534l;
            h4.r.a aVar2 = h4.r.S;
            bVar2.getClass();
            h4.r rVarY = c2.l.y(aVar2, eVar2.f97920e);
            s2 s2VarA = q2.a(iVarI, bVar3, o0VarE, 48);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarY, o0VarE);
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, s2VarA, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            }
            b4.c(fVar2, rVarC2, o0VarE);
            u2 u2Var = u2.f22900a;
            String str2 = d0Var.f112651d;
            if (str2 == null) {
                str2 = "";
            }
            String strP = gl1.y.P(R.string.message_will_not_suggest_follow, new Object[]{str2}, o0VarE);
            bVar2.getClass();
            h4.r rVarA = u2Var.a(c2.l.C(aVar2, 0.0f, 0.0f, eVar2.f97918c, 0.0f, 11), 1.0f, true);
            d92.b.f58624b.getClass();
            mh.c(strP, rVarA, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0.a(j92.f.f97933j, vb.h.g(o0VarE), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), o0VarE, 0, 0, 131068);
            z.f(d0Var, fVar, false, null, o0VarE, ((i16 >> 3) & 896) | (i16 & 126), 8);
            o0VarE.g0(true);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ao1.b(d0Var, fVar, rVar, i14, 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00e4  */
    public static final void c(d0 d0Var, f fVar, float f14, h4.r rVar, p3.m mVar, int i14) {
        int i15;
        h4.r rVar2;
        p3.o0 o0VarE = mVar.E(888016825);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(d0Var) : o0VarE.r(d0Var) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(fVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.i(f14) ? 256 : 128;
        }
        int i16 = i15 | 3072;
        boolean z14 = false;
        if (o0VarE.n(i16 & 1, (i16 & 1171) != 1170)) {
            h4.r.a aVar = h4.r.S;
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            String strG = e5.g(gl1.y.Q(o0VarE, R.string.startup_profile_image), "\n", d0Var.f112651d);
            b12.b bVar = d0Var.f112648a;
            f12.u uVar = bVar != null ? bVar.f14389c : null;
            if (uVar == null) {
                o0VarE.C(-2089001985);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-2089001984);
                strG = ((Object) strG) + "\n" + gl1.y.P(R.string.lbl_badge_level_value, new Object[]{Integer.valueOf(uVar.f68114a)}, o0VarE);
                o0VarE.g0(false);
            }
            boolean zR = o0VarE.r(fVar) | o0VarE.r(context);
            if ((i16 & 14) == 4 || ((i16 & 8) != 0 && o0VarE.r(d0Var))) {
                z14 = true;
            }
            boolean z15 = zR | z14;
            Object objQ = o0VarE.q();
            if (z15) {
                objQ = new f0(fVar, context, d0Var, 1);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new f0(fVar, context, d0Var, 1);
                    o0VarE.K(objQ);
                }
            }
            rVar2 = aVar;
            b12.k.b(u1.w.d(aVar, false, null, null, (e23.a) objQ, 15), strG, f14, d0Var.f112648a, o0VarE, (i16 & 896) | (b12.b.f14385f << 9), 16);
        } else {
            o0VarE.e();
            rVar2 = rVar;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g0(d0Var, fVar, f14, rVar2, i14, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(-245060701);
        p3.c<?> cVar = o0VarE.f135177b;
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            x1 x1Var = p3.n.f135158a;
            boolean z14 = ((double) ((g6.c) o0VarE.A(t1.f91490h)).getF94882b()) >= 1.3d;
            s1.n0.a aVarA = r1.p2.a(s1.p0.c(null, o0VarE, 1), o4.f0.d(4283189837L), am.j.c(d92.b.f58623a, o0VarE), s1.l.a(s1.l.d(1000, 0, s1.e0.f155560a, 2), y0.Reverse, 4), o0VarE, 4152, 8);
            h4.d.f81522a.getClass();
            h4.g gVar = h4.d.a.f81528f;
            h4.r.a aVar = h4.r.S;
            h4.r rVarX = x2.x(x2.f(aVar, 1.0f), null, 3);
            long jB = p6.b.b(o0VarE);
            m1.a aVar2 = m1.f128891a;
            h4.r rVarE = u1.n.e(rVarX, jB, aVar2);
            z0 z0VarD = c2.q.d(gVar, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarE, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar3 = h5.g.a.f81805b;
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, z0VarD, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            c2.u uVar = c2.u.f22885a;
            c2.j jVar = c2.j.f22691a;
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar2 = j92.b.f97899b;
            float f14 = eVar2.f97920e;
            jVar.getClass();
            c2.j.i iVarI = c2.j.i(f14);
            h4.g.b bVar3 = h4.d.a.f81534l;
            bVar2.getClass();
            h4.r rVarY = c2.l.y(aVar, eVar2.f97920e);
            s2 s2VarA = q2.a(iVarI, bVar3, o0VarE, 48);
            boolean z15 = z14;
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarY, o0VarE);
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, s2VarA, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            }
            b4.c(fVar, rVarC2, o0VarE);
            u2 u2Var = u2.f22900a;
            bVar2.getClass();
            c2.q.a(u1.n.e(l4.k.b(x2.q(aVar, j92.b.f97901d.f97906e), k2.i.f102406a), ((o4.d0) aVarA.f155651d.getF182175a()).f128833a, aVar2), o0VarE, 0);
            h4.r rVarX2 = x2.x(u2Var.a(aVar, 1.0f, true), null, 3);
            bVar2.getClass();
            c2.z zVarA = c2.y.a(c2.j.i(eVar2.f97919d), h4.d.a.f81536n, o0VarE, 0);
            int iHashCode3 = Long.hashCode(o0VarE.U);
            i2 i2VarA2 = o0VarE.a0();
            h4.r rVarC3 = h4.k.c(rVarX2, o0VarE);
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, zVarA, o0VarE);
            b4.c(c1623g, i2VarA2, o0VarE);
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode3))) {
                v.h.A(iHashCode3, o0VarE, iHashCode3, bVar);
            }
            b4.c(fVar, rVarC3, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            g6.f.a aVar4 = g6.f.f75994b;
            h4.r rVarR = x2.r(aVar, 132, 12);
            c2 c2Var = aVarA.f155651d;
            c2 c2Var2 = aVarA.f155651d;
            c2.q.a(u1.n.e(rVarR, ((o4.d0) c2Var.getF182175a()).f128833a, aVar2), o0VarE, 0);
            c2.q.a(u1.n.e(x2.r(aVar, 90, 9), ((o4.d0) c2Var2.getF182175a()).f128833a, aVar2), o0VarE, 0);
            if (z15) {
                o0VarE.C(302221463);
                c2.q.a(u1.n.e(x2.r(aVar, 114, 34), ((o4.d0) c2Var2.getF182175a()).f128833a, aVar2), o0VarE, 0);
                o0VarE.g0(false);
            } else {
                o0VarE.C(302444415);
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
            if (z15) {
                o0VarE.C(-1136819723);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1137019611);
                c2.q.a(u1.n.e(x2.r(aVar, 114, 34), ((o4.d0) c2Var2.getF182175a()).f128833a, aVar2), o0VarE, 0);
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new l71.i(i14, 23);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0201  */
    /* JADX WARN: Code duplicated, block: B:104:0x022d  */
    /* JADX WARN: Code duplicated, block: B:106:0x0234  */
    /* JADX WARN: Code duplicated, block: B:107:0x0238  */
    /* JADX WARN: Code duplicated, block: B:112:0x0253  */
    /* JADX WARN: Code duplicated, block: B:115:0x0271  */
    /* JADX WARN: Code duplicated, block: B:118:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:121:0x0361  */
    /* JADX WARN: Code duplicated, block: B:129:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:135:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:138:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:140:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:142:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:144:0x0401  */
    /* JADX WARN: Code duplicated, block: B:53:0x0099  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:73:0x0112  */
    /* JADX WARN: Code duplicated, block: B:92:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:94:0x01df  */
    /* JADX WARN: Code duplicated, block: B:96:0x01e5  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void e(d0 d0Var, f fVar, float f14, h4.r rVar, p3.m mVar, int i14) {
        int i15;
        boolean z14;
        p3.c<?> cVar;
        h5.g.a.f fVar2;
        c2.u uVar;
        h4.g.a aVar;
        float f15;
        float f16;
        h4.r.a aVar2;
        c2.z zVarA;
        int iHashCode;
        i2 i2VarA0;
        h4.r rVarC;
        c2.z zVarA2;
        int iHashCode2;
        i2 i2VarA1;
        h4.r rVarC2;
        String str;
        String str2;
        boolean z15;
        boolean z16;
        Object objQ;
        boolean z17;
        Object objQ2;
        f fVar3 = fVar;
        p3.o0 o0VarE = mVar.E(-953735529);
        p3.c<?> cVar2 = o0VarE.f135177b;
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(d0Var) : o0VarE.r(d0Var) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(fVar3) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.i(f14) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.B(rVar) ? 2048 : 1024;
        }
        int i16 = i15;
        if (o0VarE.n(i16 & 1, (i16 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            float f17 = 11;
            g6.f.a aVar3 = g6.f.f75994b;
            int i17 = i16 & 14;
            boolean z18 = i17 == 4 || ((i16 & 8) != 0 && o0VarE.B(d0Var));
            Object objQ3 = o0VarE.q();
            p3.m.a aVar4 = p3.m.f135153a;
            if (z18) {
                if (e0.b(d0Var)) {
                    z14 = false;
                } else {
                    z14 = false;
                }
                objQ3 = hb.a.n(z14, o0VarE);
            } else {
                aVar4.getClass();
                if (objQ3 == p3.m.a.f135155b) {
                    if (e0.b(d0Var) || d0Var.f112649b == b0.REQUEST_SENT) {
                        z14 = false;
                    } else {
                        z14 = true;
                    }
                    objQ3 = hb.a.n(z14, o0VarE);
                }
            }
            p1 p1Var = (p1) objQ3;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            h4.d.f81522a.getClass();
            h4.g gVar = h4.d.a.f81528f;
            h4.r rVarC3 = x2.c(x2.u(rVar, f14), 1.0f);
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            h4.r rVarE = u1.n.e(l4.k.b(rVarC3, k2.i.a(j92.b.f97900c.f97910b)), ds.e0.w(o0VarE), m1.f128891a);
            boolean zR = o0VarE.r(fVar3) | o0VarE.r(context) | (i17 == 4 || ((i16 & 8) != 0 && o0VarE.r(d0Var)));
            Object objQ4 = o0VarE.q();
            if (zR) {
                objQ4 = new f0(fVar3, context, d0Var, 2);
                o0VarE.K(objQ4);
            } else {
                aVar4.getClass();
                if (objQ4 == p3.m.a.f135155b) {
                    objQ4 = new f0(fVar3, context, d0Var, 2);
                    o0VarE.K(objQ4);
                }
            }
            h4.r rVarD = u1.w.d(rVarE, false, null, null, (e23.a) objQ4, 15);
            Object objQ5 = o0VarE.q();
            aVar4.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ5 == c2565a) {
                objQ5 = new x(5);
                o0VarE.K(objQ5);
            }
            h4.r rVarC4 = p5.v.c((e23.l) objQ5, rVarD, false);
            z0 z0VarD = c2.q.d(gVar, false);
            int iHashCode3 = Long.hashCode(o0VarE.U);
            i2 i2VarA2 = o0VarE.a0();
            h4.r rVarC5 = h4.k.c(rVarC4, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar5 = h5.g.a.f81805b;
            if (cVar2 == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar5);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, z0VarD, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA2, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T) {
                cVar = cVar2;
            } else {
                cVar = cVar2;
                if (!p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode3))) {
                }
                fVar2 = h5.g.a.f81807d;
                b4.c(fVar2, rVarC5, o0VarE);
                uVar = c2.u.f22885a;
                aVar = h4.d.a.f81537o;
                c2.j jVar = c2.j.f22691a;
                bVar.getClass();
                j92.e eVar2 = j92.b.f97899b;
                float f18 = eVar2.f97918c;
                f15 = eVar2.f97920e;
                f16 = eVar2.f97918c;
                jVar.getClass();
                c2.j.i iVarI = c2.j.i(f18);
                aVar2 = h4.r.S;
                zVarA = c2.y.a(iVarI, aVar, o0VarE, 48);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(aVar2, o0VarE);
                if (cVar != null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar5);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar, zVarA, o0VarE);
                b4.c(c1623g, i2VarA0, o0VarE);
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                }
                b4.c(fVar2, rVarC, o0VarE);
                c2.b0 b0Var = c2.b0.f22601a;
                bVar.getClass();
                c2.j.i iVarI2 = c2.j.i(f16);
                bVar.getClass();
                h4.r rVarY = c2.l.y(aVar2, f15);
                zVarA2 = c2.y.a(iVarI2, aVar, o0VarE, 48);
                iHashCode2 = Long.hashCode(o0VarE.U);
                i2VarA1 = o0VarE.a0();
                rVarC2 = h4.k.c(rVarY, o0VarE);
                if (cVar != null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar5);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar, zVarA2, o0VarE);
                b4.c(c1623g, i2VarA1, o0VarE);
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
                }
                b4.c(fVar2, rVarC2, o0VarE);
                int i18 = i17 | 384 | (i16 & 112);
                c(d0Var, fVar, f112777a, null, o0VarE, i18);
                str = d0Var.f112651d;
                if (str == null) {
                    str = "";
                }
                d6.h.f57752b.getClass();
                int i19 = d6.h.f57755e;
                j92.f fVar4 = d92.b.f58624b;
                fVar4.getClass();
                x0 x0VarB = d92.c.b(j92.f.f97933j, o0VarE);
                d6.p.f57793b.getClass();
                int i24 = d6.p.f57795d;
                mh.c(str, null, 0L, null, 0L, null, 0L, d6.h.a(i19), 0L, i24, false, 1, 1, null, x0VarB, o0VarE, 0, 221568, 76798);
                str2 = d0Var.f112653f;
                if (str2 == null) {
                    str2 = "";
                }
                fVar4.getClass();
                mh.c(str2, null, 0L, null, 0L, null, 0L, d6.h.a(i19), 0L, i24, false, 2, 2, null, x0.a(j92.f.f97935l, vb.h.g(o0VarE), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), o0VarE, 0, 221568, 76798);
                o0VarE.g0(true);
                bVar.getClass();
                bVar.getClass();
                bVar.getClass();
                bVar.getClass();
                o0VarE = o0VarE;
                fVar3 = fVar;
                z.f(d0Var, fVar3, true, c2.l.B(aVar2, f16, f16, f16, f15), o0VarE, i18, 0);
                o0VarE.g0(true);
                if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                    o0VarE.C(-1055586213);
                    s62.a.f157643a.getClass();
                    u4.d dVarA = o1.a(t62.b.f162798a);
                    String strQ = gl1.y.Q(o0VarE, R.string.lbl_dismiss);
                    h4.r rVarC6 = uVar.c(aVar2, h4.d.a.f81526d);
                    bVar.getClass();
                    h4.r rVarQ = x2.q(c2.l.y(rVarC6, f16), f17);
                    String strQ2 = gl1.y.Q(o0VarE, R.string.lbl_dismiss);
                    boolean zR2 = o0VarE.r(fVar3) | o0VarE.r(context);
                    if (i17 != 4 || ((i16 & 8) != 0 && o0VarE.r(d0Var))) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = zR2 | z15;
                    objQ = o0VarE.q();
                    if (!z16 || objQ == c2565a) {
                        z17 = false;
                        objQ = new f0(fVar3, context, d0Var, 0);
                        o0VarE.K(objQ);
                    } else {
                        z17 = false;
                    }
                    h4.r rVarD2 = u1.w.d(rVarQ, false, strQ2, null, (e23.a) objQ, 13);
                    objQ2 = o0VarE.q();
                    if (objQ2 == c2565a) {
                        objQ2 = new x(4);
                        o0VarE.K(objQ2);
                    }
                    i7.b(dVarA, strQ, p5.v.c((e23.l) objQ2, rVarD2, z17), sn.a.y(o0VarE), o0VarE, 0, 0);
                    o0VarE.g0(z17);
                } else {
                    o0VarE.C(-1054900059);
                    o0VarE.g0(false);
                }
                o0VarE.g0(true);
            }
            v.h.A(iHashCode3, o0VarE, iHashCode3, bVar2);
            fVar2 = h5.g.a.f81807d;
            b4.c(fVar2, rVarC5, o0VarE);
            uVar = c2.u.f22885a;
            aVar = h4.d.a.f81537o;
            c2.j jVar2 = c2.j.f22691a;
            bVar.getClass();
            j92.e eVar3 = j92.b.f97899b;
            float f19 = eVar3.f97918c;
            f15 = eVar3.f97920e;
            f16 = eVar3.f97918c;
            jVar2.getClass();
            c2.j.i iVarI3 = c2.j.i(f19);
            aVar2 = h4.r.S;
            zVarA = c2.y.a(iVarI3, aVar, o0VarE, 48);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(aVar2, o0VarE);
            if (cVar != null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar5);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, zVarA, o0VarE);
            b4.c(c1623g, i2VarA0, o0VarE);
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(fVar2, rVarC, o0VarE);
            c2.b0 b0Var2 = c2.b0.f22601a;
            bVar.getClass();
            c2.j.i iVarI4 = c2.j.i(f16);
            bVar.getClass();
            h4.r rVarY2 = c2.l.y(aVar2, f15);
            zVarA2 = c2.y.a(iVarI4, aVar, o0VarE, 48);
            iHashCode2 = Long.hashCode(o0VarE.U);
            i2VarA1 = o0VarE.a0();
            rVarC2 = h4.k.c(rVarY2, o0VarE);
            if (cVar != null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar5);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, zVarA2, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
            } else {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
            }
            b4.c(fVar2, rVarC2, o0VarE);
            int i110 = i17 | 384 | (i16 & 112);
            c(d0Var, fVar, f112777a, null, o0VarE, i110);
            str = d0Var.f112651d;
            if (str == null) {
                str = "";
            }
            d6.h.f57752b.getClass();
            int i111 = d6.h.f57755e;
            j92.f fVar5 = d92.b.f58624b;
            fVar5.getClass();
            x0 x0VarB2 = d92.c.b(j92.f.f97933j, o0VarE);
            d6.p.f57793b.getClass();
            int i25 = d6.p.f57795d;
            mh.c(str, null, 0L, null, 0L, null, 0L, d6.h.a(i111), 0L, i25, false, 1, 1, null, x0VarB2, o0VarE, 0, 221568, 76798);
            str2 = d0Var.f112653f;
            if (str2 == null) {
                str2 = "";
            }
            fVar5.getClass();
            mh.c(str2, null, 0L, null, 0L, null, 0L, d6.h.a(i111), 0L, i25, false, 2, 2, null, x0.a(j92.f.f97935l, vb.h.g(o0VarE), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), o0VarE, 0, 221568, 76798);
            o0VarE.g0(true);
            bVar.getClass();
            bVar.getClass();
            bVar.getClass();
            bVar.getClass();
            o0VarE = o0VarE;
            fVar3 = fVar;
            z.f(d0Var, fVar3, true, c2.l.B(aVar2, f16, f16, f16, f15), o0VarE, i110, 0);
            o0VarE.g0(true);
            if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                o0VarE.C(-1055586213);
                s62.a.f157643a.getClass();
                u4.d dVarA2 = o1.a(t62.b.f162798a);
                String strQ3 = gl1.y.Q(o0VarE, R.string.lbl_dismiss);
                h4.r rVarC7 = uVar.c(aVar2, h4.d.a.f81526d);
                bVar.getClass();
                h4.r rVarQ2 = x2.q(c2.l.y(rVarC7, f16), f17);
                String strQ4 = gl1.y.Q(o0VarE, R.string.lbl_dismiss);
                boolean zR3 = o0VarE.r(fVar3) | o0VarE.r(context);
                if (i17 != 4) {
                    z15 = true;
                } else {
                    z15 = true;
                }
                z16 = zR3 | z15;
                objQ = o0VarE.q();
                if (z16) {
                    z17 = false;
                    objQ = new f0(fVar3, context, d0Var, 0);
                    o0VarE.K(objQ);
                } else {
                    z17 = false;
                    objQ = new f0(fVar3, context, d0Var, 0);
                    o0VarE.K(objQ);
                }
                h4.r rVarD3 = u1.w.d(rVarQ2, false, strQ4, null, (e23.a) objQ, 13);
                objQ2 = o0VarE.q();
                if (objQ2 == c2565a) {
                    objQ2 = new x(4);
                    o0VarE.K(objQ2);
                }
                i7.b(dVarA2, strQ3, p5.v.c((e23.l) objQ2, rVarD3, z17), sn.a.y(o0VarE), o0VarE, 0, 0);
                o0VarE.g0(z17);
            } else {
                o0VarE.C(-1054900059);
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g0(d0Var, fVar3, f14, rVar, i14, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x009c  */
    /* JADX WARN: Code duplicated, block: B:69:0x016d  */
    /* JADX WARN: Code duplicated, block: B:71:0x0174  */
    /* JADX WARN: Code duplicated, block: B:72:0x0178  */
    /* JADX WARN: Code duplicated, block: B:77:0x0193  */
    /* JADX WARN: Code duplicated, block: B:80:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:82:0x0223  */
    public static final void f(d0 d0Var, f fVar, float f14, h4.r rVar, p3.m mVar, int i14) {
        int i15;
        p3.c<?> cVar;
        h5.g.a.f fVar2;
        h4.r.a aVar;
        j92.e eVar;
        int i16;
        c2.z zVarA;
        int iHashCode;
        i2 i2VarA0;
        h4.r rVarC;
        String str;
        p3.o0 o0VarE = mVar.E(769386980);
        p3.c<?> cVar2 = o0VarE.f135177b;
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(d0Var) : o0VarE.r(d0Var) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(fVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.i(f14) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.B(rVar) ? 2048 : 1024;
        }
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            String str2 = d0Var.f112650c;
            int i17 = i15 & 14;
            boolean zR = (i17 == 4 || ((i15 & 8) != 0 && o0VarE.r(d0Var))) | o0VarE.r(fVar);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new j0(fVar, d0Var, null);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new j0(fVar, d0Var, null);
                    o0VarE.K(objQ);
                }
            }
            p3.l0.e((e23.p) objQ, str2, o0VarE);
            h4.d.f81522a.getClass();
            h4.g gVar = h4.d.a.f81528f;
            h4.r rVarC2 = x2.c(x2.u(rVar, f14), 1.0f);
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            h4.r rVarE = u1.n.e(l4.k.b(rVarC2, k2.i.a(j92.b.f97900c.f97910b)), ds.e0.w(o0VarE), m1.f128891a);
            z0 z0VarD = c2.q.d(gVar, false);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC3 = h4.k.c(rVarE, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
            if (cVar2 == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, z0VarD, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA1, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T) {
                cVar = cVar2;
            } else {
                cVar = cVar2;
                if (!p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                }
                fVar2 = h5.g.a.f81807d;
                b4.c(fVar2, rVarC3, o0VarE);
                c2.u uVar = c2.u.f22885a;
                aVar = h4.r.S;
                h4.r rVarC4 = uVar.c(aVar, gVar);
                bVar.getClass();
                eVar = j92.b.f97899b;
                h4.r rVarC5 = x2.c(c2.l.y(rVarC4, eVar.f97920e), 1.0f);
                c2.j.f22691a.getClass();
                i16 = i15;
                zVarA = c2.y.a(c2.j.f22698h, h4.d.a.f81537o, o0VarE, 54);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarC5, o0VarE);
                if (cVar != null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar2);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar2, zVarA, o0VarE);
                b4.c(c1623g, i2VarA0, o0VarE);
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                }
                b4.c(fVar2, rVarC, o0VarE);
                c2.b0 b0Var = c2.b0.f22601a;
                bVar.getClass();
                c2.l.f(x2.h(aVar, eVar.f97921f), o0VarE);
                str = d0Var.f112651d;
                if (str == null) {
                    str = "";
                }
                String strP = gl1.y.P(R.string.message_will_not_suggest_follow, new Object[]{str}, o0VarE);
                d6.h.f57752b.getClass();
                d6.h hVarA = d6.h.a(d6.h.f57755e);
                d92.b.f58624b.getClass();
                mh.c(strP, null, 0L, null, 0L, null, 0L, hVarA, 0L, 0, false, 0, 0, null, x0.a(j92.f.f97935l, vb.h.g(o0VarE), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), o0VarE, 0, 0, 130046);
                z.f(d0Var, fVar, true, null, o0VarE, i17 | 384 | (i16 & 112), 8);
                o0VarE.g0(true);
                o0VarE.g0(true);
            }
            v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
            fVar2 = h5.g.a.f81807d;
            b4.c(fVar2, rVarC3, o0VarE);
            c2.u uVar2 = c2.u.f22885a;
            aVar = h4.r.S;
            h4.r rVarC6 = uVar2.c(aVar, gVar);
            bVar.getClass();
            eVar = j92.b.f97899b;
            h4.r rVarC7 = x2.c(c2.l.y(rVarC6, eVar.f97920e), 1.0f);
            c2.j.f22691a.getClass();
            i16 = i15;
            zVarA = c2.y.a(c2.j.f22698h, h4.d.a.f81537o, o0VarE, 54);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(rVarC7, o0VarE);
            if (cVar != null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(eVar2, zVarA, o0VarE);
            b4.c(c1623g, i2VarA0, o0VarE);
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(fVar2, rVarC, o0VarE);
            c2.b0 b0Var2 = c2.b0.f22601a;
            bVar.getClass();
            c2.l.f(x2.h(aVar, eVar.f97921f), o0VarE);
            str = d0Var.f112651d;
            if (str == null) {
                str = "";
            }
            String strP2 = gl1.y.P(R.string.message_will_not_suggest_follow, new Object[]{str}, o0VarE);
            d6.h.f57752b.getClass();
            d6.h hVarA2 = d6.h.a(d6.h.f57755e);
            d92.b.f58624b.getClass();
            mh.c(strP2, null, 0L, null, 0L, null, 0L, hVarA2, 0L, 0, false, 0, 0, null, x0.a(j92.f.f97935l, vb.h.g(o0VarE), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), o0VarE, 0, 0, 130046);
            z.f(d0Var, fVar, true, null, o0VarE, i17 | 384 | (i16 & 112), 8);
            o0VarE.g0(true);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g0(d0Var, fVar, f14, rVar, i14, 2);
        }
    }

    public static final void g(d0 d0Var, f fVar, float f14, h4.r rVar, p3.m mVar, int i14, int i15) {
        int i16;
        d0 d0Var2;
        f fVar2;
        float f15;
        h4.r rVar2;
        d0Var.getClass();
        fVar.getClass();
        p3.o0 o0VarE = mVar.E(2006739489);
        if ((i14 & 6) == 0) {
            i16 = ((i14 & 8) == 0 ? o0VarE.B(d0Var) : o0VarE.r(d0Var) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.r(fVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= o0VarE.i(f14) ? 256 : 128;
        }
        int i17 = i15 & 8;
        if (i17 != 0) {
            i16 |= 3072;
        } else if ((i14 & 3072) == 0) {
            i16 |= o0VarE.B(rVar) ? 2048 : 1024;
        }
        if (o0VarE.n(i16 & 1, (i16 & 1171) != 1170)) {
            if (i17 != 0) {
                rVar = h4.r.S;
            }
            h4.r rVar3 = rVar;
            x1 x1Var = p3.n.f135158a;
            if (d0Var.f112649b != b0.UNDO) {
                o0VarE.C(1126521557);
                d0Var2 = d0Var;
                fVar2 = fVar;
                f15 = f14;
                e(d0Var2, fVar2, f15, rVar3, o0VarE, i16 & 8190);
                o0VarE.g0(false);
            } else {
                d0Var2 = d0Var;
                fVar2 = fVar;
                f15 = f14;
                o0VarE.C(1126698412);
                f(d0Var2, fVar2, f15, rVar3, o0VarE, i16 & 8190);
                o0VarE.g0(false);
            }
            rVar2 = rVar3;
        } else {
            d0Var2 = d0Var;
            fVar2 = fVar;
            f15 = f14;
            o0VarE.e();
            rVar2 = rVar;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b12.c(d0Var2, fVar2, f15, rVar2, i14, i15);
        }
    }

    public static final void h(d0 d0Var, float f14, e eVar, p3.m mVar, int i14) {
        int i15;
        d0Var.getClass();
        p3.o0 o0VarE = mVar.E(278576003);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(d0Var) : o0VarE.r(d0Var) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.i(f14) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(eVar) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            h4.d.f81522a.getClass();
            h4.g.a aVar = h4.d.a.f81537o;
            c2.j jVar = c2.j.f22691a;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar2 = j92.b.f97899b;
            float f15 = eVar2.f97918c;
            float f16 = eVar2.f97920e;
            float f17 = eVar2.f97918c;
            jVar.getClass();
            c2.j.i iVarI = c2.j.i(f15);
            h4.r.a aVar2 = h4.r.S;
            h4.r rVarU = x2.u(aVar2, f14);
            bVar.getClass();
            h4.r rVarY = c2.l.y(rVarU, f16);
            c2.z zVarA = c2.y.a(iVarI, aVar, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarY, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar3 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            String str = d0Var.f112651d;
            if (str == null) {
                str = "";
            }
            d6.h.f57752b.getClass();
            int i16 = d6.h.f57755e;
            d92.b.f58624b.getClass();
            x0 x0VarB = d92.c.b(j92.f.f97933j, o0VarE);
            d6.p.f57793b.getClass();
            mh.c(str, null, 0L, null, 0L, null, 0L, d6.h.a(i16), 0L, d6.p.f57795d, false, 1, 1, null, x0VarB, o0VarE, 0, 221568, 76798);
            bVar.getClass();
            bVar.getClass();
            bVar.getClass();
            bVar.getClass();
            o0VarE = o0VarE;
            z.f(d0Var, eVar, true, c2.l.B(aVar2, f17, f17, f17, f16), o0VarE, (i15 & 14) | 384 | ((i15 >> 3) & 112), 0);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new h0(d0Var, f14, eVar, i14);
        }
    }
}
