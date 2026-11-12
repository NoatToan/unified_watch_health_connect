package lq1;

import am.b2;
import am.d2;
import am.m;
import am.x1;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import aq.f3;
import aq.h3;
import aq.j3;
import aq.u2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.feature.garminpay.providers.preload.ui.PreloadTransitManageCardActivity;
import com.garmin.feature.garminpay.ui.devicesettings.DeviceSettingsActivity;
import com.garmin.feature.garminpay.ui.devicesettings.LostWatchActivity;
import com.google.common.base.Optional;
import d53.u;
import e23.l;
import hq2.q;
import i3.e5;
import i3.pc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kr.f;
import lp1.d;
import mr.g0;
import o13.p;
import o4.c0;
import o70.i;
import o70.o;
import o70.t;
import org.joda.time.DateTime;
import org.joda.time.DateTimeComparator;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Kind;
import org.koin.core.definition.KoinDefinition;
import org.koin.core.module.Module;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.registry.ScopeRegistry;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import p13.h0;
import p13.j0;
import p5.k0;
import pc0.j;
import q03.g;
import qr.o6;
import r70.r;
import r70.s;
import yq1.e;
import yr0.k;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f114332a;

    public /* synthetic */ a(int i14) {
        this.f114332a = i14;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00bd  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v77, types: [T, yr0.k$a] */
    /* JADX WARN: Type inference failed for: r0v80, types: [T, yr0.k$a] */
    /* JADX WARN: Type inference failed for: r5v152, types: [T, yr0.k$a] */
    /* JADX WARN: Type inference failed for: r5v160, types: [T, yr0.k$a] */
    /* JADX WARN: Type inference failed for: r6v23, types: [T, yr0.k$a] */
    /* JADX WARN: Type inference failed for: r6v27, types: [T, yr0.k$a] */
    /* JADX WARN: Type inference failed for: r9v10, types: [T, yr0.k$a] */
    /* JADX WARN: Type inference failed for: r9v21, types: [T, yr0.k$a] */
    @Override // e23.l
    public final Object invoke(Object obj) {
        String str;
        int i14 = 8;
        int i15 = 2;
        int i16 = 0;
        zIsAfter = false;
        boolean zIsAfter = false;
        int i17 = 1;
        switch (this.f114332a) {
            case 0:
                Module module = (Module) obj;
                b bVar = b.f114333a;
                module.getClass();
                StringQualifier stringQualifierNamed = QualifierKt.named(o.STEPS.a());
                d dVar = new d(i15);
                ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
                Kind kind = Kind.Factory;
                j0 j0Var = j0.f134944a;
                t0 t0Var = s0.f105811a;
                new KoinDefinition(module, e5.n(new BeanDefinition(rootScopeQualifier, t0Var.b(s.class), stringQualifierNamed, dVar, kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(r.class), stringQualifierNamed, new d(3), kind, j0Var), module));
                StringQualifier stringQualifierNamed2 = QualifierKt.named(t.H0.a());
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(s.class), stringQualifierNamed2, new d(4), kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(r.class), stringQualifierNamed2, new d(5), kind, j0Var), module));
                StringQualifier stringQualifierNamed3 = QualifierKt.named(i.f130002j.a());
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(s.class), stringQualifierNamed3, new d(6), kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(r.class), stringQualifierNamed3, new d(7), kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(e.class), null, new d(i14), kind, j0Var), module));
                return Unit.INSTANCE;
            case 1:
                Module module2 = (Module) obj;
                c cVar = c.f114335a;
                module2.getClass();
                d dVar2 = new d(9);
                ScopeRegistry.Companion companion2 = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier2 = companion2.getRootScopeQualifier();
                Kind kind2 = Kind.Factory;
                j0 j0Var2 = j0.f134944a;
                t0 t0Var2 = s0.f105811a;
                new KoinDefinition(module2, e5.n(new BeanDefinition(rootScopeQualifier2, t0Var2.b(iq1.a.class), null, dVar2, kind2, j0Var2), module2));
                new KoinDefinition(module2, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(kq1.a.class), null, new d(10), kind2, j0Var2), module2));
                new KoinDefinition(module2, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(hq1.a.class), null, new d(11), kind2, j0Var2), module2));
                return Unit.INSTANCE;
            case 2:
                PreloadTransitManageCardActivity.a aVar = PreloadTransitManageCardActivity.f51737l;
                return Unit.INSTANCE;
            case 3:
                PreloadTransitManageCardActivity.f51738m.error("Failed to update transaction records. ", (Throwable) obj);
                return Unit.INSTANCE;
            case 4:
                PreloadTransitManageCardActivity.f51738m.error("Failed to fetch transaction resource from cdn", (Throwable) obj);
                return Unit.INSTANCE;
            case 5:
                PreloadTransitManageCardActivity.f51738m.error("Failed to map card details to transaction resource", (Throwable) obj);
                return Unit.INSTANCE;
            case 6:
                Optional optional = (Optional) obj;
                int i18 = lq2.e.f114359e;
                optional.getClass();
                return Boolean.valueOf(!optional.isPresent());
            case 7:
                List list = (List) obj;
                int i19 = lq2.e.f114359e;
                list.getClass();
                fs2.a aVar2 = (fs2.a) h0.d0(list);
                q qVar = aVar2 != null ? (q) fs2.a.f(aVar2, q.class) : null;
                if (aVar2 == null || qVar == null) {
                    int i24 = g.f142048a;
                    return a13.b.f414b;
                }
                p pVar = new p(aVar2, qVar);
                int i25 = g.f142048a;
                int i26 = w03.b.f181178a;
                return new a13.e(pVar);
            case 8:
                Optional optional2 = (Optional) obj;
                int i27 = lq2.e.f114359e;
                optional2.getClass();
                return Boolean.valueOf(optional2.isPresent());
            case 9:
                Optional optional3 = (Optional) obj;
                int i28 = lq2.e.f114359e;
                optional3.getClass();
                return (jq2.c) optional3.get();
            case 10:
                Module module3 = (Module) obj;
                lr.b bVar2 = lr.b.f114367a;
                module3.getClass();
                lr.a aVar3 = new lr.a(i15);
                ScopeRegistry.Companion companion3 = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier3 = companion3.getRootScopeQualifier();
                Kind kind3 = Kind.Factory;
                j0 j0Var3 = j0.f134944a;
                t0 t0Var3 = s0.f105811a;
                new KoinDefinition(module3, e5.n(new BeanDefinition(rootScopeQualifier3, t0Var3.b(b2.class), null, aVar3, kind3, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(ko1.a.class), null, new d(15), kind3, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(ac0.c.class), null, new d(26), kind3, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(f3.class), null, new lr.a(i14), kind3, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(zf0.b.class), null, new lr.a(16), kind3, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(vo1.a.class), null, new lr.a(17), kind3, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(cw.r.class), null, new lr.a(18), kind3, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(ir.a.class), null, new lr.a(19), kind3, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(ir.b.class), null, new lr.a(20), kind3, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(d2.class), null, new lr.a(21), kind3, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(kr.a.class), null, new lr.a(13), kind3, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(kr.g.class), null, new lr.a(22), kind3, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(sr.b.class), null, new lr.a(23), kind3, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(f.class), null, new lr.a(24), kind3, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(qr.a.class), null, new lr.a(25), kind3, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(f12.l.class), null, new lr.a(26), kind3, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(qd2.a.class), null, new lr.a(27), kind3, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(iz0.a.class), null, new d(12), kind3, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(rd2.f.class), null, new d(13), kind3, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(am.b.class), null, new d(14), kind3, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(DateTimeComparator.class), null, new d(16), kind3, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(ht.a.class), null, new d(17), kind3, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(m.class), null, new d(18), kind3, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(fo1.f.class), null, new d(19), kind3, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(j.class), null, new d(20), kind3, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(kr.e.class), null, new d(21), kind3, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(h3.class), null, new d(22), kind3, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(zf0.d.class), null, new d(23), kind3, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(x1.class), null, new d(24), kind3, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(vo1.c.class), null, new d(25), kind3, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(d60.b.class), null, new d(27), kind3, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(a22.i.class), null, new d(28), kind3, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(cw.s.class), null, new d(29), kind3, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(or.b.class), null, new lr.a(i16), kind3, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(g0.class), null, new lr.a(i17), kind3, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(ir.e.class), null, new lr.a(3), kind3, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(mr.q.class), null, new lr.a(4), kind3, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(qr.t.class), null, new lr.a(5), kind3, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(vr.c.class), null, new lr.a(6), kind3, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(u2.class), null, new lr.a(7), kind3, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(com.garmin.android.apps.connectmobile.activities.advancedactivityediting.d.class), null, new lr.a(9), kind3, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(j3.class), null, new lr.a(10), kind3, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(aq.i.class), null, new lr.a(11), kind3, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(o6.class), null, new lr.a(12), kind3, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(aq.x1.class), null, new lr.a(14), kind3, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(ep.o.class), null, new lr.a(15), kind3, j0Var3), module3));
                return Unit.INSTANCE;
            case 11:
                DeviceSettingsActivity.f51994x.error("Something went wrong when processing device settings item click event (" + ((Throwable) obj) + ")");
                return Unit.INSTANCE;
            case 12:
                LostWatchActivity.f52016k.error("Something went wrong when processing lost watch item click event (" + ((Throwable) obj) + ")");
                return Unit.INSTANCE;
            case 13:
                ls0.o oVar = (ls0.o) obj;
                int i29 = ls0.p.f114742b;
                oVar.getClass();
                yr0.i iVar = oVar.f114739a;
                List<yr0.o> list2 = oVar.f114741c;
                if (list2.isEmpty()) {
                    return null;
                }
                for (yr0.o oVar2 : list2) {
                    ns0.c.f127813a.getClass();
                    oVar2.getClass();
                    DateTime dateTimeD = iVar.d();
                    DateTime dateTimeB = iVar.b();
                    ns0.b.f127812a.getClass();
                    p pVarL = ns0.b.l(oVar2);
                    DateTime dateTime = pVarL != null ? (DateTime) pVarL.f128594a : null;
                    DateTime dateTime2 = pVarL != null ? (DateTime) pVarL.f128595b : null;
                    if (dateTimeD != null && dateTimeB != null && dateTime != null && dateTime2 != null && (dateTimeD.isBefore(dateTime) || dateTimeD.isEqual(dateTime))) {
                        if (dateTimeB.isAfter(dateTime2) || dateTimeD.isEqual(dateTime2)) {
                            k.a aVarA = ls0.p.a(R.string.msg_validation_date_conflicts_another_trip);
                            return new k(aVarA, aVarA);
                        }
                    }
                }
                return null;
            case 14:
                ls0.o oVar3 = (ls0.o) obj;
                int i30 = ls0.p.f114742b;
                oVar3.getClass();
                yr0.i iVar2 = oVar3.f114739a;
                yr0.i iVar3 = oVar3.f114740b;
                if (iVar3 == null) {
                    return null;
                }
                p pVar2 = new p(iVar3, iVar2);
                List<yr0.o> list3 = oVar3.f114741c;
                if (list3.isEmpty()) {
                    return null;
                }
                for (yr0.o oVar4 : list3) {
                    ns0.c.f127813a.getClass();
                    oVar4.getClass();
                    DateTime dateTimeD2 = ((yr0.i) pVar2.f128594a).d();
                    DateTime dateTimeB2 = ((yr0.i) pVar2.f128595b).b();
                    ns0.b.f127812a.getClass();
                    p pVarL2 = ns0.b.l(oVar4);
                    DateTime dateTime3 = pVarL2 != null ? (DateTime) pVarL2.f128594a : null;
                    DateTime dateTime4 = pVarL2 != null ? (DateTime) pVarL2.f128595b : null;
                    if (dateTimeD2 != null && dateTimeB2 != null && dateTime3 != null && dateTime4 != null && (dateTimeD2.isBefore(dateTime3) || dateTimeD2.isEqual(dateTime3))) {
                        if (dateTimeB2.isAfter(dateTime4) || dateTimeB2.isEqual(dateTime4)) {
                            k.a aVarA2 = ls0.p.a(R.string.msg_validation_date_conflicts_another_trip);
                            return new k(aVarA2, aVarA2);
                        }
                    }
                }
                return null;
            case 15:
                ls0.o oVar5 = (ls0.o) obj;
                int i34 = ls0.p.f114742b;
                oVar5.getClass();
                yr0.i iVar4 = oVar5.f114739a;
                r0 r0Var = new r0();
                r0 r0Var2 = new r0();
                Iterator<yr0.o> it = oVar5.f114741c.iterator();
                while (it.hasNext() && (r0Var.f105810a == 0 || r0Var2.f105810a == 0)) {
                    yr0.o next = it.next();
                    ns0.c.f127813a.getClass();
                    next.getClass();
                    String str2 = next.f199039d;
                    LocalDate localDate = iVar4.f198997e;
                    LocalDate localDateD = next.d();
                    LocalDate localDateW = g22.k.w(str2, "yyyy-MM-dd");
                    if (localDate != null && localDate.isAfter(localDateD) && localDate.isBefore(localDateW)) {
                        r0Var.f105810a = ls0.p.a(R.string.msg_validation_date_conflicts_another_trip);
                    } else {
                        DateTime dateTimeD3 = iVar4.d();
                        ns0.b.f127812a.getClass();
                        p pVarL3 = ns0.b.l(next);
                        DateTime dateTime5 = pVarL3 != null ? (DateTime) pVarL3.f128594a : null;
                        DateTime dateTime6 = pVarL3 != null ? (DateTime) pVarL3.f128595b : null;
                        if (dateTimeD3 != null && dateTime5 != null && dateTime6 != null && ((dateTimeD3.isAfter(dateTime5) || dateTimeD3.isEqual(dateTime5)) && (dateTimeD3.isBefore(dateTime6) || dateTimeD3.isEqual(dateTime6)))) {
                            r0Var.f105810a = ls0.p.b(R.string.msg_validation_time_conflicts_another_trip);
                        }
                    }
                    LocalDate localDate2 = iVar4.f199001i;
                    LocalDate localDateD2 = next.d();
                    LocalDate localDateW2 = g22.k.w(str2, "yyyy-MM-dd");
                    if (localDate2 != null && localDate2.isAfter(localDateD2) && localDate2.isBefore(localDateW2)) {
                        r0Var2.f105810a = ls0.p.a(R.string.msg_validation_date_conflicts_another_trip);
                    } else {
                        DateTime dateTimeB3 = iVar4.b();
                        ns0.b.f127812a.getClass();
                        p pVarL4 = ns0.b.l(next);
                        DateTime dateTime7 = pVarL4 != null ? (DateTime) pVarL4.f128594a : null;
                        DateTime dateTime8 = pVarL4 != null ? (DateTime) pVarL4.f128595b : null;
                        if (dateTimeB3 != null && dateTime7 != null && dateTime8 != null && (dateTimeB3.isAfter(dateTime7) || dateTimeB3.isEqual(dateTime7))) {
                            if (dateTimeB3.isBefore(dateTime8) || dateTimeB3.isEqual(dateTime8)) {
                                r0Var2.f105810a = ls0.p.b(R.string.msg_validation_time_conflicts_another_trip);
                            }
                        }
                    }
                }
                T t7 = r0Var.f105810a;
                if (t7 == 0 && r0Var2.f105810a == 0) {
                    return null;
                }
                return new k((k.a) t7, (k.a) r0Var2.f105810a);
            case 16:
                ls0.o oVar6 = (ls0.o) obj;
                int i35 = ls0.p.f114742b;
                oVar6.getClass();
                yr0.i iVar5 = oVar6.f114739a;
                r0 r0Var3 = new r0();
                r0 r0Var4 = new r0();
                yr0.i iVar6 = oVar6.f114740b;
                if (iVar6 != null) {
                    ns0.c.f127813a.getClass();
                    LocalDate localDate3 = iVar5.f198997e;
                    LocalDate localDate4 = iVar6.f199001i;
                    if ((localDate3 == null || localDate4 == null) ? false : localDate3.isBefore(localDate4)) {
                        r0Var3.f105810a = ls0.p.a(R.string.msg_validation_date_conflicts_previous_destination);
                    } else {
                        DateTime dateTimeD4 = iVar5.d();
                        DateTime dateTimeB4 = iVar6.b();
                        if (((dateTimeD4 == null || dateTimeB4 == null || (!dateTimeD4.isBefore(dateTimeB4) && !dateTimeD4.isEqual(dateTimeB4))) ? false : true) != false) {
                            r0Var3.f105810a = ls0.p.b(R.string.msg_validation_time_conflicts_previous_destination);
                        }
                    }
                    LocalDate localDate5 = iVar5.f199001i;
                    LocalDate localDate6 = iVar6.f199001i;
                    if ((localDate5 == null || localDate6 == null) ? false : localDate5.isBefore(localDate6)) {
                        r0Var4.f105810a = ls0.p.a(R.string.msg_validation_date_conflicts_previous_destination);
                    } else {
                        DateTime dateTimeB5 = iVar5.b();
                        DateTime dateTimeB6 = iVar6.b();
                        if (((dateTimeB5 == null || dateTimeB6 == null || (!dateTimeB5.isBefore(dateTimeB6) && !dateTimeB5.isEqual(dateTimeB6))) ? false : true) != false) {
                            r0Var4.f105810a = ls0.p.b(R.string.msg_validation_time_conflicts_previous_destination);
                        }
                    }
                }
                T t14 = r0Var3.f105810a;
                if (((t14 == 0 && r0Var4.f105810a == 0) ? 0 : 1) != 0) {
                    return new k((k.a) t14, (k.a) r0Var4.f105810a);
                }
                return null;
            case 17:
                ls0.o oVar7 = (ls0.o) obj;
                int i36 = ls0.p.f114742b;
                oVar7.getClass();
                ns0.c cVar2 = ns0.c.f127813a;
                yr0.i iVar7 = oVar7.f114739a;
                cVar2.getClass();
                LocalDate localDate7 = iVar7.f198997e;
                LocalDate localDate8 = iVar7.f199001i;
                if (localDate7 != null && localDate8 != null) {
                    zIsAfter = localDate7.isAfter(localDate8);
                }
                if (zIsAfter) {
                    return new k(null, ls0.p.a(R.string.msg_validation_arrival_date_earlier_than_departure_date), 1, null);
                }
                return null;
            case 18:
                ls0.o oVar8 = (ls0.o) obj;
                int i37 = ls0.p.f114742b;
                oVar8.getClass();
                ns0.c cVar3 = ns0.c.f127813a;
                yr0.i iVar8 = oVar8.f114739a;
                cVar3.getClass();
                DateTime dateTimeD5 = iVar8.d();
                DateTime dateTimeB7 = iVar8.b();
                if (dateTimeD5 == null || dateTimeB7 == null) {
                    return null;
                }
                if (dateTimeD5.isAfter(dateTimeB7) || dateTimeD5.isEqual(dateTimeB7)) {
                    return new k(null, ls0.p.b(R.string.msg_validation_arrival_time_earlier_than_departure_time), 1, null);
                }
                return null;
            case 19:
                ls0.o oVar9 = (ls0.o) obj;
                int i38 = ls0.p.f114742b;
                oVar9.getClass();
                ns0.b bVar3 = ns0.b.f127812a;
                yr0.i iVar9 = oVar9.f114739a;
                bVar3.getClass();
                String str3 = iVar9.f198996d;
                DateTimeZone dateTimeZoneForID = str3 != null ? DateTimeZone.forID(str3) : null;
                String str4 = iVar9.f199000h;
                DateTimeZone dateTimeZoneForID2 = str4 != null ? DateTimeZone.forID(str4) : null;
                Integer numValueOf = (dateTimeZoneForID == null || dateTimeZoneForID2 == null) ? null : Integer.valueOf(dateTimeZoneForID2.getStandardOffset(0L) - dateTimeZoneForID.getStandardOffset(0L));
                if (numValueOf == null || Math.abs(numValueOf.intValue()) >= 3600000) {
                    return null;
                }
                return new k(null, new k.a(true, false, false, R.string.msg_validation_cities_same_time_zone, 6, null), 1, null);
            case 20:
                oi0.b bVar4 = (oi0.b) obj;
                lt1.j jVar = lt1.j.f114865a;
                bVar4.getClass();
                bVar4.s();
                bVar4.B();
                return Unit.INSTANCE;
            case 21:
                oi0.b bVar5 = (oi0.b) obj;
                lt1.j jVar2 = lt1.j.f114865a;
                bVar5.getClass();
                String str5 = bVar5.f132238b;
                l22.b bVar6 = bVar5.f132237a;
                bVar5.f132238b = u.v(str5, "<", bVar6.getString(R.string.lbl_less_than_no_pattern), false);
                bVar5.p();
                String strV = u.v(bVar5.f132238b, bVar6.getString(R.string.lbl_hour), bVar6.getString(R.string.lbl_time_unit_an_hour), false);
                bVar5.f132238b = strV;
                bVar5.f132238b = u.v(strV, bVar6.getString(R.string.lbl_hours_abbreviated), bVar6.getString(R.string.lbl_hours), false);
                return Unit.INSTANCE;
            case 22:
                ((k0) obj).getClass();
                return Unit.INSTANCE;
            case 23:
                ((k0) obj).getClass();
                return Unit.INSTANCE;
            case 24:
                DateTime dateTime9 = (DateTime) obj;
                dateTime9.getClass();
                return dateTime9.plusDays(1);
            case 25:
                pc pcVar = (pc) obj;
                pcVar.getClass();
                return Boolean.valueOf(pcVar != pc.Hidden);
            case 26:
                Context context = (Context) obj;
                m2.a aVar4 = m2.a.f115926a;
                PackageManager packageManager = context.getPackageManager();
                m2.a.f115926a.getClass();
                List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain"), 0);
                ArrayList arrayList = new ArrayList(listQueryIntentActivities.size());
                int size = listQueryIntentActivities.size();
                for (int i39 = 0; i39 < size; i39++) {
                    ResolveInfo resolveInfo = listQueryIntentActivities.get(i39);
                    ResolveInfo resolveInfo2 = resolveInfo;
                    if (context.getPackageName().equals(resolveInfo2.activityInfo.packageName)) {
                        arrayList.add(resolveInfo);
                    } else {
                        ActivityInfo activityInfo = resolveInfo2.activityInfo;
                        if (activityInfo.exported && ((str = activityInfo.permission) == null || context.checkSelfPermission(str) == 0)) {
                            arrayList.add(resolveInfo);
                        }
                    }
                }
                return arrayList;
            case 27:
                q4.c cVar4 = (q4.c) obj;
                m3.i iVar10 = m3.i.f116250a;
                c0.f128819b.getClass();
                int i44 = c0.f128820c;
                q4.a.b f142543b = cVar4.getF142543b();
                long jB = f142543b.b();
                f142543b.a().l();
                try {
                    f142543b.f142550a.a(-3.4028235E38f, 0.0f, Float.MAX_VALUE, Float.MAX_VALUE, i44);
                    cVar4.m1();
                    return Unit.INSTANCE;
                } finally {
                    tn.k.p(f142543b, jB);
                }
            case 28:
                return m3.s.f(((Float) obj).floatValue());
            default:
                k0 k0Var = (k0) obj;
                k0Var.getClass();
                p5.h0.g(k0Var);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ a(ls0.p pVar, int i14) {
        this.f114332a = i14;
    }
}
