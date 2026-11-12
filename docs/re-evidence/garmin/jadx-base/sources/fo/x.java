package fo;

import by0.g2;
import c83.h;
import dy0.f;
import ey0.g0;
import gy0.a1;
import gy0.a2;
import gy0.b0;
import gy0.c1;
import gy0.c2;
import gy0.d0;
import gy0.d1;
import gy0.e1;
import gy0.g;
import gy0.h1;
import gy0.i0;
import gy0.j1;
import gy0.k1;
import gy0.l0;
import gy0.n0;
import gy0.n1;
import gy0.o0;
import gy0.o1;
import gy0.q0;
import gy0.q1;
import gy0.r;
import gy0.r0;
import gy0.s1;
import gy0.t;
import gy0.t0;
import gy0.t1;
import gy0.v0;
import gy0.x0;
import gy0.y;
import gy0.z0;
import i3.e5;
import java.util.Arrays;
import ky0.w0;
import org.koin.android.ext.koin.ModuleExtKt;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Kind;
import org.koin.core.definition.KoinDefinition;
import org.koin.core.instance.ScopedInstanceFactory;
import org.koin.core.module.Module;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.registry.ScopeRegistry;
import org.koin.core.scope.Scope;
import org.koin.dsl.ScopeDSL;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p13.j0;
import p5.h0;
import p5.k0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class x implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f72451a;

    public /* synthetic */ x(int i14) {
        this.f72451a = i14;
    }

    @Override // e23.l
    public final Object invoke(Object obj) throws Exception {
        final int i14 = 16;
        final int i15 = 14;
        final int i16 = 26;
        final int i17 = 7;
        final int i18 = 22;
        final int i19 = 17;
        final int i24 = 1;
        switch (this.f72451a) {
            case 0:
                y yVar = y.f72452a;
                ((String) obj).getClass();
                return Unit.INSTANCE;
            case 1:
                y yVar2 = y.f72452a;
                ((jo.f) obj).getClass();
                return Unit.INSTANCE;
            case 2:
                y yVar3 = y.f72452a;
                ((jo.b) obj).getClass();
                return Unit.INSTANCE;
            case 3:
                y yVar4 = y.f72452a;
                ((wo0.a) obj).getClass();
                return Unit.INSTANCE;
            case 4:
                ((Boolean) obj).booleanValue();
                y yVar5 = y.f72452a;
                return Unit.INSTANCE;
            case 5:
                y yVar6 = y.f72452a;
                ((String) obj).getClass();
                return Unit.INSTANCE;
            case 6:
                y yVar7 = y.f72452a;
                ((String) obj).getClass();
                return Unit.INSTANCE;
            case 7:
                k0 k0Var = (k0) obj;
                k0Var.getClass();
                h0.f(k0Var);
                return Unit.INSTANCE;
            case 8:
                k0 k0Var2 = (k0) obj;
                k0Var2.getClass();
                h0.f(k0Var2);
                return Unit.INSTANCE;
            case 9:
                ((k0) obj).getClass();
                return Unit.INSTANCE;
            case 10:
                ((ds.k0) obj).getClass();
                return Unit.INSTANCE;
            case 11:
                oi0.b bVar = (oi0.b) obj;
                ft0.a aVar = ft0.a.f73439a;
                bVar.getClass();
                bVar.y();
                bVar.P(true, true);
                return Unit.INSTANCE;
            case 12:
                oi0.b bVar2 = (oi0.b) obj;
                ft0.a aVar2 = ft0.a.f73439a;
                bVar2.getClass();
                bVar2.r();
                bVar2.A();
                bVar2.P(true, true);
                return Unit.INSTANCE;
            case 13:
                Byte b14 = (Byte) obj;
                b14.byteValue();
                return String.format("%02x", Arrays.copyOf(new Object[]{b14}, 1));
            case 14:
                ud.a aVar3 = (ud.a) obj;
                fu0.b.C1485b c1485b = fu0.b.f73492d;
                aVar3.getClass();
                ud.c cVarM0 = aVar3.M0("DELETE FROM live_event_contacts");
                try {
                    cVarM0.J0();
                    return Unit.INSTANCE;
                } finally {
                    cVarM0.close();
                }
            case 15:
                k0 k0Var3 = (k0) obj;
                k0Var3.getClass();
                h0.n(k0Var3, "");
                return Unit.INSTANCE;
            case 16:
                Module module = (Module) obj;
                fy0.d dVar = fy0.d.f73881a;
                module.getClass();
                final int i25 = 4;
                e23.p pVar = new e23.p() { // from class: fy0.b
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        Scope scope = (Scope) obj2;
                        ParametersHolder parametersHolder = (ParametersHolder) obj3;
                        switch (i25) {
                            case 0:
                                d dVar2 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new v0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                d dVar3 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new d0(ModuleExtKt.androidContext(scope), (by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 2:
                                d dVar4 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new q0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                d dVar5 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new y((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                d dVar6 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (f) ez0.b.a(ez0.b.f67468a, ez0.c.GC, f.class, new h.a[0], null, null, null, 120);
                            case 5:
                                d dVar7 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new h1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                d dVar8 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new gy0.g0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 7:
                                d dVar9 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new by0.a();
                            case 8:
                                d dVar10 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new b0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                d dVar11 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new j1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                d dVar12 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new x0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                d dVar13 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new t0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 12:
                                d dVar14 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new c1((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 13:
                                d dVar15 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new c2((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 14:
                                d dVar16 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new n1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                d dVar17 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (dy0.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, dy0.a.class, new h.a[0], null, null, null, 120);
                            case 16:
                                d dVar18 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new a1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 17:
                                d dVar19 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new o1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 18:
                                d dVar20 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new d1();
                            case 19:
                                d dVar21 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new gy0.k0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 20:
                                d dVar22 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new o0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 21:
                                d dVar23 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new r((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                d dVar24 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new i0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                d dVar25 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new s1((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 24:
                                d dVar26 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new a2(ModuleExtKt.androidContext(scope), (g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                d dVar27 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new g((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                d dVar28 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (dy0.e) ez0.b.a(ez0.b.f67468a, ez0.c.GC, dy0.e.class, new h.a[0], null, null, null, 120);
                            case 27:
                                d dVar29 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new q1((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                d dVar30 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new t((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                d dVar31 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new r0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                        }
                    }
                };
                ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
                Kind kind = Kind.Factory;
                j0 j0Var = j0.f134944a;
                p005kotlin.jvm.internal.t0 t0Var = s0.f105811a;
                new KoinDefinition(module, e5.n(new BeanDefinition(rootScopeQualifier, t0Var.b(dy0.f.class), null, pVar, kind, j0Var), module));
                final int i26 = 15;
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(dy0.a.class), null, new e23.p() { // from class: fy0.b
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        Scope scope = (Scope) obj2;
                        ParametersHolder parametersHolder = (ParametersHolder) obj3;
                        switch (i26) {
                            case 0:
                                d dVar2 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new v0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                d dVar3 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new d0(ModuleExtKt.androidContext(scope), (by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 2:
                                d dVar4 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new q0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                d dVar5 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new y((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                d dVar6 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (f) ez0.b.a(ez0.b.f67468a, ez0.c.GC, f.class, new h.a[0], null, null, null, 120);
                            case 5:
                                d dVar7 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new h1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                d dVar8 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new gy0.g0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 7:
                                d dVar9 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new by0.a();
                            case 8:
                                d dVar10 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new b0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                d dVar11 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new j1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                d dVar12 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new x0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                d dVar13 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new t0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 12:
                                d dVar14 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new c1((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 13:
                                d dVar15 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new c2((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 14:
                                d dVar16 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new n1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                d dVar17 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (dy0.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, dy0.a.class, new h.a[0], null, null, null, 120);
                            case 16:
                                d dVar18 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new a1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 17:
                                d dVar19 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new o1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 18:
                                d dVar20 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new d1();
                            case 19:
                                d dVar21 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new gy0.k0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 20:
                                d dVar22 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new o0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 21:
                                d dVar23 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new r((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                d dVar24 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new i0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                d dVar25 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new s1((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 24:
                                d dVar26 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new a2(ModuleExtKt.androidContext(scope), (g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                d dVar27 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new g((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                d dVar28 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (dy0.e) ez0.b.a(ez0.b.f67468a, ez0.c.GC, dy0.e.class, new h.a[0], null, null, null, 120);
                            case 27:
                                d dVar29 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new q1((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                d dVar30 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new t((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                d dVar31 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new r0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                        }
                    }
                }, kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(dy0.e.class), null, new e23.p() { // from class: fy0.b
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        Scope scope = (Scope) obj2;
                        ParametersHolder parametersHolder = (ParametersHolder) obj3;
                        switch (i16) {
                            case 0:
                                d dVar2 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new v0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                d dVar3 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new d0(ModuleExtKt.androidContext(scope), (by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 2:
                                d dVar4 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new q0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                d dVar5 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new y((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                d dVar6 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (f) ez0.b.a(ez0.b.f67468a, ez0.c.GC, f.class, new h.a[0], null, null, null, 120);
                            case 5:
                                d dVar7 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new h1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                d dVar8 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new gy0.g0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 7:
                                d dVar9 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new by0.a();
                            case 8:
                                d dVar10 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new b0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                d dVar11 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new j1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                d dVar12 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new x0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                d dVar13 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new t0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 12:
                                d dVar14 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new c1((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 13:
                                d dVar15 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new c2((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 14:
                                d dVar16 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new n1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                d dVar17 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (dy0.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, dy0.a.class, new h.a[0], null, null, null, 120);
                            case 16:
                                d dVar18 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new a1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 17:
                                d dVar19 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new o1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 18:
                                d dVar20 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new d1();
                            case 19:
                                d dVar21 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new gy0.k0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 20:
                                d dVar22 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new o0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 21:
                                d dVar23 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new r((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                d dVar24 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new i0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                d dVar25 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new s1((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 24:
                                d dVar26 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new a2(ModuleExtKt.androidContext(scope), (g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                d dVar27 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new g((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                d dVar28 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (dy0.e) ez0.b.a(ez0.b.f67468a, ez0.c.GC, dy0.e.class, new h.a[0], null, null, null, 120);
                            case 27:
                                d dVar29 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new q1((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                d dVar30 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new t((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                d dVar31 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new r0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                        }
                    }
                }, kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(dy0.b.class), null, new fy0.c(i17), kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(dy0.c.class), null, new fy0.c(i15), kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(dy0.d.class), null, new fy0.c(15), kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(eo1.a.class), null, new fy0.c(i14), kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(g0.class), null, new fy0.c(i19), kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(a22.i.class), null, new fy0.c(18), kind, j0Var), module));
                module.scope(QualifierKt.named("EpicActivityScope"), new x(i19));
                return Unit.INSTANCE;
            case 17:
                ScopeDSL scopeDSL = (ScopeDSL) obj;
                fy0.d dVar2 = fy0.d.f73881a;
                scopeDSL.getClass();
                fn.f fVar = new fn.f(25);
                Qualifier scopeQualifier = scopeDSL.getScopeQualifier();
                Kind kind2 = Kind.Scoped;
                j0 j0Var2 = j0.f134944a;
                p005kotlin.jvm.internal.t0 t0Var2 = s0.f105811a;
                ScopedInstanceFactory scopedInstanceFactory = new ScopedInstanceFactory(new BeanDefinition(scopeQualifier, t0Var2.b(g2.class), null, fVar, kind2, j0Var2));
                scopeDSL.getModule().indexPrimaryType(scopedInstanceFactory);
                new KoinDefinition(scopeDSL.getModule(), scopedInstanceFactory);
                e23.p pVar2 = new e23.p() { // from class: fy0.b
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        Scope scope = (Scope) obj2;
                        ParametersHolder parametersHolder = (ParametersHolder) obj3;
                        switch (i17) {
                            case 0:
                                d dVar3 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new v0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                d dVar4 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new d0(ModuleExtKt.androidContext(scope), (by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 2:
                                d dVar5 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new q0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                d dVar6 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new y((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                d dVar7 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (f) ez0.b.a(ez0.b.f67468a, ez0.c.GC, f.class, new h.a[0], null, null, null, 120);
                            case 5:
                                d dVar8 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new h1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                d dVar9 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new gy0.g0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 7:
                                d dVar10 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new by0.a();
                            case 8:
                                d dVar11 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new b0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                d dVar12 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new j1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                d dVar13 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new x0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                d dVar14 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new t0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 12:
                                d dVar15 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new c1((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 13:
                                d dVar16 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new c2((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 14:
                                d dVar17 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new n1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                d dVar18 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (dy0.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, dy0.a.class, new h.a[0], null, null, null, 120);
                            case 16:
                                d dVar19 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new a1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 17:
                                d dVar110 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new o1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 18:
                                d dVar20 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new d1();
                            case 19:
                                d dVar21 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new gy0.k0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 20:
                                d dVar22 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new o0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 21:
                                d dVar23 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new r((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                d dVar24 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new i0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                d dVar25 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new s1((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 24:
                                d dVar26 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new a2(ModuleExtKt.androidContext(scope), (g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                d dVar27 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new g((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                d dVar28 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (dy0.e) ez0.b.a(ez0.b.f67468a, ez0.c.GC, dy0.e.class, new h.a[0], null, null, null, 120);
                            case 27:
                                d dVar29 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new q1((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                d dVar30 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new t((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                d dVar31 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new r0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                        }
                    }
                };
                Module module2 = scopeDSL.getModule();
                Qualifier scopeQualifier2 = scopeDSL.getScopeQualifier();
                Kind kind3 = Kind.Factory;
                new KoinDefinition(module2, e5.n(new BeanDefinition(scopeQualifier2, t0Var2.b(by0.a.class), null, pVar2, kind3, j0Var2), module2));
                final int i27 = 19;
                e23.p pVar3 = new e23.p() { // from class: fy0.b
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        Scope scope = (Scope) obj2;
                        ParametersHolder parametersHolder = (ParametersHolder) obj3;
                        switch (i27) {
                            case 0:
                                d dVar3 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new v0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                d dVar4 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new d0(ModuleExtKt.androidContext(scope), (by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 2:
                                d dVar5 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new q0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                d dVar6 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new y((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                d dVar7 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (f) ez0.b.a(ez0.b.f67468a, ez0.c.GC, f.class, new h.a[0], null, null, null, 120);
                            case 5:
                                d dVar8 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new h1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                d dVar9 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new gy0.g0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 7:
                                d dVar10 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new by0.a();
                            case 8:
                                d dVar11 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new b0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                d dVar12 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new j1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                d dVar13 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new x0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                d dVar14 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new t0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 12:
                                d dVar15 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new c1((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 13:
                                d dVar16 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new c2((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 14:
                                d dVar17 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new n1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                d dVar18 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (dy0.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, dy0.a.class, new h.a[0], null, null, null, 120);
                            case 16:
                                d dVar19 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new a1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 17:
                                d dVar110 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new o1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 18:
                                d dVar20 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new d1();
                            case 19:
                                d dVar21 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new gy0.k0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 20:
                                d dVar22 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new o0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 21:
                                d dVar23 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new r((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                d dVar24 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new i0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                d dVar25 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new s1((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 24:
                                d dVar26 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new a2(ModuleExtKt.androidContext(scope), (g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                d dVar27 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new g((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                d dVar28 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (dy0.e) ez0.b.a(ez0.b.f67468a, ez0.c.GC, dy0.e.class, new h.a[0], null, null, null, 120);
                            case 27:
                                d dVar29 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new q1((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                d dVar30 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new t((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                d dVar31 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new r0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                        }
                    }
                };
                Module module3 = scopeDSL.getModule();
                new KoinDefinition(module3, e5.n(new BeanDefinition(scopeDSL.getScopeQualifier(), t0Var2.b(gy0.k0.class), null, pVar3, kind3, j0Var2), module3));
                fy0.c cVar = new fy0.c(i24);
                Module module4 = scopeDSL.getModule();
                new KoinDefinition(module4, e5.n(new BeanDefinition(scopeDSL.getScopeQualifier(), t0Var2.b(n0.class), null, cVar, kind3, j0Var2), module4));
                fy0.c cVar2 = new fy0.c(8);
                Module module5 = scopeDSL.getModule();
                new KoinDefinition(module5, e5.n(new BeanDefinition(scopeDSL.getScopeQualifier(), t0Var2.b(l0.class), null, cVar2, kind3, j0Var2), module5));
                fy0.c cVar3 = new fy0.c(9);
                Module module6 = scopeDSL.getModule();
                new KoinDefinition(module6, e5.n(new BeanDefinition(scopeDSL.getScopeQualifier(), t0Var2.b(gy0.q.class), null, cVar3, kind3, j0Var2), module6));
                fy0.c cVar4 = new fy0.c(10);
                Module module7 = scopeDSL.getModule();
                new KoinDefinition(module7, e5.n(new BeanDefinition(scopeDSL.getScopeQualifier(), t0Var2.b(gy0.w.class), null, cVar4, kind3, j0Var2), module7));
                fy0.c cVar5 = new fy0.c(11);
                Module module8 = scopeDSL.getModule();
                new KoinDefinition(module8, e5.n(new BeanDefinition(scopeDSL.getScopeQualifier(), t0Var2.b(gy0.v.class), null, cVar5, kind3, j0Var2), module8));
                fy0.c cVar6 = new fy0.c(12);
                Module module9 = scopeDSL.getModule();
                new KoinDefinition(module9, e5.n(new BeanDefinition(scopeDSL.getScopeQualifier(), t0Var2.b(z0.class), null, cVar6, kind3, j0Var2), module9));
                fy0.c cVar7 = new fy0.c(13);
                Module module10 = scopeDSL.getModule();
                new KoinDefinition(module10, e5.n(new BeanDefinition(scopeDSL.getScopeQualifier(), t0Var2.b(gy0.b.class), null, cVar7, kind3, j0Var2), module10));
                fn.f fVar2 = new fn.f(i16);
                Module module11 = scopeDSL.getModule();
                new KoinDefinition(module11, e5.n(new BeanDefinition(scopeDSL.getScopeQualifier(), t0Var2.b(t1.class), null, fVar2, kind3, j0Var2), module11));
                fn.f fVar3 = new fn.f(27);
                Module module12 = scopeDSL.getModule();
                new KoinDefinition(module12, e5.n(new BeanDefinition(scopeDSL.getScopeQualifier(), t0Var2.b(gy0.j.class), null, fVar3, kind3, j0Var2), module12));
                fn.f fVar4 = new fn.f(28);
                Module module13 = scopeDSL.getModule();
                new KoinDefinition(module13, e5.n(new BeanDefinition(scopeDSL.getScopeQualifier(), t0Var2.b(e1.class), null, fVar4, kind3, j0Var2), module13));
                fn.f fVar5 = new fn.f(29);
                Module module14 = scopeDSL.getModule();
                new KoinDefinition(module14, e5.n(new BeanDefinition(scopeDSL.getScopeQualifier(), t0Var2.b(gy0.j0.class), null, fVar5, kind3, j0Var2), module14));
                final int i28 = 0;
                e23.p pVar4 = new e23.p() { // from class: fy0.b
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        Scope scope = (Scope) obj2;
                        ParametersHolder parametersHolder = (ParametersHolder) obj3;
                        switch (i28) {
                            case 0:
                                d dVar3 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new v0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                d dVar4 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new d0(ModuleExtKt.androidContext(scope), (by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 2:
                                d dVar5 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new q0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                d dVar6 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new y((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                d dVar7 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (f) ez0.b.a(ez0.b.f67468a, ez0.c.GC, f.class, new h.a[0], null, null, null, 120);
                            case 5:
                                d dVar8 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new h1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                d dVar9 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new gy0.g0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 7:
                                d dVar10 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new by0.a();
                            case 8:
                                d dVar11 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new b0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                d dVar12 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new j1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                d dVar13 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new x0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                d dVar14 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new t0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 12:
                                d dVar15 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new c1((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 13:
                                d dVar16 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new c2((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 14:
                                d dVar17 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new n1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                d dVar18 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (dy0.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, dy0.a.class, new h.a[0], null, null, null, 120);
                            case 16:
                                d dVar19 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new a1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 17:
                                d dVar110 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new o1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 18:
                                d dVar20 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new d1();
                            case 19:
                                d dVar21 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new gy0.k0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 20:
                                d dVar22 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new o0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 21:
                                d dVar23 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new r((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                d dVar24 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new i0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                d dVar25 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new s1((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 24:
                                d dVar26 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new a2(ModuleExtKt.androidContext(scope), (g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                d dVar27 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new g((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                d dVar28 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (dy0.e) ez0.b.a(ez0.b.f67468a, ez0.c.GC, dy0.e.class, new h.a[0], null, null, null, 120);
                            case 27:
                                d dVar29 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new q1((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                d dVar30 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new t((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                d dVar31 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new r0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                        }
                    }
                };
                Module module15 = scopeDSL.getModule();
                new KoinDefinition(module15, e5.n(new BeanDefinition(scopeDSL.getScopeQualifier(), t0Var2.b(v0.class), null, pVar4, kind3, j0Var2), module15));
                e23.p pVar5 = new e23.p() { // from class: fy0.b
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        Scope scope = (Scope) obj2;
                        ParametersHolder parametersHolder = (ParametersHolder) obj3;
                        switch (i24) {
                            case 0:
                                d dVar3 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new v0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                d dVar4 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new d0(ModuleExtKt.androidContext(scope), (by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 2:
                                d dVar5 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new q0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                d dVar6 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new y((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                d dVar7 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (f) ez0.b.a(ez0.b.f67468a, ez0.c.GC, f.class, new h.a[0], null, null, null, 120);
                            case 5:
                                d dVar8 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new h1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                d dVar9 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new gy0.g0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 7:
                                d dVar10 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new by0.a();
                            case 8:
                                d dVar11 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new b0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                d dVar12 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new j1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                d dVar13 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new x0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                d dVar14 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new t0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 12:
                                d dVar15 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new c1((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 13:
                                d dVar16 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new c2((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 14:
                                d dVar17 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new n1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                d dVar18 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (dy0.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, dy0.a.class, new h.a[0], null, null, null, 120);
                            case 16:
                                d dVar19 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new a1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 17:
                                d dVar110 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new o1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 18:
                                d dVar20 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new d1();
                            case 19:
                                d dVar21 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new gy0.k0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 20:
                                d dVar22 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new o0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 21:
                                d dVar23 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new r((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                d dVar24 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new i0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                d dVar25 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new s1((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 24:
                                d dVar26 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new a2(ModuleExtKt.androidContext(scope), (g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                d dVar27 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new g((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                d dVar28 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (dy0.e) ez0.b.a(ez0.b.f67468a, ez0.c.GC, dy0.e.class, new h.a[0], null, null, null, 120);
                            case 27:
                                d dVar29 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new q1((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                d dVar30 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new t((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                d dVar31 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new r0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                        }
                    }
                };
                Module module16 = scopeDSL.getModule();
                new KoinDefinition(module16, e5.n(new BeanDefinition(scopeDSL.getScopeQualifier(), t0Var2.b(gy0.d0.class), null, pVar5, kind3, j0Var2), module16));
                final int i29 = 2;
                e23.p pVar6 = new e23.p() { // from class: fy0.b
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        Scope scope = (Scope) obj2;
                        ParametersHolder parametersHolder = (ParametersHolder) obj3;
                        switch (i29) {
                            case 0:
                                d dVar3 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new v0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                d dVar4 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new d0(ModuleExtKt.androidContext(scope), (by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 2:
                                d dVar5 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new q0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                d dVar6 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new y((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                d dVar7 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (f) ez0.b.a(ez0.b.f67468a, ez0.c.GC, f.class, new h.a[0], null, null, null, 120);
                            case 5:
                                d dVar8 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new h1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                d dVar9 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new gy0.g0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 7:
                                d dVar10 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new by0.a();
                            case 8:
                                d dVar11 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new b0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                d dVar12 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new j1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                d dVar13 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new x0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                d dVar14 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new t0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 12:
                                d dVar15 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new c1((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 13:
                                d dVar16 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new c2((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 14:
                                d dVar17 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new n1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                d dVar18 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (dy0.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, dy0.a.class, new h.a[0], null, null, null, 120);
                            case 16:
                                d dVar19 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new a1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 17:
                                d dVar110 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new o1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 18:
                                d dVar20 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new d1();
                            case 19:
                                d dVar21 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new gy0.k0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 20:
                                d dVar22 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new o0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 21:
                                d dVar23 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new r((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                d dVar24 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new i0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                d dVar25 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new s1((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 24:
                                d dVar26 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new a2(ModuleExtKt.androidContext(scope), (g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                d dVar27 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new g((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                d dVar28 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (dy0.e) ez0.b.a(ez0.b.f67468a, ez0.c.GC, dy0.e.class, new h.a[0], null, null, null, 120);
                            case 27:
                                d dVar29 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new q1((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                d dVar30 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new t((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                d dVar31 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new r0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                        }
                    }
                };
                Module module17 = scopeDSL.getModule();
                new KoinDefinition(module17, e5.n(new BeanDefinition(scopeDSL.getScopeQualifier(), t0Var2.b(q0.class), null, pVar6, kind3, j0Var2), module17));
                final int i30 = 3;
                e23.p pVar7 = new e23.p() { // from class: fy0.b
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        Scope scope = (Scope) obj2;
                        ParametersHolder parametersHolder = (ParametersHolder) obj3;
                        switch (i30) {
                            case 0:
                                d dVar3 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new v0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                d dVar4 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new d0(ModuleExtKt.androidContext(scope), (by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 2:
                                d dVar5 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new q0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                d dVar6 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new y((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                d dVar7 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (f) ez0.b.a(ez0.b.f67468a, ez0.c.GC, f.class, new h.a[0], null, null, null, 120);
                            case 5:
                                d dVar8 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new h1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                d dVar9 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new gy0.g0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 7:
                                d dVar10 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new by0.a();
                            case 8:
                                d dVar11 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new b0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                d dVar12 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new j1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                d dVar13 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new x0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                d dVar14 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new t0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 12:
                                d dVar15 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new c1((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 13:
                                d dVar16 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new c2((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 14:
                                d dVar17 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new n1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                d dVar18 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (dy0.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, dy0.a.class, new h.a[0], null, null, null, 120);
                            case 16:
                                d dVar19 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new a1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 17:
                                d dVar110 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new o1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 18:
                                d dVar20 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new d1();
                            case 19:
                                d dVar21 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new gy0.k0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 20:
                                d dVar22 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new o0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 21:
                                d dVar23 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new r((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                d dVar24 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new i0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                d dVar25 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new s1((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 24:
                                d dVar26 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new a2(ModuleExtKt.androidContext(scope), (g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                d dVar27 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new g((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                d dVar28 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (dy0.e) ez0.b.a(ez0.b.f67468a, ez0.c.GC, dy0.e.class, new h.a[0], null, null, null, 120);
                            case 27:
                                d dVar29 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new q1((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                d dVar30 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new t((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                d dVar31 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new r0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                        }
                    }
                };
                Module module18 = scopeDSL.getModule();
                new KoinDefinition(module18, e5.n(new BeanDefinition(scopeDSL.getScopeQualifier(), t0Var2.b(gy0.y.class), null, pVar7, kind3, j0Var2), module18));
                final int i34 = 5;
                e23.p pVar8 = new e23.p() { // from class: fy0.b
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        Scope scope = (Scope) obj2;
                        ParametersHolder parametersHolder = (ParametersHolder) obj3;
                        switch (i34) {
                            case 0:
                                d dVar3 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new v0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                d dVar4 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new d0(ModuleExtKt.androidContext(scope), (by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 2:
                                d dVar5 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new q0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                d dVar6 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new y((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                d dVar7 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (f) ez0.b.a(ez0.b.f67468a, ez0.c.GC, f.class, new h.a[0], null, null, null, 120);
                            case 5:
                                d dVar8 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new h1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                d dVar9 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new gy0.g0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 7:
                                d dVar10 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new by0.a();
                            case 8:
                                d dVar11 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new b0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                d dVar12 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new j1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                d dVar13 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new x0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                d dVar14 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new t0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 12:
                                d dVar15 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new c1((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 13:
                                d dVar16 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new c2((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 14:
                                d dVar17 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new n1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                d dVar18 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (dy0.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, dy0.a.class, new h.a[0], null, null, null, 120);
                            case 16:
                                d dVar19 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new a1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 17:
                                d dVar110 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new o1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 18:
                                d dVar20 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new d1();
                            case 19:
                                d dVar21 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new gy0.k0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 20:
                                d dVar22 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new o0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 21:
                                d dVar23 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new r((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                d dVar24 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new i0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                d dVar25 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new s1((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 24:
                                d dVar26 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new a2(ModuleExtKt.androidContext(scope), (g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                d dVar27 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new g((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                d dVar28 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (dy0.e) ez0.b.a(ez0.b.f67468a, ez0.c.GC, dy0.e.class, new h.a[0], null, null, null, 120);
                            case 27:
                                d dVar29 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new q1((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                d dVar30 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new t((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                d dVar31 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new r0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                        }
                    }
                };
                Module module19 = scopeDSL.getModule();
                new KoinDefinition(module19, e5.n(new BeanDefinition(scopeDSL.getScopeQualifier(), t0Var2.b(h1.class), null, pVar8, kind3, j0Var2), module19));
                final int i35 = 6;
                e23.p pVar9 = new e23.p() { // from class: fy0.b
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        Scope scope = (Scope) obj2;
                        ParametersHolder parametersHolder = (ParametersHolder) obj3;
                        switch (i35) {
                            case 0:
                                d dVar3 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new v0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                d dVar4 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new d0(ModuleExtKt.androidContext(scope), (by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 2:
                                d dVar5 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new q0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                d dVar6 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new y((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                d dVar7 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (f) ez0.b.a(ez0.b.f67468a, ez0.c.GC, f.class, new h.a[0], null, null, null, 120);
                            case 5:
                                d dVar8 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new h1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                d dVar9 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new gy0.g0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 7:
                                d dVar10 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new by0.a();
                            case 8:
                                d dVar11 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new b0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                d dVar12 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new j1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                d dVar13 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new x0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                d dVar14 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new t0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 12:
                                d dVar15 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new c1((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 13:
                                d dVar16 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new c2((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 14:
                                d dVar17 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new n1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                d dVar18 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (dy0.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, dy0.a.class, new h.a[0], null, null, null, 120);
                            case 16:
                                d dVar19 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new a1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 17:
                                d dVar110 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new o1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 18:
                                d dVar20 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new d1();
                            case 19:
                                d dVar21 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new gy0.k0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 20:
                                d dVar22 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new o0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 21:
                                d dVar23 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new r((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                d dVar24 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new i0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                d dVar25 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new s1((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 24:
                                d dVar26 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new a2(ModuleExtKt.androidContext(scope), (g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                d dVar27 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new g((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                d dVar28 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (dy0.e) ez0.b.a(ez0.b.f67468a, ez0.c.GC, dy0.e.class, new h.a[0], null, null, null, 120);
                            case 27:
                                d dVar29 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new q1((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                d dVar30 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new t((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                d dVar31 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new r0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                        }
                    }
                };
                Module module20 = scopeDSL.getModule();
                new KoinDefinition(module20, e5.n(new BeanDefinition(scopeDSL.getScopeQualifier(), t0Var2.b(gy0.g0.class), null, pVar9, kind3, j0Var2), module20));
                final int i36 = 8;
                e23.p pVar10 = new e23.p() { // from class: fy0.b
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        Scope scope = (Scope) obj2;
                        ParametersHolder parametersHolder = (ParametersHolder) obj3;
                        switch (i36) {
                            case 0:
                                d dVar3 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new v0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                d dVar4 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new d0(ModuleExtKt.androidContext(scope), (by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 2:
                                d dVar5 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new q0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                d dVar6 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new y((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                d dVar7 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (f) ez0.b.a(ez0.b.f67468a, ez0.c.GC, f.class, new h.a[0], null, null, null, 120);
                            case 5:
                                d dVar8 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new h1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                d dVar9 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new gy0.g0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 7:
                                d dVar10 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new by0.a();
                            case 8:
                                d dVar11 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new b0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                d dVar12 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new j1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                d dVar13 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new x0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                d dVar14 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new t0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 12:
                                d dVar15 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new c1((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 13:
                                d dVar16 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new c2((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 14:
                                d dVar17 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new n1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                d dVar18 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (dy0.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, dy0.a.class, new h.a[0], null, null, null, 120);
                            case 16:
                                d dVar19 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new a1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 17:
                                d dVar110 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new o1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 18:
                                d dVar20 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new d1();
                            case 19:
                                d dVar21 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new gy0.k0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 20:
                                d dVar22 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new o0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 21:
                                d dVar23 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new r((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                d dVar24 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new i0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                d dVar25 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new s1((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 24:
                                d dVar26 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new a2(ModuleExtKt.androidContext(scope), (g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                d dVar27 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new g((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                d dVar28 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (dy0.e) ez0.b.a(ez0.b.f67468a, ez0.c.GC, dy0.e.class, new h.a[0], null, null, null, 120);
                            case 27:
                                d dVar29 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new q1((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                d dVar30 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new t((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                d dVar31 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new r0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                        }
                    }
                };
                Module module21 = scopeDSL.getModule();
                new KoinDefinition(module21, e5.n(new BeanDefinition(scopeDSL.getScopeQualifier(), t0Var2.b(gy0.b0.class), null, pVar10, kind3, j0Var2), module21));
                final int i37 = 9;
                e23.p pVar11 = new e23.p() { // from class: fy0.b
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        Scope scope = (Scope) obj2;
                        ParametersHolder parametersHolder = (ParametersHolder) obj3;
                        switch (i37) {
                            case 0:
                                d dVar3 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new v0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                d dVar4 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new d0(ModuleExtKt.androidContext(scope), (by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 2:
                                d dVar5 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new q0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                d dVar6 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new y((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                d dVar7 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (f) ez0.b.a(ez0.b.f67468a, ez0.c.GC, f.class, new h.a[0], null, null, null, 120);
                            case 5:
                                d dVar8 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new h1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                d dVar9 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new gy0.g0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 7:
                                d dVar10 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new by0.a();
                            case 8:
                                d dVar11 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new b0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                d dVar12 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new j1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                d dVar13 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new x0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                d dVar14 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new t0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 12:
                                d dVar15 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new c1((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 13:
                                d dVar16 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new c2((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 14:
                                d dVar17 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new n1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                d dVar18 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (dy0.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, dy0.a.class, new h.a[0], null, null, null, 120);
                            case 16:
                                d dVar19 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new a1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 17:
                                d dVar110 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new o1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 18:
                                d dVar20 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new d1();
                            case 19:
                                d dVar21 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new gy0.k0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 20:
                                d dVar22 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new o0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 21:
                                d dVar23 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new r((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                d dVar24 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new i0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                d dVar25 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new s1((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 24:
                                d dVar26 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new a2(ModuleExtKt.androidContext(scope), (g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                d dVar27 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new g((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                d dVar28 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (dy0.e) ez0.b.a(ez0.b.f67468a, ez0.c.GC, dy0.e.class, new h.a[0], null, null, null, 120);
                            case 27:
                                d dVar29 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new q1((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                d dVar30 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new t((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                d dVar31 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new r0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                        }
                    }
                };
                Module module22 = scopeDSL.getModule();
                new KoinDefinition(module22, e5.n(new BeanDefinition(scopeDSL.getScopeQualifier(), t0Var2.b(j1.class), null, pVar11, kind3, j0Var2), module22));
                final int i38 = 10;
                e23.p pVar12 = new e23.p() { // from class: fy0.b
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        Scope scope = (Scope) obj2;
                        ParametersHolder parametersHolder = (ParametersHolder) obj3;
                        switch (i38) {
                            case 0:
                                d dVar3 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new v0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                d dVar4 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new d0(ModuleExtKt.androidContext(scope), (by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 2:
                                d dVar5 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new q0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                d dVar6 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new y((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                d dVar7 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (f) ez0.b.a(ez0.b.f67468a, ez0.c.GC, f.class, new h.a[0], null, null, null, 120);
                            case 5:
                                d dVar8 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new h1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                d dVar9 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new gy0.g0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 7:
                                d dVar10 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new by0.a();
                            case 8:
                                d dVar11 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new b0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                d dVar12 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new j1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                d dVar13 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new x0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                d dVar14 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new t0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 12:
                                d dVar15 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new c1((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 13:
                                d dVar16 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new c2((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 14:
                                d dVar17 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new n1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                d dVar18 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (dy0.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, dy0.a.class, new h.a[0], null, null, null, 120);
                            case 16:
                                d dVar19 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new a1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 17:
                                d dVar110 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new o1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 18:
                                d dVar20 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new d1();
                            case 19:
                                d dVar21 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new gy0.k0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 20:
                                d dVar22 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new o0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 21:
                                d dVar23 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new r((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                d dVar24 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new i0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                d dVar25 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new s1((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 24:
                                d dVar26 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new a2(ModuleExtKt.androidContext(scope), (g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                d dVar27 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new g((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                d dVar28 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (dy0.e) ez0.b.a(ez0.b.f67468a, ez0.c.GC, dy0.e.class, new h.a[0], null, null, null, 120);
                            case 27:
                                d dVar29 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new q1((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                d dVar30 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new t((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                d dVar31 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new r0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                        }
                    }
                };
                Module module23 = scopeDSL.getModule();
                new KoinDefinition(module23, e5.n(new BeanDefinition(scopeDSL.getScopeQualifier(), t0Var2.b(x0.class), null, pVar12, kind3, j0Var2), module23));
                final int i39 = 11;
                e23.p pVar13 = new e23.p() { // from class: fy0.b
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        Scope scope = (Scope) obj2;
                        ParametersHolder parametersHolder = (ParametersHolder) obj3;
                        switch (i39) {
                            case 0:
                                d dVar3 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new v0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                d dVar4 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new d0(ModuleExtKt.androidContext(scope), (by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 2:
                                d dVar5 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new q0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                d dVar6 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new y((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                d dVar7 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (f) ez0.b.a(ez0.b.f67468a, ez0.c.GC, f.class, new h.a[0], null, null, null, 120);
                            case 5:
                                d dVar8 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new h1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                d dVar9 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new gy0.g0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 7:
                                d dVar10 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new by0.a();
                            case 8:
                                d dVar11 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new b0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                d dVar12 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new j1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                d dVar13 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new x0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                d dVar14 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new t0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 12:
                                d dVar15 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new c1((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 13:
                                d dVar16 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new c2((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 14:
                                d dVar17 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new n1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                d dVar18 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (dy0.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, dy0.a.class, new h.a[0], null, null, null, 120);
                            case 16:
                                d dVar19 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new a1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 17:
                                d dVar110 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new o1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 18:
                                d dVar20 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new d1();
                            case 19:
                                d dVar21 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new gy0.k0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 20:
                                d dVar22 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new o0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 21:
                                d dVar23 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new r((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                d dVar24 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new i0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                d dVar25 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new s1((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 24:
                                d dVar26 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new a2(ModuleExtKt.androidContext(scope), (g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                d dVar27 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new g((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                d dVar28 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (dy0.e) ez0.b.a(ez0.b.f67468a, ez0.c.GC, dy0.e.class, new h.a[0], null, null, null, 120);
                            case 27:
                                d dVar29 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new q1((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                d dVar30 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new t((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                d dVar31 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new r0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                        }
                    }
                };
                Module module24 = scopeDSL.getModule();
                new KoinDefinition(module24, e5.n(new BeanDefinition(scopeDSL.getScopeQualifier(), t0Var2.b(t0.class), null, pVar13, kind3, j0Var2), module24));
                final int i44 = 12;
                e23.p pVar14 = new e23.p() { // from class: fy0.b
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        Scope scope = (Scope) obj2;
                        ParametersHolder parametersHolder = (ParametersHolder) obj3;
                        switch (i44) {
                            case 0:
                                d dVar3 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new v0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                d dVar4 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new d0(ModuleExtKt.androidContext(scope), (by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 2:
                                d dVar5 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new q0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                d dVar6 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new y((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                d dVar7 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (f) ez0.b.a(ez0.b.f67468a, ez0.c.GC, f.class, new h.a[0], null, null, null, 120);
                            case 5:
                                d dVar8 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new h1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                d dVar9 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new gy0.g0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 7:
                                d dVar10 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new by0.a();
                            case 8:
                                d dVar11 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new b0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                d dVar12 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new j1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                d dVar13 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new x0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                d dVar14 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new t0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 12:
                                d dVar15 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new c1((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 13:
                                d dVar16 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new c2((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 14:
                                d dVar17 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new n1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                d dVar18 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (dy0.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, dy0.a.class, new h.a[0], null, null, null, 120);
                            case 16:
                                d dVar19 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new a1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 17:
                                d dVar110 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new o1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 18:
                                d dVar20 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new d1();
                            case 19:
                                d dVar21 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new gy0.k0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 20:
                                d dVar22 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new o0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 21:
                                d dVar23 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new r((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                d dVar24 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new i0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                d dVar25 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new s1((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 24:
                                d dVar26 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new a2(ModuleExtKt.androidContext(scope), (g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                d dVar27 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new g((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                d dVar28 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (dy0.e) ez0.b.a(ez0.b.f67468a, ez0.c.GC, dy0.e.class, new h.a[0], null, null, null, 120);
                            case 27:
                                d dVar29 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new q1((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                d dVar30 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new t((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                d dVar31 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new r0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                        }
                    }
                };
                Module module25 = scopeDSL.getModule();
                new KoinDefinition(module25, e5.n(new BeanDefinition(scopeDSL.getScopeQualifier(), t0Var2.b(c1.class), null, pVar14, kind3, j0Var2), module25));
                final int i45 = 13;
                e23.p pVar15 = new e23.p() { // from class: fy0.b
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        Scope scope = (Scope) obj2;
                        ParametersHolder parametersHolder = (ParametersHolder) obj3;
                        switch (i45) {
                            case 0:
                                d dVar3 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new v0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                d dVar4 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new d0(ModuleExtKt.androidContext(scope), (by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 2:
                                d dVar5 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new q0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                d dVar6 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new y((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                d dVar7 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (f) ez0.b.a(ez0.b.f67468a, ez0.c.GC, f.class, new h.a[0], null, null, null, 120);
                            case 5:
                                d dVar8 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new h1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                d dVar9 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new gy0.g0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 7:
                                d dVar10 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new by0.a();
                            case 8:
                                d dVar11 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new b0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                d dVar12 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new j1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                d dVar13 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new x0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                d dVar14 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new t0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 12:
                                d dVar15 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new c1((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 13:
                                d dVar16 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new c2((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 14:
                                d dVar17 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new n1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                d dVar18 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (dy0.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, dy0.a.class, new h.a[0], null, null, null, 120);
                            case 16:
                                d dVar19 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new a1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 17:
                                d dVar110 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new o1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 18:
                                d dVar20 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new d1();
                            case 19:
                                d dVar21 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new gy0.k0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 20:
                                d dVar22 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new o0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 21:
                                d dVar23 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new r((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                d dVar24 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new i0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                d dVar25 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new s1((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 24:
                                d dVar26 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new a2(ModuleExtKt.androidContext(scope), (g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                d dVar27 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new g((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                d dVar28 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (dy0.e) ez0.b.a(ez0.b.f67468a, ez0.c.GC, dy0.e.class, new h.a[0], null, null, null, 120);
                            case 27:
                                d dVar29 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new q1((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                d dVar30 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new t((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                d dVar31 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new r0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                        }
                    }
                };
                Module module26 = scopeDSL.getModule();
                new KoinDefinition(module26, e5.n(new BeanDefinition(scopeDSL.getScopeQualifier(), t0Var2.b(c2.class), null, pVar15, kind3, j0Var2), module26));
                e23.p pVar16 = new e23.p() { // from class: fy0.b
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        Scope scope = (Scope) obj2;
                        ParametersHolder parametersHolder = (ParametersHolder) obj3;
                        switch (i15) {
                            case 0:
                                d dVar3 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new v0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                d dVar4 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new d0(ModuleExtKt.androidContext(scope), (by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 2:
                                d dVar5 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new q0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                d dVar6 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new y((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                d dVar7 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (f) ez0.b.a(ez0.b.f67468a, ez0.c.GC, f.class, new h.a[0], null, null, null, 120);
                            case 5:
                                d dVar8 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new h1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                d dVar9 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new gy0.g0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 7:
                                d dVar10 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new by0.a();
                            case 8:
                                d dVar11 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new b0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                d dVar12 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new j1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                d dVar13 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new x0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                d dVar14 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new t0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 12:
                                d dVar15 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new c1((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 13:
                                d dVar16 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new c2((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 14:
                                d dVar17 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new n1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                d dVar18 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (dy0.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, dy0.a.class, new h.a[0], null, null, null, 120);
                            case 16:
                                d dVar19 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new a1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 17:
                                d dVar110 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new o1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 18:
                                d dVar20 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new d1();
                            case 19:
                                d dVar21 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new gy0.k0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 20:
                                d dVar22 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new o0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 21:
                                d dVar23 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new r((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                d dVar24 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new i0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                d dVar25 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new s1((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 24:
                                d dVar26 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new a2(ModuleExtKt.androidContext(scope), (g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                d dVar27 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new g((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                d dVar28 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (dy0.e) ez0.b.a(ez0.b.f67468a, ez0.c.GC, dy0.e.class, new h.a[0], null, null, null, 120);
                            case 27:
                                d dVar29 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new q1((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                d dVar30 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new t((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                d dVar31 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new r0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                        }
                    }
                };
                Module module27 = scopeDSL.getModule();
                new KoinDefinition(module27, e5.n(new BeanDefinition(scopeDSL.getScopeQualifier(), t0Var2.b(n1.class), null, pVar16, kind3, j0Var2), module27));
                e23.p pVar17 = new e23.p() { // from class: fy0.b
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        Scope scope = (Scope) obj2;
                        ParametersHolder parametersHolder = (ParametersHolder) obj3;
                        switch (i14) {
                            case 0:
                                d dVar3 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new v0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                d dVar4 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new d0(ModuleExtKt.androidContext(scope), (by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 2:
                                d dVar5 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new q0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                d dVar6 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new y((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                d dVar7 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (f) ez0.b.a(ez0.b.f67468a, ez0.c.GC, f.class, new h.a[0], null, null, null, 120);
                            case 5:
                                d dVar8 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new h1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                d dVar9 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new gy0.g0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 7:
                                d dVar10 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new by0.a();
                            case 8:
                                d dVar11 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new b0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                d dVar12 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new j1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                d dVar13 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new x0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                d dVar14 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new t0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 12:
                                d dVar15 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new c1((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 13:
                                d dVar16 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new c2((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 14:
                                d dVar17 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new n1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                d dVar18 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (dy0.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, dy0.a.class, new h.a[0], null, null, null, 120);
                            case 16:
                                d dVar19 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new a1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 17:
                                d dVar110 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new o1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 18:
                                d dVar20 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new d1();
                            case 19:
                                d dVar21 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new gy0.k0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 20:
                                d dVar22 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new o0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 21:
                                d dVar23 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new r((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                d dVar24 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new i0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                d dVar25 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new s1((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 24:
                                d dVar26 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new a2(ModuleExtKt.androidContext(scope), (g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                d dVar27 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new g((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                d dVar28 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (dy0.e) ez0.b.a(ez0.b.f67468a, ez0.c.GC, dy0.e.class, new h.a[0], null, null, null, 120);
                            case 27:
                                d dVar29 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new q1((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                d dVar30 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new t((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                d dVar31 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new r0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                        }
                    }
                };
                Module module28 = scopeDSL.getModule();
                new KoinDefinition(module28, e5.n(new BeanDefinition(scopeDSL.getScopeQualifier(), t0Var2.b(a1.class), null, pVar17, kind3, j0Var2), module28));
                e23.p pVar18 = new e23.p() { // from class: fy0.b
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        Scope scope = (Scope) obj2;
                        ParametersHolder parametersHolder = (ParametersHolder) obj3;
                        switch (i19) {
                            case 0:
                                d dVar3 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new v0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                d dVar4 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new d0(ModuleExtKt.androidContext(scope), (by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 2:
                                d dVar5 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new q0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                d dVar6 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new y((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                d dVar7 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (f) ez0.b.a(ez0.b.f67468a, ez0.c.GC, f.class, new h.a[0], null, null, null, 120);
                            case 5:
                                d dVar8 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new h1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                d dVar9 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new gy0.g0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 7:
                                d dVar10 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new by0.a();
                            case 8:
                                d dVar11 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new b0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                d dVar12 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new j1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                d dVar13 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new x0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                d dVar14 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new t0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 12:
                                d dVar15 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new c1((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 13:
                                d dVar16 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new c2((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 14:
                                d dVar17 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new n1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                d dVar18 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (dy0.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, dy0.a.class, new h.a[0], null, null, null, 120);
                            case 16:
                                d dVar19 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new a1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 17:
                                d dVar110 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new o1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 18:
                                d dVar20 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new d1();
                            case 19:
                                d dVar21 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new gy0.k0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 20:
                                d dVar22 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new o0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 21:
                                d dVar23 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new r((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                d dVar24 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new i0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                d dVar25 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new s1((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 24:
                                d dVar26 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new a2(ModuleExtKt.androidContext(scope), (g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                d dVar27 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new g((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                d dVar28 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (dy0.e) ez0.b.a(ez0.b.f67468a, ez0.c.GC, dy0.e.class, new h.a[0], null, null, null, 120);
                            case 27:
                                d dVar29 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new q1((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                d dVar30 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new t((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                d dVar31 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new r0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                        }
                    }
                };
                Module module29 = scopeDSL.getModule();
                new KoinDefinition(module29, e5.n(new BeanDefinition(scopeDSL.getScopeQualifier(), t0Var2.b(o1.class), null, pVar18, kind3, j0Var2), module29));
                final int i46 = 18;
                e23.p pVar19 = new e23.p() { // from class: fy0.b
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        Scope scope = (Scope) obj2;
                        ParametersHolder parametersHolder = (ParametersHolder) obj3;
                        switch (i46) {
                            case 0:
                                d dVar3 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new v0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                d dVar4 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new d0(ModuleExtKt.androidContext(scope), (by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 2:
                                d dVar5 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new q0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                d dVar6 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new y((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                d dVar7 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (f) ez0.b.a(ez0.b.f67468a, ez0.c.GC, f.class, new h.a[0], null, null, null, 120);
                            case 5:
                                d dVar8 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new h1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                d dVar9 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new gy0.g0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 7:
                                d dVar10 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new by0.a();
                            case 8:
                                d dVar11 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new b0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                d dVar12 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new j1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                d dVar13 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new x0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                d dVar14 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new t0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 12:
                                d dVar15 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new c1((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 13:
                                d dVar16 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new c2((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 14:
                                d dVar17 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new n1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                d dVar18 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (dy0.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, dy0.a.class, new h.a[0], null, null, null, 120);
                            case 16:
                                d dVar19 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new a1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 17:
                                d dVar110 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new o1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 18:
                                d dVar20 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new d1();
                            case 19:
                                d dVar21 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new gy0.k0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 20:
                                d dVar22 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new o0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 21:
                                d dVar23 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new r((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                d dVar24 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new i0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                d dVar25 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new s1((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 24:
                                d dVar26 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new a2(ModuleExtKt.androidContext(scope), (g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                d dVar27 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new g((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                d dVar28 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (dy0.e) ez0.b.a(ez0.b.f67468a, ez0.c.GC, dy0.e.class, new h.a[0], null, null, null, 120);
                            case 27:
                                d dVar29 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new q1((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                d dVar30 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new t((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                d dVar31 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new r0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                        }
                    }
                };
                Module module30 = scopeDSL.getModule();
                new KoinDefinition(module30, e5.n(new BeanDefinition(scopeDSL.getScopeQualifier(), t0Var2.b(d1.class), null, pVar19, kind3, j0Var2), module30));
                final int i47 = 20;
                e23.p pVar20 = new e23.p() { // from class: fy0.b
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        Scope scope = (Scope) obj2;
                        ParametersHolder parametersHolder = (ParametersHolder) obj3;
                        switch (i47) {
                            case 0:
                                d dVar3 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new v0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                d dVar4 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new d0(ModuleExtKt.androidContext(scope), (by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 2:
                                d dVar5 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new q0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                d dVar6 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new y((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                d dVar7 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (f) ez0.b.a(ez0.b.f67468a, ez0.c.GC, f.class, new h.a[0], null, null, null, 120);
                            case 5:
                                d dVar8 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new h1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                d dVar9 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new gy0.g0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 7:
                                d dVar10 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new by0.a();
                            case 8:
                                d dVar11 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new b0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                d dVar12 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new j1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                d dVar13 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new x0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                d dVar14 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new t0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 12:
                                d dVar15 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new c1((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 13:
                                d dVar16 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new c2((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 14:
                                d dVar17 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new n1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                d dVar18 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (dy0.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, dy0.a.class, new h.a[0], null, null, null, 120);
                            case 16:
                                d dVar19 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new a1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 17:
                                d dVar110 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new o1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 18:
                                d dVar20 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new d1();
                            case 19:
                                d dVar21 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new gy0.k0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 20:
                                d dVar22 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new o0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 21:
                                d dVar23 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new r((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                d dVar24 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new i0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                d dVar25 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new s1((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 24:
                                d dVar26 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new a2(ModuleExtKt.androidContext(scope), (g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                d dVar27 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new g((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                d dVar28 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (dy0.e) ez0.b.a(ez0.b.f67468a, ez0.c.GC, dy0.e.class, new h.a[0], null, null, null, 120);
                            case 27:
                                d dVar29 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new q1((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                d dVar30 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new t((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                d dVar31 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new r0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                        }
                    }
                };
                Module module31 = scopeDSL.getModule();
                new KoinDefinition(module31, e5.n(new BeanDefinition(scopeDSL.getScopeQualifier(), t0Var2.b(o0.class), null, pVar20, kind3, j0Var2), module31));
                final int i48 = 21;
                e23.p pVar21 = new e23.p() { // from class: fy0.b
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        Scope scope = (Scope) obj2;
                        ParametersHolder parametersHolder = (ParametersHolder) obj3;
                        switch (i48) {
                            case 0:
                                d dVar3 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new v0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                d dVar4 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new d0(ModuleExtKt.androidContext(scope), (by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 2:
                                d dVar5 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new q0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                d dVar6 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new y((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                d dVar7 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (f) ez0.b.a(ez0.b.f67468a, ez0.c.GC, f.class, new h.a[0], null, null, null, 120);
                            case 5:
                                d dVar8 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new h1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                d dVar9 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new gy0.g0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 7:
                                d dVar10 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new by0.a();
                            case 8:
                                d dVar11 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new b0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                d dVar12 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new j1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                d dVar13 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new x0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                d dVar14 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new t0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 12:
                                d dVar15 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new c1((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 13:
                                d dVar16 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new c2((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 14:
                                d dVar17 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new n1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                d dVar18 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (dy0.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, dy0.a.class, new h.a[0], null, null, null, 120);
                            case 16:
                                d dVar19 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new a1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 17:
                                d dVar110 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new o1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 18:
                                d dVar20 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new d1();
                            case 19:
                                d dVar21 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new gy0.k0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 20:
                                d dVar22 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new o0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 21:
                                d dVar23 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new r((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                d dVar24 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new i0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                d dVar25 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new s1((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 24:
                                d dVar26 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new a2(ModuleExtKt.androidContext(scope), (g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                d dVar27 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new g((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                d dVar28 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (dy0.e) ez0.b.a(ez0.b.f67468a, ez0.c.GC, dy0.e.class, new h.a[0], null, null, null, 120);
                            case 27:
                                d dVar29 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new q1((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                d dVar30 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new t((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                d dVar31 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new r0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                        }
                    }
                };
                Module module32 = scopeDSL.getModule();
                new KoinDefinition(module32, e5.n(new BeanDefinition(scopeDSL.getScopeQualifier(), t0Var2.b(gy0.r.class), null, pVar21, kind3, j0Var2), module32));
                e23.p pVar22 = new e23.p() { // from class: fy0.b
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        Scope scope = (Scope) obj2;
                        ParametersHolder parametersHolder = (ParametersHolder) obj3;
                        switch (i18) {
                            case 0:
                                d dVar3 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new v0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                d dVar4 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new d0(ModuleExtKt.androidContext(scope), (by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 2:
                                d dVar5 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new q0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                d dVar6 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new y((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                d dVar7 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (f) ez0.b.a(ez0.b.f67468a, ez0.c.GC, f.class, new h.a[0], null, null, null, 120);
                            case 5:
                                d dVar8 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new h1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                d dVar9 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new gy0.g0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 7:
                                d dVar10 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new by0.a();
                            case 8:
                                d dVar11 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new b0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                d dVar12 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new j1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                d dVar13 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new x0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                d dVar14 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new t0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 12:
                                d dVar15 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new c1((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 13:
                                d dVar16 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new c2((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 14:
                                d dVar17 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new n1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                d dVar18 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (dy0.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, dy0.a.class, new h.a[0], null, null, null, 120);
                            case 16:
                                d dVar19 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new a1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 17:
                                d dVar110 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new o1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 18:
                                d dVar20 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new d1();
                            case 19:
                                d dVar21 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new gy0.k0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 20:
                                d dVar22 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new o0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 21:
                                d dVar23 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new r((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                d dVar24 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new i0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                d dVar25 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new s1((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 24:
                                d dVar26 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new a2(ModuleExtKt.androidContext(scope), (g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                d dVar27 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new g((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                d dVar28 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (dy0.e) ez0.b.a(ez0.b.f67468a, ez0.c.GC, dy0.e.class, new h.a[0], null, null, null, 120);
                            case 27:
                                d dVar29 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new q1((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                d dVar30 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new t((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                d dVar31 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new r0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                        }
                    }
                };
                Module module33 = scopeDSL.getModule();
                new KoinDefinition(module33, e5.n(new BeanDefinition(scopeDSL.getScopeQualifier(), t0Var2.b(i0.class), null, pVar22, kind3, j0Var2), module33));
                final int i49 = 23;
                e23.p pVar23 = new e23.p() { // from class: fy0.b
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        Scope scope = (Scope) obj2;
                        ParametersHolder parametersHolder = (ParametersHolder) obj3;
                        switch (i49) {
                            case 0:
                                d dVar3 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new v0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                d dVar4 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new d0(ModuleExtKt.androidContext(scope), (by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 2:
                                d dVar5 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new q0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                d dVar6 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new y((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                d dVar7 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (f) ez0.b.a(ez0.b.f67468a, ez0.c.GC, f.class, new h.a[0], null, null, null, 120);
                            case 5:
                                d dVar8 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new h1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                d dVar9 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new gy0.g0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 7:
                                d dVar10 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new by0.a();
                            case 8:
                                d dVar11 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new b0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                d dVar12 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new j1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                d dVar13 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new x0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                d dVar14 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new t0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 12:
                                d dVar15 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new c1((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 13:
                                d dVar16 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new c2((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 14:
                                d dVar17 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new n1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                d dVar18 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (dy0.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, dy0.a.class, new h.a[0], null, null, null, 120);
                            case 16:
                                d dVar19 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new a1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 17:
                                d dVar110 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new o1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 18:
                                d dVar20 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new d1();
                            case 19:
                                d dVar21 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new gy0.k0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 20:
                                d dVar22 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new o0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 21:
                                d dVar23 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new r((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                d dVar24 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new i0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                d dVar25 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new s1((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 24:
                                d dVar26 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new a2(ModuleExtKt.androidContext(scope), (g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                d dVar27 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new g((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                d dVar28 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (dy0.e) ez0.b.a(ez0.b.f67468a, ez0.c.GC, dy0.e.class, new h.a[0], null, null, null, 120);
                            case 27:
                                d dVar29 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new q1((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                d dVar30 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new t((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                d dVar31 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new r0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                        }
                    }
                };
                Module module34 = scopeDSL.getModule();
                new KoinDefinition(module34, e5.n(new BeanDefinition(scopeDSL.getScopeQualifier(), t0Var2.b(s1.class), null, pVar23, kind3, j0Var2), module34));
                final int i54 = 24;
                e23.p pVar24 = new e23.p() { // from class: fy0.b
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        Scope scope = (Scope) obj2;
                        ParametersHolder parametersHolder = (ParametersHolder) obj3;
                        switch (i54) {
                            case 0:
                                d dVar3 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new v0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                d dVar4 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new d0(ModuleExtKt.androidContext(scope), (by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 2:
                                d dVar5 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new q0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                d dVar6 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new y((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                d dVar7 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (f) ez0.b.a(ez0.b.f67468a, ez0.c.GC, f.class, new h.a[0], null, null, null, 120);
                            case 5:
                                d dVar8 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new h1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                d dVar9 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new gy0.g0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 7:
                                d dVar10 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new by0.a();
                            case 8:
                                d dVar11 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new b0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                d dVar12 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new j1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                d dVar13 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new x0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                d dVar14 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new t0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 12:
                                d dVar15 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new c1((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 13:
                                d dVar16 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new c2((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 14:
                                d dVar17 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new n1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                d dVar18 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (dy0.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, dy0.a.class, new h.a[0], null, null, null, 120);
                            case 16:
                                d dVar19 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new a1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 17:
                                d dVar110 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new o1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 18:
                                d dVar20 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new d1();
                            case 19:
                                d dVar21 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new gy0.k0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 20:
                                d dVar22 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new o0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 21:
                                d dVar23 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new r((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                d dVar24 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new i0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                d dVar25 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new s1((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 24:
                                d dVar26 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new a2(ModuleExtKt.androidContext(scope), (g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                d dVar27 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new g((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                d dVar28 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (dy0.e) ez0.b.a(ez0.b.f67468a, ez0.c.GC, dy0.e.class, new h.a[0], null, null, null, 120);
                            case 27:
                                d dVar29 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new q1((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                d dVar30 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new t((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                d dVar31 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new r0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                        }
                    }
                };
                Module module35 = scopeDSL.getModule();
                new KoinDefinition(module35, e5.n(new BeanDefinition(scopeDSL.getScopeQualifier(), t0Var2.b(a2.class), null, pVar24, kind3, j0Var2), module35));
                final int i55 = 25;
                e23.p pVar25 = new e23.p() { // from class: fy0.b
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        Scope scope = (Scope) obj2;
                        ParametersHolder parametersHolder = (ParametersHolder) obj3;
                        switch (i55) {
                            case 0:
                                d dVar3 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new v0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                d dVar4 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new d0(ModuleExtKt.androidContext(scope), (by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 2:
                                d dVar5 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new q0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                d dVar6 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new y((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                d dVar7 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (f) ez0.b.a(ez0.b.f67468a, ez0.c.GC, f.class, new h.a[0], null, null, null, 120);
                            case 5:
                                d dVar8 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new h1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                d dVar9 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new gy0.g0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 7:
                                d dVar10 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new by0.a();
                            case 8:
                                d dVar11 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new b0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                d dVar12 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new j1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                d dVar13 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new x0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                d dVar14 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new t0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 12:
                                d dVar15 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new c1((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 13:
                                d dVar16 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new c2((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 14:
                                d dVar17 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new n1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                d dVar18 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (dy0.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, dy0.a.class, new h.a[0], null, null, null, 120);
                            case 16:
                                d dVar19 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new a1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 17:
                                d dVar110 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new o1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 18:
                                d dVar20 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new d1();
                            case 19:
                                d dVar21 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new gy0.k0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 20:
                                d dVar22 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new o0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 21:
                                d dVar23 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new r((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                d dVar24 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new i0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                d dVar25 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new s1((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 24:
                                d dVar26 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new a2(ModuleExtKt.androidContext(scope), (g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                d dVar27 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new g((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                d dVar28 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (dy0.e) ez0.b.a(ez0.b.f67468a, ez0.c.GC, dy0.e.class, new h.a[0], null, null, null, 120);
                            case 27:
                                d dVar29 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new q1((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                d dVar30 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new t((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                d dVar31 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new r0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                        }
                    }
                };
                Module module36 = scopeDSL.getModule();
                new KoinDefinition(module36, e5.n(new BeanDefinition(scopeDSL.getScopeQualifier(), t0Var2.b(gy0.g.class), null, pVar25, kind3, j0Var2), module36));
                final int i56 = 27;
                e23.p pVar26 = new e23.p() { // from class: fy0.b
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        Scope scope = (Scope) obj2;
                        ParametersHolder parametersHolder = (ParametersHolder) obj3;
                        switch (i56) {
                            case 0:
                                d dVar3 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new v0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                d dVar4 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new d0(ModuleExtKt.androidContext(scope), (by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 2:
                                d dVar5 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new q0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                d dVar6 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new y((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                d dVar7 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (f) ez0.b.a(ez0.b.f67468a, ez0.c.GC, f.class, new h.a[0], null, null, null, 120);
                            case 5:
                                d dVar8 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new h1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                d dVar9 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new gy0.g0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 7:
                                d dVar10 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new by0.a();
                            case 8:
                                d dVar11 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new b0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                d dVar12 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new j1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                d dVar13 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new x0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                d dVar14 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new t0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 12:
                                d dVar15 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new c1((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 13:
                                d dVar16 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new c2((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 14:
                                d dVar17 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new n1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                d dVar18 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (dy0.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, dy0.a.class, new h.a[0], null, null, null, 120);
                            case 16:
                                d dVar19 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new a1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 17:
                                d dVar110 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new o1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 18:
                                d dVar20 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new d1();
                            case 19:
                                d dVar21 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new gy0.k0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 20:
                                d dVar22 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new o0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 21:
                                d dVar23 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new r((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                d dVar24 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new i0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                d dVar25 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new s1((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 24:
                                d dVar26 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new a2(ModuleExtKt.androidContext(scope), (g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                d dVar27 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new g((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                d dVar28 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (dy0.e) ez0.b.a(ez0.b.f67468a, ez0.c.GC, dy0.e.class, new h.a[0], null, null, null, 120);
                            case 27:
                                d dVar29 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new q1((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                d dVar30 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new t((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                d dVar31 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new r0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                        }
                    }
                };
                Module module37 = scopeDSL.getModule();
                new KoinDefinition(module37, e5.n(new BeanDefinition(scopeDSL.getScopeQualifier(), t0Var2.b(q1.class), null, pVar26, kind3, j0Var2), module37));
                final int i57 = 28;
                e23.p pVar27 = new e23.p() { // from class: fy0.b
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        Scope scope = (Scope) obj2;
                        ParametersHolder parametersHolder = (ParametersHolder) obj3;
                        switch (i57) {
                            case 0:
                                d dVar3 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new v0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                d dVar4 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new d0(ModuleExtKt.androidContext(scope), (by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 2:
                                d dVar5 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new q0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                d dVar6 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new y((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                d dVar7 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (f) ez0.b.a(ez0.b.f67468a, ez0.c.GC, f.class, new h.a[0], null, null, null, 120);
                            case 5:
                                d dVar8 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new h1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                d dVar9 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new gy0.g0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 7:
                                d dVar10 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new by0.a();
                            case 8:
                                d dVar11 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new b0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                d dVar12 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new j1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                d dVar13 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new x0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                d dVar14 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new t0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 12:
                                d dVar15 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new c1((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 13:
                                d dVar16 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new c2((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 14:
                                d dVar17 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new n1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                d dVar18 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (dy0.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, dy0.a.class, new h.a[0], null, null, null, 120);
                            case 16:
                                d dVar19 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new a1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 17:
                                d dVar110 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new o1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 18:
                                d dVar20 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new d1();
                            case 19:
                                d dVar21 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new gy0.k0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 20:
                                d dVar22 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new o0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 21:
                                d dVar23 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new r((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                d dVar24 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new i0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                d dVar25 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new s1((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 24:
                                d dVar26 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new a2(ModuleExtKt.androidContext(scope), (g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                d dVar27 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new g((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                d dVar28 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (dy0.e) ez0.b.a(ez0.b.f67468a, ez0.c.GC, dy0.e.class, new h.a[0], null, null, null, 120);
                            case 27:
                                d dVar29 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new q1((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                d dVar30 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new t((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                d dVar31 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new r0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                        }
                    }
                };
                Module module38 = scopeDSL.getModule();
                new KoinDefinition(module38, e5.n(new BeanDefinition(scopeDSL.getScopeQualifier(), t0Var2.b(gy0.t.class), null, pVar27, kind3, j0Var2), module38));
                final int i58 = 29;
                e23.p pVar28 = new e23.p() { // from class: fy0.b
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        Scope scope = (Scope) obj2;
                        ParametersHolder parametersHolder = (ParametersHolder) obj3;
                        switch (i58) {
                            case 0:
                                d dVar3 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new v0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                d dVar4 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new d0(ModuleExtKt.androidContext(scope), (by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 2:
                                d dVar5 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new q0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                d dVar6 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new y((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                d dVar7 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (f) ez0.b.a(ez0.b.f67468a, ez0.c.GC, f.class, new h.a[0], null, null, null, 120);
                            case 5:
                                d dVar8 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new h1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                d dVar9 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new gy0.g0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 7:
                                d dVar10 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new by0.a();
                            case 8:
                                d dVar11 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new b0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                d dVar12 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new j1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 10:
                                d dVar13 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new x0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                d dVar14 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new t0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 12:
                                d dVar15 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new c1((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 13:
                                d dVar16 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new c2((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 14:
                                d dVar17 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new n1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                d dVar18 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (dy0.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, dy0.a.class, new h.a[0], null, null, null, 120);
                            case 16:
                                d dVar19 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new a1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 17:
                                d dVar110 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new o1((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 18:
                                d dVar20 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new d1();
                            case 19:
                                d dVar21 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new gy0.k0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 20:
                                d dVar22 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new o0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 21:
                                d dVar23 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new r((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                d dVar24 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new i0((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                d dVar25 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new s1((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 24:
                                d dVar26 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new a2(ModuleExtKt.androidContext(scope), (g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                d dVar27 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new g((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                d dVar28 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (dy0.e) ez0.b.a(ez0.b.f67468a, ez0.c.GC, dy0.e.class, new h.a[0], null, null, null, 120);
                            case 27:
                                d dVar29 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new q1((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 28:
                                d dVar30 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new t((g0) scope.get((k23.d<?>) s0.f105811a.b(g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            default:
                                d dVar31 = d.f73881a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new r0((by0.a) scope.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                        }
                    }
                };
                Module module39 = scopeDSL.getModule();
                new KoinDefinition(module39, e5.n(new BeanDefinition(scopeDSL.getScopeQualifier(), t0Var2.b(r0.class), null, pVar28, kind3, j0Var2), module39));
                fy0.c cVar8 = new fy0.c(0);
                Module module40 = scopeDSL.getModule();
                new KoinDefinition(module40, e5.n(new BeanDefinition(scopeDSL.getScopeQualifier(), t0Var2.b(k1.class), null, cVar8, kind3, j0Var2), module40));
                fy0.c cVar9 = new fy0.c(2);
                Module module41 = scopeDSL.getModule();
                new KoinDefinition(module41, e5.n(new BeanDefinition(scopeDSL.getScopeQualifier(), t0Var2.b(gy0.n.class), null, cVar9, kind3, j0Var2), module41));
                fy0.c cVar10 = new fy0.c(3);
                Module module42 = scopeDSL.getModule();
                new KoinDefinition(module42, e5.n(new BeanDefinition(scopeDSL.getScopeQualifier(), t0Var2.b(jy0.l.class), null, cVar10, kind3, j0Var2), module42));
                fy0.c cVar11 = new fy0.c(4);
                Module module43 = scopeDSL.getModule();
                new KoinDefinition(module43, e5.n(new BeanDefinition(scopeDSL.getScopeQualifier(), t0Var2.b(ry0.j.class), null, cVar11, kind3, j0Var2), module43));
                fy0.c cVar12 = new fy0.c(5);
                Module module44 = scopeDSL.getModule();
                new KoinDefinition(module44, e5.n(new BeanDefinition(scopeDSL.getScopeQualifier(), t0Var2.b(w0.class), null, cVar12, kind3, j0Var2), module44));
                fy0.c cVar13 = new fy0.c(6);
                Module module45 = scopeDSL.getModule();
                new KoinDefinition(module45, e5.n(new BeanDefinition(scopeDSL.getScopeQualifier(), t0Var2.b(ly0.o.class), null, cVar13, kind3, j0Var2), module45));
                return Unit.INSTANCE;
            case 18:
                x5.l0 l0Var = (x5.l0) obj;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.b.a aVar4 = com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.b.f45995d;
                l0Var.getClass();
                return l0Var;
            case 19:
                ((q4.f) obj).getClass();
                return Unit.INSTANCE;
            case 20:
                g02.k kVar = g02.k.f74439a;
                ((String) obj).getClass();
                return Unit.INSTANCE;
            case 21:
                g02.k kVar2 = g02.k.f74439a;
                ((String) obj).getClass();
                return Unit.INSTANCE;
            case 22:
                ((k0) obj).getClass();
                return Unit.INSTANCE;
            case 23:
                h4.r rVar = (h4.r) obj;
                rVar.getClass();
                return p5.v.b(rVar, new x(i18));
            case 24:
                ((k0) obj).getClass();
                return Unit.INSTANCE;
            case 25:
                ((k0) obj).getClass();
                return Unit.INSTANCE;
            case 26:
                ((k0) obj).getClass();
                return Unit.INSTANCE;
            case 27:
                ((k0) obj).getClass();
                return Unit.INSTANCE;
            case 28:
                ((k0) obj).getClass();
                return Unit.INSTANCE;
            default:
                ((k0) obj).getClass();
                return Unit.INSTANCE;
        }
    }
}
