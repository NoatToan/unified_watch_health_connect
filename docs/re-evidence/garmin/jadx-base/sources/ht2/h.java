package ht2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@v13.e(c = "com.garmin.inappupdate.InAppUpdateCheckHelper", f = "InAppUpdateCheckHelper.kt", l = {148}, m = "checkForUpdate-gIAlu-s")
public final class h extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f85651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f85652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f85653c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(n nVar, t13.d<? super h> dVar) {
        super(dVar);
        this.f85652b = nVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.f85651a = obj;
        this.f85653c |= Integer.MIN_VALUE;
        Object objA = this.f85652b.a(null, this);
        return objA == u13.a.COROUTINE_SUSPENDED ? objA : o13.q.a(objA);
    }
}
