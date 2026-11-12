package com.garmin.feature.garminpay.providers.gpay.challenge;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.URLUtil;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.connectiq.BuildConfig;
import com.garmin.feature.garminpay.providers.gpay.challenge.ChallengeActivity;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import d53.w;
import eo2.d;
import hb2.j;
import je.c;
import lc.u0;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import r22.m0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/challenge/ChallengeActivity;", "Lhn2/c;", "<init>", "()V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ChallengeActivity extends hn2.c {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f51119n = new a(null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Logger f51120o;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public m0 f51121g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a.EnumC1054a f51122h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f51123i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f51124j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f51125k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public WebView f51126l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final c f51127m = new c();

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f51131a;

        static {
            int[] iArr = new int[a.EnumC1054a.values().length];
            try {
                iArr[a.EnumC1054a.PURCHASE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.EnumC1054a.CONFIRMED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f51131a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/feature/garminpay/providers/gpay/challenge/ChallengeActivity$c", "Landroid/webkit/WebViewClient;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends WebViewClient {
        public c() {
        }

        @Override // android.webkit.WebViewClient
        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            if (str == null) {
                ChallengeActivity.f51120o.warn("onPageStarted: no url");
                return;
            }
            a aVar = ChallengeActivity.f51119n;
            ChallengeActivity challengeActivity = ChallengeActivity.this;
            challengeActivity.getClass();
            ChallengeActivity.f51120o.debug("handleResponse(): url=".concat(str));
            if (w.z(str, "apps-test.garmin.com", false) || w.z(str, "apps.garmin.com", false)) {
                WebView webView2 = challengeActivity.f51126l;
                if (webView2 == null) {
                    s.m("containerVW");
                    throw null;
                }
                webView2.setVisibility(4);
                challengeActivity.ca(str);
            }
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            if ((webResourceRequest != null ? webResourceRequest.getUrl() : null) != null) {
                return false;
            }
            ChallengeActivity.f51120o.warn("shouldOverrideUrlLoading: no url");
            return false;
        }
    }

    static {
        int i14 = gt2.c.f79010a;
        f51120o = gt2.b.f79005a.h("PAY#ChallengeActivity");
    }

    public final void ca(String str) {
        Intent intent;
        Intent launchIntentForPackage;
        Logger logger = f51120o;
        com.airbnb.lottie.animation.keyframe.a.w("navigateToConnectIQApp: ", str, logger);
        try {
            if (str == null) {
                logger.debug("navigateToConnectIQApp: callbackUrl is null");
                da();
                return;
            }
            if (getPackageManager().getLaunchIntentForPackage(str) != null) {
                logger.debug("navigateToConnectIQApp: For package ids");
                launchIntentForPackage = getPackageManager().getLaunchIntentForPackage(str);
            } else {
                if (URLUtil.isValidUrl(str)) {
                    logger.debug("navigateToConnectIQApp: For http or https formats");
                    intent = new Intent("android.intent.action.VIEW");
                    intent.setData(Uri.parse(str));
                    intent.addFlags(268435456);
                } else {
                    logger.debug("navigateToConnectIQApp: For myapp://action formats");
                    intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                }
                launchIntentForPackage = intent;
            }
            if (launchIntentForPackage != null) {
                startActivity(launchIntentForPackage);
            } else {
                logger.error("navigateToConnectIQApp: intent is null");
            }
            finish();
        } catch (Exception e4) {
            logger.error("navigateToConnectIQApp: Exception: " + e4.getLocalizedMessage());
            da();
        }
    }

    public final void da() {
        Logger logger = f51120o;
        logger.error("navigateToConnectIQAppUsingAppId");
        if (!j.b(this, BuildConfig.ARTIFACT_GROUP_ID)) {
            logger.error("navigateToConnectIQAppUsingAppId: ConnectIQ App is not installed. Will exit web view.");
            finish();
        } else {
            Intent intentA = j.a(this, BuildConfig.ARTIFACT_GROUP_ID);
            if (intentA != null) {
                startActivity(intentA);
            }
        }
    }

    @Override // hn2.c, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String string;
        String string2;
        super.onCreate(bundle);
        f51120o.debug("onCreate");
        R9(R.layout.activity_challenge, hn2.c.a.UP, getResources().getString(R.string.wallet_garmin_pay));
        Bundle extras = getIntent().getExtras();
        if (extras != null && (string2 = extras.getString("PURCHASE_CONFIRMATION_PROMPT_TYPE_EXTRA")) != null) {
            this.f51122h = a.EnumC1054a.valueOf(string2);
        }
        Bundle extras2 = getIntent().getExtras();
        this.f51123i = extras2 != null ? extras2.getString("PURCHASE_CONFIRMATION_BANK_NAME_EXTRA") : null;
        Bundle extras3 = getIntent().getExtras();
        this.f51124j = extras3 != null ? extras3.getString("PURCHASE_CONFIRMATION_CHALLENGE_URL_EXTRA") : null;
        Bundle extras4 = getIntent().getExtras();
        this.f51125k = extras4 != null ? extras4.getString("PURCHASE_CONFIRMATION_REDIRECT_URL_EXTRA") : null;
        View viewFindViewById = findViewById(R.id.containedWebView);
        viewFindViewById.getClass();
        WebView webView = (WebView) viewFindViewById;
        this.f51126l = webView;
        webView.setVisibility(8);
        hn2.c.ba(this, Boolean.TRUE, null, null, 14);
        a.EnumC1054a enumC1054a = this.f51122h;
        int i14 = enumC1054a == null ? -1 : b.f51131a[enumC1054a.ordinal()];
        if (i14 == -1) {
            final int i15 = 3;
            m0 m0VarC = m0.a.c(m0.f149759e, getResources().getString(R.string.dialog_title_error), getResources().getString(R.string.generic_error), R.string.dialog_ok, new View.OnClickListener(this) { // from class: do2.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ChallengeActivity f60630b;

                {
                    this.f60630b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i16 = i15;
                    ChallengeActivity challengeActivity = this.f60630b;
                    switch (i16) {
                        case 0:
                            WebView webView2 = challengeActivity.f51126l;
                            if (webView2 == null) {
                                s.m("containerVW");
                                throw null;
                            }
                            webView2.setBackgroundColor(-1);
                            webView2.setLayerType(1, null);
                            webView2.clearCache(true);
                            webView2.setScrollbarFadingEnabled(true);
                            webView2.setVerticalScrollBarEnabled(false);
                            webView2.setWebViewClient(challengeActivity.f51127m);
                            WebSettings settings = webView2.getSettings();
                            settings.setJavaScriptEnabled(true);
                            settings.setDomStorageEnabled(settings.getDomStorageEnabled());
                            settings.setCacheMode(settings.getCacheMode());
                            settings.setDatabaseEnabled(settings.getDatabaseEnabled());
                            if (c.a("FORCE_DARK")) {
                                int i17 = challengeActivity.getResources().getConfiguration().uiMode & 48;
                                if (i17 == 0 || i17 == 16) {
                                    je.a.b(webView2.getSettings(), 0);
                                } else if (i17 != 32) {
                                    ChallengeActivity.f51120o.debug("configureWV: No defined configuration for the web view. Use default.");
                                } else {
                                    je.a.b(webView2.getSettings(), 2);
                                }
                            }
                            hn2.c.ba(challengeActivity, Boolean.FALSE, null, null, 14);
                            WebView webView3 = challengeActivity.f51126l;
                            if (webView3 == null) {
                                s.m("containerVW");
                                throw null;
                            }
                            webView3.setVisibility(0);
                            String str = challengeActivity.f51124j;
                            if (str != null) {
                                WebView webView4 = challengeActivity.f51126l;
                                if (webView4 != null) {
                                    webView4.loadUrl(str);
                                    return;
                                } else {
                                    s.m("containerVW");
                                    throw null;
                                }
                            }
                            return;
                        case 1:
                            challengeActivity.ca(challengeActivity.f51125k);
                            challengeActivity.finish();
                            return;
                        case 2:
                            ChallengeActivity.a aVar = ChallengeActivity.f51119n;
                            challengeActivity.finish();
                            return;
                        default:
                            ChallengeActivity.a aVar2 = ChallengeActivity.f51119n;
                            challengeActivity.finish();
                            return;
                    }
                }
            }, 0, null, PsExtractor.VIDEO_STREAM_MASK);
            this.f51121g = m0VarC;
            m0VarC.setCancelable(false);
            m0 m0Var = this.f51121g;
            if (m0Var != null) {
                m0Var.show(getSupportFragmentManager(), "GCMFeatureInfoDialog");
                return;
            }
            return;
        }
        if (i14 != 1) {
            if (i14 != 2) {
                u0.r();
                return;
            }
            final int i16 = 2;
            m0 m0VarC2 = m0.a.c(m0.f149759e, getResources().getString(R.string.ciq_purchase_prompt_confirmed_title), getResources().getString(R.string.ciq_purchase_prompt_confirmed_message), R.string.ciq_purchase_prompt_return_to_connect_iq, new cw2.b(5, this, this.f51125k), R.string.lbl_close, new View.OnClickListener(this) { // from class: do2.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ChallengeActivity f60630b;

                {
                    this.f60630b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i17 = i16;
                    ChallengeActivity challengeActivity = this.f60630b;
                    switch (i17) {
                        case 0:
                            WebView webView2 = challengeActivity.f51126l;
                            if (webView2 == null) {
                                s.m("containerVW");
                                throw null;
                            }
                            webView2.setBackgroundColor(-1);
                            webView2.setLayerType(1, null);
                            webView2.clearCache(true);
                            webView2.setScrollbarFadingEnabled(true);
                            webView2.setVerticalScrollBarEnabled(false);
                            webView2.setWebViewClient(challengeActivity.f51127m);
                            WebSettings settings = webView2.getSettings();
                            settings.setJavaScriptEnabled(true);
                            settings.setDomStorageEnabled(settings.getDomStorageEnabled());
                            settings.setCacheMode(settings.getCacheMode());
                            settings.setDatabaseEnabled(settings.getDatabaseEnabled());
                            if (c.a("FORCE_DARK")) {
                                int i18 = challengeActivity.getResources().getConfiguration().uiMode & 48;
                                if (i18 == 0 || i18 == 16) {
                                    je.a.b(webView2.getSettings(), 0);
                                } else if (i18 != 32) {
                                    ChallengeActivity.f51120o.debug("configureWV: No defined configuration for the web view. Use default.");
                                } else {
                                    je.a.b(webView2.getSettings(), 2);
                                }
                            }
                            hn2.c.ba(challengeActivity, Boolean.FALSE, null, null, 14);
                            WebView webView3 = challengeActivity.f51126l;
                            if (webView3 == null) {
                                s.m("containerVW");
                                throw null;
                            }
                            webView3.setVisibility(0);
                            String str = challengeActivity.f51124j;
                            if (str != null) {
                                WebView webView4 = challengeActivity.f51126l;
                                if (webView4 != null) {
                                    webView4.loadUrl(str);
                                    return;
                                } else {
                                    s.m("containerVW");
                                    throw null;
                                }
                            }
                            return;
                        case 1:
                            challengeActivity.ca(challengeActivity.f51125k);
                            challengeActivity.finish();
                            return;
                        case 2:
                            ChallengeActivity.a aVar = ChallengeActivity.f51119n;
                            challengeActivity.finish();
                            return;
                        default:
                            ChallengeActivity.a aVar2 = ChallengeActivity.f51119n;
                            challengeActivity.finish();
                            return;
                    }
                }
            }, 192);
            this.f51121g = m0VarC2;
            m0VarC2.setCancelable(false);
            m0 m0Var2 = this.f51121g;
            if (m0Var2 != null) {
                m0Var2.show(getSupportFragmentManager(), "GCMFeatureInfoDialog");
                return;
            }
            return;
        }
        final int i17 = 0;
        View.OnClickListener onClickListener = new View.OnClickListener(this) { // from class: do2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChallengeActivity f60630b;

            {
                this.f60630b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i18 = i17;
                ChallengeActivity challengeActivity = this.f60630b;
                switch (i18) {
                    case 0:
                        WebView webView2 = challengeActivity.f51126l;
                        if (webView2 == null) {
                            s.m("containerVW");
                            throw null;
                        }
                        webView2.setBackgroundColor(-1);
                        webView2.setLayerType(1, null);
                        webView2.clearCache(true);
                        webView2.setScrollbarFadingEnabled(true);
                        webView2.setVerticalScrollBarEnabled(false);
                        webView2.setWebViewClient(challengeActivity.f51127m);
                        WebSettings settings = webView2.getSettings();
                        settings.setJavaScriptEnabled(true);
                        settings.setDomStorageEnabled(settings.getDomStorageEnabled());
                        settings.setCacheMode(settings.getCacheMode());
                        settings.setDatabaseEnabled(settings.getDatabaseEnabled());
                        if (c.a("FORCE_DARK")) {
                            int i19 = challengeActivity.getResources().getConfiguration().uiMode & 48;
                            if (i19 == 0 || i19 == 16) {
                                je.a.b(webView2.getSettings(), 0);
                            } else if (i19 != 32) {
                                ChallengeActivity.f51120o.debug("configureWV: No defined configuration for the web view. Use default.");
                            } else {
                                je.a.b(webView2.getSettings(), 2);
                            }
                        }
                        hn2.c.ba(challengeActivity, Boolean.FALSE, null, null, 14);
                        WebView webView3 = challengeActivity.f51126l;
                        if (webView3 == null) {
                            s.m("containerVW");
                            throw null;
                        }
                        webView3.setVisibility(0);
                        String str = challengeActivity.f51124j;
                        if (str != null) {
                            WebView webView4 = challengeActivity.f51126l;
                            if (webView4 != null) {
                                webView4.loadUrl(str);
                                return;
                            } else {
                                s.m("containerVW");
                                throw null;
                            }
                        }
                        return;
                    case 1:
                        challengeActivity.ca(challengeActivity.f51125k);
                        challengeActivity.finish();
                        return;
                    case 2:
                        ChallengeActivity.a aVar = ChallengeActivity.f51119n;
                        challengeActivity.finish();
                        return;
                    default:
                        ChallengeActivity.a aVar2 = ChallengeActivity.f51119n;
                        challengeActivity.finish();
                        return;
                }
            }
        };
        final int i18 = 1;
        View.OnClickListener onClickListener2 = new View.OnClickListener(this) { // from class: do2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChallengeActivity f60630b;

            {
                this.f60630b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i19 = i18;
                ChallengeActivity challengeActivity = this.f60630b;
                switch (i19) {
                    case 0:
                        WebView webView2 = challengeActivity.f51126l;
                        if (webView2 == null) {
                            s.m("containerVW");
                            throw null;
                        }
                        webView2.setBackgroundColor(-1);
                        webView2.setLayerType(1, null);
                        webView2.clearCache(true);
                        webView2.setScrollbarFadingEnabled(true);
                        webView2.setVerticalScrollBarEnabled(false);
                        webView2.setWebViewClient(challengeActivity.f51127m);
                        WebSettings settings = webView2.getSettings();
                        settings.setJavaScriptEnabled(true);
                        settings.setDomStorageEnabled(settings.getDomStorageEnabled());
                        settings.setCacheMode(settings.getCacheMode());
                        settings.setDatabaseEnabled(settings.getDatabaseEnabled());
                        if (c.a("FORCE_DARK")) {
                            int i110 = challengeActivity.getResources().getConfiguration().uiMode & 48;
                            if (i110 == 0 || i110 == 16) {
                                je.a.b(webView2.getSettings(), 0);
                            } else if (i110 != 32) {
                                ChallengeActivity.f51120o.debug("configureWV: No defined configuration for the web view. Use default.");
                            } else {
                                je.a.b(webView2.getSettings(), 2);
                            }
                        }
                        hn2.c.ba(challengeActivity, Boolean.FALSE, null, null, 14);
                        WebView webView3 = challengeActivity.f51126l;
                        if (webView3 == null) {
                            s.m("containerVW");
                            throw null;
                        }
                        webView3.setVisibility(0);
                        String str = challengeActivity.f51124j;
                        if (str != null) {
                            WebView webView4 = challengeActivity.f51126l;
                            if (webView4 != null) {
                                webView4.loadUrl(str);
                                return;
                            } else {
                                s.m("containerVW");
                                throw null;
                            }
                        }
                        return;
                    case 1:
                        challengeActivity.ca(challengeActivity.f51125k);
                        challengeActivity.finish();
                        return;
                    case 2:
                        ChallengeActivity.a aVar = ChallengeActivity.f51119n;
                        challengeActivity.finish();
                        return;
                    default:
                        ChallengeActivity.a aVar2 = ChallengeActivity.f51119n;
                        challengeActivity.finish();
                        return;
                }
            }
        };
        m0.a aVar = m0.f149759e;
        String string3 = getResources().getString(R.string.ciq_purchase_prompt_confirmation_title);
        String str = this.f51123i;
        if (str == null || (string = getResources().getString(R.string.ciq_purchase_prompt_confirmation_message, str)) == null) {
            string = getResources().getString(R.string.ciq_purchase_prompt_confirmation_message_no_bank_name);
            string.getClass();
        }
        m0 m0VarC3 = m0.a.c(aVar, string3, string, R.string.ciq_purchase_prompt_verify_now, onClickListener, R.string.common_cancel, onClickListener2, 192);
        this.f51121g = m0VarC3;
        m0VarC3.setCancelable(false);
        m0 m0Var3 = this.f51121g;
        if (m0Var3 != null) {
            m0Var3.show(getSupportFragmentManager(), "GCMFeatureInfoDialog");
        }
    }

    @Override // androidx.fragment.app.m, android.app.Activity
    public final void onPause() {
        super.onPause();
        d.f64794a.getClass();
        d.f64796c.set(Boolean.FALSE);
    }

    @Override // hn2.c, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, android.app.Activity
    public final void onResume() {
        super.onResume();
        d.f64794a.getClass();
        d.f64796c.set(Boolean.TRUE);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0010B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0014\u0010\r\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\tR\u0014\u0010\u000e\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\tR\u0014\u0010\u000f\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\t¨\u0006\u0011"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/challenge/ChallengeActivity$a;", "", "<init>", "()V", "Lorg/slf4j/Logger;", "LOGGER", "Lorg/slf4j/Logger;", "", "PURCHASE_CONFIRMATION_PROMPT_TYPE_EXTRA", "Ljava/lang/String;", "PURCHASE_CONFIRMATION_BANK_NAME_EXTRA", "PURCHASE_CONFIRMATION_CHALLENGE_URL_EXTRA", "PURCHASE_CONFIRMATION_REDIRECT_URL_EXTRA", "CIQ_STORE_WEB_PAGE_TEST", "CIQ_STORE_WEB_PAGE_PROD", "CONNECT_IQ_APP_ID", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: com.garmin.feature.garminpay.providers.gpay.challenge.ChallengeActivity$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/challenge/ChallengeActivity$a$a;", "", "<init>", "(Ljava/lang/String;I)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public enum EnumC1054a {
            PURCHASE,
            CONFIRMED
        }

        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static Intent a(a aVar, Context context, EnumC1054a enumC1054a, String str, String str2, String str3, int i14) {
            if ((i14 & 4) != 0) {
                str = null;
            }
            if ((i14 & 8) != 0) {
                str2 = null;
            }
            if ((i14 & 16) != 0) {
                str3 = null;
            }
            aVar.getClass();
            context.getClass();
            enumC1054a.getClass();
            Intent intent = new Intent(context, (Class<?>) ChallengeActivity.class);
            intent.putExtra("PURCHASE_CONFIRMATION_PROMPT_TYPE_EXTRA", enumC1054a.name());
            intent.putExtra("PURCHASE_CONFIRMATION_BANK_NAME_EXTRA", str);
            intent.putExtra("PURCHASE_CONFIRMATION_CHALLENGE_URL_EXTRA", str2);
            intent.putExtra("PURCHASE_CONFIRMATION_REDIRECT_URL_EXTRA", str3);
            return intent;
        }

        private a() {
        }
    }
}
