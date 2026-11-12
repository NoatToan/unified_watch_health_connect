package gl2;

import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.device.filetransfer.gc.upload.ConnectUploadAgent", f = "ConnectUploadAgent.kt", l = {809}, m = "awaitAsyncUploads")
public final class b extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Iterator f77909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f77910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f77911c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f77912d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, t13.d<? super b> dVar) {
        super(dVar);
        this.f77911c = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f77910b = obj;
        this.f77912d |= Integer.MIN_VALUE;
        a.b bVar = a.f77873r;
        return this.f77911c.g(null, this);
    }
}
