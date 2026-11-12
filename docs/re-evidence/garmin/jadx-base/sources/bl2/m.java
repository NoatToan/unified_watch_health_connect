package bl2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.device.filetransfer.core.tasks.AbstractActiveTransfer", f = "AbstractActiveTransfer.kt", l = {379, 385, 388}, m = "writeWithRetry")
public final class m extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f18680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public lk2.b f18681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public wk2.i f18682c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e23.p f18683d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f18684e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f18685f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ b f18686g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f18687h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(b bVar, t13.d<? super m> dVar) {
        super(dVar);
        this.f18686g = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f18685f = obj;
        this.f18687h |= Integer.MIN_VALUE;
        return this.f18686g.p(null, null, null, this);
    }
}
