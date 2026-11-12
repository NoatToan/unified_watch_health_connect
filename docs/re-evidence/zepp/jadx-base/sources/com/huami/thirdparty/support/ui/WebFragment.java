package com.huami.thirdparty.support.ui;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.DownloadListener;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.thirdparty.support.R;
import com.huami.thirdparty.support.ui.WebFragment;
import com.huami.thirdparty.support.widget.LoadingView;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0016\u0018\u0000 +2\u00020\u0001:\u0003+,-B\u0007¢\u0006\u0004\b)\u0010*J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u001a\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0017J\b\u0010\f\u001a\u00020\u0004H\u0004J\b\u0010\r\u001a\u00020\u0004H\u0004R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\"\u0010\u0017\u001a\u00020\u00168\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR$\u0010(\u001a\u0004\u0018\u00010!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006."}, d2 = {"Lcom/huami/thirdparty/support/ui/WebFragment;", "Landroidx/fragment/app/Fragment;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "outState", "onSaveInstanceState", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "bindWebView", "showLoading", "hideLoading", "", "a", "Ljava/lang/String;", "url", "Landroid/widget/ProgressBar;", "b", "Landroid/widget/ProgressBar;", "webProgressBar", "Landroid/webkit/WebView;", "webView", "Landroid/webkit/WebView;", "getWebView", "()Landroid/webkit/WebView;", "setWebView", "(Landroid/webkit/WebView;)V", "Lcom/huami/thirdparty/support/widget/LoadingView;", "c", "Lcom/huami/thirdparty/support/widget/LoadingView;", "loadingView", "Lcom/huami/thirdparty/support/ui/WebFragment$PageLoadCallback;", GoogleApiAvailabilityLight.a, "Lcom/huami/thirdparty/support/ui/WebFragment$PageLoadCallback;", "getPageLoadCallback", "()Lcom/huami/thirdparty/support/ui/WebFragment$PageLoadCallback;", "setPageLoadCallback", "(Lcom/huami/thirdparty/support/ui/WebFragment$PageLoadCallback;)V", "pageLoadCallback", "<init>", "()V", "Companion", "PageLoadCallback", "WebClient", "support_release"}, k = 1, mv = {1, 5, 1})
public class WebFragment extends Fragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String EXTRA_URL = "url";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private String url;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private ProgressBar webProgressBar;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private LoadingView loadingView;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private PageLoadCallback pageLoadCallback;
    public WebView webView;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/huami/thirdparty/support/ui/WebFragment$Companion;", "", "", "url", "Landroid/os/Bundle;", "buildArguments", "EXTRA_URL", "Ljava/lang/String;", "<init>", "()V", "support_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final Bundle buildArguments(@NotNull String url) {
            return BundleKt.bundleOf(TuplesKt.to("url", url));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/huami/thirdparty/support/ui/WebFragment$PageLoadCallback;", "", "Landroid/webkit/WebView;", ViewHierarchyConstants.VIEW_KEY, "", "onLoadFinish", "support_release"}, k = 1, mv = {1, 5, 1})
    public interface PageLoadCallback {
        void onLoadFinish(@NotNull WebView view);
    }

    public WebFragment() {
        super(R.layout.fragment_web);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(WebFragment webFragment, String str, String str2, String str3, String str4, long j) {
        webFragment.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
    }

    @JvmStatic
    @NotNull
    public static final Bundle buildArguments(@NotNull String str) {
        return INSTANCE.buildArguments(str);
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public void bindWebView() {
        WebView webView = getWebView();
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setCacheMode(2);
        settings.setAllowFileAccess(true);
        String userAgentString = settings.getUserAgentString();
        settings.setUserAgentString(StringsKt__StringsKt.contains$default((CharSequence) userAgentString, (CharSequence) " wv", false, 2, (Object) null) ? m.replace$default(userAgentString, " wv", "", false, 4, (Object) null) : m.replace$default(userAgentString, "Version/", "xxx/", false, 4, (Object) null));
        webView.setLayerType(1, null);
        webView.setWebViewClient(new WebClient(null, null, null, 7, null));
        webView.setDownloadListener(new DownloadListener() { // from class: vp8
            @Override // android.webkit.DownloadListener
            public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
                WebFragment.b(this.a, str, str2, str3, str4, j);
            }
        });
        webView.setWebChromeClient(new WebChromeClient() { // from class: com.huami.thirdparty.support.ui.WebFragment$bindWebView$1$3
            @Override // android.webkit.WebChromeClient
            public void onProgressChanged(@NotNull WebView view, int newProgress) {
                ProgressBar progressBar = this.a.webProgressBar;
                if (progressBar == null) {
                    return;
                }
                progressBar.setProgress(newProgress + 5);
            }
        });
    }

    @Nullable
    public final PageLoadCallback getPageLoadCallback() {
        return this.pageLoadCallback;
    }

    @NotNull
    public final WebView getWebView() {
        WebView webView = this.webView;
        Objects.requireNonNull(webView);
        return webView;
    }

    public final void hideLoading() {
        LoadingView loadingView = this.loadingView;
        Objects.requireNonNull(loadingView);
        loadingView.setVisibility(8);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        String string;
        super.onCreate(savedInstanceState);
        if (savedInstanceState != null) {
            string = savedInstanceState.getString("url");
        } else {
            Bundle arguments = getArguments();
            string = arguments == null ? null : arguments.getString("url");
        }
        this.url = string;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NotNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("url", this.url);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setWebView((WebView) view.findViewById(R.id.webview));
        this.webProgressBar = (ProgressBar) view.findViewById(R.id.web_progress);
        this.loadingView = (LoadingView) view.findViewById(R.id.loading);
        bindWebView();
        String str = this.url;
        if (str != null) {
            getWebView().loadUrl(str);
        }
        showLoading();
    }

    public final void setPageLoadCallback(@Nullable PageLoadCallback pageLoadCallback) {
        this.pageLoadCallback = pageLoadCallback;
    }

    public final void setWebView(@NotNull WebView webView) {
        this.webView = webView;
    }

    public final void showLoading() {
        LoadingView loadingView = this.loadingView;
        Objects.requireNonNull(loadingView);
        loadingView.setVisibility(0);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0096\u0004\u0018\u00002\u00020\u0001BN\u0012\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u0010\u0012\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u0010\u0012%\b\u0002\u0010 \u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\r¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\b0\u0019¢\u0006\u0004\b!\u0010\"J&\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001c\u0010\n\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J&\u0010\u000f\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016R\u001f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u00108\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u00108\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014R6\u0010 \u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\r¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\b0\u00198\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006#"}, d2 = {"Lcom/huami/thirdparty/support/ui/WebFragment$WebClient;", "Landroid/webkit/WebViewClient;", "Landroid/webkit/WebView;", ViewHierarchyConstants.VIEW_KEY, "", "url", "Landroid/graphics/Bitmap;", "favicon", "", "onPageStarted", "onPageFinished", "Landroid/webkit/WebResourceRequest;", "request", "Landroid/webkit/WebResourceError;", "error", "onReceivedError", "Lkotlin/Function0;", "a", "Lkotlin/jvm/functions/Function0;", "getPageStart", "()Lkotlin/jvm/functions/Function0;", "pageStart", "b", "getPageFinished", "pageFinished", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "c", "Lkotlin/jvm/functions/Function1;", "getReceivedError", "()Lkotlin/jvm/functions/Function1;", "receivedError", "<init>", "(Lcom/huami/thirdparty/support/ui/WebFragment;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "support_release"}, k = 1, mv = {1, 5, 1})
    public class WebClient extends WebViewClient {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final Function0<Unit> pageStart;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private final Function0<Unit> pageFinished;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        private final Function1<WebResourceError, Unit> receivedError;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<Unit> {
            public static final a a = new a();

            public a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<Unit> {
            public static final b a = new b();

            public b() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Landroid/webkit/WebResourceError;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function1<WebResourceError, Unit> {
            public static final c a = new c();

            public c() {
                super(1);
            }

            public final void a(@Nullable WebResourceError webResourceError) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(WebResourceError webResourceError) {
                a(webResourceError);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public WebClient(@NotNull Function0<Unit> function0, @NotNull Function0<Unit> function1, Function1<? super WebResourceError, Unit> function2) {
            this.pageStart = function0;
            this.pageFinished = function1;
            this.receivedError = function2;
        }

        @NotNull
        public final Function0<Unit> getPageFinished() {
            return this.pageFinished;
        }

        @NotNull
        public final Function0<Unit> getPageStart() {
            return this.pageStart;
        }

        @NotNull
        public final Function1<WebResourceError, Unit> getReceivedError() {
            return this.receivedError;
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(@Nullable WebView view, @Nullable String url) {
            PageLoadCallback pageLoadCallback;
            super.onPageFinished(view, url);
            ProgressBar progressBar = WebFragment.this.webProgressBar;
            if (progressBar != null) {
                progressBar.setVisibility(4);
            }
            this.pageFinished.invoke();
            WebFragment.this.hideLoading();
            if (view == null || (pageLoadCallback = WebFragment.this.getPageLoadCallback()) == null) {
                return;
            }
            pageLoadCallback.onLoadFinish(view);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(@Nullable WebView view, @Nullable String url, @Nullable Bitmap favicon) {
            super.onPageStarted(view, url, favicon);
            ProgressBar progressBar = WebFragment.this.webProgressBar;
            if (progressBar != null) {
                progressBar.setVisibility(0);
            }
            this.pageStart.invoke();
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(@Nullable WebView view, @Nullable WebResourceRequest request, @Nullable WebResourceError error) {
            super.onReceivedError(view, request, error);
            ProgressBar progressBar = WebFragment.this.webProgressBar;
            if (progressBar != null) {
                progressBar.setVisibility(4);
            }
            this.receivedError.invoke(error);
            WebFragment.this.hideLoading();
        }

        public /* synthetic */ WebClient(Function0 function0, Function0 function1, Function1 function2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? a.a : function0, (i & 2) != 0 ? b.a : function1, (i & 4) != 0 ? c.a : function2);
        }
    }
}
