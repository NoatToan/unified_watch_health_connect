package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.KeyValDbManager;

/* JADX INFO: loaded from: classes.dex */
public class lon {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile lon f40560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f40561b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f40562c = BaseApplication.getContext();
    private volatile boolean e;

    private lon() {
    }

    public static lon c() {
        if (f40560a == null) {
            synchronized (f40561b) {
                if (f40560a == null) {
                    f40560a = new lon();
                }
            }
        }
        return f40560a;
    }

    public String d(String str) {
        String strC = KeyValDbManager.d(this.f40562c).c("grs_third_party_" + str);
        LogUtil.d("GRS_GrsThirdPartyManager", "key is ", str, ", value is ", strC);
        if (TextUtils.isEmpty(strC) && lor.b(this.f40562c)) {
            LogUtil.a("GRS_GrsThirdPartyManager", "getValue value is empty, isNeedUpdateGrsConfig = true");
            if (!this.e) {
                this.e = true;
                ThreadPoolManager.c().execute(new Runnable() { // from class: lon.4
                    @Override // java.lang.Runnable
                    public void run() {
                        lor.d(lon.this.f40562c, 2);
                        lon.this.e = false;
                    }
                });
            }
        }
        return strC;
    }

    public void e(String str, String str2) {
        KeyValDbManager.d(this.f40562c).c("grs_third_party_" + str, str2, null);
    }

    public void b() {
        KeyValDbManager.d(this.f40562c).d("grs_third_party_%");
    }
}
