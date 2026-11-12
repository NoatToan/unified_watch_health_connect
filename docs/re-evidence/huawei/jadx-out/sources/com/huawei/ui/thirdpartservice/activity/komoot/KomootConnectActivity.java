package com.huawei.ui.thirdpartservice.activity.komoot;

import android.content.Intent;
import android.content.res.Configuration;
import android.view.View;
import android.widget.ImageView;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.thirdpartservice.R;
import com.huawei.ui.thirdpartservice.activity.BaseConnectActivity;
import com.huawei.ui.thirdpartservice.syncdata.constants.KomootOauthConstant;
import com.huawei.ui.thirdpartservice.syncdata.constants.SyncDataConstant;
import com.huawei.ui.thirdpartservice.syncdata.oauth.OauthManager;
import defpackage.wxi;
import defpackage.xbp;

/* JADX INFO: loaded from: classes3.dex */
public class KomootConnectActivity extends BaseConnectActivity {
    @Override // com.huawei.ui.thirdpartservice.activity.BaseConnectActivity
    public void initView() {
        String string = getString(R.string.IDS_sync_fitness_data_komoot_name);
        ((CustomTitleBar) findViewById(R.id.title_bar)).setTitleText(string);
        ((ImageView) findViewById(R.id.logo_img)).setImageResource(R.mipmap.ic_service_3rd_party_komoot);
        ((HealthTextView) findViewById(R.id.sport_connect_content)).setText(getString(R.string.IDS_sync_fitness_data_komoot_content, new Object[]{string, string, string}));
        ((HealthTextView) findViewById(R.id.sport_connect_content1)).setText(getString(R.string.IDS_sync_fitness_data_connect_content1, new Object[]{1, string}));
        ((HealthTextView) findViewById(R.id.sport_connect_content2)).setText(getString(R.string.IDS_sync_fitness_data_connect_content4, new Object[]{2, string, string}));
        ((HealthTextView) findViewById(R.id.sport_connect_content3)).setText(getString(R.string.IDS_sync_fitness_data_connect_content5, new Object[]{3, string}));
        ((HealthTextView) findViewById(R.id.sport_connect_content4)).setText(getString(R.string.IDS_sync_fitness_data_connect_content2, new Object[]{4, string}));
        ((HealthTextView) findViewById(R.id.sport_connect_content5)).setText(getString(R.string.IDS_sync_fitness_data_connect_content3, new Object[]{5, string}));
        HealthButton healthButton = (HealthButton) findViewById(R.id.health_connect_button);
        healthButton.setText(R.string.IDS_sync_fitness_data_link_komoot);
        healthButton.setOnClickListener(new View.OnClickListener() { // from class: wxh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f52576b.b(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        openOauthPage();
    }

    @Override // com.huawei.ui.thirdpartservice.activity.BaseConnectActivity
    public String getAccountType() {
        return SyncDataConstant.BI_VALUE_ACCOUNT_TYPE_KOMMOT;
    }

    @Override // com.huawei.ui.thirdpartservice.activity.BaseConnectActivity
    public String getGrsKey() {
        return "domain_komoot_oauth";
    }

    @Override // com.huawei.ui.thirdpartservice.activity.BaseConnectActivity
    public String getAuthorizationUrl() {
        return KomootOauthConstant.KOMOOT_AUTHORIZATION_URL;
    }

    @Override // com.huawei.ui.thirdpartservice.activity.BaseConnectActivity
    public String getTag() {
        return "KomootConnectActivity";
    }

    @Override // com.huawei.ui.thirdpartservice.activity.BaseConnectActivity
    public String getClientId() {
        return KomootOauthConstant.KOMOOT_CLIENT_ID;
    }

    @Override // com.huawei.ui.thirdpartservice.activity.BaseConnectActivity
    public String getRedirectUri() {
        return KomootOauthConstant.KOMOOT_REDIRECT_URI;
    }

    @Override // com.huawei.ui.thirdpartservice.activity.BaseConnectActivity
    public OauthManager createOauthManager() {
        return xbp.b();
    }

    @Override // com.huawei.ui.thirdpartservice.activity.BaseConnectActivity
    public void checkConnectStatus() {
        xbp.b().checkConnectStatus(new wxi(this));
    }

    @Override // com.huawei.ui.thirdpartservice.activity.BaseConnectActivity
    public Intent createDisconnectIntent() {
        return new Intent(this, (Class<?>) KomootHealthActivity.class);
    }

    @Override // com.huawei.ui.thirdpartservice.activity.BaseConnectActivity
    public void checkSupport(BaseConnectActivity.CheckSupportCallBack checkSupportCallBack) {
        super.checkSupport(checkSupportCallBack);
        checkSupportCallBack.checkResult(String.valueOf(7).equals(LoginInit.getInstance(this).getAccountInfo(1009)));
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
