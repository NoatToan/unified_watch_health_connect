package services.reminder.notification;

import android.app.Notification;
import android.content.Context;
import com.xiaomi.fitness.common.log.Logger;
import defpackage.owg;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ\u001f\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\bJ\u001f\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lservices/reminder/notification/NotificationFactory;", "", "Landroid/content/Context;", "context", "Lowg;", "notice", "Landroid/app/Notification;", "create", "(Landroid/content/Context;Lowg;)Landroid/app/Notification;", "getStandardNotification", "getActionsNotification", "getBigPicNotification", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "reminder_release"}, k = 1, mv = {2, 0, 0})
public final class NotificationFactory {

    @NotNull
    public static final NotificationFactory INSTANCE = new NotificationFactory();

    @NotNull
    private static final String TAG = "NotificationFactory";

    private NotificationFactory() {
    }

    @Nullable
    public final Notification create(@NotNull Context context, @Nullable owg notice) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNull(notice);
        int iK = notice.k();
        if (iK == 0) {
            if (iK != 0) {
                Logger.e(TAG, "Unhandled type: " + iK);
            }
            return getStandardNotification(context, notice);
        }
        if (iK == 1) {
            return getActionsNotification(context, notice);
        }
        if (iK == 2) {
            return getBigPicNotification(context, notice);
        }
        if (iK != 0) {
            Logger.e(TAG, "Unhandled type: " + iK);
        }
        return getStandardNotification(context, notice);
    }

    @Nullable
    public final Notification getActionsNotification(@NotNull Context context, @NotNull owg notice) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(notice, "notice");
        return NotificationTemplate.INSTANCE.getActionsNotification(context, notice);
    }

    @Nullable
    public final Notification getBigPicNotification(@NotNull Context context, @NotNull owg notice) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(notice, "notice");
        return NotificationTemplate.INSTANCE.getBigPicNotification(context, notice);
    }

    @Nullable
    public final Notification getStandardNotification(@NotNull Context context, @NotNull owg notice) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(notice, "notice");
        return NotificationTemplate.INSTANCE.getStandardNotification(context, notice);
    }
}
