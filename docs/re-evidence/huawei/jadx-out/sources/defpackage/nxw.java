package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import com.huawei.btsportdevice.callback.MessageOrStateCallback;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.design.pattern.Observer;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.health.IBaseCommonCallback;
import com.huawei.health.device.api.BackgroundSportApi;
import com.huawei.health.device.base.AbstractFitnessClient;
import com.huawei.health.device.datatype.SkippingTargetMode;
import com.huawei.health.device.model.DeviceInformation;
import com.huawei.health.sportservice.SportLaunchParams;
import com.huawei.health.suggestion.CoachController;
import com.huawei.health.suggestion.fit.callback.CourseLinkageLifecycle;
import com.huawei.hihealth.CharacteristicConstant;
import com.huawei.hihealth.StartSportParam;
import com.huawei.hmf.annotation.ApiDefine;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.indoorequip.activity.IndoorEquipConnectedActivity;
import com.huawei.indoorequip.activity.IndoorEquipConnectedManager;
import com.huawei.indoorequip.datastruct.QrCodeOrNfcInfo;
import com.huawei.indoorequip.device.DeviceRemovedListenerManager;
import com.huawei.indoorequip.viewmodel.BackgroundSportViewModel;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.operation.ble.BleConstants;
import com.huawei.operation.h5pro.jsmodules.device.MatterDataContans;
import com.huawei.operation.share.HiHealthError;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes40.dex */
@ApiDefine(uri = BackgroundSportApi.class)
public class nxw implements BackgroundSportApi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IBaseCommonCallback f43917a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f43919c;
    private BackgroundSportViewModel d;
    private BackgroundSportViewModel e;
    private String f;
    private Handler g;
    private DeviceInformation i;
    private IBaseCommonCallback j;
    private boolean k;
    private IndoorEquipConnectedManager l;
    private nwa m;
    private int n;
    private boolean o;
    private QrCodeOrNfcInfo p;
    private String q;
    private int r;
    private boolean s;
    private int t;
    private int u;
    private int x;
    private Observer h = new Observer() { // from class: nxw.2
        @Override // com.huawei.haf.design.pattern.Observer
        public void notify(String str, Object... objArr) {
            ReleaseLogUtil.d("Track_BackgroundSportApiImpl", "DeviceControlObserver notify, the args is " + Arrays.toString(objArr));
            Object obj = objArr[0];
            if (obj instanceof String) {
                Object obj2 = objArr[1];
                if (obj2 instanceof Integer) {
                    Integer num = (Integer) obj2;
                    int iIntValue = num.intValue();
                    if ("INDOOR_BIKE_RESISTANCE_CONTROL".equals((String) obj)) {
                        LogUtil.a("BackgroundSportApiImpl", "indoor bike resistance control is ", num);
                        nxw nxwVar = nxw.this;
                        nxwVar.d(iIntValue, nxwVar.j);
                        nxw.this.o = true;
                        return;
                    }
                    return;
                }
            }
            ReleaseLogUtil.a("Track_BackgroundSportApiImpl", "the args type is not right");
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CourseLinkageLifecycle f43918b = new CourseLinkageLifecycle() { // from class: nxw.5
        @Override // com.huawei.health.suggestion.fit.callback.CourseLinkageLifecycle
        public void start(int i, Bundle bundle) {
        }

        @Override // com.huawei.health.suggestion.fit.callback.CourseLinkageLifecycle
        public void resume(int i) {
            if (nxw.this.e != null) {
                nxw.this.e.onResumeSport();
            }
        }

        @Override // com.huawei.health.suggestion.fit.callback.CourseLinkageLifecycle
        public void pause(int i) {
            if (nxw.this.e != null) {
                nxw.this.e.onPauseSport();
            }
        }

        @Override // com.huawei.health.suggestion.fit.callback.CourseLinkageLifecycle
        public void stop(int i) {
            if (nxw.this.e != null) {
                nxw.this.e.m825x32b3e3a1();
                nxw.this.f43919c = false;
                nxw.this.c();
            }
        }
    };

    private boolean a(int i, int i2) {
        return i > 0 && i <= 655 && i2 > 0 && i2 <= 32767;
    }

    @Override // com.huawei.health.device.api.BackgroundSportApi
    public void startSportEnhance(StartSportParam startSportParam, IBaseCommonCallback iBaseCommonCallback) {
        ReleaseLogUtil.d("Track_BackgroundSportApiImpl", "startSportEnhance");
        if (b(iBaseCommonCallback)) {
            if (this.f43919c && (CoachController.c().b() == 2 || CoachController.c().b() == 1)) {
                ReleaseLogUtil.d("Track_BackgroundSportApiImpl", "startSportEnhance is already start");
                e(101, HiHealthError.getErrorMessage(101), iBaseCommonCallback);
                return;
            }
            this.f43919c = true;
            this.f43917a = iBaseCommonCallback;
            this.x = startSportParam.getInt(BleConstants.SPORT_TYPE);
            int i = startSportParam.getInt("isSaveData", CharacteristicConstant.SportRecordSaveModel.SAVE.getValue());
            this.n = i;
            ReleaseLogUtil.d("Track_BackgroundSportApiImpl", "startSportEnhance mIsSaveData: ", Integer.valueOf(i));
            if (hcd.f36390a.contains(Integer.valueOf(this.x))) {
                c(iBaseCommonCallback);
                return;
            }
            e(startSportParam);
            if (this.k) {
                if (this.s) {
                    ReleaseLogUtil.d("Track_BackgroundSportApiImpl", "repeat error");
                    e(101, HiHealthError.getErrorMessage(101), iBaseCommonCallback);
                    return;
                } else {
                    ReleaseLogUtil.d("Track_BackgroundSportApiImpl", "then start sport");
                    b(String.valueOf(this.x));
                    d();
                    e(0, HiHealthError.getErrorMessage(0), iBaseCommonCallback);
                    return;
                }
            }
            ReleaseLogUtil.d("Track_BackgroundSportApiImpl", "device is not connected, start connecting");
            QrCodeOrNfcInfo qrCodeOrNfcInfoAnalysisQrCodeOrNfc = QrCodeOrNfcInfo.analysisQrCodeOrNfc(a());
            this.p = qrCodeOrNfcInfoAnalysisQrCodeOrNfc;
            if (qrCodeOrNfcInfoAnalysisQrCodeOrNfc != null) {
                qrCodeOrNfcInfoAnalysisQrCodeOrNfc.setDataSource(1);
            }
            this.m = nwa.n();
            this.i = new DeviceInformation();
            b();
            if (this.f.equals("262")) {
                return;
            }
            a(a());
        }
    }

    private void c(IBaseCommonCallback iBaseCommonCallback) {
        LogUtil.a("BackgroundSportApiImpl", "start sport ", Integer.valueOf(this.x), " with wear");
        if (this.e != null) {
            LogUtil.a("BackgroundSportApiImpl", "mBackgroundWearSportViewModel != null");
        } else {
            LogUtil.a("BackgroundSportApiImpl", "mBackgroundWearSportViewModel == null");
            this.e = new BackgroundSportViewModel();
            SportLaunchParams sportLaunchParams = new SportLaunchParams();
            sportLaunchParams.setSportType(this.x);
            sportLaunchParams.addExtra("map_tracking_sport_type_sportting", Integer.valueOf(this.x));
            sportLaunchParams.addExtra("KEY_IS_VOICE_ENABLE", false);
            sportLaunchParams.addExtra("keySportRecordIsToSave", Integer.valueOf(this.n));
            CoachController.c().c(CoachController.StatusSource.NEW_LINK_WEAR, this.f43918b);
            this.e.e(sportLaunchParams);
            this.e.requestData();
            this.e.onPreSport();
        }
        this.e.onStartSport();
        e(0, "start sport by wear successfully", iBaseCommonCallback);
    }

    private boolean b(IBaseCommonCallback iBaseCommonCallback) {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter == null) {
            ReleaseLogUtil.e("Track_BackgroundSportApiImpl", "bluetoothAdapter is null");
            e(1005, HiHealthError.getErrorMessage(1005), iBaseCommonCallback);
            return false;
        }
        if (defaultAdapter.isEnabled()) {
            return true;
        }
        ReleaseLogUtil.e("Track_BackgroundSportApiImpl", "bluetooth is not enable");
        e(1005, HiHealthError.getErrorMessage(1005), iBaseCommonCallback);
        return false;
    }

    private String a() {
        StringBuilder sb = new StringBuilder(16);
        sb.append("ftmp=");
        sb.append(this.u);
        sb.append("&t=");
        sb.append(this.f);
        sb.append("&ble=");
        sb.append(this.q);
        sb.append("&stype=");
        sb.append(this.x);
        return sb.toString();
    }

    private void a(String str) {
        ReleaseLogUtil.d("BackgroundSportApiImpl", "connectBtByNfc");
        if (nzc.a()) {
            this.m.i(false);
            this.l.e(str);
        }
    }

    private void b() {
        LogUtil.a("BackgroundSportApiImpl", "initConnectedManager");
        if (this.l == null) {
            if (Looper.myLooper() == null) {
                Looper.prepare();
            }
            if (this.g == null) {
                this.g = new Handler();
            }
            IndoorEquipConnectedManager indoorEquipConnectedManager = new IndoorEquipConnectedManager(BaseApplication.b(), new IndoorEquipConnectedManager.OnNfcConnectListener() { // from class: nxw.1
                @Override // com.huawei.indoorequip.activity.IndoorEquipConnectedManager.OnNfcConnectListener
                public void onStartTimeChange(long j) {
                    nxw.this.a(j);
                }

                @Override // com.huawei.indoorequip.activity.IndoorEquipConnectedManager.OnNfcConnectListener
                public void onQrCodeOrNfcInfoSet(QrCodeOrNfcInfo qrCodeOrNfcInfo) {
                    nxw.this.c(qrCodeOrNfcInfo);
                }
            }, this.g);
            this.l = indoorEquipConnectedManager;
            indoorEquipConnectedManager.init();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(QrCodeOrNfcInfo qrCodeOrNfcInfo) {
        if (this.d != null) {
            LogUtil.a("BackgroundSportApiImpl", "mBackgroundSportViewModel setQrCodeOrNfcInfo");
            this.d.e(qrCodeOrNfcInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(long j) {
        if (this.d != null) {
            LogUtil.a("BackgroundSportApiImpl", "mBackgroundSportViewModel set time");
            this.d.a(j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        LogUtil.a("BackgroundSportApiImpl", "initViewModel");
        if (this.d != null) {
            ReleaseLogUtil.d("BackgroundSportApiImpl", "mBackgroundSportViewModel != null");
            return;
        }
        this.d = new BackgroundSportViewModel();
        c(this.p);
        int iA = nzc.a(this.f);
        LogUtil.a("BackgroundSportApiImpl", "initViewModel with sport type: ", Integer.valueOf(iA));
        SportLaunchParams sportLaunchParams = new SportLaunchParams();
        sportLaunchParams.setSportType(nzc.a(this.f));
        sportLaunchParams.addExtra(MatterDataContans.KEY_MAC_ADDRESS, this.q);
        sportLaunchParams.addExtra("map_tracking_sport_type_sportting", Integer.valueOf(iA));
        sportLaunchParams.addExtra("KEY_IS_VOICE_ENABLE", false);
        sportLaunchParams.addExtra("keySportRecordIsToSave", Integer.valueOf(this.n));
        if (this.f.equals("262")) {
            sportLaunchParams.setSportTarget(this.t);
            sportLaunchParams.setTrackType(this.t);
            sportLaunchParams.setTargetValue(this.r);
        }
        this.d.e(sportLaunchParams);
        this.d.requestData();
        this.d.onPreSport();
        if (this.x == 265) {
            nxs.d().b(true);
        }
    }

    private void e(StartSportParam startSportParam) {
        LogUtil.a("BackgroundSportApiImpl", "initParam");
        this.u = startSportParam.getInt("ftmp");
        this.f = String.valueOf(startSportParam.getInt("deviceType"));
        this.q = startSportParam.getString("macAddress");
        boolean z = startSportParam.getBoolean("isConnectSportDevice");
        this.s = z;
        ReleaseLogUtil.d("BackgroundSportApiImpl", "isConnectSportDevice = ", Boolean.valueOf(z));
        if (this.f.equals("262")) {
            emh emhVarB = emh.b();
            emhVarB.j();
            emhVarB.a(true, this.q);
            this.t = startSportParam.getInt("ropeStartMode");
            this.r = startSportParam.getInt("ropeGoal");
            if (this.t == 6) {
                this.r = 0;
            }
            emhVarB.c(new SkippingTargetMode(this.t, this.r, null));
            emhVarB.b("BackgroundSportApiImpl", new MessageOrStateCallback() { // from class: nxw.4
                @Override // com.huawei.btsportdevice.callback.MessageOrStateCallback
                public void onNewMessage(int i, Bundle bundle) {
                    nxw.this.b(i, bundle);
                }

                @Override // com.huawei.btsportdevice.callback.MessageOrStateCallback
                public void onStateChange(String str) {
                    ReleaseLogUtil.d("BackgroundSportApiImpl", "rope_state ", str);
                    if (AbstractFitnessClient.ACTION_READ_SUCCESS.equals(str)) {
                        nxw.this.d();
                        nxw.this.d.onStartSport();
                    }
                }
            }, false);
            return;
        }
        nxs.d().f();
        nxs.d().a(getClass().getSimpleName(), new AnonymousClass3());
    }

    /* JADX INFO: renamed from: nxw$3, reason: invalid class name */
    class AnonymousClass3 implements MessageOrStateCallback {
        AnonymousClass3() {
        }

        @Override // com.huawei.btsportdevice.callback.MessageOrStateCallback
        public void onNewMessage(int i, Bundle bundle) {
            nxw.this.b(i, bundle);
        }

        @Override // com.huawei.btsportdevice.callback.MessageOrStateCallback
        public void onStateChange(String str) {
            ReleaseLogUtil.d("BackgroundSportApiImpl", "state ", str);
            nxw nxwVar = nxw.this;
            nxwVar.c(str, nxwVar.f43917a);
            if (AbstractFitnessClient.ACTION_READ_SUCCESS.equals(str)) {
                ReleaseLogUtil.d("BackgroundSportApiImpl", "connected");
                nxw.this.k = true;
                if (!nxw.this.s) {
                    nxw nxwVar2 = nxw.this;
                    nxwVar2.b(String.valueOf(nxwVar2.x));
                    nxw.this.d();
                    nxw.this.s = false;
                } else {
                    ReleaseLogUtil.d("BackgroundSportApiImpl", "no need to start sport");
                }
                DeviceRemovedListenerManager.a().a(nxw.this.q, new DeviceRemovedListenerManager.IDeviceRemovedListener() { // from class: nxt
                    @Override // com.huawei.indoorequip.device.DeviceRemovedListenerManager.IDeviceRemovedListener
                    public final void onDeviceRemoved(String str2) {
                        this.f43915c.e(str2);
                    }
                });
                return;
            }
            LogUtil.a("BackgroundSportApiImpl", "not connected");
        }

        /* synthetic */ void e(String str) {
            ReleaseLogUtil.a("BackgroundSportApiImpl", "Connected device removed, stop sport");
            if (nxw.this.f43917a != null) {
                nxw.this.e(150, HiHealthError.getErrorMessage(150), nxw.this.f43917a);
            }
            nxw.this.stopSportEnhance(null);
        }
    }

    @Override // com.huawei.health.device.api.BackgroundSportApi
    public void stopSportEnhance(IBaseCommonCallback iBaseCommonCallback) {
        ReleaseLogUtil.d("BackgroundSportApiImpl", "stopSportEnhance");
        this.f43919c = false;
        c();
        if (iBaseCommonCallback != null) {
            try {
                iBaseCommonCallback.onResponse(0, "success");
            } catch (RemoteException e) {
                ReleaseLogUtil.a("BackgroundSportApiImpl", "stopSportEnhance RemoteException: ", e.getMessage());
                return;
            }
        }
        iwy.a(BaseApplication.b()).d(0);
    }

    @Override // com.huawei.health.device.api.BackgroundSportApi
    public void pauseSportEnhance(IBaseCommonCallback iBaseCommonCallback) {
        BackgroundSportViewModel backgroundSportViewModel = this.e;
        if (backgroundSportViewModel != null) {
            backgroundSportViewModel.onPauseSport();
            e(0, "pause sport successfully", iBaseCommonCallback);
        } else {
            e(4, "api state exception", iBaseCommonCallback);
        }
    }

    @Override // com.huawei.health.device.api.BackgroundSportApi
    public void resumeSportEnhance(IBaseCommonCallback iBaseCommonCallback) {
        BackgroundSportViewModel backgroundSportViewModel = this.e;
        if (backgroundSportViewModel != null) {
            backgroundSportViewModel.onResumeSport();
            e(0, "resume sport successfully", iBaseCommonCallback);
        } else {
            e(4, "api state exception", iBaseCommonCallback);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        if (this.d != null) {
            ReleaseLogUtil.d("BackgroundSportApiImpl", "mBackgroundSportViewModel releaseResource");
            this.d.m825x32b3e3a1();
            this.d.unregisterAll();
            this.d.e(true);
            this.d = null;
        }
        if (this.e != null) {
            ReleaseLogUtil.d("BackgroundSportApiImpl", "mBackgroundWearSportViewModel releaseResource");
            this.e.m825x32b3e3a1();
            this.e.unregisterAll();
            this.e.e(true);
            this.e = null;
        }
        Handler handler = this.g;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.g = null;
        }
        if ("262".equals(this.f)) {
            emh.b().h();
        } else if (!TextUtils.isEmpty(this.f)) {
            if (this.x == 265) {
                nxs.d().b(false);
            }
            nxs.d().m();
        } else {
            ReleaseLogUtil.d("BackgroundSportApiImpl", "wear app sport");
        }
        this.k = false;
        DeviceRemovedListenerManager.a().b(this.q);
        Observer observer = this.h;
        if (observer != null) {
            ObserverManagerUtil.a(observer, "DEVICE_CONTROL");
        }
        ReleaseLogUtil.d("BackgroundSportApiImpl", "reset connect status");
        this.s = false;
        IndoorEquipConnectedActivity.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:57:0x00b6  */
    public void c(String str, IBaseCommonCallback iBaseCommonCallback) {
        LogUtil.a("BackgroundSportApiImpl", "StateChangeInCallback :", str);
        str.hashCode();
        switch (str) {
            case "com.huawei.btsportdevice.ACTION_PAIR_UNSUPPORTED":
                e(iBaseCommonCallback);
                break;
            case "com.huawei.btsportdevice.ACTION_GATT_STATE_CONNECTED":
            case "com.huawei.btsportdevice.ACTION_GATT_STATE_RECONNECTING":
            case "com.huawei.btsportdevice.ACTION_GATT_STATE_CONNECTING":
                this.m.e(str);
                break;
            case "com.huawei.btsportdevice.ACTION_GATT_STATE_DISCONNECTED":
                this.m.e(str);
                e("DisConnect");
                e(iBaseCommonCallback);
                break;
            case "com.huawei.btsportdevice.ACTION_INVALID_DEVICE_INFO":
                b(iBaseCommonCallback, "InvalidDIS");
                break;
            case "com.huawei.btsportdevice.ACTION_GATT_STATE_RECONNECTED":
                this.m.e(AbstractFitnessClient.ACTION_GATT_STATE_CONNECTED);
                break;
            case "com.huawei.btsportdevice.ACTION_SERVICE_DISCOVERIED":
                this.m.e(str);
                e("DiscoverServSuccess");
                break;
            case "com.huawei.btsportdevice.ACTION_SERVICE_REDISCOVERIED":
                this.m.e(AbstractFitnessClient.ACTION_SERVICE_DISCOVERIED);
                e("ReDiscoverServSuccess");
                break;
            case "com.huawei.btsportdevice.ACTION_READ_SUCCESS":
                e(0, "connect success", iBaseCommonCallback);
                break;
            case "com.huawei.btsportdevice.ACTION_FAILED_UNLOCK_BT_MODULE":
                b(iBaseCommonCallback, "UnlockFailed");
                break;
            case "com.huawei.btsportdevice.ACTION_SERVICE_NOT_SUPPORT":
                b(iBaseCommonCallback, "ServiceUnsupport");
                break;
            case "com.huawei.btsportdevice.ACTION_GATT_STATE_DISCONNECTING":
                this.m.e(str);
                e(iBaseCommonCallback);
                break;
            default:
                LogUtil.a("BackgroundSportApiImpl", "onStateChange(call back in activity), state is unknow (it is ", str, ").");
                break;
        }
    }

    private void b(IBaseCommonCallback iBaseCommonCallback, String str) {
        e(str);
        e();
        e(iBaseCommonCallback);
    }

    private void e() {
        ReleaseLogUtil.d("BackgroundSportApiImpl", "disconnect, hasFoundServiceSuccessBefore is ", Boolean.valueOf(this.m.t()));
        this.l.a(this.m.t());
    }

    private void e(IBaseCommonCallback iBaseCommonCallback) {
        ReleaseLogUtil.e("BackgroundSportApiImpl", "connect fail");
        this.f43919c = false;
        this.k = false;
        e(4, "connect fail", iBaseCommonCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i, String str, IBaseCommonCallback iBaseCommonCallback) {
        if (iBaseCommonCallback != null) {
            try {
                iBaseCommonCallback.onResponse(i, str);
            } catch (RemoteException e) {
                LogUtil.e("BackgroundSportApiImpl", "onResponse RemoteException", e.getMessage());
            }
        }
    }

    private void e(String str) {
        QrCodeOrNfcInfo qrCodeOrNfcInfo = this.p;
        String modelString = Constants.LINK;
        String btMac = qrCodeOrNfcInfo != null ? qrCodeOrNfcInfo.getBtMac() : Constants.LINK;
        nxo nxoVar = new nxo();
        nxoVar.j(str);
        nxoVar.h(nxs.d().g() + "");
        nxoVar.f((this.p == null || nxs.d().g()) ? Constants.LINK : this.p.getBtName());
        DeviceInformation deviceInformation = this.i;
        nxoVar.a(deviceInformation != null ? Integer.toString(deviceInformation.getDeviceType()) : Constants.LINK);
        DeviceInformation deviceInformation2 = this.i;
        nxoVar.b(deviceInformation2 != null ? deviceInformation2.getManufacturerString() : Constants.LINK);
        DeviceInformation deviceInformation3 = this.i;
        if (deviceInformation3 != null) {
            modelString = deviceInformation3.getModelString();
        }
        nxoVar.d(modelString);
        nxoVar.c(btMac);
        nzc.d(BaseApplication.b(), nxoVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i, Bundle bundle) {
        if (i == 305) {
            LogUtil.a("BackgroundSportApiImpl", "in handleMessage, case is MSG_BT_SERVICE_DISCOVER_SHOW");
            this.m.e(true);
        } else if (i == 309) {
            LogUtil.a("BackgroundSportApiImpl", "in handleMessage, case is MSG_BT_SERVICE_REDISCOVER_SHOW");
            this.m.e(true);
        } else {
            if (i != 902) {
                return;
            }
            b(bundle);
        }
    }

    private void b(Bundle bundle) {
        if (bundle.containsKey("com.huawei.health.fitness.KEY_MESSAGE_FOR_CALLBACK_FITNESS_DATA")) {
            Serializable serializable = bundle.getSerializable("com.huawei.health.fitness.KEY_MESSAGE_FOR_CALLBACK_FITNESS_DATA");
            if (serializable instanceof HashMap) {
                for (Map.Entry entry : ((HashMap) serializable).entrySet()) {
                    if (entry != null && entry.getKey() != null) {
                        c((Integer) entry.getKey(), entry.getValue());
                    }
                }
            }
        }
    }

    private void c(Integer num, Object obj) {
        switch (num.intValue()) {
            case 20005:
                this.i.setDeviceType(((Integer) obj).intValue());
                break;
            case 20006:
                this.i.setManufacturerString(obj.toString());
                break;
            case 20007:
                this.i.setModelString(obj.toString());
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        LogUtil.a("BackgroundSportApiImpl", "sendModeTypeToRower modeType = ", str);
        if ("290".equals(str)) {
            nxs.d().d(21, new int[]{3});
        } else if ("291".equals(str)) {
            LogUtil.a("BackgroundSportApiImpl", "sportType is SPORT_TYPE_ROWERSTRENGTH ");
            nxs.d().d(21, new int[]{4});
        } else {
            LogUtil.a("BackgroundSportApiImpl", "sportType is other type ");
        }
    }

    @Override // com.huawei.health.device.api.BackgroundSportApi
    public void sendDeviceControlinstruction(String str, final IBaseCommonCallback iBaseCommonCallback) {
        LogUtil.a("BackgroundSportApiImpl", "enter sendDeviceControlinstruction, controlOptions", str);
        this.j = iBaseCommonCallback;
        this.o = false;
        try {
            JSONObject jSONObject = new JSONObject(str);
            int iOptInt = jSONObject.optInt("cadence", -1);
            int iOptInt2 = jSONObject.optInt("power", -1);
            if (iOptInt == -1) {
                iOptInt = 60;
            }
            if (a(iOptInt, iOptInt2)) {
                ObserverManagerUtil.a(this.h, "DEVICE_CONTROL");
                ObserverManagerUtil.d(this.h, "DEVICE_CONTROL");
                boolean zC = nxs.d().c(iOptInt, iOptInt2);
                LogUtil.a("BackgroundSportApiImpl", "sendDeviceControlinstruction result:", Boolean.valueOf(zC));
                if (!zC) {
                    e(HiHealthError.ERR_WRONG_DEVICE, "Failed to send the command", iBaseCommonCallback);
                    return;
                } else {
                    new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: nxu
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.d.d(iBaseCommonCallback);
                        }
                    }, 5000L);
                    return;
                }
            }
            e(2, "param invalid", iBaseCommonCallback);
        } catch (JSONException e) {
            ReleaseLogUtil.a("BackgroundSportApiImpl", "occur JSONException:", ExceptionUtils.c(e));
            e(2, "param invalid", iBaseCommonCallback);
        }
    }

    /* synthetic */ void d(IBaseCommonCallback iBaseCommonCallback) {
        LogUtil.a("BackgroundSportApiImpl", "mIsDeviceControlHadCallback = ", Boolean.valueOf(this.o));
        if (this.o) {
            return;
        }
        LogUtil.a("BackgroundSportApiImpl", "Fail, response time out");
        e(HiHealthError.ERR_WRONG_DEVICE, "Fail, response time out", iBaseCommonCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i, IBaseCommonCallback iBaseCommonCallback) {
        if (i == 1) {
            e(0, "Success", iBaseCommonCallback);
        } else {
            e(1, "Fail", iBaseCommonCallback);
        }
    }
}
