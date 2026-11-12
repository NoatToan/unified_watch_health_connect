package com.huawei.watchface;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import android.util.SparseArray;
import com.huawei.hms.api.HuaweiApiClient;
import com.huawei.hms.support.api.client.PendingResult;
import com.huawei.hms.support.api.client.ResultCallback;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.entity.pay.HwPayConstant;
import com.huawei.hms.support.api.entity.pay.PayReq;
import com.huawei.hms.support.api.entity.pay.WithholdRequest;
import com.huawei.hms.support.api.entity.pay.internal.BaseReq;
import com.huawei.hms.support.api.pay.HuaweiPay;
import com.huawei.hms.support.api.pay.PayResult;
import com.huawei.hms.support.api.pay.PayResultInfo;
import com.huawei.hms.support.common.ActivityMgr;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.watchface.api.HwWatchFaceApi;
import com.huawei.watchface.api.HwWatchFaceManager;
import com.huawei.watchface.environment.Environment;
import com.huawei.watchface.mvp.ui.activity.HMSPayAgentActivity;
import com.huawei.watchface.utils.CommonUtils;
import com.huawei.watchface.utils.HwLog;
import defpackage.orf;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public class g3 {
    public static Executor e = Executors.newSingleThreadExecutor();
    public static g3 f = new g3();
    public static final SparseArray g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f3 f30163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public BaseReq f30164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f30165c = 1;
    public Status d;

    public class a implements k1.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ BaseReq f30166a;

        public a(BaseReq baseReq) {
            this.f30166a = baseReq;
        }

        @Override // com.huawei.watchface.k1.a
        public void a() {
            g3.this.a(Constants.COORDINATE_FAIL_DEF, (PayResultInfo) null);
        }

        @Override // com.huawei.watchface.k1.a
        public void b() {
            HwLog.i("PayHelper", "onSuccess");
            g3.this.a(this.f30166a, (ResultCallback) null);
        }
    }

    public class b implements k1.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ BaseReq f30168a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ResultCallback f30169b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ i3 f30170c;

        public b(BaseReq baseReq, ResultCallback resultCallback, i3 i3Var) {
            this.f30168a = baseReq;
            this.f30169b = resultCallback;
            this.f30170c = i3Var;
        }

        @Override // com.huawei.watchface.k1.a
        public void a() {
            g3.this.a(Constants.COORDINATE_FAIL_DEF, (PayResultInfo) null);
            this.f30170c.a(-1, null);
        }

        @Override // com.huawei.watchface.k1.a
        public void b() {
            HwLog.i("PayHelper", "onSuccess");
            g3.this.a(this.f30168a, this.f30169b);
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ BaseReq f30171a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ HuaweiApiClient f30172b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ResultCallback f30173c;

        public c(BaseReq baseReq, HuaweiApiClient huaweiApiClient, ResultCallback resultCallback) {
            this.f30171a = baseReq;
            this.f30172b = huaweiApiClient;
            this.f30173c = resultCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            PendingResult<PayResult> pendingResultAddWithholdingPlan;
            HwLog.i("PayHelper", "run");
            BaseReq baseReq = this.f30171a;
            if (baseReq instanceof PayReq) {
                pendingResultAddWithholdingPlan = HuaweiPay.HuaweiPayApi.pay(this.f30172b, (PayReq) baseReq);
            } else {
                pendingResultAddWithholdingPlan = baseReq instanceof WithholdRequest ? HuaweiPay.HuaweiPayApi.addWithholdingPlan(this.f30172b, (WithholdRequest) baseReq) : null;
            }
            if (pendingResultAddWithholdingPlan != null) {
                ResultCallback<R> resultCallback = this.f30173c;
                if (resultCallback != 0) {
                    pendingResultAddWithholdingPlan.setResultCallback(resultCallback);
                } else {
                    pendingResultAddWithholdingPlan.setResultCallback(g3.this.new e());
                }
            }
        }
    }

    /* JADX INFO: loaded from: classes45.dex */
    public interface d {
    }

    /* JADX INFO: loaded from: classes45.dex */
    public class e implements ResultCallback {
        public e() {
        }

        @Override // com.huawei.hms.support.api.client.ResultCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResult(PayResult payResult) {
            g3 g3Var;
            int i;
            if (payResult == null) {
                HwLog.e("PayHelper", "result is null");
                g3.this.a(-1, (PayResultInfo) null);
                return;
            }
            Status status = payResult.getStatus();
            HwLog.i("PayHelper", "status is :" + status);
            if (status == null) {
                HwLog.e("PayHelper", "status is null");
                g3.this.a(-1, (PayResultInfo) null);
                return;
            }
            int statusCode = status.getStatusCode();
            HwLog.i("PayHelper", "rstCode=" + statusCode);
            if ((statusCode == 907135006 || statusCode == 907135003) && (i = (g3Var = g3.this).f30165c) > 0) {
                g3Var.f30165c = i - 1;
                g3Var.a(g3Var.f30164b, g3Var.f30163a);
                return;
            }
            if (statusCode != 0) {
                g3.this.a(statusCode, (PayResultInfo) null);
                return;
            }
            Activity currentActivity = ActivityMgr.INST.getCurrentActivity();
            if (currentActivity == null) {
                HwLog.e("PayHelper", "activity is null");
                g3.this.a(-1, (PayResultInfo) null);
                return;
            }
            g3 g3Var2 = g3.this;
            if (g3Var2.d != null) {
                HwLog.e("PayHelper", "has already a pay to dispose");
                g3.this.a(-1, (PayResultInfo) null);
                return;
            }
            try {
                g3Var2.d = status;
                orf.a(currentActivity, new Intent(currentActivity, (Class<?>) HMSPayAgentActivity.class));
            } catch (Exception e) {
                HwLog.e("PayHelper", "start HMSPayAgentActivity error:" + HwLog.printException(e));
                g3.this.a(-1, (PayResultInfo) null);
            }
        }
    }

    static {
        SparseArray sparseArray = new SparseArray();
        g = sparseArray;
        sparseArray.put(0, "支付成功");
        sparseArray.put(30000, "用户取消支付");
        sparseArray.put(30005, "网络连接异常");
        sparseArray.put(30002, "支付结果查询超时");
        sparseArray.put(30001, "参数错误（包含无参）");
        sparseArray.put(30099, "返回给客户端时放入json数据错误，支付结果未知");
        sparseArray.put(30006, "其他异常错误");
        sparseArray.put(-1, "通用支付失败错误码");
        sparseArray.put(30011, "支付服务不可用，请切换华为帐号服务地");
        sparseArray.put(30012, "查询订单结果状态：订单处理中");
        sparseArray.put(30013, "查询订单结果状态：订单还未处理");
        sparseArray.put(30101, "游戏帐号不一致");
        sparseArray.put(30102, "游戏实名认证失败");
        sparseArray.put(40001, "商品ID在对应商户查询的应用中不存在");
        sparseArray.put(40002, "商品授权失败");
        sparseArray.put(40003, "商品服务器内部异常");
        sparseArray.put(40004, "商品ID在对应商户查询的应用中部分不存在");
    }

    public static String a(String str) {
        HwLog.i("PayHelper", "getReservedInfor enter");
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            String accountToken = HwWatchFaceApi.getInstance(Environment.getApplicationContext()).getAccountToken();
            if (TextUtils.isEmpty(accountToken)) {
                HwLog.e("PayHelper", "getInfos accountToken is null");
                return "";
            }
            jSONObject2.put("accessToken", accountToken);
            if (TextUtils.equals(str, "4.0")) {
                jSONObject2.put("routeMode", "fullsdk");
                jSONObject2.put(HwPayConstant.KEY_APPLICATIONID, a());
            }
            jSONObject2.put(HwWatchFaceManager.CLIENT_ID, HwWatchFaceApi.getInstance(Environment.getApplicationContext()).getUserId());
            jSONObject2.put("countryCode", HwWatchFaceApi.getInstance(Environment.getApplicationContext()).getCommonCountryCode());
            jSONObject.put("accountInfo", jSONObject2);
            return jSONObject.toString();
        } catch (JSONException e2) {
            HwLog.e("PayHelper", "getReservedInfor error === " + HwLog.printException((Exception) e2));
        }
    }

    public static g3 b() {
        return f;
    }

    public d c() {
        return null;
    }

    public Status d() {
        return this.d;
    }

    public void setOnEnterPaymentPageListener(d dVar) {
    }

    public static String a() {
        if (HwWatchFaceApi.getInstance(Environment.getApplicationContext()).isTestVersion()) {
            return "101033205";
        }
        return "10414141";
    }

    public void a(BaseReq baseReq, f3 f3Var) {
        if (baseReq == null) {
            HwLog.i("PayHelper", "null == baseReq");
            return;
        }
        this.f30163a = f3Var;
        this.f30164b = baseReq;
        k1.b().b(new a(baseReq));
    }

    public void a(Activity activity, BaseReq baseReq, f3 f3Var, i3 i3Var, ResultCallback resultCallback) {
        if (baseReq == null) {
            HwLog.i("PayHelper", "null == baseReq");
            return;
        }
        this.f30163a = f3Var;
        this.f30164b = baseReq;
        k1.b().a(activity, new b(baseReq, resultCallback, i3Var));
    }

    public final void a(BaseReq baseReq, ResultCallback resultCallback) {
        HuaweiApiClient huaweiApiClientA = k1.b().a();
        if (CommonUtils.i() >= 50000300) {
            e.execute(new c(baseReq, huaweiApiClientA, resultCallback));
        } else {
            HwLog.i("PayHelper", "HMS version is not supported");
        }
    }

    public void a(int i, PayResultInfo payResultInfo) {
        HwLog.i("PayHelper", "pay-handler=" + this.f30163a + ", retCode=" + i);
        if (this.f30163a != null) {
            if (payResultInfo != null && this.f30164b != null && TextUtils.isEmpty(payResultInfo.getRequestId())) {
                payResultInfo.setRequestId(this.f30164b.requestId);
                i = 30000;
            }
            this.f30163a.a(i, payResultInfo);
            this.f30163a = null;
        }
        this.d = null;
        this.f30164b = null;
        this.f30165c = 1;
    }
}
