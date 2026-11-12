package o8;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@v13.e(c = "androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl", f = "HealthConnectClientUpsideDownImpl.kt", l = {118}, m = "insertRecords")
public final class g extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f130822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f130823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f130824c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(e eVar, t13.d<? super g> dVar) {
        super(dVar);
        this.f130823b = eVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f130822a = obj;
        this.f130824c |= Integer.MIN_VALUE;
        return this.f130823b.e(null, this);
    }
}
