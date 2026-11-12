package defpackage;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.huawei.health.ecologydevice.manager.ResourceManager;
import com.huawei.hihealth.dictionary.constants.ProductMap;
import com.huawei.hihealth.dictionary.constants.ProductMapInfo;
import com.huawei.hihealth.dictionary.utils.ProductMapParseUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class wvd {
    @Deprecated
    public static String e(int i) {
        LogUtil.a("RopeDeviceNameUtils", "deviceType = ", Integer.valueOf(i));
        return c("deviceId", String.valueOf(i));
    }

    private static String c(String str, String str2) {
        ProductMapParseUtil.a(BaseApplication.getContext());
        List<ProductMapInfo> listC = ProductMap.c(str, str2);
        if (njy.e(listC)) {
            LogUtil.a("RopeDeviceNameUtils", "productmap is null or empty");
            return "";
        }
        String strF = listC.get(0).f();
        if (TextUtils.isEmpty(strF)) {
            LogUtil.a("RopeDeviceNameUtils", "productmap no productId");
            return "";
        }
        elh elhVarD = ResourceManager.c().d(strF);
        if (elhVarD == null) {
            LogUtil.a("RopeDeviceNameUtils", "product file is null");
            return "";
        }
        elh.d dVarL = elhVarD.l();
        if (dVarL == null) {
            LogUtil.a("RopeDeviceNameUtils", "productInfo manifest is null");
            return "";
        }
        return elo.a(strF, dVarL.d());
    }

    public static void e(String str) {
        SharedPreferences.Editor editorEdit = BaseApplication.getContext().getSharedPreferences("device_name", 0).edit();
        if (editorEdit != null) {
            editorEdit.putString("device_name_key", str);
            editorEdit.apply();
        }
    }
}
