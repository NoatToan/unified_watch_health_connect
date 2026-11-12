package defpackage;

import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.linkage.sportlinkage.AppLinkageApi;
import com.huawei.linkage.sportlinkage.LinkagePlatformApi;
import health.compact.a.Services;

/* JADX INFO: loaded from: classes12.dex */
public class oav {
    public static LinkagePlatformApi d() {
        LogUtil.a("INKAGE_LinkageApiManager", "getReverseLinkApi");
        return (LinkagePlatformApi) Services.d("LinkagePlatform", LinkagePlatformApi.class);
    }

    public static AppLinkageApi e() {
        LogUtil.a("INKAGE_LinkageApiManager", "getAppLinkageApi");
        return (AppLinkageApi) Services.d("SportService", AppLinkageApi.class);
    }
}
