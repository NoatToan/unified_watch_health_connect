package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.secure.android.common.encrypt.hash.SHA;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class noj {
    public static void b(Context context, int i, int i2, String str, String str2, String str3, String str4) {
    }

    public static String b() {
        String strD = nph.d();
        if (TextUtils.isEmpty(strD) || "NULL".equals(strD)) {
            nox.b("BiReportUtils", "TransID get imei is null", true);
            return null;
        }
        return SHA.sha256Encrypt(strD + c("yyyyMMddHHmmssSSS"));
    }

    private static String c(String str) {
        return new SimpleDateFormat(str, Locale.ENGLISH).format(new Date(System.currentTimeMillis()));
    }
}
