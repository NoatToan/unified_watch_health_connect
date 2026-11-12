package services.reminder.notification;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.text.TextUtils;
import defpackage.owg;
import java.security.InvalidParameterException;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0016\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b8\u0010\bJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u001b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0015\u001a\u0004\u0018\u00010\u00122\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0015\u0010\u0014J#\u0010\u0018\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0018\u00010\u00162\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\"\u001a\u0004\u0018\u00010\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010%\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0016\u0010)\u001a\u0004\u0018\u00010&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010$R\u0014\u0010-\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010$R\u0014\u0010/\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010$R\u0014\u00101\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u0010$R\u0014\u00103\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u0010$R\u0014\u00105\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u0010$R\u0016\u00107\u001a\u0004\u0018\u00010\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u0010!¨\u00069"}, d2 = {"Lservices/reminder/notification/NotificationAdapter;", "Lservices/reminder/notification/INotificationAdapter;", "", "paramCheck", "()V", "Lowg;", "notice", "setNotice", "(Lowg;)V", "Landroid/content/Context;", "context", "", "getTitle", "(Landroid/content/Context;)Ljava/lang/String;", "getContent", "Landroid/graphics/Bitmap;", "getBigPic", "(Landroid/content/Context;)Landroid/graphics/Bitmap;", "Landroid/content/Intent;", "getIntent", "(Landroid/content/Context;)Landroid/content/Intent;", "getDeleteIntent", "", "Lowg$a;", "getActions", "(Landroid/content/Context;)Ljava/util/List;", "mNotice", "Lowg;", "", "getNotificationTemplate", "()Ljava/lang/Integer;", "notificationTemplate", "getNoticeId", "()Ljava/lang/String;", "noticeId", "getIcon", "()I", "icon", "Lowg$b;", "getChannel", "()Lowg$b;", "channel", "getNotificationId", "notificationId", "getSmallIconResId", "smallIconResId", "getPriority", "priority", "getImportance", "importance", "getDelPendingRequestCode", "delPendingRequestCode", "getPendingRequestCode", "pendingRequestCode", "getGroupKey", "groupKey", "<init>", "reminder_release"}, k = 1, mv = {2, 0, 0})
public class NotificationAdapter implements INotificationAdapter {

    @Nullable
    private owg mNotice;

    public NotificationAdapter(@Nullable owg owgVar) {
        this.mNotice = owgVar;
    }

    private final void paramCheck() {
        if (this.mNotice == null) {
            throw new InvalidParameterException("notice is needed");
        }
    }

    @Override // services.reminder.notification.INotificationAdapter
    @Nullable
    public List<owg.a> getActions(@Nullable Context context) {
        paramCheck();
        owg owgVar = this.mNotice;
        if (owgVar != null) {
            return owgVar.a();
        }
        return null;
    }

    @Override // services.reminder.notification.INotificationAdapter
    @Nullable
    public Bitmap getBigPic(@Nullable Context context) {
        paramCheck();
        return null;
    }

    @Override // services.reminder.notification.INotificationAdapter
    @Nullable
    public owg.b getChannel() {
        paramCheck();
        owg owgVar = this.mNotice;
        Intrinsics.checkNotNull(owgVar);
        return owgVar.c;
    }

    @Override // services.reminder.notification.INotificationAdapter
    @Nullable
    public String getContent(@Nullable Context context) {
        paramCheck();
        NoticeDataParser noticeDataParser = NoticeDataParser.INSTANCE;
        owg owgVar = this.mNotice;
        Intrinsics.checkNotNull(owgVar);
        String content = owgVar.h;
        Intrinsics.checkNotNullExpressionValue(content, "content");
        return noticeDataParser.parseParamIfNeed(content);
    }

    @Override // services.reminder.notification.INotificationAdapter
    public int getDelPendingRequestCode() {
        paramCheck();
        owg owgVar = this.mNotice;
        Intrinsics.checkNotNull(owgVar);
        return owgVar.d();
    }

    @Override // services.reminder.notification.INotificationAdapter
    @Nullable
    public Intent getDeleteIntent(@Nullable Context context) {
        paramCheck();
        owg owgVar = this.mNotice;
        if (owgVar != null) {
            return owgVar.e();
        }
        return null;
    }

    @Override // services.reminder.notification.INotificationAdapter
    @Nullable
    public String getGroupKey() {
        paramCheck();
        owg owgVar = this.mNotice;
        if (TextUtils.isEmpty(owgVar != null ? owgVar.f() : null)) {
            owg.b channel = getChannel();
            Intrinsics.checkNotNull(channel);
            return channel.f29767a;
        }
        owg owgVar2 = this.mNotice;
        Intrinsics.checkNotNull(owgVar2);
        return owgVar2.f();
    }

    @Override // services.reminder.notification.INotificationAdapter
    public int getIcon() {
        paramCheck();
        owg owgVar = this.mNotice;
        Intrinsics.checkNotNull(owgVar);
        return owgVar.m;
    }

    @Override // services.reminder.notification.INotificationAdapter
    public int getImportance() {
        paramCheck();
        owg owgVar = this.mNotice;
        Intrinsics.checkNotNull(owgVar);
        return owgVar.f;
    }

    @Override // services.reminder.notification.INotificationAdapter
    @Nullable
    public Intent getIntent(@Nullable Context context) {
        paramCheck();
        owg owgVar = this.mNotice;
        if (owgVar != null) {
            return owgVar.g();
        }
        return null;
    }

    @Override // services.reminder.notification.INotificationAdapter
    @Nullable
    public String getNoticeId() {
        paramCheck();
        owg owgVar = this.mNotice;
        if (owgVar != null) {
            return owgVar.f29762b;
        }
        return null;
    }

    @Override // services.reminder.notification.INotificationAdapter
    public int getNotificationId() {
        paramCheck();
        owg owgVar = this.mNotice;
        Intrinsics.checkNotNull(owgVar);
        return owgVar.j();
    }

    @Override // services.reminder.notification.INotificationAdapter
    @Nullable
    public Integer getNotificationTemplate() {
        paramCheck();
        owg owgVar = this.mNotice;
        if (owgVar != null) {
            return Integer.valueOf(owgVar.k());
        }
        return null;
    }

    @Override // services.reminder.notification.INotificationAdapter
    public int getPendingRequestCode() {
        paramCheck();
        owg owgVar = this.mNotice;
        Intrinsics.checkNotNull(owgVar);
        return owgVar.j();
    }

    @Override // services.reminder.notification.INotificationAdapter
    public int getPriority() {
        paramCheck();
        owg owgVar = this.mNotice;
        Intrinsics.checkNotNull(owgVar);
        return owgVar.h();
    }

    @Override // services.reminder.notification.INotificationAdapter
    public int getSmallIconResId() {
        paramCheck();
        owg owgVar = this.mNotice;
        Intrinsics.checkNotNull(owgVar);
        return owgVar.l;
    }

    @Override // services.reminder.notification.INotificationAdapter
    @Nullable
    public String getTitle(@Nullable Context context) {
        paramCheck();
        NoticeDataParser noticeDataParser = NoticeDataParser.INSTANCE;
        owg owgVar = this.mNotice;
        Intrinsics.checkNotNull(owgVar);
        String title = owgVar.g;
        Intrinsics.checkNotNullExpressionValue(title, "title");
        return noticeDataParser.parseParamIfNeed(title);
    }

    public final void setNotice(@Nullable owg notice) {
        this.mNotice = notice;
    }
}
