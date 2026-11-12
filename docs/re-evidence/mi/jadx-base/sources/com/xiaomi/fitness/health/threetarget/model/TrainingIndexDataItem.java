package com.xiaomi.fitness.health.threetarget.model;

import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import com.xiaomi.fitness.baseui.widget.LevelBarView;
import com.xiaomi.fitness.health.export.HealthPageExtKt;
import com.xiaomi.fitness.health.export.IHealthPage;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b(\b\u0086\b\u0018\u00002\u00020\u0001B}\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0005\u0012\u0006\u0010\u0014\u001a\u00020\u0005¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010)\u001a\u00020\u0005H\u0016J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010,\u001a\u00020\u0007HÆ\u0003J\t\u0010-\u001a\u00020\u0005HÆ\u0003J\t\u0010.\u001a\u00020\nHÆ\u0003J\t\u0010/\u001a\u00020\u0005HÆ\u0003J\t\u00100\u001a\u00020\rHÆ\u0003J\t\u00101\u001a\u00020\u0005HÆ\u0003J\t\u00102\u001a\u00020\u0005HÆ\u0003J\u000f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011HÆ\u0003J\t\u00104\u001a\u00020\u0005HÆ\u0003J\t\u00105\u001a\u00020\u0005HÆ\u0003J\u0089\u0001\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u0005HÆ\u0001J\u0013\u00107\u001a\u00020\n2\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00109\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001aR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001aR\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001aR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0013\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001aR\u0011\u0010\u0014\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001a¨\u0006:"}, d2 = {"Lcom/xiaomi/fitness/health/threetarget/model/TrainingIndexDataItem;", "", "timestamp", "", "did", "", "homeDataType", "Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;", "title", "noData", "", "noDataGuideStr", "arrowPosition", "", "value", "des", "levelItems", "", "Lcom/xiaomi/fitness/baseui/widget/LevelBarView$LevelItem;", "startLevelName", "endLevelName", "<init>", "(JLjava/lang/String;Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;Ljava/lang/String;ZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getTimestamp", "()J", "getDid", "()Ljava/lang/String;", "getHomeDataType", "()Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;", "getTitle", "getNoData", "()Z", "getNoDataGuideStr", "getArrowPosition", "()I", "getValue", "getDes", "getLevelItems", "()Ljava/util/List;", "getStartLevelName", "getEndLevelName", "toString", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "other", "hashCode", "health-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TrainingIndexDataItem {
    private final int arrowPosition;

    @NotNull
    private final String des;

    @Nullable
    private final String did;

    @NotNull
    private final String endLevelName;

    @NotNull
    private final HomeDataType homeDataType;

    @NotNull
    private final List<LevelBarView.LevelItem> levelItems;
    private final boolean noData;

    @NotNull
    private final String noDataGuideStr;

    @NotNull
    private final String startLevelName;
    private final long timestamp;

    @NotNull
    private final String title;

    @NotNull
    private final String value;

    /* JADX WARN: Multi-variable type inference failed */
    public TrainingIndexDataItem(long j, @Nullable String str, @NotNull HomeDataType homeDataType, @NotNull String title, boolean z, @NotNull String noDataGuideStr, int i, @NotNull String value, @NotNull String des, @NotNull List<? extends LevelBarView.LevelItem> levelItems, @NotNull String startLevelName, @NotNull String endLevelName) {
        Intrinsics.checkNotNullParameter(homeDataType, "homeDataType");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(noDataGuideStr, "noDataGuideStr");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(des, "des");
        Intrinsics.checkNotNullParameter(levelItems, "levelItems");
        Intrinsics.checkNotNullParameter(startLevelName, "startLevelName");
        Intrinsics.checkNotNullParameter(endLevelName, "endLevelName");
        this.timestamp = j;
        this.did = str;
        this.homeDataType = homeDataType;
        this.title = title;
        this.noData = z;
        this.noDataGuideStr = noDataGuideStr;
        this.arrowPosition = i;
        this.value = value;
        this.des = des;
        this.levelItems = levelItems;
        this.startLevelName = startLevelName;
        this.endLevelName = endLevelName;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final List<LevelBarView.LevelItem> component10() {
        return this.levelItems;
    }

    @NotNull
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getStartLevelName() {
        return this.startLevelName;
    }

    @NotNull
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getEndLevelName() {
        return this.endLevelName;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDid() {
        return this.did;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final HomeDataType getHomeDataType() {
        return this.homeDataType;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getNoData() {
        return this.noData;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getNoDataGuideStr() {
        return this.noDataGuideStr;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getArrowPosition() {
        return this.arrowPosition;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getDes() {
        return this.des;
    }

    @NotNull
    public final TrainingIndexDataItem copy(long timestamp, @Nullable String did, @NotNull HomeDataType homeDataType, @NotNull String title, boolean noData, @NotNull String noDataGuideStr, int arrowPosition, @NotNull String value, @NotNull String des, @NotNull List<? extends LevelBarView.LevelItem> levelItems, @NotNull String startLevelName, @NotNull String endLevelName) {
        Intrinsics.checkNotNullParameter(homeDataType, "homeDataType");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(noDataGuideStr, "noDataGuideStr");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(des, "des");
        Intrinsics.checkNotNullParameter(levelItems, "levelItems");
        Intrinsics.checkNotNullParameter(startLevelName, "startLevelName");
        Intrinsics.checkNotNullParameter(endLevelName, "endLevelName");
        return new TrainingIndexDataItem(timestamp, did, homeDataType, title, noData, noDataGuideStr, arrowPosition, value, des, levelItems, startLevelName, endLevelName);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrainingIndexDataItem)) {
            return false;
        }
        TrainingIndexDataItem trainingIndexDataItem = (TrainingIndexDataItem) other;
        return this.timestamp == trainingIndexDataItem.timestamp && Intrinsics.areEqual(this.did, trainingIndexDataItem.did) && this.homeDataType == trainingIndexDataItem.homeDataType && Intrinsics.areEqual(this.title, trainingIndexDataItem.title) && this.noData == trainingIndexDataItem.noData && Intrinsics.areEqual(this.noDataGuideStr, trainingIndexDataItem.noDataGuideStr) && this.arrowPosition == trainingIndexDataItem.arrowPosition && Intrinsics.areEqual(this.value, trainingIndexDataItem.value) && Intrinsics.areEqual(this.des, trainingIndexDataItem.des) && Intrinsics.areEqual(this.levelItems, trainingIndexDataItem.levelItems) && Intrinsics.areEqual(this.startLevelName, trainingIndexDataItem.startLevelName) && Intrinsics.areEqual(this.endLevelName, trainingIndexDataItem.endLevelName);
    }

    public final int getArrowPosition() {
        return this.arrowPosition;
    }

    @NotNull
    public final String getDes() {
        return this.des;
    }

    @Nullable
    public final String getDid() {
        return this.did;
    }

    @NotNull
    public final String getEndLevelName() {
        return this.endLevelName;
    }

    @NotNull
    public final HomeDataType getHomeDataType() {
        return this.homeDataType;
    }

    @NotNull
    public final List<LevelBarView.LevelItem> getLevelItems() {
        return this.levelItems;
    }

    public final boolean getNoData() {
        return this.noData;
    }

    @NotNull
    public final String getNoDataGuideStr() {
        return this.noDataGuideStr;
    }

    @NotNull
    public final String getStartLevelName() {
        return this.startLevelName;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.timestamp) * 31;
        String str = this.did;
        return ((((((((((((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.homeDataType.hashCode()) * 31) + this.title.hashCode()) * 31) + Boolean.hashCode(this.noData)) * 31) + this.noDataGuideStr.hashCode()) * 31) + Integer.hashCode(this.arrowPosition)) * 31) + this.value.hashCode()) * 31) + this.des.hashCode()) * 31) + this.levelItems.hashCode()) * 31) + this.startLevelName.hashCode()) * 31) + this.endLevelName.hashCode();
    }

    @NotNull
    public String toString() {
        return "TrainingIndexDataItem(homeDataType=" + this.homeDataType + ", title='" + this.title + "', noData=" + this.noData + ", value='" + this.value + "', des='" + this.des + "', startLevelName='" + this.startLevelName + "', endLevelName='" + this.endLevelName + "')";
    }

    public /* synthetic */ TrainingIndexDataItem(long j, String str, HomeDataType homeDataType, String str2, boolean z, String str3, int i, String str4, String str5, List list, String str6, String str7, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i2 & 2) != 0 ? null : str, homeDataType, (i2 & 8) != 0 ? HealthPageExtKt.getInstance(IHealthPage.INSTANCE).getHealthDataTypeNameByHomeDataType(homeDataType) : str2, z, (i2 & 32) != 0 ? "" : str3, (i2 & 64) != 0 ? -1 : i, (i2 & 128) != 0 ? "" : str4, (i2 & 256) != 0 ? " " : str5, (i2 & 512) != 0 ? new ArrayList() : list, str6, str7);
    }
}
