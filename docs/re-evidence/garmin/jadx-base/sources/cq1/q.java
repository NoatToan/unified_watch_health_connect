package cq1;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcq1/q;", "Lcq1/o;", "Loj1/a;", "settingsRepo", "<init>", "(Loj1/a;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class q implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oj1.a f55215a;

    public q(oj1.a aVar) {
        aVar.getClass();
        this.f55215a = aVar;
    }

    @Override // cq1.o
    public final Object a(t13.d<? super Unit> dVar) {
        Object objC = this.f55215a.c((v13.c) dVar);
        return objC == u13.a.COROUTINE_SUSPENDED ? objC : Unit.INSTANCE;
    }
}
