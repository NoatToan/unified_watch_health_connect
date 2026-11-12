package com.garmin.android.gncs;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Parcel;
import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import android.widget.RemoteViews;
import cd0.h0;
import com.garmin.android.ancs.ANCSMessageManager;
import com.garmin.android.gncs.actionhandler.AndroidActionHandlerKt;
import com.garmin.android.gncs.actionhandler.NotificationActionHandlerKt;
import com.garmin.android.gncs.mms.GNCSMediaRequest;
import com.garmin.android.gncs.persistence.CacheManager;
import com.garmin.android.gncs.settings.GNCSSettings;
import com.garmin.android.gncs.settings.SmartNotificationsConfig;
import com.garmin.android.gncs.telephony.PhoneCallListener;
import com.garmin.android.gncs.telephony.TelephonyUtilKt;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p13.u;

/* JADX INFO: loaded from: classes11.dex */
public class SmartNotificationsModule extends NotificationListenerServiceModule {
    public static final int ACCEPT_INCOMING_CALL_ACTION_ID = 96;
    public static final String ACTION_PERMISSIONS_GRANTED = "com.garmin.android.gncs.ACTION_PERMISSIONS_GRANTED";
    public static final int BLOCK_APPLICATION_ACTION_ID = 99;
    public static final int DISMISS_NOTIFICATION_ACTION_ID = 98;
    public static final int HANG_UP_ONGOING_CALL_ACTION_ID = 97;
    public static final int REJECT_INCOMING_CALL_ACTION_ID = 97;
    public static final int REPLY_INCOMING_CALL_ACTION_ID = 95;
    public static final int REPLY_TEXT_MESSAGE_ACTION_ID = 94;
    private final ANCSMessageManager.Callback ancsMessageManagerCallback;
    private final BroadcastReceiver appAddedRemovedReceiver;
    private final BroadcastReceiver appPermissionsReceiver;
    private final GNCSSettings.Callback gncsSettingsCallback;
    boolean isAppAddedRemovedReceiverRegistered;
    private boolean isAppPermissionBroadcastReceived;
    private boolean isAppPermissionsReceiverRegistered;
    private final ANCSMessageManager.MediaRequestCallback mediaRequestCallback;

    public class PostNotificationRunnable implements Runnable {
        private final NotificationListenerService.Ranking ranking;
        private final StatusBarNotification sbn;

        public PostNotificationRunnable(StatusBarNotification statusBarNotification, NotificationListenerService.Ranking ranking) {
            this.sbn = statusBarNotification;
            this.ranking = ranking;
        }

        @Override // java.lang.Runnable
        public void run() {
            GNCSListenerService notificationService = SmartNotificationsModule.this.getNotificationService();
            if (notificationService == null) {
                return;
            }
            ih2.b.b("SmartNotificationsModule.PostNotificationRunnable -> handling posted notif [" + this.sbn.getId() + "], [" + this.sbn.getPackageName() + "]");
            SmartNotificationsModule.syncRemovedNotifications();
            try {
                GNCSParsedNotification notification = GNCSNotificationParser.parseNotification(SmartNotificationsModule.this.appContext, this.sbn);
                if (SmartNotificationsUtil.isNotEmptyNotification(notification.notificationInfo)) {
                    notificationService.getCurrentRanking().getRanking(this.sbn.getKey(), this.ranking);
                    if (this.ranking.isSuspended()) {
                        ih2.b.b("SmartNotificationsModule.PostNotificationRunnable -> App that posted this notification is suspended by ranking, so this notification should be hidden .Ranking key is [" + this.ranking.getKey() + "]. Not posting notifications for [" + this.sbn.getId() + "], [" + this.sbn.getPackageName() + "]");
                        return;
                    }
                    ih2.b.b("SmartNotificationsModule.PostNotificationRunnable -> Ranking is not suspended for key:  [" + this.ranking.getKey() + "] packageName [" + this.sbn.getPackageName() + "]");
                    GNCSNotificationInfo gNCSNotificationInfo = notification.notificationInfo;
                    boolean zIsFollowingDND = GNCSSettings.getInstance().isFollowingDND(SmartNotificationsModule.this.appContext);
                    SmartNotificationsModule smartNotificationsModule = SmartNotificationsModule.this;
                    StatusBarNotification statusBarNotification = this.sbn;
                    gNCSNotificationInfo.status = zIsFollowingDND ? smartNotificationsModule.getNotificationStatusPostDNDChanges(notification, statusBarNotification, this.ranking, notificationService) : smartNotificationsModule.getNotificationStatusPreDNDChanges(notification, statusBarNotification, this.ranking);
                    SmartNotificationsUtil.dumpNotificationInfo(this.sbn, notification.notificationInfo);
                    GNCSNotificationManager gNCSNotificationManager = (GNCSNotificationManager) jb2.b.a(GNCSNotificationManager.class);
                    GNCSNotificationInfo gNCSNotificationInfo2 = notification.notificationInfo;
                    GNCSNotificationInfo gNCSNotificationInfo3 = notification.existingInfo;
                    SmartNotificationsModule smartNotificationsModule2 = SmartNotificationsModule.this;
                    gNCSNotificationManager.postNotification(gNCSNotificationInfo2, gNCSNotificationInfo3, smartNotificationsModule2.handler, smartNotificationsModule2.appContext);
                }
            } catch (Exception e4) {
                ih2.b.a(e4, "SmartNotificationsModule.PostNotificationRunnable");
            }
        }
    }

    public class RemoveNotificationRunnable implements Runnable {
        private final StatusBarNotification sbn;

        public RemoveNotificationRunnable(StatusBarNotification statusBarNotification) {
            this.sbn = statusBarNotification;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (SmartNotificationsModule.this.getNotificationService() == null) {
                return;
            }
            ih2.b.b("SmartNotificationsModule.RemoveNotificationRunnable -> handling removed notif [" + this.sbn.getId() + "], [" + this.sbn.getPackageName() + "]");
            try {
                GNCSNotificationInfo notification = CacheManager.INSTANCE.getNotification(GNCSNotificationInfo.createKey(this.sbn.getKey(), this.sbn.getPackageName()));
                if (notification != null) {
                    ((GNCSNotificationManager) jb2.b.a(GNCSNotificationManager.class)).removeNotification(notification);
                } else {
                    ih2.b.b("SmartNotificationsModule.RemoveNotificationRunnable -> not found in database");
                }
                if (TelephonyUtilKt.countOfMissedCalls(SmartNotificationsModule.this.appContext) == 0) {
                    ((GNCSNotificationManager) jb2.b.a(GNCSNotificationManager.class)).clearNonOngoing();
                    return;
                }
                for (StatusBarNotification statusBarNotification : SmartNotificationsModule.this.getActiveNotifications()) {
                    if (statusBarNotification.isClearable()) {
                        return;
                    }
                }
                ((GNCSNotificationManager) jb2.b.a(GNCSNotificationManager.class)).clearNonOngoing();
            } catch (Exception e4) {
                ih2.b.a(e4, "SmartNotificationsModule.RemoveNotificationRunnable");
            }
        }
    }

    public SmartNotificationsModule(GNCSListenerService gNCSListenerService, Handler handler) {
        super(gNCSListenerService, handler);
        this.isAppPermissionsReceiverRegistered = false;
        this.isAppPermissionBroadcastReceived = false;
        this.appPermissionsReceiver = new BroadcastReceiver() { // from class: com.garmin.android.gncs.SmartNotificationsModule.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                SmartNotificationsModule.this.isAppPermissionBroadcastReceived = true;
                if (!SmartNotificationsModule.ACTION_PERMISSIONS_GRANTED.equals(intent.getAction())) {
                    ih2.b.b("SmartNotificationsModule.appPermissionsReceiver -> Permission not Granted , returning");
                    return;
                }
                ih2.b.b("SmartNotificationsModule.appPermissionsReceiver -> Permission granted, enabling PhoneCallListener");
                PhoneCallListener phoneCallListener = PhoneCallListener.INSTANCE;
                SmartNotificationsModule smartNotificationsModule = SmartNotificationsModule.this;
                phoneCallListener.enable(smartNotificationsModule.appContext, smartNotificationsModule.handler);
                ih2.b.b("SmartNotificationsModule.appPermissionsReceiver -> Permission granted, reloading packages");
                SmartNotificationsModule.this.reloadPackages();
            }
        };
        this.isAppAddedRemovedReceiverRegistered = false;
        this.appAddedRemovedReceiver = new BroadcastReceiver() { // from class: com.garmin.android.gncs.SmartNotificationsModule.2
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                if (intent.getBooleanExtra("android.intent.extra.REPLACING", false)) {
                    return;
                }
                Uri data = intent.getData();
                String schemeSpecificPart = data != null ? data.getSchemeSpecificPart() : null;
                String action = intent.getAction();
                Objects.requireNonNull(action);
                if (action.equals("android.intent.action.PACKAGE_REMOVED")) {
                    com.airbnb.lottie.animation.keyframe.a.s("SmartNotificationsModule.appAddedRemovedReceiver -> package [", schemeSpecificPart, "] removed");
                } else if (!action.equals("android.intent.action.PACKAGE_ADDED")) {
                    return;
                } else {
                    com.airbnb.lottie.animation.keyframe.a.s("SmartNotificationsModule.appAddedRemovedReceiver -> package [", schemeSpecificPart, "] added");
                }
                ih2.b.b("SmartNotificationsModule.appAddedRemovedReceiver -> reloading packages");
                SmartNotificationsModule.this.reloadPackages();
            }
        };
        this.ancsMessageManagerCallback = new ANCSMessageManager.Callback() { // from class: com.garmin.android.gncs.SmartNotificationsModule.3
            @Override // com.garmin.android.ancs.ANCSMessageManager.Callback
            public void onAndroidActionRequested(final GNCSNotificationInfo gNCSNotificationInfo, final int i14, final String str) {
                StringBuilder sb3 = new StringBuilder("SmartNotificationsModule.onAndroidActionRequested -> appId: ");
                q6.f.q(i14, gNCSNotificationInfo.packageName, " , actionId: ", ", actionText: ", sb3);
                sb3.append(str);
                ih2.b.b(sb3.toString());
                SmartNotificationsModule.this.handler.post(new Runnable() { // from class: com.garmin.android.gncs.SmartNotificationsModule.3.2
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            try {
                                GNCSListenerService notificationService = SmartNotificationsModule.this.getNotificationService();
                                if (notificationService != null) {
                                    AndroidActionHandlerKt.performAndroidAction(notificationService, gNCSNotificationInfo, i14, str);
                                }
                            } catch (Exception e4) {
                                ih2.b.a(e4, "SmartNotificationsModule.onAndroidActionRequested");
                            }
                        } finally {
                            SmartNotificationsModule.this.handler.removeCallbacks(this);
                        }
                    }
                });
            }

            @Override // com.garmin.android.ancs.ANCSMessageManager.Callback
            public void onNotificationActionRequested(final GNCSNotificationInfo gNCSNotificationInfo, final boolean z14) {
                ih2.b.b("SmartNotificationsModule.onNotificationActionRequested -> appId: " + gNCSNotificationInfo.packageName + " , isPositiveAction: " + z14);
                SmartNotificationsModule.this.handler.post(new Runnable() { // from class: com.garmin.android.gncs.SmartNotificationsModule.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            try {
                                GNCSListenerService notificationService = SmartNotificationsModule.this.getNotificationService();
                                if (notificationService != null) {
                                    NotificationActionHandlerKt.performNotificationAction(notificationService, gNCSNotificationInfo, z14);
                                }
                            } catch (Exception e4) {
                                ih2.b.a(e4, "SmartNotificationsModule.onNotificationActionRequested");
                            }
                        } finally {
                            SmartNotificationsModule.this.handler.removeCallbacks(this);
                        }
                    }
                });
            }
        };
        this.mediaRequestCallback = new ANCSMessageManager.MediaRequestCallback() { // from class: com.garmin.android.gncs.SmartNotificationsModule.4
            /* JADX WARN: Code duplicated, block: B:29:0x00ae  */
            /* JADX WARN: Code duplicated, block: B:31:0x00b4  */
            /* JADX WARN: Code duplicated, block: B:32:0x00be  */
            @Override // com.garmin.android.ancs.ANCSMessageManager.MediaRequestCallback
            public byte[] onNotificationLargeIconRequested(GNCSNotificationInfo gNCSNotificationInfo, GNCSMediaRequest gNCSMediaRequest) {
                Icon largeIcon;
                Bitmap bitmapB;
                Object obj;
                GNCSListenerService notificationService = SmartNotificationsModule.this.getNotificationService();
                if (notificationService != null) {
                    String str = gNCSNotificationInfo.notificationKey;
                    int i14 = ih2.d.f93519a;
                    str.getClass();
                    StatusBarNotification[] activeNotifications = notificationService.getActiveNotifications(new String[]{str});
                    activeNotifications.getClass();
                    StatusBarNotification statusBarNotification = (StatusBarNotification) u.H(activeNotifications);
                    Notification notification = statusBarNotification != null ? statusBarNotification.getNotification() : null;
                    if (notification != null) {
                        String string = notification.extras.getString("android.template");
                        if (string != null) {
                            ih2.b.b("MMS# SystemNotificationUtil.NotificationListenerService.getBitmap ->  style class found : ".concat(string));
                            if (string.equals(Notification.BigPictureStyle.class.getName())) {
                                ih2.b.b("MMS# SystemNotificationUtil.NotificationListenerService.getBitmap ->  style class matches  ".concat(Notification.BigPictureStyle.class.getName()));
                                Object obj2 = notification.extras.get("android.largeIcon.big");
                                if (obj2 != null) {
                                    ih2.b.b("MMS# SystemNotificationUtil.NotificationListenerService.getBitmap ->  EXTRA_LARGE_ICON_BIG found.");
                                    if (obj2 instanceof Icon) {
                                        ih2.b.b("MMS# SystemNotificationUtil.NotificationListenerService.getBitmap ->  EXTRA_LARGE_ICON_BIG is of type Icon.");
                                        bitmapB = ih2.d.b(notificationService, (Icon) obj2);
                                    } else {
                                        bitmapB = (Bitmap) obj2;
                                    }
                                } else if (Build.VERSION.SDK_INT < 31 || (obj = notification.extras.get("android.pictureIcon")) == null) {
                                    Object obj3 = notification.extras.get("android.picture");
                                    if (obj3 != null) {
                                        ih2.b.b("MMS# SystemNotificationUtil.NotificationListenerService.getBitmap ->  EXTRA_PICTURE found.");
                                        bitmapB = (Bitmap) obj3;
                                    } else {
                                        largeIcon = notification.getLargeIcon();
                                        if (largeIcon != null) {
                                            ih2.b.b("MMS# SystemNotificationUtil.NotificationListenerService.getBitmap ->  large icon found.");
                                            bitmapB = ih2.d.b(notificationService, largeIcon);
                                        } else {
                                            ih2.b.b("MMS# SystemNotificationUtil.NotificationListenerService.getBitmap ->   No bitmap found in notification");
                                            bitmapB = null;
                                        }
                                    }
                                } else {
                                    ih2.b.b("MMS# SystemNotificationUtil.NotificationListenerService.getBitmap ->  EXTRA_PICTURE_ICON found.");
                                    bitmapB = ih2.d.b(notificationService, (Icon) obj);
                                }
                            } else {
                                largeIcon = notification.getLargeIcon();
                                if (largeIcon != null) {
                                    ih2.b.b("MMS# SystemNotificationUtil.NotificationListenerService.getBitmap ->  large icon found.");
                                    bitmapB = ih2.d.b(notificationService, largeIcon);
                                } else {
                                    ih2.b.b("MMS# SystemNotificationUtil.NotificationListenerService.getBitmap ->   No bitmap found in notification");
                                    bitmapB = null;
                                }
                            }
                        } else {
                            largeIcon = notification.getLargeIcon();
                            if (largeIcon != null) {
                                ih2.b.b("MMS# SystemNotificationUtil.NotificationListenerService.getBitmap ->  large icon found.");
                                bitmapB = ih2.d.b(notificationService, largeIcon);
                            } else {
                                ih2.b.b("MMS# SystemNotificationUtil.NotificationListenerService.getBitmap ->   No bitmap found in notification");
                                bitmapB = null;
                            }
                        }
                    } else {
                        bitmapB = null;
                    }
                    if (bitmapB != null) {
                        return SmartNotificationsUtil.getImageFromIcon(bitmapB, gNCSMediaRequest);
                    }
                }
                return null;
            }

            /* JADX WARN: Code duplicated, block: B:25:0x0096  */
            @Override // com.garmin.android.ancs.ANCSMessageManager.MediaRequestCallback
            public byte[] onNotificationRemoteViewImageRequested(GNCSNotificationInfo gNCSNotificationInfo, GNCSMediaRequest gNCSMediaRequest) {
                Object obj;
                Bitmap bitmap;
                GNCSListenerService notificationService = SmartNotificationsModule.this.getNotificationService();
                if (notificationService == null) {
                    return null;
                }
                String str = gNCSNotificationInfo.notificationKey;
                int index = gNCSMediaRequest.getIndex();
                int i14 = ih2.d.f93519a;
                str.getClass();
                StatusBarNotification[] activeNotifications = notificationService.getActiveNotifications(new String[]{str});
                activeNotifications.getClass();
                StatusBarNotification statusBarNotification = (StatusBarNotification) u.H(activeNotifications);
                Notification notification = statusBarNotification != null ? statusBarNotification.getNotification() : null;
                if (notification == null) {
                    bitmap = null;
                } else {
                    String string = notification.extras.getString("android.template");
                    if (string != null) {
                        ih2.b.b("MMS# SystemNotificationUtil.NotificationListenerService.getRemoteViewBitmap ->  style class found : ".concat(string));
                        if (string.equals(Notification.DecoratedCustomViewStyle.class.getName())) {
                            ih2.b.b("MMS# SystemNotificationUtil.NotificationListenerService.getRemoteViewBitmap ->  style class matches  ".concat(Notification.DecoratedCustomViewStyle.class.getName()));
                            RemoteViews remoteViews = notification.contentView;
                            if (remoteViews == null) {
                                remoteViews = notification.bigContentView;
                            }
                            if (remoteViews != null) {
                                ih2.b.b("MMS# SystemNotificationUtil.NotificationListenerService.getRemoteViewBitmap ->  RemoteView Found in notification ");
                                Parcel parcelObtain = Parcel.obtain();
                                parcelObtain.getClass();
                                try {
                                    remoteViews.writeToParcel(parcelObtain, 0);
                                    parcelObtain.setDataPosition(0);
                                    parcelObtain.readInt();
                                    ArrayList arrayList = new ArrayList();
                                    parcelObtain.readTypedList(arrayList, Bitmap.CREATOR);
                                    obj = arrayList.get(index);
                                } catch (Exception e4) {
                                    ih2.b.a(e4, "MMS# SystemNotificationUtil.NotificationListenerService.getRemoteViewBitmap ->  Error in getting image from RemoteView ");
                                    obj = null;
                                }
                                parcelObtain.recycle();
                            } else {
                                obj = null;
                            }
                        } else {
                            obj = null;
                        }
                    } else {
                        obj = null;
                    }
                    bitmap = (Bitmap) obj;
                }
                if (bitmap != null) {
                    return SmartNotificationsUtil.getImageFromIcon(bitmap, gNCSMediaRequest);
                }
                return null;
            }
        };
        this.gncsSettingsCallback = new GNCSSettings.Callback() { // from class: com.garmin.android.gncs.SmartNotificationsModule.5
            @Override // com.garmin.android.gncs.settings.GNCSSettings.Callback
            public void onPackageDisabled(String str) {
                ih2.b.b("SmartNotificationsModule.gncsSettingsCallback -> notifications disabled for package [" + str + "]");
                ((GNCSNotificationManager) jb2.b.a(GNCSNotificationManager.class)).removeNotifications(str);
            }

            @Override // com.garmin.android.gncs.settings.GNCSSettings.Callback
            public void onPackageEnabled(String str) {
                com.airbnb.lottie.animation.keyframe.a.s("SmartNotificationsModule.gncsSettingsCallback -> notifications enabled for package [", str, "]");
                GNCSListenerService notificationService = SmartNotificationsModule.this.getNotificationService();
                NotificationListenerService.RankingMap currentRanking = notificationService != null ? notificationService.getCurrentRanking() : null;
                for (StatusBarNotification statusBarNotification : SmartNotificationsModule.this.getActiveNotifications()) {
                    if (statusBarNotification.getPackageName().equals(str)) {
                        NotificationListenerService.Ranking ranking = new NotificationListenerService.Ranking();
                        if (currentRanking != null) {
                            currentRanking.getRanking(statusBarNotification.getKey(), ranking);
                        }
                        SmartNotificationsModule smartNotificationsModule = SmartNotificationsModule.this;
                        smartNotificationsModule.handler.post(smartNotificationsModule.new PostNotificationRunnable(statusBarNotification, ranking));
                    }
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public StatusBarNotification[] getActiveNotifications() {
        GNCSListenerService notificationService = getNotificationService();
        return notificationService != null ? notificationService.getActiveNotifications() : new StatusBarNotification[0];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public GNCSNotificationInfo.NotificationStatus getNotificationStatusPostDNDChanges(GNCSParsedNotification gNCSParsedNotification, StatusBarNotification statusBarNotification, NotificationListenerService.Ranking ranking, GNCSListenerService gNCSListenerService) {
        GNCSNotificationInfo.NotificationStatus notificationStatus = gNCSParsedNotification.notificationInfo.status;
        if (notificationStatus == GNCSNotificationInfo.NotificationStatus.NEW) {
            StringBuilder sb3 = new StringBuilder("SmartNotificationsModule.PostNotificationRunnable -> This is a NEW notification. \n");
            if (ranking.matchesInterruptionFilter()) {
                sb3.append("DND is Off or Notification from [");
                sb3.append(gNCSParsedNotification.notificationInfo.packageName);
                sb3.append("] matches the user's interruption filter and allowed. \n");
                if (isDoNotDisturbTurnedOn(gNCSListenerService) && SmartNotificationsConfig.getInstance().forceSilentWhenDoNotDisturb(gNCSParsedNotification.notificationInfo.packageName)) {
                    sb3.append("However, GNCS remote config has enabled 'Force Silent when Do Not Disturb' setting for this app. So silencing it. \n");
                    notificationStatus = GNCSNotificationInfo.NotificationStatus.NEW_SILENT;
                } else if (hasUserSilencedConversation(ranking, statusBarNotification)) {
                    notificationStatus = GNCSNotificationInfo.NotificationStatus.NEW_SILENT;
                }
            } else {
                sb3.append("Notification from [");
                sb3.append(gNCSParsedNotification.notificationInfo.packageName);
                sb3.append("] is not allowed by interruption filter. So silencing it. ");
                notificationStatus = GNCSNotificationInfo.NotificationStatus.NEW_SILENT;
            }
            ih2.b.b(sb3.toString());
        }
        return notificationStatus;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public GNCSNotificationInfo.NotificationStatus getNotificationStatusPreDNDChanges(GNCSParsedNotification gNCSParsedNotification, StatusBarNotification statusBarNotification, NotificationListenerService.Ranking ranking) {
        GNCSNotificationInfo.NotificationStatus notificationStatus = gNCSParsedNotification.notificationInfo.status;
        if (!SmartNotificationsConfig.getInstance().forceSilentWhenDoNotDisturb(gNCSParsedNotification.notificationInfo.packageName) || ranking.matchesInterruptionFilter() || gNCSParsedNotification.notificationInfo.status != GNCSNotificationInfo.NotificationStatus.NEW) {
            return hasUserSilencedConversation(ranking, statusBarNotification) ? GNCSNotificationInfo.NotificationStatus.NEW_SILENT : notificationStatus;
        }
        ih2.b.b("SmartNotificationsModule.PostNotificationRunnable -> Android device is in 'Do Not Disturb' mode, marked as NEW_SILENT [" + statusBarNotification.getId() + "], [" + gNCSParsedNotification.notificationInfo.packageName + "]");
        return GNCSNotificationInfo.NotificationStatus.NEW_SILENT;
    }

    private boolean hasUserSilencedConversation(NotificationListenerService.Ranking ranking, StatusBarNotification statusBarNotification) {
        if (Build.VERSION.SDK_INT < 30 || TextUtils.isEmpty(ranking.getChannel().getConversationId()) || ranking.getImportanceExplanation() == null || ranking.getImportance() != 2) {
            return false;
        }
        ih2.b.b("SmartNotificationsModule.PostNotificationRunnable -> User has set importance as low for this conversation marked as NEW_SILENT [" + statusBarNotification.getId() + "], [" + statusBarNotification.getPackageName() + "]");
        return true;
    }

    private boolean isDoNotDisturbTurnedOn(GNCSListenerService gNCSListenerService) {
        return gNCSListenerService.getCurrentInterruptionFilter() != 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onListenerConnected$1(List list) {
        try {
            synchronizeNotifications();
        } catch (Exception e4) {
            ih2.b.a(e4, "SmartNotificationsModule.synchronizeNotifications");
        }
        try {
            CacheManager.INSTANCE.removeNotifications(GNCSNotificationInfo.NotificationType.INCOMING_CALL);
            PhoneCallListener.INSTANCE.enable(this.appContext, this.handler);
            ((ANCSMessageManager) jb2.b.a(ANCSMessageManager.class)).addCallback(this.ancsMessageManagerCallback);
            ((ANCSMessageManager) jb2.b.a(ANCSMessageManager.class)).setMediaRequestCallback(this.mediaRequestCallback);
            GNCSSettings.getInstance().addCallback(this.gncsSettingsCallback);
            ih2.c.a(this.appContext);
            DefaultAppsObserver.INSTANCE.getInstance().startObservingDefaultApps(this.appContext);
        } catch (Exception unused) {
        }
        try {
            ih2.b.b("SmartNotificationsModule.smartNotifOSServiceLifecycleCallback -> notifying " + list.size() + " callback(s)");
            list.forEach(new d(1));
        } catch (Exception e14) {
            ih2.b.a(e14, "SmartNotificationsModule.smartNotifOSServiceLifecycleCallback.onConnected");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$reloadPackages$0() {
        try {
            GNCSSettings.getInstance().reloadPackages(this.appContext);
        } catch (Exception e4) {
            ih2.b.a(e4, "SmartNotificationsModule.reloadPackages");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ long lambda$synchronizeNotifications$2(GNCSParsedNotification gNCSParsedNotification) {
        return gNCSParsedNotification.notificationInfo.when;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reloadPackages() {
        this.handler.post(new h0(this, 10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void syncRemovedNotifications() {
        try {
            ih2.b.b("SmartNotificationsModule.syncRemovedNotifications");
            Iterator<GNCSNotificationInfo> it = CacheManager.INSTANCE.getRemovedNotifications().iterator();
            while (it.hasNext()) {
                ((GNCSNotificationManager) jb2.b.a(GNCSNotificationManager.class)).removeFromListeners(it.next());
            }
            CacheManager.INSTANCE.removeStaleNotifications(System.currentTimeMillis() - 60000);
        } catch (Exception e4) {
            ih2.b.a(e4, "SmartNotificationsModule.syncRemovedNotifications");
        }
    }

    private void synchronizeNotifications() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        ih2.b.b("SmartNotificationsModule.synchronizeNotifications -> BEGIN");
        try {
            try {
                HashMap map = new HashMap();
                for (StatusBarNotification statusBarNotification : getActiveNotifications()) {
                    try {
                        GNCSParsedNotification notification = GNCSNotificationParser.parseNotification(this.appContext, statusBarNotification);
                        if (SmartNotificationsUtil.isNotEmptyNotification(notification.notificationInfo)) {
                            SmartNotificationsUtil.dumpNotificationInfo(statusBarNotification, notification.notificationInfo);
                            String strCreateKey = notification.notificationInfo.cacheKey;
                            if (TextUtils.isEmpty(strCreateKey)) {
                                strCreateKey = GNCSNotificationInfo.createKey(notification.notificationInfo);
                            }
                            map.put(strCreateKey, notification);
                        }
                    } catch (Exception e4) {
                        ih2.b.a(e4, "SmartNotificationsModule.synchronizeNotifications -> cannot parse notification for [" + statusBarNotification.getPackageName() + "]");
                    }
                }
                for (GNCSNotificationInfo gNCSNotificationInfo : CacheManager.INSTANCE.getNotifications()) {
                    if (!gNCSNotificationInfo.packageName.startsWith(BuildConfig.ARTIFACT_GROUP_ID) && !map.containsKey(gNCSNotificationInfo.cacheKey)) {
                        if (gNCSNotificationInfo.isActive()) {
                            ((GNCSNotificationManager) jb2.b.a(GNCSNotificationManager.class)).removeNotification(gNCSNotificationInfo);
                        } else if (!gNCSNotificationInfo.isRemoved()) {
                            ((GNCSNotificationManager) jb2.b.a(GNCSNotificationManager.class)).removeNotification(gNCSNotificationInfo);
                        } else if (gNCSNotificationInfo.statusTimestamp < System.currentTimeMillis() - 60000) {
                            ((GNCSNotificationManager) jb2.b.a(GNCSNotificationManager.class)).removeNotification(gNCSNotificationInfo);
                        }
                    }
                }
                ArrayList<GNCSParsedNotification> arrayList = new ArrayList(map.values());
                arrayList.sort(Comparator.comparingLong(new f()));
                for (GNCSParsedNotification gNCSParsedNotification : arrayList) {
                    if (gNCSParsedNotification.existingInfo == null) {
                        ((GNCSNotificationManager) jb2.b.a(GNCSNotificationManager.class)).postNotification(gNCSParsedNotification.notificationInfo, null, this.handler, this.appContext);
                    } else {
                        CacheManager.INSTANCE.saveNotification(gNCSParsedNotification.notificationInfo);
                    }
                }
                for (GNCSNotificationInfo gNCSNotificationInfo2 : CacheManager.INSTANCE.getActiveNotifications()) {
                    if (gNCSNotificationInfo2.isGroupSummary()) {
                        CacheManager cacheManager = CacheManager.INSTANCE;
                        if (cacheManager.groupNotificationHasChildren(gNCSNotificationInfo2.groupKey)) {
                            gNCSNotificationInfo2.status = GNCSNotificationInfo.NotificationStatus.DISMISSED;
                            gNCSNotificationInfo2.statusTimestamp = System.currentTimeMillis();
                            cacheManager.saveNotification(gNCSNotificationInfo2);
                        }
                    }
                }
            } catch (OutOfMemoryError unused) {
            }
        } catch (Exception e14) {
            ih2.b.a(e14, e14.getClass().getName());
        }
        ih2.b.b("SmartNotificationsModule.synchronizeNotifications -> END, took " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
    }

    @Override // com.garmin.android.gncs.NotificationListenerServiceModule
    @SuppressLint({"WrongConstant"})
    public void onListenerConnected(List<SmartNotifOSServiceLifecycleCallback> list) {
        ih2.b.b("SmartNotificationsModule.onListenerConnected");
        if (!this.isAppPermissionsReceiverRegistered) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(ACTION_PERMISSIONS_GRANTED);
            Context context = this.appContext;
            BroadcastReceiver broadcastReceiver = this.appPermissionsReceiver;
            String str = "";
            context.getClass();
            try {
                Context applicationContext = context.getApplicationContext();
                String string = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128).metaData.getString("com.garmin.android.gncs.permission");
                if (string != null) {
                    ih2.b.b("PermissionUtil.getBroadcastPermission -> using perm '" + string + "'");
                    str = string;
                }
            } catch (Exception e4) {
                ih2.b.a(e4, "PermissionUtil.getBroadcastPermission");
            }
            a7.b.registerReceiver(context, broadcastReceiver, intentFilter, str, null, 4);
            this.isAppPermissionsReceiverRegistered = true;
        }
        if (!this.isAppAddedRemovedReceiverRegistered) {
            IntentFilter intentFilter2 = new IntentFilter();
            intentFilter2.addAction("android.intent.action.PACKAGE_ADDED");
            intentFilter2.addAction("android.intent.action.PACKAGE_REMOVED");
            intentFilter2.addDataScheme("package");
            a7.b.registerReceiver(this.appContext, this.appAddedRemovedReceiver, intentFilter2, 4);
            this.isAppAddedRemovedReceiverRegistered = true;
        }
        this.handler.post(new cd0.f(8, this, list));
    }

    @Override // com.garmin.android.gncs.NotificationListenerServiceModule
    public void onListenerDisconnected(List<SmartNotifOSServiceLifecycleCallback> list) {
        try {
            if (this.isAppPermissionsReceiverRegistered) {
                this.appContext.unregisterReceiver(this.appPermissionsReceiver);
            }
        } catch (Exception unused) {
        } finally {
            this.isAppPermissionsReceiverRegistered = false;
        }
        try {
            if (this.isAppAddedRemovedReceiverRegistered) {
                this.appContext.unregisterReceiver(this.appAddedRemovedReceiver);
            }
        } catch (Exception unused2) {
        } finally {
            this.isAppAddedRemovedReceiverRegistered = false;
        }
        PhoneCallListener.INSTANCE.disable();
        ((ANCSMessageManager) jb2.b.a(ANCSMessageManager.class)).removeCallback(this.ancsMessageManagerCallback);
        ((ANCSMessageManager) jb2.b.a(ANCSMessageManager.class)).clearMediaRequestCallback();
        GNCSSettings.getInstance().removeCallback(this.gncsSettingsCallback);
        DefaultAppsObserver.INSTANCE.getInstance().stopObservingDefaultApps(this.appContext);
        try {
            list.forEach(new d(2));
        } catch (Exception e4) {
            ih2.b.a(e4, "SmartNotificationsModule.smartNotifOSServiceLifecycleCallback.onDisconnected");
        }
    }

    @Override // com.garmin.android.gncs.NotificationListenerServiceModule
    public void onNotificationPosted(StatusBarNotification statusBarNotification, NotificationListenerService.Ranking ranking) {
        String str = "SmartNotificationsModule.onNotificationPosted -> Android statusBarId [" + statusBarNotification.getId() + "], [" + statusBarNotification.getPackageName() + "]";
        if (statusBarNotification.getPackageName().equals(SmartNotificationsUtil.Packages.SAMSUNG_CALENDAR_PACKAGE_NAME)) {
            str = str + "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n" + statusBarNotification + "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
        }
        ih2.b.b(str);
        this.handler.post(new PostNotificationRunnable(statusBarNotification, ranking));
        ((StatusBarNotificationListenerManager) jb2.b.a(StatusBarNotificationListenerManager.class)).onNotificationPosted(statusBarNotification);
    }

    @Override // com.garmin.android.gncs.NotificationListenerServiceModule
    public void onNotificationRemoved(StatusBarNotification statusBarNotification) {
        ih2.b.b("SmartNotificationsModule.onNotificationRemoved -> Android removed notif [" + statusBarNotification.getId() + "], [" + statusBarNotification.getPackageName() + "]");
        this.handler.post(new RemoveNotificationRunnable(statusBarNotification));
        ((StatusBarNotificationListenerManager) jb2.b.a(StatusBarNotificationListenerManager.class)).onNotificationRemoved(statusBarNotification);
    }

    public void refreshPhoneCallListenerState() {
        ih2.b.b("SmartNotificationsModule.refreshPhoneCallListenerState");
        if (!this.isAppPermissionsReceiverRegistered || this.isAppPermissionBroadcastReceived) {
            return;
        }
        PhoneCallListener.INSTANCE.enable(this.appContext, this.handler);
        reloadPackages();
    }
}
