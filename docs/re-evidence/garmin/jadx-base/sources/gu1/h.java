package gu1;

import c83.a0;
import java.util.List;
import o13.r;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import xw1.p;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Lxw1/p;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.atp.network.ATPRepo$getGarminCoachPlanTypes$2", f = "ATPRepo.kt", l = {44}, m = "invokeSuspend", v = 2)
public final class h extends v13.i implements e23.l<t13.d<? super a0<List<? extends p>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f79075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f79076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f79077c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(b bVar, String str, t13.d<? super h> dVar) {
        super(1, dVar);
        this.f79076b = bVar;
        this.f79077c = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new h(this.f79076b, this.f79077c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<List<? extends p>>> dVar) {
        return ((h) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f79075a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        i0<a0<List<p>>> i0VarD = this.f79076b.f79048a.d(this.f79077c);
        this.f79075a = 1;
        Object objAwait = i0VarD.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
