package defpackage;

import com.huawei.health.marketing.request.ArticleInfoApi;
import com.huawei.health.marketing.request.ArticleInfoReq;
import com.huawei.health.marketing.request.ArticleInfoRsp;
import com.huawei.health.marketing.request.GlobalSearchFactory;
import com.huawei.hms.framework.network.restclient.Response;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.networkclient.ParamsFactory;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes29.dex */
public class fxc {
    private static volatile fxc d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ArticleInfoApi f34670c = (ArticleInfoApi) oet.d().e(ArticleInfoApi.class);
    private ParamsFactory e = new GlobalSearchFactory(BaseApplication.getContext());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f34669b = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1010);

    private fxc() {
    }

    public static fxc a() {
        if (d == null) {
            synchronized (fxc.class) {
                if (d == null) {
                    d = new fxc();
                }
            }
        }
        return d;
    }

    public void e(long j, IBaseResponseCallback iBaseResponseCallback) {
        ArticleInfoReq articleInfoReq = new ArticleInfoReq();
        try {
            HashMap map = new HashMap(10);
            map.put("articleId", String.valueOf(j));
            map.put("timeZone", lsl.q(System.currentTimeMillis()));
            Response<ArticleInfoRsp> responseExecute = this.f34670c.getArticleInfo(articleInfoReq.getUrl(), this.e.getHeaders(), ofe.c((Object) map)).execute();
            if (responseExecute == null) {
                LogUtil.j("ArticleInfoManager", "response is null");
                iBaseResponseCallback.a(-1, null);
            } else if (responseExecute.isOK()) {
                LogUtil.a("ArticleInfoManager", "response is OK.");
                iBaseResponseCallback.a(0, responseExecute.getBody().getArticleInfo());
            } else {
                LogUtil.j("ArticleInfoManager", "response result == ", Integer.valueOf(responseExecute.getCode()));
                iBaseResponseCallback.a(-1, null);
            }
        } catch (IOException e) {
            LogUtil.e("ArticleInfoManager", "getVipInfo fail, ", e.getMessage());
        }
    }
}
