package t21;

import com.garmin.android.apps.connectmobile.workouts.presentation.benchmark.viewbinder.BenchmarkExerciseOneRepMaxView;
import i3.e5;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Kind;
import org.koin.core.definition.KoinDefinition;
import org.koin.core.module.Module;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.registry.ScopeRegistry;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class u implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f161964a;

    public /* synthetic */ u(int i14) {
        this.f161964a = i14;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        byte b14 = 0;
        switch (this.f161964a) {
            case 0:
                ((p5.k0) obj).getClass();
                return Unit.INSTANCE;
            case 1:
                ((s21.c) obj).getClass();
                return Unit.INSTANCE;
            case 2:
                ((s21.k) obj).getClass();
                return Unit.INSTANCE;
            case 3:
                ((b63.v) obj).getClass();
                return Unit.INSTANCE;
            case 4:
                ((b63.v) obj).getClass();
                return Unit.INSTANCE;
            case 5:
                p5.k0 k0Var = (p5.k0) obj;
                k0Var.getClass();
                p5.d dVar = new p5.d(1, 2);
                k23.l<Object>[] lVarArr = p5.h0.f136016a;
                p5.d0.f135959a.getClass();
                p5.j0<p5.d> j0Var = p5.d0.f135965g;
                k23.l<Object> lVar = p5.h0.f136016a[24];
                j0Var.getClass();
                k0Var.a(j0Var, dVar);
                return Unit.INSTANCE;
            case 6:
                x5.l0 l0Var = (x5.l0) obj;
                l0Var.getClass();
                v21.f fVar = v21.f.f175333a;
                String str = l0Var.f188878a.f157138b;
                fVar.getClass();
                return x5.l0.a(l0Var, v21.f.o(5, 2, str), 0L, 6);
            case 7:
                oi0.b bVar = (oi0.b) obj;
                bVar.getClass();
                bVar.L();
                return Unit.INSTANCE;
            case 8:
                oi0.b bVar2 = (oi0.b) obj;
                bVar2.getClass();
                bVar2.L();
                return Unit.INSTANCE;
            case 9:
                oi0.b bVar3 = (oi0.b) obj;
                bVar3.getClass();
                bVar3.L();
                return Unit.INSTANCE;
            case 10:
                oi0.b bVar4 = (oi0.b) obj;
                bVar4.getClass();
                bVar4.L();
                return Unit.INSTANCE;
            case 11:
                oi0.b bVar5 = (oi0.b) obj;
                t30.m.a aVar = t30.m.f162192o;
                bVar5.getClass();
                bVar5.s();
                bVar5.B();
                bVar5.M();
                return Unit.INSTANCE;
            case 12:
                oi0.b bVar6 = (oi0.b) obj;
                t30.m.a aVar2 = t30.m.f162192o;
                bVar6.getClass();
                bVar6.y();
                bVar6.g();
                bVar6.M();
                return Unit.INSTANCE;
            case 13:
                oi0.b bVar7 = (oi0.b) obj;
                bVar7.getClass();
                bVar7.s();
                bVar7.B();
                return Unit.INSTANCE;
            case 14:
                oi0.b bVar8 = (oi0.b) obj;
                t41.h hVar = t41.h.f162301d;
                bVar8.getClass();
                bVar8.a();
                return Unit.INSTANCE;
            case 15:
                oi0.b bVar9 = (oi0.b) obj;
                bVar9.getClass();
                bVar9.Z();
                return Unit.INSTANCE;
            case 16:
                oi0.b bVar10 = (oi0.b) obj;
                bVar10.getClass();
                bVar10.Z();
                return Unit.INSTANCE;
            case 17:
                oi0.b bVar11 = (oi0.b) obj;
                bVar11.getClass();
                bVar11.Z();
                return Unit.INSTANCE;
            case 18:
                oi0.b bVar12 = (oi0.b) obj;
                bVar12.getClass();
                bVar12.Z();
                return Unit.INSTANCE;
            case 19:
                oi0.b bVar13 = (oi0.b) obj;
                bVar13.getClass();
                bVar13.Z();
                return Unit.INSTANCE;
            case 20:
                p5.k0 k0Var2 = (p5.k0) obj;
                k0Var2.getClass();
                p5.h0.n(k0Var2, "");
                return Unit.INSTANCE;
            case 21:
                p5.k0 k0Var3 = (p5.k0) obj;
                k0Var3.getClass();
                p5.h0.n(k0Var3, "");
                return Unit.INSTANCE;
            case 22:
                oi0.b bVar14 = (oi0.b) obj;
                bVar14.getClass();
                bVar14.Z();
                return Unit.INSTANCE;
            case 23:
                oi0.b bVar15 = (oi0.b) obj;
                bVar15.getClass();
                bVar15.Z();
                return Unit.INSTANCE;
            case 24:
                oi0.b bVar16 = (oi0.b) obj;
                bVar16.getClass();
                bVar16.Z();
                return Unit.INSTANCE;
            case 25:
                oi0.b bVar17 = (oi0.b) obj;
                bVar17.getClass();
                bVar17.Z();
                return Unit.INSTANCE;
            case 26:
                oi0.b bVar18 = (oi0.b) obj;
                bVar18.getClass();
                bVar18.Z();
                return Unit.INSTANCE;
            case 27:
                Module module = (Module) obj;
                t51.a aVar3 = t51.a.f162546a;
                module.getClass();
                c cVar = new c(b14, 10);
                ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
                Kind kind = Kind.Factory;
                p13.j0 j0Var2 = p13.j0.f134944a;
                p005kotlin.jvm.internal.t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
                new KoinDefinition(module, e5.n(new BeanDefinition(rootScopeQualifier, t0Var.b(y51.g.class), null, cVar, kind, j0Var2), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(y51.a.class), null, new c(b14, 11), kind, j0Var2), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(u51.b.class), null, new c(b14, 12), kind, j0Var2), module));
                return Unit.INSTANCE;
            case 28:
                Module module2 = (Module) obj;
                t51.b bVar19 = t51.b.f162548a;
                module2.getClass();
                StringQualifier stringQualifierNamed = QualifierKt.named(o70.f.PENDING_ACTIVITY_BANNER.a());
                StringQualifier stringQualifierNamed2 = QualifierKt.named(o70.b.PENDING_ACTIVITIES.a());
                c cVar2 = new c(b14, 13);
                ScopeRegistry.Companion companion2 = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier2 = companion2.getRootScopeQualifier();
                Kind kind2 = Kind.Factory;
                p13.j0 j0Var3 = p13.j0.f134944a;
                p005kotlin.jvm.internal.t0 t0Var2 = p005kotlin.jvm.internal.s0.f105811a;
                new KoinDefinition(module2, e5.n(new BeanDefinition(rootScopeQualifier2, t0Var2.b(n70.a0.class), stringQualifierNamed2, cVar2, kind2, j0Var3), module2));
                new KoinDefinition(module2, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(r70.a.class), stringQualifierNamed2, new c(b14, 14), kind2, j0Var3), module2));
                new KoinDefinition(module2, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(r70.r.class), stringQualifierNamed2, new c(b14, 15), kind2, j0Var3), module2));
                new KoinDefinition(module2, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(r70.s.class), stringQualifierNamed, new c(b14, 16), kind2, j0Var3), module2));
                new KoinDefinition(module2, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(r70.r.class), stringQualifierNamed, new c(b14, 17), kind2, j0Var3), module2));
                new KoinDefinition(module2, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(v51.a.class), null, new c(b14, 18), kind2, j0Var3), module2));
                new KoinDefinition(module2, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(u51.c.class), null, new c(b14, 19), kind2, j0Var3), module2));
                new KoinDefinition(module2, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(w51.h0.class), null, new c(b14, 20), kind2, j0Var3), module2));
                new KoinDefinition(module2, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(w51.q0.class), null, new c(b14, 21), kind2, j0Var3), module2));
                return Unit.INSTANCE;
            default:
                oi0.b bVar20 = (oi0.b) obj;
                int i14 = BenchmarkExerciseOneRepMaxView.f48406i;
                bVar20.getClass();
                bVar20.N();
                return Unit.INSTANCE;
        }
    }
}
