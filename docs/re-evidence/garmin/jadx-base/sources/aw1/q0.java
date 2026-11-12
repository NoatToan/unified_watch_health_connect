package aw1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.wizardflow.FBTPlanWizardViewModel", f = "FBTPlanWizardViewModel.kt", l = {2420, 2428, 2444}, m = "updateEventAndSettingsAfterFBTPlanCreation", v = 2)
public final class q0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public fg0.k f13545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f13546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f13547c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f13548d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(h hVar, t13.d<? super q0> dVar) {
        super(dVar);
        this.f13547c = hVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f13546b = obj;
        this.f13548d |= Integer.MIN_VALUE;
        int i14 = h.S1;
        return this.f13547c.h8(null, this);
    }
}
