package r41;

import c83.a0;
import e23.l;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lq41/a;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.pacepro.data.repo.PaceProApiRepository$fetchPacebandParameters$2", f = "PaceProApiRepository.kt", l = {40}, m = "invokeSuspend", v = 2)
public final class d extends i implements l<t13.d<? super a0<q41.a>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f150298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f150299b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(a aVar, t13.d<? super d> dVar) {
        super(1, dVar);
        this.f150299b = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new d(this.f150299b, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<q41.a>> dVar) {
        return ((d) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f150298a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        p41.b bVar = this.f150299b.f150291b;
        this.f150298a = 1;
        Object objA = bVar.a(this);
        return objA == aVar ? aVar : objA;
    }
}
