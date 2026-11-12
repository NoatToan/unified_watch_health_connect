package cq1;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcq1/b;", "Lcq1/o;", "Lpc0/j;", "devicesRepository", "<init>", "(Lpc0/j;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pc0.j f55185a;

    static {
        pc0.j.a aVar = pc0.j.f137223i;
    }

    public b(pc0.j jVar) {
        jVar.getClass();
        this.f55185a = jVar;
    }

    @Override // cq1.o
    public final Object a(t13.d<? super Unit> dVar) {
        Object objD = pc0.j.d(this.f55185a, false, (v13.c) dVar);
        return objD == u13.a.COROUTINE_SUSPENDED ? objD : Unit.INSTANCE;
    }
}
