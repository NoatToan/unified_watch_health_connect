package com.facebook.login;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import androidx.view.result.ActivityResultRegistryOwner;
import androidx.view.result.contract.ActivityResultContract;
import com.amazon.identity.auth.device.endpoint.AbstractJSONTokenResponse;
import com.facebook.AccessToken;
import com.facebook.AuthenticationToken;
import com.facebook.CallbackManager;
import com.facebook.FacebookActivity;
import com.facebook.FacebookAuthorizationException;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.GraphResponse;
import com.facebook.LoginStatusCallback;
import com.facebook.Profile;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.CustomTabUtils;
import com.facebook.internal.FragmentWrapper;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.PlatformServiceClient;
import com.facebook.internal.ServerProtocol;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public class LoginManager {
    private static final String j = "publish";
    private static final String k = "manage";
    private static final String l = "express_login_allowed";
    private static final String m = "com.facebook.loginManager";
    private static final Set<String> n = f();
    private static final String o = LoginManager.class.toString();
    private static volatile LoginManager p;
    private final SharedPreferences c;

    @Nullable
    private String e;
    private boolean f;
    private LoginBehavior a = LoginBehavior.NATIVE_WITH_FALLBACK;
    private DefaultAudience b = DefaultAudience.FRIENDS;
    private String d = ServerProtocol.DIALOG_REREQUEST_AUTH_TYPE;
    private LoginTargetApp g = LoginTargetApp.FACEBOOK;
    private boolean h = false;
    private boolean i = false;

    public class a implements CallbackManagerImpl.Callback {
        public final /* synthetic */ FacebookCallback a;

        public a(FacebookCallback facebookCallback) {
            this.a = facebookCallback;
        }

        @Override // com.facebook.internal.CallbackManagerImpl.Callback
        public boolean onActivityResult(int i, Intent intent) {
            return LoginManager.this.q(i, intent, this.a);
        }
    }

    public static class b extends HashSet<String> {
        public b() {
            add("ads_management");
            add("create_event");
            add("rsvp_event");
        }
    }

    public class c implements CallbackManagerImpl.Callback {
        public c() {
        }

        @Override // com.facebook.internal.CallbackManagerImpl.Callback
        public boolean onActivityResult(int i, Intent intent) {
            return LoginManager.this.p(i, intent);
        }
    }

    public class d implements PlatformServiceClient.CompletedListener {
        public final /* synthetic */ String a;
        public final /* synthetic */ com.facebook.login.a b;
        public final /* synthetic */ LoginStatusCallback c;
        public final /* synthetic */ String d;

        public d(String str, com.facebook.login.a aVar, LoginStatusCallback loginStatusCallback, String str2) {
            this.a = str;
            this.b = aVar;
            this.c = loginStatusCallback;
            this.d = str2;
        }

        @Override // com.facebook.internal.PlatformServiceClient.CompletedListener
        public void completed(Bundle bundle) {
            if (bundle == null) {
                this.b.m(this.a);
                this.c.onFailure();
                return;
            }
            String string = bundle.getString(NativeProtocol.STATUS_ERROR_TYPE);
            String string2 = bundle.getString(NativeProtocol.STATUS_ERROR_DESCRIPTION);
            if (string != null) {
                LoginManager.g(string, string2, this.a, this.b, this.c);
                return;
            }
            String string3 = bundle.getString(NativeProtocol.EXTRA_ACCESS_TOKEN);
            Date bundleLongAsDate = Utility.getBundleLongAsDate(bundle, NativeProtocol.EXTRA_EXPIRES_SECONDS_SINCE_EPOCH, new Date(0L));
            ArrayList<String> stringArrayList = bundle.getStringArrayList(NativeProtocol.EXTRA_PERMISSIONS);
            String string4 = bundle.getString(NativeProtocol.RESULT_ARGS_SIGNED_REQUEST);
            String string5 = bundle.getString("graph_domain");
            Date bundleLongAsDate2 = Utility.getBundleLongAsDate(bundle, NativeProtocol.EXTRA_DATA_ACCESS_EXPIRATION_TIME, new Date(0L));
            String userIDFromSignedRequest = Utility.isNullOrEmpty(string4) ? null : LoginMethodHandler.getUserIDFromSignedRequest(string4);
            if (Utility.isNullOrEmpty(string3) || stringArrayList == null || stringArrayList.isEmpty() || Utility.isNullOrEmpty(userIDFromSignedRequest)) {
                this.b.m(this.a);
                this.c.onFailure();
                return;
            }
            AccessToken accessToken = new AccessToken(string3, this.d, userIDFromSignedRequest, stringArrayList, null, null, null, bundleLongAsDate, null, bundleLongAsDate2, string5);
            AccessToken.setCurrentAccessToken(accessToken);
            Profile.fetchProfileForCurrentAccessToken();
            this.b.o(this.a);
            this.c.onCompleted(accessToken);
        }
    }

    public static class e implements com.facebook.login.b {
        private final Activity a;

        public e(Activity activity) {
            Validate.notNull(activity, "activity");
            this.a = activity;
        }

        @Override // com.facebook.login.b
        public Activity a() {
            return this.a;
        }

        @Override // com.facebook.login.b
        public void startActivityForResult(Intent intent, int i) {
            this.a.startActivityForResult(intent, i);
        }
    }

    public static class f implements com.facebook.login.b {
        private ActivityResultRegistryOwner a;
        private CallbackManager b;

        public class a extends ActivityResultContract<Intent, Pair<Integer, Intent>> {
            public a() {
            }

            @Override // androidx.view.result.contract.ActivityResultContract
            @NonNull
            public Intent createIntent(@NonNull Context context, Intent intent) {
                return intent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.view.result.contract.ActivityResultContract
            public Pair<Integer, Intent> parseResult(int i, @Nullable Intent intent) {
                return Pair.create(Integer.valueOf(i), intent);
            }
        }

        public class b {
            private ActivityResultLauncher<Intent> a = null;

            public b() {
            }
        }

        public class c implements ActivityResultCallback<Pair<Integer, Intent>> {
            public final /* synthetic */ b a;

            public c(b bVar) {
                this.a = bVar;
            }

            @Override // androidx.view.result.ActivityResultCallback
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onActivityResult(Pair<Integer, Intent> pair) {
                f.this.b.onActivityResult(CallbackManagerImpl.RequestCodeOffset.Login.toRequestCode(), ((Integer) pair.first).intValue(), (Intent) pair.second);
                if (this.a.a != null) {
                    this.a.a.unregister();
                    this.a.a = null;
                }
            }
        }

        public f(@NonNull ActivityResultRegistryOwner activityResultRegistryOwner, @NonNull CallbackManager callbackManager) {
            this.a = activityResultRegistryOwner;
            this.b = callbackManager;
        }

        @Override // com.facebook.login.b
        public Activity a() {
            Object obj = this.a;
            if (obj instanceof Activity) {
                return (Activity) obj;
            }
            return null;
        }

        @Override // com.facebook.login.b
        public void startActivityForResult(Intent intent, int i) {
            b bVar = new b();
            bVar.a = this.a.getActivityResultRegistry().register("facebook-login", new a(), new c(bVar));
            bVar.a.launch(intent);
        }
    }

    public static class g implements com.facebook.login.b {
        private final FragmentWrapper a;

        public g(FragmentWrapper fragmentWrapper) {
            Validate.notNull(fragmentWrapper, "fragment");
            this.a = fragmentWrapper;
        }

        @Override // com.facebook.login.b
        public Activity a() {
            return this.a.getActivity();
        }

        @Override // com.facebook.login.b
        public void startActivityForResult(Intent intent, int i) {
            this.a.startActivityForResult(intent, i);
        }
    }

    public static class h {
        private static com.facebook.login.a a;

        private h() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:11:0x000f A[Catch: all -> 0x0022, TRY_ENTER, TryCatch #0 {, blocks: (B:6:0x0006, B:11:0x000f, B:13:0x0013, B:14:0x001e), top: B:20:0x0006 }] */
        /* JADX WARN: Code duplicated, block: B:13:0x0013 A[Catch: all -> 0x0022, TryCatch #0 {, blocks: (B:6:0x0006, B:11:0x000f, B:13:0x0013, B:14:0x001e), top: B:20:0x0006 }] */
        /* JADX WARN: Code duplicated, block: B:8:0x000c  */
        public static synchronized com.facebook.login.a b(Context context) {
            if (context != null) {
                if (context == null) {
                    return null;
                }
                if (a == null) {
                    a = new com.facebook.login.a(context, FacebookSdk.getApplicationId());
                }
                return a;
            }
            context = FacebookSdk.getApplicationContext();
            if (context == null) {
                return null;
            }
            if (a == null) {
                a = new com.facebook.login.a(context, FacebookSdk.getApplicationId());
            }
            return a;
            throw th;
        }
    }

    public LoginManager() {
        Validate.sdkInitialized();
        this.c = FacebookSdk.getApplicationContext().getSharedPreferences(m, 0);
        if (!FacebookSdk.hasCustomTabsPrefetching || CustomTabUtils.getChromePackage() == null) {
            return;
        }
        CustomTabsClient.bindCustomTabsService(FacebookSdk.getApplicationContext(), "com.android.chrome", new CustomTabPrefetchHelper());
        CustomTabsClient.connectAndInitialize(FacebookSdk.getApplicationContext(), FacebookSdk.getApplicationContext().getPackageName());
    }

    public static LoginResult b(LoginClient.Request request, AccessToken accessToken, @Nullable AuthenticationToken authenticationToken) {
        Set<String> setI = request.i();
        HashSet hashSet = new HashSet(accessToken.getPermissions());
        if (request.m()) {
            hashSet.retainAll(setI);
        }
        HashSet hashSet2 = new HashSet(setI);
        hashSet2.removeAll(hashSet);
        return new LoginResult(accessToken, authenticationToken, hashSet, hashSet2);
    }

    private LoginClient.Request c(GraphResponse graphResponse) {
        Validate.notNull(graphResponse, AbstractJSONTokenResponse.RESPONSE);
        AccessToken accessToken = graphResponse.getRequest().getAccessToken();
        return createLoginRequest(accessToken != null ? accessToken.getPermissions() : null);
    }

    private void d(AccessToken accessToken, @Nullable AuthenticationToken authenticationToken, LoginClient.Request request, FacebookException facebookException, boolean z, FacebookCallback<LoginResult> facebookCallback) {
        if (accessToken != null) {
            AccessToken.setCurrentAccessToken(accessToken);
            Profile.fetchProfileForCurrentAccessToken();
        }
        if (authenticationToken != null) {
            AuthenticationToken.setCurrentAuthenticationToken(authenticationToken);
        }
        if (facebookCallback != null) {
            LoginResult loginResultB = accessToken != null ? b(request, accessToken, authenticationToken) : null;
            if (z || (loginResultB != null && loginResultB.getRecentlyGrantedPermissions().size() == 0)) {
                facebookCallback.onCancel();
                return;
            }
            if (facebookException != null) {
                facebookCallback.onError(facebookException);
            } else if (accessToken != null) {
                v(true);
                facebookCallback.onSuccess(loginResultB);
            }
        }
    }

    @Nullable
    public static Map<String, String> e(Intent intent) {
        if (intent == null) {
            return null;
        }
        intent.setExtrasClassLoader(LoginClient.Result.class.getClassLoader());
        LoginClient.Result result = (LoginClient.Result) intent.getParcelableExtra(LoginFragment.d);
        if (result == null) {
            return null;
        }
        return result.extraData;
    }

    private static Set<String> f() {
        return Collections.unmodifiableSet(new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void g(String str, String str2, String str3, com.facebook.login.a aVar, LoginStatusCallback loginStatusCallback) {
        FacebookException facebookException = new FacebookException(str + ": " + str2);
        aVar.l(str3, facebookException);
        loginStatusCallback.onError(facebookException);
    }

    public static LoginManager getInstance() {
        if (p == null) {
            synchronized (LoginManager.class) {
                if (p == null) {
                    p = new LoginManager();
                }
            }
        }
        return p;
    }

    private boolean h() {
        return this.c.getBoolean(l, true);
    }

    public static boolean i(String str) {
        return str != null && (str.startsWith(j) || str.startsWith(k) || n.contains(str));
    }

    private void j(@Nullable Context context, LoginClient.Result.b bVar, Map<String, String> map, Exception exc, boolean z, LoginClient.Request request) {
        com.facebook.login.a aVarB = h.b(context);
        if (aVarB == null) {
            return;
        }
        String str = com.facebook.login.a.i;
        if (request == null) {
            aVarB.r(com.facebook.login.a.i, "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.");
            return;
        }
        HashMap map2 = new HashMap();
        map2.put(com.facebook.login.a.A, z ? "1" : "0");
        String strB = request.b();
        if (request.k()) {
            str = com.facebook.login.a.r;
        }
        aVarB.j(strB, map2, bVar, map, exc, str);
    }

    private void k(@NonNull ActivityResultRegistryOwner activityResultRegistryOwner, @NonNull CallbackManager callbackManager, @NonNull LoginConfiguration loginConfiguration) {
        w(new f(activityResultRegistryOwner, callbackManager), createLoginRequestWithConfig(loginConfiguration));
    }

    private void l(FragmentWrapper fragmentWrapper, Collection<String> collection) {
        y(collection);
        o(fragmentWrapper, new LoginConfiguration(collection));
    }

    private void m(FragmentWrapper fragmentWrapper, Collection<String> collection) {
        z(collection);
        logIn(fragmentWrapper, new LoginConfiguration(collection));
    }

    private void n(@Nullable Context context, LoginClient.Request request) {
        com.facebook.login.a aVarB = h.b(context);
        if (aVarB == null || request == null) {
            return;
        }
        aVarB.q(request, request.k() ? com.facebook.login.a.q : com.facebook.login.a.h);
    }

    private void o(FragmentWrapper fragmentWrapper, @NonNull LoginConfiguration loginConfiguration) {
        logIn(fragmentWrapper, loginConfiguration);
    }

    private void r(FragmentWrapper fragmentWrapper) {
        w(new g(fragmentWrapper), createReauthorizeRequest());
    }

    private void s(FragmentWrapper fragmentWrapper, GraphResponse graphResponse) {
        w(new g(fragmentWrapper), c(graphResponse));
    }

    private boolean t(Intent intent) {
        return FacebookSdk.getApplicationContext().getPackageManager().resolveActivity(intent, 0) != null;
    }

    private void u(Context context, LoginStatusCallback loginStatusCallback, long j2) {
        String applicationId = FacebookSdk.getApplicationId();
        String string = UUID.randomUUID().toString();
        com.facebook.login.a aVar = new com.facebook.login.a(context, applicationId);
        if (!h()) {
            aVar.m(string);
            loginStatusCallback.onFailure();
            return;
        }
        LoginStatusClient loginStatusClient = new LoginStatusClient(context, applicationId, string, FacebookSdk.getGraphApiVersion(), j2, null);
        loginStatusClient.setCompletedListener(new d(string, aVar, loginStatusCallback, applicationId));
        aVar.n(string);
        if (loginStatusClient.start()) {
            return;
        }
        aVar.m(string);
        loginStatusCallback.onFailure();
    }

    private void v(boolean z) {
        SharedPreferences.Editor editorEdit = this.c.edit();
        editorEdit.putBoolean(l, z);
        editorEdit.apply();
    }

    private void w(com.facebook.login.b bVar, LoginClient.Request request) throws FacebookException {
        n(bVar.a(), request);
        CallbackManagerImpl.registerStaticCallback(CallbackManagerImpl.RequestCodeOffset.Login.toRequestCode(), new c());
        if (x(bVar, request)) {
            return;
        }
        FacebookException facebookException = new FacebookException("Log in attempt failed: FacebookActivity could not be started. Please make sure you added FacebookActivity to the AndroidManifest.");
        j(bVar.a(), LoginClient.Result.b.ERROR, null, facebookException, false, request);
        throw facebookException;
    }

    private boolean x(com.facebook.login.b bVar, LoginClient.Request request) {
        Intent facebookActivityIntent = getFacebookActivityIntent(request);
        if (!t(facebookActivityIntent)) {
            return false;
        }
        try {
            bVar.startActivityForResult(facebookActivityIntent, LoginClient.getLoginRequestCode());
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }

    private void y(Collection<String> collection) {
        if (collection == null) {
            return;
        }
        for (String str : collection) {
            if (!i(str)) {
                throw new FacebookException(String.format("Cannot pass a read permission (%s) to a request for publish authorization", str));
            }
        }
    }

    private void z(Collection<String> collection) {
        if (collection == null) {
            return;
        }
        for (String str : collection) {
            if (i(str)) {
                throw new FacebookException(String.format("Cannot pass a publish or manage permission (%s) to a request for read authorization", str));
            }
        }
    }

    public LoginClient.Request createLoginRequest(Collection<String> collection) {
        LoginClient.Request request = new LoginClient.Request(this.a, Collections.unmodifiableSet(collection != null ? new HashSet(collection) : new HashSet()), this.b, this.d, FacebookSdk.getApplicationId(), UUID.randomUUID().toString(), this.g);
        request.t(AccessToken.isCurrentAccessTokenActive());
        request.setMessengerPageId(this.e);
        request.setResetMessengerState(this.f);
        request.r(this.h);
        request.u(this.i);
        return request;
    }

    public LoginClient.Request createLoginRequestWithConfig(LoginConfiguration loginConfiguration) {
        LoginClient.Request request = new LoginClient.Request(this.a, Collections.unmodifiableSet(loginConfiguration.getPermissions() != null ? new HashSet(loginConfiguration.getPermissions()) : new HashSet()), this.b, this.d, FacebookSdk.getApplicationId(), UUID.randomUUID().toString(), this.g, loginConfiguration.getNonce());
        request.t(AccessToken.isCurrentAccessTokenActive());
        request.setMessengerPageId(this.e);
        request.setResetMessengerState(this.f);
        request.r(this.h);
        request.u(this.i);
        return request;
    }

    public LoginClient.Request createReauthorizeRequest() {
        LoginClient.Request request = new LoginClient.Request(LoginBehavior.DIALOG_ONLY, new HashSet(), this.b, "reauthorize", FacebookSdk.getApplicationId(), UUID.randomUUID().toString(), this.g);
        request.r(this.h);
        request.u(this.i);
        return request;
    }

    public String getAuthType() {
        return this.d;
    }

    public DefaultAudience getDefaultAudience() {
        return this.b;
    }

    public Intent getFacebookActivityIntent(LoginClient.Request request) {
        Intent intent = new Intent();
        intent.setClass(FacebookSdk.getApplicationContext(), FacebookActivity.class);
        intent.setAction(request.g().toString());
        Bundle bundle = new Bundle();
        bundle.putParcelable("request", request);
        intent.putExtra(LoginFragment.e, bundle);
        return intent;
    }

    public LoginBehavior getLoginBehavior() {
        return this.a;
    }

    public LoginTargetApp getLoginTargetApp() {
        return this.g;
    }

    public boolean getShouldSkipAccountDeduplication() {
        return this.i;
    }

    public boolean isFamilyLogin() {
        return this.h;
    }

    public void logIn(Fragment fragment, Collection<String> collection) {
        logIn(new FragmentWrapper(fragment), collection);
    }

    public void logInWithConfiguration(Fragment fragment, @NonNull LoginConfiguration loginConfiguration) {
        o(new FragmentWrapper(fragment), loginConfiguration);
    }

    @Deprecated
    public void logInWithPublishPermissions(Fragment fragment, Collection<String> collection) {
        l(new FragmentWrapper(fragment), collection);
    }

    @Deprecated
    public void logInWithReadPermissions(Fragment fragment, Collection<String> collection) {
        m(new FragmentWrapper(fragment), collection);
    }

    public void logOut() {
        AccessToken.setCurrentAccessToken(null);
        AuthenticationToken.setCurrentAuthenticationToken(null);
        Profile.setCurrentProfile(null);
        v(false);
    }

    public void loginWithConfiguration(Activity activity, @NonNull LoginConfiguration loginConfiguration) {
        logIn(activity, loginConfiguration);
    }

    public boolean p(int i, Intent intent) {
        return q(i, intent, null);
    }

    public boolean q(int i, Intent intent, FacebookCallback<LoginResult> facebookCallback) {
        LoginClient.Result.b bVar;
        AccessToken accessToken;
        AuthenticationToken authenticationToken;
        LoginClient.Request request;
        Map<String, String> map;
        boolean z;
        Map<String, String> map2;
        LoginClient.Request request2;
        AuthenticationToken authenticationToken2;
        boolean z2;
        LoginClient.Result.b bVar2 = LoginClient.Result.b.ERROR;
        FacebookException facebookException = null;
        boolean z3 = false;
        if (intent != null) {
            intent.setExtrasClassLoader(LoginClient.Result.class.getClassLoader());
            LoginClient.Result result = (LoginClient.Result) intent.getParcelableExtra(LoginFragment.d);
            if (result != null) {
                LoginClient.Request request3 = result.f;
                LoginClient.Result.b bVar3 = result.a;
                if (i == -1) {
                    if (bVar3 == LoginClient.Result.b.SUCCESS) {
                        accessToken = result.b;
                        authenticationToken2 = result.c;
                    } else {
                        authenticationToken2 = null;
                        facebookException = new FacebookAuthorizationException(result.d);
                        accessToken = null;
                    }
                } else if (i == 0) {
                    accessToken = null;
                    authenticationToken2 = null;
                    z3 = true;
                } else {
                    accessToken = null;
                    authenticationToken2 = null;
                }
                map2 = result.loggingExtras;
                boolean z4 = z3;
                request2 = request3;
                bVar2 = bVar3;
                z2 = z4;
            } else {
                accessToken = null;
                map2 = null;
                request2 = null;
                authenticationToken2 = null;
                z2 = false;
            }
            map = map2;
            z = z2;
            authenticationToken = authenticationToken2;
            bVar = bVar2;
            request = request2;
        } else if (i == 0) {
            bVar = LoginClient.Result.b.CANCEL;
            accessToken = null;
            authenticationToken = null;
            request = null;
            map = null;
            z = true;
        } else {
            bVar = bVar2;
            accessToken = null;
            authenticationToken = null;
            request = null;
            map = null;
            z = false;
        }
        if (facebookException == null && accessToken == null && !z) {
            facebookException = new FacebookException("Unexpected call to LoginManager.onActivityResult");
        }
        FacebookException facebookException2 = facebookException;
        LoginClient.Request request4 = request;
        j(null, bVar, map, facebookException2, true, request4);
        d(accessToken, authenticationToken, request4, facebookException2, z, facebookCallback);
        return true;
    }

    public void reauthorizeDataAccess(Activity activity) {
        w(new e(activity), createReauthorizeRequest());
    }

    public void registerCallback(CallbackManager callbackManager, FacebookCallback<LoginResult> facebookCallback) {
        if (!(callbackManager instanceof CallbackManagerImpl)) {
            throw new FacebookException("Unexpected CallbackManager, please use the provided Factory.");
        }
        ((CallbackManagerImpl) callbackManager).registerCallback(CallbackManagerImpl.RequestCodeOffset.Login.toRequestCode(), new a(facebookCallback));
    }

    public void resolveError(Activity activity, GraphResponse graphResponse) {
        w(new e(activity), c(graphResponse));
    }

    public void retrieveLoginStatus(Context context, LoginStatusCallback loginStatusCallback) {
        retrieveLoginStatus(context, 5000L, loginStatusCallback);
    }

    public LoginManager setAuthType(String str) {
        this.d = str;
        return this;
    }

    public LoginManager setDefaultAudience(DefaultAudience defaultAudience) {
        this.b = defaultAudience;
        return this;
    }

    public LoginManager setFamilyLogin(boolean z) {
        this.h = z;
        return this;
    }

    public LoginManager setLoginBehavior(LoginBehavior loginBehavior) {
        this.a = loginBehavior;
        return this;
    }

    public LoginManager setLoginTargetApp(LoginTargetApp loginTargetApp) {
        this.g = loginTargetApp;
        return this;
    }

    public LoginManager setMessengerPageId(@Nullable String str) {
        this.e = str;
        return this;
    }

    public LoginManager setResetMessengerState(boolean z) {
        this.f = z;
        return this;
    }

    public LoginManager setShouldSkipAccountDeduplication(boolean z) {
        this.i = z;
        return this;
    }

    public void unregisterCallback(CallbackManager callbackManager) {
        if (!(callbackManager instanceof CallbackManagerImpl)) {
            throw new FacebookException("Unexpected CallbackManager, please use the provided Factory.");
        }
        ((CallbackManagerImpl) callbackManager).unregisterCallback(CallbackManagerImpl.RequestCodeOffset.Login.toRequestCode());
    }

    public void logIn(Fragment fragment, Collection<String> collection, String str) {
        logIn(new FragmentWrapper(fragment), collection, str);
    }

    public void logInWithPublishPermissions(@NonNull Fragment fragment, @NonNull CallbackManager callbackManager, @NonNull Collection<String> collection) {
        FragmentActivity activity = fragment.getActivity();
        if (activity != null) {
            logInWithPublishPermissions(activity, callbackManager, collection);
            return;
        }
        throw new FacebookException("Cannot obtain activity context on the fragment " + fragment.toString());
    }

    public void logInWithReadPermissions(@NonNull Fragment fragment, @NonNull CallbackManager callbackManager, @NonNull Collection<String> collection) {
        FragmentActivity activity = fragment.getActivity();
        if (activity != null) {
            logInWithReadPermissions(activity, callbackManager, collection);
            return;
        }
        throw new FacebookException("Cannot obtain activity context on the fragment " + fragment.toString());
    }

    public void retrieveLoginStatus(Context context, long j2, LoginStatusCallback loginStatusCallback) {
        u(context, loginStatusCallback, j2);
    }

    public void logIn(android.app.Fragment fragment, Collection<String> collection) {
        logIn(new FragmentWrapper(fragment), collection);
    }

    public void reauthorizeDataAccess(Fragment fragment) {
        r(new FragmentWrapper(fragment));
    }

    public void logIn(android.app.Fragment fragment, Collection<String> collection, String str) {
        logIn(new FragmentWrapper(fragment), collection, str);
    }

    @Deprecated
    public void resolveError(Fragment fragment, GraphResponse graphResponse) {
        s(new FragmentWrapper(fragment), graphResponse);
    }

    public void logIn(FragmentWrapper fragmentWrapper, Collection<String> collection) {
        logIn(fragmentWrapper, new LoginConfiguration(collection));
    }

    public void resolveError(@NonNull Fragment fragment, @NonNull CallbackManager callbackManager, @NonNull GraphResponse graphResponse) {
        FragmentActivity activity = fragment.getActivity();
        if (activity != null) {
            resolveError(activity, callbackManager, graphResponse);
            return;
        }
        throw new FacebookException("Cannot obtain activity context on the fragment " + fragment.toString());
    }

    public void logInWithPublishPermissions(android.app.Fragment fragment, Collection<String> collection) {
        l(new FragmentWrapper(fragment), collection);
    }

    public void logInWithReadPermissions(android.app.Fragment fragment, Collection<String> collection) {
        m(new FragmentWrapper(fragment), collection);
    }

    public void logIn(FragmentWrapper fragmentWrapper, Collection<String> collection, String str) {
        LoginClient.Request requestCreateLoginRequestWithConfig = createLoginRequestWithConfig(new LoginConfiguration(collection));
        requestCreateLoginRequestWithConfig.n(str);
        w(new g(fragmentWrapper), requestCreateLoginRequestWithConfig);
    }

    public void logInWithPublishPermissions(Activity activity, Collection<String> collection) {
        y(collection);
        loginWithConfiguration(activity, new LoginConfiguration(collection));
    }

    public void logInWithReadPermissions(Activity activity, Collection<String> collection) {
        z(collection);
        logIn(activity, new LoginConfiguration(collection));
    }

    public void resolveError(android.app.Fragment fragment, GraphResponse graphResponse) {
        s(new FragmentWrapper(fragment), graphResponse);
    }

    public void logInWithPublishPermissions(@NonNull ActivityResultRegistryOwner activityResultRegistryOwner, @NonNull CallbackManager callbackManager, @NonNull Collection<String> collection) {
        y(collection);
        k(activityResultRegistryOwner, callbackManager, new LoginConfiguration(collection));
    }

    public void logInWithReadPermissions(@NonNull ActivityResultRegistryOwner activityResultRegistryOwner, @NonNull CallbackManager callbackManager, @NonNull Collection<String> collection) {
        z(collection);
        k(activityResultRegistryOwner, callbackManager, new LoginConfiguration(collection));
    }

    public void resolveError(@NonNull ActivityResultRegistryOwner activityResultRegistryOwner, @NonNull CallbackManager callbackManager, @NonNull GraphResponse graphResponse) {
        w(new f(activityResultRegistryOwner, callbackManager), c(graphResponse));
    }

    public void logIn(Activity activity, Collection<String> collection) {
        logIn(activity, new LoginConfiguration(collection));
    }

    public void logIn(FragmentWrapper fragmentWrapper, @NonNull LoginConfiguration loginConfiguration) {
        w(new g(fragmentWrapper), createLoginRequestWithConfig(loginConfiguration));
    }

    public void logIn(Activity activity, @NonNull LoginConfiguration loginConfiguration) {
        if (activity instanceof ActivityResultRegistryOwner) {
            Log.w(o, "You're calling logging in Facebook with an activity supports androidx activity result APIs. Please follow our document to upgrade to new APIs to avoid overriding onActivityResult().");
        }
        w(new e(activity), createLoginRequestWithConfig(loginConfiguration));
    }

    public void logIn(Activity activity, Collection<String> collection, String str) {
        LoginClient.Request requestCreateLoginRequestWithConfig = createLoginRequestWithConfig(new LoginConfiguration(collection));
        requestCreateLoginRequestWithConfig.n(str);
        w(new e(activity), requestCreateLoginRequestWithConfig);
    }

    public void logIn(@NonNull ActivityResultRegistryOwner activityResultRegistryOwner, @NonNull CallbackManager callbackManager, @NonNull Collection<String> collection, String str) {
        LoginClient.Request requestCreateLoginRequestWithConfig = createLoginRequestWithConfig(new LoginConfiguration(collection));
        requestCreateLoginRequestWithConfig.n(str);
        w(new f(activityResultRegistryOwner, callbackManager), requestCreateLoginRequestWithConfig);
    }

    public void logIn(@NonNull ActivityResultRegistryOwner activityResultRegistryOwner, @NonNull CallbackManager callbackManager, @NonNull Collection<String> collection) {
        k(activityResultRegistryOwner, callbackManager, new LoginConfiguration(collection));
    }
}
