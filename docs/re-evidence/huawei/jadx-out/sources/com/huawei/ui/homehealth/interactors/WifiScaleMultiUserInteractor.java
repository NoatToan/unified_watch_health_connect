package com.huawei.ui.homehealth.interactors;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.google.gson.Gson;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.device.ui.measure.activity.WifiDeviceAuthRequestListActivity;
import com.huawei.health.device.ui.measure.activity.WifiDeviceShareActivity;
import com.huawei.health.device.util.EventBus;
import com.huawei.health.device.wifi.interfaces.WiFiMultiUserPushReceiver;
import com.huawei.health.messagecenter.api.MessageCenterApi;
import com.huawei.health.messagecenter.model.MessageObject;
import com.huawei.hwcloudmodel.callback.ICloudOperationResult;
import com.huawei.hwcloudmodel.model.CloudCommonReponse;
import com.huawei.hwcloudmodel.model.unite.WifiDeviceAuthorizeByMainUserReq;
import com.huawei.hwcloudmodel.model.unite.WifiDeviceGetSubUserAuthMsgReq;
import com.huawei.hwcloudmodel.model.unite.WifiDeviceGetSubUserAuthMsgRsp;
import com.huawei.hwcloudmodel.model.unite.WifiDeviceSubUserAuthMsg;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.device.R;
import defpackage.drw;
import defpackage.dxm;
import defpackage.eam;
import defpackage.ean;
import defpackage.eby;
import defpackage.ecf;
import defpackage.ecl;
import defpackage.lqo;
import defpackage.njy;
import health.compact.a.Services;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public class WifiScaleMultiUserInteractor {
    private static final String[] d = {"sub_user_req_authorize_notification", "authorization_agreed_notification", "authorization_rejected_notification", "wifi_scale_auth_refresh", "device_main_share_to_sub_user"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f25564b;

    public WifiScaleMultiUserInteractor(Context context) {
        e(context);
    }

    private void e(Context context) {
        a aVar = new a(context);
        this.f25564b = aVar;
        EventBus.b(aVar, 0, d);
        WiFiMultiUserPushReceiver.setIsSubscribeSubUserRequestAuthorizeEventBus(true);
    }

    public void c() {
        EventBus.a(this.f25564b, d);
        WiFiMultiUserPushReceiver.setIsSubscribeSubUserRequestAuthorizeEventBus(false);
    }

    static class a implements EventBus.ICallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f25565a = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private NoTitleCustomAlertDialog f25566c;
        private String d;
        private WeakReference<Context> e;

        a(Context context) {
            this.e = new WeakReference<>(context);
        }

        @Override // com.huawei.health.device.util.EventBus.ICallback
        public void onEvent(EventBus.d dVar) throws Throwable {
            WeakReference<Context> weakReference = this.e;
            if (weakReference == null) {
                LogUtil.j("WifiScaleMultiUserInteractor", "mContext is null");
                return;
            }
            Context context = weakReference.get();
            if (context == null) {
                LogUtil.j("WifiScaleMultiUserInteractor", "mContext.get() is null");
                return;
            }
            if (dVar == null) {
                LogUtil.j("WifiScaleMultiUserInteractor", "event is null");
                return;
            }
            String strE = dVar.e();
            if (TextUtils.isEmpty(strE)) {
                LogUtil.j("WifiScaleMultiUserInteractor", "onEvent() action is empty.");
            } else {
                b(dVar, context, strE);
            }
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:25:0x005b  */
        private void b(EventBus.d dVar, Context context, String str) throws Throwable {
            byte b2;
            LogUtil.a("WifiScaleMultiUserInteractor", "dealWifiScaleEventAction action: ", str, " mIsReceiveAgreedMsg: ", Boolean.valueOf(this.f25565a));
            str.hashCode();
            switch (str) {
                case "authorization_rejected_notification":
                    b2 = 0;
                    break;
                case "sub_user_req_authorize_notification":
                    b2 = 1;
                    break;
                case "authorization_agreed_notification":
                    b2 = 2;
                    break;
                case "device_main_share_to_sub_user":
                    b2 = 3;
                    break;
                case "wifi_scale_auth_refresh":
                    b2 = 4;
                    break;
                default:
                    b2 = -1;
                    break;
            }
            if (b2 == 0) {
                this.d = b(dVar.b());
                return;
            }
            if (b2 == 1) {
                d(context, dVar.b());
                return;
            }
            if (b2 == 2) {
                this.d = b(dVar.b());
                eam.d().a(this.d);
                this.f25565a = true;
                return;
            }
            if (b2 != 3) {
                if (b2 == 4) {
                    if (!this.f25565a || TextUtils.isEmpty(this.d)) {
                        return;
                    }
                    c(context, context.getResources().getString(R.string.IDS_messagecenter_device_scale), b(this.d), context.getResources().getString(R.string.IDS_hw_device_wifi_authorized_text));
                    d(this.d);
                    this.f25565a = false;
                    return;
                }
                LogUtil.j("WifiScaleMultiUserInteractor", "event action unknown: ", str);
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(dVar.b().getString("pushContent"));
                String string = jSONObject.getString("userAccount");
                String string2 = context.getResources().getString(R.string.IDS_device_herm_name);
                String strT = dxm.t(jSONObject.getString("prodId"));
                this.d = strT;
                if ("b29df4e3-b1f7-4e40-960d-4cfb63ccca05".equals(strT)) {
                    string2 = context.getResources().getString(R.string.IDS_device_hag2021_name);
                    LogUtil.a("WifiScaleMultiUserInteractor", "HonourDeviceConstants.DEVICE_HAG2021_WEIGHT scalesName: ", string2);
                }
                c(context, context.getResources().getString(R.string.IDS_messagecenter_device_scale), c(this.d), String.format(Locale.ENGLISH, context.getResources().getString(R.string.IDS_device_share_subuser_authorize_1), string, string2));
            } catch (JSONException unused) {
                LogUtil.e("WifiScaleMultiUserInteractor", "EVEBUS_WIFI_DEVICE_SHARE_TO_SUB_USER JSONException");
            }
        }

        private void d(String str) throws Throwable {
            eby ebyVarE = ecf.e(str);
            if (ebyVarE != null) {
                LogUtil.a("WifiScaleMultiUserInteractor", "sendUserInfo to cloud ");
                ean.b(ebyVarE.e(), dxm.ag(str));
            }
        }

        private String b(Bundle bundle) {
            if (bundle == null) {
                LogUtil.j("WifiScaleMultiUserInteractor", "getProductId fail, bundle is null");
                return "";
            }
            String string = bundle.getString("pushContent");
            if (TextUtils.isEmpty(string)) {
                LogUtil.e("WifiScaleMultiUserInteractor", "getProductId fail, pushContent is null");
                return "";
            }
            WiFiMultiUserPushReceiver.MessageContent messageContent = (WiFiMultiUserPushReceiver.MessageContent) new Gson().fromJson(string, WiFiMultiUserPushReceiver.MessageContent.class);
            if (messageContent == null) {
                LogUtil.j("WifiScaleMultiUserInteractor", "getProductId fail: MessageContent is null");
                return "";
            }
            return dxm.t(messageContent.getProdId());
        }

        private String a(Bundle bundle) {
            String strB = b(bundle);
            if (TextUtils.isEmpty(strB)) {
                LogUtil.j("WifiScaleMultiUserInteractor", "getDeviceId fail, product id from push is null");
                return "";
            }
            HealthDevice healthDeviceB = drw.e().b(strB);
            if (!(healthDeviceB instanceof eby)) {
                LogUtil.j("WifiScaleMultiUserInteractor", "getDeviceId fail, not wifiDevice");
                return "";
            }
            return ((eby) healthDeviceB).e();
        }

        private void d(final Context context, Bundle bundle) {
            LogUtil.j("WifiScaleMultiUserInteractor", "getRequestAuthorizationDetail enter");
            final String strA = a(bundle);
            if (TextUtils.isEmpty(strA)) {
                LogUtil.j("WifiScaleMultiUserInteractor", "getRequestAuthorizationDetail fail, get devId failed");
                return;
            }
            WifiDeviceGetSubUserAuthMsgReq wifiDeviceGetSubUserAuthMsgReq = new WifiDeviceGetSubUserAuthMsgReq();
            wifiDeviceGetSubUserAuthMsgReq.setDevId(strA);
            lqo.b(context).b(wifiDeviceGetSubUserAuthMsgReq, new ICloudOperationResult<CloudCommonReponse>() { // from class: com.huawei.ui.homehealth.interactors.WifiScaleMultiUserInteractor.a.3
                @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
                /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                public void operationResult(CloudCommonReponse cloudCommonReponse, String str, boolean z) {
                    LogUtil.a("WifiScaleMultiUserInteractor", "getRequestAuthorizationDetail request result: ", Boolean.valueOf(z), str);
                    if (z) {
                        a.this.c(context, (WifiDeviceGetSubUserAuthMsgRsp) new Gson().fromJson(str, WifiDeviceGetSubUserAuthMsgRsp.class), strA);
                    }
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c(Context context, WifiDeviceGetSubUserAuthMsgRsp wifiDeviceGetSubUserAuthMsgRsp, String str) {
            List<WifiDeviceSubUserAuthMsg> authMsgs = wifiDeviceGetSubUserAuthMsgRsp.getAuthMsgs();
            if (njy.e(authMsgs) || ecl.a(authMsgs) == 0) {
                LogUtil.j("WifiScaleMultiUserInteractor", "new auth msg list is empty");
            } else {
                Collections.sort(authMsgs);
                b(context, authMsgs.get(0), str, ecl.a(authMsgs));
            }
        }

        private void b(Context context, final WifiDeviceSubUserAuthMsg wifiDeviceSubUserAuthMsg, final String str, final int i) {
            final Activity activity = BaseApplication.getActivity();
            if (activity == null || activity.isFinishing()) {
                LogUtil.j("WifiScaleMultiUserInteractor", "no activity on top");
                c(context, context.getResources().getString(R.string.IDS_messagecenter_device_scale), a(str), c(context, wifiDeviceSubUserAuthMsg.getSubUserNickName()));
                return;
            }
            activity.runOnUiThread(new Runnable() { // from class: com.huawei.ui.homehealth.interactors.WifiScaleMultiUserInteractor.a.4
                @Override // java.lang.Runnable
                public void run() {
                    if (i == 1) {
                        LogUtil.a("WifiScaleMultiUserInteractor", "one sub user request");
                        a.this.a(activity, wifiDeviceSubUserAuthMsg, str);
                    } else {
                        LogUtil.a("WifiScaleMultiUserInteractor", "multi sub user request");
                        a.this.b(activity, wifiDeviceSubUserAuthMsg, str);
                    }
                }
            });
        }

        private String a(String str) {
            return "messagecenter://wifi_device_auth_list?devId=" + str;
        }

        private String b(String str) {
            return "messagecenter://device_management_page?proId=" + str;
        }

        private String c(String str) {
            return "messagecenter://wifi_device_auth_release?proId=" + str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(final Activity activity, WifiDeviceSubUserAuthMsg wifiDeviceSubUserAuthMsg, final String str) {
            LogUtil.a("WifiScaleMultiUserInteractor", "showMultiRequestDlg");
            String str2 = String.format(Locale.ENGLISH, activity.getString(R.string.IDS_hw_device_wifi_subuser_request_authorize_multi), wifiDeviceSubUserAuthMsg.getSubUserNickName());
            NoTitleCustomAlertDialog noTitleCustomAlertDialog = this.f25566c;
            if (noTitleCustomAlertDialog != null) {
                if (noTitleCustomAlertDialog.isShowing()) {
                    this.f25566c.dismiss();
                }
                this.f25566c = null;
            }
            NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(activity);
            builder.a(str2).a(com.huawei.ui.commonui.R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: com.huawei.ui.homehealth.interactors.WifiScaleMultiUserInteractor.a.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    LogUtil.a("WifiScaleMultiUserInteractor", "dealMultiRequest: clicked cancel");
                }
            }).c(com.huawei.ui.commonui.R.string.IDS_settings_button_ok, new View.OnClickListener() { // from class: com.huawei.ui.homehealth.interactors.WifiScaleMultiUserInteractor.a.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    LogUtil.a("WifiScaleMultiUserInteractor", "dealMultiRequest: clicked ok");
                    Intent intent = new Intent(activity, (Class<?>) WifiDeviceAuthRequestListActivity.class);
                    intent.putExtra("dev_id", str);
                    try {
                        activity.startActivity(intent);
                    } catch (ActivityNotFoundException unused) {
                        LogUtil.e("WifiScaleMultiUserInteractor", "showMultiRequestDlg startActivity ActivityNotFoundException.");
                    }
                }
            });
            NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
            this.f25566c = noTitleCustomAlertDialogC;
            noTitleCustomAlertDialogC.setCancelable(false);
            this.f25566c.show();
        }

        private String c(Context context, String str) {
            return String.format(Locale.ENGLISH, context.getString(R.string.IDS_hw_device_wifi_authorized_request_user), str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(final Activity activity, final WifiDeviceSubUserAuthMsg wifiDeviceSubUserAuthMsg, final String str) {
            LogUtil.a("WifiScaleMultiUserInteractor", "showSingleRequestDlg");
            String str2 = String.format(Locale.ENGLISH, activity.getString(R.string.IDS_hw_device_wifi_subuser_request_authorize_single), wifiDeviceSubUserAuthMsg.getSubUserNickName());
            NoTitleCustomAlertDialog noTitleCustomAlertDialog = this.f25566c;
            if (noTitleCustomAlertDialog != null) {
                if (noTitleCustomAlertDialog.isShowing()) {
                    this.f25566c.dismiss();
                }
                this.f25566c = null;
            }
            NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(activity);
            builder.a(str2).a(R.string.IDS_hw_device_wifi_subuser_request_authorize_reject, new View.OnClickListener() { // from class: com.huawei.ui.homehealth.interactors.WifiScaleMultiUserInteractor.a.10
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    LogUtil.a("WifiScaleMultiUserInteractor", "dealMultiRequest: clicked cancel");
                    a.this.e(activity, wifiDeviceSubUserAuthMsg, str, false);
                }
            }).c(R.string.IDS_hw_device_wifi_subuser_request_authorize_agree, new View.OnClickListener() { // from class: com.huawei.ui.homehealth.interactors.WifiScaleMultiUserInteractor.a.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    LogUtil.a("WifiScaleMultiUserInteractor", "dealMultiRequest: clicked ok");
                    a.this.e(activity, wifiDeviceSubUserAuthMsg, str, true);
                }
            });
            NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
            this.f25566c = noTitleCustomAlertDialogC;
            noTitleCustomAlertDialogC.setCancelable(false);
            this.f25566c.show();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void e(final Context context, WifiDeviceSubUserAuthMsg wifiDeviceSubUserAuthMsg, final String str, final boolean z) {
            LogUtil.a("WifiScaleMultiUserInteractor", "replyAuthRequest, is agree: ", Boolean.valueOf(z));
            WifiDeviceAuthorizeByMainUserReq wifiDeviceAuthorizeByMainUserReq = new WifiDeviceAuthorizeByMainUserReq();
            wifiDeviceAuthorizeByMainUserReq.setSubHuid(wifiDeviceSubUserAuthMsg.getSubHuid());
            wifiDeviceAuthorizeByMainUserReq.setDevId(str);
            wifiDeviceAuthorizeByMainUserReq.setIntent(z ? 1 : 2);
            lqo.b(context).b(wifiDeviceAuthorizeByMainUserReq, new ICloudOperationResult<CloudCommonReponse>() { // from class: com.huawei.ui.homehealth.interactors.WifiScaleMultiUserInteractor.a.8
                @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
                /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                public void operationResult(CloudCommonReponse cloudCommonReponse, String str2, boolean z2) {
                    LogUtil.a("WifiScaleMultiUserInteractor", "getRequestAuthorizationDetail request result: ", Boolean.valueOf(z2), str2);
                    ecl.b(context, cloudCommonReponse.getResultCode().intValue(), z2, z);
                    if (z) {
                        Intent intent = new Intent(context, (Class<?>) WifiDeviceShareActivity.class);
                        intent.putExtra("deviceId", str);
                        intent.putExtra("productId", a.this.d);
                        try {
                            context.startActivity(intent);
                        } catch (ActivityNotFoundException unused) {
                            LogUtil.e("WifiScaleMultiUserInteractor", "replyAuthRequest startActivity ActivityNotFoundException.");
                        }
                    }
                }
            });
        }

        private void c(Context context, String str, String str2, String str3) {
            LogUtil.a("WifiScaleMultiUserInteractor", "showAuthNotify detailUri: ", str2);
            MessageObject messageObject = new MessageObject();
            messageObject.setFlag(0);
            messageObject.setExpireTime(System.currentTimeMillis() + 86400000);
            messageObject.setPosition(2);
            messageObject.setNotified(0);
            messageObject.setCreateTime(System.currentTimeMillis());
            messageObject.setMsgId("9145");
            messageObject.setModule("WIFI_NOTIFICATION_MODULE_AUTH");
            messageObject.setMsgContent(str3);
            messageObject.setDetailUri(str2);
            messageObject.setMsgTitle(str);
            messageObject.setWeight(1);
            LogUtil.a("WifiScaleMultiUserInteractor", "start data notification");
            MessageCenterApi messageCenterApi = (MessageCenterApi) Services.b("PluginMessageCenter", MessageCenterApi.class);
            messageCenterApi.showNotification(context, messageObject);
            messageCenterApi.insertMessage(messageObject);
        }
    }
}
