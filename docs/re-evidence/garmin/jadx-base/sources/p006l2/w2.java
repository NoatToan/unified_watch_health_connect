package p006l2;

import d6.a;
import e23.l;
import h5.e2;
import h5.k;
import i3.e5;
import java.util.List;
import kg.f;
import l3.i1;
import l52.r;
import lc.p0;
import lc.y0;
import m52.d;
import n51.b;
import o4.q1;
import o70.t;
import org.joda.time.DateTime;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Kind;
import org.koin.core.definition.KoinDefinition;
import org.koin.core.module.Module;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.registry.ScopeRegistry;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import p008y1.b2;
import p13.x;
import p5.d0;
import p5.h0;
import p5.j0;
import p5.k0;
import p61.e;
import q4.g;
import r70.s;
import s5.c;
import s5.i0;
import s5.m;
import s5.r0;
import s5.w0;
import w5.b0;
import w5.c0;
import w5.f0;
import w5.q;
import x5.i;
import z2.y1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w2 implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f108858a;

    public /* synthetic */ w2(int i14) {
        this.f108858a = i14;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        r0 f157243b;
        i0 i0Var;
        boolean z14 = true;
        switch (this.f108858a) {
            case 0:
                y1 y1Var = (y1) obj;
                Integer numB = y1Var.b();
                if (numB == null) {
                    return null;
                }
                int iIntValue = numB.intValue();
                long j8 = y1Var.f201548f;
                w0.a aVar = w0.f157315b;
                return new i(((int) (j8 & 4294967295L)) - iIntValue, 0);
            case 1:
                y1 y1Var2 = (y1) obj;
                Integer numA = y1Var2.a();
                if (numA == null) {
                    return null;
                }
                int iIntValue2 = numA.intValue();
                long j14 = y1Var2.f201548f;
                w0.a aVar2 = w0.f157315b;
                return new i(0, iIntValue2 - ((int) (j14 & 4294967295L)));
            case 2:
                return Unit.INSTANCE;
            case 3:
                List list = (List) obj;
                Object obj2 = list.get(1);
                obj2.getClass();
                b2 b2Var = ((Boolean) obj2).booleanValue() ? b2.Vertical : b2.Horizontal;
                Object obj3 = list.get(0);
                obj3.getClass();
                return new f3(b2Var, ((Float) obj3).floatValue());
            case 4:
                c.d dVar = (c.d) obj;
                T t7 = dVar.f157149a;
                if (!(t7 instanceof m) || (f157243b = ((m) t7).getF157243b()) == null || (f157243b.f157286a == null && f157243b.f157287b == null && f157243b.f157288c == null && f157243b.f157289d == null)) {
                    return x.d(dVar);
                }
                T t14 = dVar.f157149a;
                t14.getClass();
                r0 f157243b2 = ((m) t14).getF157243b();
                if (f157243b2 == null || (i0Var = f157243b2.f157286a) == null) {
                    i0Var = new i0(0L, 0L, (f0) null, (b0) null, (c0) null, (q) null, (String) null, 0L, (a) null, (d6.m) null, (z5.c) null, 0L, (d6.i) null, (q1) null, (s5.b0) null, (g) null, 65535, (j) null);
                }
                return x.d(dVar, new c.d(i0Var, dVar.f157150b, dVar.f157151c));
            case 5:
                d0.f135959a.getClass();
                j0<Unit> j0Var = d0.C;
                Unit unit = Unit.INSTANCE;
                ((k0) obj).a(j0Var, unit);
                return unit;
            case 6:
                ((b11.a) obj).getClass();
                return Unit.INSTANCE;
            case 7:
                ((b11.a) obj).getClass();
                return Unit.INSTANCE;
            case 8:
                ((f01.j) obj).getClass();
                return Unit.INSTANCE;
            case 9:
                return Unit.INSTANCE;
            case 10:
                return Unit.INSTANCE;
            case 11:
                int i14 = l3.m.f109318o;
                return Boolean.TRUE;
            case 12:
                return Unit.INSTANCE;
            case 13:
                e2 e2Var = (e2) obj;
                e2Var.getClass();
                i1 i1Var = (i1) e2Var;
                i1Var.f109272b = false;
                k.g(i1Var).U();
                return Boolean.FALSE;
            case 14:
                p0 p0Var = (p0) obj;
                p0Var.getClass();
                b.f fVar = b.f.INSTANCE;
                fVar.getClass();
                p0Var.f111836i = fVar;
                p0Var.f111833f = false;
                y0 y0VarI = f.i(p0Var, -1);
                y0VarI.f111914a = true;
                Unit unit2 = Unit.INSTANCE;
                p0Var.f111833f = true;
                p0Var.f111834g = y0VarI.f111915b;
                return Unit.INSTANCE;
            case 15:
                p0 p0Var2 = (p0) obj;
                p0Var2.getClass();
                p0.a(p0Var2, b.f.INSTANCE);
                return Unit.INSTANCE;
            case 16:
                l52.f fVar2 = (l52.f) obj;
                fVar2.getClass();
                l52.f.a aVar3 = fVar2 instanceof l52.f.a ? (l52.f.a) fVar2 : null;
                if (aVar3 != null) {
                    return aVar3.f110252f;
                }
                return null;
            case 17:
                l52.f fVar3 = (l52.f) obj;
                fVar3.getClass();
                return fVar3.f110249c;
            case 18:
                ((l52.j) obj).getClass();
                return Unit.INSTANCE;
            case 19:
                ((l52.j) obj).getClass();
                return Unit.INSTANCE;
            case 20:
                ((r) obj).getClass();
                return Unit.INSTANCE;
            case 21:
                ((l52.i.a) obj).getClass();
                return Boolean.TRUE;
            case 22:
                ((l52.i.a) obj).getClass();
                return Boolean.TRUE;
            case 23:
                l52.i.a aVar4 = (l52.i.a) obj;
                aVar4.getClass();
                com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var2 = (com.garmin.android.apps.connectmobile.workouts.data.model.j0) aVar4.getData();
                return Boolean.valueOf((j0Var2 != null ? j0Var2.f48217c : null) == d.COOL_DOWN);
            case 24:
                l52.i.a aVar5 = (l52.i.a) obj;
                aVar5.getClass();
                if ((!aVar5.k() || aVar5.getDepth() <= 2) && (!aVar5.f() || aVar5.getDepth() <= 1)) {
                    z14 = false;
                }
                return Boolean.valueOf(z14);
            case 25:
                Module module = (Module) obj;
                l60.a aVar6 = l60.a.f110526a;
                module.getClass();
                StringQualifier stringQualifierNamed = QualifierKt.named(t.f130067k.a());
                ky0.c cVar = new ky0.c(23);
                ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
                Kind kind = Kind.Factory;
                p13.j0 j0Var3 = p13.j0.f134944a;
                t0 t0Var = s0.f105811a;
                new KoinDefinition(module, e5.n(new BeanDefinition(rootScopeQualifier, t0Var.b(s.class), stringQualifierNamed, cVar, kind, j0Var3), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(r70.r.class), stringQualifierNamed, new ky0.c(24), kind, j0Var3), module));
                return Unit.INSTANCE;
            case 26:
                Module module2 = (Module) obj;
                l61.a aVar7 = l61.a.f110528a;
                module2.getClass();
                ky0.c cVar2 = new ky0.c(25);
                ScopeRegistry.Companion companion2 = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier2 = companion2.getRootScopeQualifier();
                Kind kind2 = Kind.Factory;
                p13.j0 j0Var4 = p13.j0.f134944a;
                t0 t0Var2 = s0.f105811a;
                new KoinDefinition(module2, e5.n(new BeanDefinition(rootScopeQualifier2, t0Var2.b(p61.b.class), null, cVar2, kind2, j0Var4), module2));
                new KoinDefinition(module2, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(e.class), null, new ky0.c(26), kind2, j0Var4), module2));
                new KoinDefinition(module2, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(t61.r.class), null, new ky0.c(27), kind2, j0Var4), module2));
                return Unit.INSTANCE;
            case 27:
                ((DateTime) obj).getClass();
                return Boolean.FALSE;
            case 28:
                k0 k0Var = (k0) obj;
                k0Var.getClass();
                h0.g(k0Var);
                return Unit.INSTANCE;
            default:
                k0 k0Var2 = (k0) obj;
                k0Var2.getClass();
                h0.g(k0Var2);
                return Unit.INSTANCE;
        }
    }
}
