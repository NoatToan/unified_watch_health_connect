package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.huawei.appgallery.marketinstallerservice.a.c;
import com.huawei.appgallery.marketinstallerservice.api.BaseParamSpec;
import com.huawei.appgallery.marketinstallerservice.api.FailResultParam;
import com.huawei.appgallery.marketinstallerservice.api.InstallCallback;
import com.huawei.appgallery.marketinstallerservice.api.InstallParamSpec;
import com.huawei.appgallery.marketinstallerservice.api.MarketInfo;
import com.huawei.appgallery.marketinstallerservice.internal.framework.storekit.bean.RequestBean;
import com.huawei.appgallery.marketinstallerservice.internal.framework.storekit.bean.ResponseBean;
import com.huawei.appgallery.marketinstallerservice.internal.framework.storekit.bean.b;
import com.huawei.appgallery.marketinstallerservice.ui.MarketDownloadActivity;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes23.dex */
public class bic implements c {

    static class a implements b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private InstallCallback f1121b;

        @Override // com.huawei.appgallery.marketinstallerservice.internal.framework.storekit.bean.b
        public void a(RequestBean requestBean, ResponseBean responseBean) {
        }

        @Override // com.huawei.appgallery.marketinstallerservice.internal.framework.storekit.bean.b
        public void b(RequestBean requestBean, ResponseBean responseBean) {
            if (this.f1121b == null) {
                bir.d("MarketInstallApiImpl", "callback is null!");
                return;
            }
            if (!(responseBean instanceof big)) {
                bir.d("MarketInstallApiImpl", "get Market info error!");
                return;
            }
            if (responseBean.getResponseCode() == 0 && responseBean.getRtnCode() == 0) {
                this.f1121b.onSuccess(((big) responseBean).getHiAppInfo());
                return;
            }
            bir.d("MarketInstallApiImpl", "get Market info error: responseCode:" + responseBean.getResponseCode() + ", rtnCode:" + responseBean.getRtnCode());
            FailResultParam failResultParam = new FailResultParam();
            failResultParam.setResult(-4);
            failResultParam.setResponseCode(responseBean.getResponseCode());
            failResultParam.setRtnCode(responseBean.getRtnCode());
            this.f1121b.onFailed(failResultParam);
        }

        a(InstallCallback installCallback) {
            this.f1121b = installCallback;
        }
    }

    @Override // com.huawei.appgallery.marketinstallerservice.a.c
    public void a(Context context, BaseParamSpec baseParamSpec, InstallCallback installCallback) {
        com.huawei.appgallery.marketinstallerservice.a.e.a aVarNewInstance = com.huawei.appgallery.marketinstallerservice.a.e.a.newInstance(context);
        aVarNewInstance.setServiceUrl(baseParamSpec.getServerUrl());
        aVarNewInstance.setSubsystem(baseParamSpec.getSubsystem());
        aVarNewInstance.setMarketPkg(baseParamSpec.getMarketPkg());
        bif.b(aVarNewInstance, new a(installCallback));
    }

    @Override // com.huawei.appgallery.marketinstallerservice.a.c
    public void a(Activity activity, InstallParamSpec installParamSpec, InstallCallback installCallback) {
        if (installParamSpec.isSilentDownload()) {
            bir.e("MarketInstallApiImpl", "start silent download market!");
            new biv(activity, installParamSpec, installCallback).d();
            return;
        }
        Intent intent = new Intent(activity, (Class<?>) MarketDownloadActivity.class);
        intent.putExtra("callback_key", bie.b(installCallback));
        MarketInfo marketInfo = installParamSpec.getMarketInfo();
        if (marketInfo != null) {
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
            arrayList.add(marketInfo);
            intent.putParcelableArrayListExtra("market_info_key", arrayList);
        } else {
            String serverUrl = installParamSpec.getServerUrl();
            String subsystem = installParamSpec.getSubsystem();
            String marketPkg = installParamSpec.getMarketPkg();
            boolean zIsUpdate = installParamSpec.isUpdate();
            intent.putExtra("service_url_key", serverUrl);
            intent.putExtra("sub_system_key", subsystem);
            intent.putExtra("market_pkg_key", marketPkg);
            intent.putExtra("is_update_key", zIsUpdate);
        }
        intent.putExtra("fail_result_type_key", installParamSpec.getFailResultPromptType());
        activity.startActivity(intent);
    }
}
