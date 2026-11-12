package androidx.health.connect.client.records.metadata;

import com.huawei.hms.network.embedded.g4;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import defpackage.zcm;
import defpackage.zcp;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.time.Instant;
import kotlin.annotation.AnnotationRetention;
import kotlin.jvm.JvmStatic;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 %2\u00020\u0001:\u0001%BQ\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010#\u001a\u00020\u0003H\u0016J\b\u0010$\u001a\u00020\u0005H\u0016R\u0017\u0010\u0002\u001a\u00020\u0003¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u0006&"}, d2 = {"Landroidx/health/connect/client/records/metadata/Metadata;", "", "recordingMethod", "", "id", "", "dataOrigin", "Landroidx/health/connect/client/records/metadata/DataOrigin;", "lastModifiedTime", "Ljava/time/Instant;", "clientRecordId", "clientRecordVersion", "", "device", "Landroidx/health/connect/client/records/metadata/Device;", "<init>", "(ILjava/lang/String;Landroidx/health/connect/client/records/metadata/DataOrigin;Ljava/time/Instant;Ljava/lang/String;JLandroidx/health/connect/client/records/metadata/Device;)V", "getRecordingMethod$annotations", "()V", "getRecordingMethod", "()I", "getId", "()Ljava/lang/String;", "getDataOrigin", "()Landroidx/health/connect/client/records/metadata/DataOrigin;", "getLastModifiedTime", "()Ljava/time/Instant;", "getClientRecordId", "getClientRecordVersion", "()J", "getDevice", "()Landroidx/health/connect/client/records/metadata/Device;", "equals", "", "other", WatchFaceConstant.HASHCODE, "toString", "Companion", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Metadata {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String EMPTY_ID = "";
    public static final int RECORDING_METHOD_ACTIVELY_RECORDED = 1;
    public static final int RECORDING_METHOD_AUTOMATICALLY_RECORDED = 2;
    public static final int RECORDING_METHOD_MANUAL_ENTRY = 3;
    public static final int RECORDING_METHOD_UNKNOWN = 0;
    private final String clientRecordId;
    private final long clientRecordVersion;
    private final DataOrigin dataOrigin;
    private final Device device;
    private final String id;
    private final Instant lastModifiedTime;
    private final int recordingMethod;

    public static /* synthetic */ void getRecordingMethod$annotations() {
    }

    public Metadata(int i, String str, DataOrigin dataOrigin, Instant instant, String str2, long j, Device device) {
        zcp.c(str, "");
        zcp.c(dataOrigin, "");
        zcp.c(instant, "");
        this.recordingMethod = i;
        this.id = str;
        this.dataOrigin = dataOrigin;
        this.lastModifiedTime = instant;
        this.clientRecordId = str2;
        this.clientRecordVersion = j;
        this.device = device;
    }

    public /* synthetic */ Metadata(int i, String str, DataOrigin dataOrigin, Instant instant, String str2, long j, Device device, int i2, zcm zcmVar) {
        this(i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? new DataOrigin("") : dataOrigin, (i2 & 8) != 0 ? Instant.EPOCH : instant, (i2 & 16) != 0 ? null : str2, (i2 & 32) != 0 ? 0L : j, (i2 & 64) == 0 ? device : null);
    }

    public final int getRecordingMethod() {
        return this.recordingMethod;
    }

    public final String getId() {
        return this.id;
    }

    public final DataOrigin getDataOrigin() {
        return this.dataOrigin;
    }

    public final Instant getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    public final String getClientRecordId() {
        return this.clientRecordId;
    }

    public final long getClientRecordVersion() {
        return this.clientRecordVersion;
    }

    public final Device getDevice() {
        return this.device;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Metadata)) {
            return false;
        }
        Metadata metadata = (Metadata) other;
        return zcp.b((Object) this.id, (Object) metadata.id) && zcp.b(this.dataOrigin, metadata.dataOrigin) && zcp.b(this.lastModifiedTime, metadata.lastModifiedTime) && zcp.b((Object) this.clientRecordId, (Object) metadata.clientRecordId) && this.clientRecordVersion == metadata.clientRecordVersion && zcp.b(this.device, metadata.device) && this.recordingMethod == metadata.recordingMethod;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode();
        int iHashCode2 = this.dataOrigin.hashCode();
        int iHashCode3 = this.lastModifiedTime.hashCode();
        String str = this.clientRecordId;
        int iHashCode4 = str != null ? str.hashCode() : 0;
        int iHashCode5 = Long.hashCode(this.clientRecordVersion);
        Device device = this.device;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (device != null ? device.hashCode() : 0)) * 31) + Integer.hashCode(this.recordingMethod);
    }

    public String toString() {
        return "Metadata(id='" + this.id + "', dataOrigin=" + this.dataOrigin + ", lastModifiedTime=" + this.lastModifiedTime + ", clientRecordId=" + this.clientRecordId + ", clientRecordVersion=" + this.clientRecordVersion + ", device=" + this.device + ", recordingMethod=" + this.recordingMethod + g4.l;
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u001aB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\"\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0007J\u0018\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u0014\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\"\u0010\u0014\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0007J\u0018\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0014\u0010\u0016\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0007J&\u0010\u0016\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0007J\u001c\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0007J\u0014\u0010\u0018\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0007J&\u0010\u0018\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0007J\u001c\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Landroidx/health/connect/client/records/metadata/Metadata$Companion;", "", "<init>", "()V", "EMPTY_ID", "", "RECORDING_METHOD_UNKNOWN", "", "RECORDING_METHOD_ACTIVELY_RECORDED", "RECORDING_METHOD_AUTOMATICALLY_RECORDED", "RECORDING_METHOD_MANUAL_ENTRY", "activelyRecorded", "Landroidx/health/connect/client/records/metadata/Metadata;", "device", "Landroidx/health/connect/client/records/metadata/Device;", "clientRecordId", "clientRecordVersion", "", "activelyRecordedWithId", "id", "autoRecorded", "autoRecordedWithId", "manualEntry", "manualEntryWithId", "unknownRecordingMethod", "unknownRecordingMethodWithId", "RecordingMethod", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {

        @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Landroidx/health/connect/client/records/metadata/Metadata$Companion$RecordingMethod;", "", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @Retention(RetentionPolicy.SOURCE)
        @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
        public @interface RecordingMethod {
        }

        private Companion() {
        }

        @JvmStatic
        public final Metadata activelyRecorded(Device device) {
            zcp.c(device, "");
            return new Metadata(1, null, null, null, null, 0L, device, 62, null);
        }

        public static /* synthetic */ Metadata activelyRecorded$default(Companion companion, Device device, String str, long j, int i, Object obj) {
            if ((i & 4) != 0) {
                j = 0;
            }
            return companion.activelyRecorded(device, str, j);
        }

        @JvmStatic
        public final Metadata activelyRecorded(Device device, String clientRecordId, long clientRecordVersion) {
            zcp.c(device, "");
            zcp.c(clientRecordId, "");
            return new Metadata(1, null, null, null, clientRecordId, clientRecordVersion, device, 14, null);
        }

        @JvmStatic
        public final Metadata activelyRecordedWithId(String id, Device device) {
            zcp.c(id, "");
            zcp.c(device, "");
            return new Metadata(1, id, null, null, null, 0L, device, 60, null);
        }

        @JvmStatic
        public final Metadata autoRecorded(Device device) {
            zcp.c(device, "");
            return new Metadata(2, null, null, null, null, 0L, device, 62, null);
        }

        public static /* synthetic */ Metadata autoRecorded$default(Companion companion, Device device, String str, long j, int i, Object obj) {
            if ((i & 4) != 0) {
                j = 0;
            }
            return companion.autoRecorded(device, str, j);
        }

        @JvmStatic
        public final Metadata autoRecorded(Device device, String clientRecordId, long clientRecordVersion) {
            zcp.c(device, "");
            zcp.c(clientRecordId, "");
            return new Metadata(2, null, null, null, clientRecordId, clientRecordVersion, device, 14, null);
        }

        @JvmStatic
        public final Metadata autoRecordedWithId(String id, Device device) {
            zcp.c(id, "");
            zcp.c(device, "");
            return new Metadata(2, id, null, null, null, 0L, device, 60, null);
        }

        public static /* synthetic */ Metadata manualEntry$default(Companion companion, Device device, int i, Object obj) {
            if ((i & 1) != 0) {
                device = null;
            }
            return companion.manualEntry(device);
        }

        @JvmStatic
        public final Metadata manualEntry(Device device) {
            return new Metadata(3, null, null, null, null, 0L, device, 62, null);
        }

        public static /* synthetic */ Metadata manualEntry$default(Companion companion, String str, long j, Device device, int i, Object obj) {
            if ((i & 2) != 0) {
                j = 0;
            }
            if ((i & 4) != 0) {
                device = null;
            }
            return companion.manualEntry(str, j, device);
        }

        @JvmStatic
        public final Metadata manualEntry(String clientRecordId, long clientRecordVersion, Device device) {
            zcp.c(clientRecordId, "");
            return new Metadata(3, null, null, null, clientRecordId, clientRecordVersion, device, 14, null);
        }

        public static /* synthetic */ Metadata manualEntryWithId$default(Companion companion, String str, Device device, int i, Object obj) {
            if ((i & 2) != 0) {
                device = null;
            }
            return companion.manualEntryWithId(str, device);
        }

        @JvmStatic
        public final Metadata manualEntryWithId(String id, Device device) {
            zcp.c(id, "");
            return new Metadata(3, id, null, null, null, 0L, device, 60, null);
        }

        public static /* synthetic */ Metadata unknownRecordingMethod$default(Companion companion, Device device, int i, Object obj) {
            if ((i & 1) != 0) {
                device = null;
            }
            return companion.unknownRecordingMethod(device);
        }

        @JvmStatic
        public final Metadata unknownRecordingMethod(Device device) {
            return new Metadata(0, null, null, null, null, 0L, device, 62, null);
        }

        public static /* synthetic */ Metadata unknownRecordingMethod$default(Companion companion, String str, long j, Device device, int i, Object obj) {
            if ((i & 2) != 0) {
                j = 0;
            }
            if ((i & 4) != 0) {
                device = null;
            }
            return companion.unknownRecordingMethod(str, j, device);
        }

        @JvmStatic
        public final Metadata unknownRecordingMethod(String clientRecordId, long clientRecordVersion, Device device) {
            zcp.c(clientRecordId, "");
            return new Metadata(0, null, null, null, clientRecordId, clientRecordVersion, device, 14, null);
        }

        public static /* synthetic */ Metadata unknownRecordingMethodWithId$default(Companion companion, String str, Device device, int i, Object obj) {
            if ((i & 2) != 0) {
                device = null;
            }
            return companion.unknownRecordingMethodWithId(str, device);
        }

        @JvmStatic
        public final Metadata unknownRecordingMethodWithId(String id, Device device) {
            zcp.c(id, "");
            return new Metadata(0, id, null, null, null, 0L, device, 60, null);
        }

        @JvmStatic
        public final Metadata unknownRecordingMethodWithId(String str) {
            zcp.c(str, "");
            return unknownRecordingMethodWithId$default(this, str, null, 2, null);
        }

        @JvmStatic
        public final Metadata unknownRecordingMethod(String str, long j) {
            zcp.c(str, "");
            return unknownRecordingMethod$default(this, str, j, null, 4, null);
        }

        @JvmStatic
        public final Metadata unknownRecordingMethod(String str) {
            zcp.c(str, "");
            return unknownRecordingMethod$default(this, str, 0L, null, 6, null);
        }

        @JvmStatic
        public final Metadata unknownRecordingMethod() {
            return unknownRecordingMethod$default(this, null, 1, null);
        }

        @JvmStatic
        public final Metadata manualEntryWithId(String str) {
            zcp.c(str, "");
            return manualEntryWithId$default(this, str, null, 2, null);
        }

        @JvmStatic
        public final Metadata manualEntry(String str, long j) {
            zcp.c(str, "");
            return manualEntry$default(this, str, j, null, 4, null);
        }

        @JvmStatic
        public final Metadata manualEntry(String str) {
            zcp.c(str, "");
            return manualEntry$default(this, str, 0L, null, 6, null);
        }

        @JvmStatic
        public final Metadata manualEntry() {
            return manualEntry$default(this, null, 1, null);
        }

        @JvmStatic
        public final Metadata autoRecorded(Device device, String str) {
            zcp.c(device, "");
            zcp.c(str, "");
            return autoRecorded$default(this, device, str, 0L, 4, null);
        }

        @JvmStatic
        public final Metadata activelyRecorded(Device device, String str) {
            zcp.c(device, "");
            zcp.c(str, "");
            return activelyRecorded$default(this, device, str, 0L, 4, null);
        }

        public /* synthetic */ Companion(zcm zcmVar) {
            this();
        }
    }

    @JvmStatic
    public static final Metadata unknownRecordingMethodWithId(String str, Device device) {
        return INSTANCE.unknownRecordingMethodWithId(str, device);
    }

    @JvmStatic
    public static final Metadata unknownRecordingMethodWithId(String str) {
        return INSTANCE.unknownRecordingMethodWithId(str);
    }

    @JvmStatic
    public static final Metadata unknownRecordingMethod(String str, long j, Device device) {
        return INSTANCE.unknownRecordingMethod(str, j, device);
    }

    @JvmStatic
    public static final Metadata unknownRecordingMethod(String str, long j) {
        return INSTANCE.unknownRecordingMethod(str, j);
    }

    @JvmStatic
    public static final Metadata unknownRecordingMethod(String str) {
        return INSTANCE.unknownRecordingMethod(str);
    }

    @JvmStatic
    public static final Metadata unknownRecordingMethod(Device device) {
        return INSTANCE.unknownRecordingMethod(device);
    }

    @JvmStatic
    public static final Metadata unknownRecordingMethod() {
        return INSTANCE.unknownRecordingMethod();
    }

    @JvmStatic
    public static final Metadata manualEntryWithId(String str, Device device) {
        return INSTANCE.manualEntryWithId(str, device);
    }

    @JvmStatic
    public static final Metadata manualEntryWithId(String str) {
        return INSTANCE.manualEntryWithId(str);
    }

    @JvmStatic
    public static final Metadata manualEntry(String str, long j, Device device) {
        return INSTANCE.manualEntry(str, j, device);
    }

    @JvmStatic
    public static final Metadata manualEntry(String str, long j) {
        return INSTANCE.manualEntry(str, j);
    }

    @JvmStatic
    public static final Metadata manualEntry(String str) {
        return INSTANCE.manualEntry(str);
    }

    @JvmStatic
    public static final Metadata manualEntry(Device device) {
        return INSTANCE.manualEntry(device);
    }

    @JvmStatic
    public static final Metadata manualEntry() {
        return INSTANCE.manualEntry();
    }

    @JvmStatic
    public static final Metadata autoRecordedWithId(String str, Device device) {
        return INSTANCE.autoRecordedWithId(str, device);
    }

    @JvmStatic
    public static final Metadata autoRecorded(Device device, String str, long j) {
        return INSTANCE.autoRecorded(device, str, j);
    }

    @JvmStatic
    public static final Metadata autoRecorded(Device device, String str) {
        return INSTANCE.autoRecorded(device, str);
    }

    @JvmStatic
    public static final Metadata autoRecorded(Device device) {
        return INSTANCE.autoRecorded(device);
    }

    @JvmStatic
    public static final Metadata activelyRecordedWithId(String str, Device device) {
        return INSTANCE.activelyRecordedWithId(str, device);
    }

    @JvmStatic
    public static final Metadata activelyRecorded(Device device, String str, long j) {
        return INSTANCE.activelyRecorded(device, str, j);
    }

    @JvmStatic
    public static final Metadata activelyRecorded(Device device, String str) {
        return INSTANCE.activelyRecorded(device, str);
    }

    @JvmStatic
    public static final Metadata activelyRecorded(Device device) {
        return INSTANCE.activelyRecorded(device);
    }
}
