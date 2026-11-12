package defpackage;

import android.text.TextUtils;
import com.huawei.datatype.DeviceCommand;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes11.dex */
public class nae {
    public static void d(int i) {
        StringBuilder sb = new StringBuilder(16);
        String strD = eeq.d(i);
        String strB = eeq.b(strD.length() / 2);
        sb.append(eeq.d(2));
        sb.append(strB);
        sb.append(strD);
        String strD2 = eeq.d(1);
        String strB2 = eeq.b(strD2.length() / 2);
        sb.append(eeq.d(8));
        sb.append(strB2);
        sb.append(strD2);
        e(sb.toString(), 1);
    }

    public static void c(String str) {
        StringBuilder sb = new StringBuilder(16);
        String strA = eeq.a(str);
        String strB = eeq.b(strA.length() / 2);
        sb.append(eeq.d(11));
        sb.append(strB);
        sb.append(strA);
        String strD = eeq.d(str.length());
        String strB2 = eeq.b(strD.length() / 2);
        sb.append(eeq.d(12));
        sb.append(strB2);
        sb.append(strD);
        e(sb.toString(), 1);
    }

    public static void b(String str, int i) {
        StringBuilder sb = new StringBuilder(16);
        if (!TextUtils.isEmpty(str)) {
            String strA = eeq.a(str);
            String strB = eeq.b(strA.length() / 2);
            sb.append(eeq.d(1));
            sb.append(strB);
            sb.append(strA);
        }
        if (i != -1) {
            String strD = eeq.d(i);
            String strB2 = eeq.b(strD.length() / 2);
            sb.append(eeq.d(2));
            sb.append(strB2);
            sb.append(strD);
        }
        e(sb.toString(), 3);
    }

    public static void c(String str, String str2) {
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            LogUtil.j("HwVoiceKitManager_SendToDeviceKitData", "sendDisplayTextAndAsr displayAsr and displayText isEmpty");
            return;
        }
        LogUtil.a("HwVoiceKitManager_SendToDeviceKitData", "sendDisplayTextAndAsr displayAsr:", str, " , displayText:", str2);
        StringBuilder sb = new StringBuilder(16);
        if (!TextUtils.isEmpty(str)) {
            String strA = eeq.a(str);
            String strB = eeq.b(strA.length() / 2);
            sb.append(eeq.d(1));
            sb.append(strB);
            sb.append(strA);
        }
        if (!TextUtils.isEmpty(str2)) {
            String strA2 = eeq.a(str2);
            String strB2 = eeq.b(strA2.length() / 2);
            sb.append(eeq.d(2));
            sb.append(strB2);
            sb.append(strA2);
        }
        e(sb.toString(), 4);
    }

    public static void e(int i) {
        StringBuilder sb = new StringBuilder(16);
        String strD = eeq.d(200);
        String strB = eeq.b(strD.length() / 2);
        String strD2 = eeq.d(1);
        String strD3 = eeq.d(i);
        String strB2 = eeq.b(strD3.length() / 2);
        String strD4 = eeq.d(8);
        sb.append(strD2);
        sb.append(strB);
        sb.append(strD);
        sb.append(strD4);
        sb.append(strB2);
        sb.append(strD3);
        e(sb.toString(), 5);
    }

    public static void c(int i) {
        StringBuilder sb = new StringBuilder(16);
        String strD = eeq.d(i);
        String strB = eeq.b(strD.length() / 2);
        sb.append(eeq.d(1));
        sb.append(strB);
        sb.append(strD);
        e(sb.toString(), 6);
    }

    public static void d() {
        StringBuilder sb = new StringBuilder(16);
        String strD = eeq.d(1);
        String strD2 = eeq.d(0);
        sb.append(strD);
        sb.append(strD2);
        e(sb.toString(), 8);
    }

    public static void a(String str) {
        StringBuilder sb = new StringBuilder(16);
        d(e(str), sb);
        d(e(), sb);
        e(sb.toString(), 8);
    }

    private static String e(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int iA = lsk.a(str, 10);
        if (iA == -1) {
            LogUtil.j("HwVoiceKitManager_SendToDeviceKitData", "buildMediaTypeTlv Invalid mediaType");
            return "";
        }
        String strD = eeq.d(iA);
        return eeq.d(2) + eeq.b(strD.length() / 2) + strD;
    }

    private static String e() {
        return eeq.d(3) + eeq.d(0);
    }

    private static void d(String str, StringBuilder sb) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        sb.append(str);
        LogUtil.a("HwVoiceKitManager_SendToDeviceKitData", "appendTlv tlv:", str);
    }

    public static void c(String str, String str2, String str3) {
        LogUtil.a("HwVoiceKitManager_SendToDeviceKitData", "sendDomain doMainId:", str, ", subDomainId:", str2, ", intentId:", str3);
        StringBuilder sb = new StringBuilder(16);
        String strA = eeq.a(str);
        String strB = eeq.b(strA.length() / 2);
        sb.append(eeq.d(1));
        sb.append(strB);
        sb.append(strA);
        String strA2 = eeq.a(str2);
        String strB2 = eeq.b(strA2.length() / 2);
        sb.append(eeq.d(2));
        sb.append(strB2);
        sb.append(strA2);
        String strA3 = eeq.a(str3);
        String strB3 = eeq.b(strA3.length() / 2);
        sb.append(eeq.d(3));
        sb.append(strB3);
        sb.append(strA3);
        e(sb.toString(), 9);
    }

    public static void e(String str, int i) {
        byte[] bArrC = eeq.c(str);
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(49);
        deviceCommand.setCommandID(i);
        deviceCommand.setDataContent(bArrC);
        deviceCommand.setDataLen(bArrC.length);
        LogUtil.a("HwVoiceKitManager_SendToDeviceKitData", "sendToDevice commandId is:", Integer.valueOf(i));
        LogUtil.a("HwVoiceKitManager_SendToDeviceKitData", "sendToDevice command:", eeq.e(deviceCommand.getDataContent()));
        mkf.e(BaseApplication.getContext()).sendDeviceData(deviceCommand);
    }
}
