package health.compact.a;

import android.text.TextUtils;
import com.huawei.haf.download.DownloadPluginUrl;
import com.huawei.hwcommonmodel.application.BaseApplication;
import defpackage.phs;

/* JADX INFO: loaded from: classes.dex */
public class GrsDownloadPluginUrl implements DownloadPluginUrl {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f36560c;

    public GrsDownloadPluginUrl() {
        this((String) null);
    }

    public GrsDownloadPluginUrl(boolean z) {
        this(z ? "getHealthBatchPluginUrl" : null);
    }

    public GrsDownloadPluginUrl(String str) {
        this.f36560c = TextUtils.isEmpty(str) ? "getNewBatchPluginUrl" : str;
    }

    @Override // com.huawei.haf.download.DownloadPluginUrl
    public boolean isNetworkConnected() {
        return CommonUtil.ab(BaseApplication.getContext());
    }

    @Override // com.huawei.haf.download.DownloadPluginUrl
    public String getDownloadPluginUrl(String str, boolean z) {
        return e(str, null, z);
    }

    protected final String e(String str, String str2, boolean z) {
        String str3;
        if (TextUtils.isEmpty(str)) {
            str3 = z ? this.f36560c : "getLatestVersion";
        } else {
            str3 = str;
        }
        boolean z2 = false;
        boolean z3 = z && "getHealthBatchPluginUrl".equals(str3);
        if (z3) {
            str3 = "domainHealthCloudCommon";
        }
        GRSManager gRSManagerC = GRSManager.c(BaseApplication.getContext());
        String commonCountryCode = TextUtils.isEmpty(str2) ? gRSManagerC.getCommonCountryCode() : str2;
        String noCheckUrl = gRSManagerC.getNoCheckUrl(str3, commonCountryCode);
        String str4 = z3 ? "getHealthBatchPluginUrl" : str3;
        if (TextUtils.isEmpty(noCheckUrl)) {
            noCheckUrl = d(str4);
        } else {
            if (z3) {
                noCheckUrl = noCheckUrl + "/commonAbility/configCenter/";
            }
            z2 = true;
        }
        com.huawei.hwlogsmodel.LogUtil.a("Login_GrsDownloadPluginUrl", "getDownloadPluginUrl=", noCheckUrl, ", key=", str4, ", countryCode=", commonCountryCode, ", batch=", Boolean.valueOf(z), ", grsResult=", Boolean.valueOf(z2));
        return noCheckUrl;
    }

    protected String d(String str) {
        if ("getLatestVersion".equals(str)) {
            return phs.f45393b;
        }
        return phs.f45394c;
    }
}
