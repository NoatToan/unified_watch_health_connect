package com.xiaomi.hm.health.bt.profile.gdsp.common;

import androidx.exifinterface.media.ExifInterface;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.gatt.GattPeripheral;
import com.xiaomi.hm.health.bt.profile.base.HMBaseTask;
import com.xiaomi.hm.health.bt.profile.feature.Feature;
import com.xiaomi.hm.health.bt.profile.gdsp.HMGDSPData;
import com.xiaomi.hm.health.bt.profile.gdsp.HMGDSPType;
import com.xiaomi.hm.health.bt.profile.gdsp.IHMDataCallback;
import com.xiaomi.hm.health.bt.profile.gdsp.RawData;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.ActivityData;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.ActivityDataFragment;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.DataHeader;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.IHMActivityDataCallback;
import com.xiaomi.hm.health.bt.profile.gdsp.activitytoday.ActivityTodaySyncParam;
import com.xiaomi.hm.health.bt.profile.gdsp.base.GDSPErrorCode;
import com.xiaomi.hm.health.bt.profile.gdsp.bloodpressure.BloodPressureMeasureResult;
import com.xiaomi.hm.health.bt.profile.gdsp.bodytemperature.Temperature80s;
import com.xiaomi.hm.health.bt.profile.gdsp.bodytemperature.TemperatureAllDay;
import com.xiaomi.hm.health.bt.profile.gdsp.bodytemperature.TemperatureSingle;
import com.xiaomi.hm.health.bt.profile.gdsp.common.callback.CallbackExtKt;
import com.xiaomi.hm.health.bt.profile.gdsp.common.callback.IGdspAnalyticCallback;
import com.xiaomi.hm.health.bt.profile.gdsp.common.callback.IGdspSyncCallback;
import com.xiaomi.hm.health.bt.profile.gdsp.common.data.GdspResultData;
import com.xiaomi.hm.health.bt.profile.gdsp.common.param.BaseGdspSyncParam;
import com.xiaomi.hm.health.bt.profile.gdsp.common.param.GdspDeviceParam;
import com.xiaomi.hm.health.bt.profile.gdsp.common.profile.GdspSyncProfile;
import com.xiaomi.hm.health.bt.profile.gdsp.common.profile.GdspSyncProfileImpl;
import com.xiaomi.hm.health.bt.profile.gdsp.firstbeat.FirstbeatData;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.GpsRecord;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.HMSyncGpsDataTaskNew;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SyncDataCallback;
import com.xiaomi.hm.health.bt.profile.gdsp.hr.HMHrData;
import com.xiaomi.hm.health.bt.profile.gdsp.hr.IHMHrDataCallback;
import com.xiaomi.hm.health.bt.profile.gdsp.pai.HMPaiData;
import com.xiaomi.hm.health.bt.profile.gdsp.pressure.HMPressureData;
import com.xiaomi.hm.health.bt.profile.gdsp.pressure.IHMPressureDataCallback;
import com.xiaomi.hm.health.bt.profile.gdsp.spo2.Spo2Data;
import com.xiaomi.hm.health.bt.profile.gdsp.temperature.HMTemperatureData;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import com.xiaomi.market.sdk.Constants;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000î\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bT\u0010UJ8\u0010\f\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t0\bH\u0002J>\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u00162\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u0013J:\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00162\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00190\u0005J2\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00162\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0013JB\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0#0\u00162\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0007\u001a\u00020\"J2\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0\u00140\u00162\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020&J<\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010)0\u00162\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0014\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010)0\u00140\u0013J:\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0\u00140\u00162\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010,\u001a\u00020+2\u0006\u0010\u0007\u001a\u00020-JN\u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002020\u00140\u00162\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u0002002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u00101\u001a\u00020+2\u0012\u00103\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002020\u00140\u0013J>\u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002050\u00140\u00162\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002050\u00140\u0013J>\u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002070\u00140\u00162\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002070\u00140\u0013JD\u0010;\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010:0\u00162\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u0002092\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020:0\u0013J:\u0010?\u001a\u00020>2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020=0\u00140<J0\u0010A\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020@0\u00140\u00162\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020@0\u0005J0\u0010B\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020@0\u00140\u00162\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020@0\u0005J8\u0010A\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020@0\u00140\u00162\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010C\u001a\u00020+2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020@0\u0005J\u001c\u0010D\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005J\u0016\u0010F\u001a\u00020E2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0011J\u0006\u0010H\u001a\u00020GJ\b\u0010J\u001a\u0004\u0018\u00010IJ\u000e\u0010L\u001a\u00020G2\u0006\u0010K\u001a\u00020IJ\u0006\u0010M\u001a\u00020GR\"\u0010P\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020E0N8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010OR\u0018\u0010S\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010R¨\u0006V"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/common/GdspFactory;", "", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/param/GdspDeviceParam;", "syncParam", "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/callback/IGdspSyncCallback;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/data/GdspResultData;", "callback", "Lkotlin/Function0;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/param/BaseGdspSyncParam;", "buildParam", "Lcom/xiaomi/hm/health/bt/profile/base/HMBaseTask;", "a", "Lcom/xiaomi/hm/health/bt/gatt/GattPeripheral;", "gattPeripheral", "Ljava/util/Calendar;", "startTime", "", "version", "Lcom/xiaomi/hm/health/bt/profile/gdsp/IHMDataCallback;", "", "Lcom/huami/bluetooth/profile/channel/module/openapp/entities/ActivityData;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/CommonGdspSyncTask;", "getActivityTodayDataTask", "type", "", "getByteArrayTask", "Ljava/io/File;", "file", "getLogTask", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "source", "Lcom/xiaomi/hm/health/bt/profile/feature/Feature;", Constants.JSON_FEATURE, "Lcom/xiaomi/hm/health/bt/profile/gdsp/activity/IHMActivityDataCallback;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/activity/ActivityDataFragment;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/activity/ActivityData;", "getProSyncDataTask", "Lcom/xiaomi/hm/health/bt/profile/gdsp/hr/IHMHrDataCallback;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/hr/HMHrData;", "getProHrTask", "Lcom/xiaomi/hm/health/bt/profile/gdsp/pai/HMPaiData;", "getPaiTask", "", "isSingle", "Lcom/xiaomi/hm/health/bt/profile/gdsp/pressure/IHMPressureDataCallback;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/pressure/HMPressureData;", "getPressureTask", "", "spo2SupportVersion", "Lcom/xiaomi/hm/health/bt/profile/gdsp/spo2/Spo2Data;", "mCallback", "getSpo2Task", "Lcom/xiaomi/hm/health/bt/profile/gdsp/temperature/HMTemperatureData;", "getTemperatureTask", "Lcom/xiaomi/hm/health/bt/profile/gdsp/firstbeat/FirstbeatData;", "getFirstBeatTask", "Lcom/xiaomi/hm/health/bt/profile/gdsp/HMGDSPType;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/HMGDSPData;", "getSingletonTask", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/SyncDataCallback;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/GpsRecord;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/HMSyncGpsDataTaskNew;", "getGpsTask", "Lcom/xiaomi/hm/health/bt/profile/gdsp/bloodpressure/BloodPressureMeasureResult;", "getGdspBloodPressureResultTask", "getGdspSleepBPResultTask", "sleepingPressure", "getGdspSyncTask", "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/profile/GdspSyncProfile;", "getGdspSyncProfile", "", "resetGdspSyncProfile", "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/callback/IGdspAnalyticCallback;", "getGdspAnalyticCallback", "gdspAnalyticCallback", "registerAnalytic", "unregisterAnalytic", "", "Ljava/util/Map;", "mGdspProfileMap", "b", "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/callback/IGdspAnalyticCallback;", "mGdspAnalyticCallback", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class GdspFactory {

    @NotNull
    public static final GdspFactory INSTANCE = new GdspFactory();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final Map<GattPeripheral, GdspSyncProfile> mGdspProfileMap = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private static IGdspAnalyticCallback mGdspAnalyticCallback;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/common/param/BaseGdspSyncParam;", "", "Lcom/xiaomi/hm/health/bt/profile/gdsp/spo2/Spo2Data;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<BaseGdspSyncParam<List<? extends Spo2Data>>> {
        public final /* synthetic */ GdspDeviceParam a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(GdspDeviceParam gdspDeviceParam) {
            super(0);
            this.a = gdspDeviceParam;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BaseGdspSyncParam<List<Spo2Data>> invoke() {
            return GdspParamFactory.INSTANCE.getSpo2Param(this.a.getStartTime(), this.a.getType() & 255, this.a.supportSpo2Version(), this.a.getVersion());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/common/param/BaseGdspSyncParam;", "", "Lcom/xiaomi/hm/health/bt/profile/gdsp/spo2/Spo2Data;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<BaseGdspSyncParam<List<? extends Spo2Data>>> {
        public final /* synthetic */ GdspDeviceParam a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(GdspDeviceParam gdspDeviceParam) {
            super(0);
            this.a = gdspDeviceParam;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BaseGdspSyncParam<List<Spo2Data>> invoke() {
            return GdspParamFactory.INSTANCE.getSpo2Param(this.a.getStartTime(), this.a.getType() & 255, this.a.supportSpo2Version(), this.a.getVersion());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/common/param/BaseGdspSyncParam;", "", "Lcom/xiaomi/hm/health/bt/profile/gdsp/spo2/Spo2Data;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<BaseGdspSyncParam<List<? extends Spo2Data>>> {
        public final /* synthetic */ GdspDeviceParam a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(GdspDeviceParam gdspDeviceParam) {
            super(0);
            this.a = gdspDeviceParam;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BaseGdspSyncParam<List<Spo2Data>> invoke() {
            return GdspParamFactory.INSTANCE.getSpo2Param(this.a.getStartTime(), this.a.getType() & 255, this.a.supportSpo2Version(), this.a.getVersion());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/common/param/BaseGdspSyncParam;", "", "Lcom/xiaomi/hm/health/bt/profile/gdsp/spo2/Spo2Data;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<BaseGdspSyncParam<List<? extends Spo2Data>>> {
        public final /* synthetic */ GdspDeviceParam a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(GdspDeviceParam gdspDeviceParam) {
            super(0);
            this.a = gdspDeviceParam;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BaseGdspSyncParam<List<Spo2Data>> invoke() {
            return GdspParamFactory.INSTANCE.getSpo2Param(this.a.getStartTime(), this.a.getType() & 255, this.a.supportSpo2Version(), this.a.getVersion());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/common/param/BaseGdspSyncParam;", "", "Lcom/xiaomi/hm/health/bt/profile/gdsp/spo2/Spo2Data;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<BaseGdspSyncParam<List<? extends Spo2Data>>> {
        public final /* synthetic */ GdspDeviceParam a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(GdspDeviceParam gdspDeviceParam) {
            super(0);
            this.a = gdspDeviceParam;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BaseGdspSyncParam<List<Spo2Data>> invoke() {
            return GdspParamFactory.INSTANCE.getSpo2Param(this.a.getStartTime(), this.a.getType() & 255, this.a.supportSpo2Version(), this.a.getVersion());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/common/param/BaseGdspSyncParam;", "", "Lcom/xiaomi/hm/health/bt/profile/gdsp/temperature/HMTemperatureData;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<BaseGdspSyncParam<List<? extends HMTemperatureData>>> {
        public final /* synthetic */ GdspDeviceParam a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(GdspDeviceParam gdspDeviceParam) {
            super(0);
            this.a = gdspDeviceParam;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BaseGdspSyncParam<List<HMTemperatureData>> invoke() {
            return GdspParamFactory.INSTANCE.getTemperatureParam(this.a.getStartTime(), this.a.getVersion());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/common/param/BaseGdspSyncParam;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<BaseGdspSyncParam<byte[]>> {
        public final /* synthetic */ GdspDeviceParam a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(GdspDeviceParam gdspDeviceParam) {
            super(0);
            this.a = gdspDeviceParam;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BaseGdspSyncParam<byte[]> invoke() {
            return GdspParamFactory.INSTANCE.getByteArrayParam(this.a.getStartTime(), this.a.getType() & 255, this.a.getVersion());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/common/param/BaseGdspSyncParam;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/activity/ActivityDataFragment;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/activity/ActivityData;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<BaseGdspSyncParam<ActivityDataFragment<ActivityData>>> {
        public final /* synthetic */ GdspDeviceParam a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(GdspDeviceParam gdspDeviceParam) {
            super(0);
            this.a = gdspDeviceParam;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BaseGdspSyncParam<ActivityDataFragment<ActivityData>> invoke() {
            return GdspParamFactory.INSTANCE.getProActivityParam(this.a.getVersion(), this.a.getStartTime(), this.a.getDeviceSource(), this.a.getDeviceFeature());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/common/param/BaseGdspSyncParam;", "", "Lcom/xiaomi/hm/health/bt/profile/gdsp/bodytemperature/Temperature80s;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<BaseGdspSyncParam<List<? extends Temperature80s>>> {
        public final /* synthetic */ GdspDeviceParam a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(GdspDeviceParam gdspDeviceParam) {
            super(0);
            this.a = gdspDeviceParam;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BaseGdspSyncParam<List<Temperature80s>> invoke() {
            return GdspParamFactory.INSTANCE.getBodyTemperature80sParam(this.a.getStartTime(), this.a.getVersion());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/common/param/BaseGdspSyncParam;", "", "Lcom/xiaomi/hm/health/bt/profile/gdsp/bodytemperature/TemperatureAllDay;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<BaseGdspSyncParam<List<? extends TemperatureAllDay>>> {
        public final /* synthetic */ GdspDeviceParam a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(GdspDeviceParam gdspDeviceParam) {
            super(0);
            this.a = gdspDeviceParam;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BaseGdspSyncParam<List<TemperatureAllDay>> invoke() {
            return GdspParamFactory.INSTANCE.getBodyTemperatureAllParam(this.a.getStartTime(), this.a.getVersion());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/common/param/BaseGdspSyncParam;", "", "Lcom/xiaomi/hm/health/bt/profile/gdsp/bodytemperature/TemperatureSingle;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function0<BaseGdspSyncParam<List<? extends TemperatureSingle>>> {
        public final /* synthetic */ GdspDeviceParam a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(GdspDeviceParam gdspDeviceParam) {
            super(0);
            this.a = gdspDeviceParam;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BaseGdspSyncParam<List<TemperatureSingle>> invoke() {
            return GdspParamFactory.INSTANCE.getBodyTemperatureSingleParam(this.a.getStartTime(), this.a.getVersion());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/common/param/BaseGdspSyncParam;", "", "Lcom/xiaomi/hm/health/bt/profile/gdsp/firstbeat/FirstbeatData;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l extends Lambda implements Function0<BaseGdspSyncParam<List<? extends FirstbeatData>>> {
        public final /* synthetic */ GdspDeviceParam a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(GdspDeviceParam gdspDeviceParam) {
            super(0);
            this.a = gdspDeviceParam;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BaseGdspSyncParam<List<FirstbeatData>> invoke() {
            return GdspParamFactory.INSTANCE.getFirstbeatParam(this.a.getStartTime(), this.a.getVersion());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/common/param/BaseGdspSyncParam;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/pai/HMPaiData;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class m extends Lambda implements Function0<BaseGdspSyncParam<HMPaiData>> {
        public final /* synthetic */ GdspDeviceParam a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(GdspDeviceParam gdspDeviceParam) {
            super(0);
            this.a = gdspDeviceParam;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BaseGdspSyncParam<HMPaiData> invoke() {
            return GdspParamFactory.INSTANCE.getPaiParam(this.a.getVersion(), this.a.getStartTime());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/common/param/BaseGdspSyncParam;", "", "Lcom/xiaomi/hm/health/bt/profile/gdsp/pressure/HMPressureData;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class n extends Lambda implements Function0<BaseGdspSyncParam<List<? extends HMPressureData>>> {
        public final /* synthetic */ GdspDeviceParam a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(GdspDeviceParam gdspDeviceParam) {
            super(0);
            this.a = gdspDeviceParam;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BaseGdspSyncParam<List<HMPressureData>> invoke() {
            return GdspParamFactory.INSTANCE.getPressureParam(true, this.a.getStartTime(), this.a.getVersion());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/common/param/BaseGdspSyncParam;", "", "Lcom/xiaomi/hm/health/bt/profile/gdsp/pressure/HMPressureData;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class o extends Lambda implements Function0<BaseGdspSyncParam<List<? extends HMPressureData>>> {
        public final /* synthetic */ GdspDeviceParam a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(GdspDeviceParam gdspDeviceParam) {
            super(0);
            this.a = gdspDeviceParam;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BaseGdspSyncParam<List<HMPressureData>> invoke() {
            return GdspParamFactory.INSTANCE.getPressureParam(false, this.a.getStartTime(), this.a.getVersion());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/common/param/BaseGdspSyncParam;", "", "Lcom/xiaomi/hm/health/bt/profile/gdsp/hr/HMHrData;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class p extends Lambda implements Function0<BaseGdspSyncParam<List<? extends HMHrData>>> {
        public final /* synthetic */ GdspDeviceParam a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(GdspDeviceParam gdspDeviceParam) {
            super(0);
            this.a = gdspDeviceParam;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BaseGdspSyncParam<List<HMHrData>> invoke() {
            return GdspParamFactory.INSTANCE.getProHrParam(this.a.getVersion(), this.a.getStartTime());
        }
    }

    private GdspFactory() {
    }

    private final <T> HMBaseTask a(GdspDeviceParam syncParam, IGdspSyncCallback<GdspResultData> callback, Function0<? extends BaseGdspSyncParam<T>> buildParam) {
        return new CommonGdspSyncTask(syncParam.getGattPeripheral(), buildParam.invoke(), CallbackExtKt.typedCallback(callback));
    }

    @NotNull
    public final CommonGdspSyncTask<List<com.huami.bluetooth.profile.channel.module.openapp.entities.ActivityData>> getActivityTodayDataTask(@NotNull GattPeripheral gattPeripheral, @NotNull Calendar startTime, int version, @NotNull IHMDataCallback<List<com.huami.bluetooth.profile.channel.module.openapp.entities.ActivityData>> callback) {
        return new CommonGdspSyncTask<>(gattPeripheral, new ActivityTodaySyncParam(startTime, version), CallbackExtKt.toGdspListCallback(callback));
    }

    @NotNull
    public final CommonGdspSyncTask<byte[]> getByteArrayTask(@NotNull GattPeripheral gattPeripheral, @NotNull Calendar startTime, int type, int version, @NotNull IGdspSyncCallback<byte[]> callback) {
        return new CommonGdspSyncTask<>(gattPeripheral, GdspParamFactory.INSTANCE.getByteArrayParam(startTime, type, version), callback);
    }

    @NotNull
    public final CommonGdspSyncTask<List<FirstbeatData>> getFirstBeatTask(@NotNull GattPeripheral gattPeripheral, @NotNull Calendar startTime, int version, @NotNull IHMDataCallback<List<FirstbeatData>> callback) {
        return new CommonGdspSyncTask<>(gattPeripheral, GdspParamFactory.INSTANCE.getFirstbeatParam(startTime, version), CallbackExtKt.toGdspListCallback(callback));
    }

    @Nullable
    public final IGdspAnalyticCallback getGdspAnalyticCallback() {
        return mGdspAnalyticCallback;
    }

    @NotNull
    public final CommonGdspSyncTask<List<BloodPressureMeasureResult>> getGdspBloodPressureResultTask(@NotNull GattPeripheral gattPeripheral, @NotNull Calendar startTime, @NotNull IGdspSyncCallback<BloodPressureMeasureResult> callback) {
        return getGdspBloodPressureResultTask(gattPeripheral, startTime, false, callback);
    }

    @NotNull
    public final CommonGdspSyncTask<List<BloodPressureMeasureResult>> getGdspSleepBPResultTask(@NotNull GattPeripheral gattPeripheral, @NotNull Calendar startTime, @NotNull IGdspSyncCallback<BloodPressureMeasureResult> callback) {
        return getGdspBloodPressureResultTask(gattPeripheral, startTime, true, callback);
    }

    @NotNull
    public final synchronized GdspSyncProfile getGdspSyncProfile(@NotNull GattPeripheral gattPeripheral, int version) {
        GdspSyncProfile gdspSyncProfileImpl;
        Map<GattPeripheral, GdspSyncProfile> map = mGdspProfileMap;
        gdspSyncProfileImpl = map.get(gattPeripheral);
        if (gdspSyncProfileImpl == null) {
            gdspSyncProfileImpl = new GdspSyncProfileImpl(gattPeripheral, version);
            map.clear();
            map.put(gattPeripheral, gdspSyncProfileImpl);
        }
        return gdspSyncProfileImpl;
    }

    @NotNull
    public final HMBaseTask getGdspSyncTask(@NotNull GdspDeviceParam syncParam, @NotNull IGdspSyncCallback<GdspResultData> callback) {
        byte type = syncParam.getType();
        if (type == 1) {
            return a(syncParam, callback, new h(syncParam));
        }
        if (type == 48) {
            return a(syncParam, callback, new i(syncParam));
        }
        if (type == 46) {
            return a(syncParam, callback, new j(syncParam));
        }
        if (type == 47) {
            return a(syncParam, callback, new k(syncParam));
        }
        if (type == 35) {
            return a(syncParam, callback, new l(syncParam));
        }
        if (type == 6) {
            return getGpsTask(syncParam.getGattPeripheral(), syncParam.getDeviceSource(), syncParam.getStartTime(), syncParam.getVersion(), CallbackExtKt.toGpsCallback(callback));
        }
        if (type == 14) {
            return getGpsTask(syncParam.getGattPeripheral(), syncParam.getDeviceSource(), syncParam.getStartTime(), syncParam.getVersion(), CallbackExtKt.toGpsCallback(callback));
        }
        if (type == 5) {
            return getGpsTask(syncParam.getGattPeripheral(), syncParam.getDeviceSource(), syncParam.getStartTime(), syncParam.getVersion(), CallbackExtKt.toGpsCallback(callback));
        }
        if (type == 13) {
            return a(syncParam, callback, new m(syncParam));
        }
        if (type == 18) {
            return a(syncParam, callback, new n(syncParam));
        }
        if (type == 19) {
            return a(syncParam, callback, new o(syncParam));
        }
        if (type == 2) {
            return a(syncParam, callback, new p(syncParam));
        }
        if (type == 37) {
            return a(syncParam, callback, new a(syncParam));
        }
        if (type == 38) {
            return a(syncParam, callback, new b(syncParam));
        }
        if (type == 39) {
            return a(syncParam, callback, new c(syncParam));
        }
        if (type == 43) {
            return a(syncParam, callback, new d(syncParam));
        }
        if (type == 40) {
            return a(syncParam, callback, new e(syncParam));
        }
        return type == 4 ? a(syncParam, callback, new f(syncParam)) : a(syncParam, callback, new g(syncParam));
    }

    @NotNull
    public final HMSyncGpsDataTaskNew getGpsTask(@NotNull GattPeripheral gattPeripheral, @NotNull HMDeviceSource source, @NotNull Calendar startTime, int version, @NotNull SyncDataCallback<? super List<? extends GpsRecord>> callback) {
        return new HMSyncGpsDataTaskNew(gattPeripheral, source, startTime, version, callback);
    }

    @NotNull
    public final CommonGdspSyncTask<File> getLogTask(@NotNull GattPeripheral gattPeripheral, @NotNull File file, int version, @NotNull IHMDataCallback<File> callback) {
        return new CommonGdspSyncTask<>(gattPeripheral, GdspParamFactory.INSTANCE.getLogParam(version, file), CallbackExtKt.toGdspCallback(callback, file));
    }

    @NotNull
    public final CommonGdspSyncTask<HMPaiData> getPaiTask(@NotNull GattPeripheral gattPeripheral, @NotNull Calendar startTime, int version, @NotNull IHMDataCallback<List<HMPaiData>> callback) {
        return new CommonGdspSyncTask<>(gattPeripheral, GdspParamFactory.INSTANCE.getPaiParam(version, startTime), CallbackExtKt.toGdspCallback(callback));
    }

    @NotNull
    public final CommonGdspSyncTask<List<HMPressureData>> getPressureTask(@NotNull GattPeripheral gattPeripheral, @NotNull Calendar startTime, int version, boolean isSingle, @NotNull IHMPressureDataCallback callback) {
        return new CommonGdspSyncTask<>(gattPeripheral, GdspParamFactory.INSTANCE.getPressureParam(isSingle, startTime, version), CallbackExtKt.toGdspCallack(callback));
    }

    @NotNull
    public final CommonGdspSyncTask<List<HMHrData>> getProHrTask(@NotNull GattPeripheral gattPeripheral, @NotNull Calendar startTime, int version, @NotNull IHMHrDataCallback callback) {
        return new CommonGdspSyncTask<>(gattPeripheral, GdspParamFactory.INSTANCE.getProHrParam(version, startTime), CallbackExtKt.toGdspCallback(callback));
    }

    @NotNull
    public final CommonGdspSyncTask<ActivityDataFragment<ActivityData>> getProSyncDataTask(@NotNull GattPeripheral gattPeripheral, @NotNull Calendar startTime, int version, @NotNull HMDeviceSource source, @NotNull Feature feature, @NotNull IHMActivityDataCallback callback) {
        return new CommonGdspSyncTask<>(gattPeripheral, GdspParamFactory.INSTANCE.getProActivityParam(version, startTime, source, feature), CallbackExtKt.toGdspCallback(callback));
    }

    @NotNull
    public final CommonGdspSyncTask<HMGDSPData> getSingletonTask(@NotNull GattPeripheral gattPeripheral, @NotNull Calendar startTime, @NotNull HMGDSPType type, @NotNull HMDeviceSource source, int version, @NotNull final IHMDataCallback<HMGDSPData> callback) {
        return new CommonGdspSyncTask<>(gattPeripheral, GdspParamFactory.INSTANCE.getSingletonParam(startTime, type, source, version), new IGdspSyncCallback<HMGDSPData>() { // from class: com.xiaomi.hm.health.bt.profile.gdsp.common.GdspFactory.getSingletonTask.1

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            @Nullable
            private HMGDSPData result;

            @Nullable
            public final HMGDSPData getResult() {
                return this.result;
            }

            @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.callback.IGdspSyncCallback
            public void onAllRawData(@NotNull List<RawData> data) {
            }

            @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.callback.IGdspSyncCallback
            public void onData(@NotNull List<? extends HMGDSPData> data) {
                this.result = (HMGDSPData) CollectionsKt.firstOrNull((List) data);
            }

            @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.callback.IGdspSyncCallback
            public void onDataHeader(@NotNull DataHeader header) {
            }

            @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.callback.IGdspSyncCallback
            public void onProgress(long current, long total) {
                callback.onProgress(new Progress((int) total, (int) current));
            }

            @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.callback.IGdspSyncCallback
            public void onResult(@NotNull GDSPErrorCode code) {
                HMGDSPData hMGDSPData = this.result;
                if (hMGDSPData == null) {
                    return;
                }
                callback.onStop(hMGDSPData, GDSPErrorCodeExtKt.toDeviceError(code));
            }

            @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.callback.IGdspSyncCallback
            public void onStart() {
                callback.onStart();
            }

            public final void setResult(@Nullable HMGDSPData hMGDSPData) {
                this.result = hMGDSPData;
            }
        });
    }

    @NotNull
    public final CommonGdspSyncTask<List<Spo2Data>> getSpo2Task(@NotNull GattPeripheral gattPeripheral, @NotNull Calendar startTime, byte type, int version, boolean spo2SupportVersion, @NotNull IHMDataCallback<List<Spo2Data>> mCallback) {
        return new CommonGdspSyncTask<>(gattPeripheral, GdspParamFactory.INSTANCE.getSpo2Param(startTime, type & 255, spo2SupportVersion, version), CallbackExtKt.toGdspListCallback(mCallback));
    }

    @NotNull
    public final CommonGdspSyncTask<List<HMTemperatureData>> getTemperatureTask(@NotNull GattPeripheral gattPeripheral, @NotNull Calendar startTime, int version, @NotNull IHMDataCallback<List<HMTemperatureData>> callback) {
        return new CommonGdspSyncTask<>(gattPeripheral, GdspParamFactory.INSTANCE.getTemperatureParam(startTime, version), CallbackExtKt.toGdspListCallback(callback));
    }

    public final void registerAnalytic(@NotNull IGdspAnalyticCallback gdspAnalyticCallback) {
        mGdspAnalyticCallback = gdspAnalyticCallback;
    }

    public final void resetGdspSyncProfile() {
        mGdspProfileMap.clear();
    }

    public final void unregisterAnalytic() {
        mGdspAnalyticCallback = null;
    }

    @NotNull
    public final CommonGdspSyncTask<List<BloodPressureMeasureResult>> getGdspBloodPressureResultTask(@NotNull GattPeripheral gattPeripheral, @NotNull Calendar startTime, boolean sleepingPressure, @NotNull final IGdspSyncCallback<BloodPressureMeasureResult> callback) {
        return new CommonGdspSyncTask<>(gattPeripheral, sleepingPressure ? GdspParamFactory.INSTANCE.getSleepBloodPressureResultParam(startTime) : GdspParamFactory.INSTANCE.getBloodPressureResultParam(startTime), new IGdspSyncCallback<List<? extends BloodPressureMeasureResult>>() { // from class: com.xiaomi.hm.health.bt.profile.gdsp.common.GdspFactory.getGdspBloodPressureResultTask.1
            @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.callback.IGdspSyncCallback
            public void onAllRawData(@NotNull List<RawData> data) {
            }

            @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.callback.IGdspSyncCallback
            public void onData(@NotNull List<? extends List<? extends BloodPressureMeasureResult>> data) {
                ArrayList arrayList = new ArrayList();
                Iterator<T> it2 = data.iterator();
                while (it2.hasNext()) {
                    arrayList.addAll((List) it2.next());
                }
                callback.onData(arrayList);
            }

            @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.callback.IGdspSyncCallback
            public void onDataHeader(@NotNull DataHeader header) {
                callback.onDataHeader(header);
            }

            @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.callback.IGdspSyncCallback
            public void onProgress(long current, long total) {
                callback.onProgress(current, total);
            }

            @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.callback.IGdspSyncCallback
            public void onResult(@NotNull GDSPErrorCode code) {
                callback.onResult(code);
            }

            @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.callback.IGdspSyncCallback
            public void onStart() {
                callback.onStart();
            }
        });
    }
}
