package q32;

import android.content.Context;
import o70.t;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f142426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f142427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f142428c;

    public /* synthetic */ a(t tVar, Context context, int i14) {
        this.f142426a = i14;
        this.f142427b = tVar;
        this.f142428c = context;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0045  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v9 java.lang.Object, still in use, count: 2, list:
          (r2v9 java.lang.Object) from 0x0032: PHI (r2 I:??) = (r2v5 java.lang.Object), (r2v9 java.lang.Object) binds: [B:10:0x0031, B:29:0x0032] A[DONT_GENERATE, DONT_INLINE]
          (r2v9 java.lang.Object) from 0x002a: CHECK_CAST (yi0.c) (r2v9 java.lang.Object)
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
    @Override // e23.a
    public final java.lang.Object invoke() {
        /*
            r6 = this;
            int r0 = r6.f142426a
            switch(r0) {
                case 0: goto L51;
                default: goto L5;
            }
        L5:
            ht.s r0 = ht.s.f85508a
            lt.e$k r1 = new lt.e$k
            lt.e$a r2 = lt.e.a.TappedTop
            o70.t r3 = r6.f142427b
            r1.<init>(r2, r3)
            r0.getClass()
            ht.s.a(r1)
            com.garmin.android.apps.connectmobile.ftp.reports.presentation.activity.FtpActivity$a r0 = com.garmin.android.apps.connectmobile.ftp.reports.presentation.activity.FtpActivity.f35281a
            w13.c r1 = yi0.c.f197338k
            java.util.Iterator r1 = r1.iterator()
        L1e:
            boolean r2 = r1.hasNext()
            r4 = 0
            if (r2 == 0) goto L31
            java.lang.Object r2 = r1.next()
            r5 = r2
            yi0.c r5 = (yi0.c) r5
            o70.t r5 = r5.f197341c
            if (r5 != r3) goto L1e
            goto L32
        L31:
            r2 = r4
        L32:
            yi0.c r2 = (yi0.c) r2
            r0.getClass()
            android.content.Context r0 = r6.f142428c
            r0.getClass()
            android.content.Intent r1 = new android.content.Intent
            java.lang.Class<com.garmin.android.apps.connectmobile.ftp.reports.presentation.activity.FtpActivity> r3 = com.garmin.android.apps.connectmobile.ftp.reports.presentation.activity.FtpActivity.class
            r1.<init>(r0, r3)
            if (r2 == 0) goto L46
            r4 = r2
        L46:
            java.lang.String r2 = "EXTRA_SELECTED_FTP_SPORT_KEY"
            r1.putExtra(r2, r4)
            r0.startActivity(r1)
            kotlin.Unit r0 = p005kotlin.Unit.INSTANCE
            return r0
        L51:
            ht.s r0 = ht.s.f85508a
            lt.e$k r1 = new lt.e$k
            lt.e$a r2 = lt.e.a.TappedTop
            o70.t r3 = r6.f142427b
            r1.<init>(r2, r3)
            r0.getClass()
            ht.s.a(r1)
            int[] r0 = q32.c.a.f142437a
            int r1 = r3.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L7c
            r1 = 2
            if (r0 == r1) goto L79
            r1 = 3
            if (r0 == r1) goto L76
            q71.e r0 = q71.e.RUNNING
            goto L7e
        L76:
            q71.e r0 = q71.e.ROWING
            goto L7e
        L79:
            q71.e r0 = q71.e.CYCLING
            goto L7e
        L7c:
            q71.e r0 = q71.e.RUNNING
        L7e:
            com.garmin.android.apps.connectmobile.vo2.reports.presentation.activity.VO2MaxReportsActivity$a r1 = com.garmin.android.apps.connectmobile.vo2.reports.presentation.activity.VO2MaxReportsActivity.f47876b
            r1.getClass()
            r0.getClass()
            android.content.Intent r1 = new android.content.Intent
            java.lang.Class<com.garmin.android.apps.connectmobile.vo2.reports.presentation.activity.VO2MaxReportsActivity> r2 = com.garmin.android.apps.connectmobile.vo2.reports.presentation.activity.VO2MaxReportsActivity.class
            android.content.Context r3 = r6.f142428c
            r1.<init>(r3, r2)
            java.lang.String r2 = "vo2MaxType"
            r1.putExtra(r2, r0)
            r3.startActivity(r1)
            kotlin.Unit r0 = p005kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q32.a.invoke():java.lang.Object");
    }
}
