package h02;

import android.content.Context;
import b31.h;
import c31.j;
import com.garmin.android.apps.connectmobile.dashboard.data.datasource.a2;
import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDTO;
import e23.l;
import g20.i;
import h63.o;
import i20.t;
import i3.e5;
import i31.c0;
import i31.e0;
import i31.f;
import i31.s;
import i31.v;
import i31.x;
import i71.q;
import java.util.List;
import jw.w;
import lc.p0;
import m20.b0;
import m20.e;
import m20.g;
import m20.l0;
import m20.n0;
import m20.z;
import m63.m0;
import m63.v0;
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
import p5.h0;
import p5.k0;
import r1.n;
import r1.u0;
import r70.r;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f80645a;

    public /* synthetic */ a(int i14) {
        this.f80645a = i14;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = 28;
        int i15 = 27;
        int i16 = 11;
        int i17 = 10;
        int i18 = 16;
        int i19 = 9;
        int i24 = 7;
        int i25 = 4;
        int i26 = 5;
        int i27 = 1;
        int i28 = 6;
        byte b14 = 0;
        switch (this.f80645a) {
            case 0:
                k0 k0Var = (k0) obj;
                k0Var.getClass();
                h0.g(k0Var);
                return Unit.INSTANCE;
            case 1:
                List list = (List) obj;
                Object obj2 = list.get(0);
                obj2.getClass();
                int iIntValue = ((Integer) obj2).intValue();
                Object obj3 = list.get(1);
                obj3.getClass();
                return new h2.b(iIntValue, ((Float) obj3).floatValue(), new ad.b(list, i26));
            case 2:
                return Unit.INSTANCE;
            case 3:
                Module module = (Module) obj;
                h20.b bVar = h20.b.f81029a;
                module.getClass();
                gq1.a aVar = new gq1.a(b14, 29);
                ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
                Kind kind = Kind.Factory;
                j0 j0Var = j0.f134944a;
                t0 t0Var = s0.f105811a;
                new KoinDefinition(module, e5.n(new BeanDefinition(rootScopeQualifier, t0Var.b(g.class), null, aVar, kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(b0.class), null, new h20.a(i27), kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(w.class), null, new h20.a(2), kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(e.class), null, new h20.a(3), kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(z.class), null, new h20.a(i25), kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(l0.class), null, new h20.a(i26), kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(n0.class), null, new h20.a(i28), kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(m20.a.class), null, new h20.a(i24), kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(com.garmin.android.apps.connectmobile.contacts.d.class), null, new gq1.a(b14, i15), kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(t.class), null, new gq1.a(b14, i14), kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(i.class), null, new h20.a(b14), kind, j0Var), module));
                return Unit.INSTANCE;
            case 4:
                k0 k0Var2 = (k0) obj;
                k0Var2.getClass();
                p5.l.f136032b.getClass();
                h0.w(k0Var2, p5.l.f136036f);
                return Unit.INSTANCE;
            case 5:
                ((n) obj).getClass();
                return r1.b.c(u0.d(s1.l.d(200, 0, null, 6), 2), u0.e(s1.l.d(200, 0, null, 6), 2));
            case 6:
                k0 k0Var3 = (k0) obj;
                k0Var3.getClass();
                p5.l.f136032b.getClass();
                h0.w(k0Var3, p5.l.f136036f);
                return Unit.INSTANCE;
            case 7:
                ((n) obj).getClass();
                return r1.b.c(u0.d(s1.l.d(200, 0, null, 6), 2), u0.e(s1.l.d(200, 0, null, 6), 2));
            case 8:
                Module module2 = (Module) obj;
                h31.a aVar2 = h31.a.f81290a;
                module2.getClass();
                h20.a aVar3 = new h20.a(i19);
                ScopeRegistry.Companion companion2 = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier2 = companion2.getRootScopeQualifier();
                Kind kind2 = Kind.Factory;
                j0 j0Var2 = j0.f134944a;
                t0 t0Var2 = s0.f105811a;
                new KoinDefinition(module2, e5.n(new BeanDefinition(rootScopeQualifier2, t0Var2.b(s.class), null, aVar3, kind2, j0Var2), module2));
                new KoinDefinition(module2, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(f.class), null, new h20.a(i17), kind2, j0Var2), module2));
                StringQualifier stringQualifierNamed = QualifierKt.named(o70.f.ONBOARDING.a());
                new KoinDefinition(module2, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(r70.s.class), stringQualifierNamed, new h20.a(i16), kind2, j0Var2), module2));
                new KoinDefinition(module2, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(r.class), stringQualifierNamed, new h20.a(12), kind2, j0Var2), module2));
                return Unit.INSTANCE;
            case 9:
                Module module3 = (Module) obj;
                h31.c cVar = h31.c.f81292a;
                module3.getClass();
                h20.a aVar4 = new h20.a(20);
                ScopeRegistry.Companion companion3 = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier3 = companion3.getRootScopeQualifier();
                Kind kind3 = Kind.Factory;
                j0 j0Var3 = j0.f134944a;
                t0 t0Var3 = s0.f105811a;
                new KoinDefinition(module3, e5.n(new BeanDefinition(rootScopeQualifier3, t0Var3.b(f31.a.class), null, aVar4, kind3, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(c31.c.class), null, new h20.a(i15), kind3, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(j.class), null, new h20.a(i14), kind3, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(b31.a.class), null, new h20.a(13), kind3, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(h.class), null, new h20.a(14), kind3, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(b31.f.class), null, new h20.a(15), kind3, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(v.class), null, new h20.a(i18), kind3, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(i31.c.class), null, new h20.a(17), kind3, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(e0.class), null, new h20.a(18), kind3, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(i31.b0.class), null, new h20.a(19), kind3, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(c0.class), null, new h20.a(21), kind3, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(i31.b.class), null, new h20.a(22), kind3, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(x.class), null, new h20.a(23), kind3, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(i31.z.class), null, new h20.a(24), kind3, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(i31.r.class), null, new h20.a(25), kind3, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(r31.g.class), null, new h20.a(26), kind3, j0Var3), module3));
                return Unit.INSTANCE;
            case 10:
                oi0.b bVar2 = (oi0.b) obj;
                bVar2.getClass();
                bVar2.s();
                bVar2.B();
                return Unit.INSTANCE;
            case 11:
                oi0.b bVar3 = (oi0.b) obj;
                bVar3.getClass();
                bVar3.y();
                bVar3.g();
                return Unit.INSTANCE;
            case 12:
                i50.f fVar = (i50.f) obj;
                fVar.getClass();
                String str = fVar.f91738a;
                return str == null ? Integer.valueOf(fVar.hashCode()) : str;
            case 13:
                o51.c cVar2 = (o51.c) obj;
                cVar2.getClass();
                return Long.valueOf(cVar2.f129221c);
            case 14:
                WorkoutDTO workoutDTO = (WorkoutDTO) obj;
                workoutDTO.getClass();
                return Long.valueOf(workoutDTO.f48040a);
            case 15:
                k63.a aVar5 = (k63.a) obj;
                h63.g gVar = h63.g.f82296a;
                aVar5.getClass();
                j0 j0Var4 = j0.f134944a;
                m0.f116981a.getClass();
                aVar5.a("days", m0.f116982b, j0Var4);
                return Unit.INSTANCE;
            case 16:
                k63.a aVar6 = (k63.a) obj;
                h63.n nVar = h63.n.f82310a;
                aVar6.getClass();
                j0 j0Var5 = j0.f134944a;
                m0.f116981a.getClass();
                aVar6.a("months", m0.f116982b, j0Var5);
                return Unit.INSTANCE;
            case 17:
                k63.a aVar7 = (k63.a) obj;
                o oVar = o.f82312a;
                aVar7.getClass();
                j0 j0Var6 = j0.f134944a;
                v0.f117027a.getClass();
                aVar7.a("nanoseconds", v0.f117028b, j0Var6);
                return Unit.INSTANCE;
            case 18:
                Module module4 = (Module) obj;
                h71.a aVar8 = h71.a.f82332a;
                module4.getClass();
                StringQualifier stringQualifierNamed2 = QualifierKt.named(o70.o.TRAINING_STATUS.a());
                h51.a aVar9 = new h51.a(i25);
                ScopeRegistry.Companion companion4 = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier4 = companion4.getRootScopeQualifier();
                Kind kind4 = Kind.Factory;
                j0 j0Var7 = j0.f134944a;
                t0 t0Var4 = s0.f105811a;
                new KoinDefinition(module4, e5.n(new BeanDefinition(rootScopeQualifier4, t0Var4.b(r70.s.class), stringQualifierNamed2, aVar9, kind4, j0Var7), module4));
                new KoinDefinition(module4, e5.n(new BeanDefinition(companion4.getRootScopeQualifier(), t0Var4.b(r.class), stringQualifierNamed2, new h51.a(i26), kind4, j0Var7), module4));
                StringQualifier stringQualifierNamed3 = QualifierKt.named(o70.t.K0.a());
                new KoinDefinition(module4, e5.n(new BeanDefinition(companion4.getRootScopeQualifier(), t0Var4.b(dw.a.class), null, new h51.a(i28), kind4, j0Var7), module4));
                new KoinDefinition(module4, e5.n(new BeanDefinition(companion4.getRootScopeQualifier(), t0Var4.b(iw.e.class), null, new h51.a(i24), kind4, j0Var7), module4));
                StringQualifier stringQualifierNamed4 = QualifierKt.named(q.CACHE.f91995a);
                new KoinDefinition(module4, e5.n(new BeanDefinition(companion4.getRootScopeQualifier(), t0Var4.b(i71.r.class), stringQualifierNamed4, new h51.a(8), kind4, j0Var7), module4));
                StringQualifier stringQualifierNamed5 = QualifierKt.named(q.SERVER.f91995a);
                new KoinDefinition(module4, e5.n(new BeanDefinition(companion4.getRootScopeQualifier(), t0Var4.b(i71.r.class), stringQualifierNamed5, new h51.a(i19), kind4, j0Var7), module4));
                new KoinDefinition(module4, e5.n(new BeanDefinition(companion4.getRootScopeQualifier(), t0Var4.b(a2.class), null, new g80.e(i18, stringQualifierNamed4, stringQualifierNamed5), kind4, j0Var7), module4));
                new KoinDefinition(module4, e5.n(new BeanDefinition(companion4.getRootScopeQualifier(), t0Var4.b(r70.s.class), stringQualifierNamed3, new h51.a(i17), kind4, j0Var7), module4));
                new KoinDefinition(module4, e5.n(new BeanDefinition(companion4.getRootScopeQualifier(), t0Var4.b(r.class), stringQualifierNamed3, new h51.a(i16), kind4, j0Var7), module4));
                return Unit.INSTANCE;
            case 19:
                oi0.b bVar4 = (oi0.b) obj;
                bVar4.getClass();
                bVar4.V();
                return Unit.INSTANCE;
            case 20:
                oi0.b bVar5 = (oi0.b) obj;
                bVar5.getClass();
                bVar5.V();
                return Unit.INSTANCE;
            case 21:
                p0 p0Var = (p0) obj;
                p0Var.getClass();
                p0Var.f111829b = true;
                return Unit.INSTANCE;
            case 22:
                k0 k0Var4 = (k0) obj;
                h82.r rVar = h82.r.f82497a;
                k0Var4.getClass();
                h0.f(k0Var4);
                return Unit.INSTANCE;
            case 23:
                h82.r rVar2 = h82.r.f82497a;
                ((k0) obj).getClass();
                return Unit.INSTANCE;
            case 24:
                ha0.c cVar3 = ha0.c.f82622a;
                ((Context) obj).getClass();
                return "Mountain Bike";
            case 25:
                ha0.c cVar4 = ha0.c.f82622a;
                ((String) obj).getClass();
                return Unit.INSTANCE;
            case 26:
                ha0.c cVar5 = ha0.c.f82622a;
                ((zf2.d) obj).getClass();
                return Unit.INSTANCE;
            case 27:
                ha0.c cVar6 = ha0.c.f82622a;
                ((Context) obj).getClass();
                return "Timed Activity";
            case 28:
                ha0.c cVar7 = ha0.c.f82622a;
                ((Context) obj).getClass();
                return "Popular";
            default:
                ha0.c cVar8 = ha0.c.f82622a;
                ((Context) obj).getClass();
                return "Walking";
        }
    }
}
