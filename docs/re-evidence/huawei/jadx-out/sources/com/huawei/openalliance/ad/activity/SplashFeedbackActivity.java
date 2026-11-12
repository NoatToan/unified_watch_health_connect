package com.huawei.openalliance.ad.activity;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.view.MenuItem;
import android.webkit.JavascriptInterface;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.openalliance.ad.R;
import com.huawei.openalliance.ad.analysis.i;
import com.huawei.openalliance.ad.cc;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.constant.MapKeyNames;
import com.huawei.openalliance.ad.fp;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.utils.as;
import com.huawei.openalliance.ad.utils.bk;
import com.huawei.openalliance.ad.utils.dg;
import com.huawei.openalliance.ad.utils.dk;
import com.huawei.openalliance.ad.utils.ds;
import com.huawei.openalliance.ad.utils.o;
import com.huawei.openalliance.ad.views.interfaces.q;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class SplashFeedbackActivity extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private q f18186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f18187b;

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return false;
    }

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Context f18189a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f18190b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f18191c;

        @JavascriptInterface
        public void submit(String str, int i) {
            String strA;
            String str2;
            hw.a("SplashFeedbackActivity", "submit:%s %s", str, Integer.valueOf(i));
            i iVar = new i(this.f18189a.getApplicationContext());
            iVar.a("148", "" + this.f18190b, "" + i, dg.f(str));
            if (i == 1) {
                iVar.a("147", "", "", "");
                Map<String, String> mapA = !TextUtils.isEmpty(fp.b(this.f18189a).cv()) ? bk.a(fp.b(this.f18189a).cv()) : null;
                if (mapA == null) {
                    mapA = new HashMap<>();
                }
                int i2 = this.f18190b;
                if (i2 == 1 || i2 == 4) {
                    strA = dg.a(Long.valueOf(System.currentTimeMillis()));
                    str2 = Constants.SWIPE_TYPE;
                } else {
                    if (i2 == 2 || i2 == 3) {
                        strA = dg.a(Long.valueOf(System.currentTimeMillis()));
                        str2 = Constants.TWIST_TYPE;
                    }
                    fp.b(this.f18189a).t(mapA.toString());
                }
                mapA.put(str2, strA);
                fp.b(this.f18189a).t(mapA.toString());
            }
            back();
        }

        @JavascriptInterface
        public boolean openLinkInBrowser(String str) {
            return as.a(this.f18189a, str);
        }

        @JavascriptInterface
        public boolean isDarkMode() {
            return dk.r(this.f18189a);
        }

        @JavascriptInterface
        public String getSplashFeedbackBtnText() {
            return this.f18191c;
        }

        @JavascriptInterface
        public void back() {
            hw.a("SplashFeedbackActivity", "back");
            Context context = this.f18189a;
            if (context instanceof Activity) {
                ((Activity) context).finish();
            }
        }

        public a(Context context, int i, String str) {
            this.f18189a = context;
            this.f18190b = i;
            this.f18191c = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.openalliance.ad.activity.f, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        q qVar = this.f18186a;
        if (qVar != null) {
            qVar.d();
        }
    }

    @Override // com.huawei.openalliance.ad.activity.f, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }

    @Override // com.huawei.openalliance.ad.activity.e
    protected void a() {
        hw.a("SplashFeedbackActivity", "initLayout");
        setContentView(R.layout.pure_web_activity_layout);
        new i(getApplicationContext()).a("146", "", "", "");
        int intExtra = new SafeIntent(getIntent()).getIntExtra(MapKeyNames.SPLASH_CLICKABLE_TYPE, 0);
        this.f18187b = fp.b(this).cu();
        q qVar = (q) findViewById(R.id.webview);
        this.f18186a = qVar;
        qVar.a(new a(this, intExtra, this.f18187b), "_ISplashFeedbackJS");
        o.b(new Runnable() { // from class: com.huawei.openalliance.ad.activity.SplashFeedbackActivity.1
            @Override // java.lang.Runnable
            public void run() {
                String strA = fp.b(SplashFeedbackActivity.this).a(SplashFeedbackActivity.this, "h5Server");
                String strA2 = dg.a(SplashFeedbackActivity.this, "haid_h5_content_server");
                if (TextUtils.isEmpty(strA) && cc.a(SplashFeedbackActivity.this).d()) {
                    hw.b("SplashFeedbackActivity", "grs url return null or empty, use local defalut url.");
                    strA = strA2;
                }
                String strA3 = SplashFeedbackActivity.this.a(strA + "/cch5/pps-jssdk/h5-splashfeedback/index.html", SplashFeedbackActivity.this);
                if (TextUtils.isEmpty(strA3)) {
                    hw.b("SplashFeedbackActivity", "url is null");
                    SplashFeedbackActivity.this.finish();
                } else {
                    hw.b("SplashFeedbackActivity", "url= %s", ds.a(strA3));
                    SplashFeedbackActivity.this.f18186a.a(strA3);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(String str, Context context) {
        if (dg.b(str)) {
            return "";
        }
        return str + "?language=" + (Locale.getDefault().getLanguage().toLowerCase(Locale.getDefault()) + Constants.LINK + Locale.getDefault().getCountry().toUpperCase(Locale.getDefault())) + Constants.SCRIPT + dk.t(context) + Constants.VERSION + System.currentTimeMillis();
    }
}
