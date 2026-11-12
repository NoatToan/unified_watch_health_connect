package com.huawei.health.receiver;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.R;
import com.huawei.health.browseraction.HwSchemeBasicHealthActivity;
import com.huawei.health.messagecenter.api.MessageCenterApi;
import com.huawei.health.messagecenter.model.IpushBase;
import com.huawei.health.messagecenter.model.MessageConstant;
import com.huawei.health.messagecenter.model.MessageObject;
import com.huawei.health.pluginhealthzone.FamilyHealthZoneApi;
import com.huawei.health.pluginhealthzone.UserInfoCallback;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcloudmodel.model.ecgservice.EcgGiftCardRequest;
import com.huawei.hwcloudmodel.model.ecgservice.EcgGiftCardResponse;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.Constants;
import defpackage.gqd;
import defpackage.gtb;
import defpackage.lqo;
import defpackage.lsb;
import defpackage.prf;
import defpackage.qrs;
import health.compact.a.Services;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class EcgPushReceiver implements IpushBase {
    private static final String CONNECTION_SYMBOL = "-";
    private static final int ECG_BAD_INTERPRETATION_REPORT_PUSH_TYPE = 201;
    private static final String ECG_DETAIL_URI = "messagecenter://ecgDetail?ecgPageType=";
    private static final int ECG_INTERPRETATION_COMPLETED = 502;
    private static final int ECG_INTERPRETATION_PROFESSOR = 503;
    private static final int ECG_INTERPRETATION_REPORT_PUSH_TYPE = 200;
    private static final int ECG_INTERPRETING_STATUS_PUSH_TYPE = 202;
    private static final int ECG_NOTIFICATION_ID = 20201111;
    private static final int ECG_SERVICE_CARD_PUSH_TYPE = 203;
    private static final int ECG_STRAP_REPORT = 401;
    private static final String PAGE_DONATE = "donate&donateId=";
    private static final String PAGE_RETURN_CARD = "returnCard";
    private static final String TAG = "Ecg_PushReceiver";
    private static final int TYPE_ACTIVATED = 101;
    private static final int TYPE_ACTIVATED_RETURN = 103;
    private static final int TYPE_CANCEL_GIFT = 304;
    private static final int TYPE_CARD_RETURN = 201;
    private static final int TYPE_GET_CARD = 301;
    private static final int TYPE_GET_CARD_EXPIRED = 305;
    private static final int TYPE_GIFTING_CARD = 303;
    private static final int TYPE_TO_GIFT_CARD = 302;
    private static final int TYPE_TRIAL_RETURN = 102;

    @Override // com.huawei.health.messagecenter.model.IpushBase
    public List<String> getPushType() {
        return Arrays.asList("200", Constants.ERROR_SERVICE_ID_STR, Constants.ERROR_UNKNOWN, "203");
    }

    @Override // com.huawei.health.messagecenter.model.IpushBase
    public void processPushMsg(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j(TAG, "processPushMsg Error PushMsg is Empty");
            return;
        }
        try {
            LogUtil.d(TAG, "Ecg_PushReceiver get message", str);
            EcgMsgPushBean ecgMsgPushBean = (EcgMsgPushBean) new Gson().fromJson(str, EcgMsgPushBean.class);
            if (ecgMsgPushBean == null) {
                LogUtil.j(TAG, "processPushMsg EcgMsgPushBean is null");
                return;
            }
            LogUtil.a(TAG, "bean: ", ecgMsgPushBean.toString());
            int i = ecgMsgPushBean.pushType;
            if (i != 200 && i != 201) {
                if (i == 203) {
                    setServiceCardNotify(context, ecgMsgPushBean.msgContext);
                    gtb.b(ecgMsgPushBean.msgContext);
                    return;
                } else if (i == 202) {
                    LogUtil.j(TAG, "Notification bar not displayed, pushType =", Integer.valueOf(i));
                    return;
                } else {
                    LogUtil.j(TAG, "pushType is error, pushType =", Integer.valueOf(i));
                    return;
                }
            }
            LogUtil.a(TAG, "processPushMsg, pushType is interpretation report");
            sendEcgReportNotify(context, i);
            prf.b(20000);
        } catch (JsonSyntaxException unused) {
            LogUtil.e(TAG, "processPushMsg JsonSyntaxException");
        }
    }

    private void sendEcgReportNotify(Context context, int i) {
        String string;
        Resources resources = BaseApplication.getContext().getResources();
        if (i == 200) {
            string = resources.getString(R.string.IDS_ecg_report_result);
        } else if (i != 201) {
            LogUtil.j(TAG, "the ecgReportType is error");
            string = "";
        } else {
            string = resources.getString(R.string.IDS_ecg_bad_report_result, 2);
        }
        if (TextUtils.isEmpty(string)) {
            LogUtil.j(TAG, "setNotify contentText is null");
        } else {
            setNotify(context, resources.getString(R.string.IDS_ecg_collection_title), string, false);
        }
    }

    private void setNotify(Context context, String str, String str2, boolean z) {
        Intent intent = new Intent(BaseApplication.getContext(), (Class<?>) HwSchemeBasicHealthActivity.class);
        intent.putExtra("ecgNotification", 1);
        if (z) {
            intent.putExtra("ecgPageType", "ecgStrap");
        } else {
            intent.putExtra("ecgPageType", "collection");
        }
        PendingIntent activity = PendingIntent.getActivity(context, 0, intent, 201326592);
        Notification.Builder builderC = lsb.d().c();
        builderC.setSmallIcon(com.huawei.ui.commonui.R.drawable.healthlogo_ic_notification);
        builderC.setAutoCancel(true);
        builderC.setContentTitle(str);
        builderC.setContentText(str2);
        builderC.setContentIntent(activity);
        builderC.setStyle(new Notification.BigTextStyle().bigText(str2));
        builderC.setPriority(0);
        lsb.d().c(ECG_NOTIFICATION_ID, builderC.build());
    }

    private void setServiceCardNotify(final Context context, String str) {
        String string;
        String string2;
        String str2;
        String str3;
        String string3;
        MsgContext msgContext = (MsgContext) new Gson().fromJson(str, MsgContext.class);
        LogUtil.a(TAG, "setServiceCardNotify msgContext: ", msgContext);
        if (msgContext == null) {
            LogUtil.j(TAG, "msgContext is null.");
            return;
        }
        final int i = msgContext.detailType;
        LogUtil.a(TAG, "setServiceCardNotify detailType: ", Integer.valueOf(i));
        if (i == 401) {
            sendEcgStrapNotify(context);
            return;
        }
        final long j = msgContext.notifyTime;
        if (i >= 301 && i <= 305) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.health.receiver.EcgPushReceiver$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m1146xbff283ba(context, i, j);
                }
            });
            return;
        }
        String string4 = context.getString(R.string.IDS_ecg_service_package);
        String str4 = PAGE_RETURN_CARD;
        if (i == 101) {
            string3 = context.getString(R.string.IDS_ecg_trial_period_end);
        } else if (i == 102) {
            string3 = context.getString(R.string.IDS_ecg_trial_watch_return);
        } else if (i == 103) {
            string3 = context.getString(R.string.IDS_ecg_activate_watch_return);
        } else {
            if (i == 201) {
                string3 = context.getString(R.string.IDS_ecg_card_return);
            } else {
                if (i == 502) {
                    string = context.getString(R.string.IDS_ecg_report_result);
                    string2 = context.getString(R.string.IDS_quick_app_ecg_analysis);
                } else if (i == 503) {
                    string = context.getString(R.string.IDS_ecg_bad_report_result, 2);
                    string2 = context.getString(R.string.IDS_quick_app_ecg_analysis);
                } else {
                    LogUtil.j(TAG, "parsesContext detailType undefined: ", Integer.valueOf(i));
                    return;
                }
                str4 = "electrocardiogram";
                str2 = string2;
                str3 = string;
            }
            sendServiceCardNotify(context, str3, i + "-" + j, str4, str2);
        }
        str2 = string4;
        str3 = string3;
        sendServiceCardNotify(context, str3, i + "-" + j, str4, str2);
    }

    /* JADX INFO: renamed from: lambda$setServiceCardNotify$0$com-huawei-health-receiver-EcgPushReceiver, reason: not valid java name */
    /* synthetic */ void m1146xbff283ba(Context context, int i, long j) {
        setAllMessageRead();
        getGiftCardMessage(context, i, j);
    }

    private void sendEcgStrapNotify(Context context) {
        setNotify(context, context.getString(R.string.IDS_helowin_ecg), context.getString(R.string.IDS_ecg_report_result), true);
    }

    private void sendServiceCardNotify(final Context context, final String str, final String str2, final String str3, final String str4) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j(TAG, "sendServiceCardNotify content is null");
            return;
        }
        LogUtil.a(TAG, "sendServiceCardNotify start");
        final MessageCenterApi messageCenterApi = (MessageCenterApi) Services.b("PluginMessageCenter", MessageCenterApi.class);
        messageCenterApi.getMessageId(String.valueOf(19), MessageConstant.ECG_MEDAL_TYPE, new IBaseResponseCallback() { // from class: com.huawei.health.receiver.EcgPushReceiver$$ExternalSyntheticLambda1
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.f$0.m1145x83f8d959(str4, str, str2, str3, messageCenterApi, context, i, obj);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$sendServiceCardNotify$1$com-huawei-health-receiver-EcgPushReceiver, reason: not valid java name */
    /* synthetic */ void m1145x83f8d959(String str, String str2, String str3, String str4, MessageCenterApi messageCenterApi, Context context, int i, Object obj) {
        if (i != 0 || obj == null) {
            LogUtil.j(TAG, "requestMessageId fail");
        } else if (obj instanceof String) {
            MessageObject messageObjectBuilderMessage = builderMessage((String) obj, str, str2, str3, str4);
            messageCenterApi.insertMessage(messageObjectBuilderMessage);
            messageCenterApi.showNotification(context, messageObjectBuilderMessage);
        }
    }

    private MessageObject builderMessage(String str, String str2, String str3, String str4, String str5) {
        MessageObject messageObject = new MessageObject();
        messageObject.setMsgType(2);
        messageObject.setPosition(3);
        messageObject.setMsgPosition(11);
        messageObject.setDetailUri(ECG_DETAIL_URI + str5);
        messageObject.setExpireTime(0L);
        messageObject.setReadFlag(0);
        messageObject.setMsgId(str);
        messageObject.setModule(String.valueOf(19));
        messageObject.setType(MessageConstant.ECG_MEDAL_TYPE);
        messageObject.setMsgTitle(str2);
        messageObject.setMsgContent(str3);
        messageObject.setMsgFrom(str4);
        messageObject.setCreateTime(System.currentTimeMillis());
        return messageObject;
    }

    private void getGiftCardMessage(Context context, int i, long j) {
        LogUtil.a(TAG, "getGiftCardMessage start detailType ", Integer.valueOf(i));
        EcgGiftCardResponse ecgGiftCardResponseC = lqo.b(context).c(new EcgGiftCardRequest(j, i));
        if (ecgGiftCardResponseC == null || TextUtils.isEmpty(ecgGiftCardResponseC.getPushInfo())) {
            LogUtil.j(TAG, "getGiftCardMessage response is null or donateId is empty");
            return;
        }
        LogUtil.d(TAG, "getGiftCardMessage response ", ecgGiftCardResponseC.toString());
        String pushInfo = ecgGiftCardResponseC.getPushInfo();
        if (i == 302 || i == 303) {
            setNotifyContent(i, pushInfo, "", 0L);
        } else {
            getUserNicknameFromSocial(i, pushInfo, ecgGiftCardResponseC.getDonorId(), ecgGiftCardResponseC.getExpireTime());
        }
    }

    private void getUserNicknameFromSocial(final int i, final String str, long j, final long j2) {
        ((FamilyHealthZoneApi) Services.d("PluginHealthZone", FamilyHealthZoneApi.class)).requestFindUserInfo(2, String.valueOf(j), new UserInfoCallback<gqd.c>() { // from class: com.huawei.health.receiver.EcgPushReceiver.1
            @Override // com.huawei.health.pluginhealthzone.UserInfoCallback
            public void infoCallback(gqd.c cVar) {
                LogUtil.j(EcgPushReceiver.TAG, "getUserNicknameFromSocial infoCallback");
                EcgPushReceiver.this.setNotifyContent(i, str, cVar.d(), j2);
            }

            @Override // com.huawei.health.pluginhealthzone.UserInfoCallback
            public void errorCallback(int i2) {
                LogUtil.j(EcgPushReceiver.TAG, "getUserNicknameFromSocial errorCallback");
            }
        });
    }

    public void setNotifyContent(int i, String str, String str2, long j) {
        String string;
        Context context = BaseApplication.getContext();
        String str3 = i + "-" + str + "-" + str2;
        if (i == 301) {
            if (TextUtils.isEmpty(str2)) {
                string = context.getString(R.string.IDS_ecg_card_notify_default);
            } else {
                string = context.getString(R.string.IDS_ecg_get_card_notify, str2);
            }
        } else if (i == 302) {
            string = context.getString(R.string.IDS_ecg_card_to_be_presented);
        } else if (i == 303) {
            string = context.getString(R.string.IDS_ecg_card_presenting);
        } else if (i == 304) {
            if (TextUtils.isEmpty(str2)) {
                string = context.getString(R.string.IDS_ecg_cancel_gift_default);
            } else {
                string = context.getString(R.string.IDS_ecg_card_cancel_present, str2);
            }
        } else {
            String str4 = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH).format(Long.valueOf(j));
            if (TextUtils.isEmpty(str2)) {
                string = context.getString(R.string.IDS_ecg_card_expired_default, str4);
            } else {
                string = context.getString(R.string.IDS_ecg_get_card_expired, str2, str4);
            }
        }
        sendServiceCardNotify(context, string, str3, PAGE_DONATE + str, context.getString(R.string.IDS_ecg_service_package));
    }

    private void setAllMessageRead() {
        int iA;
        MessageCenterApi messageCenterApi = (MessageCenterApi) Services.b("PluginMessageCenter", MessageCenterApi.class);
        List<MessageObject> messages = messageCenterApi.getMessages(String.valueOf(19), MessageConstant.ECG_MEDAL_TYPE);
        for (int i = 0; i < messages.size(); i++) {
            MessageObject messageObject = messages.get(i);
            if (messageObject != null && messageObject.getMsgFrom() != null && messageObject.getReadFlag() != 1 && (iA = qrs.a(messageObject.getMsgFrom().split("-")[0])) >= 301 && iA <= 305) {
                messageCenterApi.setMessageRead(messageObject.getMsgId());
            }
        }
    }

    /* JADX INFO: loaded from: classes30.dex */
    static class EcgMsgPushBean {
        private int pushType = 0;
        private String msgContext = "";

        private EcgMsgPushBean() {
        }

        public String toString() {
            return "EcgMsgPushBean{, pushType='" + this.pushType + "', msgContext='" + this.msgContext + "'}";
        }
    }

    /* JADX INFO: loaded from: classes30.dex */
    static class MsgContext {
        private int detailType;
        private long notifyTime;

        private MsgContext() {
        }
    }
}
