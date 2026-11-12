package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentActivity;
import com.facebook.AccessTokenSource;
import com.facebook.FacebookException;
import com.facebook.internal.FacebookDialogFragment;
import com.facebook.internal.ServerProtocol;
import com.facebook.internal.Utility;
import com.facebook.internal.WebDialog;

/* JADX INFO: loaded from: classes2.dex */
class WebViewLoginMethodHandler extends WebLoginMethodHandler {
    public static final Parcelable.Creator<WebViewLoginMethodHandler> CREATOR = new b();
    private WebDialog e;
    private String f;

    public class a implements WebDialog.OnCompleteListener {
        public final /* synthetic */ LoginClient.Request a;

        public a(LoginClient.Request request) {
            this.a = request;
        }

        @Override // com.facebook.internal.WebDialog.OnCompleteListener
        public void onComplete(Bundle bundle, FacebookException facebookException) {
            WebViewLoginMethodHandler.this.c(this.a, bundle, facebookException);
        }
    }

    public static class b implements Parcelable.Creator<WebViewLoginMethodHandler> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public WebViewLoginMethodHandler createFromParcel(Parcel parcel) {
            return new WebViewLoginMethodHandler(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public WebViewLoginMethodHandler[] newArray(int i) {
            return new WebViewLoginMethodHandler[i];
        }
    }

    public static class c extends WebDialog.Builder {
        private static final String o = "oauth";
        private String h;
        private String i;
        private String j;
        private LoginBehavior k;
        private LoginTargetApp l;
        private boolean m;
        private boolean n;

        public c(Context context, String str, Bundle bundle) {
            super(context, str, "oauth", bundle);
            this.j = ServerProtocol.DIALOG_REDIRECT_URI;
            this.k = LoginBehavior.NATIVE_WITH_FALLBACK;
            this.l = LoginTargetApp.FACEBOOK;
            this.m = false;
            this.n = false;
        }

        public c b(String str) {
            this.i = str;
            return this;
        }

        @Override // com.facebook.internal.WebDialog.Builder
        public WebDialog build() {
            Bundle parameters = getParameters();
            parameters.putString("redirect_uri", this.j);
            parameters.putString("client_id", getApplicationId());
            parameters.putString("e2e", this.h);
            parameters.putString(ServerProtocol.DIALOG_PARAM_RESPONSE_TYPE, this.l == LoginTargetApp.INSTAGRAM ? ServerProtocol.DIALOG_RESPONSE_TYPE_TOKEN_AND_SCOPES : ServerProtocol.DIALOG_RESPONSE_TYPE_TOKEN_AND_SIGNED_REQUEST);
            parameters.putString(ServerProtocol.DIALOG_PARAM_RETURN_SCOPES, "true");
            parameters.putString("auth_type", this.i);
            parameters.putString("login_behavior", this.k.name());
            if (this.m) {
                parameters.putString(ServerProtocol.DIALOG_PARAM_FX_APP, this.l.getTargetApp());
            }
            if (this.n) {
                parameters.putString(ServerProtocol.DIALOG_PARAM_SKIP_DEDUPE, "true");
            }
            return WebDialog.newInstance(getCom.huami.tools.analytics.DbUtils.Const.Table.CONTEXT java.lang.String(), "oauth", parameters, getTheme(), this.l, getCom.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER java.lang.String());
        }

        public c c(String str) {
            this.h = str;
            return this;
        }

        public c d(boolean z) {
            this.m = z;
            return this;
        }

        public c e(boolean z) {
            this.j = z ? ServerProtocol.DIALOG_REDIRECT_CHROME_OS_URI : ServerProtocol.DIALOG_REDIRECT_URI;
            return this;
        }

        public c f(boolean z) {
            return this;
        }

        public c g(LoginBehavior loginBehavior) {
            this.k = loginBehavior;
            return this;
        }

        public c h(LoginTargetApp loginTargetApp) {
            this.l = loginTargetApp;
            return this;
        }

        public c i(boolean z) {
            this.n = z;
            return this;
        }
    }

    public WebViewLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    public void c(LoginClient.Request request, Bundle bundle, FacebookException facebookException) {
        super.onComplete(request, bundle, facebookException);
    }

    @Override // com.facebook.login.LoginMethodHandler
    public void cancel() {
        WebDialog webDialog = this.e;
        if (webDialog != null) {
            webDialog.cancel();
            this.e = null;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public String getNameForLogging() {
        return "web_view";
    }

    @Override // com.facebook.login.WebLoginMethodHandler
    public AccessTokenSource getTokenSource() {
        return AccessTokenSource.WEB_VIEW;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public boolean needsInternetPermission() {
        return true;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public int tryAuthorize(LoginClient.Request request) {
        Bundle parameters = getParameters(request);
        a aVar = new a(request);
        String strM = LoginClient.m();
        this.f = strM;
        addLoggingExtra("e2e", strM);
        FragmentActivity fragmentActivityJ = getLoginClient().j();
        this.e = new c(fragmentActivityJ, request.a(), parameters).c(this.f).e(Utility.isChromeOS(fragmentActivityJ)).b(request.c()).g(request.g()).h(request.h()).d(request.k()).i(request.v()).setOnCompleteListener(aVar).build();
        FacebookDialogFragment facebookDialogFragment = new FacebookDialogFragment();
        facebookDialogFragment.setRetainInstance(true);
        facebookDialogFragment.setInnerDialog(this.e);
        facebookDialogFragment.show(fragmentActivityJ.getSupportFragmentManager(), FacebookDialogFragment.TAG);
        return 1;
    }

    @Override // com.facebook.login.LoginMethodHandler, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f);
    }

    public WebViewLoginMethodHandler(Parcel parcel) {
        super(parcel);
        this.f = parcel.readString();
    }
}
