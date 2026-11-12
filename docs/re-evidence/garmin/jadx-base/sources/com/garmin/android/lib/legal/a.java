package com.garmin.android.lib.legal;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.MailTo;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import com.garmin.android.apps.connectmobile.R;
import d53.u;
import java.util.Objects;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/lib/legal/a;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "legal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a extends Fragment {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C0993a f49951g = new C0993a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WebView f49952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f49953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f49954c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f49955d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f49956e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b f49957f = new b();

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/lib/legal/a$b", "Landroid/webkit/WebViewClient;", "legal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends WebViewClient {
        public b() {
        }

        public final void a(Intent intent) {
            a aVar = a.this;
            m activity = aVar.getActivity();
            if (activity == null || activity.isDestroyed() || activity.isFinishing()) {
                return;
            }
            try {
                activity.startActivity(Intent.createChooser(intent, ""));
            } catch (ActivityNotFoundException unused) {
                if (aVar.f49953b != null) {
                    return;
                }
                s.m("url");
                throw null;
            } catch (IllegalStateException unused2) {
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            String str2 = a.this.f49956e;
            if (str2 != null && webView != null) {
                webView.loadUrl("javascript:(function() {var parent = document.getElementsByTagName('head').item(0);var style = document.createElement('style');style.type = 'text/css';style.innerHTML = window.atob('" + str2 + "');parent.appendChild(style)})()");
            }
            super.onPageFinished(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            a aVar = a.this;
            if (aVar.f49953b == null) {
                s.m("url");
                throw null;
            }
            if (webResourceError != null) {
                webResourceError.getErrorCode();
            }
            Objects.toString(webResourceError != null ? webResourceError.getDescription() : null);
            String str = aVar.f49954c;
            if (str == null) {
                s.m("fallbackUrl");
                throw null;
            }
            String str2 = aVar.f49953b;
            if (str2 == null) {
                s.m("url");
                throw null;
            }
            if (TextUtils.equals(str, str2)) {
                return;
            }
            String str3 = aVar.f49954c;
            if (str3 == null) {
                s.m("fallbackUrl");
                throw null;
            }
            aVar.f49953b = str3;
            WebView webView2 = aVar.f49952a;
            if (webView2 != null) {
                webView2.loadUrl(str3);
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            PackageInfo packageInfo;
            webView.getClass();
            sslErrorHandler.getClass();
            sslError.getClass();
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            final a aVar = a.this;
            m activity = aVar.getActivity();
            if (activity != null) {
                try {
                    packageInfo = activity.getPackageManager().getPackageInfo("com.android.webview", 0);
                } catch (PackageManager.NameNotFoundException unused) {
                    packageInfo = null;
                }
                if (packageInfo == null) {
                    try {
                        packageInfo = activity.getPackageManager().getPackageInfo("com.google.android.webview", 0);
                    } catch (PackageManager.NameNotFoundException unused2) {
                    }
                }
                if (packageInfo != null) {
                    String str = packageInfo.versionName;
                    str.getClass();
                    if (!u.y(str, "53", false)) {
                        String str2 = packageInfo.versionName;
                        str2.getClass();
                        if (!u.y(str2, "54", false)) {
                            return;
                        }
                    }
                    final m activity2 = aVar.getActivity();
                    if (activity2 == null || activity2.isDestroyed() || activity2.isFinishing()) {
                        return;
                    }
                    final int i14 = 0;
                    final int i15 = 1;
                    AlertDialog alertDialogCreate = new AlertDialog.Builder(activity2).setCancelable(false).setTitle(aVar.getString(R.string.title_invalid_webview)).setMessage(aVar.getString(R.string.msg_invalid_webview)).setNegativeButton(aVar.getString(R.string.lbl_close), new DialogInterface.OnClickListener() { // from class: lc2.c
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i16) {
                            int i17 = i14;
                            m mVar = activity2;
                            com.garmin.android.lib.legal.a aVar2 = aVar;
                            switch (i17) {
                                case 0:
                                    com.garmin.android.lib.legal.a.C0993a c0993a = com.garmin.android.lib.legal.a.f49951g;
                                    dialogInterface.getClass();
                                    aVar2.getClass();
                                    com.garmin.android.lib.legal.a.u6(mVar, dialogInterface, null);
                                    break;
                                default:
                                    com.garmin.android.lib.legal.a.C0993a c0993a2 = com.garmin.android.lib.legal.a.f49951g;
                                    try {
                                        dialogInterface.getClass();
                                        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.google.android.webview"));
                                        aVar2.getClass();
                                        com.garmin.android.lib.legal.a.u6(mVar, dialogInterface, intent);
                                    } catch (ActivityNotFoundException unused3) {
                                        dialogInterface.getClass();
                                        Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=com.google.android.webview"));
                                        aVar2.getClass();
                                        com.garmin.android.lib.legal.a.u6(mVar, dialogInterface, intent2);
                                    }
                                    break;
                            }
                        }
                    }).setPositiveButton(aVar.getString(R.string.lbl_update), new DialogInterface.OnClickListener() { // from class: lc2.c
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i16) {
                            int i17 = i15;
                            m mVar = activity2;
                            com.garmin.android.lib.legal.a aVar2 = aVar;
                            switch (i17) {
                                case 0:
                                    com.garmin.android.lib.legal.a.C0993a c0993a = com.garmin.android.lib.legal.a.f49951g;
                                    dialogInterface.getClass();
                                    aVar2.getClass();
                                    com.garmin.android.lib.legal.a.u6(mVar, dialogInterface, null);
                                    break;
                                default:
                                    com.garmin.android.lib.legal.a.C0993a c0993a2 = com.garmin.android.lib.legal.a.f49951g;
                                    try {
                                        dialogInterface.getClass();
                                        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.google.android.webview"));
                                        aVar2.getClass();
                                        com.garmin.android.lib.legal.a.u6(mVar, dialogInterface, intent);
                                    } catch (ActivityNotFoundException unused3) {
                                        dialogInterface.getClass();
                                        Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=com.google.android.webview"));
                                        aVar2.getClass();
                                        com.garmin.android.lib.legal.a.u6(mVar, dialogInterface, intent2);
                                    }
                                    break;
                            }
                        }
                    }).create();
                    alertDialogCreate.setCanceledOnTouchOutside(false);
                    alertDialogCreate.show();
                }
            }
        }

        @Override // android.webkit.WebViewClient
        @o13.e
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            webView.getClass();
            str.getClass();
            if (!MailTo.isMailTo(str)) {
                if (a.this.f49955d && u.y(str, "http", false)) {
                    a(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                    return true;
                }
                if (u.y(str, "http", false)) {
                    return false;
                }
                a(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                return true;
            }
            MailTo mailTo = MailTo.parse(str);
            Intent intent = new Intent("android.intent.action.SEND");
            intent.putExtra("android.intent.extra.EMAIL", new String[]{mailTo.getTo()});
            intent.putExtra("android.intent.extra.SUBJECT", mailTo.getSubject());
            intent.putExtra("android.intent.extra.TEXT", mailTo.getBody());
            intent.putExtra("android.intent.extra.CC", mailTo.getCc());
            intent.setType("message/rfc822");
            a(intent);
            return true;
        }
    }

    public static void u6(m mVar, DialogInterface dialogInterface, Intent intent) {
        try {
            dialogInterface.dismiss();
            if (intent != null && !mVar.isDestroyed() && !mVar.isFinishing()) {
                mVar.startActivity(intent);
            }
        } catch (ActivityNotFoundException unused) {
        } finally {
            mVar.setResult(-1);
            mVar.finish();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle bundleRequireArguments = requireArguments();
        String string = bundleRequireArguments.getString("doc.enum.name");
        string.getClass();
        lc2.a aVarValueOf = lc2.a.valueOf(string);
        String string2 = bundleRequireArguments.getString("loc.enum.name");
        string2.getClass();
        d dVarValueOf = d.valueOf(string2);
        boolean z14 = bundleRequireArguments.getBoolean("is.china.server.env");
        String string3 = bundleRequireArguments.getString("custom.css", null);
        if (string3 != null) {
            byte[] bytes = string3.getBytes(d53.c.f57666b);
            bytes.getClass();
            this.f49956e = Base64.encodeToString(bytes, 2);
        }
        this.f49953b = aVarValueOf.a(dVarValueOf, z14);
        this.f49954c = aVarValueOf.a(d.US, z14);
        this.f49955d = bundleRequireArguments.getBoolean("launch.links.externally");
        if (this.f49953b == null) {
            s.m("url");
            throw null;
        }
        if (this.f49954c != null) {
            return;
        }
        s.m("fallbackUrl");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    @SuppressLint({"SetJavaScriptEnabled"})
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        WebView webView;
        layoutInflater.getClass();
        Context context = getContext();
        if (context != null) {
            webView = new WebView(context);
            webView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            webView.setWebViewClient(this.f49957f);
            webView.getSettings().setJavaScriptEnabled(true);
        } else {
            webView = null;
        }
        this.f49952a = webView;
        return webView;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        WebView webView = this.f49952a;
        if (webView != null) {
            webView.loadUrl("about:blank");
            webView.onPause();
            webView.removeAllViews();
        }
        this.f49952a = null;
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        WebView webView = this.f49952a;
        if (webView != null) {
            String str = this.f49953b;
            if (str != null) {
                webView.loadUrl(str);
            } else {
                s.m("url");
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.lib.legal.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/garmin/android/lib/legal/a$a;", "", "<init>", "()V", "", "FRAG_TAG", "Ljava/lang/String;", "OPTIMUM_WEBVIEW_PACKAGE_NAME", "DOC_ENUM_NAME", "LOC_ENUM_NAME", "IS_CHINA_SERVER_ENV", "CUSTOM_CSS", "LAUNCH_LINKS_EXTERNALLY", "legal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class C0993a {
        public /* synthetic */ C0993a(j jVar) {
            this();
        }

        private C0993a() {
        }
    }
}
