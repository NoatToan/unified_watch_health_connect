package fi0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.follow.data.OthersFollowerPagingSource", f = "OthersFollowerPagingSource.kt", l = {29}, m = "fetchDtoList", v = 2)
public final class l extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f71704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f71705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f71706c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, t13.d<? super l> dVar) {
        super(dVar);
        this.f71705b = mVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f71704a = obj;
        this.f71706c |= Integer.MIN_VALUE;
        return this.f71705b.g(0, 0, this);
    }
}
