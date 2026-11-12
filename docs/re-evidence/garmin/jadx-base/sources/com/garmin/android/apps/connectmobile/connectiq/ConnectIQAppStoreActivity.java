package com.garmin.android.apps.connectmobile.connectiq;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes7.dex */
@SuppressLint({"SetJavaScriptEnabled"})
public class ConnectIQAppStoreActivity extends com.garmin.android.apps.connectmobile.r0 implements i.a.c, com.garmin.android.apps.connectmobile.connectiq.a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f31746t = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Menu f31747e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b f31749g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public p f31751i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public WebView f31752j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f31753k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public l f31754l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f31755m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public sd2.f f31757o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f31758p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f31759q;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List<sd2.f> f31748f = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ConnectIQAppStoreActivity f31750h = this;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f31756n = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final a f31760r = new a();

    public class a implements com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<String> {
        public a() {
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
            String strMa;
            Intent intent = new Intent("android.intent.action.VIEW");
            com.garmin.android.library.backgroundtaskmanagement.b.c cVar2 = com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS;
            ConnectIQAppStoreActivity connectIQAppStoreActivity = ConnectIQAppStoreActivity.this;
            if (cVar != cVar2 || TextUtils.isEmpty(connectIQAppStoreActivity.f31758p)) {
                int i14 = ConnectIQAppStoreActivity.f31746t;
                strMa = connectIQAppStoreActivity.ma();
            } else {
                strMa = connectIQAppStoreActivity.f31758p;
            }
            intent.setData(Uri.parse(strMa));
            connectIQAppStoreActivity.startActivity(intent);
            connectIQAppStoreActivity.finish();
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onResults(long j8, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, String str) {
            ConnectIQAppStoreActivity.this.f31758p = str;
        }
    }

    public static class b extends g22.c<Void, List<sd2.f>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.connectiq.a f31762c;

        public b(com.garmin.android.apps.connectmobile.connectiq.a aVar) {
            this.f31762c = aVar;
        }

        @Override // g22.c
        public final List<sd2.f> b(Void[] voidArr) {
            return km2.a.a(km2.a.c());
        }

        @Override // g22.c
        public final void d(List<sd2.f> list) {
            this.f31762c.w5(list);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.r0
    public final String fa() {
        return "CIQ_STORE";
    }

    @Override // i.a.c
    public final void m2(int i14) {
        boolean z14 = this.f31757o == null;
        sd2.f fVar = (i14 < 0 || i14 >= this.f31748f.size()) ? null : this.f31748f.get(i14);
        this.f31757o = fVar;
        if (fVar != null) {
            GCMSettingManager.f41536b.edit().putLong(GCMSettingManager.f41535a.getString(R.string.key_last_connect_iq_device), fVar.getUnitID()).apply();
        }
        this.f31751i.f31935b = i14;
        if (z14) {
            return;
        }
        this.f31752j.loadUrl(ma());
        this.f31753k = true;
    }

    public final String ma() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append("https://" + GCMSettingManager.k().f77342h);
        if (this.f31757o != null) {
            sb3.append("?locale=");
            sb3.append(hb2.h.b().replace("_", "-"));
            sb3.append("&sku=");
            sb3.append(this.f31757o.getPartNumber());
            sb3.append("&unitId=");
            sb3.append(String.valueOf(this.f31757o.getUnitID()));
            if (this.f31754l != null) {
                sb3.append("&appType=");
                sb3.append(this.f31754l);
            }
            if (this.f31755m != null) {
                sb3.append("&appId=");
                sb3.append(this.f31755m);
            }
        } else {
            sb3.append(hb2.h.b());
            sb3.append("/apps/");
            String str = this.f31755m;
            if (str != null) {
                sb3.append(str);
            }
        }
        return sb3.toString();
    }

    @Override // com.garmin.android.apps.connectmobile.r0, com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        boolean z14 = this.f31756n;
        ConnectIQAppStoreActivity connectIQAppStoreActivity = this.f31750h;
        if (z14) {
            connectIQAppStoreActivity.setResult(-1);
        } else {
            connectIQAppStoreActivity.setResult(0);
        }
        connectIQAppStoreActivity.finish();
    }

    @Override // com.garmin.android.apps.connectmobile.r0, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!((f12.b) KoinJavaComponent.get(f12.b.class)).c()) {
            finish();
            return;
        }
        setContentView(R.layout.gcm_connect_iq);
        initActionBar(true);
        ca("CIQ_STORE");
        if (getIntent().getSerializableExtra("APP_TYPE") != null) {
            this.f31754l = (l) getIntent().getSerializableExtra("APP_TYPE");
        }
        if (getIntent().getStringExtra("CONNECT_IQ_APP_ID") != null) {
            this.f31755m = getIntent().getStringExtra("CONNECT_IQ_APP_ID");
        }
        long longExtra = getIntent().getLongExtra("GCM_deviceUnitID", -1L);
        if (longExtra >= 0) {
            GCMSettingManager.f41536b.edit().putLong(GCMSettingManager.f41535a.getString(R.string.key_last_connect_iq_device), longExtra).apply();
        }
        getSupportActionBar().z();
        b bVar = new b(this);
        this.f31749g = bVar;
        bVar.c(new Void[0]);
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.connect_iq, menu);
        this.f31747e = menu;
        return true;
    }

    @Override // i.c, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i14, KeyEvent keyEvent) {
        WebView webView;
        if (i14 != 4 || (webView = this.f31752j) == null || !webView.canGoBack()) {
            return super.onKeyDown(i14, keyEvent);
        }
        this.f31752j.goBack();
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (this.f31752j == null) {
            return super.onOptionsItemSelected(menuItem);
        }
        int itemId = menuItem.getItemId();
        if (itemId == R.id.menu_item_home) {
            WebView webView = this.f31752j;
            webView.goBackOrForward(webView.copyBackForwardList().getCurrentIndex() * (-1));
            return true;
        }
        if (itemId == R.id.menu_item_refresh) {
            this.f31752j.reload();
            return true;
        }
        if (itemId != R.id.menu_item_share) {
            if (itemId != R.id.menu_item_forward) {
                return super.onOptionsItemSelected(menuItem);
            }
            this.f31752j.goForward();
            return true;
        }
        Intent intent = new Intent("android.intent.action.SEND");
        intent.addFlags(1);
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", this.f31752j.getUrl());
        intent.putExtra("android.intent.extra.SUBJECT", getResources().getString(R.string.connect_iq_store_title));
        startActivity(Intent.createChooser(intent, ""));
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.c, androidx.fragment.app.m, android.app.Activity
    public final void onPause() {
        super.onPause();
        CookieSyncManager.getInstance().stopSync();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, android.app.Activity
    public final void onResume() {
        CookieSyncManager.getInstance().startSync();
        super.onResume();
        ht.a.f85464a.getClass();
        ht.a.a(null, "PageViewCIQStore");
    }

    @Override // com.garmin.android.apps.connectmobile.c, i.c, androidx.fragment.app.m, android.app.Activity
    public final void onStop() {
        super.onStop();
        hideProgressOverlay();
        this.f31749g.a();
        com.garmin.android.library.backgroundtaskmanagement.c.f50123c.a(this.f31759q);
    }

    @Override // com.garmin.android.apps.connectmobile.connectiq.a
    public final void w5(List<sd2.f> list) {
        sd2.f fVar;
        Object next;
        this.f31748f = list;
        long j8 = GCMSettingManager.f41536b.getLong(GCMSettingManager.f41535a.getString(R.string.key_last_connect_iq_device), 0L);
        List<sd2.f> list2 = this.f31748f;
        int i14 = e22.a.f62640a;
        list2.getClass();
        Iterator it = p13.h0.j1(list2).iterator();
        do {
            p13.o0 o0Var = (p13.o0) it;
            fVar = null;
            if (!o0Var.f134956a.hasNext()) {
                next = null;
                break;
            }
            next = o0Var.next();
        } while (!(((sd2.f) ((p13.m0) next).f134952b).getUnitID() == j8));
        p13.m0 m0Var = (p13.m0) next;
        int i15 = m0Var != null ? m0Var.f134951a : -1;
        int i16 = (i15 != -1 || this.f31748f.isEmpty()) ? i15 : 0;
        if (i16 >= 0 && i16 < this.f31748f.size()) {
            fVar = this.f31748f.get(i16);
        }
        this.f31757o = fVar;
        p pVar = new p(this, this.f31748f, getResources().getString(R.string.connect_iq_store_title));
        this.f31751i = pVar;
        pVar.setDropDownViewResource(R.layout.spinner_dropdown_item);
        getSupportActionBar().y(this.f31751i, this.f31750h);
        if (i16 != -1) {
            getSupportActionBar().A(i16);
        }
        this.f31752j = (WebView) findViewById(R.id.webView);
        CookieManager.getInstance().setAcceptThirdPartyCookies(this.f31752j, true);
        this.f31752j.setWebViewClient(new k(this));
        WebSettings settings = this.f31752j.getSettings();
        settings.setLoadsImagesAutomatically(true);
        settings.setUserAgentString("GarminConnectMobile-Android");
        settings.setJavaScriptEnabled(true);
        showProgressOverlay();
        cw.c cVarM = cw.c.M();
        String strMa = ma();
        cVarM.getClass();
        this.f31759q = com.garmin.android.library.backgroundtaskmanagement.c.d(new gw.d0(strMa, cVarM), this.f31760r);
    }
}
