package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.media3.common.C;
import com.google.gson.Gson;
import com.huawei.devicesdk.callback.ConnectFilter;
import com.huawei.devicesdk.entity.ExternalDeviceCapability;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hihealth.HiDataSourceFetchOption;
import com.huawei.hihealth.HiDeviceInfo;
import com.huawei.hihealth.HiHealthClient;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiDataClientListener;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.phoneprocess.framework.hwdevicemgr.unitedevicemanger.DeviceStateCallback;
import com.huawei.hwdevice.phoneprocess.framework.hwdevicemgr.unitedevicemanger.handshake.VariableHandshakeGeneralCommandBase;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.unitedevice.entity.UniteDevice;
import health.compact.a.LocalBroadcast;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class mky {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f41844c = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private DeviceStateCallback f41846b;
    private String h = "phoneIdentify";
    private String e = "";
    private Map<String, mkt> d = new ConcurrentHashMap(2);
    private Map<String, VariableHandshakeGeneralCommandBase> f = new ConcurrentHashMap(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ConnectFilter f41845a = new ConnectFilter() { // from class: mky.2
        @Override // com.huawei.devicesdk.callback.ConnectFilter
        public int onFilter(UniteDevice uniteDevice, String str, cmg cmgVar) {
            return mky.this.b(uniteDevice, str, cmgVar);
        }

        @Override // com.huawei.devicesdk.callback.ConnectFilter
        public String preProcess(UniteDevice uniteDevice, String str) {
            LogUtil.a("VariableHandshakeMgr", "preProcess enter");
            if (uniteDevice != null && str != null && !TextUtils.isEmpty(uniteDevice.getIdentify())) {
                JSONObject jSONObjectB = mky.this.b(str);
                mkt mktVar = new mkt();
                mky.this.d.put(uniteDevice.getIdentify(), mktVar);
                if (mktVar.c(jSONObjectB)) {
                    synchronized (mky.f41844c) {
                        cml cmlVarC = cnk.c().c(uniteDevice.getIdentify());
                        LogUtil.a("VariableHandshakeMgr", "preProcess supportAuthType: ", Integer.valueOf(cmlVarC != null ? cmlVarC.j() : 0));
                    }
                }
                cmr cmrVar = new cmr();
                cmrVar.d(mky.this.h);
                mktVar.e(uniteDevice, cmrVar, jSONObjectB);
                cmrVar.d(mktVar.b(uniteDevice.getIdentify()));
                mky.this.d.remove(uniteDevice.getIdentify());
                return new Gson().toJson(cmrVar);
            }
            LogUtil.e("VariableHandshakeMgr", "preProcess error, device or data is null");
            return "";
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public int b(UniteDevice uniteDevice, String str, cmg cmgVar) {
        if (uniteDevice == null || str == null || cmgVar == null) {
            LogUtil.e("VariableHandshakeMgr", "onFilter error, input parameter check failed");
            return 51;
        }
        this.e = uniteDevice.getIdentify();
        if ("service_capability_success".equalsIgnoreCase(str)) {
            ExternalDeviceCapability capability = uniteDevice.getCapability();
            if (capability == null) {
                LogUtil.e("VariableHandshakeMgr", "externalDeviceCapability is null");
                return 51;
            }
            DeviceCapability compatibleCapacity = capability.getCompatibleCapacity();
            if (compatibleCapacity == null) {
                LogUtil.e("VariableHandshakeMgr", "deviceCapability is null");
                return 51;
            }
            boolean zD = eey.d(cox.c(uniteDevice), 269);
            LogUtil.a("VariableHandshakeMgr", "isSupportReworkAndManage: ", Boolean.valueOf(zD));
            if (!zD && d(uniteDevice)) {
                return 51;
            }
            if (compatibleCapacity.isSupportAutoDetectMode()) {
                mkq mkqVar = new mkq();
                mkqVar.constructCommandMessage(cmgVar);
                this.f.put(uniteDevice.getIdentify(), mkqVar);
                return 50;
            }
            if (compatibleCapacity.isSupportAccountSwitch() || compatibleCapacity.isSupportChangePhonePair()) {
                mkw mkwVar = new mkw(uniteDevice);
                mkwVar.a(zD);
                mkwVar.constructCommandMessage(cmgVar);
                this.f.put(uniteDevice.getIdentify(), mkwVar);
                return 50;
            }
            if (!compatibleCapacity.isSupportSettingRelated()) {
                return 52;
            }
            mkr mkrVar = new mkr();
            mkrVar.constructCommandMessage(cmgVar);
            this.f.put(uniteDevice.getIdentify(), mkrVar);
            return 50;
        }
        return a(uniteDevice, str, cmgVar);
    }

    private boolean d(UniteDevice uniteDevice) {
        boolean zD = eey.d(cox.c(uniteDevice), 110);
        LogUtil.a("VariableHandshakeMgr", "isDeviceIsNotSupport: ", Boolean.valueOf(zD));
        if (!zD || !LoginInit.getInstance(BaseApplication.getContext()).isKidAccount()) {
            return false;
        }
        LogUtil.a("VariableHandshakeMgr", "isKidAccount enter");
        if (c(uniteDevice)) {
            return false;
        }
        d(cox.c(uniteDevice));
        DeviceInfo deviceInfo = null;
        boolean z = false;
        for (DeviceInfo deviceInfo2 : ecu.d().getDeviceList(HwGetDevicesMode.ALL_DEVICES, null, "VariableHandshakeMgr")) {
            if (deviceInfo2.getDeviceIdentify().equals(uniteDevice.getIdentify())) {
                deviceInfo = deviceInfo2;
                z = true;
            }
        }
        ArrayList arrayList = new ArrayList();
        if (z) {
            arrayList.add(deviceInfo.getDeviceIdentify());
            mkf.e(BaseApplication.getContext()).unPair(arrayList, false);
        } else {
            arrayList.add(cox.c(uniteDevice).getDeviceIdentify());
            mkf.e(BaseApplication.getContext()).unPair(arrayList, true);
        }
        return true;
    }

    private boolean c(final UniteDevice uniteDevice) {
        final boolean[] zArr = new boolean[1];
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        HiHealthNativeApi.a(BaseApplication.getContext()).fetchDataSource(HiDataSourceFetchOption.builder().c(0).a(), new HiDataClientListener() { // from class: mky.3
            @Override // com.huawei.hihealth.data.listener.HiDataClientListener
            public void onResult(List<HiHealthClient> list) {
                String strReplace;
                if (list == null) {
                    LogUtil.j("VariableHandshakeMgr", "clientList is null");
                    zArr[0] = false;
                    countDownLatch.countDown();
                    return;
                }
                String deviceName = uniteDevice.getDeviceInfo().getDeviceName();
                if (TextUtils.isEmpty(deviceName)) {
                    LogUtil.j("VariableHandshakeMgr", "currentDeviceName is empty.");
                    zArr[0] = true;
                    countDownLatch.countDown();
                    return;
                }
                String[] strArrSplit = deviceName.split("\\-");
                if (strArrSplit.length > 2) {
                    strReplace = deviceName.replace(Constants.LINK + strArrSplit[strArrSplit.length - 1], "");
                } else if (strArrSplit.length == 2) {
                    strReplace = strArrSplit[0];
                } else {
                    zArr[0] = true;
                    countDownLatch.countDown();
                    return;
                }
                if (mky.this.d(strReplace, list)) {
                    zArr[0] = true;
                } else {
                    zArr[0] = false;
                }
                countDownLatch.countDown();
            }
        });
        try {
            countDownLatch.await(C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            LogUtil.e("VariableHandshakeMgr", "dealAidAccountConnect, InterruptedException");
        }
        return zArr[0];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d(String str, List<HiHealthClient> list) {
        boolean z;
        Iterator<HiHealthClient> it = list.iterator();
        while (true) {
            z = false;
            if (!it.hasNext()) {
                break;
            }
            HiDeviceInfo hiDeviceInfo = it.next().getHiDeviceInfo();
            if (hiDeviceInfo != null) {
                String deviceName = hiDeviceInfo.getDeviceName();
                if (TextUtils.isEmpty(deviceName)) {
                    continue;
                } else {
                    String[] strArrSplit = deviceName.split("\\-");
                    LogUtil.a("VariableHandshakeMgr", "deviceName:", deviceName);
                    if (strArrSplit.length > 2) {
                        deviceName = deviceName.replace(Constants.LINK + strArrSplit[strArrSplit.length - 1], "");
                    }
                    if (strArrSplit.length == 2) {
                        deviceName = strArrSplit[0];
                    }
                    if (str.equalsIgnoreCase(deviceName)) {
                        LogUtil.a("VariableHandshakeMgr", "device equals deviceName:", deviceName, ", currentDeviceName:", str);
                        z = true;
                        break;
                    }
                }
            }
        }
        LogUtil.a("VariableHandshakeMgr", "isBindDevice：", Boolean.valueOf(z));
        return z;
    }

    private static void d(DeviceInfo deviceInfo) {
        deviceInfo.setDeviceConnectState(12);
        Intent intentB = b(deviceInfo);
        LogUtil.a("VariableHandshakeMgr", "sendConnectStateBroadcast connectState is: ", 12);
        BaseApplication.getContext().sendOrderedBroadcast(intentB, LocalBroadcast.f36595c);
    }

    private static Intent b(DeviceInfo deviceInfo) {
        LogUtil.a("VariableHandshakeMgr", "Enter createDeviceStateIntent.");
        Intent intent = new Intent("com.huawei.bone.action.CONNECTION_STATE_CHANGED");
        intent.setExtrasClassLoader(DeviceInfo.class.getClassLoader());
        Bundle bundle = new Bundle();
        bundle.putParcelable("deviceinfo", deviceInfo);
        intent.putExtras(bundle);
        return intent;
    }

    private int a(UniteDevice uniteDevice, String str, cmg cmgVar) {
        VariableHandshakeGeneralCommandBase variableHandshakeGeneralCommandBase = this.f.get(uniteDevice.getIdentify());
        if (variableHandshakeGeneralCommandBase == null) {
            LogUtil.j("VariableHandshakeMgr", "nextCommand is null");
            return 51;
        }
        int iProcessReceivedData = variableHandshakeGeneralCommandBase.processReceivedData(uniteDevice, str);
        if (iProcessReceivedData != 50) {
            return iProcessReceivedData;
        }
        VariableHandshakeGeneralCommandBase nextCommand = variableHandshakeGeneralCommandBase.getNextCommand();
        this.f.put(uniteDevice.getIdentify(), nextCommand);
        if (nextCommand instanceof mkz) {
            DeviceInfo deviceInfoC = cox.c(uniteDevice);
            deviceInfoC.setRelationship(mkl.d().a(uniteDevice.getIdentify()));
            DeviceStateCallback deviceStateCallbackA = b().a();
            if (deviceStateCallbackA == null) {
                LogUtil.j("VariableHandshakeMgr", "oobe callback is empty");
                lng.c("ConnectMessage", "oobe callback is empty");
            } else {
                deviceStateCallbackA.onConnectStatusChanged(deviceInfoC);
            }
        }
        return nextCommand.constructCommandMessage(cmgVar);
    }

    public static mky b() {
        return d.e;
    }

    public void d(boolean z, String str) {
        mkt mktVar = this.d.get(str);
        if (mktVar == null) {
            LogUtil.j("VariableHandshakeMgr", "notifyUserSelected creator is null");
        } else {
            mktVar.b(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject b(String str) {
        try {
            return new JSONObject(str);
        } catch (JSONException unused) {
            LogUtil.e("VariableHandshakeMgr", "json error");
            return null;
        }
    }

    public ConnectFilter c() {
        return this.f41845a;
    }

    static class d {
        private static mky e = new mky();
    }

    public VariableHandshakeGeneralCommandBase e(String str) {
        if (TextUtils.isEmpty(str)) {
            if (!TextUtils.isEmpty(this.e)) {
                VariableHandshakeGeneralCommandBase variableHandshakeGeneralCommandBase = this.f.get(this.e);
                LogUtil.e("VariableHandshakeMgr", "getNextCommand identify is empty: ", variableHandshakeGeneralCommandBase != null ? variableHandshakeGeneralCommandBase.toString() : "");
                return variableHandshakeGeneralCommandBase;
            }
            LogUtil.e("VariableHandshakeMgr", "mIdentify and identify are null");
            if (this.f.size() <= 0) {
                return null;
            }
            VariableHandshakeGeneralCommandBase value = this.f.entrySet().iterator().next().getValue();
            LogUtil.e("VariableHandshakeMgr", "getNextCommand mIdentify is empty: ", value != null ? value.toString() : "");
            return value;
        }
        VariableHandshakeGeneralCommandBase variableHandshakeGeneralCommandBase2 = this.f.get(str);
        LogUtil.a("VariableHandshakeMgr", "getNextCommand: ", variableHandshakeGeneralCommandBase2 != null ? variableHandshakeGeneralCommandBase2.getCurrentCommandTag() : "", cpl.a(str));
        return variableHandshakeGeneralCommandBase2;
    }

    public void b(DeviceStateCallback deviceStateCallback) {
        LogUtil.a("VariableHandshakeMgr", "Enter registerDeviceStateCallback().");
        this.f41846b = deviceStateCallback;
    }

    public DeviceStateCallback a() {
        if (this.f41846b == null) {
            this.f41846b = mkn.e().b();
        }
        return this.f41846b;
    }
}
