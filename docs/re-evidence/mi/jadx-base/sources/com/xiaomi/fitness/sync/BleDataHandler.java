package com.xiaomi.fitness.sync;

import android.text.TextUtils;
import com.xiaomi.fitness.baseui.utils.NotificationPermissionKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.device.contact.export.DataHandlerWrapper;
import com.xiaomi.fitness.device.manager.bean.Product;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.export.FindPhoneHelper;
import com.xiaomi.fitness.devicesettings.export.FindPhoneHelperExtKt;
import com.xiaomi.fitness.sync.BleDataHandler;
import com.xiaomi.fitness.sync.export.MyAction1;
import com.xiaomi.fitness.sync.export.SyncPreference;
import com.xiaomi.fitness.sync.export.di.SyncExtKt;
import com.xiaomi.fitness.sync.export.di.WeatherSyncManager;
import com.xiaomi.fitness.sync.export.model.LocationKey;
import defpackage.s7r;
import defpackage.txo;
import defpackage.w0b;
import defpackage.x0b;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ)\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/sync/BleDataHandler;", "Lcom/xiaomi/fitness/device/contact/export/DataHandlerWrapper;", "", "mode", "", "did", "", "findPhone", "(ILjava/lang/String;)V", "postGpsInfo", "(Ljava/lang/String;)V", "type", "Ls7r;", "packet", "", "handlePacket", "(Ljava/lang/String;ILs7r;)Z", "GNSS_TAG", "Ljava/lang/String;", "getGNSS_TAG", "()Ljava/lang/String;", "FIND_PHONE_TAG", "getFIND_PHONE_TAG", "<init>", "()V", "sync_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class BleDataHandler extends DataHandlerWrapper {

    @NotNull
    private final String GNSS_TAG = "GNSS_TAG";

    @NotNull
    private final String FIND_PHONE_TAG = "FIND_PHONE_TAG";

    private final void findPhone(int mode, String did) {
        if (mode == 0) {
            FindPhoneHelperExtKt.getInstance(FindPhoneHelper.INSTANCE).start(did);
        } else {
            FindPhoneHelperExtKt.getInstance(FindPhoneHelper.INSTANCE).stop(did);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean handlePacket$lambda$0(String did, WearableDeviceModel it) {
        Intrinsics.checkNotNullParameter(did, "$did");
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.areEqual(it.getDid(), did);
    }

    private final void postGpsInfo(String did) {
        final SyncEngine syncEngine = new SyncEngine(AppUtil.getApp(), true);
        Logger.i(this.GNSS_TAG, "postGpsInfo start");
        syncEngine.syncLocationToDevice(did, new MyAction1<Boolean>() { // from class: com.xiaomi.fitness.sync.BleDataHandler.postGpsInfo.1
            @Override // com.xiaomi.fitness.sync.export.MyAction1
            public void call(Boolean var1) {
                syncEngine.destroy();
                Logger.i(this.getGNSS_TAG(), "postGpsInfo done");
            }
        });
    }

    @NotNull
    public final String getFIND_PHONE_TAG() {
        return this.FIND_PHONE_TAG;
    }

    @NotNull
    public final String getGNSS_TAG() {
        return this.GNSS_TAG;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:58:0x0112  */
    /* JADX WARN: Code duplicated, block: B:59:0x0116  */
    /* JADX WARN: Code duplicated, block: B:62:0x011b  */
    /* JADX WARN: Code duplicated, block: B:63:0x0122  */
    /* JADX WARN: Code duplicated, block: B:66:0x0143  */
    /* JADX WARN: Code duplicated, block: B:67:0x0147  */
    /* JADX WARN: Code duplicated, block: B:70:0x018f  */
    /* JADX WARN: Code duplicated, block: B:71:0x0191  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.device.contact.export.DataHandlerWrapper, com.xiaomi.fitness.device.contact.export.DataHandler
    public boolean handlePacket(@NotNull final String did, int type, @Nullable final s7r packet) {
        String str;
        String agps;
        int i;
        Integer numValueOf;
        int i2;
        boolean z;
        Intrinsics.checkNotNullParameter(did, "did");
        boolean z2 = false;
        if (packet == null) {
            return false;
        }
        int i3 = 2;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        if (type != 2) {
            if (type != 16) {
                switch (type) {
                    case 10:
                        if (packet.f == 3) {
                            final WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).findDeviceModel(new Function1() { // from class: sq2
                                @Override // kotlin.jvm.functions.Function1
                                /* JADX INFO: renamed from: invoke */
                                public final Object invoke2(Object obj) {
                                    return Boolean.valueOf(BleDataHandler.handlePacket$lambda$0(did, (WearableDeviceModel) obj));
                                }
                            });
                            if (wearableDeviceModel == null) {
                                return true;
                            }
                            Logger.i("Wearable.weather", "weather sync by device request" + packet.H().o().c);
                            SyncExtKt.getInstance(WeatherSyncManager.INSTANCE).readWeatherSetting(new WeatherSyncManager.ReadWeatherSettingCallBack() { // from class: com.xiaomi.fitness.sync.BleDataHandler.handlePacket.2
                                @Override // com.xiaomi.fitness.sync.export.di.WeatherSyncManager.ReadWeatherSettingCallBack
                                public void onResult(LocationKey locationKey) {
                                    if (packet.H().o().c != null) {
                                        if (!Intrinsics.areEqual(packet.H().o().c, locationKey != null ? locationKey.locationKey : null)) {
                                            locationKey = new LocationKey();
                                            locationKey.locationKey = packet.H().o().c;
                                        }
                                    }
                                    LocationKey locationKey2 = locationKey;
                                    Logger.i("Wearable.weather", "weather sync " + (locationKey2 != null ? locationKey2.locationKey : null) + " isLocation =  " + (locationKey2 != null ? Boolean.valueOf(locationKey2.isUserAutoLocation) : null));
                                    WeatherSyncManager syncExtKt = SyncExtKt.getInstance(WeatherSyncManager.INSTANCE);
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add(wearableDeviceModel);
                                    syncExtKt.syncWeatherToDevices(arrayList, true, locationKey2, true, new MyAction1<Boolean>() { // from class: com.xiaomi.fitness.sync.BleDataHandler$handlePacket$2$onResult$2
                                        @Override // com.xiaomi.fitness.sync.export.MyAction1
                                        public /* bridge */ /* synthetic */ void call(Boolean bool) {
                                            call(bool.booleanValue());
                                        }

                                        public void call(boolean var1) {
                                            new SyncEngine(ApplicationExtKt.getApplication(), false, 2, null).destroy();
                                        }
                                    }, false);
                                }
                            });
                            return true;
                        }
                        break;
                    case 11:
                        Logger.i("WearPacket.STOCK", "stock sync by device request");
                        if (packet.f == 5) {
                            final SyncEngine syncEngine = new SyncEngine(ApplicationExtKt.getApplication(), z2, i3, objArr2 == true ? 1 : 0);
                            syncEngine.syncStockToDevice(did, true, new MyAction1<Boolean>() { // from class: com.xiaomi.fitness.sync.BleDataHandler.handlePacket.3
                                @Override // com.xiaomi.fitness.sync.export.MyAction1
                                public /* bridge */ /* synthetic */ void call(Boolean bool) {
                                    call(bool.booleanValue());
                                }

                                public void call(boolean var1) {
                                    syncEngine.destroy();
                                }
                            });
                            return true;
                        }
                        break;
                    case 12:
                        if (packet.f == 2) {
                            if (!SyncPreference.INSTANCE.isNeedSyncSchedule(did)) {
                                Logger.i("request calendar but switch off", new Object[0]);
                                return false;
                            }
                            final SyncEngine syncEngine2 = new SyncEngine(ApplicationExtKt.getApplication(), z2, i3, objArr3 == true ? 1 : 0);
                            syncEngine2.syncCalendarToDevice(did, true, new MyAction1<Boolean>() { // from class: com.xiaomi.fitness.sync.BleDataHandler.handlePacket.4
                                @Override // com.xiaomi.fitness.sync.export.MyAction1
                                public /* bridge */ /* synthetic */ void call(Boolean bool) {
                                    call(bool.booleanValue());
                                }

                                public void call(boolean var1) {
                                    syncEngine2.destroy();
                                }
                            });
                            return true;
                        }
                        break;
                }
            } else {
                WearableDeviceModel wearableDeviceModel2 = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
                if (wearableDeviceModel2 == null) {
                    return true;
                }
                int i4 = packet.f;
                if (i4 == 0 || i4 == 1) {
                    x0b x0bVarV = packet.v();
                    if (x0bVarV == null) {
                        Logger.i(this.GNSS_TAG, "data invalid");
                        return true;
                    }
                    w0b w0bVarO = x0bVarV.o();
                    int iP = w0bVarO != null ? w0bVarO.e : x0bVarV.p();
                    if (w0bVarO == null || TextUtils.isEmpty(w0bVarO.d)) {
                        Product product = wearableDeviceModel2.getDeviceInfo().getProduct();
                        if (product != null) {
                            agps = product.getAgps();
                        } else {
                            str = null;
                        }
                        if (w0bVarO != null) {
                            i = w0bVarO.g;
                        } else {
                            i = 0;
                        }
                        String str2 = this.GNSS_TAG;
                        if (w0bVarO != null) {
                            numValueOf = Integer.valueOf(w0bVarO.c);
                        } else {
                            numValueOf = null;
                        }
                        Logger.i(str2, "gnssType:" + numValueOf + " , id:" + packet.f);
                        if (w0bVarO != null) {
                            i2 = w0bVarO.c;
                        } else {
                            i2 = 1;
                        }
                        Logger.i(this.GNSS_TAG, "data = " + w0bVarO + "; source = " + str + "; days = " + iP + "  segmentLength:" + i + " , gnssType:" + i2);
                        final SyncEngine syncEngine3 = new SyncEngine(AppUtil.getApp(), z2, i3, objArr == true ? 1 : 0);
                        String did2 = wearableDeviceModel2.getDid();
                        if (packet.f == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        syncEngine3.syncAgpsDataToDevice(did2, z, iP, str, i2, i, new SyncEngine.SyncEngineTask("Agps"), new MyAction1<Boolean>() { // from class: com.xiaomi.fitness.sync.BleDataHandler.handlePacket.1
                            @Override // com.xiaomi.fitness.sync.export.MyAction1
                            public void call(Boolean var1) {
                                Logger.d(NotificationPermissionKt.TAG, "agps destroy");
                                syncEngine3.destroy();
                            }
                        });
                        if (w0bVarO != null && w0bVarO.f) {
                            Logger.i(this.GNSS_TAG, "needGpsInfo");
                            postGpsInfo(wearableDeviceModel2.getDid());
                        }
                        return true;
                    }
                    agps = w0bVarO.d;
                    str = agps;
                    if (w0bVarO != null) {
                        i = w0bVarO.g;
                    } else {
                        i = 0;
                    }
                    String str3 = this.GNSS_TAG;
                    if (w0bVarO != null) {
                        numValueOf = Integer.valueOf(w0bVarO.c);
                    } else {
                        numValueOf = null;
                    }
                    Logger.i(str3, "gnssType:" + numValueOf + " , id:" + packet.f);
                    if (w0bVarO != null) {
                        i2 = w0bVarO.c;
                    } else {
                        i2 = 1;
                    }
                    Logger.i(this.GNSS_TAG, "data = " + w0bVarO + "; source = " + str + "; days = " + iP + "  segmentLength:" + i + " , gnssType:" + i2);
                    final SyncEngine syncEngine4 = new SyncEngine(AppUtil.getApp(), z2, i3, objArr == true ? 1 : 0);
                    String did3 = wearableDeviceModel2.getDid();
                    if (packet.f == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    syncEngine4.syncAgpsDataToDevice(did3, z, iP, str, i2, i, new SyncEngine.SyncEngineTask("Agps"), new MyAction1<Boolean>() { // from class: com.xiaomi.fitness.sync.BleDataHandler.handlePacket.1
                        @Override // com.xiaomi.fitness.sync.export.MyAction1
                        public void call(Boolean var1) {
                            Logger.d(NotificationPermissionKt.TAG, "agps destroy");
                            syncEngine4.destroy();
                        }
                    });
                    if (w0bVarO != null) {
                        Logger.i(this.GNSS_TAG, "needGpsInfo");
                        postGpsInfo(wearableDeviceModel2.getDid());
                    }
                    return true;
                }
                if (i4 == 3) {
                    Logger.i(this.GNSS_TAG, "REQUEST_GPS_INFO");
                    postGpsInfo(wearableDeviceModel2.getDid());
                }
            }
        } else if (packet.f == 17) {
            String str4 = this.FIND_PHONE_TAG;
            txo txoVarE = packet.E();
            Logger.i(str4, "receive find phone " + did + " " + (txoVarE != null ? Integer.valueOf(txoVarE.t()) : null));
            if (packet.E() != null) {
                findPhone(packet.E().t(), did);
            }
            return true;
        }
        return false;
    }
}
