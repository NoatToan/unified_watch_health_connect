package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: zn, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0015\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012¨\u0006\u001a"}, d2 = {"Lzn;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "fileType", "Ljava/lang/Byte;", PluginDeviceInfo.FICONON, "()Ljava/lang/Byte;", "", "fileSize", "Ljava/lang/Long;", PluginDeviceInfo.FDESC, "()Ljava/lang/Long;", "crc", PluginDeviceInfo.FMODEL, "fileExist", "buildTime", "log", "<init>", "(ZLjava/lang/Byte;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class OtaResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from toString */
    public final boolean fileExist;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from toString */
    @Nullable
    public final Byte fileType;

    /* JADX INFO: renamed from: c, reason: from toString */
    @Nullable
    public final Long fileSize;

    /* JADX INFO: renamed from: d, reason: from toString */
    @Nullable
    public final Long crc;

    /* JADX INFO: renamed from: e, reason: from toString */
    @Nullable
    public final Long buildTime;

    /* JADX INFO: renamed from: f, reason: from toString */
    @Nullable
    public final String log;

    public OtaResult(boolean z, @Nullable Byte b2, @Nullable Long l, @Nullable Long l2, @Nullable Long l3, @Nullable String str) {
        this.fileExist = z;
        this.fileType = b2;
        this.fileSize = l;
        this.crc = l2;
        this.buildTime = l3;
        this.log = str;
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Long getCrc() {
        return this.crc;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Long getFileSize() {
        return this.fileSize;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final Byte getFileType() {
        return this.fileType;
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
        Byte b2 = this.fileType;
        int iHashCode = (i + (b2 == null ? 0 : b2.hashCode())) * 31;
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
        return "OtaResult(fileExist=" + this.fileExist + ", fileType=" + this.fileType + ", fileSize=" + this.fileSize + ", crc=" + this.crc + ", buildTime=" + this.buildTime + ", log=" + this.log + ')';
    }

    public /* synthetic */ OtaResult(boolean z, Byte b2, Long l, Long l2, Long l3, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? null : b2, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : l2, (i & 16) != 0 ? null : l3, (i & 32) == 0 ? str : null);
    }
}
