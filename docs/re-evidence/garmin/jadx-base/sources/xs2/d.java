package xs2;

import com.garmin.gfdi.file.FileException;
import java.io.OutputStream;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.gfdi.file.read.ReadFileFromDeviceTask", f = "ReadFileFromDeviceTask.kt", l = {121, 129}, m = "awaitIncomingData")
public final class d extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f192099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public OutputStream f192100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f192101c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public FileException f192102d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f192103e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c f192104f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f192105g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c cVar, t13.d<? super d> dVar) {
        super(dVar);
        this.f192104f = cVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f192103e = obj;
        this.f192105g |= Integer.MIN_VALUE;
        int i14 = c.f192091h;
        return this.f192104f.a(0, null, this);
    }
}
