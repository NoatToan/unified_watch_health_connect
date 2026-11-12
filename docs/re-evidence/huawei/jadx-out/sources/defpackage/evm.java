package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.featuremarketing.route.IMarketRouteHelper;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes28.dex */
public class evm implements IMarketRouteHelper {
    private String d;
    private IBaseResponseCallback e;

    public evm(String str, IBaseResponseCallback iBaseResponseCallback) {
        this.d = str;
        this.e = iBaseResponseCallback;
    }

    @Override // com.huawei.health.featuremarketing.route.IMarketRouteHelper
    public void jumpActivity() {
        if (TextUtils.isEmpty(this.d)) {
            LogUtil.j("QuickAppRouterHelper", "mLinkUrl is null");
            IBaseResponseCallback iBaseResponseCallback = this.e;
            if (iBaseResponseCallback != null) {
                iBaseResponseCallback.a(-1, null);
                return;
            }
            return;
        }
        prf.c(BaseApplication.b(), Uri.parse(qqy.g(this.d)).getQueryParameter("pName"));
        IBaseResponseCallback iBaseResponseCallback2 = this.e;
        if (iBaseResponseCallback2 != null) {
            iBaseResponseCallback2.a(0, null);
        }
    }
}
