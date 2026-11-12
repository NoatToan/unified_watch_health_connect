package defpackage;

import com.huawei.datatype.DeviceCommand;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.wearengine.notify.NotificationParcel;
import health.compact.a.utils.StringUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes20.dex */
public class ylf {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Map<Integer, Integer> f53616b;

    static {
        HashMap map = new HashMap();
        f53616b = map;
        map.put(255, 5);
    }

    public static DeviceCommand a(NotificationParcel notificationParcel, String str) {
        DeviceCommand deviceCommand = new DeviceCommand();
        byte[] bArrC = eeq.c(b(notificationParcel, str));
        deviceCommand.setServiceID(53);
        deviceCommand.setCommandID(3);
        deviceCommand.setDataLength(bArrC.length);
        deviceCommand.setDataContent(bArrC);
        return deviceCommand;
    }

    private static String b(NotificationParcel notificationParcel, String str) {
        String strD;
        StringBuilder sb = new StringBuilder();
        String strD2 = eeq.d(1);
        String strD3 = eeq.d(notificationParcel.getTemplateId());
        String strB = eeq.b(strD3.length() / 2);
        sb.append(strD2);
        sb.append(strB);
        sb.append(strD3);
        LogUtil.d("WearEngine_NotificationUtil", "getCommandTlv template part is:", sb.toString());
        String strD4 = eeq.d(2);
        String strA = eeq.a(notificationParcel.getPackageName());
        String strB2 = eeq.b(strA.length() / 2);
        sb.append(strD4);
        sb.append(strB2);
        sb.append(strA);
        LogUtil.d("WearEngine_NotificationUtil", "getCommandTlv packageName part is:", sb.toString());
        String title = notificationParcel.getTitle();
        if (!StringUtils.g(title)) {
            String strD5 = eeq.d(3);
            String strA2 = eeq.a(title);
            String strB3 = eeq.b(strA2.length() / 2);
            sb.append(strD5);
            sb.append(strB3);
            sb.append(strA2);
            LogUtil.d("WearEngine_NotificationUtil", "getCommandTlv title part is:", sb.toString());
        }
        String strD6 = eeq.d(4);
        String strA3 = eeq.a(str);
        String strB4 = eeq.b(strA3.length() / 2);
        sb.append(strD6);
        sb.append(strB4);
        sb.append(strA3);
        LogUtil.d("WearEngine_NotificationUtil", "getCommandTlv id part is:", sb.toString());
        String text = notificationParcel.getText();
        if (!StringUtils.g(text)) {
            String strD7 = eeq.d(5);
            String strA4 = eeq.a(text);
            String strB5 = eeq.b(strA4.length() / 2);
            sb.append(strD7);
            sb.append(strB5);
            sb.append(strA4);
            LogUtil.d("WearEngine_NotificationUtil", "getCommandTlv text part is:", sb.toString());
        }
        a(notificationParcel, sb);
        if (notificationParcel.getVibration() == 1) {
            strD = eeq.d(1);
        } else {
            strD = eeq.d(2);
        }
        String strD8 = eeq.d(10);
        String strB6 = eeq.b(strD.length() / 2);
        sb.append(strD8);
        sb.append(strB6);
        sb.append(strD);
        LogUtil.d("WearEngine_NotificationUtil", "getCommandTlv vibration part is:", sb.toString());
        e(notificationParcel, sb);
        return sb.toString();
    }

    private static void a(NotificationParcel notificationParcel, StringBuilder sb) {
        HashMap<Integer, String> buttonContents = notificationParcel.getButtonContents();
        String str = buttonContents == null ? null : buttonContents.get(2);
        String str2 = buttonContents == null ? null : buttonContents.get(3);
        String str3 = buttonContents != null ? buttonContents.get(4) : null;
        if (!StringUtils.g(str)) {
            String strD = eeq.d(6);
            String strA = eeq.a(str);
            String strB = eeq.b(strA.length() / 2);
            sb.append(strD);
            sb.append(strB);
            sb.append(strA);
        }
        if (!StringUtils.g(str2)) {
            String strD2 = eeq.d(7);
            String strA2 = eeq.a(str2);
            String strB2 = eeq.b(strA2.length() / 2);
            sb.append(strD2);
            sb.append(strB2);
            sb.append(strA2);
        }
        if (!StringUtils.g(str3)) {
            String strD3 = eeq.d(8);
            String strA3 = eeq.a(str3);
            String strB3 = eeq.b(strA3.length() / 2);
            sb.append(strD3);
            sb.append(strB3);
            sb.append(strA3);
        }
        LogUtil.d("WearEngine_NotificationUtil", "getCommandTlv buttonContents part is:", sb.toString());
    }

    private static void e(NotificationParcel notificationParcel, StringBuilder sb) {
        int ringtoneId = notificationParcel.getRingtoneId();
        String strD = eeq.d(11);
        if (ringtoneId == -1) {
            String strD2 = eeq.d(2);
            String strB = eeq.b(strD2.length() / 2);
            sb.append(strD);
            sb.append(strB);
            sb.append(strD2);
        } else {
            String strD3 = eeq.d(1);
            String strB2 = eeq.b(strD3.length() / 2);
            sb.append(strD);
            sb.append(strB2);
            sb.append(strD3);
            String strD4 = eeq.d(12);
            String strD5 = eeq.d(ringtoneId);
            String strB3 = eeq.b(strD5.length() / 2);
            sb.append(strD4);
            sb.append(strB3);
            sb.append(strD5);
        }
        LogUtil.d("WearEngine_NotificationUtil", "getCommandTlv is:", sb.toString());
    }

    public static int d(int i) {
        return f53616b.get(Integer.valueOf(i)).intValue();
    }

    public static boolean b(int i) {
        return f53616b.containsKey(Integer.valueOf(i));
    }
}
