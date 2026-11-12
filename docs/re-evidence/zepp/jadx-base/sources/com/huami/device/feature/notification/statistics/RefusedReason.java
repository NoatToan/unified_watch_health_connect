package com.huami.device.feature.notification.statistics;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0016\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0016\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0016\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004¨\u0006\u000f"}, d2 = {"Lcom/huami/device/feature/notification/statistics/RefusedReason;", "", "", "INVISIBLE", "Ljava/lang/String;", "DUPLICATE", "GROUP_SUMMARY", "NOT_MSG", "NOTI_OFF", "NOT_SUPPORTED", "DISCONNECTED", "MSG_OFF", "ONLY_SCREEN_OFF", "<init>", "()V", "notification_release"}, k = 1, mv = {1, 5, 1})
public final class RefusedReason {

    @NotNull
    public static final String DISCONNECTED = "device is not disconnected";

    @NotNull
    public static final String DUPLICATE = "notification_duplicated";

    @NotNull
    public static final String GROUP_SUMMARY = "group_summary";

    @NotNull
    public static final RefusedReason INSTANCE = new RefusedReason();

    @NotNull
    public static final String INVISIBLE = "notification_invisible";

    @NotNull
    public static final String MSG_OFF = "message alert disabled";

    @NotNull
    public static final String NOTI_OFF = "app notification is off";

    @NotNull
    public static final String NOT_MSG = "group, but category not msg";

    @NotNull
    public static final String NOT_SUPPORTED = "app is not in notification list";

    @NotNull
    public static final String ONLY_SCREEN_OFF = "only sync in screen off";

    private RefusedReason() {
    }
}
