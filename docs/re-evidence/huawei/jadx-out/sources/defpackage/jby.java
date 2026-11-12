package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class jby {
    public static int d(String str, Context context) {
        return c(str, context, "string");
    }

    public static int a(String str, Context context) {
        return c(str, context, "drawable");
    }

    public static int c(String str, Context context, String str2) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            LogUtil.j("HwResourceUtil", "getResourceId context == null || TextUtils.isEmpty(stringName) || TextUtils.isEmpty(type)");
            return 0;
        }
        return context.getResources().getIdentifier(str, str2, context.getPackageName());
    }
}
