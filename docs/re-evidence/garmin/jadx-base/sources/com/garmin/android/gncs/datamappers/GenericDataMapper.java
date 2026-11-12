package com.garmin.android.gncs.datamappers;

import am.j;
import android.app.Notification;
import android.app.Person;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.garmin.android.ancs.ANCSMessageBase;
import com.garmin.android.gncs.GNCSNotificationInfo;
import com.garmin.android.gncs.GNCSParsedNotification;
import com.garmin.android.gncs.NotificationConstants;
import com.garmin.android.gncs.R;
import com.garmin.android.gncs.SmartNotificationsUtil;
import com.garmin.android.gncs.persistence.GNCSNotificationAction;
import com.garmin.android.gncs.settings.GNCSSettings;
import com.garmin.android.gncs.settings.SmartNotificationsConfig;
import ih2.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import sn.a;

/* JADX INFO: loaded from: classes11.dex */
public class GenericDataMapper extends AbstractDataMapper {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String TAG = "GenericDataMapper: ";
    private boolean lastMessageIsSentByCurrentUser = false;

    /* JADX INFO: renamed from: com.garmin.android.gncs.datamappers.GenericDataMapper$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$garmin$android$gncs$GNCSNotificationInfo$NotificationType;

        static {
            int[] iArr = new int[GNCSNotificationInfo.NotificationType.values().length];
            $SwitchMap$com$garmin$android$gncs$GNCSNotificationInfo$NotificationType = iArr;
            try {
                iArr[GNCSNotificationInfo.NotificationType.BUSINESS_AND_FINANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$garmin$android$gncs$GNCSNotificationInfo$NotificationType[GNCSNotificationInfo.NotificationType.EMAIL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$garmin$android$gncs$GNCSNotificationInfo$NotificationType[GNCSNotificationInfo.NotificationType.ENTERTAINMENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$garmin$android$gncs$GNCSNotificationInfo$NotificationType[GNCSNotificationInfo.NotificationType.HEALTH_AND_FITNESS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$garmin$android$gncs$GNCSNotificationInfo$NotificationType[GNCSNotificationInfo.NotificationType.LOCATION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$garmin$android$gncs$GNCSNotificationInfo$NotificationType[GNCSNotificationInfo.NotificationType.NEWS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$garmin$android$gncs$GNCSNotificationInfo$NotificationType[GNCSNotificationInfo.NotificationType.OTHER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$garmin$android$gncs$GNCSNotificationInfo$NotificationType[GNCSNotificationInfo.NotificationType.SCHEDULE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$garmin$android$gncs$GNCSNotificationInfo$NotificationType[GNCSNotificationInfo.NotificationType.SMS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$garmin$android$gncs$GNCSNotificationInfo$NotificationType[GNCSNotificationInfo.NotificationType.SOCIAL.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$garmin$android$gncs$GNCSNotificationInfo$NotificationType[GNCSNotificationInfo.NotificationType.INCOMING_CALL.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$garmin$android$gncs$GNCSNotificationInfo$NotificationType[GNCSNotificationInfo.NotificationType.MISSED_CALL.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$garmin$android$gncs$GNCSNotificationInfo$NotificationType[GNCSNotificationInfo.NotificationType.VOICEMAIL.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    private String findMessage(Bundle bundle) {
        this.lastMessageIsSentByCurrentUser = false;
        Object obj = bundle.get("android.bigText");
        if (obj != null) {
            String string = obj.toString();
            if (!TextUtils.isEmpty(string)) {
                return string;
            }
        }
        CharSequence[] charSequenceArray = bundle.getCharSequenceArray("android.textLines");
        if (charSequenceArray != null && charSequenceArray.length > 0) {
            StringBuilder sb3 = new StringBuilder();
            for (CharSequence charSequence : charSequenceArray) {
                if (sb3.length() > 0) {
                    sb3.append('\n');
                }
                sb3.append(charSequence);
            }
            if (sb3.length() > 0) {
                return sb3.toString();
            }
        }
        Parcelable[] parcelableArray = bundle.getParcelableArray("android.messages");
        if (parcelableArray != null && parcelableArray.length > 0) {
            StringBuilder sb4 = new StringBuilder();
            boolean z14 = false;
            CharSequence charSequence2 = null;
            for (Parcelable parcelable : parcelableArray) {
                if (parcelable instanceof Bundle) {
                    Bundle bundle2 = (Bundle) parcelable;
                    Parcelable parcelable2 = bundle2.getParcelable(NotificationConstants.KEY_MESSAGE_SENDER_PERSON);
                    CharSequence name = parcelable2 instanceof Person ? ((Person) parcelable2).getName() : null;
                    if (name == null) {
                        name = bundle2.getCharSequence(NotificationConstants.KEY_MESSAGE_SENDER);
                    }
                    Object obj2 = bundle2.get("text");
                    if (obj2 != null) {
                        String string2 = obj2.toString();
                        if (!string2.isEmpty()) {
                            if (sb4.length() > 0) {
                                sb4.append('\n');
                            } else {
                                charSequence2 = name;
                            }
                            if (!Objects.equals(charSequence2, name)) {
                                sb4.append(name != null ? name : "You");
                                sb4.append(": ");
                            }
                            sb4.append(string2);
                            if (!z14 && !TextUtils.isEmpty(name)) {
                                z14 = true;
                            }
                            charSequence2 = name;
                        }
                    }
                }
            }
            if (z14 && TextUtils.isEmpty(charSequence2)) {
                this.lastMessageIsSentByCurrentUser = true;
            }
            if (sb4.length() > 0) {
                return sb4.toString();
            }
        }
        Object obj3 = bundle.get("android.text");
        if (obj3 == null) {
            return "";
        }
        String string3 = obj3.toString();
        return !TextUtils.isEmpty(string3) ? string3 : "";
    }

    private static String findSubTitle(Bundle bundle) {
        Object obj = bundle.get("android.subText");
        if (obj != null) {
            return obj.toString();
        }
        Object obj2 = bundle.get("android.summaryText");
        return obj2 != null ? obj2.toString() : "";
    }

    private static String findTitle(Bundle bundle) {
        Object obj = bundle.get("android.title.big");
        if (obj != null) {
            return obj.toString();
        }
        Object obj2 = bundle.get("android.title");
        return obj2 != null ? obj2.toString() : "";
    }

    private static boolean hasImage(GNCSNotificationInfo gNCSNotificationInfo, boolean z14, StringBuilder sb3) {
        boolean z15;
        if (gNCSNotificationInfo.getMediaCount() <= 0) {
            if (z14 || !gNCSNotificationInfo.hasLargeIcon) {
                z15 = false;
            } else {
                sb3.append("\n large icon found , setting 'HAS_MEDIA' flag");
            }
            if (!z15 || !SmartNotificationsUtil.Packages.PACKAGES_WITH_REMOTE_VIEW_IMAGES.contains(gNCSNotificationInfo.packageName)) {
                return z15;
            }
            boolean z16 = gNCSNotificationInfo.numRemoteViewImages > 0;
            if (z16) {
                sb3.append("\n");
                sb3.append(gNCSNotificationInfo.numRemoteViewImages);
                sb3.append(" RemoteView Images found , setting 'HAS_MEDIA' flag");
            }
            return z16;
        }
        sb3.append("\n ");
        sb3.append(gNCSNotificationInfo.getMediaCount());
        sb3.append(" images found , setting 'HAS_MEDIA' flag ");
        z15 = true;
        if (!z15) {
        }
        return z15;
    }

    @Override // com.garmin.android.gncs.datamappers.AbstractDataMapper
    public void addImagesToMMSNotification(Context context, GNCSNotificationInfo gNCSNotificationInfo, Uri uri) {
        gNCSNotificationInfo.images.add(uri);
    }

    public int getSimpleActionIndex(List<GNCSNotificationAction> list) {
        Iterator<GNCSNotificationAction> it = list.iterator();
        int i14 = 0;
        while (it.hasNext()) {
            int i15 = it.next().id;
            if (i15 != 98 && i15 != 99) {
                return i14;
            }
            i14++;
        }
        return -1;
    }

    @Override // com.garmin.android.gncs.datamappers.AbstractDataMapper
    public void mapAdvancedActions(GNCSParsedNotification gNCSParsedNotification, GNCSNotificationInfo gNCSNotificationInfo, Context context) {
        List<GNCSNotificationAction> list;
        gNCSNotificationInfo.actions = new ArrayList();
        if (gNCSNotificationInfo.type != GNCSNotificationInfo.NotificationType.INCOMING_CALL && !gNCSNotificationInfo.isOngoing() && SmartNotificationsConfig.getInstance().getAddDismissAppAction(gNCSNotificationInfo.packageName)) {
            gNCSNotificationInfo.actions.add(new GNCSNotificationAction(98, context.getString(R.string.dismiss_notification), false, GNCSNotificationAction.ActionType.NEGATIVE, true));
        }
        if (SmartNotificationsConfig.getInstance().onlyUseWearableActions(gNCSNotificationInfo.packageName)) {
            list = gNCSParsedNotification.wearableActions;
        } else if (SmartNotificationsConfig.getInstance().preferWearableActions(gNCSNotificationInfo.packageName)) {
            list = !gNCSParsedNotification.wearableActions.isEmpty() ? gNCSParsedNotification.wearableActions : gNCSParsedNotification.actions;
        } else {
            list = !gNCSParsedNotification.actions.isEmpty() ? gNCSParsedNotification.actions : gNCSParsedNotification.wearableActions;
        }
        if (!list.isEmpty()) {
            gNCSNotificationInfo.actions.addAll(SmartNotificationsUtil.filterEmojiActions(list));
        }
        if (gNCSNotificationInfo.actions.size() > 1 && gNCSNotificationInfo.actions.get(0).id == 98) {
            String string = context.getString(R.string.dismiss_notification);
            for (int i14 = 1; i14 < gNCSNotificationInfo.actions.size(); i14++) {
                if (gNCSNotificationInfo.actions.get(i14).title.equals(string)) {
                    gNCSNotificationInfo.actions.get(i14).dismissAction = true;
                    gNCSNotificationInfo.actions.remove(0);
                    break;
                }
            }
        }
        GNCSNotificationInfo.NotificationType notificationType = gNCSNotificationInfo.type;
        if (notificationType != GNCSNotificationInfo.NotificationType.MISSED_CALL && notificationType != GNCSNotificationInfo.NotificationType.INCOMING_CALL && SmartNotificationsConfig.getInstance().getAddBlockAppAction(gNCSNotificationInfo.packageName)) {
            gNCSNotificationInfo.actions.add(new GNCSNotificationAction(99, context.getString(R.string.block_app), false, GNCSNotificationAction.ActionType.NEUTRAL));
        }
        if (gNCSNotificationInfo.actions.isEmpty()) {
            return;
        }
        gNCSNotificationInfo.extraFlags |= ANCSMessageBase.FeatureFlag.HAS_ANDROID_ACTIONS.flag;
    }

    @Override // com.garmin.android.gncs.datamappers.AbstractDataMapper
    public void mapExtras(Context context, GNCSParsedNotification gNCSParsedNotification) {
        Bundle bundle = gNCSParsedNotification.extras;
        GNCSNotificationInfo gNCSNotificationInfo = gNCSParsedNotification.notificationInfo;
        populateMedia(context, gNCSNotificationInfo, bundle, false);
        if (bundle == null || bundle.isEmpty()) {
            return;
        }
        if (TextUtils.isEmpty(gNCSNotificationInfo.title)) {
            gNCSNotificationInfo.title = findTitle(bundle);
        }
        if (TextUtils.isEmpty(gNCSNotificationInfo.subTitle)) {
            gNCSNotificationInfo.subTitle = findSubTitle(bundle);
        }
        if (TextUtils.isEmpty(gNCSNotificationInfo.message)) {
            gNCSNotificationInfo.message = findMessage(bundle);
        }
    }

    @Override // com.garmin.android.gncs.datamappers.AbstractDataMapper
    public void mapSimpleActions(Context context, GNCSNotificationInfo gNCSNotificationInfo) {
        if (!SmartNotificationsConfig.getInstance().useSimpleActions(gNCSNotificationInfo.packageName)) {
            List<GNCSNotificationAction> noReplyActions = gNCSNotificationInfo.getNoReplyActions();
            int simpleActionIndex = getSimpleActionIndex(noReplyActions);
            if (!noReplyActions.isEmpty()) {
                int size = noReplyActions.size();
                if (!gNCSNotificationInfo.isOngoing()) {
                    gNCSNotificationInfo.negativeAction = context.getString(R.string.dismiss_notification);
                }
                if (simpleActionIndex < 0 || simpleActionIndex >= size) {
                    return;
                }
                String str = noReplyActions.get(simpleActionIndex).title;
                if (!gNCSNotificationInfo.negativeAction.equals(str)) {
                    gNCSNotificationInfo.positiveAction = str;
                    gNCSNotificationInfo.positiveActionIndex = simpleActionIndex;
                    return;
                }
                gNCSNotificationInfo.negativeActionIndex = simpleActionIndex;
            }
        }
        if (gNCSNotificationInfo.isClearable()) {
            switch (AnonymousClass1.$SwitchMap$com$garmin$android$gncs$GNCSNotificationInfo$NotificationType[gNCSNotificationInfo.type.ordinal()]) {
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
                    if (!gNCSNotificationInfo.isOngoing()) {
                        gNCSNotificationInfo.negativeAction = context.getString(R.string.dismiss_notification);
                    }
                    break;
                case 11:
                    gNCSNotificationInfo.negativeAction = context.getString(R.string.reject_call);
                    gNCSNotificationInfo.positiveAction = context.getString(R.string.accept_call);
                    break;
                case 12:
                    gNCSNotificationInfo.negativeAction = context.getString(R.string.clear_missed_call);
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:85:0x0270  */
    @Override // com.garmin.android.gncs.datamappers.AbstractDataMapper
    public void mapStatus(GNCSNotificationInfo gNCSNotificationInfo, Bundle bundle, GNCSNotificationInfo gNCSNotificationInfo2) {
        GNCSNotificationInfo.NotificationStatus notificationStatus;
        if (!GNCSSettings.getInstance().shouldSendToDevice(gNCSNotificationInfo)) {
            if (gNCSNotificationInfo2 != null && gNCSNotificationInfo2.shouldSend() && gNCSNotificationInfo2.contentMatches(gNCSNotificationInfo)) {
                gNCSNotificationInfo.status = GNCSNotificationInfo.NotificationStatus.UPDATED;
                b.b("GenericDataMapper: mapStatus -> shouldSendToDevice 'no': ".concat("existing 'shouldSend' TRUE, incoming set to UPDATED, content matches"));
            } else {
                gNCSNotificationInfo.status = GNCSNotificationInfo.NotificationStatus.DNS;
                b.b("GenericDataMapper: mapStatus -> shouldSendToDevice 'no': ".concat("incoming set to 'DNS'"));
            }
            gNCSNotificationInfo.statusTimestamp = System.currentTimeMillis();
            return;
        }
        if (bundle != null && (bundle.containsKey("android.mediaSession") || "android.app.Notification$MediaStyle".equals(bundle.getString("android.template")))) {
            b.b("GenericDataMapper: mapStatus -> shouldSendToDevice 'no': notification is from media playback, set to 'DNS'");
            gNCSNotificationInfo.status = GNCSNotificationInfo.NotificationStatus.DNS;
            gNCSNotificationInfo.statusTimestamp = System.currentTimeMillis();
            return;
        }
        if (gNCSNotificationInfo2 == null) {
            gNCSNotificationInfo.status = GNCSNotificationInfo.NotificationStatus.NEW;
            gNCSNotificationInfo.statusTimestamp = System.currentTimeMillis();
            b.b("GenericDataMapper: mapStatus -> shouldSendToDevice 'yes': ".concat("no existing, incoming set to NEW"));
            return;
        }
        String str = "GenericDataMapper: mapStatus -> shouldSendToDevice 'yes': existing [notificationKey: " + gNCSNotificationInfo2.notificationKey + " ] [cacheId:" + gNCSNotificationInfo2.cacheId + " ] [status:" + gNCSNotificationInfo2.status.name() + "], ";
        GNCSNotificationInfo.NotificationStatus notificationStatus2 = GNCSNotificationInfo.NotificationStatus.NEW;
        GNCSNotificationInfo.NotificationStatus notificationStatus3 = gNCSNotificationInfo2.status;
        if (notificationStatus2 == notificationStatus3) {
            if (gNCSNotificationInfo.postTime - gNCSNotificationInfo2.postTime < 600) {
                gNCSNotificationInfo.status = notificationStatus2;
                gNCSNotificationInfo.promotedToNewFromUpdate = true;
                StringBuilder sbI = a.i(str, "incoming [notificationKey: ");
                sbI.append(gNCSNotificationInfo.notificationKey);
                sbI.append("] set to NEW, arrived within 600ms of each other");
                b.b(sbI.toString());
            } else if (gNCSNotificationInfo2.contentMatches(gNCSNotificationInfo)) {
                gNCSNotificationInfo.status = GNCSNotificationInfo.NotificationStatus.UPDATED;
                StringBuilder sbI2 = a.i(str, "incoming [notificationKey: ");
                sbI2.append(gNCSNotificationInfo.notificationKey);
                sbI2.append("] set to UPDATED, appears as repost of same content (send silently)");
                b.b(sbI2.toString());
            } else if (this.lastMessageIsSentByCurrentUser) {
                gNCSNotificationInfo.status = GNCSNotificationInfo.NotificationStatus.UPDATED;
                StringBuilder sbI3 = a.i(str, "incoming [notificationKey: ");
                sbI3.append(gNCSNotificationInfo.notificationKey);
                sbI3.append("] set to UPDATED, last message was sent by current user");
                b.b(sbI3.toString());
            } else if ((gNCSNotificationInfo2.notificationFlags & 8) == 0 || (gNCSNotificationInfo.notificationFlags & 8) == 0 || gNCSNotificationInfo2.contentMatches(gNCSNotificationInfo)) {
                gNCSNotificationInfo.status = notificationStatus2;
                StringBuilder sbI4 = a.i(str, "incoming [notificationKey: ");
                sbI4.append(gNCSNotificationInfo.notificationKey);
                sbI4.append("] set to NEW, arrived more than 600ms of each other, content mismatch");
                b.b(sbI4.toString());
            } else {
                gNCSNotificationInfo.status = GNCSNotificationInfo.NotificationStatus.UPDATED;
                StringBuilder sbI5 = a.i(str, "incoming [notificationKey: ");
                sbI5.append(gNCSNotificationInfo.notificationKey);
                sbI5.append("] set to UPDATED, arrived more than 600ms of each other, content mismatch, alert only once TRUE (send silently)");
                b.b(sbI5.toString());
            }
            gNCSNotificationInfo.statusTimestamp = System.currentTimeMillis();
            return;
        }
        GNCSNotificationInfo.NotificationStatus notificationStatus4 = GNCSNotificationInfo.NotificationStatus.UPDATED;
        if (notificationStatus4 != notificationStatus3 && (notificationStatus = GNCSNotificationInfo.NotificationStatus.NEW_SILENT) != notificationStatus3 && GNCSNotificationInfo.NotificationStatus.DISMISSED != notificationStatus3) {
            if (GNCSNotificationInfo.NotificationStatus.REMOVED != notificationStatus3) {
                if (GNCSNotificationInfo.NotificationStatus.DNS == notificationStatus3) {
                    gNCSNotificationInfo.statusTimestamp = System.currentTimeMillis();
                    gNCSNotificationInfo.status = notificationStatus2;
                    StringBuilder sbI6 = a.i(str, "incoming [notificationKey: ");
                    sbI6.append(gNCSNotificationInfo.notificationKey);
                    sbI6.append("] set to NEW, incoming type ");
                    sbI6.append(gNCSNotificationInfo.type.name());
                    b.b(sbI6.toString());
                    return;
                }
                return;
            }
            if (!gNCSNotificationInfo2.contentMatches(gNCSNotificationInfo) || gNCSNotificationInfo.type == GNCSNotificationInfo.NotificationType.INCOMING_CALL) {
                gNCSNotificationInfo.status = notificationStatus2;
                StringBuilder sbI7 = a.i(str, "incoming [notificationKey: ");
                sbI7.append(gNCSNotificationInfo.notificationKey);
                sbI7.append("] set to NEW, incoming type ");
                sbI7.append(gNCSNotificationInfo.type.name());
                b.b(sbI7.toString());
            } else {
                gNCSNotificationInfo.status = notificationStatus;
                StringBuilder sbI8 = a.i(str, "incoming [notificationKey: ");
                sbI8.append(gNCSNotificationInfo.notificationKey);
                sbI8.append("] set to NEW_SILENT, content matches, type not 'INCOMING_CALL' (");
                sbI8.append(gNCSNotificationInfo.type.name());
                sbI8.append(")");
                b.b(sbI8.toString());
            }
            gNCSNotificationInfo.statusTimestamp = System.currentTimeMillis();
            return;
        }
        if (gNCSNotificationInfo2.contentMatches(gNCSNotificationInfo)) {
            GNCSNotificationInfo.NotificationStatus notificationStatus5 = GNCSNotificationInfo.NotificationStatus.DISMISSED;
            if (notificationStatus5 == gNCSNotificationInfo2.status) {
                notificationStatus4 = notificationStatus5;
            }
            gNCSNotificationInfo.status = notificationStatus4;
            StringBuilder sbI9 = a.i(str, "incoming [notificationKey: ");
            sbI9.append(gNCSNotificationInfo.notificationKey);
            sbI9.append("] set to ");
            sbI9.append(gNCSNotificationInfo.status.name());
            sbI9.append(", content matches");
            b.b(sbI9.toString());
        } else if (this.lastMessageIsSentByCurrentUser) {
            GNCSNotificationInfo.NotificationStatus notificationStatus6 = GNCSNotificationInfo.NotificationStatus.DISMISSED;
            if (notificationStatus6 == gNCSNotificationInfo2.status) {
                notificationStatus4 = notificationStatus6;
            }
            gNCSNotificationInfo.status = notificationStatus4;
            StringBuilder sbI10 = a.i(str, "incoming [notificationKey: ");
            sbI10.append(gNCSNotificationInfo.notificationKey);
            sbI10.append("] set to UPDATED, last message was sent by current user");
            b.b(sbI10.toString());
        } else if ((gNCSNotificationInfo2.notificationFlags & 8) != 0) {
            int i14 = gNCSNotificationInfo.notificationFlags;
            if ((i14 & 8) == 0 || (i14 & 2) == 0) {
                gNCSNotificationInfo.status = notificationStatus2;
                StringBuilder sbI11 = a.i(str, "incoming [notificationKey: ");
                sbI11.append(gNCSNotificationInfo.notificationKey);
                sbI11.append("] set to NEW, content mismatch");
                b.b(sbI11.toString());
            } else {
                gNCSNotificationInfo.status = notificationStatus4;
                StringBuilder sbI12 = a.i(str, "incoming [notificationKey: ");
                sbI12.append(gNCSNotificationInfo.notificationKey);
                sbI12.append("] set to UPDATED, content mismatch, alert only once TRUE (send silently)");
                b.b(sbI12.toString());
            }
        } else {
            gNCSNotificationInfo.status = notificationStatus2;
            StringBuilder sbI13 = a.i(str, "incoming [notificationKey: ");
            sbI13.append(gNCSNotificationInfo.notificationKey);
            sbI13.append("] set to NEW, content mismatch");
            b.b(sbI13.toString());
        }
        gNCSNotificationInfo.statusTimestamp = System.currentTimeMillis();
    }

    @Override // com.garmin.android.gncs.datamappers.AbstractDataMapper
    public void populateMedia(Context context, GNCSNotificationInfo gNCSNotificationInfo, Bundle bundle, boolean z14) {
        Bundle bundle2;
        String string;
        Object obj;
        StringBuilder sb3 = new StringBuilder(j.o(gNCSNotificationInfo.notificationKey, "] ", new StringBuilder("MMS#GenericDataMapper:  -> populateMedia for [")));
        if (bundle == null) {
            sb3.append(" Parsed notification has no Extras ");
        } else if (Objects.equals(bundle.getString("android.template"), Notification.MessagingStyle.class.getName())) {
            sb3.append("\n Extras present and Messaging style matches , Checking for Images in EXTRA_MESSAGES.");
            for (Parcelable parcelable : bundle.getParcelableArray("android.messages")) {
                if ((parcelable instanceof Bundle) && (string = (bundle2 = (Bundle) parcelable).getString(NotificationConstants.KEY_DATA_MIME_TYPE)) != null && string.startsWith("image/") && (obj = bundle2.get("uri")) != null) {
                    sb3.append("\n Image found in EXTRA_MESSAGES. Adding image uri: ");
                    sb3.append(obj);
                    addImagesToMMSNotification(context, gNCSNotificationInfo, (Uri) obj);
                }
            }
        } else if (bundle.containsKey("android.backgroundImageUri")) {
            sb3.append("\n Extras present , Checking for Image in EXTRA_BACKGROUND_IMAGE_URI.");
            Object obj2 = bundle.get("android.backgroundImageUri");
            if (obj2 != null) {
                addImagesToMMSNotification(context, gNCSNotificationInfo, (Uri) obj2);
            }
        }
        if (hasImage(gNCSNotificationInfo, z14, sb3)) {
            gNCSNotificationInfo.extraFlags |= ANCSMessageBase.FeatureFlag.HAS_MEDIA.flag;
        } else {
            sb3.append("\n No Images found in notification");
        }
        b.b(sb3.toString());
    }
}
