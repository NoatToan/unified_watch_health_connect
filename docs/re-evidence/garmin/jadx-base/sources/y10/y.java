package y10;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.connectiq.viewmodel.ConnectIQDownloadViewModel", f = "ConnectIQDownloadViewModel.kt", l = {897}, m = "isSoftwareUpdateInProgress", v = 2)
public final class y extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f194015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f194016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f194017c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(k kVar, t13.d<? super y> dVar) {
        super(dVar);
        this.f194016b = kVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f194015a = obj;
        this.f194017c |= Integer.MIN_VALUE;
        return k.z4(this.f194016b, this);
    }
}
