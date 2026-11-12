package xs2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.gfdi.file.read.ReadFileFromDeviceTask", f = "ReadFileFromDeviceTask.kt", l = {81, 94, 95}, m = "sendDownloadRequest")
public final class h extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f192121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f192122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f192123c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f192124d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(c cVar, t13.d<? super h> dVar) {
        super(dVar);
        this.f192123c = cVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f192122b = obj;
        this.f192124d |= Integer.MIN_VALUE;
        int i14 = c.f192091h;
        return this.f192123c.c(0, this);
    }
}
