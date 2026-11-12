package com.huawei.indoorequip.viewmodel;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.localbroadcastmanager.LocalBroadcastManager;
import com.huawei.health.basesport.viewmodel.BaseSportingViewModel;
import com.huawei.health.device.api.EcologyDeviceApi;
import com.huawei.health.device.base.AbstractFitnessClient;
import com.huawei.health.device.model.DeviceInformation;
import com.huawei.health.sportservice.ISportDataSaveStatusCallback;
import com.huawei.health.sportservice.SportDataNotify;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.indoorequip.activity.IndoorEquipConnectedManager;
import com.huawei.indoorequip.datastruct.QrCodeOrNfcInfo;
import com.huawei.indoorequip.datastruct.SupportDataRange;
import com.huawei.openalliance.ad.constant.Constants;
import defpackage.dmg;
import defpackage.ive;
import defpackage.izu;
import defpackage.jac;
import defpackage.jaq;
import defpackage.jem;
import defpackage.npt;
import defpackage.nwa;
import defpackage.nxo;
import defpackage.nxs;
import defpackage.nye;
import defpackage.nyl;
import defpackage.nzc;
import defpackage.pqj;
import health.compact.a.CommonUtil;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class IndoorConnectViewModel extends BaseSportingViewModel implements SportDataNotify, Handler.Callback {
    protected IndoorEquipConnectedManager d;
    protected nwa e;
    protected SupportDataRange g;
    protected QrCodeOrNfcInfo h;
    protected String j;
    protected Handler n;
    private nye s;
    private e w;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected DeviceInformation f17833a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected long f17834b = 0;
    protected int f = 0;
    protected long m = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected volatile boolean f17835c = false;
    protected boolean i = false;
    private int v = 0;
    private boolean o = false;
    private int r = -1;
    private float y = 0.0f;
    private boolean k = true;
    private volatile boolean p = false;
    private boolean q = true;
    private boolean l = false;
    private final Runnable t = new Runnable() { // from class: nzm
        @Override // java.lang.Runnable
        public final void run() {
            this.f44006c.h();
        }
    };

    public interface DataChangeHandle<T> {
        void changeHandle(T t, Map<String, Object> map);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        return false;
    }

    @Override // com.huawei.health.basesport.viewmodel.BaseSportingViewModel
    public void initFragment() {
    }

    @Override // com.huawei.health.basesport.viewmodel.BaseSportingViewModel
    public void initReceivedDataHandlers() {
    }

    public /* synthetic */ void h() {
        if (this.n == null || this.mSportDataOutputApi == null) {
            LogUtil.a("Track_IndoorConnectViewModel", "mShowSportDetailRunnable run failed");
            return;
        }
        LogUtil.a("Track_IndoorConnectViewModel", "mShowSportDetailRunnable running");
        this.mSportDataOutputApi.unregisterSportDataSavedCallback("Track_IndoorConnectViewModel");
        l();
        this.n.sendEmptyMessage(908);
    }

    public void c(Bundle bundle, Handler handler) {
        if (bundle != null) {
            bundle.putInt("sport_data_source_sportting", 5);
            this.o = bundle.getBoolean("ExitApp", false);
            this.r = bundle.getInt("sport_target_type_sportting", -1);
            this.y = bundle.getFloat("sport_target_value_sportting", 0.0f);
        }
        LogUtil.d("Track_IndoorConnectViewModel", "init ExitApp ", Boolean.valueOf(this.o));
        this.n = handler;
        this.e = nwa.n();
        DeviceInformation deviceInformationA = nxs.d().a();
        if (deviceInformationA != null) {
            this.f17833a = deviceInformationA;
        } else {
            this.f17833a = new DeviceInformation();
        }
        LogUtil.a("Track_IndoorConnectViewModel", "init: mDeviceInformation = ", this.f17833a.getFitnessHashMap());
        this.h = new QrCodeOrNfcInfo();
        this.g = new SupportDataRange();
        this.s = nye.d(BaseApplication.b());
        super.init(bundle);
        this.mSportDataOutputApi.registerDeviceDataCallback(this.e.o());
        requestData();
    }

    public DeviceInformation e() {
        return this.f17833a;
    }

    @Override // com.huawei.health.basesport.viewmodel.BaseSportingViewModel, com.huawei.health.sportservice.SportLifecycle
    public void onPreSport() {
        nye nyeVar = this.s;
        if (nyeVar != null) {
            nyeVar.d();
        }
        super.onPreSport();
    }

    public void a(int i, Bundle bundle) {
        if (i == 302) {
            LogUtil.a("Track_IndoorConnectViewModel", "in handleMessage, case is MSG_BT_CONNECTED_SHOW");
            return;
        }
        if (i == 309) {
            LogUtil.a("Track_IndoorConnectViewModel", "in handleMessage, case is MSG_BT_SERVICE_REDISCOVER_SHOW");
            this.e.e(true);
            return;
        }
        if (i == 905) {
            LogUtil.a("Track_IndoorConnectViewModel", "in handleMessage, case is FINISH_THIS_SEGMENT");
            b(bundle);
            return;
        }
        if (i == 912) {
            LogUtil.a("Track_IndoorConnectViewModel", "in handleMessage, case is RESPONSE_CONTROL_RESULT");
            c(bundle);
            return;
        }
        if (i == 305) {
            LogUtil.a("Track_IndoorConnectViewModel", "in handleMessage, case is MSG_BT_SERVICE_DISCOVER_SHOW");
            this.e.e(true);
            return;
        }
        if (i == 306) {
            n();
            return;
        }
        if (i == 901) {
            LogUtil.a("Track_IndoorConnectViewModel", "in onNewMessage, newCase is INIT_ALL_VARS_IN_SERVICE");
            this.n.sendEmptyMessage(509);
            return;
        }
        if (i == 902) {
            e(bundle);
            q();
            if (!this.q || nxs.d().g()) {
                return;
            }
            LogUtil.a("Track_IndoorConnectViewModel", "in DATA_AVAILABLE Csafe, case is ACTION_READ_SUCCESS");
            this.n.sendEmptyMessage(617);
            this.q = false;
            return;
        }
        this.n.sendEmptyMessage(i);
    }

    private void q() {
        DeviceInformation deviceInformation = this.f17833a;
        if (deviceInformation == null || this.n == null || deviceInformation.getDeviceType() == 0 || TextUtils.isEmpty(this.f17833a.getModelString()) || TextUtils.isEmpty(this.f17833a.getManufacturerString())) {
            return;
        }
        Message messageObtainMessage = this.n.obtainMessage();
        messageObtainMessage.what = 1007;
        messageObtainMessage.obj = this.f17833a;
        this.n.sendMessage(messageObtainMessage);
    }

    private void e(Bundle bundle) {
        if (bundle.containsKey("com.huawei.health.fitness.KEY_MESSAGE_FOR_CALLBACK_FITNESS_DATA")) {
            Serializable serializable = bundle.getSerializable("com.huawei.health.fitness.KEY_MESSAGE_FOR_CALLBACK_FITNESS_DATA");
            if (serializable instanceof HashMap) {
                for (Map.Entry entry : ((HashMap) serializable).entrySet()) {
                    if (entry != null && entry.getKey() != null && entry.getValue() != null) {
                        e((Integer) entry.getKey(), entry.getValue());
                    }
                }
            }
        }
    }

    private void e(Integer num, Object obj) {
        int iIntValue = num.intValue();
        if (iIntValue == 10001) {
            int iIntValue2 = ((Integer) obj).intValue();
            this.v = iIntValue2;
            LogUtil.a("Track_IndoorConnectViewModel", "convertDataFromBle INCREMENT_LEVEL :", Integer.valueOf(iIntValue2));
            if (this.k) {
                this.k = false;
                t();
                return;
            }
            return;
        }
        if (iIntValue == 20010) {
            this.f17833a.setSerialNumber(obj.toString());
            LogUtil.a("Track_IndoorConnectViewModel", "convertDataFromBle BLE_MANUFACTURER = ", CommonUtil.n(obj.toString()));
            return;
        }
        if (iIntValue != 20014) {
            switch (iIntValue) {
                case 20005:
                    this.f17833a.setDeviceType(((Integer) obj).intValue());
                    LogUtil.a("Track_IndoorConnectViewModel", "convertDataFromBle BLE_DEVICE_TYPE = ", obj);
                    break;
                case 20006:
                    this.f17833a.setManufacturerString(obj.toString());
                    LogUtil.a("Track_IndoorConnectViewModel", "convertDataFromBle BLE_MANUFACTURER = ", num.toString());
                    break;
                case 20007:
                    LogUtil.a("Track_IndoorConnectViewModel", "convertDataFromBle BLE_MODEL :", obj.toString());
                    this.f17833a.setModelString(obj.toString());
                    e("FtmpGetDisSuccess");
                    break;
                default:
                    switch (iIntValue) {
                        case 30006:
                            if (obj instanceof Integer) {
                                Integer num2 = (Integer) obj;
                                num2.intValue();
                                LogUtil.a("Track_IndoorConnectViewModel", "convertDataFromBle MIN_LEVEL", num2);
                                this.g.setMinLevel(num2.intValue());
                            }
                            break;
                        case 30007:
                            if (obj instanceof Integer) {
                                Integer num3 = (Integer) obj;
                                num3.intValue();
                                LogUtil.a("Track_IndoorConnectViewModel", "convertDataFromBle MAX_LEVEL", num3);
                                this.g.setMaxLevel(num3.intValue());
                            }
                            break;
                        case 30008:
                            Integer num4 = (Integer) obj;
                            num4.intValue();
                            LogUtil.a("Track_IndoorConnectViewModel", "convertDataFromBle INCREMENT_LEVEL :", num4);
                            this.g.setMinIncrementLevel(num4.intValue());
                            break;
                    }
                    break;
            }
            return;
        }
        LogUtil.a("Track_IndoorConnectViewModel", "convertDataFromBle BLE_DEVICE_NAME = ", obj.toString());
        this.f17833a.setBleDeviceName(obj.toString());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:37:0x0072  */
    public void a(String str) {
        LogUtil.a("Track_IndoorConnectViewModel", "StateChangeInCallback :", str);
        b(str);
        str.hashCode();
        switch (str) {
            case "com.huawei.btsportdevice.ACTION_PAIR_UNSUPPORTED":
                LogUtil.a("Track_IndoorConnectViewModel", "onStateChange(call back in activity), state is ACTION_PAIR_UNSUPPORTED");
                this.n.sendEmptyMessage(313);
                break;
            case "com.huawei.btsportdevice.ACTION_REQUEST_MACHINE_CONTROL_SUCCESS":
                LogUtil.a("Track_IndoorConnectViewModel", "in disposeOnStateChangeInCallback, case is ACTION_REQUEST_MACHINE_CONTROL_SUCCESS");
                break;
            case "com.huawei.btsportdevice.ACTION_INVALID_DEVICE_INFO":
                LogUtil.a("Track_IndoorConnectViewModel", "onStateChange(call back in activity), state is ACTION_INVALID_DEVICE_INFO");
                this.n.sendEmptyMessage(306);
                e("InvalidDIS");
                break;
            case "com.huawei.btsportdevice.ACTION_SERVICE_DISCOVERIED":
                d(str);
                break;
            case "com.huawei.btsportdevice.ACTION_SERVICE_REDISCOVERIED":
                this.e.e(AbstractFitnessClient.ACTION_SERVICE_DISCOVERIED);
                LogUtil.a("Track_IndoorConnectViewModel", "onStateChange(call back in activity), state is ACTION_SERVICE_REDISCOVERIED");
                this.n.sendEmptyMessage(309);
                e("ReDiscoverServSuccess");
                break;
            case "com.huawei.btsportdevice.ACTION_READ_SUCCESS":
                ReleaseLogUtil.d("R_Track_IndoorConnectViewModel", "in disposeOnStateChangeInCallback, case is ACTION_READ_SUCCESS");
                this.n.sendEmptyMessage(617);
                s();
                f();
                break;
            case "com.huawei.btsportdevice.ACTION_FAILED_UNLOCK_BT_MODULE":
                LogUtil.a("Track_IndoorConnectViewModel", "onStateChange(call back in activity), state is ACTION_FAILED_UNLOCK_BT_MODULE");
                n();
                this.n.sendEmptyMessage(306);
                e("UnlockFailed");
                break;
            case "com.huawei.btsportdevice.ACTION_SERVICE_NOT_SUPPORT":
                LogUtil.a("Track_IndoorConnectViewModel", "onStateChange(call back in activity), state is ACTION_SERVICE_NOT_SUPPORT");
                this.n.sendEmptyMessage(306);
                e("ServiceUnsupport");
                break;
            default:
                LogUtil.a("Track_IndoorConnectViewModel", "onStateChange(call back in activity), state is unknow (it is ", str, ").");
                break;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:29:0x0052  */
    private void b(String str) {
        byte b2;
        str.hashCode();
        switch (str) {
            case "com.huawei.btsportdevice.ACTION_GATT_STATE_CONNECTED":
                b2 = 0;
                break;
            case "com.huawei.btsportdevice.ACTION_GATT_STATE_DISCONNECTED":
                b2 = 1;
                break;
            case "com.huawei.btsportdevice.ACTION_GATT_STATE_RECONNECTED":
                b2 = 2;
                break;
            case "com.huawei.btsportdevice.ACTION_GATT_STATE_RECONNECTING":
                b2 = 3;
                break;
            case "com.huawei.btsportdevice.ACTION_GATT_STATE_DISCONNECTING":
                b2 = 4;
                break;
            case "com.huawei.btsportdevice.ACTION_GATT_STATE_CONNECTING":
                b2 = 5;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            ReleaseLogUtil.d("R_Track_IndoorConnectViewModel", "onStateChange(call back in activity), state is ACTION_GATT_CONNECTED");
            this.e.e(str);
            this.n.sendEmptyMessage(302);
            this.f17834b = SystemClock.elapsedRealtime() - this.m;
            return;
        }
        if (b2 == 1) {
            LogUtil.a("Track_IndoorConnectViewModel", "onStateChange(call back in activity), state is ACTION_GATT_DISCONNECTED");
            this.e.e(str);
            this.n.sendEmptyMessage(304);
            e("DisConnect");
            return;
        }
        if (b2 == 2) {
            LogUtil.a("Track_IndoorConnectViewModel", "onStateChange(call back in activity), state is ACTION_GATT_STATE_RECONNECTED");
            this.e.e(AbstractFitnessClient.ACTION_GATT_STATE_CONNECTED);
            return;
        }
        if (b2 == 3) {
            LogUtil.a("Track_IndoorConnectViewModel", "onStateChange(call back in activity), state is ACTION_GATT_STATE_RECONNECTING");
            this.e.e(str);
            this.n.sendEmptyMessage(307);
        } else if (b2 == 4) {
            LogUtil.a("Track_IndoorConnectViewModel", "onStateChange(call back in activity), state is ACTION_GATT_DISCONNECTING");
            this.e.e(str);
        } else {
            if (b2 != 5) {
                return;
            }
            LogUtil.a("Track_IndoorConnectViewModel", "onStateChange(call back in activity), state is ACTION_GATT_CONNECTING");
            this.e.e(str);
            this.n.sendEmptyMessage(301);
        }
    }

    private void s() {
        DeviceInformation deviceInformation = this.f17833a;
        if (deviceInformation == null) {
            return;
        }
        String strD = nzc.d(deviceInformation.getBleDeviceName());
        if (TextUtils.isEmpty(this.f17833a.getSerialNumber()) || TextUtils.isEmpty(strD)) {
            return;
        }
        try {
            EcologyDeviceApi ecologyDeviceApi = (EcologyDeviceApi) Services.b("EcologyDevice", EcologyDeviceApi.class);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sn", this.f17833a.getSerialNumber());
            ecologyDeviceApi.uploadDataToHota(strD, jSONObject.toString());
        } catch (JSONException unused) {
            LogUtil.e("Track_IndoorConnectViewModel", "uploadDataToHota JSONException");
        }
    }

    private void t() {
        if (this.v == 15) {
            LogUtil.a("Track_IndoorConnectViewModel", "first traning status is TRAINING_STATUS_POST_WORKOUT");
            this.p = true;
            a(true, true);
        }
    }

    private void d(String str) {
        String str2;
        this.e.e(str);
        LogUtil.a("Track_IndoorConnectViewModel", "onStateChange(call back in activity), state is ACTION_GATT_SERVICES_DISCOVERED");
        this.n.sendEmptyMessage(305);
        long j = this.f17834b;
        if (j > 0 && j < 5000) {
            str2 = "DiscoverServSuccess[Took:" + this.f17834b + " ms]";
        } else {
            str2 = "DiscoverServSuccess";
        }
        e(str2);
    }

    public void f() {
        DeviceInformation deviceInformation;
        LogUtil.a("Track_IndoorConnectViewModel", "reportDeviceInfo");
        nye nyeVar = this.s;
        if (nyeVar == null || (deviceInformation = this.f17833a) == null) {
            return;
        }
        nyeVar.a(deviceInformation, nxs.d().c());
    }

    private void e(String str) {
        QrCodeOrNfcInfo qrCodeOrNfcInfo = this.h;
        String btMac = qrCodeOrNfcInfo != null ? qrCodeOrNfcInfo.getBtMac() : "";
        if (TextUtils.isEmpty(btMac)) {
            btMac = c() ? dmg.a().getCurrentMacAddress() : nxs.d().c();
        }
        nxo nxoVar = new nxo();
        nxoVar.j(str);
        nxoVar.h(nxs.d().g() + "");
        nxoVar.f((this.h == null || nxs.d().g()) ? Constants.LINK : this.h.getBtName());
        nxoVar.a(this.mSportDataOutputApi != null ? String.valueOf(this.mSportDataOutputApi.getSportType()) : Constants.LINK);
        DeviceInformation deviceInformation = this.f17833a;
        nxoVar.b(deviceInformation != null ? deviceInformation.getManufacturerString() : Constants.LINK);
        DeviceInformation deviceInformation2 = this.f17833a;
        nxoVar.d(deviceInformation2 != null ? deviceInformation2.getModelString() : Constants.LINK);
        if (TextUtils.isEmpty(btMac)) {
            btMac = Constants.LINK;
        }
        nxoVar.c(btMac);
        nzc.d(BaseApplication.b(), nxoVar);
    }

    private void n() {
        LogUtil.a("Track_IndoorConnectViewModel", "in hadndleMessage, case is MSG_BT_SERVICE_NOT_SUPPORT, hasFoundServiceSuccessBefore is ", Boolean.valueOf(this.e.t()));
        this.d.a(this.e.t());
    }

    private void c(Bundle bundle) {
        String string;
        if (bundle == null) {
            string = "";
        } else {
            string = bundle.getString("com.huawei.health.fitness.KEY_MESSAGE_FOR_CALLBACK");
        }
        if (TextUtils.isEmpty(string)) {
            return;
        }
        LogUtil.a("Track_IndoorConnectViewModel", "control machine is ", string);
        if ("set_target_success".equals(string)) {
            this.n.sendEmptyMessage(618);
        } else if ("set_target_failed".equals(string)) {
            this.n.sendEmptyMessage(619);
        }
    }

    private void b(Bundle bundle) {
        if (bundle != null) {
            boolean z = bundle.getBoolean("com.huawei.health.fitness.KEY_MESSAGE_BOOLEAN_ALLOWED_TO_SHOW_UI");
            boolean z2 = bundle.getBoolean("com.huawei.health.fitness.KEY_MESSAGE_BOOLEAN_HAS_NOT_DISCONNECTED");
            if (this.f17835c) {
                return;
            }
            a(z2, z);
        }
    }

    public void b(boolean z) {
        ReleaseLogUtil.d("Track_IndoorConnectViewModel", "in finishThisSessionOnStopButton ? ", Boolean.valueOf(z), " mIsFinishPageHasBeenShowed ? ", Boolean.valueOf(this.f17835c));
        if (this.n == null || this.mSportDataOutputApi == null) {
            return;
        }
        boolean zIsToSave = isToSave();
        boolean z2 = !zIsToSave;
        LogUtil.a("Track_IndoorConnectViewModel", "finishThisSessionOnStopButton isTooShort ? ", Boolean.valueOf(z2));
        if (z && !zIsToSave) {
            LogUtil.a("Track_IndoorConnectViewModel", "MSG_SHOW_TIPS_FOR_TOO_SHORT_TWO_BUTTON");
            this.n.sendEmptyMessage(TypedValues.PositionType.TYPE_DRAWPATH);
            return;
        }
        b(true, true, z, z2);
        h(z2);
        if (!this.f17835c) {
            LogUtil.a("Track_IndoorConnectViewModel", "finishThisSessionOnStopButton onStopSport");
            this.f17835c = true;
            this.e.a(false);
            m825x32b3e3a1();
            m();
        } else {
            LogUtil.a("Track_IndoorConnectViewModel", "Unknown state in finishThisSession,and index is one");
        }
        a(true);
        j(z2);
    }

    private void m() {
        boolean zRegisterSportDataSavedCallback = this.mSportDataOutputApi.registerSportDataSavedCallback("Track_IndoorConnectViewModel", new ISportDataSaveStatusCallback() { // from class: nzl
            @Override // com.huawei.health.sportservice.ISportDataSaveStatusCallback
            public final void onFinish(boolean z) {
                this.f44005a.c(z);
            }
        });
        LogUtil.a("Track_IndoorConnectViewModel", "showSportDetailActivityWhenSportDataSaved isRegisterSuccess " + zRegisterSportDataSavedCallback);
        if (zRegisterSportDataSavedCallback) {
            this.n.postDelayed(this.t, 1000L);
        } else {
            this.t.run();
        }
    }

    public /* synthetic */ void c(boolean z) {
        LogUtil.a("Track_IndoorConnectViewModel", "sportDataSavedCallback invoked. isSaved " + z);
        this.n.removeCallbacks(this.t);
        this.n.post(this.t);
    }

    public void a(boolean z, boolean z2) {
        ReleaseLogUtil.d("Track_IndoorConnectViewModel", "in finishThisSession", " hasDisconnected ? ", Boolean.valueOf(z), " hasAllowedToShowUi ? ", Boolean.valueOf(z2), " mIsFinishPageHasBeenShowed ? ", Boolean.valueOf(this.f17835c));
        if (this.n == null || this.mSportDataOutputApi == null) {
            return;
        }
        boolean zIsToSave = isToSave();
        boolean z3 = !zIsToSave;
        LogUtil.a("Track_IndoorConnectViewModel", "finishThisSession isTooShort ? ", Boolean.valueOf(z3));
        b(z, z2, false, z3);
        h(z3);
        if (!zIsToSave && z2) {
            if (!nxs.d().g() || !this.p) {
                LogUtil.a("Track_IndoorConnectViewModel", "MSG_SHOW_TIPS_FOR_TOO_SHORT");
                this.n.sendEmptyMessage(501);
            } else {
                this.n.sendEmptyMessage(513);
                LogUtil.a("Track_IndoorConnectViewModel", "MSG_SHOW_TIPS_FOR_STATUS_POST_WORKOUT");
            }
            r();
        } else if (this.f17835c || !z2) {
            LogUtil.a("Track_IndoorConnectViewModel", "Unknown state in finishThisSessionLowerHalf,and index is one");
            this.n.sendEmptyMessage(908);
        } else {
            LogUtil.a("Track_IndoorConnectViewModel", "finishThisSession onStopSport");
            this.f17835c = true;
            this.e.a(false);
            r();
            m();
        }
        a(z);
        j(z3);
    }

    private void r() {
        if (this.i) {
            this.i = false;
            m825x32b3e3a1();
        }
    }

    private void l() {
        MotionPathSimplify motionPathSimplify;
        Bundle bundleC;
        int targetSportStatus = getTargetSportStatus();
        boolean zB = b();
        ReleaseLogUtil.d("Track_IndoorConnectViewModel", npt.d("mTargetType ", Integer.valueOf(this.r), " mTargetValue ", Float.valueOf(this.y), "target status is ", Integer.valueOf(targetSportStatus), " isSportTargetSport ", Boolean.valueOf(zB)));
        if (zB && targetSportStatus == 2) {
            LogUtil.a("Track_IndoorConnectViewModel", "showSportDetail, start over target");
            return;
        }
        if (zB && targetSportStatus == 1) {
            motionPathSimplify = jac.a(BaseApplication.b(), "device_target_motion_simplify.txt");
        } else {
            motionPathSimplify = getMotionPathSimplify();
        }
        if (motionPathSimplify != null) {
            boolean z = izu.b(getSportType()) || getSportType() == 283;
            ive iveVarC = ive.c();
            if (zB && targetSportStatus == 1) {
                bundleC = iveVarC.c("device_target_motion_path.txt", motionPathSimplify, Collections.EMPTY_LIST, z, Boolean.FALSE.booleanValue());
            } else {
                bundleC = iveVarC.c("motion_path2.txt", motionPathSimplify, Collections.EMPTY_LIST, z, Boolean.FALSE.booleanValue());
            }
            LogUtil.d("Track_IndoorConnectViewModel", "ExitApp ", Boolean.valueOf(this.o));
            if (bundleC != null) {
                bundleC.putBoolean("ExitApp", this.o);
            }
            if (getSportType() == 283) {
                ((EcologyDeviceApi) Services.b("EcologyDevice", EcologyDeviceApi.class)).ropeDataSetDeviceType(motionPathSimplify);
            }
            iveVarC.b(bundleC, motionPathSimplify);
            ReleaseLogUtil.d("Track_IndoorConnectViewModel", "showTrackMap");
        }
    }

    private void h(boolean z) {
        this.e.i(true);
        if (!nxs.d().g()) {
            nxs.d().q();
        }
        if (getSportType() == 264) {
            jem.e(z);
        }
    }

    public void d(boolean z) {
        this.l = z;
    }

    private void a(boolean z) {
        if (!z || c()) {
            return;
        }
        if (nyl.d(getSportType())) {
            LogUtil.a("Track_IndoorConnectViewModel", "finish by user");
            nxs.d().r();
        } else if (!this.l) {
            nxs.d().a(false);
        }
        if (this.l) {
            nxs.d().l();
        } else {
            nxs.d().m();
        }
    }

    private void b(boolean z, boolean z2, boolean z3, boolean z4) {
        QrCodeOrNfcInfo qrCodeOrNfcInfo = this.h;
        String str = Constants.LINK;
        String btMac = qrCodeOrNfcInfo != null ? qrCodeOrNfcInfo.getBtMac() : Constants.LINK;
        if (TextUtils.isEmpty(btMac)) {
            btMac = c() ? dmg.a().getCurrentMacAddress() : nxs.d().c();
        }
        LogUtil.a("Track_IndoorConnectViewModel", "stopSportTickBi: mDeviceInformation = ", this.f17833a.getFitnessHashMap());
        nxo nxoVar = new nxo();
        String bleDeviceName = this.f17833a.getBleDeviceName();
        if (!TextUtils.isEmpty(bleDeviceName)) {
            nxoVar.f(bleDeviceName);
        } else {
            QrCodeOrNfcInfo qrCodeOrNfcInfo2 = this.h;
            nxoVar.f(qrCodeOrNfcInfo2 != null ? qrCodeOrNfcInfo2.getBtName() : Constants.LINK);
        }
        nxoVar.b(z);
        nxoVar.e(z2);
        nxoVar.c(false);
        nxoVar.d(z3);
        nxoVar.a(z4);
        nxoVar.c(btMac);
        Object data = this.mSportDataOutputApi.getData("TIME_ONE_SECOND_DURATION");
        nxoVar.e((data instanceof Long ? ((Long) data).longValue() : 0L) / 1000);
        String modelString = this.f17833a.getModelString();
        if (TextUtils.isEmpty(modelString)) {
            modelString = Constants.LINK;
        }
        String serialNumber = this.f17833a.getSerialNumber();
        if (!TextUtils.isEmpty(serialNumber)) {
            str = serialNumber;
        }
        nxoVar.d(modelString);
        nxoVar.a(String.valueOf(this.mSportDataOutputApi.getSportType()));
        nxoVar.e(str);
        nzc.b(BaseApplication.b(), nxoVar, getSportTarget());
    }

    private void j(boolean z) {
        if (!c() || z) {
            LogUtil.a("Track_IndoorConnectViewModel", "ropeStopBiEventForPerformance is not rope or isNotNeedSave = true");
            return;
        }
        Object data = this.mSportDataOutputApi.getData("MOTION_PATH_SIMPLIFY_DATA");
        if (!(data instanceof MotionPathSimplify)) {
            LogUtil.a("Track_IndoorConnectViewModel", "ropeStopBiEventForPerformance objectSimplify not instanceof MotionPathSimplify");
        } else if (((MotionPathSimplify) data).getExtendDataFloat("enduranceAbilityRank") > 0.0f) {
            nzc.a(dmg.a().getProductId(), dmg.a().getCurrentMacAddress(), "rope_performance_detail");
        }
    }

    public boolean c() {
        return getSportType() == 283;
    }

    public boolean b() {
        if (getSportType() == 264 || getSportType() == 265) {
            return getSportTarget() == 0 || getSportTarget() == 1 || getSportTarget() == 2;
        }
        return false;
    }

    public void c(IndoorEquipConnectedManager indoorEquipConnectedManager) {
        this.d = indoorEquipConnectedManager;
    }

    public void a(long j) {
        this.m = j;
    }

    protected <T> void b(String str, String str2, Class<T> cls, final DataChangeHandle<T> dataChangeHandle) {
        this.mReceivedDataHandlers.add(new BaseSportingViewModel.ReceivedDataHandler<T>(this, str, str2, cls) { // from class: com.huawei.indoorequip.viewmodel.IndoorConnectViewModel.4
            @Override // com.huawei.health.basesport.viewmodel.BaseSportingViewModel.ReceivedDataHandler
            public void handleInner(T t, Map<String, Object> map) {
                DataChangeHandle dataChangeHandle2 = dataChangeHandle;
                if (dataChangeHandle2 != null) {
                    dataChangeHandle2.changeHandle(t, map);
                }
            }
        });
    }

    @Override // com.huawei.health.basesport.viewmodel.BaseSportingViewModel
    public List<String> getSubscribeTagList() {
        return new ArrayList();
    }

    @Override // com.huawei.health.basesport.viewmodel.BaseSportingViewModel, androidx.lifecycle.ViewModel
    public void onCleared() {
        e(false);
    }

    public void e(boolean z) {
        if (z) {
            this.e.c(0L);
            super.onCleared();
        } else if (this.mExtendHandler != null) {
            this.mExtendHandler.quit(true);
        }
    }

    @Override // com.huawei.health.basesport.viewmodel.BaseSportingViewModel
    public String getTag() {
        return "Track_IndoorConnectViewModel";
    }

    public void e(QrCodeOrNfcInfo qrCodeOrNfcInfo) {
        this.h = qrCodeOrNfcInfo;
    }

    public QrCodeOrNfcInfo d() {
        return this.h;
    }

    public SupportDataRange a() {
        return this.g;
    }

    @Override // com.huawei.health.basesport.viewmodel.BaseSportingViewModel
    public void unregisterAll() {
        LogUtil.a("Track_IndoorConnectViewModel", "unregisterAll");
        super.unregisterAll();
    }

    public boolean g() {
        if (this.mSportDataOutputApi == null) {
            return false;
        }
        LogUtil.a("Track_IndoorConnectViewModel", "mViewModel.isSportServiceRunning() = ", Boolean.valueOf(this.mSportDataOutputApi.isSportServiceRunning()));
        return this.mSportDataOutputApi.isSportServiceRunning();
    }

    public void j() {
        LogUtil.a("Track_IndoorConnectViewModel", "registerVoiceServiceReceiver");
        if (this.w == null) {
            this.w = new e();
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("checkserviceaction");
        LocalBroadcastManager.getInstance().registerReceiver(this.w, intentFilter);
    }

    public void k() {
        LogUtil.a("Track_IndoorConnectViewModel", "unregisterBroadcastReceiver");
        LocalBroadcastManager.getInstance().unregisterReceiver(this.w);
    }

    class e extends BroadcastReceiver {
        private e() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                LogUtil.j("Track_IndoorConnectViewModel", "intent is null");
                return;
            }
            Bundle extras = intent.getExtras();
            if (extras == null) {
                LogUtil.j("Track_IndoorConnectViewModel", "bundle is null");
            } else if (extras.getInt("SERVICETYPE") == 1 && IndoorConnectViewModel.this.l) {
                IndoorConnectViewModel.this.i();
            }
        }
    }

    public void i() {
        if (o() && jaq.a()) {
            if (getSportType() == 264) {
                LogUtil.a("Track_IndoorConnectViewModel", "startSportGuide play voice START_RUN");
                ive.c().b(9, 0);
            } else {
                LogUtil.a("Track_IndoorConnectViewModel", "startSportGuide play voice START_RUN_OTHERS");
                ive.c().b(29, 0);
            }
        }
    }

    private boolean o() {
        if (pqj.b().b(BaseApplication.b())) {
            return true;
        }
        return nzc.e(BaseApplication.b());
    }
}
