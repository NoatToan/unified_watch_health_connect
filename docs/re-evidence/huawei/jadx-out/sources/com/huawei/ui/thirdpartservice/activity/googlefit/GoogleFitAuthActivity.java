package com.huawei.ui.thirdpartservice.activity.googlefit;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.fitness.Fitness;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.thirdpartservice.R;
import defpackage.qpx;
import defpackage.wzu;
import health.compact.a.CommonUtil;

/* JADX INFO: loaded from: classes20.dex */
public class GoogleFitAuthActivity extends BaseActivity implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener, View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthButton f29094a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private GoogleApiClient f29096c;
    private Context d;
    private HealthTextView e;
    private HealthTextView f;
    private boolean h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f29095b = 1;
    private Handler j = new Handler() { // from class: com.huawei.ui.thirdpartservice.activity.googlefit.GoogleFitAuthActivity.2
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what != 11) {
                return;
            }
            GoogleFitAuthActivity.this.e();
        }
    };

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LogUtil.d("GoogleFitAuthActivity", "onCreate");
        setContentView(R.layout.activity_google_access);
        this.d = this;
        b();
    }

    private void b() {
        HealthButton healthButton = (HealthButton) findViewById(R.id.google_fit_open_button);
        this.f29094a = healthButton;
        healthButton.setOnClickListener(this);
        HealthTextView healthTextView = (HealthTextView) findViewById(R.id.google_fit_guide_describe);
        this.e = healthTextView;
        healthTextView.setText(R.string.IDS_google_fit_welcome_guide_text_hw);
        this.f = (HealthTextView) findViewById(R.id.google_fit_guide_note);
        this.f.setText(String.format(getResources().getString(R.string.IDS_google_fit_welcome_guide_description), 1, 2));
        this.f29094a.setText(R.string.IDS_btsdk_confirm_connect);
        this.f29094a.setEnabled(true);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        LogUtil.d("GoogleFitAuthActivity", "onResume()");
        d();
        e();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        LogUtil.d("GoogleFitAuthActivity", "onClick");
        if (view.getId() == R.id.google_fit_open_button) {
            if (!CommonUtil.ab(this.d)) {
                qpx.e(this.d, R.string.IDS_connect_network);
            } else if (!e(this.d)) {
                LogUtil.d("GoogleFitAuthActivity", "no google service");
            } else {
                a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        boolean zE = wzu.a().e();
        this.h = zE;
        LogUtil.d("GoogleFitAuthActivity", "initGoogleFitView() isConnect = ", Boolean.valueOf(zE));
        if (this.h) {
            this.f29094a.setText(R.string.IDS_qq_health_disconnect_button);
            this.f29095b = 2;
        } else {
            this.f29094a.setText(R.string.IDS_btsdk_confirm_connect);
            this.f29095b = 1;
        }
    }

    private void a() {
        int i = this.f29095b;
        if (i == 1) {
            LogUtil.d("GoogleFitAuthActivity", "STATUS_NOT_CONNECTED");
            startActivity(new Intent(this.d, (Class<?>) GoogleFitConnectActivity.class));
        } else {
            if (i == 2) {
                wzu.a().b(false);
                e();
                LogUtil.d("GoogleFitAuthActivity", "mGoogleApiClient.isConnected()", Boolean.valueOf(this.f29096c.isConnected()));
                if (this.f29096c.isConnected()) {
                    this.f29096c.clearDefaultAccountAndReconnect();
                    return;
                }
                return;
            }
            LogUtil.d("GoogleFitAuthActivity", "pressClickButton mButtonStatus=", Integer.valueOf(i));
        }
    }

    private boolean e(Context context) {
        int iIsGooglePlayServicesAvailable = GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context);
        if (iIsGooglePlayServicesAvailable == 0) {
            return true;
        }
        if (GoogleApiAvailability.getInstance().isUserResolvableError(iIsGooglePlayServicesAvailable) && (context instanceof Activity)) {
            GoogleApiAvailability.getInstance().getErrorDialog((Activity) context, iIsGooglePlayServicesAvailable, 0).show();
        }
        LogUtil.a("GoogleFitAuthActivity", "error=", GoogleApiAvailability.getInstance().getErrorString(iIsGooglePlayServicesAvailable));
        return false;
    }

    private void d() {
        LogUtil.d("GoogleFitAuthActivity", "connectGoogleFit");
        GoogleApiClient googleApiClientBuild = new GoogleApiClient.Builder(this).addApi(Fitness.HISTORY_API).addScope(new Scope(Scopes.FITNESS_ACTIVITY_READ_WRITE)).addScope(new Scope(Scopes.FITNESS_BODY_READ_WRITE)).addScope(new Scope(Scopes.FITNESS_LOCATION_READ_WRITE)).addScope(new Scope(Scopes.CLOUD_SAVE)).addConnectionCallbacks(this).addOnConnectionFailedListener(this).build();
        this.f29096c = googleApiClientBuild;
        googleApiClientBuild.connect();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        LogUtil.d("GoogleFitAuthActivity", "onStart");
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        LogUtil.d("GoogleFitAuthActivity", "onStop");
        this.f29096c.disconnect();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        LogUtil.d("GoogleFitAuthActivity", "onDestroy");
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks
    public void onConnected(Bundle bundle) {
        LogUtil.a("GoogleFitAuthActivity", "Connected!!!");
        wzu.a().b(true);
        this.f29095b = 2;
        this.j.sendEmptyMessage(11);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks
    public void onConnectionSuspended(int i) {
        LogUtil.d("GoogleFitAuthActivity", "onConnectionSuspended");
        wzu.a().b(false);
        this.f29095b = 1;
        this.j.sendEmptyMessage(11);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener
    public void onConnectionFailed(ConnectionResult connectionResult) {
        LogUtil.d("GoogleFitAuthActivity", "onConnectionFailed");
        wzu.a().b(false);
        this.f29095b = 1;
        this.j.sendEmptyMessage(11);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
