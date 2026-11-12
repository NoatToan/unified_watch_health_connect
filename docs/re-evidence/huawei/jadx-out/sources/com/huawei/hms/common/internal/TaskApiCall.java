package com.huawei.hms.common.internal;

import android.os.Parcelable;
import com.huawei.hmf.tasks.CancellationToken;
import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hms.common.internal.AnyClient;
import com.huawei.hms.support.log.HMSLog;

/* JADX INFO: loaded from: classes3.dex */
public abstract class TaskApiCall<ClientT extends AnyClient, ResultT> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f13072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f13073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Parcelable f13074c;
    private String d;
    private CancellationToken e;
    private int f;

    @Deprecated
    public TaskApiCall(String str, String str2) {
        this.f = 1;
        this.f13072a = str;
        this.f13073b = str2;
        this.f13074c = null;
        this.d = null;
    }

    protected abstract void doExecute(ClientT clientt, ResponseErrorCode responseErrorCode, String str, TaskCompletionSource<ResultT> taskCompletionSource);

    public int getApiLevel() {
        return this.f;
    }

    @Deprecated
    public int getMinApkVersion() {
        return 30000000;
    }

    public Parcelable getParcelable() {
        return this.f13074c;
    }

    public String getRequestJson() {
        return this.f13073b;
    }

    public CancellationToken getToken() {
        return this.e;
    }

    public String getTransactionId() {
        return this.d;
    }

    public String getUri() {
        return this.f13072a;
    }

    public final void onResponse(ClientT clientt, ResponseErrorCode responseErrorCode, String str, TaskCompletionSource<ResultT> taskCompletionSource) {
        CancellationToken cancellationToken = this.e;
        if (cancellationToken != null && cancellationToken.isCancellationRequested()) {
            HMSLog.i("TaskApiCall", "This Task has been canceled, uri:" + this.f13072a + ", transactionId:" + this.d);
            return;
        }
        HMSLog.i("TaskApiCall", "doExecute, uri:" + this.f13072a + ", errorCode:" + responseErrorCode.getErrorCode() + ", transactionId:" + this.d);
        doExecute(clientt, responseErrorCode, str, taskCompletionSource);
    }

    public void setApiLevel(int i) {
        this.f = i;
    }

    public void setParcelable(Parcelable parcelable) {
        this.f13074c = parcelable;
    }

    public void setToken(CancellationToken cancellationToken) {
        this.e = cancellationToken;
    }

    public void setTransactionId(String str) {
        this.d = str;
    }

    public TaskApiCall(String str, String str2, String str3) {
        this.f = 1;
        this.f13072a = str;
        this.f13073b = str2;
        this.f13074c = null;
        this.d = str3;
    }

    public TaskApiCall(String str, String str2, String str3, int i) {
        this.f13072a = str;
        this.f13073b = str2;
        this.f13074c = null;
        this.d = str3;
        this.f = i;
    }
}
