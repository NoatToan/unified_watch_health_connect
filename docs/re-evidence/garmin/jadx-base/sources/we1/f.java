package we1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.running_economy.presentation.RunningEconomyViewModel", f = "RunningEconomyViewModel.kt", l = {259}, m = "hasRunningEconomyShownOnHome", v = 2)
public final class f extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f184813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f184814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f184815c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d dVar, t13.d<? super f> dVar2) {
        super(dVar2);
        this.f184814b = dVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f184813a = obj;
        this.f184815c |= Integer.MIN_VALUE;
        return d.x4(this.f184814b, this);
    }
}
