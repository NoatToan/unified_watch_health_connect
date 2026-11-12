package services.reminder.notification;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import defpackage.owg;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0015\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006J\u001b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\t\u0010\nJ#\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001a8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u001fR\u0014\u0010$\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u001fR\u0014\u0010&\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u001fR\u0014\u0010(\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\u001fR\u0014\u0010*\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\u001fR\u0014\u0010,\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b+\u0010\u001fR\u0016\u0010.\u001a\u0004\u0018\u00010\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b-\u0010\u0018¨\u0006/"}, d2 = {"Lservices/reminder/notification/INotificationAdapter;", "", "Landroid/content/Context;", "context", "", "getTitle", "(Landroid/content/Context;)Ljava/lang/String;", "getContent", "Landroid/graphics/Bitmap;", "getBigPic", "(Landroid/content/Context;)Landroid/graphics/Bitmap;", "", "Lowg$a;", "getActions", "(Landroid/content/Context;)Ljava/util/List;", "Landroid/content/Intent;", "getIntent", "(Landroid/content/Context;)Landroid/content/Intent;", "getDeleteIntent", "", "getNotificationTemplate", "()Ljava/lang/Integer;", "notificationTemplate", "getNoticeId", "()Ljava/lang/String;", "noticeId", "Lowg$b;", "getChannel", "()Lowg$b;", "channel", "getNotificationId", "()I", "notificationId", "getIcon", "icon", "getSmallIconResId", "smallIconResId", "getPriority", "priority", "getImportance", "importance", "getDelPendingRequestCode", "delPendingRequestCode", "getPendingRequestCode", "pendingRequestCode", "getGroupKey", "groupKey", "reminder_release"}, k = 1, mv = {2, 0, 0})
public interface INotificationAdapter {
    @Nullable
    List<owg.a> getActions(@Nullable Context context);

    @Nullable
    Bitmap getBigPic(@Nullable Context context);

    @Nullable
    owg.b getChannel();

    @Nullable
    String getContent(@Nullable Context context);

    int getDelPendingRequestCode();

    @Nullable
    Intent getDeleteIntent(@Nullable Context context);

    @Nullable
    String getGroupKey();

    int getIcon();

    int getImportance();

    @Nullable
    Intent getIntent(@Nullable Context context);

    @Nullable
    String getNoticeId();

    int getNotificationId();

    @Nullable
    Integer getNotificationTemplate();

    int getPendingRequestCode();

    int getPriority();

    int getSmallIconResId();

    @Nullable
    String getTitle(@Nullable Context context);
}
