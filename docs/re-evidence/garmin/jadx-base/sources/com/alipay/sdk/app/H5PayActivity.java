package com.alipay.sdk.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.perf.FirebasePerformance;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Stack;
import java.util.regex.Pattern;
import lh.a;
import org.json.JSONObject;
import ph.j;
import ph.k;
import ug.b;
import ug.d;

/* JADX INFO: loaded from: classes7.dex */
public class H5PayActivity extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j f28408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f28409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f28410c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f28411d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f28412e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f28413f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f28414g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public WeakReference<a> f28415h;

    public void a() {
        Object obj = PayTask.f28420h;
        synchronized (obj) {
            try {
                obj.notify();
            } catch (Exception unused) {
            }
        }
    }

    @Override // android.app.Activity
    public final void finish() {
        a();
        super.finish();
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        j.c cVar;
        super.onActivityResult(i14, i15, intent);
        if (i14 == 1010) {
            WeakReference<a> weakReference = this.f28415h;
            a aVar = weakReference == null ? null : weakReference.get();
            if (i14 != 1010 || intent == null || (cVar = d.f170564a) == null) {
                return;
            }
            d.f170564a = null;
            if (i15 != -1) {
                if (i15 != 0) {
                    wg.a.g(aVar, "biz", "TbUnknown", "" + i15);
                    return;
                } else {
                    wg.a.c(aVar, "biz", "TbCancel", intent.toUri(1));
                    cVar.a(false, null, "CANCELED");
                    return;
                }
            }
            wg.a.c(aVar, "biz", "TbOk", intent.toUri(1));
            JSONObject jSONObject = new JSONObject();
            Bundle extras = intent.getExtras();
            if (extras != null) {
                for (String str : extras.keySet()) {
                    try {
                        jSONObject.put(str, String.valueOf(extras.get(str)));
                    } catch (Throwable unused) {
                    }
                }
            }
            cVar.a(true, jSONObject, "OK");
        }
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        j jVar = this.f28408a;
        if (jVar == null) {
            finish();
        } else {
            if (jVar.a()) {
                jVar.d();
                return;
            }
            jVar.d();
            b.f170552b = b.a();
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        try {
            super.requestWindowFeature(1);
            getWindow().addFlags(8192);
        } catch (Throwable th3) {
            nh.d.a(th3);
        }
        super.onCreate(bundle);
        try {
            a aVarA = a.C2158a.a(getIntent());
            if (aVarA == null) {
                finish();
                return;
            }
            this.f28415h = new WeakReference<>(aVarA);
            if (ah.a.g().f3246b) {
                setRequestedOrientation(3);
            } else {
                setRequestedOrientation(1);
            }
            try {
                Bundle extras = getIntent().getExtras();
                String string = extras.getString("url", null);
                this.f28409b = string;
                if (Pattern.compile("^http(s)?://([a-z0-9_\\-]+\\.)*(alipaydev|alipay|taobao)\\.(com|net)(:\\d+)?(/.*)?$").matcher(string).matches()) {
                    this.f28411d = extras.getString("cookie", null);
                    this.f28410c = extras.getString(FirebaseAnalytics.Param.METHOD, null);
                    this.f28412e = extras.getString("title", null);
                    this.f28414g = extras.getString("version", "v1");
                    this.f28413f = extras.getBoolean("backisexit", false);
                    try {
                        j jVar = new j(this, aVarA, this.f28414g);
                        setContentView(jVar);
                        String str = this.f28412e;
                        String str2 = this.f28410c;
                        boolean z14 = this.f28413f;
                        synchronized (jVar) {
                            jVar.f137667e = str2;
                            jVar.f137671i.getTitle().setText(str);
                            jVar.f137666d = z14;
                        }
                        String str3 = this.f28409b;
                        String str4 = this.f28411d;
                        if (!TextUtils.isEmpty(str4)) {
                            CookieSyncManager.createInstance(jVar.f137654a.getApplicationContext()).sync();
                            CookieManager.getInstance().setCookie(str3, str4);
                            CookieSyncManager.getInstance().sync();
                        }
                        String str5 = this.f28409b;
                        synchronized (jVar) {
                            boolean zEquals = FirebasePerformance.HttpMethod.POST.equals(jVar.f137667e);
                            k kVar = jVar.f137671i;
                            if (zEquals) {
                                kVar.f137684e.postUrl(str5, null);
                            } else {
                                kVar.b(str5);
                            }
                            WebView webView = jVar.f137671i.getWebView();
                            if (webView != null) {
                                try {
                                    webView.resumeTimers();
                                } catch (Throwable unused) {
                                }
                            }
                        }
                        this.f28408a = jVar;
                    } catch (Throwable th4) {
                        wg.a.d(aVarA, "biz", "GetInstalledAppEx", th4);
                        finish();
                    }
                } else {
                    finish();
                }
            } catch (Exception unused2) {
                finish();
            }
        } catch (Exception unused3) {
            finish();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        j jVar = this.f28408a;
        if (jVar != null) {
            synchronized (jVar) {
                jVar.f137671i.c();
                Stack<k> stack = jVar.f137672j.f137697a;
                if (!stack.isEmpty()) {
                    Iterator<k> it = stack.iterator();
                    while (it.hasNext()) {
                        it.next().c();
                    }
                    stack.clear();
                }
            }
        }
    }

    @Override // android.app.Activity
    public final void setRequestedOrientation(int i14) {
        try {
            super.setRequestedOrientation(i14);
        } catch (Throwable th3) {
            try {
                WeakReference<a> weakReference = this.f28415h;
                wg.a.d(weakReference == null ? null : weakReference.get(), "biz", "H5PayDataAnalysisError", th3);
            } catch (Throwable unused) {
            }
        }
    }
}
