package e70;

import a91.m;
import a91.x;
import a91.y;
import com.garmin.android.apps.connectmobile.handalignment.HandAlignmentCameraDebugActivity;
import com.garmin.android.apps.connectmobile.handalignment.HandsCalibrationActivity;
import com.garmin.device.sharing.management.dtos.SharedDeviceInfo;
import e11.w;
import e23.l;
import ei0.e;
import fl1.k;
import fl1.n;
import gl1.z;
import hl1.v;
import hs1.j;
import i3.e5;
import java.util.Set;
import jl1.g;
import lc.u0;
import o70.f;
import o70.t;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Kind;
import org.koin.core.definition.KoinDefinition;
import org.koin.core.instance.SingleInstanceFactory;
import org.koin.core.module.Module;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.registry.ScopeRegistry;
import org.slf4j.Logger;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import p13.j0;
import p5.h0;
import p5.k0;
import r70.r;
import r70.s;
import ub1.i;
import wd2.o1;
import x80.d;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f63288a;

    public /* synthetic */ a(int i14) {
        this.f63288a = i14;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        Integer avgValue;
        j floorsDescended;
        j floorsAscended;
        Integer value;
        Integer restingValue;
        Integer avgValue2;
        Integer avgLevel;
        Integer numJ;
        int i14 = 11;
        int i15 = 10;
        int i16 = 9;
        int i17 = 8;
        int i18 = 7;
        boolean z14 = true;
        z14 = true;
        int i19 = 0;
        int i24 = 14;
        int i25 = 13;
        int i26 = 15;
        switch (this.f63288a) {
            case 0:
                ((k0) obj).getClass();
                return Unit.INSTANCE;
            case 1:
                Module module = (Module) obj;
                e91.a aVar = e91.a.f63486a;
                module.getClass();
                StringQualifier stringQualifierNamed = QualifierKt.named(f.PERSONALIZED_INSIGHTS.a());
                w wVar = new w(i16);
                ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
                Kind kind = Kind.Factory;
                j0 j0Var = j0.f134944a;
                t0 t0Var = s0.f105811a;
                new KoinDefinition(module, e5.n(new BeanDefinition(rootScopeQualifier, t0Var.b(c91.b.class), null, wVar, kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(a80.a.class), null, new w(i14), kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(a91.w.class), null, new w(12), kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(y.class), null, new w(i25), kind, j0Var), module));
                SingleInstanceFactory<?> singleInstanceFactoryP = u0.p(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(x.class), null, new w(i24), Kind.Singleton, j0Var), module);
                if (module.get_createdAtStart()) {
                    module.prepareForCreationAtStart(singleInstanceFactoryP);
                }
                new KoinDefinition(module, singleInstanceFactoryP);
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(i.class), null, new w(i26), kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(l91.a.class), null, new w(16), kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(s.class), stringQualifierNamed, new w(17), kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(r.class), stringQualifierNamed, new w(i18), kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(m.class), null, new w(i17), kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(k91.c.class), null, new w(i15), kind, j0Var), module));
                return Unit.INSTANCE;
            case 2:
                Module module2 = (Module) obj;
                ec1.a aVar2 = ec1.a.f63788a;
                module2.getClass();
                StringQualifier stringQualifierNamed2 = QualifierKt.named(t.X.a());
                w wVar2 = new w(18);
                ScopeRegistry.Companion companion2 = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier2 = companion2.getRootScopeQualifier();
                Kind kind2 = Kind.Factory;
                j0 j0Var2 = j0.f134944a;
                t0 t0Var2 = s0.f105811a;
                new KoinDefinition(module2, e5.n(new BeanDefinition(rootScopeQualifier2, t0Var2.b(s.class), stringQualifierNamed2, wVar2, kind2, j0Var2), module2));
                new KoinDefinition(module2, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(r.class), stringQualifierNamed2, new w(19), kind2, j0Var2), module2));
                new KoinDefinition(module2, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(ic1.m.class), null, new w(20), kind2, j0Var2), module2));
                return Unit.INSTANCE;
            case 3:
                SharedDeviceInfo sharedDeviceInfo = (SharedDeviceInfo) obj;
                ed0.a aVar3 = ed0.a.f63825a;
                sharedDeviceInfo.getClass();
                if (d.c(sharedDeviceInfo.getProductNumber())) {
                    tm2.b.f165446a.getClass();
                    if (!((Set) tm2.b.f165447b.getValue()).contains(sharedDeviceInfo.getProductNumber())) {
                        z14 = false;
                    }
                }
                return Boolean.valueOf(z14);
            case 4:
                Module module3 = (Module) obj;
                ee2.a aVar4 = ee2.a.f63925a;
                module3.getClass();
                new KoinDefinition(module3, e5.n(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), s0.f105811a.b(o1.class), null, new w(21), Kind.Factory, j0.f134944a), module3));
                return Unit.INSTANCE;
            case 5:
                Module module4 = (Module) obj;
                ef2.a aVar5 = ef2.a.f63969a;
                module4.getClass();
                StringQualifier stringQualifierNamed3 = QualifierKt.named(f.CAMPAIGN.a());
                w wVar3 = new w(22);
                ScopeRegistry.Companion companion3 = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier3 = companion3.getRootScopeQualifier();
                Kind kind3 = Kind.Factory;
                j0 j0Var3 = j0.f134944a;
                t0 t0Var3 = s0.f105811a;
                new KoinDefinition(module4, e5.n(new BeanDefinition(rootScopeQualifier3, t0Var3.b(s.class), stringQualifierNamed3, wVar3, kind3, j0Var3), module4));
                new KoinDefinition(module4, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(r.class), stringQualifierNamed3, new w(23), kind3, j0Var3), module4));
                return Unit.INSTANCE;
            case 6:
                s92.b bVar = (s92.b) obj;
                Logger logger = e.f64195d;
                bVar.getClass();
                String copy = bVar.getCopy();
                return copy == null ? "" : copy;
            case 7:
                ((k0) obj).getClass();
                return Unit.INSTANCE;
            case 8:
                k0 k0Var = (k0) obj;
                k0Var.getClass();
                h0.h(k0Var);
                return Unit.INSTANCE;
            case 9:
                Module module5 = (Module) obj;
                el1.b bVar2 = el1.b.f64537a;
                module5.getClass();
                el1.a aVar6 = new el1.a(4);
                ScopeRegistry.Companion companion4 = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier4 = companion4.getRootScopeQualifier();
                Kind kind4 = Kind.Factory;
                j0 j0Var4 = j0.f134944a;
                t0 t0Var4 = s0.f105811a;
                new KoinDefinition(module5, e5.n(new BeanDefinition(rootScopeQualifier4, t0Var4.b(g.class), null, aVar6, kind4, j0Var4), module5));
                new KoinDefinition(module5, e5.n(new BeanDefinition(companion4.getRootScopeQualifier(), t0Var4.b(bl1.b.class), null, new w(25), kind4, j0Var4), module5));
                new KoinDefinition(module5, e5.n(new BeanDefinition(companion4.getRootScopeQualifier(), t0Var4.b(cl1.a.class), null, new w(26), kind4, j0Var4), module5));
                new KoinDefinition(module5, e5.n(new BeanDefinition(companion4.getRootScopeQualifier(), t0Var4.b(dl1.a.class), null, new w(27), kind4, j0Var4), module5));
                new KoinDefinition(module5, e5.n(new BeanDefinition(companion4.getRootScopeQualifier(), t0Var4.b(fl1.b.class), null, new w(28), kind4, j0Var4), module5));
                new KoinDefinition(module5, e5.n(new BeanDefinition(companion4.getRootScopeQualifier(), t0Var4.b(fl1.g.class), null, new w(29), kind4, j0Var4), module5));
                new KoinDefinition(module5, e5.n(new BeanDefinition(companion4.getRootScopeQualifier(), t0Var4.b(fl1.c.class), null, new el1.a(i19), kind4, j0Var4), module5));
                new KoinDefinition(module5, e5.n(new BeanDefinition(companion4.getRootScopeQualifier(), t0Var4.b(fl1.f.class), null, new el1.a(z14 ? 1 : 0), kind4, j0Var4), module5));
                new KoinDefinition(module5, e5.n(new BeanDefinition(companion4.getRootScopeQualifier(), t0Var4.b(k.class), null, new el1.a(2), kind4, j0Var4), module5));
                new KoinDefinition(module5, e5.n(new BeanDefinition(companion4.getRootScopeQualifier(), t0Var4.b(xs.i.class), null, new el1.a(3), kind4, j0Var4), module5));
                new KoinDefinition(module5, e5.n(new BeanDefinition(companion4.getRootScopeQualifier(), t0Var4.b(kl1.a.class), null, new el1.a(5), kind4, j0Var4), module5));
                new KoinDefinition(module5, e5.n(new BeanDefinition(companion4.getRootScopeQualifier(), t0Var4.b(fl1.m.class), null, new el1.a(6), kind4, j0Var4), module5));
                new KoinDefinition(module5, e5.n(new BeanDefinition(companion4.getRootScopeQualifier(), t0Var4.b(n.class), null, new el1.a(i18), kind4, j0Var4), module5));
                new KoinDefinition(module5, e5.n(new BeanDefinition(companion4.getRootScopeQualifier(), t0Var4.b(z.class), null, new el1.a(i17), kind4, j0Var4), module5));
                new KoinDefinition(module5, e5.n(new BeanDefinition(companion4.getRootScopeQualifier(), t0Var4.b(ll1.e.class), null, new el1.a(i16), kind4, j0Var4), module5));
                new KoinDefinition(module5, e5.n(new BeanDefinition(companion4.getRootScopeQualifier(), t0Var4.b(ll1.m.class), null, new el1.a(i15), kind4, j0Var4), module5));
                new KoinDefinition(module5, e5.n(new BeanDefinition(companion4.getRootScopeQualifier(), t0Var4.b(hl1.n.class), null, new el1.a(i14), kind4, j0Var4), module5));
                new KoinDefinition(module5, e5.n(new BeanDefinition(companion4.getRootScopeQualifier(), t0Var4.b(hl1.c.class), null, new el1.a(12), kind4, j0Var4), module5));
                new KoinDefinition(module5, e5.n(new BeanDefinition(companion4.getRootScopeQualifier(), t0Var4.b(v.class), null, new w(24), kind4, j0Var4), module5));
                return Unit.INSTANCE;
            case 10:
                Logger logger2 = HandAlignmentCameraDebugActivity.f36551n;
                return Unit.INSTANCE;
            case 11:
                com.airbnb.lottie.animation.keyframe.a.A("Abort error: ", ((Throwable) obj).getMessage(), HandsCalibrationActivity.A);
                return Unit.INSTANCE;
            case 12:
                com.garmin.android.apps.connectmobile.handalignment.f.a aVar7 = com.garmin.android.apps.connectmobile.handalignment.f.f36613h;
                return Unit.INSTANCE;
            case 13:
                com.garmin.android.apps.connectmobile.handalignment.f.a aVar8 = com.garmin.android.apps.connectmobile.handalignment.f.f36613h;
                return Unit.INSTANCE;
            case 14:
                com.garmin.android.apps.connectmobile.handalignment.f.a aVar9 = com.garmin.android.apps.connectmobile.handalignment.f.f36613h;
                return Unit.INSTANCE;
            case 15:
                com.garmin.android.apps.connectmobile.handalignment.f.a aVar10 = com.garmin.android.apps.connectmobile.handalignment.f.f36613h;
                return Unit.INSTANCE;
            case 16:
                com.garmin.android.apps.connectmobile.handalignment.f.a aVar11 = com.garmin.android.apps.connectmobile.handalignment.f.f36613h;
                return Unit.INSTANCE;
            case 17:
                Module module6 = (Module) obj;
                eo0.a aVar12 = eo0.a.f64782a;
                module6.getClass();
                StringQualifier stringQualifierNamed4 = QualifierKt.named(t.f130077v.a());
                el1.a aVar13 = new el1.a(i25);
                ScopeRegistry.Companion companion5 = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier5 = companion5.getRootScopeQualifier();
                Kind kind5 = Kind.Factory;
                j0 j0Var5 = j0.f134944a;
                t0 t0Var5 = s0.f105811a;
                new KoinDefinition(module6, e5.n(new BeanDefinition(rootScopeQualifier5, t0Var5.b(s.class), stringQualifierNamed4, aVar13, kind5, j0Var5), module6));
                new KoinDefinition(module6, e5.n(new BeanDefinition(companion5.getRootScopeQualifier(), t0Var5.b(r.class), stringQualifierNamed4, new el1.a(i24), kind5, j0Var5), module6));
                return Unit.INSTANCE;
            case 18:
                Module module7 = (Module) obj;
                eo0.b bVar3 = eo0.b.f64784a;
                module7.getClass();
                new KoinDefinition(module7, e5.n(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), s0.f105811a.b(bo0.a.class), null, new el1.a(i26), Kind.Factory, j0.f134944a), module7));
                return Unit.INSTANCE;
            case 19:
                ((k0) obj).getClass();
                return Unit.INSTANCE;
            case 20:
                hs1.d dVar = (hs1.d) obj;
                dVar.getClass();
                hs1.l respiration = dVar.getRespiration();
                if (respiration == null || (avgValue = respiration.getAvgValue()) == null) {
                    return null;
                }
                return Double.valueOf(avgValue.intValue());
            case 21:
                hs1.d dVar2 = (hs1.d) obj;
                dVar2.getClass();
                hs1.i movement = dVar2.getMovement();
                if (movement != null && (floorsAscended = movement.getFloorsAscended()) != null && (value = floorsAscended.getValue()) != null) {
                    return Double.valueOf(value.intValue());
                }
                hs1.i movement2 = dVar2.getMovement();
                if (((movement2 == null || (floorsDescended = movement2.getFloorsDescended()) == null) ? null : floorsDescended.getValue()) != null) {
                    return Double.valueOf(0.0d);
                }
                return null;
            case 22:
                hs1.d dVar3 = (hs1.d) obj;
                dVar3.getClass();
                hs1.e heartRate = dVar3.getHeartRate();
                if (heartRate == null || (restingValue = heartRate.getRestingValue()) == null) {
                    return null;
                }
                return Double.valueOf(restingValue.intValue());
            case 23:
                oi0.b bVar4 = (oi0.b) obj;
                bVar4.getClass();
                bVar4.a();
                return Unit.INSTANCE;
            case 24:
                hs1.d dVar4 = (hs1.d) obj;
                dVar4.getClass();
                hs1.k pulseOx = dVar4.getPulseOx();
                if (pulseOx == null || (avgValue2 = pulseOx.getAvgValue()) == null) {
                    return null;
                }
                return Double.valueOf(avgValue2.intValue());
            case 25:
                hs1.d dVar5 = (hs1.d) obj;
                dVar5.getClass();
                hs1.m stress = dVar5.getStress();
                if (stress == null || (avgLevel = stress.getAvgLevel()) == null) {
                    return null;
                }
                int iIntValue = avgLevel.intValue();
                Integer numValueOf = iIntValue > -1 ? Integer.valueOf(iIntValue) : null;
                if (numValueOf != null) {
                    return Double.valueOf(numValueOf.intValue());
                }
                return null;
            case 26:
                hs1.d dVar6 = (hs1.d) obj;
                dVar6.getClass();
                hs1.f hydration = dVar6.getHydration();
                if (hydration != null) {
                    return hydration.getConsumedInFractionalMl();
                }
                return null;
            case 27:
                km1.v vVar = (km1.v) obj;
                vVar.getClass();
                jm1.c sleepScores = vVar.getSleepScores();
                if (sleepScores == null || (numJ = sleepScores.j()) == null) {
                    return null;
                }
                return Double.valueOf(numJ.intValue());
            case 28:
                km1.v vVar2 = (km1.v) obj;
                vVar2.getClass();
                int sleepTimeSeconds = vVar2.getSleepTimeSeconds();
                if (sleepTimeSeconds > 0) {
                    return Double.valueOf(sleepTimeSeconds);
                }
                return null;
            default:
                l42.b bVar5 = (l42.b) obj;
                bVar5.getClass();
                l42.c cVarF = bVar5.f();
                if (cVarF != null) {
                    return cVarF.getWeight();
                }
                return null;
        }
    }
}
