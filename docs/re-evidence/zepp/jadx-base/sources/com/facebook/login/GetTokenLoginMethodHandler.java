package com.facebook.login;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.AccessTokenSource;
import com.facebook.FacebookException;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.PlatformServiceClient;
import com.facebook.internal.Utility;
import com.squareup.picasso.u;
import com.twitter.sdk.android.tweetcomposer.g;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.y;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0011\b\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bB\u0011\b\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001a\u0010\u001eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bJ\u0016\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bJ\u0016\u0010\f\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bJ\b\u0010\r\u001a\u00020\u0006H\u0016R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0017\u001a\u00020\u00128\u0016@\u0016X\u0096D¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006 "}, d2 = {"Lcom/facebook/login/GetTokenLoginMethodHandler;", "Lcom/facebook/login/LoginMethodHandler;", "", g.g, "Lcom/facebook/login/LoginClient$Request;", "request", "", "tryAuthorize", "Landroid/os/Bundle;", "result", "getTokenCompleted", "onComplete", PointCategory.COMPLETE, "describeContents", "Lcom/facebook/login/GetTokenClient;", "b", "Lcom/facebook/login/GetTokenClient;", "getTokenClient", "", "c", "Ljava/lang/String;", "getNameForLogging", "()Ljava/lang/String;", "nameForLogging", "Lcom/facebook/login/LoginClient;", "loginClient", "<init>", "(Lcom/facebook/login/LoginClient;)V", "Landroid/os/Parcel;", "source", "(Landroid/os/Parcel;)V", "Companion", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
public final class GetTokenLoginMethodHandler extends LoginMethodHandler {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private GetTokenClient getTokenClient;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final String nameForLogging;

    @JvmField
    @NotNull
    public static final Parcelable.Creator<GetTokenLoginMethodHandler> CREATOR = new Parcelable.Creator<GetTokenLoginMethodHandler>() { // from class: com.facebook.login.GetTokenLoginMethodHandler$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public GetTokenLoginMethodHandler createFromParcel(@NotNull Parcel source) {
            return new GetTokenLoginMethodHandler(source);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public GetTokenLoginMethodHandler[] newArray(int size) {
            return new GetTokenLoginMethodHandler[size];
        }
    };

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/os/Bundle;", "result", "", u.D, "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a implements PlatformServiceClient.CompletedListener {
        public final /* synthetic */ LoginClient.Request b;

        public a(LoginClient.Request request) {
            this.b = request;
        }

        @Override // com.facebook.internal.PlatformServiceClient.CompletedListener
        public final void completed(@Nullable Bundle bundle) {
            GetTokenLoginMethodHandler.this.getTokenCompleted(this.b, bundle);
        }
    }

    public GetTokenLoginMethodHandler(@NotNull LoginClient loginClient) {
        super(loginClient);
        this.nameForLogging = "get_token";
    }

    @Override // com.facebook.login.LoginMethodHandler
    public void cancel() {
        GetTokenClient getTokenClient = this.getTokenClient;
        if (getTokenClient != null) {
            getTokenClient.cancel();
            getTokenClient.setCompletedListener(null);
            this.getTokenClient = null;
        }
    }

    public final void complete(@NotNull final LoginClient.Request request, @NotNull final Bundle result) {
        String string = result.getString(NativeProtocol.EXTRA_USER_ID);
        if (!(string == null || string.length() == 0)) {
            onComplete(request, result);
            return;
        }
        getLoginClient().s();
        String string2 = result.getString(NativeProtocol.EXTRA_ACCESS_TOKEN);
        if (string2 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        Utility.getGraphMeRequestWithCacheAsync(string2, new Utility.GraphMeRequestWithCacheCallback() { // from class: com.facebook.login.GetTokenLoginMethodHandler.complete.1
            @Override // com.facebook.internal.Utility.GraphMeRequestWithCacheCallback
            public void onFailure(@Nullable FacebookException error) {
                GetTokenLoginMethodHandler.this.getLoginClient().g(LoginClient.Result.c(GetTokenLoginMethodHandler.this.getLoginClient().getPendingRequest(), "Caught exception", error != null ? error.getMessage() : null));
            }

            @Override // com.facebook.internal.Utility.GraphMeRequestWithCacheCallback
            public void onSuccess(@Nullable JSONObject userInfo) {
                try {
                    result.putString(NativeProtocol.EXTRA_USER_ID, userInfo != null ? userInfo.getString("id") : null);
                    GetTokenLoginMethodHandler.this.onComplete(request, result);
                } catch (JSONException e) {
                    GetTokenLoginMethodHandler.this.getLoginClient().g(LoginClient.Result.c(GetTokenLoginMethodHandler.this.getLoginClient().getPendingRequest(), "Caught exception", e.getMessage()));
                }
            }
        });
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.LoginMethodHandler
    @NotNull
    public String getNameForLogging() {
        return this.nameForLogging;
    }

    public final void getTokenCompleted(@NotNull LoginClient.Request request, @Nullable Bundle result) {
        GetTokenClient getTokenClient = this.getTokenClient;
        if (getTokenClient != null) {
            getTokenClient.setCompletedListener(null);
        }
        this.getTokenClient = null;
        getLoginClient().t();
        if (result != null) {
            List stringArrayList = result.getStringArrayList(NativeProtocol.EXTRA_PERMISSIONS);
            if (stringArrayList == null) {
                stringArrayList = CollectionsKt__CollectionsKt.emptyList();
            }
            Set<String> setI = request.i();
            if (setI == null) {
                setI = y.emptySet();
            }
            String string = result.getString(NativeProtocol.EXTRA_AUTHENTICATION_TOKEN);
            if (setI.contains("openid")) {
                if (string == null || string.length() == 0) {
                    getLoginClient().A();
                    return;
                }
            }
            if (stringArrayList.containsAll(setI)) {
                complete(request, result);
                return;
            }
            HashSet hashSet = new HashSet();
            for (String str : setI) {
                if (!stringArrayList.contains(str)) {
                    hashSet.add(str);
                }
            }
            if (!hashSet.isEmpty()) {
                addLoggingExtra(com.facebook.login.a.D, TextUtils.join(",", hashSet));
            }
            request.s(hashSet);
        }
        getLoginClient().A();
    }

    public final void onComplete(@NotNull LoginClient.Request request, @NotNull Bundle result) {
        LoginClient.Result resultC;
        try {
            LoginMethodHandler.Companion companion = LoginMethodHandler.INSTANCE;
            resultC = LoginClient.Result.b(request, companion.createAccessTokenFromNativeLogin(result, AccessTokenSource.FACEBOOK_APPLICATION_SERVICE, request.a()), companion.createAuthenticationTokenFromNativeLogin(result, request.getNonce()));
        } catch (FacebookException e) {
            resultC = LoginClient.Result.c(getLoginClient().getPendingRequest(), null, e.getMessage());
        }
        getLoginClient().h(resultC);
    }

    @Override // com.facebook.login.LoginMethodHandler
    public int tryAuthorize(@NotNull LoginClient.Request request) {
        GetTokenClient getTokenClient = new GetTokenClient(getLoginClient().j(), request);
        this.getTokenClient = getTokenClient;
        if (!getTokenClient.start()) {
            return 0;
        }
        getLoginClient().s();
        a aVar = new a(request);
        GetTokenClient getTokenClient2 = this.getTokenClient;
        if (getTokenClient2 == null) {
            return 1;
        }
        getTokenClient2.setCompletedListener(aVar);
        return 1;
    }

    public GetTokenLoginMethodHandler(@NotNull Parcel parcel) {
        super(parcel);
        this.nameForLogging = "get_token";
    }
}
