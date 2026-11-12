package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class lsj {
    public static boolean c(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            LogUtil.j("CommentUtil", "isInstalled param is null");
            return false;
        }
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            LogUtil.j("CommentUtil", "isInstalled ,PackageManager is null");
            return false;
        }
        try {
            return packageManager.getPackageInfo(str, 0) != null;
        } catch (PackageManager.NameNotFoundException e) {
            LogUtil.e("CommentUtil", "isInstalled fail ", e.getMessage());
        }
    }

    public static boolean a(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            LogUtil.j("CommentUtil", "isSupportCommon param is null");
            return false;
        }
        Uri uri = Uri.parse("market://details?id=com.huawei.health");
        if (uri == null) {
            LogUtil.j("CommentUtil", "uri is null");
            return false;
        }
        new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, uri).setPackage(str);
        return c(context, str);
    }
}
