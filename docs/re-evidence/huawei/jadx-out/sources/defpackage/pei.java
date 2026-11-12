package defpackage;

import android.content.Context;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.Locale;

/* JADX INFO: loaded from: classes14.dex */
public class pei {
    public static String c(Context context, int i, Object... objArr) {
        if (context == null) {
            LogUtil.j("Suggestion_I18nUtil", "context == null");
            return "";
        }
        return String.format(Locale.ENGLISH, context.getResources().getString(i), objArr);
    }

    public static String e(String str, Object... objArr) {
        return String.format(Locale.ENGLISH, str, objArr);
    }
}
