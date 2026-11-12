package com.mipay.sdk.app;

import android.content.Intent;
import android.webkit.WebView;
import androidx.appcompat.app.AppCompatActivity;
import com.miuipub.internal.hybrid.HybridManager;
import com.miuipub.internal.hybrid.JsInterface;
import com.miuipub.internal.hybrid.MiuiJsInterface;
import miuipub.hybrid.PageContext;

/* JADX INFO: loaded from: classes.dex */
public class MipayHybridActivity extends AppCompatActivity {
    private HybridManager mHybridManager;

    public String getUrl() {
        PageContext pageContext = this.mHybridManager.getPageContext();
        return pageContext == null ? "" : pageContext.getUrl();
    }

    public void initHybridInterface(WebView webView) {
        HybridManager hybridManager = new HybridManager(this, webView);
        this.mHybridManager = hybridManager;
        webView.addJavascriptInterface(new JsInterface(hybridManager), JsInterface.INTERFACE_NAME);
        webView.addJavascriptInterface(new MiuiJsInterface(this.mHybridManager), MiuiJsInterface.INTERFACE_NAME);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.mHybridManager.onActivityResult(i, i2, intent);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.mHybridManager.onDestroy();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this.mHybridManager.onPause();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        this.mHybridManager.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.mHybridManager.onResume();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        this.mHybridManager.onStart();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        this.mHybridManager.onStop();
    }

    public void setPageContext(PageContext pageContext) {
        this.mHybridManager.setPageContext(pageContext);
    }
}
