package defpackage;

import android.content.Context;
import com.huawei.hwcommonmodel.application.BaseApplication;
import health.compact.a.LanguageUtil;

/* JADX INFO: loaded from: classes.dex */
public class btx {
    public static Context c() {
        return BaseApplication.getContext();
    }

    public static String b() {
        return LanguageUtil.a(c().getResources().getConfiguration().locale);
    }
}
