package t20;

import c83.a0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.google.android.gms.maps.model.LatLng;
import java.util.List;
import o13.r;
import o53.i0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lcom/garmin/android/apps/connectmobile/courses/model/e;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.biz.CourseDataRepo$getElevationForPoints$2", f = "CourseDataRepo.kt", l = {29, 31}, m = "invokeSuspend", v = 2)
public final class c extends v13.i implements e23.l<t13.d<? super a0<com.garmin.android.apps.connectmobile.courses.model.e>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f161767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List<LatLng> f161768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f161769c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(List<LatLng> list, b bVar, t13.d<? super c> dVar) {
        super(1, dVar);
        this.f161768b = list;
        this.f161769c = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new c(this.f161768b, this.f161769c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<com.garmin.android.apps.connectmobile.courses.model.e>> dVar) {
        return ((c) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x007c, code lost:
    
        if (r7 == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0094, code lost:
    
        if (r7 == r0) goto L23;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f161767a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return (a0) obj;
            }
            if (i14 == 2) {
                r.b(obj);
                return (a0) obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        boolean zF = ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).f();
        b bVar = this.f161769c;
        List<LatLng> list = this.f161768b;
        if (zF && (com.garmin.android.library.mapsdkadapter.m.f(list.get(0)) || com.garmin.android.library.mapsdkadapter.m.g(list.get(0)))) {
            String strN = fb1.c.n("courseCoordinateSystem : ", bVar.f161765a.name());
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.b(a2Var, "courseElevation", strN);
            i0<a0<com.garmin.android.apps.connectmobile.courses.model.e>> i0VarA = bVar.f161766b.a(bVar.f161765a.name(), true, b.a.a(b.f161764c, list));
            this.f161767a = 1;
            obj = i0VarA.await(this);
        } else {
            i0<a0<com.garmin.android.apps.connectmobile.courses.model.e>> i0VarB = bVar.f161766b.b(true, b.a.a(b.f161764c, list));
            this.f161767a = 2;
            obj = i0VarB.await(this);
        }
        return aVar;
    }
}
