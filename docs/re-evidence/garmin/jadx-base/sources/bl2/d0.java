package bl2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.device.filetransfer.core.tasks.WriteActiveTransfer", f = "WriteActiveTransfer.kt", l = {52, 58, 59, 60, 79, 82, 93}, m = "doExecute")
public final class d0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e0 f18633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f18634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f18635c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f18636d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public pk2.x f18637e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f18638f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f18639g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e0 f18640h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f18641i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(e0 e0Var, t13.d<? super d0> dVar) {
        super(dVar);
        this.f18640h = e0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f18639g = obj;
        this.f18641i |= Integer.MIN_VALUE;
        return this.f18640h.c(null, this);
    }
}
