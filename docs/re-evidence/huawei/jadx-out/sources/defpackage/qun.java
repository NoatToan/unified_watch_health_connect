package defpackage;

import android.text.TextUtils;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes16.dex */
public class qun {
    private static boolean e;

    public static boolean d(String str, List<String> list) {
        boolean z = false;
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("BluetoothAutoScanUtil", "filterToNames(), deviceName is null");
            return false;
        }
        if (list == null || list.isEmpty()) {
            LogUtil.j("BluetoothAutoScanUtil", "filterToNames(), mNameFilters is null");
            return false;
        }
        String upperCase = str.toUpperCase(Locale.ENGLISH);
        LogUtil.a("BluetoothAutoScanUtil", "after toUpperCase deviceName: ", upperCase);
        for (String str2 : list) {
            if (!TextUtils.isEmpty(str2) && upperCase.contains(str2.toUpperCase(Locale.ENGLISH))) {
                z = true;
                break;
            }
        }
        LogUtil.a("BluetoothAutoScanUtil", "filterToNames(), isFlagFilter: ", Boolean.valueOf(z));
        if (!z) {
            int iC = lvi.c(str);
            LogUtil.a("BluetoothAutoScanUtil", "filterToNames(), flagFilter productType: ", Integer.valueOf(iC));
            if (iC != -1) {
                return true;
            }
        }
        return z;
    }

    public static void e(boolean z) {
        e = z;
    }

    public static boolean b() {
        return e;
    }
}
