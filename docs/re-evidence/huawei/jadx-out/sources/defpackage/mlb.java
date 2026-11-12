package defpackage;

import android.os.RemoteException;
import android.text.TextUtils;
import com.huawei.datatype.DeviceCommand;
import com.huawei.health.IBaseCommonCallback;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.outofprocess.util.NotificationContentProviderUtil;
import com.huawei.hwdevice.phoneprocess.binder.ParserInterface;
import com.huawei.hwdevice.phoneprocess.framework.hwdevicemgr.dmsmanager.HwDeviceMgrInterface;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.VastAttribute;
import health.compact.a.CommonUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class mlb implements ParserInterface {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static mlb f41856c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private DeviceInfo f41857b = null;
    private mlg f;
    private final HwDeviceMgrInterface i;
    private static final Object e = new Object();
    private static final Object d = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Map<Integer, List<IBaseResponseCallback>> f41855a = new HashMap(16);

    private mlb() {
        HwDeviceMgrInterface hwDeviceMgrInterfaceE = mkf.e(BaseApplication.getContext());
        this.i = hwDeviceMgrInterfaceE;
        if (hwDeviceMgrInterfaceE == null) {
            LogUtil.j("HiHealthManager", "mHwDeviceMgr is null");
        }
    }

    @Override // com.huawei.hwdevice.phoneprocess.binder.ParserInterface
    public void getResult(DeviceInfo deviceInfo, byte[] bArr) {
        if (bArr == null || bArr.length <= 1) {
            LogUtil.j("HiHealthManager", "data illegal");
            return;
        }
        byte b2 = bArr[1];
        if (b2 == 2) {
            mlg mlgVarA = mlg.a();
            this.f = mlgVarA;
            mlgVarA.e(bArr);
        } else if (b2 != 3) {
            LogUtil.j("HiHealthManager", "getResult nothing to do");
        } else {
            a(bArr);
        }
    }

    public static mlb e() {
        mlb mlbVar;
        LogUtil.a("HiHealthManager", "enter HiHealthManager");
        synchronized (e) {
            if (f41856c == null) {
                f41856c = new mlb();
            }
            mlbVar = f41856c;
        }
        return mlbVar;
    }

    public void a() {
        mlg mlgVar = this.f;
        if (mlgVar != null) {
            mlgVar.c();
        }
        d();
    }

    private static void d() {
        synchronized (e) {
            f41856c = null;
        }
    }

    private boolean b() {
        this.f41857b = null;
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_MAIN_DEVICES, null, "HiHealthManager");
        if (deviceList.size() > 0) {
            for (DeviceInfo deviceInfo : deviceList) {
                if (!eel.d(deviceInfo.getProductType())) {
                    this.f41857b = deviceInfo;
                    break;
                }
            }
        }
        DeviceInfo deviceInfo2 = this.f41857b;
        if (deviceInfo2 != null && deviceInfo2.getDeviceConnectState() == 2) {
            LogUtil.a("HiHealthManager", "device connected");
            return true;
        }
        LogUtil.j("HiHealthManager", "device not connected");
        return false;
    }

    private boolean c() {
        DeviceInfo deviceInfo = this.f41857b;
        if (deviceInfo == null) {
            LogUtil.j("HiHealthManager", "isSupportDriverRemind mCurrentDeviceInfo is null");
            return false;
        }
        DeviceCapability deviceCapabilityE = e(deviceInfo);
        boolean zIsSupportHiCarDriverRemind = deviceCapabilityE != null ? deviceCapabilityE.isSupportHiCarDriverRemind() : false;
        LogUtil.a("HiHealthManager", "get Device Support isSupportDriverRemind :", Boolean.valueOf(zIsSupportHiCarDriverRemind));
        return zIsSupportHiCarDriverRemind;
    }

    private boolean i() {
        DeviceCapability deviceCapabilityE = e(this.f41857b);
        boolean zIsSupportWearStatus = deviceCapabilityE != null ? deviceCapabilityE.isSupportWearStatus() : false;
        LogUtil.a("HiHealthManager", "get Device Support isSupportDriverRemind :", Boolean.valueOf(zIsSupportWearStatus));
        return zIsSupportWearStatus;
    }

    private DeviceCapability e(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            return null;
        }
        Map<String, DeviceCapability> mapQueryDeviceCapability = this.i.queryDeviceCapability(1, deviceInfo.getDeviceIdentify(), "HiHealthManager");
        if (mapQueryDeviceCapability == null || mapQueryDeviceCapability.isEmpty()) {
            LogUtil.j("HiHealthManager", "getCapability deviceCapabilityHashMaps is null");
            return null;
        }
        return mapQueryDeviceCapability.get(deviceInfo.getDeviceIdentify());
    }

    private void c(int i, List<Integer> list) {
        String strD;
        if (i < 0 || i > 4) {
            LogUtil.j("HiHealthManager", "remind type is invaluable :", Integer.valueOf(i));
            return;
        }
        if (list == null || list.isEmpty() || list.size() != 5) {
            LogUtil.j("HiHealthManager", "vibration effect is invaluable");
            return;
        }
        LogUtil.a("HiHealthManager", "enter wrapTLV process");
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(46);
        deviceCommand.setCommandID(1);
        LogUtil.a("HiHealthManager", "vibration effect is valuable :", Integer.valueOf(list.size()));
        String strB = eeq.b(1);
        String strB2 = eeq.b(2);
        String strD2 = eeq.d(1);
        String strD3 = eeq.d(i);
        StringBuilder sb = new StringBuilder(16);
        sb.append(strD2);
        sb.append(strB);
        sb.append(strD3);
        for (int i2 = 0; i2 < list.size(); i2++) {
            String strD4 = eeq.d(i2 + 2);
            if (i2 == 0 || i2 == 3) {
                strD = eeq.d(list.get(i2).intValue());
            } else {
                strD = eeq.e(list.get(i2).intValue());
            }
            sb.append(strD4);
            if (i2 == 0 || i2 == 3) {
                sb.append(strB);
            } else {
                sb.append(strB2);
            }
            sb.append(strD);
        }
        deviceCommand.setDataLen(sb.length() / 2);
        deviceCommand.setDataContent(eeq.c(sb.toString()));
        this.i.sendDeviceData(deviceCommand);
        LogUtil.a("HiHealthManager", "send tlv successfully");
    }

    public void a(String str, IBaseCommonCallback iBaseCommonCallback) {
        if (!NotificationContentProviderUtil.b()) {
            LogUtil.j("HiHealthManager", "the notification is close");
            return;
        }
        if (!b()) {
            LogUtil.j("HiHealthManager", "the device is not connected");
            return;
        }
        if (!c()) {
            LogUtil.j("HiHealthManager", "the device is not support HiCar");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            int iOptInt = jSONObject.optInt("content");
            LogUtil.a("HiHealthManager", "the content is :", Integer.valueOf(iOptInt));
            JSONObject jSONObject2 = jSONObject.getJSONObject("vibration");
            LogUtil.a("HiHealthManager", " the vibration is :", jSONObject2);
            ArrayList arrayList = new ArrayList(16);
            Iterator<String> itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                LogUtil.d("HiHealthManager", "the vibration key is :", next);
                int iOptInt2 = jSONObject2.optInt(next);
                LogUtil.d("HiHealthManager", "the vibration value is :", Integer.valueOf(iOptInt2));
                arrayList.add(Integer.valueOf(iOptInt2));
            }
            if (iOptInt == 1) {
                c(iOptInt, arrayList);
                LogUtil.a("HiHealthManager", "pushDeviceCommand message successfully");
            } else {
                iBaseCommonCallback.onResponse(100001, VastAttribute.ERROR);
            }
        } catch (RemoteException unused) {
            LogUtil.e("HiHealthManager", "checkMessageContent RemoteException");
            xjt.u("checkMessageContent RemoteException");
        } catch (JSONException unused2) {
            LogUtil.e("HiHealthManager", "hicarOperate JSONException");
            xjt.u("json parse failed");
        }
    }

    public void d(IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback == null) {
            LogUtil.j("HiHealthManager", "queryWearStatus callback is null.");
            return;
        }
        if (!b()) {
            LogUtil.j("HiHealthManager", "Device supporting wear status is not connected..");
            iBaseResponseCallback.a(-2, "Device supporting wear status is not connected.");
            return;
        }
        if (!i()) {
            LogUtil.j("HiHealthManager", "capability is not support.");
            iBaseResponseCallback.a(-3, "capability is not support.");
            return;
        }
        LogUtil.a("HiHealthManager", "enter requryWearStatus tlv process.");
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(46);
        deviceCommand.setCommandID(3);
        String strD = eeq.d(1);
        String strD2 = eeq.d(0);
        StringBuilder sb = new StringBuilder(16);
        sb.append(strD);
        sb.append(strD2);
        deviceCommand.setDataLen(sb.length() / 2);
        deviceCommand.setDataContent(eeq.c(sb.toString()));
        deviceCommand.setNeedAck(true);
        b(3, iBaseResponseCallback);
        this.i.sendDeviceData(deviceCommand);
        LogUtil.a("HiHealthManager", "send tlv successfully.");
    }

    private void b(int i, IBaseResponseCallback iBaseResponseCallback) {
        synchronized (d) {
            if (iBaseResponseCallback != null) {
                List<IBaseResponseCallback> arrayList = f41855a.get(Integer.valueOf(i));
                if (arrayList == null) {
                    arrayList = new ArrayList<>(16);
                    f41855a.put(Integer.valueOf(i), arrayList);
                }
                arrayList.add(iBaseResponseCallback);
            }
        }
    }

    private void a(byte[] bArr) {
        int iV;
        LogUtil.a("HiHealthManager", "processGetSwitchStatus enter.");
        String strE = eeq.e(bArr);
        if (TextUtils.isEmpty(strE) || strE.length() < 4) {
            LogUtil.j("HiHealthManager", "processWearStatus tlvString is error.");
            return;
        }
        try {
            List<eew> listE = new eet().b(strE.substring(4)).e();
            if (listE != null && listE.size() != 0) {
                iV = -1;
                for (eew eewVar : listE) {
                    try {
                        int iV2 = CommonUtil.v(eewVar.e());
                        if (iV2 == 1) {
                            iV = CommonUtil.v(eewVar.b());
                        } else {
                            if (iV2 == 127) {
                                int iV3 = CommonUtil.v(eewVar.b());
                                LogUtil.j("HiHealthManager", "5.46.3 errorCode is : ", Integer.valueOf(iV3));
                                a(3, -1, iV3);
                                return;
                            }
                            LogUtil.j("HiHealthManager", "no support tag");
                        }
                    } catch (eeu unused) {
                        LogUtil.e("HiHealthManager", "processGetSwitchStatus tlv exception.");
                    }
                }
                LogUtil.a("HiHealthManager", "processGetSwitchStatus callback.");
                if (iV == -1) {
                    a(3, -1, iV);
                    return;
                } else {
                    a(3, 0, iV);
                    return;
                }
            }
            LogUtil.j("HiHealthManager", "tlvList is error.");
        } catch (eeu unused2) {
            iV = -1;
        }
    }

    private void a(int i, int i2, int i3) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("status", i3);
        } catch (JSONException unused) {
            LogUtil.e("HiHealthManager", "processGetSwitchStatus JSONException.");
        }
        e(i, i2, jSONObject.toString());
    }

    private void e(int i, int i2, Object obj) {
        synchronized (d) {
            List<IBaseResponseCallback> list = f41855a.get(Integer.valueOf(i));
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    IBaseResponseCallback iBaseResponseCallback = list.get(size);
                    if (iBaseResponseCallback != null) {
                        iBaseResponseCallback.a(i2, obj);
                        list.remove(size);
                        break;
                    }
                    list.remove(size);
                }
            }
        }
    }
}
