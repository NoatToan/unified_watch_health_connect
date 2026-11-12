package gl2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.device.filetransfer.gc.upload.UploadManagerImpl", f = "UploadManager.kt", l = {60}, m = "loadEndpoints")
public final class o extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p f77978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f77979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f77980c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f77981d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar, t13.d<? super o> dVar) {
        super(dVar);
        this.f77980c = pVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f77979b = obj;
        this.f77981d |= Integer.MIN_VALUE;
        return this.f77980c.e(null, this, false);
    }
}
