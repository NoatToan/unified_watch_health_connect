package com.garmin.android.gncs;

import am.j;
import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.RemoteInput;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import android.widget.RemoteViews;
import com.garmin.android.ancs.ANCSMessageBase;
import com.garmin.android.gncs.datamappers.AbstractDataMapper;
import com.garmin.android.gncs.persistence.CacheManager;
import com.garmin.android.gncs.persistence.GNCSNotificationAction;
import com.garmin.android.gncs.settings.GNCSSettings;
import com.garmin.android.gncs.settings.SmartNotificationsConfig;
import com.garmin.android.gncs.telephony.PhoneCallListener;
import com.garmin.android.gncs.telephony.TelephonyUtilKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import z6.r;

/* JADX INFO: loaded from: classes11.dex */
class GNCSNotificationParser {
    private static List<Bitmap> checkForImagesInRingAppNotification(Notification notification) {
        StringBuilder sb3 = new StringBuilder("checkForImagesInRingAppNotification => Begin\nTemplateClass is ");
        String string = notification.extras.getString("android.template");
        sb3.append(string);
        sb3.append("\n");
        ArrayList arrayList = null;
        if (Objects.equals(string, Notification.DecoratedCustomViewStyle.class.getName())) {
            RemoteViews remoteViews = notification.contentView;
            if (remoteViews == null) {
                remoteViews = notification.bigContentView;
            }
            if (remoteViews != null) {
                sb3.append("RemoteView Found in notification \n");
                Parcel parcelObtain = Parcel.obtain();
                try {
                    remoteViews.writeToParcel(parcelObtain, 0);
                    parcelObtain.setDataPosition(0);
                    if (parcelObtain.readInt() == 0) {
                        sb3.append("RemoteView has Single Layout ");
                        sb3.append("\n");
                    } else {
                        sb3.append("RemoteView has Multiple Layouts ");
                        sb3.append("\n");
                    }
                    ArrayList arrayList2 = new ArrayList();
                    parcelObtain.readTypedList(arrayList2, Bitmap.CREATOR);
                    if (arrayList2.isEmpty()) {
                        sb3.append("Found No images in the RemoteView of notification ");
                        sb3.append("\n");
                    } else {
                        try {
                            sb3.append("Found ");
                            sb3.append(arrayList2.size());
                            sb3.append(" images in the RemoteView of notification");
                            sb3.append("\n");
                            arrayList = arrayList2;
                        } catch (Exception e4) {
                            arrayList = arrayList2;
                            e = e4;
                            ih2.b.a(e, "Error in accessing internalField");
                            sb3.append("\n");
                        }
                    }
                } catch (Exception e14) {
                    e = e14;
                }
                parcelObtain.recycle();
            }
        }
        sb3.append("checkForImagesInRingAppNotification => End \n");
        ih2.b.b(sb3.toString());
        return arrayList;
    }

    private static int getCallTypeForPhoneCallNotifications(Notification notification) {
        int i14 = notification.extras.getInt("android.callType", -1);
        if (i14 == 1) {
            ih2.b.b("GNCSNotificationParser.getNotificationType: Call style is incoming");
            return i14;
        }
        if (i14 == 2) {
            ih2.b.b("GNCSNotificationParser.getNotificationType: Call style is ongoing");
            return i14;
        }
        if (i14 != 3) {
            ih2.b.b("GNCSNotificationParser.getNotificationType: Call style is unknown");
            return i14;
        }
        ih2.b.b("GNCSNotificationParser.getNotificationType: Call style is screening");
        return i14;
    }

    private static boolean isLargeIconPresent(Notification notification) {
        StringBuilder sb3 = new StringBuilder("MMS# GNCSNotificationParser.isLargeIconPresent ->\nNotification has style class : ");
        String string = notification.extras.getString("android.template");
        sb3.append(string);
        sb3.append("\n");
        boolean z14 = false;
        if (Objects.equals(string, Notification.BigPictureStyle.class.getName())) {
            sb3.append("Style class matches ");
            sb3.append(Notification.BigPictureStyle.class.getName());
            sb3.append("\n");
            boolean z15 = (notification.extras.get("android.largeIcon.big") == null && notification.extras.get("android.picture") == null) ? false : true;
            if (Build.VERSION.SDK_INT < 31) {
                z14 = z15;
            } else if (z15 || notification.extras.get("android.pictureIcon") != null) {
                z14 = true;
            }
        }
        sb3.append("Notification has largeIcon: ");
        sb3.append(z14);
        sb3.append("\n");
        ih2.b.b(sb3.toString());
        return z14;
    }

    public static int isProgressUpdateNotification(Bundle bundle) {
        if (!bundle.isEmpty()) {
            boolean z14 = bundle.getBoolean("android.progressIndeterminate", false);
            boolean z15 = bundle.getInt("android.progress") != 0;
            boolean z16 = bundle.getInt("android.progressMax", -1) != 0;
            if (z14 || (z15 && z16)) {
                return 1;
            }
        }
        return 0;
    }

    private static List<GNCSNotificationAction> parseActions(List<Notification.Action> list) {
        boolean z14;
        ih2.b.b("GNCSNotificationParser.parseActions -> \n");
        ArrayList arrayList = new ArrayList(list.size());
        int i14 = 0;
        for (Notification.Action action : list) {
            CharSequence charSequence = action.title;
            if (charSequence != null && !charSequence.toString().isEmpty()) {
                StringBuilder sb3 = new StringBuilder("[ title: ");
                sb3.append(action.title.toString());
                sb3.append(" , ");
                RemoteInput[] remoteInputs = action.getRemoteInputs();
                if (remoteInputs == null) {
                    z14 = false;
                    break;
                }
                int length = remoteInputs.length;
                int i15 = 0;
                while (true) {
                    if (i15 >= length) {
                        z14 = false;
                        break;
                    }
                    if (remoteInputs[i15].getAllowFreeFormInput()) {
                        z14 = true;
                        break;
                    }
                    i15++;
                }
                sb3.append("allowReplies: ");
                sb3.append(z14);
                sb3.append(" ]");
                ih2.b.b(sb3.toString());
                arrayList.add(new GNCSNotificationAction(i14, action.title.toString(), z14));
                i14++;
            }
        }
        return arrayList;
    }

    private static List<GNCSNotificationAction> parseActionsForIncomingCallNotifications(Notification notification) {
        int i14;
        StringBuilder sb3 = new StringBuilder("GNCSNotificationParser.parseActionsForIncomingCallNotifications->\n");
        Notification.Action[] actionArr = notification.actions;
        if (actionArr == null || actionArr.length == 0) {
            return Collections.EMPTY_LIST;
        }
        String string = notification.extras.getString("android.template");
        String name = r.class.getName();
        if (Build.VERSION.SDK_INT >= 31) {
            name = c.a().getName();
        }
        if (!Objects.equals(string, name)) {
            j.y(sb3, "Template is : ", string, " , not a CALLStyle notification. So parsing actions normally.");
            return parseActions((List<Notification.Action>) Arrays.asList(actionArr));
        }
        sb3.append("Template is : ");
        sb3.append(string);
        sb3.append(" , parsing actions for incoming call notification.\n");
        ArrayList arrayList = new ArrayList(actionArr.length);
        int i15 = 0;
        for (Notification.Action action : actionArr) {
            if (action.actionIntent.equals(notification.extras.get("android.answerIntent"))) {
                sb3.append("Positive Intent Action Found title: ");
                sb3.append(action.title);
                sb3.append("\n");
                i14 = i15 + 1;
                arrayList.add(new GNCSNotificationAction(i15, action.title.toString(), false, GNCSNotificationAction.ActionType.POSITIVE));
            } else {
                if (action.actionIntent.equals(notification.extras.get("android.declineIntent"))) {
                    sb3.append("Negative Intent Action Found title: ");
                    sb3.append(action.title);
                    sb3.append("\n");
                    i14 = i15 + 1;
                    arrayList.add(new GNCSNotificationAction(i15, action.title.toString(), false, GNCSNotificationAction.ActionType.NEGATIVE));
                }
            }
            i15 = i14;
        }
        ih2.b.b(sb3.toString());
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0178  */
    @SuppressLint({"ObsoleteSdkInt"})
    public static GNCSParsedNotification parseNotification(Context context, StatusBarNotification statusBarNotification) {
        List<GNCSNotificationAction> actions;
        int i14;
        GNCSNotificationInfo notification = CacheManager.INSTANCE.getNotification(GNCSNotificationInfo.createKey(statusBarNotification.getKey(), statusBarNotification.getPackageName()));
        GNCSNotificationInfo gNCSNotificationInfo = new GNCSNotificationInfo();
        gNCSNotificationInfo.packageName = statusBarNotification.getPackageName();
        gNCSNotificationInfo.postTime = statusBarNotification.getPostTime();
        if (notification != null) {
            gNCSNotificationInfo.cacheId = notification.cacheId;
            gNCSNotificationInfo.cacheKey = notification.cacheKey;
        }
        Notification notification2 = statusBarNotification.getNotification();
        gNCSNotificationInfo.notificationFlags = notification2.flags;
        gNCSNotificationInfo.numEvents = notification2.number;
        gNCSNotificationInfo.priority = notification2.priority;
        gNCSNotificationInfo.when = notification2.when;
        gNCSNotificationInfo.notificationKey = statusBarNotification.getKey();
        String group = notification2.getGroup();
        gNCSNotificationInfo.groupKey = group;
        if (TextUtils.isEmpty(group)) {
            gNCSNotificationInfo.groupKey = statusBarNotification.getGroupKey();
        }
        if (TextUtils.isEmpty(gNCSNotificationInfo.groupKey)) {
            gNCSNotificationInfo.groupKey = statusBarNotification.getOverrideGroupKey();
        }
        gNCSNotificationInfo.category = notification2.category;
        gNCSNotificationInfo.type = GNCSSettings.getInstance().getNotificationTypeForPackage(context, gNCSNotificationInfo.packageName, notification2.category, gNCSNotificationInfo.groupKey);
        gNCSNotificationInfo.hasLargeIcon = isLargeIconPresent(notification2);
        gNCSNotificationInfo.isProgressUpdate = isProgressUpdateNotification(notification2.extras);
        gNCSNotificationInfo.conversationId = populateConversationId(notification2);
        gNCSNotificationInfo.isSuppressed = shouldSuppressBubbleNotification(notification2);
        if (GNCSNotificationInfo.NotificationType.MISSED_CALL.equals(gNCSNotificationInfo.type)) {
            String missedCallPhoneNumber = PhoneCallListener.INSTANCE.getMissedCallPhoneNumber();
            gNCSNotificationInfo.phoneNumber = missedCallPhoneNumber;
            if (missedCallPhoneNumber != null) {
                int length = missedCallPhoneNumber.length();
                int iCharCount = 0;
                while (iCharCount < length) {
                    int iCodePointAt = missedCallPhoneNumber.codePointAt(iCharCount);
                    if (!Character.isWhitespace(iCodePointAt)) {
                        ih2.b.b("GNCSNotificationParser.parseNotification: Notification Type is missed call and phone number is available. Setting PHONE_NUMBER_AVAILABLE flag.");
                        gNCSNotificationInfo.extraFlags = ANCSMessageBase.FeatureFlag.PHONE_NUMBER_AVAILABLE.flag;
                        break;
                    }
                    iCharCount += Character.charCount(iCodePointAt);
                }
            }
        }
        if (SmartNotificationsUtil.Packages.PACKAGES_WITH_REMOTE_VIEW_IMAGES.contains(statusBarNotification.getPackageName()) && SmartNotificationsConfig.getInstance().isRemoteViewImageParsingEnabled()) {
            ih2.b.b("GNCSNotificationParser.parseNotification: Ring App notification->  Parsing Details : Begin");
            try {
                List<Bitmap> listCheckForImagesInRingAppNotification = checkForImagesInRingAppNotification(statusBarNotification.getNotification());
                if (listCheckForImagesInRingAppNotification != null) {
                    gNCSNotificationInfo.numRemoteViewImages = listCheckForImagesInRingAppNotification.size();
                    ih2.b.b(gNCSNotificationInfo.numRemoteViewImages + " RemoteView Images found in ring app notifications");
                }
            } catch (Exception e4) {
                ih2.b.a(e4, "Exception in checkForImagesInRingAppNotification ");
            }
            ih2.b.b("GNCSNotificationParser.parseNotification: Ring App notification->  Parsing Details : End");
        }
        if (!GNCSNotificationInfo.NotificationType.INCOMING_CALL.equals(gNCSNotificationInfo.type) || TelephonyUtilKt.isDialerPackage(context, statusBarNotification.getPackageName())) {
            actions = parseActions(notification2);
        } else {
            ih2.b.b("GNCSNotificationParser.parseNotification: Incoming call notification from non-dialer app. ");
            actions = parseActionsForIncomingCallNotifications(notification2);
        }
        GNCSParsedNotification gNCSParsedNotification = new GNCSParsedNotification(gNCSNotificationInfo, notification, notification2.extras, actions, parseWearableActions(notification2));
        String str = gNCSParsedNotification.notificationInfo.packageName;
        ih2.b bVar = ih2.b.f93516a;
        context.getClass();
        if (TextUtils.isEmpty(str)) {
            i14 = -1;
        } else {
            ih2.b bVar2 = ih2.b.f93516a;
            str.getClass();
            bVar2.getClass();
            PackageManager packageManager = context.getPackageManager();
            PackageInfo packageInfo = null;
            if (packageManager != null) {
                try {
                    packageInfo = packageManager.getPackageInfo(str, 0);
                } catch (PackageManager.NameNotFoundException e14) {
                    ih2.b.a(e14, "GNCSCoreUtil.getPackageInfo");
                }
            }
            if (packageInfo != null) {
                i14 = packageInfo.versionCode;
            } else {
                i14 = -1;
            }
        }
        AbstractDataMapper.getDataMapper(context, gNCSParsedNotification, i14).mapData(context, gNCSParsedNotification);
        gNCSNotificationInfo.callType = getCallTypeForPhoneCallNotifications(notification2);
        return gNCSParsedNotification;
    }

    private static List<GNCSNotificationAction> parseWearableActions(Notification notification) {
        ih2.b.b("GNCSNotificationParser.parseWearableActions -> ");
        try {
            List<Notification.Action> actions = new Notification.WearableExtender(notification).getActions();
            if (actions != null && !actions.isEmpty()) {
                return parseActions(actions);
            }
            ih2.b.b("No wearable actions \n");
            return Collections.EMPTY_LIST;
        } catch (Throwable unused) {
            ih2.b.b("exception handling wearable actions");
            return Collections.EMPTY_LIST;
        }
    }

    private static String populateConversationId(Notification notification) {
        StringBuilder sb3 = new StringBuilder("CONV# GNCSNotificationParser.populateConversationId ->\nNotification has style class : ");
        String string = notification.extras.getString("android.template");
        sb3.append(string);
        sb3.append("\n");
        String shortcutId = "";
        if (Objects.equals(string, Notification.MessagingStyle.class.getName())) {
            sb3.append("Style class matches ");
            sb3.append(Notification.MessagingStyle.class.getName());
            sb3.append("\nSDK is >= Build.VERSION_CODES.O\n");
            if (notification.getShortcutId() != null) {
                shortcutId = notification.getShortcutId();
            }
        }
        sb3.append("Conversation id populated as ->");
        sb3.append(shortcutId);
        sb3.append("\n");
        ih2.b.b(sb3.toString());
        return shortcutId;
    }

    private static boolean shouldSuppressBubbleNotification(Notification notification) {
        Notification.BubbleMetadata bubbleMetadata;
        StringBuilder sb3 = new StringBuilder("GNCSNotificationParser.shouldSuppressBubbleNotification ->\nIs Notification Suppressed : ");
        boolean zIsNotificationSuppressed = (Build.VERSION.SDK_INT < 29 || (bubbleMetadata = notification.getBubbleMetadata()) == null) ? false : bubbleMetadata.isNotificationSuppressed();
        sb3.append(zIsNotificationSuppressed);
        ih2.b.b(sb3.toString());
        return zIsNotificationSuppressed;
    }

    public static List<GNCSNotificationAction> parseActions(Notification notification) {
        Notification.Action[] actionArr = notification.actions;
        if (actionArr != null && actionArr.length != 0) {
            return parseActions((List<Notification.Action>) Arrays.asList(actionArr));
        }
        return Collections.EMPTY_LIST;
    }
}
