package bl2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.device.filetransfer.core.tasks.AbstractActiveTransfer", f = "AbstractActiveTransfer.kt", l = {511}, m = "resetDataSink$file_transfer_core_release")
public final class g extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f18658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public wk2.d f18659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f18660c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f18661d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b f18662e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f18663f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(b bVar, t13.d<? super g> dVar) {
        super(dVar);
        this.f18662e = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f18661d = obj;
        this.f18663f |= Integer.MIN_VALUE;
        return this.f18662e.k(null, null, this);
    }
}
