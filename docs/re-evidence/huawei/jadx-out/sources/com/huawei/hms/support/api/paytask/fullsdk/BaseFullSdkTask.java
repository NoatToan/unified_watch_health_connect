package com.huawei.hms.support.api.paytask.fullsdk;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.huawei.hmf.tasks.OnFailureListener;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hmf.tasks.Task;
import com.huawei.hms.iap.IapApiException;
import com.huawei.hms.iapfull.bean.PayRequest;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.entity.pay.internal.BaseReq;
import com.huawei.hms.support.api.pay.PayResult;
import java.lang.reflect.Field;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes10.dex */
public abstract class BaseFullSdkTask<T extends BaseReq> extends Task<PayResult> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f16532b;
    protected Context mContext;
    protected T mRequest;
    protected Intent mIntent = getFullSdkIntent();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private PayResult f16531a = new PayResult();

    protected abstract PayRequest createRequestParams();

    @Override // com.huawei.hmf.tasks.Task
    public Exception getException() {
        return null;
    }

    protected abstract Intent getFullSdkIntent();

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.huawei.hmf.tasks.Task
    public <E extends Throwable> PayResult getResultThrowException(Class<E> cls) throws Throwable {
        return null;
    }

    @Override // com.huawei.hmf.tasks.Task
    public boolean isCanceled() {
        return false;
    }

    @Override // com.huawei.hmf.tasks.Task
    public boolean isSuccessful() {
        return this.mIntent != null;
    }

    @Override // com.huawei.hmf.tasks.Task
    public boolean isComplete() {
        return this.f16532b;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.huawei.hmf.tasks.Task
    public PayResult getResult() {
        return this.f16531a;
    }

    protected boolean checkFieldExist(Object obj, String str) {
        if (obj != null && !TextUtils.isEmpty(str)) {
            for (Field field : obj.getClass().getDeclaredFields()) {
                if (field.getName().equals(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.huawei.hmf.tasks.Task
    public Task<PayResult> addOnSuccessListener(Executor executor, OnSuccessListener<PayResult> onSuccessListener) {
        addOnSuccessListener(onSuccessListener);
        return this;
    }

    @Override // com.huawei.hmf.tasks.Task
    public Task<PayResult> addOnSuccessListener(OnSuccessListener<PayResult> onSuccessListener) {
        if (onSuccessListener != null && isSuccessful()) {
            onSuccessListener.onSuccess(this.f16531a);
        }
        return this;
    }

    @Override // com.huawei.hmf.tasks.Task
    public Task<PayResult> addOnSuccessListener(Activity activity, OnSuccessListener<PayResult> onSuccessListener) {
        addOnSuccessListener(onSuccessListener);
        return this;
    }

    @Override // com.huawei.hmf.tasks.Task
    public Task<PayResult> addOnFailureListener(Executor executor, OnFailureListener onFailureListener) {
        addOnFailureListener(onFailureListener);
        return this;
    }

    @Override // com.huawei.hmf.tasks.Task
    public Task<PayResult> addOnFailureListener(OnFailureListener onFailureListener) {
        if (onFailureListener != null && !isSuccessful()) {
            onFailureListener.onFailure(new IapApiException(this.f16531a.getStatus()));
        }
        return this;
    }

    @Override // com.huawei.hmf.tasks.Task
    public Task<PayResult> addOnFailureListener(Activity activity, OnFailureListener onFailureListener) {
        addOnFailureListener(onFailureListener);
        return this;
    }

    protected BaseFullSdkTask(Context context, T t) {
        this.mContext = context;
        this.mRequest = t;
        this.f16531a.setStatus(this.mIntent == null ? new Status(30001, "param is error") : new Status(0, "success", this.mIntent));
        this.f16532b = true;
    }
}
