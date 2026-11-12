package y10;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.connectiq.viewmodel.ConnectIQDownloadViewModel", f = "ConnectIQDownloadViewModel.kt", l = {150, 158, 165}, m = "appsDownloads", v = 2)
public final class q extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public n0.d f193983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f193984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f193985c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f193986d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(k kVar, t13.d<? super q> dVar) {
        super(dVar);
        this.f193985c = kVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f193984b = obj;
        this.f193986d |= Integer.MIN_VALUE;
        int i14 = k.f193901y;
        return this.f193985c.D4(null, null, null, this);
    }
}
