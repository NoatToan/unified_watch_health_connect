package com.garmin.android.ancs;

import am.j;
import android.content.Context;
import android.text.TextUtils;
import com.garmin.android.gncs.GNCSListenerService;
import com.garmin.android.gncs.GNCSListenerServiceConfig;
import com.garmin.android.gncs.GNCSNotificationInfo;
import com.garmin.android.gncs.GNCSNotificationListener;
import com.garmin.android.gncs.GNCSNotificationManager;
import com.garmin.android.gncs.SmartNotificationsUtil;
import com.garmin.android.gncs.mms.GNCSMediaRequest;
import com.garmin.android.gncs.mms.GNCSMediaResponse;
import com.garmin.android.gncs.persistence.CacheManager;
import com.garmin.android.gncs.persistence.GNCSNotificationAction;
import com.garmin.android.gncs.settings.SmartNotificationsConfig;
import ih2.b;
import ih2.c;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;
import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes7.dex */
public class ANCSMessageManager {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final Map<String, ActiveDevice> activeDevices;
    private final Set<Callback> callbacks;
    private final Map<String, List<DeviceCapability>> deviceCapabilities;
    private final GNCSNotificationListener listener;
    private MediaRequestCallback mediaRequestCallback;
    private QueueThread queueThread;
    final ANCSNotificationSourceQueue sourceQueue;
    volatile IANCSMessageTransport transport;

    /* JADX INFO: renamed from: com.garmin.android.ancs.ANCSMessageManager$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$garmin$android$ancs$ANCSMessageBase$CommandID;
        static final /* synthetic */ int[] $SwitchMap$com$garmin$android$ancs$ANCSMessageBase$NotificationAttributeID;
        static final /* synthetic */ int[] $SwitchMap$com$garmin$android$gncs$GNCSNotificationInfo$NotificationStatus;

        static {
            int[] iArr = new int[ANCSMessageBase.NotificationAttributeID.values().length];
            $SwitchMap$com$garmin$android$ancs$ANCSMessageBase$NotificationAttributeID = iArr;
            try {
                iArr[ANCSMessageBase.NotificationAttributeID.APP_IDENTIFIER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$garmin$android$ancs$ANCSMessageBase$NotificationAttributeID[ANCSMessageBase.NotificationAttributeID.DATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$garmin$android$ancs$ANCSMessageBase$NotificationAttributeID[ANCSMessageBase.NotificationAttributeID.MESSAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$garmin$android$ancs$ANCSMessageBase$NotificationAttributeID[ANCSMessageBase.NotificationAttributeID.MESSAGE_SIZE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$garmin$android$ancs$ANCSMessageBase$NotificationAttributeID[ANCSMessageBase.NotificationAttributeID.SUBTITLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$garmin$android$ancs$ANCSMessageBase$NotificationAttributeID[ANCSMessageBase.NotificationAttributeID.TITLE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$garmin$android$ancs$ANCSMessageBase$NotificationAttributeID[ANCSMessageBase.NotificationAttributeID.POSITIVE_ACTION_LABEL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$garmin$android$ancs$ANCSMessageBase$NotificationAttributeID[ANCSMessageBase.NotificationAttributeID.NEGATIVE_ACTION_LABEL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$garmin$android$ancs$ANCSMessageBase$NotificationAttributeID[ANCSMessageBase.NotificationAttributeID.PHONE_NUMBER.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$garmin$android$ancs$ANCSMessageBase$NotificationAttributeID[ANCSMessageBase.NotificationAttributeID.CONVERSATION_ID.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$garmin$android$ancs$ANCSMessageBase$NotificationAttributeID[ANCSMessageBase.NotificationAttributeID.ACTIONS.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$garmin$android$ancs$ANCSMessageBase$NotificationAttributeID[ANCSMessageBase.NotificationAttributeID.MEDIA_OBJECT_COUNT.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            int[] iArr2 = new int[ANCSMessageBase.CommandID.values().length];
            $SwitchMap$com$garmin$android$ancs$ANCSMessageBase$CommandID = iArr2;
            try {
                iArr2[ANCSMessageBase.CommandID.GET_NOTIFICATION_ATTRIBUTES.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$garmin$android$ancs$ANCSMessageBase$CommandID[ANCSMessageBase.CommandID.GET_APP_ATTRIBUTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$garmin$android$ancs$ANCSMessageBase$CommandID[ANCSMessageBase.CommandID.PERFORM_NOTIFICATION_ACTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$garmin$android$ancs$ANCSMessageBase$CommandID[ANCSMessageBase.CommandID.PERFORM_ANDROID_ACTION.ordinal()] = 4;
            } catch (NoSuchFieldError unused16) {
            }
            int[] iArr3 = new int[GNCSNotificationInfo.NotificationStatus.values().length];
            $SwitchMap$com$garmin$android$gncs$GNCSNotificationInfo$NotificationStatus = iArr3;
            try {
                iArr3[GNCSNotificationInfo.NotificationStatus.NEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$com$garmin$android$gncs$GNCSNotificationInfo$NotificationStatus[GNCSNotificationInfo.NotificationStatus.NEW_SILENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                $SwitchMap$com$garmin$android$gncs$GNCSNotificationInfo$NotificationStatus[GNCSNotificationInfo.NotificationStatus.UPDATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$com$garmin$android$gncs$GNCSNotificationInfo$NotificationStatus[GNCSNotificationInfo.NotificationStatus.REMOVED.ordinal()] = 4;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                $SwitchMap$com$garmin$android$gncs$GNCSNotificationInfo$NotificationStatus[GNCSNotificationInfo.NotificationStatus.DISMISSED.ordinal()] = 5;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                $SwitchMap$com$garmin$android$gncs$GNCSNotificationInfo$NotificationStatus[GNCSNotificationInfo.NotificationStatus.DNS.ordinal()] = 6;
            } catch (NoSuchFieldError unused22) {
            }
        }
    }

    public static class ActiveDevice {
        final Set<DeviceCapability> deviceCapabilities;
        final String macAddress;

        public ActiveDevice(String str, Set<DeviceCapability> set) {
            this.macAddress = str;
            this.deviceCapabilities = set;
        }
    }

    public interface Callback {
        void onAndroidActionRequested(GNCSNotificationInfo gNCSNotificationInfo, int i14, String str);

        void onNotificationActionRequested(GNCSNotificationInfo gNCSNotificationInfo, boolean z14);
    }

    public static class InjectorConfiguration extends jb2.a {
        @Override // jb2.a
        public void configure() {
            bindSingleton(ANCSMessageManager.class, (ib2.a) new a(0));
        }
    }

    public interface MediaRequestCallback {
        byte[] onNotificationLargeIconRequested(GNCSNotificationInfo gNCSNotificationInfo, GNCSMediaRequest gNCSMediaRequest);

        byte[] onNotificationRemoteViewImageRequested(GNCSNotificationInfo gNCSNotificationInfo, GNCSMediaRequest gNCSMediaRequest);
    }

    public class QueueThread extends Thread {
        private final long dequeueRateInMills;
        private boolean wasInterruptDueToDeviceUnsubscribe = false;

        public QueueThread(long j8) {
            this.dequeueRateInMills = j8;
        }

        public void onDeviceUnsubscribed() {
            this.wasInterruptDueToDeviceUnsubscribe = true;
            interrupt();
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            IANCSMessageTransport iANCSMessageTransport;
            while (!isInterrupted()) {
                try {
                    ANCSNotificationSourceQueue.NotificationSource notificationSourcePoll = ANCSMessageManager.this.sourceQueue.poll(60L, TimeUnit.SECONDS);
                    if (isInterrupted()) {
                        return;
                    }
                    if (notificationSourcePoll != null && (iANCSMessageTransport = ANCSMessageManager.this.transport) != null) {
                        synchronized (ANCSMessageManager.this.activeDevices) {
                            try {
                                for (ActiveDevice activeDevice : ANCSMessageManager.this.activeDevices.values()) {
                                    ANCSNotificationSource ancs = notificationSourcePoll.getAncs();
                                    if (activeDevice.deviceCapabilities.contains(DeviceCapability.MODIFIED_NOTIFICATIONS_AFTER_ADDED) && notificationSourcePoll.getFlags().contains(ANCSNotificationSourceQueue.NotificationSource.Flag.PROMOTED_TO_NEW_FROM_MODIFIED)) {
                                        b.b("ANCSMessageManager.QueueThread -> demoting notif ID[" + ancs.notificationId + "] back to MODIFIED");
                                        ancs = new ANCSNotificationSource(ANCSMessageBase.EventID.NOTIFICATION_MODIFIED, ancs.eventFlags, ancs.categoryId, ancs.categoryCount, ancs.notificationId, ancs.featureFlags);
                                    }
                                    StringBuilder sb3 = new StringBuilder();
                                    sb3.append("ANCSMessageManager.QueueThread -> sending notif ID [");
                                    sb3.append(ancs.notificationId);
                                    sb3.append("] to [");
                                    sb3.append(activeDevice.macAddress);
                                    sb3.append("] with event [");
                                    sb3.append(ancs.eventId.name());
                                    sb3.append("] with flags ");
                                    Object[] objArr = {ancs.eventFlags};
                                    ArrayList arrayList = new ArrayList(1);
                                    Object obj = objArr[0];
                                    Objects.requireNonNull(obj);
                                    arrayList.add(obj);
                                    sb3.append(Collections.unmodifiableList(arrayList));
                                    b.b(sb3.toString());
                                    iANCSMessageTransport.sendGncsNotificationSource(ancs.serialize(), activeDevice.macAddress);
                                }
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                        Thread.sleep(this.dequeueRateInMills);
                    }
                } catch (InterruptedException e4) {
                    if (this.wasInterruptDueToDeviceUnsubscribe) {
                        return;
                    }
                    StringBuilder sb4 = new StringBuilder("ANCSMessageManager.QueueThread -> ");
                    sb4.append(e4.getMessage() != null ? e4.getMessage() : "");
                    b.a(e4, sb4.toString());
                    return;
                } catch (Exception e14) {
                    StringBuilder sb5 = new StringBuilder("ANCSMessageManager.QueueThread -> ");
                    sb5.append(e14.getMessage() != null ? e14.getMessage() : "");
                    b.a(e14, sb5.toString());
                    return;
                }
            }
        }
    }

    private ANCSMessageManager() {
        this.sourceQueue = new ANCSNotificationSourceQueue();
        this.activeDevices = new HashMap();
        this.deviceCapabilities = new HashMap();
        this.callbacks = new CopyOnWriteArraySet();
        this.listener = new GNCSNotificationListener() { // from class: com.garmin.android.ancs.ANCSMessageManager.1
            @Override // com.garmin.android.gncs.GNCSNotificationListener
            public void onNotificationPosted(GNCSNotificationInfo gNCSNotificationInfo) {
                ANCSMessageManager.this.sendNotificationSource(gNCSNotificationInfo, ANCSMessageBase.EventID.NOTIFICATION_ADDED, false);
            }

            @Override // com.garmin.android.gncs.GNCSNotificationListener
            public void onNotificationRemoved(GNCSNotificationInfo gNCSNotificationInfo) {
                ANCSMessageManager.this.sendNotificationRemovedSource(gNCSNotificationInfo.cacheId, gNCSNotificationInfo.packageName);
            }

            @Override // com.garmin.android.gncs.GNCSNotificationListener
            public void onNotificationUpdated(GNCSNotificationInfo gNCSNotificationInfo) {
                ANCSMessageManager.this.sendNotificationSource(gNCSNotificationInfo, ANCSMessageBase.EventID.NOTIFICATION_MODIFIED, false);
            }
        };
    }

    public static EnumSet<ANCSMessageBase.EventFlag> calculateEventTypeFlag(GNCSNotificationInfo gNCSNotificationInfo, boolean z14) {
        EnumSet<ANCSMessageBase.EventFlag> enumSetOf;
        if (!z14) {
            if (gNCSNotificationInfo.priority < 0) {
                b.b("ANCSMessageManager.calculateEventTypeFlag -> set 'forceSilent' to TRUE for notification with priority lower than DEFAULT");
            } else {
                int i14 = gNCSNotificationInfo.eventFlags;
                if ((ANCSMessageBase.EventFlag.SILENT.flag & i14) != 0) {
                    b.b("ANCSMessageManager.calculateEventTypeFlag -> set 'forceSilent' to TRUE for notification with EventFlagSilent flag set");
                } else if ((i14 & ANCSMessageBase.EventFlag.PRE_EXISTING.flag) != 0) {
                    b.b("ANCSMessageManager.calculateEventTypeFlag -> set 'forceSilent' to TRUE for notification with EventFlagPreExisting flag set");
                }
            }
            z14 = true;
        }
        if (z14) {
            b.b("ANCSMessageManager.calculateEventTypeFlag -> setting notification event as silent because 'forceSilent' flag is true");
            enumSetOf = EnumSet.of(ANCSMessageBase.EventFlag.SILENT);
        } else {
            enumSetOf = EnumSet.of(ANCSMessageBase.EventFlag.IMPORTANT);
        }
        if (!TextUtils.isEmpty(gNCSNotificationInfo.positiveAction)) {
            enumSetOf.add(ANCSMessageBase.EventFlag.POSITIVE_ACTION);
        }
        if (!TextUtils.isEmpty(gNCSNotificationInfo.negativeAction)) {
            enumSetOf.add(ANCSMessageBase.EventFlag.NEGATIVE_ACTION);
        }
        b.b("ANCSMessageManager.calculateEventTypeFlag -> calculated flags: " + enumSetOf);
        return enumSetOf;
    }

    private void handleAppAttributes(Context context, byte[] bArr, String str) {
        try {
            ANCSGetAppAttributesRequest aNCSGetAppAttributesRequest = new ANCSGetAppAttributesRequest(bArr);
            for (ANCSAppAttribute aNCSAppAttribute : aNCSGetAppAttributesRequest.attributes) {
                if (ANCSMessageBase.AppAttributeID.DISPLAY_NAME == aNCSAppAttribute.appAttributeId) {
                    aNCSAppAttribute.setValue(SmartNotificationsUtil.getPackageDisplayName(context, aNCSGetAppAttributesRequest.appIdentifier).getBytes());
                }
            }
            b.b("ANCSMessageManager.handleAppAttributes [" + aNCSGetAppAttributesRequest.appIdentifier + "] -> sending attributes data source");
            ANCSGetAppAttributesResponse aNCSGetAppAttributesResponse = new ANCSGetAppAttributesResponse(aNCSGetAppAttributesRequest.appIdentifier, aNCSGetAppAttributesRequest.attributes);
            aNCSGetAppAttributesResponse.dump();
            sendGncsDataSource(aNCSGetAppAttributesResponse.serialize(), str);
        } catch (Exception e4) {
            StringBuilder sb3 = new StringBuilder("ANCSMessageManager.handleAppAttributes -> ");
            sb3.append(e4.getMessage() != null ? e4.getMessage() : "");
            b.a(e4, sb3.toString());
        }
    }

    private void sendExistingNotifications() {
        b.b("ANCSMessageManager.sendExistingNotifications -> BEGIN");
        List<GNCSNotificationInfo> notifications = CacheManager.INSTANCE.getNotifications();
        for (GNCSNotificationInfo gNCSNotificationInfo : notifications) {
            b.b("ANCSMessageManager.sendExistingNotifications -> processing notification from [" + gNCSNotificationInfo.packageName + "] with status " + gNCSNotificationInfo.status);
            int i14 = AnonymousClass2.$SwitchMap$com$garmin$android$gncs$GNCSNotificationInfo$NotificationStatus[gNCSNotificationInfo.status.ordinal()];
            if (i14 == 1 || i14 == 2 || i14 == 3) {
                if (gNCSNotificationInfo.isGroupSummary()) {
                    Iterator<GNCSNotificationInfo> it = notifications.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            GNCSNotificationInfo next = it.next();
                            if (!next.isGroupSummary() && TextUtils.equals(next.groupKey, gNCSNotificationInfo.groupKey)) {
                                break;
                            }
                        }
                    }
                }
                sendNotificationSource(gNCSNotificationInfo, ANCSMessageBase.EventID.NOTIFICATION_ADDED, true);
                break;
            }
            if (i14 == 4) {
                sendNotificationRemovedSource(gNCSNotificationInfo.cacheId, gNCSNotificationInfo.packageName);
            }
        }
        CacheManager.INSTANCE.removeStaleNotifications(System.currentTimeMillis() - 60000);
        b.b("ANCSMessageManager.sendExistingNotifications -> END");
    }

    private void sendGncsDataSource(byte[] bArr, String str) {
        IANCSMessageTransport iANCSMessageTransport = this.transport;
        if (iANCSMessageTransport != null) {
            iANCSMessageTransport.sendGncsDataSource(bArr, str);
        }
    }

    private void sendGncsNotificationSource(ANCSNotificationSourceQueue.NotificationSource notificationSource, String str) {
        String str2;
        ANCSNotificationSource ancs = notificationSource.getAncs();
        StringBuilder sb3 = new StringBuilder("ANCSMessageManager.sendGncsNotificationSource -> queuing ID [");
        sb3.append(ancs.notificationId);
        sb3.append("], [");
        sb3.append(ancs.eventId.name());
        sb3.append("]");
        if (notificationSource.getFlags().isEmpty()) {
            str2 = "";
        } else {
            str2 = ", [" + ANCSNotificationSourceQueue.toLog(notificationSource.getFlags()) + "]";
        }
        sb3.append(str2);
        sb3.append(TextUtils.isEmpty(str) ? "" : j.m(", [", str, "]"));
        b.b(sb3.toString());
        this.sourceQueue.add(notificationSource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendNotificationRemovedSource(long j8, String str) {
        StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(j8, "ANCSMessageManager.sendNotificationRemovedSource -> sending notif ID [", "] removed source msg for package [", str);
        sbK.append("]");
        b.b(sbK.toString());
        sendGncsNotificationSource(new ANCSNotificationSourceQueue.NotificationSource(new ANCSNotificationSource(ANCSMessageBase.EventID.NOTIFICATION_REMOVED, EnumSet.of(ANCSMessageBase.EventFlag.SILENT), ANCSMessageBase.CategoryID.OTHER, 0, j8, ANCSMessageBase.FeatureFlag.fromFlags(0)), Collections.EMPTY_LIST), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendNotificationSource(GNCSNotificationInfo gNCSNotificationInfo, ANCSMessageBase.EventID eventID, boolean z14) {
        StringBuilder sb3 = new StringBuilder("ANCSMessageManager.sendNotificationSource -> ");
        ANCSNotificationSource aNCSNotificationSource = new ANCSNotificationSource(eventID, calculateEventTypeFlag(gNCSNotificationInfo, z14), ANCSUtil.getCategoryForNotificationType(gNCSNotificationInfo.type), CacheManager.INSTANCE.getNumberOfEventsForType(gNCSNotificationInfo.type), gNCSNotificationInfo.cacheId, ANCSMessageBase.FeatureFlag.fromFlags(gNCSNotificationInfo.extraFlags));
        if (gNCSNotificationInfo.promotedToNewFromUpdate) {
            sb3.append("Setting flag PROMOTED_TO_NEW_FROM_MODIFIED for notification with key: ");
            sb3.append(gNCSNotificationInfo.notificationKey);
        }
        sendGncsNotificationSource(new ANCSNotificationSourceQueue.NotificationSource(aNCSNotificationSource, gNCSNotificationInfo.promotedToNewFromUpdate ? Collections.singletonList(ANCSNotificationSourceQueue.NotificationSource.Flag.PROMOTED_TO_NEW_FROM_MODIFIED) : Collections.EMPTY_LIST), gNCSNotificationInfo.packageName);
        b.b(sb3.toString());
    }

    public void addCallback(Callback callback) {
        b.b("ANCSMessageManager.addCallback -> adding callback " + callback);
        this.callbacks.add(callback);
    }

    public void clearMediaRequestCallback() {
        b.b("ANCSMessageManager.clearMediaRequestCallback -> clearing media request callback");
        this.mediaRequestCallback = null;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0105 A[Catch: Exception -> 0x0069, TryCatch #0 {Exception -> 0x0069, blocks: (B:3:0x0039, B:5:0x0046, B:8:0x004e, B:10:0x0056, B:12:0x005a, B:33:0x0105, B:35:0x0115, B:15:0x006c, B:18:0x0078, B:20:0x007c, B:22:0x0084, B:23:0x00a8, B:24:0x00af, B:26:0x00b5, B:28:0x00c1, B:29:0x00e5, B:30:0x00f6), top: B:43:0x0039 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0115 A[Catch: Exception -> 0x0069, TRY_LEAVE, TryCatch #0 {Exception -> 0x0069, blocks: (B:3:0x0039, B:5:0x0046, B:8:0x004e, B:10:0x0056, B:12:0x005a, B:33:0x0105, B:35:0x0115, B:15:0x006c, B:18:0x0078, B:20:0x007c, B:22:0x0084, B:23:0x00a8, B:24:0x00af, B:26:0x00b5, B:28:0x00c1, B:29:0x00e5, B:30:0x00f6), top: B:43:0x0039 }] */
    public GNCSMediaResponse handleMediaRequest(Context context, GNCSMediaRequest gNCSMediaRequest, String str) {
        byte[] imageFromUri;
        String strM = j.m("MMS# ANCSMessageManager.handleMediaRequest[", str, "] -> ");
        StringBuilder sbI = sn.a.i(strM, "Trying to retrieve image for notification[");
        sbI.append(gNCSMediaRequest.getNotificationId());
        sbI.append("] at index: ");
        sbI.append(gNCSMediaRequest.getIndex());
        b.b(sbI.toString());
        GNCSMediaResponse gNCSMediaResponse = new GNCSMediaResponse(gNCSMediaRequest.getNotificationId(), gNCSMediaRequest.getIndex());
        try {
            GNCSNotificationInfo notification = CacheManager.INSTANCE.getNotification(gNCSMediaRequest.getNotificationId());
            if (notification != null && notification.isActive()) {
                if (notification.images.isEmpty() && notification.hasLargeIcon) {
                    b.b(strM.concat(" No images found for notification. LargeIcon present , fetching largeIcon."));
                    imageFromUri = this.mediaRequestCallback.onNotificationLargeIconRequested(notification, gNCSMediaRequest);
                } else if (SmartNotificationsUtil.Packages.PACKAGES_WITH_REMOTE_VIEW_IMAGES.contains(notification.packageName)) {
                    if (notification.numRemoteViewImages <= 0 || gNCSMediaRequest.getIndex() < notification.numRemoteViewImages) {
                        imageFromUri = this.mediaRequestCallback.onNotificationRemoteViewImageRequested(notification, gNCSMediaRequest);
                    } else {
                        b.b(strM + " No RemoteView images found for notification at index " + gNCSMediaRequest.getIndex() + ". Responding with INVALID_INDEX");
                        gNCSMediaResponse.setStatus(GNCSMediaResponse.Status.INVALID_INDEX);
                    }
                } else if (notification.getMediaCount() <= 0 || gNCSMediaRequest.getIndex() < notification.images.size()) {
                    imageFromUri = SmartNotificationsUtil.getImageFromUri(context, notification.images.get(gNCSMediaRequest.getIndex()), gNCSMediaRequest);
                } else {
                    b.b(strM + " No images found for notification at index " + gNCSMediaRequest.getIndex() + ". Responding with INVALID_INDEX");
                    gNCSMediaResponse.setStatus(GNCSMediaResponse.Status.INVALID_INDEX);
                }
                if (imageFromUri != null) {
                    gNCSMediaResponse.setStatus(GNCSMediaResponse.Status.UNKNOWN);
                    return gNCSMediaResponse;
                }
                gNCSMediaResponse.setImageData(imageFromUri);
                gNCSMediaResponse.setType(gNCSMediaRequest.getType());
                gNCSMediaResponse.setStatus(GNCSMediaResponse.Status.SUCCESS);
                return gNCSMediaResponse;
            }
            b.b(strM.concat(" Notification does not exist or not active any more. Responding with INVALID_UID"));
            gNCSMediaResponse.setStatus(GNCSMediaResponse.Status.INVALID_UID);
            imageFromUri = null;
            if (imageFromUri != null) {
                gNCSMediaResponse.setStatus(GNCSMediaResponse.Status.UNKNOWN);
                return gNCSMediaResponse;
            }
            gNCSMediaResponse.setImageData(imageFromUri);
            gNCSMediaResponse.setType(gNCSMediaRequest.getType());
            gNCSMediaResponse.setStatus(GNCSMediaResponse.Status.SUCCESS);
            return gNCSMediaResponse;
        } catch (Exception e4) {
            gNCSMediaResponse.setStatus(GNCSMediaResponse.Status.UNKNOWN);
            StringBuilder sb3 = new StringBuilder();
            sb3.append(strM);
            sb3.append(e4.getMessage() != null ? e4.getMessage() : "");
            b.a(e4, sb3.toString());
            return gNCSMediaResponse;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v34, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v35, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v38, types: [java.util.ArrayList] */
    public void handleNotificationAttributes(byte[] bArr, String str) {
        ?? arrayList;
        try {
            ANCSGetNotificationAttributesRequest aNCSGetNotificationAttributesRequest = new ANCSGetNotificationAttributesRequest(bArr);
            GNCSNotificationInfo notification = CacheManager.INSTANCE.getNotification(aNCSGetNotificationAttributesRequest.notificationId);
            if (notification != null && notification.isActive()) {
                for (ANCSNotificationAttribute aNCSNotificationAttribute : aNCSGetNotificationAttributesRequest.attributes) {
                    b.b("ANCSMessageManager.handleNotificationAttributes[" + notification.packageName + "] -> attribute[" + aNCSNotificationAttribute.notificationAttributeId + "] ");
                    int i14 = 1;
                    switch (AnonymousClass2.$SwitchMap$com$garmin$android$ancs$ANCSMessageBase$NotificationAttributeID[aNCSNotificationAttribute.notificationAttributeId.ordinal()]) {
                        case 1:
                            aNCSNotificationAttribute.setValue(notification.packageName.getBytes());
                            break;
                        case 2:
                            if (notification.when != 0) {
                                aNCSNotificationAttribute.setValue(new SimpleDateFormat("yyyyMMdd'T'HHmmss", Locale.US).format(new Date(notification.when)).getBytes());
                            } else {
                                aNCSNotificationAttribute.setValue(new byte[0]);
                            }
                            break;
                        case 3:
                            aNCSNotificationAttribute.setValue(notification.message.getBytes());
                            break;
                        case 4:
                            aNCSNotificationAttribute.setValue(Integer.toString(notification.message.length()).getBytes());
                            break;
                        case 5:
                            aNCSNotificationAttribute.setValue(notification.subTitle.getBytes());
                            break;
                        case 6:
                            aNCSNotificationAttribute.setValue(notification.title.getBytes());
                            break;
                        case 7:
                            aNCSNotificationAttribute.setValue(notification.positiveAction.getBytes());
                            break;
                        case 8:
                            aNCSNotificationAttribute.setValue(notification.negativeAction.getBytes());
                            break;
                        case 9:
                            b.b("ANCSMessageManager.handleNotificationAttributes[" + notification.packageName + "] -> setting 'PHONE_NUMBER' as " + ((Object) SmartNotificationsUtil.obfuscateIfNeeded(notification.phoneNumber)));
                            aNCSNotificationAttribute.setValue(notification.phoneNumber.getBytes());
                            break;
                        case 10:
                            aNCSNotificationAttribute.setValue(notification.conversationId.getBytes());
                            break;
                        case 11:
                            List<GNCSNotificationAction> list = notification.actions;
                            if (list == null || list.isEmpty()) {
                                arrayList = Collections.EMPTY_LIST;
                            } else {
                                arrayList = new ArrayList(Math.min(aNCSNotificationAttribute.maxActions, notification.actions.size()));
                                for (GNCSNotificationAction gNCSNotificationAction : notification.actions) {
                                    if (!gNCSNotificationAction.requiresInput || (!SmartNotificationsConfig.getInstance().isNoReplyActionPackage(notification.packageName) && (aNCSNotificationAttribute.actionFlags & 1) != 0)) {
                                        arrayList.add(ANCSUtil.fromGncsNotificationAction(gNCSNotificationAction, aNCSNotificationAttribute.maxLength));
                                        if (arrayList.size() >= aNCSNotificationAttribute.maxActions) {
                                        }
                                    }
                                }
                            }
                            aNCSNotificationAttribute.setValue(new ANCSNotificationActions(aNCSNotificationAttribute.maxActions, arrayList).serialize());
                            break;
                        case 12:
                            int mediaCount = notification.getMediaCount();
                            if (notification.getMediaCount() != 0 || !notification.hasLargeIcon) {
                                i14 = SmartNotificationsUtil.Packages.PACKAGES_WITH_REMOTE_VIEW_IMAGES.contains(notification.packageName) ? notification.numRemoteViewImages : mediaCount;
                            }
                            b.b("MMS# ANCSMessageManager.handleNotificationAttributes [" + notification.packageName + "] -> setting 'MEDIA_OBJECT_COUNT' as " + i14);
                            aNCSNotificationAttribute.setValue(Integer.toString(i14).getBytes());
                            break;
                    }
                }
                b.b("ANCSMessageManager.handleNotificationAttributes [" + notification.packageName + "] -> sending attributes data source");
                ANCSGetNotificationAttributesResponse aNCSGetNotificationAttributesResponse = new ANCSGetNotificationAttributesResponse(aNCSGetNotificationAttributesRequest.notificationId, aNCSGetNotificationAttributesRequest.attributes);
                aNCSGetNotificationAttributesResponse.dump();
                sendGncsDataSource(aNCSGetNotificationAttributesResponse.serialize(), str);
                return;
            }
            b.b("ANCSMessageManager.handleNotificationAttributes -> sendNotificationRemovedSource ");
            sendNotificationRemovedSource(aNCSGetNotificationAttributesRequest.notificationId, "");
        } catch (Exception e4) {
            StringBuilder sb3 = new StringBuilder("ANCSMessageManager.handleNotificationAttributes -> ");
            sb3.append(e4.getMessage() != null ? e4.getMessage() : "");
            b.a(e4, sb3.toString());
        }
    }

    public void handlePerformAndroidAction(byte[] bArr) {
        try {
            ANCSPerformAndroidAction aNCSPerformAndroidAction = new ANCSPerformAndroidAction(bArr);
            GNCSNotificationInfo notification = CacheManager.INSTANCE.getNotification(aNCSPerformAndroidAction.notificationId);
            if (notification != null && notification.isActive()) {
                Iterator<Callback> it = this.callbacks.iterator();
                while (it.hasNext()) {
                    try {
                        it.next().onAndroidActionRequested(notification, aNCSPerformAndroidAction.actionId, aNCSPerformAndroidAction.text);
                    } catch (Exception unused) {
                    }
                }
                return;
            }
            b.b("ANCSMessageManager.handlePerformAndroidAction -> sendNotificationRemovedSource ");
            sendNotificationRemovedSource(aNCSPerformAndroidAction.notificationId, "");
        } catch (Exception e4) {
            StringBuilder sb3 = new StringBuilder("ANCSMessageManager.handlePerformAndroidAction -> ");
            sb3.append(e4.getMessage() != null ? e4.getMessage() : "");
            b.a(e4, sb3.toString());
        }
    }

    public void handlePerformNotificationAction(byte[] bArr) {
        try {
            ANCSPerformNotificationAction aNCSPerformNotificationAction = new ANCSPerformNotificationAction(bArr);
            GNCSNotificationInfo notification = CacheManager.INSTANCE.getNotification(aNCSPerformNotificationAction.notificationId);
            if (notification == null) {
                b.b("ANCSMessageManager.handlePerformNotificationAction -> sendNotificationRemovedSource \ninfo is null");
                sendNotificationRemovedSource(aNCSPerformNotificationAction.notificationId, "");
            } else if (!notification.isActive()) {
                b.b("ANCSMessageManager.handlePerformNotificationAction -> sendNotificationRemovedSource \ninfo is not active");
                sendNotificationRemovedSource(aNCSPerformNotificationAction.notificationId, notification.packageName);
            } else {
                Iterator<Callback> it = this.callbacks.iterator();
                while (it.hasNext()) {
                    try {
                        it.next().onNotificationActionRequested(notification, aNCSPerformNotificationAction.actionId == ANCSMessageBase.ActionID.POSITIVE);
                    } catch (Exception unused) {
                    }
                }
            }
        } catch (Exception e4) {
            StringBuilder sb3 = new StringBuilder("ANCSMessageManager.handlePerformNotificationAction -> ");
            sb3.append(e4.getMessage() != null ? e4.getMessage() : "");
            b.a(e4, sb3.toString());
        }
    }

    public void onMessageReceived(byte[] bArr, String str) {
        GNCSListenerServiceConfig config;
        if (this.transport == null || bArr.length == 0 || (config = GNCSListenerService.getConfig()) == null) {
            return;
        }
        try {
            ANCSMessageBase.CommandID commandIDFromId = ANCSMessageBase.CommandID.fromId(bArr[0]);
            b.b("ANCSMessageManager.onMessageReceived -> " + Arrays.toString(bArr) + "\ncommand : " + commandIDFromId);
            int i14 = AnonymousClass2.$SwitchMap$com$garmin$android$ancs$ANCSMessageBase$CommandID[commandIDFromId.ordinal()];
            if (i14 == 1) {
                handleNotificationAttributes(bArr, str);
                return;
            }
            if (i14 == 2) {
                handleAppAttributes(config.getAppContext(), bArr, str);
                return;
            }
            if (i14 == 3) {
                b.b("ANCSMessageManager.handleMessage -> handling 'perform notification action' request: " + Arrays.toString(bArr) + " from device: [" + str + "]");
                handlePerformNotificationAction(bArr);
                return;
            }
            if (i14 != 4) {
                return;
            }
            b.b("ANCSMessageManager.handleMessage -> handling 'perform android action' request: " + Arrays.toString(bArr) + " from device: [" + str + "]");
            handlePerformAndroidAction(bArr);
        } catch (Exception unused) {
        }
    }

    public GNCSMediaResponse processMediaRequest(GNCSMediaRequest gNCSMediaRequest, String str) {
        b.b("ANCSMessageManager.processMediaRequest [" + str + "]-> {" + gNCSMediaRequest + StringSubstitutor.DEFAULT_VAR_END);
        if (this.transport == null) {
            com.airbnb.lottie.animation.keyframe.a.s("ANCSMessageManager.processMediaRequest [", str, "]-> transport is null");
            return null;
        }
        GNCSListenerServiceConfig config = GNCSListenerService.getConfig();
        if (config != null) {
            return handleMediaRequest(config.getAppContext(), gNCSMediaRequest, str);
        }
        com.airbnb.lottie.animation.keyframe.a.s("ANCSMessageManager.processMediaRequest [", str, "]-> GNCSListenerServiceConfig is null");
        return null;
    }

    public void removeCallback(Callback callback) {
        b.b("ANCSMessageManager.removeCallback -> removing callback " + callback);
        this.callbacks.remove(callback);
    }

    public void setDeviceCapabilities(String str, List<DeviceCapability> list) {
        synchronized (this.activeDevices) {
            try {
                this.deviceCapabilities.put(str, list);
                ActiveDevice activeDevice = this.activeDevices.get(str);
                if (activeDevice != null) {
                    HashSet hashSet = new HashSet(list.size() + activeDevice.deviceCapabilities.size());
                    hashSet.addAll(list);
                    hashSet.addAll(activeDevice.deviceCapabilities);
                    this.activeDevices.put(str, new ActiveDevice(str, hashSet));
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public void setMediaRequestCallback(MediaRequestCallback mediaRequestCallback) {
        b.b("ANCSMessageManager.setMediaRequestCallback -> setting media request callback to " + mediaRequestCallback);
        this.mediaRequestCallback = mediaRequestCallback;
    }

    public void subscribe(String str, List<DeviceCapability> list, IANCSMessageTransport iANCSMessageTransport) {
        String strConcat = "ANCSMessageManager.subscribe(" + str + ")";
        b.b(strConcat);
        this.transport = iANCSMessageTransport;
        synchronized (this.activeDevices) {
            try {
                List<DeviceCapability> list2 = this.deviceCapabilities.get(str);
                HashSet hashSet = new HashSet(list);
                if (list2 != null) {
                    hashSet.addAll(list2);
                }
                this.activeDevices.put(str, new ActiveDevice(str, hashSet));
            } catch (Throwable th3) {
                throw th3;
            }
        }
        ((GNCSNotificationManager) jb2.b.a(GNCSNotificationManager.class)).registerListener(this.listener);
        if (this.queueThread == null) {
            QueueThread queueThread = new QueueThread(100L);
            this.queueThread = queueThread;
            queueThread.start();
            strConcat = strConcat.concat("\n * queueThread started w/ 100ms dequeue rate");
        }
        if (!SmartNotificationsUtil.isNotifPermissionGrantedAndServiceConnected(strConcat)) {
            b.b(strConcat);
            return;
        }
        b.b(strConcat);
        sendExistingNotifications();
        c.a(GNCSListenerService.getConfig().getAppContext());
    }

    public void unsubscribe(String str) {
        com.airbnb.lottie.animation.keyframe.a.s("ANCSMessageManager.unsubscribe(", str, ")");
        this.activeDevices.remove(str);
        if (this.activeDevices.isEmpty()) {
            ((GNCSNotificationManager) jb2.b.a(GNCSNotificationManager.class)).unregisterListener(this.listener);
            if (this.queueThread != null) {
                try {
                    b.b("ANCSMessageManager -> 0 active remote devices, shutting down queue thread...");
                    this.queueThread.onDeviceUnsubscribed();
                } finally {
                    this.queueThread = null;
                }
            }
        }
    }

    public /* synthetic */ ANCSMessageManager(int i14) {
        this();
    }
}
