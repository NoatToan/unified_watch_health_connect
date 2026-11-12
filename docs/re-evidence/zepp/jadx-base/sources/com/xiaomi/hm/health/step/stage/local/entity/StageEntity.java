package com.xiaomi.hm.health.step.stage.local.entity;

import androidx.annotation.Keep;
import androidx.room.Entity;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.xiaomi.hm.health.dataprocess.StepsInfo;
import com.xiaomi.hm.health.step.stage.model.StageItem;
import java.util.List;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Entity(primaryKeys = {"userId", "date"}, tableName = "activity_stage")
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b,\u0010-J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003JA\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00062\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001J\t\u0010\u0011\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0019\u0010\f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018R\"\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR\"\u0010\u000e\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010#\u001a\u0004\b$\u0010%R\"\u0010&\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+¨\u0006."}, d2 = {"Lcom/xiaomi/hm/health/step/stage/local/entity/StageEntity;", "", "", "component1", "component2", "component3", "", "component4", "", "Lcom/xiaomi/hm/health/step/stage/model/StageItem;", "component5", "userId", "date", "timeZoneId", "deviceSource", StepsInfo.KEY_STAGE, "copy", "toString", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getUserId", "()Ljava/lang/String;", "setUserId", "(Ljava/lang/String;)V", "getDate", "getTimeZoneId", "setTimeZoneId", LogUtil.I, "getDeviceSource", "()I", "setDeviceSource", "(I)V", "Ljava/util/List;", "getStage", "()Ljava/util/List;", "uploaded", "Z", "getUploaded", "()Z", "setUploaded", "(Z)V", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class StageEntity {

    @NotNull
    private final String date;
    private int deviceSource;

    @NotNull
    private final List<StageItem> stage;

    @NotNull
    private String timeZoneId;
    private boolean uploaded;

    @NotNull
    private String userId;

    public StageEntity() {
        this(null, null, null, 0, null, 31, null);
    }

    public StageEntity(@NotNull String str, @NotNull String str2, @NotNull String str3, int i, @NotNull List<StageItem> list) {
        this.userId = str;
        this.date = str2;
        this.timeZoneId = str3;
        this.deviceSource = i;
        this.stage = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StageEntity copy$default(StageEntity stageEntity, String str, String str2, String str3, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = stageEntity.userId;
        }
        if ((i2 & 2) != 0) {
            str2 = stageEntity.date;
        }
        String str4 = str2;
        if ((i2 & 4) != 0) {
            str3 = stageEntity.timeZoneId;
        }
        String str5 = str3;
        if ((i2 & 8) != 0) {
            i = stageEntity.deviceSource;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            list = stageEntity.stage;
        }
        return stageEntity.copy(str, str4, str5, i3, list);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTimeZoneId() {
        return this.timeZoneId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getDeviceSource() {
        return this.deviceSource;
    }

    @NotNull
    public final List<StageItem> component5() {
        return this.stage;
    }

    @NotNull
    public final StageEntity copy(@NotNull String userId, @NotNull String date, @NotNull String timeZoneId, int deviceSource, @NotNull List<StageItem> stage) {
        return new StageEntity(userId, date, timeZoneId, deviceSource, stage);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StageEntity)) {
            return false;
        }
        StageEntity stageEntity = (StageEntity) other;
        return Intrinsics.areEqual(this.userId, stageEntity.userId) && Intrinsics.areEqual(this.date, stageEntity.date) && Intrinsics.areEqual(this.timeZoneId, stageEntity.timeZoneId) && this.deviceSource == stageEntity.deviceSource && Intrinsics.areEqual(this.stage, stageEntity.stage);
    }

    @NotNull
    public final String getDate() {
        return this.date;
    }

    public final int getDeviceSource() {
        return this.deviceSource;
    }

    @NotNull
    public final List<StageItem> getStage() {
        return this.stage;
    }

    @NotNull
    public final String getTimeZoneId() {
        return this.timeZoneId;
    }

    public final boolean getUploaded() {
        return this.uploaded;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return (((((((this.userId.hashCode() * 31) + this.date.hashCode()) * 31) + this.timeZoneId.hashCode()) * 31) + this.deviceSource) * 31) + this.stage.hashCode();
    }

    public final void setDeviceSource(int i) {
        this.deviceSource = i;
    }

    public final void setTimeZoneId(@NotNull String str) {
        this.timeZoneId = str;
    }

    public final void setUploaded(boolean z) {
        this.uploaded = z;
    }

    public final void setUserId(@NotNull String str) {
        this.userId = str;
    }

    @NotNull
    public String toString() {
        return "StageEntity(userId=" + this.userId + ", date=" + this.date + ", timeZoneId=" + this.timeZoneId + ", deviceSource=" + this.deviceSource + ", stage=" + this.stage + ")";
    }

    public /* synthetic */ StageEntity(String str, String str2, String str3, int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) == 0 ? str2 : "", (i2 & 4) != 0 ? TimeZone.getDefault().getID() : str3, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }
}
