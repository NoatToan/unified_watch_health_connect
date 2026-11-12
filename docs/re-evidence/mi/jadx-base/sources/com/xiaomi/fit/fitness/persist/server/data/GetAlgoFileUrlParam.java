package com.xiaomi.fit.fitness.persist.server.data;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B9\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\t\u0010\u001b\u001a\u00020\nHÆ\u0003JE\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\nHÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006#"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/server/data/GetAlgoFileUrlParam;", "", "type", "", "suffix", "sid", "fileName", "fileTime", "", "zoneOffsetInSec", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JI)V", "getType", "()Ljava/lang/String;", "getSuffix", "getSid", "getFileName", "getFileTime", "()J", "getZoneOffsetInSec", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "Companion", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GetAlgoFileUrlParam {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String SUFFIX_TXT = "txt";

    @NotNull
    private static final String TYPE_SLEEP = "sleep";

    @SerializedName("file_name")
    @NotNull
    private final String fileName;

    @SerializedName("file_time")
    private final long fileTime;

    @SerializedName("did")
    @NotNull
    private final String sid;

    @SerializedName("suffix")
    @NotNull
    private final String suffix;

    @SerializedName("type")
    @NotNull
    private final String type;

    @SerializedName("zone_offset")
    private final int zoneOffsetInSec;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/server/data/GetAlgoFileUrlParam$Companion;", "", "<init>", "()V", "TYPE_SLEEP", "", "SUFFIX_TXT", "createSleepSrcDataUrl", "Lcom/xiaomi/fit/fitness/persist/server/data/GetAlgoFileUrlParam;", "sid", "wakeupTime", "", "fileName", "zoneOffsetInSec", "", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final GetAlgoFileUrlParam createSleepSrcDataUrl(@NotNull String sid, long wakeupTime, @NotNull String fileName, int zoneOffsetInSec) {
            Intrinsics.checkNotNullParameter(sid, "sid");
            Intrinsics.checkNotNullParameter(fileName, "fileName");
            return new GetAlgoFileUrlParam("sleep", GetAlgoFileUrlParam.SUFFIX_TXT, sid, fileName, wakeupTime, zoneOffsetInSec, null);
        }
    }

    public /* synthetic */ GetAlgoFileUrlParam(String str, String str2, String str3, String str4, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, j, i);
    }

    public static /* synthetic */ GetAlgoFileUrlParam copy$default(GetAlgoFileUrlParam getAlgoFileUrlParam, String str, String str2, String str3, String str4, long j, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = getAlgoFileUrlParam.type;
        }
        if ((i2 & 2) != 0) {
            str2 = getAlgoFileUrlParam.suffix;
        }
        String str5 = str2;
        if ((i2 & 4) != 0) {
            str3 = getAlgoFileUrlParam.sid;
        }
        String str6 = str3;
        if ((i2 & 8) != 0) {
            str4 = getAlgoFileUrlParam.fileName;
        }
        String str7 = str4;
        if ((i2 & 16) != 0) {
            j = getAlgoFileUrlParam.fileTime;
        }
        long j2 = j;
        if ((i2 & 32) != 0) {
            i = getAlgoFileUrlParam.zoneOffsetInSec;
        }
        return getAlgoFileUrlParam.copy(str, str5, str6, str7, j2, i);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSuffix() {
        return this.suffix;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSid() {
        return this.sid;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getFileName() {
        return this.fileName;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getFileTime() {
        return this.fileTime;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getZoneOffsetInSec() {
        return this.zoneOffsetInSec;
    }

    @NotNull
    public final GetAlgoFileUrlParam copy(@NotNull String type, @NotNull String suffix, @NotNull String sid, @NotNull String fileName, long fileTime, int zoneOffsetInSec) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        return new GetAlgoFileUrlParam(type, suffix, sid, fileName, fileTime, zoneOffsetInSec);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetAlgoFileUrlParam)) {
            return false;
        }
        GetAlgoFileUrlParam getAlgoFileUrlParam = (GetAlgoFileUrlParam) other;
        return Intrinsics.areEqual(this.type, getAlgoFileUrlParam.type) && Intrinsics.areEqual(this.suffix, getAlgoFileUrlParam.suffix) && Intrinsics.areEqual(this.sid, getAlgoFileUrlParam.sid) && Intrinsics.areEqual(this.fileName, getAlgoFileUrlParam.fileName) && this.fileTime == getAlgoFileUrlParam.fileTime && this.zoneOffsetInSec == getAlgoFileUrlParam.zoneOffsetInSec;
    }

    @NotNull
    public final String getFileName() {
        return this.fileName;
    }

    public final long getFileTime() {
        return this.fileTime;
    }

    @NotNull
    public final String getSid() {
        return this.sid;
    }

    @NotNull
    public final String getSuffix() {
        return this.suffix;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public final int getZoneOffsetInSec() {
        return this.zoneOffsetInSec;
    }

    public int hashCode() {
        return (((((((((this.type.hashCode() * 31) + this.suffix.hashCode()) * 31) + this.sid.hashCode()) * 31) + this.fileName.hashCode()) * 31) + Long.hashCode(this.fileTime)) * 31) + Integer.hashCode(this.zoneOffsetInSec);
    }

    @NotNull
    public String toString() {
        return "GetAlgoFileUrlParam(type=" + this.type + ", suffix=" + this.suffix + ", sid=" + this.sid + ", fileName=" + this.fileName + ", fileTime=" + this.fileTime + ", zoneOffsetInSec=" + this.zoneOffsetInSec + ")";
    }

    private GetAlgoFileUrlParam(String str, String str2, String str3, String str4, long j, int i) {
        this.type = str;
        this.suffix = str2;
        this.sid = str3;
        this.fileName = str4;
        this.fileTime = j;
        this.zoneOffsetInSec = i;
    }
}
