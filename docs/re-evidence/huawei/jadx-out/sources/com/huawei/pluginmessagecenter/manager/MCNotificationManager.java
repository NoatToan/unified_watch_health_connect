package com.huawei.pluginmessagecenter.manager;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.app.NotificationManagerCompat;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.dfx.DfxUtils;
import com.huawei.health.health.utils.vippage.BenefitHalfModeActivity;
import com.huawei.health.messagecenter.model.BenefitMessage;
import com.huawei.health.messagecenter.model.MessageConstant;
import com.huawei.health.messagecenter.model.MessageObject;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.pluginmessagecenter.R;
import com.huawei.pluginmessagecenter.activity.DispatchSkipEventActivity;
import com.huawei.trade.datatype.DeviceInboxInfo;
import com.huawei.trade.datatype.DevicePerfPurchaseInfo;
import defpackage.irz;
import defpackage.lsb;
import defpackage.ogd;
import defpackage.pgz;
import defpackage.phq;
import defpackage.qqt;
import health.compact.a.CommonUtil;
import health.compact.a.SharedPreferenceManager;
import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: loaded from: classes14.dex */
public class MCNotificationManager {
    private static final int DEVICE_UPDATE_NOTIFY_ID = 20171027;
    private static final int HEALTH_BLOOD_PRESSURE = 20240710;
    private static final int HEALTH_PROCESSOR_MEDICAL_EXAM_REPORT_NOTIFY_ID = 20230221;
    private static final int HEALTH_PROCESSOR_PPG_NOTIFY_ID = 20221130;
    private static final String TAG = "UIDV_MCNotificationManager";
    private static final String WIFI_AUTH = "WIFI_NOTIFICATION_MODULE_AUTH";

    private static boolean isRead(int i) {
        return i == 1;
    }

    private MCNotificationManager() {
    }

    public static void showNotification(Context context, MessageObject messageObject) {
        LogUtil.a(TAG, "showNotification()");
        if (context == null || messageObject == null) {
            LogUtil.a(TAG, "messageObject == null");
            return;
        }
        if (!NotificationManagerCompat.from(context).areNotificationsEnabled()) {
            LogUtil.j(TAG, "notification unable");
            return;
        }
        String strE = SharedPreferenceManager.e(BaseApplication.b(), Integer.toString(10000), "health_msg_switch_noticebar");
        LogUtil.a(TAG, "showNotification() noticebarRecommend", strE);
        if ("0".equals(strE) || !isNotificationMsg(messageObject) || isRead(messageObject.getReadFlag()) || checkExpireTime(messageObject) || messageObject.getNotified() == 1) {
            return;
        }
        notificationMsg(context, messageObject);
    }

    private static void notificationMsg(Context context, MessageObject messageObject) {
        try {
            Notification.Builder builderC = lsb.d().c();
            if (!TextUtils.isEmpty(messageObject.getMsgTitle())) {
                builderC.setContentTitle(messageObject.getMsgTitle());
            }
            builderC.setContentIntent(getIntent(context, messageObject)).setStyle(new Notification.BigTextStyle().bigText(messageObject.getMsgContent())).setTicker(messageObject.getMsgTitle()).setNumber(messageObject.getWeight()).setWhen(messageObject.getCreateTime()).setShowWhen(true).setPriority(0).setAutoCancel(true).setOngoing(false).setGroupSummary(messageObject.isGroupSummary()).setDefaults(2).setExtras(ogd.d(new Bundle(), messageObject.getDeviceLinkageList()));
            if (!TextUtils.isEmpty(messageObject.getMsgContent())) {
                builderC.setContentText(messageObject.getMsgContent());
            }
            LogUtil.a(TAG, "showNotification() title = ", messageObject.getMsgTitle());
            int identifier = R.drawable.healthlogo_ic_notification;
            if (CommonUtil.ap()) {
                identifier = BaseApplication.b().getResources().getIdentifier("healthlogo_hw_app_beta", "mipmap", com.huawei.hwcommonmodel.application.BaseApplication.getAppPackage());
            }
            builderC.setSmallIcon(identifier);
            if (messageObject.getModule() != null && WIFI_AUTH.equals(messageObject.getModule())) {
                builderC.setSubText(new SimpleDateFormat("a hh:mm").format(new Date()));
                builderC.setShowWhen(false);
            }
            if (messageObject.getType().equals("device_ota")) {
                lsb.d().c(DEVICE_UPDATE_NOTIFY_ID, builderC.build());
            } else if (messageObject.getType().equals("device_ota1")) {
                lsb.d().c(20180808, builderC.build());
            } else if (messageObject.getType().equals("device_scale_ota")) {
                lsb.d().c(20180920, builderC.build());
            } else if (messageObject.getType().equals("HiHealthProcessor_PPG")) {
                lsb.d().c(HEALTH_PROCESSOR_PPG_NOTIFY_ID, builderC.build());
            } else if (messageObject.getType().equals("HiHealthProcessor_MedicalExamReport")) {
                lsb.d().c(HEALTH_PROCESSOR_MEDICAL_EXAM_REPORT_NOTIFY_ID, builderC.build());
            } else if (messageObject.getType().equals("BloodPressure")) {
                lsb.d().c(HEALTH_BLOOD_PRESSURE, builderC.build());
            } else {
                lsb.d().c(Integer.parseInt(messageObject.getMsgId().substring(1)), builderC.build());
            }
            pgz.c(BaseApplication.b()).i(messageObject.getMsgId());
        } catch (Resources.NotFoundException unused) {
            LogUtil.e(TAG, "ResourcesNotFoundException");
        } catch (NumberFormatException e) {
            LogUtil.e(TAG, e.getMessage());
        } catch (StringIndexOutOfBoundsException e2) {
            handleExceptionMessage("notificationMsg", messageObject, e2);
        }
    }

    public static void showUpdateMessageNotification(Context context, MessageObject messageObject, long j) {
        LogUtil.a(TAG, "start_showNotification");
        if (messageObject == null) {
            LogUtil.a(TAG, "return");
            return;
        }
        String strE = SharedPreferenceManager.e(BaseApplication.b(), Integer.toString(10000), "health_msg_switch_noticebar");
        LogUtil.a(TAG, "showNotification() noticebarRecommend", strE);
        if ("0".equals(strE) || !isNotificationMsg(messageObject) || isRead(messageObject.getReadFlag()) || messageObject.getNotified() == 1) {
            return;
        }
        try {
            LogUtil.a(TAG, "msgObj.getMsgTitle() ", messageObject.getMsgTitle());
            LogUtil.a(TAG, "msgObj.getMsgContent() ", messageObject.getMsgContent());
            LogUtil.a(TAG, "msgObj.getDetailUri() ", messageObject.getDetailUri());
            LogUtil.a(TAG, "msgObj.getMsgId() ", messageObject.getMsgId());
            LogUtil.a(TAG, "msgObj.getWeight() ", Integer.valueOf(messageObject.getWeight()));
            LogUtil.a(TAG, "msgObj.getCreateTime() ", Long.valueOf(messageObject.getCreateTime()));
            Notification.Builder builderC = lsb.d().c();
            builderC.setContentTitle(messageObject.getMsgTitle()).setContentText(messageObject.getMsgContent()).setContentIntent(getDefaultIntent(context, messageObject)).setTicker(messageObject.getMsgTitle()).setNumber(messageObject.getWeight()).setWhen(messageObject.getCreateTime()).setShowWhen(true).setPriority(0).setAutoCancel(true).setOngoing(false).setDefaults(2).setExtras(ogd.d(new Bundle(), messageObject.getDeviceLinkageList()));
            LogUtil.a(TAG, "Builder_setMess");
            builderC.setSmallIcon(R.drawable.healthlogo_ic_notification);
            LogUtil.a(TAG, "getMessageNotifyId ==", Long.valueOf(j));
            lsb.d().c((int) j, builderC.build());
            LogUtil.a(TAG, "end_showNotification");
        } catch (Resources.NotFoundException unused) {
            LogUtil.e(TAG, "ResourcesNotFoundException");
        } catch (NumberFormatException e) {
            LogUtil.e(TAG, e.getMessage());
        }
    }

    private static boolean isNotificationMsg(MessageObject messageObject) {
        return messageObject.getPosition() == 2 || messageObject.getPosition() == 3;
    }

    private static boolean checkExpireTime(MessageObject messageObject) {
        if (messageObject.getExpireTime() == 0) {
            return false;
        }
        long jC = phq.c(System.currentTimeMillis());
        long expireTime = messageObject.getExpireTime();
        return expireTime < jC && expireTime > phq.c(0L);
    }

    private static DeviceInboxInfo isInboxParchesBenefit(MessageObject messageObject) {
        BenefitMessage benefitMessage;
        DeviceInboxInfo deviceInboxInfo;
        if (!TextUtils.equals(messageObject.getModule(), String.valueOf(70)) && !TextUtils.equals(messageObject.getModule(), String.valueOf(90))) {
            return null;
        }
        String detailUriExt = messageObject.getDetailUriExt();
        if (TextUtils.isEmpty(detailUriExt) || (benefitMessage = (BenefitMessage) qqt.e(detailUriExt, BenefitMessage.class)) == null) {
            return null;
        }
        String benefitData = benefitMessage.getBenefitData();
        if (!MessageConstant.BENEFIT_INBOX_TYPE.equals(benefitMessage.getBenefitType()) || (deviceInboxInfo = (DeviceInboxInfo) qqt.e(benefitData, DeviceInboxInfo.class)) == null) {
            return null;
        }
        return deviceInboxInfo;
    }

    private static DevicePerfPurchaseInfo isPurchaseBenefit(MessageObject messageObject) {
        BenefitMessage benefitMessage;
        DevicePerfPurchaseInfo devicePerfPurchaseInfo;
        if (TextUtils.equals(messageObject.getModule(), String.valueOf(70))) {
            String detailUriExt = messageObject.getDetailUriExt();
            if (TextUtils.isEmpty(detailUriExt) || (benefitMessage = (BenefitMessage) qqt.e(detailUriExt, BenefitMessage.class)) == null) {
                return null;
            }
            String benefitData = benefitMessage.getBenefitData();
            if (!MessageConstant.BENEFIT_PURCHASE_TYPE.equals(benefitMessage.getBenefitType()) || (devicePerfPurchaseInfo = (DevicePerfPurchaseInfo) qqt.e(benefitData, DevicePerfPurchaseInfo.class)) == null) {
                return null;
            }
            return devicePerfPurchaseInfo;
        }
        return null;
    }

    private static PendingIntent getIntent(Context context, MessageObject messageObject) {
        DeviceInboxInfo deviceInboxInfoIsInboxParchesBenefit = isInboxParchesBenefit(messageObject);
        DevicePerfPurchaseInfo devicePerfPurchaseInfoIsPurchaseBenefit = isPurchaseBenefit(messageObject);
        if (deviceInboxInfoIsInboxParchesBenefit == null) {
            if (devicePerfPurchaseInfoIsPurchaseBenefit != null) {
                Intent intent = new Intent(context, (Class<?>) BenefitHalfModeActivity.class);
                intent.putExtra("needToConcatType", 0);
                intent.putExtra("benefitInfo", devicePerfPurchaseInfoIsPurchaseBenefit);
                intent.putExtra("fromPage", 12);
                return PendingIntent.getActivity(context, CommonUtil.n(BaseApplication.b(), messageObject.getMsgId().substring(1)), intent, 201326592);
            }
            return getDefaultIntent(context, messageObject);
        }
        boolean zC = irz.c(deviceInboxInfoIsInboxParchesBenefit.getDeviceBenefitInfos());
        Intent intent2 = new Intent(context, (Class<?>) BenefitHalfModeActivity.class);
        if (deviceInboxInfoIsInboxParchesBenefit.getBenefitType() == 1 && zC) {
            intent2.putExtra("needToConcatType", 1);
        } else {
            intent2.putExtra("needToConcatType", 0);
        }
        intent2.putExtra("benefitInfo", deviceInboxInfoIsInboxParchesBenefit);
        intent2.putExtra("fromPage", 12);
        return PendingIntent.getActivity(context, CommonUtil.n(BaseApplication.b(), messageObject.getMsgId().substring(1)), intent2, 201326592);
    }

    private static PendingIntent getDefaultIntent(Context context, MessageObject messageObject) {
        int i;
        LogUtil.d(TAG, "detailUri=====>", messageObject.getDetailUri());
        Intent intent = new Intent();
        intent.setClass(context, DispatchSkipEventActivity.class);
        intent.setFlags(335544320);
        intent.putExtra(com.huawei.health.messagecenter.model.CommonUtil.DETAIL_URI, messageObject.getDetailUri());
        intent.putExtra("msgId", messageObject.getMsgId());
        intent.putExtra("from", 2);
        intent.putExtra("module", messageObject.getModule());
        intent.putExtra("notifiUri", messageObject.getDetailUri());
        intent.putExtra("messageContent", messageObject.getMsgContent());
        try {
            i = Integer.parseInt(messageObject.getMsgId().substring(1));
        } catch (NumberFormatException e) {
            LogUtil.e(TAG, e.getMessage());
            i = 0;
        } catch (StringIndexOutOfBoundsException e2) {
            handleExceptionMessage("getDefaultIntent", messageObject, e2);
            i = 0;
        }
        return PendingIntent.getActivity(context, i, intent, 201326592);
    }

    private static void handleExceptionMessage(String str, MessageObject messageObject, StringIndexOutOfBoundsException stringIndexOutOfBoundsException) {
        String str2;
        if (messageObject == null) {
            str2 = "";
        } else {
            str2 = "msgId = " + messageObject.getMsgId() + ", module = " + messageObject.getModule() + ", type = " + messageObject.getType() + ", msgType = " + messageObject.getMsgType() + ", msgFrom = " + messageObject.getMsgFrom() + ", huid = " + messageObject.getHuid();
        }
        LogUtil.e(TAG, str + " StringIndexOutOfBoundsException, msg: ", str2);
        String strD = DfxUtils.d(Thread.currentThread(), stringIndexOutOfBoundsException);
        OpAnalyticsUtil.getInstance().setProbabilityProblemEvent(str + " StringIndexOutOfBoundsException", "errMessage: " + strD + " - msg: " + str2);
    }

    public static void cancelNotification(int i) {
        LogUtil.a(TAG, "Enter cancelNotification");
        try {
            lsb.d().e(i);
        } catch (Exception unused) {
            LogUtil.a(TAG, "error cancelNotification");
        }
    }
}
