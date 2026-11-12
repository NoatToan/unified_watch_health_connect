package pk2;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.r0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.device.filetransfer.core.agent.AgentQueueHelper", f = "AgentQueueHelper.kt", l = {343, 345}, m = "queueAllUploadItems")
public final class n extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f138441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f138442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public r0 f138443c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public r0 f138444d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f138445e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f138446f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ b f138447g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f138448h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(b bVar, t13.d<? super n> dVar) {
        super(dVar);
        this.f138447g = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f138446f = obj;
        this.f138448h |= Integer.MIN_VALUE;
        return b.c(this.f138447g, null, this);
    }
}
