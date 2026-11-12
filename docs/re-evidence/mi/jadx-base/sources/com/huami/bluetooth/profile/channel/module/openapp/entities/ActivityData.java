package com.huami.bluetooth.profile.channel.module.openapp.entities;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b,\b\u0086\b\u0018\u0000 N2\u00020\u0001:\u0001OBs\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0004\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\b\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\bL\u0010MJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0002HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J\t\u0010\n\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u0081\u0001\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u00042\b\b\u0002\u0010\u0017\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u00022\b\b\u0002\u0010\u0019\u001a\u00020\b2\b\b\u0002\u0010\u001a\u001a\u00020\u00022\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0013HÆ\u0001J\t\u0010\"\u001a\u00020!HÖ\u0001J\t\u0010#\u001a\u00020\u0002HÖ\u0001J\u0013\u0010&\u001a\u00020\b2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003R\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u0016\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010'\u001a\u0004\b-\u0010)R\u0017\u0010\u0018\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010'\u001a\u0004\b.\u0010)R\u0017\u0010\u0019\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0019\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\u001a\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010'\u001a\u0004\b2\u0010)R$\u0010\u001b\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R$\u0010\u001c\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R$\u0010\u001d\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR$\u0010\u001e\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR$\u0010\u001f\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010K¨\u0006P"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/openapp/entities/ActivityData;", "Ljava/io/Serializable;", "", "component1", "", "component2", "component3", "component4", "", "component5", "component6", "Lcom/huami/bluetooth/profile/channel/module/openapp/entities/StepsData;", "component7", "Lcom/huami/bluetooth/profile/channel/module/openapp/entities/CalorieData;", "component8", "Lcom/huami/bluetooth/profile/channel/module/openapp/entities/FatBurningData;", "component9", "Lcom/huami/bluetooth/profile/channel/module/openapp/entities/SitWalkRun;", "component10", "Lcom/huami/bluetooth/profile/channel/module/openapp/entities/StandData;", "component11", "time", "distance", "floor", "goalType", "supportFloor", "standOrBurn", "dataSteps", "dataCalorie", "dataFatBurning", "dataSitWalkRun", "dataStand", "copy", "", "toString", "hashCode", "", "other", "equals", "I", "getTime", "()I", "F", "getDistance", "()F", "getFloor", "getGoalType", "Z", "getSupportFloor", "()Z", "getStandOrBurn", "Lcom/huami/bluetooth/profile/channel/module/openapp/entities/StepsData;", "getDataSteps", "()Lcom/huami/bluetooth/profile/channel/module/openapp/entities/StepsData;", "setDataSteps", "(Lcom/huami/bluetooth/profile/channel/module/openapp/entities/StepsData;)V", "Lcom/huami/bluetooth/profile/channel/module/openapp/entities/CalorieData;", "getDataCalorie", "()Lcom/huami/bluetooth/profile/channel/module/openapp/entities/CalorieData;", "setDataCalorie", "(Lcom/huami/bluetooth/profile/channel/module/openapp/entities/CalorieData;)V", "Lcom/huami/bluetooth/profile/channel/module/openapp/entities/FatBurningData;", "getDataFatBurning", "()Lcom/huami/bluetooth/profile/channel/module/openapp/entities/FatBurningData;", "setDataFatBurning", "(Lcom/huami/bluetooth/profile/channel/module/openapp/entities/FatBurningData;)V", "Lcom/huami/bluetooth/profile/channel/module/openapp/entities/SitWalkRun;", "getDataSitWalkRun", "()Lcom/huami/bluetooth/profile/channel/module/openapp/entities/SitWalkRun;", "setDataSitWalkRun", "(Lcom/huami/bluetooth/profile/channel/module/openapp/entities/SitWalkRun;)V", "Lcom/huami/bluetooth/profile/channel/module/openapp/entities/StandData;", "getDataStand", "()Lcom/huami/bluetooth/profile/channel/module/openapp/entities/StandData;", "setDataStand", "(Lcom/huami/bluetooth/profile/channel/module/openapp/entities/StandData;)V", "<init>", "(IFIIZILcom/huami/bluetooth/profile/channel/module/openapp/entities/StepsData;Lcom/huami/bluetooth/profile/channel/module/openapp/entities/CalorieData;Lcom/huami/bluetooth/profile/channel/module/openapp/entities/FatBurningData;Lcom/huami/bluetooth/profile/channel/module/openapp/entities/SitWalkRun;Lcom/huami/bluetooth/profile/channel/module/openapp/entities/StandData;)V", "Companion", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class ActivityData implements Serializable {
    public static final int INDEX_HALF_END = 47;
    public static final int INDEX_HOUR_END = 23;
    public static final int INDEX_START = 0;
    private static final long serialVersionUID = 1;

    @Nullable
    private CalorieData dataCalorie;

    @Nullable
    private FatBurningData dataFatBurning;

    @Nullable
    private SitWalkRun dataSitWalkRun;

    @Nullable
    private StandData dataStand;

    @Nullable
    private StepsData dataSteps;
    private final float distance;
    private final int floor;
    private final int goalType;
    private final int standOrBurn;
    private final boolean supportFloor;
    private final int time;

    public ActivityData(int i, float f, int i2, int i3, boolean z, int i4, @Nullable StepsData stepsData, @Nullable CalorieData calorieData, @Nullable FatBurningData fatBurningData, @Nullable SitWalkRun sitWalkRun, @Nullable StandData standData) {
        this.time = i;
        this.distance = f;
        this.floor = i2;
        this.goalType = i3;
        this.supportFloor = z;
        this.standOrBurn = i4;
        this.dataSteps = stepsData;
        this.dataCalorie = calorieData;
        this.dataFatBurning = fatBurningData;
        this.dataSitWalkRun = sitWalkRun;
        this.dataStand = standData;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getTime() {
        return this.time;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final SitWalkRun getDataSitWalkRun() {
        return this.dataSitWalkRun;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final StandData getDataStand() {
        return this.dataStand;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getDistance() {
        return this.distance;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getFloor() {
        return this.floor;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getGoalType() {
        return this.goalType;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getSupportFloor() {
        return this.supportFloor;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getStandOrBurn() {
        return this.standOrBurn;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final StepsData getDataSteps() {
        return this.dataSteps;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final CalorieData getDataCalorie() {
        return this.dataCalorie;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final FatBurningData getDataFatBurning() {
        return this.dataFatBurning;
    }

    @NotNull
    public final ActivityData copy(int time, float distance, int floor, int goalType, boolean supportFloor, int standOrBurn, @Nullable StepsData dataSteps, @Nullable CalorieData dataCalorie, @Nullable FatBurningData dataFatBurning, @Nullable SitWalkRun dataSitWalkRun, @Nullable StandData dataStand) {
        return new ActivityData(time, distance, floor, goalType, supportFloor, standOrBurn, dataSteps, dataCalorie, dataFatBurning, dataSitWalkRun, dataStand);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActivityData)) {
            return false;
        }
        ActivityData activityData = (ActivityData) other;
        return this.time == activityData.time && Float.compare(this.distance, activityData.distance) == 0 && this.floor == activityData.floor && this.goalType == activityData.goalType && this.supportFloor == activityData.supportFloor && this.standOrBurn == activityData.standOrBurn && Intrinsics.areEqual(this.dataSteps, activityData.dataSteps) && Intrinsics.areEqual(this.dataCalorie, activityData.dataCalorie) && Intrinsics.areEqual(this.dataFatBurning, activityData.dataFatBurning) && Intrinsics.areEqual(this.dataSitWalkRun, activityData.dataSitWalkRun) && Intrinsics.areEqual(this.dataStand, activityData.dataStand);
    }

    @Nullable
    public final CalorieData getDataCalorie() {
        return this.dataCalorie;
    }

    @Nullable
    public final FatBurningData getDataFatBurning() {
        return this.dataFatBurning;
    }

    @Nullable
    public final SitWalkRun getDataSitWalkRun() {
        return this.dataSitWalkRun;
    }

    @Nullable
    public final StandData getDataStand() {
        return this.dataStand;
    }

    @Nullable
    public final StepsData getDataSteps() {
        return this.dataSteps;
    }

    public final float getDistance() {
        return this.distance;
    }

    public final int getFloor() {
        return this.floor;
    }

    public final int getGoalType() {
        return this.goalType;
    }

    public final int getStandOrBurn() {
        return this.standOrBurn;
    }

    public final boolean getSupportFloor() {
        return this.supportFloor;
    }

    public final int getTime() {
        return this.time;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v7, types: [int] */
    public int hashCode() {
        int iHashCode = ((((((Integer.hashCode(this.time) * 31) + Float.hashCode(this.distance)) * 31) + Integer.hashCode(this.floor)) * 31) + Integer.hashCode(this.goalType)) * 31;
        boolean z = this.supportFloor;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int iHashCode2 = (((iHashCode + r1) * 31) + Integer.hashCode(this.standOrBurn)) * 31;
        StepsData stepsData = this.dataSteps;
        int iHashCode3 = (iHashCode2 + (stepsData == null ? 0 : stepsData.hashCode())) * 31;
        CalorieData calorieData = this.dataCalorie;
        int iHashCode4 = (iHashCode3 + (calorieData == null ? 0 : calorieData.hashCode())) * 31;
        FatBurningData fatBurningData = this.dataFatBurning;
        int iHashCode5 = (iHashCode4 + (fatBurningData == null ? 0 : fatBurningData.hashCode())) * 31;
        SitWalkRun sitWalkRun = this.dataSitWalkRun;
        int iHashCode6 = (iHashCode5 + (sitWalkRun == null ? 0 : sitWalkRun.hashCode())) * 31;
        StandData standData = this.dataStand;
        return iHashCode6 + (standData != null ? standData.hashCode() : 0);
    }

    public final void setDataCalorie(@Nullable CalorieData calorieData) {
        this.dataCalorie = calorieData;
    }

    public final void setDataFatBurning(@Nullable FatBurningData fatBurningData) {
        this.dataFatBurning = fatBurningData;
    }

    public final void setDataSitWalkRun(@Nullable SitWalkRun sitWalkRun) {
        this.dataSitWalkRun = sitWalkRun;
    }

    public final void setDataStand(@Nullable StandData standData) {
        this.dataStand = standData;
    }

    public final void setDataSteps(@Nullable StepsData stepsData) {
        this.dataSteps = stepsData;
    }

    @NotNull
    public String toString() {
        return "ActivityData(time=" + this.time + ", distance=" + this.distance + ", floor=" + this.floor + ", goalType=" + this.goalType + ", supportFloor=" + this.supportFloor + ", standOrBurn=" + this.standOrBurn + ", dataSteps=" + this.dataSteps + ", dataCalorie=" + this.dataCalorie + ", dataFatBurning=" + this.dataFatBurning + ", dataSitWalkRun=" + this.dataSitWalkRun + ", dataStand=" + this.dataStand + ')';
    }

    public /* synthetic */ ActivityData(int i, float f, int i2, int i3, boolean z, int i4, StepsData stepsData, CalorieData calorieData, FatBurningData fatBurningData, SitWalkRun sitWalkRun, StandData standData, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, f, i2, i3, z, i4, (i5 & 64) != 0 ? null : stepsData, (i5 & 128) != 0 ? null : calorieData, (i5 & 256) != 0 ? null : fatBurningData, (i5 & 512) != 0 ? null : sitWalkRun, (i5 & 1024) != 0 ? null : standData);
    }
}
