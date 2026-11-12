package on;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.health.data.HealthSnapshotDataSource", f = "HealthSnapshotDataSource.kt", l = {20}, m = "load", v = 2)
public final class l extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f133036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f133037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f133038c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f133039d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, t13.d<? super l> dVar) {
        super(dVar);
        this.f133038c = mVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f133037b = obj;
        this.f133039d |= Integer.MIN_VALUE;
        return this.f133038c.e(null, this);
    }
}
