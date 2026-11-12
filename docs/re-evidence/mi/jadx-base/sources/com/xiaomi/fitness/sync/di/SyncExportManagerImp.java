package com.xiaomi.fitness.sync.di;

import com.google.gson.Gson;
import com.xiaomi.accountsdk.account.data.DevInfoKeys;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.GsonExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.settingitem.DeviceSettingConfigKey;
import com.xiaomi.fitness.settingitem.DeviceSettingManager;
import com.xiaomi.fitness.settingitem.settingitem.WeatherSetting;
import com.xiaomi.fitness.sync.SyncEngine;
import com.xiaomi.fitness.sync.export.MyAction1;
import com.xiaomi.fitness.sync.export.SyncPreference;
import com.xiaomi.fitness.sync.export.di.SyncExportManager;
import com.xiaomi.fitness.sync.export.model.LocationKey;
import com.xiaomi.fitness.sync.export.model.StockModel;
import com.xiaomi.fitness.sync.impl.MiuiNearbyServiceListener;
import com.xiaomi.fitness.sync.net.SyncRequest;
import com.xiaomi.fitness.sync.util.BlueToothSender;
import com.xiaomi.fitness.sync.util.MiuiNearbyServiceHelper;
import com.xiaomi.onetrack.api.b;
import defpackage.be1;
import defpackage.eu6;
import defpackage.o4h;
import defpackage.zgo;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b:\u0010;J?\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00062\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ3\u0010\u0014\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u000e0\u001a2\u0006\u0010\u0019\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010 \u001a\u00020\n2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b \u0010!J-\u0010$\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020#0\u0011H\u0016¢\u0006\u0004\b$\u0010%J=\u0010+\u001a\u00020\n2\u0006\u0010&\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\u00042\u0006\u0010*\u001a\u00020'2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0011H\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b-\u0010.J#\u00101\u001a\u00020\n2\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0/H\u0016¢\u0006\u0004\b1\u00102J\u001d\u00105\u001a\u0010\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u000204\u0018\u000103H\u0016¢\u0006\u0004\b5\u00106R\u0016\u00108\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109¨\u0006<"}, d2 = {"Lcom/xiaomi/fitness/sync/di/SyncExportManagerImp;", "Lcom/xiaomi/fitness/sync/export/di/SyncExportManager;", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "deviceModel", "", "force", "Lcom/xiaomi/fitness/sync/export/MyAction1;", "callback", "Leu6;", "deviceTaskCallBack", "", "syncCalendarToDevice", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;ZLcom/xiaomi/fitness/sync/export/MyAction1;Leu6;)V", "needRetry", "", "", "symbols", "Lbe1;", "Lcom/xiaomi/fitness/sync/export/model/StockModel$StockInfo;", b.I, "requestStockInfo", "(ZLjava/util/List;Lbe1;)V", "symbol", "deleteStockSymbol", "(Ljava/lang/String;)V", "did", "Lo4h;", "Lzgo;", "getStockSymbolList", "(Ljava/lang/String;)Lo4h;", "Lzgo$a;", "stockSymbolList", "setStockSymbolList", "(Lzgo$a;)V", "suggest", "Lcom/xiaomi/fitness/sync/export/model/StockModel$StockSuggestResult;", "requestStockSuggest", "(ZLjava/lang/String;Lbe1;)V", "source", "", "type", "online", "days", "performAgpsRequest", "(Ljava/lang/String;IZILbe1;)V", "clearAllCalendars", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;)V", "Lkotlin/Function1;", DevInfoKeys.CAPABILITY, "getWifiPasswordCapability", "(Lkotlin/jvm/functions/Function1;)V", "Lkotlin/Pair;", "", "getGpsLocation", "()Lkotlin/Pair;", "Lcom/google/gson/Gson;", "gson", "Lcom/google/gson/Gson;", "<init>", "()V", "sync_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SyncExportManagerImp implements SyncExportManager {

    @NotNull
    private Gson gson = new Gson();

    @Override // com.xiaomi.fitness.sync.export.di.SyncExportManager
    public void clearAllCalendars(@NotNull WearableDeviceModel deviceModel) {
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        new SyncEngine(ApplicationExtKt.getApplication(), false, 2, null).clearAllCalendars(deviceModel);
    }

    @Override // com.xiaomi.fitness.sync.export.di.SyncExportManager
    public void deleteStockSymbol(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        BlueToothSender.INSTANCE.deleteStockSymbol(symbol);
    }

    @Override // com.xiaomi.fitness.sync.export.di.SyncExportManager
    @Nullable
    public Pair<Double, Double> getGpsLocation() {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            return null;
        }
        if (DeviceModelExtKt.isBluetooth(wearableDeviceModel)) {
            String weatherLocation = SyncPreference.INSTANCE.getWeatherLocation();
            if (weatherLocation == null || weatherLocation.length() <= 0) {
                return null;
            }
            LocationKey locationKey = (LocationKey) GsonExtKt.toObject(this.gson, weatherLocation, LocationKey.class);
            return new Pair<>(Double.valueOf(locationKey.longitude), Double.valueOf(locationKey.latitude));
        }
        if (!DeviceModelExtKt.isHuaMi(wearableDeviceModel)) {
            return null;
        }
        Object objValueToObject = DeviceSettingManager.INSTANCE.getInstance().readSettingItem(wearableDeviceModel.getDid(), DeviceSettingConfigKey.KEY_WEATHERSETTING).valueToObject(WeatherSetting.class);
        WeatherSetting weatherSetting = objValueToObject instanceof WeatherSetting ? (WeatherSetting) objValueToObject : null;
        String locationKey2 = weatherSetting != null ? weatherSetting.getLocationKey() : null;
        if (locationKey2 == null || locationKey2.length() <= 0) {
            return null;
        }
        LocationKey locationKey3 = (LocationKey) GsonExtKt.toObject(this.gson, locationKey2, LocationKey.class);
        return new Pair<>(Double.valueOf(locationKey3.longitude), Double.valueOf(locationKey3.latitude));
    }

    @Override // com.xiaomi.fitness.sync.export.di.SyncExportManager
    @NotNull
    public o4h<List<zgo>> getStockSymbolList(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        return BlueToothSender.INSTANCE.getStockSymbolList(did);
    }

    @Override // com.xiaomi.fitness.sync.export.di.SyncExportManager
    public void getWifiPasswordCapability(@NotNull final Function1<? super Boolean, Unit> capability) {
        Intrinsics.checkNotNullParameter(capability, "capability");
        MiuiNearbyServiceHelper.INSTANCE.init(new MiuiNearbyServiceListener() { // from class: com.xiaomi.fitness.sync.di.SyncExportManagerImp.getWifiPasswordCapability.1
            @Override // com.xiaomi.fitness.sync.impl.MiuiNearbyServiceListener
            public void onDestroy() {
                capability.invoke2(Boolean.FALSE);
            }

            @Override // com.xiaomi.fitness.sync.impl.MiuiNearbyServiceListener
            public void onInit(MiuiNearbyServiceHelper action) {
                Intrinsics.checkNotNullParameter(action, "action");
                try {
                    action.getWifiPassword("");
                    Logger.i("getWifiPasswordCapability done", new Object[0]);
                    capability.invoke2(Boolean.TRUE);
                } catch (Exception e) {
                    capability.invoke2(Boolean.FALSE);
                    Logger.i("getWifiPasswordCapability exception", new Object[0]);
                    e.printStackTrace();
                }
            }
        });
    }

    @Override // com.xiaomi.fitness.sync.export.di.SyncExportManager
    public void performAgpsRequest(@NotNull String source, int type, boolean online, int days, @NotNull be1<String> response) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(response, "response");
        SyncRequest.INSTANCE.performAgpsRequest(source, type, online, days, response);
    }

    @Override // com.xiaomi.fitness.sync.export.di.SyncExportManager
    public void requestStockInfo(boolean needRetry, @NotNull List<String> symbols, @NotNull be1<StockModel.StockInfo> response) {
        Intrinsics.checkNotNullParameter(symbols, "symbols");
        Intrinsics.checkNotNullParameter(response, "response");
        SyncRequest.INSTANCE.requestStockInfo(needRetry, symbols, response);
    }

    @Override // com.xiaomi.fitness.sync.export.di.SyncExportManager
    public void requestStockSuggest(boolean needRetry, @NotNull String suggest, @NotNull be1<StockModel.StockSuggestResult> response) {
        Intrinsics.checkNotNullParameter(suggest, "suggest");
        Intrinsics.checkNotNullParameter(response, "response");
        SyncRequest.INSTANCE.requestStockSuggest(needRetry, suggest, response);
    }

    @Override // com.xiaomi.fitness.sync.export.di.SyncExportManager
    public void setStockSymbolList(@Nullable zgo.a stockSymbolList) {
        BlueToothSender.INSTANCE.setStockSymbolList(stockSymbolList);
    }

    @Override // com.xiaomi.fitness.sync.export.di.SyncExportManager
    public void syncCalendarToDevice(@NotNull WearableDeviceModel deviceModel, boolean force, @Nullable MyAction1<Boolean> callback, @Nullable eu6<Boolean> deviceTaskCallBack) {
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        final SyncEngine syncEngine = new SyncEngine(ApplicationExtKt.getApplication(), false, 2, null);
        syncEngine.syncCalendarToDevice(deviceModel, force, new MyAction1<Boolean>() { // from class: com.xiaomi.fitness.sync.di.SyncExportManagerImp.syncCalendarToDevice.1
            @Override // com.xiaomi.fitness.sync.export.MyAction1
            public /* bridge */ /* synthetic */ void call(Boolean bool) {
                call(bool.booleanValue());
            }

            public void call(boolean var1) {
                syncEngine.destroy();
            }
        }, deviceTaskCallBack);
    }
}
