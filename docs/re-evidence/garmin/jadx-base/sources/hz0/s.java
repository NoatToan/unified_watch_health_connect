package hz0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.newsfeed.NewsFeedRepo", f = "NewsFeedRepo.kt", l = {81}, m = "isPostDeleted", v = 2)
public final class s extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f86476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f86477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f86478c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(m mVar, t13.d<? super s> dVar) {
        super(dVar);
        this.f86477b = mVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f86476a = obj;
        this.f86478c |= Integer.MIN_VALUE;
        return this.f86477b.b(0L, this);
    }
}
