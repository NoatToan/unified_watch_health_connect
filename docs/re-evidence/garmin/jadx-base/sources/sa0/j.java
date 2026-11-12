package sa0;

import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.proto.generated.WifiSetup;
import cw1.v0;
import h5.e0;
import i3.i7;
import i3.mh;
import java.util.List;
import o4.m1;
import o4.r1;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import rk0.y;
import s70.j1;
import u1.w;
import v62.ia;

/* JADX INFO: loaded from: classes8.dex */
public final class j {

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements e23.a<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ WifiSetup.ScannedAccessPoint f158195a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p1<WifiSetup.ScannedAccessPoint> f158196b;

        public a(WifiSetup.ScannedAccessPoint scannedAccessPoint, p1<WifiSetup.ScannedAccessPoint> p1Var) {
            this.f158195a = scannedAccessPoint;
            this.f158196b = p1Var;
        }

        @Override // e23.a
        public final Unit invoke() {
            this.f158196b.setValue(this.f158195a);
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements e23.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f158197a = new b();

        @Override // e23.l
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f158198a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f158199b;

        public c(e23.l lVar, List list) {
            this.f158198a = lVar;
            this.f158199b = list;
        }

        @Override // e23.l
        public final Object invoke(Integer num) {
            return this.f158198a.invoke(this.f158199b.get(num.intValue()));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.r<e2.d, Integer, p3.m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f158200a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f158201b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p1 f158202c;

        public d(List list, List list2, p1 p1Var) {
            this.f158200a = list;
            this.f158201b = list2;
            this.f158202c = p1Var;
        }

        /* JADX WARN: Code duplicated, block: B:36:0x00a4  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // e23.r
        public final Unit invoke(e2.d dVar, Integer num, p3.m mVar, Integer num2) {
            int i14;
            r1 r1VarC;
            e2.d dVar2 = dVar;
            int iIntValue = num.intValue();
            p3.m mVar2 = mVar;
            int iIntValue2 = num2.intValue();
            if ((iIntValue2 & 6) == 0) {
                i14 = (mVar2.B(dVar2) ? 4 : 2) | iIntValue2;
            } else {
                i14 = iIntValue2;
            }
            if ((iIntValue2 & 48) == 0) {
                i14 |= mVar2.k(iIntValue) ? 32 : 16;
            }
            if (mVar2.n(i14 & 1, (i14 & 147) != 146)) {
                x1 x1Var = p3.n.f135158a;
                WifiSetup.ScannedAccessPoint scannedAccessPoint = (WifiSetup.ScannedAccessPoint) this.f158200a.get(iIntValue);
                mVar2.C(-1485569957);
                List list = this.f158201b;
                if (p005kotlin.jvm.internal.s.g(scannedAccessPoint, list != null ? (WifiSetup.ScannedAccessPoint) h0.b0(list) : null)) {
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    float f14 = j92.b.f97899b.f97918c;
                    r1VarC = k2.i.c(f14, f14, 0.0f, 0.0f, 12);
                } else {
                    r1VarC = m1.f128891a;
                }
                r1 r1Var = r1VarC;
                String ssid = scannedAccessPoint.getSsid();
                ssid.getClass();
                p1 p1Var = this.f158202c;
                boolean zG = p005kotlin.jvm.internal.s.g((WifiSetup.ScannedAccessPoint) p1Var.getF182175a(), scannedAccessPoint);
                boolean zR = mVar2.r(scannedAccessPoint);
                Object objQ = mVar2.q();
                if (zR) {
                    objQ = new a(scannedAccessPoint, p1Var);
                    mVar2.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new a(scannedAccessPoint, p1Var);
                        mVar2.K(objQ);
                    }
                }
                j.a(ssid, r1Var, false, zG, (e23.a) objQ, mVar2, 0, 4);
                mVar2.f();
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0046  */
    /* JADX WARN: Code duplicated, block: B:24:0x004b  */
    /* JADX WARN: Code duplicated, block: B:26:0x0053  */
    /* JADX WARN: Code duplicated, block: B:27:0x0056  */
    /* JADX WARN: Code duplicated, block: B:31:0x0061  */
    /* JADX WARN: Code duplicated, block: B:32:0x0063  */
    /* JADX WARN: Code duplicated, block: B:35:0x006d  */
    /* JADX WARN: Code duplicated, block: B:36:0x006f  */
    /* JADX WARN: Code duplicated, block: B:39:0x0078 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x007a  */
    /* JADX WARN: Code duplicated, block: B:42:0x007d  */
    /* JADX WARN: Code duplicated, block: B:43:0x007f  */
    /* JADX WARN: Code duplicated, block: B:46:0x0084  */
    /* JADX WARN: Code duplicated, block: B:47:0x009f  */
    /* JADX WARN: Code duplicated, block: B:50:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:51:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:56:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:59:0x012d  */
    /* JADX WARN: Code duplicated, block: B:61:0x0134  */
    /* JADX WARN: Code duplicated, block: B:62:0x0138  */
    /* JADX WARN: Code duplicated, block: B:67:0x0159  */
    /* JADX WARN: Code duplicated, block: B:70:0x0165  */
    /* JADX WARN: Code duplicated, block: B:71:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:74:0x0216  */
    /* JADX WARN: Code duplicated, block: B:75:0x0226  */
    /* JADX WARN: Code duplicated, block: B:77:0x0237  */
    /* JADX WARN: Code duplicated, block: B:79:0x023c  */
    /* JADX WARN: Code duplicated, block: B:82:0x0247  */
    /* JADX WARN: Code duplicated, block: B:84:? A[RETURN, SYNTHETIC] */
    public static final void a(String str, r1 r1Var, boolean z14, boolean z15, e23.a<Unit> aVar, p3.m mVar, int i14, int i15) {
        boolean z16;
        int i16;
        boolean z17;
        int i17;
        int i18;
        int i19;
        int i24;
        boolean z18;
        boolean z19;
        boolean z24;
        p2 p2VarI0;
        boolean z25;
        long jB;
        h4.r.a aVar2;
        boolean z26;
        Object objQ;
        j92.b bVar;
        j92.e eVar;
        s2 s2VarA;
        int iHashCode;
        i2 i2VarA0;
        h4.r rVarC;
        e0.a aVar3;
        h5.g.a.b bVar2;
        h4.r.a aVar4;
        boolean z27;
        boolean z28;
        boolean z29;
        o0 o0VarE = mVar.E(-1206401435);
        int i25 = (o0VarE.B(str) ? 4 : 2) | i14 | (o0VarE.B(r1Var) ? 32 : 16);
        int i26 = i15 & 4;
        if (i26 == 0) {
            if ((i14 & 384) == 0) {
                z16 = z14;
                i25 |= o0VarE.h(z16) ? 256 : 128;
            }
            i16 = i15 & 8;
            if (i16 != 0) {
                i18 = i25 | 3072;
                z17 = z15;
            } else {
                z17 = z15;
                if (o0VarE.h(z17)) {
                    i17 = 2048;
                } else {
                    i17 = 1024;
                }
                i18 = i25 | i17;
            }
            if (o0VarE.r(aVar)) {
                i19 = 16384;
            } else {
                i19 = 8192;
            }
            i24 = i18 | i19;
            if ((i24 & 9363) != 9362) {
                z18 = true;
            } else {
                z18 = false;
            }
            if (o0VarE.n(i24 & 1, z18)) {
                if (i26 != 0) {
                    z16 = true;
                }
                if (i16 != 0) {
                    z25 = false;
                } else {
                    z25 = z17;
                }
                x1 x1Var = p3.n.f135158a;
                if (z25) {
                    o0VarE.C(289397613);
                    d92.b.f58623a.getClass();
                    jB = d92.b.a(o0VarE).c().g();
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(289398797);
                    jB = com.nimbusds.jose.shaded.gson.internal.a.b(d92.b.f58623a, o0VarE, false);
                }
                aVar2 = h4.r.S;
                h4.r rVarE = u1.n.e(x2.f(aVar2, 1.0f), jB, r1Var);
                if ((57344 & i24) == 16384) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                objQ = o0VarE.q();
                if (z26) {
                    objQ = new y(aVar, 22);
                    o0VarE.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new y(aVar, 22);
                        o0VarE.K(objQ);
                    }
                }
                h4.r rVarD = w.d(rVarE, false, null, null, (e23.a) objQ, 15);
                d92.b.f58623a.getClass();
                bVar = d92.b.f58625c;
                bVar.getClass();
                eVar = j92.b.f97899b;
                h4.r rVarY = c2.l.y(rVarD, eVar.f97920e);
                h4.d.f81522a.getClass();
                h4.g.b bVar3 = h4.d.a.f81534l;
                c2.j.f22691a.getClass();
                s2VarA = q2.a(c2.j.f22692b, bVar3, o0VarE, 48);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarY, o0VarE);
                h5.g.V.getClass();
                aVar3 = h5.g.a.f81805b;
                if (o0VarE.f135177b != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar3);
                } else {
                    o0VarE.c();
                }
                b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                bVar2 = h5.g.a.f81813j;
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                u2 u2Var = u2.f22900a;
                if (z16) {
                    o0VarE.C(-1394129330);
                    s62.a.f157643a.getClass();
                    u4.d dVarA = ia.a(t62.b.f162798a);
                    long jB2 = d92.b.a(o0VarE).f().b();
                    bVar.getClass();
                    aVar4 = aVar2;
                    h4.r rVarC2 = c2.l.C(aVar4, 0.0f, 0.0f, eVar.f97920e, 0.0f, 11);
                    bVar.getClass();
                    z27 = false;
                    i7.b(dVarA, null, x2.q(rVarC2, j92.b.f97901d.f97905d), jB2, o0VarE, 48, 0);
                    o0VarE.g0(false);
                } else {
                    aVar4 = aVar2;
                    z27 = false;
                    o0VarE.C(-1393824383);
                    o0VarE.g0(false);
                }
                d92.b.f58624b.getClass();
                z28 = z27;
                z29 = z25;
                boolean z34 = z16;
                mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, o0VarE), o0VarE, i24 & 14, 0, 131070);
                o0VarE = o0VarE;
                c2.l.f(u2Var.a(aVar4, 1.0f, true), o0VarE);
                if (z29) {
                    o0VarE.C(-1393649605);
                    da0.y.a(null, 0.0f, o0VarE, z28 ? 1 : 0, 3);
                    o0VarE.g0(z28);
                } else {
                    o0VarE.C(-1393613087);
                    o0VarE.g0(z28);
                }
                o0VarE.g0(true);
                z24 = z29;
                z19 = z34;
            } else {
                o0VarE.e();
                z19 = z16;
                z24 = z17;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new v0(str, r1Var, z19, z24, aVar, i14, i15, 7);
            }
        }
        i25 |= 384;
        z16 = z14;
        i16 = i15 & 8;
        if (i16 != 0) {
            i18 = i25 | 3072;
            z17 = z15;
        } else {
            z17 = z15;
            if (o0VarE.h(z17)) {
                i17 = 2048;
            } else {
                i17 = 1024;
            }
            i18 = i25 | i17;
        }
        if (o0VarE.r(aVar)) {
            i19 = 16384;
        } else {
            i19 = 8192;
        }
        i24 = i18 | i19;
        if ((i24 & 9363) != 9362) {
            z18 = true;
        } else {
            z18 = false;
        }
        if (o0VarE.n(i24 & 1, z18)) {
            if (i26 != 0) {
                z16 = true;
            }
            if (i16 != 0) {
                z25 = false;
            } else {
                z25 = z17;
            }
            x1 x1Var2 = p3.n.f135158a;
            if (z25) {
                o0VarE.C(289397613);
                d92.b.f58623a.getClass();
                jB = d92.b.a(o0VarE).c().g();
                o0VarE.g0(false);
            } else {
                o0VarE.C(289398797);
                jB = com.nimbusds.jose.shaded.gson.internal.a.b(d92.b.f58623a, o0VarE, false);
            }
            aVar2 = h4.r.S;
            h4.r rVarE2 = u1.n.e(x2.f(aVar2, 1.0f), jB, r1Var);
            if ((57344 & i24) == 16384) {
                z26 = true;
            } else {
                z26 = false;
            }
            objQ = o0VarE.q();
            if (z26) {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new y(aVar, 22);
                    o0VarE.K(objQ);
                }
            } else {
                objQ = new y(aVar, 22);
                o0VarE.K(objQ);
            }
            h4.r rVarD2 = w.d(rVarE2, false, null, null, (e23.a) objQ, 15);
            d92.b.f58623a.getClass();
            bVar = d92.b.f58625c;
            bVar.getClass();
            eVar = j92.b.f97899b;
            h4.r rVarY2 = c2.l.y(rVarD2, eVar.f97920e);
            h4.d.f81522a.getClass();
            h4.g.b bVar4 = h4.d.a.f81534l;
            c2.j.f22691a.getClass();
            s2VarA = q2.a(c2.j.f22692b, bVar4, o0VarE, 48);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(rVarY2, o0VarE);
            h5.g.V.getClass();
            aVar3 = h5.g.a.f81805b;
            if (o0VarE.f135177b != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            bVar2 = h5.g.a.f81813j;
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u2 u2Var2 = u2.f22900a;
            if (z16) {
                o0VarE.C(-1394129330);
                s62.a.f157643a.getClass();
                u4.d dVarA2 = ia.a(t62.b.f162798a);
                long jB3 = d92.b.a(o0VarE).f().b();
                bVar.getClass();
                aVar4 = aVar2;
                h4.r rVarC3 = c2.l.C(aVar4, 0.0f, 0.0f, eVar.f97920e, 0.0f, 11);
                bVar.getClass();
                z27 = false;
                i7.b(dVarA2, null, x2.q(rVarC3, j92.b.f97901d.f97905d), jB3, o0VarE, 48, 0);
                o0VarE.g0(false);
            } else {
                aVar4 = aVar2;
                z27 = false;
                o0VarE.C(-1393824383);
                o0VarE.g0(false);
            }
            d92.b.f58624b.getClass();
            z28 = z27;
            z29 = z25;
            boolean z35 = z16;
            mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, o0VarE), o0VarE, i24 & 14, 0, 131070);
            o0VarE = o0VarE;
            c2.l.f(u2Var2.a(aVar4, 1.0f, true), o0VarE);
            if (z29) {
                o0VarE.C(-1393649605);
                da0.y.a(null, 0.0f, o0VarE, z28 ? 1 : 0, 3);
                o0VarE.g0(z28);
            } else {
                o0VarE.C(-1393613087);
                o0VarE.g0(z28);
            }
            o0VarE.g0(true);
            z24 = z29;
            z19 = z35;
        } else {
            o0VarE.e();
            z19 = z16;
            z24 = z17;
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new v0(str, r1Var, z19, z24, aVar, i14, i15, 7);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(List<WifiSetup.ScannedAccessPoint> list, e23.a<Unit> aVar, e23.l<? super WifiSetup.ScannedAccessPoint, Unit> lVar, e23.a<Unit> aVar2, p3.m mVar, int i14) {
        o0 o0Var;
        String strJ;
        String strJ2;
        o0 o0VarE = mVar.E(1238187510);
        int i15 = i14 | (o0VarE.r(list) ? 4 : 2) | (o0VarE.r(aVar) ? 32 : 16) | (o0VarE.r(lVar) ? 256 : 128) | (o0VarE.r(aVar2) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            boolean z14 = list == null || list.isEmpty();
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            e23.a aVar3 = null;
            if (objQ == c2565a) {
                objQ = p0.n(null);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            String strQ = gl1.y.Q(o0VarE, R.string.wifi_choose_a_network);
            s62.a.f157643a.getClass();
            u4.d dVarA = ia.a(t62.b.f162798a);
            if (z14) {
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 192275460, R.string.lbl_network_not_found, o0VarE, false);
            } else {
                o0VarE.C(1665622247);
                o0VarE.g0(false);
                strJ = null;
            }
            if (((WifiSetup.ScannedAccessPoint) p1Var.getF182175a()) == null) {
                o0VarE.C(1665670018);
                o0VarE.g0(false);
                strJ2 = null;
            } else {
                strJ2 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 1665670019, R.string.lbl_next, o0VarE, false);
            }
            WifiSetup.ScannedAccessPoint scannedAccessPoint = (WifiSetup.ScannedAccessPoint) p1Var.getF182175a();
            if (scannedAccessPoint == null) {
                o0VarE.C(1665754741);
            } else {
                o0VarE.C(1665754742);
                boolean zR = ((i15 & 896) == 256) | o0VarE.r(scannedAccessPoint);
                Object objQ2 = o0VarE.q();
                if (zR || objQ2 == c2565a) {
                    objQ2 = new j1(3, lVar, scannedAccessPoint);
                    o0VarE.K(objQ2);
                }
                aVar3 = (e23.a) objQ2;
            }
            o0VarE.g0(false);
            o0Var = o0VarE;
            da0.p.b("wifi_selection_screen", strQ, dVarA, strJ, null, strJ2, aVar3, false, null, null, false, null, null, false, false, aVar2, null, null, null, null, null, z3.f.c(1458485494, new h21.m(list, z14, aVar, p1Var, 14), o0VarE), o0Var, 6, (i15 << 6) & 458752, 384, 4161424);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new i(list, aVar, lVar, aVar2, i14, 1);
        }
    }

    public static final void c(List<WifiSetup.ScannedAccessPoint> list, e23.a<Unit> aVar, e23.l<? super WifiSetup.ScannedAccessPoint, Unit> lVar, e23.a<Unit> aVar2, p3.m mVar, int i14) {
        aVar.getClass();
        lVar.getClass();
        aVar2.getClass();
        o0 o0VarE = mVar.E(-1823772029);
        int i15 = i14 | (o0VarE.r(list) ? 4 : 2) | (o0VarE.r(aVar) ? 32 : 16) | (o0VarE.r(lVar) ? 256 : 128) | (o0VarE.r(aVar2) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            b(list, aVar, lVar, aVar2, o0VarE, i15 & 8190);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new i(list, aVar, lVar, aVar2, i14, 0);
        }
    }
}
