package ak1;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import d53.u;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lak1/b;", "Landroid/webkit/WebViewClient;", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.settings.thirdparty.b f3695a;

    public b(com.garmin.android.apps.connectmobile.settings.thirdparty.b bVar) {
        this.f3695a = bVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        WebView webView2;
        webView.getClass();
        str.getClass();
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.SETTINGS;
        String strConcat = "Finished loading URL: ".concat(str);
        aVar.getClass();
        i2.a.k(a2Var, "Office365LoginFragment", strConcat);
        if (!u.p(str, "calendar-service/calendarSync/office365/callback", false) || (webView2 = this.f3695a.f43968a) == null) {
            return;
        }
        webView2.loadUrl("javascript:window.htmlResponse.getAuthCode(document.getElementsByTagName('body')[0].innerHTML);");
    }
}
