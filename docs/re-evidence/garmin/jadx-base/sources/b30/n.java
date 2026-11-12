package b30;

import com.garmin.android.apps.connectmobile.v2;
import com.google.android.gms.maps.model.LatLng;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lb30/n;", "", "Ld60/b;", "coursesRepo", "Lz20/r;", "getOnCourseRouteFeaturesUseCase", "<init>", "(Ld60/b;Lz20/r;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d60.b f15550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z20.r f15551b;

    static {
        d60.b.a aVar = d60.b.f57806c;
    }

    public n(d60.b bVar, z20.r rVar) {
        bVar.getClass();
        rVar.getClass();
        this.f15550a = bVar;
        this.f15551b = rVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object a(n nVar, LatLng latLng, com.garmin.android.apps.connectmobile.courses.model.i iVar, n30.e eVar, v13.c cVar) {
        l lVar;
        k30.v vVar;
        nVar.getClass();
        if (cVar instanceof l) {
            lVar = (l) cVar;
            int i14 = lVar.f15541c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                lVar.f15541c = i14 - Integer.MIN_VALUE;
            } else {
                lVar = new l(nVar, cVar);
            }
        } else {
            lVar = new l(nVar, cVar);
        }
        Object objC = lVar.f15539a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = lVar.f15541c;
        if (i15 == 0) {
            o13.r.b(objC);
            d60.b bVar = nVar.f15550a;
            String str = eVar.f123451f.f181491b;
            double d14 = eVar.f123450e;
            k30.k kVar = eVar.f123446a;
            Boolean boolValueOf = iVar.c() ? Boolean.valueOf(eVar.f123447b) : null;
            Boolean boolValueOf2 = iVar.c() ? Boolean.valueOf(eVar.f123448c) : null;
            Boolean boolValueOf3 = iVar.c() ? Boolean.valueOf(eVar.f123449d) : null;
            lVar.f15541c = 1;
            objC = bVar.C(new d60.m(bVar, latLng, str, iVar, d14, kVar, boolValueOf, boolValueOf2, boolValueOf3, null), lVar);
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
        if (!(v2Var instanceof v2.b) || (vVar = (k30.v) ((v2.b) v2Var).f47386a) == null) {
            return null;
        }
        return vVar.a();
    }
}
