package nf0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.ecg.presentation.onboarding.GHSAccountViewModel", f = "GHSAccountViewModel.kt", l = {63, 64}, m = "isMFAValid", v = 2)
public final class l extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f125811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f125812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f125813c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(d dVar, t13.d<? super l> dVar2) {
        super(dVar2);
        this.f125812b = dVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f125811a = obj;
        this.f125813c |= Integer.MIN_VALUE;
        return this.f125812b.F4(this);
    }
}
