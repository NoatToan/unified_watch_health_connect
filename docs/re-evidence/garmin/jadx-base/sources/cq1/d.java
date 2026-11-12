package cq1;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcq1/d;", "Lcq1/o;", "Lzp/e;", "availableMetricsRepository", "<init>", "(Lzp/e;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zp.e f55187a;

    static {
        int i14 = zp.e.f206552c;
    }

    public d(zp.e eVar) {
        eVar.getClass();
        this.f55187a = eVar;
    }

    @Override // cq1.o
    public final Object a(t13.d<? super Unit> dVar) {
        Object objA = this.f55187a.a((v13.c) dVar);
        return objA == u13.a.COROUTINE_SUSPENDED ? objA : Unit.INSTANCE;
    }
}
