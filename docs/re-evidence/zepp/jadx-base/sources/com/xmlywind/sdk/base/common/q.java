package com.xmlywind.sdk.base.common;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.DownloadListener;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.xmlywind.logger.SigmobLog;
import com.xmlywind.sdk.base.models.BaseAdUnit;
import com.xmlywind.sdk.base.models.IntentActions;
import com.xmlywind.sdk.base.views.BaseWebView;
import com.xmlywind.sdk.common.Constants;
import com.xmlywind.sdk.common.mta.PointCategory;
import com.xmlywind.sdk.common.mta.PointEntitySigmob;

/* JADX INFO: loaded from: classes22.dex */
public class q extends g {
    public BaseWebView g;
    private int h;
    private BaseAdUnit i;
    private RelativeLayout j;
    private TextView k;
    private String l;

    public q(Activity activity, BaseAdUnit baseAdUnit, Bundle bundle, Bundle bundle2, String str, h hVar) {
        super(activity, str, hVar);
        this.i = baseAdUnit;
        if (baseAdUnit == null) {
            a(IntentActions.ACTION_INTERSTITIAL_FAIL);
            h().a();
            return;
        }
        int iIntValue = baseAdUnit.getAd().display_orientation.intValue();
        this.h = iIntValue != 1 ? iIntValue != 2 ? bundle.getInt(Constants.REQUESTED_ORIENTATION, 3) : 6 : 7;
        if (this.i.getAd_type() != 5) {
            h().a(this.h);
        }
        k().requestWindowFeature(8);
        k().getWindow().addFlags(1024);
    }

    private void a() {
        if (this.g == null) {
            try {
                BaseWebView baseWebView = new BaseWebView(k());
                this.g = baseWebView;
                baseWebView.setScrollBarStyle(0);
                this.g.setWebViewClient(new WebViewClient() { // from class: com.xmlywind.sdk.base.common.q.1
                    @Override // android.webkit.WebViewClient
                    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                        SigmobLog.e(webResourceError.toString());
                        super.onReceivedError(webView, webResourceRequest, webResourceError);
                    }

                    @Override // android.webkit.WebViewClient
                    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                        String message;
                        try {
                            Context context = webView.getContext();
                            Uri uri = Uri.parse(str);
                            String scheme = uri.getScheme();
                            if ("sigmobAd".equalsIgnoreCase(scheme)) {
                                String host = uri.getHost();
                                if (!TextUtils.isEmpty(host) && ("track".equals(host) || AppMeasurementSdk.ConditionalUserProperty.ACTIVE.equals(host))) {
                                    String queryParameter = uri.getQueryParameter("data");
                                    String queryParameter2 = uri.getQueryParameter("event");
                                    if (TextUtils.isEmpty(queryParameter2) || TextUtils.isEmpty(queryParameter)) {
                                        return true;
                                    }
                                    final String str2 = new String(Base64.decode(queryParameter, 0), "utf-8");
                                    t.a(host, queryParameter2, q.this.i, new t.a() { // from class: com.xmlywind.sdk.base.common.q.1.1
                                        @Override // com.xmlywind.sdk.base.common.t.a
                                        public void a(Object obj) {
                                            if (obj instanceof PointEntitySigmob) {
                                                ((PointEntitySigmob) obj).setUrl(str2);
                                            }
                                        }
                                    });
                                    return true;
                                }
                            }
                            if (!TextUtils.isEmpty(scheme) && !scheme.equals("http") && !scheme.equals("https")) {
                                com.xmlywind.sdk.common.utils.j.a(context, Uri.parse(str));
                                t.a(PointCategory.LAND_PAGE, "click", q.this.i, "1", str, q.this.l);
                                return true;
                            }
                            SigmobLog.i("load Url: " + str);
                            webView.loadUrl(str);
                            return true;
                        } catch (com.xmlywind.sdk.common.c.b e) {
                            message = e.getMessage();
                            SigmobLog.e(message);
                            return true;
                        } catch (Throwable th) {
                            message = th.getMessage();
                            SigmobLog.e(message);
                            return true;
                        }
                    }
                });
            } catch (Throwable th) {
                SigmobLog.e(th.getMessage());
                this.f.a();
            }
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        LinearLayout linearLayout = new LinearLayout(k());
        linearLayout.addView(this.g, 0, layoutParams);
        this.f.onSetContentView(linearLayout);
        this.g.setDownloadListener(new DownloadListener() { // from class: com.xmlywind.sdk.base.common.q.2
            @Override // android.webkit.DownloadListener
            public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
                q qVar = q.this;
                l.a(qVar.b, str, qVar.i);
                t.a(PointCategory.LAND_PAGE, "click", q.this.i, "0", str, q.this.l);
                SigmobLog.d("onDownloadStart() called with: url = [" + str + "], userAgent = [" + str2 + "], contentDisposition = [" + str3 + "], mimetype = [" + str4 + "], contentLength = [" + j + "]");
            }
        });
        this.g.setOnTouchListener(new View.OnTouchListener() { // from class: com.xmlywind.sdk.base.common.q.3
            public MotionEvent a = null;

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                SigmobLog.d(motionEvent.toString());
                if (motionEvent.getAction() == 0) {
                    this.a = MotionEvent.obtain(motionEvent);
                } else if (motionEvent.getAction() == 1) {
                    MotionEvent motionEvent2 = this.a;
                    if (motionEvent2 == null) {
                        q.this.l = String.format("%d,%d,%d,%d", Integer.valueOf((int) motionEvent.getRawX()), Integer.valueOf((int) motionEvent.getRawY()), Integer.valueOf((int) motionEvent.getRawX()), Integer.valueOf((int) motionEvent.getRawY()));
                    } else {
                        q.this.l = String.format("%d,%d,%d,%d", Integer.valueOf((int) motionEvent2.getRawX()), Integer.valueOf((int) this.a.getRawY()), Integer.valueOf((int) motionEvent.getRawX()), Integer.valueOf((int) motionEvent.getRawY()));
                    }
                }
                return false;
            }
        });
    }

    private void l() {
        if (this.j == null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams2.addRule(9);
            layoutParams2.addRule(15);
            TextView textView = new TextView(this.b);
            this.k = textView;
            textView.setPadding(com.xmlywind.sdk.common.utils.c.b(5.0f, this.b), 0, 0, 0);
            this.k.setText(com.xmlywind.sdk.base.b.h());
            this.k.setTextColor(-1);
            this.k.setLayoutParams(layoutParams2);
            this.k.setOnClickListener(new View.OnClickListener() { // from class: com.xmlywind.sdk.base.common.q.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    q.this.h().a();
                }
            });
            this.k.setId(com.xmlywind.sdk.common.a.r());
            RelativeLayout relativeLayout = new RelativeLayout(i());
            this.j = relativeLayout;
            relativeLayout.setLayoutParams(layoutParams);
            this.j.setBackgroundColor(-16777216);
            this.j.addView(this.k);
        }
    }

    private void m() {
        ActionBar.LayoutParams layoutParams = new ActionBar.LayoutParams(-1, -1, 17);
        ActionBar actionBar = k().getActionBar();
        if (actionBar != null) {
            l();
            actionBar.setCustomView(this.j, layoutParams);
            actionBar.setDisplayOptions(16);
            actionBar.setDisplayShowCustomEnabled(true);
            actionBar.setDisplayShowHomeEnabled(false);
            actionBar.setDisplayShowTitleEnabled(false);
        }
    }

    @Override // com.xmlywind.sdk.base.common.g
    public void a(Configuration configuration) {
    }

    @Override // com.xmlywind.sdk.base.common.g
    public void a(Bundle bundle) {
    }

    @Override // com.xmlywind.sdk.base.common.g
    public void b() {
        int iC = com.xmlywind.sdk.base.b.c();
        if (iC > 0) {
            k().getTheme().applyStyle(iC, true);
        }
        a();
        m();
        this.g.loadUrl(this.i.getMacroCommon().macroProcess(this.i.getMaterial().landing_page));
        a(IntentActions.ACTION_LANDPAGE_SHOW);
    }

    @Override // com.xmlywind.sdk.base.common.g
    public void c() {
    }

    @Override // com.xmlywind.sdk.base.common.g
    public void d() {
    }

    @Override // com.xmlywind.sdk.base.common.g
    public void e() {
        a(IntentActions.ACTION_LANDPAGE_DISMISS);
        TextView textView = this.k;
        if (textView != null) {
            textView.setOnClickListener(null);
            this.k = null;
        }
        BaseWebView baseWebView = this.g;
        if (baseWebView != null) {
            baseWebView.destroy();
            this.g = null;
        }
    }

    @Override // com.xmlywind.sdk.base.common.g
    public void f() {
    }

    @Override // com.xmlywind.sdk.base.common.g
    public boolean g() {
        if (!this.g.canGoBack()) {
            return true;
        }
        this.g.goBack();
        return false;
    }
}
