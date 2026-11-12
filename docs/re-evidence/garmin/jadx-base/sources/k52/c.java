package k52;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.CoroutineScopeViewModel", f = "CoroutineScopeViewModel.kt", l = {66}, m = "fetchDataAsync", v = 2)
public final class c extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f102942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d<Object> f102943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f102944c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d<Object> dVar, t13.d<? super c> dVar2) {
        super(dVar2);
        this.f102943b = dVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f102942a = obj;
        this.f102944c |= Integer.MIN_VALUE;
        return d.x4(this.f102943b, this);
    }
}
