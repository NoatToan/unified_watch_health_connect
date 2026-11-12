package zj2;

import com.garmin.proto.generated.GDIDataTransferProto;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@v13.e(c = "com.garmin.device.datatransfer.DataDownloadTask", f = "DataDownloadTask.kt", l = {88}, m = "handle")
public final class a extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f204939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public GDIDataTransferProto.DataDownloadResponse.Builder f204940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f204941c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d f204942d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f204943e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, t13.d<? super a> dVar2) {
        super(dVar2);
        this.f204942d = dVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f204941c = obj;
        this.f204943e |= Integer.MIN_VALUE;
        return this.f204942d.d(null, null, this);
    }
}
