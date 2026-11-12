package com.huawei.watchface.utils;

import android.app.Activity;
import android.text.TextUtils;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.content.PermissionChecker;
import com.huawei.operation.ble.BleConstants;
import com.huawei.phoneservice.faq.base.constants.FaqConstants;
import com.huawei.pluginachievement.manager.model.ResultCode;
import com.huawei.watchface.e4;
import com.huawei.watchface.environment.Environment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes20.dex */
public class PermissionUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Map f30606a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f30607b = new String[0];

    public interface PermissonListener {
        void onRequested(boolean z);
    }

    public static Map a(boolean z, boolean z2) {
        Object obj;
        HwLog.i("PermissionUtils", "getPermissionToWebConstants isH5Search:" + z + ",isH5Share:" + z2);
        f30606a.clear();
        f30606a.put("android.permission.CAMERA", z ? FaqConstants.CHANNEL_HICARE : "1001");
        Map map = f30606a;
        String str = "1006";
        String str2 = "1005";
        String str3 = BleConstants.CODE_AUTHORIZED_FAIL;
        if (z) {
            obj = "1005";
        } else if (z2) {
            obj = "1006";
        } else {
            obj = CommonUtils.isAndroid11() ? ResultCode.ERROR_TS_TIMEOUT : BleConstants.CODE_AUTHORIZED_FAIL;
        }
        map.put("android.permission.WRITE_EXTERNAL_STORAGE", obj);
        Map map2 = f30606a;
        if (z) {
            str = "1005";
        } else if (!z2) {
            str = CommonUtils.isAndroid11() ? ResultCode.ERROR_TS_TIMEOUT : BleConstants.CODE_AUTHORIZED_FAIL;
        }
        map2.put("android.permission.READ_EXTERNAL_STORAGE", str);
        Map map3 = f30606a;
        if (!z) {
            str2 = CommonUtils.isAndroid11() ? ResultCode.ERROR_TS_TIMEOUT : BleConstants.CODE_AUTHORIZED_FAIL;
        }
        map3.put("android.permission.READ_MEDIA_IMAGES", str2);
        Map map4 = f30606a;
        if (CommonUtils.isAndroid11()) {
            str3 = ResultCode.ERROR_TS_TIMEOUT;
        }
        map4.put("android.permission.READ_MEDIA_VIDEO", str3);
        return f30606a;
    }

    public static boolean a() {
        return true;
    }

    public static String[] checkPermission(String[] strArr) {
        if (!a() || ArrayUtils.isEmpty(strArr)) {
            return f30607b;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (!checkPermission(str)) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static boolean requestPermissionIfNeed(Activity activity, String[] strArr, int i) {
        return a(activity, strArr, i, -1);
    }

    public static boolean verifyPermissions(int[] iArr) {
        if (iArr == null) {
            return false;
        }
        for (int i : iArr) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkPermission(String str) {
        int iCheckSelfPermission;
        if (!a()) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (CommonUtils.isAndroid14() && (TextUtils.equals(str, "android.permission.READ_MEDIA_IMAGES") || TextUtils.equals(str, "android.permission.READ_MEDIA_VIDEO"))) {
            iCheckSelfPermission = ContextCompat.checkSelfPermission(Environment.getApplicationContext(), "android.permission.READ_MEDIA_VISUAL_USER_SELECTED");
        } else {
            iCheckSelfPermission = CommonUtils.isAndroid13() ? ContextCompat.checkSelfPermission(Environment.getApplicationContext(), str) : PermissionChecker.checkSelfPermission(Environment.getApplicationContext(), str);
        }
        HwLog.i("checkPermission", "checkPermission：" + str + ",permisson" + iCheckSelfPermission);
        return iCheckSelfPermission == 0;
    }

    public static boolean a(Activity activity, String[] strArr, int i, int i2) {
        if (activity == null) {
            return false;
        }
        String[] strArrCheckPermission = checkPermission(strArr);
        boolean zIsEmpty = ArrayUtils.isEmpty(strArrCheckPermission);
        if (!zIsEmpty) {
            activity.requestPermissions(strArrCheckPermission, i);
        }
        return !zIsEmpty;
    }

    public static boolean a(Activity activity, String str) {
        if (activity == null) {
            return false;
        }
        boolean zShouldShowRequestPermissionRationale = ActivityCompat.shouldShowRequestPermissionRationale(activity, str);
        boolean zA = e4.a(str, "sp_permission_file", true);
        HwLog.i(HwLog.TAG, "isEverForbidPermission isForbiddenPermission:" + zShouldShowRequestPermissionRationale + ",isFirst=" + zA);
        return (zA || zShouldShowRequestPermissionRationale) ? false : true;
    }
}
