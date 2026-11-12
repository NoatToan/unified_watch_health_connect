package com.huawei.hms.support.api.paytask;

import android.content.Context;
import android.content.Intent;
import com.huawei.hmf.tasks.Task;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.support.api.entity.pay.HwWalletInfoRequest;
import com.huawei.hms.support.api.entity.pay.InternalPayRequest;
import com.huawei.hms.support.api.entity.pay.OrderRequest;
import com.huawei.hms.support.api.entity.pay.PayNaming;
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
import com.huawei.hms.support.api.paytask.fullsdk.FullSdkPayTask;
import com.huawei.hms.support.api.paytask.fullsdk.FullSdkProductPayTask;
import com.huawei.hms.support.api.paytask.fullsdk.FullSdkWithholdTask;
import com.huawei.hms.support.api.paytask.fullsdk.OrderDetailTask;
import com.huawei.hms.support.api.paytask.fullsdk.ProductDetailTask;
import com.huawei.hms.support.api.paytask.fullsdk.PurchaseInfoTask;
import com.huawei.hms.support.hianalytics.HiAnalyticsClient;
import com.huawei.hms.utils.Checker;

/* JADX INFO: loaded from: classes10.dex */
public class PayClientFullImpl implements PayClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f16527a;

    @Override // com.huawei.hms.support.api.paytask.PayClient
    public void setSubAppId(String str) throws ApiException {
        throw new UnsupportedOperationException("setSubAppId");
    }

    @Override // com.huawei.hms.support.api.paytask.PayClient
    public Task<HwWalletInfoResult> queryWalletInfo(HwWalletInfoRequest hwWalletInfoRequest) {
        throw new UnsupportedOperationException("queryWalletInfo");
    }

    @Override // com.huawei.hms.support.api.paytask.PayClient
    public Task<PayResult> productPay(ProductPayRequest productPayRequest) {
        Checker.checkNonNull(productPayRequest);
        HiAnalyticsClient.reportEntry(this.f16527a, PayNaming.FULL_PRODUCTPAY, 61606303);
        return new FullSdkProductPayTask(this.f16527a, productPayRequest);
    }

    @Override // com.huawei.hms.support.api.paytask.PayClient
    public Task<PayResult> pay(PayReq payReq) {
        Checker.checkNonNull(payReq);
        HiAnalyticsClient.reportEntry(this.f16527a, PayNaming.FULL_PAY, 61606303);
        return new FullSdkPayTask(this.f16527a, payReq);
    }

    @Override // com.huawei.hms.support.api.paytask.PayClient
    public Task<PayResult> internalPay(InternalPayRequest internalPayRequest) {
        throw new UnsupportedOperationException("internalPay");
    }

    @Override // com.huawei.hms.support.api.paytask.PayClient
    public Task<GetWalletUiIntentResult> getWalletUiIntent(int i) {
        throw new UnsupportedOperationException("getWalletUiIntent");
    }

    @Override // com.huawei.hms.support.api.paytask.PayClient
    public Task<PurchaseInfoResult> getPurchaseInfo(PurchaseInfoRequest purchaseInfoRequest) {
        Checker.checkNonNull(purchaseInfoRequest);
        HiAnalyticsClient.reportEntry(this.f16527a, PayNaming.FULL_PURCHASEINFO, 61606303);
        return new PurchaseInfoTask(this.f16527a, purchaseInfoRequest);
    }

    @Override // com.huawei.hms.support.api.paytask.PayClient
    public ProductPayResultInfo getProductPayResultFromIntent(Intent intent) {
        throw new UnsupportedOperationException("getProductPayResultFromIntent");
    }

    @Override // com.huawei.hms.support.api.paytask.PayClient
    public Task<ProductDetailResult> getProductDetails(ProductDetailRequest productDetailRequest) {
        Checker.checkNonNull(productDetailRequest);
        HiAnalyticsClient.reportEntry(this.f16527a, PayNaming.FULL_PRODUCTDETAIL, 61606303);
        return new ProductDetailTask(this.f16527a, productDetailRequest);
    }

    @Override // com.huawei.hms.support.api.paytask.PayClient
    public PayResultInfo getPayResultInfoFromIntent(Intent intent) {
        throw new UnsupportedOperationException("getPayResultInfoFromIntent");
    }

    @Override // com.huawei.hms.support.api.paytask.PayClient
    public Task<OrderResult> getOrderDetail(OrderRequest orderRequest) {
        Checker.checkNonNull(orderRequest);
        HiAnalyticsClient.reportEntry(this.f16527a, PayNaming.FULL_GETORDERDETAIL, 61606303);
        return new OrderDetailTask(this.f16527a, orderRequest);
    }

    @Override // com.huawei.hms.support.api.paytask.PayClient
    public Task<PayResult> addWithholdingPlan(WithholdRequest withholdRequest) {
        Checker.checkNonNull(withholdRequest);
        HiAnalyticsClient.reportEntry(this.f16527a, PayNaming.FULL_WITHHOLD, 61606303);
        return new FullSdkWithholdTask(this.f16527a, withholdRequest);
    }

    PayClientFullImpl(Context context) {
        if (context != null) {
            this.f16527a = context;
        }
    }
}
