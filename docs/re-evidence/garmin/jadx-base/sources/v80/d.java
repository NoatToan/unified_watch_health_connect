package v80;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.device.passcode.domain.SendRegionRequiresPasscodeNotificationUseCase", f = "SendRegionRequiresPasscodeNotificationUseCase.kt", l = {55}, m = "getCountriesRequiringPasscode", v = 2)
public final class d extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f176209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f176210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f176211c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c cVar, t13.d<? super d> dVar) {
        super(dVar);
        this.f176210b = cVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f176209a = obj;
        this.f176211c |= Integer.MIN_VALUE;
        return c.a(this.f176210b, this);
    }
}
