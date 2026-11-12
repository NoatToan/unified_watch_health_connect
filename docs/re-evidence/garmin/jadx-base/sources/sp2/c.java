package sp2;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.fragment.FitPayIssuerBankTermsConditionFragment;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lsp2/c;", "Landroid/webkit/WebViewClient;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FitPayIssuerBankTermsConditionFragment f160517a;

    public c(FitPayIssuerBankTermsConditionFragment fitPayIssuerBankTermsConditionFragment) {
        this.f160517a = fitPayIssuerBankTermsConditionFragment;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        FitPayIssuerBankTermsConditionFragment fitPayIssuerBankTermsConditionFragment = this.f160517a;
        WebView webView2 = fitPayIssuerBankTermsConditionFragment.f51668d;
        if (webView2 == null) {
            s.m("webViewContainer");
            throw null;
        }
        if (je.c.a("FORCE_DARK")) {
            int i14 = fitPayIssuerBankTermsConditionFragment.getResources().getConfiguration().uiMode & 48;
            if (i14 == 0 || i14 == 16) {
                webView2.evaluateJavascript("javascript:document.body.style.setProperty(\"color\", \"black\");", null);
            } else if (i14 != 32) {
                ((Logger) fitPayIssuerBankTermsConditionFragment.f51671g.getValue()).debug("initViews: No defined configuration for the web view. Use default.");
            } else {
                webView2.evaluateJavascript("javascript:document.body.style.setProperty(\"color\", \"white\");", null);
            }
        }
        super.onPageFinished(webView, str);
    }
}
