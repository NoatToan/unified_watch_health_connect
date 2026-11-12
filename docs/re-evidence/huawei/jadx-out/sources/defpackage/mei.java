package defpackage;

import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.mainprocess.mgr.intelligentlifemgr.IntellLifeProviderImpl;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.profile.account.AccountProxy;

/* JADX INFO: loaded from: classes2.dex */
public class mei {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile mei f41501a;
    private static final Object d = new Object();

    private mei() {
    }

    public static mei e() {
        if (f41501a == null) {
            synchronized (d) {
                if (f41501a == null) {
                    f41501a = new mei();
                }
            }
        }
        return f41501a;
    }

    public void d() {
        AccountProxy.getInstance(BaseApplication.getContext()).setActivated(true);
        IntellLifeProviderImpl intellLifeProviderImpl = new IntellLifeProviderImpl(BaseApplication.getContext());
        LogUtil.a("IntellLifeProviderTool", "registerProfileChannel setProvider");
        AccountProxy.getInstance(BaseApplication.getContext()).setProvider(intellLifeProviderImpl);
    }

    public void b() {
        AccountProxy.getInstance(BaseApplication.getContext()).accountLogout();
    }
}
