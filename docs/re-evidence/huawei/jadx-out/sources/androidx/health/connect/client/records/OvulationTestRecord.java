package androidx.health.connect.client.records;

import com.huawei.hms.network.embedded.g4;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import defpackage.yyz;
import defpackage.zae;
import defpackage.zcp;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.time.Instant;
import java.time.ZoneOffset;
import java.util.Map;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u001e2\u00020\u0001:\u0003\u001d\u001e\u001fB)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u0007H\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u0007¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006 "}, d2 = {"Landroidx/health/connect/client/records/OvulationTestRecord;", "Landroidx/health/connect/client/records/InstantaneousRecord;", "time", "Ljava/time/Instant;", "zoneOffset", "Ljava/time/ZoneOffset;", "result", "", "metadata", "Landroidx/health/connect/client/records/metadata/Metadata;", "<init>", "(Ljava/time/Instant;Ljava/time/ZoneOffset;ILandroidx/health/connect/client/records/metadata/Metadata;)V", "getTime", "()Ljava/time/Instant;", "getZoneOffset", "()Ljava/time/ZoneOffset;", "getResult$annotations", "()V", "getResult", "()I", "getMetadata", "()Landroidx/health/connect/client/records/metadata/Metadata;", "equals", "", "other", "", WatchFaceConstant.HASHCODE, "toString", "", "Result", "Companion", "Results", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OvulationTestRecord implements InstantaneousRecord {
    public static final int RESULT_HIGH = 2;
    public static final int RESULT_INCONCLUSIVE = 0;
    public static final Map<Integer, String> RESULT_INT_TO_STRING_MAP;
    public static final int RESULT_NEGATIVE = 3;
    public static final int RESULT_POSITIVE = 1;
    public static final Map<String, Integer> RESULT_STRING_TO_INT_MAP;
    private final androidx.health.connect.client.records.metadata.Metadata metadata;
    private final int result;
    private final Instant time;
    private final ZoneOffset zoneOffset;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Landroidx/health/connect/client/records/OvulationTestRecord$Results;", "", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface Results {
    }

    public static /* synthetic */ void getResult$annotations() {
    }

    public OvulationTestRecord(Instant instant, ZoneOffset zoneOffset, int i, androidx.health.connect.client.records.metadata.Metadata metadata) {
        zcp.c(instant, "");
        zcp.c(metadata, "");
        this.time = instant;
        this.zoneOffset = zoneOffset;
        this.result = i;
        this.metadata = metadata;
    }

    @Override // androidx.health.connect.client.records.InstantaneousRecord
    public Instant getTime() {
        return this.time;
    }

    @Override // androidx.health.connect.client.records.InstantaneousRecord
    public ZoneOffset getZoneOffset() {
        return this.zoneOffset;
    }

    public final int getResult() {
        return this.result;
    }

    @Override // androidx.health.connect.client.records.Record
    public androidx.health.connect.client.records.metadata.Metadata getMetadata() {
        return this.metadata;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OvulationTestRecord)) {
            return false;
        }
        OvulationTestRecord ovulationTestRecord = (OvulationTestRecord) other;
        return this.result == ovulationTestRecord.result && zcp.b(getTime(), ovulationTestRecord.getTime()) && zcp.b(getZoneOffset(), ovulationTestRecord.getZoneOffset()) && zcp.b(getMetadata(), ovulationTestRecord.getMetadata());
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.result);
        int iHashCode2 = getTime().hashCode();
        ZoneOffset zoneOffset = getZoneOffset();
        return (((((iHashCode * 31) + iHashCode2) * 31) + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31) + getMetadata().hashCode();
    }

    public String toString() {
        return "OvulationTestRecord(time=" + getTime() + ", zoneOffset=" + getZoneOffset() + ", result=" + this.result + ", metadata=" + getMetadata() + g4.l;
    }

    /* JADX INFO: loaded from: classes20.dex */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Landroidx/health/connect/client/records/OvulationTestRecord$Result;", "", "<init>", "()V", "POSITIVE", "", "HIGH", "NEGATIVE", "INCONCLUSIVE", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Result {
        public static final String HIGH = "high";
        public static final String INCONCLUSIVE = "inconclusive";
        public static final Result INSTANCE = new Result();
        public static final String NEGATIVE = "negative";
        public static final String POSITIVE = "positive";

        private Result() {
        }
    }

    static {
        Map<String, Integer> mapE = zae.e(yyz.c(Result.INCONCLUSIVE, 0), yyz.c(Result.POSITIVE, 1), yyz.c("high", 2), yyz.c(Result.NEGATIVE, 3));
        RESULT_STRING_TO_INT_MAP = mapE;
        RESULT_INT_TO_STRING_MAP = UtilsKt.reverse(mapE);
    }
}
