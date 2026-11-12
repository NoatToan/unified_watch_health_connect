package uw1;

import c83.a0;
import e23.l;
import java.util.List;
import o13.r;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Ltw1/c;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.itp.network.TrainingPlansRepo$getITPSubTypes$2", f = "TrainingPlansRepo.kt", l = {40}, m = "invokeSuspend", v = 2)
public final class d extends v13.i implements l<t13.d<? super a0<List<? extends tw1.c>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f173004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f173005b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(String str, t13.d<? super d> dVar) {
        super(1, dVar);
        this.f173005b = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new d(this.f173005b, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<List<? extends tw1.c>>> dVar) {
        return ((d) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f173004a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        b.f172999a.getClass();
        i0<a0<List<tw1.c>>> i0VarD = ((a) ez0.b.a(ez0.b.f67468a, ez0.c.GC_WEB_URL, a.class, new c83.h.a[0], null, null, null, 120)).d(this.f173005b);
        this.f173004a = 1;
        Object objAwait = i0VarD.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
