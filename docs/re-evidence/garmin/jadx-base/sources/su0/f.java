package su0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.livetrackui.data.repository.ConnectionsRepository", f = "ConnectionsRepository.kt", l = {65}, m = "getGroupTrackConnections", v = 2)
public final class f extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f160956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f160957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f160958c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, t13.d<? super f> dVar) {
        super(dVar);
        this.f160957b = hVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f160956a = obj;
        this.f160958c |= Integer.MIN_VALUE;
        return this.f160957b.c(this);
    }
}
