package defpackage;

import android.text.TextUtils;
import com.huawei.datatype.DeviceCommand;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hihealthservice.old.model.OldToNewMotionPath;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class mxd {
    public static void e(String str, DeviceInfo deviceInfo) {
        LogUtil.a("RriServiceSendCommandUtil", "setEcgMeasureAuthAccountCommand openId:", str);
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(35);
        deviceCommand.setCommandID(6);
        String strA = eeq.a(str);
        String strB = eeq.b(strA.length() / 2);
        String strD = eeq.d(1);
        StringBuilder sb = new StringBuilder(0);
        sb.append(strD);
        sb.append(strB);
        sb.append(strA);
        deviceCommand.setDataLen(sb.length() / 2);
        deviceCommand.setDataContent(eeq.c(sb.toString()));
        deviceCommand.setmIdentify(deviceInfo.getDeviceIdentify());
        mkf.e(BaseApplication.getContext()).sendDeviceData(deviceCommand);
    }

    public static void c(int i, DeviceInfo deviceInfo) {
        LogUtil.a("RriServiceSendCommandUtil", "getEcgDetailDataCommand index:", Integer.valueOf(i));
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(35);
        deviceCommand.setCommandID(8);
        byte[] bArrB = mxe.b(i);
        LogUtil.a("RriServiceSendCommandUtil", "getEcgDetailDataCommand data:", Arrays.toString(bArrB));
        deviceCommand.setDataLen(bArrB.length);
        deviceCommand.setDataContent(bArrB);
        deviceCommand.setNeedAck(true);
        deviceCommand.setmIdentify(deviceInfo.getDeviceIdentify());
        mkf.e(BaseApplication.getContext()).sendDeviceData(deviceCommand);
    }

    public static void d(int i, DeviceInfo deviceInfo) {
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(35);
        deviceCommand.setCommandID(2);
        String strD = eeq.d(i);
        String strB = eeq.b(1);
        String strD2 = eeq.d(1);
        StringBuilder sb = new StringBuilder(0);
        sb.append(strD2);
        sb.append(strB);
        sb.append(strD);
        deviceCommand.setDataLen(sb.length() / 2);
        deviceCommand.setDataContent(eeq.c(sb.toString()));
        deviceCommand.setmIdentify(deviceInfo.getDeviceIdentify());
        LogUtil.a("RriServiceSendCommandUtil", "setAtrialAutoMeasureCommand command data is ", eeq.e(deviceCommand.getDataContent()));
        mkf.e(BaseApplication.getContext()).sendDeviceData(deviceCommand);
    }

    public static void c(int i, int i2, DeviceInfo deviceInfo) {
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(35);
        deviceCommand.setCommandID(3);
        String strD = eeq.d(i);
        String strD2 = eeq.d(i2);
        String strB = eeq.b(1);
        String strD3 = eeq.d(1);
        String strB2 = eeq.b(1);
        String strD4 = eeq.d(2);
        StringBuilder sb = new StringBuilder(0);
        sb.append(strD3);
        sb.append(strB);
        sb.append(strD);
        sb.append(strD4);
        sb.append(strB2);
        sb.append(strD2);
        deviceCommand.setDataLen(sb.length() / 2);
        deviceCommand.setDataContent(eeq.c(sb.toString()));
        deviceCommand.setmIdentify(deviceInfo.getDeviceIdentify());
        LogUtil.a("RriServiceSendCommandUtil", "setAtrialSingleMeasureCommand command data is ", eeq.e(deviceCommand.getDataContent()));
        mkf.e(BaseApplication.getContext()).sendDeviceData(deviceCommand);
    }

    public static void b(DeviceInfo deviceInfo) {
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(35);
        deviceCommand.setCommandID(4);
        String strD = eeq.d(1);
        String strB = eeq.b(1);
        String strD2 = eeq.d(4);
        StringBuilder sb = new StringBuilder(0);
        sb.append(strD2);
        sb.append(strB);
        sb.append(strD);
        deviceCommand.setDataLen(sb.length() / 2);
        deviceCommand.setDataContent(eeq.c(sb.toString()));
        deviceCommand.setmIdentify(deviceInfo.getDeviceIdentify());
        LogUtil.a("RriServiceSendCommandUtil", "setClearAtrialDataCommand command data is ", eeq.e(deviceCommand.getDataContent()));
        mkf.e(BaseApplication.getContext()).sendDeviceData(deviceCommand);
    }

    public static void a() {
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceId(35);
        deviceCommand.setCommandId(9);
        StringBuilder sb = new StringBuilder(16);
        sb.append(eeq.d(1));
        sb.append(eeq.d(0));
        deviceCommand.setDataLen(sb.length() / 2);
        deviceCommand.setDataContent(eeq.c(sb.toString()));
        LogUtil.a("RriServiceSendCommandUtil", "getSwitchStatus command : ", sb.toString());
        mkf.e(BaseApplication.getContext()).sendDeviceData(deviceCommand);
    }

    public static void a(int i, String str) {
        if (str == null) {
            LogUtil.j("RriServiceSendCommandUtil", "packageName is null");
            return;
        }
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceId(35);
        deviceCommand.setCommandId(11);
        StringBuilder sb = new StringBuilder(16);
        sb.append(eeq.d(1));
        sb.append(eeq.d(1));
        sb.append(eeq.d(i));
        sb.append(eeq.d(2));
        String strA = eeq.a(str);
        sb.append(eeq.b(strA.length() / 2));
        sb.append(strA);
        deviceCommand.setDataLen(sb.length() / 2);
        deviceCommand.setDataContent(eeq.c(sb.toString()));
        LogUtil.a("RriServiceSendCommandUtil", "5.35.11 command : ", sb.toString());
        mkf.e(BaseApplication.getContext()).sendDeviceData(deviceCommand);
    }

    public static void e(int i) {
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceId(35);
        deviceCommand.setCommandId(12);
        StringBuilder sb = new StringBuilder(16);
        sb.append(eeq.d(1));
        sb.append(eeq.d(1));
        sb.append(eeq.d(i));
        deviceCommand.setDataLen(sb.length() / 2);
        deviceCommand.setDataContent(eeq.c(sb.toString()));
        LogUtil.a("RriServiceSendCommandUtil", "5.35.12 command : ", sb.toString());
        mkf.e(BaseApplication.getContext()).sendDeviceData(deviceCommand);
    }

    public static void d() {
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceId(35);
        deviceCommand.setCommandId(14);
        StringBuilder sb = new StringBuilder(16);
        sb.append(eeq.d(1));
        sb.append(eeq.d(0));
        deviceCommand.setDataLen(sb.length() / 2);
        deviceCommand.setDataContent(eeq.c(sb.toString()));
        LogUtil.a("RriServiceSendCommandUtil", "5.35.14 command : ", sb.toString());
        mkf.e(BaseApplication.getContext()).sendDeviceData(deviceCommand);
    }

    public static void a(JSONArray jSONArray, boolean z) throws JSONException {
        if (jSONArray == null) {
            LogUtil.j("RriServiceSendCommandUtil", "sendEcgBlockInfo json is null.");
            return;
        }
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceId(35);
        deviceCommand.setCommandId(15);
        int length = jSONArray.length();
        StringBuilder sb = new StringBuilder(16);
        String strD = z ? eeq.d(1) : eeq.d(0);
        for (int i = 0; i < length; i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONObject) {
                StringBuilder sb2 = new StringBuilder(16);
                JSONObject jSONObject = (JSONObject) obj;
                String string = jSONObject.getString("version");
                int i2 = jSONObject.getInt("status");
                String strE = e(jSONObject.getJSONArray("sku"));
                String strA = eeq.a(string);
                String strD2 = eeq.d(i2);
                sb2.append(eeq.d(3));
                sb2.append(eeq.b(strA.length() / 2));
                sb2.append(strA);
                sb2.append(eeq.d(4));
                sb2.append(eeq.b(strD2.length() / 2));
                sb2.append(strD2);
                sb2.append(strE);
                sb2.append(eeq.d(8));
                sb2.append(eeq.b(strD.length() / 2));
                sb2.append(strD);
                sb2.insert(0, eeq.b(sb2.length() / 2)).insert(0, eeq.d(130));
                sb.append(sb2.toString());
            }
        }
        sb.insert(0, eeq.b(sb.length() / 2)).insert(0, eeq.d(129));
        deviceCommand.setDataLength(sb.length() / 2);
        deviceCommand.setDataContent(eeq.c(sb.toString()));
        mkf.e(BaseApplication.getContext()).sendDeviceData(deviceCommand);
    }

    public static void c() {
        LogUtil.a("RriServiceSendCommandUtil", "getEcgServiceIv");
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(35);
        deviceCommand.setCommandID(17);
        StringBuilder sb = new StringBuilder(16);
        sb.append(eeq.d(1));
        sb.append(eeq.d(0));
        sb.append(eeq.d(2));
        sb.append(eeq.d(0));
        deviceCommand.setDataLen(sb.length() / 2);
        deviceCommand.setDataContent(eeq.c(sb.toString()));
        mkf.e(BaseApplication.getContext()).sendDeviceData(deviceCommand);
        LogUtil.a("RriServiceSendCommandUtil", "getEcgIv sendDeviceData end.");
    }

    private static String e(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null) {
            return "";
        }
        int length = jSONArray.length();
        StringBuilder sb = new StringBuilder(16);
        for (int i = 0; i < length; i++) {
            String string = jSONArray.getString(i);
            if (TextUtils.isEmpty(string) || string.length() != 16) {
                LogUtil.j("RriServiceSendCommandUtil", "wrong sku : ", string);
            } else {
                StringBuilder sb2 = new StringBuilder(16);
                sb2.append(eeq.d(7));
                sb2.append(eeq.b(string.length() / 2));
                sb2.append(string);
                sb2.insert(0, eeq.b(sb2.length() / 2)).insert(0, eeq.d(134));
                sb.append((CharSequence) sb2);
            }
        }
        sb.insert(0, eeq.b(sb.length() / 2)).insert(0, eeq.d(OldToNewMotionPath.SPORT_TYPE_VOLLEYBALL));
        LogUtil.a("RriServiceSendCommandUtil", "sku list : ", sb.toString());
        return sb.toString();
    }
}
