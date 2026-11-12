package r10;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.connectiq.repo.ConnectIQDownloadRepo", f = "ConnectIQDownloadRepo.kt", l = {42}, m = "getAppUpdates", v = 2)
public final class f extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f149348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f149349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f149350c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d dVar, t13.d<? super f> dVar2) {
        super(dVar2);
        this.f149349b = dVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f149348a = obj;
        this.f149350c |= Integer.MIN_VALUE;
        return this.f149349b.b(null, null, this);
    }
}
