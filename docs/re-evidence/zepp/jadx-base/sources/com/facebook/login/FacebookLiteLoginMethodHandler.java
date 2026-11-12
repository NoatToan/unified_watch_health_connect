package com.facebook.login;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.internal.NativeProtocol;
import com.huami.watch.transport.httpsupport.cacher.DataCacher;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated(message = "fblite login is deprecated and we will remove this class in v13.0 release")
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0011\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015B\u0011\b\u0016\u0012\u0006\u0010\u0016\u001a\u00020\u0007¢\u0006\u0004\b\u0014\u0010\u0017J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004H\u0016R\u001c\u0010\u0011\u001a\u00020\f8\u0016@\u0016X\u0096D¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0019"}, d2 = {"Lcom/facebook/login/FacebookLiteLoginMethodHandler;", "Lcom/facebook/login/NativeAppLoginMethodHandler;", "Lcom/facebook/login/LoginClient$Request;", "request", "", "tryAuthorize", "describeContents", "Landroid/os/Parcel;", "dest", DataCacher.j, "", "writeToParcel", "", "b", "Ljava/lang/String;", "getNameForLogging", "()Ljava/lang/String;", "nameForLogging", "Lcom/facebook/login/LoginClient;", "loginClient", "<init>", "(Lcom/facebook/login/LoginClient;)V", "source", "(Landroid/os/Parcel;)V", "Companion", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
public final class FacebookLiteLoginMethodHandler extends NativeAppLoginMethodHandler {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String nameForLogging;

    @JvmField
    @NotNull
    public static final Parcelable.Creator<FacebookLiteLoginMethodHandler> CREATOR = new Parcelable.Creator<FacebookLiteLoginMethodHandler>() { // from class: com.facebook.login.FacebookLiteLoginMethodHandler$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public FacebookLiteLoginMethodHandler createFromParcel(@NotNull Parcel source) {
            return new FacebookLiteLoginMethodHandler(source);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public FacebookLiteLoginMethodHandler[] newArray(int size) {
            return new FacebookLiteLoginMethodHandler[size];
        }
    };

    public FacebookLiteLoginMethodHandler(@NotNull LoginClient loginClient) {
        super(loginClient);
        this.nameForLogging = "fb_lite_login";
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

    @Override // com.facebook.login.NativeAppLoginMethodHandler, com.facebook.login.LoginMethodHandler
    public int tryAuthorize(@NotNull LoginClient.Request request) {
        String strM = LoginClient.m();
        Intent intentCreateFacebookLiteIntent = NativeProtocol.createFacebookLiteIntent(getLoginClient().j(), request.a(), request.i(), strM, request.m(), request.j(), request.d(), getClientState(request.b()), request.c(), request.getMessengerPageId(), request.getResetMessengerState(), request.k(), request.v());
        addLoggingExtra("e2e", strM);
        return tryIntent(intentCreateFacebookLiteIntent, LoginClient.getLoginRequestCode()) ? 1 : 0;
    }

    @Override // com.facebook.login.LoginMethodHandler, android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
    }

    public FacebookLiteLoginMethodHandler(@NotNull Parcel parcel) {
        super(parcel);
        this.nameForLogging = "fb_lite_login";
    }
}
