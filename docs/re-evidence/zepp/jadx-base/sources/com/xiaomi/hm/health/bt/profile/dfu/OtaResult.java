package com.xiaomi.hm.health.bt.profile.dfu;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0018\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b-\u0010.J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ\u000b\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0003JV\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0016\u001a\u00020\fHÖ\u0001J\t\u0010\u0018\u001a\u00020\u0017HÖ\u0001J\u0013\u0010\u001a\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u000e\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0006R\u001b\u0010\u0010\u001a\u0004\u0018\u00010\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\tR\u001b\u0010\u0011\u001a\u0004\u0018\u00010\u00078\u0006@\u0006¢\u0006\f\n\u0004\b%\u0010#\u001a\u0004\b&\u0010\tR\u001b\u0010\u0012\u001a\u0004\u0018\u00010\u00078\u0006@\u0006¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b(\u0010\tR\u001b\u0010\u0013\u001a\u0004\u0018\u00010\f8\u0006@\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u0006/"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/dfu/OtaResult;", "", "", "component1", "", "component2", "()Ljava/lang/Byte;", "", "component3", "()Ljava/lang/Long;", "component4", "component5", "", "component6", "fileExist", "fileType", "fileSize", "crc", "buildTime", "log", "copy", "(ZLjava/lang/Byte;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;)Lcom/xiaomi/hm/health/bt/profile/dfu/OtaResult;", "toString", "", "hashCode", "other", "equals", "a", "Z", "getFileExist", "()Z", "b", "Ljava/lang/Byte;", "getFileType", "c", "Ljava/lang/Long;", "getFileSize", GoogleApiAvailabilityLight.a, "getCrc", "e", "getBuildTime", "f", "Ljava/lang/String;", "getLog", "()Ljava/lang/String;", "<init>", "(ZLjava/lang/Byte;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class OtaResult {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final boolean fileExist;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private final Byte fileType;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    private final Long fileSize;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    private final Long crc;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @Nullable
    private final Long buildTime;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @Nullable
    private final String log;

    public OtaResult(boolean z, @Nullable Byte b, @Nullable Long l, @Nullable Long l2, @Nullable Long l3, @Nullable String str) {
        this.fileExist = z;
        this.fileType = b;
        this.fileSize = l;
        this.crc = l2;
        this.buildTime = l3;
        this.log = str;
    }

    public static /* synthetic */ OtaResult copy$default(OtaResult otaResult, boolean z, Byte b, Long l, Long l2, Long l3, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = otaResult.fileExist;
        }
        if ((i & 2) != 0) {
            b = otaResult.fileType;
        }
        Byte b2 = b;
        if ((i & 4) != 0) {
            l = otaResult.fileSize;
        }
        Long l4 = l;
        if ((i & 8) != 0) {
            l2 = otaResult.crc;
        }
        Long l5 = l2;
        if ((i & 16) != 0) {
            l3 = otaResult.buildTime;
        }
        Long l6 = l3;
        if ((i & 32) != 0) {
            str = otaResult.log;
        }
        return otaResult.copy(z, b2, l4, l5, l6, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getFileExist() {
        return this.fileExist;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Byte getFileType() {
        return this.fileType;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getFileSize() {
        return this.fileSize;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getCrc() {
        return this.crc;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Long getBuildTime() {
        return this.buildTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getLog() {
        return this.log;
    }

    @NotNull
    public final OtaResult copy(boolean fileExist, @Nullable Byte fileType, @Nullable Long fileSize, @Nullable Long crc, @Nullable Long buildTime, @Nullable String log) {
        return new OtaResult(fileExist, fileType, fileSize, crc, buildTime, log);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OtaResult)) {
            return false;
        }
        OtaResult otaResult = (OtaResult) other;
        return this.fileExist == otaResult.fileExist && Intrinsics.areEqual(this.fileType, otaResult.fileType) && Intrinsics.areEqual(this.fileSize, otaResult.fileSize) && Intrinsics.areEqual(this.crc, otaResult.crc) && Intrinsics.areEqual(this.buildTime, otaResult.buildTime) && Intrinsics.areEqual(this.log, otaResult.log);
    }

    @Nullable
    public final Long getBuildTime() {
        return this.buildTime;
    }

    @Nullable
    public final Long getCrc() {
        return this.crc;
    }

    public final boolean getFileExist() {
        return this.fileExist;
    }

    @Nullable
    public final Long getFileSize() {
        return this.fileSize;
    }

    @Nullable
    public final Byte getFileType() {
        return this.fileType;
    }

    @Nullable
    public final String getLog() {
        return this.log;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    public int hashCode() {
        boolean z = this.fileExist;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        Byte b = this.fileType;
        int iHashCode = (i + (b == null ? 0 : b.hashCode())) * 31;
        Long l = this.fileSize;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.crc;
        int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.buildTime;
        int iHashCode4 = (iHashCode3 + (l3 == null ? 0 : l3.hashCode())) * 31;
        String str = this.log;
        return iHashCode4 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "OtaResult(fileExist=" + this.fileExist + ", fileType=" + this.fileType + ", fileSize=" + this.fileSize + ", crc=" + this.crc + ", buildTime=" + this.buildTime + ", log=" + ((Object) this.log) + ')';
    }

    public /* synthetic */ OtaResult(boolean z, Byte b, Long l, Long l2, Long l3, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? null : b, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : l2, (i & 16) != 0 ? null : l3, (i & 32) == 0 ? str : null);
    }
}
