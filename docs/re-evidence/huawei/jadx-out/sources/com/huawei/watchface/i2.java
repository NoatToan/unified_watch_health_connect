package com.huawei.watchface;

import android.app.Activity;
import android.content.Context;
import android.content.IntentSender;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.huawei.hmf.tasks.OnFailureListener;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hmf.tasks.Task;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.api.HuaweiApiClient;
import com.huawei.hms.iap.Iap;
import com.huawei.hms.iap.IapApiException;
import com.huawei.hms.iap.entity.IsEnvReadyReq;
import com.huawei.hms.iap.entity.PurchaseIntentReq;
import com.huawei.hms.iap.entity.PurchaseIntentResult;
import com.huawei.hms.kit.awareness.status.CapabilityStatus;
import com.huawei.hms.support.api.client.ResultCallback;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.entity.pay.HwPayConstant;
import com.huawei.hms.support.api.entity.pay.PayReq;
import com.huawei.hms.support.api.entity.pay.WithholdRequest;
import com.huawei.hms.support.api.entity.pay.internal.BaseReq;
import com.huawei.hms.support.api.pay.HuaweiPay;
import com.huawei.hms.support.api.pay.PayResult;
import com.huawei.hms.support.api.pay.PayResultInfo;
import com.huawei.hms.support.api.paytask.Pay;
import com.huawei.hms.support.api.paytask.PayClient;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.constant.DetailedCreativeType;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import com.huawei.watchface.api.HwWatchFaceApi;
import com.huawei.watchface.api.WebViewActivity;
import com.huawei.watchface.environment.Environment;
import com.huawei.watchface.flavor.FlavorConfig;
import com.huawei.watchface.mvp.model.datatype.CouponsAndVipPackageBean;
import com.huawei.watchface.mvp.model.datatype.CouponsByproductBean;
import com.huawei.watchface.mvp.model.datatype.DeveloperPayloadIap4;
import com.huawei.watchface.mvp.model.datatype.InstallWatchFaceBean;
import com.huawei.watchface.mvp.model.datatype.MarketH5Bean;
import com.huawei.watchface.mvp.model.datatype.PayIap4Info;
import com.huawei.watchface.mvp.model.datatype.PayIap4InfoCn;
import com.huawei.watchface.mvp.model.datatype.PayInfo;
import com.huawei.watchface.mvp.model.datatype.VipOrderBean;
import com.huawei.watchface.mvp.model.datatype.VipPackageBean;
import com.huawei.watchface.mvp.model.datatype.VipPackageIAP4Bean;
import com.huawei.watchface.mvp.model.datatype.WatchFaceDownloadQueryResp;
import com.huawei.watchface.mvp.model.datatype.WatchFaceOrderBean;
import com.huawei.watchface.mvp.model.datatype.WatchFaceSignBean;
import com.huawei.watchface.mvp.model.helper.GsonHelper;
import com.huawei.watchface.mvp.model.helper.systemparam.NewSystemParamManager;
import com.huawei.watchface.mvp.model.helper.systemparam.SystemParamNames;
import com.huawei.watchface.mvp.model.info.VipPayInfo;
import com.huawei.watchface.mvp.model.info.VipPayInfoCoupons;
import com.huawei.watchface.mvp.model.pay.MagicJsPayResult;
import com.huawei.watchface.mvp.model.thread.GetSignThread;
import com.huawei.watchface.mvp.model.thread.GetVipProductInfoIAP4Thread;
import com.huawei.watchface.mvp.model.thread.GetVipProductInfoThread;
import com.huawei.watchface.mvp.model.thread.HitopReqDownloadQueryThread;
import com.huawei.watchface.mvp.model.thread.HitopReqOrderBatchCreateThread;
import com.huawei.watchface.mvp.ui.dialog.BottomVipPayDialogFragment;
import com.huawei.watchface.utils.BackgroundTaskUtils;
import com.huawei.watchface.utils.CommonUtils;
import com.huawei.watchface.utils.DensityUtil;
import com.huawei.watchface.utils.HwLog;
import com.huawei.watchface.utils.IntegerUtils;
import com.huawei.watchface.utils.WatchFaceHttpUtil;
import com.huawei.watchface.utils.callback.OperateWatchFaceCallback;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public class i2 {
    public static final Object w = new Object();
    public static i2 x;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public OperateWatchFaceCallback f30210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f30211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HuaweiApiClient f30212c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public boolean k;
    public boolean l;
    public WatchFaceOrderBean m;
    public z2 n;
    public BottomVipPayDialogFragment o;
    public i3 p;
    public VipPackageBean q;
    public VipPayInfoCoupons r;
    public CouponsByproductBean s;
    public i3 t;
    public HuaweiApiClient.OnConnectionFailedListener u = new HuaweiApiClient.OnConnectionFailedListener() { // from class: com.huawei.watchface.i2$$ExternalSyntheticLambda1
        @Override // com.huawei.hms.api.HuaweiApiClient.OnConnectionFailedListener
        public final void onConnectionFailed(ConnectionResult connectionResult) {
            this.f$0.a(connectionResult);
        }
    };
    public HuaweiApiClient.ConnectionCallbacks v = new a();

    public class a implements HuaweiApiClient.ConnectionCallbacks {
        public a() {
        }

        @Override // com.huawei.hms.api.HuaweiApiClient.ConnectionCallbacks
        public void onConnected() {
            HwLog.i("HwWatchFacePayManager", "onConnected, IsConnected:" + i2.this.f30212c.isConnected());
            i2.this.d();
        }

        @Override // com.huawei.hms.api.HuaweiApiClient.ConnectionCallbacks
        public void onConnectionSuspended(int i) {
            HwLog.i("HwWatchFacePayManager", "onConnectionSuspended, cause:" + i + ", IsConnected:" + i2.this.f30212c.isConnected());
            i2.this.p();
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            i2 i2Var = i2.this;
            u1 u1Var = new u1(i2Var.f, i2Var.i);
            HwLog.i("HwWatchFacePayManager", "unlockCoupon :  " + u1Var.b(u1Var.e()));
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f30215a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f30216b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f30217c;
        public final /* synthetic */ String d;
        public final /* synthetic */ InstallWatchFaceBean e;

        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f30218a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f30219b;

            public a(int i, String str) {
                this.f30218a = i;
                this.f30219b = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                HwLog.i("HwWatchFacePayManager", "getWatchFacePayVerifyInfo -- resultCode: " + this.f30218a);
                if (this.f30218a == 0 && !TextUtils.isEmpty(this.f30219b)) {
                    c cVar = c.this;
                    i2.this.a(cVar.f30217c, cVar.d, "0");
                    return;
                }
                if (!WatchFaceHttpUtil.a(this.f30218a)) {
                    HwLog.e("HwWatchFacePayManager", "getWatchFacePayVerifyInfo -- watchFaceDownloadQueryResp is not success, ret==" + this.f30218a);
                    c cVar2 = c.this;
                    i2.this.c(cVar2.e);
                    return;
                }
                c cVar3 = c.this;
                i2.this.a(cVar3.f30217c, cVar3.d, "orderProduct_" + this.f30218a);
            }
        }

        public c(String str, String str2, String str3, String str4, InstallWatchFaceBean installWatchFaceBean) {
            this.f30215a = str;
            this.f30216b = str2;
            this.f30217c = str3;
            this.d = str4;
            this.e = installWatchFaceBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            HitopReqDownloadQueryThread hitopReqDownloadQueryThread = new HitopReqDownloadQueryThread(this.f30215a, this.f30216b, 1);
            WatchFaceDownloadQueryResp watchFaceDownloadQueryRespB = hitopReqDownloadQueryThread.b(hitopReqDownloadQueryThread.e());
            if (watchFaceDownloadQueryRespB == null) {
                HwLog.e("HwWatchFacePayManager", "getWatchFacePayVerifyInfo -- watchFaceDownloadQueryResp is null");
                return;
            }
            int iIntValue = watchFaceDownloadQueryRespB.getResultcode().intValue();
            String downUrl = watchFaceDownloadQueryRespB.getDownUrl();
            if (iIntValue == 11002 && i2.this.f30210a != null) {
                HwLog.e("HwWatchFacePayManager", "getWatchFacePayVerifyInfo -- watchFaceDownloadQueryResp is not success, ret==" + iIntValue);
                hitopReqDownloadQueryThread.a(iIntValue, i2.this.f30210a);
            }
            BackgroundTaskUtils.postInMainThread(new a(iIntValue, downUrl));
        }
    }

    public class d implements OnFailureListener {
        public d() {
        }

        @Override // com.huawei.hmf.tasks.OnFailureListener
        public void onFailure(Exception exc) {
            String str = "payForSingleVip onFailure: " + HwLog.printException(exc);
            HwLog.i("HwWatchFacePayManager", str);
            i2.this.p.a(-1, null);
            com.huawei.watchface.k.a(i2.this.h, -1, "fullsdk订单参数错误 - " + str);
        }
    }

    public class e implements OnSuccessListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ WebViewActivity f30222a;

        public e(WebViewActivity webViewActivity) {
            this.f30222a = webViewActivity;
        }

        @Override // com.huawei.hmf.tasks.OnSuccessListener
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(PayResult payResult) {
            FlavorConfig.safeHwLog("HwWatchFacePayManager", "payForSingleVip -- payResult = " + GsonHelper.toJson(payResult));
            i2.this.a(payResult, this.f30222a, 105);
        }
    }

    public class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f30224a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f30225b;

        public class a implements View.OnClickListener {
            public a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                HwLog.i("HwWatchFacePayManager", "showInstallHmsTip() ok.isTryOutTip");
                f fVar = f.this;
                i2 i2Var = i2.this;
                i2Var.a(i2Var.f30211b, (Activity) fVar.f30225b);
            }
        }

        public class b implements View.OnClickListener {
            public b(f fVar) {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                HwLog.i("HwWatchFacePayManager", "showInstallHmsTip() cancel.isTryOutTip");
            }
        }

        public class c implements View.OnClickListener {
            public c() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                HwLog.i("HwWatchFacePayManager", "showInstallHmsTip() ok");
                f fVar = f.this;
                i2 i2Var = i2.this;
                i2Var.a(i2Var.f30211b, (Activity) fVar.f30225b);
            }
        }

        public class d implements View.OnClickListener {
            public d(f fVar) {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                HwLog.i("HwWatchFacePayManager", "showInstallHmsTip() cancel");
            }
        }

        public f(boolean z, Context context) {
            this.f30224a = z;
            this.f30225b = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f30224a) {
                z2 z2VarA = new z2.a(this.f30225b).a(DensityUtil.getStringById(R.string.IDS_hw_hms_lite_install_alert)).a(R.string.cancel, new b(this)).b(R.string.IDS_hw_watchface_go_hms_install, new a()).a();
                z2VarA.setCancelable(false);
                z2VarA.show();
            } else {
                j0 j0VarA = new j0.a(this.f30225b).b(R.string.IDS_pay_failed).a(DensityUtil.getStringById(R.string.IDS_hw_hms_lite_install_alert)).a(R.string.cancel, new d(this)).b(R.string.IDS_hw_watchface_go_hms_install, new c()).a();
                j0VarA.setCancelable(false);
                j0VarA.show();
            }
        }
    }

    public class g implements HuaweiApiClient.ConnectionCallbacks {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.huawei.watchface.a f30229a;

        public g(i2 i2Var, com.huawei.watchface.a aVar) {
            this.f30229a = aVar;
        }

        @Override // com.huawei.hms.api.HuaweiApiClient.ConnectionCallbacks
        public void onConnected() {
            HwLog.i("HwWatchFacePayManager", "obtainToken() mApiClientConnectionCallbacks() aToken");
            this.f30229a.a();
        }

        @Override // com.huawei.hms.api.HuaweiApiClient.ConnectionCallbacks
        public void onConnectionSuspended(int i) {
            HwLog.i("HwWatchFacePayManager", "obtainToken() mApiClientConnectionCallbacks() onConnectionSuspended");
            this.f30229a.a();
        }
    }

    public class h implements ResultCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ WebViewActivity f30230a;

        public h(WebViewActivity webViewActivity) {
            this.f30230a = webViewActivity;
        }

        @Override // com.huawei.hms.support.api.client.ResultCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResult(PayResult payResult) {
            i2.this.a(payResult, this.f30230a, 101);
        }
    }

    public class i implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f30232a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f30233b;

        public i(String str, String str2) {
            this.f30232a = str;
            this.f30233b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            i2 i2Var = i2.this;
            t1 t1Var = new t1(i2Var.g, i2Var.f, this.f30232a, this.f30233b);
            if (t1Var.b(t1Var.c("")).intValue() == 0) {
                HwLog.i("HwWatchFacePayManager", "upload pay result success,refresh h5");
            }
        }
    }

    /* JADX INFO: loaded from: classes45.dex */
    public interface j {
        void a(i3 i3Var);
    }

    /* JADX INFO: loaded from: classes45.dex */
    public interface k {
        void a(Object obj, i3 i3Var, WebViewActivity webViewActivity);
    }

    public i2(Context context) {
        this.f30211b = context;
    }

    public static String f() {
        if (Environment.getApplicationContext() == null) {
            return "";
        }
        return HwWatchFaceApi.getInstance(Environment.getApplicationContext()).isTestVersion() ? "102271013" : "106367161";
    }

    public final /* synthetic */ void a(ConnectionResult connectionResult) {
        HwLog.i("HwWatchFacePayManager", "onConnectionFailed, ErrorCode:" + connectionResult.getErrorCode());
        if (connectionResult.getErrorCode() == 6) {
            a(this.d, this.e, String.valueOf(CapabilityStatus.AWA_CAP_CODE_WIFI));
        } else {
            p();
        }
        a((Context) Environment.getApplicationContext()).c(connectionResult);
    }

    public void b(String str) {
        this.h = str;
    }

    public void c(String str) {
        this.g = str;
    }

    public void d(InstallWatchFaceBean installWatchFaceBean) {
        if (installWatchFaceBean == null) {
            HwLog.w("HwWatchFacePayManager", "getWatchFacePayVerifyInfo() watchFacePayInfo is null。");
            p();
            return;
        }
        String productId = installWatchFaceBean.getProductId();
        String watchFaceHiTopId = installWatchFaceBean.getWatchFaceHiTopId();
        String version = installWatchFaceBean.getVersion();
        if (!TextUtils.isEmpty(productId)) {
            BackgroundTaskUtils.submit(new c(productId, watchFaceHiTopId, watchFaceHiTopId, version, installWatchFaceBean));
        } else {
            HwLog.w("HwWatchFacePayManager", "getWatchFacePayVerifyInfo() productId is null。");
            p();
        }
    }

    public final void e(InstallWatchFaceBean installWatchFaceBean) {
        HwLog.i("HwWatchFacePayManager", "handleNullWatchFaceSignBean() enter watchFaceSignBean is null. ");
        GetSignThread getSignThread = new GetSignThread();
        if (getSignThread.b(getSignThread.e()) != null) {
            c(installWatchFaceBean);
        } else {
            HwLog.w("HwWatchFacePayManager", "handleNullWatchFaceSignBean watchFaceSignBean is null.");
            p();
        }
    }

    public String g() {
        return this.d;
    }

    public String h() {
        return this.h;
    }

    public final WebViewActivity j() {
        OperateWatchFaceCallback operateWatchFaceCallback = this.f30210a;
        if (operateWatchFaceCallback == null) {
            return null;
        }
        Context customWebViewContext = operateWatchFaceCallback.getCustomWebViewContext();
        if (customWebViewContext instanceof WebViewActivity) {
            return (WebViewActivity) customWebViewContext;
        }
        return null;
    }

    public void k() {
        this.f30212c = new HuaweiApiClient.Builder(Environment.getApplicationContext()).addApi(HuaweiPay.PAY_API).addConnectionCallbacks(this.v).addOnConnectionFailedListener(this.u).build();
    }

    public final boolean l() {
        if (HwWatchFaceApi.getInstance(this.f30211b).isHmsLiteEnable()) {
            HwLog.i("HwWatchFacePayManager", "isNeedAccountInfo isHmsLiteEnable true");
            return Build.VERSION.SDK_INT > 27;
        }
        if (CommonUtils.y()) {
            return false;
        }
        HwLog.i("HwWatchFacePayManager", "isNeedAccountInfo hms unAvailable");
        return true;
    }

    public final /* synthetic */ void m() {
        BottomVipPayDialogFragment bottomVipPayDialogFragment = this.o;
        if (bottomVipPayDialogFragment == null) {
            HwLog.d("HwWatchFacePayManager", "bottomVipPayDialogFragment is null");
        } else {
            bottomVipPayDialogFragment.dismiss();
        }
    }

    public final void n() {
        BackgroundTaskUtils.submit(new b());
    }

    public void o() {
        if (this.l) {
            c();
        } else {
            d();
        }
    }

    public final void p() {
        OperateWatchFaceCallback operateWatchFaceCallback = this.f30210a;
        if (operateWatchFaceCallback == null) {
            return;
        }
        operateWatchFaceCallback.transmitFinishPay("");
    }

    public void q() {
        HwLog.i("HwWatchFacePayManager", "unlockCoupon: enter");
        if (TextUtils.isEmpty(this.f) || TextUtils.isEmpty(this.i)) {
            HwLog.i("HwWatchFacePayManager", "null == taskInfo.mOrderInfo || null == taskInfo.mCouponInfo");
        } else {
            n();
        }
    }

    public final /* synthetic */ void c(i3 i3Var) {
        a(i3Var, new PayInfo());
    }

    public String i() {
        WatchFaceSignBean watchFaceSignBeanA = WatchFaceHttpUtil.A();
        if (watchFaceSignBeanA != null) {
            return c5.a().a(watchFaceSignBeanA);
        }
        HwLog.w("HwWatchFacePayManager", "getWatchFaceSignBean watchFaceSignBean is null");
        return "";
    }

    public final /* synthetic */ void b(i3 i3Var) {
        a(i3Var, new PayInfo());
    }

    public final void c(InstallWatchFaceBean installWatchFaceBean) {
        HwLog.i("HwWatchFacePayManager", "getWatchFacePayInfo: enter");
        if (installWatchFaceBean == null) {
            HwLog.w("HwWatchFacePayManager", "getWatchFacePayInfo() watchFacePayInfo is null");
            p();
            return;
        }
        if (!com.huawei.watchface.k.n().containsKey(installWatchFaceBean.getWatchFaceHiTopId())) {
            com.huawei.watchface.k.n().put(installWatchFaceBean.getWatchFaceHiTopId(), b(installWatchFaceBean));
        }
        a();
        if (a(installWatchFaceBean)) {
            return;
        }
        String watchFaceHiTopId = installWatchFaceBean.getWatchFaceHiTopId();
        String version = installWatchFaceBean.getVersion();
        String couponId = installWatchFaceBean.getCouponId();
        this.d = watchFaceHiTopId;
        this.e = version;
        this.i = couponId;
        if (a(installWatchFaceBean, watchFaceHiTopId)) {
            return;
        }
        a(installWatchFaceBean, watchFaceHiTopId, couponId);
    }

    public final void b(boolean z, VipOrderBean vipOrderBean, i3 i3Var, boolean z2) {
        a(z, vipOrderBean, i3Var, z2, new j() { // from class: com.huawei.watchface.i2$$ExternalSyntheticLambda0
            @Override // com.huawei.watchface.i2.j
            public final void a(i3 i3Var2) {
                this.f$0.c(i3Var2);
            }
        }, new k() { // from class: com.huawei.watchface.i2$$ExternalSyntheticLambda11
            @Override // com.huawei.watchface.i2.k
            public final void a(Object obj, i3 i3Var2, WebViewActivity webViewActivity) {
                this.f$0.a((PayIap4InfoCn) obj, i3Var2, webViewActivity);
            }
        });
    }

    public static String b(Object obj) {
        if (obj != null) {
            String strA = a(obj);
            if (!TextUtils.isEmpty(strA)) {
                HwLog.i("HwWatchFacePayManager", "getWatchfaceMemberAppId is from payInfo");
                return strA;
            }
        }
        return f();
    }

    public static i2 a(Context context) {
        i2 i2Var;
        synchronized (w) {
            if (x == null) {
                HwLog.i("HwWatchFacePayManager", "getInstance() context =" + context);
                x = new i2(context.getApplicationContext());
            }
            i2Var = x;
        }
        return i2Var;
    }

    public String e() {
        VipPackageBean vipPackageBean;
        CouponsByproductBean couponsByproductBean = this.s;
        if (couponsByproductBean != null && (vipPackageBean = this.q) != null) {
            return GsonHelper.toJson(new CouponsAndVipPackageBean(vipPackageBean, couponsByproductBean));
        }
        HwLog.i("HwWatchFacePayManager", "mCouponsByproductBean or mVipPackageBean is null");
        return "";
    }

    public final /* synthetic */ void b(Exception exc) {
        if (exc instanceof IapApiException) {
            IapApiException iapApiException = (IapApiException) exc;
            HwLog.i("HwWatchFacePayManager", "payVipByIAP4, IapApiException: " + ("status: " + iapApiException.getStatus() + " | statusCode: " + iapApiException.getStatusCode() + " | statusMessage: " + iapApiException.getStatusMessage()));
        } else {
            HwLog.i("HwWatchFacePayManager", "payVipByIAP4 error: " + HwLog.printException(exc));
        }
        this.p.a(-1, null);
    }

    public void a(OperateWatchFaceCallback operateWatchFaceCallback) {
        this.f30210a = operateWatchFaceCallback;
    }

    public void a(PayResultInfo payResultInfo) {
        HwLog.i("HwWatchFacePayManager", "unlockCoupon: enter");
        if (payResultInfo != null && !TextUtils.isEmpty(this.f) && !TextUtils.isEmpty(this.i)) {
            n();
        } else {
            HwLog.i("HwWatchFacePayManager", "null ==taskInfo || null == taskInfo.mOrderInfo || null == taskInfo.mCouponInfo");
        }
    }

    public final void d() {
        WatchFaceOrderBean watchFaceOrderBean = this.m;
        if (watchFaceOrderBean == null) {
            HwLog.w("HwWatchFacePayManager", "mWatchFaceOrderBean is null");
            p();
            com.huawei.watchface.k.a(this.d, -1, "hms支付参数为空 - mWatchFaceOrderBean is null");
            return;
        }
        PayReq payReqA = a(watchFaceOrderBean);
        if (this.f30212c == null) {
            k();
        }
        OperateWatchFaceCallback operateWatchFaceCallback = this.f30210a;
        if (operateWatchFaceCallback == null) {
            HwLog.e("HwWatchFacePayManager", "doWatchFacePay mOperateWatchFaceCallback is null");
            com.huawei.watchface.k.a(this.d, -1, "hms支付参数为空 - doWatchFacePay mOperateWatchFaceCallback is null");
            return;
        }
        Context customWebViewContext = operateWatchFaceCallback.getCustomWebViewContext();
        WebViewActivity webViewActivity = customWebViewContext instanceof WebViewActivity ? (WebViewActivity) customWebViewContext : null;
        if (webViewActivity == null) {
            HwLog.e("HwWatchFacePayManager", "doWatchFacePay activity is null");
            p();
            com.huawei.watchface.k.a(this.d, -1, "hms支付上下文为空 - doWatchFacePay activity is null");
        } else if (this.f30212c.isConnected()) {
            HuaweiPay.HuaweiPayApi.pay(this.f30212c, payReqA).setResultCallback(new h(webViewActivity));
        } else {
            HwLog.w("HwWatchFacePayManager", "Connect failed, please connect first.");
            this.f30212c.connect(webViewActivity);
        }
    }

    public final com.huawei.watchface.k b(InstallWatchFaceBean installWatchFaceBean) {
        return ((com.huawei.watchface.k) ((com.huawei.watchface.k) new com.huawei.watchface.k().b(System.currentTimeMillis())).b(installWatchFaceBean.getWatchFaceHiTopId())).h("0").a("hitopid", installWatchFaceBean.getWatchFaceHiTopId()).a("version", installWatchFaceBean.getVersion()).a(ParsedFieldTag.PRICE, installWatchFaceBean.getPrice()).a("screen", installWatchFaceBean.getWatchScreen()).a("couponId", installWatchFaceBean.getCouponId());
    }

    public void a(VipPayInfoCoupons vipPayInfoCoupons) {
        this.r = vipPayInfoCoupons;
    }

    public void a(BaseReq baseReq, final i3 i3Var, boolean z) {
        this.p = i3Var;
        HwLog.i("HwWatchFacePayManager", "payForVip isFromMagic：" + z);
        VipPayInfoCoupons vipPayInfoCoupons = this.r;
        if (vipPayInfoCoupons != null) {
            com.huawei.watchface.k.a(vipPayInfoCoupons.getProductCode(), this.r);
            b(this.r.getProductCode());
        }
        OperateWatchFaceCallback operateWatchFaceCallback = this.f30210a;
        if (operateWatchFaceCallback == null) {
            a(i3Var, "payForVip mOperateWatchFaceCallback is null", z);
            return;
        }
        Context customWebViewContext = operateWatchFaceCallback.getCustomWebViewContext();
        if (!(customWebViewContext instanceof WebViewActivity)) {
            a(i3Var, "hms支付参数为空 activityContext is not WebViewActivity", z);
            return;
        }
        final WebViewActivity webViewActivity = (WebViewActivity) customWebViewContext;
        this.k = true;
        if (p0.l()) {
            if (!CommonUtils.a(this.f30211b)) {
                HwLog.w("HwWatchFacePayManager", "getWatchFacePayInfo() isNewHonor.");
                this.k = false;
            }
        } else if (HwWatchFaceApi.getInstance(this.f30211b).isHmsLiteEnable()) {
            HwLog.w("HwWatchFacePayManager", "getWatchFacePayInfo() isHmsLiteEnable.");
            this.k = false;
        }
        this.l = false;
        if (!this.k) {
            a(webViewActivity, baseReq);
            this.l = true;
        } else {
            g3.b().a(webViewActivity, baseReq, null, i3Var, new ResultCallback() { // from class: com.huawei.watchface.i2$$ExternalSyntheticLambda22
                @Override // com.huawei.hms.support.api.client.ResultCallback
                public final void onResult(Object obj) {
                    this.f$0.a(webViewActivity, i3Var, (PayResult) obj);
                }
            });
        }
    }

    public final void b(String str, String str2, String str3, String str4, String str5) {
        String str6;
        String stringById = DensityUtil.getStringById(R.string.IDS_watchface_watch_pay_dialog_content);
        if (!TextUtils.isEmpty(str3)) {
            str6 = String.format(Locale.ENGLISH, stringById, str3 + str2);
        } else {
            HwLog.w("HwWatchFacePayManager", "getWatchFacePayInfo mPaySymbolType is null!");
            str6 = "";
        }
        a(str, str2, str6, str4, str5);
    }

    public void c() {
        HwLog.i("HwWatchFacePayManager", "doFullSdkWatchFacePay enter");
        com.huawei.watchface.k.d(this.d).a("isfullsdk", "true");
        WatchFaceOrderBean watchFaceOrderBean = this.m;
        if (watchFaceOrderBean == null) {
            HwLog.w("HwWatchFacePayManager", "mWatchFaceOrderBean is null");
            p();
            com.huawei.watchface.k.a(this.d, -1, "fullsdk订单参数错误 - mWatchFaceOrderBean is null");
            return;
        }
        PayReq payReqA = a(watchFaceOrderBean);
        HwLog.i("HwWatchFacePayManager", "doFullSdkWatchFacePay makePayReqpayReq");
        OperateWatchFaceCallback operateWatchFaceCallback = this.f30210a;
        if (operateWatchFaceCallback == null) {
            HwLog.e("HwWatchFacePayManager", "doFullSdkWatchFacePay mOperateWatchFaceCallback is null");
            com.huawei.watchface.k.a(this.d, -1, "fullsdk订单参数错误 - mOperateWatchFaceCallback is null");
            return;
        }
        Context customWebViewContext = operateWatchFaceCallback.getCustomWebViewContext();
        final WebViewActivity webViewActivity = customWebViewContext instanceof WebViewActivity ? (WebViewActivity) customWebViewContext : null;
        if (webViewActivity == null) {
            HwLog.e("HwWatchFacePayManager", "doFullSdkWatchFacePay activity is null");
            p();
            com.huawei.watchface.k.a(this.d, -1, "fullsdk获取上下文错误 - activity is null");
        } else {
            HwLog.i("HwWatchFacePayManager", "doFullSdkWatchFacePay getPayClient start");
            Task<PayResult> taskPay = Pay.getPayClient((Activity) webViewActivity).pay(payReqA);
            HwLog.i("HwWatchFacePayManager", "doFullSdkWatchFacePay getPayClient end");
            taskPay.addOnSuccessListener(new OnSuccessListener() { // from class: com.huawei.watchface.i2$$ExternalSyntheticLambda17
                @Override // com.huawei.hmf.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    this.f$0.a(webViewActivity, (PayResult) obj);
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: com.huawei.watchface.i2$$ExternalSyntheticLambda18
                @Override // com.huawei.hmf.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    this.f$0.a(exc);
                }
            });
        }
    }

    public final void b(final String str, final String str2, final String str3, final String str4) {
        HwLog.i("HwWatchFacePayManager", "startWatchFacePayThread: enter");
        BackgroundTaskUtils.submit(new Runnable() { // from class: com.huawei.watchface.i2$$ExternalSyntheticLambda16
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(str, str2, str3, str4);
            }
        });
    }

    public void b(PayResultInfo payResultInfo) {
        if (this.p != null) {
            HwLog.i("HwWatchFacePayManager", "subscriptionPayResultListener before call");
            this.p.a(payResultInfo.getReturnCode(), payResultInfo);
        } else {
            HwLog.i("HwWatchFacePayManager", "subscriptionPayResultListener is null");
        }
    }

    public void b(final MarketH5Bean marketH5Bean, final MagicJsPayResult magicJsPayResult, final i3 i3Var, final boolean z) {
        this.r = null;
        HwLog.i("HwWatchFacePayManager", "payVip payReq enter");
        if (TextUtils.isEmpty(marketH5Bean.getProductId())) {
            HwLog.e("HwWatchFacePayManager", "payVip productId is null");
            i3Var.a(30001, null);
        } else {
            BackgroundTaskUtils.submit(new Runnable() { // from class: com.huawei.watchface.i2$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.a(marketH5Bean, magicJsPayResult, i3Var, z);
                }
            });
        }
    }

    public void b(final VipPayInfoCoupons vipPayInfoCoupons, final i3 i3Var, final v4 v4Var, final boolean z) {
        HwLog.i("HwWatchFacePayManager", "payForVipNew payReq enter");
        if (TextUtils.isEmpty(vipPayInfoCoupons.getProductCode())) {
            HwLog.e("HwWatchFacePayManager", "payForVipNew productId is null");
            i3Var.a(30001, null);
        } else {
            BackgroundTaskUtils.submit(new Runnable() { // from class: com.huawei.watchface.i2$$ExternalSyntheticLambda9
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.a(vipPayInfoCoupons, z, v4Var, i3Var);
                }
            });
        }
    }

    public final /* synthetic */ void a(WebViewActivity webViewActivity, i3 i3Var, PayResult payResult) {
        Status status = payResult.getStatus();
        HwLog.i("HwWatchFacePayManager", "payForVip, status :" + status);
        if (status.getStatusCode() == 0 && this.f30211b != null) {
            try {
                status.startResolutionForResult(webViewActivity, 104);
                return;
            } catch (IntentSender.SendIntentException unused) {
                HwLog.e("HwWatchFacePayManager", "payForVip SendIntentException");
                i3Var.a(-1, null);
                return;
            }
        }
        HwLog.i("HwWatchFacePayManager", "Status Code : Not Success, PAY_STATE_FAILED");
        i3Var.a(-1, null);
    }

    public void b(final VipPayInfoCoupons vipPayInfoCoupons, final i3 i3Var, final v4 v4Var) {
        HwLog.i("HwWatchFacePayManager", "payForVipIAP4 payReq enter");
        if (TextUtils.isEmpty(vipPayInfoCoupons.getProductCode())) {
            HwLog.e("HwWatchFacePayManager", "payForVipIAP4 productId is null");
            i3Var.a(30001, null);
        } else {
            BackgroundTaskUtils.submit(new Runnable() { // from class: com.huawei.watchface.i2$$ExternalSyntheticLambda14
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.a(vipPayInfoCoupons, i3Var, v4Var);
                }
            });
        }
    }

    public void d(String str) {
        HwLog.w("HwWatchFacePayManager", "uploadWatchFacePayEvent() status: " + str);
        com.huawei.watchface.k.a(this.d, r2.a(str, -1), null);
    }

    public final VipOrderBean b(VipPackageBean vipPackageBean) {
        if (a(vipPackageBean)) {
            VipOrderBean vipOrderBean = new VipOrderBean();
            vipOrderBean.setResultcode(String.valueOf(-101));
            HwLog.i("HwWatchFacePayManager", "getVipOrderBean checkNeedBuy false");
            return vipOrderBean;
        }
        if (!TextUtils.equals("1", NewSystemParamManager.getSystemParam(SystemParamNames.SYSTEM_PARAM_SUPPORT_JOIN_VIP_V2, "1")) && TextUtils.isEmpty(vipPackageBean.getMagicExtendInfo())) {
            HwLog.i("HwWatchFacePayManager", "getVipOrderBean SYSTEM_PARAM_SUPPORT_JOIN_VIP_V2 not support");
            a1 a1Var = new a1(vipPackageBean, this.j);
            if (vipPackageBean instanceof VipPayInfoCoupons) {
                VipPayInfoCoupons vipPayInfoCoupons = (VipPayInfoCoupons) vipPackageBean;
                a1Var.d(vipPayInfoCoupons.getSign());
                a1Var.c(vipPayInfoCoupons.getDeviceModel());
            }
            return a1Var.b(a1Var.h());
        }
        HwLog.i("HwWatchFacePayManager", "getVipOrderBean SYSTEM_PARAM_SUPPORT_JOIN_VIP_V2 is support or MagicExtendInfo is not null");
        b1 b1Var = new b1(vipPackageBean, this.j);
        if (vipPackageBean instanceof VipPayInfoCoupons) {
            VipPayInfoCoupons vipPayInfoCoupons2 = (VipPayInfoCoupons) vipPackageBean;
            b1Var.d(vipPayInfoCoupons2.getSign());
            b1Var.c(vipPayInfoCoupons2.getDeviceModel());
        }
        return b1Var.b(b1Var.h());
    }

    public final void a(i3 i3Var, String str, boolean z) {
        HwLog.e("HwWatchFacePayManager", "payForVip -- " + str);
        i3Var.a(Constants.COORDINATE_FAIL_DEF, null);
        com.huawei.watchface.k.a(this.h, -1, str);
        if (z) {
            k4.b(DensityUtil.getStringById(R.string.member_service_error));
        }
    }

    public void c(ConnectionResult connectionResult) {
        a(connectionResult, this.d);
    }

    public final void a(boolean z, VipOrderBean vipOrderBean, final i3 i3Var, boolean z2, j jVar, final k kVar) {
        HwLog.i("HwWatchFacePayManager", "purchaseWithIAP4Common  isFromMagic：" + z2);
        try {
            if (a(vipOrderBean, i3Var, z2)) {
                return;
            }
            final WebViewActivity webViewActivityJ = j();
            if (webViewActivityJ == null) {
                k4.b(DensityUtil.getStringById(R.string.member_service_error));
                a(i3Var, 30001, "purchaseWithIAP4Common webViewActivity is null");
                return;
            }
            final Object payInfo = vipOrderBean.getPayInfo();
            if (payInfo == null) {
                jVar.a(i3Var);
                return;
            }
            if ((payInfo instanceof PayIap4InfoCn) && !TextUtils.isEmpty(vipOrderBean.getApplicationId())) {
                ((PayIap4InfoCn) payInfo).setApplicationId(vipOrderBean.getApplicationId());
            }
            a(z, webViewActivityJ, b(payInfo)).addOnSuccessListener(new OnSuccessListener() { // from class: com.huawei.watchface.i2$$ExternalSyntheticLambda10
                @Override // com.huawei.hmf.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    kVar.a(payInfo, i3Var, webViewActivityJ);
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: com.huawei.watchface.i2$$ExternalSyntheticLambda12
                @Override // com.huawei.hmf.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    this.f$0.b(i3Var, exc);
                }
            });
        } catch (Exception e2) {
            k4.b(DensityUtil.getStringById(R.string.member_service_error));
            a(i3Var, -1, "会员服务出错 exception:" + HwLog.printException(e2));
        }
    }

    public final void a(boolean z, VipOrderBean vipOrderBean, i3 i3Var, boolean z2) {
        a(z, vipOrderBean, i3Var, z2, new j() { // from class: com.huawei.watchface.i2$$ExternalSyntheticLambda5
            @Override // com.huawei.watchface.i2.j
            public final void a(i3 i3Var2) {
                this.f$0.b(i3Var2);
            }
        }, new k() { // from class: com.huawei.watchface.i2$$ExternalSyntheticLambda6
            @Override // com.huawei.watchface.i2.k
            public final void a(Object obj, i3 i3Var2, WebViewActivity webViewActivity) {
                this.f$0.a((PayIap4Info) obj, i3Var2, webViewActivity);
            }
        });
    }

    public static Task a(boolean z, WebViewActivity webViewActivity, String str) {
        if (z) {
            IsEnvReadyReq isEnvReadyReq = new IsEnvReadyReq();
            isEnvReadyReq.setReservedInfor(g3.a("4.0"));
            return Iap.getIapClient((Activity) webViewActivity, str, true).isEnvReady(isEnvReadyReq);
        }
        return Iap.getIapClient((Activity) webViewActivity, str, true).isEnvReady();
    }

    public void b(ConnectionResult connectionResult) {
        a(connectionResult, this.h);
    }

    public final boolean a(VipOrderBean vipOrderBean, i3 i3Var, boolean z) {
        if (vipOrderBean == null) {
            a(i3Var, 30001, "创建订单失败 - vipOrderIAP4Bean is null");
            if (z) {
                k4.b(DensityUtil.getStringById(R.string.member_service_error));
            }
            return true;
        }
        if (TextUtils.equals(vipOrderBean.getResultcode(), String.valueOf(-101))) {
            a(i3Var, z);
            return true;
        }
        if (TextUtils.equals(vipOrderBean.getResultcode(), "00000") || TextUtils.equals(vipOrderBean.getResultcode(), "0")) {
            return false;
        }
        if (z) {
            a(IntegerUtils.a(vipOrderBean.getResultcode()));
        }
        a(i3Var, IntegerUtils.a(vipOrderBean.getResultcode()), "创建IAP4订单失败 - resultCode:" + vipOrderBean.getResultcode() + ",resultInfo:" + vipOrderBean.getResultinfo());
        return true;
    }

    public void b() {
        HwLog.i("HwWatchFacePayManager", "dismissPayVipDialog() enter.");
        BackgroundTaskUtils.postInMainThread(new Runnable() { // from class: com.huawei.watchface.i2$$ExternalSyntheticLambda19
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m();
            }
        });
    }

    public final void a(i3 i3Var, int i2, String str) {
        HwLog.e("HwWatchFacePayManager", "purchaseWithIAP4 error: " + str);
        if (i3Var != null) {
            i3Var.a(i2, null);
        }
        com.huawei.watchface.k.a(this.h, -1, str);
    }

    public static String a(Object obj) {
        if (obj instanceof PayIap4Info) {
            return ((PayIap4Info) obj).getApplicationId();
        }
        if (obj instanceof PayIap4InfoCn) {
            return ((PayIap4InfoCn) obj).getApplicationId();
        }
        return null;
    }

    public final void a(PayIap4Info payIap4Info, i3 i3Var, WebViewActivity webViewActivity) {
        if (payIap4Info == null || webViewActivity == null) {
            return;
        }
        this.p = i3Var;
        a(a(payIap4Info), webViewActivity, b(payIap4Info));
    }

    public final void a(PayIap4InfoCn payIap4InfoCn, i3 i3Var, WebViewActivity webViewActivity) {
        if (payIap4InfoCn == null || webViewActivity == null) {
            return;
        }
        this.p = i3Var;
        a(a(payIap4InfoCn), webViewActivity, b(payIap4InfoCn));
    }

    public final PurchaseIntentReq a(PayIap4Info payIap4Info) {
        PurchaseIntentReq purchaseIntentReq = new PurchaseIntentReq();
        purchaseIntentReq.setProductId(payIap4Info.getProductId());
        int iA = r2.a(payIap4Info.getPriceType(), 0);
        HwLog.i("HwWatchFacePayManager", "payVipByIAP4 priceType:" + iA);
        purchaseIntentReq.setPriceType(iA);
        purchaseIntentReq.setDeveloperPayload(GsonHelper.toJson(payIap4Info.getDeveloperPayload()));
        String json = GsonHelper.toJson(payIap4Info.getReservedInfor());
        FlavorConfig.safeHwLog("HwWatchFacePayManager", "payVipByIAP4 setReservedInFor:" + json);
        FlavorConfig.safeHwLog("HwWatchFacePayManager", "payVipByIAP4 setDeveloperPayload:" + GsonHelper.toJson(payIap4Info.getDeveloperPayload()));
        purchaseIntentReq.setReservedInfor(json);
        return purchaseIntentReq;
    }

    public final PurchaseIntentReq a(PayIap4InfoCn payIap4InfoCn) {
        PurchaseIntentReq purchaseIntentReq = new PurchaseIntentReq();
        purchaseIntentReq.setProductId(payIap4InfoCn.getProductId());
        int iA = r2.a(payIap4InfoCn.getType(), 0);
        HwLog.i("HwWatchFacePayManager", "payVipByIAP4 priceType:" + iA);
        purchaseIntentReq.setPriceType(iA);
        DeveloperPayloadIap4 developerPayloadIap4 = (DeveloperPayloadIap4) GsonHelper.fromJson(payIap4InfoCn.getDeveloperPayload(), DeveloperPayloadIap4.class);
        if (developerPayloadIap4 == null) {
            HwLog.e("HwWatchFacePayManager", "Failed to parse developerPayload");
            purchaseIntentReq.setDeveloperPayload(payIap4InfoCn.getDeveloperPayload());
        } else {
            purchaseIntentReq.setDeveloperPayload(GsonHelper.toJson(developerPayloadIap4));
        }
        String json = GsonHelper.toJson(payIap4InfoCn.getReservedInfor());
        FlavorConfig.safeHwLog("HwWatchFacePayManager", "payVipByIAP4Cn setReservedInFor:" + json);
        FlavorConfig.safeHwLog("HwWatchFacePayManager", "payVipByIAP4Cn setDeveloperPayload:" + payIap4InfoCn.getDeveloperPayload());
        purchaseIntentReq.setReservedInfor(json);
        return purchaseIntentReq;
    }

    public final void a(PurchaseIntentReq purchaseIntentReq, final WebViewActivity webViewActivity, String str) {
        Iap.getIapClient((Activity) webViewActivity, str, true).createPurchaseIntent(purchaseIntentReq).addOnSuccessListener(new OnSuccessListener() { // from class: com.huawei.watchface.i2$$ExternalSyntheticLambda7
            @Override // com.huawei.hmf.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                this.f$0.a(webViewActivity, (PurchaseIntentResult) obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: com.huawei.watchface.i2$$ExternalSyntheticLambda8
            @Override // com.huawei.hmf.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                this.f$0.b(exc);
            }
        });
    }

    public final /* synthetic */ void a(WebViewActivity webViewActivity, PurchaseIntentResult purchaseIntentResult) {
        Status status = purchaseIntentResult.getStatus();
        if (!status.hasResolution()) {
            HwLog.i("HwWatchFacePayManager", "payVipByIAP4 hasResolution false");
            return;
        }
        try {
            HwLog.i("HwWatchFacePayManager", "payVipByIAP4 : PayStatusCodes.PAY_STATE_SUCCESS, before starting payment activity for result..");
            status.startResolutionForResult(webViewActivity, 106);
        } catch (IntentSender.SendIntentException e2) {
            this.p.a(-1, null);
            HwLog.i("HwWatchFacePayManager", "payVipByIAP4 SendIntentException:" + HwLog.printException((Exception) e2));
        }
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void b(i3 i3Var, Exception exc) {
        if (exc instanceof IapApiException) {
            IapApiException iapApiException = (IapApiException) exc;
            int statusCode = iapApiException.getStatus().getStatusCode();
            String str = "status:" + iapApiException.getStatus() + " | errorMsg: " + iapApiException.getStatusMessage();
            HwLog.e("HwWatchFacePayManager", "handleEnvNotReady Exception:" + str);
            i3Var.a(statusCode, null);
            com.huawei.watchface.k.a(this.h, statusCode, "handleEnvNotReady exception:" + str);
            return;
        }
        i3Var.a(30006, null);
        HwLog.e("HwWatchFacePayManager", "handleEnvNotReady Exception:" + HwLog.printException(exc));
        com.huawei.watchface.k.a(this.h, 30006, "handleEnvNotReady exception:" + HwLog.printException(exc));
    }

    public final void a(Activity activity, BaseReq baseReq) {
        Task<PayResult> taskAddWithholdingPlan;
        com.huawei.watchface.k.d(this.h).a("isfullsdk", "true");
        if (this.f30210a == null) {
            HwLog.e("HwWatchFacePayManager", "payForSingleVip mOperateWatchFaceCallback is null");
            this.p.a(-1, null);
            com.huawei.watchface.k.a(this.h, -1, "fullsdk订单参数错误 - payForSingleVip mOperateWatchFaceCallback is null");
            return;
        }
        if (activity == null) {
            HwLog.e("HwWatchFacePayManager", "payForSingleVip -- activity is null");
            this.p.a(-1, null);
            com.huawei.watchface.k.a(this.h, -1, "fullsdk订单参数错误 - payForSingleVip activity is null");
            return;
        }
        HwLog.i("HwWatchFacePayManager", "payForSingleVip getPayClient start");
        PayClient payClient = Pay.getPayClient(activity);
        if (baseReq instanceof PayReq) {
            HwLog.i("HwWatchFacePayManager", "In PayReq");
            taskAddWithholdingPlan = payClient.pay((PayReq) baseReq);
        } else if (baseReq instanceof WithholdRequest) {
            HwLog.i("HwWatchFacePayManager", "In WithholdRequest");
            taskAddWithholdingPlan = payClient.addWithholdingPlan((WithholdRequest) baseReq);
        } else {
            taskAddWithholdingPlan = null;
        }
        if (taskAddWithholdingPlan == null) {
            HwLog.e("HwWatchFacePayManager", "payForSingleVip task is null.");
            this.p.a(-1, null);
            com.huawei.watchface.k.a(this.h, -1, "fullsdk订单参数错误 - payForSingleVip task is null.");
        } else {
            HwLog.i("HwWatchFacePayManager", "payForSingleVip getPayClient end");
            taskAddWithholdingPlan.addOnSuccessListener(new e((WebViewActivity) activity)).addOnFailureListener(new d());
        }
    }

    public final void a(String str, String str2, String str3) {
        OperateWatchFaceCallback operateWatchFaceCallback = this.f30210a;
        if (operateWatchFaceCallback != null) {
            operateWatchFaceCallback.transmitPayWatchFaceResult(str, str2, str3);
        }
        p();
    }

    public final void a(InstallWatchFaceBean installWatchFaceBean, String str, String str2) {
        WatchFaceSignBean watchFaceSignBeanA = WatchFaceHttpUtil.A();
        String productId = installWatchFaceBean.getProductId();
        if (watchFaceSignBeanA != null && !TextUtils.isEmpty(productId)) {
            String versionCode = installWatchFaceBean.getVersionCode();
            String price = installWatchFaceBean.getPrice();
            String showDialog = installWatchFaceBean.getShowDialog();
            HwLog.i("HwWatchFacePayManager", "getWatchFacePayInfo() showDialog is: " + showDialog);
            if ("0".equals(showDialog)) {
                p();
                com.huawei.watchface.k.a(this.d, -1, "提示表盘需要更新");
                b(productId, price, installWatchFaceBean.getSymbolType(), str2, versionCode);
                return;
            } else {
                if ("1".equals(showDialog)) {
                    b(productId, price, str2, versionCode);
                    return;
                }
                HwLog.w("HwWatchFacePayManager", "getWatchFacePayInfo() showDialog is unknown");
                com.huawei.watchface.k.a(str, -1, "H5参数错误");
                p();
                return;
            }
        }
        e(installWatchFaceBean);
    }

    public final boolean a(InstallWatchFaceBean installWatchFaceBean, String str) {
        if (HwWatchFaceApi.getInstance(this.f30211b).isLogin() && HwWatchFaceApi.getInstance(this.f30211b).isLoginParamSuitable()) {
            return false;
        }
        HwLog.i("HwWatchFacePayManager", "getWatchFacePayInfo() not login");
        OperateWatchFaceCallback operateWatchFaceCallback = this.f30210a;
        if (operateWatchFaceCallback != null) {
            h2.a(operateWatchFaceCallback.getCustomWebViewContext()).a(2, installWatchFaceBean);
        }
        p();
        com.huawei.watchface.k.a(str, -1, "华为账号未登录");
        return true;
    }

    public final boolean a(InstallWatchFaceBean installWatchFaceBean) {
        this.l = false;
        boolean zIsThreePay = installWatchFaceBean.isThreePay();
        HwLog.i("HwWatchFacePayManager", "getWatchFacePayInfo hasHms ==" + this.k + " ,isThreePay =" + zIsThreePay);
        if (zIsThreePay) {
            if (!this.k) {
                HwLog.i("HwWatchFacePayManager", "getWatchFacePayInfo isThreePay hasHms is false ");
                this.l = true;
            }
        } else if (!this.k) {
            HwLog.i("HwWatchFacePayManager", "getWatchFacePayInfo showInstallHmsTip ");
            a(false);
            return true;
        }
        HwLog.i("HwWatchFacePayManager", "getWatchFacePayInfo hasHms ==" + this.k + " ,isThreePay =" + zIsThreePay + " ,isFullsdk =" + this.l);
        return false;
    }

    public final void a() {
        this.k = true;
        if (p0.l()) {
            if (CommonUtils.a(this.f30211b)) {
                return;
            }
            HwLog.w("HwWatchFacePayManager", "getWatchFacePayInfo() isNewHonor.");
            this.k = false;
            return;
        }
        if (HwWatchFaceApi.getInstance(this.f30211b).isHmsLiteEnable()) {
            HwLog.w("HwWatchFacePayManager", "getWatchFacePayInfo() isHmsLiteEnable.");
            this.k = false;
        }
    }

    public final /* synthetic */ void a(WebViewActivity webViewActivity, PayResult payResult) {
        a(payResult, webViewActivity, 103);
    }

    public final /* synthetic */ void a(Exception exc) {
        HwLog.i("HwWatchFacePayManager", "doFullSdkWatchFacePay onFailure: " + HwLog.printException(exc));
        p();
        com.huawei.watchface.k.a(this.d, -1, "fullsdk拉起支付失败 error:" + HwLog.printException(exc));
    }

    public void a(boolean z) {
        if (!z) {
            p();
        }
        OperateWatchFaceCallback operateWatchFaceCallback = this.f30210a;
        if (operateWatchFaceCallback == null) {
            HwLog.w("HwWatchFacePayManager", "showInstallHmsTip() mOperateWatchFaceCallback is null");
            return;
        }
        Context customWebViewContext = operateWatchFaceCallback.getCustomWebViewContext();
        if (!(customWebViewContext instanceof Activity)) {
            HwLog.w("HwWatchFacePayManager", "showInstallHmsTip() context error");
        } else {
            ((Activity) customWebViewContext).runOnUiThread(new f(z, customWebViewContext));
        }
    }

    public final void a(Context context, final Activity activity) {
        OperateWatchFaceCallback operateWatchFaceCallback = this.f30210a;
        if (operateWatchFaceCallback == null) {
            return;
        }
        Context customWebViewContext = operateWatchFaceCallback.getCustomWebViewContext();
        if (!(customWebViewContext instanceof Activity)) {
            HwLog.w("HwWatchFacePayManager", "obtainToken() context error");
        } else {
            final com.huawei.watchface.a aVar = new com.huawei.watchface.a((Activity) customWebViewContext);
            aVar.a(context, new g(this, aVar), new HuaweiApiClient.OnConnectionFailedListener() { // from class: com.huawei.watchface.i2$$ExternalSyntheticLambda2
                @Override // com.huawei.hms.api.HuaweiApiClient.OnConnectionFailedListener
                public final void onConnectionFailed(ConnectionResult connectionResult) {
                    i2.a(aVar, activity, connectionResult);
                }
            });
        }
    }

    public static /* synthetic */ void a(com.huawei.watchface.a aVar, Activity activity, ConnectionResult connectionResult) {
        aVar.a();
        HwLog.i("HwWatchFacePayManager", "obtainToken() onConnectionFailed, ErrorCode: " + connectionResult.getErrorCode());
        if (activity == null) {
            HwLog.i("HwWatchFacePayManager", "obtainToken() activity is null, return! ");
            return;
        }
        int errorCode = connectionResult.getErrorCode();
        if (errorCode == 6) {
            k4.a(R.string.IDS_watchface_pay_failed);
        }
        HuaweiApiAvailability huaweiApiAvailability = HuaweiApiAvailability.getInstance();
        if (huaweiApiAvailability.isUserResolvableError(errorCode)) {
            HwLog.i("HwWatchFacePayManager", "obtainToken() availability.isUserResolvableError(errorCode):true ");
            huaweiApiAvailability.resolveError(activity, errorCode, 2000);
        }
    }

    public final void a(final String str, final String str2, final String str3, final String str4, final String str5) {
        OperateWatchFaceCallback operateWatchFaceCallback = this.f30210a;
        if (operateWatchFaceCallback == null) {
            HwLog.w("HwWatchFacePayManager", "getWatchFacePayInfo mOperateWatchFaceCallback is null");
            return;
        }
        final Context customWebViewContext = operateWatchFaceCallback.getCustomWebViewContext();
        if (!(customWebViewContext instanceof Activity)) {
            HwLog.w("HwWatchFacePayManager", "showNoTitleCustomAlertDialog context error");
        } else {
            ((Activity) customWebViewContext).runOnUiThread(new Runnable() { // from class: com.huawei.watchface.i2$$ExternalSyntheticLambda15
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.a(customWebViewContext, str3, str, str2, str4, str5);
                }
            });
        }
    }

    public final /* synthetic */ void a(Context context, String str, final String str2, final String str3, final String str4, final String str5) {
        z2.a aVar = new z2.a(context);
        aVar.a(str).a(R.string.cancel, new View.OnClickListener() { // from class: com.huawei.watchface.i2$$ExternalSyntheticLambda20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.a(view);
            }
        }).b(R.string.buy_now, new View.OnClickListener() { // from class: com.huawei.watchface.i2$$ExternalSyntheticLambda21
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.a(str2, str3, str4, str5, view);
            }
        });
        z2 z2VarA = aVar.a();
        this.n = z2VarA;
        if (z2VarA.isShowing() || ((Activity) context).isFinishing()) {
            return;
        }
        HwLog.i("HwWatchFacePayManager", "showNoTitleCustomAlertDialog start show");
        this.n.show();
    }

    public final /* synthetic */ void a(View view) {
        HwLog.i("HwWatchFacePayManager", "showNoTitleCustomAlertDialog click cancel");
        this.n.dismiss();
    }

    public final /* synthetic */ void a(String str, String str2, String str3, String str4, View view) {
        HwLog.i("HwWatchFacePayManager", "showNoTitleCustomAlertDialog click pay");
        b(str, str2, str3, str4);
    }

    public final /* synthetic */ void a(String str, String str2, String str3, String str4) {
        if (this.l) {
            String strA = g3.a("2.0");
            this.j = strA;
            if (TextUtils.isEmpty(strA)) {
                HwLog.i("HwWatchFacePayManager", "mReservedInfor empty ");
                a(false);
                return;
            }
        } else {
            this.j = "";
        }
        HitopReqOrderBatchCreateThread hitopReqOrderBatchCreateThread = new HitopReqOrderBatchCreateThread(str, str2, str3, this.j, str4);
        WatchFaceOrderBean watchFaceOrderBeanB = hitopReqOrderBatchCreateThread.b(hitopReqOrderBatchCreateThread.e());
        if (watchFaceOrderBeanB == null) {
            HwLog.e("HwWatchFacePayManager", "baseResp is empty ");
            return;
        }
        boolean zEquals = "0".equals(watchFaceOrderBeanB.getResultCode());
        HwLog.i("HwWatchFacePayManager", "isSuccess === " + zEquals + " ,resultCode == " + watchFaceOrderBeanB.getResultCode());
        com.huawei.watchface.k.d(this.d).a("orderRequestTraceid", hitopReqOrderBatchCreateThread.f()).a("createOrderCode", watchFaceOrderBeanB.getResultCode()).a(ParsedFieldTag.PRICE, str2).a("couponid", str3).a("productId", str).a("createOrderResult", watchFaceOrderBeanB.getResultInfo());
        if (watchFaceOrderBeanB.getRequestParams() != null) {
            com.huawei.watchface.k.d(this.d).f(watchFaceOrderBeanB.getRequestParams().getProductName());
        }
        if (zEquals) {
            this.m = watchFaceOrderBeanB;
            HwLog.i("HwWatchFacePayManager", "startWatchFaceBatchPayThread: mWatchFaceOrderBean is not null ");
            this.f = this.m.getTradeId();
            this.i = this.m.mCouponId;
            c(str);
            try {
                double dA = r2.a(str2, 0.0d);
                HwLog.i("HwWatchFacePayManager", "amountStr : " + str2);
                boolean z = Double.compare(dA, 0.0d) == 0;
                HwLog.i("HwWatchFacePayManager", "isPayFree: " + z);
                if (z) {
                    a("0", "");
                    p();
                    com.huawei.watchface.k.d(this.d).a("isPayFree", "true");
                    com.huawei.watchface.k.a(this.d, 0, null);
                    return;
                }
            } catch (NumberFormatException e2) {
                HwLog.i("HwWatchFacePayManager", "buyProduct : " + HwLog.printException((Exception) e2));
            }
            this.m = watchFaceOrderBeanB;
            HwLog.i("HwWatchFacePayManager", "startWatchFaceBatchPayThread: mWatchFaceOrderBean is not null ");
            this.f = this.m.getTradeId();
            com.huawei.watchface.k.d(this.d).a("tradeId", this.f).a("payRequestId", watchFaceOrderBeanB.getRequestParams().getRequestId());
            HwLog.i("HwWatchFacePayManager", "success about to selectWatchFacePay: ");
            o();
            return;
        }
        OperateWatchFaceCallback operateWatchFaceCallback = this.f30210a;
        if (operateWatchFaceCallback != null) {
            operateWatchFaceCallback.transmitPayWatchFaceResult(this.d, this.e, "orderProduct_" + watchFaceOrderBeanB.getResultCode());
        }
        HwLog.i("HwWatchFacePayManager", "fail about to transmitFinishPay: ");
        com.huawei.watchface.k.a(this.d, -1, "接口生成订单失败 - resultCode:" + watchFaceOrderBeanB.getResultCode() + ",resultInfo:" + watchFaceOrderBeanB.getResultInfo());
        p();
    }

    public final void a(PayResult payResult, WebViewActivity webViewActivity, int i2) {
        if (payResult == null) {
            HwLog.w("HwWatchFacePayManager", "doWatchFacePay payResult is null");
            com.huawei.watchface.k.a(this.d, -1, "拉起支付页面参数异常 - doWatchFacePay payResult is null");
            p();
            return;
        }
        Status status = payResult.getStatus();
        HwLog.i("HwWatchFacePayManager", "applyIssueOrderCallback, apply status :" + status);
        if (status.getStatusCode() == 0 && this.f30211b != null) {
            try {
                status.startResolutionForResult(webViewActivity, i2);
                return;
            } catch (IntentSender.SendIntentException e2) {
                HwLog.e("HwWatchFacePayManager", "doWatchFacePay SendIntentException");
                p();
                com.huawei.watchface.k.a(this.d, -1, "拉起支付页面异常 error:" + e2.getMessage());
                return;
            }
        }
        p();
        com.huawei.watchface.k.a(this.d, -1, "拉起支付失败，错误码：" + status.getStatusCode() + ",msg:" + status.getStatusMessage());
    }

    public final PayReq a(WatchFaceOrderBean watchFaceOrderBean) {
        Double dValueOf;
        HwLog.i("HwWatchFacePayManager", "makePayReq enter ");
        PayReq payReq = new PayReq();
        payReq.productName = String.valueOf(watchFaceOrderBean.getRequestParams().getProductName());
        payReq.productDesc = String.valueOf(watchFaceOrderBean.getRequestParams().getProductDescription());
        payReq.merchantId = String.valueOf(watchFaceOrderBean.getRequestParams().getMerchantId());
        payReq.applicationID = String.valueOf(watchFaceOrderBean.getRequestParams().getApplicationId());
        String strValueOf = String.valueOf(watchFaceOrderBean.getRequestParams().getAmount());
        payReq.amount = strValueOf;
        if (!TextUtils.isEmpty(strValueOf)) {
            try {
                dValueOf = Double.valueOf(payReq.amount);
            } catch (NumberFormatException unused) {
                HwLog.e("HwWatchFacePayManager", "makePayReq NumberFormatException");
                dValueOf = null;
            }
            payReq.amount = String.format(Locale.ENGLISH, "%.2f", dValueOf);
        }
        payReq.country = String.valueOf(watchFaceOrderBean.getRequestParams().getCountry());
        payReq.requestId = String.valueOf(watchFaceOrderBean.getRequestParams().getRequestId());
        payReq.url = String.valueOf(watchFaceOrderBean.getRequestParams().getUrl());
        payReq.urlVer = String.valueOf(watchFaceOrderBean.getRequestParams().getUrlVersion());
        payReq.merchantName = String.valueOf(watchFaceOrderBean.getRequestParams().getMerchantName());
        payReq.sdkChannel = 0;
        payReq.serviceCatalog = String.valueOf(watchFaceOrderBean.getRequestParams().getServiceCatalog());
        payReq.sign = watchFaceOrderBean.getPaySign();
        if (!TextUtils.isEmpty(watchFaceOrderBean.getRequestParams().getCurrency())) {
            payReq.currency = watchFaceOrderBean.getRequestParams().getCurrency();
        }
        String strA = a(watchFaceOrderBean.mCouponId);
        if (!TextUtils.isEmpty(strA)) {
            payReq.extReserved = strA;
        }
        if (!TextUtils.isEmpty(watchFaceOrderBean.mReservedInfor)) {
            payReq.reservedInfor = watchFaceOrderBean.mReservedInfor;
        }
        return payReq;
    }

    public String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("couponId", str);
        } catch (JSONException e2) {
            HwLog.i("HwWatchFacePayManager", "generateExtReservedParam error : " + HwLog.printException((Exception) e2));
        }
        return jSONObject.toString();
    }

    public void a(String str, String str2) {
        OperateWatchFaceCallback operateWatchFaceCallback = this.f30210a;
        if (operateWatchFaceCallback != null) {
            operateWatchFaceCallback.transmitPayWatchFaceResult(this.d, this.e, str);
        }
        HwLog.i("HwWatchFacePayManager", "start upload pay result");
        BackgroundTaskUtils.submit(new i(str, str2));
        if (String.valueOf(0).equals(str)) {
            j2.g().e(this.d, this.e);
        }
    }

    public final /* synthetic */ void a(MarketH5Bean marketH5Bean, MagicJsPayResult magicJsPayResult, i3 i3Var, boolean z) {
        GetVipProductInfoThread getVipProductInfoThread = new GetVipProductInfoThread(marketH5Bean.getProductId());
        VipPackageBean vipPackageBeanB = getVipProductInfoThread.b(getVipProductInfoThread.c(""));
        if (!TextUtils.isEmpty(marketH5Bean.getExtendInfo())) {
            vipPackageBeanB.setMagicExtendInfo(marketH5Bean.getExtendInfo());
        }
        magicJsPayResult.copyInfo(vipPackageBeanB);
        a(marketH5Bean, vipPackageBeanB, i3Var, z);
    }

    public final void a(VipPayInfoCoupons vipPayInfoCoupons, VipPackageBean vipPackageBean, v4 v4Var, i3 i3Var, boolean z) {
        VipOrderBean vipOrderBeanB;
        boolean zL = l();
        HwLog.i("HwWatchFacePayManager", "goToPayVipIAP4 needAccountInfo:" + zL);
        if (zL) {
            this.j = g3.a("4.0");
        } else {
            this.j = g3.a("2.0");
        }
        vipPayInfoCoupons.copyInfo(vipPackageBean);
        this.i = vipPayInfoCoupons.getCouponId();
        if (a(vipPackageBean)) {
            vipOrderBeanB = new VipOrderBean();
            vipOrderBeanB.setResultcode(String.valueOf(-101));
            HwLog.i("HwWatchFacePayManager", "getVipOrderBean checkNeedBuy false");
        } else {
            y0 y0Var = new y0(vipPayInfoCoupons, this.j);
            y0Var.d(vipPayInfoCoupons.getSign());
            y0Var.c(vipPayInfoCoupons.getDeviceModel());
            vipOrderBeanB = y0Var.b(y0Var.h());
        }
        if (v4Var != null) {
            v4Var.a(vipOrderBeanB, vipPayInfoCoupons);
        }
        if (vipOrderBeanB != null) {
            this.f = vipOrderBeanB.getTradeId() != null ? vipOrderBeanB.getTradeId() : "";
        }
        b(zL, vipOrderBeanB, i3Var, z);
    }

    public void a(final MarketH5Bean marketH5Bean, final MagicJsPayResult magicJsPayResult, final i3 i3Var) {
        HwLog.i("HwWatchFacePayManager", "payMagicVipIap4 payReq enter");
        if (marketH5Bean != null && !TextUtils.isEmpty(marketH5Bean.getProductId())) {
            BackgroundTaskUtils.submit(new Runnable() { // from class: com.huawei.watchface.i2$$ExternalSyntheticLambda13
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.a(marketH5Bean, i3Var, magicJsPayResult);
                }
            });
        } else {
            HwLog.e("HwWatchFacePayManager", "payMagicVipIap4 productId is null");
            i3Var.a(30001, null);
        }
    }

    public final /* synthetic */ void a(MarketH5Bean marketH5Bean, i3 i3Var, MagicJsPayResult magicJsPayResult) {
        try {
            GetVipProductInfoIAP4Thread getVipProductInfoIAP4Thread = new GetVipProductInfoIAP4Thread(marketH5Bean.getProductId());
            VipPackageIAP4Bean vipPackageIAP4BeanB = getVipProductInfoIAP4Thread.b(getVipProductInfoIAP4Thread.c(""));
            if (vipPackageIAP4BeanB == null) {
                HwLog.e("HwWatchFacePayManager", "payMagicVipIap4 vipPackageBean is null");
                i3Var.a(30001, null);
                k4.b(DensityUtil.getStringById(R.string.membership_not_exist));
                return;
            }
            if (!TextUtils.isEmpty(marketH5Bean.getExtendInfo())) {
                vipPackageIAP4BeanB.setMagicExtendInfo(marketH5Bean.getExtendInfo());
            }
            magicJsPayResult.copyInfo(vipPackageIAP4BeanB);
            String productCode = vipPackageIAP4BeanB.getProductCode();
            this.h = productCode;
            com.huawei.watchface.k.a(productCode, vipPackageIAP4BeanB);
            VipPayInfoCoupons vipPayInfoCoupons = new VipPayInfoCoupons();
            vipPayInfoCoupons.setProductCode(marketH5Bean.getProductId());
            a(vipPayInfoCoupons, (VipPackageBean) vipPackageIAP4BeanB, i3Var, (v4) null, true);
        } catch (Exception e2) {
            HwLog.e("HwWatchFacePayManager", "payMagicVipIap4 exception: " + HwLog.printException(e2));
            i3Var.a(30099, null);
        }
    }

    public final /* synthetic */ void a(VipPayInfoCoupons vipPayInfoCoupons, boolean z, v4 v4Var, i3 i3Var) {
        GetVipProductInfoThread getVipProductInfoThread = new GetVipProductInfoThread(vipPayInfoCoupons.getProductCode());
        getVipProductInfoThread.e(vipPayInfoCoupons.getSign());
        getVipProductInfoThread.d(vipPayInfoCoupons.getDeviceModel());
        VipPackageBean vipPackageBeanB = getVipProductInfoThread.b(getVipProductInfoThread.c(""));
        if (z) {
            a(vipPayInfoCoupons, vipPackageBeanB, v4Var, i3Var, false);
        } else {
            a(vipPayInfoCoupons, vipPackageBeanB, i3Var, v4Var);
        }
    }

    public void a(final VipPayInfoCoupons vipPayInfoCoupons, final i3 i3Var, final v4 v4Var, boolean z) {
        HwLog.i("HwWatchFacePayManager", "payCombination payReq enter");
        if (TextUtils.isEmpty(vipPayInfoCoupons.getProductCode())) {
            HwLog.e("HwWatchFacePayManager", "payCombination productCode is null");
            i3Var.a(30001, null);
        } else {
            BackgroundTaskUtils.submit(new Runnable() { // from class: com.huawei.watchface.i2$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.a(vipPayInfoCoupons, v4Var, i3Var);
                }
            });
        }
    }

    public final /* synthetic */ void a(VipPayInfoCoupons vipPayInfoCoupons, v4 v4Var, i3 i3Var) {
        boolean zL = l();
        HwLog.i("HwWatchFacePayManager", "payCombination needAccountInfo:" + zL);
        if (zL) {
            this.j = g3.a("4.0");
        } else {
            this.j = g3.a("2.0");
        }
        this.i = vipPayInfoCoupons.getCouponId();
        x0 x0Var = new x0(vipPayInfoCoupons, this.j);
        x0Var.d(vipPayInfoCoupons.getSign());
        x0Var.c(vipPayInfoCoupons.getDeviceModel());
        VipOrderBean vipOrderBeanB = x0Var.b(x0Var.h());
        if (v4Var != null) {
            v4Var.a(vipOrderBeanB, vipPayInfoCoupons);
        }
        if (vipOrderBeanB != null) {
            this.f = vipOrderBeanB.getTradeId() != null ? vipOrderBeanB.getTradeId() : "";
        }
        b(zL, vipOrderBeanB, i3Var, false);
    }

    public final /* synthetic */ void a(VipPayInfoCoupons vipPayInfoCoupons, i3 i3Var, v4 v4Var) {
        GetVipProductInfoIAP4Thread getVipProductInfoIAP4Thread = new GetVipProductInfoIAP4Thread(vipPayInfoCoupons.getProductCode());
        getVipProductInfoIAP4Thread.e(vipPayInfoCoupons.getSign());
        getVipProductInfoIAP4Thread.d(vipPayInfoCoupons.getDeviceModel());
        a(vipPayInfoCoupons, (VipPackageBean) getVipProductInfoIAP4Thread.b(getVipProductInfoIAP4Thread.c("")), i3Var, v4Var, false);
    }

    public final void a(MarketH5Bean marketH5Bean, VipPackageBean vipPackageBean, i3 i3Var, boolean z) {
        if (vipPackageBean == null) {
            HwLog.e("HwWatchFacePayManager", "goToPay vipPackageBean is null");
            i3Var.a(30001, null);
            k4.b(DensityUtil.getStringById(R.string.membership_not_exist));
            return;
        }
        String productCode = vipPackageBean.getProductCode();
        this.h = productCode;
        com.huawei.watchface.k.a(productCode, vipPackageBean);
        if (!TextUtils.isEmpty(vipPackageBean.getDiscountPrice())) {
            if (CommonUtils.g(vipPackageBean.getDiscountPrice())) {
                HwLog.i("HwWatchFacePayManager", "goToPay discount price is zero");
                a(vipPackageBean, i3Var, z);
                return;
            }
        } else if (CommonUtils.g(vipPackageBean.getPrice())) {
            HwLog.i("HwWatchFacePayManager", "goToPay price is zero");
            a(vipPackageBean, i3Var, z);
            return;
        }
        e1 e1Var = new e1(vipPackageBean.getProductCode());
        CouponsByproductBean couponsByproductBeanB = e1Var.b(e1Var.c(""));
        if (couponsByproductBeanB == null) {
            HwLog.i("HwWatchFacePayManager", "couponsByproductBean is null");
            a(vipPackageBean, i3Var, z);
            return;
        }
        if (!TextUtils.equals("0", couponsByproductBeanB.getResultcode())) {
            HwLog.i("HwWatchFacePayManager", "couponsByproductBean get Result code is not 0 resultCode：" + couponsByproductBeanB.getResultcode());
            a(vipPackageBean, i3Var, z);
            return;
        }
        if (couponsByproductBeanB.getCouponAndPrice() != null && !couponsByproductBeanB.getCouponAndPrice().isEmpty()) {
            String vipCouponsUrl = HwWatchFaceApi.getInstance(this.f30211b).getVipCouponsUrl(TextUtils.isEmpty(marketH5Bean.getFrom()) ? "campaign.h5.1005" : marketH5Bean.getFrom(), TextUtils.isEmpty(marketH5Bean.getFromSub()) ? "aop" : marketH5Bean.getFromSub());
            this.s = couponsByproductBeanB;
            this.q = vipPackageBean;
            this.t = i3Var;
            com.huawei.watchface.k.d(this.h).a("showH5Coupons", "true");
            a(WebViewActivity.getActivity(), vipCouponsUrl);
            return;
        }
        HwLog.i("HwWatchFacePayManager", "couponsByproductBean couponAndPrice is empty");
        a(vipPackageBean, i3Var, z);
    }

    public final void a(VipPackageBean vipPackageBean, i3 i3Var, boolean z) {
        if (z) {
            VipPayInfoCoupons vipPayInfoCoupons = new VipPayInfoCoupons();
            vipPayInfoCoupons.setOrderChannel(DetailedCreativeType.LONG_TEXT);
            a(vipPayInfoCoupons, vipPackageBean, (v4) null, i3Var, true);
        } else {
            this.j = g3.a("2.0");
            a(b(vipPackageBean), i3Var, (String) null, true);
        }
    }

    public static boolean a(VipPackageBean vipPackageBean) {
        if (vipPackageBean != null) {
            return TextUtils.equals("1", vipPackageBean.getPromotionPackage()) && HwWatchFaceApi.getInstance(Environment.getApplicationContext()).getDeviceConnectState() != 1;
        }
        HwLog.i("HwWatchFacePayManager", "checkNeedBuy vipPackageBean is null");
        return true;
    }

    public void a(CouponsByproductBean.CouponAndPrice couponAndPrice, boolean z) {
        if (couponAndPrice == null) {
            HwLog.i("HwWatchFacePayManager", "goToPayVipByCoupon couponAndPrice is null");
            a(this.q, this.t, z);
            return;
        }
        this.j = g3.a("2.0");
        VipPayInfoCoupons vipPayInfoCoupons = new VipPayInfoCoupons();
        vipPayInfoCoupons.copyInfo(this.q);
        vipPayInfoCoupons.setCouponId(couponAndPrice.getCouponMap() != null ? couponAndPrice.getCouponMap().getCouponId() : "");
        vipPayInfoCoupons.setOrderChannel(DetailedCreativeType.LONG_TEXT);
        vipPayInfoCoupons.setReportedPrice(couponAndPrice.getRealPrice());
        if (!TextUtils.isEmpty(this.q.getRelProductCode())) {
            vipPayInfoCoupons.setOrderType("2");
        } else {
            vipPayInfoCoupons.setOrderType("1");
        }
        com.huawei.watchface.k.d(this.h).a("couponId", vipPayInfoCoupons.getCouponId());
        i3 i3Var = this.t;
        if (i3Var == null) {
            HwLog.i("HwWatchFacePayManager", "mCouponsPayResultListener is null");
            return;
        }
        if (z) {
            a(vipPayInfoCoupons, this.q, (v4) null, i3Var, false);
            return;
        }
        VipOrderBean vipOrderBeanB = b((VipPackageBean) vipPayInfoCoupons);
        if (vipOrderBeanB != null) {
            this.f = vipOrderBeanB.getPayInfo() != null ? ((PayInfo) vipOrderBeanB.getPayInfo()).getRequestId() : "";
        }
        a(vipOrderBeanB, this.t, vipPayInfoCoupons.getCouponId(), true);
    }

    public final void a(VipPayInfoCoupons vipPayInfoCoupons, VipPackageBean vipPackageBean, i3 i3Var, v4 v4Var) {
        this.j = g3.a("2.0");
        vipPayInfoCoupons.copyInfo(vipPackageBean);
        VipOrderBean vipOrderBeanB = b((VipPackageBean) vipPayInfoCoupons);
        if (v4Var != null) {
            v4Var.a(vipOrderBeanB, vipPayInfoCoupons);
        }
        if (vipOrderBeanB != null) {
            this.f = vipOrderBeanB.getPayInfo() != null ? ((PayInfo) vipOrderBeanB.getPayInfo()).getRequestId() : "";
        }
        this.r = vipPayInfoCoupons;
        if (vipOrderBeanB != null && vipOrderBeanB.getPayInfo() != null) {
            this.r.setProductName(((PayInfo) vipOrderBeanB.getPayInfo()).getProductName());
        }
        a(vipOrderBeanB, i3Var, vipPayInfoCoupons.getCouponId(), false);
    }

    public final void a(VipPayInfoCoupons vipPayInfoCoupons, VipPackageBean vipPackageBean, i3 i3Var, v4 v4Var, boolean z) {
        boolean zL = l();
        HwLog.i("HwWatchFacePayManager", "goToPayVipIAP4 needAccountInfo:" + zL);
        if (zL) {
            this.j = g3.a("4.0");
        } else {
            this.j = g3.a("2.0");
        }
        vipPayInfoCoupons.copyInfo(vipPackageBean);
        z0 z0Var = new z0(vipPayInfoCoupons, this.j);
        z0Var.d(vipPayInfoCoupons.getSign());
        z0Var.c(vipPayInfoCoupons.getDeviceModel());
        VipOrderBean vipOrderBeanB = z0Var.b(z0Var.g());
        if (v4Var != null) {
            v4Var.a(vipOrderBeanB, vipPayInfoCoupons);
        }
        if (vipOrderBeanB != null && vipOrderBeanB.getPayInfo() != null) {
            this.f = ((PayIap4Info) vipOrderBeanB.getPayInfo()).getProductId() != null ? ((PayIap4Info) vipOrderBeanB.getPayInfo()).getProductId() : "";
        }
        a(zL, vipOrderBeanB, i3Var, z);
    }

    public final void a(VipOrderBean vipOrderBean, i3 i3Var, String str, boolean z) {
        HwLog.i("HwWatchFacePayManager", "goToPayVip isFromMagic:" + z);
        this.i = str;
        if (vipOrderBean == null) {
            a(i3Var, "vipOrderBean is null");
            return;
        }
        String resultcode = vipOrderBean.getResultcode();
        HwLog.i("HwWatchFacePayManager", "goToPayVip resultCode:" + resultcode);
        if (resultcode == null) {
            a(i3Var, "resultCode is null");
            return;
        }
        if (TextUtils.equals(resultcode, String.valueOf(-101))) {
            a(i3Var, z);
            return;
        }
        if (!TextUtils.equals(vipOrderBean.getResultcode(), "00000")) {
            a(i3Var, z, resultcode, vipOrderBean.getResultinfo());
            return;
        }
        PayInfo payInfo = (PayInfo) vipOrderBean.getPayInfo();
        if (payInfo == null) {
            a(i3Var);
            return;
        }
        com.huawei.watchface.k.d(this.h).a(HwPayConstant.KEY_AMOUNT, payInfo.getAmount());
        VipPayInfo vipPayInfoA = a(payInfo);
        if (vipPayInfoA == null) {
            a(i3Var);
        } else if (CommonUtils.g(payInfo.getAmount())) {
            a(i3Var, payInfo);
        } else {
            a(vipPayInfoA, i3Var, z);
        }
    }

    public final void a(i3 i3Var, String str) {
        HwLog.e("HwWatchFacePayManager", "Invalid order reason is " + str);
        i3Var.a(30001, null);
        com.huawei.watchface.k.a(this.h, -1, "创建订单失败 - " + str);
    }

    public final void a(i3 i3Var, boolean z) {
        HwLog.i("HwWatchFacePayManager", "handlePromotionPackageError device is not connect");
        i3Var.a(30001, null);
        if (z) {
            a(-101);
        }
        com.huawei.watchface.k.a(this.h, -1, "创建订单失败 - resultCode: -101, resultInfo: 设备未连接");
    }

    public final void a(i3 i3Var, boolean z, String str, String str2) {
        if (z) {
            a(IntegerUtils.getInteger(str, -1));
        }
        i3Var.a(IntegerUtils.getInteger(str, -1), null);
        com.huawei.watchface.k.a(this.h, -1, "创建订单失败 - resultCode: " + str + ", resultInfo: " + str2);
    }

    public final void a(i3 i3Var) {
        HwLog.e("HwWatchFacePayManager", "payInfo is null");
        i3Var.a(30001, null);
        k4.b(DensityUtil.getStringById(R.string.membership_not_exist));
        com.huawei.watchface.k.a(this.h, -1, "创建订单失败 - payInfo is null");
    }

    public final VipPayInfo a(PayInfo payInfo) {
        try {
            return (VipPayInfo) GsonHelper.fromJson(GsonHelper.toJson(payInfo), VipPayInfo.class);
        } catch (Exception e2) {
            HwLog.e("HwWatchFacePayManager", "Failed to convert PayInfo to VipPayInfo Exception:" + HwLog.printException(e2));
            return null;
        }
    }

    public final void a(i3 i3Var, PayInfo payInfo) {
        HwLog.i("HwWatchFacePayManager", "Payment amount is zero");
        j2.g().n();
        PayResultInfo payResultInfo = new PayResultInfo();
        payResultInfo.setReturnCode(0);
        payResultInfo.setAmount(payInfo.getAmount());
        i3Var.a(payResultInfo.getReturnCode(), payResultInfo);
        com.huawei.watchface.k.a(this.h, 0, "创建成功");
    }

    public final void a(VipPayInfo vipPayInfo, i3 i3Var, boolean z) {
        try {
            a(!f4.b(vipPayInfo.getTradeType()) ? vipPayInfo.getWithholdRequest(vipPayInfo) : vipPayInfo.getPayInfoReq(vipPayInfo), i3Var, z);
        } catch (Exception e2) {
            HwLog.e("HwWatchFacePayManager", "Payment processing failed Exception：" + HwLog.printException(e2));
            k4.b(DensityUtil.getStringById(R.string.member_service_error));
            com.huawei.watchface.k.a(this.h, -1, "会员服务出错: " + e2.getMessage());
        }
    }

    public final void a(int i2) {
        if (i2 != -101) {
            if (i2 != 14000) {
                if (i2 == 14003) {
                    k4.b(DensityUtil.getStringById(R.string.vip_member_years));
                    return;
                }
                if (i2 != 14020) {
                    if (i2 != 14031) {
                        if (i2 == 131013) {
                            k4.b(DensityUtil.getStringById(R.string.vip_purchase_limit));
                            return;
                        } else if (i2 != 14044) {
                            if (i2 != 14045) {
                                k4.b(DensityUtil.getStringById(R.string.member_service_error));
                                return;
                            } else {
                                k4.b(DensityUtil.getStringById(R.string.watch_device_not_support));
                                return;
                            }
                        }
                    }
                    k4.b(DensityUtil.getStringById(R.string.watch_member_plunder_over));
                    return;
                }
            }
            k4.b(DensityUtil.getStringById(R.string.member_takeshelf_tips));
            return;
        }
        k4.b(DensityUtil.getStringById(R.string.watch_disconnect_tips));
    }

    public final void a(ConnectionResult connectionResult, String str) {
        if (connectionResult != null) {
            com.huawei.watchface.k.d(str).a("hmsConnectErrorCode", String.valueOf(connectionResult.getErrorCode())).a("hmsConnectErrorMsg", String.valueOf(connectionResult.getErrorMessage()));
        }
        com.huawei.watchface.k.a(str, 30001, "Hms建连失败");
    }

    public void a(Context context, String str) {
        HwLog.i("HwWatchFacePayManager", "showPayVipDialog() enter.");
        try {
            if (context == null) {
                HwLog.i("HwWatchFacePayManager", "context is null");
                return;
            }
            if (this.o == null) {
                this.o = new BottomVipPayDialogFragment(context);
            }
            if (!(context instanceof FragmentActivity)) {
                HwLog.i("HwWatchFacePayManager", "context is not FragmentActivity");
                return;
            }
            FragmentActivity fragmentActivity = (FragmentActivity) context;
            if (fragmentActivity.isFinishing()) {
                HwLog.i("HwWatchFacePayManager", "activity isFinishing");
                return;
            }
            this.o.b(str);
            if (this.o.isVisible()) {
                HwLog.i("HwWatchFacePayManager", "bottomVipPayDialogFragment  is visible");
                return;
            }
            if (this.o.isAdded()) {
                HwLog.i("HwWatchFacePayManager", "bottomVipPayDialogFragment is added");
                return;
            }
            FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
            if (supportFragmentManager == null) {
                HwLog.i("HwWatchFacePayManager", "bottomVipPayDialogFragment supportFragmentManager is null");
            } else if (supportFragmentManager.findFragmentByTag("fragmentPayDialogTag") == null) {
                this.o.show(supportFragmentManager, "fragmentPayDialogTag");
            } else {
                HwLog.i("HwWatchFacePayManager", "bottomVipPayDialogFragment fragmentByTag is not null");
            }
        } catch (Exception e2) {
            HwLog.e("HwWatchFacePayManager", "showPayVipDialog  Exception:" + HwLog.printException(e2));
        }
    }
}
