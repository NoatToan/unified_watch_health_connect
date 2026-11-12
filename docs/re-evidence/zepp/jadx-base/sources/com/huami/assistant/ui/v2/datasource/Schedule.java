package com.huami.assistant.ui.v2.datasource;

import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.annotations.SerializedName;
import com.loc.z;
import com.xiaomi.hm.health.device.settings.todo.datasource.impl.RemoteDataSourceImpl;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\bD\b\u0086\b\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0004\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0004\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\t\u0012\u0006\u0010\u001b\u001a\u00020\u000b\u0012\u0006\u0010\u001c\u001a\u00020\u000b\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u001e\u001a\u00020\u0002\u0012\u0006\u0010\u001f\u001a\u00020\u0004\u0012\u0006\u0010 \u001a\u00020\u0004\u0012\u0006\u0010!\u001a\u00020\u0004\u0012\b\u0010\"\u001a\u0004\u0018\u00010\t\u0012\b\u0010#\u001a\u0004\u0018\u00010\t¢\u0006\u0004\bM\u0010NJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0004HÆ\u0003J\t\u0010\b\u001a\u00020\u0002HÆ\u0003J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\t\u0010\r\u001a\u00020\u000bHÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\u000f\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\tHÆ\u0003J¥\u0001\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u00042\b\b\u0002\u0010\u0017\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u00042\b\b\u0002\u0010\u0019\u001a\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\t2\b\b\u0002\u0010\u001b\u001a\u00020\u000b2\b\b\u0002\u0010\u001c\u001a\u00020\u000b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u001e\u001a\u00020\u00022\b\b\u0002\u0010\u001f\u001a\u00020\u00042\b\b\u0002\u0010 \u001a\u00020\u00042\b\b\u0002\u0010!\u001a\u00020\u00042\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\tHÆ\u0001J\t\u0010%\u001a\u00020\tHÖ\u0001J\t\u0010&\u001a\u00020\u0002HÖ\u0001J\u0013\u0010(\u001a\u00020\u000b2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\u0015\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001c\u0010\u0016\u001a\u00020\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001c\u0010\u0017\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010*\u001a\u0004\b2\u0010,R\u001c\u0010\u0018\u001a\u00020\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010.\u001a\u0004\b4\u00100R\u001c\u0010\u0019\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b5\u0010*\u001a\u0004\b6\u0010,R\u001c\u0010\u001a\u001a\u00020\t8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u001c\u0010\u001b\u001a\u00020\u000b8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b\u001b\u0010=R\u001c\u0010\u001c\u001a\u00020\u000b8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b>\u0010<\u001a\u0004\b\u001c\u0010=R\u001e\u0010\u001d\u001a\u0004\u0018\u00010\t8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b?\u00108\u001a\u0004\b@\u0010:R\u001c\u0010\u001e\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\bA\u0010*\u001a\u0004\bB\u0010,R\u001c\u0010\u001f\u001a\u00020\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\bC\u0010.\u001a\u0004\bD\u00100R\u001c\u0010 \u001a\u00020\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\bE\u0010.\u001a\u0004\bF\u00100R\u001c\u0010!\u001a\u00020\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\bG\u0010.\u001a\u0004\bH\u00100R\u001e\u0010\"\u001a\u0004\u0018\u00010\t8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\bI\u00108\u001a\u0004\bJ\u0010:R\u001e\u0010#\u001a\u0004\u0018\u00010\t8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\bK\u00108\u001a\u0004\bL\u0010:¨\u0006O"}, d2 = {"Lcom/huami/assistant/ui/v2/datasource/Schedule;", "", "", "component1", "", "component2", "component3", "component4", "component5", "", "component6", "", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", RemoteDataSourceImpl.EVENT_DATA_KEY_REPEAT_MODE, "repeatStopTime", "updateVersion", "clientScheduleId", "source", "title", "isAllDay", "isDeleted", "imageUrl", "deviceSource", "startTime", "endTime", "alertTime", "location", "desc", "copy", "toString", "hashCode", "other", "equals", "a", LogUtil.I, "getRepeatMode", "()I", "b", "J", "getRepeatStopTime", "()J", "c", "getUpdateVersion", GoogleApiAvailabilityLight.a, "getClientScheduleId", "e", "getSource", "f", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "g", "Z", "()Z", "h", "i", "getImageUrl", z.j, "getDeviceSource", hl.k, "getStartTime", "l", "getEndTime", "m", "getAlertTime", GoogleApiAvailabilityLight.b, "getLocation", "o", "getDesc", "<init>", "(IJIJILjava/lang/String;ZZLjava/lang/String;IJJJLjava/lang/String;Ljava/lang/String;)V", "assistant_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class Schedule {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName(RemoteDataSourceImpl.EVENT_DATA_KEY_REPEAT_MODE)
    private final int repeatMode;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("repeatStopTime")
    private final long repeatStopTime;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @SerializedName("updateVersion")
    private final int updateVersion;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @SerializedName("clientScheduleId")
    private final long clientScheduleId;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @SerializedName("source")
    private final int source;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @SerializedName("title")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @SerializedName("isAllDay")
    private final boolean isAllDay;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @SerializedName("isDeleted")
    private final boolean isDeleted;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    @SerializedName("imageUrl")
    @Nullable
    private final String imageUrl;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
    @SerializedName("deviceSource")
    private final int deviceSource;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
    @SerializedName("startTime")
    private final long startTime;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata and from toString */
    @SerializedName("endTime")
    private final long endTime;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata and from toString */
    @SerializedName("alertTime")
    private final long alertTime;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata and from toString */
    @SerializedName("location")
    @Nullable
    private final String location;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata and from toString */
    @SerializedName("desc")
    @Nullable
    private final String desc;

    public Schedule(int i, long j, int i2, long j2, int i3, @NotNull String str, boolean z, boolean z2, @Nullable String str2, int i4, long j3, long j4, long j5, @Nullable String str3, @Nullable String str4) {
        this.repeatMode = i;
        this.repeatStopTime = j;
        this.updateVersion = i2;
        this.clientScheduleId = j2;
        this.source = i3;
        this.title = str;
        this.isAllDay = z;
        this.isDeleted = z2;
        this.imageUrl = str2;
        this.deviceSource = i4;
        this.startTime = j3;
        this.endTime = j4;
        this.alertTime = j5;
        this.location = str3;
        this.desc = str4;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getRepeatMode() {
        return this.repeatMode;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getDeviceSource() {
        return this.deviceSource;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final long getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final long getEndTime() {
        return this.endTime;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final long getAlertTime() {
        return this.alertTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getLocation() {
        return this.location;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getDesc() {
        return this.desc;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getRepeatStopTime() {
        return this.repeatStopTime;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getUpdateVersion() {
        return this.updateVersion;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getClientScheduleId() {
        return this.clientScheduleId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getSource() {
        return this.source;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getIsAllDay() {
        return this.isAllDay;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getIsDeleted() {
        return this.isDeleted;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @NotNull
    public final Schedule copy(int repeatMode, long repeatStopTime, int updateVersion, long clientScheduleId, int source, @NotNull String title, boolean isAllDay, boolean isDeleted, @Nullable String imageUrl, int deviceSource, long startTime, long endTime, long alertTime, @Nullable String location, @Nullable String desc) {
        return new Schedule(repeatMode, repeatStopTime, updateVersion, clientScheduleId, source, title, isAllDay, isDeleted, imageUrl, deviceSource, startTime, endTime, alertTime, location, desc);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Schedule)) {
            return false;
        }
        Schedule schedule = (Schedule) other;
        return this.repeatMode == schedule.repeatMode && this.repeatStopTime == schedule.repeatStopTime && this.updateVersion == schedule.updateVersion && this.clientScheduleId == schedule.clientScheduleId && this.source == schedule.source && Intrinsics.areEqual(this.title, schedule.title) && this.isAllDay == schedule.isAllDay && this.isDeleted == schedule.isDeleted && Intrinsics.areEqual(this.imageUrl, schedule.imageUrl) && this.deviceSource == schedule.deviceSource && this.startTime == schedule.startTime && this.endTime == schedule.endTime && this.alertTime == schedule.alertTime && Intrinsics.areEqual(this.location, schedule.location) && Intrinsics.areEqual(this.desc, schedule.desc);
    }

    public final long getAlertTime() {
        return this.alertTime;
    }

    public final long getClientScheduleId() {
        return this.clientScheduleId;
    }

    @Nullable
    public final String getDesc() {
        return this.desc;
    }

    public final int getDeviceSource() {
        return this.deviceSource;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    @Nullable
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @Nullable
    public final String getLocation() {
        return this.location;
    }

    public final int getRepeatMode() {
        return this.repeatMode;
    }

    public final long getRepeatStopTime() {
        return this.repeatStopTime;
    }

    public final int getSource() {
        return this.source;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final int getUpdateVersion() {
        return this.updateVersion;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [int] */
    /* JADX WARN: Type inference failed for: r0v14, types: [int] */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v9, types: [int] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v5 */
    public int hashCode() {
        int iA = ((((((((((this.repeatMode * 31) + b.a(this.repeatStopTime)) * 31) + this.updateVersion) * 31) + b.a(this.clientScheduleId)) * 31) + this.source) * 31) + this.title.hashCode()) * 31;
        boolean z = this.isAllDay;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (iA + r1) * 31;
        boolean z2 = this.isDeleted;
        int i2 = (i + (z2 ? 1 : z2)) * 31;
        String str = this.imageUrl;
        int iHashCode = (((((((((i2 + (str == null ? 0 : str.hashCode())) * 31) + this.deviceSource) * 31) + b.a(this.startTime)) * 31) + b.a(this.endTime)) * 31) + b.a(this.alertTime)) * 31;
        String str2 = this.location;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.desc;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final boolean isAllDay() {
        return this.isAllDay;
    }

    public final boolean isDeleted() {
        return this.isDeleted;
    }

    @NotNull
    public String toString() {
        return "Schedule(repeatMode=" + this.repeatMode + ", repeatStopTime=" + this.repeatStopTime + ", updateVersion=" + this.updateVersion + ", clientScheduleId=" + this.clientScheduleId + ", source=" + this.source + ", title=" + this.title + ", isAllDay=" + this.isAllDay + ", isDeleted=" + this.isDeleted + ", imageUrl=" + this.imageUrl + ", deviceSource=" + this.deviceSource + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", alertTime=" + this.alertTime + ", location=" + this.location + ", desc=" + this.desc + ")";
    }
}
