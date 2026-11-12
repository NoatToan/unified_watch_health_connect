package ho1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.social.conversation.follow.likes.FollowGroupActivityFeedLikePagingSource", f = "FollowGroupActivityFeedLikePagingSource.kt", l = {34}, m = "fetchDtoList", v = 2)
public final class i extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f84804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f84805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f84806c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, t13.d<? super i> dVar) {
        super(dVar);
        this.f84805b = jVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f84804a = obj;
        this.f84806c |= Integer.MIN_VALUE;
        return this.f84805b.g(0, 0, this);
    }
}
