package com.xiaomi.fitness.sync.weather;

import android.content.Context;
import com.google.gson.Gson;
import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.GsonExtKt;
import com.xiaomi.fitness.common.extensions.PermissionExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.NetUtil;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.HuamiApiCaller;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.Feature;
import com.xiaomi.fitness.devicesettings.export.DeviceSettingsExportPreference;
import com.xiaomi.fitness.settingitem.DeviceSettingConfigKey;
import com.xiaomi.fitness.settingitem.DeviceSettingManager;
import com.xiaomi.fitness.settingitem.settingitem.WeatherSetting;
import com.xiaomi.fitness.sync.SyncEngine;
import com.xiaomi.fitness.sync.WeatherLocationService;
import com.xiaomi.fitness.sync.export.MyAction1;
import com.xiaomi.fitness.sync.export.SyncPreference;
import com.xiaomi.fitness.sync.export.di.WeatherSyncManager;
import com.xiaomi.fitness.sync.export.model.LocationByNameResp;
import com.xiaomi.fitness.sync.export.model.LocationKey;
import com.xiaomi.fitness.sync.export.model.WeatherResp;
import com.xiaomi.fitness.sync.net.SyncRequest;
import com.xiaomi.fitness.sync.util.BlueToothSender;
import com.xiaomi.fitness.sync.util.HuamiWeatherSender;
import com.xiaomi.fitness.sync.util.SyncUtil;
import com.xiaomi.hm.health.bt.profile.weather.weathermodule.City;
import com.xiaomi.onetrack.api.b;
import defpackage.be1;
import defpackage.c9r;
import defpackage.e9r;
import defpackage.kah;
import defpackage.s7r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\bK\u0010LJK\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010JK\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0011\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0010J'\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0018\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0019\u0010\u0017J\u000f\u0010\u001a\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ/\u0010 \u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\f2\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u001d2\u0006\u0010\u001f\u001a\u00020\fH\u0016¢\u0006\u0004\b \u0010!J\u0019\u0010$\u001a\u00020\u000e2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b$\u0010%J-\u0010)\u001a\u00020\f2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00020&2\u0006\u0010\u001c\u001a\u00020\f2\u0006\u0010(\u001a\u00020\fH\u0016¢\u0006\u0004\b)\u0010*JO\u0010-\u001a\u00020\u000e2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00020&2\u0006\u0010\u001c\u001a\u00020\f2\b\u0010,\u001a\u0004\u0018\u00010+2\u0006\u0010(\u001a\u00020\f2\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u001d2\u0006\u0010\u001f\u001a\u00020\fH\u0016¢\u0006\u0004\b-\u0010.JG\u0010/\u001a\u00020\u000e2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00020&2\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u001d2\b\u0010,\u001a\u0004\u0018\u00010+2\u0006\u0010\u001f\u001a\u00020\f2\u0006\u0010(\u001a\u00020\fH\u0016¢\u0006\u0004\b/\u00100Ji\u00103\u001a\u00020\u000e2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u0002012\u0006\u00102\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\t2\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u001d2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010(\u001a\u00020\fH\u0016¢\u0006\u0004\b3\u00104J7\u00105\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u001dH\u0016¢\u0006\u0004\b5\u00106J'\u0010/\u001a\u00020\u000e2\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u00020\f2\u0006\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b/\u0010<J8\u0010?\u001a\u00020\u000e2\b\u0010=\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u00040>H\u0096@¢\u0006\u0004\b?\u0010@J'\u0010C\u001a\u00020\u000e2\b\u0010A\u001a\u0004\u0018\u00010\t2\f\u00102\u001a\b\u0012\u0004\u0012\u00020B0>H\u0016¢\u0006\u0004\bC\u0010DJ!\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00020&2\n\u0010G\u001a\u00020E\"\u00020FH\u0016¢\u0006\u0004\bH\u0010IR\u0014\u0010J\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010\u001b¨\u0006M"}, d2 = {"Lcom/xiaomi/fitness/sync/weather/SyncWeatherManagerImp;", "Lcom/xiaomi/fitness/sync/export/di/WeatherSyncManager;", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "deviceModel", "Lcom/xiaomi/fitness/sync/export/model/WeatherResp$Weather;", "weather", "", "latitude", "longitude", "", "locationKey", "locationName", "", "currentLocation", "", "updateHuamiDeviceLocation", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;Lcom/xiaomi/fitness/sync/export/model/WeatherResp$Weather;DDLjava/lang/String;Ljava/lang/String;Z)V", "isCurrentLocation", "updateBLEDeviceLocation", "postWeather", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;Lcom/xiaomi/fitness/sync/export/model/WeatherResp$Weather;Z)V", "model", "isSyncStock", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;)Z", "isSyncCalendar", "isSyncSleepModel", "hasLocationPermission", "()Z", "force", "Lcom/xiaomi/fitness/sync/export/MyAction1;", "callback", "mMapHighAccuracy", "syncWeatherToConnectedDevices", "(ZLcom/xiaomi/fitness/sync/export/MyAction1;Z)V", "Lcom/xiaomi/fitness/sync/export/di/WeatherSyncManager$ReadWeatherSettingCallBack;", "readWeatherSettingCallBack", "readWeatherSetting", "(Lcom/xiaomi/fitness/sync/export/di/WeatherSyncManager$ReadWeatherSettingCallBack;)V", "", TSMAuthContants.PARAM_DEVICE_MODELS, "isRequestByDevice", "checkWeatherEnable", "(Ljava/util/List;ZZ)Z", "Lcom/xiaomi/fitness/sync/export/model/LocationKey;", "localLocationKey", "syncWeatherToDevices", "(Ljava/util/List;ZLcom/xiaomi/fitness/sync/export/model/LocationKey;ZLcom/xiaomi/fitness/sync/export/MyAction1;Z)V", "requestLocation", "(Ljava/util/List;Lcom/xiaomi/fitness/sync/export/MyAction1;Lcom/xiaomi/fitness/sync/export/model/LocationKey;ZZ)V", "", b.I, "syncWeatherToDevicesReally", "(Ljava/util/List;Lcom/xiaomi/fitness/sync/export/model/WeatherResp$Weather;DDLjava/lang/String;Ljava/lang/String;Lcom/xiaomi/fitness/sync/export/MyAction1;ZZ)V", "syncWeatherToDeviceForTest", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;DDLcom/xiaomi/fitness/sync/export/MyAction1;)V", "Landroid/content/Context;", "context", "highAccuracy", "Lkah;", "onWeatherLocationCallback", "(Landroid/content/Context;ZLkah;)V", "locationkey", "Lbe1;", "performWeatherRequest", "(Ljava/lang/String;DDLbe1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data", "Lcom/xiaomi/fitness/sync/export/model/LocationByNameResp;", "getCityNameByLocation", "(Ljava/lang/String;Lbe1;)V", "", "", "types", "getNeedSyncDevices", "([I)Ljava/util/List;", "isChangeLang", "<init>", "()V", "sync_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SyncWeatherManagerImp implements WeatherSyncManager {

    /* JADX INFO: renamed from: com.xiaomi.fitness.sync.weather.SyncWeatherManagerImp$syncWeatherToDeviceForTest$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sync.weather.SyncWeatherManagerImp$syncWeatherToDeviceForTest$1", f = "SyncWeatherManagerImp.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C32381 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ MyAction1<Boolean> $callback;
        final /* synthetic */ List<WearableDeviceModel> $devices;
        final /* synthetic */ double $latitude;
        final /* synthetic */ double $longitude;
        int label;
        final /* synthetic */ SyncWeatherManagerImp this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C32381(double d, double d2, SyncWeatherManagerImp syncWeatherManagerImp, List<WearableDeviceModel> list, MyAction1<Boolean> myAction1, Continuation<? super C32381> continuation) {
            super(2, continuation);
            this.$latitude = d;
            this.$longitude = d2;
            this.this$0 = syncWeatherManagerImp;
            this.$devices = list;
            this.$callback = myAction1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C32381(this.$latitude, this.$longitude, this.this$0, this.$devices, this.$callback, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            SyncRequest syncRequest = SyncRequest.INSTANCE;
            final double d = this.$latitude;
            final double d2 = this.$longitude;
            final SyncWeatherManagerImp syncWeatherManagerImp = this.this$0;
            final List<WearableDeviceModel> list = this.$devices;
            final MyAction1<Boolean> myAction1 = this.$callback;
            syncRequest.performWeatherRequest(d, d2, null, new be1<WeatherResp.Weather>() { // from class: com.xiaomi.fitness.sync.weather.SyncWeatherManagerImp.syncWeatherToDeviceForTest.1.1
                @Override // defpackage.be1
                public void onFailure() {
                    MyAction1<Boolean> myAction2 = myAction1;
                    if (myAction2 != null) {
                        myAction2.call(Boolean.FALSE);
                    }
                }

                @Override // defpackage.be1
                public void onResponse(WeatherResp.Weather response) {
                    Intrinsics.checkNotNullParameter(response, "response");
                    Logger.i("Wearable.weather", "Weather Request Response!! locationKey = " + response.locationKey);
                    SyncWeatherManagerImp syncWeatherManagerImp2 = syncWeatherManagerImp;
                    List<WearableDeviceModel> list2 = list;
                    SyncUtil syncUtil = SyncUtil.INSTANCE;
                    syncWeatherManagerImp2.syncWeatherToDevicesReally(list2, response, syncUtil.getDoubleLen3(d), syncUtil.getDoubleLen3(d2), response.locationKey, response.location_name, myAction1, true, false);
                }
            });
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C32381) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private final boolean hasLocationPermission() {
        return PermissionExtKt.isPermissionGranted(ApplicationExtKt.getApplication(), "android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION");
    }

    private final boolean isChangeLang() {
        return false;
    }

    private final boolean isSyncCalendar(WearableDeviceModel deviceModel) {
        return DeviceModelExtKt.isSupportFeature(deviceModel, "calendar") && SyncPreference.INSTANCE.isNeedSyncSchedule(deviceModel.getDid());
    }

    private final boolean isSyncSleepModel(WearableDeviceModel deviceModel) {
        return DeviceModelExtKt.isSupportFeature(deviceModel, "bedtime_clock") && DeviceSettingsExportPreference.INSTANCE.getKEY_IS_SYNC_SLEEP_MODEL();
    }

    private final boolean isSyncStock(WearableDeviceModel model) {
        return DeviceModelExtKt.isSupportFeature(model, "stock");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void postWeather(WearableDeviceModel deviceModel, WeatherResp.Weather weather, boolean isCurrentLocation) {
        if (DeviceModelExtKt.isBluetooth(deviceModel)) {
            BlueToothSender.INSTANCE.handleWeather(deviceModel.getDid(), weather, isCurrentLocation);
        } else if (DeviceModelExtKt.isHuaMi(deviceModel)) {
            HuamiWeatherSender.INSTANCE.setWeatherInfo(deviceModel.getDid(), weather);
        }
    }

    private final void updateBLEDeviceLocation(final WearableDeviceModel deviceModel, final WeatherResp.Weather weather, double latitude, double longitude, String locationKey, String locationName, final boolean isCurrentLocation) {
        if (!isCurrentLocation) {
            postWeather(deviceModel, weather, false);
            return;
        }
        final ArrayList arrayList = new ArrayList();
        c9r c9rVar = new c9r();
        c9rVar.d = weather.location_name;
        c9rVar.c = weather.locationKey;
        Unit unit = Unit.INSTANCE;
        arrayList.add(0, c9rVar);
        s7r s7rVar = new s7r();
        s7rVar.e = 10;
        s7rVar.f = 5;
        SyncPreference syncPreference = SyncPreference.INSTANCE;
        final LocationKey locationKey2 = syncPreference.getWeatherLocation().length() == 0 ? null : (LocationKey) GsonExtKt.toObject(new Gson(), syncPreference.getWeatherLocation(), LocationKey.class);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.sync.weather.SyncWeatherManagerImp.updateBLEDeviceLocation.2
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                this.postWeather(deviceModel, weather, isCurrentLocation);
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                String str;
                s7r packet;
                e9r e9rVarH;
                c9r.a aVarP;
                s7r packet2;
                e9r e9rVarH2;
                c9r.a aVarP2;
                c9r[] c9rVarArr;
                s7r packet3;
                e9r e9rVarH3;
                c9r.a aVarP3;
                c9r[] c9rVarArr2 = (result == null || (packet3 = result.getPacket()) == null || (e9rVarH3 = packet3.H()) == null || (aVarP3 = e9rVarH3.p()) == null) ? null : aVarP3.c;
                if (c9rVarArr2 != null && c9rVarArr2.length != 0) {
                    LocationKey locationKey3 = locationKey2;
                    Logger.i("Wearable.weather", "defaultLocation:" + (locationKey3 != null ? locationKey3.locationKey : null) + " getWeatherCityList onSuccess list:" + ((result == null || (packet2 = result.getPacket()) == null || (e9rVarH2 = packet2.H()) == null || (aVarP2 = e9rVarH2.p()) == null || (c9rVarArr = aVarP2.c) == null) ? null : ArraysKt___ArraysKt.toMutableList(c9rVarArr)));
                    c9r[] c9rVarArr3 = (result == null || (packet = result.getPacket()) == null || (e9rVarH = packet.H()) == null || (aVarP = e9rVarH.p()) == null) ? null : aVarP.c;
                    Intrinsics.checkNotNull(c9rVarArr3);
                    List<c9r> mutableList = ArraysKt___ArraysKt.toMutableList(c9rVarArr3);
                    WeatherResp.Weather weather2 = weather;
                    LocationKey locationKey4 = locationKey2;
                    List<c9r> list = arrayList;
                    for (c9r c9rVar2 : mutableList) {
                        String str2 = c9rVar2.c;
                        if (str2 != null && str2.length() != 0 && (str = c9rVar2.d) != null && str.length() != 0 && !Intrinsics.areEqual(weather2.locationKey, c9rVar2.c)) {
                            if (!Intrinsics.areEqual(locationKey4 != null ? locationKey4.locationKey : null, c9rVar2.c)) {
                                Intrinsics.checkNotNull(c9rVar2);
                                list.add(c9rVar2);
                            }
                        }
                    }
                }
                s7r s7rVar2 = new s7r();
                s7rVar2.e = 10;
                s7rVar2.f = 6;
                e9r e9rVar = new e9r();
                c9r.a aVar = new c9r.a();
                aVar.c = (c9r[]) arrayList.toArray(new c9r[0]);
                e9rVar.t(aVar);
                s7rVar2.f0(e9rVar);
                DeviceContact deviceSyncExtKt = DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE);
                String did2 = deviceModel.getDid();
                final List<c9r> list2 = arrayList;
                final SyncWeatherManagerImp syncWeatherManagerImp = this;
                final WearableDeviceModel wearableDeviceModel = deviceModel;
                final WeatherResp.Weather weather3 = weather;
                final boolean z = isCurrentLocation;
                DeviceContact.DefaultImpls.call$default(deviceSyncExtKt, did2, s7rVar2, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.sync.weather.SyncWeatherManagerImp$updateBLEDeviceLocation$2$onSuccess$2
                    @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                    public void onError(String did3, int type2, int code) {
                        Logger.i("Wearable.weather", "BLE updateCityList failed code:" + code);
                        syncWeatherManagerImp.postWeather(wearableDeviceModel, weather3, z);
                    }

                    @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                    public void onSuccess(String did3, int type2, SyncResult result2) {
                        Logger.i("Wearable.weather", "BLE updateCityList onSuccess updateCityKeyList:" + list2);
                        syncWeatherManagerImp.postWeather(wearableDeviceModel, weather3, z);
                    }
                }, 0, 16, (Object) null);
            }
        }, 0, 8, null);
        String json = new Gson().toJson(new LocationKey(latitude, longitude, locationKey, weather.city_name, locationName, true));
        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
        syncPreference.setWeatherLocation(json);
    }

    private final void updateHuamiDeviceLocation(WearableDeviceModel deviceModel, WeatherResp.Weather weather, double latitude, double longitude, String locationKey, String locationName, boolean currentLocation) {
        if (currentLocation) {
            DeviceSettingManager.Companion companion = DeviceSettingManager.INSTANCE;
            Object objValueToObject = companion.getInstance().readSettingItem(deviceModel.getDid(), DeviceSettingConfigKey.KEY_WEATHERSETTING).valueToObject(WeatherSetting.class);
            WeatherSetting weatherSetting = objValueToObject instanceof WeatherSetting ? (WeatherSetting) objValueToObject : null;
            if (weatherSetting == null) {
                weatherSetting = new WeatherSetting();
            }
            LocationKey locationKey2 = new LocationKey();
            locationKey2.latitude = latitude;
            locationKey2.longitude = longitude;
            String str = weather.locationKey;
            if (str != null) {
                locationKey = str;
            }
            locationKey2.locationKey = locationKey;
            String str2 = weather.location_name;
            if (str2 != null && str2.length() != 0) {
                locationName = weather.location_name;
            } else if (locationName == null || locationName.length() == 0) {
                locationName = "";
            }
            locationKey2.locationName = locationName;
            locationKey2.isUserAutoLocation = true;
            weatherSetting.setSyncOpen(true);
            String json = new Gson().toJson(locationKey2);
            Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
            weatherSetting.setLocationKey(json);
            companion.getInstance().sendSettingItem(deviceModel.getDid(), DeviceSettingConfigKey.KEY_WEATHERSETTING, weatherSetting);
        }
        if (!DeviceModelExtKt.isL66(deviceModel)) {
            postWeather(deviceModel, weather, currentLocation);
            return;
        }
        String locationKey3 = weather.locationKey;
        Intrinsics.checkNotNullExpressionValue(locationKey3, "locationKey");
        String location_name = weather.location_name;
        Intrinsics.checkNotNullExpressionValue(location_name, "location_name");
        City city = new City(locationKey3, location_name);
        Logger.i("Wearable.weather", "L66 updateWeatherSettings weather.locationKey = " + weather.locationKey + " weather.location_name = " + weather.location_name);
        com.xiaomi.hm.health.bt.profile.weather.weathermodule.WeatherSetting weatherSetting2 = new com.xiaomi.hm.health.bt.profile.weather.weathermodule.WeatherSetting(null, city, null);
        HuamiApiCaller huaMiApiCaller = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getHuaMiApiCaller(DeviceModelExtKt.getMac(deviceModel));
        if (huaMiApiCaller == null) {
            return;
        }
        huaMiApiCaller.updateWeatherSettings(weatherSetting2);
    }

    @Override // com.xiaomi.fitness.sync.export.di.WeatherSyncManager
    public boolean checkWeatherEnable(@NotNull List<WearableDeviceModel> deviceModels, boolean force, boolean isRequestByDevice) {
        Intrinsics.checkNotNullParameter(deviceModels, "deviceModels");
        if (!NetUtil.INSTANCE.getNetWorkAvailable(ApplicationExtKt.getApplication())) {
            Logger.i("Wearable.weather", "networkAvailable");
            return false;
        }
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            return false;
        }
        if (!DeviceModelExtKt.isSupportFeature(wearableDeviceModel, "weather") && !DeviceModelExtKt.isSupportFeature(wearableDeviceModel, Feature.ATMO_PRESURE)) {
            Logger.i("Wearable.weather", "syncWeatherToDevices no feature");
            return false;
        }
        if (!isRequestByDevice) {
            if (DeviceModelExtKt.isBluetooth(wearableDeviceModel)) {
                if (!DeviceModelExtKt.isSupportFeature(wearableDeviceModel, Feature.ATMO_PRESURE)) {
                    return SyncPreference.INSTANCE.isNeedSyncWeather(wearableDeviceModel.getDid());
                }
            } else {
                if (!DeviceModelExtKt.isHuaMi(wearableDeviceModel)) {
                    return false;
                }
                Object objValueToObject = DeviceSettingManager.INSTANCE.getInstance().readSettingItem(wearableDeviceModel.getDid(), DeviceSettingConfigKey.KEY_WEATHERSETTING).valueToObject(WeatherSetting.class);
                WeatherSetting weatherSetting = objValueToObject instanceof WeatherSetting ? (WeatherSetting) objValueToObject : null;
                if (weatherSetting != null) {
                    return weatherSetting.isSyncOpen();
                }
            }
        }
        return true;
    }

    @Override // com.xiaomi.fitness.sync.export.di.WeatherSyncManager
    public void getCityNameByLocation(@Nullable String data, @NotNull be1<LocationByNameResp> response) {
        Intrinsics.checkNotNullParameter(response, "response");
        SyncRequest.INSTANCE.getCityNameByLocation(data, response);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0053  */
    @Override // com.xiaomi.fitness.sync.export.di.WeatherSyncManager
    @NotNull
    public List<WearableDeviceModel> getNeedSyncDevices(@NotNull int... types) {
        Intrinsics.checkNotNullParameter(types, "types");
        ArrayList arrayList = new ArrayList();
        List<T> deviceModels = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceModels();
        if (!deviceModels.isEmpty()) {
            for (T t : deviceModels) {
                if (DeviceModelExtKt.isBluetooth(t) && t.getIsDeviceConnected()) {
                    boolean z = false;
                    for (int i : types) {
                        if (i == 0) {
                            boolean zIsSupportFeature = DeviceModelExtKt.isSupportFeature(t, "weather");
                            Logger.i("Wearable.weather", "getNeedSyncDevices isSyncWeather:" + zIsSupportFeature);
                            if (zIsSupportFeature) {
                                z = true;
                            }
                        } else if (i == 1 || (i == 2 ? isSyncStock(t) : !(i == 3 ? !isSyncCalendar(t) : i == 4 ? !isSyncSleepModel(t) : i != 5))) {
                            z = true;
                        }
                        if (z) {
                            break;
                        }
                    }
                    if (z) {
                        arrayList.add(t);
                    }
                }
            }
        }
        return arrayList;
    }

    @Override // com.xiaomi.fitness.sync.export.di.WeatherSyncManager
    @Nullable
    public Object performWeatherRequest(@Nullable String str, double d, double d2, @NotNull be1<WeatherResp.Weather> be1Var, @NotNull Continuation<? super Unit> continuation) {
        Object objPerformWeatherRequest = SyncRequest.INSTANCE.performWeatherRequest(str, d2, d, be1Var, continuation);
        return objPerformWeatherRequest == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objPerformWeatherRequest : Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.sync.export.di.WeatherSyncManager
    public void readWeatherSetting(@Nullable WeatherSyncManager.ReadWeatherSettingCallBack readWeatherSettingCallBack) {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            if (readWeatherSettingCallBack != null) {
                readWeatherSettingCallBack.onResult(null);
                return;
            }
            return;
        }
        if (DeviceModelExtKt.isBluetooth(wearableDeviceModel)) {
            SyncPreference syncPreference = SyncPreference.INSTANCE;
            if (syncPreference.getWeatherLocation().length() == 0) {
                Logger.i("Wearable.weather", "readWeatherSetting BleDeviceModel locationKey null");
                if (readWeatherSettingCallBack != null) {
                    readWeatherSettingCallBack.onResult(null);
                    return;
                }
                return;
            }
            LocationKey locationKey = (LocationKey) GsonExtKt.toObject(new Gson(), syncPreference.getWeatherLocation(), LocationKey.class);
            Logger.i("Wearable.weather", "readWeatherSetting BleDeviceModel locationKey:" + locationKey.locationKey + " locationName:" + locationKey.locationName + " latitude:" + locationKey.latitude + " longitude:" + locationKey.longitude);
            if (readWeatherSettingCallBack != null) {
                readWeatherSettingCallBack.onResult(locationKey);
                return;
            }
            return;
        }
        if (!DeviceModelExtKt.isHuaMi(wearableDeviceModel)) {
            Logger.i("Wearable.weather", "readWeatherSetting else " + wearableDeviceModel);
            if (readWeatherSettingCallBack != null) {
                readWeatherSettingCallBack.onResult(null);
                return;
            }
            return;
        }
        Object objValueToObject = DeviceSettingManager.INSTANCE.getInstance().readSettingItem(wearableDeviceModel.getDid(), DeviceSettingConfigKey.KEY_WEATHERSETTING).valueToObject(WeatherSetting.class);
        WeatherSetting weatherSetting = objValueToObject instanceof WeatherSetting ? (WeatherSetting) objValueToObject : null;
        if (weatherSetting == null) {
            Logger.i("Wearable.weather", "readWeatherSetting HuaMiDeviceModel no itemInfo");
            if (readWeatherSettingCallBack != null) {
                readWeatherSettingCallBack.onResult(null);
                return;
            }
            return;
        }
        String locationKey2 = weatherSetting.getLocationKey();
        if (locationKey2 == null || locationKey2.length() == 0) {
            Logger.i("Wearable.weather", "readWeatherSetting HuaMiDeviceModel locationKey null");
            if (readWeatherSettingCallBack != null) {
                readWeatherSettingCallBack.onResult(null);
                return;
            }
            return;
        }
        Gson gson = new Gson();
        String locationKey3 = weatherSetting.getLocationKey();
        Intrinsics.checkNotNullExpressionValue(locationKey3, "getLocationKey(...)");
        LocationKey locationKey4 = (LocationKey) GsonExtKt.toObject(gson, locationKey3, LocationKey.class);
        Logger.i("Wearable.weather", "readWeatherSetting HuaMiDeviceModel locationKey:" + locationKey4.locationKey + " locationName:" + locationKey4.locationName + " latitude:" + locationKey4.latitude + " longitude:" + locationKey4.longitude);
        if (readWeatherSettingCallBack != null) {
            readWeatherSettingCallBack.onResult(locationKey4);
        }
    }

    @Override // com.xiaomi.fitness.sync.export.di.WeatherSyncManager
    public void requestLocation(@NotNull Context context, boolean highAccuracy, @NotNull kah onWeatherLocationCallback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(onWeatherLocationCallback, "onWeatherLocationCallback");
        WeatherLocationService.INSTANCE.requestLocation(context, highAccuracy, onWeatherLocationCallback);
    }

    @Override // com.xiaomi.fitness.sync.export.di.WeatherSyncManager
    public void syncWeatherToConnectedDevices(final boolean force, @Nullable final MyAction1<Boolean> callback, final boolean mMapHighAccuracy) {
        Logger.i("Wearable.weather", "syncWeatherToConnectedDevices start force:" + force);
        final ArrayList arrayList = new ArrayList();
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            return;
        }
        if (DeviceModelExtKt.isBluetooth(wearableDeviceModel)) {
            arrayList.addAll(getNeedSyncDevices(0, 1));
        } else {
            arrayList.add(wearableDeviceModel);
        }
        if (arrayList.isEmpty()) {
            if (callback != null) {
                callback.call(Boolean.FALSE);
                return;
            }
            return;
        }
        boolean zCheckWeatherEnable = checkWeatherEnable(arrayList, force, false);
        Logger.i("Wearable.weather", "isNeedSyncWeather: " + zCheckWeatherEnable + " isRequestByDevice:false");
        if (zCheckWeatherEnable) {
            readWeatherSetting(new WeatherSyncManager.ReadWeatherSettingCallBack() { // from class: com.xiaomi.fitness.sync.weather.SyncWeatherManagerImp.syncWeatherToConnectedDevices.1
                @Override // com.xiaomi.fitness.sync.export.di.WeatherSyncManager.ReadWeatherSettingCallBack
                public void onResult(LocationKey locationKey) {
                    SyncWeatherManagerImp.this.syncWeatherToDevices(arrayList, force, locationKey, false, callback, mMapHighAccuracy);
                }
            });
        } else if (callback != null) {
            callback.call(Boolean.FALSE);
        }
    }

    @Override // com.xiaomi.fitness.sync.export.di.WeatherSyncManager
    public void syncWeatherToDeviceForTest(@NotNull WearableDeviceModel deviceModel, double longitude, double latitude, @Nullable MyAction1<Boolean> callback) {
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        ArrayList arrayList = new ArrayList();
        arrayList.add(deviceModel);
        AnyExtKt.io$default(null, new C32381(latitude, longitude, this, arrayList, callback, null), 1, null);
    }

    @Override // com.xiaomi.fitness.sync.export.di.WeatherSyncManager
    public void syncWeatherToDevices(@NotNull final List<WearableDeviceModel> deviceModels, boolean force, @Nullable final LocationKey localLocationKey, final boolean isRequestByDevice, @Nullable final MyAction1<Boolean> callback, boolean mMapHighAccuracy) {
        String str;
        Intrinsics.checkNotNullParameter(deviceModels, "deviceModels");
        Logger.i("Wearable.weather", "syncWeatherToDevices localLocationKey locationKey:" + (localLocationKey != null ? localLocationKey.locationKey : null) + " locationName:" + (localLocationKey != null ? localLocationKey.locationName : null) + " latitude:" + (localLocationKey != null ? Double.valueOf(localLocationKey.latitude) : null) + " longitude:" + (localLocationKey != null ? Double.valueOf(localLocationKey.longitude) : null) + ",  isUserAutoLocation:" + (localLocationKey != null ? Boolean.valueOf(localLocationKey.isUserAutoLocation) : null));
        Iterator<WearableDeviceModel> it = deviceModels.iterator();
        int i = 0;
        boolean z = false;
        while (it.hasNext()) {
            WearableDeviceModel next = it.next();
            SyncUtil syncUtil = SyncUtil.INSTANCE;
            long syncTimeLong = syncUtil.getSyncTimeLong(i, next.getDid());
            long syncTimeLong2 = syncUtil.getSyncTimeLong(1, next.getDid());
            long syncTimeLong3 = syncUtil.getSyncTimeLong(6, next.getDid());
            Logger.i("Wearable.weather", "syncWeatherToDevices weatherLastTime = " + syncTimeLong + "  pressureLastTime" + syncTimeLong2 + "  weatherLocationLastTime" + syncTimeLong3);
            boolean zIsSupportFeature = DeviceModelExtKt.isSupportFeature(next, "weather");
            if (hasLocationPermission() && System.currentTimeMillis() - syncTimeLong3 >= 3600000 && localLocationKey != null && localLocationKey.isUserAutoLocation) {
                Logger.i("Wearable.weather", "syncWeatherToDevices needUpdateLocation");
                z = true;
            }
            if (localLocationKey != null && !isChangeLang() && !force && ((syncTimeLong > 0 && System.currentTimeMillis() - syncTimeLong < SyncEngine.SYNC_WEATHER_DURATION) || (!zIsSupportFeature && syncTimeLong2 > 0 && System.currentTimeMillis() - syncTimeLong2 < SyncEngine.SYNC_WEATHER_DURATION))) {
                Logger.i("Wearable.weather", "syncWeatherToDevices duration limit");
                if (!z) {
                    it.remove();
                }
            }
            i = 0;
        }
        if (deviceModels.isEmpty()) {
            if (callback != null) {
                callback.call(Boolean.FALSE);
                return;
            }
            return;
        }
        if (z) {
            requestLocation(deviceModels, callback, localLocationKey, mMapHighAccuracy, isRequestByDevice);
            return;
        }
        if (localLocationKey != null && (((str = localLocationKey.locationKey) != null && str.length() != 0) || (localLocationKey.latitude != 0.0d && localLocationKey.longitude != 0.0d))) {
            SyncRequest.INSTANCE.performWeatherRequest(localLocationKey.latitude, localLocationKey.longitude, localLocationKey, new be1<WeatherResp.Weather>() { // from class: com.xiaomi.fitness.sync.weather.SyncWeatherManagerImp.syncWeatherToDevices.1
                @Override // defpackage.be1
                public void onFailure() {
                    MyAction1<Boolean> myAction1 = callback;
                    if (myAction1 != null) {
                        myAction1.call(Boolean.FALSE);
                    }
                }

                @Override // defpackage.be1
                public void onResponse(WeatherResp.Weather response) {
                    Intrinsics.checkNotNullParameter(response, "response");
                    SyncWeatherManagerImp syncWeatherManagerImp = SyncWeatherManagerImp.this;
                    List<WearableDeviceModel> list = deviceModels;
                    LocationKey locationKey = localLocationKey;
                    syncWeatherManagerImp.syncWeatherToDevicesReally(list, response, locationKey.latitude, locationKey.longitude, response.locationKey, response.location_name, callback, locationKey.isUserAutoLocation, isRequestByDevice);
                }
            });
            return;
        }
        if (hasLocationPermission()) {
            requestLocation(deviceModels, callback, null, mMapHighAccuracy, isRequestByDevice);
            return;
        }
        SyncUtil syncUtil2 = SyncUtil.INSTANCE;
        Logger.i("Wearable.weather", "no location permission cancel isForeground: fine:" + syncUtil2.hasFineLocationPermission() + "  coarse:" + syncUtil2.hasCoarseLocationPermission());
        if (callback != null) {
            callback.call(Boolean.FALSE);
        }
    }

    @Override // com.xiaomi.fitness.sync.export.di.WeatherSyncManager
    public void syncWeatherToDevicesReally(@NotNull List<? extends WearableDeviceModel> deviceModels, @NotNull WeatherResp.Weather response, double latitude, double longitude, @Nullable String locationKey, @Nullable String locationName, @Nullable MyAction1<Boolean> callback, boolean isCurrentLocation, boolean isRequestByDevice) {
        Intrinsics.checkNotNullParameter(deviceModels, "deviceModels");
        Intrinsics.checkNotNullParameter(response, "response");
        for (WearableDeviceModel wearableDeviceModel : deviceModels) {
            if (!DeviceModelExtKt.isBluetooth(wearableDeviceModel)) {
                SyncUtil.INSTANCE.setSyncTimeLong(0, wearableDeviceModel.getDid(), System.currentTimeMillis());
            } else if (DeviceModelExtKt.isSupportFeature(wearableDeviceModel, "weather")) {
                SyncUtil.INSTANCE.setSyncTimeLong(0, wearableDeviceModel.getDid(), System.currentTimeMillis());
            } else {
                SyncUtil.INSTANCE.setSyncTimeLong(1, wearableDeviceModel.getDid(), System.currentTimeMillis());
            }
        }
        WearableDeviceModel wearableDeviceModel2 = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel2 == null) {
            return;
        }
        if (DeviceModelExtKt.isBluetooth(wearableDeviceModel2)) {
            updateBLEDeviceLocation(wearableDeviceModel2, response, latitude, longitude, locationKey, locationName, isCurrentLocation);
        } else if (DeviceModelExtKt.isHuaMi(wearableDeviceModel2)) {
            updateHuamiDeviceLocation(wearableDeviceModel2, response, latitude, longitude, locationKey, locationName, isCurrentLocation);
        }
        if (callback != null) {
            callback.call(Boolean.TRUE);
        }
    }

    @Override // com.xiaomi.fitness.sync.export.di.WeatherSyncManager
    public void requestLocation(@NotNull final List<WearableDeviceModel> deviceModels, @Nullable final MyAction1<Boolean> callback, @Nullable final LocationKey localLocationKey, boolean mMapHighAccuracy, final boolean isRequestByDevice) {
        Intrinsics.checkNotNullParameter(deviceModels, "deviceModels");
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            return;
        }
        SyncUtil.INSTANCE.setSyncTimeLong(6, wearableDeviceModel.getDid(), System.currentTimeMillis());
        WeatherLocationService.INSTANCE.requestLocation(ApplicationExtKt.getApplication(), mMapHighAccuracy, new kah() { // from class: com.xiaomi.fitness.sync.weather.SyncWeatherManagerImp.requestLocation.1
            @Override // defpackage.kah
            public void locationFail(String errorMsg) {
                Intrinsics.checkNotNullParameter(errorMsg, "errorMsg");
                Logger.i("Wearable.weather", "locationFail and not cached " + errorMsg);
                final LocationKey locationKey = localLocationKey;
                if (locationKey == null) {
                    MyAction1<Boolean> myAction1 = callback;
                    if (myAction1 != null) {
                        myAction1.call(Boolean.FALSE);
                        return;
                    }
                    return;
                }
                SyncRequest syncRequest = SyncRequest.INSTANCE;
                double d = locationKey.latitude;
                double d2 = locationKey.longitude;
                final SyncWeatherManagerImp syncWeatherManagerImp = SyncWeatherManagerImp.this;
                final List<WearableDeviceModel> list = deviceModels;
                final MyAction1<Boolean> myAction2 = callback;
                final boolean z = isRequestByDevice;
                syncRequest.performWeatherRequest(d, d2, locationKey, new be1<WeatherResp.Weather>() { // from class: com.xiaomi.fitness.sync.weather.SyncWeatherManagerImp$requestLocation$1$locationFail$1
                    @Override // defpackage.be1
                    public void onFailure() {
                        MyAction1<Boolean> myAction3 = myAction2;
                        if (myAction3 != null) {
                            myAction3.call(Boolean.FALSE);
                        }
                    }

                    @Override // defpackage.be1
                    public void onResponse(WeatherResp.Weather response) {
                        Intrinsics.checkNotNullParameter(response, "response");
                        Logger.i("Wearable.weather", "Weather Request Response!! locationKey = " + response.locationKey);
                        SyncWeatherManagerImp syncWeatherManagerImp2 = syncWeatherManagerImp;
                        List<WearableDeviceModel> list2 = list;
                        LocationKey locationKey2 = locationKey;
                        syncWeatherManagerImp2.syncWeatherToDevicesReally(list2, response, locationKey2.latitude, locationKey2.longitude, response.locationKey, response.location_name, myAction2, locationKey2.isUserAutoLocation, z);
                    }
                });
            }

            @Override // defpackage.kah
            public void locationSuccess(final double latitude, final double longitude, double altitude) {
                Logger.i("Wearable.weather", "locationSuccess longitude:" + longitude + " latitude:" + latitude + " ");
                SyncRequest syncRequest = SyncRequest.INSTANCE;
                final SyncWeatherManagerImp syncWeatherManagerImp = SyncWeatherManagerImp.this;
                final List<WearableDeviceModel> list = deviceModels;
                final MyAction1<Boolean> myAction1 = callback;
                final boolean z = isRequestByDevice;
                syncRequest.performWeatherRequest(latitude, longitude, null, new be1<WeatherResp.Weather>() { // from class: com.xiaomi.fitness.sync.weather.SyncWeatherManagerImp$requestLocation$1$locationSuccess$1
                    @Override // defpackage.be1
                    public void onFailure() {
                        MyAction1<Boolean> myAction2 = myAction1;
                        if (myAction2 != null) {
                            myAction2.call(Boolean.FALSE);
                        }
                    }

                    @Override // defpackage.be1
                    public void onResponse(WeatherResp.Weather response) {
                        Intrinsics.checkNotNullParameter(response, "response");
                        Logger.i("Wearable.weather", "Weather Request Response!! locationKey = " + response.locationKey);
                        SyncWeatherManagerImp syncWeatherManagerImp2 = syncWeatherManagerImp;
                        List<WearableDeviceModel> list2 = list;
                        SyncUtil syncUtil = SyncUtil.INSTANCE;
                        syncWeatherManagerImp2.syncWeatherToDevicesReally(list2, response, syncUtil.getDoubleLen3(latitude), syncUtil.getDoubleLen3(longitude), response.locationKey, response.location_name, myAction1, true, z);
                    }
                });
            }
        });
    }
}
