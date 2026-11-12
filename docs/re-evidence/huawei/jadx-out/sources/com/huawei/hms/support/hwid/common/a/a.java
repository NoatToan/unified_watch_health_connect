package com.huawei.hms.support.hwid.common.a;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.huawei.hms.support.hwid.common.e.e;
import java.util.UUID;

/* JADX INFO: loaded from: classes34.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f16610a = "";

    public static String a() {
        String str = Build.MODEL;
        return TextUtils.isEmpty(str) ? "unknown" : str;
    }

    public static String b() {
        if (TextUtils.isEmpty(f16610a)) {
            String string = UUID.randomUUID().toString();
            f16610a = string;
            if (TextUtils.isEmpty(string)) {
                return "NULL";
            }
        }
        return f16610a;
    }

    public static String a(Context context) {
        e.a("TerminalInfo", "generateUuid start.", true);
        String strB = com.huawei.hms.support.hwid.common.d.a.a(context).b("UUID", "");
        if (!TextUtils.isEmpty(strB)) {
            return strB;
        }
        e.a("TerminalInfo", "uuid is null.", true);
        String strB2 = b();
        com.huawei.hms.support.hwid.common.d.a.a(context).c("UUID", strB2);
        return strB2;
    }
}
