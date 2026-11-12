package d60;

import com.garmin.android.apps.connectmobile.courses.model.PointOfInterestDTO;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Lcom/garmin/android/apps/connectmobile/courses/model/PointOfInterestDTO;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.repo.CoursesRepo$getPointsOfInterest$2", f = "CoursesRepo.kt", l = {338}, m = "invokeSuspend", v = 2)
public final class z extends v13.i implements e23.l<t13.d<? super c83.a0<List<? extends PointOfInterestDTO>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f57962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f57963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LatLngBounds f57964c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f57965d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List<String> f57966e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(b bVar, LatLngBounds latLngBounds, int i14, List<String> list, t13.d<? super z> dVar) {
        super(1, dVar);
        this.f57963b = bVar;
        this.f57964c = latLngBounds;
        this.f57965d = i14;
        this.f57966e = list;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new z(this.f57963b, this.f57964c, this.f57965d, this.f57966e, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<List<? extends PointOfInterestDTO>>> dVar) {
        return ((z) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f57962a;
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
        a aVarB = this.f57963b.b();
        LatLngBounds latLngBounds = this.f57964c;
        LatLng latLng = latLngBounds.northeast;
        double d14 = latLng.latitude;
        LatLng latLng2 = latLngBounds.southwest;
        o53.i0<c83.a0<List<PointOfInterestDTO>>> i0VarJ = aVarB.J(d14, latLng2.latitude, latLng.longitude, latLng2.longitude, this.f57965d, this.f57966e);
        this.f57962a = 1;
        Object objAwait = i0VarJ.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
