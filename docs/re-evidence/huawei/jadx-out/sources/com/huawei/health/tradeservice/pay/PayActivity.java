package com.huawei.health.tradeservice.pay;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.router.AppRouter;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.device.model.RecordAction;
import com.huawei.health.marketing.utils.MarketingBiUtils;
import com.huawei.health.tradeservice.R;
import com.huawei.health.tradeservice.cloud.OrderCreateRsp;
import com.huawei.health.tradeservice.cloud.OrderManager;
import com.huawei.health.tradeservice.cloud.PromotionInfoRsp;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hmf.tasks.OnFailureListener;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hmf.tasks.Task;
import com.huawei.hms.iap.Iap;
import com.huawei.hms.iap.IapApiException;
import com.huawei.hms.iap.entity.OrderStatusCode;
import com.huawei.hms.iap.entity.ProductInfoReq;
import com.huawei.hms.iap.entity.ProductInfoResult;
import com.huawei.hms.iap.entity.PurchaseIntentReq;
import com.huawei.hms.iap.entity.PurchaseIntentResult;
import com.huawei.hms.iap.entity.PurchaseResultInfo;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.huaweilogin.HuaweiLoginManager;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import com.huawei.operation.utils.OperationUtilsApi;
import com.huawei.trade.datatype.PayRequest;
import com.huawei.trade.datatype.Product;
import com.huawei.trade.datatype.ProductInfo;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.dialog.CustomAlertDialog;
import com.huawei.ui.commonui.progressbar.HealthProgressBar;
import defpackage.ddv;
import defpackage.ilq;
import defpackage.ilw;
import defpackage.ily;
import defpackage.iov;
import defpackage.lmf;
import defpackage.lsp;
import defpackage.njy;
import defpackage.qsp;
import defpackage.xka;
import health.compact.a.CommonLibUtil;
import health.compact.a.CommonUtil;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes32.dex */
public class PayActivity extends BaseActivity {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ArrayList<Integer> f10267c = new ArrayList<Integer>() { // from class: com.huawei.health.tradeservice.pay.PayActivity.4
        {
            add(0);
            add(1);
            add(2);
        }
    };
    private ProductInfo ac;
    private LinearLayout af;
    private Context h;
    private String q;
    private String r;
    private HealthProgressBar w;
    private final Handler t = new d(Looper.getMainLooper(), this);
    private IPayEnvCheckCallback v = new e(this);
    private HashMap<String, String> aj = new HashMap<>(0);
    private String ae = null;
    private String y = null;
    private CountDownLatch g = null;
    private CustomAlertDialog ai = null;
    private int f = 0;
    private String ab = null;
    private int p = 0;
    private String x = null;
    private String u = "";
    private String ad = "";
    private String aa = "";
    private String n = "";
    private String s = "";
    private String l = "";
    private String o = "";
    private String ag = "";
    private String e = "";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ArrayList<String> f10268a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f10269b = "";
    private String k = "";
    private String j = "";
    private String am = "";
    private String an = "";
    private String ah = "";
    private String d = "";
    private String z = "";
    private int i = 0;
    private int m = 0;

    private void a(ilq ilqVar, final IBaseResponseCallback iBaseResponseCallback) {
        String strE;
        LogUtil.a("R_PayActivity", "OrderRequest = " + ilqVar.toString());
        PurchaseIntentReq purchaseIntentReq = new PurchaseIntentReq();
        purchaseIntentReq.setProductId(ilqVar.e());
        purchaseIntentReq.setPriceType(ilqVar.d());
        purchaseIntentReq.setDeveloperPayload(ilqVar.c());
        purchaseIntentReq.setSignatureAlgorithm("SHA256WithRSA/PSS");
        ReservedInfor reservedInforB = ilqVar.b();
        if (reservedInforB != null) {
            if (!g()) {
                strE = "";
            } else {
                strE = ily.e();
            }
            if (!TextUtils.isEmpty(strE)) {
                LogUtil.a("R_PayActivity", "setAccountInfo");
                reservedInforB.setAccountInfo(strE);
            }
            purchaseIntentReq.setReservedInfor(ilqVar.b().toString());
            ReleaseLogUtil.d("R_PayActivity", "allready set ReservedInfor = ", purchaseIntentReq.getReservedInfor());
        }
        d("iapCreateRequestOrder", c(purchaseIntentReq));
        Task<PurchaseIntentResult> taskCreatePurchaseIntent = Iap.getIapClient((Activity) this, ily.b()).createPurchaseIntent(purchaseIntentReq);
        if (taskCreatePurchaseIntent == null) {
            ReleaseLogUtil.a("R_PayActivity", "requestOrder create task failed!!");
            iBaseResponseCallback.a(1007, null);
        } else {
            taskCreatePurchaseIntent.addOnSuccessListener(new OnSuccessListener<PurchaseIntentResult>() { // from class: com.huawei.health.tradeservice.pay.PayActivity.6
                @Override // com.huawei.hmf.tasks.OnSuccessListener
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public void onSuccess(PurchaseIntentResult purchaseIntentResult) {
                    iBaseResponseCallback.a(0, purchaseIntentResult);
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: com.huawei.health.tradeservice.pay.PayActivity.8
                @Override // com.huawei.hmf.tasks.OnFailureListener
                public void onFailure(Exception exc) {
                    if (exc instanceof IapApiException) {
                        IapApiException iapApiException = (IapApiException) exc;
                        Status status = iapApiException.getStatus();
                        ReleaseLogUtil.a("R_PayActivity", "requestOrder createPurchaseIntent returnCode = " + iapApiException.getStatusCode() + ", status = " + status);
                    } else {
                        LogUtil.e("R_PayActivity", "requestOrder Exception： " + exc.getClass().getSimpleName());
                    }
                    iBaseResponseCallback.a(1007, null);
                }
            });
        }
    }

    private boolean g() {
        if (xka.c()) {
            LogUtil.a("R_PayActivity", "isNeedAccountInfo isClosedWebCash");
            return false;
        }
        if (CommonUtil.bw()) {
            LogUtil.a("R_PayActivity", "payBy full-sdk model=", Build.MODEL.toLowerCase());
            return Build.VERSION.SDK_INT > 27;
        }
        if (CommonUtil.z(this.h)) {
            return Build.VERSION.SDK_INT > 27;
        }
        if (CommonUtil.be()) {
            return false;
        }
        LogUtil.a("R_PayActivity", "isNeedAccountInfo hms unAvailable");
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <T> int a(T t) {
        if (!(t instanceof PurchaseIntentResult)) {
            LogUtil.e("R_PayActivity", "requestPay purchaseResult dont instanceof PurchaseIntentResult");
            return 1000;
        }
        Status status = ((PurchaseIntentResult) t).getStatus();
        if (status == null) {
            LogUtil.e("R_PayActivity", "status is null !!!");
            return 1000;
        }
        if (!status.hasResolution()) {
            return 1006;
        }
        try {
            status.startResolutionForResult(this, 6666);
            this.af.setVisibility(8);
            return 0;
        } catch (IntentSender.SendIntentException unused) {
            LogUtil.e("R_PayActivity", "startResolutionForResult failed !!!");
            return 1006;
        } catch (AndroidRuntimeException unused2) {
            LogUtil.e("R_PayActivity", "requestPay AndroidRuntimeException");
            return 1006;
        }
    }

    private int e(Intent intent) {
        PurchaseResultInfo purchaseResultInfoFromIntent = Iap.getIapClient((Activity) this, ily.b()).parsePurchaseResultInfoFromIntent(intent);
        if (purchaseResultInfoFromIntent == null) {
            ReleaseLogUtil.a("R_PayActivity", "checkPayResult purchaseResultInfo is null");
            return 1003;
        }
        ReleaseLogUtil.d("R_PayActivity", "purchaseResultInfo.getReturnCode: ", Integer.valueOf(purchaseResultInfoFromIntent.getReturnCode()));
        int returnCode = purchaseResultInfoFromIntent.getReturnCode();
        if (returnCode != -1) {
            if (returnCode != 0) {
                switch (returnCode) {
                    case 60000:
                        return 1008;
                    case OrderStatusCode.ORDER_STATE_CALLS_FREQUENT /* 60004 */:
                        LogUtil.e("R_PayActivity", "ORDER_STATE_CALLS_FREQUENT, maybe try later");
                        return 1013;
                    case OrderStatusCode.ORDER_PRODUCT_OWNED /* 60051 */:
                        break;
                    case OrderStatusCode.ORDER_ACCOUNT_AREA_NOT_SUPPORTED /* 60054 */:
                        LogUtil.e("R_PayActivity", "ORDER_ACCOUNT_AREA_NOT_SUPPORTED, maybe try later");
                        return 1010;
                    default:
                        LogUtil.e("R_PayActivity", "purchaseResultInfo.getReturnCode: " + purchaseResultInfoFromIntent.getReturnCode());
                        return 1003;
                }
            } else {
                this.r = purchaseResultInfoFromIntent.getInAppPurchaseData();
                this.q = purchaseResultInfoFromIntent.getInAppDataSignature();
                return 0;
            }
        }
        ilw.c().e("");
        return 1009;
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.h = this;
        setContentView(R.layout.layout_inprocess);
        getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        this.af = (LinearLayout) qsp.a(this, R.id.hw_trade_loading_layout);
        HealthProgressBar healthProgressBar = (HealthProgressBar) qsp.a(this, R.id.hw_trade_loading_view);
        this.w = healthProgressBar;
        healthProgressBar.setLayerType(1, null);
        Intent intent = getIntent();
        if (intent == null) {
            LogUtil.e("R_PayActivity", "transaction abort, getIntent is null");
            a(1003);
            return;
        }
        if (!CommonUtil.ab(this.h)) {
            LogUtil.e("R_PayActivity", "transaction abort, No Network.");
            a(1005);
            return;
        }
        boolean zIsModuleOperatedToOversea = ((OperationUtilsApi) Services.b("PluginOperation", OperationUtilsApi.class)).isModuleOperatedToOversea("ai-vip-oversea-001");
        boolean zEquals = LoginInit.getInstance(this.h).getAccountInfo(1010).equals(LoginInit.getInstance(this.h).getAccountInfo(1014));
        if (zIsModuleOperatedToOversea && !zEquals) {
            LogUtil.e("R_PayActivity", "PayActivity abort, this is a vip, but country code do not match service Country code.");
            a(1016);
        } else {
            this.af.setVisibility(0);
            b(intent);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (intent == null) {
            LogUtil.e("R_PayActivity", "onNewIntent intent is null !!");
            a(1003);
        } else {
            this.af.setVisibility(0);
            b(intent);
        }
    }

    private void b(final Intent intent) {
        ThreadPoolManager.c().b("R_PayActivity", new Runnable() { // from class: com.huawei.health.tradeservice.pay.PayActivity.10
            @Override // java.lang.Runnable
            public void run() {
                PayActivity.this.c(intent);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Intent intent) {
        this.aj.clear();
        String stringExtra = intent.getStringExtra("payRequest");
        this.y = stringExtra;
        if (!TextUtils.isEmpty(stringExtra)) {
            LogUtil.a("R_PayActivity", "extracting info from payRequest...");
            PayRequest payRequest = (PayRequest) HiJsonUtil.d(this.y, PayRequest.class);
            this.ae = payRequest.getActivityPath();
            this.u = payRequest.getProductId();
            this.ad = payRequest.getPurchasePolicy();
        } else {
            LogUtil.a("R_PayActivity", "extracting info from ProductInfo...");
            String stringExtra2 = intent.getStringExtra("productInfo");
            this.ab = stringExtra2;
            LogUtil.a("R_PayActivity", "mProductInfoStr = ", stringExtra2);
            try {
                ProductInfo productInfo = (ProductInfo) new Gson().fromJson(this.ab, ProductInfo.class);
                this.ac = productInfo;
                if (productInfo == null) {
                    return;
                }
                this.u = productInfo.getProductId();
                this.ad = String.valueOf(this.ac.getPurchasePolicy());
                this.aa = this.ac.getPromotionId();
                this.n = this.ac.getDeviceSn();
                this.s = this.ac.getDeviceUdid();
                this.l = this.ac.getDeviceType();
                this.o = this.ac.getDeviceNumber();
                this.ag = this.ac.getSalt();
                this.e = this.ac.getCertChain();
                this.f10268a = this.ac.getCertChainList();
                this.f10269b = this.ac.getCertChainType();
                this.k = this.ac.getDevicePerfPurchaseId();
                this.j = this.ac.getClientVersion();
                this.am = this.ac.getTrigResType();
                this.an = this.ac.getTrigResName();
                this.ah = this.ac.getTrigResMemberPrice();
                this.d = this.ac.getAreaInfo();
                this.p = this.ac.getLinkType();
                this.x = this.ac.getLinkValue();
                this.z = this.ac.getPromotionPolicyId();
                this.i = this.ac.getDeviceCategory();
                this.m = this.ac.getDeviceSnType();
            } catch (JsonSyntaxException unused) {
                LogUtil.e("R_PayActivity", "parse (JsonSyntaxException");
                return;
            }
        }
        a();
    }

    private boolean h() {
        if (TextUtils.isEmpty(this.ad)) {
            LogUtil.e("R_PayActivity", "transaction abort, purchasePolicy is null...");
            c(1008, (Object) null);
            return false;
        }
        if (TextUtils.isEmpty(this.u)) {
            LogUtil.e("R_PayActivity", "transaction abort, productId is null...");
            c(1008, (Object) null);
            return false;
        }
        if (!this.ad.equals(String.valueOf(Product.SUBSCRIPTION_PURCHASE_FLAG)) || LoginInit.getInstance(this.h).isAccountConsistent()) {
            return true;
        }
        LogUtil.e("R_PayActivity", "buy subscription, account isn't consistent");
        c(1011, (Object) null);
        return false;
    }

    private void k() {
        this.aj.put("productId", this.u);
        this.aj.put("purchasePolicy", this.ad);
        if (!TextUtils.isEmpty(this.aa)) {
            this.aj.put("promotionId", this.aa);
        }
        if (!TextUtils.isEmpty(this.n)) {
            this.aj.put("deviceSN", this.n);
        }
        if (!TextUtils.isEmpty(this.s)) {
            this.aj.put("udid", this.s);
        }
        if (!TextUtils.isEmpty(this.l)) {
            this.aj.put("deviceType", this.l);
        }
        if (!TextUtils.isEmpty(this.o)) {
            this.aj.put("deviceNumber", this.o);
        }
        if (!TextUtils.isEmpty(this.ag)) {
            this.aj.put("salt", this.ag);
        }
        if (!TextUtils.isEmpty(this.e)) {
            this.aj.put("certChain", this.e);
        }
        if (!TextUtils.isEmpty(this.f10269b)) {
            this.aj.put("certChainType", this.f10269b);
        }
        if (!TextUtils.isEmpty(this.k)) {
            this.aj.put("devicePerfPurchaseId", this.k);
        }
        if (!TextUtils.isEmpty(this.j)) {
            this.aj.put("clientVersion", this.j);
        }
        if (!TextUtils.isEmpty(this.am)) {
            this.aj.put("trigResType", this.am);
        }
        if (!TextUtils.isEmpty(this.ah)) {
            this.aj.put("trigResMemberPrice", this.ah);
        }
        if (!TextUtils.isEmpty(this.an)) {
            this.aj.put("trigResName", this.an);
        }
        if (!TextUtils.isEmpty(this.d)) {
            this.aj.put("areaInfo", this.d);
        }
        if (!TextUtils.isEmpty(this.z)) {
            this.aj.put("promotionPolicyId", this.z);
        }
        int i = this.i;
        if (i != 0) {
            this.aj.put("deviceCategory", String.valueOf(i));
        }
        int i2 = this.m;
        if (i2 != 0) {
            this.aj.put("snType", String.valueOf(i2));
        }
    }

    private void a() {
        if (!h()) {
            LogUtil.e("R_PayActivity", "isCheckItemOk transaction abort, parameters is null...");
            return;
        }
        k();
        this.g = new CountDownLatch(1);
        LogUtil.a("R_PayActivity", "transaction params checked, shopping start... mProductId: ", this.u, ", mPurchasePolicy:", this.ad);
        c();
        try {
            this.g.await();
        } catch (InterruptedException unused) {
            LogUtil.j("R_PayActivity", "shopping InterruptedException");
        }
        LogUtil.a("R_PayActivity", "shopping end: mProductId = ", this.u, " mPurchasePolicy = ", this.ad);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        LogUtil.a("R_PayActivity", "pay callback by iap.");
        super.onActivityResult(i, i2, intent);
        if (i == 6666) {
            this.af.setVisibility(0);
            if (intent == null) {
                LogUtil.j("R_PayActivity", "onActivityResult data is null");
                c(1002, (Object) null);
                return;
            }
            int iE = e(intent);
            if (iE == 0 || iE == 1008) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 1003;
                messageObtain.arg1 = iE;
                this.t.sendMessage(messageObtain);
                return;
            }
            if (iE == 1013) {
                Message messageObtain2 = Message.obtain();
                messageObtain2.what = 1009;
                messageObtain2.arg1 = iE;
                this.t.sendMessage(messageObtain2);
                return;
            }
            c(1002, (Object) null);
            return;
        }
        ReleaseLogUtil.e("R_PayActivity", "onActivityResult Unexpected requestCode = " + i);
        c(1008, (Object) null);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        Handler handler = this.t;
        if (handler != null) {
            handler.removeMessages(1000);
            this.t.removeMessages(1005);
        }
        e();
        this.v.release();
        ThreadPoolManager.c().c("R_PayActivity", null);
        super.onDestroy();
    }

    static class d extends BaseHandler<PayActivity> {
        private d(Looper looper, PayActivity payActivity) {
            super(looper, payActivity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(PayActivity payActivity, Message message) {
            if (message == null || payActivity == null) {
                LogUtil.j("R_PayActivity", "handleMessageWhenReferenceNotNull activity or message is null.");
                return;
            }
            ReleaseLogUtil.d("R_PayActivity", "handleMessage message = ", Integer.valueOf(message.what));
            int i = message.what;
            if (i != 2003) {
                switch (i) {
                    case 1000:
                        payActivity.e(message.obj);
                        break;
                    case 1001:
                    case 1004:
                        payActivity.c(1003);
                        payActivity.a(1010);
                        break;
                    case 1002:
                        payActivity.c(1007);
                        payActivity.a(1010);
                        break;
                    case 1003:
                        LogUtil.a("R_PayActivity", "start MSG_NOTIFY_CLOUD.");
                        payActivity.e(message.arg1);
                        break;
                    case 1005:
                        d(payActivity);
                        break;
                    case 1006:
                        payActivity.a(1002);
                        break;
                    case 1007:
                        payActivity.b();
                        payActivity.c(1007);
                        payActivity.a(1010);
                        break;
                    default:
                        switch (i) {
                            case 1009:
                                break;
                            case 1010:
                                payActivity.a(1015);
                                break;
                            case 1011:
                                payActivity.a(1017);
                                break;
                            default:
                                LogUtil.j("R_PayActivity", "Unknown msg = " + message.what);
                                payActivity.a(1003);
                                break;
                        }
                        break;
                }
                return;
            }
            payActivity.a(message.arg1);
        }

        private void d(PayActivity payActivity) {
            if (CommonUtil.z(payActivity.h)) {
                if (HuaweiLoginManager.checkIsInstallHuaweiAccount(payActivity.h)) {
                    if (LoginInit.getInstance(payActivity.h).getIsLogined()) {
                        payActivity.a(1014);
                        return;
                    } else {
                        LogUtil.a("R_PayActivity", "not login, browsingToLogin.");
                        LoginInit.getInstance(payActivity.h).browsingToLogin(new C0080d(payActivity), null);
                        return;
                    }
                }
                payActivity.a(1001);
                return;
            }
            LoginInit.getInstance(payActivity.h).browsingToLogin(new C0080d(payActivity), null);
        }

        /* JADX INFO: renamed from: com.huawei.health.tradeservice.pay.PayActivity$d$d, reason: collision with other inner class name */
        static class C0080d implements IBaseResponseCallback {
            private WeakReference<PayActivity> e;

            C0080d(PayActivity payActivity) {
                this.e = new WeakReference<>(payActivity);
            }

            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                PayActivity payActivity = this.e.get();
                if (payActivity == null) {
                    LogUtil.j("R_PayActivity", "LoginedCallback activity is null");
                } else if (i == 0) {
                    payActivity.c();
                } else {
                    payActivity.a(1001);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        final String str = this.aj.get("productId");
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(this.aj.get("purchasePolicy"))) {
            LogUtil.e("R_PayActivity", "checkProductInfo：param error!!");
            return;
        }
        try {
            final int i = Integer.parseInt(this.aj.get("purchasePolicy"));
            ProductInfoReq productInfoReq = new ProductInfoReq();
            productInfoReq.setProductIds(new ArrayList<String>(str) { // from class: com.huawei.health.tradeservice.pay.PayActivity.7

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ String f10282c;

                {
                    this.f10282c = str;
                    add(str);
                }
            });
            productInfoReq.setPriceType(i);
            Task<ProductInfoResult> taskObtainProductInfo = Iap.getIapClient((Activity) this, ily.b()).obtainProductInfo(productInfoReq);
            if (taskObtainProductInfo == null) {
                LogUtil.e("R_PayActivity", "checkProductInfo：obtainProductInfo task failed!!");
            } else {
                taskObtainProductInfo.addOnSuccessListener(new OnSuccessListener<ProductInfoResult>() { // from class: com.huawei.health.tradeservice.pay.PayActivity.12
                    @Override // com.huawei.hmf.tasks.OnSuccessListener
                    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                    public void onSuccess(ProductInfoResult productInfoResult) {
                        if (PayActivity.this.c(productInfoResult, str, i)) {
                            return;
                        }
                        LogUtil.e("R_PayActivity", "checkProductInfo：The product = " + str + " is not configured on the IAP !!!");
                    }
                }).addOnFailureListener(new OnFailureListener() { // from class: com.huawei.health.tradeservice.pay.PayActivity.15
                    @Override // com.huawei.hmf.tasks.OnFailureListener
                    public void onFailure(Exception exc) {
                        LogUtil.e("R_PayActivity", "checkProductInfo：Exception： " + exc.getClass().getSimpleName() + "The product = " + str);
                    }
                });
            }
        } catch (NumberFormatException unused) {
            LogUtil.e("R_PayActivity", "checkProductInfo：NumberFormatException!!");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c(ProductInfoResult productInfoResult, String str, int i) {
        if (productInfoResult != null && productInfoResult.getProductInfoList() != null) {
            List<com.huawei.hms.iap.entity.ProductInfo> productInfoList = productInfoResult.getProductInfoList();
            if (productInfoList.size() <= 0) {
                return false;
            }
            for (com.huawei.hms.iap.entity.ProductInfo productInfo : productInfoList) {
                if (str.equals(productInfo.getProductId()) && i == productInfo.getPriceType()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(final int i) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.health.tradeservice.pay.PayActivity.13
            @Override // java.lang.Runnable
            public void run() {
                PayActivity.this.d(i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i) {
        if (i == 0) {
            OrderManager.orderReportPurchaseResult(this.aj.get("orderCode"), this.r, this.q, new IBaseResponseCallback() { // from class: com.huawei.health.tradeservice.pay.PayActivity.11
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i2, Object obj) {
                    LogUtil.j("R_PayActivity", "orderReportPurchaseResult errorCode = " + i2);
                }
            });
            f();
            d("notifyCloudInnerParams", c(this.aj.get("orderCode"), this.r, this.q));
        } else if (i == 1008) {
            OrderManager.orderCancel(this.aj.get("orderCode"), new IBaseResponseCallback() { // from class: com.huawei.health.tradeservice.pay.PayActivity.5
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i2, Object obj) {
                    LogUtil.j("R_PayActivity", "orderCancel errorCode = " + i2);
                }
            });
        } else {
            LogUtil.j("R_PayActivity", "unknown notifyMsg = " + i);
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = 2003;
        messageObtain.arg1 = i;
        this.t.sendMessage(messageObtain);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i) {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("resultCode", String.valueOf(i));
        HashMap<String, String> map = this.aj;
        if (map != null && map.containsKey("purchasePolicy")) {
            linkedHashMap.put("productType", this.aj.get("purchasePolicy"));
        }
        OpAnalyticsUtil.getInstance().setEvent2nd(OperationKey.HEALTH_APP_TRADE_80070001.value(), linkedHashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        CountDownLatch countDownLatch = this.g;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
        if (i != 1010) {
            c(i);
        }
        if (i != 0) {
            LogUtil.e("R_PayActivity", "exitPay with shoppingResult = " + i);
        }
        if (TextUtils.isEmpty(this.ae)) {
            Intent intent = new Intent();
            intent.putExtra("shoppingResult", i);
            if (i == 0) {
                intent.putExtra("orderCode", this.aj.get("orderCode"));
            }
            int i2 = this.f;
            if (i2 == 3040022 || i2 == 3130014 || i2 == 3130012) {
                intent.putExtra("shoppingResult", i2);
            }
            setResult(-1, intent);
            if (i == 1017) {
                this.af.setVisibility(8);
                m();
                return;
            } else if (i != 0 && i != 1008 && i != 1001 && i != 1015) {
                this.af.setVisibility(8);
                if (b(i)) {
                    return;
                }
            }
        } else {
            Bundle bundle = new Bundle();
            bundle.putInt("shoppingResult", i);
            bundle.putString("payRequest", this.y);
            if (i == 0) {
                bundle.putString("orderCode", this.aj.get("orderCode"));
            }
            AppRouter.c(this.ae).d(bundle).d(268435456).b(this.h);
        }
        if (i == 0 && !TextUtils.isEmpty(this.x) && this.p != 0) {
            j();
        }
        finish();
    }

    private void m() {
        CustomAlertDialog.Builder builderD = new CustomAlertDialog.Builder(this.h).a(View.inflate(this.h, R.layout.dialog_account_error, null)).d(R.string.IDS_relogin, new DialogInterface.OnClickListener() { // from class: ilo
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.f37783b.e(dialogInterface, i);
            }
        });
        if (CommonUtil.j(LoginInit.getInstance(this.h).getAccountInfo(1009)) == 7) {
            builderD.a(R.string.IDS_cancel_button, new DialogInterface.OnClickListener() { // from class: ilp
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    this.f37784b.d(dialogInterface, i);
                }
            });
        } else {
            builderD.a(R.string.IDS_cancel_button, R.color.textColorSecondary, new DialogInterface.OnClickListener() { // from class: ilv
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    this.f37788c.a(dialogInterface, i);
                }
            });
        }
        CustomAlertDialog customAlertDialogB = builderD.b();
        customAlertDialogB.setCancelable(false);
        customAlertDialogB.show();
    }

    public /* synthetic */ void e(DialogInterface dialogInterface, int i) {
        LoginInit.getInstance(this.h).logoutWhenTokenInvalid(new IBaseResponseCallback() { // from class: ils
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i2, Object obj) {
                CommonLibUtil.d(BaseApplication.getContext());
            }
        });
    }

    public /* synthetic */ void d(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        finish();
    }

    public /* synthetic */ void a(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        finish();
    }

    private void j() {
        Bundle bundle = new Bundle();
        int i = this.p;
        if (i != 1) {
            if (i == 2) {
                bundle.putString("productInfo", this.ab);
                bundle.putString("orderCode", this.aj.get("orderCode"));
                AppRouter.e(Uri.parse(this.x)).d(bundle).d(268435456).b(this);
                return;
            }
            LogUtil.j("R_PayActivity", "jumpByLinkValue error linkType");
            return;
        }
        bundle.putString("url", this.x);
        bundle.putString("productInfo", this.ab);
        bundle.putString("orderCode", this.aj.get("orderCode"));
        Intent intentCreateWebViewIntent = ddv.b().createWebViewIntent(this.h, bundle, null);
        if (intentCreateWebViewIntent != null) {
            iov.d(this.h, intentCreateWebViewIntent);
            LogUtil.a("R_PayActivity", "jumpByLinkValue jump to webviewActivity");
        } else {
            LogUtil.j("R_PayActivity", "jumpByLinkValue h5 intent is null");
        }
    }

    static class e implements IPayEnvCheckCallback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private WeakReference<PayActivity> f10284b;

        public e(PayActivity payActivity) {
            this.f10284b = new WeakReference<>(payActivity);
        }

        @Override // com.huawei.health.tradeservice.pay.IPayEnvCheckCallback
        public void release() {
            LogUtil.a("R_PayActivity", "PayEnvCheckCallback release");
        }

        @Override // com.huawei.health.tradeservice.pay.IPayEnvCheckCallback
        public void onResponse(int i) {
            PayActivity payActivity = this.f10284b.get();
            ReleaseLogUtil.d("R_PayActivity", "onResponse retCode:", Integer.valueOf(i));
            OpAnalyticsUtil.getInstance().setProbabilityProblemEvent("PayEnvCheckCallback", String.valueOf(i));
            if (payActivity == null) {
                LogUtil.j("R_PayActivity", "PayActivity is null, PayEnvCheckCallback skip onResponse");
                return;
            }
            if (i == 0) {
                payActivity.d();
                return;
            }
            if (i == 1015) {
                LogUtil.j("R_PayActivity", "user cancel updating hms core");
                payActivity.c(1010, (Object) null);
            } else if (i == 1001) {
                LogUtil.j("R_PayActivity", "don't login, on browser");
                payActivity.c(1005, (Object) null);
            } else if (i != 1002) {
                payActivity.c(1002, (Object) null);
            } else {
                LogUtil.j("R_PayActivity", "out of service location");
                payActivity.c(1006, (Object) null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        HashMap<String, String> map = this.aj;
        if (map == null || map.size() <= 0) {
            LogUtil.e("R_PayActivity", "mResourceInfo is null, leave buyProduct");
            c(1004, (Object) null);
        } else {
            boolean zG = g();
            LogUtil.a("R_PayActivity", "isNeedAccountInfo:", Boolean.valueOf(zG));
            OpAnalyticsUtil.getInstance().setProbabilityProblemEvent("checkPayEnv", String.valueOf(zG));
            ily.e(this, zG, this.v);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        final HashMap map = new HashMap();
        map.putAll(this.aj);
        if (!njy.e(this.f10268a)) {
            map.put("certChainList", this.f10268a);
        }
        LogUtil.a("R_PayActivity", "createOrder productInfo trigResType ", map.get("trigResType"), " trigResName ", map.get("trigResName"), " trigResMemberPrice ", map.get("trigResMemberPrice"), " areaInfo ", map.get("areaInfo"));
        OrderManager.orderCreate((String) map.get("productId"), map, new IBaseResponseCallback() { // from class: com.huawei.health.tradeservice.pay.PayActivity.1
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                LogUtil.a("R_PayActivity", "orderCreate code: ", Integer.valueOf(i));
                if (i != 0 && i != 3040046) {
                    PayActivity.this.f = i;
                    PayActivity.this.c(1001, (Object) null);
                    return;
                }
                if (obj instanceof OrderCreateRsp) {
                    PayActivity.this.d("setOrderCreateOpEvent", obj.toString());
                    OrderCreateRsp orderCreateRsp = (OrderCreateRsp) obj;
                    int resultCode = orderCreateRsp.getResultCode();
                    if (resultCode != 0 && resultCode != 3040046) {
                        LogUtil.j("R_PayActivity", "orderCreate: health cloud create order failed = " + resultCode + " " + orderCreateRsp.getResultDesc());
                        PayActivity.this.c(1001, (Object) null);
                        return;
                    }
                    if (TextUtils.isEmpty(orderCreateRsp.getOrderCode())) {
                        LogUtil.j("R_PayActivity", "orderCreate: health cloud return orderCode is null !!");
                    } else {
                        map.put("orderCode", orderCreateRsp.getOrderCode());
                        PayActivity.this.aj.put("orderCode", orderCreateRsp.getOrderCode());
                    }
                    if (!TextUtils.isEmpty(orderCreateRsp.getPurchaseExtension())) {
                        LogUtil.a("R_PayActivity", "getPurchaseExtension(): ", orderCreateRsp.getPurchaseExtension(), "getPurchaseExtensionSignature(): ", orderCreateRsp.getPurchaseExtensionSignature());
                        map.put("purchaseExtension", orderCreateRsp.getPurchaseExtension());
                        map.put("purchaseExtensionSignature", orderCreateRsp.getPurchaseExtensionSignature());
                    }
                    PayActivity.this.c(map);
                    return;
                }
                LogUtil.j("R_PayActivity", "orderCreate: cloud return data error");
                PayActivity.this.c(1001, (Object) null);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(final Map<String, Object> map) {
        if (!map.containsKey("promotionId")) {
            LogUtil.a("R_PayActivity", "getPromotionInfo: no promotion id");
            d(map);
            return;
        }
        if (!String.valueOf(2).equals(map.get("purchasePolicy"))) {
            LogUtil.a("R_PayActivity", "getPromotionInfo: non subscription product");
            d(map);
        } else {
            OrderManager.promotionInfoQuery((String) map.get("productId"), (String) map.get("promotionId"), (String) map.get("promotionPolicyId"), new IBaseResponseCallback() { // from class: com.huawei.health.tradeservice.pay.PayActivity.2
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    if (!(obj instanceof PromotionInfoRsp)) {
                        LogUtil.j("R_PayActivity", "failed !! promotionInfoQuery errorCode = " + i);
                        PayActivity.this.c(1001, (Object) null);
                        return;
                    }
                    PromotionInfoRsp promotionInfoRsp = (PromotionInfoRsp) obj;
                    if (promotionInfoRsp.getResultCode() != 0) {
                        LogUtil.j("R_PayActivity", "getPromotionInfo: promotionInfoQuery failed! = " + promotionInfoRsp.getResultCode());
                        PayActivity.this.c(1001, (Object) null);
                        return;
                    }
                    if (!TextUtils.isEmpty(promotionInfoRsp.getPurchaseDiscountInfo())) {
                        LogUtil.a("R_PayActivity", "promotionInfoRsp.getPurchaseDiscountInfo(): ", promotionInfoRsp.getPurchaseDiscountInfo(), "; DiscountSignature = ", promotionInfoRsp.getPurchaseDiscountSignature());
                        PayActivity payActivity = PayActivity.this;
                        payActivity.d("promotionInfoQueryData", payActivity.b(promotionInfoRsp));
                        map.put("purchaseDiscountInfo", promotionInfoRsp.getPurchaseDiscountInfo());
                        map.put("purchaseDiscountSignature", promotionInfoRsp.getPurchaseDiscountSignature());
                    } else {
                        LogUtil.j("R_PayActivity", "getPromotionInfo: PURCHASE_DISCOUNT_INFO is null");
                    }
                    PayActivity.this.d((Map<String, Object>) map);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Map<String, Object> map) {
        ilq ilqVar = new ilq();
        if (map.containsKey("orderCode")) {
            LogUtil.a("R_PayActivity", "iapOrderCreate AppPayLoad = ", map.get("orderCode"));
            ilqVar.c((String) map.get("orderCode"));
        }
        ilqVar.d((String) map.get("productId"));
        try {
            int i = Integer.parseInt((String) map.get("purchasePolicy"));
            if (!f10267c.contains(Integer.valueOf(i))) {
                LogUtil.j("R_PayActivity", "purChasePolicy error, the value is  " + i);
                c(1001, (Object) null);
                return;
            }
            if (i != 2 && !map.containsKey("orderCode")) {
                LogUtil.j("R_PayActivity", "Non-subscription product need OrderCode !!!");
                c(1001, (Object) null);
            } else {
                ilqVar.c(i);
                b(map, ilqVar);
                a(ilqVar, new IBaseResponseCallback() { // from class: com.huawei.health.tradeservice.pay.PayActivity.3
                    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                    /* JADX INFO: renamed from: onResponse */
                    public void a(int i2, Object obj) {
                        LogUtil.a("R_PayActivity", "iapOrderCreate return");
                        if (i2 == 0) {
                            PayActivity.this.c(1000, obj);
                        } else {
                            PayActivity.this.c(1007, (Object) null);
                        }
                    }
                });
            }
        } catch (NumberFormatException unused) {
            LogUtil.e("R_PayActivity", "NumberFormatException purChasePolicy = " + map.get("purchasePolicy"));
            c(1004, (Object) null);
        }
    }

    private void b(Map<String, Object> map, ilq ilqVar) {
        ReservedInfor reservedInfor = new ReservedInfor();
        if (map.containsKey("purchaseExtension")) {
            OrderPurchaseExtensionInformation orderPurchaseExtensionInformation = new OrderPurchaseExtensionInformation();
            orderPurchaseExtensionInformation.setPurchaseExtension((String) map.get("purchaseExtension"));
            orderPurchaseExtensionInformation.setPurchaseExtensionSignature((String) map.get("purchaseExtensionSignature"));
            reservedInfor.setOrderPurchaseExtensionInformation(orderPurchaseExtensionInformation);
            ilqVar.a(reservedInfor);
        }
        if (map.containsKey("purchaseDiscountInfo")) {
            PromotionalOffer promotionalOffer = new PromotionalOffer();
            promotionalOffer.setPurchaseDiscountInfo((String) map.get("purchaseDiscountInfo"));
            promotionalOffer.setPurchaseDiscountSignature((String) map.get("purchaseDiscountSignature"));
            reservedInfor.setPromotionalOffer(promotionalOffer);
            ilqVar.a(reservedInfor);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <T> void c(int i, T t) {
        Message messageObtain = Message.obtain();
        messageObtain.what = i;
        messageObtain.obj = t;
        this.t.sendMessage(messageObtain);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <T> void e(T t) {
        if (a(t) != 0) {
            c(1002, (Object) null);
        }
    }

    private boolean b(int i) {
        int i2 = this.f;
        if (i2 == 3040022 || i2 == 3130014 || i2 == 3130012) {
            LogUtil.a("R_PayActivity", "not show dialog. ErrorCode = ", Integer.valueOf(i2));
            return false;
        }
        LogUtil.a("R_PayActivity", "showSystemErrorDialog() enter");
        Window window = getWindow();
        window.setFlags(67108864, 67108864);
        window.setGravity(80);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -2;
        onWindowAttributesChanged(attributes);
        if (!(this.h instanceof Activity)) {
            LogUtil.j("R_PayActivity", "mContext not instanceof Activity");
            return false;
        }
        CustomAlertDialog.Builder builder = new CustomAlertDialog.Builder(this.h);
        View viewInflate = LayoutInflater.from(this.h).inflate(R.layout.trade_system_error_view, (ViewGroup) null);
        b((TextView) viewInflate.findViewById(R.id.pay_error_text), i);
        builder.a(viewInflate);
        viewInflate.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.tradeservice.pay.PayActivity.9
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                PayActivity.this.i();
                PayActivity.this.finish();
            }
        });
        CustomAlertDialog customAlertDialogB = builder.b();
        this.ai = customAlertDialogB;
        customAlertDialogB.setCancelable(false);
        if (((Activity) this.h).isDestroyed() || ((Activity) this.h).isFinishing()) {
            return true;
        }
        LogUtil.a("R_PayActivity", "showSystemErrorDialog success");
        this.ai.show();
        return true;
    }

    private void b(TextView textView, int i) {
        if (i == 1013) {
            textView.setText(R.string.CS_overload_message);
        }
        if (i == 1014) {
            textView.setText(R.string.IDS_vmall_hms_core_installed_alert);
        }
        if (i == 1005) {
            textView.setText(R.string.IDS_connect_error);
        }
        if (this.f == 3040051) {
            textView.setText(BaseApplication.getContext().getResources().getString(R.string.IDS_order_unpay, 2, 4));
        }
        if (this.f == 3040009) {
            textView.setText(R.string.IDS_product_sold_out);
        }
        if (this.f == 3040064 || i == 1016) {
            textView.setText(R.string.IDS_nation_not_match);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        LogUtil.a("R_PayActivity", "enter dismissDialog");
        if (((Activity) this.h).isDestroyed() || ((Activity) this.h).isFinishing()) {
            return;
        }
        this.ai.dismiss();
        this.ai = null;
    }

    public void e() {
        CustomAlertDialog customAlertDialog = this.ai;
        if (customAlertDialog != null) {
            customAlertDialog.dismiss();
        }
        this.ai = null;
    }

    private void f() {
        if (this.ac == null) {
            LogUtil.j("R_PayActivity", "mProductInfo = null");
            return;
        }
        HashMap map = new HashMap();
        map.put("click", "1");
        map.put("type", Integer.valueOf(this.ac.getResourceType()));
        map.put("name", this.ac.getProductName());
        map.put("id", this.ac.getProductId());
        map.put("discountPeriod", ily.c());
        MarketingBiUtils.d(map, this.ac.getBiParams());
        lmf.d().c(com.huawei.haf.application.BaseApplication.b(), AnalyticsValue.TRADE_PAY_SUCCESS.value(), map, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str, String str2) {
        String str3 = RecordAction.ACT_ID_TAG + lsp.b(getApplicationContext(), LoginInit.getInstance(this).getAccountInfo(1011)) + ",msg=" + str2;
        OpAnalyticsUtil.getInstance().setProbabilityProblemEvent(str, str3);
        LogUtil.a("R_PayActivity", "msgKey = ", str, "; eventMsg = ", str3);
    }

    private String c(PurchaseIntentReq purchaseIntentReq) {
        return "ProdId=" + purchaseIntentReq.getProductId() + ";Payload=" + purchaseIntentReq.getDeveloperPayload() + ";SignatureAlgorithm=" + purchaseIntentReq.getSignatureAlgorithm() + ";PriceType=" + purchaseIntentReq.getPriceType() + ";ReservedInfor=" + purchaseIntentReq.getReservedInfor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String b(PromotionInfoRsp promotionInfoRsp) {
        return "DiscountInfo()=" + promotionInfoRsp.getPurchaseDiscountInfo() + ";DiscountSignature=" + promotionInfoRsp.getPurchaseDiscountSignature();
    }

    private String c(String str, String str2, String str3) {
        return "orderCode=" + str + ";inAppPurchaseData=" + str2 + ";signature=" + str3;
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
