package fr1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.strava.GetConsumerCapabilitiesTask", f = "GetConsumerCapabilitiesTask.kt", l = {18, 20, 24}, m = "execute", v = 2)
public final class b extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f73290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.strava.a f73291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f73292c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.garmin.android.apps.connectmobile.strava.a aVar, t13.d<? super b> dVar) {
        super(dVar);
        this.f73291b = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f73290a = obj;
        this.f73292c |= Integer.MIN_VALUE;
        return this.f73291b.a(this);
    }
}
