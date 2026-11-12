package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.featuremarketing.route.IMarketRouteHelper;
import com.huawei.hwauthutil.HsfSignValidator;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.WebViewHelp;
import com.tencent.open.SocialOperation;

/* JADX INFO: loaded from: classes28.dex */
public class evq implements IMarketRouteHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f33535a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private IBaseResponseCallback f33536c;

    public evq(String str, IBaseResponseCallback iBaseResponseCallback) {
        this.f33535a = str;
        this.f33536c = iBaseResponseCallback;
    }

    @Override // com.huawei.health.featuremarketing.route.IMarketRouteHelper
    public void jumpActivity() {
        if (TextUtils.isEmpty(this.f33535a)) {
            LogUtil.j("ApkRouterHelper", "mLinkUrl is null");
            IBaseResponseCallback iBaseResponseCallback = this.f33536c;
            if (iBaseResponseCallback != null) {
                iBaseResponseCallback.a(-1, null);
                return;
            }
            return;
        }
        Uri uri = Uri.parse(qqy.g(this.f33535a));
        String queryParameter = uri.getQueryParameter("pName");
        String queryParameter2 = uri.getQueryParameter(WebViewHelp.BI_KEY_PULL_FROM);
        String queryParameter3 = uri.getQueryParameter(SocialOperation.GAME_SIGNATURE);
        String strB = qqy.b(this.f33535a);
        if (TextUtils.isEmpty(queryParameter)) {
            LogUtil.j("ApkRouterHelper", "packageNames is null");
            IBaseResponseCallback iBaseResponseCallback2 = this.f33536c;
            if (iBaseResponseCallback2 != null) {
                iBaseResponseCallback2.a(-1, null);
                return;
            }
            return;
        }
        String[] strArrSplit = queryParameter.split("\\|");
        if (strArrSplit.length == 1) {
            String strC = qqy.c(queryParameter);
            if (lsj.c(BaseApplication.b(), strC)) {
                d(strC, queryParameter3, queryParameter2);
                return;
            }
            qqy.b(strC, strB);
            IBaseResponseCallback iBaseResponseCallback3 = this.f33536c;
            if (iBaseResponseCallback3 != null) {
                iBaseResponseCallback3.a(1, null);
                return;
            }
            return;
        }
        String strE = qqy.e(strArrSplit);
        if (TextUtils.isEmpty(strE)) {
            qqy.i(strB);
        } else {
            d(strE, queryParameter3, queryParameter2);
        }
    }

    private boolean b(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            LogUtil.a("ApkRouterHelper", "signature is null");
            return true;
        }
        if (str2.equals(HsfSignValidator.a(BaseApplication.b(), str))) {
            return true;
        }
        LogUtil.j("ApkRouterHelper", "signature is invalids");
        return false;
    }

    private void d(String str, String str2, String str3) {
        if (!b(str, str2)) {
            LogUtil.a("ApkRouterHelper", "signature is invalids");
            IBaseResponseCallback iBaseResponseCallback = this.f33536c;
            if (iBaseResponseCallback != null) {
                iBaseResponseCallback.a(-1, null);
                return;
            }
            return;
        }
        Intent launchIntentForPackage = BaseApplication.b().getPackageManager().getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null) {
            LogUtil.j("ApkRouterHelper", "openApp intent is null");
            IBaseResponseCallback iBaseResponseCallback2 = this.f33536c;
            if (iBaseResponseCallback2 != null) {
                iBaseResponseCallback2.a(-1, null);
                return;
            }
            return;
        }
        if (!TextUtils.isEmpty(str3)) {
            launchIntentForPackage.putExtra(WebViewHelp.BI_KEY_PULL_FROM, str3);
        }
        qrs.c(launchIntentForPackage, str, BaseApplication.j(), "");
        IBaseResponseCallback iBaseResponseCallback3 = this.f33536c;
        if (iBaseResponseCallback3 != null) {
            iBaseResponseCallback3.a(0, null);
        }
    }
}
