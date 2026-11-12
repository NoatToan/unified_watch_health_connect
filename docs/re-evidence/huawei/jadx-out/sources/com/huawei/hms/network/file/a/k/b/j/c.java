package com.huawei.hms.network.file.a.k.b.j;

import android.text.TextUtils;
import com.huawei.hms.framework.common.ContextHolder;
import com.huawei.hms.framework.common.PLSharedPreferences;
import com.huawei.secure.android.common.encrypt.utils.EncryptUtil;
import com.huawei.secure.android.common.encrypt.utils.RootKeyUtil;

/* JADX INFO: loaded from: classes10.dex */
class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile RootKeyUtil f15708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f15709b = new Object();

    private static String a(String str, boolean z) {
        PLSharedPreferences pLSharedPreferences = new PLSharedPreferences(ContextHolder.getAppContext(), str);
        String string = pLSharedPreferences.getString(str, "");
        if (!TextUtils.isEmpty(string) || !z) {
            return string;
        }
        String strGenerateSecureRandomStr = EncryptUtil.generateSecureRandomStr(16);
        pLSharedPreferences.putString(str, strGenerateSecureRandomStr);
        return strGenerateSecureRandomStr;
    }

    static RootKeyUtil a() {
        if (f15708a == null) {
            synchronized (f15709b) {
                if (f15708a == null) {
                    EncryptUtil.setBouncycastleFlag(true);
                    String strA = a("cat", true);
                    String strA2 = a("dog", true);
                    String strA3 = a("pig", false);
                    if (TextUtils.isEmpty(strA3)) {
                        strA3 = "945e7f66c50dfefe6132c4acdf33005e";
                    }
                    f15708a = RootKeyUtil.newInstance(strA, strA2, strA3, a("salt", true));
                }
            }
        }
        return f15708a;
    }
}
