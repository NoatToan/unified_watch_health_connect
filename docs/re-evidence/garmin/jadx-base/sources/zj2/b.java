package zj2;

import com.garmin.proto.generated.GDIDataTransferProto;
import java.util.UUID;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@v13.e(c = "com.garmin.device.datatransfer.DataDownloadTask", f = "DataDownloadTask.kt", l = {157}, m = "handle")
public final class b extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f204944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public GDIDataTransferProto.FileAccessItemRequest f204945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public mk2.d f204946c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public GDIDataTransferProto.FileAccessItemResponse.Builder f204947d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public UUID f204948e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f204949f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ d f204950g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f204951h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, t13.d<? super b> dVar2) {
        super(dVar2);
        this.f204950g = dVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f204949f = obj;
        this.f204951h |= Integer.MIN_VALUE;
        return this.f204950g.e(null, null, null, this);
    }
}
