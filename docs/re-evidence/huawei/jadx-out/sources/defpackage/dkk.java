package defpackage;

import com.huawei.health.configresource.R;
import com.huawei.hmf.annotation.ApiDefine;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.pluginmgr.DownloadGreyDomainApi;
import health.compact.a.CommonUtil;

/* JADX INFO: loaded from: classes26.dex */
@ApiDefine(uri = DownloadGreyDomainApi.class)
public class dkk implements DownloadGreyDomainApi {
    @Override // com.huawei.pluginmgr.DownloadGreyDomainApi
    public String getGreyDownloadDomain(String str) {
        int iJ = CommonUtil.j(LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1009));
        LogUtil.a(str, "DownloadGreyDomainUtils getGreyDownloadDomain siteId:", Integer.valueOf(iJ));
        if (iJ == 5) {
            return BaseApplication.getContext().getResources().getString(R.string.configserver_dra) + BaseApplication.getContext().getResources().getString(R.string.platform) + BaseApplication.getContext().getResources().getString(R.string.hicloud) + "com";
        }
        if (iJ == 7) {
            return BaseApplication.getContext().getResources().getString(R.string.configserver_dre) + BaseApplication.getContext().getResources().getString(R.string.platform) + BaseApplication.getContext().getResources().getString(R.string.hicloud) + "com";
        }
        if (iJ == 8) {
            return BaseApplication.getContext().getResources().getString(R.string.configserver_drru) + BaseApplication.getContext().getResources().getString(R.string.platform) + BaseApplication.getContext().getResources().getString(R.string.hicloud) + "com";
        }
        return BaseApplication.getContext().getResources().getString(R.string.configserver_drcn) + BaseApplication.getContext().getResources().getString(R.string.hicloud) + "com";
    }

    @Override // com.huawei.pluginmgr.DownloadGreyDomainApi
    public String getHealthCloudGreyDownloadDomain(String str) {
        int iJ = CommonUtil.j(LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1009));
        LogUtil.a(str, "DownloadGreyDomainUtils getHealthCloudGreyDownloadDomain siteId:", Integer.valueOf(iJ));
        if (iJ == 5) {
            return "https://" + BaseApplication.getContext().getResources().getString(R.string.sportdata_dra) + BaseApplication.getContext().getResources().getString(R.string.things) + BaseApplication.getContext().getResources().getString(R.string.dbankcloud) + "com";
        }
        if (iJ == 7) {
            return "https://" + BaseApplication.getContext().getResources().getString(R.string.healthcommon_dre) + BaseApplication.getContext().getResources().getString(R.string.things) + BaseApplication.getContext().getResources().getString(R.string.dbankcloud) + "com";
        }
        if (iJ == 8) {
            return "https://" + BaseApplication.getContext().getResources().getString(R.string.healthcommon_drru) + BaseApplication.getContext().getResources().getString(R.string.things) + BaseApplication.getContext().getResources().getString(R.string.dbankcloud) + "ru";
        }
        return "https://" + BaseApplication.getContext().getResources().getString(R.string.health_common) + BaseApplication.getContext().getResources().getString(R.string.dbankcloud) + "cn";
    }
}
