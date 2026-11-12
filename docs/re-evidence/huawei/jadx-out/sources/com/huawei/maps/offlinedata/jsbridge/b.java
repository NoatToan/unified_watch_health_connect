package com.huawei.maps.offlinedata.jsbridge;

import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import com.huawei.maps.offlinedata.utils.d;
import com.huawei.maps.offlinedata.utils.g;
import com.huawei.operation.utils.Constants;

/* JADX INFO: loaded from: classes12.dex */
public class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile b f17844b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WebView f17845a;

    private b() {
    }

    public static b a() {
        if (f17844b == null) {
            synchronized (b.class) {
                if (f17844b == null) {
                    f17844b = new b();
                }
            }
        }
        return f17844b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(String str) {
        WebView webView = this.f17845a;
        if (webView != null) {
            webView.evaluateJavascript(str, null);
            return;
        }
        com.huawei.maps.offlinedata.service.a.a().a(false);
        g.d("WebViewHelper", "webView is null. execJs: " + str);
    }

    public void b(String str, Object... objArr) {
        a(str + Constants.LEFT_BRACKET_ONLY + a(objArr) + Constants.RIGHT_BRACKET_ONLY);
    }

    public void a(WebView webView) {
        this.f17845a = webView;
    }

    private String a(Object... objArr) {
        if (objArr != null && objArr.length != 0) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < objArr.length; i++) {
                sb.append(d.a(objArr[i]));
                if (i < objArr.length - 1) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        return "";
    }

    public void a(final String str) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.huawei.maps.offlinedata.jsbridge.b$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.b(str);
            }
        });
    }

    public void a(String str, Object... objArr) {
        a("window.nativeEvent('" + str + "'," + a(objArr) + ");");
    }
}
