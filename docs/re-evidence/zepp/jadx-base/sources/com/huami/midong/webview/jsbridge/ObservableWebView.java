package com.huami.midong.webview.jsbridge;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes11.dex */
public class ObservableWebView extends WebView {
    private OnScrollChangeListener mOnScrollChangedCallback;

    public interface OnScrollChangeListener {
        void onScrollChange(View view, int i, int i2, int i3, int i4);
    }

    public ObservableWebView(Context context) {
        super(context);
    }

    public OnScrollChangeListener getOnScrollChangedCallback() {
        return this.mOnScrollChangedCallback;
    }

    @Override // android.webkit.WebView, android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        OnScrollChangeListener onScrollChangeListener = this.mOnScrollChangedCallback;
        if (onScrollChangeListener != null) {
            onScrollChangeListener.onScrollChange(this, i, i2, i3, i4);
        }
    }

    public void setOnScrollChangedCallback(OnScrollChangeListener onScrollChangeListener) {
        this.mOnScrollChangedCallback = onScrollChangeListener;
    }

    public ObservableWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ObservableWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
