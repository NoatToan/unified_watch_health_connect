package d60;

import com.google.android.gms.maps.model.LatLngBounds;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lk30/l;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.repo.CoursesRepo$searchCourses$2", f = "CoursesRepo.kt", l = {210}, m = "invokeSuspend", v = 2)
public final class j0 extends v13.i implements e23.l<t13.d<? super c83.a0<k30.l>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f57870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f57871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LatLngBounds f57872c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(b bVar, LatLngBounds latLngBounds, t13.d<? super j0> dVar) {
        super(1, dVar);
        this.f57871b = bVar;
        this.f57872c = latLngBounds;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new j0(this.f57871b, this.f57872c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<k30.l>> dVar) {
        return ((j0) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f57870a;
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
        a aVarB = this.f57871b.b();
        LatLngBounds latLngBounds = this.f57872c;
        o53.i0<c83.a0<k30.l>> i0VarP = aVarB.P(String.valueOf(latLngBounds.northeast.latitude), String.valueOf(latLngBounds.southwest.latitude), String.valueOf(latLngBounds.northeast.longitude), String.valueOf(latLngBounds.southwest.longitude), "100");
        this.f57870a = 1;
        Object objAwait = i0VarP.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
