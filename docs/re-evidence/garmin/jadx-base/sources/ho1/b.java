package ho1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.social.conversation.follow.likes.FollowCommentLikePagingSource", f = "FollowCommentLikePagingSource.kt", l = {34}, m = "convertToViewData", v = 2)
public final class b extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f84782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f84783b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f84784c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, t13.d<? super b> dVar2) {
        super(dVar2);
        this.f84783b = dVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f84782a = obj;
        this.f84784c |= Integer.MIN_VALUE;
        return this.f84783b.f(null, this);
    }
}
