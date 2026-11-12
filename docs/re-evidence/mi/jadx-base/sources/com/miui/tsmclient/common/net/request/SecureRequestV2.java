package com.miui.tsmclient.common.net.request;

import android.content.Context;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.miui.tsmclient.common.net.ErrorInfo;
import com.miui.tsmclient.common.net.RequestCallback;
import com.miui.tsmclient.common.net.Response;
import com.miui.tsmclient.common.net.ResponseListener;
import com.miui.tsmclient.common.net.host.AuthedHost;
import com.miui.tsmclient.common.net.host.Host;
import com.miui.tsmclient.net.TSMAuthContants;
import com.miui.tsmclient.util.DeviceUtils;
import com.miui.tsmclient.util.EnvironmentConfig;
import com.miui.tsmclient.util.LogUtils;
import java.io.IOException;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public class SecureRequestV2<T> extends BaseSecureRequest<T> {

    public static class ErrorData {

        @SerializedName("code")
        private int mErrorCode;

        @SerializedName("msg")
        private String mErrorMsg;

        private ErrorData() {
        }

        public int getErrorCode() {
            return this.mErrorCode;
        }

        public String getErrorMsg() {
            return this.mErrorMsg;
        }

        public String toString() {
            return new Gson().toJson(this);
        }
    }

    public SecureRequestV2(String str, String str2, TypeToken<T> typeToken) {
        this(str, str2, typeToken, (ResponseListener) null);
    }

    @Override // com.miui.tsmclient.common.net.request.BaseRequest
    public void addExtraParams() throws IOException {
        super.addExtraParams();
        String deviceFirmwareVersion = DeviceUtils.getDeviceFirmwareVersion(null);
        if (TextUtils.equals("tsmclient", deviceFirmwareVersion)) {
            return;
        }
        addHeader(TSMAuthContants.PARAM_FIRMWARE_VERSION, deviceFirmwareVersion);
    }

    @Override // com.miui.tsmclient.common.net.request.BaseRequest
    public String getCustomBody() {
        return getGson().toJson(getParams());
    }

    @Override // com.miui.tsmclient.common.net.request.BaseSecureRequest, com.miui.tsmclient.common.net.request.BaseRequest
    public boolean isSuccess() {
        return this.mResponse.isSuccess();
    }

    @Override // com.miui.tsmclient.common.net.request.BaseSecureRequest, com.miui.tsmclient.common.net.request.BaseRequest
    public Host onCreateHost() {
        return new AuthedHost();
    }

    @Override // com.miui.tsmclient.common.net.request.BaseRequest
    public BaseRequest<T> setResponse(boolean z, String str) throws IOException {
        if (z) {
            return super.setResponse(true, str);
        }
        try {
            ErrorData errorData = (ErrorData) getGson().fromJson(str, (Class) ErrorData.class);
            if (errorData != null) {
                this.mResponse = Response.error(errorData.getErrorCode(), errorData.getErrorMsg());
            }
            return this;
        } catch (Exception e) {
            LogUtils.d("parse error data failed, ignore.");
            throw new IOException(e);
        }
    }

    public SecureRequestV2(String str, String str2, Class<T> cls) {
        this(str, str2, TypeToken.get((Class) cls));
    }

    public SecureRequestV2(String str, String str2, Class<T> cls, ResponseListener<T> responseListener) {
        this(str, str2, TypeToken.get((Class) cls), responseListener);
    }

    public SecureRequestV2(String str, String str2, TypeToken<T> typeToken, final ResponseListener<T> responseListener) {
        super(str, str2, typeToken, new RequestCallback<T>() { // from class: com.miui.tsmclient.common.net.request.SecureRequestV2.1
            @Override // com.miui.tsmclient.common.net.RequestCallback
            public void onFailed(ErrorInfo errorInfo) {
                if (responseListener == null) {
                    return;
                }
                ErrorInfo errorInfoMapError = BaseSecureRequest.mapError(errorInfo);
                responseListener.onFailed(errorInfoMapError.mErrorCode, errorInfoMapError.mErrorDesc, null);
            }

            @Override // com.miui.tsmclient.common.net.RequestCallback
            public void onResponse(T t) {
                ResponseListener responseListener2 = responseListener;
                if (responseListener2 == null) {
                    return;
                }
                responseListener2.onSuccess(t);
            }
        });
        this.mRequestType = BaseRequest.RequestType.AUTH;
        this.mContentType = "application/json";
        addHeader(TSMAuthContants.PARAM_MIUI_ROM_TYPE, DeviceUtils.getMIUIRomType(null));
        addHeader(TSMAuthContants.PARAM_MIUI_SYSTEM_VERSION, DeviceUtils.getRomVersion());
        addHeader(TSMAuthContants.PARAM_HYPER_OS_VERSION, DeviceUtils.getHyperOSVersion());
        addHeader(TSMAuthContants.PARAM_HYPER_OS_ROM_TYPE, DeviceUtils.getHyperOSRomType());
        addHeader(TSMAuthContants.PARAM_ANDROID_VERSION, DeviceUtils.getAndroidVersion());
        addHeader("deviceModel", DeviceUtils.getDeviceModel(null));
        addHeader(TSMAuthContants.PARAM_LANGUAGE, Locale.getDefault().toString());
        Context context = EnvironmentConfig.getContext();
        if (context != null) {
            addHeader(TSMAuthContants.PARAM_TSMCLIENT_VERSION_CODE, String.valueOf(DeviceUtils.getAppVersionCode(context, "com.miui.tsmclient")));
            addHeader(TSMAuthContants.PARAM_TSMCLIENT_VERSION_NAME, String.valueOf(DeviceUtils.getAppVersionName(context, "com.miui.tsmclient")));
            addHeader("appVersionName", String.valueOf(DeviceUtils.getAppVersionName(context)));
            addHeader("appVersionCode", String.valueOf(DeviceUtils.getAppVersionCode(context)));
            addHeader(TSMAuthContants.PARAM_APP_PACKAGE_NAME, context.getPackageName());
        }
    }

    @Override // com.miui.tsmclient.common.net.request.BaseRequest
    public BaseRequest<T> setResponse(boolean z) throws IOException {
        return z ? setResponse(true, null) : this;
    }
}
