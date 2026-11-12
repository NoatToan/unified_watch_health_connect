package ho1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.social.conversation.follow.likes.FollowCommentLikePagingSource", f = "FollowCommentLikePagingSource.kt", l = {26}, m = "fetchDtoList", v = 2)
public final class c extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f84785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f84786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f84787c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, t13.d<? super c> dVar2) {
        super(dVar2);
        this.f84786b = dVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f84785a = obj;
        this.f84787c |= Integer.MIN_VALUE;
        return this.f84786b.g(0, 0, this);
    }
}
