package com.huawei.health.device.wifi.interfaces;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.huawei.health.device.util.EventBus;
import com.huawei.health.messagecenter.model.CommonUtil;
import com.huawei.health.messagecenter.model.IpushBase;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.dya;
import defpackage.dyg;
import defpackage.eam;
import defpackage.eao;
import defpackage.ltb;
import health.compact.a.CompileParameterUtil;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class WiFiMultiUserPushReceiver implements IpushBase {
    private static final String MAIN_USER_AGREE_AUTHORIZATION = "14";
    private static final String MAIN_USER_REJECT_AUTHORIZATION = "15";
    private static final String MAIN_USER_RELEASE_AUTHORIZATION = "11";
    private static final String MAIN_USER_SHARE_DEVICE = "113";
    private static final String SUB_USER_AUTHORIZED_SUCCESS = "10";
    private static final String SUB_USER_EXIT_AUTHORIZATION = "12";
    private static final String SUB_USER_REQUEST_AUTHORIZATION = "13";
    private static final String TAG = "WiFiMultiUserPushReceiver";
    private static boolean isSubscribeSubUserRequestAuthorizeEventBus;
    private static Runnable laterNotifySubUserRequestAuthorize;

    public static void setIsSubscribeSubUserRequestAuthorizeEventBus(boolean z) {
        Runnable runnable;
        LogUtil.a(TAG, "setIsSubscribeSubUserRequestAuthorizeEventBus isSubscribe: ", Boolean.valueOf(z));
        isSubscribeSubUserRequestAuthorizeEventBus = z;
        if (!z || (runnable = laterNotifySubUserRequestAuthorize) == null) {
            return;
        }
        runnable.run();
    }

    @Override // com.huawei.health.messagecenter.model.IpushBase
    public List<String> getPushType() {
        return Arrays.asList(MAIN_USER_SHARE_DEVICE, "10", "11", "12", "13", "14", "15");
    }

    @Override // com.huawei.health.messagecenter.model.IpushBase
    public void processPushMsg(Context context, String str) {
        dyg.a(false, TAG, "get pushType msg time:", ltb.d(new Date()));
        if (TextUtils.isEmpty(str)) {
            dyg.c(false, TAG, "processPushMsg Error, PushMsg is Empty");
            return;
        }
        if (CompileParameterUtil.c("SUPPORT_WIFI_WEIGHT_DEVICE", false)) {
            dyg.a(false, TAG, "WiFiMultiUserPushReceiver processPushMsg():msg =", str);
            try {
                Gson gson = new Gson();
                HiWiFiSyncMsgPushBean hiWiFiSyncMsgPushBean = (HiWiFiSyncMsgPushBean) gson.fromJson(str, new TypeToken<HiWiFiSyncMsgPushBean>() { // from class: com.huawei.health.device.wifi.interfaces.WiFiMultiUserPushReceiver.1
                }.getType());
                dyg.a(false, TAG, "processPushMsg, pushType = ", hiWiFiSyncMsgPushBean.getPushType());
                HiWiFiSyncMsgPushBean.UserAccount userAccount = (HiWiFiSyncMsgPushBean.UserAccount) gson.fromJson(hiWiFiSyncMsgPushBean.getMsgContext(), HiWiFiSyncMsgPushBean.UserAccount.class);
                dyg.a(false, TAG, "processPushMsg, NUA = ", userAccount.getUserAccount());
                processByType(userAccount, hiWiFiSyncMsgPushBean);
            } catch (JsonSyntaxException e) {
                dyg.c(false, TAG, "processPushMsg JsonSyntaxException:", e.getMessage());
            }
        }
    }

    private void processByType(HiWiFiSyncMsgPushBean.UserAccount userAccount, HiWiFiSyncMsgPushBean hiWiFiSyncMsgPushBean) {
        if ("10".equals(hiWiFiSyncMsgPushBean.getPushType())) {
            eao.a().a(userAccount.getUserAccount());
            return;
        }
        if ("11".equals(hiWiFiSyncMsgPushBean.getPushType())) {
            Bundle bundle = new Bundle();
            bundle.putString("pushType", "release_auth");
            bundle.putString("pushContent", userAccount.getUserAccount());
            EventBus.a(new EventBus.d("multi_user_auto_cancle_dialog", bundle));
            eam.d().h();
            return;
        }
        if ("12".equals(hiWiFiSyncMsgPushBean.getPushType())) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("pushType", "sub_user_un_authorize");
            bundle2.putString("pushContent", userAccount.getUserAccount());
            EventBus.a(new EventBus.d("sub_user_unauthorize_notification", bundle2));
            eao.a().d();
            return;
        }
        if ("13".equals(hiWiFiSyncMsgPushBean.getPushType())) {
            LogUtil.a(TAG, "receive SUB_USER_REQUEST_AUTHORIZATION");
            pushSubUserRequestAuthorizeEvent(hiWiFiSyncMsgPushBean.getMsgContext(), "sub_user_req_authorize_notification");
            return;
        }
        if ("14".equals(hiWiFiSyncMsgPushBean.getPushType())) {
            LogUtil.a(TAG, "receive MAIN_USER_AGREE_AUTHORIZATION");
            eao.a().a(userAccount.getUserAccount());
            pushWifiDeviceEvent(hiWiFiSyncMsgPushBean.getMsgContext(), "authorization_agreed_notification");
        } else if ("15".equals(hiWiFiSyncMsgPushBean.getPushType())) {
            LogUtil.a(TAG, "receive MAIN_USER_REJECT_AUTHORIZATION");
            pushWifiDeviceEvent(hiWiFiSyncMsgPushBean.getMsgContext(), "authorization_rejected_notification");
        } else if (MAIN_USER_SHARE_DEVICE.equals(hiWiFiSyncMsgPushBean.getPushType())) {
            LogUtil.a(TAG, "receive MAIN_USER_SHARE_DEVICE");
            pushWifiDeviceEvent(hiWiFiSyncMsgPushBean.getMsgContext(), "device_main_share_to_sub_user");
        } else {
            dyg.d(false, TAG, "processPushMsg, pushType is other ");
        }
    }

    private void pushSubUserRequestAuthorizeEvent(final String str, final String str2) {
        LogUtil.a(TAG, "pushSubUserRequestAuthorizeEvent");
        if (isSubscribeSubUserRequestAuthorizeEventBus) {
            pushWifiDeviceEvent(str, str2);
            laterNotifySubUserRequestAuthorize = null;
        } else {
            LogUtil.j(TAG, "pushWifiDeviceEvent no subscribeSubUserRequestAuthorizeEvent");
            laterNotifySubUserRequestAuthorize = new Runnable() { // from class: com.huawei.health.device.wifi.interfaces.WiFiMultiUserPushReceiver$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m967x66f69e09(str, str2);
                }
            };
        }
    }

    /* JADX INFO: renamed from: lambda$pushSubUserRequestAuthorizeEvent$0$com-huawei-health-device-wifi-interfaces-WiFiMultiUserPushReceiver, reason: not valid java name */
    /* synthetic */ void m967x66f69e09(String str, String str2) {
        pushWifiDeviceEvent(str, str2);
        laterNotifySubUserRequestAuthorize = null;
    }

    private void pushWifiDeviceEvent(String str, String str2) {
        LogUtil.a(TAG, "pushWifiDeviceEvent:", str2);
        Bundle bundle = new Bundle();
        bundle.putString("pushContent", str);
        dya.b(new EventBus.d(str2, bundle));
    }

    public static class MessageContent {
        private String userAccount = "";
        private String prodId = "";

        public String getUserAccount() {
            return this.userAccount;
        }

        public void setUserAccount(String str) {
            this.userAccount = str;
        }

        public String getProdId() {
            return this.prodId;
        }

        public void setProdId(String str) {
            this.prodId = str;
        }
    }

    /* JADX INFO: loaded from: classes27.dex */
    static class HiWiFiSyncMsgPushBean {

        @SerializedName(CommonUtil.MSG_CONTENT)
        private String msgContext;

        @SerializedName("pushType")
        private String pushType = "";

        @SerializedName("pushId")
        private String pushId = "";

        private HiWiFiSyncMsgPushBean() {
        }

        static class UserAccount {

            @SerializedName("userAccount")
            private String userAccount = "";

            private UserAccount() {
            }

            public String getUserAccount() {
                return this.userAccount;
            }

            public void setUserAccount(String str) {
                this.userAccount = str;
            }
        }

        public String getPushType() {
            return this.pushType;
        }

        public void setPushType(String str) {
            this.pushType = str;
        }

        public String getPushId() {
            return this.pushId;
        }

        public void setPushId(String str) {
            this.pushId = str;
        }

        public String getMsgContext() {
            return this.msgContext;
        }

        public void setMsgContext(String str) {
            this.msgContext = str;
        }

        public String toString() {
            return "HiWiFiSyncMsgPushBean{, pushType ='" + this.pushType + "', pushId ='" + this.pushId + "'}";
        }
    }
}
