package defpackage;

import android.text.TextUtils;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.WhiteBoxManager;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes11.dex */
final class nvn {
    public static String a(String str, String str2) {
        int iC;
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("R_OTA_AirActiveUtils", "Invalid param:SN is null");
            return "";
        }
        if (TextUtils.isEmpty(str2)) {
            LogUtil.j("R_OTA_AirActiveUtils", "Invalid param:mac is null");
            return "";
        }
        byte[] bArrA = a();
        if (bArrA == null || bArrA.length == 0) {
            LogUtil.j("R_OTA_AirActiveUtils", "Invalid param:whiteBoxKeyBytes is null");
            return "";
        }
        try {
            byte[] bytes = str.getBytes("utf-8");
            byte[] bytes2 = str2.getBytes("utf-8");
            if (bytes == null || bytes2 == null) {
                LogUtil.j("R_OTA_AirActiveUtils", "Invalid param:originalDataBytes or encryptFactorBytes is null");
                return "";
            }
            byte[] bArr = new byte[bytes.length + 38];
            try {
                iC = nvm.c(bytes, bArrA, bytes2, bArr);
            } catch (UnsupportedOperationException unused) {
                LogUtil.e("AirActiveUtils", "getAirActiveInfo UnsupportedOperationException");
                iC = -1;
            }
            LogUtil.e("R_OTA_AirActiveUtils", "Invalid param:errorCode is ", Integer.valueOf(iC));
            return iC == 0 ? eeq.e(bArr) : "";
        } catch (UnsupportedEncodingException unused2) {
            LogUtil.e("R_OTA_AirActiveUtils", "Invalid param:getAirActiveInfo occur UnsupportedEncodingException");
            return "";
        }
    }

    private static byte[] a() {
        WhiteBoxManager whiteBoxManagerB = WhiteBoxManager.b();
        return whiteBoxManagerB.a(eeq.c(whiteBoxManagerB.a(1, 42) + whiteBoxManagerB.a(1, 1042) + whiteBoxManagerB.a(1, 2042)));
    }
}
