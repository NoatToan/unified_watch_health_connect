package com.garmin.android.apps.connectmobile.connectiq.requests.oauth;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.EditText;
import androidx.appcompat.app.e;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.y1;
import b.g;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.device.ciq.http.requests.oauth.ConnectIQOAuthRequest;
import fw.p;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import u1.p1;
import u10.i;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/connectiq/requests/oauth/ConnectIQOAuthActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ConnectIQOAuthActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f31981g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public EditText f31982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WebView f31983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ConnectIQOAuthRequest f31984c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e f31985d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f31986e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final w1 f31987f = new w1(s0.f105811a.b(i.class), new c(this), new p1(2), new d(null, this));

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31988a;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.LOADING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f31988a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f31989a;

        public c(g gVar) {
            this.f31989a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f31989a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f31990a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f31991b;

        public d(e23.a aVar, g gVar) {
            this.f31990a = aVar;
            this.f31991b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f31990a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f31991b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    static {
        new a(null);
    }

    public static final void ca(ConnectIQOAuthActivity connectIQOAuthActivity) {
        EditText editText = connectIQOAuthActivity.f31982a;
        if (editText == null) {
            s.m("addressBar");
            throw null;
        }
        editText.setVisibility(8);
        WebView webView = connectIQOAuthActivity.f31983b;
        if (webView == null) {
            s.m("oAuthView");
            throw null;
        }
        webView.setVisibility(8);
        connectIQOAuthActivity.f31986e = true;
        connectIQOAuthActivity.invalidateOptionsMenu();
    }

    public final i da() {
        return (i) this.f31987f.getValue();
    }

    public final void ea() {
        WebView webView = this.f31983b;
        if (webView == null) {
            s.m("oAuthView");
            throw null;
        }
        webView.clearCache(true);
        WebView webView2 = this.f31983b;
        if (webView2 == null) {
            s.m("oAuthView");
            throw null;
        }
        webView2.clearHistory();
        CookieManager.getInstance().removeAllCookies(null);
        CookieManager.getInstance().flush();
        WebView webView3 = this.f31983b;
        if (webView3 == null) {
            s.m("oAuthView");
            throw null;
        }
        ConnectIQOAuthRequest connectIQOAuthRequest = this.f31984c;
        if (connectIQOAuthRequest != null) {
            webView3.loadUrl(connectIQOAuthRequest.getUrl());
        } else {
            s.m("ciqRequest");
            throw null;
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        WebView webView = this.f31983b;
        if (webView == null) {
            s.m("oAuthView");
            throw null;
        }
        if (webView.getVisibility() == 0) {
            WebView webView2 = this.f31983b;
            if (webView2 == null) {
                s.m("oAuthView");
                throw null;
            }
            if (webView2.canGoBack()) {
                WebView webView3 = this.f31983b;
                if (webView3 != null) {
                    webView3.goBack();
                    return;
                } else {
                    s.m("oAuthView");
                    throw null;
                }
            }
        }
        setResult(0);
        finish();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    @SuppressLint({"SetJavaScriptEnabled"})
    public final void onCreate(Bundle bundle) {
        Parcelable parcelable;
        super.onCreate(bundle);
        setContentView(R.layout.activity_connect_iqoauth);
        Intent intent = getIntent();
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable = intent != null ? (Parcelable) intent.getParcelableExtra("extra_oauth_request", ConnectIQOAuthRequest.class) : null;
        } else {
            Parcelable parcelableExtra = intent != null ? intent.getParcelableExtra("extra_oauth_request") : null;
            if (!(parcelableExtra instanceof ConnectIQOAuthRequest)) {
                parcelableExtra = null;
            }
            parcelable = (ConnectIQOAuthRequest) parcelableExtra;
        }
        ConnectIQOAuthRequest connectIQOAuthRequest = (ConnectIQOAuthRequest) parcelable;
        if (connectIQOAuthRequest == null) {
            displayFailedMessage();
            finish();
            return;
        }
        this.f31984c = connectIQOAuthRequest;
        super.initActionBar(false, connectIQOAuthRequest.getAppName());
        View viewFindViewById = findViewById(R.id.oauth_address_bar);
        viewFindViewById.getClass();
        this.f31982a = (EditText) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.oauth_webview);
        viewFindViewById2.getClass();
        WebView webView = (WebView) viewFindViewById2;
        this.f31983b = webView;
        webView.setWebViewClient(new u10.a(this));
        WebView webView2 = this.f31983b;
        if (webView2 == null) {
            s.m("oAuthView");
            throw null;
        }
        WebSettings settings = webView2.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setSavePassword(false);
        da().f167752b.f(this, new iz1.g(this, 22));
        ea();
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        menu.getClass();
        getMenuInflater().inflate(R.menu.menu_connect_iqoauth, menu);
        if (!this.f31986e) {
            return true;
        }
        setMenuItemVisibility(menu, false, R.id.menu_item_refresh);
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        int itemId = menuItem.getItemId();
        if (itemId != R.id.menu_item_refresh) {
            if (itemId != R.id.menu_item_cancel) {
                return super.onOptionsItemSelected(menuItem);
            }
            setResult(0);
            finish();
            return true;
        }
        WebView webView = this.f31983b;
        if (webView != null) {
            webView.reload();
            return true;
        }
        s.m("oAuthView");
        throw null;
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, android.app.Activity
    public final void onResume() {
        super.onResume();
        i.a supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.q(false);
        }
        i.a supportActionBar2 = getSupportActionBar();
        if (supportActionBar2 != null) {
            supportActionBar2.x(false);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/connectiq/requests/oauth/ConnectIQOAuthActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "EXTRA_OAUTH_REQUEST", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
