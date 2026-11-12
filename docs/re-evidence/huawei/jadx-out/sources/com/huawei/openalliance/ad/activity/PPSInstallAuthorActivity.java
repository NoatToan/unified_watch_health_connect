package com.huawei.openalliance.ad.activity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.openalliance.ad.R;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.utils.ac;
import com.huawei.openalliance.ad.utils.bk;
import com.huawei.openalliance.ad.views.interfaces.g;

/* JADX INFO: loaded from: classes12.dex */
public class PPSInstallAuthorActivity extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static g f18162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f18163b;

    @Override // com.huawei.openalliance.ad.activity.f, android.app.Activity
    protected void onNewIntent(Intent intent) {
        hw.b("PPSInstallAuthorActivity", "onNewIntent");
        super.onNewIntent(intent);
        a(intent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.openalliance.ad.activity.f, android.app.Activity
    public void onDestroy() {
        e();
        super.onDestroy();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.openalliance.ad.activity.e, com.huawei.openalliance.ad.activity.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        hw.b("PPSInstallAuthorActivity", "onCreate");
        a(getIntent());
    }

    @Override // com.huawei.openalliance.ad.activity.f, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }

    @Override // com.huawei.openalliance.ad.activity.e
    protected void a() {
        setContentView(R.layout.hiad_activity_install_author);
    }

    private static void e() {
        f18162a = null;
    }

    static /* synthetic */ int c() {
        int i = f18163b;
        f18163b = i - 1;
        return i;
    }

    public static void a(g gVar) {
        if (gVar == null) {
            hw.c("PPSInstallAuthorActivity", "registerInstallListener is null");
        } else {
            f18162a = gVar;
        }
    }

    private void a(Intent intent) {
        final ContentRecord contentRecord = (ContentRecord) bk.b(new SafeIntent(intent).getStringExtra(Constants.CONTENT_KEY), ContentRecord.class, new Class[0]);
        if (contentRecord == null) {
            hw.c("PPSInstallAuthorActivity", "init failed! contentRecord is null");
            finish();
            return;
        }
        f18163b++;
        hw.a("PPSInstallAuthorActivity", "showDialogCnt is:" + f18163b);
        ac.a(this, contentRecord, new com.huawei.openalliance.ad.download.app.a.InterfaceC0200a() { // from class: com.huawei.openalliance.ad.activity.PPSInstallAuthorActivity.1
            @Override // com.huawei.openalliance.ad.download.app.a.InterfaceC0200a
            public void b() {
                PPSInstallAuthorActivity.c();
                if (PPSInstallAuthorActivity.f18163b <= 0) {
                    int unused = PPSInstallAuthorActivity.f18163b = 0;
                    hw.a("PPSInstallAuthorActivity", "close activity");
                    PPSInstallAuthorActivity.this.finish();
                }
            }

            @Override // com.huawei.openalliance.ad.download.app.a.InterfaceC0200a
            public void a() {
                hw.b("PPSInstallAuthorActivity", "continue install");
                if (PPSInstallAuthorActivity.f18162a != null) {
                    PPSInstallAuthorActivity.f18162a.a(com.huawei.openalliance.ad.download.app.e.h().a(contentRecord.ag().getPackageName()));
                }
            }
        });
    }
}
