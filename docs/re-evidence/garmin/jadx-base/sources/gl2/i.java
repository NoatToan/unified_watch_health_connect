package gl2;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.r0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.device.filetransfer.gc.upload.ConnectUploadAgent", f = "ConnectUploadAgent.kt", l = {536, 561, 576, 586}, m = "uploadFile$suspendImpl")
public final class i extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f77957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public rs2.c f77958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public wk2.n f77959c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f77960d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public hy2.c f77961e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public r0 f77962f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f77963g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ a f77964h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f77965i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(a aVar, t13.d<? super i> dVar) {
        super(dVar);
        this.f77964h = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f77963g = obj;
        this.f77965i |= Integer.MIN_VALUE;
        return a.I(this.f77964h, null, null, null, this);
    }
}
