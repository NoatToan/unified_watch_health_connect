package ke;

import android.annotation.SuppressLint;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.webkit.WebView;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes7.dex */
@SuppressLint({"UnsafeOptInUsageError"})
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f104531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ke.a.d f104532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ke.a.h f104533c;

    public class a extends ke.a.i {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Pattern f104534d;

        public a(String str, String str2) {
            super(str, str2);
            this.f104534d = Pattern.compile("\\A\\d+");
        }

        @Override // ke.a
        public final boolean c() {
            boolean zC = super.c();
            if (!zC || Build.VERSION.SDK_INT >= 29) {
                return zC;
            }
            int i14 = je.b.f98469a;
            PackageInfo currentWebViewPackage = WebView.getCurrentWebViewPackage();
            if (currentWebViewPackage == null) {
                return false;
            }
            Matcher matcher = this.f104534d.matcher(currentWebViewPackage.versionName);
            return matcher.find() && Integer.parseInt(currentWebViewPackage.versionName.substring(matcher.start(), matcher.end())) >= 105;
        }
    }

    public class b extends ke.a.d {
        public b(String str, String str2) {
            super(str, str2);
        }

        @Override // ke.a
        public final boolean c() {
            if (!super.c()) {
                return false;
            }
            int i14 = je.b.f98469a;
            PackageInfo currentWebViewPackage = WebView.getCurrentWebViewPackage();
            return currentWebViewPackage != null && currentWebViewPackage.getLongVersionCode() >= 636700000;
        }
    }

    public class c extends ke.a.d {
        public c(String str, String str2) {
            super(str, str2);
        }

        @Override // ke.a
        public final boolean c() {
            if (super.c() && je.c.a("MULTI_PROCESS")) {
                int i14 = je.b.f98469a;
                if (g.f104532b.c()) {
                    return h.b.f104536a.getStatics().isMultiProcessEnabled();
                }
                org.apache.commons.lang3.e.w("This method is not supported by the current version of the framework and the current WebView APK");
            }
            return false;
        }
    }

    public class d extends ke.a.d {
        public d(String str, String str2) {
            super(str, str2);
        }

        @Override // ke.a
        public final boolean c() {
            if (je.c.a("MULTI_PROFILE")) {
                return super.c();
            }
            return false;
        }
    }

    static {
        new ke.a.b("VISUAL_STATE_CALLBACK", "VISUAL_STATE_CALLBACK");
        new ke.a.b("OFF_SCREEN_PRERASTER", "OFF_SCREEN_PRERASTER");
        new ke.a.e("SAFE_BROWSING_ENABLE", "SAFE_BROWSING_ENABLE");
        new ke.a.c("DISABLED_ACTION_MODE_MENU_ITEMS", "DISABLED_ACTION_MODE_MENU_ITEMS");
        new ke.a.f("START_SAFE_BROWSING", "START_SAFE_BROWSING");
        new ke.a.f("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_WHITELIST");
        new ke.a.f("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_ALLOWLIST");
        new ke.a.f("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_WHITELIST");
        new ke.a.f("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_ALLOWLIST");
        new ke.a.f("SAFE_BROWSING_PRIVACY_POLICY_URL", "SAFE_BROWSING_PRIVACY_POLICY_URL");
        new ke.a.c("SERVICE_WORKER_BASIC_USAGE", "SERVICE_WORKER_BASIC_USAGE");
        new ke.a.c("SERVICE_WORKER_CACHE_MODE", "SERVICE_WORKER_CACHE_MODE");
        new ke.a.c("SERVICE_WORKER_CONTENT_ACCESS", "SERVICE_WORKER_CONTENT_ACCESS");
        new ke.a.c("SERVICE_WORKER_FILE_ACCESS", "SERVICE_WORKER_FILE_ACCESS");
        new ke.a.c("SERVICE_WORKER_BLOCK_NETWORK_LOADS", "SERVICE_WORKER_BLOCK_NETWORK_LOADS");
        new ke.a.c("SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST", "SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST");
        new ke.a.b("RECEIVE_WEB_RESOURCE_ERROR", "RECEIVE_WEB_RESOURCE_ERROR");
        new ke.a.b("RECEIVE_HTTP_ERROR", "RECEIVE_HTTP_ERROR");
        new ke.a.c("SHOULD_OVERRIDE_WITH_REDIRECTS", "SHOULD_OVERRIDE_WITH_REDIRECTS");
        new ke.a.f("SAFE_BROWSING_HIT", "SAFE_BROWSING_HIT");
        new ke.a.c("WEB_RESOURCE_REQUEST_IS_REDIRECT", "WEB_RESOURCE_REQUEST_IS_REDIRECT");
        new ke.a.b("WEB_RESOURCE_ERROR_GET_DESCRIPTION", "WEB_RESOURCE_ERROR_GET_DESCRIPTION");
        new ke.a.b("WEB_RESOURCE_ERROR_GET_CODE", "WEB_RESOURCE_ERROR_GET_CODE");
        new ke.a.f("SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY", "SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY");
        new ke.a.f("SAFE_BROWSING_RESPONSE_PROCEED", "SAFE_BROWSING_RESPONSE_PROCEED");
        new ke.a.f("SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL", "SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL");
        new ke.a.b("WEB_MESSAGE_PORT_POST_MESSAGE", "WEB_MESSAGE_PORT_POST_MESSAGE");
        new ke.a.b("WEB_MESSAGE_PORT_CLOSE", "WEB_MESSAGE_PORT_CLOSE");
        new ke.a.d("WEB_MESSAGE_ARRAY_BUFFER", "WEB_MESSAGE_ARRAY_BUFFER");
        new ke.a.b("WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK", "WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK");
        new ke.a.b("CREATE_WEB_MESSAGE_CHANNEL", "CREATE_WEB_MESSAGE_CHANNEL");
        new ke.a.b("POST_WEB_MESSAGE", "POST_WEB_MESSAGE");
        new ke.a.b("WEB_MESSAGE_CALLBACK_ON_MESSAGE", "WEB_MESSAGE_CALLBACK_ON_MESSAGE");
        new ke.a.e("GET_WEB_VIEW_CLIENT", "GET_WEB_VIEW_CLIENT");
        new ke.a.e("GET_WEB_CHROME_CLIENT", "GET_WEB_CHROME_CLIENT");
        new ke.a.h("GET_WEB_VIEW_RENDERER", "GET_WEB_VIEW_RENDERER");
        new ke.a.h("WEB_VIEW_RENDERER_TERMINATE", "WEB_VIEW_RENDERER_TERMINATE");
        new ke.a.g("TRACING_CONTROLLER_BASIC_USAGE", "TRACING_CONTROLLER_BASIC_USAGE");
        new ke.d.b("STARTUP_FEATURE_SET_DATA_DIRECTORY_SUFFIX", "STARTUP_FEATURE_SET_DATA_DIRECTORY_SUFFIX");
        new ke.d.a("STARTUP_FEATURE_SET_DIRECTORY_BASE_PATHS", "STARTUP_FEATURE_SET_DIRECTORY_BASE_PATH");
        new ke.d.a("STARTUP_FEATURE_CONFIGURE_PARTITIONED_COOKIES", "STARTUP_FEATURE_CONFIGURE_PARTITIONED_COOKIES");
        new ke.a.h("WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE", "WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE");
        f104531a = new a("ALGORITHMIC_DARKENING", "ALGORITHMIC_DARKENING");
        new ke.a.d("PROXY_OVERRIDE", "PROXY_OVERRIDE:3");
        f104532b = new ke.a.d("MULTI_PROCESS", "MULTI_PROCESS_QUERY");
        f104533c = new ke.a.h("FORCE_DARK", "FORCE_DARK");
        new ke.a.d("FORCE_DARK_STRATEGY", "FORCE_DARK_BEHAVIOR");
        new ke.a.d("WEB_MESSAGE_LISTENER", "WEB_MESSAGE_LISTENER");
        new ke.a.d("DOCUMENT_START_SCRIPT", "DOCUMENT_START_SCRIPT:1");
        new ke.a.d("PROXY_OVERRIDE_REVERSE_BYPASS", "PROXY_OVERRIDE_REVERSE_BYPASS");
        new ke.a.d("GET_VARIATIONS_HEADER", "GET_VARIATIONS_HEADER");
        new ke.a.d("ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY", "ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY");
        new ke.a.d("GET_COOKIE_INFO", "GET_COOKIE_INFO");
        new ke.a.d("REQUESTED_WITH_HEADER_ALLOW_LIST", "REQUESTED_WITH_HEADER_ALLOW_LIST");
        new ke.a.d("USER_AGENT_METADATA", "USER_AGENT_METADATA");
        new b("USER_AGENT_METADATA_FORM_FACTORS", "USER_AGENT_METADATA");
        new c("MULTI_PROFILE", "MULTI_PROFILE");
        new ke.a.d("ATTRIBUTION_REGISTRATION_BEHAVIOR", "ATTRIBUTION_BEHAVIOR");
        new ke.a.d("WEBVIEW_MEDIA_INTEGRITY_API_STATUS", "WEBVIEW_INTEGRITY_API_STATUS");
        new ke.a.d("MUTE_AUDIO", "MUTE_AUDIO");
        new ke.a.d("WEB_AUTHENTICATION", "WEB_AUTHENTICATION");
        new ke.a.d("SPECULATIVE_LOADING_STATUS", "SPECULATIVE_LOADING");
        new ke.a.d("BACK_FORWARD_CACHE", "BACK_FORWARD_CACHE");
        new ke.a.d("BACK_FORWARD_CACHE_SETTINGS", "BACK_FORWARD_CACHE_SETTINGS");
        new ke.a.d("DELETE_BROWSING_DATA", "WEB_STORAGE_DELETE_BROWSING_DATA");
        new d("PREFETCH_URL_V5", "PREFETCH_URL_V5");
        new ke.a.d("IMPLEMENTATION_ONLY_FEATURE", "ASYNC_WEBVIEW_STARTUP");
        new ke.a.d("IMPLEMENTATION_ONLY_FEATURE", "ASYNC_WEBVIEW_STARTUP_ASYNC_STARTUP_LOCATIONS");
        new ke.a.d("DEFAULT_TRAFFICSTATS_TAGGING", "DEFAULT_TRAFFICSTATS_TAGGING");
        new ke.a.d("PRERENDER_URL_V2", "PRERENDER_URL_V3");
        new ke.a.d("SPECULATIVE_LOADING_CONFIG_V2", "SPECULATIVE_LOADING_CONFIG_V2");
        new ke.a.d("SAVE_STATE", "SAVE_STATE");
        new ke.a.d("WEB_VIEW_NAVIGATION_CLIENT_BASIC_USAGE", "WEB_VIEW_NAVIGATION_CLIENT_BASIC_USAGE");
        new ke.a.d("NAVIGATION_LISTENER_V1", "WEB_VIEW_NAVIGATION_LISTENER_V1");
        new ke.a.d("PROVIDER_WEAKLY_REF_WEBVIEW", "PROVIDER_WEAKLY_REF_WEBVIEW");
        new ke.a.d("PAYMENT_REQUEST", "PAYMENT_REQUEST");
        new ke.a.d("WEBVIEW_BUILDER_EXPERIMENTAL_V1", "WEBVIEW_BUILDER_V1");
        new ke.a.d("COOKIE_INTERCEPT", "COOKIE_INTERCEPT");
        new ke.a.d("WARM_UP_RENDERER_PROCESS", "WARM_UP_RENDERER_PROCESS");
        new ke.a.d("ORIGIN_MATCHED_HEADERS", "EXTRA_HEADER_FOR_ORIGINS");
        new ke.a.d("CUSTOM_REQUEST_HEADERS", "CUSTOM_REQUEST_HEADERS");
        new ke.d.a("STARTUP_FEATURE_SET_PROFILES_TO_LOAD", "STARTUP_FEATURE_SET_PROFILES_TO_LOAD");
        new ke.d.a("STARTUP_FEATURE_SET_UI_THREAD_STARTUP_MODE", "STARTUP_FEATURE_SET_UI_THREAD_STARTUP_MODE");
        new ke.d.a("STARTUP_FEATURE_SET_UI_THREAD_STARTUP_MODE_V2", "STARTUP_FEATURE_SET_UI_THREAD_STARTUP_MODE_V2");
        new ke.a.d("PRECONNECT", "PRECONNECT");
        new ke.a.d("ADD_QUIC_HINTS", "ADD_QUIC_HINTS_V1");
        new ke.a.d("HYPERLINK_CONTEXT_MENU_ITEMS", "HYPERLINK_CONTEXT_MENU_ITEMS");
    }

    private g() {
    }
}
