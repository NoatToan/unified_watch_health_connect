package com.xiaomi.fitness.sync.export.di;

import android.content.Context;
import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.sync.export.MyAction1;
import com.xiaomi.fitness.sync.export.model.LocationByNameResp;
import com.xiaomi.fitness.sync.export.model.LocationKey;
import com.xiaomi.fitness.sync.export.model.WeatherResp;
import com.xiaomi.onetrack.api.b;
import defpackage.be1;
import defpackage.kah;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0006\bf\u0018\u0000 <2\u00020\u0001:\u0002<=J/\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\b\f\u0010\rJO\u0010\u0014\u001a\u00020\u00072\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0013\u001a\u00020\u00022\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0002H&¢\u0006\u0004\b\u0014\u0010\u0015J-\u0010\u0016\u001a\u00020\u00022\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0002H&¢\u0006\u0004\b\u0016\u0010\u0017JG\u0010\u0018\u001a\u00020\u00072\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0002H&¢\u0006\u0004\b\u0018\u0010\u0019Ji\u0010$\u001a\u00020\u00072\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001a2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\b\u0010!\u001a\u0004\u0018\u00010 2\b\u0010\"\u001a\u0004\u0018\u00010 2\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\u0006\u0010#\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0002H&¢\u0006\u0004\b$\u0010%J7\u0010'\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d2\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004H&¢\u0006\u0004\b'\u0010(J'\u0010\u0018\u001a\u00020\u00072\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020\u00022\u0006\u0010-\u001a\u00020,H&¢\u0006\u0004\b\u0018\u0010.J8\u00101\u001a\u00020\u00072\b\u0010/\u001a\u0004\u0018\u00010 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b00H¦@¢\u0006\u0004\b1\u00102J'\u00105\u001a\u00020\u00072\b\u00103\u001a\u0004\u0018\u00010 2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020400H&¢\u0006\u0004\b5\u00106J!\u0010:\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\n\u00109\u001a\u000207\"\u000208H&¢\u0006\u0004\b:\u0010;¨\u0006>"}, d2 = {"Lcom/xiaomi/fitness/sync/export/di/WeatherSyncManager;", "", "", "force", "Lcom/xiaomi/fitness/sync/export/MyAction1;", "callback", "mMapHighAccuracy", "", "syncWeatherToConnectedDevices", "(ZLcom/xiaomi/fitness/sync/export/MyAction1;Z)V", "Lcom/xiaomi/fitness/sync/export/di/WeatherSyncManager$ReadWeatherSettingCallBack;", "readWeatherSettingCallBack", "readWeatherSetting", "(Lcom/xiaomi/fitness/sync/export/di/WeatherSyncManager$ReadWeatherSettingCallBack;)V", "", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", TSMAuthContants.PARAM_DEVICE_MODELS, "Lcom/xiaomi/fitness/sync/export/model/LocationKey;", "localLocationKey", "isRequestByDevice", "syncWeatherToDevices", "(Ljava/util/List;ZLcom/xiaomi/fitness/sync/export/model/LocationKey;ZLcom/xiaomi/fitness/sync/export/MyAction1;Z)V", "checkWeatherEnable", "(Ljava/util/List;ZZ)Z", "requestLocation", "(Ljava/util/List;Lcom/xiaomi/fitness/sync/export/MyAction1;Lcom/xiaomi/fitness/sync/export/model/LocationKey;ZZ)V", "", "Lcom/xiaomi/fitness/sync/export/model/WeatherResp$Weather;", b.I, "", "latitude", "longitude", "", "locationKey", "locationName", "isCurrentLocation", "syncWeatherToDevicesReally", "(Ljava/util/List;Lcom/xiaomi/fitness/sync/export/model/WeatherResp$Weather;DDLjava/lang/String;Ljava/lang/String;Lcom/xiaomi/fitness/sync/export/MyAction1;ZZ)V", "deviceModel", "syncWeatherToDeviceForTest", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;DDLcom/xiaomi/fitness/sync/export/MyAction1;)V", "Landroid/content/Context;", "context", "highAccuracy", "Lkah;", "onWeatherLocationCallback", "(Landroid/content/Context;ZLkah;)V", "locationkey", "Lbe1;", "performWeatherRequest", "(Ljava/lang/String;DDLbe1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data", "Lcom/xiaomi/fitness/sync/export/model/LocationByNameResp;", "getCityNameByLocation", "(Ljava/lang/String;Lbe1;)V", "", "", "types", "getNeedSyncDevices", "([I)Ljava/util/List;", "Companion", "ReadWeatherSettingCallBack", "sync-export_release"}, k = 1, mv = {2, 0, 0})
public interface WeatherSyncManager {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/sync/export/di/WeatherSyncManager$Companion;", "", "<init>", "()V", "sync-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/sync/export/di/WeatherSyncManager$ReadWeatherSettingCallBack;", "", "onResult", "", "locationKey", "Lcom/xiaomi/fitness/sync/export/model/LocationKey;", "sync-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface ReadWeatherSettingCallBack {
        void onResult(@Nullable LocationKey locationKey);
    }

    boolean checkWeatherEnable(@NotNull List<WearableDeviceModel> deviceModels, boolean force, boolean isRequestByDevice);

    void getCityNameByLocation(@Nullable String data, @NotNull be1<LocationByNameResp> response);

    @NotNull
    List<WearableDeviceModel> getNeedSyncDevices(@NotNull int... types);

    @Nullable
    Object performWeatherRequest(@Nullable String str, double d, double d2, @NotNull be1<WeatherResp.Weather> be1Var, @NotNull Continuation<? super Unit> continuation);

    void readWeatherSetting(@Nullable ReadWeatherSettingCallBack readWeatherSettingCallBack);

    void requestLocation(@NotNull Context context, boolean highAccuracy, @NotNull kah onWeatherLocationCallback);

    void requestLocation(@NotNull List<WearableDeviceModel> deviceModels, @Nullable MyAction1<Boolean> callback, @Nullable LocationKey localLocationKey, boolean mMapHighAccuracy, boolean isRequestByDevice);

    void syncWeatherToConnectedDevices(boolean force, @Nullable MyAction1<Boolean> callback, boolean mMapHighAccuracy);

    void syncWeatherToDeviceForTest(@NotNull WearableDeviceModel deviceModel, double longitude, double latitude, @Nullable MyAction1<Boolean> callback);

    void syncWeatherToDevices(@NotNull List<WearableDeviceModel> deviceModels, boolean force, @Nullable LocationKey localLocationKey, boolean isRequestByDevice, @Nullable MyAction1<Boolean> callback, boolean mMapHighAccuracy);

    void syncWeatherToDevicesReally(@NotNull List<? extends WearableDeviceModel> deviceModels, @NotNull WeatherResp.Weather response, double latitude, double longitude, @Nullable String locationKey, @Nullable String locationName, @Nullable MyAction1<Boolean> callback, boolean isCurrentLocation, boolean isRequestByDevice);
}
