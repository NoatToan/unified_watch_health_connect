package ax1;

import c83.a0;
import java.util.List;
import o13.r;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import xw1.p;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Lxw1/p;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.network.AthletePlanRepo$getWorkoutPlanType$2", f = "AthletePlanRepo.kt", l = {14}, m = "invokeSuspend", v = 2)
public final class f extends v13.i implements e23.l<t13.d<? super a0<List<? extends p>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f13627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f13628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f13629c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(b bVar, String str, t13.d<? super f> dVar) {
        super(1, dVar);
        this.f13628b = bVar;
        this.f13629c = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new f(this.f13628b, this.f13629c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<List<? extends p>>> dVar) {
        return ((f) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f13627a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        i0<a0<List<p>>> i0VarD = this.f13628b.f13614a.d(this.f13629c);
        this.f13627a = 1;
        Object objAwait = i0VarD.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
