package d60;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Lk30/g;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.repo.CoursesRepo$getPrimaryClimbs$2", f = "CoursesRepo.kt", l = {358}, m = "invokeSuspend", v = 2)
public final class a0 extends v13.i implements e23.l<t13.d<? super c83.a0<List<? extends k30.g>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f57800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f57801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LatLngBounds f57802c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.courses.model.c f57803d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.courses.model.b f57804e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.courses.model.b f57805f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(b bVar, LatLngBounds latLngBounds, com.garmin.android.apps.connectmobile.courses.model.c cVar, com.garmin.android.apps.connectmobile.courses.model.b bVar2, com.garmin.android.apps.connectmobile.courses.model.b bVar3, t13.d<? super a0> dVar) {
        super(1, dVar);
        this.f57801b = bVar;
        this.f57802c = latLngBounds;
        this.f57803d = cVar;
        this.f57804e = bVar2;
        this.f57805f = bVar3;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new a0(this.f57801b, this.f57802c, this.f57803d, this.f57804e, this.f57805f, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<List<? extends k30.g>>> dVar) {
        return ((a0) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f57800a;
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
        a aVarB = this.f57801b.b();
        LatLngBounds latLngBounds = this.f57802c;
        LatLng latLng = latLngBounds.northeast;
        double d14 = latLng.latitude;
        LatLng latLng2 = latLngBounds.southwest;
        o53.i0<c83.a0<List<k30.g>>> i0VarQ = aVarB.Q(d14, latLng2.latitude, latLng.longitude, latLng2.longitude, this.f57803d.f32837a, this.f57804e.f32828a, this.f57805f.f32828a);
        this.f57800a = 1;
        Object objAwait = i0VarQ.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
