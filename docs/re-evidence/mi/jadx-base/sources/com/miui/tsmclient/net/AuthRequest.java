package com.miui.tsmclient.net;

import android.content.Context;
import android.text.TextUtils;
import com.miui.tsmclient.account.AccountInfo;
import com.miui.tsmclient.common.net.host.AuthHost;
import com.miui.tsmclient.common.net.host.Host;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.util.DeviceUtils;
import com.miui.tsmclient.util.EnvironmentConfig;
import com.miui.tsmclient.util.LogUtils;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class AuthRequest {
    private Map<String, String> mCookies;
    private Map<String, String> mHeaders;
    private Host mHost;
    private Map<String, String> mParams;
    private RespContentType mRespContentType;
    private String mUrl;

    public static class AuthRequestBuilder {
        private Host mHost;
        private RespContentType mRespContentType;
        private String mUrl;
        private Map<String, String> mCookies = new HashMap();
        private Map<String, String> mParams = new HashMap();
        private Map<String, String> mHeaders = new HashMap();

        private AuthRequestBuilder() {
        }

        public static AuthRequestBuilder newBuilder(AccountInfo accountInfo, String str, RespContentType respContentType) {
            return newBuilder(accountInfo, new AuthHost(), str, respContentType);
        }

        public AuthRequestBuilder addHeader(String str, String str2) {
            this.mHeaders.put(str, str2);
            return this;
        }

        public AuthRequestBuilder addParams(String str, String str2) {
            this.mParams.put(str, str2);
            return this;
        }

        public AuthRequest create() {
            AuthRequest authRequest = new AuthRequest();
            authRequest.mParams = this.mParams;
            authRequest.mCookies = this.mCookies;
            authRequest.mHeaders = this.mHeaders;
            authRequest.mHost = this.mHost;
            authRequest.mUrl = this.mUrl;
            authRequest.mRespContentType = this.mRespContentType;
            return authRequest;
        }

        public static AuthRequestBuilder newBuilder(AccountInfo accountInfo, Host host, String str, RespContentType respContentType) {
            AuthRequestBuilder authRequestBuilder = new AuthRequestBuilder();
            if (accountInfo != null) {
                authRequestBuilder.mCookies.put("userId", accountInfo.getUserId());
                authRequestBuilder.mCookies.put("serviceToken", accountInfo.getServiceToken());
                authRequestBuilder.mParams.put("userId", accountInfo.getUserId());
                authRequestBuilder.mParams.put(TSMAuthContants.PARAM_MIUI_ROM_TYPE, DeviceUtils.getMIUIRomType(null));
                authRequestBuilder.mParams.put(TSMAuthContants.PARAM_MIUI_SYSTEM_VERSION, DeviceUtils.getRomVersion());
                authRequestBuilder.mParams.put(TSMAuthContants.PARAM_HYPER_OS_VERSION, DeviceUtils.getHyperOSVersion());
                authRequestBuilder.mParams.put(TSMAuthContants.PARAM_HYPER_OS_ROM_TYPE, DeviceUtils.getHyperOSRomType());
                authRequestBuilder.mParams.put(TSMAuthContants.PARAM_ANDROID_VERSION, DeviceUtils.getAndroidVersion());
                Context context = EnvironmentConfig.getContext();
                if (context != null) {
                    authRequestBuilder.mParams.put(TSMAuthContants.PARAM_TSMCLIENT_VERSION_CODE, String.valueOf(DeviceUtils.getAppVersionCode(context, "com.miui.tsmclient")));
                    authRequestBuilder.mParams.put(TSMAuthContants.PARAM_TSMCLIENT_VERSION_NAME, String.valueOf(DeviceUtils.getAppVersionName(context, "com.miui.tsmclient")));
                    authRequestBuilder.mParams.put("appVersionName", String.valueOf(DeviceUtils.getAppVersionName(context)));
                    authRequestBuilder.mParams.put("appVersionCode", String.valueOf(DeviceUtils.getAppVersionCode(context)));
                    authRequestBuilder.mParams.put(TSMAuthContants.PARAM_APP_PACKAGE_NAME, context.getPackageName());
                }
            }
            authRequestBuilder.mHost = host;
            authRequestBuilder.mUrl = str;
            authRequestBuilder.mRespContentType = respContentType;
            authRequestBuilder.mParams.put("deviceModel", DeviceUtils.getDeviceModel(null));
            String deviceFirmwareVersion = DeviceUtils.getDeviceFirmwareVersion(null);
            if (!TextUtils.equals("tsmclient", deviceFirmwareVersion)) {
                authRequestBuilder.mParams.put(TSMAuthContants.PARAM_FIRMWARE_VERSION, deviceFirmwareVersion);
            }
            if (EnvironmentConfig.isSupportNfc()) {
                try {
                    authRequestBuilder.mParams.put("cplc", new CardInfo(CardInfo.CARD_TYPE_DUMMY).getTerminal().getCPLC());
                } catch (IOException e) {
                    LogUtils.e("AuthRequest add cplc failed", e);
                } catch (InterruptedException e2) {
                    Thread.currentThread().interrupt();
                    LogUtils.e("AuthRequest add cplc failed", e2);
                }
            }
            authRequestBuilder.mParams.put(TSMAuthContants.PARAM_LANGUAGE, Locale.getDefault().toString());
            return authRequestBuilder;
        }
    }

    public enum RespContentType {
        json,
        protobuf
    }

    private AuthRequest() {
    }

    private String getServer() {
        return EnvironmentConfig.isStaging() ? this.mHost.getStagingHost() : this.mHost.getOnlineHost();
    }

    public void addHeader(String str, String str2) {
        this.mHeaders.put(str, str2);
    }

    public void addParams(String str, String str2) {
        this.mParams.put(str, str2);
    }

    public Map<String, String> getCookies() {
        return this.mCookies;
    }

    public Map<String, String> getHeaders() {
        return this.mHeaders;
    }

    public Map<String, String> getParams() {
        return this.mParams;
    }

    public String getRequestFullUrl() {
        if (this.mUrl == null) {
            this.mUrl = "";
        }
        return String.format(getServer() + this.mUrl, this.mHost.getAuthType());
    }

    public RespContentType getRespContentType() {
        return this.mRespContentType;
    }
}
