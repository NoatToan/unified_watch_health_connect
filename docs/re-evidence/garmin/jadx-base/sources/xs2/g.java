package xs2;

import java.io.OutputStream;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.gfdi.file.read.ReadFileFromDeviceTask", f = "ReadFileFromDeviceTask.kt", l = {55, 56}, m = "readFile")
public final class g extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public OutputStream f192116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f192117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f192118c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c f192119d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f192120e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(c cVar, t13.d<? super g> dVar) {
        super(dVar);
        this.f192119d = cVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f192118c = obj;
        this.f192120e |= Integer.MIN_VALUE;
        return this.f192119d.b(null, this);
    }
}
