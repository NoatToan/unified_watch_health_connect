package com.xiaomi.hm.health.device;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.maps.model.LatLng;
import com.huami.bluetooth.profile.channel.module.virtual_sensor.GpsInjectResponse;
import com.huami.bluetooth.profile.ecf.EcfState;
import com.huami.devicex.funapi.ManagerFunctionsKt;
import com.huami.devicex.injection.data.PropertyStoreApi;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.mifit.sportlib.model.GPSPoint;
import com.huami.moving.maps.google.GoogleMapUtil;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMBaseBleDevice;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import com.xiaomi.hm.health.locweather.location.MyLocation;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/xiaomi/hm/health/device/DeviceGpsHelper;", "", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class DeviceGpsHelper {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b!\u0010\"J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u001a\u0010\b\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u0006\u0010\t\u001a\u00020\u0006R\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\u000e8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u000e8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0010R\u0016\u0010\u0017\u001a\u00020\u00168\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006#"}, d2 = {"Lcom/xiaomi/hm/health/device/DeviceGpsHelper$Companion;", "", "Lcom/xiaomi/hm/health/locweather/location/MyLocation;", "loc", "Lcom/xiaomi/hm/health/bt/device/HMBaseBleDevice;", "device", "", "sendLocToDevice", "retrySendLocToDevice", "clearLastLocSendToDevice", "", "a", "Z", "isNeedResend", "", "b", LogUtil.I, "LOC_SCALE", "c", "ALT_SCALE", GoogleApiAvailabilityLight.a, "LOC_CHANGE_THRESHOLD", "", "TAG", "Ljava/lang/String;", "Lcom/huami/devicex/injection/data/PropertyStoreApi;", "e", "Lcom/huami/devicex/injection/data/PropertyStoreApi;", "propertyStoreApi", "Lcom/huami/devicex/manager/DeviceManagerApi;", "f", "Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManagerApi", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {

        @NotNull
        public static final String TAG = "DeviceGpsHelper";

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private static boolean isNeedResend = false;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private static final int LOC_SCALE = 3000000;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private static final int ALT_SCALE = 100;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private static final int LOC_CHANGE_THRESHOLD = 10000;

        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @NotNull
        private static final PropertyStoreApi propertyStoreApi = (PropertyStoreApi) KoinJavaComponent.get$default(PropertyStoreApi.class, null, null, 6, null);

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @NotNull
        private static final DeviceManagerApi deviceManagerApi = ManagerFunctionsKt.getDeviceManagerApi();

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public static final a a = new a();

            public a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "重试将位置信息写入设备";
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<String> {
            public static final b a = new b();

            public b() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "设备未连接,无法写入位置信息,设备连接后重试";
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function0<String> {
            public final /* synthetic */ float a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(float f) {
                super(0);
                this.a = f;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "与上次比较距离变化:" + this.a + " 米";
            }
        }

        private Companion() {
        }

        public final void clearLastLocSendToDevice() {
            PropertyStoreApi propertyStoreApi2 = propertyStoreApi;
            propertyStoreApi2.saveLastLocSendToDevice(null);
            propertyStoreApi2.saveSupportInjectionLoc(true);
        }

        public final void retrySendLocToDevice(@Nullable MyLocation loc, @Nullable HMBaseBleDevice device) {
            if (isNeedResend) {
                HMLog.info(TAG, a.a);
                sendLocToDevice(loc, device);
            }
        }

        public final void sendLocToDevice(@Nullable final MyLocation loc, @Nullable HMBaseBleDevice device) {
            isNeedResend = false;
            if (loc == null) {
                return;
            }
            if (device == null) {
                isNeedResend = true;
                return;
            }
            if (!device.isConnected()) {
                HMLog.info(TAG, b.a);
                isNeedResend = true;
                return;
            }
            if (device instanceof HMMiLiProDevice) {
                PropertyStoreApi propertyStoreApi2 = propertyStoreApi;
                if (propertyStoreApi2.isSupportInjectionLoc()) {
                    HMMiLiProDevice hMMiLiProDevice = (HMMiLiProDevice) device;
                    HMDeviceSource boundDeviceSource = deviceManagerApi.getBoundDeviceSource(hMMiLiProDevice.getDeviceType());
                    if (ConfigHelperKt.hasFeature(boundDeviceSource, Feature.SUPPORT_GPS) || HMDeviceConfig.hasFeatureClassicBtGPS(boundDeviceSource)) {
                        float fDistance = GpsUtils.distance(loc, MyLocation.fromJsonString(propertyStoreApi2.lastLocSendToDevice()));
                        HMLog.info(TAG, new c(fDistance));
                        if (fDistance < 10000.0f) {
                            return;
                        }
                        LatLng latLngConvertToLatLng = GoogleMapUtil.convertToLatLng(new GPSPoint(loc.getLatitude(), loc.getLongitude()));
                        int altitude = loc.isHasAltitude() ? (int) (loc.getAltitude() * ((double) 100)) : -1;
                        double d = latLngConvertToLatLng.longitude;
                        double d2 = LOC_SCALE;
                        hMMiLiProDevice.sendLoc((int) (d * d2), (int) (latLngConvertToLatLng.latitude * d2), altitude, new HMCallback<GpsInjectResponse>() { // from class: com.xiaomi.hm.health.device.DeviceGpsHelper$Companion$sendLocToDevice$3

                            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                            public static final class a extends Lambda implements Function0<String> {
                                public final /* synthetic */ GpsInjectResponse a;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                public a(GpsInjectResponse gpsInjectResponse) {
                                    super(0);
                                    this.a = gpsInjectResponse;
                                }

                                @Override // kotlin.jvm.functions.Function0
                                @Nullable
                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final String getA() {
                                    return "写入位置信息:" + this.a;
                                }
                            }

                            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                            public static final class b extends Lambda implements Function0<String> {
                                public static final b a = new b();

                                public b() {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                @Nullable
                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final String getA() {
                                    return "不支持GPS地址注入";
                                }
                            }

                            @Override // com.xiaomi.hm.health.bt.device.HMCallback
                            public void onFinish(@Nullable GpsInjectResponse response) {
                                HMLog.info(DeviceGpsHelper.Companion.TAG, new a(response));
                                if (response == null) {
                                    return;
                                }
                                if (response.getResult()) {
                                    DeviceGpsHelper.Companion.propertyStoreApi.saveLastLocSendToDevice(loc.toJsonString());
                                    return;
                                }
                                Integer code = response.getCode();
                                if (code != null) {
                                    if (code.intValue() == (EcfState.UNKNOW_COMMAND.getValue() & 255)) {
                                        HMLog.info(DeviceGpsHelper.Companion.TAG, b.a);
                                        DeviceGpsHelper.Companion.propertyStoreApi.saveSupportInjectionLoc(false);
                                    }
                                }
                            }
                        });
                    }
                }
            }
        }
    }
}
