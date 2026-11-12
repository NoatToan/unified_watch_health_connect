package ff1;

import b63.o;
import c83.a0;
import e23.l;
import java.util.List;
import o13.r;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Lef1/d;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.running_tolerance.data.repository.RunningToleranceRepositoryImpl$getRunningToleranceWeeklyMetrics$2", f = "RunningToleranceRepositoryImpl.kt", l = {42}, m = "invokeSuspend", v = 2)
public final class d extends i implements l<t13.d<? super a0<List<? extends ef1.d>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f71124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f71125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f71126c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o f71127d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f71128e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, o oVar, o oVar2, String str, t13.d<? super d> dVar) {
        super(1, dVar);
        this.f71125b = fVar;
        this.f71126c = oVar;
        this.f71127d = oVar2;
        this.f71128e = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new d(this.f71125b, this.f71126c, this.f71127d, this.f71128e, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<List<? extends ef1.d>>> dVar) {
        return ((d) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f71124a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        i0<a0<List<ef1.d>>> i0VarD = this.f71125b.f71132a.d(new fz0.f(this.f71126c), new fz0.f(this.f71127d), this.f71128e);
        this.f71124a = 1;
        Object objAwait = i0VarD.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
