package defpackage;

import android.text.TextUtils;
import com.xiaomi.accountsdk.account.data.Constants;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public class sf4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f33583a = new File("/data/system/verifaction_staging_preview").exists();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile boolean f33584b;

    public static String a(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            return str + str2;
        }
        if (f33584b || f33583a) {
            return "https://infosec-captcha-staging.pt.xiaomi.com" + str2;
        }
        return Constants.VERIFICATIO_URL_DOMAIN + str2;
    }
}
