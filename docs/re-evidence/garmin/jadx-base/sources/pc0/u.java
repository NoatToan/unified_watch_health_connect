package pc0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.devices.repo.DevicesRepo", f = "DevicesRepo.kt", l = {363}, m = "getDeviceRegistrationDetails", v = 2)
public final class u extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f137294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f137295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f137296c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(j jVar, t13.d<? super u> dVar) {
        super(dVar);
        this.f137295b = jVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f137294a = obj;
        this.f137296c |= Integer.MIN_VALUE;
        return this.f137295b.g(null, this);
    }
}
