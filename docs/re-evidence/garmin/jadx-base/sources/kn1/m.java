package kn1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Toast;
import b63.o;
import b63.q;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.MenstrualCycleReminderSettingsActivity;
import d53.u;
import i3.e5;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import k23.p;
import k23.r;
import k23.s;
import kq.j0;
import lc.u0;
import m12.v;
import m12.y;
import o70.t;
import org.apache.commons.lang3.StringUtils;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Kind;
import org.koin.core.definition.KoinDefinition;
import org.koin.core.module.Module;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.registry.ScopeRegistry;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Marker;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.a1;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import p006l2.k1;
import p5.h0;
import p5.k0;
import s5.w0;
import z2.y1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class m implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f105680a;

    public /* synthetic */ m(a1 a1Var) {
        this.f105680a = 3;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0080  */
    @Override // e23.l
    public final Object invoke(Object obj) throws Exception {
        int iOffsetByCodePoints;
        int i14 = 8;
        int i15 = 3;
        int i16 = 2;
        int i17 = 6;
        switch (this.f105680a) {
            case 0:
                k0 k0Var = (k0) obj;
                k0Var.getClass();
                h0.h(k0Var);
                return Unit.INSTANCE;
            case 1:
                k0 k0Var2 = (k0) obj;
                k0Var2.getClass();
                h0.h(k0Var2);
                return Unit.INSTANCE;
            case 2:
                k0 k0Var3 = (k0) obj;
                k0Var3.getClass();
                h0.h(k0Var3);
                return Unit.INSTANCE;
            case 3:
                r rVar = (r) obj;
                int i18 = a1.f105781e;
                rVar.getClass();
                s sVar = rVar.f102463a;
                if (sVar == null) {
                    return Marker.ANY_MARKER;
                }
                p pVar = rVar.f102464b;
                a1 a1Var = pVar instanceof a1 ? (a1) pVar : null;
                String strC = a1Var != null ? a1Var.c(true) : String.valueOf(pVar);
                int i19 = a1.b.f105786a[sVar.ordinal()];
                if (i19 == 1) {
                    return strC;
                }
                if (i19 == 2) {
                    return "in ".concat(strC);
                }
                if (i19 == 3) {
                    return "out ".concat(strC);
                }
                u0.r();
                return null;
            case 4:
                Context context = (Context) obj;
                int i24 = j0.f106090g;
                context.getClass();
                LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
                layoutInflaterFrom.getClass();
                return layoutInflaterFrom.inflate(R.layout.gcm3_cycling_dynamics_power_phase_help_image, (ViewGroup) null);
            case 5:
                Context context2 = (Context) obj;
                int i25 = j0.f106090g;
                context2.getClass();
                LayoutInflater layoutInflaterFrom2 = LayoutInflater.from(context2);
                layoutInflaterFrom2.getClass();
                return layoutInflaterFrom2.inflate(R.layout.gcm3_cycling_dynamics_peak_power_phase_help_image, (ViewGroup) null);
            case 6:
                Module module = (Module) obj;
                kr0.a aVar = kr0.a.f106223a;
                module.getClass();
                StringQualifier stringQualifierNamed = QualifierKt.named(t.C.a());
                kc0.a aVar2 = new kc0.a(20);
                ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
                Kind kind = Kind.Factory;
                p13.j0 j0Var = p13.j0.f134944a;
                t0 t0Var = s0.f105811a;
                new KoinDefinition(module, e5.n(new BeanDefinition(rootScopeQualifier, t0Var.b(r70.s.class), stringQualifierNamed, aVar2, kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(r70.r.class), stringQualifierNamed, new kc0.a(21), kind, j0Var), module));
                return Unit.INSTANCE;
            case 7:
                Module module2 = (Module) obj;
                kr0.b bVar = kr0.b.f106225a;
                module2.getClass();
                kc0.a aVar3 = new kc0.a(22);
                ScopeRegistry.Companion companion2 = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier2 = companion2.getRootScopeQualifier();
                Kind kind2 = Kind.Factory;
                p13.j0 j0Var2 = p13.j0.f134944a;
                t0 t0Var2 = s0.f105811a;
                new KoinDefinition(module2, e5.n(new BeanDefinition(rootScopeQualifier2, t0Var2.b(al0.k.class), null, aVar3, kind2, j0Var2), module2));
                new KoinDefinition(module2, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(jr0.a.class), null, new kc0.a(23), kind2, j0Var2), module2));
                new KoinDefinition(module2, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(or0.m.class), null, new kc0.a(24), kind2, j0Var2), module2));
                return Unit.INSTANCE;
            case 8:
                ((Integer) obj).getClass();
                kr2.h.a aVar4 = kr2.h.f106255y;
                HashMap map = new HashMap(2);
                map.put("notification-key", "pushnotification_nfc_payment_fitpay");
                map.put("testKey1", "testValue1");
                ls2.b bVar2 = ls2.b.f114790a;
                Context contextC = ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c();
                bVar2.getClass();
                ls2.b.b(contextC, map);
                Toast.makeText(((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c(), "Created generic sync notification.", 0).show();
                return Unit.INSTANCE;
            case 9:
                ((Integer) obj).getClass();
                kr2.h.a aVar5 = kr2.h.f106255y;
                Toast.makeText(((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c(), "WARNING: mock payload has a hard-coded FitPay device ID", 1).show();
                kg.f fVar = new kg.f(8);
                int i26 = w03.b.f181178a;
                new z03.h(fVar).k(l13.a.f108327b).h(r03.a.a()).a(new kr2.m());
                return Unit.INSTANCE;
            case 10:
                ((oi0.b) obj).v();
                return Unit.INSTANCE;
            case 11:
                oi0.b bVar3 = (oi0.b) obj;
                MenstrualCycleReminderSettingsActivity.a aVar6 = MenstrualCycleReminderSettingsActivity.f39014o;
                bVar3.getClass();
                bVar3.f132238b = u.v(bVar3.f132238b, ":", StringUtils.SPACE, false);
                return Unit.INSTANCE;
            case 12:
                oi0.b bVar4 = (oi0.b) obj;
                MenstrualCycleReminderSettingsActivity.a aVar7 = MenstrualCycleReminderSettingsActivity.f39014o;
                bVar4.getClass();
                bVar4.f132238b = u.v(bVar4.f132238b, ":", StringUtils.SPACE, false);
                return Unit.INSTANCE;
            case 13:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                String lowerCase = ((String) entry.getKey()).toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                return lowerCase;
            case 14:
                o oVar = (o) obj;
                oVar.getClass();
                b63.i.INSTANCE.getClass();
                return q.e(oVar, 1, b63.i.f16190d);
            case 15:
                ud.a aVar8 = (ud.a) obj;
                kz0.b.C2069b c2069b = kz0.b.f107780b;
                aVar8.getClass();
                ud.c cVarM0 = aVar8.M0("DELETE FROM edited_connections");
                try {
                    cVarM0.J0();
                    return Unit.INSTANCE;
                } finally {
                    cVarM0.close();
                }
            case 16:
                ud.a aVar9 = (ud.a) obj;
                kz0.d.b bVar5 = kz0.d.f107782c;
                aVar9.getClass();
                ud.c cVarM1 = aVar9.M0("DELETE FROM edited_posts");
                try {
                    cVarM1.J0();
                    return Unit.INSTANCE;
                } finally {
                    cVarM1.close();
                }
            case 17:
                ud.a aVar10 = (ud.a) obj;
                kz0.d.b bVar6 = kz0.d.f107782c;
                aVar10.getClass();
                ud.c cVarM2 = aVar10.M0("SELECT activityId FROM edited_posts");
                try {
                    ArrayList arrayList = new ArrayList();
                    while (cVarM2.J0()) {
                        arrayList.add(Long.valueOf(cVarM2.getLong(0)));
                    }
                    cVarM2.close();
                    return arrayList;
                } catch (Throwable th3) {
                    cVarM2.close();
                    throw th3;
                }
            case 18:
                Module module3 = (Module) obj;
                l12.a aVar11 = l12.a.f108324a;
                module3.getClass();
                ky0.c cVar = new ky0.c(i15);
                ScopeRegistry.Companion companion3 = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier3 = companion3.getRootScopeQualifier();
                Kind kind3 = Kind.Factory;
                p13.j0 j0Var3 = p13.j0.f134944a;
                t0 t0Var3 = s0.f105811a;
                new KoinDefinition(module3, e5.n(new BeanDefinition(rootScopeQualifier3, t0Var3.b(k12.a.class), null, cVar, kind3, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(k12.b.class), null, new ky0.c(4), kind3, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(m12.d.class), null, new ky0.c(5), kind3, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(m12.m.class), null, new ky0.c(i17), kind3, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(v.class), null, new ky0.c(7), kind3, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(m12.n.class), null, new ky0.c(i14), kind3, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(y.class), null, new ky0.c(9), kind3, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(m12.o.class), null, new ky0.c(10), kind3, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(m12.a.class), null, new ky0.c(11), kind3, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(com.garmin.android.apps.connectmobile.userprofile.presentation.d.class), null, new ky0.c(i16), kind3, j0Var3), module3));
                return Unit.INSTANCE;
            case 19:
                return Unit.INSTANCE;
            case 20:
                return Unit.INSTANCE;
            case 21:
                Long l14 = (Long) obj;
                l14.longValue();
                return l14;
            case 22:
                return Unit.INSTANCE;
            case 23:
                return Unit.INSTANCE;
            case 24:
                k1 k1Var = k1.f108614a;
                return Unit.INSTANCE;
            case 25:
                return Unit.INSTANCE;
            case 26:
                y1 y1Var = (y1) obj;
                String str = y1Var.f201549g.f157138b;
                long j8 = y1Var.f201548f;
                w0.a aVar12 = w0.f157315b;
                int i27 = (int) (j8 & 4294967295L);
                if (i27 > 0) {
                    androidx.emoji2.text.d dVarG = ge1.b.G();
                    if (dVarG != null) {
                        int iB = dVarG.b(i27 - 1, str);
                        if (iB >= 0) {
                            iOffsetByCodePoints = iB;
                        } else if (i27 <= 0) {
                            iOffsetByCodePoints = -1;
                        } else {
                            iOffsetByCodePoints = Character.offsetByCodePoints(str, i27, -1);
                        }
                    } else if (i27 <= 0) {
                        iOffsetByCodePoints = -1;
                    } else {
                        iOffsetByCodePoints = Character.offsetByCodePoints(str, i27, -1);
                    }
                } else {
                    iOffsetByCodePoints = -1;
                }
                if (iOffsetByCodePoints == -1) {
                    return null;
                }
                return new x5.i(((int) (y1Var.f201548f & 4294967295L)) - iOffsetByCodePoints, 0);
            case 27:
                y1 y1Var2 = (y1) obj;
                String str2 = y1Var2.f201549g.f157138b;
                long j14 = y1Var2.f201548f;
                w0.a aVar13 = w0.f157315b;
                int iU = ge1.b.u((int) (j14 & 4294967295L), str2);
                if (iU != -1) {
                    return new x5.i(0, iU - ((int) (y1Var2.f201548f & 4294967295L)));
                }
                return null;
            case 28:
                y1 y1Var3 = (y1) obj;
                Integer numD = y1Var3.d();
                if (numD == null) {
                    return null;
                }
                int iIntValue = numD.intValue();
                long j15 = y1Var3.f201548f;
                w0.a aVar14 = w0.f157315b;
                return new x5.i(((int) (j15 & 4294967295L)) - iIntValue, 0);
            default:
                y1 y1Var4 = (y1) obj;
                Integer numC = y1Var4.c();
                if (numC == null) {
                    return null;
                }
                int iIntValue2 = numC.intValue();
                long j16 = y1Var4.f201548f;
                w0.a aVar15 = w0.f157315b;
                return new x5.i(0, iIntValue2 - ((int) (j16 & 4294967295L)));
        }
    }

    public /* synthetic */ m(int i14) {
        this.f105680a = i14;
    }
}
