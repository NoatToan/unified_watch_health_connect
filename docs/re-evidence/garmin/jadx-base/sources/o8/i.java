package o8;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@v13.e(c = "androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl", f = "HealthConnectClientUpsideDownImpl.kt", l = {627}, m = "wrapPlatformException")
public final class i<T> extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f130829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f130830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f130831c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(e eVar, t13.d<? super i> dVar) {
        super(dVar);
        this.f130830b = eVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f130829a = obj;
        this.f130831c |= Integer.MIN_VALUE;
        return this.f130830b.f(null, this);
    }
}
