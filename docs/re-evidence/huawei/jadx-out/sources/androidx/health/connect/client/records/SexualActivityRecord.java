package androidx.health.connect.client.records;

import com.huawei.hms.network.embedded.g4;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import defpackage.yyz;
import defpackage.zae;
import defpackage.zcm;
import defpackage.zcp;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.time.Instant;
import java.time.ZoneOffset;
import java.util.Map;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u001d2\u00020\u0001:\u0003\u001d\u001e\u001fB+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\tH\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\b\u001a\u00020\t¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006 "}, d2 = {"Landroidx/health/connect/client/records/SexualActivityRecord;", "Landroidx/health/connect/client/records/InstantaneousRecord;", "time", "Ljava/time/Instant;", "zoneOffset", "Ljava/time/ZoneOffset;", "metadata", "Landroidx/health/connect/client/records/metadata/Metadata;", "protectionUsed", "", "<init>", "(Ljava/time/Instant;Ljava/time/ZoneOffset;Landroidx/health/connect/client/records/metadata/Metadata;I)V", "getTime", "()Ljava/time/Instant;", "getZoneOffset", "()Ljava/time/ZoneOffset;", "getMetadata", "()Landroidx/health/connect/client/records/metadata/Metadata;", "getProtectionUsed$annotations", "()V", "getProtectionUsed", "()I", "equals", "", "other", "", WatchFaceConstant.HASHCODE, "toString", "", "Companion", "Protection", "Protections", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SexualActivityRecord implements InstantaneousRecord {
    public static final Map<Integer, String> PROTECTION_USED_INT_TO_STRING_MAP;
    public static final int PROTECTION_USED_PROTECTED = 1;
    public static final Map<String, Integer> PROTECTION_USED_STRING_TO_INT_MAP;
    public static final int PROTECTION_USED_UNKNOWN = 0;
    public static final int PROTECTION_USED_UNPROTECTED = 2;
    private final androidx.health.connect.client.records.metadata.Metadata metadata;
    private final int protectionUsed;
    private final Instant time;
    private final ZoneOffset zoneOffset;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Landroidx/health/connect/client/records/SexualActivityRecord$Protections;", "", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface Protections {
    }

    public static /* synthetic */ void getProtectionUsed$annotations() {
    }

    public SexualActivityRecord(Instant instant, ZoneOffset zoneOffset, androidx.health.connect.client.records.metadata.Metadata metadata, int i) {
        zcp.c(instant, "");
        zcp.c(metadata, "");
        this.time = instant;
        this.zoneOffset = zoneOffset;
        this.metadata = metadata;
        this.protectionUsed = i;
    }

    public /* synthetic */ SexualActivityRecord(Instant instant, ZoneOffset zoneOffset, androidx.health.connect.client.records.metadata.Metadata metadata, int i, int i2, zcm zcmVar) {
        this(instant, zoneOffset, metadata, (i2 & 8) != 0 ? 0 : i);
    }

    @Override // androidx.health.connect.client.records.InstantaneousRecord
    public Instant getTime() {
        return this.time;
    }

    @Override // androidx.health.connect.client.records.InstantaneousRecord
    public ZoneOffset getZoneOffset() {
        return this.zoneOffset;
    }

    @Override // androidx.health.connect.client.records.Record
    public androidx.health.connect.client.records.metadata.Metadata getMetadata() {
        return this.metadata;
    }

    public final int getProtectionUsed() {
        return this.protectionUsed;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SexualActivityRecord)) {
            return false;
        }
        SexualActivityRecord sexualActivityRecord = (SexualActivityRecord) other;
        return this.protectionUsed == sexualActivityRecord.protectionUsed && zcp.b(getTime(), sexualActivityRecord.getTime()) && zcp.b(getZoneOffset(), sexualActivityRecord.getZoneOffset()) && zcp.b(getMetadata(), sexualActivityRecord.getMetadata());
    }

    public int hashCode() {
        int i = this.protectionUsed;
        int iHashCode = getTime().hashCode();
        ZoneOffset zoneOffset = getZoneOffset();
        return (((((i * 31) + iHashCode) * 31) + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31) + getMetadata().hashCode();
    }

    public String toString() {
        return "SexualActivityRecord(time=" + getTime() + ", zoneOffset=" + getZoneOffset() + ", protectionUsed=" + this.protectionUsed + ", metadata=" + getMetadata() + g4.l;
    }

    static {
        Map<String, Integer> mapE = zae.e(yyz.c(Protection.PROTECTED, 1), yyz.c(Protection.UNPROTECTED, 2));
        PROTECTION_USED_STRING_TO_INT_MAP = mapE;
        PROTECTION_USED_INT_TO_STRING_MAP = UtilsKt.reverse(mapE);
    }

    /* JADX INFO: loaded from: classes20.dex */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Landroidx/health/connect/client/records/SexualActivityRecord$Protection;", "", "<init>", "()V", "PROTECTED", "", "UNPROTECTED", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Protection {
        public static final Protection INSTANCE = new Protection();
        public static final String PROTECTED = "protected";
        public static final String UNPROTECTED = "unprotected";

        private Protection() {
        }
    }
}
