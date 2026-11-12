package g30;

import com.garmin.android.apps.connectmobile.courses.model.CourseSegmentDTO;
import com.garmin.android.apps.connectmobile.v2;
import d60.g0;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lg30/t;", "", "Ld60/b;", "coursesRepo", "<init>", "(Ld60/b;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d60.b f75678a;

    static {
        d60.b.a aVar = d60.b.f57806c;
    }

    public t(d60.b bVar) {
        bVar.getClass();
        this.f75678a = bVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0092, code lost:
    
        if (r10 == r1) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(com.garmin.android.apps.connectmobile.courses.model.e eVar, v13.c cVar) {
        s sVar;
        if (cVar instanceof s) {
            sVar = (s) cVar;
            int i14 = sVar.f75677d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                sVar.f75677d = i14 - Integer.MIN_VALUE;
            } else {
                sVar = new s(this, cVar);
            }
        } else {
            sVar = new s(this, cVar);
        }
        Object objI = sVar.f75675b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = sVar.f75677d;
        d60.b bVar = this.f75678a;
        if (i15 == 0) {
            o13.r.b(objI);
            String str = eVar.courseId;
            if (str != null && str.length() != 0) {
                sVar.f75674a = eVar;
                sVar.f75677d = 1;
                objI = bVar.i(str, eVar, sVar);
                if (objI != aVar) {
                }
                return aVar;
            }
            return null;
        }
        if (i15 == 1) {
            eVar = sVar.f75674a;
            o13.r.b(objI);
        } else {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            eVar = sVar.f75674a;
            o13.r.b(objI);
        }
        v2 v2Var = (v2) objI;
        if (v2Var instanceof v2.b) {
            eVar.h0((List) ((v2.b) v2Var).f47386a);
            return eVar;
        }
        return null;
        v2 v2Var2 = (v2) objI;
        if (v2Var2 instanceof v2.b) {
            List<CourseSegmentDTO> listI = eVar.i();
            if (listI != null && !listI.isEmpty()) {
                for (CourseSegmentDTO courseSegmentDTO : listI) {
                    courseSegmentDTO.i(eVar.getGeoRoutePk());
                    courseSegmentDTO.g(eVar.courseId);
                }
                sVar.f75674a = eVar;
                sVar.f75677d = 2;
                objI = bVar.C(new g0(listI, bVar, null), sVar);
            }
            return eVar;
        }
        if (!(v2Var2 instanceof v2.a)) {
            u0.r();
            return null;
        }
        return null;
    }
}
