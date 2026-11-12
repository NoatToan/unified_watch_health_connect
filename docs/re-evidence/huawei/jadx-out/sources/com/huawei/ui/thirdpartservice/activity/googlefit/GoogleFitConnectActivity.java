package com.huawei.ui.thirdpartservice.activity.googlefit;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.fitness.Fitness;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseDialog;
import com.huawei.ui.thirdpartservice.R;
import defpackage.qpx;
import defpackage.wzu;

/* JADX INFO: loaded from: classes20.dex */
public class GoogleFitConnectActivity extends FragmentActivity implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f29098b;
    private GoogleApiClient e;

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LogUtil.d("GoogleFitConnectActivity", "onCreate");
        this.f29098b = this;
        a();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        LogUtil.d("GoogleFitConnectActivity", BaseDialog.LIFE_CYCLE_ON_RESUME);
        GoogleApiClient googleApiClient = this.e;
        if (googleApiClient != null) {
            LogUtil.d("GoogleFitConnectActivity", "mGoogleApiClient.isConnected()", Boolean.valueOf(googleApiClient.isConnected()), " isConnecting()", Boolean.valueOf(this.e.isConnecting()));
            if (this.e.isConnecting() || this.e.isConnected()) {
                return;
            }
            finish();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        LogUtil.d("GoogleFitConnectActivity", "onStart");
        GoogleApiClient googleApiClient = this.e;
        if (googleApiClient != null) {
            googleApiClient.connect();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        LogUtil.d("GoogleFitConnectActivity", "onStop");
        GoogleApiClient googleApiClient = this.e;
        if (googleApiClient != null) {
            googleApiClient.disconnect();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        LogUtil.d("GoogleFitConnectActivity", "nDestroy");
    }

    private void a() {
        LogUtil.d("GoogleFitConnectActivity", "connectGoogleFit");
        if (this.e == null) {
            LogUtil.d("GoogleFitConnectActivity", "mGoogleApiClient=null");
            GoogleApiClient googleApiClientBuild = new GoogleApiClient.Builder(this).addApi(Fitness.HISTORY_API).addScope(new Scope(Scopes.FITNESS_ACTIVITY_READ_WRITE)).addScope(new Scope(Scopes.FITNESS_BODY_READ_WRITE)).addScope(new Scope(Scopes.FITNESS_LOCATION_READ_WRITE)).addScope(new Scope(Scopes.CLOUD_SAVE)).addConnectionCallbacks(this).enableAutoManage(this, 0, this).build();
            this.e = googleApiClientBuild;
            googleApiClientBuild.connect();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks
    public void onConnected(Bundle bundle) {
        LogUtil.d("GoogleFitConnectActivity", "onConnected");
        wzu.a().b(true);
        qpx.e(this.f29098b, R.string.IDS_myfitnesspal_login);
        finish();
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks
    public void onConnectionSuspended(int i) {
        LogUtil.d("GoogleFitConnectActivity", "onConnectionSuspended");
        wzu.a().b(false);
        finish();
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener
    public void onConnectionFailed(ConnectionResult connectionResult) {
        LogUtil.d("GoogleFitConnectActivity", "onConnectionFailed");
        wzu.a().b(false);
        finish();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
