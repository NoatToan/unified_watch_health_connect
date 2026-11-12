package com.garmin.android.apps.connectmobile.connectiq.settings;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;
import androidx.appcompat.app.e;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.y0;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import b.g;
import c53.j;
import c53.q;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.connectiq.b0;
import com.garmin.android.apps.connectmobile.connectiq.i0;
import com.garmin.android.apps.connectmobile.connectiq.k0;
import com.garmin.android.apps.connectmobile.connectiq.settings.ConnectIQAppSettingsActivity;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.gfdi.protobuf.ProtobufRequestManager;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.proto.generated.GDIConnectIQAppSettingsExtension;
import com.garmin.proto.generated.GDIConnectIQAppSettingsProto;
import com.garmin.proto.generated.GDISmartProto;
import com.google.protobuf.ByteString;
import e23.l;
import fw.p;
import j23.k;
import j23.t;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.UUID;
import lc.u0;
import o13.h;
import org.apache.commons.lang3.StringUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p13.h0;
import p13.p0;
import p13.t0;
import p92.y;
import y10.f;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/connectiq/settings/ConnectIQAppSettingsActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ConnectIQAppSettingsActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f32003k = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WebView f32005b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Menu f32007d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f32008e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f32009f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f32010g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f32011h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f32004a = new w1(s0.f105811a.b(y10.f.class), new d(this), new x1.b(1), new e(null, this));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f32006c = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f32012i = true;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final f f32013j = new f();

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f32014a;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f32014a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f32015a;

        public c(l lVar) {
            lVar.getClass();
            this.f32015a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f32015a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f32015a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f32016a;

        public d(g gVar) {
            this.f32016a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f32016a.getViewModelStore();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f32017a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f32018b;

        public e(e23.a aVar, g gVar) {
            this.f32017a = aVar;
            this.f32018b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f32017a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f32018b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/connectiq/settings/ConnectIQAppSettingsActivity$f", "Landroid/webkit/WebViewClient;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class f extends WebViewClient {
        public f() {
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            webView.getClass();
            str.getClass();
            super.onPageFinished(webView, str);
            y.a aVar = y.f136664a;
            String strConcat = "Webview onPageFinished ".concat(str);
            aVar.getClass();
            y.a.a("ConnectIQAppSettingsActivity", strConcat);
            ConnectIQAppSettingsActivity connectIQAppSettingsActivity = ConnectIQAppSettingsActivity.this;
            if (connectIQAppSettingsActivity.f32006c) {
                y10.f fVarEa = connectIQAppSettingsActivity.ea();
                fVarEa.f193835n = p.SUCCESS;
                y0<g3<String>> y0Var = fVarEa.f193833l;
                g3.f35298f.getClass();
                y0Var.m(g3.a.d(str));
            }
            connectIQAppSettingsActivity.f32006c = true;
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            webView.getClass();
            webResourceRequest.getClass();
            webResourceError.getClass();
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            y.a aVar = y.f136664a;
            String str = "Webview onReceivedError " + webResourceError.getErrorCode() + StringUtils.SPACE + ((Object) webResourceError.getDescription());
            aVar.getClass();
            y.a.c("ConnectIQAppSettingsActivity", str);
            ConnectIQAppSettingsActivity connectIQAppSettingsActivity = ConnectIQAppSettingsActivity.this;
            connectIQAppSettingsActivity.f32006c = false;
            y10.f fVarEa = connectIQAppSettingsActivity.ea();
            Uri url = webResourceRequest.getUrl();
            String string = url != null ? url.toString() : null;
            p pVar = fVarEa.f193835n;
            p pVar2 = p.ERROR;
            if (pVar == pVar2) {
                fVarEa.f193833l.m(g3.a.a(g3.f35298f, null, null, string, null, 11));
            }
            fVarEa.f193835n = pVar2;
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            webView.getClass();
            webResourceRequest.getClass();
            webResourceResponse.getClass();
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            y.a aVar = y.f136664a;
            String str = "Webview onReceivedHttpError " + webResourceResponse.getStatusCode();
            aVar.getClass();
            y.a.c("ConnectIQAppSettingsActivity", str);
            ConnectIQAppSettingsActivity connectIQAppSettingsActivity = ConnectIQAppSettingsActivity.this;
            connectIQAppSettingsActivity.f32006c = false;
            y10.f fVarEa = connectIQAppSettingsActivity.ea();
            Uri url = webResourceRequest.getUrl();
            String string = url != null ? url.toString() : null;
            p pVar = fVarEa.f193835n;
            p pVar2 = p.ERROR;
            if (pVar == pVar2) {
                fVarEa.f193833l.m(g3.a.a(g3.f35298f, null, null, string, null, 11));
            }
            fVarEa.f193835n = pVar2;
        }

        @Override // android.webkit.WebViewClient
        public final void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
            super.onUnhandledKeyEvent(webView, keyEvent);
            if (keyEvent == null || keyEvent.getKeyCode() != 66) {
                return;
            }
            a aVar = ConnectIQAppSettingsActivity.f32003k;
            ConnectIQAppSettingsActivity connectIQAppSettingsActivity = ConnectIQAppSettingsActivity.this;
            if (connectIQAppSettingsActivity.ea().f193836o) {
                WebView webView2 = connectIQAppSettingsActivity.f32005b;
                if (webView2 != null) {
                    webView2.evaluateJavascript("handleFormSubmit()", new x10.a(connectIQAppSettingsActivity, 1));
                } else {
                    s.m("appSettingsWebView");
                    throw null;
                }
            }
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            Uri url;
            y.a aVar = y.f136664a;
            String string = null;
            String str = "Webview shouldOverrideUrlLoading " + (webResourceRequest != null ? webResourceRequest.getUrl() : null);
            aVar.getClass();
            y.a.a("ConnectIQAppSettingsActivity", str);
            a aVar2 = ConnectIQAppSettingsActivity.f32003k;
            y10.f fVarEa = ConnectIQAppSettingsActivity.this.ea();
            if (webResourceRequest != null && (url = webResourceRequest.getUrl()) != null) {
                string = url.toString();
            }
            fVarEa.f193835n = p.LOADING;
            y0<g3<String>> y0Var = fVarEa.f193833l;
            g3.f35298f.getClass();
            y0Var.m(g3.a.b(string));
            if (webView != null) {
                webView.clearCache(true);
            }
            return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
    }

    public static LinkedHashMap ha(JSONObject jSONObject, wy2.c cVar) throws JSONException {
        Object objInvoke;
        Iterator<String> itKeys = jSONObject.keys();
        itKeys.getClass();
        j jVarB = q.b(itKeys);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : (c53.a) jVarB) {
            Object obj2 = jSONObject.get((String) obj);
            if (obj2 instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) obj2;
                j23.l lVarO = t.o(0, jSONArray.length());
                int iA = t0.a(p13.y.r(lVarO, 10));
                if (iA < 16) {
                    iA = 16;
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(iA);
                Iterator<Integer> it = lVarO.iterator();
                while (((k) it).f96801c) {
                    int iNextInt = ((p0) it).nextInt();
                    o13.p pVar = new o13.p(String.valueOf(iNextInt), jSONArray.get(iNextInt));
                    linkedHashMap2.put(pVar.f128594a, pVar.f128595b);
                }
                objInvoke = h0.b1(ha(new JSONObject(linkedHashMap2), cVar).values());
            } else if (obj2 instanceof JSONObject) {
                objInvoke = ha((JSONObject) obj2, cVar);
            } else if (s.g(obj2, JSONObject.NULL)) {
                objInvoke = null;
            } else {
                obj2.getClass();
                objInvoke = cVar.invoke(obj2);
            }
            linkedHashMap.put(obj, objInvoke);
        }
        return linkedHashMap;
    }

    public final void ca(boolean z14) {
        if (isFinishing()) {
            return;
        }
        hideProgressOverlay();
        WebView webView = this.f32005b;
        if (webView != null) {
            webView.setVisibility(z14 ? 0 : 8);
        } else {
            s.m("appSettingsWebView");
            throw null;
        }
    }

    public final void da() {
        ca(false);
        finish();
    }

    public final y10.f ea() {
        return (y10.f) this.f32004a.getValue();
    }

    public final void fa() {
        WebView webView = this.f32005b;
        if (webView == null) {
            s.m("appSettingsWebView");
            throw null;
        }
        if (webView.getVisibility() != 0) {
            finish();
            return;
        }
        WebView webView2 = this.f32005b;
        if (webView2 != null) {
            webView2.evaluateJavascript("handleBack()", new x10.a(this, 0));
        } else {
            s.m("appSettingsWebView");
            throw null;
        }
    }

    public final void ga(String str) {
        if (isFinishing()) {
            return;
        }
        showProgressOverlay(str);
        WebView webView = this.f32005b;
        if (webView != null) {
            webView.setVisibility(8);
        } else {
            s.m("appSettingsWebView");
            throw null;
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        fa();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    @SuppressLint({"SetJavaScriptEnabled"})
    public final void onCreate(Bundle bundle) {
        MenuItem item;
        super.onCreate(bundle);
        setContentView(R.layout.activity_app_settings);
        int i14 = getResources().getConfiguration().uiMode & 48;
        this.f32012i = (i14 == 0 || i14 == 16) ? false : true;
        View viewFindViewById = findViewById(R.id.settingsWebView);
        viewFindViewById.getClass();
        WebView webView = (WebView) viewFindViewById;
        this.f32005b = webView;
        webView.setBackgroundColor(getColor(R.color.gcm_list_item_background));
        WebView webView2 = this.f32005b;
        if (webView2 == null) {
            s.m("appSettingsWebView");
            throw null;
        }
        webView2.getSettings().setJavaScriptEnabled(true);
        WebView webView3 = this.f32005b;
        if (webView3 == null) {
            s.m("appSettingsWebView");
            throw null;
        }
        webView3.setWebViewClient(this.f32013j);
        String string = getString(R.string.txt_loading);
        string.getClass();
        ga(string);
        super.initActionBar(true, R.string.action_settings);
        i.a supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.s(true);
        }
        Menu menu = this.f32007d;
        if (menu != null && (item = menu.getItem(0)) != null) {
            item.setVisible(false);
        }
        this.f32008e = getIntent().getStringExtra("CONNECT_IQ_APP_ID");
        this.f32009f = getIntent().getStringExtra("GCM_app_version");
        this.f32010g = getIntent().getStringExtra("GCM_deviceUnitID");
        this.f32011h = getIntent().getStringExtra("GCM_devicePartNbr");
        String stringExtra = getIntent().getStringExtra("GCM_macAddress");
        y.a aVar = y.f136664a;
        String str = this.f32008e;
        String str2 = this.f32009f;
        String str3 = this.f32010g;
        String str4 = this.f32011h;
        StringBuilder sbI = p6.b.i("App settings parameters:", str, StringUtils.SPACE, str2, StringUtils.SPACE);
        sn.a.t(sbI, str3, StringUtils.SPACE, stringExtra, StringUtils.SPACE);
        sbI.append(str4);
        String string2 = sbI.toString();
        aVar.getClass();
        y.a.a("ConnectIQAppSettingsActivity", string2);
        final int i15 = 0;
        ea().f193834m.f(this, new c(new l(this) { // from class: x10.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConnectIQAppSettingsActivity f188375b;

            {
                this.f188375b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Object invoke(Object obj) {
                MenuItem item2;
                int i16 = i15;
                int i17 = 1;
                ConnectIQAppSettingsActivity connectIQAppSettingsActivity = this.f188375b;
                switch (i16) {
                    case 0:
                        g3 g3Var = (g3) obj;
                        ConnectIQAppSettingsActivity.a aVar2 = ConnectIQAppSettingsActivity.f32003k;
                        int i18 = ConnectIQAppSettingsActivity.b.f32014a[g3Var.f35300a.ordinal()];
                        if (i18 == 1) {
                            String string3 = connectIQAppSettingsActivity.getString(R.string.txt_loading);
                            string3.getClass();
                            connectIQAppSettingsActivity.ga(string3);
                        } else if (i18 == 2) {
                            connectIQAppSettingsActivity.ca(true);
                            connectIQAppSettingsActivity.ea().x4(connectIQAppSettingsActivity.ea().y4(connectIQAppSettingsActivity.f32008e, connectIQAppSettingsActivity.f32009f, connectIQAppSettingsActivity.f32011h, connectIQAppSettingsActivity.f32012i), (String) g3Var.f35301b, true);
                        } else {
                            if (i18 != 3) {
                                u0.r();
                                return null;
                            }
                            connectIQAppSettingsActivity.ea().x4(connectIQAppSettingsActivity.ea().y4(connectIQAppSettingsActivity.f32008e, connectIQAppSettingsActivity.f32009f, connectIQAppSettingsActivity.f32011h, connectIQAppSettingsActivity.f32012i), null, false);
                            connectIQAppSettingsActivity.ca(false);
                            e.a aVar3 = new e.a(connectIQAppSettingsActivity);
                            aVar3.setMessage(R.string.connect_iq_it_error).setTitle(R.string.dialog_title_error);
                            aVar3.setPositiveButton(R.string.lbl_close, new b(connectIQAppSettingsActivity, i17));
                            if (!connectIQAppSettingsActivity.isFinishing()) {
                                aVar3.create().show();
                            }
                        }
                        return Unit.INSTANCE;
                    case 1:
                        g3 g3Var2 = (g3) obj;
                        ConnectIQAppSettingsActivity.a aVar4 = ConnectIQAppSettingsActivity.f32003k;
                        y.a aVar5 = y.f136664a;
                        p pVar = g3Var2.f35300a;
                        Object obj2 = g3Var2.f35301b;
                        String str5 = "ciqSettingsLiveData " + pVar + StringUtils.SPACE + obj2;
                        aVar5.getClass();
                        y.a.a("ConnectIQAppSettingsActivity", str5);
                        int i19 = ConnectIQAppSettingsActivity.b.f32014a[g3Var2.f35300a.ordinal()];
                        if (i19 == 1) {
                            String string4 = connectIQAppSettingsActivity.getString(R.string.txt_loading);
                            string4.getClass();
                            connectIQAppSettingsActivity.ga(string4);
                        } else if (i19 == 2) {
                            String str6 = (String) obj2;
                            if (str6 == null) {
                                str6 = "";
                            }
                            String strY4 = connectIQAppSettingsActivity.ea().y4(connectIQAppSettingsActivity.f32008e, connectIQAppSettingsActivity.f32009f, connectIQAppSettingsActivity.f32011h, connectIQAppSettingsActivity.f32012i);
                            if (str6.length() == 0) {
                                str6 = "{}";
                            }
                            String string5 = new JSONObject(ConnectIQAppSettingsActivity.ha(new JSONObject(str6), new wy2.c(23))).toString();
                            Charset charset = d53.c.f57666b;
                            String strN = fb1.c.n("userSettings=", URLEncoder.encode(string5, charset.name()));
                            WebView webView4 = connectIQAppSettingsActivity.f32005b;
                            if (webView4 == null) {
                                s.m("appSettingsWebView");
                                throw null;
                            }
                            byte[] bytes = strN.getBytes(charset);
                            bytes.getClass();
                            webView4.postUrl(strY4, bytes);
                        } else {
                            if (i19 != 3) {
                                u0.r();
                                return null;
                            }
                            Toast.makeText(connectIQAppSettingsActivity, connectIQAppSettingsActivity.getText(R.string.txt_error_occurred), 0).show();
                            connectIQAppSettingsActivity.da();
                        }
                        return Unit.INSTANCE;
                    case 2:
                        Boolean bool = (Boolean) obj;
                        ConnectIQAppSettingsActivity.a aVar6 = ConnectIQAppSettingsActivity.f32003k;
                        y.f136664a.getClass();
                        y.a.a("ConnectIQAppSettingsActivity", "deviceTimeoutLiveData isAppSettingsFinished " + bool);
                        Toast.makeText(connectIQAppSettingsActivity, connectIQAppSettingsActivity.getString(R.string.device_communication_error_msg), 0).show();
                        if (bool.booleanValue()) {
                            connectIQAppSettingsActivity.ca(false);
                        } else {
                            connectIQAppSettingsActivity.da();
                        }
                        return Unit.INSTANCE;
                    case 3:
                        g3 g3Var3 = (g3) obj;
                        ConnectIQAppSettingsActivity.a aVar7 = ConnectIQAppSettingsActivity.f32003k;
                        int i24 = ConnectIQAppSettingsActivity.b.f32014a[g3Var3.f35300a.ordinal()];
                        if (i24 == 1) {
                            String string6 = connectIQAppSettingsActivity.getString(R.string.txt_loading);
                            string6.getClass();
                            connectIQAppSettingsActivity.ga(string6);
                        } else if (i24 == 2) {
                            byte[] bArr = (byte[]) g3Var3.f35301b;
                            UUID uuidFromString = UUID.fromString(connectIQAppSettingsActivity.f32008e);
                            if (uuidFromString == null || bArr == null) {
                                Toast.makeText(connectIQAppSettingsActivity, connectIQAppSettingsActivity.getText(R.string.txt_error_occurred), 0).show();
                                connectIQAppSettingsActivity.da();
                            } else {
                                f fVarEa = connectIQAppSettingsActivity.ea();
                                fVarEa.f193829h.m(g3.a.c(g3.f35298f));
                                b0 b0VarE = b0.e();
                                f.d dVar = fVarEa.f193839r;
                                b0VarE.getClass();
                                i2.d("ConnectIQRequestManager", "#saveApplicationSettings , " + uuidFromString.toString());
                                GDIConnectIQAppSettingsProto.SaveAppSettingsRequest.Builder builderNewBuilder = GDIConnectIQAppSettingsProto.SaveAppSettingsRequest.newBuilder();
                                builderNewBuilder.setAppIdentifier(ByteString.copyFrom(com.garmin.android.apps.connectmobile.connectiq.p0.d(uuidFromString)));
                                builderNewBuilder.setSettingsValues(ByteString.copyFrom(bArr));
                                GDIConnectIQAppSettingsProto.ConnectIQAppSettingsService.Builder builderNewBuilder2 = GDIConnectIQAppSettingsProto.ConnectIQAppSettingsService.newBuilder();
                                builderNewBuilder2.setSaveAppSettingsRequest(builderNewBuilder);
                                GDISmartProto.Smart.Builder builderNewBuilder3 = GDISmartProto.Smart.newBuilder();
                                builderNewBuilder3.setExtension(GDIConnectIQAppSettingsExtension.connectIqAppSettingsService, builderNewBuilder2.build());
                                ProtobufRequestManager.getInstance().initiateRequest(builderNewBuilder3.build(), b0VarE.f31823a, new k0(b0VarE, dVar));
                            }
                        } else {
                            if (i24 != 3) {
                                u0.r();
                                return null;
                            }
                            Toast.makeText(connectIQAppSettingsActivity, connectIQAppSettingsActivity.getText(R.string.txt_error_occurred), 0).show();
                            connectIQAppSettingsActivity.da();
                        }
                        return Unit.INSTANCE;
                    case 4:
                        ConnectIQAppSettingsActivity.a aVar8 = ConnectIQAppSettingsActivity.f32003k;
                        int i25 = ConnectIQAppSettingsActivity.b.f32014a[((g3) obj).f35300a.ordinal()];
                        if (i25 == 1) {
                            String string7 = connectIQAppSettingsActivity.getString(R.string.txt_loading);
                            string7.getClass();
                            connectIQAppSettingsActivity.ga(string7);
                        } else if (i25 == 2) {
                            Toast.makeText(connectIQAppSettingsActivity, connectIQAppSettingsActivity.getText(R.string.msg_settings_saved_successfully), 0).show();
                            connectIQAppSettingsActivity.da();
                        } else {
                            if (i25 != 3) {
                                u0.r();
                                return null;
                            }
                            Toast.makeText(connectIQAppSettingsActivity, connectIQAppSettingsActivity.getText(R.string.txt_error_occurred), 0).show();
                            connectIQAppSettingsActivity.da();
                        }
                        return Unit.INSTANCE;
                    default:
                        Boolean bool2 = (Boolean) obj;
                        ConnectIQAppSettingsActivity.a aVar9 = ConnectIQAppSettingsActivity.f32003k;
                        bool2.getClass();
                        boolean zBooleanValue = bool2.booleanValue();
                        Menu menu2 = connectIQAppSettingsActivity.f32007d;
                        if (menu2 != null && (item2 = menu2.getItem(0)) != null) {
                            item2.setVisible(zBooleanValue);
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
        final int i16 = 1;
        ea().f193825d.f(this, new c(new l(this) { // from class: x10.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConnectIQAppSettingsActivity f188375b;

            {
                this.f188375b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Object invoke(Object obj) {
                MenuItem item2;
                int i17 = i16;
                int i18 = 1;
                ConnectIQAppSettingsActivity connectIQAppSettingsActivity = this.f188375b;
                switch (i17) {
                    case 0:
                        g3 g3Var = (g3) obj;
                        ConnectIQAppSettingsActivity.a aVar2 = ConnectIQAppSettingsActivity.f32003k;
                        int i19 = ConnectIQAppSettingsActivity.b.f32014a[g3Var.f35300a.ordinal()];
                        if (i19 == 1) {
                            String string3 = connectIQAppSettingsActivity.getString(R.string.txt_loading);
                            string3.getClass();
                            connectIQAppSettingsActivity.ga(string3);
                        } else if (i19 == 2) {
                            connectIQAppSettingsActivity.ca(true);
                            connectIQAppSettingsActivity.ea().x4(connectIQAppSettingsActivity.ea().y4(connectIQAppSettingsActivity.f32008e, connectIQAppSettingsActivity.f32009f, connectIQAppSettingsActivity.f32011h, connectIQAppSettingsActivity.f32012i), (String) g3Var.f35301b, true);
                        } else {
                            if (i19 != 3) {
                                u0.r();
                                return null;
                            }
                            connectIQAppSettingsActivity.ea().x4(connectIQAppSettingsActivity.ea().y4(connectIQAppSettingsActivity.f32008e, connectIQAppSettingsActivity.f32009f, connectIQAppSettingsActivity.f32011h, connectIQAppSettingsActivity.f32012i), null, false);
                            connectIQAppSettingsActivity.ca(false);
                            e.a aVar3 = new e.a(connectIQAppSettingsActivity);
                            aVar3.setMessage(R.string.connect_iq_it_error).setTitle(R.string.dialog_title_error);
                            aVar3.setPositiveButton(R.string.lbl_close, new b(connectIQAppSettingsActivity, i18));
                            if (!connectIQAppSettingsActivity.isFinishing()) {
                                aVar3.create().show();
                            }
                        }
                        return Unit.INSTANCE;
                    case 1:
                        g3 g3Var2 = (g3) obj;
                        ConnectIQAppSettingsActivity.a aVar4 = ConnectIQAppSettingsActivity.f32003k;
                        y.a aVar5 = y.f136664a;
                        p pVar = g3Var2.f35300a;
                        Object obj2 = g3Var2.f35301b;
                        String str5 = "ciqSettingsLiveData " + pVar + StringUtils.SPACE + obj2;
                        aVar5.getClass();
                        y.a.a("ConnectIQAppSettingsActivity", str5);
                        int i110 = ConnectIQAppSettingsActivity.b.f32014a[g3Var2.f35300a.ordinal()];
                        if (i110 == 1) {
                            String string4 = connectIQAppSettingsActivity.getString(R.string.txt_loading);
                            string4.getClass();
                            connectIQAppSettingsActivity.ga(string4);
                        } else if (i110 == 2) {
                            String str6 = (String) obj2;
                            if (str6 == null) {
                                str6 = "";
                            }
                            String strY4 = connectIQAppSettingsActivity.ea().y4(connectIQAppSettingsActivity.f32008e, connectIQAppSettingsActivity.f32009f, connectIQAppSettingsActivity.f32011h, connectIQAppSettingsActivity.f32012i);
                            if (str6.length() == 0) {
                                str6 = "{}";
                            }
                            String string5 = new JSONObject(ConnectIQAppSettingsActivity.ha(new JSONObject(str6), new wy2.c(23))).toString();
                            Charset charset = d53.c.f57666b;
                            String strN = fb1.c.n("userSettings=", URLEncoder.encode(string5, charset.name()));
                            WebView webView4 = connectIQAppSettingsActivity.f32005b;
                            if (webView4 == null) {
                                s.m("appSettingsWebView");
                                throw null;
                            }
                            byte[] bytes = strN.getBytes(charset);
                            bytes.getClass();
                            webView4.postUrl(strY4, bytes);
                        } else {
                            if (i110 != 3) {
                                u0.r();
                                return null;
                            }
                            Toast.makeText(connectIQAppSettingsActivity, connectIQAppSettingsActivity.getText(R.string.txt_error_occurred), 0).show();
                            connectIQAppSettingsActivity.da();
                        }
                        return Unit.INSTANCE;
                    case 2:
                        Boolean bool = (Boolean) obj;
                        ConnectIQAppSettingsActivity.a aVar6 = ConnectIQAppSettingsActivity.f32003k;
                        y.f136664a.getClass();
                        y.a.a("ConnectIQAppSettingsActivity", "deviceTimeoutLiveData isAppSettingsFinished " + bool);
                        Toast.makeText(connectIQAppSettingsActivity, connectIQAppSettingsActivity.getString(R.string.device_communication_error_msg), 0).show();
                        if (bool.booleanValue()) {
                            connectIQAppSettingsActivity.ca(false);
                        } else {
                            connectIQAppSettingsActivity.da();
                        }
                        return Unit.INSTANCE;
                    case 3:
                        g3 g3Var3 = (g3) obj;
                        ConnectIQAppSettingsActivity.a aVar7 = ConnectIQAppSettingsActivity.f32003k;
                        int i24 = ConnectIQAppSettingsActivity.b.f32014a[g3Var3.f35300a.ordinal()];
                        if (i24 == 1) {
                            String string6 = connectIQAppSettingsActivity.getString(R.string.txt_loading);
                            string6.getClass();
                            connectIQAppSettingsActivity.ga(string6);
                        } else if (i24 == 2) {
                            byte[] bArr = (byte[]) g3Var3.f35301b;
                            UUID uuidFromString = UUID.fromString(connectIQAppSettingsActivity.f32008e);
                            if (uuidFromString == null || bArr == null) {
                                Toast.makeText(connectIQAppSettingsActivity, connectIQAppSettingsActivity.getText(R.string.txt_error_occurred), 0).show();
                                connectIQAppSettingsActivity.da();
                            } else {
                                f fVarEa = connectIQAppSettingsActivity.ea();
                                fVarEa.f193829h.m(g3.a.c(g3.f35298f));
                                b0 b0VarE = b0.e();
                                f.d dVar = fVarEa.f193839r;
                                b0VarE.getClass();
                                i2.d("ConnectIQRequestManager", "#saveApplicationSettings , " + uuidFromString.toString());
                                GDIConnectIQAppSettingsProto.SaveAppSettingsRequest.Builder builderNewBuilder = GDIConnectIQAppSettingsProto.SaveAppSettingsRequest.newBuilder();
                                builderNewBuilder.setAppIdentifier(ByteString.copyFrom(com.garmin.android.apps.connectmobile.connectiq.p0.d(uuidFromString)));
                                builderNewBuilder.setSettingsValues(ByteString.copyFrom(bArr));
                                GDIConnectIQAppSettingsProto.ConnectIQAppSettingsService.Builder builderNewBuilder2 = GDIConnectIQAppSettingsProto.ConnectIQAppSettingsService.newBuilder();
                                builderNewBuilder2.setSaveAppSettingsRequest(builderNewBuilder);
                                GDISmartProto.Smart.Builder builderNewBuilder3 = GDISmartProto.Smart.newBuilder();
                                builderNewBuilder3.setExtension(GDIConnectIQAppSettingsExtension.connectIqAppSettingsService, builderNewBuilder2.build());
                                ProtobufRequestManager.getInstance().initiateRequest(builderNewBuilder3.build(), b0VarE.f31823a, new k0(b0VarE, dVar));
                            }
                        } else {
                            if (i24 != 3) {
                                u0.r();
                                return null;
                            }
                            Toast.makeText(connectIQAppSettingsActivity, connectIQAppSettingsActivity.getText(R.string.txt_error_occurred), 0).show();
                            connectIQAppSettingsActivity.da();
                        }
                        return Unit.INSTANCE;
                    case 4:
                        ConnectIQAppSettingsActivity.a aVar8 = ConnectIQAppSettingsActivity.f32003k;
                        int i25 = ConnectIQAppSettingsActivity.b.f32014a[((g3) obj).f35300a.ordinal()];
                        if (i25 == 1) {
                            String string7 = connectIQAppSettingsActivity.getString(R.string.txt_loading);
                            string7.getClass();
                            connectIQAppSettingsActivity.ga(string7);
                        } else if (i25 == 2) {
                            Toast.makeText(connectIQAppSettingsActivity, connectIQAppSettingsActivity.getText(R.string.msg_settings_saved_successfully), 0).show();
                            connectIQAppSettingsActivity.da();
                        } else {
                            if (i25 != 3) {
                                u0.r();
                                return null;
                            }
                            Toast.makeText(connectIQAppSettingsActivity, connectIQAppSettingsActivity.getText(R.string.txt_error_occurred), 0).show();
                            connectIQAppSettingsActivity.da();
                        }
                        return Unit.INSTANCE;
                    default:
                        Boolean bool2 = (Boolean) obj;
                        ConnectIQAppSettingsActivity.a aVar9 = ConnectIQAppSettingsActivity.f32003k;
                        bool2.getClass();
                        boolean zBooleanValue = bool2.booleanValue();
                        Menu menu2 = connectIQAppSettingsActivity.f32007d;
                        if (menu2 != null && (item2 = menu2.getItem(0)) != null) {
                            item2.setVisible(zBooleanValue);
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
        final int i17 = 2;
        ea().f193826e.f(this, new c(new l(this) { // from class: x10.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConnectIQAppSettingsActivity f188375b;

            {
                this.f188375b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Object invoke(Object obj) {
                MenuItem item2;
                int i18 = i17;
                int i19 = 1;
                ConnectIQAppSettingsActivity connectIQAppSettingsActivity = this.f188375b;
                switch (i18) {
                    case 0:
                        g3 g3Var = (g3) obj;
                        ConnectIQAppSettingsActivity.a aVar2 = ConnectIQAppSettingsActivity.f32003k;
                        int i110 = ConnectIQAppSettingsActivity.b.f32014a[g3Var.f35300a.ordinal()];
                        if (i110 == 1) {
                            String string3 = connectIQAppSettingsActivity.getString(R.string.txt_loading);
                            string3.getClass();
                            connectIQAppSettingsActivity.ga(string3);
                        } else if (i110 == 2) {
                            connectIQAppSettingsActivity.ca(true);
                            connectIQAppSettingsActivity.ea().x4(connectIQAppSettingsActivity.ea().y4(connectIQAppSettingsActivity.f32008e, connectIQAppSettingsActivity.f32009f, connectIQAppSettingsActivity.f32011h, connectIQAppSettingsActivity.f32012i), (String) g3Var.f35301b, true);
                        } else {
                            if (i110 != 3) {
                                u0.r();
                                return null;
                            }
                            connectIQAppSettingsActivity.ea().x4(connectIQAppSettingsActivity.ea().y4(connectIQAppSettingsActivity.f32008e, connectIQAppSettingsActivity.f32009f, connectIQAppSettingsActivity.f32011h, connectIQAppSettingsActivity.f32012i), null, false);
                            connectIQAppSettingsActivity.ca(false);
                            e.a aVar3 = new e.a(connectIQAppSettingsActivity);
                            aVar3.setMessage(R.string.connect_iq_it_error).setTitle(R.string.dialog_title_error);
                            aVar3.setPositiveButton(R.string.lbl_close, new b(connectIQAppSettingsActivity, i19));
                            if (!connectIQAppSettingsActivity.isFinishing()) {
                                aVar3.create().show();
                            }
                        }
                        return Unit.INSTANCE;
                    case 1:
                        g3 g3Var2 = (g3) obj;
                        ConnectIQAppSettingsActivity.a aVar4 = ConnectIQAppSettingsActivity.f32003k;
                        y.a aVar5 = y.f136664a;
                        p pVar = g3Var2.f35300a;
                        Object obj2 = g3Var2.f35301b;
                        String str5 = "ciqSettingsLiveData " + pVar + StringUtils.SPACE + obj2;
                        aVar5.getClass();
                        y.a.a("ConnectIQAppSettingsActivity", str5);
                        int i111 = ConnectIQAppSettingsActivity.b.f32014a[g3Var2.f35300a.ordinal()];
                        if (i111 == 1) {
                            String string4 = connectIQAppSettingsActivity.getString(R.string.txt_loading);
                            string4.getClass();
                            connectIQAppSettingsActivity.ga(string4);
                        } else if (i111 == 2) {
                            String str6 = (String) obj2;
                            if (str6 == null) {
                                str6 = "";
                            }
                            String strY4 = connectIQAppSettingsActivity.ea().y4(connectIQAppSettingsActivity.f32008e, connectIQAppSettingsActivity.f32009f, connectIQAppSettingsActivity.f32011h, connectIQAppSettingsActivity.f32012i);
                            if (str6.length() == 0) {
                                str6 = "{}";
                            }
                            String string5 = new JSONObject(ConnectIQAppSettingsActivity.ha(new JSONObject(str6), new wy2.c(23))).toString();
                            Charset charset = d53.c.f57666b;
                            String strN = fb1.c.n("userSettings=", URLEncoder.encode(string5, charset.name()));
                            WebView webView4 = connectIQAppSettingsActivity.f32005b;
                            if (webView4 == null) {
                                s.m("appSettingsWebView");
                                throw null;
                            }
                            byte[] bytes = strN.getBytes(charset);
                            bytes.getClass();
                            webView4.postUrl(strY4, bytes);
                        } else {
                            if (i111 != 3) {
                                u0.r();
                                return null;
                            }
                            Toast.makeText(connectIQAppSettingsActivity, connectIQAppSettingsActivity.getText(R.string.txt_error_occurred), 0).show();
                            connectIQAppSettingsActivity.da();
                        }
                        return Unit.INSTANCE;
                    case 2:
                        Boolean bool = (Boolean) obj;
                        ConnectIQAppSettingsActivity.a aVar6 = ConnectIQAppSettingsActivity.f32003k;
                        y.f136664a.getClass();
                        y.a.a("ConnectIQAppSettingsActivity", "deviceTimeoutLiveData isAppSettingsFinished " + bool);
                        Toast.makeText(connectIQAppSettingsActivity, connectIQAppSettingsActivity.getString(R.string.device_communication_error_msg), 0).show();
                        if (bool.booleanValue()) {
                            connectIQAppSettingsActivity.ca(false);
                        } else {
                            connectIQAppSettingsActivity.da();
                        }
                        return Unit.INSTANCE;
                    case 3:
                        g3 g3Var3 = (g3) obj;
                        ConnectIQAppSettingsActivity.a aVar7 = ConnectIQAppSettingsActivity.f32003k;
                        int i24 = ConnectIQAppSettingsActivity.b.f32014a[g3Var3.f35300a.ordinal()];
                        if (i24 == 1) {
                            String string6 = connectIQAppSettingsActivity.getString(R.string.txt_loading);
                            string6.getClass();
                            connectIQAppSettingsActivity.ga(string6);
                        } else if (i24 == 2) {
                            byte[] bArr = (byte[]) g3Var3.f35301b;
                            UUID uuidFromString = UUID.fromString(connectIQAppSettingsActivity.f32008e);
                            if (uuidFromString == null || bArr == null) {
                                Toast.makeText(connectIQAppSettingsActivity, connectIQAppSettingsActivity.getText(R.string.txt_error_occurred), 0).show();
                                connectIQAppSettingsActivity.da();
                            } else {
                                f fVarEa = connectIQAppSettingsActivity.ea();
                                fVarEa.f193829h.m(g3.a.c(g3.f35298f));
                                b0 b0VarE = b0.e();
                                f.d dVar = fVarEa.f193839r;
                                b0VarE.getClass();
                                i2.d("ConnectIQRequestManager", "#saveApplicationSettings , " + uuidFromString.toString());
                                GDIConnectIQAppSettingsProto.SaveAppSettingsRequest.Builder builderNewBuilder = GDIConnectIQAppSettingsProto.SaveAppSettingsRequest.newBuilder();
                                builderNewBuilder.setAppIdentifier(ByteString.copyFrom(com.garmin.android.apps.connectmobile.connectiq.p0.d(uuidFromString)));
                                builderNewBuilder.setSettingsValues(ByteString.copyFrom(bArr));
                                GDIConnectIQAppSettingsProto.ConnectIQAppSettingsService.Builder builderNewBuilder2 = GDIConnectIQAppSettingsProto.ConnectIQAppSettingsService.newBuilder();
                                builderNewBuilder2.setSaveAppSettingsRequest(builderNewBuilder);
                                GDISmartProto.Smart.Builder builderNewBuilder3 = GDISmartProto.Smart.newBuilder();
                                builderNewBuilder3.setExtension(GDIConnectIQAppSettingsExtension.connectIqAppSettingsService, builderNewBuilder2.build());
                                ProtobufRequestManager.getInstance().initiateRequest(builderNewBuilder3.build(), b0VarE.f31823a, new k0(b0VarE, dVar));
                            }
                        } else {
                            if (i24 != 3) {
                                u0.r();
                                return null;
                            }
                            Toast.makeText(connectIQAppSettingsActivity, connectIQAppSettingsActivity.getText(R.string.txt_error_occurred), 0).show();
                            connectIQAppSettingsActivity.da();
                        }
                        return Unit.INSTANCE;
                    case 4:
                        ConnectIQAppSettingsActivity.a aVar8 = ConnectIQAppSettingsActivity.f32003k;
                        int i25 = ConnectIQAppSettingsActivity.b.f32014a[((g3) obj).f35300a.ordinal()];
                        if (i25 == 1) {
                            String string7 = connectIQAppSettingsActivity.getString(R.string.txt_loading);
                            string7.getClass();
                            connectIQAppSettingsActivity.ga(string7);
                        } else if (i25 == 2) {
                            Toast.makeText(connectIQAppSettingsActivity, connectIQAppSettingsActivity.getText(R.string.msg_settings_saved_successfully), 0).show();
                            connectIQAppSettingsActivity.da();
                        } else {
                            if (i25 != 3) {
                                u0.r();
                                return null;
                            }
                            Toast.makeText(connectIQAppSettingsActivity, connectIQAppSettingsActivity.getText(R.string.txt_error_occurred), 0).show();
                            connectIQAppSettingsActivity.da();
                        }
                        return Unit.INSTANCE;
                    default:
                        Boolean bool2 = (Boolean) obj;
                        ConnectIQAppSettingsActivity.a aVar9 = ConnectIQAppSettingsActivity.f32003k;
                        bool2.getClass();
                        boolean zBooleanValue = bool2.booleanValue();
                        Menu menu2 = connectIQAppSettingsActivity.f32007d;
                        if (menu2 != null && (item2 = menu2.getItem(0)) != null) {
                            item2.setVisible(zBooleanValue);
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
        final int i18 = 3;
        ea().f193828g.f(this, new c(new l(this) { // from class: x10.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConnectIQAppSettingsActivity f188375b;

            {
                this.f188375b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Object invoke(Object obj) {
                MenuItem item2;
                int i19 = i18;
                int i110 = 1;
                ConnectIQAppSettingsActivity connectIQAppSettingsActivity = this.f188375b;
                switch (i19) {
                    case 0:
                        g3 g3Var = (g3) obj;
                        ConnectIQAppSettingsActivity.a aVar2 = ConnectIQAppSettingsActivity.f32003k;
                        int i111 = ConnectIQAppSettingsActivity.b.f32014a[g3Var.f35300a.ordinal()];
                        if (i111 == 1) {
                            String string3 = connectIQAppSettingsActivity.getString(R.string.txt_loading);
                            string3.getClass();
                            connectIQAppSettingsActivity.ga(string3);
                        } else if (i111 == 2) {
                            connectIQAppSettingsActivity.ca(true);
                            connectIQAppSettingsActivity.ea().x4(connectIQAppSettingsActivity.ea().y4(connectIQAppSettingsActivity.f32008e, connectIQAppSettingsActivity.f32009f, connectIQAppSettingsActivity.f32011h, connectIQAppSettingsActivity.f32012i), (String) g3Var.f35301b, true);
                        } else {
                            if (i111 != 3) {
                                u0.r();
                                return null;
                            }
                            connectIQAppSettingsActivity.ea().x4(connectIQAppSettingsActivity.ea().y4(connectIQAppSettingsActivity.f32008e, connectIQAppSettingsActivity.f32009f, connectIQAppSettingsActivity.f32011h, connectIQAppSettingsActivity.f32012i), null, false);
                            connectIQAppSettingsActivity.ca(false);
                            e.a aVar3 = new e.a(connectIQAppSettingsActivity);
                            aVar3.setMessage(R.string.connect_iq_it_error).setTitle(R.string.dialog_title_error);
                            aVar3.setPositiveButton(R.string.lbl_close, new b(connectIQAppSettingsActivity, i110));
                            if (!connectIQAppSettingsActivity.isFinishing()) {
                                aVar3.create().show();
                            }
                        }
                        return Unit.INSTANCE;
                    case 1:
                        g3 g3Var2 = (g3) obj;
                        ConnectIQAppSettingsActivity.a aVar4 = ConnectIQAppSettingsActivity.f32003k;
                        y.a aVar5 = y.f136664a;
                        p pVar = g3Var2.f35300a;
                        Object obj2 = g3Var2.f35301b;
                        String str5 = "ciqSettingsLiveData " + pVar + StringUtils.SPACE + obj2;
                        aVar5.getClass();
                        y.a.a("ConnectIQAppSettingsActivity", str5);
                        int i112 = ConnectIQAppSettingsActivity.b.f32014a[g3Var2.f35300a.ordinal()];
                        if (i112 == 1) {
                            String string4 = connectIQAppSettingsActivity.getString(R.string.txt_loading);
                            string4.getClass();
                            connectIQAppSettingsActivity.ga(string4);
                        } else if (i112 == 2) {
                            String str6 = (String) obj2;
                            if (str6 == null) {
                                str6 = "";
                            }
                            String strY4 = connectIQAppSettingsActivity.ea().y4(connectIQAppSettingsActivity.f32008e, connectIQAppSettingsActivity.f32009f, connectIQAppSettingsActivity.f32011h, connectIQAppSettingsActivity.f32012i);
                            if (str6.length() == 0) {
                                str6 = "{}";
                            }
                            String string5 = new JSONObject(ConnectIQAppSettingsActivity.ha(new JSONObject(str6), new wy2.c(23))).toString();
                            Charset charset = d53.c.f57666b;
                            String strN = fb1.c.n("userSettings=", URLEncoder.encode(string5, charset.name()));
                            WebView webView4 = connectIQAppSettingsActivity.f32005b;
                            if (webView4 == null) {
                                s.m("appSettingsWebView");
                                throw null;
                            }
                            byte[] bytes = strN.getBytes(charset);
                            bytes.getClass();
                            webView4.postUrl(strY4, bytes);
                        } else {
                            if (i112 != 3) {
                                u0.r();
                                return null;
                            }
                            Toast.makeText(connectIQAppSettingsActivity, connectIQAppSettingsActivity.getText(R.string.txt_error_occurred), 0).show();
                            connectIQAppSettingsActivity.da();
                        }
                        return Unit.INSTANCE;
                    case 2:
                        Boolean bool = (Boolean) obj;
                        ConnectIQAppSettingsActivity.a aVar6 = ConnectIQAppSettingsActivity.f32003k;
                        y.f136664a.getClass();
                        y.a.a("ConnectIQAppSettingsActivity", "deviceTimeoutLiveData isAppSettingsFinished " + bool);
                        Toast.makeText(connectIQAppSettingsActivity, connectIQAppSettingsActivity.getString(R.string.device_communication_error_msg), 0).show();
                        if (bool.booleanValue()) {
                            connectIQAppSettingsActivity.ca(false);
                        } else {
                            connectIQAppSettingsActivity.da();
                        }
                        return Unit.INSTANCE;
                    case 3:
                        g3 g3Var3 = (g3) obj;
                        ConnectIQAppSettingsActivity.a aVar7 = ConnectIQAppSettingsActivity.f32003k;
                        int i24 = ConnectIQAppSettingsActivity.b.f32014a[g3Var3.f35300a.ordinal()];
                        if (i24 == 1) {
                            String string6 = connectIQAppSettingsActivity.getString(R.string.txt_loading);
                            string6.getClass();
                            connectIQAppSettingsActivity.ga(string6);
                        } else if (i24 == 2) {
                            byte[] bArr = (byte[]) g3Var3.f35301b;
                            UUID uuidFromString = UUID.fromString(connectIQAppSettingsActivity.f32008e);
                            if (uuidFromString == null || bArr == null) {
                                Toast.makeText(connectIQAppSettingsActivity, connectIQAppSettingsActivity.getText(R.string.txt_error_occurred), 0).show();
                                connectIQAppSettingsActivity.da();
                            } else {
                                f fVarEa = connectIQAppSettingsActivity.ea();
                                fVarEa.f193829h.m(g3.a.c(g3.f35298f));
                                b0 b0VarE = b0.e();
                                f.d dVar = fVarEa.f193839r;
                                b0VarE.getClass();
                                i2.d("ConnectIQRequestManager", "#saveApplicationSettings , " + uuidFromString.toString());
                                GDIConnectIQAppSettingsProto.SaveAppSettingsRequest.Builder builderNewBuilder = GDIConnectIQAppSettingsProto.SaveAppSettingsRequest.newBuilder();
                                builderNewBuilder.setAppIdentifier(ByteString.copyFrom(com.garmin.android.apps.connectmobile.connectiq.p0.d(uuidFromString)));
                                builderNewBuilder.setSettingsValues(ByteString.copyFrom(bArr));
                                GDIConnectIQAppSettingsProto.ConnectIQAppSettingsService.Builder builderNewBuilder2 = GDIConnectIQAppSettingsProto.ConnectIQAppSettingsService.newBuilder();
                                builderNewBuilder2.setSaveAppSettingsRequest(builderNewBuilder);
                                GDISmartProto.Smart.Builder builderNewBuilder3 = GDISmartProto.Smart.newBuilder();
                                builderNewBuilder3.setExtension(GDIConnectIQAppSettingsExtension.connectIqAppSettingsService, builderNewBuilder2.build());
                                ProtobufRequestManager.getInstance().initiateRequest(builderNewBuilder3.build(), b0VarE.f31823a, new k0(b0VarE, dVar));
                            }
                        } else {
                            if (i24 != 3) {
                                u0.r();
                                return null;
                            }
                            Toast.makeText(connectIQAppSettingsActivity, connectIQAppSettingsActivity.getText(R.string.txt_error_occurred), 0).show();
                            connectIQAppSettingsActivity.da();
                        }
                        return Unit.INSTANCE;
                    case 4:
                        ConnectIQAppSettingsActivity.a aVar8 = ConnectIQAppSettingsActivity.f32003k;
                        int i25 = ConnectIQAppSettingsActivity.b.f32014a[((g3) obj).f35300a.ordinal()];
                        if (i25 == 1) {
                            String string7 = connectIQAppSettingsActivity.getString(R.string.txt_loading);
                            string7.getClass();
                            connectIQAppSettingsActivity.ga(string7);
                        } else if (i25 == 2) {
                            Toast.makeText(connectIQAppSettingsActivity, connectIQAppSettingsActivity.getText(R.string.msg_settings_saved_successfully), 0).show();
                            connectIQAppSettingsActivity.da();
                        } else {
                            if (i25 != 3) {
                                u0.r();
                                return null;
                            }
                            Toast.makeText(connectIQAppSettingsActivity, connectIQAppSettingsActivity.getText(R.string.txt_error_occurred), 0).show();
                            connectIQAppSettingsActivity.da();
                        }
                        return Unit.INSTANCE;
                    default:
                        Boolean bool2 = (Boolean) obj;
                        ConnectIQAppSettingsActivity.a aVar9 = ConnectIQAppSettingsActivity.f32003k;
                        bool2.getClass();
                        boolean zBooleanValue = bool2.booleanValue();
                        Menu menu2 = connectIQAppSettingsActivity.f32007d;
                        if (menu2 != null && (item2 = menu2.getItem(0)) != null) {
                            item2.setVisible(zBooleanValue);
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
        final int i19 = 4;
        ea().f193830i.f(this, new c(new l(this) { // from class: x10.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConnectIQAppSettingsActivity f188375b;

            {
                this.f188375b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Object invoke(Object obj) {
                MenuItem item2;
                int i110 = i19;
                int i111 = 1;
                ConnectIQAppSettingsActivity connectIQAppSettingsActivity = this.f188375b;
                switch (i110) {
                    case 0:
                        g3 g3Var = (g3) obj;
                        ConnectIQAppSettingsActivity.a aVar2 = ConnectIQAppSettingsActivity.f32003k;
                        int i112 = ConnectIQAppSettingsActivity.b.f32014a[g3Var.f35300a.ordinal()];
                        if (i112 == 1) {
                            String string3 = connectIQAppSettingsActivity.getString(R.string.txt_loading);
                            string3.getClass();
                            connectIQAppSettingsActivity.ga(string3);
                        } else if (i112 == 2) {
                            connectIQAppSettingsActivity.ca(true);
                            connectIQAppSettingsActivity.ea().x4(connectIQAppSettingsActivity.ea().y4(connectIQAppSettingsActivity.f32008e, connectIQAppSettingsActivity.f32009f, connectIQAppSettingsActivity.f32011h, connectIQAppSettingsActivity.f32012i), (String) g3Var.f35301b, true);
                        } else {
                            if (i112 != 3) {
                                u0.r();
                                return null;
                            }
                            connectIQAppSettingsActivity.ea().x4(connectIQAppSettingsActivity.ea().y4(connectIQAppSettingsActivity.f32008e, connectIQAppSettingsActivity.f32009f, connectIQAppSettingsActivity.f32011h, connectIQAppSettingsActivity.f32012i), null, false);
                            connectIQAppSettingsActivity.ca(false);
                            e.a aVar3 = new e.a(connectIQAppSettingsActivity);
                            aVar3.setMessage(R.string.connect_iq_it_error).setTitle(R.string.dialog_title_error);
                            aVar3.setPositiveButton(R.string.lbl_close, new b(connectIQAppSettingsActivity, i111));
                            if (!connectIQAppSettingsActivity.isFinishing()) {
                                aVar3.create().show();
                            }
                        }
                        return Unit.INSTANCE;
                    case 1:
                        g3 g3Var2 = (g3) obj;
                        ConnectIQAppSettingsActivity.a aVar4 = ConnectIQAppSettingsActivity.f32003k;
                        y.a aVar5 = y.f136664a;
                        p pVar = g3Var2.f35300a;
                        Object obj2 = g3Var2.f35301b;
                        String str5 = "ciqSettingsLiveData " + pVar + StringUtils.SPACE + obj2;
                        aVar5.getClass();
                        y.a.a("ConnectIQAppSettingsActivity", str5);
                        int i113 = ConnectIQAppSettingsActivity.b.f32014a[g3Var2.f35300a.ordinal()];
                        if (i113 == 1) {
                            String string4 = connectIQAppSettingsActivity.getString(R.string.txt_loading);
                            string4.getClass();
                            connectIQAppSettingsActivity.ga(string4);
                        } else if (i113 == 2) {
                            String str6 = (String) obj2;
                            if (str6 == null) {
                                str6 = "";
                            }
                            String strY4 = connectIQAppSettingsActivity.ea().y4(connectIQAppSettingsActivity.f32008e, connectIQAppSettingsActivity.f32009f, connectIQAppSettingsActivity.f32011h, connectIQAppSettingsActivity.f32012i);
                            if (str6.length() == 0) {
                                str6 = "{}";
                            }
                            String string5 = new JSONObject(ConnectIQAppSettingsActivity.ha(new JSONObject(str6), new wy2.c(23))).toString();
                            Charset charset = d53.c.f57666b;
                            String strN = fb1.c.n("userSettings=", URLEncoder.encode(string5, charset.name()));
                            WebView webView4 = connectIQAppSettingsActivity.f32005b;
                            if (webView4 == null) {
                                s.m("appSettingsWebView");
                                throw null;
                            }
                            byte[] bytes = strN.getBytes(charset);
                            bytes.getClass();
                            webView4.postUrl(strY4, bytes);
                        } else {
                            if (i113 != 3) {
                                u0.r();
                                return null;
                            }
                            Toast.makeText(connectIQAppSettingsActivity, connectIQAppSettingsActivity.getText(R.string.txt_error_occurred), 0).show();
                            connectIQAppSettingsActivity.da();
                        }
                        return Unit.INSTANCE;
                    case 2:
                        Boolean bool = (Boolean) obj;
                        ConnectIQAppSettingsActivity.a aVar6 = ConnectIQAppSettingsActivity.f32003k;
                        y.f136664a.getClass();
                        y.a.a("ConnectIQAppSettingsActivity", "deviceTimeoutLiveData isAppSettingsFinished " + bool);
                        Toast.makeText(connectIQAppSettingsActivity, connectIQAppSettingsActivity.getString(R.string.device_communication_error_msg), 0).show();
                        if (bool.booleanValue()) {
                            connectIQAppSettingsActivity.ca(false);
                        } else {
                            connectIQAppSettingsActivity.da();
                        }
                        return Unit.INSTANCE;
                    case 3:
                        g3 g3Var3 = (g3) obj;
                        ConnectIQAppSettingsActivity.a aVar7 = ConnectIQAppSettingsActivity.f32003k;
                        int i24 = ConnectIQAppSettingsActivity.b.f32014a[g3Var3.f35300a.ordinal()];
                        if (i24 == 1) {
                            String string6 = connectIQAppSettingsActivity.getString(R.string.txt_loading);
                            string6.getClass();
                            connectIQAppSettingsActivity.ga(string6);
                        } else if (i24 == 2) {
                            byte[] bArr = (byte[]) g3Var3.f35301b;
                            UUID uuidFromString = UUID.fromString(connectIQAppSettingsActivity.f32008e);
                            if (uuidFromString == null || bArr == null) {
                                Toast.makeText(connectIQAppSettingsActivity, connectIQAppSettingsActivity.getText(R.string.txt_error_occurred), 0).show();
                                connectIQAppSettingsActivity.da();
                            } else {
                                f fVarEa = connectIQAppSettingsActivity.ea();
                                fVarEa.f193829h.m(g3.a.c(g3.f35298f));
                                b0 b0VarE = b0.e();
                                f.d dVar = fVarEa.f193839r;
                                b0VarE.getClass();
                                i2.d("ConnectIQRequestManager", "#saveApplicationSettings , " + uuidFromString.toString());
                                GDIConnectIQAppSettingsProto.SaveAppSettingsRequest.Builder builderNewBuilder = GDIConnectIQAppSettingsProto.SaveAppSettingsRequest.newBuilder();
                                builderNewBuilder.setAppIdentifier(ByteString.copyFrom(com.garmin.android.apps.connectmobile.connectiq.p0.d(uuidFromString)));
                                builderNewBuilder.setSettingsValues(ByteString.copyFrom(bArr));
                                GDIConnectIQAppSettingsProto.ConnectIQAppSettingsService.Builder builderNewBuilder2 = GDIConnectIQAppSettingsProto.ConnectIQAppSettingsService.newBuilder();
                                builderNewBuilder2.setSaveAppSettingsRequest(builderNewBuilder);
                                GDISmartProto.Smart.Builder builderNewBuilder3 = GDISmartProto.Smart.newBuilder();
                                builderNewBuilder3.setExtension(GDIConnectIQAppSettingsExtension.connectIqAppSettingsService, builderNewBuilder2.build());
                                ProtobufRequestManager.getInstance().initiateRequest(builderNewBuilder3.build(), b0VarE.f31823a, new k0(b0VarE, dVar));
                            }
                        } else {
                            if (i24 != 3) {
                                u0.r();
                                return null;
                            }
                            Toast.makeText(connectIQAppSettingsActivity, connectIQAppSettingsActivity.getText(R.string.txt_error_occurred), 0).show();
                            connectIQAppSettingsActivity.da();
                        }
                        return Unit.INSTANCE;
                    case 4:
                        ConnectIQAppSettingsActivity.a aVar8 = ConnectIQAppSettingsActivity.f32003k;
                        int i25 = ConnectIQAppSettingsActivity.b.f32014a[((g3) obj).f35300a.ordinal()];
                        if (i25 == 1) {
                            String string7 = connectIQAppSettingsActivity.getString(R.string.txt_loading);
                            string7.getClass();
                            connectIQAppSettingsActivity.ga(string7);
                        } else if (i25 == 2) {
                            Toast.makeText(connectIQAppSettingsActivity, connectIQAppSettingsActivity.getText(R.string.msg_settings_saved_successfully), 0).show();
                            connectIQAppSettingsActivity.da();
                        } else {
                            if (i25 != 3) {
                                u0.r();
                                return null;
                            }
                            Toast.makeText(connectIQAppSettingsActivity, connectIQAppSettingsActivity.getText(R.string.txt_error_occurred), 0).show();
                            connectIQAppSettingsActivity.da();
                        }
                        return Unit.INSTANCE;
                    default:
                        Boolean bool2 = (Boolean) obj;
                        ConnectIQAppSettingsActivity.a aVar9 = ConnectIQAppSettingsActivity.f32003k;
                        bool2.getClass();
                        boolean zBooleanValue = bool2.booleanValue();
                        Menu menu2 = connectIQAppSettingsActivity.f32007d;
                        if (menu2 != null && (item2 = menu2.getItem(0)) != null) {
                            item2.setVisible(zBooleanValue);
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
        final int i24 = 5;
        ea().f193832k.f(this, new c(new l(this) { // from class: x10.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConnectIQAppSettingsActivity f188375b;

            {
                this.f188375b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Object invoke(Object obj) {
                MenuItem item2;
                int i110 = i24;
                int i111 = 1;
                ConnectIQAppSettingsActivity connectIQAppSettingsActivity = this.f188375b;
                switch (i110) {
                    case 0:
                        g3 g3Var = (g3) obj;
                        ConnectIQAppSettingsActivity.a aVar2 = ConnectIQAppSettingsActivity.f32003k;
                        int i112 = ConnectIQAppSettingsActivity.b.f32014a[g3Var.f35300a.ordinal()];
                        if (i112 == 1) {
                            String string3 = connectIQAppSettingsActivity.getString(R.string.txt_loading);
                            string3.getClass();
                            connectIQAppSettingsActivity.ga(string3);
                        } else if (i112 == 2) {
                            connectIQAppSettingsActivity.ca(true);
                            connectIQAppSettingsActivity.ea().x4(connectIQAppSettingsActivity.ea().y4(connectIQAppSettingsActivity.f32008e, connectIQAppSettingsActivity.f32009f, connectIQAppSettingsActivity.f32011h, connectIQAppSettingsActivity.f32012i), (String) g3Var.f35301b, true);
                        } else {
                            if (i112 != 3) {
                                u0.r();
                                return null;
                            }
                            connectIQAppSettingsActivity.ea().x4(connectIQAppSettingsActivity.ea().y4(connectIQAppSettingsActivity.f32008e, connectIQAppSettingsActivity.f32009f, connectIQAppSettingsActivity.f32011h, connectIQAppSettingsActivity.f32012i), null, false);
                            connectIQAppSettingsActivity.ca(false);
                            e.a aVar3 = new e.a(connectIQAppSettingsActivity);
                            aVar3.setMessage(R.string.connect_iq_it_error).setTitle(R.string.dialog_title_error);
                            aVar3.setPositiveButton(R.string.lbl_close, new b(connectIQAppSettingsActivity, i111));
                            if (!connectIQAppSettingsActivity.isFinishing()) {
                                aVar3.create().show();
                            }
                        }
                        return Unit.INSTANCE;
                    case 1:
                        g3 g3Var2 = (g3) obj;
                        ConnectIQAppSettingsActivity.a aVar4 = ConnectIQAppSettingsActivity.f32003k;
                        y.a aVar5 = y.f136664a;
                        p pVar = g3Var2.f35300a;
                        Object obj2 = g3Var2.f35301b;
                        String str5 = "ciqSettingsLiveData " + pVar + StringUtils.SPACE + obj2;
                        aVar5.getClass();
                        y.a.a("ConnectIQAppSettingsActivity", str5);
                        int i113 = ConnectIQAppSettingsActivity.b.f32014a[g3Var2.f35300a.ordinal()];
                        if (i113 == 1) {
                            String string4 = connectIQAppSettingsActivity.getString(R.string.txt_loading);
                            string4.getClass();
                            connectIQAppSettingsActivity.ga(string4);
                        } else if (i113 == 2) {
                            String str6 = (String) obj2;
                            if (str6 == null) {
                                str6 = "";
                            }
                            String strY4 = connectIQAppSettingsActivity.ea().y4(connectIQAppSettingsActivity.f32008e, connectIQAppSettingsActivity.f32009f, connectIQAppSettingsActivity.f32011h, connectIQAppSettingsActivity.f32012i);
                            if (str6.length() == 0) {
                                str6 = "{}";
                            }
                            String string5 = new JSONObject(ConnectIQAppSettingsActivity.ha(new JSONObject(str6), new wy2.c(23))).toString();
                            Charset charset = d53.c.f57666b;
                            String strN = fb1.c.n("userSettings=", URLEncoder.encode(string5, charset.name()));
                            WebView webView4 = connectIQAppSettingsActivity.f32005b;
                            if (webView4 == null) {
                                s.m("appSettingsWebView");
                                throw null;
                            }
                            byte[] bytes = strN.getBytes(charset);
                            bytes.getClass();
                            webView4.postUrl(strY4, bytes);
                        } else {
                            if (i113 != 3) {
                                u0.r();
                                return null;
                            }
                            Toast.makeText(connectIQAppSettingsActivity, connectIQAppSettingsActivity.getText(R.string.txt_error_occurred), 0).show();
                            connectIQAppSettingsActivity.da();
                        }
                        return Unit.INSTANCE;
                    case 2:
                        Boolean bool = (Boolean) obj;
                        ConnectIQAppSettingsActivity.a aVar6 = ConnectIQAppSettingsActivity.f32003k;
                        y.f136664a.getClass();
                        y.a.a("ConnectIQAppSettingsActivity", "deviceTimeoutLiveData isAppSettingsFinished " + bool);
                        Toast.makeText(connectIQAppSettingsActivity, connectIQAppSettingsActivity.getString(R.string.device_communication_error_msg), 0).show();
                        if (bool.booleanValue()) {
                            connectIQAppSettingsActivity.ca(false);
                        } else {
                            connectIQAppSettingsActivity.da();
                        }
                        return Unit.INSTANCE;
                    case 3:
                        g3 g3Var3 = (g3) obj;
                        ConnectIQAppSettingsActivity.a aVar7 = ConnectIQAppSettingsActivity.f32003k;
                        int i25 = ConnectIQAppSettingsActivity.b.f32014a[g3Var3.f35300a.ordinal()];
                        if (i25 == 1) {
                            String string6 = connectIQAppSettingsActivity.getString(R.string.txt_loading);
                            string6.getClass();
                            connectIQAppSettingsActivity.ga(string6);
                        } else if (i25 == 2) {
                            byte[] bArr = (byte[]) g3Var3.f35301b;
                            UUID uuidFromString = UUID.fromString(connectIQAppSettingsActivity.f32008e);
                            if (uuidFromString == null || bArr == null) {
                                Toast.makeText(connectIQAppSettingsActivity, connectIQAppSettingsActivity.getText(R.string.txt_error_occurred), 0).show();
                                connectIQAppSettingsActivity.da();
                            } else {
                                f fVarEa = connectIQAppSettingsActivity.ea();
                                fVarEa.f193829h.m(g3.a.c(g3.f35298f));
                                b0 b0VarE = b0.e();
                                f.d dVar = fVarEa.f193839r;
                                b0VarE.getClass();
                                i2.d("ConnectIQRequestManager", "#saveApplicationSettings , " + uuidFromString.toString());
                                GDIConnectIQAppSettingsProto.SaveAppSettingsRequest.Builder builderNewBuilder = GDIConnectIQAppSettingsProto.SaveAppSettingsRequest.newBuilder();
                                builderNewBuilder.setAppIdentifier(ByteString.copyFrom(com.garmin.android.apps.connectmobile.connectiq.p0.d(uuidFromString)));
                                builderNewBuilder.setSettingsValues(ByteString.copyFrom(bArr));
                                GDIConnectIQAppSettingsProto.ConnectIQAppSettingsService.Builder builderNewBuilder2 = GDIConnectIQAppSettingsProto.ConnectIQAppSettingsService.newBuilder();
                                builderNewBuilder2.setSaveAppSettingsRequest(builderNewBuilder);
                                GDISmartProto.Smart.Builder builderNewBuilder3 = GDISmartProto.Smart.newBuilder();
                                builderNewBuilder3.setExtension(GDIConnectIQAppSettingsExtension.connectIqAppSettingsService, builderNewBuilder2.build());
                                ProtobufRequestManager.getInstance().initiateRequest(builderNewBuilder3.build(), b0VarE.f31823a, new k0(b0VarE, dVar));
                            }
                        } else {
                            if (i25 != 3) {
                                u0.r();
                                return null;
                            }
                            Toast.makeText(connectIQAppSettingsActivity, connectIQAppSettingsActivity.getText(R.string.txt_error_occurred), 0).show();
                            connectIQAppSettingsActivity.da();
                        }
                        return Unit.INSTANCE;
                    case 4:
                        ConnectIQAppSettingsActivity.a aVar8 = ConnectIQAppSettingsActivity.f32003k;
                        int i26 = ConnectIQAppSettingsActivity.b.f32014a[((g3) obj).f35300a.ordinal()];
                        if (i26 == 1) {
                            String string7 = connectIQAppSettingsActivity.getString(R.string.txt_loading);
                            string7.getClass();
                            connectIQAppSettingsActivity.ga(string7);
                        } else if (i26 == 2) {
                            Toast.makeText(connectIQAppSettingsActivity, connectIQAppSettingsActivity.getText(R.string.msg_settings_saved_successfully), 0).show();
                            connectIQAppSettingsActivity.da();
                        } else {
                            if (i26 != 3) {
                                u0.r();
                                return null;
                            }
                            Toast.makeText(connectIQAppSettingsActivity, connectIQAppSettingsActivity.getText(R.string.txt_error_occurred), 0).show();
                            connectIQAppSettingsActivity.da();
                        }
                        return Unit.INSTANCE;
                    default:
                        Boolean bool2 = (Boolean) obj;
                        ConnectIQAppSettingsActivity.a aVar9 = ConnectIQAppSettingsActivity.f32003k;
                        bool2.getClass();
                        boolean zBooleanValue = bool2.booleanValue();
                        Menu menu2 = connectIQAppSettingsActivity.f32007d;
                        if (menu2 != null && (item2 = menu2.getItem(0)) != null) {
                            item2.setVisible(zBooleanValue);
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
        String str5 = this.f32010g;
        Long lJ = str5 != null ? d53.t.j(str5) : null;
        UUID uuidFromString = UUID.fromString(this.f32008e);
        if (lJ == null || uuidFromString == null) {
            Toast.makeText(this, getText(R.string.txt_error_occurred), 0).show();
            da();
            return;
        }
        y10.f fVarEa = ea();
        long jLongValue = lJ.longValue();
        fVarEa.f193825d.m(g3.a.c(g3.f35298f));
        fVarEa.f193823b = false;
        fVarEa.f193837p.start();
        b0.e().f31823a = jLongValue;
        b0 b0VarE = b0.e();
        y10.h hVar = new y10.h(fVarEa);
        b0VarE.getClass();
        i2.d("ConnectIQRequestManager", "#requestApplicationSettings , " + uuidFromString.toString());
        b0VarE.f31824b = null;
        b0VarE.f31825c = null;
        GDIConnectIQAppSettingsProto.GetAppSettingsRequest.Builder builderNewBuilder = GDIConnectIQAppSettingsProto.GetAppSettingsRequest.newBuilder();
        builderNewBuilder.setAppIdentifier(ByteString.copyFrom(com.garmin.android.apps.connectmobile.connectiq.p0.d(uuidFromString)));
        GDIConnectIQAppSettingsProto.ConnectIQAppSettingsService.Builder builderNewBuilder2 = GDIConnectIQAppSettingsProto.ConnectIQAppSettingsService.newBuilder();
        builderNewBuilder2.setGetAppSettingsRequest(builderNewBuilder);
        GDISmartProto.Smart.Builder builderNewBuilder3 = GDISmartProto.Smart.newBuilder();
        builderNewBuilder3.setExtension(GDIConnectIQAppSettingsExtension.connectIqAppSettingsService, builderNewBuilder2.build());
        ProtobufRequestManager.getInstance().initiateRequest(builderNewBuilder3.build(), b0VarE.f31823a, new i0(b0VarE, hVar));
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        menu.getClass();
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.getClass();
        super.onCreateOptionsMenu(menu);
        menuInflater.inflate(R.menu.connect_iq_reorder, menu);
        this.f32007d = menu;
        MenuItem item = menu.getItem(0);
        if (item == null) {
            return true;
        }
        item.setVisible(false);
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        int itemId = menuItem.getItemId();
        if (itemId != R.id.menu_item_done) {
            if (itemId != 16908332) {
                return super.onOptionsItemSelected(menuItem);
            }
            fa();
            return true;
        }
        WebView webView = this.f32005b;
        if (webView != null) {
            webView.evaluateJavascript("handleFormSubmit()", new x10.a(this, 1));
            return true;
        }
        s.m("appSettingsWebView");
        throw null;
    }

    @Override // com.garmin.android.apps.connectmobile.c, androidx.fragment.app.m, android.app.Activity
    public final void onPause() {
        oi2.a.C2513a c2513a = oi2.a.f132270a;
        y10.f.b bVar = ea().f193838q;
        c2513a.getClass();
        oi2.a.C2513a.c(bVar);
        super.onPause();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, android.app.Activity
    public final void onResume() {
        super.onResume();
        oi2.a.C2513a c2513a = oi2.a.f132270a;
        y10.f.b bVar = ea().f193838q;
        c2513a.getClass();
        oi2.a.C2513a.b(bVar);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/connectiq/settings/ConnectIQAppSettingsActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
