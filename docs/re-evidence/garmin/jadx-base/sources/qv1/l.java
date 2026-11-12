package qv1;

import android.view.View;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import d53.u;
import i3.e5;
import i3.se;
import l72.i3;
import o70.o;
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
import p005kotlin.math.MathKt;
import p13.j0;
import p5.h0;
import p5.k0;
import qx1.p;
import r22.m;
import r22.y;
import r70.r;
import r70.s;
import sz1.t;
import ww1.a0;
import ww1.x;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class l implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f148168a;

    public /* synthetic */ l(y yVar) {
        this.f148168a = 17;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        switch (this.f148168a) {
            case 0:
                return Boolean.valueOf(((x) obj).getTrainingPhase() == a0.TARGET_EVENT_DAY);
            case 1:
                g3 g3Var = (g3) obj;
                t60.a aVar = qw.g.f148245k;
                g3Var.getClass();
                int i14 = qw.g.c.f148258a[g3Var.f35300a.ordinal()];
                if (i14 == 1) {
                    v60.a aVar2 = (v60.a) g3Var.f35301b;
                    return aVar2 == null ? new v60.a(false, null) : aVar2;
                }
                if (i14 != 2) {
                    return new v60.a(false, null);
                }
                i2.a aVar3 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                Exception exc = g3Var.f35303d;
                aVar3.getClass();
                i2.a.g(a2Var, "BloodPressureCrossSellingItem", exc);
                return new v60.a(false, null);
            case 2:
                ((k0) obj).getClass();
                return Unit.INSTANCE;
            case 3:
                ((k0) obj).getClass();
                return Unit.INSTANCE;
            case 4:
                ((k0) obj).getClass();
                return Unit.INSTANCE;
            case 5:
                ((String) obj).getClass();
                return Unit.INSTANCE;
            case 6:
                ((String) obj).getClass();
                return Unit.INSTANCE;
            case 7:
                qy0.b bVar = qy0.b.f148467a;
                ((String) obj).getClass();
                return Unit.INSTANCE;
            case 8:
                qy0.b bVar2 = qy0.b.f148467a;
                return Unit.INSTANCE;
            case 9:
                qy0.b bVar3 = qy0.b.f148467a;
                return Unit.INSTANCE;
            case 10:
                ((Boolean) obj).booleanValue();
                qy0.b bVar4 = qy0.b.f148467a;
                return Unit.INSTANCE;
            case 11:
                Module module = (Module) obj;
                qz1.a aVar4 = qz1.a.f148628a;
                module.getClass();
                new KoinDefinition(module, e5.n(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), s0.f105811a.b(t.class), null, new p(7), Kind.Factory, j0.f134944a), module));
                return Unit.INSTANCE;
            case 12:
                Module module2 = (Module) obj;
                qz1.b bVar5 = qz1.b.f148630a;
                module2.getClass();
                StringQualifier stringQualifierNamed = QualifierKt.named(o.TRAINING_READINESS.a());
                p pVar = new p(8);
                ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
                Kind kind = Kind.Factory;
                j0 j0Var = j0.f134944a;
                t0 t0Var = s0.f105811a;
                new KoinDefinition(module2, e5.n(new BeanDefinition(rootScopeQualifier, t0Var.b(s.class), stringQualifierNamed, pVar, kind, j0Var), module2));
                new KoinDefinition(module2, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(r.class), stringQualifierNamed, new p(9), kind, j0Var), module2));
                StringQualifier stringQualifierNamed2 = QualifierKt.named(o70.t.L0.a());
                new KoinDefinition(module2, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(s.class), stringQualifierNamed2, new p(10), kind, j0Var), module2));
                new KoinDefinition(module2, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(r.class), stringQualifierNamed2, new p(11), kind, j0Var), module2));
                StringQualifier stringQualifierNamed3 = QualifierKt.named(o70.i.f130003k.a());
                new KoinDefinition(module2, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(s.class), stringQualifierNamed3, new p(12), kind, j0Var), module2));
                new KoinDefinition(module2, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(r.class), stringQualifierNamed3, new p(13), kind, j0Var), module2));
                return Unit.INSTANCE;
            case 13:
                ((k0) obj).getClass();
                return Unit.INSTANCE;
            case 14:
                ((k0) obj).getClass();
                return Unit.INSTANCE;
            case 15:
                ((Boolean) obj).booleanValue();
                return Unit.INSTANCE;
            case 16:
                oi0.b bVar6 = (oi0.b) obj;
                int i15 = m.a.f149753f;
                bVar6.getClass();
                String str = bVar6.f132238b;
                l22.b bVar7 = bVar6.f132237a;
                bVar6.f132238b = u.v(str, bVar7.getString(R.string.lbl_approx), bVar7.getString(R.string.lbl_approximately), false);
                return Unit.INSTANCE;
            case 17:
                y.a aVar5 = y.f149923b;
                ((View) obj).getClass();
                return Unit.INSTANCE;
            case 18:
                return l3.a.x1(l3.f23124b, MathKt.d(((Double) obj).doubleValue() * 1000.0d));
            case 19:
                k0 k0Var = (k0) obj;
                k0Var.getClass();
                h0.f(k0Var);
                return Unit.INSTANCE;
            case 20:
                oi0.b bVar8 = (oi0.b) obj;
                int i16 = r51.c.f150479f;
                bVar8.getClass();
                bVar8.s();
                bVar8.B();
                return Unit.INSTANCE;
            case 21:
                ((r52.a) obj).getClass();
                return Unit.INSTANCE;
            case 22:
                ((i3) obj).getClass();
                return Unit.INSTANCE;
            case 23:
                oi0.b bVar9 = (oi0.b) obj;
                bVar9.getClass();
                bVar9.H();
                return Unit.INSTANCE;
            case 24:
                oi0.b bVar10 = (oi0.b) obj;
                bVar10.getClass();
                bVar10.M();
                return Unit.INSTANCE;
            case 25:
                oi0.b bVar11 = (oi0.b) obj;
                bVar11.getClass();
                bVar11.M();
                return Unit.INSTANCE;
            case 26:
                oi0.b bVar12 = (oi0.b) obj;
                bVar12.getClass();
                bVar12.H();
                return Unit.INSTANCE;
            case 27:
                ((se) obj).getClass();
                return Unit.INSTANCE;
            case 28:
                ((Integer) obj).intValue();
                return Unit.INSTANCE;
            default:
                ((Integer) obj).intValue();
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ l(int i14) {
        this.f148168a = i14;
    }
}
