package com.huawei.appgallery.agd.api;

import android.content.Context;
import com.huawei.appgallery.agd.internal.support.log.AgdLog;
import com.huawei.appgallery.agd.internalapi.CrossClientApi;
import com.huawei.appgallery.agd.internalapi.ICrossClient;
import com.huawei.appgallery.coreservice.api.PendingCall;
import com.huawei.appgallery.coreservice.internal.framework.ipc.transport.data.BaseIPCRequest;
import com.huawei.appgallery.coreservice.internal.framework.ipc.transport.data.BaseIPCResponse;
import com.huawei.appmarket.framework.coreservice.Status;

/* JADX INFO: loaded from: classes23.dex */
public class PendingResult<C extends BaseIPCRequest, R extends BaseIPCResponse> extends PendingCall<C, R> {
    public static final int RESOLUTION_AUTOFINISH = 1;
    public static final int RESOLUTION_DONOT_AUTOFINISH = 0;
    public static final String RESOLUTION_EXTRA_AUTOFINISH = "agd.extra.autofinish";
    public static final String RESOLUTION_EXTRA_BUNDLE = "agd.extra.bundle";
    public static final String RESOLUTION_EXTRA_BUNDLE_BINDER = "agd.extra.bundle.binder";
    public static final String RESOLUTION_EXTRA_BUNDLE_REQUESTCODE = "agd.extra.bundle.requestcode";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f5195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f5196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ICrossClient f5197c;
    private boolean d;
    private C e;

    public void setResultCallback(final ResultCallback<R> resultCallback) {
        AgdLog.LOG.i("PendingResult", "setResultCallback");
        if (!this.d) {
            resultCallback.getClass();
            super.setCallback(new PendingCall.Callback() { // from class: com.huawei.appgallery.agd.api.PendingResult$$ExternalSyntheticLambda0
                @Override // com.huawei.appgallery.coreservice.api.PendingCall.Callback
                public final void onReceiveStatus(Status status) {
                    resultCallback.onResult(status);
                }
            });
        } else {
            AgdLog.LOG.w("PendingResult", "crossClientTaskProcess");
            this.mResult = this.f5197c.crossClientTaskProcess(this.f5196b, this.e);
            resultCallback.onResult(getResult());
        }
    }

    @Override // com.huawei.appgallery.coreservice.api.PendingCall
    public void awaitOnAnyThread() {
        if (!this.d) {
            super.awaitOnAnyThread();
            return;
        }
        if (this.api.get() != null) {
            setResult(this.mResult);
            return;
        }
        AgdLog.LOG.e("PendingResult", "api is null");
        synchronized (this.f5195a) {
            this.mResult.setStatusCode(12);
        }
    }

    public PendingResult(AgdApiClient agdApiClient, C c2) {
        super(agdApiClient, c2);
        this.f5195a = new Object();
        Context context = agdApiClient.getContext();
        this.f5196b = context;
        this.e = c2;
        boolean zNeedCrossClient = CrossClientApi.needCrossClient(context);
        this.d = zNeedCrossClient;
        if (zNeedCrossClient) {
            this.f5197c = CrossClientApi.getCrossClient();
        }
    }
}
