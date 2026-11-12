package cq1;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcq1/p;", "Lcq1/o;", "Lk12/a;", "userRepository", "Lf12/l;", "userSettings", "<init>", "(Lk12/a;Lf12/l;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class p implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k12.a f55213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f12.l f55214b;

    public p(k12.a aVar, f12.l lVar) {
        aVar.getClass();
        lVar.getClass();
        this.f55213a = aVar;
        this.f55214b = lVar;
    }

    @Override // cq1.o
    public final Object a(t13.d<? super Unit> dVar) {
        Object objI;
        return (this.f55214b.Q2().length() == 0 && (objI = this.f55213a.i((v13.c) dVar)) == u13.a.COROUTINE_SUSPENDED) ? objI : Unit.INSTANCE;
    }
}
