package su0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.livetrackui.data.repository.ConnectionsRepository", f = "ConnectionsRepository.kt", l = {87}, m = "updateGroupTrackConnections", v = 2)
public final class g extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f160959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f160960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f160961c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, t13.d<? super g> dVar) {
        super(dVar);
        this.f160960b = hVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f160959a = obj;
        this.f160961c |= Integer.MIN_VALUE;
        return this.f160960b.e(this);
    }
}
