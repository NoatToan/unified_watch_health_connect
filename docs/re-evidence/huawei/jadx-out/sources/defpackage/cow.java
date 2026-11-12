package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.huawei.haf.application.BaseApplication;
import health.compact.a.LogUtil;

/* JADX INFO: loaded from: classes4.dex */
public class cow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f31231a = "content://" + BaseApplication.d() + ".data.access.provider/";

    public static void b(Context context, String str, String str2, String str3) {
        if (context == null) {
            LogUtil.e("ContentResolverUtils", "deleteStorageData context is null");
            return;
        }
        try {
            LogUtil.c("ContentResolverUtils", "deleteStorageData enter");
            context.getContentResolver().delete(Uri.parse(f31231a + "module_" + str + "_" + str2), str3, null);
        } catch (Exception unused) {
            LogUtil.d("ContentResolverUtils", "deleteStorageData Exception");
        }
    }

    public static Cursor d(Context context, String str, String str2, String str3) {
        if (context == null) {
            LogUtil.e("ContentResolverUtils", "queryStorageData context is null");
            return null;
        }
        try {
            return context.getContentResolver().query(Uri.parse(f31231a + "module_" + str + "_" + str2), null, str3, null, null);
        } catch (Exception unused) {
            LogUtil.d("ContentResolverUtils", "queryStorageData Exception");
            return null;
        }
    }
}
