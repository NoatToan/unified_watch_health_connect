package ll2;

import com.google.mlkit.common.MlKitException;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.device.filetransfer.mlr.MLRTransportPipe$Companion", f = "MLRTransportPipe.kt", l = {MlKitException.CODE_SCANNER_APP_NAME_UNAVAILABLE, MlKitException.CODE_SCANNER_TASK_IN_PROGRESS}, m = "write")
public final class d extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e.a f113437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ml2.l f113438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public dz2.b f113439c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e f113440d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f113441e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f113442f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e.a f113443g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f113444h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e.a aVar, t13.d<? super d> dVar) {
        super(dVar);
        this.f113443g = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f113442f = obj;
        this.f113444h |= Integer.MIN_VALUE;
        return this.f113443g.e(null, null, null, null, this);
    }
}
