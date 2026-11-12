package com.miui.tsmclient.common.net.request;

import android.content.Context;
import android.text.TextUtils;
import com.google.gson.reflect.TypeToken;
import com.miui.tsmclient.common.data.CommonResponseInfo;
import com.miui.tsmclient.common.net.ErrorInfo;
import com.miui.tsmclient.common.net.RequestCallback;
import com.miui.tsmclient.common.net.ResponseListener;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.net.TSMAuthContants;
import com.miui.tsmclient.util.CardEnvironmentConfig;
import com.miui.tsmclient.util.DeviceUtils;
import com.miui.tsmclient.util.EnvironmentConfig;
import com.miui.tsmclient.util.LogUtils;
import java.io.IOException;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public class SecureRequest<T extends CommonResponseInfo> extends BaseSecureRequest<T> {
    public SecureRequest(String str, String str2, TypeToken<T> typeToken) {
        this(str, str2, typeToken, (ResponseListener) null);
    }

    @Override // com.miui.tsmclient.common.net.request.BaseRequest
    public void addExtraParams() throws IOException {
        super.addExtraParams();
        String deviceFirmwareVersion = DeviceUtils.getDeviceFirmwareVersion(null);
        if (!TextUtils.equals("tsmclient", deviceFirmwareVersion)) {
            addParams(TSMAuthContants.PARAM_FIRMWARE_VERSION, deviceFirmwareVersion);
        }
        if (EnvironmentConfig.isSupportNfc()) {
            try {
                addParams("cplc", new CardInfo(CardInfo.CARD_TYPE_DUMMY).getTerminal().getCPLC());
            } catch (IOException e) {
                LogUtils.e("SecureRequest add cplc failed", e);
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                throw new IOException("SecureRequest add cplc failed", e2);
            }
        }
    }

    @Override // com.miui.tsmclient.common.net.request.BaseSecureRequest, com.miui.tsmclient.common.net.request.BaseRequest
    public boolean isSuccess() {
        return super.isSuccess() && getResult().isSuccess();
    }

    public SecureRequest(String str, String str2, Class<T> cls) {
        this(str, str2, TypeToken.get((Class) cls));
    }

    public SecureRequest(String str, String str2, Class<T> cls, ResponseListener<T> responseListener) {
        this(str, str2, TypeToken.get((Class) cls), responseListener);
    }

    public SecureRequest(String str, String str2, TypeToken<T> typeToken, final ResponseListener<T> responseListener) {
        super(str, str2, typeToken, new RequestCallback<T>() { // from class: com.miui.tsmclient.common.net.request.SecureRequest.1
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
                if (responseListener == null) {
                    return;
                }
                if (t.isSuccess()) {
                    responseListener.onSuccess(t);
                } else {
                    responseListener.onFailed(t.getErrorCode(), t.getErrorDesc(), t);
                }
            }
        });
        this.mRequestType = CardEnvironmentConfig.getDefaultSecureType();
        String mIUIRomType = DeviceUtils.getMIUIRomType(null);
        String romVersion = DeviceUtils.getRomVersion();
        String hyperOSRomType = DeviceUtils.getHyperOSRomType();
        String hyperOSVersion = DeviceUtils.getHyperOSVersion();
        LogUtils.t("miuiROMType: " + mIUIRomType + " miuiROMVersion: " + romVersion + " osROMType: " + hyperOSRomType + " osROMVersion: " + hyperOSVersion);
        addParams(TSMAuthContants.PARAM_MIUI_ROM_TYPE, mIUIRomType);
        addParams(TSMAuthContants.PARAM_MIUI_SYSTEM_VERSION, romVersion);
        addParams(TSMAuthContants.PARAM_HYPER_OS_VERSION, hyperOSVersion);
        addParams(TSMAuthContants.PARAM_HYPER_OS_ROM_TYPE, hyperOSRomType);
        addParams(TSMAuthContants.PARAM_ANDROID_VERSION, DeviceUtils.getAndroidVersion());
        addParams("deviceModel", DeviceUtils.getDeviceModel(null));
        addParams(TSMAuthContants.PARAM_LANGUAGE, Locale.getDefault().toString());
        Context context = EnvironmentConfig.getContext();
        if (context != null) {
            addParams(TSMAuthContants.PARAM_TSMCLIENT_VERSION_CODE, String.valueOf(DeviceUtils.getAppVersionCode(context, "com.miui.tsmclient")));
            addParams(TSMAuthContants.PARAM_TSMCLIENT_VERSION_NAME, String.valueOf(DeviceUtils.getAppVersionName(context, "com.miui.tsmclient")));
            addParams("appVersionName", String.valueOf(DeviceUtils.getAppVersionName(context)));
            addParams("appVersionCode", String.valueOf(DeviceUtils.getAppVersionCode(context)));
            addParams(TSMAuthContants.PARAM_APP_PACKAGE_NAME, context.getPackageName());
        }
    }
}
