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
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000  2\u00020\u0001:\u0005 !\"#$B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0096\u0002J\b\u0010\u001d\u001a\u00020\tH\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\b\u001a\u00020\t¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\n\u001a\u00020\t¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016¨\u0006%"}, d2 = {"Landroidx/health/connect/client/records/CervicalMucusRecord;", "Landroidx/health/connect/client/records/InstantaneousRecord;", "time", "Ljava/time/Instant;", "zoneOffset", "Ljava/time/ZoneOffset;", "metadata", "Landroidx/health/connect/client/records/metadata/Metadata;", "appearance", "", "sensation", "<init>", "(Ljava/time/Instant;Ljava/time/ZoneOffset;Landroidx/health/connect/client/records/metadata/Metadata;II)V", "getTime", "()Ljava/time/Instant;", "getZoneOffset", "()Ljava/time/ZoneOffset;", "getMetadata", "()Landroidx/health/connect/client/records/metadata/Metadata;", "getAppearance$annotations", "()V", "getAppearance", "()I", "getSensation$annotations", "getSensation", "equals", "", "other", "", WatchFaceConstant.HASHCODE, "toString", "", "Companion", "Sensation", "Sensations", "Appearance", "Appearances", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CervicalMucusRecord implements InstantaneousRecord {
    public static final int APPEARANCE_CREAMY = 3;
    public static final int APPEARANCE_DRY = 1;
    public static final int APPEARANCE_EGG_WHITE = 5;
    public static final Map<Integer, String> APPEARANCE_INT_TO_STRING_MAP;
    public static final int APPEARANCE_STICKY = 2;
    public static final Map<String, Integer> APPEARANCE_STRING_TO_INT_MAP;
    public static final int APPEARANCE_UNKNOWN = 0;
    public static final int APPEARANCE_UNUSUAL = 6;
    public static final int APPEARANCE_WATERY = 4;
    public static final int SENSATION_HEAVY = 3;
    public static final Map<Integer, String> SENSATION_INT_TO_STRING_MAP;
    public static final int SENSATION_LIGHT = 1;
    public static final int SENSATION_MEDIUM = 2;
    public static final Map<String, Integer> SENSATION_STRING_TO_INT_MAP;
    public static final int SENSATION_UNKNOWN = 0;
    private final int appearance;
    private final androidx.health.connect.client.records.metadata.Metadata metadata;
    private final int sensation;
    private final Instant time;
    private final ZoneOffset zoneOffset;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Landroidx/health/connect/client/records/CervicalMucusRecord$Appearances;", "", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface Appearances {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Landroidx/health/connect/client/records/CervicalMucusRecord$Sensations;", "", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface Sensations {
    }

    public static /* synthetic */ void getAppearance$annotations() {
    }

    public static /* synthetic */ void getSensation$annotations() {
    }

    public CervicalMucusRecord(Instant instant, ZoneOffset zoneOffset, androidx.health.connect.client.records.metadata.Metadata metadata, int i, int i2) {
        zcp.c(instant, "");
        zcp.c(metadata, "");
        this.time = instant;
        this.zoneOffset = zoneOffset;
        this.metadata = metadata;
        this.appearance = i;
        this.sensation = i2;
    }

    public /* synthetic */ CervicalMucusRecord(Instant instant, ZoneOffset zoneOffset, androidx.health.connect.client.records.metadata.Metadata metadata, int i, int i2, int i3, zcm zcmVar) {
        this(instant, zoneOffset, metadata, (i3 & 8) != 0 ? 0 : i, (i3 & 16) != 0 ? 0 : i2);
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

    public final int getAppearance() {
        return this.appearance;
    }

    public final int getSensation() {
        return this.sensation;
    }

    static {
        Map<String, Integer> mapE = zae.e(yyz.c(Appearance.CLEAR, 5), yyz.c(Appearance.CREAMY, 3), yyz.c(Appearance.DRY, 1), yyz.c(Appearance.STICKY, 2), yyz.c(Appearance.WATERY, 4), yyz.c(Appearance.UNUSUAL, 6));
        APPEARANCE_STRING_TO_INT_MAP = mapE;
        APPEARANCE_INT_TO_STRING_MAP = UtilsKt.reverse(mapE);
        Map<String, Integer> mapE2 = zae.e(yyz.c(Sensation.LIGHT, 1), yyz.c(Sensation.MEDIUM, 2), yyz.c(Sensation.HEAVY, 3));
        SENSATION_STRING_TO_INT_MAP = mapE2;
        SENSATION_INT_TO_STRING_MAP = UtilsKt.reverse(mapE2);
    }

    /* JADX INFO: loaded from: classes20.dex */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Landroidx/health/connect/client/records/CervicalMucusRecord$Sensation;", "", "<init>", "()V", "LIGHT", "", "MEDIUM", "HEAVY", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Sensation {
        public static final String HEAVY = "heavy";
        public static final Sensation INSTANCE = new Sensation();
        public static final String LIGHT = "light";
        public static final String MEDIUM = "medium";

        private Sensation() {
        }
    }

    /* JADX INFO: loaded from: classes20.dex */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Landroidx/health/connect/client/records/CervicalMucusRecord$Appearance;", "", "<init>", "()V", "DRY", "", "STICKY", "CREAMY", "WATERY", "CLEAR", "UNUSUAL", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Appearance {
        public static final String CLEAR = "clear";
        public static final String CREAMY = "creamy";
        public static final String DRY = "dry";
        public static final Appearance INSTANCE = new Appearance();
        public static final String STICKY = "sticky";
        public static final String UNUSUAL = "unusual";
        public static final String WATERY = "watery";

        private Appearance() {
        }
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!zcp.b(getClass(), other != null ? other.getClass() : null)) {
            return false;
        }
        zcp.e(other, "");
        CervicalMucusRecord cervicalMucusRecord = (CervicalMucusRecord) other;
        return zcp.b(getTime(), cervicalMucusRecord.getTime()) && zcp.b(getZoneOffset(), cervicalMucusRecord.getZoneOffset()) && this.appearance == cervicalMucusRecord.appearance && this.sensation == cervicalMucusRecord.sensation && zcp.b(getMetadata(), cervicalMucusRecord.getMetadata());
    }

    public int hashCode() {
        int iHashCode = getTime().hashCode();
        ZoneOffset zoneOffset = getZoneOffset();
        return (((((((iHashCode * 31) + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31) + this.appearance) * 31) + this.sensation) * 31) + getMetadata().hashCode();
    }

    public String toString() {
        return "CervicalMucusRecord(time=" + getTime() + ", zoneOffset=" + getZoneOffset() + ", appearance=" + this.appearance + ", sensation=" + this.sensation + ", metadata=" + getMetadata() + g4.l;
    }
}
