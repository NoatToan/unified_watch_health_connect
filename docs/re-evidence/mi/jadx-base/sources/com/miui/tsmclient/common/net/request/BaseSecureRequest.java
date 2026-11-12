package com.miui.tsmclient.common.net.request;

import android.text.TextUtils;
import com.google.gson.reflect.TypeToken;
import com.miui.tsmclient.common.net.ErrorInfo;
import com.miui.tsmclient.common.net.RequestCallback;
import com.miui.tsmclient.common.net.host.AuthHost;
import com.miui.tsmclient.common.net.host.Host;
import com.miui.tsmclient.model.ErrorCode;
import com.miui.tsmclient.util.EnvironmentConfig;

/* JADX INFO: loaded from: classes4.dex */
public class BaseSecureRequest<T> extends GsonRequest<T> {
    public BaseSecureRequest(String str, String str2, TypeToken<T> typeToken) {
        this(str, str2, typeToken, (RequestCallback) null);
    }

    public static ErrorInfo mapError(ErrorInfo errorInfo) {
        if (errorInfo == null) {
            errorInfo = ErrorInfo.DEFAULT_ERROR_INFO;
        }
        if (!TextUtils.isEmpty(errorInfo.mErrorDesc)) {
            return errorInfo;
        }
        int i = errorInfo.mErrorCode;
        if (i == -1) {
            i = 2;
        } else if (i == 14) {
            i = 14;
        }
        return new ErrorInfo(i, ErrorCode.findText(EnvironmentConfig.getContext(), i));
    }

    @Override // com.miui.tsmclient.common.net.request.BaseRequest
    public String getUrl() {
        return String.format((EnvironmentConfig.isStaging() ? this.mHost.getStagingHost() : this.mHost.getOnlineHost()) + this.mPath, this.mHost.getAuthType());
    }

    @Override // com.miui.tsmclient.common.net.request.BaseRequest
    public boolean isSuccess() {
        return super.isSuccess() && getResult() != null;
    }

    @Override // com.miui.tsmclient.common.net.request.BaseRequest
    public Host onCreateHost() {
        return new AuthHost();
    }

    public BaseSecureRequest(String str, String str2, Class<T> cls) {
        this(str, str2, TypeToken.get((Class) cls));
    }

    public BaseSecureRequest(String str, String str2, Class<T> cls, RequestCallback<T> requestCallback) {
        this(str, str2, TypeToken.get((Class) cls), requestCallback);
    }

    public BaseSecureRequest(String str, String str2, TypeToken<T> typeToken, RequestCallback<T> requestCallback) {
        super(str, str2, typeToken, requestCallback);
    }
}
