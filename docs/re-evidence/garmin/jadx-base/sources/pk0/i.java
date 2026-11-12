package pk0;

import p3.p1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class i implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f138234a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i53.c f138235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p1 f138236c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.l f138237d;

    public /* synthetic */ i(i53.c cVar, e23.l lVar, p1 p1Var) {
        this.f138235b = cVar;
        this.f138237d = lVar;
        this.f138236c = p1Var;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0074  */
    /* JADX WARN: Multi-variable type inference failed */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v4 java.lang.Object, still in use, count: 2, list:
          (r1v4 java.lang.Object) from 0x0070: PHI (r1 I:??) = (r1v1 java.lang.Object), (r1v4 java.lang.Object) binds: [B:24:0x006f, B:31:0x0070] A[DONT_GENERATE, DONT_INLINE]
          (r1v4 java.lang.Object) from 0x0064: CHECK_CAST (jk0.h) (r1v4 java.lang.Object)
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
    @Override // e23.l
    public final java.lang.Object invoke(java.lang.Object r11) {
        /*
            r10 = this;
            int r0 = r10.f138234a
            switch(r0) {
                case 0: goto L4e;
                default: goto L5;
            }
        L5:
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            p3.p1 r0 = r10.f138236c
            java.lang.Object r1 = r0.getF182175a()
            dy1.b r1 = (dy1.b) r1
            if (r1 == 0) goto L18
            java.lang.Double r1 = r1.f61529b
            goto L19
        L18:
            r1 = 0
        L19:
            i53.c r2 = r10.f138235b
            java.lang.Object r3 = r2.get(r11)
            java.lang.Integer r3 = (java.lang.Integer) r3
            java.lang.Double r7 = gl1.d.n(r1, r3)
            java.lang.Object r0 = r0.getF182175a()
            r4 = r0
            dy1.b r4 = (dy1.b) r4
            if (r4 == 0) goto L4b
            java.lang.Object r11 = r2.get(r11)
            java.lang.Number r11 = (java.lang.Number) r11
            int r6 = r11.intValue()
            if (r1 == 0) goto L3d
            r11 = 1
        L3b:
            r8 = r11
            goto L3f
        L3d:
            r11 = 0
            goto L3b
        L3f:
            r9 = 15
            r5 = 0
            dy1.b r11 = dy1.b.a(r4, r5, r6, r7, r8, r9)
            e23.l r0 = r10.f138237d
            r0.invoke(r11)
        L4b:
            kotlin.Unit r11 = p005kotlin.Unit.INSTANCE
            return r11
        L4e:
            java.lang.String r11 = (java.lang.String) r11
            r11.getClass()
            i53.c r0 = r10.f138235b
            java.util.Iterator r0 = r0.iterator()
        L59:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L6f
            java.lang.Object r1 = r0.next()
            r2 = r1
            jk0.h r2 = (jk0.h) r2
            java.lang.String r2 = r2.f99254a
            boolean r2 = p005kotlin.jvm.internal.s.g(r2, r11)
            if (r2 == 0) goto L59
            goto L70
        L6f:
            r1 = 0
        L70:
            jk0.h r1 = (jk0.h) r1
            if (r1 == 0) goto L80
            java.lang.String r11 = r1.f99254a
            p3.p1 r0 = r10.f138236c
            r0.setValue(r11)
            e23.l r11 = r10.f138237d
            r11.invoke(r1)
        L80:
            kotlin.Unit r11 = p005kotlin.Unit.INSTANCE
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: pk0.i.invoke(java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ i(i53.c cVar, p1 p1Var, e23.l lVar) {
        this.f138235b = cVar;
        this.f138236c = p1Var;
        this.f138237d = lVar;
    }
}
