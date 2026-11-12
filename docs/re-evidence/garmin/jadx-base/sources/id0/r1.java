package id0;

import com.garmin.android.apps.connectmobile.newsfeed.db.NewsFeedDatabase;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Kind;
import org.koin.core.definition.KoinDefinition;
import org.koin.core.instance.SingleInstanceFactory;
import org.koin.core.module.Module;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.registry.ScopeRegistry;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class r1 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f92904a;

    public /* synthetic */ r1(int i14) {
        this.f92904a = i14;
    }

    private final Object a(Object obj) {
        Module module = (Module) obj;
        f2 f2Var = f2.f92728a;
        module.getClass();
        e2 e2Var = new e2(1);
        ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
        StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
        Kind kind = Kind.Factory;
        p13.j0 j0Var = p13.j0.f134944a;
        p005kotlin.jvm.internal.t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
        new KoinDefinition(module, i3.e5.n(new BeanDefinition(rootScopeQualifier, t0Var.b(eg2.a.class), null, e2Var, kind, j0Var), module));
        t1 t1Var = new t1(23);
        StringQualifier rootScopeQualifier2 = companion.getRootScopeQualifier();
        Kind kind2 = Kind.Singleton;
        SingleInstanceFactory<?> singleInstanceFactoryP = lc.u0.p(new BeanDefinition(rootScopeQualifier2, t0Var.b(au0.s.class), null, t1Var, kind2, j0Var), module);
        if (module.get_createdAtStart()) {
            module.prepareForCreationAtStart(singleInstanceFactoryP);
        }
        new KoinDefinition(module, singleInstanceFactoryP);
        new KoinDefinition(module, i3.e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(tg2.a.class), null, new e2(3), kind, j0Var), module));
        new KoinDefinition(module, i3.e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(kg2.b.class), null, new e2(4), kind, j0Var), module));
        new KoinDefinition(module, i3.e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(fg2.y.class), null, new e2(5), kind, j0Var), module));
        SingleInstanceFactory<?> singleInstanceFactoryP2 = lc.u0.p(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(fg2.z.class), null, new e2(6), kind2, j0Var), module);
        if (module.get_createdAtStart()) {
            module.prepareForCreationAtStart(singleInstanceFactoryP2);
        }
        new KoinDefinition(module, singleInstanceFactoryP2);
        SingleInstanceFactory<?> singleInstanceFactoryP3 = lc.u0.p(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(fg2.c.class), null, new e2(7), kind2, j0Var), module);
        if (module.get_createdAtStart()) {
            module.prepareForCreationAtStart(singleInstanceFactoryP3);
        }
        new KoinDefinition(module, singleInstanceFactoryP3);
        SingleInstanceFactory<?> singleInstanceFactoryP4 = lc.u0.p(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(fg2.d.class), null, new e2(8), kind2, j0Var), module);
        if (module.get_createdAtStart()) {
            module.prepareForCreationAtStart(singleInstanceFactoryP4);
        }
        new KoinDefinition(module, singleInstanceFactoryP4);
        SingleInstanceFactory<?> singleInstanceFactoryP5 = lc.u0.p(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(mf2.e.class), null, new e2(9), kind2, j0Var), module);
        if (module.get_createdAtStart()) {
            module.prepareForCreationAtStart(singleInstanceFactoryP5);
        }
        new KoinDefinition(module, singleInstanceFactoryP5);
        SingleInstanceFactory<?> singleInstanceFactoryP6 = lc.u0.p(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(au0.z.class), null, new e2(10), kind2, j0Var), module);
        if (module.get_createdAtStart()) {
            module.prepareForCreationAtStart(singleInstanceFactoryP6);
        }
        new KoinDefinition(module, singleInstanceFactoryP6);
        SingleInstanceFactory<?> singleInstanceFactoryP7 = lc.u0.p(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(vf2.m.class), null, new e2(11), kind2, j0Var), module);
        if (module.get_createdAtStart()) {
            module.prepareForCreationAtStart(singleInstanceFactoryP7);
        }
        new KoinDefinition(module, singleInstanceFactoryP7);
        SingleInstanceFactory<?> singleInstanceFactoryP8 = lc.u0.p(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(com.garmin.android.apps.connectmobile.live.activity.i.class), null, new e2(12), kind2, j0Var), module);
        if (module.get_createdAtStart()) {
            module.prepareForCreationAtStart(singleInstanceFactoryP8);
        }
        new KoinDefinition(module, singleInstanceFactoryP8);
        new KoinDefinition(module, i3.e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(tf2.g.class), null, new e2(13), kind, j0Var), module));
        new KoinDefinition(module, i3.e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(ah2.g.class), null, new e2(14), kind, j0Var), module));
        new KoinDefinition(module, i3.e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(of2.y0.class), null, new e2(15), kind, j0Var), module));
        new KoinDefinition(module, i3.e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(tf2.i.class), null, new e2(16), kind, j0Var), module));
        new KoinDefinition(module, i3.e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(au0.x.class), null, new e2(17), kind, j0Var), module));
        new KoinDefinition(module, i3.e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(bu0.d.class), null, new e2(18), kind, j0Var), module));
        new KoinDefinition(module, i3.e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(bu0.b.class), null, new t1(21), kind, j0Var), module));
        new KoinDefinition(module, i3.e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(bu0.i.class), null, new t1(22), kind, j0Var), module));
        new KoinDefinition(module, i3.e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(bu0.j.class), null, new t1(24), kind, j0Var), module));
        new KoinDefinition(module, i3.e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(bu0.m.class), null, new t1(25), kind, j0Var), module));
        new KoinDefinition(module, i3.e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(bu0.a.class), null, new t1(26), kind, j0Var), module));
        new KoinDefinition(module, i3.e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(bu0.h.class), null, new t1(27), kind, j0Var), module));
        new KoinDefinition(module, i3.e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(bu0.n.class), null, new t1(28), kind, j0Var), module));
        new KoinDefinition(module, i3.e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(bu0.e.class), null, new t1(29), kind, j0Var), module));
        new KoinDefinition(module, i3.e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(com.garmin.android.apps.connectmobile.live.activity.h.class), null, new e2(0), kind, j0Var), module));
        new KoinDefinition(module, i3.e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(au0.q.class), null, new e2(2), kind, j0Var), module));
        return Unit.INSTANCE;
    }

    private final Object b(Object obj) {
        Module module = (Module) obj;
        u2 u2Var = u2.f92944a;
        module.getClass();
        p2 p2Var = new p2(13);
        ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
        StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
        Kind kind = Kind.Factory;
        p13.j0 j0Var = p13.j0.f134944a;
        p005kotlin.jvm.internal.t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
        new KoinDefinition(module, i3.e5.n(new BeanDefinition(rootScopeQualifier, t0Var.b(uy0.j1.class), null, p2Var, kind, j0Var), module));
        int i14 = 5;
        new KoinDefinition(module, i3.e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(uy0.j.class), null, new p2(i14), kind, j0Var), module));
        new KoinDefinition(module, i3.e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(uy0.y.class), null, new p2(17), kind, j0Var), module));
        new KoinDefinition(module, i3.e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(uy0.d.class), null, new p2(22), kind, j0Var), module));
        new KoinDefinition(module, i3.e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(uy0.f.class), null, new p2(23), kind, j0Var), module));
        new KoinDefinition(module, i3.e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(uy0.s.class), null, new p2(25), kind, j0Var), module));
        new KoinDefinition(module, i3.e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(uy0.j0.class), null, new p2(26), kind, j0Var), module));
        new KoinDefinition(module, i3.e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(uy0.k0.class), null, new p2(27), kind, j0Var), module));
        new KoinDefinition(module, i3.e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(uy0.q0.class), null, new p2(28), kind, j0Var), module));
        new KoinDefinition(module, i3.e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(uy0.c1.class), null, new p2(29), kind, j0Var), module));
        new KoinDefinition(module, i3.e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(uy0.o.class), null, new p2(24), kind, j0Var), module));
        new KoinDefinition(module, i3.e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(uy0.z.class), null, new t2(0), kind, j0Var), module));
        new KoinDefinition(module, i3.e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(uy0.v0.class), null, new t2(1), kind, j0Var), module));
        new KoinDefinition(module, i3.e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(uy0.g.class), null, new t2(2), kind, j0Var), module));
        int i15 = 3;
        new KoinDefinition(module, i3.e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(uy0.t.class), null, new t2(i15), kind, j0Var), module));
        int i16 = 4;
        new KoinDefinition(module, i3.e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(uy0.l.class), null, new t2(i16), kind, j0Var), module));
        new KoinDefinition(module, i3.e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(uy0.q.class), null, new t2(i14), kind, j0Var), module));
        int i17 = 6;
        new KoinDefinition(module, i3.e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(uy0.h0.class), null, new t2(i17), kind, j0Var), module));
        new KoinDefinition(module, i3.e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(uy0.m0.class), null, new p2(i15), kind, j0Var), module));
        new KoinDefinition(module, i3.e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(uy0.v.class), null, new p2(i16), kind, j0Var), module));
        new KoinDefinition(module, i3.e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(uy0.f1.class), null, new p2(i17), kind, j0Var), module));
        new KoinDefinition(module, i3.e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(uy0.b0.class), null, new p2(7), kind, j0Var), module));
        new KoinDefinition(module, i3.e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(uy0.l0.class), null, new p2(8), kind, j0Var), module));
        new KoinDefinition(module, i3.e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(uy0.i.class), null, new p2(9), kind, j0Var), module));
        new KoinDefinition(module, i3.e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(uy0.u0.class), null, new p2(10), kind, j0Var), module));
        new KoinDefinition(module, i3.e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(uy0.g1.class), null, new p2(11), kind, j0Var), module));
        new KoinDefinition(module, i3.e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(uy0.i1.class), null, new p2(12), kind, j0Var), module));
        new KoinDefinition(module, i3.e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(uy0.b.class), null, new p2(14), kind, j0Var), module));
        new KoinDefinition(module, i3.e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(vy0.r.class), null, new p2(15), kind, j0Var), module));
        new KoinDefinition(module, i3.e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(uy0.a.class), null, new p2(16), kind, j0Var), module));
        new KoinDefinition(module, i3.e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(uy0.h1.class), null, new p2(18), kind, j0Var), module));
        new KoinDefinition(module, i3.e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(vy0.a0.class), null, new p2(19), kind, j0Var), module));
        new KoinDefinition(module, i3.e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(vy0.n.class), null, new p2(20), kind, j0Var), module));
        new KoinDefinition(module, i3.e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(xy0.c.class), null, new p2(21), kind, j0Var), module));
        return Unit.INSTANCE;
    }

    private final Object c(Object obj) {
        Module module = (Module) obj;
        x2 x2Var = x2.f92984a;
        module.getClass();
        t2 t2Var = new t2(12);
        ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
        StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
        Kind kind = Kind.Factory;
        p13.j0 j0Var = p13.j0.f134944a;
        p005kotlin.jvm.internal.t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
        new KoinDefinition(module, i3.e5.n(new BeanDefinition(rootScopeQualifier, t0Var.b(iz0.a.class), null, t2Var, kind, j0Var), module));
        new KoinDefinition(module, i3.e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(vg0.a.class), null, new t2(13), kind, j0Var), module));
        y2.f92996a.getClass();
        module.includes(y2.f92997b);
        z0.f93004a.getClass();
        module.includes(z0.f93005b);
        t2 t2Var2 = new t2(14);
        SingleInstanceFactory<?> singleInstanceFactoryP = lc.u0.p(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(NewsFeedDatabase.class), null, t2Var2, Kind.Singleton, j0Var), module);
        if (module.get_createdAtStart()) {
            module.prepareForCreationAtStart(singleInstanceFactoryP);
        }
        new KoinDefinition(module, singleInstanceFactoryP);
        new KoinDefinition(module, i3.e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(pz0.c.class), null, new t2(15), kind, j0Var), module));
        new KoinDefinition(module, i3.e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(hz0.m.class), null, new t2(16), kind, j0Var), module));
        return Unit.INSTANCE;
    }

    private final Object d(Object obj) {
        Module module = (Module) obj;
        z2 z2Var = z2.f93008a;
        module.getClass();
        t2 t2Var = new t2(18);
        ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
        StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
        Kind kind = Kind.Factory;
        p13.j0 j0Var = p13.j0.f134944a;
        p005kotlin.jvm.internal.t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
        new KoinDefinition(module, i3.e5.n(new BeanDefinition(rootScopeQualifier, t0Var.b(tz0.a.class), null, t2Var, kind, j0Var), module));
        new KoinDefinition(module, i3.e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(sz0.n.class), null, new t2(19), kind, j0Var), module));
        t2 t2Var2 = new t2(20);
        SingleInstanceFactory<?> singleInstanceFactoryP = lc.u0.p(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(n00.e.class), null, t2Var2, Kind.Singleton, j0Var), module);
        if (module.get_createdAtStart()) {
            module.prepareForCreationAtStart(singleInstanceFactoryP);
        }
        new KoinDefinition(module, singleInstanceFactoryP);
        return Unit.INSTANCE;
    }

    private final Object e(Object obj) {
        Module module = (Module) obj;
        a3 a3Var = a3.f92660a;
        module.getClass();
        t2 t2Var = new t2(21);
        new KoinDefinition(module, i3.e5.n(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), p005kotlin.jvm.internal.s0.f105811a.b(dj1.a.class), null, t2Var, Kind.Factory, p13.j0.f134944a), module));
        return Unit.INSTANCE;
    }

    private final Object f(Object obj) {
        Module module = (Module) obj;
        b3 b3Var = b3.f92673a;
        module.getClass();
        t2 t2Var = new t2(22);
        new KoinDefinition(module, i3.e5.n(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), p005kotlin.jvm.internal.s0.f105811a.b(p01.a.class), null, t2Var, Kind.Factory, p13.j0.f134944a), module));
        o01.f.f128489a.getClass();
        module.includes(o01.f.f128490b);
        return Unit.INSTANCE;
    }

    private final Object g(Object obj) {
        Module module = (Module) obj;
        c3 c3Var = c3.f92688a;
        module.getClass();
        t2 t2Var = new t2(23);
        ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
        StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
        Kind kind = Kind.Singleton;
        p13.j0 j0Var = p13.j0.f134944a;
        p005kotlin.jvm.internal.t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
        SingleInstanceFactory<?> singleInstanceFactoryP = lc.u0.p(new BeanDefinition(rootScopeQualifier, t0Var.b(c22.x.class), null, t2Var, kind, j0Var), module);
        if (module.get_createdAtStart()) {
            module.prepareForCreationAtStart(singleInstanceFactoryP);
        }
        new KoinDefinition(module, singleInstanceFactoryP);
        SingleInstanceFactory<?> singleInstanceFactoryP2 = lc.u0.p(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(i42.h.class), null, new t2(24), kind, j0Var), module);
        if (module.get_createdAtStart()) {
            module.prepareForCreationAtStart(singleInstanceFactoryP2);
        }
        new KoinDefinition(module, singleInstanceFactoryP2);
        t2 t2Var2 = new t2(25);
        StringQualifier rootScopeQualifier2 = companion.getRootScopeQualifier();
        Kind kind2 = Kind.Factory;
        new KoinDefinition(module, i3.e5.n(new BeanDefinition(rootScopeQualifier2, t0Var.b(i42.l.class), null, t2Var2, kind2, j0Var), module));
        SingleInstanceFactory<?> singleInstanceFactoryP3 = lc.u0.p(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(c22.d2.class), null, new t2(26), kind, j0Var), module);
        if (module.get_createdAtStart()) {
            module.prepareForCreationAtStart(singleInstanceFactoryP3);
        }
        new KoinDefinition(module, singleInstanceFactoryP3);
        new KoinDefinition(module, i3.e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(fq1.q.class), null, new t2(27), kind2, j0Var), module));
        return Unit.INSTANCE;
    }

    private final Object h(Object obj) {
        Module module = (Module) obj;
        e3 e3Var = e3.f92716a;
        module.getClass();
        t2 t2Var = new t2(28);
        ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
        StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
        Kind kind = Kind.Factory;
        p13.j0 j0Var = p13.j0.f134944a;
        p005kotlin.jvm.internal.t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
        new KoinDefinition(module, i3.e5.n(new BeanDefinition(rootScopeQualifier, t0Var.b(h31.b.class), null, t2Var, kind, j0Var), module));
        new KoinDefinition(module, i3.e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(r70.w.class), null, new t2(29), kind, j0Var), module));
        new KoinDefinition(module, i3.e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(n31.a.class), null, new d3(0), kind, j0Var), module));
        g3.f92767a.getClass();
        Module module2 = g3.f92768b;
        h31.c.f81292a.getClass();
        module.includes(module2, h31.c.f81293b);
        return Unit.INSTANCE;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = 22;
        int i15 = 21;
        int i16 = 18;
        int i17 = 15;
        int i18 = 3;
        int i19 = 20;
        int i24 = 19;
        int i25 = 17;
        int i26 = 9;
        int i27 = 27;
        int i28 = 11;
        switch (this.f92904a) {
            case 0:
                Module module = (Module) obj;
                s1 s1Var = s1.f92917a;
                module.getClass();
                a1 a1Var = new a1(i27);
                ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
                Kind kind = Kind.Factory;
                p13.j0 j0Var = p13.j0.f134944a;
                p005kotlin.jvm.internal.t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
                new KoinDefinition(module, i3.e5.n(new BeanDefinition(rootScopeQualifier, t0Var.b(bv.f.class), null, a1Var, kind, j0Var), module));
                new KoinDefinition(module, i3.e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(ro0.x.class), null, new a1(28), kind, j0Var), module));
                new KoinDefinition(module, i3.e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(ro0.q.class), null, new a1(29), kind, j0Var), module));
                return Unit.INSTANCE;
            case 1:
                Module module2 = (Module) obj;
                u1 u1Var = u1.f92942a;
                module2.getClass();
                t1 t1Var = new t1(0);
                new KoinDefinition(module2, i3.e5.n(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), p005kotlin.jvm.internal.s0.f105811a.b(mp0.a.class), null, t1Var, Kind.Factory, p13.j0.f134944a), module2));
                return Unit.INSTANCE;
            case 2:
                Module module3 = (Module) obj;
                v1 v1Var = v1.f92954a;
                module3.getClass();
                t1 t1Var2 = new t1(1);
                ScopeRegistry.Companion companion2 = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier2 = companion2.getRootScopeQualifier();
                Kind kind2 = Kind.Factory;
                p13.j0 j0Var2 = p13.j0.f134944a;
                p005kotlin.jvm.internal.t0 t0Var2 = p005kotlin.jvm.internal.s0.f105811a;
                new KoinDefinition(module3, i3.e5.n(new BeanDefinition(rootScopeQualifier2, t0Var2.b(pc0.n0.class), null, t1Var2, kind2, j0Var2), module3));
                new KoinDefinition(module3, i3.e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(m90.a.class), null, new t1(2), kind2, j0Var2), module3));
                new KoinDefinition(module3, i3.e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(ri1.s.class), null, new t1(i18), kind2, j0Var2), module3));
                new KoinDefinition(module3, i3.e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(ri1.p.class), null, new t1(4), kind2, j0Var2), module3));
                new KoinDefinition(module3, i3.e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(wa0.c.class), null, new t1(5), kind2, j0Var2), module3));
                return Unit.INSTANCE;
            case 3:
                Module module4 = (Module) obj;
                w1 w1Var = w1.f92970a;
                module4.getClass();
                t1 t1Var3 = new t1(6);
                new KoinDefinition(module4, i3.e5.n(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), p005kotlin.jvm.internal.s0.f105811a.b(cq0.j.class), null, t1Var3, Kind.Factory, p13.j0.f134944a), module4));
                return Unit.INSTANCE;
            case 4:
                Module module5 = (Module) obj;
                x1 x1Var = x1.f92982a;
                module5.getClass();
                t1 t1Var4 = new t1(7);
                ScopeRegistry.Companion companion3 = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier3 = companion3.getRootScopeQualifier();
                Kind kind3 = Kind.Factory;
                p13.j0 j0Var3 = p13.j0.f134944a;
                p005kotlin.jvm.internal.t0 t0Var3 = p005kotlin.jvm.internal.s0.f105811a;
                new KoinDefinition(module5, i3.e5.n(new BeanDefinition(rootScopeQualifier3, t0Var3.b(er0.a.class), null, t1Var4, kind3, j0Var3), module5));
                new KoinDefinition(module5, i3.e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(cr0.c.class), null, new t1(8), kind3, j0Var3), module5));
                t1 t1Var5 = new t1(i26);
                StringQualifier rootScopeQualifier4 = companion3.getRootScopeQualifier();
                Kind kind4 = Kind.Singleton;
                SingleInstanceFactory<?> singleInstanceFactoryP = lc.u0.p(new BeanDefinition(rootScopeQualifier4, t0Var3.b(dr0.a.class), null, t1Var5, kind4, j0Var3), module5);
                if (module5.get_createdAtStart()) {
                    module5.prepareForCreationAtStart(singleInstanceFactoryP);
                }
                new KoinDefinition(module5, singleInstanceFactoryP);
                new KoinDefinition(module5, i3.e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(cr0.b.class), null, new t1(10), kind3, j0Var3), module5));
                SingleInstanceFactory<?> singleInstanceFactoryP2 = lc.u0.p(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(cr0.i.class), null, new t1(11), kind4, j0Var3), module5);
                if (module5.get_createdAtStart()) {
                    module5.prepareForCreationAtStart(singleInstanceFactoryP2);
                }
                new KoinDefinition(module5, singleInstanceFactoryP2);
                new KoinDefinition(module5, i3.e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(cr0.j.class), null, new t1(12), kind3, j0Var3), module5));
                return Unit.INSTANCE;
            case 5:
                Module module6 = (Module) obj;
                y1 y1Var = y1.f92994a;
                module6.getClass();
                t1 t1Var6 = new t1(13);
                new KoinDefinition(module6, i3.e5.n(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), p005kotlin.jvm.internal.s0.f105811a.b(lr0.a.class), null, t1Var6, Kind.Factory, p13.j0.f134944a), module6));
                kr0.b.f106225a.getClass();
                module6.includes(kr0.b.f106226b);
                return Unit.INSTANCE;
            case 6:
                Module module7 = (Module) obj;
                z1 z1Var = z1.f93006a;
                module7.getClass();
                t1 t1Var7 = new t1(14);
                new KoinDefinition(module7, i3.e5.n(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), p005kotlin.jvm.internal.s0.f105811a.b(bs0.a.class), null, t1Var7, Kind.Factory, p13.j0.f134944a), module7));
                as0.c.f12680a.getClass();
                module7.includes(as0.c.f12681b);
                return Unit.INSTANCE;
            case 7:
                Module module8 = (Module) obj;
                a2 a2Var = a2.f92658a;
                module8.getClass();
                t1 t1Var8 = new t1(i17);
                new KoinDefinition(module8, i3.e5.n(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), p005kotlin.jvm.internal.s0.f105811a.b(vi1.a.class), null, t1Var8, Kind.Factory, p13.j0.f134944a), module8));
                return Unit.INSTANCE;
            case 8:
                Module module9 = (Module) obj;
                b2 b2Var = b2.f92671a;
                module9.getClass();
                t1 t1Var9 = new t1(16);
                ScopeRegistry.Companion companion4 = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier5 = companion4.getRootScopeQualifier();
                Kind kind5 = Kind.Factory;
                p13.j0 j0Var4 = p13.j0.f134944a;
                p005kotlin.jvm.internal.t0 t0Var4 = p005kotlin.jvm.internal.s0.f105811a;
                new KoinDefinition(module9, i3.e5.n(new BeanDefinition(rootScopeQualifier5, t0Var4.b(us0.a.class), null, t1Var9, kind5, j0Var4), module9));
                new KoinDefinition(module9, i3.e5.n(new BeanDefinition(companion4.getRootScopeQualifier(), t0Var4.b(ws0.a.class), null, new t1(i25), kind5, j0Var4), module9));
                new KoinDefinition(module9, i3.e5.n(new BeanDefinition(companion4.getRootScopeQualifier(), t0Var4.b(jt0.a.class), null, new t1(i16), kind5, j0Var4), module9));
                return Unit.INSTANCE;
            case 9:
                Module module10 = (Module) obj;
                c2 c2Var = c2.f92686a;
                module10.getClass();
                t1 t1Var10 = new t1(i24);
                SingleInstanceFactory<?> singleInstanceFactoryP3 = lc.u0.p(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.n2.class), null, t1Var10, Kind.Singleton, p13.j0.f134944a), module10);
                if (module10.get_createdAtStart()) {
                    module10.prepareForCreationAtStart(singleInstanceFactoryP3);
                }
                new KoinDefinition(module10, singleInstanceFactoryP3);
                return Unit.INSTANCE;
            case 10:
                Module module11 = (Module) obj;
                d2 d2Var = d2.f92703a;
                module11.getClass();
                t1 t1Var11 = new t1(i19);
                new KoinDefinition(module11, i3.e5.n(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), p005kotlin.jvm.internal.s0.f105811a.b(tv0.d.class), null, t1Var11, Kind.Factory, p13.j0.f134944a), module11));
                sv0.c.f161028a.getClass();
                module11.includes(sv0.c.f161029b);
                return Unit.INSTANCE;
            case 11:
                return a(obj);
            case 12:
                Module module12 = (Module) obj;
                l2 l2Var = l2.f92833a;
                module12.getClass();
                f2.f92728a.getClass();
                Module module13 = f2.f92729b;
                wf2.c.f185026a.getClass();
                module12.includes(module13, wf2.c.f185029d);
                return Unit.INSTANCE;
            case 13:
                Module module14 = (Module) obj;
                m2 m2Var = m2.f92844a;
                module14.getClass();
                e2 e2Var = new e2(i24);
                ScopeRegistry.Companion companion5 = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier6 = companion5.getRootScopeQualifier();
                Kind kind6 = Kind.Factory;
                p13.j0 j0Var5 = p13.j0.f134944a;
                p005kotlin.jvm.internal.t0 t0Var5 = p005kotlin.jvm.internal.s0.f105811a;
                new KoinDefinition(module14, i3.e5.n(new BeanDefinition(rootScopeQualifier6, t0Var5.b(f20.e0.class), null, e2Var, kind6, j0Var5), module14));
                new KoinDefinition(module14, i3.e5.n(new BeanDefinition(companion5.getRootScopeQualifier(), t0Var5.b(cu0.i.class), null, new e2(i19), kind6, j0Var5), module14));
                return Unit.INSTANCE;
            case 14:
                Module module15 = (Module) obj;
                n2 n2Var = n2.f92856a;
                module15.getClass();
                e2 e2Var2 = new e2(i15);
                ScopeRegistry.Companion companion6 = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier7 = companion6.getRootScopeQualifier();
                Kind kind7 = Kind.Factory;
                p13.j0 j0Var6 = p13.j0.f134944a;
                p005kotlin.jvm.internal.t0 t0Var6 = p005kotlin.jvm.internal.s0.f105811a;
                new KoinDefinition(module15, i3.e5.n(new BeanDefinition(rootScopeQualifier7, t0Var6.b(wd2.l.class), null, e2Var2, kind7, j0Var6), module15));
                new KoinDefinition(module15, i3.e5.n(new BeanDefinition(companion6.getRootScopeQualifier(), t0Var6.b(uu0.a.class), null, new e2(i14), kind7, j0Var6), module15));
                new KoinDefinition(module15, i3.e5.n(new BeanDefinition(companion6.getRootScopeQualifier(), t0Var6.b(uu0.c.class), null, new e2(23), kind7, j0Var6), module15));
                cw.v.f55954b.getClass();
                cw.v vVarA = cw.v.a.a();
                if (vVarA != null) {
                    new KoinDefinition(module15, i3.e5.n(new BeanDefinition(companion6.getRootScopeQualifier(), t0Var6.b(cw.v.class), null, new fp0.l(vVarA, i27), kind7, j0Var6), module15));
                }
                tu0.a.f166470a.getClass();
                module15.includes(tu0.a.f166471b);
                new KoinDefinition(module15, i3.e5.n(new BeanDefinition(companion6.getRootScopeQualifier(), t0Var6.b(com.garmin.android.library.livetrack.b.class), null, new e2(24), kind7, j0Var6), module15));
                return Unit.INSTANCE;
            case 15:
                Module module16 = (Module) obj;
                o2 o2Var = o2.f92870a;
                module16.getClass();
                e2 e2Var3 = new e2(25);
                ScopeRegistry.Companion companion7 = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier8 = companion7.getRootScopeQualifier();
                Kind kind8 = Kind.Singleton;
                p13.j0 j0Var7 = p13.j0.f134944a;
                p005kotlin.jvm.internal.t0 t0Var7 = p005kotlin.jvm.internal.s0.f105811a;
                SingleInstanceFactory<?> singleInstanceFactoryP4 = lc.u0.p(new BeanDefinition(rootScopeQualifier8, t0Var7.b(c22.s1.class), null, e2Var3, kind8, j0Var7), module16);
                if (module16.get_createdAtStart()) {
                    module16.prepareForCreationAtStart(singleInstanceFactoryP4);
                }
                new KoinDefinition(module16, singleInstanceFactoryP4);
                e2 e2Var4 = new e2(26);
                StringQualifier rootScopeQualifier9 = companion7.getRootScopeQualifier();
                Kind kind9 = Kind.Factory;
                new KoinDefinition(module16, i3.e5.n(new BeanDefinition(rootScopeQualifier9, t0Var7.b(oi1.f.class), null, e2Var4, kind9, j0Var7), module16));
                new KoinDefinition(module16, i3.e5.n(new BeanDefinition(companion7.getRootScopeQualifier(), t0Var7.b(oi1.e.class), null, new e2(i27), kind9, j0Var7), module16));
                new KoinDefinition(module16, i3.e5.n(new BeanDefinition(companion7.getRootScopeQualifier(), t0Var7.b(String[].class), QualifierKt.named("gcSupportedLanguages"), new e2(28), kind9, j0Var7), module16));
                return Unit.INSTANCE;
            case 16:
                Module module17 = (Module) obj;
                q2 q2Var = q2.f92893a;
                module17.getClass();
                e2 e2Var5 = new e2(29);
                ScopeRegistry.Companion companion8 = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier10 = companion8.getRootScopeQualifier();
                Kind kind10 = Kind.Factory;
                p13.j0 j0Var8 = p13.j0.f134944a;
                p005kotlin.jvm.internal.t0 t0Var8 = p005kotlin.jvm.internal.s0.f105811a;
                new KoinDefinition(module17, i3.e5.n(new BeanDefinition(rootScopeQualifier10, t0Var8.b(mv0.e.class), null, e2Var5, kind10, j0Var8), module17));
                new KoinDefinition(module17, i3.e5.n(new BeanDefinition(companion8.getRootScopeQualifier(), t0Var8.b(mv0.g.class), null, new p2(0), kind10, j0Var8), module17));
                return Unit.INSTANCE;
            case 17:
                Module module18 = (Module) obj;
                r2 r2Var = r2.f92905a;
                module18.getClass();
                p2 p2Var = new p2(1);
                SingleInstanceFactory<?> singleInstanceFactoryP5 = lc.u0.p(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), p005kotlin.jvm.internal.s0.f105811a.b(qw0.s.class), null, p2Var, Kind.Singleton, p13.j0.f134944a), module18);
                if (module18.get_createdAtStart()) {
                    module18.prepareForCreationAtStart(singleInstanceFactoryP5);
                }
                new KoinDefinition(module18, singleInstanceFactoryP5);
                return Unit.INSTANCE;
            case 18:
                Module module19 = (Module) obj;
                s2 s2Var = s2.f92919a;
                module19.getClass();
                p2 p2Var2 = new p2(2);
                new KoinDefinition(module19, i3.e5.n(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), p005kotlin.jvm.internal.s0.f105811a.b(ax0.a.class), null, p2Var2, Kind.Factory, p13.j0.f134944a), module19));
                zw0.a.f207201a.getClass();
                module19.includes(zw0.a.f207202b);
                return Unit.INSTANCE;
            case 19:
                return b(obj);
            case 20:
                Module module20 = (Module) obj;
                v2 v2Var = v2.f92956a;
                module20.getClass();
                t2 t2Var = new t2(7);
                ScopeRegistry.Companion companion9 = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier11 = companion9.getRootScopeQualifier();
                Kind kind11 = Kind.Factory;
                p13.j0 j0Var9 = p13.j0.f134944a;
                p005kotlin.jvm.internal.t0 t0Var9 = p005kotlin.jvm.internal.s0.f105811a;
                new KoinDefinition(module20, i3.e5.n(new BeanDefinition(rootScopeQualifier11, t0Var9.b(zx0.k.class), null, t2Var, kind11, j0Var9), module20));
                new KoinDefinition(module20, i3.e5.n(new BeanDefinition(companion9.getRootScopeQualifier(), t0Var9.b(zx0.j.class), null, new t2(8), kind11, j0Var9), module20));
                return Unit.INSTANCE;
            case 21:
                Module module21 = (Module) obj;
                w2 w2Var = w2.f92972a;
                module21.getClass();
                t2 t2Var2 = new t2(i26);
                ScopeRegistry.Companion companion10 = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier12 = companion10.getRootScopeQualifier();
                Kind kind12 = Kind.Factory;
                p13.j0 j0Var10 = p13.j0.f134944a;
                p005kotlin.jvm.internal.t0 t0Var10 = p005kotlin.jvm.internal.s0.f105811a;
                new KoinDefinition(module21, i3.e5.n(new BeanDefinition(rootScopeQualifier12, t0Var10.b(fy0.a.class), null, t2Var2, kind12, j0Var10), module21));
                new KoinDefinition(module21, i3.e5.n(new BeanDefinition(companion10.getRootScopeQualifier(), t0Var10.b(fy0.e.class), null, new t2(10), kind12, j0Var10), module21));
                new KoinDefinition(module21, i3.e5.n(new BeanDefinition(companion10.getRootScopeQualifier(), t0Var10.b(hy0.a.class), null, new t2(11), kind12, j0Var10), module21));
                fy0.d.f73881a.getClass();
                module21.includes(fy0.d.f73882b);
                return Unit.INSTANCE;
            case 22:
                return c(obj);
            case 23:
                Module module22 = (Module) obj;
                y2 y2Var = y2.f92996a;
                module22.getClass();
                t2 t2Var3 = new t2(i25);
                new KoinDefinition(module22, i3.e5.n(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), p005kotlin.jvm.internal.s0.f105811a.b(ee0.a.class), null, t2Var3, Kind.Factory, p13.j0.f134944a), module22));
                return Unit.INSTANCE;
            case 24:
                return d(obj);
            case 25:
                return e(obj);
            case 26:
                return f(obj);
            case 27:
                return g(obj);
            case 28:
                return h(obj);
            default:
                Module module23 = (Module) obj;
                g3 g3Var = g3.f92767a;
                module23.getClass();
                d3 d3Var = new d3(i28);
                ScopeRegistry.Companion companion11 = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier13 = companion11.getRootScopeQualifier();
                Kind kind13 = Kind.Factory;
                p13.j0 j0Var11 = p13.j0.f134944a;
                p005kotlin.jvm.internal.t0 t0Var11 = p005kotlin.jvm.internal.s0.f105811a;
                new KoinDefinition(module23, i3.e5.n(new BeanDefinition(rootScopeQualifier13, t0Var11.b(a31.e.class), null, d3Var, kind13, j0Var11), module23));
                new KoinDefinition(module23, i3.e5.n(new BeanDefinition(companion11.getRootScopeQualifier(), t0Var11.b(j31.z0.class), QualifierKt.named(d31.d.AB_QUANTUM), new d3(i18), kind13, j0Var11), module23));
                new KoinDefinition(module23, i3.e5.n(new BeanDefinition(companion11.getRootScopeQualifier(), t0Var11.b(j31.z0.class), QualifierKt.named(d31.d.AB_SYNAPSE), new d3(i17), kind13, j0Var11), module23));
                new KoinDefinition(module23, i3.e5.n(new BeanDefinition(companion11.getRootScopeQualifier(), t0Var11.b(j31.z0.class), QualifierKt.named(d31.d.ACTIVATE_LTE_SERVICE), new d3(i27), kind13, j0Var11), module23));
                new KoinDefinition(module23, i3.e5.n(new BeanDefinition(companion11.getRootScopeQualifier(), t0Var11.b(j31.z0.class), QualifierKt.named(d31.d.ALARM), new f3(i26), kind13, j0Var11), module23));
                new KoinDefinition(module23, i3.e5.n(new BeanDefinition(companion11.getRootScopeQualifier(), t0Var11.b(j31.z0.class), QualifierKt.named(d31.d.AUTO_ACTIVITY_START), new f3(i25), kind13, j0Var11), module23));
                new KoinDefinition(module23, i3.e5.n(new BeanDefinition(companion11.getRootScopeQualifier(), t0Var11.b(j31.z0.class), QualifierKt.named(d31.d.BIKE_ALARM), new f3(i16), kind13, j0Var11), module23));
                new KoinDefinition(module23, i3.e5.n(new BeanDefinition(companion11.getRootScopeQualifier(), t0Var11.b(j31.z0.class), QualifierKt.named(d31.d.BPM_REMINDERS), new f3(i24), kind13, j0Var11), module23));
                new KoinDefinition(module23, i3.e5.n(new BeanDefinition(companion11.getRootScopeQualifier(), t0Var11.b(j31.z0.class), QualifierKt.named(d31.d.CIQ_APPS), new f3(i19), kind13, j0Var11), module23));
                new KoinDefinition(module23, i3.e5.n(new BeanDefinition(companion11.getRootScopeQualifier(), t0Var11.b(j31.z0.class), QualifierKt.named(d31.d.CONNECTIONS), new f3(i15), kind13, j0Var11), module23));
                new KoinDefinition(module23, i3.e5.n(new BeanDefinition(companion11.getRootScopeQualifier(), t0Var11.b(j31.z0.class), QualifierKt.named(d31.d.CONTACTS), new d3(i14), kind13, j0Var11), module23));
                new KoinDefinition(module23, i3.e5.n(new BeanDefinition(companion11.getRootScopeQualifier(), t0Var11.b(j31.z0.class), QualifierKt.named(d31.d.CREATE_COURSE), new f3(i18), kind13, j0Var11), module23));
                new KoinDefinition(module23, i3.e5.n(new BeanDefinition(companion11.getRootScopeQualifier(), t0Var11.b(j31.z0.class), QualifierKt.named(d31.d.DEZL_APP), new f3(14), kind13, j0Var11), module23));
                new KoinDefinition(module23, i3.e5.n(new BeanDefinition(companion11.getRootScopeQualifier(), t0Var11.b(j31.z0.class), QualifierKt.named(d31.d.DEVICE_DISPLAY_NAME), new f3(i14), kind13, j0Var11), module23));
                new KoinDefinition(module23, i3.e5.n(new BeanDefinition(companion11.getRootScopeQualifier(), t0Var11.b(j31.z0.class), QualifierKt.named(d31.d.DEVICE_WELCOME), new f3(23), kind13, j0Var11), module23));
                new KoinDefinition(module23, i3.e5.n(new BeanDefinition(companion11.getRootScopeQualifier(), t0Var11.b(j31.z0.class), QualifierKt.named(d31.d.ECG), new f3(24), kind13, j0Var11), module23));
                new KoinDefinition(module23, i3.e5.n(new BeanDefinition(companion11.getRootScopeQualifier(), t0Var11.b(j31.z0.class), QualifierKt.named(d31.d.GARMIN_COACH), new f3(25), kind13, j0Var11), module23));
                new KoinDefinition(module23, i3.e5.n(new BeanDefinition(companion11.getRootScopeQualifier(), t0Var11.b(j31.z0.class), QualifierKt.named(d31.d.GARMIN_DIVE), new f3(26), kind13, j0Var11), module23));
                new KoinDefinition(module23, i3.e5.n(new BeanDefinition(companion11.getRootScopeQualifier(), t0Var11.b(j31.z0.class), QualifierKt.named(d31.d.GARMIN_MESSENGER), new d3(1), kind13, j0Var11), module23));
                new KoinDefinition(module23, i3.e5.n(new BeanDefinition(companion11.getRootScopeQualifier(), t0Var11.b(j31.z0.class), QualifierKt.named(d31.d.GARMIN_PAY), new d3(2), kind13, j0Var11), module23));
                new KoinDefinition(module23, i3.e5.n(new BeanDefinition(companion11.getRootScopeQualifier(), t0Var11.b(j31.z0.class), QualifierKt.named(d31.d.GARMIN_PILOT), new d3(4), kind13, j0Var11), module23));
                new KoinDefinition(module23, i3.e5.n(new BeanDefinition(companion11.getRootScopeQualifier(), t0Var11.b(j31.z0.class), QualifierKt.named(d31.d.GROUP_OVERHAUL_NO_GROUP), new d3(5), kind13, j0Var11), module23));
                new KoinDefinition(module23, i3.e5.n(new BeanDefinition(companion11.getRootScopeQualifier(), t0Var11.b(j31.z0.class), QualifierKt.named(d31.d.GROUP_RIDE), new d3(6), kind13, j0Var11), module23));
                new KoinDefinition(module23, i3.e5.n(new BeanDefinition(companion11.getRootScopeQualifier(), t0Var11.b(j31.z0.class), QualifierKt.named(d31.d.HEART_RATE_ZONES), new d3(7), kind13, j0Var11), module23));
                new KoinDefinition(module23, i3.e5.n(new BeanDefinition(companion11.getRootScopeQualifier(), t0Var11.b(j31.z0.class), QualifierKt.named(d31.d.INCIDENT_DETECTION), new d3(8), kind13, j0Var11), module23));
                new KoinDefinition(module23, i3.e5.n(new BeanDefinition(companion11.getRootScopeQualifier(), t0Var11.b(j31.z0.class), QualifierKt.named(d31.d.INDEX_SCALE_CONNECTIONS), new d3(i26), kind13, j0Var11), module23));
                new KoinDefinition(module23, i3.e5.n(new BeanDefinition(companion11.getRootScopeQualifier(), t0Var11.b(j31.z0.class), QualifierKt.named(d31.d.INTELLIGENT_TRAINING_PLAN), new d3(10), kind13, j0Var11), module23));
                new KoinDefinition(module23, i3.e5.n(new BeanDefinition(companion11.getRootScopeQualifier(), t0Var11.b(j31.z0.class), QualifierKt.named(d31.d.JET_LAG), new d3(12), kind13, j0Var11), module23));
                new KoinDefinition(module23, i3.e5.n(new BeanDefinition(companion11.getRootScopeQualifier(), t0Var11.b(j31.z0.class), QualifierKt.named(d31.d.KOMOOT), new d3(13), kind13, j0Var11), module23));
                new KoinDefinition(module23, i3.e5.n(new BeanDefinition(companion11.getRootScopeQualifier(), t0Var11.b(j31.z0.class), QualifierKt.named(d31.d.LIFESTYLE_LOGGING), new d3(14), kind13, j0Var11), module23));
                new KoinDefinition(module23, i3.e5.n(new BeanDefinition(companion11.getRootScopeQualifier(), t0Var11.b(j31.z0.class), QualifierKt.named(d31.d.LIVE_TRACK), new d3(16), kind13, j0Var11), module23));
                new KoinDefinition(module23, i3.e5.n(new BeanDefinition(companion11.getRootScopeQualifier(), t0Var11.b(j31.z0.class), QualifierKt.named(d31.d.PRECISE_LOCATION_ACCESS), new d3(i25), kind13, j0Var11), module23));
                new KoinDefinition(module23, i3.e5.n(new BeanDefinition(companion11.getRootScopeQualifier(), t0Var11.b(j31.z0.class), QualifierKt.named(d31.d.LTE), new d3(i16), kind13, j0Var11), module23));
                new KoinDefinition(module23, i3.e5.n(new BeanDefinition(companion11.getRootScopeQualifier(), t0Var11.b(j31.z0.class), QualifierKt.named(d31.d.LTE_GENERIC), new d3(i24), kind13, j0Var11), module23));
                new KoinDefinition(module23, i3.e5.n(new BeanDefinition(companion11.getRootScopeQualifier(), t0Var11.b(j31.z0.class), QualifierKt.named(d31.d.MENSTRUAL_CYCLE_TRACKING), new d3(i19), kind13, j0Var11), module23));
                new KoinDefinition(module23, i3.e5.n(new BeanDefinition(companion11.getRootScopeQualifier(), t0Var11.b(j31.z0.class), QualifierKt.named(d31.d.MUSIC), new d3(i15), kind13, j0Var11), module23));
                new KoinDefinition(module23, i3.e5.n(new BeanDefinition(companion11.getRootScopeQualifier(), t0Var11.b(j31.z0.class), QualifierKt.named(d31.d.PACE_PRO), new d3(23), kind13, j0Var11), module23));
                new KoinDefinition(module23, i3.e5.n(new BeanDefinition(companion11.getRootScopeQualifier(), t0Var11.b(j31.z0.class), QualifierKt.named(d31.d.POWER_ZONES), new d3(24), kind13, j0Var11), module23));
                new KoinDefinition(module23, i3.e5.n(new BeanDefinition(companion11.getRootScopeQualifier(), t0Var11.b(j31.z0.class), QualifierKt.named(d31.d.POWER_GUIDE), new d3(25), kind13, j0Var11), module23));
                new KoinDefinition(module23, i3.e5.n(new BeanDefinition(companion11.getRootScopeQualifier(), t0Var11.b(j31.z0.class), QualifierKt.named(d31.d.PULSE_OX), new d3(26), kind13, j0Var11), module23));
                new KoinDefinition(module23, i3.e5.n(new BeanDefinition(companion11.getRootScopeQualifier(), t0Var11.b(j31.z0.class), QualifierKt.named(d31.d.PULSE_OX_JP), new d3(28), kind13, j0Var11), module23));
                new KoinDefinition(module23, i3.e5.n(new BeanDefinition(companion11.getRootScopeQualifier(), t0Var11.b(j31.z0.class), QualifierKt.named(d31.d.RECORD_ACTIVITIES), new d3(29), kind13, j0Var11), module23));
                new KoinDefinition(module23, i3.e5.n(new BeanDefinition(companion11.getRootScopeQualifier(), t0Var11.b(j31.z0.class), QualifierKt.named(d31.d.SMART_WAKE_ALARM), new f3(0), kind13, j0Var11), module23));
                new KoinDefinition(module23, i3.e5.n(new BeanDefinition(companion11.getRootScopeQualifier(), t0Var11.b(j31.z0.class), QualifierKt.named(d31.d.SOLAR_INTENSITY), new f3(1), kind13, j0Var11), module23));
                new KoinDefinition(module23, i3.e5.n(new BeanDefinition(companion11.getRootScopeQualifier(), t0Var11.b(j31.z0.class), QualifierKt.named(d31.d.TOPOGRAPHICAL_MAPS), new f3(2), kind13, j0Var11), module23));
                new KoinDefinition(module23, i3.e5.n(new BeanDefinition(companion11.getRootScopeQualifier(), t0Var11.b(j31.z0.class), QualifierKt.named(d31.d.VOICE_ASSISTANT), new f3(4), kind13, j0Var11), module23));
                new KoinDefinition(module23, i3.e5.n(new BeanDefinition(companion11.getRootScopeQualifier(), t0Var11.b(j31.z0.class), QualifierKt.named(d31.d.VOICE_COMMAND), new f3(5), kind13, j0Var11), module23));
                new KoinDefinition(module23, i3.e5.n(new BeanDefinition(companion11.getRootScopeQualifier(), t0Var11.b(j31.z0.class), QualifierKt.named(d31.d.VO2MAX_TEST), new f3(6), kind13, j0Var11), module23));
                new KoinDefinition(module23, i3.e5.n(new BeanDefinition(companion11.getRootScopeQualifier(), t0Var11.b(j31.z0.class), QualifierKt.named(d31.d.WATCH_FACE), new f3(7), kind13, j0Var11), module23));
                new KoinDefinition(module23, i3.e5.n(new BeanDefinition(companion11.getRootScopeQualifier(), t0Var11.b(j31.z0.class), QualifierKt.named(d31.d.WIDGETS), new f3(8), kind13, j0Var11), module23));
                new KoinDefinition(module23, i3.e5.n(new BeanDefinition(companion11.getRootScopeQualifier(), t0Var11.b(j31.z0.class), QualifierKt.named(d31.d.WIFI), new f3(10), kind13, j0Var11), module23));
                new KoinDefinition(module23, i3.e5.n(new BeanDefinition(companion11.getRootScopeQualifier(), t0Var11.b(j31.z0.class), QualifierKt.named(d31.d.WORKOUTS), new f3(11), kind13, j0Var11), module23));
                new KoinDefinition(module23, i3.e5.n(new BeanDefinition(companion11.getRootScopeQualifier(), t0Var11.b(j31.z0.class), QualifierKt.named(d31.d.DAILY_STATS), new f3(12), kind13, j0Var11), module23));
                new KoinDefinition(module23, i3.e5.n(new BeanDefinition(companion11.getRootScopeQualifier(), t0Var11.b(j31.z0.class), QualifierKt.named(d31.d.MORNING_REPORT), new f3(13), kind13, j0Var11), module23));
                new KoinDefinition(module23, i3.e5.n(new BeanDefinition(companion11.getRootScopeQualifier(), t0Var11.b(j31.z0.class), QualifierKt.named(d31.d.SET_GOALS), new f3(i17), kind13, j0Var11), module23));
                new KoinDefinition(module23, i3.e5.n(new BeanDefinition(companion11.getRootScopeQualifier(), t0Var11.b(j31.z0.class), QualifierKt.named(d31.d.SELECT_ACTIVITY), new f3(16), kind13, j0Var11), module23));
                return Unit.INSTANCE;
        }
    }
}
