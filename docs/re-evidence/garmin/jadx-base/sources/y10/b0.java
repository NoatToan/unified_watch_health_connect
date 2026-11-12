package y10;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.connectiq.viewmodel.ConnectIQDownloadViewModel", f = "ConnectIQDownloadViewModel.kt", l = {249}, m = "onIconTaskCompleted", v = 2)
public final class b0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public n0.d f193783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f193784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f193785c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k f193786d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f193787e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(k kVar, t13.d<? super b0> dVar) {
        super(dVar);
        this.f193786d = kVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f193785c = obj;
        this.f193787e |= Integer.MIN_VALUE;
        int i14 = k.f193901y;
        return this.f193786d.I4(null, null, this);
    }
}
