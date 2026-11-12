package com.huawei.ui.thirdpartservice.activity.strava;

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
import com.huawei.ui.thirdpartservice.activity.strava.StravaHealthActivity;
import com.huawei.ui.thirdpartservice.syncdata.callback.ReferenceRevokeOauthCallback;
import defpackage.qpx;
import defpackage.qrs;
import defpackage.xcj;
import health.compact.a.CommonUtil;
import java.util.Locale;

/* JADX INFO: loaded from: classes20.dex */
public class StravaHealthActivity extends BaseActivity {
    private CommonDialog21 e = null;

    public static /* synthetic */ void d(View view) {
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_oauth_connected);
        c();
    }

    private void c() {
        CustomTitleBar customTitleBar = (CustomTitleBar) findViewById(R.id.title_bar);
        ((ImageView) findViewById(R.id.logo_img)).setImageResource(R.mipmap.ic_service_3rd_party_strava);
        HealthTextView healthTextView = (HealthTextView) findViewById(R.id.sport_connected_content);
        String string = getString(R.string.IDS_sync_strava_data_name);
        customTitleBar.setTitleText(string);
        healthTextView.setText(getString(R.string.IDS_sync_fitness_data_connected_content, new Object[]{string}));
        ((HealthButton) findViewById(R.id.health_disconnect_button)).setOnClickListener(new View.OnClickListener() { // from class: wxu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f52582b.c(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(View view) {
        b();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        d();
    }

    private void b() {
        if (qrs.r()) {
            return;
        }
        View viewInflate = LayoutInflater.from(this).inflate(R.layout.dialog_oauth_revoke, (ViewGroup) null);
        ((HealthTextView) viewInflate.findViewById(R.id.oauth_health_dialog_text)).setText(getString(R.string.IDS_sync_fitness_data_unlink_content, new Object[]{getString(R.string.IDS_sync_strava_data_name)}));
        CustomViewDialog.Builder builder = new CustomViewDialog.Builder(this);
        builder.d(viewInflate);
        builder.a(getString(R.string.IDS_sync_fitness_data_unlink));
        builder.a(getString(R.string.IDS_sync_fitness_data_unlink).toUpperCase(Locale.ENGLISH), new View.OnClickListener() { // from class: wxw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f52583b.e(view);
            }
        });
        builder.c(getString(R.string.IDS_hw_common_ui_dialog_cancel).toUpperCase(Locale.ENGLISH), new View.OnClickListener() { // from class: wxx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StravaHealthActivity.d(view);
            }
        });
        builder.d().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(View view) {
        e();
    }

    private void e() {
        LogUtil.e("StravaHealthActivity", "revokeOauth");
        if (!CommonUtil.ab(this)) {
            LogUtil.a("StravaHealthActivity", "Network is not Connected ");
            qpx.b(this, R.string.IDS_connect_network);
        } else {
            a();
            xcj.c().revokeOauth(new b(this));
        }
    }

    private void a() {
        LogUtil.a("StravaHealthActivity", "showWaitingDialog: mLoadDataDialog ");
        if (this.e != null) {
            return;
        }
        if (isFinishing()) {
            LogUtil.a("StravaHealthActivity", "showWaitingDialog: isFinishing...");
            return;
        }
        CommonDialog21 commonDialog21B = CommonDialog21.b(this);
        this.e = commonDialog21B;
        commonDialog21B.b(getString(R.string.IDS_sns_waiting));
        this.e.setCancelable(false);
        this.e.c();
        this.e.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        LogUtil.a("StravaHealthActivity", "closeLoadDataDialog: mLoadDataDialog = ", this.e);
        CommonDialog21 commonDialog21 = this.e;
        if (commonDialog21 != null) {
            commonDialog21.dismiss();
            this.e = null;
        }
    }

    public static class b extends ReferenceRevokeOauthCallback<StravaHealthActivity> {
        b(StravaHealthActivity stravaHealthActivity) {
            super(stravaHealthActivity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.ui.thirdpartservice.syncdata.callback.ReferenceRevokeOauthCallback
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void revokeResultWhenReferenceNotNull(final StravaHealthActivity stravaHealthActivity, final boolean z, final boolean z2, final String str) {
            stravaHealthActivity.runOnUiThread(new Runnable() { // from class: wxy
                @Override // java.lang.Runnable
                public final void run() {
                    StravaHealthActivity.b.c(stravaHealthActivity, z, z2, str);
                }
            });
        }

        public static /* synthetic */ void c(StravaHealthActivity stravaHealthActivity, boolean z, boolean z2, String str) {
            stravaHealthActivity.d();
            if (!z) {
                qpx.e(stravaHealthActivity, R.string.IDS_network_connect_error);
            } else if (z2) {
                stravaHealthActivity.startActivity(new Intent(stravaHealthActivity, (Class<?>) StravaConnectActivity.class));
                stravaHealthActivity.finish();
            } else {
                qpx.b(stravaHealthActivity, str);
            }
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
