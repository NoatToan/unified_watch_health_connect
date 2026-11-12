package com.huawei.hms.iapfull;

import android.content.Context;
import android.content.Intent;
import com.huawei.hms.iapfull.bean.PayRequest;
import com.huawei.hms.iapfull.bean.PayResult;
import com.huawei.hms.iapfull.bean.WebConsumeOwnedPurchaseRequest;
import com.huawei.hms.iapfull.bean.WebConsumeOwnedPurchaseResponse;
import com.huawei.hms.iapfull.bean.WebIsEnvReadyRequest;
import com.huawei.hms.iapfull.bean.WebIsEnvReadyResponse;
import com.huawei.hms.iapfull.bean.WebObtainOwnedPurchasesResponse;
import com.huawei.hms.iapfull.bean.WebOrderRequest;
import com.huawei.hms.iapfull.bean.WebOrderResp;
import com.huawei.hms.iapfull.bean.WebOwnedPurchasesRequest;
import com.huawei.hms.iapfull.bean.WebProductDetailRequest;
import com.huawei.hms.iapfull.bean.WebProductDetailResponse;
import com.huawei.hms.iapfull.bean.WebProductInfoRequest;
import com.huawei.hms.iapfull.bean.WebProductInfoResp;
import com.huawei.hms.iapfull.bean.WebProductPayRequest;
import com.huawei.hms.iapfull.bean.WebPurchaseInfoRequest;
import com.huawei.hms.iapfull.bean.WebPurchaseInfoResp;
import com.huawei.hms.iapfull.pay.PayActivity;
import com.huawei.hms.iapfull.webpay.WebViewActivity;
import com.huawei.hms.iapfull.webpay.callback.WebPayCallback;
import com.huawei.hms.support.api.entity.pay.HwPayConstant;
import com.huawei.secure.android.common.intent.SafeBundle;
import com.huawei.secure.android.common.intent.SafeIntent;

/* JADX INFO: loaded from: classes10.dex */
public class a implements IIapFullAPI, IIapFullAPIVer4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f13602a;

    static void a(a aVar, String str, String str2, boolean z, WebPayCallback webPayCallback) {
        aVar.getClass();
        y0.a("IapFullAPI", str + " onGrsFail: GRS fail " + str2 + ", isVer4API " + z);
        webPayCallback.onFailure(z ? 60005 : 30005, "grs fail");
    }

    @Override // com.huawei.hms.iapfull.IIapFullAPIVer4
    public void consumeOwnedPurchase(WebConsumeOwnedPurchaseRequest webConsumeOwnedPurchaseRequest, WebPayCallback webPayCallback) {
        g0.a().a(this.f13602a, y0.a(webConsumeOwnedPurchaseRequest.getReservedInfor()), new f(webConsumeOwnedPurchaseRequest, webPayCallback));
    }

    @Override // com.huawei.hms.iapfull.IIapFullAPI
    public void getOrderDetail(WebOrderRequest webOrderRequest, WebPayCallback webPayCallback) {
        g0.a().a(this.f13602a, y0.a(webOrderRequest.getReservedInfor()), new c(webOrderRequest, webPayCallback));
    }

    @Override // com.huawei.hms.iapfull.IIapFullAPI
    public void getProductDetail(WebProductDetailRequest webProductDetailRequest, WebPayCallback webPayCallback) {
        g0.a().a(this.f13602a, y0.a(webProductDetailRequest.getReservedInfor()), new C0130a(webProductDetailRequest, webPayCallback));
    }

    @Override // com.huawei.hms.iapfull.IIapFullAPI
    public void getPurchaseInfo(WebPurchaseInfoRequest webPurchaseInfoRequest, WebPayCallback webPayCallback) {
        g0.a().a(this.f13602a, y0.a(webPurchaseInfoRequest.getReservedInfor()), new b(webPurchaseInfoRequest, webPayCallback));
    }

    @Override // com.huawei.hms.iapfull.IIapFullAPIVer4
    public void isEnvReady(WebIsEnvReadyRequest webIsEnvReadyRequest, WebPayCallback webPayCallback) {
        g0.a().a(this.f13602a, y0.a(webIsEnvReadyRequest.getReservedInfor()), new h(webIsEnvReadyRequest, webPayCallback));
    }

    @Override // com.huawei.hms.iapfull.IIapFullAPIVer4
    public void obtainOwnedPurchaseRecord(WebOwnedPurchasesRequest webOwnedPurchasesRequest, WebPayCallback webPayCallback) {
        g0.a().a(this.f13602a, y0.a(webOwnedPurchasesRequest.getReservedInfor()), new g(webOwnedPurchasesRequest, webPayCallback));
    }

    @Override // com.huawei.hms.iapfull.IIapFullAPIVer4
    public void obtainOwnedPurchases(WebOwnedPurchasesRequest webOwnedPurchasesRequest, WebPayCallback webPayCallback) {
        g0.a().a(this.f13602a, y0.a(webOwnedPurchasesRequest.getReservedInfor()), new e(webOwnedPurchasesRequest, webPayCallback));
    }

    @Override // com.huawei.hms.iapfull.IIapFullAPIVer4
    public void obtainProductInfo(WebProductInfoRequest webProductInfoRequest, WebPayCallback webPayCallback) {
        g0.a().a(this.f13602a, y0.a(webProductInfoRequest.getReservedInfor()), new d(webProductInfoRequest, webPayCallback));
    }

    @Override // com.huawei.hms.iapfull.IIapFullAPI
    public Intent getWithholdIntent(Context context, PayRequest payRequest) {
        if (context == null || payRequest == null) {
            y0.a("IapFullAPI", "getWithholdIntent context or payRequest is null");
            return null;
        }
        payRequest.setPackageName(this.f13602a.getPackageName());
        Intent intent = new Intent();
        intent.setPackage(PayActivity.class.getName());
        intent.setClass(this.f13602a, PayActivity.class);
        intent.putExtras(payRequest.toBundle().getBundle());
        return intent;
    }

    @Override // com.huawei.hms.iapfull.IIapFullAPI
    public Intent getProductPayIntent(Context context, WebProductPayRequest webProductPayRequest) {
        if (context == null || webProductPayRequest == null) {
            y0.a("IapFullAPI", "getProductPayIntent context or webProductPayRequest is null");
            return null;
        }
        webProductPayRequest.setPackageName(this.f13602a.getPackageName());
        Intent intent = new Intent();
        intent.setClass(this.f13602a, WebViewActivity.class);
        intent.putExtras(webProductPayRequest.toBundle().getBundle());
        return intent;
    }

    /* JADX INFO: renamed from: com.huawei.hms.iapfull.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: classes34.dex */
    class C0130a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ WebProductDetailRequest f13603a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ WebPayCallback f13604b;

        /* JADX INFO: renamed from: com.huawei.hms.iapfull.a$a$a, reason: collision with other inner class name */
        class C0131a implements k1 {
            @Override // com.huawei.hms.iapfull.k1
            public void a(WebProductDetailResponse webProductDetailResponse) {
                y0.b("IapFullAPI", "getProductDetail onSuccess");
                C0130a.this.f13604b.onSuccess(a1.b(webProductDetailResponse));
            }

            @Override // com.huawei.hms.iapfull.k1
            public void a(int i, String str) {
                y0.b("IapFullAPI", "getProductDetail onFailed errorCode:" + i);
                C0130a.this.f13604b.onFailure(i, str);
            }

            C0131a() {
            }
        }

        @Override // com.huawei.hms.iapfull.f0
        public void a(String str) {
            a.a(a.this, "getProductDetail", str, false, this.f13604b);
        }

        @Override // com.huawei.hms.iapfull.f0
        public void a() {
            o1.a().a(a.this.f13602a, this.f13603a, new C0131a());
        }

        C0130a(WebProductDetailRequest webProductDetailRequest, WebPayCallback webPayCallback) {
            this.f13603a = webProductDetailRequest;
            this.f13604b = webPayCallback;
        }
    }

    /* JADX INFO: loaded from: classes34.dex */
    class b implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ WebPurchaseInfoRequest f13607a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ WebPayCallback f13608b;

        /* JADX INFO: renamed from: com.huawei.hms.iapfull.a$b$a, reason: collision with other inner class name */
        class C0132a implements m1 {
            @Override // com.huawei.hms.iapfull.m1
            public void a(WebPurchaseInfoResp webPurchaseInfoResp) {
                y0.b("IapFullAPI", "getPurchaseInfo onSuccess");
                b.this.f13608b.onSuccess(a1.b(webPurchaseInfoResp));
            }

            @Override // com.huawei.hms.iapfull.m1
            public void a(int i, String str) {
                y0.b("IapFullAPI", "getPurchaseInfo onFailed errorCode:" + i);
                b.this.f13608b.onFailure(i, str);
            }

            C0132a() {
            }
        }

        @Override // com.huawei.hms.iapfull.f0
        public void a(String str) {
            a.a(a.this, "getPurchaseInfo", str, false, this.f13608b);
        }

        @Override // com.huawei.hms.iapfull.f0
        public void a() {
            o1.a().a(a.this.f13602a, this.f13607a, new C0132a());
        }

        b(WebPurchaseInfoRequest webPurchaseInfoRequest, WebPayCallback webPayCallback) {
            this.f13607a = webPurchaseInfoRequest;
            this.f13608b = webPayCallback;
        }
    }

    /* JADX INFO: loaded from: classes34.dex */
    class c implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ WebOrderRequest f13611a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ WebPayCallback f13612b;

        /* JADX INFO: renamed from: com.huawei.hms.iapfull.a$c$a, reason: collision with other inner class name */
        class C0133a implements j1 {
            @Override // com.huawei.hms.iapfull.j1
            public void a(WebOrderResp webOrderResp) {
                y0.b("IapFullAPI", "getOrderDetail onSuccess");
                c.this.f13612b.onSuccess(a1.b(webOrderResp));
            }

            @Override // com.huawei.hms.iapfull.j1
            public void a(int i, String str) {
                y0.b("IapFullAPI", "getOrderDetail onFailed errorCode:" + i);
                c.this.f13612b.onFailure(i, str);
            }

            C0133a() {
            }
        }

        @Override // com.huawei.hms.iapfull.f0
        public void a(String str) {
            a.a(a.this, "getOrderDetail", str, false, this.f13612b);
        }

        @Override // com.huawei.hms.iapfull.f0
        public void a() {
            o1.a().a(a.this.f13602a, this.f13611a, new C0133a());
        }

        c(WebOrderRequest webOrderRequest, WebPayCallback webPayCallback) {
            this.f13611a = webOrderRequest;
            this.f13612b = webPayCallback;
        }
    }

    /* JADX INFO: loaded from: classes34.dex */
    class d implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ WebProductInfoRequest f13615a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ WebPayCallback f13616b;

        /* JADX INFO: renamed from: com.huawei.hms.iapfull.a$d$a, reason: collision with other inner class name */
        class C0134a implements l1 {
            @Override // com.huawei.hms.iapfull.l1
            public void a(WebProductInfoResp webProductInfoResp) {
                y0.b("IapFullAPI", "obtainProductInfo onSuccess");
                if (webProductInfoResp != null) {
                    webProductInfoResp.convert();
                }
                d.this.f13616b.onSuccess(a1.b(webProductInfoResp));
            }

            @Override // com.huawei.hms.iapfull.l1
            public void a(int i, String str) {
                y0.a("IapFullAPI", "obtainProductInfo onFailed errorCode:" + i);
                d.this.f13616b.onFailure(i, str);
            }

            C0134a() {
            }
        }

        @Override // com.huawei.hms.iapfull.f0
        public void a(String str) {
            a.a(a.this, "obtainProductInfo", str, true, this.f13616b);
        }

        @Override // com.huawei.hms.iapfull.f0
        public void a() {
            o1.a().a(a.this.f13602a, this.f13615a, new C0134a());
        }

        d(WebProductInfoRequest webProductInfoRequest, WebPayCallback webPayCallback) {
            this.f13615a = webProductInfoRequest;
            this.f13616b = webPayCallback;
        }
    }

    /* JADX INFO: loaded from: classes34.dex */
    class e implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ WebOwnedPurchasesRequest f13619a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ WebPayCallback f13620b;

        /* JADX INFO: renamed from: com.huawei.hms.iapfull.a$e$a, reason: collision with other inner class name */
        class C0135a implements i1 {
            @Override // com.huawei.hms.iapfull.i1
            public void a(WebObtainOwnedPurchasesResponse webObtainOwnedPurchasesResponse) {
                y0.b("IapFullAPI", "obtainOwnedPurchases onSuccess");
                e.this.f13620b.onSuccess(a1.b(webObtainOwnedPurchasesResponse));
            }

            @Override // com.huawei.hms.iapfull.i1
            public void a(int i, String str) {
                y0.a("IapFullAPI", "obtainOwnedPurchases onFailed errorCode:" + i);
                e.this.f13620b.onFailure(i, str);
            }

            C0135a() {
            }
        }

        @Override // com.huawei.hms.iapfull.f0
        public void a(String str) {
            a.a(a.this, "obtainOwnedPurchases", str, true, this.f13620b);
        }

        @Override // com.huawei.hms.iapfull.f0
        public void a() {
            o1.a().b(a.this.f13602a, this.f13619a, new C0135a());
        }

        e(WebOwnedPurchasesRequest webOwnedPurchasesRequest, WebPayCallback webPayCallback) {
            this.f13619a = webOwnedPurchasesRequest;
            this.f13620b = webPayCallback;
        }
    }

    /* JADX INFO: loaded from: classes34.dex */
    class f implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ WebConsumeOwnedPurchaseRequest f13623a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ WebPayCallback f13624b;

        /* JADX INFO: renamed from: com.huawei.hms.iapfull.a$f$a, reason: collision with other inner class name */
        class C0136a implements g1 {
            @Override // com.huawei.hms.iapfull.g1
            public void a(WebConsumeOwnedPurchaseResponse webConsumeOwnedPurchaseResponse) {
                y0.b("IapFullAPI", "consumeOwnedPurchase onSuccess");
                f.this.f13624b.onSuccess(a1.b(webConsumeOwnedPurchaseResponse));
            }

            @Override // com.huawei.hms.iapfull.g1
            public void a(int i, String str) {
                y0.a("IapFullAPI", "consumeOwnedPurchase onFailed errorCode:" + i);
                f.this.f13624b.onFailure(i, str);
            }

            C0136a() {
            }
        }

        @Override // com.huawei.hms.iapfull.f0
        public void a(String str) {
            a.a(a.this, "consumeOwnedPurchase", str, true, this.f13624b);
        }

        @Override // com.huawei.hms.iapfull.f0
        public void a() {
            o1.a().a(a.this.f13602a, this.f13623a, new C0136a());
        }

        f(WebConsumeOwnedPurchaseRequest webConsumeOwnedPurchaseRequest, WebPayCallback webPayCallback) {
            this.f13623a = webConsumeOwnedPurchaseRequest;
            this.f13624b = webPayCallback;
        }
    }

    /* JADX INFO: loaded from: classes34.dex */
    class g implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ WebOwnedPurchasesRequest f13627a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ WebPayCallback f13628b;

        /* JADX INFO: renamed from: com.huawei.hms.iapfull.a$g$a, reason: collision with other inner class name */
        class C0137a implements i1 {
            @Override // com.huawei.hms.iapfull.i1
            public void a(WebObtainOwnedPurchasesResponse webObtainOwnedPurchasesResponse) {
                y0.b("IapFullAPI", "obtainOwnedPurchaseRecord onSuccess");
                g.this.f13628b.onSuccess(a1.b(webObtainOwnedPurchasesResponse));
            }

            @Override // com.huawei.hms.iapfull.i1
            public void a(int i, String str) {
                y0.a("IapFullAPI", "obtainOwnedPurchaseRecord onFailed errorCode:" + i);
                g.this.f13628b.onFailure(i, str);
            }

            C0137a() {
            }
        }

        @Override // com.huawei.hms.iapfull.f0
        public void a(String str) {
            a.a(a.this, "obtainOwnedPurchaseRecord", str, true, this.f13628b);
        }

        @Override // com.huawei.hms.iapfull.f0
        public void a() {
            o1.a().a(a.this.f13602a, this.f13627a, new C0137a());
        }

        g(WebOwnedPurchasesRequest webOwnedPurchasesRequest, WebPayCallback webPayCallback) {
            this.f13627a = webOwnedPurchasesRequest;
            this.f13628b = webPayCallback;
        }
    }

    /* JADX INFO: loaded from: classes34.dex */
    class h implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ WebIsEnvReadyRequest f13631a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ WebPayCallback f13632b;

        /* JADX INFO: renamed from: com.huawei.hms.iapfull.a$h$a, reason: collision with other inner class name */
        class C0138a implements h1 {
            @Override // com.huawei.hms.iapfull.h1
            public void a(WebIsEnvReadyResponse webIsEnvReadyResponse) {
                y0.b("IapFullAPI", "isEnvReady onSuccess");
                h.this.f13632b.onSuccess(a1.b(webIsEnvReadyResponse));
            }

            @Override // com.huawei.hms.iapfull.h1
            public void a(int i, String str) {
                y0.a("IapFullAPI", "isEnvReady onFailed errorCode:" + i);
                h.this.f13632b.onFailure(i, str);
            }

            C0138a() {
            }
        }

        @Override // com.huawei.hms.iapfull.f0
        public void a(String str) {
            a.a(a.this, "isEnvReady", str, true, this.f13632b);
        }

        @Override // com.huawei.hms.iapfull.f0
        public void a() {
            o1.a().a(a.this.f13602a, this.f13631a, new C0138a());
        }

        h(WebIsEnvReadyRequest webIsEnvReadyRequest, WebPayCallback webPayCallback) {
            this.f13631a = webIsEnvReadyRequest;
            this.f13632b = webPayCallback;
        }
    }

    @Override // com.huawei.hms.iapfull.IIapFullAPIVer4
    public Intent getPmsPayIntent(WebProductPayRequest webProductPayRequest) {
        Context context = this.f13602a;
        if (context == null || webProductPayRequest == null) {
            y0.a("IapFullAPI", "getPmsPayIntent appContext or webProductPayRequest is null");
            return null;
        }
        webProductPayRequest.setPackageName(context.getPackageName());
        Intent intent = new Intent();
        intent.setClass(this.f13602a, WebViewActivity.class);
        intent.putExtras(webProductPayRequest.toBundle().getBundle());
        return intent;
    }

    @Override // com.huawei.hms.iapfull.IIapFullAPI
    public PayResult getPayResultFromIntent(Intent intent) {
        PayResult payResult = new PayResult();
        SafeBundle safeBundle = new SafeBundle(new SafeIntent(intent).getExtras());
        payResult.setReturnCode(safeBundle.getInt("returnCode"));
        payResult.setOrderID(safeBundle.getString("orderID"));
        payResult.setUserName(safeBundle.getString(HwPayConstant.KEY_USER_NAME));
        payResult.setAmount(safeBundle.getString(HwPayConstant.KEY_AMOUNT));
        payResult.setWithHoldID(safeBundle.getString("withholdID"));
        payResult.setCurrency(safeBundle.getString(HwPayConstant.KEY_CURRENCY));
        payResult.setCountry(safeBundle.getString("country"));
        payResult.setErrMsg(safeBundle.getString("errMsg"));
        payResult.setTime(safeBundle.getString("time"));
        payResult.setRequestId(safeBundle.getString("requestId"));
        payResult.setSign(safeBundle.getString(HwPayConstant.KEY_SIGN));
        payResult.setNewSign(safeBundle.getString("newSign"));
        payResult.setPayType(safeBundle.getInt("payType"));
        payResult.setSignatureAlgorithm(safeBundle.getString("signatureAlgorithm"));
        return payResult;
    }

    @Override // com.huawei.hms.iapfull.IIapFullAPI
    public Intent getPayIntent(Context context, PayRequest payRequest) {
        Context context2;
        Class<?> cls;
        if (context == null || payRequest == null) {
            y0.a("IapFullAPI", "getPayIntent context or payRequest is null");
            return null;
        }
        payRequest.setPackageName(this.f13602a.getPackageName());
        Intent intent = new Intent();
        if (IapFullAPIFactory.isWebPaySupport(payRequest.getReservedInfor(), IapFullAPIFactory.PAY_TRADE_TYPE)) {
            context2 = this.f13602a;
            cls = WebViewActivity.class;
        } else {
            context2 = this.f13602a;
            cls = PayActivity.class;
        }
        intent.setClass(context2, cls);
        intent.putExtras(payRequest.toBundle().getBundle());
        return intent;
    }

    public a(Context context) {
        if (context != null) {
            this.f13602a = context.getApplicationContext();
        }
    }
}
