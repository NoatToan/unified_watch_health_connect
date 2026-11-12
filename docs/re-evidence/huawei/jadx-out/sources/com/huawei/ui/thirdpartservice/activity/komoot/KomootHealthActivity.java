package com.huawei.ui.thirdpartservice.activity.komoot;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.dialog.CommonDialog21;
import com.huawei.ui.commonui.dialog.CustomViewDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.thirdpartservice.R;
import com.huawei.ui.thirdpartservice.syncdata.callback.ReferenceRevokeOauthCallback;
import defpackage.qpx;
import defpackage.qrs;
import defpackage.xbp;
import health.compact.a.CommonUtil;
import java.util.Locale;

/* JADX INFO: loaded from: classes20.dex */
public class KomootHealthActivity extends BaseActivity {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthButton f29115c;
    private CommonDialog21 d = null;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_oauth_connected);
        d();
    }

    private void d() {
        CustomTitleBar customTitleBar = (CustomTitleBar) findViewById(R.id.title_bar);
        ((ImageView) findViewById(R.id.logo_img)).setImageResource(R.mipmap.ic_service_3rd_party_komoot);
        HealthTextView healthTextView = (HealthTextView) findViewById(R.id.sport_connected_content);
        String string = getString(R.string.IDS_sync_fitness_data_komoot_name);
        customTitleBar.setTitleText(string);
        healthTextView.setText(getString(R.string.IDS_sync_fitness_data_connected_content, new Object[]{string}));
        HealthButton healthButton = (HealthButton) findViewById(R.id.health_disconnect_button);
        this.f29115c = healthButton;
        healthButton.setOnClickListener(new View.OnClickListener() { // from class: wxg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.b(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        b();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        e();
    }

    private void b() {
        if (qrs.r()) {
            return;
        }
        View viewInflate = LayoutInflater.from(this).inflate(R.layout.dialog_oauth_revoke, (ViewGroup) null);
        ((HealthTextView) viewInflate.findViewById(R.id.oauth_health_dialog_text)).setText(getString(R.string.IDS_sync_fitness_data_unlink_content, new Object[]{getString(R.string.IDS_sync_fitness_data_komoot_name)}));
        CustomViewDialog.Builder builder = new CustomViewDialog.Builder(this);
        builder.d(viewInflate);
        builder.a(getString(R.string.IDS_sync_fitness_data_unlink));
        builder.a(getString(R.string.IDS_sync_fitness_data_unlink).toUpperCase(Locale.ENGLISH), new View.OnClickListener() { // from class: com.huawei.ui.thirdpartservice.activity.komoot.KomootHealthActivity.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                KomootHealthActivity.this.a();
            }
        });
        builder.c(getString(R.string.IDS_hw_common_ui_dialog_cancel).toUpperCase(Locale.ENGLISH), new View.OnClickListener(this) { // from class: com.huawei.ui.thirdpartservice.activity.komoot.KomootHealthActivity.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        });
        builder.d().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        LogUtil.e("KomootHealthActivity", "revokeOauth");
        if (!CommonUtil.ab(this)) {
            LogUtil.a("KomootHealthActivity", "Network is not Connected ");
            qpx.b(this, R.string.IDS_connect_network);
        } else {
            c();
            xbp.b().revokeOauth(new d(this));
        }
    }

    private void c() {
        LogUtil.a("KomootHealthActivity", "showWaitingDialog: mLoadDataDialog ");
        if (this.d != null) {
            return;
        }
        if (isFinishing()) {
            LogUtil.a("KomootHealthActivity", "showWaitingDialog: isFinishing...");
            return;
        }
        CommonDialog21 commonDialog21B = CommonDialog21.b(this);
        this.d = commonDialog21B;
        commonDialog21B.b(getString(R.string.IDS_sns_waiting));
        this.d.setCancelable(false);
        this.d.c();
        this.d.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        LogUtil.a("KomootHealthActivity", "closeLoadDataDialog: mLoadDataDialog = ", this.d);
        CommonDialog21 commonDialog21 = this.d;
        if (commonDialog21 != null) {
            commonDialog21.dismiss();
            this.d = null;
        }
    }

    static class d extends ReferenceRevokeOauthCallback<KomootHealthActivity> {
        d(KomootHealthActivity komootHealthActivity) {
            super(komootHealthActivity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.ui.thirdpartservice.syncdata.callback.ReferenceRevokeOauthCallback
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void revokeResultWhenReferenceNotNull(final KomootHealthActivity komootHealthActivity, final boolean z, final boolean z2, final String str) {
            komootHealthActivity.runOnUiThread(new Runnable(this) { // from class: com.huawei.ui.thirdpartservice.activity.komoot.KomootHealthActivity.d.2
                @Override // java.lang.Runnable
                public void run() {
                    komootHealthActivity.e();
                    if (!z) {
                        qpx.e(komootHealthActivity, R.string.IDS_network_connect_error);
                    } else {
                        if (z2) {
                            komootHealthActivity.startActivity(new Intent(komootHealthActivity, (Class<?>) KomootConnectActivity.class));
                            komootHealthActivity.finish();
                            return;
                        }
                        qpx.b(komootHealthActivity, str);
                    }
                }
            });
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
