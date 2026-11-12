package defpackage;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.huawei.haf.store.SharedStoreManager;
import health.compact.a.LogUtil;

/* JADX INFO: loaded from: classes4.dex */
public class cpo {
    public static String d(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            LogUtil.e("MultiProcessSpUtils", "getValue, name or key is null");
            return str3;
        }
        return SharedStoreManager.c(str).getString(str2, str3);
    }

    public static void b(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            LogUtil.e("MultiProcessSpUtils", "setValue, name or key is null");
            return;
        }
        SharedPreferences.Editor editorEdit = SharedStoreManager.c(str).edit();
        editorEdit.putString(str2, str3);
        editorEdit.commit();
    }

    public static void b(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            LogUtil.e("MultiProcessSpUtils", "deleteKey, name or key is null");
            return;
        }
        SharedPreferences.Editor editorEdit = SharedStoreManager.c(str).edit();
        editorEdit.remove(str2);
        editorEdit.commit();
    }
}
