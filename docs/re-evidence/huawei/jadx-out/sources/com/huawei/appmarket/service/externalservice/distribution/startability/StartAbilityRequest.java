package com.huawei.appmarket.service.externalservice.distribution.startability;

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
import com.huawei.appmarket.service.externalservice.distribution.startability.StartAbilityRequest;

/* JADX INFO: loaded from: classes23.dex */
@RequireVersion(130201000)
public class StartAbilityRequest extends BaseServiceRequest {
    public static final Parcelable.Creator<StartAbilityRequest> CREATOR = new AutoParcelable.AutoCreator(StartAbilityRequest.class);

    public static class Builder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final StartAbilityRequest f5266b = new StartAbilityRequest();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ResultCallback<StartAbilityResponse> f5267c;
        private final AgdApiClient e;

        public Builder serviceInfo(ServiceInfo serviceInfo) {
            this.f5266b.setServiceInfo(serviceInfo);
            return this;
        }

        public void send() {
            PendingResult<StartAbilityRequest, StartAbilityResponse> pendingResultStartAbility = AgdHarmonyServiceApi.startAbility(this.e, this.f5266b);
            ResultCallback<StartAbilityResponse> resultCallback = this.f5267c;
            if (resultCallback == null) {
                resultCallback = new ResultCallback() { // from class: bpm
                    @Override // com.huawei.appgallery.agd.api.ResultCallback
                    public final void onResult(Status status) {
                        StartAbilityRequest.Builder.e(status);
                    }
                };
            }
            pendingResultStartAbility.setResultCallback(resultCallback);
        }

        public Builder referrer(String str) {
            this.f5266b.setReferrer(str);
            return this;
        }

        public Builder downloadParams(String str) {
            this.f5266b.setDownloadParams(str);
            return this;
        }

        public Builder callerContext(String str) {
            this.f5266b.setCallerContext(str);
            return this;
        }

        public Builder callback(ResultCallback<StartAbilityResponse> resultCallback) {
            this.f5267c = resultCallback;
            return this;
        }

        public Builder callSpec(String str) {
            this.f5266b.setCallSpec(str);
            return this;
        }

        public StartAbilityRequest build() {
            return this.f5266b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void e(Status status) {
            Log.i("StartAbilityRequest", "onStatus: " + ApiStatusCodes.getStatusCodeString(status.getStatusCode()));
        }

        public Builder(AgdApiClient agdApiClient) {
            this.e = agdApiClient;
        }
    }

    @Override // com.huawei.appmarket.service.externalservice.distribution.BaseServiceRequest, com.huawei.appgallery.coreservice.internal.framework.ipc.transport.data.BaseIPCRequest
    public String getMethod() {
        return "method.startAbility";
    }
}
