package defpackage;

import android.content.Context;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes18.dex */
public class tpn {
    public static boolean c(Context context) {
        boolean z = PermissionUtil.e(context, PermissionUtil.PermissionType.LOCATION) == PermissionUtil.PermissionResult.GRANTED;
        LogUtil.a("CheckGpsPermissionUtil", "isHaveFrontPermission :", Boolean.valueOf(z));
        return z;
    }

    public static boolean b(Context context) {
        boolean z = PermissionUtil.e(context, PermissionUtil.PermissionType.LOCATION_WITH_BACKGROUND) == PermissionUtil.PermissionResult.GRANTED;
        LogUtil.a("CheckGpsPermissionUtil", "isHaveBackGroundPermission :", Boolean.valueOf(z));
        return z;
    }
}
