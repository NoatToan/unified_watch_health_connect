package com.huawei.openalliance.ad.activity;

import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Bundle;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.openalliance.ad.R;
import com.huawei.openalliance.ad.constant.JsbMapKeyNames;
import com.huawei.openalliance.ad.constant.MapKeyNames;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.ud;
import com.huawei.openalliance.ad.uk;
import com.huawei.openalliance.ad.utils.bk;
import com.huawei.ui.commonui.base.BaseDialog;

/* JADX INFO: loaded from: classes12.dex */
public class PPSShareActivity extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ud f18183b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f18182a = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final DialogInterface.OnDismissListener f18184c = new DialogInterface.OnDismissListener() { // from class: com.huawei.openalliance.ad.activity.PPSShareActivity.1
        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            PPSShareActivity.this.finish();
        }
    };

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.openalliance.ad.activity.f, android.app.Activity
    public void onResume() {
        super.onResume();
        hw.b("PPSShareActivity", BaseDialog.LIFE_CYCLE_ON_RESUME);
        if (this.f18182a) {
            this.f18182a = false;
            return;
        }
        ud udVar = this.f18183b;
        if (udVar != null) {
            udVar.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.openalliance.ad.activity.f, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ud udVar = this.f18183b;
        if (udVar != null) {
            udVar.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.openalliance.ad.activity.e, com.huawei.openalliance.ad.activity.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        hw.b("PPSShareActivity", "onCreate");
        super.onCreate(bundle);
        uk ukVarB = b();
        if (ukVarB == null) {
            finish();
            return;
        }
        ud udVar = new ud(this, ukVarB);
        this.f18183b = udVar;
        udVar.a();
        this.f18183b.a(this.f18184c);
        new com.huawei.openalliance.ad.analysis.c(getApplicationContext()).a("shareClick", ukVarB.f());
    }

    @Override // com.huawei.openalliance.ad.activity.f, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
        ud udVar = this.f18183b;
        if (udVar != null) {
            udVar.b();
        }
    }

    @Override // com.huawei.openalliance.ad.activity.e
    protected void a() {
        setContentView(R.layout.hiad_activity_share);
    }

    private uk b() {
        SafeIntent safeIntent = (SafeIntent) getIntent();
        try {
            uk ukVar = new uk(safeIntent.getStringExtra("title"), safeIntent.getStringExtra("description"), safeIntent.getStringExtra("imageUrl"), safeIntent.getStringExtra(JsbMapKeyNames.H5_CSHARE_URL));
            ukVar.a(getPackageManager().getApplicationInfo(getPackageName(), 0).icon);
            ukVar.a((ContentRecord) bk.b(safeIntent.getStringExtra(MapKeyNames.CONTENT_RECORD), ContentRecord.class, new Class[0]));
            return ukVar;
        } catch (RuntimeException e) {
            hw.c("PPSShareActivity", "getIntentParams runtime exception: %s", e.getClass().getSimpleName());
            return null;
        } catch (Throwable th) {
            hw.c("PPSShareActivity", "getIntentParams error: %s", th.getClass().getSimpleName());
            return null;
        }
    }
}
