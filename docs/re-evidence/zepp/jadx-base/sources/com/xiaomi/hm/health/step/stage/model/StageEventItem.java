package com.xiaomi.hm.health.step.stage.model;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.xiaomi.hm.health.dataprocess.StepsInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\b\u001a\u00020\u0002HÆ\u0003J;\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u0002HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\t\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u0019\u0010\u000b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0019\u0010\f\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\r\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u0014\u001a\u0004\b\u001c\u0010\u0016¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/hm/health/step/stage/model/StageEventItem;", "", "", "component1", "component2", "component3", "", "component4", "component5", "eventType", "userId", "date", "deviceSource", StepsInfo.KEY_STAGE, "copy", "toString", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getEventType", "()Ljava/lang/String;", "getUserId", "getDate", LogUtil.I, "getDeviceSource", "()I", "getStage", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class StageEventItem {

    @NotNull
    private final String date;
    private final int deviceSource;

    @NotNull
    private final String eventType;

    @NotNull
    private final String stage;

    @NotNull
    private final String userId;

    public StageEventItem() {
        this(null, null, null, 0, null, 31, null);
    }

    public StageEventItem(@NotNull String str, @NotNull String str2, @NotNull String str3, int i, @NotNull String str4) {
        this.eventType = str;
        this.userId = str2;
        this.date = str3;
        this.deviceSource = i;
        this.stage = str4;
    }

    public static /* synthetic */ StageEventItem copy$default(StageEventItem stageEventItem, String str, String str2, String str3, int i, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = stageEventItem.eventType;
        }
        if ((i2 & 2) != 0) {
            str2 = stageEventItem.userId;
        }
        String str5 = str2;
        if ((i2 & 4) != 0) {
            str3 = stageEventItem.date;
        }
        String str6 = str3;
        if ((i2 & 8) != 0) {
            i = stageEventItem.deviceSource;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            str4 = stageEventItem.stage;
        }
        return stageEventItem.copy(str, str5, str6, i3, str4);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEventType() {
        return this.eventType;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getDeviceSource() {
        return this.deviceSource;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getStage() {
        return this.stage;
    }

    @NotNull
    public final StageEventItem copy(@NotNull String eventType, @NotNull String userId, @NotNull String date, int deviceSource, @NotNull String stage) {
        return new StageEventItem(eventType, userId, date, deviceSource, stage);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StageEventItem)) {
            return false;
        }
        StageEventItem stageEventItem = (StageEventItem) other;
        return Intrinsics.areEqual(this.eventType, stageEventItem.eventType) && Intrinsics.areEqual(this.userId, stageEventItem.userId) && Intrinsics.areEqual(this.date, stageEventItem.date) && this.deviceSource == stageEventItem.deviceSource && Intrinsics.areEqual(this.stage, stageEventItem.stage);
    }

    @NotNull
    public final String getDate() {
        return this.date;
    }

    public final int getDeviceSource() {
        return this.deviceSource;
    }

    @NotNull
    public final String getEventType() {
        return this.eventType;
    }

    @NotNull
    public final String getStage() {
        return this.stage;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return (((((((this.eventType.hashCode() * 31) + this.userId.hashCode()) * 31) + this.date.hashCode()) * 31) + this.deviceSource) * 31) + this.stage.hashCode();
    }

    @NotNull
    public String toString() {
        return "StageEventItem(eventType=" + this.eventType + ", userId=" + this.userId + ", date=" + this.date + ", deviceSource=" + this.deviceSource + ", stage=" + this.stage + ")";
    }

    public /* synthetic */ StageEventItem(String str, String str2, String str3, int i, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? "" : str4);
    }
}
