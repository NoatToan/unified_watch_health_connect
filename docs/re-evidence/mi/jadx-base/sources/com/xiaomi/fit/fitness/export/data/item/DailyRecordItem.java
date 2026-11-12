package com.xiaomi.fit.fitness.export.data.item;

import com.xiaomi.fit.fitness.export.data.ITimeData;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u001d\u001a\u00020\u001eH\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\t\"\u0004\b\u0015\u0010\u000bR\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b\u0082\u0001.\u001f !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKL¨\u0006M"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;", "Lcom/xiaomi/fit/fitness/export/data/ITimeData;", "Lcom/xiaomi/fit/fitness/export/data/item/IPointTimeData;", "Ljava/io/Serializable;", "<init>", "()V", "dbKey", "", "getDbKey", "()Ljava/lang/String;", "setDbKey", "(Ljava/lang/String;)V", "dbTime", "", "getDbTime", "()Ljava/lang/Long;", "setDbTime", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "sid", "getSid", "setSid", "zoneOffsetInSec", "", "getZoneOffsetInSec", "()Ljava/lang/Integer;", "setZoneOffsetInSec", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "clearDataNotSaveToDb", "", "Lcom/xiaomi/fit/fitness/export/data/item/AbnormalFibItem;", "Lcom/xiaomi/fit/fitness/export/data/item/AbnormalHrItem;", "Lcom/xiaomi/fit/fitness/export/data/item/AbnormalRecordItem;", "Lcom/xiaomi/fit/fitness/export/data/item/ActiveStageItem;", "Lcom/xiaomi/fit/fitness/export/data/item/AmbulatoryBloodPressureCheckItem;", "Lcom/xiaomi/fit/fitness/export/data/item/AmbulatoryBloodPressureItem;", "Lcom/xiaomi/fit/fitness/export/data/item/AmbulatoryBloodPressureReport;", "Lcom/xiaomi/fit/fitness/export/data/item/BloodPressureItem;", "Lcom/xiaomi/fit/fitness/export/data/item/BloodSugarItem;", "Lcom/xiaomi/fit/fitness/export/data/item/BodyMomentumItem;", "Lcom/xiaomi/fit/fitness/export/data/item/CaloriesItem;", "Lcom/xiaomi/fit/fitness/export/data/item/DayNightSleepReport;", "Lcom/xiaomi/fit/fitness/export/data/item/DynamicBloodPressureItem;", "Lcom/xiaomi/fit/fitness/export/data/item/DynamicBloodPressureSchedule;", "Lcom/xiaomi/fit/fitness/export/data/item/EcgMedicalItemReport;", "Lcom/xiaomi/fit/fitness/export/data/item/EnergyItem;", "Lcom/xiaomi/fit/fitness/export/data/item/GradePredictionItem;", "Lcom/xiaomi/fit/fitness/export/data/item/HeadsetItem;", "Lcom/xiaomi/fit/fitness/export/data/item/HealthCheckDayReport;", "Lcom/xiaomi/fit/fitness/export/data/item/HrItem;", "Lcom/xiaomi/fit/fitness/export/data/item/LactateThresholdItem;", "Lcom/xiaomi/fit/fitness/export/data/item/LightValueItem;", "Lcom/xiaomi/fit/fitness/export/data/item/MHStrengthItem;", "Lcom/xiaomi/fit/fitness/export/data/item/NoiseItem;", "Lcom/xiaomi/fit/fitness/export/data/item/OneDayPaiReport;", "Lcom/xiaomi/fit/fitness/export/data/item/PhysicalStatusItem;", "Lcom/xiaomi/fit/fitness/export/data/item/PpgMedicalItemReport;", "Lcom/xiaomi/fit/fitness/export/data/item/RecentDailyDataItem;", "Lcom/xiaomi/fit/fitness/export/data/item/ReportHrItem;", "Lcom/xiaomi/fit/fitness/export/data/item/ReportSpo2Item;", "Lcom/xiaomi/fit/fitness/export/data/item/RestHrItem;", "Lcom/xiaomi/fit/fitness/export/data/item/RunningIndicatorItem;", "Lcom/xiaomi/fit/fitness/export/data/item/SleepSegmentReport;", "Lcom/xiaomi/fit/fitness/export/data/item/Spo2Item;", "Lcom/xiaomi/fit/fitness/export/data/item/StepItem;", "Lcom/xiaomi/fit/fitness/export/data/item/StressItem;", "Lcom/xiaomi/fit/fitness/export/data/item/TemperatureCharacterItem;", "Lcom/xiaomi/fit/fitness/export/data/item/TemperatureItem;", "Lcom/xiaomi/fit/fitness/export/data/item/TemperatureTrendItem;", "Lcom/xiaomi/fit/fitness/export/data/item/TrainingLoadItem;", "Lcom/xiaomi/fit/fitness/export/data/item/ValidStandItem;", "Lcom/xiaomi/fit/fitness/export/data/item/VitalityItem;", "Lcom/xiaomi/fit/fitness/export/data/item/Vo2MaxItem;", "Lcom/xiaomi/fit/fitness/export/data/item/WeightItem;", "Lcom/xiaomi/fit/fitness/export/data/item/WomenHealthStatus;", "Lcom/xiaomi/fit/fitness/export/data/item/WomenHealthSymptoms;", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class DailyRecordItem implements ITimeData, IPointTimeData, Serializable {

    @Nullable
    private String dbKey;

    @Nullable
    private Long dbTime;

    @Nullable
    private String sid;

    @Nullable
    private transient Integer zoneOffsetInSec;

    private DailyRecordItem() {
    }

    public /* synthetic */ DailyRecordItem(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public void clearDataNotSaveToDb() {
        this.dbKey = null;
        this.dbTime = null;
        this.sid = null;
    }

    @Nullable
    public final String getDbKey() {
        return this.dbKey;
    }

    @Nullable
    public final Long getDbTime() {
        return this.dbTime;
    }

    @NotNull
    public Number getPrimaryValue() {
        return IPointTimeData.DefaultImpls.getPrimaryValue(this);
    }

    @NotNull
    public Number getSecondaryValue() {
        return IPointTimeData.DefaultImpls.getSecondaryValue(this);
    }

    @Nullable
    public final String getSid() {
        return this.sid;
    }

    @Nullable
    public final Integer getZoneOffsetInSec() {
        return this.zoneOffsetInSec;
    }

    public final void setDbKey(@Nullable String str) {
        this.dbKey = str;
    }

    public final void setDbTime(@Nullable Long l) {
        this.dbTime = l;
    }

    public final void setSid(@Nullable String str) {
        this.sid = str;
    }

    public final void setZoneOffsetInSec(@Nullable Integer num) {
        this.zoneOffsetInSec = num;
    }
}
