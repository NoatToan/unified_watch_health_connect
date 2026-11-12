package com.garmin.android.gncs.actionhandler;

import com.garmin.android.gncs.GNCSListenerService;
import com.garmin.android.gncs.GNCSNotificationInfo;
import com.garmin.android.gncs.persistence.GNCSNotificationAction;
import ih2.b;
import java.util.List;
import p005kotlin.Metadata;
import p13.h0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002\u001a\u001c\u0010\u0007\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¨\u0006\b"}, d2 = {"handleAction", "", "Lcom/garmin/android/gncs/GNCSListenerService;", "notificationInfo", "Lcom/garmin/android/gncs/GNCSNotificationInfo;", "isPositiveAction", "", "performNotificationAction", "gncs-all-modules_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class NotificationActionHandlerKt {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GNCSNotificationInfo.NotificationType.values().length];
            try {
                iArr[GNCSNotificationInfo.NotificationType.BUSINESS_AND_FINANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GNCSNotificationInfo.NotificationType.EMAIL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GNCSNotificationInfo.NotificationType.ENTERTAINMENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[GNCSNotificationInfo.NotificationType.HEALTH_AND_FITNESS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[GNCSNotificationInfo.NotificationType.LOCATION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[GNCSNotificationInfo.NotificationType.NEWS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[GNCSNotificationInfo.NotificationType.OTHER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[GNCSNotificationInfo.NotificationType.SCHEDULE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[GNCSNotificationInfo.NotificationType.SMS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[GNCSNotificationInfo.NotificationType.SOCIAL.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[GNCSNotificationInfo.NotificationType.VOICEMAIL.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[GNCSNotificationInfo.NotificationType.INCOMING_CALL.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[GNCSNotificationInfo.NotificationType.MISSED_CALL.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final void handleAction(GNCSListenerService gNCSListenerService, GNCSNotificationInfo gNCSNotificationInfo, boolean z14) {
        List<GNCSNotificationAction> noReplyActions = gNCSNotificationInfo.getNoReplyActions();
        noReplyActions.getClass();
        if (noReplyActions.isEmpty()) {
            noReplyActions = null;
        }
        if (noReplyActions != null) {
            GNCSNotificationAction gNCSNotificationAction = (GNCSNotificationAction) h0.e0(z14 ? gNCSNotificationInfo.positiveActionIndex : gNCSNotificationInfo.negativeActionIndex, noReplyActions);
            if (gNCSNotificationAction != null) {
                Integer numValueOf = Integer.valueOf(gNCSNotificationAction.id);
                if (numValueOf.intValue() == -1) {
                    numValueOf = null;
                }
                if (numValueOf != null) {
                    int iIntValue = numValueOf.intValue();
                    b.b("performNotificationAction -> calling 'performAndroidAction' with action ID [" + iIntValue + "], is positive action [" + z14 + "]");
                    AndroidActionHandlerKt.performAndroidAction(gNCSListenerService, gNCSNotificationInfo, iIntValue, null);
                    return;
                }
            }
        }
        ActionHandlerKt.dismiss(gNCSListenerService, gNCSNotificationInfo);
    }

    public static final void performNotificationAction(GNCSListenerService gNCSListenerService, GNCSNotificationInfo gNCSNotificationInfo, boolean z14) {
        gNCSListenerService.getClass();
        gNCSNotificationInfo.getClass();
        b.b("performNotificationAction -> appId: " + gNCSNotificationInfo.packageName + ", isPositiveAction: " + z14);
        try {
            GNCSNotificationInfo.NotificationType notificationType = gNCSNotificationInfo.type;
            switch (notificationType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[notificationType.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                    handleAction(gNCSListenerService, gNCSNotificationInfo, z14);
                    break;
                case 12:
                    if (!gNCSNotificationInfo.getNoReplyActions().isEmpty()) {
                        handleAction(gNCSListenerService, gNCSNotificationInfo, z14);
                    } else if (!z14) {
                        b.b("performNotificationAction -> rejecting incoming call");
                        ActionHandlerKt.rejectIncomingCall(gNCSListenerService, gNCSNotificationInfo);
                    } else {
                        b.b("performNotificationAction -> answering incoming call");
                        ActionHandlerKt.answerIncomingCall(gNCSListenerService);
                    }
                    break;
                case 13:
                    List<GNCSNotificationAction> noReplyActions = gNCSNotificationInfo.getNoReplyActions();
                    noReplyActions.getClass();
                    if (!noReplyActions.isEmpty()) {
                        handleAction(gNCSListenerService, gNCSNotificationInfo, z14);
                    }
                    break;
                default:
                    b.b("performNotificationAction -> no action defined for notification type [" + gNCSNotificationInfo.type + "]");
                    break;
            }
        } catch (Exception e4) {
            b.a(e4, "performNotificationAction -> " + e4.getMessage());
        }
    }
}
