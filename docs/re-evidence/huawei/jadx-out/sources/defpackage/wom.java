package defpackage;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.huawei.health.messagecenter.api.MessageCenterApi;
import com.huawei.hwcloudmodel.callback.GrsQueryCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.utils.PhoneInfoUtils;
import com.huawei.pluginmessagecenter.util.HttpResCallback;
import com.huawei.thirdloginbasemodule.ThirdLoginDataStorageUtil;
import health.compact.a.GRSManager;
import health.compact.a.Services;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes43.dex */
public class wom {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static wom f52268a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final MessageCenterApi f52269c = (MessageCenterApi) Services.d("PluginMessageCenter", MessageCenterApi.class);
    private final Context e;

    private wom(Context context) {
        this.e = context.getApplicationContext();
    }

    public static wom a(Context context) {
        if (f52268a == null) {
            f52268a = new wom(context);
        }
        return f52268a;
    }

    public void d(final HttpResCallback httpResCallback) {
        LogUtil.a("InformationInteractors", "getInfoMoreUrl");
        final StringBuffer stringBuffer = new StringBuffer(256);
        String deviceId = LoginInit.getInstance(this.e).getDeviceId();
        if ("".equals(deviceId)) {
            deviceId = "clientnull";
        }
        stringBuffer.append("tokenType=").append(ThirdLoginDataStorageUtil.getTokenTypeValue());
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1008);
        if (!TextUtils.isEmpty(accountInfo)) {
            try {
                stringBuffer.append("&").append("token").append("=").append(URLEncoder.encode(accountInfo, StandardCharsets.UTF_8.name()));
            } catch (UnsupportedEncodingException e) {
                LogUtil.e("InformationInteractors", "token encode Exception", e.toString());
            }
        }
        if (LoginInit.getInstance(this.e).isLoginedByWear()) {
            stringBuffer.append("&appId=com.huawei.bone");
        } else {
            stringBuffer.append("&appId=").append(BaseApplication.getAppPackage());
        }
        stringBuffer.append("&deviceId=").append(deviceId);
        stringBuffer.append("&deviceType=").append(PhoneInfoUtils.getPhoneType());
        stringBuffer.append("&sysVersion=").append(Build.VERSION.RELEASE);
        stringBuffer.append("&appType=1&iVersion=2&language=zh_CN&ts=");
        stringBuffer.append(System.currentTimeMillis());
        stringBuffer.append("&upDeviceType=").append(LoginInit.getInstance(this.e).getDeviceType());
        GRSManager.c(this.e).d("messageCenterUrl", new GrsQueryCallback() { // from class: wom.5
            @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
            public void onCallBackSuccess(String str) {
                LogUtil.d("InformationInteractors", "GRSManager onCallBackSuccess MESSAGE_CENTER_KEY url = ", str);
                wom.this.f52269c.doMessagesPostReq(wom.this.e, str + "/messageCenter/getMoreInfoUrl", stringBuffer.toString(), httpResCallback);
            }

            @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
            public void onCallBackFail(int i) {
                LogUtil.d("InformationInteractors", "GRSManager onCallBackFail MESSAGE_CENTER_KEY code = ", Integer.valueOf(i));
            }
        });
    }
}
