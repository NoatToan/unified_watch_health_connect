package ho1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.social.conversation.follow.likes.FollowDefaultLikePagingSource", f = "FollowDefaultLikePagingSource.kt", l = {47}, m = "convertToViewData", v = 2)
public final class e extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f84791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f84792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f84793c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, t13.d<? super e> dVar) {
        super(dVar);
        this.f84792b = gVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f84791a = obj;
        this.f84793c |= Integer.MIN_VALUE;
        return this.f84792b.f(null, this);
    }
}
