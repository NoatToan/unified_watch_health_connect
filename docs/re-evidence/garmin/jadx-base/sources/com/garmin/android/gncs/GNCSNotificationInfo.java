package com.garmin.android.gncs;

import android.net.Uri;
import android.text.TextUtils;
import com.garmin.android.gncs.notificationmatcher.NotificationMatcher;
import com.garmin.android.gncs.persistence.GNCSNotificationAction;
import com.google.common.base.Ascii;
import i3.e5;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class GNCSNotificationInfo {
    public static final String TABLE_NAME = "notification_info";
    public NotificationStatus status = NotificationStatus.NEW;
    public boolean promotedToNewFromUpdate = false;
    public long statusTimestamp = 0;
    public String title = "";
    public String subTitle = "";
    public String message = "";
    public String positiveAction = "";
    public String negativeAction = "";
    public String phoneNumber = "";
    public String cacheKey = "";
    public long cacheId = -1;
    public String notificationKey = "";
    public String packageName = "";
    public String groupKey = "";
    public NotificationType type = NotificationType.OTHER;
    public long postTime = 0;
    public long when = 0;
    public int positiveActionIndex = -1;
    public int negativeActionIndex = -1;
    public int notificationFlags = 0;
    public int eventFlags = 0;
    public int extraFlags = 0;
    public String category = "";
    public int priority = 0;
    public int numEvents = 0;
    public int isProgressUpdate = 0;
    public boolean hasLargeIcon = false;
    public String conversationId = "";
    public boolean isSuppressed = false;
    public int numRemoteViewImages = 0;
    public List<GNCSNotificationAction> actions = new ArrayList();
    public List<Uri> images = new ArrayList();
    public int callType = -1;

    public enum NotificationStatus {
        NEW,
        NEW_SILENT,
        UPDATED,
        DISMISSED,
        REMOVED,
        DNS
    }

    public enum NotificationType {
        OTHER((byte) 0),
        INCOMING_CALL((byte) 1),
        MISSED_CALL((byte) 2),
        VOICEMAIL((byte) 3),
        SOCIAL((byte) 4),
        SCHEDULE((byte) 5),
        EMAIL((byte) 6),
        NEWS((byte) 7),
        HEALTH_AND_FITNESS((byte) 8),
        BUSINESS_AND_FINANCE((byte) 9),
        LOCATION((byte) 10),
        ENTERTAINMENT(Ascii.VT),
        SMS(Ascii.FF);


        /* JADX INFO: renamed from: id, reason: collision with root package name */
        public final byte f49893id;

        NotificationType(byte b14) {
            this.f49893id = b14;
        }
    }

    public static String createKey(GNCSNotificationInfo gNCSNotificationInfo) {
        return createKey(gNCSNotificationInfo.notificationKey, gNCSNotificationInfo.packageName);
    }

    public boolean contentMatches(GNCSNotificationInfo gNCSNotificationInfo, boolean z14) {
        return gNCSNotificationInfo != null && NotificationMatcher.isNotificationMatch(this, gNCSNotificationInfo, z14);
    }

    public int getMediaCount() {
        return this.images.size();
    }

    public List<GNCSNotificationAction> getNoReplyActions() {
        ArrayList arrayList = new ArrayList();
        List<GNCSNotificationAction> list = this.actions;
        if (list != null && !list.isEmpty()) {
            for (GNCSNotificationAction gNCSNotificationAction : this.actions) {
                if (!gNCSNotificationAction.requiresInput) {
                    arrayList.add(gNCSNotificationAction);
                }
            }
        }
        return arrayList;
    }

    public boolean isActive() {
        NotificationStatus notificationStatus = this.status;
        return notificationStatus == NotificationStatus.NEW || notificationStatus == NotificationStatus.NEW_SILENT || notificationStatus == NotificationStatus.UPDATED;
    }

    public boolean isClearable() {
        int i14 = this.notificationFlags;
        return (i14 & 2) == 0 && (i14 & 32) == 0;
    }

    public boolean isDismissed() {
        return this.status == NotificationStatus.DISMISSED;
    }

    public boolean isGroup() {
        return !TextUtils.isEmpty(this.groupKey);
    }

    public boolean isGroupSummary() {
        return isGroup() && (this.notificationFlags & 512) == 512;
    }

    public boolean isOngoing() {
        return (this.notificationFlags & 2) != 0;
    }

    public boolean isProgressUpdateNotification() {
        return this.isProgressUpdate == 1;
    }

    public boolean isRemoved() {
        return this.status == NotificationStatus.REMOVED;
    }

    public boolean shouldSend() {
        return isActive() && !this.isSuppressed;
    }

    public static String createKey(String str, String str2) {
        return e5.g(str, ":", str2);
    }

    public boolean contentMatches(GNCSNotificationInfo gNCSNotificationInfo) {
        return contentMatches(gNCSNotificationInfo, true);
    }
}
