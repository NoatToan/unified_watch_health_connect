package f21;

import com.garmin.android.apps.connectmobile.R;
import i3.e5;
import java.util.List;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Kind;
import org.koin.core.definition.KoinDefinition;
import org.koin.core.module.Module;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.registry.ScopeRegistry;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class g0 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f68536a;

    public /* synthetic */ g0(int i14) {
        this.f68536a = i14;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        z = false;
        boolean z14 = false;
        switch (this.f68536a) {
            case 0:
                p5.k0 k0Var = (p5.k0) obj;
                k0Var.getClass();
                p5.h0.f(k0Var);
                return Unit.INSTANCE;
            case 1:
                int i14 = androidx.compose.runtime.snapshots.a.f6037p;
                synchronized (f4.l.f68775c) {
                    List<? extends e23.l<Object, Unit>> list = f4.l.f68781i;
                    int size = list.size();
                    for (int i15 = 0; i15 < size; i15++) {
                        list.get(i15).invoke(obj);
                    }
                }
                return Unit.INSTANCE;
            case 2:
                return Unit.INSTANCE;
            case 3:
                oi0.b bVar = (oi0.b) obj;
                bVar.getClass();
                bVar.M();
                return Unit.INSTANCE;
            case 4:
                oi0.b bVar2 = (oi0.b) obj;
                bVar2.getClass();
                bVar2.t();
                bVar2.C();
                return Unit.INSTANCE;
            case 5:
                x5.l0 l0Var = (x5.l0) obj;
                l0Var.getClass();
                return l0Var;
            case 6:
                Module module = (Module) obj;
                f41.a aVar = f41.a.f68858a;
                module.getClass();
                StringQualifier stringQualifierNamed = QualifierKt.named(o70.t.A.a());
                ex.b bVar3 = new ex.b(12);
                ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
                Kind kind = Kind.Factory;
                p13.j0 j0Var = p13.j0.f134944a;
                t0 t0Var = s0.f105811a;
                new KoinDefinition(module, e5.n(new BeanDefinition(rootScopeQualifier, t0Var.b(r70.s.class), stringQualifierNamed, bVar3, kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(r70.r.class), stringQualifierNamed, new ex.b(13), kind, j0Var), module));
                StringQualifier stringQualifierNamed2 = QualifierKt.named(o70.i.f130004l.a());
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(r70.s.class), stringQualifierNamed2, new ex.b(14), kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(r70.r.class), stringQualifierNamed2, new ex.b(15), kind, j0Var), module));
                return Unit.INSTANCE;
            case 7:
                Module module2 = (Module) obj;
                f41.b bVar4 = f41.b.f68860a;
                module2.getClass();
                new KoinDefinition(module2, e5.n(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), s0.f105811a.b(g41.a.class), null, new ex.b(16), Kind.Factory, p13.j0.f134944a), module2));
                return Unit.INSTANCE;
            case 8:
                gs1.v.a aVar2 = (gs1.v.a) obj;
                int i16 = f52.e.f69181h;
                aVar2.getClass();
                if (!(aVar2 instanceof gs1.v.a.f) && !(aVar2 instanceof gs1.v.a.b)) {
                    z14 = true;
                }
                return Boolean.valueOf(z14);
            case 9:
                l52.i.a aVar3 = (l52.i.a) obj;
                aVar3.getClass();
                return Boolean.valueOf(aVar3.k());
            case 10:
                f62.h hVar = (f62.h) obj;
                hVar.getClass();
                return hVar.f69246a;
            case 11:
                f62.h hVar2 = (f62.h) obj;
                hVar2.getClass();
                return hVar2.f69246a;
            case 12:
                f62.h hVar3 = (f62.h) obj;
                hVar3.getClass();
                return hVar3.f69246a;
            case 13:
                l52.j jVar = (l52.j) obj;
                int i17 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.k0.f.f49024b;
                jVar.getClass();
                com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var2 = new com.garmin.android.apps.connectmobile.workouts.data.model.j0(0, 0, null, 0, 0, false, null, false, false, null, null, null, 0, 0.0d, null, null, null, 0.0d, 0.0d, null, 0, 0, 0, 0, 0, 0, 0, 0.0d, null, 0.0d, 0.0d, null, 0, null, 0, null, null, null, null, 0.0d, null, null, 0.0d, 0.0d, null, null, -1, 16383, null);
                f12.l lVar = (f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null);
                j0Var2.f48217c = m52.d.INTERVAL;
                j0Var2.f48227l = m52.a.f116650f;
                j0Var2.f48229n = k52.g.a(1.0d, lVar.y() ? qs.y.UNIT_DISTANCE_KILOMETER : qs.y.UNIT_DISTANCE_MILE);
                j0Var2.f48231p = lVar.y() ? m52.j.f116746f : m52.j.f116745e;
                j0Var2.J0 = 0.0d;
                l52.l.c(jVar, j0Var2);
                return Unit.INSTANCE;
            case 14:
                l52.j jVar2 = (l52.j) obj;
                int i18 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.k0.h.f49027c;
                jVar2.getClass();
                com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var3 = new com.garmin.android.apps.connectmobile.workouts.data.model.j0(0, 0, null, 0, 0, false, null, false, false, null, null, null, 0, 0.0d, null, null, null, 0.0d, 0.0d, null, 0, 0, 0, 0, 0, 0, 0, 0.0d, null, 0.0d, 0.0d, null, 0, null, 0, null, null, null, null, 0.0d, null, null, 0.0d, 0.0d, null, null, -1, 16383, null);
                j0Var3.f48217c = m52.d.INTERVAL;
                j0Var3.f48232q = m52.g.NONE;
                j0Var3.f48227l = m52.a.f116657m;
                j0Var3.f48231p = v52.f.s() ? m52.j.f116746f : m52.j.f116745e;
                j0Var3.f48229n = 10.0d;
                l52.l.c(jVar2, j0Var3);
                return Unit.INSTANCE;
            case 15:
                l52.j jVar3 = (l52.j) obj;
                int i19 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.k0.j.f49031b;
                jVar3.getClass();
                com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var4 = new com.garmin.android.apps.connectmobile.workouts.data.model.j0(0, 0, null, 0, 0, false, null, false, false, null, null, null, 0, 0.0d, null, null, null, 0.0d, 0.0d, null, 0, 0, 0, 0, 0, 0, 0, 0.0d, null, 0.0d, 0.0d, null, 0, null, 0, null, null, null, null, 0.0d, null, null, 0.0d, 0.0d, null, null, -1, 16383, null);
                j0Var4.f48217c = m52.d.INTERVAL;
                j0Var4.f48232q = m52.g.WALK_INSTRUCTION;
                j0Var4.f48233r = x52.b.BRISK.f189051a;
                j0Var4.f48227l = m52.a.f116648d;
                l52.l.c(jVar3, j0Var4);
                return Unit.INSTANCE;
            case 16:
                ((p5.k0) obj).getClass();
                return Unit.INSTANCE;
            case 17:
                ((p5.k0) obj).getClass();
                return Unit.INSTANCE;
            case 18:
                ((p5.k0) obj).getClass();
                return Unit.INSTANCE;
            case 19:
                ((p5.k0) obj).getClass();
                return Unit.INSTANCE;
            case 20:
                p5.k0 k0Var2 = (p5.k0) obj;
                k0Var2.getClass();
                p5.h0.f(k0Var2);
                return Unit.INSTANCE;
            case 21:
                ((p5.k0) obj).getClass();
                return Unit.INSTANCE;
            case 22:
                ((p5.k0) obj).getClass();
                return Unit.INSTANCE;
            case 23:
                ((p5.k0) obj).getClass();
                return Unit.INSTANCE;
            case 24:
                ((Integer) obj).intValue();
                return Unit.INSTANCE;
            case 25:
                oi0.b bVar5 = (oi0.b) obj;
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.f.b bVar6 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.f.f40604w;
                bVar5.getClass();
                String str = bVar5.f132238b;
                l22.b bVar7 = bVar5.f132237a;
                bVar5.f132238b = d53.u.v(str, bVar7.getString(R.string.pregnancy_avg_movement), bVar7.getString(R.string.lbl_average_movement), false);
                return Unit.INSTANCE;
            case 26:
                oi0.b bVar8 = (oi0.b) obj;
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.f.b bVar9 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.f.f40604w;
                bVar8.getClass();
                String str2 = bVar8.f132238b;
                l22.b bVar10 = bVar8.f132237a;
                bVar8.f132238b = d53.u.v(str2, bVar10.getString(R.string.pregnancy_avg_duration), bVar10.getString(R.string.lbl_average_duration), false);
                return Unit.INSTANCE;
            case 27:
                oi0.b bVar11 = (oi0.b) obj;
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.l.a aVar4 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.l.f40695p;
                bVar11.getClass();
                bVar11.p();
                return Unit.INSTANCE;
            case 28:
                ((p5.k0) obj).getClass();
                return Unit.INSTANCE;
            default:
                Module module3 = (Module) obj;
                fh0.a aVar5 = fh0.a.f71578a;
                module3.getClass();
                StringQualifier stringQualifierNamed3 = QualifierKt.named(o70.t.f130071n.a());
                ex.b bVar12 = new ex.b(22);
                ScopeRegistry.Companion companion2 = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier2 = companion2.getRootScopeQualifier();
                Kind kind2 = Kind.Factory;
                p13.j0 j0Var5 = p13.j0.f134944a;
                t0 t0Var2 = s0.f105811a;
                new KoinDefinition(module3, e5.n(new BeanDefinition(rootScopeQualifier2, t0Var2.b(r70.s.class), stringQualifierNamed3, bVar12, kind2, j0Var5), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(r70.r.class), stringQualifierNamed3, new ex.b(23), kind2, j0Var5), module3));
                return Unit.INSTANCE;
        }
    }
}
