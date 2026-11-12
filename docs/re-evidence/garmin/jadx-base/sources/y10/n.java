package y10;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.connectiq.viewmodel.ConnectIQDownloadViewModel", f = "ConnectIQDownloadViewModel.kt", l = {181, 186, 194}, m = "appUpdates", v = 2)
public final class n extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public n0.d f193952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f193953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f193954c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f193955d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(k kVar, t13.d<? super n> dVar) {
        super(dVar);
        this.f193954c = kVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f193953b = obj;
        this.f193955d |= Integer.MIN_VALUE;
        int i14 = k.f193901y;
        return this.f193954c.C4(null, null, null, this);
    }
}
