package k40;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import com.garmin.android.apps.connectmobile.courses.model.PointOfInterestDTO;
import com.garmin.android.gncs.NotificationConstants;
import com.garmin.android.library.mapsdkadapter.m;
import com.google.android.gms.maps.model.LatLng;
import com.mapbox.maps.interactions.standard.generated.StandardPoi;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o13.p;
import p005kotlin.Metadata;
import p13.h0;
import p13.j0;
import p13.k0;
import p13.w;
import p13.x;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0006\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lk40/j;", "", "Lk40/b;", "host", "<init>", "(Lk40/b;)V", "b", "a", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k40.b f102851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f102852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f102853c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f102854d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public PointOfInterestDTO f102855e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f102856f;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lk40/j$b;", "", "Lcom/garmin/android/apps/connectmobile/courses/model/h;", NotificationConstants.KEY_DATA_MIME_TYPE, "Lcom/google/android/gms/maps/model/LatLng;", "coordinate", "Lcom/garmin/android/apps/connectmobile/courses/model/PointOfInterestDTO;", StandardPoi.FEATURESET_ID, "", "size", "", "isHighlighted", "<init>", "(Lcom/garmin/android/apps/connectmobile/courses/model/h;Lcom/google/android/gms/maps/model/LatLng;Lcom/garmin/android/apps/connectmobile/courses/model/PointOfInterestDTO;IZ)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.courses.model.h f102857a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LatLng f102858b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final PointOfInterestDTO f102859c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f102860d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f102861e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f102862f;

        public b(com.garmin.android.apps.connectmobile.courses.model.h hVar, LatLng latLng, PointOfInterestDTO pointOfInterestDTO, int i14, boolean z14) {
            hVar.getClass();
            latLng.getClass();
            this.f102857a = hVar;
            this.f102858b = latLng;
            this.f102859c = pointOfInterestDTO;
            this.f102860d = i14;
            this.f102861e = z14;
            this.f102862f = hVar.ordinal() + "|" + latLng.latitude + "|" + latLng.longitude + "|" + i14 + "|" + z14;
        }
    }

    static {
        new a(null);
    }

    public j(k40.b bVar) {
        bVar.getClass();
        this.f102851a = bVar;
        this.f102852b = new LinkedHashMap();
        this.f102853c = new LinkedHashMap();
        this.f102854d = new LinkedHashMap();
        k0 k0Var = k0.f134949a;
        k0Var.getClass();
        this.f102856f = k0Var;
    }

    public final List<ie2.j> a() {
        ArrayList arrayList;
        List<ie2.j> listQ;
        qe2.h map = this.f102851a.getMap();
        if (map == null || (listQ = map.f144584a.Q()) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (Object obj : listQ) {
                ie2.j jVar = (ie2.j) obj;
                if (jVar.getZIndex() == -300.0f || jVar.getZIndex() == 15.0f) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList == null ? j0.f134944a : arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x01a5  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Map] */
    public final void b() {
        qe2.h map;
        int i14;
        Object obj;
        Bitmap bitmap;
        Object obj2;
        Object obj3;
        float f14;
        Iterator it;
        com.garmin.android.apps.connectmobile.courses.model.h hVar;
        List listC;
        boolean[] zArr;
        boolean z14;
        com.garmin.android.apps.connectmobile.courses.model.h hVar2;
        b bVar;
        k40.b bVar2 = this.f102851a;
        Context contextM0 = bVar2.m0();
        if (contextM0 == null || (map = bVar2.getMap()) == null) {
            return;
        }
        float f50270z = map.f144584a.getF50270z();
        PointOfInterestDTO pointOfInterestDTO = this.f102855e;
        ArrayList arrayList = new ArrayList();
        Collection collectionValues = this.f102856f.values();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj4 : collectionValues) {
            if (!k.a((PointOfInterestDTO) obj4).equals(pointOfInterestDTO != null ? k.a(pointOfInterestDTO) : null)) {
                arrayList2.add(obj4);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj5 : arrayList2) {
            com.garmin.android.apps.connectmobile.courses.model.h hVar3 = ((PointOfInterestDTO) obj5).getCom.garmin.android.gncs.NotificationConstants.KEY_DATA_MIME_TYPE java.lang.String();
            Object arrayList3 = linkedHashMap.get(hVar3);
            if (arrayList3 == null) {
                arrayList3 = new ArrayList();
                linkedHashMap.put(hVar3, arrayList3);
            }
            ((List) arrayList3).add(obj5);
        }
        Iterator it3 = linkedHashMap.entrySet().iterator();
        while (true) {
            boolean z15 = true;
            z15 = true;
            if (!it3.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it3.next();
            com.garmin.android.apps.connectmobile.courses.model.h hVar4 = (com.garmin.android.apps.connectmobile.courses.model.h) entry.getKey();
            List list = (List) entry.getValue();
            if (hVar4 != null) {
                if (list.size() == 1) {
                    listC = w.c(list);
                    f14 = f50270z;
                    it = it3;
                    hVar = hVar4;
                } else {
                    int i15 = 0;
                    double dPow = 160.0d / (Math.pow(2.0d, f50270z) * 256.0d);
                    double d14 = dPow * dPow;
                    int size = list.size();
                    double[] dArr = new double[size];
                    for (int i16 = 0; i16 < size; i16++) {
                        dArr[i16] = (((PointOfInterestDTO) list.get(i16)).getLongitude() + 180.0d) / 360.0d;
                    }
                    int size2 = list.size();
                    double[] dArr2 = new double[size2];
                    int i17 = 0;
                    while (i17 < size2) {
                        float f15 = f50270z;
                        double dMin = (Math.min(89.5d, Math.max(-89.5d, ((PointOfInterestDTO) list.get(i17)).getLatitude())) * 3.141592653589793d) / 180.0d;
                        dArr2[i17] = (1.0d - (Math.log((1.0d / Math.cos(dMin)) + Math.tan(dMin)) / 3.141592653589793d)) / 2.0d;
                        i17++;
                        f50270z = f15;
                        hVar4 = hVar4;
                        i15 = i15;
                        it3 = it3;
                    }
                    f14 = f50270z;
                    it = it3;
                    int i18 = i15;
                    hVar = hVar4;
                    boolean[] zArr2 = new boolean[list.size()];
                    ArrayList arrayList4 = new ArrayList();
                    int size3 = list.size();
                    while (i15 < size3) {
                        if (zArr2[i15]) {
                            zArr = zArr2;
                            z14 = z15 ? 1 : 0;
                        } else {
                            zArr2[i15] = z15;
                            PointOfInterestDTO[] pointOfInterestDTOArr = new PointOfInterestDTO[z15 ? 1 : 0];
                            pointOfInterestDTOArr[i18] = list.get(i15);
                            ArrayList arrayListM = x.m(pointOfInterestDTOArr);
                            int i19 = i15 + 1;
                            z14 = z15 ? 1 : 0;
                            int size4 = list.size();
                            while (i19 < size4) {
                                if (!zArr2[i19]) {
                                    double d15 = dArr[i15] - dArr[i19];
                                    double d16 = dArr2[i15] - dArr2[i19];
                                    if ((d16 * d16) + (d15 * d15) <= d14) {
                                        zArr2[i19] = z14;
                                        arrayListM.add(list.get(i19));
                                    }
                                }
                                i19++;
                                zArr2 = zArr2;
                            }
                            zArr = zArr2;
                            arrayList4.add(arrayListM);
                        }
                        i15++;
                        zArr2 = zArr;
                        z15 = z14;
                    }
                    listC = arrayList4;
                }
                boolean z16 = z15;
                Iterator it4 = listC.iterator();
                while (it4.hasNext()) {
                    List list2 = (List) it4.next();
                    if (list2.size() == z16) {
                        PointOfInterestDTO pointOfInterestDTO2 = (PointOfInterestDTO) h0.b0(list2);
                        hVar2 = hVar;
                        bVar = new b(hVar2, k.a(pointOfInterestDTO2), pointOfInterestDTO2, 1, false);
                    } else {
                        hVar2 = hVar;
                        Iterator it5 = list2.iterator();
                        double longitude = 0.0d;
                        double latitude = 0.0d;
                        while (it5.hasNext()) {
                            latitude = ((PointOfInterestDTO) it5.next()).getLatitude() + latitude;
                        }
                        double size5 = latitude / ((double) list2.size());
                        Iterator it6 = list2.iterator();
                        while (it6.hasNext()) {
                            longitude = ((PointOfInterestDTO) it6.next()).getLongitude() + longitude;
                        }
                        bVar = new b(hVar2, new LatLng(size5, longitude / ((double) list2.size())), null, list2.size(), false);
                    }
                    arrayList.add(bVar);
                    it4 = it4;
                    hVar = hVar2;
                    z16 = true;
                }
            } else {
                f14 = f50270z;
                it = it3;
            }
            f50270z = f14;
            it3 = it;
        }
        int i24 = 0;
        com.garmin.android.apps.connectmobile.courses.model.h hVar5 = pointOfInterestDTO != null ? pointOfInterestDTO.getCom.garmin.android.gncs.NotificationConstants.KEY_DATA_MIME_TYPE java.lang.String() : null;
        if (pointOfInterestDTO != null && hVar5 != null) {
            arrayList.add(new b(hVar5, k.a(pointOfInterestDTO), pointOfInterestDTO, 1, true));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Object obj6 : arrayList) {
            linkedHashMap2.put(((b) obj6).f102862f, obj6);
        }
        List<ie2.j> listA = a();
        HashSet hashSet = new HashSet(listA.size());
        for (ie2.j jVar : listA) {
            Object objMo329getTag = jVar.mo329getTag();
            Bundle bundle = objMo329getTag instanceof Bundle ? (Bundle) objMo329getTag : null;
            String string = bundle != null ? bundle.getString("extra_poi_marker_key") : null;
            if (string == null || !linkedHashMap2.containsKey(string)) {
                map.n(jVar);
            } else {
                hashSet.add(string);
            }
        }
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            String str = (String) entry2.getKey();
            b bVar3 = (b) entry2.getValue();
            if (hashSet.contains(str)) {
                i14 = i24;
            } else {
                Bundle bundle2 = new Bundle();
                String str2 = bVar3.f102862f;
                boolean z17 = bVar3.f102861e;
                com.garmin.android.apps.connectmobile.courses.model.h hVar6 = bVar3.f102857a;
                int i25 = bVar3.f102860d;
                LatLng latLng = bVar3.f102858b;
                bundle2.putString("extra_poi_marker_key", str2);
                PointOfInterestDTO pointOfInterestDTO3 = bVar3.f102859c;
                if (pointOfInterestDTO3 != null) {
                    bundle2.putParcelable("extra_poi_tag", pointOfInterestDTO3);
                } else {
                    bundle2.putInt("extra_poi_cluster_size", i25);
                    bundle2.putDouble("extra_poi_cluster_latitude", latLng.latitude);
                    bundle2.putDouble("extra_poi_cluster_longitude", latLng.longitude);
                }
                if (pointOfInterestDTO3 == null) {
                    p pVar = new p(hVar6, Integer.valueOf(i25));
                    LinkedHashMap linkedHashMap3 = this.f102854d;
                    Object obj7 = linkedHashMap3.get(pVar);
                    if (obj7 == null) {
                        obj3 = obj7;
                        s40.a aVar = new s40.a(contextM0, hVar6, i25);
                        int i26 = i24;
                        Bitmap bitmapB = d7.b.b(aVar, i26, i26, 7);
                        linkedHashMap3.put(pVar, bitmapB);
                        obj3 = bitmapB;
                    }
                    obj3 = obj7;
                    bitmap = (Bitmap) obj3;
                    i14 = 0;
                } else if (z17) {
                    LinkedHashMap linkedHashMap4 = this.f102853c;
                    Object obj8 = linkedHashMap4.get(hVar6);
                    if (obj8 == null) {
                        i14 = 0;
                        Bitmap bitmapB2 = d7.b.b(new s40.b(contextM0, hVar6, true), 0, 0, 7);
                        linkedHashMap4.put(hVar6, bitmapB2);
                        obj2 = bitmapB2;
                    } else {
                        i14 = 0;
                        obj2 = obj8;
                    }
                    bitmap = (Bitmap) obj2;
                } else {
                    i14 = 0;
                    LinkedHashMap linkedHashMap5 = this.f102852b;
                    Object obj9 = linkedHashMap5.get(hVar6);
                    if (obj9 == null) {
                        obj = obj9;
                        Bitmap bitmapB3 = d7.b.b(new s40.b(contextM0, hVar6, false), 0, 0, 7);
                        linkedHashMap5.put(hVar6, bitmapB3);
                        obj = bitmapB3;
                    }
                    obj = obj9;
                    bitmap = (Bitmap) obj;
                }
                com.garmin.android.library.mapsdkadapter.p pVar2 = new com.garmin.android.library.mapsdkadapter.p();
                pVar2.f50327a.f50322n = bundle2;
                pVar2.d(new com.garmin.android.library.mapsdkadapter.f(latLng, m.f(latLng) ? com.garmin.android.library.mapsdkadapter.i.b.GCJ02 : com.garmin.android.library.mapsdkadapter.i.b.WGS84));
                pVar2.c(bitmap);
                pVar2.f50327a.f50311c = z17 ? 15.0f : -300.0f;
                map.x(pVar2);
            }
            i24 = i14;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010¨\u0006\u0013"}, d2 = {"Lk40/j$a;", "", "<init>", "()V", "", "EXTRA_POI_TAG", "Ljava/lang/String;", "EXTRA_POI_CLUSTER_SIZE", "EXTRA_POI_CLUSTER_LATITUDE", "EXTRA_POI_CLUSTER_LONGITUDE", "EXTRA_POI_MARKER_KEY", "", "POI_MIN_ZOOM_LEVEL", "I", "", "POI_MARKER_Z_INDEX", "F", "HIGHLIGHTED_POI_Z_INDEX", "CLUSTER_CLICK_ZOOM_STEP", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
