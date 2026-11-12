package defpackage;

import android.text.TextUtils;
import health.compact.a.CommonUtil;
import health.compact.a.LogUtil;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class qsy {
    public static boolean e(List<String> list) {
        if (njy.e(list)) {
            LogUtil.e("PageConfigUtil", "supportDeviceList is empty.");
            return false;
        }
        LogUtil.b("PageConfigUtil", "isSupportDevice supportDeviceList");
        boolean zBh = CommonUtil.bh();
        for (String str : list) {
            boolean zEquals = "AllDeviceType".equals(str);
            boolean z = "ThirdPartyType".equals(str) && !zBh;
            LogUtil.b("PageConfigUtil", "isAll: ", Boolean.valueOf(zEquals), ", isThirdParty: ", Boolean.valueOf(z));
            if (zEquals || z) {
                return true;
            }
        }
        return CommonUtil.c((String[]) list.toArray(new String[0]));
    }

    public static boolean c(List<Integer> list, String str) {
        if (njy.e(list)) {
            LogUtil.e("PageConfigUtil", "huidTailList is empty.");
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            LogUtil.e("PageConfigUtil", "huid is empty");
            return false;
        }
        LogUtil.b("PageConfigUtil", "isSupportHuid huidTailList");
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            boolean zEndsWith = str.endsWith(String.valueOf(it.next()));
            if (zEndsWith) {
                LogUtil.b("PageConfigUtil", "isSupportHuid isCurHuidMatch: ", Boolean.valueOf(zEndsWith));
                return true;
            }
        }
        return false;
    }

    public static boolean b(List<String> list, String str) {
        if (njy.e(list)) {
            LogUtil.e("PageConfigUtil", "isBlockHuid blockHuidTailList is empty.");
            return false;
        }
        if (TextUtils.isEmpty(str)) {
            LogUtil.e("PageConfigUtil", "isBlockHuid huid is empty");
            return false;
        }
        LogUtil.b("PageConfigUtil", "isBlockHuid blockHuidTailList");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            boolean zEndsWith = str.endsWith(it.next());
            if (zEndsWith) {
                LogUtil.b("PageConfigUtil", "isBlockHuid isCurHuidMatch: ", Boolean.valueOf(zEndsWith));
                return true;
            }
        }
        return false;
    }

    public static boolean e(List<String> list, String str) {
        if (njy.e(list)) {
            LogUtil.e("PageConfigUtil", "isWhiteCountry whiteCountryList is empty.");
            return false;
        }
        if (TextUtils.isEmpty(str)) {
            LogUtil.e("PageConfigUtil", "isWhiteCountry countryCode is empty");
            return false;
        }
        for (String str2 : list) {
            if ("ALL".equals(str2)) {
                return true;
            }
            boolean zContains = str.contains(str2);
            LogUtil.b("PageConfigUtil", "isWhiteCountry isCurCountryMatch: ", Boolean.valueOf(zContains));
            if (zContains) {
                return true;
            }
        }
        return false;
    }
}
