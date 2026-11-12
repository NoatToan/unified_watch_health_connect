package fh0;

import ao.d;
import ao.k;
import co.g;
import co.i;
import co.j;
import com.garmin.android.apps.connectmobile.R;
import d53.u;
import dk2.h;
import e23.l;
import e23.p;
import fn.e;
import fo.r;
import fo.y;
import ho.a0;
import i3.e5;
import ih0.s;
import lp.f;
import o70.o;
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
import p5.h0;
import p5.k0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class b implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f71580a;

    public /* synthetic */ b(int i14) {
        this.f71580a = i14;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        long jF;
        final int i14 = 24;
        final int i15 = 29;
        final int i16 = 4;
        final int i17 = 3;
        final int i18 = 2;
        final int i19 = 7;
        final int i24 = 6;
        final int i25 = 5;
        final int i26 = 1;
        final int i27 = 0;
        switch (this.f71580a) {
            case 0:
                Module module = (Module) obj;
                c cVar = c.f71581a;
                module.getClass();
                ex.b bVar = new ex.b(i14);
                ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
                Kind kind = Kind.Factory;
                j0 j0Var = j0.f134944a;
                t0 t0Var = s0.f105811a;
                new KoinDefinition(module, e5.n(new BeanDefinition(rootScopeQualifier, t0Var.b(eh0.b.class), null, bVar, kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(bh0.a.class), null, new ex.b(25), kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(s.class), null, new ex.b(26), kind, j0Var), module));
                return Unit.INSTANCE;
            case 1:
                oi0.b bVar2 = (oi0.b) obj;
                fj0.a aVar = fj0.a.f71826a;
                bVar2.getClass();
                bVar2.X();
                bVar2.a();
                return Unit.INSTANCE;
            case 2:
                oi0.b bVar3 = (oi0.b) obj;
                fj0.a aVar2 = fj0.a.f71826a;
                bVar3.getClass();
                bVar3.Y();
                bVar3.a();
                return Unit.INSTANCE;
            case 3:
                k0 k0Var = (k0) obj;
                k0Var.getClass();
                h0.A(k0Var, "global_badges_footer_text");
                return Unit.INSTANCE;
            case 4:
                k0 k0Var2 = (k0) obj;
                k0Var2.getClass();
                h0.A(k0Var2, "home_screen_insights_toggle");
                return Unit.INSTANCE;
            case 5:
                k0 k0Var3 = (k0) obj;
                k0Var3.getClass();
                h0.A(k0Var3, "language_button");
                return Unit.INSTANCE;
            case 6:
                k0 k0Var4 = (k0) obj;
                k0Var4.getClass();
                h0.A(k0Var4, "data_privacy_button");
                return Unit.INSTANCE;
            case 7:
                k0 k0Var5 = (k0) obj;
                k0Var5.getClass();
                h0.A(k0Var5, "live_track_config_button");
                return Unit.INSTANCE;
            case 8:
                k0 k0Var6 = (k0) obj;
                k0Var6.getClass();
                h0.A(k0Var6, "global_badges_toggle");
                return Unit.INSTANCE;
            case 9:
                ((h) obj).getClass();
                return Boolean.TRUE;
            case 10:
                h hVar = (h) obj;
                hVar.getClass();
                String f60239c = hVar.getF60239c();
                return Boolean.valueOf(((f60239c == null || f60239c.length() == 0) ? 1 : 0) ^ 1);
            case 11:
                Module module2 = (Module) obj;
                fn.b bVar4 = fn.b.f72136a;
                module2.getClass();
                p pVar = new p() { // from class: fn.a
                    /* JADX WARN: Multi-variable type inference failed */
                    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v29 java.lang.Object, still in use, count: 2, list:
                          (r4v29 java.lang.Object) from 0x0346: PHI (r4 I:??) = (r4v26 java.lang.Object), (r4v29 java.lang.Object) binds: [B:57:0x0345, B:103:0x0346] A[DONT_GENERATE, DONT_INLINE]
                          (r4v29 java.lang.Object) from 0x033a: CHECK_CAST (jr.q) (r4v29 java.lang.Object)
                        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
                        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
                        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
                        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
                        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
                        */
                    @Override // e23.p
                    public final java.lang.Object invoke(java.lang.Object r22, java.lang.Object r23) {
                        /*
                            Method dump skipped, instruction units count: 1668
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: fn.a.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                    }
                };
                ScopeRegistry.Companion companion2 = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier2 = companion2.getRootScopeQualifier();
                Kind kind2 = Kind.Factory;
                j0 j0Var2 = j0.f134944a;
                t0 t0Var2 = s0.f105811a;
                new KoinDefinition(module2, e5.n(new BeanDefinition(rootScopeQualifier2, t0Var2.b(co.h.class), null, pVar, kind2, j0Var2), module2));
                final int i28 = 9;
                new KoinDefinition(module2, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(ao.a.class), null, new p() { // from class: fn.a
                    /* JADX WARN: Multi-variable type inference failed */
                    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v29 java.lang.Object, still in use, count: 2, list:
                          (r4v29 java.lang.Object) from 0x0346: PHI (r4 I:??) = (r4v26 java.lang.Object), (r4v29 java.lang.Object) binds: [B:57:0x0345, B:103:0x0346] A[DONT_GENERATE, DONT_INLINE]
                          (r4v29 java.lang.Object) from 0x033a: CHECK_CAST (jr.q) (r4v29 java.lang.Object)
                        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
                        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
                        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
                        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
                        */
                    @Override // e23.p
                    public final java.lang.Object invoke(java.lang.Object r22, java.lang.Object r23) {
                        /*
                            Method dump skipped, instruction units count: 1668
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: fn.a.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                    }
                }, kind2, j0Var2), module2));
                final int i29 = 10;
                new KoinDefinition(module2, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(d.class), null, new p() { // from class: fn.a
                    /* JADX WARN: Multi-variable type inference failed */
                    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v29 java.lang.Object, still in use, count: 2, list:
                          (r4v29 java.lang.Object) from 0x0346: PHI (r4 I:??) = (r4v26 java.lang.Object), (r4v29 java.lang.Object) binds: [B:57:0x0345, B:103:0x0346] A[DONT_GENERATE, DONT_INLINE]
                          (r4v29 java.lang.Object) from 0x033a: CHECK_CAST (jr.q) (r4v29 java.lang.Object)
                        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
                        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
                        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
                        */
                    @Override // e23.p
                    public final java.lang.Object invoke(java.lang.Object r22, java.lang.Object r23) {
                        /*
                            Method dump skipped, instruction units count: 1668
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: fn.a.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                    }
                }, kind2, j0Var2), module2));
                final int i30 = 11;
                new KoinDefinition(module2, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(k.class), null, new p() { // from class: fn.a
                    /* JADX WARN: Multi-variable type inference failed */
                    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v29 java.lang.Object, still in use, count: 2, list:
                          (r4v29 java.lang.Object) from 0x0346: PHI (r4 I:??) = (r4v26 java.lang.Object), (r4v29 java.lang.Object) binds: [B:57:0x0345, B:103:0x0346] A[DONT_GENERATE, DONT_INLINE]
                          (r4v29 java.lang.Object) from 0x033a: CHECK_CAST (jr.q) (r4v29 java.lang.Object)
                        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
                        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
                        */
                    @Override // e23.p
                    public final java.lang.Object invoke(java.lang.Object r22, java.lang.Object r23) {
                        /*
                            Method dump skipped, instruction units count: 1668
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: fn.a.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                    }
                }, kind2, j0Var2), module2));
                final int i34 = 12;
                new KoinDefinition(module2, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(co.l.class), null, new p() { // from class: fn.a
                    /* JADX WARN: Multi-variable type inference failed */
                    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v29 java.lang.Object, still in use, count: 2, list:
                          (r4v29 java.lang.Object) from 0x0346: PHI (r4 I:??) = (r4v26 java.lang.Object), (r4v29 java.lang.Object) binds: [B:57:0x0345, B:103:0x0346] A[DONT_GENERATE, DONT_INLINE]
                          (r4v29 java.lang.Object) from 0x033a: CHECK_CAST (jr.q) (r4v29 java.lang.Object)
                        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
                        */
                    @Override // e23.p
                    public final java.lang.Object invoke(java.lang.Object r22, java.lang.Object r23) {
                        /*
                            Method dump skipped, instruction units count: 1668
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: fn.a.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                    }
                }, kind2, j0Var2), module2));
                new KoinDefinition(module2, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(i.class), null, new ex.b(i15), kind2, j0Var2), module2));
                new KoinDefinition(module2, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(j.class), null, new p() { // from class: fn.a
                    /* JADX WARN: Multi-variable type inference failed */
                    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v29 java.lang.Object, still in use, count: 2, list:
                          (r4v29 java.lang.Object) from 0x0346: PHI (r4 I:??) = (r4v26 java.lang.Object), (r4v29 java.lang.Object) binds: [B:57:0x0345, B:103:0x0346] A[DONT_GENERATE, DONT_INLINE]
                          (r4v29 java.lang.Object) from 0x033a: CHECK_CAST (jr.q) (r4v29 java.lang.Object)
                        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                        */
                    @Override // e23.p
                    public final java.lang.Object invoke(java.lang.Object r22, java.lang.Object r23) {
                        /*
                            Method dump skipped, instruction units count: 1668
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: fn.a.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                    }
                }, kind2, j0Var2), module2));
                new KoinDefinition(module2, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(co.d.class), null, new p() { // from class: fn.a
                    /* JADX WARN: Multi-variable type inference failed */
                    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v29 java.lang.Object, still in use, count: 2, list:
                          (r4v29 java.lang.Object) from 0x0346: PHI (r4 I:??) = (r4v26 java.lang.Object), (r4v29 java.lang.Object) binds: [B:57:0x0345, B:103:0x0346] A[DONT_GENERATE, DONT_INLINE]
                          (r4v29 java.lang.Object) from 0x033a: CHECK_CAST (jr.q) (r4v29 java.lang.Object)
                        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                        */
                    @Override // e23.p
                    public final java.lang.Object invoke(java.lang.Object r22, java.lang.Object r23) {
                        /*
                            Method dump skipped, instruction units count: 1668
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: fn.a.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                    }
                }, kind2, j0Var2), module2));
                new KoinDefinition(module2, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(co.b.class), null, new p() { // from class: fn.a
                    /* JADX WARN: Multi-variable type inference failed */
                    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v29 java.lang.Object, still in use, count: 2, list:
                          (r4v29 java.lang.Object) from 0x0346: PHI (r4 I:??) = (r4v26 java.lang.Object), (r4v29 java.lang.Object) binds: [B:57:0x0345, B:103:0x0346] A[DONT_GENERATE, DONT_INLINE]
                          (r4v29 java.lang.Object) from 0x033a: CHECK_CAST (jr.q) (r4v29 java.lang.Object)
                        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                        */
                    @Override // e23.p
                    public final java.lang.Object invoke(java.lang.Object r22, java.lang.Object r23) {
                        /*
                            Method dump skipped, instruction units count: 1668
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: fn.a.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                    }
                }, kind2, j0Var2), module2));
                new KoinDefinition(module2, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(co.a.class), null, new p() { // from class: fn.a
                    /* JADX WARN: Multi-variable type inference failed */
                    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v29 java.lang.Object, still in use, count: 2, list:
                          (r4v29 java.lang.Object) from 0x0346: PHI (r4 I:??) = (r4v26 java.lang.Object), (r4v29 java.lang.Object) binds: [B:57:0x0345, B:103:0x0346] A[DONT_GENERATE, DONT_INLINE]
                          (r4v29 java.lang.Object) from 0x033a: CHECK_CAST (jr.q) (r4v29 java.lang.Object)
                        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                        */
                    @Override // e23.p
                    public final java.lang.Object invoke(java.lang.Object r22, java.lang.Object r23) {
                        /*
                            Method dump skipped, instruction units count: 1668
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: fn.a.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                    }
                }, kind2, j0Var2), module2));
                new KoinDefinition(module2, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(g.class), null, new p() { // from class: fn.a
                    /* JADX WARN: Multi-variable type inference failed */
                    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v29 java.lang.Object, still in use, count: 2, list:
                          (r4v29 java.lang.Object) from 0x0346: PHI (r4 I:??) = (r4v26 java.lang.Object), (r4v29 java.lang.Object) binds: [B:57:0x0345, B:103:0x0346] A[DONT_GENERATE, DONT_INLINE]
                          (r4v29 java.lang.Object) from 0x033a: CHECK_CAST (jr.q) (r4v29 java.lang.Object)
                        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                        */
                    @Override // e23.p
                    public final java.lang.Object invoke(java.lang.Object r22, java.lang.Object r23) {
                        /*
                            Method dump skipped, instruction units count: 1668
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: fn.a.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                    }
                }, kind2, j0Var2), module2));
                new KoinDefinition(module2, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(r.class), null, new p() { // from class: fn.a
                    /* JADX WARN: Multi-variable type inference failed */
                    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v29 java.lang.Object, still in use, count: 2, list:
                          (r4v29 java.lang.Object) from 0x0346: PHI (r4 I:??) = (r4v26 java.lang.Object), (r4v29 java.lang.Object) binds: [B:57:0x0345, B:103:0x0346] A[DONT_GENERATE, DONT_INLINE]
                          (r4v29 java.lang.Object) from 0x033a: CHECK_CAST (jr.q) (r4v29 java.lang.Object)
                        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                        */
                    @Override // e23.p
                    public final java.lang.Object invoke(java.lang.Object r22, java.lang.Object r23) {
                        /*
                            Method dump skipped, instruction units count: 1668
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: fn.a.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                    }
                }, kind2, j0Var2), module2));
                new KoinDefinition(module2, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(a0.class), null, new p() { // from class: fn.a
                    /* JADX WARN: Multi-variable type inference failed */
                    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v29 java.lang.Object, still in use, count: 2, list:
                          (r4v29 java.lang.Object) from 0x0346: PHI (r4 I:??) = (r4v26 java.lang.Object), (r4v29 java.lang.Object) binds: [B:57:0x0345, B:103:0x0346] A[DONT_GENERATE, DONT_INLINE]
                          (r4v29 java.lang.Object) from 0x033a: CHECK_CAST (jr.q) (r4v29 java.lang.Object)
                        */
                    @Override // e23.p
                    public final java.lang.Object invoke(java.lang.Object r22, java.lang.Object r23) {
                        /*
                            Method dump skipped, instruction units count: 1668
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: fn.a.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                    }
                }, kind2, j0Var2), module2));
                final int i35 = 8;
                new KoinDefinition(module2, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(ho.c.class), null, new p() { // from class: fn.a
                    /* JADX WARN: Multi-variable type inference failed */
                    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v29 java.lang.Object, still in use, count: 2, list:
                          (r4v29 java.lang.Object) from 0x0346: PHI (r4 I:??) = (r4v26 java.lang.Object), (r4v29 java.lang.Object) binds: [B:57:0x0345, B:103:0x0346] A[DONT_GENERATE, DONT_INLINE]
                          (r4v29 java.lang.Object) from 0x033a: CHECK_CAST (jr.q) (r4v29 java.lang.Object)
                        */
                    @Override // e23.p
                    public final java.lang.Object invoke(java.lang.Object r22, java.lang.Object r23) {
                        /*
                            Method dump skipped, instruction units count: 1668
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: fn.a.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                    }
                }, kind2, j0Var2), module2));
                return Unit.INSTANCE;
            case 12:
                Module module3 = (Module) obj;
                fn.c cVar2 = fn.c.f72138a;
                module3.getClass();
                StringQualifier stringQualifierNamed = QualifierKt.named(o70.b.ACTIVITY.a());
                final int i36 = 13;
                p pVar2 = new p() { // from class: fn.a
                    /* JADX WARN: Multi-variable type inference failed */
                    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v29 java.lang.Object, still in use, count: 2, list:
                          (r4v29 java.lang.Object) from 0x0346: PHI (r4 I:??) = (r4v26 java.lang.Object), (r4v29 java.lang.Object) binds: [B:57:0x0345, B:103:0x0346] A[DONT_GENERATE, DONT_INLINE]
                          (r4v29 java.lang.Object) from 0x033a: CHECK_CAST (jr.q) (r4v29 java.lang.Object)
                        */
                    @Override // e23.p
                    public final java.lang.Object invoke(java.lang.Object r22, java.lang.Object r23) {
                        /*
                            Method dump skipped, instruction units count: 1668
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: fn.a.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                    }
                };
                ScopeRegistry.Companion companion3 = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier3 = companion3.getRootScopeQualifier();
                Kind kind3 = Kind.Factory;
                j0 j0Var3 = j0.f134944a;
                t0 t0Var3 = s0.f105811a;
                new KoinDefinition(module3, e5.n(new BeanDefinition(rootScopeQualifier3, t0Var3.b(n70.a0.class), stringQualifierNamed, pVar2, kind3, j0Var3), module3));
                final int i37 = 14;
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(r70.a.class), stringQualifierNamed, new p() { // from class: fn.a
                    /* JADX WARN: Multi-variable type inference failed */
                    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v29 java.lang.Object, still in use, count: 2, list:
                          (r4v29 java.lang.Object) from 0x0346: PHI (r4 I:??) = (r4v26 java.lang.Object), (r4v29 java.lang.Object) binds: [B:57:0x0345, B:103:0x0346] A[DONT_GENERATE, DONT_INLINE]
                          (r4v29 java.lang.Object) from 0x033a: CHECK_CAST (jr.q) (r4v29 java.lang.Object)
                        */
                    @Override // e23.p
                    public final java.lang.Object invoke(java.lang.Object r22, java.lang.Object r23) {
                        /*
                            Method dump skipped, instruction units count: 1668
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: fn.a.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                    }
                }, kind3, j0Var3), module3));
                final int i38 = 15;
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(r70.r.class), stringQualifierNamed, new p() { // from class: fn.a
                    /* JADX WARN: Multi-variable type inference failed */
                    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v29 java.lang.Object, still in use, count: 2, list:
                          (r4v29 java.lang.Object) from 0x0346: PHI (r4 I:??) = (r4v26 java.lang.Object), (r4v29 java.lang.Object) binds: [B:57:0x0345, B:103:0x0346] A[DONT_GENERATE, DONT_INLINE]
                          (r4v29 java.lang.Object) from 0x033a: CHECK_CAST (jr.q) (r4v29 java.lang.Object)
                        */
                    @Override // e23.p
                    public final java.lang.Object invoke(java.lang.Object r22, java.lang.Object r23) {
                        /*
                            Method dump skipped, instruction units count: 1668
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: fn.a.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                    }
                }, kind3, j0Var3), module3));
                StringQualifier stringQualifierNamed2 = QualifierKt.named(t.F.a());
                final int i39 = 16;
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(r70.s.class), stringQualifierNamed2, new p() { // from class: fn.a
                    /* JADX WARN: Multi-variable type inference failed */
                    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v29 java.lang.Object, still in use, count: 2, list:
                          (r4v29 java.lang.Object) from 0x0346: PHI (r4 I:??) = (r4v26 java.lang.Object), (r4v29 java.lang.Object) binds: [B:57:0x0345, B:103:0x0346] A[DONT_GENERATE, DONT_INLINE]
                          (r4v29 java.lang.Object) from 0x033a: CHECK_CAST (jr.q) (r4v29 java.lang.Object)
                        */
                    @Override // e23.p
                    public final java.lang.Object invoke(java.lang.Object r22, java.lang.Object r23) {
                        /*
                            Method dump skipped, instruction units count: 1668
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: fn.a.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                    }
                }, kind3, j0Var3), module3));
                final int i44 = 17;
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(r70.r.class), stringQualifierNamed2, new p() { // from class: fn.a
                    /* JADX WARN: Multi-variable type inference failed */
                    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v29 java.lang.Object, still in use, count: 2, list:
                          (r4v29 java.lang.Object) from 0x0346: PHI (r4 I:??) = (r4v26 java.lang.Object), (r4v29 java.lang.Object) binds: [B:57:0x0345, B:103:0x0346] A[DONT_GENERATE, DONT_INLINE]
                          (r4v29 java.lang.Object) from 0x033a: CHECK_CAST (jr.q) (r4v29 java.lang.Object)
                        */
                    @Override // e23.p
                    public final java.lang.Object invoke(java.lang.Object r22, java.lang.Object r23) {
                        /*
                            Method dump skipped, instruction units count: 1668
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: fn.a.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                    }
                }, kind3, j0Var3), module3));
                final int i45 = 18;
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(gr.b.class), null, new p() { // from class: fn.a
                    /* JADX WARN: Multi-variable type inference failed */
                    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v29 java.lang.Object, still in use, count: 2, list:
                          (r4v29 java.lang.Object) from 0x0346: PHI (r4 I:??) = (r4v26 java.lang.Object), (r4v29 java.lang.Object) binds: [B:57:0x0345, B:103:0x0346] A[DONT_GENERATE, DONT_INLINE]
                          (r4v29 java.lang.Object) from 0x033a: CHECK_CAST (jr.q) (r4v29 java.lang.Object)
                        */
                    @Override // e23.p
                    public final java.lang.Object invoke(java.lang.Object r22, java.lang.Object r23) {
                        /*
                            Method dump skipped, instruction units count: 1668
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: fn.a.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                    }
                }, kind3, j0Var3), module3));
                return Unit.INSTANCE;
            case 13:
                Module module4 = (Module) obj;
                fn.d dVar = fn.d.f72140a;
                module4.getClass();
                final int i46 = 19;
                p pVar3 = new p() { // from class: fn.a
                    /* JADX WARN: Multi-variable type inference failed */
                    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v29 java.lang.Object, still in use, count: 2, list:
                          (r4v29 java.lang.Object) from 0x0346: PHI (r4 I:??) = (r4v26 java.lang.Object), (r4v29 java.lang.Object) binds: [B:57:0x0345, B:103:0x0346] A[DONT_GENERATE, DONT_INLINE]
                          (r4v29 java.lang.Object) from 0x033a: CHECK_CAST (jr.q) (r4v29 java.lang.Object)
                        */
                    @Override // e23.p
                    public final java.lang.Object invoke(java.lang.Object r22, java.lang.Object r23) {
                        /*
                            Method dump skipped, instruction units count: 1668
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: fn.a.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                    }
                };
                ScopeRegistry.Companion companion4 = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier4 = companion4.getRootScopeQualifier();
                Kind kind4 = Kind.Factory;
                j0 j0Var4 = j0.f134944a;
                t0 t0Var4 = s0.f105811a;
                new KoinDefinition(module4, e5.n(new BeanDefinition(rootScopeQualifier4, t0Var4.b(lp.j.class), null, pVar3, kind4, j0Var4), module4));
                final int i47 = 20;
                new KoinDefinition(module4, e5.n(new BeanDefinition(companion4.getRootScopeQualifier(), t0Var4.b(kp.a.class), null, new p() { // from class: fn.a
                    /* JADX WARN: Multi-variable type inference failed */
                    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v29 java.lang.Object, still in use, count: 2, list:
                          (r4v29 java.lang.Object) from 0x0346: PHI (r4 I:??) = (r4v26 java.lang.Object), (r4v29 java.lang.Object) binds: [B:57:0x0345, B:103:0x0346] A[DONT_GENERATE, DONT_INLINE]
                          (r4v29 java.lang.Object) from 0x033a: CHECK_CAST (jr.q) (r4v29 java.lang.Object)
                        */
                    @Override // e23.p
                    public final java.lang.Object invoke(java.lang.Object r22, java.lang.Object r23) {
                        /*
                            Method dump skipped, instruction units count: 1668
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: fn.a.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                    }
                }, kind4, j0Var4), module4));
                final int i48 = 21;
                new KoinDefinition(module4, e5.n(new BeanDefinition(companion4.getRootScopeQualifier(), t0Var4.b(tp.a.class), null, new p() { // from class: fn.a
                    /* JADX WARN: Multi-variable type inference failed */
                    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v29 java.lang.Object, still in use, count: 2, list:
                          (r4v29 java.lang.Object) from 0x0346: PHI (r4 I:??) = (r4v26 java.lang.Object), (r4v29 java.lang.Object) binds: [B:57:0x0345, B:103:0x0346] A[DONT_GENERATE, DONT_INLINE]
                          (r4v29 java.lang.Object) from 0x033a: CHECK_CAST (jr.q) (r4v29 java.lang.Object)
                        */
                    @Override // e23.p
                    public final java.lang.Object invoke(java.lang.Object r22, java.lang.Object r23) {
                        /*
                            Method dump skipped, instruction units count: 1668
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: fn.a.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                    }
                }, kind4, j0Var4), module4));
                final int i49 = 22;
                new KoinDefinition(module4, e5.n(new BeanDefinition(companion4.getRootScopeQualifier(), t0Var4.b(lp.i.class), null, new p() { // from class: fn.a
                    /* JADX WARN: Multi-variable type inference failed */
                    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v29 java.lang.Object, still in use, count: 2, list:
                          (r4v29 java.lang.Object) from 0x0346: PHI (r4 I:??) = (r4v26 java.lang.Object), (r4v29 java.lang.Object) binds: [B:57:0x0345, B:103:0x0346] A[DONT_GENERATE, DONT_INLINE]
                          (r4v29 java.lang.Object) from 0x033a: CHECK_CAST (jr.q) (r4v29 java.lang.Object)
                        */
                    @Override // e23.p
                    public final java.lang.Object invoke(java.lang.Object r22, java.lang.Object r23) {
                        /*
                            Method dump skipped, instruction units count: 1668
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: fn.a.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                    }
                }, kind4, j0Var4), module4));
                final int i54 = 23;
                new KoinDefinition(module4, e5.n(new BeanDefinition(companion4.getRootScopeQualifier(), t0Var4.b(lp.d.class), null, new p() { // from class: fn.a
                    /* JADX WARN: Multi-variable type inference failed */
                    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v29 java.lang.Object, still in use, count: 2, list:
                          (r4v29 java.lang.Object) from 0x0346: PHI (r4 I:??) = (r4v26 java.lang.Object), (r4v29 java.lang.Object) binds: [B:57:0x0345, B:103:0x0346] A[DONT_GENERATE, DONT_INLINE]
                          (r4v29 java.lang.Object) from 0x033a: CHECK_CAST (jr.q) (r4v29 java.lang.Object)
                        */
                    @Override // e23.p
                    public final java.lang.Object invoke(java.lang.Object r22, java.lang.Object r23) {
                        /*
                            Method dump skipped, instruction units count: 1668
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: fn.a.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                    }
                }, kind4, j0Var4), module4));
                new KoinDefinition(module4, e5.n(new BeanDefinition(companion4.getRootScopeQualifier(), t0Var4.b(f.class), null, new p() { // from class: fn.a
                    /* JADX WARN: Multi-variable type inference failed */
                    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v29 java.lang.Object, still in use, count: 2, list:
                          (r4v29 java.lang.Object) from 0x0346: PHI (r4 I:??) = (r4v26 java.lang.Object), (r4v29 java.lang.Object) binds: [B:57:0x0345, B:103:0x0346] A[DONT_GENERATE, DONT_INLINE]
                          (r4v29 java.lang.Object) from 0x033a: CHECK_CAST (jr.q) (r4v29 java.lang.Object)
                        */
                    @Override // e23.p
                    public final java.lang.Object invoke(java.lang.Object r22, java.lang.Object r23) {
                        /*
                            Method dump skipped, instruction units count: 1668
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: fn.a.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                    }
                }, kind4, j0Var4), module4));
                final int i55 = 25;
                new KoinDefinition(module4, e5.n(new BeanDefinition(companion4.getRootScopeQualifier(), t0Var4.b(lp.a.class), null, new p() { // from class: fn.a
                    /* JADX WARN: Multi-variable type inference failed */
                    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v29 java.lang.Object, still in use, count: 2, list:
                          (r4v29 java.lang.Object) from 0x0346: PHI (r4 I:??) = (r4v26 java.lang.Object), (r4v29 java.lang.Object) binds: [B:57:0x0345, B:103:0x0346] A[DONT_GENERATE, DONT_INLINE]
                          (r4v29 java.lang.Object) from 0x033a: CHECK_CAST (jr.q) (r4v29 java.lang.Object)
                        */
                    @Override // e23.p
                    public final java.lang.Object invoke(java.lang.Object r22, java.lang.Object r23) {
                        /*
                            Method dump skipped, instruction units count: 1668
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: fn.a.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                    }
                }, kind4, j0Var4), module4));
                final int i56 = 26;
                new KoinDefinition(module4, e5.n(new BeanDefinition(companion4.getRootScopeQualifier(), t0Var4.b(np.c.class), null, new p() { // from class: fn.a
                    /* JADX WARN: Multi-variable type inference failed */
                    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v29 java.lang.Object, still in use, count: 2, list:
                          (r4v29 java.lang.Object) from 0x0346: PHI (r4 I:??) = (r4v26 java.lang.Object), (r4v29 java.lang.Object) binds: [B:57:0x0345, B:103:0x0346] A[DONT_GENERATE, DONT_INLINE]
                          (r4v29 java.lang.Object) from 0x033a: CHECK_CAST (jr.q) (r4v29 java.lang.Object)
                        */
                    @Override // e23.p
                    public final java.lang.Object invoke(java.lang.Object r22, java.lang.Object r23) {
                        /*
                            Method dump skipped, instruction units count: 1668
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: fn.a.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                    }
                }, kind4, j0Var4), module4));
                return Unit.INSTANCE;
            case 14:
                Module module5 = (Module) obj;
                e eVar = e.f72142a;
                module5.getClass();
                StringQualifier stringQualifierNamed3 = QualifierKt.named(o.ACTIVITY_SUMMARY.a());
                final int i57 = 27;
                p pVar4 = new p() { // from class: fn.a
                    /* JADX WARN: Multi-variable type inference failed */
                    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v29 java.lang.Object, still in use, count: 2, list:
                          (r4v29 java.lang.Object) from 0x0346: PHI (r4 I:??) = (r4v26 java.lang.Object), (r4v29 java.lang.Object) binds: [B:57:0x0345, B:103:0x0346] A[DONT_GENERATE, DONT_INLINE]
                          (r4v29 java.lang.Object) from 0x033a: CHECK_CAST (jr.q) (r4v29 java.lang.Object)
                        */
                    @Override // e23.p
                    public final java.lang.Object invoke(java.lang.Object r22, java.lang.Object r23) {
                        /*
                            Method dump skipped, instruction units count: 1668
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: fn.a.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                    }
                };
                ScopeRegistry.Companion companion5 = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier5 = companion5.getRootScopeQualifier();
                Kind kind5 = Kind.Factory;
                j0 j0Var5 = j0.f134944a;
                t0 t0Var5 = s0.f105811a;
                new KoinDefinition(module5, e5.n(new BeanDefinition(rootScopeQualifier5, t0Var5.b(gn.k.class), null, pVar4, kind5, j0Var5), module5));
                final int i58 = 28;
                new KoinDefinition(module5, e5.n(new BeanDefinition(companion5.getRootScopeQualifier(), t0Var5.b(r70.s.class), stringQualifierNamed3, new p() { // from class: fn.a
                    /* JADX WARN: Multi-variable type inference failed */
                    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v29 java.lang.Object, still in use, count: 2, list:
                          (r4v29 java.lang.Object) from 0x0346: PHI (r4 I:??) = (r4v26 java.lang.Object), (r4v29 java.lang.Object) binds: [B:57:0x0345, B:103:0x0346] A[DONT_GENERATE, DONT_INLINE]
                          (r4v29 java.lang.Object) from 0x033a: CHECK_CAST (jr.q) (r4v29 java.lang.Object)
                        */
                    @Override // e23.p
                    public final java.lang.Object invoke(java.lang.Object r22, java.lang.Object r23) {
                        /*
                            Method dump skipped, instruction units count: 1668
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: fn.a.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                    }
                }, kind5, j0Var5), module5));
                new KoinDefinition(module5, e5.n(new BeanDefinition(companion5.getRootScopeQualifier(), t0Var5.b(r70.r.class), stringQualifierNamed3, new p() { // from class: fn.a
                    /* JADX WARN: Multi-variable type inference failed */
                    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v29 java.lang.Object, still in use, count: 2, list:
                          (r4v29 java.lang.Object) from 0x0346: PHI (r4 I:??) = (r4v26 java.lang.Object), (r4v29 java.lang.Object) binds: [B:57:0x0345, B:103:0x0346] A[DONT_GENERATE, DONT_INLINE]
                          (r4v29 java.lang.Object) from 0x033a: CHECK_CAST (jr.q) (r4v29 java.lang.Object)
                        */
                    @Override // e23.p
                    public final java.lang.Object invoke(java.lang.Object r22, java.lang.Object r23) {
                        /*
                            Method dump skipped, instruction units count: 1668
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: fn.a.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                    }
                }, kind5, j0Var5), module5));
                return Unit.INSTANCE;
            case 15:
                Module module6 = (Module) obj;
                fn.g gVar = fn.g.f72145a;
                module6.getClass();
                StringQualifier stringQualifierNamed4 = QualifierKt.named(o70.b.LIVE_ACTIVITY.a());
                fn.f fVar = new fn.f(i27);
                ScopeRegistry.Companion companion6 = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier6 = companion6.getRootScopeQualifier();
                Kind kind6 = Kind.Factory;
                j0 j0Var6 = j0.f134944a;
                t0 t0Var6 = s0.f105811a;
                new KoinDefinition(module6, e5.n(new BeanDefinition(rootScopeQualifier6, t0Var6.b(n70.a0.class), stringQualifierNamed4, fVar, kind6, j0Var6), module6));
                new KoinDefinition(module6, e5.n(new BeanDefinition(companion6.getRootScopeQualifier(), t0Var6.b(r70.a.class), stringQualifierNamed4, new fn.f(i26), kind6, j0Var6), module6));
                new KoinDefinition(module6, e5.n(new BeanDefinition(companion6.getRootScopeQualifier(), t0Var6.b(hp.c.class), null, new fn.f(i18), kind6, j0Var6), module6));
                new KoinDefinition(module6, e5.n(new BeanDefinition(companion6.getRootScopeQualifier(), t0Var6.b(r70.r.class), stringQualifierNamed4, new fn.f(i17), kind6, j0Var6), module6));
                new KoinDefinition(module6, e5.n(new BeanDefinition(companion6.getRootScopeQualifier(), t0Var6.b(tf2.h.class), null, new fn.f(i16), kind6, j0Var6), module6));
                return Unit.INSTANCE;
            case 16:
                Module module7 = (Module) obj;
                fn.h hVar2 = fn.h.f72147a;
                module7.getClass();
                StringQualifier stringQualifierNamed5 = QualifierKt.named(o70.b.HEALTH_SNAPSHOT.a());
                fn.f fVar2 = new fn.f(i25);
                ScopeRegistry.Companion companion7 = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier7 = companion7.getRootScopeQualifier();
                Kind kind7 = Kind.Factory;
                j0 j0Var7 = j0.f134944a;
                t0 t0Var7 = s0.f105811a;
                new KoinDefinition(module7, e5.n(new BeanDefinition(rootScopeQualifier7, t0Var7.b(n70.a0.class), stringQualifierNamed5, fVar2, kind7, j0Var7), module7));
                new KoinDefinition(module7, e5.n(new BeanDefinition(companion7.getRootScopeQualifier(), t0Var7.b(r70.a.class), stringQualifierNamed5, new fn.f(i24), kind7, j0Var7), module7));
                new KoinDefinition(module7, e5.n(new BeanDefinition(companion7.getRootScopeQualifier(), t0Var7.b(r70.r.class), stringQualifierNamed5, new fn.f(i19), kind7, j0Var7), module7));
                return Unit.INSTANCE;
            case 17:
                ((k0) obj).getClass();
                return Unit.INSTANCE;
            case 18:
                ((k0) obj).getClass();
                return Unit.INSTANCE;
            case 19:
                oi0.b bVar5 = (oi0.b) obj;
                bVar5.getClass();
                bVar5.l();
                return Unit.INSTANCE;
            case 20:
                ((k0) obj).getClass();
                return Unit.INSTANCE;
            case 21:
                oi0.b bVar6 = (oi0.b) obj;
                bVar6.getClass();
                String str = bVar6.f132238b;
                l22.b bVar7 = bVar6.f132237a;
                String strV = u.v(str, bVar7.getString(R.string.lbl_seven_days), bVar7.getString(R.string.lbl_7_days), false);
                bVar6.f132238b = strV;
                bVar6.f132238b = u.v(strV, bVar7.getString(R.string.lbl_four_weeks), bVar7.getString(R.string.lbl_4_weeks), false);
                return Unit.INSTANCE;
            case 22:
                jo.b bVar8 = (jo.b) obj;
                bVar8.getClass();
                return bVar8.f99694a;
            case 23:
                wo0.a aVar3 = (wo0.a) obj;
                aVar3.getClass();
                return Long.valueOf(aVar3.f186415a);
            case 24:
                fo.t tVar = (fo.t) obj;
                int i59 = r.f72415i;
                tVar.getClass();
                if (tVar.f72442d) {
                    e53.c.a aVar4 = e53.c.f63094b;
                    jF = e53.e.e(0, e53.f.MILLISECONDS);
                } else {
                    e53.c.a aVar5 = e53.c.f63094b;
                    jF = e53.e.f(500L, e53.f.MILLISECONDS);
                }
                return e53.c.c(jF);
            case 25:
                y yVar = y.f72452a;
                ((jo.f) obj).getClass();
                return Unit.INSTANCE;
            case 26:
                y yVar2 = y.f72452a;
                ((jo.b) obj).getClass();
                return Unit.INSTANCE;
            case 27:
                y yVar3 = y.f72452a;
                ((wo0.a) obj).getClass();
                return Unit.INSTANCE;
            case 28:
                ((Boolean) obj).booleanValue();
                y yVar4 = y.f72452a;
                return Unit.INSTANCE;
            default:
                y yVar5 = y.f72452a;
                ((String) obj).getClass();
                return Unit.INSTANCE;
        }
    }
}
