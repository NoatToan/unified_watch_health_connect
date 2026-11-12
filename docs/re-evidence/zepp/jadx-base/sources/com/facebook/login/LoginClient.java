package com.facebook.login;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.AccessToken;
import com.facebook.AuthenticationToken;
import com.facebook.CustomTabMainActivity;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import com.twitter.sdk.android.tweetcomposer.g;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@VisibleForTesting(otherwise = 3)
public class LoginClient implements Parcelable {
    public static final Parcelable.Creator<LoginClient> CREATOR = new a();
    public LoginMethodHandler[] a;
    public int b;
    public Fragment c;
    public OnCompletedListener d;
    public b e;
    public boolean f;
    public Request g;
    public Map<String, String> h;
    public Map<String, String> i;
    private com.facebook.login.a j;
    private int k;
    private int l;

    public interface OnCompletedListener {
        void onCompleted(Result result);
    }

    public static class Request implements Parcelable {
        public static final Parcelable.Creator<Request> CREATOR = new a();
        private final LoginBehavior a;
        private Set<String> b;
        private final DefaultAudience c;
        private final String d;
        private String e;
        private boolean f;
        private String g;
        private String h;
        private String i;

        @Nullable
        private String j;
        private boolean k;
        private final LoginTargetApp l;
        private boolean m;
        private boolean n;
        private String o;

        public static class a implements Parcelable.Creator<Request> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Request createFromParcel(Parcel parcel) {
                return new Request(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Request[] newArray(int i) {
                return new Request[i];
            }
        }

        public /* synthetic */ Request(Parcel parcel, a aVar) {
            this(parcel);
        }

        public String a() {
            return this.d;
        }

        public String b() {
            return this.e;
        }

        public String c() {
            return this.h;
        }

        public DefaultAudience d() {
            return this.c;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String e() {
            return this.i;
        }

        public String f() {
            return this.g;
        }

        public LoginBehavior g() {
            return this.a;
        }

        @Nullable
        public String getMessengerPageId() {
            return this.j;
        }

        public String getNonce() {
            return this.o;
        }

        public boolean getResetMessengerState() {
            return this.k;
        }

        public LoginTargetApp h() {
            return this.l;
        }

        public Set<String> i() {
            return this.b;
        }

        public boolean j() {
            Iterator<String> it2 = this.b.iterator();
            while (it2.hasNext()) {
                if (LoginManager.i(it2.next())) {
                    return true;
                }
            }
            return false;
        }

        public boolean k() {
            return this.m;
        }

        public boolean l() {
            return this.l == LoginTargetApp.INSTAGRAM;
        }

        public boolean m() {
            return this.f;
        }

        public void n(String str) {
            this.e = str;
        }

        public void o(String str) {
            this.h = str;
        }

        public void p(String str) {
            this.i = str;
        }

        public void q(String str) {
            this.g = str;
        }

        public void r(boolean z) {
            this.m = z;
        }

        public void s(Set<String> set) {
            Validate.notNull(set, "permissions");
            this.b = set;
        }

        public void setMessengerPageId(@Nullable String str) {
            this.j = str;
        }

        public void setResetMessengerState(boolean z) {
            this.k = z;
        }

        public void t(boolean z) {
            this.f = z;
        }

        public void u(boolean z) {
            this.n = z;
        }

        public boolean v() {
            return this.n;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            LoginBehavior loginBehavior = this.a;
            parcel.writeString(loginBehavior != null ? loginBehavior.name() : null);
            parcel.writeStringList(new ArrayList(this.b));
            DefaultAudience defaultAudience = this.c;
            parcel.writeString(defaultAudience != null ? defaultAudience.name() : null);
            parcel.writeString(this.d);
            parcel.writeString(this.e);
            parcel.writeByte(this.f ? (byte) 1 : (byte) 0);
            parcel.writeString(this.g);
            parcel.writeString(this.h);
            parcel.writeString(this.i);
            parcel.writeString(this.j);
            parcel.writeByte(this.k ? (byte) 1 : (byte) 0);
            LoginTargetApp loginTargetApp = this.l;
            parcel.writeString(loginTargetApp != null ? loginTargetApp.name() : null);
            parcel.writeByte(this.m ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.n ? (byte) 1 : (byte) 0);
            parcel.writeString(this.o);
        }

        public Request(LoginBehavior loginBehavior, Set<String> set, DefaultAudience defaultAudience, String str, String str2, String str3) {
            this(loginBehavior, set, defaultAudience, str, str2, str3, LoginTargetApp.FACEBOOK);
        }

        public Request(LoginBehavior loginBehavior, Set<String> set, DefaultAudience defaultAudience, String str, String str2, String str3, LoginTargetApp loginTargetApp) {
            this(loginBehavior, set, defaultAudience, str, str2, str3, loginTargetApp, null);
        }

        public Request(LoginBehavior loginBehavior, Set<String> set, DefaultAudience defaultAudience, String str, String str2, String str3, LoginTargetApp loginTargetApp, String str4) {
            this.f = false;
            this.m = false;
            this.n = false;
            this.a = loginBehavior;
            this.b = set == null ? new HashSet<>() : set;
            this.c = defaultAudience;
            this.h = str;
            this.d = str2;
            this.e = str3;
            this.l = loginTargetApp;
            if (Utility.isNullOrEmpty(str4)) {
                this.o = UUID.randomUUID().toString();
            } else {
                this.o = str4;
            }
        }

        private Request(Parcel parcel) {
            this.f = false;
            this.m = false;
            this.n = false;
            String string = parcel.readString();
            this.a = string != null ? LoginBehavior.valueOf(string) : null;
            ArrayList arrayList = new ArrayList();
            parcel.readStringList(arrayList);
            this.b = new HashSet(arrayList);
            String string2 = parcel.readString();
            this.c = string2 != null ? DefaultAudience.valueOf(string2) : null;
            this.d = parcel.readString();
            this.e = parcel.readString();
            this.f = parcel.readByte() != 0;
            this.g = parcel.readString();
            this.h = parcel.readString();
            this.i = parcel.readString();
            this.j = parcel.readString();
            this.k = parcel.readByte() != 0;
            String string3 = parcel.readString();
            this.l = string3 != null ? LoginTargetApp.valueOf(string3) : null;
            this.m = parcel.readByte() != 0;
            this.n = parcel.readByte() != 0;
            this.o = parcel.readString();
        }
    }

    public static class Result implements Parcelable {
        public static final Parcelable.Creator<Result> CREATOR = new a();
        public final b a;

        @Nullable
        public final AccessToken b;

        @Nullable
        public final AuthenticationToken c;

        @Nullable
        public final String d;

        @Nullable
        public final String e;
        public Map<String, String> extraData;
        public final Request f;
        public Map<String, String> loggingExtras;

        public static class a implements Parcelable.Creator<Result> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Result createFromParcel(Parcel parcel) {
                return new Result(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Result[] newArray(int i) {
                return new Result[i];
            }
        }

        public enum b {
            SUCCESS("success"),
            CANCEL(g.g),
            ERROR("error");

            private final String loggingValue;

            b(String str) {
                this.loggingValue = str;
            }

            public String a() {
                return this.loggingValue;
            }
        }

        public /* synthetic */ Result(Parcel parcel, a aVar) {
            this(parcel);
        }

        public static Result a(Request request, @Nullable String str) {
            return new Result(request, b.CANCEL, null, str, null);
        }

        public static Result b(Request request, AccessToken accessToken, AuthenticationToken authenticationToken) {
            return new Result(request, b.SUCCESS, accessToken, authenticationToken, null, null);
        }

        public static Result c(Request request, @Nullable String str, @Nullable String str2) {
            return d(request, str, str2, null);
        }

        public static Result d(Request request, @Nullable String str, @Nullable String str2, @Nullable String str3) {
            return new Result(request, b.ERROR, null, TextUtils.join(": ", Utility.asListNoNulls(str, str2)), str3);
        }

        public static Result e(Request request, AccessToken accessToken) {
            return new Result(request, b.SUCCESS, accessToken, null, null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.a.name());
            parcel.writeParcelable(this.b, i);
            parcel.writeParcelable(this.c, i);
            parcel.writeString(this.d);
            parcel.writeString(this.e);
            parcel.writeParcelable(this.f, i);
            Utility.writeStringMapToParcel(parcel, this.loggingExtras);
            Utility.writeStringMapToParcel(parcel, this.extraData);
        }

        public Result(Request request, b bVar, @Nullable AccessToken accessToken, @Nullable String str, @Nullable String str2) {
            this(request, bVar, accessToken, null, str, str2);
        }

        public Result(Request request, b bVar, @Nullable AccessToken accessToken, @Nullable AuthenticationToken authenticationToken, @Nullable String str, @Nullable String str2) {
            Validate.notNull(bVar, "code");
            this.f = request;
            this.b = accessToken;
            this.c = authenticationToken;
            this.d = str;
            this.a = bVar;
            this.e = str2;
        }

        private Result(Parcel parcel) {
            this.a = b.valueOf(parcel.readString());
            this.b = (AccessToken) parcel.readParcelable(AccessToken.class.getClassLoader());
            this.c = (AuthenticationToken) parcel.readParcelable(AuthenticationToken.class.getClassLoader());
            this.d = parcel.readString();
            this.e = parcel.readString();
            this.f = (Request) parcel.readParcelable(Request.class.getClassLoader());
            this.loggingExtras = Utility.readStringMapFromParcel(parcel);
            this.extraData = Utility.readStringMapFromParcel(parcel);
        }
    }

    public static class a implements Parcelable.Creator<LoginClient> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public LoginClient createFromParcel(Parcel parcel) {
            return new LoginClient(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public LoginClient[] newArray(int i) {
            return new LoginClient[i];
        }
    }

    public interface b {
        void a();

        void b();
    }

    public LoginClient(Fragment fragment) {
        this.b = -1;
        this.k = 0;
        this.l = 0;
        this.c = fragment;
    }

    private void b(String str, String str2, boolean z) {
        if (this.h == null) {
            this.h = new HashMap();
        }
        if (this.h.containsKey(str) && z) {
            str2 = this.h.get(str) + "," + str2;
        }
        this.h.put(str, str2);
    }

    public static int getLoginRequestCode() {
        return CallbackManagerImpl.RequestCodeOffset.Login.toRequestCode();
    }

    private void i() {
        g(Result.c(this.g, "Login attempt failed.", null));
    }

    public static String m() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(PointCategory.INIT, System.currentTimeMillis());
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    private com.facebook.login.a o() {
        com.facebook.login.a aVar = this.j;
        if (aVar == null || !aVar.b().equals(this.g.a())) {
            this.j = new com.facebook.login.a(j(), this.g.a());
        }
        return this.j;
    }

    private void q(String str, Result result, Map<String, String> map) {
        r(str, result.a.a(), result.d, result.e, map);
    }

    private void r(String str, String str2, String str3, String str4, Map<String, String> map) {
        Request request = this.g;
        String str5 = com.facebook.login.a.e;
        if (request == null) {
            o().s(com.facebook.login.a.e, "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.", str);
            return;
        }
        com.facebook.login.a aVarO = o();
        String strB = this.g.b();
        if (this.g.k()) {
            str5 = com.facebook.login.a.n;
        }
        aVarO.d(strB, str, str2, str3, str4, map, str5);
    }

    private void u(Result result) {
        OnCompletedListener onCompletedListener = this.d;
        if (onCompletedListener != null) {
            onCompletedListener.onCompleted(result);
        }
    }

    public void A() {
        int i;
        if (this.b >= 0) {
            r(l().getNameForLogging(), com.facebook.login.a.g, null, null, l().getMethodLoggingExtras());
        }
        do {
            LoginMethodHandler[] loginMethodHandlerArr = this.a;
            if (loginMethodHandlerArr == null || (i = this.b) >= loginMethodHandlerArr.length - 1) {
                if (this.g != null) {
                    i();
                    return;
                }
                return;
            }
            this.b = i + 1;
        } while (!z());
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027 A[Catch: Exception -> 0x0034, TryCatch #0 {Exception -> 0x0034, blocks: (B:7:0x000e, B:9:0x001c, B:11:0x0030, B:10:0x0027), top: B:18:0x000e }] */
    public void B(Result result) {
        Result resultC;
        if (result.b == null) {
            throw new FacebookException("Can't validate without a token");
        }
        AccessToken currentAccessToken = AccessToken.getCurrentAccessToken();
        AccessToken accessToken = result.b;
        if (currentAccessToken == null || accessToken == null) {
            resultC = Result.c(this.g, "User logged in as different Facebook user.", null);
        } else {
            try {
                if (currentAccessToken.getUserId().equals(accessToken.getUserId())) {
                    resultC = Result.b(this.g, result.b, result.c);
                } else {
                    resultC = Result.c(this.g, "User logged in as different Facebook user.", null);
                }
            } catch (Exception e) {
                g(Result.c(this.g, "Caught exception", e.getMessage()));
                return;
            }
        }
        g(resultC);
    }

    public void a(String str, String str2, boolean z) {
        if (this.i == null) {
            this.i = new HashMap();
        }
        if (this.i.containsKey(str) && z) {
            str2 = this.i.get(str) + "," + str2;
        }
        this.i.put(str, str2);
    }

    public void c(Request request) {
        if (request == null) {
            return;
        }
        if (this.g != null) {
            throw new FacebookException("Attempted to authorize while a request is pending.");
        }
        if (!AccessToken.isCurrentAccessTokenActive() || e()) {
            this.g = request;
            this.a = getHandlersToTry(request);
            A();
        }
    }

    public void d() {
        if (this.b >= 0) {
            l().cancel();
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean e() {
        if (this.f) {
            return true;
        }
        if (f("android.permission.INTERNET") == 0) {
            this.f = true;
            return true;
        }
        FragmentActivity fragmentActivityJ = j();
        g(Result.c(this.g, fragmentActivityJ.getString(com.facebook.common.R.string.com_facebook_internet_permission_error_title), fragmentActivityJ.getString(com.facebook.common.R.string.com_facebook_internet_permission_error_message)));
        return false;
    }

    public int f(String str) {
        return j().checkCallingOrSelfPermission(str);
    }

    public void g(Result result) {
        LoginMethodHandler loginMethodHandlerL = l();
        if (loginMethodHandlerL != null) {
            q(loginMethodHandlerL.getNameForLogging(), result, loginMethodHandlerL.getMethodLoggingExtras());
        }
        Map<String, String> map = this.h;
        if (map != null) {
            result.loggingExtras = map;
        }
        Map<String, String> map2 = this.i;
        if (map2 != null) {
            result.extraData = map2;
        }
        this.a = null;
        this.b = -1;
        this.g = null;
        this.h = null;
        this.k = 0;
        this.l = 0;
        u(result);
    }

    public Fragment getFragment() {
        return this.c;
    }

    public LoginMethodHandler[] getHandlersToTry(Request request) {
        ArrayList arrayList = new ArrayList();
        LoginBehavior loginBehaviorG = request.g();
        if (!request.l()) {
            if (loginBehaviorG.getAllowsGetTokenAuth()) {
                arrayList.add(new GetTokenLoginMethodHandler(this));
            }
            if (!FacebookSdk.bypassAppSwitch && loginBehaviorG.getAllowsKatanaAuth()) {
                arrayList.add(new KatanaProxyLoginMethodHandler(this));
            }
            if (!FacebookSdk.bypassAppSwitch && loginBehaviorG.getAllowsFacebookLiteAuth()) {
                arrayList.add(new FacebookLiteLoginMethodHandler(this));
            }
        } else if (!FacebookSdk.bypassAppSwitch && loginBehaviorG.getAllowsInstagramAppAuth()) {
            arrayList.add(new InstagramAppLoginMethodHandler(this));
        }
        if (loginBehaviorG.getAllowsCustomTabAuth()) {
            arrayList.add(new CustomTabLoginMethodHandler(this));
        }
        if (loginBehaviorG.getAllowsWebViewAuth()) {
            arrayList.add(new WebViewLoginMethodHandler(this));
        }
        if (!request.l() && loginBehaviorG.getAllowsDeviceAuth()) {
            arrayList.add(new DeviceAuthMethodHandler(this));
        }
        LoginMethodHandler[] loginMethodHandlerArr = new LoginMethodHandler[arrayList.size()];
        arrayList.toArray(loginMethodHandlerArr);
        return loginMethodHandlerArr;
    }

    public Request getPendingRequest() {
        return this.g;
    }

    public void h(Result result) {
        if (result.b == null || !AccessToken.isCurrentAccessTokenActive()) {
            g(result);
        } else {
            B(result);
        }
    }

    public FragmentActivity j() {
        return this.c.getActivity();
    }

    public b k() {
        return this.e;
    }

    public LoginMethodHandler l() {
        int i = this.b;
        if (i >= 0) {
            return this.a[i];
        }
        return null;
    }

    public boolean n() {
        return this.g != null && this.b >= 0;
    }

    public boolean onActivityResult(int i, int i2, Intent intent) {
        this.k++;
        if (this.g != null) {
            if (intent != null && intent.getBooleanExtra(CustomTabMainActivity.NO_ACTIVITY_EXCEPTION, false)) {
                A();
                return false;
            }
            if (!l().shouldKeepTrackOfMultipleIntents() || intent != null || this.k >= this.l) {
                return l().onActivityResult(i, i2, intent);
            }
        }
        return false;
    }

    public OnCompletedListener p() {
        return this.d;
    }

    public void s() {
        b bVar = this.e;
        if (bVar != null) {
            bVar.a();
        }
    }

    public void t() {
        b bVar = this.e;
        if (bVar != null) {
            bVar.b();
        }
    }

    public void v(b bVar) {
        this.e = bVar;
    }

    public void w(Fragment fragment) {
        if (this.c != null) {
            throw new FacebookException("Can't set fragment once it is already set.");
        }
        this.c = fragment;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelableArray(this.a, i);
        parcel.writeInt(this.b);
        parcel.writeParcelable(this.g, i);
        Utility.writeStringMapToParcel(parcel, this.h);
        Utility.writeStringMapToParcel(parcel, this.i);
    }

    public void x(OnCompletedListener onCompletedListener) {
        this.d = onCompletedListener;
    }

    public void y(Request request) {
        if (n()) {
            return;
        }
        c(request);
    }

    public boolean z() {
        LoginMethodHandler loginMethodHandlerL = l();
        if (loginMethodHandlerL.needsInternetPermission() && !e()) {
            b(com.facebook.login.a.B, "1", false);
            return false;
        }
        int iTryAuthorize = loginMethodHandlerL.tryAuthorize(this.g);
        this.k = 0;
        if (iTryAuthorize > 0) {
            o().h(this.g.b(), loginMethodHandlerL.getNameForLogging(), this.g.k() ? com.facebook.login.a.m : com.facebook.login.a.d);
            this.l = iTryAuthorize;
        } else {
            o().f(this.g.b(), loginMethodHandlerL.getNameForLogging(), this.g.k() ? com.facebook.login.a.o : com.facebook.login.a.f);
            b(com.facebook.login.a.C, loginMethodHandlerL.getNameForLogging(), true);
        }
        return iTryAuthorize > 0;
    }

    public LoginClient(Parcel parcel) {
        this.b = -1;
        this.k = 0;
        this.l = 0;
        Parcelable[] parcelableArray = parcel.readParcelableArray(LoginMethodHandler.class.getClassLoader());
        this.a = new LoginMethodHandler[parcelableArray.length];
        for (int i = 0; i < parcelableArray.length; i++) {
            LoginMethodHandler[] loginMethodHandlerArr = this.a;
            loginMethodHandlerArr[i] = (LoginMethodHandler) parcelableArray[i];
            loginMethodHandlerArr[i].setLoginClient(this);
        }
        this.b = parcel.readInt();
        this.g = (Request) parcel.readParcelable(Request.class.getClassLoader());
        this.h = Utility.readStringMapFromParcel(parcel);
        this.i = Utility.readStringMapFromParcel(parcel);
    }
}
