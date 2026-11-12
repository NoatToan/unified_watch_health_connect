package o8;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@v13.e(c = "androidx.health.connect.client.impl.HealthConnectClientImpl", f = "HealthConnectClientImpl.kt", l = {101}, m = "getGrantedPermissions")
public final class c extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f130798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f130799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f130800c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar, t13.d<? super c> dVar) {
        super(dVar);
        this.f130799b = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f130798a = obj;
        this.f130800c |= Integer.MIN_VALUE;
        return this.f130799b.b(this);
    }
}
