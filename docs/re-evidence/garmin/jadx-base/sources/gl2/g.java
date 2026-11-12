package gl2;

import java.util.UUID;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.device.filetransfer.gc.upload.ConnectUploadAgent", f = "ConnectUploadAgent.kt", l = {741}, m = "removeFlags$file_transfer_gc_release")
public final class g extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f77946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public UUID f77947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f77948c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a f77949d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f77950e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(a aVar, t13.d<? super g> dVar) {
        super(dVar);
        this.f77949d = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f77948c = obj;
        this.f77950e |= Integer.MIN_VALUE;
        return this.f77949d.G(null, null, this);
    }
}
