package id0;

import android.content.Context;
import android.os.Bundle;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.blood_pressure.domain.BloodPressureRemindersUpdater;
import com.garmin.android.apps.connectmobile.domain.watchers.DashboardEssentialsConfigWatcher;
import com.garmin.android.apps.connectmobile.logging.domain.reminders.LifestyleLoggingRemindersUpdater;
import com.garmin.android.apps.connectmobile.nutrition.domain.reminders.NutritionRemindersUpdater;
import com.garmin.android.apps.connectmobile.pregnancytracking.domain.PregnancyRemindersUpdater;
import kd0.v5;
import kd0.v6;
import kd0.w5;
import kd0.y6;
import kd0.z6;
import org.koin.android.ext.koin.ModuleExtKt;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Kind;
import org.koin.core.definition.KoinDefinition;
import org.koin.core.error.DefinitionParameterException;
import org.koin.core.instance.SingleInstanceFactory;
import org.koin.core.module.Module;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.registry.ScopeRegistry;
import org.koin.core.scope.Scope;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class h3 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f92782a;

    public /* synthetic */ h3(int i14) {
        this.f92782a = i14;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        final int i14 = 8;
        final int i15 = 6;
        final int i16 = 5;
        final int i17 = 4;
        final int i18 = 3;
        final int i19 = 2;
        final int i24 = 1;
        final int i25 = 0;
        final int i26 = 29;
        final int i27 = 28;
        final int i28 = 7;
        switch (this.f92782a) {
            case 0:
                Module module = (Module) obj;
                i3 i3Var = i3.f92793a;
                module.getClass();
                f3 f3Var = new f3(27);
                new KoinDefinition(module, i3.e5.n(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), p005kotlin.jvm.internal.s0.f105811a.b(s41.a.class), null, f3Var, Kind.Factory, p13.j0.f134944a), module));
                s41.b.f157060a.getClass();
                module.includes(s41.b.f157061b);
                break;
            case 1:
                Module module2 = (Module) obj;
                j3 j3Var = j3.f92808a;
                module2.getClass();
                f3 f3Var2 = new f3(i27);
                new KoinDefinition(module2, i3.e5.n(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), p005kotlin.jvm.internal.s0.f105811a.b(r71.a.class), null, f3Var2, Kind.Factory, p13.j0.f134944a), module2));
                w71.b.f183512a.getClass();
                module2.includes(w71.b.f183513b);
                m81.b.f117165a.getClass();
                module2.includes(m81.b.f117166b);
                break;
            case 2:
                Module module3 = (Module) obj;
                k3 k3Var = k3.f92821a;
                module3.getClass();
                f3 f3Var3 = new f3(i26);
                new KoinDefinition(module3, i3.e5.n(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), p005kotlin.jvm.internal.s0.f105811a.b(p91.a.class), null, f3Var3, Kind.Factory, p13.j0.f134944a), module3));
                p91.b.f136560a.getClass();
                module3.includes(p91.b.f136561b);
                break;
            case 3:
                Module module4 = (Module) obj;
                m3 m3Var = m3.f92846a;
                module4.getClass();
                e23.p pVar = new e23.p() { // from class: id0.l3
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i25) {
                            case 0:
                                m3 m3Var2 = m3.f92846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.b5();
                            case 1:
                                m3 m3Var3 = m3.f92846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (ka1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ka1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 2:
                                Scope scope = (Scope) obj2;
                                m3 m3Var4 = m3.f92846a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new oa1.c((ka1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ka1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                Scope scope2 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                m3 m3Var5 = m3.f92846a;
                                scope2.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
                                return new ra1.a((ma1.a) parametersHolder.elementAt(0, t0Var.b(ma1.a.class)), (oa1.c) scope2.get((k23.d<?>) t0Var.b(oa1.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                n3 n3Var = n3.f92858a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.d5();
                            case 5:
                                o3 o3Var = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.e5();
                            case 6:
                                o3 o3Var2 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.f5();
                            case 7:
                                o3 o3Var3 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new v6();
                            case 8:
                                o3 o3Var4 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f) ez0.b.a(ez0.b.f67468a, ez0.c.GC, com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f.class, new c83.h.a[0], null, null, null, 120);
                            case 9:
                                o3 o3Var5 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new y6();
                            case 10:
                                Scope scope3 = (Scope) obj2;
                                o3 o3Var6 = o3.f92872a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z6((com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f) scope3.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                p3 p3Var = p3.f92884a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.g5();
                            case 12:
                                r3 r3Var = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ht.b();
                            case 13:
                                Scope scope4 = (Scope) obj2;
                                r3 r3Var2 = r3.f92907a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (zd0.g1) scope4.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(zd0.q0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                            case 14:
                                Scope scope5 = (Scope) obj2;
                                r3 r3Var3 = r3.f92907a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var2 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.u0((z70.b0) scope5.get((k23.d<?>) t0Var2.b(z70.b0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (z70.x) scope5.get((k23.d<?>) t0Var2.b(z70.x.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ub1.m) scope5.get((k23.d<?>) t0Var2.b(ub1.m.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (z70.z) scope5.get((k23.d<?>) t0Var2.b(z70.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ht.p) scope5.get((k23.d<?>) t0Var2.b(ht.p.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.f0) scope5.get((k23.d<?>) t0Var2.b(zd0.f0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (c22.k) scope5.get((k23.d<?>) t0Var2.b(c22.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.k0) scope5.get((k23.d<?>) t0Var2.b(zd0.k0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                r3 r3Var4 = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (zy0.n) ez0.b.a(ez0.b.f67468a, ez0.c.OMT, zy0.n.class, new c83.h.a[0], null, null, null, 120);
                            case 16:
                                Scope scope6 = (Scope) obj2;
                                r3 r3Var5 = r3.f92907a;
                                scope6.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (zd0.g0) scope6.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(zd0.f0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                            case 17:
                                r3 r3Var6 = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.b();
                            case 18:
                                Scope scope7 = (Scope) obj2;
                                r3 r3Var7 = r3.f92907a;
                                scope7.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z70.c0(new q3(scope7, 0), (z70.z) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(z70.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 19:
                                r3 r3Var8 = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zy0.d();
                            case 20:
                                Scope scope8 = (Scope) obj2;
                                r3 r3Var9 = r3.f92907a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z70.c(ModuleExtKt.androidContext(scope8));
                            case 21:
                                Scope scope9 = (Scope) obj2;
                                r3 r3Var10 = r3.f92907a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var3 = p005kotlin.jvm.internal.s0.f105811a;
                                return new z70.a((z70.y) scope9.get((k23.d<?>) t0Var3.b(z70.y.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zy0.o) scope9.get((k23.d<?>) t0Var3.b(zy0.o.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                Scope scope10 = (Scope) obj2;
                                r3 r3Var11 = r3.f92907a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z70.d(ModuleExtKt.androidContext(scope10), (c22.k) scope10.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(c22.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                Scope scope11 = (Scope) obj2;
                                r3 r3Var12 = r3.f92907a;
                                scope11.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (z70.a0) scope11.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(z70.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                            case 24:
                                s3 s3Var = s3.f92921a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ub1.d();
                            case 25:
                                s3 s3Var2 = s3.f92921a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ge0.e();
                            case 26:
                                Scope scope12 = (Scope) obj2;
                                s3 s3Var3 = s3.f92921a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var4 = p005kotlin.jvm.internal.s0.f105811a;
                                return new DashboardEssentialsConfigWatcher((he0.a) scope12.get((k23.d<?>) t0Var4.b(he0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.g1) scope12.get((k23.d<?>) t0Var4.b(zd0.g1.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 27:
                                Scope scope13 = (Scope) obj2;
                                s3 s3Var4 = s3.f92921a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new wb1.o((z70.a0) scope13.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(z70.a0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                u3 u3Var = u3.f92946a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ld0.a();
                            default:
                                u3 u3Var2 = u3.f92946a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (ol.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ol.a.class, new c83.h.a[0], null, null, null, 120);
                        }
                    }
                };
                ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
                Kind kind = Kind.Factory;
                p13.j0 j0Var = p13.j0.f134944a;
                p005kotlin.jvm.internal.t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
                new KoinDefinition(module4, i3.e5.n(new BeanDefinition(rootScopeQualifier, t0Var.b(ja1.b.class), null, pVar, kind, j0Var), module4));
                new KoinDefinition(module4, i3.e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(ka1.a.class), null, new e23.p() { // from class: id0.l3
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i24) {
                            case 0:
                                m3 m3Var2 = m3.f92846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.b5();
                            case 1:
                                m3 m3Var3 = m3.f92846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (ka1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ka1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 2:
                                Scope scope = (Scope) obj2;
                                m3 m3Var4 = m3.f92846a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new oa1.c((ka1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ka1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                Scope scope2 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                m3 m3Var5 = m3.f92846a;
                                scope2.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var2 = p005kotlin.jvm.internal.s0.f105811a;
                                return new ra1.a((ma1.a) parametersHolder.elementAt(0, t0Var2.b(ma1.a.class)), (oa1.c) scope2.get((k23.d<?>) t0Var2.b(oa1.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                n3 n3Var = n3.f92858a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.d5();
                            case 5:
                                o3 o3Var = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.e5();
                            case 6:
                                o3 o3Var2 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.f5();
                            case 7:
                                o3 o3Var3 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new v6();
                            case 8:
                                o3 o3Var4 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f) ez0.b.a(ez0.b.f67468a, ez0.c.GC, com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f.class, new c83.h.a[0], null, null, null, 120);
                            case 9:
                                o3 o3Var5 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new y6();
                            case 10:
                                Scope scope3 = (Scope) obj2;
                                o3 o3Var6 = o3.f92872a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z6((com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f) scope3.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                p3 p3Var = p3.f92884a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.g5();
                            case 12:
                                r3 r3Var = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ht.b();
                            case 13:
                                Scope scope4 = (Scope) obj2;
                                r3 r3Var2 = r3.f92907a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (zd0.g1) scope4.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(zd0.q0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                            case 14:
                                Scope scope5 = (Scope) obj2;
                                r3 r3Var3 = r3.f92907a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var3 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.u0((z70.b0) scope5.get((k23.d<?>) t0Var3.b(z70.b0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (z70.x) scope5.get((k23.d<?>) t0Var3.b(z70.x.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ub1.m) scope5.get((k23.d<?>) t0Var3.b(ub1.m.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (z70.z) scope5.get((k23.d<?>) t0Var3.b(z70.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ht.p) scope5.get((k23.d<?>) t0Var3.b(ht.p.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.f0) scope5.get((k23.d<?>) t0Var3.b(zd0.f0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (c22.k) scope5.get((k23.d<?>) t0Var3.b(c22.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.k0) scope5.get((k23.d<?>) t0Var3.b(zd0.k0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                r3 r3Var4 = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (zy0.n) ez0.b.a(ez0.b.f67468a, ez0.c.OMT, zy0.n.class, new c83.h.a[0], null, null, null, 120);
                            case 16:
                                Scope scope6 = (Scope) obj2;
                                r3 r3Var5 = r3.f92907a;
                                scope6.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (zd0.g0) scope6.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(zd0.f0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                            case 17:
                                r3 r3Var6 = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.b();
                            case 18:
                                Scope scope7 = (Scope) obj2;
                                r3 r3Var7 = r3.f92907a;
                                scope7.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z70.c0(new q3(scope7, 0), (z70.z) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(z70.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 19:
                                r3 r3Var8 = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zy0.d();
                            case 20:
                                Scope scope8 = (Scope) obj2;
                                r3 r3Var9 = r3.f92907a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z70.c(ModuleExtKt.androidContext(scope8));
                            case 21:
                                Scope scope9 = (Scope) obj2;
                                r3 r3Var10 = r3.f92907a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var4 = p005kotlin.jvm.internal.s0.f105811a;
                                return new z70.a((z70.y) scope9.get((k23.d<?>) t0Var4.b(z70.y.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zy0.o) scope9.get((k23.d<?>) t0Var4.b(zy0.o.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                Scope scope10 = (Scope) obj2;
                                r3 r3Var11 = r3.f92907a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z70.d(ModuleExtKt.androidContext(scope10), (c22.k) scope10.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(c22.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                Scope scope11 = (Scope) obj2;
                                r3 r3Var12 = r3.f92907a;
                                scope11.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (z70.a0) scope11.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(z70.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                            case 24:
                                s3 s3Var = s3.f92921a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ub1.d();
                            case 25:
                                s3 s3Var2 = s3.f92921a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ge0.e();
                            case 26:
                                Scope scope12 = (Scope) obj2;
                                s3 s3Var3 = s3.f92921a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var5 = p005kotlin.jvm.internal.s0.f105811a;
                                return new DashboardEssentialsConfigWatcher((he0.a) scope12.get((k23.d<?>) t0Var5.b(he0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.g1) scope12.get((k23.d<?>) t0Var5.b(zd0.g1.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 27:
                                Scope scope13 = (Scope) obj2;
                                s3 s3Var4 = s3.f92921a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new wb1.o((z70.a0) scope13.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(z70.a0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                u3 u3Var = u3.f92946a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ld0.a();
                            default:
                                u3 u3Var2 = u3.f92946a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (ol.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ol.a.class, new c83.h.a[0], null, null, null, 120);
                        }
                    }
                }, kind, j0Var), module4));
                new KoinDefinition(module4, i3.e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(oa1.c.class), null, new e23.p() { // from class: id0.l3
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i19) {
                            case 0:
                                m3 m3Var2 = m3.f92846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.b5();
                            case 1:
                                m3 m3Var3 = m3.f92846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (ka1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ka1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 2:
                                Scope scope = (Scope) obj2;
                                m3 m3Var4 = m3.f92846a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new oa1.c((ka1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ka1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                Scope scope2 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                m3 m3Var5 = m3.f92846a;
                                scope2.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var2 = p005kotlin.jvm.internal.s0.f105811a;
                                return new ra1.a((ma1.a) parametersHolder.elementAt(0, t0Var2.b(ma1.a.class)), (oa1.c) scope2.get((k23.d<?>) t0Var2.b(oa1.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                n3 n3Var = n3.f92858a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.d5();
                            case 5:
                                o3 o3Var = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.e5();
                            case 6:
                                o3 o3Var2 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.f5();
                            case 7:
                                o3 o3Var3 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new v6();
                            case 8:
                                o3 o3Var4 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f) ez0.b.a(ez0.b.f67468a, ez0.c.GC, com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f.class, new c83.h.a[0], null, null, null, 120);
                            case 9:
                                o3 o3Var5 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new y6();
                            case 10:
                                Scope scope3 = (Scope) obj2;
                                o3 o3Var6 = o3.f92872a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z6((com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f) scope3.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                p3 p3Var = p3.f92884a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.g5();
                            case 12:
                                r3 r3Var = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ht.b();
                            case 13:
                                Scope scope4 = (Scope) obj2;
                                r3 r3Var2 = r3.f92907a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (zd0.g1) scope4.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(zd0.q0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                            case 14:
                                Scope scope5 = (Scope) obj2;
                                r3 r3Var3 = r3.f92907a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var3 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.u0((z70.b0) scope5.get((k23.d<?>) t0Var3.b(z70.b0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (z70.x) scope5.get((k23.d<?>) t0Var3.b(z70.x.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ub1.m) scope5.get((k23.d<?>) t0Var3.b(ub1.m.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (z70.z) scope5.get((k23.d<?>) t0Var3.b(z70.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ht.p) scope5.get((k23.d<?>) t0Var3.b(ht.p.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.f0) scope5.get((k23.d<?>) t0Var3.b(zd0.f0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (c22.k) scope5.get((k23.d<?>) t0Var3.b(c22.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.k0) scope5.get((k23.d<?>) t0Var3.b(zd0.k0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                r3 r3Var4 = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (zy0.n) ez0.b.a(ez0.b.f67468a, ez0.c.OMT, zy0.n.class, new c83.h.a[0], null, null, null, 120);
                            case 16:
                                Scope scope6 = (Scope) obj2;
                                r3 r3Var5 = r3.f92907a;
                                scope6.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (zd0.g0) scope6.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(zd0.f0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                            case 17:
                                r3 r3Var6 = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.b();
                            case 18:
                                Scope scope7 = (Scope) obj2;
                                r3 r3Var7 = r3.f92907a;
                                scope7.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z70.c0(new q3(scope7, 0), (z70.z) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(z70.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 19:
                                r3 r3Var8 = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zy0.d();
                            case 20:
                                Scope scope8 = (Scope) obj2;
                                r3 r3Var9 = r3.f92907a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z70.c(ModuleExtKt.androidContext(scope8));
                            case 21:
                                Scope scope9 = (Scope) obj2;
                                r3 r3Var10 = r3.f92907a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var4 = p005kotlin.jvm.internal.s0.f105811a;
                                return new z70.a((z70.y) scope9.get((k23.d<?>) t0Var4.b(z70.y.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zy0.o) scope9.get((k23.d<?>) t0Var4.b(zy0.o.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                Scope scope10 = (Scope) obj2;
                                r3 r3Var11 = r3.f92907a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z70.d(ModuleExtKt.androidContext(scope10), (c22.k) scope10.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(c22.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                Scope scope11 = (Scope) obj2;
                                r3 r3Var12 = r3.f92907a;
                                scope11.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (z70.a0) scope11.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(z70.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                            case 24:
                                s3 s3Var = s3.f92921a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ub1.d();
                            case 25:
                                s3 s3Var2 = s3.f92921a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ge0.e();
                            case 26:
                                Scope scope12 = (Scope) obj2;
                                s3 s3Var3 = s3.f92921a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var5 = p005kotlin.jvm.internal.s0.f105811a;
                                return new DashboardEssentialsConfigWatcher((he0.a) scope12.get((k23.d<?>) t0Var5.b(he0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.g1) scope12.get((k23.d<?>) t0Var5.b(zd0.g1.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 27:
                                Scope scope13 = (Scope) obj2;
                                s3 s3Var4 = s3.f92921a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new wb1.o((z70.a0) scope13.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(z70.a0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                u3 u3Var = u3.f92946a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ld0.a();
                            default:
                                u3 u3Var2 = u3.f92946a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (ol.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ol.a.class, new c83.h.a[0], null, null, null, 120);
                        }
                    }
                }, kind, j0Var), module4));
                new KoinDefinition(module4, i3.e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(ra1.a.class), null, new e23.p() { // from class: id0.l3
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i18) {
                            case 0:
                                m3 m3Var2 = m3.f92846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.b5();
                            case 1:
                                m3 m3Var3 = m3.f92846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (ka1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ka1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 2:
                                Scope scope = (Scope) obj2;
                                m3 m3Var4 = m3.f92846a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new oa1.c((ka1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ka1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                Scope scope2 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                m3 m3Var5 = m3.f92846a;
                                scope2.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var2 = p005kotlin.jvm.internal.s0.f105811a;
                                return new ra1.a((ma1.a) parametersHolder.elementAt(0, t0Var2.b(ma1.a.class)), (oa1.c) scope2.get((k23.d<?>) t0Var2.b(oa1.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                n3 n3Var = n3.f92858a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.d5();
                            case 5:
                                o3 o3Var = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.e5();
                            case 6:
                                o3 o3Var2 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.f5();
                            case 7:
                                o3 o3Var3 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new v6();
                            case 8:
                                o3 o3Var4 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f) ez0.b.a(ez0.b.f67468a, ez0.c.GC, com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f.class, new c83.h.a[0], null, null, null, 120);
                            case 9:
                                o3 o3Var5 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new y6();
                            case 10:
                                Scope scope3 = (Scope) obj2;
                                o3 o3Var6 = o3.f92872a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z6((com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f) scope3.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                p3 p3Var = p3.f92884a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.g5();
                            case 12:
                                r3 r3Var = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ht.b();
                            case 13:
                                Scope scope4 = (Scope) obj2;
                                r3 r3Var2 = r3.f92907a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (zd0.g1) scope4.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(zd0.q0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                            case 14:
                                Scope scope5 = (Scope) obj2;
                                r3 r3Var3 = r3.f92907a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var3 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.u0((z70.b0) scope5.get((k23.d<?>) t0Var3.b(z70.b0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (z70.x) scope5.get((k23.d<?>) t0Var3.b(z70.x.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ub1.m) scope5.get((k23.d<?>) t0Var3.b(ub1.m.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (z70.z) scope5.get((k23.d<?>) t0Var3.b(z70.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ht.p) scope5.get((k23.d<?>) t0Var3.b(ht.p.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.f0) scope5.get((k23.d<?>) t0Var3.b(zd0.f0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (c22.k) scope5.get((k23.d<?>) t0Var3.b(c22.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.k0) scope5.get((k23.d<?>) t0Var3.b(zd0.k0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                r3 r3Var4 = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (zy0.n) ez0.b.a(ez0.b.f67468a, ez0.c.OMT, zy0.n.class, new c83.h.a[0], null, null, null, 120);
                            case 16:
                                Scope scope6 = (Scope) obj2;
                                r3 r3Var5 = r3.f92907a;
                                scope6.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (zd0.g0) scope6.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(zd0.f0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                            case 17:
                                r3 r3Var6 = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.b();
                            case 18:
                                Scope scope7 = (Scope) obj2;
                                r3 r3Var7 = r3.f92907a;
                                scope7.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z70.c0(new q3(scope7, 0), (z70.z) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(z70.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 19:
                                r3 r3Var8 = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zy0.d();
                            case 20:
                                Scope scope8 = (Scope) obj2;
                                r3 r3Var9 = r3.f92907a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z70.c(ModuleExtKt.androidContext(scope8));
                            case 21:
                                Scope scope9 = (Scope) obj2;
                                r3 r3Var10 = r3.f92907a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var4 = p005kotlin.jvm.internal.s0.f105811a;
                                return new z70.a((z70.y) scope9.get((k23.d<?>) t0Var4.b(z70.y.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zy0.o) scope9.get((k23.d<?>) t0Var4.b(zy0.o.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                Scope scope10 = (Scope) obj2;
                                r3 r3Var11 = r3.f92907a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z70.d(ModuleExtKt.androidContext(scope10), (c22.k) scope10.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(c22.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                Scope scope11 = (Scope) obj2;
                                r3 r3Var12 = r3.f92907a;
                                scope11.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (z70.a0) scope11.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(z70.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                            case 24:
                                s3 s3Var = s3.f92921a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ub1.d();
                            case 25:
                                s3 s3Var2 = s3.f92921a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ge0.e();
                            case 26:
                                Scope scope12 = (Scope) obj2;
                                s3 s3Var3 = s3.f92921a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var5 = p005kotlin.jvm.internal.s0.f105811a;
                                return new DashboardEssentialsConfigWatcher((he0.a) scope12.get((k23.d<?>) t0Var5.b(he0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.g1) scope12.get((k23.d<?>) t0Var5.b(zd0.g1.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 27:
                                Scope scope13 = (Scope) obj2;
                                s3 s3Var4 = s3.f92921a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new wb1.o((z70.a0) scope13.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(z70.a0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                u3 u3Var = u3.f92946a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ld0.a();
                            default:
                                u3 u3Var2 = u3.f92946a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (ol.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ol.a.class, new c83.h.a[0], null, null, null, 120);
                        }
                    }
                }, kind, j0Var), module4));
                break;
            case 4:
                Module module5 = (Module) obj;
                n3 n3Var = n3.f92858a;
                module5.getClass();
                e23.p pVar2 = new e23.p() { // from class: id0.l3
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i17) {
                            case 0:
                                m3 m3Var2 = m3.f92846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.b5();
                            case 1:
                                m3 m3Var3 = m3.f92846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (ka1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ka1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 2:
                                Scope scope = (Scope) obj2;
                                m3 m3Var4 = m3.f92846a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new oa1.c((ka1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ka1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                Scope scope2 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                m3 m3Var5 = m3.f92846a;
                                scope2.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var2 = p005kotlin.jvm.internal.s0.f105811a;
                                return new ra1.a((ma1.a) parametersHolder.elementAt(0, t0Var2.b(ma1.a.class)), (oa1.c) scope2.get((k23.d<?>) t0Var2.b(oa1.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                n3 n3Var2 = n3.f92858a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.d5();
                            case 5:
                                o3 o3Var = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.e5();
                            case 6:
                                o3 o3Var2 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.f5();
                            case 7:
                                o3 o3Var3 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new v6();
                            case 8:
                                o3 o3Var4 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f) ez0.b.a(ez0.b.f67468a, ez0.c.GC, com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f.class, new c83.h.a[0], null, null, null, 120);
                            case 9:
                                o3 o3Var5 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new y6();
                            case 10:
                                Scope scope3 = (Scope) obj2;
                                o3 o3Var6 = o3.f92872a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z6((com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f) scope3.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                p3 p3Var = p3.f92884a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.g5();
                            case 12:
                                r3 r3Var = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ht.b();
                            case 13:
                                Scope scope4 = (Scope) obj2;
                                r3 r3Var2 = r3.f92907a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (zd0.g1) scope4.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(zd0.q0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                            case 14:
                                Scope scope5 = (Scope) obj2;
                                r3 r3Var3 = r3.f92907a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var3 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.u0((z70.b0) scope5.get((k23.d<?>) t0Var3.b(z70.b0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (z70.x) scope5.get((k23.d<?>) t0Var3.b(z70.x.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ub1.m) scope5.get((k23.d<?>) t0Var3.b(ub1.m.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (z70.z) scope5.get((k23.d<?>) t0Var3.b(z70.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ht.p) scope5.get((k23.d<?>) t0Var3.b(ht.p.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.f0) scope5.get((k23.d<?>) t0Var3.b(zd0.f0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (c22.k) scope5.get((k23.d<?>) t0Var3.b(c22.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.k0) scope5.get((k23.d<?>) t0Var3.b(zd0.k0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                r3 r3Var4 = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (zy0.n) ez0.b.a(ez0.b.f67468a, ez0.c.OMT, zy0.n.class, new c83.h.a[0], null, null, null, 120);
                            case 16:
                                Scope scope6 = (Scope) obj2;
                                r3 r3Var5 = r3.f92907a;
                                scope6.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (zd0.g0) scope6.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(zd0.f0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                            case 17:
                                r3 r3Var6 = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.b();
                            case 18:
                                Scope scope7 = (Scope) obj2;
                                r3 r3Var7 = r3.f92907a;
                                scope7.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z70.c0(new q3(scope7, 0), (z70.z) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(z70.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 19:
                                r3 r3Var8 = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zy0.d();
                            case 20:
                                Scope scope8 = (Scope) obj2;
                                r3 r3Var9 = r3.f92907a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z70.c(ModuleExtKt.androidContext(scope8));
                            case 21:
                                Scope scope9 = (Scope) obj2;
                                r3 r3Var10 = r3.f92907a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var4 = p005kotlin.jvm.internal.s0.f105811a;
                                return new z70.a((z70.y) scope9.get((k23.d<?>) t0Var4.b(z70.y.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zy0.o) scope9.get((k23.d<?>) t0Var4.b(zy0.o.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                Scope scope10 = (Scope) obj2;
                                r3 r3Var11 = r3.f92907a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z70.d(ModuleExtKt.androidContext(scope10), (c22.k) scope10.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(c22.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                Scope scope11 = (Scope) obj2;
                                r3 r3Var12 = r3.f92907a;
                                scope11.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (z70.a0) scope11.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(z70.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                            case 24:
                                s3 s3Var = s3.f92921a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ub1.d();
                            case 25:
                                s3 s3Var2 = s3.f92921a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ge0.e();
                            case 26:
                                Scope scope12 = (Scope) obj2;
                                s3 s3Var3 = s3.f92921a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var5 = p005kotlin.jvm.internal.s0.f105811a;
                                return new DashboardEssentialsConfigWatcher((he0.a) scope12.get((k23.d<?>) t0Var5.b(he0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.g1) scope12.get((k23.d<?>) t0Var5.b(zd0.g1.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 27:
                                Scope scope13 = (Scope) obj2;
                                s3 s3Var4 = s3.f92921a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new wb1.o((z70.a0) scope13.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(z70.a0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                u3 u3Var = u3.f92946a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ld0.a();
                            default:
                                u3 u3Var2 = u3.f92946a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (ol.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ol.a.class, new c83.h.a[0], null, null, null, 120);
                        }
                    }
                };
                new KoinDefinition(module5, i3.e5.n(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), p005kotlin.jvm.internal.s0.f105811a.b(sa1.j.class), null, pVar2, Kind.Factory, p13.j0.f134944a), module5));
                break;
            case 5:
                Module module6 = (Module) obj;
                o3 o3Var = o3.f92872a;
                module6.getClass();
                e23.p pVar3 = new e23.p() { // from class: id0.l3
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i16) {
                            case 0:
                                m3 m3Var2 = m3.f92846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.b5();
                            case 1:
                                m3 m3Var3 = m3.f92846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (ka1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ka1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 2:
                                Scope scope = (Scope) obj2;
                                m3 m3Var4 = m3.f92846a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new oa1.c((ka1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ka1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                Scope scope2 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                m3 m3Var5 = m3.f92846a;
                                scope2.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var2 = p005kotlin.jvm.internal.s0.f105811a;
                                return new ra1.a((ma1.a) parametersHolder.elementAt(0, t0Var2.b(ma1.a.class)), (oa1.c) scope2.get((k23.d<?>) t0Var2.b(oa1.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                n3 n3Var2 = n3.f92858a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.d5();
                            case 5:
                                o3 o3Var2 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.e5();
                            case 6:
                                o3 o3Var3 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.f5();
                            case 7:
                                o3 o3Var4 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new v6();
                            case 8:
                                o3 o3Var5 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f) ez0.b.a(ez0.b.f67468a, ez0.c.GC, com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f.class, new c83.h.a[0], null, null, null, 120);
                            case 9:
                                o3 o3Var6 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new y6();
                            case 10:
                                Scope scope3 = (Scope) obj2;
                                o3 o3Var7 = o3.f92872a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z6((com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f) scope3.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                p3 p3Var = p3.f92884a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.g5();
                            case 12:
                                r3 r3Var = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ht.b();
                            case 13:
                                Scope scope4 = (Scope) obj2;
                                r3 r3Var2 = r3.f92907a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (zd0.g1) scope4.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(zd0.q0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                            case 14:
                                Scope scope5 = (Scope) obj2;
                                r3 r3Var3 = r3.f92907a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var3 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.u0((z70.b0) scope5.get((k23.d<?>) t0Var3.b(z70.b0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (z70.x) scope5.get((k23.d<?>) t0Var3.b(z70.x.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ub1.m) scope5.get((k23.d<?>) t0Var3.b(ub1.m.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (z70.z) scope5.get((k23.d<?>) t0Var3.b(z70.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ht.p) scope5.get((k23.d<?>) t0Var3.b(ht.p.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.f0) scope5.get((k23.d<?>) t0Var3.b(zd0.f0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (c22.k) scope5.get((k23.d<?>) t0Var3.b(c22.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.k0) scope5.get((k23.d<?>) t0Var3.b(zd0.k0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                r3 r3Var4 = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (zy0.n) ez0.b.a(ez0.b.f67468a, ez0.c.OMT, zy0.n.class, new c83.h.a[0], null, null, null, 120);
                            case 16:
                                Scope scope6 = (Scope) obj2;
                                r3 r3Var5 = r3.f92907a;
                                scope6.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (zd0.g0) scope6.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(zd0.f0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                            case 17:
                                r3 r3Var6 = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.b();
                            case 18:
                                Scope scope7 = (Scope) obj2;
                                r3 r3Var7 = r3.f92907a;
                                scope7.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z70.c0(new q3(scope7, 0), (z70.z) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(z70.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 19:
                                r3 r3Var8 = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zy0.d();
                            case 20:
                                Scope scope8 = (Scope) obj2;
                                r3 r3Var9 = r3.f92907a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z70.c(ModuleExtKt.androidContext(scope8));
                            case 21:
                                Scope scope9 = (Scope) obj2;
                                r3 r3Var10 = r3.f92907a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var4 = p005kotlin.jvm.internal.s0.f105811a;
                                return new z70.a((z70.y) scope9.get((k23.d<?>) t0Var4.b(z70.y.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zy0.o) scope9.get((k23.d<?>) t0Var4.b(zy0.o.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                Scope scope10 = (Scope) obj2;
                                r3 r3Var11 = r3.f92907a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z70.d(ModuleExtKt.androidContext(scope10), (c22.k) scope10.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(c22.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                Scope scope11 = (Scope) obj2;
                                r3 r3Var12 = r3.f92907a;
                                scope11.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (z70.a0) scope11.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(z70.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                            case 24:
                                s3 s3Var = s3.f92921a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ub1.d();
                            case 25:
                                s3 s3Var2 = s3.f92921a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ge0.e();
                            case 26:
                                Scope scope12 = (Scope) obj2;
                                s3 s3Var3 = s3.f92921a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var5 = p005kotlin.jvm.internal.s0.f105811a;
                                return new DashboardEssentialsConfigWatcher((he0.a) scope12.get((k23.d<?>) t0Var5.b(he0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.g1) scope12.get((k23.d<?>) t0Var5.b(zd0.g1.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 27:
                                Scope scope13 = (Scope) obj2;
                                s3 s3Var4 = s3.f92921a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new wb1.o((z70.a0) scope13.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(z70.a0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                u3 u3Var = u3.f92946a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ld0.a();
                            default:
                                u3 u3Var2 = u3.f92946a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (ol.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ol.a.class, new c83.h.a[0], null, null, null, 120);
                        }
                    }
                };
                ScopeRegistry.Companion companion2 = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier2 = companion2.getRootScopeQualifier();
                Kind kind2 = Kind.Factory;
                p13.j0 j0Var2 = p13.j0.f134944a;
                p005kotlin.jvm.internal.t0 t0Var2 = p005kotlin.jvm.internal.s0.f105811a;
                new KoinDefinition(module6, i3.e5.n(new BeanDefinition(rootScopeQualifier2, t0Var2.b(cb1.b.class), null, pVar3, kind2, j0Var2), module6));
                new KoinDefinition(module6, i3.e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(tb1.b.class), null, new e23.p() { // from class: id0.l3
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i15) {
                            case 0:
                                m3 m3Var2 = m3.f92846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.b5();
                            case 1:
                                m3 m3Var3 = m3.f92846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (ka1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ka1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 2:
                                Scope scope = (Scope) obj2;
                                m3 m3Var4 = m3.f92846a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new oa1.c((ka1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ka1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                Scope scope2 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                m3 m3Var5 = m3.f92846a;
                                scope2.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var3 = p005kotlin.jvm.internal.s0.f105811a;
                                return new ra1.a((ma1.a) parametersHolder.elementAt(0, t0Var3.b(ma1.a.class)), (oa1.c) scope2.get((k23.d<?>) t0Var3.b(oa1.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                n3 n3Var2 = n3.f92858a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.d5();
                            case 5:
                                o3 o3Var2 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.e5();
                            case 6:
                                o3 o3Var3 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.f5();
                            case 7:
                                o3 o3Var4 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new v6();
                            case 8:
                                o3 o3Var5 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f) ez0.b.a(ez0.b.f67468a, ez0.c.GC, com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f.class, new c83.h.a[0], null, null, null, 120);
                            case 9:
                                o3 o3Var6 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new y6();
                            case 10:
                                Scope scope3 = (Scope) obj2;
                                o3 o3Var7 = o3.f92872a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z6((com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f) scope3.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                p3 p3Var = p3.f92884a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.g5();
                            case 12:
                                r3 r3Var = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ht.b();
                            case 13:
                                Scope scope4 = (Scope) obj2;
                                r3 r3Var2 = r3.f92907a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (zd0.g1) scope4.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(zd0.q0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                            case 14:
                                Scope scope5 = (Scope) obj2;
                                r3 r3Var3 = r3.f92907a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var4 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.u0((z70.b0) scope5.get((k23.d<?>) t0Var4.b(z70.b0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (z70.x) scope5.get((k23.d<?>) t0Var4.b(z70.x.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ub1.m) scope5.get((k23.d<?>) t0Var4.b(ub1.m.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (z70.z) scope5.get((k23.d<?>) t0Var4.b(z70.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ht.p) scope5.get((k23.d<?>) t0Var4.b(ht.p.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.f0) scope5.get((k23.d<?>) t0Var4.b(zd0.f0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (c22.k) scope5.get((k23.d<?>) t0Var4.b(c22.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.k0) scope5.get((k23.d<?>) t0Var4.b(zd0.k0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                r3 r3Var4 = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (zy0.n) ez0.b.a(ez0.b.f67468a, ez0.c.OMT, zy0.n.class, new c83.h.a[0], null, null, null, 120);
                            case 16:
                                Scope scope6 = (Scope) obj2;
                                r3 r3Var5 = r3.f92907a;
                                scope6.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (zd0.g0) scope6.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(zd0.f0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                            case 17:
                                r3 r3Var6 = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.b();
                            case 18:
                                Scope scope7 = (Scope) obj2;
                                r3 r3Var7 = r3.f92907a;
                                scope7.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z70.c0(new q3(scope7, 0), (z70.z) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(z70.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 19:
                                r3 r3Var8 = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zy0.d();
                            case 20:
                                Scope scope8 = (Scope) obj2;
                                r3 r3Var9 = r3.f92907a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z70.c(ModuleExtKt.androidContext(scope8));
                            case 21:
                                Scope scope9 = (Scope) obj2;
                                r3 r3Var10 = r3.f92907a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var5 = p005kotlin.jvm.internal.s0.f105811a;
                                return new z70.a((z70.y) scope9.get((k23.d<?>) t0Var5.b(z70.y.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zy0.o) scope9.get((k23.d<?>) t0Var5.b(zy0.o.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                Scope scope10 = (Scope) obj2;
                                r3 r3Var11 = r3.f92907a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z70.d(ModuleExtKt.androidContext(scope10), (c22.k) scope10.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(c22.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                Scope scope11 = (Scope) obj2;
                                r3 r3Var12 = r3.f92907a;
                                scope11.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (z70.a0) scope11.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(z70.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                            case 24:
                                s3 s3Var = s3.f92921a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ub1.d();
                            case 25:
                                s3 s3Var2 = s3.f92921a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ge0.e();
                            case 26:
                                Scope scope12 = (Scope) obj2;
                                s3 s3Var3 = s3.f92921a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var6 = p005kotlin.jvm.internal.s0.f105811a;
                                return new DashboardEssentialsConfigWatcher((he0.a) scope12.get((k23.d<?>) t0Var6.b(he0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.g1) scope12.get((k23.d<?>) t0Var6.b(zd0.g1.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 27:
                                Scope scope13 = (Scope) obj2;
                                s3 s3Var4 = s3.f92921a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new wb1.o((z70.a0) scope13.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(z70.a0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                u3 u3Var = u3.f92946a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ld0.a();
                            default:
                                u3 u3Var2 = u3.f92946a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (ol.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ol.a.class, new c83.h.a[0], null, null, null, 120);
                        }
                    }
                }, kind2, j0Var2), module6));
                new KoinDefinition(module6, i3.e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(com.garmin.android.apps.connectmobile.dashboard.data.datasource.h2.class), null, new e23.p() { // from class: id0.l3
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i28) {
                            case 0:
                                m3 m3Var2 = m3.f92846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.b5();
                            case 1:
                                m3 m3Var3 = m3.f92846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (ka1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ka1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 2:
                                Scope scope = (Scope) obj2;
                                m3 m3Var4 = m3.f92846a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new oa1.c((ka1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ka1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                Scope scope2 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                m3 m3Var5 = m3.f92846a;
                                scope2.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var3 = p005kotlin.jvm.internal.s0.f105811a;
                                return new ra1.a((ma1.a) parametersHolder.elementAt(0, t0Var3.b(ma1.a.class)), (oa1.c) scope2.get((k23.d<?>) t0Var3.b(oa1.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                n3 n3Var2 = n3.f92858a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.d5();
                            case 5:
                                o3 o3Var2 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.e5();
                            case 6:
                                o3 o3Var3 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.f5();
                            case 7:
                                o3 o3Var4 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new v6();
                            case 8:
                                o3 o3Var5 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f) ez0.b.a(ez0.b.f67468a, ez0.c.GC, com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f.class, new c83.h.a[0], null, null, null, 120);
                            case 9:
                                o3 o3Var6 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new y6();
                            case 10:
                                Scope scope3 = (Scope) obj2;
                                o3 o3Var7 = o3.f92872a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z6((com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f) scope3.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                p3 p3Var = p3.f92884a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.g5();
                            case 12:
                                r3 r3Var = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ht.b();
                            case 13:
                                Scope scope4 = (Scope) obj2;
                                r3 r3Var2 = r3.f92907a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (zd0.g1) scope4.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(zd0.q0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                            case 14:
                                Scope scope5 = (Scope) obj2;
                                r3 r3Var3 = r3.f92907a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var4 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.u0((z70.b0) scope5.get((k23.d<?>) t0Var4.b(z70.b0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (z70.x) scope5.get((k23.d<?>) t0Var4.b(z70.x.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ub1.m) scope5.get((k23.d<?>) t0Var4.b(ub1.m.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (z70.z) scope5.get((k23.d<?>) t0Var4.b(z70.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ht.p) scope5.get((k23.d<?>) t0Var4.b(ht.p.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.f0) scope5.get((k23.d<?>) t0Var4.b(zd0.f0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (c22.k) scope5.get((k23.d<?>) t0Var4.b(c22.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.k0) scope5.get((k23.d<?>) t0Var4.b(zd0.k0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                r3 r3Var4 = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (zy0.n) ez0.b.a(ez0.b.f67468a, ez0.c.OMT, zy0.n.class, new c83.h.a[0], null, null, null, 120);
                            case 16:
                                Scope scope6 = (Scope) obj2;
                                r3 r3Var5 = r3.f92907a;
                                scope6.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (zd0.g0) scope6.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(zd0.f0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                            case 17:
                                r3 r3Var6 = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.b();
                            case 18:
                                Scope scope7 = (Scope) obj2;
                                r3 r3Var7 = r3.f92907a;
                                scope7.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z70.c0(new q3(scope7, 0), (z70.z) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(z70.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 19:
                                r3 r3Var8 = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zy0.d();
                            case 20:
                                Scope scope8 = (Scope) obj2;
                                r3 r3Var9 = r3.f92907a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z70.c(ModuleExtKt.androidContext(scope8));
                            case 21:
                                Scope scope9 = (Scope) obj2;
                                r3 r3Var10 = r3.f92907a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var5 = p005kotlin.jvm.internal.s0.f105811a;
                                return new z70.a((z70.y) scope9.get((k23.d<?>) t0Var5.b(z70.y.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zy0.o) scope9.get((k23.d<?>) t0Var5.b(zy0.o.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                Scope scope10 = (Scope) obj2;
                                r3 r3Var11 = r3.f92907a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z70.d(ModuleExtKt.androidContext(scope10), (c22.k) scope10.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(c22.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                Scope scope11 = (Scope) obj2;
                                r3 r3Var12 = r3.f92907a;
                                scope11.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (z70.a0) scope11.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(z70.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                            case 24:
                                s3 s3Var = s3.f92921a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ub1.d();
                            case 25:
                                s3 s3Var2 = s3.f92921a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ge0.e();
                            case 26:
                                Scope scope12 = (Scope) obj2;
                                s3 s3Var3 = s3.f92921a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var6 = p005kotlin.jvm.internal.s0.f105811a;
                                return new DashboardEssentialsConfigWatcher((he0.a) scope12.get((k23.d<?>) t0Var6.b(he0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.g1) scope12.get((k23.d<?>) t0Var6.b(zd0.g1.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 27:
                                Scope scope13 = (Scope) obj2;
                                s3 s3Var4 = s3.f92921a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new wb1.o((z70.a0) scope13.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(z70.a0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                u3 u3Var = u3.f92946a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ld0.a();
                            default:
                                u3 u3Var2 = u3.f92946a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (ol.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ol.a.class, new c83.h.a[0], null, null, null, 120);
                        }
                    }
                }, kind2, j0Var2), module6));
                new KoinDefinition(module6, i3.e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f.class), null, new e23.p() { // from class: id0.l3
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i14) {
                            case 0:
                                m3 m3Var2 = m3.f92846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.b5();
                            case 1:
                                m3 m3Var3 = m3.f92846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (ka1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ka1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 2:
                                Scope scope = (Scope) obj2;
                                m3 m3Var4 = m3.f92846a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new oa1.c((ka1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ka1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                Scope scope2 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                m3 m3Var5 = m3.f92846a;
                                scope2.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var3 = p005kotlin.jvm.internal.s0.f105811a;
                                return new ra1.a((ma1.a) parametersHolder.elementAt(0, t0Var3.b(ma1.a.class)), (oa1.c) scope2.get((k23.d<?>) t0Var3.b(oa1.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                n3 n3Var2 = n3.f92858a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.d5();
                            case 5:
                                o3 o3Var2 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.e5();
                            case 6:
                                o3 o3Var3 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.f5();
                            case 7:
                                o3 o3Var4 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new v6();
                            case 8:
                                o3 o3Var5 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f) ez0.b.a(ez0.b.f67468a, ez0.c.GC, com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f.class, new c83.h.a[0], null, null, null, 120);
                            case 9:
                                o3 o3Var6 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new y6();
                            case 10:
                                Scope scope3 = (Scope) obj2;
                                o3 o3Var7 = o3.f92872a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z6((com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f) scope3.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                p3 p3Var = p3.f92884a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.g5();
                            case 12:
                                r3 r3Var = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ht.b();
                            case 13:
                                Scope scope4 = (Scope) obj2;
                                r3 r3Var2 = r3.f92907a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (zd0.g1) scope4.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(zd0.q0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                            case 14:
                                Scope scope5 = (Scope) obj2;
                                r3 r3Var3 = r3.f92907a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var4 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.u0((z70.b0) scope5.get((k23.d<?>) t0Var4.b(z70.b0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (z70.x) scope5.get((k23.d<?>) t0Var4.b(z70.x.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ub1.m) scope5.get((k23.d<?>) t0Var4.b(ub1.m.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (z70.z) scope5.get((k23.d<?>) t0Var4.b(z70.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ht.p) scope5.get((k23.d<?>) t0Var4.b(ht.p.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.f0) scope5.get((k23.d<?>) t0Var4.b(zd0.f0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (c22.k) scope5.get((k23.d<?>) t0Var4.b(c22.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.k0) scope5.get((k23.d<?>) t0Var4.b(zd0.k0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                r3 r3Var4 = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (zy0.n) ez0.b.a(ez0.b.f67468a, ez0.c.OMT, zy0.n.class, new c83.h.a[0], null, null, null, 120);
                            case 16:
                                Scope scope6 = (Scope) obj2;
                                r3 r3Var5 = r3.f92907a;
                                scope6.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (zd0.g0) scope6.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(zd0.f0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                            case 17:
                                r3 r3Var6 = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.b();
                            case 18:
                                Scope scope7 = (Scope) obj2;
                                r3 r3Var7 = r3.f92907a;
                                scope7.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z70.c0(new q3(scope7, 0), (z70.z) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(z70.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 19:
                                r3 r3Var8 = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zy0.d();
                            case 20:
                                Scope scope8 = (Scope) obj2;
                                r3 r3Var9 = r3.f92907a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z70.c(ModuleExtKt.androidContext(scope8));
                            case 21:
                                Scope scope9 = (Scope) obj2;
                                r3 r3Var10 = r3.f92907a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var5 = p005kotlin.jvm.internal.s0.f105811a;
                                return new z70.a((z70.y) scope9.get((k23.d<?>) t0Var5.b(z70.y.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zy0.o) scope9.get((k23.d<?>) t0Var5.b(zy0.o.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                Scope scope10 = (Scope) obj2;
                                r3 r3Var11 = r3.f92907a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z70.d(ModuleExtKt.androidContext(scope10), (c22.k) scope10.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(c22.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                Scope scope11 = (Scope) obj2;
                                r3 r3Var12 = r3.f92907a;
                                scope11.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (z70.a0) scope11.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(z70.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                            case 24:
                                s3 s3Var = s3.f92921a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ub1.d();
                            case 25:
                                s3 s3Var2 = s3.f92921a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ge0.e();
                            case 26:
                                Scope scope12 = (Scope) obj2;
                                s3 s3Var3 = s3.f92921a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var6 = p005kotlin.jvm.internal.s0.f105811a;
                                return new DashboardEssentialsConfigWatcher((he0.a) scope12.get((k23.d<?>) t0Var6.b(he0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.g1) scope12.get((k23.d<?>) t0Var6.b(zd0.g1.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 27:
                                Scope scope13 = (Scope) obj2;
                                s3 s3Var4 = s3.f92921a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new wb1.o((z70.a0) scope13.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(z70.a0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                u3 u3Var = u3.f92946a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ld0.a();
                            default:
                                u3 u3Var2 = u3.f92946a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (ol.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ol.a.class, new c83.h.a[0], null, null, null, 120);
                        }
                    }
                }, kind2, j0Var2), module6));
                final int i29 = 9;
                new KoinDefinition(module6, i3.e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(com.garmin.android.apps.connectmobile.dashboard.data.datasource.k2.class), QualifierKt.named(com.garmin.android.apps.connectmobile.dashboard.data.datasource.j2.CACHE.f33246a), new e23.p() { // from class: id0.l3
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i29) {
                            case 0:
                                m3 m3Var2 = m3.f92846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.b5();
                            case 1:
                                m3 m3Var3 = m3.f92846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (ka1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ka1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 2:
                                Scope scope = (Scope) obj2;
                                m3 m3Var4 = m3.f92846a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new oa1.c((ka1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ka1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                Scope scope2 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                m3 m3Var5 = m3.f92846a;
                                scope2.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var3 = p005kotlin.jvm.internal.s0.f105811a;
                                return new ra1.a((ma1.a) parametersHolder.elementAt(0, t0Var3.b(ma1.a.class)), (oa1.c) scope2.get((k23.d<?>) t0Var3.b(oa1.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                n3 n3Var2 = n3.f92858a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.d5();
                            case 5:
                                o3 o3Var2 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.e5();
                            case 6:
                                o3 o3Var3 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.f5();
                            case 7:
                                o3 o3Var4 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new v6();
                            case 8:
                                o3 o3Var5 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f) ez0.b.a(ez0.b.f67468a, ez0.c.GC, com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f.class, new c83.h.a[0], null, null, null, 120);
                            case 9:
                                o3 o3Var6 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new y6();
                            case 10:
                                Scope scope3 = (Scope) obj2;
                                o3 o3Var7 = o3.f92872a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z6((com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f) scope3.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                p3 p3Var = p3.f92884a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.g5();
                            case 12:
                                r3 r3Var = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ht.b();
                            case 13:
                                Scope scope4 = (Scope) obj2;
                                r3 r3Var2 = r3.f92907a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (zd0.g1) scope4.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(zd0.q0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                            case 14:
                                Scope scope5 = (Scope) obj2;
                                r3 r3Var3 = r3.f92907a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var4 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.u0((z70.b0) scope5.get((k23.d<?>) t0Var4.b(z70.b0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (z70.x) scope5.get((k23.d<?>) t0Var4.b(z70.x.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ub1.m) scope5.get((k23.d<?>) t0Var4.b(ub1.m.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (z70.z) scope5.get((k23.d<?>) t0Var4.b(z70.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ht.p) scope5.get((k23.d<?>) t0Var4.b(ht.p.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.f0) scope5.get((k23.d<?>) t0Var4.b(zd0.f0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (c22.k) scope5.get((k23.d<?>) t0Var4.b(c22.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.k0) scope5.get((k23.d<?>) t0Var4.b(zd0.k0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                r3 r3Var4 = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (zy0.n) ez0.b.a(ez0.b.f67468a, ez0.c.OMT, zy0.n.class, new c83.h.a[0], null, null, null, 120);
                            case 16:
                                Scope scope6 = (Scope) obj2;
                                r3 r3Var5 = r3.f92907a;
                                scope6.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (zd0.g0) scope6.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(zd0.f0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                            case 17:
                                r3 r3Var6 = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.b();
                            case 18:
                                Scope scope7 = (Scope) obj2;
                                r3 r3Var7 = r3.f92907a;
                                scope7.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z70.c0(new q3(scope7, 0), (z70.z) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(z70.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 19:
                                r3 r3Var8 = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zy0.d();
                            case 20:
                                Scope scope8 = (Scope) obj2;
                                r3 r3Var9 = r3.f92907a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z70.c(ModuleExtKt.androidContext(scope8));
                            case 21:
                                Scope scope9 = (Scope) obj2;
                                r3 r3Var10 = r3.f92907a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var5 = p005kotlin.jvm.internal.s0.f105811a;
                                return new z70.a((z70.y) scope9.get((k23.d<?>) t0Var5.b(z70.y.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zy0.o) scope9.get((k23.d<?>) t0Var5.b(zy0.o.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                Scope scope10 = (Scope) obj2;
                                r3 r3Var11 = r3.f92907a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z70.d(ModuleExtKt.androidContext(scope10), (c22.k) scope10.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(c22.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                Scope scope11 = (Scope) obj2;
                                r3 r3Var12 = r3.f92907a;
                                scope11.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (z70.a0) scope11.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(z70.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                            case 24:
                                s3 s3Var = s3.f92921a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ub1.d();
                            case 25:
                                s3 s3Var2 = s3.f92921a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ge0.e();
                            case 26:
                                Scope scope12 = (Scope) obj2;
                                s3 s3Var3 = s3.f92921a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var6 = p005kotlin.jvm.internal.s0.f105811a;
                                return new DashboardEssentialsConfigWatcher((he0.a) scope12.get((k23.d<?>) t0Var6.b(he0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.g1) scope12.get((k23.d<?>) t0Var6.b(zd0.g1.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 27:
                                Scope scope13 = (Scope) obj2;
                                s3 s3Var4 = s3.f92921a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new wb1.o((z70.a0) scope13.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(z70.a0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                u3 u3Var = u3.f92946a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ld0.a();
                            default:
                                u3 u3Var2 = u3.f92946a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (ol.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ol.a.class, new c83.h.a[0], null, null, null, 120);
                        }
                    }
                }, kind2, j0Var2), module6));
                final int i30 = 10;
                new KoinDefinition(module6, i3.e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(com.garmin.android.apps.connectmobile.dashboard.data.datasource.k2.class), QualifierKt.named(com.garmin.android.apps.connectmobile.dashboard.data.datasource.j2.SERVER.f33246a), new e23.p() { // from class: id0.l3
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i30) {
                            case 0:
                                m3 m3Var2 = m3.f92846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.b5();
                            case 1:
                                m3 m3Var3 = m3.f92846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (ka1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ka1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 2:
                                Scope scope = (Scope) obj2;
                                m3 m3Var4 = m3.f92846a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new oa1.c((ka1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ka1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                Scope scope2 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                m3 m3Var5 = m3.f92846a;
                                scope2.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var3 = p005kotlin.jvm.internal.s0.f105811a;
                                return new ra1.a((ma1.a) parametersHolder.elementAt(0, t0Var3.b(ma1.a.class)), (oa1.c) scope2.get((k23.d<?>) t0Var3.b(oa1.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                n3 n3Var2 = n3.f92858a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.d5();
                            case 5:
                                o3 o3Var2 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.e5();
                            case 6:
                                o3 o3Var3 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.f5();
                            case 7:
                                o3 o3Var4 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new v6();
                            case 8:
                                o3 o3Var5 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f) ez0.b.a(ez0.b.f67468a, ez0.c.GC, com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f.class, new c83.h.a[0], null, null, null, 120);
                            case 9:
                                o3 o3Var6 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new y6();
                            case 10:
                                Scope scope3 = (Scope) obj2;
                                o3 o3Var7 = o3.f92872a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z6((com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f) scope3.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                p3 p3Var = p3.f92884a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.g5();
                            case 12:
                                r3 r3Var = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ht.b();
                            case 13:
                                Scope scope4 = (Scope) obj2;
                                r3 r3Var2 = r3.f92907a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (zd0.g1) scope4.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(zd0.q0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                            case 14:
                                Scope scope5 = (Scope) obj2;
                                r3 r3Var3 = r3.f92907a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var4 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.u0((z70.b0) scope5.get((k23.d<?>) t0Var4.b(z70.b0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (z70.x) scope5.get((k23.d<?>) t0Var4.b(z70.x.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ub1.m) scope5.get((k23.d<?>) t0Var4.b(ub1.m.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (z70.z) scope5.get((k23.d<?>) t0Var4.b(z70.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ht.p) scope5.get((k23.d<?>) t0Var4.b(ht.p.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.f0) scope5.get((k23.d<?>) t0Var4.b(zd0.f0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (c22.k) scope5.get((k23.d<?>) t0Var4.b(c22.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.k0) scope5.get((k23.d<?>) t0Var4.b(zd0.k0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                r3 r3Var4 = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (zy0.n) ez0.b.a(ez0.b.f67468a, ez0.c.OMT, zy0.n.class, new c83.h.a[0], null, null, null, 120);
                            case 16:
                                Scope scope6 = (Scope) obj2;
                                r3 r3Var5 = r3.f92907a;
                                scope6.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (zd0.g0) scope6.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(zd0.f0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                            case 17:
                                r3 r3Var6 = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.b();
                            case 18:
                                Scope scope7 = (Scope) obj2;
                                r3 r3Var7 = r3.f92907a;
                                scope7.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z70.c0(new q3(scope7, 0), (z70.z) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(z70.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 19:
                                r3 r3Var8 = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zy0.d();
                            case 20:
                                Scope scope8 = (Scope) obj2;
                                r3 r3Var9 = r3.f92907a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z70.c(ModuleExtKt.androidContext(scope8));
                            case 21:
                                Scope scope9 = (Scope) obj2;
                                r3 r3Var10 = r3.f92907a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var5 = p005kotlin.jvm.internal.s0.f105811a;
                                return new z70.a((z70.y) scope9.get((k23.d<?>) t0Var5.b(z70.y.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zy0.o) scope9.get((k23.d<?>) t0Var5.b(zy0.o.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                Scope scope10 = (Scope) obj2;
                                r3 r3Var11 = r3.f92907a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z70.d(ModuleExtKt.androidContext(scope10), (c22.k) scope10.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(c22.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                Scope scope11 = (Scope) obj2;
                                r3 r3Var12 = r3.f92907a;
                                scope11.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (z70.a0) scope11.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(z70.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                            case 24:
                                s3 s3Var = s3.f92921a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ub1.d();
                            case 25:
                                s3 s3Var2 = s3.f92921a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ge0.e();
                            case 26:
                                Scope scope12 = (Scope) obj2;
                                s3 s3Var3 = s3.f92921a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var6 = p005kotlin.jvm.internal.s0.f105811a;
                                return new DashboardEssentialsConfigWatcher((he0.a) scope12.get((k23.d<?>) t0Var6.b(he0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.g1) scope12.get((k23.d<?>) t0Var6.b(zd0.g1.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 27:
                                Scope scope13 = (Scope) obj2;
                                s3 s3Var4 = s3.f92921a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new wb1.o((z70.a0) scope13.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(z70.a0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                u3 u3Var = u3.f92946a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ld0.a();
                            default:
                                u3 u3Var2 = u3.f92946a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (ol.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ol.a.class, new c83.h.a[0], null, null, null, 120);
                        }
                    }
                }, kind2, j0Var2), module6));
                break;
            case 6:
                Module module7 = (Module) obj;
                p3 p3Var = p3.f92884a;
                module7.getClass();
                final int i34 = 11;
                e23.p pVar4 = new e23.p() { // from class: id0.l3
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i34) {
                            case 0:
                                m3 m3Var2 = m3.f92846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.b5();
                            case 1:
                                m3 m3Var3 = m3.f92846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (ka1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ka1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 2:
                                Scope scope = (Scope) obj2;
                                m3 m3Var4 = m3.f92846a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new oa1.c((ka1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ka1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                Scope scope2 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                m3 m3Var5 = m3.f92846a;
                                scope2.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var3 = p005kotlin.jvm.internal.s0.f105811a;
                                return new ra1.a((ma1.a) parametersHolder.elementAt(0, t0Var3.b(ma1.a.class)), (oa1.c) scope2.get((k23.d<?>) t0Var3.b(oa1.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                n3 n3Var2 = n3.f92858a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.d5();
                            case 5:
                                o3 o3Var2 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.e5();
                            case 6:
                                o3 o3Var3 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.f5();
                            case 7:
                                o3 o3Var4 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new v6();
                            case 8:
                                o3 o3Var5 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f) ez0.b.a(ez0.b.f67468a, ez0.c.GC, com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f.class, new c83.h.a[0], null, null, null, 120);
                            case 9:
                                o3 o3Var6 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new y6();
                            case 10:
                                Scope scope3 = (Scope) obj2;
                                o3 o3Var7 = o3.f92872a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z6((com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f) scope3.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                p3 p3Var2 = p3.f92884a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.g5();
                            case 12:
                                r3 r3Var = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ht.b();
                            case 13:
                                Scope scope4 = (Scope) obj2;
                                r3 r3Var2 = r3.f92907a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (zd0.g1) scope4.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(zd0.q0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                            case 14:
                                Scope scope5 = (Scope) obj2;
                                r3 r3Var3 = r3.f92907a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var4 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.u0((z70.b0) scope5.get((k23.d<?>) t0Var4.b(z70.b0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (z70.x) scope5.get((k23.d<?>) t0Var4.b(z70.x.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ub1.m) scope5.get((k23.d<?>) t0Var4.b(ub1.m.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (z70.z) scope5.get((k23.d<?>) t0Var4.b(z70.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ht.p) scope5.get((k23.d<?>) t0Var4.b(ht.p.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.f0) scope5.get((k23.d<?>) t0Var4.b(zd0.f0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (c22.k) scope5.get((k23.d<?>) t0Var4.b(c22.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.k0) scope5.get((k23.d<?>) t0Var4.b(zd0.k0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                r3 r3Var4 = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (zy0.n) ez0.b.a(ez0.b.f67468a, ez0.c.OMT, zy0.n.class, new c83.h.a[0], null, null, null, 120);
                            case 16:
                                Scope scope6 = (Scope) obj2;
                                r3 r3Var5 = r3.f92907a;
                                scope6.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (zd0.g0) scope6.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(zd0.f0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                            case 17:
                                r3 r3Var6 = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.b();
                            case 18:
                                Scope scope7 = (Scope) obj2;
                                r3 r3Var7 = r3.f92907a;
                                scope7.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z70.c0(new q3(scope7, 0), (z70.z) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(z70.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 19:
                                r3 r3Var8 = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zy0.d();
                            case 20:
                                Scope scope8 = (Scope) obj2;
                                r3 r3Var9 = r3.f92907a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z70.c(ModuleExtKt.androidContext(scope8));
                            case 21:
                                Scope scope9 = (Scope) obj2;
                                r3 r3Var10 = r3.f92907a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var5 = p005kotlin.jvm.internal.s0.f105811a;
                                return new z70.a((z70.y) scope9.get((k23.d<?>) t0Var5.b(z70.y.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zy0.o) scope9.get((k23.d<?>) t0Var5.b(zy0.o.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                Scope scope10 = (Scope) obj2;
                                r3 r3Var11 = r3.f92907a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z70.d(ModuleExtKt.androidContext(scope10), (c22.k) scope10.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(c22.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                Scope scope11 = (Scope) obj2;
                                r3 r3Var12 = r3.f92907a;
                                scope11.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (z70.a0) scope11.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(z70.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                            case 24:
                                s3 s3Var = s3.f92921a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ub1.d();
                            case 25:
                                s3 s3Var2 = s3.f92921a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ge0.e();
                            case 26:
                                Scope scope12 = (Scope) obj2;
                                s3 s3Var3 = s3.f92921a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var6 = p005kotlin.jvm.internal.s0.f105811a;
                                return new DashboardEssentialsConfigWatcher((he0.a) scope12.get((k23.d<?>) t0Var6.b(he0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.g1) scope12.get((k23.d<?>) t0Var6.b(zd0.g1.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 27:
                                Scope scope13 = (Scope) obj2;
                                s3 s3Var4 = s3.f92921a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new wb1.o((z70.a0) scope13.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(z70.a0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                u3 u3Var = u3.f92946a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ld0.a();
                            default:
                                u3 u3Var2 = u3.f92946a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (ol.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ol.a.class, new c83.h.a[0], null, null, null, 120);
                        }
                    }
                };
                new KoinDefinition(module7, i3.e5.n(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), p005kotlin.jvm.internal.s0.f105811a.b(m12.r.class), null, pVar4, Kind.Factory, p13.j0.f134944a), module7));
                break;
            case 7:
                Module module8 = (Module) obj;
                r3 r3Var = r3.f92907a;
                module8.getClass();
                final int i35 = 15;
                e23.p pVar5 = new e23.p() { // from class: id0.l3
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i35) {
                            case 0:
                                m3 m3Var2 = m3.f92846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.b5();
                            case 1:
                                m3 m3Var3 = m3.f92846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (ka1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ka1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 2:
                                Scope scope = (Scope) obj2;
                                m3 m3Var4 = m3.f92846a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new oa1.c((ka1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ka1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                Scope scope2 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                m3 m3Var5 = m3.f92846a;
                                scope2.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var3 = p005kotlin.jvm.internal.s0.f105811a;
                                return new ra1.a((ma1.a) parametersHolder.elementAt(0, t0Var3.b(ma1.a.class)), (oa1.c) scope2.get((k23.d<?>) t0Var3.b(oa1.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                n3 n3Var2 = n3.f92858a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.d5();
                            case 5:
                                o3 o3Var2 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.e5();
                            case 6:
                                o3 o3Var3 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.f5();
                            case 7:
                                o3 o3Var4 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new v6();
                            case 8:
                                o3 o3Var5 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f) ez0.b.a(ez0.b.f67468a, ez0.c.GC, com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f.class, new c83.h.a[0], null, null, null, 120);
                            case 9:
                                o3 o3Var6 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new y6();
                            case 10:
                                Scope scope3 = (Scope) obj2;
                                o3 o3Var7 = o3.f92872a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z6((com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f) scope3.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                p3 p3Var2 = p3.f92884a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.g5();
                            case 12:
                                r3 r3Var2 = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ht.b();
                            case 13:
                                Scope scope4 = (Scope) obj2;
                                r3 r3Var3 = r3.f92907a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (zd0.g1) scope4.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(zd0.q0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                            case 14:
                                Scope scope5 = (Scope) obj2;
                                r3 r3Var4 = r3.f92907a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var4 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.u0((z70.b0) scope5.get((k23.d<?>) t0Var4.b(z70.b0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (z70.x) scope5.get((k23.d<?>) t0Var4.b(z70.x.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ub1.m) scope5.get((k23.d<?>) t0Var4.b(ub1.m.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (z70.z) scope5.get((k23.d<?>) t0Var4.b(z70.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ht.p) scope5.get((k23.d<?>) t0Var4.b(ht.p.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.f0) scope5.get((k23.d<?>) t0Var4.b(zd0.f0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (c22.k) scope5.get((k23.d<?>) t0Var4.b(c22.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.k0) scope5.get((k23.d<?>) t0Var4.b(zd0.k0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                r3 r3Var5 = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (zy0.n) ez0.b.a(ez0.b.f67468a, ez0.c.OMT, zy0.n.class, new c83.h.a[0], null, null, null, 120);
                            case 16:
                                Scope scope6 = (Scope) obj2;
                                r3 r3Var6 = r3.f92907a;
                                scope6.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (zd0.g0) scope6.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(zd0.f0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                            case 17:
                                r3 r3Var7 = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.b();
                            case 18:
                                Scope scope7 = (Scope) obj2;
                                r3 r3Var8 = r3.f92907a;
                                scope7.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z70.c0(new q3(scope7, 0), (z70.z) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(z70.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 19:
                                r3 r3Var9 = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zy0.d();
                            case 20:
                                Scope scope8 = (Scope) obj2;
                                r3 r3Var10 = r3.f92907a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z70.c(ModuleExtKt.androidContext(scope8));
                            case 21:
                                Scope scope9 = (Scope) obj2;
                                r3 r3Var11 = r3.f92907a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var5 = p005kotlin.jvm.internal.s0.f105811a;
                                return new z70.a((z70.y) scope9.get((k23.d<?>) t0Var5.b(z70.y.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zy0.o) scope9.get((k23.d<?>) t0Var5.b(zy0.o.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                Scope scope10 = (Scope) obj2;
                                r3 r3Var12 = r3.f92907a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z70.d(ModuleExtKt.androidContext(scope10), (c22.k) scope10.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(c22.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                Scope scope11 = (Scope) obj2;
                                r3 r3Var13 = r3.f92907a;
                                scope11.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (z70.a0) scope11.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(z70.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                            case 24:
                                s3 s3Var = s3.f92921a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ub1.d();
                            case 25:
                                s3 s3Var2 = s3.f92921a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ge0.e();
                            case 26:
                                Scope scope12 = (Scope) obj2;
                                s3 s3Var3 = s3.f92921a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var6 = p005kotlin.jvm.internal.s0.f105811a;
                                return new DashboardEssentialsConfigWatcher((he0.a) scope12.get((k23.d<?>) t0Var6.b(he0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.g1) scope12.get((k23.d<?>) t0Var6.b(zd0.g1.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 27:
                                Scope scope13 = (Scope) obj2;
                                s3 s3Var4 = s3.f92921a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new wb1.o((z70.a0) scope13.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(z70.a0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                u3 u3Var = u3.f92946a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ld0.a();
                            default:
                                u3 u3Var2 = u3.f92946a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (ol.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ol.a.class, new c83.h.a[0], null, null, null, 120);
                        }
                    }
                };
                ScopeRegistry.Companion companion3 = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier3 = companion3.getRootScopeQualifier();
                Kind kind3 = Kind.Factory;
                p13.j0 j0Var3 = p13.j0.f134944a;
                p005kotlin.jvm.internal.t0 t0Var3 = p005kotlin.jvm.internal.s0.f105811a;
                new KoinDefinition(module8, i3.e5.n(new BeanDefinition(rootScopeQualifier3, t0Var3.b(zy0.n.class), null, pVar5, kind3, j0Var3), module8));
                final int i36 = 18;
                e23.p pVar6 = new e23.p() { // from class: id0.l3
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i36) {
                            case 0:
                                m3 m3Var2 = m3.f92846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.b5();
                            case 1:
                                m3 m3Var3 = m3.f92846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (ka1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ka1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 2:
                                Scope scope = (Scope) obj2;
                                m3 m3Var4 = m3.f92846a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new oa1.c((ka1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ka1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                Scope scope2 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                m3 m3Var5 = m3.f92846a;
                                scope2.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var4 = p005kotlin.jvm.internal.s0.f105811a;
                                return new ra1.a((ma1.a) parametersHolder.elementAt(0, t0Var4.b(ma1.a.class)), (oa1.c) scope2.get((k23.d<?>) t0Var4.b(oa1.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                n3 n3Var2 = n3.f92858a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.d5();
                            case 5:
                                o3 o3Var2 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.e5();
                            case 6:
                                o3 o3Var3 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.f5();
                            case 7:
                                o3 o3Var4 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new v6();
                            case 8:
                                o3 o3Var5 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f) ez0.b.a(ez0.b.f67468a, ez0.c.GC, com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f.class, new c83.h.a[0], null, null, null, 120);
                            case 9:
                                o3 o3Var6 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new y6();
                            case 10:
                                Scope scope3 = (Scope) obj2;
                                o3 o3Var7 = o3.f92872a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z6((com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f) scope3.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                p3 p3Var2 = p3.f92884a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.g5();
                            case 12:
                                r3 r3Var2 = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ht.b();
                            case 13:
                                Scope scope4 = (Scope) obj2;
                                r3 r3Var3 = r3.f92907a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (zd0.g1) scope4.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(zd0.q0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                            case 14:
                                Scope scope5 = (Scope) obj2;
                                r3 r3Var4 = r3.f92907a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var5 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.u0((z70.b0) scope5.get((k23.d<?>) t0Var5.b(z70.b0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (z70.x) scope5.get((k23.d<?>) t0Var5.b(z70.x.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ub1.m) scope5.get((k23.d<?>) t0Var5.b(ub1.m.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (z70.z) scope5.get((k23.d<?>) t0Var5.b(z70.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ht.p) scope5.get((k23.d<?>) t0Var5.b(ht.p.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.f0) scope5.get((k23.d<?>) t0Var5.b(zd0.f0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (c22.k) scope5.get((k23.d<?>) t0Var5.b(c22.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.k0) scope5.get((k23.d<?>) t0Var5.b(zd0.k0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                r3 r3Var5 = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (zy0.n) ez0.b.a(ez0.b.f67468a, ez0.c.OMT, zy0.n.class, new c83.h.a[0], null, null, null, 120);
                            case 16:
                                Scope scope6 = (Scope) obj2;
                                r3 r3Var6 = r3.f92907a;
                                scope6.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (zd0.g0) scope6.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(zd0.f0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                            case 17:
                                r3 r3Var7 = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.b();
                            case 18:
                                Scope scope7 = (Scope) obj2;
                                r3 r3Var8 = r3.f92907a;
                                scope7.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z70.c0(new q3(scope7, 0), (z70.z) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(z70.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 19:
                                r3 r3Var9 = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zy0.d();
                            case 20:
                                Scope scope8 = (Scope) obj2;
                                r3 r3Var10 = r3.f92907a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z70.c(ModuleExtKt.androidContext(scope8));
                            case 21:
                                Scope scope9 = (Scope) obj2;
                                r3 r3Var11 = r3.f92907a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var6 = p005kotlin.jvm.internal.s0.f105811a;
                                return new z70.a((z70.y) scope9.get((k23.d<?>) t0Var6.b(z70.y.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zy0.o) scope9.get((k23.d<?>) t0Var6.b(zy0.o.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                Scope scope10 = (Scope) obj2;
                                r3 r3Var12 = r3.f92907a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z70.d(ModuleExtKt.androidContext(scope10), (c22.k) scope10.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(c22.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                Scope scope11 = (Scope) obj2;
                                r3 r3Var13 = r3.f92907a;
                                scope11.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (z70.a0) scope11.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(z70.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                            case 24:
                                s3 s3Var = s3.f92921a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ub1.d();
                            case 25:
                                s3 s3Var2 = s3.f92921a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ge0.e();
                            case 26:
                                Scope scope12 = (Scope) obj2;
                                s3 s3Var3 = s3.f92921a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var7 = p005kotlin.jvm.internal.s0.f105811a;
                                return new DashboardEssentialsConfigWatcher((he0.a) scope12.get((k23.d<?>) t0Var7.b(he0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.g1) scope12.get((k23.d<?>) t0Var7.b(zd0.g1.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 27:
                                Scope scope13 = (Scope) obj2;
                                s3 s3Var4 = s3.f92921a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new wb1.o((z70.a0) scope13.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(z70.a0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                u3 u3Var = u3.f92946a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ld0.a();
                            default:
                                u3 u3Var2 = u3.f92946a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (ol.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ol.a.class, new c83.h.a[0], null, null, null, 120);
                        }
                    }
                };
                StringQualifier rootScopeQualifier4 = companion3.getRootScopeQualifier();
                Kind kind4 = Kind.Singleton;
                SingleInstanceFactory<?> singleInstanceFactoryP = lc.u0.p(new BeanDefinition(rootScopeQualifier4, t0Var3.b(z70.b0.class), null, pVar6, kind4, j0Var3), module8);
                if (module8.get_createdAtStart()) {
                    module8.prepareForCreationAtStart(singleInstanceFactoryP);
                }
                new KoinDefinition(module8, singleInstanceFactoryP);
                final int i37 = 19;
                new KoinDefinition(module8, i3.e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(zy0.o.class), null, new e23.p() { // from class: id0.l3
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i37) {
                            case 0:
                                m3 m3Var2 = m3.f92846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.b5();
                            case 1:
                                m3 m3Var3 = m3.f92846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (ka1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ka1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 2:
                                Scope scope = (Scope) obj2;
                                m3 m3Var4 = m3.f92846a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new oa1.c((ka1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ka1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                Scope scope2 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                m3 m3Var5 = m3.f92846a;
                                scope2.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var4 = p005kotlin.jvm.internal.s0.f105811a;
                                return new ra1.a((ma1.a) parametersHolder.elementAt(0, t0Var4.b(ma1.a.class)), (oa1.c) scope2.get((k23.d<?>) t0Var4.b(oa1.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                n3 n3Var2 = n3.f92858a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.d5();
                            case 5:
                                o3 o3Var2 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.e5();
                            case 6:
                                o3 o3Var3 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.f5();
                            case 7:
                                o3 o3Var4 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new v6();
                            case 8:
                                o3 o3Var5 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f) ez0.b.a(ez0.b.f67468a, ez0.c.GC, com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f.class, new c83.h.a[0], null, null, null, 120);
                            case 9:
                                o3 o3Var6 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new y6();
                            case 10:
                                Scope scope3 = (Scope) obj2;
                                o3 o3Var7 = o3.f92872a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z6((com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f) scope3.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                p3 p3Var2 = p3.f92884a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.g5();
                            case 12:
                                r3 r3Var2 = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ht.b();
                            case 13:
                                Scope scope4 = (Scope) obj2;
                                r3 r3Var3 = r3.f92907a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (zd0.g1) scope4.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(zd0.q0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                            case 14:
                                Scope scope5 = (Scope) obj2;
                                r3 r3Var4 = r3.f92907a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var5 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.u0((z70.b0) scope5.get((k23.d<?>) t0Var5.b(z70.b0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (z70.x) scope5.get((k23.d<?>) t0Var5.b(z70.x.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ub1.m) scope5.get((k23.d<?>) t0Var5.b(ub1.m.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (z70.z) scope5.get((k23.d<?>) t0Var5.b(z70.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ht.p) scope5.get((k23.d<?>) t0Var5.b(ht.p.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.f0) scope5.get((k23.d<?>) t0Var5.b(zd0.f0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (c22.k) scope5.get((k23.d<?>) t0Var5.b(c22.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.k0) scope5.get((k23.d<?>) t0Var5.b(zd0.k0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                r3 r3Var5 = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (zy0.n) ez0.b.a(ez0.b.f67468a, ez0.c.OMT, zy0.n.class, new c83.h.a[0], null, null, null, 120);
                            case 16:
                                Scope scope6 = (Scope) obj2;
                                r3 r3Var6 = r3.f92907a;
                                scope6.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (zd0.g0) scope6.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(zd0.f0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                            case 17:
                                r3 r3Var7 = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.b();
                            case 18:
                                Scope scope7 = (Scope) obj2;
                                r3 r3Var8 = r3.f92907a;
                                scope7.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z70.c0(new q3(scope7, 0), (z70.z) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(z70.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 19:
                                r3 r3Var9 = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zy0.d();
                            case 20:
                                Scope scope8 = (Scope) obj2;
                                r3 r3Var10 = r3.f92907a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z70.c(ModuleExtKt.androidContext(scope8));
                            case 21:
                                Scope scope9 = (Scope) obj2;
                                r3 r3Var11 = r3.f92907a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var6 = p005kotlin.jvm.internal.s0.f105811a;
                                return new z70.a((z70.y) scope9.get((k23.d<?>) t0Var6.b(z70.y.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zy0.o) scope9.get((k23.d<?>) t0Var6.b(zy0.o.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                Scope scope10 = (Scope) obj2;
                                r3 r3Var12 = r3.f92907a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z70.d(ModuleExtKt.androidContext(scope10), (c22.k) scope10.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(c22.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                Scope scope11 = (Scope) obj2;
                                r3 r3Var13 = r3.f92907a;
                                scope11.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (z70.a0) scope11.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(z70.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                            case 24:
                                s3 s3Var = s3.f92921a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ub1.d();
                            case 25:
                                s3 s3Var2 = s3.f92921a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ge0.e();
                            case 26:
                                Scope scope12 = (Scope) obj2;
                                s3 s3Var3 = s3.f92921a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var7 = p005kotlin.jvm.internal.s0.f105811a;
                                return new DashboardEssentialsConfigWatcher((he0.a) scope12.get((k23.d<?>) t0Var7.b(he0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.g1) scope12.get((k23.d<?>) t0Var7.b(zd0.g1.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 27:
                                Scope scope13 = (Scope) obj2;
                                s3 s3Var4 = s3.f92921a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new wb1.o((z70.a0) scope13.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(z70.a0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                u3 u3Var = u3.f92946a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ld0.a();
                            default:
                                u3 u3Var2 = u3.f92946a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (ol.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ol.a.class, new c83.h.a[0], null, null, null, 120);
                        }
                    }
                }, kind3, j0Var3), module8));
                final int i38 = 20;
                SingleInstanceFactory<?> singleInstanceFactoryP2 = lc.u0.p(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(z70.y.class), null, new e23.p() { // from class: id0.l3
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i38) {
                            case 0:
                                m3 m3Var2 = m3.f92846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.b5();
                            case 1:
                                m3 m3Var3 = m3.f92846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (ka1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ka1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 2:
                                Scope scope = (Scope) obj2;
                                m3 m3Var4 = m3.f92846a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new oa1.c((ka1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ka1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                Scope scope2 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                m3 m3Var5 = m3.f92846a;
                                scope2.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var4 = p005kotlin.jvm.internal.s0.f105811a;
                                return new ra1.a((ma1.a) parametersHolder.elementAt(0, t0Var4.b(ma1.a.class)), (oa1.c) scope2.get((k23.d<?>) t0Var4.b(oa1.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                n3 n3Var2 = n3.f92858a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.d5();
                            case 5:
                                o3 o3Var2 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.e5();
                            case 6:
                                o3 o3Var3 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.f5();
                            case 7:
                                o3 o3Var4 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new v6();
                            case 8:
                                o3 o3Var5 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f) ez0.b.a(ez0.b.f67468a, ez0.c.GC, com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f.class, new c83.h.a[0], null, null, null, 120);
                            case 9:
                                o3 o3Var6 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new y6();
                            case 10:
                                Scope scope3 = (Scope) obj2;
                                o3 o3Var7 = o3.f92872a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z6((com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f) scope3.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                p3 p3Var2 = p3.f92884a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.g5();
                            case 12:
                                r3 r3Var2 = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ht.b();
                            case 13:
                                Scope scope4 = (Scope) obj2;
                                r3 r3Var3 = r3.f92907a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (zd0.g1) scope4.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(zd0.q0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                            case 14:
                                Scope scope5 = (Scope) obj2;
                                r3 r3Var4 = r3.f92907a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var5 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.u0((z70.b0) scope5.get((k23.d<?>) t0Var5.b(z70.b0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (z70.x) scope5.get((k23.d<?>) t0Var5.b(z70.x.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ub1.m) scope5.get((k23.d<?>) t0Var5.b(ub1.m.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (z70.z) scope5.get((k23.d<?>) t0Var5.b(z70.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ht.p) scope5.get((k23.d<?>) t0Var5.b(ht.p.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.f0) scope5.get((k23.d<?>) t0Var5.b(zd0.f0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (c22.k) scope5.get((k23.d<?>) t0Var5.b(c22.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.k0) scope5.get((k23.d<?>) t0Var5.b(zd0.k0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                r3 r3Var5 = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (zy0.n) ez0.b.a(ez0.b.f67468a, ez0.c.OMT, zy0.n.class, new c83.h.a[0], null, null, null, 120);
                            case 16:
                                Scope scope6 = (Scope) obj2;
                                r3 r3Var6 = r3.f92907a;
                                scope6.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (zd0.g0) scope6.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(zd0.f0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                            case 17:
                                r3 r3Var7 = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.b();
                            case 18:
                                Scope scope7 = (Scope) obj2;
                                r3 r3Var8 = r3.f92907a;
                                scope7.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z70.c0(new q3(scope7, 0), (z70.z) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(z70.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 19:
                                r3 r3Var9 = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zy0.d();
                            case 20:
                                Scope scope8 = (Scope) obj2;
                                r3 r3Var10 = r3.f92907a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z70.c(ModuleExtKt.androidContext(scope8));
                            case 21:
                                Scope scope9 = (Scope) obj2;
                                r3 r3Var11 = r3.f92907a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var6 = p005kotlin.jvm.internal.s0.f105811a;
                                return new z70.a((z70.y) scope9.get((k23.d<?>) t0Var6.b(z70.y.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zy0.o) scope9.get((k23.d<?>) t0Var6.b(zy0.o.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                Scope scope10 = (Scope) obj2;
                                r3 r3Var12 = r3.f92907a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z70.d(ModuleExtKt.androidContext(scope10), (c22.k) scope10.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(c22.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                Scope scope11 = (Scope) obj2;
                                r3 r3Var13 = r3.f92907a;
                                scope11.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (z70.a0) scope11.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(z70.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                            case 24:
                                s3 s3Var = s3.f92921a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ub1.d();
                            case 25:
                                s3 s3Var2 = s3.f92921a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ge0.e();
                            case 26:
                                Scope scope12 = (Scope) obj2;
                                s3 s3Var3 = s3.f92921a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var7 = p005kotlin.jvm.internal.s0.f105811a;
                                return new DashboardEssentialsConfigWatcher((he0.a) scope12.get((k23.d<?>) t0Var7.b(he0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.g1) scope12.get((k23.d<?>) t0Var7.b(zd0.g1.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 27:
                                Scope scope13 = (Scope) obj2;
                                s3 s3Var4 = s3.f92921a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new wb1.o((z70.a0) scope13.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(z70.a0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                u3 u3Var = u3.f92946a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ld0.a();
                            default:
                                u3 u3Var2 = u3.f92946a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (ol.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ol.a.class, new c83.h.a[0], null, null, null, 120);
                        }
                    }
                }, kind4, j0Var3), module8);
                if (module8.get_createdAtStart()) {
                    module8.prepareForCreationAtStart(singleInstanceFactoryP2);
                }
                new KoinDefinition(module8, singleInstanceFactoryP2);
                final int i39 = 21;
                SingleInstanceFactory<?> singleInstanceFactoryP3 = lc.u0.p(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(z70.x.class), null, new e23.p() { // from class: id0.l3
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i39) {
                            case 0:
                                m3 m3Var2 = m3.f92846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.b5();
                            case 1:
                                m3 m3Var3 = m3.f92846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (ka1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ka1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 2:
                                Scope scope = (Scope) obj2;
                                m3 m3Var4 = m3.f92846a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new oa1.c((ka1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ka1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                Scope scope2 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                m3 m3Var5 = m3.f92846a;
                                scope2.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var4 = p005kotlin.jvm.internal.s0.f105811a;
                                return new ra1.a((ma1.a) parametersHolder.elementAt(0, t0Var4.b(ma1.a.class)), (oa1.c) scope2.get((k23.d<?>) t0Var4.b(oa1.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                n3 n3Var2 = n3.f92858a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.d5();
                            case 5:
                                o3 o3Var2 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.e5();
                            case 6:
                                o3 o3Var3 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.f5();
                            case 7:
                                o3 o3Var4 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new v6();
                            case 8:
                                o3 o3Var5 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f) ez0.b.a(ez0.b.f67468a, ez0.c.GC, com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f.class, new c83.h.a[0], null, null, null, 120);
                            case 9:
                                o3 o3Var6 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new y6();
                            case 10:
                                Scope scope3 = (Scope) obj2;
                                o3 o3Var7 = o3.f92872a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z6((com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f) scope3.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                p3 p3Var2 = p3.f92884a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.g5();
                            case 12:
                                r3 r3Var2 = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ht.b();
                            case 13:
                                Scope scope4 = (Scope) obj2;
                                r3 r3Var3 = r3.f92907a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (zd0.g1) scope4.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(zd0.q0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                            case 14:
                                Scope scope5 = (Scope) obj2;
                                r3 r3Var4 = r3.f92907a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var5 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.u0((z70.b0) scope5.get((k23.d<?>) t0Var5.b(z70.b0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (z70.x) scope5.get((k23.d<?>) t0Var5.b(z70.x.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ub1.m) scope5.get((k23.d<?>) t0Var5.b(ub1.m.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (z70.z) scope5.get((k23.d<?>) t0Var5.b(z70.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ht.p) scope5.get((k23.d<?>) t0Var5.b(ht.p.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.f0) scope5.get((k23.d<?>) t0Var5.b(zd0.f0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (c22.k) scope5.get((k23.d<?>) t0Var5.b(c22.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.k0) scope5.get((k23.d<?>) t0Var5.b(zd0.k0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                r3 r3Var5 = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (zy0.n) ez0.b.a(ez0.b.f67468a, ez0.c.OMT, zy0.n.class, new c83.h.a[0], null, null, null, 120);
                            case 16:
                                Scope scope6 = (Scope) obj2;
                                r3 r3Var6 = r3.f92907a;
                                scope6.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (zd0.g0) scope6.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(zd0.f0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                            case 17:
                                r3 r3Var7 = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.b();
                            case 18:
                                Scope scope7 = (Scope) obj2;
                                r3 r3Var8 = r3.f92907a;
                                scope7.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z70.c0(new q3(scope7, 0), (z70.z) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(z70.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 19:
                                r3 r3Var9 = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zy0.d();
                            case 20:
                                Scope scope8 = (Scope) obj2;
                                r3 r3Var10 = r3.f92907a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z70.c(ModuleExtKt.androidContext(scope8));
                            case 21:
                                Scope scope9 = (Scope) obj2;
                                r3 r3Var11 = r3.f92907a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var6 = p005kotlin.jvm.internal.s0.f105811a;
                                return new z70.a((z70.y) scope9.get((k23.d<?>) t0Var6.b(z70.y.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zy0.o) scope9.get((k23.d<?>) t0Var6.b(zy0.o.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                Scope scope10 = (Scope) obj2;
                                r3 r3Var12 = r3.f92907a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z70.d(ModuleExtKt.androidContext(scope10), (c22.k) scope10.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(c22.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                Scope scope11 = (Scope) obj2;
                                r3 r3Var13 = r3.f92907a;
                                scope11.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (z70.a0) scope11.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(z70.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                            case 24:
                                s3 s3Var = s3.f92921a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ub1.d();
                            case 25:
                                s3 s3Var2 = s3.f92921a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ge0.e();
                            case 26:
                                Scope scope12 = (Scope) obj2;
                                s3 s3Var3 = s3.f92921a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var7 = p005kotlin.jvm.internal.s0.f105811a;
                                return new DashboardEssentialsConfigWatcher((he0.a) scope12.get((k23.d<?>) t0Var7.b(he0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.g1) scope12.get((k23.d<?>) t0Var7.b(zd0.g1.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 27:
                                Scope scope13 = (Scope) obj2;
                                s3 s3Var4 = s3.f92921a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new wb1.o((z70.a0) scope13.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(z70.a0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                u3 u3Var = u3.f92946a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ld0.a();
                            default:
                                u3 u3Var2 = u3.f92946a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (ol.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ol.a.class, new c83.h.a[0], null, null, null, 120);
                        }
                    }
                }, kind4, j0Var3), module8);
                if (module8.get_createdAtStart()) {
                    module8.prepareForCreationAtStart(singleInstanceFactoryP3);
                }
                new KoinDefinition(module8, singleInstanceFactoryP3);
                final int i44 = 22;
                SingleInstanceFactory<?> singleInstanceFactoryP4 = lc.u0.p(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(z70.z.class), null, new e23.p() { // from class: id0.l3
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i44) {
                            case 0:
                                m3 m3Var2 = m3.f92846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.b5();
                            case 1:
                                m3 m3Var3 = m3.f92846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (ka1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ka1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 2:
                                Scope scope = (Scope) obj2;
                                m3 m3Var4 = m3.f92846a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new oa1.c((ka1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ka1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                Scope scope2 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                m3 m3Var5 = m3.f92846a;
                                scope2.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var4 = p005kotlin.jvm.internal.s0.f105811a;
                                return new ra1.a((ma1.a) parametersHolder.elementAt(0, t0Var4.b(ma1.a.class)), (oa1.c) scope2.get((k23.d<?>) t0Var4.b(oa1.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                n3 n3Var2 = n3.f92858a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.d5();
                            case 5:
                                o3 o3Var2 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.e5();
                            case 6:
                                o3 o3Var3 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.f5();
                            case 7:
                                o3 o3Var4 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new v6();
                            case 8:
                                o3 o3Var5 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f) ez0.b.a(ez0.b.f67468a, ez0.c.GC, com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f.class, new c83.h.a[0], null, null, null, 120);
                            case 9:
                                o3 o3Var6 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new y6();
                            case 10:
                                Scope scope3 = (Scope) obj2;
                                o3 o3Var7 = o3.f92872a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z6((com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f) scope3.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                p3 p3Var2 = p3.f92884a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.g5();
                            case 12:
                                r3 r3Var2 = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ht.b();
                            case 13:
                                Scope scope4 = (Scope) obj2;
                                r3 r3Var3 = r3.f92907a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (zd0.g1) scope4.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(zd0.q0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                            case 14:
                                Scope scope5 = (Scope) obj2;
                                r3 r3Var4 = r3.f92907a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var5 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.u0((z70.b0) scope5.get((k23.d<?>) t0Var5.b(z70.b0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (z70.x) scope5.get((k23.d<?>) t0Var5.b(z70.x.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ub1.m) scope5.get((k23.d<?>) t0Var5.b(ub1.m.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (z70.z) scope5.get((k23.d<?>) t0Var5.b(z70.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ht.p) scope5.get((k23.d<?>) t0Var5.b(ht.p.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.f0) scope5.get((k23.d<?>) t0Var5.b(zd0.f0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (c22.k) scope5.get((k23.d<?>) t0Var5.b(c22.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.k0) scope5.get((k23.d<?>) t0Var5.b(zd0.k0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                r3 r3Var5 = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (zy0.n) ez0.b.a(ez0.b.f67468a, ez0.c.OMT, zy0.n.class, new c83.h.a[0], null, null, null, 120);
                            case 16:
                                Scope scope6 = (Scope) obj2;
                                r3 r3Var6 = r3.f92907a;
                                scope6.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (zd0.g0) scope6.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(zd0.f0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                            case 17:
                                r3 r3Var7 = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.b();
                            case 18:
                                Scope scope7 = (Scope) obj2;
                                r3 r3Var8 = r3.f92907a;
                                scope7.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z70.c0(new q3(scope7, 0), (z70.z) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(z70.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 19:
                                r3 r3Var9 = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zy0.d();
                            case 20:
                                Scope scope8 = (Scope) obj2;
                                r3 r3Var10 = r3.f92907a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z70.c(ModuleExtKt.androidContext(scope8));
                            case 21:
                                Scope scope9 = (Scope) obj2;
                                r3 r3Var11 = r3.f92907a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var6 = p005kotlin.jvm.internal.s0.f105811a;
                                return new z70.a((z70.y) scope9.get((k23.d<?>) t0Var6.b(z70.y.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zy0.o) scope9.get((k23.d<?>) t0Var6.b(zy0.o.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                Scope scope10 = (Scope) obj2;
                                r3 r3Var12 = r3.f92907a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z70.d(ModuleExtKt.androidContext(scope10), (c22.k) scope10.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(c22.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                Scope scope11 = (Scope) obj2;
                                r3 r3Var13 = r3.f92907a;
                                scope11.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (z70.a0) scope11.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(z70.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                            case 24:
                                s3 s3Var = s3.f92921a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ub1.d();
                            case 25:
                                s3 s3Var2 = s3.f92921a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ge0.e();
                            case 26:
                                Scope scope12 = (Scope) obj2;
                                s3 s3Var3 = s3.f92921a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var7 = p005kotlin.jvm.internal.s0.f105811a;
                                return new DashboardEssentialsConfigWatcher((he0.a) scope12.get((k23.d<?>) t0Var7.b(he0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.g1) scope12.get((k23.d<?>) t0Var7.b(zd0.g1.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 27:
                                Scope scope13 = (Scope) obj2;
                                s3 s3Var4 = s3.f92921a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new wb1.o((z70.a0) scope13.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(z70.a0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                u3 u3Var = u3.f92946a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ld0.a();
                            default:
                                u3 u3Var2 = u3.f92946a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (ol.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ol.a.class, new c83.h.a[0], null, null, null, 120);
                        }
                    }
                }, kind4, j0Var3), module8);
                if (module8.get_createdAtStart()) {
                    module8.prepareForCreationAtStart(singleInstanceFactoryP4);
                }
                new KoinDefinition(module8, singleInstanceFactoryP4);
                final int i45 = 23;
                SingleInstanceFactory<?> singleInstanceFactoryP5 = lc.u0.p(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(z70.a0.class), null, new e23.p() { // from class: id0.l3
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i45) {
                            case 0:
                                m3 m3Var2 = m3.f92846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.b5();
                            case 1:
                                m3 m3Var3 = m3.f92846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (ka1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ka1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 2:
                                Scope scope = (Scope) obj2;
                                m3 m3Var4 = m3.f92846a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new oa1.c((ka1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ka1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                Scope scope2 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                m3 m3Var5 = m3.f92846a;
                                scope2.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var4 = p005kotlin.jvm.internal.s0.f105811a;
                                return new ra1.a((ma1.a) parametersHolder.elementAt(0, t0Var4.b(ma1.a.class)), (oa1.c) scope2.get((k23.d<?>) t0Var4.b(oa1.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                n3 n3Var2 = n3.f92858a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.d5();
                            case 5:
                                o3 o3Var2 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.e5();
                            case 6:
                                o3 o3Var3 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.f5();
                            case 7:
                                o3 o3Var4 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new v6();
                            case 8:
                                o3 o3Var5 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f) ez0.b.a(ez0.b.f67468a, ez0.c.GC, com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f.class, new c83.h.a[0], null, null, null, 120);
                            case 9:
                                o3 o3Var6 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new y6();
                            case 10:
                                Scope scope3 = (Scope) obj2;
                                o3 o3Var7 = o3.f92872a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z6((com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f) scope3.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                p3 p3Var2 = p3.f92884a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.g5();
                            case 12:
                                r3 r3Var2 = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ht.b();
                            case 13:
                                Scope scope4 = (Scope) obj2;
                                r3 r3Var3 = r3.f92907a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (zd0.g1) scope4.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(zd0.q0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                            case 14:
                                Scope scope5 = (Scope) obj2;
                                r3 r3Var4 = r3.f92907a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var5 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.u0((z70.b0) scope5.get((k23.d<?>) t0Var5.b(z70.b0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (z70.x) scope5.get((k23.d<?>) t0Var5.b(z70.x.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ub1.m) scope5.get((k23.d<?>) t0Var5.b(ub1.m.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (z70.z) scope5.get((k23.d<?>) t0Var5.b(z70.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ht.p) scope5.get((k23.d<?>) t0Var5.b(ht.p.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.f0) scope5.get((k23.d<?>) t0Var5.b(zd0.f0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (c22.k) scope5.get((k23.d<?>) t0Var5.b(c22.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.k0) scope5.get((k23.d<?>) t0Var5.b(zd0.k0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                r3 r3Var5 = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (zy0.n) ez0.b.a(ez0.b.f67468a, ez0.c.OMT, zy0.n.class, new c83.h.a[0], null, null, null, 120);
                            case 16:
                                Scope scope6 = (Scope) obj2;
                                r3 r3Var6 = r3.f92907a;
                                scope6.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (zd0.g0) scope6.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(zd0.f0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                            case 17:
                                r3 r3Var7 = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.b();
                            case 18:
                                Scope scope7 = (Scope) obj2;
                                r3 r3Var8 = r3.f92907a;
                                scope7.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z70.c0(new q3(scope7, 0), (z70.z) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(z70.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 19:
                                r3 r3Var9 = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zy0.d();
                            case 20:
                                Scope scope8 = (Scope) obj2;
                                r3 r3Var10 = r3.f92907a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z70.c(ModuleExtKt.androidContext(scope8));
                            case 21:
                                Scope scope9 = (Scope) obj2;
                                r3 r3Var11 = r3.f92907a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var6 = p005kotlin.jvm.internal.s0.f105811a;
                                return new z70.a((z70.y) scope9.get((k23.d<?>) t0Var6.b(z70.y.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zy0.o) scope9.get((k23.d<?>) t0Var6.b(zy0.o.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                Scope scope10 = (Scope) obj2;
                                r3 r3Var12 = r3.f92907a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z70.d(ModuleExtKt.androidContext(scope10), (c22.k) scope10.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(c22.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                Scope scope11 = (Scope) obj2;
                                r3 r3Var13 = r3.f92907a;
                                scope11.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (z70.a0) scope11.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(z70.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                            case 24:
                                s3 s3Var = s3.f92921a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ub1.d();
                            case 25:
                                s3 s3Var2 = s3.f92921a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ge0.e();
                            case 26:
                                Scope scope12 = (Scope) obj2;
                                s3 s3Var3 = s3.f92921a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var7 = p005kotlin.jvm.internal.s0.f105811a;
                                return new DashboardEssentialsConfigWatcher((he0.a) scope12.get((k23.d<?>) t0Var7.b(he0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.g1) scope12.get((k23.d<?>) t0Var7.b(zd0.g1.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 27:
                                Scope scope13 = (Scope) obj2;
                                s3 s3Var4 = s3.f92921a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new wb1.o((z70.a0) scope13.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(z70.a0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                u3 u3Var = u3.f92946a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ld0.a();
                            default:
                                u3 u3Var2 = u3.f92946a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (ol.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ol.a.class, new c83.h.a[0], null, null, null, 120);
                        }
                    }
                }, kind4, j0Var3), module8);
                if (module8.get_createdAtStart()) {
                    module8.prepareForCreationAtStart(singleInstanceFactoryP5);
                }
                new KoinDefinition(module8, singleInstanceFactoryP5);
                final int i46 = 12;
                SingleInstanceFactory<?> singleInstanceFactoryP6 = lc.u0.p(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(ht.p.class), null, new e23.p() { // from class: id0.l3
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i46) {
                            case 0:
                                m3 m3Var2 = m3.f92846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.b5();
                            case 1:
                                m3 m3Var3 = m3.f92846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (ka1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ka1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 2:
                                Scope scope = (Scope) obj2;
                                m3 m3Var4 = m3.f92846a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new oa1.c((ka1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ka1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                Scope scope2 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                m3 m3Var5 = m3.f92846a;
                                scope2.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var4 = p005kotlin.jvm.internal.s0.f105811a;
                                return new ra1.a((ma1.a) parametersHolder.elementAt(0, t0Var4.b(ma1.a.class)), (oa1.c) scope2.get((k23.d<?>) t0Var4.b(oa1.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                n3 n3Var2 = n3.f92858a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.d5();
                            case 5:
                                o3 o3Var2 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.e5();
                            case 6:
                                o3 o3Var3 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.f5();
                            case 7:
                                o3 o3Var4 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new v6();
                            case 8:
                                o3 o3Var5 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f) ez0.b.a(ez0.b.f67468a, ez0.c.GC, com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f.class, new c83.h.a[0], null, null, null, 120);
                            case 9:
                                o3 o3Var6 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new y6();
                            case 10:
                                Scope scope3 = (Scope) obj2;
                                o3 o3Var7 = o3.f92872a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z6((com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f) scope3.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                p3 p3Var2 = p3.f92884a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.g5();
                            case 12:
                                r3 r3Var2 = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ht.b();
                            case 13:
                                Scope scope4 = (Scope) obj2;
                                r3 r3Var3 = r3.f92907a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (zd0.g1) scope4.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(zd0.q0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                            case 14:
                                Scope scope5 = (Scope) obj2;
                                r3 r3Var4 = r3.f92907a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var5 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.u0((z70.b0) scope5.get((k23.d<?>) t0Var5.b(z70.b0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (z70.x) scope5.get((k23.d<?>) t0Var5.b(z70.x.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ub1.m) scope5.get((k23.d<?>) t0Var5.b(ub1.m.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (z70.z) scope5.get((k23.d<?>) t0Var5.b(z70.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ht.p) scope5.get((k23.d<?>) t0Var5.b(ht.p.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.f0) scope5.get((k23.d<?>) t0Var5.b(zd0.f0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (c22.k) scope5.get((k23.d<?>) t0Var5.b(c22.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.k0) scope5.get((k23.d<?>) t0Var5.b(zd0.k0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                r3 r3Var5 = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (zy0.n) ez0.b.a(ez0.b.f67468a, ez0.c.OMT, zy0.n.class, new c83.h.a[0], null, null, null, 120);
                            case 16:
                                Scope scope6 = (Scope) obj2;
                                r3 r3Var6 = r3.f92907a;
                                scope6.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (zd0.g0) scope6.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(zd0.f0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                            case 17:
                                r3 r3Var7 = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.b();
                            case 18:
                                Scope scope7 = (Scope) obj2;
                                r3 r3Var8 = r3.f92907a;
                                scope7.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z70.c0(new q3(scope7, 0), (z70.z) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(z70.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 19:
                                r3 r3Var9 = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zy0.d();
                            case 20:
                                Scope scope8 = (Scope) obj2;
                                r3 r3Var10 = r3.f92907a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z70.c(ModuleExtKt.androidContext(scope8));
                            case 21:
                                Scope scope9 = (Scope) obj2;
                                r3 r3Var11 = r3.f92907a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var6 = p005kotlin.jvm.internal.s0.f105811a;
                                return new z70.a((z70.y) scope9.get((k23.d<?>) t0Var6.b(z70.y.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zy0.o) scope9.get((k23.d<?>) t0Var6.b(zy0.o.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                Scope scope10 = (Scope) obj2;
                                r3 r3Var12 = r3.f92907a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z70.d(ModuleExtKt.androidContext(scope10), (c22.k) scope10.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(c22.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                Scope scope11 = (Scope) obj2;
                                r3 r3Var13 = r3.f92907a;
                                scope11.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (z70.a0) scope11.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(z70.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                            case 24:
                                s3 s3Var = s3.f92921a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ub1.d();
                            case 25:
                                s3 s3Var2 = s3.f92921a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ge0.e();
                            case 26:
                                Scope scope12 = (Scope) obj2;
                                s3 s3Var3 = s3.f92921a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var7 = p005kotlin.jvm.internal.s0.f105811a;
                                return new DashboardEssentialsConfigWatcher((he0.a) scope12.get((k23.d<?>) t0Var7.b(he0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.g1) scope12.get((k23.d<?>) t0Var7.b(zd0.g1.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 27:
                                Scope scope13 = (Scope) obj2;
                                s3 s3Var4 = s3.f92921a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new wb1.o((z70.a0) scope13.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(z70.a0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                u3 u3Var = u3.f92946a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ld0.a();
                            default:
                                u3 u3Var2 = u3.f92946a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (ol.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ol.a.class, new c83.h.a[0], null, null, null, 120);
                        }
                    }
                }, kind4, j0Var3), module8);
                if (module8.get_createdAtStart()) {
                    module8.prepareForCreationAtStart(singleInstanceFactoryP6);
                }
                new KoinDefinition(module8, singleInstanceFactoryP6);
                final int i47 = 13;
                SingleInstanceFactory<?> singleInstanceFactoryP7 = lc.u0.p(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(zd0.g1.class), null, new e23.p() { // from class: id0.l3
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i47) {
                            case 0:
                                m3 m3Var2 = m3.f92846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.b5();
                            case 1:
                                m3 m3Var3 = m3.f92846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (ka1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ka1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 2:
                                Scope scope = (Scope) obj2;
                                m3 m3Var4 = m3.f92846a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new oa1.c((ka1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ka1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                Scope scope2 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                m3 m3Var5 = m3.f92846a;
                                scope2.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var4 = p005kotlin.jvm.internal.s0.f105811a;
                                return new ra1.a((ma1.a) parametersHolder.elementAt(0, t0Var4.b(ma1.a.class)), (oa1.c) scope2.get((k23.d<?>) t0Var4.b(oa1.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                n3 n3Var2 = n3.f92858a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.d5();
                            case 5:
                                o3 o3Var2 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.e5();
                            case 6:
                                o3 o3Var3 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.f5();
                            case 7:
                                o3 o3Var4 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new v6();
                            case 8:
                                o3 o3Var5 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f) ez0.b.a(ez0.b.f67468a, ez0.c.GC, com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f.class, new c83.h.a[0], null, null, null, 120);
                            case 9:
                                o3 o3Var6 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new y6();
                            case 10:
                                Scope scope3 = (Scope) obj2;
                                o3 o3Var7 = o3.f92872a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z6((com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f) scope3.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                p3 p3Var2 = p3.f92884a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.g5();
                            case 12:
                                r3 r3Var2 = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ht.b();
                            case 13:
                                Scope scope4 = (Scope) obj2;
                                r3 r3Var3 = r3.f92907a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (zd0.g1) scope4.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(zd0.q0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                            case 14:
                                Scope scope5 = (Scope) obj2;
                                r3 r3Var4 = r3.f92907a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var5 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.u0((z70.b0) scope5.get((k23.d<?>) t0Var5.b(z70.b0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (z70.x) scope5.get((k23.d<?>) t0Var5.b(z70.x.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ub1.m) scope5.get((k23.d<?>) t0Var5.b(ub1.m.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (z70.z) scope5.get((k23.d<?>) t0Var5.b(z70.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ht.p) scope5.get((k23.d<?>) t0Var5.b(ht.p.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.f0) scope5.get((k23.d<?>) t0Var5.b(zd0.f0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (c22.k) scope5.get((k23.d<?>) t0Var5.b(c22.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.k0) scope5.get((k23.d<?>) t0Var5.b(zd0.k0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                r3 r3Var5 = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (zy0.n) ez0.b.a(ez0.b.f67468a, ez0.c.OMT, zy0.n.class, new c83.h.a[0], null, null, null, 120);
                            case 16:
                                Scope scope6 = (Scope) obj2;
                                r3 r3Var6 = r3.f92907a;
                                scope6.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (zd0.g0) scope6.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(zd0.f0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                            case 17:
                                r3 r3Var7 = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.b();
                            case 18:
                                Scope scope7 = (Scope) obj2;
                                r3 r3Var8 = r3.f92907a;
                                scope7.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z70.c0(new q3(scope7, 0), (z70.z) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(z70.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 19:
                                r3 r3Var9 = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zy0.d();
                            case 20:
                                Scope scope8 = (Scope) obj2;
                                r3 r3Var10 = r3.f92907a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z70.c(ModuleExtKt.androidContext(scope8));
                            case 21:
                                Scope scope9 = (Scope) obj2;
                                r3 r3Var11 = r3.f92907a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var6 = p005kotlin.jvm.internal.s0.f105811a;
                                return new z70.a((z70.y) scope9.get((k23.d<?>) t0Var6.b(z70.y.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zy0.o) scope9.get((k23.d<?>) t0Var6.b(zy0.o.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                Scope scope10 = (Scope) obj2;
                                r3 r3Var12 = r3.f92907a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z70.d(ModuleExtKt.androidContext(scope10), (c22.k) scope10.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(c22.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                Scope scope11 = (Scope) obj2;
                                r3 r3Var13 = r3.f92907a;
                                scope11.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (z70.a0) scope11.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(z70.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                            case 24:
                                s3 s3Var = s3.f92921a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ub1.d();
                            case 25:
                                s3 s3Var2 = s3.f92921a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ge0.e();
                            case 26:
                                Scope scope12 = (Scope) obj2;
                                s3 s3Var3 = s3.f92921a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var7 = p005kotlin.jvm.internal.s0.f105811a;
                                return new DashboardEssentialsConfigWatcher((he0.a) scope12.get((k23.d<?>) t0Var7.b(he0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.g1) scope12.get((k23.d<?>) t0Var7.b(zd0.g1.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 27:
                                Scope scope13 = (Scope) obj2;
                                s3 s3Var4 = s3.f92921a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new wb1.o((z70.a0) scope13.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(z70.a0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                u3 u3Var = u3.f92946a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ld0.a();
                            default:
                                u3 u3Var2 = u3.f92946a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (ol.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ol.a.class, new c83.h.a[0], null, null, null, 120);
                        }
                    }
                }, kind4, j0Var3), module8);
                if (module8.get_createdAtStart()) {
                    module8.prepareForCreationAtStart(singleInstanceFactoryP7);
                }
                new KoinDefinition(module8, singleInstanceFactoryP7);
                final int i48 = 14;
                SingleInstanceFactory<?> singleInstanceFactoryP8 = lc.u0.p(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(zd0.q0.class), null, new e23.p() { // from class: id0.l3
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i48) {
                            case 0:
                                m3 m3Var2 = m3.f92846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.b5();
                            case 1:
                                m3 m3Var3 = m3.f92846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (ka1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ka1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 2:
                                Scope scope = (Scope) obj2;
                                m3 m3Var4 = m3.f92846a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new oa1.c((ka1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ka1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                Scope scope2 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                m3 m3Var5 = m3.f92846a;
                                scope2.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var4 = p005kotlin.jvm.internal.s0.f105811a;
                                return new ra1.a((ma1.a) parametersHolder.elementAt(0, t0Var4.b(ma1.a.class)), (oa1.c) scope2.get((k23.d<?>) t0Var4.b(oa1.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                n3 n3Var2 = n3.f92858a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.d5();
                            case 5:
                                o3 o3Var2 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.e5();
                            case 6:
                                o3 o3Var3 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.f5();
                            case 7:
                                o3 o3Var4 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new v6();
                            case 8:
                                o3 o3Var5 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f) ez0.b.a(ez0.b.f67468a, ez0.c.GC, com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f.class, new c83.h.a[0], null, null, null, 120);
                            case 9:
                                o3 o3Var6 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new y6();
                            case 10:
                                Scope scope3 = (Scope) obj2;
                                o3 o3Var7 = o3.f92872a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z6((com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f) scope3.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                p3 p3Var2 = p3.f92884a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.g5();
                            case 12:
                                r3 r3Var2 = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ht.b();
                            case 13:
                                Scope scope4 = (Scope) obj2;
                                r3 r3Var3 = r3.f92907a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (zd0.g1) scope4.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(zd0.q0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                            case 14:
                                Scope scope5 = (Scope) obj2;
                                r3 r3Var4 = r3.f92907a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var5 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.u0((z70.b0) scope5.get((k23.d<?>) t0Var5.b(z70.b0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (z70.x) scope5.get((k23.d<?>) t0Var5.b(z70.x.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ub1.m) scope5.get((k23.d<?>) t0Var5.b(ub1.m.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (z70.z) scope5.get((k23.d<?>) t0Var5.b(z70.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ht.p) scope5.get((k23.d<?>) t0Var5.b(ht.p.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.f0) scope5.get((k23.d<?>) t0Var5.b(zd0.f0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (c22.k) scope5.get((k23.d<?>) t0Var5.b(c22.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.k0) scope5.get((k23.d<?>) t0Var5.b(zd0.k0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                r3 r3Var5 = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (zy0.n) ez0.b.a(ez0.b.f67468a, ez0.c.OMT, zy0.n.class, new c83.h.a[0], null, null, null, 120);
                            case 16:
                                Scope scope6 = (Scope) obj2;
                                r3 r3Var6 = r3.f92907a;
                                scope6.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (zd0.g0) scope6.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(zd0.f0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                            case 17:
                                r3 r3Var7 = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.b();
                            case 18:
                                Scope scope7 = (Scope) obj2;
                                r3 r3Var8 = r3.f92907a;
                                scope7.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z70.c0(new q3(scope7, 0), (z70.z) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(z70.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 19:
                                r3 r3Var9 = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zy0.d();
                            case 20:
                                Scope scope8 = (Scope) obj2;
                                r3 r3Var10 = r3.f92907a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z70.c(ModuleExtKt.androidContext(scope8));
                            case 21:
                                Scope scope9 = (Scope) obj2;
                                r3 r3Var11 = r3.f92907a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var6 = p005kotlin.jvm.internal.s0.f105811a;
                                return new z70.a((z70.y) scope9.get((k23.d<?>) t0Var6.b(z70.y.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zy0.o) scope9.get((k23.d<?>) t0Var6.b(zy0.o.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                Scope scope10 = (Scope) obj2;
                                r3 r3Var12 = r3.f92907a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z70.d(ModuleExtKt.androidContext(scope10), (c22.k) scope10.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(c22.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                Scope scope11 = (Scope) obj2;
                                r3 r3Var13 = r3.f92907a;
                                scope11.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (z70.a0) scope11.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(z70.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                            case 24:
                                s3 s3Var = s3.f92921a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ub1.d();
                            case 25:
                                s3 s3Var2 = s3.f92921a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ge0.e();
                            case 26:
                                Scope scope12 = (Scope) obj2;
                                s3 s3Var3 = s3.f92921a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var7 = p005kotlin.jvm.internal.s0.f105811a;
                                return new DashboardEssentialsConfigWatcher((he0.a) scope12.get((k23.d<?>) t0Var7.b(he0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.g1) scope12.get((k23.d<?>) t0Var7.b(zd0.g1.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 27:
                                Scope scope13 = (Scope) obj2;
                                s3 s3Var4 = s3.f92921a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new wb1.o((z70.a0) scope13.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(z70.a0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                u3 u3Var = u3.f92946a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ld0.a();
                            default:
                                u3 u3Var2 = u3.f92946a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (ol.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ol.a.class, new c83.h.a[0], null, null, null, 120);
                        }
                    }
                }, kind4, j0Var3), module8);
                if (module8.get_createdAtStart()) {
                    module8.prepareForCreationAtStart(singleInstanceFactoryP8);
                }
                new KoinDefinition(module8, singleInstanceFactoryP8);
                final int i49 = 16;
                SingleInstanceFactory<?> singleInstanceFactoryP9 = lc.u0.p(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(zd0.g0.class), null, new e23.p() { // from class: id0.l3
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i49) {
                            case 0:
                                m3 m3Var2 = m3.f92846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.b5();
                            case 1:
                                m3 m3Var3 = m3.f92846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (ka1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ka1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 2:
                                Scope scope = (Scope) obj2;
                                m3 m3Var4 = m3.f92846a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new oa1.c((ka1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ka1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                Scope scope2 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                m3 m3Var5 = m3.f92846a;
                                scope2.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var4 = p005kotlin.jvm.internal.s0.f105811a;
                                return new ra1.a((ma1.a) parametersHolder.elementAt(0, t0Var4.b(ma1.a.class)), (oa1.c) scope2.get((k23.d<?>) t0Var4.b(oa1.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                n3 n3Var2 = n3.f92858a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.d5();
                            case 5:
                                o3 o3Var2 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.e5();
                            case 6:
                                o3 o3Var3 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.f5();
                            case 7:
                                o3 o3Var4 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new v6();
                            case 8:
                                o3 o3Var5 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f) ez0.b.a(ez0.b.f67468a, ez0.c.GC, com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f.class, new c83.h.a[0], null, null, null, 120);
                            case 9:
                                o3 o3Var6 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new y6();
                            case 10:
                                Scope scope3 = (Scope) obj2;
                                o3 o3Var7 = o3.f92872a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z6((com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f) scope3.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                p3 p3Var2 = p3.f92884a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.g5();
                            case 12:
                                r3 r3Var2 = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ht.b();
                            case 13:
                                Scope scope4 = (Scope) obj2;
                                r3 r3Var3 = r3.f92907a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (zd0.g1) scope4.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(zd0.q0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                            case 14:
                                Scope scope5 = (Scope) obj2;
                                r3 r3Var4 = r3.f92907a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var5 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.u0((z70.b0) scope5.get((k23.d<?>) t0Var5.b(z70.b0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (z70.x) scope5.get((k23.d<?>) t0Var5.b(z70.x.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ub1.m) scope5.get((k23.d<?>) t0Var5.b(ub1.m.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (z70.z) scope5.get((k23.d<?>) t0Var5.b(z70.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ht.p) scope5.get((k23.d<?>) t0Var5.b(ht.p.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.f0) scope5.get((k23.d<?>) t0Var5.b(zd0.f0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (c22.k) scope5.get((k23.d<?>) t0Var5.b(c22.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.k0) scope5.get((k23.d<?>) t0Var5.b(zd0.k0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                r3 r3Var5 = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (zy0.n) ez0.b.a(ez0.b.f67468a, ez0.c.OMT, zy0.n.class, new c83.h.a[0], null, null, null, 120);
                            case 16:
                                Scope scope6 = (Scope) obj2;
                                r3 r3Var6 = r3.f92907a;
                                scope6.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (zd0.g0) scope6.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(zd0.f0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                            case 17:
                                r3 r3Var7 = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.b();
                            case 18:
                                Scope scope7 = (Scope) obj2;
                                r3 r3Var8 = r3.f92907a;
                                scope7.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z70.c0(new q3(scope7, 0), (z70.z) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(z70.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 19:
                                r3 r3Var9 = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zy0.d();
                            case 20:
                                Scope scope8 = (Scope) obj2;
                                r3 r3Var10 = r3.f92907a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z70.c(ModuleExtKt.androidContext(scope8));
                            case 21:
                                Scope scope9 = (Scope) obj2;
                                r3 r3Var11 = r3.f92907a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var6 = p005kotlin.jvm.internal.s0.f105811a;
                                return new z70.a((z70.y) scope9.get((k23.d<?>) t0Var6.b(z70.y.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zy0.o) scope9.get((k23.d<?>) t0Var6.b(zy0.o.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                Scope scope10 = (Scope) obj2;
                                r3 r3Var12 = r3.f92907a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z70.d(ModuleExtKt.androidContext(scope10), (c22.k) scope10.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(c22.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                Scope scope11 = (Scope) obj2;
                                r3 r3Var13 = r3.f92907a;
                                scope11.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (z70.a0) scope11.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(z70.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                            case 24:
                                s3 s3Var = s3.f92921a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ub1.d();
                            case 25:
                                s3 s3Var2 = s3.f92921a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ge0.e();
                            case 26:
                                Scope scope12 = (Scope) obj2;
                                s3 s3Var3 = s3.f92921a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var7 = p005kotlin.jvm.internal.s0.f105811a;
                                return new DashboardEssentialsConfigWatcher((he0.a) scope12.get((k23.d<?>) t0Var7.b(he0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.g1) scope12.get((k23.d<?>) t0Var7.b(zd0.g1.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 27:
                                Scope scope13 = (Scope) obj2;
                                s3 s3Var4 = s3.f92921a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new wb1.o((z70.a0) scope13.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(z70.a0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                u3 u3Var = u3.f92946a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ld0.a();
                            default:
                                u3 u3Var2 = u3.f92946a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (ol.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ol.a.class, new c83.h.a[0], null, null, null, 120);
                        }
                    }
                }, kind4, j0Var3), module8);
                if (module8.get_createdAtStart()) {
                    module8.prepareForCreationAtStart(singleInstanceFactoryP9);
                }
                new KoinDefinition(module8, singleInstanceFactoryP9);
                final int i54 = 17;
                SingleInstanceFactory<?> singleInstanceFactoryP10 = lc.u0.p(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(zd0.f0.class), null, new e23.p() { // from class: id0.l3
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i54) {
                            case 0:
                                m3 m3Var2 = m3.f92846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.b5();
                            case 1:
                                m3 m3Var3 = m3.f92846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (ka1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ka1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 2:
                                Scope scope = (Scope) obj2;
                                m3 m3Var4 = m3.f92846a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new oa1.c((ka1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ka1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                Scope scope2 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                m3 m3Var5 = m3.f92846a;
                                scope2.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var4 = p005kotlin.jvm.internal.s0.f105811a;
                                return new ra1.a((ma1.a) parametersHolder.elementAt(0, t0Var4.b(ma1.a.class)), (oa1.c) scope2.get((k23.d<?>) t0Var4.b(oa1.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                n3 n3Var2 = n3.f92858a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.d5();
                            case 5:
                                o3 o3Var2 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.e5();
                            case 6:
                                o3 o3Var3 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.f5();
                            case 7:
                                o3 o3Var4 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new v6();
                            case 8:
                                o3 o3Var5 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f) ez0.b.a(ez0.b.f67468a, ez0.c.GC, com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f.class, new c83.h.a[0], null, null, null, 120);
                            case 9:
                                o3 o3Var6 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new y6();
                            case 10:
                                Scope scope3 = (Scope) obj2;
                                o3 o3Var7 = o3.f92872a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z6((com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f) scope3.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                p3 p3Var2 = p3.f92884a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.g5();
                            case 12:
                                r3 r3Var2 = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ht.b();
                            case 13:
                                Scope scope4 = (Scope) obj2;
                                r3 r3Var3 = r3.f92907a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (zd0.g1) scope4.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(zd0.q0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                            case 14:
                                Scope scope5 = (Scope) obj2;
                                r3 r3Var4 = r3.f92907a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var5 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.u0((z70.b0) scope5.get((k23.d<?>) t0Var5.b(z70.b0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (z70.x) scope5.get((k23.d<?>) t0Var5.b(z70.x.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ub1.m) scope5.get((k23.d<?>) t0Var5.b(ub1.m.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (z70.z) scope5.get((k23.d<?>) t0Var5.b(z70.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ht.p) scope5.get((k23.d<?>) t0Var5.b(ht.p.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.f0) scope5.get((k23.d<?>) t0Var5.b(zd0.f0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (c22.k) scope5.get((k23.d<?>) t0Var5.b(c22.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.k0) scope5.get((k23.d<?>) t0Var5.b(zd0.k0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                r3 r3Var5 = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (zy0.n) ez0.b.a(ez0.b.f67468a, ez0.c.OMT, zy0.n.class, new c83.h.a[0], null, null, null, 120);
                            case 16:
                                Scope scope6 = (Scope) obj2;
                                r3 r3Var6 = r3.f92907a;
                                scope6.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (zd0.g0) scope6.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(zd0.f0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                            case 17:
                                r3 r3Var7 = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.b();
                            case 18:
                                Scope scope7 = (Scope) obj2;
                                r3 r3Var8 = r3.f92907a;
                                scope7.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z70.c0(new q3(scope7, 0), (z70.z) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(z70.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 19:
                                r3 r3Var9 = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zy0.d();
                            case 20:
                                Scope scope8 = (Scope) obj2;
                                r3 r3Var10 = r3.f92907a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z70.c(ModuleExtKt.androidContext(scope8));
                            case 21:
                                Scope scope9 = (Scope) obj2;
                                r3 r3Var11 = r3.f92907a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var6 = p005kotlin.jvm.internal.s0.f105811a;
                                return new z70.a((z70.y) scope9.get((k23.d<?>) t0Var6.b(z70.y.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zy0.o) scope9.get((k23.d<?>) t0Var6.b(zy0.o.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                Scope scope10 = (Scope) obj2;
                                r3 r3Var12 = r3.f92907a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z70.d(ModuleExtKt.androidContext(scope10), (c22.k) scope10.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(c22.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                Scope scope11 = (Scope) obj2;
                                r3 r3Var13 = r3.f92907a;
                                scope11.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (z70.a0) scope11.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(z70.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                            case 24:
                                s3 s3Var = s3.f92921a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ub1.d();
                            case 25:
                                s3 s3Var2 = s3.f92921a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ge0.e();
                            case 26:
                                Scope scope12 = (Scope) obj2;
                                s3 s3Var3 = s3.f92921a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var7 = p005kotlin.jvm.internal.s0.f105811a;
                                return new DashboardEssentialsConfigWatcher((he0.a) scope12.get((k23.d<?>) t0Var7.b(he0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.g1) scope12.get((k23.d<?>) t0Var7.b(zd0.g1.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 27:
                                Scope scope13 = (Scope) obj2;
                                s3 s3Var4 = s3.f92921a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new wb1.o((z70.a0) scope13.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(z70.a0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                u3 u3Var = u3.f92946a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ld0.a();
                            default:
                                u3 u3Var2 = u3.f92946a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (ol.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ol.a.class, new c83.h.a[0], null, null, null, 120);
                        }
                    }
                }, kind4, j0Var3), module8);
                if (module8.get_createdAtStart()) {
                    module8.prepareForCreationAtStart(singleInstanceFactoryP10);
                }
                new KoinDefinition(module8, singleInstanceFactoryP10);
                break;
            case 8:
                Module module9 = (Module) obj;
                s3 s3Var = s3.f92921a;
                module9.getClass();
                final int i55 = 24;
                e23.p pVar7 = new e23.p() { // from class: id0.l3
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i55) {
                            case 0:
                                m3 m3Var2 = m3.f92846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.b5();
                            case 1:
                                m3 m3Var3 = m3.f92846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (ka1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ka1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 2:
                                Scope scope = (Scope) obj2;
                                m3 m3Var4 = m3.f92846a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new oa1.c((ka1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ka1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                Scope scope2 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                m3 m3Var5 = m3.f92846a;
                                scope2.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var4 = p005kotlin.jvm.internal.s0.f105811a;
                                return new ra1.a((ma1.a) parametersHolder.elementAt(0, t0Var4.b(ma1.a.class)), (oa1.c) scope2.get((k23.d<?>) t0Var4.b(oa1.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                n3 n3Var2 = n3.f92858a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.d5();
                            case 5:
                                o3 o3Var2 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.e5();
                            case 6:
                                o3 o3Var3 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.f5();
                            case 7:
                                o3 o3Var4 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new v6();
                            case 8:
                                o3 o3Var5 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f) ez0.b.a(ez0.b.f67468a, ez0.c.GC, com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f.class, new c83.h.a[0], null, null, null, 120);
                            case 9:
                                o3 o3Var6 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new y6();
                            case 10:
                                Scope scope3 = (Scope) obj2;
                                o3 o3Var7 = o3.f92872a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z6((com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f) scope3.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                p3 p3Var2 = p3.f92884a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.g5();
                            case 12:
                                r3 r3Var2 = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ht.b();
                            case 13:
                                Scope scope4 = (Scope) obj2;
                                r3 r3Var3 = r3.f92907a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (zd0.g1) scope4.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(zd0.q0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                            case 14:
                                Scope scope5 = (Scope) obj2;
                                r3 r3Var4 = r3.f92907a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var5 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.u0((z70.b0) scope5.get((k23.d<?>) t0Var5.b(z70.b0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (z70.x) scope5.get((k23.d<?>) t0Var5.b(z70.x.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ub1.m) scope5.get((k23.d<?>) t0Var5.b(ub1.m.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (z70.z) scope5.get((k23.d<?>) t0Var5.b(z70.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ht.p) scope5.get((k23.d<?>) t0Var5.b(ht.p.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.f0) scope5.get((k23.d<?>) t0Var5.b(zd0.f0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (c22.k) scope5.get((k23.d<?>) t0Var5.b(c22.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.k0) scope5.get((k23.d<?>) t0Var5.b(zd0.k0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                r3 r3Var5 = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (zy0.n) ez0.b.a(ez0.b.f67468a, ez0.c.OMT, zy0.n.class, new c83.h.a[0], null, null, null, 120);
                            case 16:
                                Scope scope6 = (Scope) obj2;
                                r3 r3Var6 = r3.f92907a;
                                scope6.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (zd0.g0) scope6.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(zd0.f0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                            case 17:
                                r3 r3Var7 = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.b();
                            case 18:
                                Scope scope7 = (Scope) obj2;
                                r3 r3Var8 = r3.f92907a;
                                scope7.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z70.c0(new q3(scope7, 0), (z70.z) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(z70.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 19:
                                r3 r3Var9 = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zy0.d();
                            case 20:
                                Scope scope8 = (Scope) obj2;
                                r3 r3Var10 = r3.f92907a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z70.c(ModuleExtKt.androidContext(scope8));
                            case 21:
                                Scope scope9 = (Scope) obj2;
                                r3 r3Var11 = r3.f92907a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var6 = p005kotlin.jvm.internal.s0.f105811a;
                                return new z70.a((z70.y) scope9.get((k23.d<?>) t0Var6.b(z70.y.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zy0.o) scope9.get((k23.d<?>) t0Var6.b(zy0.o.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                Scope scope10 = (Scope) obj2;
                                r3 r3Var12 = r3.f92907a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z70.d(ModuleExtKt.androidContext(scope10), (c22.k) scope10.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(c22.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                Scope scope11 = (Scope) obj2;
                                r3 r3Var13 = r3.f92907a;
                                scope11.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (z70.a0) scope11.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(z70.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                            case 24:
                                s3 s3Var2 = s3.f92921a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ub1.d();
                            case 25:
                                s3 s3Var3 = s3.f92921a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ge0.e();
                            case 26:
                                Scope scope12 = (Scope) obj2;
                                s3 s3Var4 = s3.f92921a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var7 = p005kotlin.jvm.internal.s0.f105811a;
                                return new DashboardEssentialsConfigWatcher((he0.a) scope12.get((k23.d<?>) t0Var7.b(he0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.g1) scope12.get((k23.d<?>) t0Var7.b(zd0.g1.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 27:
                                Scope scope13 = (Scope) obj2;
                                s3 s3Var5 = s3.f92921a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new wb1.o((z70.a0) scope13.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(z70.a0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                u3 u3Var = u3.f92946a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ld0.a();
                            default:
                                u3 u3Var2 = u3.f92946a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (ol.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ol.a.class, new c83.h.a[0], null, null, null, 120);
                        }
                    }
                };
                ScopeRegistry.Companion companion4 = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier5 = companion4.getRootScopeQualifier();
                Kind kind5 = Kind.Factory;
                p13.j0 j0Var4 = p13.j0.f134944a;
                p005kotlin.jvm.internal.t0 t0Var4 = p005kotlin.jvm.internal.s0.f105811a;
                new KoinDefinition(module9, i3.e5.n(new BeanDefinition(rootScopeQualifier5, t0Var4.b(ub1.m.class), null, pVar7, kind5, j0Var4), module9));
                final int i56 = 25;
                new KoinDefinition(module9, i3.e5.n(new BeanDefinition(companion4.getRootScopeQualifier(), t0Var4.b(zd0.k0.class), null, new e23.p() { // from class: id0.l3
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i56) {
                            case 0:
                                m3 m3Var2 = m3.f92846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.b5();
                            case 1:
                                m3 m3Var3 = m3.f92846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (ka1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ka1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 2:
                                Scope scope = (Scope) obj2;
                                m3 m3Var4 = m3.f92846a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new oa1.c((ka1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ka1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                Scope scope2 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                m3 m3Var5 = m3.f92846a;
                                scope2.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var5 = p005kotlin.jvm.internal.s0.f105811a;
                                return new ra1.a((ma1.a) parametersHolder.elementAt(0, t0Var5.b(ma1.a.class)), (oa1.c) scope2.get((k23.d<?>) t0Var5.b(oa1.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                n3 n3Var2 = n3.f92858a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.d5();
                            case 5:
                                o3 o3Var2 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.e5();
                            case 6:
                                o3 o3Var3 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.f5();
                            case 7:
                                o3 o3Var4 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new v6();
                            case 8:
                                o3 o3Var5 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f) ez0.b.a(ez0.b.f67468a, ez0.c.GC, com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f.class, new c83.h.a[0], null, null, null, 120);
                            case 9:
                                o3 o3Var6 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new y6();
                            case 10:
                                Scope scope3 = (Scope) obj2;
                                o3 o3Var7 = o3.f92872a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z6((com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f) scope3.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                p3 p3Var2 = p3.f92884a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.g5();
                            case 12:
                                r3 r3Var2 = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ht.b();
                            case 13:
                                Scope scope4 = (Scope) obj2;
                                r3 r3Var3 = r3.f92907a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (zd0.g1) scope4.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(zd0.q0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                            case 14:
                                Scope scope5 = (Scope) obj2;
                                r3 r3Var4 = r3.f92907a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var6 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.u0((z70.b0) scope5.get((k23.d<?>) t0Var6.b(z70.b0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (z70.x) scope5.get((k23.d<?>) t0Var6.b(z70.x.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ub1.m) scope5.get((k23.d<?>) t0Var6.b(ub1.m.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (z70.z) scope5.get((k23.d<?>) t0Var6.b(z70.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ht.p) scope5.get((k23.d<?>) t0Var6.b(ht.p.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.f0) scope5.get((k23.d<?>) t0Var6.b(zd0.f0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (c22.k) scope5.get((k23.d<?>) t0Var6.b(c22.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.k0) scope5.get((k23.d<?>) t0Var6.b(zd0.k0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                r3 r3Var5 = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (zy0.n) ez0.b.a(ez0.b.f67468a, ez0.c.OMT, zy0.n.class, new c83.h.a[0], null, null, null, 120);
                            case 16:
                                Scope scope6 = (Scope) obj2;
                                r3 r3Var6 = r3.f92907a;
                                scope6.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (zd0.g0) scope6.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(zd0.f0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                            case 17:
                                r3 r3Var7 = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.b();
                            case 18:
                                Scope scope7 = (Scope) obj2;
                                r3 r3Var8 = r3.f92907a;
                                scope7.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z70.c0(new q3(scope7, 0), (z70.z) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(z70.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 19:
                                r3 r3Var9 = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zy0.d();
                            case 20:
                                Scope scope8 = (Scope) obj2;
                                r3 r3Var10 = r3.f92907a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z70.c(ModuleExtKt.androidContext(scope8));
                            case 21:
                                Scope scope9 = (Scope) obj2;
                                r3 r3Var11 = r3.f92907a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var7 = p005kotlin.jvm.internal.s0.f105811a;
                                return new z70.a((z70.y) scope9.get((k23.d<?>) t0Var7.b(z70.y.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zy0.o) scope9.get((k23.d<?>) t0Var7.b(zy0.o.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                Scope scope10 = (Scope) obj2;
                                r3 r3Var12 = r3.f92907a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z70.d(ModuleExtKt.androidContext(scope10), (c22.k) scope10.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(c22.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                Scope scope11 = (Scope) obj2;
                                r3 r3Var13 = r3.f92907a;
                                scope11.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (z70.a0) scope11.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(z70.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                            case 24:
                                s3 s3Var2 = s3.f92921a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ub1.d();
                            case 25:
                                s3 s3Var3 = s3.f92921a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ge0.e();
                            case 26:
                                Scope scope12 = (Scope) obj2;
                                s3 s3Var4 = s3.f92921a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var8 = p005kotlin.jvm.internal.s0.f105811a;
                                return new DashboardEssentialsConfigWatcher((he0.a) scope12.get((k23.d<?>) t0Var8.b(he0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.g1) scope12.get((k23.d<?>) t0Var8.b(zd0.g1.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 27:
                                Scope scope13 = (Scope) obj2;
                                s3 s3Var5 = s3.f92921a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new wb1.o((z70.a0) scope13.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(z70.a0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                u3 u3Var = u3.f92946a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ld0.a();
                            default:
                                u3 u3Var2 = u3.f92946a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (ol.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ol.a.class, new c83.h.a[0], null, null, null, 120);
                        }
                    }
                }, kind5, j0Var4), module9));
                final int i57 = 26;
                new KoinDefinition(module9, i3.e5.n(new BeanDefinition(companion4.getRootScopeQualifier(), t0Var4.b(DashboardEssentialsConfigWatcher.class), null, new e23.p() { // from class: id0.l3
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i57) {
                            case 0:
                                m3 m3Var2 = m3.f92846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.b5();
                            case 1:
                                m3 m3Var3 = m3.f92846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (ka1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ka1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 2:
                                Scope scope = (Scope) obj2;
                                m3 m3Var4 = m3.f92846a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new oa1.c((ka1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ka1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                Scope scope2 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                m3 m3Var5 = m3.f92846a;
                                scope2.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var5 = p005kotlin.jvm.internal.s0.f105811a;
                                return new ra1.a((ma1.a) parametersHolder.elementAt(0, t0Var5.b(ma1.a.class)), (oa1.c) scope2.get((k23.d<?>) t0Var5.b(oa1.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                n3 n3Var2 = n3.f92858a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.d5();
                            case 5:
                                o3 o3Var2 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.e5();
                            case 6:
                                o3 o3Var3 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.f5();
                            case 7:
                                o3 o3Var4 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new v6();
                            case 8:
                                o3 o3Var5 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f) ez0.b.a(ez0.b.f67468a, ez0.c.GC, com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f.class, new c83.h.a[0], null, null, null, 120);
                            case 9:
                                o3 o3Var6 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new y6();
                            case 10:
                                Scope scope3 = (Scope) obj2;
                                o3 o3Var7 = o3.f92872a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z6((com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f) scope3.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                p3 p3Var2 = p3.f92884a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.g5();
                            case 12:
                                r3 r3Var2 = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ht.b();
                            case 13:
                                Scope scope4 = (Scope) obj2;
                                r3 r3Var3 = r3.f92907a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (zd0.g1) scope4.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(zd0.q0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                            case 14:
                                Scope scope5 = (Scope) obj2;
                                r3 r3Var4 = r3.f92907a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var6 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.u0((z70.b0) scope5.get((k23.d<?>) t0Var6.b(z70.b0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (z70.x) scope5.get((k23.d<?>) t0Var6.b(z70.x.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ub1.m) scope5.get((k23.d<?>) t0Var6.b(ub1.m.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (z70.z) scope5.get((k23.d<?>) t0Var6.b(z70.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ht.p) scope5.get((k23.d<?>) t0Var6.b(ht.p.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.f0) scope5.get((k23.d<?>) t0Var6.b(zd0.f0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (c22.k) scope5.get((k23.d<?>) t0Var6.b(c22.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.k0) scope5.get((k23.d<?>) t0Var6.b(zd0.k0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                r3 r3Var5 = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (zy0.n) ez0.b.a(ez0.b.f67468a, ez0.c.OMT, zy0.n.class, new c83.h.a[0], null, null, null, 120);
                            case 16:
                                Scope scope6 = (Scope) obj2;
                                r3 r3Var6 = r3.f92907a;
                                scope6.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (zd0.g0) scope6.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(zd0.f0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                            case 17:
                                r3 r3Var7 = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.b();
                            case 18:
                                Scope scope7 = (Scope) obj2;
                                r3 r3Var8 = r3.f92907a;
                                scope7.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z70.c0(new q3(scope7, 0), (z70.z) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(z70.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 19:
                                r3 r3Var9 = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zy0.d();
                            case 20:
                                Scope scope8 = (Scope) obj2;
                                r3 r3Var10 = r3.f92907a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z70.c(ModuleExtKt.androidContext(scope8));
                            case 21:
                                Scope scope9 = (Scope) obj2;
                                r3 r3Var11 = r3.f92907a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var7 = p005kotlin.jvm.internal.s0.f105811a;
                                return new z70.a((z70.y) scope9.get((k23.d<?>) t0Var7.b(z70.y.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zy0.o) scope9.get((k23.d<?>) t0Var7.b(zy0.o.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                Scope scope10 = (Scope) obj2;
                                r3 r3Var12 = r3.f92907a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z70.d(ModuleExtKt.androidContext(scope10), (c22.k) scope10.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(c22.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                Scope scope11 = (Scope) obj2;
                                r3 r3Var13 = r3.f92907a;
                                scope11.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (z70.a0) scope11.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(z70.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                            case 24:
                                s3 s3Var2 = s3.f92921a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ub1.d();
                            case 25:
                                s3 s3Var3 = s3.f92921a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ge0.e();
                            case 26:
                                Scope scope12 = (Scope) obj2;
                                s3 s3Var4 = s3.f92921a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var8 = p005kotlin.jvm.internal.s0.f105811a;
                                return new DashboardEssentialsConfigWatcher((he0.a) scope12.get((k23.d<?>) t0Var8.b(he0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.g1) scope12.get((k23.d<?>) t0Var8.b(zd0.g1.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 27:
                                Scope scope13 = (Scope) obj2;
                                s3 s3Var5 = s3.f92921a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new wb1.o((z70.a0) scope13.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(z70.a0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                u3 u3Var = u3.f92946a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ld0.a();
                            default:
                                u3 u3Var2 = u3.f92946a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (ol.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ol.a.class, new c83.h.a[0], null, null, null, 120);
                        }
                    }
                }, kind5, j0Var4), module9));
                final int i58 = 27;
                new KoinDefinition(module9, i3.e5.n(new BeanDefinition(companion4.getRootScopeQualifier(), t0Var4.b(wb1.o.class), null, new e23.p() { // from class: id0.l3
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i58) {
                            case 0:
                                m3 m3Var2 = m3.f92846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.b5();
                            case 1:
                                m3 m3Var3 = m3.f92846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (ka1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ka1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 2:
                                Scope scope = (Scope) obj2;
                                m3 m3Var4 = m3.f92846a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new oa1.c((ka1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ka1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                Scope scope2 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                m3 m3Var5 = m3.f92846a;
                                scope2.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var5 = p005kotlin.jvm.internal.s0.f105811a;
                                return new ra1.a((ma1.a) parametersHolder.elementAt(0, t0Var5.b(ma1.a.class)), (oa1.c) scope2.get((k23.d<?>) t0Var5.b(oa1.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                n3 n3Var2 = n3.f92858a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.d5();
                            case 5:
                                o3 o3Var2 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.e5();
                            case 6:
                                o3 o3Var3 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.f5();
                            case 7:
                                o3 o3Var4 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new v6();
                            case 8:
                                o3 o3Var5 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f) ez0.b.a(ez0.b.f67468a, ez0.c.GC, com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f.class, new c83.h.a[0], null, null, null, 120);
                            case 9:
                                o3 o3Var6 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new y6();
                            case 10:
                                Scope scope3 = (Scope) obj2;
                                o3 o3Var7 = o3.f92872a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z6((com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f) scope3.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                p3 p3Var2 = p3.f92884a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.g5();
                            case 12:
                                r3 r3Var2 = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ht.b();
                            case 13:
                                Scope scope4 = (Scope) obj2;
                                r3 r3Var3 = r3.f92907a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (zd0.g1) scope4.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(zd0.q0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                            case 14:
                                Scope scope5 = (Scope) obj2;
                                r3 r3Var4 = r3.f92907a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var6 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.u0((z70.b0) scope5.get((k23.d<?>) t0Var6.b(z70.b0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (z70.x) scope5.get((k23.d<?>) t0Var6.b(z70.x.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ub1.m) scope5.get((k23.d<?>) t0Var6.b(ub1.m.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (z70.z) scope5.get((k23.d<?>) t0Var6.b(z70.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ht.p) scope5.get((k23.d<?>) t0Var6.b(ht.p.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.f0) scope5.get((k23.d<?>) t0Var6.b(zd0.f0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (c22.k) scope5.get((k23.d<?>) t0Var6.b(c22.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.k0) scope5.get((k23.d<?>) t0Var6.b(zd0.k0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                r3 r3Var5 = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (zy0.n) ez0.b.a(ez0.b.f67468a, ez0.c.OMT, zy0.n.class, new c83.h.a[0], null, null, null, 120);
                            case 16:
                                Scope scope6 = (Scope) obj2;
                                r3 r3Var6 = r3.f92907a;
                                scope6.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (zd0.g0) scope6.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(zd0.f0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                            case 17:
                                r3 r3Var7 = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.b();
                            case 18:
                                Scope scope7 = (Scope) obj2;
                                r3 r3Var8 = r3.f92907a;
                                scope7.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z70.c0(new q3(scope7, 0), (z70.z) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(z70.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 19:
                                r3 r3Var9 = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zy0.d();
                            case 20:
                                Scope scope8 = (Scope) obj2;
                                r3 r3Var10 = r3.f92907a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z70.c(ModuleExtKt.androidContext(scope8));
                            case 21:
                                Scope scope9 = (Scope) obj2;
                                r3 r3Var11 = r3.f92907a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var7 = p005kotlin.jvm.internal.s0.f105811a;
                                return new z70.a((z70.y) scope9.get((k23.d<?>) t0Var7.b(z70.y.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zy0.o) scope9.get((k23.d<?>) t0Var7.b(zy0.o.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                Scope scope10 = (Scope) obj2;
                                r3 r3Var12 = r3.f92907a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z70.d(ModuleExtKt.androidContext(scope10), (c22.k) scope10.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(c22.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                Scope scope11 = (Scope) obj2;
                                r3 r3Var13 = r3.f92907a;
                                scope11.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (z70.a0) scope11.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(z70.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                            case 24:
                                s3 s3Var2 = s3.f92921a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ub1.d();
                            case 25:
                                s3 s3Var3 = s3.f92921a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ge0.e();
                            case 26:
                                Scope scope12 = (Scope) obj2;
                                s3 s3Var4 = s3.f92921a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var8 = p005kotlin.jvm.internal.s0.f105811a;
                                return new DashboardEssentialsConfigWatcher((he0.a) scope12.get((k23.d<?>) t0Var8.b(he0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.g1) scope12.get((k23.d<?>) t0Var8.b(zd0.g1.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 27:
                                Scope scope13 = (Scope) obj2;
                                s3 s3Var5 = s3.f92921a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new wb1.o((z70.a0) scope13.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(z70.a0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                u3 u3Var = u3.f92946a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ld0.a();
                            default:
                                u3 u3Var2 = u3.f92946a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (ol.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ol.a.class, new c83.h.a[0], null, null, null, 120);
                        }
                    }
                }, kind5, j0Var4), module9));
                break;
            case 9:
                Module module10 = (Module) obj;
                u3 u3Var = u3.f92946a;
                module10.getClass();
                e23.p pVar8 = new e23.p() { // from class: id0.l3
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i27) {
                            case 0:
                                m3 m3Var2 = m3.f92846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.b5();
                            case 1:
                                m3 m3Var3 = m3.f92846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (ka1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ka1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 2:
                                Scope scope = (Scope) obj2;
                                m3 m3Var4 = m3.f92846a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new oa1.c((ka1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ka1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                Scope scope2 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                m3 m3Var5 = m3.f92846a;
                                scope2.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var5 = p005kotlin.jvm.internal.s0.f105811a;
                                return new ra1.a((ma1.a) parametersHolder.elementAt(0, t0Var5.b(ma1.a.class)), (oa1.c) scope2.get((k23.d<?>) t0Var5.b(oa1.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                n3 n3Var2 = n3.f92858a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.d5();
                            case 5:
                                o3 o3Var2 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.e5();
                            case 6:
                                o3 o3Var3 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.f5();
                            case 7:
                                o3 o3Var4 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new v6();
                            case 8:
                                o3 o3Var5 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f) ez0.b.a(ez0.b.f67468a, ez0.c.GC, com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f.class, new c83.h.a[0], null, null, null, 120);
                            case 9:
                                o3 o3Var6 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new y6();
                            case 10:
                                Scope scope3 = (Scope) obj2;
                                o3 o3Var7 = o3.f92872a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z6((com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f) scope3.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                p3 p3Var2 = p3.f92884a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.g5();
                            case 12:
                                r3 r3Var2 = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ht.b();
                            case 13:
                                Scope scope4 = (Scope) obj2;
                                r3 r3Var3 = r3.f92907a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (zd0.g1) scope4.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(zd0.q0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                            case 14:
                                Scope scope5 = (Scope) obj2;
                                r3 r3Var4 = r3.f92907a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var6 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.u0((z70.b0) scope5.get((k23.d<?>) t0Var6.b(z70.b0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (z70.x) scope5.get((k23.d<?>) t0Var6.b(z70.x.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ub1.m) scope5.get((k23.d<?>) t0Var6.b(ub1.m.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (z70.z) scope5.get((k23.d<?>) t0Var6.b(z70.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ht.p) scope5.get((k23.d<?>) t0Var6.b(ht.p.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.f0) scope5.get((k23.d<?>) t0Var6.b(zd0.f0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (c22.k) scope5.get((k23.d<?>) t0Var6.b(c22.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.k0) scope5.get((k23.d<?>) t0Var6.b(zd0.k0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                r3 r3Var5 = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (zy0.n) ez0.b.a(ez0.b.f67468a, ez0.c.OMT, zy0.n.class, new c83.h.a[0], null, null, null, 120);
                            case 16:
                                Scope scope6 = (Scope) obj2;
                                r3 r3Var6 = r3.f92907a;
                                scope6.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (zd0.g0) scope6.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(zd0.f0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                            case 17:
                                r3 r3Var7 = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.b();
                            case 18:
                                Scope scope7 = (Scope) obj2;
                                r3 r3Var8 = r3.f92907a;
                                scope7.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z70.c0(new q3(scope7, 0), (z70.z) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(z70.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 19:
                                r3 r3Var9 = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zy0.d();
                            case 20:
                                Scope scope8 = (Scope) obj2;
                                r3 r3Var10 = r3.f92907a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z70.c(ModuleExtKt.androidContext(scope8));
                            case 21:
                                Scope scope9 = (Scope) obj2;
                                r3 r3Var11 = r3.f92907a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var7 = p005kotlin.jvm.internal.s0.f105811a;
                                return new z70.a((z70.y) scope9.get((k23.d<?>) t0Var7.b(z70.y.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zy0.o) scope9.get((k23.d<?>) t0Var7.b(zy0.o.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                Scope scope10 = (Scope) obj2;
                                r3 r3Var12 = r3.f92907a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z70.d(ModuleExtKt.androidContext(scope10), (c22.k) scope10.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(c22.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                Scope scope11 = (Scope) obj2;
                                r3 r3Var13 = r3.f92907a;
                                scope11.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (z70.a0) scope11.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(z70.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                            case 24:
                                s3 s3Var2 = s3.f92921a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ub1.d();
                            case 25:
                                s3 s3Var3 = s3.f92921a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ge0.e();
                            case 26:
                                Scope scope12 = (Scope) obj2;
                                s3 s3Var4 = s3.f92921a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var8 = p005kotlin.jvm.internal.s0.f105811a;
                                return new DashboardEssentialsConfigWatcher((he0.a) scope12.get((k23.d<?>) t0Var8.b(he0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.g1) scope12.get((k23.d<?>) t0Var8.b(zd0.g1.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 27:
                                Scope scope13 = (Scope) obj2;
                                s3 s3Var5 = s3.f92921a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new wb1.o((z70.a0) scope13.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(z70.a0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                u3 u3Var2 = u3.f92946a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ld0.a();
                            default:
                                u3 u3Var3 = u3.f92946a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (ol.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ol.a.class, new c83.h.a[0], null, null, null, 120);
                        }
                    }
                };
                ScopeRegistry.Companion companion5 = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier6 = companion5.getRootScopeQualifier();
                Kind kind6 = Kind.Factory;
                p13.j0 j0Var5 = p13.j0.f134944a;
                p005kotlin.jvm.internal.t0 t0Var5 = p005kotlin.jvm.internal.s0.f105811a;
                new KoinDefinition(module10, i3.e5.n(new BeanDefinition(rootScopeQualifier6, t0Var5.b(il.b.class), null, pVar8, kind6, j0Var5), module10));
                new KoinDefinition(module10, i3.e5.n(new BeanDefinition(companion5.getRootScopeQualifier(), t0Var5.b(ol.a.class), null, new e23.p() { // from class: id0.l3
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i26) {
                            case 0:
                                m3 m3Var2 = m3.f92846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.b5();
                            case 1:
                                m3 m3Var3 = m3.f92846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (ka1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ka1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 2:
                                Scope scope = (Scope) obj2;
                                m3 m3Var4 = m3.f92846a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new oa1.c((ka1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ka1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                Scope scope2 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                m3 m3Var5 = m3.f92846a;
                                scope2.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var6 = p005kotlin.jvm.internal.s0.f105811a;
                                return new ra1.a((ma1.a) parametersHolder.elementAt(0, t0Var6.b(ma1.a.class)), (oa1.c) scope2.get((k23.d<?>) t0Var6.b(oa1.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                n3 n3Var2 = n3.f92858a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.d5();
                            case 5:
                                o3 o3Var2 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.e5();
                            case 6:
                                o3 o3Var3 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.f5();
                            case 7:
                                o3 o3Var4 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new v6();
                            case 8:
                                o3 o3Var5 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f) ez0.b.a(ez0.b.f67468a, ez0.c.GC, com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f.class, new c83.h.a[0], null, null, null, 120);
                            case 9:
                                o3 o3Var6 = o3.f92872a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new y6();
                            case 10:
                                Scope scope3 = (Scope) obj2;
                                o3 o3Var7 = o3.f92872a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z6((com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f) scope3.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.menstrualcycle.data.api.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                p3 p3Var2 = p3.f92884a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.g5();
                            case 12:
                                r3 r3Var2 = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ht.b();
                            case 13:
                                Scope scope4 = (Scope) obj2;
                                r3 r3Var3 = r3.f92907a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (zd0.g1) scope4.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(zd0.q0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                            case 14:
                                Scope scope5 = (Scope) obj2;
                                r3 r3Var4 = r3.f92907a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var7 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.u0((z70.b0) scope5.get((k23.d<?>) t0Var7.b(z70.b0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (z70.x) scope5.get((k23.d<?>) t0Var7.b(z70.x.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ub1.m) scope5.get((k23.d<?>) t0Var7.b(ub1.m.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (z70.z) scope5.get((k23.d<?>) t0Var7.b(z70.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ht.p) scope5.get((k23.d<?>) t0Var7.b(ht.p.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.f0) scope5.get((k23.d<?>) t0Var7.b(zd0.f0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (c22.k) scope5.get((k23.d<?>) t0Var7.b(c22.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.k0) scope5.get((k23.d<?>) t0Var7.b(zd0.k0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                r3 r3Var5 = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (zy0.n) ez0.b.a(ez0.b.f67468a, ez0.c.OMT, zy0.n.class, new c83.h.a[0], null, null, null, 120);
                            case 16:
                                Scope scope6 = (Scope) obj2;
                                r3 r3Var6 = r3.f92907a;
                                scope6.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (zd0.g0) scope6.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(zd0.f0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                            case 17:
                                r3 r3Var7 = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.b();
                            case 18:
                                Scope scope7 = (Scope) obj2;
                                r3 r3Var8 = r3.f92907a;
                                scope7.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z70.c0(new q3(scope7, 0), (z70.z) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(z70.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 19:
                                r3 r3Var9 = r3.f92907a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zy0.d();
                            case 20:
                                Scope scope8 = (Scope) obj2;
                                r3 r3Var10 = r3.f92907a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z70.c(ModuleExtKt.androidContext(scope8));
                            case 21:
                                Scope scope9 = (Scope) obj2;
                                r3 r3Var11 = r3.f92907a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var8 = p005kotlin.jvm.internal.s0.f105811a;
                                return new z70.a((z70.y) scope9.get((k23.d<?>) t0Var8.b(z70.y.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zy0.o) scope9.get((k23.d<?>) t0Var8.b(zy0.o.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                Scope scope10 = (Scope) obj2;
                                r3 r3Var12 = r3.f92907a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new z70.d(ModuleExtKt.androidContext(scope10), (c22.k) scope10.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(c22.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                Scope scope11 = (Scope) obj2;
                                r3 r3Var13 = r3.f92907a;
                                scope11.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (z70.a0) scope11.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(z70.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                            case 24:
                                s3 s3Var2 = s3.f92921a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ub1.d();
                            case 25:
                                s3 s3Var3 = s3.f92921a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ge0.e();
                            case 26:
                                Scope scope12 = (Scope) obj2;
                                s3 s3Var4 = s3.f92921a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var9 = p005kotlin.jvm.internal.s0.f105811a;
                                return new DashboardEssentialsConfigWatcher((he0.a) scope12.get((k23.d<?>) t0Var9.b(he0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.g1) scope12.get((k23.d<?>) t0Var9.b(zd0.g1.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 27:
                                Scope scope13 = (Scope) obj2;
                                s3 s3Var5 = s3.f92921a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new wb1.o((z70.a0) scope13.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(z70.a0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                u3 u3Var2 = u3.f92946a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ld0.a();
                            default:
                                u3 u3Var3 = u3.f92946a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (ol.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ol.a.class, new c83.h.a[0], null, null, null, 120);
                        }
                    }
                }, kind6, j0Var5), module10));
                new KoinDefinition(module10, i3.e5.n(new BeanDefinition(companion5.getRootScopeQualifier(), t0Var5.b(ql.a.class), null, new e23.p() { // from class: id0.t3
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) throws DefinitionParameterException {
                        Scope scope = (Scope) obj2;
                        ParametersHolder parametersHolder = (ParametersHolder) obj3;
                        switch (i25) {
                            case 0:
                                u3 u3Var2 = u3.f92946a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new ql.d((ol.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ol.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                u3 u3Var3 = u3.f92946a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var6 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zl.b((f12.l) scope.get((k23.d<?>) t0Var6.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ql.a) scope.get((k23.d<?>) t0Var6.b(ql.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (il.b) scope.get((k23.d<?>) t0Var6.b(il.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (c22.o) scope.get((k23.d<?>) t0Var6.b(c22.o.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), new is1.e(null, 1, null), (Bundle) parametersHolder.elementAt(0, t0Var6.b(Bundle.class)));
                            case 2:
                                v3 v3Var = v3.f92958a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.i5();
                            case 3:
                                w3 w3Var = w3.f92974a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (yc1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, yc1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 4:
                                w3 w3Var2 = w3.f92974a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new zc1.c((yc1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(yc1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 5:
                                w3 w3Var3 = w3.f92974a;
                                scope.getClass();
                                parametersHolder.getClass();
                                Context contextAndroidContext = ModuleExtKt.androidContext(scope);
                                p005kotlin.jvm.internal.t0 t0Var7 = p005kotlin.jvm.internal.s0.f105811a;
                                return new gd1.a(contextAndroidContext, (zc1.a) scope.get((k23.d<?>) t0Var7.b(zc1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (f12.b) scope.get((k23.d<?>) t0Var7.b(f12.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                y3 y3Var = y3.f92998a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new hd1.c();
                            case 7:
                                z3 z3Var = z3.f93010a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd1.l(new PregnancyRemindersUpdater(ModuleExtKt.androidContext(scope)), new BloodPressureRemindersUpdater(ModuleExtKt.androidContext(scope)), new LifestyleLoggingRemindersUpdater(ModuleExtKt.androidContext(scope)), new NutritionRemindersUpdater(ModuleExtKt.androidContext(scope)));
                            case 8:
                                z3 z3Var2 = z3.f93010a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd1.k((kd1.l) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kd1.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                z3 z3Var3 = z3.f93010a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd1.j(ModuleExtKt.androidContext(scope), (kd1.k) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kd1.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                a4 a4Var = a4.f92662a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.k5();
                            case 11:
                                b4 b4Var = b4.f92675a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.l5();
                            case 12:
                                e4 e4Var = e4.f92718a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.n5();
                            case 13:
                                f4 f4Var = f4.f92753a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.o5();
                            case 14:
                                g4 g4Var = g4.f92769a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new zd0.h(ModuleExtKt.androidContext(scope));
                            case 15:
                                h4 h4Var = h4.f92783a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new b90.b();
                            case 16:
                                i4 i4Var = i4.f92795a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.p5();
                            case 17:
                                j4 j4Var = j4.f92810a;
                                scope.getClass();
                                parametersHolder.getClass();
                                pm1.a aVar = (pm1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(pm1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                bv.b.f21239a.getClass();
                                bv.b.a();
                                return new kd0.r5(aVar, com.garmin.android.apps.connectmobile.k1.f37122a);
                            case 18:
                                j4 j4Var2 = j4.f92810a;
                                scope.getClass();
                                parametersHolder.getClass();
                                tn1.d dVar = parametersHolder.size() > 0 ? (tn1.d) parametersHolder.get(0) : null;
                                return new tn1.g(dVar, (tn1.c) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(tn1.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), dVar != null ? new tn1.b(dVar) : null);
                            case 19:
                                k4 k4Var = k4.f92823a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new v5();
                            case 20:
                                k4 k4Var2 = k4.f92823a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new no1.a();
                            case 21:
                                l4 l4Var = l4.f92836a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new sd0.c();
                            case 22:
                                m4 m4Var = m4.f92848a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.d2();
                            case 23:
                                n4 n4Var = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new w5();
                            case 24:
                                n4 n4Var2 = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (mp1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, mp1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 25:
                                n4 n4Var3 = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new op1.c((mp1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(mp1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                n4 n4Var4 = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var8 = p005kotlin.jvm.internal.s0.f105811a;
                                Object orNull = parametersHolder.getOrNull(t0Var8.b(Long.class));
                                if (orNull != null) {
                                    return new yp1.a(((Number) orNull).longValue(), (op1.a) scope.get((k23.d<?>) t0Var8.b(op1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                                }
                                throw new DefinitionParameterException(i3.e5.i(t0Var8, Long.class, new StringBuilder("No value found for type '"), CoreConstants.SINGLE_QUOTE_CHAR));
                            case 27:
                                p4 p4Var = p4.f92886a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var9 = p005kotlin.jvm.internal.s0.f105811a;
                                return new dq1.q((au0.z) scope.get((k23.d<?>) t0Var9.b(au0.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (au0.x) scope.get((k23.d<?>) t0Var9.b(au0.x.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (bu0.j) scope.get((k23.d<?>) t0Var9.b(bu0.j.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                p4 p4Var2 = p4.f92886a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new cq1.h(ModuleExtKt.androidContext(scope), (com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                p4 p4Var3 = p4.f92886a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new cq1.j((d12.e) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(d12.e.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                        }
                    }
                }, kind6, j0Var5), module10));
                new KoinDefinition(module10, i3.e5.n(new BeanDefinition(companion5.getRootScopeQualifier(), t0Var5.b(zl.b.class), null, new e23.p() { // from class: id0.t3
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) throws DefinitionParameterException {
                        Scope scope = (Scope) obj2;
                        ParametersHolder parametersHolder = (ParametersHolder) obj3;
                        switch (i24) {
                            case 0:
                                u3 u3Var2 = u3.f92946a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new ql.d((ol.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ol.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                u3 u3Var3 = u3.f92946a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var6 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zl.b((f12.l) scope.get((k23.d<?>) t0Var6.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ql.a) scope.get((k23.d<?>) t0Var6.b(ql.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (il.b) scope.get((k23.d<?>) t0Var6.b(il.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (c22.o) scope.get((k23.d<?>) t0Var6.b(c22.o.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), new is1.e(null, 1, null), (Bundle) parametersHolder.elementAt(0, t0Var6.b(Bundle.class)));
                            case 2:
                                v3 v3Var = v3.f92958a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.i5();
                            case 3:
                                w3 w3Var = w3.f92974a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (yc1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, yc1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 4:
                                w3 w3Var2 = w3.f92974a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new zc1.c((yc1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(yc1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 5:
                                w3 w3Var3 = w3.f92974a;
                                scope.getClass();
                                parametersHolder.getClass();
                                Context contextAndroidContext = ModuleExtKt.androidContext(scope);
                                p005kotlin.jvm.internal.t0 t0Var7 = p005kotlin.jvm.internal.s0.f105811a;
                                return new gd1.a(contextAndroidContext, (zc1.a) scope.get((k23.d<?>) t0Var7.b(zc1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (f12.b) scope.get((k23.d<?>) t0Var7.b(f12.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                y3 y3Var = y3.f92998a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new hd1.c();
                            case 7:
                                z3 z3Var = z3.f93010a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd1.l(new PregnancyRemindersUpdater(ModuleExtKt.androidContext(scope)), new BloodPressureRemindersUpdater(ModuleExtKt.androidContext(scope)), new LifestyleLoggingRemindersUpdater(ModuleExtKt.androidContext(scope)), new NutritionRemindersUpdater(ModuleExtKt.androidContext(scope)));
                            case 8:
                                z3 z3Var2 = z3.f93010a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd1.k((kd1.l) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kd1.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                z3 z3Var3 = z3.f93010a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd1.j(ModuleExtKt.androidContext(scope), (kd1.k) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kd1.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                a4 a4Var = a4.f92662a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.k5();
                            case 11:
                                b4 b4Var = b4.f92675a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.l5();
                            case 12:
                                e4 e4Var = e4.f92718a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.n5();
                            case 13:
                                f4 f4Var = f4.f92753a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.o5();
                            case 14:
                                g4 g4Var = g4.f92769a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new zd0.h(ModuleExtKt.androidContext(scope));
                            case 15:
                                h4 h4Var = h4.f92783a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new b90.b();
                            case 16:
                                i4 i4Var = i4.f92795a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.p5();
                            case 17:
                                j4 j4Var = j4.f92810a;
                                scope.getClass();
                                parametersHolder.getClass();
                                pm1.a aVar = (pm1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(pm1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                bv.b.f21239a.getClass();
                                bv.b.a();
                                return new kd0.r5(aVar, com.garmin.android.apps.connectmobile.k1.f37122a);
                            case 18:
                                j4 j4Var2 = j4.f92810a;
                                scope.getClass();
                                parametersHolder.getClass();
                                tn1.d dVar = parametersHolder.size() > 0 ? (tn1.d) parametersHolder.get(0) : null;
                                return new tn1.g(dVar, (tn1.c) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(tn1.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), dVar != null ? new tn1.b(dVar) : null);
                            case 19:
                                k4 k4Var = k4.f92823a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new v5();
                            case 20:
                                k4 k4Var2 = k4.f92823a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new no1.a();
                            case 21:
                                l4 l4Var = l4.f92836a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new sd0.c();
                            case 22:
                                m4 m4Var = m4.f92848a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.d2();
                            case 23:
                                n4 n4Var = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new w5();
                            case 24:
                                n4 n4Var2 = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (mp1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, mp1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 25:
                                n4 n4Var3 = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new op1.c((mp1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(mp1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                n4 n4Var4 = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var8 = p005kotlin.jvm.internal.s0.f105811a;
                                Object orNull = parametersHolder.getOrNull(t0Var8.b(Long.class));
                                if (orNull != null) {
                                    return new yp1.a(((Number) orNull).longValue(), (op1.a) scope.get((k23.d<?>) t0Var8.b(op1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                                }
                                throw new DefinitionParameterException(i3.e5.i(t0Var8, Long.class, new StringBuilder("No value found for type '"), CoreConstants.SINGLE_QUOTE_CHAR));
                            case 27:
                                p4 p4Var = p4.f92886a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var9 = p005kotlin.jvm.internal.s0.f105811a;
                                return new dq1.q((au0.z) scope.get((k23.d<?>) t0Var9.b(au0.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (au0.x) scope.get((k23.d<?>) t0Var9.b(au0.x.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (bu0.j) scope.get((k23.d<?>) t0Var9.b(bu0.j.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                p4 p4Var2 = p4.f92886a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new cq1.h(ModuleExtKt.androidContext(scope), (com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                p4 p4Var3 = p4.f92886a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new cq1.j((d12.e) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(d12.e.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                        }
                    }
                }, kind6, j0Var5), module10));
                break;
            case 10:
                Module module11 = (Module) obj;
                v3 v3Var = v3.f92958a;
                module11.getClass();
                e23.p pVar9 = new e23.p() { // from class: id0.t3
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) throws DefinitionParameterException {
                        Scope scope = (Scope) obj2;
                        ParametersHolder parametersHolder = (ParametersHolder) obj3;
                        switch (i19) {
                            case 0:
                                u3 u3Var2 = u3.f92946a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new ql.d((ol.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ol.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                u3 u3Var3 = u3.f92946a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var6 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zl.b((f12.l) scope.get((k23.d<?>) t0Var6.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ql.a) scope.get((k23.d<?>) t0Var6.b(ql.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (il.b) scope.get((k23.d<?>) t0Var6.b(il.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (c22.o) scope.get((k23.d<?>) t0Var6.b(c22.o.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), new is1.e(null, 1, null), (Bundle) parametersHolder.elementAt(0, t0Var6.b(Bundle.class)));
                            case 2:
                                v3 v3Var2 = v3.f92958a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.i5();
                            case 3:
                                w3 w3Var = w3.f92974a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (yc1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, yc1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 4:
                                w3 w3Var2 = w3.f92974a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new zc1.c((yc1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(yc1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 5:
                                w3 w3Var3 = w3.f92974a;
                                scope.getClass();
                                parametersHolder.getClass();
                                Context contextAndroidContext = ModuleExtKt.androidContext(scope);
                                p005kotlin.jvm.internal.t0 t0Var7 = p005kotlin.jvm.internal.s0.f105811a;
                                return new gd1.a(contextAndroidContext, (zc1.a) scope.get((k23.d<?>) t0Var7.b(zc1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (f12.b) scope.get((k23.d<?>) t0Var7.b(f12.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                y3 y3Var = y3.f92998a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new hd1.c();
                            case 7:
                                z3 z3Var = z3.f93010a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd1.l(new PregnancyRemindersUpdater(ModuleExtKt.androidContext(scope)), new BloodPressureRemindersUpdater(ModuleExtKt.androidContext(scope)), new LifestyleLoggingRemindersUpdater(ModuleExtKt.androidContext(scope)), new NutritionRemindersUpdater(ModuleExtKt.androidContext(scope)));
                            case 8:
                                z3 z3Var2 = z3.f93010a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd1.k((kd1.l) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kd1.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                z3 z3Var3 = z3.f93010a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd1.j(ModuleExtKt.androidContext(scope), (kd1.k) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kd1.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                a4 a4Var = a4.f92662a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.k5();
                            case 11:
                                b4 b4Var = b4.f92675a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.l5();
                            case 12:
                                e4 e4Var = e4.f92718a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.n5();
                            case 13:
                                f4 f4Var = f4.f92753a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.o5();
                            case 14:
                                g4 g4Var = g4.f92769a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new zd0.h(ModuleExtKt.androidContext(scope));
                            case 15:
                                h4 h4Var = h4.f92783a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new b90.b();
                            case 16:
                                i4 i4Var = i4.f92795a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.p5();
                            case 17:
                                j4 j4Var = j4.f92810a;
                                scope.getClass();
                                parametersHolder.getClass();
                                pm1.a aVar = (pm1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(pm1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                bv.b.f21239a.getClass();
                                bv.b.a();
                                return new kd0.r5(aVar, com.garmin.android.apps.connectmobile.k1.f37122a);
                            case 18:
                                j4 j4Var2 = j4.f92810a;
                                scope.getClass();
                                parametersHolder.getClass();
                                tn1.d dVar = parametersHolder.size() > 0 ? (tn1.d) parametersHolder.get(0) : null;
                                return new tn1.g(dVar, (tn1.c) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(tn1.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), dVar != null ? new tn1.b(dVar) : null);
                            case 19:
                                k4 k4Var = k4.f92823a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new v5();
                            case 20:
                                k4 k4Var2 = k4.f92823a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new no1.a();
                            case 21:
                                l4 l4Var = l4.f92836a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new sd0.c();
                            case 22:
                                m4 m4Var = m4.f92848a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.d2();
                            case 23:
                                n4 n4Var = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new w5();
                            case 24:
                                n4 n4Var2 = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (mp1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, mp1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 25:
                                n4 n4Var3 = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new op1.c((mp1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(mp1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                n4 n4Var4 = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var8 = p005kotlin.jvm.internal.s0.f105811a;
                                Object orNull = parametersHolder.getOrNull(t0Var8.b(Long.class));
                                if (orNull != null) {
                                    return new yp1.a(((Number) orNull).longValue(), (op1.a) scope.get((k23.d<?>) t0Var8.b(op1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                                }
                                throw new DefinitionParameterException(i3.e5.i(t0Var8, Long.class, new StringBuilder("No value found for type '"), CoreConstants.SINGLE_QUOTE_CHAR));
                            case 27:
                                p4 p4Var = p4.f92886a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var9 = p005kotlin.jvm.internal.s0.f105811a;
                                return new dq1.q((au0.z) scope.get((k23.d<?>) t0Var9.b(au0.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (au0.x) scope.get((k23.d<?>) t0Var9.b(au0.x.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (bu0.j) scope.get((k23.d<?>) t0Var9.b(bu0.j.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                p4 p4Var2 = p4.f92886a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new cq1.h(ModuleExtKt.androidContext(scope), (com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                p4 p4Var3 = p4.f92886a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new cq1.j((d12.e) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(d12.e.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                        }
                    }
                };
                new KoinDefinition(module11, i3.e5.n(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), p005kotlin.jvm.internal.s0.f105811a.b(ic1.e.class), null, pVar9, Kind.Factory, p13.j0.f134944a), module11));
                break;
            case 11:
                Module module12 = (Module) obj;
                w3 w3Var = w3.f92974a;
                module12.getClass();
                e23.p pVar10 = new e23.p() { // from class: id0.t3
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) throws DefinitionParameterException {
                        Scope scope = (Scope) obj2;
                        ParametersHolder parametersHolder = (ParametersHolder) obj3;
                        switch (i18) {
                            case 0:
                                u3 u3Var2 = u3.f92946a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new ql.d((ol.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ol.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                u3 u3Var3 = u3.f92946a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var6 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zl.b((f12.l) scope.get((k23.d<?>) t0Var6.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ql.a) scope.get((k23.d<?>) t0Var6.b(ql.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (il.b) scope.get((k23.d<?>) t0Var6.b(il.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (c22.o) scope.get((k23.d<?>) t0Var6.b(c22.o.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), new is1.e(null, 1, null), (Bundle) parametersHolder.elementAt(0, t0Var6.b(Bundle.class)));
                            case 2:
                                v3 v3Var2 = v3.f92958a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.i5();
                            case 3:
                                w3 w3Var2 = w3.f92974a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (yc1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, yc1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 4:
                                w3 w3Var3 = w3.f92974a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new zc1.c((yc1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(yc1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 5:
                                w3 w3Var4 = w3.f92974a;
                                scope.getClass();
                                parametersHolder.getClass();
                                Context contextAndroidContext = ModuleExtKt.androidContext(scope);
                                p005kotlin.jvm.internal.t0 t0Var7 = p005kotlin.jvm.internal.s0.f105811a;
                                return new gd1.a(contextAndroidContext, (zc1.a) scope.get((k23.d<?>) t0Var7.b(zc1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (f12.b) scope.get((k23.d<?>) t0Var7.b(f12.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                y3 y3Var = y3.f92998a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new hd1.c();
                            case 7:
                                z3 z3Var = z3.f93010a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd1.l(new PregnancyRemindersUpdater(ModuleExtKt.androidContext(scope)), new BloodPressureRemindersUpdater(ModuleExtKt.androidContext(scope)), new LifestyleLoggingRemindersUpdater(ModuleExtKt.androidContext(scope)), new NutritionRemindersUpdater(ModuleExtKt.androidContext(scope)));
                            case 8:
                                z3 z3Var2 = z3.f93010a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd1.k((kd1.l) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kd1.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                z3 z3Var3 = z3.f93010a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd1.j(ModuleExtKt.androidContext(scope), (kd1.k) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kd1.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                a4 a4Var = a4.f92662a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.k5();
                            case 11:
                                b4 b4Var = b4.f92675a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.l5();
                            case 12:
                                e4 e4Var = e4.f92718a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.n5();
                            case 13:
                                f4 f4Var = f4.f92753a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.o5();
                            case 14:
                                g4 g4Var = g4.f92769a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new zd0.h(ModuleExtKt.androidContext(scope));
                            case 15:
                                h4 h4Var = h4.f92783a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new b90.b();
                            case 16:
                                i4 i4Var = i4.f92795a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.p5();
                            case 17:
                                j4 j4Var = j4.f92810a;
                                scope.getClass();
                                parametersHolder.getClass();
                                pm1.a aVar = (pm1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(pm1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                bv.b.f21239a.getClass();
                                bv.b.a();
                                return new kd0.r5(aVar, com.garmin.android.apps.connectmobile.k1.f37122a);
                            case 18:
                                j4 j4Var2 = j4.f92810a;
                                scope.getClass();
                                parametersHolder.getClass();
                                tn1.d dVar = parametersHolder.size() > 0 ? (tn1.d) parametersHolder.get(0) : null;
                                return new tn1.g(dVar, (tn1.c) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(tn1.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), dVar != null ? new tn1.b(dVar) : null);
                            case 19:
                                k4 k4Var = k4.f92823a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new v5();
                            case 20:
                                k4 k4Var2 = k4.f92823a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new no1.a();
                            case 21:
                                l4 l4Var = l4.f92836a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new sd0.c();
                            case 22:
                                m4 m4Var = m4.f92848a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.d2();
                            case 23:
                                n4 n4Var = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new w5();
                            case 24:
                                n4 n4Var2 = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (mp1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, mp1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 25:
                                n4 n4Var3 = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new op1.c((mp1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(mp1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                n4 n4Var4 = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var8 = p005kotlin.jvm.internal.s0.f105811a;
                                Object orNull = parametersHolder.getOrNull(t0Var8.b(Long.class));
                                if (orNull != null) {
                                    return new yp1.a(((Number) orNull).longValue(), (op1.a) scope.get((k23.d<?>) t0Var8.b(op1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                                }
                                throw new DefinitionParameterException(i3.e5.i(t0Var8, Long.class, new StringBuilder("No value found for type '"), CoreConstants.SINGLE_QUOTE_CHAR));
                            case 27:
                                p4 p4Var = p4.f92886a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var9 = p005kotlin.jvm.internal.s0.f105811a;
                                return new dq1.q((au0.z) scope.get((k23.d<?>) t0Var9.b(au0.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (au0.x) scope.get((k23.d<?>) t0Var9.b(au0.x.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (bu0.j) scope.get((k23.d<?>) t0Var9.b(bu0.j.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                p4 p4Var2 = p4.f92886a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new cq1.h(ModuleExtKt.androidContext(scope), (com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                p4 p4Var3 = p4.f92886a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new cq1.j((d12.e) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(d12.e.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                        }
                    }
                };
                ScopeRegistry.Companion companion6 = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier7 = companion6.getRootScopeQualifier();
                Kind kind7 = Kind.Factory;
                p13.j0 j0Var6 = p13.j0.f134944a;
                p005kotlin.jvm.internal.t0 t0Var6 = p005kotlin.jvm.internal.s0.f105811a;
                new KoinDefinition(module12, i3.e5.n(new BeanDefinition(rootScopeQualifier7, t0Var6.b(yc1.a.class), null, pVar10, kind7, j0Var6), module12));
                new KoinDefinition(module12, i3.e5.n(new BeanDefinition(companion6.getRootScopeQualifier(), t0Var6.b(zc1.a.class), null, new e23.p() { // from class: id0.t3
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) throws DefinitionParameterException {
                        Scope scope = (Scope) obj2;
                        ParametersHolder parametersHolder = (ParametersHolder) obj3;
                        switch (i17) {
                            case 0:
                                u3 u3Var2 = u3.f92946a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new ql.d((ol.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ol.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                u3 u3Var3 = u3.f92946a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var7 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zl.b((f12.l) scope.get((k23.d<?>) t0Var7.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ql.a) scope.get((k23.d<?>) t0Var7.b(ql.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (il.b) scope.get((k23.d<?>) t0Var7.b(il.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (c22.o) scope.get((k23.d<?>) t0Var7.b(c22.o.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), new is1.e(null, 1, null), (Bundle) parametersHolder.elementAt(0, t0Var7.b(Bundle.class)));
                            case 2:
                                v3 v3Var2 = v3.f92958a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.i5();
                            case 3:
                                w3 w3Var2 = w3.f92974a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (yc1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, yc1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 4:
                                w3 w3Var3 = w3.f92974a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new zc1.c((yc1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(yc1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 5:
                                w3 w3Var4 = w3.f92974a;
                                scope.getClass();
                                parametersHolder.getClass();
                                Context contextAndroidContext = ModuleExtKt.androidContext(scope);
                                p005kotlin.jvm.internal.t0 t0Var8 = p005kotlin.jvm.internal.s0.f105811a;
                                return new gd1.a(contextAndroidContext, (zc1.a) scope.get((k23.d<?>) t0Var8.b(zc1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (f12.b) scope.get((k23.d<?>) t0Var8.b(f12.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                y3 y3Var = y3.f92998a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new hd1.c();
                            case 7:
                                z3 z3Var = z3.f93010a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd1.l(new PregnancyRemindersUpdater(ModuleExtKt.androidContext(scope)), new BloodPressureRemindersUpdater(ModuleExtKt.androidContext(scope)), new LifestyleLoggingRemindersUpdater(ModuleExtKt.androidContext(scope)), new NutritionRemindersUpdater(ModuleExtKt.androidContext(scope)));
                            case 8:
                                z3 z3Var2 = z3.f93010a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd1.k((kd1.l) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kd1.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                z3 z3Var3 = z3.f93010a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd1.j(ModuleExtKt.androidContext(scope), (kd1.k) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kd1.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                a4 a4Var = a4.f92662a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.k5();
                            case 11:
                                b4 b4Var = b4.f92675a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.l5();
                            case 12:
                                e4 e4Var = e4.f92718a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.n5();
                            case 13:
                                f4 f4Var = f4.f92753a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.o5();
                            case 14:
                                g4 g4Var = g4.f92769a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new zd0.h(ModuleExtKt.androidContext(scope));
                            case 15:
                                h4 h4Var = h4.f92783a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new b90.b();
                            case 16:
                                i4 i4Var = i4.f92795a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.p5();
                            case 17:
                                j4 j4Var = j4.f92810a;
                                scope.getClass();
                                parametersHolder.getClass();
                                pm1.a aVar = (pm1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(pm1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                bv.b.f21239a.getClass();
                                bv.b.a();
                                return new kd0.r5(aVar, com.garmin.android.apps.connectmobile.k1.f37122a);
                            case 18:
                                j4 j4Var2 = j4.f92810a;
                                scope.getClass();
                                parametersHolder.getClass();
                                tn1.d dVar = parametersHolder.size() > 0 ? (tn1.d) parametersHolder.get(0) : null;
                                return new tn1.g(dVar, (tn1.c) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(tn1.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), dVar != null ? new tn1.b(dVar) : null);
                            case 19:
                                k4 k4Var = k4.f92823a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new v5();
                            case 20:
                                k4 k4Var2 = k4.f92823a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new no1.a();
                            case 21:
                                l4 l4Var = l4.f92836a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new sd0.c();
                            case 22:
                                m4 m4Var = m4.f92848a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.d2();
                            case 23:
                                n4 n4Var = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new w5();
                            case 24:
                                n4 n4Var2 = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (mp1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, mp1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 25:
                                n4 n4Var3 = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new op1.c((mp1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(mp1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                n4 n4Var4 = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var9 = p005kotlin.jvm.internal.s0.f105811a;
                                Object orNull = parametersHolder.getOrNull(t0Var9.b(Long.class));
                                if (orNull != null) {
                                    return new yp1.a(((Number) orNull).longValue(), (op1.a) scope.get((k23.d<?>) t0Var9.b(op1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                                }
                                throw new DefinitionParameterException(i3.e5.i(t0Var9, Long.class, new StringBuilder("No value found for type '"), CoreConstants.SINGLE_QUOTE_CHAR));
                            case 27:
                                p4 p4Var = p4.f92886a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var10 = p005kotlin.jvm.internal.s0.f105811a;
                                return new dq1.q((au0.z) scope.get((k23.d<?>) t0Var10.b(au0.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (au0.x) scope.get((k23.d<?>) t0Var10.b(au0.x.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (bu0.j) scope.get((k23.d<?>) t0Var10.b(bu0.j.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                p4 p4Var2 = p4.f92886a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new cq1.h(ModuleExtKt.androidContext(scope), (com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                p4 p4Var3 = p4.f92886a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new cq1.j((d12.e) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(d12.e.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                        }
                    }
                }, kind7, j0Var6), module12));
                new KoinDefinition(module12, i3.e5.n(new BeanDefinition(companion6.getRootScopeQualifier(), t0Var6.b(gd1.a.class), null, new e23.p() { // from class: id0.t3
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) throws DefinitionParameterException {
                        Scope scope = (Scope) obj2;
                        ParametersHolder parametersHolder = (ParametersHolder) obj3;
                        switch (i16) {
                            case 0:
                                u3 u3Var2 = u3.f92946a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new ql.d((ol.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ol.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                u3 u3Var3 = u3.f92946a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var7 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zl.b((f12.l) scope.get((k23.d<?>) t0Var7.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ql.a) scope.get((k23.d<?>) t0Var7.b(ql.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (il.b) scope.get((k23.d<?>) t0Var7.b(il.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (c22.o) scope.get((k23.d<?>) t0Var7.b(c22.o.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), new is1.e(null, 1, null), (Bundle) parametersHolder.elementAt(0, t0Var7.b(Bundle.class)));
                            case 2:
                                v3 v3Var2 = v3.f92958a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.i5();
                            case 3:
                                w3 w3Var2 = w3.f92974a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (yc1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, yc1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 4:
                                w3 w3Var3 = w3.f92974a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new zc1.c((yc1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(yc1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 5:
                                w3 w3Var4 = w3.f92974a;
                                scope.getClass();
                                parametersHolder.getClass();
                                Context contextAndroidContext = ModuleExtKt.androidContext(scope);
                                p005kotlin.jvm.internal.t0 t0Var8 = p005kotlin.jvm.internal.s0.f105811a;
                                return new gd1.a(contextAndroidContext, (zc1.a) scope.get((k23.d<?>) t0Var8.b(zc1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (f12.b) scope.get((k23.d<?>) t0Var8.b(f12.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                y3 y3Var = y3.f92998a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new hd1.c();
                            case 7:
                                z3 z3Var = z3.f93010a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd1.l(new PregnancyRemindersUpdater(ModuleExtKt.androidContext(scope)), new BloodPressureRemindersUpdater(ModuleExtKt.androidContext(scope)), new LifestyleLoggingRemindersUpdater(ModuleExtKt.androidContext(scope)), new NutritionRemindersUpdater(ModuleExtKt.androidContext(scope)));
                            case 8:
                                z3 z3Var2 = z3.f93010a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd1.k((kd1.l) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kd1.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                z3 z3Var3 = z3.f93010a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd1.j(ModuleExtKt.androidContext(scope), (kd1.k) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kd1.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                a4 a4Var = a4.f92662a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.k5();
                            case 11:
                                b4 b4Var = b4.f92675a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.l5();
                            case 12:
                                e4 e4Var = e4.f92718a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.n5();
                            case 13:
                                f4 f4Var = f4.f92753a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.o5();
                            case 14:
                                g4 g4Var = g4.f92769a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new zd0.h(ModuleExtKt.androidContext(scope));
                            case 15:
                                h4 h4Var = h4.f92783a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new b90.b();
                            case 16:
                                i4 i4Var = i4.f92795a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.p5();
                            case 17:
                                j4 j4Var = j4.f92810a;
                                scope.getClass();
                                parametersHolder.getClass();
                                pm1.a aVar = (pm1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(pm1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                bv.b.f21239a.getClass();
                                bv.b.a();
                                return new kd0.r5(aVar, com.garmin.android.apps.connectmobile.k1.f37122a);
                            case 18:
                                j4 j4Var2 = j4.f92810a;
                                scope.getClass();
                                parametersHolder.getClass();
                                tn1.d dVar = parametersHolder.size() > 0 ? (tn1.d) parametersHolder.get(0) : null;
                                return new tn1.g(dVar, (tn1.c) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(tn1.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), dVar != null ? new tn1.b(dVar) : null);
                            case 19:
                                k4 k4Var = k4.f92823a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new v5();
                            case 20:
                                k4 k4Var2 = k4.f92823a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new no1.a();
                            case 21:
                                l4 l4Var = l4.f92836a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new sd0.c();
                            case 22:
                                m4 m4Var = m4.f92848a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.d2();
                            case 23:
                                n4 n4Var = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new w5();
                            case 24:
                                n4 n4Var2 = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (mp1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, mp1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 25:
                                n4 n4Var3 = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new op1.c((mp1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(mp1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                n4 n4Var4 = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var9 = p005kotlin.jvm.internal.s0.f105811a;
                                Object orNull = parametersHolder.getOrNull(t0Var9.b(Long.class));
                                if (orNull != null) {
                                    return new yp1.a(((Number) orNull).longValue(), (op1.a) scope.get((k23.d<?>) t0Var9.b(op1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                                }
                                throw new DefinitionParameterException(i3.e5.i(t0Var9, Long.class, new StringBuilder("No value found for type '"), CoreConstants.SINGLE_QUOTE_CHAR));
                            case 27:
                                p4 p4Var = p4.f92886a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var10 = p005kotlin.jvm.internal.s0.f105811a;
                                return new dq1.q((au0.z) scope.get((k23.d<?>) t0Var10.b(au0.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (au0.x) scope.get((k23.d<?>) t0Var10.b(au0.x.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (bu0.j) scope.get((k23.d<?>) t0Var10.b(bu0.j.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                p4 p4Var2 = p4.f92886a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new cq1.h(ModuleExtKt.androidContext(scope), (com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                p4 p4Var3 = p4.f92886a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new cq1.j((d12.e) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(d12.e.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                        }
                    }
                }, kind7, j0Var6), module12));
                break;
            case 12:
                Module module13 = (Module) obj;
                x3 x3Var = x3.f92986a;
                module13.getClass();
                rc1.a.f151859a.getClass();
                module13.includes(rc1.a.f151860b);
                break;
            case 13:
                Module module14 = (Module) obj;
                y3 y3Var = y3.f92998a;
                module14.getClass();
                e23.p pVar11 = new e23.p() { // from class: id0.t3
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) throws DefinitionParameterException {
                        Scope scope = (Scope) obj2;
                        ParametersHolder parametersHolder = (ParametersHolder) obj3;
                        switch (i15) {
                            case 0:
                                u3 u3Var2 = u3.f92946a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new ql.d((ol.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ol.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                u3 u3Var3 = u3.f92946a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var7 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zl.b((f12.l) scope.get((k23.d<?>) t0Var7.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ql.a) scope.get((k23.d<?>) t0Var7.b(ql.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (il.b) scope.get((k23.d<?>) t0Var7.b(il.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (c22.o) scope.get((k23.d<?>) t0Var7.b(c22.o.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), new is1.e(null, 1, null), (Bundle) parametersHolder.elementAt(0, t0Var7.b(Bundle.class)));
                            case 2:
                                v3 v3Var2 = v3.f92958a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.i5();
                            case 3:
                                w3 w3Var2 = w3.f92974a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (yc1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, yc1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 4:
                                w3 w3Var3 = w3.f92974a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new zc1.c((yc1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(yc1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 5:
                                w3 w3Var4 = w3.f92974a;
                                scope.getClass();
                                parametersHolder.getClass();
                                Context contextAndroidContext = ModuleExtKt.androidContext(scope);
                                p005kotlin.jvm.internal.t0 t0Var8 = p005kotlin.jvm.internal.s0.f105811a;
                                return new gd1.a(contextAndroidContext, (zc1.a) scope.get((k23.d<?>) t0Var8.b(zc1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (f12.b) scope.get((k23.d<?>) t0Var8.b(f12.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                y3 y3Var2 = y3.f92998a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new hd1.c();
                            case 7:
                                z3 z3Var = z3.f93010a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd1.l(new PregnancyRemindersUpdater(ModuleExtKt.androidContext(scope)), new BloodPressureRemindersUpdater(ModuleExtKt.androidContext(scope)), new LifestyleLoggingRemindersUpdater(ModuleExtKt.androidContext(scope)), new NutritionRemindersUpdater(ModuleExtKt.androidContext(scope)));
                            case 8:
                                z3 z3Var2 = z3.f93010a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd1.k((kd1.l) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kd1.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                z3 z3Var3 = z3.f93010a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd1.j(ModuleExtKt.androidContext(scope), (kd1.k) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kd1.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                a4 a4Var = a4.f92662a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.k5();
                            case 11:
                                b4 b4Var = b4.f92675a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.l5();
                            case 12:
                                e4 e4Var = e4.f92718a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.n5();
                            case 13:
                                f4 f4Var = f4.f92753a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.o5();
                            case 14:
                                g4 g4Var = g4.f92769a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new zd0.h(ModuleExtKt.androidContext(scope));
                            case 15:
                                h4 h4Var = h4.f92783a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new b90.b();
                            case 16:
                                i4 i4Var = i4.f92795a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.p5();
                            case 17:
                                j4 j4Var = j4.f92810a;
                                scope.getClass();
                                parametersHolder.getClass();
                                pm1.a aVar = (pm1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(pm1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                bv.b.f21239a.getClass();
                                bv.b.a();
                                return new kd0.r5(aVar, com.garmin.android.apps.connectmobile.k1.f37122a);
                            case 18:
                                j4 j4Var2 = j4.f92810a;
                                scope.getClass();
                                parametersHolder.getClass();
                                tn1.d dVar = parametersHolder.size() > 0 ? (tn1.d) parametersHolder.get(0) : null;
                                return new tn1.g(dVar, (tn1.c) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(tn1.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), dVar != null ? new tn1.b(dVar) : null);
                            case 19:
                                k4 k4Var = k4.f92823a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new v5();
                            case 20:
                                k4 k4Var2 = k4.f92823a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new no1.a();
                            case 21:
                                l4 l4Var = l4.f92836a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new sd0.c();
                            case 22:
                                m4 m4Var = m4.f92848a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.d2();
                            case 23:
                                n4 n4Var = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new w5();
                            case 24:
                                n4 n4Var2 = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (mp1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, mp1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 25:
                                n4 n4Var3 = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new op1.c((mp1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(mp1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                n4 n4Var4 = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var9 = p005kotlin.jvm.internal.s0.f105811a;
                                Object orNull = parametersHolder.getOrNull(t0Var9.b(Long.class));
                                if (orNull != null) {
                                    return new yp1.a(((Number) orNull).longValue(), (op1.a) scope.get((k23.d<?>) t0Var9.b(op1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                                }
                                throw new DefinitionParameterException(i3.e5.i(t0Var9, Long.class, new StringBuilder("No value found for type '"), CoreConstants.SINGLE_QUOTE_CHAR));
                            case 27:
                                p4 p4Var = p4.f92886a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var10 = p005kotlin.jvm.internal.s0.f105811a;
                                return new dq1.q((au0.z) scope.get((k23.d<?>) t0Var10.b(au0.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (au0.x) scope.get((k23.d<?>) t0Var10.b(au0.x.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (bu0.j) scope.get((k23.d<?>) t0Var10.b(bu0.j.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                p4 p4Var2 = p4.f92886a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new cq1.h(ModuleExtKt.androidContext(scope), (com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                p4 p4Var3 = p4.f92886a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new cq1.j((d12.e) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(d12.e.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                        }
                    }
                };
                new KoinDefinition(module14, i3.e5.n(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), p005kotlin.jvm.internal.s0.f105811a.b(hd1.a.class), null, pVar11, Kind.Factory, p13.j0.f134944a), module14));
                break;
            case 14:
                Module module15 = (Module) obj;
                z3 z3Var = z3.f93010a;
                module15.getClass();
                e23.p pVar12 = new e23.p() { // from class: id0.t3
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) throws DefinitionParameterException {
                        Scope scope = (Scope) obj2;
                        ParametersHolder parametersHolder = (ParametersHolder) obj3;
                        switch (i28) {
                            case 0:
                                u3 u3Var2 = u3.f92946a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new ql.d((ol.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ol.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                u3 u3Var3 = u3.f92946a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var7 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zl.b((f12.l) scope.get((k23.d<?>) t0Var7.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ql.a) scope.get((k23.d<?>) t0Var7.b(ql.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (il.b) scope.get((k23.d<?>) t0Var7.b(il.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (c22.o) scope.get((k23.d<?>) t0Var7.b(c22.o.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), new is1.e(null, 1, null), (Bundle) parametersHolder.elementAt(0, t0Var7.b(Bundle.class)));
                            case 2:
                                v3 v3Var2 = v3.f92958a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.i5();
                            case 3:
                                w3 w3Var2 = w3.f92974a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (yc1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, yc1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 4:
                                w3 w3Var3 = w3.f92974a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new zc1.c((yc1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(yc1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 5:
                                w3 w3Var4 = w3.f92974a;
                                scope.getClass();
                                parametersHolder.getClass();
                                Context contextAndroidContext = ModuleExtKt.androidContext(scope);
                                p005kotlin.jvm.internal.t0 t0Var8 = p005kotlin.jvm.internal.s0.f105811a;
                                return new gd1.a(contextAndroidContext, (zc1.a) scope.get((k23.d<?>) t0Var8.b(zc1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (f12.b) scope.get((k23.d<?>) t0Var8.b(f12.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                y3 y3Var2 = y3.f92998a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new hd1.c();
                            case 7:
                                z3 z3Var2 = z3.f93010a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd1.l(new PregnancyRemindersUpdater(ModuleExtKt.androidContext(scope)), new BloodPressureRemindersUpdater(ModuleExtKt.androidContext(scope)), new LifestyleLoggingRemindersUpdater(ModuleExtKt.androidContext(scope)), new NutritionRemindersUpdater(ModuleExtKt.androidContext(scope)));
                            case 8:
                                z3 z3Var3 = z3.f93010a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd1.k((kd1.l) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kd1.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                z3 z3Var4 = z3.f93010a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd1.j(ModuleExtKt.androidContext(scope), (kd1.k) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kd1.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                a4 a4Var = a4.f92662a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.k5();
                            case 11:
                                b4 b4Var = b4.f92675a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.l5();
                            case 12:
                                e4 e4Var = e4.f92718a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.n5();
                            case 13:
                                f4 f4Var = f4.f92753a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.o5();
                            case 14:
                                g4 g4Var = g4.f92769a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new zd0.h(ModuleExtKt.androidContext(scope));
                            case 15:
                                h4 h4Var = h4.f92783a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new b90.b();
                            case 16:
                                i4 i4Var = i4.f92795a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.p5();
                            case 17:
                                j4 j4Var = j4.f92810a;
                                scope.getClass();
                                parametersHolder.getClass();
                                pm1.a aVar = (pm1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(pm1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                bv.b.f21239a.getClass();
                                bv.b.a();
                                return new kd0.r5(aVar, com.garmin.android.apps.connectmobile.k1.f37122a);
                            case 18:
                                j4 j4Var2 = j4.f92810a;
                                scope.getClass();
                                parametersHolder.getClass();
                                tn1.d dVar = parametersHolder.size() > 0 ? (tn1.d) parametersHolder.get(0) : null;
                                return new tn1.g(dVar, (tn1.c) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(tn1.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), dVar != null ? new tn1.b(dVar) : null);
                            case 19:
                                k4 k4Var = k4.f92823a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new v5();
                            case 20:
                                k4 k4Var2 = k4.f92823a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new no1.a();
                            case 21:
                                l4 l4Var = l4.f92836a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new sd0.c();
                            case 22:
                                m4 m4Var = m4.f92848a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.d2();
                            case 23:
                                n4 n4Var = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new w5();
                            case 24:
                                n4 n4Var2 = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (mp1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, mp1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 25:
                                n4 n4Var3 = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new op1.c((mp1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(mp1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                n4 n4Var4 = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var9 = p005kotlin.jvm.internal.s0.f105811a;
                                Object orNull = parametersHolder.getOrNull(t0Var9.b(Long.class));
                                if (orNull != null) {
                                    return new yp1.a(((Number) orNull).longValue(), (op1.a) scope.get((k23.d<?>) t0Var9.b(op1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                                }
                                throw new DefinitionParameterException(i3.e5.i(t0Var9, Long.class, new StringBuilder("No value found for type '"), CoreConstants.SINGLE_QUOTE_CHAR));
                            case 27:
                                p4 p4Var = p4.f92886a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var10 = p005kotlin.jvm.internal.s0.f105811a;
                                return new dq1.q((au0.z) scope.get((k23.d<?>) t0Var10.b(au0.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (au0.x) scope.get((k23.d<?>) t0Var10.b(au0.x.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (bu0.j) scope.get((k23.d<?>) t0Var10.b(bu0.j.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                p4 p4Var2 = p4.f92886a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new cq1.h(ModuleExtKt.androidContext(scope), (com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                p4 p4Var3 = p4.f92886a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new cq1.j((d12.e) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(d12.e.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                        }
                    }
                };
                ScopeRegistry.Companion companion7 = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier8 = companion7.getRootScopeQualifier();
                Kind kind8 = Kind.Factory;
                p13.j0 j0Var7 = p13.j0.f134944a;
                p005kotlin.jvm.internal.t0 t0Var7 = p005kotlin.jvm.internal.s0.f105811a;
                new KoinDefinition(module15, i3.e5.n(new BeanDefinition(rootScopeQualifier8, t0Var7.b(kd1.l.class), null, pVar12, kind8, j0Var7), module15));
                new KoinDefinition(module15, i3.e5.n(new BeanDefinition(companion7.getRootScopeQualifier(), t0Var7.b(kd1.k.class), null, new e23.p() { // from class: id0.t3
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) throws DefinitionParameterException {
                        Scope scope = (Scope) obj2;
                        ParametersHolder parametersHolder = (ParametersHolder) obj3;
                        switch (i14) {
                            case 0:
                                u3 u3Var2 = u3.f92946a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new ql.d((ol.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ol.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                u3 u3Var3 = u3.f92946a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var8 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zl.b((f12.l) scope.get((k23.d<?>) t0Var8.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ql.a) scope.get((k23.d<?>) t0Var8.b(ql.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (il.b) scope.get((k23.d<?>) t0Var8.b(il.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (c22.o) scope.get((k23.d<?>) t0Var8.b(c22.o.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), new is1.e(null, 1, null), (Bundle) parametersHolder.elementAt(0, t0Var8.b(Bundle.class)));
                            case 2:
                                v3 v3Var2 = v3.f92958a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.i5();
                            case 3:
                                w3 w3Var2 = w3.f92974a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (yc1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, yc1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 4:
                                w3 w3Var3 = w3.f92974a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new zc1.c((yc1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(yc1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 5:
                                w3 w3Var4 = w3.f92974a;
                                scope.getClass();
                                parametersHolder.getClass();
                                Context contextAndroidContext = ModuleExtKt.androidContext(scope);
                                p005kotlin.jvm.internal.t0 t0Var9 = p005kotlin.jvm.internal.s0.f105811a;
                                return new gd1.a(contextAndroidContext, (zc1.a) scope.get((k23.d<?>) t0Var9.b(zc1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (f12.b) scope.get((k23.d<?>) t0Var9.b(f12.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                y3 y3Var2 = y3.f92998a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new hd1.c();
                            case 7:
                                z3 z3Var2 = z3.f93010a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd1.l(new PregnancyRemindersUpdater(ModuleExtKt.androidContext(scope)), new BloodPressureRemindersUpdater(ModuleExtKt.androidContext(scope)), new LifestyleLoggingRemindersUpdater(ModuleExtKt.androidContext(scope)), new NutritionRemindersUpdater(ModuleExtKt.androidContext(scope)));
                            case 8:
                                z3 z3Var3 = z3.f93010a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd1.k((kd1.l) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kd1.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                z3 z3Var4 = z3.f93010a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd1.j(ModuleExtKt.androidContext(scope), (kd1.k) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kd1.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                a4 a4Var = a4.f92662a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.k5();
                            case 11:
                                b4 b4Var = b4.f92675a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.l5();
                            case 12:
                                e4 e4Var = e4.f92718a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.n5();
                            case 13:
                                f4 f4Var = f4.f92753a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.o5();
                            case 14:
                                g4 g4Var = g4.f92769a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new zd0.h(ModuleExtKt.androidContext(scope));
                            case 15:
                                h4 h4Var = h4.f92783a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new b90.b();
                            case 16:
                                i4 i4Var = i4.f92795a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.p5();
                            case 17:
                                j4 j4Var = j4.f92810a;
                                scope.getClass();
                                parametersHolder.getClass();
                                pm1.a aVar = (pm1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(pm1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                bv.b.f21239a.getClass();
                                bv.b.a();
                                return new kd0.r5(aVar, com.garmin.android.apps.connectmobile.k1.f37122a);
                            case 18:
                                j4 j4Var2 = j4.f92810a;
                                scope.getClass();
                                parametersHolder.getClass();
                                tn1.d dVar = parametersHolder.size() > 0 ? (tn1.d) parametersHolder.get(0) : null;
                                return new tn1.g(dVar, (tn1.c) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(tn1.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), dVar != null ? new tn1.b(dVar) : null);
                            case 19:
                                k4 k4Var = k4.f92823a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new v5();
                            case 20:
                                k4 k4Var2 = k4.f92823a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new no1.a();
                            case 21:
                                l4 l4Var = l4.f92836a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new sd0.c();
                            case 22:
                                m4 m4Var = m4.f92848a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.d2();
                            case 23:
                                n4 n4Var = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new w5();
                            case 24:
                                n4 n4Var2 = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (mp1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, mp1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 25:
                                n4 n4Var3 = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new op1.c((mp1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(mp1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                n4 n4Var4 = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var10 = p005kotlin.jvm.internal.s0.f105811a;
                                Object orNull = parametersHolder.getOrNull(t0Var10.b(Long.class));
                                if (orNull != null) {
                                    return new yp1.a(((Number) orNull).longValue(), (op1.a) scope.get((k23.d<?>) t0Var10.b(op1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                                }
                                throw new DefinitionParameterException(i3.e5.i(t0Var10, Long.class, new StringBuilder("No value found for type '"), CoreConstants.SINGLE_QUOTE_CHAR));
                            case 27:
                                p4 p4Var = p4.f92886a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var11 = p005kotlin.jvm.internal.s0.f105811a;
                                return new dq1.q((au0.z) scope.get((k23.d<?>) t0Var11.b(au0.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (au0.x) scope.get((k23.d<?>) t0Var11.b(au0.x.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (bu0.j) scope.get((k23.d<?>) t0Var11.b(bu0.j.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                p4 p4Var2 = p4.f92886a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new cq1.h(ModuleExtKt.androidContext(scope), (com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                p4 p4Var3 = p4.f92886a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new cq1.j((d12.e) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(d12.e.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                        }
                    }
                }, kind8, j0Var7), module15));
                final int i59 = 9;
                new KoinDefinition(module15, i3.e5.n(new BeanDefinition(companion7.getRootScopeQualifier(), t0Var7.b(kd1.j.class), null, new e23.p() { // from class: id0.t3
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) throws DefinitionParameterException {
                        Scope scope = (Scope) obj2;
                        ParametersHolder parametersHolder = (ParametersHolder) obj3;
                        switch (i59) {
                            case 0:
                                u3 u3Var2 = u3.f92946a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new ql.d((ol.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ol.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                u3 u3Var3 = u3.f92946a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var8 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zl.b((f12.l) scope.get((k23.d<?>) t0Var8.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ql.a) scope.get((k23.d<?>) t0Var8.b(ql.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (il.b) scope.get((k23.d<?>) t0Var8.b(il.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (c22.o) scope.get((k23.d<?>) t0Var8.b(c22.o.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), new is1.e(null, 1, null), (Bundle) parametersHolder.elementAt(0, t0Var8.b(Bundle.class)));
                            case 2:
                                v3 v3Var2 = v3.f92958a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.i5();
                            case 3:
                                w3 w3Var2 = w3.f92974a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (yc1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, yc1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 4:
                                w3 w3Var3 = w3.f92974a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new zc1.c((yc1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(yc1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 5:
                                w3 w3Var4 = w3.f92974a;
                                scope.getClass();
                                parametersHolder.getClass();
                                Context contextAndroidContext = ModuleExtKt.androidContext(scope);
                                p005kotlin.jvm.internal.t0 t0Var9 = p005kotlin.jvm.internal.s0.f105811a;
                                return new gd1.a(contextAndroidContext, (zc1.a) scope.get((k23.d<?>) t0Var9.b(zc1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (f12.b) scope.get((k23.d<?>) t0Var9.b(f12.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                y3 y3Var2 = y3.f92998a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new hd1.c();
                            case 7:
                                z3 z3Var2 = z3.f93010a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd1.l(new PregnancyRemindersUpdater(ModuleExtKt.androidContext(scope)), new BloodPressureRemindersUpdater(ModuleExtKt.androidContext(scope)), new LifestyleLoggingRemindersUpdater(ModuleExtKt.androidContext(scope)), new NutritionRemindersUpdater(ModuleExtKt.androidContext(scope)));
                            case 8:
                                z3 z3Var3 = z3.f93010a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd1.k((kd1.l) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kd1.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                z3 z3Var4 = z3.f93010a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd1.j(ModuleExtKt.androidContext(scope), (kd1.k) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kd1.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                a4 a4Var = a4.f92662a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.k5();
                            case 11:
                                b4 b4Var = b4.f92675a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.l5();
                            case 12:
                                e4 e4Var = e4.f92718a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.n5();
                            case 13:
                                f4 f4Var = f4.f92753a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.o5();
                            case 14:
                                g4 g4Var = g4.f92769a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new zd0.h(ModuleExtKt.androidContext(scope));
                            case 15:
                                h4 h4Var = h4.f92783a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new b90.b();
                            case 16:
                                i4 i4Var = i4.f92795a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.p5();
                            case 17:
                                j4 j4Var = j4.f92810a;
                                scope.getClass();
                                parametersHolder.getClass();
                                pm1.a aVar = (pm1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(pm1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                bv.b.f21239a.getClass();
                                bv.b.a();
                                return new kd0.r5(aVar, com.garmin.android.apps.connectmobile.k1.f37122a);
                            case 18:
                                j4 j4Var2 = j4.f92810a;
                                scope.getClass();
                                parametersHolder.getClass();
                                tn1.d dVar = parametersHolder.size() > 0 ? (tn1.d) parametersHolder.get(0) : null;
                                return new tn1.g(dVar, (tn1.c) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(tn1.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), dVar != null ? new tn1.b(dVar) : null);
                            case 19:
                                k4 k4Var = k4.f92823a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new v5();
                            case 20:
                                k4 k4Var2 = k4.f92823a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new no1.a();
                            case 21:
                                l4 l4Var = l4.f92836a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new sd0.c();
                            case 22:
                                m4 m4Var = m4.f92848a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.d2();
                            case 23:
                                n4 n4Var = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new w5();
                            case 24:
                                n4 n4Var2 = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (mp1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, mp1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 25:
                                n4 n4Var3 = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new op1.c((mp1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(mp1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                n4 n4Var4 = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var10 = p005kotlin.jvm.internal.s0.f105811a;
                                Object orNull = parametersHolder.getOrNull(t0Var10.b(Long.class));
                                if (orNull != null) {
                                    return new yp1.a(((Number) orNull).longValue(), (op1.a) scope.get((k23.d<?>) t0Var10.b(op1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                                }
                                throw new DefinitionParameterException(i3.e5.i(t0Var10, Long.class, new StringBuilder("No value found for type '"), CoreConstants.SINGLE_QUOTE_CHAR));
                            case 27:
                                p4 p4Var = p4.f92886a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var11 = p005kotlin.jvm.internal.s0.f105811a;
                                return new dq1.q((au0.z) scope.get((k23.d<?>) t0Var11.b(au0.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (au0.x) scope.get((k23.d<?>) t0Var11.b(au0.x.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (bu0.j) scope.get((k23.d<?>) t0Var11.b(bu0.j.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                p4 p4Var2 = p4.f92886a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new cq1.h(ModuleExtKt.androidContext(scope), (com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                p4 p4Var3 = p4.f92886a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new cq1.j((d12.e) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(d12.e.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                        }
                    }
                }, kind8, j0Var7), module15));
                break;
            case 15:
                Module module16 = (Module) obj;
                a4 a4Var = a4.f92662a;
                module16.getClass();
                final int i64 = 10;
                e23.p pVar13 = new e23.p() { // from class: id0.t3
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) throws DefinitionParameterException {
                        Scope scope = (Scope) obj2;
                        ParametersHolder parametersHolder = (ParametersHolder) obj3;
                        switch (i64) {
                            case 0:
                                u3 u3Var2 = u3.f92946a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new ql.d((ol.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ol.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                u3 u3Var3 = u3.f92946a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var8 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zl.b((f12.l) scope.get((k23.d<?>) t0Var8.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ql.a) scope.get((k23.d<?>) t0Var8.b(ql.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (il.b) scope.get((k23.d<?>) t0Var8.b(il.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (c22.o) scope.get((k23.d<?>) t0Var8.b(c22.o.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), new is1.e(null, 1, null), (Bundle) parametersHolder.elementAt(0, t0Var8.b(Bundle.class)));
                            case 2:
                                v3 v3Var2 = v3.f92958a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.i5();
                            case 3:
                                w3 w3Var2 = w3.f92974a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (yc1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, yc1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 4:
                                w3 w3Var3 = w3.f92974a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new zc1.c((yc1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(yc1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 5:
                                w3 w3Var4 = w3.f92974a;
                                scope.getClass();
                                parametersHolder.getClass();
                                Context contextAndroidContext = ModuleExtKt.androidContext(scope);
                                p005kotlin.jvm.internal.t0 t0Var9 = p005kotlin.jvm.internal.s0.f105811a;
                                return new gd1.a(contextAndroidContext, (zc1.a) scope.get((k23.d<?>) t0Var9.b(zc1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (f12.b) scope.get((k23.d<?>) t0Var9.b(f12.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                y3 y3Var2 = y3.f92998a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new hd1.c();
                            case 7:
                                z3 z3Var2 = z3.f93010a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd1.l(new PregnancyRemindersUpdater(ModuleExtKt.androidContext(scope)), new BloodPressureRemindersUpdater(ModuleExtKt.androidContext(scope)), new LifestyleLoggingRemindersUpdater(ModuleExtKt.androidContext(scope)), new NutritionRemindersUpdater(ModuleExtKt.androidContext(scope)));
                            case 8:
                                z3 z3Var3 = z3.f93010a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd1.k((kd1.l) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kd1.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                z3 z3Var4 = z3.f93010a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd1.j(ModuleExtKt.androidContext(scope), (kd1.k) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kd1.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                a4 a4Var2 = a4.f92662a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.k5();
                            case 11:
                                b4 b4Var = b4.f92675a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.l5();
                            case 12:
                                e4 e4Var = e4.f92718a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.n5();
                            case 13:
                                f4 f4Var = f4.f92753a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.o5();
                            case 14:
                                g4 g4Var = g4.f92769a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new zd0.h(ModuleExtKt.androidContext(scope));
                            case 15:
                                h4 h4Var = h4.f92783a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new b90.b();
                            case 16:
                                i4 i4Var = i4.f92795a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.p5();
                            case 17:
                                j4 j4Var = j4.f92810a;
                                scope.getClass();
                                parametersHolder.getClass();
                                pm1.a aVar = (pm1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(pm1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                bv.b.f21239a.getClass();
                                bv.b.a();
                                return new kd0.r5(aVar, com.garmin.android.apps.connectmobile.k1.f37122a);
                            case 18:
                                j4 j4Var2 = j4.f92810a;
                                scope.getClass();
                                parametersHolder.getClass();
                                tn1.d dVar = parametersHolder.size() > 0 ? (tn1.d) parametersHolder.get(0) : null;
                                return new tn1.g(dVar, (tn1.c) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(tn1.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), dVar != null ? new tn1.b(dVar) : null);
                            case 19:
                                k4 k4Var = k4.f92823a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new v5();
                            case 20:
                                k4 k4Var2 = k4.f92823a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new no1.a();
                            case 21:
                                l4 l4Var = l4.f92836a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new sd0.c();
                            case 22:
                                m4 m4Var = m4.f92848a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.d2();
                            case 23:
                                n4 n4Var = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new w5();
                            case 24:
                                n4 n4Var2 = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (mp1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, mp1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 25:
                                n4 n4Var3 = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new op1.c((mp1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(mp1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                n4 n4Var4 = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var10 = p005kotlin.jvm.internal.s0.f105811a;
                                Object orNull = parametersHolder.getOrNull(t0Var10.b(Long.class));
                                if (orNull != null) {
                                    return new yp1.a(((Number) orNull).longValue(), (op1.a) scope.get((k23.d<?>) t0Var10.b(op1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                                }
                                throw new DefinitionParameterException(i3.e5.i(t0Var10, Long.class, new StringBuilder("No value found for type '"), CoreConstants.SINGLE_QUOTE_CHAR));
                            case 27:
                                p4 p4Var = p4.f92886a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var11 = p005kotlin.jvm.internal.s0.f105811a;
                                return new dq1.q((au0.z) scope.get((k23.d<?>) t0Var11.b(au0.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (au0.x) scope.get((k23.d<?>) t0Var11.b(au0.x.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (bu0.j) scope.get((k23.d<?>) t0Var11.b(bu0.j.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                p4 p4Var2 = p4.f92886a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new cq1.h(ModuleExtKt.androidContext(scope), (com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                p4 p4Var3 = p4.f92886a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new cq1.j((d12.e) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(d12.e.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                        }
                    }
                };
                new KoinDefinition(module16, i3.e5.n(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), p005kotlin.jvm.internal.s0.f105811a.b(ga1.a.class), null, pVar13, Kind.Factory, p13.j0.f134944a), module16));
                break;
            case 16:
                Module module17 = (Module) obj;
                b4 b4Var = b4.f92675a;
                module17.getClass();
                final int i65 = 11;
                e23.p pVar14 = new e23.p() { // from class: id0.t3
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) throws DefinitionParameterException {
                        Scope scope = (Scope) obj2;
                        ParametersHolder parametersHolder = (ParametersHolder) obj3;
                        switch (i65) {
                            case 0:
                                u3 u3Var2 = u3.f92946a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new ql.d((ol.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ol.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                u3 u3Var3 = u3.f92946a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var8 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zl.b((f12.l) scope.get((k23.d<?>) t0Var8.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ql.a) scope.get((k23.d<?>) t0Var8.b(ql.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (il.b) scope.get((k23.d<?>) t0Var8.b(il.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (c22.o) scope.get((k23.d<?>) t0Var8.b(c22.o.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), new is1.e(null, 1, null), (Bundle) parametersHolder.elementAt(0, t0Var8.b(Bundle.class)));
                            case 2:
                                v3 v3Var2 = v3.f92958a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.i5();
                            case 3:
                                w3 w3Var2 = w3.f92974a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (yc1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, yc1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 4:
                                w3 w3Var3 = w3.f92974a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new zc1.c((yc1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(yc1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 5:
                                w3 w3Var4 = w3.f92974a;
                                scope.getClass();
                                parametersHolder.getClass();
                                Context contextAndroidContext = ModuleExtKt.androidContext(scope);
                                p005kotlin.jvm.internal.t0 t0Var9 = p005kotlin.jvm.internal.s0.f105811a;
                                return new gd1.a(contextAndroidContext, (zc1.a) scope.get((k23.d<?>) t0Var9.b(zc1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (f12.b) scope.get((k23.d<?>) t0Var9.b(f12.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                y3 y3Var2 = y3.f92998a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new hd1.c();
                            case 7:
                                z3 z3Var2 = z3.f93010a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd1.l(new PregnancyRemindersUpdater(ModuleExtKt.androidContext(scope)), new BloodPressureRemindersUpdater(ModuleExtKt.androidContext(scope)), new LifestyleLoggingRemindersUpdater(ModuleExtKt.androidContext(scope)), new NutritionRemindersUpdater(ModuleExtKt.androidContext(scope)));
                            case 8:
                                z3 z3Var3 = z3.f93010a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd1.k((kd1.l) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kd1.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                z3 z3Var4 = z3.f93010a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd1.j(ModuleExtKt.androidContext(scope), (kd1.k) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kd1.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                a4 a4Var2 = a4.f92662a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.k5();
                            case 11:
                                b4 b4Var2 = b4.f92675a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.l5();
                            case 12:
                                e4 e4Var = e4.f92718a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.n5();
                            case 13:
                                f4 f4Var = f4.f92753a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.o5();
                            case 14:
                                g4 g4Var = g4.f92769a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new zd0.h(ModuleExtKt.androidContext(scope));
                            case 15:
                                h4 h4Var = h4.f92783a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new b90.b();
                            case 16:
                                i4 i4Var = i4.f92795a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.p5();
                            case 17:
                                j4 j4Var = j4.f92810a;
                                scope.getClass();
                                parametersHolder.getClass();
                                pm1.a aVar = (pm1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(pm1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                bv.b.f21239a.getClass();
                                bv.b.a();
                                return new kd0.r5(aVar, com.garmin.android.apps.connectmobile.k1.f37122a);
                            case 18:
                                j4 j4Var2 = j4.f92810a;
                                scope.getClass();
                                parametersHolder.getClass();
                                tn1.d dVar = parametersHolder.size() > 0 ? (tn1.d) parametersHolder.get(0) : null;
                                return new tn1.g(dVar, (tn1.c) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(tn1.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), dVar != null ? new tn1.b(dVar) : null);
                            case 19:
                                k4 k4Var = k4.f92823a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new v5();
                            case 20:
                                k4 k4Var2 = k4.f92823a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new no1.a();
                            case 21:
                                l4 l4Var = l4.f92836a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new sd0.c();
                            case 22:
                                m4 m4Var = m4.f92848a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.d2();
                            case 23:
                                n4 n4Var = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new w5();
                            case 24:
                                n4 n4Var2 = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (mp1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, mp1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 25:
                                n4 n4Var3 = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new op1.c((mp1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(mp1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                n4 n4Var4 = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var10 = p005kotlin.jvm.internal.s0.f105811a;
                                Object orNull = parametersHolder.getOrNull(t0Var10.b(Long.class));
                                if (orNull != null) {
                                    return new yp1.a(((Number) orNull).longValue(), (op1.a) scope.get((k23.d<?>) t0Var10.b(op1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                                }
                                throw new DefinitionParameterException(i3.e5.i(t0Var10, Long.class, new StringBuilder("No value found for type '"), CoreConstants.SINGLE_QUOTE_CHAR));
                            case 27:
                                p4 p4Var = p4.f92886a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var11 = p005kotlin.jvm.internal.s0.f105811a;
                                return new dq1.q((au0.z) scope.get((k23.d<?>) t0Var11.b(au0.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (au0.x) scope.get((k23.d<?>) t0Var11.b(au0.x.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (bu0.j) scope.get((k23.d<?>) t0Var11.b(bu0.j.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                p4 p4Var2 = p4.f92886a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new cq1.h(ModuleExtKt.androidContext(scope), (com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                p4 p4Var3 = p4.f92886a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new cq1.j((d12.e) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(d12.e.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                        }
                    }
                };
                new KoinDefinition(module17, i3.e5.n(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), p005kotlin.jvm.internal.s0.f105811a.b(de1.a.class), null, pVar14, Kind.Factory, p13.j0.f134944a), module17));
                ce1.b.f26892a.getClass();
                module17.includes(ce1.b.f26893b);
                break;
            case 17:
                Module module18 = (Module) obj;
                c4 c4Var = c4.f92690a;
                module18.getClass();
                se1.b.f158746a.getClass();
                module18.includes(se1.b.f158747b);
                break;
            case 18:
                Module module19 = (Module) obj;
                d4 d4Var = d4.f92706a;
                module19.getClass();
                gf1.b.f77075a.getClass();
                module19.includes(gf1.b.f77076b);
                break;
            case 19:
                Module module20 = (Module) obj;
                e4 e4Var = e4.f92718a;
                module20.getClass();
                final int i66 = 12;
                e23.p pVar15 = new e23.p() { // from class: id0.t3
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) throws DefinitionParameterException {
                        Scope scope = (Scope) obj2;
                        ParametersHolder parametersHolder = (ParametersHolder) obj3;
                        switch (i66) {
                            case 0:
                                u3 u3Var2 = u3.f92946a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new ql.d((ol.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ol.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                u3 u3Var3 = u3.f92946a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var8 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zl.b((f12.l) scope.get((k23.d<?>) t0Var8.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ql.a) scope.get((k23.d<?>) t0Var8.b(ql.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (il.b) scope.get((k23.d<?>) t0Var8.b(il.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (c22.o) scope.get((k23.d<?>) t0Var8.b(c22.o.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), new is1.e(null, 1, null), (Bundle) parametersHolder.elementAt(0, t0Var8.b(Bundle.class)));
                            case 2:
                                v3 v3Var2 = v3.f92958a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.i5();
                            case 3:
                                w3 w3Var2 = w3.f92974a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (yc1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, yc1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 4:
                                w3 w3Var3 = w3.f92974a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new zc1.c((yc1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(yc1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 5:
                                w3 w3Var4 = w3.f92974a;
                                scope.getClass();
                                parametersHolder.getClass();
                                Context contextAndroidContext = ModuleExtKt.androidContext(scope);
                                p005kotlin.jvm.internal.t0 t0Var9 = p005kotlin.jvm.internal.s0.f105811a;
                                return new gd1.a(contextAndroidContext, (zc1.a) scope.get((k23.d<?>) t0Var9.b(zc1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (f12.b) scope.get((k23.d<?>) t0Var9.b(f12.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                y3 y3Var2 = y3.f92998a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new hd1.c();
                            case 7:
                                z3 z3Var2 = z3.f93010a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd1.l(new PregnancyRemindersUpdater(ModuleExtKt.androidContext(scope)), new BloodPressureRemindersUpdater(ModuleExtKt.androidContext(scope)), new LifestyleLoggingRemindersUpdater(ModuleExtKt.androidContext(scope)), new NutritionRemindersUpdater(ModuleExtKt.androidContext(scope)));
                            case 8:
                                z3 z3Var3 = z3.f93010a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd1.k((kd1.l) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kd1.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                z3 z3Var4 = z3.f93010a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd1.j(ModuleExtKt.androidContext(scope), (kd1.k) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kd1.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                a4 a4Var2 = a4.f92662a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.k5();
                            case 11:
                                b4 b4Var2 = b4.f92675a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.l5();
                            case 12:
                                e4 e4Var2 = e4.f92718a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.n5();
                            case 13:
                                f4 f4Var = f4.f92753a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.o5();
                            case 14:
                                g4 g4Var = g4.f92769a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new zd0.h(ModuleExtKt.androidContext(scope));
                            case 15:
                                h4 h4Var = h4.f92783a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new b90.b();
                            case 16:
                                i4 i4Var = i4.f92795a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.p5();
                            case 17:
                                j4 j4Var = j4.f92810a;
                                scope.getClass();
                                parametersHolder.getClass();
                                pm1.a aVar = (pm1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(pm1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                bv.b.f21239a.getClass();
                                bv.b.a();
                                return new kd0.r5(aVar, com.garmin.android.apps.connectmobile.k1.f37122a);
                            case 18:
                                j4 j4Var2 = j4.f92810a;
                                scope.getClass();
                                parametersHolder.getClass();
                                tn1.d dVar = parametersHolder.size() > 0 ? (tn1.d) parametersHolder.get(0) : null;
                                return new tn1.g(dVar, (tn1.c) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(tn1.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), dVar != null ? new tn1.b(dVar) : null);
                            case 19:
                                k4 k4Var = k4.f92823a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new v5();
                            case 20:
                                k4 k4Var2 = k4.f92823a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new no1.a();
                            case 21:
                                l4 l4Var = l4.f92836a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new sd0.c();
                            case 22:
                                m4 m4Var = m4.f92848a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.d2();
                            case 23:
                                n4 n4Var = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new w5();
                            case 24:
                                n4 n4Var2 = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (mp1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, mp1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 25:
                                n4 n4Var3 = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new op1.c((mp1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(mp1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                n4 n4Var4 = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var10 = p005kotlin.jvm.internal.s0.f105811a;
                                Object orNull = parametersHolder.getOrNull(t0Var10.b(Long.class));
                                if (orNull != null) {
                                    return new yp1.a(((Number) orNull).longValue(), (op1.a) scope.get((k23.d<?>) t0Var10.b(op1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                                }
                                throw new DefinitionParameterException(i3.e5.i(t0Var10, Long.class, new StringBuilder("No value found for type '"), CoreConstants.SINGLE_QUOTE_CHAR));
                            case 27:
                                p4 p4Var = p4.f92886a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var11 = p005kotlin.jvm.internal.s0.f105811a;
                                return new dq1.q((au0.z) scope.get((k23.d<?>) t0Var11.b(au0.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (au0.x) scope.get((k23.d<?>) t0Var11.b(au0.x.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (bu0.j) scope.get((k23.d<?>) t0Var11.b(bu0.j.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                p4 p4Var2 = p4.f92886a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new cq1.h(ModuleExtKt.androidContext(scope), (com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                p4 p4Var3 = p4.f92886a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new cq1.j((d12.e) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(d12.e.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                        }
                    }
                };
                new KoinDefinition(module20, i3.e5.n(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), p005kotlin.jvm.internal.s0.f105811a.b(uf1.a.class), null, pVar15, Kind.Factory, p13.j0.f134944a), module20));
                tf1.a.f164466a.getClass();
                module20.includes(tf1.a.f164467b);
                break;
            case 20:
                Module module21 = (Module) obj;
                f4 f4Var = f4.f92753a;
                module21.getClass();
                final int i67 = 13;
                e23.p pVar16 = new e23.p() { // from class: id0.t3
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) throws DefinitionParameterException {
                        Scope scope = (Scope) obj2;
                        ParametersHolder parametersHolder = (ParametersHolder) obj3;
                        switch (i67) {
                            case 0:
                                u3 u3Var2 = u3.f92946a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new ql.d((ol.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ol.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                u3 u3Var3 = u3.f92946a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var8 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zl.b((f12.l) scope.get((k23.d<?>) t0Var8.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ql.a) scope.get((k23.d<?>) t0Var8.b(ql.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (il.b) scope.get((k23.d<?>) t0Var8.b(il.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (c22.o) scope.get((k23.d<?>) t0Var8.b(c22.o.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), new is1.e(null, 1, null), (Bundle) parametersHolder.elementAt(0, t0Var8.b(Bundle.class)));
                            case 2:
                                v3 v3Var2 = v3.f92958a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.i5();
                            case 3:
                                w3 w3Var2 = w3.f92974a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (yc1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, yc1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 4:
                                w3 w3Var3 = w3.f92974a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new zc1.c((yc1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(yc1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 5:
                                w3 w3Var4 = w3.f92974a;
                                scope.getClass();
                                parametersHolder.getClass();
                                Context contextAndroidContext = ModuleExtKt.androidContext(scope);
                                p005kotlin.jvm.internal.t0 t0Var9 = p005kotlin.jvm.internal.s0.f105811a;
                                return new gd1.a(contextAndroidContext, (zc1.a) scope.get((k23.d<?>) t0Var9.b(zc1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (f12.b) scope.get((k23.d<?>) t0Var9.b(f12.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                y3 y3Var2 = y3.f92998a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new hd1.c();
                            case 7:
                                z3 z3Var2 = z3.f93010a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd1.l(new PregnancyRemindersUpdater(ModuleExtKt.androidContext(scope)), new BloodPressureRemindersUpdater(ModuleExtKt.androidContext(scope)), new LifestyleLoggingRemindersUpdater(ModuleExtKt.androidContext(scope)), new NutritionRemindersUpdater(ModuleExtKt.androidContext(scope)));
                            case 8:
                                z3 z3Var3 = z3.f93010a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd1.k((kd1.l) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kd1.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                z3 z3Var4 = z3.f93010a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd1.j(ModuleExtKt.androidContext(scope), (kd1.k) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kd1.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                a4 a4Var2 = a4.f92662a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.k5();
                            case 11:
                                b4 b4Var2 = b4.f92675a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.l5();
                            case 12:
                                e4 e4Var2 = e4.f92718a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.n5();
                            case 13:
                                f4 f4Var2 = f4.f92753a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.o5();
                            case 14:
                                g4 g4Var = g4.f92769a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new zd0.h(ModuleExtKt.androidContext(scope));
                            case 15:
                                h4 h4Var = h4.f92783a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new b90.b();
                            case 16:
                                i4 i4Var = i4.f92795a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.p5();
                            case 17:
                                j4 j4Var = j4.f92810a;
                                scope.getClass();
                                parametersHolder.getClass();
                                pm1.a aVar = (pm1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(pm1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                bv.b.f21239a.getClass();
                                bv.b.a();
                                return new kd0.r5(aVar, com.garmin.android.apps.connectmobile.k1.f37122a);
                            case 18:
                                j4 j4Var2 = j4.f92810a;
                                scope.getClass();
                                parametersHolder.getClass();
                                tn1.d dVar = parametersHolder.size() > 0 ? (tn1.d) parametersHolder.get(0) : null;
                                return new tn1.g(dVar, (tn1.c) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(tn1.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), dVar != null ? new tn1.b(dVar) : null);
                            case 19:
                                k4 k4Var = k4.f92823a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new v5();
                            case 20:
                                k4 k4Var2 = k4.f92823a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new no1.a();
                            case 21:
                                l4 l4Var = l4.f92836a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new sd0.c();
                            case 22:
                                m4 m4Var = m4.f92848a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.d2();
                            case 23:
                                n4 n4Var = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new w5();
                            case 24:
                                n4 n4Var2 = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (mp1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, mp1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 25:
                                n4 n4Var3 = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new op1.c((mp1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(mp1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                n4 n4Var4 = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var10 = p005kotlin.jvm.internal.s0.f105811a;
                                Object orNull = parametersHolder.getOrNull(t0Var10.b(Long.class));
                                if (orNull != null) {
                                    return new yp1.a(((Number) orNull).longValue(), (op1.a) scope.get((k23.d<?>) t0Var10.b(op1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                                }
                                throw new DefinitionParameterException(i3.e5.i(t0Var10, Long.class, new StringBuilder("No value found for type '"), CoreConstants.SINGLE_QUOTE_CHAR));
                            case 27:
                                p4 p4Var = p4.f92886a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var11 = p005kotlin.jvm.internal.s0.f105811a;
                                return new dq1.q((au0.z) scope.get((k23.d<?>) t0Var11.b(au0.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (au0.x) scope.get((k23.d<?>) t0Var11.b(au0.x.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (bu0.j) scope.get((k23.d<?>) t0Var11.b(bu0.j.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                p4 p4Var2 = p4.f92886a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new cq1.h(ModuleExtKt.androidContext(scope), (com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                p4 p4Var3 = p4.f92886a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new cq1.j((d12.e) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(d12.e.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                        }
                    }
                };
                new KoinDefinition(module21, i3.e5.n(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), p005kotlin.jvm.internal.s0.f105811a.b(ag1.a.class), null, pVar16, Kind.Factory, p13.j0.f134944a), module21));
                break;
            case 21:
                Module module22 = (Module) obj;
                g4 g4Var = g4.f92769a;
                module22.getClass();
                final int i68 = 14;
                e23.p pVar17 = new e23.p() { // from class: id0.t3
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) throws DefinitionParameterException {
                        Scope scope = (Scope) obj2;
                        ParametersHolder parametersHolder = (ParametersHolder) obj3;
                        switch (i68) {
                            case 0:
                                u3 u3Var2 = u3.f92946a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new ql.d((ol.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ol.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                u3 u3Var3 = u3.f92946a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var8 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zl.b((f12.l) scope.get((k23.d<?>) t0Var8.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ql.a) scope.get((k23.d<?>) t0Var8.b(ql.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (il.b) scope.get((k23.d<?>) t0Var8.b(il.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (c22.o) scope.get((k23.d<?>) t0Var8.b(c22.o.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), new is1.e(null, 1, null), (Bundle) parametersHolder.elementAt(0, t0Var8.b(Bundle.class)));
                            case 2:
                                v3 v3Var2 = v3.f92958a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.i5();
                            case 3:
                                w3 w3Var2 = w3.f92974a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (yc1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, yc1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 4:
                                w3 w3Var3 = w3.f92974a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new zc1.c((yc1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(yc1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 5:
                                w3 w3Var4 = w3.f92974a;
                                scope.getClass();
                                parametersHolder.getClass();
                                Context contextAndroidContext = ModuleExtKt.androidContext(scope);
                                p005kotlin.jvm.internal.t0 t0Var9 = p005kotlin.jvm.internal.s0.f105811a;
                                return new gd1.a(contextAndroidContext, (zc1.a) scope.get((k23.d<?>) t0Var9.b(zc1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (f12.b) scope.get((k23.d<?>) t0Var9.b(f12.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                y3 y3Var2 = y3.f92998a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new hd1.c();
                            case 7:
                                z3 z3Var2 = z3.f93010a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd1.l(new PregnancyRemindersUpdater(ModuleExtKt.androidContext(scope)), new BloodPressureRemindersUpdater(ModuleExtKt.androidContext(scope)), new LifestyleLoggingRemindersUpdater(ModuleExtKt.androidContext(scope)), new NutritionRemindersUpdater(ModuleExtKt.androidContext(scope)));
                            case 8:
                                z3 z3Var3 = z3.f93010a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd1.k((kd1.l) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kd1.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                z3 z3Var4 = z3.f93010a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd1.j(ModuleExtKt.androidContext(scope), (kd1.k) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kd1.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                a4 a4Var2 = a4.f92662a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.k5();
                            case 11:
                                b4 b4Var2 = b4.f92675a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.l5();
                            case 12:
                                e4 e4Var2 = e4.f92718a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.n5();
                            case 13:
                                f4 f4Var2 = f4.f92753a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.o5();
                            case 14:
                                g4 g4Var2 = g4.f92769a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new zd0.h(ModuleExtKt.androidContext(scope));
                            case 15:
                                h4 h4Var = h4.f92783a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new b90.b();
                            case 16:
                                i4 i4Var = i4.f92795a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.p5();
                            case 17:
                                j4 j4Var = j4.f92810a;
                                scope.getClass();
                                parametersHolder.getClass();
                                pm1.a aVar = (pm1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(pm1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                bv.b.f21239a.getClass();
                                bv.b.a();
                                return new kd0.r5(aVar, com.garmin.android.apps.connectmobile.k1.f37122a);
                            case 18:
                                j4 j4Var2 = j4.f92810a;
                                scope.getClass();
                                parametersHolder.getClass();
                                tn1.d dVar = parametersHolder.size() > 0 ? (tn1.d) parametersHolder.get(0) : null;
                                return new tn1.g(dVar, (tn1.c) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(tn1.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), dVar != null ? new tn1.b(dVar) : null);
                            case 19:
                                k4 k4Var = k4.f92823a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new v5();
                            case 20:
                                k4 k4Var2 = k4.f92823a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new no1.a();
                            case 21:
                                l4 l4Var = l4.f92836a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new sd0.c();
                            case 22:
                                m4 m4Var = m4.f92848a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.d2();
                            case 23:
                                n4 n4Var = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new w5();
                            case 24:
                                n4 n4Var2 = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (mp1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, mp1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 25:
                                n4 n4Var3 = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new op1.c((mp1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(mp1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                n4 n4Var4 = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var10 = p005kotlin.jvm.internal.s0.f105811a;
                                Object orNull = parametersHolder.getOrNull(t0Var10.b(Long.class));
                                if (orNull != null) {
                                    return new yp1.a(((Number) orNull).longValue(), (op1.a) scope.get((k23.d<?>) t0Var10.b(op1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                                }
                                throw new DefinitionParameterException(i3.e5.i(t0Var10, Long.class, new StringBuilder("No value found for type '"), CoreConstants.SINGLE_QUOTE_CHAR));
                            case 27:
                                p4 p4Var = p4.f92886a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var11 = p005kotlin.jvm.internal.s0.f105811a;
                                return new dq1.q((au0.z) scope.get((k23.d<?>) t0Var11.b(au0.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (au0.x) scope.get((k23.d<?>) t0Var11.b(au0.x.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (bu0.j) scope.get((k23.d<?>) t0Var11.b(bu0.j.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                p4 p4Var2 = p4.f92886a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new cq1.h(ModuleExtKt.androidContext(scope), (com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                p4 p4Var3 = p4.f92886a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new cq1.j((d12.e) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(d12.e.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                        }
                    }
                };
                new KoinDefinition(module22, i3.e5.n(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), p005kotlin.jvm.internal.s0.f105811a.b(zd0.h.class), null, pVar17, Kind.Factory, p13.j0.f134944a), module22));
                break;
            case 22:
                Module module23 = (Module) obj;
                h4 h4Var = h4.f92783a;
                module23.getClass();
                final int i69 = 15;
                e23.p pVar18 = new e23.p() { // from class: id0.t3
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) throws DefinitionParameterException {
                        Scope scope = (Scope) obj2;
                        ParametersHolder parametersHolder = (ParametersHolder) obj3;
                        switch (i69) {
                            case 0:
                                u3 u3Var2 = u3.f92946a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new ql.d((ol.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ol.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                u3 u3Var3 = u3.f92946a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var8 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zl.b((f12.l) scope.get((k23.d<?>) t0Var8.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ql.a) scope.get((k23.d<?>) t0Var8.b(ql.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (il.b) scope.get((k23.d<?>) t0Var8.b(il.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (c22.o) scope.get((k23.d<?>) t0Var8.b(c22.o.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), new is1.e(null, 1, null), (Bundle) parametersHolder.elementAt(0, t0Var8.b(Bundle.class)));
                            case 2:
                                v3 v3Var2 = v3.f92958a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.i5();
                            case 3:
                                w3 w3Var2 = w3.f92974a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (yc1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, yc1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 4:
                                w3 w3Var3 = w3.f92974a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new zc1.c((yc1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(yc1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 5:
                                w3 w3Var4 = w3.f92974a;
                                scope.getClass();
                                parametersHolder.getClass();
                                Context contextAndroidContext = ModuleExtKt.androidContext(scope);
                                p005kotlin.jvm.internal.t0 t0Var9 = p005kotlin.jvm.internal.s0.f105811a;
                                return new gd1.a(contextAndroidContext, (zc1.a) scope.get((k23.d<?>) t0Var9.b(zc1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (f12.b) scope.get((k23.d<?>) t0Var9.b(f12.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                y3 y3Var2 = y3.f92998a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new hd1.c();
                            case 7:
                                z3 z3Var2 = z3.f93010a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd1.l(new PregnancyRemindersUpdater(ModuleExtKt.androidContext(scope)), new BloodPressureRemindersUpdater(ModuleExtKt.androidContext(scope)), new LifestyleLoggingRemindersUpdater(ModuleExtKt.androidContext(scope)), new NutritionRemindersUpdater(ModuleExtKt.androidContext(scope)));
                            case 8:
                                z3 z3Var3 = z3.f93010a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd1.k((kd1.l) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kd1.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                z3 z3Var4 = z3.f93010a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd1.j(ModuleExtKt.androidContext(scope), (kd1.k) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kd1.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                a4 a4Var2 = a4.f92662a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.k5();
                            case 11:
                                b4 b4Var2 = b4.f92675a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.l5();
                            case 12:
                                e4 e4Var2 = e4.f92718a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.n5();
                            case 13:
                                f4 f4Var2 = f4.f92753a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.o5();
                            case 14:
                                g4 g4Var2 = g4.f92769a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new zd0.h(ModuleExtKt.androidContext(scope));
                            case 15:
                                h4 h4Var2 = h4.f92783a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new b90.b();
                            case 16:
                                i4 i4Var = i4.f92795a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.p5();
                            case 17:
                                j4 j4Var = j4.f92810a;
                                scope.getClass();
                                parametersHolder.getClass();
                                pm1.a aVar = (pm1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(pm1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                bv.b.f21239a.getClass();
                                bv.b.a();
                                return new kd0.r5(aVar, com.garmin.android.apps.connectmobile.k1.f37122a);
                            case 18:
                                j4 j4Var2 = j4.f92810a;
                                scope.getClass();
                                parametersHolder.getClass();
                                tn1.d dVar = parametersHolder.size() > 0 ? (tn1.d) parametersHolder.get(0) : null;
                                return new tn1.g(dVar, (tn1.c) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(tn1.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), dVar != null ? new tn1.b(dVar) : null);
                            case 19:
                                k4 k4Var = k4.f92823a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new v5();
                            case 20:
                                k4 k4Var2 = k4.f92823a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new no1.a();
                            case 21:
                                l4 l4Var = l4.f92836a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new sd0.c();
                            case 22:
                                m4 m4Var = m4.f92848a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.d2();
                            case 23:
                                n4 n4Var = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new w5();
                            case 24:
                                n4 n4Var2 = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (mp1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, mp1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 25:
                                n4 n4Var3 = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new op1.c((mp1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(mp1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                n4 n4Var4 = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var10 = p005kotlin.jvm.internal.s0.f105811a;
                                Object orNull = parametersHolder.getOrNull(t0Var10.b(Long.class));
                                if (orNull != null) {
                                    return new yp1.a(((Number) orNull).longValue(), (op1.a) scope.get((k23.d<?>) t0Var10.b(op1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                                }
                                throw new DefinitionParameterException(i3.e5.i(t0Var10, Long.class, new StringBuilder("No value found for type '"), CoreConstants.SINGLE_QUOTE_CHAR));
                            case 27:
                                p4 p4Var = p4.f92886a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var11 = p005kotlin.jvm.internal.s0.f105811a;
                                return new dq1.q((au0.z) scope.get((k23.d<?>) t0Var11.b(au0.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (au0.x) scope.get((k23.d<?>) t0Var11.b(au0.x.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (bu0.j) scope.get((k23.d<?>) t0Var11.b(bu0.j.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                p4 p4Var2 = p4.f92886a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new cq1.h(ModuleExtKt.androidContext(scope), (com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                p4 p4Var3 = p4.f92886a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new cq1.j((d12.e) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(d12.e.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                        }
                    }
                };
                new KoinDefinition(module23, i3.e5.n(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), p005kotlin.jvm.internal.s0.f105811a.b(b90.b.class), null, pVar18, Kind.Factory, p13.j0.f134944a), module23));
                break;
            case 23:
                Module module24 = (Module) obj;
                i4 i4Var = i4.f92795a;
                module24.getClass();
                final int i74 = 16;
                e23.p pVar19 = new e23.p() { // from class: id0.t3
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) throws DefinitionParameterException {
                        Scope scope = (Scope) obj2;
                        ParametersHolder parametersHolder = (ParametersHolder) obj3;
                        switch (i74) {
                            case 0:
                                u3 u3Var2 = u3.f92946a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new ql.d((ol.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ol.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                u3 u3Var3 = u3.f92946a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var8 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zl.b((f12.l) scope.get((k23.d<?>) t0Var8.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ql.a) scope.get((k23.d<?>) t0Var8.b(ql.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (il.b) scope.get((k23.d<?>) t0Var8.b(il.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (c22.o) scope.get((k23.d<?>) t0Var8.b(c22.o.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), new is1.e(null, 1, null), (Bundle) parametersHolder.elementAt(0, t0Var8.b(Bundle.class)));
                            case 2:
                                v3 v3Var2 = v3.f92958a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.i5();
                            case 3:
                                w3 w3Var2 = w3.f92974a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (yc1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, yc1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 4:
                                w3 w3Var3 = w3.f92974a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new zc1.c((yc1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(yc1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 5:
                                w3 w3Var4 = w3.f92974a;
                                scope.getClass();
                                parametersHolder.getClass();
                                Context contextAndroidContext = ModuleExtKt.androidContext(scope);
                                p005kotlin.jvm.internal.t0 t0Var9 = p005kotlin.jvm.internal.s0.f105811a;
                                return new gd1.a(contextAndroidContext, (zc1.a) scope.get((k23.d<?>) t0Var9.b(zc1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (f12.b) scope.get((k23.d<?>) t0Var9.b(f12.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                y3 y3Var2 = y3.f92998a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new hd1.c();
                            case 7:
                                z3 z3Var2 = z3.f93010a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd1.l(new PregnancyRemindersUpdater(ModuleExtKt.androidContext(scope)), new BloodPressureRemindersUpdater(ModuleExtKt.androidContext(scope)), new LifestyleLoggingRemindersUpdater(ModuleExtKt.androidContext(scope)), new NutritionRemindersUpdater(ModuleExtKt.androidContext(scope)));
                            case 8:
                                z3 z3Var3 = z3.f93010a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd1.k((kd1.l) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kd1.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                z3 z3Var4 = z3.f93010a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd1.j(ModuleExtKt.androidContext(scope), (kd1.k) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kd1.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                a4 a4Var2 = a4.f92662a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.k5();
                            case 11:
                                b4 b4Var2 = b4.f92675a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.l5();
                            case 12:
                                e4 e4Var2 = e4.f92718a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.n5();
                            case 13:
                                f4 f4Var2 = f4.f92753a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.o5();
                            case 14:
                                g4 g4Var2 = g4.f92769a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new zd0.h(ModuleExtKt.androidContext(scope));
                            case 15:
                                h4 h4Var2 = h4.f92783a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new b90.b();
                            case 16:
                                i4 i4Var2 = i4.f92795a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.p5();
                            case 17:
                                j4 j4Var = j4.f92810a;
                                scope.getClass();
                                parametersHolder.getClass();
                                pm1.a aVar = (pm1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(pm1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                bv.b.f21239a.getClass();
                                bv.b.a();
                                return new kd0.r5(aVar, com.garmin.android.apps.connectmobile.k1.f37122a);
                            case 18:
                                j4 j4Var2 = j4.f92810a;
                                scope.getClass();
                                parametersHolder.getClass();
                                tn1.d dVar = parametersHolder.size() > 0 ? (tn1.d) parametersHolder.get(0) : null;
                                return new tn1.g(dVar, (tn1.c) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(tn1.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), dVar != null ? new tn1.b(dVar) : null);
                            case 19:
                                k4 k4Var = k4.f92823a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new v5();
                            case 20:
                                k4 k4Var2 = k4.f92823a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new no1.a();
                            case 21:
                                l4 l4Var = l4.f92836a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new sd0.c();
                            case 22:
                                m4 m4Var = m4.f92848a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.d2();
                            case 23:
                                n4 n4Var = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new w5();
                            case 24:
                                n4 n4Var2 = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (mp1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, mp1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 25:
                                n4 n4Var3 = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new op1.c((mp1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(mp1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                n4 n4Var4 = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var10 = p005kotlin.jvm.internal.s0.f105811a;
                                Object orNull = parametersHolder.getOrNull(t0Var10.b(Long.class));
                                if (orNull != null) {
                                    return new yp1.a(((Number) orNull).longValue(), (op1.a) scope.get((k23.d<?>) t0Var10.b(op1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                                }
                                throw new DefinitionParameterException(i3.e5.i(t0Var10, Long.class, new StringBuilder("No value found for type '"), CoreConstants.SINGLE_QUOTE_CHAR));
                            case 27:
                                p4 p4Var = p4.f92886a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var11 = p005kotlin.jvm.internal.s0.f105811a;
                                return new dq1.q((au0.z) scope.get((k23.d<?>) t0Var11.b(au0.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (au0.x) scope.get((k23.d<?>) t0Var11.b(au0.x.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (bu0.j) scope.get((k23.d<?>) t0Var11.b(bu0.j.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                p4 p4Var2 = p4.f92886a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new cq1.h(ModuleExtKt.androidContext(scope), (com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                p4 p4Var3 = p4.f92886a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new cq1.j((d12.e) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(d12.e.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                        }
                    }
                };
                new KoinDefinition(module24, i3.e5.n(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), p005kotlin.jvm.internal.s0.f105811a.b(pm1.f.class), null, pVar19, Kind.Factory, p13.j0.f134944a), module24));
                om1.d.f132973a.getClass();
                module24.includes(om1.d.f132974b);
                break;
            case 24:
                Module module25 = (Module) obj;
                j4 j4Var = j4.f92810a;
                module25.getClass();
                final int i75 = 17;
                e23.p pVar20 = new e23.p() { // from class: id0.t3
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) throws DefinitionParameterException {
                        Scope scope = (Scope) obj2;
                        ParametersHolder parametersHolder = (ParametersHolder) obj3;
                        switch (i75) {
                            case 0:
                                u3 u3Var2 = u3.f92946a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new ql.d((ol.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ol.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                u3 u3Var3 = u3.f92946a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var8 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zl.b((f12.l) scope.get((k23.d<?>) t0Var8.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ql.a) scope.get((k23.d<?>) t0Var8.b(ql.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (il.b) scope.get((k23.d<?>) t0Var8.b(il.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (c22.o) scope.get((k23.d<?>) t0Var8.b(c22.o.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), new is1.e(null, 1, null), (Bundle) parametersHolder.elementAt(0, t0Var8.b(Bundle.class)));
                            case 2:
                                v3 v3Var2 = v3.f92958a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.i5();
                            case 3:
                                w3 w3Var2 = w3.f92974a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (yc1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, yc1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 4:
                                w3 w3Var3 = w3.f92974a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new zc1.c((yc1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(yc1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 5:
                                w3 w3Var4 = w3.f92974a;
                                scope.getClass();
                                parametersHolder.getClass();
                                Context contextAndroidContext = ModuleExtKt.androidContext(scope);
                                p005kotlin.jvm.internal.t0 t0Var9 = p005kotlin.jvm.internal.s0.f105811a;
                                return new gd1.a(contextAndroidContext, (zc1.a) scope.get((k23.d<?>) t0Var9.b(zc1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (f12.b) scope.get((k23.d<?>) t0Var9.b(f12.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                y3 y3Var2 = y3.f92998a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new hd1.c();
                            case 7:
                                z3 z3Var2 = z3.f93010a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd1.l(new PregnancyRemindersUpdater(ModuleExtKt.androidContext(scope)), new BloodPressureRemindersUpdater(ModuleExtKt.androidContext(scope)), new LifestyleLoggingRemindersUpdater(ModuleExtKt.androidContext(scope)), new NutritionRemindersUpdater(ModuleExtKt.androidContext(scope)));
                            case 8:
                                z3 z3Var3 = z3.f93010a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd1.k((kd1.l) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kd1.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                z3 z3Var4 = z3.f93010a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd1.j(ModuleExtKt.androidContext(scope), (kd1.k) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kd1.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                a4 a4Var2 = a4.f92662a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.k5();
                            case 11:
                                b4 b4Var2 = b4.f92675a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.l5();
                            case 12:
                                e4 e4Var2 = e4.f92718a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.n5();
                            case 13:
                                f4 f4Var2 = f4.f92753a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.o5();
                            case 14:
                                g4 g4Var2 = g4.f92769a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new zd0.h(ModuleExtKt.androidContext(scope));
                            case 15:
                                h4 h4Var2 = h4.f92783a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new b90.b();
                            case 16:
                                i4 i4Var2 = i4.f92795a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.p5();
                            case 17:
                                j4 j4Var2 = j4.f92810a;
                                scope.getClass();
                                parametersHolder.getClass();
                                pm1.a aVar = (pm1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(pm1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                bv.b.f21239a.getClass();
                                bv.b.a();
                                return new kd0.r5(aVar, com.garmin.android.apps.connectmobile.k1.f37122a);
                            case 18:
                                j4 j4Var3 = j4.f92810a;
                                scope.getClass();
                                parametersHolder.getClass();
                                tn1.d dVar = parametersHolder.size() > 0 ? (tn1.d) parametersHolder.get(0) : null;
                                return new tn1.g(dVar, (tn1.c) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(tn1.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), dVar != null ? new tn1.b(dVar) : null);
                            case 19:
                                k4 k4Var = k4.f92823a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new v5();
                            case 20:
                                k4 k4Var2 = k4.f92823a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new no1.a();
                            case 21:
                                l4 l4Var = l4.f92836a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new sd0.c();
                            case 22:
                                m4 m4Var = m4.f92848a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.d2();
                            case 23:
                                n4 n4Var = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new w5();
                            case 24:
                                n4 n4Var2 = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (mp1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, mp1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 25:
                                n4 n4Var3 = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new op1.c((mp1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(mp1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                n4 n4Var4 = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var10 = p005kotlin.jvm.internal.s0.f105811a;
                                Object orNull = parametersHolder.getOrNull(t0Var10.b(Long.class));
                                if (orNull != null) {
                                    return new yp1.a(((Number) orNull).longValue(), (op1.a) scope.get((k23.d<?>) t0Var10.b(op1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                                }
                                throw new DefinitionParameterException(i3.e5.i(t0Var10, Long.class, new StringBuilder("No value found for type '"), CoreConstants.SINGLE_QUOTE_CHAR));
                            case 27:
                                p4 p4Var = p4.f92886a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var11 = p005kotlin.jvm.internal.s0.f105811a;
                                return new dq1.q((au0.z) scope.get((k23.d<?>) t0Var11.b(au0.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (au0.x) scope.get((k23.d<?>) t0Var11.b(au0.x.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (bu0.j) scope.get((k23.d<?>) t0Var11.b(bu0.j.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                p4 p4Var2 = p4.f92886a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new cq1.h(ModuleExtKt.androidContext(scope), (com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                p4 p4Var3 = p4.f92886a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new cq1.j((d12.e) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(d12.e.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                        }
                    }
                };
                ScopeRegistry.Companion companion8 = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier9 = companion8.getRootScopeQualifier();
                Kind kind9 = Kind.Factory;
                p13.j0 j0Var8 = p13.j0.f134944a;
                p005kotlin.jvm.internal.t0 t0Var8 = p005kotlin.jvm.internal.s0.f105811a;
                new KoinDefinition(module25, i3.e5.n(new BeanDefinition(rootScopeQualifier9, t0Var8.b(tn1.c.class), null, pVar20, kind9, j0Var8), module25));
                final int i76 = 18;
                new KoinDefinition(module25, i3.e5.n(new BeanDefinition(companion8.getRootScopeQualifier(), t0Var8.b(tn1.g.class), null, new e23.p() { // from class: id0.t3
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) throws DefinitionParameterException {
                        Scope scope = (Scope) obj2;
                        ParametersHolder parametersHolder = (ParametersHolder) obj3;
                        switch (i76) {
                            case 0:
                                u3 u3Var2 = u3.f92946a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new ql.d((ol.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ol.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                u3 u3Var3 = u3.f92946a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var9 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zl.b((f12.l) scope.get((k23.d<?>) t0Var9.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ql.a) scope.get((k23.d<?>) t0Var9.b(ql.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (il.b) scope.get((k23.d<?>) t0Var9.b(il.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (c22.o) scope.get((k23.d<?>) t0Var9.b(c22.o.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), new is1.e(null, 1, null), (Bundle) parametersHolder.elementAt(0, t0Var9.b(Bundle.class)));
                            case 2:
                                v3 v3Var2 = v3.f92958a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.i5();
                            case 3:
                                w3 w3Var2 = w3.f92974a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (yc1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, yc1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 4:
                                w3 w3Var3 = w3.f92974a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new zc1.c((yc1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(yc1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 5:
                                w3 w3Var4 = w3.f92974a;
                                scope.getClass();
                                parametersHolder.getClass();
                                Context contextAndroidContext = ModuleExtKt.androidContext(scope);
                                p005kotlin.jvm.internal.t0 t0Var10 = p005kotlin.jvm.internal.s0.f105811a;
                                return new gd1.a(contextAndroidContext, (zc1.a) scope.get((k23.d<?>) t0Var10.b(zc1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (f12.b) scope.get((k23.d<?>) t0Var10.b(f12.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                y3 y3Var2 = y3.f92998a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new hd1.c();
                            case 7:
                                z3 z3Var2 = z3.f93010a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd1.l(new PregnancyRemindersUpdater(ModuleExtKt.androidContext(scope)), new BloodPressureRemindersUpdater(ModuleExtKt.androidContext(scope)), new LifestyleLoggingRemindersUpdater(ModuleExtKt.androidContext(scope)), new NutritionRemindersUpdater(ModuleExtKt.androidContext(scope)));
                            case 8:
                                z3 z3Var3 = z3.f93010a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd1.k((kd1.l) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kd1.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                z3 z3Var4 = z3.f93010a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd1.j(ModuleExtKt.androidContext(scope), (kd1.k) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kd1.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                a4 a4Var2 = a4.f92662a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.k5();
                            case 11:
                                b4 b4Var2 = b4.f92675a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.l5();
                            case 12:
                                e4 e4Var2 = e4.f92718a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.n5();
                            case 13:
                                f4 f4Var2 = f4.f92753a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.o5();
                            case 14:
                                g4 g4Var2 = g4.f92769a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new zd0.h(ModuleExtKt.androidContext(scope));
                            case 15:
                                h4 h4Var2 = h4.f92783a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new b90.b();
                            case 16:
                                i4 i4Var2 = i4.f92795a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.p5();
                            case 17:
                                j4 j4Var2 = j4.f92810a;
                                scope.getClass();
                                parametersHolder.getClass();
                                pm1.a aVar = (pm1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(pm1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                bv.b.f21239a.getClass();
                                bv.b.a();
                                return new kd0.r5(aVar, com.garmin.android.apps.connectmobile.k1.f37122a);
                            case 18:
                                j4 j4Var3 = j4.f92810a;
                                scope.getClass();
                                parametersHolder.getClass();
                                tn1.d dVar = parametersHolder.size() > 0 ? (tn1.d) parametersHolder.get(0) : null;
                                return new tn1.g(dVar, (tn1.c) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(tn1.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), dVar != null ? new tn1.b(dVar) : null);
                            case 19:
                                k4 k4Var = k4.f92823a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new v5();
                            case 20:
                                k4 k4Var2 = k4.f92823a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new no1.a();
                            case 21:
                                l4 l4Var = l4.f92836a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new sd0.c();
                            case 22:
                                m4 m4Var = m4.f92848a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.d2();
                            case 23:
                                n4 n4Var = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new w5();
                            case 24:
                                n4 n4Var2 = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (mp1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, mp1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 25:
                                n4 n4Var3 = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new op1.c((mp1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(mp1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                n4 n4Var4 = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var11 = p005kotlin.jvm.internal.s0.f105811a;
                                Object orNull = parametersHolder.getOrNull(t0Var11.b(Long.class));
                                if (orNull != null) {
                                    return new yp1.a(((Number) orNull).longValue(), (op1.a) scope.get((k23.d<?>) t0Var11.b(op1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                                }
                                throw new DefinitionParameterException(i3.e5.i(t0Var11, Long.class, new StringBuilder("No value found for type '"), CoreConstants.SINGLE_QUOTE_CHAR));
                            case 27:
                                p4 p4Var = p4.f92886a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var12 = p005kotlin.jvm.internal.s0.f105811a;
                                return new dq1.q((au0.z) scope.get((k23.d<?>) t0Var12.b(au0.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (au0.x) scope.get((k23.d<?>) t0Var12.b(au0.x.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (bu0.j) scope.get((k23.d<?>) t0Var12.b(bu0.j.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                p4 p4Var2 = p4.f92886a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new cq1.h(ModuleExtKt.androidContext(scope), (com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                p4 p4Var3 = p4.f92886a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new cq1.j((d12.e) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(d12.e.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                        }
                    }
                }, kind9, j0Var8), module25));
                break;
            case 25:
                Module module26 = (Module) obj;
                k4 k4Var = k4.f92823a;
                module26.getClass();
                final int i77 = 19;
                e23.p pVar21 = new e23.p() { // from class: id0.t3
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) throws DefinitionParameterException {
                        Scope scope = (Scope) obj2;
                        ParametersHolder parametersHolder = (ParametersHolder) obj3;
                        switch (i77) {
                            case 0:
                                u3 u3Var2 = u3.f92946a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new ql.d((ol.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ol.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                u3 u3Var3 = u3.f92946a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var9 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zl.b((f12.l) scope.get((k23.d<?>) t0Var9.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ql.a) scope.get((k23.d<?>) t0Var9.b(ql.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (il.b) scope.get((k23.d<?>) t0Var9.b(il.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (c22.o) scope.get((k23.d<?>) t0Var9.b(c22.o.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), new is1.e(null, 1, null), (Bundle) parametersHolder.elementAt(0, t0Var9.b(Bundle.class)));
                            case 2:
                                v3 v3Var2 = v3.f92958a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.i5();
                            case 3:
                                w3 w3Var2 = w3.f92974a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (yc1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, yc1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 4:
                                w3 w3Var3 = w3.f92974a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new zc1.c((yc1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(yc1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 5:
                                w3 w3Var4 = w3.f92974a;
                                scope.getClass();
                                parametersHolder.getClass();
                                Context contextAndroidContext = ModuleExtKt.androidContext(scope);
                                p005kotlin.jvm.internal.t0 t0Var10 = p005kotlin.jvm.internal.s0.f105811a;
                                return new gd1.a(contextAndroidContext, (zc1.a) scope.get((k23.d<?>) t0Var10.b(zc1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (f12.b) scope.get((k23.d<?>) t0Var10.b(f12.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                y3 y3Var2 = y3.f92998a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new hd1.c();
                            case 7:
                                z3 z3Var2 = z3.f93010a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd1.l(new PregnancyRemindersUpdater(ModuleExtKt.androidContext(scope)), new BloodPressureRemindersUpdater(ModuleExtKt.androidContext(scope)), new LifestyleLoggingRemindersUpdater(ModuleExtKt.androidContext(scope)), new NutritionRemindersUpdater(ModuleExtKt.androidContext(scope)));
                            case 8:
                                z3 z3Var3 = z3.f93010a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd1.k((kd1.l) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kd1.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                z3 z3Var4 = z3.f93010a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd1.j(ModuleExtKt.androidContext(scope), (kd1.k) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kd1.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                a4 a4Var2 = a4.f92662a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.k5();
                            case 11:
                                b4 b4Var2 = b4.f92675a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.l5();
                            case 12:
                                e4 e4Var2 = e4.f92718a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.n5();
                            case 13:
                                f4 f4Var2 = f4.f92753a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.o5();
                            case 14:
                                g4 g4Var2 = g4.f92769a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new zd0.h(ModuleExtKt.androidContext(scope));
                            case 15:
                                h4 h4Var2 = h4.f92783a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new b90.b();
                            case 16:
                                i4 i4Var2 = i4.f92795a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.p5();
                            case 17:
                                j4 j4Var2 = j4.f92810a;
                                scope.getClass();
                                parametersHolder.getClass();
                                pm1.a aVar = (pm1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(pm1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                bv.b.f21239a.getClass();
                                bv.b.a();
                                return new kd0.r5(aVar, com.garmin.android.apps.connectmobile.k1.f37122a);
                            case 18:
                                j4 j4Var3 = j4.f92810a;
                                scope.getClass();
                                parametersHolder.getClass();
                                tn1.d dVar = parametersHolder.size() > 0 ? (tn1.d) parametersHolder.get(0) : null;
                                return new tn1.g(dVar, (tn1.c) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(tn1.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), dVar != null ? new tn1.b(dVar) : null);
                            case 19:
                                k4 k4Var2 = k4.f92823a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new v5();
                            case 20:
                                k4 k4Var3 = k4.f92823a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new no1.a();
                            case 21:
                                l4 l4Var = l4.f92836a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new sd0.c();
                            case 22:
                                m4 m4Var = m4.f92848a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.d2();
                            case 23:
                                n4 n4Var = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new w5();
                            case 24:
                                n4 n4Var2 = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (mp1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, mp1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 25:
                                n4 n4Var3 = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new op1.c((mp1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(mp1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                n4 n4Var4 = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var11 = p005kotlin.jvm.internal.s0.f105811a;
                                Object orNull = parametersHolder.getOrNull(t0Var11.b(Long.class));
                                if (orNull != null) {
                                    return new yp1.a(((Number) orNull).longValue(), (op1.a) scope.get((k23.d<?>) t0Var11.b(op1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                                }
                                throw new DefinitionParameterException(i3.e5.i(t0Var11, Long.class, new StringBuilder("No value found for type '"), CoreConstants.SINGLE_QUOTE_CHAR));
                            case 27:
                                p4 p4Var = p4.f92886a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var12 = p005kotlin.jvm.internal.s0.f105811a;
                                return new dq1.q((au0.z) scope.get((k23.d<?>) t0Var12.b(au0.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (au0.x) scope.get((k23.d<?>) t0Var12.b(au0.x.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (bu0.j) scope.get((k23.d<?>) t0Var12.b(bu0.j.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                p4 p4Var2 = p4.f92886a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new cq1.h(ModuleExtKt.androidContext(scope), (com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                p4 p4Var3 = p4.f92886a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new cq1.j((d12.e) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(d12.e.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                        }
                    }
                };
                ScopeRegistry.Companion companion9 = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier10 = companion9.getRootScopeQualifier();
                Kind kind10 = Kind.Factory;
                p13.j0 j0Var9 = p13.j0.f134944a;
                p005kotlin.jvm.internal.t0 t0Var9 = p005kotlin.jvm.internal.s0.f105811a;
                new KoinDefinition(module26, i3.e5.n(new BeanDefinition(rootScopeQualifier10, t0Var9.b(bv.g.class), null, pVar21, kind10, j0Var9), module26));
                final int i78 = 20;
                e23.p pVar22 = new e23.p() { // from class: id0.t3
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) throws DefinitionParameterException {
                        Scope scope = (Scope) obj2;
                        ParametersHolder parametersHolder = (ParametersHolder) obj3;
                        switch (i78) {
                            case 0:
                                u3 u3Var2 = u3.f92946a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new ql.d((ol.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ol.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                u3 u3Var3 = u3.f92946a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var10 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zl.b((f12.l) scope.get((k23.d<?>) t0Var10.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ql.a) scope.get((k23.d<?>) t0Var10.b(ql.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (il.b) scope.get((k23.d<?>) t0Var10.b(il.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (c22.o) scope.get((k23.d<?>) t0Var10.b(c22.o.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), new is1.e(null, 1, null), (Bundle) parametersHolder.elementAt(0, t0Var10.b(Bundle.class)));
                            case 2:
                                v3 v3Var2 = v3.f92958a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.i5();
                            case 3:
                                w3 w3Var2 = w3.f92974a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (yc1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, yc1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 4:
                                w3 w3Var3 = w3.f92974a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new zc1.c((yc1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(yc1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 5:
                                w3 w3Var4 = w3.f92974a;
                                scope.getClass();
                                parametersHolder.getClass();
                                Context contextAndroidContext = ModuleExtKt.androidContext(scope);
                                p005kotlin.jvm.internal.t0 t0Var11 = p005kotlin.jvm.internal.s0.f105811a;
                                return new gd1.a(contextAndroidContext, (zc1.a) scope.get((k23.d<?>) t0Var11.b(zc1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (f12.b) scope.get((k23.d<?>) t0Var11.b(f12.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                y3 y3Var2 = y3.f92998a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new hd1.c();
                            case 7:
                                z3 z3Var2 = z3.f93010a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd1.l(new PregnancyRemindersUpdater(ModuleExtKt.androidContext(scope)), new BloodPressureRemindersUpdater(ModuleExtKt.androidContext(scope)), new LifestyleLoggingRemindersUpdater(ModuleExtKt.androidContext(scope)), new NutritionRemindersUpdater(ModuleExtKt.androidContext(scope)));
                            case 8:
                                z3 z3Var3 = z3.f93010a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd1.k((kd1.l) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kd1.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                z3 z3Var4 = z3.f93010a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd1.j(ModuleExtKt.androidContext(scope), (kd1.k) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kd1.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                a4 a4Var2 = a4.f92662a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.k5();
                            case 11:
                                b4 b4Var2 = b4.f92675a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.l5();
                            case 12:
                                e4 e4Var2 = e4.f92718a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.n5();
                            case 13:
                                f4 f4Var2 = f4.f92753a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.o5();
                            case 14:
                                g4 g4Var2 = g4.f92769a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new zd0.h(ModuleExtKt.androidContext(scope));
                            case 15:
                                h4 h4Var2 = h4.f92783a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new b90.b();
                            case 16:
                                i4 i4Var2 = i4.f92795a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.p5();
                            case 17:
                                j4 j4Var2 = j4.f92810a;
                                scope.getClass();
                                parametersHolder.getClass();
                                pm1.a aVar = (pm1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(pm1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                bv.b.f21239a.getClass();
                                bv.b.a();
                                return new kd0.r5(aVar, com.garmin.android.apps.connectmobile.k1.f37122a);
                            case 18:
                                j4 j4Var3 = j4.f92810a;
                                scope.getClass();
                                parametersHolder.getClass();
                                tn1.d dVar = parametersHolder.size() > 0 ? (tn1.d) parametersHolder.get(0) : null;
                                return new tn1.g(dVar, (tn1.c) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(tn1.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), dVar != null ? new tn1.b(dVar) : null);
                            case 19:
                                k4 k4Var2 = k4.f92823a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new v5();
                            case 20:
                                k4 k4Var3 = k4.f92823a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new no1.a();
                            case 21:
                                l4 l4Var = l4.f92836a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new sd0.c();
                            case 22:
                                m4 m4Var = m4.f92848a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.d2();
                            case 23:
                                n4 n4Var = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new w5();
                            case 24:
                                n4 n4Var2 = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (mp1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, mp1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 25:
                                n4 n4Var3 = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new op1.c((mp1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(mp1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                n4 n4Var4 = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var12 = p005kotlin.jvm.internal.s0.f105811a;
                                Object orNull = parametersHolder.getOrNull(t0Var12.b(Long.class));
                                if (orNull != null) {
                                    return new yp1.a(((Number) orNull).longValue(), (op1.a) scope.get((k23.d<?>) t0Var12.b(op1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                                }
                                throw new DefinitionParameterException(i3.e5.i(t0Var12, Long.class, new StringBuilder("No value found for type '"), CoreConstants.SINGLE_QUOTE_CHAR));
                            case 27:
                                p4 p4Var = p4.f92886a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var13 = p005kotlin.jvm.internal.s0.f105811a;
                                return new dq1.q((au0.z) scope.get((k23.d<?>) t0Var13.b(au0.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (au0.x) scope.get((k23.d<?>) t0Var13.b(au0.x.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (bu0.j) scope.get((k23.d<?>) t0Var13.b(bu0.j.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                p4 p4Var2 = p4.f92886a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new cq1.h(ModuleExtKt.androidContext(scope), (com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                p4 p4Var3 = p4.f92886a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new cq1.j((d12.e) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(d12.e.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                        }
                    }
                };
                SingleInstanceFactory<?> singleInstanceFactoryP11 = lc.u0.p(new BeanDefinition(companion9.getRootScopeQualifier(), t0Var9.b(no1.b.class), null, pVar22, Kind.Singleton, j0Var9), module26);
                if (module26.get_createdAtStart()) {
                    module26.prepareForCreationAtStart(singleInstanceFactoryP11);
                }
                new KoinDefinition(module26, singleInstanceFactoryP11);
                break;
            case 26:
                Module module27 = (Module) obj;
                l4 l4Var = l4.f92836a;
                module27.getClass();
                final int i79 = 21;
                e23.p pVar23 = new e23.p() { // from class: id0.t3
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) throws DefinitionParameterException {
                        Scope scope = (Scope) obj2;
                        ParametersHolder parametersHolder = (ParametersHolder) obj3;
                        switch (i79) {
                            case 0:
                                u3 u3Var2 = u3.f92946a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new ql.d((ol.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ol.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                u3 u3Var3 = u3.f92946a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var10 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zl.b((f12.l) scope.get((k23.d<?>) t0Var10.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ql.a) scope.get((k23.d<?>) t0Var10.b(ql.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (il.b) scope.get((k23.d<?>) t0Var10.b(il.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (c22.o) scope.get((k23.d<?>) t0Var10.b(c22.o.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), new is1.e(null, 1, null), (Bundle) parametersHolder.elementAt(0, t0Var10.b(Bundle.class)));
                            case 2:
                                v3 v3Var2 = v3.f92958a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.i5();
                            case 3:
                                w3 w3Var2 = w3.f92974a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (yc1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, yc1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 4:
                                w3 w3Var3 = w3.f92974a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new zc1.c((yc1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(yc1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 5:
                                w3 w3Var4 = w3.f92974a;
                                scope.getClass();
                                parametersHolder.getClass();
                                Context contextAndroidContext = ModuleExtKt.androidContext(scope);
                                p005kotlin.jvm.internal.t0 t0Var11 = p005kotlin.jvm.internal.s0.f105811a;
                                return new gd1.a(contextAndroidContext, (zc1.a) scope.get((k23.d<?>) t0Var11.b(zc1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (f12.b) scope.get((k23.d<?>) t0Var11.b(f12.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                y3 y3Var2 = y3.f92998a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new hd1.c();
                            case 7:
                                z3 z3Var2 = z3.f93010a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd1.l(new PregnancyRemindersUpdater(ModuleExtKt.androidContext(scope)), new BloodPressureRemindersUpdater(ModuleExtKt.androidContext(scope)), new LifestyleLoggingRemindersUpdater(ModuleExtKt.androidContext(scope)), new NutritionRemindersUpdater(ModuleExtKt.androidContext(scope)));
                            case 8:
                                z3 z3Var3 = z3.f93010a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd1.k((kd1.l) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kd1.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                z3 z3Var4 = z3.f93010a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd1.j(ModuleExtKt.androidContext(scope), (kd1.k) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kd1.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                a4 a4Var2 = a4.f92662a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.k5();
                            case 11:
                                b4 b4Var2 = b4.f92675a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.l5();
                            case 12:
                                e4 e4Var2 = e4.f92718a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.n5();
                            case 13:
                                f4 f4Var2 = f4.f92753a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.o5();
                            case 14:
                                g4 g4Var2 = g4.f92769a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new zd0.h(ModuleExtKt.androidContext(scope));
                            case 15:
                                h4 h4Var2 = h4.f92783a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new b90.b();
                            case 16:
                                i4 i4Var2 = i4.f92795a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.p5();
                            case 17:
                                j4 j4Var2 = j4.f92810a;
                                scope.getClass();
                                parametersHolder.getClass();
                                pm1.a aVar = (pm1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(pm1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                bv.b.f21239a.getClass();
                                bv.b.a();
                                return new kd0.r5(aVar, com.garmin.android.apps.connectmobile.k1.f37122a);
                            case 18:
                                j4 j4Var3 = j4.f92810a;
                                scope.getClass();
                                parametersHolder.getClass();
                                tn1.d dVar = parametersHolder.size() > 0 ? (tn1.d) parametersHolder.get(0) : null;
                                return new tn1.g(dVar, (tn1.c) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(tn1.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), dVar != null ? new tn1.b(dVar) : null);
                            case 19:
                                k4 k4Var2 = k4.f92823a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new v5();
                            case 20:
                                k4 k4Var3 = k4.f92823a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new no1.a();
                            case 21:
                                l4 l4Var2 = l4.f92836a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new sd0.c();
                            case 22:
                                m4 m4Var = m4.f92848a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.d2();
                            case 23:
                                n4 n4Var = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new w5();
                            case 24:
                                n4 n4Var2 = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (mp1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, mp1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 25:
                                n4 n4Var3 = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new op1.c((mp1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(mp1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                n4 n4Var4 = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var12 = p005kotlin.jvm.internal.s0.f105811a;
                                Object orNull = parametersHolder.getOrNull(t0Var12.b(Long.class));
                                if (orNull != null) {
                                    return new yp1.a(((Number) orNull).longValue(), (op1.a) scope.get((k23.d<?>) t0Var12.b(op1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                                }
                                throw new DefinitionParameterException(i3.e5.i(t0Var12, Long.class, new StringBuilder("No value found for type '"), CoreConstants.SINGLE_QUOTE_CHAR));
                            case 27:
                                p4 p4Var = p4.f92886a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var13 = p005kotlin.jvm.internal.s0.f105811a;
                                return new dq1.q((au0.z) scope.get((k23.d<?>) t0Var13.b(au0.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (au0.x) scope.get((k23.d<?>) t0Var13.b(au0.x.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (bu0.j) scope.get((k23.d<?>) t0Var13.b(bu0.j.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                p4 p4Var2 = p4.f92886a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new cq1.h(ModuleExtKt.androidContext(scope), (com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                p4 p4Var3 = p4.f92886a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new cq1.j((d12.e) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(d12.e.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                        }
                    }
                };
                new KoinDefinition(module27, i3.e5.n(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), p005kotlin.jvm.internal.s0.f105811a.b(vo1.b.class), null, pVar23, Kind.Factory, p13.j0.f134944a), module27));
                xo1.a.f191752a.getClass();
                module27.includes(xo1.a.f191753b);
                break;
            case 27:
                Module module28 = (Module) obj;
                m4 m4Var = m4.f92848a;
                module28.getClass();
                final int i84 = 22;
                e23.p pVar24 = new e23.p() { // from class: id0.t3
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) throws DefinitionParameterException {
                        Scope scope = (Scope) obj2;
                        ParametersHolder parametersHolder = (ParametersHolder) obj3;
                        switch (i84) {
                            case 0:
                                u3 u3Var2 = u3.f92946a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new ql.d((ol.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ol.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                u3 u3Var3 = u3.f92946a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var10 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zl.b((f12.l) scope.get((k23.d<?>) t0Var10.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ql.a) scope.get((k23.d<?>) t0Var10.b(ql.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (il.b) scope.get((k23.d<?>) t0Var10.b(il.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (c22.o) scope.get((k23.d<?>) t0Var10.b(c22.o.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), new is1.e(null, 1, null), (Bundle) parametersHolder.elementAt(0, t0Var10.b(Bundle.class)));
                            case 2:
                                v3 v3Var2 = v3.f92958a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.i5();
                            case 3:
                                w3 w3Var2 = w3.f92974a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (yc1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, yc1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 4:
                                w3 w3Var3 = w3.f92974a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new zc1.c((yc1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(yc1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 5:
                                w3 w3Var4 = w3.f92974a;
                                scope.getClass();
                                parametersHolder.getClass();
                                Context contextAndroidContext = ModuleExtKt.androidContext(scope);
                                p005kotlin.jvm.internal.t0 t0Var11 = p005kotlin.jvm.internal.s0.f105811a;
                                return new gd1.a(contextAndroidContext, (zc1.a) scope.get((k23.d<?>) t0Var11.b(zc1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (f12.b) scope.get((k23.d<?>) t0Var11.b(f12.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                y3 y3Var2 = y3.f92998a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new hd1.c();
                            case 7:
                                z3 z3Var2 = z3.f93010a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd1.l(new PregnancyRemindersUpdater(ModuleExtKt.androidContext(scope)), new BloodPressureRemindersUpdater(ModuleExtKt.androidContext(scope)), new LifestyleLoggingRemindersUpdater(ModuleExtKt.androidContext(scope)), new NutritionRemindersUpdater(ModuleExtKt.androidContext(scope)));
                            case 8:
                                z3 z3Var3 = z3.f93010a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd1.k((kd1.l) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kd1.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                z3 z3Var4 = z3.f93010a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd1.j(ModuleExtKt.androidContext(scope), (kd1.k) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kd1.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                a4 a4Var2 = a4.f92662a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.k5();
                            case 11:
                                b4 b4Var2 = b4.f92675a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.l5();
                            case 12:
                                e4 e4Var2 = e4.f92718a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.n5();
                            case 13:
                                f4 f4Var2 = f4.f92753a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.o5();
                            case 14:
                                g4 g4Var2 = g4.f92769a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new zd0.h(ModuleExtKt.androidContext(scope));
                            case 15:
                                h4 h4Var2 = h4.f92783a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new b90.b();
                            case 16:
                                i4 i4Var2 = i4.f92795a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.p5();
                            case 17:
                                j4 j4Var2 = j4.f92810a;
                                scope.getClass();
                                parametersHolder.getClass();
                                pm1.a aVar = (pm1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(pm1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                bv.b.f21239a.getClass();
                                bv.b.a();
                                return new kd0.r5(aVar, com.garmin.android.apps.connectmobile.k1.f37122a);
                            case 18:
                                j4 j4Var3 = j4.f92810a;
                                scope.getClass();
                                parametersHolder.getClass();
                                tn1.d dVar = parametersHolder.size() > 0 ? (tn1.d) parametersHolder.get(0) : null;
                                return new tn1.g(dVar, (tn1.c) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(tn1.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), dVar != null ? new tn1.b(dVar) : null);
                            case 19:
                                k4 k4Var2 = k4.f92823a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new v5();
                            case 20:
                                k4 k4Var3 = k4.f92823a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new no1.a();
                            case 21:
                                l4 l4Var2 = l4.f92836a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new sd0.c();
                            case 22:
                                m4 m4Var2 = m4.f92848a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.d2();
                            case 23:
                                n4 n4Var = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new w5();
                            case 24:
                                n4 n4Var2 = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (mp1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, mp1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 25:
                                n4 n4Var3 = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new op1.c((mp1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(mp1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                n4 n4Var4 = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var12 = p005kotlin.jvm.internal.s0.f105811a;
                                Object orNull = parametersHolder.getOrNull(t0Var12.b(Long.class));
                                if (orNull != null) {
                                    return new yp1.a(((Number) orNull).longValue(), (op1.a) scope.get((k23.d<?>) t0Var12.b(op1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                                }
                                throw new DefinitionParameterException(i3.e5.i(t0Var12, Long.class, new StringBuilder("No value found for type '"), CoreConstants.SINGLE_QUOTE_CHAR));
                            case 27:
                                p4 p4Var = p4.f92886a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var13 = p005kotlin.jvm.internal.s0.f105811a;
                                return new dq1.q((au0.z) scope.get((k23.d<?>) t0Var13.b(au0.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (au0.x) scope.get((k23.d<?>) t0Var13.b(au0.x.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (bu0.j) scope.get((k23.d<?>) t0Var13.b(bu0.j.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                p4 p4Var2 = p4.f92886a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new cq1.h(ModuleExtKt.androidContext(scope), (com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                p4 p4Var3 = p4.f92886a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new cq1.j((d12.e) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(d12.e.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                        }
                    }
                };
                new KoinDefinition(module28, i3.e5.n(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), p005kotlin.jvm.internal.s0.f105811a.b(ep1.f.class), null, pVar24, Kind.Factory, p13.j0.f134944a), module28));
                break;
            case 28:
                Module module29 = (Module) obj;
                n4 n4Var = n4.f92860a;
                module29.getClass();
                final int i85 = 23;
                e23.p pVar25 = new e23.p() { // from class: id0.t3
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) throws DefinitionParameterException {
                        Scope scope = (Scope) obj2;
                        ParametersHolder parametersHolder = (ParametersHolder) obj3;
                        switch (i85) {
                            case 0:
                                u3 u3Var2 = u3.f92946a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new ql.d((ol.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ol.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                u3 u3Var3 = u3.f92946a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var10 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zl.b((f12.l) scope.get((k23.d<?>) t0Var10.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ql.a) scope.get((k23.d<?>) t0Var10.b(ql.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (il.b) scope.get((k23.d<?>) t0Var10.b(il.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (c22.o) scope.get((k23.d<?>) t0Var10.b(c22.o.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), new is1.e(null, 1, null), (Bundle) parametersHolder.elementAt(0, t0Var10.b(Bundle.class)));
                            case 2:
                                v3 v3Var2 = v3.f92958a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.i5();
                            case 3:
                                w3 w3Var2 = w3.f92974a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (yc1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, yc1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 4:
                                w3 w3Var3 = w3.f92974a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new zc1.c((yc1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(yc1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 5:
                                w3 w3Var4 = w3.f92974a;
                                scope.getClass();
                                parametersHolder.getClass();
                                Context contextAndroidContext = ModuleExtKt.androidContext(scope);
                                p005kotlin.jvm.internal.t0 t0Var11 = p005kotlin.jvm.internal.s0.f105811a;
                                return new gd1.a(contextAndroidContext, (zc1.a) scope.get((k23.d<?>) t0Var11.b(zc1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (f12.b) scope.get((k23.d<?>) t0Var11.b(f12.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                y3 y3Var2 = y3.f92998a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new hd1.c();
                            case 7:
                                z3 z3Var2 = z3.f93010a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd1.l(new PregnancyRemindersUpdater(ModuleExtKt.androidContext(scope)), new BloodPressureRemindersUpdater(ModuleExtKt.androidContext(scope)), new LifestyleLoggingRemindersUpdater(ModuleExtKt.androidContext(scope)), new NutritionRemindersUpdater(ModuleExtKt.androidContext(scope)));
                            case 8:
                                z3 z3Var3 = z3.f93010a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd1.k((kd1.l) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kd1.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                z3 z3Var4 = z3.f93010a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd1.j(ModuleExtKt.androidContext(scope), (kd1.k) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kd1.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                a4 a4Var2 = a4.f92662a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.k5();
                            case 11:
                                b4 b4Var2 = b4.f92675a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.l5();
                            case 12:
                                e4 e4Var2 = e4.f92718a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.n5();
                            case 13:
                                f4 f4Var2 = f4.f92753a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.o5();
                            case 14:
                                g4 g4Var2 = g4.f92769a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new zd0.h(ModuleExtKt.androidContext(scope));
                            case 15:
                                h4 h4Var2 = h4.f92783a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new b90.b();
                            case 16:
                                i4 i4Var2 = i4.f92795a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.p5();
                            case 17:
                                j4 j4Var2 = j4.f92810a;
                                scope.getClass();
                                parametersHolder.getClass();
                                pm1.a aVar = (pm1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(pm1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                bv.b.f21239a.getClass();
                                bv.b.a();
                                return new kd0.r5(aVar, com.garmin.android.apps.connectmobile.k1.f37122a);
                            case 18:
                                j4 j4Var3 = j4.f92810a;
                                scope.getClass();
                                parametersHolder.getClass();
                                tn1.d dVar = parametersHolder.size() > 0 ? (tn1.d) parametersHolder.get(0) : null;
                                return new tn1.g(dVar, (tn1.c) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(tn1.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), dVar != null ? new tn1.b(dVar) : null);
                            case 19:
                                k4 k4Var2 = k4.f92823a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new v5();
                            case 20:
                                k4 k4Var3 = k4.f92823a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new no1.a();
                            case 21:
                                l4 l4Var2 = l4.f92836a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new sd0.c();
                            case 22:
                                m4 m4Var2 = m4.f92848a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.d2();
                            case 23:
                                n4 n4Var2 = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new w5();
                            case 24:
                                n4 n4Var3 = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (mp1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, mp1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 25:
                                n4 n4Var4 = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new op1.c((mp1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(mp1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                n4 n4Var5 = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var12 = p005kotlin.jvm.internal.s0.f105811a;
                                Object orNull = parametersHolder.getOrNull(t0Var12.b(Long.class));
                                if (orNull != null) {
                                    return new yp1.a(((Number) orNull).longValue(), (op1.a) scope.get((k23.d<?>) t0Var12.b(op1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                                }
                                throw new DefinitionParameterException(i3.e5.i(t0Var12, Long.class, new StringBuilder("No value found for type '"), CoreConstants.SINGLE_QUOTE_CHAR));
                            case 27:
                                p4 p4Var = p4.f92886a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var13 = p005kotlin.jvm.internal.s0.f105811a;
                                return new dq1.q((au0.z) scope.get((k23.d<?>) t0Var13.b(au0.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (au0.x) scope.get((k23.d<?>) t0Var13.b(au0.x.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (bu0.j) scope.get((k23.d<?>) t0Var13.b(bu0.j.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                p4 p4Var2 = p4.f92886a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new cq1.h(ModuleExtKt.androidContext(scope), (com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                p4 p4Var3 = p4.f92886a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new cq1.j((d12.e) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(d12.e.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                        }
                    }
                };
                ScopeRegistry.Companion companion10 = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier11 = companion10.getRootScopeQualifier();
                Kind kind11 = Kind.Factory;
                p13.j0 j0Var10 = p13.j0.f134944a;
                p005kotlin.jvm.internal.t0 t0Var10 = p005kotlin.jvm.internal.s0.f105811a;
                new KoinDefinition(module29, i3.e5.n(new BeanDefinition(rootScopeQualifier11, t0Var10.b(pp1.a.class), null, pVar25, kind11, j0Var10), module29));
                final int i86 = 24;
                new KoinDefinition(module29, i3.e5.n(new BeanDefinition(companion10.getRootScopeQualifier(), t0Var10.b(mp1.a.class), null, new e23.p() { // from class: id0.t3
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) throws DefinitionParameterException {
                        Scope scope = (Scope) obj2;
                        ParametersHolder parametersHolder = (ParametersHolder) obj3;
                        switch (i86) {
                            case 0:
                                u3 u3Var2 = u3.f92946a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new ql.d((ol.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ol.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                u3 u3Var3 = u3.f92946a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var11 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zl.b((f12.l) scope.get((k23.d<?>) t0Var11.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ql.a) scope.get((k23.d<?>) t0Var11.b(ql.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (il.b) scope.get((k23.d<?>) t0Var11.b(il.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (c22.o) scope.get((k23.d<?>) t0Var11.b(c22.o.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), new is1.e(null, 1, null), (Bundle) parametersHolder.elementAt(0, t0Var11.b(Bundle.class)));
                            case 2:
                                v3 v3Var2 = v3.f92958a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.i5();
                            case 3:
                                w3 w3Var2 = w3.f92974a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (yc1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, yc1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 4:
                                w3 w3Var3 = w3.f92974a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new zc1.c((yc1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(yc1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 5:
                                w3 w3Var4 = w3.f92974a;
                                scope.getClass();
                                parametersHolder.getClass();
                                Context contextAndroidContext = ModuleExtKt.androidContext(scope);
                                p005kotlin.jvm.internal.t0 t0Var12 = p005kotlin.jvm.internal.s0.f105811a;
                                return new gd1.a(contextAndroidContext, (zc1.a) scope.get((k23.d<?>) t0Var12.b(zc1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (f12.b) scope.get((k23.d<?>) t0Var12.b(f12.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                y3 y3Var2 = y3.f92998a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new hd1.c();
                            case 7:
                                z3 z3Var2 = z3.f93010a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd1.l(new PregnancyRemindersUpdater(ModuleExtKt.androidContext(scope)), new BloodPressureRemindersUpdater(ModuleExtKt.androidContext(scope)), new LifestyleLoggingRemindersUpdater(ModuleExtKt.androidContext(scope)), new NutritionRemindersUpdater(ModuleExtKt.androidContext(scope)));
                            case 8:
                                z3 z3Var3 = z3.f93010a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd1.k((kd1.l) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kd1.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                z3 z3Var4 = z3.f93010a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd1.j(ModuleExtKt.androidContext(scope), (kd1.k) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kd1.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                a4 a4Var2 = a4.f92662a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.k5();
                            case 11:
                                b4 b4Var2 = b4.f92675a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.l5();
                            case 12:
                                e4 e4Var2 = e4.f92718a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.n5();
                            case 13:
                                f4 f4Var2 = f4.f92753a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.o5();
                            case 14:
                                g4 g4Var2 = g4.f92769a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new zd0.h(ModuleExtKt.androidContext(scope));
                            case 15:
                                h4 h4Var2 = h4.f92783a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new b90.b();
                            case 16:
                                i4 i4Var2 = i4.f92795a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.p5();
                            case 17:
                                j4 j4Var2 = j4.f92810a;
                                scope.getClass();
                                parametersHolder.getClass();
                                pm1.a aVar = (pm1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(pm1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                bv.b.f21239a.getClass();
                                bv.b.a();
                                return new kd0.r5(aVar, com.garmin.android.apps.connectmobile.k1.f37122a);
                            case 18:
                                j4 j4Var3 = j4.f92810a;
                                scope.getClass();
                                parametersHolder.getClass();
                                tn1.d dVar = parametersHolder.size() > 0 ? (tn1.d) parametersHolder.get(0) : null;
                                return new tn1.g(dVar, (tn1.c) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(tn1.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), dVar != null ? new tn1.b(dVar) : null);
                            case 19:
                                k4 k4Var2 = k4.f92823a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new v5();
                            case 20:
                                k4 k4Var3 = k4.f92823a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new no1.a();
                            case 21:
                                l4 l4Var2 = l4.f92836a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new sd0.c();
                            case 22:
                                m4 m4Var2 = m4.f92848a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.d2();
                            case 23:
                                n4 n4Var2 = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new w5();
                            case 24:
                                n4 n4Var3 = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (mp1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, mp1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 25:
                                n4 n4Var4 = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new op1.c((mp1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(mp1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                n4 n4Var5 = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var13 = p005kotlin.jvm.internal.s0.f105811a;
                                Object orNull = parametersHolder.getOrNull(t0Var13.b(Long.class));
                                if (orNull != null) {
                                    return new yp1.a(((Number) orNull).longValue(), (op1.a) scope.get((k23.d<?>) t0Var13.b(op1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                                }
                                throw new DefinitionParameterException(i3.e5.i(t0Var13, Long.class, new StringBuilder("No value found for type '"), CoreConstants.SINGLE_QUOTE_CHAR));
                            case 27:
                                p4 p4Var = p4.f92886a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var14 = p005kotlin.jvm.internal.s0.f105811a;
                                return new dq1.q((au0.z) scope.get((k23.d<?>) t0Var14.b(au0.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (au0.x) scope.get((k23.d<?>) t0Var14.b(au0.x.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (bu0.j) scope.get((k23.d<?>) t0Var14.b(bu0.j.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                p4 p4Var2 = p4.f92886a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new cq1.h(ModuleExtKt.androidContext(scope), (com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                p4 p4Var3 = p4.f92886a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new cq1.j((d12.e) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(d12.e.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                        }
                    }
                }, kind11, j0Var10), module29));
                final int i87 = 25;
                new KoinDefinition(module29, i3.e5.n(new BeanDefinition(companion10.getRootScopeQualifier(), t0Var10.b(op1.a.class), null, new e23.p() { // from class: id0.t3
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) throws DefinitionParameterException {
                        Scope scope = (Scope) obj2;
                        ParametersHolder parametersHolder = (ParametersHolder) obj3;
                        switch (i87) {
                            case 0:
                                u3 u3Var2 = u3.f92946a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new ql.d((ol.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ol.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                u3 u3Var3 = u3.f92946a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var11 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zl.b((f12.l) scope.get((k23.d<?>) t0Var11.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ql.a) scope.get((k23.d<?>) t0Var11.b(ql.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (il.b) scope.get((k23.d<?>) t0Var11.b(il.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (c22.o) scope.get((k23.d<?>) t0Var11.b(c22.o.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), new is1.e(null, 1, null), (Bundle) parametersHolder.elementAt(0, t0Var11.b(Bundle.class)));
                            case 2:
                                v3 v3Var2 = v3.f92958a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.i5();
                            case 3:
                                w3 w3Var2 = w3.f92974a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (yc1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, yc1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 4:
                                w3 w3Var3 = w3.f92974a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new zc1.c((yc1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(yc1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 5:
                                w3 w3Var4 = w3.f92974a;
                                scope.getClass();
                                parametersHolder.getClass();
                                Context contextAndroidContext = ModuleExtKt.androidContext(scope);
                                p005kotlin.jvm.internal.t0 t0Var12 = p005kotlin.jvm.internal.s0.f105811a;
                                return new gd1.a(contextAndroidContext, (zc1.a) scope.get((k23.d<?>) t0Var12.b(zc1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (f12.b) scope.get((k23.d<?>) t0Var12.b(f12.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                y3 y3Var2 = y3.f92998a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new hd1.c();
                            case 7:
                                z3 z3Var2 = z3.f93010a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd1.l(new PregnancyRemindersUpdater(ModuleExtKt.androidContext(scope)), new BloodPressureRemindersUpdater(ModuleExtKt.androidContext(scope)), new LifestyleLoggingRemindersUpdater(ModuleExtKt.androidContext(scope)), new NutritionRemindersUpdater(ModuleExtKt.androidContext(scope)));
                            case 8:
                                z3 z3Var3 = z3.f93010a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd1.k((kd1.l) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kd1.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                z3 z3Var4 = z3.f93010a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd1.j(ModuleExtKt.androidContext(scope), (kd1.k) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kd1.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                a4 a4Var2 = a4.f92662a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.k5();
                            case 11:
                                b4 b4Var2 = b4.f92675a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.l5();
                            case 12:
                                e4 e4Var2 = e4.f92718a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.n5();
                            case 13:
                                f4 f4Var2 = f4.f92753a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.o5();
                            case 14:
                                g4 g4Var2 = g4.f92769a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new zd0.h(ModuleExtKt.androidContext(scope));
                            case 15:
                                h4 h4Var2 = h4.f92783a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new b90.b();
                            case 16:
                                i4 i4Var2 = i4.f92795a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.p5();
                            case 17:
                                j4 j4Var2 = j4.f92810a;
                                scope.getClass();
                                parametersHolder.getClass();
                                pm1.a aVar = (pm1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(pm1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                bv.b.f21239a.getClass();
                                bv.b.a();
                                return new kd0.r5(aVar, com.garmin.android.apps.connectmobile.k1.f37122a);
                            case 18:
                                j4 j4Var3 = j4.f92810a;
                                scope.getClass();
                                parametersHolder.getClass();
                                tn1.d dVar = parametersHolder.size() > 0 ? (tn1.d) parametersHolder.get(0) : null;
                                return new tn1.g(dVar, (tn1.c) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(tn1.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), dVar != null ? new tn1.b(dVar) : null);
                            case 19:
                                k4 k4Var2 = k4.f92823a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new v5();
                            case 20:
                                k4 k4Var3 = k4.f92823a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new no1.a();
                            case 21:
                                l4 l4Var2 = l4.f92836a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new sd0.c();
                            case 22:
                                m4 m4Var2 = m4.f92848a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.d2();
                            case 23:
                                n4 n4Var2 = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new w5();
                            case 24:
                                n4 n4Var3 = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (mp1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, mp1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 25:
                                n4 n4Var4 = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new op1.c((mp1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(mp1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                n4 n4Var5 = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var13 = p005kotlin.jvm.internal.s0.f105811a;
                                Object orNull = parametersHolder.getOrNull(t0Var13.b(Long.class));
                                if (orNull != null) {
                                    return new yp1.a(((Number) orNull).longValue(), (op1.a) scope.get((k23.d<?>) t0Var13.b(op1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                                }
                                throw new DefinitionParameterException(i3.e5.i(t0Var13, Long.class, new StringBuilder("No value found for type '"), CoreConstants.SINGLE_QUOTE_CHAR));
                            case 27:
                                p4 p4Var = p4.f92886a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var14 = p005kotlin.jvm.internal.s0.f105811a;
                                return new dq1.q((au0.z) scope.get((k23.d<?>) t0Var14.b(au0.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (au0.x) scope.get((k23.d<?>) t0Var14.b(au0.x.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (bu0.j) scope.get((k23.d<?>) t0Var14.b(bu0.j.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                p4 p4Var2 = p4.f92886a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new cq1.h(ModuleExtKt.androidContext(scope), (com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                p4 p4Var3 = p4.f92886a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new cq1.j((d12.e) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(d12.e.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                        }
                    }
                }, kind11, j0Var10), module29));
                final int i88 = 26;
                new KoinDefinition(module29, i3.e5.n(new BeanDefinition(companion10.getRootScopeQualifier(), t0Var10.b(yp1.a.class), null, new e23.p() { // from class: id0.t3
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) throws DefinitionParameterException {
                        Scope scope = (Scope) obj2;
                        ParametersHolder parametersHolder = (ParametersHolder) obj3;
                        switch (i88) {
                            case 0:
                                u3 u3Var2 = u3.f92946a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new ql.d((ol.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ol.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                u3 u3Var3 = u3.f92946a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var11 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zl.b((f12.l) scope.get((k23.d<?>) t0Var11.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ql.a) scope.get((k23.d<?>) t0Var11.b(ql.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (il.b) scope.get((k23.d<?>) t0Var11.b(il.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (c22.o) scope.get((k23.d<?>) t0Var11.b(c22.o.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), new is1.e(null, 1, null), (Bundle) parametersHolder.elementAt(0, t0Var11.b(Bundle.class)));
                            case 2:
                                v3 v3Var2 = v3.f92958a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.i5();
                            case 3:
                                w3 w3Var2 = w3.f92974a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (yc1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, yc1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 4:
                                w3 w3Var3 = w3.f92974a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new zc1.c((yc1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(yc1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 5:
                                w3 w3Var4 = w3.f92974a;
                                scope.getClass();
                                parametersHolder.getClass();
                                Context contextAndroidContext = ModuleExtKt.androidContext(scope);
                                p005kotlin.jvm.internal.t0 t0Var12 = p005kotlin.jvm.internal.s0.f105811a;
                                return new gd1.a(contextAndroidContext, (zc1.a) scope.get((k23.d<?>) t0Var12.b(zc1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (f12.b) scope.get((k23.d<?>) t0Var12.b(f12.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                y3 y3Var2 = y3.f92998a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new hd1.c();
                            case 7:
                                z3 z3Var2 = z3.f93010a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd1.l(new PregnancyRemindersUpdater(ModuleExtKt.androidContext(scope)), new BloodPressureRemindersUpdater(ModuleExtKt.androidContext(scope)), new LifestyleLoggingRemindersUpdater(ModuleExtKt.androidContext(scope)), new NutritionRemindersUpdater(ModuleExtKt.androidContext(scope)));
                            case 8:
                                z3 z3Var3 = z3.f93010a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd1.k((kd1.l) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kd1.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                z3 z3Var4 = z3.f93010a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd1.j(ModuleExtKt.androidContext(scope), (kd1.k) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kd1.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                a4 a4Var2 = a4.f92662a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.k5();
                            case 11:
                                b4 b4Var2 = b4.f92675a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.l5();
                            case 12:
                                e4 e4Var2 = e4.f92718a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.n5();
                            case 13:
                                f4 f4Var2 = f4.f92753a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.o5();
                            case 14:
                                g4 g4Var2 = g4.f92769a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new zd0.h(ModuleExtKt.androidContext(scope));
                            case 15:
                                h4 h4Var2 = h4.f92783a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new b90.b();
                            case 16:
                                i4 i4Var2 = i4.f92795a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.p5();
                            case 17:
                                j4 j4Var2 = j4.f92810a;
                                scope.getClass();
                                parametersHolder.getClass();
                                pm1.a aVar = (pm1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(pm1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                bv.b.f21239a.getClass();
                                bv.b.a();
                                return new kd0.r5(aVar, com.garmin.android.apps.connectmobile.k1.f37122a);
                            case 18:
                                j4 j4Var3 = j4.f92810a;
                                scope.getClass();
                                parametersHolder.getClass();
                                tn1.d dVar = parametersHolder.size() > 0 ? (tn1.d) parametersHolder.get(0) : null;
                                return new tn1.g(dVar, (tn1.c) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(tn1.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), dVar != null ? new tn1.b(dVar) : null);
                            case 19:
                                k4 k4Var2 = k4.f92823a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new v5();
                            case 20:
                                k4 k4Var3 = k4.f92823a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new no1.a();
                            case 21:
                                l4 l4Var2 = l4.f92836a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new sd0.c();
                            case 22:
                                m4 m4Var2 = m4.f92848a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.d2();
                            case 23:
                                n4 n4Var2 = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new w5();
                            case 24:
                                n4 n4Var3 = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (mp1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, mp1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 25:
                                n4 n4Var4 = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new op1.c((mp1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(mp1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                n4 n4Var5 = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var13 = p005kotlin.jvm.internal.s0.f105811a;
                                Object orNull = parametersHolder.getOrNull(t0Var13.b(Long.class));
                                if (orNull != null) {
                                    return new yp1.a(((Number) orNull).longValue(), (op1.a) scope.get((k23.d<?>) t0Var13.b(op1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                                }
                                throw new DefinitionParameterException(i3.e5.i(t0Var13, Long.class, new StringBuilder("No value found for type '"), CoreConstants.SINGLE_QUOTE_CHAR));
                            case 27:
                                p4 p4Var = p4.f92886a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var14 = p005kotlin.jvm.internal.s0.f105811a;
                                return new dq1.q((au0.z) scope.get((k23.d<?>) t0Var14.b(au0.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (au0.x) scope.get((k23.d<?>) t0Var14.b(au0.x.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (bu0.j) scope.get((k23.d<?>) t0Var14.b(bu0.j.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                p4 p4Var2 = p4.f92886a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new cq1.h(ModuleExtKt.androidContext(scope), (com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                p4 p4Var3 = p4.f92886a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new cq1.j((d12.e) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(d12.e.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                        }
                    }
                }, kind11, j0Var10), module29));
                break;
            default:
                Module module30 = (Module) obj;
                p4 p4Var = p4.f92886a;
                module30.getClass();
                o4 o4Var = new o4(i28);
                ScopeRegistry.Companion companion11 = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier12 = companion11.getRootScopeQualifier();
                Kind kind12 = Kind.Factory;
                p13.j0 j0Var11 = p13.j0.f134944a;
                p005kotlin.jvm.internal.t0 t0Var11 = p005kotlin.jvm.internal.s0.f105811a;
                new KoinDefinition(module30, i3.e5.n(new BeanDefinition(rootScopeQualifier12, t0Var11.b(cq1.i.class), null, o4Var, kind12, j0Var11), module30));
                new KoinDefinition(module30, i3.e5.n(new BeanDefinition(companion11.getRootScopeQualifier(), t0Var11.b(cq1.h.class), null, new e23.p() { // from class: id0.t3
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) throws DefinitionParameterException {
                        Scope scope = (Scope) obj2;
                        ParametersHolder parametersHolder = (ParametersHolder) obj3;
                        switch (i27) {
                            case 0:
                                u3 u3Var2 = u3.f92946a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new ql.d((ol.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ol.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                u3 u3Var3 = u3.f92946a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var12 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zl.b((f12.l) scope.get((k23.d<?>) t0Var12.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ql.a) scope.get((k23.d<?>) t0Var12.b(ql.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (il.b) scope.get((k23.d<?>) t0Var12.b(il.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (c22.o) scope.get((k23.d<?>) t0Var12.b(c22.o.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), new is1.e(null, 1, null), (Bundle) parametersHolder.elementAt(0, t0Var12.b(Bundle.class)));
                            case 2:
                                v3 v3Var2 = v3.f92958a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.i5();
                            case 3:
                                w3 w3Var2 = w3.f92974a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (yc1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, yc1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 4:
                                w3 w3Var3 = w3.f92974a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new zc1.c((yc1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(yc1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 5:
                                w3 w3Var4 = w3.f92974a;
                                scope.getClass();
                                parametersHolder.getClass();
                                Context contextAndroidContext = ModuleExtKt.androidContext(scope);
                                p005kotlin.jvm.internal.t0 t0Var13 = p005kotlin.jvm.internal.s0.f105811a;
                                return new gd1.a(contextAndroidContext, (zc1.a) scope.get((k23.d<?>) t0Var13.b(zc1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (f12.b) scope.get((k23.d<?>) t0Var13.b(f12.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                y3 y3Var2 = y3.f92998a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new hd1.c();
                            case 7:
                                z3 z3Var2 = z3.f93010a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd1.l(new PregnancyRemindersUpdater(ModuleExtKt.androidContext(scope)), new BloodPressureRemindersUpdater(ModuleExtKt.androidContext(scope)), new LifestyleLoggingRemindersUpdater(ModuleExtKt.androidContext(scope)), new NutritionRemindersUpdater(ModuleExtKt.androidContext(scope)));
                            case 8:
                                z3 z3Var3 = z3.f93010a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd1.k((kd1.l) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kd1.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                z3 z3Var4 = z3.f93010a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd1.j(ModuleExtKt.androidContext(scope), (kd1.k) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kd1.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                a4 a4Var2 = a4.f92662a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.k5();
                            case 11:
                                b4 b4Var2 = b4.f92675a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.l5();
                            case 12:
                                e4 e4Var2 = e4.f92718a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.n5();
                            case 13:
                                f4 f4Var2 = f4.f92753a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.o5();
                            case 14:
                                g4 g4Var2 = g4.f92769a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new zd0.h(ModuleExtKt.androidContext(scope));
                            case 15:
                                h4 h4Var2 = h4.f92783a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new b90.b();
                            case 16:
                                i4 i4Var2 = i4.f92795a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.p5();
                            case 17:
                                j4 j4Var2 = j4.f92810a;
                                scope.getClass();
                                parametersHolder.getClass();
                                pm1.a aVar = (pm1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(pm1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                bv.b.f21239a.getClass();
                                bv.b.a();
                                return new kd0.r5(aVar, com.garmin.android.apps.connectmobile.k1.f37122a);
                            case 18:
                                j4 j4Var3 = j4.f92810a;
                                scope.getClass();
                                parametersHolder.getClass();
                                tn1.d dVar = parametersHolder.size() > 0 ? (tn1.d) parametersHolder.get(0) : null;
                                return new tn1.g(dVar, (tn1.c) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(tn1.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), dVar != null ? new tn1.b(dVar) : null);
                            case 19:
                                k4 k4Var2 = k4.f92823a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new v5();
                            case 20:
                                k4 k4Var3 = k4.f92823a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new no1.a();
                            case 21:
                                l4 l4Var2 = l4.f92836a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new sd0.c();
                            case 22:
                                m4 m4Var2 = m4.f92848a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.d2();
                            case 23:
                                n4 n4Var2 = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new w5();
                            case 24:
                                n4 n4Var3 = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (mp1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, mp1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 25:
                                n4 n4Var4 = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new op1.c((mp1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(mp1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                n4 n4Var5 = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var14 = p005kotlin.jvm.internal.s0.f105811a;
                                Object orNull = parametersHolder.getOrNull(t0Var14.b(Long.class));
                                if (orNull != null) {
                                    return new yp1.a(((Number) orNull).longValue(), (op1.a) scope.get((k23.d<?>) t0Var14.b(op1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                                }
                                throw new DefinitionParameterException(i3.e5.i(t0Var14, Long.class, new StringBuilder("No value found for type '"), CoreConstants.SINGLE_QUOTE_CHAR));
                            case 27:
                                p4 p4Var2 = p4.f92886a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var15 = p005kotlin.jvm.internal.s0.f105811a;
                                return new dq1.q((au0.z) scope.get((k23.d<?>) t0Var15.b(au0.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (au0.x) scope.get((k23.d<?>) t0Var15.b(au0.x.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (bu0.j) scope.get((k23.d<?>) t0Var15.b(bu0.j.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                p4 p4Var3 = p4.f92886a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new cq1.h(ModuleExtKt.androidContext(scope), (com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                p4 p4Var4 = p4.f92886a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new cq1.j((d12.e) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(d12.e.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                        }
                    }
                }, kind12, j0Var11), module30));
                new KoinDefinition(module30, i3.e5.n(new BeanDefinition(companion11.getRootScopeQualifier(), t0Var11.b(cq1.j.class), null, new e23.p() { // from class: id0.t3
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) throws DefinitionParameterException {
                        Scope scope = (Scope) obj2;
                        ParametersHolder parametersHolder = (ParametersHolder) obj3;
                        switch (i26) {
                            case 0:
                                u3 u3Var2 = u3.f92946a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new ql.d((ol.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ol.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                u3 u3Var3 = u3.f92946a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var12 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zl.b((f12.l) scope.get((k23.d<?>) t0Var12.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ql.a) scope.get((k23.d<?>) t0Var12.b(ql.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (il.b) scope.get((k23.d<?>) t0Var12.b(il.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (c22.o) scope.get((k23.d<?>) t0Var12.b(c22.o.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), new is1.e(null, 1, null), (Bundle) parametersHolder.elementAt(0, t0Var12.b(Bundle.class)));
                            case 2:
                                v3 v3Var2 = v3.f92958a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.i5();
                            case 3:
                                w3 w3Var2 = w3.f92974a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (yc1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, yc1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 4:
                                w3 w3Var3 = w3.f92974a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new zc1.c((yc1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(yc1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 5:
                                w3 w3Var4 = w3.f92974a;
                                scope.getClass();
                                parametersHolder.getClass();
                                Context contextAndroidContext = ModuleExtKt.androidContext(scope);
                                p005kotlin.jvm.internal.t0 t0Var13 = p005kotlin.jvm.internal.s0.f105811a;
                                return new gd1.a(contextAndroidContext, (zc1.a) scope.get((k23.d<?>) t0Var13.b(zc1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (f12.b) scope.get((k23.d<?>) t0Var13.b(f12.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                y3 y3Var2 = y3.f92998a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new hd1.c();
                            case 7:
                                z3 z3Var2 = z3.f93010a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd1.l(new PregnancyRemindersUpdater(ModuleExtKt.androidContext(scope)), new BloodPressureRemindersUpdater(ModuleExtKt.androidContext(scope)), new LifestyleLoggingRemindersUpdater(ModuleExtKt.androidContext(scope)), new NutritionRemindersUpdater(ModuleExtKt.androidContext(scope)));
                            case 8:
                                z3 z3Var3 = z3.f93010a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd1.k((kd1.l) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kd1.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                z3 z3Var4 = z3.f93010a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd1.j(ModuleExtKt.androidContext(scope), (kd1.k) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kd1.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                a4 a4Var2 = a4.f92662a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.k5();
                            case 11:
                                b4 b4Var2 = b4.f92675a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.l5();
                            case 12:
                                e4 e4Var2 = e4.f92718a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.n5();
                            case 13:
                                f4 f4Var2 = f4.f92753a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.o5();
                            case 14:
                                g4 g4Var2 = g4.f92769a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new zd0.h(ModuleExtKt.androidContext(scope));
                            case 15:
                                h4 h4Var2 = h4.f92783a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new b90.b();
                            case 16:
                                i4 i4Var2 = i4.f92795a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.p5();
                            case 17:
                                j4 j4Var2 = j4.f92810a;
                                scope.getClass();
                                parametersHolder.getClass();
                                pm1.a aVar = (pm1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(pm1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                bv.b.f21239a.getClass();
                                bv.b.a();
                                return new kd0.r5(aVar, com.garmin.android.apps.connectmobile.k1.f37122a);
                            case 18:
                                j4 j4Var3 = j4.f92810a;
                                scope.getClass();
                                parametersHolder.getClass();
                                tn1.d dVar = parametersHolder.size() > 0 ? (tn1.d) parametersHolder.get(0) : null;
                                return new tn1.g(dVar, (tn1.c) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(tn1.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), dVar != null ? new tn1.b(dVar) : null);
                            case 19:
                                k4 k4Var2 = k4.f92823a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new v5();
                            case 20:
                                k4 k4Var3 = k4.f92823a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new no1.a();
                            case 21:
                                l4 l4Var2 = l4.f92836a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new sd0.c();
                            case 22:
                                m4 m4Var2 = m4.f92848a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.d2();
                            case 23:
                                n4 n4Var2 = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new w5();
                            case 24:
                                n4 n4Var3 = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (mp1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, mp1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 25:
                                n4 n4Var4 = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new op1.c((mp1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(mp1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                n4 n4Var5 = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var14 = p005kotlin.jvm.internal.s0.f105811a;
                                Object orNull = parametersHolder.getOrNull(t0Var14.b(Long.class));
                                if (orNull != null) {
                                    return new yp1.a(((Number) orNull).longValue(), (op1.a) scope.get((k23.d<?>) t0Var14.b(op1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                                }
                                throw new DefinitionParameterException(i3.e5.i(t0Var14, Long.class, new StringBuilder("No value found for type '"), CoreConstants.SINGLE_QUOTE_CHAR));
                            case 27:
                                p4 p4Var2 = p4.f92886a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var15 = p005kotlin.jvm.internal.s0.f105811a;
                                return new dq1.q((au0.z) scope.get((k23.d<?>) t0Var15.b(au0.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (au0.x) scope.get((k23.d<?>) t0Var15.b(au0.x.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (bu0.j) scope.get((k23.d<?>) t0Var15.b(bu0.j.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                p4 p4Var3 = p4.f92886a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new cq1.h(ModuleExtKt.androidContext(scope), (com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                p4 p4Var4 = p4.f92886a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new cq1.j((d12.e) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(d12.e.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                        }
                    }
                }, kind12, j0Var11), module30));
                new KoinDefinition(module30, i3.e5.n(new BeanDefinition(companion11.getRootScopeQualifier(), t0Var11.b(cq1.m.class), null, new o4(i25), kind12, j0Var11), module30));
                new KoinDefinition(module30, i3.e5.n(new BeanDefinition(companion11.getRootScopeQualifier(), t0Var11.b(cq1.d.class), null, new o4(i24), kind12, j0Var11), module30));
                new KoinDefinition(module30, i3.e5.n(new BeanDefinition(companion11.getRootScopeQualifier(), t0Var11.b(cq1.l.class), null, new o4(i19), kind12, j0Var11), module30));
                new KoinDefinition(module30, i3.e5.n(new BeanDefinition(companion11.getRootScopeQualifier(), t0Var11.b(cq1.q.class), null, new o4(i18), kind12, j0Var11), module30));
                new KoinDefinition(module30, i3.e5.n(new BeanDefinition(companion11.getRootScopeQualifier(), t0Var11.b(cq1.n.class), null, new o4(i17), kind12, j0Var11), module30));
                new KoinDefinition(module30, i3.e5.n(new BeanDefinition(companion11.getRootScopeQualifier(), t0Var11.b(cq1.p.class), null, new o4(i16), kind12, j0Var11), module30));
                new KoinDefinition(module30, i3.e5.n(new BeanDefinition(companion11.getRootScopeQualifier(), t0Var11.b(cq1.b.class), null, new o4(i15), kind12, j0Var11), module30));
                new KoinDefinition(module30, i3.e5.n(new BeanDefinition(companion11.getRootScopeQualifier(), t0Var11.b(cq1.k.class), null, new o4(i14), kind12, j0Var11), module30));
                new KoinDefinition(module30, i3.e5.n(new BeanDefinition(companion11.getRootScopeQualifier(), t0Var11.b(cq1.g.class), null, new o4(9), kind12, j0Var11), module30));
                new KoinDefinition(module30, i3.e5.n(new BeanDefinition(companion11.getRootScopeQualifier(), t0Var11.b(cq1.c.class), null, new o4(10), kind12, j0Var11), module30));
                new KoinDefinition(module30, i3.e5.n(new BeanDefinition(companion11.getRootScopeQualifier(), t0Var11.b(cq1.e.class), null, new o4(11), kind12, j0Var11), module30));
                new KoinDefinition(module30, i3.e5.n(new BeanDefinition(companion11.getRootScopeQualifier(), t0Var11.b(cq1.a.class), null, new o4(12), kind12, j0Var11), module30));
                new KoinDefinition(module30, i3.e5.n(new BeanDefinition(companion11.getRootScopeQualifier(), t0Var11.b(cq1.f.class), null, new o4(13), kind12, j0Var11), module30));
                new KoinDefinition(module30, i3.e5.n(new BeanDefinition(companion11.getRootScopeQualifier(), t0Var11.b(bq1.a.class), null, new o4(14), kind12, j0Var11), module30));
                new KoinDefinition(module30, i3.e5.n(new BeanDefinition(companion11.getRootScopeQualifier(), t0Var11.b(dq1.a.class), null, new o4(15), kind12, j0Var11), module30));
                final int i89 = 27;
                new KoinDefinition(module30, i3.e5.n(new BeanDefinition(companion11.getRootScopeQualifier(), t0Var11.b(dq1.q.class), null, new e23.p() { // from class: id0.t3
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) throws DefinitionParameterException {
                        Scope scope = (Scope) obj2;
                        ParametersHolder parametersHolder = (ParametersHolder) obj3;
                        switch (i89) {
                            case 0:
                                u3 u3Var2 = u3.f92946a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new ql.d((ol.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ol.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                u3 u3Var3 = u3.f92946a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var12 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zl.b((f12.l) scope.get((k23.d<?>) t0Var12.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ql.a) scope.get((k23.d<?>) t0Var12.b(ql.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (il.b) scope.get((k23.d<?>) t0Var12.b(il.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (c22.o) scope.get((k23.d<?>) t0Var12.b(c22.o.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), new is1.e(null, 1, null), (Bundle) parametersHolder.elementAt(0, t0Var12.b(Bundle.class)));
                            case 2:
                                v3 v3Var2 = v3.f92958a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.i5();
                            case 3:
                                w3 w3Var2 = w3.f92974a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (yc1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, yc1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 4:
                                w3 w3Var3 = w3.f92974a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new zc1.c((yc1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(yc1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 5:
                                w3 w3Var4 = w3.f92974a;
                                scope.getClass();
                                parametersHolder.getClass();
                                Context contextAndroidContext = ModuleExtKt.androidContext(scope);
                                p005kotlin.jvm.internal.t0 t0Var13 = p005kotlin.jvm.internal.s0.f105811a;
                                return new gd1.a(contextAndroidContext, (zc1.a) scope.get((k23.d<?>) t0Var13.b(zc1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (f12.b) scope.get((k23.d<?>) t0Var13.b(f12.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                y3 y3Var2 = y3.f92998a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new hd1.c();
                            case 7:
                                z3 z3Var2 = z3.f93010a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd1.l(new PregnancyRemindersUpdater(ModuleExtKt.androidContext(scope)), new BloodPressureRemindersUpdater(ModuleExtKt.androidContext(scope)), new LifestyleLoggingRemindersUpdater(ModuleExtKt.androidContext(scope)), new NutritionRemindersUpdater(ModuleExtKt.androidContext(scope)));
                            case 8:
                                z3 z3Var3 = z3.f93010a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd1.k((kd1.l) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kd1.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                z3 z3Var4 = z3.f93010a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd1.j(ModuleExtKt.androidContext(scope), (kd1.k) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kd1.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                a4 a4Var2 = a4.f92662a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.k5();
                            case 11:
                                b4 b4Var2 = b4.f92675a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.l5();
                            case 12:
                                e4 e4Var2 = e4.f92718a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.n5();
                            case 13:
                                f4 f4Var2 = f4.f92753a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.o5();
                            case 14:
                                g4 g4Var2 = g4.f92769a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new zd0.h(ModuleExtKt.androidContext(scope));
                            case 15:
                                h4 h4Var2 = h4.f92783a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new b90.b();
                            case 16:
                                i4 i4Var2 = i4.f92795a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.p5();
                            case 17:
                                j4 j4Var2 = j4.f92810a;
                                scope.getClass();
                                parametersHolder.getClass();
                                pm1.a aVar = (pm1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(pm1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                bv.b.f21239a.getClass();
                                bv.b.a();
                                return new kd0.r5(aVar, com.garmin.android.apps.connectmobile.k1.f37122a);
                            case 18:
                                j4 j4Var3 = j4.f92810a;
                                scope.getClass();
                                parametersHolder.getClass();
                                tn1.d dVar = parametersHolder.size() > 0 ? (tn1.d) parametersHolder.get(0) : null;
                                return new tn1.g(dVar, (tn1.c) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(tn1.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), dVar != null ? new tn1.b(dVar) : null);
                            case 19:
                                k4 k4Var2 = k4.f92823a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new v5();
                            case 20:
                                k4 k4Var3 = k4.f92823a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new no1.a();
                            case 21:
                                l4 l4Var2 = l4.f92836a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new sd0.c();
                            case 22:
                                m4 m4Var2 = m4.f92848a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.d2();
                            case 23:
                                n4 n4Var2 = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new w5();
                            case 24:
                                n4 n4Var3 = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (mp1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, mp1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 25:
                                n4 n4Var4 = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new op1.c((mp1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(mp1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                n4 n4Var5 = n4.f92860a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var14 = p005kotlin.jvm.internal.s0.f105811a;
                                Object orNull = parametersHolder.getOrNull(t0Var14.b(Long.class));
                                if (orNull != null) {
                                    return new yp1.a(((Number) orNull).longValue(), (op1.a) scope.get((k23.d<?>) t0Var14.b(op1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                                }
                                throw new DefinitionParameterException(i3.e5.i(t0Var14, Long.class, new StringBuilder("No value found for type '"), CoreConstants.SINGLE_QUOTE_CHAR));
                            case 27:
                                p4 p4Var2 = p4.f92886a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var15 = p005kotlin.jvm.internal.s0.f105811a;
                                return new dq1.q((au0.z) scope.get((k23.d<?>) t0Var15.b(au0.z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (au0.x) scope.get((k23.d<?>) t0Var15.b(au0.x.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (bu0.j) scope.get((k23.d<?>) t0Var15.b(bu0.j.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                p4 p4Var3 = p4.f92886a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new cq1.h(ModuleExtKt.androidContext(scope), (com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                p4 p4Var4 = p4.f92886a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new cq1.j((d12.e) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(d12.e.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                        }
                    }
                }, kind12, j0Var11), module30));
                break;
        }
        return Unit.INSTANCE;
    }
}
