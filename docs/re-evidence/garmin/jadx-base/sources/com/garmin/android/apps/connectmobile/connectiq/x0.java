package com.garmin.android.apps.connectmobile.connectiq;

import com.garmin.android.apps.connectmobile.audioprompts.AudioPromptsService;
import java.io.Serializable;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class x0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32086a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f32087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f32088c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f32089d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Serializable f32090e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f32091f;

    public /* synthetic */ x0(z0 z0Var, z0.c cVar, long j8, String str, u0.b bVar) {
        this.f32088c = z0Var;
        this.f32089d = cVar;
        this.f32087b = j8;
        this.f32090e = str;
        this.f32091f = bVar;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00b8  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v12 java.lang.Object, still in use, count: 2, list:
          (r11v12 java.lang.Object) from 0x00b4: PHI (r11 I:??) = (r11v7 java.lang.Object), (r11v12 java.lang.Object) binds: [B:23:0x00b3, B:70:0x00b4] A[DONT_GENERATE, DONT_INLINE]
          (r11v12 java.lang.Object) from 0x00a4: CHECK_CAST (zb0.a) (r11v12 java.lang.Object)
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
    @Override // java.lang.Runnable
    public final void run() {
        /*
            Method dump skipped, instruction units count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.garmin.android.apps.connectmobile.connectiq.x0.run():void");
    }

    public /* synthetic */ x0(hy.d dVar, AudioPromptsService.e eVar, Locale locale, long j8, AudioPromptsService audioPromptsService) {
        this.f32088c = dVar;
        this.f32089d = eVar;
        this.f32090e = locale;
        this.f32087b = j8;
        this.f32091f = audioPromptsService;
    }
}
