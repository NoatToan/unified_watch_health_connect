package oj0;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "Lqj0/i;", "Lqj0/a;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.gcplus.data.GCPlusRepository$fetchGCPlusEducationContent$2$educationContent$1$result$1", f = "GCPlusRepository.kt", l = {174}, m = "invokeSuspend", v = 2)
public final class k extends v13.i implements e23.l<t13.d<? super c83.a0<qj0.i<qj0.a>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f132318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f132319b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(f fVar, t13.d<? super k> dVar) {
        super(1, dVar);
        this.f132319b = fVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new k(this.f132319b, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<qj0.i<qj0.a>>> dVar) {
        return ((k) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f132318a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        f fVar = this.f132319b;
        qj0.m mVar = fVar.f132280a;
        a80.b bVar = fVar.f132284e;
        String str = (bVar.d() ? qj0.n.TEST : qj0.n.PRODUCTION).f145045a;
        String strB = f.b(fVar);
        boolean zH = bVar.h();
        this.f132318a = 1;
        Object objC = mVar.c(str, strB, zH, this);
        return objC == aVar ? aVar : objC;
    }
}
