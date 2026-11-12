package com.huawei.appmarket.service.externalservice.distribution.opendetail;

import android.os.Parcelable;
import android.util.Log;
import com.huawei.appgallery.agd.api.AgdApiClient;
import com.huawei.appgallery.agd.api.AgdHarmonyServiceApi;
import com.huawei.appgallery.agd.api.ApiStatusCodes;
import com.huawei.appgallery.agd.api.PendingResult;
import com.huawei.appgallery.agd.api.ResultCallback;
import com.huawei.appgallery.agd.api.ServiceInfo;
import com.huawei.appgallery.coreservice.internal.framework.ipc.transport.data.RequireVersion;
import com.huawei.appgallery.coreservice.internal.support.parcelable.AutoParcelable;
import com.huawei.appmarket.framework.coreservice.Status;
import com.huawei.appmarket.service.externalservice.distribution.BaseServiceRequest;
import com.huawei.appmarket.service.externalservice.distribution.opendetail.OpenFADetailRequest;

/* JADX INFO: loaded from: classes23.dex */
@RequireVersion(130301000)
public class OpenFADetailRequest extends BaseServiceRequest {
    public static final Parcelable.Creator<OpenFADetailRequest> CREATOR = new AutoParcelable.AutoCreator(OpenFADetailRequest.class);

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final OpenFADetailRequest f5264a = new OpenFADetailRequest();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AgdApiClient f5265b;
        private ResultCallback<OpenFADetailResponse> d;

        public Builder serviceInfo(ServiceInfo serviceInfo) {
            this.f5264a.setServiceInfo(serviceInfo);
            return this;
        }

        public void send() {
            PendingResult<OpenFADetailRequest, OpenFADetailResponse> pendingResultOpenDetail = AgdHarmonyServiceApi.openDetail(this.f5265b, this.f5264a);
            ResultCallback<OpenFADetailResponse> resultCallback = this.d;
            if (resultCallback == null) {
                resultCallback = new ResultCallback() { // from class: bpl
                    @Override // com.huawei.appgallery.agd.api.ResultCallback
                    public final void onResult(Status status) {
                        OpenFADetailRequest.Builder.c(status);
                    }
                };
            }
            pendingResultOpenDetail.setResultCallback(resultCallback);
        }

        public Builder referrer(String str) {
            this.f5264a.setReferrer(str);
            return this;
        }

        public Builder installType(String str) {
            this.f5264a.setInstallType(str);
            return this;
        }

        public Builder downloadParams(String str) {
            this.f5264a.setDownloadParams(str);
            return this;
        }

        public Builder callerContext(String str) {
            this.f5264a.setCallerContext(str);
            return this;
        }

        public Builder callback(ResultCallback<OpenFADetailResponse> resultCallback) {
            this.d = resultCallback;
            return this;
        }

        public Builder callSpec(String str) {
            this.f5264a.setCallSpec(str);
            return this;
        }

        public OpenFADetailRequest build() {
            return this.f5264a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void c(Status status) {
            Log.i("OpenFADetailRequest", "onStatus: " + ApiStatusCodes.getStatusCodeString(status.getStatusCode()));
        }

        public Builder(AgdApiClient agdApiClient) {
            this.f5265b = agdApiClient;
        }
    }

    @Override // com.huawei.appmarket.service.externalservice.distribution.BaseServiceRequest, com.huawei.appgallery.coreservice.internal.framework.ipc.transport.data.BaseIPCRequest
    public String getMethod() {
        return "method.openFADetail";
    }
}
