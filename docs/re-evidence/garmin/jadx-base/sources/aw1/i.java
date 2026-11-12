package aw1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.wizardflow.FBTPlanWizardViewModel", f = "FBTPlanWizardViewModel.kt", l = {2450, 2453}, m = "attemptToRecoverAfterFBTPlanCreationFailed", v = 2)
public final class i extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public tw1.m f13431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f13432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f13433c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f13434d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(h hVar, t13.d<? super i> dVar) {
        super(dVar);
        this.f13433c = hVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f13432b = obj;
        this.f13434d |= Integer.MIN_VALUE;
        return h.X4(this.f13433c, this);
    }
}
