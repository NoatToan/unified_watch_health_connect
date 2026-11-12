package pk2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.device.filetransfer.core.agent.AgentQueueHelper", f = "AgentQueueHelper.kt", l = {243, 279, 280}, m = "doPopulateQueue$file_transfer_core_release")
public final class g extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f138400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ok2.y f138401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f138402c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f138403d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b f138404e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f138405f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(b bVar, t13.d<? super g> dVar) {
        super(dVar);
        this.f138404e = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f138403d = obj;
        this.f138405f |= Integer.MIN_VALUE;
        return this.f138404e.i(null, this);
    }
}
