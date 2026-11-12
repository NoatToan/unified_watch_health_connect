package el2;

import com.garmin.proto.generated.GDIGarminConnect;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.device.filetransfer.gc.device.ConnectTransferService", f = "ConnectTransferService.kt", l = {218, 231}, m = "sendCutWellnessFilesRequest")
public final class d extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f64563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public GDIGarminConnect.Priority f64564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f64565c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a f64566d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f64567e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(a aVar, t13.d<? super d> dVar) {
        super(dVar);
        this.f64566d = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f64565c = obj;
        this.f64567e |= Integer.MIN_VALUE;
        return this.f64566d.d(null, this);
    }
}
