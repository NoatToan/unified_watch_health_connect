package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentActivity;
import com.facebook.AccessToken;
import com.facebook.AccessTokenSource;
import java.util.Collection;
import java.util.Date;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* JADX INFO: loaded from: classes2.dex */
class DeviceAuthMethodHandler extends LoginMethodHandler {
    public static final Parcelable.Creator<DeviceAuthMethodHandler> CREATOR = new a();
    private static ScheduledThreadPoolExecutor b;

    public static class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DeviceAuthMethodHandler createFromParcel(Parcel parcel) {
            return new DeviceAuthMethodHandler(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DeviceAuthMethodHandler[] newArray(int i) {
            return new DeviceAuthMethodHandler[i];
        }
    }

    public DeviceAuthMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    public static synchronized ScheduledThreadPoolExecutor b() {
        if (b == null) {
            b = new ScheduledThreadPoolExecutor(1);
        }
        return b;
    }

    private void f(LoginClient.Request request) {
        FragmentActivity fragmentActivityJ = getLoginClient().j();
        if (fragmentActivityJ == null || fragmentActivityJ.isFinishing()) {
            return;
        }
        DeviceAuthDialog deviceAuthDialogA = a();
        deviceAuthDialogA.show(fragmentActivityJ.getSupportFragmentManager(), "login_with_facebook");
        deviceAuthDialogA.startLogin(request);
    }

    public DeviceAuthDialog a() {
        return new DeviceAuthDialog();
    }

    public void c() {
        getLoginClient().h(LoginClient.Result.a(getLoginClient().getPendingRequest(), "User canceled log in."));
    }

    public void d(Exception exc) {
        getLoginClient().h(LoginClient.Result.c(getLoginClient().getPendingRequest(), null, exc.getMessage()));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void e(String str, String str2, String str3, Collection<String> collection, Collection<String> collection2, Collection<String> collection3, AccessTokenSource accessTokenSource, Date date, Date date2, Date date3) {
        getLoginClient().h(LoginClient.Result.e(getLoginClient().getPendingRequest(), new AccessToken(str, str2, str3, collection, collection2, collection3, accessTokenSource, date, date2, date3)));
    }

    @Override // com.facebook.login.LoginMethodHandler
    public String getNameForLogging() {
        return "device_auth";
    }

    @Override // com.facebook.login.LoginMethodHandler
    public int tryAuthorize(LoginClient.Request request) {
        f(request);
        return 1;
    }

    @Override // com.facebook.login.LoginMethodHandler, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    public DeviceAuthMethodHandler(Parcel parcel) {
        super(parcel);
    }
}
