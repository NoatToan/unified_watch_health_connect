package com.xmlywind.sdk.base.views;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.JavascriptInterface;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.xmlywind.logger.SigmobLog;
import com.xmlywind.sdk.base.models.BaseAdUnit;
import com.xmlywind.sdk.base.models.SigMacroCommon;
import com.xmlywind.sdk.common.models.sigdsp.pb.AdPrivacy;
import com.xmlywind.sdk.common.models.sigdsp.pb.MaterialMeta;
import com.xmlywind.sdk.common.utils.k;
import com.xmlywind.sdk.common.utils.q;
import java.io.File;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
public class e extends Dialog implements DialogInterface.OnDismissListener, DialogInterface.OnShowListener {
    private b a;
    private Map<String, String> b;
    private Context c;
    private Window d;
    private int e;
    private int f;
    private int g;
    private int h;
    private CircleWebView i;
    private BaseAdUnit j;
    private boolean k;
    private ImageView l;
    private String m;
    private File n;

    public static class a {
        private Map<String, String> a;

        public a(Map<String, String> map) {
            this.a = map;
        }

        @JavascriptInterface
        public String getPrivacyInfo() {
            try {
                Map<String, String> map = this.a;
                if (map != null && map.size() > 0) {
                    JSONObject jSONObject = new JSONObject();
                    for (Map.Entry<String, String> entry : this.a.entrySet()) {
                        jSONObject.put(entry.getKey(), entry.getValue());
                    }
                    return jSONObject.toString();
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            return null;
        }
    }

    public interface b {
        void a();

        void a(String str, String str2);

        void b();
    }

    public e(Context context, BaseAdUnit baseAdUnit) {
        super(context, com.xmlywind.sdk.base.b.d());
        this.d = null;
        this.k = false;
        this.m = "";
        this.c = context.getApplicationContext();
        this.j = baseAdUnit;
        this.i = b();
        this.l = d();
        this.g = this.c.getResources().getDisplayMetrics().widthPixels;
        int i = this.c.getResources().getDisplayMetrics().heightPixels;
        this.h = i;
        int i2 = this.g;
        if (i > i2) {
            this.e = (i * 1) / 2;
            this.f = i2;
        } else {
            this.e = (i * 5) / 6;
            this.f = i;
        }
    }

    private ImageView d() {
        ImageView imageView = new ImageView(this.c);
        this.l = imageView;
        imageView.setImageBitmap(d.CLOSE.a());
        this.l.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.l.setImageAlpha(127);
        this.l.setClickable(true);
        this.l.setOnClickListener(new View.OnClickListener() { // from class: com.xmlywind.sdk.base.views.e.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (e.this.a != null) {
                    e.this.a.a();
                }
            }
        });
        return this.l;
    }

    private void e() {
        Window window = getWindow();
        this.d = window;
        if (window != null) {
            window.setGravity(80);
            int iE = com.xmlywind.sdk.base.b.e();
            if (iE != 0) {
                this.d.setWindowAnimations(iE);
            }
            this.d.getDecorView().setPadding(0, 0, 0, 0);
            WindowManager.LayoutParams attributes = this.d.getAttributes();
            attributes.width = this.f;
            attributes.height = this.e;
            this.d.setAttributes(attributes);
        }
    }

    public void a(b bVar) {
        this.a = bVar;
    }

    public boolean a() {
        return this.k;
    }

    public CircleWebView b() {
        File file;
        CircleWebView circleWebView;
        String str;
        AdPrivacy adPrivacy;
        BaseAdUnit baseAdUnit = this.j;
        if (baseAdUnit != null) {
            MaterialMeta material = baseAdUnit.getMaterial();
            if (material == null || (adPrivacy = material.ad_privacy) == null) {
                SigmobLog.i("ad_privacy is null");
            } else {
                if (!TextUtils.isEmpty(adPrivacy.privacy_info_url)) {
                    this.m = adPrivacy.privacy_info_url;
                }
                Map<String, String> map = adPrivacy.privacy_template_info;
                if (map != null && map.size() > 0) {
                    this.b = adPrivacy.privacy_template_info;
                }
                if (!TextUtils.isEmpty(adPrivacy.privacy_template_url)) {
                    String strA = k.a(adPrivacy.privacy_template_url);
                    this.n = new File(com.xmlywind.sdk.common.utils.d.g(com.xmlywind.sdk.common.utils.d.b), strA + ".html");
                }
            }
        }
        if (TextUtils.isEmpty(this.m) && ((file = this.n) == null || !file.exists() || this.b == null)) {
            this.k = false;
            return null;
        }
        this.k = true;
        CircleWebView circleWebView2 = new CircleWebView(this.c);
        this.i = circleWebView2;
        circleWebView2.a(true);
        this.i.setWebViewClient(new WebViewClient() { // from class: com.xmlywind.sdk.base.views.e.2
            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str2) {
                super.onPageFinished(webView, str2);
            }

            @Override // android.webkit.WebViewClient
            public void onPageStarted(WebView webView, String str2, Bitmap bitmap) {
                super.onPageStarted(webView, str2, bitmap);
            }

            @Override // android.webkit.WebViewClient
            public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                SigmobLog.i("onReceivedError:" + webResourceError.toString());
                super.onReceivedError(webView, webResourceRequest, webResourceError);
            }

            @Override // android.webkit.WebViewClient
            public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                SigmobLog.i("onReceivedSslError:" + sslError.toString());
                super.onReceivedSslError(webView, sslErrorHandler, sslError);
            }

            /* JADX WARN: Code duplicated, block: B:31:0x0112  */
            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView, String str2) {
                try {
                    SigmobLog.i("shouldOverrideUrlLoading:" + str2);
                    Uri uri = Uri.parse(str2);
                    if ("sigmobAd".equalsIgnoreCase(uri.getScheme())) {
                        String host = uri.getHost();
                        if (TextUtils.isEmpty(host)) {
                            if (!TextUtils.isEmpty(str2) && str2.startsWith("http")) {
                                webView.loadUrl(str2);
                            }
                        } else if ("closeFourElements".equals(host)) {
                            if (e.this.a != null) {
                                e.this.a.a();
                            }
                        } else if ("buttonClick".equals(host)) {
                            Map<String, String> mapA = com.xmlywind.sdk.common.a.a(uri);
                            String str3 = mapA.get("url");
                            String str4 = mapA.get("x");
                            String str5 = "0";
                            if (TextUtils.isEmpty(str4)) {
                                str4 = "0";
                            }
                            String str6 = mapA.get("y");
                            if (!TextUtils.isEmpty(str6)) {
                                str5 = str6;
                            }
                            String str7 = String.format("%s,%s,%s,%s", str4, str5, str4, str5);
                            SigMacroCommon macroCommon = e.this.j.getMacroCommon();
                            if (macroCommon instanceof SigMacroCommon) {
                                macroCommon.addMarcoKey(SigMacroCommon._DOWNX_, str4);
                                macroCommon.addMarcoKey(SigMacroCommon._DOWNY_, str5);
                                macroCommon.addMarcoKey(SigMacroCommon._UPX_, str4);
                                macroCommon.addMarcoKey(SigMacroCommon._UPY_, str5);
                            }
                            e.this.j.getClickCommon().down = new q(Integer.parseInt(str4), Integer.parseInt(str5));
                            e.this.j.getClickCommon().up = new q(Integer.parseInt(str4), Integer.parseInt(str5));
                            if (e.this.a != null) {
                                e.this.a.a(str3, str7);
                            }
                        }
                    } else if (!TextUtils.isEmpty(str2)) {
                        webView.loadUrl(str2);
                    }
                } catch (Throwable th) {
                    SigmobLog.e("FourElementsDialog:" + th.getMessage());
                }
                return true;
            }
        });
        if (TextUtils.isEmpty(this.m)) {
            File file2 = this.n;
            if (file2 == null || !file2.exists()) {
                this.k = false;
            } else {
                this.i.addJavascriptInterface(new a(this.b), "sigPrivacy");
                circleWebView = this.i;
                str = "file://" + this.n.getAbsolutePath();
            }
            return this.i;
        }
        circleWebView = this.i;
        str = this.m;
        circleWebView.loadUrl(str);
        return this.i;
    }

    public void c() {
        CircleWebView circleWebView = this.i;
        if (circleWebView != null) {
            circleWebView.destroy();
            this.i = null;
        }
        if (this.a != null) {
            this.a = null;
        }
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        if (TextUtils.isEmpty(this.m)) {
            relativeLayout.setBackgroundColor(0);
        } else {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(-1);
            float fB = com.xmlywind.sdk.common.utils.c.b(20.0f, this.c);
            gradientDrawable.setCornerRadii(new float[]{fB, fB, fB, fB, 0.0f, 0.0f, 0.0f, 0.0f});
            int iB = com.xmlywind.sdk.common.utils.c.b(10.0f, this.c);
            relativeLayout.setPadding(iB, iB, iB, iB);
            relativeLayout.setBackground(gradientDrawable);
        }
        setContentView(relativeLayout);
        setOnShowListener(this);
        setOnDismissListener(this);
        SigmobLog.i("FourElementsDialog onCreate:" + this.f + ":" + this.e);
        if (this.i != null) {
            relativeLayout.addView(this.i, new RelativeLayout.LayoutParams(-1, -1));
        }
        if (this.l != null && !TextUtils.isEmpty(this.m)) {
            int iB2 = com.xmlywind.sdk.common.utils.c.b(18.0f, this.c);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iB2, iB2);
            layoutParams.addRule(10);
            layoutParams.addRule(11);
            int i = iB2 / 2;
            layoutParams.setMargins(0, i, i, 0);
            relativeLayout.addView(this.l, layoutParams);
        }
        setCanceledOnTouchOutside(true);
        setCancelable(true);
        e();
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        SigmobLog.i("FourElementsDialog  onDismiss");
        b bVar = this.a;
        if (bVar != null) {
            bVar.a();
        }
    }

    @Override // android.content.DialogInterface.OnShowListener
    public void onShow(DialogInterface dialogInterface) {
        SigmobLog.i("FourElementsDialog  onShow");
        b bVar = this.a;
        if (bVar != null) {
            bVar.b();
        }
    }
}
