package com.facebook.internal;

import android.os.Bundle;
import com.amazon.identity.auth.device.authorization.AuthorizationResponseParser;
import com.facebook.FacebookSdk;
import com.facebook.LoggingBehavior;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.Arrays;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b7\n\u0002\u0010\u001e\n\u0002\b\u0012\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bW\u0010LJ\b\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0004\u001a\u00020\u0002H\u0007J\b\u0010\u0005\u001a\u00020\u0002H\u0007J\b\u0010\u0006\u001a\u00020\u0002H\u0007J\b\u0010\u0007\u001a\u00020\u0002H\u0007J\b\u0010\b\u001a\u00020\u0002H\u0007J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0007J$\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007R\u0016\u0010\u0013\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u0016\u0010\u0016\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0012R\u0016\u0010\u0018\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0012R\u0016\u0010\u0019\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0012R\u0016\u0010\u001a\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0012R\u0016\u0010\u001b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0012R\u0016\u0010\u001c\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0012R\u0016\u0010\u001d\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0012R\u0016\u0010\u001e\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0012R\u0016\u0010\u001f\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0012R\u0016\u0010 \u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u0012R\u0016\u0010!\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\u0012R\u0016\u0010\"\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\u0012R\u0016\u0010#\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010\u0012R\u0016\u0010$\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010\u0012R\u0016\u0010%\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010\u0012R\u0016\u0010&\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010\u0012R\u0016\u0010'\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010\u0012R\u0016\u0010(\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b(\u0010\u0012R\u0016\u0010)\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b)\u0010\u0012R\u0016\u0010*\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b*\u0010\u0012R\u0016\u0010+\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b+\u0010\u0012R\u0016\u0010,\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b,\u0010\u0012R\u0016\u0010-\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b-\u0010\u0012R\u0016\u0010.\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b.\u0010\u0012R\u0016\u0010/\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b/\u0010\u0012R\u0016\u00100\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b0\u0010\u0012R\u0016\u00101\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b1\u0010\u0012R\u0016\u00102\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b2\u0010\u0012R\u0016\u00103\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b3\u0010\u0012R\u0016\u00104\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b4\u0010\u0012R\u0016\u00105\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b5\u0010\u0012R\u0016\u00106\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b6\u0010\u0012R\u0016\u00107\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b7\u0010\u0012R\u0016\u00108\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b8\u0010\u0012R\u0016\u00109\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b9\u0010\u0012R\u0016\u0010:\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b:\u0010\u0012R\u0016\u0010;\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b;\u0010\u0012R\u0016\u0010<\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b<\u0010\u0012R\u0016\u0010=\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b=\u0010\u0012R\u0016\u0010>\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b>\u0010\u0012R\u0016\u0010?\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b?\u0010\u0012R\u0016\u0010@\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b@\u0010\u0012R\u0016\u0010A\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bA\u0010\u0012R\u0016\u0010C\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\bB\u0010\u0012R\u0016\u0010E\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\bD\u0010\u0012R(\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00020F8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\bG\u0010H\u0012\u0004\bK\u0010L\u001a\u0004\bI\u0010JR(\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00020F8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\bN\u0010H\u0012\u0004\bP\u0010L\u001a\u0004\bO\u0010JR\"\u0010V\u001a\u00020\u00028\u0006@\u0007X\u0087D¢\u0006\u0012\n\u0004\bR\u0010\u0012\u0012\u0004\bU\u0010L\u001a\u0004\bS\u0010T¨\u0006X"}, d2 = {"Lcom/facebook/internal/ServerProtocol;", "", "", "getDefaultAPIVersion", "getDialogAuthority", "getInstagramDialogAuthority", "getGraphUrlBase", "getGraphVideoUrlBase", "getFacebookGraphUrlBase", "subdomain", "getGraphUrlBaseForSubdomain", "callId", "", "version", "Landroid/os/Bundle;", "methodArgs", "getQueryParamsForPlatformActivityIntentWebFallback", "a", "Ljava/lang/String;", "TAG", "b", "DIALOG_AUTHORITY_FORMAT", "DIALOG_PATH", "DIALOG_PARAM_ACCESS_TOKEN", "DIALOG_PARAM_APP_ID", "DIALOG_PARAM_AUTH_TYPE", "DIALOG_PARAM_CBT", "DIALOG_PARAM_CLIENT_ID", "DIALOG_PARAM_CUSTOM_TABS_PREFETCHING", "DIALOG_PARAM_DISPLAY", "DIALOG_PARAM_DISPLAY_TOUCH", "DIALOG_PARAM_E2E", "DIALOG_PARAM_IES", "DIALOG_PARAM_LEGACY_OVERRIDE", "DIALOG_PARAM_LOGIN_BEHAVIOR", "DIALOG_PARAM_NONCE", "DIALOG_PARAM_REDIRECT_URI", "DIALOG_PARAM_RESPONSE_TYPE", "DIALOG_PARAM_RETURN_SCOPES", "DIALOG_PARAM_SCOPE", "DIALOG_PARAM_SSO_DEVICE", "DIALOG_PARAM_DEFAULT_AUDIENCE", "DIALOG_PARAM_SDK_VERSION", "DIALOG_PARAM_STATE", "DIALOG_PARAM_FAIL_ON_LOGGED_OUT", "DIALOG_PARAM_CCT_OVER_LOGGED_OUT_APP_SWITCH", "DIALOG_PARAM_MESSENGER_PAGE_ID", "DIALOG_PARAM_RESET_MESSENGER_STATE", "DIALOG_REREQUEST_AUTH_TYPE", "DIALOG_PARAM_FX_APP", "DIALOG_PARAM_SKIP_DEDUPE", "DIALOG_RESPONSE_TYPE_TOKEN_AND_SCOPES", "DIALOG_RESPONSE_TYPE_TOKEN_AND_SIGNED_REQUEST", "DIALOG_RESPONSE_TYPE_ID_TOKEN_AND_SIGNED_REQUEST", "DIALOG_RETURN_SCOPES_TRUE", "DIALOG_REDIRECT_URI", "DIALOG_REDIRECT_CHROME_OS_URI", "DIALOG_CANCEL_URI", "FALLBACK_DIALOG_PARAM_APP_ID", "FALLBACK_DIALOG_PARAM_BRIDGE_ARGS", "FALLBACK_DIALOG_PARAM_KEY_HASH", "FALLBACK_DIALOG_PARAM_METHOD_ARGS", "FALLBACK_DIALOG_PARAM_METHOD_RESULTS", "FALLBACK_DIALOG_PARAM_VERSION", "FALLBACK_DIALOG_DISPLAY_VALUE_TOUCH", "INSTAGRAM_OAUTH_PATH", "c", "GRAPH_VIDEO_URL_FORMAT", GoogleApiAvailabilityLight.a, "GRAPH_URL_FORMAT", "", "e", "Ljava/util/Collection;", "getErrorsProxyAuthDisabled", "()Ljava/util/Collection;", "getErrorsProxyAuthDisabled$annotations", "()V", "errorsProxyAuthDisabled", "f", "getErrorsUserCanceled", "getErrorsUserCanceled$annotations", "errorsUserCanceled", "g", "getErrorConnectionFailure", "()Ljava/lang/String;", "getErrorConnectionFailure$annotations", "errorConnectionFailure", "<init>", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class ServerProtocol {

    @NotNull
    public static final String DIALOG_CANCEL_URI = "fbconnect://cancel";

    @NotNull
    public static final String DIALOG_PARAM_ACCESS_TOKEN = "access_token";

    @NotNull
    public static final String DIALOG_PARAM_APP_ID = "app_id";

    @NotNull
    public static final String DIALOG_PARAM_AUTH_TYPE = "auth_type";

    @NotNull
    public static final String DIALOG_PARAM_CBT = "cbt";

    @NotNull
    public static final String DIALOG_PARAM_CCT_OVER_LOGGED_OUT_APP_SWITCH = "cct_over_app_switch";

    @NotNull
    public static final String DIALOG_PARAM_CLIENT_ID = "client_id";

    @NotNull
    public static final String DIALOG_PARAM_CUSTOM_TABS_PREFETCHING = "cct_prefetching";

    @NotNull
    public static final String DIALOG_PARAM_DEFAULT_AUDIENCE = "default_audience";

    @NotNull
    public static final String DIALOG_PARAM_DISPLAY = "display";

    @NotNull
    public static final String DIALOG_PARAM_DISPLAY_TOUCH = "touch";

    @NotNull
    public static final String DIALOG_PARAM_E2E = "e2e";

    @NotNull
    public static final String DIALOG_PARAM_FAIL_ON_LOGGED_OUT = "fail_on_logged_out";

    @NotNull
    public static final String DIALOG_PARAM_FX_APP = "fx_app";

    @NotNull
    public static final String DIALOG_PARAM_IES = "ies";

    @NotNull
    public static final String DIALOG_PARAM_LEGACY_OVERRIDE = "legacy_override";

    @NotNull
    public static final String DIALOG_PARAM_LOGIN_BEHAVIOR = "login_behavior";

    @NotNull
    public static final String DIALOG_PARAM_MESSENGER_PAGE_ID = "messenger_page_id";

    @NotNull
    public static final String DIALOG_PARAM_NONCE = "nonce";

    @NotNull
    public static final String DIALOG_PARAM_REDIRECT_URI = "redirect_uri";

    @NotNull
    public static final String DIALOG_PARAM_RESET_MESSENGER_STATE = "reset_messenger_state";

    @NotNull
    public static final String DIALOG_PARAM_RESPONSE_TYPE = "response_type";

    @NotNull
    public static final String DIALOG_PARAM_RETURN_SCOPES = "return_scopes";

    @NotNull
    public static final String DIALOG_PARAM_SCOPE = "scope";

    @NotNull
    public static final String DIALOG_PARAM_SDK_VERSION = "sdk";

    @NotNull
    public static final String DIALOG_PARAM_SKIP_DEDUPE = "skip_dedupe";

    @NotNull
    public static final String DIALOG_PARAM_SSO_DEVICE = "sso";

    @NotNull
    public static final String DIALOG_PARAM_STATE = "state";

    @NotNull
    public static final String DIALOG_PATH = "dialog/";

    @NotNull
    public static final String DIALOG_REDIRECT_CHROME_OS_URI = "fbconnect://chrome_os_success";

    @NotNull
    public static final String DIALOG_REDIRECT_URI = "fbconnect://success";

    @NotNull
    public static final String DIALOG_REREQUEST_AUTH_TYPE = "rerequest";

    @NotNull
    public static final String DIALOG_RESPONSE_TYPE_ID_TOKEN_AND_SIGNED_REQUEST = "id_token,token,signed_request,graph_domain";

    @NotNull
    public static final String DIALOG_RESPONSE_TYPE_TOKEN_AND_SCOPES = "token,signed_request,graph_domain,granted_scopes";

    @NotNull
    public static final String DIALOG_RESPONSE_TYPE_TOKEN_AND_SIGNED_REQUEST = "token,signed_request,graph_domain";

    @NotNull
    public static final String DIALOG_RETURN_SCOPES_TRUE = "true";

    @NotNull
    public static final String FALLBACK_DIALOG_DISPLAY_VALUE_TOUCH = "touch";

    @NotNull
    public static final String FALLBACK_DIALOG_PARAM_APP_ID = "app_id";

    @NotNull
    public static final String FALLBACK_DIALOG_PARAM_BRIDGE_ARGS = "bridge_args";

    @NotNull
    public static final String FALLBACK_DIALOG_PARAM_KEY_HASH = "android_key_hash";

    @NotNull
    public static final String FALLBACK_DIALOG_PARAM_METHOD_ARGS = "method_args";

    @NotNull
    public static final String FALLBACK_DIALOG_PARAM_METHOD_RESULTS = "method_results";

    @NotNull
    public static final String FALLBACK_DIALOG_PARAM_VERSION = "version";

    @NotNull
    public static final String INSTAGRAM_OAUTH_PATH = "oauth/authorize";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final String DIALOG_AUTHORITY_FORMAT = "m.%s";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final String GRAPH_VIDEO_URL_FORMAT = "https://graph-video.%s";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final String GRAPH_URL_FORMAT = "https://graph.%s";

    @NotNull
    public static final ServerProtocol INSTANCE = new ServerProtocol();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final String TAG = ServerProtocol.class.getName();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private static final Collection<String> errorsProxyAuthDisabled = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"service_disabled", "AndroidAuthKillSwitchException"});

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private static final Collection<String> errorsUserCanceled = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{AuthorizationResponseParser.ERROR_ACCESS_DENIED, "OAuthAccessDeniedException"});

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private static final String errorConnectionFailure = "CONNECTION_FAILURE";

    private ServerProtocol() {
    }

    @JvmStatic
    @NotNull
    public static final String getDefaultAPIVersion() {
        return "v12.0";
    }

    @JvmStatic
    @NotNull
    public static final String getDialogAuthority() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format(DIALOG_AUTHORITY_FORMAT, Arrays.copyOf(new Object[]{FacebookSdk.getFacebookDomain()}, 1));
    }

    @NotNull
    public static final String getErrorConnectionFailure() {
        return errorConnectionFailure;
    }

    @JvmStatic
    public static /* synthetic */ void getErrorConnectionFailure$annotations() {
    }

    @NotNull
    public static final Collection<String> getErrorsProxyAuthDisabled() {
        return errorsProxyAuthDisabled;
    }

    @JvmStatic
    public static /* synthetic */ void getErrorsProxyAuthDisabled$annotations() {
    }

    @NotNull
    public static final Collection<String> getErrorsUserCanceled() {
        return errorsUserCanceled;
    }

    @JvmStatic
    public static /* synthetic */ void getErrorsUserCanceled$annotations() {
    }

    @JvmStatic
    @NotNull
    public static final String getFacebookGraphUrlBase() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format(GRAPH_URL_FORMAT, Arrays.copyOf(new Object[]{FacebookSdk.getFacebookDomain()}, 1));
    }

    @JvmStatic
    @NotNull
    public static final String getGraphUrlBase() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format(GRAPH_URL_FORMAT, Arrays.copyOf(new Object[]{FacebookSdk.getGraphDomain()}, 1));
    }

    @JvmStatic
    @NotNull
    public static final String getGraphUrlBaseForSubdomain(@NotNull String subdomain) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format(GRAPH_URL_FORMAT, Arrays.copyOf(new Object[]{subdomain}, 1));
    }

    @JvmStatic
    @NotNull
    public static final String getGraphVideoUrlBase() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format(GRAPH_VIDEO_URL_FORMAT, Arrays.copyOf(new Object[]{FacebookSdk.getGraphDomain()}, 1));
    }

    @JvmStatic
    @NotNull
    public static final String getInstagramDialogAuthority() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format(DIALOG_AUTHORITY_FORMAT, Arrays.copyOf(new Object[]{FacebookSdk.getInstagramDomain()}, 1));
    }

    @JvmStatic
    @Nullable
    public static final Bundle getQueryParamsForPlatformActivityIntentWebFallback(@NotNull String callId, int version, @Nullable Bundle methodArgs) {
        String applicationSignature = FacebookSdk.getApplicationSignature(FacebookSdk.getApplicationContext());
        if (Utility.isNullOrEmpty(applicationSignature)) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString(FALLBACK_DIALOG_PARAM_KEY_HASH, applicationSignature);
        bundle.putString("app_id", FacebookSdk.getApplicationId());
        bundle.putInt("version", version);
        bundle.putString(DIALOG_PARAM_DISPLAY, "touch");
        Bundle bundle2 = new Bundle();
        bundle2.putString("action_id", callId);
        try {
            JSONObject jSONObjectConvertToJSON = BundleJSONConverter.convertToJSON(bundle2);
            if (methodArgs == null) {
                methodArgs = new Bundle();
            }
            JSONObject jSONObjectConvertToJSON2 = BundleJSONConverter.convertToJSON(methodArgs);
            if (jSONObjectConvertToJSON != null && jSONObjectConvertToJSON2 != null) {
                bundle.putString(FALLBACK_DIALOG_PARAM_BRIDGE_ARGS, jSONObjectConvertToJSON.toString());
                bundle.putString(FALLBACK_DIALOG_PARAM_METHOD_ARGS, jSONObjectConvertToJSON2.toString());
                return bundle;
            }
            return null;
        } catch (IllegalArgumentException e) {
            Logger.INSTANCE.log(LoggingBehavior.DEVELOPER_ERRORS, 6, TAG, "Error creating Url -- " + e);
            return null;
        } catch (JSONException e2) {
            Logger.INSTANCE.log(LoggingBehavior.DEVELOPER_ERRORS, 6, TAG, "Error creating Url -- " + e2);
            return null;
        }
    }
}
