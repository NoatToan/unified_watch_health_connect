package com.huawei.hms.support.hwid.service;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.braintreepayments.api.PaymentMethod;
import com.huawei.hmf.tasks.Task;
import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hms.api.Api;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.common.internal.AnyClient;
import com.huawei.hms.common.internal.TaskApiCall;
import com.huawei.hms.common.internal.constant.AuthInternalPickerConstant;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.entity.account.AccountNaming;
import com.huawei.hms.support.api.entity.common.CommonNaming;
import com.huawei.hms.support.hwid.bean.AckQrLoginReq;
import com.huawei.hms.support.hwid.bean.CheckPasswordByUserIdReq;
import com.huawei.hms.support.hwid.bean.GetRealNameInfoReq;
import com.huawei.hms.support.hwid.bean.LoginInfoReq;
import com.huawei.hms.support.hwid.bean.SignInByQrReq;
import com.huawei.hms.support.hwid.bean.StartQrAuthReq;
import com.huawei.hms.support.hwid.bean.StartQrLoginReq;
import com.huawei.hms.support.hwid.c.c;
import com.huawei.hms.support.hwid.c.d;
import com.huawei.hms.support.hwid.c.f;
import com.huawei.hms.support.hwid.c.g;
import com.huawei.hms.support.hwid.c.h;
import com.huawei.hms.support.hwid.c.i;
import com.huawei.hms.support.hwid.c.j;
import com.huawei.hms.support.hwid.c.k;
import com.huawei.hms.support.hwid.c.l;
import com.huawei.hms.support.hwid.c.m;
import com.huawei.hms.support.hwid.c.n;
import com.huawei.hms.support.hwid.common.cloudservice.CloudRequestHandler;
import com.huawei.hms.support.hwid.common.constants.CommonConstant;
import com.huawei.hms.support.hwid.common.e.e;
import com.huawei.hms.support.hwid.result.SignInQrInfo;
import com.huawei.openalliance.ad.constant.ParamConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class b implements HuaweiIdAdvancedService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<String, Integer> f16657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f16658b;

    static {
        HashMap map = new HashMap();
        f16657a = map;
        map.put(CommonNaming.queryRealNameInfo, 40004300);
        map.put(CommonNaming.queryAccountInfo, 50200300);
        map.put(CommonNaming.signInByQrCode, 60100300);
        map.put(CommonNaming.startQrLogin, 60100300);
        map.put("hwid.queryAccountChanged", 50001300);
        map.put("hwid.getDeviceInfo", 50001300);
        map.put("hwid.queryRealNameInfoNppa", 50200300);
        map.put("hwid.checkPasswordByUserId", 50300300);
        map.put("hwid.registerFilterForLogin", 60100300);
        map.put("hwid.startQrAuth", 60100300);
        map.put("hwid.getVerifyTokenByQrcode", 60600300);
        map.put("hwid.login", 60700300);
    }

    public b(Context context) {
        this.f16658b = context;
    }

    @Override // com.huawei.hms.support.hwid.service.HuaweiIdAdvancedService
    public Task<String> getAccountInfo(List<String> list) {
        return a(list);
    }

    @Override // com.huawei.hms.support.hwid.service.HuaweiIdAdvancedService
    public Task<String> getRealNameInfo() {
        return a();
    }

    @Override // com.huawei.hms.support.hwid.service.HuaweiIdAdvancedService
    public Task<String> getRealNameInfo(GetRealNameInfoReq getRealNameInfoReq) {
        if (getRealNameInfoReq == null || getRealNameInfoReq.getRequestChannelInfo() == null || getRealNameInfoReq.getRequestChannelExtraInfo() == null) {
            e.a("HuaweiIdAdvanceServiceImpl", "Parameter getRealNameInfoReq, requestChannelInfo or requestChannelExtraInfo is null.");
            return a("Parameter getRealNameInfoReq, requestChannelInfo or requestChannelExtraInfo is null.", 2005);
        }
        e.a("HuaweiIdAdvanceServiceImpl", "getRealNameInfoForNppa with realNameReqInfo.");
        return a(getRealNameInfoReq);
    }

    private Task<String> a(List<String> list) {
        e.a("HuaweiIdAdvanceServiceImpl", "accountInfoRequest entry.");
        if (this.f16658b == null) {
            e.b("HuaweiIdAdvanceServiceImpl", "activity or context is null.");
            return a("activity or context is null.", 2005);
        }
        List<String> listB = b(list);
        if (listB == null || listB.isEmpty()) {
            e.b("HuaweiIdAdvanceServiceImpl", "requestScopes is empty or null.");
            return a("{}");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("accountInfoTransId", "");
            jSONObject.put("scopes", c(listB));
            return a((TaskApiCall) new c(CommonNaming.queryAccountInfo, jSONObject.toString(), ""));
        } catch (JSONException unused) {
            e.b("HuaweiIdAdvanceServiceImpl", "JSONException.");
            return a("build json error", 2005);
        }
    }

    private Task a(GetRealNameInfoReq getRealNameInfoReq) {
        String getRealNameInfoReqJsonString = "";
        e.a("HuaweiIdAdvanceServiceImpl", "realNameInfoRequestForNppa entry.");
        if (this.f16658b == null) {
            e.b("HuaweiIdAdvanceServiceImpl", "activity or context is null.");
            return a("activity or context is null.", 2005);
        }
        if (getRealNameInfoReq == null) {
            e.b("HuaweiIdAdvanceServiceImpl", "getRealNameInfoReq is null.");
            return a("getRealNameInfoReq getRealNameInfoReq is null.", 2005);
        }
        try {
            getRealNameInfoReq.setTransId("");
            if (getRealNameInfoReq.getGetRealNameInfoReqJsonString() != null) {
                getRealNameInfoReqJsonString = getRealNameInfoReq.getGetRealNameInfoReqJsonString();
            }
            return a((TaskApiCall) new h("hwid.queryRealNameInfoNppa", getRealNameInfoReqJsonString, 50200300));
        } catch (JSONException unused) {
            e.b("HuaweiIdAdvanceServiceImpl", "JSONException.");
            return a("build json error", 2005);
        }
    }

    private Task a() {
        e.a("HuaweiIdAdvanceServiceImpl", "realNameInfoRequest entry.");
        if (this.f16658b == null) {
            e.b("HuaweiIdAdvanceServiceImpl", "activity or context is null.");
            return a("activity or context is null.", 2005);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(CommonConstant.REALNAMEREQUEST.REQUEST_TRANS_ID, "");
            return a((TaskApiCall) new i(CommonNaming.queryRealNameInfo, jSONObject.toString(), 40004300));
        } catch (JSONException unused) {
            e.b("HuaweiIdAdvanceServiceImpl", "JSONException.");
            return a("build json error", 2005);
        }
    }

    private <TResult, TClient extends AnyClient> Task<TResult> a(TaskApiCall<TClient, TResult> taskApiCall) {
        e.a("HuaweiIdAdvanceServiceImpl", "innerRequest by taskApiCall entry.");
        try {
            return a(this.f16658b, new Api.ApiOptions.NoOptions(), new Api(HuaweiApiAvailability.HMS_API_NAME_ID), new com.huawei.hms.support.hwid.a.b(), "").doWrite(taskApiCall);
        } catch (com.huawei.hms.support.hwid.b.a e) {
            e.b("HuaweiIdAdvanceServiceImpl", "InvalidVersionException.");
            return a(e.a().getErrorString(), e.a().getStatusCode());
        }
    }

    private List<String> b(List<String> list) {
        if (list == null) {
            e.b("HuaweiIdAdvanceServiceImpl", "scopes is null.");
            return null;
        }
        HashSet hashSet = new HashSet();
        for (String str : list) {
            if (str == null) {
                e.b("HuaweiIdAdvanceServiceImpl", "null scope.");
            } else {
                String strTrim = str.trim();
                if (!"https://www.huawei.com/auth/account/mobile.number".equals(strTrim) && !"https://www.huawei.com/auth/account/mobile.flag".equals(strTrim) && !CommonConstant.SCOPE.SCOPE_LOGIN_ACCOUNT.equals(strTrim) && !"https://www.huawei.com/auth/account/base.profile".equals(strTrim)) {
                    e.b("HuaweiIdAdvanceServiceImpl", "invalid scope.");
                } else {
                    hashSet.add(strTrim);
                }
            }
        }
        return new ArrayList(hashSet);
    }

    private String c(List<String> list) {
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < list.size(); i++) {
            jSONArray.put(list.get(i));
        }
        return jSONArray.toString();
    }

    private <TResult> Task<TResult> a(String str, int i) {
        e.a("HuaweiIdAdvanceServiceImpl", str);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        taskCompletionSource.setException(new ApiException(new Status(i, str)));
        return taskCompletionSource.getTask();
    }

    private <TResult> Task<TResult> a(TResult tresult) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        taskCompletionSource.setResult(tresult);
        return taskCompletionSource.getTask();
    }

    private boolean a(Context context) {
        boolean z = context instanceof Activity;
        e.a("HuaweiIdAdvanceServiceImpl", "check context result:" + z);
        return z;
    }

    private <TOption extends Api.ApiOptions> HuaweiApi a(Context context, TOption toption, Api<TOption> api, AbstractClientBuilder abstractClientBuilder, String str) throws com.huawei.hms.support.hwid.b.a {
        if (a(context)) {
            e.a("HuaweiIdAdvanceServiceImpl", "entry initService activity.");
            return new HuaweiApi((Activity) context, (Api) api, (Api.ApiOptions) toption, abstractClientBuilder, AuthInternalPickerConstant.HMS_SDK_VERSION);
        }
        e.a("HuaweiIdAdvanceServiceImpl", "entry initService context.");
        return new HuaweiApi(context, api, toption, abstractClientBuilder, AuthInternalPickerConstant.HMS_SDK_VERSION);
    }

    @Override // com.huawei.hms.support.hwid.service.HuaweiIdAdvancedService
    public Task<SignInQrInfo> startQrLogin(StartQrLoginReq startQrLoginReq) {
        e.a("HuaweiIdAdvanceServiceImpl", "startQrLogin");
        if (this.f16658b == null) {
            e.b("HuaweiIdAdvanceServiceImpl", "activity or context is null.");
            return a("activity or context is null.", 2005);
        }
        try {
            JSONObject json = startQrLoginReq.toJson();
            json.put("transId", "");
            m mVar = new m(CommonNaming.startQrLogin, json.toString(), "");
            mVar.a(CommonConstant.StartQrLoginQrValue.QRSCENE_RECHECK_USER.equals(startQrLoginReq.getQrScene()));
            return a((TaskApiCall) mVar);
        } catch (JSONException unused) {
            e.b("HuaweiIdAdvanceServiceImpl", "startQrLogin JSONException");
            return a("build json error", 2005);
        }
    }

    @Override // com.huawei.hms.support.hwid.service.HuaweiIdAdvancedService
    public Task<Void> signInByQrCode(SignInByQrReq signInByQrReq) {
        e.a("HuaweiIdAdvanceServiceImpl", "signInByQrCode");
        if (this.f16658b == null) {
            e.b("HuaweiIdAdvanceServiceImpl", "activity or context is null.");
            return a("activity or context is null.", 2005);
        }
        try {
            JSONObject json = signInByQrReq.toJson();
            json.put("transId", "");
            return a((TaskApiCall) new k(CommonNaming.signInByQrCode, json.toString(), ""));
        } catch (JSONException unused) {
            e.b("HuaweiIdAdvanceServiceImpl", "2015JSONException");
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            taskCompletionSource.setException(new ApiException(new Status(2015)));
            return taskCompletionSource.getTask();
        }
    }

    @Override // com.huawei.hms.support.hwid.service.HuaweiIdAdvancedService
    public Task<String> hasAccountChanged(String str, String str2) {
        e.a("HuaweiIdAdvanceServiceImpl", "queryAccountChanged");
        if (this.f16658b == null) {
            e.b("HuaweiIdAdvanceServiceImpl", "queryAccountChanged activity or context is null.");
            return a("activity or context is null.", 2005);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("openId", str);
            jSONObject.put("uid", str2);
            jSONObject.put("transId", "");
            return a((TaskApiCall) new g("hwid.queryAccountChanged", jSONObject.toString(), ""));
        } catch (JSONException unused) {
            e.b("HuaweiIdAdvanceServiceImpl", "queryAccountChanged JSONException");
            return a("build json error", 2005);
        }
    }

    @Override // com.huawei.hms.support.hwid.service.HuaweiIdAdvancedService
    public Task<String> getDeviceInfo() {
        e.a("HuaweiIdAdvanceServiceImpl", "getDeviceInfo");
        if (this.f16658b == null) {
            e.b("HuaweiIdAdvanceServiceImpl", "getDeviceInfo activity or context is null.");
            return a("activity or context is null.", 2005);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("transId", "");
            return a((TaskApiCall) new d("hwid.getDeviceInfo", jSONObject.toString(), ""));
        } catch (JSONException unused) {
            e.b("HuaweiIdAdvanceServiceImpl", "getDeviceInfo JSONException");
            return a("build json error", 2005);
        }
    }

    @Override // com.huawei.hms.support.hwid.service.HuaweiIdAdvancedService
    public Task<Void> logout() {
        e.a("HuaweiIdAdvanceServiceImpl", "logout");
        if (this.f16658b == null) {
            e.b("HuaweiIdAdvanceServiceImpl", "logout activity or context is null.");
            return a("activity or context is null.", 2005);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("transId", "");
            return a((TaskApiCall) new com.huawei.hms.support.hwid.c.e(AccountNaming.logout, jSONObject.toString(), ""));
        } catch (JSONException unused) {
            e.b("HuaweiIdAdvanceServiceImpl", "logout JSONException");
            return a("build json error", 2005);
        }
    }

    @Override // com.huawei.hms.support.hwid.service.HuaweiIdAdvancedService
    public Task<Void> login(LoginInfoReq loginInfoReq) {
        boolean zAwait;
        e.a("HuaweiIdAdvanceServiceImpl", "login entry.", true);
        Context context = this.f16658b;
        if (context == null || loginInfoReq == null) {
            e.b("HuaweiIdAdvanceServiceImpl", "activity or context is null.");
            return a("activity or context is null.", 2005);
        }
        String strA = com.huawei.hms.support.hwid.common.d.a.a(context).a("public-key", "");
        if (!TextUtils.isEmpty(strA)) {
            e.a("HuaweiIdAdvanceServiceImpl", "sp is useable");
            com.huawei.hms.support.hwid.common.e.c.a().a(this.f16658b, "", loginInfoReq.getPackageName());
        } else {
            e.a("HuaweiIdAdvanceServiceImpl", "sp is unuseable" + System.currentTimeMillis());
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            com.huawei.hms.support.hwid.common.e.c.a().a(this.f16658b, "", loginInfoReq.getPackageName(), new com.huawei.hms.support.hwid.result.c<com.huawei.hms.support.hwid.result.a>() { // from class: com.huawei.hms.support.hwid.service.b.1
                @Override // com.huawei.hms.support.hwid.result.c
                public void a(com.huawei.hms.support.hwid.result.a aVar) {
                    if (aVar.a().a() == 0) {
                        e.a("HuaweiIdAdvanceServiceImpl", "get publicKey success " + System.currentTimeMillis(), true);
                    } else {
                        e.a("HuaweiIdAdvanceServiceImpl", "get publicKey fail " + System.currentTimeMillis(), true);
                    }
                    countDownLatch.countDown();
                }
            });
            try {
                zAwait = countDownLatch.await(10L, TimeUnit.SECONDS);
            } catch (InterruptedException unused) {
                e.c("HuaweiIdAdvanceServiceImpl", "checkPermission InterruptedException.", true);
                zAwait = false;
            }
            e.b("HuaweiIdAdvanceServiceImpl", "getDomainNameAndPublicKey awaitValue:" + zAwait, true);
            if (!zAwait) {
                return a("get publicKey fail", 2015);
            }
            strA = com.huawei.hms.support.hwid.common.d.a.a(this.f16658b).a("public-key", "");
        }
        loginInfoReq.setPassword(com.huawei.hms.support.hwid.common.b.b.a(loginInfoReq.getPassword(), strA));
        new JSONObject();
        try {
            JSONObject json = loginInfoReq.toJson();
            json.put("transId", "");
            return a((TaskApiCall) new f("hwid.login", json.toString(), ""));
        } catch (JSONException unused2) {
            e.b("HuaweiIdAdvanceServiceImpl", "2015 JSONException");
            return a("build json error", 2015);
        }
    }

    @Override // com.huawei.hms.support.hwid.service.HuaweiIdAdvancedService
    public void checkPasswordByUserId(Context context, CheckPasswordByUserIdReq checkPasswordByUserIdReq, CloudRequestHandler cloudRequestHandler) {
        e.a("HuaweiIdAdvanceServiceImpl", "begin checkPasswordByUserId");
        com.huawei.hms.support.hwid.common.a.a().a(context);
        a.a(context, checkPasswordByUserIdReq, cloudRequestHandler);
    }

    @Override // com.huawei.hms.support.hwid.service.HuaweiIdAdvancedService
    public Task<String> registerFilterForLogin(String str, HashMap<String, String> map, List<String> list, int i, String str2) {
        e.a("HuaweiIdAdvanceServiceImpl", "registerFilterFourLogin entry.");
        if (this.f16658b == null) {
            e.b("HuaweiIdAdvanceServiceImpl", "activity or context is null.");
            return a("activity or context is null.", 2005);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject(map);
            jSONObject.put("appID", str);
            jSONObject.put(PaymentMethod.OPTIONS_KEY, jSONObject2);
            jSONObject.put("callbackParams", d(list));
            jSONObject.put("callbackType", i);
            jSONObject.put(ParamConstants.Param.CALLBACK, str2);
            jSONObject.put("transId", "");
            jSONObject.put("packageName", this.f16658b.getPackageName());
            return a((TaskApiCall) new j("hwid.registerFilterForLogin", jSONObject.toString(), ""));
        } catch (JSONException unused) {
            e.b("HuaweiIdAdvanceServiceImpl", "JSONException.");
            return a("build json error", 2005);
        }
    }

    private JSONArray d(List<String> list) {
        if (list == null || list.size() == 0) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < list.size(); i++) {
            jSONArray.put(list.get(i));
        }
        return jSONArray;
    }

    @Override // com.huawei.hms.support.hwid.service.HuaweiIdAdvancedService
    public Task<String> startQrAuth(StartQrAuthReq startQrAuthReq) {
        e.a("HuaweiIdAdvanceServiceImpl", "enter startQrAuth");
        if (this.f16658b == null || startQrAuthReq == null) {
            e.b("HuaweiIdAdvanceServiceImpl", "startQrAuth context is null.");
            return a("activity or context is null.", 2005);
        }
        try {
            JSONObject json = startQrAuthReq.toJson();
            json.put("transId", "");
            return a((TaskApiCall) new l("hwid.startQrAuth", json.toString(), ""));
        } catch (JSONException unused) {
            e.b("HuaweiIdAdvanceServiceImpl", "startQrAuth JSONException");
            return a("build json error", 2005);
        }
    }

    @Override // com.huawei.hms.support.hwid.service.HuaweiIdAdvancedService
    public Task<String> ackQrLogin(AckQrLoginReq ackQrLoginReq) {
        e.a("HuaweiIdAdvanceServiceImpl", "enter ackQrLogin");
        if (this.f16658b == null || ackQrLoginReq == null) {
            e.b("HuaweiIdAdvanceServiceImpl", "context or ackQrLoginReq is null.");
            return a("context or sessionId is null.", 2005);
        }
        try {
            JSONObject json = ackQrLoginReq.toJson();
            json.put("transId", "");
            return a((TaskApiCall) new com.huawei.hms.support.hwid.c.a("hwid.ackQrLogin", json.toString(), ""));
        } catch (JSONException unused) {
            e.b("HuaweiIdAdvanceServiceImpl", "2015JSONException");
            new TaskCompletionSource().setException(new ApiException(new Status(2015)));
            return a("build json error", 2005);
        }
    }

    @Override // com.huawei.hms.support.hwid.service.HuaweiIdAdvancedService
    public Task<String> getVerifyTokenByQrcode(String str) {
        e.a("HuaweiIdAdvanceServiceImpl", "getVerifyTokenByQrcode, sessionId is null ? " + TextUtils.isEmpty(str));
        if (this.f16658b == null) {
            e.b("HuaweiIdAdvanceServiceImpl", "activity or context is null.");
            return a("activity or context is null.", 2005);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sessionId", str);
            return a((TaskApiCall) new n("hwid.getVerifyTokenByQrcode", jSONObject.toString(), ""));
        } catch (JSONException unused) {
            e.b("HuaweiIdAdvanceServiceImpl", "2015JSONException");
            new TaskCompletionSource().setException(new ApiException(new Status(2015)));
            return a("build json error", 2005);
        }
    }
}
