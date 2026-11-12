package fr1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.strava.GetConsumerPermissionsTask", f = "GetConsumerPermissionsTask.kt", l = {17, 19, 23}, m = "execute", v = 2)
public final class c extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f73293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.strava.d f73294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f73295c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.garmin.android.apps.connectmobile.strava.d dVar, t13.d<? super c> dVar2) {
        super(dVar2);
        this.f73294b = dVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f73293a = obj;
        this.f73295c |= Integer.MIN_VALUE;
        return this.f73294b.a(this);
    }
}
