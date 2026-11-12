package y10;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.connectiq.viewmodel.ConnectIQDownloadViewModel", f = "ConnectIQDownloadViewModel.kt", l = {337}, m = "installLegacyApp", v = 2)
public final class w extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o10.b f194005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f194006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f194007c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f194008d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(k kVar, t13.d<? super w> dVar) {
        super(dVar);
        this.f194007c = kVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f194006b = obj;
        this.f194008d |= Integer.MIN_VALUE;
        return k.y4(this.f194007c, null, this);
    }
}
