package vk2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.device.filetransfer.core.background.SyncFinishListener", f = "SyncFinishListener.kt", l = {100}, m = "await")
public final class f extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e f178666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f178667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f178668c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f178669d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(e eVar, t13.d<? super f> dVar) {
        super(dVar);
        this.f178668c = eVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f178667b = obj;
        this.f178669d |= Integer.MIN_VALUE;
        return this.f178668c.a(this);
    }
}
