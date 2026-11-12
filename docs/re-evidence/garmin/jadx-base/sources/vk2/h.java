package vk2;

import ch.qos.logback.core.net.SyslogConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.device.filetransfer.core.background.SyncStartListener", f = "SyncStartListener.kt", l = {SyslogConstants.LOG_LOCAL1}, m = "await")
public final class h extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g f178679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f178680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f178681c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f178682d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(g gVar, t13.d<? super h> dVar) {
        super(dVar);
        this.f178681c = gVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f178680b = obj;
        this.f178682d |= Integer.MIN_VALUE;
        return this.f178681c.a(this);
    }
}
