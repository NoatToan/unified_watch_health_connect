package com.huami.midong.webview.jsbridge;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.core.net.MailTo;
import com.huami.midong.webview.ui.JsBridgeActivity;
import com.huami.watch.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
public class JsBridgeWebViewClient extends WebViewClient {
    private static final String TAG = "JsBridgeWebViewClient";
    private static String sJs = "";
    private final JsBridgeWebView webView;

    public JsBridgeWebViewClient(Context context, JsBridgeWebView jsBridgeWebView) {
        this.webView = jsBridgeWebView;
        synchronized (this) {
            if (TextUtils.isEmpty(sJs)) {
                sJs = getLocalJs(context);
            }
        }
    }

    private String getLocalJs(Context context) {
        InputStream inputStreamOpen = null;
        try {
            try {
                inputStreamOpen = context.getAssets().open("HM_JsBridge.js");
                byte[] bArr = new byte[inputStreamOpen.available()];
                inputStreamOpen.read(bArr);
                String str = new String(bArr, "UTF-8");
                try {
                    inputStreamOpen.close();
                } catch (IOException unused) {
                }
                return str;
            } catch (IOException e) {
                Log.e(TAG, e.getMessage(), e, new Object[0]);
                if (inputStreamOpen == null) {
                    return "";
                }
                try {
                    inputStreamOpen.close();
                    return "";
                } catch (IOException unused2) {
                    return "";
                }
            }
        } catch (Throwable th) {
            if (inputStreamOpen != null) {
                try {
                    inputStreamOpen.close();
                } catch (IOException unused3) {
                }
            }
            throw th;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        if (!TextUtils.isEmpty(sJs)) {
            this.webView.loadUrl("javascript:" + sJs);
        }
        if (this.webView.getStartupMessage() != null) {
            Iterator<JsMessage> it2 = this.webView.getStartupMessage().iterator();
            while (it2.hasNext()) {
                this.webView.dispatchMessage(it2.next());
            }
            this.webView.setStartupMessage(null);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        String str2;
        try {
            str = URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            Log.e(TAG, e.getMessage(), e, new Object[0]);
        }
        if (str.startsWith("tel:") || str.startsWith("sms:") || str.startsWith(MailTo.MAILTO_SCHEME)) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse(str));
                intent.addFlags(268435456);
                webView.getContext().startActivity(intent);
            } catch (ActivityNotFoundException e2) {
                Log.e(TAG, e2.getMessage(), e2, new Object[0]);
            }
            return true;
        }
        if (str.startsWith("hm://return/")) {
            this.webView.handlerReturnData(str);
            return true;
        }
        if (str.startsWith("hm://")) {
            this.webView.flushMessageQueue();
            return true;
        }
        WebView.HitTestResult hitTestResult = webView.getHitTestResult();
        if (("shouldOverrideUrlLoading:hitTestResult：" + hitTestResult) == null) {
            str2 = "hitTestResult 为空";
        } else {
            str2 = hitTestResult.getType() + "";
        }
        Log.w(TAG, str2, new Object[0]);
        if (hitTestResult == null || hitTestResult.getType() != 7) {
            return super.shouldOverrideUrlLoading(webView, str);
        }
        JsBridgeActivity.load(webView.getContext(), str);
        return true;
    }
}
