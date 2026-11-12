package hz0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.newsfeed.NewsFeedRepo", f = "NewsFeedRepo.kt", l = {86}, m = "isConnectionDisconnected", v = 2)
public final class r extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f86473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f86474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f86475c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(m mVar, t13.d<? super r> dVar) {
        super(dVar);
        this.f86474b = mVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f86473a = obj;
        this.f86475c |= Integer.MIN_VALUE;
        return this.f86474b.a(0, this);
    }
}
