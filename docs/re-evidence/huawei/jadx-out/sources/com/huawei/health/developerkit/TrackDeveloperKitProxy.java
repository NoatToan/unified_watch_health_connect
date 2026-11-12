package com.huawei.health.developerkit;

import android.content.ContentValues;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.media3.common.C;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.design.pattern.Observer;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.health.IBaseCommonCallback;
import com.huawei.health.ITrackDataForDeveloper;
import com.huawei.health.ITrackManagerForDeveloper;
import com.huawei.health.device.api.BackgroundSportApi;
import com.huawei.health.device.api.IndoorEquipManagerApi;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.device.ui.measure.fragment.device.DeviceBindWaitingFragment;
import com.huawei.health.sportservice.SportDataNotify;
import com.huawei.health.sportservice.SportDataOutputApi;
import com.huawei.health.sportservice.SportLifecycle;
import com.huawei.health.suggestion.CoachController;
import com.huawei.health.suggestion.fit.callback.CourseLinkageLifecycle;
import com.huawei.health.suggestion.ui.fitness.activity.SelectDeviceActivity;
import com.huawei.healthcloud.plugintrack.manager.inteface.ISportStateChangeListener;
import com.huawei.hihealth.CharacteristicConstant;
import com.huawei.hihealth.StartSportParam;
import com.huawei.hihealth.StopSportParam;
import com.huawei.hihealthservice.hihealthkit.util.HiHealthKitDataChecker;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwfoundationmodel.trackmodel.ISportDataCallback;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.indoorequip.activity.IndoorEquipConnectedActivity;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.ble.BleConstants;
import com.huawei.operation.share.HiHealthError;
import com.huawei.pluginachievement.manager.model.MedalConstants;
import com.huawei.ui.device.activity.adddevice.OneKeyScanActivity;
import defpackage.ddh;
import defpackage.deo;
import defpackage.dmp;
import defpackage.fhz;
import defpackage.gzv;
import defpackage.hau;
import defpackage.hcd;
import defpackage.hkt;
import defpackage.iem;
import defpackage.ifz;
import defpackage.iov;
import defpackage.ive;
import defpackage.iwy;
import defpackage.jah;
import defpackage.jbg;
import defpackage.kzw;
import defpackage.lcr;
import defpackage.npn;
import health.compact.a.LogAnonymous;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class TrackDeveloperKitProxy extends ITrackManagerForDeveloper.Stub {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List<Integer> f6287b;
    private boolean e;
    private IBaseCommonCallback g;
    private int k;
    private double o;
    private RemoteCallbackList<d> l = new RemoteCallbackList<>();
    private int i = CharacteristicConstant.SportRecordSaveModel.SAVE.getValue();
    private int j = 3;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Observer f6289c = new Observer() { // from class: com.huawei.health.developerkit.TrackDeveloperKitProxy.4
        @Override // com.huawei.haf.design.pattern.Observer
        public void notify(String str, Object... objArr) {
            LogUtil.a("Track_TrackDeveloperKitProxy", "already select device and begin to start device, args is " + Arrays.toString(objArr));
            try {
                if (objArr.length == 0) {
                    TrackDeveloperKitProxy.this.g.onResponse(HiHealthError.ERR_WRONG_DEVICE, "connect wrong device");
                    TrackDeveloperKitProxy.this.e = false;
                    ReleaseLogUtil.a("Track_TrackDeveloperKitProxy", "mDeviceAssociateObserver device info is null, connect wrong device");
                } else {
                    Object obj = objArr[0];
                    if ((obj instanceof String) && (objArr[1] instanceof Integer)) {
                        StartSportParam startSportParam = new StartSportParam((String) objArr[0], 1, ((Integer) objArr[1]).intValue(), TrackDeveloperKitProxy.this.k);
                        startSportParam.putInt("isBackground", 1);
                        startSportParam.putBoolean("isConnectSportDevice", TrackDeveloperKitProxy.this.e);
                        startSportParam.putInt("isSaveData", TrackDeveloperKitProxy.this.i);
                        try {
                            TrackDeveloperKitProxy trackDeveloperKitProxy = TrackDeveloperKitProxy.this;
                            trackDeveloperKitProxy.startSportEnhance(startSportParam, trackDeveloperKitProxy.g);
                        } catch (RemoteException e) {
                            ReleaseLogUtil.a("Track_TrackDeveloperKitProxy", "mDeviceAssociateObserver RemoteException: ", e.getMessage());
                        }
                        TrackDeveloperKitProxy.this.e = false;
                    } else if (obj instanceof Integer) {
                        TrackDeveloperKitProxy.this.g.onResponse(152, "cancel select device");
                        TrackDeveloperKitProxy.this.e = false;
                        ReleaseLogUtil.e("Track_TrackDeveloperKitProxy", "mDeviceAssociateObserver cancel select device");
                    } else {
                        ReleaseLogUtil.e("Track_TrackDeveloperKitProxy", "mDeviceAssociateObserver args type is not right");
                        TrackDeveloperKitProxy.this.e = false;
                    }
                }
            } catch (RemoteException e2) {
                ReleaseLogUtil.a("Track_TrackDeveloperKitProxy", "mDeviceAssociateObserver callback  RemoteException: " + e2.getMessage());
                TrackDeveloperKitProxy.this.e = false;
            }
            if (TrackDeveloperKitProxy.this.f6289c != null) {
                ObserverManagerUtil.a(TrackDeveloperKitProxy.this.f6289c, "DEVICE_ASSOCIATION");
            }
        }
    };
    private int f = 4;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Handler f6288a = new Handler(Looper.getMainLooper()) { // from class: com.huawei.health.developerkit.TrackDeveloperKitProxy.3
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message == null) {
                return;
            }
            super.handleMessage(message);
            IBaseCommonCallback iBaseCommonCallback = (IBaseCommonCallback) message.obj;
            switch (message.what) {
                case 201:
                    if (ive.c().o()) {
                        LogUtil.a("Track_TrackDeveloperKitProxy", "sport started success");
                        TrackDeveloperKitProxy.this.c(iBaseCommonCallback, 0, lcr.b(0));
                    } else {
                        ReleaseLogUtil.a("Track_TrackDeveloperKitProxy", "sport started failed");
                        TrackDeveloperKitProxy.this.c(iBaseCommonCallback, 4, lcr.b(4));
                    }
                    break;
                case 202:
                    if (!ive.c().o()) {
                        LogUtil.a("Track_TrackDeveloperKitProxy", "stopped sport success");
                        iwy.a(BaseApplication.getContext()).d(0);
                        TrackDeveloperKitProxy.this.c(iBaseCommonCallback, 0, lcr.b(0));
                    } else {
                        ReleaseLogUtil.a("Track_TrackDeveloperKitProxy", "stopped sport failed");
                        TrackDeveloperKitProxy.this.c(iBaseCommonCallback, 4, lcr.b(4));
                    }
                    break;
                case 203:
                    if (ive.c().g() == 2) {
                        LogUtil.a("Track_TrackDeveloperKitProxy", "pause sport success");
                        TrackDeveloperKitProxy.this.c(iBaseCommonCallback, 0, lcr.b(0));
                    } else {
                        ReleaseLogUtil.a("Track_TrackDeveloperKitProxy", "pause sport failed");
                        TrackDeveloperKitProxy.this.c(iBaseCommonCallback, 4, lcr.b(4));
                    }
                    break;
                case 204:
                    if (ive.c().o()) {
                        LogUtil.a("Track_TrackDeveloperKitProxy", "resume sport success");
                        TrackDeveloperKitProxy.this.c(iBaseCommonCallback, 0, lcr.b(0));
                    } else {
                        ReleaseLogUtil.a("Track_TrackDeveloperKitProxy", "resume sport failed");
                        TrackDeveloperKitProxy.this.c(iBaseCommonCallback, 4, lcr.b(4));
                    }
                    break;
            }
        }
    };
    private final SportDataOutputApi h = (SportDataOutputApi) Services.d("SportService", SportDataOutputApi.class);
    private final BackgroundSportApi d = (BackgroundSportApi) Services.b("PluginLinkIndoorEquip", BackgroundSportApi.class);

    static {
        ArrayList arrayList = new ArrayList();
        f6287b = arrayList;
        arrayList.add(257);
        arrayList.add(258);
        arrayList.add(259);
    }

    @Override // com.huawei.health.ITrackManagerForDeveloper
    public boolean registerRealtimeSportCallback(ITrackDataForDeveloper iTrackDataForDeveloper) throws RemoteException {
        int iBeginBroadcast;
        int i;
        d dVar;
        ReleaseLogUtil.d("Track_TrackDeveloperKitProxy", "registerRealtimeSportCallback at ", Long.valueOf(System.currentTimeMillis()));
        if (iTrackDataForDeveloper != null) {
            try {
                iBeginBroadcast = this.l.beginBroadcast();
                while (true) {
                    if (i >= iBeginBroadcast) {
                        dVar = null;
                        break;
                    }
                    if (((d) this.l.getBroadcastItem(i)).asBinder() == iTrackDataForDeveloper.asBinder()) {
                        dVar = (d) this.l.getBroadcastItem(i);
                        break;
                    }
                    i++;
                }
            } catch (IllegalStateException e) {
                ReleaseLogUtil.a("Track_TrackDeveloperKitProxy", "beginBroadcast()", LogAnonymous.b(e));
                iBeginBroadcast = 0;
            }
            LogUtil.a("Track_TrackDeveloperKitProxy", "registerDataCallback:Report client count ", Integer.valueOf(iBeginBroadcast));
            i = 0;
            try {
                this.l.finishBroadcast();
            } catch (IllegalStateException e2) {
                ReleaseLogUtil.a("Track_TrackDeveloperKitProxy", "finishBroadcast()", LogAnonymous.b(e2));
            }
            if (dVar == null) {
                d dVar2 = new d(iTrackDataForDeveloper, this);
                iwy.a(BaseApplication.getContext()).e(dVar2, 1L);
                iwy.a(BaseApplication.getContext()).c(dVar2);
                CoachController.c().c(CoachController.StatusSource.APP, dVar2);
                CoachController.c().b(dVar2);
                SportDataOutputApi sportDataOutputApi = this.h;
                if (sportDataOutputApi != null) {
                    sportDataOutputApi.registerSportStatus(dVar2.d(), dVar2);
                    int status = this.h.getStatus();
                    if (status == 1) {
                        dVar2.onStartSport();
                    }
                    if (status == 2) {
                        dVar2.onPauseSport();
                    }
                    b();
                    this.l.register(dVar2);
                }
                return true;
            }
            ReleaseLogUtil.e("Track_TrackDeveloperKitProxy", "registerDataCallback callBack is exist or sportmanager is null");
        } else {
            ReleaseLogUtil.e("Track_TrackDeveloperKitProxy", "registerDataCallback callback is null");
        }
        return false;
    }

    private void b() {
        int iO;
        if (iwy.a(BaseApplication.getContext()).ay()) {
            LogUtil.j("Track_TrackDeveloperKitProxy", "getSportData mSportManager is null");
            iO = iwy.a(BaseApplication.getContext()).o();
        } else {
            iO = 4;
        }
        if (iO == 1) {
            this.f = 2;
        } else {
            if (iO != 2) {
                return;
            }
            this.f = 1;
        }
    }

    @Override // com.huawei.health.ITrackManagerForDeveloper
    public boolean unregisterRealtimeSportCallback(ITrackDataForDeveloper iTrackDataForDeveloper) throws RemoteException {
        int iBeginBroadcast;
        int i;
        d dVar;
        ReleaseLogUtil.d("Track_TrackDeveloperKitProxy", "unRegisterDataCallback at", Long.valueOf(System.currentTimeMillis()));
        if (iTrackDataForDeveloper != null) {
            try {
                iBeginBroadcast = this.l.beginBroadcast();
                while (true) {
                    if (i >= iBeginBroadcast) {
                        dVar = null;
                        break;
                    }
                    if (((d) this.l.getBroadcastItem(i)).asBinder() == iTrackDataForDeveloper.asBinder()) {
                        dVar = (d) this.l.getBroadcastItem(i);
                        break;
                    }
                    i++;
                }
            } catch (IllegalStateException e) {
                ReleaseLogUtil.a("Track_TrackDeveloperKitProxy", "beginBroadcast()", LogAnonymous.b(e));
                iBeginBroadcast = 0;
            }
            LogUtil.d("Track_TrackDeveloperKitProxy", "unRegisterDataCallback:Report client count ", Integer.valueOf(iBeginBroadcast));
            i = 0;
            try {
                this.l.finishBroadcast();
            } catch (IllegalStateException e2) {
                ReleaseLogUtil.a("Track_TrackDeveloperKitProxy", "finishBroadcast()", LogAnonymous.b(e2));
            }
            if (dVar != null) {
                iwy.a(BaseApplication.getContext()).a(dVar);
                iwy.a(BaseApplication.getContext()).b((ISportStateChangeListener) dVar);
                SportDataOutputApi sportDataOutputApi = this.h;
                if (sportDataOutputApi != null) {
                    sportDataOutputApi.unRegisterSportStatus(dVar.d());
                    if (dVar.b() != null) {
                        this.h.cancelSubscribeNotify(dVar.b());
                    }
                }
                this.l.unregister(dVar);
                LogUtil.a("Track_TrackDeveloperKitProxy", "Unregister the callback on service");
                e(iBeginBroadcast);
                return true;
            }
            ReleaseLogUtil.e("Track_TrackDeveloperKitProxy", "unregisterRealtimeSportCallback callBack is exist or sportmanager is null");
        } else {
            ReleaseLogUtil.e("Track_TrackDeveloperKitProxy", "unregisterRealtimeSportCallback callback is null");
        }
        return false;
    }

    private void e(int i) {
        LogUtil.a("Track_TrackDeveloperKitProxy", "checkTrackDataReport ", Integer.valueOf(i));
        if (i != 1) {
            return;
        }
        onServiceDestroy();
        this.l = new RemoteCallbackList<>();
    }

    @Override // com.huawei.health.ITrackManagerForDeveloper
    public int getSportState() throws RemoteException {
        ReleaseLogUtil.d("Track_TrackDeveloperKitProxy", "enter getSportState");
        return this.f;
    }

    @Override // com.huawei.health.ITrackManagerForDeveloper
    public Bundle getSportData() throws RemoteException {
        ReleaseLogUtil.d("Track_TrackDeveloperKitProxy", "enter getSportData");
        if (!iwy.a(BaseApplication.getContext()).ay()) {
            ReleaseLogUtil.e("Track_TrackDeveloperKitProxy", "getSportData mSportManager is null");
            return null;
        }
        return b(iwy.a(BaseApplication.getContext()).ah());
    }

    @Override // com.huawei.health.ITrackManagerForDeveloper
    public void connectSportDevice(int i, IBaseCommonCallback iBaseCommonCallback) throws RemoteException {
        ReleaseLogUtil.d("Track_TrackDeveloperKitProxy", "connectSportDevice ", Integer.valueOf(i));
        if (iBaseCommonCallback == null) {
            return;
        }
        if (!hcd.f36391c.containsKey(Integer.valueOf(i))) {
            ReleaseLogUtil.a("Track_TrackDeveloperKitProxy", "sportType: ", Integer.valueOf(i), " is not supported");
            iBaseCommonCallback.onResponse(2, lcr.b(2));
        } else if (d() || ive.c().o()) {
            LogUtil.j("Track_TrackDeveloperKitProxy", "sport has been started before");
            iBaseCommonCallback.onResponse(4, "sport has been started before");
        } else {
            this.e = true;
            a(i, iBaseCommonCallback);
        }
    }

    @Override // com.huawei.health.ITrackManagerForDeveloper
    public void startSport(int i, IBaseCommonCallback iBaseCommonCallback) throws RemoteException {
        ReleaseLogUtil.d("Track_TrackDeveloperKitProxy", "start sport ", Integer.valueOf(i));
        startSportEnhance(new StartSportParam(i), iBaseCommonCallback);
    }

    private void c(final int i, final IBaseCommonCallback iBaseCommonCallback, final int i2) throws RemoteException {
        ReleaseLogUtil.d("Track_TrackDeveloperKitProxy", "dealWithWearAppSport isSaveData: ", Integer.valueOf(i2));
        if (!iem.e(com.huawei.haf.application.BaseApplication.b().getApplicationContext(), ifz.a())) {
            int i3 = this.j;
            if (i3 > 0) {
                ReleaseLogUtil.d("Track_TrackDeveloperKitProxy", "isConnectedHeartRateDeviceWear is false, retry times: ", Integer.valueOf(i3));
                HandlerCenter.a().d(new Runnable() { // from class: dmb
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f31992a.a(i, iBaseCommonCallback, i2);
                    }
                }, this.j * 1000);
                this.j--;
                return;
            } else {
                this.j = 3;
                ReleaseLogUtil.a("Track_TrackDeveloperKitProxy", "Trying to retry but still unable to connect");
                iBaseCommonCallback.onResponse(150, lcr.b(150));
                return;
            }
        }
        this.j = 3;
        if (!hkt.b()) {
            ReleaseLogUtil.a("Track_TrackDeveloperKitProxy", "device is not supported");
            iBaseCommonCallback.onResponse(153, lcr.b(153));
        } else {
            deo.c(new IBaseResponseCallback() { // from class: dme
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i4, Object obj) {
                    this.d.e(i, i2, iBaseCommonCallback, i4, obj);
                }
            });
        }
    }

    public /* synthetic */ void a(int i, IBaseCommonCallback iBaseCommonCallback, int i2) {
        try {
            c(i, iBaseCommonCallback, i2);
        } catch (RemoteException e) {
            ReleaseLogUtil.a("Track_TrackDeveloperKitProxy", "dealWithWearAppSport RemoteException: ", e.getMessage());
        }
    }

    public /* synthetic */ void e(int i, int i2, IBaseCommonCallback iBaseCommonCallback, int i3, Object obj) {
        ReleaseLogUtil.d("Track_TrackDeveloperKitProxy", "getDeviceSportStatus has response code = ", Integer.valueOf(i3));
        try {
            if ((obj instanceof Integer) && i3 == 100000 && ((Integer) obj).intValue() == 0) {
                StartSportParam startSportParam = new StartSportParam();
                startSportParam.putInt(BleConstants.SPORT_TYPE, i);
                startSportParam.putInt("isBackground", CharacteristicConstant.SportModeType.BACKGROUND_SPORT_MODE.getType());
                startSportParam.putInt("isSaveData", i2);
                iwy.a(jbg.a()).b(i);
                this.d.startSportEnhance(startSportParam, iBaseCommonCallback);
                return;
            }
            iBaseCommonCallback.onResponse(4, "device status failed to get");
            ReleaseLogUtil.e("Track_TrackDeveloperKitProxy", "getDeviceSportStatus errorCode:", Integer.valueOf(i3), " objData:", obj);
        } catch (RemoteException e) {
            ReleaseLogUtil.e("Track_TrackDeveloperKitProxy", "getDeviceSportStatus RemoteException: ", e.getMessage());
        }
    }

    private void a(int i, IBaseCommonCallback iBaseCommonCallback) {
        ObserverManagerUtil.a(this.f6289c, "DEVICE_ASSOCIATION");
        ObserverManagerUtil.d(this.f6289c, "DEVICE_ASSOCIATION");
        this.g = iBaseCommonCallback;
        this.k = i;
        ArrayList<ContentValues> arrayListC = dmp.d().c((HealthDevice.HealthDeviceKind) hcd.f36391c.get(Integer.valueOf(i)));
        ReleaseLogUtil.d("Track_TrackDeveloperKitProxy", "device list length is " + arrayListC.size() + "detail is " + arrayListC.toString());
        if (!arrayListC.isEmpty() && arrayListC.size() > 1) {
            LogUtil.a("Track_TrackDeveloperKitProxy", "come to select one device");
            Intent intent = new Intent(jbg.a(), (Class<?>) SelectDeviceActivity.class);
            intent.addFlags(1409318912);
            intent.putExtra("SPORT_TYPE", i);
            iov.d(jbg.a(), intent);
            return;
        }
        if (arrayListC.size() == 1) {
            LogUtil.a("Track_TrackDeveloperKitProxy", "only one device bonded, startSportEnhance");
            ObserverManagerUtil.e("DEVICE_ASSOCIATION", arrayListC.get(0).getAsString("uniqueId"), hcd.e.get(Integer.valueOf(i)));
            return;
        }
        LogUtil.a("Track_TrackDeveloperKitProxy", "no devices bonded,so jump to onekeyscan page");
        ObserverManagerUtil.a(DeviceBindWaitingFragment.sSkipProductIntroductionObserver, "SKIP_PRODUCT_INTRODUCTION_FRAGMENT");
        ObserverManagerUtil.a("SKIP_START_EXERCISE_UI");
        ObserverManagerUtil.d(DeviceBindWaitingFragment.sSkipProductIntroductionObserver, "SKIP_PRODUCT_INTRODUCTION_FRAGMENT");
        ObserverManagerUtil.d(IndoorEquipConnectedActivity.f17775c, "SKIP_START_EXERCISE_UI");
        Intent intent2 = new Intent(jbg.a(), (Class<?>) OneKeyScanActivity.class);
        intent2.addFlags(1409318912);
        intent2.putExtra("SPORT_TYPE", i);
        iov.d(jbg.a(), intent2);
    }

    @Override // com.huawei.health.ITrackManagerForDeveloper
    public void startSportEnhance(StartSportParam startSportParam, IBaseCommonCallback iBaseCommonCallback) throws RemoteException {
        ReleaseLogUtil.d("Track_TrackDeveloperKitProxy", "enter startSportEnhance");
        if (iBaseCommonCallback == null) {
            ReleaseLogUtil.a("Track_TrackDeveloperKitProxy", "startSportEnhance callback is null");
            return;
        }
        if (this.h == null) {
            ReleaseLogUtil.e("Track_TrackDeveloperKitProxy", "mSportDataOutputApi is null in startSportEnhance()");
            iBaseCommonCallback.onResponse(4, "Failed to initialize the interface");
            return;
        }
        int i = startSportParam.getInt(BleConstants.SPORT_TYPE);
        if (d() || ive.c().o()) {
            ReleaseLogUtil.e("Track_TrackDeveloperKitProxy", "sport has been started before");
            iBaseCommonCallback.onResponse(4, "sport has been started before");
            return;
        }
        if (fhz.d() != null) {
            ReleaseLogUtil.d("Track_TrackDeveloperKitProxy", "getInstance of Mediator success");
        } else {
            ReleaseLogUtil.d("Track_TrackDeveloperKitProxy", "getInstance of Mediator failed");
        }
        if (Looper.myLooper() == null) {
            Looper.prepare();
        }
        if (hcd.f36390a.contains(Integer.valueOf(i))) {
            ReleaseLogUtil.d("Track_TrackDeveloperKitProxy", "start other sport");
            c(i, iBaseCommonCallback, startSportParam.getInt("isSaveData", CharacteristicConstant.SportRecordSaveModel.SAVE.getValue()));
        } else if (f6287b.contains(Integer.valueOf(i))) {
            e(startSportParam, iBaseCommonCallback);
        } else {
            b(startSportParam, iBaseCommonCallback);
        }
    }

    private void e(StartSportParam startSportParam, IBaseCommonCallback iBaseCommonCallback) throws RemoteException {
        ReleaseLogUtil.d("Track_TrackDeveloperKitProxy", "start track sport");
        int i = startSportParam.getInt(BleConstants.SPORT_TYPE);
        String[] strArrC = PermissionUtil.c(PermissionUtil.PermissionType.LOCATION_WITH_BACKGROUND);
        if (i != 264 && (!npn.c(BaseApplication.getContext()) || !PermissionUtil.b(BaseApplication.getContext(), strArrC))) {
            ReleaseLogUtil.e("Track_TrackDeveloperKitProxy", "gps or location not enabled");
            iBaseCommonCallback.onResponse(1006, "gps or location not enabled");
            return;
        }
        Bundle bundle = new Bundle();
        int i2 = startSportParam.getInt("isSaveData", CharacteristicConstant.SportRecordSaveModel.SAVE.getValue());
        ReleaseLogUtil.d("Track_TrackDeveloperKitProxy", "track sport isSaveData: ", Integer.valueOf(i2));
        bundle.putInt("keySportRecordIsToSave", i2);
        ive.c().a(i, true, false, bundle);
        Message messageObtain = Message.obtain();
        messageObtain.obj = iBaseCommonCallback;
        messageObtain.what = 201;
        this.f6288a.sendMessageDelayed(messageObtain, C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
    }

    private void b(StartSportParam startSportParam, IBaseCommonCallback iBaseCommonCallback) throws RemoteException {
        int i = startSportParam.getInt(BleConstants.SPORT_TYPE);
        ReleaseLogUtil.d("Track_TrackDeveloperKitProxy", "start aerobic sport");
        if (TextUtils.isEmpty(startSportParam.getString("macAddress"))) {
            this.i = startSportParam.getInt("isSaveData", CharacteristicConstant.SportRecordSaveModel.SAVE.getValue());
            a(i, iBaseCommonCallback);
            return;
        }
        if (startSportParam.getInt("isBackground") == CharacteristicConstant.SportModeType.BACKGROUND_SPORT_MODE.getType()) {
            iwy.a(jbg.a()).b(i);
            LogUtil.a("Track_TrackDeveloperKitProxy", "backgroundSportApi.startSportEnhance");
            this.d.startSportEnhance(startSportParam, iBaseCommonCallback);
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(BaseApplication.getAppPackage(), "com.huawei.indoorequip.activity.StartSportTransitActivity");
        intent.setPackage(BaseApplication.getAppPackage());
        intent.setFlags(268435456);
        intent.putExtra("startSportParam", kzw.c().a(startSportParam));
        if (jbg.a().getPackageManager().resolveActivity(intent, 0) != null) {
            iov.d(jbg.a(), intent);
            iBaseCommonCallback.onResponse(0, lcr.b(0));
        } else {
            LogUtil.j("Track_TrackDeveloperKitProxy", "com.huawei.indoorequip.activity.StartSportTransitActivity", " is not exist");
            iBaseCommonCallback.onResponse(4, lcr.b(4));
        }
    }

    private boolean d() {
        int status = this.h.getStatus();
        LogUtil.a("Track_TrackDeveloperKitProxy", "Aerobic sport status is ", Integer.valueOf(status));
        return (status == 0 || status == 3) ? false : true;
    }

    @Override // com.huawei.health.ITrackManagerForDeveloper
    public void stopSport(IBaseCommonCallback iBaseCommonCallback) throws RemoteException {
        ReleaseLogUtil.d("Track_TrackDeveloperKitProxy", "enter stop sport");
        this.o = 0.0d;
        if (iBaseCommonCallback == null) {
            ReleaseLogUtil.e("Track_TrackDeveloperKitProxy", "stopSport callback is null");
            return;
        }
        if (Looper.myLooper() == null) {
            Looper.prepare();
        }
        iwy iwyVarA = iwy.a(jbg.a());
        int iK = iwyVarA.k();
        LogUtil.a("Track_TrackDeveloperKitProxy", "stop sportType = ", Integer.valueOf(iK));
        if (hcd.f36391c.containsKey(Integer.valueOf(iK)) || hcd.f36390a.contains(Integer.valueOf(iK)) || iK == 290 || iK == 291) {
            e(iwyVarA, iBaseCommonCallback);
        } else {
            c(iwyVarA, iBaseCommonCallback);
        }
    }

    @Override // com.huawei.health.ITrackManagerForDeveloper
    public void stopSportEnhance(StopSportParam stopSportParam, IBaseCommonCallback iBaseCommonCallback) throws RemoteException {
        ReleaseLogUtil.d("Track_TrackDeveloperKitProxy", "enter stop sport enhance");
        int iK = iwy.a(jbg.a()).k();
        ReleaseLogUtil.d("Track_TrackDeveloperKitProxy", "stop sportType = ", Integer.valueOf(iK));
        String string = stopSportParam.getString("source");
        ReleaseLogUtil.d("Track_TrackDeveloperKitProxy", "stop sport source = ", string);
        if (CharacteristicConstant.StopSportSource.AIDL_DISCONNECTED.getSource().equals(string) && hcd.f36390a.contains(Integer.valueOf(iK))) {
            ReleaseLogUtil.d("Track_TrackDeveloperKitProxy", "Other sport does not need to be stopped while AIDL is disconnected.");
            iBaseCommonCallback.onResponse(1024, lcr.b(1024));
        } else {
            stopSport(iBaseCommonCallback);
        }
    }

    private void c(iwy iwyVar, IBaseCommonCallback iBaseCommonCallback) throws RemoteException {
        if (ive.c().o()) {
            if (!iwyVar.w()) {
                ReleaseLogUtil.e("Track_TrackDeveloperKitProxy", "sport has started from foreground");
                iBaseCommonCallback.onResponse(4, "can't stop sport invoked from foreground");
                return;
            }
            ive.c();
            ive.e(false);
            Message messageObtain = Message.obtain();
            messageObtain.obj = iBaseCommonCallback;
            messageObtain.what = 202;
            this.f6288a.sendMessageDelayed(messageObtain, C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
            return;
        }
        ReleaseLogUtil.e("Track_TrackDeveloperKitProxy", "sport stopped before");
        iBaseCommonCallback.onResponse(0, "sport stopped before");
    }

    private void e(iwy iwyVar, IBaseCommonCallback iBaseCommonCallback) throws RemoteException {
        ReleaseLogUtil.d("Track_TrackDeveloperKitProxy", "enter stopAerobicSport()");
        if (this.h == null) {
            ReleaseLogUtil.e("Track_TrackDeveloperKitProxy", "mSportDataOutputApi is null in stopAerobicSport()");
            iBaseCommonCallback.onResponse(4, "Failed to initialize the interface");
        } else if (!iwyVar.w()) {
            ReleaseLogUtil.e("Track_TrackDeveloperKitProxy", "sport has started from foreground");
            iBaseCommonCallback.onResponse(4, "can't stop sport invoked from foreground");
        } else {
            this.d.stopSportEnhance(iBaseCommonCallback);
        }
    }

    @Override // com.huawei.health.ITrackManagerForDeveloper
    public void sendDeviceControlinstruction(String str, IBaseCommonCallback iBaseCommonCallback) throws RemoteException {
        LogUtil.a("Track_TrackDeveloperKitProxy", "enter sendDeviceControlinstruction");
        if (iBaseCommonCallback == null) {
            ReleaseLogUtil.a("Track_TrackDeveloperKitProxy", "sendDeviceControlinstruction callback is null");
            return;
        }
        if (this.h == null) {
            ReleaseLogUtil.e("Track_TrackDeveloperKitProxy", "mSportDataOutputApi is null in sendDeviceControlinstruction()");
            iBaseCommonCallback.onResponse(4, "Failed to initialize the interface");
            return;
        }
        if (Looper.myLooper() == null) {
            Looper.prepare();
        }
        if (!iwy.a(jbg.a()).w()) {
            ReleaseLogUtil.e("Track_TrackDeveloperKitProxy", "sport should be start background");
            iBaseCommonCallback.onResponse(4, "sport should be start background");
        } else {
            e(str, iBaseCommonCallback);
        }
    }

    private void e(String str, IBaseCommonCallback iBaseCommonCallback) throws RemoteException {
        ReleaseLogUtil.d("Track_TrackDeveloperKitProxy", "sendDeviceControlInstructionImpl controlOptions:", str);
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has("model")) {
                this.d.sendDeviceControlinstruction(str, iBaseCommonCallback);
                return;
            }
            int i = jSONObject.getInt("model");
            if (i == 1) {
                this.d.sendDeviceControlinstruction(str, iBaseCommonCallback);
                return;
            }
            if (i == 4) {
                Integer num = (Integer) this.h.getData("CADENCE_DATA");
                int iIntValue = num.intValue();
                double d2 = jSONObject.getDouble("grade") * 10000.0d;
                int iA = (int) ddh.a(c(jSONObject), iIntValue, d2);
                ReleaseLogUtil.d("Track_TrackDeveloperKitProxy", "sendDeviceControlinstructionImpl track resistance cadence:", num, " power:", Integer.valueOf(iA), " ratio:", Double.valueOf(d2));
                if (!HiHealthKitDataChecker.d(iA)) {
                    ReleaseLogUtil.a("Track_TrackDeveloperKitProxy", "The calculated power is invalid.");
                    iBaseCommonCallback.onResponse(2, lcr.b(2));
                    return;
                }
                JSONObject jSONObject2 = new JSONObject();
                if (iIntValue > 0) {
                    jSONObject2.put("cadence", iIntValue);
                }
                jSONObject2.put("power", iA);
                this.d.sendDeviceControlinstruction(jSONObject2.toString(), iBaseCommonCallback);
                return;
            }
            ReleaseLogUtil.e("Track_TrackDeveloperKitProxy", "sendDeviceControlinstructionImpl not supported model:", Integer.valueOf(i));
            iBaseCommonCallback.onResponse(2, lcr.b(2));
        } catch (JSONException e) {
            ReleaseLogUtil.a("Track_TrackDeveloperKitProxy", "sendDeviceControlinstructionImpl JSONException:", ExceptionUtils.c(e));
            iBaseCommonCallback.onResponse(2, lcr.b(2));
        }
    }

    private double c(JSONObject jSONObject) {
        double d2;
        if (jSONObject.has("weight")) {
            try {
                d2 = jSONObject.getDouble("weight");
            } catch (JSONException e) {
                ReleaseLogUtil.a("Track_TrackDeveloperKitProxy", "getWeight JSONException:", e.getMessage());
                d2 = 0.0d;
            }
        } else {
            d2 = 0.0d;
        }
        if (d2 > 0.0d) {
            return d2;
        }
        double weightOrDefaultValue = this.o;
        if (weightOrDefaultValue <= 0.0d) {
            weightOrDefaultValue = LoginInit.getInstance(BaseApplication.getContext()).getUserInfoFromDbSync().getWeightOrDefaultValue();
            this.o = weightOrDefaultValue;
        }
        LogUtil.a("Track_TrackDeveloperKitProxy", "getWeight user weight:", Double.valueOf(weightOrDefaultValue));
        return weightOrDefaultValue;
    }

    @Override // com.huawei.health.ITrackManagerForDeveloper
    public void pauseSport(IBaseCommonCallback iBaseCommonCallback) throws RemoteException {
        ReleaseLogUtil.d("Track_TrackDeveloperKitProxy", "enter pauseSport");
        int iK = iwy.a(BaseApplication.getContext()).k();
        if (hcd.f36390a.contains(Integer.valueOf(iK))) {
            if (this.h.getStatus() == 1) {
                this.d.pauseSportEnhance(iBaseCommonCallback);
                return;
            } else {
                ReleaseLogUtil.d("HWhealthLinkage_Track_TrackDeveloperKitProxy", "failed to pause sport");
                c(iBaseCommonCallback, 4, lcr.b(4));
                return;
            }
        }
        if (ive.c().o() && hcd.d.contains(Integer.valueOf(iK))) {
            LogUtil.a("Track_TrackDeveloperKitProxy", "pauseSport,current sport type is ", Integer.valueOf(iK));
            ive.c().v();
            Message messageObtain = Message.obtain();
            messageObtain.obj = iBaseCommonCallback;
            messageObtain.what = 203;
            this.f6288a.sendMessageDelayed(messageObtain, C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
            return;
        }
        ReleaseLogUtil.a("Track_TrackDeveloperKitProxy", "pauseSport parameter error");
        c(iBaseCommonCallback, 7, lcr.b(7));
    }

    @Override // com.huawei.health.ITrackManagerForDeveloper
    public void resumeSport(IBaseCommonCallback iBaseCommonCallback) throws RemoteException {
        ReleaseLogUtil.d("Track_TrackDeveloperKitProxy", "enter resumeSport");
        int iK = iwy.a(BaseApplication.getContext()).k();
        int iO = iwy.a(BaseApplication.getContext()).o();
        if (hcd.f36390a.contains(Integer.valueOf(iK))) {
            if (this.h.getStatus() == 2) {
                this.d.resumeSportEnhance(iBaseCommonCallback);
                return;
            } else {
                ReleaseLogUtil.d("HWhealthLinkage_Track_TrackDeveloperKitProxy", "failed to resume sport");
                c(iBaseCommonCallback, 4, lcr.b(4));
                return;
            }
        }
        if (iO == 2 && hcd.d.contains(Integer.valueOf(iK))) {
            LogUtil.a("Track_TrackDeveloperKitProxy", "resume sport, current sport type is ", Integer.valueOf(iK));
            ive.c().y();
            Message messageObtain = Message.obtain();
            messageObtain.obj = iBaseCommonCallback;
            messageObtain.what = 204;
            this.f6288a.sendMessageDelayed(messageObtain, C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
            return;
        }
        ReleaseLogUtil.a("Track_TrackDeveloperKitProxy", "resumeSport parameter error");
        c(iBaseCommonCallback, 7, lcr.b(7));
    }

    public void onServiceDestroy() {
        ReleaseLogUtil.d("Track_TrackDeveloperKitProxy", "onServiceDestroy");
        this.l.kill();
    }

    static class d implements ISportDataCallback, CourseLinkageLifecycle, ISportStateChangeListener, SportLifecycle, SportDataNotify, IInterface {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f6292b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private TrackDeveloperKitProxy f6293c;
        private ITrackDataForDeveloper e;
        private SportDataOutputApi d = (SportDataOutputApi) Services.d("SportService", SportDataOutputApi.class);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private hau f6291a = new hau();

        @Override // com.huawei.hwfoundationmodel.trackmodel.ISportDataCallback
        public void onSummary(MotionPathSimplify motionPathSimplify) {
        }

        d(ITrackDataForDeveloper iTrackDataForDeveloper, TrackDeveloperKitProxy trackDeveloperKitProxy) {
            this.e = iTrackDataForDeveloper;
            this.f6293c = trackDeveloperKitProxy;
            SportDataOutputApi sportDataOutputApi = this.d;
            if (sportDataOutputApi != null) {
                this.f6292b = sportDataOutputApi.getSportType();
                c();
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            ITrackDataForDeveloper iTrackDataForDeveloper = this.e;
            if (iTrackDataForDeveloper != null) {
                return iTrackDataForDeveloper.asBinder();
            }
            return null;
        }

        private void c() {
            LogUtil.a("Track_LocalToRemoteProxy", "current sportType is ", Integer.valueOf(this.f6292b));
            this.f6291a.e(a());
            this.f6291a.d("Track_LocalToRemoteProxy");
            this.d.subscribeNotify(this.f6291a, this);
        }

        public String d() {
            return "Track_LocalToRemoteProxy";
        }

        public hau b() {
            return this.f6291a;
        }

        private List<String> a() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("TIME_ONE_SECOND_DURATION");
            arrayList.add("CALORIES_DATA");
            arrayList.add("HEART_RATE_DATA");
            arrayList.add("SKIP_NUM_DATA");
            arrayList.add("SKIP_SPEED_DATA");
            arrayList.add("STUMBLING_ROPE_DATA");
            arrayList.add("CONTINUOUS_SKIPPING_JUMP_DATA");
            arrayList.add("SKIPPING_AVG_SPEED_DATA");
            arrayList.add("PROGRESS_DATA");
            arrayList.add("DISTANCE_DATA");
            arrayList.add("SPEED_DATA");
            arrayList.add("RUNNING_POSTURE_DATA");
            arrayList.add("STEP_DATA");
            arrayList.add("STEP_RATE_DATA");
            arrayList.add("DISTANCE_DATA");
            arrayList.add("SPEED_DATA");
            arrayList.add("STEP_DATA");
            arrayList.add("STEP_RATE_DATA");
            arrayList.add("DISTANCE_DATA");
            arrayList.add("SPEED_DATA");
            arrayList.add("CADENCE_DATA");
            arrayList.add("POWER_DATA");
            arrayList.add("RESISTANCE_LEVEL_DATA");
            arrayList.add("DISTANCE_DATA");
            arrayList.add("SPEED_DATA");
            arrayList.add("CADENCE_DATA");
            arrayList.add("POWER_DATA");
            arrayList.add("RESISTANCE_LEVEL_DATA");
            arrayList.add("STEP_DATA");
            arrayList.add("DISTANCE_DATA");
            arrayList.add("SPEED_DATA");
            arrayList.add("PACE_DATA");
            arrayList.add("TEMPO_DATA");
            arrayList.add("POWER_DATA");
            arrayList.add("PADDLE_DATA");
            arrayList.add("WEIGHT_DATA");
            arrayList.add("GROUP_COUNT_DATA");
            arrayList.add("ACTION_GROUP_DATA");
            return arrayList;
        }

        @Override // com.huawei.healthcloud.plugintrack.manager.inteface.ISportStateChangeListener, com.huawei.health.sportservice.SportLifecycle
        public void onStartSport() {
            ReleaseLogUtil.d("Track_LocalToRemoteProxy", "onStartSport ", this.e, " ", this.f6293c);
            if (this.e == null || this.f6293c == null) {
                return;
            }
            LogUtil.a("Track_LocalToRemoteProxy", "onStartSport");
            this.f6293c.f = 0;
            try {
                this.e.onStateChanged(this.f6293c.f);
            } catch (RemoteException | IllegalStateException e) {
                ReleaseLogUtil.a("Track_LocalToRemoteProxy", "onStartSport RemoteException: ", e.getMessage());
            }
            this.f6293c.f = 2;
        }

        @Override // com.huawei.healthcloud.plugintrack.manager.inteface.ISportStateChangeListener, com.huawei.health.sportservice.SportLifecycle
        public void onPauseSport() {
            ReleaseLogUtil.d("Track_LocalToRemoteProxy", "onPauseSport ", this.e, " ", this.f6293c);
            if (this.e == null || this.f6293c == null) {
                return;
            }
            LogUtil.a("Track_LocalToRemoteProxy", "onPauseSport");
            this.f6293c.f = 1;
            try {
                this.e.onStateChanged(1);
            } catch (RemoteException | IllegalStateException e) {
                ReleaseLogUtil.a("Track_LocalToRemoteProxy", "onPauseSport RemoteException: ", e.getMessage());
            }
        }

        @Override // com.huawei.healthcloud.plugintrack.manager.inteface.ISportStateChangeListener, com.huawei.health.sportservice.SportLifecycle
        public void onResumeSport() {
            ReleaseLogUtil.d("Track_LocalToRemoteProxy", "onResumeSport ", this.e, " ", this.f6293c);
            if (this.e == null || this.f6293c == null) {
                return;
            }
            LogUtil.a("Track_LocalToRemoteProxy", "onResumeSport");
            this.f6293c.f = 3;
            try {
                this.e.onStateChanged(this.f6293c.f);
            } catch (RemoteException | IllegalStateException e) {
                ReleaseLogUtil.a("Track_LocalToRemoteProxy", "onResumeSport RemoteException: ", e.getMessage());
            }
            this.f6293c.f = 2;
        }

        @Override // com.huawei.healthcloud.plugintrack.manager.inteface.ISportStateChangeListener, com.huawei.health.sportservice.SportLifecycle
        /* JADX INFO: renamed from: onStopSport */
        public void m825x32b3e3a1() {
            ReleaseLogUtil.d("Track_LocalToRemoteProxy", "onStopSport ", this.e, " ", this.f6293c);
            if (this.e == null || this.f6293c == null) {
                return;
            }
            LogUtil.a("Track_LocalToRemoteProxy", "onStopSport");
            this.f6293c.f = 4;
            try {
                this.e.onStateChanged(this.f6293c.f);
            } catch (RemoteException | IllegalStateException e) {
                ReleaseLogUtil.a("Track_LocalToRemoteProxy", "onStopSport RemoteException: ", e.getMessage());
            }
        }

        @Override // com.huawei.hwfoundationmodel.trackmodel.ISportDataCallback
        public void getSportInfo(Bundle bundle) {
            if (this.e == null || this.f6293c.f == 4 || this.f6293c.f == 1) {
                return;
            }
            try {
                this.e.onDataChange(this.f6293c.b(bundle));
            } catch (RemoteException e) {
                ReleaseLogUtil.a("Track_LocalToRemoteProxy", "getSportInfo RemoteException: ", e.getMessage());
            }
        }

        @Override // com.huawei.health.sportservice.SportDataNotify
        public void onChange(List<String> list, Map<String, Object> map) {
            SportDataOutputApi sportDataOutputApi = (SportDataOutputApi) Services.d("SportService", SportDataOutputApi.class);
            this.d = sportDataOutputApi;
            int sportType = sportDataOutputApi.getSportType();
            this.f6292b = sportType;
            getSportInfo(this.f6293c.c(map, sportType));
        }

        @Override // com.huawei.health.suggestion.fit.callback.CourseLinkageLifecycle
        public void start(int i, Bundle bundle) {
            onStartSport();
        }

        @Override // com.huawei.health.suggestion.fit.callback.CourseLinkageLifecycle
        public void resume(int i) {
            onResumeSport();
        }

        @Override // com.huawei.health.suggestion.fit.callback.CourseLinkageLifecycle
        public void pause(int i) {
            onPauseSport();
        }

        @Override // com.huawei.health.suggestion.fit.callback.CourseLinkageLifecycle
        public void stop(int i) {
            m825x32b3e3a1();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Bundle b(Bundle bundle) {
        if (bundle == null) {
            return bundle;
        }
        Bundle bundleDeepCopy = bundle.deepCopy();
        bundleDeepCopy.putInt("sportState", this.f);
        return bundleDeepCopy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Bundle c(Map<String, Object> map, int i) {
        Bundle bundle = new Bundle();
        if (map != null) {
            LogUtil.a("Track_TrackDeveloperKitProxy", "getBundleInstrumentsData current sportType is", Integer.valueOf(i));
            try {
                bundle.putInt(BleConstants.SPORT_TYPE, i);
                bundle.putInt("duration", Math.round((((Long) map.get("TIME_ONE_SECOND_DURATION")).longValue() * 1.0f) / 1000.0f));
                bundle.putInt("calorie", map.get("CALORIES_DATA") != null ? ((Integer) map.get("CALORIES_DATA")).intValue() * 1000 : -1);
                bundle.putInt(IndoorEquipManagerApi.KEY_HEART_RATE, map.get("HEART_RATE_DATA") != null ? ((Integer) map.get("HEART_RATE_DATA")).intValue() : -1);
                if (i == 264) {
                    a(map, bundle);
                } else {
                    if (i == 265) {
                        d(map, bundle);
                        return bundle;
                    }
                    if (i == 273) {
                        c(map, bundle);
                        return bundle;
                    }
                    if (i == 274) {
                        b(map, bundle);
                        return bundle;
                    }
                    if (i == 283) {
                        e(map, bundle);
                        return bundle;
                    }
                }
            } catch (ClassCastException unused) {
            }
        }
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(IBaseCommonCallback iBaseCommonCallback, int i, String str) {
        if (iBaseCommonCallback != null) {
            try {
                iBaseCommonCallback.onResponse(i, str);
            } catch (RemoteException unused) {
                LogUtil.j("Track_TrackDeveloperKitProxy", "callback remote Exception");
            }
        }
    }

    private void a(Map<String, Object> map, Bundle bundle) {
        bundle.putInt("distance", map.get("DISTANCE_DATA") != null ? ((Integer) map.get("DISTANCE_DATA")).intValue() : -1);
        bundle.putInt(MedalConstants.EVENT_STEPS, map.get("STEP_DATA") != null ? ((Integer) map.get("STEP_DATA")).intValue() : -1);
        bundle.putInt("stepRate", map.get("STEP_RATE_DATA") != null ? ((Integer) map.get("STEP_RATE_DATA")).intValue() : -1);
        bundle.putFloat("speed", map.get("SPEED_DATA") != null ? ((Integer) map.get("SPEED_DATA")).intValue() / 360.0f : -1.0f);
        if (map.get("RUNNING_POSTURE_DATA") == null || !(map.get("RUNNING_POSTURE_DATA") instanceof gzv)) {
            return;
        }
        jah.e(bundle, (gzv) map.get("RUNNING_POSTURE_DATA"));
    }

    private void c(Map<String, Object> map, Bundle bundle) {
        bundle.putInt("distance", map.get("DISTANCE_DATA") != null ? ((Integer) map.get("DISTANCE_DATA")).intValue() : -1);
        bundle.putInt(MedalConstants.EVENT_STEPS, map.get("STEP_DATA") != null ? ((Integer) map.get("STEP_DATA")).intValue() : -1);
        bundle.putFloat("speed", map.get("SPEED_DATA") != null ? ((Integer) map.get("SPEED_DATA")).intValue() / 360.0f : -1.0f);
        bundle.putInt("resistanceLevel", map.get("RESISTANCE_LEVEL_DATA") != null ? ((Integer) map.get("RESISTANCE_LEVEL_DATA")).intValue() : -1);
        bundle.putInt("power", map.get("POWER_DATA") != null ? ((Integer) map.get("POWER_DATA")).intValue() : -1);
        bundle.putInt("cadence", map.get("CADENCE_DATA") != null ? ((Integer) map.get("CADENCE_DATA")).intValue() : -1);
    }

    private void b(Map<String, Object> map, Bundle bundle) {
        bundle.putInt("distance", map.get("DISTANCE_DATA") != null ? ((Integer) map.get("DISTANCE_DATA")).intValue() : -1);
        bundle.putInt("power", map.get("POWER_DATA") != null ? ((Integer) map.get("POWER_DATA")).intValue() : -1);
        bundle.putInt("totalPaddle", map.get("PADDLE_DATA") != null ? ((Integer) map.get("PADDLE_DATA")).intValue() : -1);
        bundle.putInt(BleConstants.AVERAGE_PACE, map.get("PACE_DATA") != null ? ((Integer) map.get("PACE_DATA")).intValue() : -1);
        bundle.putFloat("paddleFrequency", map.get("TEMPO_DATA") != null ? ((Float) map.get("TEMPO_DATA")).floatValue() : -1.0f);
        bundle.putInt("resistanceLevel", map.get("RESISTANCE_LEVEL_DATA") != null ? ((Integer) map.get("RESISTANCE_LEVEL_DATA")).intValue() : -1);
        bundle.putInt("weight", map.get("WEIGHT_DATA") != null ? ((Integer) map.get("WEIGHT_DATA")).intValue() : -1);
        bundle.putInt("totalActionGroups", map.get("ACTION_GROUP_DATA") != null ? ((Integer) map.get("ACTION_GROUP_DATA")).intValue() : -1);
        bundle.putInt("numberOfActionsPerGroup", map.get("GROUP_COUNT_DATA") != null ? ((Integer) map.get("GROUP_COUNT_DATA")).intValue() : -1);
    }

    private void d(Map<String, Object> map, Bundle bundle) {
        bundle.putInt("distance", map.get("DISTANCE_DATA") != null ? ((Integer) map.get("DISTANCE_DATA")).intValue() : -1);
        bundle.putFloat("speed", map.get("SPEED_DATA") != null ? ((Integer) map.get("SPEED_DATA")).intValue() / 360.0f : -1.0f);
        bundle.putInt("resistanceLevel", map.get("RESISTANCE_LEVEL_DATA") != null ? ((Integer) map.get("RESISTANCE_LEVEL_DATA")).intValue() : -1);
        bundle.putInt("power", map.get("POWER_DATA") != null ? ((Integer) map.get("POWER_DATA")).intValue() : -1);
        bundle.putInt("cadence", map.get("CADENCE_DATA") != null ? ((Integer) map.get("CADENCE_DATA")).intValue() : -1);
    }

    private void e(Map<String, Object> map, Bundle bundle) {
        bundle.putInt("skippingNum", map.get("SKIP_NUM_DATA") != null ? ((Integer) map.get("SKIP_NUM_DATA")).intValue() : -1);
        bundle.putInt("skippingSpeed", map.get("SKIPPING_AVG_SPEED_DATA") != null ? ((Integer) map.get("SKIPPING_AVG_SPEED_DATA")).intValue() : -1);
    }
}
