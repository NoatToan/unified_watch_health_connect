package com.xiaomi.hm.health.bt.profile.gdsp.common;

import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.profile.feature.Feature;
import com.xiaomi.hm.health.bt.profile.gdsp.HMGDSPData;
import com.xiaomi.hm.health.bt.profile.gdsp.HMGDSPType;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.ActivityData;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.ActivityDataFragment;
import com.xiaomi.hm.health.bt.profile.gdsp.bloodpressure.BloodPressureMeasureResult;
import com.xiaomi.hm.health.bt.profile.gdsp.bodytemperature.Temperature80s;
import com.xiaomi.hm.health.bt.profile.gdsp.bodytemperature.TemperatureAllDay;
import com.xiaomi.hm.health.bt.profile.gdsp.bodytemperature.TemperatureSingle;
import com.xiaomi.hm.health.bt.profile.gdsp.common.param.BaseGdspSyncParam;
import com.xiaomi.hm.health.bt.profile.gdsp.common.param.GdspBloodPressureResultParam;
import com.xiaomi.hm.health.bt.profile.gdsp.common.param.GdspBodyTemperature80sParam;
import com.xiaomi.hm.health.bt.profile.gdsp.common.param.GdspBodyTemperatureAllParam;
import com.xiaomi.hm.health.bt.profile.gdsp.common.param.GdspBodyTemperatureSingleParam;
import com.xiaomi.hm.health.bt.profile.gdsp.common.param.GdspByteArrayParam;
import com.xiaomi.hm.health.bt.profile.gdsp.common.param.GdspFirstbetaParam;
import com.xiaomi.hm.health.bt.profile.gdsp.common.param.GdspGdsDetailParam;
import com.xiaomi.hm.health.bt.profile.gdsp.common.param.GdspGpsSummaryParam;
import com.xiaomi.hm.health.bt.profile.gdsp.common.param.GdspLogParam;
import com.xiaomi.hm.health.bt.profile.gdsp.common.param.GdspPaiParam;
import com.xiaomi.hm.health.bt.profile.gdsp.common.param.GdspPressureParam;
import com.xiaomi.hm.health.bt.profile.gdsp.common.param.GdspProActivityParam;
import com.xiaomi.hm.health.bt.profile.gdsp.common.param.GdspProHrParam;
import com.xiaomi.hm.health.bt.profile.gdsp.common.param.GdspSingletonParam;
import com.xiaomi.hm.health.bt.profile.gdsp.common.param.GdspSpo2Param;
import com.xiaomi.hm.health.bt.profile.gdsp.common.param.GdspTemperateParam;
import com.xiaomi.hm.health.bt.profile.gdsp.firstbeat.FirstbeatData;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportDetail;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportSummary;
import com.xiaomi.hm.health.bt.profile.gdsp.hr.HMHrData;
import com.xiaomi.hm.health.bt.profile.gdsp.pai.HMPaiData;
import com.xiaomi.hm.health.bt.profile.gdsp.pressure.HMPressureData;
import com.xiaomi.hm.health.bt.profile.gdsp.spo2.Spo2Data;
import com.xiaomi.hm.health.bt.profile.gdsp.temperature.HMTemperatureData;
import com.xiaomi.market.sdk.Constants;
import java.io.File;
import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b5\u00106J$\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004J\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nJ2\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u00072\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fJ\"\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u00072\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u001e\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00072\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J*\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00140\u00072\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0004J\"\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00140\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0004J2\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u00140\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u0006\u001a\u00020\u0004J\"\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u00140\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0004J\"\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\u00140\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0004J\"\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0\u00140\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0004J\"\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0\u00140\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0004J&\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010*0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0004J.\u0010.\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010-0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010,\u001a\u00020*2\u0006\u0010\u0006\u001a\u00020\u0004J.\u00101\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001000\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020/2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0004J\u001a\u00103\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002020\u00140\u00072\u0006\u0010\u0003\u001a\u00020\u0002J\u001a\u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002020\u00140\u00072\u0006\u0010\u0003\u001a\u00020\u0002¨\u00067"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/common/GdspParamFactory;", "", "Ljava/util/Calendar;", "startTime", "", "type", "version", "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/param/BaseGdspSyncParam;", "", "getByteArrayParam", "Ljava/io/File;", "file", "getLogParam", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "source", "Lcom/xiaomi/hm/health/bt/profile/feature/Feature;", Constants.JSON_FEATURE, "Lcom/xiaomi/hm/health/bt/profile/gdsp/activity/ActivityDataFragment;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/activity/ActivityData;", "getProActivityParam", "", "Lcom/xiaomi/hm/health/bt/profile/gdsp/hr/HMHrData;", "getProHrParam", "Lcom/xiaomi/hm/health/bt/profile/gdsp/pai/HMPaiData;", "getPaiParam", "", "isSingle", "Lcom/xiaomi/hm/health/bt/profile/gdsp/pressure/HMPressureData;", "getPressureParam", "Lcom/xiaomi/hm/health/bt/profile/gdsp/temperature/HMTemperatureData;", "getTemperatureParam", "supportSpo2Version", "Lcom/xiaomi/hm/health/bt/profile/gdsp/spo2/Spo2Data;", "getSpo2Param", "Lcom/xiaomi/hm/health/bt/profile/gdsp/bodytemperature/TemperatureAllDay;", "getBodyTemperatureAllParam", "Lcom/xiaomi/hm/health/bt/profile/gdsp/bodytemperature/TemperatureSingle;", "getBodyTemperatureSingleParam", "Lcom/xiaomi/hm/health/bt/profile/gdsp/bodytemperature/Temperature80s;", "getBodyTemperature80sParam", "Lcom/xiaomi/hm/health/bt/profile/gdsp/firstbeat/FirstbeatData;", "getFirstbeatParam", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/SportSummary;", "getSportSummaryParam", "summary", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/SportDetail;", "getSportDetailParam", "Lcom/xiaomi/hm/health/bt/profile/gdsp/HMGDSPType;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/HMGDSPData;", "getSingletonParam", "Lcom/xiaomi/hm/health/bt/profile/gdsp/bloodpressure/BloodPressureMeasureResult;", "getBloodPressureResultParam", "getSleepBloodPressureResultParam", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class GdspParamFactory {

    @NotNull
    public static final GdspParamFactory INSTANCE = new GdspParamFactory();

    private GdspParamFactory() {
    }

    @NotNull
    public final BaseGdspSyncParam<List<BloodPressureMeasureResult>> getBloodPressureResultParam(@NotNull Calendar startTime) {
        return GdspBloodPressureResultParam.INSTANCE.gdspBloodPressureResultParam(startTime);
    }

    @NotNull
    public final BaseGdspSyncParam<List<Temperature80s>> getBodyTemperature80sParam(@NotNull Calendar startTime, int version) {
        return new GdspBodyTemperature80sParam(startTime, version);
    }

    @NotNull
    public final BaseGdspSyncParam<List<TemperatureAllDay>> getBodyTemperatureAllParam(@NotNull Calendar startTime, int version) {
        return new GdspBodyTemperatureAllParam(startTime, version);
    }

    @NotNull
    public final BaseGdspSyncParam<List<TemperatureSingle>> getBodyTemperatureSingleParam(@NotNull Calendar startTime, int version) {
        return new GdspBodyTemperatureSingleParam(startTime, version);
    }

    @NotNull
    public final BaseGdspSyncParam<byte[]> getByteArrayParam(@NotNull Calendar startTime, int type, int version) {
        return new GdspByteArrayParam(startTime, type, version);
    }

    @NotNull
    public final BaseGdspSyncParam<List<FirstbeatData>> getFirstbeatParam(@NotNull Calendar startTime, int version) {
        return new GdspFirstbetaParam(startTime, version);
    }

    @NotNull
    public final BaseGdspSyncParam<File> getLogParam(int version, @NotNull File file) {
        return new GdspLogParam(Calendar.getInstance(), file, version);
    }

    @NotNull
    public final BaseGdspSyncParam<HMPaiData> getPaiParam(int version, @NotNull Calendar startTime) {
        return new GdspPaiParam(startTime, version);
    }

    @NotNull
    public final BaseGdspSyncParam<List<HMPressureData>> getPressureParam(boolean isSingle, @NotNull Calendar startTime, int version) {
        return new GdspPressureParam(startTime, isSingle, version);
    }

    @NotNull
    public final BaseGdspSyncParam<ActivityDataFragment<ActivityData>> getProActivityParam(int version, @NotNull Calendar startTime, @NotNull HMDeviceSource source, @NotNull Feature feature) {
        return new GdspProActivityParam(startTime, source, feature, version);
    }

    @NotNull
    public final BaseGdspSyncParam<List<HMHrData>> getProHrParam(int version, @NotNull Calendar startTime) {
        return new GdspProHrParam(startTime, version);
    }

    @NotNull
    public final BaseGdspSyncParam<HMGDSPData> getSingletonParam(@NotNull Calendar startTime, @NotNull HMGDSPType type, @NotNull HMDeviceSource source, int version) {
        return new GdspSingletonParam(startTime, type, source, version);
    }

    @NotNull
    public final BaseGdspSyncParam<List<BloodPressureMeasureResult>> getSleepBloodPressureResultParam(@NotNull Calendar startTime) {
        return GdspBloodPressureResultParam.INSTANCE.gdspSleepBloodPressureResultParam(startTime);
    }

    @NotNull
    public final BaseGdspSyncParam<List<Spo2Data>> getSpo2Param(@NotNull Calendar startTime, int type, boolean supportSpo2Version, int version) {
        return new GdspSpo2Param(startTime, type, supportSpo2Version, version);
    }

    @NotNull
    public final BaseGdspSyncParam<SportDetail> getSportDetailParam(@NotNull Calendar startTime, @NotNull HMDeviceSource source, @NotNull SportSummary summary, int version) {
        return new GdspGdsDetailParam(startTime, summary, source, version);
    }

    @NotNull
    public final BaseGdspSyncParam<SportSummary> getSportSummaryParam(@NotNull Calendar startTime, @NotNull HMDeviceSource source, int version) {
        return new GdspGpsSummaryParam(startTime, source, version);
    }

    @NotNull
    public final BaseGdspSyncParam<List<HMTemperatureData>> getTemperatureParam(@NotNull Calendar startTime, int version) {
        return new GdspTemperateParam(startTime, version);
    }
}
