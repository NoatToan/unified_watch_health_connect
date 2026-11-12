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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Lef1/b;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.running_tolerance.data.repository.RunningToleranceRepositoryImpl$getRunningToleranceMetrics$2", f = "RunningToleranceRepositoryImpl.kt", l = {28}, m = "invokeSuspend", v = 2)
public final class b extends i implements l<t13.d<? super a0<List<? extends ef1.b>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f71117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f71118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f71119c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o f71120d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f71121e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(f fVar, o oVar, o oVar2, String str, t13.d<? super b> dVar) {
        super(1, dVar);
        this.f71118b = fVar;
        this.f71119c = oVar;
        this.f71120d = oVar2;
        this.f71121e = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new b(this.f71118b, this.f71119c, this.f71120d, this.f71121e, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<List<? extends ef1.b>>> dVar) {
        return ((b) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f71117a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        i0<a0<List<ef1.b>>> i0VarB = this.f71118b.f71132a.b(new fz0.f(this.f71119c), new fz0.f(this.f71120d), this.f71121e);
        this.f71117a = 1;
        Object objAwait = i0VarB.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
