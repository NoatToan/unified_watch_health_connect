package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.View;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.dep;
import health.compact.a.CommonUtil;

/* JADX INFO: loaded from: classes7.dex */
public class dep {
    public static boolean e(Context context) {
        return (PermissionUtil.e(context, PermissionUtil.PermissionType.LOCATION) == PermissionUtil.PermissionResult.GRANTED) && !(PermissionUtil.e(context, PermissionUtil.PermissionType.LOCATION_WITH_BACKGROUND) == PermissionUtil.PermissionResult.GRANTED);
    }

    public static int c(Context context, PermissionUtil.PermissionType permissionType, PermissionUtil.PermissionResult permissionResult, boolean z) {
        boolean zB = PermissionUtil.b(context, PermissionUtil.c(PermissionUtil.PermissionType.LOCATION));
        boolean zJ = PermissionUtil.j();
        LogUtil.a("SportApplyPermissionUtils", "isHasLocation:", Boolean.valueOf(zB), " isUseOnlyAllowedLocation():", Boolean.valueOf(zJ));
        if (permissionType == a() && zB && zJ) {
            return c(context, permissionType, PermissionUtil.PermissionResult.GRANTED);
        }
        b(context, permissionType, zB, z);
        return c(context, permissionType, permissionResult);
    }

    private static void b(final Context context, PermissionUtil.PermissionType permissionType, boolean z, boolean z2) {
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.huawei.health.basesport.utils.SportApplyPermissionUtils$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dep.b(context, view);
            }
        };
        if (PermissionUtil.e() && CommonUtil.bg() && permissionType == a()) {
            if (!z) {
                qrs.d(context, z2, onClickListener);
                return;
            } else {
                qrs.b(context, z2, onClickListener);
                return;
            }
        }
        View.OnClickListener onClickListener2 = z2 ? onClickListener : null;
        if (!z2) {
            onClickListener = null;
        }
        qrs.b(context, permissionType, onClickListener2, onClickListener);
    }

    public static /* synthetic */ void b(Context context, View view) {
        if (context instanceof Activity) {
            ((Activity) context).finish();
        }
    }

    public static int c(Context context, PermissionUtil.PermissionType permissionType, PermissionUtil.PermissionResult permissionResult) {
        int iE = e(permissionResult);
        String[] strArrC = PermissionUtil.c(permissionType);
        if (context != null && strArrC != null) {
            return iE;
        }
        LogUtil.j("SportApplyPermissionUtils", "checkPermission param not valid");
        return 1;
    }

    public static int e(PermissionUtil.PermissionResult permissionResult) {
        return permissionResult == PermissionUtil.PermissionResult.FOREVER_DENIED ? 8 : 0;
    }

    public static boolean d(PermissionUtil.PermissionType permissionType) {
        return CommonUtil.av() && PermissionUtil.e() && (permissionType == PermissionUtil.PermissionType.CAMERA_IMAGE || permissionType == a());
    }

    public static PermissionUtil.PermissionType a() {
        return Build.VERSION.SDK_INT <= 29 ? PermissionUtil.PermissionType.LOCATION_WITH_BACKGROUND : PermissionUtil.PermissionType.LOCATION;
    }
}
