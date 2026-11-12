package ll2;

import org.slf4j.Logger;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.device.filetransfer.mlr.MLRTransportPipe$Companion", f = "MLRTransportPipe.kt", l = {217, 223}, m = "openService")
public final class b extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Logger f113425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f113426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e.a f113427c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f113428d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e.a aVar, t13.d<? super b> dVar) {
        super(dVar);
        this.f113427c = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f113426b = obj;
        this.f113428d |= Integer.MIN_VALUE;
        return this.f113427c.b(null, 0, null, this);
    }
}
