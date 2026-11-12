package pm1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.sleep.domain.GetCachedSleepDataUseCase", f = "GetCachedSleepDataUseCase.kt", l = {93}, m = "getAndSaveLastDateWithSleepData", v = 2)
public final class c extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f138629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f138630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f138631c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar, t13.d<? super c> dVar) {
        super(dVar);
        this.f138630b = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f138629a = obj;
        this.f138631c |= Integer.MIN_VALUE;
        int i14 = a.f138626c;
        return this.f138630b.a(null, null, this);
    }
}
