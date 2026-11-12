package com.huawei.hms.support.api.paytask.fullsdk;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.huawei.hmf.tasks.OnFailureListener;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hmf.tasks.Task;
import com.huawei.hms.iap.IapApiException;
import com.huawei.hms.iapfull.IapFullAPIFactory;
import com.huawei.hms.iapfull.bean.WebProductDetailRequest;
import com.huawei.hms.iapfull.webpay.callback.WebPayCallback;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.entity.pay.ProductDetailRequest;
import com.huawei.hms.support.api.entity.pay.ProductDetailResp;
import com.huawei.hms.support.api.pay.ProductDetailResult;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.JsonUtil;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes34.dex */
public class ProductDetailTask extends Task<ProductDetailResult> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f16539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f16540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ProductDetailResult f16541c = new ProductDetailResult();
    private OnSuccessListener<ProductDetailResult> d;
    private OnFailureListener e;

    @Override // com.huawei.hmf.tasks.Task
    public Exception getException() {
        return null;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.huawei.hmf.tasks.Task
    public <E extends Throwable> ProductDetailResult getResultThrowException(Class<E> cls) throws Throwable {
        return null;
    }

    @Override // com.huawei.hmf.tasks.Task
    public boolean isCanceled() {
        return false;
    }

    @Override // com.huawei.hmf.tasks.Task
    public boolean isSuccessful() {
        return this.f16540b;
    }

    @Override // com.huawei.hmf.tasks.Task
    public boolean isComplete() {
        return this.f16539a;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.huawei.hmf.tasks.Task
    public ProductDetailResult getResult() {
        return this.f16541c;
    }

    @Override // com.huawei.hmf.tasks.Task
    public Task<ProductDetailResult> addOnSuccessListener(Executor executor, OnSuccessListener<ProductDetailResult> onSuccessListener) {
        addOnSuccessListener(onSuccessListener);
        return this;
    }

    @Override // com.huawei.hmf.tasks.Task
    public Task<ProductDetailResult> addOnSuccessListener(OnSuccessListener<ProductDetailResult> onSuccessListener) {
        if (onSuccessListener != null) {
            this.d = onSuccessListener;
        }
        return this;
    }

    @Override // com.huawei.hmf.tasks.Task
    public Task<ProductDetailResult> addOnSuccessListener(Activity activity, OnSuccessListener<ProductDetailResult> onSuccessListener) {
        addOnSuccessListener(onSuccessListener);
        return this;
    }

    @Override // com.huawei.hmf.tasks.Task
    public Task<ProductDetailResult> addOnFailureListener(Executor executor, OnFailureListener onFailureListener) {
        addOnFailureListener(onFailureListener);
        return this;
    }

    @Override // com.huawei.hmf.tasks.Task
    public Task<ProductDetailResult> addOnFailureListener(OnFailureListener onFailureListener) {
        if (onFailureListener != null) {
            if (isComplete()) {
                onFailureListener.onFailure(new IapApiException(this.f16541c.getStatus()));
                return this;
            }
            this.e = onFailureListener;
        }
        return this;
    }

    @Override // com.huawei.hmf.tasks.Task
    public Task<ProductDetailResult> addOnFailureListener(Activity activity, OnFailureListener onFailureListener) {
        addOnFailureListener(onFailureListener);
        return this;
    }

    private WebProductDetailRequest a(ProductDetailRequest productDetailRequest) {
        WebProductDetailRequest webProductDetailRequest = new WebProductDetailRequest();
        webProductDetailRequest.setApplicationID(productDetailRequest.getApplicationID());
        webProductDetailRequest.setMerchantId(productDetailRequest.getMerchantId());
        webProductDetailRequest.setProductNos(productDetailRequest.getProductNos());
        webProductDetailRequest.setRequestId(productDetailRequest.getRequestId());
        webProductDetailRequest.setReservedInfor(productDetailRequest.getReservedInfor());
        return webProductDetailRequest;
    }

    public ProductDetailTask(Context context, ProductDetailRequest productDetailRequest) {
        if (context != null) {
            IapFullAPIFactory.createIapFullAPI(context).getProductDetail(a(productDetailRequest), new WebPayCallback() { // from class: com.huawei.hms.support.api.paytask.fullsdk.ProductDetailTask.1
                @Override // com.huawei.hms.iapfull.webpay.callback.WebPayCallback
                public void onSuccess(String str) {
                    ProductDetailResp productDetailResp = new ProductDetailResp();
                    if (!TextUtils.isEmpty(str)) {
                        try {
                            JsonUtil.jsonToEntity(str, productDetailResp);
                        } catch (IllegalArgumentException e) {
                            HMSLog.e("ProductDetailTask", "ProductDetailResp jsonToEntity " + e.getMessage());
                        }
                    }
                    ProductDetailResult productDetailResult = new ProductDetailResult();
                    productDetailResult.setProductList(productDetailResp.productList);
                    productDetailResult.setStatus(new Status(productDetailResp.returnCode, productDetailResp.errMsg));
                    productDetailResult.setFailList(productDetailResp.getFailList());
                    productDetailResult.setProductList(productDetailResp.getProductList());
                    productDetailResult.setRequestId(productDetailResp.getRequestId());
                    ProductDetailTask.this.f16540b = true;
                    ProductDetailTask.this.f16541c = productDetailResult;
                    ProductDetailTask.this.f16539a = true;
                    if (ProductDetailTask.this.d != null) {
                        ProductDetailTask.this.d.onSuccess(ProductDetailTask.this.f16541c);
                    }
                }

                @Override // com.huawei.hms.iapfull.webpay.callback.WebPayCallback
                public void onFailure(int i, String str) {
                    ProductDetailResult productDetailResult = new ProductDetailResult();
                    productDetailResult.setStatus(new Status(i, str));
                    ProductDetailTask.this.f16540b = false;
                    ProductDetailTask.this.f16541c = productDetailResult;
                    ProductDetailTask.this.f16539a = true;
                    if (ProductDetailTask.this.e != null) {
                        ProductDetailTask.this.e.onFailure(new IapApiException(ProductDetailTask.this.f16541c.getStatus()));
                    }
                }
            });
            return;
        }
        this.f16541c.setStatus(new Status(30001, "param is error"));
        this.f16540b = false;
        this.f16539a = true;
    }
}
