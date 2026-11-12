package cq1;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcq1/k;", "Lcq1/o;", "Lm01/a;", "myFitnessPalRepository", "<init>", "(Lm01/a;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m01.a f55198a;

    public k(m01.a aVar) {
        aVar.getClass();
        this.f55198a = aVar;
    }

    @Override // cq1.o
    public final Object a(t13.d<? super Unit> dVar) {
        Object objC = this.f55198a.c((v13.c) dVar);
        return objC == u13.a.COROUTINE_SUSPENDED ? objC : Unit.INSTANCE;
    }
}
