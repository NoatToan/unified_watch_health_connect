package fr1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.strava.GetOAuthTokensTask", f = "GetOAuthTokensTask.kt", l = {17, 19, 23}, m = "execute", v = 2)
public final class d extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f73296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.strava.g f73297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f73298c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.garmin.android.apps.connectmobile.strava.g gVar, t13.d<? super d> dVar) {
        super(dVar);
        this.f73297b = gVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f73296a = obj;
        this.f73298c |= Integer.MIN_VALUE;
        return this.f73297b.a(this);
    }
}
