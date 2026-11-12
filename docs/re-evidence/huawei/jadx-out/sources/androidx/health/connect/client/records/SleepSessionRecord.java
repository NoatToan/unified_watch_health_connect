package androidx.health.connect.client.records;

import androidx.health.connect.client.aggregate.AggregateMetric;
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
import java.util.Set;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 &2\u00020\u0001:\u0003&'(B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0096\u0002J\b\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020\u000bH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006)"}, d2 = {"Landroidx/health/connect/client/records/SleepSessionRecord;", "Landroidx/health/connect/client/records/IntervalRecord;", "startTime", "Ljava/time/Instant;", "startZoneOffset", "Ljava/time/ZoneOffset;", "endTime", "endZoneOffset", "metadata", "Landroidx/health/connect/client/records/metadata/Metadata;", "title", "", "notes", "stages", "", "Landroidx/health/connect/client/records/SleepSessionRecord$Stage;", "<init>", "(Ljava/time/Instant;Ljava/time/ZoneOffset;Ljava/time/Instant;Ljava/time/ZoneOffset;Landroidx/health/connect/client/records/metadata/Metadata;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getStartTime", "()Ljava/time/Instant;", "getStartZoneOffset", "()Ljava/time/ZoneOffset;", "getEndTime", "getEndZoneOffset", "getMetadata", "()Landroidx/health/connect/client/records/metadata/Metadata;", "getTitle", "()Ljava/lang/String;", "getNotes", "getStages", "()Ljava/util/List;", "equals", "", "other", "", WatchFaceConstant.HASHCODE, "", "toString", "Companion", "StageTypes", "Stage", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SleepSessionRecord implements IntervalRecord {
    public static final AggregateMetric<Duration> SLEEP_DURATION_TOTAL = AggregateMetric.INSTANCE.durationMetric$connect_client_release("SleepSession");
    public static final int STAGE_TYPE_AWAKE = 1;
    public static final int STAGE_TYPE_AWAKE_IN_BED = 7;
    public static final int STAGE_TYPE_DEEP = 5;
    public static final Map<Integer, String> STAGE_TYPE_INT_TO_STRING_MAP;
    public static final int STAGE_TYPE_LIGHT = 4;
    public static final int STAGE_TYPE_OUT_OF_BED = 3;
    public static final int STAGE_TYPE_REM = 6;
    public static final int STAGE_TYPE_SLEEPING = 2;
    public static final Map<String, Integer> STAGE_TYPE_STRING_TO_INT_MAP;
    public static final int STAGE_TYPE_UNKNOWN = 0;
    private final Instant endTime;
    private final ZoneOffset endZoneOffset;
    private final androidx.health.connect.client.records.metadata.Metadata metadata;
    private final String notes;
    private final List<Stage> stages;
    private final Instant startTime;
    private final ZoneOffset startZoneOffset;
    private final String title;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Landroidx/health/connect/client/records/SleepSessionRecord$StageTypes;", "", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface StageTypes {
    }

    public SleepSessionRecord(Instant instant, ZoneOffset zoneOffset, Instant instant2, ZoneOffset zoneOffset2, androidx.health.connect.client.records.metadata.Metadata metadata, String str, String str2, List<Stage> list) {
        zcp.c(instant, "");
        zcp.c(instant2, "");
        zcp.c(metadata, "");
        zcp.c(list, "");
        this.startTime = instant;
        this.startZoneOffset = zoneOffset;
        this.endTime = instant2;
        this.endZoneOffset = zoneOffset2;
        this.metadata = metadata;
        this.title = str;
        this.notes = str2;
        this.stages = list;
        if (!getStartTime().isBefore(getEndTime())) {
            throw new IllegalArgumentException("startTime must be before endTime.".toString());
        }
        if (list.isEmpty()) {
            return;
        }
        final SleepSessionRecord$sortedStages$1 sleepSessionRecord$sortedStages$1 = new Function2<Stage, Stage, Integer>() { // from class: androidx.health.connect.client.records.SleepSessionRecord$sortedStages$1
            @Override // kotlin.jvm.functions.Function2
            public final Integer invoke(SleepSessionRecord.Stage stage, SleepSessionRecord.Stage stage2) {
                return Integer.valueOf(stage.getStartTime().compareTo(stage2.getStartTime()));
            }
        };
        List listE = yzp.e((Iterable) list, new Comparator() { // from class: androidx.health.connect.client.records.SleepSessionRecord$$ExternalSyntheticLambda0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return SleepSessionRecord._init_$lambda$1(sleepSessionRecord$sortedStages$1, obj, obj2);
            }
        });
        int iA = yzp.a(listE);
        int i = 0;
        while (i < iA) {
            Instant endTime = ((Stage) listE.get(i)).getEndTime();
            i++;
            if (endTime.isAfter(((Stage) listE.get(i)).getStartTime())) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        }
        if (((Stage) yzp.i(listE)).getStartTime().isBefore(getStartTime())) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (((Stage) yzp.h(listE)).getEndTime().isAfter(getEndTime())) {
            throw new IllegalArgumentException("Failed requirement.".toString());
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

    public final String getTitle() {
        return this.title;
    }

    public final String getNotes() {
        return this.notes;
    }

    public /* synthetic */ SleepSessionRecord(Instant instant, ZoneOffset zoneOffset, Instant instant2, ZoneOffset zoneOffset2, androidx.health.connect.client.records.metadata.Metadata metadata, String str, String str2, List list, int i, zcm zcmVar) {
        this(instant, zoneOffset, instant2, zoneOffset2, metadata, (i & 32) != 0 ? null : str, (i & 64) != 0 ? null : str2, (i & 128) != 0 ? yzp.e() : list);
    }

    public final List<Stage> getStages() {
        return this.stages;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int _init_$lambda$1(Function2 function2, Object obj, Object obj2) {
        return ((Number) function2.invoke(obj, obj2)).intValue();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SleepSessionRecord)) {
            return false;
        }
        SleepSessionRecord sleepSessionRecord = (SleepSessionRecord) other;
        return zcp.b((Object) this.title, (Object) sleepSessionRecord.title) && zcp.b((Object) this.notes, (Object) sleepSessionRecord.notes) && zcp.b(this.stages, sleepSessionRecord.stages) && zcp.b(getStartTime(), sleepSessionRecord.getStartTime()) && zcp.b(getStartZoneOffset(), sleepSessionRecord.getStartZoneOffset()) && zcp.b(getEndTime(), sleepSessionRecord.getEndTime()) && zcp.b(getEndZoneOffset(), sleepSessionRecord.getEndZoneOffset()) && zcp.b(getMetadata(), sleepSessionRecord.getMetadata());
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = str != null ? str.hashCode() : 0;
        String str2 = this.notes;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        int iHashCode3 = this.stages.hashCode();
        ZoneOffset startZoneOffset = getStartZoneOffset();
        int iHashCode4 = startZoneOffset != null ? startZoneOffset.hashCode() : 0;
        int iHashCode5 = getEndTime().hashCode();
        ZoneOffset endZoneOffset = getEndZoneOffset();
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (endZoneOffset != null ? endZoneOffset.hashCode() : 0)) * 31) + getMetadata().hashCode();
    }

    public String toString() {
        return "SleepSessionRecord(startTime=" + getStartTime() + ", startZoneOffset=" + getStartZoneOffset() + ", endTime=" + getEndTime() + ", endZoneOffset=" + getEndZoneOffset() + ", title=" + this.title + ", notes=" + this.notes + ", stages=" + this.stages + ", metadata=" + getMetadata() + g4.l;
    }

    static {
        Map<String, Integer> mapE = zae.e(yyz.c("awake", 1), yyz.c("sleeping", 2), yyz.c("out_of_bed", 3), yyz.c(CervicalMucusRecord.Sensation.LIGHT, 4), yyz.c("deep", 5), yyz.c("rem", 6), yyz.c("awake_in_bed", 7), yyz.c("unknown", 0));
        STAGE_TYPE_STRING_TO_INT_MAP = mapE;
        Set<Map.Entry<String, Integer>> setEntrySet = mapE.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(zdm.c(zae.e(yzp.e(setEntrySet, 10)), 16));
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(Integer.valueOf(((Number) entry.getValue()).intValue()), (String) entry.getKey());
        }
        STAGE_TYPE_INT_TO_STRING_MAP = linkedHashMap;
    }

    /* JADX INFO: loaded from: classes3.dex */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0013\u001a\u00020\u0006H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0017\u0010\u0005\u001a\u00020\u0006¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0016"}, d2 = {"Landroidx/health/connect/client/records/SleepSessionRecord$Stage;", "", "startTime", "Ljava/time/Instant;", "endTime", "stage", "", "<init>", "(Ljava/time/Instant;Ljava/time/Instant;I)V", "getStartTime", "()Ljava/time/Instant;", "getEndTime", "getStage$annotations", "()V", "getStage", "()I", "equals", "", "other", WatchFaceConstant.HASHCODE, "toString", "", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Stage {
        private final Instant endTime;
        private final int stage;
        private final Instant startTime;

        public static /* synthetic */ void getStage$annotations() {
        }

        public Stage(Instant instant, Instant instant2, int i) {
            zcp.c(instant, "");
            zcp.c(instant2, "");
            this.startTime = instant;
            this.endTime = instant2;
            this.stage = i;
            if (!instant.isBefore(instant2)) {
                throw new IllegalArgumentException("startTime must be before endTime.".toString());
            }
        }

        public final Instant getStartTime() {
            return this.startTime;
        }

        public final Instant getEndTime() {
            return this.endTime;
        }

        public final int getStage() {
            return this.stage;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Stage)) {
                return false;
            }
            Stage stage = (Stage) other;
            return this.stage == stage.stage && zcp.b(this.startTime, stage.startTime) && zcp.b(this.endTime, stage.endTime);
        }

        public int hashCode() {
            return (((Integer.hashCode(this.stage) * 31) + this.startTime.hashCode()) * 31) + this.endTime.hashCode();
        }

        public String toString() {
            return "Stage(startTime=" + this.startTime + ", endTime=" + this.endTime + ", stage=" + this.stage + g4.l;
        }
    }
}
