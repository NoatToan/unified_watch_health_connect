package com.huami.android.mipay.h5;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.widget.toast.CustomToast;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0000\u0018\u0000 .2\u00020\u0001:\u0001.B\u0007¢\u0006\u0004\b,\u0010-J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0002J\b\u0010\f\u001a\u00020\u0004H\u0002J\u0012\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J&\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\u001a\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00142\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\u000e\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018J\u0006\u0010\u001b\u001a\u00020\u0007J\u000e\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\tJ\b\u0010\u001e\u001a\u00020\u0004H\u0016R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u001fR\"\u0010!\u001a\u00020 8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010'\u001a\u00020 8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b'\u0010\"\u001a\u0004\b(\u0010$\"\u0004\b)\u0010&R\u0018\u0010+\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010*¨\u0006/"}, d2 = {"Lcom/huami/android/mipay/h5/MipayH5Fragment;", "Landroidx/fragment/app/Fragment;", "Landroid/webkit/WebView;", "webView", "", "c", "Landroid/content/Context;", "", "b", "", "code", "a", "releaseWebViews", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "Lcom/huami/android/mipay/h5/OnTitleChangedListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnTitleChangedListener", "onBackPressed", "errorCode", "dealErrorTip", "onDestroyView", "Landroid/webkit/WebView;", "", "url", "Ljava/lang/String;", "getUrl", "()Ljava/lang/String;", "setUrl", "(Ljava/lang/String;)V", "returnUrl", "getReturnUrl", "setReturnUrl", "Lcom/huami/android/mipay/h5/OnTitleChangedListener;", "titleListener", "<init>", "()V", "Companion", "mipay-h5_release"}, k = 1, mv = {1, 4, 0})
public final class MipayH5Fragment extends Fragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String d = "KEY_RETURN_URL";
    private static final String e = "KEY_URL";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private WebView webView;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private OnTitleChangedListener titleListener;
    private HashMap c;

    @NotNull
    public String returnUrl;

    @NotNull
    public String url;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002R\u0016\u0010\u0007\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\b¨\u0006\f"}, d2 = {"Lcom/huami/android/mipay/h5/MipayH5Fragment$Companion;", "", "", "url", "returnUrl", "Lcom/huami/android/mipay/h5/MipayH5Fragment;", "newInstance", "KEY_RETURN_URL", "Ljava/lang/String;", "KEY_URL", "<init>", "()V", "mipay-h5_release"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final MipayH5Fragment newInstance(@NotNull String url, @NotNull String returnUrl) {
            MipayH5Fragment mipayH5Fragment = new MipayH5Fragment();
            Bundle bundle = new Bundle();
            bundle.putString("KEY_RETURN_URL", returnUrl);
            bundle.putString("KEY_URL", url);
            mipayH5Fragment.setArguments(bundle);
            return mipayH5Fragment;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(int code) {
        if (getActivity() == null) {
            return;
        }
        FragmentActivity activity = getActivity();
        if (activity == null) {
            Intrinsics.throwNpe();
        }
        activity.setResult(code);
        FragmentActivity activity2 = getActivity();
        if (activity2 == null) {
            Intrinsics.throwNpe();
        }
        activity2.finish();
    }

    private final boolean b(Context c) {
        Object systemService = c.getSystemService("connectivity");
        if (systemService == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.net.ConnectivityManager");
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    private final void c(WebView webView) {
        Context context = getContext();
        if (context == null) {
            Intrinsics.throwNpe();
        }
        WebViewConfig.setDefaultSetting(webView, context);
        webView.setWebViewClient(new WebViewClient() { // from class: com.huami.android.mipay.h5.MipayH5Fragment$webSetting$1
            @Override // android.webkit.WebViewClient
            public void onPageStarted(@Nullable WebView view, @Nullable String url, @Nullable Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
                if (TextUtils.isEmpty(this.a.getReturnUrl())) {
                    return;
                }
                if (url == null) {
                    Intrinsics.throwNpe();
                }
                if (m.startsWith$default(url, this.a.getReturnUrl(), false, 2, null)) {
                    this.a.a(300);
                }
            }

            @Override // android.webkit.WebViewClient
            public void onReceivedError(@Nullable WebView view, int errorCode, @Nullable String description, @Nullable String failingUrl) {
                super.onReceivedError(view, errorCode, description, failingUrl);
                this.a.dealErrorTip(errorCode);
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(@Nullable WebView view, @Nullable String url) {
                if (url == null) {
                    return true;
                }
                if (!TextUtils.isEmpty(this.a.getReturnUrl()) && m.startsWith$default(url, this.a.getReturnUrl(), false, 2, null)) {
                    this.a.a(300);
                }
                try {
                    if (StringsKt__StringsKt.contains$default((CharSequence) url, (CharSequence) "weixin://", false, 2, (Object) null)) {
                        this.a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(url)));
                        return true;
                    }
                    if (m.startsWith$default(url, "alipays:", false, 2, null) || m.startsWith$default(url, "alipay", false, 2, null)) {
                        this.a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(url)));
                        return true;
                    }
                    return false;
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        });
        webView.setWebChromeClient(new WebChromeClient() { // from class: com.huami.android.mipay.h5.MipayH5Fragment$webSetting$2
            @Override // android.webkit.WebChromeClient
            public void onReceivedTitle(@Nullable WebView view, @Nullable String title) {
                super.onReceivedTitle(view, title);
                if (this.a.titleListener == null || title == null) {
                    return;
                }
                OnTitleChangedListener onTitleChangedListener = this.a.titleListener;
                if (onTitleChangedListener == null) {
                    Intrinsics.throwNpe();
                }
                onTitleChangedListener.onChanged(title);
            }
        });
        webView.loadUrl(this.url);
    }

    private final void releaseWebViews() {
        WebView webView = this.webView;
        if (webView == null) {
            return;
        }
        if (webView == null) {
            try {
                Intrinsics.throwNpe();
            } catch (IllegalArgumentException e2) {
                Log.w("MipayH5Fragment", e2);
            }
        }
        if (webView.getParent() != null) {
            WebView webView2 = this.webView;
            if (webView2 == null) {
                Intrinsics.throwNpe();
            }
            ViewParent parent = webView2.getParent();
            if (parent == null) {
                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
            }
            ((ViewGroup) parent).removeView(this.webView);
        }
        WebView webView3 = this.webView;
        if (webView3 == null) {
            Intrinsics.throwNpe();
        }
        webView3.destroy();
        this.webView = null;
    }

    public void _$_clearFindViewByIdCache() {
        HashMap map = this.c;
        if (map != null) {
            map.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this.c == null) {
            this.c = new HashMap();
        }
        View view = (View) this.c.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View viewFindViewById = view2.findViewById(i);
        this.c.put(Integer.valueOf(i), viewFindViewById);
        return viewFindViewById;
    }

    public final void dealErrorTip(int errorCode) {
        Context context = getContext();
        if (context == null) {
            Intrinsics.throwNpe();
        }
        if (b(context)) {
            return;
        }
        CustomToast.showShort(getContext(), getString(R.string.no_network));
    }

    @NotNull
    public final String getReturnUrl() {
        return this.returnUrl;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public final boolean onBackPressed() {
        WebView webView = this.webView;
        if (webView == null) {
            return true;
        }
        if (webView == null) {
            Intrinsics.throwNpe();
        }
        if (!webView.canGoBack()) {
            a(200);
            return true;
        }
        WebView webView2 = this.webView;
        if (webView2 == null) {
            Intrinsics.throwNpe();
        }
        webView2.goBack();
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("KEY_URL") : null;
        if (string == null) {
            Intrinsics.throwNpe();
        }
        this.url = string;
        Bundle arguments2 = getArguments();
        String string2 = arguments2 != null ? arguments2.getString("KEY_RETURN_URL") : null;
        if (string2 == null) {
            Intrinsics.throwNpe();
        }
        this.returnUrl = string2;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return View.inflate(getContext(), R.layout.fragment_mipay_h5, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        releaseWebViews();
        _$_clearFindViewByIdCache();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        this.webView = new WebView(getContext());
        View viewFindViewById = view.findViewById(R.id.web_view_layout);
        if (viewFindViewById == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout");
        }
        ((FrameLayout) viewFindViewById).addView(this.webView);
        WebView webView = this.webView;
        if (webView == null) {
            Intrinsics.throwNpe();
        }
        c(webView);
    }

    public final void setOnTitleChangedListener(@NotNull OnTitleChangedListener listener) {
        this.titleListener = listener;
    }

    public final void setReturnUrl(@NotNull String str) {
        this.returnUrl = str;
    }

    public final void setUrl(@NotNull String str) {
        this.url = str;
    }
}
