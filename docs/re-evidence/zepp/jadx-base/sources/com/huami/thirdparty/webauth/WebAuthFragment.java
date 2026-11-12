package com.huami.thirdparty.webauth;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.thirdparty.support.ui.WebFragment;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.collections.r;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 \u000b2\u00020\u0001:\u0002\f\u000bB\u0007¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005¨\u0006\r"}, d2 = {"Lcom/huami/thirdparty/webauth/WebAuthFragment;", "Lcom/huami/thirdparty/support/ui/WebFragment;", "", "bindWebView", "onDestroyView", "", "url", "", "interceptHandler", "<init>", "()V", "Companion", "AuthWebClient", "webauth_release"}, k = 1, mv = {1, 4, 1})
public final class WebAuthFragment extends WebFragment {

    @NotNull
    public static final String ACCESS_TOKEN_PARSE_KEY = "access_token";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String EXPIRES_IN_PARSE_KEY = "expires_in";

    @NotNull
    public static final String KEY_CODE = "code";

    @NotNull
    public static final String REFRESH_TOKEN_PARSE_KEY = "refresh_token";
    private static final String f = "1004";
    private static final String g = "1003";
    private HashMap e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0016\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0016\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\nR\u0016\u0010\u000e\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u0016\u0010\u000f\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/huami/thirdparty/webauth/WebAuthFragment$Companion;", "", "", "url", "a", "Landroid/os/Bundle;", "buildArguments", "", "getRequestParamMap", "ACCESS_TOKEN_PARSE_KEY", "Ljava/lang/String;", "EXPIRES_IN_PARSE_KEY", "KEY_CODE", "REFRESH_TOKEN_PARSE_KEY", "error_code_1003", "error_code_1004", "<init>", "()V", "webauth_release"}, k = 1, mv = {1, 4, 1})
    public static final class Companion {
        private Companion() {
        }

        private final String a(String url) {
            String str;
            if (TextUtils.isEmpty(url)) {
                return "";
            }
            int length = url.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = Intrinsics.compare((int) url.charAt(!z ? i : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    }
                    length--;
                } else if (z2) {
                    i++;
                } else {
                    z = true;
                }
            }
            String string = url.subSequence(i, length + 1).toString();
            Locale locale = Locale.ROOT;
            Objects.requireNonNull(string, "null cannot be cast to non-null type java.lang.String");
            Object[] array = new Regex("[?]").split(string.toLowerCase(locale), 0).toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            String[] strArr = (String[]) array;
            return (strArr.length <= 1 || strArr[1] == null || (str = strArr[1]) == null) ? "" : str;
        }

        @JvmStatic
        @NotNull
        public final Bundle buildArguments(@NotNull String url) {
            return WebFragment.INSTANCE.buildArguments(url);
        }

        @NotNull
        public final Map<String, String> getRequestParamMap(@NotNull String url) {
            if (TextUtils.isEmpty(url)) {
                return r.emptyMap();
            }
            String strA = a(url);
            if (TextUtils.isEmpty(strA)) {
                return r.emptyMap();
            }
            HashMap map = new HashMap();
            Object[] array = new Regex("[&]").split(strA, 0).toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            for (String str : (String[]) array) {
                Object[] array2 = new Regex("[=]").split(str, 0).toArray(new String[0]);
                Objects.requireNonNull(array2, "null cannot be cast to non-null type kotlin.Array<T>");
                String[] strArr = (String[]) array2;
                if (strArr.length > 1) {
                    if (TextUtils.isEmpty(strArr[1])) {
                        map.put(strArr[0], "");
                    } else {
                        map.put(strArr[0], strArr[1]);
                    }
                }
            }
            return map;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "kotlin.jvm.PlatformType", "it", "", "a", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {1, 4, 1})
    public static final class a<T> implements ValueCallback<Boolean> {
        public static final a a = new a();

        @Override // android.webkit.ValueCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void onReceiveValue(Boolean bool) {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "kotlin.jvm.PlatformType", "it", "", "a", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {1, 4, 1})
    public static final class b<T> implements ValueCallback<Boolean> {
        public static final b a = new b();

        @Override // android.webkit.ValueCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void onReceiveValue(Boolean bool) {
        }
    }

    @JvmStatic
    @NotNull
    public static final Bundle buildArguments(@NotNull String str) {
        return INSTANCE.buildArguments(str);
    }

    public void _$_clearFindViewByIdCache() {
        HashMap map = this.e;
        if (map != null) {
            map.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this.e == null) {
            this.e = new HashMap();
        }
        View view = (View) this.e.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View viewFindViewById = view2.findViewById(i);
        this.e.put(Integer.valueOf(i), viewFindViewById);
        return viewFindViewById;
    }

    @Override // com.huami.thirdparty.support.ui.WebFragment
    public void bindWebView() {
        super.bindWebView();
        getWebView().setWebViewClient(new AuthWebClient());
    }

    public final boolean interceptHandler(@NotNull String url) {
        if (m.startsWith$default(url, Api.INSTANCE.getREDIRECT_HOST(), false, 2, null)) {
            String str = INSTANCE.getRequestParamMap(url).get("code");
            if (TextUtils.isEmpty(str) || Intrinsics.areEqual("1004", str) || Intrinsics.areEqual("1003", str)) {
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    activity.setResult(0);
                    activity.finish();
                }
                return true;
            }
        } else if (StringsKt__StringsKt.contains$default((CharSequence) url, (CharSequence) "refresh_token", false, 2, (Object) null)) {
            Uri uri = Uri.parse(url);
            String queryParameter = uri.getQueryParameter("access_token");
            String queryParameter2 = uri.getQueryParameter("expires_in");
            String queryParameter3 = uri.getQueryParameter("refresh_token");
            FragmentActivity activity2 = getActivity();
            if (activity2 != null) {
                Intent intent = new Intent();
                intent.putExtra("access_token", queryParameter);
                intent.putExtra("expires_in", queryParameter2);
                intent.putExtra("refresh_token", queryParameter3);
                activity2.setResult(-1, intent);
                activity2.finish();
            }
            return true;
        }
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.setAcceptCookie(true);
        if (Build.VERSION.SDK_INT >= 21) {
            cookieManager.removeSessionCookies(a.a);
            cookieManager.removeAllCookies(b.a);
        } else {
            cookieManager.removeSessionCookie();
            cookieManager.removeAllCookie();
        }
        _$_clearFindViewByIdCache();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\b\u001a\u00020\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\u001c\u0010\b\u001a\u00020\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\r"}, d2 = {"Lcom/huami/thirdparty/webauth/WebAuthFragment$AuthWebClient;", "Lcom/huami/thirdparty/support/ui/WebFragment$WebClient;", "Lcom/huami/thirdparty/support/ui/WebFragment;", "Landroid/webkit/WebView;", ViewHierarchyConstants.VIEW_KEY, "Landroid/webkit/WebResourceRequest;", "request", "", "shouldOverrideUrlLoading", "", "url", "<init>", "(Lcom/huami/thirdparty/webauth/WebAuthFragment;)V", "webauth_release"}, k = 1, mv = {1, 4, 1})
    public final class AuthWebClient extends WebFragment.WebClient {
        public AuthWebClient() {
            super(null, null, null, 7, null);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(@Nullable WebView view, @Nullable WebResourceRequest request) {
            String strValueOf;
            if (Build.VERSION.SDK_INT >= 21) {
                strValueOf = String.valueOf(request != null ? request.getUrl() : null);
            } else {
                strValueOf = String.valueOf(request);
            }
            if (WebAuthFragment.this.interceptHandler(strValueOf)) {
                return true;
            }
            return super.shouldOverrideUrlLoading(view, request);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(@Nullable WebView view, @Nullable String url) {
            if (url == null || !WebAuthFragment.this.interceptHandler(url)) {
                return super.shouldOverrideUrlLoading(view, url);
            }
            return true;
        }
    }
}
