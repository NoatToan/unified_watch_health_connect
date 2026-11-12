package ohos.ace.plugin.notificationmanager;

/* JADX INFO: loaded from: classes46.dex */
public class NotificationRequest {
    public Long autoDeletedTime;
    public Integer badgeNumber;
    public NotificationContent content;
    public Long deliveryTime;
    public Integer id = 1;
    public boolean isAlertOnce;
    public boolean isCountdown;
    public boolean isOngoing;
    public boolean isStopwatch;
    public String label;
    public String largeIcon;
    public String notificationContentType;
    public Integer progressMax;
    public Integer progressValue;
    public boolean showDeliveryTime;
    public String smallIcon;
    public boolean tapDismissed;

    public static class NotificationBasicContent {
        public String text;
        public String title;
    }

    public static class NotificationContent {
        public NotificationBasicContent content;
        public int contentType;
    }

    public static class NotificationLongTextContent extends NotificationBasicContent {
        public String briefText;
        public String expandedTitle;
        public String longText;
    }

    public static class NotificationMultiLineContent extends NotificationBasicContent {
        public String[] allLines;
        public String briefText;
        public String expandedTitle;
    }

    public static class NotificationPictureContent extends NotificationBasicContent {
        public String briefText;
        public String expandedTitle;
        public String picture;
    }
}
