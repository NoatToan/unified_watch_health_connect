package com.xiaomi.fitness.notify.focus;

import android.content.Context;
import com.xiaomi.fitness.notify.data.FocusNotificationParam;
import defpackage.rxg;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dJ\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH&¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\tH&¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000fH&¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fitness/notify/focus/NotificationFocusInterface;", "", "", "supportFocusRomVersion", "()I", "", "packageName", "Landroid/content/Context;", "context", "", "hasFocusPermission", "(Ljava/lang/String;Landroid/content/Context;)Z", "", "Lcom/xiaomi/fitness/notify/focus/RemoveNotification;", "notifyIdList", "", "handleFocusNotificationRemove", "(Ljava/util/List;)V", "Lrxg;", "notifyData", "updatable", "handleFocusNotificationPostDisable", "(Lrxg;Z)Z", "handleFocusNotificationRemoveIfListenDisConnect", "()V", "Lcom/xiaomi/fitness/notify/data/FocusNotificationParam;", "focusNotificationParam", "handleFocusNotification", "(Ljava/lang/String;Lcom/xiaomi/fitness/notify/data/FocusNotificationParam;Lrxg;)V", "Companion", "notify_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public interface NotificationFocusInterface {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/notify/focus/NotificationFocusInterface$Companion;", "", "<init>", "()V", "notify_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    void handleFocusNotification(@NotNull String packageName, @NotNull FocusNotificationParam focusNotificationParam, @NotNull rxg notifyData);

    boolean handleFocusNotificationPostDisable(@NotNull rxg notifyData, boolean updatable);

    void handleFocusNotificationRemove(@NotNull List<RemoveNotification> notifyIdList);

    void handleFocusNotificationRemoveIfListenDisConnect();

    boolean hasFocusPermission(@NotNull String packageName, @NotNull Context context);

    int supportFocusRomVersion();
}
