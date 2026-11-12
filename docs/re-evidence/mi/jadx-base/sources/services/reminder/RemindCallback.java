package services.reminder;

import android.content.Context;
import defpackage.bjk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J/\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H'¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lservices/reminder/RemindCallback;", "", "Landroid/content/Context;", "context", "", "remindId", "Lservices/reminder/RemindEvent;", "remindEvent", "Lbjk;", "onPreRemind", "(Landroid/content/Context;Ljava/lang/String;Lservices/reminder/RemindEvent;)Lbjk;", "", "needCancelEventNotice", "(Ljava/lang/String;)Z", "reminder_release"}, k = 1, mv = {2, 0, 0})
public interface RemindCallback {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static boolean needCancelEventNotice(@NotNull RemindCallback remindCallback, @NotNull String remindId) {
            Intrinsics.checkNotNullParameter(remindId, "remindId");
            return false;
        }
    }

    boolean needCancelEventNotice(@NotNull String remindId);

    @Nullable
    bjk onPreRemind(@Nullable Context context, @Nullable String remindId, @Nullable RemindEvent remindEvent);
}
