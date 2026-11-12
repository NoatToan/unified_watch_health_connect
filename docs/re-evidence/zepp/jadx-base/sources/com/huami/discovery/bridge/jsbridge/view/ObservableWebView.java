package com.huami.discovery.bridge.jsbridge.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import com.huami.discovery.bridge.compat.LollipopFixedWebView;

/* JADX INFO: loaded from: classes8.dex */
public class ObservableWebView extends LollipopFixedWebView {
    private OnScrollChangeListener a;

    public interface OnScrollChangeListener {
        void onScrollChange(View view, int i, int i2, int i3, int i4);
    }

    public ObservableWebView(Context context) {
        super(context);
    }

    public OnScrollChangeListener getOnScrollChangedCallback() {
        return this.a;
    }

    @Override // android.webkit.WebView, android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        OnScrollChangeListener onScrollChangeListener = this.a;
        if (onScrollChangeListener != null) {
            onScrollChangeListener.onScrollChange(this, i, i2, i3, i4);
        }
    }

    public void setOnScrollChangedCallback(OnScrollChangeListener onScrollChangeListener) {
        this.a = onScrollChangeListener;
    }

    @Override // android.webkit.WebView, android.view.View
    public void setOverScrollMode(int i) throws Exception {
        try {
            super.setOverScrollMode(i);
        } catch (Exception e) {
            String stackTraceString = Log.getStackTraceString(e);
            if (!stackTraceString.contains("android.content.pm.PackageManager$NameNotFoundException") && !stackTraceString.contains("java.lang.RuntimeException: Cannot load WebView") && !stackTraceString.contains("android.webkit.WebViewFactory$MissingWebViewPackageException: Failed to load WebView provider: No WebView installed")) {
                throw e;
            }
            e.printStackTrace();
        }
    }

    public ObservableWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ObservableWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
