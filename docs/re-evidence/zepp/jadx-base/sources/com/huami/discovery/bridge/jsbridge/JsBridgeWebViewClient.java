package com.huami.discovery.bridge.jsbridge;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.huami.tools.log.HMLog;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
public class JsBridgeWebViewClient extends WebViewClient {
    private static final String b = "JsBridgeWebViewClient";
    private static String c = "";
    private JsBridgeWebView a;

    public JsBridgeWebViewClient(JsBridgeWebView jsBridgeWebView) {
        this.a = jsBridgeWebView;
        synchronized (this) {
            if (TextUtils.isEmpty(c)) {
                c = a();
            }
        }
    }

    private String a() {
        String str;
        IOException e;
        try {
            InputStream inputStreamOpen = this.a.getContext().getAssets().open("HM_JsBridge.js");
            byte[] bArr = new byte[inputStreamOpen.available()];
            inputStreamOpen.read(bArr);
            str = new String(bArr, "UTF-8");
            try {
                inputStreamOpen.close();
            } catch (IOException e2) {
                e = e2;
                e.printStackTrace();
            }
        } catch (IOException e3) {
            str = "";
            e = e3;
        }
        return str;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        HMLog.i(b, "onPageFinished =" + str, new Object[0]);
        if (!TextUtils.isEmpty(c)) {
            HMLog.i(b, "onPageFinished is JS valid:" + TextUtils.isEmpty(c), new Object[0]);
            this.a.loadUrl("javascript:" + c);
        }
        if (this.a.getStartupMessage() != null) {
            Iterator<JsMessage> it2 = this.a.getStartupMessage().iterator();
            while (it2.hasNext()) {
                this.a.c(it2.next());
            }
            this.a.setStartupMessage(null);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        HMLog.i(b, "onPageStarted =" + str, new Object[0]);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        try {
            str = URLDecoder.decode(str, "UTF-8");
            HMLog.i(b, "decode url =" + str, new Object[0]);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        if (str.startsWith("hm://return/")) {
            this.a.f(str);
            return true;
        }
        if (!str.startsWith("hm://")) {
            return super.shouldOverrideUrlLoading(webView, str);
        }
        this.a.e();
        return true;
    }
}
