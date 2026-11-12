package androidx.health.connect.client.records;

import androidx.media3.exoplayer.RendererCapabilities;
import com.huawei.hms.network.embedded.g4;
import com.huawei.operation.utils.Constants;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import defpackage.zcm;
import defpackage.zcp;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.temporal.TemporalAmount;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 52\u00020\u0001:\u00015Bu\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0015\u0010\u0016Bc\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0015\u0010\u0017BO\b\u0017\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0015\u0010\u001cJ\u0013\u00100\u001a\u00020\u000b2\b\u00101\u001a\u0004\u0018\u000102H\u0096\u0002J\b\u00103\u001a\u00020\rH\u0016J\b\u00104\u001a\u00020\u000fH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0014\u0010\u0006\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001eR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010 R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\n\u001a\u00020\u000b8G¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010%R\u0017\u0010\f\u001a\u00020\r¢\u0006\u000e\n\u0000\u0012\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b.\u0010+R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b/\u0010+¨\u00066"}, d2 = {"Landroidx/health/connect/client/records/PlannedExerciseSessionRecord;", "Landroidx/health/connect/client/records/IntervalRecord;", "startTime", "Ljava/time/Instant;", "startZoneOffset", "Ljava/time/ZoneOffset;", "endTime", "endZoneOffset", "metadata", "Landroidx/health/connect/client/records/metadata/Metadata;", "hasExplicitTime", "", "exerciseType", "", "completedExerciseSessionId", "", "blocks", "", "Landroidx/health/connect/client/records/PlannedExerciseBlock;", "title", "notes", "<init>", "(Ljava/time/Instant;Ljava/time/ZoneOffset;Ljava/time/Instant;Ljava/time/ZoneOffset;Landroidx/health/connect/client/records/metadata/Metadata;ZILjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "(Ljava/time/Instant;Ljava/time/ZoneOffset;Ljava/time/Instant;Ljava/time/ZoneOffset;Landroidx/health/connect/client/records/metadata/Metadata;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;)V", Constants.START_DATE, "Ljava/time/LocalDate;", "duration", "Ljava/time/Duration;", "(Landroidx/health/connect/client/records/metadata/Metadata;Ljava/time/LocalDate;Ljava/time/Duration;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;)V", "getStartTime", "()Ljava/time/Instant;", "getStartZoneOffset", "()Ljava/time/ZoneOffset;", "getEndTime", "getEndZoneOffset", "getMetadata", "()Landroidx/health/connect/client/records/metadata/Metadata;", "()Z", "getExerciseType$annotations", "()V", "getExerciseType", "()I", "getCompletedExerciseSessionId", "()Ljava/lang/String;", "getBlocks", "()Ljava/util/List;", "getTitle", "getNotes", "equals", "other", "", WatchFaceConstant.HASHCODE, "toString", "Companion", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PlannedExerciseSessionRecord implements IntervalRecord {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final List<PlannedExerciseBlock> blocks;
    private final String completedExerciseSessionId;
    private final Instant endTime;
    private final ZoneOffset endZoneOffset;
    private final int exerciseType;
    private final boolean hasExplicitTime;
    private final androidx.health.connect.client.records.metadata.Metadata metadata;
    private final String notes;
    private final Instant startTime;
    private final ZoneOffset startZoneOffset;
    private final String title;

    public static /* synthetic */ void getExerciseType$annotations() {
    }

    public PlannedExerciseSessionRecord(Instant instant, ZoneOffset zoneOffset, Instant instant2, ZoneOffset zoneOffset2, androidx.health.connect.client.records.metadata.Metadata metadata, boolean z, int i, String str, List<PlannedExerciseBlock> list, String str2, String str3) {
        zcp.c(instant, "");
        zcp.c(instant2, "");
        zcp.c(metadata, "");
        zcp.c(list, "");
        this.startTime = instant;
        this.startZoneOffset = zoneOffset;
        this.endTime = instant2;
        this.endZoneOffset = zoneOffset2;
        this.metadata = metadata;
        this.hasExplicitTime = z;
        this.exerciseType = i;
        this.completedExerciseSessionId = str;
        this.blocks = list;
        this.title = str2;
        this.notes = str3;
        if (!getStartTime().isBefore(getEndTime())) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    public /* synthetic */ PlannedExerciseSessionRecord(Instant instant, ZoneOffset zoneOffset, Instant instant2, ZoneOffset zoneOffset2, androidx.health.connect.client.records.metadata.Metadata metadata, boolean z, int i, String str, List list, String str2, String str3, int i2, zcm zcmVar) {
        this(instant, zoneOffset, instant2, zoneOffset2, metadata, z, i, str, (List<PlannedExerciseBlock>) list, (i2 & 512) != 0 ? null : str2, (i2 & 1024) != 0 ? null : str3);
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

    /* JADX INFO: renamed from: hasExplicitTime, reason: from getter */
    public final boolean getHasExplicitTime() {
        return this.hasExplicitTime;
    }

    public final int getExerciseType() {
        return this.exerciseType;
    }

    public final String getCompletedExerciseSessionId() {
        return this.completedExerciseSessionId;
    }

    public final List<PlannedExerciseBlock> getBlocks() {
        return this.blocks;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getNotes() {
        return this.notes;
    }

    public /* synthetic */ PlannedExerciseSessionRecord(Instant instant, ZoneOffset zoneOffset, Instant instant2, ZoneOffset zoneOffset2, androidx.health.connect.client.records.metadata.Metadata metadata, List list, int i, String str, String str2, int i2, zcm zcmVar) {
        this(instant, zoneOffset, instant2, zoneOffset2, metadata, (List<PlannedExerciseBlock>) list, i, (i2 & 128) != 0 ? null : str, (i2 & 256) != 0 ? null : str2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PlannedExerciseSessionRecord(Instant instant, ZoneOffset zoneOffset, Instant instant2, ZoneOffset zoneOffset2, androidx.health.connect.client.records.metadata.Metadata metadata, List<PlannedExerciseBlock> list, int i, String str, String str2) {
        this(instant, zoneOffset, instant2, zoneOffset2, metadata, true, i, (String) null, list, str, str2);
        zcp.c(instant, "");
        zcp.c(instant2, "");
        zcp.c(metadata, "");
        zcp.c(list, "");
    }

    public /* synthetic */ PlannedExerciseSessionRecord(androidx.health.connect.client.records.metadata.Metadata metadata, LocalDate localDate, Duration duration, List list, int i, String str, String str2, int i2, zcm zcmVar) {
        this(metadata, localDate, duration, (List<PlannedExerciseBlock>) list, i, (i2 & 32) != 0 ? null : str, (i2 & 64) != 0 ? null : str2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PlannedExerciseSessionRecord(androidx.health.connect.client.records.metadata.Metadata metadata, LocalDate localDate, Duration duration, List<PlannedExerciseBlock> list, int i, String str, String str2) {
        zcp.c(metadata, "");
        zcp.c(localDate, "");
        zcp.c(duration, "");
        zcp.c(list, "");
        Companion companion = INSTANCE;
        Instant physicalTimeAtNoon = companion.toPhysicalTimeAtNoon(localDate);
        ZoneOffset offset = companion.getOffset(companion.toPhysicalTimeAtNoon(localDate));
        Duration duration2 = duration;
        Instant instantPlus = companion.toPhysicalTimeAtNoon(localDate).plus((TemporalAmount) duration2);
        zcp.b((Object) instantPlus, "");
        Instant instantPlus2 = companion.toPhysicalTimeAtNoon(localDate).plus((TemporalAmount) duration2);
        zcp.b((Object) instantPlus2, "");
        this(physicalTimeAtNoon, offset, instantPlus, companion.getOffset(instantPlus2), metadata, false, i, (String) null, list, str, str2);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlannedExerciseSessionRecord)) {
            return false;
        }
        PlannedExerciseSessionRecord plannedExerciseSessionRecord = (PlannedExerciseSessionRecord) other;
        return zcp.b(getStartTime(), plannedExerciseSessionRecord.getStartTime()) && zcp.b(getStartZoneOffset(), plannedExerciseSessionRecord.getStartZoneOffset()) && zcp.b(getEndTime(), plannedExerciseSessionRecord.getEndTime()) && zcp.b(getEndZoneOffset(), plannedExerciseSessionRecord.getEndZoneOffset()) && this.hasExplicitTime == plannedExerciseSessionRecord.hasExplicitTime && zcp.b(this.blocks, plannedExerciseSessionRecord.blocks) && zcp.b((Object) this.title, (Object) plannedExerciseSessionRecord.title) && zcp.b((Object) this.notes, (Object) plannedExerciseSessionRecord.notes) && this.exerciseType == plannedExerciseSessionRecord.exerciseType && zcp.b(getMetadata(), plannedExerciseSessionRecord.getMetadata());
    }

    public int hashCode() {
        int iHashCode = getStartTime().hashCode();
        ZoneOffset startZoneOffset = getStartZoneOffset();
        int iHashCode2 = startZoneOffset != null ? startZoneOffset.hashCode() : 0;
        int iHashCode3 = getEndTime().hashCode();
        ZoneOffset endZoneOffset = getEndZoneOffset();
        int iHashCode4 = endZoneOffset != null ? endZoneOffset.hashCode() : 0;
        int iHashCode5 = Boolean.hashCode(this.hasExplicitTime);
        int iHashCode6 = this.blocks.hashCode();
        String str = this.title;
        int iHashCode7 = str != null ? str.hashCode() : 0;
        String str2 = this.notes;
        int iHashCode8 = str2 != null ? str2.hashCode() : 0;
        int i = this.exerciseType;
        String str3 = this.completedExerciseSessionId;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + i) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + getMetadata().hashCode();
    }

    public String toString() {
        return "PlannedExerciseSessionRecord(startTime=" + getStartTime() + ", startZoneOffset=" + getStartZoneOffset() + ", endTime=" + getEndTime() + ", endZoneOffset=" + getEndZoneOffset() + ", hasExplicitTime=" + this.hasExplicitTime + ", title=" + this.title + ", notes=" + this.notes + ", exerciseType=" + this.exerciseType + ", completedExerciseSessionId=" + this.completedExerciseSessionId + ", metadata=" + getMetadata() + ", blocks=" + this.blocks + g4.l;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\u00020\u0005*\u00020\u0006H\u0002J\f\u0010\u0007\u001a\u00020\b*\u00020\u0005H\u0002¨\u0006\t"}, d2 = {"Landroidx/health/connect/client/records/PlannedExerciseSessionRecord$Companion;", "", "<init>", "()V", "toPhysicalTimeAtNoon", "Ljava/time/Instant;", "Ljava/time/LocalDate;", "getOffset", "Ljava/time/ZoneOffset;", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Type inference failed for: r2v2, types: [java.time.ZonedDateTime] */
        public final Instant toPhysicalTimeAtNoon(LocalDate localDate) {
            Instant instant = localDate.atTime(LocalTime.NOON).atZone(ZoneId.systemDefault()).toInstant();
            zcp.b((Object) instant, "");
            return instant;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final ZoneOffset getOffset(Instant instant) {
            ZoneOffset offset = ZoneOffset.systemDefault().getRules().getOffset(instant);
            zcp.b((Object) offset, "");
            return offset;
        }

        public /* synthetic */ Companion(zcm zcmVar) {
            this();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PlannedExerciseSessionRecord(Instant instant, ZoneOffset zoneOffset, Instant instant2, ZoneOffset zoneOffset2, androidx.health.connect.client.records.metadata.Metadata metadata, List<PlannedExerciseBlock> list, int i, String str) {
        this(instant, zoneOffset, instant2, zoneOffset2, metadata, list, i, str, (String) null, 256, (zcm) null);
        zcp.c(instant, "");
        zcp.c(instant2, "");
        zcp.c(metadata, "");
        zcp.c(list, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PlannedExerciseSessionRecord(Instant instant, ZoneOffset zoneOffset, Instant instant2, ZoneOffset zoneOffset2, androidx.health.connect.client.records.metadata.Metadata metadata, List<PlannedExerciseBlock> list, int i) {
        this(instant, zoneOffset, instant2, zoneOffset2, metadata, list, i, (String) null, (String) null, RendererCapabilities.DECODER_SUPPORT_MASK, (zcm) null);
        zcp.c(instant, "");
        zcp.c(instant2, "");
        zcp.c(metadata, "");
        zcp.c(list, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PlannedExerciseSessionRecord(androidx.health.connect.client.records.metadata.Metadata metadata, LocalDate localDate, Duration duration, List<PlannedExerciseBlock> list, int i, String str) {
        this(metadata, localDate, duration, list, i, str, (String) null, 64, (zcm) null);
        zcp.c(metadata, "");
        zcp.c(localDate, "");
        zcp.c(duration, "");
        zcp.c(list, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PlannedExerciseSessionRecord(androidx.health.connect.client.records.metadata.Metadata metadata, LocalDate localDate, Duration duration, List<PlannedExerciseBlock> list, int i) {
        this(metadata, localDate, duration, list, i, (String) null, (String) null, 96, (zcm) null);
        zcp.c(metadata, "");
        zcp.c(localDate, "");
        zcp.c(duration, "");
        zcp.c(list, "");
    }
}
