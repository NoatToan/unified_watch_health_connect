package ei0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.follow.BaseFollowUserListPagingSource", f = "BaseFollowUserListPagingSource.kt", l = {26, 27}, m = "load$suspendImpl", v = 2)
public final class a<T> extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f64174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f64175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f64176c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b<T> f64177d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f64178e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b<T> bVar, t13.d<? super a> dVar) {
        super(dVar);
        this.f64177d = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f64176c = obj;
        this.f64178e |= Integer.MIN_VALUE;
        return b.h(this.f64177d, null, this);
    }
}
