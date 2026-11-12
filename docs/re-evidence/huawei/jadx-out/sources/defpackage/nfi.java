package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.datatype.DeviceCommand;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.ReleaseLogUtil;
import java.util.Locale;

/* JADX INFO: loaded from: classes11.dex */
public class nfi {
    public static void b(final Context context, final DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            LogUtil.j("HwWearableUtil", "sendCountryCode btDeviceInfo is null");
            return;
        }
        if (deviceInfo.getDeviceConnectState() != 2) {
            LogUtil.j("HwWearableUtil", "sendCountryCode device not connect");
        } else if (!eey.d(deviceInfo, 30)) {
            LogUtil.j("HwWearableUtil", "sendCountryCode no support NewCapabilityConstants.DEVICE_COUNTRY_CODE");
        } else {
            lsy.a(new Runnable() { // from class: nfi.4
                @Override // java.lang.Runnable
                public void run() {
                    String str;
                    String commonCountryCode = GRSManager.c(context).getCommonCountryCode();
                    if (TextUtils.isEmpty(commonCountryCode)) {
                        LogUtil.j("HwWearableUtil", "countryCode is null");
                        return;
                    }
                    String strA = eeq.a(commonCountryCode);
                    String str2 = eeq.d(1) + eeq.b(eeq.c(strA).length) + strA;
                    if (eey.d(deviceInfo, 170)) {
                        Context context2 = context;
                        int iN = CommonUtil.n(context2, LoginInit.getInstance(context2).getAccountInfo(1009));
                        String strD = eeq.d(iN);
                        str = eeq.d(2) + eeq.b(eeq.c(strD).length) + strD;
                        ReleaseLogUtil.c("DEVMGR_HwWearableUtil", "siteId support NewCapabilityConstants.DEVICE_SUPPORT_SITE_ID siteId = ", Integer.valueOf(iN));
                    } else {
                        LogUtil.a("HwWearableUtil", "device not support siteId");
                        str = "";
                    }
                    String str3 = (str2 + str) + nfi.c(deviceInfo);
                    DeviceCommand deviceCommand = new DeviceCommand();
                    deviceCommand.setServiceID(26);
                    deviceCommand.setCommandID(10);
                    deviceCommand.setDataLen(eeq.c(str3).length);
                    deviceCommand.setDataContent(eeq.c(str3));
                    deviceCommand.setmIdentify(deviceInfo.getDeviceIdentify());
                    LogUtil.a("HwWearableUtil", "sendCountryCode() : countryCodeTypeLengthValue", str3);
                    ReleaseLogUtil.c("DEVMGR_HwWearableUtil", "sendCountryCode finish. value 5.26.10 = ", commonCountryCode);
                    mkf.e(context).sendDeviceData(deviceCommand);
                }
            });
        }
    }

    public static String c(DeviceInfo deviceInfo) {
        if (!b(deviceInfo).booleanValue()) {
            return "";
        }
        String country = Locale.getDefault().getCountry();
        ReleaseLogUtil.d("DEVMGR_HwWearableUtil", "appendCountryCodeSystem isEmpty = ", Boolean.valueOf(TextUtils.isEmpty(country)));
        if (TextUtils.isEmpty(country)) {
            return "";
        }
        String strA = eeq.a(country);
        return eeq.d(3) + eeq.b(eeq.c(strA).length) + strA;
    }

    public static Boolean b(DeviceInfo deviceInfo) {
        if (!CommonUtil.bh()) {
            LogUtil.j("HwWearableUtil", "isSupportCountryCodeSystem not HuaweiSystemOrHonor");
            return false;
        }
        if (deviceInfo == null) {
            LogUtil.j("HwWearableUtil", "isSupportCountryCodeSystem btDeviceInfo is null");
            return false;
        }
        if (deviceInfo.getDeviceConnectState() != 2) {
            LogUtil.j("HwWearableUtil", "isSupportCountryCodeSystem device not connect");
            return false;
        }
        if (!eey.d(deviceInfo, 30) || !eey.d(deviceInfo, 259)) {
            LogUtil.j("HwWearableUtil", "isSupportCountryCodeSystem no support COUNTRY_CODE");
            return false;
        }
        LogUtil.a("HwWearableUtil", "isSupportCountryCodeSystem support DEVICE_SYSTEM_COUNTRY_CODE");
        return true;
    }
}
