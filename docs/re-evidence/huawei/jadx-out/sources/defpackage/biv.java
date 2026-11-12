package defpackage;

import android.content.Context;
import com.huawei.appgallery.marketinstallerservice.api.Constant;
import com.huawei.appgallery.marketinstallerservice.api.FailResultParam;
import com.huawei.appgallery.marketinstallerservice.api.InstallCallback;
import com.huawei.appgallery.marketinstallerservice.api.InstallParamSpec;
import com.huawei.appgallery.marketinstallerservice.api.MarketInfo;
import com.huawei.appgallery.marketinstallerservice.impl.download.a;
import com.huawei.appgallery.marketinstallerservice.impl.download.b;
import java.io.File;

/* JADX INFO: loaded from: classes23.dex */
public class biv implements a.InterfaceC0059a, b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InstallCallback f1135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InstallParamSpec f1136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f1137c;
    private String d = "";
    private FailResultParam e = new FailResultParam();
    private a i;

    @Override // com.huawei.appgallery.marketinstallerservice.impl.download.a.InterfaceC0059a, com.huawei.appgallery.marketinstallerservice.impl.download.b.a
    public Context b() {
        return this.f1137c;
    }

    @Override // com.huawei.appgallery.marketinstallerservice.impl.download.b.a
    public void a(boolean z) {
        if (z) {
            return;
        }
        this.e.setResult(-2);
        this.e.setReason(-10001);
        c();
        bie.c(this.d);
        bie.a(this.d);
    }

    @Override // com.huawei.appgallery.marketinstallerservice.impl.download.a.InterfaceC0059a
    public void a(MarketInfo marketInfo, int i, int i2) {
        this.e.setResponseCode(i);
        this.e.setRtnCode(i2);
        this.f1136b.setMarketInfo(marketInfo);
        if (marketInfo == null) {
            this.e.setResult(-4);
            c();
        }
    }

    @Override // com.huawei.appgallery.marketinstallerservice.impl.download.a.InterfaceC0059a
    public void a(int i, int i2) {
        if (i != 2) {
            if (i == 3) {
                a();
                return;
            } else if (i != 4) {
                if (i != 5) {
                    return;
                }
                this.e.setReason(Constant.INSTALL_FAILED_SHA256_EEROR);
                this.e.setResult(-3);
                return;
            }
        }
        this.e.setResult(-3);
        c();
    }

    public void d() {
        if (!biq.d(this.f1137c)) {
            this.e.setResult(-1);
            c();
        } else {
            a aVar = new a(this, this.f1136b);
            this.i = aVar;
            aVar.execute(new Void[0]);
        }
    }

    private void a() {
        if (!b.c(this.f1137c)) {
            this.e.setResult(-2);
            c();
        } else {
            String strB = bie.b(this.f1135a);
            this.d = strB;
            bie.c(strB, this.f1136b.getMarketInfo());
            new b(this, this.f1136b, this.d).execute(new Void[0]);
        }
    }

    private void c() {
        this.e.setMarketInfo(this.f1136b.getMarketInfo());
        InstallCallback installCallback = this.f1135a;
        if (installCallback != null) {
            installCallback.onFailed(this.e);
        }
        File file = new File(bid.c(this.f1137c));
        if (!file.exists() || file.delete()) {
            return;
        }
        bir.e("SilentDownloadManager", "delete DownloadFile failed");
    }

    public biv(Context context, InstallParamSpec installParamSpec, InstallCallback installCallback) {
        this.f1137c = context;
        this.f1136b = installParamSpec;
        this.f1135a = installCallback;
    }
}
