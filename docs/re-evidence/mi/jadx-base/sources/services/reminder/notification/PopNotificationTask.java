package services.reminder.notification;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Pair;
import com.xiaomi.fitness.common.log.Logger;
import defpackage.mjk;
import defpackage.owg;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import services.reminder.NoticeCallback;
import services.reminder.ReminderHelper;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c\u0012\u001a\u0010+\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0(\u0018\u00010'¢\u0006\u0004\b,\u0010-J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082D¢\u0006\u0006\n\u0004\b!\u0010\"R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R(\u0010)\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0(\u0018\u00010'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006."}, d2 = {"Lservices/reminder/notification/PopNotificationTask;", "Ljava/lang/Runnable;", "Lowg;", "notice", "", "preNotice", "(Lowg;)V", "postNotice", "Landroid/app/NotificationManager;", "notifyMgr", "", "popNotice", "(Landroid/app/NotificationManager;Lowg;)Z", "", "iconRes", "Landroid/graphics/Bitmap;", "getLargeIcon", "(I)Landroid/graphics/Bitmap;", "getIcon", "(I)I", "Landroid/graphics/drawable/Drawable;", "getDrawable", "(I)Landroid/graphics/drawable/Drawable;", "run", "()V", "Landroid/content/Context;", "mContext", "Landroid/content/Context;", "", "Lmjk;", "mReminders", "Ljava/util/List;", "", "TAG", "Ljava/lang/String;", "", "Lservices/reminder/NoticeCallback;", "mNoticeCallbacks", "[Lservices/reminder/NoticeCallback;", "Lservices/reminder/notification/OnResult;", "Landroid/util/Pair;", "mOnResult", "Lservices/reminder/notification/OnResult;", "onResult", "<init>", "(Landroid/content/Context;Ljava/util/List;Lservices/reminder/notification/OnResult;)V", "reminder_release"}, k = 1, mv = {2, 0, 0})
public final class PopNotificationTask implements Runnable {

    @NotNull
    private final String TAG;

    @NotNull
    private final Context mContext;

    @NotNull
    private final NoticeCallback[] mNoticeCallbacks;

    @Nullable
    private final OnResult<Pair<Boolean, mjk>> mOnResult;

    @NotNull
    private final List<mjk> mReminders;

    /* JADX WARN: Multi-variable type inference failed */
    public PopNotificationTask(@NotNull Context mContext, @NotNull List<? extends mjk> mReminders, @Nullable OnResult<Pair<Boolean, mjk>> onResult) {
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        Intrinsics.checkNotNullParameter(mReminders, "mReminders");
        this.mContext = mContext;
        this.mReminders = mReminders;
        this.TAG = "MiHealth:PopNotificationTask";
        this.mNoticeCallbacks = ReminderHelper.INSTANCE.getNoticeCallbacks();
        this.mOnResult = onResult;
    }

    private final Drawable getDrawable(int iconRes) {
        try {
            return this.mContext.getResources().getDrawable(iconRes);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    private final int getIcon(int iconRes) {
        int i = this.mContext.getApplicationInfo().icon;
        return (iconRes == 0 || getDrawable(iconRes) == null) ? i : iconRes;
    }

    private final Bitmap getLargeIcon(int iconRes) {
        if (iconRes != 0) {
            Drawable drawable = getDrawable(iconRes);
            if (drawable instanceof BitmapDrawable) {
                return ((BitmapDrawable) drawable).getBitmap();
            }
        }
        Drawable drawable2 = getDrawable(this.mContext.getApplicationInfo().icon);
        if (drawable2 instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable2).getBitmap();
        }
        return null;
    }

    private final boolean popNotice(NotificationManager notifyMgr, owg notice) {
        Notification notificationCreate = NotificationFactory.INSTANCE.create(this.mContext, notice);
        if (notificationCreate == null) {
            Logger.i(this.TAG, "popNotice failed", notice.f29762b, new Object[0]);
            return false;
        }
        notifyMgr.notify(notice.j(), notificationCreate);
        Logger.d(this.TAG, "popNotice: noticeId = %s", notice.f29762b, new Object[0]);
        return true;
    }

    private final void postNotice(owg notice) {
        for (NoticeCallback noticeCallback : this.mNoticeCallbacks) {
            noticeCallback.onPostNotice(notice);
        }
    }

    private final void preNotice(owg notice) {
        for (NoticeCallback noticeCallback : this.mNoticeCallbacks) {
            noticeCallback.onPreNotice(notice);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        Logger.i(this.TAG, "PopNotificationTask run...");
        Object systemService = this.mContext.getSystemService("notification");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationManager notificationManager = (NotificationManager) systemService;
        for (mjk mjkVar : this.mReminders) {
            owg owgVarA = mjkVar.a();
            preNotice(owgVarA);
            owg.b bVar = owgVarA != null ? owgVarA.c : null;
            String str = bVar != null ? bVar.f29767a : null;
            if (notificationManager.getNotificationChannel(str) == null) {
                Intrinsics.checkNotNull(bVar);
                NotificationChannel notificationChannel = new NotificationChannel(str, bVar.f29768b, owgVarA.c());
                notificationChannel.setVibrationPattern(owgVarA.l());
                notificationManager.createNotificationChannel(notificationChannel);
            }
            Intrinsics.checkNotNull(owgVarA);
            boolean zPopNotice = popNotice(notificationManager, owgVarA);
            OnResult<Pair<Boolean, mjk>> onResult = this.mOnResult;
            if (onResult != null) {
                onResult.onResult(new Pair<>(Boolean.valueOf(zPopNotice), mjkVar));
            }
            postNotice(owgVarA);
        }
    }
}
