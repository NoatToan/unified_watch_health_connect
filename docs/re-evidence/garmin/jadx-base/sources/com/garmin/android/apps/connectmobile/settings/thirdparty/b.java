package com.garmin.android.apps.connectmobile.settings.thirdparty;

import ab.j;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.fragment.app.Fragment;
import com.garmin.android.apps.connectmobile.R;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/thirdparty/b;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "b", "a", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends Fragment {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f43967d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WebView f43968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ak1.c f43969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f43970c;

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.settings.thirdparty.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/thirdparty/b$b;", "", "<init>", "(Lcom/garmin/android/apps/connectmobile/settings/thirdparty/b;)V", "", "result", "", "getAuthCode", "(Ljava/lang/String;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class C0823b {
        public C0823b() {
        }

        @JavascriptInterface
        public final void getAuthCode(String result) {
            Matcher matcher = Pattern.compile(">(.+?)</pre>").matcher(result);
            String strGroup = matcher.find() ? matcher.group(1) : null;
            b bVar = b.this;
            bVar.requireActivity().runOnUiThread(new j(2, bVar, strGroup));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        try {
            this.f43969b = (ak1.c) context;
        } catch (ClassCastException unused) {
            p6.b.m(context, ak1.c.class.getName());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f43970c = arguments.getString("login_url");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.fragment_office365_login, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        WebView webView;
        view2.getClass();
        WebView webView2 = (WebView) view2.findViewById(R.id.web_view);
        this.f43968a = webView2;
        if (webView2 != null) {
            webView2.addJavascriptInterface(new C0823b(), "htmlResponse");
        }
        WebView webView3 = this.f43968a;
        WebSettings settings = webView3 != null ? webView3.getSettings() : null;
        if (settings != null) {
            settings.setJavaScriptEnabled(true);
        }
        WebView webView4 = this.f43968a;
        if (webView4 != null) {
            webView4.setWebViewClient(new ak1.b(this));
        }
        String str = this.f43970c;
        if (str == null || (webView = this.f43968a) == null) {
            return;
        }
        webView.loadUrl(str);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/thirdparty/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "JAVASCRIPT_CALLBACK_HTML_TAG", "RESPONSE_HTML_PATTERN", "LOGIN_URL_TAG", "OFFICE_CALLBACK_URL_SUFFIX", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
