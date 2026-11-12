package sy0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.joda.time.DateTime;
import p13.y;

/* JADX INFO: loaded from: classes9.dex */
public final class s {
    public static final ArrayList a(List list) {
        list.getClass();
        ArrayList arrayList = new ArrayList(y.r(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.garmin.android.apps.connectmobile.courses.model.d dVar = (com.garmin.android.apps.connectmobile.courses.model.d) it.next();
            dVar.getClass();
            arrayList.add(new f(dVar.courseId, dVar.isFavorite, dVar.courseName, dVar.distanceInMeters, dVar.elevationGainInMeters, dVar.F(), dVar.C(), dVar.createdDate));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:57:0x00fc  */
    public static final k b(cy0.k kVar, long j8) {
        String uuid;
        String str;
        String str2;
        boolean z14;
        b63.o oVarD;
        b63.o oVarD2;
        ry0.m mVar;
        kVar.getClass();
        cy0.r uuid2 = kVar.getUuid();
        if (uuid2 == null || (uuid = uuid2.getUuid()) == null) {
            uuid = "";
            str = uuid;
        } else {
            str = "";
        }
        Long userId = kVar.getUserId();
        Long userId2 = kVar.getUserId();
        boolean z15 = userId2 != null && j8 == userId2.longValue();
        String name = kVar.getName();
        String summary = kVar.getSummary();
        if (summary != null) {
            str = summary;
        }
        String startDate = kVar.getStartDate();
        String str3 = str;
        String endDate = kVar.getEndDate();
        List<cy0.o> listH = kVar.h();
        i53.c cVarE = listH != null ? i53.a.e(listH) : null;
        m mVarK = kVar.k();
        boolean z16 = true;
        i53.c cVar = cVarE;
        boolean shareLiveTrack = kVar.getShareLiveTrack();
        List<Long> listF = kVar.f();
        i53.c cVarE2 = listF != null ? i53.a.e(listF) : null;
        List<Long> listD = kVar.d();
        i53.c cVarE3 = listD != null ? i53.a.e(listD) : null;
        if (kVar.getProcessingStartTimeStamp() == null) {
            z16 = false;
        }
        boolean zG = p005kotlin.jvm.internal.s.g(kVar.getInaccessibleCourses(), Boolean.TRUE);
        DateTime dateTimeC = ay0.b.c(kVar.getStartDate());
        DateTime dateTimeC2 = ay0.b.c(kVar.getEndDate());
        if (dateTimeC != null && dateTimeC2 != null) {
            str2 = uuid;
            DateTime dateTimeNow = DateTime.now();
            dateTimeNow.getClass();
            if (dateTimeNow.compareTo(dateTimeC) >= 0 && dateTimeNow.compareTo(dateTimeC2) <= 0) {
                z14 = true;
            }
            oVarD = ay0.b.d(kVar.getStartDate());
            if (oVarD != null || oVarD.compareTo(g22.l.d(b63.o.INSTANCE)) <= 0) {
                oVarD2 = ay0.b.d(kVar.getEndDate());
                if (oVarD2 != null || oVarD2.compareTo(g22.l.d(b63.o.INSTANCE)) >= 0) {
                    mVar = ry0.m.a.f155176a;
                } else {
                    mVar = ry0.m.b.f155179a;
                }
            } else {
                mVar = ry0.m.c.f155182a;
            }
            return new k(str2, userId, z15, name, str3, startDate, endDate, cVar, mVarK, shareLiveTrack, cVarE2, cVarE3, z16, zG, z14, mVar);
        }
        str2 = uuid;
        z14 = false;
        oVarD = ay0.b.d(kVar.getStartDate());
        if (oVarD != null) {
            oVarD2 = ay0.b.d(kVar.getEndDate());
            if (oVarD2 != null) {
                mVar = ry0.m.a.f155176a;
            } else {
                mVar = ry0.m.a.f155176a;
            }
        } else {
            oVarD2 = ay0.b.d(kVar.getEndDate());
            if (oVarD2 != null) {
                mVar = ry0.m.a.f155176a;
            } else {
                mVar = ry0.m.a.f155176a;
            }
        }
        return new k(str2, userId, z15, name, str3, startDate, endDate, cVar, mVarK, shareLiveTrack, cVarE2, cVarE3, z16, zG, z14, mVar);
    }
}
