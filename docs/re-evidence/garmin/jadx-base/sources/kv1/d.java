package kv1;

import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Ltw1/m;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.network.FBTPlansRepo$createFBTPlan$2", f = "FBTPlansRepo.kt", l = {36}, m = "invokeSuspend", v = 2)
public final class d extends v13.i implements e23.l<t13.d<? super c83.a0<tw1.m>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f106730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f106731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ jv1.j f106732c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(b bVar, jv1.j jVar, t13.d<? super d> dVar) {
        super(1, dVar);
        this.f106731b = bVar;
        this.f106732c = jVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new d(this.f106731b, this.f106732c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<tw1.m>> dVar) {
        return ((d) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f106730a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        i0<c83.a0<tw1.m>> i0VarN = this.f106731b.f106720a.n(this.f106732c);
        this.f106730a = 1;
        Object objAwait = i0VarN.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
