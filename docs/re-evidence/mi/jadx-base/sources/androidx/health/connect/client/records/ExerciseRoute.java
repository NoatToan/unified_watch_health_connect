package androidx.health.connect.client.records;

import androidx.health.connect.client.units.Length;
import com.xiaomi.accountsdk.request.SimpleRequest;
import com.xiaomi.fit.fitness.parser.schema.FitnessGpsKey;
import java.time.Instant;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\rB\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Landroidx/health/connect/client/records/ExerciseRoute;", "", "route", "", "Landroidx/health/connect/client/records/ExerciseRoute$Location;", "(Ljava/util/List;)V", "getRoute", "()Ljava/util/List;", "equals", "", "other", "hashCode", "", SimpleRequest.LOCATION, "connect-client_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nExerciseRoute.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExerciseRoute.kt\nandroidx/health/connect/client/records/ExerciseRoute\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,117:1\n1045#2:118\n*S KotlinDebug\n*F\n+ 1 ExerciseRoute.kt\nandroidx/health/connect/client/records/ExerciseRoute\n*L\n32#1:118\n*E\n"})
public final class ExerciseRoute {

    @NotNull
    private final List<Location> route;

    public ExerciseRoute(@NotNull List<Location> route) {
        Intrinsics.checkNotNullParameter(route, "route");
        this.route = route;
        List listSortedWith = CollectionsKt___CollectionsKt.sortedWith(route, new Comparator() { // from class: androidx.health.connect.client.records.ExerciseRoute$special$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt__ComparisonsKt.compareValues(((ExerciseRoute.Location) t).getTime(), ((ExerciseRoute.Location) t2).getTime());
            }
        });
        int lastIndex = CollectionsKt__CollectionsKt.getLastIndex(listSortedWith);
        int i = 0;
        while (i < lastIndex) {
            Instant time = ((Location) listSortedWith.get(i)).getTime();
            i++;
            if (!time.isBefore(((Location) listSortedWith.get(i)).getTime())) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        }
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof ExerciseRoute) {
            return Intrinsics.areEqual(this.route, ((ExerciseRoute) other).route);
        }
        return false;
    }

    @NotNull
    public final List<Location> getRoute() {
        return this.route;
    }

    public int hashCode() {
        return this.route.hashCode();
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aBA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\u000bJ\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016R\u0013\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006\u001b"}, d2 = {"Landroidx/health/connect/client/records/ExerciseRoute$Location;", "", "time", "Ljava/time/Instant;", "latitude", "", "longitude", FitnessGpsKey.horizontalAccuracy, "Landroidx/health/connect/client/units/Length;", "verticalAccuracy", "altitude", "(Ljava/time/Instant;DDLandroidx/health/connect/client/units/Length;Landroidx/health/connect/client/units/Length;Landroidx/health/connect/client/units/Length;)V", "getAltitude", "()Landroidx/health/connect/client/units/Length;", "getHorizontalAccuracy", "getLatitude", "()D", "getLongitude", "getTime", "()Ljava/time/Instant;", "getVerticalAccuracy", "equals", "", "other", "hashCode", "", "Companion", "connect-client_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Location {
        private static final double MAX_LATITUDE = 90.0d;
        private static final double MAX_LONGITUDE = 180.0d;
        private static final double MIN_LATITUDE = -90.0d;
        private static final double MIN_LONGITUDE = -180.0d;

        @Nullable
        private final Length altitude;

        @Nullable
        private final Length horizontalAccuracy;
        private final double latitude;
        private final double longitude;

        @NotNull
        private final Instant time;

        @Nullable
        private final Length verticalAccuracy;

        public Location(@NotNull Instant time, double d, double d2, @Nullable Length length, @Nullable Length length2, @Nullable Length length3) {
            Intrinsics.checkNotNullParameter(time, "time");
            this.time = time;
            this.latitude = d;
            this.longitude = d2;
            this.horizontalAccuracy = length;
            this.verticalAccuracy = length2;
            this.altitude = length3;
            UtilsKt.requireNotLess(Double.valueOf(d), Double.valueOf(MIN_LATITUDE), "latitude");
            UtilsKt.requireNotMore(Double.valueOf(d), Double.valueOf(MAX_LATITUDE), "latitude");
            UtilsKt.requireNotLess(Double.valueOf(d2), Double.valueOf(MIN_LONGITUDE), "longitude");
            UtilsKt.requireNotMore(Double.valueOf(d2), Double.valueOf(MAX_LONGITUDE), "longitude");
            if (length != null) {
                UtilsKt.requireNotLess(length, length.zero$connect_client_release(), FitnessGpsKey.horizontalAccuracy);
            }
            if (length2 != null) {
                UtilsKt.requireNotLess(length2, length2.zero$connect_client_release(), "verticalAccuracy");
            }
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Location)) {
                return false;
            }
            Location location = (Location) other;
            return Intrinsics.areEqual(this.time, location.time) && this.latitude == location.latitude && this.longitude == location.longitude && Intrinsics.areEqual(this.horizontalAccuracy, location.horizontalAccuracy) && Intrinsics.areEqual(this.verticalAccuracy, location.verticalAccuracy) && Intrinsics.areEqual(this.altitude, location.altitude);
        }

        @Nullable
        public final Length getAltitude() {
            return this.altitude;
        }

        @Nullable
        public final Length getHorizontalAccuracy() {
            return this.horizontalAccuracy;
        }

        public final double getLatitude() {
            return this.latitude;
        }

        public final double getLongitude() {
            return this.longitude;
        }

        @NotNull
        public final Instant getTime() {
            return this.time;
        }

        @Nullable
        public final Length getVerticalAccuracy() {
            return this.verticalAccuracy;
        }

        public int hashCode() {
            int iHashCode = ((((this.time.hashCode() * 31) + Double.hashCode(this.latitude)) * 31) + Double.hashCode(this.longitude)) * 31;
            Length length = this.horizontalAccuracy;
            int iHashCode2 = (iHashCode + (length != null ? length.hashCode() : 0)) * 31;
            Length length2 = this.verticalAccuracy;
            int iHashCode3 = (iHashCode2 + (length2 != null ? length2.hashCode() : 0)) * 31;
            Length length3 = this.altitude;
            return iHashCode3 + (length3 != null ? length3.hashCode() : 0);
        }

        public /* synthetic */ Location(Instant instant, double d, double d2, Length length, Length length2, Length length3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(instant, d, d2, (i & 8) != 0 ? null : length, (i & 16) != 0 ? null : length2, (i & 32) != 0 ? null : length3);
        }
    }
}
