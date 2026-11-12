package com.facebook.login;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.amazon.identity.auth.device.authorization.AuthorizationResponseParser;
import com.facebook.AccessTokenSource;
import com.facebook.CustomTabMainActivity;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookSdk;
import com.facebook.FacebookServiceException;
import com.facebook.internal.CustomTab;
import com.facebook.internal.CustomTabUtils;
import com.facebook.internal.ServerProtocol;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class CustomTabLoginMethodHandler extends WebLoginMethodHandler {
    public static final Parcelable.Creator<CustomTabLoginMethodHandler> CREATOR = new a();
    public static final String OAUTH_DIALOG = "oauth";
    public static boolean calledThroughLoggedOutAppSwitch = false;
    private static final int h = 1;
    private static final int i = 20;
    private static final int j = 4201;
    private String e;
    private String f;
    private String g;

    public static class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public CustomTabLoginMethodHandler createFromParcel(Parcel parcel) {
            return new CustomTabLoginMethodHandler(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public CustomTabLoginMethodHandler[] newArray(int i) {
            return new CustomTabLoginMethodHandler[i];
        }
    }

    public CustomTabLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
        this.g = "";
        this.f = Utility.generateRandomString(20);
        calledThroughLoggedOutAppSwitch = false;
        this.g = CustomTabUtils.getValidRedirectURI(d());
    }

    private String c() {
        String str = this.e;
        if (str != null) {
            return str;
        }
        String chromePackage = CustomTabUtils.getChromePackage();
        this.e = chromePackage;
        return chromePackage;
    }

    private String d() {
        return super.getRedirectUrl();
    }

    private void e(String str, LoginClient.Request request) {
        int i2;
        if (str != null) {
            if (str.startsWith(Validate.CUSTOM_TAB_REDIRECT_URI_PREFIX) || str.startsWith(super.getRedirectUrl())) {
                Uri uri = Uri.parse(str);
                Bundle urlQueryString = Utility.parseUrlQueryString(uri.getQuery());
                urlQueryString.putAll(Utility.parseUrlQueryString(uri.getFragment()));
                if (!f(urlQueryString)) {
                    super.onComplete(request, null, new FacebookException("Invalid state parameter"));
                    return;
                }
                String string = urlQueryString.getString("error");
                if (string == null) {
                    string = urlQueryString.getString("error_type");
                }
                String string2 = urlQueryString.getString("error_msg");
                if (string2 == null) {
                    string2 = urlQueryString.getString("error_message");
                }
                if (string2 == null) {
                    string2 = urlQueryString.getString("error_description");
                }
                String string3 = urlQueryString.getString("error_code");
                if (Utility.isNullOrEmpty(string3)) {
                    i2 = -1;
                } else {
                    try {
                        i2 = Integer.parseInt(string3);
                    } catch (NumberFormatException unused) {
                        i2 = -1;
                    }
                }
                if (Utility.isNullOrEmpty(string) && Utility.isNullOrEmpty(string2) && i2 == -1) {
                    super.onComplete(request, urlQueryString, null);
                    return;
                }
                if (string != null && (string.equals(AuthorizationResponseParser.ERROR_ACCESS_DENIED) || string.equals("OAuthAccessDeniedException"))) {
                    super.onComplete(request, null, new FacebookOperationCanceledException());
                } else if (i2 == j) {
                    super.onComplete(request, null, new FacebookOperationCanceledException());
                } else {
                    super.onComplete(request, null, new FacebookServiceException(new FacebookRequestError(i2, string, string2), string2));
                }
            }
        }
    }

    private boolean f(Bundle bundle) {
        try {
            String string = bundle.getString("state");
            if (string == null) {
                return false;
            }
            return new JSONObject(string).getString(com.facebook.login.a.z).equals(this.f);
        } catch (JSONException unused) {
            return false;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public String getNameForLogging() {
        return "custom_tab";
    }

    @Override // com.facebook.login.WebLoginMethodHandler
    public String getRedirectUrl() {
        return this.g;
    }

    @Override // com.facebook.login.WebLoginMethodHandler
    public String getSSODevice() {
        return "chrome_custom_tab";
    }

    @Override // com.facebook.login.WebLoginMethodHandler
    public AccessTokenSource getTokenSource() {
        return AccessTokenSource.CHROME_CUSTOM_TAB;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public boolean onActivityResult(int i2, int i3, @Nullable Intent intent) {
        if (intent != null && intent.getBooleanExtra(CustomTabMainActivity.NO_ACTIVITY_EXCEPTION, false)) {
            return super.onActivityResult(i2, i3, intent);
        }
        if (i2 != 1) {
            return super.onActivityResult(i2, i3, intent);
        }
        LoginClient.Request pendingRequest = getLoginClient().getPendingRequest();
        if (i3 == -1) {
            e(intent != null ? intent.getStringExtra(CustomTabMainActivity.EXTRA_URL) : null, pendingRequest);
            return true;
        }
        super.onComplete(pendingRequest, null, new FacebookOperationCanceledException());
        return false;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public void putChallengeParam(JSONObject jSONObject) throws JSONException {
        jSONObject.put(com.facebook.login.a.z, this.f);
    }

    @Override // com.facebook.login.LoginMethodHandler
    public int tryAuthorize(LoginClient.Request request) {
        LoginClient loginClient = getLoginClient();
        if (getRedirectUrl().isEmpty()) {
            return 0;
        }
        Bundle bundleAddExtraParameters = addExtraParameters(getParameters(request), request);
        if (calledThroughLoggedOutAppSwitch) {
            bundleAddExtraParameters.putString(ServerProtocol.DIALOG_PARAM_CCT_OVER_LOGGED_OUT_APP_SWITCH, "1");
        }
        if (FacebookSdk.hasCustomTabsPrefetching) {
            if (request.l()) {
                CustomTabPrefetchHelper.mayLaunchUrl(CustomTab.getURIForAction("oauth", bundleAddExtraParameters));
            } else {
                CustomTabPrefetchHelper.mayLaunchUrl(CustomTab.getURIForAction("oauth", bundleAddExtraParameters));
            }
        }
        Intent intent = new Intent(loginClient.j(), (Class<?>) CustomTabMainActivity.class);
        intent.putExtra(CustomTabMainActivity.EXTRA_ACTION, "oauth");
        intent.putExtra(CustomTabMainActivity.EXTRA_PARAMS, bundleAddExtraParameters);
        intent.putExtra(CustomTabMainActivity.EXTRA_CHROME_PACKAGE, c());
        intent.putExtra(CustomTabMainActivity.EXTRA_TARGET_APP, request.h().getTargetApp());
        loginClient.getFragment().startActivityForResult(intent, 1);
        return 1;
    }

    @Override // com.facebook.login.LoginMethodHandler, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeString(this.f);
    }

    public CustomTabLoginMethodHandler(Parcel parcel) {
        super(parcel);
        this.g = "";
        this.f = parcel.readString();
    }
}
