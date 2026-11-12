package b21;

import com.garmin.android.apps.connectmobile.util.GsonUtil;
import com.garmin.customermanagementlib.ui.CustomerManagementLibMainActivity;
import com.garmin.proto.generated.WifiSetup;
import java.util.List;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class d7 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lc.m0 f14612b;

    public /* synthetic */ d7(lc.m0 m0Var, int i14) {
        this.f14611a = i14;
        this.f14612b = m0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        Object dVar;
        Object dVar2;
        String str;
        int i14 = this.f14611a;
        Long l14 = null;
        Object[] objArr = 0;
        int i15 = 16;
        int i16 = 22;
        int i17 = 0;
        lc.m0 m0Var = this.f14612b;
        switch (i14) {
            case 0:
                o21.f fVar = (o21.f) obj;
                fVar.getClass();
                lc.y.l(m0Var, new l4.s(fVar.f128669a, fVar.f128670b, fVar.f128671c, fVar.f128672d));
                break;
            case 1:
                s21.z zVar = (s21.z) obj;
                zVar.getClass();
                lc.y.l(m0Var, zVar.f156223a);
                break;
            case 2:
                gv.a aVar = (gv.a) obj;
                aVar.getClass();
                m0Var.h(new c63.n(23), new ca0.d.c(aVar.name()));
                break;
            case 3:
                List list = (List) obj;
                list.getClass();
                if (list.size() > 1) {
                    m0Var.h(new ca0.k(i15), new ca0.b1.p(list));
                } else {
                    m0Var.h(new ca0.k(i15), ca0.b1.g.INSTANCE);
                }
                break;
            case 4:
                l90.k kVar = (l90.k) obj;
                kVar.getClass();
                lc.y.l(m0Var, new ca0.b1.b(kVar));
                break;
            case 5:
                zb0.l lVar = (zb0.l) obj;
                lVar.getClass();
                lc.y.l(m0Var, new ca0.b1.m(lVar.name()));
                break;
            case 6:
                l90.k kVar2 = (l90.k) obj;
                kVar2.getClass();
                m0Var.h(new ca0.k(i15), new ca0.b1.b(kVar2));
                break;
            case 7:
                l90.k kVar3 = (l90.k) obj;
                kVar3.getClass();
                m0Var.n();
                lc.y.l(m0Var, new ca0.b1.f(kVar3));
                break;
            case 8:
                l90.k kVar4 = (l90.k) obj;
                kVar4.getClass();
                String str2 = kVar4.f111581e;
                if (str2 != null) {
                    lc.y.l(m0Var, new ca0.b1.j(kVar4, str2));
                } else {
                    lc.y.l(m0Var, new ca0.b1.f(kVar4));
                }
                break;
            case 9:
                q90.c cVar = (q90.c) obj;
                cVar.getClass();
                m0Var.h(new ca0.k(i16), new ca0.n1.j(cVar));
                break;
            case 10:
                l90.b bVar = (l90.b) obj;
                bVar.getClass();
                m0Var.h(new ca0.k(i16), new ca0.n1.h(bVar));
                break;
            case 11:
                l90.b bVar2 = (l90.b) obj;
                bVar2.getClass();
                m0Var.h(new ca0.k(i16), new ca0.n1.h(bVar2));
                break;
            case 12:
                q90.c cVar2 = (q90.c) obj;
                cVar2.getClass();
                m0Var.h(new ca0.k(i16), new ca0.n1.g(cVar2));
                break;
            case 13:
                l90.b bVar3 = (l90.b) obj;
                bVar3.getClass();
                lc.y.l(m0Var, new ca0.n1.e(bVar3));
                break;
            case 14:
                l90.b bVar4 = (l90.b) obj;
                bVar4.getClass();
                m0Var.h(zf.b.g(m0Var), new ca0.b1.l(bVar4, l14, 2, (p005kotlin.jvm.internal.j) (objArr == true ? 1 : 0)));
                break;
            case 15:
                lc.p0 p0Var = (lc.p0) obj;
                p0Var.getClass();
                try {
                    try {
                        p005kotlin.jvm.internal.t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
                        m0Var.c(t0Var.b(ca0.b1.m.class));
                        p0Var.f111835h = t0Var.b(ca0.b1.m.class);
                        p0Var.f111833f = false;
                        lc.y0 y0VarI = kg.f.i(p0Var, -1);
                        y0VarI.f111914a = false;
                        Unit unit = Unit.INSTANCE;
                        p0Var.f111833f = false;
                        p0Var.f111834g = y0VarI.f111915b;
                    } catch (IllegalArgumentException unused) {
                    }
                } catch (IllegalArgumentException unused2) {
                    p005kotlin.jvm.internal.t0 t0Var2 = p005kotlin.jvm.internal.s0.f105811a;
                    m0Var.c(t0Var2.b(ca0.b1.g.class));
                    p0Var.f111835h = t0Var2.b(ca0.b1.g.class);
                    p0Var.f111833f = false;
                    lc.y0 y0VarI2 = kg.f.i(p0Var, -1);
                    y0VarI2.f111914a = false;
                    Unit unit2 = Unit.INSTANCE;
                    p0Var.f111833f = false;
                    p0Var.f111834g = y0VarI2.f111915b;
                }
                break;
            case 16:
                bd0.b0 b0Var = (bd0.b0) obj;
                b0Var.getClass();
                m0Var.h(new ca0.d2(i17), new ca0.k2.b(b0Var.name()));
                break;
            case 17:
                bd0.b0 b0Var2 = (bd0.b0) obj;
                b0Var2.getClass();
                m0Var.h(new ca0.d2(i17), new ca0.k2.b(b0Var2.name()));
                break;
            case 18:
                z90.b bVar5 = (z90.b) obj;
                bVar5.getClass();
                if (ca0.f2.a.f26220a[bVar5.ordinal()] == 1) {
                    m0Var.h(new ca0.d2(i17), ca0.k2.h.INSTANCE);
                } else {
                    m0Var.h(new ca0.d2(i17), new ca0.k2.f(bVar5.name()));
                }
                break;
            case 19:
                lc.p0 p0Var2 = (lc.p0) obj;
                p0Var2.getClass();
                try {
                    try {
                        p005kotlin.jvm.internal.t0 t0Var3 = p005kotlin.jvm.internal.s0.f105811a;
                        m0Var.c(t0Var3.b(ca0.c4.n.class));
                        p0Var2.f111835h = t0Var3.b(ca0.c4.n.class);
                        p0Var2.f111833f = false;
                        lc.y0 y0VarI3 = kg.f.i(p0Var2, -1);
                        y0VarI3.f111914a = true;
                        Unit unit3 = Unit.INSTANCE;
                        p0Var2.f111833f = true;
                        p0Var2.f111834g = y0VarI3.f111915b;
                    } catch (IllegalArgumentException unused3) {
                    }
                } catch (IllegalArgumentException unused4) {
                    p005kotlin.jvm.internal.t0 t0Var4 = p005kotlin.jvm.internal.s0.f105811a;
                    m0Var.c(t0Var4.b(ca0.c4.b.class));
                    p0Var2.f111835h = t0Var4.b(ca0.c4.b.class);
                    p0Var2.f111833f = false;
                    lc.y0 y0VarI4 = kg.f.i(p0Var2, -1);
                    y0VarI4.f111914a = true;
                    Unit unit4 = Unit.INSTANCE;
                    p0Var2.f111833f = true;
                    p0Var2.f111834g = y0VarI4.f111915b;
                }
                break;
            case 20:
                WifiSetup.ScannedAccessPoint scannedAccessPoint = (WifiSetup.ScannedAccessPoint) obj;
                scannedAccessPoint.getClass();
                if (scannedAccessPoint.getSecurityType() == WifiSetup.SecurityType.OPEN) {
                    String ssid = scannedAccessPoint.getSsid();
                    ssid.getClass();
                    dVar = new ca0.g4.c(ssid, scannedAccessPoint.getSecurityType().name(), (String) null, 4, (p005kotlin.jvm.internal.j) null);
                } else {
                    String ssid2 = scannedAccessPoint.getSsid();
                    ssid2.getClass();
                    dVar = new ca0.g4.d(ssid2, scannedAccessPoint.getSecurityType().name());
                }
                lc.y.l(m0Var, dVar);
                break;
            case 21:
                WifiSetup.ScannedAccessPoint scannedAccessPoint2 = (WifiSetup.ScannedAccessPoint) obj;
                scannedAccessPoint2.getClass();
                if (scannedAccessPoint2.getSecurityType() == WifiSetup.SecurityType.OPEN) {
                    String ssid3 = scannedAccessPoint2.getSsid();
                    ssid3.getClass();
                    dVar2 = new ca0.g4.c(ssid3, scannedAccessPoint2.getSecurityType().name(), (String) null, 4, (p005kotlin.jvm.internal.j) null);
                } else {
                    String ssid4 = scannedAccessPoint2.getSsid();
                    ssid4.getClass();
                    dVar2 = new ca0.g4.d(ssid4, scannedAccessPoint2.getSecurityType().name());
                }
                lc.y.l(m0Var, dVar2);
                break;
            case 22:
                lc.y.l(m0Var, new e62.k(((Integer) obj).intValue()));
                break;
            case 23:
                lc.p0 p0Var3 = (lc.p0) obj;
                p0Var3.getClass();
                lc.y0 y0VarI5 = kg.f.i(p0Var3, m0Var.f111904b.k().f111773b.f144346e);
                y0VarI5.f111914a = true;
                Unit unit5 = Unit.INSTANCE;
                p0Var3.f111833f = true;
                p0Var3.f111834g = y0VarI5.f111915b;
                p0Var3.f111829b = true;
                break;
            case 24:
                lc.p0 p0Var4 = (lc.p0) obj;
                p0Var4.getClass();
                lc.h0 h0VarJ = m0Var.f111904b.j();
                if (h0VarJ != null && (str = h0VarJ.f111773b.f144347f) != null) {
                    p0Var4.c(str);
                    p0Var4.b(-1);
                    lc.y0 y0Var = new lc.y0();
                    y0Var.f111914a = true;
                    Unit unit6 = Unit.INSTANCE;
                    p0Var4.f111833f = true;
                    p0Var4.f111834g = y0Var.f111915b;
                }
                p0Var4.f111829b = true;
                break;
            case 25:
                gl1.q.b(m0Var, ((Long) obj).longValue(), null);
                break;
            case 26:
                long jLongValue = ((Long) obj).longValue();
                m0Var.getClass();
                lc.y.l(m0Var, new gl1.g(jLongValue));
                break;
            case 27:
                String str3 = (String) obj;
                CustomerManagementLibMainActivity.a aVar2 = CustomerManagementLibMainActivity.f50711h;
                str3.getClass();
                lc.y.k(str3, m0Var);
                break;
            case 28:
                il0.a aVar3 = (il0.a) obj;
                aVar3.getClass();
                lc.y.k(d53.u.v("GOLF_COURSE_DETAILS?GOLF_COURSE={GOLF_COURSE}", "{GOLF_COURSE}", GsonUtil.a(aVar3), false), m0Var);
                break;
            default:
                il0.a aVar4 = (il0.a) obj;
                aVar4.getClass();
                lc.y.k(d53.u.v("GOLF_COURSE_DETAILS?GOLF_COURSE={GOLF_COURSE}", "{GOLF_COURSE}", GsonUtil.a(aVar4), false), m0Var);
                break;
        }
        return Unit.INSTANCE;
    }
}
