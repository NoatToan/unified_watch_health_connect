package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.appgallery.agd.api.AgdConstant;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceCategoryFragment;
import com.huawei.hwbtsdk.btdatatype.datatype.OperationDeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.LocalBroadcast;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class mkd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f41793a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static mkj f41794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static mkd f41795c;
    private lof e;
    private volatile boolean g = false;
    private Context d = BaseApplication.getContext();

    private int c(int i) {
        if (i == 2) {
            return 1;
        }
        return i == 1 ? 2 : 3;
    }

    private mkd() {
        this.e = null;
        LogUtil.j("HwDeviceConnectChangeMgr", "Init HwDeviceConnectChangeMgr.");
        this.e = lof.d(this.d);
        f41794b = mkj.d();
    }

    public void a(boolean z) {
        this.g = z;
    }

    public static mkd d() {
        mkd mkdVar;
        synchronized (f41793a) {
            if (f41795c == null) {
                f41795c = new mkd();
            }
            mkdVar = f41795c;
        }
        return mkdVar;
    }

    public void e(DeviceInfo deviceInfo, int i, OperationDeviceInfo operationDeviceInfo) {
        LogUtil.a("HwDeviceConnectChangeMgr", "enter onDeviceConnectionStateChanged() with state:", Integer.valueOf(i));
        if (i == 1) {
            loa.a().b(deviceInfo, System.currentTimeMillis());
            LogUtil.a("HwDeviceConnectChangeMgr", "mDeviceStateCallback device start connecting, time:", Long.valueOf(System.currentTimeMillis()));
        }
        if (i == 4) {
            d(operationDeviceInfo);
        }
        if (i == 2 && operationDeviceInfo != null) {
            operationDeviceInfo.setEndConnectTime(System.currentTimeMillis());
            operationDeviceInfo.setErrorMeathod("success");
            d(operationDeviceInfo);
        }
        c(deviceInfo, i);
    }

    private void d(OperationDeviceInfo operationDeviceInfo) {
        if (operationDeviceInfo == null) {
            LogUtil.a("HwDeviceConnectChangeMgr", "sendConnectFailedEvent operationDeviceInfo is null");
        } else {
            a(operationDeviceInfo.getDeviceIdentify(), operationDeviceInfo);
        }
    }

    private void c(DeviceInfo deviceInfo, int i) {
        synchronized (mkf.d().e()) {
            List<DeviceInfo> listA = mkf.d().a();
            if (listA != null && deviceInfo != null && deviceInfo.getDeviceBluetoothType() == 0 && ((i == 2 || i == 1) && !f41794b.d(deviceInfo, listA))) {
                LogUtil.a("HwDeviceConnectChangeMgr", "Enter onDeviceConnectionStateChanged() aw not need report");
                return;
            }
            if (deviceInfo == null) {
                return;
            }
            if (i != 2) {
                mkb.b(deviceInfo.getDeviceIdentify(), false);
            }
            if (i != 2) {
                mkb.e(deviceInfo.getDeviceIdentify(), i);
                deviceInfo.setDeviceConnectState(i);
                String deviceIdentify = deviceInfo.getDeviceIdentify();
                synchronized (mkf.d().e()) {
                    List<DeviceInfo> listA2 = mkf.d().a();
                    int iA = f41794b.a(deviceIdentify, listA2);
                    if (iA != -1) {
                        listA2.get(iA).setDeviceConnectState(i);
                        if (deviceInfo.getDeviceBluetoothType() == 5 || deviceInfo.getDeviceBluetoothType() == 0) {
                            deviceInfo.setDeviceName(listA2.get(iA).getDeviceName());
                        }
                        LogUtil.a("HwDeviceConnectChangeMgr", "update deviceInfo state with index:", Integer.valueOf(iA));
                    }
                }
                mkb.c(deviceInfo.getDeviceIdentify(), false);
                d(deviceInfo);
            } else {
                b(deviceInfo);
            }
        }
    }

    private void b(DeviceInfo deviceInfo) {
        if (mkb.d(deviceInfo.getDeviceIdentify()) == 2) {
            if (deviceInfo.getDeviceProtocol() == -1) {
                LogUtil.a("HwDeviceConnectChangeMgr", "already finish handshake and repeat report connected.", ", the device user choose already active and connect so report.");
                List<DeviceInfo> listA = mkf.d().a();
                int iA = f41794b.a(deviceInfo.getDeviceIdentify(), listA);
                if (iA != -1) {
                    deviceInfo.setDeviceActiveState(listA.get(iA).getDeviceActiveState());
                    deviceInfo.setProductType(listA.get(iA).getProductType());
                    deviceInfo.setDeviceName(listA.get(iA).getDeviceName());
                    deviceInfo.setDeviceProtocol(listA.get(iA).getDeviceProtocol());
                    d(deviceInfo);
                    return;
                }
                return;
            }
            LogUtil.a("HwDeviceConnectChangeMgr", "already finish handshake and repeat report connected.", ", Already has the active device so report connected state.");
            d(deviceInfo);
            return;
        }
        if (mkb.n(deviceInfo.getDeviceIdentify()) && lmu.n()) {
            LogUtil.a("HwDeviceConnectChangeMgr", "Already Start handshake.");
            return;
        }
        mkb.c(deviceInfo.getDeviceIdentify(), true);
        if (deviceInfo.getDeviceProtocol() == 2) {
            mkb.l(deviceInfo.getDeviceIdentify(), "");
            mkb.j(deviceInfo.getDeviceIdentify(), "");
            int iD = f41794b.d(lmu.d(deviceInfo.getDeviceName()), deviceInfo.getDeviceIdentify(), mkf.d().a());
            LogUtil.a("HwDeviceConnectChangeMgr", "start to get product type.", " device product:", Integer.valueOf(iD));
            lnr lnrVarB = lmw.b(deviceInfo.getDeviceBluetoothType(), iD);
            lnrVarB.e(deviceInfo.getDeviceIdentify());
            lof lofVar = this.e;
            if (lofVar != null) {
                lofVar.b(deviceInfo.getDeviceBluetoothType(), lnrVarB);
            }
        }
    }

    public void d(DeviceInfo deviceInfo) {
        LogUtil.a("R_HwDeviceConnectChangeMgr", "Enter sendConnectStateBroadcast(). ", Integer.valueOf(lnn.b()));
        if (deviceInfo == null) {
            return;
        }
        if (mkf.d().d != null) {
            mkf.d().d.onConnectStatusChanged(deviceInfo);
        }
        nff.e(deviceInfo);
        if (CommonUtil.ck()) {
            LogUtil.a("HwDeviceConnectChangeMgr", "sendConnectStateBroadcast is support wearProduct.");
            eem.a(ecu.d().getDeviceList(HwGetDevicesMode.ALL_DEVICES, null, "HwDeviceConnectChangeMgr"), "HwDeviceConnectChangeMgr");
        }
        mgu.a(deviceInfo);
        mli.d(deviceInfo);
        if (deviceInfo.getDeviceConnectState() == 2) {
            mja.b(deviceInfo.getDeviceIdentify(), 1);
        }
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_AW70_DEVICES, null, "sendConnectStateBroadcast");
        DeviceInfo deviceInfo2 = deviceList.size() > 0 ? deviceList.get(0) : null;
        String deviceIdentify = deviceInfo.getDeviceIdentify();
        Intent intentC = c(deviceInfo);
        if (deviceInfo2 != null && deviceIdentify.equals(deviceInfo2.getDeviceIdentify())) {
            this.d.sendOrderedBroadcast(intentC, LocalBroadcast.f36595c);
            f41794b.b(deviceInfo, mkf.d().a());
            String string = this.d.getSharedPreferences("deviceUpdateSharedPreferences", 0).getString("aw70UpdateCheckTime", "");
            LogUtil.a("HwDeviceConnectChangeMgr", "Enter aw70 sendConnectStateBroadcast(). aw70 mAppCheckTime:", string);
            if (mkj.a(string)) {
                return;
            }
            Intent intent = new Intent("com.huawei.bone.action.UPDATE_DEVICE");
            intent.putExtra("is_current_device_aw70", true);
            this.d.sendBroadcast(intent, LocalBroadcast.f36595c);
            return;
        }
        this.d.sendOrderedBroadcast(intentC, LocalBroadcast.f36595c);
        f41794b.b(deviceInfo, mkf.d().a());
        if (deviceInfo.getDeviceConnectState() == 2) {
            lnn.a(1000000);
        }
    }

    private Intent c(DeviceInfo deviceInfo) {
        LogUtil.a("HwDeviceConnectChangeMgr", "Enter createDeviceStateIntent deviceIdentify: ", CommonUtil.n(deviceInfo.getDeviceIdentify()), ", connectState: ", Integer.valueOf(deviceInfo.getDeviceConnectState()));
        Intent intent = new Intent("com.huawei.bone.action.CONNECTION_STATE_CHANGED");
        intent.setExtrasClassLoader(DeviceInfo.class.getClassLoader());
        intent.putExtra("connect_error_code", lnn.b());
        if (this.g) {
            intent.putExtra("isDeviceConnectDirectly", true);
        } else {
            intent.putExtra("isDeviceConnectDirectly", false);
        }
        if (deviceInfo.getDeviceConnectState() != 1) {
            LogUtil.a("HwDeviceConnectChangeMgr", "createDeviceStateIntent mIsDeviceConnectDirectly reset.");
            this.g = false;
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("deviceinfo", deviceInfo);
        if (mkf.d().a() != null) {
            bundle.putInt("wear_device_list_size", mkf.d().a().size());
        }
        intent.putExtras(bundle);
        return intent;
    }

    public void e(DeviceInfo deviceInfo) {
        String deviceIdentify = deviceInfo != null ? deviceInfo.getDeviceIdentify() : null;
        LogUtil.a("HwDeviceConnectChangeMgr", "disconnectBluetooth enter, goingDisconnectDevice", CommonUtil.n(deviceIdentify));
        if (this.e == null || TextUtils.isEmpty(deviceIdentify)) {
            return;
        }
        LogUtil.a("HwDeviceConnectChangeMgr", "addDevice goingDisconnectDevice is not null.");
        this.e.b(false, deviceIdentify);
        this.e.d(deviceIdentify);
        this.e.n(deviceIdentify);
        List<Integer> listB = f41794b.b(mkf.d().a());
        ArrayList arrayList = new ArrayList(16);
        if (listB != null && !listB.isEmpty()) {
            Iterator<Integer> it = listB.iterator();
            while (it.hasNext()) {
                DeviceInfo deviceInfo2 = mkf.d().a().get(it.next().intValue());
                if (deviceInfo2 == null) {
                    LogUtil.j("HwDeviceConnectChangeMgr", "addDevice active device info is null");
                } else {
                    LogUtil.d("HwDeviceConnectChangeMgr", "addDevice active device", deviceInfo2);
                    if (deviceIdentify.equalsIgnoreCase(deviceInfo2.getDeviceIdentify())) {
                        LogUtil.a("HwDeviceConnectChangeMgr", "addDevice find target device");
                        arrayList.add(deviceInfo2);
                    }
                }
            }
        }
        LogUtil.a("HwDeviceConnectChangeMgr", "Start to send disconnect broadcast to EMUI.");
        f41794b.e(arrayList);
        LogUtil.a("HwDeviceConnectChangeMgr", "Start to disable corresponding device.");
        mkf.d().d(deviceIdentify);
    }

    public void a(String str, OperationDeviceInfo operationDeviceInfo) {
        LogUtil.a("HwDeviceConnectChangeMgr", "sendConnectFailedEvent operationDeviceInfo: ", Boolean.valueOf(operationDeviceInfo == null), " mac: ", Boolean.valueOf(TextUtils.isEmpty(str)));
        if (operationDeviceInfo == null || TextUtils.isEmpty(str) || operationDeviceInfo.getProductType() == -1) {
            return;
        }
        int iD = eev.d(operationDeviceInfo.getProductType());
        if (iD == -1) {
            LogUtil.j("HwDeviceConnectChangeMgr", "sendConnectFailedEvent() deviceClassification is unknown.");
            return;
        }
        long endConnectTime = operationDeviceInfo.getEndConnectTime() - operationDeviceInfo.getStartConnectTime();
        if (operationDeviceInfo.getStartConnectTime() <= 0 || endConnectTime <= 0) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(16);
        linkedHashMap.put("device_classfication", String.valueOf(iD));
        linkedHashMap.put(DeviceCategoryFragment.DEVICE_TYPE, String.valueOf(operationDeviceInfo.getProductType()));
        linkedHashMap.put("connect_duration", String.valueOf(endConnectTime));
        linkedHashMap.put("failed_bt_type", String.valueOf(c(operationDeviceInfo.getDeviceBluetoothType())));
        if ("success".equals(operationDeviceInfo.getErrorMeathod())) {
            linkedHashMap.put("failed_classification", "3");
        } else {
            linkedHashMap.put("failed_classification", AgdConstant.INSTALL_TYPE_DEFAULT.equals(operationDeviceInfo.getErrorMeathod()) ? "1" : "2");
            linkedHashMap.put("failed_method", String.valueOf(operationDeviceInfo.getErrorMeathod()));
            linkedHashMap.put("failed_code", String.valueOf(operationDeviceInfo.getErrorCode()));
        }
        lng.e("80020003", (LinkedHashMap<String, String>) linkedHashMap);
    }
}
