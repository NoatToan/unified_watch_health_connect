package com.garmin.android.apps.connectmobile.settings;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Base64;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.garmin.android.apps.connectmobile.GarminConnectMobileApp;
import com.garmin.android.apps.connectmobile.R;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import d53.w;
import hb2.h;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Locale;
import lc.u0;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p92.y;
import yr2.g;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/GarminPayLegalActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class GarminPayLegalActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f41563d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Logger f41564e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WebView f41565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Locale f41566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ij0.a.EnumC1792a f41567c;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f41568a;

        static {
            int[] iArr = new int[ij0.a.EnumC1792a.values().length];
            try {
                iArr[ij0.a.EnumC1792a.GARMINPAY_PRIVACY_POLICY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ij0.a.EnumC1792a.GARMINPAY_TERMS_CONDITION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f41568a = iArr;
        }
    }

    static {
        int i14 = gt2.c.f79010a;
        f41564e = gt2.b.f79005a.h("GarminPayLegalActivity");
    }

    public GarminPayLegalActivity() {
        GarminConnectMobileApp.f28685g.getClass();
        Locale localeA = h.a(GarminConnectMobileApp.a.a());
        localeA.getClass();
        this.f41566b = localeA;
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Object serializableExtra;
        super.onCreate(bundle);
        setContentView(R.layout.activity_garmin_pay_privacy_policy);
        View viewFindViewById = findViewById(R.id.containedWebView);
        viewFindViewById.getClass();
        this.f41565a = (WebView) viewFindViewById;
        initActionBar(true, R.string.app_name_garmin_connect);
        Intent intent = getIntent();
        if (Build.VERSION.SDK_INT >= 33) {
            serializableExtra = intent != null ? intent.getSerializableExtra("extra_garminpay_legal_type", ij0.a.EnumC1792a.class) : null;
        } else {
            Object serializableExtra2 = intent != null ? intent.getSerializableExtra("extra_garminpay_legal_type") : null;
            if (!(serializableExtra2 instanceof ij0.a.EnumC1792a)) {
                serializableExtra2 = null;
            }
            serializableExtra = (ij0.a.EnumC1792a) serializableExtra2;
        }
        ij0.a.EnumC1792a enumC1792a = (ij0.a.EnumC1792a) serializableExtra;
        this.f41567c = enumC1792a;
        if (enumC1792a == null) {
            f41564e.error("onCreate: legalType must not empty...");
            finish();
        }
        WebView webView = this.f41565a;
        if (webView == null) {
            s.m("containerVW");
            throw null;
        }
        webView.setBackgroundColor(-1);
        webView.setLayerType(1, null);
        webView.clearCache(true);
        webView.setScrollbarFadingEnabled(true);
        webView.setVerticalScrollBarEnabled(false);
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(settings.getDomStorageEnabled());
        settings.setCacheMode(settings.getCacheMode());
        settings.setDatabaseEnabled(settings.getDatabaseEnabled());
        if (je.c.a("FORCE_DARK")) {
            int i14 = getResources().getConfiguration().uiMode & 48;
            if (i14 == 0 || i14 == 16) {
                je.a.b(webView.getSettings(), 0);
                return;
            }
            if (i14 == 32) {
                je.a.b(webView.getSettings(), 2);
                return;
            }
            y.f136664a.getClass();
            if (!w.J("initViews: No defined configuration for the web view. Use default.")) {
                int i15 = gt2.c.f79010a;
                gt2.b.f79005a.i("GConsentLib").debug("initViews: No defined configuration for the web view. Use default.");
            }
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, android.app.Activity
    public final void onResume() {
        String language;
        super.onResume();
        ij0.a.EnumC1792a enumC1792a = this.f41567c;
        if (enumC1792a != null) {
            int i14 = b.f41568a[enumC1792a.ordinal()];
            Locale locale = this.f41566b;
            if (i14 == 1) {
                WebView webView = this.f41565a;
                if (webView == null) {
                    s.m("containerVW");
                    throw null;
                }
                com.garmin.android.lib.legal.d.f49991k.getClass();
                webView.loadUrl(String.format(ij0.a.EnumC1792a.GARMINPAY_PRIVACY_POLICY.f93812a, Arrays.copyOf(new Object[]{com.garmin.android.lib.legal.d.a.a(locale).f50047b}, 1)));
                return;
            }
            if (i14 != 2) {
                u0.r();
                return;
            }
            WebView webView2 = this.f41565a;
            if (webView2 == null) {
                s.m("containerVW");
                throw null;
            }
            JsonObject jsonObject = new JsonObject();
            if (h.d(locale).equals(h.d(Locale.TAIWAN))) {
                language = com.garmin.android.lib.legal.d.TW.f50046a;
            } else if (s.g(locale.getLanguage(), "pt")) {
                language = s.g(locale.getCountry(), "BR") ? "pt-BR" : "pt-PT";
            } else {
                language = locale.getLanguage();
                language.getClass();
            }
            jsonObject.addProperty("language", language);
            kj0.b.f104940a.getClass();
            jsonObject.addProperty("baseLangUrl", g.b(kj0.b.a()).concat("/com.garmin.connect/locale/garmin-pay/2.0/"));
            String json = new Gson().toJson((JsonElement) jsonObject);
            json.getClass();
            Charset charset = StandardCharsets.UTF_8;
            charset.getClass();
            byte[] bytes = json.getBytes(charset);
            bytes.getClass();
            webView2.loadUrl(ij0.a.EnumC1792a.GARMINPAY_TERMS_CONDITION.f93812a + "?config=" + Base64.encodeToString(bytes, 8));
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/GarminPayLegalActivity$a;", "", "<init>", "()V", "Lorg/slf4j/Logger;", "logger", "Lorg/slf4j/Logger;", "", "EXTRA_GARMINPAY_LEGAL_TYPE", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
