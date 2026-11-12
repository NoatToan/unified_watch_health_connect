package ax1;

import c83.a0;
import o13.r;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import ww1.f0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lww1/f0;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.network.BasicPlansRepo$getTrainingPlans$2", f = "BasicPlansRepo.kt", l = {22}, m = "invokeSuspend", v = 2)
public final class m extends v13.i implements e23.l<t13.d<? super a0<f0>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f13644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f13645b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(i iVar, t13.d<? super m> dVar) {
        super(1, dVar);
        this.f13645b = iVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new m(this.f13645b, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<f0>> dVar) {
        return ((m) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f13644a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        i0<a0<f0>> i0VarA = this.f13645b.f13634a.a();
        this.f13644a = 1;
        Object objAwait = i0VarA.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
