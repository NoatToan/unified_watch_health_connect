package d60;

import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lk30/u;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.repo.CoursesRepo$getOnCourseRouteFeatures$2", f = "CoursesRepo.kt", l = {306}, m = "invokeSuspend", v = 2)
public final class x extends v13.i implements e23.l<t13.d<? super c83.a0<k30.u>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f57956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f57957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f57958c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(b bVar, long j8, t13.d<? super x> dVar) {
        super(1, dVar);
        this.f57957b = bVar;
        this.f57958c = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new x(this.f57957b, this.f57958c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<k30.u>> dVar) {
        return ((x) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f57956a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        b.a aVar2 = b.f57806c;
        o53.i0<c83.a0<k30.u>> i0VarZ = this.f57957b.b().z(this.f57958c, true, true, true, ((rt1.m) KoinJavaComponent.get$default(rt1.m.class, null, null, 6, null)).c());
        this.f57956a = 1;
        Object objAwait = i0VarZ.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
