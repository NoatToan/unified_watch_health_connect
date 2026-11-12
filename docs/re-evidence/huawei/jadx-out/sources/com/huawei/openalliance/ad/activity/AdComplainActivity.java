package com.huawei.openalliance.ad.activity;

import android.content.ClipData;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.view.MenuItem;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import androidx.health.connect.client.records.CervicalMucusRecord;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.media.MediaQueryHelper;
import com.huawei.openalliance.ad.R;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.constant.MapKeyNames;
import com.huawei.openalliance.ad.constant.NotifyMessageNames;
import com.huawei.openalliance.ad.constant.UrlConstant;
import com.huawei.openalliance.ad.fp;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.jq;
import com.huawei.openalliance.ad.utils.dg;
import com.huawei.openalliance.ad.utils.ds;
import com.huawei.openalliance.ad.views.interfaces.q;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class AdComplainActivity extends c implements jq.a {
    private static com.huawei.openalliance.ad.views.feedback.f d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ValueCallback<Uri[]> f18107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private q f18108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f18109c;

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        d();
        finish();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.openalliance.ad.activity.f, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        hw.a("AdComplainActivity", "onDestroy");
        jq.a().b(NotifyMessageNames.AD_COMPLAIN_MESSAGE_NAME, this);
        q qVar = this.f18108b;
        if (qVar != null) {
            qVar.d();
        }
    }

    @Override // com.huawei.openalliance.ad.activity.f, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }

    @Override // com.huawei.openalliance.ad.activity.f, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        d();
    }

    @Override // com.huawei.openalliance.ad.activity.f, android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 7325489) {
            try {
                if (this.f18107a == null) {
                    hw.a("AdComplainActivity", "uploadMessageAboveL is null ");
                } else {
                    a(i, i2, intent);
                }
            } catch (Throwable th) {
                hw.a("AdComplainActivity", "onActivityResult catch exception: %s", th.getClass().getSimpleName());
            }
        }
    }

    @Override // com.huawei.openalliance.ad.activity.c
    public String b() {
        return this.f18109c;
    }

    @Override // com.huawei.openalliance.ad.jq.a
    public void a(String str, Intent intent) {
        if (TextUtils.isEmpty(str) || intent == null) {
            hw.b("AdComplainActivity", "param is empty!");
            return;
        }
        hw.a("AdComplainActivity", "onMessageNotify msgName:%s", str);
        try {
            String action = new SafeIntent(intent).getAction();
            hw.a("AdComplainActivity", "onMessageNotify, action is : %s", action);
            if (NotifyMessageNames.AD_COMPLAIN_ACTION.equals(action)) {
                finish();
            }
        } catch (Throwable th) {
            hw.b("AdComplainActivity", "ad complain err: %s", th.getClass().getSimpleName());
        }
    }

    @Override // com.huawei.openalliance.ad.activity.e
    protected void a() {
        hw.b("AdComplainActivity", "initLayout");
        if (Constants.MAGEZINE_PKG_NAME.equalsIgnoreCase(getApplicationContext().getPackageName())) {
            if (Build.VERSION.SDK_INT >= 27) {
                setShowWhenLocked(true);
            } else {
                hw.c("AdComplainActivity", "api is too low to support showWhenLocked.");
            }
        }
        setContentView(R.layout.pure_web_activity_layout);
        String stringExtra = new SafeIntent(getIntent()).getStringExtra(MapKeyNames.COMPLAIN_H5_TITLE);
        this.f18109c = stringExtra;
        if (stringExtra == null) {
            this.f18109c = "";
        }
        q qVar = (q) findViewById(R.id.webview);
        this.f18108b = qVar;
        qVar.a(d, Constants.GET_COMPLAIN_ADD_INFO_JS_NAME);
        String strA = a(fp.b(getApplicationContext()).a(getApplicationContext(), UrlConstant.BASE_COMPLAIN_H5_URL));
        this.f18108b.setWebChromeClient(new a());
        if (TextUtils.isEmpty(strA)) {
            hw.c("AdComplainActivity", "url is empty");
            finish();
        } else {
            hw.b("AdComplainActivity", "fullUrl= %s", ds.a(strA));
            this.f18108b.a(strA);
        }
        jq.a().a(NotifyMessageNames.AD_COMPLAIN_MESSAGE_NAME, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.addCategory("android.intent.category.OPENABLE");
            intent.setType("*/*");
            intent.putExtra("android.intent.extra.MIME_TYPES", new String[]{com.huawei.operation.utils.Constants.IMAGE_TYPE, MediaQueryHelper.VideoType.TYPE_ALL});
            startActivityForResult(Intent.createChooser(intent, ""), 7325489);
        } catch (Throwable th) {
            hw.d("AdComplainActivity", "open file chooser error, e: ", th.getClass().getSimpleName());
        }
    }

    private void d() {
        com.huawei.openalliance.ad.views.feedback.f fVar = d;
        if (fVar != null) {
            fVar.b();
        }
    }

    /* JADX INFO: loaded from: classes12.dex */
    class a extends WebChromeClient {
        @Override // android.webkit.WebChromeClient
        public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
            hw.a("AdComplainActivity", "API >= 21");
            AdComplainActivity.this.f18107a = valueCallback;
            AdComplainActivity.this.e();
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public void onReceivedTitle(WebView webView, String str) {
            super.onReceivedTitle(webView, str);
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i) {
            AdComplainActivity.this.f18108b.a(i);
            super.onProgressChanged(webView, i);
        }

        @Override // android.webkit.WebChromeClient
        public Bitmap getDefaultVideoPoster() {
            Bitmap defaultVideoPoster = super.getDefaultVideoPoster();
            return defaultVideoPoster != null ? defaultVideoPoster : Bitmap.createBitmap(1, 1, Bitmap.Config.RGB_565);
        }

        private a() {
        }
    }

    public static void a(com.huawei.openalliance.ad.views.feedback.f fVar) {
        d = fVar;
    }

    private void a(int i, int i2, Intent intent) {
        Uri[] uriArr;
        hw.a("AdComplainActivity", "onActivityResultAboveL start");
        if (7325489 != i || this.f18107a == null) {
            hw.a("AdComplainActivity", "result code not equals, or uploadMessageAboveL is null");
            return;
        }
        if (i2 != -1 || intent == null) {
            uriArr = null;
        } else {
            try {
                String dataString = intent.getDataString();
                ClipData clipData = intent.getClipData();
                if (clipData != null) {
                    uriArr = new Uri[clipData.getItemCount()];
                    for (int i3 = 0; i3 < clipData.getItemCount(); i3++) {
                        try {
                            uriArr[i3] = clipData.getItemAt(i3).getUri();
                        } catch (Throwable th) {
                            th = th;
                            try {
                                hw.d("AdComplainActivity", "get result error, e: %s", th.getClass().getSimpleName());
                                return;
                            } finally {
                                this.f18107a.onReceiveValue(uriArr);
                                this.f18107a = null;
                            }
                        }
                    }
                } else {
                    uriArr = null;
                }
                if (dataString != null) {
                    uriArr = new Uri[]{Uri.parse(dataString)};
                }
            } catch (Throwable th2) {
                th = th2;
                uriArr = null;
            }
        }
        this.f18107a.onReceiveValue(uriArr);
        this.f18107a = null;
    }

    private String a(String str) {
        if (dg.b(str)) {
            return "";
        }
        String lowerCase = Locale.getDefault().getLanguage().toLowerCase(Locale.getDefault());
        String lowerCase2 = Locale.getDefault().getCountry().toLowerCase(Locale.getDefault());
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(lowerCase);
        sb.append(Constants.LINK);
        sb.append(lowerCase2);
        boolean z = (getApplicationContext().getResources().getConfiguration().uiMode & 48) == 32;
        sb.append(Constants.THEME);
        sb.append(z ? "dark" : CervicalMucusRecord.Sensation.LIGHT);
        return sb.toString();
    }
}
