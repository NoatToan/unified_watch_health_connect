package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.router.AppRouter;
import com.huawei.health.featuremarketing.R;
import com.huawei.health.featuremarketing.route.IMarketRouteHelper;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.WebViewHelp;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes28.dex */
public class evo implements IMarketRouteHelper {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private IBaseResponseCallback f33534c;
    private String d;
    private String e;

    public evo(String str, IBaseResponseCallback iBaseResponseCallback) {
        this.e = str;
        this.f33534c = iBaseResponseCallback;
    }

    @Override // com.huawei.health.featuremarketing.route.IMarketRouteHelper
    public void jumpActivity() {
        if (TextUtils.isEmpty(this.e)) {
            LogUtil.j("DeepLinkRouterHelper", "mLinkUrl is null");
            IBaseResponseCallback iBaseResponseCallback = this.f33534c;
            if (iBaseResponseCallback != null) {
                iBaseResponseCallback.a(-1, null);
                return;
            }
            return;
        }
        Uri uri = Uri.parse(qqy.g(this.e));
        String queryParameter = uri.getQueryParameter("pName");
        String queryParameter2 = uri.getQueryParameter(WebViewHelp.BI_KEY_PULL_FROM);
        this.d = uri.getQueryParameter("locationUrl");
        if (c(uri)) {
            LogUtil.a("DeepLinkRouterHelper", "route uri");
            return;
        }
        String strB = qqy.b(this.e);
        if (TextUtils.isEmpty(queryParameter)) {
            LogUtil.j("DeepLinkRouterHelper", "packageNames is null");
            IBaseResponseCallback iBaseResponseCallback2 = this.f33534c;
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
                e(strC, strB, queryParameter2);
                return;
            }
            qqy.b(strC, strB);
            IBaseResponseCallback iBaseResponseCallback3 = this.f33534c;
            if (iBaseResponseCallback3 != null) {
                iBaseResponseCallback3.a(1, null);
                return;
            }
            return;
        }
        String strE = qqy.e(strArrSplit);
        if (TextUtils.isEmpty(strE)) {
            qqy.i(strB);
            IBaseResponseCallback iBaseResponseCallback4 = this.f33534c;
            if (iBaseResponseCallback4 != null) {
                iBaseResponseCallback4.a(1, null);
                return;
            }
            return;
        }
        e(strE, strB, queryParameter2);
    }

    private boolean c(Uri uri) {
        if (!this.e.contains("RunningRoute")) {
            return false;
        }
        AppRouter.e(uri).c("PATH_ID", uri.getQueryParameter("routePathId")).b(BaseApplication.b());
        return true;
    }

    private void e(String str, String str2, String str3) {
        try {
            this.e = b();
            Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(this.e));
            intent.setPackage(str);
            intent.addCategory("android.intent.category.DEFAULT").addFlags(268435456);
            if (!TextUtils.isEmpty(str3)) {
                intent.putExtra(WebViewHelp.BI_KEY_PULL_FROM, str3);
            }
            qrs.c(intent, str, BaseApplication.b(), "");
            IBaseResponseCallback iBaseResponseCallback = this.f33534c;
            if (iBaseResponseCallback != null) {
                iBaseResponseCallback.a(0, null);
            }
        } catch (ActivityNotFoundException | SecurityException unused) {
            LogUtil.e("DeepLinkRouterHelper", "cannot found activity to handle url");
            qqy.b(str, str2);
            IBaseResponseCallback iBaseResponseCallback2 = this.f33534c;
            if (iBaseResponseCallback2 != null) {
                iBaseResponseCallback2.a(1, null);
            }
        }
    }

    private String b() {
        ArrayList arrayList = new ArrayList(Arrays.asList(BaseApplication.b().getResources().getStringArray(R.array.page_url_list)));
        if (!TextUtils.isEmpty(this.d)) {
            if ("1".equals(this.d) && arrayList.size() > 0) {
                this.e = (String) arrayList.get(0);
            } else if ("2".equals(this.d) && arrayList.size() > 1) {
                this.e = (String) arrayList.get(1);
            } else if ("3".equals(this.d) && arrayList.size() > 2) {
                this.e = (String) arrayList.get(2);
            } else {
                LogUtil.a("DeepLinkRouterHelper", "mLinkUrl is not special Url");
            }
        }
        return this.e;
    }
}
