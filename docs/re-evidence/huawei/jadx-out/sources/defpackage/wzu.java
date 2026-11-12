package defpackage;

import android.content.Context;
import com.huawei.hwbasemgr.HwBaseManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.SharedPreferenceManager;

/* JADX INFO: loaded from: classes20.dex */
public class wzu extends HwBaseManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f52631a = new Object();
    private static volatile wzu e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f52632c;

    private wzu(Context context) {
        super(context);
        this.f52632c = context;
    }

    @Override // com.huawei.hwbasemgr.HwBaseManager
    public Integer getModuleId() {
        return 10007;
    }

    public static wzu a() {
        if (e == null) {
            synchronized (f52631a) {
                if (e == null) {
                    e = new wzu(BaseApplication.getContext());
                }
            }
        }
        return e;
    }

    public void b(boolean z) {
        LogUtil.a("UpToGoogleFitMgr", "setConnectGoogleStatus,isLogin: ", Boolean.valueOf(z));
        SharedPreferenceManager.e(this.f52632c, String.valueOf(10007), "key_google_fit_connect_status", String.valueOf(z), null);
    }

    public boolean e() {
        return "true".equals(SharedPreferenceManager.e(this.f52632c, String.valueOf(10007), "key_google_fit_connect_status"));
    }
}
