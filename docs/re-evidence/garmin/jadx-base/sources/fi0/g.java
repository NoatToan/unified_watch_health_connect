package fi0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.follow.data.MyFollowingPagingSource", f = "MyFollowingPagingSource.kt", l = {27}, m = "fetchDtoList", v = 2)
public final class g extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f71680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f71681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f71682c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, t13.d<? super g> dVar) {
        super(dVar);
        this.f71681b = hVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f71680a = obj;
        this.f71682c |= Integer.MIN_VALUE;
        return this.f71681b.g(0, 0, this);
    }
}
