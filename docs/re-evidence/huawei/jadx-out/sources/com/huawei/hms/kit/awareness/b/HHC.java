package com.huawei.hms.kit.awareness.b;

import android.content.Context;
import com.huawei.hmf.tasks.Task;
import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hms.api.Api;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.common.internal.HmsClient;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.common.internal.TaskApiCall;
import com.huawei.hms.kit.awareness.internal.hmscore.AwarenessInBean;
import com.huawei.hms.kit.awareness.internal.hmscore.AwarenessOutBean;

/* JADX INFO: loaded from: classes34.dex */
class HHC extends HuaweiApi<Api.ApiOptions> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static AwarenessInBean f13862a = new AwarenessInBean();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HHA f13863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f13864c;
    private int d;

    Task<AwarenessOutBean> c() {
        return doWrite(this.f13863b);
    }

    int b() {
        return this.f13864c;
    }

    void a(AwarenessInBean awarenessInBean) {
        this.f13863b = new HHA(awarenessInBean);
    }

    void a(int i) {
        this.d = i;
        this.f13863b.setApiLevel(i);
    }

    static final class HHA extends TaskApiCall<HmsClient, AwarenessOutBean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final String f13865a = "awareness_kit.getAwarenessService";

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.hms.common.internal.TaskApiCall
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void doExecute(HmsClient hmsClient, ResponseErrorCode responseErrorCode, String str, TaskCompletionSource<AwarenessOutBean> taskCompletionSource) {
            taskCompletionSource.setResult(new AwarenessOutBean(responseErrorCode.getErrorCode(), responseErrorCode.getParcelable()));
        }

        HHA(AwarenessInBean awarenessInBean) {
            super(f13865a, awarenessInBean.toJsonString(), null);
        }
    }

    void a() {
        this.f13864c = this.d;
    }

    HHC(Context context) {
        super(context, (Api<HHH>) new Api("HuaweiAwareness.API"), new HHH(), new HHD());
        this.f13863b = new HHA(f13862a);
    }
}
