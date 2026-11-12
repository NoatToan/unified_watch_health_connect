package com.huami.midong.webview.ui;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.widget.ProgressBar;
import androidx.appcompat.app.AppCompatActivity;
import com.autonavi.amap.mapcore.AMapEngineUtils;
import com.huami.midong.webview.JsBridgeDelegate;
import com.huami.midong.webview.jsbridge.JsBridgeStatusWebView;
import com.huami.midong.webview.nativejsapi.IJsBridgeTitleCallback;
import com.huami.midong.webview.nativejsapi.JsBridgeNativeAPI;
import com.huami.midong.webview.nativejsapi.jsshare.JSShareCreator;
import com.huami.midong.webview.widget.WebToolBar;
import com.huami.watch.companion.cloud.Cloud;
import com.huami.watch.jsbridge.R;
import com.huami.watch.util.DeviceCompatibility;

/* JADX INFO: loaded from: classes11.dex */
public class JsBridgeActivity extends AppCompatActivity implements IJsBridgeTitleCallback {
    private boolean mNeedSyncUserInfoOnExit;
    private ProgressBar mProgress;
    private JsBridgeStatusWebView mStatusWebView;
    private String mTitle;
    private WebToolBar mTitleBar;

    private void initTitle() {
        this.mProgress = (ProgressBar) findViewById(R.id.web_progress);
        findViewById(R.id.web_no_title_back).setOnClickListener(new View.OnClickListener() { // from class: hj4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.lambda$initTitle$0(view);
            }
        });
        WebToolBar webToolBar = (WebToolBar) findViewById(R.id.web_title_bar);
        this.mTitleBar = webToolBar;
        webToolBar.setTitleCallback(this);
        String stringExtra = getIntent().getStringExtra("title");
        this.mTitle = stringExtra;
        if (TextUtils.isEmpty(stringExtra)) {
            return;
        }
        this.mTitleBar.setTitle(this.mTitle);
    }

    private void initView() {
        this.mStatusWebView = (JsBridgeStatusWebView) findViewById(R.id.js_status_web_view);
        initTitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initTitle$0(View view) {
        onBackPressed();
    }

    public static void load(Context context, String str) {
        load(context, str, false);
    }

    private void loadPage(Intent intent) {
        String stringExtra = intent.getStringExtra("url");
        this.mNeedSyncUserInfoOnExit = intent.getBooleanExtra("needSyncUserInfoOnExit", false);
        this.mStatusWebView.loadPage(stringExtra);
    }

    public void initWeb() {
        this.mStatusWebView.setActivity(this);
        JsBridgeNativeAPI jsBridgeNativeAPI = new JsBridgeNativeAPI(this, this.mStatusWebView.getWeb());
        jsBridgeNativeAPI.setVerifyHost(Cloud.get().getHost());
        jsBridgeNativeAPI.setJsTitleCallback(this);
        jsBridgeNativeAPI.registerAllNativeApi();
        this.mStatusWebView.setTitleCallback(this);
    }

    @Override // com.huami.midong.webview.nativejsapi.IJsBridgeTitleCallback
    public void onBackClick() {
        onBackPressed();
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.mStatusWebView.getWeb().canGoBack()) {
            this.mStatusWebView.getWeb().goBack();
        } else {
            super.onBackPressed();
        }
    }

    @Override // com.huami.midong.webview.nativejsapi.IJsBridgeTitleCallback
    public void onCancelAuth(String str) {
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 19) {
            getWindow().addFlags(AMapEngineUtils.HALF_MAX_P20_WIDTH);
        }
        setContentView(R.layout.activity_js_bridge);
        DeviceCompatibility.setStatusBarDarkMode(this, true);
        initView();
        initTitle();
        initWeb();
        loadPage(getIntent());
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        JsBridgeDelegate.getJsBridgeCallback().exitWeb(this.mNeedSyncUserInfoOnExit);
    }

    @Override // com.huami.midong.webview.nativejsapi.IJsBridgeTitleCallback
    public void onExit() {
        finish();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this.mStatusWebView.onPause();
    }

    @Override // com.huami.midong.webview.nativejsapi.IJsBridgeTitleCallback
    public void onProgressChange(int i) {
        this.mProgress.setProgress(i);
        this.mProgress.setVisibility(i >= 100 ? 8 : 0);
    }

    @Override // com.huami.midong.webview.nativejsapi.IJsBridgeTitleCallback
    public void onRefresh() {
        this.mStatusWebView.getWeb().reload();
    }

    @Override // com.huami.midong.webview.nativejsapi.IJsBridgeTitleCallback
    public void onResize() {
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.mStatusWebView.onResume();
    }

    @Override // com.huami.midong.webview.nativejsapi.IJsBridgeTitleCallback
    public void onShare(Object obj) {
        if (obj == null || !(obj instanceof JSShareCreator.Content)) {
            return;
        }
        JsBridgeDelegate.getJsBridgeCallback().doShare((JSShareCreator.Content) obj);
    }

    @Override // com.huami.midong.webview.nativejsapi.IJsBridgeTitleCallback
    public void setMenu(SparseArray<WebToolBar.MenuData> sparseArray) {
        this.mTitleBar.setMenu(sparseArray);
    }

    @Override // com.huami.midong.webview.nativejsapi.IJsBridgeTitleCallback
    public void setTitleBarBackgroundColor(int i) {
        this.mTitleBar.setBackgroundColor(i);
    }

    @Override // com.huami.midong.webview.nativejsapi.IJsBridgeTitleCallback
    public void setTitleFgColor(int i) {
        this.mTitleBar.setForeground(new ColorDrawable(i));
    }

    @Override // com.huami.midong.webview.nativejsapi.IJsBridgeTitleCallback
    public void setTitleText(String str) {
        if (!TextUtils.isEmpty(this.mTitle) || TextUtils.isEmpty(str)) {
            return;
        }
        this.mTitleBar.setTitle(str);
    }

    @Override // com.huami.midong.webview.nativejsapi.IJsBridgeTitleCallback
    public void setTitleVisibility(boolean z) {
        this.mTitleBar.setVisibility(z ? 0 : 8);
        findViewById(R.id.web_no_title_back).setVisibility(z ? 8 : 0);
    }

    public static void load(Context context, String str, boolean z) {
        load(context, str, "", z);
    }

    public static void load(Context context, String str, String str2) {
        load(context, str, str2, false);
    }

    public static void load(Context context, String str, String str2, boolean z) {
        Intent intent = new Intent(context, (Class<?>) JsBridgeActivity.class);
        intent.putExtra("url", str);
        intent.putExtra("title", str2);
        intent.putExtra("needSyncUserInfoOnExit", z);
        intent.addFlags(268435456);
        context.startActivity(intent);
    }
}
