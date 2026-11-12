package q12;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.userprofile.presentation.follow.block.FollowBlockedUsersPagingSource", f = "FollowBlockedUsersPagingSource.kt", l = {17}, m = "fetchDtoList", v = 2)
public final class b extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f142080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f142081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f142082c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, t13.d<? super b> dVar) {
        super(dVar);
        this.f142081b = cVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f142080a = obj;
        this.f142082c |= Integer.MIN_VALUE;
        return this.f142081b.g(0, 0, this);
    }
}
