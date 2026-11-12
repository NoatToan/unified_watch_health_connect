package gl2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.device.filetransfer.gc.upload.ConnectUploadAgent", f = "ConnectUploadAgent.kt", l = {775}, m = "onBatchFinished$suspendImpl")
public final class e extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f77930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public rs2.c f77931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f77932c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a f77933d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f77934e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(a aVar, t13.d<? super e> dVar) {
        super(dVar);
        this.f77933d = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f77932c = obj;
        this.f77934e |= Integer.MIN_VALUE;
        return a.C(this.f77933d, null, this);
    }
}
