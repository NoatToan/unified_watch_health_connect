package r10;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.connectiq.repo.ConnectIQDownloadRepo", f = "ConnectIQDownloadRepo.kt", l = {58}, m = "getAppsDownloads", v = 2)
public final class g extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f149351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f149352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f149353c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(d dVar, t13.d<? super g> dVar2) {
        super(dVar2);
        this.f149352b = dVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f149351a = obj;
        this.f149353c |= Integer.MIN_VALUE;
        return this.f149352b.c(null, null, null, null, this);
    }
}
