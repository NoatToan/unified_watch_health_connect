package defpackage;

import com.huawei.haf.store.SharedStoreManager;

/* JADX INFO: loaded from: classes4.dex */
public class cot {
    public static String e() {
        return b("AndroidId", "");
    }

    private static String b(String str, String str2) {
        return SharedStoreManager.a("CommonInfo").getString(str, str2);
    }
}
