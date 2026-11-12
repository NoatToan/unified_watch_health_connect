package pk2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.device.filetransfer.core.agent.AgentQueueHelper", f = "AgentQueueHelper.kt", l = {417, 418}, m = "refreshDeviceFileList")
public final class s extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f138477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f138478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f138479c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f138480d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(b bVar, t13.d<? super s> dVar) {
        super(dVar);
        this.f138479c = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f138478b = obj;
        this.f138480d |= Integer.MIN_VALUE;
        return b.d(this.f138479c, this);
    }
}
