package zd0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.domain.HasScreenlessDeviceRegisteredUseCase", f = "HasScreenlessDeviceRegisteredUseCase.kt", l = {11}, m = "invoke", v = 2)
public final class q extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f204114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f204115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f204116c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(s sVar, t13.d<? super q> dVar) {
        super(dVar);
        this.f204115b = sVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f204114a = obj;
        this.f204116c |= Integer.MIN_VALUE;
        return this.f204115b.a(this);
    }
}
