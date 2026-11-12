package defpackage;

import android.text.TextUtils;
import com.apprichtap.haptic.base.PrebakedEffectId;
import com.huawei.browse.BrowsingBiEvent;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.featuremarketing.route.IMarketRouteHelper;
import com.huawei.health.marketrouter.api.MarketRouterApi;
import com.huawei.hmf.annotation.ApiDefine;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import health.compact.a.SharedPreferenceManager;
import java.util.Map;

/* JADX INFO: loaded from: classes28.dex */
@ApiDefine(uri = MarketRouterApi.class)
public class evn implements MarketRouterApi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IBaseResponseCallback f33533a;

    @Override // com.huawei.health.marketrouter.api.MarketRouterApi
    public void router(String str, IBaseResponseCallback iBaseResponseCallback) {
        this.f33533a = iBaseResponseCallback;
        router(str);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.huawei.health.marketrouter.api.MarketRouterApi
    public void router(String str) {
        IMarketRouteHelper evsVar;
        String strA = qqy.a(str);
        byte b2 = -1;
        if (TextUtils.isEmpty(strA)) {
            LogUtil.j("MarketRouterImpl", "routerUrl url is null");
            IBaseResponseCallback iBaseResponseCallback = this.f33533a;
            if (iBaseResponseCallback != null) {
                iBaseResponseCallback.a(-1, null);
                return;
            }
            return;
        }
        if (SharedPreferenceManager.b(Integer.toString(PrebakedEffectId.RT_FLY), "is_base_service_model", false)) {
            BrowsingBiEvent browsingBiEvent = LoginInit.getBrowsingBiEvent();
            if (browsingBiEvent != null) {
                browsingBiEvent.showFullServiceDialog(BaseApplication.b());
            }
            LogUtil.j("MarketRouterImpl", "basic model, marketingResource can not jump, return");
            return;
        }
        String strTrim = strA.trim();
        String strE = qqy.e(strTrim);
        if (!"3".equals(strE) && !"2".equals(strE)) {
            evp.e(strTrim);
        }
        strE.hashCode();
        switch (strE.hashCode()) {
            case 49:
                if (strE.equals("1")) {
                    b2 = 0;
                }
                break;
            case 50:
                if (strE.equals("2")) {
                    b2 = 1;
                }
                break;
            case 51:
                if (strE.equals("3")) {
                    b2 = 2;
                }
                break;
            case 52:
                if (strE.equals("4")) {
                    b2 = 3;
                }
                break;
        }
        if (b2 == 0) {
            evsVar = new evs(strTrim, this.f33533a);
        } else if (b2 == 1) {
            evsVar = new evq(strTrim, this.f33533a);
        } else if (b2 == 2) {
            evsVar = new evm(strTrim, this.f33533a);
        } else if (b2 == 3) {
            evsVar = new evo(strTrim, this.f33533a);
        } else {
            evsVar = new evs(strTrim, this.f33533a);
        }
        evsVar.jumpActivity();
    }

    @Override // com.huawei.health.marketrouter.api.MarketRouterApi
    public Map<String, String> getLastMarketSource() {
        return evp.e();
    }
}
