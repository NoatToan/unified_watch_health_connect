package defpackage;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.huawei.haf.common.os.SystemInfo;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.api.constant.GetDeviceInfoMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.messagecenter.model.IpushBase;
import com.huawei.health.messagecenter.model.IpushTokenCallback;
import com.huawei.health.messagecenter.model.MessageObject;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.hwcloudmodel.callback.GrsQueryCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.operation.utils.AppTypeUtils;
import com.huawei.operation.utils.PhoneInfoUtils;
import com.huawei.pluginmessagecenter.manager.MCNotificationManager;
import com.huawei.pluginmessagecenter.provider.data.MessageChangeEvent;
import com.huawei.pluginmessagecenter.service.MessageObserver;
import com.huawei.pluginmessagecenter.util.HttpResCallback;
import com.huawei.thirdloginbasemodule.ThirdLoginDataStorageUtil;
import com.huawei.up.model.UserInfomation;
import health.compact.a.AuthorizationUtils;
import health.compact.a.CommonUtil;
import health.compact.a.CompileParameterUtil;
import health.compact.a.GRSManager;
import health.compact.a.KeyValDbManager;
import health.compact.a.Services;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes42.dex */
public class phk implements IpushBase, IpushTokenCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f45375a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f45376c = new Object();
    private static String d;
    private MessageObserver e = new MessageObserver() { // from class: phk.2
        @Override // com.huawei.pluginmessagecenter.service.MessageObserver
        public void onChange(int i, MessageChangeEvent messageChangeEvent) {
            LogUtil.a("UIDV_MessagePushReceiver", "MessageObserver onChange start");
            phk.this.e();
        }
    };

    public static void a(String str) {
        LogUtil.d("UIDV_MessagePushReceiver", "onToken()  ==> saveToken token = ", str);
        String strE = e(BaseApplication.getContext(), str);
        LogUtil.d("UIDV_MessagePushReceiver", "saveToken params ", strE);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        LogUtil.a("UIDV_MessagePushReceiver", "saveToken==>doSaveToken!");
        e(BaseApplication.getContext(), str, strE, d, f45375a);
    }

    public static void e(final Context context, final String str, final String str2, final String str3, final String str4) {
        ReleaseLogUtil.d("R_UIDV_MessagePushReceiver", "doSaveToken token is: ", CommonUtil.n(str), "deviceId is: ", CommonUtil.n(str4));
        if (!Utils.h()) {
            LogUtil.a("UIDV_MessagePushReceiver", "doSaveToken isNoCloudVersion");
        } else {
            GRSManager.c(context).d("messageCenterUrl", new GrsQueryCallback() { // from class: phk.3
                @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
                public void onCallBackSuccess(String str5) {
                    LogUtil.a("UIDV_MessagePushReceiver", "MESSAGE_CENTER_KEY SUCCESS");
                    phm.a(context, str5 + com.huawei.health.messagecenter.model.CommonUtil.MESSAGE_CENTER_SAVE_TOKEN, str2, new HttpResCallback() { // from class: phk.3.3
                        @Override // com.huawei.pluginmessagecenter.util.HttpResCallback
                        public void onSucceed(String str6, String str7, String str8) {
                            ReleaseLogUtil.d("R_UIDV_MessagePushReceiver", "doSaveToken onSucceed");
                            LogUtil.d("UIDV_MessagePushReceiver", "doSaveToken HttpUtils.doPostReq onSucceed ==> result =", str6);
                            pgz.c(context).g(str3);
                            pgz.c(context).f(str);
                            pgz.c(context).h(str4);
                            KeyValDbManager.d(context).b("key_push_register_status", "1");
                        }

                        @Override // com.huawei.pluginmessagecenter.util.HttpResCallback
                        public void onFailed(int i) {
                            ReleaseLogUtil.a("R_UIDV_MessagePushReceiver", "doSaveToken HttpUtils.doPostReq onFailed ==> resCode =", Integer.valueOf(i));
                        }
                    });
                }

                @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
                public void onCallBackFail(int i) {
                    LogUtil.e("UIDV_MessagePushReceiver", "onCallBackFail resCode = ", Integer.valueOf(i));
                }
            });
            LogUtil.a("UIDV_MessagePushReceiver", "Leave doSaveToken");
        }
    }

    public static String e(Context context, String str) {
        String strD = CommonUtil.d(BaseApplication.getContext(), false);
        LogUtil.d("UIDV_MessagePushReceiver", "getBodyWithToken deviceId= ", strD);
        StringBuffer stringBufferC = c(context, str, strD);
        d = LoginInit.getInstance(context).getAccountInfo(1011);
        f45375a = strD;
        return stringBufferC.toString();
    }

    private static StringBuffer c(Context context, String str, String str2) {
        String strG;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("tokenType=").append(String.valueOf(ThirdLoginDataStorageUtil.getTokenTypeValue()));
        stringBuffer.append("&appType=").append(String.valueOf(AppTypeUtils.getAppType()));
        stringBuffer.append(Constants.VERSION).append(CommonUtil.a(BaseApplication.getContext()));
        stringBuffer.append("&sysVersion=").append(Build.VERSION.RELEASE);
        stringBuffer.append("&iVersion=2");
        UserInfomation userInfo = ((UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class)).getUserInfo();
        if (userInfo != null) {
            stringBuffer.append(Constants.LANGUAGE).append(userInfo.getLanguageCode());
        }
        String strD = com.huawei.haf.application.BaseApplication.d();
        stringBuffer.append("&token=").append(d());
        stringBuffer.append("&appId=").append(strD);
        stringBuffer.append("&deviceId=").append(str2);
        if (!TextUtils.isEmpty(str) && str.length() <= 256) {
            stringBuffer.append("&pushToken=").append(str);
        }
        c(context, stringBuffer);
        d(stringBuffer);
        if (!AuthorizationUtils.c(BaseApplication.getContext())) {
            strG = "unknown";
        } else {
            strG = CommonUtil.g();
        }
        stringBuffer.append("&").append("sn").append("=").append(strG);
        stringBuffer.append("&").append("ts").append("=").append(System.currentTimeMillis());
        e(stringBuffer);
        stringBuffer.append("&").append("environment").append("=").append(CommonUtil.o(BaseApplication.getContext()));
        stringBuffer.append("&").append("upDeviceType").append("=").append(LoginInit.getInstance(com.huawei.haf.application.BaseApplication.b()).getDeviceType());
        stringBuffer.append("&").append("siteId").append("=").append(LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1009));
        return stringBuffer;
    }

    private static void e(StringBuffer stringBuffer) {
        DeviceInfo deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.ACTIVE_MAIN_DEVICES_WITHOUT_AW70, null, "UIDV_MessagePushReceiver");
        if (deviceInfo != null) {
            stringBuffer.append("&").append("bindDeviceType").append("=").append(deviceInfo.getProductType());
            stringBuffer.append("&").append("deviceType").append("=").append(deviceInfo.getDeviceModel());
        } else {
            stringBuffer.append("&").append("deviceType").append("=").append(PhoneInfoUtils.getDeviceModel());
        }
    }

    private static void c(Context context, StringBuffer stringBuffer) {
        if (CommonUtil.z(context)) {
            stringBuffer.append("&").append("pushType").append("=").append("1");
        } else {
            stringBuffer.append("&").append("pushType").append("=").append("0");
        }
    }

    private static void d(StringBuffer stringBuffer) {
        if (CompileParameterUtil.c("GOOGLE_PLAY_OEM_BETTERME", false)) {
            if (SystemInfo.d()) {
                stringBuffer.append("&").append("phoneType").append("=").append("HW_GP");
                return;
            } else {
                stringBuffer.append("&").append("phoneType").append("=").append("3RD_GP");
                return;
            }
        }
        stringBuffer.append("&").append("phoneType").append("=").append(PhoneInfoUtils.getPhoneType());
    }

    @Override // com.huawei.health.messagecenter.model.IpushBase
    public List<String> getPushType() {
        return Arrays.asList("2");
    }

    @Override // com.huawei.health.messagecenter.model.IpushBase
    public void processPushMsg(Context context, String str) {
        if (str == null || "".equals(str) || str.length() < 1) {
            LogUtil.e("UIDV_MessagePushReceiver", "processPushMsg Error PushMsg is Empty");
        } else {
            LogUtil.a("UIDV_MessagePushReceiver", "msg = ", str);
            ThreadPoolManager.c().execute(new Runnable() { // from class: phk.4
                @Override // java.lang.Runnable
                public void run() {
                    LogUtil.a("UIDV_MessagePushReceiver", "startMessageNotificationObserver doRefresh()");
                    if (phk.this.e != null) {
                        LogUtil.a("UIDV_MessagePushReceiver", "openMessageObserver registerMessageObserver");
                        pha.e(BaseApplication.getContext()).d(phk.this.e);
                    }
                    pha.e(BaseApplication.getContext()).d();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        LogUtil.a("UIDV_MessagePushReceiver", "refreshNotificationMessage enter");
        synchronized (f45376c) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: phk.5
                @Override // java.lang.Runnable
                public void run() {
                    List<MessageObject> listB = pha.e(BaseApplication.getContext()).b(2);
                    if (listB == null || listB.isEmpty()) {
                        LogUtil.a("UIDV_MessagePushReceiver", "refreshNotificationMessage notificationMessageList empty");
                        return;
                    }
                    LogUtil.a("UIDV_MessagePushReceiver", "refreshNotificationMessage notificationMessageList show count = ", Integer.valueOf(listB.size()));
                    Iterator<MessageObject> it = listB.iterator();
                    while (it.hasNext()) {
                        phk.this.c(it.next());
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(MessageObject messageObject) {
        LogUtil.a("UIDV_MessagePushReceiver", "showNotificationMsg");
        MCNotificationManager.showNotification(BaseApplication.getContext(), messageObject);
    }

    @Override // com.huawei.health.messagecenter.model.IpushTokenCallback
    public void pushTokenHandle(Context context, String str) {
        a(str);
    }

    public static String d() {
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1008);
        if (!TextUtils.isEmpty(accountInfo)) {
            try {
                return URLEncoder.encode(accountInfo, StandardCharsets.UTF_8.name());
            } catch (UnsupportedEncodingException unused) {
                LogUtil.e("UIDV_MessagePushReceiver", "token encode Exception UnsupportedEncodingException");
            }
        }
        return accountInfo;
    }
}
