package defpackage;

import android.os.RemoteException;
import android.text.TextUtils;
import com.huawei.datatype.DeviceCommand;
import com.huawei.health.HiAppInfo;
import com.huawei.health.IBaseCommonCallback;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.phoneprocess.framework.hwdevicemgr.dmsmanager.HwDeviceMgrInterface;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.phoneservice.faq.base.constants.TrackConstants$Events;
import health.compact.a.CommonUtil;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class mlg {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f41866c = new Object();
    private static mlg d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private DeviceInfo f41867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f41868b;
    private DeviceCapability e;
    private HwDeviceMgrInterface g;
    private Map<String, IBaseCommonCallback> i = new HashMap(16);
    private String f = null;
    private int j = -1;
    private eet h = new eet();

    private mlg() {
        HwDeviceMgrInterface hwDeviceMgrInterfaceE = mkf.e(BaseApplication.getContext());
        this.g = hwDeviceMgrInterfaceE;
        if (hwDeviceMgrInterfaceE == null) {
            LogUtil.j("MessageFeedbackManager", "mHwDeviceMgr is null");
        }
    }

    public static mlg a() {
        mlg mlgVar;
        LogUtil.a("MessageFeedbackManager", "enter MessageFeedbackManager ");
        synchronized (f41866c) {
            if (d == null) {
                d = new mlg();
            }
            mlgVar = d;
        }
        return mlgVar;
    }

    public void c() {
        b();
    }

    private static void b() {
        synchronized (f41866c) {
            d = null;
        }
    }

    private boolean e() {
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_MAIN_DEVICES, null, "MessageFeedbackManager");
        if (deviceList.size() > 0) {
            for (DeviceInfo deviceInfo : deviceList) {
                if (!eel.d(deviceInfo.getProductType())) {
                    this.f41867a = deviceInfo;
                    break;
                }
            }
        }
        if (this.f41867a != null) {
            LogUtil.a("MessageFeedbackManager", "device connected");
            return true;
        }
        LogUtil.a("MessageFeedbackManager", "device not connected");
        return false;
    }

    private boolean i() {
        DeviceInfo deviceInfo = this.f41867a;
        if (deviceInfo == null) {
            LogUtil.j("MessageFeedbackManager", "isSupportMessageFeedback mDeviceInfo is null");
            return false;
        }
        Map<String, DeviceCapability> mapQueryDeviceCapability = this.g.queryDeviceCapability(1, deviceInfo.getDeviceIdentify(), "MessageFeedbackManager");
        if (mapQueryDeviceCapability != null && !mapQueryDeviceCapability.isEmpty()) {
            this.e = mapQueryDeviceCapability.get(this.f41867a.getDeviceIdentify());
        }
        DeviceCapability deviceCapability = this.e;
        boolean zIsSupportMessageFeedback = deviceCapability != null ? deviceCapability.isSupportMessageFeedback() : false;
        LogUtil.a("MessageFeedbackManager", "get Device Support isSupportMessageFeedback :", Boolean.valueOf(zIsSupportMessageFeedback));
        return zIsSupportMessageFeedback;
    }

    public void b(HiAppInfo hiAppInfo, String str, IBaseCommonCallback iBaseCommonCallback) {
        try {
            if (!e()) {
                iBaseCommonCallback.onResponse(100001, "noDeviceConnect");
                return;
            }
            if (!i()) {
                iBaseCommonCallback.onResponse(100001, "capabilityNotSupport");
                return;
            }
            String appName = hiAppInfo.getAppName();
            LogUtil.a("MessageFeedbackManager", " the app name is:", appName);
            JSONObject jSONObject = new JSONObject(str);
            this.i.put(jSONObject.optString("remindID"), iBaseCommonCallback);
            ArrayList arrayList = new ArrayList(5);
            arrayList.add(appName);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                LogUtil.a("MessageFeedbackManager", " the message key is:", next);
                String strOptString = jSONObject.optString(next);
                LogUtil.a("MessageFeedbackManager", " the message value is:", strOptString);
                arrayList.add(strOptString);
            }
            if (!arrayList.isEmpty() && arrayList.size() == 5) {
                c(arrayList);
                return;
            }
            LogUtil.j("MessageFeedbackManager", "messageList is illegal");
            iBaseCommonCallback.onResponse(100001, "messageInputError");
        } catch (RemoteException unused) {
            LogUtil.e("MessageFeedbackManager", "checkMessageContent RemoteException");
        } catch (JSONException unused2) {
            LogUtil.e("MessageFeedbackManager", "checkMessageContent JSONException");
        }
    }

    private void c(List<String> list) {
        LogUtil.a("MessageFeedbackManager", "enter wrapTLV process");
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(46);
        deviceCommand.setCommandID(2);
        String strB = eeq.b(1);
        String strD = eeq.d(1);
        String strD2 = eeq.d(100);
        StringBuilder sb = new StringBuilder(18);
        sb.append(strD);
        sb.append(strB);
        sb.append(strD2);
        for (int i = 0; i < list.size(); i++) {
            sb.append(eeq.d(i + 2));
            sb.append(d(list)[1][i]);
            sb.append(d(list)[0][i]);
        }
        deviceCommand.setDataLen(sb.length() / 2);
        deviceCommand.setDataContent(eeq.c(sb.toString()));
        this.g.sendDeviceData(deviceCommand);
        LogUtil.a("MessageFeedbackManager", "send tlv successfully");
    }

    private String[][] d(List<String> list) {
        String[][] strArr = (String[][]) Array.newInstance((Class<?>) String.class, 2, 5);
        for (int i = 0; i < list.size(); i++) {
            String strA = eeq.a(list.get(i));
            String strB = eeq.b(strA.length() / 2);
            strArr[0][i] = strA;
            strArr[1][i] = strB;
        }
        return strArr;
    }

    public void e(byte[] bArr) {
        String strE = eeq.e(bArr);
        LogUtil.a("MessageFeedbackManager", "handleUserOperationReport is:", strE);
        if (TextUtils.isEmpty(strE) || strE.length() < 4) {
            LogUtil.j("MessageFeedbackManager", "handleUserOperationReport dataHex is error");
            return;
        }
        if (bArr[1] == 2) {
            a(strE.substring(4));
            try {
                if (TextUtils.isEmpty(this.f) || this.j == -1) {
                    return;
                }
                IBaseCommonCallback iBaseCommonCallback = this.i.get(this.f);
                String strD = d();
                this.f41868b = strD;
                if (!"".equals(strD) && iBaseCommonCallback != null) {
                    iBaseCommonCallback.onResponse(100000, this.f41868b);
                    return;
                } else {
                    LogUtil.j("MessageFeedbackManager", "handleUserOperationReport callback is null");
                    return;
                }
            } catch (RemoteException unused) {
                LogUtil.e("MessageFeedbackManager", "handleUserOperationReport RemoteException");
                return;
            }
        }
        LogUtil.j("MessageFeedbackManager", "handleUserOperationReport is illegal");
    }

    private void a(String str) {
        try {
            List<eew> listE = this.h.b(str).e();
            if (listE == null || listE.size() <= 0) {
                return;
            }
            for (eew eewVar : listE) {
                int iV = CommonUtil.v(eewVar.e());
                if (iV == 3) {
                    String strD = eeq.d(eewVar.b());
                    this.f = strD;
                    LogUtil.a("MessageFeedbackManager", "handleUserOperationReport mResultId is:", strD);
                } else if (iV != 7) {
                    LogUtil.a("MessageFeedbackManager", "handleUserOperationReport default");
                } else {
                    int iV2 = CommonUtil.v(eewVar.b());
                    this.j = iV2;
                    LogUtil.a("MessageFeedbackManager", "handleUserOperationReport mResultValue is:", Integer.valueOf(iV2));
                }
            }
        } catch (eeu unused) {
            LogUtil.e("MessageFeedbackManager", "handleUserOperationReport TlvException");
        } catch (IndexOutOfBoundsException unused2) {
            LogUtil.e("MessageFeedbackManager", "handleUserOperationReport IndexOutOfBoundsException");
        } catch (NumberFormatException unused3) {
            LogUtil.e("MessageFeedbackManager", "handleUserOperationReport NumberFormatException");
        }
    }

    private String d() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("remindID", this.f);
            jSONObject.put("remindFeedback", this.j);
            LogUtil.j("MessageFeedbackManager", "getResponseString is:", jSONObject.toString());
            this.f = null;
            this.j = -1;
            return jSONObject.toString();
        } catch (JSONException unused) {
            LogUtil.e("MessageFeedbackManager", TrackConstants$Events.EXCEPTION);
            LogUtil.a("MessageFeedbackManager", "getResponseString is empty");
            return "";
        }
    }
}
