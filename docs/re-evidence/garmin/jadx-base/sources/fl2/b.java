package fl2;

import o13.p;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.device.filetransfer.gc.download.ConnectDownloadAgent", f = "ConnectDownloadAgent.kt", l = {429}, m = "acknowledgeFile$suspendImpl")
public final class b extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f72040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public rs2.c f72041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p f72042c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f72043d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f72044e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a f72045f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f72046g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, t13.d<? super b> dVar) {
        super(dVar);
        this.f72045f = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f72044e = obj;
        this.f72046g |= Integer.MIN_VALUE;
        return a.a(this.f72045f, null, null, null, this);
    }
}
