package com.huawei.watchface;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.huawei.common.util.Utils;
import com.huawei.hms.support.api.entity.auth.Scope;
import com.huawei.hms.support.api.entity.pay.HwPayConstant;
import com.huawei.operation.OpAnalyticsConstants;
import com.huawei.picture.security.account.bean.AccountInitParams;
import com.huawei.picture.security.account.bean.AuthErrorBean;
import com.huawei.picture.security.account.bean.ErrorStatus;
import com.huawei.picture.security.account.bean.HitopRespInfo;
import com.huawei.picture.security.account.bean.SignInRequest;
import com.huawei.picture.security.account.bean.SignInResponse;
import com.huawei.picture.security.account.bean.UserAccountInfo;
import com.huawei.picture.security.account.bean.UserTokenBean;
import com.huawei.picture.security.account.handler.CloudAccountHandler;
import com.huawei.secure.android.common.intent.SafeBundle;
import com.huawei.watchface.api.HwWatchFaceApi;
import com.huawei.watchface.environment.Environment;
import com.huawei.watchface.flavor.FlavorConfig;
import com.huawei.watchface.mvp.model.helper.GsonHelper;
import com.huawei.watchface.mvp.model.helper.systemparam.NewSystemParamManager;
import com.huawei.watchface.mvp.model.helper.systemparam.SystemParamNames;
import com.huawei.watchface.mvp.model.thread.HitopSignInThread;
import com.huawei.watchface.utils.ArrayUtils;
import com.huawei.watchface.utils.BackgroundTaskUtils;
import com.huawei.watchface.utils.CommonUtils;
import com.huawei.watchface.utils.DensityUtil;
import com.huawei.watchface.utils.HwLog;
import com.huawei.watchface.utils.callback.OperateWatchFaceCallback;
import defpackage.oqw;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes20.dex */
public class c2 {
    public static volatile c2 t;
    public static UserAccountInfo u;
    public static CloudAccountHandler v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f30100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Runnable f30101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public oqw f30102c;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public long l;
    public String m;
    public long n;
    public OperateWatchFaceCallback r;
    public List d = new CopyOnWriteArrayList();
    public boolean o = false;
    public boolean p = false;
    public long q = 0;
    public boolean s = false;

    public class a implements CloudAccountHandler {
        public a() {
        }

        @Override // com.huawei.picture.security.account.handler.CloudAccountHandler
        public boolean isLoginAccount() {
            HwLog.i("HwUserTokenServiceManager", "isLoginAccount enter");
            return HwWatchFaceApi.getInstance(c2.this.f30100a).isLogin();
        }

        @Override // com.huawei.picture.security.account.handler.CloudAccountHandler
        public void logFromSdk(String str) {
            HwLog.i("HwUserTokenServiceManager", "logFromSdk:" + str);
        }

        @Override // com.huawei.picture.security.account.handler.CloudAccountHandler
        public void onRequestError(ErrorStatus errorStatus) {
            HwLog.e("HwUserTokenServiceManager", "onRequestError: ErrorCode:" + errorStatus.getErrorCode() + "ErrorReason:" + errorStatus.getErrorReason());
            c2 c2Var = c2.this;
            c2Var.k = c2Var.e;
            c2Var.a(-1);
        }

        @Override // com.huawei.picture.security.account.handler.CloudAccountHandler
        public void onRequestFinish(UserAccountInfo userAccountInfo) {
            HwLog.i("HwUserTokenServiceManager", "onRequestFinish enter");
            FlavorConfig.safeHwLog("HwUserTokenServiceManager", "onRequestFinish mUserAccountInfo:" + GsonHelper.toJson(userAccountInfo));
            if (userAccountInfo == null) {
                HwLog.i("HwUserTokenServiceManager", "onRequestFinish accounts is null!");
                return;
            }
            c2 c2Var = c2.this;
            c2Var.s = c2Var.a(c2Var.f, c2Var.i, userAccountInfo);
            c2.u = userAccountInfo;
            c2.this.i = userAccountInfo.getServiceCountryCode();
            c2.this.j = userAccountInfo.getCountryCode();
            HwLog.i("HwUserTokenServiceManager", "onRequestFinish mServiceCountryCode:" + c2.this.i + ",mRegisterCountryCode:" + c2.this.j);
            c2.this.f = userAccountInfo.getUserId();
            UserTokenBean userTokenBeanP = c2.this.p();
            if (userTokenBeanP == null) {
                HwLog.e("HwUserTokenServiceManager", "onRequestFinish accounts.getUserTokens() is null!");
                return;
            }
            c2.this.g = userTokenBeanP.getExpire();
            c2.this.h = userTokenBeanP.getToken();
            c2 c2Var2 = c2.this;
            c2Var2.k = c2Var2.h;
            c2Var2.E();
            OperateWatchFaceCallback operateWatchFaceCallback = c2.this.r;
            if (operateWatchFaceCallback != null) {
                operateWatchFaceCallback.transmitUserTokenUpdate();
            }
        }

        @Override // com.huawei.picture.security.account.handler.CloudAccountHandler
        public SignInResponse requestRefresh(SignInRequest signInRequest) {
            HwLog.i("HwUserTokenServiceManager", "requestRefresh enter");
            if (signInRequest == null) {
                HwLog.e("HwUserTokenServiceManager", "signInRequest is null");
                return null;
            }
            SafeBundle safeBundle = new SafeBundle();
            safeBundle.putString("appId", "10003");
            safeBundle.putString("timestamp", signInRequest.getTimestamp());
            safeBundle.putString(HwPayConstant.KEY_SIGN, signInRequest.getSign());
            safeBundle.putString("userRefreshToken", signInRequest.getUserRefreshToken());
            r1 r1Var = new r1(safeBundle.getBundle());
            return r1Var.b(r1Var.e());
        }

        @Override // com.huawei.picture.security.account.handler.CloudAccountHandler
        public SignInResponse requestSignIn(SignInRequest signInRequest, String str) {
            HwLog.i("HwUserTokenServiceManager", "requestSignIn enter");
            c2.this.p = false;
            if (signInRequest == null) {
                HwLog.e("HwUserTokenServiceManager", "signInRequest is null");
                return null;
            }
            SafeBundle safeBundle = new SafeBundle();
            safeBundle.putString("authCode", signInRequest.getAuthCode());
            safeBundle.putString("countryCode", str);
            safeBundle.putString("appId", "10003");
            safeBundle.putString("redirectUri", "hms://redirect_uri");
            safeBundle.putString("publicKey", signInRequest.getPublicKey());
            HitopSignInThread hitopSignInThread = new HitopSignInThread(safeBundle.getBundle());
            SignInResponse signInResponseB = hitopSignInThread.b(hitopSignInThread.e());
            if (signInResponseB == null || signInResponseB.getUserInfo() == null) {
                HwLog.d("HwUserTokenServiceManager", "response is null or getUserInfo is null");
                c2.this.a(-1);
                return signInResponseB;
            }
            c2.this.m = String.valueOf(signInResponseB.getUserInfo().getAgeGroupFlag());
            HwLog.d("HwUserTokenServiceManager", "mAccountType:" + c2.this.m + ",sp mAccountType:" + c2.this.r());
            e4.a(c2.this.f30100a, true);
            g2.b().a(HwWatchFaceApi.getInstance(c2.this.f30100a).getDeviceIdentify());
            c2.this.a(signInResponseB.getUserInfo().getAgeGroupFlag());
            return signInResponseB;
        }
    }

    public class b implements HwWatchFaceApi.RefreshAccessTokenListener {
        public b() {
        }

        @Override // com.huawei.watchface.api.HwWatchFaceApi.RefreshAccessTokenListener
        public void onLoginFailed(Object obj) {
            HwLog.e("HwUserTokenServiceManager", "onLoginFailed enter object: " + GsonHelper.toJson(obj));
        }

        @Override // com.huawei.watchface.api.HwWatchFaceApi.RefreshAccessTokenListener
        public void onLoginSuccess(Object obj) {
            if (obj instanceof String) {
                c2 c2Var = c2.this;
                c2Var.e = (String) obj;
                c2Var.F();
            }
        }
    }

    public class c implements HwWatchFaceApi.RefreshAccessTokenListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f30105a;

        public c(boolean z) {
            this.f30105a = z;
        }

        @Override // com.huawei.watchface.api.HwWatchFaceApi.RefreshAccessTokenListener
        public void onLoginFailed(Object obj) {
            c2.this.a(this.f30105a);
            HwLog.i("HwUserTokenServiceManager", "init -- onLoginFailed enter object: " + GsonHelper.toJson(obj));
        }

        @Override // com.huawei.watchface.api.HwWatchFaceApi.RefreshAccessTokenListener
        public void onLoginSuccess(Object obj) {
            if (obj instanceof String) {
                c2 c2Var = c2.this;
                c2Var.e = (String) obj;
                c2Var.a(this.f30105a);
            }
        }
    }

    public c2(Context context) {
        this.f30100a = context;
        c();
        this.l = b("REFRESH_EXPIRE_PREF");
        this.n = b("EXPIRE_TIME_PREF");
        String strN = n();
        this.f = strN;
        this.i = a("USER_SERVICES_COUNTRY_CODE_PREF", strN);
        this.j = a("USER_REGISTER_COUNTRY_CODE_PREF", this.f);
        String strQ = q();
        this.h = strQ;
        this.k = TextUtils.isEmpty(strQ) ? this.e : this.h;
        FlavorConfig.safeHwLog("HwUserTokenServiceManager", "mToken init:" + this.k);
        a();
        this.f30101b = new Runnable() { // from class: com.huawei.watchface.c2$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.A();
            }
        };
        v = new a();
    }

    public static c2 a(Context context) {
        if (t == null) {
            synchronized (c2.class) {
                if (t == null) {
                    t = new c2(context.getApplicationContext());
                }
            }
        }
        return t;
    }

    public final /* synthetic */ void A() {
        try {
            HwLog.i("HwUserTokenServiceManager", "updateToken on runnable");
            B();
        } catch (Exception e) {
            HwLog.i("HwUserTokenServiceManager", "updateToken exception: " + HwLog.printException(e));
        }
    }

    public final void B() {
        synchronized (this) {
            HwLog.i("HwUserTokenServiceManager", "refreshAccessToken enter ");
            HwWatchFaceApi.getInstance(this.f30100a).refreshAccessToken(new b());
        }
    }

    public void C() {
        if (this.p) {
            HwLog.i("HwUserTokenServiceManager", "refreshAccountInfo -- enter!");
            CloudAccountHandler cloudAccountHandler = v;
            if (cloudAccountHandler == null) {
                HwLog.e("HwUserTokenServiceManager", "refreshAccountInfo -- mCloudAccountHandler can not be null!");
                return;
            }
            oqw oqwVar = this.f30102c;
            if (oqwVar == null) {
                HwLog.e("HwUserTokenServiceManager", "refreshAccountInfo -- cloudAccountManager can not be null!");
            } else {
                oqwVar.b(cloudAccountHandler);
                this.p = false;
            }
        }
    }

    public void D() {
        if (v() || TextUtils.isEmpty(this.f)) {
            return;
        }
        d(true);
    }

    public final void E() {
        Exception e;
        long jA;
        long jA2;
        SharedPreferences sharedPreferencesB = e4.b(Environment.getApplicationContext(), "USER_TOKEN_FILE_PREF");
        if (sharedPreferencesB == null) {
            HwLog.i("HwUserTokenServiceManager", "preferences is null");
            return;
        }
        if (!TextUtils.isEmpty(this.g)) {
            HwLog.i("HwUserTokenServiceManager", "mExpireInterval vaule =" + this.g);
            try {
                jA = a(r2.a(this.g, 0L));
                try {
                    jA2 = a(r2.a(this.g, 0L) / 2);
                } catch (Exception e2) {
                    e = e2;
                    HwLog.i("HwUserTokenServiceManager", "saveAccountInfo Exception:" + HwLog.printException(e));
                    jA2 = 0L;
                }
            } catch (Exception e3) {
                e = e3;
                jA = 0;
            }
            if (jA != 0) {
                this.n = jA;
                sharedPreferencesB.edit().putLong("EXPIRE_TIME_PREF", jA).apply();
            }
            if (jA2 != 0) {
                this.l = jA2;
                sharedPreferencesB.edit().putLong("REFRESH_EXPIRE_PREF", jA2).apply();
            }
        }
        if (!TextUtils.isEmpty(this.h)) {
            sharedPreferencesB.edit().putString("USER_TOKEN_VALUE_PREF", k5.c(this.h, "storagePw")).apply();
        }
        if (TextUtils.isEmpty(this.f)) {
            return;
        }
        String strC = k5.c(this.f, "storagePw");
        sharedPreferencesB.edit().putString("USER_ID_PREF", strC).apply();
        if (!TextUtils.isEmpty(this.i)) {
            String strC2 = k5.c(this.i, "storagePw");
            sharedPreferencesB.edit().putString("USER_SERVICES_COUNTRY_CODE_PREF", strC + "_" + strC2).apply();
        }
        if (TextUtils.isEmpty(this.j)) {
            return;
        }
        String strC3 = k5.c(this.j, "storagePw");
        sharedPreferencesB.edit().putString("USER_REGISTER_COUNTRY_CODE_PREF", strC + "_" + strC3).apply();
    }

    public final void F() {
        synchronized (this) {
            G();
            HwLog.i("HwUserTokenServiceManager", "startPolling");
            Runnable runnable = this.f30101b;
            if (runnable != null) {
                BackgroundTaskUtils.a(runnable, 3600000);
            }
        }
    }

    public final void G() {
        synchronized (this) {
            if (this.f30101b != null) {
                HwLog.i("HwUserTokenServiceManager", "stopPolling: removeTaskFromWorker");
                BackgroundTaskUtils.a(this.f30101b);
            }
        }
    }

    public final long b(String str) {
        SharedPreferences sharedPreferencesB = e4.b(Environment.getApplicationContext(), "USER_TOKEN_FILE_PREF");
        if (sharedPreferencesB != null && !TextUtils.isEmpty(str)) {
            return sharedPreferencesB.getLong(str, 0L);
        }
        HwLog.i("HwUserTokenServiceManager", "sharedPreferences is null or key is empty");
        return 0L;
    }

    public final void c() {
        synchronized (this) {
            HwLog.i("HwUserTokenServiceManager", "getAccessToken enter ");
            if (TextUtils.isEmpty(this.e)) {
                this.e = HwWatchFaceApi.getInstance(this.f30100a).getAccessToken();
                FlavorConfig.safeHwLog("HwUserTokenServiceManager", "getAccessToken mRefreshAccessToken:" + this.e);
            }
            if (TextUtils.isEmpty(this.e)) {
                B();
            } else {
                F();
            }
        }
    }

    public final void d() {
        HwLog.i("HwUserTokenServiceManager", "getAccountInfo -- enter!");
        if (v == null) {
            HwLog.e("HwUserTokenServiceManager", "getAccountInfo -- mCloudAccountHandler can not be null!");
            return;
        }
        if (this.f30102c == null) {
            HwLog.e("HwUserTokenServiceManager", "getAccountInfo -- cloudAccountManager can not be null!");
        } else if (!CommonUtils.q()) {
            this.f30102c.b(v);
        } else {
            HwLog.e("HwUserTokenServiceManager", "getAccountInfo -- cloudAccountManager is backGround!");
            this.p = true;
        }
    }

    public void e(boolean z) {
        this.s = z;
    }

    public String f() {
        return this.m;
    }

    public final String g() {
        return FlavorConfig.MCP_APP_ID;
    }

    public String h() {
        return (TextUtils.isEmpty(this.h) || z()) ? HwWatchFaceApi.getInstance(this.f30100a).getAccessToken() : this.h;
    }

    public String i() {
        return this.j;
    }

    public String j() {
        return this.i;
    }

    public String k() {
        return (TextUtils.isEmpty(this.k) || z()) ? HwWatchFaceApi.getInstance(this.f30100a).getAccessToken() : this.k;
    }

    public String l() {
        StringBuffer stringBuffer = new StringBuffer(2);
        String deviceType = HwWatchFaceApi.getInstance(this.f30100a).getDeviceType();
        if (TextUtils.isEmpty(this.h) || z()) {
            stringBuffer.append(HwWatchFaceApi.getInstance(this.f30100a).getAccessToken()).append("_").append(deviceType);
            if (2 == HwWatchFaceApi.getInstance(this.f30100a).getAccessTokenType()) {
                stringBuffer.append("_AT");
            } else {
                stringBuffer.append("_ST");
            }
        } else {
            stringBuffer.append(this.h).append("_").append(deviceType).append("_ST");
        }
        return stringBuffer.toString();
    }

    public String[] m() {
        String[] strArr = new String[2];
        if (!TextUtils.isEmpty(this.h) && !z()) {
            strArr[0] = this.h;
            strArr[1] = "ST";
            return strArr;
        }
        strArr[0] = HwWatchFaceApi.getInstance(this.f30100a).getAccessToken();
        if (2 == HwWatchFaceApi.getInstance(this.f30100a).getAccessTokenType()) {
            strArr[1] = "AT";
            return strArr;
        }
        strArr[1] = "ST";
        return strArr;
    }

    public final String n() {
        SharedPreferences sharedPreferencesB = e4.b(Environment.getApplicationContext(), "USER_TOKEN_FILE_PREF");
        if (sharedPreferencesB == null) {
            HwLog.i("HwUserTokenServiceManager", "sharedPreferences is null");
            return null;
        }
        String string = sharedPreferencesB.getString("USER_ID_PREF", null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return k5.a(string, "storagePw");
    }

    public String o() {
        return this.h;
    }

    public final UserTokenBean p() {
        HwLog.i("HwUserTokenServiceManager", "getCurrentUserTokenBean enter");
        UserAccountInfo userAccountInfo = u;
        if (userAccountInfo == null || userAccountInfo.getUserTokens() == null) {
            HwLog.e("HwUserTokenServiceManager", "mUserAccountInfo token is empty");
            return null;
        }
        for (UserTokenBean userTokenBean : u.getUserTokens()) {
            if (!TextUtils.isEmpty(userTokenBean.getAppId()) && userTokenBean.getAppId().equals("10003")) {
                return userTokenBean;
            }
        }
        return null;
    }

    public final String q() {
        if (z()) {
            return null;
        }
        SharedPreferences sharedPreferencesB = e4.b(Environment.getApplicationContext(), "USER_TOKEN_FILE_PREF");
        if (sharedPreferencesB == null) {
            HwLog.i("HwUserTokenServiceManager", "sharedPreferences is null");
            return null;
        }
        String string = sharedPreferencesB.getString("USER_TOKEN_VALUE_PREF", null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return k5.a(string, "storagePw");
    }

    public final String r() {
        SharedPreferences sharedPreferencesB = e4.b(Environment.getApplicationContext(), "USER_TOKEN_FILE_PREF");
        if (sharedPreferencesB != null) {
            return sharedPreferencesB.getString("USER_ACCOUNT_TYPE", null);
        }
        HwLog.i("HwUserTokenServiceManager", "sharedPreferences is null");
        return null;
    }

    public final boolean s() {
        if (p0.l()) {
            if (CommonUtils.a(this.f30100a)) {
                return true;
            }
            HwLog.w("HwUserTokenServiceManager", "hasHms() isNewHonor.");
            return false;
        }
        if (!HwWatchFaceApi.getInstance(this.f30100a).isHmsLiteEnable()) {
            return true;
        }
        HwLog.w("HwUserTokenServiceManager", "hasHms() isHmsLiteEnable.");
        return false;
    }

    public boolean t() {
        int i = -1;
        try {
            if (this.m == null) {
                this.m = r();
            }
            String str = this.m;
            i = str != null ? Integer.parseInt(str) : -1;
            HwLog.d("HwUserTokenServiceManager", "mAccountType:" + this.m);
        } catch (NumberFormatException e) {
            HwLog.d("HwUserTokenServiceManager", "isChildAccount NumberFormatException:" + HwLog.printException((Exception) e));
        } catch (Exception e2) {
            HwLog.d("HwUserTokenServiceManager", "isChildAccount Exception:" + HwLog.printException(e2));
        }
        return i == 2;
    }

    public boolean u() {
        int i = -1;
        try {
            if (this.m == null) {
                this.m = r();
            }
            String str = this.m;
            i = str != null ? Integer.parseInt(str) : -1;
            HwLog.d("HwUserTokenServiceManager", "mAccountType:" + this.m);
        } catch (NumberFormatException e) {
            HwLog.d("HwUserTokenServiceManager", "isChildAccount NumberFormatException:" + HwLog.printException((Exception) e));
        } catch (Exception e2) {
            HwLog.d("HwUserTokenServiceManager", "isChildAccount Exception:" + HwLog.printException(e2));
        }
        if (!HwWatchFaceApi.getInstance(this.f30100a).isOversea()) {
            return i == 2;
        }
        HwLog.i("HwUserTokenServiceManager", "isChildAccount is isOversea");
        return i == 2 || i == 1;
    }

    public final boolean v() {
        String userId = HwWatchFaceApi.getInstance(this.f30100a).getUserId();
        if (TextUtils.isEmpty(userId)) {
            return false;
        }
        if (TextUtils.isEmpty(this.f)) {
            return true;
        }
        boolean zEquals = this.f.equals(userId);
        HwLog.i("HwUserTokenServiceManager", "isCurrentUser:" + zEquals);
        return zEquals;
    }

    public boolean w() {
        return this.s;
    }

    public final boolean x() {
        boolean zV = v();
        HwLog.i("HwUserTokenServiceManager", "isRefreshTimeExpired isCurrentUser:" + zV);
        if (zV) {
            return System.currentTimeMillis() > this.l;
        }
        HwLog.i("HwUserTokenServiceManager", "isRefreshTimeExpired isCurrentUser is not valid:");
        return true;
    }

    public boolean y() {
        return this.o;
    }

    public final boolean z() {
        boolean zV = v();
        HwLog.i("HwUserTokenServiceManager", "isUserTokenTimeExpired isCurrentUser:" + zV);
        if (zV) {
            return System.currentTimeMillis() > this.n;
        }
        HwLog.i("HwUserTokenServiceManager", "isUserTokenTimeExpired isCurrentUser is not valid:");
        return true;
    }

    public final List e() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Scope(DensityUtil.getStringById(R.string.ACCOUNT_BASE_PROFILE)));
        arrayList.add(new Scope(DensityUtil.getStringById(R.string.SCOPE_ACCOUNT_COUNTRY)));
        arrayList.add(new Scope(DensityUtil.getStringById(R.string.SCOPE_REALNAME_ANONYMOUS)));
        arrayList.add(new Scope(DensityUtil.getStringById(R.string.SCOPE_AGE_RANGE)));
        arrayList.add(new Scope(DensityUtil.getStringById(R.string.SCOPE_CLOUD_POSITION)));
        arrayList.add(new Scope(DensityUtil.getStringById(R.string.SCOPE_ACCOUNT_GENDER)));
        arrayList.add(new Scope(DensityUtil.getStringById(R.string.SCOPE_ACCOUNT_UPDATEGENDER)));
        arrayList.add(new Scope(DensityUtil.getStringById(R.string.SCOPE_ACCOUNT_BIRTHDAY)));
        arrayList.add(new Scope(DensityUtil.getStringById(R.string.SCOPE_ACCOUNT)));
        arrayList.add(new Scope(DensityUtil.getStringById(R.string.SCOPE_ACCOUNT_LIST)));
        arrayList.add(new Scope(DensityUtil.getStringById(R.string.SCOPE_ACCOUNT_FLAGS)));
        arrayList.add(new Scope(DensityUtil.getStringById(R.string.SCOPE_HEALTHKIT_SPORT)));
        arrayList.add(new Scope(DensityUtil.getStringById(R.string.SCOPE_HEALTHKIT_REALTIMEHEARTRATE)));
        arrayList.add(new Scope(DensityUtil.getStringById(R.string.SCOPE_HEALTHKIT_HEARTRATE)));
        return arrayList;
    }

    public void f(boolean z) {
        this.o = z;
    }

    public final void b(boolean z) {
        try {
            HwLog.i("HwUserTokenServiceManager", "getAccountInfoWithValidToken -- enter" + z);
            e4.a(this.f30100a, true);
            List<Scope> listE = e();
            String strG = g();
            AccountInitParams accountInitParamsBuild = new AccountInitParams.Builder().setApplication(Environment.getApplicationContext()).setMcp(true).setAppIds("10003").setAuthErrorParamList(this.d).setScopes(listE).setAccessToken(this.e).setSubAppId(strG).setDeviceId(HwWatchFaceApi.getInstance(this.f30100a).getDeviceId()).setGrsAppName(Utils.SERVICE_HEALTH_CLOUD).hasHmsCore(s()).build();
            if (accountInitParamsBuild == null) {
                HwLog.i("HwUserTokenServiceManager", "init -- mcpParams can not be null!");
                return;
            }
            this.f30102c.c(accountInitParamsBuild);
            if (z || x() || TextUtils.equals("1", NewSystemParamManager.getSystemParam(SystemParamNames.SYSTEM_PARAM_SUPPORT_WATCHFACE_GET_ACCOUNT_INFO, "1"))) {
                d();
            }
        } catch (Exception e) {
            HwLog.i("HwUserTokenServiceManager", "getAccountInfoWithValidToken Exception：" + HwLog.printException(e));
        }
    }

    public final boolean a(String str, String str2, UserAccountInfo userAccountInfo) {
        HwLog.i("HwUserTokenServiceManager", "isNeedClearSp enter");
        if (userAccountInfo != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            if (TextUtils.equals(str, userAccountInfo.getUserId()) && TextUtils.equals(str2, userAccountInfo.getServiceCountryCode())) {
                return false;
            }
            HwLog.i("HwUserTokenServiceManager", "isNeedClearSp userId or serviceCountryCode is change");
            return true;
        }
        HwLog.i("HwUserTokenServiceManager", "isNeedClearSp accounts or userId or serviceCountryCode is empty");
        return false;
    }

    public void c(boolean z) {
        synchronized (this) {
            HwLog.i("HwUserTokenServiceManager", "init -- enter isLoginBroadcastReceived" + z);
            if (Environment.getApplicationContext() == null) {
                HwLog.e("HwUserTokenServiceManager", "init -- application context can not be null!");
                return;
            }
            if (!z && this.f30102c != null && v()) {
                HwLog.e("HwUserTokenServiceManager", "init -- mCloudAccountManager is already initialized!");
                return;
            }
            oqw oqwVarA = oqw.a();
            this.f30102c = oqwVarA;
            if (oqwVarA == null) {
                HwLog.e("HwUserTokenServiceManager", "init -- cloudAccountManager can not be null!");
                return;
            }
            if (Math.abs(System.currentTimeMillis() - this.q) < 5000) {
                HwLog.e("HwUserTokenServiceManager", "init interval is less 5s");
                return;
            }
            this.q = System.currentTimeMillis();
            if (z) {
                this.e = HwWatchFaceApi.getInstance(this.f30100a).getAccessToken();
                HwWatchFaceApi.getInstance(this.f30100a).refreshAccessToken(new c(z));
            } else if (TextUtils.isEmpty(this.e)) {
                HwLog.i("HwUserTokenServiceManager", "init -- mRefreshAccessToken can not be null");
            } else {
                b(z);
            }
        }
    }

    public void d(boolean z) {
        synchronized (this) {
            String strR = r();
            this.m = strR;
            if (strR == null) {
                c(true);
            } else {
                c(z);
            }
        }
    }

    public final void a(int i) {
        HwLog.d("HwUserTokenServiceManager", "saveChildInfo enter accountType:" + i);
        SharedPreferences sharedPreferencesB = e4.b(Environment.getApplicationContext(), "USER_TOKEN_FILE_PREF");
        if (sharedPreferencesB == null) {
            HwLog.i("HwUserTokenServiceManager", "preferences is null");
        } else {
            sharedPreferencesB.edit().putString("USER_ACCOUNT_TYPE", String.valueOf(i)).apply();
        }
    }

    public final long a(long j) {
        int minutes = (int) TimeUnit.SECONDS.toMinutes(j);
        if (minutes <= 0) {
            return System.currentTimeMillis();
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        calendar.add(12, minutes);
        return calendar.getTimeInMillis();
    }

    public final String a(String str, String str2) {
        HwLog.i("HwUserTokenServiceManager", "getCountryCodeFromSp name:" + str);
        SharedPreferences sharedPreferencesB = e4.b(Environment.getApplicationContext(), "USER_TOKEN_FILE_PREF");
        if (sharedPreferencesB == null) {
            HwLog.i("HwUserTokenServiceManager", "getCountryCodeFromSp sharedPreferences is null");
            return "";
        }
        String string = sharedPreferencesB.getString(str, null);
        if (TextUtils.isEmpty(string)) {
            HwLog.i("HwUserTokenServiceManager", "getCountryCodeFromSp userServicesCountryCode is null");
            return "";
        }
        String[] strArrSplit = string.split("_");
        if (strArrSplit.length < 2) {
            HwLog.i("HwUserTokenServiceManager", "getCountryCodeFromSp userServicesCountryCode length is less 2");
            return "";
        }
        String strA = k5.a(strArrSplit[0], "storagePw");
        String strA2 = k5.a(strArrSplit[1], "storagePw");
        HwLog.i("HwUserTokenServiceManager", "getCountryCodeFromSp servicesCountryCode is:" + strA2);
        if (TextUtils.equals(str2, strA)) {
            return strA2;
        }
        HwLog.i("HwUserTokenServiceManager", "getCountryCodeFromSp userId is not same");
        return "";
    }

    public void b(LinkedHashMap linkedHashMap, boolean z) {
        HwLog.i("HwUserTokenServiceManager", "setXUserTokenToHeader enter:" + TextUtils.isEmpty(this.h));
        if (linkedHashMap == null) {
            return;
        }
        if (z && !TextUtils.isEmpty(this.h) && !z()) {
            linkedHashMap.put("x-usertoken", this.h);
            linkedHashMap.put("x-authtype", "ST");
        } else {
            String accessToken = HwWatchFaceApi.getInstance(this.f30100a).getAccessToken();
            linkedHashMap.put("x-authtype", 2 == HwWatchFaceApi.getInstance(this.f30100a).getAccessTokenType() ? "AT" : "ST");
            linkedHashMap.put("x-usertoken", accessToken);
        }
    }

    public void b() {
        synchronized (this) {
            HwLog.i("HwUserTokenServiceManager", "destroy");
            G();
            v = null;
            u = null;
            this.f30102c = null;
            t = null;
        }
    }

    public final String a(String str) {
        HwLog.i("HwUserTokenServiceManager", "encodeToken -- enter");
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            HwLog.i("HwUserTokenServiceManager", HwLog.printException((Exception) e));
            return str;
        }
    }

    public void a(List list) {
        List list2 = this.d;
        if (list2 == null) {
            return;
        }
        list2.clear();
        try {
            if (!ArrayUtils.isEmpty(list)) {
                HwLog.i("HwUserTokenServiceManager", "updateAuthErrorList authErrorStrList " + list.size());
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    AuthErrorBean authErrorBean = (AuthErrorBean) GsonHelper.fromJson((String) it.next(), AuthErrorBean.class);
                    if (authErrorBean != null) {
                        this.d.add(authErrorBean);
                    }
                }
            }
        } catch (Exception e) {
            HwLog.e("HwUserTokenServiceManager", "updateAuthErrorList Exception:" + HwLog.printException(e));
        }
        if (ArrayUtils.isEmpty(this.d)) {
            HwLog.i("HwUserTokenServiceManager", "updateAuthErrorList authErrorParamList is empty, add default AuthErrorList.");
            a();
        }
        oqw oqwVar = this.f30102c;
        if (oqwVar == null) {
            HwLog.i("HwUserTokenServiceManager", "mCloudAccountManager cannot be null");
        } else {
            oqwVar.e(this.d);
        }
    }

    public final void a() {
        this.d.add(new AuthErrorBean("/servicesupport/market/getResourceByCode.do", "resultCode", OpAnalyticsConstants.WATCH_FAIL_CODE));
        this.d.add(new AuthErrorBean("/servicesupport/theme/tis/service/v2/downloadinfo/queryfree", "resultcode", "-1"));
        this.d.add(new AuthErrorBean("/servicesupport/theme/downloadFeedback.do", "resultcode", "2"));
        this.d.add(new AuthErrorBean("/servicesupport/ugc/service/v1/getBiUserSearchList.do", "resultCode", "90200001"));
        this.d.add(new AuthErrorBean("/servicesupport/ugc/service/v1/getUserinfo.do", "resultcode", "90200001"));
        this.d.add(new AuthErrorBean("/servicesupport/ugc/service/v1/posts/newcreate.do", "resultcode", "90100005"));
        this.d.add(new AuthErrorBean("/servicesupport/ugc/service/v1/posts/newcreate.do", "resultcode", "90200001"));
        this.d.add(new AuthErrorBean("/servicesupport/ugc/service/passThrough.do", "resultcode", "90200001"));
        this.d.add(new AuthErrorBean("/servicesupport/theme/tis/service/v2/commentList/query", "resultcode", "6"));
    }

    public final void a(boolean z) {
        HwLog.i("HwUserTokenServiceManager", "getAccountInfoIfTokenIsValid -- enter" + z);
        if (TextUtils.isEmpty(this.e)) {
            this.e = HwWatchFaceApi.getInstance(this.f30100a).getAccessToken();
        }
        if (TextUtils.isEmpty(this.e)) {
            HwLog.i("HwUserTokenServiceManager", "getAccountInfoIfTokenIsValid -- mRefreshAccessToken can not be empty or null: ");
        } else {
            b(z);
        }
    }

    public void a(StringBuffer stringBuffer) {
        HwLog.i("HwUserTokenServiceManager", "setUserTokenToParameter enter");
        if (stringBuffer == null) {
            return;
        }
        if (!TextUtils.isEmpty(this.h) && !z()) {
            stringBuffer.append("&userToken=").append(a(this.h));
            stringBuffer.append("&authtype=").append("ST");
        } else {
            String strA = a(HwWatchFaceApi.getInstance(this.f30100a).getAccessToken());
            stringBuffer.append("&authtype=").append(2 == HwWatchFaceApi.getInstance(this.f30100a).getAccessTokenType() ? "AT" : "ST");
            stringBuffer.append("&userToken=").append(strA);
        }
    }

    public void a(LinkedHashMap linkedHashMap, boolean z) {
        HwLog.i("HwUserTokenServiceManager", "setUserTokenToHeader enter:" + TextUtils.isEmpty(this.h));
        if (linkedHashMap == null) {
            return;
        }
        if (z && !TextUtils.isEmpty(this.h) && !z()) {
            linkedHashMap.put("usertoken", this.h);
            linkedHashMap.put("authtype", "ST");
        } else {
            String accessToken = HwWatchFaceApi.getInstance(this.f30100a).getAccessToken();
            linkedHashMap.put("authtype", 2 == HwWatchFaceApi.getInstance(this.f30100a).getAccessTokenType() ? "AT" : "ST");
            linkedHashMap.put("usertoken", accessToken);
        }
    }

    public boolean a(HitopRespInfo hitopRespInfo) {
        oqw oqwVar = this.f30102c;
        if (oqwVar == null) {
            HwLog.i("HwUserTokenServiceManager", "refreshIfAuthFail -- cloudAccountManager can not be null!");
            return false;
        }
        return oqwVar.b(v, hitopRespInfo);
    }

    public void a(OperateWatchFaceCallback operateWatchFaceCallback) {
        this.r = operateWatchFaceCallback;
    }
}
