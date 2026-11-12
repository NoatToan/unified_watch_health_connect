package fl2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.device.filetransfer.gc.download.ConnectDownloadAgent", f = "ConnectDownloadAgent.kt", l = {246, 248}, m = "forceGCCheckForSoftwareUpdates$file_transfer_gc_release")
public final class c extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f72047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public rs2.c f72048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f72049c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f72050d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a f72051e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f72052f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar, t13.d<? super c> dVar) {
        super(dVar);
        this.f72051e = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f72050d = obj;
        this.f72052f |= Integer.MIN_VALUE;
        return this.f72051e.g(null, this, false);
    }
}
