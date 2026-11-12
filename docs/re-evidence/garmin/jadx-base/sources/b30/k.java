package b30;

import com.garmin.android.apps.connectmobile.v2;
import com.google.android.gms.maps.model.LatLng;
import java.util.List;
import p005kotlin.Metadata;
import p13.h0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lb30/k;", "", "Ld60/b;", "coursesRepo", "Lz20/r;", "getOnCourseRouteFeaturesUseCase", "Lb30/c;", "addLapCoursePointsUseCase", "<init>", "(Ld60/b;Lz20/r;Lb30/c;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d60.b f15536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z20.r f15537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f15538c;

    static {
        d60.b.a aVar = d60.b.f57806c;
    }

    public k(d60.b bVar, z20.r rVar, c cVar) {
        bVar.getClass();
        rVar.getClass();
        cVar.getClass();
        this.f15536a = bVar;
        this.f15537b = rVar;
        this.f15538c = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object a(k kVar, LatLng latLng, w20.b bVar, com.garmin.android.apps.connectmobile.courses.model.i iVar, double d14, k30.k kVar2, boolean z14, boolean z15, boolean z16, v13.c cVar) {
        i iVar2;
        k30.v vVar;
        List<com.garmin.android.apps.connectmobile.courses.model.e> listA;
        kVar.getClass();
        if (cVar instanceof i) {
            iVar2 = (i) cVar;
            int i14 = iVar2.f15521c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                iVar2.f15521c = i14 - Integer.MIN_VALUE;
            } else {
                iVar2 = new i(kVar, cVar);
            }
        } else {
            iVar2 = new i(kVar, cVar);
        }
        Object objC = iVar2.f15519a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = iVar2.f15521c;
        if (i15 == 0) {
            o13.r.b(objC);
            d60.b bVar2 = kVar.f15536a;
            String str = bVar.f181491b;
            Boolean boolValueOf = iVar.c() ? Boolean.valueOf(z14) : null;
            Boolean boolValueOf2 = iVar.c() ? Boolean.valueOf(z15) : null;
            Boolean boolValueOf3 = iVar.c() ? Boolean.valueOf(z16) : null;
            iVar2.f15521c = 1;
            objC = bVar2.C(new d60.m(bVar2, latLng, str, iVar, d14, kVar2, boolValueOf, boolValueOf2, boolValueOf3, null), iVar2);
            if (objC == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objC);
        }
        v2 v2Var = (v2) objC;
        if (!(v2Var instanceof v2.b) || (vVar = (k30.v) ((v2.b) v2Var).f47386a) == null || (listA = vVar.a()) == null) {
            return null;
        }
        return (com.garmin.android.apps.connectmobile.courses.model.e) h0.d0(listA);
    }
}
