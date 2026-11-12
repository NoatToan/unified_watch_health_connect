package com.amazon.identity.auth.device.endpoint;

import android.content.Context;
import android.util.Pair;
import com.amazon.identity.auth.device.dataobject.AppInfo;
import com.amazon.identity.auth.map.device.utils.MAPLog;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class OneTimeCodeRequest extends AbstractJsonPandaRequest<OneTimeCodeResponse> {
    private static final String ACCESS_TOKEN_PARAMETER = "accessToken";
    private static final String LOG_TAG = "com.amazon.identity.auth.device.endpoint.OneTimeCodeRequest";
    private static final String ONE_TIME_CODE_ENDPOINT = "/auth/create/oneTimeCode";
    private static final String WORKFLOW_CLIENT_ID_PARAMETER = "workflowClientId";
    private String accessToken;
    private String workflowClientId;

    public OneTimeCodeRequest(Context context, String str, String str2, AppInfo appInfo) {
        super(context, appInfo);
        this.workflowClientId = str;
        this.accessToken = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OneTimeCodeRequest oneTimeCodeRequest = (OneTimeCodeRequest) obj;
        String str = this.accessToken;
        if ((str == null && oneTimeCodeRequest.accessToken != null) || !str.equals(oneTimeCodeRequest.accessToken)) {
            return false;
        }
        String str2 = this.workflowClientId;
        return (str2 != null || oneTimeCodeRequest.workflowClientId == null) && str2.equals(oneTimeCodeRequest.workflowClientId);
    }

    @Override // com.amazon.identity.auth.device.endpoint.AbstractPandaRequest
    public String getEndPoint() {
        return ONE_TIME_CODE_ENDPOINT;
    }

    @Override // com.amazon.identity.auth.device.endpoint.AbstractPandaRequest
    public List<Pair<String, String>> getExtraParameters() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Pair(WORKFLOW_CLIENT_ID_PARAMETER, this.workflowClientId));
        arrayList.add(new Pair("accessToken", this.accessToken));
        return arrayList;
    }

    public int hashCode() {
        String str = this.accessToken;
        int iHashCode = ((str == null ? 0 : str.hashCode()) + 31) * 31;
        String str2 = this.workflowClientId;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.amazon.identity.auth.device.endpoint.AbstractHTTPSRequest
    public void logRequest() {
        MAPLog.pii(LOG_TAG, "Executing create one time code request. workflowClientId=" + this.workflowClientId, "accessToken=" + this.accessToken);
    }

    @Override // com.amazon.identity.auth.device.endpoint.AbstractHTTPSRequest
    public OneTimeCodeResponse generateResponse(HttpResponse httpResponse) {
        return new OneTimeCodeResponse(httpResponse);
    }
}
