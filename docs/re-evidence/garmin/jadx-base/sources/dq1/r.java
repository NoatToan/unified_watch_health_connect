package dq1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.startup.domain.IsLockedInLiveActivitySessionInProgressAtStartupUseCase", f = "IsLockedInLiveActivitySessionInProgressAtStartupUseCase.kt", l = {25}, m = "invoke", v = 2)
public final class r extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f60787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f60788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f60789c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(q qVar, t13.d<? super r> dVar) {
        super(dVar);
        this.f60788b = qVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f60787a = obj;
        this.f60789c |= Integer.MIN_VALUE;
        return this.f60788b.a(0L, this);
    }
}
