package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.common.scope.AccessScopeReport;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.ecologydevice.networkclient.HealthEngineRequestManager;
import com.huawei.hihealthservice.hihealthkit.util.AccountLog;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.HealthAccessTokenUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.login.ui.login.util.SharedPreferenceUtil;
import com.huawei.openalliance.ad.constant.VastAttribute;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.KeyValDbManager;
import health.compact.a.LogAnonymous;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class ldi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private JSONObject f39954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f39955b;
    private int j = 0;
    private String d = "";
    private int h = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, ldc> f39956c = new HashMap();
    private String f = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1015);
    private String e = GRSManager.c(BaseApplication.getContext()).getNoCheckUrl(HealthEngineRequestManager.GRS_KEY, "com.huawei.health" + lcz.f39935a, "");

    public ldi() {
        HMSLog.setExtLogger(new AccountLog(BaseApplication.getContext()), true);
        LogUtil.a("HMSAuth_HmsJsAuthUtil", "enter HmsJsAuthUtil");
    }

    private void c() {
        while (TextUtils.isEmpty(this.e)) {
            LogUtil.a("R_HiH_HMSAuth_HmsJsAuthUtil", "retry to get domain " + this.h + " times");
            int i = this.h + 1;
            this.h = i;
            if (i == 2) {
                this.h = 0;
                return;
            }
            this.e = GRSManager.c(BaseApplication.getContext()).getNoCheckUrl(HealthEngineRequestManager.GRS_KEY, "com.huawei.health" + lcz.f39935a, "");
        }
        this.h = 0;
    }

    private int e(String str) {
        final String str2;
        this.d = "";
        final String strTrim = str.trim();
        this.e = GRSManager.c(BaseApplication.getContext()).getNoCheckUrl(HealthEngineRequestManager.GRS_KEY, "com.huawei.health" + lcz.f39935a, "");
        c();
        LogUtil.a("R_HiH_HMSAuth_HmsJsAuthUtil", "mDomain = " + this.e);
        if (TextUtils.isEmpty(this.e)) {
            LogUtil.a("R_HiH_HMSAuth_HmsJsAuthUtil", "domain is empty");
            return 0;
        }
        if (this.e.startsWith("https://")) {
            str2 = this.e + "/healthkit/v1/thirdAuthInfo";
        } else {
            str2 = "https://" + this.e + "/healthkit/v1/thirdAuthInfo";
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        long jCurrentTimeMillis = System.currentTimeMillis();
        ThreadPoolManager.c().execute(new Runnable() { // from class: lde
            @Override // java.lang.Runnable
            public final void run() {
                this.f39945a.e(str2, strTrim, countDownLatch);
            }
        });
        try {
            countDownLatch.await(20000L, TimeUnit.MILLISECONDS);
            if (TextUtils.isEmpty(this.d)) {
                LogUtil.a("R_HiH_HMSAuth_HmsJsAuthUtil", "mHttpResult is null");
                return 0;
            }
            ReleaseLogUtil.d("R_HiH_HMSAuth_HmsJsAuthUtil", "get http needs ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis), " ms");
            return 1;
        } catch (InterruptedException e) {
            ReleaseLogUtil.a("R_HiH_HMSAuth_HmsJsAuthUtil", "InterruptedException", LogAnonymous.b(e));
            return 0;
        }
    }

    /* synthetic */ void e(String str, String str2, CountDownLatch countDownLatch) {
        ReleaseLogUtil.d("R_HiH_HMSAuth_HmsJsAuthUtil", "getHttpsReq strUrl getReq start.");
        String strD = ldl.d(str, this.f, str2);
        this.d = strD;
        if (b(strD)) {
            this.d = ldl.d(str, this.f, str2);
        }
        LogUtil.a("HMSAuth_HmsJsAuthUtil", "mHttpResult:", this.d);
        countDownLatch.countDown();
    }

    private boolean b(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has(VastAttribute.ERROR)) {
                    ReleaseLogUtil.d("R_HiH_HMSAuth_HmsJsAuthUtil", "UserAt code = ", jSONObject.getString(VastAttribute.ERROR));
                    if ("401".equals(jSONObject.getString(VastAttribute.ERROR))) {
                        this.f = HealthAccessTokenUtil.getAtInstance().refreshAccessToken();
                        return true;
                    }
                }
            } catch (JSONException e) {
                ReleaseLogUtil.a("R_HiH_HMSAuth_HmsJsAuthUtil", "http response jsonObject == null", LogAnonymous.b(e));
            }
        }
        return false;
    }

    private ldc d(String str) {
        if (this.f39956c.containsKey(str)) {
            ldc ldcVar = this.f39956c.get(str);
            if (!ldcVar.e()) {
                LogUtil.a("R_HiH_HMSAuth_HmsJsAuthUtil", "get AuthInfo from cache");
                return ldcVar;
            }
            this.f39956c.remove(str);
            LogUtil.a("R_HiH_HMSAuth_HmsJsAuthUtil", "AuthInfo is expired, and get AuthInfo from network");
        }
        if (e(str) != 1) {
            LogUtil.e("R_HiH_HMSAuth_HmsJsAuthUtil", "GetHttpRes code is not 200");
            return null;
        }
        ReleaseLogUtil.d("HMSAuth_HmsJsAuthUtil", "getAtAuthInfo after getReq");
        if (TextUtils.isEmpty(this.d)) {
            LogUtil.e("R_HiH_HMSAuth_HmsJsAuthUtil", "mHttpResult is empty");
            return null;
        }
        return a(str);
    }

    private void e(String str, String str2) {
        String strC = KeyValDbManager.d(BaseApplication.getContext()).c("AT_SCOPE_DEAL");
        AccessScopeReport.reportErrorScope(this.f, str, str2);
        if (!TextUtils.isEmpty(strC) && "1".equals(strC)) {
            LogUtil.a("R_HiH_HMSAuth_HmsJsAuthUtil", "come to download hmscore");
            KeyValDbManager.d(BaseApplication.getContext()).b("AT_SCOPE_DEAL", "2");
        } else if (TextUtils.isEmpty(strC) || "0".equals(strC)) {
            LogUtil.a("R_HiH_HMSAuth_HmsJsAuthUtil", "come to refresh rt");
            KeyValDbManager.d(BaseApplication.getContext()).b("AT_SCOPE_DEAL", "1");
        } else {
            LogUtil.a("R_HiH_HMSAuth_HmsJsAuthUtil", "already download hms core");
        }
    }

    private ldc a(String str) {
        ldc ldcVar = new ldc();
        try {
            JSONObject jSONObject = new JSONObject(this.d);
            this.f39954a = jSONObject;
            if (jSONObject.has(VastAttribute.ERROR)) {
                e(this.f39954a);
                return null;
            }
            KeyValDbManager.d(BaseApplication.getContext()).b("AT_SCOPE_DEAL", "0");
            ldcVar.c(this.f39954a.getString("clientId"));
            ldcVar.e(this.f39954a.getLong("expirIn"));
            ldcVar.b(this.f39954a.getString("uid"));
            ReleaseLogUtil.d("R_HiH_HMSAuth_HmsJsAuthUtil", "constructAuthInfo uid=", SharedPreferenceUtil.getInstance(BaseApplication.getContext()).maskValue(this.f39954a.getString("uid")));
            String string = this.f39954a.getString("scope");
            if (TextUtils.isEmpty(string)) {
                LogUtil.e("R_HiH_HMSAuth_HmsJsAuthUtil", "scopeResult is empty");
                return null;
            }
            String[] strArrSplit = string.split(" ");
            ArrayList arrayList = new ArrayList(strArrSplit.length);
            for (String str2 : strArrSplit) {
                if (!"openid".equals(str2) && !"profile".equals(str2) && !"https://www.huawei.com/auth/account/base.profile".equals(str2)) {
                    arrayList.add(str2);
                }
            }
            ldcVar.b(arrayList);
            ReleaseLogUtil.d("R_HiH_HMSAuth_HmsJsAuthUtil", "constructAuthInfo set mAuthInfoCache");
            this.f39956c.put(str, ldcVar);
            return ldcVar;
        } catch (JSONException e) {
            ReleaseLogUtil.a("R_HiH_HMSAuth_HmsJsAuthUtil", "http response jsonObject == null", LogAnonymous.b(e));
            return null;
        }
    }

    private void e(JSONObject jSONObject) throws JSONException {
        LogUtil.e("R_HiH_HMSAuth_HmsJsAuthUtil", "http response contain error," + jSONObject.toString());
        if (("104111665".equals(this.f39955b) || "105449157".equals(this.f39955b) || "105449193".equals(this.f39955b)) && "403".equals(jSONObject.getString(VastAttribute.ERROR)) && CommonUtil.z(BaseApplication.getContext())) {
            LogUtil.e("R_HiH_HMSAuth_HmsJsAuthUtil", "maybe At scope is satisfied");
            e(this.f39955b, jSONObject.getString(VastAttribute.ERROR));
        }
        String strC = KeyValDbManager.d(BaseApplication.getContext()).c("AT_SCOPE_DEAL");
        LogUtil.a("R_HiH_HMSAuth_HmsJsAuthUtil", "flag is " + strC);
        if (("104111665".equals(this.f39955b) || "105449157".equals(this.f39955b) || "105449193".equals(this.f39955b)) && !TextUtils.isEmpty(strC) && "2".equals(strC) && !CommonUtil.z(BaseApplication.getContext())) {
            LogUtil.a("R_HiH_HMSAuth_HmsJsAuthUtil", "when download hms core, error occurs, set normal flag");
            KeyValDbManager.d(BaseApplication.getContext()).b("AT_SCOPE_DEAL", "0");
        }
    }

    public int a(String str, String str2, int i, boolean z, Context context) {
        ReleaseLogUtil.d("R_HiH_HMSAuth_HmsJsAuthUtil", "go to check hms Permission");
        this.f39955b = str2;
        this.f = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1015);
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            ReleaseLogUtil.a("R_HiH_HMSAuth_HmsJsAuthUtil", "accessToken is empty or appid is empty");
            return 1001;
        }
        lev levVarE = lev.e(context);
        String strC = z ? levVarE.c(i) : levVarE.a(i);
        if (ldm.a(i, z) && TextUtils.isEmpty(strC)) {
            ReleaseLogUtil.a("R_HiH_HMSAuth_HmsJsAuthUtil", "datatype is empty or scope == null");
            return 1001;
        }
        if (TextUtils.isEmpty(this.f)) {
            ReleaseLogUtil.d("R_HiH_HMSAuth_HmsJsAuthUtil", "userAt is null,try to refresh at");
            while (TextUtils.isEmpty(this.f)) {
                if (this.j <= 2) {
                    LogUtil.a("HMSAuth_HmsJsAuthUtil", "second getUserAt");
                    this.j++;
                    this.f = HealthAccessTokenUtil.getAtInstance().refreshAccessToken();
                } else {
                    this.j = 0;
                    ReleaseLogUtil.d("R_HiH_HMSAuth_HmsJsAuthUtil", "after retry max times, still cannot get userAT");
                    return 1020;
                }
            }
        }
        if (e(str, str2, i, z, strC)) {
            return 0;
        }
        String strC2 = KeyValDbManager.d(BaseApplication.getContext()).c("AT_SCOPE_DEAL");
        if (TextUtils.isEmpty(strC2) || !"1".equals(strC2)) {
            return 1001;
        }
        LogUtil.a("R_HiH_HMSAuth_HmsJsAuthUtil", "refreshRT next");
        return 1020;
    }

    private boolean c(List<String> list, long j, String str, String str2, String str3) {
        if (list == null || list.size() == 0) {
            LogUtil.e("R_HiH_HMSAuth_HmsJsAuthUtil", "scopes is empty");
            return false;
        }
        if (j == 0) {
            LogUtil.e("R_HiH_HMSAuth_HmsJsAuthUtil", "expiredTime == 0");
            return false;
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            LogUtil.e("R_HiH_HMSAuth_HmsJsAuthUtil", "uid is empty or hwUid is empty");
            return false;
        }
        if (!str.equals(str2)) {
            LogUtil.e("R_HiH_HMSAuth_HmsJsAuthUtil", "uid != huid ");
            LogUtil.a("HMSAuth_HmsJsAuthUtil", str, "<=>", str2);
            return false;
        }
        if (!TextUtils.isEmpty(str3)) {
            return true;
        }
        LogUtil.e("R_HiH_HMSAuth_HmsJsAuthUtil", "clientId == null");
        return false;
    }

    private boolean e(String str, String str2, int i, boolean z, String str3) {
        ldc ldcVarD = d(str);
        if (ldcVarD == null) {
            ReleaseLogUtil.a("R_HiH_HMSAuth_HmsJsAuthUtil", "atAuthInfo == null");
            return false;
        }
        long jB = ldcVarD.b();
        String strA = ldcVarD.a();
        String strD = ldcVarD.d();
        List<String> listC = ldcVarD.c();
        if (!c(listC, jB, strA, LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011), strD)) {
            ReleaseLogUtil.a("R_HiH_HMSAuth_HmsJsAuthUtil", "detailItems didn't pass");
            return false;
        }
        if (!strD.equals(str2)) {
            ReleaseLogUtil.a("R_HiH_HMSAuth_HmsJsAuthUtil", "appid is not equals clientId:");
            return false;
        }
        LogUtil.a("HMSAuth_HmsJsAuthUtil", "expiredTime:", Long.valueOf(jB), " scopes:", listC);
        List<String> listB = ldm.b(i, z);
        String str4 = listB.get(0);
        String str5 = listB.get(1);
        String str6 = listB.get(2);
        String str7 = listB.get(3);
        boolean z2 = (!TextUtils.isEmpty(str5) && listC.contains(str5)) || (!TextUtils.isEmpty(str6) && listC.contains(str6));
        boolean zContains = listC.contains(str4);
        boolean zContains2 = listC.contains(str7);
        boolean zContains3 = listC.contains(str3);
        ReleaseLogUtil.d("HMSAuth_HmsJsAuthUtil", "isAtomicScopePassed:", Boolean.valueOf(z2), " isHmsScopePassed:", Boolean.valueOf(zContains), " isExtendScopePassed:", Boolean.valueOf(zContains2), " isLocalScopePassed:", Boolean.valueOf(zContains3));
        if (zContains || zContains3 || zContains2 || z2) {
            ReleaseLogUtil.d("R_HiH_HMSAuth_HmsJsAuthUtil", "check permission success");
            return true;
        }
        ReleaseLogUtil.a("R_HiH_HMSAuth_HmsJsAuthUtil", "verify scope failed");
        return false;
    }
}
