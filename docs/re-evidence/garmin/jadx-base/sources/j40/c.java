package j40;

import a73.n;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import c22.r2;
import c62.f2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.courses.model.ClimbDTO;
import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import com.garmin.android.apps.connectmobile.courses.model.PointOfInterestDTO;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.map.GCMMapView;
import com.garmin.android.apps.connectmobile.map.MapOptionsContainer;
import com.garmin.android.apps.connectmobile.workouts.data.model.g0;
import com.garmin.android.library.mapsdkadapter.e;
import com.garmin.android.library.mapsdkadapter.f;
import com.garmin.android.library.mapsdkadapter.i;
import com.garmin.android.library.mapsdkadapter.l;
import com.garmin.android.library.mapsdkadapter.p;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.TileOverlay;
import com.google.android.gms.maps.model.TileOverlayOptions;
import com.google.common.base.Ascii;
import e23.q;
import gs.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import k40.j;
import o13.m;
import o13.t;
import org.koin.java.KoinJavaComponent;
import org.xmlpull.v1.XmlPullParser;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.x0;
import p13.d0;
import p13.h0;
import p13.j0;
import p13.k0;
import p13.u;
import p13.w;
import p13.x;
import p13.y;
import qe2.h;
import qw0.s;
import qw0.v;
import s20.o;
import u40.g;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\u00052\u00020\b:\u0001\u000bB\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lj40/c;", "Lqw0/a;", "Lk40/b;", "Lcom/garmin/android/library/mapsdkadapter/i$j;", "Lcom/garmin/android/library/mapsdkadapter/i$m;", "", "Lcom/garmin/android/library/mapsdkadapter/i$h;", "Lcom/garmin/android/library/mapsdkadapter/i$i;", "Lcom/google/android/gms/maps/OnMapReadyCallback;", "<init>", "()V", "a", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class c extends qw0.a implements k40.b, i.j, i.m, i.h, i.InterfaceC1001i, OnMapReadyCallback {
    public static final /* synthetic */ int V0 = 0;
    public boolean A;
    public boolean H0;
    public i.b K0;
    public i.b L0;
    public boolean M0;
    public f N0;
    public boolean P;
    public s30.c R0;
    public h S0;
    public com.garmin.android.apps.connectmobile.courses.model.c T;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public g f97012o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public d f97013p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public l40.b f97014q;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public MapOptionsContainer f97016t;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public e f97019x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public u20.g f97020y;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final k40.f f97004h = new k40.f();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final k40.e f97005i = new k40.e(this);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final k40.c f97006j = new k40.c(this);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final j f97007k = new j(this);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final k40.a f97009l = new k40.a(this);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final k40.h f97010m = new k40.h(this);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final k40.d f97011n = new k40.d(this);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final t f97015r = m.b(new j21.f(5));

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f97017v = R.layout.gcm3_create_course_map_fragment;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f97018w = R.id.map_container;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final s f97021z = (s) KoinJavaComponent.get$default(s.class, null, null, 6, null);
    public boolean B = true;
    public boolean C = true;
    public boolean D = true;
    public boolean E = true;
    public boolean F = true;
    public boolean I = true;
    public com.garmin.android.apps.connectmobile.courses.model.b X = com.garmin.android.apps.connectmobile.courses.model.b.NONE;
    public com.garmin.android.apps.connectmobile.courses.model.b Y = com.garmin.android.apps.connectmobile.courses.model.b.HORS_CATEGORY;
    public final ArrayList Z = new ArrayList();

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final ArrayList f97008k0 = new ArrayList();
    public final ArrayList I0 = new ArrayList();
    public final ArrayList J0 = new ArrayList();
    public boolean O0 = true;
    public final s20.m P0 = new s20.m();
    public final C1850c Q0 = new C1850c();
    public s30.b T0 = new s30.b(0, 0, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0d, 0.0f, 4095, null);
    public List<f> U0 = j0.f134944a;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f97022a;

        static {
            int[] iArr = new int[com.garmin.android.apps.connectmobile.courses.model.i.values().length];
            try {
                iArr[com.garmin.android.apps.connectmobile.courses.model.i.ROAD_CYCLING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.courses.model.i.MOUNTAIN_BIKING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.courses.model.i.GRAVEL_CYCLING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f97022a = iArr;
        }
    }

    /* JADX INFO: renamed from: j40.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"j40/c$c", "", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1850c {

        /* JADX INFO: renamed from: j40.c$c$a */
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f97024a;

            static {
                int[] iArr = new int[v.values().length];
                try {
                    iArr[v.MILE_MARKERS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[v.HIGH_TRAFFIC_ROADS.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[v.UNPAVED_ROADS.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[v.POPULARITY_HEATMAP.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[v.HAZARDS.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[v.HAZARDS_ON_COURSE.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                f97024a = iArr;
            }
        }

        public C1850c() {
        }

        public final void a(boolean z14) {
            h mapProxy;
            int i14 = c.V0;
            c cVar = c.this;
            GCMMapView gCMMapView = cVar.f148291b;
            if (gCMMapView != null && (mapProxy = gCMMapView.getMapProxy()) != null) {
                mapProxy.b(z14, Boolean.FALSE);
            }
            cVar.X6().set3dEnabled(z14);
            cVar.f97021z.a(z14);
        }

        public final void b(i.d dVar) {
            h mapProxy;
            h mapProxy2;
            dVar.getClass();
            int i14 = c.V0;
            c cVar = c.this;
            GCMMapView gCMMapView = cVar.f148291b;
            ArrayList arrayList = cVar.f97008k0;
            List<l> listS = (gCMMapView == null || (mapProxy2 = gCMMapView.getMapProxy()) == null) ? null : mapProxy2.f144584a.s();
            GCMMapView gCMMapView2 = cVar.f148291b;
            List<ie2.j> listQ = (gCMMapView2 == null || (mapProxy = gCMMapView2.getMapProxy()) == null) ? null : mapProxy.f144584a.Q();
            GCMMapView gCMMapView3 = cVar.f148291b;
            if (gCMMapView3 != null) {
                gCMMapView3.a(dVar, cVar);
            }
            GCMMapView gCMMapView4 = cVar.f148291b;
            if (gCMMapView4 != null) {
                gCMMapView4.onStart();
            }
            GCMMapView gCMMapView5 = cVar.f148291b;
            cVar.f148294e = gCMMapView5 != null ? gCMMapView5.getMapProxy() : null;
            if (listS != null) {
                for (l lVar : listS) {
                    h hVar = cVar.f148294e;
                    if (hVar != null) {
                        i.a.a(hVar, lVar.getF118133a());
                    }
                }
            }
            arrayList.clear();
            if (listQ != null) {
                ArrayList<ie2.j> arrayList2 = new ArrayList();
                for (Object obj : listQ) {
                    ie2.j jVar = (ie2.j) obj;
                    jVar.getClass();
                    if (!p005kotlin.jvm.internal.s.g(jVar.mo329getTag(), "course_direction_arrow")) {
                        arrayList2.add(obj);
                    }
                }
                for (ie2.j jVar2 : arrayList2) {
                    h hVar2 = cVar.f148294e;
                    ie2.j jVarX = hVar2 != null ? hVar2.x(jVar2.getF118120a()) : null;
                    if (jVarX != null) {
                        Object objMo329getTag = jVar2.mo329getTag();
                        Bundle bundle = objMo329getTag instanceof Bundle ? (Bundle) objMo329getTag : null;
                        if (bundle != null && bundle.containsKey("interval_marker")) {
                            ((qe2.i) jVarX).b(jVar2.mo329getTag());
                            arrayList.add(jVarX);
                        }
                    }
                }
            }
            cVar.a8();
            cVar.f97021z.z(dVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v12, types: [p13.j0] */
        /* JADX WARN: Type inference failed for: r1v13, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r1v16 */
        /* JADX WARN: Type inference failed for: r1v17 */
        /* JADX WARN: Type inference failed for: r1v8 */
        /* JADX WARN: Type inference failed for: r1v9 */
        public final void c(v vVar, boolean z14) {
            e a14;
            u20.g gVar;
            List<ie2.j> listQ;
            e a15;
            u20.g gVar2;
            vVar.getClass();
            int i14 = a.f97024a[vVar.ordinal()];
            arrayList = 0;
            ?? arrayList = 0;
            c cVar = c.this;
            switch (i14) {
                case 1:
                    cVar.T7(z14);
                    cVar.Y6().F3(new l40.a.d(z14));
                    break;
                case 2:
                    h hVar = cVar.f148294e;
                    if ((hVar != null ? hVar.f144584a.getF50264r() : null) == i.d.MAPBOX) {
                        h hVar2 = cVar.f148294e;
                        if (hVar2 != null) {
                            hVar2.z(z14);
                        }
                    } else {
                        TileOverlay tileOverlay = cVar.f97004h.f102841b;
                        if (tileOverlay != null) {
                            tileOverlay.setVisible(z14);
                        }
                    }
                    cVar.Y6().F3(new l40.a.h(z14));
                    break;
                case 3:
                    h hVar3 = cVar.f148294e;
                    if ((hVar3 != null ? hVar3.f144584a.getF50264r() : null) == i.d.MAPBOX) {
                        h hVar4 = cVar.f148294e;
                        if (hVar4 != null) {
                            hVar4.z(z14);
                        }
                    } else {
                        TileOverlay tileOverlay2 = cVar.f97004h.f102842c;
                        if (tileOverlay2 != null) {
                            tileOverlay2.setVisible(z14);
                        }
                    }
                    cVar.Y6().F3(new l40.a.l(z14));
                    break;
                case 4:
                    h hVar5 = cVar.f148294e;
                    if ((hVar5 != null ? hVar5.f144584a.getF50264r() : null) == i.d.MAPBOX) {
                        h hVar6 = cVar.f148294e;
                        if (hVar6 != null) {
                            hVar6.z(z14);
                        }
                    } else {
                        TileOverlay tileOverlay3 = cVar.f97004h.f102840a;
                        if (tileOverlay3 != null) {
                            tileOverlay3.setVisible(z14);
                        }
                    }
                    cVar.Y6().F3(new l40.a.k(z14));
                    break;
                case 5:
                    cVar.Y6().F3(new l40.a.g(z14));
                    h hVar7 = cVar.f148294e;
                    float f50270z = hVar7 != null ? hVar7.f144584a.getF50270z() : 0.0f;
                    if (!z14 || f50270z < 13.0f) {
                        cVar.A7();
                        break;
                    } else {
                        h hVar8 = cVar.f148294e;
                        if (hVar8 != null && (a14 = hVar8.f144584a.getA()) != null && (gVar = cVar.f97020y) != null) {
                            gVar.p5(a14, cVar.V6().f109901i);
                            break;
                        }
                    }
                    break;
                case 6:
                    cVar.Y6().F3(new l40.a.f(z14));
                    if (!z14) {
                        k40.h hVar9 = cVar.f97010m;
                        hVar9.f102846c.clear();
                        k40.b bVar = hVar9.f102844a;
                        h map = bVar.getMap();
                        if (map != null && (listQ = map.f144584a.Q()) != null) {
                            arrayList = new ArrayList();
                            for (Object obj : listQ) {
                                if (((ie2.j) obj).getZIndex() == -230.0f) {
                                    arrayList.add(obj);
                                }
                            }
                        }
                        if (arrayList == 0) {
                            arrayList = j0.f134944a;
                        }
                        for (ie2.j jVar : (Iterable) arrayList) {
                            h map2 = bVar.getMap();
                            if (map2 != null) {
                                map2.n(jVar);
                            }
                        }
                        break;
                    } else {
                        h hVar10 = cVar.f148294e;
                        if (hVar10 != null && (a15 = hVar10.f144584a.getA()) != null && (gVar2 = cVar.f97020y) != null) {
                            gVar2.p5(a15, cVar.V6().f109901i);
                            break;
                        }
                    }
                    break;
                default:
                    i2.f36769a.getClass();
                    i2.a.f(a2.COURSES, "CourseMapFragment", "Error! Did not handle switch type " + vVar + ".");
                    break;
            }
        }
    }

    static {
        new a(null);
    }

    public static void E6(c cVar, List list, com.garmin.android.apps.connectmobile.courses.model.f fVar, f fVar2, q qVar, e23.l lVar) {
        if (list != null) {
            cVar.S6(list, fVar2, fVar, qVar, lVar, true);
            return;
        }
        lVar.invoke(Boolean.FALSE);
        a2 a2Var = a2.COURSES;
        i2.f36769a.getClass();
        i2.a.f(a2Var, "CourseMapFragment", "Geo points for adding a Course Point can't be null");
        Toast.makeText(cVar.getContext(), R.string.txt_error_occurred, 0).show();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0041  */
    public static boolean J6(c cVar, com.garmin.android.apps.connectmobile.courses.model.g gVar) {
        Object obj;
        boolean z14;
        k40.d dVar = cVar.f97011n;
        ArrayList arrayList = dVar.f102836b;
        Iterator it = arrayList.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            com.garmin.android.apps.connectmobile.courses.model.g gVar2 = (com.garmin.android.apps.connectmobile.courses.model.g) ((ie2.j) next).getTag();
            if (gVar2 != null ? gVar2.h(gVar) : false) {
                z14 = true;
            } else {
                if ((gVar2 != null ? gVar2.getCoursePointId() : null) == null || !p005kotlin.jvm.internal.s.g(gVar2.getCoursePointId(), gVar.getCoursePointId())) {
                    z14 = false;
                } else {
                    z14 = true;
                }
            }
            if (z14) {
                obj = next;
                break;
            }
        }
        ie2.j jVar = (ie2.j) obj;
        h map = dVar.f102835a.getMap();
        if (jVar == null || map == null) {
            return false;
        }
        arrayList.remove(jVar);
        jVar.remove();
        return true;
    }

    public static void Q7(c cVar, List list) {
        s30.b bVar = cVar.T0;
        list.getClass();
        bVar.getClass();
        h hVar = cVar.f148294e;
        if (hVar == null) {
            return;
        }
        cVar.T0 = bVar;
        cVar.U0 = h0.b1(list);
        s30.c cVar2 = cVar.R0;
        if (cVar2 == null || cVar.S0 != hVar) {
            Context contextRequireContext = cVar.requireContext();
            contextRequireContext.getClass();
            cVar.R0 = new s30.c(contextRequireContext, hVar, bVar);
            cVar.S0 = hVar;
        } else {
            s30.b bVar2 = cVar2.f156413b;
            cVar2.f156413b = bVar;
            if (bVar.f156400a != bVar2.f156400a || bVar.f156401b != bVar2.f156401b) {
                cVar2.f156419h.clear();
                cVar2.b();
            }
            if (bVar.f156410k != bVar2.f156410k || bVar.f156411l != bVar2.f156411l) {
                cVar2.f156418g = cVar2.a();
            }
            if (bVar.f156407h != bVar2.f156407h) {
                Iterator it = cVar2.f156415d.iterator();
                while (it.hasNext()) {
                    ((ie2.j) it.next()).a(cVar2.f156413b.f156407h);
                }
            }
            cVar2.f156421j = Integer.MIN_VALUE;
            cVar2.c();
        }
        s30.c cVar3 = cVar.R0;
        if (cVar3 != null) {
            List<f> list2 = cVar.U0;
            list2.getClass();
            cVar3.f156417f = list2;
            cVar3.f156418g = cVar3.a();
            cVar3.f156421j = Integer.MIN_VALUE;
            cVar3.c();
        }
    }

    public final void A6(String str, LatLng latLng, String str2, boolean z14, Double d14, Double d15) {
        g gVar;
        str.getClass();
        GeoPointDTO geoPointDTO = new GeoPointDTO(latLng.latitude, latLng.longitude);
        geoPointDTO.distance = d14;
        String string = "";
        String str3 = str2 == null ? "" : str2;
        k40.d dVar = this.f97011n;
        dVar.getClass();
        Context contextM0 = dVar.f102835a.m0();
        if (contextM0 != null) {
            com.garmin.android.apps.connectmobile.courses.model.f.f32898h.getClass();
            com.garmin.android.apps.connectmobile.courses.model.f fVarA = com.garmin.android.apps.connectmobile.courses.model.f.a.a(str);
            int[] iArr = k40.d.b.f102837a;
            int iOrdinal = fVarA.ordinal();
            int i14 = fVarA.f32926e;
            switch (iArr[iOrdinal]) {
                case 1:
                    string = contextM0.getString(i14, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
                    string.getClass();
                    break;
                case 2:
                    string = contextM0.getString(i14, "2");
                    string.getClass();
                    break;
                case 3:
                    string = contextM0.getString(i14, "3");
                    string.getClass();
                    break;
                case 4:
                    string = contextM0.getString(i14, "4");
                    string.getClass();
                    break;
                case 5:
                case 6:
                case 7:
                    string = str3;
                    break;
                default:
                    string = dh.b.A(contextM0, fVarA.a());
                    break;
            }
        }
        com.garmin.android.apps.connectmobile.courses.model.g gVar2 = new com.garmin.android.apps.connectmobile.courses.model.g(geoPointDTO, string);
        gVar2.derivedElevation = d15;
        gVar2.m(str);
        dVar.a(gVar2, this.L0, this.O0, str2);
        if (!z14 || (gVar = this.f97012o) == null) {
            return;
        }
        gVar.h1(gVar2);
    }

    public final void A7() {
        k40.h hVar = this.f97010m;
        hVar.f102846c.clear();
        h map = hVar.f102844a.getMap();
        if (map != null) {
            List<qe2.a> listB = hVar.b();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listB) {
                if (((qe2.a) obj).getZIndex() != 15.0f) {
                    arrayList.add(obj);
                }
            }
            map.Y(new k(arrayList, 1, 1));
        }
    }

    public final void B7() {
        j jVar = this.f97007k;
        jVar.getClass();
        k0 k0Var = k0.f134949a;
        k0Var.getClass();
        jVar.f102856f = k0Var;
        jVar.b();
    }

    public final void C6(List<com.garmin.android.apps.connectmobile.courses.model.g> list, boolean z14) {
        i.b bVar = this.L0;
        boolean z15 = this.O0;
        k40.d dVar = this.f97011n;
        ArrayList arrayList = dVar.f102836b;
        if (dVar.f102835a.getMap() == null || list == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((ie2.j) it.next()).remove();
        }
        arrayList.clear();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        for (com.garmin.android.apps.connectmobile.courses.model.g gVar : list) {
            String coursePointType = gVar.getCoursePointType();
            if (coursePointType == null) {
                coursePointType = "GENERIC";
            }
            if (coursePointType.equals(com.garmin.android.apps.connectmobile.courses.model.f.MARKER_MILE.f32922a)) {
                arrayList2.add(gVar);
            } else if (coursePointType.equals(com.garmin.android.apps.connectmobile.courses.model.f.MARKER_KILOMETER.f32922a)) {
                arrayList3.add(gVar);
            } else if (coursePointType.equals(com.garmin.android.apps.connectmobile.courses.model.f.MARKER_HALF_MARATHON.f32922a)) {
                arrayList4.add(gVar);
            } else {
                arrayList5.add(gVar);
            }
        }
        Iterator it3 = arrayList5.iterator();
        while (it3.hasNext()) {
            dVar.a((com.garmin.android.apps.connectmobile.courses.model.g) it3.next(), bVar, z15, null);
        }
        double d14 = z14 ? 21.1d : 13.1d;
        int i14 = 0;
        for (Object obj : o.b(new ArrayList(arrayList4), d14, false)) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                x.q();
                throw null;
            }
            o.f156028a.getClass();
            x0 x0Var = x0.f105818a;
            dVar.a((com.garmin.android.apps.connectmobile.courses.model.g) obj, bVar, false, String.format("%.1f", Arrays.copyOf(new Object[]{Double.valueOf(((double) i15) * d14)}, 1)));
            i14 = i15;
        }
        if (z14) {
            arrayList2 = arrayList3;
        }
        int i16 = 0;
        for (Object obj2 : o.b(new ArrayList(arrayList2), 1.0d, true)) {
            int i17 = i16 + 1;
            if (i16 < 0) {
                x.q();
                throw null;
            }
            dVar.a((com.garmin.android.apps.connectmobile.courses.model.g) obj2, bVar, false, String.valueOf(i17));
            i16 = i17;
        }
    }

    public final void C7() {
        h hVar = this.f148294e;
        if (hVar == null || this.U0.isEmpty()) {
            return;
        }
        if (this.R0 == null || this.S0 != hVar) {
            Q7(this, this.U0);
        }
    }

    public final void D7(int i14) {
        Object next;
        List<l> listS;
        Object next2;
        List<l> listS2;
        Object next3;
        List<ie2.j> listQ;
        Object next4;
        Bundle bundle;
        k40.a aVar = this.f97009l;
        k40.b bVar = aVar.f102827a;
        Context contextM0 = bVar.m0();
        if (contextM0 == null) {
            return;
        }
        aVar.f102831e.clear();
        h map = bVar.getMap();
        if (map != null && (listQ = map.f144584a.Q()) != null) {
            Iterator<T> it = listQ.iterator();
            do {
                if (!it.hasNext()) {
                    next4 = null;
                    break;
                } else {
                    next4 = it.next();
                    Object objMo329getTag = ((ie2.j) next4).mo329getTag();
                    bundle = objMo329getTag instanceof Bundle ? (Bundle) objMo329getTag : null;
                }
            } while ((bundle != null ? bundle.getInt("extra_climb_on_course_index", -1) : -1) != i14);
            ie2.j jVar = (ie2.j) next4;
            if (jVar != null) {
                jVar.setIcon(2131232519);
            }
        }
        h map2 = bVar.getMap();
        if (map2 != null && (listS2 = map2.f144584a.s()) != null) {
            Iterator<T> it3 = listS2.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    next3 = null;
                    break;
                }
                next3 = it3.next();
                l lVar = (l) next3;
                Object tag = lVar.getTag();
                String str = tag instanceof String ? (String) tag : null;
                if ((str != null ? Integer.parseInt(str) : -1) == i14 && lVar.getZIndex() == 10.0f) {
                    break;
                }
            }
            l lVar2 = (l) next3;
            if (lVar2 != null) {
                lVar2.a(-210.0f);
            }
        }
        h map3 = bVar.getMap();
        if (map3 != null && (listS = map3.f144584a.s()) != null) {
            Iterator<T> it4 = listS.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it4.next();
                l lVar3 = (l) next2;
                Object tag2 = lVar3.getTag();
                String str2 = tag2 instanceof String ? (String) tag2 : null;
                if ((str2 != null ? Integer.parseInt(str2) : -1) == i14 && lVar3.getZIndex() == 20.0f) {
                    break;
                }
            }
            l lVar4 = (l) next2;
            if (lVar4 != null) {
                lVar4.a(-200.0f);
            }
        }
        int color = a7.b.getColor(contextM0, R.color.gcm_system_static_black);
        w13.c cVar = com.garmin.android.apps.connectmobile.courses.model.b.f32827m;
        ArrayList arrayList = new ArrayList(y.r(cVar, 10));
        Iterator<T> it5 = cVar.iterator();
        while (it5.hasNext()) {
            q6.f.t(contextM0, ((com.garmin.android.apps.connectmobile.courses.model.b) it5.next()).f32829b, arrayList);
        }
        for (l lVar5 : aVar.d(true)) {
            Object tag3 = lVar5.getTag();
            Long l14 = tag3 instanceof Long ? (Long) tag3 : null;
            if (l14 != null) {
                Iterator it6 = aVar.f102829c.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it6.next();
                    Long l15 = ((k30.a) next).f102522a;
                    long jLongValue = l14.longValue();
                    if (l15 != null && l15.longValue() == jLongValue) {
                        break;
                    }
                }
                k30.a aVar2 = (k30.a) next;
                com.garmin.android.apps.connectmobile.courses.model.b bVar2 = aVar2 != null ? aVar2.f102524c : null;
                if (bVar2 != null) {
                    int iOrdinal = bVar2.ordinal();
                    if (lVar5.getZIndex() == ((iOrdinal * 100.0f) - 1000.0f) - 10) {
                        lVar5.f(color);
                    } else {
                        lVar5.f(((Number) arrayList.get(iOrdinal)).intValue());
                    }
                }
            }
        }
    }

    public final void E7(ClimbDTO climbDTO) {
        Long gmapClimbId;
        l lVar;
        l lVar2;
        List<l> listS;
        List<l> listS2;
        List<l> listS3;
        Object next;
        List<l> listS4;
        Object next2;
        k40.a aVar = this.f97009l;
        aVar.getClass();
        k40.b bVar = aVar.f102827a;
        Context contextM0 = bVar.m0();
        if (contextM0 == null || (gmapClimbId = climbDTO.getGmapClimbId()) == null) {
            return;
        }
        long jLongValue = gmapClimbId.longValue();
        float fOrdinal = ((climbDTO.getCategory().ordinal() * 100.0f) - 1000.0f) + 4000.0f;
        h map = bVar.getMap();
        if (map == null || (listS4 = map.f144584a.s()) == null) {
            lVar = null;
        } else {
            Iterator<T> it = listS4.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it.next();
                l lVar3 = (l) next2;
                Object tag = lVar3.getTag();
                Long l14 = tag instanceof Long ? (Long) tag : null;
                if (l14 != null && jLongValue == l14.longValue() && lVar3.getZIndex() == fOrdinal - 10) {
                    break;
                }
            }
            lVar = (l) next2;
        }
        if (lVar != null) {
            lVar.a(lVar.getZIndex() - 2000.0f);
        }
        h map2 = bVar.getMap();
        if (map2 == null || (listS3 = map2.f144584a.s()) == null) {
            lVar2 = null;
        } else {
            Iterator<T> it3 = listS3.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    next = null;
                    break;
                }
                next = it3.next();
                l lVar4 = (l) next;
                Object tag2 = lVar4.getTag();
                Long l15 = tag2 instanceof Long ? (Long) tag2 : null;
                if (l15 != null && jLongValue == l15.longValue() && lVar4.getZIndex() == fOrdinal) {
                    break;
                }
            }
            lVar2 = (l) next;
        }
        if (lVar2 != null) {
            lVar2.a(lVar2.getZIndex() - 2000.0f);
        }
        int color = a7.b.getColor(contextM0, R.color.gcm_system_static_black);
        ArrayList arrayList = aVar.f102831e;
        ArrayList arrayList2 = new ArrayList();
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            Long l16 = ((k30.a) it4.next()).f102522a;
            if (l16 != null) {
                arrayList2.add(l16);
            }
        }
        Iterator it5 = arrayList2.iterator();
        while (it5.hasNext()) {
            long jLongValue2 = ((Number) it5.next()).longValue();
            h map3 = bVar.getMap();
            if (map3 != null && (listS2 = map3.f144584a.s()) != null) {
                for (l lVar5 : listS2) {
                    Object tag3 = lVar5.getTag();
                    Long l17 = tag3 instanceof Long ? (Long) tag3 : null;
                    if (l17 != null && l17.longValue() == jLongValue2 && l17.longValue() != jLongValue && lVar5.getColor() == color) {
                        lVar5.setVisible(true);
                    }
                }
            }
        }
        ArrayList arrayList3 = aVar.f102830d;
        ArrayList arrayList4 = new ArrayList();
        Iterator it6 = arrayList3.iterator();
        while (it6.hasNext()) {
            Long l18 = ((k30.a) it6.next()).f102522a;
            if (l18 != null) {
                arrayList4.add(l18);
            }
        }
        Iterator it7 = arrayList4.iterator();
        while (it7.hasNext()) {
            long jLongValue3 = ((Number) it7.next()).longValue();
            h map4 = bVar.getMap();
            if (map4 != null && (listS = map4.f144584a.s()) != null) {
                for (l lVar6 : listS) {
                    Object tag4 = lVar6.getTag();
                    Long l19 = tag4 instanceof Long ? (Long) tag4 : null;
                    if (l19 != null && l19.longValue() == jLongValue3 && l19.longValue() != jLongValue && lVar6.getColor() == color) {
                        lVar6.setVisible(true);
                    }
                }
            }
        }
    }

    public final void F6(List<fn0.e> list) {
        Object next;
        int i14;
        h map;
        ArrayList arrayList;
        k40.h hVar = this.f97010m;
        ArrayList arrayList2 = hVar.f102846c;
        k40.b bVar = hVar.f102844a;
        Context contextM0 = bVar.m0();
        if (contextM0 == null) {
            return;
        }
        arrayList2.clear();
        ArrayList arrayList3 = new ArrayList();
        h map2 = bVar.getMap();
        List<qe2.a> listC = map2 != null ? map2.f144584a.C() : null;
        if (listC == null) {
            listC = j0.f134944a;
        }
        Iterator<T> it = listC.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((qe2.a) next).getZIndex() != 15.0f);
        qe2.a aVar = (qe2.a) next;
        Object tag = aVar != null ? aVar.getTag() : null;
        Bundle bundle = tag instanceof Bundle ? (Bundle) tag : null;
        String string = bundle != null ? bundle.getString("extra_hazard_geohash") : null;
        ArrayList arrayList4 = new ArrayList();
        for (Object obj : listC) {
            qe2.a aVar2 = (qe2.a) obj;
            Integer f125697b = aVar2.getF118169b();
            if (f125697b != null && f125697b.intValue() == 1 && aVar2.getZIndex() == -220.0f) {
                arrayList4.add(obj);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator<T> it3 = list.iterator();
        while (it3.hasNext()) {
            List<fn0.a> listA = ((fn0.e) it3.next()).a();
            if (listA != null) {
                for (fn0.a aVar3 : listA) {
                    arrayList2.add(aVar3);
                    if (p005kotlin.jvm.internal.s.g(aVar3.getGeohash(), string)) {
                        arrayList = arrayList2;
                    } else {
                        f fVar = new f(lb2.b.b(aVar3.getLat()), lb2.b.b(aVar3.getLon()), i.b.WGS84);
                        ArrayList arrayList6 = new ArrayList();
                        for (Object obj2 : arrayList4) {
                            ArrayList arrayList7 = arrayList2;
                            if (((qe2.a) obj2).getPosition().d(fVar, -1.0f)) {
                                arrayList6.add(obj2);
                            }
                            arrayList2 = arrayList7;
                        }
                        arrayList = arrayList2;
                        Iterator it4 = arrayList6.iterator();
                        while (it4.hasNext()) {
                            arrayList5.add((qe2.a) it4.next());
                        }
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("extra_hazard_geohash", aVar3.getGeohash());
                        p pVar = new p();
                        pVar.f50327a.f50322n = bundle2;
                        pVar.d(fVar);
                        pVar.c(hVar.a(aVar3.h().f72175c, contextM0));
                        pVar.f50327a.f50311c = -220.0f;
                        pVar.f50327a.f50320l = Integer.valueOf(R.drawable.cluster_icon_red);
                        pVar.f50327a.f50321m = Integer.valueOf(R.drawable.wide_cluster_iocn_red);
                        pVar.a(0.5f, 0.5f);
                        arrayList3.add(pVar);
                    }
                    arrayList2 = arrayList;
                }
            }
            arrayList2 = arrayList2;
        }
        if (arrayList5.isEmpty() || (map = bVar.getMap()) == null) {
            i14 = 1;
        } else {
            i14 = 1;
            map.Y(new k(arrayList5, 1, 1));
        }
        h map3 = bVar.getMap();
        if (map3 != null) {
            map3.f(i14, arrayList3);
        }
    }

    public final void F7(List<ClimbDTO> list) {
        ie2.j jVar;
        ArrayList<l> arrayList;
        Object next;
        h map;
        Object next2;
        com.garmin.android.apps.connectmobile.courses.model.b category;
        List<l> listS;
        List<ie2.j> listQ;
        Object next3;
        long[] longArray;
        com.garmin.android.apps.connectmobile.courses.model.b bVar = this.X;
        com.garmin.android.apps.connectmobile.courses.model.b bVar2 = this.Y;
        k40.a aVar = this.f97009l;
        ArrayList arrayList2 = aVar.f102829c;
        bVar.getClass();
        bVar2.getClass();
        k40.b bVar3 = aVar.f102827a;
        Context contextM0 = bVar3.m0();
        if (contextM0 == null || list.isEmpty()) {
            return;
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            Long l14 = ((k30.a) it.next()).f102522a;
            if (l14 != null) {
                arrayList3.add(l14);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj : list) {
            ClimbDTO climbDTO = (ClimbDTO) obj;
            if (climbDTO.getGmapClimbId() != null && h0.R(arrayList3, climbDTO.getGmapClimbId())) {
                arrayList4.add(obj);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it3 = arrayList4.iterator();
        while (it3.hasNext()) {
            Long gmapClimbId = ((ClimbDTO) it3.next()).getGmapClimbId();
            if (gmapClimbId != null) {
                arrayList5.add(gmapClimbId);
            }
        }
        h map2 = bVar3.getMap();
        if (map2 == null || (listQ = map2.f144584a.Q()) == null) {
            jVar = null;
        } else {
            Iterator<T> it4 = listQ.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    next3 = null;
                    break;
                }
                next3 = it4.next();
                Object objMo329getTag = ((ie2.j) next3).mo329getTag();
                Bundle bundle = objMo329getTag instanceof Bundle ? (Bundle) objMo329getTag : null;
                List<Long> listH0 = (bundle == null || (longArray = bundle.getLongArray("extra_primary_climb_ids")) == null) ? null : u.h0(longArray);
                if (listH0 == null) {
                    listH0 = j0.f134944a;
                }
                if (!listH0.isEmpty() && arrayList5.containsAll(listH0)) {
                    break;
                }
            }
            jVar = (ie2.j) next3;
        }
        h map3 = bVar3.getMap();
        if (map3 == null || (listS = map3.f144584a.s()) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (Object obj2 : listS) {
                Object tag = ((l) obj2).getTag();
                Long l15 = tag instanceof Long ? (Long) tag : null;
                if (l15 != null && arrayList5.contains(l15)) {
                    arrayList.add(obj2);
                }
            }
        }
        h map4 = bVar3.getMap();
        boolean z14 = (map4 != null ? map4.f144584a.getF50270z() : 0.0f) < 10.0f;
        Iterator it5 = arrayList4.iterator();
        do {
            if (!it5.hasNext()) {
                next = null;
                break;
            }
            next = it5.next();
            category = ((ClimbDTO) next).getCategory();
            if (category.compareTo(bVar) < 0) {
                break;
            }
        } while (category.compareTo(bVar2) <= 0);
        boolean z15 = next != null;
        if (z14 || z15) {
            if (jVar != null && (map = bVar3.getMap()) != null) {
                map.n(jVar);
            }
            if (arrayList != null) {
                for (l lVar : arrayList) {
                    h map5 = bVar3.getMap();
                    if (map5 != null) {
                        map5.m(lVar);
                    }
                }
            }
            arrayList2.removeIf(new n(new g0(6, arrayList5), 12));
        } else {
            if (jVar != null) {
                Object objMo329getTag2 = jVar.mo329getTag();
                Bundle bundle2 = objMo329getTag2 instanceof Bundle ? (Bundle) objMo329getTag2 : null;
                int i14 = bundle2 != null ? bundle2.getInt("extra_count_of_climbs_at_start", -1) : -1;
                if (i14 > 0) {
                    jVar.f(d7.b.b(new v30.a(contextM0, i14, false), 0, 0, 7));
                    h map6 = bVar3.getMap();
                    if (map6 != null) {
                        map6.n(jVar);
                    }
                    h map7 = bVar3.getMap();
                    if (map7 != null) {
                        map7.f(0, w.c(jVar.getF118120a()));
                    }
                    Iterator it6 = arrayList4.iterator();
                    if (!it6.hasNext()) {
                        c22.t.g();
                        return;
                    }
                    com.garmin.android.apps.connectmobile.courses.model.b category2 = ((ClimbDTO) it6.next()).getCategory();
                    while (it6.hasNext()) {
                        com.garmin.android.apps.connectmobile.courses.model.b category3 = ((ClimbDTO) it6.next()).getCategory();
                        if (category2.compareTo(category3) < 0) {
                            category2 = category3;
                        }
                    }
                    jVar.a((category2.ordinal() * 100.0f) - 1000.0f);
                }
            }
            if (arrayList != null) {
                for (l lVar2 : arrayList) {
                    lVar2.a(lVar2.getZIndex() - 2000.0f);
                }
            }
        }
        for (l lVar3 : aVar.e()) {
            h map8 = bVar3.getMap();
            if (map8 != null) {
                map8.m(lVar3);
            }
        }
        aVar.f102830d.clear();
        int color = a7.b.getColor(contextM0, R.color.gcm_system_static_black);
        w13.c cVar = com.garmin.android.apps.connectmobile.courses.model.b.f32827m;
        ArrayList arrayList6 = new ArrayList(y.r(cVar, 10));
        Iterator<T> it7 = cVar.iterator();
        while (it7.hasNext()) {
            q6.f.t(contextM0, ((com.garmin.android.apps.connectmobile.courses.model.b) it7.next()).f32829b, arrayList6);
        }
        for (l lVar4 : aVar.d(true)) {
            Object tag2 = lVar4.getTag();
            Long l16 = tag2 instanceof Long ? (Long) tag2 : null;
            if (l16 != null) {
                Iterator it8 = arrayList2.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it8.next();
                    Long l17 = ((k30.a) next2).f102522a;
                    long jLongValue = l16.longValue();
                    if (l17 != null && l17.longValue() == jLongValue) {
                        break;
                    }
                }
                k30.a aVar2 = (k30.a) next2;
                com.garmin.android.apps.connectmobile.courses.model.b bVar4 = aVar2 != null ? aVar2.f102524c : null;
                if (bVar4 != null) {
                    int iOrdinal = bVar4.ordinal();
                    if (lVar4.getZIndex() == ((iOrdinal * 100.0f) - 1000.0f) - 10) {
                        lVar4.f(color);
                    } else {
                        lVar4.f(((Number) arrayList6.get(iOrdinal)).intValue());
                    }
                }
            }
        }
        aVar.f102831e.clear();
    }

    public final void G6(List<fn0.a> list) {
        qe2.a aVar;
        List<qe2.a> listC;
        Object next;
        list.getClass();
        if (V6().f109902j) {
            k40.h hVar = this.f97010m;
            ArrayList arrayList = hVar.f102846c;
            k40.b bVar = hVar.f102844a;
            Context contextM0 = bVar.m0();
            if (contextM0 == null) {
                return;
            }
            arrayList.clear();
            h map = bVar.getMap();
            if (map == null || (listC = map.f144584a.C()) == null) {
                aVar = null;
            } else {
                Iterator<T> it = listC.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (((qe2.a) next).getZIndex() != 15.0f);
                aVar = (qe2.a) next;
            }
            Object tag = aVar != null ? aVar.getTag() : null;
            Bundle bundle = tag instanceof Bundle ? (Bundle) tag : null;
            String string = bundle != null ? bundle.getString("extra_hazard_on_course_index") : null;
            for (fn0.a aVar2 : list) {
                arrayList.add(aVar2);
                if (!p005kotlin.jvm.internal.s.g(aVar2.getGeohash(), string)) {
                    f fVar = new f(lb2.b.b(aVar2.getLat()), lb2.b.b(aVar2.getLon()), i.b.WGS84);
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("extra_hazard_on_course_index", aVar2.getGeohash());
                    p pVar = new p();
                    pVar.f50327a.f50322n = bundle2;
                    pVar.d(fVar);
                    pVar.c(hVar.a(aVar2.h().f72175c, contextM0));
                    pVar.f50327a.f50311c = -230.0f;
                    pVar.a(0.5f, 0.5f);
                    h map2 = bVar.getMap();
                    if (map2 != null) {
                        map2.x(pVar);
                    }
                }
            }
        }
    }

    public final void G7(com.garmin.android.apps.connectmobile.courses.model.g gVar) {
        Object next;
        com.garmin.android.apps.connectmobile.courses.model.g gVar2;
        boolean z14 = this.O0;
        k40.d dVar = this.f97011n;
        k40.b bVar = dVar.f102835a;
        Context contextM0 = bVar.m0();
        if (contextM0 == null) {
            return;
        }
        Iterator it = dVar.f102836b.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                gVar2 = (com.garmin.android.apps.connectmobile.courses.model.g) ((ie2.j) next).getTag();
            }
        } while (!(gVar2 != null ? gVar2.h(gVar) : false));
        ie2.j jVar = (ie2.j) next;
        h map = bVar.getMap();
        if (jVar == null || map == null) {
            return;
        }
        com.garmin.android.apps.connectmobile.courses.model.f.a aVar = com.garmin.android.apps.connectmobile.courses.model.f.f32898h;
        String coursePointType = gVar.getCoursePointType();
        aVar.getClass();
        com.garmin.android.apps.connectmobile.courses.model.f fVarA = com.garmin.android.apps.connectmobile.courses.model.f.a.a(coursePointType);
        String str = gVar.name;
        if (str == null) {
            str = "";
        }
        Bitmap bitmapB = d7.b.b(new u40.d(contextM0, fVarA, false, str, 0.0f, 16, null), 0, 0, 7);
        if (z14) {
            bitmapB = s20.c.a(contextM0, bitmapB);
        }
        jVar.f(bitmapB);
        jVar.l(z14);
    }

    public final void H6(List<PointOfInterestDTO> list) {
        j jVar = this.f97007k;
        jVar.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(list.size());
        for (PointOfInterestDTO pointOfInterestDTO : list) {
            if (pointOfInterestDTO.getCom.garmin.android.gncs.NotificationConstants.KEY_DATA_MIME_TYPE java.lang.String() != null) {
                linkedHashMap.putIfAbsent(k40.k.a(pointOfInterestDTO), pointOfInterestDTO);
            }
        }
        jVar.f102856f = linkedHashMap;
        jVar.b();
    }

    public final void H7(fn0.a aVar) {
        qe2.a aVar2;
        Object next;
        h map;
        List<qe2.a> listC;
        Object obj;
        qe2.a aVar3;
        List<qe2.a> listC2;
        Object obj2;
        k40.h hVar = this.f97010m;
        hVar.getClass();
        k40.b bVar = hVar.f102844a;
        Context contextM0 = bVar.m0();
        if (contextM0 == null) {
            return;
        }
        Iterator it = hVar.f102846c.iterator();
        do {
            aVar2 = null;
            obj2 = null;
            aVar3 = null;
            aVar3 = null;
            obj = null;
            aVar2 = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!p005kotlin.jvm.internal.s.g(((fn0.a) next).getGeohash(), aVar.getGeohash()));
        if (next == null) {
            h map2 = bVar.getMap();
            if (map2 != null && (listC = map2.f144584a.C()) != null) {
                for (Object obj3 : listC) {
                    if (((qe2.a) obj3).getZIndex() == 15.0f) {
                        obj = obj3;
                        break;
                    }
                }
                aVar2 = (qe2.a) obj;
            }
            if (aVar2 == null || (map = bVar.getMap()) == null) {
                return;
            }
            map.Y(new k(w.c(aVar2), 1, 1));
            return;
        }
        h map3 = bVar.getMap();
        if (map3 != null && (listC2 = map3.f144584a.C()) != null) {
            for (Object obj4 : listC2) {
                Object tag = ((qe2.a) obj4).getTag();
                Bundle bundle = tag instanceof Bundle ? (Bundle) tag : null;
                if (p005kotlin.jvm.internal.s.g(bundle != null ? bundle.getString("extra_hazard_geohash") : null, aVar.getGeohash())) {
                    obj2 = obj4;
                    break;
                }
            }
            aVar3 = (qe2.a) obj2;
        }
        if (aVar3 != null) {
            aVar3.f(hVar.a(aVar.h().f72175c, contextM0));
            aVar3.a(-220.0f);
            h map4 = bVar.getMap();
            if (map4 != null) {
                map4.S();
            }
        }
    }

    @Override // com.garmin.android.library.mapsdkadapter.i.h
    public final void I1(f fVar) {
        h hVar = this.f148294e;
        if (hVar != null) {
            i.a.b(hVar, fVar, hVar.f144584a.getF50270z() + 1.0f, 4);
        }
    }

    public final void I6() {
        h hVar = this.f148294e;
        if (hVar != null) {
            hVar.clear();
        }
        s30.c cVar = this.R0;
        if (cVar != null) {
            cVar.f156415d.clear();
            cVar.f156416e.clear();
            j0 j0Var = j0.f134944a;
            cVar.f156417f = j0Var;
            cVar.f156418g = null;
            cVar.f156420i = j0Var;
            cVar.f156421j = Integer.MIN_VALUE;
        }
        this.U0 = j0.f134944a;
        U6(hVar);
    }

    public final void J7(PointOfInterestDTO pointOfInterestDTO) {
        j jVar = this.f97007k;
        jVar.getClass();
        PointOfInterestDTO pointOfInterestDTO2 = jVar.f102855e;
        if (p005kotlin.jvm.internal.s.g(pointOfInterestDTO2 != null ? k40.k.a(pointOfInterestDTO2) : null, k40.k.a(pointOfInterestDTO))) {
            jVar.f102855e = null;
        }
        jVar.b();
    }

    public final void K6() {
        com.garmin.android.apps.connectmobile.courses.model.i f104023a;
        if (((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).n4()) {
            u20.g gVar = this.f97020y;
            if (gVar == null || (f104023a = gVar.getF104023a()) == null) {
                f104023a = com.garmin.android.apps.connectmobile.courses.model.i.OTHER;
            }
            String string = (f104023a.c() && this.E) ? getString(R.string.cycling_course_map_settings_tooltip) : getString(R.string.course_map_settings_tooltip);
            string.getClass();
            MapOptionsContainer mapOptionsContainerX6 = X6();
            mapOptionsContainerX6.f38742h.setText(string);
            v22.e.v(mapOptionsContainerX6.f38741g, true);
        }
    }

    public final void K7(Long l14) {
        ie2.j jVar;
        l lVar;
        l lVar2;
        Object next;
        int i14;
        List<l> listS;
        Object next2;
        List<l> listS2;
        Object next3;
        List<ie2.j> listQ;
        Object next4;
        long[] longArray;
        com.garmin.android.apps.connectmobile.courses.model.b bVar = this.X;
        com.garmin.android.apps.connectmobile.courses.model.b bVar2 = this.Y;
        k40.a aVar = this.f97009l;
        ArrayList arrayList = aVar.f102829c;
        ArrayList arrayList2 = aVar.f102831e;
        bVar.getClass();
        bVar2.getClass();
        k40.b bVar3 = aVar.f102827a;
        Context contextM0 = bVar3.m0();
        if (contextM0 == null || l14 == null || arrayList2.isEmpty()) {
            return;
        }
        h map = bVar3.getMap();
        if (map == null || (listQ = map.f144584a.Q()) == null) {
            jVar = null;
        } else {
            Iterator<T> it = listQ.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next4 = null;
                    break;
                }
                next4 = it.next();
                Object objMo329getTag = ((ie2.j) next4).mo329getTag();
                Bundle bundle = objMo329getTag instanceof Bundle ? (Bundle) objMo329getTag : null;
                if (bundle != null && (longArray = bundle.getLongArray("extra_primary_climb_ids")) != null && u.y(longArray, l14.longValue())) {
                    break;
                }
            }
            jVar = (ie2.j) next4;
        }
        h map2 = bVar3.getMap();
        if (map2 == null || (listS2 = map2.f144584a.s()) == null) {
            lVar = null;
        } else {
            Iterator<T> it3 = listS2.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    next3 = null;
                    break;
                }
                next3 = it3.next();
                l lVar3 = (l) next3;
                Object tag = lVar3.getTag();
                Long l15 = tag instanceof Long ? (Long) tag : null;
                if (l15 != null && l15.equals(l14) && lVar3.getZIndex() == 30.0f) {
                    break;
                }
            }
            lVar = (l) next3;
        }
        h map3 = bVar3.getMap();
        if (map3 == null || (listS = map3.f144584a.s()) == null) {
            lVar2 = null;
        } else {
            Iterator<T> it4 = listS.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it4.next();
                l lVar4 = (l) next2;
                Object tag2 = lVar4.getTag();
                Long l16 = tag2 instanceof Long ? (Long) tag2 : null;
                if (l16 != null && l16.equals(l14) && lVar4.getZIndex() == 40.0f) {
                    break;
                }
            }
            lVar2 = (l) next2;
        }
        if (jVar == null || lVar == null || lVar2 == null) {
            arrayList2.clear();
            return;
        }
        h map4 = bVar3.getMap();
        boolean z14 = (map4 != null ? map4.f144584a.getF50270z() : 0.0f) < 10.0f;
        k30.a aVar2 = (k30.a) h0.b0(arrayList2);
        com.garmin.android.apps.connectmobile.courses.model.b bVar4 = aVar2.f102524c;
        boolean z15 = bVar4.compareTo(bVar) >= 0 && bVar4.compareTo(bVar2) <= 0;
        float f14 = 100.0f;
        if (z14 || !z15) {
            f14 = 100.0f;
            ie2.j jVar2 = jVar;
            h map5 = bVar3.getMap();
            if (map5 != null) {
                map5.n(jVar2);
            }
            h map6 = bVar3.getMap();
            if (map6 != null) {
                map6.m(lVar);
            }
            h map7 = bVar3.getMap();
            if (map7 != null) {
                map7.m(lVar2);
            }
            arrayList.removeIf(new n(new f2(2, l14), 13));
        } else {
            float fOrdinal = (aVar2.f102524c.ordinal() * 100.0f) - 1000.0f;
            Object objMo329getTag2 = jVar.mo329getTag();
            Bundle bundle2 = objMo329getTag2 instanceof Bundle ? (Bundle) objMo329getTag2 : null;
            int i15 = bundle2 != null ? bundle2.getInt("extra_count_of_climbs_at_start", -1) : -1;
            if (i15 > 0) {
                ie2.j jVar3 = jVar;
                jVar3.f(d7.b.b(new v30.a(contextM0, i15, false, 4, null), 0, 0, 7));
                jVar3.a(fOrdinal);
                h map8 = bVar3.getMap();
                if (map8 != null) {
                    map8.n(jVar3);
                }
                h map9 = bVar3.getMap();
                if (map9 != null) {
                    map9.f(0, w.c(jVar3.getF118120a()));
                }
                i14 = 10;
            } else {
                i14 = 10;
            }
            lVar.a(fOrdinal - i14);
            lVar2.a(fOrdinal);
        }
        int color = a7.b.getColor(contextM0, R.color.gcm_system_static_black);
        w13.c cVar = com.garmin.android.apps.connectmobile.courses.model.b.f32827m;
        ArrayList arrayList3 = new ArrayList(y.r(cVar, 10));
        Iterator<T> it5 = cVar.iterator();
        while (it5.hasNext()) {
            q6.f.t(contextM0, ((com.garmin.android.apps.connectmobile.courses.model.b) it5.next()).f32829b, arrayList3);
        }
        for (l lVar5 : aVar.d(true)) {
            Object tag3 = lVar5.getTag();
            Long l17 = tag3 instanceof Long ? (Long) tag3 : null;
            if (l17 != null) {
                Iterator it6 = arrayList.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it6.next();
                    Long l18 = ((k30.a) next).f102522a;
                    long jLongValue = l17.longValue();
                    if (l18 != null && l18.longValue() == jLongValue) {
                        break;
                    }
                }
                k30.a aVar3 = (k30.a) next;
                com.garmin.android.apps.connectmobile.courses.model.b bVar5 = aVar3 != null ? aVar3.f102524c : null;
                if (bVar5 != null) {
                    int iOrdinal = bVar5.ordinal();
                    if (lVar5.getZIndex() == ((iOrdinal * f14) - 1000.0f) - 10) {
                        lVar5.f(color);
                    } else {
                        lVar5.f(((Number) arrayList3.get(iOrdinal)).intValue());
                    }
                }
            }
        }
        arrayList2.clear();
    }

    public final void L7(com.garmin.android.apps.connectmobile.courses.model.e eVar, i iVar) {
        eVar.getClass();
        iVar.getClass();
        ArrayList arrayList = this.f97008k0;
        arrayList.clear();
        List<com.garmin.android.apps.connectmobile.courses.model.g> list = eVar.intervalMarkers;
        if (list != null && !list.isEmpty()) {
            List<com.garmin.android.apps.connectmobile.courses.model.g> list2 = eVar.intervalMarkers;
            if (list2 == null) {
                list2 = j0.f134944a;
            }
            for (com.garmin.android.apps.connectmobile.courses.model.g gVar : list2) {
                if (gVar.lat != null && gVar.lon != null) {
                    i.b bVarH = eVar.h();
                    if (bVarH == null) {
                        Double d14 = gVar.lat;
                        double dDoubleValue = d14 != null ? d14.doubleValue() : 0.0d;
                        Double d15 = gVar.lon;
                        bVarH = com.garmin.android.library.mapsdkadapter.m.d(dDoubleValue, d15 != null ? d15.doubleValue() : 0.0d);
                    }
                    i.b bVar = bVarH;
                    Double d16 = gVar.lat;
                    double dDoubleValue2 = d16 != null ? d16.doubleValue() : 0.0d;
                    Double d17 = gVar.lon;
                    f fVar = new f(dDoubleValue2, d17 != null ? d17.doubleValue() : 0.0d, bVar);
                    p pVar = new p();
                    String str = gVar.name;
                    if (str == null) {
                        str = "";
                    }
                    k40.c cVar = this.f97006j;
                    cVar.getClass();
                    Context contextM0 = cVar.f102832a.m0();
                    Resources resources = contextM0 != null ? contextM0.getResources() : null;
                    Bitmap bitmapA = qw0.j.a(resources, str, (Paint) cVar.f102833b.getValue());
                    if (bitmapA == null) {
                        bitmapA = BitmapFactory.decodeResource(resources, 2131231999);
                        bitmapA.getClass();
                    }
                    pVar.c(bitmapA);
                    pVar.a(0.5f, 0.5f);
                    pVar.d(fVar);
                    ie2.j jVarX = iVar.x(pVar);
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("interval_marker", true);
                    jVarX.b(bundle);
                    arrayList.add(jVarX);
                }
            }
        }
        a8();
    }

    public final void M6() {
        h hVar = this.f148294e;
        if (hVar != null) {
            hVar.f144584a.getUiSettings().setZoomControlsEnabled(false);
        }
    }

    public final void N7(int i14) {
        h hVar = this.f148294e;
        if (hVar != null) {
            com.garmin.android.library.mapsdkadapter.m.f50298a.getClass();
            if (i14 == 1 || i14 == 2 || i14 == 4 || i14 == 3) {
                hVar.setMapType(i14);
            }
        }
    }

    @Override // com.garmin.android.library.mapsdkadapter.i.m
    public final boolean O2(ie2.j jVar) {
        if (!p005kotlin.jvm.internal.s.g(jVar.mo329getTag(), "course_direction_arrow")) {
            Object objMo329getTag = jVar.mo329getTag();
            Bundle bundle = objMo329getTag instanceof Bundle ? (Bundle) objMo329getTag : null;
            if (bundle == null || !bundle.containsKey("interval_marker")) {
                if (this.M0 || jVar.mo329getTag() == null) {
                    return false;
                }
                Object objMo329getTag2 = jVar.mo329getTag();
                return e7(objMo329getTag2 instanceof Bundle ? (Bundle) objMo329getTag2 : null);
            }
        }
        return true;
    }

    public final void O7(com.garmin.android.apps.connectmobile.courses.model.c cVar) {
        e a14;
        u20.g gVar;
        cVar.getClass();
        h hVar = this.f148294e;
        if (hVar == null || (a14 = hVar.f144584a.getA()) == null || (gVar = this.f97020y) == null) {
            return;
        }
        gVar.K2(a14, cVar, this.X, this.Y);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v27, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r11v28, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v15, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r7v16, types: [java.util.ArrayList] */
    public final void P7(List<ClimbDTO> list) {
        ?? arrayList;
        i.b bVar;
        k40.a aVar;
        k40.b bVar2;
        char c14;
        byte b14;
        byte b15;
        i.b bVarD;
        ArrayList arrayList2;
        i.b bVarD2;
        List<qe2.a> listC;
        ?? arrayList3;
        List<l> listS;
        i.b bVar3;
        k40.a aVar2;
        k40.b bVar4;
        Object obj;
        List<l> listS2;
        List<l> listS3;
        list.getClass();
        i.b bVar5 = this.K0;
        k40.a aVar3 = this.f97009l;
        ArrayList arrayList4 = aVar3.f102828b;
        k40.b bVar6 = aVar3.f102827a;
        Context contextM0 = bVar6.m0();
        if (contextM0 == null) {
            return;
        }
        h map = bVar6.getMap();
        char c15 = Ascii.MIN;
        byte b16 = -1018036224;
        if (map == null || (listS3 = map.f144584a.s()) == null) {
            arrayList = 0;
        } else {
            arrayList = new ArrayList();
            for (Object obj2 : listS3) {
                l lVar = (l) obj2;
                if (lVar.getZIndex() == -200.0f || lVar.getZIndex() == -210.0f || lVar.getZIndex() == 20.0f || lVar.getZIndex() == 10.0f) {
                    arrayList.add(obj2);
                }
            }
        }
        if (arrayList == 0) {
            arrayList = j0.f134944a;
        }
        for (l lVar2 : (Iterable) arrayList) {
            h map2 = bVar6.getMap();
            if (map2 != null) {
                map2.m(lVar2);
            }
        }
        for (ie2.j jVar : aVar3.b()) {
            h map3 = bVar6.getMap();
            if (map3 != null) {
                map3.n(jVar);
            }
        }
        arrayList4.clear();
        int color = a7.b.getColor(contextM0, R.color.gcm_system_static_black);
        w13.c cVar = com.garmin.android.apps.connectmobile.courses.model.b.f32827m;
        ArrayList arrayList5 = new ArrayList(y.r(cVar, 10));
        Iterator it = cVar.iterator();
        while (it.hasNext()) {
            q6.f.t(contextM0, ((com.garmin.android.apps.connectmobile.courses.model.b) it.next()).f32829b, arrayList5);
        }
        int i14 = 0;
        for (Object obj3 : list) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                x.q();
                throw null;
            }
            ClimbDTO climbDTO = (ClimbDTO) obj3;
            List<GeoPointDTO> listM = climbDTO.m();
            ArrayList arrayList6 = new ArrayList();
            for (Object obj4 : listM) {
                if (((GeoPointDTO) obj4).b()) {
                    arrayList6.add(obj4);
                }
            }
            if (arrayList6.isEmpty()) {
                bVar = bVar5;
                aVar = aVar3;
                bVar2 = bVar6;
                c14 = c15;
                b14 = b16;
                b15 = -1018691584;
            } else {
                GeoPointDTO geoPointDTO = (GeoPointDTO) h0.b0(arrayList6);
                Double d14 = geoPointDTO.latitude;
                double dDoubleValue = d14 != null ? d14.doubleValue() : 0.0d;
                Double d15 = geoPointDTO.longitude;
                double dDoubleValue2 = d15 != null ? d15.doubleValue() : 0.0d;
                if (bVar5 == null) {
                    Double d16 = geoPointDTO.latitude;
                    double dDoubleValue3 = d16 != null ? d16.doubleValue() : 0.0d;
                    Double d17 = geoPointDTO.longitude;
                    bVarD = com.garmin.android.library.mapsdkadapter.m.d(dDoubleValue3, d17 != null ? d17.doubleValue() : 0.0d);
                } else {
                    arrayList6 = arrayList6;
                    i14 = i14;
                    bVarD = bVar5;
                }
                f fVar = new f(dDoubleValue, dDoubleValue2, bVarD);
                ArrayList arrayList7 = aVar3.f102830d;
                ArrayList arrayList8 = aVar3.f102829c;
                ArrayList arrayList9 = new ArrayList();
                for (Object obj5 : arrayList8) {
                    if (((k30.a) obj5).f102525d.d(fVar, -1.0f)) {
                        arrayList9.add(obj5);
                    }
                }
                Iterator it3 = arrayList9.iterator();
                while (it3.hasNext()) {
                    Long l14 = ((k30.a) it3.next()).f102522a;
                    if (l14 != null) {
                        h map4 = bVar6.getMap();
                        if (map4 == null || (listS2 = map4.f144584a.s()) == null) {
                            bVar3 = bVar5;
                            aVar2 = aVar3;
                            bVar4 = bVar6;
                            obj = null;
                        } else {
                            ArrayList arrayList10 = new ArrayList();
                            for (Object obj6 : listS2) {
                                i.b bVar7 = bVar5;
                                k40.a aVar4 = aVar3;
                                Object tag = ((l) obj6).getTag();
                                k40.b bVar8 = bVar6;
                                Long l15 = tag instanceof Long ? (Long) tag : null;
                                if (l15 != null && l14.equals(l15)) {
                                    arrayList10.add(obj6);
                                }
                                bVar5 = bVar7;
                                bVar6 = bVar8;
                                aVar3 = aVar4;
                            }
                            bVar3 = bVar5;
                            aVar2 = aVar3;
                            bVar4 = bVar6;
                            obj = arrayList10;
                        }
                        if (obj == null) {
                            obj = j0.f134944a;
                        }
                        for (l lVar3 : (Iterable) obj) {
                            h map5 = bVar4.getMap();
                            if (map5 != null) {
                                map5.m(lVar3);
                            }
                        }
                    } else {
                        bVar3 = bVar5;
                        aVar2 = aVar3;
                        bVar4 = bVar6;
                    }
                    bVar5 = bVar3;
                    bVar6 = bVar4;
                    aVar3 = aVar2;
                }
                bVar = bVar5;
                aVar = aVar3;
                bVar2 = bVar6;
                arrayList8.removeAll(arrayList9);
                ArrayList arrayList11 = new ArrayList();
                for (Object obj7 : arrayList7) {
                    if (((k30.a) obj7).f102525d.d(fVar, -1.0f)) {
                        arrayList11.add(obj7);
                    }
                }
                Iterator it4 = arrayList11.iterator();
                while (it4.hasNext()) {
                    Long l16 = ((k30.a) it4.next()).f102522a;
                    if (l16 != null) {
                        h map6 = bVar2.getMap();
                        if (map6 == null || (listS = map6.f144584a.s()) == null) {
                            arrayList3 = 0;
                        } else {
                            arrayList3 = new ArrayList();
                            for (Object obj8 : listS) {
                                Object tag2 = ((l) obj8).getTag();
                                Long l17 = tag2 instanceof Long ? (Long) tag2 : null;
                                if (l17 != null && l16.equals(l17)) {
                                    arrayList3.add(obj8);
                                }
                            }
                        }
                        if (arrayList3 == 0) {
                            arrayList3 = j0.f134944a;
                        }
                        for (l lVar4 : (Iterable) arrayList3) {
                            h map7 = bVar2.getMap();
                            if (map7 != null) {
                                map7.m(lVar4);
                            }
                        }
                    }
                }
                arrayList7.removeAll(arrayList11);
                h map8 = bVar2.getMap();
                if (map8 == null || (listC = map8.f144584a.C()) == null) {
                    arrayList2 = null;
                } else {
                    ArrayList arrayList12 = new ArrayList();
                    for (Object obj9 : listC) {
                        Integer f125697b = ((qe2.a) obj9).getF118169b();
                        if (f125697b != null && f125697b.intValue() == 0) {
                            arrayList12.add(obj9);
                        }
                    }
                    arrayList2 = new ArrayList();
                    for (Object obj10 : arrayList12) {
                        if (((qe2.a) obj10).getPosition().d(fVar, -1.0f)) {
                            arrayList2.add(obj10);
                        }
                    }
                }
                ArrayList arrayList13 = new ArrayList();
                if (arrayList2 != null) {
                    Iterator it5 = arrayList2.iterator();
                    while (it5.hasNext()) {
                        arrayList13.add((qe2.a) it5.next());
                    }
                }
                h map9 = bVar2.getMap();
                if (map9 != null) {
                    map9.Y(new k(arrayList13, 0, 1));
                }
                int iOrdinal = climbDTO.getCategory().ordinal();
                ArrayList<GeoPointDTO> arrayList14 = arrayList6;
                ArrayList arrayList15 = new ArrayList(y.r(arrayList14, 10));
                for (GeoPointDTO geoPointDTO2 : arrayList14) {
                    Double d18 = geoPointDTO2.latitude;
                    double dDoubleValue4 = d18 != null ? d18.doubleValue() : 0.0d;
                    Double d19 = geoPointDTO2.longitude;
                    double dDoubleValue5 = d19 != null ? d19.doubleValue() : 0.0d;
                    if (bVar == null) {
                        Double d24 = geoPointDTO2.latitude;
                        double dDoubleValue6 = d24 != null ? d24.doubleValue() : 0.0d;
                        Double d25 = geoPointDTO2.longitude;
                        bVarD2 = com.garmin.android.library.mapsdkadapter.m.d(dDoubleValue6, d25 != null ? d25.doubleValue() : 0.0d);
                    } else {
                        bVarD2 = bVar;
                    }
                    arrayList15.add(new f(dDoubleValue4, dDoubleValue5, bVarD2));
                }
                com.garmin.android.library.mapsdkadapter.q qVar = new com.garmin.android.library.mapsdkadapter.q();
                String strValueOf = String.valueOf(i14);
                ie2.p pVar = qVar.f50328a;
                pVar.f93164l = strValueOf;
                pVar.f93156d = color;
                pVar.f93155c = 15.0f;
                b14 = -1018036224;
                pVar.f93158f = -210.0f;
                qVar.a(arrayList15);
                h map10 = bVar2.getMap();
                if (map10 != null) {
                    map10.h(qVar);
                }
                com.garmin.android.library.mapsdkadapter.q qVar2 = new com.garmin.android.library.mapsdkadapter.q();
                String strValueOf2 = String.valueOf(i14);
                ie2.p pVar2 = qVar2.f50328a;
                pVar2.f93164l = strValueOf2;
                pVar2.f93156d = ((Number) arrayList5.get(iOrdinal)).intValue();
                c14 = Ascii.MIN;
                pVar2.f93155c = 10.0f;
                pVar2.f93158f = -200.0f;
                qVar2.a(arrayList15);
                h map11 = bVar2.getMap();
                if (map11 != null) {
                    map11.h(qVar2);
                }
                Bundle bundleE = am.j.e(i14, "extra_climb_on_course_index");
                p pVar3 = new p();
                pVar3.f50327a.f50322n = bundleE;
                pVar3.d(fVar);
                pVar3.b(2131232519);
                b15 = -1018691584;
                pVar3.f50327a.f50311c = -200.0f;
                pVar3.a(0.5f, 0.5f);
                h map12 = bVar2.getMap();
                if (map12 != null) {
                    map12.x(pVar3);
                }
            }
            c15 = c14;
            b16 = b14;
            i14 = i15;
            bVar5 = bVar;
            bVar6 = bVar2;
            aVar3 = aVar;
        }
        arrayList4.addAll(list);
    }

    public final void R7(ArrayList arrayList) {
        i.b bVar;
        f fVar;
        arrayList.getClass();
        i.b bVar2 = this.K0;
        k40.e eVar = this.f97005i;
        eVar.getClass();
        k40.b bVar3 = eVar.f102839a;
        Context contextM0 = bVar3.m0();
        if (contextM0 == null) {
            return;
        }
        int color = a7.b.getColor(contextM0, R.color.red_10_static);
        int color2 = a7.b.getColor(contextM0, R.color.gcm_system_static_black);
        List<? extends ie2.o> listK = x.k(new ie2.o.a(8.0f), new ie2.o.b(8.0f));
        ArrayList<List> arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!((List) obj).isEmpty()) {
                arrayList2.add(obj);
            }
        }
        for (List<GeoPointDTO> list : arrayList2) {
            ArrayList arrayList3 = new ArrayList();
            for (GeoPointDTO geoPointDTO : list) {
                Double d14 = geoPointDTO.latitude;
                Double d15 = geoPointDTO.longitude;
                if (d14 == null || d15 == null) {
                    bVar = bVar2;
                    fVar = null;
                } else {
                    bVar = bVar2;
                    fVar = new f(d14.doubleValue(), d15.doubleValue(), bVar2 == null ? com.garmin.android.library.mapsdkadapter.m.d(d14.doubleValue(), d15.doubleValue()) : bVar);
                }
                if (fVar != null) {
                    arrayList3.add(fVar);
                }
                bVar2 = bVar;
            }
            i.b bVar4 = bVar2;
            com.garmin.android.library.mapsdkadapter.q qVar = new com.garmin.android.library.mapsdkadapter.q();
            ie2.p pVar = qVar.f50328a;
            pVar.f93156d = color;
            ie2.d.a aVar = ie2.d.a.f93115a;
            qVar.d(aVar);
            qVar.c(aVar);
            pVar.f93155c = 10.0f;
            pVar.f93158f = 60.0f;
            qVar.a(arrayList3);
            h map = bVar3.getMap();
            if (map != null) {
                map.h(qVar);
            }
            com.garmin.android.library.mapsdkadapter.q qVar2 = new com.garmin.android.library.mapsdkadapter.q();
            ie2.p pVar2 = qVar2.f50328a;
            pVar2.f93156d = color2;
            listK.getClass();
            pVar2.getClass();
            pVar2.f93157e = listK;
            qVar2.d(aVar);
            qVar2.c(aVar);
            pVar2.f93155c = 10.0f;
            pVar2.f93158f = 70.0f;
            qVar2.a(arrayList3);
            h map2 = bVar3.getMap();
            if (map2 != null) {
                map2.h(qVar2);
            }
            bVar2 = bVar4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void S6(List list, f fVar, com.garmin.android.apps.connectmobile.courses.model.f fVar2, q qVar, e23.l lVar, boolean z14) {
        GeoPointDTO geoPointDTO;
        String str = fVar2.f32922a;
        if (fVar != null) {
            LatLng latLng = fVar.f50283a;
            geoPointDTO = new GeoPointDTO(latLng.latitude, latLng.longitude);
        } else {
            geoPointDTO = null;
        }
        if (geoPointDTO == null) {
            lVar.invoke(Boolean.FALSE);
            a2 a2Var = a2.COURSES;
            i2.f36769a.getClass();
            i2.a.f(a2Var, "CourseMapFragment", "Failed to get CenterCoordinates for course point");
            Toast.makeText(getContext(), R.string.txt_error_occurred, 0).show();
            return;
        }
        this.P0.getClass();
        ArrayList arrayListE = s20.m.e(list, geoPointDTO);
        if (arrayListE.size() > 1) {
            if (str == null) {
                str = com.garmin.android.apps.connectmobile.courses.model.f.GENERIC.f32922a;
            }
            qVar.invoke(arrayListE, str, null);
            return;
        }
        if (!arrayListE.isEmpty()) {
            lVar.invoke(Boolean.TRUE);
            GeoPointDTO geoPointDTO2 = (GeoPointDTO) h0.b0(arrayListE);
            if (str == null) {
                str = com.garmin.android.apps.connectmobile.courses.model.f.GENERIC.f32922a;
            }
            Double d14 = geoPointDTO2.latitude;
            double dDoubleValue = d14 != null ? d14.doubleValue() : 0.0d;
            Double d15 = geoPointDTO2.longitude;
            A6(str, new LatLng(dDoubleValue, d15 != null ? d15.doubleValue() : 0.0d), null, true, geoPointDTO2.distance, geoPointDTO2.elevation);
            return;
        }
        if (z14) {
            i.b bVar = fVar.f50284b;
            s20.e.f156007a.getClass();
            f fVar3 = (f) s20.e.a(this.J0, fVar).f128605a;
            S6(list, fVar3 != null ? fVar3.g(bVar) : null, fVar2, qVar, lVar, false);
            return;
        }
        lVar.invoke(Boolean.FALSE);
        i2.f36769a.getClass();
        i2.a.f(a2.COURSES, "CourseMapFragment", "Failed to add course point: " + geoPointDTO);
        Toast.makeText(getContext(), R.string.txt_error_occurred, 0).show();
    }

    public final f T6() {
        h hVar = this.f148294e;
        if (hVar != null) {
            return hVar.f144584a.getF50269y();
        }
        return null;
    }

    public final void T7(boolean z14) {
        this.H0 = z14;
        a8();
    }

    public final void U6(i iVar) {
        MapView mapView = null;
        if ((iVar != null ? iVar.getF50264r() : null) == i.d.GOOGLE) {
            if (iVar instanceof h) {
                i iVar2 = ((h) iVar).f144584a;
                me2.l lVar = iVar2 instanceof me2.l ? (me2.l) iVar2 : null;
                if (lVar != null) {
                    mapView = lVar.f118186t;
                }
            } else {
                me2.l lVar2 = iVar instanceof me2.l ? (me2.l) iVar : null;
                if (lVar2 != null) {
                    mapView = lVar2.f118186t;
                }
            }
            if (mapView == null) {
                a2 a2Var = a2.COURSES;
                i2.f36769a.getClass();
                i2.a.b(a2Var, "CourseMapFragment", "Can't convert to GoogleMapAdapter, mapView is null.");
                return;
            }
            mapView.setImportantForAccessibility(4);
            mapView.getMapAsync(this);
            View viewFindViewWithTag = mapView.findViewWithTag("GoogleMapMyLocationButton");
            if (viewFindViewWithTag != null) {
                ViewGroup.LayoutParams layoutParams = viewFindViewWithTag.getLayoutParams();
                layoutParams.getClass();
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                layoutParams2.addRule(10, 0);
                layoutParams2.addRule(12, -1);
                int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.spacing_large);
                layoutParams2.setMargins(0, 0, dimensionPixelSize, dimensionPixelSize);
            }
        }
    }

    public final void U7(ArrayList arrayList) {
        i.b bVar;
        f fVar;
        arrayList.getClass();
        i.b bVar2 = this.K0;
        k40.e eVar = this.f97005i;
        eVar.getClass();
        k40.b bVar3 = eVar.f102839a;
        Context contextM0 = bVar3.m0();
        if (contextM0 == null) {
            return;
        }
        int color = a7.b.getColor(contextM0, R.color.gcm_system_static_black);
        List<? extends ie2.o> listK = x.k(new ie2.o.a(8.0f), new ie2.o.b(8.0f));
        ArrayList<List> arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!((List) obj).isEmpty()) {
                arrayList2.add(obj);
            }
        }
        for (List<GeoPointDTO> list : arrayList2) {
            ArrayList arrayList3 = new ArrayList();
            for (GeoPointDTO geoPointDTO : list) {
                Double d14 = geoPointDTO.latitude;
                Double d15 = geoPointDTO.longitude;
                if (d14 == null || d15 == null) {
                    bVar = bVar2;
                    fVar = null;
                } else {
                    bVar = bVar2;
                    fVar = new f(d14.doubleValue(), d15.doubleValue(), bVar2 == null ? com.garmin.android.library.mapsdkadapter.m.d(d14.doubleValue(), d15.doubleValue()) : bVar);
                }
                if (fVar != null) {
                    arrayList3.add(fVar);
                }
                bVar2 = bVar;
            }
            i.b bVar4 = bVar2;
            com.garmin.android.library.mapsdkadapter.q qVar = new com.garmin.android.library.mapsdkadapter.q();
            ie2.p pVar = qVar.f50328a;
            pVar.f93156d = color;
            listK.getClass();
            pVar.getClass();
            pVar.f93157e = listK;
            ie2.d.a aVar = ie2.d.a.f93115a;
            qVar.d(aVar);
            qVar.c(aVar);
            pVar.f93155c = 10.0f;
            pVar.f93158f = 50.0f;
            qVar.a(arrayList3);
            h map = bVar3.getMap();
            if (map != null) {
                map.h(qVar);
            }
            bVar2 = bVar4;
        }
    }

    public final l40.d V6() {
        return (l40.d) Y6().getA().f150540a.getValue();
    }

    @Override // com.garmin.android.library.mapsdkadapter.i.j
    public final void X(f fVar) {
        if (this.f148294e == null) {
            return;
        }
        d7(fVar);
    }

    public final MapOptionsContainer X6() {
        MapOptionsContainer mapOptionsContainer = this.f97016t;
        if (mapOptionsContainer != null) {
            return mapOptionsContainer;
        }
        p005kotlin.jvm.internal.s.m("mapOptionsContainer");
        throw null;
    }

    public final void X7(com.garmin.android.apps.connectmobile.courses.model.g gVar) {
        if (J6(this, gVar)) {
            this.f97011n.a(gVar, this.L0, this.O0, null);
        }
    }

    public final l40.b Y6() {
        l40.b bVar = this.f97014q;
        return bVar == null ? (l40.b) this.f97015r.getValue() : bVar;
    }

    public final void a8() {
        Integer num;
        ArrayList arrayList = this.f97008k0;
        if (arrayList.isEmpty()) {
            return;
        }
        h hVar = this.f148294e;
        float f50270z = hVar != null ? hVar.f144584a.getF50270z() : 0.0f;
        if (f50270z >= 13.0f) {
            num = 1;
        } else if (f50270z >= 12.0f) {
            num = 2;
        } else if (f50270z >= 10.0f) {
            num = 4;
        } else if (f50270z >= 9.0f) {
            num = 8;
        } else {
            num = f50270z >= 8.0f ? 16 : null;
        }
        int i14 = 0;
        for (Object obj : arrayList) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                x.q();
                throw null;
            }
            ie2.j jVar = (ie2.j) obj;
            boolean z14 = num != null && i15 % num.intValue() == 0;
            if (!this.H0) {
                z14 = false;
            }
            jVar.setVisible(z14);
            i14 = i15;
        }
    }

    public final void c7(List list, com.garmin.android.apps.connectmobile.courses.model.g gVar, com.garmin.android.apps.connectmobile.courses.model.g gVar2, int i14, e.a aVar, i.b bVar, com.garmin.android.library.mapsdkadapter.q qVar) {
        f fVarB;
        ie2.p pVar = qVar.f50328a;
        list.getClass();
        gVar.getClass();
        gVar2.getClass();
        bVar.getClass();
        this.f97011n.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            GeoPointDTO geoPointDTO = (GeoPointDTO) it.next();
            Double d14 = geoPointDTO.distance;
            double dDoubleValue = d14 != null ? d14.doubleValue() : 0.0d;
            Double distance = gVar.getDistance();
            if (dDoubleValue >= (distance != null ? distance.doubleValue() : 0.0d)) {
                Double d15 = geoPointDTO.distance;
                double dDoubleValue2 = d15 != null ? d15.doubleValue() : 0.0d;
                Double distance2 = gVar2.getDistance();
                if (dDoubleValue2 <= (distance2 != null ? distance2.doubleValue() : 0.0d) && (fVarB = k40.d.b(geoPointDTO, bVar)) != null) {
                    pVar.f93153a.add(fVarB);
                    aVar.b(fVarB);
                }
            }
        }
        pVar.f93156d = i14;
    }

    public abstract void d7(f fVar);

    public final boolean e7(Bundle bundle) {
        Parcelable parcelable;
        Object next;
        ie2.j jVar;
        List<ie2.j> listQ;
        Object next2;
        qe2.a aVar;
        List<qe2.a> listC;
        Object next3;
        Parcelable parcelable2;
        h map;
        if (bundle != null) {
            int i14 = Build.VERSION.SDK_INT;
            Object obj = null;
            if (i14 >= 33) {
                parcelable = (Parcelable) bundle.getParcelable("extra_marker_tag", com.garmin.android.apps.connectmobile.courses.model.g.class);
            } else {
                Parcelable parcelable3 = bundle.getParcelable("extra_marker_tag");
                if (!(parcelable3 instanceof com.garmin.android.apps.connectmobile.courses.model.g)) {
                    parcelable3 = null;
                }
                parcelable = (com.garmin.android.apps.connectmobile.courses.model.g) parcelable3;
            }
            com.garmin.android.apps.connectmobile.courses.model.g gVar = (com.garmin.android.apps.connectmobile.courses.model.g) parcelable;
            if (gVar != null) {
                g gVar2 = this.f97012o;
                if (gVar2 != null) {
                    gVar2.z4(gVar);
                    return false;
                }
            } else if (bundle.containsKey("extra_poi_cluster_size")) {
                j jVar2 = this.f97007k;
                jVar2.getClass();
                if (bundle.containsKey("extra_poi_cluster_size") && (map = jVar2.f102851a.getMap()) != null) {
                    LatLng latLng = new LatLng(bundle.getDouble("extra_poi_cluster_latitude"), bundle.getDouble("extra_poi_cluster_longitude"));
                    i.a.b(map, new f(latLng, com.garmin.android.library.mapsdkadapter.m.f(latLng) ? i.b.GCJ02 : i.b.WGS84), map.f144584a.getF50270z() + 1.0f, 4);
                    return true;
                }
            } else if (bundle.containsKey("extra_poi_tag")) {
                if (i14 >= 33) {
                    parcelable2 = (Parcelable) bundle.getParcelable("extra_poi_tag", PointOfInterestDTO.class);
                } else {
                    Parcelable parcelable4 = bundle.getParcelable("extra_poi_tag");
                    parcelable2 = (PointOfInterestDTO) (parcelable4 instanceof PointOfInterestDTO ? parcelable4 : null);
                }
                PointOfInterestDTO pointOfInterestDTO = (PointOfInterestDTO) parcelable2;
                if (pointOfInterestDTO != null) {
                    u20.g gVar3 = this.f97020y;
                    if (gVar3 != null) {
                        gVar3.a5(pointOfInterestDTO);
                        return true;
                    }
                    return true;
                }
            } else {
                boolean zContainsKey = bundle.containsKey("extra_climb_on_course_index");
                k40.a aVar2 = this.f97009l;
                if (zContainsKey) {
                    int i15 = bundle.getInt("extra_climb_on_course_index", -1);
                    if (i15 > -1) {
                        List listB1 = h0.b1(aVar2.f102828b);
                        if (((ClimbDTO) h0.e0(i15, listB1)) != null) {
                            int size = listB1.size();
                            u20.g gVar4 = this.f97020y;
                            if (gVar4 != null) {
                                gVar4.c4(i15, size, listB1);
                                return true;
                            }
                            return true;
                        }
                    }
                } else {
                    boolean zContainsKey2 = bundle.containsKey("extra_hazard_geohash");
                    k40.h hVar = this.f97010m;
                    if (zContainsKey2) {
                        String string = bundle.getString("extra_hazard_geohash");
                        if (g22.n.d(string)) {
                            h hVar2 = this.f148294e;
                            if (hVar2 == null || (listC = hVar2.f144584a.C()) == null) {
                                aVar = null;
                            } else {
                                Iterator<T> it = listC.iterator();
                                do {
                                    if (!it.hasNext()) {
                                        next3 = null;
                                        break;
                                    }
                                    next3 = it.next();
                                } while (((qe2.a) next3).getZIndex() != 15.0f);
                                aVar = (qe2.a) next3;
                            }
                            Object tag = aVar != null ? aVar.getTag() : null;
                            Bundle bundle2 = tag instanceof Bundle ? (Bundle) tag : null;
                            if (!p005kotlin.jvm.internal.s.g(string, bundle2 != null ? bundle2.getString("extra_hazard_geohash") : null)) {
                                for (Object obj2 : h0.b1(hVar.f102846c)) {
                                    if (p005kotlin.jvm.internal.s.g(((fn0.a) obj2).getGeohash(), string)) {
                                        obj = obj2;
                                        break;
                                    }
                                }
                                fn0.a aVar3 = (fn0.a) obj;
                                if (aVar3 != null) {
                                    u20.g gVar5 = this.f97020y;
                                    if (gVar5 != null) {
                                        gVar5.l8(aVar3);
                                        return true;
                                    }
                                    return true;
                                }
                            }
                        }
                    } else if (bundle.containsKey("extra_hazard_on_course_index")) {
                        String string2 = bundle.getString("extra_hazard_on_course_index");
                        if (g22.n.d(string2)) {
                            h hVar3 = this.f148294e;
                            if (hVar3 == null || (listQ = hVar3.f144584a.Q()) == null) {
                                jVar = null;
                            } else {
                                Iterator<T> it3 = listQ.iterator();
                                do {
                                    if (!it3.hasNext()) {
                                        next2 = null;
                                        break;
                                    }
                                    next2 = it3.next();
                                } while (((ie2.j) next2).getZIndex() != 15.0f);
                                jVar = (ie2.j) next2;
                            }
                            Object objMo329getTag = jVar != null ? jVar.mo329getTag() : null;
                            Bundle bundle3 = objMo329getTag instanceof Bundle ? (Bundle) objMo329getTag : null;
                            if (!p005kotlin.jvm.internal.s.g(string2, bundle3 != null ? bundle3.getString("extra_hazard_on_course_index") : null)) {
                                for (Object obj3 : h0.b1(hVar.f102846c)) {
                                    if (p005kotlin.jvm.internal.s.g(((fn0.a) obj3).getGeohash(), string2)) {
                                        obj = obj3;
                                        break;
                                    }
                                }
                                fn0.a aVar4 = (fn0.a) obj;
                                if (aVar4 != null) {
                                    u20.g gVar6 = this.f97020y;
                                    if (gVar6 != null) {
                                        gVar6.l8(aVar4);
                                        return true;
                                    }
                                    return true;
                                }
                            }
                        }
                    } else {
                        long[] longArray = bundle.getLongArray("extra_primary_climb_ids");
                        List<Long> listH0 = longArray != null ? u.h0(longArray) : null;
                        if (listH0 == null) {
                            listH0 = j0.f134944a;
                        }
                        if (!listH0.isEmpty()) {
                            List listB2 = h0.b1(aVar2.f102829c);
                            ArrayList arrayList = new ArrayList();
                            Iterator<T> it4 = listH0.iterator();
                            while (it4.hasNext()) {
                                long jLongValue = ((Number) it4.next()).longValue();
                                Iterator it5 = listB2.iterator();
                                while (true) {
                                    if (!it5.hasNext()) {
                                        next = null;
                                        break;
                                    }
                                    next = it5.next();
                                    Long l14 = ((k30.a) next).f102522a;
                                    if (l14 != null && l14.longValue() == jLongValue) {
                                        break;
                                    }
                                }
                                k30.a aVar5 = (k30.a) next;
                                if (aVar5 != null) {
                                    arrayList.add(aVar5);
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                u20.g gVar7 = this.f97020y;
                                if (gVar7 != null) {
                                    gVar7.h2(arrayList, this.X, this.Y);
                                }
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void f7() {
        f12.l lVar = (f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null);
        if (lVar.n4()) {
            v22.e.v(X6().f38741g, false);
            lVar.H2();
        }
    }

    public final void g7(int i14) {
        List<l> listS;
        List<l> listS2;
        Object next;
        List<ie2.j> listQ;
        Object next2;
        Bundle bundle;
        GeoPointDTO geoPointDTO;
        k40.a aVar = this.f97009l;
        k40.b bVar = aVar.f102827a;
        Context contextM0 = bVar.m0();
        if (contextM0 == null) {
            return;
        }
        ClimbDTO climbDTO = (ClimbDTO) h0.e0(i14, aVar.f102828b);
        if (climbDTO != null && (geoPointDTO = (GeoPointDTO) h0.d0(climbDTO.m())) != null) {
            Double d14 = geoPointDTO.latitude;
            double dDoubleValue = d14 != null ? d14.doubleValue() : 0.0d;
            Double d15 = geoPointDTO.longitude;
            double dDoubleValue2 = d15 != null ? d15.doubleValue() : 0.0d;
            Double d16 = geoPointDTO.latitude;
            double dDoubleValue3 = d16 != null ? d16.doubleValue() : 0.0d;
            Double d17 = geoPointDTO.longitude;
            aVar.f102831e.add(new k30.a(climbDTO.getGmapClimbId(), climbDTO.getGmapClimbFileId(), climbDTO.getCategory(), new f(dDoubleValue, dDoubleValue2, com.garmin.android.library.mapsdkadapter.m.d(dDoubleValue3, d17 != null ? d17.doubleValue() : 0.0d))));
        }
        h map = bVar.getMap();
        l lVar = null;
        Object obj = null;
        lVar = null;
        if (map != null && (listQ = map.f144584a.Q()) != null) {
            Iterator<T> it = listQ.iterator();
            do {
                if (!it.hasNext()) {
                    next2 = null;
                    break;
                } else {
                    next2 = it.next();
                    Object objMo329getTag = ((ie2.j) next2).mo329getTag();
                    bundle = objMo329getTag instanceof Bundle ? (Bundle) objMo329getTag : null;
                }
            } while ((bundle != null ? bundle.getInt("extra_climb_on_course_index", -1) : -1) != i14);
            ie2.j jVar = (ie2.j) next2;
            if (jVar != null) {
                Drawable drawableA = j.a.a(contextM0, R.drawable.icon_selected_climb_start);
                jVar.f(drawableA != null ? d7.b.b(drawableA, 0, 0, 7) : null);
            }
        }
        h map2 = bVar.getMap();
        if (map2 != null && (listS2 = map2.f144584a.s()) != null) {
            Iterator<T> it3 = listS2.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    next = null;
                    break;
                }
                next = it3.next();
                l lVar2 = (l) next;
                Object tag = lVar2.getTag();
                String str = tag instanceof String ? (String) tag : null;
                if ((str != null ? Integer.parseInt(str) : -1) == i14 && lVar2.getZIndex() == -210.0f) {
                    break;
                }
            }
            l lVar3 = (l) next;
            if (lVar3 != null) {
                lVar3.a(10.0f);
            }
        }
        h map3 = bVar.getMap();
        if (map3 != null && (listS = map3.f144584a.s()) != null) {
            for (Object obj2 : listS) {
                l lVar4 = (l) obj2;
                Object tag2 = lVar4.getTag();
                String str2 = tag2 instanceof String ? (String) tag2 : null;
                if ((str2 != null ? Integer.parseInt(str2) : -1) == i14 && lVar4.getZIndex() == -200.0f) {
                    obj = obj2;
                    break;
                }
            }
            lVar = (l) obj;
        }
        if (lVar != null) {
            lVar.a(20.0f);
            e.a aVar2 = new e.a();
            aVar2.b((f) h0.b0(lVar.d()));
            aVar2.b((f) h0.m0(lVar.d()));
            bVar.w1(aVar2.a());
            bVar.m2();
        }
        Iterator<T> it4 = aVar.d(true).iterator();
        while (it4.hasNext()) {
            ((l) it4.next()).f(0);
        }
    }

    @Override // qw0.a, com.garmin.android.library.mapsdkadapter.i.l
    public void h1(i iVar) {
        w6();
        boolean z14 = false;
        iVar.getUiSettings().setMapToolbarEnabled(false);
        iVar.B(this);
        iVar.O(this);
        iVar.a0(this);
        iVar.Z(this);
        iVar.i(this);
        iVar.W(this);
        iVar.E(this);
        g gVar = this.f97012o;
        if (gVar != null) {
            gVar.f8(iVar);
        }
        N7(V6().f109893a);
        iVar.getUiSettings().setZoomControlsEnabled(false);
        iVar.getUiSettings().b();
        iVar.y((V6().f109898f && this.D) ? false : true);
        U6(iVar);
        T7(!this.P && V6().f109894b);
        iVar.M(new j40.a(this));
        C7();
        if (iVar.getF50264r() == i.d.MAPBOX) {
            u20.g gVar2 = this.f97020y;
            com.garmin.android.apps.connectmobile.courses.model.i f104023a = gVar2 != null ? gVar2.getF104023a() : null;
            if (f104023a != null) {
                k40.i.f102847a.getClass();
                iVar.p(tn.k.g(k40.i.f102848b, f104023a.f32983e), V6().f109895c && this.B);
                if (f104023a.c()) {
                    iVar.p(k40.i.f102849c, V6().f109896d && this.B);
                    String str = k40.i.f102850d;
                    if (V6().f109897e && this.B) {
                        z14 = true;
                    }
                    iVar.p(str, z14);
                }
            }
        }
    }

    public final void h7(ClimbDTO climbDTO) {
        Long gmapClimbId;
        l lVar;
        l lVar2;
        List<l> listS;
        List<l> listS2;
        List<l> listS3;
        Object next;
        List<l> listS4;
        Object next2;
        k40.a aVar = this.f97009l;
        aVar.getClass();
        k40.b bVar = aVar.f102827a;
        Context contextM0 = bVar.m0();
        if (contextM0 == null || (gmapClimbId = climbDTO.getGmapClimbId()) == null) {
            return;
        }
        long jLongValue = gmapClimbId.longValue();
        float fOrdinal = ((climbDTO.getCategory().ordinal() * 100.0f) - 1000.0f) + 2000.0f;
        h map = bVar.getMap();
        if (map == null || (listS4 = map.f144584a.s()) == null) {
            lVar = null;
        } else {
            Iterator<T> it = listS4.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it.next();
                l lVar3 = (l) next2;
                Object tag = lVar3.getTag();
                Long l14 = tag instanceof Long ? (Long) tag : null;
                if (l14 != null && jLongValue == l14.longValue() && lVar3.getZIndex() == fOrdinal - 10) {
                    break;
                }
            }
            lVar = (l) next2;
        }
        if (lVar != null) {
            lVar.a(lVar.getZIndex() + 2000.0f);
        }
        h map2 = bVar.getMap();
        if (map2 == null || (listS3 = map2.f144584a.s()) == null) {
            lVar2 = null;
        } else {
            Iterator<T> it3 = listS3.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    next = null;
                    break;
                }
                next = it3.next();
                l lVar4 = (l) next;
                Object tag2 = lVar4.getTag();
                Long l15 = tag2 instanceof Long ? (Long) tag2 : null;
                if (l15 != null && jLongValue == l15.longValue() && lVar4.getZIndex() == fOrdinal) {
                    break;
                }
            }
            lVar2 = (l) next;
        }
        if (lVar2 != null) {
            lVar2.a(lVar2.getZIndex() + 2000.0f);
        }
        ArrayList arrayList = aVar.f102831e;
        ArrayList arrayList2 = new ArrayList();
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            Long l16 = ((k30.a) it4.next()).f102522a;
            if (l16 != null) {
                arrayList2.add(l16);
            }
        }
        int color = a7.b.getColor(contextM0, R.color.gcm_system_static_black);
        Iterator it5 = arrayList2.iterator();
        while (it5.hasNext()) {
            long jLongValue2 = ((Number) it5.next()).longValue();
            h map3 = bVar.getMap();
            if (map3 != null && (listS2 = map3.f144584a.s()) != null) {
                for (l lVar5 : listS2) {
                    Object tag3 = lVar5.getTag();
                    Long l17 = tag3 instanceof Long ? (Long) tag3 : null;
                    if (l17 != null && l17.longValue() == jLongValue2 && l17.longValue() != jLongValue && lVar5.getColor() == color) {
                        lVar5.setVisible(false);
                    }
                }
            }
        }
        ArrayList arrayList3 = aVar.f102830d;
        ArrayList arrayList4 = new ArrayList();
        Iterator it6 = arrayList3.iterator();
        while (it6.hasNext()) {
            Long l18 = ((k30.a) it6.next()).f102522a;
            if (l18 != null) {
                arrayList4.add(l18);
            }
        }
        Iterator it7 = arrayList4.iterator();
        while (it7.hasNext()) {
            long jLongValue3 = ((Number) it7.next()).longValue();
            h map4 = bVar.getMap();
            if (map4 != null && (listS = map4.f144584a.s()) != null) {
                for (l lVar6 : listS) {
                    Object tag4 = lVar6.getTag();
                    Long l19 = tag4 instanceof Long ? (Long) tag4 : null;
                    if (l19 != null && l19.longValue() == jLongValue3 && l19.longValue() != jLongValue && lVar6.getColor() == color) {
                        lVar6.setVisible(false);
                    }
                }
            }
        }
    }

    public final void i7(List<ClimbDTO> list) {
        qe2.a aVar;
        ArrayList arrayList;
        int i14;
        List<l> listS;
        List<qe2.a> listC;
        Object next;
        long[] longArray;
        k30.a aVar2;
        k30.a aVar3;
        k40.a aVar4 = this.f97009l;
        aVar4.getClass();
        k40.b bVar = aVar4.f102827a;
        Context contextM0 = bVar.m0();
        if (contextM0 == null || list.isEmpty()) {
            return;
        }
        aVar4.f(list);
        ArrayList arrayList2 = aVar4.f102829c;
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            Long l14 = ((k30.a) it.next()).f102522a;
            if (l14 != null) {
                arrayList3.add(l14);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj : list) {
            ClimbDTO climbDTO = (ClimbDTO) obj;
            if (climbDTO.getGmapClimbId() != null && h0.R(arrayList3, climbDTO.getGmapClimbId())) {
                arrayList4.add(obj);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it3 = arrayList4.iterator();
        while (it3.hasNext()) {
            ClimbDTO climbDTO2 = (ClimbDTO) it3.next();
            GeoPointDTO geoPointDTO = (GeoPointDTO) h0.d0(climbDTO2.m());
            if (geoPointDTO != null) {
                Double d14 = geoPointDTO.latitude;
                double dDoubleValue = d14 != null ? d14.doubleValue() : 0.0d;
                Double d15 = geoPointDTO.longitude;
                double dDoubleValue2 = d15 != null ? d15.doubleValue() : 0.0d;
                Double d16 = geoPointDTO.latitude;
                double dDoubleValue3 = d16 != null ? d16.doubleValue() : 0.0d;
                Double d17 = geoPointDTO.longitude;
                aVar3 = new k30.a(climbDTO2.getGmapClimbId(), climbDTO2.getGmapClimbFileId(), climbDTO2.getCategory(), new f(dDoubleValue, dDoubleValue2, com.garmin.android.library.mapsdkadapter.m.d(dDoubleValue3, d17 != null ? d17.doubleValue() : 0.0d)));
            } else {
                it3 = it3;
                aVar3 = null;
            }
            if (aVar3 != null) {
                arrayList5.add(aVar3);
            }
            it3 = it3;
        }
        ArrayList arrayList6 = new ArrayList();
        Iterator it4 = arrayList5.iterator();
        while (it4.hasNext()) {
            Long l15 = ((k30.a) it4.next()).f102522a;
            if (l15 != null) {
                arrayList6.add(l15);
            }
        }
        ArrayList<ClimbDTO> arrayList7 = new ArrayList();
        for (Object obj2 : list) {
            ClimbDTO climbDTO3 = (ClimbDTO) obj2;
            if (climbDTO3.getGmapClimbId() == null || !h0.R(arrayList3, climbDTO3.getGmapClimbId())) {
                arrayList7.add(obj2);
            }
        }
        ArrayList arrayList8 = aVar4.f102830d;
        ArrayList arrayList9 = new ArrayList();
        Iterator it5 = arrayList7.iterator();
        while (it5.hasNext()) {
            ClimbDTO climbDTO4 = (ClimbDTO) it5.next();
            GeoPointDTO geoPointDTO2 = (GeoPointDTO) h0.d0(climbDTO4.m());
            if (geoPointDTO2 != null) {
                Double d18 = geoPointDTO2.latitude;
                double dDoubleValue4 = d18 != null ? d18.doubleValue() : 0.0d;
                Double d19 = geoPointDTO2.longitude;
                double dDoubleValue5 = d19 != null ? d19.doubleValue() : 0.0d;
                Double d24 = geoPointDTO2.latitude;
                double dDoubleValue6 = d24 != null ? d24.doubleValue() : 0.0d;
                Double d25 = geoPointDTO2.longitude;
                aVar2 = new k30.a(climbDTO4.getGmapClimbId(), climbDTO4.getGmapClimbFileId(), climbDTO4.getCategory(), new f(dDoubleValue4, dDoubleValue5, com.garmin.android.library.mapsdkadapter.m.d(dDoubleValue6, d25 != null ? d25.doubleValue() : 0.0d)));
            } else {
                it5 = it5;
                aVar2 = null;
            }
            if (aVar2 != null) {
                arrayList9.add(aVar2);
            }
            it5 = it5;
        }
        arrayList8.addAll(arrayList9);
        e.a aVar5 = new e.a();
        aVar4.f102831e.addAll(arrayList5);
        h map = bVar.getMap();
        if (map == null || (listC = map.f144584a.C()) == null) {
            aVar = null;
        } else {
            Iterator<T> it6 = listC.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    next = null;
                    break;
                }
                next = it6.next();
                Object tag = ((qe2.a) next).getTag();
                Bundle bundle = tag instanceof Bundle ? (Bundle) tag : null;
                List<Long> listH0 = (bundle == null || (longArray = bundle.getLongArray("extra_primary_climb_ids")) == null) ? null : u.h0(longArray);
                if (listH0 == null) {
                    listH0 = j0.f134944a;
                }
                if (!listH0.isEmpty() && arrayList6.containsAll(listH0)) {
                    break;
                }
            }
            aVar = (qe2.a) next;
        }
        if (aVar != null) {
            Object tag2 = aVar.getTag();
            Bundle bundle2 = tag2 instanceof Bundle ? (Bundle) tag2 : null;
            int i15 = bundle2 != null ? bundle2.getInt("extra_count_of_climbs_at_start", -1) : -1;
            if (i15 > 0) {
                aVar.f(d7.b.b(new v30.a(contextM0, i15, true), 0, 0, 7));
                aVar.a(40.0f);
                h map2 = bVar.getMap();
                if (map2 != null) {
                    map2.Y(new k(w.c(aVar), 0, 1));
                }
                h map3 = bVar.getMap();
                if (map3 != null) {
                    map3.x(aVar.getF118168a());
                }
            }
        }
        Iterator it7 = arrayList6.iterator();
        while (it7.hasNext()) {
            long jLongValue = ((Number) it7.next()).longValue();
            h map4 = bVar.getMap();
            if (map4 != null && (listS = map4.f144584a.s()) != null) {
                for (l lVar : listS) {
                    Object tag3 = lVar.getTag();
                    Long l16 = tag3 instanceof Long ? (Long) tag3 : null;
                    if (l16 != null && l16.longValue() == jLongValue) {
                        lVar.a(lVar.getZIndex() + 2000.0f);
                        aVar5.b((f) h0.b0(lVar.d()));
                        aVar5.b((f) h0.m0(lVar.d()));
                    }
                }
            }
        }
        int color = a7.b.getColor(contextM0, R.color.gcm_system_static_black);
        w13.c cVar = com.garmin.android.apps.connectmobile.courses.model.b.f32827m;
        int i16 = 10;
        ArrayList arrayList10 = new ArrayList(y.r(cVar, 10));
        Iterator<T> it8 = cVar.iterator();
        while (it8.hasNext()) {
            q6.f.t(contextM0, ((com.garmin.android.apps.connectmobile.courses.model.b) it8.next()).f32829b, arrayList10);
        }
        for (ClimbDTO climbDTO5 : arrayList7) {
            List<GeoPointDTO> listM = climbDTO5.m();
            ArrayList arrayList11 = new ArrayList();
            for (Object obj3 : listM) {
                if (((GeoPointDTO) obj3).b()) {
                    arrayList11.add(obj3);
                }
            }
            if (arrayList11.isEmpty()) {
                arrayList = arrayList10;
                i14 = i16;
            } else {
                Long gmapClimbId = climbDTO5.getGmapClimbId();
                ArrayList arrayList12 = new ArrayList(y.r(arrayList11, i16));
                for (Iterator it9 = arrayList11.iterator(); it9.hasNext(); it9 = it9) {
                    GeoPointDTO geoPointDTO3 = (GeoPointDTO) it9.next();
                    Double d26 = geoPointDTO3.latitude;
                    double dDoubleValue7 = d26 != null ? d26.doubleValue() : 0.0d;
                    Double d27 = geoPointDTO3.longitude;
                    double dDoubleValue8 = d27 != null ? d27.doubleValue() : 0.0d;
                    Double d28 = geoPointDTO3.latitude;
                    double dDoubleValue9 = d28 != null ? d28.doubleValue() : 0.0d;
                    Double d29 = geoPointDTO3.longitude;
                    arrayList12.add(new f(dDoubleValue7, dDoubleValue8, com.garmin.android.library.mapsdkadapter.m.d(dDoubleValue9, d29 != null ? d29.doubleValue() : 0.0d)));
                    arrayList10 = arrayList10;
                }
                ArrayList arrayList13 = arrayList10;
                int iOrdinal = climbDTO5.getCategory().ordinal();
                float f14 = ((iOrdinal * 100.0f) - 1000.0f) + 2000.0f;
                com.garmin.android.library.mapsdkadapter.q qVar = new com.garmin.android.library.mapsdkadapter.q();
                ie2.p pVar = qVar.f50328a;
                pVar.f93164l = gmapClimbId;
                pVar.f93156d = color;
                pVar.f93155c = 15.0f;
                i14 = 10;
                pVar.f93158f = f14 - 10;
                qVar.a(arrayList12);
                h map5 = bVar.getMap();
                if (map5 != null) {
                    map5.h(qVar);
                }
                com.garmin.android.library.mapsdkadapter.q qVar2 = new com.garmin.android.library.mapsdkadapter.q();
                ie2.p pVar2 = qVar2.f50328a;
                pVar2.f93164l = gmapClimbId;
                arrayList = arrayList13;
                pVar2.f93156d = ((Number) arrayList.get(iOrdinal)).intValue();
                pVar2.f93155c = 10.0f;
                pVar2.f93158f = f14;
                qVar2.a(arrayList12);
                h map6 = bVar.getMap();
                if (map6 != null) {
                    map6.h(qVar2);
                }
            }
            arrayList10 = arrayList;
            i16 = i14;
        }
        bVar.w1(aVar5.a());
        bVar.m2();
        Iterator<T> it10 = aVar4.d(true).iterator();
        while (it10.hasNext()) {
            ((l) it10.next()).f(0);
        }
    }

    public final void j7(com.garmin.android.apps.connectmobile.courses.model.g gVar, float f14) {
        Object next;
        com.garmin.android.apps.connectmobile.courses.model.g gVar2;
        k40.d dVar = this.f97011n;
        k40.b bVar = dVar.f102835a;
        Context contextM0 = bVar.m0();
        if (contextM0 == null) {
            return;
        }
        Iterator it = dVar.f102836b.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                gVar2 = (com.garmin.android.apps.connectmobile.courses.model.g) ((ie2.j) next).getTag();
            }
        } while (!(gVar2 != null ? gVar2.h(gVar) : false));
        ie2.j jVar = (ie2.j) next;
        h map = bVar.getMap();
        if (jVar == null || map == null) {
            return;
        }
        com.garmin.android.apps.connectmobile.courses.model.f.a aVar = com.garmin.android.apps.connectmobile.courses.model.f.f32898h;
        String coursePointType = gVar.getCoursePointType();
        aVar.getClass();
        com.garmin.android.apps.connectmobile.courses.model.f fVarA = com.garmin.android.apps.connectmobile.courses.model.f.a.a(coursePointType);
        String str = gVar.name;
        if (str == null) {
            str = "";
        }
        jVar.f(d7.b.b(new u40.d(contextM0, fVarA, true, str, f14), 0, 0, 7));
        jVar.l(false);
    }

    @Override // k40.b
    public final void m2() {
        X6().setRecenterMapButtonEnabled(true);
    }

    public final void n7(fn0.a aVar) {
        List<qe2.a> listC;
        k40.h hVar = this.f97010m;
        hVar.getClass();
        k40.b bVar = hVar.f102844a;
        Context contextM0 = bVar.m0();
        if (contextM0 == null) {
            return;
        }
        h map = bVar.getMap();
        qe2.a aVar2 = null;
        Object obj = null;
        aVar2 = null;
        if (map != null && (listC = map.f144584a.C()) != null) {
            for (Object obj2 : listC) {
                Object tag = ((qe2.a) obj2).getTag();
                Bundle bundle = tag instanceof Bundle ? (Bundle) tag : null;
                if (p005kotlin.jvm.internal.s.g(bundle != null ? bundle.getString("extra_hazard_geohash") : null, aVar.getGeohash())) {
                    obj = obj2;
                    break;
                }
            }
            aVar2 = (qe2.a) obj;
        }
        if (aVar2 != null) {
            aVar2.f(hVar.a(aVar.h().f72176d, contextM0));
            aVar2.a(15.0f);
            h map2 = bVar.getMap();
            if (map2 != null) {
                map2.S();
            }
            e.a aVar3 = new e.a();
            aVar3.b(aVar2.getPosition());
            bVar.w1(aVar3.a());
            bVar.m2();
        }
    }

    public final void o7(PointOfInterestDTO pointOfInterestDTO) {
        Object next;
        j jVar = this.f97007k;
        k40.b bVar = jVar.f102851a;
        if (pointOfInterestDTO.getCom.garmin.android.gncs.NotificationConstants.KEY_DATA_MIME_TYPE java.lang.String() == null) {
            return;
        }
        jVar.f102855e = pointOfInterestDTO;
        jVar.b();
        Iterator<T> it = jVar.a().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!p005kotlin.jvm.internal.s.g(((ie2.j) next).getPosition().f50283a, k40.k.a(pointOfInterestDTO)));
        ie2.j jVar2 = (ie2.j) next;
        if (jVar2 != null) {
            e.a aVar = new e.a();
            aVar.b(jVar2.getPosition());
            bVar.w1(aVar.a());
            bVar.m2();
        }
    }

    @Override // androidx.fragment.app.Fragment
    @o13.e
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a7.e activity = getActivity();
        u20.g gVar = activity instanceof u20.g ? (u20.g) activity : null;
        if (gVar != null) {
            this.f97020y = gVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qw0.a, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        this.f97014q = context instanceof l40.b ? (l40.b) context : null;
        try {
            this.f97012o = (g) context;
        } catch (ClassCastException unused) {
            a2 a2Var = a2.COURSES;
            i2.f36769a.getClass();
            i2.a.b(a2Var, "CourseMapFragment", "In order to use Add course point functionality Activity must implement CoursePointListener");
        }
        try {
            this.f97013p = (d) context;
        } catch (ClassCastException unused2) {
            a2 a2Var2 = a2.COURSES;
            i2.f36769a.getClass();
            i2.a.b(a2Var2, "CourseMapFragment", "In order to use Edit Course Route functionality Activity must implement RoutePointListener");
        }
    }

    @Override // qw0.a, com.garmin.android.library.mapsdkadapter.i.g
    public void onCameraIdle() {
        a8();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.C = bundle.getBoolean("state_should_show_map_options", this.C);
            this.B = bundle.getBoolean("state_should_show_extra_map_options", this.B);
        }
        w13.c cVar = com.garmin.android.apps.connectmobile.courses.model.b.f32827m;
        this.X = (com.garmin.android.apps.connectmobile.courses.model.b) cVar.get(V6().f109904l);
        this.Y = (com.garmin.android.apps.connectmobile.courses.model.b) cVar.get(V6().f109905m);
    }

    @Override // qw0.a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(this.f97017v, viewGroup, false);
        this.f148295f = 2;
        i.d dVarV = this.f97021z.v();
        View viewInflate2 = layoutInflater.inflate((XmlPullParser) getResources().getLayout(R.layout.gcm_map_fragment), viewGroup, false);
        viewInflate2.getClass();
        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate2;
        this.f148292c = (FrameLayout) constraintLayout.findViewById(R.id.map_legend_container);
        this.f148293d = (FrameLayout) constraintLayout.findViewById(R.id.polyline_legend_container);
        GCMMapView gCMMapView = (GCMMapView) constraintLayout.findViewById(R.id.mapView);
        ie2.l lVar = new ie2.l(0, false, null, 0.0f, null, null, null, null, null, null, null, null, 4095, null);
        lVar.f93147l = Integer.valueOf(this.f148295f);
        gCMMapView.f(null, dVarV, lVar, this);
        gCMMapView.onCreate(bundle);
        this.f148294e = gCMMapView.getMapProxy();
        this.f148291b = gCMMapView;
        ((ViewGroup) viewInflate.findViewById(this.f97018w)).addView(constraintLayout);
        return viewInflate;
    }

    @Override // qw0.a, androidx.fragment.app.Fragment
    public final void onDestroy() {
        s30.c cVar = this.R0;
        if (cVar != null) {
            cVar.b();
            cVar.f156415d.clear();
            cVar.f156416e.clear();
            j0 j0Var = j0.f134944a;
            cVar.f156417f = j0Var;
            cVar.f156418g = null;
            cVar.f156420i = j0Var;
            cVar.f156421j = Integer.MIN_VALUE;
            cVar.f156419h.clear();
        }
        this.R0 = null;
        this.S0 = null;
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        this.f97014q = null;
    }

    @Override // com.google.android.gms.maps.OnMapReadyCallback
    public final void onMapReady(GoogleMap googleMap) {
        googleMap.getClass();
        u20.g gVar = this.f97020y;
        com.garmin.android.apps.connectmobile.courses.model.c cVar = null;
        com.garmin.android.apps.connectmobile.courses.model.i f104023a = gVar != null ? gVar.getF104023a() : null;
        if (f104023a != null) {
            if (this.T == null) {
                int i14 = b.f97022a[f104023a.ordinal()];
                if (i14 == 1) {
                    cVar = com.garmin.android.apps.connectmobile.courses.model.c.PAVED;
                } else if (i14 == 2) {
                    cVar = com.garmin.android.apps.connectmobile.courses.model.c.UNPAVED;
                } else if (i14 == 3) {
                    cVar = com.garmin.android.apps.connectmobile.courses.model.c.MIXED;
                }
                this.T = cVar;
            }
            String str = f104023a.f32983e;
            k40.f fVar = this.f97004h;
            fVar.getClass();
            str.getClass();
            TileOverlay tileOverlay = fVar.f102840a;
            if (tileOverlay != null) {
                tileOverlay.remove();
            }
            k40.i.f102847a.getClass();
            TileOverlay tileOverlayAddTileOverlay = googleMap.addTileOverlay(new TileOverlayOptions().tileProvider(new k40.g(tn.k.g(k40.i.f102848b, str))).zIndex(-2000.0f));
            fVar.f102840a = tileOverlayAddTileOverlay;
            if (tileOverlayAddTileOverlay != null) {
                tileOverlayAddTileOverlay.setTransparency(0.25f);
            }
            boolean z14 = V6().f109895c && this.B;
            TileOverlay tileOverlay2 = fVar.f102840a;
            if (tileOverlay2 != null) {
                tileOverlay2.setVisible(z14);
            }
            if (f104023a.c()) {
                TileOverlay tileOverlay3 = fVar.f102841b;
                if (tileOverlay3 != null) {
                    tileOverlay3.remove();
                }
                fVar.f102841b = googleMap.addTileOverlay(new TileOverlayOptions().tileProvider(new k40.g(k40.i.f102849c)).zIndex(-1990.0f));
                boolean z15 = V6().f109896d && this.B;
                TileOverlay tileOverlay4 = fVar.f102841b;
                if (tileOverlay4 != null) {
                    tileOverlay4.setVisible(z15);
                }
                TileOverlay tileOverlay5 = fVar.f102842c;
                if (tileOverlay5 != null) {
                    tileOverlay5.remove();
                }
                fVar.f102842c = googleMap.addTileOverlay(new TileOverlayOptions().tileProvider(new k40.g(k40.i.f102850d)).zIndex(-1980.0f));
                boolean z16 = V6().f109897e && this.B;
                TileOverlay tileOverlay6 = fVar.f102842c;
                if (tileOverlay6 != null) {
                    tileOverlay6.setVisible(z16);
                }
            }
        }
    }

    @Override // qw0.a, androidx.fragment.app.Fragment
    public void onResume() {
        ie2.k uiSettings;
        ie2.k uiSettings2;
        super.onResume();
        h hVar = this.f148294e;
        if (hVar != null && (uiSettings2 = hVar.f144584a.getUiSettings()) != null) {
            uiSettings2.setZoomControlsEnabled(false);
        }
        h hVar2 = this.f148294e;
        if (hVar2 == null || (uiSettings = hVar2.f144584a.getUiSettings()) == null) {
            return;
        }
        uiSettings.b();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("state_should_show_map_options", this.C);
        bundle.putBoolean("state_should_show_extra_map_options", this.B);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        k40.f fVar = this.f97004h;
        TileOverlay tileOverlay = fVar.f102840a;
        if (tileOverlay != null) {
            tileOverlay.clearTileCache();
        }
        TileOverlay tileOverlay2 = fVar.f102841b;
        if (tileOverlay2 != null) {
            tileOverlay2.clearTileCache();
        }
        TileOverlay tileOverlay3 = fVar.f102842c;
        if (tileOverlay3 != null) {
            tileOverlay3.clearTileCache();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        h mapProxy;
        view2.getClass();
        super.onViewCreated(view2, bundle);
        View viewFindViewById = view2.findViewById(R.id.map_options_container);
        viewFindViewById.getClass();
        this.f97016t = (MapOptionsContainer) viewFindViewById;
        X6().setShowMapOptions(this.C);
        X6().setShowNewMapButtons(this.B);
        X6().set3dEnabled(false);
        GCMMapView gCMMapView = this.f148291b;
        if (gCMMapView != null && (mapProxy = gCMMapView.getMapProxy()) != null) {
            mapProxy.b(false, Boolean.FALSE);
        }
        X6().setMapSettingsClickListener(new r2(0, new j40.b(this, 0), 1, null));
        X6().setMapLegendClickListener(new r2(0, new j40.b(this, 1), 1, null));
        X6().setToggle3DClickListener(new r2(0, new j40.b(this, 2), 1, null));
        X6().setCompassClickListener(new r2(0, new j40.b(this, 3), 1, null));
        h hVar = this.f148294e;
        if (hVar != null) {
            hVar.R(new hc0.c(10, hVar, this));
        }
        this.A = this.f97021z.c();
        X6().setHasGCMaps3DSubscription(this.A);
    }

    public final void p7(ClimbDTO climbDTO) {
        Long gmapClimbId;
        Object next;
        qe2.a aVar;
        l lVar;
        List<l> listS;
        Object next2;
        List<l> listS2;
        Object next3;
        List<qe2.a> listC;
        Object next4;
        long[] longArray;
        k40.a aVar2 = this.f97009l;
        ArrayList arrayList = aVar2.f102831e;
        k40.b bVar = aVar2.f102827a;
        Context contextM0 = bVar.m0();
        if (contextM0 == null || (gmapClimbId = climbDTO.getGmapClimbId()) == null) {
            return;
        }
        long jLongValue = gmapClimbId.longValue();
        aVar2.f(w.c(climbDTO));
        Iterator it = aVar2.f102829c.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Long l14 = ((k30.a) next).f102522a;
            if (l14 != null && l14.longValue() == jLongValue) {
                break;
            }
        }
        k30.a aVar3 = (k30.a) next;
        if (aVar3 != null) {
            arrayList.add(aVar3);
        }
        if (arrayList.isEmpty()) {
            return;
        }
        h map = bVar.getMap();
        if (map == null || (listC = map.f144584a.C()) == null) {
            aVar = null;
        } else {
            Iterator<T> it3 = listC.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    next4 = null;
                    break;
                }
                next4 = it3.next();
                Object tag = ((qe2.a) next4).getTag();
                Bundle bundle = tag instanceof Bundle ? (Bundle) tag : null;
                if (bundle != null && (longArray = bundle.getLongArray("extra_primary_climb_ids")) != null && u.y(longArray, jLongValue)) {
                    break;
                }
            }
            aVar = (qe2.a) next4;
        }
        if (aVar != null) {
            Object tag2 = aVar.getTag();
            Bundle bundle2 = tag2 instanceof Bundle ? (Bundle) tag2 : null;
            int i14 = bundle2 != null ? bundle2.getInt("extra_count_of_climbs_at_start", -1) : -1;
            if (i14 > 0) {
                aVar.f(d7.b.b(new v30.a(contextM0, i14, true), 0, 0, 7));
                aVar.a(40.0f);
                h map2 = bVar.getMap();
                if (map2 != null) {
                    map2.Y(new k(w.c(aVar), 0, 1));
                }
                h map3 = bVar.getMap();
                if (map3 != null) {
                    map3.x(aVar.getF118168a());
                }
            }
        }
        k30.a aVar4 = (k30.a) h0.b0(arrayList);
        h map4 = bVar.getMap();
        if (map4 != null && (listS2 = map4.f144584a.s()) != null) {
            Iterator<T> it4 = listS2.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    next3 = null;
                    break;
                }
                next3 = it4.next();
                l lVar2 = (l) next3;
                Object tag3 = lVar2.getTag();
                Long l15 = tag3 instanceof Long ? (Long) tag3 : null;
                float fOrdinal = (aVar4.f102524c.ordinal() * 100.0f) - 1000.0f;
                if (l15 != null && l15.longValue() == jLongValue && lVar2.getZIndex() == fOrdinal - 10) {
                    break;
                }
            }
            l lVar3 = (l) next3;
            if (lVar3 != null) {
                lVar3.a(30.0f);
            }
        }
        h map5 = bVar.getMap();
        if (map5 == null || (listS = map5.f144584a.s()) == null) {
            lVar = null;
        } else {
            Iterator<T> it5 = listS.iterator();
            while (true) {
                if (!it5.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it5.next();
                l lVar4 = (l) next2;
                Object tag4 = lVar4.getTag();
                Long l16 = tag4 instanceof Long ? (Long) tag4 : null;
                float fOrdinal2 = (aVar4.f102524c.ordinal() * 100.0f) - 1000.0f;
                if (l16 != null && l16.longValue() == jLongValue && lVar4.getZIndex() == fOrdinal2) {
                    break;
                }
            }
            lVar = (l) next2;
        }
        if (lVar != null) {
            lVar.a(40.0f);
            e.a aVar5 = new e.a();
            aVar5.b((f) h0.b0(lVar.d()));
            aVar5.b((f) h0.m0(lVar.d()));
            bVar.w1(aVar5.a());
            bVar.m2();
        }
        Iterator<T> it6 = aVar2.d(true).iterator();
        while (it6.hasNext()) {
            ((l) it6.next()).f(0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v2 */
    public final void q7(ie2.j jVar) {
        ?? arrayList;
        f fVar;
        f fVar2;
        f fVar3;
        f fVar4;
        Parcelable parcelable;
        Parcelable parcelable2;
        Parcelable parcelable3;
        Parcelable parcelable4;
        List<l> listS;
        k40.e eVar = this.f97005i;
        h map = eVar.f102839a.getMap();
        if (map == null || (listS = map.f144584a.s()) == null) {
            arrayList = 0;
        } else {
            arrayList = new ArrayList();
            for (Object obj : listS) {
                Object tag = ((l) obj).getTag();
                if (p005kotlin.jvm.internal.s.g(tag instanceof String ? (String) tag : null, "MarkerDragGuideline")) {
                    arrayList.add(obj);
                }
            }
        }
        if (arrayList == 0) {
            arrayList = j0.f134944a;
        }
        for (l lVar : (Iterable) arrayList) {
            h hVar = this.f148294e;
            if (hVar != null) {
                hVar.m(lVar);
            }
        }
        h hVar2 = this.f148294e;
        if (hVar2 != null) {
            i.a.b(hVar2, jVar.getPosition(), 0.0f, 6);
        }
        Bundle bundle = (Bundle) jVar.mo329getTag();
        if (bundle != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable4 = (Parcelable) bundle.getParcelable("extra_route_point_marker_tag", f.class);
            } else {
                Parcelable parcelable5 = bundle.getParcelable("extra_route_point_marker_tag");
                if (!(parcelable5 instanceof f)) {
                    parcelable5 = null;
                }
                parcelable4 = (f) parcelable5;
            }
            fVar = (f) parcelable4;
        } else {
            fVar = null;
        }
        if (fVar != null) {
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = this.I0;
            ie2.j jVar2 = (ie2.j) h0.e0(0, arrayList3);
            Bundle bundle2 = (Bundle) (jVar2 != null ? jVar2.mo329getTag() : null);
            if (bundle2 != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable3 = (Parcelable) bundle2.getParcelable("extra_route_point_marker_tag", f.class);
                } else {
                    Parcelable parcelable6 = bundle2.getParcelable("extra_route_point_marker_tag");
                    if (!(parcelable6 instanceof f)) {
                        parcelable6 = null;
                    }
                    parcelable3 = (f) parcelable6;
                }
                fVar2 = (f) parcelable3;
            } else {
                fVar2 = null;
            }
            if (fVar2 == fVar) {
                ie2.j jVar3 = (ie2.j) h0.e0(1, arrayList3);
                if (jVar3 != null) {
                    arrayList2.add(jVar3);
                }
            } else {
                ie2.j jVar4 = (ie2.j) h0.e0(arrayList3.size() - 1, arrayList3);
                Bundle bundle3 = (Bundle) (jVar4 != null ? jVar4.mo329getTag() : null);
                if (bundle3 != null) {
                    if (Build.VERSION.SDK_INT >= 33) {
                        parcelable2 = (Parcelable) bundle3.getParcelable("extra_route_point_marker_tag", f.class);
                    } else {
                        Parcelable parcelable7 = bundle3.getParcelable("extra_route_point_marker_tag");
                        if (!(parcelable7 instanceof f)) {
                            parcelable7 = null;
                        }
                        parcelable2 = (f) parcelable7;
                    }
                    fVar3 = (f) parcelable2;
                } else {
                    fVar3 = null;
                }
                if (fVar3 == fVar) {
                    ie2.j jVar5 = (ie2.j) h0.e0(arrayList3.size() - 2, arrayList3);
                    if (jVar5 != null) {
                        arrayList2.add(jVar5);
                    }
                } else if (!arrayList3.isEmpty()) {
                    int size = arrayList3.size() - 1;
                    for (int i14 = 1; i14 < size; i14++) {
                        Bundle bundle4 = (Bundle) ((ie2.j) arrayList3.get(i14)).mo329getTag();
                        if (bundle4 != null) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                parcelable = (Parcelable) bundle4.getParcelable("extra_route_point_marker_tag", f.class);
                            } else {
                                Parcelable parcelable8 = bundle4.getParcelable("extra_route_point_marker_tag");
                                if (!(parcelable8 instanceof f)) {
                                    parcelable8 = null;
                                }
                                parcelable = (f) parcelable8;
                            }
                            fVar4 = (f) parcelable;
                        } else {
                            fVar4 = null;
                        }
                        if (fVar == fVar4) {
                            ie2.j jVar6 = (ie2.j) h0.e0(i14 + 1, arrayList3);
                            if (jVar6 != null) {
                                arrayList2.add(jVar6);
                            }
                            ie2.j jVar7 = (ie2.j) h0.e0(i14 - 1, arrayList3);
                            if (jVar7 != null) {
                                arrayList2.add(jVar7);
                            }
                        }
                    }
                }
            }
            if (arrayList2.isEmpty()) {
                return;
            }
            Iterator it = arrayList2.iterator();
            it.getClass();
            while (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                f position = ((ie2.j) next).getPosition();
                f position2 = jVar.getPosition();
                position.getClass();
                position2.getClass();
                k40.b bVar = eVar.f102839a;
                Context contextM0 = bVar.m0();
                if (contextM0 != null) {
                    com.garmin.android.library.mapsdkadapter.q qVar = new com.garmin.android.library.mapsdkadapter.q();
                    ie2.p pVar = qVar.f50328a;
                    pVar.f93155c = 15.0f;
                    pVar.f93156d = c7.d.e(a7.b.getColor(contextM0, k40.e.f102838b), 50);
                    pVar.f93153a.add(position);
                    pVar.f93153a.add(position2);
                    pVar.f93164l = "MarkerDragGuideline";
                    h map2 = bVar.getMap();
                    if (map2 != null) {
                        map2.h(qVar);
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void r7(ie2.j jVar) {
        int i14 = 0;
        while (true) {
            ArrayList arrayList = this.I0;
            if (i14 > arrayList.size() - 1) {
                s20.e eVar = s20.e.f156007a;
                f position = jVar.getPosition();
                eVar.getClass();
                f fVar = (f) s20.e.a(this.J0, position).f128605a;
                if (fVar != null) {
                    jVar.g(fVar);
                    f fVar2 = this.N0;
                    if (fVar2 != null) {
                        k40.d dVar = this.f97011n;
                        int size = h0.b1(dVar.f102836b).size();
                        for (int i15 = 0; i15 < size; i15++) {
                            com.garmin.android.apps.connectmobile.courses.model.g gVar = (com.garmin.android.apps.connectmobile.courses.model.g) ((ie2.j) h0.b1(dVar.f102836b).get(i15)).getTag();
                            if (gVar != null && gVar.i(fVar2.f50283a)) {
                                g gVar2 = this.f97012o;
                                if (gVar2 == null) {
                                    break;
                                }
                                LatLng latLng = fVar.f50283a;
                                gVar2.J4(gVar, new GeoPointDTO(latLng.latitude, latLng.longitude));
                                break;
                            }
                        }
                    }
                    this.N0 = null;
                    return;
                }
                return;
            }
            if (((ie2.j) arrayList.get(i14)).getPosition() == this.N0) {
                d dVar2 = this.f97013p;
                if (dVar2 != null) {
                    dVar2.A5(jVar.getPosition(), i14);
                }
                this.N0 = null;
                return;
            }
            i14++;
        }
    }

    public final void u7(ie2.j jVar) {
        com.garmin.android.apps.connectmobile.courses.model.g gVar;
        Parcelable parcelable;
        Parcelable parcelable2;
        Bundle bundle = (Bundle) jVar.mo329getTag();
        f fVar = null;
        if (bundle != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable2 = (Parcelable) bundle.getParcelable("extra_marker_tag", com.garmin.android.apps.connectmobile.courses.model.g.class);
            } else {
                Parcelable parcelable3 = bundle.getParcelable("extra_marker_tag");
                if (!(parcelable3 instanceof com.garmin.android.apps.connectmobile.courses.model.g)) {
                    parcelable3 = null;
                }
                parcelable2 = (com.garmin.android.apps.connectmobile.courses.model.g) parcelable3;
            }
            gVar = (com.garmin.android.apps.connectmobile.courses.model.g) parcelable2;
        } else {
            gVar = null;
        }
        if (bundle != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) bundle.getParcelable("extra_route_point_marker_tag", f.class);
            } else {
                Parcelable parcelable4 = bundle.getParcelable("extra_route_point_marker_tag");
                parcelable = (f) (parcelable4 instanceof f ? parcelable4 : null);
            }
            fVar = (f) parcelable;
        }
        if (fVar != null) {
            this.N0 = fVar;
            return;
        }
        if (gVar != null) {
            Double d14 = gVar.lat;
            double dDoubleValue = d14 != null ? d14.doubleValue() : 0.0d;
            Double d15 = gVar.lon;
            double dDoubleValue2 = d15 != null ? d15.doubleValue() : 0.0d;
            Double d16 = gVar.lat;
            double dDoubleValue3 = d16 != null ? d16.doubleValue() : 0.0d;
            Double d17 = gVar.lon;
            double dDoubleValue4 = d17 != null ? d17.doubleValue() : 0.0d;
            s20.b bVar = s20.b.f156004a;
            this.N0 = new f(dDoubleValue, dDoubleValue2, com.garmin.android.library.mapsdkadapter.m.d(dDoubleValue3, dDoubleValue4));
        }
    }

    @Override // com.garmin.android.library.mapsdkadapter.i.InterfaceC1001i
    public final boolean v2(me2.f fVar) {
        fVar.getClass();
        if (this.M0 || fVar.getTag() == null) {
            return false;
        }
        Object tag = fVar.getTag();
        return e7(tag instanceof Bundle ? (Bundle) tag : null);
    }

    public final void v7(List<? extends l> list, List<? extends l> list2, List<? extends qe2.a> list3, List<? extends l> list4, List<? extends ie2.j> list5) {
        com.garmin.android.apps.connectmobile.courses.model.i f104023a;
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        list5.getClass();
        u20.g gVar = this.f97020y;
        if (gVar == null || (f104023a = gVar.getF104023a()) == null || !f104023a.c()) {
            return;
        }
        com.garmin.android.apps.connectmobile.courses.model.c cVar = this.T;
        if (V6().f109903k && cVar != null) {
            ArrayList<com.garmin.android.library.mapsdkadapter.q> arrayList = new ArrayList(y.r(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new com.garmin.android.library.mapsdkadapter.q(((l) it.next()).getF118133a()));
            }
            for (com.garmin.android.library.mapsdkadapter.q qVar : arrayList) {
                h hVar = this.f148294e;
                if (hVar != null) {
                    i.a.a(hVar, qVar);
                }
            }
            ArrayList<com.garmin.android.library.mapsdkadapter.q> arrayList2 = new ArrayList(y.r(list2, 10));
            Iterator<T> it3 = list2.iterator();
            while (it3.hasNext()) {
                arrayList2.add(new com.garmin.android.library.mapsdkadapter.q(((l) it3.next()).getF118133a()));
            }
            for (com.garmin.android.library.mapsdkadapter.q qVar2 : arrayList2) {
                h hVar2 = this.f148294e;
                if (hVar2 != null) {
                    i.a.a(hVar2, qVar2);
                }
            }
            h hVar3 = this.f148294e;
            if (hVar3 != null) {
                ArrayList arrayList3 = new ArrayList(y.r(list3, 10));
                Iterator<T> it4 = list3.iterator();
                while (it4.hasNext()) {
                    arrayList3.add(new p(((qe2.a) it4.next()).getF118168a()));
                }
                hVar3.f(0, arrayList3);
            }
        }
        ArrayList<com.garmin.android.library.mapsdkadapter.q> arrayList4 = new ArrayList(y.r(list4, 10));
        Iterator<T> it5 = list4.iterator();
        while (it5.hasNext()) {
            arrayList4.add(new com.garmin.android.library.mapsdkadapter.q(((l) it5.next()).getF118133a()));
        }
        for (com.garmin.android.library.mapsdkadapter.q qVar3 : arrayList4) {
            h hVar4 = this.f148294e;
            if (hVar4 != null) {
                i.a.a(hVar4, qVar3);
            }
        }
        ArrayList<p> arrayList5 = new ArrayList(y.r(list5, 10));
        Iterator<T> it6 = list5.iterator();
        while (it6.hasNext()) {
            arrayList5.add(new p(((ie2.j) it6.next()).getF118120a()));
        }
        for (p pVar : arrayList5) {
            h hVar5 = this.f148294e;
            if (hVar5 != null) {
                hVar5.x(pVar);
            }
        }
    }

    @Override // k40.b
    public final void w1(e eVar) {
        u6(eVar, this.f148290a);
    }

    public final void w7(List<? extends qe2.a> list) {
        com.garmin.android.apps.connectmobile.courses.model.i f104023a;
        u20.g gVar = this.f97020y;
        if (gVar == null || (f104023a = gVar.getF104023a()) == null || !f104023a.c() || !V6().f109900h) {
            return;
        }
        if (list == null) {
            list = j0.f134944a;
        }
        h hVar = this.f148294e;
        if (hVar != null) {
            ArrayList arrayList = new ArrayList(y.r(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new p(((qe2.a) it.next()).getF118168a()));
            }
            hVar.f(1, arrayList);
        }
    }

    public final void x7(List<? extends ie2.j> list) {
        h map;
        if (!V6().f109898f || (map = this.f97007k.f102851a.getMap()) == null) {
            return;
        }
        if (list == null) {
            list = j0.f134944a;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            map.x(new p(((ie2.j) it.next()).getF118120a()));
        }
    }

    public final void z6(List<k30.g> list) {
        k40.b bVar;
        float f14;
        f fVar;
        char c14;
        ArrayList arrayList;
        char c15;
        int iIntValue;
        k40.b bVar2;
        ArrayList arrayList2;
        k30.g gVar;
        boolean z14;
        char c16;
        Context context;
        Object next;
        k40.a aVar = this.f97009l;
        aVar.getClass();
        k40.b bVar3 = aVar.f102827a;
        Context contextM0 = bVar3.m0();
        if (contextM0 == null) {
            return;
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            List<ClimbDTO> listD = ((k30.g) it.next()).d();
            if (listD == null) {
                listD = j0.f134944a;
            }
            d0.v(arrayList3, listD);
        }
        aVar.f(arrayList3);
        boolean zIsEmpty = aVar.f102831e.isEmpty();
        ArrayList arrayListC = aVar.c(false);
        int color = a7.b.getColor(contextM0, R.color.gcm_system_static_black);
        w13.c cVar = com.garmin.android.apps.connectmobile.courses.model.b.f32827m;
        char c17 = '\n';
        ArrayList arrayList4 = new ArrayList(y.r(cVar, 10));
        Iterator<T> it3 = cVar.iterator();
        while (it3.hasNext()) {
            q6.f.t(contextM0, ((com.garmin.android.apps.connectmobile.courses.model.b) it3.next()).f32829b, arrayList4);
        }
        List<ie2.j> listB = aVar.b();
        ArrayList arrayList5 = new ArrayList(y.r(listB, 10));
        Iterator<T> it4 = listB.iterator();
        while (it4.hasNext()) {
            arrayList5.add(((ie2.j) it4.next()).getPosition());
        }
        ArrayList arrayList6 = new ArrayList();
        for (k30.g gVar2 : list) {
            ArrayList arrayList7 = new ArrayList();
            List<ClimbDTO> listD2 = gVar2.d();
            if (listD2 != null) {
                Iterator it5 = listD2.iterator();
                f fVar2 = null;
                float fMax = -1000.0f;
                while (it5.hasNext()) {
                    ClimbDTO climbDTO = (ClimbDTO) it5.next();
                    Long gmapClimbId = climbDTO.getGmapClimbId();
                    if (gmapClimbId == null || arrayListC.contains(gmapClimbId)) {
                        bVar2 = bVar3;
                        arrayList2 = arrayList6;
                        gVar = gVar2;
                        z14 = zIsEmpty;
                        c16 = c17;
                        context = contextM0;
                    } else {
                        List<GeoPointDTO> listM = climbDTO.m();
                        ArrayList arrayList8 = new ArrayList();
                        for (Object obj : listM) {
                            if (((GeoPointDTO) obj).b()) {
                                arrayList8.add(obj);
                            }
                        }
                        if (arrayList8.isEmpty()) {
                            bVar2 = bVar3;
                            arrayList2 = arrayList6;
                            context = contextM0;
                            gVar = gVar2;
                        } else {
                            bVar2 = bVar3;
                            arrayList2 = arrayList6;
                            ArrayList arrayList9 = new ArrayList(y.r(arrayList8, 10));
                            for (Iterator it6 = arrayList8.iterator(); it6.hasNext(); it6 = it6) {
                                GeoPointDTO geoPointDTO = (GeoPointDTO) it6.next();
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
                                arrayList9.add(new f(dDoubleValue2, dDoubleValue3, com.garmin.android.library.mapsdkadapter.m.d(dDoubleValue4, dDoubleValue)));
                                contextM0 = contextM0;
                                gVar2 = gVar2;
                            }
                            context = contextM0;
                            gVar = gVar2;
                            f fVar3 = (f) h0.b0(arrayList9);
                            Iterator it7 = arrayList5.iterator();
                            while (true) {
                                if (!it7.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it7.next();
                                f.a aVar2 = f.f50281c;
                                Iterator it8 = it7;
                                if (((f) next).d(fVar3, -1.0f)) {
                                    break;
                                } else {
                                    it7 = it8;
                                }
                            }
                            if (next == null) {
                                int iOrdinal = climbDTO.getCategory().ordinal();
                                float f15 = (iOrdinal * 100.0f) - 1000.0f;
                                int i14 = !zIsEmpty ? 0 : color;
                                com.garmin.android.library.mapsdkadapter.q qVar = new com.garmin.android.library.mapsdkadapter.q();
                                z14 = zIsEmpty;
                                ie2.p pVar = qVar.f50328a;
                                pVar.f93164l = gmapClimbId;
                                pVar.f93156d = i14;
                                pVar.f93155c = 15.0f;
                                c16 = '\n';
                                pVar.f93158f = f15 - 10;
                                qVar.a(arrayList9);
                                pVar.f93160h = false;
                                h map = bVar2.getMap();
                                if (map != null) {
                                    map.h(qVar);
                                }
                                int iIntValue2 = !z14 ? 0 : ((Number) arrayList4.get(iOrdinal)).intValue();
                                com.garmin.android.library.mapsdkadapter.q qVar2 = new com.garmin.android.library.mapsdkadapter.q();
                                ie2.p pVar2 = qVar2.f50328a;
                                pVar2.f93164l = gmapClimbId;
                                pVar2.f93156d = iIntValue2;
                                pVar2.f93155c = 10.0f;
                                pVar2.f93158f = f15;
                                qVar2.a(arrayList9);
                                pVar2.f93160h = false;
                                h map2 = bVar2.getMap();
                                if (map2 != null) {
                                    map2.h(qVar2);
                                }
                                arrayList7.add(gmapClimbId);
                                fMax = Math.max(fMax, f15);
                                if (fVar2 == null) {
                                    fVar2 = fVar3;
                                }
                                aVar.f102829c.add(new k30.a(climbDTO.getGmapClimbId(), climbDTO.getGmapClimbFileId(), climbDTO.getCategory(), fVar3));
                            }
                        }
                        z14 = zIsEmpty;
                        c16 = '\n';
                    }
                    contextM0 = context;
                    bVar3 = bVar2;
                    arrayListC = arrayListC;
                    arrayList6 = arrayList2;
                    it5 = it5;
                    zIsEmpty = z14;
                    c17 = c16;
                    gVar2 = gVar;
                }
                bVar = bVar3;
                f14 = fMax;
                fVar = fVar2;
            } else {
                bVar = bVar3;
                f14 = -1000.0f;
                fVar = null;
            }
            ArrayList arrayList10 = arrayList6;
            k30.g gVar3 = gVar2;
            boolean z15 = zIsEmpty;
            ArrayList arrayList11 = arrayListC;
            char c18 = c17;
            Context context2 = contextM0;
            if (fVar == null || arrayList7.isEmpty()) {
                c14 = c18;
                arrayList = arrayList10;
            } else {
                Integer numB = gVar3.getCountOfClimbsAtStart();
                if (numB != null) {
                    iIntValue = numB.intValue();
                    c15 = c18;
                } else {
                    c15 = c18;
                    iIntValue = 0;
                }
                c14 = c15;
                arrayList = arrayList10;
                Bitmap bitmapB = d7.b.b(new v30.a(context2, iIntValue, false, 4, null), 0, 0, 7);
                Bundle bundle = new Bundle();
                bundle.putLongArray("extra_primary_climb_ids", h0.c1(arrayList7));
                bundle.putInt("extra_count_of_climbs_at_start", iIntValue);
                p pVar3 = new p();
                com.garmin.android.library.mapsdkadapter.o oVar = pVar3.f50327a;
                oVar.f50322n = bundle;
                pVar3.d(fVar);
                pVar3.c(bitmapB);
                oVar.f50311c = f14;
                pVar3.a(0.5f, 0.5f);
                arrayList.add(pVar3);
            }
            arrayList6 = arrayList;
            contextM0 = context2;
            bVar3 = bVar;
            zIsEmpty = z15;
            c17 = c14;
            arrayListC = arrayList11;
        }
        ArrayList arrayList12 = arrayList6;
        h map3 = bVar3.getMap();
        if (map3 != null) {
            map3.f(0, arrayList12);
        }
    }

    public final void z7() {
        k40.a aVar = this.f97009l;
        k40.b bVar = aVar.f102827a;
        for (l lVar : aVar.d(true)) {
            h map = bVar.getMap();
            if (map != null) {
                map.m(lVar);
            }
        }
        List<qe2.a> listA = aVar.a(true);
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add((qe2.a) it.next());
        }
        h map2 = bVar.getMap();
        if (map2 != null) {
            map2.Y(new k(arrayList, 0, 1));
        }
        ArrayList arrayList2 = aVar.f102831e;
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            Long l14 = ((k30.a) it3.next()).f102522a;
            if (l14 != null) {
                arrayList3.add(l14);
            }
        }
        boolean zIsEmpty = arrayList3.isEmpty();
        ArrayList arrayList4 = aVar.f102829c;
        if (zIsEmpty) {
            arrayList4.clear();
        } else {
            arrayList4.removeIf(new n(new g0(7, arrayList3), 14));
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0004X\u0084T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0006¨\u0006\u0015"}, d2 = {"Lj40/c$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "LOCATION_BUTTON_TAG", "", "INITIAL_ZOOM_LEVEL", "I", "EXTRA_INTERVAL_MARKER_TAG", "", "INTERVAL_MARKERS_STRIDE_1_MIN_ZOOM_LEVEL", "F", "INTERVAL_MARKERS_STRIDE_2_MIN_ZOOM_LEVEL", "INTERVAL_MARKERS_STRIDE_4_MIN_ZOOM_LEVEL", "INTERVAL_MARKERS_STRIDE_8_MIN_ZOOM_LEVEL", "INTERVAL_MARKERS_STRIDE_16_MIN_ZOOM_LEVEL", "STATE_SHOULD_SHOW_MAP_OPTIONS", "STATE_SHOULD_SHOW_EXTRA_MAP_OPTIONS", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
