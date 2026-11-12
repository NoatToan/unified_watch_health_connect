package k40;

import android.os.Bundle;
import com.garmin.android.apps.connectmobile.courses.model.ClimbDTO;
import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import com.garmin.android.library.mapsdkadapter.l;
import com.garmin.android.library.mapsdkadapter.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p13.j0;
import p13.u;
import p13.y;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lk40/a;", "", "Lk40/b;", "host", "<init>", "(Lk40/b;)V", "a", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f102826f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f102827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f102828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f102829c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f102830d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f102831e;

    static {
        new C1971a(null);
    }

    public a(b bVar) {
        bVar.getClass();
        this.f102827a = bVar;
        this.f102828b = new ArrayList();
        this.f102829c = new ArrayList();
        this.f102830d = new ArrayList();
        this.f102831e = new ArrayList();
    }

    public final List<qe2.a> a(boolean z14) {
        List<qe2.a> listC;
        long[] longArray;
        ArrayList arrayListC = c(z14);
        if (arrayListC.isEmpty()) {
            return j0.f134944a;
        }
        qe2.h map = this.f102827a.getMap();
        ArrayList arrayList = null;
        if (map != null && (listC = map.f144584a.C()) != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : listC) {
                Integer f118169b = ((qe2.a) obj).getF118169b();
                if (f118169b != null && f118169b.intValue() == 0) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : arrayList2) {
                qe2.a aVar = (qe2.a) obj2;
                Object tag = aVar.getTag();
                Bundle bundle = tag instanceof Bundle ? (Bundle) tag : null;
                int i14 = bundle != null ? bundle.getInt("extra_count_of_climbs_at_start", -1) : -1;
                Object tag2 = aVar.getTag();
                Bundle bundle2 = tag2 instanceof Bundle ? (Bundle) tag2 : null;
                List<Long> listH0 = (bundle2 == null || (longArray = bundle2.getLongArray("extra_primary_climb_ids")) == null) ? null : u.h0(longArray);
                if (listH0 == null) {
                    listH0 = j0.f134944a;
                }
                if (i14 > 0 && !listH0.isEmpty() && arrayListC.containsAll(listH0)) {
                    arrayList3.add(obj2);
                }
            }
            arrayList = arrayList3;
        }
        return arrayList == null ? j0.f134944a : arrayList;
    }

    public final List<ie2.j> b() {
        ArrayList arrayList;
        List<ie2.j> listQ;
        qe2.h map = this.f102827a.getMap();
        if (map == null || (listQ = map.f144584a.Q()) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (Object obj : listQ) {
                ie2.j jVar = (ie2.j) obj;
                if (jVar.getZIndex() == -200.0f || jVar.getZIndex() == 20.0f) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList == null ? j0.f134944a : arrayList;
    }

    public final ArrayList c(boolean z14) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f102829c.iterator();
        while (it.hasNext()) {
            Long l14 = ((k30.a) it.next()).f102522a;
            if (l14 != null) {
                arrayList.add(l14);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        if (z14) {
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = this.f102831e.iterator();
            while (it3.hasNext()) {
                Long l15 = ((k30.a) it3.next()).f102522a;
                if (l15 != null) {
                    arrayList3.add(l15);
                }
            }
            if (!arrayList3.isEmpty()) {
                arrayList2.removeAll(arrayList3);
            }
        }
        return arrayList2;
    }

    public final List<l> d(boolean z14) {
        List<l> listS;
        ArrayList arrayListC = c(z14);
        if (arrayListC.isEmpty()) {
            return j0.f134944a;
        }
        qe2.h map = this.f102827a.getMap();
        ArrayList arrayList = null;
        if (map != null && (listS = map.f144584a.s()) != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : listS) {
                Object tag = ((l) obj).getTag();
                Long l14 = tag instanceof Long ? (Long) tag : null;
                if (l14 != null && arrayListC.contains(l14)) {
                    arrayList2.add(obj);
                }
            }
            arrayList = arrayList2;
        }
        return arrayList == null ? j0.f134944a : arrayList;
    }

    public final List<l> e() {
        List<l> listS;
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f102830d.iterator();
        while (it.hasNext()) {
            Long l14 = ((k30.a) it.next()).f102522a;
            if (l14 != null) {
                arrayList.add(l14);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        if (arrayList2.isEmpty()) {
            return j0.f134944a;
        }
        qe2.h map = this.f102827a.getMap();
        ArrayList arrayList3 = null;
        if (map != null && (listS = map.f144584a.s()) != null) {
            ArrayList arrayList4 = new ArrayList();
            for (Object obj : listS) {
                Object tag = ((l) obj).getTag();
                Long l15 = tag instanceof Long ? (Long) tag : null;
                if (l15 != null && arrayList2.contains(l15)) {
                    arrayList4.add(obj);
                }
            }
            arrayList3 = arrayList4;
        }
        return arrayList3 == null ? j0.f134944a : arrayList3;
    }

    public final void f(List<ClimbDTO> list) {
        qe2.h map;
        List<l> listS;
        for (ClimbDTO climbDTO : list) {
            Long gmapClimbId = climbDTO.getGmapClimbId();
            List<GeoPointDTO> listM = climbDTO.m();
            ArrayList<GeoPointDTO> arrayList = new ArrayList();
            for (Object obj : listM) {
                if (((GeoPointDTO) obj).b()) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(y.r(arrayList, 10));
            for (GeoPointDTO geoPointDTO : arrayList) {
                Double d14 = geoPointDTO.latitude;
                double dDoubleValue = 0.0d;
                double dDoubleValue2 = d14 != null ? d14.doubleValue() : 0.0d;
                Double d15 = geoPointDTO.longitude;
                double dDoubleValue3 = d15 != null ? d15.doubleValue() : 0.0d;
                Double d16 = geoPointDTO.latitude;
                double dDoubleValue4 = d16 != null ? d16.doubleValue() : 0.0d;
                Double d17 = geoPointDTO.longitude;
                if (d17 != null) {
                    dDoubleValue = d17.doubleValue();
                }
                arrayList2.add(new com.garmin.android.library.mapsdkadapter.f(dDoubleValue2, dDoubleValue3, m.d(dDoubleValue4, dDoubleValue)));
            }
            if (gmapClimbId != null && !arrayList2.isEmpty() && (map = this.f102827a.getMap()) != null && (listS = map.f144584a.s()) != null) {
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : listS) {
                    Object tag = ((l) obj2).getTag();
                    Long l14 = tag instanceof Long ? (Long) tag : null;
                    if (l14 != null && l14.equals(gmapClimbId)) {
                        arrayList3.add(obj2);
                    }
                }
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    ((l) it.next()).h(arrayList2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: k40.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0014\u0010\r\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\tR\u0014\u0010\u000e\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\tR\u0014\u0010\u000f\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\tR\u0014\u0010\u0010\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\tR\u0014\u0010\u0012\u001a\u00020\u00118\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00118\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0006¨\u0006\u0017"}, d2 = {"Lk40/a$a;", "", "<init>", "()V", "", "CLIMBS_MIN_ZOOM_LEVEL", "I", "", "MIN_CLIMB_POLYLINE_Z_INDEX", "F", "MIN_CLIMB_SYSTEM_POLYLINE_Z_INDEX", "CLIMB_ON_COURSE_POLYLINE_Z_INDEX", "CLIMB_ON_COURSE_UNDERLAY_POLYLINE_Z_INDEX", "HIGHLIGHTED_CLIMB_ON_COURSE_POLYLINE_Z_INDEX", "HIGHLIGHTED_CLIMB_ON_COURSE_UNDERLAY_POLYLINE_Z_INDEX", "HIGHLIGHTED_CLIMB_POLYLINE_Z_INDEX", "HIGHLIGHTED_CLIMB_UNDERLAY_POLYLINE_Z_INDEX", "", "EXTRA_CLIMB_ON_COURSE_INDEX", "Ljava/lang/String;", "EXTRA_PRIMARY_CLIMB_IDS", "EXTRA_COUNT_OF_CLIMBS_AT_START", "CLUSTER_TYPE_CLIMBS", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1971a {
        public /* synthetic */ C1971a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C1971a() {
        }
    }
}
