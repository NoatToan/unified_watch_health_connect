package vs2;

import ch.qos.logback.core.net.SyslogConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.gfdi.event.SyncMessageManager", f = "SyncMessageManager.kt", l = {SyslogConstants.LOG_LOCAL2}, m = "requestSync")
public final class g extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f179945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f179946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f179947c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, t13.d<? super g> dVar) {
        super(dVar);
        this.f179946b = iVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f179945a = obj;
        this.f179947c |= Integer.MIN_VALUE;
        return this.f179946b.b(this);
    }
}
