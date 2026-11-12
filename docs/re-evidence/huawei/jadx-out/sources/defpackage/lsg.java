package defpackage;

import android.app.Activity;
import android.content.Context;
import com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class lsg {
    public static boolean d(Context context, String[] strArr) {
        for (String str : strArr) {
            boolean zE = ltd.e().e(context, str);
            LogUtil.a("CheckAndRequestPermissionUtil", "permissions = ", str, " , hasPermission = ", Boolean.valueOf(zE));
            if (!zE) {
                return false;
            }
        }
        return true;
    }

    public static void a(Activity activity, String[] strArr, PermissionsResultAction permissionsResultAction) {
        LogUtil.a("CheckAndRequestPermissionUtil", "enter requestPermission(): activity = ", activity, ",permissions", Arrays.toString(strArr), ",action = ", permissionsResultAction);
        if (activity != null && strArr != null) {
            ltd.e().e(activity, strArr, permissionsResultAction);
            CommonUtil.d(activity, strArr);
        } else {
            if (permissionsResultAction == null) {
                return;
            }
            permissionsResultAction.onDenied("onDenied");
        }
    }

    public static void d(Activity activity, String[] strArr, PermissionsResultAction permissionsResultAction, int i) {
        LogUtil.a("CheckAndRequestPermissionUtil", "enter requestPermission(): activity = ", activity, ",permissions", Arrays.toString(strArr), ",action = ", permissionsResultAction);
        if (activity == null || strArr == null) {
            LogUtil.e("CheckAndRequestPermissionUtil", "requestPermission null");
            if (permissionsResultAction == null) {
                return;
            }
            permissionsResultAction.onDenied("onDenied");
            return;
        }
        ltd.e().b(activity, strArr, permissionsResultAction, i);
        CommonUtil.d(activity, strArr);
    }
}
