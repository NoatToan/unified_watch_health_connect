package com.garmin.android.gncs;

import am.j;
import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import cd0.v;
import com.garmin.android.ancs.ANCSMessageBase;
import com.garmin.android.gncs.persistence.CacheManager;
import com.garmin.android.gncs.settings.GNCSSettings;
import com.garmin.android.gncs.settings.SmartNotificationsConfig;
import com.garmin.android.gncs.telephony.TelephonyUtilKt;
import i3.e5;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes11.dex */
public class GNCSNotificationManager {
    private static final String TAG = "GNCSNotificationManager: ";
    private static final AtomicInteger nextId = new AtomicInteger(0);
    private final Set<GNCSNotificationListener> listeners;

    public static class InjectorConfiguration extends jb2.a {
        @Override // jb2.a
        public void configure() {
            bindSingleton(GNCSNotificationManager.class, (ib2.a) new a(0));
        }
    }

    private GNCSNotificationManager() {
        this.listeners = new CopyOnWriteArraySet();
        nextId.set(CacheManager.INSTANCE.getMaxCacheId() + 1);
    }

    private void cacheNotification(GNCSNotificationInfo gNCSNotificationInfo) {
        if (gNCSNotificationInfo.cacheId == -1) {
            gNCSNotificationInfo.cacheId = getNextId();
        }
        if (TextUtils.isEmpty(gNCSNotificationInfo.cacheKey)) {
            gNCSNotificationInfo.cacheKey = GNCSNotificationInfo.createKey(gNCSNotificationInfo);
        }
        if (gNCSNotificationInfo.statusTimestamp == 0) {
            gNCSNotificationInfo.statusTimestamp = System.currentTimeMillis();
        }
        CacheManager.INSTANCE.saveNotification(gNCSNotificationInfo);
    }

    private int getNextId() {
        return nextId.getAndIncrement();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$postNotification$0(GNCSNotificationInfo gNCSNotificationInfo, boolean z14) {
        GNCSNotificationInfo notification = CacheManager.INSTANCE.getNotification(gNCSNotificationInfo.cacheKey);
        if (notification != null) {
            postToListeners(notification, z14);
        }
    }

    private void postToListeners(GNCSNotificationInfo gNCSNotificationInfo, boolean z14) {
        if (this.listeners.isEmpty()) {
            StringBuilder sb3 = new StringBuilder("postToListeners -> no device has subscribed, cacheId [");
            sb3.append(gNCSNotificationInfo.cacheId);
            sb3.append("], [ GroupSummary: \"+ni.isGroupSummary()+\" ], [");
            trace(j.o(gNCSNotificationInfo.packageName, "]", sb3));
            return;
        }
        for (GNCSNotificationListener gNCSNotificationListener : this.listeners) {
            if (z14) {
                trace("postToListeners -> NEW cacheId [" + gNCSNotificationInfo.cacheId + "], [ GroupSummary: " + gNCSNotificationInfo.isGroupSummary() + " ], [" + gNCSNotificationInfo.packageName + "] , [" + gNCSNotificationInfo.type.name() + "]");
                gNCSNotificationListener.onNotificationPosted(gNCSNotificationInfo);
            } else {
                trace("postToListeners -> UPDATED cacheId [" + gNCSNotificationInfo.cacheId + "], [ GroupSummary: " + gNCSNotificationInfo.isGroupSummary() + " ], [" + gNCSNotificationInfo.packageName + "] , [" + gNCSNotificationInfo.type.name() + "]");
                gNCSNotificationListener.onNotificationUpdated(gNCSNotificationInfo);
            }
        }
    }

    private void removeNotification(GNCSNotificationInfo gNCSNotificationInfo, boolean z14) {
        GNCSNotificationInfo groupSummaryNotification;
        trace("removeNotification -> cacheId [" + gNCSNotificationInfo.cacheId + "], [" + gNCSNotificationInfo.packageName + "], current status [" + gNCSNotificationInfo.status.name() + "]");
        CacheManager cacheManager = CacheManager.INSTANCE;
        GNCSNotificationInfo notification = cacheManager.getNotification(gNCSNotificationInfo.cacheId);
        if (notification == null) {
            removeNotificationGroup(gNCSNotificationInfo);
            return;
        }
        if (notification.isGroup()) {
            if (notification.isGroupSummary() && cacheManager.groupNotificationHasChildren(notification.groupKey)) {
                removeNotificationGroup(notification);
            } else {
                if (z14 || (groupSummaryNotification = cacheManager.getGroupSummaryNotification(gNCSNotificationInfo.groupKey)) == null || groupSummaryNotification.status == GNCSNotificationInfo.NotificationStatus.REMOVED) {
                    notification.status = GNCSNotificationInfo.NotificationStatus.REMOVED;
                    notification.statusTimestamp = System.currentTimeMillis();
                } else {
                    notification.status = GNCSNotificationInfo.NotificationStatus.DISMISSED;
                    notification.statusTimestamp = 0L;
                }
                cacheManager.saveNotification(notification);
            }
        } else if (notification.packageName.startsWith(BuildConfig.ARTIFACT_GROUP_ID)) {
            cacheManager.removeNotification(notification);
        } else {
            notification.status = GNCSNotificationInfo.NotificationStatus.REMOVED;
            notification.statusTimestamp = System.currentTimeMillis();
            cacheManager.saveNotification(notification);
        }
        removeFromListeners(notification);
    }

    private synchronized void removeNotificationGroup(GNCSNotificationInfo gNCSNotificationInfo) {
        if (gNCSNotificationInfo.isGroupSummary()) {
            for (GNCSNotificationInfo gNCSNotificationInfo2 : CacheManager.INSTANCE.getNotificationsByGroup(gNCSNotificationInfo.groupKey)) {
                gNCSNotificationInfo2.status = GNCSNotificationInfo.NotificationStatus.REMOVED;
                gNCSNotificationInfo2.statusTimestamp = System.currentTimeMillis();
                CacheManager.INSTANCE.saveNotification(gNCSNotificationInfo2);
            }
        }
    }

    private void trace(String str) {
        ih2.b.b(TAG + str);
    }

    public void clearNonOngoing() {
        Iterator<GNCSNotificationInfo> it = CacheManager.INSTANCE.getNotificationsByPackage(SmartNotificationsUtil.Packages.MISSED_PACKAGE_NAME).iterator();
        while (it.hasNext()) {
            removeNotification(it.next());
        }
    }

    public void postNotification(GNCSNotificationInfo gNCSNotificationInfo, GNCSNotificationInfo gNCSNotificationInfo2, Handler handler, Context context) {
        boolean z14;
        trace("postNotif -> cacheId [" + gNCSNotificationInfo.cacheId + "], [" + gNCSNotificationInfo.packageName + "], [" + gNCSNotificationInfo.status.name() + "]");
        if (!gNCSNotificationInfo.shouldSend()) {
            if (gNCSNotificationInfo2 != null && gNCSNotificationInfo2.shouldSend()) {
                removeFromListeners(gNCSNotificationInfo);
            }
            CacheManager.INSTANCE.saveNotification(gNCSNotificationInfo);
            return;
        }
        GNCSNotificationInfo.NotificationType notificationType = gNCSNotificationInfo.type;
        GNCSNotificationInfo.NotificationType notificationType2 = GNCSNotificationInfo.NotificationType.INCOMING_CALL;
        if (notificationType == notificationType2 && !gNCSNotificationInfo.packageName.equals(SmartNotificationsUtil.Packages.INCOMING_PACKAGE_NAME)) {
            List<GNCSNotificationInfo> activeNotifications = CacheManager.INSTANCE.getActiveNotifications(notificationType2);
            boolean zIsEmpty = TextUtils.isEmpty(gNCSNotificationInfo.phoneNumber);
            for (GNCSNotificationInfo gNCSNotificationInfo3 : activeNotifications) {
                if (!zIsEmpty && gNCSNotificationInfo3.packageName.equals(SmartNotificationsUtil.Packages.INCOMING_PACKAGE_NAME) && TelephonyUtilKt.areSamePhoneNumber(context, gNCSNotificationInfo.phoneNumber, gNCSNotificationInfo3.phoneNumber)) {
                    trace(j.o(gNCSNotificationInfo.packageName, "] not sending incoming call notification because GNCS app posted one for the same phone number.", new StringBuilder("postNotif -> [")));
                    return;
                }
            }
            if (!activeNotifications.isEmpty()) {
                trace(e5.h(new StringBuilder("postNotif -> ["), gNCSNotificationInfo.packageName, "] Received another incoming call notification with ", !zIsEmpty ? "different phone number" : "no phone number", " and GNCS already posted one. Sending to watch ."));
            }
        }
        GNCSNotificationInfo.NotificationStatus notificationStatus = gNCSNotificationInfo.status;
        if (notificationStatus == GNCSNotificationInfo.NotificationStatus.UPDATED) {
            gNCSNotificationInfo.eventFlags = ANCSMessageBase.EventFlag.SILENT.flag;
            z14 = false;
        } else {
            z14 = true;
        }
        GNCSNotificationInfo.NotificationStatus notificationStatus2 = GNCSNotificationInfo.NotificationStatus.NEW;
        if (notificationStatus == notificationStatus2 || notificationStatus == GNCSNotificationInfo.NotificationStatus.NEW_SILENT) {
            if (gNCSNotificationInfo2 == null || gNCSNotificationInfo2.status == GNCSNotificationInfo.NotificationStatus.REMOVED) {
                gNCSNotificationInfo.cacheId = getNextId();
                gNCSNotificationInfo.cacheKey = GNCSNotificationInfo.createKey(gNCSNotificationInfo);
            } else {
                StringBuilder sb3 = new StringBuilder("There is an existing notification that is in [");
                sb3.append(gNCSNotificationInfo2.status);
                sb3.append("] status. Taking cacheID [ ");
                trace(j.i(gNCSNotificationInfo2.cacheId, " ] from that ", sb3));
                gNCSNotificationInfo.cacheId = gNCSNotificationInfo2.cacheId;
                gNCSNotificationInfo.cacheKey = gNCSNotificationInfo2.cacheKey;
            }
            gNCSNotificationInfo.eventFlags = (gNCSNotificationInfo.status == notificationStatus2 ? ANCSMessageBase.EventFlag.IMPORTANT : ANCSMessageBase.EventFlag.SILENT).flag;
        }
        if (gNCSNotificationInfo.postTime <= 0) {
            gNCSNotificationInfo.postTime = System.currentTimeMillis();
        }
        cacheNotification(gNCSNotificationInfo);
        if (gNCSNotificationInfo.isGroup()) {
            if (gNCSNotificationInfo.isGroupSummary()) {
                trace(j.i(gNCSNotificationInfo.cacheId, "] is a groupSummary.", new StringBuilder("Notification [")));
                CacheManager cacheManager = CacheManager.INSTANCE;
                if (cacheManager.groupNotificationHasChildren(gNCSNotificationInfo.groupKey)) {
                    if (gNCSNotificationInfo.status != GNCSNotificationInfo.NotificationStatus.DNS) {
                        gNCSNotificationInfo.status = GNCSNotificationInfo.NotificationStatus.DISMISSED;
                        gNCSNotificationInfo.statusTimestamp = System.currentTimeMillis();
                    }
                    cacheManager.saveNotification(gNCSNotificationInfo);
                    return;
                }
                trace(j.i(gNCSNotificationInfo.cacheId, "] has No Children.", new StringBuilder("GroupSummary notification [")));
                if (TextUtils.isEmpty(gNCSNotificationInfo.subTitle) && TextUtils.isEmpty(gNCSNotificationInfo.message)) {
                    StringBuilder sb4 = new StringBuilder("GroupSummary notification [");
                    sb4.append(gNCSNotificationInfo.cacheId);
                    sb4.append("] has empty subtitle [");
                    sb4.append(gNCSNotificationInfo.subTitle);
                    sb4.append("]  and empty content [");
                    trace(j.o(gNCSNotificationInfo.message, "].", sb4));
                    if (gNCSNotificationInfo.status != GNCSNotificationInfo.NotificationStatus.DNS) {
                        trace(j.i(gNCSNotificationInfo.cacheId, "] status as dismissed.", new StringBuilder("Setting GroupSummary notification  [")));
                        gNCSNotificationInfo.status = GNCSNotificationInfo.NotificationStatus.DISMISSED;
                        gNCSNotificationInfo.statusTimestamp = System.currentTimeMillis();
                    }
                    cacheManager.saveNotification(gNCSNotificationInfo);
                    return;
                }
                if (SmartNotificationsConfig.getInstance().isVerboseLoggingEnabled()) {
                    StringBuilder sb5 = new StringBuilder("GroupSummary notification [");
                    sb5.append(gNCSNotificationInfo.cacheId);
                    sb5.append("] has title [");
                    sb5.append(gNCSNotificationInfo.title);
                    sb5.append("], subtitle [");
                    sb5.append(gNCSNotificationInfo.subTitle);
                    sb5.append("]  and content [");
                    trace(j.o(gNCSNotificationInfo.message, "].", sb5));
                }
            } else {
                CacheManager cacheManager2 = CacheManager.INSTANCE;
                GNCSNotificationInfo groupSummaryNotification = cacheManager2.getGroupSummaryNotification(gNCSNotificationInfo.groupKey);
                if (groupSummaryNotification != null) {
                    if (groupSummaryNotification.isActive()) {
                        groupSummaryNotification.status = GNCSNotificationInfo.NotificationStatus.DISMISSED;
                        groupSummaryNotification.statusTimestamp = System.currentTimeMillis();
                    }
                    cacheManager2.saveNotification(groupSummaryNotification);
                    removeFromListeners(groupSummaryNotification);
                }
            }
        }
        if (!gNCSNotificationInfo.isActive() || !GNCSSettings.getInstance().shouldSendToDevice(gNCSNotificationInfo)) {
            if (gNCSNotificationInfo2 != null) {
                removeNotification(gNCSNotificationInfo2);
            }
        } else if (gNCSNotificationInfo.type != GNCSNotificationInfo.NotificationType.INCOMING_CALL || gNCSNotificationInfo.packageName.equals(SmartNotificationsUtil.Packages.INCOMING_PACKAGE_NAME)) {
            postToListeners(gNCSNotificationInfo, z14);
        } else {
            handler.postDelayed(new v(this, gNCSNotificationInfo, z14, 1), 1000L);
        }
    }

    public void registerListener(GNCSNotificationListener gNCSNotificationListener) {
        if (this.listeners.add(gNCSNotificationListener)) {
            StringBuilder sb3 = new StringBuilder("registerListener -> ");
            sb3.append(this.listeners.size());
            sb3.append(" listener");
            sb3.append(this.listeners.size() == 1 ? "" : "s");
            trace(sb3.toString());
        }
    }

    public void removeFromListeners(GNCSNotificationInfo gNCSNotificationInfo) {
        if (!this.listeners.isEmpty()) {
            Iterator<GNCSNotificationListener> it = this.listeners.iterator();
            while (it.hasNext()) {
                it.next().onNotificationRemoved(gNCSNotificationInfo);
            }
        } else {
            StringBuilder sb3 = new StringBuilder("GNCSNotificationManager: removeFromListeners -> cacheId [");
            sb3.append(gNCSNotificationInfo.cacheId);
            sb3.append("], [");
            trace(j.o(gNCSNotificationInfo.packageName, "] (currently no subscribed devices)", sb3));
        }
    }

    public synchronized void removeNotifications(String str) {
        Iterator<GNCSNotificationInfo> it = CacheManager.INSTANCE.getNotificationsByPackage(str).iterator();
        while (it.hasNext()) {
            removeNotification(it.next(), true);
        }
    }

    public boolean shouldRemoveSummaryFor(GNCSNotificationInfo gNCSNotificationInfo) {
        String str;
        if (gNCSNotificationInfo == null || (str = gNCSNotificationInfo.groupKey) == null) {
            return false;
        }
        for (GNCSNotificationInfo gNCSNotificationInfo2 : CacheManager.INSTANCE.getNotificationsByGroup(str)) {
            if (!gNCSNotificationInfo2.isGroupSummary() && !gNCSNotificationInfo2.cacheKey.equals(gNCSNotificationInfo.cacheKey) && gNCSNotificationInfo2.isActive()) {
                return false;
            }
        }
        return true;
    }

    public void unregisterListener(GNCSNotificationListener gNCSNotificationListener) {
        if (this.listeners.remove(gNCSNotificationListener)) {
            StringBuilder sb3 = new StringBuilder("unregisterListener -> ");
            sb3.append(this.listeners.size());
            sb3.append(" listener");
            sb3.append(this.listeners.size() == 1 ? "" : "s");
            trace(sb3.toString());
        }
    }

    public /* synthetic */ GNCSNotificationManager(int i14) {
        this();
    }

    public void removeNotification(GNCSNotificationInfo gNCSNotificationInfo) {
        removeNotification(gNCSNotificationInfo, false);
    }
}
