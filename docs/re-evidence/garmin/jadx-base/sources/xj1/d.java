package xj1;

import android.view.View;
import com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.emergencycalling.steps.EmergencyCallingDetailsFragment;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class d implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f191167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EmergencyCallingDetailsFragment f191168b;

    public /* synthetic */ d(EmergencyCallingDetailsFragment emergencyCallingDetailsFragment, int i14) {
        this.f191167a = i14;
        this.f191168b = emergencyCallingDetailsFragment;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: SwitchBreakVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v14 java.lang.Object, still in use, count: 2, list:
          (r5v14 java.lang.Object) from 0x0132: PHI (r5 I:??) = (r5v11 java.lang.Object), (r5v14 java.lang.Object) binds: [B:55:0x0131, B:88:0x0132] A[DONT_GENERATE, DONT_INLINE]
          (r5v14 java.lang.Object) from 0x011e: CHECK_CAST (l20.g) (r5v14 java.lang.Object)
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
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.processIfRequested(IfRegionVisitor.java:36)
        	at jadx.core.dex.visitors.regions.SwitchBreakVisitor.visit(SwitchBreakVisitor.java:47)
        */
    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r26) {
        /*
            Method dump skipped, instruction units count: 572
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xj1.d.onClick(android.view.View):void");
    }
}
