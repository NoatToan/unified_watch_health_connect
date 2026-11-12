package pk2;

import java.util.ArrayList;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.device.filetransfer.core.agent.AgentQueueHelper", f = "AgentQueueHelper.kt", l = {582}, m = "createDownloadItems")
public final class e extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f138382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f138383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f138384c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f138385d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(b bVar, t13.d<? super e> dVar) {
        super(dVar);
        this.f138384c = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f138383b = obj;
        this.f138385d |= Integer.MIN_VALUE;
        return b.a(this.f138384c, null, null, this);
    }
}
