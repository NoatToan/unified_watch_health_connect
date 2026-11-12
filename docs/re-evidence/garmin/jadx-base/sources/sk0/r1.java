package sk0;

import a22.i;
import c83.h;
import ew0.k;
import ew0.m;
import f12.l;
import gw0.u;
import i3.e5;
import k23.d;
import lt0.f;
import mt0.h4;
import mt0.p3;
import nw0.a0;
import nw0.r;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Kind;
import org.koin.core.definition.KoinDefinition;
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
import pt0.f0;
import pt0.n;
import pt0.o;
import pt0.o0;
import pt0.p;
import pt0.z;
import tv0.g;
import tv0.s;
import tv0.t;
import tv0.v;
import tv0.w;
import yt0.f1;
import yt0.i0;
import yt0.j0;
import yt0.r0;
import yt0.x;
import z10.i3;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class r1 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f159825a;

    public /* synthetic */ r1(int i14) {
        this.f159825a = i14;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        final int i14 = 10;
        final int i15 = 9;
        final int i16 = 8;
        final int i17 = 7;
        final int i18 = 6;
        final int i19 = 5;
        final int i24 = 4;
        final int i25 = 3;
        final int i26 = 2;
        boolean z14 = true;
        final int i27 = 0;
        switch (this.f159825a) {
            case 0:
                ((p5.k0) obj).getClass();
                return Unit.INSTANCE;
            case 1:
                ((Boolean) obj).booleanValue();
                return Unit.INSTANCE;
            case 2:
                Double d14 = (Double) obj;
                return Boolean.valueOf((d14 == null || Double.isNaN(d14.doubleValue())) ? false : true);
            case 3:
                Double d15 = (Double) obj;
                d15.getClass();
                return d15;
            case 4:
                Double d16 = (Double) obj;
                return Boolean.valueOf((d16 == null || Double.isNaN(d16.doubleValue())) ? false : true);
            case 5:
                Double d17 = (Double) obj;
                d17.getClass();
                return d17;
            case 6:
                ps.q0 q0Var = (ps.q0) obj;
                q0Var.getClass();
                Double probability = q0Var.getProbability();
                return Boolean.valueOf((probability != null ? probability.doubleValue() : 0.0d) < 25.0d);
            case 7:
                Module module = (Module) obj;
                st0.a aVar = st0.a.f160843a;
                module.getClass();
                StringQualifier stringQualifierNamed = QualifierKt.named(o70.f.CHALLENGES.a());
                si1.a aVar2 = new si1.a(25);
                ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
                Kind kind = Kind.Factory;
                p13.j0 j0Var = p13.j0.f134944a;
                p005kotlin.jvm.internal.t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
                new KoinDefinition(module, e5.n(new BeanDefinition(rootScopeQualifier, t0Var.b(r70.s.class), stringQualifierNamed, aVar2, kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(r70.r.class), stringQualifierNamed, new si1.a(26), kind, j0Var), module));
                return Unit.INSTANCE;
            case 8:
                Module module2 = (Module) obj;
                st0.c cVar = st0.c.f160846a;
                module2.getClass();
                e23.p pVar = new e23.p() { // from class: st0.b
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i17) {
                            case 0:
                                Scope scope = (Scope) obj2;
                                c cVar2 = c.f160846a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new p3((i) scope.get((d<?>) s0.f105811a.b(i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                Scope scope2 = (Scope) obj2;
                                c cVar3 = c.f160846a;
                                scope2.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new i0((kt0.a) scope2.get((d<?>) s0.f105811a.b(kt0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 2:
                                Scope scope3 = (Scope) obj2;
                                c cVar4 = c.f160846a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var2 = s0.f105811a;
                                return new j0((lt0.d) scope3.get((d<?>) t0Var2.b(lt0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (i0) scope3.get((d<?>) t0Var2.b(i0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                c cVar5 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (lt0.c) ez0.b.a(ez0.b.f67468a, ez0.c.GC, lt0.c.class, new h.a[0], null, null, null, 120);
                            case 4:
                                Scope scope4 = (Scope) obj2;
                                c cVar6 = c.f160846a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var3 = s0.f105811a;
                                return new x((lt0.c) scope4.get((d<?>) t0Var3.b(lt0.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (i0) scope4.get((d<?>) t0Var3.b(i0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 5:
                                c cVar7 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (f) ez0.b.a(ez0.b.f67468a, ez0.c.GC, f.class, new h.a[0], null, null, null, 120);
                            case 6:
                                Scope scope5 = (Scope) obj2;
                                c cVar8 = c.f160846a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var4 = s0.f105811a;
                                return new f1((f) scope5.get((d<?>) t0Var4.b(f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (lt0.d) scope5.get((d<?>) t0Var4.b(lt0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 7:
                                c cVar9 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (lt0.d) ez0.b.a(ez0.b.f67468a, ez0.c.GC, lt0.d.class, new h.a[0], null, null, null, 120);
                            case 8:
                                c cVar10 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (su.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, su.a.class, new h.a[0], null, null, null, 120);
                            case 9:
                                Scope scope6 = (Scope) obj2;
                                c cVar11 = c.f160846a;
                                scope6.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new yt0.a((lt0.a) scope6.get((d<?>) s0.f105811a.b(lt0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                Scope scope7 = (Scope) obj2;
                                c cVar12 = c.f160846a;
                                scope7.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var5 = s0.f105811a;
                                return new f0((yt0.s0) scope7.get((d<?>) t0Var5.b(yt0.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (r0) scope7.get((d<?>) t0Var5.b(r0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                c cVar13 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new o();
                            case 12:
                                c cVar14 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new n();
                            case 13:
                                c cVar15 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new i3(e20.a.C1315a.a(e20.a.f62587b));
                            case 14:
                                Scope scope8 = (Scope) obj2;
                                c cVar16 = c.f160846a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new o0((yt0.s0) scope8.get((d<?>) s0.f105811a.b(yt0.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                Scope scope9 = (Scope) obj2;
                                c cVar17 = c.f160846a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var6 = s0.f105811a;
                                return new z((yt0.s0) scope9.get((d<?>) t0Var6.b(yt0.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (i0) scope9.get((d<?>) t0Var6.b(i0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 16:
                                Scope scope10 = (Scope) obj2;
                                c cVar18 = c.f160846a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new p((r0) scope10.get((d<?>) s0.f105811a.b(r0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 17:
                                Scope scope11 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                c cVar19 = c.f160846a;
                                scope11.getClass();
                                parametersHolder.getClass();
                                return new h4((String) parametersHolder.get(0), (String) parametersHolder.get(1), ((Number) parametersHolder.get(2)).longValue(), (f1) scope11.get((d<?>) s0.f105811a.b(f1.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 18:
                                ParametersHolder parametersHolder2 = (ParametersHolder) obj3;
                                sv0.a aVar3 = sv0.a.f161025a;
                                ((Scope) obj2).getClass();
                                parametersHolder2.getClass();
                                return new dw0.a(new uv0.b((r53.i) parametersHolder2.elementAt(0, s0.f105811a.b(r53.i.class))));
                            case 19:
                                ParametersHolder parametersHolder3 = (ParametersHolder) obj3;
                                sv0.a aVar4 = sv0.a.f161025a;
                                ((Scope) obj2).getClass();
                                parametersHolder3.getClass();
                                return new cw0.a((dw0.a) parametersHolder3.elementAt(0, s0.f105811a.b(dw0.a.class)));
                            case 20:
                                sv0.c cVar20 = sv0.c.f161028a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new tv0.b();
                            case 21:
                                Scope scope12 = (Scope) obj2;
                                sv0.c cVar21 = sv0.c.f161028a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var7 = s0.f105811a;
                                return new v((qv0.a) scope12.get((d<?>) t0Var7.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope12.get((d<?>) t0Var7.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.b) scope12.get((d<?>) t0Var7.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                sv0.c cVar22 = sv0.c.f161028a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (nv0.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, nv0.a.class, new h.a[0], null, null, null, 88);
                            case 23:
                                Scope scope13 = (Scope) obj2;
                                sv0.c cVar23 = sv0.c.f161028a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new t((tv0.b) scope13.get((d<?>) s0.f105811a.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 24:
                                Scope scope14 = (Scope) obj2;
                                sv0.c cVar24 = sv0.c.f161028a;
                                scope14.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var8 = s0.f105811a;
                                return new k((qv0.a) scope14.get((d<?>) t0Var8.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope14.get((d<?>) t0Var8.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                Scope scope15 = (Scope) obj2;
                                sv0.c cVar25 = sv0.c.f161028a;
                                scope15.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var9 = s0.f105811a;
                                return new m((tv0.a) scope15.get((d<?>) t0Var9.b(tv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (w) scope15.get((d<?>) t0Var9.b(w.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.i) scope15.get((d<?>) t0Var9.b(tv0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (s) scope15.get((d<?>) t0Var9.b(s.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.b) scope15.get((d<?>) t0Var9.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (qv0.a) scope15.get((d<?>) t0Var9.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope15.get((d<?>) t0Var9.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (fw0.a) scope15.get((d<?>) t0Var9.b(fw0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                Scope scope16 = (Scope) obj2;
                                ParametersHolder parametersHolder4 = (ParametersHolder) obj3;
                                sv0.c cVar26 = sv0.c.f161028a;
                                scope16.getClass();
                                parametersHolder4.getClass();
                                t0 t0Var10 = s0.f105811a;
                                return new u((rv0.a) scope16.get((d<?>) t0Var10.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (qv0.a) scope16.get((d<?>) t0Var10.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (l) scope16.get((d<?>) t0Var10.b(l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.d) scope16.get((d<?>) t0Var10.b(tv0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (g) scope16.get((d<?>) t0Var10.b(g.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (v) scope16.get((d<?>) t0Var10.b(v.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.f) scope16.get((d<?>) t0Var10.b(tv0.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (b63.o) parametersHolder4.elementAt(0, t0Var10.b(b63.o.class)), (o82.g) parametersHolder4.elementAt(1, t0Var10.b(o82.g.class)));
                            case 27:
                                Scope scope17 = (Scope) obj2;
                                sv0.c cVar27 = sv0.c.f161028a;
                                scope17.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var11 = s0.f105811a;
                                return new a0((tv0.c) scope17.get((d<?>) t0Var11.b(tv0.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (s) scope17.get((d<?>) t0Var11.b(s.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (fw0.a) scope17.get((d<?>) t0Var11.b(fw0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                Scope scope18 = (Scope) obj2;
                                sv0.c cVar28 = sv0.c.f161028a;
                                scope18.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var12 = s0.f105811a;
                                return new r((tv0.a) scope18.get((d<?>) t0Var12.b(tv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (w) scope18.get((d<?>) t0Var12.b(w.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.i) scope18.get((d<?>) t0Var12.b(tv0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (t) scope18.get((d<?>) t0Var12.b(t.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope18.get((d<?>) t0Var12.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                Scope scope19 = (Scope) obj2;
                                sv0.c cVar29 = sv0.c.f161028a;
                                scope19.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var13 = s0.f105811a;
                                return new nw0.g((rv0.a) scope19.get((d<?>) t0Var13.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.d) scope19.get((d<?>) t0Var13.b(tv0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.b) scope19.get((d<?>) t0Var13.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                        }
                    }
                };
                ScopeRegistry.Companion companion2 = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier2 = companion2.getRootScopeQualifier();
                Kind kind2 = Kind.Factory;
                p13.j0 j0Var2 = p13.j0.f134944a;
                p005kotlin.jvm.internal.t0 t0Var2 = p005kotlin.jvm.internal.s0.f105811a;
                new KoinDefinition(module2, e5.n(new BeanDefinition(rootScopeQualifier2, t0Var2.b(lt0.d.class), null, pVar, kind2, j0Var2), module2));
                new KoinDefinition(module2, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(lt0.a.class), null, new si1.a(29), kind2, j0Var2), module2));
                final int i28 = z14 ? 1 : 0;
                new KoinDefinition(module2, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(yt0.i0.class), null, new e23.p() { // from class: st0.b
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i28) {
                            case 0:
                                Scope scope = (Scope) obj2;
                                c cVar2 = c.f160846a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new p3((i) scope.get((d<?>) s0.f105811a.b(i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                Scope scope2 = (Scope) obj2;
                                c cVar3 = c.f160846a;
                                scope2.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new i0((kt0.a) scope2.get((d<?>) s0.f105811a.b(kt0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 2:
                                Scope scope3 = (Scope) obj2;
                                c cVar4 = c.f160846a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var3 = s0.f105811a;
                                return new j0((lt0.d) scope3.get((d<?>) t0Var3.b(lt0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (i0) scope3.get((d<?>) t0Var3.b(i0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                c cVar5 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (lt0.c) ez0.b.a(ez0.b.f67468a, ez0.c.GC, lt0.c.class, new h.a[0], null, null, null, 120);
                            case 4:
                                Scope scope4 = (Scope) obj2;
                                c cVar6 = c.f160846a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var4 = s0.f105811a;
                                return new x((lt0.c) scope4.get((d<?>) t0Var4.b(lt0.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (i0) scope4.get((d<?>) t0Var4.b(i0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 5:
                                c cVar7 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (f) ez0.b.a(ez0.b.f67468a, ez0.c.GC, f.class, new h.a[0], null, null, null, 120);
                            case 6:
                                Scope scope5 = (Scope) obj2;
                                c cVar8 = c.f160846a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var5 = s0.f105811a;
                                return new f1((f) scope5.get((d<?>) t0Var5.b(f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (lt0.d) scope5.get((d<?>) t0Var5.b(lt0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 7:
                                c cVar9 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (lt0.d) ez0.b.a(ez0.b.f67468a, ez0.c.GC, lt0.d.class, new h.a[0], null, null, null, 120);
                            case 8:
                                c cVar10 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (su.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, su.a.class, new h.a[0], null, null, null, 120);
                            case 9:
                                Scope scope6 = (Scope) obj2;
                                c cVar11 = c.f160846a;
                                scope6.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new yt0.a((lt0.a) scope6.get((d<?>) s0.f105811a.b(lt0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                Scope scope7 = (Scope) obj2;
                                c cVar12 = c.f160846a;
                                scope7.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var6 = s0.f105811a;
                                return new f0((yt0.s0) scope7.get((d<?>) t0Var6.b(yt0.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (r0) scope7.get((d<?>) t0Var6.b(r0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                c cVar13 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new o();
                            case 12:
                                c cVar14 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new n();
                            case 13:
                                c cVar15 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new i3(e20.a.C1315a.a(e20.a.f62587b));
                            case 14:
                                Scope scope8 = (Scope) obj2;
                                c cVar16 = c.f160846a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new o0((yt0.s0) scope8.get((d<?>) s0.f105811a.b(yt0.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                Scope scope9 = (Scope) obj2;
                                c cVar17 = c.f160846a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var7 = s0.f105811a;
                                return new z((yt0.s0) scope9.get((d<?>) t0Var7.b(yt0.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (i0) scope9.get((d<?>) t0Var7.b(i0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 16:
                                Scope scope10 = (Scope) obj2;
                                c cVar18 = c.f160846a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new p((r0) scope10.get((d<?>) s0.f105811a.b(r0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 17:
                                Scope scope11 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                c cVar19 = c.f160846a;
                                scope11.getClass();
                                parametersHolder.getClass();
                                return new h4((String) parametersHolder.get(0), (String) parametersHolder.get(1), ((Number) parametersHolder.get(2)).longValue(), (f1) scope11.get((d<?>) s0.f105811a.b(f1.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 18:
                                ParametersHolder parametersHolder2 = (ParametersHolder) obj3;
                                sv0.a aVar3 = sv0.a.f161025a;
                                ((Scope) obj2).getClass();
                                parametersHolder2.getClass();
                                return new dw0.a(new uv0.b((r53.i) parametersHolder2.elementAt(0, s0.f105811a.b(r53.i.class))));
                            case 19:
                                ParametersHolder parametersHolder3 = (ParametersHolder) obj3;
                                sv0.a aVar4 = sv0.a.f161025a;
                                ((Scope) obj2).getClass();
                                parametersHolder3.getClass();
                                return new cw0.a((dw0.a) parametersHolder3.elementAt(0, s0.f105811a.b(dw0.a.class)));
                            case 20:
                                sv0.c cVar20 = sv0.c.f161028a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new tv0.b();
                            case 21:
                                Scope scope12 = (Scope) obj2;
                                sv0.c cVar21 = sv0.c.f161028a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var8 = s0.f105811a;
                                return new v((qv0.a) scope12.get((d<?>) t0Var8.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope12.get((d<?>) t0Var8.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.b) scope12.get((d<?>) t0Var8.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                sv0.c cVar22 = sv0.c.f161028a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (nv0.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, nv0.a.class, new h.a[0], null, null, null, 88);
                            case 23:
                                Scope scope13 = (Scope) obj2;
                                sv0.c cVar23 = sv0.c.f161028a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new t((tv0.b) scope13.get((d<?>) s0.f105811a.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 24:
                                Scope scope14 = (Scope) obj2;
                                sv0.c cVar24 = sv0.c.f161028a;
                                scope14.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var9 = s0.f105811a;
                                return new k((qv0.a) scope14.get((d<?>) t0Var9.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope14.get((d<?>) t0Var9.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                Scope scope15 = (Scope) obj2;
                                sv0.c cVar25 = sv0.c.f161028a;
                                scope15.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var10 = s0.f105811a;
                                return new m((tv0.a) scope15.get((d<?>) t0Var10.b(tv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (w) scope15.get((d<?>) t0Var10.b(w.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.i) scope15.get((d<?>) t0Var10.b(tv0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (s) scope15.get((d<?>) t0Var10.b(s.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.b) scope15.get((d<?>) t0Var10.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (qv0.a) scope15.get((d<?>) t0Var10.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope15.get((d<?>) t0Var10.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (fw0.a) scope15.get((d<?>) t0Var10.b(fw0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                Scope scope16 = (Scope) obj2;
                                ParametersHolder parametersHolder4 = (ParametersHolder) obj3;
                                sv0.c cVar26 = sv0.c.f161028a;
                                scope16.getClass();
                                parametersHolder4.getClass();
                                t0 t0Var11 = s0.f105811a;
                                return new u((rv0.a) scope16.get((d<?>) t0Var11.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (qv0.a) scope16.get((d<?>) t0Var11.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (l) scope16.get((d<?>) t0Var11.b(l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.d) scope16.get((d<?>) t0Var11.b(tv0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (g) scope16.get((d<?>) t0Var11.b(g.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (v) scope16.get((d<?>) t0Var11.b(v.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.f) scope16.get((d<?>) t0Var11.b(tv0.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (b63.o) parametersHolder4.elementAt(0, t0Var11.b(b63.o.class)), (o82.g) parametersHolder4.elementAt(1, t0Var11.b(o82.g.class)));
                            case 27:
                                Scope scope17 = (Scope) obj2;
                                sv0.c cVar27 = sv0.c.f161028a;
                                scope17.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var12 = s0.f105811a;
                                return new a0((tv0.c) scope17.get((d<?>) t0Var12.b(tv0.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (s) scope17.get((d<?>) t0Var12.b(s.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (fw0.a) scope17.get((d<?>) t0Var12.b(fw0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                Scope scope18 = (Scope) obj2;
                                sv0.c cVar28 = sv0.c.f161028a;
                                scope18.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var13 = s0.f105811a;
                                return new r((tv0.a) scope18.get((d<?>) t0Var13.b(tv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (w) scope18.get((d<?>) t0Var13.b(w.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.i) scope18.get((d<?>) t0Var13.b(tv0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (t) scope18.get((d<?>) t0Var13.b(t.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope18.get((d<?>) t0Var13.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                Scope scope19 = (Scope) obj2;
                                sv0.c cVar29 = sv0.c.f161028a;
                                scope19.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var14 = s0.f105811a;
                                return new nw0.g((rv0.a) scope19.get((d<?>) t0Var14.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.d) scope19.get((d<?>) t0Var14.b(tv0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.b) scope19.get((d<?>) t0Var14.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                        }
                    }
                }, kind2, j0Var2), module2));
                new KoinDefinition(module2, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(yt0.s0.class), null, new e23.p() { // from class: st0.b
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i26) {
                            case 0:
                                Scope scope = (Scope) obj2;
                                c cVar2 = c.f160846a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new p3((i) scope.get((d<?>) s0.f105811a.b(i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                Scope scope2 = (Scope) obj2;
                                c cVar3 = c.f160846a;
                                scope2.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new i0((kt0.a) scope2.get((d<?>) s0.f105811a.b(kt0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 2:
                                Scope scope3 = (Scope) obj2;
                                c cVar4 = c.f160846a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var3 = s0.f105811a;
                                return new j0((lt0.d) scope3.get((d<?>) t0Var3.b(lt0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (i0) scope3.get((d<?>) t0Var3.b(i0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                c cVar5 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (lt0.c) ez0.b.a(ez0.b.f67468a, ez0.c.GC, lt0.c.class, new h.a[0], null, null, null, 120);
                            case 4:
                                Scope scope4 = (Scope) obj2;
                                c cVar6 = c.f160846a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var4 = s0.f105811a;
                                return new x((lt0.c) scope4.get((d<?>) t0Var4.b(lt0.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (i0) scope4.get((d<?>) t0Var4.b(i0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 5:
                                c cVar7 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (f) ez0.b.a(ez0.b.f67468a, ez0.c.GC, f.class, new h.a[0], null, null, null, 120);
                            case 6:
                                Scope scope5 = (Scope) obj2;
                                c cVar8 = c.f160846a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var5 = s0.f105811a;
                                return new f1((f) scope5.get((d<?>) t0Var5.b(f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (lt0.d) scope5.get((d<?>) t0Var5.b(lt0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 7:
                                c cVar9 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (lt0.d) ez0.b.a(ez0.b.f67468a, ez0.c.GC, lt0.d.class, new h.a[0], null, null, null, 120);
                            case 8:
                                c cVar10 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (su.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, su.a.class, new h.a[0], null, null, null, 120);
                            case 9:
                                Scope scope6 = (Scope) obj2;
                                c cVar11 = c.f160846a;
                                scope6.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new yt0.a((lt0.a) scope6.get((d<?>) s0.f105811a.b(lt0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                Scope scope7 = (Scope) obj2;
                                c cVar12 = c.f160846a;
                                scope7.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var6 = s0.f105811a;
                                return new f0((yt0.s0) scope7.get((d<?>) t0Var6.b(yt0.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (r0) scope7.get((d<?>) t0Var6.b(r0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                c cVar13 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new o();
                            case 12:
                                c cVar14 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new n();
                            case 13:
                                c cVar15 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new i3(e20.a.C1315a.a(e20.a.f62587b));
                            case 14:
                                Scope scope8 = (Scope) obj2;
                                c cVar16 = c.f160846a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new o0((yt0.s0) scope8.get((d<?>) s0.f105811a.b(yt0.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                Scope scope9 = (Scope) obj2;
                                c cVar17 = c.f160846a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var7 = s0.f105811a;
                                return new z((yt0.s0) scope9.get((d<?>) t0Var7.b(yt0.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (i0) scope9.get((d<?>) t0Var7.b(i0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 16:
                                Scope scope10 = (Scope) obj2;
                                c cVar18 = c.f160846a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new p((r0) scope10.get((d<?>) s0.f105811a.b(r0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 17:
                                Scope scope11 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                c cVar19 = c.f160846a;
                                scope11.getClass();
                                parametersHolder.getClass();
                                return new h4((String) parametersHolder.get(0), (String) parametersHolder.get(1), ((Number) parametersHolder.get(2)).longValue(), (f1) scope11.get((d<?>) s0.f105811a.b(f1.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 18:
                                ParametersHolder parametersHolder2 = (ParametersHolder) obj3;
                                sv0.a aVar3 = sv0.a.f161025a;
                                ((Scope) obj2).getClass();
                                parametersHolder2.getClass();
                                return new dw0.a(new uv0.b((r53.i) parametersHolder2.elementAt(0, s0.f105811a.b(r53.i.class))));
                            case 19:
                                ParametersHolder parametersHolder3 = (ParametersHolder) obj3;
                                sv0.a aVar4 = sv0.a.f161025a;
                                ((Scope) obj2).getClass();
                                parametersHolder3.getClass();
                                return new cw0.a((dw0.a) parametersHolder3.elementAt(0, s0.f105811a.b(dw0.a.class)));
                            case 20:
                                sv0.c cVar20 = sv0.c.f161028a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new tv0.b();
                            case 21:
                                Scope scope12 = (Scope) obj2;
                                sv0.c cVar21 = sv0.c.f161028a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var8 = s0.f105811a;
                                return new v((qv0.a) scope12.get((d<?>) t0Var8.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope12.get((d<?>) t0Var8.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.b) scope12.get((d<?>) t0Var8.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                sv0.c cVar22 = sv0.c.f161028a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (nv0.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, nv0.a.class, new h.a[0], null, null, null, 88);
                            case 23:
                                Scope scope13 = (Scope) obj2;
                                sv0.c cVar23 = sv0.c.f161028a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new t((tv0.b) scope13.get((d<?>) s0.f105811a.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 24:
                                Scope scope14 = (Scope) obj2;
                                sv0.c cVar24 = sv0.c.f161028a;
                                scope14.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var9 = s0.f105811a;
                                return new k((qv0.a) scope14.get((d<?>) t0Var9.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope14.get((d<?>) t0Var9.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                Scope scope15 = (Scope) obj2;
                                sv0.c cVar25 = sv0.c.f161028a;
                                scope15.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var10 = s0.f105811a;
                                return new m((tv0.a) scope15.get((d<?>) t0Var10.b(tv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (w) scope15.get((d<?>) t0Var10.b(w.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.i) scope15.get((d<?>) t0Var10.b(tv0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (s) scope15.get((d<?>) t0Var10.b(s.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.b) scope15.get((d<?>) t0Var10.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (qv0.a) scope15.get((d<?>) t0Var10.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope15.get((d<?>) t0Var10.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (fw0.a) scope15.get((d<?>) t0Var10.b(fw0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                Scope scope16 = (Scope) obj2;
                                ParametersHolder parametersHolder4 = (ParametersHolder) obj3;
                                sv0.c cVar26 = sv0.c.f161028a;
                                scope16.getClass();
                                parametersHolder4.getClass();
                                t0 t0Var11 = s0.f105811a;
                                return new u((rv0.a) scope16.get((d<?>) t0Var11.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (qv0.a) scope16.get((d<?>) t0Var11.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (l) scope16.get((d<?>) t0Var11.b(l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.d) scope16.get((d<?>) t0Var11.b(tv0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (g) scope16.get((d<?>) t0Var11.b(g.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (v) scope16.get((d<?>) t0Var11.b(v.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.f) scope16.get((d<?>) t0Var11.b(tv0.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (b63.o) parametersHolder4.elementAt(0, t0Var11.b(b63.o.class)), (o82.g) parametersHolder4.elementAt(1, t0Var11.b(o82.g.class)));
                            case 27:
                                Scope scope17 = (Scope) obj2;
                                sv0.c cVar27 = sv0.c.f161028a;
                                scope17.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var12 = s0.f105811a;
                                return new a0((tv0.c) scope17.get((d<?>) t0Var12.b(tv0.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (s) scope17.get((d<?>) t0Var12.b(s.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (fw0.a) scope17.get((d<?>) t0Var12.b(fw0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                Scope scope18 = (Scope) obj2;
                                sv0.c cVar28 = sv0.c.f161028a;
                                scope18.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var13 = s0.f105811a;
                                return new r((tv0.a) scope18.get((d<?>) t0Var13.b(tv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (w) scope18.get((d<?>) t0Var13.b(w.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.i) scope18.get((d<?>) t0Var13.b(tv0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (t) scope18.get((d<?>) t0Var13.b(t.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope18.get((d<?>) t0Var13.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                Scope scope19 = (Scope) obj2;
                                sv0.c cVar29 = sv0.c.f161028a;
                                scope19.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var14 = s0.f105811a;
                                return new nw0.g((rv0.a) scope19.get((d<?>) t0Var14.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.d) scope19.get((d<?>) t0Var14.b(tv0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.b) scope19.get((d<?>) t0Var14.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                        }
                    }
                }, kind2, j0Var2), module2));
                new KoinDefinition(module2, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(lt0.c.class), null, new e23.p() { // from class: st0.b
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i25) {
                            case 0:
                                Scope scope = (Scope) obj2;
                                c cVar2 = c.f160846a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new p3((i) scope.get((d<?>) s0.f105811a.b(i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                Scope scope2 = (Scope) obj2;
                                c cVar3 = c.f160846a;
                                scope2.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new i0((kt0.a) scope2.get((d<?>) s0.f105811a.b(kt0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 2:
                                Scope scope3 = (Scope) obj2;
                                c cVar4 = c.f160846a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var3 = s0.f105811a;
                                return new j0((lt0.d) scope3.get((d<?>) t0Var3.b(lt0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (i0) scope3.get((d<?>) t0Var3.b(i0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                c cVar5 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (lt0.c) ez0.b.a(ez0.b.f67468a, ez0.c.GC, lt0.c.class, new h.a[0], null, null, null, 120);
                            case 4:
                                Scope scope4 = (Scope) obj2;
                                c cVar6 = c.f160846a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var4 = s0.f105811a;
                                return new x((lt0.c) scope4.get((d<?>) t0Var4.b(lt0.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (i0) scope4.get((d<?>) t0Var4.b(i0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 5:
                                c cVar7 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (f) ez0.b.a(ez0.b.f67468a, ez0.c.GC, f.class, new h.a[0], null, null, null, 120);
                            case 6:
                                Scope scope5 = (Scope) obj2;
                                c cVar8 = c.f160846a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var5 = s0.f105811a;
                                return new f1((f) scope5.get((d<?>) t0Var5.b(f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (lt0.d) scope5.get((d<?>) t0Var5.b(lt0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 7:
                                c cVar9 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (lt0.d) ez0.b.a(ez0.b.f67468a, ez0.c.GC, lt0.d.class, new h.a[0], null, null, null, 120);
                            case 8:
                                c cVar10 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (su.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, su.a.class, new h.a[0], null, null, null, 120);
                            case 9:
                                Scope scope6 = (Scope) obj2;
                                c cVar11 = c.f160846a;
                                scope6.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new yt0.a((lt0.a) scope6.get((d<?>) s0.f105811a.b(lt0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                Scope scope7 = (Scope) obj2;
                                c cVar12 = c.f160846a;
                                scope7.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var6 = s0.f105811a;
                                return new f0((yt0.s0) scope7.get((d<?>) t0Var6.b(yt0.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (r0) scope7.get((d<?>) t0Var6.b(r0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                c cVar13 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new o();
                            case 12:
                                c cVar14 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new n();
                            case 13:
                                c cVar15 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new i3(e20.a.C1315a.a(e20.a.f62587b));
                            case 14:
                                Scope scope8 = (Scope) obj2;
                                c cVar16 = c.f160846a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new o0((yt0.s0) scope8.get((d<?>) s0.f105811a.b(yt0.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                Scope scope9 = (Scope) obj2;
                                c cVar17 = c.f160846a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var7 = s0.f105811a;
                                return new z((yt0.s0) scope9.get((d<?>) t0Var7.b(yt0.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (i0) scope9.get((d<?>) t0Var7.b(i0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 16:
                                Scope scope10 = (Scope) obj2;
                                c cVar18 = c.f160846a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new p((r0) scope10.get((d<?>) s0.f105811a.b(r0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 17:
                                Scope scope11 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                c cVar19 = c.f160846a;
                                scope11.getClass();
                                parametersHolder.getClass();
                                return new h4((String) parametersHolder.get(0), (String) parametersHolder.get(1), ((Number) parametersHolder.get(2)).longValue(), (f1) scope11.get((d<?>) s0.f105811a.b(f1.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 18:
                                ParametersHolder parametersHolder2 = (ParametersHolder) obj3;
                                sv0.a aVar3 = sv0.a.f161025a;
                                ((Scope) obj2).getClass();
                                parametersHolder2.getClass();
                                return new dw0.a(new uv0.b((r53.i) parametersHolder2.elementAt(0, s0.f105811a.b(r53.i.class))));
                            case 19:
                                ParametersHolder parametersHolder3 = (ParametersHolder) obj3;
                                sv0.a aVar4 = sv0.a.f161025a;
                                ((Scope) obj2).getClass();
                                parametersHolder3.getClass();
                                return new cw0.a((dw0.a) parametersHolder3.elementAt(0, s0.f105811a.b(dw0.a.class)));
                            case 20:
                                sv0.c cVar20 = sv0.c.f161028a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new tv0.b();
                            case 21:
                                Scope scope12 = (Scope) obj2;
                                sv0.c cVar21 = sv0.c.f161028a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var8 = s0.f105811a;
                                return new v((qv0.a) scope12.get((d<?>) t0Var8.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope12.get((d<?>) t0Var8.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.b) scope12.get((d<?>) t0Var8.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                sv0.c cVar22 = sv0.c.f161028a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (nv0.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, nv0.a.class, new h.a[0], null, null, null, 88);
                            case 23:
                                Scope scope13 = (Scope) obj2;
                                sv0.c cVar23 = sv0.c.f161028a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new t((tv0.b) scope13.get((d<?>) s0.f105811a.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 24:
                                Scope scope14 = (Scope) obj2;
                                sv0.c cVar24 = sv0.c.f161028a;
                                scope14.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var9 = s0.f105811a;
                                return new k((qv0.a) scope14.get((d<?>) t0Var9.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope14.get((d<?>) t0Var9.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                Scope scope15 = (Scope) obj2;
                                sv0.c cVar25 = sv0.c.f161028a;
                                scope15.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var10 = s0.f105811a;
                                return new m((tv0.a) scope15.get((d<?>) t0Var10.b(tv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (w) scope15.get((d<?>) t0Var10.b(w.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.i) scope15.get((d<?>) t0Var10.b(tv0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (s) scope15.get((d<?>) t0Var10.b(s.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.b) scope15.get((d<?>) t0Var10.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (qv0.a) scope15.get((d<?>) t0Var10.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope15.get((d<?>) t0Var10.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (fw0.a) scope15.get((d<?>) t0Var10.b(fw0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                Scope scope16 = (Scope) obj2;
                                ParametersHolder parametersHolder4 = (ParametersHolder) obj3;
                                sv0.c cVar26 = sv0.c.f161028a;
                                scope16.getClass();
                                parametersHolder4.getClass();
                                t0 t0Var11 = s0.f105811a;
                                return new u((rv0.a) scope16.get((d<?>) t0Var11.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (qv0.a) scope16.get((d<?>) t0Var11.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (l) scope16.get((d<?>) t0Var11.b(l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.d) scope16.get((d<?>) t0Var11.b(tv0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (g) scope16.get((d<?>) t0Var11.b(g.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (v) scope16.get((d<?>) t0Var11.b(v.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.f) scope16.get((d<?>) t0Var11.b(tv0.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (b63.o) parametersHolder4.elementAt(0, t0Var11.b(b63.o.class)), (o82.g) parametersHolder4.elementAt(1, t0Var11.b(o82.g.class)));
                            case 27:
                                Scope scope17 = (Scope) obj2;
                                sv0.c cVar27 = sv0.c.f161028a;
                                scope17.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var12 = s0.f105811a;
                                return new a0((tv0.c) scope17.get((d<?>) t0Var12.b(tv0.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (s) scope17.get((d<?>) t0Var12.b(s.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (fw0.a) scope17.get((d<?>) t0Var12.b(fw0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                Scope scope18 = (Scope) obj2;
                                sv0.c cVar28 = sv0.c.f161028a;
                                scope18.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var13 = s0.f105811a;
                                return new r((tv0.a) scope18.get((d<?>) t0Var13.b(tv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (w) scope18.get((d<?>) t0Var13.b(w.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.i) scope18.get((d<?>) t0Var13.b(tv0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (t) scope18.get((d<?>) t0Var13.b(t.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope18.get((d<?>) t0Var13.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                Scope scope19 = (Scope) obj2;
                                sv0.c cVar29 = sv0.c.f161028a;
                                scope19.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var14 = s0.f105811a;
                                return new nw0.g((rv0.a) scope19.get((d<?>) t0Var14.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.d) scope19.get((d<?>) t0Var14.b(tv0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.b) scope19.get((d<?>) t0Var14.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                        }
                    }
                }, kind2, j0Var2), module2));
                new KoinDefinition(module2, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(yt0.r0.class), null, new e23.p() { // from class: st0.b
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i24) {
                            case 0:
                                Scope scope = (Scope) obj2;
                                c cVar2 = c.f160846a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new p3((i) scope.get((d<?>) s0.f105811a.b(i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                Scope scope2 = (Scope) obj2;
                                c cVar3 = c.f160846a;
                                scope2.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new i0((kt0.a) scope2.get((d<?>) s0.f105811a.b(kt0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 2:
                                Scope scope3 = (Scope) obj2;
                                c cVar4 = c.f160846a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var3 = s0.f105811a;
                                return new j0((lt0.d) scope3.get((d<?>) t0Var3.b(lt0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (i0) scope3.get((d<?>) t0Var3.b(i0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                c cVar5 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (lt0.c) ez0.b.a(ez0.b.f67468a, ez0.c.GC, lt0.c.class, new h.a[0], null, null, null, 120);
                            case 4:
                                Scope scope4 = (Scope) obj2;
                                c cVar6 = c.f160846a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var4 = s0.f105811a;
                                return new x((lt0.c) scope4.get((d<?>) t0Var4.b(lt0.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (i0) scope4.get((d<?>) t0Var4.b(i0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 5:
                                c cVar7 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (f) ez0.b.a(ez0.b.f67468a, ez0.c.GC, f.class, new h.a[0], null, null, null, 120);
                            case 6:
                                Scope scope5 = (Scope) obj2;
                                c cVar8 = c.f160846a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var5 = s0.f105811a;
                                return new f1((f) scope5.get((d<?>) t0Var5.b(f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (lt0.d) scope5.get((d<?>) t0Var5.b(lt0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 7:
                                c cVar9 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (lt0.d) ez0.b.a(ez0.b.f67468a, ez0.c.GC, lt0.d.class, new h.a[0], null, null, null, 120);
                            case 8:
                                c cVar10 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (su.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, su.a.class, new h.a[0], null, null, null, 120);
                            case 9:
                                Scope scope6 = (Scope) obj2;
                                c cVar11 = c.f160846a;
                                scope6.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new yt0.a((lt0.a) scope6.get((d<?>) s0.f105811a.b(lt0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                Scope scope7 = (Scope) obj2;
                                c cVar12 = c.f160846a;
                                scope7.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var6 = s0.f105811a;
                                return new f0((yt0.s0) scope7.get((d<?>) t0Var6.b(yt0.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (r0) scope7.get((d<?>) t0Var6.b(r0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                c cVar13 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new o();
                            case 12:
                                c cVar14 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new n();
                            case 13:
                                c cVar15 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new i3(e20.a.C1315a.a(e20.a.f62587b));
                            case 14:
                                Scope scope8 = (Scope) obj2;
                                c cVar16 = c.f160846a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new o0((yt0.s0) scope8.get((d<?>) s0.f105811a.b(yt0.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                Scope scope9 = (Scope) obj2;
                                c cVar17 = c.f160846a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var7 = s0.f105811a;
                                return new z((yt0.s0) scope9.get((d<?>) t0Var7.b(yt0.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (i0) scope9.get((d<?>) t0Var7.b(i0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 16:
                                Scope scope10 = (Scope) obj2;
                                c cVar18 = c.f160846a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new p((r0) scope10.get((d<?>) s0.f105811a.b(r0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 17:
                                Scope scope11 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                c cVar19 = c.f160846a;
                                scope11.getClass();
                                parametersHolder.getClass();
                                return new h4((String) parametersHolder.get(0), (String) parametersHolder.get(1), ((Number) parametersHolder.get(2)).longValue(), (f1) scope11.get((d<?>) s0.f105811a.b(f1.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 18:
                                ParametersHolder parametersHolder2 = (ParametersHolder) obj3;
                                sv0.a aVar3 = sv0.a.f161025a;
                                ((Scope) obj2).getClass();
                                parametersHolder2.getClass();
                                return new dw0.a(new uv0.b((r53.i) parametersHolder2.elementAt(0, s0.f105811a.b(r53.i.class))));
                            case 19:
                                ParametersHolder parametersHolder3 = (ParametersHolder) obj3;
                                sv0.a aVar4 = sv0.a.f161025a;
                                ((Scope) obj2).getClass();
                                parametersHolder3.getClass();
                                return new cw0.a((dw0.a) parametersHolder3.elementAt(0, s0.f105811a.b(dw0.a.class)));
                            case 20:
                                sv0.c cVar20 = sv0.c.f161028a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new tv0.b();
                            case 21:
                                Scope scope12 = (Scope) obj2;
                                sv0.c cVar21 = sv0.c.f161028a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var8 = s0.f105811a;
                                return new v((qv0.a) scope12.get((d<?>) t0Var8.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope12.get((d<?>) t0Var8.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.b) scope12.get((d<?>) t0Var8.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                sv0.c cVar22 = sv0.c.f161028a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (nv0.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, nv0.a.class, new h.a[0], null, null, null, 88);
                            case 23:
                                Scope scope13 = (Scope) obj2;
                                sv0.c cVar23 = sv0.c.f161028a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new t((tv0.b) scope13.get((d<?>) s0.f105811a.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 24:
                                Scope scope14 = (Scope) obj2;
                                sv0.c cVar24 = sv0.c.f161028a;
                                scope14.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var9 = s0.f105811a;
                                return new k((qv0.a) scope14.get((d<?>) t0Var9.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope14.get((d<?>) t0Var9.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                Scope scope15 = (Scope) obj2;
                                sv0.c cVar25 = sv0.c.f161028a;
                                scope15.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var10 = s0.f105811a;
                                return new m((tv0.a) scope15.get((d<?>) t0Var10.b(tv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (w) scope15.get((d<?>) t0Var10.b(w.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.i) scope15.get((d<?>) t0Var10.b(tv0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (s) scope15.get((d<?>) t0Var10.b(s.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.b) scope15.get((d<?>) t0Var10.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (qv0.a) scope15.get((d<?>) t0Var10.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope15.get((d<?>) t0Var10.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (fw0.a) scope15.get((d<?>) t0Var10.b(fw0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                Scope scope16 = (Scope) obj2;
                                ParametersHolder parametersHolder4 = (ParametersHolder) obj3;
                                sv0.c cVar26 = sv0.c.f161028a;
                                scope16.getClass();
                                parametersHolder4.getClass();
                                t0 t0Var11 = s0.f105811a;
                                return new u((rv0.a) scope16.get((d<?>) t0Var11.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (qv0.a) scope16.get((d<?>) t0Var11.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (l) scope16.get((d<?>) t0Var11.b(l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.d) scope16.get((d<?>) t0Var11.b(tv0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (g) scope16.get((d<?>) t0Var11.b(g.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (v) scope16.get((d<?>) t0Var11.b(v.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.f) scope16.get((d<?>) t0Var11.b(tv0.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (b63.o) parametersHolder4.elementAt(0, t0Var11.b(b63.o.class)), (o82.g) parametersHolder4.elementAt(1, t0Var11.b(o82.g.class)));
                            case 27:
                                Scope scope17 = (Scope) obj2;
                                sv0.c cVar27 = sv0.c.f161028a;
                                scope17.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var12 = s0.f105811a;
                                return new a0((tv0.c) scope17.get((d<?>) t0Var12.b(tv0.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (s) scope17.get((d<?>) t0Var12.b(s.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (fw0.a) scope17.get((d<?>) t0Var12.b(fw0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                Scope scope18 = (Scope) obj2;
                                sv0.c cVar28 = sv0.c.f161028a;
                                scope18.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var13 = s0.f105811a;
                                return new r((tv0.a) scope18.get((d<?>) t0Var13.b(tv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (w) scope18.get((d<?>) t0Var13.b(w.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.i) scope18.get((d<?>) t0Var13.b(tv0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (t) scope18.get((d<?>) t0Var13.b(t.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope18.get((d<?>) t0Var13.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                Scope scope19 = (Scope) obj2;
                                sv0.c cVar29 = sv0.c.f161028a;
                                scope19.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var14 = s0.f105811a;
                                return new nw0.g((rv0.a) scope19.get((d<?>) t0Var14.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.d) scope19.get((d<?>) t0Var14.b(tv0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.b) scope19.get((d<?>) t0Var14.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                        }
                    }
                }, kind2, j0Var2), module2));
                new KoinDefinition(module2, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(lt0.f.class), null, new e23.p() { // from class: st0.b
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i19) {
                            case 0:
                                Scope scope = (Scope) obj2;
                                c cVar2 = c.f160846a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new p3((i) scope.get((d<?>) s0.f105811a.b(i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                Scope scope2 = (Scope) obj2;
                                c cVar3 = c.f160846a;
                                scope2.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new i0((kt0.a) scope2.get((d<?>) s0.f105811a.b(kt0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 2:
                                Scope scope3 = (Scope) obj2;
                                c cVar4 = c.f160846a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var3 = s0.f105811a;
                                return new j0((lt0.d) scope3.get((d<?>) t0Var3.b(lt0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (i0) scope3.get((d<?>) t0Var3.b(i0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                c cVar5 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (lt0.c) ez0.b.a(ez0.b.f67468a, ez0.c.GC, lt0.c.class, new h.a[0], null, null, null, 120);
                            case 4:
                                Scope scope4 = (Scope) obj2;
                                c cVar6 = c.f160846a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var4 = s0.f105811a;
                                return new x((lt0.c) scope4.get((d<?>) t0Var4.b(lt0.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (i0) scope4.get((d<?>) t0Var4.b(i0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 5:
                                c cVar7 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (f) ez0.b.a(ez0.b.f67468a, ez0.c.GC, f.class, new h.a[0], null, null, null, 120);
                            case 6:
                                Scope scope5 = (Scope) obj2;
                                c cVar8 = c.f160846a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var5 = s0.f105811a;
                                return new f1((f) scope5.get((d<?>) t0Var5.b(f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (lt0.d) scope5.get((d<?>) t0Var5.b(lt0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 7:
                                c cVar9 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (lt0.d) ez0.b.a(ez0.b.f67468a, ez0.c.GC, lt0.d.class, new h.a[0], null, null, null, 120);
                            case 8:
                                c cVar10 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (su.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, su.a.class, new h.a[0], null, null, null, 120);
                            case 9:
                                Scope scope6 = (Scope) obj2;
                                c cVar11 = c.f160846a;
                                scope6.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new yt0.a((lt0.a) scope6.get((d<?>) s0.f105811a.b(lt0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                Scope scope7 = (Scope) obj2;
                                c cVar12 = c.f160846a;
                                scope7.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var6 = s0.f105811a;
                                return new f0((yt0.s0) scope7.get((d<?>) t0Var6.b(yt0.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (r0) scope7.get((d<?>) t0Var6.b(r0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                c cVar13 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new o();
                            case 12:
                                c cVar14 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new n();
                            case 13:
                                c cVar15 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new i3(e20.a.C1315a.a(e20.a.f62587b));
                            case 14:
                                Scope scope8 = (Scope) obj2;
                                c cVar16 = c.f160846a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new o0((yt0.s0) scope8.get((d<?>) s0.f105811a.b(yt0.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                Scope scope9 = (Scope) obj2;
                                c cVar17 = c.f160846a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var7 = s0.f105811a;
                                return new z((yt0.s0) scope9.get((d<?>) t0Var7.b(yt0.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (i0) scope9.get((d<?>) t0Var7.b(i0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 16:
                                Scope scope10 = (Scope) obj2;
                                c cVar18 = c.f160846a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new p((r0) scope10.get((d<?>) s0.f105811a.b(r0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 17:
                                Scope scope11 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                c cVar19 = c.f160846a;
                                scope11.getClass();
                                parametersHolder.getClass();
                                return new h4((String) parametersHolder.get(0), (String) parametersHolder.get(1), ((Number) parametersHolder.get(2)).longValue(), (f1) scope11.get((d<?>) s0.f105811a.b(f1.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 18:
                                ParametersHolder parametersHolder2 = (ParametersHolder) obj3;
                                sv0.a aVar3 = sv0.a.f161025a;
                                ((Scope) obj2).getClass();
                                parametersHolder2.getClass();
                                return new dw0.a(new uv0.b((r53.i) parametersHolder2.elementAt(0, s0.f105811a.b(r53.i.class))));
                            case 19:
                                ParametersHolder parametersHolder3 = (ParametersHolder) obj3;
                                sv0.a aVar4 = sv0.a.f161025a;
                                ((Scope) obj2).getClass();
                                parametersHolder3.getClass();
                                return new cw0.a((dw0.a) parametersHolder3.elementAt(0, s0.f105811a.b(dw0.a.class)));
                            case 20:
                                sv0.c cVar20 = sv0.c.f161028a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new tv0.b();
                            case 21:
                                Scope scope12 = (Scope) obj2;
                                sv0.c cVar21 = sv0.c.f161028a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var8 = s0.f105811a;
                                return new v((qv0.a) scope12.get((d<?>) t0Var8.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope12.get((d<?>) t0Var8.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.b) scope12.get((d<?>) t0Var8.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                sv0.c cVar22 = sv0.c.f161028a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (nv0.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, nv0.a.class, new h.a[0], null, null, null, 88);
                            case 23:
                                Scope scope13 = (Scope) obj2;
                                sv0.c cVar23 = sv0.c.f161028a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new t((tv0.b) scope13.get((d<?>) s0.f105811a.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 24:
                                Scope scope14 = (Scope) obj2;
                                sv0.c cVar24 = sv0.c.f161028a;
                                scope14.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var9 = s0.f105811a;
                                return new k((qv0.a) scope14.get((d<?>) t0Var9.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope14.get((d<?>) t0Var9.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                Scope scope15 = (Scope) obj2;
                                sv0.c cVar25 = sv0.c.f161028a;
                                scope15.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var10 = s0.f105811a;
                                return new m((tv0.a) scope15.get((d<?>) t0Var10.b(tv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (w) scope15.get((d<?>) t0Var10.b(w.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.i) scope15.get((d<?>) t0Var10.b(tv0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (s) scope15.get((d<?>) t0Var10.b(s.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.b) scope15.get((d<?>) t0Var10.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (qv0.a) scope15.get((d<?>) t0Var10.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope15.get((d<?>) t0Var10.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (fw0.a) scope15.get((d<?>) t0Var10.b(fw0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                Scope scope16 = (Scope) obj2;
                                ParametersHolder parametersHolder4 = (ParametersHolder) obj3;
                                sv0.c cVar26 = sv0.c.f161028a;
                                scope16.getClass();
                                parametersHolder4.getClass();
                                t0 t0Var11 = s0.f105811a;
                                return new u((rv0.a) scope16.get((d<?>) t0Var11.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (qv0.a) scope16.get((d<?>) t0Var11.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (l) scope16.get((d<?>) t0Var11.b(l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.d) scope16.get((d<?>) t0Var11.b(tv0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (g) scope16.get((d<?>) t0Var11.b(g.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (v) scope16.get((d<?>) t0Var11.b(v.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.f) scope16.get((d<?>) t0Var11.b(tv0.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (b63.o) parametersHolder4.elementAt(0, t0Var11.b(b63.o.class)), (o82.g) parametersHolder4.elementAt(1, t0Var11.b(o82.g.class)));
                            case 27:
                                Scope scope17 = (Scope) obj2;
                                sv0.c cVar27 = sv0.c.f161028a;
                                scope17.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var12 = s0.f105811a;
                                return new a0((tv0.c) scope17.get((d<?>) t0Var12.b(tv0.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (s) scope17.get((d<?>) t0Var12.b(s.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (fw0.a) scope17.get((d<?>) t0Var12.b(fw0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                Scope scope18 = (Scope) obj2;
                                sv0.c cVar28 = sv0.c.f161028a;
                                scope18.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var13 = s0.f105811a;
                                return new r((tv0.a) scope18.get((d<?>) t0Var13.b(tv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (w) scope18.get((d<?>) t0Var13.b(w.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.i) scope18.get((d<?>) t0Var13.b(tv0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (t) scope18.get((d<?>) t0Var13.b(t.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope18.get((d<?>) t0Var13.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                Scope scope19 = (Scope) obj2;
                                sv0.c cVar29 = sv0.c.f161028a;
                                scope19.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var14 = s0.f105811a;
                                return new nw0.g((rv0.a) scope19.get((d<?>) t0Var14.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.d) scope19.get((d<?>) t0Var14.b(tv0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.b) scope19.get((d<?>) t0Var14.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                        }
                    }
                }, kind2, j0Var2), module2));
                new KoinDefinition(module2, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(yt0.f1.class), null, new e23.p() { // from class: st0.b
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i18) {
                            case 0:
                                Scope scope = (Scope) obj2;
                                c cVar2 = c.f160846a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new p3((i) scope.get((d<?>) s0.f105811a.b(i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                Scope scope2 = (Scope) obj2;
                                c cVar3 = c.f160846a;
                                scope2.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new i0((kt0.a) scope2.get((d<?>) s0.f105811a.b(kt0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 2:
                                Scope scope3 = (Scope) obj2;
                                c cVar4 = c.f160846a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var3 = s0.f105811a;
                                return new j0((lt0.d) scope3.get((d<?>) t0Var3.b(lt0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (i0) scope3.get((d<?>) t0Var3.b(i0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                c cVar5 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (lt0.c) ez0.b.a(ez0.b.f67468a, ez0.c.GC, lt0.c.class, new h.a[0], null, null, null, 120);
                            case 4:
                                Scope scope4 = (Scope) obj2;
                                c cVar6 = c.f160846a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var4 = s0.f105811a;
                                return new x((lt0.c) scope4.get((d<?>) t0Var4.b(lt0.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (i0) scope4.get((d<?>) t0Var4.b(i0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 5:
                                c cVar7 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (f) ez0.b.a(ez0.b.f67468a, ez0.c.GC, f.class, new h.a[0], null, null, null, 120);
                            case 6:
                                Scope scope5 = (Scope) obj2;
                                c cVar8 = c.f160846a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var5 = s0.f105811a;
                                return new f1((f) scope5.get((d<?>) t0Var5.b(f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (lt0.d) scope5.get((d<?>) t0Var5.b(lt0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 7:
                                c cVar9 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (lt0.d) ez0.b.a(ez0.b.f67468a, ez0.c.GC, lt0.d.class, new h.a[0], null, null, null, 120);
                            case 8:
                                c cVar10 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (su.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, su.a.class, new h.a[0], null, null, null, 120);
                            case 9:
                                Scope scope6 = (Scope) obj2;
                                c cVar11 = c.f160846a;
                                scope6.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new yt0.a((lt0.a) scope6.get((d<?>) s0.f105811a.b(lt0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                Scope scope7 = (Scope) obj2;
                                c cVar12 = c.f160846a;
                                scope7.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var6 = s0.f105811a;
                                return new f0((yt0.s0) scope7.get((d<?>) t0Var6.b(yt0.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (r0) scope7.get((d<?>) t0Var6.b(r0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                c cVar13 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new o();
                            case 12:
                                c cVar14 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new n();
                            case 13:
                                c cVar15 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new i3(e20.a.C1315a.a(e20.a.f62587b));
                            case 14:
                                Scope scope8 = (Scope) obj2;
                                c cVar16 = c.f160846a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new o0((yt0.s0) scope8.get((d<?>) s0.f105811a.b(yt0.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                Scope scope9 = (Scope) obj2;
                                c cVar17 = c.f160846a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var7 = s0.f105811a;
                                return new z((yt0.s0) scope9.get((d<?>) t0Var7.b(yt0.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (i0) scope9.get((d<?>) t0Var7.b(i0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 16:
                                Scope scope10 = (Scope) obj2;
                                c cVar18 = c.f160846a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new p((r0) scope10.get((d<?>) s0.f105811a.b(r0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 17:
                                Scope scope11 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                c cVar19 = c.f160846a;
                                scope11.getClass();
                                parametersHolder.getClass();
                                return new h4((String) parametersHolder.get(0), (String) parametersHolder.get(1), ((Number) parametersHolder.get(2)).longValue(), (f1) scope11.get((d<?>) s0.f105811a.b(f1.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 18:
                                ParametersHolder parametersHolder2 = (ParametersHolder) obj3;
                                sv0.a aVar3 = sv0.a.f161025a;
                                ((Scope) obj2).getClass();
                                parametersHolder2.getClass();
                                return new dw0.a(new uv0.b((r53.i) parametersHolder2.elementAt(0, s0.f105811a.b(r53.i.class))));
                            case 19:
                                ParametersHolder parametersHolder3 = (ParametersHolder) obj3;
                                sv0.a aVar4 = sv0.a.f161025a;
                                ((Scope) obj2).getClass();
                                parametersHolder3.getClass();
                                return new cw0.a((dw0.a) parametersHolder3.elementAt(0, s0.f105811a.b(dw0.a.class)));
                            case 20:
                                sv0.c cVar20 = sv0.c.f161028a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new tv0.b();
                            case 21:
                                Scope scope12 = (Scope) obj2;
                                sv0.c cVar21 = sv0.c.f161028a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var8 = s0.f105811a;
                                return new v((qv0.a) scope12.get((d<?>) t0Var8.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope12.get((d<?>) t0Var8.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.b) scope12.get((d<?>) t0Var8.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                sv0.c cVar22 = sv0.c.f161028a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (nv0.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, nv0.a.class, new h.a[0], null, null, null, 88);
                            case 23:
                                Scope scope13 = (Scope) obj2;
                                sv0.c cVar23 = sv0.c.f161028a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new t((tv0.b) scope13.get((d<?>) s0.f105811a.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 24:
                                Scope scope14 = (Scope) obj2;
                                sv0.c cVar24 = sv0.c.f161028a;
                                scope14.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var9 = s0.f105811a;
                                return new k((qv0.a) scope14.get((d<?>) t0Var9.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope14.get((d<?>) t0Var9.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                Scope scope15 = (Scope) obj2;
                                sv0.c cVar25 = sv0.c.f161028a;
                                scope15.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var10 = s0.f105811a;
                                return new m((tv0.a) scope15.get((d<?>) t0Var10.b(tv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (w) scope15.get((d<?>) t0Var10.b(w.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.i) scope15.get((d<?>) t0Var10.b(tv0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (s) scope15.get((d<?>) t0Var10.b(s.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.b) scope15.get((d<?>) t0Var10.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (qv0.a) scope15.get((d<?>) t0Var10.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope15.get((d<?>) t0Var10.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (fw0.a) scope15.get((d<?>) t0Var10.b(fw0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                Scope scope16 = (Scope) obj2;
                                ParametersHolder parametersHolder4 = (ParametersHolder) obj3;
                                sv0.c cVar26 = sv0.c.f161028a;
                                scope16.getClass();
                                parametersHolder4.getClass();
                                t0 t0Var11 = s0.f105811a;
                                return new u((rv0.a) scope16.get((d<?>) t0Var11.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (qv0.a) scope16.get((d<?>) t0Var11.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (l) scope16.get((d<?>) t0Var11.b(l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.d) scope16.get((d<?>) t0Var11.b(tv0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (g) scope16.get((d<?>) t0Var11.b(g.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (v) scope16.get((d<?>) t0Var11.b(v.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.f) scope16.get((d<?>) t0Var11.b(tv0.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (b63.o) parametersHolder4.elementAt(0, t0Var11.b(b63.o.class)), (o82.g) parametersHolder4.elementAt(1, t0Var11.b(o82.g.class)));
                            case 27:
                                Scope scope17 = (Scope) obj2;
                                sv0.c cVar27 = sv0.c.f161028a;
                                scope17.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var12 = s0.f105811a;
                                return new a0((tv0.c) scope17.get((d<?>) t0Var12.b(tv0.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (s) scope17.get((d<?>) t0Var12.b(s.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (fw0.a) scope17.get((d<?>) t0Var12.b(fw0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                Scope scope18 = (Scope) obj2;
                                sv0.c cVar28 = sv0.c.f161028a;
                                scope18.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var13 = s0.f105811a;
                                return new r((tv0.a) scope18.get((d<?>) t0Var13.b(tv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (w) scope18.get((d<?>) t0Var13.b(w.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.i) scope18.get((d<?>) t0Var13.b(tv0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (t) scope18.get((d<?>) t0Var13.b(t.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope18.get((d<?>) t0Var13.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                Scope scope19 = (Scope) obj2;
                                sv0.c cVar29 = sv0.c.f161028a;
                                scope19.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var14 = s0.f105811a;
                                return new nw0.g((rv0.a) scope19.get((d<?>) t0Var14.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.d) scope19.get((d<?>) t0Var14.b(tv0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.b) scope19.get((d<?>) t0Var14.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                        }
                    }
                }, kind2, j0Var2), module2));
                new KoinDefinition(module2, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(su.a.class), null, new e23.p() { // from class: st0.b
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i16) {
                            case 0:
                                Scope scope = (Scope) obj2;
                                c cVar2 = c.f160846a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new p3((i) scope.get((d<?>) s0.f105811a.b(i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                Scope scope2 = (Scope) obj2;
                                c cVar3 = c.f160846a;
                                scope2.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new i0((kt0.a) scope2.get((d<?>) s0.f105811a.b(kt0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 2:
                                Scope scope3 = (Scope) obj2;
                                c cVar4 = c.f160846a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var3 = s0.f105811a;
                                return new j0((lt0.d) scope3.get((d<?>) t0Var3.b(lt0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (i0) scope3.get((d<?>) t0Var3.b(i0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                c cVar5 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (lt0.c) ez0.b.a(ez0.b.f67468a, ez0.c.GC, lt0.c.class, new h.a[0], null, null, null, 120);
                            case 4:
                                Scope scope4 = (Scope) obj2;
                                c cVar6 = c.f160846a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var4 = s0.f105811a;
                                return new x((lt0.c) scope4.get((d<?>) t0Var4.b(lt0.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (i0) scope4.get((d<?>) t0Var4.b(i0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 5:
                                c cVar7 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (f) ez0.b.a(ez0.b.f67468a, ez0.c.GC, f.class, new h.a[0], null, null, null, 120);
                            case 6:
                                Scope scope5 = (Scope) obj2;
                                c cVar8 = c.f160846a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var5 = s0.f105811a;
                                return new f1((f) scope5.get((d<?>) t0Var5.b(f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (lt0.d) scope5.get((d<?>) t0Var5.b(lt0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 7:
                                c cVar9 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (lt0.d) ez0.b.a(ez0.b.f67468a, ez0.c.GC, lt0.d.class, new h.a[0], null, null, null, 120);
                            case 8:
                                c cVar10 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (su.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, su.a.class, new h.a[0], null, null, null, 120);
                            case 9:
                                Scope scope6 = (Scope) obj2;
                                c cVar11 = c.f160846a;
                                scope6.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new yt0.a((lt0.a) scope6.get((d<?>) s0.f105811a.b(lt0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                Scope scope7 = (Scope) obj2;
                                c cVar12 = c.f160846a;
                                scope7.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var6 = s0.f105811a;
                                return new f0((yt0.s0) scope7.get((d<?>) t0Var6.b(yt0.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (r0) scope7.get((d<?>) t0Var6.b(r0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                c cVar13 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new o();
                            case 12:
                                c cVar14 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new n();
                            case 13:
                                c cVar15 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new i3(e20.a.C1315a.a(e20.a.f62587b));
                            case 14:
                                Scope scope8 = (Scope) obj2;
                                c cVar16 = c.f160846a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new o0((yt0.s0) scope8.get((d<?>) s0.f105811a.b(yt0.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                Scope scope9 = (Scope) obj2;
                                c cVar17 = c.f160846a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var7 = s0.f105811a;
                                return new z((yt0.s0) scope9.get((d<?>) t0Var7.b(yt0.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (i0) scope9.get((d<?>) t0Var7.b(i0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 16:
                                Scope scope10 = (Scope) obj2;
                                c cVar18 = c.f160846a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new p((r0) scope10.get((d<?>) s0.f105811a.b(r0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 17:
                                Scope scope11 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                c cVar19 = c.f160846a;
                                scope11.getClass();
                                parametersHolder.getClass();
                                return new h4((String) parametersHolder.get(0), (String) parametersHolder.get(1), ((Number) parametersHolder.get(2)).longValue(), (f1) scope11.get((d<?>) s0.f105811a.b(f1.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 18:
                                ParametersHolder parametersHolder2 = (ParametersHolder) obj3;
                                sv0.a aVar3 = sv0.a.f161025a;
                                ((Scope) obj2).getClass();
                                parametersHolder2.getClass();
                                return new dw0.a(new uv0.b((r53.i) parametersHolder2.elementAt(0, s0.f105811a.b(r53.i.class))));
                            case 19:
                                ParametersHolder parametersHolder3 = (ParametersHolder) obj3;
                                sv0.a aVar4 = sv0.a.f161025a;
                                ((Scope) obj2).getClass();
                                parametersHolder3.getClass();
                                return new cw0.a((dw0.a) parametersHolder3.elementAt(0, s0.f105811a.b(dw0.a.class)));
                            case 20:
                                sv0.c cVar20 = sv0.c.f161028a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new tv0.b();
                            case 21:
                                Scope scope12 = (Scope) obj2;
                                sv0.c cVar21 = sv0.c.f161028a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var8 = s0.f105811a;
                                return new v((qv0.a) scope12.get((d<?>) t0Var8.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope12.get((d<?>) t0Var8.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.b) scope12.get((d<?>) t0Var8.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                sv0.c cVar22 = sv0.c.f161028a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (nv0.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, nv0.a.class, new h.a[0], null, null, null, 88);
                            case 23:
                                Scope scope13 = (Scope) obj2;
                                sv0.c cVar23 = sv0.c.f161028a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new t((tv0.b) scope13.get((d<?>) s0.f105811a.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 24:
                                Scope scope14 = (Scope) obj2;
                                sv0.c cVar24 = sv0.c.f161028a;
                                scope14.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var9 = s0.f105811a;
                                return new k((qv0.a) scope14.get((d<?>) t0Var9.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope14.get((d<?>) t0Var9.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                Scope scope15 = (Scope) obj2;
                                sv0.c cVar25 = sv0.c.f161028a;
                                scope15.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var10 = s0.f105811a;
                                return new m((tv0.a) scope15.get((d<?>) t0Var10.b(tv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (w) scope15.get((d<?>) t0Var10.b(w.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.i) scope15.get((d<?>) t0Var10.b(tv0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (s) scope15.get((d<?>) t0Var10.b(s.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.b) scope15.get((d<?>) t0Var10.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (qv0.a) scope15.get((d<?>) t0Var10.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope15.get((d<?>) t0Var10.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (fw0.a) scope15.get((d<?>) t0Var10.b(fw0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                Scope scope16 = (Scope) obj2;
                                ParametersHolder parametersHolder4 = (ParametersHolder) obj3;
                                sv0.c cVar26 = sv0.c.f161028a;
                                scope16.getClass();
                                parametersHolder4.getClass();
                                t0 t0Var11 = s0.f105811a;
                                return new u((rv0.a) scope16.get((d<?>) t0Var11.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (qv0.a) scope16.get((d<?>) t0Var11.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (l) scope16.get((d<?>) t0Var11.b(l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.d) scope16.get((d<?>) t0Var11.b(tv0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (g) scope16.get((d<?>) t0Var11.b(g.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (v) scope16.get((d<?>) t0Var11.b(v.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.f) scope16.get((d<?>) t0Var11.b(tv0.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (b63.o) parametersHolder4.elementAt(0, t0Var11.b(b63.o.class)), (o82.g) parametersHolder4.elementAt(1, t0Var11.b(o82.g.class)));
                            case 27:
                                Scope scope17 = (Scope) obj2;
                                sv0.c cVar27 = sv0.c.f161028a;
                                scope17.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var12 = s0.f105811a;
                                return new a0((tv0.c) scope17.get((d<?>) t0Var12.b(tv0.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (s) scope17.get((d<?>) t0Var12.b(s.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (fw0.a) scope17.get((d<?>) t0Var12.b(fw0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                Scope scope18 = (Scope) obj2;
                                sv0.c cVar28 = sv0.c.f161028a;
                                scope18.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var13 = s0.f105811a;
                                return new r((tv0.a) scope18.get((d<?>) t0Var13.b(tv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (w) scope18.get((d<?>) t0Var13.b(w.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.i) scope18.get((d<?>) t0Var13.b(tv0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (t) scope18.get((d<?>) t0Var13.b(t.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope18.get((d<?>) t0Var13.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                Scope scope19 = (Scope) obj2;
                                sv0.c cVar29 = sv0.c.f161028a;
                                scope19.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var14 = s0.f105811a;
                                return new nw0.g((rv0.a) scope19.get((d<?>) t0Var14.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.d) scope19.get((d<?>) t0Var14.b(tv0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.b) scope19.get((d<?>) t0Var14.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                        }
                    }
                }, kind2, j0Var2), module2));
                new KoinDefinition(module2, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(yt0.a.class), null, new e23.p() { // from class: st0.b
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i15) {
                            case 0:
                                Scope scope = (Scope) obj2;
                                c cVar2 = c.f160846a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new p3((i) scope.get((d<?>) s0.f105811a.b(i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                Scope scope2 = (Scope) obj2;
                                c cVar3 = c.f160846a;
                                scope2.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new i0((kt0.a) scope2.get((d<?>) s0.f105811a.b(kt0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 2:
                                Scope scope3 = (Scope) obj2;
                                c cVar4 = c.f160846a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var3 = s0.f105811a;
                                return new j0((lt0.d) scope3.get((d<?>) t0Var3.b(lt0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (i0) scope3.get((d<?>) t0Var3.b(i0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                c cVar5 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (lt0.c) ez0.b.a(ez0.b.f67468a, ez0.c.GC, lt0.c.class, new h.a[0], null, null, null, 120);
                            case 4:
                                Scope scope4 = (Scope) obj2;
                                c cVar6 = c.f160846a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var4 = s0.f105811a;
                                return new x((lt0.c) scope4.get((d<?>) t0Var4.b(lt0.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (i0) scope4.get((d<?>) t0Var4.b(i0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 5:
                                c cVar7 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (f) ez0.b.a(ez0.b.f67468a, ez0.c.GC, f.class, new h.a[0], null, null, null, 120);
                            case 6:
                                Scope scope5 = (Scope) obj2;
                                c cVar8 = c.f160846a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var5 = s0.f105811a;
                                return new f1((f) scope5.get((d<?>) t0Var5.b(f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (lt0.d) scope5.get((d<?>) t0Var5.b(lt0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 7:
                                c cVar9 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (lt0.d) ez0.b.a(ez0.b.f67468a, ez0.c.GC, lt0.d.class, new h.a[0], null, null, null, 120);
                            case 8:
                                c cVar10 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (su.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, su.a.class, new h.a[0], null, null, null, 120);
                            case 9:
                                Scope scope6 = (Scope) obj2;
                                c cVar11 = c.f160846a;
                                scope6.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new yt0.a((lt0.a) scope6.get((d<?>) s0.f105811a.b(lt0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                Scope scope7 = (Scope) obj2;
                                c cVar12 = c.f160846a;
                                scope7.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var6 = s0.f105811a;
                                return new f0((yt0.s0) scope7.get((d<?>) t0Var6.b(yt0.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (r0) scope7.get((d<?>) t0Var6.b(r0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                c cVar13 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new o();
                            case 12:
                                c cVar14 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new n();
                            case 13:
                                c cVar15 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new i3(e20.a.C1315a.a(e20.a.f62587b));
                            case 14:
                                Scope scope8 = (Scope) obj2;
                                c cVar16 = c.f160846a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new o0((yt0.s0) scope8.get((d<?>) s0.f105811a.b(yt0.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                Scope scope9 = (Scope) obj2;
                                c cVar17 = c.f160846a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var7 = s0.f105811a;
                                return new z((yt0.s0) scope9.get((d<?>) t0Var7.b(yt0.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (i0) scope9.get((d<?>) t0Var7.b(i0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 16:
                                Scope scope10 = (Scope) obj2;
                                c cVar18 = c.f160846a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new p((r0) scope10.get((d<?>) s0.f105811a.b(r0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 17:
                                Scope scope11 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                c cVar19 = c.f160846a;
                                scope11.getClass();
                                parametersHolder.getClass();
                                return new h4((String) parametersHolder.get(0), (String) parametersHolder.get(1), ((Number) parametersHolder.get(2)).longValue(), (f1) scope11.get((d<?>) s0.f105811a.b(f1.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 18:
                                ParametersHolder parametersHolder2 = (ParametersHolder) obj3;
                                sv0.a aVar3 = sv0.a.f161025a;
                                ((Scope) obj2).getClass();
                                parametersHolder2.getClass();
                                return new dw0.a(new uv0.b((r53.i) parametersHolder2.elementAt(0, s0.f105811a.b(r53.i.class))));
                            case 19:
                                ParametersHolder parametersHolder3 = (ParametersHolder) obj3;
                                sv0.a aVar4 = sv0.a.f161025a;
                                ((Scope) obj2).getClass();
                                parametersHolder3.getClass();
                                return new cw0.a((dw0.a) parametersHolder3.elementAt(0, s0.f105811a.b(dw0.a.class)));
                            case 20:
                                sv0.c cVar20 = sv0.c.f161028a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new tv0.b();
                            case 21:
                                Scope scope12 = (Scope) obj2;
                                sv0.c cVar21 = sv0.c.f161028a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var8 = s0.f105811a;
                                return new v((qv0.a) scope12.get((d<?>) t0Var8.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope12.get((d<?>) t0Var8.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.b) scope12.get((d<?>) t0Var8.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                sv0.c cVar22 = sv0.c.f161028a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (nv0.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, nv0.a.class, new h.a[0], null, null, null, 88);
                            case 23:
                                Scope scope13 = (Scope) obj2;
                                sv0.c cVar23 = sv0.c.f161028a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new t((tv0.b) scope13.get((d<?>) s0.f105811a.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 24:
                                Scope scope14 = (Scope) obj2;
                                sv0.c cVar24 = sv0.c.f161028a;
                                scope14.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var9 = s0.f105811a;
                                return new k((qv0.a) scope14.get((d<?>) t0Var9.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope14.get((d<?>) t0Var9.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                Scope scope15 = (Scope) obj2;
                                sv0.c cVar25 = sv0.c.f161028a;
                                scope15.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var10 = s0.f105811a;
                                return new m((tv0.a) scope15.get((d<?>) t0Var10.b(tv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (w) scope15.get((d<?>) t0Var10.b(w.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.i) scope15.get((d<?>) t0Var10.b(tv0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (s) scope15.get((d<?>) t0Var10.b(s.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.b) scope15.get((d<?>) t0Var10.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (qv0.a) scope15.get((d<?>) t0Var10.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope15.get((d<?>) t0Var10.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (fw0.a) scope15.get((d<?>) t0Var10.b(fw0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                Scope scope16 = (Scope) obj2;
                                ParametersHolder parametersHolder4 = (ParametersHolder) obj3;
                                sv0.c cVar26 = sv0.c.f161028a;
                                scope16.getClass();
                                parametersHolder4.getClass();
                                t0 t0Var11 = s0.f105811a;
                                return new u((rv0.a) scope16.get((d<?>) t0Var11.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (qv0.a) scope16.get((d<?>) t0Var11.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (l) scope16.get((d<?>) t0Var11.b(l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.d) scope16.get((d<?>) t0Var11.b(tv0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (g) scope16.get((d<?>) t0Var11.b(g.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (v) scope16.get((d<?>) t0Var11.b(v.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.f) scope16.get((d<?>) t0Var11.b(tv0.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (b63.o) parametersHolder4.elementAt(0, t0Var11.b(b63.o.class)), (o82.g) parametersHolder4.elementAt(1, t0Var11.b(o82.g.class)));
                            case 27:
                                Scope scope17 = (Scope) obj2;
                                sv0.c cVar27 = sv0.c.f161028a;
                                scope17.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var12 = s0.f105811a;
                                return new a0((tv0.c) scope17.get((d<?>) t0Var12.b(tv0.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (s) scope17.get((d<?>) t0Var12.b(s.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (fw0.a) scope17.get((d<?>) t0Var12.b(fw0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                Scope scope18 = (Scope) obj2;
                                sv0.c cVar28 = sv0.c.f161028a;
                                scope18.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var13 = s0.f105811a;
                                return new r((tv0.a) scope18.get((d<?>) t0Var13.b(tv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (w) scope18.get((d<?>) t0Var13.b(w.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.i) scope18.get((d<?>) t0Var13.b(tv0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (t) scope18.get((d<?>) t0Var13.b(t.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope18.get((d<?>) t0Var13.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                Scope scope19 = (Scope) obj2;
                                sv0.c cVar29 = sv0.c.f161028a;
                                scope19.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var14 = s0.f105811a;
                                return new nw0.g((rv0.a) scope19.get((d<?>) t0Var14.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.d) scope19.get((d<?>) t0Var14.b(tv0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.b) scope19.get((d<?>) t0Var14.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                        }
                    }
                }, kind2, j0Var2), module2));
                new KoinDefinition(module2, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(pt0.f0.class), null, new e23.p() { // from class: st0.b
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i14) {
                            case 0:
                                Scope scope = (Scope) obj2;
                                c cVar2 = c.f160846a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new p3((i) scope.get((d<?>) s0.f105811a.b(i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                Scope scope2 = (Scope) obj2;
                                c cVar3 = c.f160846a;
                                scope2.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new i0((kt0.a) scope2.get((d<?>) s0.f105811a.b(kt0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 2:
                                Scope scope3 = (Scope) obj2;
                                c cVar4 = c.f160846a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var3 = s0.f105811a;
                                return new j0((lt0.d) scope3.get((d<?>) t0Var3.b(lt0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (i0) scope3.get((d<?>) t0Var3.b(i0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                c cVar5 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (lt0.c) ez0.b.a(ez0.b.f67468a, ez0.c.GC, lt0.c.class, new h.a[0], null, null, null, 120);
                            case 4:
                                Scope scope4 = (Scope) obj2;
                                c cVar6 = c.f160846a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var4 = s0.f105811a;
                                return new x((lt0.c) scope4.get((d<?>) t0Var4.b(lt0.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (i0) scope4.get((d<?>) t0Var4.b(i0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 5:
                                c cVar7 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (f) ez0.b.a(ez0.b.f67468a, ez0.c.GC, f.class, new h.a[0], null, null, null, 120);
                            case 6:
                                Scope scope5 = (Scope) obj2;
                                c cVar8 = c.f160846a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var5 = s0.f105811a;
                                return new f1((f) scope5.get((d<?>) t0Var5.b(f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (lt0.d) scope5.get((d<?>) t0Var5.b(lt0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 7:
                                c cVar9 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (lt0.d) ez0.b.a(ez0.b.f67468a, ez0.c.GC, lt0.d.class, new h.a[0], null, null, null, 120);
                            case 8:
                                c cVar10 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (su.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, su.a.class, new h.a[0], null, null, null, 120);
                            case 9:
                                Scope scope6 = (Scope) obj2;
                                c cVar11 = c.f160846a;
                                scope6.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new yt0.a((lt0.a) scope6.get((d<?>) s0.f105811a.b(lt0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                Scope scope7 = (Scope) obj2;
                                c cVar12 = c.f160846a;
                                scope7.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var6 = s0.f105811a;
                                return new f0((yt0.s0) scope7.get((d<?>) t0Var6.b(yt0.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (r0) scope7.get((d<?>) t0Var6.b(r0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                c cVar13 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new o();
                            case 12:
                                c cVar14 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new n();
                            case 13:
                                c cVar15 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new i3(e20.a.C1315a.a(e20.a.f62587b));
                            case 14:
                                Scope scope8 = (Scope) obj2;
                                c cVar16 = c.f160846a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new o0((yt0.s0) scope8.get((d<?>) s0.f105811a.b(yt0.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                Scope scope9 = (Scope) obj2;
                                c cVar17 = c.f160846a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var7 = s0.f105811a;
                                return new z((yt0.s0) scope9.get((d<?>) t0Var7.b(yt0.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (i0) scope9.get((d<?>) t0Var7.b(i0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 16:
                                Scope scope10 = (Scope) obj2;
                                c cVar18 = c.f160846a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new p((r0) scope10.get((d<?>) s0.f105811a.b(r0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 17:
                                Scope scope11 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                c cVar19 = c.f160846a;
                                scope11.getClass();
                                parametersHolder.getClass();
                                return new h4((String) parametersHolder.get(0), (String) parametersHolder.get(1), ((Number) parametersHolder.get(2)).longValue(), (f1) scope11.get((d<?>) s0.f105811a.b(f1.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 18:
                                ParametersHolder parametersHolder2 = (ParametersHolder) obj3;
                                sv0.a aVar3 = sv0.a.f161025a;
                                ((Scope) obj2).getClass();
                                parametersHolder2.getClass();
                                return new dw0.a(new uv0.b((r53.i) parametersHolder2.elementAt(0, s0.f105811a.b(r53.i.class))));
                            case 19:
                                ParametersHolder parametersHolder3 = (ParametersHolder) obj3;
                                sv0.a aVar4 = sv0.a.f161025a;
                                ((Scope) obj2).getClass();
                                parametersHolder3.getClass();
                                return new cw0.a((dw0.a) parametersHolder3.elementAt(0, s0.f105811a.b(dw0.a.class)));
                            case 20:
                                sv0.c cVar20 = sv0.c.f161028a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new tv0.b();
                            case 21:
                                Scope scope12 = (Scope) obj2;
                                sv0.c cVar21 = sv0.c.f161028a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var8 = s0.f105811a;
                                return new v((qv0.a) scope12.get((d<?>) t0Var8.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope12.get((d<?>) t0Var8.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.b) scope12.get((d<?>) t0Var8.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                sv0.c cVar22 = sv0.c.f161028a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (nv0.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, nv0.a.class, new h.a[0], null, null, null, 88);
                            case 23:
                                Scope scope13 = (Scope) obj2;
                                sv0.c cVar23 = sv0.c.f161028a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new t((tv0.b) scope13.get((d<?>) s0.f105811a.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 24:
                                Scope scope14 = (Scope) obj2;
                                sv0.c cVar24 = sv0.c.f161028a;
                                scope14.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var9 = s0.f105811a;
                                return new k((qv0.a) scope14.get((d<?>) t0Var9.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope14.get((d<?>) t0Var9.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                Scope scope15 = (Scope) obj2;
                                sv0.c cVar25 = sv0.c.f161028a;
                                scope15.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var10 = s0.f105811a;
                                return new m((tv0.a) scope15.get((d<?>) t0Var10.b(tv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (w) scope15.get((d<?>) t0Var10.b(w.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.i) scope15.get((d<?>) t0Var10.b(tv0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (s) scope15.get((d<?>) t0Var10.b(s.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.b) scope15.get((d<?>) t0Var10.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (qv0.a) scope15.get((d<?>) t0Var10.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope15.get((d<?>) t0Var10.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (fw0.a) scope15.get((d<?>) t0Var10.b(fw0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                Scope scope16 = (Scope) obj2;
                                ParametersHolder parametersHolder4 = (ParametersHolder) obj3;
                                sv0.c cVar26 = sv0.c.f161028a;
                                scope16.getClass();
                                parametersHolder4.getClass();
                                t0 t0Var11 = s0.f105811a;
                                return new u((rv0.a) scope16.get((d<?>) t0Var11.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (qv0.a) scope16.get((d<?>) t0Var11.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (l) scope16.get((d<?>) t0Var11.b(l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.d) scope16.get((d<?>) t0Var11.b(tv0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (g) scope16.get((d<?>) t0Var11.b(g.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (v) scope16.get((d<?>) t0Var11.b(v.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.f) scope16.get((d<?>) t0Var11.b(tv0.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (b63.o) parametersHolder4.elementAt(0, t0Var11.b(b63.o.class)), (o82.g) parametersHolder4.elementAt(1, t0Var11.b(o82.g.class)));
                            case 27:
                                Scope scope17 = (Scope) obj2;
                                sv0.c cVar27 = sv0.c.f161028a;
                                scope17.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var12 = s0.f105811a;
                                return new a0((tv0.c) scope17.get((d<?>) t0Var12.b(tv0.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (s) scope17.get((d<?>) t0Var12.b(s.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (fw0.a) scope17.get((d<?>) t0Var12.b(fw0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                Scope scope18 = (Scope) obj2;
                                sv0.c cVar28 = sv0.c.f161028a;
                                scope18.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var13 = s0.f105811a;
                                return new r((tv0.a) scope18.get((d<?>) t0Var13.b(tv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (w) scope18.get((d<?>) t0Var13.b(w.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.i) scope18.get((d<?>) t0Var13.b(tv0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (t) scope18.get((d<?>) t0Var13.b(t.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope18.get((d<?>) t0Var13.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                Scope scope19 = (Scope) obj2;
                                sv0.c cVar29 = sv0.c.f161028a;
                                scope19.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var14 = s0.f105811a;
                                return new nw0.g((rv0.a) scope19.get((d<?>) t0Var14.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.d) scope19.get((d<?>) t0Var14.b(tv0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.b) scope19.get((d<?>) t0Var14.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                        }
                    }
                }, kind2, j0Var2), module2));
                final int i29 = 11;
                new KoinDefinition(module2, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(pt0.o.class), null, new e23.p() { // from class: st0.b
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i29) {
                            case 0:
                                Scope scope = (Scope) obj2;
                                c cVar2 = c.f160846a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new p3((i) scope.get((d<?>) s0.f105811a.b(i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                Scope scope2 = (Scope) obj2;
                                c cVar3 = c.f160846a;
                                scope2.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new i0((kt0.a) scope2.get((d<?>) s0.f105811a.b(kt0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 2:
                                Scope scope3 = (Scope) obj2;
                                c cVar4 = c.f160846a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var3 = s0.f105811a;
                                return new j0((lt0.d) scope3.get((d<?>) t0Var3.b(lt0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (i0) scope3.get((d<?>) t0Var3.b(i0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                c cVar5 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (lt0.c) ez0.b.a(ez0.b.f67468a, ez0.c.GC, lt0.c.class, new h.a[0], null, null, null, 120);
                            case 4:
                                Scope scope4 = (Scope) obj2;
                                c cVar6 = c.f160846a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var4 = s0.f105811a;
                                return new x((lt0.c) scope4.get((d<?>) t0Var4.b(lt0.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (i0) scope4.get((d<?>) t0Var4.b(i0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 5:
                                c cVar7 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (f) ez0.b.a(ez0.b.f67468a, ez0.c.GC, f.class, new h.a[0], null, null, null, 120);
                            case 6:
                                Scope scope5 = (Scope) obj2;
                                c cVar8 = c.f160846a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var5 = s0.f105811a;
                                return new f1((f) scope5.get((d<?>) t0Var5.b(f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (lt0.d) scope5.get((d<?>) t0Var5.b(lt0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 7:
                                c cVar9 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (lt0.d) ez0.b.a(ez0.b.f67468a, ez0.c.GC, lt0.d.class, new h.a[0], null, null, null, 120);
                            case 8:
                                c cVar10 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (su.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, su.a.class, new h.a[0], null, null, null, 120);
                            case 9:
                                Scope scope6 = (Scope) obj2;
                                c cVar11 = c.f160846a;
                                scope6.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new yt0.a((lt0.a) scope6.get((d<?>) s0.f105811a.b(lt0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                Scope scope7 = (Scope) obj2;
                                c cVar12 = c.f160846a;
                                scope7.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var6 = s0.f105811a;
                                return new f0((yt0.s0) scope7.get((d<?>) t0Var6.b(yt0.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (r0) scope7.get((d<?>) t0Var6.b(r0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                c cVar13 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new o();
                            case 12:
                                c cVar14 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new n();
                            case 13:
                                c cVar15 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new i3(e20.a.C1315a.a(e20.a.f62587b));
                            case 14:
                                Scope scope8 = (Scope) obj2;
                                c cVar16 = c.f160846a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new o0((yt0.s0) scope8.get((d<?>) s0.f105811a.b(yt0.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                Scope scope9 = (Scope) obj2;
                                c cVar17 = c.f160846a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var7 = s0.f105811a;
                                return new z((yt0.s0) scope9.get((d<?>) t0Var7.b(yt0.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (i0) scope9.get((d<?>) t0Var7.b(i0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 16:
                                Scope scope10 = (Scope) obj2;
                                c cVar18 = c.f160846a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new p((r0) scope10.get((d<?>) s0.f105811a.b(r0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 17:
                                Scope scope11 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                c cVar19 = c.f160846a;
                                scope11.getClass();
                                parametersHolder.getClass();
                                return new h4((String) parametersHolder.get(0), (String) parametersHolder.get(1), ((Number) parametersHolder.get(2)).longValue(), (f1) scope11.get((d<?>) s0.f105811a.b(f1.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 18:
                                ParametersHolder parametersHolder2 = (ParametersHolder) obj3;
                                sv0.a aVar3 = sv0.a.f161025a;
                                ((Scope) obj2).getClass();
                                parametersHolder2.getClass();
                                return new dw0.a(new uv0.b((r53.i) parametersHolder2.elementAt(0, s0.f105811a.b(r53.i.class))));
                            case 19:
                                ParametersHolder parametersHolder3 = (ParametersHolder) obj3;
                                sv0.a aVar4 = sv0.a.f161025a;
                                ((Scope) obj2).getClass();
                                parametersHolder3.getClass();
                                return new cw0.a((dw0.a) parametersHolder3.elementAt(0, s0.f105811a.b(dw0.a.class)));
                            case 20:
                                sv0.c cVar20 = sv0.c.f161028a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new tv0.b();
                            case 21:
                                Scope scope12 = (Scope) obj2;
                                sv0.c cVar21 = sv0.c.f161028a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var8 = s0.f105811a;
                                return new v((qv0.a) scope12.get((d<?>) t0Var8.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope12.get((d<?>) t0Var8.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.b) scope12.get((d<?>) t0Var8.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                sv0.c cVar22 = sv0.c.f161028a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (nv0.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, nv0.a.class, new h.a[0], null, null, null, 88);
                            case 23:
                                Scope scope13 = (Scope) obj2;
                                sv0.c cVar23 = sv0.c.f161028a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new t((tv0.b) scope13.get((d<?>) s0.f105811a.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 24:
                                Scope scope14 = (Scope) obj2;
                                sv0.c cVar24 = sv0.c.f161028a;
                                scope14.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var9 = s0.f105811a;
                                return new k((qv0.a) scope14.get((d<?>) t0Var9.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope14.get((d<?>) t0Var9.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                Scope scope15 = (Scope) obj2;
                                sv0.c cVar25 = sv0.c.f161028a;
                                scope15.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var10 = s0.f105811a;
                                return new m((tv0.a) scope15.get((d<?>) t0Var10.b(tv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (w) scope15.get((d<?>) t0Var10.b(w.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.i) scope15.get((d<?>) t0Var10.b(tv0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (s) scope15.get((d<?>) t0Var10.b(s.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.b) scope15.get((d<?>) t0Var10.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (qv0.a) scope15.get((d<?>) t0Var10.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope15.get((d<?>) t0Var10.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (fw0.a) scope15.get((d<?>) t0Var10.b(fw0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                Scope scope16 = (Scope) obj2;
                                ParametersHolder parametersHolder4 = (ParametersHolder) obj3;
                                sv0.c cVar26 = sv0.c.f161028a;
                                scope16.getClass();
                                parametersHolder4.getClass();
                                t0 t0Var11 = s0.f105811a;
                                return new u((rv0.a) scope16.get((d<?>) t0Var11.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (qv0.a) scope16.get((d<?>) t0Var11.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (l) scope16.get((d<?>) t0Var11.b(l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.d) scope16.get((d<?>) t0Var11.b(tv0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (g) scope16.get((d<?>) t0Var11.b(g.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (v) scope16.get((d<?>) t0Var11.b(v.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.f) scope16.get((d<?>) t0Var11.b(tv0.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (b63.o) parametersHolder4.elementAt(0, t0Var11.b(b63.o.class)), (o82.g) parametersHolder4.elementAt(1, t0Var11.b(o82.g.class)));
                            case 27:
                                Scope scope17 = (Scope) obj2;
                                sv0.c cVar27 = sv0.c.f161028a;
                                scope17.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var12 = s0.f105811a;
                                return new a0((tv0.c) scope17.get((d<?>) t0Var12.b(tv0.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (s) scope17.get((d<?>) t0Var12.b(s.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (fw0.a) scope17.get((d<?>) t0Var12.b(fw0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                Scope scope18 = (Scope) obj2;
                                sv0.c cVar28 = sv0.c.f161028a;
                                scope18.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var13 = s0.f105811a;
                                return new r((tv0.a) scope18.get((d<?>) t0Var13.b(tv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (w) scope18.get((d<?>) t0Var13.b(w.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.i) scope18.get((d<?>) t0Var13.b(tv0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (t) scope18.get((d<?>) t0Var13.b(t.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope18.get((d<?>) t0Var13.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                Scope scope19 = (Scope) obj2;
                                sv0.c cVar29 = sv0.c.f161028a;
                                scope19.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var14 = s0.f105811a;
                                return new nw0.g((rv0.a) scope19.get((d<?>) t0Var14.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.d) scope19.get((d<?>) t0Var14.b(tv0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.b) scope19.get((d<?>) t0Var14.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                        }
                    }
                }, kind2, j0Var2), module2));
                final int i30 = 12;
                new KoinDefinition(module2, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(pt0.n.class), null, new e23.p() { // from class: st0.b
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i30) {
                            case 0:
                                Scope scope = (Scope) obj2;
                                c cVar2 = c.f160846a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new p3((i) scope.get((d<?>) s0.f105811a.b(i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                Scope scope2 = (Scope) obj2;
                                c cVar3 = c.f160846a;
                                scope2.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new i0((kt0.a) scope2.get((d<?>) s0.f105811a.b(kt0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 2:
                                Scope scope3 = (Scope) obj2;
                                c cVar4 = c.f160846a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var3 = s0.f105811a;
                                return new j0((lt0.d) scope3.get((d<?>) t0Var3.b(lt0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (i0) scope3.get((d<?>) t0Var3.b(i0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                c cVar5 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (lt0.c) ez0.b.a(ez0.b.f67468a, ez0.c.GC, lt0.c.class, new h.a[0], null, null, null, 120);
                            case 4:
                                Scope scope4 = (Scope) obj2;
                                c cVar6 = c.f160846a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var4 = s0.f105811a;
                                return new x((lt0.c) scope4.get((d<?>) t0Var4.b(lt0.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (i0) scope4.get((d<?>) t0Var4.b(i0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 5:
                                c cVar7 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (f) ez0.b.a(ez0.b.f67468a, ez0.c.GC, f.class, new h.a[0], null, null, null, 120);
                            case 6:
                                Scope scope5 = (Scope) obj2;
                                c cVar8 = c.f160846a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var5 = s0.f105811a;
                                return new f1((f) scope5.get((d<?>) t0Var5.b(f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (lt0.d) scope5.get((d<?>) t0Var5.b(lt0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 7:
                                c cVar9 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (lt0.d) ez0.b.a(ez0.b.f67468a, ez0.c.GC, lt0.d.class, new h.a[0], null, null, null, 120);
                            case 8:
                                c cVar10 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (su.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, su.a.class, new h.a[0], null, null, null, 120);
                            case 9:
                                Scope scope6 = (Scope) obj2;
                                c cVar11 = c.f160846a;
                                scope6.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new yt0.a((lt0.a) scope6.get((d<?>) s0.f105811a.b(lt0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                Scope scope7 = (Scope) obj2;
                                c cVar12 = c.f160846a;
                                scope7.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var6 = s0.f105811a;
                                return new f0((yt0.s0) scope7.get((d<?>) t0Var6.b(yt0.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (r0) scope7.get((d<?>) t0Var6.b(r0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                c cVar13 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new o();
                            case 12:
                                c cVar14 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new n();
                            case 13:
                                c cVar15 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new i3(e20.a.C1315a.a(e20.a.f62587b));
                            case 14:
                                Scope scope8 = (Scope) obj2;
                                c cVar16 = c.f160846a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new o0((yt0.s0) scope8.get((d<?>) s0.f105811a.b(yt0.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                Scope scope9 = (Scope) obj2;
                                c cVar17 = c.f160846a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var7 = s0.f105811a;
                                return new z((yt0.s0) scope9.get((d<?>) t0Var7.b(yt0.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (i0) scope9.get((d<?>) t0Var7.b(i0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 16:
                                Scope scope10 = (Scope) obj2;
                                c cVar18 = c.f160846a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new p((r0) scope10.get((d<?>) s0.f105811a.b(r0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 17:
                                Scope scope11 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                c cVar19 = c.f160846a;
                                scope11.getClass();
                                parametersHolder.getClass();
                                return new h4((String) parametersHolder.get(0), (String) parametersHolder.get(1), ((Number) parametersHolder.get(2)).longValue(), (f1) scope11.get((d<?>) s0.f105811a.b(f1.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 18:
                                ParametersHolder parametersHolder2 = (ParametersHolder) obj3;
                                sv0.a aVar3 = sv0.a.f161025a;
                                ((Scope) obj2).getClass();
                                parametersHolder2.getClass();
                                return new dw0.a(new uv0.b((r53.i) parametersHolder2.elementAt(0, s0.f105811a.b(r53.i.class))));
                            case 19:
                                ParametersHolder parametersHolder3 = (ParametersHolder) obj3;
                                sv0.a aVar4 = sv0.a.f161025a;
                                ((Scope) obj2).getClass();
                                parametersHolder3.getClass();
                                return new cw0.a((dw0.a) parametersHolder3.elementAt(0, s0.f105811a.b(dw0.a.class)));
                            case 20:
                                sv0.c cVar20 = sv0.c.f161028a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new tv0.b();
                            case 21:
                                Scope scope12 = (Scope) obj2;
                                sv0.c cVar21 = sv0.c.f161028a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var8 = s0.f105811a;
                                return new v((qv0.a) scope12.get((d<?>) t0Var8.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope12.get((d<?>) t0Var8.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.b) scope12.get((d<?>) t0Var8.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                sv0.c cVar22 = sv0.c.f161028a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (nv0.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, nv0.a.class, new h.a[0], null, null, null, 88);
                            case 23:
                                Scope scope13 = (Scope) obj2;
                                sv0.c cVar23 = sv0.c.f161028a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new t((tv0.b) scope13.get((d<?>) s0.f105811a.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 24:
                                Scope scope14 = (Scope) obj2;
                                sv0.c cVar24 = sv0.c.f161028a;
                                scope14.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var9 = s0.f105811a;
                                return new k((qv0.a) scope14.get((d<?>) t0Var9.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope14.get((d<?>) t0Var9.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                Scope scope15 = (Scope) obj2;
                                sv0.c cVar25 = sv0.c.f161028a;
                                scope15.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var10 = s0.f105811a;
                                return new m((tv0.a) scope15.get((d<?>) t0Var10.b(tv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (w) scope15.get((d<?>) t0Var10.b(w.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.i) scope15.get((d<?>) t0Var10.b(tv0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (s) scope15.get((d<?>) t0Var10.b(s.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.b) scope15.get((d<?>) t0Var10.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (qv0.a) scope15.get((d<?>) t0Var10.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope15.get((d<?>) t0Var10.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (fw0.a) scope15.get((d<?>) t0Var10.b(fw0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                Scope scope16 = (Scope) obj2;
                                ParametersHolder parametersHolder4 = (ParametersHolder) obj3;
                                sv0.c cVar26 = sv0.c.f161028a;
                                scope16.getClass();
                                parametersHolder4.getClass();
                                t0 t0Var11 = s0.f105811a;
                                return new u((rv0.a) scope16.get((d<?>) t0Var11.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (qv0.a) scope16.get((d<?>) t0Var11.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (l) scope16.get((d<?>) t0Var11.b(l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.d) scope16.get((d<?>) t0Var11.b(tv0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (g) scope16.get((d<?>) t0Var11.b(g.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (v) scope16.get((d<?>) t0Var11.b(v.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.f) scope16.get((d<?>) t0Var11.b(tv0.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (b63.o) parametersHolder4.elementAt(0, t0Var11.b(b63.o.class)), (o82.g) parametersHolder4.elementAt(1, t0Var11.b(o82.g.class)));
                            case 27:
                                Scope scope17 = (Scope) obj2;
                                sv0.c cVar27 = sv0.c.f161028a;
                                scope17.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var12 = s0.f105811a;
                                return new a0((tv0.c) scope17.get((d<?>) t0Var12.b(tv0.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (s) scope17.get((d<?>) t0Var12.b(s.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (fw0.a) scope17.get((d<?>) t0Var12.b(fw0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                Scope scope18 = (Scope) obj2;
                                sv0.c cVar28 = sv0.c.f161028a;
                                scope18.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var13 = s0.f105811a;
                                return new r((tv0.a) scope18.get((d<?>) t0Var13.b(tv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (w) scope18.get((d<?>) t0Var13.b(w.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.i) scope18.get((d<?>) t0Var13.b(tv0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (t) scope18.get((d<?>) t0Var13.b(t.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope18.get((d<?>) t0Var13.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                Scope scope19 = (Scope) obj2;
                                sv0.c cVar29 = sv0.c.f161028a;
                                scope19.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var14 = s0.f105811a;
                                return new nw0.g((rv0.a) scope19.get((d<?>) t0Var14.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.d) scope19.get((d<?>) t0Var14.b(tv0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.b) scope19.get((d<?>) t0Var14.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                        }
                    }
                }, kind2, j0Var2), module2));
                final int i34 = 13;
                new KoinDefinition(module2, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(i3.class), null, new e23.p() { // from class: st0.b
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i34) {
                            case 0:
                                Scope scope = (Scope) obj2;
                                c cVar2 = c.f160846a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new p3((i) scope.get((d<?>) s0.f105811a.b(i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                Scope scope2 = (Scope) obj2;
                                c cVar3 = c.f160846a;
                                scope2.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new i0((kt0.a) scope2.get((d<?>) s0.f105811a.b(kt0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 2:
                                Scope scope3 = (Scope) obj2;
                                c cVar4 = c.f160846a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var3 = s0.f105811a;
                                return new j0((lt0.d) scope3.get((d<?>) t0Var3.b(lt0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (i0) scope3.get((d<?>) t0Var3.b(i0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                c cVar5 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (lt0.c) ez0.b.a(ez0.b.f67468a, ez0.c.GC, lt0.c.class, new h.a[0], null, null, null, 120);
                            case 4:
                                Scope scope4 = (Scope) obj2;
                                c cVar6 = c.f160846a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var4 = s0.f105811a;
                                return new x((lt0.c) scope4.get((d<?>) t0Var4.b(lt0.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (i0) scope4.get((d<?>) t0Var4.b(i0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 5:
                                c cVar7 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (f) ez0.b.a(ez0.b.f67468a, ez0.c.GC, f.class, new h.a[0], null, null, null, 120);
                            case 6:
                                Scope scope5 = (Scope) obj2;
                                c cVar8 = c.f160846a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var5 = s0.f105811a;
                                return new f1((f) scope5.get((d<?>) t0Var5.b(f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (lt0.d) scope5.get((d<?>) t0Var5.b(lt0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 7:
                                c cVar9 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (lt0.d) ez0.b.a(ez0.b.f67468a, ez0.c.GC, lt0.d.class, new h.a[0], null, null, null, 120);
                            case 8:
                                c cVar10 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (su.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, su.a.class, new h.a[0], null, null, null, 120);
                            case 9:
                                Scope scope6 = (Scope) obj2;
                                c cVar11 = c.f160846a;
                                scope6.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new yt0.a((lt0.a) scope6.get((d<?>) s0.f105811a.b(lt0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                Scope scope7 = (Scope) obj2;
                                c cVar12 = c.f160846a;
                                scope7.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var6 = s0.f105811a;
                                return new f0((yt0.s0) scope7.get((d<?>) t0Var6.b(yt0.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (r0) scope7.get((d<?>) t0Var6.b(r0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                c cVar13 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new o();
                            case 12:
                                c cVar14 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new n();
                            case 13:
                                c cVar15 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new i3(e20.a.C1315a.a(e20.a.f62587b));
                            case 14:
                                Scope scope8 = (Scope) obj2;
                                c cVar16 = c.f160846a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new o0((yt0.s0) scope8.get((d<?>) s0.f105811a.b(yt0.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                Scope scope9 = (Scope) obj2;
                                c cVar17 = c.f160846a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var7 = s0.f105811a;
                                return new z((yt0.s0) scope9.get((d<?>) t0Var7.b(yt0.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (i0) scope9.get((d<?>) t0Var7.b(i0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 16:
                                Scope scope10 = (Scope) obj2;
                                c cVar18 = c.f160846a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new p((r0) scope10.get((d<?>) s0.f105811a.b(r0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 17:
                                Scope scope11 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                c cVar19 = c.f160846a;
                                scope11.getClass();
                                parametersHolder.getClass();
                                return new h4((String) parametersHolder.get(0), (String) parametersHolder.get(1), ((Number) parametersHolder.get(2)).longValue(), (f1) scope11.get((d<?>) s0.f105811a.b(f1.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 18:
                                ParametersHolder parametersHolder2 = (ParametersHolder) obj3;
                                sv0.a aVar3 = sv0.a.f161025a;
                                ((Scope) obj2).getClass();
                                parametersHolder2.getClass();
                                return new dw0.a(new uv0.b((r53.i) parametersHolder2.elementAt(0, s0.f105811a.b(r53.i.class))));
                            case 19:
                                ParametersHolder parametersHolder3 = (ParametersHolder) obj3;
                                sv0.a aVar4 = sv0.a.f161025a;
                                ((Scope) obj2).getClass();
                                parametersHolder3.getClass();
                                return new cw0.a((dw0.a) parametersHolder3.elementAt(0, s0.f105811a.b(dw0.a.class)));
                            case 20:
                                sv0.c cVar20 = sv0.c.f161028a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new tv0.b();
                            case 21:
                                Scope scope12 = (Scope) obj2;
                                sv0.c cVar21 = sv0.c.f161028a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var8 = s0.f105811a;
                                return new v((qv0.a) scope12.get((d<?>) t0Var8.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope12.get((d<?>) t0Var8.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.b) scope12.get((d<?>) t0Var8.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                sv0.c cVar22 = sv0.c.f161028a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (nv0.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, nv0.a.class, new h.a[0], null, null, null, 88);
                            case 23:
                                Scope scope13 = (Scope) obj2;
                                sv0.c cVar23 = sv0.c.f161028a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new t((tv0.b) scope13.get((d<?>) s0.f105811a.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 24:
                                Scope scope14 = (Scope) obj2;
                                sv0.c cVar24 = sv0.c.f161028a;
                                scope14.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var9 = s0.f105811a;
                                return new k((qv0.a) scope14.get((d<?>) t0Var9.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope14.get((d<?>) t0Var9.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                Scope scope15 = (Scope) obj2;
                                sv0.c cVar25 = sv0.c.f161028a;
                                scope15.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var10 = s0.f105811a;
                                return new m((tv0.a) scope15.get((d<?>) t0Var10.b(tv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (w) scope15.get((d<?>) t0Var10.b(w.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.i) scope15.get((d<?>) t0Var10.b(tv0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (s) scope15.get((d<?>) t0Var10.b(s.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.b) scope15.get((d<?>) t0Var10.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (qv0.a) scope15.get((d<?>) t0Var10.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope15.get((d<?>) t0Var10.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (fw0.a) scope15.get((d<?>) t0Var10.b(fw0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                Scope scope16 = (Scope) obj2;
                                ParametersHolder parametersHolder4 = (ParametersHolder) obj3;
                                sv0.c cVar26 = sv0.c.f161028a;
                                scope16.getClass();
                                parametersHolder4.getClass();
                                t0 t0Var11 = s0.f105811a;
                                return new u((rv0.a) scope16.get((d<?>) t0Var11.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (qv0.a) scope16.get((d<?>) t0Var11.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (l) scope16.get((d<?>) t0Var11.b(l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.d) scope16.get((d<?>) t0Var11.b(tv0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (g) scope16.get((d<?>) t0Var11.b(g.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (v) scope16.get((d<?>) t0Var11.b(v.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.f) scope16.get((d<?>) t0Var11.b(tv0.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (b63.o) parametersHolder4.elementAt(0, t0Var11.b(b63.o.class)), (o82.g) parametersHolder4.elementAt(1, t0Var11.b(o82.g.class)));
                            case 27:
                                Scope scope17 = (Scope) obj2;
                                sv0.c cVar27 = sv0.c.f161028a;
                                scope17.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var12 = s0.f105811a;
                                return new a0((tv0.c) scope17.get((d<?>) t0Var12.b(tv0.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (s) scope17.get((d<?>) t0Var12.b(s.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (fw0.a) scope17.get((d<?>) t0Var12.b(fw0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                Scope scope18 = (Scope) obj2;
                                sv0.c cVar28 = sv0.c.f161028a;
                                scope18.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var13 = s0.f105811a;
                                return new r((tv0.a) scope18.get((d<?>) t0Var13.b(tv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (w) scope18.get((d<?>) t0Var13.b(w.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.i) scope18.get((d<?>) t0Var13.b(tv0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (t) scope18.get((d<?>) t0Var13.b(t.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope18.get((d<?>) t0Var13.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                Scope scope19 = (Scope) obj2;
                                sv0.c cVar29 = sv0.c.f161028a;
                                scope19.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var14 = s0.f105811a;
                                return new nw0.g((rv0.a) scope19.get((d<?>) t0Var14.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.d) scope19.get((d<?>) t0Var14.b(tv0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.b) scope19.get((d<?>) t0Var14.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                        }
                    }
                }, kind2, j0Var2), module2));
                final int i35 = 14;
                new KoinDefinition(module2, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(pt0.o0.class), null, new e23.p() { // from class: st0.b
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i35) {
                            case 0:
                                Scope scope = (Scope) obj2;
                                c cVar2 = c.f160846a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new p3((i) scope.get((d<?>) s0.f105811a.b(i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                Scope scope2 = (Scope) obj2;
                                c cVar3 = c.f160846a;
                                scope2.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new i0((kt0.a) scope2.get((d<?>) s0.f105811a.b(kt0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 2:
                                Scope scope3 = (Scope) obj2;
                                c cVar4 = c.f160846a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var3 = s0.f105811a;
                                return new j0((lt0.d) scope3.get((d<?>) t0Var3.b(lt0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (i0) scope3.get((d<?>) t0Var3.b(i0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                c cVar5 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (lt0.c) ez0.b.a(ez0.b.f67468a, ez0.c.GC, lt0.c.class, new h.a[0], null, null, null, 120);
                            case 4:
                                Scope scope4 = (Scope) obj2;
                                c cVar6 = c.f160846a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var4 = s0.f105811a;
                                return new x((lt0.c) scope4.get((d<?>) t0Var4.b(lt0.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (i0) scope4.get((d<?>) t0Var4.b(i0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 5:
                                c cVar7 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (f) ez0.b.a(ez0.b.f67468a, ez0.c.GC, f.class, new h.a[0], null, null, null, 120);
                            case 6:
                                Scope scope5 = (Scope) obj2;
                                c cVar8 = c.f160846a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var5 = s0.f105811a;
                                return new f1((f) scope5.get((d<?>) t0Var5.b(f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (lt0.d) scope5.get((d<?>) t0Var5.b(lt0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 7:
                                c cVar9 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (lt0.d) ez0.b.a(ez0.b.f67468a, ez0.c.GC, lt0.d.class, new h.a[0], null, null, null, 120);
                            case 8:
                                c cVar10 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (su.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, su.a.class, new h.a[0], null, null, null, 120);
                            case 9:
                                Scope scope6 = (Scope) obj2;
                                c cVar11 = c.f160846a;
                                scope6.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new yt0.a((lt0.a) scope6.get((d<?>) s0.f105811a.b(lt0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                Scope scope7 = (Scope) obj2;
                                c cVar12 = c.f160846a;
                                scope7.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var6 = s0.f105811a;
                                return new f0((yt0.s0) scope7.get((d<?>) t0Var6.b(yt0.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (r0) scope7.get((d<?>) t0Var6.b(r0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                c cVar13 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new o();
                            case 12:
                                c cVar14 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new n();
                            case 13:
                                c cVar15 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new i3(e20.a.C1315a.a(e20.a.f62587b));
                            case 14:
                                Scope scope8 = (Scope) obj2;
                                c cVar16 = c.f160846a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new o0((yt0.s0) scope8.get((d<?>) s0.f105811a.b(yt0.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                Scope scope9 = (Scope) obj2;
                                c cVar17 = c.f160846a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var7 = s0.f105811a;
                                return new z((yt0.s0) scope9.get((d<?>) t0Var7.b(yt0.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (i0) scope9.get((d<?>) t0Var7.b(i0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 16:
                                Scope scope10 = (Scope) obj2;
                                c cVar18 = c.f160846a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new p((r0) scope10.get((d<?>) s0.f105811a.b(r0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 17:
                                Scope scope11 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                c cVar19 = c.f160846a;
                                scope11.getClass();
                                parametersHolder.getClass();
                                return new h4((String) parametersHolder.get(0), (String) parametersHolder.get(1), ((Number) parametersHolder.get(2)).longValue(), (f1) scope11.get((d<?>) s0.f105811a.b(f1.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 18:
                                ParametersHolder parametersHolder2 = (ParametersHolder) obj3;
                                sv0.a aVar3 = sv0.a.f161025a;
                                ((Scope) obj2).getClass();
                                parametersHolder2.getClass();
                                return new dw0.a(new uv0.b((r53.i) parametersHolder2.elementAt(0, s0.f105811a.b(r53.i.class))));
                            case 19:
                                ParametersHolder parametersHolder3 = (ParametersHolder) obj3;
                                sv0.a aVar4 = sv0.a.f161025a;
                                ((Scope) obj2).getClass();
                                parametersHolder3.getClass();
                                return new cw0.a((dw0.a) parametersHolder3.elementAt(0, s0.f105811a.b(dw0.a.class)));
                            case 20:
                                sv0.c cVar20 = sv0.c.f161028a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new tv0.b();
                            case 21:
                                Scope scope12 = (Scope) obj2;
                                sv0.c cVar21 = sv0.c.f161028a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var8 = s0.f105811a;
                                return new v((qv0.a) scope12.get((d<?>) t0Var8.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope12.get((d<?>) t0Var8.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.b) scope12.get((d<?>) t0Var8.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                sv0.c cVar22 = sv0.c.f161028a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (nv0.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, nv0.a.class, new h.a[0], null, null, null, 88);
                            case 23:
                                Scope scope13 = (Scope) obj2;
                                sv0.c cVar23 = sv0.c.f161028a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new t((tv0.b) scope13.get((d<?>) s0.f105811a.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 24:
                                Scope scope14 = (Scope) obj2;
                                sv0.c cVar24 = sv0.c.f161028a;
                                scope14.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var9 = s0.f105811a;
                                return new k((qv0.a) scope14.get((d<?>) t0Var9.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope14.get((d<?>) t0Var9.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                Scope scope15 = (Scope) obj2;
                                sv0.c cVar25 = sv0.c.f161028a;
                                scope15.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var10 = s0.f105811a;
                                return new m((tv0.a) scope15.get((d<?>) t0Var10.b(tv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (w) scope15.get((d<?>) t0Var10.b(w.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.i) scope15.get((d<?>) t0Var10.b(tv0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (s) scope15.get((d<?>) t0Var10.b(s.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.b) scope15.get((d<?>) t0Var10.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (qv0.a) scope15.get((d<?>) t0Var10.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope15.get((d<?>) t0Var10.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (fw0.a) scope15.get((d<?>) t0Var10.b(fw0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                Scope scope16 = (Scope) obj2;
                                ParametersHolder parametersHolder4 = (ParametersHolder) obj3;
                                sv0.c cVar26 = sv0.c.f161028a;
                                scope16.getClass();
                                parametersHolder4.getClass();
                                t0 t0Var11 = s0.f105811a;
                                return new u((rv0.a) scope16.get((d<?>) t0Var11.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (qv0.a) scope16.get((d<?>) t0Var11.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (l) scope16.get((d<?>) t0Var11.b(l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.d) scope16.get((d<?>) t0Var11.b(tv0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (g) scope16.get((d<?>) t0Var11.b(g.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (v) scope16.get((d<?>) t0Var11.b(v.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.f) scope16.get((d<?>) t0Var11.b(tv0.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (b63.o) parametersHolder4.elementAt(0, t0Var11.b(b63.o.class)), (o82.g) parametersHolder4.elementAt(1, t0Var11.b(o82.g.class)));
                            case 27:
                                Scope scope17 = (Scope) obj2;
                                sv0.c cVar27 = sv0.c.f161028a;
                                scope17.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var12 = s0.f105811a;
                                return new a0((tv0.c) scope17.get((d<?>) t0Var12.b(tv0.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (s) scope17.get((d<?>) t0Var12.b(s.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (fw0.a) scope17.get((d<?>) t0Var12.b(fw0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                Scope scope18 = (Scope) obj2;
                                sv0.c cVar28 = sv0.c.f161028a;
                                scope18.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var13 = s0.f105811a;
                                return new r((tv0.a) scope18.get((d<?>) t0Var13.b(tv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (w) scope18.get((d<?>) t0Var13.b(w.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.i) scope18.get((d<?>) t0Var13.b(tv0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (t) scope18.get((d<?>) t0Var13.b(t.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope18.get((d<?>) t0Var13.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                Scope scope19 = (Scope) obj2;
                                sv0.c cVar29 = sv0.c.f161028a;
                                scope19.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var14 = s0.f105811a;
                                return new nw0.g((rv0.a) scope19.get((d<?>) t0Var14.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.d) scope19.get((d<?>) t0Var14.b(tv0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.b) scope19.get((d<?>) t0Var14.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                        }
                    }
                }, kind2, j0Var2), module2));
                final int i36 = 15;
                new KoinDefinition(module2, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(pt0.z.class), null, new e23.p() { // from class: st0.b
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i36) {
                            case 0:
                                Scope scope = (Scope) obj2;
                                c cVar2 = c.f160846a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new p3((i) scope.get((d<?>) s0.f105811a.b(i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                Scope scope2 = (Scope) obj2;
                                c cVar3 = c.f160846a;
                                scope2.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new i0((kt0.a) scope2.get((d<?>) s0.f105811a.b(kt0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 2:
                                Scope scope3 = (Scope) obj2;
                                c cVar4 = c.f160846a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var3 = s0.f105811a;
                                return new j0((lt0.d) scope3.get((d<?>) t0Var3.b(lt0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (i0) scope3.get((d<?>) t0Var3.b(i0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                c cVar5 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (lt0.c) ez0.b.a(ez0.b.f67468a, ez0.c.GC, lt0.c.class, new h.a[0], null, null, null, 120);
                            case 4:
                                Scope scope4 = (Scope) obj2;
                                c cVar6 = c.f160846a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var4 = s0.f105811a;
                                return new x((lt0.c) scope4.get((d<?>) t0Var4.b(lt0.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (i0) scope4.get((d<?>) t0Var4.b(i0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 5:
                                c cVar7 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (f) ez0.b.a(ez0.b.f67468a, ez0.c.GC, f.class, new h.a[0], null, null, null, 120);
                            case 6:
                                Scope scope5 = (Scope) obj2;
                                c cVar8 = c.f160846a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var5 = s0.f105811a;
                                return new f1((f) scope5.get((d<?>) t0Var5.b(f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (lt0.d) scope5.get((d<?>) t0Var5.b(lt0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 7:
                                c cVar9 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (lt0.d) ez0.b.a(ez0.b.f67468a, ez0.c.GC, lt0.d.class, new h.a[0], null, null, null, 120);
                            case 8:
                                c cVar10 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (su.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, su.a.class, new h.a[0], null, null, null, 120);
                            case 9:
                                Scope scope6 = (Scope) obj2;
                                c cVar11 = c.f160846a;
                                scope6.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new yt0.a((lt0.a) scope6.get((d<?>) s0.f105811a.b(lt0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                Scope scope7 = (Scope) obj2;
                                c cVar12 = c.f160846a;
                                scope7.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var6 = s0.f105811a;
                                return new f0((yt0.s0) scope7.get((d<?>) t0Var6.b(yt0.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (r0) scope7.get((d<?>) t0Var6.b(r0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                c cVar13 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new o();
                            case 12:
                                c cVar14 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new n();
                            case 13:
                                c cVar15 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new i3(e20.a.C1315a.a(e20.a.f62587b));
                            case 14:
                                Scope scope8 = (Scope) obj2;
                                c cVar16 = c.f160846a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new o0((yt0.s0) scope8.get((d<?>) s0.f105811a.b(yt0.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                Scope scope9 = (Scope) obj2;
                                c cVar17 = c.f160846a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var7 = s0.f105811a;
                                return new z((yt0.s0) scope9.get((d<?>) t0Var7.b(yt0.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (i0) scope9.get((d<?>) t0Var7.b(i0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 16:
                                Scope scope10 = (Scope) obj2;
                                c cVar18 = c.f160846a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new p((r0) scope10.get((d<?>) s0.f105811a.b(r0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 17:
                                Scope scope11 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                c cVar19 = c.f160846a;
                                scope11.getClass();
                                parametersHolder.getClass();
                                return new h4((String) parametersHolder.get(0), (String) parametersHolder.get(1), ((Number) parametersHolder.get(2)).longValue(), (f1) scope11.get((d<?>) s0.f105811a.b(f1.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 18:
                                ParametersHolder parametersHolder2 = (ParametersHolder) obj3;
                                sv0.a aVar3 = sv0.a.f161025a;
                                ((Scope) obj2).getClass();
                                parametersHolder2.getClass();
                                return new dw0.a(new uv0.b((r53.i) parametersHolder2.elementAt(0, s0.f105811a.b(r53.i.class))));
                            case 19:
                                ParametersHolder parametersHolder3 = (ParametersHolder) obj3;
                                sv0.a aVar4 = sv0.a.f161025a;
                                ((Scope) obj2).getClass();
                                parametersHolder3.getClass();
                                return new cw0.a((dw0.a) parametersHolder3.elementAt(0, s0.f105811a.b(dw0.a.class)));
                            case 20:
                                sv0.c cVar20 = sv0.c.f161028a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new tv0.b();
                            case 21:
                                Scope scope12 = (Scope) obj2;
                                sv0.c cVar21 = sv0.c.f161028a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var8 = s0.f105811a;
                                return new v((qv0.a) scope12.get((d<?>) t0Var8.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope12.get((d<?>) t0Var8.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.b) scope12.get((d<?>) t0Var8.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                sv0.c cVar22 = sv0.c.f161028a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (nv0.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, nv0.a.class, new h.a[0], null, null, null, 88);
                            case 23:
                                Scope scope13 = (Scope) obj2;
                                sv0.c cVar23 = sv0.c.f161028a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new t((tv0.b) scope13.get((d<?>) s0.f105811a.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 24:
                                Scope scope14 = (Scope) obj2;
                                sv0.c cVar24 = sv0.c.f161028a;
                                scope14.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var9 = s0.f105811a;
                                return new k((qv0.a) scope14.get((d<?>) t0Var9.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope14.get((d<?>) t0Var9.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                Scope scope15 = (Scope) obj2;
                                sv0.c cVar25 = sv0.c.f161028a;
                                scope15.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var10 = s0.f105811a;
                                return new m((tv0.a) scope15.get((d<?>) t0Var10.b(tv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (w) scope15.get((d<?>) t0Var10.b(w.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.i) scope15.get((d<?>) t0Var10.b(tv0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (s) scope15.get((d<?>) t0Var10.b(s.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.b) scope15.get((d<?>) t0Var10.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (qv0.a) scope15.get((d<?>) t0Var10.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope15.get((d<?>) t0Var10.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (fw0.a) scope15.get((d<?>) t0Var10.b(fw0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                Scope scope16 = (Scope) obj2;
                                ParametersHolder parametersHolder4 = (ParametersHolder) obj3;
                                sv0.c cVar26 = sv0.c.f161028a;
                                scope16.getClass();
                                parametersHolder4.getClass();
                                t0 t0Var11 = s0.f105811a;
                                return new u((rv0.a) scope16.get((d<?>) t0Var11.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (qv0.a) scope16.get((d<?>) t0Var11.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (l) scope16.get((d<?>) t0Var11.b(l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.d) scope16.get((d<?>) t0Var11.b(tv0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (g) scope16.get((d<?>) t0Var11.b(g.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (v) scope16.get((d<?>) t0Var11.b(v.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.f) scope16.get((d<?>) t0Var11.b(tv0.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (b63.o) parametersHolder4.elementAt(0, t0Var11.b(b63.o.class)), (o82.g) parametersHolder4.elementAt(1, t0Var11.b(o82.g.class)));
                            case 27:
                                Scope scope17 = (Scope) obj2;
                                sv0.c cVar27 = sv0.c.f161028a;
                                scope17.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var12 = s0.f105811a;
                                return new a0((tv0.c) scope17.get((d<?>) t0Var12.b(tv0.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (s) scope17.get((d<?>) t0Var12.b(s.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (fw0.a) scope17.get((d<?>) t0Var12.b(fw0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                Scope scope18 = (Scope) obj2;
                                sv0.c cVar28 = sv0.c.f161028a;
                                scope18.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var13 = s0.f105811a;
                                return new r((tv0.a) scope18.get((d<?>) t0Var13.b(tv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (w) scope18.get((d<?>) t0Var13.b(w.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.i) scope18.get((d<?>) t0Var13.b(tv0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (t) scope18.get((d<?>) t0Var13.b(t.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope18.get((d<?>) t0Var13.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                Scope scope19 = (Scope) obj2;
                                sv0.c cVar29 = sv0.c.f161028a;
                                scope19.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var14 = s0.f105811a;
                                return new nw0.g((rv0.a) scope19.get((d<?>) t0Var14.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.d) scope19.get((d<?>) t0Var14.b(tv0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.b) scope19.get((d<?>) t0Var14.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                        }
                    }
                }, kind2, j0Var2), module2));
                final int i37 = 16;
                new KoinDefinition(module2, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(pt0.p.class), null, new e23.p() { // from class: st0.b
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i37) {
                            case 0:
                                Scope scope = (Scope) obj2;
                                c cVar2 = c.f160846a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new p3((i) scope.get((d<?>) s0.f105811a.b(i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                Scope scope2 = (Scope) obj2;
                                c cVar3 = c.f160846a;
                                scope2.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new i0((kt0.a) scope2.get((d<?>) s0.f105811a.b(kt0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 2:
                                Scope scope3 = (Scope) obj2;
                                c cVar4 = c.f160846a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var3 = s0.f105811a;
                                return new j0((lt0.d) scope3.get((d<?>) t0Var3.b(lt0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (i0) scope3.get((d<?>) t0Var3.b(i0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                c cVar5 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (lt0.c) ez0.b.a(ez0.b.f67468a, ez0.c.GC, lt0.c.class, new h.a[0], null, null, null, 120);
                            case 4:
                                Scope scope4 = (Scope) obj2;
                                c cVar6 = c.f160846a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var4 = s0.f105811a;
                                return new x((lt0.c) scope4.get((d<?>) t0Var4.b(lt0.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (i0) scope4.get((d<?>) t0Var4.b(i0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 5:
                                c cVar7 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (f) ez0.b.a(ez0.b.f67468a, ez0.c.GC, f.class, new h.a[0], null, null, null, 120);
                            case 6:
                                Scope scope5 = (Scope) obj2;
                                c cVar8 = c.f160846a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var5 = s0.f105811a;
                                return new f1((f) scope5.get((d<?>) t0Var5.b(f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (lt0.d) scope5.get((d<?>) t0Var5.b(lt0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 7:
                                c cVar9 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (lt0.d) ez0.b.a(ez0.b.f67468a, ez0.c.GC, lt0.d.class, new h.a[0], null, null, null, 120);
                            case 8:
                                c cVar10 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (su.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, su.a.class, new h.a[0], null, null, null, 120);
                            case 9:
                                Scope scope6 = (Scope) obj2;
                                c cVar11 = c.f160846a;
                                scope6.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new yt0.a((lt0.a) scope6.get((d<?>) s0.f105811a.b(lt0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                Scope scope7 = (Scope) obj2;
                                c cVar12 = c.f160846a;
                                scope7.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var6 = s0.f105811a;
                                return new f0((yt0.s0) scope7.get((d<?>) t0Var6.b(yt0.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (r0) scope7.get((d<?>) t0Var6.b(r0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                c cVar13 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new o();
                            case 12:
                                c cVar14 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new n();
                            case 13:
                                c cVar15 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new i3(e20.a.C1315a.a(e20.a.f62587b));
                            case 14:
                                Scope scope8 = (Scope) obj2;
                                c cVar16 = c.f160846a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new o0((yt0.s0) scope8.get((d<?>) s0.f105811a.b(yt0.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                Scope scope9 = (Scope) obj2;
                                c cVar17 = c.f160846a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var7 = s0.f105811a;
                                return new z((yt0.s0) scope9.get((d<?>) t0Var7.b(yt0.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (i0) scope9.get((d<?>) t0Var7.b(i0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 16:
                                Scope scope10 = (Scope) obj2;
                                c cVar18 = c.f160846a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new p((r0) scope10.get((d<?>) s0.f105811a.b(r0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 17:
                                Scope scope11 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                c cVar19 = c.f160846a;
                                scope11.getClass();
                                parametersHolder.getClass();
                                return new h4((String) parametersHolder.get(0), (String) parametersHolder.get(1), ((Number) parametersHolder.get(2)).longValue(), (f1) scope11.get((d<?>) s0.f105811a.b(f1.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 18:
                                ParametersHolder parametersHolder2 = (ParametersHolder) obj3;
                                sv0.a aVar3 = sv0.a.f161025a;
                                ((Scope) obj2).getClass();
                                parametersHolder2.getClass();
                                return new dw0.a(new uv0.b((r53.i) parametersHolder2.elementAt(0, s0.f105811a.b(r53.i.class))));
                            case 19:
                                ParametersHolder parametersHolder3 = (ParametersHolder) obj3;
                                sv0.a aVar4 = sv0.a.f161025a;
                                ((Scope) obj2).getClass();
                                parametersHolder3.getClass();
                                return new cw0.a((dw0.a) parametersHolder3.elementAt(0, s0.f105811a.b(dw0.a.class)));
                            case 20:
                                sv0.c cVar20 = sv0.c.f161028a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new tv0.b();
                            case 21:
                                Scope scope12 = (Scope) obj2;
                                sv0.c cVar21 = sv0.c.f161028a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var8 = s0.f105811a;
                                return new v((qv0.a) scope12.get((d<?>) t0Var8.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope12.get((d<?>) t0Var8.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.b) scope12.get((d<?>) t0Var8.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                sv0.c cVar22 = sv0.c.f161028a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (nv0.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, nv0.a.class, new h.a[0], null, null, null, 88);
                            case 23:
                                Scope scope13 = (Scope) obj2;
                                sv0.c cVar23 = sv0.c.f161028a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new t((tv0.b) scope13.get((d<?>) s0.f105811a.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 24:
                                Scope scope14 = (Scope) obj2;
                                sv0.c cVar24 = sv0.c.f161028a;
                                scope14.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var9 = s0.f105811a;
                                return new k((qv0.a) scope14.get((d<?>) t0Var9.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope14.get((d<?>) t0Var9.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                Scope scope15 = (Scope) obj2;
                                sv0.c cVar25 = sv0.c.f161028a;
                                scope15.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var10 = s0.f105811a;
                                return new m((tv0.a) scope15.get((d<?>) t0Var10.b(tv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (w) scope15.get((d<?>) t0Var10.b(w.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.i) scope15.get((d<?>) t0Var10.b(tv0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (s) scope15.get((d<?>) t0Var10.b(s.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.b) scope15.get((d<?>) t0Var10.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (qv0.a) scope15.get((d<?>) t0Var10.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope15.get((d<?>) t0Var10.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (fw0.a) scope15.get((d<?>) t0Var10.b(fw0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                Scope scope16 = (Scope) obj2;
                                ParametersHolder parametersHolder4 = (ParametersHolder) obj3;
                                sv0.c cVar26 = sv0.c.f161028a;
                                scope16.getClass();
                                parametersHolder4.getClass();
                                t0 t0Var11 = s0.f105811a;
                                return new u((rv0.a) scope16.get((d<?>) t0Var11.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (qv0.a) scope16.get((d<?>) t0Var11.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (l) scope16.get((d<?>) t0Var11.b(l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.d) scope16.get((d<?>) t0Var11.b(tv0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (g) scope16.get((d<?>) t0Var11.b(g.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (v) scope16.get((d<?>) t0Var11.b(v.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.f) scope16.get((d<?>) t0Var11.b(tv0.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (b63.o) parametersHolder4.elementAt(0, t0Var11.b(b63.o.class)), (o82.g) parametersHolder4.elementAt(1, t0Var11.b(o82.g.class)));
                            case 27:
                                Scope scope17 = (Scope) obj2;
                                sv0.c cVar27 = sv0.c.f161028a;
                                scope17.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var12 = s0.f105811a;
                                return new a0((tv0.c) scope17.get((d<?>) t0Var12.b(tv0.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (s) scope17.get((d<?>) t0Var12.b(s.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (fw0.a) scope17.get((d<?>) t0Var12.b(fw0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                Scope scope18 = (Scope) obj2;
                                sv0.c cVar28 = sv0.c.f161028a;
                                scope18.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var13 = s0.f105811a;
                                return new r((tv0.a) scope18.get((d<?>) t0Var13.b(tv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (w) scope18.get((d<?>) t0Var13.b(w.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.i) scope18.get((d<?>) t0Var13.b(tv0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (t) scope18.get((d<?>) t0Var13.b(t.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope18.get((d<?>) t0Var13.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                Scope scope19 = (Scope) obj2;
                                sv0.c cVar29 = sv0.c.f161028a;
                                scope19.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var14 = s0.f105811a;
                                return new nw0.g((rv0.a) scope19.get((d<?>) t0Var14.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.d) scope19.get((d<?>) t0Var14.b(tv0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.b) scope19.get((d<?>) t0Var14.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                        }
                    }
                }, kind2, j0Var2), module2));
                final int i38 = 17;
                new KoinDefinition(module2, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(h4.class), null, new e23.p() { // from class: st0.b
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i38) {
                            case 0:
                                Scope scope = (Scope) obj2;
                                c cVar2 = c.f160846a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new p3((i) scope.get((d<?>) s0.f105811a.b(i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                Scope scope2 = (Scope) obj2;
                                c cVar3 = c.f160846a;
                                scope2.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new i0((kt0.a) scope2.get((d<?>) s0.f105811a.b(kt0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 2:
                                Scope scope3 = (Scope) obj2;
                                c cVar4 = c.f160846a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var3 = s0.f105811a;
                                return new j0((lt0.d) scope3.get((d<?>) t0Var3.b(lt0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (i0) scope3.get((d<?>) t0Var3.b(i0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                c cVar5 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (lt0.c) ez0.b.a(ez0.b.f67468a, ez0.c.GC, lt0.c.class, new h.a[0], null, null, null, 120);
                            case 4:
                                Scope scope4 = (Scope) obj2;
                                c cVar6 = c.f160846a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var4 = s0.f105811a;
                                return new x((lt0.c) scope4.get((d<?>) t0Var4.b(lt0.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (i0) scope4.get((d<?>) t0Var4.b(i0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 5:
                                c cVar7 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (f) ez0.b.a(ez0.b.f67468a, ez0.c.GC, f.class, new h.a[0], null, null, null, 120);
                            case 6:
                                Scope scope5 = (Scope) obj2;
                                c cVar8 = c.f160846a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var5 = s0.f105811a;
                                return new f1((f) scope5.get((d<?>) t0Var5.b(f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (lt0.d) scope5.get((d<?>) t0Var5.b(lt0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 7:
                                c cVar9 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (lt0.d) ez0.b.a(ez0.b.f67468a, ez0.c.GC, lt0.d.class, new h.a[0], null, null, null, 120);
                            case 8:
                                c cVar10 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (su.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, su.a.class, new h.a[0], null, null, null, 120);
                            case 9:
                                Scope scope6 = (Scope) obj2;
                                c cVar11 = c.f160846a;
                                scope6.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new yt0.a((lt0.a) scope6.get((d<?>) s0.f105811a.b(lt0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                Scope scope7 = (Scope) obj2;
                                c cVar12 = c.f160846a;
                                scope7.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var6 = s0.f105811a;
                                return new f0((yt0.s0) scope7.get((d<?>) t0Var6.b(yt0.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (r0) scope7.get((d<?>) t0Var6.b(r0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                c cVar13 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new o();
                            case 12:
                                c cVar14 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new n();
                            case 13:
                                c cVar15 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new i3(e20.a.C1315a.a(e20.a.f62587b));
                            case 14:
                                Scope scope8 = (Scope) obj2;
                                c cVar16 = c.f160846a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new o0((yt0.s0) scope8.get((d<?>) s0.f105811a.b(yt0.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                Scope scope9 = (Scope) obj2;
                                c cVar17 = c.f160846a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var7 = s0.f105811a;
                                return new z((yt0.s0) scope9.get((d<?>) t0Var7.b(yt0.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (i0) scope9.get((d<?>) t0Var7.b(i0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 16:
                                Scope scope10 = (Scope) obj2;
                                c cVar18 = c.f160846a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new p((r0) scope10.get((d<?>) s0.f105811a.b(r0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 17:
                                Scope scope11 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                c cVar19 = c.f160846a;
                                scope11.getClass();
                                parametersHolder.getClass();
                                return new h4((String) parametersHolder.get(0), (String) parametersHolder.get(1), ((Number) parametersHolder.get(2)).longValue(), (f1) scope11.get((d<?>) s0.f105811a.b(f1.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 18:
                                ParametersHolder parametersHolder2 = (ParametersHolder) obj3;
                                sv0.a aVar3 = sv0.a.f161025a;
                                ((Scope) obj2).getClass();
                                parametersHolder2.getClass();
                                return new dw0.a(new uv0.b((r53.i) parametersHolder2.elementAt(0, s0.f105811a.b(r53.i.class))));
                            case 19:
                                ParametersHolder parametersHolder3 = (ParametersHolder) obj3;
                                sv0.a aVar4 = sv0.a.f161025a;
                                ((Scope) obj2).getClass();
                                parametersHolder3.getClass();
                                return new cw0.a((dw0.a) parametersHolder3.elementAt(0, s0.f105811a.b(dw0.a.class)));
                            case 20:
                                sv0.c cVar20 = sv0.c.f161028a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new tv0.b();
                            case 21:
                                Scope scope12 = (Scope) obj2;
                                sv0.c cVar21 = sv0.c.f161028a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var8 = s0.f105811a;
                                return new v((qv0.a) scope12.get((d<?>) t0Var8.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope12.get((d<?>) t0Var8.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.b) scope12.get((d<?>) t0Var8.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                sv0.c cVar22 = sv0.c.f161028a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (nv0.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, nv0.a.class, new h.a[0], null, null, null, 88);
                            case 23:
                                Scope scope13 = (Scope) obj2;
                                sv0.c cVar23 = sv0.c.f161028a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new t((tv0.b) scope13.get((d<?>) s0.f105811a.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 24:
                                Scope scope14 = (Scope) obj2;
                                sv0.c cVar24 = sv0.c.f161028a;
                                scope14.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var9 = s0.f105811a;
                                return new k((qv0.a) scope14.get((d<?>) t0Var9.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope14.get((d<?>) t0Var9.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                Scope scope15 = (Scope) obj2;
                                sv0.c cVar25 = sv0.c.f161028a;
                                scope15.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var10 = s0.f105811a;
                                return new m((tv0.a) scope15.get((d<?>) t0Var10.b(tv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (w) scope15.get((d<?>) t0Var10.b(w.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.i) scope15.get((d<?>) t0Var10.b(tv0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (s) scope15.get((d<?>) t0Var10.b(s.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.b) scope15.get((d<?>) t0Var10.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (qv0.a) scope15.get((d<?>) t0Var10.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope15.get((d<?>) t0Var10.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (fw0.a) scope15.get((d<?>) t0Var10.b(fw0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                Scope scope16 = (Scope) obj2;
                                ParametersHolder parametersHolder4 = (ParametersHolder) obj3;
                                sv0.c cVar26 = sv0.c.f161028a;
                                scope16.getClass();
                                parametersHolder4.getClass();
                                t0 t0Var11 = s0.f105811a;
                                return new u((rv0.a) scope16.get((d<?>) t0Var11.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (qv0.a) scope16.get((d<?>) t0Var11.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (l) scope16.get((d<?>) t0Var11.b(l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.d) scope16.get((d<?>) t0Var11.b(tv0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (g) scope16.get((d<?>) t0Var11.b(g.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (v) scope16.get((d<?>) t0Var11.b(v.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.f) scope16.get((d<?>) t0Var11.b(tv0.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (b63.o) parametersHolder4.elementAt(0, t0Var11.b(b63.o.class)), (o82.g) parametersHolder4.elementAt(1, t0Var11.b(o82.g.class)));
                            case 27:
                                Scope scope17 = (Scope) obj2;
                                sv0.c cVar27 = sv0.c.f161028a;
                                scope17.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var12 = s0.f105811a;
                                return new a0((tv0.c) scope17.get((d<?>) t0Var12.b(tv0.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (s) scope17.get((d<?>) t0Var12.b(s.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (fw0.a) scope17.get((d<?>) t0Var12.b(fw0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                Scope scope18 = (Scope) obj2;
                                sv0.c cVar28 = sv0.c.f161028a;
                                scope18.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var13 = s0.f105811a;
                                return new r((tv0.a) scope18.get((d<?>) t0Var13.b(tv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (w) scope18.get((d<?>) t0Var13.b(w.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.i) scope18.get((d<?>) t0Var13.b(tv0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (t) scope18.get((d<?>) t0Var13.b(t.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope18.get((d<?>) t0Var13.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                Scope scope19 = (Scope) obj2;
                                sv0.c cVar29 = sv0.c.f161028a;
                                scope19.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var14 = s0.f105811a;
                                return new nw0.g((rv0.a) scope19.get((d<?>) t0Var14.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.d) scope19.get((d<?>) t0Var14.b(tv0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.b) scope19.get((d<?>) t0Var14.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                        }
                    }
                }, kind2, j0Var2), module2));
                new KoinDefinition(module2, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(pt0.e0.class), null, new si1.a(27), kind2, j0Var2), module2));
                new KoinDefinition(module2, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(pt0.f.class), null, new si1.a(28), kind2, j0Var2), module2));
                new KoinDefinition(module2, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(p3.class), null, new e23.p() { // from class: st0.b
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i27) {
                            case 0:
                                Scope scope = (Scope) obj2;
                                c cVar2 = c.f160846a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new p3((i) scope.get((d<?>) s0.f105811a.b(i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                Scope scope2 = (Scope) obj2;
                                c cVar3 = c.f160846a;
                                scope2.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new i0((kt0.a) scope2.get((d<?>) s0.f105811a.b(kt0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 2:
                                Scope scope3 = (Scope) obj2;
                                c cVar4 = c.f160846a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var3 = s0.f105811a;
                                return new j0((lt0.d) scope3.get((d<?>) t0Var3.b(lt0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (i0) scope3.get((d<?>) t0Var3.b(i0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                c cVar5 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (lt0.c) ez0.b.a(ez0.b.f67468a, ez0.c.GC, lt0.c.class, new h.a[0], null, null, null, 120);
                            case 4:
                                Scope scope4 = (Scope) obj2;
                                c cVar6 = c.f160846a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var4 = s0.f105811a;
                                return new x((lt0.c) scope4.get((d<?>) t0Var4.b(lt0.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (i0) scope4.get((d<?>) t0Var4.b(i0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 5:
                                c cVar7 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (f) ez0.b.a(ez0.b.f67468a, ez0.c.GC, f.class, new h.a[0], null, null, null, 120);
                            case 6:
                                Scope scope5 = (Scope) obj2;
                                c cVar8 = c.f160846a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var5 = s0.f105811a;
                                return new f1((f) scope5.get((d<?>) t0Var5.b(f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (lt0.d) scope5.get((d<?>) t0Var5.b(lt0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 7:
                                c cVar9 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (lt0.d) ez0.b.a(ez0.b.f67468a, ez0.c.GC, lt0.d.class, new h.a[0], null, null, null, 120);
                            case 8:
                                c cVar10 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (su.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, su.a.class, new h.a[0], null, null, null, 120);
                            case 9:
                                Scope scope6 = (Scope) obj2;
                                c cVar11 = c.f160846a;
                                scope6.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new yt0.a((lt0.a) scope6.get((d<?>) s0.f105811a.b(lt0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                Scope scope7 = (Scope) obj2;
                                c cVar12 = c.f160846a;
                                scope7.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var6 = s0.f105811a;
                                return new f0((yt0.s0) scope7.get((d<?>) t0Var6.b(yt0.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (r0) scope7.get((d<?>) t0Var6.b(r0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                c cVar13 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new o();
                            case 12:
                                c cVar14 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new n();
                            case 13:
                                c cVar15 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new i3(e20.a.C1315a.a(e20.a.f62587b));
                            case 14:
                                Scope scope8 = (Scope) obj2;
                                c cVar16 = c.f160846a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new o0((yt0.s0) scope8.get((d<?>) s0.f105811a.b(yt0.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                Scope scope9 = (Scope) obj2;
                                c cVar17 = c.f160846a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var7 = s0.f105811a;
                                return new z((yt0.s0) scope9.get((d<?>) t0Var7.b(yt0.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (i0) scope9.get((d<?>) t0Var7.b(i0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 16:
                                Scope scope10 = (Scope) obj2;
                                c cVar18 = c.f160846a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new p((r0) scope10.get((d<?>) s0.f105811a.b(r0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 17:
                                Scope scope11 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                c cVar19 = c.f160846a;
                                scope11.getClass();
                                parametersHolder.getClass();
                                return new h4((String) parametersHolder.get(0), (String) parametersHolder.get(1), ((Number) parametersHolder.get(2)).longValue(), (f1) scope11.get((d<?>) s0.f105811a.b(f1.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 18:
                                ParametersHolder parametersHolder2 = (ParametersHolder) obj3;
                                sv0.a aVar3 = sv0.a.f161025a;
                                ((Scope) obj2).getClass();
                                parametersHolder2.getClass();
                                return new dw0.a(new uv0.b((r53.i) parametersHolder2.elementAt(0, s0.f105811a.b(r53.i.class))));
                            case 19:
                                ParametersHolder parametersHolder3 = (ParametersHolder) obj3;
                                sv0.a aVar4 = sv0.a.f161025a;
                                ((Scope) obj2).getClass();
                                parametersHolder3.getClass();
                                return new cw0.a((dw0.a) parametersHolder3.elementAt(0, s0.f105811a.b(dw0.a.class)));
                            case 20:
                                sv0.c cVar20 = sv0.c.f161028a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new tv0.b();
                            case 21:
                                Scope scope12 = (Scope) obj2;
                                sv0.c cVar21 = sv0.c.f161028a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var8 = s0.f105811a;
                                return new v((qv0.a) scope12.get((d<?>) t0Var8.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope12.get((d<?>) t0Var8.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.b) scope12.get((d<?>) t0Var8.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                sv0.c cVar22 = sv0.c.f161028a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (nv0.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, nv0.a.class, new h.a[0], null, null, null, 88);
                            case 23:
                                Scope scope13 = (Scope) obj2;
                                sv0.c cVar23 = sv0.c.f161028a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new t((tv0.b) scope13.get((d<?>) s0.f105811a.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 24:
                                Scope scope14 = (Scope) obj2;
                                sv0.c cVar24 = sv0.c.f161028a;
                                scope14.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var9 = s0.f105811a;
                                return new k((qv0.a) scope14.get((d<?>) t0Var9.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope14.get((d<?>) t0Var9.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                Scope scope15 = (Scope) obj2;
                                sv0.c cVar25 = sv0.c.f161028a;
                                scope15.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var10 = s0.f105811a;
                                return new m((tv0.a) scope15.get((d<?>) t0Var10.b(tv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (w) scope15.get((d<?>) t0Var10.b(w.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.i) scope15.get((d<?>) t0Var10.b(tv0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (s) scope15.get((d<?>) t0Var10.b(s.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.b) scope15.get((d<?>) t0Var10.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (qv0.a) scope15.get((d<?>) t0Var10.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope15.get((d<?>) t0Var10.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (fw0.a) scope15.get((d<?>) t0Var10.b(fw0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                Scope scope16 = (Scope) obj2;
                                ParametersHolder parametersHolder4 = (ParametersHolder) obj3;
                                sv0.c cVar26 = sv0.c.f161028a;
                                scope16.getClass();
                                parametersHolder4.getClass();
                                t0 t0Var11 = s0.f105811a;
                                return new u((rv0.a) scope16.get((d<?>) t0Var11.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (qv0.a) scope16.get((d<?>) t0Var11.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (l) scope16.get((d<?>) t0Var11.b(l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.d) scope16.get((d<?>) t0Var11.b(tv0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (g) scope16.get((d<?>) t0Var11.b(g.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (v) scope16.get((d<?>) t0Var11.b(v.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.f) scope16.get((d<?>) t0Var11.b(tv0.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (b63.o) parametersHolder4.elementAt(0, t0Var11.b(b63.o.class)), (o82.g) parametersHolder4.elementAt(1, t0Var11.b(o82.g.class)));
                            case 27:
                                Scope scope17 = (Scope) obj2;
                                sv0.c cVar27 = sv0.c.f161028a;
                                scope17.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var12 = s0.f105811a;
                                return new a0((tv0.c) scope17.get((d<?>) t0Var12.b(tv0.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (s) scope17.get((d<?>) t0Var12.b(s.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (fw0.a) scope17.get((d<?>) t0Var12.b(fw0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                Scope scope18 = (Scope) obj2;
                                sv0.c cVar28 = sv0.c.f161028a;
                                scope18.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var13 = s0.f105811a;
                                return new r((tv0.a) scope18.get((d<?>) t0Var13.b(tv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (w) scope18.get((d<?>) t0Var13.b(w.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.i) scope18.get((d<?>) t0Var13.b(tv0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (t) scope18.get((d<?>) t0Var13.b(t.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope18.get((d<?>) t0Var13.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                Scope scope19 = (Scope) obj2;
                                sv0.c cVar29 = sv0.c.f161028a;
                                scope19.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var14 = s0.f105811a;
                                return new nw0.g((rv0.a) scope19.get((d<?>) t0Var14.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.d) scope19.get((d<?>) t0Var14.b(tv0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.b) scope19.get((d<?>) t0Var14.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                        }
                    }
                }, kind2, j0Var2), module2));
                return Unit.INSTANCE;
            case 9:
                Module module3 = (Module) obj;
                sv0.a aVar3 = sv0.a.f161025a;
                module3.getClass();
                StringQualifier stringQualifierNamed2 = QualifierKt.named(o70.t.I.a());
                final int i39 = 18;
                e23.p pVar2 = new e23.p() { // from class: st0.b
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i39) {
                            case 0:
                                Scope scope = (Scope) obj2;
                                c cVar2 = c.f160846a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new p3((i) scope.get((d<?>) s0.f105811a.b(i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                Scope scope2 = (Scope) obj2;
                                c cVar3 = c.f160846a;
                                scope2.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new i0((kt0.a) scope2.get((d<?>) s0.f105811a.b(kt0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 2:
                                Scope scope3 = (Scope) obj2;
                                c cVar4 = c.f160846a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var3 = s0.f105811a;
                                return new j0((lt0.d) scope3.get((d<?>) t0Var3.b(lt0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (i0) scope3.get((d<?>) t0Var3.b(i0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                c cVar5 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (lt0.c) ez0.b.a(ez0.b.f67468a, ez0.c.GC, lt0.c.class, new h.a[0], null, null, null, 120);
                            case 4:
                                Scope scope4 = (Scope) obj2;
                                c cVar6 = c.f160846a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var4 = s0.f105811a;
                                return new x((lt0.c) scope4.get((d<?>) t0Var4.b(lt0.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (i0) scope4.get((d<?>) t0Var4.b(i0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 5:
                                c cVar7 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (f) ez0.b.a(ez0.b.f67468a, ez0.c.GC, f.class, new h.a[0], null, null, null, 120);
                            case 6:
                                Scope scope5 = (Scope) obj2;
                                c cVar8 = c.f160846a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var5 = s0.f105811a;
                                return new f1((f) scope5.get((d<?>) t0Var5.b(f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (lt0.d) scope5.get((d<?>) t0Var5.b(lt0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 7:
                                c cVar9 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (lt0.d) ez0.b.a(ez0.b.f67468a, ez0.c.GC, lt0.d.class, new h.a[0], null, null, null, 120);
                            case 8:
                                c cVar10 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (su.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, su.a.class, new h.a[0], null, null, null, 120);
                            case 9:
                                Scope scope6 = (Scope) obj2;
                                c cVar11 = c.f160846a;
                                scope6.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new yt0.a((lt0.a) scope6.get((d<?>) s0.f105811a.b(lt0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                Scope scope7 = (Scope) obj2;
                                c cVar12 = c.f160846a;
                                scope7.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var6 = s0.f105811a;
                                return new f0((yt0.s0) scope7.get((d<?>) t0Var6.b(yt0.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (r0) scope7.get((d<?>) t0Var6.b(r0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                c cVar13 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new o();
                            case 12:
                                c cVar14 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new n();
                            case 13:
                                c cVar15 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new i3(e20.a.C1315a.a(e20.a.f62587b));
                            case 14:
                                Scope scope8 = (Scope) obj2;
                                c cVar16 = c.f160846a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new o0((yt0.s0) scope8.get((d<?>) s0.f105811a.b(yt0.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                Scope scope9 = (Scope) obj2;
                                c cVar17 = c.f160846a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var7 = s0.f105811a;
                                return new z((yt0.s0) scope9.get((d<?>) t0Var7.b(yt0.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (i0) scope9.get((d<?>) t0Var7.b(i0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 16:
                                Scope scope10 = (Scope) obj2;
                                c cVar18 = c.f160846a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new p((r0) scope10.get((d<?>) s0.f105811a.b(r0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 17:
                                Scope scope11 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                c cVar19 = c.f160846a;
                                scope11.getClass();
                                parametersHolder.getClass();
                                return new h4((String) parametersHolder.get(0), (String) parametersHolder.get(1), ((Number) parametersHolder.get(2)).longValue(), (f1) scope11.get((d<?>) s0.f105811a.b(f1.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 18:
                                ParametersHolder parametersHolder2 = (ParametersHolder) obj3;
                                sv0.a aVar4 = sv0.a.f161025a;
                                ((Scope) obj2).getClass();
                                parametersHolder2.getClass();
                                return new dw0.a(new uv0.b((r53.i) parametersHolder2.elementAt(0, s0.f105811a.b(r53.i.class))));
                            case 19:
                                ParametersHolder parametersHolder3 = (ParametersHolder) obj3;
                                sv0.a aVar5 = sv0.a.f161025a;
                                ((Scope) obj2).getClass();
                                parametersHolder3.getClass();
                                return new cw0.a((dw0.a) parametersHolder3.elementAt(0, s0.f105811a.b(dw0.a.class)));
                            case 20:
                                sv0.c cVar20 = sv0.c.f161028a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new tv0.b();
                            case 21:
                                Scope scope12 = (Scope) obj2;
                                sv0.c cVar21 = sv0.c.f161028a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var8 = s0.f105811a;
                                return new v((qv0.a) scope12.get((d<?>) t0Var8.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope12.get((d<?>) t0Var8.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.b) scope12.get((d<?>) t0Var8.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                sv0.c cVar22 = sv0.c.f161028a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (nv0.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, nv0.a.class, new h.a[0], null, null, null, 88);
                            case 23:
                                Scope scope13 = (Scope) obj2;
                                sv0.c cVar23 = sv0.c.f161028a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new t((tv0.b) scope13.get((d<?>) s0.f105811a.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 24:
                                Scope scope14 = (Scope) obj2;
                                sv0.c cVar24 = sv0.c.f161028a;
                                scope14.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var9 = s0.f105811a;
                                return new k((qv0.a) scope14.get((d<?>) t0Var9.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope14.get((d<?>) t0Var9.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                Scope scope15 = (Scope) obj2;
                                sv0.c cVar25 = sv0.c.f161028a;
                                scope15.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var10 = s0.f105811a;
                                return new m((tv0.a) scope15.get((d<?>) t0Var10.b(tv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (w) scope15.get((d<?>) t0Var10.b(w.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.i) scope15.get((d<?>) t0Var10.b(tv0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (s) scope15.get((d<?>) t0Var10.b(s.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.b) scope15.get((d<?>) t0Var10.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (qv0.a) scope15.get((d<?>) t0Var10.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope15.get((d<?>) t0Var10.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (fw0.a) scope15.get((d<?>) t0Var10.b(fw0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                Scope scope16 = (Scope) obj2;
                                ParametersHolder parametersHolder4 = (ParametersHolder) obj3;
                                sv0.c cVar26 = sv0.c.f161028a;
                                scope16.getClass();
                                parametersHolder4.getClass();
                                t0 t0Var11 = s0.f105811a;
                                return new u((rv0.a) scope16.get((d<?>) t0Var11.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (qv0.a) scope16.get((d<?>) t0Var11.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (l) scope16.get((d<?>) t0Var11.b(l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.d) scope16.get((d<?>) t0Var11.b(tv0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (g) scope16.get((d<?>) t0Var11.b(g.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (v) scope16.get((d<?>) t0Var11.b(v.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.f) scope16.get((d<?>) t0Var11.b(tv0.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (b63.o) parametersHolder4.elementAt(0, t0Var11.b(b63.o.class)), (o82.g) parametersHolder4.elementAt(1, t0Var11.b(o82.g.class)));
                            case 27:
                                Scope scope17 = (Scope) obj2;
                                sv0.c cVar27 = sv0.c.f161028a;
                                scope17.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var12 = s0.f105811a;
                                return new a0((tv0.c) scope17.get((d<?>) t0Var12.b(tv0.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (s) scope17.get((d<?>) t0Var12.b(s.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (fw0.a) scope17.get((d<?>) t0Var12.b(fw0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                Scope scope18 = (Scope) obj2;
                                sv0.c cVar28 = sv0.c.f161028a;
                                scope18.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var13 = s0.f105811a;
                                return new r((tv0.a) scope18.get((d<?>) t0Var13.b(tv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (w) scope18.get((d<?>) t0Var13.b(w.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.i) scope18.get((d<?>) t0Var13.b(tv0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (t) scope18.get((d<?>) t0Var13.b(t.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope18.get((d<?>) t0Var13.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                Scope scope19 = (Scope) obj2;
                                sv0.c cVar29 = sv0.c.f161028a;
                                scope19.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var14 = s0.f105811a;
                                return new nw0.g((rv0.a) scope19.get((d<?>) t0Var14.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.d) scope19.get((d<?>) t0Var14.b(tv0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.b) scope19.get((d<?>) t0Var14.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                        }
                    }
                };
                ScopeRegistry.Companion companion3 = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier3 = companion3.getRootScopeQualifier();
                Kind kind3 = Kind.Factory;
                p13.j0 j0Var3 = p13.j0.f134944a;
                p005kotlin.jvm.internal.t0 t0Var3 = p005kotlin.jvm.internal.s0.f105811a;
                new KoinDefinition(module3, e5.n(new BeanDefinition(rootScopeQualifier3, t0Var3.b(r70.s.class), stringQualifierNamed2, pVar2, kind3, j0Var3), module3));
                final int i44 = 19;
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(r70.r.class), stringQualifierNamed2, new e23.p() { // from class: st0.b
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i44) {
                            case 0:
                                Scope scope = (Scope) obj2;
                                c cVar2 = c.f160846a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new p3((i) scope.get((d<?>) s0.f105811a.b(i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                Scope scope2 = (Scope) obj2;
                                c cVar3 = c.f160846a;
                                scope2.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new i0((kt0.a) scope2.get((d<?>) s0.f105811a.b(kt0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 2:
                                Scope scope3 = (Scope) obj2;
                                c cVar4 = c.f160846a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var4 = s0.f105811a;
                                return new j0((lt0.d) scope3.get((d<?>) t0Var4.b(lt0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (i0) scope3.get((d<?>) t0Var4.b(i0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                c cVar5 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (lt0.c) ez0.b.a(ez0.b.f67468a, ez0.c.GC, lt0.c.class, new h.a[0], null, null, null, 120);
                            case 4:
                                Scope scope4 = (Scope) obj2;
                                c cVar6 = c.f160846a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var5 = s0.f105811a;
                                return new x((lt0.c) scope4.get((d<?>) t0Var5.b(lt0.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (i0) scope4.get((d<?>) t0Var5.b(i0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 5:
                                c cVar7 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (f) ez0.b.a(ez0.b.f67468a, ez0.c.GC, f.class, new h.a[0], null, null, null, 120);
                            case 6:
                                Scope scope5 = (Scope) obj2;
                                c cVar8 = c.f160846a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var6 = s0.f105811a;
                                return new f1((f) scope5.get((d<?>) t0Var6.b(f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (lt0.d) scope5.get((d<?>) t0Var6.b(lt0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 7:
                                c cVar9 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (lt0.d) ez0.b.a(ez0.b.f67468a, ez0.c.GC, lt0.d.class, new h.a[0], null, null, null, 120);
                            case 8:
                                c cVar10 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (su.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, su.a.class, new h.a[0], null, null, null, 120);
                            case 9:
                                Scope scope6 = (Scope) obj2;
                                c cVar11 = c.f160846a;
                                scope6.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new yt0.a((lt0.a) scope6.get((d<?>) s0.f105811a.b(lt0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                Scope scope7 = (Scope) obj2;
                                c cVar12 = c.f160846a;
                                scope7.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var7 = s0.f105811a;
                                return new f0((yt0.s0) scope7.get((d<?>) t0Var7.b(yt0.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (r0) scope7.get((d<?>) t0Var7.b(r0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                c cVar13 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new o();
                            case 12:
                                c cVar14 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new n();
                            case 13:
                                c cVar15 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new i3(e20.a.C1315a.a(e20.a.f62587b));
                            case 14:
                                Scope scope8 = (Scope) obj2;
                                c cVar16 = c.f160846a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new o0((yt0.s0) scope8.get((d<?>) s0.f105811a.b(yt0.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                Scope scope9 = (Scope) obj2;
                                c cVar17 = c.f160846a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var8 = s0.f105811a;
                                return new z((yt0.s0) scope9.get((d<?>) t0Var8.b(yt0.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (i0) scope9.get((d<?>) t0Var8.b(i0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 16:
                                Scope scope10 = (Scope) obj2;
                                c cVar18 = c.f160846a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new p((r0) scope10.get((d<?>) s0.f105811a.b(r0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 17:
                                Scope scope11 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                c cVar19 = c.f160846a;
                                scope11.getClass();
                                parametersHolder.getClass();
                                return new h4((String) parametersHolder.get(0), (String) parametersHolder.get(1), ((Number) parametersHolder.get(2)).longValue(), (f1) scope11.get((d<?>) s0.f105811a.b(f1.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 18:
                                ParametersHolder parametersHolder2 = (ParametersHolder) obj3;
                                sv0.a aVar4 = sv0.a.f161025a;
                                ((Scope) obj2).getClass();
                                parametersHolder2.getClass();
                                return new dw0.a(new uv0.b((r53.i) parametersHolder2.elementAt(0, s0.f105811a.b(r53.i.class))));
                            case 19:
                                ParametersHolder parametersHolder3 = (ParametersHolder) obj3;
                                sv0.a aVar5 = sv0.a.f161025a;
                                ((Scope) obj2).getClass();
                                parametersHolder3.getClass();
                                return new cw0.a((dw0.a) parametersHolder3.elementAt(0, s0.f105811a.b(dw0.a.class)));
                            case 20:
                                sv0.c cVar20 = sv0.c.f161028a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new tv0.b();
                            case 21:
                                Scope scope12 = (Scope) obj2;
                                sv0.c cVar21 = sv0.c.f161028a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var9 = s0.f105811a;
                                return new v((qv0.a) scope12.get((d<?>) t0Var9.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope12.get((d<?>) t0Var9.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.b) scope12.get((d<?>) t0Var9.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                sv0.c cVar22 = sv0.c.f161028a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (nv0.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, nv0.a.class, new h.a[0], null, null, null, 88);
                            case 23:
                                Scope scope13 = (Scope) obj2;
                                sv0.c cVar23 = sv0.c.f161028a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new t((tv0.b) scope13.get((d<?>) s0.f105811a.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 24:
                                Scope scope14 = (Scope) obj2;
                                sv0.c cVar24 = sv0.c.f161028a;
                                scope14.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var10 = s0.f105811a;
                                return new k((qv0.a) scope14.get((d<?>) t0Var10.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope14.get((d<?>) t0Var10.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                Scope scope15 = (Scope) obj2;
                                sv0.c cVar25 = sv0.c.f161028a;
                                scope15.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var11 = s0.f105811a;
                                return new m((tv0.a) scope15.get((d<?>) t0Var11.b(tv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (w) scope15.get((d<?>) t0Var11.b(w.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.i) scope15.get((d<?>) t0Var11.b(tv0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (s) scope15.get((d<?>) t0Var11.b(s.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.b) scope15.get((d<?>) t0Var11.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (qv0.a) scope15.get((d<?>) t0Var11.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope15.get((d<?>) t0Var11.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (fw0.a) scope15.get((d<?>) t0Var11.b(fw0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                Scope scope16 = (Scope) obj2;
                                ParametersHolder parametersHolder4 = (ParametersHolder) obj3;
                                sv0.c cVar26 = sv0.c.f161028a;
                                scope16.getClass();
                                parametersHolder4.getClass();
                                t0 t0Var12 = s0.f105811a;
                                return new u((rv0.a) scope16.get((d<?>) t0Var12.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (qv0.a) scope16.get((d<?>) t0Var12.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (l) scope16.get((d<?>) t0Var12.b(l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.d) scope16.get((d<?>) t0Var12.b(tv0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (g) scope16.get((d<?>) t0Var12.b(g.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (v) scope16.get((d<?>) t0Var12.b(v.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.f) scope16.get((d<?>) t0Var12.b(tv0.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (b63.o) parametersHolder4.elementAt(0, t0Var12.b(b63.o.class)), (o82.g) parametersHolder4.elementAt(1, t0Var12.b(o82.g.class)));
                            case 27:
                                Scope scope17 = (Scope) obj2;
                                sv0.c cVar27 = sv0.c.f161028a;
                                scope17.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var13 = s0.f105811a;
                                return new a0((tv0.c) scope17.get((d<?>) t0Var13.b(tv0.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (s) scope17.get((d<?>) t0Var13.b(s.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (fw0.a) scope17.get((d<?>) t0Var13.b(fw0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                Scope scope18 = (Scope) obj2;
                                sv0.c cVar28 = sv0.c.f161028a;
                                scope18.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var14 = s0.f105811a;
                                return new r((tv0.a) scope18.get((d<?>) t0Var14.b(tv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (w) scope18.get((d<?>) t0Var14.b(w.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.i) scope18.get((d<?>) t0Var14.b(tv0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (t) scope18.get((d<?>) t0Var14.b(t.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope18.get((d<?>) t0Var14.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                Scope scope19 = (Scope) obj2;
                                sv0.c cVar29 = sv0.c.f161028a;
                                scope19.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var15 = s0.f105811a;
                                return new nw0.g((rv0.a) scope19.get((d<?>) t0Var15.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.d) scope19.get((d<?>) t0Var15.b(tv0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.b) scope19.get((d<?>) t0Var15.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                        }
                    }
                }, kind3, j0Var3), module3));
                return Unit.INSTANCE;
            case 10:
                Module module4 = (Module) obj;
                sv0.c cVar2 = sv0.c.f161028a;
                module4.getClass();
                sv0.b bVar = new sv0.b(0);
                ScopeRegistry.Companion companion4 = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier4 = companion4.getRootScopeQualifier();
                Kind kind4 = Kind.Factory;
                p13.j0 j0Var4 = p13.j0.f134944a;
                p005kotlin.jvm.internal.t0 t0Var4 = p005kotlin.jvm.internal.s0.f105811a;
                new KoinDefinition(module4, e5.n(new BeanDefinition(rootScopeQualifier4, t0Var4.b(qv0.a.class), null, bVar, kind4, j0Var4), module4));
                final int i45 = 22;
                new KoinDefinition(module4, e5.n(new BeanDefinition(companion4.getRootScopeQualifier(), t0Var4.b(nv0.a.class), null, new e23.p() { // from class: st0.b
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i45) {
                            case 0:
                                Scope scope = (Scope) obj2;
                                c cVar3 = c.f160846a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new p3((i) scope.get((d<?>) s0.f105811a.b(i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                Scope scope2 = (Scope) obj2;
                                c cVar4 = c.f160846a;
                                scope2.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new i0((kt0.a) scope2.get((d<?>) s0.f105811a.b(kt0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 2:
                                Scope scope3 = (Scope) obj2;
                                c cVar5 = c.f160846a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var5 = s0.f105811a;
                                return new j0((lt0.d) scope3.get((d<?>) t0Var5.b(lt0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (i0) scope3.get((d<?>) t0Var5.b(i0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                c cVar6 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (lt0.c) ez0.b.a(ez0.b.f67468a, ez0.c.GC, lt0.c.class, new h.a[0], null, null, null, 120);
                            case 4:
                                Scope scope4 = (Scope) obj2;
                                c cVar7 = c.f160846a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var6 = s0.f105811a;
                                return new x((lt0.c) scope4.get((d<?>) t0Var6.b(lt0.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (i0) scope4.get((d<?>) t0Var6.b(i0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 5:
                                c cVar8 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (f) ez0.b.a(ez0.b.f67468a, ez0.c.GC, f.class, new h.a[0], null, null, null, 120);
                            case 6:
                                Scope scope5 = (Scope) obj2;
                                c cVar9 = c.f160846a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var7 = s0.f105811a;
                                return new f1((f) scope5.get((d<?>) t0Var7.b(f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (lt0.d) scope5.get((d<?>) t0Var7.b(lt0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 7:
                                c cVar10 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (lt0.d) ez0.b.a(ez0.b.f67468a, ez0.c.GC, lt0.d.class, new h.a[0], null, null, null, 120);
                            case 8:
                                c cVar11 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (su.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, su.a.class, new h.a[0], null, null, null, 120);
                            case 9:
                                Scope scope6 = (Scope) obj2;
                                c cVar12 = c.f160846a;
                                scope6.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new yt0.a((lt0.a) scope6.get((d<?>) s0.f105811a.b(lt0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                Scope scope7 = (Scope) obj2;
                                c cVar13 = c.f160846a;
                                scope7.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var8 = s0.f105811a;
                                return new f0((yt0.s0) scope7.get((d<?>) t0Var8.b(yt0.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (r0) scope7.get((d<?>) t0Var8.b(r0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                c cVar14 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new o();
                            case 12:
                                c cVar15 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new n();
                            case 13:
                                c cVar16 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new i3(e20.a.C1315a.a(e20.a.f62587b));
                            case 14:
                                Scope scope8 = (Scope) obj2;
                                c cVar17 = c.f160846a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new o0((yt0.s0) scope8.get((d<?>) s0.f105811a.b(yt0.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                Scope scope9 = (Scope) obj2;
                                c cVar18 = c.f160846a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var9 = s0.f105811a;
                                return new z((yt0.s0) scope9.get((d<?>) t0Var9.b(yt0.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (i0) scope9.get((d<?>) t0Var9.b(i0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 16:
                                Scope scope10 = (Scope) obj2;
                                c cVar19 = c.f160846a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new p((r0) scope10.get((d<?>) s0.f105811a.b(r0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 17:
                                Scope scope11 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                c cVar110 = c.f160846a;
                                scope11.getClass();
                                parametersHolder.getClass();
                                return new h4((String) parametersHolder.get(0), (String) parametersHolder.get(1), ((Number) parametersHolder.get(2)).longValue(), (f1) scope11.get((d<?>) s0.f105811a.b(f1.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 18:
                                ParametersHolder parametersHolder2 = (ParametersHolder) obj3;
                                sv0.a aVar4 = sv0.a.f161025a;
                                ((Scope) obj2).getClass();
                                parametersHolder2.getClass();
                                return new dw0.a(new uv0.b((r53.i) parametersHolder2.elementAt(0, s0.f105811a.b(r53.i.class))));
                            case 19:
                                ParametersHolder parametersHolder3 = (ParametersHolder) obj3;
                                sv0.a aVar5 = sv0.a.f161025a;
                                ((Scope) obj2).getClass();
                                parametersHolder3.getClass();
                                return new cw0.a((dw0.a) parametersHolder3.elementAt(0, s0.f105811a.b(dw0.a.class)));
                            case 20:
                                sv0.c cVar20 = sv0.c.f161028a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new tv0.b();
                            case 21:
                                Scope scope12 = (Scope) obj2;
                                sv0.c cVar21 = sv0.c.f161028a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var10 = s0.f105811a;
                                return new v((qv0.a) scope12.get((d<?>) t0Var10.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope12.get((d<?>) t0Var10.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.b) scope12.get((d<?>) t0Var10.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                sv0.c cVar22 = sv0.c.f161028a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (nv0.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, nv0.a.class, new h.a[0], null, null, null, 88);
                            case 23:
                                Scope scope13 = (Scope) obj2;
                                sv0.c cVar23 = sv0.c.f161028a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new t((tv0.b) scope13.get((d<?>) s0.f105811a.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 24:
                                Scope scope14 = (Scope) obj2;
                                sv0.c cVar24 = sv0.c.f161028a;
                                scope14.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var11 = s0.f105811a;
                                return new k((qv0.a) scope14.get((d<?>) t0Var11.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope14.get((d<?>) t0Var11.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                Scope scope15 = (Scope) obj2;
                                sv0.c cVar25 = sv0.c.f161028a;
                                scope15.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var12 = s0.f105811a;
                                return new m((tv0.a) scope15.get((d<?>) t0Var12.b(tv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (w) scope15.get((d<?>) t0Var12.b(w.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.i) scope15.get((d<?>) t0Var12.b(tv0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (s) scope15.get((d<?>) t0Var12.b(s.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.b) scope15.get((d<?>) t0Var12.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (qv0.a) scope15.get((d<?>) t0Var12.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope15.get((d<?>) t0Var12.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (fw0.a) scope15.get((d<?>) t0Var12.b(fw0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                Scope scope16 = (Scope) obj2;
                                ParametersHolder parametersHolder4 = (ParametersHolder) obj3;
                                sv0.c cVar26 = sv0.c.f161028a;
                                scope16.getClass();
                                parametersHolder4.getClass();
                                t0 t0Var13 = s0.f105811a;
                                return new u((rv0.a) scope16.get((d<?>) t0Var13.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (qv0.a) scope16.get((d<?>) t0Var13.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (l) scope16.get((d<?>) t0Var13.b(l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.d) scope16.get((d<?>) t0Var13.b(tv0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (g) scope16.get((d<?>) t0Var13.b(g.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (v) scope16.get((d<?>) t0Var13.b(v.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.f) scope16.get((d<?>) t0Var13.b(tv0.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (b63.o) parametersHolder4.elementAt(0, t0Var13.b(b63.o.class)), (o82.g) parametersHolder4.elementAt(1, t0Var13.b(o82.g.class)));
                            case 27:
                                Scope scope17 = (Scope) obj2;
                                sv0.c cVar27 = sv0.c.f161028a;
                                scope17.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var14 = s0.f105811a;
                                return new a0((tv0.c) scope17.get((d<?>) t0Var14.b(tv0.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (s) scope17.get((d<?>) t0Var14.b(s.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (fw0.a) scope17.get((d<?>) t0Var14.b(fw0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                Scope scope18 = (Scope) obj2;
                                sv0.c cVar28 = sv0.c.f161028a;
                                scope18.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var15 = s0.f105811a;
                                return new r((tv0.a) scope18.get((d<?>) t0Var15.b(tv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (w) scope18.get((d<?>) t0Var15.b(w.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.i) scope18.get((d<?>) t0Var15.b(tv0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (t) scope18.get((d<?>) t0Var15.b(t.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope18.get((d<?>) t0Var15.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                Scope scope19 = (Scope) obj2;
                                sv0.c cVar29 = sv0.c.f161028a;
                                scope19.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var16 = s0.f105811a;
                                return new nw0.g((rv0.a) scope19.get((d<?>) t0Var16.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.d) scope19.get((d<?>) t0Var16.b(tv0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.b) scope19.get((d<?>) t0Var16.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                        }
                    }
                }, kind4, j0Var4), module4));
                new KoinDefinition(module4, e5.n(new BeanDefinition(companion4.getRootScopeQualifier(), t0Var4.b(nv0.c.class), null, new sv0.b(1), kind4, j0Var4), module4));
                new KoinDefinition(module4, e5.n(new BeanDefinition(companion4.getRootScopeQualifier(), t0Var4.b(rv0.a.class), null, new sv0.b(2), kind4, j0Var4), module4));
                new KoinDefinition(module4, e5.n(new BeanDefinition(companion4.getRootScopeQualifier(), t0Var4.b(im1.a.class), null, new sv0.b(3), kind4, j0Var4), module4));
                new KoinDefinition(module4, e5.n(new BeanDefinition(companion4.getRootScopeQualifier(), t0Var4.b(nm1.a.class), null, new sv0.b(4), kind4, j0Var4), module4));
                new KoinDefinition(module4, e5.n(new BeanDefinition(companion4.getRootScopeQualifier(), t0Var4.b(jr1.a.class), null, new sv0.b(5), kind4, j0Var4), module4));
                new KoinDefinition(module4, e5.n(new BeanDefinition(companion4.getRootScopeQualifier(), t0Var4.b(lr1.b.class), null, new sv0.b(6), kind4, j0Var4), module4));
                new KoinDefinition(module4, e5.n(new BeanDefinition(companion4.getRootScopeQualifier(), t0Var4.b(sd1.e.class), null, new sv0.b(7), kind4, j0Var4), module4));
                new KoinDefinition(module4, e5.n(new BeanDefinition(companion4.getRootScopeQualifier(), t0Var4.b(fw0.a.class), null, new sv0.b(8), kind4, j0Var4), module4));
                new KoinDefinition(module4, e5.n(new BeanDefinition(companion4.getRootScopeQualifier(), t0Var4.b(tv0.i.class), null, new sv0.b(9), kind4, j0Var4), module4));
                new KoinDefinition(module4, e5.n(new BeanDefinition(companion4.getRootScopeQualifier(), t0Var4.b(tv0.a.class), null, new sv0.b(10), kind4, j0Var4), module4));
                new KoinDefinition(module4, e5.n(new BeanDefinition(companion4.getRootScopeQualifier(), t0Var4.b(tv0.w.class), null, new sv0.b(11), kind4, j0Var4), module4));
                new KoinDefinition(module4, e5.n(new BeanDefinition(companion4.getRootScopeQualifier(), t0Var4.b(tv0.c.class), null, new sv0.b(12), kind4, j0Var4), module4));
                new KoinDefinition(module4, e5.n(new BeanDefinition(companion4.getRootScopeQualifier(), t0Var4.b(tv0.e.class), null, new sv0.b(13), kind4, j0Var4), module4));
                new KoinDefinition(module4, e5.n(new BeanDefinition(companion4.getRootScopeQualifier(), t0Var4.b(tv0.f.class), null, new sv0.b(14), kind4, j0Var4), module4));
                new KoinDefinition(module4, e5.n(new BeanDefinition(companion4.getRootScopeQualifier(), t0Var4.b(tv0.s.class), null, new sv0.b(15), kind4, j0Var4), module4));
                new KoinDefinition(module4, e5.n(new BeanDefinition(companion4.getRootScopeQualifier(), t0Var4.b(tv0.g.class), null, new sv0.b(16), kind4, j0Var4), module4));
                final int i46 = 20;
                new KoinDefinition(module4, e5.n(new BeanDefinition(companion4.getRootScopeQualifier(), t0Var4.b(tv0.b.class), null, new e23.p() { // from class: st0.b
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i46) {
                            case 0:
                                Scope scope = (Scope) obj2;
                                c cVar3 = c.f160846a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new p3((i) scope.get((d<?>) s0.f105811a.b(i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                Scope scope2 = (Scope) obj2;
                                c cVar4 = c.f160846a;
                                scope2.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new i0((kt0.a) scope2.get((d<?>) s0.f105811a.b(kt0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 2:
                                Scope scope3 = (Scope) obj2;
                                c cVar5 = c.f160846a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var5 = s0.f105811a;
                                return new j0((lt0.d) scope3.get((d<?>) t0Var5.b(lt0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (i0) scope3.get((d<?>) t0Var5.b(i0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                c cVar6 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (lt0.c) ez0.b.a(ez0.b.f67468a, ez0.c.GC, lt0.c.class, new h.a[0], null, null, null, 120);
                            case 4:
                                Scope scope4 = (Scope) obj2;
                                c cVar7 = c.f160846a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var6 = s0.f105811a;
                                return new x((lt0.c) scope4.get((d<?>) t0Var6.b(lt0.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (i0) scope4.get((d<?>) t0Var6.b(i0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 5:
                                c cVar8 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (f) ez0.b.a(ez0.b.f67468a, ez0.c.GC, f.class, new h.a[0], null, null, null, 120);
                            case 6:
                                Scope scope5 = (Scope) obj2;
                                c cVar9 = c.f160846a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var7 = s0.f105811a;
                                return new f1((f) scope5.get((d<?>) t0Var7.b(f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (lt0.d) scope5.get((d<?>) t0Var7.b(lt0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 7:
                                c cVar10 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (lt0.d) ez0.b.a(ez0.b.f67468a, ez0.c.GC, lt0.d.class, new h.a[0], null, null, null, 120);
                            case 8:
                                c cVar11 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (su.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, su.a.class, new h.a[0], null, null, null, 120);
                            case 9:
                                Scope scope6 = (Scope) obj2;
                                c cVar12 = c.f160846a;
                                scope6.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new yt0.a((lt0.a) scope6.get((d<?>) s0.f105811a.b(lt0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                Scope scope7 = (Scope) obj2;
                                c cVar13 = c.f160846a;
                                scope7.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var8 = s0.f105811a;
                                return new f0((yt0.s0) scope7.get((d<?>) t0Var8.b(yt0.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (r0) scope7.get((d<?>) t0Var8.b(r0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                c cVar14 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new o();
                            case 12:
                                c cVar15 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new n();
                            case 13:
                                c cVar16 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new i3(e20.a.C1315a.a(e20.a.f62587b));
                            case 14:
                                Scope scope8 = (Scope) obj2;
                                c cVar17 = c.f160846a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new o0((yt0.s0) scope8.get((d<?>) s0.f105811a.b(yt0.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                Scope scope9 = (Scope) obj2;
                                c cVar18 = c.f160846a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var9 = s0.f105811a;
                                return new z((yt0.s0) scope9.get((d<?>) t0Var9.b(yt0.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (i0) scope9.get((d<?>) t0Var9.b(i0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 16:
                                Scope scope10 = (Scope) obj2;
                                c cVar19 = c.f160846a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new p((r0) scope10.get((d<?>) s0.f105811a.b(r0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 17:
                                Scope scope11 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                c cVar110 = c.f160846a;
                                scope11.getClass();
                                parametersHolder.getClass();
                                return new h4((String) parametersHolder.get(0), (String) parametersHolder.get(1), ((Number) parametersHolder.get(2)).longValue(), (f1) scope11.get((d<?>) s0.f105811a.b(f1.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 18:
                                ParametersHolder parametersHolder2 = (ParametersHolder) obj3;
                                sv0.a aVar4 = sv0.a.f161025a;
                                ((Scope) obj2).getClass();
                                parametersHolder2.getClass();
                                return new dw0.a(new uv0.b((r53.i) parametersHolder2.elementAt(0, s0.f105811a.b(r53.i.class))));
                            case 19:
                                ParametersHolder parametersHolder3 = (ParametersHolder) obj3;
                                sv0.a aVar5 = sv0.a.f161025a;
                                ((Scope) obj2).getClass();
                                parametersHolder3.getClass();
                                return new cw0.a((dw0.a) parametersHolder3.elementAt(0, s0.f105811a.b(dw0.a.class)));
                            case 20:
                                sv0.c cVar20 = sv0.c.f161028a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new tv0.b();
                            case 21:
                                Scope scope12 = (Scope) obj2;
                                sv0.c cVar21 = sv0.c.f161028a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var10 = s0.f105811a;
                                return new v((qv0.a) scope12.get((d<?>) t0Var10.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope12.get((d<?>) t0Var10.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.b) scope12.get((d<?>) t0Var10.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                sv0.c cVar22 = sv0.c.f161028a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (nv0.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, nv0.a.class, new h.a[0], null, null, null, 88);
                            case 23:
                                Scope scope13 = (Scope) obj2;
                                sv0.c cVar23 = sv0.c.f161028a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new t((tv0.b) scope13.get((d<?>) s0.f105811a.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 24:
                                Scope scope14 = (Scope) obj2;
                                sv0.c cVar24 = sv0.c.f161028a;
                                scope14.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var11 = s0.f105811a;
                                return new k((qv0.a) scope14.get((d<?>) t0Var11.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope14.get((d<?>) t0Var11.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                Scope scope15 = (Scope) obj2;
                                sv0.c cVar25 = sv0.c.f161028a;
                                scope15.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var12 = s0.f105811a;
                                return new m((tv0.a) scope15.get((d<?>) t0Var12.b(tv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (w) scope15.get((d<?>) t0Var12.b(w.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.i) scope15.get((d<?>) t0Var12.b(tv0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (s) scope15.get((d<?>) t0Var12.b(s.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.b) scope15.get((d<?>) t0Var12.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (qv0.a) scope15.get((d<?>) t0Var12.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope15.get((d<?>) t0Var12.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (fw0.a) scope15.get((d<?>) t0Var12.b(fw0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                Scope scope16 = (Scope) obj2;
                                ParametersHolder parametersHolder4 = (ParametersHolder) obj3;
                                sv0.c cVar26 = sv0.c.f161028a;
                                scope16.getClass();
                                parametersHolder4.getClass();
                                t0 t0Var13 = s0.f105811a;
                                return new u((rv0.a) scope16.get((d<?>) t0Var13.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (qv0.a) scope16.get((d<?>) t0Var13.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (l) scope16.get((d<?>) t0Var13.b(l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.d) scope16.get((d<?>) t0Var13.b(tv0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (g) scope16.get((d<?>) t0Var13.b(g.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (v) scope16.get((d<?>) t0Var13.b(v.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.f) scope16.get((d<?>) t0Var13.b(tv0.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (b63.o) parametersHolder4.elementAt(0, t0Var13.b(b63.o.class)), (o82.g) parametersHolder4.elementAt(1, t0Var13.b(o82.g.class)));
                            case 27:
                                Scope scope17 = (Scope) obj2;
                                sv0.c cVar27 = sv0.c.f161028a;
                                scope17.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var14 = s0.f105811a;
                                return new a0((tv0.c) scope17.get((d<?>) t0Var14.b(tv0.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (s) scope17.get((d<?>) t0Var14.b(s.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (fw0.a) scope17.get((d<?>) t0Var14.b(fw0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                Scope scope18 = (Scope) obj2;
                                sv0.c cVar28 = sv0.c.f161028a;
                                scope18.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var15 = s0.f105811a;
                                return new r((tv0.a) scope18.get((d<?>) t0Var15.b(tv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (w) scope18.get((d<?>) t0Var15.b(w.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.i) scope18.get((d<?>) t0Var15.b(tv0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (t) scope18.get((d<?>) t0Var15.b(t.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope18.get((d<?>) t0Var15.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                Scope scope19 = (Scope) obj2;
                                sv0.c cVar29 = sv0.c.f161028a;
                                scope19.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var16 = s0.f105811a;
                                return new nw0.g((rv0.a) scope19.get((d<?>) t0Var16.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.d) scope19.get((d<?>) t0Var16.b(tv0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.b) scope19.get((d<?>) t0Var16.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                        }
                    }
                }, kind4, j0Var4), module4));
                final int i47 = 21;
                new KoinDefinition(module4, e5.n(new BeanDefinition(companion4.getRootScopeQualifier(), t0Var4.b(tv0.v.class), null, new e23.p() { // from class: st0.b
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i47) {
                            case 0:
                                Scope scope = (Scope) obj2;
                                c cVar3 = c.f160846a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new p3((i) scope.get((d<?>) s0.f105811a.b(i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                Scope scope2 = (Scope) obj2;
                                c cVar4 = c.f160846a;
                                scope2.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new i0((kt0.a) scope2.get((d<?>) s0.f105811a.b(kt0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 2:
                                Scope scope3 = (Scope) obj2;
                                c cVar5 = c.f160846a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var5 = s0.f105811a;
                                return new j0((lt0.d) scope3.get((d<?>) t0Var5.b(lt0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (i0) scope3.get((d<?>) t0Var5.b(i0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                c cVar6 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (lt0.c) ez0.b.a(ez0.b.f67468a, ez0.c.GC, lt0.c.class, new h.a[0], null, null, null, 120);
                            case 4:
                                Scope scope4 = (Scope) obj2;
                                c cVar7 = c.f160846a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var6 = s0.f105811a;
                                return new x((lt0.c) scope4.get((d<?>) t0Var6.b(lt0.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (i0) scope4.get((d<?>) t0Var6.b(i0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 5:
                                c cVar8 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (f) ez0.b.a(ez0.b.f67468a, ez0.c.GC, f.class, new h.a[0], null, null, null, 120);
                            case 6:
                                Scope scope5 = (Scope) obj2;
                                c cVar9 = c.f160846a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var7 = s0.f105811a;
                                return new f1((f) scope5.get((d<?>) t0Var7.b(f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (lt0.d) scope5.get((d<?>) t0Var7.b(lt0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 7:
                                c cVar10 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (lt0.d) ez0.b.a(ez0.b.f67468a, ez0.c.GC, lt0.d.class, new h.a[0], null, null, null, 120);
                            case 8:
                                c cVar11 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (su.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, su.a.class, new h.a[0], null, null, null, 120);
                            case 9:
                                Scope scope6 = (Scope) obj2;
                                c cVar12 = c.f160846a;
                                scope6.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new yt0.a((lt0.a) scope6.get((d<?>) s0.f105811a.b(lt0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                Scope scope7 = (Scope) obj2;
                                c cVar13 = c.f160846a;
                                scope7.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var8 = s0.f105811a;
                                return new f0((yt0.s0) scope7.get((d<?>) t0Var8.b(yt0.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (r0) scope7.get((d<?>) t0Var8.b(r0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                c cVar14 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new o();
                            case 12:
                                c cVar15 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new n();
                            case 13:
                                c cVar16 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new i3(e20.a.C1315a.a(e20.a.f62587b));
                            case 14:
                                Scope scope8 = (Scope) obj2;
                                c cVar17 = c.f160846a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new o0((yt0.s0) scope8.get((d<?>) s0.f105811a.b(yt0.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                Scope scope9 = (Scope) obj2;
                                c cVar18 = c.f160846a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var9 = s0.f105811a;
                                return new z((yt0.s0) scope9.get((d<?>) t0Var9.b(yt0.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (i0) scope9.get((d<?>) t0Var9.b(i0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 16:
                                Scope scope10 = (Scope) obj2;
                                c cVar19 = c.f160846a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new p((r0) scope10.get((d<?>) s0.f105811a.b(r0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 17:
                                Scope scope11 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                c cVar110 = c.f160846a;
                                scope11.getClass();
                                parametersHolder.getClass();
                                return new h4((String) parametersHolder.get(0), (String) parametersHolder.get(1), ((Number) parametersHolder.get(2)).longValue(), (f1) scope11.get((d<?>) s0.f105811a.b(f1.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 18:
                                ParametersHolder parametersHolder2 = (ParametersHolder) obj3;
                                sv0.a aVar4 = sv0.a.f161025a;
                                ((Scope) obj2).getClass();
                                parametersHolder2.getClass();
                                return new dw0.a(new uv0.b((r53.i) parametersHolder2.elementAt(0, s0.f105811a.b(r53.i.class))));
                            case 19:
                                ParametersHolder parametersHolder3 = (ParametersHolder) obj3;
                                sv0.a aVar5 = sv0.a.f161025a;
                                ((Scope) obj2).getClass();
                                parametersHolder3.getClass();
                                return new cw0.a((dw0.a) parametersHolder3.elementAt(0, s0.f105811a.b(dw0.a.class)));
                            case 20:
                                sv0.c cVar20 = sv0.c.f161028a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new tv0.b();
                            case 21:
                                Scope scope12 = (Scope) obj2;
                                sv0.c cVar21 = sv0.c.f161028a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var10 = s0.f105811a;
                                return new v((qv0.a) scope12.get((d<?>) t0Var10.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope12.get((d<?>) t0Var10.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.b) scope12.get((d<?>) t0Var10.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                sv0.c cVar22 = sv0.c.f161028a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (nv0.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, nv0.a.class, new h.a[0], null, null, null, 88);
                            case 23:
                                Scope scope13 = (Scope) obj2;
                                sv0.c cVar23 = sv0.c.f161028a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new t((tv0.b) scope13.get((d<?>) s0.f105811a.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 24:
                                Scope scope14 = (Scope) obj2;
                                sv0.c cVar24 = sv0.c.f161028a;
                                scope14.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var11 = s0.f105811a;
                                return new k((qv0.a) scope14.get((d<?>) t0Var11.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope14.get((d<?>) t0Var11.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                Scope scope15 = (Scope) obj2;
                                sv0.c cVar25 = sv0.c.f161028a;
                                scope15.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var12 = s0.f105811a;
                                return new m((tv0.a) scope15.get((d<?>) t0Var12.b(tv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (w) scope15.get((d<?>) t0Var12.b(w.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.i) scope15.get((d<?>) t0Var12.b(tv0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (s) scope15.get((d<?>) t0Var12.b(s.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.b) scope15.get((d<?>) t0Var12.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (qv0.a) scope15.get((d<?>) t0Var12.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope15.get((d<?>) t0Var12.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (fw0.a) scope15.get((d<?>) t0Var12.b(fw0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                Scope scope16 = (Scope) obj2;
                                ParametersHolder parametersHolder4 = (ParametersHolder) obj3;
                                sv0.c cVar26 = sv0.c.f161028a;
                                scope16.getClass();
                                parametersHolder4.getClass();
                                t0 t0Var13 = s0.f105811a;
                                return new u((rv0.a) scope16.get((d<?>) t0Var13.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (qv0.a) scope16.get((d<?>) t0Var13.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (l) scope16.get((d<?>) t0Var13.b(l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.d) scope16.get((d<?>) t0Var13.b(tv0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (g) scope16.get((d<?>) t0Var13.b(g.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (v) scope16.get((d<?>) t0Var13.b(v.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.f) scope16.get((d<?>) t0Var13.b(tv0.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (b63.o) parametersHolder4.elementAt(0, t0Var13.b(b63.o.class)), (o82.g) parametersHolder4.elementAt(1, t0Var13.b(o82.g.class)));
                            case 27:
                                Scope scope17 = (Scope) obj2;
                                sv0.c cVar27 = sv0.c.f161028a;
                                scope17.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var14 = s0.f105811a;
                                return new a0((tv0.c) scope17.get((d<?>) t0Var14.b(tv0.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (s) scope17.get((d<?>) t0Var14.b(s.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (fw0.a) scope17.get((d<?>) t0Var14.b(fw0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                Scope scope18 = (Scope) obj2;
                                sv0.c cVar28 = sv0.c.f161028a;
                                scope18.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var15 = s0.f105811a;
                                return new r((tv0.a) scope18.get((d<?>) t0Var15.b(tv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (w) scope18.get((d<?>) t0Var15.b(w.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.i) scope18.get((d<?>) t0Var15.b(tv0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (t) scope18.get((d<?>) t0Var15.b(t.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope18.get((d<?>) t0Var15.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                Scope scope19 = (Scope) obj2;
                                sv0.c cVar29 = sv0.c.f161028a;
                                scope19.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var16 = s0.f105811a;
                                return new nw0.g((rv0.a) scope19.get((d<?>) t0Var16.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.d) scope19.get((d<?>) t0Var16.b(tv0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.b) scope19.get((d<?>) t0Var16.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                        }
                    }
                }, kind4, j0Var4), module4));
                final int i48 = 23;
                new KoinDefinition(module4, e5.n(new BeanDefinition(companion4.getRootScopeQualifier(), t0Var4.b(tv0.t.class), null, new e23.p() { // from class: st0.b
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i48) {
                            case 0:
                                Scope scope = (Scope) obj2;
                                c cVar3 = c.f160846a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new p3((i) scope.get((d<?>) s0.f105811a.b(i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                Scope scope2 = (Scope) obj2;
                                c cVar4 = c.f160846a;
                                scope2.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new i0((kt0.a) scope2.get((d<?>) s0.f105811a.b(kt0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 2:
                                Scope scope3 = (Scope) obj2;
                                c cVar5 = c.f160846a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var5 = s0.f105811a;
                                return new j0((lt0.d) scope3.get((d<?>) t0Var5.b(lt0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (i0) scope3.get((d<?>) t0Var5.b(i0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                c cVar6 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (lt0.c) ez0.b.a(ez0.b.f67468a, ez0.c.GC, lt0.c.class, new h.a[0], null, null, null, 120);
                            case 4:
                                Scope scope4 = (Scope) obj2;
                                c cVar7 = c.f160846a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var6 = s0.f105811a;
                                return new x((lt0.c) scope4.get((d<?>) t0Var6.b(lt0.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (i0) scope4.get((d<?>) t0Var6.b(i0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 5:
                                c cVar8 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (f) ez0.b.a(ez0.b.f67468a, ez0.c.GC, f.class, new h.a[0], null, null, null, 120);
                            case 6:
                                Scope scope5 = (Scope) obj2;
                                c cVar9 = c.f160846a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var7 = s0.f105811a;
                                return new f1((f) scope5.get((d<?>) t0Var7.b(f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (lt0.d) scope5.get((d<?>) t0Var7.b(lt0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 7:
                                c cVar10 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (lt0.d) ez0.b.a(ez0.b.f67468a, ez0.c.GC, lt0.d.class, new h.a[0], null, null, null, 120);
                            case 8:
                                c cVar11 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (su.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, su.a.class, new h.a[0], null, null, null, 120);
                            case 9:
                                Scope scope6 = (Scope) obj2;
                                c cVar12 = c.f160846a;
                                scope6.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new yt0.a((lt0.a) scope6.get((d<?>) s0.f105811a.b(lt0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                Scope scope7 = (Scope) obj2;
                                c cVar13 = c.f160846a;
                                scope7.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var8 = s0.f105811a;
                                return new f0((yt0.s0) scope7.get((d<?>) t0Var8.b(yt0.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (r0) scope7.get((d<?>) t0Var8.b(r0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                c cVar14 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new o();
                            case 12:
                                c cVar15 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new n();
                            case 13:
                                c cVar16 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new i3(e20.a.C1315a.a(e20.a.f62587b));
                            case 14:
                                Scope scope8 = (Scope) obj2;
                                c cVar17 = c.f160846a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new o0((yt0.s0) scope8.get((d<?>) s0.f105811a.b(yt0.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                Scope scope9 = (Scope) obj2;
                                c cVar18 = c.f160846a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var9 = s0.f105811a;
                                return new z((yt0.s0) scope9.get((d<?>) t0Var9.b(yt0.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (i0) scope9.get((d<?>) t0Var9.b(i0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 16:
                                Scope scope10 = (Scope) obj2;
                                c cVar19 = c.f160846a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new p((r0) scope10.get((d<?>) s0.f105811a.b(r0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 17:
                                Scope scope11 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                c cVar110 = c.f160846a;
                                scope11.getClass();
                                parametersHolder.getClass();
                                return new h4((String) parametersHolder.get(0), (String) parametersHolder.get(1), ((Number) parametersHolder.get(2)).longValue(), (f1) scope11.get((d<?>) s0.f105811a.b(f1.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 18:
                                ParametersHolder parametersHolder2 = (ParametersHolder) obj3;
                                sv0.a aVar4 = sv0.a.f161025a;
                                ((Scope) obj2).getClass();
                                parametersHolder2.getClass();
                                return new dw0.a(new uv0.b((r53.i) parametersHolder2.elementAt(0, s0.f105811a.b(r53.i.class))));
                            case 19:
                                ParametersHolder parametersHolder3 = (ParametersHolder) obj3;
                                sv0.a aVar5 = sv0.a.f161025a;
                                ((Scope) obj2).getClass();
                                parametersHolder3.getClass();
                                return new cw0.a((dw0.a) parametersHolder3.elementAt(0, s0.f105811a.b(dw0.a.class)));
                            case 20:
                                sv0.c cVar20 = sv0.c.f161028a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new tv0.b();
                            case 21:
                                Scope scope12 = (Scope) obj2;
                                sv0.c cVar21 = sv0.c.f161028a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var10 = s0.f105811a;
                                return new v((qv0.a) scope12.get((d<?>) t0Var10.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope12.get((d<?>) t0Var10.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.b) scope12.get((d<?>) t0Var10.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                sv0.c cVar22 = sv0.c.f161028a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (nv0.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, nv0.a.class, new h.a[0], null, null, null, 88);
                            case 23:
                                Scope scope13 = (Scope) obj2;
                                sv0.c cVar23 = sv0.c.f161028a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new t((tv0.b) scope13.get((d<?>) s0.f105811a.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 24:
                                Scope scope14 = (Scope) obj2;
                                sv0.c cVar24 = sv0.c.f161028a;
                                scope14.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var11 = s0.f105811a;
                                return new k((qv0.a) scope14.get((d<?>) t0Var11.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope14.get((d<?>) t0Var11.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                Scope scope15 = (Scope) obj2;
                                sv0.c cVar25 = sv0.c.f161028a;
                                scope15.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var12 = s0.f105811a;
                                return new m((tv0.a) scope15.get((d<?>) t0Var12.b(tv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (w) scope15.get((d<?>) t0Var12.b(w.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.i) scope15.get((d<?>) t0Var12.b(tv0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (s) scope15.get((d<?>) t0Var12.b(s.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.b) scope15.get((d<?>) t0Var12.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (qv0.a) scope15.get((d<?>) t0Var12.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope15.get((d<?>) t0Var12.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (fw0.a) scope15.get((d<?>) t0Var12.b(fw0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                Scope scope16 = (Scope) obj2;
                                ParametersHolder parametersHolder4 = (ParametersHolder) obj3;
                                sv0.c cVar26 = sv0.c.f161028a;
                                scope16.getClass();
                                parametersHolder4.getClass();
                                t0 t0Var13 = s0.f105811a;
                                return new u((rv0.a) scope16.get((d<?>) t0Var13.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (qv0.a) scope16.get((d<?>) t0Var13.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (l) scope16.get((d<?>) t0Var13.b(l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.d) scope16.get((d<?>) t0Var13.b(tv0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (g) scope16.get((d<?>) t0Var13.b(g.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (v) scope16.get((d<?>) t0Var13.b(v.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.f) scope16.get((d<?>) t0Var13.b(tv0.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (b63.o) parametersHolder4.elementAt(0, t0Var13.b(b63.o.class)), (o82.g) parametersHolder4.elementAt(1, t0Var13.b(o82.g.class)));
                            case 27:
                                Scope scope17 = (Scope) obj2;
                                sv0.c cVar27 = sv0.c.f161028a;
                                scope17.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var14 = s0.f105811a;
                                return new a0((tv0.c) scope17.get((d<?>) t0Var14.b(tv0.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (s) scope17.get((d<?>) t0Var14.b(s.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (fw0.a) scope17.get((d<?>) t0Var14.b(fw0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                Scope scope18 = (Scope) obj2;
                                sv0.c cVar28 = sv0.c.f161028a;
                                scope18.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var15 = s0.f105811a;
                                return new r((tv0.a) scope18.get((d<?>) t0Var15.b(tv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (w) scope18.get((d<?>) t0Var15.b(w.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.i) scope18.get((d<?>) t0Var15.b(tv0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (t) scope18.get((d<?>) t0Var15.b(t.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope18.get((d<?>) t0Var15.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                Scope scope19 = (Scope) obj2;
                                sv0.c cVar29 = sv0.c.f161028a;
                                scope19.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var16 = s0.f105811a;
                                return new nw0.g((rv0.a) scope19.get((d<?>) t0Var16.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.d) scope19.get((d<?>) t0Var16.b(tv0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.b) scope19.get((d<?>) t0Var16.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                        }
                    }
                }, kind4, j0Var4), module4));
                final int i49 = 24;
                new KoinDefinition(module4, e5.n(new BeanDefinition(companion4.getRootScopeQualifier(), t0Var4.b(ew0.k.class), null, new e23.p() { // from class: st0.b
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i49) {
                            case 0:
                                Scope scope = (Scope) obj2;
                                c cVar3 = c.f160846a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new p3((i) scope.get((d<?>) s0.f105811a.b(i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                Scope scope2 = (Scope) obj2;
                                c cVar4 = c.f160846a;
                                scope2.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new i0((kt0.a) scope2.get((d<?>) s0.f105811a.b(kt0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 2:
                                Scope scope3 = (Scope) obj2;
                                c cVar5 = c.f160846a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var5 = s0.f105811a;
                                return new j0((lt0.d) scope3.get((d<?>) t0Var5.b(lt0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (i0) scope3.get((d<?>) t0Var5.b(i0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                c cVar6 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (lt0.c) ez0.b.a(ez0.b.f67468a, ez0.c.GC, lt0.c.class, new h.a[0], null, null, null, 120);
                            case 4:
                                Scope scope4 = (Scope) obj2;
                                c cVar7 = c.f160846a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var6 = s0.f105811a;
                                return new x((lt0.c) scope4.get((d<?>) t0Var6.b(lt0.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (i0) scope4.get((d<?>) t0Var6.b(i0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 5:
                                c cVar8 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (f) ez0.b.a(ez0.b.f67468a, ez0.c.GC, f.class, new h.a[0], null, null, null, 120);
                            case 6:
                                Scope scope5 = (Scope) obj2;
                                c cVar9 = c.f160846a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var7 = s0.f105811a;
                                return new f1((f) scope5.get((d<?>) t0Var7.b(f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (lt0.d) scope5.get((d<?>) t0Var7.b(lt0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 7:
                                c cVar10 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (lt0.d) ez0.b.a(ez0.b.f67468a, ez0.c.GC, lt0.d.class, new h.a[0], null, null, null, 120);
                            case 8:
                                c cVar11 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (su.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, su.a.class, new h.a[0], null, null, null, 120);
                            case 9:
                                Scope scope6 = (Scope) obj2;
                                c cVar12 = c.f160846a;
                                scope6.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new yt0.a((lt0.a) scope6.get((d<?>) s0.f105811a.b(lt0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                Scope scope7 = (Scope) obj2;
                                c cVar13 = c.f160846a;
                                scope7.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var8 = s0.f105811a;
                                return new f0((yt0.s0) scope7.get((d<?>) t0Var8.b(yt0.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (r0) scope7.get((d<?>) t0Var8.b(r0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                c cVar14 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new o();
                            case 12:
                                c cVar15 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new n();
                            case 13:
                                c cVar16 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new i3(e20.a.C1315a.a(e20.a.f62587b));
                            case 14:
                                Scope scope8 = (Scope) obj2;
                                c cVar17 = c.f160846a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new o0((yt0.s0) scope8.get((d<?>) s0.f105811a.b(yt0.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                Scope scope9 = (Scope) obj2;
                                c cVar18 = c.f160846a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var9 = s0.f105811a;
                                return new z((yt0.s0) scope9.get((d<?>) t0Var9.b(yt0.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (i0) scope9.get((d<?>) t0Var9.b(i0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 16:
                                Scope scope10 = (Scope) obj2;
                                c cVar19 = c.f160846a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new p((r0) scope10.get((d<?>) s0.f105811a.b(r0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 17:
                                Scope scope11 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                c cVar110 = c.f160846a;
                                scope11.getClass();
                                parametersHolder.getClass();
                                return new h4((String) parametersHolder.get(0), (String) parametersHolder.get(1), ((Number) parametersHolder.get(2)).longValue(), (f1) scope11.get((d<?>) s0.f105811a.b(f1.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 18:
                                ParametersHolder parametersHolder2 = (ParametersHolder) obj3;
                                sv0.a aVar4 = sv0.a.f161025a;
                                ((Scope) obj2).getClass();
                                parametersHolder2.getClass();
                                return new dw0.a(new uv0.b((r53.i) parametersHolder2.elementAt(0, s0.f105811a.b(r53.i.class))));
                            case 19:
                                ParametersHolder parametersHolder3 = (ParametersHolder) obj3;
                                sv0.a aVar5 = sv0.a.f161025a;
                                ((Scope) obj2).getClass();
                                parametersHolder3.getClass();
                                return new cw0.a((dw0.a) parametersHolder3.elementAt(0, s0.f105811a.b(dw0.a.class)));
                            case 20:
                                sv0.c cVar20 = sv0.c.f161028a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new tv0.b();
                            case 21:
                                Scope scope12 = (Scope) obj2;
                                sv0.c cVar21 = sv0.c.f161028a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var10 = s0.f105811a;
                                return new v((qv0.a) scope12.get((d<?>) t0Var10.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope12.get((d<?>) t0Var10.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.b) scope12.get((d<?>) t0Var10.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                sv0.c cVar22 = sv0.c.f161028a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (nv0.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, nv0.a.class, new h.a[0], null, null, null, 88);
                            case 23:
                                Scope scope13 = (Scope) obj2;
                                sv0.c cVar23 = sv0.c.f161028a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new t((tv0.b) scope13.get((d<?>) s0.f105811a.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 24:
                                Scope scope14 = (Scope) obj2;
                                sv0.c cVar24 = sv0.c.f161028a;
                                scope14.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var11 = s0.f105811a;
                                return new k((qv0.a) scope14.get((d<?>) t0Var11.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope14.get((d<?>) t0Var11.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                Scope scope15 = (Scope) obj2;
                                sv0.c cVar25 = sv0.c.f161028a;
                                scope15.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var12 = s0.f105811a;
                                return new m((tv0.a) scope15.get((d<?>) t0Var12.b(tv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (w) scope15.get((d<?>) t0Var12.b(w.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.i) scope15.get((d<?>) t0Var12.b(tv0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (s) scope15.get((d<?>) t0Var12.b(s.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.b) scope15.get((d<?>) t0Var12.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (qv0.a) scope15.get((d<?>) t0Var12.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope15.get((d<?>) t0Var12.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (fw0.a) scope15.get((d<?>) t0Var12.b(fw0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                Scope scope16 = (Scope) obj2;
                                ParametersHolder parametersHolder4 = (ParametersHolder) obj3;
                                sv0.c cVar26 = sv0.c.f161028a;
                                scope16.getClass();
                                parametersHolder4.getClass();
                                t0 t0Var13 = s0.f105811a;
                                return new u((rv0.a) scope16.get((d<?>) t0Var13.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (qv0.a) scope16.get((d<?>) t0Var13.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (l) scope16.get((d<?>) t0Var13.b(l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.d) scope16.get((d<?>) t0Var13.b(tv0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (g) scope16.get((d<?>) t0Var13.b(g.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (v) scope16.get((d<?>) t0Var13.b(v.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.f) scope16.get((d<?>) t0Var13.b(tv0.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (b63.o) parametersHolder4.elementAt(0, t0Var13.b(b63.o.class)), (o82.g) parametersHolder4.elementAt(1, t0Var13.b(o82.g.class)));
                            case 27:
                                Scope scope17 = (Scope) obj2;
                                sv0.c cVar27 = sv0.c.f161028a;
                                scope17.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var14 = s0.f105811a;
                                return new a0((tv0.c) scope17.get((d<?>) t0Var14.b(tv0.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (s) scope17.get((d<?>) t0Var14.b(s.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (fw0.a) scope17.get((d<?>) t0Var14.b(fw0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                Scope scope18 = (Scope) obj2;
                                sv0.c cVar28 = sv0.c.f161028a;
                                scope18.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var15 = s0.f105811a;
                                return new r((tv0.a) scope18.get((d<?>) t0Var15.b(tv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (w) scope18.get((d<?>) t0Var15.b(w.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.i) scope18.get((d<?>) t0Var15.b(tv0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (t) scope18.get((d<?>) t0Var15.b(t.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope18.get((d<?>) t0Var15.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                Scope scope19 = (Scope) obj2;
                                sv0.c cVar29 = sv0.c.f161028a;
                                scope19.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var16 = s0.f105811a;
                                return new nw0.g((rv0.a) scope19.get((d<?>) t0Var16.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.d) scope19.get((d<?>) t0Var16.b(tv0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.b) scope19.get((d<?>) t0Var16.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                        }
                    }
                }, kind4, j0Var4), module4));
                final int i54 = 25;
                new KoinDefinition(module4, e5.n(new BeanDefinition(companion4.getRootScopeQualifier(), t0Var4.b(ew0.m.class), null, new e23.p() { // from class: st0.b
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i54) {
                            case 0:
                                Scope scope = (Scope) obj2;
                                c cVar3 = c.f160846a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new p3((i) scope.get((d<?>) s0.f105811a.b(i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                Scope scope2 = (Scope) obj2;
                                c cVar4 = c.f160846a;
                                scope2.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new i0((kt0.a) scope2.get((d<?>) s0.f105811a.b(kt0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 2:
                                Scope scope3 = (Scope) obj2;
                                c cVar5 = c.f160846a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var5 = s0.f105811a;
                                return new j0((lt0.d) scope3.get((d<?>) t0Var5.b(lt0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (i0) scope3.get((d<?>) t0Var5.b(i0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                c cVar6 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (lt0.c) ez0.b.a(ez0.b.f67468a, ez0.c.GC, lt0.c.class, new h.a[0], null, null, null, 120);
                            case 4:
                                Scope scope4 = (Scope) obj2;
                                c cVar7 = c.f160846a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var6 = s0.f105811a;
                                return new x((lt0.c) scope4.get((d<?>) t0Var6.b(lt0.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (i0) scope4.get((d<?>) t0Var6.b(i0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 5:
                                c cVar8 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (f) ez0.b.a(ez0.b.f67468a, ez0.c.GC, f.class, new h.a[0], null, null, null, 120);
                            case 6:
                                Scope scope5 = (Scope) obj2;
                                c cVar9 = c.f160846a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var7 = s0.f105811a;
                                return new f1((f) scope5.get((d<?>) t0Var7.b(f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (lt0.d) scope5.get((d<?>) t0Var7.b(lt0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 7:
                                c cVar10 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (lt0.d) ez0.b.a(ez0.b.f67468a, ez0.c.GC, lt0.d.class, new h.a[0], null, null, null, 120);
                            case 8:
                                c cVar11 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (su.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, su.a.class, new h.a[0], null, null, null, 120);
                            case 9:
                                Scope scope6 = (Scope) obj2;
                                c cVar12 = c.f160846a;
                                scope6.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new yt0.a((lt0.a) scope6.get((d<?>) s0.f105811a.b(lt0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                Scope scope7 = (Scope) obj2;
                                c cVar13 = c.f160846a;
                                scope7.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var8 = s0.f105811a;
                                return new f0((yt0.s0) scope7.get((d<?>) t0Var8.b(yt0.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (r0) scope7.get((d<?>) t0Var8.b(r0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                c cVar14 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new o();
                            case 12:
                                c cVar15 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new n();
                            case 13:
                                c cVar16 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new i3(e20.a.C1315a.a(e20.a.f62587b));
                            case 14:
                                Scope scope8 = (Scope) obj2;
                                c cVar17 = c.f160846a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new o0((yt0.s0) scope8.get((d<?>) s0.f105811a.b(yt0.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                Scope scope9 = (Scope) obj2;
                                c cVar18 = c.f160846a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var9 = s0.f105811a;
                                return new z((yt0.s0) scope9.get((d<?>) t0Var9.b(yt0.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (i0) scope9.get((d<?>) t0Var9.b(i0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 16:
                                Scope scope10 = (Scope) obj2;
                                c cVar19 = c.f160846a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new p((r0) scope10.get((d<?>) s0.f105811a.b(r0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 17:
                                Scope scope11 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                c cVar110 = c.f160846a;
                                scope11.getClass();
                                parametersHolder.getClass();
                                return new h4((String) parametersHolder.get(0), (String) parametersHolder.get(1), ((Number) parametersHolder.get(2)).longValue(), (f1) scope11.get((d<?>) s0.f105811a.b(f1.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 18:
                                ParametersHolder parametersHolder2 = (ParametersHolder) obj3;
                                sv0.a aVar4 = sv0.a.f161025a;
                                ((Scope) obj2).getClass();
                                parametersHolder2.getClass();
                                return new dw0.a(new uv0.b((r53.i) parametersHolder2.elementAt(0, s0.f105811a.b(r53.i.class))));
                            case 19:
                                ParametersHolder parametersHolder3 = (ParametersHolder) obj3;
                                sv0.a aVar5 = sv0.a.f161025a;
                                ((Scope) obj2).getClass();
                                parametersHolder3.getClass();
                                return new cw0.a((dw0.a) parametersHolder3.elementAt(0, s0.f105811a.b(dw0.a.class)));
                            case 20:
                                sv0.c cVar20 = sv0.c.f161028a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new tv0.b();
                            case 21:
                                Scope scope12 = (Scope) obj2;
                                sv0.c cVar21 = sv0.c.f161028a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var10 = s0.f105811a;
                                return new v((qv0.a) scope12.get((d<?>) t0Var10.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope12.get((d<?>) t0Var10.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.b) scope12.get((d<?>) t0Var10.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                sv0.c cVar22 = sv0.c.f161028a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (nv0.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, nv0.a.class, new h.a[0], null, null, null, 88);
                            case 23:
                                Scope scope13 = (Scope) obj2;
                                sv0.c cVar23 = sv0.c.f161028a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new t((tv0.b) scope13.get((d<?>) s0.f105811a.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 24:
                                Scope scope14 = (Scope) obj2;
                                sv0.c cVar24 = sv0.c.f161028a;
                                scope14.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var11 = s0.f105811a;
                                return new k((qv0.a) scope14.get((d<?>) t0Var11.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope14.get((d<?>) t0Var11.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                Scope scope15 = (Scope) obj2;
                                sv0.c cVar25 = sv0.c.f161028a;
                                scope15.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var12 = s0.f105811a;
                                return new m((tv0.a) scope15.get((d<?>) t0Var12.b(tv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (w) scope15.get((d<?>) t0Var12.b(w.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.i) scope15.get((d<?>) t0Var12.b(tv0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (s) scope15.get((d<?>) t0Var12.b(s.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.b) scope15.get((d<?>) t0Var12.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (qv0.a) scope15.get((d<?>) t0Var12.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope15.get((d<?>) t0Var12.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (fw0.a) scope15.get((d<?>) t0Var12.b(fw0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                Scope scope16 = (Scope) obj2;
                                ParametersHolder parametersHolder4 = (ParametersHolder) obj3;
                                sv0.c cVar26 = sv0.c.f161028a;
                                scope16.getClass();
                                parametersHolder4.getClass();
                                t0 t0Var13 = s0.f105811a;
                                return new u((rv0.a) scope16.get((d<?>) t0Var13.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (qv0.a) scope16.get((d<?>) t0Var13.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (l) scope16.get((d<?>) t0Var13.b(l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.d) scope16.get((d<?>) t0Var13.b(tv0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (g) scope16.get((d<?>) t0Var13.b(g.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (v) scope16.get((d<?>) t0Var13.b(v.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.f) scope16.get((d<?>) t0Var13.b(tv0.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (b63.o) parametersHolder4.elementAt(0, t0Var13.b(b63.o.class)), (o82.g) parametersHolder4.elementAt(1, t0Var13.b(o82.g.class)));
                            case 27:
                                Scope scope17 = (Scope) obj2;
                                sv0.c cVar27 = sv0.c.f161028a;
                                scope17.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var14 = s0.f105811a;
                                return new a0((tv0.c) scope17.get((d<?>) t0Var14.b(tv0.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (s) scope17.get((d<?>) t0Var14.b(s.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (fw0.a) scope17.get((d<?>) t0Var14.b(fw0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                Scope scope18 = (Scope) obj2;
                                sv0.c cVar28 = sv0.c.f161028a;
                                scope18.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var15 = s0.f105811a;
                                return new r((tv0.a) scope18.get((d<?>) t0Var15.b(tv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (w) scope18.get((d<?>) t0Var15.b(w.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.i) scope18.get((d<?>) t0Var15.b(tv0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (t) scope18.get((d<?>) t0Var15.b(t.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope18.get((d<?>) t0Var15.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                Scope scope19 = (Scope) obj2;
                                sv0.c cVar29 = sv0.c.f161028a;
                                scope19.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var16 = s0.f105811a;
                                return new nw0.g((rv0.a) scope19.get((d<?>) t0Var16.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.d) scope19.get((d<?>) t0Var16.b(tv0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.b) scope19.get((d<?>) t0Var16.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                        }
                    }
                }, kind4, j0Var4), module4));
                final int i55 = 26;
                new KoinDefinition(module4, e5.n(new BeanDefinition(companion4.getRootScopeQualifier(), t0Var4.b(gw0.u.class), null, new e23.p() { // from class: st0.b
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i55) {
                            case 0:
                                Scope scope = (Scope) obj2;
                                c cVar3 = c.f160846a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new p3((i) scope.get((d<?>) s0.f105811a.b(i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                Scope scope2 = (Scope) obj2;
                                c cVar4 = c.f160846a;
                                scope2.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new i0((kt0.a) scope2.get((d<?>) s0.f105811a.b(kt0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 2:
                                Scope scope3 = (Scope) obj2;
                                c cVar5 = c.f160846a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var5 = s0.f105811a;
                                return new j0((lt0.d) scope3.get((d<?>) t0Var5.b(lt0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (i0) scope3.get((d<?>) t0Var5.b(i0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                c cVar6 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (lt0.c) ez0.b.a(ez0.b.f67468a, ez0.c.GC, lt0.c.class, new h.a[0], null, null, null, 120);
                            case 4:
                                Scope scope4 = (Scope) obj2;
                                c cVar7 = c.f160846a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var6 = s0.f105811a;
                                return new x((lt0.c) scope4.get((d<?>) t0Var6.b(lt0.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (i0) scope4.get((d<?>) t0Var6.b(i0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 5:
                                c cVar8 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (f) ez0.b.a(ez0.b.f67468a, ez0.c.GC, f.class, new h.a[0], null, null, null, 120);
                            case 6:
                                Scope scope5 = (Scope) obj2;
                                c cVar9 = c.f160846a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var7 = s0.f105811a;
                                return new f1((f) scope5.get((d<?>) t0Var7.b(f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (lt0.d) scope5.get((d<?>) t0Var7.b(lt0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 7:
                                c cVar10 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (lt0.d) ez0.b.a(ez0.b.f67468a, ez0.c.GC, lt0.d.class, new h.a[0], null, null, null, 120);
                            case 8:
                                c cVar11 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (su.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, su.a.class, new h.a[0], null, null, null, 120);
                            case 9:
                                Scope scope6 = (Scope) obj2;
                                c cVar12 = c.f160846a;
                                scope6.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new yt0.a((lt0.a) scope6.get((d<?>) s0.f105811a.b(lt0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                Scope scope7 = (Scope) obj2;
                                c cVar13 = c.f160846a;
                                scope7.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var8 = s0.f105811a;
                                return new f0((yt0.s0) scope7.get((d<?>) t0Var8.b(yt0.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (r0) scope7.get((d<?>) t0Var8.b(r0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                c cVar14 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new o();
                            case 12:
                                c cVar15 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new n();
                            case 13:
                                c cVar16 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new i3(e20.a.C1315a.a(e20.a.f62587b));
                            case 14:
                                Scope scope8 = (Scope) obj2;
                                c cVar17 = c.f160846a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new o0((yt0.s0) scope8.get((d<?>) s0.f105811a.b(yt0.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                Scope scope9 = (Scope) obj2;
                                c cVar18 = c.f160846a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var9 = s0.f105811a;
                                return new z((yt0.s0) scope9.get((d<?>) t0Var9.b(yt0.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (i0) scope9.get((d<?>) t0Var9.b(i0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 16:
                                Scope scope10 = (Scope) obj2;
                                c cVar19 = c.f160846a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new p((r0) scope10.get((d<?>) s0.f105811a.b(r0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 17:
                                Scope scope11 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                c cVar110 = c.f160846a;
                                scope11.getClass();
                                parametersHolder.getClass();
                                return new h4((String) parametersHolder.get(0), (String) parametersHolder.get(1), ((Number) parametersHolder.get(2)).longValue(), (f1) scope11.get((d<?>) s0.f105811a.b(f1.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 18:
                                ParametersHolder parametersHolder2 = (ParametersHolder) obj3;
                                sv0.a aVar4 = sv0.a.f161025a;
                                ((Scope) obj2).getClass();
                                parametersHolder2.getClass();
                                return new dw0.a(new uv0.b((r53.i) parametersHolder2.elementAt(0, s0.f105811a.b(r53.i.class))));
                            case 19:
                                ParametersHolder parametersHolder3 = (ParametersHolder) obj3;
                                sv0.a aVar5 = sv0.a.f161025a;
                                ((Scope) obj2).getClass();
                                parametersHolder3.getClass();
                                return new cw0.a((dw0.a) parametersHolder3.elementAt(0, s0.f105811a.b(dw0.a.class)));
                            case 20:
                                sv0.c cVar20 = sv0.c.f161028a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new tv0.b();
                            case 21:
                                Scope scope12 = (Scope) obj2;
                                sv0.c cVar21 = sv0.c.f161028a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var10 = s0.f105811a;
                                return new v((qv0.a) scope12.get((d<?>) t0Var10.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope12.get((d<?>) t0Var10.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.b) scope12.get((d<?>) t0Var10.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                sv0.c cVar22 = sv0.c.f161028a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (nv0.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, nv0.a.class, new h.a[0], null, null, null, 88);
                            case 23:
                                Scope scope13 = (Scope) obj2;
                                sv0.c cVar23 = sv0.c.f161028a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new t((tv0.b) scope13.get((d<?>) s0.f105811a.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 24:
                                Scope scope14 = (Scope) obj2;
                                sv0.c cVar24 = sv0.c.f161028a;
                                scope14.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var11 = s0.f105811a;
                                return new k((qv0.a) scope14.get((d<?>) t0Var11.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope14.get((d<?>) t0Var11.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                Scope scope15 = (Scope) obj2;
                                sv0.c cVar25 = sv0.c.f161028a;
                                scope15.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var12 = s0.f105811a;
                                return new m((tv0.a) scope15.get((d<?>) t0Var12.b(tv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (w) scope15.get((d<?>) t0Var12.b(w.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.i) scope15.get((d<?>) t0Var12.b(tv0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (s) scope15.get((d<?>) t0Var12.b(s.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.b) scope15.get((d<?>) t0Var12.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (qv0.a) scope15.get((d<?>) t0Var12.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope15.get((d<?>) t0Var12.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (fw0.a) scope15.get((d<?>) t0Var12.b(fw0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                Scope scope16 = (Scope) obj2;
                                ParametersHolder parametersHolder4 = (ParametersHolder) obj3;
                                sv0.c cVar26 = sv0.c.f161028a;
                                scope16.getClass();
                                parametersHolder4.getClass();
                                t0 t0Var13 = s0.f105811a;
                                return new u((rv0.a) scope16.get((d<?>) t0Var13.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (qv0.a) scope16.get((d<?>) t0Var13.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (l) scope16.get((d<?>) t0Var13.b(l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.d) scope16.get((d<?>) t0Var13.b(tv0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (g) scope16.get((d<?>) t0Var13.b(g.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (v) scope16.get((d<?>) t0Var13.b(v.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.f) scope16.get((d<?>) t0Var13.b(tv0.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (b63.o) parametersHolder4.elementAt(0, t0Var13.b(b63.o.class)), (o82.g) parametersHolder4.elementAt(1, t0Var13.b(o82.g.class)));
                            case 27:
                                Scope scope17 = (Scope) obj2;
                                sv0.c cVar27 = sv0.c.f161028a;
                                scope17.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var14 = s0.f105811a;
                                return new a0((tv0.c) scope17.get((d<?>) t0Var14.b(tv0.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (s) scope17.get((d<?>) t0Var14.b(s.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (fw0.a) scope17.get((d<?>) t0Var14.b(fw0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                Scope scope18 = (Scope) obj2;
                                sv0.c cVar28 = sv0.c.f161028a;
                                scope18.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var15 = s0.f105811a;
                                return new r((tv0.a) scope18.get((d<?>) t0Var15.b(tv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (w) scope18.get((d<?>) t0Var15.b(w.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.i) scope18.get((d<?>) t0Var15.b(tv0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (t) scope18.get((d<?>) t0Var15.b(t.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope18.get((d<?>) t0Var15.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                Scope scope19 = (Scope) obj2;
                                sv0.c cVar29 = sv0.c.f161028a;
                                scope19.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var16 = s0.f105811a;
                                return new nw0.g((rv0.a) scope19.get((d<?>) t0Var16.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.d) scope19.get((d<?>) t0Var16.b(tv0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.b) scope19.get((d<?>) t0Var16.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                        }
                    }
                }, kind4, j0Var4), module4));
                final int i56 = 27;
                new KoinDefinition(module4, e5.n(new BeanDefinition(companion4.getRootScopeQualifier(), t0Var4.b(nw0.a0.class), null, new e23.p() { // from class: st0.b
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i56) {
                            case 0:
                                Scope scope = (Scope) obj2;
                                c cVar3 = c.f160846a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new p3((i) scope.get((d<?>) s0.f105811a.b(i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                Scope scope2 = (Scope) obj2;
                                c cVar4 = c.f160846a;
                                scope2.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new i0((kt0.a) scope2.get((d<?>) s0.f105811a.b(kt0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 2:
                                Scope scope3 = (Scope) obj2;
                                c cVar5 = c.f160846a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var5 = s0.f105811a;
                                return new j0((lt0.d) scope3.get((d<?>) t0Var5.b(lt0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (i0) scope3.get((d<?>) t0Var5.b(i0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                c cVar6 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (lt0.c) ez0.b.a(ez0.b.f67468a, ez0.c.GC, lt0.c.class, new h.a[0], null, null, null, 120);
                            case 4:
                                Scope scope4 = (Scope) obj2;
                                c cVar7 = c.f160846a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var6 = s0.f105811a;
                                return new x((lt0.c) scope4.get((d<?>) t0Var6.b(lt0.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (i0) scope4.get((d<?>) t0Var6.b(i0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 5:
                                c cVar8 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (f) ez0.b.a(ez0.b.f67468a, ez0.c.GC, f.class, new h.a[0], null, null, null, 120);
                            case 6:
                                Scope scope5 = (Scope) obj2;
                                c cVar9 = c.f160846a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var7 = s0.f105811a;
                                return new f1((f) scope5.get((d<?>) t0Var7.b(f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (lt0.d) scope5.get((d<?>) t0Var7.b(lt0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 7:
                                c cVar10 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (lt0.d) ez0.b.a(ez0.b.f67468a, ez0.c.GC, lt0.d.class, new h.a[0], null, null, null, 120);
                            case 8:
                                c cVar11 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (su.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, su.a.class, new h.a[0], null, null, null, 120);
                            case 9:
                                Scope scope6 = (Scope) obj2;
                                c cVar12 = c.f160846a;
                                scope6.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new yt0.a((lt0.a) scope6.get((d<?>) s0.f105811a.b(lt0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                Scope scope7 = (Scope) obj2;
                                c cVar13 = c.f160846a;
                                scope7.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var8 = s0.f105811a;
                                return new f0((yt0.s0) scope7.get((d<?>) t0Var8.b(yt0.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (r0) scope7.get((d<?>) t0Var8.b(r0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                c cVar14 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new o();
                            case 12:
                                c cVar15 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new n();
                            case 13:
                                c cVar16 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new i3(e20.a.C1315a.a(e20.a.f62587b));
                            case 14:
                                Scope scope8 = (Scope) obj2;
                                c cVar17 = c.f160846a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new o0((yt0.s0) scope8.get((d<?>) s0.f105811a.b(yt0.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                Scope scope9 = (Scope) obj2;
                                c cVar18 = c.f160846a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var9 = s0.f105811a;
                                return new z((yt0.s0) scope9.get((d<?>) t0Var9.b(yt0.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (i0) scope9.get((d<?>) t0Var9.b(i0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 16:
                                Scope scope10 = (Scope) obj2;
                                c cVar19 = c.f160846a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new p((r0) scope10.get((d<?>) s0.f105811a.b(r0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 17:
                                Scope scope11 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                c cVar110 = c.f160846a;
                                scope11.getClass();
                                parametersHolder.getClass();
                                return new h4((String) parametersHolder.get(0), (String) parametersHolder.get(1), ((Number) parametersHolder.get(2)).longValue(), (f1) scope11.get((d<?>) s0.f105811a.b(f1.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 18:
                                ParametersHolder parametersHolder2 = (ParametersHolder) obj3;
                                sv0.a aVar4 = sv0.a.f161025a;
                                ((Scope) obj2).getClass();
                                parametersHolder2.getClass();
                                return new dw0.a(new uv0.b((r53.i) parametersHolder2.elementAt(0, s0.f105811a.b(r53.i.class))));
                            case 19:
                                ParametersHolder parametersHolder3 = (ParametersHolder) obj3;
                                sv0.a aVar5 = sv0.a.f161025a;
                                ((Scope) obj2).getClass();
                                parametersHolder3.getClass();
                                return new cw0.a((dw0.a) parametersHolder3.elementAt(0, s0.f105811a.b(dw0.a.class)));
                            case 20:
                                sv0.c cVar20 = sv0.c.f161028a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new tv0.b();
                            case 21:
                                Scope scope12 = (Scope) obj2;
                                sv0.c cVar21 = sv0.c.f161028a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var10 = s0.f105811a;
                                return new v((qv0.a) scope12.get((d<?>) t0Var10.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope12.get((d<?>) t0Var10.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.b) scope12.get((d<?>) t0Var10.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                sv0.c cVar22 = sv0.c.f161028a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (nv0.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, nv0.a.class, new h.a[0], null, null, null, 88);
                            case 23:
                                Scope scope13 = (Scope) obj2;
                                sv0.c cVar23 = sv0.c.f161028a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new t((tv0.b) scope13.get((d<?>) s0.f105811a.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 24:
                                Scope scope14 = (Scope) obj2;
                                sv0.c cVar24 = sv0.c.f161028a;
                                scope14.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var11 = s0.f105811a;
                                return new k((qv0.a) scope14.get((d<?>) t0Var11.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope14.get((d<?>) t0Var11.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                Scope scope15 = (Scope) obj2;
                                sv0.c cVar25 = sv0.c.f161028a;
                                scope15.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var12 = s0.f105811a;
                                return new m((tv0.a) scope15.get((d<?>) t0Var12.b(tv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (w) scope15.get((d<?>) t0Var12.b(w.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.i) scope15.get((d<?>) t0Var12.b(tv0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (s) scope15.get((d<?>) t0Var12.b(s.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.b) scope15.get((d<?>) t0Var12.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (qv0.a) scope15.get((d<?>) t0Var12.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope15.get((d<?>) t0Var12.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (fw0.a) scope15.get((d<?>) t0Var12.b(fw0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                Scope scope16 = (Scope) obj2;
                                ParametersHolder parametersHolder4 = (ParametersHolder) obj3;
                                sv0.c cVar26 = sv0.c.f161028a;
                                scope16.getClass();
                                parametersHolder4.getClass();
                                t0 t0Var13 = s0.f105811a;
                                return new u((rv0.a) scope16.get((d<?>) t0Var13.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (qv0.a) scope16.get((d<?>) t0Var13.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (l) scope16.get((d<?>) t0Var13.b(l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.d) scope16.get((d<?>) t0Var13.b(tv0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (g) scope16.get((d<?>) t0Var13.b(g.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (v) scope16.get((d<?>) t0Var13.b(v.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.f) scope16.get((d<?>) t0Var13.b(tv0.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (b63.o) parametersHolder4.elementAt(0, t0Var13.b(b63.o.class)), (o82.g) parametersHolder4.elementAt(1, t0Var13.b(o82.g.class)));
                            case 27:
                                Scope scope17 = (Scope) obj2;
                                sv0.c cVar27 = sv0.c.f161028a;
                                scope17.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var14 = s0.f105811a;
                                return new a0((tv0.c) scope17.get((d<?>) t0Var14.b(tv0.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (s) scope17.get((d<?>) t0Var14.b(s.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (fw0.a) scope17.get((d<?>) t0Var14.b(fw0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                Scope scope18 = (Scope) obj2;
                                sv0.c cVar28 = sv0.c.f161028a;
                                scope18.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var15 = s0.f105811a;
                                return new r((tv0.a) scope18.get((d<?>) t0Var15.b(tv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (w) scope18.get((d<?>) t0Var15.b(w.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.i) scope18.get((d<?>) t0Var15.b(tv0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (t) scope18.get((d<?>) t0Var15.b(t.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope18.get((d<?>) t0Var15.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                Scope scope19 = (Scope) obj2;
                                sv0.c cVar29 = sv0.c.f161028a;
                                scope19.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var16 = s0.f105811a;
                                return new nw0.g((rv0.a) scope19.get((d<?>) t0Var16.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.d) scope19.get((d<?>) t0Var16.b(tv0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.b) scope19.get((d<?>) t0Var16.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                        }
                    }
                }, kind4, j0Var4), module4));
                final int i57 = 28;
                new KoinDefinition(module4, e5.n(new BeanDefinition(companion4.getRootScopeQualifier(), t0Var4.b(nw0.r.class), null, new e23.p() { // from class: st0.b
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i57) {
                            case 0:
                                Scope scope = (Scope) obj2;
                                c cVar3 = c.f160846a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new p3((i) scope.get((d<?>) s0.f105811a.b(i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                Scope scope2 = (Scope) obj2;
                                c cVar4 = c.f160846a;
                                scope2.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new i0((kt0.a) scope2.get((d<?>) s0.f105811a.b(kt0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 2:
                                Scope scope3 = (Scope) obj2;
                                c cVar5 = c.f160846a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var5 = s0.f105811a;
                                return new j0((lt0.d) scope3.get((d<?>) t0Var5.b(lt0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (i0) scope3.get((d<?>) t0Var5.b(i0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                c cVar6 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (lt0.c) ez0.b.a(ez0.b.f67468a, ez0.c.GC, lt0.c.class, new h.a[0], null, null, null, 120);
                            case 4:
                                Scope scope4 = (Scope) obj2;
                                c cVar7 = c.f160846a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var6 = s0.f105811a;
                                return new x((lt0.c) scope4.get((d<?>) t0Var6.b(lt0.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (i0) scope4.get((d<?>) t0Var6.b(i0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 5:
                                c cVar8 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (f) ez0.b.a(ez0.b.f67468a, ez0.c.GC, f.class, new h.a[0], null, null, null, 120);
                            case 6:
                                Scope scope5 = (Scope) obj2;
                                c cVar9 = c.f160846a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var7 = s0.f105811a;
                                return new f1((f) scope5.get((d<?>) t0Var7.b(f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (lt0.d) scope5.get((d<?>) t0Var7.b(lt0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 7:
                                c cVar10 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (lt0.d) ez0.b.a(ez0.b.f67468a, ez0.c.GC, lt0.d.class, new h.a[0], null, null, null, 120);
                            case 8:
                                c cVar11 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (su.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, su.a.class, new h.a[0], null, null, null, 120);
                            case 9:
                                Scope scope6 = (Scope) obj2;
                                c cVar12 = c.f160846a;
                                scope6.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new yt0.a((lt0.a) scope6.get((d<?>) s0.f105811a.b(lt0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                Scope scope7 = (Scope) obj2;
                                c cVar13 = c.f160846a;
                                scope7.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var8 = s0.f105811a;
                                return new f0((yt0.s0) scope7.get((d<?>) t0Var8.b(yt0.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (r0) scope7.get((d<?>) t0Var8.b(r0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                c cVar14 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new o();
                            case 12:
                                c cVar15 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new n();
                            case 13:
                                c cVar16 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new i3(e20.a.C1315a.a(e20.a.f62587b));
                            case 14:
                                Scope scope8 = (Scope) obj2;
                                c cVar17 = c.f160846a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new o0((yt0.s0) scope8.get((d<?>) s0.f105811a.b(yt0.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                Scope scope9 = (Scope) obj2;
                                c cVar18 = c.f160846a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var9 = s0.f105811a;
                                return new z((yt0.s0) scope9.get((d<?>) t0Var9.b(yt0.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (i0) scope9.get((d<?>) t0Var9.b(i0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 16:
                                Scope scope10 = (Scope) obj2;
                                c cVar19 = c.f160846a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new p((r0) scope10.get((d<?>) s0.f105811a.b(r0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 17:
                                Scope scope11 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                c cVar110 = c.f160846a;
                                scope11.getClass();
                                parametersHolder.getClass();
                                return new h4((String) parametersHolder.get(0), (String) parametersHolder.get(1), ((Number) parametersHolder.get(2)).longValue(), (f1) scope11.get((d<?>) s0.f105811a.b(f1.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 18:
                                ParametersHolder parametersHolder2 = (ParametersHolder) obj3;
                                sv0.a aVar4 = sv0.a.f161025a;
                                ((Scope) obj2).getClass();
                                parametersHolder2.getClass();
                                return new dw0.a(new uv0.b((r53.i) parametersHolder2.elementAt(0, s0.f105811a.b(r53.i.class))));
                            case 19:
                                ParametersHolder parametersHolder3 = (ParametersHolder) obj3;
                                sv0.a aVar5 = sv0.a.f161025a;
                                ((Scope) obj2).getClass();
                                parametersHolder3.getClass();
                                return new cw0.a((dw0.a) parametersHolder3.elementAt(0, s0.f105811a.b(dw0.a.class)));
                            case 20:
                                sv0.c cVar20 = sv0.c.f161028a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new tv0.b();
                            case 21:
                                Scope scope12 = (Scope) obj2;
                                sv0.c cVar21 = sv0.c.f161028a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var10 = s0.f105811a;
                                return new v((qv0.a) scope12.get((d<?>) t0Var10.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope12.get((d<?>) t0Var10.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.b) scope12.get((d<?>) t0Var10.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                sv0.c cVar22 = sv0.c.f161028a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (nv0.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, nv0.a.class, new h.a[0], null, null, null, 88);
                            case 23:
                                Scope scope13 = (Scope) obj2;
                                sv0.c cVar23 = sv0.c.f161028a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new t((tv0.b) scope13.get((d<?>) s0.f105811a.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 24:
                                Scope scope14 = (Scope) obj2;
                                sv0.c cVar24 = sv0.c.f161028a;
                                scope14.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var11 = s0.f105811a;
                                return new k((qv0.a) scope14.get((d<?>) t0Var11.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope14.get((d<?>) t0Var11.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                Scope scope15 = (Scope) obj2;
                                sv0.c cVar25 = sv0.c.f161028a;
                                scope15.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var12 = s0.f105811a;
                                return new m((tv0.a) scope15.get((d<?>) t0Var12.b(tv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (w) scope15.get((d<?>) t0Var12.b(w.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.i) scope15.get((d<?>) t0Var12.b(tv0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (s) scope15.get((d<?>) t0Var12.b(s.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.b) scope15.get((d<?>) t0Var12.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (qv0.a) scope15.get((d<?>) t0Var12.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope15.get((d<?>) t0Var12.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (fw0.a) scope15.get((d<?>) t0Var12.b(fw0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                Scope scope16 = (Scope) obj2;
                                ParametersHolder parametersHolder4 = (ParametersHolder) obj3;
                                sv0.c cVar26 = sv0.c.f161028a;
                                scope16.getClass();
                                parametersHolder4.getClass();
                                t0 t0Var13 = s0.f105811a;
                                return new u((rv0.a) scope16.get((d<?>) t0Var13.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (qv0.a) scope16.get((d<?>) t0Var13.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (l) scope16.get((d<?>) t0Var13.b(l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.d) scope16.get((d<?>) t0Var13.b(tv0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (g) scope16.get((d<?>) t0Var13.b(g.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (v) scope16.get((d<?>) t0Var13.b(v.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.f) scope16.get((d<?>) t0Var13.b(tv0.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (b63.o) parametersHolder4.elementAt(0, t0Var13.b(b63.o.class)), (o82.g) parametersHolder4.elementAt(1, t0Var13.b(o82.g.class)));
                            case 27:
                                Scope scope17 = (Scope) obj2;
                                sv0.c cVar27 = sv0.c.f161028a;
                                scope17.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var14 = s0.f105811a;
                                return new a0((tv0.c) scope17.get((d<?>) t0Var14.b(tv0.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (s) scope17.get((d<?>) t0Var14.b(s.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (fw0.a) scope17.get((d<?>) t0Var14.b(fw0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                Scope scope18 = (Scope) obj2;
                                sv0.c cVar28 = sv0.c.f161028a;
                                scope18.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var15 = s0.f105811a;
                                return new r((tv0.a) scope18.get((d<?>) t0Var15.b(tv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (w) scope18.get((d<?>) t0Var15.b(w.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.i) scope18.get((d<?>) t0Var15.b(tv0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (t) scope18.get((d<?>) t0Var15.b(t.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope18.get((d<?>) t0Var15.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                Scope scope19 = (Scope) obj2;
                                sv0.c cVar29 = sv0.c.f161028a;
                                scope19.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var16 = s0.f105811a;
                                return new nw0.g((rv0.a) scope19.get((d<?>) t0Var16.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.d) scope19.get((d<?>) t0Var16.b(tv0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.b) scope19.get((d<?>) t0Var16.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                        }
                    }
                }, kind4, j0Var4), module4));
                final int i58 = 29;
                new KoinDefinition(module4, e5.n(new BeanDefinition(companion4.getRootScopeQualifier(), t0Var4.b(nw0.g.class), null, new e23.p() { // from class: st0.b
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i58) {
                            case 0:
                                Scope scope = (Scope) obj2;
                                c cVar3 = c.f160846a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new p3((i) scope.get((d<?>) s0.f105811a.b(i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                Scope scope2 = (Scope) obj2;
                                c cVar4 = c.f160846a;
                                scope2.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new i0((kt0.a) scope2.get((d<?>) s0.f105811a.b(kt0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 2:
                                Scope scope3 = (Scope) obj2;
                                c cVar5 = c.f160846a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var5 = s0.f105811a;
                                return new j0((lt0.d) scope3.get((d<?>) t0Var5.b(lt0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (i0) scope3.get((d<?>) t0Var5.b(i0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                c cVar6 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (lt0.c) ez0.b.a(ez0.b.f67468a, ez0.c.GC, lt0.c.class, new h.a[0], null, null, null, 120);
                            case 4:
                                Scope scope4 = (Scope) obj2;
                                c cVar7 = c.f160846a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var6 = s0.f105811a;
                                return new x((lt0.c) scope4.get((d<?>) t0Var6.b(lt0.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (i0) scope4.get((d<?>) t0Var6.b(i0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 5:
                                c cVar8 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (f) ez0.b.a(ez0.b.f67468a, ez0.c.GC, f.class, new h.a[0], null, null, null, 120);
                            case 6:
                                Scope scope5 = (Scope) obj2;
                                c cVar9 = c.f160846a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var7 = s0.f105811a;
                                return new f1((f) scope5.get((d<?>) t0Var7.b(f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (lt0.d) scope5.get((d<?>) t0Var7.b(lt0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 7:
                                c cVar10 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (lt0.d) ez0.b.a(ez0.b.f67468a, ez0.c.GC, lt0.d.class, new h.a[0], null, null, null, 120);
                            case 8:
                                c cVar11 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (su.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, su.a.class, new h.a[0], null, null, null, 120);
                            case 9:
                                Scope scope6 = (Scope) obj2;
                                c cVar12 = c.f160846a;
                                scope6.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new yt0.a((lt0.a) scope6.get((d<?>) s0.f105811a.b(lt0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                Scope scope7 = (Scope) obj2;
                                c cVar13 = c.f160846a;
                                scope7.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var8 = s0.f105811a;
                                return new f0((yt0.s0) scope7.get((d<?>) t0Var8.b(yt0.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (r0) scope7.get((d<?>) t0Var8.b(r0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                c cVar14 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new o();
                            case 12:
                                c cVar15 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new n();
                            case 13:
                                c cVar16 = c.f160846a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new i3(e20.a.C1315a.a(e20.a.f62587b));
                            case 14:
                                Scope scope8 = (Scope) obj2;
                                c cVar17 = c.f160846a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new o0((yt0.s0) scope8.get((d<?>) s0.f105811a.b(yt0.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                Scope scope9 = (Scope) obj2;
                                c cVar18 = c.f160846a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var9 = s0.f105811a;
                                return new z((yt0.s0) scope9.get((d<?>) t0Var9.b(yt0.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (i0) scope9.get((d<?>) t0Var9.b(i0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 16:
                                Scope scope10 = (Scope) obj2;
                                c cVar19 = c.f160846a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new p((r0) scope10.get((d<?>) s0.f105811a.b(r0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 17:
                                Scope scope11 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                c cVar110 = c.f160846a;
                                scope11.getClass();
                                parametersHolder.getClass();
                                return new h4((String) parametersHolder.get(0), (String) parametersHolder.get(1), ((Number) parametersHolder.get(2)).longValue(), (f1) scope11.get((d<?>) s0.f105811a.b(f1.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 18:
                                ParametersHolder parametersHolder2 = (ParametersHolder) obj3;
                                sv0.a aVar4 = sv0.a.f161025a;
                                ((Scope) obj2).getClass();
                                parametersHolder2.getClass();
                                return new dw0.a(new uv0.b((r53.i) parametersHolder2.elementAt(0, s0.f105811a.b(r53.i.class))));
                            case 19:
                                ParametersHolder parametersHolder3 = (ParametersHolder) obj3;
                                sv0.a aVar5 = sv0.a.f161025a;
                                ((Scope) obj2).getClass();
                                parametersHolder3.getClass();
                                return new cw0.a((dw0.a) parametersHolder3.elementAt(0, s0.f105811a.b(dw0.a.class)));
                            case 20:
                                sv0.c cVar20 = sv0.c.f161028a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new tv0.b();
                            case 21:
                                Scope scope12 = (Scope) obj2;
                                sv0.c cVar21 = sv0.c.f161028a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var10 = s0.f105811a;
                                return new v((qv0.a) scope12.get((d<?>) t0Var10.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope12.get((d<?>) t0Var10.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.b) scope12.get((d<?>) t0Var10.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                sv0.c cVar22 = sv0.c.f161028a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (nv0.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, nv0.a.class, new h.a[0], null, null, null, 88);
                            case 23:
                                Scope scope13 = (Scope) obj2;
                                sv0.c cVar23 = sv0.c.f161028a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new t((tv0.b) scope13.get((d<?>) s0.f105811a.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 24:
                                Scope scope14 = (Scope) obj2;
                                sv0.c cVar24 = sv0.c.f161028a;
                                scope14.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var11 = s0.f105811a;
                                return new k((qv0.a) scope14.get((d<?>) t0Var11.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope14.get((d<?>) t0Var11.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                Scope scope15 = (Scope) obj2;
                                sv0.c cVar25 = sv0.c.f161028a;
                                scope15.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var12 = s0.f105811a;
                                return new m((tv0.a) scope15.get((d<?>) t0Var12.b(tv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (w) scope15.get((d<?>) t0Var12.b(w.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.i) scope15.get((d<?>) t0Var12.b(tv0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (s) scope15.get((d<?>) t0Var12.b(s.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.b) scope15.get((d<?>) t0Var12.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (qv0.a) scope15.get((d<?>) t0Var12.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope15.get((d<?>) t0Var12.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (fw0.a) scope15.get((d<?>) t0Var12.b(fw0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                Scope scope16 = (Scope) obj2;
                                ParametersHolder parametersHolder4 = (ParametersHolder) obj3;
                                sv0.c cVar26 = sv0.c.f161028a;
                                scope16.getClass();
                                parametersHolder4.getClass();
                                t0 t0Var13 = s0.f105811a;
                                return new u((rv0.a) scope16.get((d<?>) t0Var13.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (qv0.a) scope16.get((d<?>) t0Var13.b(qv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (l) scope16.get((d<?>) t0Var13.b(l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.d) scope16.get((d<?>) t0Var13.b(tv0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (g) scope16.get((d<?>) t0Var13.b(g.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (v) scope16.get((d<?>) t0Var13.b(v.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.f) scope16.get((d<?>) t0Var13.b(tv0.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (b63.o) parametersHolder4.elementAt(0, t0Var13.b(b63.o.class)), (o82.g) parametersHolder4.elementAt(1, t0Var13.b(o82.g.class)));
                            case 27:
                                Scope scope17 = (Scope) obj2;
                                sv0.c cVar27 = sv0.c.f161028a;
                                scope17.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var14 = s0.f105811a;
                                return new a0((tv0.c) scope17.get((d<?>) t0Var14.b(tv0.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (s) scope17.get((d<?>) t0Var14.b(s.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (fw0.a) scope17.get((d<?>) t0Var14.b(fw0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                Scope scope18 = (Scope) obj2;
                                sv0.c cVar28 = sv0.c.f161028a;
                                scope18.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var15 = s0.f105811a;
                                return new r((tv0.a) scope18.get((d<?>) t0Var15.b(tv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (w) scope18.get((d<?>) t0Var15.b(w.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.i) scope18.get((d<?>) t0Var15.b(tv0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (t) scope18.get((d<?>) t0Var15.b(t.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rv0.a) scope18.get((d<?>) t0Var15.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                Scope scope19 = (Scope) obj2;
                                sv0.c cVar29 = sv0.c.f161028a;
                                scope19.getClass();
                                ((ParametersHolder) obj3).getClass();
                                t0 t0Var16 = s0.f105811a;
                                return new nw0.g((rv0.a) scope19.get((d<?>) t0Var16.b(rv0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.d) scope19.get((d<?>) t0Var16.b(tv0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tv0.b) scope19.get((d<?>) t0Var16.b(tv0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                        }
                    }
                }, kind4, j0Var4), module4));
                return Unit.INSTANCE;
            case 11:
                oi0.b bVar2 = (oi0.b) obj;
                int i59 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                bVar2.getClass();
                bVar2.L();
                return Unit.INSTANCE;
            case 12:
                oi0.b bVar3 = (oi0.b) obj;
                int i64 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                bVar3.getClass();
                bVar3.L();
                return Unit.INSTANCE;
            case 13:
                oi0.b bVar4 = (oi0.b) obj;
                int i65 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                bVar4.getClass();
                bVar4.L();
                bVar4.I();
                return Unit.INSTANCE;
            case 14:
                oi0.b bVar5 = (oi0.b) obj;
                int i66 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                bVar5.getClass();
                bVar5.L();
                return Unit.INSTANCE;
            case 15:
                ((p5.k0) obj).getClass();
                return Unit.INSTANCE;
            case 16:
                oi0.b bVar6 = (oi0.b) obj;
                bVar6.getClass();
                bVar6.n();
                return Unit.INSTANCE;
            case 17:
                oi0.b bVar7 = (oi0.b) obj;
                bVar7.getClass();
                bVar7.M();
                return Unit.INSTANCE;
            case 18:
                ((p5.k0) obj).getClass();
                return Unit.INSTANCE;
            case 19:
                ((p5.k0) obj).getClass();
                return Unit.INSTANCE;
            case 20:
                String str = (String) obj;
                str.getClass();
                v21.f.f175333a.getClass();
                String strM = v21.f.m(str);
                if (strM.length() == 0) {
                    return str.length() > 0 ? "0" : "";
                }
                return strM;
            case 21:
                t21.d dVar = t21.d.f161852a;
                ((s21.a) obj).getClass();
                return Unit.INSTANCE;
            case 22:
                t21.d dVar2 = t21.d.f161852a;
                ((String) obj).getClass();
                return Unit.INSTANCE;
            case 23:
                t21.d dVar3 = t21.d.f161852a;
                ((l01.a) obj).getClass();
                return Unit.INSTANCE;
            case 24:
                ((Integer) obj).intValue();
                t21.g gVar = t21.g.f161870a;
                return Unit.INSTANCE;
            case 25:
                ((Integer) obj).intValue();
                t21.g gVar2 = t21.g.f161870a;
                return Unit.INSTANCE;
            case 26:
                ((Integer) obj).intValue();
                t21.g gVar3 = t21.g.f161870a;
                return Unit.INSTANCE;
            case 27:
                x5.l0 l0Var = (x5.l0) obj;
                l0Var.getClass();
                return l0Var;
            case 28:
                ((s21.m.c) obj).getClass();
                return Unit.INSTANCE;
            default:
                s21.m mVar = (s21.m) obj;
                mVar.getClass();
                return mVar.f156147a;
        }
    }
}
