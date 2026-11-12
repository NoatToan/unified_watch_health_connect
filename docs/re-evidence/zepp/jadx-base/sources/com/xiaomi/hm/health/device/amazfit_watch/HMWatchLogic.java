package com.xiaomi.hm.health.device.amazfit_watch;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Pair;
import com.google.gson.GsonBuilder;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.devicex.injection.basic.HRDataManagerApi;
import com.huami.devicex.injection.data.DateFormatApi;
import com.huami.devicex.injection.data.PropertyStoreApi;
import com.huami.devicex.injection.keeper.DeviceTimeStoreApi;
import com.huami.devicex.manager.DataCacheApi;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.devicex.manager.DeviceManagerZeppApi;
import com.huami.mifit.sportlib.common.DataTypeSource;
import com.huami.mifit.sportlib.common.SyncedState;
import com.huami.moving.datacenter.TrackRecordManager;
import com.huami.network.base.handler.IHMHttpResponseHandler;
import com.huami.network.base.model.HMHttpResponseData;
import com.huami.network.hmnetwork.handler.IHMSimpleHttpResponseHandler;
import com.huami.network.hmnetwork.properties.HMUserPropertiesAPI;
import com.huami.network.hmnetwork.properties.PropertyItem;
import com.huami.network.hmnetwork.webapi.WebResponse;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.CompanionApplication;
import com.huami.watch.companion.bind.BindUtil;
import com.huami.watch.companion.device.Device;
import com.huami.watch.companion.device.DeviceManager;
import com.huami.watch.companion.device.DeviceSource;
import com.huami.watch.companion.event.ConnectTimeoutEvent;
import com.huami.watch.companion.event.ConnectedEvent;
import com.huami.watch.companion.event.DeviceBoundEvent;
import com.huami.watch.companion.event.DeviceUnboundEvent;
import com.huami.watch.companion.event.DisconnectedEvent;
import com.huami.watch.companion.sync.SyncCenter;
import com.huami.watch.dataflow.model.sport.bean.SportDetail;
import com.huami.watch.dataflow.model.sport.bean.SportSummary;
import com.huami.watch.dataflow.util.SportDataParser;
import com.huami.watch.transport.Transporter;
import com.loopj.android.http.Base64;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.error.HMDeviceSyncDataError;
import com.xiaomi.hm.health.bt.profile.dfu.IHMFirmwareUpgradeCallback;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.ActivityData;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.ActivityDataFragment;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.IHMActivityDataCallback;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import com.xiaomi.hm.health.databases.model.HmProperty;
import com.xiaomi.hm.health.databases.model.Trackdata;
import com.xiaomi.hm.health.databases.model.Trackrecord;
import com.xiaomi.hm.health.dataprocess.SportDay;
import com.xiaomi.hm.health.dataprocess.StepsInfo;
import com.xiaomi.hm.health.device.amazfit_watch.HMWatchLogic;
import com.xiaomi.hm.health.device.event.EventWHTypeChanged;
import com.xiaomi.hm.health.device.event.HMDeviceBindEvent;
import com.xiaomi.hm.health.device.event.HMDeviceConnectionEvent;
import com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator;
import com.xiaomi.hm.health.device.setting.ui.navi.DeviceXZeppNavigator;
import com.xiaomi.hm.health.device.webapi.device.HMDeviceWebAPI;
import com.xiaomi.hm.health.device.webapi.sport.HMSportWebAPI;
import com.xiaomi.hm.health.devicex.manage.api.repository.DeviceRepositoryApi;
import de.greenrobot.event.EventBus;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Lazy;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes20.dex */
public class HMWatchLogic {
    private static final String b = "HMWatchLogic";
    private static final int c = 30;
    private static HMWatchLogic d;
    private static final Integer e = 0;
    private static final Lazy<DeviceRepositoryApi> f = KoinJavaComponent.inject(DeviceRepositoryApi.class);
    private static final Lazy<DeviceManagerApi> g = KoinJavaComponent.inject(DeviceManagerApi.class);
    private static final Lazy<DeviceTimeStoreApi> h = KoinJavaComponent.inject(DeviceTimeStoreApi.class);
    private static final Lazy<PropertyStoreApi> i = KoinJavaComponent.inject(PropertyStoreApi.class);
    private static final Lazy<DeviceXNavigator> j = KoinJavaComponent.inject(DeviceXNavigator.class);
    private static final Lazy<HRDataManagerApi> k = KoinJavaComponent.inject(HRDataManagerApi.class);
    private static final Lazy<DateFormatApi> l = KoinJavaComponent.inject(DateFormatApi.class);
    private static final Lazy<DataCacheApi> m = KoinJavaComponent.inject(DataCacheApi.class);
    private final ExecutorService a = Executors.newSingleThreadExecutor();

    public class a extends IHMHttpResponseHandler {
        public final /* synthetic */ IHMActivityDataCallback a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ long c;
        public final /* synthetic */ long d;

        public a(IHMActivityDataCallback iHMActivityDataCallback, boolean z, long j, long j2) {
            this.a = iHMActivityDataCallback;
            this.b = z;
            this.c = j;
            this.d = j2;
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCancel(int i) {
            IHMActivityDataCallback iHMActivityDataCallback = this.a;
            if (iHMActivityDataCallback != null) {
                iHMActivityDataCallback.onSyncFinish(new HMDeviceSyncDataError(100));
            }
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCompleted() {
            IHMActivityDataCallback iHMActivityDataCallback = this.a;
            if (iHMActivityDataCallback != null) {
                iHMActivityDataCallback.onSyncFinish(new HMDeviceSyncDataError(0));
            }
            if (this.b) {
                HMLog.i(HMWatchLogic.b, "sync over 30 days , sync and analysis 30 days data and other data", new Object[0]);
                HMSportWebAPI.downloadAllWatchDatasByMonth(this.c, SportDay.getToday().addDay(-30).getTimestamp(), "detail");
            }
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onError(Throwable th) {
            HMLog.i(HMWatchLogic.b, "syncWatchDatafromServer in HMHttpResponseData  throwable = " + th.toString(), new Object[0]);
            IHMActivityDataCallback iHMActivityDataCallback = this.a;
            if (iHMActivityDataCallback != null) {
                iHMActivityDataCallback.onSyncFinish(new HMDeviceSyncDataError(100));
            }
        }

        @Override // com.huami.network.base.handler.IHMHttpResponseHandler
        public void onItem(HMHttpResponseData hMHttpResponseData) {
            ActivityDataFragment activityDataFragmentH;
            try {
                JSONObject jSONObject = new JSONObject(new String(hMHttpResponseData.getResponseBody()));
                String strOptString = jSONObject.optString("code");
                if (!"1".equals(strOptString)) {
                    HMLog.i(HMWatchLogic.b, "device sync invalid code : " + strOptString, new Object[0]);
                    return;
                }
                JSONArray jSONArray = jSONObject.getJSONArray("data");
                int length = jSONArray.length();
                if (length > 0) {
                    ArrayList arrayList = new ArrayList();
                    for (int i = 0; i < length; i++) {
                        String strOptString2 = jSONArray.getJSONObject(i).optString("mergedRawData");
                        String strOptString3 = jSONArray.getJSONObject(i).optString(ParamKey.heartRateData);
                        String strOptString4 = jSONArray.getJSONObject(i).optString("date");
                        if (strOptString4 != null) {
                            SportDay.fromString(strOptString4).isToday();
                        }
                        byte[] bArrDecode = Base64.decode(strOptString2, 2);
                        byte[] bArrDecode2 = Base64.decode(strOptString3, 2);
                        if (i == 0) {
                            long timestamp = SportDay.fromString(strOptString4).getTimestamp();
                            long j = this.d;
                            activityDataFragmentH = timestamp < j ? HMWatchLogic.this.H(bArrDecode, bArrDecode2, j) : HMWatchLogic.this.H(bArrDecode, bArrDecode2, timestamp);
                        } else {
                            activityDataFragmentH = HMWatchLogic.this.H(bArrDecode, bArrDecode2, SportDay.fromString(strOptString4).getTimestamp());
                        }
                        if (activityDataFragmentH != null) {
                            arrayList.add(activityDataFragmentH);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        ActivityDataFragment activityDataFragment = (ActivityDataFragment) arrayList.get(arrayList.size() - 1);
                        Calendar calendar = Calendar.getInstance();
                        calendar.setTimeInMillis(activityDataFragment.timestamp.getTimeInMillis());
                        calendar.add(12, activityDataFragment.size());
                        calendar.set(13, 0);
                        arrayList.add(new ActivityDataFragment(calendar, true));
                        HMLog.i(HMWatchLogic.b, "lastWatchSyncTime  " + calendar.getTime(), new Object[0]);
                        IHMActivityDataCallback iHMActivityDataCallback = this.a;
                        if (iHMActivityDataCallback != null) {
                            iHMActivityDataCallback.onSyncStop(arrayList);
                        }
                    }
                    HMLog.i(HMWatchLogic.b, "download success list size : " + length, new Object[0]);
                    if (((PropertyStoreApi) HMWatchLogic.i.getValue()).isFirstSyncWatchDataAfterBand()) {
                        ((PropertyStoreApi) HMWatchLogic.i.getValue()).setIsFirstSyncWatchDataAfterBand(false);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                HMLog.i(HMWatchLogic.b, "err : " + e.getMessage(), new Object[0]);
                IHMActivityDataCallback iHMActivityDataCallback2 = this.a;
                if (iHMActivityDataCallback2 != null) {
                    iHMActivityDataCallback2.onSyncFinish(new HMDeviceSyncDataError(100));
                }
            }
        }
    }

    public class b extends IHMSimpleHttpResponseHandler {
        public b() {
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onFailure(HMHttpResponseData hMHttpResponseData) {
        }

        @Override // com.huami.network.hmnetwork.handler.IHMSimpleHttpResponseHandler
        public void onSuccess(WebResponse webResponse, HMHttpResponseData hMHttpResponseData) {
            if (hMHttpResponseData.isSuccess()) {
                try {
                    JSONObject jSONObject = new JSONObject(new String(hMHttpResponseData.getResponseBody()));
                    ArrayList arrayList = new ArrayList();
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        String string = jSONObject.getString(next);
                        DeviceXFunctionsKt.getPropertyStoreApi();
                        arrayList.add(new HmProperty(next, string, 1));
                    }
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    DeviceXFunctionsKt.getPropertyStoreApi().setProperties(arrayList);
                    EventBus.getDefault().post(new EventWHTypeChanged());
                } catch (JSONException unused) {
                }
            }
        }
    }

    public class c extends IHMHttpResponseHandler {
        public final /* synthetic */ HMHttpResponseData a;

        public c(HMHttpResponseData hMHttpResponseData) {
            this.a = hMHttpResponseData;
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCancel(int i) {
            HMLog.d(HMWatchLogic.b, "getDeviceListFromServerSync onCancel!", new Object[0]);
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCompleted() {
            HMLog.d(HMWatchLogic.b, "getDeviceListFromServerSync onCompleted!", new Object[0]);
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onError(Throwable th) {
            HMLog.d(HMWatchLogic.b, "getDeviceListFromServerSync onError!", new Object[0]);
        }

        @Override // com.huami.network.base.handler.IHMHttpResponseHandler
        public void onItem(HMHttpResponseData hMHttpResponseData) {
            HMLog.d(HMWatchLogic.b, "getDeviceListFromServerSync:" + hMHttpResponseData, new Object[0]);
            this.a.copy(hMHttpResponseData);
        }
    }

    public class d implements SyncCenter.SportDataSaveToLocalListener {
        public d() {
        }

        @Override // com.huami.watch.companion.sync.SyncCenter.SportDataSaveToLocalListener
        public void onSportDataSaveToLocal(String str, String str2) {
            TrackRecordManager.getInstance().insertRecordIfNotExist(HMWatchLogic.this.r(str));
            TrackRecordManager.getInstance().insertDetailIfNotExist(HMWatchLogic.this.q(str2, str));
            HMLog.i(HMWatchLogic.b, "onSportDataSaveToLocal:" + TrackRecordManager.getInstance().getLatestTrackRecord().getTrackid(), new Object[0]);
        }

        @Override // com.huami.watch.companion.sync.SyncCenter.SportDataSaveToLocalListener
        public void updateLocalDataState(List<Pair<Long, String>> list) {
            for (Pair<Long, String> pair : list) {
                Trackrecord trackRecordById = TrackRecordManager.getInstance().getTrackRecordById(((Long) pair.first).longValue(), DataTypeSource.RunSource.getValueBySource((String) pair.second));
                if (trackRecordById != null) {
                    trackRecordById.setState(Integer.valueOf(SyncedState.STATE_SYNCED_TO_SERVER.getValue()));
                    TrackRecordManager.getInstance().updateTrackRecord(trackRecordById);
                } else {
                    HMLog.i(HMWatchLogic.b, "needUpdate null!!!", new Object[0]);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void A(int i2, int i3, String str) {
        HMLog.i(b, "syncType:" + i2 + ",state:" + i3 + ",description:" + str, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B(IHMActivityDataCallback iHMActivityDataCallback) {
        if (!F(2, new SyncCenter.SyncListener() { // from class: oo3
            @Override // com.huami.watch.companion.sync.SyncCenter.SyncListener
            public final void onSyncStateChanged(int i2, int i3, String str) {
                HMWatchLogic.A(i2, i3, str);
            }
        })) {
            iHMActivityDataCallback.onSyncFinish(new HMDeviceSyncDataError(100));
        }
        try {
            HMLog.i(b, "sync from net direct", new Object[0]);
            G(iHMActivityDataCallback);
        } catch (Exception e2) {
            HMLog.d(b, e2.getMessage(), new Object[0]);
            G(iHMActivityDataCallback);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void C(HMCallback hMCallback, int i2, int i3, String str) {
        if (i2 != 1) {
            if (i2 == Integer.MAX_VALUE) {
                hMCallback.onProgress(new Progress(100, 100));
            }
        } else if (i3 == 1) {
            hMCallback.onProgress(new Progress(100, 10));
        } else if (i3 == -1) {
            hMCallback.onProgress(new Progress(100, 90));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D(final HMCallback hMCallback) {
        hMCallback.onStart();
        hMCallback.onFinish(F(1, new SyncCenter.SyncListener() { // from class: ko3
            @Override // com.huami.watch.companion.sync.SyncCenter.SyncListener
            public final void onSyncStateChanged(int i2, int i3, String str) {
                HMWatchLogic.C(hMCallback, i2, i3, str);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void E(int i2, int i3, String str) {
        HMLog.i(b, "syncType:" + i2 + ",state:" + i3 + ",description:" + str, new Object[0]);
    }

    private boolean F(int i2, SyncCenter.SyncListener syncListener) {
        HMLog.i(b, "syncData:" + i2, new Object[0]);
        Application context = DeviceXFunctionsKt.getContext();
        SyncCenter center = SyncCenter.getCenter(context);
        if (!center.isSyncing()) {
            return center.types(i2).listen(syncListener).listenSportDataToLocal(new d()).silent(false).transporter(Transporter.get(context, "com.huami.watch.companion")).start();
        }
        HMLog.i(b, "SyncData : Already Syncing...Abort!!", new Object[0]);
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x015e  */
    /* JADX WARN: Code duplicated, block: B:29:0x01ae  */
    /* JADX WARN: Instruction removed from duplicated block: B:27:0x015e, please report this as an issue */
    private void G(IHMActivityDataCallback iHMActivityDataCallback) {
        long j2;
        long timestamp;
        Lazy<HRDataManagerApi> lazy = k;
        lazy.getValue().deleteFromServer();
        boolean z = true;
        lazy.getValue().syncFromServer(true);
        long jCurrentTimeMillis = System.currentTimeMillis();
        Lazy<DeviceTimeStoreApi> lazy2 = h;
        DeviceTimeStoreApi value = lazy2.getValue();
        HMDeviceType hMDeviceType = HMDeviceType.WATCH;
        long timeInMillis = value.getBoundDeviceSyncTime(hMDeviceType).getTimeInMillis() > 0 ? lazy2.getValue().getBoundDeviceSyncTime(hMDeviceType).getTimeInMillis() : SportDay.getToday().getTimestamp();
        SportDay today = SportDay.getToday();
        Lazy<DateFormatApi> lazy3 = l;
        boolean z2 = today.offsetDay(SportDay.fromString(lazy3.getValue().formatDateSimple(timeInMillis))) > 30;
        Lazy<PropertyStoreApi> lazy4 = i;
        if (lazy4.getValue().isFirstSyncWatchDataAfterBand()) {
            StepsInfo stepsInfo = m.getValue().getTodaySportData().getStepsInfo();
            if (stepsInfo == null || stepsInfo.getStepsCount() != 0) {
                lazy4.getValue().setIsFirstSyncWatchDataAfterBand(false);
                z = false;
            }
        } else {
            z = false;
        }
        if (!z) {
            if (z2) {
                timestamp = SportDay.getToday().addDay(-30).getTimestamp();
            } else {
                j2 = timeInMillis;
            }
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(j2);
            HMLog.i(b, "fTime == " + j2 + "; " + calendar.getTime().toString(), new Object[0]);
            calendar.setTimeInMillis(jCurrentTimeMillis);
            HMLog.i(b, "tTime == " + jCurrentTimeMillis + "; " + calendar.getTime().toString(), new Object[0]);
            HMLog.i(b, "last sync time == " + timeInMillis + "; " + lazy3.getValue().formatDateSimple(timeInMillis), new Object[0]);
            StringBuilder sb = new StringBuilder();
            sb.append("isFirstSyncWatchDataAfterBand =  ");
            sb.append(lazy4.getValue().isFirstSyncWatchDataAfterBand());
            HMLog.i(b, sb.toString(), new Object[0]);
            if (GlobalConfig.get().isBuildMidong()) {
                HMSportWebAPI.syncWatchDatafromServer(j2 / 1000, jCurrentTimeMillis / 1000, "detail", new a(iHMActivityDataCallback, z2, timeInMillis, j2));
                return;
            }
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTimeInMillis(j2);
            SportDay sportDay = new SportDay(calendar2);
            m.getValue().loadAmazfitWatchBytesData(sportDay.getKey(), SportDay.getToday().getKey(), iHMActivityDataCallback);
            HMLog.i(b, "sync midong" + sportDay.getKey() + " - " + SportDay.getToday().getKey(), new Object[0]);
        }
        timestamp = SportDay.getToday().getTimestamp();
        j2 = timestamp;
        Calendar calendar3 = Calendar.getInstance();
        calendar3.setTimeInMillis(j2);
        HMLog.i(b, "fTime == " + j2 + "; " + calendar3.getTime().toString(), new Object[0]);
        calendar3.setTimeInMillis(jCurrentTimeMillis);
        HMLog.i(b, "tTime == " + jCurrentTimeMillis + "; " + calendar3.getTime().toString(), new Object[0]);
        HMLog.i(b, "last sync time == " + timeInMillis + "; " + lazy3.getValue().formatDateSimple(timeInMillis), new Object[0]);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("isFirstSyncWatchDataAfterBand =  ");
        sb2.append(lazy4.getValue().isFirstSyncWatchDataAfterBand());
        HMLog.i(b, sb2.toString(), new Object[0]);
        if (GlobalConfig.get().isBuildMidong()) {
            HMSportWebAPI.syncWatchDatafromServer(j2 / 1000, jCurrentTimeMillis / 1000, "detail", new a(iHMActivityDataCallback, z2, timeInMillis, j2));
            return;
        }
        Calendar calendar4 = Calendar.getInstance();
        calendar4.setTimeInMillis(j2);
        SportDay sportDay2 = new SportDay(calendar4);
        m.getValue().loadAmazfitWatchBytesData(sportDay2.getKey(), SportDay.getToday().getKey(), iHMActivityDataCallback);
        HMLog.i(b, "sync midong" + sportDay2.getKey() + " - " + SportDay.getToday().getKey(), new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ActivityDataFragment H(byte[] bArr, byte[] bArr2, long j2) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j2);
        int i2 = (calendar.get(11) * 60) + calendar.get(12);
        int length = bArr.length;
        if (length == 0) {
            HMLog.i(b, " size == 0, no data need to sync ", new Object[0]);
            return null;
        }
        ArrayList arrayList = new ArrayList();
        HMLog.i(b, "size " + length + "; hr sz = " + bArr2.length + ";start = " + i2, new Object[0]);
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int i5 = i4 + 2;
            i3 += bArr[i5] & 255;
            int i6 = (i4 / 3) + i2;
            if (i6 > 1439) {
                break;
            }
            arrayList.add(new ActivityData(bArr[i4 + 1], bArr[i5] & 255, bArr[i4], bArr2[i6] & 255));
        }
        HMLog.i(b, "steps = " + i3, new Object[0]);
        HMLog.i(b, "data date:" + calendar.getTime().toString() + ",date size:" + arrayList.size(), new Object[0]);
        Lazy<DataCacheApi> lazy = m;
        lazy.getValue().printActivityData(b, arrayList);
        lazy.getValue().printHrData(b, bArr2);
        return new ActivityDataFragment(calendar, arrayList);
    }

    private static void I(Device device) {
        HMLog.i(b, "###更新数据库中手助设备信息###", new Object[0]);
        Lazy<DeviceManagerApi> lazy = g;
        com.xiaomi.hm.health.databases.model.Device mifitDevice = lazy.getValue().toMifitDevice(device);
        Lazy<DeviceRepositoryApi> lazy2 = f;
        com.xiaomi.hm.health.databases.model.Device deviceFindDeviceByAddress = lazy2.getValue().findDeviceByAddress(device.address());
        if (deviceFindDeviceByAddress == null) {
            HMLog.i(b, "设备表中无此设备,无需更新", new Object[0]);
            return;
        }
        if (mifitDevice.getFirmware_version() != null && !mifitDevice.getFirmware_version().equals(deviceFindDeviceByAddress.getFirmware_version())) {
            HMLog.i(b, "更新手表固件版本:" + deviceFindDeviceByAddress.getFirmware_version() + "-->" + mifitDevice.getFirmware_version(), new Object[0]);
            deviceFindDeviceByAddress.setFirmware_version(mifitDevice.getFirmware_version());
            lazy.getValue().freshFirmwareCached(HMDeviceType.WATCH, mifitDevice.getDevice_address(), mifitDevice.getFirmware_version());
        }
        HMLog.i(b, "###更新数据库中手助设备信息结束###", new Object[0]);
        lazy2.getValue().update(deviceFindDeviceByAddress);
    }

    private void J() {
        DeviceManagerApi value = g.getValue();
        HMDeviceType hMDeviceType = HMDeviceType.WATCH;
        value.unbindDevice(hMDeviceType);
        EventBus.getDefault().postSticky(new HMDeviceBindEvent(false, hMDeviceType));
    }

    public static void connectCurrentDevice() {
        BindUtil.connectCurrentDevice(DeviceXFunctionsKt.getContext());
    }

    public static HMWatchLogic getInstance() {
        HMWatchLogic hMWatchLogic;
        synchronized (e) {
            if (d == null) {
                d = new HMWatchLogic();
            }
            hMWatchLogic = d;
        }
        return hMWatchLogic;
    }

    public static boolean isConnected() {
        return DeviceManager.getManager(DeviceXFunctionsKt.getContext()).isBoundDeviceConnected();
    }

    public static boolean isSyncingData() {
        return SyncCenter.getCenter(DeviceXFunctionsKt.getContext()).isSyncing();
    }

    public static void onWatchEvent(Object obj) {
        HMLog.i(b, "Event : " + obj, new Object[0]);
        Application context = DeviceXFunctionsKt.getContext();
        if (obj instanceof DeviceUnboundEvent) {
            DeviceXFunctionsKt.getAppStateApi().onDeviceDestroy();
            DeviceUnboundEvent deviceUnboundEvent = (DeviceUnboundEvent) obj;
            Device deviceFind = DeviceManager.getManager(context).find(deviceUnboundEvent.address);
            StringBuilder sb = new StringBuilder();
            sb.append("DeviceUnboundEvent:");
            sb.append(deviceUnboundEvent.address);
            sb.append(",");
            sb.append(deviceUnboundEvent.did);
            sb.append(",");
            sb.append(deviceUnboundEvent.isActive);
            sb.append(", device: ");
            sb.append(deviceFind);
            sb.append(", source: ");
            Lazy<DeviceManagerApi> lazy = g;
            sb.append(lazy.getValue().getWatchDeviceSource(deviceFind));
            HMLog.i(b, sb.toString(), new Object[0]);
            DeviceManagerApi value = lazy.getValue();
            HMDeviceType hMDeviceType = HMDeviceType.WATCH;
            if (!TextUtils.equals(value.getBoundDeviceAddress(hMDeviceType), deviceUnboundEvent.address)) {
                HMLog.i(b, "ignore unbind event.", new Object[0]);
                return;
            }
            lazy.getValue().unbindDevice(hMDeviceType);
            EventBus.getDefault().post(new HMDeviceBindEvent(false, hMDeviceType));
            Intent intentCreateMainTabIntent = j.getValue().createMainTabIntent(context);
            intentCreateMainTabIntent.addFlags(268435456);
            context.startActivity(intentCreateMainTabIntent);
            return;
        }
        if (obj instanceof DeviceBoundEvent) {
            DeviceBoundEvent deviceBoundEvent = (DeviceBoundEvent) obj;
            HMLog.i(b, "DeviceBoundEvent:" + deviceBoundEvent.macAddress, new Object[0]);
            Device deviceFind2 = DeviceManager.getManager(context).find(deviceBoundEvent.macAddress);
            Lazy<DeviceManagerApi> lazy2 = g;
            HMDeviceSource watchDeviceSource = lazy2.getValue().getWatchDeviceSource(deviceFind2);
            HMLog.i(b, "DeviceBoundEvent device:" + deviceFind2 + ",source:" + watchDeviceSource, new Object[0]);
            com.xiaomi.hm.health.databases.model.Device mifitDevice = lazy2.getValue().toMifitDevice(deviceFind2);
            int activeStatus = lazy2.getValue().getActiveStatus(watchDeviceSource.getType());
            mifitDevice.setActiveStatus(Integer.valueOf(activeStatus));
            if (activeStatus == 0) {
                f.getValue().insertOrReplace(mifitDevice);
                j.getValue().startUseDeviceNewTask(context, mifitDevice);
                return;
            }
            lazy2.getValue().bindDevice(CompanionApplication.get().mBleConnection.mBleDevice, mifitDevice);
            BindUtil.activeDevice(context, deviceFind2);
            EventBus.getDefault().post(new HMDeviceBindEvent(true, watchDeviceSource.getType()));
            Lazy<DeviceXNavigator> lazy3 = j;
            if (lazy3.getValue() instanceof DeviceXZeppNavigator) {
                ((DeviceXZeppNavigator) lazy3.getValue()).startDeviceStatus(context, deviceFind2);
                return;
            }
            return;
        }
        if (obj instanceof ConnectedEvent) {
            ConnectedEvent connectedEvent = (ConnectedEvent) obj;
            HMLog.i(b, "ConnectedEvent:" + connectedEvent.address, new Object[0]);
            Device deviceFind3 = DeviceManager.getManager(context).find(connectedEvent.address);
            HMLog.i(b, "ConnectedEvent device:" + deviceFind3 + ",source:" + g.getValue().getWatchDeviceSource(deviceFind3), new Object[0]);
            I(deviceFind3);
            if (deviceFind3 == null || !DeviceSource.isSeriesEverest2(deviceFind3)) {
                EventBus.getDefault().postSticky(new HMDeviceConnectionEvent(1, HMDeviceType.WATCH));
                return;
            }
            return;
        }
        if (!(obj instanceof DisconnectedEvent)) {
            if (obj instanceof ConnectTimeoutEvent) {
                ConnectTimeoutEvent connectTimeoutEvent = (ConnectTimeoutEvent) obj;
                HMLog.i(b, "ConnectTimeoutEvent:" + connectTimeoutEvent.address, new Object[0]);
                Device deviceFind4 = DeviceManager.getManager(context).find(connectTimeoutEvent.address);
                HMLog.i(b, "ConnectTimeoutEvent device:" + deviceFind4 + ",source:" + g.getValue().getWatchDeviceSource(deviceFind4), new Object[0]);
                EventBus.getDefault().postSticky(new HMDeviceConnectionEvent(3, HMDeviceType.WATCH));
                return;
            }
            return;
        }
        DisconnectedEvent disconnectedEvent = (DisconnectedEvent) obj;
        HMLog.i(b, "DisconnectedEvent:" + disconnectedEvent.address, new Object[0]);
        Device deviceFind5 = DeviceManager.getManager(context).find(disconnectedEvent.address);
        HMLog.i(b, "DisconnectedEvent device:" + deviceFind5 + ",source:" + g.getValue().getWatchDeviceSource(deviceFind5), new Object[0]);
        if (deviceFind5 == null || !DeviceSource.isSeriesEverest2(deviceFind5)) {
            EventBus.getDefault().postSticky(new HMDeviceConnectionEvent(0, HMDeviceType.WATCH));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Trackdata q(String str, String str2) {
        Map<String, String> mapFormToNameValues = SportDataParser.formToNameValues(str);
        SportDetail detailItem = SportDataParser.toDetailItem(str);
        SportSummary summaryItem = SportDataParser.toSummaryItem(str2);
        if (detailItem == null) {
            return null;
        }
        Trackdata trackdata = new Trackdata();
        if (summaryItem != null) {
            trackdata.setType(Integer.valueOf(summaryItem.getType()));
        }
        trackdata.setTrackid(Long.valueOf(detailItem.getTrackid()));
        trackdata.setBulkacc(detailItem.getBulkacc());
        trackdata.setBulkal(detailItem.getBulkal());
        trackdata.setBulkbarometerAltitude(detailItem.getBulkbarometerAltitude());
        trackdata.setBulkdistance(detailItem.getBulkdistance());
        trackdata.setBulkflag(detailItem.getBulkflag());
        trackdata.setBulkgait(detailItem.getBulkgait());
        trackdata.setBulkhr(detailItem.getBulkhr());
        trackdata.setBulkll(detailItem.getBulkll());
        trackdata.setBulkpace(detailItem.getBulkpace());
        trackdata.setBulkpause(detailItem.getBulkpause());
        trackdata.setBulktime(detailItem.getBulktime());
        trackdata.setKilomarked(detailItem.getKilomarked());
        trackdata.setMilemarked(detailItem.getMilemarked());
        trackdata.setSource(Integer.valueOf(DataTypeSource.RunSource.getValueBySource(detailItem.getSource())));
        trackdata.setV(Integer.valueOf(detailItem.getV()));
        trackdata.setCorrectAltitude(detailItem.getDeltaTimeAltitude());
        trackdata.setStrokeSpeed(detailItem.getStrokeSpeed());
        trackdata.setCadence(detailItem.getCadence());
        trackdata.setDailyPerformance(detailItem.getPerformanceStatus());
        trackdata.setLap(detailItem.getLap());
        trackdata.setBulkspeed(detailItem.getSpeed());
        trackdata.setWeatherInfo(detailItem.getWeather());
        trackdata.setProvider(1);
        if (!TextUtils.isEmpty(mapFormToNameValues.get("rope_skipping_frequency"))) {
            trackdata.setBulkRopeSkippingFreq(detailItem.getBulkgait());
        }
        return trackdata;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Trackrecord r(String str) {
        SportSummary summaryItem = SportDataParser.toSummaryItem(str);
        if (summaryItem == null) {
            return null;
        }
        Trackrecord trackrecord = new Trackrecord();
        trackrecord.setAltitudeAscend(Integer.valueOf(summaryItem.getAltitudeAscend()));
        trackrecord.setAltitudeDescend(Integer.valueOf(summaryItem.getAltitudeDescend()));
        trackrecord.setAvgCadence(Integer.valueOf(summaryItem.getAvgCadence()));
        trackrecord.setSfreq(Integer.valueOf(summaryItem.getAvgFrequency()));
        trackrecord.setAvghr(Integer.valueOf(summaryItem.getAvgHr()));
        trackrecord.setPace(Float.valueOf(summaryItem.getAvgPace()));
        trackrecord.setAvgStrideLength(Integer.valueOf(summaryItem.getAvgStrideLength()));
        trackrecord.setCal(Integer.valueOf(summaryItem.getCal()));
        trackrecord.setClimbDisascend(Integer.valueOf(summaryItem.getClimbDisAscend()));
        trackrecord.setClimbDisAscendTime(Integer.valueOf(summaryItem.getClimbDisAscendTime()));
        trackrecord.setClimbDisDescend(Integer.valueOf(summaryItem.getClimbDisDescend()));
        trackrecord.setClimbDisDescendTime(Integer.valueOf(summaryItem.getClimbDisDescendTime()));
        trackrecord.setDate(summaryItem.getDate());
        trackrecord.setDevice(TextUtils.isEmpty(summaryItem.getBindDevice()) ? "" : summaryItem.getBindDevice());
        trackrecord.setDistance(Integer.valueOf(summaryItem.getDis()));
        trackrecord.setEndtime(Long.valueOf(summaryItem.getEndtime()));
        trackrecord.setFlightRatio(Integer.valueOf(summaryItem.getFlightRatio()));
        trackrecord.setFfpercent(Integer.valueOf(summaryItem.getForefootRatio()));
        trackrecord.setLandingTime(Integer.valueOf(summaryItem.getLandingTime()));
        trackrecord.setLocation(summaryItem.getLocation());
        trackrecord.setMaxCadence(Integer.valueOf(summaryItem.getMaxCadence()));
        trackrecord.setMaxrtp(Float.valueOf(summaryItem.getMaxPace()));
        trackrecord.setMinrtp(Float.valueOf(summaryItem.getMinPace()));
        trackrecord.setCosttime(Integer.valueOf(summaryItem.getRuntime()));
        trackrecord.setSource(Integer.valueOf(DataTypeSource.RunSource.getValueBySource(summaryItem.getSource())));
        trackrecord.setTotalStep(Integer.valueOf(summaryItem.getTotalStep()));
        trackrecord.setTrackid(Long.valueOf(summaryItem.getTrackid()));
        trackrecord.setType(Integer.valueOf(summaryItem.getType()));
        trackrecord.setV(Integer.valueOf(summaryItem.getVersion()));
        trackrecord.setTotalGroup(summaryItem.getTotalGroup());
        SyncedState syncedState = SyncedState.STATE_SYNCED_TO_SERVER;
        trackrecord.setState(Integer.valueOf(syncedState.getValue()));
        trackrecord.setSynced(Integer.valueOf(syncedState.getValue()));
        trackrecord.setParentTrackId(Long.valueOf(summaryItem.getParentTrackId()));
        trackrecord.setChildListData(summaryItem.getChildListData());
        trackrecord.setMaxHR(Integer.valueOf(summaryItem.getMaxHR()));
        trackrecord.setMinHR(Integer.valueOf(summaryItem.getMinHR()));
        trackrecord.setTeValue(Integer.valueOf(summaryItem.getTeValue()));
        trackrecord.setSportMode(summaryItem.getSportMode());
        trackrecord.setUnit(Integer.valueOf(summaryItem.getUnit()));
        trackrecord.setExtra(summaryItem.getExtra());
        trackrecord.setSwimSWOLF(Integer.valueOf(summaryItem.getSwimSWOLF()));
        trackrecord.setSwimStrokes(Integer.valueOf(summaryItem.getSwimStrokes()));
        trackrecord.setSwimTurns(Integer.valueOf(summaryItem.getSwimTurns()));
        trackrecord.setSwimAvgStrokeSpeed(Float.valueOf(summaryItem.getSwimAvgStrokeSpeed()));
        trackrecord.setSwimMaxStrokeSpeed(Float.valueOf(summaryItem.getSwimMaxStrokeSpeed()));
        trackrecord.setSwimDistancePerStroke(Float.valueOf(summaryItem.getSwimDistancePerStroke()));
        trackrecord.setSwimPoolLength(Integer.valueOf(summaryItem.getSwimPoolLength()));
        trackrecord.setSwimStyle(Integer.valueOf(summaryItem.getSwimStyle()));
        trackrecord.setDownhillNumber(summaryItem.getDownhillNumber());
        trackrecord.setMaxDownhillFallMileage(summaryItem.getMaxDownhillFallMileage());
        trackrecord.setTouchStrokes(summaryItem.getTennisStrokes());
        trackrecord.setTennisForeHand(summaryItem.getTennisForeHand());
        trackrecord.setTennisBackHand(summaryItem.getTennisBackHand());
        trackrecord.setTennisServe(summaryItem.getTennisServe());
        trackrecord.setHalfStartTime(summaryItem.getHalfStartTime());
        int ropeSkippingCount = summaryItem.getRopeSkippingCount() > 0 ? summaryItem.getRopeSkippingCount() : 0;
        trackrecord.setRopeSkippingCount(ropeSkippingCount);
        trackrecord.setRopeSkippingAvgFrequency(summaryItem.getRopeSkippingAvgFrequency());
        trackrecord.setRopeSkippingMaxFrequency(summaryItem.getRopeSkippingMaxFrequency());
        trackrecord.setRopeSkippingRestTime(summaryItem.getRopeSkippingRestTime());
        if (trackrecord.getType().intValue() == 21 || trackrecord.getType().intValue() == 23) {
            trackrecord.setTouchStrokes(ropeSkippingCount);
        }
        trackrecord.setMarathon(summaryItem.getMarathon());
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.excludeFieldsWithModifiers(16, 8);
        trackrecord.setOriginalJsonData(gsonBuilder.create().toJson(summaryItem));
        return trackrecord;
    }

    private List<com.xiaomi.hm.health.databases.model.Device> s() {
        return f.getValue().findBoundDevices(HMDeviceType.WATCH);
    }

    public static void switchMainDevice(Context context, com.xiaomi.hm.health.databases.model.Device device) {
        Device watchDevice;
        if (context == null || device == null) {
            return;
        }
        String device_address = device.getDevice_address();
        if (DeviceManager.getManager(context).find(device_address) == null) {
            Lazy<DeviceManagerApi> lazy = g;
            if ((lazy.getValue() instanceof DeviceManagerZeppApi) && (watchDevice = ((DeviceManagerZeppApi) lazy.getValue()).toWatchDevice(device)) != null) {
                DeviceManager.getManager(context).save(watchDevice, true);
            }
        }
        BindUtil.switchMainDevice(context, device_address);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void t(IHMFirmwareUpgradeCallback iHMFirmwareUpgradeCallback, int i2, int i3, String str) {
        if (i2 == 4) {
            if (i3 == 1) {
                iHMFirmwareUpgradeCallback.onFwProgress(new Progress(100, 10));
            } else if (i3 == -1) {
                iHMFirmwareUpgradeCallback.onFwProgress(new Progress(100, 90));
            }
        } else if (i2 == Integer.MAX_VALUE) {
            iHMFirmwareUpgradeCallback.onFwProgress(new Progress(100, 100));
        }
        HMLog.i(b, "syncType:" + i2 + ",state:" + i3 + ",description:" + str, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u(final IHMFirmwareUpgradeCallback iHMFirmwareUpgradeCallback) {
        iHMFirmwareUpgradeCallback.onFwStart(0);
        iHMFirmwareUpgradeCallback.onFwStop(F(4, new SyncCenter.SyncListener() { // from class: no3
            @Override // com.huami.watch.companion.sync.SyncCenter.SyncListener
            public final void onSyncStateChanged(int i2, int i3, String str) {
                HMWatchLogic.t(iHMFirmwareUpgradeCallback, i2, i3, str);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void v(com.xiaomi.hm.health.databases.model.Device device) throws Exception {
        HMLog.d(b, "device " + device.getDevice_bind_status(), new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void w(Throwable th) throws Exception {
        HMLog.d(b, "throwable : " + th.getMessage(), new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List x(List list) throws Exception {
        HMLog.d(b, "doInBackground", new Object[0]);
        HMHttpResponseData hMHttpResponseData = new HMHttpResponseData();
        HMDeviceWebAPI.getDeviceListFromServerSync(new c(hMHttpResponseData), true);
        if (!hMHttpResponseData.isSuccess()) {
            return null;
        }
        ArrayList<com.xiaomi.hm.health.databases.model.Device> deviceListFromWeb = HMDeviceWebAPI.parseDeviceListFromWeb(hMHttpResponseData);
        if (deviceListFromWeb != null && !deviceListFromWeb.isEmpty()) {
            return deviceListFromWeb;
        }
        HMLog.d(b, "unbind ", new Object[0]);
        J();
        com.xiaomi.hm.health.databases.model.Device device = (com.xiaomi.hm.health.databases.model.Device) list.get(0);
        if (device != null) {
            device.setDevice_bind_status(-1);
            device.setStatus(-1);
            device.setActiveStatus(0);
            f.getValue().update(device);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ com.xiaomi.hm.health.databases.model.Device y(List list) throws Exception {
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            com.xiaomi.hm.health.databases.model.Device device = (com.xiaomi.hm.health.databases.model.Device) it2.next();
            if (device.getDevice_type().intValue() == HMDeviceType.WATCH.getValue() && device.getDevice_bind_status().intValue() == 1) {
                return device;
            }
        }
        com.xiaomi.hm.health.databases.model.Device device2 = new com.xiaomi.hm.health.databases.model.Device();
        device2.setDevice_bind_status(0);
        return device2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ com.xiaomi.hm.health.databases.model.Device z(com.xiaomi.hm.health.databases.model.Device device, com.xiaomi.hm.health.databases.model.Device device2) throws Exception {
        if (device.getDevice_bind_status().intValue() == 0) {
            HMLog.d(b, "unbind ", new Object[0]);
            J();
            if (device2 != null) {
                device2.setDevice_bind_status(-1);
                device2.setStatus(-1);
                device2.setActiveStatus(0);
                f.getValue().update(device2);
            }
        } else if (!device.getDevice_address().equals(device2.getDevice_address())) {
            HMLog.d(b, "update local " + device2.getActiveStatus(), new Object[0]);
            device.setStatus(1);
            device.setActiveStatus(device2.getActiveStatus());
            device.setDevice_bind_status(1);
            Lazy<DeviceRepositoryApi> lazy = f;
            lazy.getValue().insertOrReplace(device);
            J();
            if (device2.getActiveStatus().intValue() == 1) {
                g.getValue().bindDevice(null, device);
                EventBus.getDefault().postSticky(new HMDeviceBindEvent(true, HMDeviceType.WATCH));
            }
            device2.setDevice_bind_status(-1);
            device2.setStatus(-1);
            device2.setActiveStatus(0);
            lazy.getValue().update(device2);
        }
        return device;
    }

    public void agpsUpgrade(final IHMFirmwareUpgradeCallback iHMFirmwareUpgradeCallback) {
        this.a.execute(new Runnable() { // from class: vo3
            @Override // java.lang.Runnable
            public final void run() {
                this.a.u(iHMFirmwareUpgradeCallback);
            }
        });
    }

    public Disposable checkAmazfitDeviceValid() {
        final List<com.xiaomi.hm.health.databases.model.Device> listS = s();
        if (listS == null || listS.isEmpty()) {
            return null;
        }
        return Observable.fromCallable(new Callable() { // from class: mo3
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.x(listS);
            }
        }).map(new Function() { // from class: to3
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return HMWatchLogic.y((List) obj);
            }
        }).zipWith(Observable.just(listS.get(0)), new BiFunction() { // from class: qo3
            @Override // io.reactivex.functions.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return this.a.z((com.xiaomi.hm.health.databases.model.Device) obj, (com.xiaomi.hm.health.databases.model.Device) obj2);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: ro3
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                HMWatchLogic.v((com.xiaomi.hm.health.databases.model.Device) obj);
            }
        }, new Consumer() { // from class: so3
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                HMWatchLogic.w((Throwable) obj);
            }
        });
    }

    public void getWatchSettingProperties() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new PropertyItem("huami.watch.health.config"));
        HMUserPropertiesAPI.getWatchBatchProperty(arrayList, false, new b());
    }

    public void syncFromWatchService(final IHMActivityDataCallback iHMActivityDataCallback) {
        iHMActivityDataCallback.onSyncStart();
        if (!g.getValue().hasBound(HMDeviceType.WATCH)) {
            iHMActivityDataCallback.onSyncFinish(new HMDeviceSyncDataError(100));
        } else if (SyncCenter.getCenter(DeviceXFunctionsKt.getContext()).isSyncing()) {
            iHMActivityDataCallback.onSyncFinish(new HMDeviceSyncDataError(0));
        } else {
            this.a.execute(new Runnable() { // from class: lo3
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.B(iHMActivityDataCallback);
                }
            });
        }
    }

    public void syncGpsData(final HMCallback hMCallback) {
        this.a.execute(new Runnable() { // from class: uo3
            @Override // java.lang.Runnable
            public final void run() {
                this.a.D(hMCallback);
            }
        });
    }

    public boolean syncOtherData() {
        return F(56, new SyncCenter.SyncListener() { // from class: po3
            @Override // com.huami.watch.companion.sync.SyncCenter.SyncListener
            public final void onSyncStateChanged(int i2, int i3, String str) {
                HMWatchLogic.E(i2, i3, str);
            }
        });
    }
}
