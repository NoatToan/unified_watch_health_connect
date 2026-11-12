package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import com.huawei.appgallery.marketinstallerservice.api.Constant;
import com.huawei.appgallery.marketinstallerservice.api.FailResultParam;
import com.huawei.appgallery.marketinstallerservice.api.InstallCallback;
import com.huawei.appgallery.marketinstallerservice.api.InstallParamSpec;
import com.huawei.appgallery.marketinstallerservice.api.MarketInfo;
import com.huawei.appgallery.marketinstallerservice.impl.download.b;
import com.huawei.appgallery.marketinstallerservice.ui.a;
import java.io.File;

/* JADX INFO: loaded from: classes23.dex */
public class biu implements a, com.huawei.appgallery.marketinstallerservice.impl.download.a.InterfaceC0059a, b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.huawei.appgallery.marketinstallerservice.ui.b f1132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Activity f1133b;
    private com.huawei.appgallery.marketinstallerservice.impl.download.a d;
    private InstallParamSpec e = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f1134c = null;
    private FailResultParam f = new FailResultParam();

    @Override // com.huawei.appgallery.marketinstallerservice.ui.a
    public void e() {
        InstallCallback installCallbackD = bie.d(this.f1134c);
        if (installCallbackD != null) {
            installCallbackD.onFailed(this.f);
            bie.a(this.f1134c);
        }
    }

    @Override // com.huawei.appgallery.marketinstallerservice.ui.a
    public MarketInfo d() {
        InstallParamSpec installParamSpec = this.e;
        return (installParamSpec == null || installParamSpec.getMarketInfo() == null) ? new MarketInfo() : this.e.getMarketInfo();
    }

    @Override // com.huawei.appgallery.marketinstallerservice.ui.a
    public void c() {
        com.huawei.appgallery.marketinstallerservice.impl.download.a aVar = this.d;
        if (aVar != null) {
            aVar.cancel(true);
        }
    }

    @Override // com.huawei.appgallery.marketinstallerservice.impl.download.a.InterfaceC0059a, com.huawei.appgallery.marketinstallerservice.impl.download.b.a
    public Context b() {
        return this.f1133b;
    }

    @Override // com.huawei.appgallery.marketinstallerservice.impl.download.b.a
    public void a(boolean z) {
        if (z) {
            return;
        }
        a(-2, 0, 0, -10001);
        this.f1132a.a(-2);
    }

    @Override // com.huawei.appgallery.marketinstallerservice.impl.download.a.InterfaceC0059a
    public void a(MarketInfo marketInfo, int i, int i2) {
        InstallParamSpec installParamSpec;
        if (marketInfo == null || (installParamSpec = this.e) == null) {
            a(-4, i, i2);
            this.f1132a.a(-4);
        } else {
            installParamSpec.setMarketInfo(marketInfo);
            this.f1132a.a(marketInfo);
        }
    }

    @Override // com.huawei.appgallery.marketinstallerservice.ui.a
    public void a(InstallParamSpec installParamSpec, String str) {
        this.e = installParamSpec;
        this.f1134c = str;
        if (!biq.d(this.f1133b)) {
            this.f1132a.c();
            return;
        }
        com.huawei.appgallery.marketinstallerservice.impl.download.a aVar = new com.huawei.appgallery.marketinstallerservice.impl.download.a(this, this.e);
        this.d = aVar;
        aVar.execute(new Void[0]);
        this.f1132a.d();
    }

    @Override // com.huawei.appgallery.marketinstallerservice.ui.a
    public void a(int i, int i2, int i3, int i4) {
        bir.e("MarketDownloadPresenter", "notifyResult errorCode" + i + ", responseCode=" + i2 + ", rtnCode=" + i3);
        this.f.setResult(i);
        this.f.setResponseCode(i2);
        this.f.setRtnCode(i3);
        this.f.setReason(i4);
        InstallParamSpec installParamSpec = this.e;
        MarketInfo marketInfo = installParamSpec != null ? installParamSpec.getMarketInfo() : null;
        this.f.setMarketInfo(marketInfo);
        InstallParamSpec installParamSpec2 = this.e;
        if (installParamSpec2 != null && installParamSpec2.getFailResultPromptType() == 2 && (-3 == i || -2 == i)) {
            bir.e("MarketDownloadPresenter", "need show retry dialog!");
        } else {
            InstallCallback installCallbackD = bie.d(this.f1134c);
            if (installCallbackD != null) {
                if (i == 0) {
                    installCallbackD.onSuccess(marketInfo);
                } else {
                    installCallbackD.onFailed(this.f);
                }
                bie.a(this.f1134c);
            }
        }
        File file = new File(bid.c(this.f1133b));
        if (!file.exists() || file.delete()) {
            return;
        }
        bir.e("MarketDownloadPresenter", "delete DownloadFile failed");
    }

    @Override // com.huawei.appgallery.marketinstallerservice.ui.a
    public void a(int i, int i2, int i3) {
        a(i, i2, i3, 0);
    }

    @Override // com.huawei.appgallery.marketinstallerservice.impl.download.a.InterfaceC0059a
    public void a(int i, int i2) {
        if (i == 1) {
            this.f1132a.a(i, i2);
            return;
        }
        if (i != 2) {
            if (i == 3) {
                this.f1132a.a(i, i2);
                h();
                return;
            } else if (i != 4) {
                if (i != 5) {
                    return;
                }
                a(-3, 0, 0, Constant.INSTALL_FAILED_SHA256_EEROR);
                this.f1132a.a(-3);
                return;
            }
        }
        a(-3, 0, 0);
        this.f1132a.a(-3);
    }

    @Override // com.huawei.appgallery.marketinstallerservice.ui.a
    public void a() {
        this.e.setMarketInfo(null);
        a(this.e, this.f1134c);
    }

    private void h() {
        if (b.c(this.f1133b)) {
            new b(this).execute(new Void[0]);
            return;
        }
        try {
            Activity activity = this.f1133b;
            activity.startActivityForResult(b.b(activity), 1000);
        } catch (ActivityNotFoundException unused) {
            bir.d("MarketDownloadPresenter", "startActivityForResult ActivityNotFoundException");
            a(-2, 0, 0);
            this.f1132a.a(-2);
        }
    }

    public biu(Activity activity, com.huawei.appgallery.marketinstallerservice.ui.b bVar) {
        this.f1133b = activity;
        this.f1132a = bVar;
    }
}
