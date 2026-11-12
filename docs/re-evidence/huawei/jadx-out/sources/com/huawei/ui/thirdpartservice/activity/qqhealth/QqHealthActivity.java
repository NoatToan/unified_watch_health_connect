package com.huawei.ui.thirdpartservice.activity.qqhealth;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hwcloudmodel.callback.ICloudOperationResult;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.thirdpartservice.R;
import com.huawei.ui.thirdpartservice.interactors.callback.AuthorizeCallback;
import com.huawei.ui.thirdpartservice.interactors.thirdpartyservice.qqhealth.QqLoginMgr;
import com.huawei.ui.thirdpartservice.interactors.thirdpartyservice.qqhealth.mgr.QqHealthDb;
import com.huawei.ui.thirdpartservice.interactors.thirdpartyservice.qqhealth.mgr.QqHealthTable;
import defpackage.lmf;
import defpackage.qqf;
import defpackage.wyz;
import defpackage.wzd;
import health.compact.a.KeyValDbManager;
import java.util.HashMap;

/* JADX INFO: loaded from: classes20.dex */
public class QqHealthActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthButton f29119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AuthorizeCallback f29120b = new AuthorizeCallback(this) { // from class: com.huawei.ui.thirdpartservice.activity.qqhealth.QqHealthActivity.3
        @Override // com.huawei.ui.thirdpartservice.interactors.callback.AuthorizeCallback
        public void initCallback(boolean z) {
            LogUtil.a("QqHealthActivity", "mAuthorizeCallback.initCallback() isSuccess=", Boolean.valueOf(z));
        }

        @Override // com.huawei.ui.thirdpartservice.interactors.callback.AuthorizeCallback
        public void loginCallback(String str, String str2, String str3) {
            LogUtil.d("QqHealthActivity", "mAuthorizeCallback.loginCallback() success");
        }

        @Override // com.huawei.ui.thirdpartservice.interactors.callback.AuthorizeCallback
        public void logoutCallback(boolean z) {
            LogUtil.a("QqHealthActivity", "mAuthorizeCallback.logoutCallback() isSuccess=", Boolean.valueOf(z));
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f29121c;
    private ImageView d;
    private QqLoginMgr e;
    private HealthTextView g;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f29121c = this;
        LogUtil.a("QqHealthActivity", "enter onCreate()");
        c();
    }

    private void c() {
        setContentView(R.layout.activity_qq_health);
        this.d = (ImageView) findViewById(R.id.qq_health_head_img);
        this.g = (HealthTextView) findViewById(R.id.qq_health_name);
        HealthButton healthButton = (HealthButton) findViewById(R.id.DisconnectQQHealthButton);
        this.f29119a = healthButton;
        healthButton.setOnClickListener(new View.OnClickListener() { // from class: wxf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.e(view);
            }
        });
        QqHealthTable qqHealthTable = new QqHealthDb().get();
        if (qqHealthTable != null) {
            this.g.setText(qqHealthTable.getNickName());
            qqf.e(Uri.parse(qqHealthTable.getQqLogoPath()), this.d);
            return;
        }
        this.d.setImageResource(com.huawei.ui.commonui.R.mipmap.sns_avatar_default);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(View view) {
        c(AnalyticsValue.HEALTH_MINE_SHARE_DATA_QQ_CONNECT_2040036.value(), "1");
        d();
    }

    private void d() {
        LogUtil.a("QqHealthActivity", "enter disconnectQqHealth():");
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(this.f29121c).b(R.string.IDS_qq_health_disconnect_note_content).c(R.string.IDS_qq_health_disconnect_button, new View.OnClickListener() { // from class: wxm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.a(view);
            }
        }).a(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: wxn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LogUtil.a("QqHealthActivity", "user cancel disconnectQqHealth");
            }
        }).c();
        noTitleCustomAlertDialogC.setCancelable(false);
        noTitleCustomAlertDialogC.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        LogUtil.a("QqHealthActivity", "disconnectQqHealth");
        new QqHealthDb().delete();
        HashMap map = new HashMap();
        map.put("thirdAccountType", "7");
        new wzd(Object.class, "/profile/third/cancelAuthorize").d(map, new ICloudOperationResult() { // from class: wxj
            @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
            public final void operationResult(Object obj, String str, boolean z) {
                LogUtil.a("QqHealthActivity", "HwCloudManagerQQ cancelAuthorize() isSuccess = ", Boolean.valueOf(z));
            }
        });
        a(this, this.f29120b);
        QqLoginMgr qqLoginMgr = this.e;
        if (qqLoginMgr != null) {
            qqLoginMgr.logout();
        } else {
            LogUtil.e("QqHealthActivity", "mQqLoginMgr is null! ");
        }
        KeyValDbManager.d(BaseApplication.getContext()).c("third_part_service_qq_health_status", "false", null);
        finish();
        startActivity(new Intent(this.f29121c, (Class<?>) QqHealthConnectActivity.class));
    }

    private void a(Activity activity, AuthorizeCallback authorizeCallback) {
        LogUtil.a("QqHealthActivity", "registerQqLogin enter():");
        if (this.e == null) {
            this.e = new QqLoginMgr(activity, authorizeCallback, wyz.b(1, 20, 1020, 2020));
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        LogUtil.a("QqHealthActivity", "enter onResume():");
        super.onResume();
    }

    private void c(String str, String str2) {
        HashMap map = new HashMap(2);
        map.put("click", "1");
        if (str2 != null) {
            map.put("type", str2);
        }
        lmf.d().c(this.f29121c, str, map, 0);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
