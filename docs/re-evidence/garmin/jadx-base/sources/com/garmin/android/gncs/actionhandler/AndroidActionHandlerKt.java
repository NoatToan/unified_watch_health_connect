package com.garmin.android.gncs.actionhandler;

import android.app.ActivityOptions;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import android.telephony.PhoneNumberUtils;
import androidx.core.view.j;
import com.garmin.android.gncs.GNCSApplicationInfo;
import com.garmin.android.gncs.GNCSListenerService;
import com.garmin.android.gncs.GNCSNotificationInfo;
import com.garmin.android.gncs.SmartNotificationsUtil;
import com.garmin.android.gncs.persistence.CacheManager;
import com.garmin.android.gncs.settings.GNCSSettings;
import com.garmin.android.gncs.settings.SmartNotificationsConfig;
import com.garmin.android.gncs.sms.SmsUtilKt;
import com.garmin.android.gncs.telephony.GNCSInCallService;
import ih2.b;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p13.u;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\u0014\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005*\u00020\u0007H\u0002\u001a\u0014\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005*\u00020\u0007H\u0002\u001a&\u0010\t\u001a\u00020\u0001*\u00020\n2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0002\u001a&\u0010\u000f\u001a\u00020\u0001*\u00020\n2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0000\u001a\u001e\u0010\u0010\u001a\u00020\u0001*\u00020\n2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u000eH\u0002\u001a\u001e\u0010\u0012\u001a\u00020\u0001*\u00020\n2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u000eH\u0002¨\u0006\u0013"}, d2 = {"blockApp", "", "notificationInfo", "Lcom/garmin/android/gncs/GNCSNotificationInfo;", "getActions", "", "Landroid/app/Notification$Action;", "Landroid/app/Notification;", "getWearableActions", "handleAction", "Lcom/garmin/android/gncs/GNCSListenerService;", "actionId", "", "actionText", "", "performAndroidAction", "replyIncomingCall", "message", "replyTextMessage", "gncs-all-modules_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class AndroidActionHandlerKt {
    private static final void blockApp(GNCSNotificationInfo gNCSNotificationInfo) {
        b.b("performAndroidAction -> block app [" + gNCSNotificationInfo.packageName + "]");
        GNCSSettings.getInstance().save(new GNCSApplicationInfo(gNCSNotificationInfo.packageName, false));
    }

    private static final List<Notification.Action> getActions(Notification notification) {
        Notification.Action[] actionArr = notification.actions;
        if (actionArr != null) {
            return u.i0(actionArr);
        }
        return null;
    }

    private static final List<Notification.Action> getWearableActions(Notification notification) {
        try {
            return new Notification.WearableExtender(notification).getActions();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00f7  */
    private static final void handleAction(GNCSListenerService gNCSListenerService, GNCSNotificationInfo gNCSNotificationInfo, int i14, String str) throws PendingIntent.CanceledException {
        List<Notification.Action> actions;
        Intent intent;
        RemoteInput remoteInput;
        com.airbnb.lottie.animation.keyframe.a.s("performAndroidAction -> handle action [", gNCSNotificationInfo.packageName, "]");
        StatusBarNotification[] activeNotifications = gNCSListenerService.getActiveNotifications(new String[]{gNCSNotificationInfo.notificationKey});
        activeNotifications.getClass();
        StatusBarNotification statusBarNotification = (StatusBarNotification) u.H(activeNotifications);
        Notification notification = statusBarNotification != null ? statusBarNotification.getNotification() : null;
        if (notification == null) {
            return;
        }
        if (SmartNotificationsConfig.getInstance().onlyUseWearableActions(gNCSNotificationInfo.packageName)) {
            b.b("performAndroidAction -> only use wearable actions");
            actions = getWearableActions(notification);
        } else if (SmartNotificationsConfig.getInstance().preferWearableActions(gNCSNotificationInfo.packageName)) {
            b.b("performAndroidAction -> not only use wearable actions");
            actions = getWearableActions(notification);
            if (actions == null || actions.isEmpty()) {
                b.b("performAndroidAction -> wearable actions is null or empty");
                actions = getActions(notification);
            } else {
                b.b("performAndroidAction -> wearable actions is not null or empty");
            }
        } else {
            actions = getActions(notification);
            if (actions == null || actions.isEmpty()) {
                actions = getWearableActions(notification);
            }
        }
        Notification.Action action = actions != null ? (Notification.Action) h0.e0(i14, actions) : null;
        if (action == null) {
            b.d("No action found to handle id [" + i14 + "]");
            return;
        }
        if (str == null || str.length() == 0) {
            intent = null;
        } else {
            b.b("action remoteInputs : " + action.getRemoteInputs());
            RemoteInput[] remoteInputs = action.getRemoteInputs();
            if (remoteInputs != null) {
                int length = remoteInputs.length;
                int i15 = 0;
                while (true) {
                    if (i15 >= length) {
                        remoteInput = null;
                        break;
                    }
                    remoteInput = remoteInputs[i15];
                    if (remoteInput.getAllowFreeFormInput()) {
                        break;
                    } else {
                        i15++;
                    }
                }
                if (remoteInput != null) {
                    b.b("performAndroidAction -> addResultsToIntent");
                    Intent intent2 = new Intent();
                    RemoteInput[] remoteInputs2 = action.getRemoteInputs();
                    Bundle bundle = new Bundle();
                    bundle.putString(remoteInput.getResultKey(), str);
                    Unit unit = Unit.INSTANCE;
                    RemoteInput.addResultsToIntent(remoteInputs2, intent2, bundle);
                    intent = intent2;
                } else {
                    intent = null;
                }
            } else {
                intent = null;
            }
        }
        PendingIntent pendingIntent = action.actionIntent;
        if (pendingIntent != null) {
            b.b("Sending intent to action .");
            if (Build.VERSION.SDK_INT < 34 || !pendingIntent.isActivity()) {
                b.b("Sending intent to action directly:\naction: " + (intent != null ? intent.getAction() : null) + "\ncategories: " + (intent != null ? intent.getCategories() : null) + "\ntype: " + (intent != null ? intent.getType() : null) + "\nflags: " + (intent != null ? Integer.valueOf(intent.getFlags()) : null));
                pendingIntent.send(gNCSListenerService.getApplicationContext(), 0, intent);
                return;
            }
            ActivityOptions activityOptionsMakeBasic = ActivityOptions.makeBasic();
            activityOptionsMakeBasic.setPendingIntentBackgroundActivityStartMode(1);
            b.b("Sending intent to action :\naction : " + (intent != null ? intent.getAction() : null) + "\ncategories : " + (intent != null ? intent.getCategories() : null) + "\ntype : " + (intent != null ? intent.getType() : null) + "\nflags : " + (intent != null ? Integer.valueOf(intent.getFlags()) : null));
            pendingIntent.send(gNCSListenerService.getApplicationContext(), 0, intent, new a(), null, null, activityOptionsMakeBasic.toBundle());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleAction$lambda$6$lambda$5(PendingIntent pendingIntent, Intent intent, int i14, String str, Bundle bundle) {
        b.b("PendingIntent.OnFinished => [Result data is " + str + " ] [ Result code is " + i14 + "]");
    }

    public static final void performAndroidAction(GNCSListenerService gNCSListenerService, GNCSNotificationInfo gNCSNotificationInfo, int i14, String str) {
        gNCSListenerService.getClass();
        gNCSNotificationInfo.getClass();
        StringBuilder sbK = j.k(i14, "performAndroidAction -> appId: ", gNCSNotificationInfo.packageName, " actionId: ", ", actionText: ");
        sbK.append(str);
        b.b(sbK.toString());
        try {
            switch (i14) {
                case 94:
                    replyTextMessage(gNCSListenerService, gNCSNotificationInfo, str);
                    break;
                case 95:
                    replyIncomingCall(gNCSListenerService, gNCSNotificationInfo, str);
                    break;
                case 96:
                    ActionHandlerKt.answerIncomingCall(gNCSListenerService);
                    break;
                case 97:
                    ActionHandlerKt.rejectIncomingCall(gNCSListenerService, gNCSNotificationInfo);
                    break;
                case 98:
                    ActionHandlerKt.dismiss(gNCSListenerService, gNCSNotificationInfo);
                    break;
                case 99:
                    blockApp(gNCSNotificationInfo);
                    break;
                default:
                    handleAction(gNCSListenerService, gNCSNotificationInfo, i14, str);
                    break;
            }
        } catch (Exception e4) {
            b.a(e4, "performAndroidAction -> " + e4.getMessage());
        }
    }

    private static final void replyIncomingCall(GNCSListenerService gNCSListenerService, GNCSNotificationInfo gNCSNotificationInfo, String str) {
        Object next;
        String str2;
        b.b("performAndroidAction -> reply incoming call, message: " + str);
        GNCSInCallService companion = GNCSInCallService.INSTANCE.getInstance();
        if (companion != null) {
            if (str == null || str.length() == 0) {
                b.b("performAndroidAction -> cannot reply incoming call, message is empty. Rejecting call without message.");
                GNCSInCallService.rejectCall$default(companion, null, 1, null);
                return;
            }
            b.b("performAndroidAction -> reply incoming call performed, sending message [" + ((Object) SmartNotificationsUtil.obfuscateIfNeeded(str)) + "] to phone number [" + ((Object) SmartNotificationsUtil.obfuscateIfNeeded(gNCSNotificationInfo.phoneNumber)) + "]");
            companion.rejectCall(str);
            return;
        }
        Iterator<T> it = CacheManager.INSTANCE.getNotifications(GNCSNotificationInfo.NotificationType.INCOMING_CALL).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            GNCSNotificationInfo gNCSNotificationInfo2 = (GNCSNotificationInfo) next;
            if (gNCSNotificationInfo2.isActive() && (str2 = gNCSNotificationInfo2.phoneNumber) != null && str2.length() != 0) {
                break;
            }
        }
        GNCSNotificationInfo gNCSNotificationInfo3 = (GNCSNotificationInfo) next;
        String str3 = gNCSNotificationInfo3 != null ? gNCSNotificationInfo3.phoneNumber : null;
        if (str3 == null || str3.length() == 0) {
            b.b("performAndroidAction -> cannot reply incoming call, phone number is empty");
        } else if (str == null || str.length() == 0) {
            b.b("performAndroidAction -> cannot reply incoming call, message is empty");
        } else {
            b.b("performAndroidAction -> reply incoming call performed, sending message [" + ((Object) SmartNotificationsUtil.obfuscateIfNeeded(str)) + "] to phone number [" + ((Object) SmartNotificationsUtil.obfuscateIfNeeded(gNCSNotificationInfo.phoneNumber)) + "]");
            Context applicationContext = gNCSListenerService.getApplicationContext();
            applicationContext.getClass();
            SmsUtilKt.sendSms(applicationContext, str3, str);
        }
        ActionHandlerKt.rejectIncomingCall(gNCSListenerService, gNCSNotificationInfo);
    }

    private static final void replyTextMessage(GNCSListenerService gNCSListenerService, GNCSNotificationInfo gNCSNotificationInfo, String str) {
        String str2 = gNCSNotificationInfo.phoneNumber;
        str2.getClass();
        if (str2.length() == 0) {
            b.b("performAndroidAction -> reply text message not performed, phone number is empty");
            return;
        }
        if (!PhoneNumberUtils.isGlobalPhoneNumber(gNCSNotificationInfo.phoneNumber)) {
            b.b("performAndroidAction -> reply text message not performed, phone number is illegal");
            return;
        }
        if (str == null || str.length() == 0) {
            b.b("performAndroidAction -> reply text message not performed, message is empty");
            return;
        }
        b.b("performAndroidAction -> reply text message performed, sending message [" + ((Object) SmartNotificationsUtil.obfuscateIfNeeded(str)) + "] to phone number [" + ((Object) SmartNotificationsUtil.obfuscateIfNeeded(gNCSNotificationInfo.phoneNumber)) + "]");
        Context applicationContext = gNCSListenerService.getApplicationContext();
        applicationContext.getClass();
        String str3 = gNCSNotificationInfo.phoneNumber;
        str3.getClass();
        SmsUtilKt.sendSms(applicationContext, str3, str);
        ActionHandlerKt.dismiss(gNCSListenerService, gNCSNotificationInfo);
    }
}
