package el2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.device.filetransfer.gc.device.ConnectTransferService", f = "ConnectTransferService.kt", l = {278}, m = "handleCheckDownloadQueueRequest")
public final class b extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f64556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f64557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f64558c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f64559d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, t13.d<? super b> dVar) {
        super(dVar);
        this.f64558c = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f64557b = obj;
        this.f64559d |= Integer.MIN_VALUE;
        return a.c(this.f64558c, null, null, this);
    }
}
