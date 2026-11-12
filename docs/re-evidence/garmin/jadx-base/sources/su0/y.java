package su0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.livetrackui.data.repository.LiveTrackUrlShareDataSourceImpl", f = "LiveTrackUrlShareDataSourceImpl.kt", l = {21, 22}, m = "getClipData", v = 2)
public final class y extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f161016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f161017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f161018c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(v vVar, t13.d<? super y> dVar) {
        super(dVar);
        this.f161017b = vVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f161016a = obj;
        this.f161018c |= Integer.MIN_VALUE;
        return this.f161017b.a(null, this);
    }
}
