package fr1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.strava.GrantConsumerPermissionTask", f = "GrantConsumerPermissionTask.kt", l = {19, 21, 25}, m = "execute", v = 2)
public final class e extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f73299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.strava.j f73300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f73301c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.garmin.android.apps.connectmobile.strava.j jVar, t13.d<? super e> dVar) {
        super(dVar);
        this.f73300b = jVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f73299a = obj;
        this.f73301c |= Integer.MIN_VALUE;
        return this.f73300b.a(this);
    }
}
