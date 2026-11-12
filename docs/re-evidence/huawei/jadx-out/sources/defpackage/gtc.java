package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import com.huawei.health.utils.LanguageUtils;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes8.dex */
public class gtc {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LanguageUtils.SystemLocaleChangeReceiver f36016b;

    public void a(Context context) {
        if (this.f36016b == null) {
            LogUtil.a("SystemLangChangeReceiverHelper", "Enter registerSystemLanguageChange()");
            this.f36016b = new LanguageUtils.SystemLocaleChangeReceiver();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.LOCALE_CHANGED");
            context.registerReceiver(this.f36016b, intentFilter);
        }
    }

    public void c(Context context) {
        if (this.f36016b != null) {
            LogUtil.a("SystemLangChangeReceiverHelper", "Enter unregisterSystemLanguageChange()");
            try {
                context.unregisterReceiver(this.f36016b);
            } catch (IllegalArgumentException e) {
                LogUtil.a("SystemLangChangeReceiverHelper", "unregisterSystemLanguageChange，IllegalArgumentException e = ", e.getMessage());
            } catch (RuntimeException e2) {
                LogUtil.a("SystemLangChangeReceiverHelper", "unregisterSystemLanguageChange，RuntimeException e = ", e2.getMessage());
            }
            this.f36016b = null;
        }
    }
}
