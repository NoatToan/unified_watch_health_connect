package com.garmin.android.library.mobileauth.ui.mfa;

import android.net.Uri;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebView;
import com.garmin.android.apps.connectmobile.R;
import d53.u;
import d53.w;
import java.net.URI;
import o13.p;
import o53.s0;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import sc2.g;
import tn.k;
import v13.i;
import ze2.j;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/library/mobileauth/ui/mfa/MFACasFlowActivity;", "Lcom/garmin/android/library/mobileauth/ui/mfa/a;", "<init>", "()V", "a", "mobile-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class MFACasFlowActivity extends com.garmin.android.library.mobileauth.ui.mfa.a {
    static {
        new a(null);
    }

    public MFACasFlowActivity() {
        super(g.CAS);
    }

    @Override // com.garmin.android.library.mobileauth.ui.mfa.a, com.garmin.android.library.mobileauth.ui.b
    public final void Y3(WebView webView, String str, String str2) {
        str2.getClass();
        T9();
        ea("onWebViewPageFinishedLoading", str);
        if (w.z(str, str2, false)) {
            if (w.z(str, "/loginEnterMfaCode", false)) {
                Object systemService = getSystemService("input_method");
                systemService.getClass();
                ((InputMethodManager) systemService).showSoftInput(webView, 1);
            } else if (w.z(str, "ticket=", false)) {
                try {
                    webView.stopLoading();
                    webView.loadUrl("file:///android_asset/loading.html");
                    webView.clearHistory();
                    webView.clearCache(true);
                    String queryParameter = Uri.parse(str).getQueryParameter("ticket");
                    queryParameter.getClass();
                    X9(queryParameter);
                } catch (Exception e4) {
                    this.f50497q.error("onWebViewPageFinishedLoading: ".concat(str), (Throwable) e4);
                }
            }
        }
    }

    @Override // com.garmin.android.library.mobileauth.ui.mfa.a
    public final Object Y9(URI uri, String str, p pVar, i iVar) {
        x53.c cVar = s0.f129406a;
        return ge1.b.e0(x53.b.f189152a, new j(this, pVar, uri, str, null), iVar);
    }

    @Override // com.garmin.android.library.mobileauth.ui.mfa.a
    public final String aa() {
        String string = getString(R.string.ssoApplicationName);
        string.getClass();
        return u.v(string, StringUtils.SPACE, "", false);
    }

    @Override // com.garmin.android.library.mobileauth.ui.mfa.a
    public final String ca() {
        String string;
        URI uri = this.f50498r;
        return (uri == null || (string = uri.toString()) == null) ? k.g(ba().f177719a, "/sso/embed") : string;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/library/mobileauth/ui/mfa/MFACasFlowActivity$a;", "", "<init>", "()V", "", "URL_PART_ENTER_MFA_CODE", "Ljava/lang/String;", "mobile-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
