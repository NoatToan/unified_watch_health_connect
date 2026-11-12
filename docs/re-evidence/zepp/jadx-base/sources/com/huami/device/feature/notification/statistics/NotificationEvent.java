package com.huami.device.feature.notification.statistics;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0016\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0016\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0016\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0016\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0016\u0010\u000e\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0016\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004R\u0016\u0010\u0010\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004¨\u0006\u0013"}, d2 = {"Lcom/huami/device/feature/notification/statistics/NotificationEvent;", "", "", "STATISTIC_ID", "Ljava/lang/String;", "SYNC_SUCCEED", "SYNC_REFUSED", "SYNC_FAILED", "NOTI_POSTED", "NOTI_REMOVED", "NOTI_DISABLED", "NOTI_ENABLED", "SERVICE_CONNECTED", "SERVICE_DISCONNECTED", "SERVICE_RESTARTED", "KEY_PACKAGE", "KEY_REASON", "<init>", "()V", "notification_release"}, k = 1, mv = {1, 5, 1})
public final class NotificationEvent {

    @NotNull
    public static final NotificationEvent INSTANCE = new NotificationEvent();

    @NotNull
    public static final String KEY_PACKAGE = "package";

    @NotNull
    public static final String KEY_REASON = "reason";

    @NotNull
    public static final String NOTI_DISABLED = "notification_disabled";

    @NotNull
    public static final String NOTI_ENABLED = "notification_enabled";

    @NotNull
    public static final String NOTI_POSTED = "notification_posted";

    @NotNull
    public static final String NOTI_REMOVED = "notification_removed";

    @NotNull
    public static final String SERVICE_CONNECTED = "service_connected";

    @NotNull
    public static final String SERVICE_DISCONNECTED = "service_disconnected";

    @NotNull
    public static final String SERVICE_RESTARTED = "notification_listener_service_restarted";

    @NotNull
    public static final String STATISTIC_ID = "notification_sync";

    @NotNull
    public static final String SYNC_FAILED = "sync_failed";

    @NotNull
    public static final String SYNC_REFUSED = "sync_refused";

    @NotNull
    public static final String SYNC_SUCCEED = "sync_succeed";

    private NotificationEvent() {
    }
}
