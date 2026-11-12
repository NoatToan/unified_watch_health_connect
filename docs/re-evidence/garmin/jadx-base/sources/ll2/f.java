package ll2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.device.filetransfer.mlr.MLRTransportPipe", f = "MLRTransportPipe.kt", l = {375, 378}, m = "configure")
public final class f extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e f113462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f113463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f113464c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f113465d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(e eVar, t13.d<? super f> dVar) {
        super(dVar);
        this.f113464c = eVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f113463b = obj;
        this.f113465d |= Integer.MIN_VALUE;
        e.a aVar = e.f113445l;
        return this.f113464c.a(null, 0, this);
    }
}
