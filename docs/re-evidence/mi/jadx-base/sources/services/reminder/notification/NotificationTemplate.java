package services.reminder.notification;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.core.app.TaskStackBuilder;
import com.xiaomi.fitness.common.extensions.PendingIntentExtKt;
import com.xiaomi.fitness.common.utils.ArrayUtils;
import defpackage.owg;
import defpackage.wwg;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ\u001f\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\b¨\u0006\r"}, d2 = {"Lservices/reminder/notification/NotificationTemplate;", "", "Landroid/content/Context;", "context", "Lowg;", "notice", "Landroid/app/Notification;", "getStandardNotification", "(Landroid/content/Context;Lowg;)Landroid/app/Notification;", "getActionsNotification", "getBigPicNotification", "<init>", "()V", "reminder_release"}, k = 1, mv = {2, 0, 0})
public final class NotificationTemplate {

    @NotNull
    public static final NotificationTemplate INSTANCE = new NotificationTemplate();

    private NotificationTemplate() {
    }

    @Nullable
    public final Notification getActionsNotification(@NotNull Context context, @NotNull owg notice) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(notice, "notice");
        NotificationUtils notificationUtils = NotificationUtils.INSTANCE;
        NotificationAdapter notificationAdapter = notificationUtils.getNotificationAdapter(notice);
        String title = notificationAdapter.getTitle(context);
        String content = notificationAdapter.getContent(context);
        if (TextUtils.isEmpty(title) || TextUtils.isEmpty(content)) {
            return null;
        }
        Intent intent = notificationAdapter.getIntent(context);
        Intent deleteIntent = notificationAdapter.getDeleteIntent(context);
        PendingIntent broadcastPendingIntent$default = deleteIntent != null ? PendingIntentExtKt.getBroadcastPendingIntent$default(context, notificationAdapter.getDelPendingRequestCode(), deleteIntent, 0, 4, null) : null;
        TaskStackBuilder taskStackBuilderI = TaskStackBuilder.i(context);
        Intrinsics.checkNotNull(intent);
        TaskStackBuilder taskStackBuilderF = taskStackBuilderI.f(intent);
        Intrinsics.checkNotNullExpressionValue(taskStackBuilderF, "addNextIntentWithParentStack(...)");
        PendingIntent pendingIntentCompat$default = PendingIntentExtKt.getPendingIntentCompat$default(taskStackBuilderF, notificationAdapter.getPendingRequestCode(), 0, 2, null);
        List<owg.a> actions = notificationAdapter.getActions(context);
        owg.b channel = notificationAdapter.getChannel();
        Intrinsics.checkNotNull(channel);
        String str = channel.f29767a;
        Intrinsics.checkNotNull(str);
        wwg.e eVarA = new wwg.e(context, str).u(notificationUtils.getIcon(context, notificationAdapter.getSmallIconResId())).k(title).j(content).i(pendingIntentCompat$default).m(broadcastPendingIntent$default).g(true).p(notificationAdapter.getGroupKey()).t(notificationAdapter.getPriority()).A(1);
        Intrinsics.checkNotNullExpressionValue(eVarA, "setVisibility(...)");
        if (!ArrayUtils.isEmpty(actions)) {
            Intrinsics.checkNotNull(actions);
            for (owg.a aVar : actions) {
                NotificationUtils notificationUtils2 = NotificationUtils.INSTANCE;
                Intrinsics.checkNotNull(aVar);
                Intent intent2 = notificationUtils2.parseIntent(aVar.f29766b);
                TaskStackBuilder taskStackBuilderI2 = TaskStackBuilder.i(context);
                Intrinsics.checkNotNull(intent2);
                TaskStackBuilder taskStackBuilderF2 = taskStackBuilderI2.f(intent2);
                Intrinsics.checkNotNullExpressionValue(taskStackBuilderF2, "addNextIntentWithParentStack(...)");
                eVarA.b(new wwg.a.C1141a(notificationAdapter.getIcon(), aVar.f29765a, PendingIntentExtKt.getPendingIntentCompat$default(taskStackBuilderF2, notificationAdapter.getPendingRequestCode(), 0, 2, null)).a());
            }
        }
        return eVarA.d();
    }

    @Nullable
    public final Notification getBigPicNotification(@NotNull Context context, @NotNull owg notice) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(notice, "notice");
        NotificationUtils notificationUtils = NotificationUtils.INSTANCE;
        NotificationAdapter notificationAdapter = notificationUtils.getNotificationAdapter(notice);
        String title = notificationAdapter.getTitle(context);
        String content = notificationAdapter.getContent(context);
        if (TextUtils.isEmpty(title) || TextUtils.isEmpty(content)) {
            return null;
        }
        Intent intent = notificationAdapter.getIntent(context);
        Intent deleteIntent = notificationAdapter.getDeleteIntent(context);
        PendingIntent broadcastPendingIntent$default = deleteIntent != null ? PendingIntentExtKt.getBroadcastPendingIntent$default(context, notificationAdapter.getDelPendingRequestCode(), deleteIntent, 0, 4, null) : null;
        TaskStackBuilder taskStackBuilderI = TaskStackBuilder.i(context);
        Intrinsics.checkNotNull(intent);
        TaskStackBuilder taskStackBuilderF = taskStackBuilderI.f(intent);
        Intrinsics.checkNotNullExpressionValue(taskStackBuilderF, "addNextIntentWithParentStack(...)");
        PendingIntent pendingIntentCompat$default = PendingIntentExtKt.getPendingIntentCompat$default(taskStackBuilderF, notificationAdapter.getPendingRequestCode(), 0, 2, null);
        owg.b channel = notificationAdapter.getChannel();
        Intrinsics.checkNotNull(channel);
        String str = channel.f29767a;
        Intrinsics.checkNotNull(str);
        wwg.e eVarW = new wwg.e(context, str).u(notificationUtils.getIcon(context, notificationAdapter.getSmallIconResId())).k(title).j(content).i(pendingIntentCompat$default).m(broadcastPendingIntent$default).g(true).p(notificationAdapter.getGroupKey()).t(notificationAdapter.getPriority()).A(1).w(new wwg.b().h(notificationAdapter.getBigPic(context)));
        Intrinsics.checkNotNullExpressionValue(eVarW, "setStyle(...)");
        return eVarW.d();
    }

    @Nullable
    public final Notification getStandardNotification(@NotNull Context context, @NotNull owg notice) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(notice, "notice");
        NotificationUtils notificationUtils = NotificationUtils.INSTANCE;
        NotificationAdapter notificationAdapter = notificationUtils.getNotificationAdapter(notice);
        String title = notificationAdapter.getTitle(context);
        String content = notificationAdapter.getContent(context);
        if (TextUtils.isEmpty(title) || TextUtils.isEmpty(content)) {
            return null;
        }
        Intent intent = notificationAdapter.getIntent(context);
        Intent deleteIntent = notificationAdapter.getDeleteIntent(context);
        PendingIntent broadcastPendingIntent$default = deleteIntent != null ? PendingIntentExtKt.getBroadcastPendingIntent$default(context, notificationAdapter.getDelPendingRequestCode(), deleteIntent, 0, 4, null) : null;
        TaskStackBuilder taskStackBuilderI = TaskStackBuilder.i(context);
        Intrinsics.checkNotNull(intent);
        TaskStackBuilder taskStackBuilderF = taskStackBuilderI.f(intent);
        Intrinsics.checkNotNullExpressionValue(taskStackBuilderF, "addNextIntentWithParentStack(...)");
        PendingIntent pendingIntentCompat$default = PendingIntentExtKt.getPendingIntentCompat$default(taskStackBuilderF, notificationAdapter.getPendingRequestCode(), 0, 2, null);
        owg.b channel = notificationAdapter.getChannel();
        Intrinsics.checkNotNull(channel);
        String str = channel.f29767a;
        Intrinsics.checkNotNull(str);
        wwg.e eVarA = new wwg.e(context, str).u(notificationUtils.getIcon(context, notificationAdapter.getSmallIconResId())).k(title).j(content).i(pendingIntentCompat$default).m(broadcastPendingIntent$default).p(notificationAdapter.getGroupKey()).g(true).t(notificationAdapter.getPriority()).A(1);
        Intrinsics.checkNotNullExpressionValue(eVarA, "setVisibility(...)");
        return eVarA.d();
    }
}
