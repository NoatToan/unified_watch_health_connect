package pk2;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.device.filetransfer.core.agent.AgentQueueHelper", f = "AgentQueueHelper.kt", l = {311, 320, 328}, m = "queueUploadItems")
public final class o extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f138449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f138450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ok2.y f138451c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f138452d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b f138453e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f138454f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(b bVar, t13.d<? super o> dVar) {
        super(dVar);
        this.f138453e = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f138452d = obj;
        this.f138454f |= Integer.MIN_VALUE;
        int i14 = b.f138357m;
        return this.f138453e.l(null, null, this);
    }
}
