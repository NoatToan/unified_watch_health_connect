package o8;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@v13.e(c = "androidx.health.connect.client.impl.HealthConnectClientImpl", f = "HealthConnectClientImpl.kt", l = {159}, m = "deleteRecords")
public final class b extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f130795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f130796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f130797c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, t13.d<? super b> dVar) {
        super(dVar);
        this.f130796b = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f130795a = obj;
        this.f130797c |= Integer.MIN_VALUE;
        return this.f130796b.a(null, null, this);
    }
}
