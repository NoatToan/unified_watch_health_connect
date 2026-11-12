package defpackage;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.huawei.health.deviceconnect.callback.BtDeviceResponseCallback;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.WhiteBoxManager;
import java.io.UnsupportedEncodingException;
import java.security.InvalidParameterException;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes10.dex */
public class mke {
    public static boolean b() {
        try {
            BaseApplication.getContext().getPackageManager().getApplicationInfo("com.huawei.iconnect", 0);
            LogUtil.a(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "DmsUtil", "iconnect pkg exist.");
            PackageInfo packageInfo = BaseApplication.getContext().getPackageManager().getPackageInfo("com.huawei.iconnect", 0);
            if (packageInfo != null) {
                int i = packageInfo.versionCode;
                LogUtil.a(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "DmsUtil", "iconnect code:", Integer.valueOf(i));
                if (i > 2) {
                    return true;
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            LogUtil.e(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "DmsUtil", "iconnect pkg do not exist.");
            return false;
        }
    }

    public static void e(BtDeviceResponseCallback btDeviceResponseCallback) {
        mkf.d().c(btDeviceResponseCallback);
    }

    public static String e(String str) {
        WhiteBoxManager whiteBoxManagerB = WhiteBoxManager.b();
        try {
            byte[] bArrA = whiteBoxManagerB.a(eeq.c(whiteBoxManagerB.a(1, 21) + whiteBoxManagerB.a(1, 1021) + whiteBoxManagerB.a(1, 2021)));
            if (bArrA != null && bArrA.length != 0) {
                String str2 = new String(bArrA, "utf-8");
                byte[] bArrA2 = lnh.a(16);
                return eeq.e(bArrA2) + eeq.e(lnh.a(1, str.getBytes("utf-8"), eeq.c(str2), bArrA2));
            }
            LogUtil.j("DmsUtil", "encryptIconnectData encryptKeyBytes is empty.");
            return "";
        } catch (UnsupportedEncodingException e) {
            LogUtil.e("DmsUtil", "UnsupportedEncodingException msg:", e.getMessage());
            return "";
        } catch (InvalidParameterException e2) {
            LogUtil.e("DmsUtil", "InvalidParameterException msg:", e2.getMessage());
            return "";
        } catch (NoSuchAlgorithmException e3) {
            LogUtil.e("DmsUtil", "NoSuchAlgorithmException msg:", e3.getMessage());
            return "";
        }
    }

    public static String a(byte[] bArr) {
        if (bArr == null || bArr.length < 2) {
            return "";
        }
        return eeq.d((int) bArr[0]) + eeq.d((int) bArr[1]);
    }
}
