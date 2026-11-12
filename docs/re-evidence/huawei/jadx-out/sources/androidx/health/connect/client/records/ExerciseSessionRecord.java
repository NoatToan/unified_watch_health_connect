package androidx.health.connect.client.records;

import androidx.core.app.NotificationCompat;
import androidx.health.connect.client.aggregate.AggregateMetric;
import androidx.media3.exoplayer.RendererCapabilities;
import com.google.android.gms.fitness.FitnessActivities;
import com.google.android.gms.fitness.data.WorkoutExercises;
import com.huawei.health.device.open.data.model.HealthData;
import com.huawei.hms.hihealth.HiHealthActivities;
import com.huawei.hms.network.embedded.g4;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import defpackage.yyz;
import defpackage.yzp;
import defpackage.zae;
import defpackage.zcm;
import defpackage.zcp;
import defpackage.zdm;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.time.Duration;
import java.time.Instant;
import java.time.ZoneOffset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.jvm.functions.Function2;
import okio.Utf8;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 72\u00020\u0001:\u000278B\u008b\u0001\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0010\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0017\u0010\u0018B\u008d\u0001\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0010\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0017\u0010\u001bJ\u0013\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u000104H\u0096\u0002J\b\u00105\u001a\u00020\u000bH\u0016J\b\u00106\u001a\u00020\rH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0006\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001fR\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0017\u0010\n\u001a\u00020\u000b¢\u0006\u000e\n\u0000\u0012\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b*\u0010)R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0010¢\u0006\b\n\u0000\u001a\u0004\b-\u0010,R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b0\u0010)¨\u00069"}, d2 = {"Landroidx/health/connect/client/records/ExerciseSessionRecord;", "Landroidx/health/connect/client/records/IntervalRecord;", "startTime", "Ljava/time/Instant;", "startZoneOffset", "Ljava/time/ZoneOffset;", "endTime", "endZoneOffset", "metadata", "Landroidx/health/connect/client/records/metadata/Metadata;", "exerciseType", "", "title", "", "notes", "segments", "", "Landroidx/health/connect/client/records/ExerciseSegment;", "laps", "Landroidx/health/connect/client/records/ExerciseLap;", "exerciseRouteResult", "Landroidx/health/connect/client/records/ExerciseRouteResult;", "plannedExerciseSessionId", "<init>", "(Ljava/time/Instant;Ljava/time/ZoneOffset;Ljava/time/Instant;Ljava/time/ZoneOffset;Landroidx/health/connect/client/records/metadata/Metadata;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Landroidx/health/connect/client/records/ExerciseRouteResult;Ljava/lang/String;)V", "exerciseRoute", "Landroidx/health/connect/client/records/ExerciseRoute;", "(Ljava/time/Instant;Ljava/time/ZoneOffset;Ljava/time/Instant;Ljava/time/ZoneOffset;Landroidx/health/connect/client/records/metadata/Metadata;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Landroidx/health/connect/client/records/ExerciseRoute;Ljava/lang/String;)V", "getStartTime", "()Ljava/time/Instant;", "getStartZoneOffset", "()Ljava/time/ZoneOffset;", "getEndTime", "getEndZoneOffset", "getMetadata", "()Landroidx/health/connect/client/records/metadata/Metadata;", "getExerciseType$annotations", "()V", "getExerciseType", "()I", "getTitle", "()Ljava/lang/String;", "getNotes", "getSegments", "()Ljava/util/List;", "getLaps", "getExerciseRouteResult", "()Landroidx/health/connect/client/records/ExerciseRouteResult;", "getPlannedExerciseSessionId", "equals", "", "other", "", WatchFaceConstant.HASHCODE, "toString", "Companion", "ExerciseTypes", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ExerciseSessionRecord implements IntervalRecord {
    public static final AggregateMetric<Duration> EXERCISE_DURATION_TOTAL = AggregateMetric.INSTANCE.durationMetric$connect_client_release("ActiveTime", AggregateMetric.AggregationType.TOTAL, "time");
    public static final int EXERCISE_TYPE_BADMINTON = 2;
    public static final int EXERCISE_TYPE_BASEBALL = 4;
    public static final int EXERCISE_TYPE_BASKETBALL = 5;
    public static final int EXERCISE_TYPE_BIKING = 8;
    public static final int EXERCISE_TYPE_BIKING_STATIONARY = 9;
    public static final int EXERCISE_TYPE_BOOT_CAMP = 10;
    public static final int EXERCISE_TYPE_BOXING = 11;
    public static final int EXERCISE_TYPE_CALISTHENICS = 13;
    public static final int EXERCISE_TYPE_CRICKET = 14;
    public static final int EXERCISE_TYPE_DANCING = 16;
    public static final int EXERCISE_TYPE_ELLIPTICAL = 25;
    public static final int EXERCISE_TYPE_EXERCISE_CLASS = 26;
    public static final int EXERCISE_TYPE_FENCING = 27;
    public static final int EXERCISE_TYPE_FOOTBALL_AMERICAN = 28;
    public static final int EXERCISE_TYPE_FOOTBALL_AUSTRALIAN = 29;
    public static final int EXERCISE_TYPE_FRISBEE_DISC = 31;
    public static final int EXERCISE_TYPE_GOLF = 32;
    public static final int EXERCISE_TYPE_GUIDED_BREATHING = 33;
    public static final int EXERCISE_TYPE_GYMNASTICS = 34;
    public static final int EXERCISE_TYPE_HANDBALL = 35;
    public static final int EXERCISE_TYPE_HIGH_INTENSITY_INTERVAL_TRAINING = 36;
    public static final int EXERCISE_TYPE_HIKING = 37;
    public static final int EXERCISE_TYPE_ICE_HOCKEY = 38;
    public static final int EXERCISE_TYPE_ICE_SKATING = 39;
    public static final Map<Integer, String> EXERCISE_TYPE_INT_TO_STRING_MAP;
    public static final int EXERCISE_TYPE_MARTIAL_ARTS = 44;
    public static final int EXERCISE_TYPE_OTHER_WORKOUT = 0;
    public static final int EXERCISE_TYPE_PADDLING = 46;
    public static final int EXERCISE_TYPE_PARAGLIDING = 47;
    public static final int EXERCISE_TYPE_PILATES = 48;
    public static final int EXERCISE_TYPE_RACQUETBALL = 50;
    public static final int EXERCISE_TYPE_ROCK_CLIMBING = 51;
    public static final int EXERCISE_TYPE_ROLLER_HOCKEY = 52;
    public static final int EXERCISE_TYPE_ROWING = 53;
    public static final int EXERCISE_TYPE_ROWING_MACHINE = 54;
    public static final int EXERCISE_TYPE_RUGBY = 55;
    public static final int EXERCISE_TYPE_RUNNING = 56;
    public static final int EXERCISE_TYPE_RUNNING_TREADMILL = 57;
    public static final int EXERCISE_TYPE_SAILING = 58;
    public static final int EXERCISE_TYPE_SCUBA_DIVING = 59;
    public static final int EXERCISE_TYPE_SKATING = 60;
    public static final int EXERCISE_TYPE_SKIING = 61;
    public static final int EXERCISE_TYPE_SNOWBOARDING = 62;
    public static final int EXERCISE_TYPE_SNOWSHOEING = 63;
    public static final int EXERCISE_TYPE_SOCCER = 64;
    public static final int EXERCISE_TYPE_SOFTBALL = 65;
    public static final int EXERCISE_TYPE_SQUASH = 66;
    public static final int EXERCISE_TYPE_STAIR_CLIMBING = 68;
    public static final int EXERCISE_TYPE_STAIR_CLIMBING_MACHINE = 69;
    public static final int EXERCISE_TYPE_STRENGTH_TRAINING = 70;
    public static final int EXERCISE_TYPE_STRETCHING = 71;
    public static final Map<String, Integer> EXERCISE_TYPE_STRING_TO_INT_MAP;
    public static final int EXERCISE_TYPE_SURFING = 72;
    public static final int EXERCISE_TYPE_SWIMMING_OPEN_WATER = 73;
    public static final int EXERCISE_TYPE_SWIMMING_POOL = 74;
    public static final int EXERCISE_TYPE_TABLE_TENNIS = 75;
    public static final int EXERCISE_TYPE_TENNIS = 76;
    public static final int EXERCISE_TYPE_VOLLEYBALL = 78;
    public static final int EXERCISE_TYPE_WALKING = 79;
    public static final int EXERCISE_TYPE_WATER_POLO = 80;
    public static final int EXERCISE_TYPE_WEIGHTLIFTING = 81;
    public static final int EXERCISE_TYPE_WHEELCHAIR = 82;
    public static final int EXERCISE_TYPE_YOGA = 83;
    private final Instant endTime;
    private final ZoneOffset endZoneOffset;
    private final ExerciseRouteResult exerciseRouteResult;
    private final int exerciseType;
    private final List<ExerciseLap> laps;
    private final androidx.health.connect.client.records.metadata.Metadata metadata;
    private final String notes;
    private final String plannedExerciseSessionId;
    private final List<ExerciseSegment> segments;
    private final Instant startTime;
    private final ZoneOffset startZoneOffset;
    private final String title;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Landroidx/health/connect/client/records/ExerciseSessionRecord$ExerciseTypes;", "", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface ExerciseTypes {
    }

    public static /* synthetic */ void getExerciseType$annotations() {
    }

    public ExerciseSessionRecord(Instant instant, ZoneOffset zoneOffset, Instant instant2, ZoneOffset zoneOffset2, androidx.health.connect.client.records.metadata.Metadata metadata, int i, String str, String str2, List<ExerciseSegment> list, List<ExerciseLap> list2, ExerciseRouteResult exerciseRouteResult, String str3) {
        zcp.c(instant, "");
        zcp.c(instant2, "");
        zcp.c(metadata, "");
        zcp.c(list, "");
        zcp.c(list2, "");
        zcp.c(exerciseRouteResult, "");
        this.startTime = instant;
        this.startZoneOffset = zoneOffset;
        this.endTime = instant2;
        this.endZoneOffset = zoneOffset2;
        this.metadata = metadata;
        this.exerciseType = i;
        this.title = str;
        this.notes = str2;
        this.segments = list;
        this.laps = list2;
        this.exerciseRouteResult = exerciseRouteResult;
        this.plannedExerciseSessionId = str3;
        if (!getStartTime().isBefore(getEndTime())) {
            throw new IllegalArgumentException("startTime must be before endTime.".toString());
        }
        int i2 = 0;
        if (!list.isEmpty()) {
            final ExerciseSessionRecord$sortedSegments$1 exerciseSessionRecord$sortedSegments$1 = new Function2<ExerciseSegment, ExerciseSegment, Integer>() { // from class: androidx.health.connect.client.records.ExerciseSessionRecord$sortedSegments$1
                @Override // kotlin.jvm.functions.Function2
                public final Integer invoke(ExerciseSegment exerciseSegment, ExerciseSegment exerciseSegment2) {
                    return Integer.valueOf(exerciseSegment.getStartTime().compareTo(exerciseSegment2.getStartTime()));
                }
            };
            List listE = yzp.e((Iterable) list, new Comparator() { // from class: androidx.health.connect.client.records.ExerciseSessionRecord$$ExternalSyntheticLambda0
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return ExerciseSessionRecord._init_$lambda$2(exerciseSessionRecord$sortedSegments$1, obj, obj2);
                }
            });
            int iA = yzp.a(listE);
            int i3 = 0;
            while (i3 < iA) {
                Instant endTime = ((ExerciseSegment) listE.get(i3)).getEndTime();
                i3++;
                if (endTime.isAfter(((ExerciseSegment) listE.get(i3)).getStartTime())) {
                    throw new IllegalArgumentException("segments can not overlap.".toString());
                }
            }
            if (((ExerciseSegment) yzp.i(listE)).getStartTime().isBefore(getStartTime())) {
                throw new IllegalArgumentException("segments can not be out of parent time range.".toString());
            }
            if (((ExerciseSegment) yzp.h(listE)).getEndTime().isAfter(getEndTime())) {
                throw new IllegalArgumentException("segments can not be out of parent time range.".toString());
            }
            Iterator it = listE.iterator();
            while (it.hasNext()) {
                if (!((ExerciseSegment) it.next()).isCompatibleWith$connect_client_release(this.exerciseType)) {
                    throw new IllegalArgumentException("segmentType and sessionType is not compatible.".toString());
                }
            }
        }
        if (!this.laps.isEmpty()) {
            List<ExerciseLap> list3 = this.laps;
            final ExerciseSessionRecord$sortedLaps$1 exerciseSessionRecord$sortedLaps$1 = new Function2<ExerciseLap, ExerciseLap, Integer>() { // from class: androidx.health.connect.client.records.ExerciseSessionRecord$sortedLaps$1
                @Override // kotlin.jvm.functions.Function2
                public final Integer invoke(ExerciseLap exerciseLap, ExerciseLap exerciseLap2) {
                    return Integer.valueOf(exerciseLap.getStartTime().compareTo(exerciseLap2.getStartTime()));
                }
            };
            List listE2 = yzp.e((Iterable) list3, new Comparator() { // from class: androidx.health.connect.client.records.ExerciseSessionRecord$$ExternalSyntheticLambda1
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return ExerciseSessionRecord._init_$lambda$7(exerciseSessionRecord$sortedLaps$1, obj, obj2);
                }
            });
            int iA2 = yzp.a(listE2);
            while (i2 < iA2) {
                Instant endTime2 = ((ExerciseLap) listE2.get(i2)).getEndTime();
                i2++;
                if (endTime2.isAfter(((ExerciseLap) listE2.get(i2)).getStartTime())) {
                    throw new IllegalArgumentException("laps can not overlap.".toString());
                }
            }
            if (((ExerciseLap) yzp.i(listE2)).getStartTime().isBefore(getStartTime())) {
                throw new IllegalArgumentException("laps can not be out of parent time range.".toString());
            }
            if (((ExerciseLap) yzp.h(listE2)).getEndTime().isAfter(getEndTime())) {
                throw new IllegalArgumentException("laps can not be out of parent time range.".toString());
            }
        }
        ExerciseRouteResult exerciseRouteResult2 = this.exerciseRouteResult;
        if (!(exerciseRouteResult2 instanceof ExerciseRouteResult.Data) || ((ExerciseRouteResult.Data) exerciseRouteResult2).getExerciseRoute().getRoute().isEmpty()) {
            return;
        }
        List<ExerciseRoute.Location> route = ((ExerciseRouteResult.Data) this.exerciseRouteResult).getExerciseRoute().getRoute();
        Iterator<T> it2 = route.iterator();
        if (!it2.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it2.next();
        if (it2.hasNext()) {
            Instant time = ((ExerciseRoute.Location) next).getTime();
            do {
                Object next2 = it2.next();
                Instant time2 = ((ExerciseRoute.Location) next2).getTime();
                if (time.compareTo(time2) > 0) {
                    next = next2;
                    time = time2;
                }
            } while (it2.hasNext());
        }
        Instant time3 = ((ExerciseRoute.Location) next).getTime();
        Iterator<T> it3 = route.iterator();
        if (!it3.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next3 = it3.next();
        if (it3.hasNext()) {
            Instant time4 = ((ExerciseRoute.Location) next3).getTime();
            do {
                Object next4 = it3.next();
                Instant time5 = ((ExerciseRoute.Location) next4).getTime();
                if (time4.compareTo(time5) < 0) {
                    next3 = next4;
                    time4 = time5;
                }
            } while (it3.hasNext());
        }
        Instant time6 = ((ExerciseRoute.Location) next3).getTime();
        if (time3.isBefore(getStartTime()) || !time6.isBefore(getEndTime())) {
            throw new IllegalArgumentException("route can not be out of parent time range.".toString());
        }
    }

    @Override // androidx.health.connect.client.records.IntervalRecord
    public Instant getStartTime() {
        return this.startTime;
    }

    @Override // androidx.health.connect.client.records.IntervalRecord
    public ZoneOffset getStartZoneOffset() {
        return this.startZoneOffset;
    }

    @Override // androidx.health.connect.client.records.IntervalRecord
    public Instant getEndTime() {
        return this.endTime;
    }

    @Override // androidx.health.connect.client.records.IntervalRecord
    public ZoneOffset getEndZoneOffset() {
        return this.endZoneOffset;
    }

    @Override // androidx.health.connect.client.records.Record
    public androidx.health.connect.client.records.metadata.Metadata getMetadata() {
        return this.metadata;
    }

    public final int getExerciseType() {
        return this.exerciseType;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getNotes() {
        return this.notes;
    }

    public /* synthetic */ ExerciseSessionRecord(Instant instant, ZoneOffset zoneOffset, Instant instant2, ZoneOffset zoneOffset2, androidx.health.connect.client.records.metadata.Metadata metadata, int i, String str, String str2, List list, List list2, ExerciseRouteResult exerciseRouteResult, String str3, int i2, zcm zcmVar) {
        this(instant, zoneOffset, instant2, zoneOffset2, metadata, i, (i2 & 64) != 0 ? null : str, (i2 & 128) != 0 ? null : str2, (List<ExerciseSegment>) ((i2 & 256) != 0 ? yzp.e() : list), (List<ExerciseLap>) ((i2 & 512) != 0 ? yzp.e() : list2), (i2 & 1024) != 0 ? new ExerciseRouteResult.NoData() : exerciseRouteResult, (i2 & 2048) != 0 ? null : str3);
    }

    public final List<ExerciseSegment> getSegments() {
        return this.segments;
    }

    public final List<ExerciseLap> getLaps() {
        return this.laps;
    }

    public final ExerciseRouteResult getExerciseRouteResult() {
        return this.exerciseRouteResult;
    }

    public final String getPlannedExerciseSessionId() {
        return this.plannedExerciseSessionId;
    }

    public /* synthetic */ ExerciseSessionRecord(Instant instant, ZoneOffset zoneOffset, Instant instant2, ZoneOffset zoneOffset2, androidx.health.connect.client.records.metadata.Metadata metadata, int i, String str, String str2, List list, List list2, ExerciseRoute exerciseRoute, String str3, int i2, zcm zcmVar) {
        this(instant, zoneOffset, instant2, zoneOffset2, metadata, i, (i2 & 64) != 0 ? null : str, (i2 & 128) != 0 ? null : str2, (List<ExerciseSegment>) ((i2 & 256) != 0 ? yzp.e() : list), (List<ExerciseLap>) ((i2 & 512) != 0 ? yzp.e() : list2), (i2 & 1024) != 0 ? null : exerciseRoute, (i2 & 2048) != 0 ? null : str3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ExerciseSessionRecord(Instant instant, ZoneOffset zoneOffset, Instant instant2, ZoneOffset zoneOffset2, androidx.health.connect.client.records.metadata.Metadata metadata, int i, String str, String str2, List<ExerciseSegment> list, List<ExerciseLap> list2, ExerciseRoute exerciseRoute, String str3) {
        this(instant, zoneOffset, instant2, zoneOffset2, metadata, i, str, str2, list, list2, exerciseRoute != null ? new ExerciseRouteResult.Data(exerciseRoute) : new ExerciseRouteResult.NoData(), str3);
        zcp.c(instant, "");
        zcp.c(instant2, "");
        zcp.c(metadata, "");
        zcp.c(list, "");
        zcp.c(list2, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int _init_$lambda$2(Function2 function2, Object obj, Object obj2) {
        return ((Number) function2.invoke(obj, obj2)).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int _init_$lambda$7(Function2 function2, Object obj, Object obj2) {
        return ((Number) function2.invoke(obj, obj2)).intValue();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExerciseSessionRecord)) {
            return false;
        }
        ExerciseSessionRecord exerciseSessionRecord = (ExerciseSessionRecord) other;
        return this.exerciseType == exerciseSessionRecord.exerciseType && zcp.b((Object) this.title, (Object) exerciseSessionRecord.title) && zcp.b((Object) this.notes, (Object) exerciseSessionRecord.notes) && zcp.b(getStartTime(), exerciseSessionRecord.getStartTime()) && zcp.b(getStartZoneOffset(), exerciseSessionRecord.getStartZoneOffset()) && zcp.b(getEndTime(), exerciseSessionRecord.getEndTime()) && zcp.b(getEndZoneOffset(), exerciseSessionRecord.getEndZoneOffset()) && zcp.b(getMetadata(), exerciseSessionRecord.getMetadata()) && zcp.b(this.segments, exerciseSessionRecord.segments) && zcp.b(this.laps, exerciseSessionRecord.laps) && zcp.b(this.exerciseRouteResult, exerciseSessionRecord.exerciseRouteResult);
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.exerciseType);
        String str = this.title;
        int iHashCode2 = str != null ? str.hashCode() : 0;
        String str2 = this.notes;
        int iHashCode3 = str2 != null ? str2.hashCode() : 0;
        ZoneOffset startZoneOffset = getStartZoneOffset();
        int iHashCode4 = startZoneOffset != null ? startZoneOffset.hashCode() : 0;
        int iHashCode5 = getEndTime().hashCode();
        ZoneOffset endZoneOffset = getEndZoneOffset();
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (endZoneOffset != null ? endZoneOffset.hashCode() : 0)) * 31) + getMetadata().hashCode()) * 31) + this.exerciseRouteResult.hashCode();
    }

    public String toString() {
        return "ExerciseSessionRecord(startTime=" + getStartTime() + ", startZoneOffset=" + getStartZoneOffset() + ", endTime=" + getEndTime() + ", endZoneOffset=" + getEndZoneOffset() + ", exerciseType=" + this.exerciseType + ", title=" + this.title + ", notes=" + this.notes + ", metadata=" + getMetadata() + ", segments=" + this.segments + ", laps=" + this.laps + ", exerciseRouteResult=" + this.exerciseRouteResult + g4.l;
    }

    static {
        Map<String, Integer> mapE = zae.e(yyz.c(WorkoutExercises.BACK_EXTENSION, 13), yyz.c("badminton", 2), yyz.c("barbell_shoulder_press", 70), yyz.c("baseball", 4), yyz.c("basketball", 5), yyz.c("bench_press", 70), yyz.c("bench_sit_up", 13), yyz.c(FitnessActivities.BIKING, 8), yyz.c("biking_stationary", 9), yyz.c("boot_camp", 10), yyz.c("boxing", 11), yyz.c(WorkoutExercises.BURPEE, 13), yyz.c("cricket", 14), yyz.c(WorkoutExercises.CRUNCH, 13), yyz.c("dancing", 16), yyz.c(WorkoutExercises.DEADLIFT, 70), yyz.c("dumbbell_curl_left_arm", 70), yyz.c("dumbbell_curl_right_arm", 70), yyz.c("dumbbell_front_raise", 70), yyz.c("dumbbell_lateral_raise", 70), yyz.c("dumbbell_triceps_extension_left_arm", 70), yyz.c("dumbbell_triceps_extension_right_arm", 70), yyz.c("dumbbell_triceps_extension_two_arm", 70), yyz.c("elliptical", 25), yyz.c("exercise_class", 26), yyz.c("fencing", 27), yyz.c("football_american", 28), yyz.c("football_australian", 29), yyz.c("forward_twist", 13), yyz.c(FitnessActivities.FRISBEE_DISC, 31), yyz.c(FitnessActivities.GOLF, 32), yyz.c("guided_breathing", 33), yyz.c("gymnastics", 34), yyz.c("handball", 35), yyz.c("hiking", 37), yyz.c(HiHealthActivities.ICE_HOCKEY, 38), yyz.c("ice_skating", 39), yyz.c(WorkoutExercises.JUMPING_JACK, 36), yyz.c(FitnessActivities.JUMP_ROPE, 36), yyz.c("lat_pull_down", 70), yyz.c(WorkoutExercises.LUNGE, 13), yyz.c("martial_arts", 44), yyz.c("paddling", 46), yyz.c("para_gliding", 47), yyz.c("pilates", 48), yyz.c(WorkoutExercises.PLANK, 13), yyz.c("racquetball", 50), yyz.c("rock_climbing", 51), yyz.c("roller_hockey", 52), yyz.c("rowing", 53), yyz.c("rowing_machine", 54), yyz.c("rugby", 55), yyz.c("running", 56), yyz.c("running_treadmill", 57), yyz.c("sailing", 58), yyz.c("scuba_diving", 59), yyz.c("skating", 60), yyz.c("skiing", 61), yyz.c("snowboarding", 62), yyz.c("snowshoeing", 63), yyz.c("soccer", 64), yyz.c("softball", 65), yyz.c("squash", 66), yyz.c(WorkoutExercises.SQUAT, 13), yyz.c("stair_climbing", 68), yyz.c("stair_climbing_machine", 69), yyz.c("stretching", 71), yyz.c("surfing", 72), yyz.c("swimming_open_water", 73), yyz.c("swimming_pool", 74), yyz.c("table_tennis", 75), yyz.c("tennis", 76), yyz.c("upper_twist", 13), yyz.c("volleyball", 78), yyz.c("walking", 79), yyz.c("water_polo", 80), yyz.c("weightlifting", 81), yyz.c("wheelchair", 82), yyz.c(NotificationCompat.CATEGORY_WORKOUT, 0), yyz.c("yoga", 83), yyz.c("calisthenics", 13), yyz.c("high_intensity_interval_training", 36), yyz.c("strength_training", 70));
        EXERCISE_TYPE_STRING_TO_INT_MAP = mapE;
        Set<Map.Entry<String, Integer>> setEntrySet = mapE.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(zdm.c(zae.e(yzp.e(setEntrySet, 10)), 16));
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(Integer.valueOf(((Number) entry.getValue()).intValue()), (String) entry.getKey());
        }
        EXERCISE_TYPE_INT_TO_STRING_MAP = linkedHashMap;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ExerciseSessionRecord(Instant instant, ZoneOffset zoneOffset, Instant instant2, ZoneOffset zoneOffset2, androidx.health.connect.client.records.metadata.Metadata metadata, int i, String str, String str2, List<ExerciseSegment> list, List<ExerciseLap> list2, ExerciseRoute exerciseRoute) {
        this(instant, zoneOffset, instant2, zoneOffset2, metadata, i, str, str2, list, list2, exerciseRoute, (String) null, 2048, (zcm) null);
        zcp.c(instant, "");
        zcp.c(instant2, "");
        zcp.c(metadata, "");
        zcp.c(list, "");
        zcp.c(list2, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ExerciseSessionRecord(Instant instant, ZoneOffset zoneOffset, Instant instant2, ZoneOffset zoneOffset2, androidx.health.connect.client.records.metadata.Metadata metadata, int i, String str, String str2, List<ExerciseSegment> list, List<ExerciseLap> list2) {
        this(instant, zoneOffset, instant2, zoneOffset2, metadata, i, str, str2, list, list2, (ExerciseRoute) null, (String) null, HealthData.ECG, (zcm) null);
        zcp.c(instant, "");
        zcp.c(instant2, "");
        zcp.c(metadata, "");
        zcp.c(list, "");
        zcp.c(list2, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ExerciseSessionRecord(Instant instant, ZoneOffset zoneOffset, Instant instant2, ZoneOffset zoneOffset2, androidx.health.connect.client.records.metadata.Metadata metadata, int i, String str, String str2, List<ExerciseSegment> list) {
        this(instant, zoneOffset, instant2, zoneOffset2, metadata, i, str, str2, list, (List) null, (ExerciseRoute) null, (String) null, RendererCapabilities.AUDIO_OFFLOAD_SUPPORT_MASK, (zcm) null);
        zcp.c(instant, "");
        zcp.c(instant2, "");
        zcp.c(metadata, "");
        zcp.c(list, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ExerciseSessionRecord(Instant instant, ZoneOffset zoneOffset, Instant instant2, ZoneOffset zoneOffset2, androidx.health.connect.client.records.metadata.Metadata metadata, int i, String str, String str2) {
        this(instant, zoneOffset, instant2, zoneOffset2, metadata, i, str, str2, (List) null, (List) null, (ExerciseRoute) null, (String) null, 3840, (zcm) null);
        zcp.c(instant, "");
        zcp.c(instant2, "");
        zcp.c(metadata, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ExerciseSessionRecord(Instant instant, ZoneOffset zoneOffset, Instant instant2, ZoneOffset zoneOffset2, androidx.health.connect.client.records.metadata.Metadata metadata, int i, String str) {
        this(instant, zoneOffset, instant2, zoneOffset2, metadata, i, str, (String) null, (List) null, (List) null, (ExerciseRoute) null, (String) null, Utf8.MASK_2BYTES, (zcm) null);
        zcp.c(instant, "");
        zcp.c(instant2, "");
        zcp.c(metadata, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ExerciseSessionRecord(Instant instant, ZoneOffset zoneOffset, Instant instant2, ZoneOffset zoneOffset2, androidx.health.connect.client.records.metadata.Metadata metadata, int i) {
        this(instant, zoneOffset, instant2, zoneOffset2, metadata, i, (String) null, (String) null, (List) null, (List) null, (ExerciseRoute) null, (String) null, 4032, (zcm) null);
        zcp.c(instant, "");
        zcp.c(instant2, "");
        zcp.c(metadata, "");
    }
}
