package fl2;

import java.util.ArrayList;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.device.filetransfer.gc.download.ConnectDownloadAgent", f = "ConnectDownloadAgent.kt", l = {217, 224}, m = "refreshDownloadList$file_transfer_gc_release")
public final class f extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f72062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f72063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f72064c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f72065d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a f72066e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f72067f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(a aVar, t13.d<? super f> dVar) {
        super(dVar);
        this.f72066e = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f72065d = obj;
        this.f72067f |= Integer.MIN_VALUE;
        return this.f72066e.y(null, this, false);
    }
}
