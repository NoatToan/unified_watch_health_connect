package defpackage;

import android.content.SharedPreferences;
import com.huawei.haf.store.SharedStoreManager;
import health.compact.a.LogUtil;

/* JADX INFO: loaded from: classes4.dex */
public class cpk {
    public static String e(String str, String str2) {
        if (str == null) {
            LogUtil.e("MmkvUtils", "getValue, key is null");
            return str2;
        }
        return SharedStoreManager.a("keyvaldb_unencrypt").getString(str, str2);
    }

    public static void d(String str, String str2) {
        if (str == null) {
            LogUtil.e("MmkvUtils", "setValue, key is null");
            return;
        }
        SharedPreferences.Editor editorEdit = SharedStoreManager.a("keyvaldb_unencrypt").edit();
        editorEdit.putString(str, str2);
        editorEdit.commit();
    }

    public static void a(String str) {
        if (str == null) {
            LogUtil.e("MmkvUtils", "deleteKey, key is null");
            return;
        }
        SharedPreferences.Editor editorEdit = SharedStoreManager.a("keyvaldb_unencrypt").edit();
        editorEdit.remove(str);
        editorEdit.commit();
    }
}
