package defpackage;

import android.content.Context;
import com.huawei.haf.bundle.AppBundlePluginProxy;
import com.huawei.health.market.api.MarketMgrApi;

/* JADX INFO: loaded from: classes7.dex */
public class fwv extends AppBundlePluginProxy<MarketMgrApi> implements MarketMgrApi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile fwv f34655a;
    private MarketMgrApi e;

    private fwv() {
        super("MarketProxy", "Market", "com.huawei.health.market.impl.MarketMgrImpl");
        this.e = createPluginApi();
    }

    public static fwv d() {
        fwv fwvVar;
        if (f34655a == null) {
            synchronized (fwv.class) {
                if (f34655a == null) {
                    f34655a = new fwv();
                }
                fwvVar = f34655a;
            }
            return fwvVar;
        }
        return f34655a;
    }

    @Override // com.huawei.haf.bundle.AppBundlePluginProxy
    public boolean isPluginAvaiable() {
        return this.e != null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.haf.bundle.AppBundlePluginProxy
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void initialize(MarketMgrApi marketMgrApi) {
        this.e = marketMgrApi;
    }

    @Override // com.huawei.health.market.api.MarketMgrApi
    public void showMarketCommentDialog(Context context) {
        if (isPluginAvaiable()) {
            this.e.showMarketCommentDialog(context);
        }
    }
}
