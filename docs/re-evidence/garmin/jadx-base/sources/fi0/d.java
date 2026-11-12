package fi0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.follow.data.MyFollowerPagingSource", f = "MyFollowerPagingSource.kt", l = {27}, m = "fetchDtoList", v = 2)
public final class d extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f71665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f71666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f71667c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, t13.d<? super d> dVar) {
        super(dVar);
        this.f71666b = eVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f71665a = obj;
        this.f71667c |= Integer.MIN_VALUE;
        return this.f71666b.g(0, 0, this);
    }
}
