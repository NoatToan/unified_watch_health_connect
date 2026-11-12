package rm0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.group.details.feed.activity.GroupActivityFeedPagingSource", f = "GroupActivityFeedPagingSource.kt", l = {42}, m = "load", v = 2)
public final class f extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f153526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f153527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f153528c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(e eVar, t13.d<? super f> dVar) {
        super(dVar);
        this.f153527b = eVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f153526a = obj;
        this.f153528c |= Integer.MIN_VALUE;
        return this.f153527b.e(null, this);
    }
}
