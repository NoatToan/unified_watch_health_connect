package com.huawei.operation.activity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.operation.adapter.PluginOperationAdapter;
import com.huawei.operation.operation.PluginOperation;
import com.huawei.pluginbase.PluginBaseAdapter;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.switchbutton.HealthSwitchButton;
import health.compact.a.GRSManager;
import health.compact.a.LanguageUtil;
import health.compact.a.SharedPreferenceManager;

/* JADX INFO: loaded from: classes41.dex */
public class AppMarketSettingsActivity extends BaseActivity implements CompoundButton.OnCheckedChangeListener, View.OnClickListener {
    private static final String APP_MARKET_PRIVACY_URL = "/terms/scope/huawei/appgallery-wear/privacy-statement.htm?code=";
    private static final String APP_MARKET_USER_URL = "/terms/scope/huawei/appgallery-wear/terms.htm?code=";
    private static final int GET_APP_MARKET_SEVERCES_STATUS = 8;
    private static final String TAG = "AppMarketSettingsActivity";
    private PluginOperationAdapter mAdapter;
    private String mAppMarketType;
    private LinearLayout mCancelAppMarketService;
    private Context mContext;
    private LinearLayout mPrivacyAgreement;
    private ImageView mPrivacyAgreementImage;
    private ImageView mStopServiceImage;
    private HealthSwitchButton mSwicthWifiUpdate;
    private String mUrl = null;
    private LinearLayout mUserAgreement;
    private ImageView mUserAgreementImage;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_app_market_setings);
        getWindow().clearFlags(1024);
        PluginBaseAdapter adapter = PluginOperation.getInstance(BaseApplication.getContext()).getAdapter();
        this.mAdapter = adapter instanceof PluginOperationAdapter ? (PluginOperationAdapter) adapter : null;
        this.mContext = this;
        getUserAgreementUrl();
        initView();
    }

    public void getUserAgreementUrl() {
        ThreadPoolManager.c().a(TAG, new Runnable() { // from class: com.huawei.operation.activity.AppMarketSettingsActivity.1
            @Override // java.lang.Runnable
            public void run() {
                AppMarketSettingsActivity.this.mUrl = GRSManager.c(BaseApplication.getContext()).getUrl("domainPrivacyLegalCloudHuawei");
            }
        });
    }

    private void initView() {
        this.mSwicthWifiUpdate = (HealthSwitchButton) findViewById(R.id.switch_wifi_update);
        this.mCancelAppMarketService = (LinearLayout) findViewById(R.id.cancel_app_market_service);
        this.mUserAgreement = (LinearLayout) findViewById(R.id.user_agreement);
        this.mPrivacyAgreement = (LinearLayout) findViewById(R.id.privacy_agreement);
        this.mStopServiceImage = (ImageView) findViewById(R.id.stop_service_image);
        this.mUserAgreementImage = (ImageView) findViewById(R.id.user_agreement_image);
        this.mPrivacyAgreementImage = (ImageView) findViewById(R.id.privacy_agreement_image);
        if (LanguageUtil.ba(this.mContext)) {
            this.mStopServiceImage.setImageResource(com.huawei.operation.R.drawable.common_ui_arrow_left);
            this.mUserAgreementImage.setImageResource(com.huawei.operation.R.drawable.common_ui_arrow_left);
            this.mPrivacyAgreementImage.setImageResource(com.huawei.operation.R.drawable.common_ui_arrow_left);
        } else {
            this.mStopServiceImage.setImageResource(com.huawei.operation.R.drawable.common_ui_arrow_right);
            this.mUserAgreementImage.setImageResource(com.huawei.operation.R.drawable.common_ui_arrow_right);
            this.mPrivacyAgreementImage.setImageResource(com.huawei.operation.R.drawable.common_ui_arrow_right);
        }
        this.mSwicthWifiUpdate.setOnCheckedChangeListener(this);
        this.mCancelAppMarketService.setOnClickListener(this);
        this.mUserAgreement.setOnClickListener(this);
        this.mPrivacyAgreement.setOnClickListener(this);
        Intent intent = getIntent();
        if (intent != null) {
            this.mAppMarketType = intent.getStringExtra("app_type");
        }
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        LogUtil.a(TAG, "onCheckedChanged");
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.cancel_app_market_service) {
            showMarketPrivacyDialog();
            return;
        }
        if (view.getId() == R.id.user_agreement) {
            openWebViewActivity(APP_MARKET_USER_URL);
        } else if (view.getId() == R.id.privacy_agreement) {
            openWebViewActivity(APP_MARKET_PRIVACY_URL);
        } else {
            LogUtil.a(TAG, "default");
        }
    }

    private void openWebViewActivity(String str) {
        String str2 = this.mUrl + str + LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1010) + Constants.LANGUAGE + LanguageUtil.a();
        Intent intent = new Intent(this, (Class<?>) WebViewActivity.class);
        intent.putExtra("url", str2);
        startActivity(intent);
    }

    private void showMarketPrivacyDialog() {
        CustomTextAlertDialog.Builder builder = new CustomTextAlertDialog.Builder(this);
        builder.a(R.string.IDS_cancel_app_market_service);
        if (!TextUtils.isEmpty(this.mAppMarketType) && "smart_type".equals(this.mAppMarketType)) {
            builder.b(R.string.IDS_apps_stop_service);
            builder.a(R.string.IDS_ota_update_know, new View.OnClickListener() { // from class: com.huawei.operation.activity.AppMarketSettingsActivity.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    LogUtil.a(AppMarketSettingsActivity.TAG, "showMarketPrivacyDialog click button known");
                }
            });
        } else {
            builder.b(R.string.IDS_cancel_app_market_service_description);
            builder.e(R.string.IDS_settings_button_cancal_ios_btn, new View.OnClickListener() { // from class: com.huawei.operation.activity.AppMarketSettingsActivity.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    LogUtil.a(AppMarketSettingsActivity.TAG, "showMarketPrivacyDialog setNegativeButton");
                }
            });
            builder.a(R.string.IDS_application_market_confirm, new View.OnClickListener() { // from class: com.huawei.operation.activity.AppMarketSettingsActivity.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    LogUtil.a(AppMarketSettingsActivity.TAG, "showMarketPrivacyDialog is true");
                    if (AppMarketSettingsActivity.this.mAdapter != null) {
                        AppMarketSettingsActivity.this.mAdapter.setAppMarketParameter(8, false);
                    }
                    SharedPreferenceManager.c(BaseApplication.getContext(), false);
                    AppMarketSettingsActivity.this.setResult(com.huawei.operation.utils.Constants.REBACK_MARKET_RESULT_CODE);
                    AppMarketSettingsActivity.this.finish();
                }
            });
        }
        CustomTextAlertDialog customTextAlertDialogB = builder.b();
        customTextAlertDialogB.setCancelable(false);
        customTextAlertDialogB.show();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
