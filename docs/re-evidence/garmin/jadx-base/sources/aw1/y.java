package aw1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.wizardflow.FBTPlanWizardViewModel", f = "FBTPlanWizardViewModel.kt", l = {1997}, m = "getAtpPaceTimes", v = 2)
public final class y extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f13601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f13602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13603c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(h hVar, t13.d<? super y> dVar) {
        super(dVar);
        this.f13602b = hVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f13601a = obj;
        this.f13603c |= Integer.MIN_VALUE;
        int i14 = h.S1;
        return this.f13602b.w5(0, this);
    }
}
