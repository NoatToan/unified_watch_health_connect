package ic1;

import am.b2;
import am.y0;
import android.content.Context;
import c22.o;
import com.garmin.android.apps.connectmobile.audioprompts.AudioPromptsService;
import e23.p;
import i3.e5;
import id0.a0;
import id0.b0;
import id0.c0;
import id0.d0;
import id0.q;
import id0.r;
import id0.s;
import id0.t;
import id0.u;
import id0.v;
import id0.w;
import id0.y;
import id0.z;
import java.util.List;
import lc.u0;
import okhttp3.OkHttpClient;
import org.koin.android.ext.koin.ModuleExtKt;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Kind;
import org.koin.core.definition.KoinDefinition;
import org.koin.core.instance.SingleInstanceFactory;
import org.koin.core.module.Module;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.registry.ScopeRegistry;
import org.koin.core.scope.Scope;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import p13.j0;
import y80.q0;
import z10.z1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class g implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f92617a;

    @Override // e23.l
    public final Object invoke(Object obj) {
        final int i14 = 17;
        final int i15 = 16;
        final int i16 = 15;
        final int i17 = 14;
        final int i18 = 13;
        final int i19 = 20;
        final int i24 = 19;
        final int i25 = 21;
        final int i26 = 24;
        final int i27 = 23;
        final int i28 = 22;
        final int i29 = 25;
        final int i30 = 27;
        final int i34 = 26;
        switch (this.f92617a) {
            case 0:
                oi0.b bVar = (oi0.b) obj;
                i.a aVar = i.f92620g;
                bVar.getClass();
                bVar.p();
                bVar.U();
                break;
            case 1:
                oi0.b bVar2 = (oi0.b) obj;
                i.a aVar2 = i.f92620g;
                bVar2.getClass();
                bVar2.U();
                break;
            case 2:
                oi0.b bVar3 = (oi0.b) obj;
                i.a aVar3 = i.f92620g;
                bVar3.getClass();
                bVar3.U();
                break;
            case 3:
                oi0.b bVar4 = (oi0.b) obj;
                i.a aVar4 = i.f92620g;
                bVar4.getClass();
                bVar4.U();
                break;
            case 4:
                Module module = (Module) obj;
                id0.b bVar5 = id0.b.f92665a;
                module.getClass();
                i51.b bVar6 = new i51.b(i30);
                ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
                Kind kind = Kind.Factory;
                j0 j0Var = j0.f134944a;
                t0 t0Var = s0.f105811a;
                new KoinDefinition(module, e5.n(new BeanDefinition(rootScopeQualifier, t0Var.b(b2.class), null, bVar6, kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(bn.a.class), null, new i51.b(18), kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(am.d.class), null, new i51.b(i24), kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(y0.class), null, new i51.b(i19), kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(is1.a.class), null, new i51.b(i25), kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(vq.e.class), null, new i51.b(i28), kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(cn.a.class), QualifierKt.named(com.garmin.android.apps.connectmobile.dashboard.data.datasource.i.CACHE.f33229a), new i51.b(i27), kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(cn.a.class), QualifierKt.named(com.garmin.android.apps.connectmobile.dashboard.data.datasource.i.SERVER.f33229a), new i51.b(i26), kind, j0Var), module));
                lr.b.f114367a.getClass();
                module.includes(lr.b.f114368b);
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(a22.f.class), null, new i51.b(i29), kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(a22.h.class), null, new i51.b(i34), kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(m12.e.class), null, new i51.b(28), kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(fm.a.class), null, new i51.b(29), kind, j0Var), module));
                final int i35 = 0;
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(bs.b.class), null, new p() { // from class: id0.a
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        ip.i iVar;
                        ip.i iVar2;
                        switch (i35) {
                            case 0:
                                Scope scope = (Scope) obj2;
                                b bVar7 = b.f92665a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new bs.b((Context) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(Context.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                b bVar8 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new so.c();
                            case 2:
                                b bVar9 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ro.a();
                            case 3:
                                b bVar10 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new qo.a();
                            case 4:
                                b bVar11 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ro1.o0();
                            case 5:
                                Scope scope2 = (Scope) obj2;
                                b bVar12 = b.f92665a;
                                scope2.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zp.b((am.b2) scope2.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(am.b2.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                c cVar = c.f92680a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (am.b2) ez0.b.a(ez0.b.f67468a, ez0.c.GC, am.b2.class, new c83.h.a[0], null, null, null, 120);
                            case 7:
                                Scope scope3 = (Scope) obj2;
                                c cVar2 = c.f92680a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ip.f((am.b2) scope3.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(am.b2.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 8:
                                Scope scope4 = (Scope) obj2;
                                c cVar3 = c.f92680a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ip.l((am.b2) scope4.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(am.b2.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                Scope scope5 = (Scope) obj2;
                                c cVar4 = c.f92680a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.b((ip.f) scope5.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                Scope scope6 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                c cVar5 = c.f92680a;
                                scope6.getClass();
                                parametersHolder.getClass();
                                Object obj4 = (hl.a) parametersHolder.get(1);
                                if (obj4 == null) {
                                    obj4 = hl.a.c.f84256b;
                                }
                                if (p005kotlin.jvm.internal.s.g(obj4, hl.a.c.f84256b)) {
                                    iVar = (ip.i) scope6.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                } else {
                                    if (!(obj4 instanceof hl.a.b)) {
                                        lc.u0.r();
                                        return null;
                                    }
                                    iVar = (ip.i) scope6.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                }
                                return new v12.p(iVar, (List) parametersHolder.get(0));
                            case 11:
                                Scope scope7 = (Scope) obj2;
                                ParametersHolder parametersHolder2 = (ParametersHolder) obj3;
                                c cVar6 = c.f92680a;
                                scope7.getClass();
                                parametersHolder2.getClass();
                                ip.a aVar5 = (ip.a) parametersHolder2.get(0);
                                hl.a aVar6 = (hl.a) parametersHolder2.get(1);
                                if (aVar6 == null) {
                                    aVar6 = hl.a.c.f84256b;
                                }
                                if (p005kotlin.jvm.internal.s.g(aVar6, hl.a.c.f84256b)) {
                                    iVar2 = (ip.i) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                } else {
                                    if (!(aVar6 instanceof hl.a.b)) {
                                        lc.u0.r();
                                        return null;
                                    }
                                    iVar2 = (ip.i) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                }
                                return aVar5 == null ? new v12.e(iVar2, aVar6, hl.b.a(aVar6)) : new v12.i(aVar5, aVar6, hl.b.a(aVar6));
                            case 12:
                                d dVar = d.f92697a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.f();
                            case 13:
                                e eVar = e.f92711a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.g();
                            case 14:
                                f fVar = f.f92723a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.h();
                            case 15:
                                Scope scope8 = (Scope) obj2;
                                g gVar = g.f92757a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.i(ModuleExtKt.androidContext(scope8));
                            case 16:
                                h hVar = h.f92773a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.j();
                            case 17:
                                i iVar3 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new AudioPromptsService.d();
                            case 18:
                                i iVar4 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new nu.g();
                            case 19:
                                i iVar5 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.k();
                            case 20:
                                i iVar6 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.k();
                            case 21:
                                j jVar = j.f92799a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ec0.g();
                            case 22:
                                Scope scope9 = (Scope) obj2;
                                k kVar = k.f92814a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var2 = p005kotlin.jvm.internal.s0.f105811a;
                                return new l((k12.a) scope9.get((k23.d<?>) t0Var2.b(k12.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (cl0.b) scope9.get((k23.d<?>) t0Var2.b(cl0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                m mVar = m.f92840a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (su.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, su.a.class, new c83.h.a[0], null, null, null, 120);
                            case 24:
                                Scope scope10 = (Scope) obj2;
                                m mVar2 = m.f92840a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var3 = p005kotlin.jvm.internal.s0.f105811a;
                                return new yu.c((su.a) scope10.get((k23.d<?>) t0Var3.b(su.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zy0.b) scope10.get((k23.d<?>) t0Var3.b(zy0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                Scope scope11 = (Scope) obj2;
                                o oVar = o.f92864a;
                                scope11.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.q1(ModuleExtKt.androidContext(scope11), (f12.b) scope11.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                Scope scope12 = (Scope) obj2;
                                o oVar2 = o.f92864a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new pd0.a(ModuleExtKt.androidContext(scope12), (f12.l) scope12.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 27:
                                o oVar3 = o.f92864a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.h5(dv.m.a.a(dv.m.f61336b));
                            case 28:
                                Scope scope13 = (Scope) obj2;
                                o oVar4 = o.f92864a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                k12.d dVarA = k12.d.a.a(k12.d.f102315g);
                                m12.k kVar2 = new m12.k(null, 1, null);
                                p005kotlin.jvm.internal.t0 t0Var4 = p005kotlin.jvm.internal.s0.f105811a;
                                return new qd0.b(dVarA, kVar2, (f12.b) scope13.get((k23.d<?>) t0Var4.b(f12.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (f12.l) scope13.get((k23.d<?>) t0Var4.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                o oVar5 = o.f92864a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new nd0.e();
                        }
                    }
                }, kind, j0Var), module));
                final int i36 = 1;
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(so.a.class), null, new p() { // from class: id0.a
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        ip.i iVar;
                        ip.i iVar2;
                        switch (i36) {
                            case 0:
                                Scope scope = (Scope) obj2;
                                b bVar7 = b.f92665a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new bs.b((Context) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(Context.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                b bVar8 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new so.c();
                            case 2:
                                b bVar9 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ro.a();
                            case 3:
                                b bVar10 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new qo.a();
                            case 4:
                                b bVar11 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ro1.o0();
                            case 5:
                                Scope scope2 = (Scope) obj2;
                                b bVar12 = b.f92665a;
                                scope2.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zp.b((am.b2) scope2.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(am.b2.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                c cVar = c.f92680a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (am.b2) ez0.b.a(ez0.b.f67468a, ez0.c.GC, am.b2.class, new c83.h.a[0], null, null, null, 120);
                            case 7:
                                Scope scope3 = (Scope) obj2;
                                c cVar2 = c.f92680a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ip.f((am.b2) scope3.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(am.b2.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 8:
                                Scope scope4 = (Scope) obj2;
                                c cVar3 = c.f92680a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ip.l((am.b2) scope4.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(am.b2.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                Scope scope5 = (Scope) obj2;
                                c cVar4 = c.f92680a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.b((ip.f) scope5.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                Scope scope6 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                c cVar5 = c.f92680a;
                                scope6.getClass();
                                parametersHolder.getClass();
                                Object obj4 = (hl.a) parametersHolder.get(1);
                                if (obj4 == null) {
                                    obj4 = hl.a.c.f84256b;
                                }
                                if (p005kotlin.jvm.internal.s.g(obj4, hl.a.c.f84256b)) {
                                    iVar = (ip.i) scope6.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                } else {
                                    if (!(obj4 instanceof hl.a.b)) {
                                        lc.u0.r();
                                        return null;
                                    }
                                    iVar = (ip.i) scope6.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                }
                                return new v12.p(iVar, (List) parametersHolder.get(0));
                            case 11:
                                Scope scope7 = (Scope) obj2;
                                ParametersHolder parametersHolder2 = (ParametersHolder) obj3;
                                c cVar6 = c.f92680a;
                                scope7.getClass();
                                parametersHolder2.getClass();
                                ip.a aVar5 = (ip.a) parametersHolder2.get(0);
                                hl.a aVar6 = (hl.a) parametersHolder2.get(1);
                                if (aVar6 == null) {
                                    aVar6 = hl.a.c.f84256b;
                                }
                                if (p005kotlin.jvm.internal.s.g(aVar6, hl.a.c.f84256b)) {
                                    iVar2 = (ip.i) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                } else {
                                    if (!(aVar6 instanceof hl.a.b)) {
                                        lc.u0.r();
                                        return null;
                                    }
                                    iVar2 = (ip.i) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                }
                                return aVar5 == null ? new v12.e(iVar2, aVar6, hl.b.a(aVar6)) : new v12.i(aVar5, aVar6, hl.b.a(aVar6));
                            case 12:
                                d dVar = d.f92697a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.f();
                            case 13:
                                e eVar = e.f92711a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.g();
                            case 14:
                                f fVar = f.f92723a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.h();
                            case 15:
                                Scope scope8 = (Scope) obj2;
                                g gVar = g.f92757a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.i(ModuleExtKt.androidContext(scope8));
                            case 16:
                                h hVar = h.f92773a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.j();
                            case 17:
                                i iVar3 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new AudioPromptsService.d();
                            case 18:
                                i iVar4 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new nu.g();
                            case 19:
                                i iVar5 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.k();
                            case 20:
                                i iVar6 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.k();
                            case 21:
                                j jVar = j.f92799a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ec0.g();
                            case 22:
                                Scope scope9 = (Scope) obj2;
                                k kVar = k.f92814a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var2 = p005kotlin.jvm.internal.s0.f105811a;
                                return new l((k12.a) scope9.get((k23.d<?>) t0Var2.b(k12.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (cl0.b) scope9.get((k23.d<?>) t0Var2.b(cl0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                m mVar = m.f92840a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (su.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, su.a.class, new c83.h.a[0], null, null, null, 120);
                            case 24:
                                Scope scope10 = (Scope) obj2;
                                m mVar2 = m.f92840a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var3 = p005kotlin.jvm.internal.s0.f105811a;
                                return new yu.c((su.a) scope10.get((k23.d<?>) t0Var3.b(su.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zy0.b) scope10.get((k23.d<?>) t0Var3.b(zy0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                Scope scope11 = (Scope) obj2;
                                o oVar = o.f92864a;
                                scope11.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.q1(ModuleExtKt.androidContext(scope11), (f12.b) scope11.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                Scope scope12 = (Scope) obj2;
                                o oVar2 = o.f92864a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new pd0.a(ModuleExtKt.androidContext(scope12), (f12.l) scope12.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 27:
                                o oVar3 = o.f92864a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.h5(dv.m.a.a(dv.m.f61336b));
                            case 28:
                                Scope scope13 = (Scope) obj2;
                                o oVar4 = o.f92864a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                k12.d dVarA = k12.d.a.a(k12.d.f102315g);
                                m12.k kVar2 = new m12.k(null, 1, null);
                                p005kotlin.jvm.internal.t0 t0Var4 = p005kotlin.jvm.internal.s0.f105811a;
                                return new qd0.b(dVarA, kVar2, (f12.b) scope13.get((k23.d<?>) t0Var4.b(f12.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (f12.l) scope13.get((k23.d<?>) t0Var4.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                o oVar5 = o.f92864a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new nd0.e();
                        }
                    }
                }, kind, j0Var), module));
                final int i37 = 2;
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(de0.a.class), null, new p() { // from class: id0.a
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        ip.i iVar;
                        ip.i iVar2;
                        switch (i37) {
                            case 0:
                                Scope scope = (Scope) obj2;
                                b bVar7 = b.f92665a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new bs.b((Context) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(Context.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                b bVar8 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new so.c();
                            case 2:
                                b bVar9 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ro.a();
                            case 3:
                                b bVar10 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new qo.a();
                            case 4:
                                b bVar11 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ro1.o0();
                            case 5:
                                Scope scope2 = (Scope) obj2;
                                b bVar12 = b.f92665a;
                                scope2.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zp.b((am.b2) scope2.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(am.b2.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                c cVar = c.f92680a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (am.b2) ez0.b.a(ez0.b.f67468a, ez0.c.GC, am.b2.class, new c83.h.a[0], null, null, null, 120);
                            case 7:
                                Scope scope3 = (Scope) obj2;
                                c cVar2 = c.f92680a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ip.f((am.b2) scope3.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(am.b2.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 8:
                                Scope scope4 = (Scope) obj2;
                                c cVar3 = c.f92680a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ip.l((am.b2) scope4.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(am.b2.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                Scope scope5 = (Scope) obj2;
                                c cVar4 = c.f92680a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.b((ip.f) scope5.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                Scope scope6 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                c cVar5 = c.f92680a;
                                scope6.getClass();
                                parametersHolder.getClass();
                                Object obj4 = (hl.a) parametersHolder.get(1);
                                if (obj4 == null) {
                                    obj4 = hl.a.c.f84256b;
                                }
                                if (p005kotlin.jvm.internal.s.g(obj4, hl.a.c.f84256b)) {
                                    iVar = (ip.i) scope6.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                } else {
                                    if (!(obj4 instanceof hl.a.b)) {
                                        lc.u0.r();
                                        return null;
                                    }
                                    iVar = (ip.i) scope6.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                }
                                return new v12.p(iVar, (List) parametersHolder.get(0));
                            case 11:
                                Scope scope7 = (Scope) obj2;
                                ParametersHolder parametersHolder2 = (ParametersHolder) obj3;
                                c cVar6 = c.f92680a;
                                scope7.getClass();
                                parametersHolder2.getClass();
                                ip.a aVar5 = (ip.a) parametersHolder2.get(0);
                                hl.a aVar6 = (hl.a) parametersHolder2.get(1);
                                if (aVar6 == null) {
                                    aVar6 = hl.a.c.f84256b;
                                }
                                if (p005kotlin.jvm.internal.s.g(aVar6, hl.a.c.f84256b)) {
                                    iVar2 = (ip.i) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                } else {
                                    if (!(aVar6 instanceof hl.a.b)) {
                                        lc.u0.r();
                                        return null;
                                    }
                                    iVar2 = (ip.i) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                }
                                return aVar5 == null ? new v12.e(iVar2, aVar6, hl.b.a(aVar6)) : new v12.i(aVar5, aVar6, hl.b.a(aVar6));
                            case 12:
                                d dVar = d.f92697a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.f();
                            case 13:
                                e eVar = e.f92711a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.g();
                            case 14:
                                f fVar = f.f92723a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.h();
                            case 15:
                                Scope scope8 = (Scope) obj2;
                                g gVar = g.f92757a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.i(ModuleExtKt.androidContext(scope8));
                            case 16:
                                h hVar = h.f92773a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.j();
                            case 17:
                                i iVar3 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new AudioPromptsService.d();
                            case 18:
                                i iVar4 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new nu.g();
                            case 19:
                                i iVar5 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.k();
                            case 20:
                                i iVar6 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.k();
                            case 21:
                                j jVar = j.f92799a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ec0.g();
                            case 22:
                                Scope scope9 = (Scope) obj2;
                                k kVar = k.f92814a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var2 = p005kotlin.jvm.internal.s0.f105811a;
                                return new l((k12.a) scope9.get((k23.d<?>) t0Var2.b(k12.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (cl0.b) scope9.get((k23.d<?>) t0Var2.b(cl0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                m mVar = m.f92840a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (su.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, su.a.class, new c83.h.a[0], null, null, null, 120);
                            case 24:
                                Scope scope10 = (Scope) obj2;
                                m mVar2 = m.f92840a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var3 = p005kotlin.jvm.internal.s0.f105811a;
                                return new yu.c((su.a) scope10.get((k23.d<?>) t0Var3.b(su.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zy0.b) scope10.get((k23.d<?>) t0Var3.b(zy0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                Scope scope11 = (Scope) obj2;
                                o oVar = o.f92864a;
                                scope11.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.q1(ModuleExtKt.androidContext(scope11), (f12.b) scope11.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                Scope scope12 = (Scope) obj2;
                                o oVar2 = o.f92864a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new pd0.a(ModuleExtKt.androidContext(scope12), (f12.l) scope12.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 27:
                                o oVar3 = o.f92864a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.h5(dv.m.a.a(dv.m.f61336b));
                            case 28:
                                Scope scope13 = (Scope) obj2;
                                o oVar4 = o.f92864a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                k12.d dVarA = k12.d.a.a(k12.d.f102315g);
                                m12.k kVar2 = new m12.k(null, 1, null);
                                p005kotlin.jvm.internal.t0 t0Var4 = p005kotlin.jvm.internal.s0.f105811a;
                                return new qd0.b(dVarA, kVar2, (f12.b) scope13.get((k23.d<?>) t0Var4.b(f12.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (f12.l) scope13.get((k23.d<?>) t0Var4.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                o oVar5 = o.f92864a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new nd0.e();
                        }
                    }
                }, kind, j0Var), module));
                final int i38 = 3;
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(de0.b.class), null, new p() { // from class: id0.a
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        ip.i iVar;
                        ip.i iVar2;
                        switch (i38) {
                            case 0:
                                Scope scope = (Scope) obj2;
                                b bVar7 = b.f92665a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new bs.b((Context) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(Context.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                b bVar8 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new so.c();
                            case 2:
                                b bVar9 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ro.a();
                            case 3:
                                b bVar10 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new qo.a();
                            case 4:
                                b bVar11 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ro1.o0();
                            case 5:
                                Scope scope2 = (Scope) obj2;
                                b bVar12 = b.f92665a;
                                scope2.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zp.b((am.b2) scope2.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(am.b2.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                c cVar = c.f92680a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (am.b2) ez0.b.a(ez0.b.f67468a, ez0.c.GC, am.b2.class, new c83.h.a[0], null, null, null, 120);
                            case 7:
                                Scope scope3 = (Scope) obj2;
                                c cVar2 = c.f92680a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ip.f((am.b2) scope3.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(am.b2.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 8:
                                Scope scope4 = (Scope) obj2;
                                c cVar3 = c.f92680a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ip.l((am.b2) scope4.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(am.b2.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                Scope scope5 = (Scope) obj2;
                                c cVar4 = c.f92680a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.b((ip.f) scope5.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                Scope scope6 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                c cVar5 = c.f92680a;
                                scope6.getClass();
                                parametersHolder.getClass();
                                Object obj4 = (hl.a) parametersHolder.get(1);
                                if (obj4 == null) {
                                    obj4 = hl.a.c.f84256b;
                                }
                                if (p005kotlin.jvm.internal.s.g(obj4, hl.a.c.f84256b)) {
                                    iVar = (ip.i) scope6.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                } else {
                                    if (!(obj4 instanceof hl.a.b)) {
                                        lc.u0.r();
                                        return null;
                                    }
                                    iVar = (ip.i) scope6.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                }
                                return new v12.p(iVar, (List) parametersHolder.get(0));
                            case 11:
                                Scope scope7 = (Scope) obj2;
                                ParametersHolder parametersHolder2 = (ParametersHolder) obj3;
                                c cVar6 = c.f92680a;
                                scope7.getClass();
                                parametersHolder2.getClass();
                                ip.a aVar5 = (ip.a) parametersHolder2.get(0);
                                hl.a aVar6 = (hl.a) parametersHolder2.get(1);
                                if (aVar6 == null) {
                                    aVar6 = hl.a.c.f84256b;
                                }
                                if (p005kotlin.jvm.internal.s.g(aVar6, hl.a.c.f84256b)) {
                                    iVar2 = (ip.i) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                } else {
                                    if (!(aVar6 instanceof hl.a.b)) {
                                        lc.u0.r();
                                        return null;
                                    }
                                    iVar2 = (ip.i) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                }
                                return aVar5 == null ? new v12.e(iVar2, aVar6, hl.b.a(aVar6)) : new v12.i(aVar5, aVar6, hl.b.a(aVar6));
                            case 12:
                                d dVar = d.f92697a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.f();
                            case 13:
                                e eVar = e.f92711a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.g();
                            case 14:
                                f fVar = f.f92723a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.h();
                            case 15:
                                Scope scope8 = (Scope) obj2;
                                g gVar = g.f92757a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.i(ModuleExtKt.androidContext(scope8));
                            case 16:
                                h hVar = h.f92773a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.j();
                            case 17:
                                i iVar3 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new AudioPromptsService.d();
                            case 18:
                                i iVar4 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new nu.g();
                            case 19:
                                i iVar5 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.k();
                            case 20:
                                i iVar6 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.k();
                            case 21:
                                j jVar = j.f92799a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ec0.g();
                            case 22:
                                Scope scope9 = (Scope) obj2;
                                k kVar = k.f92814a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var2 = p005kotlin.jvm.internal.s0.f105811a;
                                return new l((k12.a) scope9.get((k23.d<?>) t0Var2.b(k12.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (cl0.b) scope9.get((k23.d<?>) t0Var2.b(cl0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                m mVar = m.f92840a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (su.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, su.a.class, new c83.h.a[0], null, null, null, 120);
                            case 24:
                                Scope scope10 = (Scope) obj2;
                                m mVar2 = m.f92840a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var3 = p005kotlin.jvm.internal.s0.f105811a;
                                return new yu.c((su.a) scope10.get((k23.d<?>) t0Var3.b(su.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zy0.b) scope10.get((k23.d<?>) t0Var3.b(zy0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                Scope scope11 = (Scope) obj2;
                                o oVar = o.f92864a;
                                scope11.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.q1(ModuleExtKt.androidContext(scope11), (f12.b) scope11.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                Scope scope12 = (Scope) obj2;
                                o oVar2 = o.f92864a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new pd0.a(ModuleExtKt.androidContext(scope12), (f12.l) scope12.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 27:
                                o oVar3 = o.f92864a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.h5(dv.m.a.a(dv.m.f61336b));
                            case 28:
                                Scope scope13 = (Scope) obj2;
                                o oVar4 = o.f92864a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                k12.d dVarA = k12.d.a.a(k12.d.f102315g);
                                m12.k kVar2 = new m12.k(null, 1, null);
                                p005kotlin.jvm.internal.t0 t0Var4 = p005kotlin.jvm.internal.s0.f105811a;
                                return new qd0.b(dVarA, kVar2, (f12.b) scope13.get((k23.d<?>) t0Var4.b(f12.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (f12.l) scope13.get((k23.d<?>) t0Var4.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                o oVar5 = o.f92864a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new nd0.e();
                        }
                    }
                }, kind, j0Var), module));
                final int i39 = 4;
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(kr.j.class), null, new p() { // from class: id0.a
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        ip.i iVar;
                        ip.i iVar2;
                        switch (i39) {
                            case 0:
                                Scope scope = (Scope) obj2;
                                b bVar7 = b.f92665a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new bs.b((Context) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(Context.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                b bVar8 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new so.c();
                            case 2:
                                b bVar9 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ro.a();
                            case 3:
                                b bVar10 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new qo.a();
                            case 4:
                                b bVar11 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ro1.o0();
                            case 5:
                                Scope scope2 = (Scope) obj2;
                                b bVar12 = b.f92665a;
                                scope2.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zp.b((am.b2) scope2.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(am.b2.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                c cVar = c.f92680a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (am.b2) ez0.b.a(ez0.b.f67468a, ez0.c.GC, am.b2.class, new c83.h.a[0], null, null, null, 120);
                            case 7:
                                Scope scope3 = (Scope) obj2;
                                c cVar2 = c.f92680a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ip.f((am.b2) scope3.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(am.b2.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 8:
                                Scope scope4 = (Scope) obj2;
                                c cVar3 = c.f92680a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ip.l((am.b2) scope4.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(am.b2.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                Scope scope5 = (Scope) obj2;
                                c cVar4 = c.f92680a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.b((ip.f) scope5.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                Scope scope6 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                c cVar5 = c.f92680a;
                                scope6.getClass();
                                parametersHolder.getClass();
                                Object obj4 = (hl.a) parametersHolder.get(1);
                                if (obj4 == null) {
                                    obj4 = hl.a.c.f84256b;
                                }
                                if (p005kotlin.jvm.internal.s.g(obj4, hl.a.c.f84256b)) {
                                    iVar = (ip.i) scope6.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                } else {
                                    if (!(obj4 instanceof hl.a.b)) {
                                        lc.u0.r();
                                        return null;
                                    }
                                    iVar = (ip.i) scope6.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                }
                                return new v12.p(iVar, (List) parametersHolder.get(0));
                            case 11:
                                Scope scope7 = (Scope) obj2;
                                ParametersHolder parametersHolder2 = (ParametersHolder) obj3;
                                c cVar6 = c.f92680a;
                                scope7.getClass();
                                parametersHolder2.getClass();
                                ip.a aVar5 = (ip.a) parametersHolder2.get(0);
                                hl.a aVar6 = (hl.a) parametersHolder2.get(1);
                                if (aVar6 == null) {
                                    aVar6 = hl.a.c.f84256b;
                                }
                                if (p005kotlin.jvm.internal.s.g(aVar6, hl.a.c.f84256b)) {
                                    iVar2 = (ip.i) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                } else {
                                    if (!(aVar6 instanceof hl.a.b)) {
                                        lc.u0.r();
                                        return null;
                                    }
                                    iVar2 = (ip.i) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                }
                                return aVar5 == null ? new v12.e(iVar2, aVar6, hl.b.a(aVar6)) : new v12.i(aVar5, aVar6, hl.b.a(aVar6));
                            case 12:
                                d dVar = d.f92697a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.f();
                            case 13:
                                e eVar = e.f92711a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.g();
                            case 14:
                                f fVar = f.f92723a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.h();
                            case 15:
                                Scope scope8 = (Scope) obj2;
                                g gVar = g.f92757a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.i(ModuleExtKt.androidContext(scope8));
                            case 16:
                                h hVar = h.f92773a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.j();
                            case 17:
                                i iVar3 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new AudioPromptsService.d();
                            case 18:
                                i iVar4 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new nu.g();
                            case 19:
                                i iVar5 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.k();
                            case 20:
                                i iVar6 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.k();
                            case 21:
                                j jVar = j.f92799a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ec0.g();
                            case 22:
                                Scope scope9 = (Scope) obj2;
                                k kVar = k.f92814a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var2 = p005kotlin.jvm.internal.s0.f105811a;
                                return new l((k12.a) scope9.get((k23.d<?>) t0Var2.b(k12.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (cl0.b) scope9.get((k23.d<?>) t0Var2.b(cl0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                m mVar = m.f92840a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (su.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, su.a.class, new c83.h.a[0], null, null, null, 120);
                            case 24:
                                Scope scope10 = (Scope) obj2;
                                m mVar2 = m.f92840a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var3 = p005kotlin.jvm.internal.s0.f105811a;
                                return new yu.c((su.a) scope10.get((k23.d<?>) t0Var3.b(su.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zy0.b) scope10.get((k23.d<?>) t0Var3.b(zy0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                Scope scope11 = (Scope) obj2;
                                o oVar = o.f92864a;
                                scope11.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.q1(ModuleExtKt.androidContext(scope11), (f12.b) scope11.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                Scope scope12 = (Scope) obj2;
                                o oVar2 = o.f92864a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new pd0.a(ModuleExtKt.androidContext(scope12), (f12.l) scope12.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 27:
                                o oVar3 = o.f92864a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.h5(dv.m.a.a(dv.m.f61336b));
                            case 28:
                                Scope scope13 = (Scope) obj2;
                                o oVar4 = o.f92864a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                k12.d dVarA = k12.d.a.a(k12.d.f102315g);
                                m12.k kVar2 = new m12.k(null, 1, null);
                                p005kotlin.jvm.internal.t0 t0Var4 = p005kotlin.jvm.internal.s0.f105811a;
                                return new qd0.b(dVarA, kVar2, (f12.b) scope13.get((k23.d<?>) t0Var4.b(f12.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (f12.l) scope13.get((k23.d<?>) t0Var4.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                o oVar5 = o.f92864a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new nd0.e();
                        }
                    }
                }, kind, j0Var), module));
                final int i44 = 5;
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(zp.a.class), null, new p() { // from class: id0.a
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        ip.i iVar;
                        ip.i iVar2;
                        switch (i44) {
                            case 0:
                                Scope scope = (Scope) obj2;
                                b bVar7 = b.f92665a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new bs.b((Context) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(Context.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                b bVar8 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new so.c();
                            case 2:
                                b bVar9 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ro.a();
                            case 3:
                                b bVar10 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new qo.a();
                            case 4:
                                b bVar11 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ro1.o0();
                            case 5:
                                Scope scope2 = (Scope) obj2;
                                b bVar12 = b.f92665a;
                                scope2.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zp.b((am.b2) scope2.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(am.b2.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                c cVar = c.f92680a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (am.b2) ez0.b.a(ez0.b.f67468a, ez0.c.GC, am.b2.class, new c83.h.a[0], null, null, null, 120);
                            case 7:
                                Scope scope3 = (Scope) obj2;
                                c cVar2 = c.f92680a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ip.f((am.b2) scope3.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(am.b2.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 8:
                                Scope scope4 = (Scope) obj2;
                                c cVar3 = c.f92680a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ip.l((am.b2) scope4.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(am.b2.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                Scope scope5 = (Scope) obj2;
                                c cVar4 = c.f92680a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.b((ip.f) scope5.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                Scope scope6 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                c cVar5 = c.f92680a;
                                scope6.getClass();
                                parametersHolder.getClass();
                                Object obj4 = (hl.a) parametersHolder.get(1);
                                if (obj4 == null) {
                                    obj4 = hl.a.c.f84256b;
                                }
                                if (p005kotlin.jvm.internal.s.g(obj4, hl.a.c.f84256b)) {
                                    iVar = (ip.i) scope6.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                } else {
                                    if (!(obj4 instanceof hl.a.b)) {
                                        lc.u0.r();
                                        return null;
                                    }
                                    iVar = (ip.i) scope6.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                }
                                return new v12.p(iVar, (List) parametersHolder.get(0));
                            case 11:
                                Scope scope7 = (Scope) obj2;
                                ParametersHolder parametersHolder2 = (ParametersHolder) obj3;
                                c cVar6 = c.f92680a;
                                scope7.getClass();
                                parametersHolder2.getClass();
                                ip.a aVar5 = (ip.a) parametersHolder2.get(0);
                                hl.a aVar6 = (hl.a) parametersHolder2.get(1);
                                if (aVar6 == null) {
                                    aVar6 = hl.a.c.f84256b;
                                }
                                if (p005kotlin.jvm.internal.s.g(aVar6, hl.a.c.f84256b)) {
                                    iVar2 = (ip.i) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                } else {
                                    if (!(aVar6 instanceof hl.a.b)) {
                                        lc.u0.r();
                                        return null;
                                    }
                                    iVar2 = (ip.i) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                }
                                return aVar5 == null ? new v12.e(iVar2, aVar6, hl.b.a(aVar6)) : new v12.i(aVar5, aVar6, hl.b.a(aVar6));
                            case 12:
                                d dVar = d.f92697a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.f();
                            case 13:
                                e eVar = e.f92711a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.g();
                            case 14:
                                f fVar = f.f92723a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.h();
                            case 15:
                                Scope scope8 = (Scope) obj2;
                                g gVar = g.f92757a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.i(ModuleExtKt.androidContext(scope8));
                            case 16:
                                h hVar = h.f92773a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.j();
                            case 17:
                                i iVar3 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new AudioPromptsService.d();
                            case 18:
                                i iVar4 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new nu.g();
                            case 19:
                                i iVar5 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.k();
                            case 20:
                                i iVar6 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.k();
                            case 21:
                                j jVar = j.f92799a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ec0.g();
                            case 22:
                                Scope scope9 = (Scope) obj2;
                                k kVar = k.f92814a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var2 = p005kotlin.jvm.internal.s0.f105811a;
                                return new l((k12.a) scope9.get((k23.d<?>) t0Var2.b(k12.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (cl0.b) scope9.get((k23.d<?>) t0Var2.b(cl0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                m mVar = m.f92840a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (su.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, su.a.class, new c83.h.a[0], null, null, null, 120);
                            case 24:
                                Scope scope10 = (Scope) obj2;
                                m mVar2 = m.f92840a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var3 = p005kotlin.jvm.internal.s0.f105811a;
                                return new yu.c((su.a) scope10.get((k23.d<?>) t0Var3.b(su.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zy0.b) scope10.get((k23.d<?>) t0Var3.b(zy0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                Scope scope11 = (Scope) obj2;
                                o oVar = o.f92864a;
                                scope11.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.q1(ModuleExtKt.androidContext(scope11), (f12.b) scope11.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                Scope scope12 = (Scope) obj2;
                                o oVar2 = o.f92864a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new pd0.a(ModuleExtKt.androidContext(scope12), (f12.l) scope12.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 27:
                                o oVar3 = o.f92864a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.h5(dv.m.a.a(dv.m.f61336b));
                            case 28:
                                Scope scope13 = (Scope) obj2;
                                o oVar4 = o.f92864a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                k12.d dVarA = k12.d.a.a(k12.d.f102315g);
                                m12.k kVar2 = new m12.k(null, 1, null);
                                p005kotlin.jvm.internal.t0 t0Var4 = p005kotlin.jvm.internal.s0.f105811a;
                                return new qd0.b(dVarA, kVar2, (f12.b) scope13.get((k23.d<?>) t0Var4.b(f12.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (f12.l) scope13.get((k23.d<?>) t0Var4.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                o oVar5 = o.f92864a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new nd0.e();
                        }
                    }
                }, kind, j0Var), module));
                break;
            case 5:
                Module module2 = (Module) obj;
                id0.c cVar = id0.c.f92680a;
                module2.getClass();
                final int i45 = 6;
                p pVar = new p() { // from class: id0.a
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        ip.i iVar;
                        ip.i iVar2;
                        switch (i45) {
                            case 0:
                                Scope scope = (Scope) obj2;
                                b bVar7 = b.f92665a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new bs.b((Context) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(Context.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                b bVar8 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new so.c();
                            case 2:
                                b bVar9 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ro.a();
                            case 3:
                                b bVar10 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new qo.a();
                            case 4:
                                b bVar11 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ro1.o0();
                            case 5:
                                Scope scope2 = (Scope) obj2;
                                b bVar12 = b.f92665a;
                                scope2.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zp.b((am.b2) scope2.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(am.b2.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                c cVar2 = c.f92680a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (am.b2) ez0.b.a(ez0.b.f67468a, ez0.c.GC, am.b2.class, new c83.h.a[0], null, null, null, 120);
                            case 7:
                                Scope scope3 = (Scope) obj2;
                                c cVar3 = c.f92680a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ip.f((am.b2) scope3.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(am.b2.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 8:
                                Scope scope4 = (Scope) obj2;
                                c cVar4 = c.f92680a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ip.l((am.b2) scope4.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(am.b2.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                Scope scope5 = (Scope) obj2;
                                c cVar5 = c.f92680a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.b((ip.f) scope5.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                Scope scope6 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                c cVar6 = c.f92680a;
                                scope6.getClass();
                                parametersHolder.getClass();
                                Object obj4 = (hl.a) parametersHolder.get(1);
                                if (obj4 == null) {
                                    obj4 = hl.a.c.f84256b;
                                }
                                if (p005kotlin.jvm.internal.s.g(obj4, hl.a.c.f84256b)) {
                                    iVar = (ip.i) scope6.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                } else {
                                    if (!(obj4 instanceof hl.a.b)) {
                                        lc.u0.r();
                                        return null;
                                    }
                                    iVar = (ip.i) scope6.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                }
                                return new v12.p(iVar, (List) parametersHolder.get(0));
                            case 11:
                                Scope scope7 = (Scope) obj2;
                                ParametersHolder parametersHolder2 = (ParametersHolder) obj3;
                                c cVar7 = c.f92680a;
                                scope7.getClass();
                                parametersHolder2.getClass();
                                ip.a aVar5 = (ip.a) parametersHolder2.get(0);
                                hl.a aVar6 = (hl.a) parametersHolder2.get(1);
                                if (aVar6 == null) {
                                    aVar6 = hl.a.c.f84256b;
                                }
                                if (p005kotlin.jvm.internal.s.g(aVar6, hl.a.c.f84256b)) {
                                    iVar2 = (ip.i) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                } else {
                                    if (!(aVar6 instanceof hl.a.b)) {
                                        lc.u0.r();
                                        return null;
                                    }
                                    iVar2 = (ip.i) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                }
                                return aVar5 == null ? new v12.e(iVar2, aVar6, hl.b.a(aVar6)) : new v12.i(aVar5, aVar6, hl.b.a(aVar6));
                            case 12:
                                d dVar = d.f92697a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.f();
                            case 13:
                                e eVar = e.f92711a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.g();
                            case 14:
                                f fVar = f.f92723a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.h();
                            case 15:
                                Scope scope8 = (Scope) obj2;
                                g gVar = g.f92757a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.i(ModuleExtKt.androidContext(scope8));
                            case 16:
                                h hVar = h.f92773a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.j();
                            case 17:
                                i iVar3 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new AudioPromptsService.d();
                            case 18:
                                i iVar4 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new nu.g();
                            case 19:
                                i iVar5 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.k();
                            case 20:
                                i iVar6 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.k();
                            case 21:
                                j jVar = j.f92799a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ec0.g();
                            case 22:
                                Scope scope9 = (Scope) obj2;
                                k kVar = k.f92814a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var2 = p005kotlin.jvm.internal.s0.f105811a;
                                return new l((k12.a) scope9.get((k23.d<?>) t0Var2.b(k12.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (cl0.b) scope9.get((k23.d<?>) t0Var2.b(cl0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                m mVar = m.f92840a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (su.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, su.a.class, new c83.h.a[0], null, null, null, 120);
                            case 24:
                                Scope scope10 = (Scope) obj2;
                                m mVar2 = m.f92840a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var3 = p005kotlin.jvm.internal.s0.f105811a;
                                return new yu.c((su.a) scope10.get((k23.d<?>) t0Var3.b(su.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zy0.b) scope10.get((k23.d<?>) t0Var3.b(zy0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                Scope scope11 = (Scope) obj2;
                                o oVar = o.f92864a;
                                scope11.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.q1(ModuleExtKt.androidContext(scope11), (f12.b) scope11.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                Scope scope12 = (Scope) obj2;
                                o oVar2 = o.f92864a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new pd0.a(ModuleExtKt.androidContext(scope12), (f12.l) scope12.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 27:
                                o oVar3 = o.f92864a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.h5(dv.m.a.a(dv.m.f61336b));
                            case 28:
                                Scope scope13 = (Scope) obj2;
                                o oVar4 = o.f92864a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                k12.d dVarA = k12.d.a.a(k12.d.f102315g);
                                m12.k kVar2 = new m12.k(null, 1, null);
                                p005kotlin.jvm.internal.t0 t0Var4 = p005kotlin.jvm.internal.s0.f105811a;
                                return new qd0.b(dVarA, kVar2, (f12.b) scope13.get((k23.d<?>) t0Var4.b(f12.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (f12.l) scope13.get((k23.d<?>) t0Var4.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                o oVar5 = o.f92864a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new nd0.e();
                        }
                    }
                };
                ScopeRegistry.Companion companion2 = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier2 = companion2.getRootScopeQualifier();
                Kind kind2 = Kind.Factory;
                j0 j0Var2 = j0.f134944a;
                t0 t0Var2 = s0.f105811a;
                new KoinDefinition(module2, e5.n(new BeanDefinition(rootScopeQualifier2, t0Var2.b(b2.class), null, pVar, kind2, j0Var2), module2));
                final int i46 = 7;
                new KoinDefinition(module2, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(ip.f.class), null, new p() { // from class: id0.a
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        ip.i iVar;
                        ip.i iVar2;
                        switch (i46) {
                            case 0:
                                Scope scope = (Scope) obj2;
                                b bVar7 = b.f92665a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new bs.b((Context) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(Context.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                b bVar8 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new so.c();
                            case 2:
                                b bVar9 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ro.a();
                            case 3:
                                b bVar10 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new qo.a();
                            case 4:
                                b bVar11 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ro1.o0();
                            case 5:
                                Scope scope2 = (Scope) obj2;
                                b bVar12 = b.f92665a;
                                scope2.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zp.b((am.b2) scope2.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(am.b2.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                c cVar2 = c.f92680a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (am.b2) ez0.b.a(ez0.b.f67468a, ez0.c.GC, am.b2.class, new c83.h.a[0], null, null, null, 120);
                            case 7:
                                Scope scope3 = (Scope) obj2;
                                c cVar3 = c.f92680a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ip.f((am.b2) scope3.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(am.b2.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 8:
                                Scope scope4 = (Scope) obj2;
                                c cVar4 = c.f92680a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ip.l((am.b2) scope4.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(am.b2.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                Scope scope5 = (Scope) obj2;
                                c cVar5 = c.f92680a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.b((ip.f) scope5.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                Scope scope6 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                c cVar6 = c.f92680a;
                                scope6.getClass();
                                parametersHolder.getClass();
                                Object obj4 = (hl.a) parametersHolder.get(1);
                                if (obj4 == null) {
                                    obj4 = hl.a.c.f84256b;
                                }
                                if (p005kotlin.jvm.internal.s.g(obj4, hl.a.c.f84256b)) {
                                    iVar = (ip.i) scope6.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                } else {
                                    if (!(obj4 instanceof hl.a.b)) {
                                        lc.u0.r();
                                        return null;
                                    }
                                    iVar = (ip.i) scope6.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                }
                                return new v12.p(iVar, (List) parametersHolder.get(0));
                            case 11:
                                Scope scope7 = (Scope) obj2;
                                ParametersHolder parametersHolder2 = (ParametersHolder) obj3;
                                c cVar7 = c.f92680a;
                                scope7.getClass();
                                parametersHolder2.getClass();
                                ip.a aVar5 = (ip.a) parametersHolder2.get(0);
                                hl.a aVar6 = (hl.a) parametersHolder2.get(1);
                                if (aVar6 == null) {
                                    aVar6 = hl.a.c.f84256b;
                                }
                                if (p005kotlin.jvm.internal.s.g(aVar6, hl.a.c.f84256b)) {
                                    iVar2 = (ip.i) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                } else {
                                    if (!(aVar6 instanceof hl.a.b)) {
                                        lc.u0.r();
                                        return null;
                                    }
                                    iVar2 = (ip.i) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                }
                                return aVar5 == null ? new v12.e(iVar2, aVar6, hl.b.a(aVar6)) : new v12.i(aVar5, aVar6, hl.b.a(aVar6));
                            case 12:
                                d dVar = d.f92697a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.f();
                            case 13:
                                e eVar = e.f92711a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.g();
                            case 14:
                                f fVar = f.f92723a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.h();
                            case 15:
                                Scope scope8 = (Scope) obj2;
                                g gVar = g.f92757a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.i(ModuleExtKt.androidContext(scope8));
                            case 16:
                                h hVar = h.f92773a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.j();
                            case 17:
                                i iVar3 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new AudioPromptsService.d();
                            case 18:
                                i iVar4 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new nu.g();
                            case 19:
                                i iVar5 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.k();
                            case 20:
                                i iVar6 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.k();
                            case 21:
                                j jVar = j.f92799a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ec0.g();
                            case 22:
                                Scope scope9 = (Scope) obj2;
                                k kVar = k.f92814a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var3 = p005kotlin.jvm.internal.s0.f105811a;
                                return new l((k12.a) scope9.get((k23.d<?>) t0Var3.b(k12.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (cl0.b) scope9.get((k23.d<?>) t0Var3.b(cl0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                m mVar = m.f92840a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (su.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, su.a.class, new c83.h.a[0], null, null, null, 120);
                            case 24:
                                Scope scope10 = (Scope) obj2;
                                m mVar2 = m.f92840a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var4 = p005kotlin.jvm.internal.s0.f105811a;
                                return new yu.c((su.a) scope10.get((k23.d<?>) t0Var4.b(su.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zy0.b) scope10.get((k23.d<?>) t0Var4.b(zy0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                Scope scope11 = (Scope) obj2;
                                o oVar = o.f92864a;
                                scope11.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.q1(ModuleExtKt.androidContext(scope11), (f12.b) scope11.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                Scope scope12 = (Scope) obj2;
                                o oVar2 = o.f92864a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new pd0.a(ModuleExtKt.androidContext(scope12), (f12.l) scope12.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 27:
                                o oVar3 = o.f92864a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.h5(dv.m.a.a(dv.m.f61336b));
                            case 28:
                                Scope scope13 = (Scope) obj2;
                                o oVar4 = o.f92864a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                k12.d dVarA = k12.d.a.a(k12.d.f102315g);
                                m12.k kVar2 = new m12.k(null, 1, null);
                                p005kotlin.jvm.internal.t0 t0Var5 = p005kotlin.jvm.internal.s0.f105811a;
                                return new qd0.b(dVarA, kVar2, (f12.b) scope13.get((k23.d<?>) t0Var5.b(f12.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (f12.l) scope13.get((k23.d<?>) t0Var5.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                o oVar5 = o.f92864a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new nd0.e();
                        }
                    }
                }, kind2, j0Var2), module2));
                final int i47 = 8;
                new KoinDefinition(module2, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(ip.l.class), null, new p() { // from class: id0.a
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        ip.i iVar;
                        ip.i iVar2;
                        switch (i47) {
                            case 0:
                                Scope scope = (Scope) obj2;
                                b bVar7 = b.f92665a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new bs.b((Context) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(Context.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                b bVar8 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new so.c();
                            case 2:
                                b bVar9 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ro.a();
                            case 3:
                                b bVar10 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new qo.a();
                            case 4:
                                b bVar11 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ro1.o0();
                            case 5:
                                Scope scope2 = (Scope) obj2;
                                b bVar12 = b.f92665a;
                                scope2.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zp.b((am.b2) scope2.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(am.b2.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                c cVar2 = c.f92680a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (am.b2) ez0.b.a(ez0.b.f67468a, ez0.c.GC, am.b2.class, new c83.h.a[0], null, null, null, 120);
                            case 7:
                                Scope scope3 = (Scope) obj2;
                                c cVar3 = c.f92680a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ip.f((am.b2) scope3.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(am.b2.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 8:
                                Scope scope4 = (Scope) obj2;
                                c cVar4 = c.f92680a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ip.l((am.b2) scope4.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(am.b2.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                Scope scope5 = (Scope) obj2;
                                c cVar5 = c.f92680a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.b((ip.f) scope5.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                Scope scope6 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                c cVar6 = c.f92680a;
                                scope6.getClass();
                                parametersHolder.getClass();
                                Object obj4 = (hl.a) parametersHolder.get(1);
                                if (obj4 == null) {
                                    obj4 = hl.a.c.f84256b;
                                }
                                if (p005kotlin.jvm.internal.s.g(obj4, hl.a.c.f84256b)) {
                                    iVar = (ip.i) scope6.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                } else {
                                    if (!(obj4 instanceof hl.a.b)) {
                                        lc.u0.r();
                                        return null;
                                    }
                                    iVar = (ip.i) scope6.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                }
                                return new v12.p(iVar, (List) parametersHolder.get(0));
                            case 11:
                                Scope scope7 = (Scope) obj2;
                                ParametersHolder parametersHolder2 = (ParametersHolder) obj3;
                                c cVar7 = c.f92680a;
                                scope7.getClass();
                                parametersHolder2.getClass();
                                ip.a aVar5 = (ip.a) parametersHolder2.get(0);
                                hl.a aVar6 = (hl.a) parametersHolder2.get(1);
                                if (aVar6 == null) {
                                    aVar6 = hl.a.c.f84256b;
                                }
                                if (p005kotlin.jvm.internal.s.g(aVar6, hl.a.c.f84256b)) {
                                    iVar2 = (ip.i) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                } else {
                                    if (!(aVar6 instanceof hl.a.b)) {
                                        lc.u0.r();
                                        return null;
                                    }
                                    iVar2 = (ip.i) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                }
                                return aVar5 == null ? new v12.e(iVar2, aVar6, hl.b.a(aVar6)) : new v12.i(aVar5, aVar6, hl.b.a(aVar6));
                            case 12:
                                d dVar = d.f92697a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.f();
                            case 13:
                                e eVar = e.f92711a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.g();
                            case 14:
                                f fVar = f.f92723a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.h();
                            case 15:
                                Scope scope8 = (Scope) obj2;
                                g gVar = g.f92757a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.i(ModuleExtKt.androidContext(scope8));
                            case 16:
                                h hVar = h.f92773a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.j();
                            case 17:
                                i iVar3 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new AudioPromptsService.d();
                            case 18:
                                i iVar4 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new nu.g();
                            case 19:
                                i iVar5 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.k();
                            case 20:
                                i iVar6 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.k();
                            case 21:
                                j jVar = j.f92799a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ec0.g();
                            case 22:
                                Scope scope9 = (Scope) obj2;
                                k kVar = k.f92814a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var3 = p005kotlin.jvm.internal.s0.f105811a;
                                return new l((k12.a) scope9.get((k23.d<?>) t0Var3.b(k12.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (cl0.b) scope9.get((k23.d<?>) t0Var3.b(cl0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                m mVar = m.f92840a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (su.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, su.a.class, new c83.h.a[0], null, null, null, 120);
                            case 24:
                                Scope scope10 = (Scope) obj2;
                                m mVar2 = m.f92840a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var4 = p005kotlin.jvm.internal.s0.f105811a;
                                return new yu.c((su.a) scope10.get((k23.d<?>) t0Var4.b(su.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zy0.b) scope10.get((k23.d<?>) t0Var4.b(zy0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                Scope scope11 = (Scope) obj2;
                                o oVar = o.f92864a;
                                scope11.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.q1(ModuleExtKt.androidContext(scope11), (f12.b) scope11.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                Scope scope12 = (Scope) obj2;
                                o oVar2 = o.f92864a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new pd0.a(ModuleExtKt.androidContext(scope12), (f12.l) scope12.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 27:
                                o oVar3 = o.f92864a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.h5(dv.m.a.a(dv.m.f61336b));
                            case 28:
                                Scope scope13 = (Scope) obj2;
                                o oVar4 = o.f92864a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                k12.d dVarA = k12.d.a.a(k12.d.f102315g);
                                m12.k kVar2 = new m12.k(null, 1, null);
                                p005kotlin.jvm.internal.t0 t0Var5 = p005kotlin.jvm.internal.s0.f105811a;
                                return new qd0.b(dVarA, kVar2, (f12.b) scope13.get((k23.d<?>) t0Var5.b(f12.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (f12.l) scope13.get((k23.d<?>) t0Var5.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                o oVar5 = o.f92864a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new nd0.e();
                        }
                    }
                }, kind2, j0Var2), module2));
                final int i48 = 9;
                new KoinDefinition(module2, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.b.class), null, new p() { // from class: id0.a
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        ip.i iVar;
                        ip.i iVar2;
                        switch (i48) {
                            case 0:
                                Scope scope = (Scope) obj2;
                                b bVar7 = b.f92665a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new bs.b((Context) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(Context.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                b bVar8 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new so.c();
                            case 2:
                                b bVar9 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ro.a();
                            case 3:
                                b bVar10 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new qo.a();
                            case 4:
                                b bVar11 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ro1.o0();
                            case 5:
                                Scope scope2 = (Scope) obj2;
                                b bVar12 = b.f92665a;
                                scope2.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zp.b((am.b2) scope2.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(am.b2.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                c cVar2 = c.f92680a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (am.b2) ez0.b.a(ez0.b.f67468a, ez0.c.GC, am.b2.class, new c83.h.a[0], null, null, null, 120);
                            case 7:
                                Scope scope3 = (Scope) obj2;
                                c cVar3 = c.f92680a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ip.f((am.b2) scope3.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(am.b2.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 8:
                                Scope scope4 = (Scope) obj2;
                                c cVar4 = c.f92680a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ip.l((am.b2) scope4.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(am.b2.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                Scope scope5 = (Scope) obj2;
                                c cVar5 = c.f92680a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.b((ip.f) scope5.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                Scope scope6 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                c cVar6 = c.f92680a;
                                scope6.getClass();
                                parametersHolder.getClass();
                                Object obj4 = (hl.a) parametersHolder.get(1);
                                if (obj4 == null) {
                                    obj4 = hl.a.c.f84256b;
                                }
                                if (p005kotlin.jvm.internal.s.g(obj4, hl.a.c.f84256b)) {
                                    iVar = (ip.i) scope6.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                } else {
                                    if (!(obj4 instanceof hl.a.b)) {
                                        lc.u0.r();
                                        return null;
                                    }
                                    iVar = (ip.i) scope6.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                }
                                return new v12.p(iVar, (List) parametersHolder.get(0));
                            case 11:
                                Scope scope7 = (Scope) obj2;
                                ParametersHolder parametersHolder2 = (ParametersHolder) obj3;
                                c cVar7 = c.f92680a;
                                scope7.getClass();
                                parametersHolder2.getClass();
                                ip.a aVar5 = (ip.a) parametersHolder2.get(0);
                                hl.a aVar6 = (hl.a) parametersHolder2.get(1);
                                if (aVar6 == null) {
                                    aVar6 = hl.a.c.f84256b;
                                }
                                if (p005kotlin.jvm.internal.s.g(aVar6, hl.a.c.f84256b)) {
                                    iVar2 = (ip.i) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                } else {
                                    if (!(aVar6 instanceof hl.a.b)) {
                                        lc.u0.r();
                                        return null;
                                    }
                                    iVar2 = (ip.i) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                }
                                return aVar5 == null ? new v12.e(iVar2, aVar6, hl.b.a(aVar6)) : new v12.i(aVar5, aVar6, hl.b.a(aVar6));
                            case 12:
                                d dVar = d.f92697a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.f();
                            case 13:
                                e eVar = e.f92711a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.g();
                            case 14:
                                f fVar = f.f92723a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.h();
                            case 15:
                                Scope scope8 = (Scope) obj2;
                                g gVar = g.f92757a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.i(ModuleExtKt.androidContext(scope8));
                            case 16:
                                h hVar = h.f92773a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.j();
                            case 17:
                                i iVar3 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new AudioPromptsService.d();
                            case 18:
                                i iVar4 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new nu.g();
                            case 19:
                                i iVar5 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.k();
                            case 20:
                                i iVar6 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.k();
                            case 21:
                                j jVar = j.f92799a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ec0.g();
                            case 22:
                                Scope scope9 = (Scope) obj2;
                                k kVar = k.f92814a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var3 = p005kotlin.jvm.internal.s0.f105811a;
                                return new l((k12.a) scope9.get((k23.d<?>) t0Var3.b(k12.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (cl0.b) scope9.get((k23.d<?>) t0Var3.b(cl0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                m mVar = m.f92840a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (su.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, su.a.class, new c83.h.a[0], null, null, null, 120);
                            case 24:
                                Scope scope10 = (Scope) obj2;
                                m mVar2 = m.f92840a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var4 = p005kotlin.jvm.internal.s0.f105811a;
                                return new yu.c((su.a) scope10.get((k23.d<?>) t0Var4.b(su.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zy0.b) scope10.get((k23.d<?>) t0Var4.b(zy0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                Scope scope11 = (Scope) obj2;
                                o oVar = o.f92864a;
                                scope11.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.q1(ModuleExtKt.androidContext(scope11), (f12.b) scope11.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                Scope scope12 = (Scope) obj2;
                                o oVar2 = o.f92864a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new pd0.a(ModuleExtKt.androidContext(scope12), (f12.l) scope12.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 27:
                                o oVar3 = o.f92864a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.h5(dv.m.a.a(dv.m.f61336b));
                            case 28:
                                Scope scope13 = (Scope) obj2;
                                o oVar4 = o.f92864a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                k12.d dVarA = k12.d.a.a(k12.d.f102315g);
                                m12.k kVar2 = new m12.k(null, 1, null);
                                p005kotlin.jvm.internal.t0 t0Var5 = p005kotlin.jvm.internal.s0.f105811a;
                                return new qd0.b(dVarA, kVar2, (f12.b) scope13.get((k23.d<?>) t0Var5.b(f12.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (f12.l) scope13.get((k23.d<?>) t0Var5.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                o oVar5 = o.f92864a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new nd0.e();
                        }
                    }
                }, kind2, j0Var2), module2));
                final int i49 = 10;
                new KoinDefinition(module2, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(v12.p.class), null, new p() { // from class: id0.a
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        ip.i iVar;
                        ip.i iVar2;
                        switch (i49) {
                            case 0:
                                Scope scope = (Scope) obj2;
                                b bVar7 = b.f92665a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new bs.b((Context) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(Context.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                b bVar8 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new so.c();
                            case 2:
                                b bVar9 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ro.a();
                            case 3:
                                b bVar10 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new qo.a();
                            case 4:
                                b bVar11 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ro1.o0();
                            case 5:
                                Scope scope2 = (Scope) obj2;
                                b bVar12 = b.f92665a;
                                scope2.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zp.b((am.b2) scope2.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(am.b2.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                c cVar2 = c.f92680a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (am.b2) ez0.b.a(ez0.b.f67468a, ez0.c.GC, am.b2.class, new c83.h.a[0], null, null, null, 120);
                            case 7:
                                Scope scope3 = (Scope) obj2;
                                c cVar3 = c.f92680a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ip.f((am.b2) scope3.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(am.b2.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 8:
                                Scope scope4 = (Scope) obj2;
                                c cVar4 = c.f92680a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ip.l((am.b2) scope4.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(am.b2.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                Scope scope5 = (Scope) obj2;
                                c cVar5 = c.f92680a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.b((ip.f) scope5.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                Scope scope6 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                c cVar6 = c.f92680a;
                                scope6.getClass();
                                parametersHolder.getClass();
                                Object obj4 = (hl.a) parametersHolder.get(1);
                                if (obj4 == null) {
                                    obj4 = hl.a.c.f84256b;
                                }
                                if (p005kotlin.jvm.internal.s.g(obj4, hl.a.c.f84256b)) {
                                    iVar = (ip.i) scope6.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                } else {
                                    if (!(obj4 instanceof hl.a.b)) {
                                        lc.u0.r();
                                        return null;
                                    }
                                    iVar = (ip.i) scope6.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                }
                                return new v12.p(iVar, (List) parametersHolder.get(0));
                            case 11:
                                Scope scope7 = (Scope) obj2;
                                ParametersHolder parametersHolder2 = (ParametersHolder) obj3;
                                c cVar7 = c.f92680a;
                                scope7.getClass();
                                parametersHolder2.getClass();
                                ip.a aVar5 = (ip.a) parametersHolder2.get(0);
                                hl.a aVar6 = (hl.a) parametersHolder2.get(1);
                                if (aVar6 == null) {
                                    aVar6 = hl.a.c.f84256b;
                                }
                                if (p005kotlin.jvm.internal.s.g(aVar6, hl.a.c.f84256b)) {
                                    iVar2 = (ip.i) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                } else {
                                    if (!(aVar6 instanceof hl.a.b)) {
                                        lc.u0.r();
                                        return null;
                                    }
                                    iVar2 = (ip.i) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                }
                                return aVar5 == null ? new v12.e(iVar2, aVar6, hl.b.a(aVar6)) : new v12.i(aVar5, aVar6, hl.b.a(aVar6));
                            case 12:
                                d dVar = d.f92697a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.f();
                            case 13:
                                e eVar = e.f92711a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.g();
                            case 14:
                                f fVar = f.f92723a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.h();
                            case 15:
                                Scope scope8 = (Scope) obj2;
                                g gVar = g.f92757a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.i(ModuleExtKt.androidContext(scope8));
                            case 16:
                                h hVar = h.f92773a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.j();
                            case 17:
                                i iVar3 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new AudioPromptsService.d();
                            case 18:
                                i iVar4 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new nu.g();
                            case 19:
                                i iVar5 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.k();
                            case 20:
                                i iVar6 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.k();
                            case 21:
                                j jVar = j.f92799a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ec0.g();
                            case 22:
                                Scope scope9 = (Scope) obj2;
                                k kVar = k.f92814a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var3 = p005kotlin.jvm.internal.s0.f105811a;
                                return new l((k12.a) scope9.get((k23.d<?>) t0Var3.b(k12.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (cl0.b) scope9.get((k23.d<?>) t0Var3.b(cl0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                m mVar = m.f92840a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (su.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, su.a.class, new c83.h.a[0], null, null, null, 120);
                            case 24:
                                Scope scope10 = (Scope) obj2;
                                m mVar2 = m.f92840a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var4 = p005kotlin.jvm.internal.s0.f105811a;
                                return new yu.c((su.a) scope10.get((k23.d<?>) t0Var4.b(su.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zy0.b) scope10.get((k23.d<?>) t0Var4.b(zy0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                Scope scope11 = (Scope) obj2;
                                o oVar = o.f92864a;
                                scope11.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.q1(ModuleExtKt.androidContext(scope11), (f12.b) scope11.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                Scope scope12 = (Scope) obj2;
                                o oVar2 = o.f92864a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new pd0.a(ModuleExtKt.androidContext(scope12), (f12.l) scope12.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 27:
                                o oVar3 = o.f92864a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.h5(dv.m.a.a(dv.m.f61336b));
                            case 28:
                                Scope scope13 = (Scope) obj2;
                                o oVar4 = o.f92864a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                k12.d dVarA = k12.d.a.a(k12.d.f102315g);
                                m12.k kVar2 = new m12.k(null, 1, null);
                                p005kotlin.jvm.internal.t0 t0Var5 = p005kotlin.jvm.internal.s0.f105811a;
                                return new qd0.b(dVarA, kVar2, (f12.b) scope13.get((k23.d<?>) t0Var5.b(f12.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (f12.l) scope13.get((k23.d<?>) t0Var5.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                o oVar5 = o.f92864a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new nd0.e();
                        }
                    }
                }, kind2, j0Var2), module2));
                final int i54 = 11;
                new KoinDefinition(module2, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(v12.c.class), null, new p() { // from class: id0.a
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        ip.i iVar;
                        ip.i iVar2;
                        switch (i54) {
                            case 0:
                                Scope scope = (Scope) obj2;
                                b bVar7 = b.f92665a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new bs.b((Context) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(Context.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                b bVar8 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new so.c();
                            case 2:
                                b bVar9 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ro.a();
                            case 3:
                                b bVar10 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new qo.a();
                            case 4:
                                b bVar11 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ro1.o0();
                            case 5:
                                Scope scope2 = (Scope) obj2;
                                b bVar12 = b.f92665a;
                                scope2.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zp.b((am.b2) scope2.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(am.b2.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                c cVar2 = c.f92680a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (am.b2) ez0.b.a(ez0.b.f67468a, ez0.c.GC, am.b2.class, new c83.h.a[0], null, null, null, 120);
                            case 7:
                                Scope scope3 = (Scope) obj2;
                                c cVar3 = c.f92680a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ip.f((am.b2) scope3.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(am.b2.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 8:
                                Scope scope4 = (Scope) obj2;
                                c cVar4 = c.f92680a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ip.l((am.b2) scope4.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(am.b2.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                Scope scope5 = (Scope) obj2;
                                c cVar5 = c.f92680a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.b((ip.f) scope5.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                Scope scope6 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                c cVar6 = c.f92680a;
                                scope6.getClass();
                                parametersHolder.getClass();
                                Object obj4 = (hl.a) parametersHolder.get(1);
                                if (obj4 == null) {
                                    obj4 = hl.a.c.f84256b;
                                }
                                if (p005kotlin.jvm.internal.s.g(obj4, hl.a.c.f84256b)) {
                                    iVar = (ip.i) scope6.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                } else {
                                    if (!(obj4 instanceof hl.a.b)) {
                                        lc.u0.r();
                                        return null;
                                    }
                                    iVar = (ip.i) scope6.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                }
                                return new v12.p(iVar, (List) parametersHolder.get(0));
                            case 11:
                                Scope scope7 = (Scope) obj2;
                                ParametersHolder parametersHolder2 = (ParametersHolder) obj3;
                                c cVar7 = c.f92680a;
                                scope7.getClass();
                                parametersHolder2.getClass();
                                ip.a aVar5 = (ip.a) parametersHolder2.get(0);
                                hl.a aVar6 = (hl.a) parametersHolder2.get(1);
                                if (aVar6 == null) {
                                    aVar6 = hl.a.c.f84256b;
                                }
                                if (p005kotlin.jvm.internal.s.g(aVar6, hl.a.c.f84256b)) {
                                    iVar2 = (ip.i) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                } else {
                                    if (!(aVar6 instanceof hl.a.b)) {
                                        lc.u0.r();
                                        return null;
                                    }
                                    iVar2 = (ip.i) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                }
                                return aVar5 == null ? new v12.e(iVar2, aVar6, hl.b.a(aVar6)) : new v12.i(aVar5, aVar6, hl.b.a(aVar6));
                            case 12:
                                d dVar = d.f92697a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.f();
                            case 13:
                                e eVar = e.f92711a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.g();
                            case 14:
                                f fVar = f.f92723a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.h();
                            case 15:
                                Scope scope8 = (Scope) obj2;
                                g gVar = g.f92757a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.i(ModuleExtKt.androidContext(scope8));
                            case 16:
                                h hVar = h.f92773a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.j();
                            case 17:
                                i iVar3 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new AudioPromptsService.d();
                            case 18:
                                i iVar4 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new nu.g();
                            case 19:
                                i iVar5 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.k();
                            case 20:
                                i iVar6 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.k();
                            case 21:
                                j jVar = j.f92799a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ec0.g();
                            case 22:
                                Scope scope9 = (Scope) obj2;
                                k kVar = k.f92814a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var3 = p005kotlin.jvm.internal.s0.f105811a;
                                return new l((k12.a) scope9.get((k23.d<?>) t0Var3.b(k12.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (cl0.b) scope9.get((k23.d<?>) t0Var3.b(cl0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                m mVar = m.f92840a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (su.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, su.a.class, new c83.h.a[0], null, null, null, 120);
                            case 24:
                                Scope scope10 = (Scope) obj2;
                                m mVar2 = m.f92840a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var4 = p005kotlin.jvm.internal.s0.f105811a;
                                return new yu.c((su.a) scope10.get((k23.d<?>) t0Var4.b(su.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zy0.b) scope10.get((k23.d<?>) t0Var4.b(zy0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                Scope scope11 = (Scope) obj2;
                                o oVar = o.f92864a;
                                scope11.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.q1(ModuleExtKt.androidContext(scope11), (f12.b) scope11.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                Scope scope12 = (Scope) obj2;
                                o oVar2 = o.f92864a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new pd0.a(ModuleExtKt.androidContext(scope12), (f12.l) scope12.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 27:
                                o oVar3 = o.f92864a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.h5(dv.m.a.a(dv.m.f61336b));
                            case 28:
                                Scope scope13 = (Scope) obj2;
                                o oVar4 = o.f92864a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                k12.d dVarA = k12.d.a.a(k12.d.f102315g);
                                m12.k kVar2 = new m12.k(null, 1, null);
                                p005kotlin.jvm.internal.t0 t0Var5 = p005kotlin.jvm.internal.s0.f105811a;
                                return new qd0.b(dVarA, kVar2, (f12.b) scope13.get((k23.d<?>) t0Var5.b(f12.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (f12.l) scope13.get((k23.d<?>) t0Var5.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                o oVar5 = o.f92864a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new nd0.e();
                        }
                    }
                }, kind2, j0Var2), module2));
                break;
            case 6:
                Module module3 = (Module) obj;
                id0.d dVar = id0.d.f92697a;
                module3.getClass();
                final int i55 = 12;
                p pVar2 = new p() { // from class: id0.a
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        ip.i iVar;
                        ip.i iVar2;
                        switch (i55) {
                            case 0:
                                Scope scope = (Scope) obj2;
                                b bVar7 = b.f92665a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new bs.b((Context) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(Context.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                b bVar8 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new so.c();
                            case 2:
                                b bVar9 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ro.a();
                            case 3:
                                b bVar10 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new qo.a();
                            case 4:
                                b bVar11 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ro1.o0();
                            case 5:
                                Scope scope2 = (Scope) obj2;
                                b bVar12 = b.f92665a;
                                scope2.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zp.b((am.b2) scope2.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(am.b2.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                c cVar2 = c.f92680a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (am.b2) ez0.b.a(ez0.b.f67468a, ez0.c.GC, am.b2.class, new c83.h.a[0], null, null, null, 120);
                            case 7:
                                Scope scope3 = (Scope) obj2;
                                c cVar3 = c.f92680a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ip.f((am.b2) scope3.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(am.b2.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 8:
                                Scope scope4 = (Scope) obj2;
                                c cVar4 = c.f92680a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ip.l((am.b2) scope4.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(am.b2.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                Scope scope5 = (Scope) obj2;
                                c cVar5 = c.f92680a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.b((ip.f) scope5.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                Scope scope6 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                c cVar6 = c.f92680a;
                                scope6.getClass();
                                parametersHolder.getClass();
                                Object obj4 = (hl.a) parametersHolder.get(1);
                                if (obj4 == null) {
                                    obj4 = hl.a.c.f84256b;
                                }
                                if (p005kotlin.jvm.internal.s.g(obj4, hl.a.c.f84256b)) {
                                    iVar = (ip.i) scope6.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                } else {
                                    if (!(obj4 instanceof hl.a.b)) {
                                        lc.u0.r();
                                        return null;
                                    }
                                    iVar = (ip.i) scope6.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                }
                                return new v12.p(iVar, (List) parametersHolder.get(0));
                            case 11:
                                Scope scope7 = (Scope) obj2;
                                ParametersHolder parametersHolder2 = (ParametersHolder) obj3;
                                c cVar7 = c.f92680a;
                                scope7.getClass();
                                parametersHolder2.getClass();
                                ip.a aVar5 = (ip.a) parametersHolder2.get(0);
                                hl.a aVar6 = (hl.a) parametersHolder2.get(1);
                                if (aVar6 == null) {
                                    aVar6 = hl.a.c.f84256b;
                                }
                                if (p005kotlin.jvm.internal.s.g(aVar6, hl.a.c.f84256b)) {
                                    iVar2 = (ip.i) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                } else {
                                    if (!(aVar6 instanceof hl.a.b)) {
                                        lc.u0.r();
                                        return null;
                                    }
                                    iVar2 = (ip.i) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                }
                                return aVar5 == null ? new v12.e(iVar2, aVar6, hl.b.a(aVar6)) : new v12.i(aVar5, aVar6, hl.b.a(aVar6));
                            case 12:
                                d dVar2 = d.f92697a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.f();
                            case 13:
                                e eVar = e.f92711a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.g();
                            case 14:
                                f fVar = f.f92723a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.h();
                            case 15:
                                Scope scope8 = (Scope) obj2;
                                g gVar = g.f92757a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.i(ModuleExtKt.androidContext(scope8));
                            case 16:
                                h hVar = h.f92773a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.j();
                            case 17:
                                i iVar3 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new AudioPromptsService.d();
                            case 18:
                                i iVar4 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new nu.g();
                            case 19:
                                i iVar5 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.k();
                            case 20:
                                i iVar6 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.k();
                            case 21:
                                j jVar = j.f92799a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ec0.g();
                            case 22:
                                Scope scope9 = (Scope) obj2;
                                k kVar = k.f92814a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var3 = p005kotlin.jvm.internal.s0.f105811a;
                                return new l((k12.a) scope9.get((k23.d<?>) t0Var3.b(k12.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (cl0.b) scope9.get((k23.d<?>) t0Var3.b(cl0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                m mVar = m.f92840a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (su.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, su.a.class, new c83.h.a[0], null, null, null, 120);
                            case 24:
                                Scope scope10 = (Scope) obj2;
                                m mVar2 = m.f92840a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var4 = p005kotlin.jvm.internal.s0.f105811a;
                                return new yu.c((su.a) scope10.get((k23.d<?>) t0Var4.b(su.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zy0.b) scope10.get((k23.d<?>) t0Var4.b(zy0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                Scope scope11 = (Scope) obj2;
                                o oVar = o.f92864a;
                                scope11.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.q1(ModuleExtKt.androidContext(scope11), (f12.b) scope11.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                Scope scope12 = (Scope) obj2;
                                o oVar2 = o.f92864a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new pd0.a(ModuleExtKt.androidContext(scope12), (f12.l) scope12.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 27:
                                o oVar3 = o.f92864a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.h5(dv.m.a.a(dv.m.f61336b));
                            case 28:
                                Scope scope13 = (Scope) obj2;
                                o oVar4 = o.f92864a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                k12.d dVarA = k12.d.a.a(k12.d.f102315g);
                                m12.k kVar2 = new m12.k(null, 1, null);
                                p005kotlin.jvm.internal.t0 t0Var5 = p005kotlin.jvm.internal.s0.f105811a;
                                return new qd0.b(dVarA, kVar2, (f12.b) scope13.get((k23.d<?>) t0Var5.b(f12.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (f12.l) scope13.get((k23.d<?>) t0Var5.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                o oVar5 = o.f92864a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new nd0.e();
                        }
                    }
                };
                new KoinDefinition(module3, e5.n(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), s0.f105811a.b(ws.a.class), null, pVar2, Kind.Factory, j0.f134944a), module3));
                ws.b.f186897a.getClass();
                module3.includes(ws.b.f186898b);
                el1.b.f64537a.getClass();
                module3.includes(el1.b.f64538b);
                break;
            case 7:
                Module module4 = (Module) obj;
                id0.e eVar = id0.e.f92711a;
                module4.getClass();
                p pVar3 = new p() { // from class: id0.a
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        ip.i iVar;
                        ip.i iVar2;
                        switch (i18) {
                            case 0:
                                Scope scope = (Scope) obj2;
                                b bVar7 = b.f92665a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new bs.b((Context) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(Context.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                b bVar8 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new so.c();
                            case 2:
                                b bVar9 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ro.a();
                            case 3:
                                b bVar10 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new qo.a();
                            case 4:
                                b bVar11 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ro1.o0();
                            case 5:
                                Scope scope2 = (Scope) obj2;
                                b bVar12 = b.f92665a;
                                scope2.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zp.b((am.b2) scope2.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(am.b2.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                c cVar2 = c.f92680a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (am.b2) ez0.b.a(ez0.b.f67468a, ez0.c.GC, am.b2.class, new c83.h.a[0], null, null, null, 120);
                            case 7:
                                Scope scope3 = (Scope) obj2;
                                c cVar3 = c.f92680a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ip.f((am.b2) scope3.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(am.b2.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 8:
                                Scope scope4 = (Scope) obj2;
                                c cVar4 = c.f92680a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ip.l((am.b2) scope4.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(am.b2.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                Scope scope5 = (Scope) obj2;
                                c cVar5 = c.f92680a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.b((ip.f) scope5.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                Scope scope6 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                c cVar6 = c.f92680a;
                                scope6.getClass();
                                parametersHolder.getClass();
                                Object obj4 = (hl.a) parametersHolder.get(1);
                                if (obj4 == null) {
                                    obj4 = hl.a.c.f84256b;
                                }
                                if (p005kotlin.jvm.internal.s.g(obj4, hl.a.c.f84256b)) {
                                    iVar = (ip.i) scope6.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                } else {
                                    if (!(obj4 instanceof hl.a.b)) {
                                        lc.u0.r();
                                        return null;
                                    }
                                    iVar = (ip.i) scope6.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                }
                                return new v12.p(iVar, (List) parametersHolder.get(0));
                            case 11:
                                Scope scope7 = (Scope) obj2;
                                ParametersHolder parametersHolder2 = (ParametersHolder) obj3;
                                c cVar7 = c.f92680a;
                                scope7.getClass();
                                parametersHolder2.getClass();
                                ip.a aVar5 = (ip.a) parametersHolder2.get(0);
                                hl.a aVar6 = (hl.a) parametersHolder2.get(1);
                                if (aVar6 == null) {
                                    aVar6 = hl.a.c.f84256b;
                                }
                                if (p005kotlin.jvm.internal.s.g(aVar6, hl.a.c.f84256b)) {
                                    iVar2 = (ip.i) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                } else {
                                    if (!(aVar6 instanceof hl.a.b)) {
                                        lc.u0.r();
                                        return null;
                                    }
                                    iVar2 = (ip.i) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                }
                                return aVar5 == null ? new v12.e(iVar2, aVar6, hl.b.a(aVar6)) : new v12.i(aVar5, aVar6, hl.b.a(aVar6));
                            case 12:
                                d dVar2 = d.f92697a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.f();
                            case 13:
                                e eVar2 = e.f92711a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.g();
                            case 14:
                                f fVar = f.f92723a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.h();
                            case 15:
                                Scope scope8 = (Scope) obj2;
                                g gVar = g.f92757a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.i(ModuleExtKt.androidContext(scope8));
                            case 16:
                                h hVar = h.f92773a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.j();
                            case 17:
                                i iVar3 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new AudioPromptsService.d();
                            case 18:
                                i iVar4 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new nu.g();
                            case 19:
                                i iVar5 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.k();
                            case 20:
                                i iVar6 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.k();
                            case 21:
                                j jVar = j.f92799a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ec0.g();
                            case 22:
                                Scope scope9 = (Scope) obj2;
                                k kVar = k.f92814a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var3 = p005kotlin.jvm.internal.s0.f105811a;
                                return new l((k12.a) scope9.get((k23.d<?>) t0Var3.b(k12.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (cl0.b) scope9.get((k23.d<?>) t0Var3.b(cl0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                m mVar = m.f92840a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (su.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, su.a.class, new c83.h.a[0], null, null, null, 120);
                            case 24:
                                Scope scope10 = (Scope) obj2;
                                m mVar2 = m.f92840a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var4 = p005kotlin.jvm.internal.s0.f105811a;
                                return new yu.c((su.a) scope10.get((k23.d<?>) t0Var4.b(su.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zy0.b) scope10.get((k23.d<?>) t0Var4.b(zy0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                Scope scope11 = (Scope) obj2;
                                o oVar = o.f92864a;
                                scope11.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.q1(ModuleExtKt.androidContext(scope11), (f12.b) scope11.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                Scope scope12 = (Scope) obj2;
                                o oVar2 = o.f92864a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new pd0.a(ModuleExtKt.androidContext(scope12), (f12.l) scope12.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 27:
                                o oVar3 = o.f92864a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.h5(dv.m.a.a(dv.m.f61336b));
                            case 28:
                                Scope scope13 = (Scope) obj2;
                                o oVar4 = o.f92864a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                k12.d dVarA = k12.d.a.a(k12.d.f102315g);
                                m12.k kVar2 = new m12.k(null, 1, null);
                                p005kotlin.jvm.internal.t0 t0Var5 = p005kotlin.jvm.internal.s0.f105811a;
                                return new qd0.b(dVarA, kVar2, (f12.b) scope13.get((k23.d<?>) t0Var5.b(f12.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (f12.l) scope13.get((k23.d<?>) t0Var5.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                o oVar5 = o.f92864a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new nd0.e();
                        }
                    }
                };
                new KoinDefinition(module4, e5.n(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), s0.f105811a.b(mt.a.class), null, pVar3, Kind.Factory, j0.f134944a), module4));
                break;
            case 8:
                Module module5 = (Module) obj;
                id0.f fVar = id0.f.f92723a;
                module5.getClass();
                p pVar4 = new p() { // from class: id0.a
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        ip.i iVar;
                        ip.i iVar2;
                        switch (i17) {
                            case 0:
                                Scope scope = (Scope) obj2;
                                b bVar7 = b.f92665a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new bs.b((Context) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(Context.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                b bVar8 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new so.c();
                            case 2:
                                b bVar9 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ro.a();
                            case 3:
                                b bVar10 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new qo.a();
                            case 4:
                                b bVar11 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ro1.o0();
                            case 5:
                                Scope scope2 = (Scope) obj2;
                                b bVar12 = b.f92665a;
                                scope2.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zp.b((am.b2) scope2.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(am.b2.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                c cVar2 = c.f92680a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (am.b2) ez0.b.a(ez0.b.f67468a, ez0.c.GC, am.b2.class, new c83.h.a[0], null, null, null, 120);
                            case 7:
                                Scope scope3 = (Scope) obj2;
                                c cVar3 = c.f92680a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ip.f((am.b2) scope3.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(am.b2.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 8:
                                Scope scope4 = (Scope) obj2;
                                c cVar4 = c.f92680a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ip.l((am.b2) scope4.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(am.b2.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                Scope scope5 = (Scope) obj2;
                                c cVar5 = c.f92680a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.b((ip.f) scope5.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                Scope scope6 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                c cVar6 = c.f92680a;
                                scope6.getClass();
                                parametersHolder.getClass();
                                Object obj4 = (hl.a) parametersHolder.get(1);
                                if (obj4 == null) {
                                    obj4 = hl.a.c.f84256b;
                                }
                                if (p005kotlin.jvm.internal.s.g(obj4, hl.a.c.f84256b)) {
                                    iVar = (ip.i) scope6.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                } else {
                                    if (!(obj4 instanceof hl.a.b)) {
                                        lc.u0.r();
                                        return null;
                                    }
                                    iVar = (ip.i) scope6.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                }
                                return new v12.p(iVar, (List) parametersHolder.get(0));
                            case 11:
                                Scope scope7 = (Scope) obj2;
                                ParametersHolder parametersHolder2 = (ParametersHolder) obj3;
                                c cVar7 = c.f92680a;
                                scope7.getClass();
                                parametersHolder2.getClass();
                                ip.a aVar5 = (ip.a) parametersHolder2.get(0);
                                hl.a aVar6 = (hl.a) parametersHolder2.get(1);
                                if (aVar6 == null) {
                                    aVar6 = hl.a.c.f84256b;
                                }
                                if (p005kotlin.jvm.internal.s.g(aVar6, hl.a.c.f84256b)) {
                                    iVar2 = (ip.i) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                } else {
                                    if (!(aVar6 instanceof hl.a.b)) {
                                        lc.u0.r();
                                        return null;
                                    }
                                    iVar2 = (ip.i) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                }
                                return aVar5 == null ? new v12.e(iVar2, aVar6, hl.b.a(aVar6)) : new v12.i(aVar5, aVar6, hl.b.a(aVar6));
                            case 12:
                                d dVar2 = d.f92697a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.f();
                            case 13:
                                e eVar2 = e.f92711a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.g();
                            case 14:
                                f fVar2 = f.f92723a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.h();
                            case 15:
                                Scope scope8 = (Scope) obj2;
                                g gVar = g.f92757a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.i(ModuleExtKt.androidContext(scope8));
                            case 16:
                                h hVar = h.f92773a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.j();
                            case 17:
                                i iVar3 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new AudioPromptsService.d();
                            case 18:
                                i iVar4 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new nu.g();
                            case 19:
                                i iVar5 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.k();
                            case 20:
                                i iVar6 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.k();
                            case 21:
                                j jVar = j.f92799a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ec0.g();
                            case 22:
                                Scope scope9 = (Scope) obj2;
                                k kVar = k.f92814a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var3 = p005kotlin.jvm.internal.s0.f105811a;
                                return new l((k12.a) scope9.get((k23.d<?>) t0Var3.b(k12.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (cl0.b) scope9.get((k23.d<?>) t0Var3.b(cl0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                m mVar = m.f92840a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (su.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, su.a.class, new c83.h.a[0], null, null, null, 120);
                            case 24:
                                Scope scope10 = (Scope) obj2;
                                m mVar2 = m.f92840a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var4 = p005kotlin.jvm.internal.s0.f105811a;
                                return new yu.c((su.a) scope10.get((k23.d<?>) t0Var4.b(su.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zy0.b) scope10.get((k23.d<?>) t0Var4.b(zy0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                Scope scope11 = (Scope) obj2;
                                o oVar = o.f92864a;
                                scope11.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.q1(ModuleExtKt.androidContext(scope11), (f12.b) scope11.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                Scope scope12 = (Scope) obj2;
                                o oVar2 = o.f92864a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new pd0.a(ModuleExtKt.androidContext(scope12), (f12.l) scope12.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 27:
                                o oVar3 = o.f92864a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.h5(dv.m.a.a(dv.m.f61336b));
                            case 28:
                                Scope scope13 = (Scope) obj2;
                                o oVar4 = o.f92864a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                k12.d dVarA = k12.d.a.a(k12.d.f102315g);
                                m12.k kVar2 = new m12.k(null, 1, null);
                                p005kotlin.jvm.internal.t0 t0Var5 = p005kotlin.jvm.internal.s0.f105811a;
                                return new qd0.b(dVarA, kVar2, (f12.b) scope13.get((k23.d<?>) t0Var5.b(f12.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (f12.l) scope13.get((k23.d<?>) t0Var5.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                o oVar5 = o.f92864a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new nd0.e();
                        }
                    }
                };
                new KoinDefinition(module5, e5.n(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), s0.f105811a.b(c22.k.class), null, pVar4, Kind.Factory, j0.f134944a), module5));
                break;
            case 9:
                Module module6 = (Module) obj;
                id0.g gVar = id0.g.f92757a;
                module6.getClass();
                p pVar5 = new p() { // from class: id0.a
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        ip.i iVar;
                        ip.i iVar2;
                        switch (i16) {
                            case 0:
                                Scope scope = (Scope) obj2;
                                b bVar7 = b.f92665a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new bs.b((Context) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(Context.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                b bVar8 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new so.c();
                            case 2:
                                b bVar9 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ro.a();
                            case 3:
                                b bVar10 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new qo.a();
                            case 4:
                                b bVar11 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ro1.o0();
                            case 5:
                                Scope scope2 = (Scope) obj2;
                                b bVar12 = b.f92665a;
                                scope2.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zp.b((am.b2) scope2.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(am.b2.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                c cVar2 = c.f92680a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (am.b2) ez0.b.a(ez0.b.f67468a, ez0.c.GC, am.b2.class, new c83.h.a[0], null, null, null, 120);
                            case 7:
                                Scope scope3 = (Scope) obj2;
                                c cVar3 = c.f92680a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ip.f((am.b2) scope3.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(am.b2.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 8:
                                Scope scope4 = (Scope) obj2;
                                c cVar4 = c.f92680a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ip.l((am.b2) scope4.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(am.b2.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                Scope scope5 = (Scope) obj2;
                                c cVar5 = c.f92680a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.b((ip.f) scope5.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                Scope scope6 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                c cVar6 = c.f92680a;
                                scope6.getClass();
                                parametersHolder.getClass();
                                Object obj4 = (hl.a) parametersHolder.get(1);
                                if (obj4 == null) {
                                    obj4 = hl.a.c.f84256b;
                                }
                                if (p005kotlin.jvm.internal.s.g(obj4, hl.a.c.f84256b)) {
                                    iVar = (ip.i) scope6.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                } else {
                                    if (!(obj4 instanceof hl.a.b)) {
                                        lc.u0.r();
                                        return null;
                                    }
                                    iVar = (ip.i) scope6.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                }
                                return new v12.p(iVar, (List) parametersHolder.get(0));
                            case 11:
                                Scope scope7 = (Scope) obj2;
                                ParametersHolder parametersHolder2 = (ParametersHolder) obj3;
                                c cVar7 = c.f92680a;
                                scope7.getClass();
                                parametersHolder2.getClass();
                                ip.a aVar5 = (ip.a) parametersHolder2.get(0);
                                hl.a aVar6 = (hl.a) parametersHolder2.get(1);
                                if (aVar6 == null) {
                                    aVar6 = hl.a.c.f84256b;
                                }
                                if (p005kotlin.jvm.internal.s.g(aVar6, hl.a.c.f84256b)) {
                                    iVar2 = (ip.i) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                } else {
                                    if (!(aVar6 instanceof hl.a.b)) {
                                        lc.u0.r();
                                        return null;
                                    }
                                    iVar2 = (ip.i) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                }
                                return aVar5 == null ? new v12.e(iVar2, aVar6, hl.b.a(aVar6)) : new v12.i(aVar5, aVar6, hl.b.a(aVar6));
                            case 12:
                                d dVar2 = d.f92697a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.f();
                            case 13:
                                e eVar2 = e.f92711a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.g();
                            case 14:
                                f fVar2 = f.f92723a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.h();
                            case 15:
                                Scope scope8 = (Scope) obj2;
                                g gVar2 = g.f92757a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.i(ModuleExtKt.androidContext(scope8));
                            case 16:
                                h hVar = h.f92773a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.j();
                            case 17:
                                i iVar3 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new AudioPromptsService.d();
                            case 18:
                                i iVar4 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new nu.g();
                            case 19:
                                i iVar5 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.k();
                            case 20:
                                i iVar6 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.k();
                            case 21:
                                j jVar = j.f92799a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ec0.g();
                            case 22:
                                Scope scope9 = (Scope) obj2;
                                k kVar = k.f92814a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var3 = p005kotlin.jvm.internal.s0.f105811a;
                                return new l((k12.a) scope9.get((k23.d<?>) t0Var3.b(k12.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (cl0.b) scope9.get((k23.d<?>) t0Var3.b(cl0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                m mVar = m.f92840a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (su.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, su.a.class, new c83.h.a[0], null, null, null, 120);
                            case 24:
                                Scope scope10 = (Scope) obj2;
                                m mVar2 = m.f92840a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var4 = p005kotlin.jvm.internal.s0.f105811a;
                                return new yu.c((su.a) scope10.get((k23.d<?>) t0Var4.b(su.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zy0.b) scope10.get((k23.d<?>) t0Var4.b(zy0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                Scope scope11 = (Scope) obj2;
                                o oVar = o.f92864a;
                                scope11.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.q1(ModuleExtKt.androidContext(scope11), (f12.b) scope11.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                Scope scope12 = (Scope) obj2;
                                o oVar2 = o.f92864a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new pd0.a(ModuleExtKt.androidContext(scope12), (f12.l) scope12.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 27:
                                o oVar3 = o.f92864a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.h5(dv.m.a.a(dv.m.f61336b));
                            case 28:
                                Scope scope13 = (Scope) obj2;
                                o oVar4 = o.f92864a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                k12.d dVarA = k12.d.a.a(k12.d.f102315g);
                                m12.k kVar2 = new m12.k(null, 1, null);
                                p005kotlin.jvm.internal.t0 t0Var5 = p005kotlin.jvm.internal.s0.f105811a;
                                return new qd0.b(dVarA, kVar2, (f12.b) scope13.get((k23.d<?>) t0Var5.b(f12.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (f12.l) scope13.get((k23.d<?>) t0Var5.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                o oVar5 = o.f92864a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new nd0.e();
                        }
                    }
                };
                new KoinDefinition(module6, e5.n(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), s0.f105811a.b(o.class), null, pVar5, Kind.Factory, j0.f134944a), module6));
                break;
            case 10:
                Module module7 = (Module) obj;
                id0.h hVar = id0.h.f92773a;
                module7.getClass();
                p pVar6 = new p() { // from class: id0.a
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        ip.i iVar;
                        ip.i iVar2;
                        switch (i15) {
                            case 0:
                                Scope scope = (Scope) obj2;
                                b bVar7 = b.f92665a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new bs.b((Context) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(Context.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                b bVar8 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new so.c();
                            case 2:
                                b bVar9 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ro.a();
                            case 3:
                                b bVar10 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new qo.a();
                            case 4:
                                b bVar11 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ro1.o0();
                            case 5:
                                Scope scope2 = (Scope) obj2;
                                b bVar12 = b.f92665a;
                                scope2.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zp.b((am.b2) scope2.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(am.b2.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                c cVar2 = c.f92680a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (am.b2) ez0.b.a(ez0.b.f67468a, ez0.c.GC, am.b2.class, new c83.h.a[0], null, null, null, 120);
                            case 7:
                                Scope scope3 = (Scope) obj2;
                                c cVar3 = c.f92680a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ip.f((am.b2) scope3.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(am.b2.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 8:
                                Scope scope4 = (Scope) obj2;
                                c cVar4 = c.f92680a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ip.l((am.b2) scope4.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(am.b2.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                Scope scope5 = (Scope) obj2;
                                c cVar5 = c.f92680a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.b((ip.f) scope5.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                Scope scope6 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                c cVar6 = c.f92680a;
                                scope6.getClass();
                                parametersHolder.getClass();
                                Object obj4 = (hl.a) parametersHolder.get(1);
                                if (obj4 == null) {
                                    obj4 = hl.a.c.f84256b;
                                }
                                if (p005kotlin.jvm.internal.s.g(obj4, hl.a.c.f84256b)) {
                                    iVar = (ip.i) scope6.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                } else {
                                    if (!(obj4 instanceof hl.a.b)) {
                                        lc.u0.r();
                                        return null;
                                    }
                                    iVar = (ip.i) scope6.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                }
                                return new v12.p(iVar, (List) parametersHolder.get(0));
                            case 11:
                                Scope scope7 = (Scope) obj2;
                                ParametersHolder parametersHolder2 = (ParametersHolder) obj3;
                                c cVar7 = c.f92680a;
                                scope7.getClass();
                                parametersHolder2.getClass();
                                ip.a aVar5 = (ip.a) parametersHolder2.get(0);
                                hl.a aVar6 = (hl.a) parametersHolder2.get(1);
                                if (aVar6 == null) {
                                    aVar6 = hl.a.c.f84256b;
                                }
                                if (p005kotlin.jvm.internal.s.g(aVar6, hl.a.c.f84256b)) {
                                    iVar2 = (ip.i) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                } else {
                                    if (!(aVar6 instanceof hl.a.b)) {
                                        lc.u0.r();
                                        return null;
                                    }
                                    iVar2 = (ip.i) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                }
                                return aVar5 == null ? new v12.e(iVar2, aVar6, hl.b.a(aVar6)) : new v12.i(aVar5, aVar6, hl.b.a(aVar6));
                            case 12:
                                d dVar2 = d.f92697a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.f();
                            case 13:
                                e eVar2 = e.f92711a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.g();
                            case 14:
                                f fVar2 = f.f92723a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.h();
                            case 15:
                                Scope scope8 = (Scope) obj2;
                                g gVar2 = g.f92757a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.i(ModuleExtKt.androidContext(scope8));
                            case 16:
                                h hVar2 = h.f92773a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.j();
                            case 17:
                                i iVar3 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new AudioPromptsService.d();
                            case 18:
                                i iVar4 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new nu.g();
                            case 19:
                                i iVar5 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.k();
                            case 20:
                                i iVar6 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.k();
                            case 21:
                                j jVar = j.f92799a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ec0.g();
                            case 22:
                                Scope scope9 = (Scope) obj2;
                                k kVar = k.f92814a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var3 = p005kotlin.jvm.internal.s0.f105811a;
                                return new l((k12.a) scope9.get((k23.d<?>) t0Var3.b(k12.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (cl0.b) scope9.get((k23.d<?>) t0Var3.b(cl0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                m mVar = m.f92840a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (su.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, su.a.class, new c83.h.a[0], null, null, null, 120);
                            case 24:
                                Scope scope10 = (Scope) obj2;
                                m mVar2 = m.f92840a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var4 = p005kotlin.jvm.internal.s0.f105811a;
                                return new yu.c((su.a) scope10.get((k23.d<?>) t0Var4.b(su.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zy0.b) scope10.get((k23.d<?>) t0Var4.b(zy0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                Scope scope11 = (Scope) obj2;
                                o oVar = o.f92864a;
                                scope11.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.q1(ModuleExtKt.androidContext(scope11), (f12.b) scope11.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                Scope scope12 = (Scope) obj2;
                                o oVar2 = o.f92864a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new pd0.a(ModuleExtKt.androidContext(scope12), (f12.l) scope12.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 27:
                                o oVar3 = o.f92864a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.h5(dv.m.a.a(dv.m.f61336b));
                            case 28:
                                Scope scope13 = (Scope) obj2;
                                o oVar4 = o.f92864a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                k12.d dVarA = k12.d.a.a(k12.d.f102315g);
                                m12.k kVar2 = new m12.k(null, 1, null);
                                p005kotlin.jvm.internal.t0 t0Var5 = p005kotlin.jvm.internal.s0.f105811a;
                                return new qd0.b(dVarA, kVar2, (f12.b) scope13.get((k23.d<?>) t0Var5.b(f12.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (f12.l) scope13.get((k23.d<?>) t0Var5.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                o oVar5 = o.f92864a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new nd0.e();
                        }
                    }
                };
                new KoinDefinition(module7, e5.n(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), s0.f105811a.b(wt1.a.class), null, pVar6, Kind.Factory, j0.f134944a), module7));
                break;
            case 11:
                Module module8 = (Module) obj;
                id0.i iVar = id0.i.f92786a;
                module8.getClass();
                p pVar7 = new p() { // from class: id0.a
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        ip.i iVar2;
                        ip.i iVar3;
                        switch (i14) {
                            case 0:
                                Scope scope = (Scope) obj2;
                                b bVar7 = b.f92665a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new bs.b((Context) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(Context.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                b bVar8 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new so.c();
                            case 2:
                                b bVar9 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ro.a();
                            case 3:
                                b bVar10 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new qo.a();
                            case 4:
                                b bVar11 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ro1.o0();
                            case 5:
                                Scope scope2 = (Scope) obj2;
                                b bVar12 = b.f92665a;
                                scope2.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zp.b((am.b2) scope2.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(am.b2.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                c cVar2 = c.f92680a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (am.b2) ez0.b.a(ez0.b.f67468a, ez0.c.GC, am.b2.class, new c83.h.a[0], null, null, null, 120);
                            case 7:
                                Scope scope3 = (Scope) obj2;
                                c cVar3 = c.f92680a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ip.f((am.b2) scope3.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(am.b2.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 8:
                                Scope scope4 = (Scope) obj2;
                                c cVar4 = c.f92680a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ip.l((am.b2) scope4.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(am.b2.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                Scope scope5 = (Scope) obj2;
                                c cVar5 = c.f92680a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.b((ip.f) scope5.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                Scope scope6 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                c cVar6 = c.f92680a;
                                scope6.getClass();
                                parametersHolder.getClass();
                                Object obj4 = (hl.a) parametersHolder.get(1);
                                if (obj4 == null) {
                                    obj4 = hl.a.c.f84256b;
                                }
                                if (p005kotlin.jvm.internal.s.g(obj4, hl.a.c.f84256b)) {
                                    iVar2 = (ip.i) scope6.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                } else {
                                    if (!(obj4 instanceof hl.a.b)) {
                                        lc.u0.r();
                                        return null;
                                    }
                                    iVar2 = (ip.i) scope6.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                }
                                return new v12.p(iVar2, (List) parametersHolder.get(0));
                            case 11:
                                Scope scope7 = (Scope) obj2;
                                ParametersHolder parametersHolder2 = (ParametersHolder) obj3;
                                c cVar7 = c.f92680a;
                                scope7.getClass();
                                parametersHolder2.getClass();
                                ip.a aVar5 = (ip.a) parametersHolder2.get(0);
                                hl.a aVar6 = (hl.a) parametersHolder2.get(1);
                                if (aVar6 == null) {
                                    aVar6 = hl.a.c.f84256b;
                                }
                                if (p005kotlin.jvm.internal.s.g(aVar6, hl.a.c.f84256b)) {
                                    iVar3 = (ip.i) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                } else {
                                    if (!(aVar6 instanceof hl.a.b)) {
                                        lc.u0.r();
                                        return null;
                                    }
                                    iVar3 = (ip.i) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                }
                                return aVar5 == null ? new v12.e(iVar3, aVar6, hl.b.a(aVar6)) : new v12.i(aVar5, aVar6, hl.b.a(aVar6));
                            case 12:
                                d dVar2 = d.f92697a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.f();
                            case 13:
                                e eVar2 = e.f92711a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.g();
                            case 14:
                                f fVar2 = f.f92723a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.h();
                            case 15:
                                Scope scope8 = (Scope) obj2;
                                g gVar2 = g.f92757a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.i(ModuleExtKt.androidContext(scope8));
                            case 16:
                                h hVar2 = h.f92773a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.j();
                            case 17:
                                i iVar4 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new AudioPromptsService.d();
                            case 18:
                                i iVar5 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new nu.g();
                            case 19:
                                i iVar6 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.k();
                            case 20:
                                i iVar7 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.k();
                            case 21:
                                j jVar = j.f92799a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ec0.g();
                            case 22:
                                Scope scope9 = (Scope) obj2;
                                k kVar = k.f92814a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var3 = p005kotlin.jvm.internal.s0.f105811a;
                                return new l((k12.a) scope9.get((k23.d<?>) t0Var3.b(k12.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (cl0.b) scope9.get((k23.d<?>) t0Var3.b(cl0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                m mVar = m.f92840a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (su.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, su.a.class, new c83.h.a[0], null, null, null, 120);
                            case 24:
                                Scope scope10 = (Scope) obj2;
                                m mVar2 = m.f92840a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var4 = p005kotlin.jvm.internal.s0.f105811a;
                                return new yu.c((su.a) scope10.get((k23.d<?>) t0Var4.b(su.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zy0.b) scope10.get((k23.d<?>) t0Var4.b(zy0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                Scope scope11 = (Scope) obj2;
                                o oVar = o.f92864a;
                                scope11.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.q1(ModuleExtKt.androidContext(scope11), (f12.b) scope11.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                Scope scope12 = (Scope) obj2;
                                o oVar2 = o.f92864a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new pd0.a(ModuleExtKt.androidContext(scope12), (f12.l) scope12.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 27:
                                o oVar3 = o.f92864a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.h5(dv.m.a.a(dv.m.f61336b));
                            case 28:
                                Scope scope13 = (Scope) obj2;
                                o oVar4 = o.f92864a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                k12.d dVarA = k12.d.a.a(k12.d.f102315g);
                                m12.k kVar2 = new m12.k(null, 1, null);
                                p005kotlin.jvm.internal.t0 t0Var5 = p005kotlin.jvm.internal.s0.f105811a;
                                return new qd0.b(dVarA, kVar2, (f12.b) scope13.get((k23.d<?>) t0Var5.b(f12.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (f12.l) scope13.get((k23.d<?>) t0Var5.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                o oVar5 = o.f92864a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new nd0.e();
                        }
                    }
                };
                ScopeRegistry.Companion companion3 = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier3 = companion3.getRootScopeQualifier();
                Kind kind3 = Kind.Factory;
                j0 j0Var3 = j0.f134944a;
                t0 t0Var3 = s0.f105811a;
                new KoinDefinition(module8, e5.n(new BeanDefinition(rootScopeQualifier3, t0Var3.b(AudioPromptsService.c.class), null, pVar7, kind3, j0Var3), module8));
                final int i56 = 18;
                new KoinDefinition(module8, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(nu.d.class), null, new p() { // from class: id0.a
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        ip.i iVar2;
                        ip.i iVar3;
                        switch (i56) {
                            case 0:
                                Scope scope = (Scope) obj2;
                                b bVar7 = b.f92665a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new bs.b((Context) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(Context.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                b bVar8 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new so.c();
                            case 2:
                                b bVar9 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ro.a();
                            case 3:
                                b bVar10 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new qo.a();
                            case 4:
                                b bVar11 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ro1.o0();
                            case 5:
                                Scope scope2 = (Scope) obj2;
                                b bVar12 = b.f92665a;
                                scope2.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zp.b((am.b2) scope2.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(am.b2.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                c cVar2 = c.f92680a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (am.b2) ez0.b.a(ez0.b.f67468a, ez0.c.GC, am.b2.class, new c83.h.a[0], null, null, null, 120);
                            case 7:
                                Scope scope3 = (Scope) obj2;
                                c cVar3 = c.f92680a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ip.f((am.b2) scope3.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(am.b2.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 8:
                                Scope scope4 = (Scope) obj2;
                                c cVar4 = c.f92680a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ip.l((am.b2) scope4.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(am.b2.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                Scope scope5 = (Scope) obj2;
                                c cVar5 = c.f92680a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.b((ip.f) scope5.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                Scope scope6 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                c cVar6 = c.f92680a;
                                scope6.getClass();
                                parametersHolder.getClass();
                                Object obj4 = (hl.a) parametersHolder.get(1);
                                if (obj4 == null) {
                                    obj4 = hl.a.c.f84256b;
                                }
                                if (p005kotlin.jvm.internal.s.g(obj4, hl.a.c.f84256b)) {
                                    iVar2 = (ip.i) scope6.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                } else {
                                    if (!(obj4 instanceof hl.a.b)) {
                                        lc.u0.r();
                                        return null;
                                    }
                                    iVar2 = (ip.i) scope6.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                }
                                return new v12.p(iVar2, (List) parametersHolder.get(0));
                            case 11:
                                Scope scope7 = (Scope) obj2;
                                ParametersHolder parametersHolder2 = (ParametersHolder) obj3;
                                c cVar7 = c.f92680a;
                                scope7.getClass();
                                parametersHolder2.getClass();
                                ip.a aVar5 = (ip.a) parametersHolder2.get(0);
                                hl.a aVar6 = (hl.a) parametersHolder2.get(1);
                                if (aVar6 == null) {
                                    aVar6 = hl.a.c.f84256b;
                                }
                                if (p005kotlin.jvm.internal.s.g(aVar6, hl.a.c.f84256b)) {
                                    iVar3 = (ip.i) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                } else {
                                    if (!(aVar6 instanceof hl.a.b)) {
                                        lc.u0.r();
                                        return null;
                                    }
                                    iVar3 = (ip.i) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                }
                                return aVar5 == null ? new v12.e(iVar3, aVar6, hl.b.a(aVar6)) : new v12.i(aVar5, aVar6, hl.b.a(aVar6));
                            case 12:
                                d dVar2 = d.f92697a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.f();
                            case 13:
                                e eVar2 = e.f92711a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.g();
                            case 14:
                                f fVar2 = f.f92723a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.h();
                            case 15:
                                Scope scope8 = (Scope) obj2;
                                g gVar2 = g.f92757a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.i(ModuleExtKt.androidContext(scope8));
                            case 16:
                                h hVar2 = h.f92773a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.j();
                            case 17:
                                i iVar4 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new AudioPromptsService.d();
                            case 18:
                                i iVar5 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new nu.g();
                            case 19:
                                i iVar6 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.k();
                            case 20:
                                i iVar7 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.k();
                            case 21:
                                j jVar = j.f92799a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ec0.g();
                            case 22:
                                Scope scope9 = (Scope) obj2;
                                k kVar = k.f92814a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var4 = p005kotlin.jvm.internal.s0.f105811a;
                                return new l((k12.a) scope9.get((k23.d<?>) t0Var4.b(k12.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (cl0.b) scope9.get((k23.d<?>) t0Var4.b(cl0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                m mVar = m.f92840a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (su.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, su.a.class, new c83.h.a[0], null, null, null, 120);
                            case 24:
                                Scope scope10 = (Scope) obj2;
                                m mVar2 = m.f92840a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var5 = p005kotlin.jvm.internal.s0.f105811a;
                                return new yu.c((su.a) scope10.get((k23.d<?>) t0Var5.b(su.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zy0.b) scope10.get((k23.d<?>) t0Var5.b(zy0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                Scope scope11 = (Scope) obj2;
                                o oVar = o.f92864a;
                                scope11.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.q1(ModuleExtKt.androidContext(scope11), (f12.b) scope11.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                Scope scope12 = (Scope) obj2;
                                o oVar2 = o.f92864a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new pd0.a(ModuleExtKt.androidContext(scope12), (f12.l) scope12.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 27:
                                o oVar3 = o.f92864a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.h5(dv.m.a.a(dv.m.f61336b));
                            case 28:
                                Scope scope13 = (Scope) obj2;
                                o oVar4 = o.f92864a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                k12.d dVarA = k12.d.a.a(k12.d.f102315g);
                                m12.k kVar2 = new m12.k(null, 1, null);
                                p005kotlin.jvm.internal.t0 t0Var6 = p005kotlin.jvm.internal.s0.f105811a;
                                return new qd0.b(dVarA, kVar2, (f12.b) scope13.get((k23.d<?>) t0Var6.b(f12.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (f12.l) scope13.get((k23.d<?>) t0Var6.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                o oVar5 = o.f92864a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new nd0.e();
                        }
                    }
                }, kind3, j0Var3), module8));
                new KoinDefinition(module8, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(gu.b.class), null, new p() { // from class: id0.a
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        ip.i iVar2;
                        ip.i iVar3;
                        switch (i24) {
                            case 0:
                                Scope scope = (Scope) obj2;
                                b bVar7 = b.f92665a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new bs.b((Context) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(Context.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                b bVar8 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new so.c();
                            case 2:
                                b bVar9 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ro.a();
                            case 3:
                                b bVar10 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new qo.a();
                            case 4:
                                b bVar11 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ro1.o0();
                            case 5:
                                Scope scope2 = (Scope) obj2;
                                b bVar12 = b.f92665a;
                                scope2.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zp.b((am.b2) scope2.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(am.b2.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                c cVar2 = c.f92680a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (am.b2) ez0.b.a(ez0.b.f67468a, ez0.c.GC, am.b2.class, new c83.h.a[0], null, null, null, 120);
                            case 7:
                                Scope scope3 = (Scope) obj2;
                                c cVar3 = c.f92680a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ip.f((am.b2) scope3.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(am.b2.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 8:
                                Scope scope4 = (Scope) obj2;
                                c cVar4 = c.f92680a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ip.l((am.b2) scope4.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(am.b2.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                Scope scope5 = (Scope) obj2;
                                c cVar5 = c.f92680a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.b((ip.f) scope5.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                Scope scope6 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                c cVar6 = c.f92680a;
                                scope6.getClass();
                                parametersHolder.getClass();
                                Object obj4 = (hl.a) parametersHolder.get(1);
                                if (obj4 == null) {
                                    obj4 = hl.a.c.f84256b;
                                }
                                if (p005kotlin.jvm.internal.s.g(obj4, hl.a.c.f84256b)) {
                                    iVar2 = (ip.i) scope6.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                } else {
                                    if (!(obj4 instanceof hl.a.b)) {
                                        lc.u0.r();
                                        return null;
                                    }
                                    iVar2 = (ip.i) scope6.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                }
                                return new v12.p(iVar2, (List) parametersHolder.get(0));
                            case 11:
                                Scope scope7 = (Scope) obj2;
                                ParametersHolder parametersHolder2 = (ParametersHolder) obj3;
                                c cVar7 = c.f92680a;
                                scope7.getClass();
                                parametersHolder2.getClass();
                                ip.a aVar5 = (ip.a) parametersHolder2.get(0);
                                hl.a aVar6 = (hl.a) parametersHolder2.get(1);
                                if (aVar6 == null) {
                                    aVar6 = hl.a.c.f84256b;
                                }
                                if (p005kotlin.jvm.internal.s.g(aVar6, hl.a.c.f84256b)) {
                                    iVar3 = (ip.i) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                } else {
                                    if (!(aVar6 instanceof hl.a.b)) {
                                        lc.u0.r();
                                        return null;
                                    }
                                    iVar3 = (ip.i) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                }
                                return aVar5 == null ? new v12.e(iVar3, aVar6, hl.b.a(aVar6)) : new v12.i(aVar5, aVar6, hl.b.a(aVar6));
                            case 12:
                                d dVar2 = d.f92697a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.f();
                            case 13:
                                e eVar2 = e.f92711a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.g();
                            case 14:
                                f fVar2 = f.f92723a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.h();
                            case 15:
                                Scope scope8 = (Scope) obj2;
                                g gVar2 = g.f92757a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.i(ModuleExtKt.androidContext(scope8));
                            case 16:
                                h hVar2 = h.f92773a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.j();
                            case 17:
                                i iVar4 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new AudioPromptsService.d();
                            case 18:
                                i iVar5 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new nu.g();
                            case 19:
                                i iVar6 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.k();
                            case 20:
                                i iVar7 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.k();
                            case 21:
                                j jVar = j.f92799a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ec0.g();
                            case 22:
                                Scope scope9 = (Scope) obj2;
                                k kVar = k.f92814a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var4 = p005kotlin.jvm.internal.s0.f105811a;
                                return new l((k12.a) scope9.get((k23.d<?>) t0Var4.b(k12.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (cl0.b) scope9.get((k23.d<?>) t0Var4.b(cl0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                m mVar = m.f92840a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (su.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, su.a.class, new c83.h.a[0], null, null, null, 120);
                            case 24:
                                Scope scope10 = (Scope) obj2;
                                m mVar2 = m.f92840a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var5 = p005kotlin.jvm.internal.s0.f105811a;
                                return new yu.c((su.a) scope10.get((k23.d<?>) t0Var5.b(su.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zy0.b) scope10.get((k23.d<?>) t0Var5.b(zy0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                Scope scope11 = (Scope) obj2;
                                o oVar = o.f92864a;
                                scope11.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.q1(ModuleExtKt.androidContext(scope11), (f12.b) scope11.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                Scope scope12 = (Scope) obj2;
                                o oVar2 = o.f92864a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new pd0.a(ModuleExtKt.androidContext(scope12), (f12.l) scope12.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 27:
                                o oVar3 = o.f92864a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.h5(dv.m.a.a(dv.m.f61336b));
                            case 28:
                                Scope scope13 = (Scope) obj2;
                                o oVar4 = o.f92864a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                k12.d dVarA = k12.d.a.a(k12.d.f102315g);
                                m12.k kVar2 = new m12.k(null, 1, null);
                                p005kotlin.jvm.internal.t0 t0Var6 = p005kotlin.jvm.internal.s0.f105811a;
                                return new qd0.b(dVarA, kVar2, (f12.b) scope13.get((k23.d<?>) t0Var6.b(f12.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (f12.l) scope13.get((k23.d<?>) t0Var6.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                o oVar5 = o.f92864a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new nd0.e();
                        }
                    }
                }, kind3, j0Var3), module8));
                new KoinDefinition(module8, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(gu.c.class), null, new p() { // from class: id0.a
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        ip.i iVar2;
                        ip.i iVar3;
                        switch (i19) {
                            case 0:
                                Scope scope = (Scope) obj2;
                                b bVar7 = b.f92665a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new bs.b((Context) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(Context.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                b bVar8 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new so.c();
                            case 2:
                                b bVar9 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ro.a();
                            case 3:
                                b bVar10 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new qo.a();
                            case 4:
                                b bVar11 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ro1.o0();
                            case 5:
                                Scope scope2 = (Scope) obj2;
                                b bVar12 = b.f92665a;
                                scope2.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zp.b((am.b2) scope2.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(am.b2.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                c cVar2 = c.f92680a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (am.b2) ez0.b.a(ez0.b.f67468a, ez0.c.GC, am.b2.class, new c83.h.a[0], null, null, null, 120);
                            case 7:
                                Scope scope3 = (Scope) obj2;
                                c cVar3 = c.f92680a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ip.f((am.b2) scope3.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(am.b2.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 8:
                                Scope scope4 = (Scope) obj2;
                                c cVar4 = c.f92680a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ip.l((am.b2) scope4.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(am.b2.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                Scope scope5 = (Scope) obj2;
                                c cVar5 = c.f92680a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.b((ip.f) scope5.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                Scope scope6 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                c cVar6 = c.f92680a;
                                scope6.getClass();
                                parametersHolder.getClass();
                                Object obj4 = (hl.a) parametersHolder.get(1);
                                if (obj4 == null) {
                                    obj4 = hl.a.c.f84256b;
                                }
                                if (p005kotlin.jvm.internal.s.g(obj4, hl.a.c.f84256b)) {
                                    iVar2 = (ip.i) scope6.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                } else {
                                    if (!(obj4 instanceof hl.a.b)) {
                                        lc.u0.r();
                                        return null;
                                    }
                                    iVar2 = (ip.i) scope6.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                }
                                return new v12.p(iVar2, (List) parametersHolder.get(0));
                            case 11:
                                Scope scope7 = (Scope) obj2;
                                ParametersHolder parametersHolder2 = (ParametersHolder) obj3;
                                c cVar7 = c.f92680a;
                                scope7.getClass();
                                parametersHolder2.getClass();
                                ip.a aVar5 = (ip.a) parametersHolder2.get(0);
                                hl.a aVar6 = (hl.a) parametersHolder2.get(1);
                                if (aVar6 == null) {
                                    aVar6 = hl.a.c.f84256b;
                                }
                                if (p005kotlin.jvm.internal.s.g(aVar6, hl.a.c.f84256b)) {
                                    iVar3 = (ip.i) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                } else {
                                    if (!(aVar6 instanceof hl.a.b)) {
                                        lc.u0.r();
                                        return null;
                                    }
                                    iVar3 = (ip.i) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                }
                                return aVar5 == null ? new v12.e(iVar3, aVar6, hl.b.a(aVar6)) : new v12.i(aVar5, aVar6, hl.b.a(aVar6));
                            case 12:
                                d dVar2 = d.f92697a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.f();
                            case 13:
                                e eVar2 = e.f92711a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.g();
                            case 14:
                                f fVar2 = f.f92723a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.h();
                            case 15:
                                Scope scope8 = (Scope) obj2;
                                g gVar2 = g.f92757a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.i(ModuleExtKt.androidContext(scope8));
                            case 16:
                                h hVar2 = h.f92773a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.j();
                            case 17:
                                i iVar4 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new AudioPromptsService.d();
                            case 18:
                                i iVar5 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new nu.g();
                            case 19:
                                i iVar6 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.k();
                            case 20:
                                i iVar7 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.k();
                            case 21:
                                j jVar = j.f92799a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ec0.g();
                            case 22:
                                Scope scope9 = (Scope) obj2;
                                k kVar = k.f92814a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var4 = p005kotlin.jvm.internal.s0.f105811a;
                                return new l((k12.a) scope9.get((k23.d<?>) t0Var4.b(k12.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (cl0.b) scope9.get((k23.d<?>) t0Var4.b(cl0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                m mVar = m.f92840a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (su.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, su.a.class, new c83.h.a[0], null, null, null, 120);
                            case 24:
                                Scope scope10 = (Scope) obj2;
                                m mVar2 = m.f92840a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var5 = p005kotlin.jvm.internal.s0.f105811a;
                                return new yu.c((su.a) scope10.get((k23.d<?>) t0Var5.b(su.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zy0.b) scope10.get((k23.d<?>) t0Var5.b(zy0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                Scope scope11 = (Scope) obj2;
                                o oVar = o.f92864a;
                                scope11.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.q1(ModuleExtKt.androidContext(scope11), (f12.b) scope11.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                Scope scope12 = (Scope) obj2;
                                o oVar2 = o.f92864a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new pd0.a(ModuleExtKt.androidContext(scope12), (f12.l) scope12.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 27:
                                o oVar3 = o.f92864a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.h5(dv.m.a.a(dv.m.f61336b));
                            case 28:
                                Scope scope13 = (Scope) obj2;
                                o oVar4 = o.f92864a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                k12.d dVarA = k12.d.a.a(k12.d.f102315g);
                                m12.k kVar2 = new m12.k(null, 1, null);
                                p005kotlin.jvm.internal.t0 t0Var6 = p005kotlin.jvm.internal.s0.f105811a;
                                return new qd0.b(dVarA, kVar2, (f12.b) scope13.get((k23.d<?>) t0Var6.b(f12.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (f12.l) scope13.get((k23.d<?>) t0Var6.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                o oVar5 = o.f92864a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new nd0.e();
                        }
                    }
                }, kind3, j0Var3), module8));
                break;
            case 12:
                Module module9 = (Module) obj;
                id0.j jVar = id0.j.f92799a;
                module9.getClass();
                p pVar8 = new p() { // from class: id0.a
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        ip.i iVar2;
                        ip.i iVar3;
                        switch (i25) {
                            case 0:
                                Scope scope = (Scope) obj2;
                                b bVar7 = b.f92665a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new bs.b((Context) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(Context.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                b bVar8 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new so.c();
                            case 2:
                                b bVar9 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ro.a();
                            case 3:
                                b bVar10 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new qo.a();
                            case 4:
                                b bVar11 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ro1.o0();
                            case 5:
                                Scope scope2 = (Scope) obj2;
                                b bVar12 = b.f92665a;
                                scope2.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zp.b((am.b2) scope2.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(am.b2.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                c cVar2 = c.f92680a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (am.b2) ez0.b.a(ez0.b.f67468a, ez0.c.GC, am.b2.class, new c83.h.a[0], null, null, null, 120);
                            case 7:
                                Scope scope3 = (Scope) obj2;
                                c cVar3 = c.f92680a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ip.f((am.b2) scope3.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(am.b2.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 8:
                                Scope scope4 = (Scope) obj2;
                                c cVar4 = c.f92680a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ip.l((am.b2) scope4.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(am.b2.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                Scope scope5 = (Scope) obj2;
                                c cVar5 = c.f92680a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.b((ip.f) scope5.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                Scope scope6 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                c cVar6 = c.f92680a;
                                scope6.getClass();
                                parametersHolder.getClass();
                                Object obj4 = (hl.a) parametersHolder.get(1);
                                if (obj4 == null) {
                                    obj4 = hl.a.c.f84256b;
                                }
                                if (p005kotlin.jvm.internal.s.g(obj4, hl.a.c.f84256b)) {
                                    iVar2 = (ip.i) scope6.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                } else {
                                    if (!(obj4 instanceof hl.a.b)) {
                                        lc.u0.r();
                                        return null;
                                    }
                                    iVar2 = (ip.i) scope6.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                }
                                return new v12.p(iVar2, (List) parametersHolder.get(0));
                            case 11:
                                Scope scope7 = (Scope) obj2;
                                ParametersHolder parametersHolder2 = (ParametersHolder) obj3;
                                c cVar7 = c.f92680a;
                                scope7.getClass();
                                parametersHolder2.getClass();
                                ip.a aVar5 = (ip.a) parametersHolder2.get(0);
                                hl.a aVar6 = (hl.a) parametersHolder2.get(1);
                                if (aVar6 == null) {
                                    aVar6 = hl.a.c.f84256b;
                                }
                                if (p005kotlin.jvm.internal.s.g(aVar6, hl.a.c.f84256b)) {
                                    iVar3 = (ip.i) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                } else {
                                    if (!(aVar6 instanceof hl.a.b)) {
                                        lc.u0.r();
                                        return null;
                                    }
                                    iVar3 = (ip.i) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                }
                                return aVar5 == null ? new v12.e(iVar3, aVar6, hl.b.a(aVar6)) : new v12.i(aVar5, aVar6, hl.b.a(aVar6));
                            case 12:
                                d dVar2 = d.f92697a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.f();
                            case 13:
                                e eVar2 = e.f92711a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.g();
                            case 14:
                                f fVar2 = f.f92723a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.h();
                            case 15:
                                Scope scope8 = (Scope) obj2;
                                g gVar2 = g.f92757a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.i(ModuleExtKt.androidContext(scope8));
                            case 16:
                                h hVar2 = h.f92773a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.j();
                            case 17:
                                i iVar4 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new AudioPromptsService.d();
                            case 18:
                                i iVar5 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new nu.g();
                            case 19:
                                i iVar6 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.k();
                            case 20:
                                i iVar7 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.k();
                            case 21:
                                j jVar2 = j.f92799a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ec0.g();
                            case 22:
                                Scope scope9 = (Scope) obj2;
                                k kVar = k.f92814a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var4 = p005kotlin.jvm.internal.s0.f105811a;
                                return new l((k12.a) scope9.get((k23.d<?>) t0Var4.b(k12.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (cl0.b) scope9.get((k23.d<?>) t0Var4.b(cl0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                m mVar = m.f92840a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (su.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, su.a.class, new c83.h.a[0], null, null, null, 120);
                            case 24:
                                Scope scope10 = (Scope) obj2;
                                m mVar2 = m.f92840a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var5 = p005kotlin.jvm.internal.s0.f105811a;
                                return new yu.c((su.a) scope10.get((k23.d<?>) t0Var5.b(su.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zy0.b) scope10.get((k23.d<?>) t0Var5.b(zy0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                Scope scope11 = (Scope) obj2;
                                o oVar = o.f92864a;
                                scope11.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.q1(ModuleExtKt.androidContext(scope11), (f12.b) scope11.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                Scope scope12 = (Scope) obj2;
                                o oVar2 = o.f92864a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new pd0.a(ModuleExtKt.androidContext(scope12), (f12.l) scope12.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 27:
                                o oVar3 = o.f92864a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.h5(dv.m.a.a(dv.m.f61336b));
                            case 28:
                                Scope scope13 = (Scope) obj2;
                                o oVar4 = o.f92864a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                k12.d dVarA = k12.d.a.a(k12.d.f102315g);
                                m12.k kVar2 = new m12.k(null, 1, null);
                                p005kotlin.jvm.internal.t0 t0Var6 = p005kotlin.jvm.internal.s0.f105811a;
                                return new qd0.b(dVarA, kVar2, (f12.b) scope13.get((k23.d<?>) t0Var6.b(f12.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (f12.l) scope13.get((k23.d<?>) t0Var6.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                o oVar5 = o.f92864a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new nd0.e();
                        }
                    }
                };
                new KoinDefinition(module9, e5.n(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), s0.f105811a.b(ec0.f.class), null, pVar8, Kind.Factory, j0.f134944a), module9));
                break;
            case 13:
                Module module10 = (Module) obj;
                id0.k kVar = id0.k.f92814a;
                module10.getClass();
                p pVar9 = new p() { // from class: id0.a
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        ip.i iVar2;
                        ip.i iVar3;
                        switch (i28) {
                            case 0:
                                Scope scope = (Scope) obj2;
                                b bVar7 = b.f92665a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new bs.b((Context) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(Context.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                b bVar8 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new so.c();
                            case 2:
                                b bVar9 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ro.a();
                            case 3:
                                b bVar10 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new qo.a();
                            case 4:
                                b bVar11 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ro1.o0();
                            case 5:
                                Scope scope2 = (Scope) obj2;
                                b bVar12 = b.f92665a;
                                scope2.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zp.b((am.b2) scope2.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(am.b2.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                c cVar2 = c.f92680a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (am.b2) ez0.b.a(ez0.b.f67468a, ez0.c.GC, am.b2.class, new c83.h.a[0], null, null, null, 120);
                            case 7:
                                Scope scope3 = (Scope) obj2;
                                c cVar3 = c.f92680a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ip.f((am.b2) scope3.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(am.b2.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 8:
                                Scope scope4 = (Scope) obj2;
                                c cVar4 = c.f92680a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ip.l((am.b2) scope4.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(am.b2.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                Scope scope5 = (Scope) obj2;
                                c cVar5 = c.f92680a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.b((ip.f) scope5.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                Scope scope6 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                c cVar6 = c.f92680a;
                                scope6.getClass();
                                parametersHolder.getClass();
                                Object obj4 = (hl.a) parametersHolder.get(1);
                                if (obj4 == null) {
                                    obj4 = hl.a.c.f84256b;
                                }
                                if (p005kotlin.jvm.internal.s.g(obj4, hl.a.c.f84256b)) {
                                    iVar2 = (ip.i) scope6.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                } else {
                                    if (!(obj4 instanceof hl.a.b)) {
                                        lc.u0.r();
                                        return null;
                                    }
                                    iVar2 = (ip.i) scope6.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                }
                                return new v12.p(iVar2, (List) parametersHolder.get(0));
                            case 11:
                                Scope scope7 = (Scope) obj2;
                                ParametersHolder parametersHolder2 = (ParametersHolder) obj3;
                                c cVar7 = c.f92680a;
                                scope7.getClass();
                                parametersHolder2.getClass();
                                ip.a aVar5 = (ip.a) parametersHolder2.get(0);
                                hl.a aVar6 = (hl.a) parametersHolder2.get(1);
                                if (aVar6 == null) {
                                    aVar6 = hl.a.c.f84256b;
                                }
                                if (p005kotlin.jvm.internal.s.g(aVar6, hl.a.c.f84256b)) {
                                    iVar3 = (ip.i) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                } else {
                                    if (!(aVar6 instanceof hl.a.b)) {
                                        lc.u0.r();
                                        return null;
                                    }
                                    iVar3 = (ip.i) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                }
                                return aVar5 == null ? new v12.e(iVar3, aVar6, hl.b.a(aVar6)) : new v12.i(aVar5, aVar6, hl.b.a(aVar6));
                            case 12:
                                d dVar2 = d.f92697a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.f();
                            case 13:
                                e eVar2 = e.f92711a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.g();
                            case 14:
                                f fVar2 = f.f92723a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.h();
                            case 15:
                                Scope scope8 = (Scope) obj2;
                                g gVar2 = g.f92757a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.i(ModuleExtKt.androidContext(scope8));
                            case 16:
                                h hVar2 = h.f92773a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.j();
                            case 17:
                                i iVar4 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new AudioPromptsService.d();
                            case 18:
                                i iVar5 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new nu.g();
                            case 19:
                                i iVar6 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.k();
                            case 20:
                                i iVar7 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.k();
                            case 21:
                                j jVar2 = j.f92799a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ec0.g();
                            case 22:
                                Scope scope9 = (Scope) obj2;
                                k kVar2 = k.f92814a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var4 = p005kotlin.jvm.internal.s0.f105811a;
                                return new l((k12.a) scope9.get((k23.d<?>) t0Var4.b(k12.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (cl0.b) scope9.get((k23.d<?>) t0Var4.b(cl0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                m mVar = m.f92840a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (su.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, su.a.class, new c83.h.a[0], null, null, null, 120);
                            case 24:
                                Scope scope10 = (Scope) obj2;
                                m mVar2 = m.f92840a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var5 = p005kotlin.jvm.internal.s0.f105811a;
                                return new yu.c((su.a) scope10.get((k23.d<?>) t0Var5.b(su.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zy0.b) scope10.get((k23.d<?>) t0Var5.b(zy0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                Scope scope11 = (Scope) obj2;
                                o oVar = o.f92864a;
                                scope11.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.q1(ModuleExtKt.androidContext(scope11), (f12.b) scope11.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                Scope scope12 = (Scope) obj2;
                                o oVar2 = o.f92864a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new pd0.a(ModuleExtKt.androidContext(scope12), (f12.l) scope12.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 27:
                                o oVar3 = o.f92864a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.h5(dv.m.a.a(dv.m.f61336b));
                            case 28:
                                Scope scope13 = (Scope) obj2;
                                o oVar4 = o.f92864a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                k12.d dVarA = k12.d.a.a(k12.d.f102315g);
                                m12.k kVar3 = new m12.k(null, 1, null);
                                p005kotlin.jvm.internal.t0 t0Var6 = p005kotlin.jvm.internal.s0.f105811a;
                                return new qd0.b(dVarA, kVar3, (f12.b) scope13.get((k23.d<?>) t0Var6.b(f12.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (f12.l) scope13.get((k23.d<?>) t0Var6.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                o oVar5 = o.f92864a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new nd0.e();
                        }
                    }
                };
                new KoinDefinition(module10, e5.n(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), s0.f105811a.b(ru.d.class), null, pVar9, Kind.Factory, j0.f134944a), module10));
                break;
            case 14:
                Module module11 = (Module) obj;
                id0.m mVar = id0.m.f92840a;
                module11.getClass();
                p pVar10 = new p() { // from class: id0.a
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        ip.i iVar2;
                        ip.i iVar3;
                        switch (i27) {
                            case 0:
                                Scope scope = (Scope) obj2;
                                b bVar7 = b.f92665a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new bs.b((Context) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(Context.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                b bVar8 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new so.c();
                            case 2:
                                b bVar9 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ro.a();
                            case 3:
                                b bVar10 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new qo.a();
                            case 4:
                                b bVar11 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ro1.o0();
                            case 5:
                                Scope scope2 = (Scope) obj2;
                                b bVar12 = b.f92665a;
                                scope2.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zp.b((am.b2) scope2.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(am.b2.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                c cVar2 = c.f92680a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (am.b2) ez0.b.a(ez0.b.f67468a, ez0.c.GC, am.b2.class, new c83.h.a[0], null, null, null, 120);
                            case 7:
                                Scope scope3 = (Scope) obj2;
                                c cVar3 = c.f92680a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ip.f((am.b2) scope3.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(am.b2.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 8:
                                Scope scope4 = (Scope) obj2;
                                c cVar4 = c.f92680a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ip.l((am.b2) scope4.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(am.b2.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                Scope scope5 = (Scope) obj2;
                                c cVar5 = c.f92680a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.b((ip.f) scope5.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                Scope scope6 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                c cVar6 = c.f92680a;
                                scope6.getClass();
                                parametersHolder.getClass();
                                Object obj4 = (hl.a) parametersHolder.get(1);
                                if (obj4 == null) {
                                    obj4 = hl.a.c.f84256b;
                                }
                                if (p005kotlin.jvm.internal.s.g(obj4, hl.a.c.f84256b)) {
                                    iVar2 = (ip.i) scope6.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                } else {
                                    if (!(obj4 instanceof hl.a.b)) {
                                        lc.u0.r();
                                        return null;
                                    }
                                    iVar2 = (ip.i) scope6.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                }
                                return new v12.p(iVar2, (List) parametersHolder.get(0));
                            case 11:
                                Scope scope7 = (Scope) obj2;
                                ParametersHolder parametersHolder2 = (ParametersHolder) obj3;
                                c cVar7 = c.f92680a;
                                scope7.getClass();
                                parametersHolder2.getClass();
                                ip.a aVar5 = (ip.a) parametersHolder2.get(0);
                                hl.a aVar6 = (hl.a) parametersHolder2.get(1);
                                if (aVar6 == null) {
                                    aVar6 = hl.a.c.f84256b;
                                }
                                if (p005kotlin.jvm.internal.s.g(aVar6, hl.a.c.f84256b)) {
                                    iVar3 = (ip.i) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                } else {
                                    if (!(aVar6 instanceof hl.a.b)) {
                                        lc.u0.r();
                                        return null;
                                    }
                                    iVar3 = (ip.i) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                }
                                return aVar5 == null ? new v12.e(iVar3, aVar6, hl.b.a(aVar6)) : new v12.i(aVar5, aVar6, hl.b.a(aVar6));
                            case 12:
                                d dVar2 = d.f92697a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.f();
                            case 13:
                                e eVar2 = e.f92711a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.g();
                            case 14:
                                f fVar2 = f.f92723a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.h();
                            case 15:
                                Scope scope8 = (Scope) obj2;
                                g gVar2 = g.f92757a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.i(ModuleExtKt.androidContext(scope8));
                            case 16:
                                h hVar2 = h.f92773a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.j();
                            case 17:
                                i iVar4 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new AudioPromptsService.d();
                            case 18:
                                i iVar5 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new nu.g();
                            case 19:
                                i iVar6 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.k();
                            case 20:
                                i iVar7 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.k();
                            case 21:
                                j jVar2 = j.f92799a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ec0.g();
                            case 22:
                                Scope scope9 = (Scope) obj2;
                                k kVar2 = k.f92814a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var4 = p005kotlin.jvm.internal.s0.f105811a;
                                return new l((k12.a) scope9.get((k23.d<?>) t0Var4.b(k12.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (cl0.b) scope9.get((k23.d<?>) t0Var4.b(cl0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                m mVar2 = m.f92840a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (su.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, su.a.class, new c83.h.a[0], null, null, null, 120);
                            case 24:
                                Scope scope10 = (Scope) obj2;
                                m mVar3 = m.f92840a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var5 = p005kotlin.jvm.internal.s0.f105811a;
                                return new yu.c((su.a) scope10.get((k23.d<?>) t0Var5.b(su.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zy0.b) scope10.get((k23.d<?>) t0Var5.b(zy0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                Scope scope11 = (Scope) obj2;
                                o oVar = o.f92864a;
                                scope11.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.q1(ModuleExtKt.androidContext(scope11), (f12.b) scope11.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                Scope scope12 = (Scope) obj2;
                                o oVar2 = o.f92864a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new pd0.a(ModuleExtKt.androidContext(scope12), (f12.l) scope12.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 27:
                                o oVar3 = o.f92864a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.h5(dv.m.a.a(dv.m.f61336b));
                            case 28:
                                Scope scope13 = (Scope) obj2;
                                o oVar4 = o.f92864a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                k12.d dVarA = k12.d.a.a(k12.d.f102315g);
                                m12.k kVar3 = new m12.k(null, 1, null);
                                p005kotlin.jvm.internal.t0 t0Var6 = p005kotlin.jvm.internal.s0.f105811a;
                                return new qd0.b(dVarA, kVar3, (f12.b) scope13.get((k23.d<?>) t0Var6.b(f12.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (f12.l) scope13.get((k23.d<?>) t0Var6.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                o oVar5 = o.f92864a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new nd0.e();
                        }
                    }
                };
                ScopeRegistry.Companion companion4 = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier4 = companion4.getRootScopeQualifier();
                Kind kind4 = Kind.Factory;
                j0 j0Var4 = j0.f134944a;
                t0 t0Var4 = s0.f105811a;
                new KoinDefinition(module11, e5.n(new BeanDefinition(rootScopeQualifier4, t0Var4.b(su.a.class), null, pVar10, kind4, j0Var4), module11));
                new KoinDefinition(module11, e5.n(new BeanDefinition(companion4.getRootScopeQualifier(), t0Var4.b(yu.c.class), null, new p() { // from class: id0.a
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        ip.i iVar2;
                        ip.i iVar3;
                        switch (i26) {
                            case 0:
                                Scope scope = (Scope) obj2;
                                b bVar7 = b.f92665a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new bs.b((Context) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(Context.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                b bVar8 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new so.c();
                            case 2:
                                b bVar9 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ro.a();
                            case 3:
                                b bVar10 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new qo.a();
                            case 4:
                                b bVar11 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ro1.o0();
                            case 5:
                                Scope scope2 = (Scope) obj2;
                                b bVar12 = b.f92665a;
                                scope2.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zp.b((am.b2) scope2.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(am.b2.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                c cVar2 = c.f92680a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (am.b2) ez0.b.a(ez0.b.f67468a, ez0.c.GC, am.b2.class, new c83.h.a[0], null, null, null, 120);
                            case 7:
                                Scope scope3 = (Scope) obj2;
                                c cVar3 = c.f92680a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ip.f((am.b2) scope3.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(am.b2.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 8:
                                Scope scope4 = (Scope) obj2;
                                c cVar4 = c.f92680a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ip.l((am.b2) scope4.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(am.b2.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                Scope scope5 = (Scope) obj2;
                                c cVar5 = c.f92680a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.b((ip.f) scope5.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                Scope scope6 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                c cVar6 = c.f92680a;
                                scope6.getClass();
                                parametersHolder.getClass();
                                Object obj4 = (hl.a) parametersHolder.get(1);
                                if (obj4 == null) {
                                    obj4 = hl.a.c.f84256b;
                                }
                                if (p005kotlin.jvm.internal.s.g(obj4, hl.a.c.f84256b)) {
                                    iVar2 = (ip.i) scope6.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                } else {
                                    if (!(obj4 instanceof hl.a.b)) {
                                        lc.u0.r();
                                        return null;
                                    }
                                    iVar2 = (ip.i) scope6.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                }
                                return new v12.p(iVar2, (List) parametersHolder.get(0));
                            case 11:
                                Scope scope7 = (Scope) obj2;
                                ParametersHolder parametersHolder2 = (ParametersHolder) obj3;
                                c cVar7 = c.f92680a;
                                scope7.getClass();
                                parametersHolder2.getClass();
                                ip.a aVar5 = (ip.a) parametersHolder2.get(0);
                                hl.a aVar6 = (hl.a) parametersHolder2.get(1);
                                if (aVar6 == null) {
                                    aVar6 = hl.a.c.f84256b;
                                }
                                if (p005kotlin.jvm.internal.s.g(aVar6, hl.a.c.f84256b)) {
                                    iVar3 = (ip.i) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                } else {
                                    if (!(aVar6 instanceof hl.a.b)) {
                                        lc.u0.r();
                                        return null;
                                    }
                                    iVar3 = (ip.i) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                }
                                return aVar5 == null ? new v12.e(iVar3, aVar6, hl.b.a(aVar6)) : new v12.i(aVar5, aVar6, hl.b.a(aVar6));
                            case 12:
                                d dVar2 = d.f92697a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.f();
                            case 13:
                                e eVar2 = e.f92711a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.g();
                            case 14:
                                f fVar2 = f.f92723a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.h();
                            case 15:
                                Scope scope8 = (Scope) obj2;
                                g gVar2 = g.f92757a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.i(ModuleExtKt.androidContext(scope8));
                            case 16:
                                h hVar2 = h.f92773a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.j();
                            case 17:
                                i iVar4 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new AudioPromptsService.d();
                            case 18:
                                i iVar5 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new nu.g();
                            case 19:
                                i iVar6 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.k();
                            case 20:
                                i iVar7 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.k();
                            case 21:
                                j jVar2 = j.f92799a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ec0.g();
                            case 22:
                                Scope scope9 = (Scope) obj2;
                                k kVar2 = k.f92814a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var5 = p005kotlin.jvm.internal.s0.f105811a;
                                return new l((k12.a) scope9.get((k23.d<?>) t0Var5.b(k12.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (cl0.b) scope9.get((k23.d<?>) t0Var5.b(cl0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                m mVar2 = m.f92840a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (su.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, su.a.class, new c83.h.a[0], null, null, null, 120);
                            case 24:
                                Scope scope10 = (Scope) obj2;
                                m mVar3 = m.f92840a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var6 = p005kotlin.jvm.internal.s0.f105811a;
                                return new yu.c((su.a) scope10.get((k23.d<?>) t0Var6.b(su.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zy0.b) scope10.get((k23.d<?>) t0Var6.b(zy0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                Scope scope11 = (Scope) obj2;
                                o oVar = o.f92864a;
                                scope11.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.q1(ModuleExtKt.androidContext(scope11), (f12.b) scope11.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                Scope scope12 = (Scope) obj2;
                                o oVar2 = o.f92864a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new pd0.a(ModuleExtKt.androidContext(scope12), (f12.l) scope12.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 27:
                                o oVar3 = o.f92864a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.h5(dv.m.a.a(dv.m.f61336b));
                            case 28:
                                Scope scope13 = (Scope) obj2;
                                o oVar4 = o.f92864a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                k12.d dVarA = k12.d.a.a(k12.d.f102315g);
                                m12.k kVar3 = new m12.k(null, 1, null);
                                p005kotlin.jvm.internal.t0 t0Var7 = p005kotlin.jvm.internal.s0.f105811a;
                                return new qd0.b(dVarA, kVar3, (f12.b) scope13.get((k23.d<?>) t0Var7.b(f12.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (f12.l) scope13.get((k23.d<?>) t0Var7.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                o oVar5 = o.f92864a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new nd0.e();
                        }
                    }
                }, kind4, j0Var4), module11));
                break;
            case 15:
                Module module12 = (Module) obj;
                id0.o oVar = id0.o.f92864a;
                module12.getClass();
                p pVar11 = new p() { // from class: id0.a
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        ip.i iVar2;
                        ip.i iVar3;
                        switch (i29) {
                            case 0:
                                Scope scope = (Scope) obj2;
                                b bVar7 = b.f92665a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new bs.b((Context) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(Context.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                b bVar8 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new so.c();
                            case 2:
                                b bVar9 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ro.a();
                            case 3:
                                b bVar10 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new qo.a();
                            case 4:
                                b bVar11 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ro1.o0();
                            case 5:
                                Scope scope2 = (Scope) obj2;
                                b bVar12 = b.f92665a;
                                scope2.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zp.b((am.b2) scope2.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(am.b2.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                c cVar2 = c.f92680a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (am.b2) ez0.b.a(ez0.b.f67468a, ez0.c.GC, am.b2.class, new c83.h.a[0], null, null, null, 120);
                            case 7:
                                Scope scope3 = (Scope) obj2;
                                c cVar3 = c.f92680a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ip.f((am.b2) scope3.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(am.b2.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 8:
                                Scope scope4 = (Scope) obj2;
                                c cVar4 = c.f92680a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ip.l((am.b2) scope4.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(am.b2.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                Scope scope5 = (Scope) obj2;
                                c cVar5 = c.f92680a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.b((ip.f) scope5.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                Scope scope6 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                c cVar6 = c.f92680a;
                                scope6.getClass();
                                parametersHolder.getClass();
                                Object obj4 = (hl.a) parametersHolder.get(1);
                                if (obj4 == null) {
                                    obj4 = hl.a.c.f84256b;
                                }
                                if (p005kotlin.jvm.internal.s.g(obj4, hl.a.c.f84256b)) {
                                    iVar2 = (ip.i) scope6.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                } else {
                                    if (!(obj4 instanceof hl.a.b)) {
                                        lc.u0.r();
                                        return null;
                                    }
                                    iVar2 = (ip.i) scope6.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                }
                                return new v12.p(iVar2, (List) parametersHolder.get(0));
                            case 11:
                                Scope scope7 = (Scope) obj2;
                                ParametersHolder parametersHolder2 = (ParametersHolder) obj3;
                                c cVar7 = c.f92680a;
                                scope7.getClass();
                                parametersHolder2.getClass();
                                ip.a aVar5 = (ip.a) parametersHolder2.get(0);
                                hl.a aVar6 = (hl.a) parametersHolder2.get(1);
                                if (aVar6 == null) {
                                    aVar6 = hl.a.c.f84256b;
                                }
                                if (p005kotlin.jvm.internal.s.g(aVar6, hl.a.c.f84256b)) {
                                    iVar3 = (ip.i) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                } else {
                                    if (!(aVar6 instanceof hl.a.b)) {
                                        lc.u0.r();
                                        return null;
                                    }
                                    iVar3 = (ip.i) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                }
                                return aVar5 == null ? new v12.e(iVar3, aVar6, hl.b.a(aVar6)) : new v12.i(aVar5, aVar6, hl.b.a(aVar6));
                            case 12:
                                d dVar2 = d.f92697a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.f();
                            case 13:
                                e eVar2 = e.f92711a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.g();
                            case 14:
                                f fVar2 = f.f92723a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.h();
                            case 15:
                                Scope scope8 = (Scope) obj2;
                                g gVar2 = g.f92757a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.i(ModuleExtKt.androidContext(scope8));
                            case 16:
                                h hVar2 = h.f92773a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.j();
                            case 17:
                                i iVar4 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new AudioPromptsService.d();
                            case 18:
                                i iVar5 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new nu.g();
                            case 19:
                                i iVar6 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.k();
                            case 20:
                                i iVar7 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.k();
                            case 21:
                                j jVar2 = j.f92799a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ec0.g();
                            case 22:
                                Scope scope9 = (Scope) obj2;
                                k kVar2 = k.f92814a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var5 = p005kotlin.jvm.internal.s0.f105811a;
                                return new l((k12.a) scope9.get((k23.d<?>) t0Var5.b(k12.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (cl0.b) scope9.get((k23.d<?>) t0Var5.b(cl0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                m mVar2 = m.f92840a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (su.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, su.a.class, new c83.h.a[0], null, null, null, 120);
                            case 24:
                                Scope scope10 = (Scope) obj2;
                                m mVar3 = m.f92840a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var6 = p005kotlin.jvm.internal.s0.f105811a;
                                return new yu.c((su.a) scope10.get((k23.d<?>) t0Var6.b(su.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zy0.b) scope10.get((k23.d<?>) t0Var6.b(zy0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                Scope scope11 = (Scope) obj2;
                                o oVar2 = o.f92864a;
                                scope11.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.q1(ModuleExtKt.androidContext(scope11), (f12.b) scope11.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                Scope scope12 = (Scope) obj2;
                                o oVar3 = o.f92864a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new pd0.a(ModuleExtKt.androidContext(scope12), (f12.l) scope12.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 27:
                                o oVar4 = o.f92864a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.h5(dv.m.a.a(dv.m.f61336b));
                            case 28:
                                Scope scope13 = (Scope) obj2;
                                o oVar5 = o.f92864a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                k12.d dVarA = k12.d.a.a(k12.d.f102315g);
                                m12.k kVar3 = new m12.k(null, 1, null);
                                p005kotlin.jvm.internal.t0 t0Var7 = p005kotlin.jvm.internal.s0.f105811a;
                                return new qd0.b(dVarA, kVar3, (f12.b) scope13.get((k23.d<?>) t0Var7.b(f12.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (f12.l) scope13.get((k23.d<?>) t0Var7.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                o oVar6 = o.f92864a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new nd0.e();
                        }
                    }
                };
                ScopeRegistry.Companion companion5 = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier5 = companion5.getRootScopeQualifier();
                Kind kind5 = Kind.Factory;
                j0 j0Var5 = j0.f134944a;
                t0 t0Var5 = s0.f105811a;
                new KoinDefinition(module12, e5.n(new BeanDefinition(rootScopeQualifier5, t0Var5.b(x80.b.class), null, pVar11, kind5, j0Var5), module12));
                new KoinDefinition(module12, e5.n(new BeanDefinition(companion5.getRootScopeQualifier(), t0Var5.b(p90.n.class), null, new p() { // from class: id0.a
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        ip.i iVar2;
                        ip.i iVar3;
                        switch (i34) {
                            case 0:
                                Scope scope = (Scope) obj2;
                                b bVar7 = b.f92665a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new bs.b((Context) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(Context.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                b bVar8 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new so.c();
                            case 2:
                                b bVar9 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ro.a();
                            case 3:
                                b bVar10 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new qo.a();
                            case 4:
                                b bVar11 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ro1.o0();
                            case 5:
                                Scope scope2 = (Scope) obj2;
                                b bVar12 = b.f92665a;
                                scope2.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zp.b((am.b2) scope2.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(am.b2.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                c cVar2 = c.f92680a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (am.b2) ez0.b.a(ez0.b.f67468a, ez0.c.GC, am.b2.class, new c83.h.a[0], null, null, null, 120);
                            case 7:
                                Scope scope3 = (Scope) obj2;
                                c cVar3 = c.f92680a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ip.f((am.b2) scope3.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(am.b2.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 8:
                                Scope scope4 = (Scope) obj2;
                                c cVar4 = c.f92680a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ip.l((am.b2) scope4.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(am.b2.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                Scope scope5 = (Scope) obj2;
                                c cVar5 = c.f92680a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.b((ip.f) scope5.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                Scope scope6 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                c cVar6 = c.f92680a;
                                scope6.getClass();
                                parametersHolder.getClass();
                                Object obj4 = (hl.a) parametersHolder.get(1);
                                if (obj4 == null) {
                                    obj4 = hl.a.c.f84256b;
                                }
                                if (p005kotlin.jvm.internal.s.g(obj4, hl.a.c.f84256b)) {
                                    iVar2 = (ip.i) scope6.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                } else {
                                    if (!(obj4 instanceof hl.a.b)) {
                                        lc.u0.r();
                                        return null;
                                    }
                                    iVar2 = (ip.i) scope6.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                }
                                return new v12.p(iVar2, (List) parametersHolder.get(0));
                            case 11:
                                Scope scope7 = (Scope) obj2;
                                ParametersHolder parametersHolder2 = (ParametersHolder) obj3;
                                c cVar7 = c.f92680a;
                                scope7.getClass();
                                parametersHolder2.getClass();
                                ip.a aVar5 = (ip.a) parametersHolder2.get(0);
                                hl.a aVar6 = (hl.a) parametersHolder2.get(1);
                                if (aVar6 == null) {
                                    aVar6 = hl.a.c.f84256b;
                                }
                                if (p005kotlin.jvm.internal.s.g(aVar6, hl.a.c.f84256b)) {
                                    iVar3 = (ip.i) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                } else {
                                    if (!(aVar6 instanceof hl.a.b)) {
                                        lc.u0.r();
                                        return null;
                                    }
                                    iVar3 = (ip.i) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                }
                                return aVar5 == null ? new v12.e(iVar3, aVar6, hl.b.a(aVar6)) : new v12.i(aVar5, aVar6, hl.b.a(aVar6));
                            case 12:
                                d dVar2 = d.f92697a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.f();
                            case 13:
                                e eVar2 = e.f92711a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.g();
                            case 14:
                                f fVar2 = f.f92723a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.h();
                            case 15:
                                Scope scope8 = (Scope) obj2;
                                g gVar2 = g.f92757a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.i(ModuleExtKt.androidContext(scope8));
                            case 16:
                                h hVar2 = h.f92773a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.j();
                            case 17:
                                i iVar4 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new AudioPromptsService.d();
                            case 18:
                                i iVar5 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new nu.g();
                            case 19:
                                i iVar6 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.k();
                            case 20:
                                i iVar7 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.k();
                            case 21:
                                j jVar2 = j.f92799a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ec0.g();
                            case 22:
                                Scope scope9 = (Scope) obj2;
                                k kVar2 = k.f92814a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var6 = p005kotlin.jvm.internal.s0.f105811a;
                                return new l((k12.a) scope9.get((k23.d<?>) t0Var6.b(k12.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (cl0.b) scope9.get((k23.d<?>) t0Var6.b(cl0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                m mVar2 = m.f92840a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (su.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, su.a.class, new c83.h.a[0], null, null, null, 120);
                            case 24:
                                Scope scope10 = (Scope) obj2;
                                m mVar3 = m.f92840a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var7 = p005kotlin.jvm.internal.s0.f105811a;
                                return new yu.c((su.a) scope10.get((k23.d<?>) t0Var7.b(su.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zy0.b) scope10.get((k23.d<?>) t0Var7.b(zy0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                Scope scope11 = (Scope) obj2;
                                o oVar2 = o.f92864a;
                                scope11.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.q1(ModuleExtKt.androidContext(scope11), (f12.b) scope11.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                Scope scope12 = (Scope) obj2;
                                o oVar3 = o.f92864a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new pd0.a(ModuleExtKt.androidContext(scope12), (f12.l) scope12.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 27:
                                o oVar4 = o.f92864a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.h5(dv.m.a.a(dv.m.f61336b));
                            case 28:
                                Scope scope13 = (Scope) obj2;
                                o oVar5 = o.f92864a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                k12.d dVarA = k12.d.a.a(k12.d.f102315g);
                                m12.k kVar3 = new m12.k(null, 1, null);
                                p005kotlin.jvm.internal.t0 t0Var8 = p005kotlin.jvm.internal.s0.f105811a;
                                return new qd0.b(dVarA, kVar3, (f12.b) scope13.get((k23.d<?>) t0Var8.b(f12.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (f12.l) scope13.get((k23.d<?>) t0Var8.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                o oVar6 = o.f92864a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new nd0.e();
                        }
                    }
                }, kind5, j0Var5), module12));
                new KoinDefinition(module12, e5.n(new BeanDefinition(companion5.getRootScopeQualifier(), t0Var5.b(v90.e.class), null, new p() { // from class: id0.a
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        ip.i iVar2;
                        ip.i iVar3;
                        switch (i30) {
                            case 0:
                                Scope scope = (Scope) obj2;
                                b bVar7 = b.f92665a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new bs.b((Context) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(Context.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                b bVar8 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new so.c();
                            case 2:
                                b bVar9 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ro.a();
                            case 3:
                                b bVar10 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new qo.a();
                            case 4:
                                b bVar11 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ro1.o0();
                            case 5:
                                Scope scope2 = (Scope) obj2;
                                b bVar12 = b.f92665a;
                                scope2.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zp.b((am.b2) scope2.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(am.b2.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                c cVar2 = c.f92680a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (am.b2) ez0.b.a(ez0.b.f67468a, ez0.c.GC, am.b2.class, new c83.h.a[0], null, null, null, 120);
                            case 7:
                                Scope scope3 = (Scope) obj2;
                                c cVar3 = c.f92680a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ip.f((am.b2) scope3.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(am.b2.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 8:
                                Scope scope4 = (Scope) obj2;
                                c cVar4 = c.f92680a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ip.l((am.b2) scope4.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(am.b2.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                Scope scope5 = (Scope) obj2;
                                c cVar5 = c.f92680a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.b((ip.f) scope5.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                Scope scope6 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                c cVar6 = c.f92680a;
                                scope6.getClass();
                                parametersHolder.getClass();
                                Object obj4 = (hl.a) parametersHolder.get(1);
                                if (obj4 == null) {
                                    obj4 = hl.a.c.f84256b;
                                }
                                if (p005kotlin.jvm.internal.s.g(obj4, hl.a.c.f84256b)) {
                                    iVar2 = (ip.i) scope6.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                } else {
                                    if (!(obj4 instanceof hl.a.b)) {
                                        lc.u0.r();
                                        return null;
                                    }
                                    iVar2 = (ip.i) scope6.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                }
                                return new v12.p(iVar2, (List) parametersHolder.get(0));
                            case 11:
                                Scope scope7 = (Scope) obj2;
                                ParametersHolder parametersHolder2 = (ParametersHolder) obj3;
                                c cVar7 = c.f92680a;
                                scope7.getClass();
                                parametersHolder2.getClass();
                                ip.a aVar5 = (ip.a) parametersHolder2.get(0);
                                hl.a aVar6 = (hl.a) parametersHolder2.get(1);
                                if (aVar6 == null) {
                                    aVar6 = hl.a.c.f84256b;
                                }
                                if (p005kotlin.jvm.internal.s.g(aVar6, hl.a.c.f84256b)) {
                                    iVar3 = (ip.i) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                } else {
                                    if (!(aVar6 instanceof hl.a.b)) {
                                        lc.u0.r();
                                        return null;
                                    }
                                    iVar3 = (ip.i) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                }
                                return aVar5 == null ? new v12.e(iVar3, aVar6, hl.b.a(aVar6)) : new v12.i(aVar5, aVar6, hl.b.a(aVar6));
                            case 12:
                                d dVar2 = d.f92697a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.f();
                            case 13:
                                e eVar2 = e.f92711a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.g();
                            case 14:
                                f fVar2 = f.f92723a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.h();
                            case 15:
                                Scope scope8 = (Scope) obj2;
                                g gVar2 = g.f92757a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.i(ModuleExtKt.androidContext(scope8));
                            case 16:
                                h hVar2 = h.f92773a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.j();
                            case 17:
                                i iVar4 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new AudioPromptsService.d();
                            case 18:
                                i iVar5 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new nu.g();
                            case 19:
                                i iVar6 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.k();
                            case 20:
                                i iVar7 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.k();
                            case 21:
                                j jVar2 = j.f92799a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ec0.g();
                            case 22:
                                Scope scope9 = (Scope) obj2;
                                k kVar2 = k.f92814a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var6 = p005kotlin.jvm.internal.s0.f105811a;
                                return new l((k12.a) scope9.get((k23.d<?>) t0Var6.b(k12.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (cl0.b) scope9.get((k23.d<?>) t0Var6.b(cl0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                m mVar2 = m.f92840a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (su.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, su.a.class, new c83.h.a[0], null, null, null, 120);
                            case 24:
                                Scope scope10 = (Scope) obj2;
                                m mVar3 = m.f92840a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var7 = p005kotlin.jvm.internal.s0.f105811a;
                                return new yu.c((su.a) scope10.get((k23.d<?>) t0Var7.b(su.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zy0.b) scope10.get((k23.d<?>) t0Var7.b(zy0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                Scope scope11 = (Scope) obj2;
                                o oVar2 = o.f92864a;
                                scope11.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.q1(ModuleExtKt.androidContext(scope11), (f12.b) scope11.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                Scope scope12 = (Scope) obj2;
                                o oVar3 = o.f92864a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new pd0.a(ModuleExtKt.androidContext(scope12), (f12.l) scope12.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 27:
                                o oVar4 = o.f92864a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.h5(dv.m.a.a(dv.m.f61336b));
                            case 28:
                                Scope scope13 = (Scope) obj2;
                                o oVar5 = o.f92864a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                k12.d dVarA = k12.d.a.a(k12.d.f102315g);
                                m12.k kVar3 = new m12.k(null, 1, null);
                                p005kotlin.jvm.internal.t0 t0Var8 = p005kotlin.jvm.internal.s0.f105811a;
                                return new qd0.b(dVarA, kVar3, (f12.b) scope13.get((k23.d<?>) t0Var8.b(f12.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (f12.l) scope13.get((k23.d<?>) t0Var8.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                o oVar6 = o.f92864a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new nd0.e();
                        }
                    }
                }, kind5, j0Var5), module12));
                final int i57 = 28;
                new KoinDefinition(module12, e5.n(new BeanDefinition(companion5.getRootScopeQualifier(), t0Var5.b(v90.d.class), null, new p() { // from class: id0.a
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        ip.i iVar2;
                        ip.i iVar3;
                        switch (i57) {
                            case 0:
                                Scope scope = (Scope) obj2;
                                b bVar7 = b.f92665a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new bs.b((Context) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(Context.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                b bVar8 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new so.c();
                            case 2:
                                b bVar9 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ro.a();
                            case 3:
                                b bVar10 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new qo.a();
                            case 4:
                                b bVar11 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ro1.o0();
                            case 5:
                                Scope scope2 = (Scope) obj2;
                                b bVar12 = b.f92665a;
                                scope2.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zp.b((am.b2) scope2.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(am.b2.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                c cVar2 = c.f92680a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (am.b2) ez0.b.a(ez0.b.f67468a, ez0.c.GC, am.b2.class, new c83.h.a[0], null, null, null, 120);
                            case 7:
                                Scope scope3 = (Scope) obj2;
                                c cVar3 = c.f92680a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ip.f((am.b2) scope3.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(am.b2.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 8:
                                Scope scope4 = (Scope) obj2;
                                c cVar4 = c.f92680a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ip.l((am.b2) scope4.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(am.b2.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                Scope scope5 = (Scope) obj2;
                                c cVar5 = c.f92680a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.b((ip.f) scope5.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                Scope scope6 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                c cVar6 = c.f92680a;
                                scope6.getClass();
                                parametersHolder.getClass();
                                Object obj4 = (hl.a) parametersHolder.get(1);
                                if (obj4 == null) {
                                    obj4 = hl.a.c.f84256b;
                                }
                                if (p005kotlin.jvm.internal.s.g(obj4, hl.a.c.f84256b)) {
                                    iVar2 = (ip.i) scope6.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                } else {
                                    if (!(obj4 instanceof hl.a.b)) {
                                        lc.u0.r();
                                        return null;
                                    }
                                    iVar2 = (ip.i) scope6.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                }
                                return new v12.p(iVar2, (List) parametersHolder.get(0));
                            case 11:
                                Scope scope7 = (Scope) obj2;
                                ParametersHolder parametersHolder2 = (ParametersHolder) obj3;
                                c cVar7 = c.f92680a;
                                scope7.getClass();
                                parametersHolder2.getClass();
                                ip.a aVar5 = (ip.a) parametersHolder2.get(0);
                                hl.a aVar6 = (hl.a) parametersHolder2.get(1);
                                if (aVar6 == null) {
                                    aVar6 = hl.a.c.f84256b;
                                }
                                if (p005kotlin.jvm.internal.s.g(aVar6, hl.a.c.f84256b)) {
                                    iVar3 = (ip.i) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                } else {
                                    if (!(aVar6 instanceof hl.a.b)) {
                                        lc.u0.r();
                                        return null;
                                    }
                                    iVar3 = (ip.i) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                }
                                return aVar5 == null ? new v12.e(iVar3, aVar6, hl.b.a(aVar6)) : new v12.i(aVar5, aVar6, hl.b.a(aVar6));
                            case 12:
                                d dVar2 = d.f92697a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.f();
                            case 13:
                                e eVar2 = e.f92711a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.g();
                            case 14:
                                f fVar2 = f.f92723a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.h();
                            case 15:
                                Scope scope8 = (Scope) obj2;
                                g gVar2 = g.f92757a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.i(ModuleExtKt.androidContext(scope8));
                            case 16:
                                h hVar2 = h.f92773a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.j();
                            case 17:
                                i iVar4 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new AudioPromptsService.d();
                            case 18:
                                i iVar5 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new nu.g();
                            case 19:
                                i iVar6 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.k();
                            case 20:
                                i iVar7 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.k();
                            case 21:
                                j jVar2 = j.f92799a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ec0.g();
                            case 22:
                                Scope scope9 = (Scope) obj2;
                                k kVar2 = k.f92814a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var6 = p005kotlin.jvm.internal.s0.f105811a;
                                return new l((k12.a) scope9.get((k23.d<?>) t0Var6.b(k12.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (cl0.b) scope9.get((k23.d<?>) t0Var6.b(cl0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                m mVar2 = m.f92840a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (su.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, su.a.class, new c83.h.a[0], null, null, null, 120);
                            case 24:
                                Scope scope10 = (Scope) obj2;
                                m mVar3 = m.f92840a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var7 = p005kotlin.jvm.internal.s0.f105811a;
                                return new yu.c((su.a) scope10.get((k23.d<?>) t0Var7.b(su.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zy0.b) scope10.get((k23.d<?>) t0Var7.b(zy0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                Scope scope11 = (Scope) obj2;
                                o oVar2 = o.f92864a;
                                scope11.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.q1(ModuleExtKt.androidContext(scope11), (f12.b) scope11.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                Scope scope12 = (Scope) obj2;
                                o oVar3 = o.f92864a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new pd0.a(ModuleExtKt.androidContext(scope12), (f12.l) scope12.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 27:
                                o oVar4 = o.f92864a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.h5(dv.m.a.a(dv.m.f61336b));
                            case 28:
                                Scope scope13 = (Scope) obj2;
                                o oVar5 = o.f92864a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                k12.d dVarA = k12.d.a.a(k12.d.f102315g);
                                m12.k kVar3 = new m12.k(null, 1, null);
                                p005kotlin.jvm.internal.t0 t0Var8 = p005kotlin.jvm.internal.s0.f105811a;
                                return new qd0.b(dVarA, kVar3, (f12.b) scope13.get((k23.d<?>) t0Var8.b(f12.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (f12.l) scope13.get((k23.d<?>) t0Var8.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                o oVar6 = o.f92864a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new nd0.e();
                        }
                    }
                }, kind5, j0Var5), module12));
                final int i58 = 29;
                new KoinDefinition(module12, e5.n(new BeanDefinition(companion5.getRootScopeQualifier(), t0Var5.b(w90.a.class), null, new p() { // from class: id0.a
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        ip.i iVar2;
                        ip.i iVar3;
                        switch (i58) {
                            case 0:
                                Scope scope = (Scope) obj2;
                                b bVar7 = b.f92665a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new bs.b((Context) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(Context.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                b bVar8 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new so.c();
                            case 2:
                                b bVar9 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ro.a();
                            case 3:
                                b bVar10 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new qo.a();
                            case 4:
                                b bVar11 = b.f92665a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ro1.o0();
                            case 5:
                                Scope scope2 = (Scope) obj2;
                                b bVar12 = b.f92665a;
                                scope2.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zp.b((am.b2) scope2.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(am.b2.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                c cVar2 = c.f92680a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (am.b2) ez0.b.a(ez0.b.f67468a, ez0.c.GC, am.b2.class, new c83.h.a[0], null, null, null, 120);
                            case 7:
                                Scope scope3 = (Scope) obj2;
                                c cVar3 = c.f92680a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ip.f((am.b2) scope3.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(am.b2.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 8:
                                Scope scope4 = (Scope) obj2;
                                c cVar4 = c.f92680a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ip.l((am.b2) scope4.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(am.b2.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                Scope scope5 = (Scope) obj2;
                                c cVar5 = c.f92680a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.b((ip.f) scope5.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                Scope scope6 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                c cVar6 = c.f92680a;
                                scope6.getClass();
                                parametersHolder.getClass();
                                Object obj4 = (hl.a) parametersHolder.get(1);
                                if (obj4 == null) {
                                    obj4 = hl.a.c.f84256b;
                                }
                                if (p005kotlin.jvm.internal.s.g(obj4, hl.a.c.f84256b)) {
                                    iVar2 = (ip.i) scope6.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                } else {
                                    if (!(obj4 instanceof hl.a.b)) {
                                        lc.u0.r();
                                        return null;
                                    }
                                    iVar2 = (ip.i) scope6.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                }
                                return new v12.p(iVar2, (List) parametersHolder.get(0));
                            case 11:
                                Scope scope7 = (Scope) obj2;
                                ParametersHolder parametersHolder2 = (ParametersHolder) obj3;
                                c cVar7 = c.f92680a;
                                scope7.getClass();
                                parametersHolder2.getClass();
                                ip.a aVar5 = (ip.a) parametersHolder2.get(0);
                                hl.a aVar6 = (hl.a) parametersHolder2.get(1);
                                if (aVar6 == null) {
                                    aVar6 = hl.a.c.f84256b;
                                }
                                if (p005kotlin.jvm.internal.s.g(aVar6, hl.a.c.f84256b)) {
                                    iVar3 = (ip.i) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                } else {
                                    if (!(aVar6 instanceof hl.a.b)) {
                                        lc.u0.r();
                                        return null;
                                    }
                                    iVar3 = (ip.i) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ip.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                                }
                                return aVar5 == null ? new v12.e(iVar3, aVar6, hl.b.a(aVar6)) : new v12.i(aVar5, aVar6, hl.b.a(aVar6));
                            case 12:
                                d dVar2 = d.f92697a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.f();
                            case 13:
                                e eVar2 = e.f92711a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.g();
                            case 14:
                                f fVar2 = f.f92723a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.h();
                            case 15:
                                Scope scope8 = (Scope) obj2;
                                g gVar2 = g.f92757a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.i(ModuleExtKt.androidContext(scope8));
                            case 16:
                                h hVar2 = h.f92773a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.j();
                            case 17:
                                i iVar4 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new AudioPromptsService.d();
                            case 18:
                                i iVar5 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new nu.g();
                            case 19:
                                i iVar6 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.k();
                            case 20:
                                i iVar7 = i.f92786a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.k();
                            case 21:
                                j jVar2 = j.f92799a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new ec0.g();
                            case 22:
                                Scope scope9 = (Scope) obj2;
                                k kVar2 = k.f92814a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var6 = p005kotlin.jvm.internal.s0.f105811a;
                                return new l((k12.a) scope9.get((k23.d<?>) t0Var6.b(k12.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (cl0.b) scope9.get((k23.d<?>) t0Var6.b(cl0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                m mVar2 = m.f92840a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (su.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, su.a.class, new c83.h.a[0], null, null, null, 120);
                            case 24:
                                Scope scope10 = (Scope) obj2;
                                m mVar3 = m.f92840a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var7 = p005kotlin.jvm.internal.s0.f105811a;
                                return new yu.c((su.a) scope10.get((k23.d<?>) t0Var7.b(su.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zy0.b) scope10.get((k23.d<?>) t0Var7.b(zy0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                Scope scope11 = (Scope) obj2;
                                o oVar2 = o.f92864a;
                                scope11.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.q1(ModuleExtKt.androidContext(scope11), (f12.b) scope11.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                Scope scope12 = (Scope) obj2;
                                o oVar3 = o.f92864a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new pd0.a(ModuleExtKt.androidContext(scope12), (f12.l) scope12.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 27:
                                o oVar4 = o.f92864a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.h5(dv.m.a.a(dv.m.f61336b));
                            case 28:
                                Scope scope13 = (Scope) obj2;
                                o oVar5 = o.f92864a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                k12.d dVarA = k12.d.a.a(k12.d.f102315g);
                                m12.k kVar3 = new m12.k(null, 1, null);
                                p005kotlin.jvm.internal.t0 t0Var8 = p005kotlin.jvm.internal.s0.f105811a;
                                return new qd0.b(dVarA, kVar3, (f12.b) scope13.get((k23.d<?>) t0Var8.b(f12.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (f12.l) scope13.get((k23.d<?>) t0Var8.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                o oVar6 = o.f92864a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new nd0.e();
                        }
                    }
                }, kind5, j0Var5), module12));
                new KoinDefinition(module12, e5.n(new BeanDefinition(companion5.getRootScopeQualifier(), t0Var5.b(y90.d.class), null, new id0.n(0), kind5, j0Var5), module12));
                new KoinDefinition(module12, e5.n(new BeanDefinition(companion5.getRootScopeQualifier(), t0Var5.b(q0.class), null, new id0.n(1), kind5, j0Var5), module12));
                new KoinDefinition(module12, e5.n(new BeanDefinition(companion5.getRootScopeQualifier(), t0Var5.b(i90.a.class), null, new id0.n(2), kind5, j0Var5), module12));
                break;
            case 16:
                Module module13 = (Module) obj;
                id0.p pVar12 = id0.p.f92877a;
                module13.getClass();
                id0.n nVar = new id0.n(3);
                new KoinDefinition(module13, e5.n(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), s0.f105811a.b(nw.a.class), null, nVar, Kind.Factory, j0.f134944a), module13));
                mw.b.f121243a.getClass();
                module13.includes(mw.b.f121244b);
                break;
            case 17:
                Module module14 = (Module) obj;
                q qVar = q.f92889a;
                module14.getClass();
                id0.n nVar2 = new id0.n(4);
                new KoinDefinition(module14, e5.n(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), s0.f105811a.b(fx.a.class), null, nVar2, Kind.Factory, j0.f134944a), module14));
                ex.c.f66912a.getClass();
                module14.includes(ex.c.f66913b);
                break;
            case 18:
                Module module15 = (Module) obj;
                r rVar = r.f92900a;
                module15.getClass();
                id0.n nVar3 = new id0.n(5);
                new KoinDefinition(module15, e5.n(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), s0.f105811a.b(com.garmin.android.apps.connectmobile.s0.class), null, nVar3, Kind.Factory, j0.f134944a), module15));
                break;
            case 19:
                Module module16 = (Module) obj;
                s sVar = s.f92913a;
                module16.getClass();
                id0.n nVar4 = new id0.n(6);
                new KoinDefinition(module16, e5.n(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), s0.f105811a.b(zy0.b.class), null, nVar4, Kind.Factory, j0.f134944a), module16));
                break;
            case 20:
                Module module17 = (Module) obj;
                t tVar = t.f92927a;
                module17.getClass();
                id0.n nVar5 = new id0.n(7);
                new KoinDefinition(module17, e5.n(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), s0.f105811a.b(vx.f.class), null, nVar5, Kind.Factory, j0.f134944a), module17));
                break;
            case 21:
                Module module18 = (Module) obj;
                u uVar = u.f92938a;
                module18.getClass();
                StringQualifier stringQualifierNamed = QualifierKt.named("CampaignHttpClient");
                id0.n nVar6 = new id0.n(8);
                ScopeRegistry.Companion companion6 = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier6 = companion6.getRootScopeQualifier();
                Kind kind6 = Kind.Singleton;
                j0 j0Var6 = j0.f134944a;
                t0 t0Var6 = s0.f105811a;
                SingleInstanceFactory<?> singleInstanceFactoryP = u0.p(new BeanDefinition(rootScopeQualifier6, t0Var6.b(OkHttpClient.class), stringQualifierNamed, nVar6, kind6, j0Var6), module18);
                if (module18.get_createdAtStart()) {
                    module18.prepareForCreationAtStart(singleInstanceFactoryP);
                }
                new KoinDefinition(module18, singleInstanceFactoryP);
                id0.n nVar7 = new id0.n(9);
                StringQualifier rootScopeQualifier7 = companion6.getRootScopeQualifier();
                Kind kind7 = Kind.Factory;
                new KoinDefinition(module18, e5.n(new BeanDefinition(rootScopeQualifier7, t0Var6.b(ff2.b.class), null, nVar7, kind7, j0Var6), module18));
                new KoinDefinition(module18, e5.n(new BeanDefinition(companion6.getRootScopeQualifier(), t0Var6.b(cf2.d.class), null, new id0.n(10), kind7, j0Var6), module18));
                break;
            case 22:
                Module module19 = (Module) obj;
                v vVar = v.f92951a;
                module19.getClass();
                id0.n nVar8 = new id0.n(11);
                new KoinDefinition(module19, e5.n(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), s0.f105811a.b(kt0.a.class), null, nVar8, Kind.Factory, j0.f134944a), module19));
                st0.c.f160846a.getClass();
                module19.includes(st0.c.f160847b);
                break;
            case 23:
                Module module20 = (Module) obj;
                w wVar = w.f92962a;
                module20.getClass();
                id0.n nVar9 = new id0.n(12);
                new KoinDefinition(module20, e5.n(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), s0.f105811a.b(com.garmin.android.apps.connectmobile.t0.class), null, nVar9, Kind.Factory, j0.f134944a), module20));
                break;
            case 24:
                Module module21 = (Module) obj;
                y yVar = y.f92990a;
                module21.getClass();
                id0.n nVar10 = new id0.n(i18);
                ScopeRegistry.Companion companion7 = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier8 = companion7.getRootScopeQualifier();
                Kind kind8 = Kind.Factory;
                j0 j0Var7 = j0.f134944a;
                t0 t0Var7 = s0.f105811a;
                new KoinDefinition(module21, e5.n(new BeanDefinition(rootScopeQualifier8, t0Var7.b(bv.a.class), null, nVar10, kind8, j0Var7), module21));
                new KoinDefinition(module21, e5.n(new BeanDefinition(companion7.getRootScopeQualifier(), t0Var7.b(a20.a.class), null, new id0.n(i17), kind8, j0Var7), module21));
                new KoinDefinition(module21, e5.n(new BeanDefinition(companion7.getRootScopeQualifier(), t0Var7.b(aq1.i.class), null, new id0.n(i16), kind8, j0Var7), module21));
                new KoinDefinition(module21, e5.n(new BeanDefinition(companion7.getRootScopeQualifier(), t0Var7.b(aq1.w.class), null, new id0.n(i15), kind8, j0Var7), module21));
                new KoinDefinition(module21, e5.n(new BeanDefinition(companion7.getRootScopeQualifier(), t0Var7.b(com.garmin.android.apps.connectmobile.startup.e.class), null, new id0.n(i14), kind8, j0Var7), module21));
                new KoinDefinition(module21, e5.n(new BeanDefinition(companion7.getRootScopeQualifier(), t0Var7.b(z1.class), null, new id0.n(18), kind8, j0Var7), module21));
                break;
            case 25:
                Module module22 = (Module) obj;
                z zVar = z.f93002a;
                module22.getClass();
                id0.n nVar11 = new id0.n(i24);
                ScopeRegistry.Companion companion8 = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier9 = companion8.getRootScopeQualifier();
                Kind kind9 = Kind.Factory;
                j0 j0Var8 = j0.f134944a;
                t0 t0Var8 = s0.f105811a;
                new KoinDefinition(module22, e5.n(new BeanDefinition(rootScopeQualifier9, t0Var8.b(f20.v.class), null, nVar11, kind9, j0Var8), module22));
                new KoinDefinition(module22, e5.n(new BeanDefinition(companion8.getRootScopeQualifier(), t0Var8.b(f20.z.class), null, new id0.n(i19), kind9, j0Var8), module22));
                h20.b.f81029a.getClass();
                module22.includes(h20.b.f81030b);
                break;
            case 26:
                Module module23 = (Module) obj;
                a0 a0Var = a0.f92655a;
                module23.getClass();
                id0.n nVar12 = new id0.n(i25);
                new KoinDefinition(module23, e5.n(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), s0.f105811a.b(fo1.e.class), null, nVar12, Kind.Factory, j0.f134944a), module23));
                break;
            case 27:
                Module module24 = (Module) obj;
                b0 b0Var = b0.f92667a;
                module24.getClass();
                id0.n nVar13 = new id0.n(i28);
                ScopeRegistry.Companion companion9 = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier10 = companion9.getRootScopeQualifier();
                Kind kind10 = Kind.Factory;
                j0 j0Var9 = j0.f134944a;
                t0 t0Var9 = s0.f105811a;
                new KoinDefinition(module24, e5.n(new BeanDefinition(rootScopeQualifier10, t0Var9.b(a30.a.class), null, nVar13, kind10, j0Var9), module24));
                new KoinDefinition(module24, e5.n(new BeanDefinition(companion9.getRootScopeQualifier(), t0Var9.b(s20.h.class), null, new id0.n(i27), kind10, j0Var9), module24));
                id0.n nVar14 = new id0.n(i26);
                SingleInstanceFactory<?> singleInstanceFactoryP2 = u0.p(new BeanDefinition(companion9.getRootScopeQualifier(), t0Var9.b(s20.g.class), null, nVar14, Kind.Singleton, j0Var9), module24);
                if (module24.get_createdAtStart()) {
                    module24.prepareForCreationAtStart(singleInstanceFactoryP2);
                }
                new KoinDefinition(module24, singleInstanceFactoryP2);
                break;
            case 28:
                Module module25 = (Module) obj;
                c0 c0Var = c0.f92682a;
                module25.getClass();
                id0.n nVar15 = new id0.n(i29);
                new KoinDefinition(module25, e5.n(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), s0.f105811a.b(h60.b.class), null, nVar15, Kind.Factory, j0.f134944a), module25));
                break;
            default:
                Module module26 = (Module) obj;
                d0 d0Var = d0.f92699a;
                module26.getClass();
                id0.n nVar16 = new id0.n(i34);
                ScopeRegistry.Companion companion10 = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier11 = companion10.getRootScopeQualifier();
                Kind kind11 = Kind.Factory;
                j0 j0Var10 = j0.f134944a;
                t0 t0Var10 = s0.f105811a;
                new KoinDefinition(module26, e5.n(new BeanDefinition(rootScopeQualifier11, t0Var10.b(t60.c.class), null, nVar16, kind11, j0Var10), module26));
                new KoinDefinition(module26, e5.n(new BeanDefinition(companion10.getRootScopeQualifier(), t0Var10.b(t60.h.class), null, new id0.n(i30), kind11, j0Var10), module26));
                break;
        }
        return Unit.INSTANCE;
    }
}
