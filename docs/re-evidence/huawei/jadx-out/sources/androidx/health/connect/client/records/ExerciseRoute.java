package androidx.health.connect.client.records;

import androidx.health.connect.client.units.Length;
import com.huawei.hms.network.embedded.g4;
import com.huawei.openalliance.ad.constant.JsbMapKeyNames;
import com.huawei.route.utils.RouteSourceUtils;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import defpackage.yzp;
import defpackage.zay;
import defpackage.zcm;
import defpackage.zcp;
import java.time.Instant;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0010B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"Landroidx/health/connect/client/records/ExerciseRoute;", "", RouteSourceUtils.MY_ROUTE_PATH, "", "Landroidx/health/connect/client/records/ExerciseRoute$Location;", "<init>", "(Ljava/util/List;)V", "getRoute", "()Ljava/util/List;", "equals", "", "other", WatchFaceConstant.HASHCODE, "", "toString", "", "Location", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ExerciseRoute {
    private final List<Location> route;

    public ExerciseRoute(List<Location> list) {
        zcp.c(list, "");
        this.route = list;
        List listE = yzp.e((Iterable) list, new Comparator() { // from class: androidx.health.connect.client.records.ExerciseRoute$special$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return zay.d(((ExerciseRoute.Location) t).getTime(), ((ExerciseRoute.Location) t2).getTime());
            }
        });
        int iA = yzp.a(listE);
        int i = 0;
        while (i < iA) {
            Instant time = ((Location) listE.get(i)).getTime();
            i++;
            if (!time.isBefore(((Location) listE.get(i)).getTime())) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        }
    }

    public final List<Location> getRoute() {
        return this.route;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof ExerciseRoute) {
            return zcp.b(this.route, ((ExerciseRoute) other).route);
        }
        return false;
    }

    public int hashCode() {
        return this.route.hashCode();
    }

    public String toString() {
        return "ExerciseRoute(route=" + this.route + g4.l;
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dBC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u001e"}, d2 = {"Landroidx/health/connect/client/records/ExerciseRoute$Location;", "", "time", "Ljava/time/Instant;", JsbMapKeyNames.H5_LOC_LAT, "", JsbMapKeyNames.H5_LOC_LON, "horizontalAccuracy", "Landroidx/health/connect/client/units/Length;", "verticalAccuracy", "altitude", "<init>", "(Ljava/time/Instant;DDLandroidx/health/connect/client/units/Length;Landroidx/health/connect/client/units/Length;Landroidx/health/connect/client/units/Length;)V", "getTime", "()Ljava/time/Instant;", "getLatitude", "()D", "getLongitude", "getHorizontalAccuracy", "()Landroidx/health/connect/client/units/Length;", "getVerticalAccuracy", "getAltitude", "equals", "", "other", WatchFaceConstant.HASHCODE, "", "toString", "", "Companion", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Location {
        private static final double MAX_LATITUDE = 90.0d;
        private static final double MAX_LONGITUDE = 180.0d;
        private static final double MIN_LATITUDE = -90.0d;
        private static final double MIN_LONGITUDE = -180.0d;
        private final Length altitude;
        private final Length horizontalAccuracy;
        private final double latitude;
        private final double longitude;
        private final Instant time;
        private final Length verticalAccuracy;

        public Location(Instant instant, double d, double d2, Length length, Length length2, Length length3) {
            zcp.c(instant, "");
            this.time = instant;
            this.latitude = d;
            this.longitude = d2;
            this.horizontalAccuracy = length;
            this.verticalAccuracy = length2;
            this.altitude = length3;
            UtilsKt.requireNotLess(Double.valueOf(d), Double.valueOf(MIN_LATITUDE), JsbMapKeyNames.H5_LOC_LAT);
            UtilsKt.requireNotMore(Double.valueOf(d), Double.valueOf(MAX_LATITUDE), JsbMapKeyNames.H5_LOC_LAT);
            UtilsKt.requireNotLess(Double.valueOf(d2), Double.valueOf(MIN_LONGITUDE), JsbMapKeyNames.H5_LOC_LON);
            UtilsKt.requireNotMore(Double.valueOf(d2), Double.valueOf(MAX_LONGITUDE), JsbMapKeyNames.H5_LOC_LON);
            if (length != null) {
                UtilsKt.requireNotLess(length, length.zero$connect_client_release(), "horizontalAccuracy");
            }
            if (length2 != null) {
                UtilsKt.requireNotLess(length2, length2.zero$connect_client_release(), "verticalAccuracy");
            }
        }

        public /* synthetic */ Location(Instant instant, double d, double d2, Length length, Length length2, Length length3, int i, zcm zcmVar) {
            this(instant, d, d2, (i & 8) != 0 ? null : length, (i & 16) != 0 ? null : length2, (i & 32) != 0 ? null : length3);
        }

        public final Instant getTime() {
            return this.time;
        }

        public final double getLatitude() {
            return this.latitude;
        }

        public final double getLongitude() {
            return this.longitude;
        }

        public final Length getHorizontalAccuracy() {
            return this.horizontalAccuracy;
        }

        public final Length getVerticalAccuracy() {
            return this.verticalAccuracy;
        }

        public final Length getAltitude() {
            return this.altitude;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Location)) {
                return false;
            }
            Location location = (Location) other;
            return zcp.b(this.time, location.time) && this.latitude == location.latitude && this.longitude == location.longitude && zcp.b(this.horizontalAccuracy, location.horizontalAccuracy) && zcp.b(this.verticalAccuracy, location.verticalAccuracy) && zcp.b(this.altitude, location.altitude);
        }

        public int hashCode() {
            int iHashCode = this.time.hashCode();
            int iHashCode2 = Double.hashCode(this.latitude);
            int iHashCode3 = Double.hashCode(this.longitude);
            Length length = this.horizontalAccuracy;
            int iHashCode4 = length != null ? length.hashCode() : 0;
            Length length2 = this.verticalAccuracy;
            int iHashCode5 = length2 != null ? length2.hashCode() : 0;
            Length length3 = this.altitude;
            return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (length3 != null ? length3.hashCode() : 0);
        }

        public String toString() {
            return "Location(time=" + this.time + ", latitude=" + this.latitude + ", longitude=" + this.longitude + ", horizontalAccuracy=" + this.horizontalAccuracy + ", verticalAccuracy=" + this.verticalAccuracy + ", altitude=" + this.altitude + g4.l;
        }
    }
}
