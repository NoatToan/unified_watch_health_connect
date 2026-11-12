package aw1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.wizardflow.FBTPlanWizardViewModel", f = "FBTPlanWizardViewModel.kt", l = {1740, 1758}, m = "getRunningCoachPlansAsync", v = 2)
public final class d0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public vt1.n f13338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f13339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Integer f13340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f13341d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f13342e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h f13343f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f13344g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(h hVar, t13.d<? super d0> dVar) {
        super(dVar);
        this.f13343f = hVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f13342e = obj;
        this.f13344g |= Integer.MIN_VALUE;
        return this.f13343f.O5(null, this);
    }
}
