package kv1;

import java.util.List;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Ltw1/o;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.network.FBTPlansRepo$getTrainingPlans$2", f = "FBTPlansRepo.kt", l = {118}, m = "invokeSuspend", v = 2)
public final class m extends v13.i implements e23.l<t13.d<? super c83.a0<tw1.o>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f106766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f106767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f106768c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List<String> f106769d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(b bVar, String str, List<String> list, t13.d<? super m> dVar) {
        super(1, dVar);
        this.f106767b = bVar;
        this.f106768c = str;
        this.f106769d = list;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new m(this.f106767b, this.f106768c, this.f106769d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<tw1.o>> dVar) {
        return ((m) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f106766a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        i0<c83.a0<tw1.o>> i0VarH = this.f106767b.f106720a.h(1, 1000, this.f106768c, this.f106769d, null, null, null, null);
        this.f106766a = 1;
        Object objAwait = i0VarH.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
