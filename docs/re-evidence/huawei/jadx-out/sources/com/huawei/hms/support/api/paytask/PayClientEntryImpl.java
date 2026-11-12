package com.huawei.hms.support.api.paytask;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.huawei.hmf.tasks.Task;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.iap.util.a;
import com.huawei.hms.iapfull.IapFullAPIFactory;
import com.huawei.hms.support.api.entity.pay.HwWalletInfoRequest;
import com.huawei.hms.support.api.entity.pay.InternalPayRequest;
import com.huawei.hms.support.api.entity.pay.OrderRequest;
import com.huawei.hms.support.api.entity.pay.PayReq;
import com.huawei.hms.support.api.entity.pay.ProductDetailRequest;
import com.huawei.hms.support.api.entity.pay.ProductPayRequest;
import com.huawei.hms.support.api.entity.pay.PurchaseInfoRequest;
import com.huawei.hms.support.api.entity.pay.WithholdRequest;
import com.huawei.hms.support.api.pay.GetWalletUiIntentResult;
import com.huawei.hms.support.api.pay.HwWalletInfoResult;
import com.huawei.hms.support.api.pay.OrderResult;
import com.huawei.hms.support.api.pay.PayResult;
import com.huawei.hms.support.api.pay.PayResultInfo;
import com.huawei.hms.support.api.pay.ProductDetailResult;
import com.huawei.hms.support.api.pay.ProductPayResultInfo;
import com.huawei.hms.support.api.pay.PurchaseInfoResult;
import com.huawei.hms.support.api.paytask.fullsdk.FailureTask;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.Checker;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes10.dex */
public class PayClientEntryImpl implements PayClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeakReference<Context> f16524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private PayClientImpl f16525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private PayClientFullImpl f16526c;

    @Override // com.huawei.hms.support.api.paytask.PayClient
    public void setSubAppId(String str) {
        PayClientImpl payClientImplA = a();
        if (payClientImplA == null) {
            HMSLog.e("PayClientImpl", "setSubAppId payClient is null");
            return;
        }
        try {
            payClientImplA.setSubAppId(str);
        } catch (ApiException unused) {
            HMSLog.d("PayClientImpl", "setSubAppId fail");
        }
    }

    @Override // com.huawei.hms.support.api.paytask.PayClient
    public Task<HwWalletInfoResult> queryWalletInfo(HwWalletInfoRequest hwWalletInfoRequest) {
        Checker.checkNonNull(hwWalletInfoRequest);
        PayClientImpl payClientImplA = a();
        return payClientImplA != null ? payClientImplA.queryWalletInfo(hwWalletInfoRequest) : new FailureTask();
    }

    @Override // com.huawei.hms.support.api.paytask.PayClient
    public Task<PayResult> productPay(ProductPayRequest productPayRequest) {
        Checker.checkNonNull(productPayRequest);
        Context context = this.f16524a.get();
        if (context == null) {
            return new FailureTask();
        }
        if (!a.a(context, productPayRequest.reservedInfor, "ProductPay")) {
            PayClientImpl payClientImplA = a();
            return payClientImplA != null ? payClientImplA.productPay(productPayRequest) : new FailureTask();
        }
        HMSLog.i("PayClientImpl", "productPay with Full SDK branch.");
        PayClientFullImpl payClientFullImplB = b();
        return payClientFullImplB != null ? payClientFullImplB.productPay(productPayRequest) : new FailureTask();
    }

    @Override // com.huawei.hms.support.api.paytask.PayClient
    public Task<PayResult> pay(PayReq payReq) {
        Checker.checkNonNull(payReq);
        Context context = this.f16524a.get();
        if (context == null) {
            return new FailureTask();
        }
        if (a.a(context, payReq.reservedInfor, payReq.country, payReq.currency, IapFullAPIFactory.PAY_TRADE_TYPE)) {
            HMSLog.i("PayClientImpl", "pay with Full SDK branch.");
            PayClientFullImpl payClientFullImplB = b();
            return payClientFullImplB != null ? payClientFullImplB.pay(payReq) : new FailureTask();
        }
        HMSLog.i("PayClientImpl", "pay with IAP SDK branch.");
        PayClientImpl payClientImplA = a();
        return payClientImplA != null ? payClientImplA.pay(payReq) : new FailureTask();
    }

    @Override // com.huawei.hms.support.api.paytask.PayClient
    public Task<PayResult> internalPay(InternalPayRequest internalPayRequest) {
        Checker.checkNonNull(internalPayRequest);
        PayClientImpl payClientImplA = a();
        return payClientImplA != null ? payClientImplA.internalPay(internalPayRequest) : new FailureTask();
    }

    @Override // com.huawei.hms.support.api.paytask.PayClient
    public Task<GetWalletUiIntentResult> getWalletUiIntent(int i) {
        PayClientImpl payClientImplA = a();
        return payClientImplA != null ? payClientImplA.getWalletUiIntent(i) : new FailureTask();
    }

    @Override // com.huawei.hms.support.api.paytask.PayClient
    public Task<PurchaseInfoResult> getPurchaseInfo(PurchaseInfoRequest purchaseInfoRequest) {
        Checker.checkNonNull(purchaseInfoRequest);
        Context context = this.f16524a.get();
        if (context == null) {
            return new FailureTask();
        }
        if (!a.a(context, purchaseInfoRequest.reservedInfor, "Purchaseinfo")) {
            PayClientImpl payClientImplA = a();
            return payClientImplA != null ? payClientImplA.getPurchaseInfo(purchaseInfoRequest) : new FailureTask();
        }
        HMSLog.i("PayClientImpl", "getProductDetails with Full SDK branch.");
        PayClientFullImpl payClientFullImplB = b();
        return payClientFullImplB != null ? payClientFullImplB.getPurchaseInfo(purchaseInfoRequest) : new FailureTask();
    }

    @Override // com.huawei.hms.support.api.paytask.PayClient
    public ProductPayResultInfo getProductPayResultFromIntent(Intent intent) {
        Checker.checkNonNull(intent);
        PayClientImpl payClientImplA = a();
        if (payClientImplA != null) {
            return payClientImplA.getProductPayResultFromIntent(intent);
        }
        return null;
    }

    @Override // com.huawei.hms.support.api.paytask.PayClient
    public Task<ProductDetailResult> getProductDetails(ProductDetailRequest productDetailRequest) {
        Checker.checkNonNull(productDetailRequest);
        Context context = this.f16524a.get();
        if (context == null) {
            return new FailureTask();
        }
        if (!a.a(context, productDetailRequest.reservedInfor, "Productdetail")) {
            PayClientImpl payClientImplA = a();
            return payClientImplA != null ? payClientImplA.getProductDetails(productDetailRequest) : new FailureTask();
        }
        HMSLog.i("PayClientImpl", "getProductDetails with Full SDK branch.");
        PayClientFullImpl payClientFullImplB = b();
        return payClientFullImplB != null ? payClientFullImplB.getProductDetails(productDetailRequest) : new FailureTask();
    }

    @Override // com.huawei.hms.support.api.paytask.PayClient
    public PayResultInfo getPayResultInfoFromIntent(Intent intent) {
        Checker.checkNonNull(intent);
        PayClientImpl payClientImplA = a();
        if (payClientImplA != null) {
            return payClientImplA.getPayResultInfoFromIntent(intent);
        }
        return null;
    }

    @Override // com.huawei.hms.support.api.paytask.PayClient
    public Task<OrderResult> getOrderDetail(OrderRequest orderRequest) {
        Checker.checkNonNull(orderRequest);
        Context context = this.f16524a.get();
        if (context == null) {
            return new FailureTask();
        }
        if (!a.a(context, orderRequest.reservedInfor, "GetOrderDetail")) {
            PayClientImpl payClientImplA = a();
            return payClientImplA != null ? payClientImplA.getOrderDetail(orderRequest) : new FailureTask();
        }
        HMSLog.i("PayClientImpl", "getOrderDetail with Full SDK branch.");
        PayClientFullImpl payClientFullImplB = b();
        return payClientFullImplB != null ? payClientFullImplB.getOrderDetail(orderRequest) : new FailureTask();
    }

    @Override // com.huawei.hms.support.api.paytask.PayClient
    public Task<PayResult> addWithholdingPlan(WithholdRequest withholdRequest) {
        Checker.checkNonNull(withholdRequest);
        Context context = this.f16524a.get();
        if (context == null) {
            return new FailureTask();
        }
        if (a.a(context, withholdRequest.reservedInfor, withholdRequest.country, withholdRequest.currency, IapFullAPIFactory.WITHHOLD_TRADE_TYPE)) {
            HMSLog.i("PayClientImpl", "withhold with Full SDK branch.");
            PayClientFullImpl payClientFullImplB = b();
            return payClientFullImplB != null ? payClientFullImplB.addWithholdingPlan(withholdRequest) : new FailureTask();
        }
        HMSLog.i("PayClientImpl", "withhold with IAP SDK branch.");
        PayClientImpl payClientImplA = a();
        return payClientImplA != null ? payClientImplA.addWithholdingPlan(withholdRequest) : new FailureTask();
    }

    private PayClientFullImpl b() {
        if (this.f16526c == null) {
            Context context = this.f16524a.get();
            if (context == null) {
                HMSLog.e("PayClientImpl", "getPayClientFullImpl context is null.");
                return null;
            }
            this.f16526c = new PayClientFullImpl(context);
        }
        return this.f16526c;
    }

    private PayClientImpl a() {
        if (this.f16525b == null) {
            Context context = this.f16524a.get();
            if (context == null) {
                HMSLog.e("PayClientImpl", "getPayClientImpl context is null.");
                return null;
            }
            this.f16525b = context instanceof Activity ? new PayClientImpl((Activity) context) : new PayClientImpl(context);
        }
        return this.f16525b;
    }

    PayClientEntryImpl(Context context) {
        this.f16524a = new WeakReference<>(context);
    }

    PayClientEntryImpl(Activity activity) {
        this.f16524a = new WeakReference<>(activity);
    }
}
