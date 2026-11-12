package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.huawei.health.ecologydevice.networkclient.HealthEngineRequestManager;
import com.huawei.hihealthservice.util.HttpRequestApi;
import com.huawei.hms.framework.network.restclient.Response;
import com.huawei.hms.framework.network.restclient.ResultCallback;
import com.huawei.hms.framework.network.restclient.Submit;
import com.huawei.hms.framework.network.restclient.hwhttp.MediaType;
import com.huawei.hms.framework.network.restclient.hwhttp.RequestBody;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.HealthAccessTokenUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.profile.coordinator.ProfileRequestConstants;
import health.compact.a.GRSManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes10.dex */
public class lcy {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f39930b = GRSManager.c(BaseApplication.getContext()).getNoCheckUrl(HealthEngineRequestManager.GRS_KEY, "com.huawei.health" + lcz.f39935a, "");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Handler f39931a;
    private int d;
    private ConcurrentHashMap<Object, Submit<String>> e;

    private lcy() {
        this.e = new ConcurrentHashMap<>();
        this.f39931a = new Handler(Looper.getMainLooper());
    }

    public static lcy d() {
        return c.e;
    }

    public <T> void b(Object obj, lcx<T> lcxVar) {
        if (lcxVar == null) {
            return;
        }
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1015);
        if (TextUtils.isEmpty(accountInfo)) {
            ReleaseLogUtil.e("HiH_HealthKitRequestManager", "Get AT from cache is empty, refresh at");
            while (TextUtils.isEmpty(accountInfo)) {
                int i = this.d;
                if (i <= 2) {
                    int i2 = i + 1;
                    this.d = i2;
                    LogUtil.a("HealthKitRequestManager", "Refresh AT again ", Integer.valueOf(i2));
                    accountInfo = HealthAccessTokenUtil.getAtInstance().refreshAccessToken();
                } else {
                    this.d = 0;
                    c(lcxVar, -1, new Exception("get at err"));
                    ReleaseLogUtil.a("HiH_HealthKitRequestManager", "Finally, get at is empty, request error");
                    return;
                }
            }
        }
        this.d = 0;
        if (TextUtils.isEmpty(lcxVar.d()) || !lcxVar.d().startsWith("http")) {
            ReleaseLogUtil.a("HiH_HealthKitRequestManager", "url is err");
            c(lcxVar, -1, new Exception("url is err"));
        } else {
            LogUtil.a("HealthKitRequestManager", "HealthKitRequestManager get AT success and request http start");
            e(lcxVar, accountInfo, obj);
        }
    }

    private <T> void e(lcx<T> lcxVar, String str, Object obj) {
        String strE = lcxVar.e();
        strE.hashCode();
        if (strE.equals("GET")) {
            b(lcxVar, str, obj);
        } else if (strE.equals(ProfileRequestConstants.PUT_TYPE)) {
            d(lcxVar, str, obj);
        } else {
            LogUtil.j("HealthKitRequestManager", "the request is not support:", lcxVar.e());
        }
    }

    private <T> void d(lcx<T> lcxVar, String str, Object obj) {
        HttpRequestApi httpRequestApi = (HttpRequestApi) oet.d().e(HttpRequestApi.class);
        if (httpRequestApi == null) {
            ReleaseLogUtil.a("HiH_HealthKitRequestManager", "HttpRequestApi is null");
            return;
        }
        Submit<String> submitPutReq = httpRequestApi.putReq(lcxVar.d(), d(str), RequestBody.create(MediaType.parse("application/json"), ofe.c(lcxVar.b())));
        this.e.put(obj, submitPutReq);
        e(lcxVar, obj, submitPutReq);
    }

    private <T> void b(lcx<T> lcxVar, String str, Object obj) {
        HttpRequestApi httpRequestApi = (HttpRequestApi) oet.d().e(HttpRequestApi.class);
        if (httpRequestApi == null) {
            ReleaseLogUtil.a("HiH_HealthKitRequestManager", "HttpRequestApi is null");
            return;
        }
        Submit<String> req = httpRequestApi.getReq(lcxVar.d(), d(str), lcxVar.c());
        this.e.put(obj, req);
        e(lcxVar, obj, req);
    }

    private <T> void e(final lcx<T> lcxVar, final Object obj, final Submit<String> submit) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        submit.enqueue(new ResultCallback<String>() { // from class: lcy.2
            @Override // com.huawei.hms.framework.network.restclient.ResultCallback
            public void onResponse(Response<String> response) {
                LogUtil.a("HealthKitRequestManager", "Http request needs ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis), " ms");
                lcy.this.d(lcxVar, response, obj);
            }

            @Override // com.huawei.hms.framework.network.restclient.ResultCallback
            public void onFailure(Throwable th) {
                ReleaseLogUtil.a("HiH_HealthKitRequestManager", "http request onFailure ");
                if (submit.isCanceled()) {
                    return;
                }
                lcy.this.c(lcxVar, -1, th);
                oet.d().b(submit);
            }
        });
    }

    public void d(Object obj) {
        if (!this.e.containsKey(obj)) {
            LogUtil.a("HealthKitRequestManager", "Kit http manager not contains tag");
            return;
        }
        Submit<String> submitRemove = this.e.remove(obj);
        if (submitRemove.isExecuted()) {
            return;
        }
        submitRemove.cancel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public <T> void d(final lcx<T> lcxVar, Response<String> response, Object obj) {
        if (response.isSuccessful() && response.getRawResponse().getBody() != null) {
            String body = response.getRawResponse().getBody();
            if (lcxVar.a() != null) {
                final Object objFromJson = new Gson().fromJson(body, lcxVar.a().getGenericType());
                if (lcxVar.i()) {
                    lcxVar.a().onSuccess(objFromJson);
                } else {
                    this.f39931a.post(new Runnable() { // from class: lcu
                        @Override // java.lang.Runnable
                        public final void run() {
                            lcxVar.a().onSuccess(objFromJson);
                        }
                    });
                }
            }
            this.d = 0;
            return;
        }
        if (response.getCode() == 401 && this.d < 2) {
            ReleaseLogUtil.d("HiH_HealthKitRequestManager", "AT is expired, refresh at");
            this.d++;
            b(lcxVar, obj);
        } else {
            ReleaseLogUtil.a("HiH_HealthKitRequestManager", "Request error, response code = ", Integer.valueOf(response.getCode()));
            this.d = 0;
            c(lcxVar, response.getCode(), new Exception(response.getMessage()));
        }
    }

    private <T> void b(lcx<T> lcxVar, Object obj) {
        b(lcxVar, HealthAccessTokenUtil.getAtInstance().refreshAccessToken(), obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <T> void c(final lcx<T> lcxVar, final int i, final Throwable th) {
        if (lcxVar.a() != null) {
            if (lcxVar.i()) {
                lcxVar.a().onFail(i, th);
            } else {
                this.f39931a.post(new Runnable() { // from class: lcv
                    @Override // java.lang.Runnable
                    public final void run() {
                        lcxVar.a().onFail(i, th);
                    }
                });
            }
        }
    }

    private Map<String, Object> d(String str) {
        HashMap map = new HashMap(16);
        map.put("Content-type", "application/json");
        map.put("Cache-Control", " no-cache");
        map.put("Authorization", HealthEngineRequestManager.PREFIX_ACCESS_TOKEN + str);
        return map;
    }

    static class c {
        private static final lcy e = new lcy();
    }
}
