package defpackage;

import android.content.ContentResolver;
import android.content.pm.PackageInfo;
import android.database.Cursor;
import android.database.SQLException;
import android.database.StaleDataException;
import android.net.Uri;
import android.os.Build;
import android.os.OperationCanceledException;
import android.provider.Settings;
import android.provider.Telephony;
import android.text.TextUtils;
import com.huawei.datatype.DeviceCommand;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.EmuiBuild;
import health.compact.a.HarmonyBuild;
import health.compact.a.LogAnonymous;
import health.compact.a.MagicBuild;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class ndj {
    public static void c(int i) {
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(2);
        deviceCommand.setCommandID(16);
        byte[] bArrC = eeq.c(eeq.d(7) + eeq.d(1) + eeq.d(i));
        deviceCommand.setDataContent(bArrC);
        deviceCommand.setDataLen(bArrC.length);
        mkf.e(BaseApplication.getContext()).sendDeviceData(deviceCommand);
    }

    public static void a(int i, int i2) {
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(2);
        deviceCommand.setCommandID(16);
        byte[] bArrC = eeq.c((eeq.d(1) + eeq.d(1) + eeq.d(i)) + (eeq.d(7) + eeq.d(1) + eeq.d(i2)));
        deviceCommand.setDataContent(bArrC);
        deviceCommand.setDataLen(bArrC.length);
        mkf.e(BaseApplication.getContext()).sendDeviceData(deviceCommand);
    }

    public static List<eew> c(byte[] bArr) {
        if (bArr == null || bArr.length < 2) {
            LogUtil.j("SmsSendCommandUtils", "parseBytesToTlv dataInfos is invalid");
            return null;
        }
        String strE = eeq.e(bArr);
        try {
            return new eet().b(strE.substring(4)).e();
        } catch (eeu unused) {
            LogUtil.e("SmsSendCommandUtils", "parseBytesToTlv TlvException");
            return null;
        }
    }

    public static boolean c() {
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_MAIN_DEVICES, null, "SmsSendCommandUtils");
        DeviceInfo deviceInfo = deviceList.size() > 0 ? deviceList.get(0) : null;
        if (deviceInfo == null) {
            LogUtil.j("SmsSendCommandUtils", "isSupportSyncIconMain deviceInfo is null");
            return false;
        }
        return eey.d(deviceInfo, 89);
    }

    public static String b(String str) {
        String string = "";
        try {
            String defaultSmsPackage = Telephony.Sms.getDefaultSmsPackage(BaseApplication.getContext());
            if (!TextUtils.isEmpty(defaultSmsPackage)) {
                return defaultSmsPackage;
            }
            string = Settings.Secure.getString(BaseApplication.getContext().getContentResolver(), "sms_default_application");
            LogUtil.a(str, "Settings Secure defaultSmsPackageName", string);
            return string;
        } catch (RuntimeException unused) {
            LogUtil.e(str, "textPackageName RuntimeException");
            return string;
        }
    }

    public static boolean a(String str) {
        if (TextUtils.equals(b("SmsSendCommandUtils"), str)) {
            return CommonUtil.bg() || CommonUtil.bd();
        }
        return false;
    }

    public static boolean a(String str, int i) {
        return a(str) && i == 1390;
    }

    public static void d(String str) {
        if (CommonUtil.bu()) {
            return;
        }
        LogUtil.a(str, a());
    }

    public static String a() {
        String str;
        StringBuilder sb = new StringBuilder(128);
        String str2 = Build.BRAND + " " + Build.MODEL;
        sb.append("phoneNameModel: ");
        sb.append(str2);
        if (EmuiBuild.f36544b) {
            sb.append(",EMUI ");
            sb.append(EmuiBuild.f36543a);
            sb.append(",API ");
            sb.append(EmuiBuild.e);
        } else if (HarmonyBuild.e) {
            sb.append(",HarmonyOS ");
            sb.append(HarmonyBuild.f36561a);
            sb.append(",API ");
            sb.append(HarmonyBuild.d);
        } else if (MagicBuild.f36615a) {
            sb.append(",MagicOS ");
            sb.append(MagicBuild.e);
            sb.append(",API ");
            sb.append(MagicBuild.f36616b);
        }
        sb.append(",Android ");
        sb.append(Build.VERSION.RELEASE);
        sb.append(",API ");
        sb.append(Build.VERSION.SDK_INT);
        String strB = b("SmsSendCommandUtils");
        PackageInfo packageInfoB = mir.b(strB);
        if (packageInfoB == null) {
            str = "";
        } else {
            str = packageInfoB.versionName;
        }
        sb.append(",defaultSms ");
        sb.append(strB);
        sb.append("_v");
        sb.append(str);
        return sb.toString();
    }

    public static boolean e(String str) {
        Uri uri = Telephony.Sms.Inbox.CONTENT_URI;
        String[] strArr = {"sub_id"};
        ContentResolver contentResolver = BaseApplication.getContext().getContentResolver();
        Cursor cursorQuery = null;
        LogUtil.a(str, lsu.a(uri.toString(), strArr, null, null, null));
        try {
            try {
                cursorQuery = contentResolver.query(uri, strArr, null, null, null);
                if (cursorQuery != null && cursorQuery.moveToFirst()) {
                    int columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow("sub_id");
                    if (columnIndexOrThrow >= 0 && columnIndexOrThrow < cursorQuery.getColumnCount()) {
                        while (cursorQuery.getInt(columnIndexOrThrow) != 0) {
                            if (!cursorQuery.moveToNext()) {
                                if (cursorQuery != null && !cursorQuery.isClosed()) {
                                    cursorQuery.close();
                                }
                                return false;
                            }
                        }
                        if (cursorQuery != null && !cursorQuery.isClosed()) {
                            cursorQuery.close();
                        }
                        return true;
                    }
                    LogUtil.j(str, "smsReply getSmsManager getSubscriptionId isSubIdHasZero: subIdIndex is invalid.");
                    if (cursorQuery != null && !cursorQuery.isClosed()) {
                        cursorQuery.close();
                    }
                    return false;
                }
                LogUtil.j(str, "smsReply getSmsManager getSubscriptionId isSubIdHasZero cursor is null or cannot move.", Boolean.valueOf(cursorQuery == null));
                if (cursorQuery != null && !cursorQuery.isClosed()) {
                    cursorQuery.close();
                }
                return false;
            } catch (Throwable th) {
                if (0 != 0 && !cursorQuery.isClosed()) {
                    cursorQuery.close();
                }
                throw th;
            }
        } catch (SQLException | StaleDataException | OperationCanceledException | IllegalArgumentException | IllegalStateException | SecurityException e) {
            LogUtil.a(str, "smsReply getSmsManager getSubscriptionId isSubIdHasZero exception: ", LogAnonymous.b(e));
            if (0 != 0 && !cursorQuery.isClosed()) {
            }
        }
    }
}
