package bk2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@v13.e(c = "com.garmin.device.devicemessages.CIQMessageManager", f = "CIQMessageManager.kt", l = {104, 105}, m = "ackEvent")
public final class c extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f18521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f18522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f18523c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b f18524d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f18525e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, t13.d<? super c> dVar) {
        super(dVar);
        this.f18524d = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f18523c = obj;
        this.f18525e |= Integer.MIN_VALUE;
        return b.d(this.f18524d, 0L, null, this);
    }
}
