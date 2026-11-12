package mi0;

import androidx.lifecycle.viewmodel.CreationExtras;
import c83.a0;
import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDTO;
import d53.w;
import e13.m;
import i3.e5;
import l52.y;
import mn2.q;
import mz1.e0;
import o70.t;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Kind;
import org.koin.core.definition.KoinDefinition;
import org.koin.core.module.Module;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.registry.ScopeRegistry;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import p13.j0;
import p5.k0;
import r70.r;
import r70.s;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class i implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f118891a;

    public /* synthetic */ i(e0 e0Var) {
        this.f118891a = 17;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = 9;
        int i15 = 11;
        int i16 = 10;
        int i17 = 18;
        int i18 = 21;
        int i19 = 20;
        int i24 = 19;
        int i25 = 5;
        int i26 = 4;
        int i27 = 8;
        int i28 = 7;
        int i29 = 6;
        switch (this.f118891a) {
            case 0:
                CreationExtras creationExtras = (CreationExtras) obj;
                j.d dVar = j.f118892t;
                creationExtras.getClass();
                return new j((String) creationExtras.a(j.f118894w), (String) creationExtras.a(j.f118895x));
            case 1:
                ml0.b bVar = ml0.b.f119197a;
                ((String) obj).getClass();
                return Unit.INSTANCE;
            case 2:
                ml0.b bVar2 = ml0.b.f119197a;
                ((il0.a) obj).getClass();
                return Unit.INSTANCE;
            case 3:
                ml0.b bVar3 = ml0.b.f119197a;
                ((il0.a) obj).getClass();
                return Unit.INSTANCE;
            case 4:
                ml0.b bVar4 = ml0.b.f119197a;
                ((String) obj).getClass();
                return Unit.INSTANCE;
            case 5:
                ml0.b bVar5 = ml0.b.f119197a;
                ((il0.a) obj).getClass();
                return Unit.INSTANCE;
            case 6:
                ml0.b bVar6 = ml0.b.f119197a;
                ((il0.a) obj).getClass();
                return Unit.INSTANCE;
            case 7:
                ((Long) obj).longValue();
                return Unit.INSTANCE;
            case 8:
                a0 a0Var = (a0) obj;
                a0Var.getClass();
                q qVar = new q(a0Var);
                int i30 = w03.b.f181178a;
                return new m(qVar);
            case 9:
                a0 a0Var2 = (a0) obj;
                a0Var2.getClass();
                q qVar2 = new q(a0Var2);
                int i34 = w03.b.f181178a;
                return new m(qVar2);
            case 10:
                oi0.b bVar7 = (oi0.b) obj;
                bVar7.getClass();
                bVar7.a();
                return Unit.INSTANCE;
            case 11:
                oi0.b bVar8 = (oi0.b) obj;
                bVar8.getClass();
                bVar8.a();
                return Unit.INSTANCE;
            case 12:
                Module module = (Module) obj;
                mr1.a aVar = mr1.a.f120350a;
                module.getClass();
                StringQualifier stringQualifierNamed = QualifierKt.named(t.I0.a());
                ml0.a aVar2 = new ml0.a(i29);
                ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
                Kind kind = Kind.Factory;
                j0 j0Var = j0.f134944a;
                t0 t0Var = s0.f105811a;
                new KoinDefinition(module, e5.n(new BeanDefinition(rootScopeQualifier, t0Var.b(s.class), stringQualifierNamed, aVar2, kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(r.class), stringQualifierNamed, new ml0.a(i28), kind, j0Var), module));
                return Unit.INSTANCE;
            case 13:
                Module module2 = (Module) obj;
                mr1.b bVar9 = mr1.b.f120352a;
                module2.getClass();
                ml0.a aVar3 = new ml0.a(i27);
                ScopeRegistry.Companion companion2 = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier2 = companion2.getRootScopeQualifier();
                Kind kind2 = Kind.Factory;
                j0 j0Var2 = j0.f134944a;
                t0 t0Var2 = s0.f105811a;
                new KoinDefinition(module2, e5.n(new BeanDefinition(rootScopeQualifier2, t0Var2.b(ir1.a.class), null, aVar3, kind2, j0Var2), module2));
                new KoinDefinition(module2, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(jr1.a.class), null, new ml0.a(i14), kind2, j0Var2), module2));
                new KoinDefinition(module2, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(lr1.b.class), null, new ml0.a(i16), kind2, j0Var2), module2));
                new KoinDefinition(module2, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(qr1.d.class), null, new ml0.a(i15), kind2, j0Var2), module2));
                return Unit.INSTANCE;
            case 14:
                Module module3 = (Module) obj;
                mw.a aVar4 = mw.a.f121241a;
                module3.getClass();
                StringQualifier stringQualifierNamed2 = QualifierKt.named(t.f130064h.a());
                ml0.a aVar5 = new ml0.a(i17);
                ScopeRegistry.Companion companion3 = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier3 = companion3.getRootScopeQualifier();
                Kind kind3 = Kind.Factory;
                j0 j0Var3 = j0.f134944a;
                t0 t0Var3 = s0.f105811a;
                new KoinDefinition(module3, e5.n(new BeanDefinition(rootScopeQualifier3, t0Var3.b(s.class), stringQualifierNamed2, aVar5, kind3, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(r.class), stringQualifierNamed2, new ml0.a(i24), kind3, j0Var3), module3));
                return Unit.INSTANCE;
            case 15:
                Module module4 = (Module) obj;
                mw.b bVar10 = mw.b.f121243a;
                module4.getClass();
                ml0.a aVar6 = new ml0.a(i19);
                ScopeRegistry.Companion companion4 = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier4 = companion4.getRootScopeQualifier();
                Kind kind4 = Kind.Factory;
                j0 j0Var4 = j0.f134944a;
                t0 t0Var4 = s0.f105811a;
                new KoinDefinition(module4, e5.n(new BeanDefinition(rootScopeQualifier4, t0Var4.b(lw.a.class), null, aVar6, kind4, j0Var4), module4));
                new KoinDefinition(module4, e5.n(new BeanDefinition(companion4.getRootScopeQualifier(), t0Var4.b(lw.b.class), null, new ml0.a(i18), kind4, j0Var4), module4));
                return Unit.INSTANCE;
            case 16:
                ((k0) obj).getClass();
                return Unit.INSTANCE;
            case 17:
                fg0.k kVar = (fg0.k) obj;
                int i35 = e0.K1;
                if ((kVar != null ? kVar.getEventType() : null) != gg0.f.f77137m) {
                    return null;
                }
                og0.a.f131967a.getClass();
                return Boolean.FALSE;
            case 18:
                ((Integer) obj).intValue();
                return Unit.INSTANCE;
            case 19:
                ((Integer) obj).intValue();
                return Unit.INSTANCE;
            case 20:
                obj.getClass();
                return w.M(2, obj.toString());
            case 21:
                ((Float) obj).floatValue();
                n21.a aVar7 = n21.a.f122359a;
                return Unit.INSTANCE;
            case 22:
                Module module5 = (Module) obj;
                n32.b bVar11 = n32.b.f123533a;
                module5.getClass();
                StringQualifier stringQualifierNamed3 = QualifierKt.named(t.M0.a());
                n32.a aVar8 = new n32.a(0);
                ScopeRegistry.Companion companion5 = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier5 = companion5.getRootScopeQualifier();
                Kind kind5 = Kind.Factory;
                j0 j0Var5 = j0.f134944a;
                t0 t0Var5 = s0.f105811a;
                new KoinDefinition(module5, e5.n(new BeanDefinition(rootScopeQualifier5, t0Var5.b(s.class), stringQualifierNamed3, aVar8, kind5, j0Var5), module5));
                new KoinDefinition(module5, e5.n(new BeanDefinition(companion5.getRootScopeQualifier(), t0Var5.b(r.class), stringQualifierNamed3, new n32.a(1), kind5, j0Var5), module5));
                StringQualifier stringQualifierNamed4 = QualifierKt.named(t.N0.a());
                new KoinDefinition(module5, e5.n(new BeanDefinition(companion5.getRootScopeQualifier(), t0Var5.b(s.class), stringQualifierNamed4, new n32.a(2), kind5, j0Var5), module5));
                new KoinDefinition(module5, e5.n(new BeanDefinition(companion5.getRootScopeQualifier(), t0Var5.b(r.class), stringQualifierNamed4, new n32.a(3), kind5, j0Var5), module5));
                StringQualifier stringQualifierNamed5 = QualifierKt.named(t.O0.a());
                new KoinDefinition(module5, e5.n(new BeanDefinition(companion5.getRootScopeQualifier(), t0Var5.b(s.class), stringQualifierNamed5, new n32.a(i26), kind5, j0Var5), module5));
                new KoinDefinition(module5, e5.n(new BeanDefinition(companion5.getRootScopeQualifier(), t0Var5.b(r.class), stringQualifierNamed5, new n32.a(i25), kind5, j0Var5), module5));
                return Unit.INSTANCE;
            case 23:
                ((k0) obj).getClass();
                return Unit.INSTANCE;
            case 24:
                Module module6 = (Module) obj;
                n42.a aVar9 = n42.a.f123612a;
                module6.getClass();
                StringQualifier stringQualifierNamed6 = QualifierKt.named(t.Q0.a());
                n32.a aVar10 = new n32.a(i29);
                ScopeRegistry.Companion companion6 = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier6 = companion6.getRootScopeQualifier();
                Kind kind6 = Kind.Factory;
                j0 j0Var6 = j0.f134944a;
                t0 t0Var6 = s0.f105811a;
                new KoinDefinition(module6, e5.n(new BeanDefinition(rootScopeQualifier6, t0Var6.b(s.class), stringQualifierNamed6, aVar10, kind6, j0Var6), module6));
                new KoinDefinition(module6, e5.n(new BeanDefinition(companion6.getRootScopeQualifier(), t0Var6.b(r.class), stringQualifierNamed6, new n32.a(i28), kind6, j0Var6), module6));
                return Unit.INSTANCE;
            case 25:
                Module module7 = (Module) obj;
                n42.b bVar12 = n42.b.f123614a;
                module7.getClass();
                n32.a aVar11 = new n32.a(i27);
                ScopeRegistry.Companion companion7 = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier7 = companion7.getRootScopeQualifier();
                Kind kind7 = Kind.Factory;
                j0 j0Var7 = j0.f134944a;
                t0 t0Var7 = s0.f105811a;
                new KoinDefinition(module7, e5.n(new BeanDefinition(rootScopeQualifier7, t0Var7.b(ce0.b.class), null, aVar11, kind7, j0Var7), module7));
                new KoinDefinition(module7, e5.n(new BeanDefinition(companion7.getRootScopeQualifier(), t0Var7.b(ce0.a.class), null, new n32.a(i14), kind7, j0Var7), module7));
                return Unit.INSTANCE;
            case 26:
                Module module8 = (Module) obj;
                n52.a aVar12 = n52.a.f123783a;
                module8.getClass();
                StringQualifier stringQualifierNamed7 = QualifierKt.named(o70.b.WORKOUT.a());
                n32.a aVar13 = new n32.a(i16);
                ScopeRegistry.Companion companion8 = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier8 = companion8.getRootScopeQualifier();
                Kind kind8 = Kind.Factory;
                j0 j0Var8 = j0.f134944a;
                t0 t0Var8 = s0.f105811a;
                new KoinDefinition(module8, e5.n(new BeanDefinition(rootScopeQualifier8, t0Var8.b(n70.a0.class), stringQualifierNamed7, aVar13, kind8, j0Var8), module8));
                new KoinDefinition(module8, e5.n(new BeanDefinition(companion8.getRootScopeQualifier(), t0Var8.b(r70.a.class), stringQualifierNamed7, new n32.a(i15), kind8, j0Var8), module8));
                new KoinDefinition(module8, e5.n(new BeanDefinition(companion8.getRootScopeQualifier(), t0Var8.b(r.class), stringQualifierNamed7, new n32.a(12), kind8, j0Var8), module8));
                return Unit.INSTANCE;
            case 27:
                Module module9 = (Module) obj;
                n52.b bVar13 = n52.b.f123785a;
                module9.getClass();
                n32.a aVar14 = new n32.a(16);
                ScopeRegistry.Companion companion9 = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier9 = companion9.getRootScopeQualifier();
                Kind kind9 = Kind.Factory;
                j0 j0Var9 = j0.f134944a;
                t0 t0Var9 = s0.f105811a;
                new KoinDefinition(module9, e5.n(new BeanDefinition(rootScopeQualifier9, t0Var9.b(o52.f.class), null, aVar14, kind9, j0Var9), module9));
                new KoinDefinition(module9, e5.n(new BeanDefinition(companion9.getRootScopeQualifier(), t0Var9.b(y.class), null, new n32.a(i24), kind9, j0Var9), module9));
                new KoinDefinition(module9, e5.n(new BeanDefinition(companion9.getRootScopeQualifier(), t0Var9.b(o52.d.class), null, new n32.a(i19), kind9, j0Var9), module9));
                new KoinDefinition(module9, e5.n(new BeanDefinition(companion9.getRootScopeQualifier(), t0Var9.b(o52.c.class), null, new n32.a(i18), kind9, j0Var9), module9));
                new KoinDefinition(module9, e5.n(new BeanDefinition(companion9.getRootScopeQualifier(), t0Var9.b(q52.f.class), null, new n32.a(22), kind9, j0Var9), module9));
                new KoinDefinition(module9, e5.n(new BeanDefinition(companion9.getRootScopeQualifier(), t0Var9.b(q52.c.class), null, new n32.a(23), kind9, j0Var9), module9));
                new KoinDefinition(module9, e5.n(new BeanDefinition(companion9.getRootScopeQualifier(), t0Var9.b(d62.t.class), null, new n32.a(24), kind9, j0Var9), module9));
                new KoinDefinition(module9, e5.n(new BeanDefinition(companion9.getRootScopeQualifier(), t0Var9.b(d62.h.class), null, new n32.a(13), kind9, j0Var9), module9));
                new KoinDefinition(module9, e5.n(new BeanDefinition(companion9.getRootScopeQualifier(), t0Var9.b(k62.h.class), null, new n32.a(14), kind9, j0Var9), module9));
                new KoinDefinition(module9, e5.n(new BeanDefinition(companion9.getRootScopeQualifier(), t0Var9.b(k62.d.class), null, new n32.a(15), kind9, j0Var9), module9));
                new KoinDefinition(module9, e5.n(new BeanDefinition(companion9.getRootScopeQualifier(), t0Var9.b(h62.m.class), null, new n32.a(17), kind9, j0Var9), module9));
                new KoinDefinition(module9, e5.n(new BeanDefinition(companion9.getRootScopeQualifier(), t0Var9.b(n62.c.class), null, new n32.a(i17), kind9, j0Var9), module9));
                return Unit.INSTANCE;
            case 28:
                WorkoutDTO workoutDTO = (WorkoutDTO) obj;
                workoutDTO.getClass();
                return Long.valueOf(workoutDTO.f48040a);
            default:
                k63.a aVar15 = (k63.a) obj;
                n63.k kVar2 = n63.k.f123936a;
                aVar15.getClass();
                k63.a.b(aVar15, "JsonPrimitive", new n63.l(new n61.h(4)));
                k63.a.b(aVar15, "JsonNull", new n63.l(new n61.h(5)));
                k63.a.b(aVar15, "JsonLiteral", new n63.l(new n61.h(6)));
                k63.a.b(aVar15, "JsonObject", new n63.l(new n61.h(7)));
                k63.a.b(aVar15, "JsonArray", new n63.l(new n61.h(8)));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ i(int i14) {
        this.f118891a = i14;
    }
}
