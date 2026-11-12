package u1;

import android.view.ViewGroup;
import com.garmin.android.apps.connectmobile.activities.PrivacyType;
import i3.e5;
import java.util.Arrays;
import java.util.Map;
import org.koin.androidx.fragment.koin.KoinApplicationExtKt;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Kind;
import org.koin.core.definition.KoinDefinition;
import org.koin.core.instance.SingleInstanceFactory;
import org.koin.core.module.Module;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.registry.ScopeRegistry;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y1 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f167722a;

    public /* synthetic */ y1(int i14) {
        this.f167722a = i14;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        CharSequence charSequenceSubSequence;
        switch (this.f167722a) {
            case 0:
                p5.k.f136027d.getClass();
                p5.h0.v((p5.k0) obj, p5.k.f136028e);
                return Unit.INSTANCE;
            case 1:
                return new d2(((Integer) obj).intValue());
            case 2:
                ((ip.a) obj).getClass();
                return Unit.INSTANCE;
            case 3:
                int i14 = u12.o.f167804f;
                ((PrivacyType) obj).getClass();
                return Unit.INSTANCE;
            case 4:
                p5.k0 k0Var = (p5.k0) obj;
                k0Var.getClass();
                p5.h0.g(k0Var);
                return Unit.INSTANCE;
            case 5:
                return KoinApplicationExtKt.fragmentFactoryModule$lambda$1((Module) obj);
            case 6:
                Module module = (Module) obj;
                u80.a aVar = u80.a.f169457a;
                module.getClass();
                ty1.q1 q1Var = new ty1.q1(11);
                ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
                Kind kind = Kind.Factory;
                p13.j0 j0Var = p13.j0.f134944a;
                p005kotlin.jvm.internal.t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
                new KoinDefinition(module, e5.n(new BeanDefinition(rootScopeQualifier, t0Var.b(y92.a.class), null, q1Var, kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(y92.d.class), null, new ty1.q1(12), kind, j0Var), module));
                SingleInstanceFactory<?> singleInstanceFactoryP = lc.u0.p(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(s80.c.class), null, new ty1.q1(13), Kind.Singleton, j0Var), module);
                if (module.get_createdAtStart()) {
                    module.prepareForCreationAtStart(singleInstanceFactoryP);
                }
                new KoinDefinition(module, singleInstanceFactoryP);
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(t80.a.class), null, new ty1.q1(14), kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(v80.c.class), null, new ty1.q1(15), kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(aa2.u.class), null, new ty1.q1(16), kind, j0Var), module));
                return Unit.INSTANCE;
            case 7:
                ((p5.k0) obj).getClass();
                return Unit.INSTANCE;
            case 8:
                ((Float) obj).floatValue();
                ub0.c cVar = ub0.c.f169719a;
                return Unit.INSTANCE;
            case 9:
                ((Float) obj).floatValue();
                ub0.c cVar2 = ub0.c.f169719a;
                return Unit.INSTANCE;
            case 10:
                ((p5.k0) obj).getClass();
                return Unit.INSTANCE;
            case 11:
                Map.Entry entry = (Map.Entry) obj;
                androidx.work.c.b bVar = androidx.work.c.f11464b;
                entry.getClass();
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                StringBuilder sbI = sn.a.i(str, " : ");
                if (value instanceof Object[]) {
                    value = Arrays.toString((Object[]) value);
                    value.getClass();
                }
                sbI.append(value);
                return sbI.toString();
            case 12:
                Module module2 = (Module) obj;
                ui0.a aVar2 = ui0.a.f171176a;
                module2.getClass();
                StringQualifier stringQualifierNamed = QualifierKt.named(o70.t.f130072o.a());
                ty1.q1 q1Var2 = new ty1.q1(24);
                ScopeRegistry.Companion companion2 = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier2 = companion2.getRootScopeQualifier();
                Kind kind2 = Kind.Factory;
                p13.j0 j0Var2 = p13.j0.f134944a;
                p005kotlin.jvm.internal.t0 t0Var2 = p005kotlin.jvm.internal.s0.f105811a;
                new KoinDefinition(module2, e5.n(new BeanDefinition(rootScopeQualifier2, t0Var2.b(r70.s.class), stringQualifierNamed, q1Var2, kind2, j0Var2), module2));
                new KoinDefinition(module2, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(r70.r.class), stringQualifierNamed, new ty1.q1(25), kind2, j0Var2), module2));
                StringQualifier stringQualifierNamed2 = QualifierKt.named(o70.t.f130073p.a());
                new KoinDefinition(module2, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(r70.s.class), stringQualifierNamed2, new ty1.q1(26), kind2, j0Var2), module2));
                new KoinDefinition(module2, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(r70.r.class), stringQualifierNamed2, new ty1.q1(27), kind2, j0Var2), module2));
                StringQualifier stringQualifierNamed3 = QualifierKt.named(o70.t.f130074q.a());
                new KoinDefinition(module2, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(r70.s.class), stringQualifierNamed3, new ty1.q1(28), kind2, j0Var2), module2));
                new KoinDefinition(module2, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(r70.r.class), stringQualifierNamed3, new ty1.q1(29), kind2, j0Var2), module2));
                return Unit.INSTANCE;
            case 13:
                ((p5.k0) obj).getClass();
                return Unit.INSTANCE;
            case 14:
                x5.l0 l0Var = (x5.l0) obj;
                l0Var.getClass();
                String str2 = l0Var.f188878a.f157138b;
                StringBuilder sb3 = new StringBuilder();
                int length = str2.length();
                for (int i15 = 0; i15 < length; i15++) {
                    char cCharAt = str2.charAt(i15);
                    if (Character.isDigit(cCharAt)) {
                        sb3.append(cCharAt);
                    }
                }
                String string = sb3.toString();
                int length2 = string.length();
                for (int i16 = 0; i16 < length2; i16++) {
                    if (Character.getNumericValue((int) string.charAt(i16)) != 0) {
                        charSequenceSubSequence = string.subSequence(i16, string.length());
                        return x5.l0.a(l0Var, charSequenceSubSequence.toString(), 0L, 6);
                    }
                }
                charSequenceSubSequence = "";
                return x5.l0.a(l0Var, charSequenceSubSequence.toString(), 0L, 6);
            case 15:
                ((p5.k0) obj).getClass();
                return Unit.INSTANCE;
            case 16:
                oi0.b bVar2 = (oi0.b) obj;
                int i17 = uo.b.f172069i;
                bVar2.getClass();
                bVar2.t();
                bVar2.C();
                bVar2.M();
                return Unit.INSTANCE;
            case 17:
                uo0.h hVar = (uo0.h) obj;
                int i18 = uo0.c.f172081c;
                hVar.getClass();
                return hVar.f172116a;
            case 18:
                uo0.g gVar = (uo0.g) obj;
                int i19 = uo0.c.f172081c;
                gVar.getClass();
                return gVar.f172112a;
            case 19:
                ViewGroup viewGroup = (ViewGroup) obj;
                int i24 = uo1.d.f172122b;
                viewGroup.getClass();
                return new androidx.core.view.x0(viewGroup);
            case 20:
                uq.h hVar2 = (uq.h) obj;
                hVar2.getClass();
                return Boolean.valueOf(hVar2.f172205a == uq.i.MAX_PISTE_DIFFICULTY);
            case 21:
                uq.h hVar3 = (uq.h) obj;
                hVar3.getClass();
                return Boolean.valueOf(hVar3.f172205a == uq.i.WEIGHT_MAX_POWER);
            case 22:
                uq.h hVar4 = (uq.h) obj;
                hVar4.getClass();
                return Boolean.valueOf(hVar4.f172205a == uq.i.AVG_POWER);
            case 23:
                uq.h hVar5 = (uq.h) obj;
                hVar5.getClass();
                return Boolean.valueOf(hVar5.f172205a == uq.i.WEIGHT_AVG_POWER);
            case 24:
                uq.h hVar6 = (uq.h) obj;
                hVar6.getClass();
                return Boolean.valueOf(hVar6.f172205a == uq.i.WEIGHT_AVG_POWER);
            case 25:
                uq.h hVar7 = (uq.h) obj;
                hVar7.getClass();
                return Boolean.valueOf(hVar7.f172205a == uq.i.MAX_POWER);
            case 26:
                uq.h hVar8 = (uq.h) obj;
                hVar8.getClass();
                return Boolean.valueOf(hVar8.f172205a == uq.i.AVG_TEMPERATURE);
            case 27:
                uq.h hVar9 = (uq.h) obj;
                hVar9.getClass();
                return Boolean.valueOf(hVar9.f172205a == uq.i.AVG_GAP);
            case 28:
                uq.h hVar10 = (uq.h) obj;
                hVar10.getClass();
                return Boolean.valueOf(hVar10.f172205a == uq.i.PLACEMENT);
            default:
                uq.h hVar11 = (uq.h) obj;
                hVar11.getClass();
                return Boolean.valueOf(hVar11.f172205a == uq.i.WEIGHT_MAX_POWER);
        }
    }
}
