package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.mibi.sdk.common.CommonConstants;
import com.miui.tsmclient.util.Constants;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes9.dex */
public class qdq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f31420a = {"com.mipay.wallet", "com.miui.tsmclient", "com.tencent.mm", CommonConstants.ALIPAY_PACKAGE_NAME};

    public static ResolveInfo a(Context context, Intent intent) {
        if (context != null && intent != null) {
            List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
            if (listQueryIntentActivities == null) {
                return null;
            }
            for (int i = 0; i < listQueryIntentActivities.size(); i++) {
                ResolveInfo resolveInfo = listQueryIntentActivities.get(i);
                if (c(resolveInfo.activityInfo.packageName)) {
                    return resolveInfo;
                }
            }
        }
        return null;
    }

    public static boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Uri uri = Uri.parse(str);
        return ("http".equals(uri.getScheme()) || Constants.URI_SCHEME.equals(uri.getScheme())) ? false : true;
    }

    public static boolean c(String str) {
        for (String str2 : f31420a) {
            if (TextUtils.equals(str2, str)) {
                return true;
            }
        }
        return Pattern.matches("^com.xiaomi(\\.{1}[a-z]{1,}){1,}$", str);
    }
}
