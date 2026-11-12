package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.huawei.hmf.tasks.OnFailureListener;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hmf.tasks.Task;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.support.account.AccountAuthManager;
import com.huawei.hms.support.account.request.AccountAuthParams;
import com.huawei.hms.support.account.request.AccountAuthParamsHelper;
import com.huawei.hms.support.account.result.AuthAccount;
import com.huawei.hms.support.account.service.AccountAuthService;
import com.huawei.hms.support.picker.AccountPickerManager;
import com.huawei.hms.support.picker.request.AccountPickerParams;
import com.huawei.hms.support.picker.request.AccountPickerParamsHelper;
import com.huawei.hms.support.picker.service.AccountPickerService;
import com.huawei.picture.security.account.AccountAgentActivity;
import com.huawei.picture.security.account.bean.AccountInitParams;
import com.huawei.picture.security.account.bean.AuthErrorBean;
import com.huawei.picture.security.account.bean.ErrorStatus;
import com.huawei.picture.security.account.bean.HitopRespInfo;
import com.huawei.picture.security.account.bean.SignInRequest;
import com.huawei.picture.security.account.bean.SignInResponse;
import com.huawei.picture.security.account.bean.UserAccountInfo;
import com.huawei.picture.security.account.bean.UserInfoBean;
import com.huawei.picture.security.account.bean.UserTokenBean;
import com.huawei.picture.security.account.handler.CloudAccountHandler;
import com.huawei.secure.android.common.encrypt.rsa.RSASign;
import com.huawei.secure.android.common.util.SafeBase64;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes13.dex */
public class oqw {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile oqw f44381c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AccountInitParams f44382b;
    private volatile long d = 0;
    public Map<String, CloudAccountHandler> e = new ConcurrentHashMap();

    private oqw() {
    }

    public static oqw a() {
        if (f44381c == null) {
            synchronized (oqw.class) {
                if (f44381c == null) {
                    f44381c = new oqw();
                }
            }
        }
        return f44381c;
    }

    public void c(AccountInitParams accountInitParams) {
        this.f44382b = accountInitParams;
        org.e().b(new orh.e().c(this.f44382b.getApplication()).e("picture_security_sdk_preferences").a("account_work_key").b("picture_security_sdk_root_key").b());
        oqy.a().e(this.f44382b.getAuthErrorParamList());
        orj.c(new Runnable() { // from class: oqv
            @Override // java.lang.Runnable
            public final void run() {
                oqz.d().a();
            }
        });
    }

    public AccountAuthService e(Context context) {
        return AccountAuthManager.getService(context, new AccountAuthParamsHelper(AccountAuthParams.DEFAULT_AUTH_REQUEST_PARAM).setScopeList(this.f44382b.getScopes()).setAuthorizationCode().setUid().createParams());
    }

    public AccountPickerService d(Activity activity) {
        return AccountPickerManager.getService(activity, new AccountPickerParamsHelper(AccountPickerParams.DEFAULT_AUTH_REQUEST_PARAM).setScopeList(this.f44382b.getScopes()).setHostAccessToken(this.f44382b.getAccessToken()).setRedirecturl("hms://redirect_uri").setDeviceInfo(nmm.c(null, null, null, this.f44382b.getDeviceId())).setAccessToken().setAuthorizationCode().setUid().setGrsAppName(this.f44382b.getGrsAppName()).createParams(), 1);
    }

    public void b(CloudAccountHandler cloudAccountHandler) {
        if (!oro.e(this.f44382b.getApplication())) {
            cloudAccountHandler.onRequestError(new ErrorStatus(-100, ""));
            ork.b("CloudAccountManager", "startAccountSDKSilentSignIn isNetworkAvailable false");
            return;
        }
        try {
            if (!cloudAccountHandler.isLoginAccount()) {
                ork.a("CloudAccountManager", "getAccountInfo startAccountSDKActivity.");
                a(cloudAccountHandler);
            } else if (this.f44382b.isMcp()) {
                ork.a("CloudAccountManager", "getAccountInfo trySignIn.");
                c(cloudAccountHandler);
            } else {
                ork.a("CloudAccountManager", "getAccountInfo startAccountSDKSilentSignIn.");
                h(cloudAccountHandler);
            }
        } catch (Exception e) {
            ork.a("CloudAccountManager", "getAccountInfo failed. Exception: ", e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0037, code lost:
    
        if (d(r8) != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean b(CloudAccountHandler cloudAccountHandler, HitopRespInfo hitopRespInfo) {
        if (!TextUtils.equals("11001", hitopRespInfo.getResultCode()) && !oqy.a().b(hitopRespInfo.getUrl(), hitopRespInfo.getResultInfo())) {
            return false;
        }
        ork.a("CloudAccountManager", "generateJsonData auth failed.");
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.d > 10000) {
            try {
            } catch (Exception e) {
                ork.a("CloudAccountManager", "getAccountsByType refreshUserInfo failed: ", e);
            }
        }
        this.d = jCurrentTimeMillis;
        ork.a("CloudAccountManager", "generateJsonData refresh token success.");
        return true;
        this.d = 0L;
        return false;
    }

    public void e(List<AuthErrorBean> list) {
        oqy.a().e(list);
    }

    public void a(final String str, final String str2, final CloudAccountHandler cloudAccountHandler) {
        ork.a("CloudAccountManager", "signInForUserInfo");
        orj.c(new Runnable() { // from class: oqu
            @Override // java.lang.Runnable
            public final void run() {
                this.f44379a.c(str, cloudAccountHandler, str2);
            }
        });
    }

    /* synthetic */ void c(String str, CloudAccountHandler cloudAccountHandler, String str2) {
        Map<String, String> mapA = oqz.d().a(true);
        String str3 = mapA.get("publicKey");
        String str4 = mapA.get("privateKey");
        SignInRequest signInRequest = new SignInRequest();
        signInRequest.setAuthCode(str);
        signInRequest.setPublicKey(str3);
        signInRequest.setAppId(this.f44382b.getAppIds());
        signInRequest.setRedirectUri("hms://redirect_uri");
        SignInResponse signInResponseRequestSignIn = cloudAccountHandler.requestSignIn(signInRequest, str2);
        if (signInResponseRequestSignIn != null) {
            if (TextUtils.equals("00000", signInResponseRequestSignIn.getResultcode())) {
                UserAccountInfo userAccountInfoA = a(signInResponseRequestSignIn);
                orw.d(this.f44382b.getApplication(), "userRefreshToken", org.e().d(userAccountInfoA.getUserId(), "account_work_key") + "@" + signInResponseRequestSignIn.getUserRefreshToken(), "picture_security_sdk_preferences");
                orw.d(this.f44382b.getApplication(), "authPrivateKey", org.e().d(str4, "account_work_key"), "picture_security_sdk_preferences");
                cloudAccountHandler.onRequestFinish(userAccountInfoA);
                ork.a("CloudAccountManager", "signInForUserInfo getAccountInfo success!");
                return;
            }
            orw.d(this.f44382b.getApplication(), "userRefreshToken", "", "picture_security_sdk_preferences");
            cloudAccountHandler.onRequestError(new ErrorStatus(orm.e(signInResponseRequestSignIn.getResultcode(), 0), signInResponseRequestSignIn.getResultinfo()));
            ork.a("CloudAccountManager", "signInForUserInfo getAccountInfo failed!");
            return;
        }
        orw.d(this.f44382b.getApplication(), "userRefreshToken", "", "picture_security_sdk_preferences");
        cloudAccountHandler.onRequestError(new ErrorStatus(-98, ""));
        ork.a("CloudAccountManager", "signInForUserInfo response is null!");
    }

    private boolean d(CloudAccountHandler cloudAccountHandler) {
        ork.a("CloudAccountManager", "refreshUserInfo");
        String strD = d();
        String strC = orw.c(this.f44382b.getApplication(), "authPrivateKey", "", "picture_security_sdk_preferences");
        String strC2 = org.e().c(strC, "account_work_key");
        if (TextUtils.isEmpty(strD) || TextUtils.isEmpty(strC2) || TextUtils.equals(strC2, strC)) {
            ork.a("CloudAccountManager", "reFreshTokenRequest refreshUserInfo failed: " + TextUtils.isEmpty(strD) + " " + TextUtils.isEmpty(strC2));
            b(cloudAccountHandler);
            return false;
        }
        String str = System.currentTimeMillis() + "";
        String strEncodeToString = SafeBase64.encodeToString(RSASign.sign(str.getBytes(Charset.defaultCharset()), oqz.c(strC2), true), 2);
        SignInRequest signInRequest = new SignInRequest();
        signInRequest.setUserRefreshToken(strD);
        signInRequest.setAppId(this.f44382b.getAppIds());
        signInRequest.setTimestamp(str);
        signInRequest.setSign(strEncodeToString);
        SignInResponse signInResponseRequestRefresh = cloudAccountHandler.requestRefresh(signInRequest);
        if (signInResponseRequestRefresh == null) {
            orw.d(this.f44382b.getApplication(), "userRefreshToken", "", "picture_security_sdk_preferences");
            cloudAccountHandler.onRequestError(new ErrorStatus(-98, ""));
            ork.a("CloudAccountManager", "refreshUserInfo response is null!");
        } else {
            String resultcode = signInResponseRequestRefresh.getResultcode();
            if (!TextUtils.equals("00000", resultcode)) {
                orw.d(this.f44382b.getApplication(), "userRefreshToken", "", "picture_security_sdk_preferences");
                cloudAccountHandler.onRequestError(new ErrorStatus(orm.e(resultcode, 0), signInResponseRequestRefresh.getResultinfo()));
                ork.a("CloudAccountManager", "refreshUserInfo getAccountInfo failed!");
            } else {
                UserAccountInfo userAccountInfoA = a(signInResponseRequestRefresh);
                orw.d(this.f44382b.getApplication(), "userRefreshToken", org.e().d(userAccountInfoA.getUserId(), "account_work_key") + "@" + signInResponseRequestRefresh.getUserRefreshToken(), "picture_security_sdk_preferences");
                cloudAccountHandler.onRequestFinish(userAccountInfoA);
                ork.a("CloudAccountManager", "refreshUserInfo getAccountInfo success!");
                return true;
            }
        }
        return false;
    }

    private void a(CloudAccountHandler cloudAccountHandler) {
        Intent intent = new Intent(this.f44382b.getApplication(), (Class<?>) AccountAgentActivity.class);
        String strE = orq.e(16);
        this.e.put(strE, cloudAccountHandler);
        intent.putExtra("handlerId", strE);
        intent.setFlags(268435456);
        orf.a(this.f44382b.getApplication(), intent);
    }

    private void c(CloudAccountHandler cloudAccountHandler) {
        AccountInitParams accountInitParams = this.f44382b;
        if (accountInitParams == null) {
            ork.b("CloudAccountManager", "trySignIn mParams is null");
        } else if (accountInitParams.hasHmsCore()) {
            cloudAccountHandler.logFromSdk("trySilentSignIn has hms core");
            i(cloudAccountHandler);
        } else {
            cloudAccountHandler.logFromSdk("trySilentSignIn not has hms core");
            f(cloudAccountHandler);
        }
    }

    private void i(final CloudAccountHandler cloudAccountHandler) {
        Task<AuthAccount> taskSilentSignIn;
        try {
            AccountAuthService accountAuthServiceE = a().e(this.f44382b.getApplication());
            accountAuthServiceE.setSubAppId(this.f44382b.getSubAppId());
            taskSilentSignIn = accountAuthServiceE.silentSignIn();
        } catch (ApiException unused) {
            ork.b("CloudAccountManager", "trySilentSignIn setSubAppId ApiException!");
            taskSilentSignIn = null;
        } catch (Exception unused2) {
            ork.b("CloudAccountManager", "trySilentSignIn setSubAppId Exception!");
            taskSilentSignIn = null;
        }
        if (taskSilentSignIn == null) {
            cloudAccountHandler.logFromSdk("trySilentSignIn task is null");
            f(cloudAccountHandler);
        } else {
            taskSilentSignIn.addOnSuccessListener(new OnSuccessListener<AuthAccount>() { // from class: oqw.1
                @Override // com.huawei.hmf.tasks.OnSuccessListener
                /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                public void onSuccess(AuthAccount authAccount) {
                    cloudAccountHandler.logFromSdk("trySilentSignIn success");
                    oqw.a().a(authAccount.getAuthorizationCode(), authAccount.getServiceCountryCode(), cloudAccountHandler);
                }
            });
            taskSilentSignIn.addOnFailureListener(new OnFailureListener() { // from class: oqw.3
                @Override // com.huawei.hmf.tasks.OnFailureListener
                public void onFailure(Exception exc) {
                    ork.b("CloudAccountManager", "trySilentSignIn onFailure Exception!");
                    if (exc instanceof ApiException) {
                        int statusCode = ((ApiException) exc).getStatusCode();
                        cloudAccountHandler.logFromSdk("trySilentSignIn failed errorCode:" + statusCode);
                        if (statusCode == 2002 || statusCode == 907135003) {
                            oqw.this.f(cloudAccountHandler);
                            return;
                        }
                        return;
                    }
                    cloudAccountHandler.logFromSdk("trySilentSignIn failed");
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(CloudAccountHandler cloudAccountHandler) {
        Intent intent = new Intent(this.f44382b.getApplication(), (Class<?>) AccountAgentActivity.class);
        intent.putExtra("isMcp", true);
        intent.putExtra("hasMms", this.f44382b.hasHmsCore());
        intent.putExtra("subAppId", this.f44382b.getSubAppId());
        String strE = orq.e(16);
        this.e.put(strE, cloudAccountHandler);
        intent.putExtra("handlerId", strE);
        intent.setFlags(268435456);
        orf.a(this.f44382b.getApplication(), intent);
    }

    private void h(final CloudAccountHandler cloudAccountHandler) {
        Task<AuthAccount> taskSilentSignIn = e(this.f44382b.getApplication()).silentSignIn();
        taskSilentSignIn.addOnSuccessListener(new OnSuccessListener() { // from class: oqx
            @Override // com.huawei.hmf.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                this.d.b(cloudAccountHandler, (AuthAccount) obj);
            }
        });
        taskSilentSignIn.addOnFailureListener(new OnFailureListener() { // from class: oqt
            @Override // com.huawei.hmf.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                oqw.e(cloudAccountHandler, exc);
            }
        });
    }

    /* synthetic */ void b(final CloudAccountHandler cloudAccountHandler, AuthAccount authAccount) {
        String strD = d();
        String strC = orw.c(this.f44382b.getApplication(), "authPrivateKey", "", "picture_security_sdk_preferences");
        String strC2 = org.e().c(strC, "account_work_key");
        if (TextUtils.isEmpty(strD) || TextUtils.isEmpty(strC2) || TextUtils.equals(strC2, strC)) {
            ork.b("CloudAccountManager", "startAccountSDKSilentSignIn refreshToken empty: " + TextUtils.isEmpty(d()) + " ;privateKey empty: " + TextUtils.isEmpty(strC2));
            a(authAccount.getAuthorizationCode(), authAccount.getCountryCode(), cloudAccountHandler);
            return;
        }
        String strB = b();
        if (TextUtils.isEmpty(strB) || !TextUtils.equals(strB, authAccount.getUid())) {
            ork.b("CloudAccountManager", "startAccountSDKSilentSignIn userId empty: " + TextUtils.isEmpty(strB));
            a(authAccount.getAuthorizationCode(), authAccount.getCountryCode(), cloudAccountHandler);
            return;
        }
        orj.c(new Runnable() { // from class: ora
            @Override // java.lang.Runnable
            public final void run() {
                this.e.e(cloudAccountHandler);
            }
        });
    }

    /* synthetic */ void e(CloudAccountHandler cloudAccountHandler) {
        try {
            d(cloudAccountHandler);
        } catch (Exception e) {
            ork.a("CloudAccountManager", "getAccountsByType refreshUserInfo failed: ", e);
        }
    }

    static /* synthetic */ void e(CloudAccountHandler cloudAccountHandler, Exception exc) {
        ork.a("CloudAccountManager", "startAccountSDKSilentSignIn onFailure: ", exc);
        cloudAccountHandler.onRequestError(new ErrorStatus(-99, ""));
    }

    private UserAccountInfo a(SignInResponse signInResponse) {
        UserAccountInfo userAccountInfo = new UserAccountInfo();
        if (signInResponse != null) {
            UserInfoBean userInfo = signInResponse.getUserInfo();
            List<UserTokenBean> userToken = signInResponse.getUserToken();
            if (userInfo != null) {
                userAccountInfo.setUserId(userInfo.getUserId());
                userAccountInfo.setAccountName(userInfo.getAccountName());
                userAccountInfo.setCountryCode(userInfo.getCountryCode());
                userAccountInfo.setServiceCountryCode(userInfo.getServiceCountryCode());
                userAccountInfo.setLoginUserName(userInfo.getLoginUserName());
                userAccountInfo.setAgeGroupFlag(userInfo.getAgeGroupFlag());
                userAccountInfo.setHeadPictureURL(userInfo.getHeadPictureURL());
                userAccountInfo.setSiteId(0);
                userAccountInfo.setUserTokens(userToken);
            }
        }
        return userAccountInfo;
    }

    private String b() {
        String strC = orw.c(this.f44382b.getApplication(), "userRefreshToken", "", "picture_security_sdk_preferences");
        if (TextUtils.isEmpty(strC)) {
            return null;
        }
        String[] strArrSplit = strC.split("@");
        if (strArrSplit.length < 2) {
            return null;
        }
        return org.e().c(strArrSplit[0], "account_work_key");
    }

    private String d() {
        String strC = orw.c(this.f44382b.getApplication(), "userRefreshToken", "", "picture_security_sdk_preferences");
        if (TextUtils.isEmpty(strC)) {
            return null;
        }
        String[] strArrSplit = strC.split("@");
        if (strArrSplit.length < 2) {
            return null;
        }
        return strArrSplit[1];
    }
}
