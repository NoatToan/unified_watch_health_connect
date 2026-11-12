package aw1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.wizardflow.FBTPlanWizardViewModel", f = "FBTPlanWizardViewModel.kt", l = {2265, 2274}, m = "createOrSubscribeEventForAtpOrItp", v = 2)
public final class s extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f13561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f13562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13563c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(h hVar, t13.d<? super s> dVar) {
        super(dVar);
        this.f13562b = hVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f13561a = obj;
        this.f13563c |= Integer.MIN_VALUE;
        return h.a5(this.f13562b, this);
    }
}
