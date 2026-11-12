package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.alipay.sdk.app.EnvUtils;

/* JADX INFO: loaded from: classes4.dex */
public class oy {
    public static String e() {
        return mz.f42720b;
    }

    public static String e(Context context) {
        if (EnvUtils.d()) {
            return "https://mobilegw.alipaydev.com/mgw.htm";
        }
        if (EnvUtils.a()) {
            return "https://mobilegw.dl.alipaydev.com/mgw.htm";
        }
        if (context == null) {
            return mz.f42721c;
        }
        String str = mz.f42721c;
        return TextUtils.isEmpty(str) ? mz.f42721c : str;
    }
}
