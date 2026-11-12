package fi0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.follow.data.OthersFollowingPagingSource", f = "OthersFollowingPagingSource.kt", l = {29}, m = "fetchDtoList", v = 2)
public final class o extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f71719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f71720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f71721c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar, t13.d<? super o> dVar) {
        super(dVar);
        this.f71720b = pVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f71719a = obj;
        this.f71721c |= Integer.MIN_VALUE;
        return this.f71720b.g(0, 0, this);
    }
}
