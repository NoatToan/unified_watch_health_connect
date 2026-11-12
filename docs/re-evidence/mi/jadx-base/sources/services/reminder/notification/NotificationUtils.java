package services.reminder.notification;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import defpackage.owg;
import java.net.URISyntaxException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b \u0010!J!\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0018\u001a\u00020\u00132\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lservices/reminder/notification/NotificationUtils;", "", "Landroid/content/Context;", "context", "", "iconRes", "Landroid/graphics/drawable/Drawable;", "getDrawable", "(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;", "Landroid/graphics/Bitmap;", "getLargeIcon", "(Landroid/content/Context;I)Landroid/graphics/Bitmap;", "getIcon", "(Landroid/content/Context;I)I", "Lowg;", "notice", "", "isNoticeValid", "(Lowg;)Z", "", SportRecordBundleKey.BUNDLE_PARAM_URI, "Landroid/content/Intent;", "parseIntent", "(Ljava/lang/String;)Landroid/content/Intent;", "clz", "Lservices/reminder/notification/NotificationAdapter;", "createNotificationAdapter", "(Ljava/lang/String;Lowg;)Lservices/reminder/notification/NotificationAdapter;", "getNotificationAdapter", "(Lowg;)Lservices/reminder/notification/NotificationAdapter;", "TAG", "Ljava/lang/String;", "<init>", "()V", "reminder_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nNotificationUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationUtils.kt\nservices/reminder/notification/NotificationUtils\n+ 2 Strings.kt\nkotlin/text/StringsKt__StringsKt\n*L\n1#1,109:1\n108#2:110\n80#2,22:111\n*S KotlinDebug\n*F\n+ 1 NotificationUtils.kt\nservices/reminder/notification/NotificationUtils\n*L\n80#1:110\n80#1:111,22\n*E\n"})
public final class NotificationUtils {

    @NotNull
    public static final NotificationUtils INSTANCE = new NotificationUtils();

    @NotNull
    private static final String TAG = "NotificationUtils";

    private NotificationUtils() {
    }

    private final Drawable getDrawable(Context context, int iconRes) {
        try {
            return context.getResources().getDrawable(iconRes);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    @Nullable
    public final NotificationAdapter createNotificationAdapter(@NotNull String clz, @Nullable owg notice) {
        Intrinsics.checkNotNullParameter(clz, "clz");
        int length = clz.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = Intrinsics.compare((int) clz.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        String string = clz.subSequence(i, length + 1).toString();
        if (string.length() == 0) {
            return null;
        }
        try {
            NotificationAdapter notificationAdapter = (NotificationAdapter) Class.forName(string).asSubclass(NotificationAdapter.class).newInstance();
            notificationAdapter.setNotice(notice);
            return notificationAdapter;
        } catch (ReflectiveOperationException e) {
            Logger.e(TAG, "create notice adapter failed, " + string, e);
            return null;
        }
    }

    public final int getIcon(@NotNull Context context, int iconRes) {
        Intrinsics.checkNotNullParameter(context, "context");
        int i = context.getApplicationInfo().icon;
        return (iconRes == 0 || getDrawable(context, iconRes) == null) ? i : iconRes;
    }

    @Nullable
    public final Bitmap getLargeIcon(@NotNull Context context, int iconRes) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (iconRes != 0) {
            Drawable drawable = getDrawable(context, iconRes);
            if (drawable instanceof BitmapDrawable) {
                return ((BitmapDrawable) drawable).getBitmap();
            }
        }
        Drawable drawable2 = getDrawable(context, context.getApplicationInfo().icon);
        if (drawable2 instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable2).getBitmap();
        }
        return null;
    }

    @NotNull
    public final NotificationAdapter getNotificationAdapter(@NotNull owg notice) {
        Intrinsics.checkNotNullParameter(notice, "notice");
        String strI = notice.i();
        if (!TextUtils.isEmpty(strI)) {
            Intrinsics.checkNotNull(strI);
            NotificationAdapter notificationAdapterCreateNotificationAdapter = createNotificationAdapter(strI, notice);
            if (notificationAdapterCreateNotificationAdapter != null) {
                return notificationAdapterCreateNotificationAdapter;
            }
        }
        return new NotificationAdapter(notice);
    }

    public final boolean isNoticeValid(@Nullable owg notice) {
        if (notice == null) {
            Logger.e(TAG, "notice is null");
            return false;
        }
        String str = notice.g;
        String str2 = notice.h;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            Logger.e(TAG, "title or content is null:%s", notice.f29762b, new Object[0]);
            return false;
        }
        if (notice.g() != null) {
            return true;
        }
        Logger.w(TAG, "notice intent is invalid, %s", notice.f29762b, new Object[0]);
        return false;
    }

    @Nullable
    public final Intent parseIntent(@Nullable String uri) {
        if (TextUtils.isEmpty(uri)) {
            return null;
        }
        try {
            return Intent.parseUri(uri, 4);
        } catch (URISyntaxException unused) {
            return null;
        }
    }
}
