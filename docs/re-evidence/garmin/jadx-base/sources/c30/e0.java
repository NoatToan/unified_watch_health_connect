package c30;

import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import com.garmin.android.apps.connectmobile.v2;
import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.SphericalUtil;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lc30/e0;", "", "Ld60/b;", "coursesRepo", "<init>", "(Ld60/b;)V", "a", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f23844b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d60.b f23845a;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f23846a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f23847b;

        static {
            int[] iArr = new int[com.garmin.android.library.mapsdkadapter.i.d.values().length];
            try {
                iArr[com.garmin.android.library.mapsdkadapter.i.d.BAIDU.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f23846a = iArr;
            int[] iArr2 = new int[k30.k.values().length];
            try {
                iArr2[k30.k.POPULARITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[k30.k.MIN_ASCENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[k30.k.FREE_FLOW.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[k30.k.FOLLOW_ROADS.ordinal()] = 4;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[k30.k.FREEHAND.ordinal()] = 5;
            } catch (NoSuchFieldError unused6) {
            }
            f23847b = iArr2;
            int[] iArr3 = new int[com.garmin.android.apps.connectmobile.courses.model.i.values().length];
            try {
                iArr3[com.garmin.android.apps.connectmobile.courses.model.i.HIKING.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[com.garmin.android.apps.connectmobile.courses.model.i.RUNNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[com.garmin.android.apps.connectmobile.courses.model.i.TRAIL_RUNNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[com.garmin.android.apps.connectmobile.courses.model.i.OBSTACLE_COURSE_RACING.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[com.garmin.android.apps.connectmobile.courses.model.i.OTHER.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[com.garmin.android.apps.connectmobile.courses.model.i.ROAD_CYCLING.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[com.garmin.android.apps.connectmobile.courses.model.i.GRAVEL_CYCLING.ordinal()] = 7;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[com.garmin.android.apps.connectmobile.courses.model.i.MOUNTAIN_BIKING.ordinal()] = 8;
            } catch (NoSuchFieldError unused14) {
            }
        }
    }

    static {
        new a(null);
        d60.b.a aVar = d60.b.f57806c;
    }

    public e0(d60.b bVar) {
        bVar.getClass();
        this.f23845a = bVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable a(LatLng latLng, LatLng latLng2, com.garmin.android.apps.connectmobile.courses.model.i iVar, v13.c cVar) {
        f0 f0Var;
        if (cVar instanceof f0) {
            f0Var = (f0) cVar;
            int i14 = f0Var.f23865c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                f0Var.f23865c = i14 - Integer.MIN_VALUE;
            } else {
                f0Var = new f0(this, cVar);
            }
        } else {
            f0Var = new f0(this, cVar);
        }
        Object obj = f0Var.f23863a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = f0Var.f23865c;
        if (i15 == 0) {
            o13.r.b(obj);
            ie2.n.f93149a.getClass();
            ie2.n.a();
            com.garmin.android.library.mapsdkadapter.i.d dVar = com.garmin.android.library.mapsdkadapter.i.d.GOOGLE;
            return null;
        }
        if (i15 != 1 && i15 != 2) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        List list = (List) obj;
        ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            LatLng latLng3 = ((com.garmin.android.library.mapsdkadapter.f) it.next()).f50283a;
            arrayList.add(new GeoPointDTO(latLng3.latitude, latLng3.longitude));
        }
        return new o13.p(arrayList, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Serializable b(LatLng latLng, LatLng latLng2, String str, com.garmin.android.apps.connectmobile.courses.model.i iVar, boolean z14, boolean z15, boolean z16, v13.c cVar) {
        g0 g0Var;
        ArrayList<LatLng> arrayList;
        ArrayList arrayList2;
        List<List<List<Double>>> listB;
        if (cVar instanceof g0) {
            g0Var = (g0) cVar;
            int i14 = g0Var.f23875c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                g0Var.f23875c = i14 - Integer.MIN_VALUE;
            } else {
                g0Var = new g0(this, cVar);
            }
        } else {
            g0Var = new g0(this, cVar);
        }
        Object objC = g0Var.f23873a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = g0Var.f23875c;
        if (i15 == 0) {
            o13.r.b(objC);
            k30.e eVar = new k30.e(new Double(latLng.latitude), new Double(latLng.longitude), new Double(latLng2.latitude), new Double(latLng2.longitude), "MOBILE", p13.j0.f134944a);
            String str2 = iVar.f32983e;
            Boolean boolValueOf = iVar.c() ? Boolean.valueOf(z14) : null;
            Boolean boolValueOf2 = iVar.c() ? Boolean.valueOf(z15) : null;
            Boolean boolValueOf3 = iVar.c() ? Boolean.valueOf(z16) : null;
            g0Var.f23875c = 1;
            d60.b bVar = this.f23845a;
            objC = bVar.C(new d60.b0(bVar, eVar, str, str2, boolValueOf, boolValueOf2, boolValueOf3, null), g0Var);
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
        if (v2Var instanceof v2.b) {
            k30.d dVar = (k30.d) ((v2.b) v2Var).f47386a;
            if ((dVar != null ? dVar.b() : null) != null) {
                if (dVar == null || (listB = dVar.b()) == null) {
                    arrayList = null;
                } else {
                    ArrayList<List> arrayListS = p13.y.s(p13.h0.Z(listB));
                    arrayList = new ArrayList(p13.y.r(arrayListS, 10));
                    for (List list : arrayListS) {
                        arrayList.add(new LatLng(((Number) list.get(0)).doubleValue(), ((Number) list.get(1)).doubleValue()));
                    }
                }
                if (arrayList != null) {
                    arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
                    for (LatLng latLng3 : arrayList) {
                        arrayList2.add(new GeoPointDTO(latLng3.latitude, latLng3.longitude));
                    }
                } else {
                    arrayList2 = null;
                }
                return new o13.p(arrayList2, dVar != null ? dVar.c() : null);
            }
        }
        return null;
    }

    public final Serializable c(k30.k kVar, com.garmin.android.library.mapsdkadapter.i.d dVar, LatLng latLng, LatLng latLng2, com.garmin.android.apps.connectmobile.courses.model.i iVar, boolean z14, boolean z15, boolean z16, v13.c cVar) {
        int[] iArr = b.f23847b;
        int iOrdinal = kVar.ordinal();
        String str = kVar.f102562a;
        int i14 = iArr[iOrdinal];
        String str2 = "";
        if (i14 == 1 || i14 == 2 || i14 == 3) {
            if (str != null) {
                str2 = str;
            }
            return b(latLng, latLng2, str2, iVar, z14, z15, z16, cVar);
        }
        if (i14 == 4) {
            if (b.f23846a[dVar.ordinal()] == 1) {
                return a(latLng, latLng2, iVar, cVar);
            }
            if (str != null) {
                str2 = str;
            }
            return b(latLng, latLng2, str2, iVar, z14, z15, z16, cVar);
        }
        if (i14 != 5) {
            lc.u0.r();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new GeoPointDTO(latLng.latitude, latLng.longitude));
        double dA = com.garmin.android.library.mapsdkadapter.n.a(latLng, latLng2);
        if (dA > 35.0d && dA < 10000.0d) {
            s20.d.f156005a.getClass();
            ArrayList<LatLng> arrayList2 = new ArrayList();
            int iComputeDistanceBetween = (int) (SphericalUtil.computeDistanceBetween(latLng, latLng2) / 35.0d);
            for (int i15 = 0; i15 < iComputeDistanceBetween; i15++) {
                LatLng latLngInterpolate = SphericalUtil.interpolate(latLng, latLng2, ((double) i15) / ((double) iComputeDistanceBetween));
                latLngInterpolate.getClass();
                arrayList2.add(latLngInterpolate);
            }
            for (LatLng latLng3 : arrayList2) {
                arrayList.add(new GeoPointDTO(latLng3.latitude, latLng3.longitude));
            }
        }
        arrayList.add(new GeoPointDTO(latLng2.latitude, latLng2.longitude));
        return new o13.p(arrayList, null);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lc30/e0$a;", "", "<init>", "()V", "", "MIN_DISTANCE_FREEHAND", "D", "MAX_DISTANCE_FREEHAND", "", "DEVICE_TYPE", "Ljava/lang/String;", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
