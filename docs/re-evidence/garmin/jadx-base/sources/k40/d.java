package k40;

import android.content.Context;
import android.graphics.Bitmap;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.library.mapsdkadapter.m;
import com.garmin.android.library.mapsdkadapter.p;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lk40/d;", "", "Lk40/b;", "host", "<init>", "(Lk40/b;)V", "a", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f102834c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k40.b f102835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f102836b;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f102837a;

        static {
            int[] iArr = new int[com.garmin.android.apps.connectmobile.courses.model.f.values().length];
            try {
                iArr[com.garmin.android.apps.connectmobile.courses.model.f.CATEGORY_T1_CLIMB.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.courses.model.f.CATEGORY_T2_CLIMB.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.courses.model.f.CATEGORY_T3_CLIMB.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.courses.model.f.CATEGORY_T4_CLIMB.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.courses.model.f.MARKER_MILE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.courses.model.f.MARKER_KILOMETER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.courses.model.f.MARKER_HALF_MARATHON.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f102837a = iArr;
        }
    }

    static {
        new a(null);
        f102834c = d.class.getSimpleName();
    }

    public d(k40.b bVar) {
        bVar.getClass();
        this.f102835a = bVar;
        this.f102836b = new ArrayList();
    }

    public static com.garmin.android.library.mapsdkadapter.f b(GeoPointDTO geoPointDTO, com.garmin.android.library.mapsdkadapter.i.b bVar) {
        if (geoPointDTO == null) {
            return null;
        }
        Double d14 = geoPointDTO.latitude;
        Double d15 = geoPointDTO.longitude;
        if (d14 == null || d15 == null) {
            return null;
        }
        LatLng latLng = new LatLng(d14.doubleValue(), d15.doubleValue());
        if (bVar == null) {
            bVar = m.f(latLng) ? com.garmin.android.library.mapsdkadapter.i.b.GCJ02 : com.garmin.android.library.mapsdkadapter.i.b.WGS84;
        }
        return new com.garmin.android.library.mapsdkadapter.f(latLng, bVar);
    }

    public final void a(com.garmin.android.apps.connectmobile.courses.model.g gVar, com.garmin.android.library.mapsdkadapter.i.b bVar, boolean z14, String str) {
        k40.b bVar2;
        Context contextM0;
        com.garmin.android.library.mapsdkadapter.i.b bVarD;
        if (gVar == null || (contextM0 = (bVar2 = this.f102835a).m0()) == null) {
            return;
        }
        if (bVar == null) {
            Double d14 = gVar.lat;
            double dDoubleValue = d14 != null ? d14.doubleValue() : 0.0d;
            Double d15 = gVar.lon;
            double dDoubleValue2 = d15 != null ? d15.doubleValue() : 0.0d;
            s20.b bVar3 = s20.b.f156004a;
            bVarD = m.d(dDoubleValue, dDoubleValue2);
        } else {
            bVarD = bVar;
        }
        s20.b bVar4 = s20.b.f156004a;
        bVarD.getClass();
        p pVar = new p();
        if (gVar.lat != null && gVar.lon != null) {
            com.garmin.android.apps.connectmobile.courses.model.f.a aVar = com.garmin.android.apps.connectmobile.courses.model.f.f32898h;
            String coursePointType = gVar.getCoursePointType();
            aVar.getClass();
            Bitmap bitmapB = d7.b.b(new u40.d(contextM0, com.garmin.android.apps.connectmobile.courses.model.f.a.a(coursePointType), false, str, 0.0f, 20, null), 0, 0, 7);
            if (z14) {
                bitmapB = s20.c.a(contextM0, bitmapB);
            }
            Double d16 = gVar.lat;
            double dDoubleValue3 = d16 != null ? d16.doubleValue() : 0.0d;
            Double d17 = gVar.lon;
            pVar.d(new com.garmin.android.library.mapsdkadapter.f(dDoubleValue3, d17 != null ? d17.doubleValue() : 0.0d, bVarD));
            pVar.f50327a.f50315g = z14;
            pVar.c(bitmapB);
            pVar.a(0.5f, 0.5f);
            pVar.e("extra_marker_tag", new com.garmin.android.apps.connectmobile.courses.model.g(gVar));
        }
        qe2.h map = bVar2.getMap();
        ie2.j jVarX = map != null ? map.x(pVar) : null;
        if (jVarX != null) {
            this.f102836b.add(jVarX);
        }
        i2.f36769a.getClass();
        i2.a.b(a2.COURSES, f102834c, "Adding a new marker " + gVar);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lk40/d$a;", "", "<init>", "()V", "", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
