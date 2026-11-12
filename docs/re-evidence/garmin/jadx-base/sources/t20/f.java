package t20;

import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lt20/f;", "", "<init>", "()V", "a", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f161772a = new f();

    private f() {
    }

    public static final void a(List list, com.garmin.android.apps.connectmobile.courses.model.e eVar) {
        eVar.getClass();
        list.getClass();
        a aVar = new a();
        Iterator it = list.iterator();
        double dB = Double.NaN;
        GeoPointDTO geoPointDTO = null;
        while (it.hasNext()) {
            GeoPointDTO geoPointDTO2 = (GeoPointDTO) it.next();
            f161772a.getClass();
            if (Double.isNaN(dB)) {
                dB = 0.0d;
            } else {
                GeoPointDTO.INSTANCE.getClass();
                dB = GeoPointDTO.Companion.b(geoPointDTO, geoPointDTO2) + dB;
            }
            geoPointDTO2.distance = Double.valueOf(dB);
            Double d14 = geoPointDTO2.elevation;
            if (d14 != null) {
                double dDoubleValue = d14.doubleValue();
                Double d15 = aVar.f161775c;
                if (d15 == null) {
                    aVar.f161775c = Double.valueOf(dDoubleValue);
                    aVar.f161773a = 0.0d;
                    aVar.f161774b = 0.0d;
                } else {
                    double dDoubleValue2 = dDoubleValue - d15.doubleValue();
                    double d16 = aVar.f161776d + dDoubleValue2;
                    aVar.f161776d = d16;
                    if (Math.abs(d16) >= 2.0d) {
                        if (aVar.f161776d > 0.0d) {
                            aVar.f161773a += dDoubleValue2;
                        } else {
                            aVar.f161774b += -dDoubleValue2;
                        }
                        aVar.f161776d = 0.0d;
                        aVar.f161775c = Double.valueOf(dDoubleValue);
                    }
                }
            }
            geoPointDTO = geoPointDTO2;
        }
        eVar.geoPoints = list;
        if (!Double.isNaN(dB)) {
            eVar.n0(Double.valueOf(dB));
        }
        if (!Double.isNaN(aVar.f161773a)) {
            eVar.o0(Double.valueOf(aVar.f161773a));
        }
        if (Double.isNaN(aVar.f161774b)) {
            return;
        }
        eVar.p0(Double.valueOf(aVar.f161774b));
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lt20/f$a;", "", "<init>", "()V", "a", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public double f161773a = Double.NaN;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public double f161774b = Double.NaN;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Double f161775c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public double f161776d;

        static {
            new C3054a(null);
        }

        /* JADX INFO: renamed from: t20.f$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lt20/f$a$a;", "", "<init>", "()V", "", "ELEVATION_THRESHOLD", "D", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class C3054a {
            public /* synthetic */ C3054a(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            private C3054a() {
            }
        }
    }
}
