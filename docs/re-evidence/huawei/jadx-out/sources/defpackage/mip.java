package defpackage;

import android.text.TextUtils;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class mip {
    public static String a(String str) {
        return "rimSize" + ckg.b(str);
    }

    public static String e(String str, String str2) {
        return str + "," + str2;
    }

    public static meg b(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("HwWheelSizeUtil", "parseString input isEmpty");
            return new meg();
        }
        meg megVar = new meg();
        List listAsList = Arrays.asList(str.split(","));
        if (listAsList.size() > 3) {
            try {
                megVar.a(Long.parseLong((String) listAsList.get(0)));
                megVar.e(Integer.parseInt((String) listAsList.get(1)));
                megVar.c(Integer.parseInt((String) listAsList.get(2)));
                megVar.b(Integer.parseInt((String) listAsList.get(3)));
                return megVar;
            } catch (NumberFormatException unused) {
                LogUtil.e("parseString NumberFormatException", new Object[0]);
            }
        }
        return megVar;
    }
}
