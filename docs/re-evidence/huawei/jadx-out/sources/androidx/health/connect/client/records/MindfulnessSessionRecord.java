package androidx.health.connect.client.records;

import androidx.health.connect.client.aggregate.AggregateMetric;
import com.huawei.hms.network.embedded.g4;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import defpackage.yyz;
import defpackage.zae;
import defpackage.zcm;
import defpackage.zcp;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.time.Duration;
import java.time.Instant;
import java.time.ZoneOffset;
import java.util.Map;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 &2\u00020\u0001:\u0002&'BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0096\u0002J\b\u0010$\u001a\u00020\u000bH\u0016J\b\u0010%\u001a\u00020\rH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\n\u001a\u00020\u000b¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001e¨\u0006("}, d2 = {"Landroidx/health/connect/client/records/MindfulnessSessionRecord;", "Landroidx/health/connect/client/records/IntervalRecord;", "startTime", "Ljava/time/Instant;", "startZoneOffset", "Ljava/time/ZoneOffset;", "endTime", "endZoneOffset", "metadata", "Landroidx/health/connect/client/records/metadata/Metadata;", "mindfulnessSessionType", "", "title", "", "notes", "<init>", "(Ljava/time/Instant;Ljava/time/ZoneOffset;Ljava/time/Instant;Ljava/time/ZoneOffset;Landroidx/health/connect/client/records/metadata/Metadata;ILjava/lang/String;Ljava/lang/String;)V", "getStartTime", "()Ljava/time/Instant;", "getStartZoneOffset", "()Ljava/time/ZoneOffset;", "getEndTime", "getEndZoneOffset", "getMetadata", "()Landroidx/health/connect/client/records/metadata/Metadata;", "getMindfulnessSessionType$annotations", "()V", "getMindfulnessSessionType", "()I", "getTitle", "()Ljava/lang/String;", "getNotes", "equals", "", "other", "", WatchFaceConstant.HASHCODE, "toString", "Companion", "MindfulnessSessionTypes", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MindfulnessSessionRecord implements IntervalRecord {
    public static final AggregateMetric<Duration> MINDFULNESS_DURATION_TOTAL = AggregateMetric.INSTANCE.durationMetric$connect_client_release("MindfulnessSession");
    public static final int MINDFULNESS_SESSION_TYPE_BREATHING = 2;
    public static final Map<Integer, String> MINDFULNESS_SESSION_TYPE_INT_TO_STRING_MAP;
    public static final int MINDFULNESS_SESSION_TYPE_MEDITATION = 1;
    public static final int MINDFULNESS_SESSION_TYPE_MOVEMENT = 4;
    public static final int MINDFULNESS_SESSION_TYPE_MUSIC = 3;
    public static final Map<String, Integer> MINDFULNESS_SESSION_TYPE_STRING_TO_INT_MAP;
    public static final int MINDFULNESS_SESSION_TYPE_UNGUIDED = 5;
    public static final int MINDFULNESS_SESSION_TYPE_UNKNOWN = 0;
    private final Instant endTime;
    private final ZoneOffset endZoneOffset;
    private final androidx.health.connect.client.records.metadata.Metadata metadata;
    private final int mindfulnessSessionType;
    private final String notes;
    private final Instant startTime;
    private final ZoneOffset startZoneOffset;
    private final String title;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Landroidx/health/connect/client/records/MindfulnessSessionRecord$MindfulnessSessionTypes;", "", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface MindfulnessSessionTypes {
    }

    public static /* synthetic */ void getMindfulnessSessionType$annotations() {
    }

    public MindfulnessSessionRecord(Instant instant, ZoneOffset zoneOffset, Instant instant2, ZoneOffset zoneOffset2, androidx.health.connect.client.records.metadata.Metadata metadata, int i, String str, String str2) {
        zcp.c(instant, "");
        zcp.c(instant2, "");
        zcp.c(metadata, "");
        this.startTime = instant;
        this.startZoneOffset = zoneOffset;
        this.endTime = instant2;
        this.endZoneOffset = zoneOffset2;
        this.metadata = metadata;
        this.mindfulnessSessionType = i;
        this.title = str;
        this.notes = str2;
        if (!getStartTime().isBefore(getEndTime())) {
            throw new IllegalArgumentException("startTime must be before endTime.".toString());
        }
    }

    public /* synthetic */ MindfulnessSessionRecord(Instant instant, ZoneOffset zoneOffset, Instant instant2, ZoneOffset zoneOffset2, androidx.health.connect.client.records.metadata.Metadata metadata, int i, String str, String str2, int i2, zcm zcmVar) {
        this(instant, zoneOffset, instant2, zoneOffset2, metadata, i, (i2 & 64) != 0 ? null : str, (i2 & 128) != 0 ? null : str2);
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

    public final int getMindfulnessSessionType() {
        return this.mindfulnessSessionType;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getNotes() {
        return this.notes;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MindfulnessSessionRecord)) {
            return false;
        }
        MindfulnessSessionRecord mindfulnessSessionRecord = (MindfulnessSessionRecord) other;
        return this.mindfulnessSessionType == mindfulnessSessionRecord.mindfulnessSessionType && zcp.b((Object) this.title, (Object) mindfulnessSessionRecord.title) && zcp.b((Object) this.notes, (Object) mindfulnessSessionRecord.notes) && zcp.b(getStartTime(), mindfulnessSessionRecord.getStartTime()) && zcp.b(getStartZoneOffset(), mindfulnessSessionRecord.getStartZoneOffset()) && zcp.b(getEndTime(), mindfulnessSessionRecord.getEndTime()) && zcp.b(getEndZoneOffset(), mindfulnessSessionRecord.getEndZoneOffset()) && zcp.b(getMetadata(), mindfulnessSessionRecord.getMetadata());
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.mindfulnessSessionType);
        String str = this.title;
        int iHashCode2 = str != null ? str.hashCode() : 0;
        String str2 = this.notes;
        int iHashCode3 = str2 != null ? str2.hashCode() : 0;
        ZoneOffset startZoneOffset = getStartZoneOffset();
        int iHashCode4 = startZoneOffset != null ? startZoneOffset.hashCode() : 0;
        int iHashCode5 = getEndTime().hashCode();
        ZoneOffset endZoneOffset = getEndZoneOffset();
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (endZoneOffset != null ? endZoneOffset.hashCode() : 0)) * 31) + getMetadata().hashCode();
    }

    public String toString() {
        return "MindfulnessSessionRecord(startTime=" + getStartTime() + ", startZoneOffset=" + getStartZoneOffset() + ", endTime=" + getEndTime() + ", endZoneOffset=" + getEndZoneOffset() + ", mindfulnessSessionType=" + this.mindfulnessSessionType + ", title=" + this.title + ", notes=" + this.notes + ", metadata=" + getMetadata() + g4.l;
    }

    static {
        Map<String, Integer> mapE = zae.e(yyz.c("breathing", 2), yyz.c("meditation", 1), yyz.c("movement", 4), yyz.c("music", 3), yyz.c("unguided", 5), yyz.c("unknown", 0));
        MINDFULNESS_SESSION_TYPE_STRING_TO_INT_MAP = mapE;
        MINDFULNESS_SESSION_TYPE_INT_TO_STRING_MAP = UtilsKt.reverse(mapE);
    }
}
