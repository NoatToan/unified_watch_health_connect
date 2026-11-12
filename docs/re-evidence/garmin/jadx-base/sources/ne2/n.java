package ne2;

import com.mapbox.geojson.Point;
import com.mapbox.maps.CameraOptions;
import com.mapbox.maps.EdgeInsets;
import com.mapbox.maps.MapboxMap;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.j0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0010Ba\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lne2/n;", "", "Lcom/mapbox/geojson/Point;", "point", "", "zoom", "", "duration", "pitch", "bearing", "", "padding", "", "boundCoordinates", "<init>", "(Lcom/mapbox/geojson/Point;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/util/List;)V", "a", "map-sdk-adapter-mapbox-map_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class n {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f125688h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Point f125689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f125690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f125691c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Double f125692d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Double f125693e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Integer f125694f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List<Point> f125695g;

    static {
        new a(null);
    }

    public /* synthetic */ n(Point point, Double d14, Long l14, Double d15, Double d16, Integer num, List list, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : point, (i14 & 2) != 0 ? null : d14, (i14 & 4) != 0 ? 500L : l14, (i14 & 8) != 0 ? null : d15, (i14 & 16) != 0 ? null : d16, (i14 & 32) != 0 ? null : num, (i14 & 64) != 0 ? null : list);
    }

    public final void a(MapboxMap mapboxMap, Double d14, e23.l<? super CameraOptions, Unit> lVar) {
        List<Point> list = this.f125695g;
        if (list == null) {
            list = j0.f134944a;
        }
        List<Point> list2 = list;
        Integer num = this.f125694f;
        double dIntValue = num != null ? num.intValue() : 0.0d;
        mapboxMap.cameraForCoordinates(list2, b(), new EdgeInsets(dIntValue, dIntValue, dIntValue, dIntValue), d14, null, new na0.l(lVar, 2));
    }

    public final CameraOptions b() {
        CameraOptions.Builder builder = new CameraOptions.Builder();
        Point point = this.f125689a;
        if (point != null) {
            builder.center(point);
        }
        Double d14 = this.f125690b;
        if (d14 != null) {
            builder.zoom(Double.valueOf(d14.doubleValue()));
        }
        Double d15 = this.f125692d;
        if (d15 != null) {
            builder.pitch(Double.valueOf(d15.doubleValue()));
        }
        Double d16 = this.f125693e;
        if (d16 != null) {
            builder.bearing(Double.valueOf(d16.doubleValue()));
        }
        CameraOptions cameraOptionsBuild = builder.build();
        cameraOptionsBuild.getClass();
        return cameraOptionsBuild;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return p005kotlin.jvm.internal.s.g(this.f125689a, nVar.f125689a) && p005kotlin.jvm.internal.s.g(this.f125690b, nVar.f125690b) && p005kotlin.jvm.internal.s.g(this.f125691c, nVar.f125691c) && p005kotlin.jvm.internal.s.g(this.f125692d, nVar.f125692d) && p005kotlin.jvm.internal.s.g(this.f125693e, nVar.f125693e) && p005kotlin.jvm.internal.s.g(this.f125694f, nVar.f125694f) && p005kotlin.jvm.internal.s.g(this.f125695g, nVar.f125695g);
    }

    public final int hashCode() {
        Point point = this.f125689a;
        int iHashCode = (point == null ? 0 : point.hashCode()) * 31;
        Double d14 = this.f125690b;
        int iHashCode2 = (iHashCode + (d14 == null ? 0 : d14.hashCode())) * 31;
        Long l14 = this.f125691c;
        int iHashCode3 = (iHashCode2 + (l14 == null ? 0 : l14.hashCode())) * 31;
        Double d15 = this.f125692d;
        int iHashCode4 = (iHashCode3 + (d15 == null ? 0 : d15.hashCode())) * 31;
        Double d16 = this.f125693e;
        int iHashCode5 = (iHashCode4 + (d16 == null ? 0 : d16.hashCode())) * 31;
        Integer num = this.f125694f;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        List<Point> list = this.f125695g;
        return iHashCode6 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("MapboxCameraOptions(point=");
        sb3.append(this.f125689a);
        sb3.append(", zoom=");
        sb3.append(this.f125690b);
        sb3.append(", duration=");
        sb3.append(this.f125691c);
        sb3.append(", pitch=");
        sb3.append(this.f125692d);
        sb3.append(", bearing=");
        b71.i.t(sb3, this.f125693e, ", padding=", this.f125694f, ", boundCoordinates=");
        return u62.z.c(sb3, this.f125695g, ")");
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lne2/n$a;", "", "<init>", "()V", "", "DEFAULT_ANIMATION_DURATION", "J", "map-sdk-adapter-mapbox-map_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public n(Point point, Double d14, Long l14, Double d15, Double d16, Integer num, List<Point> list) {
        this.f125689a = point;
        this.f125690b = d14;
        this.f125691c = l14;
        this.f125692d = d15;
        this.f125693e = d16;
        this.f125694f = num;
        this.f125695g = list;
    }

    public n() {
        this(null, null, null, null, null, null, null, 127, null);
    }
}
