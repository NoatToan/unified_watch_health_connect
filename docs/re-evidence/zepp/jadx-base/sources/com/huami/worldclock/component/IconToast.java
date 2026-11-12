package com.huami.worldclock.component;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import com.huami.tools.analytics.DbUtils;
import com.huami.worldclock.R;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/huami/worldclock/component/IconToast;", "Landroid/widget/Toast;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "<init>", "(Landroid/content/Context;)V", "Companion", "worldclock_release"}, k = 1, mv = {1, 5, 1})
public final class IconToast extends Toast {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J*\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u0004J*\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004J\"\u0010\f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0018\u0010\r\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0018\u0010\r\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0004J\u0018\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0018\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0004¨\u0006\u0011"}, d2 = {"Lcom/huami/worldclock/component/IconToast$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "icon", "", "message", "duration", "", "showToast", "strId", "showShort", "showError", "showSuccess", "<init>", "()V", "worldclock_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void showError(@NotNull Context context, @Nullable CharSequence message) {
            showToast(context, R.drawable.icon_toast_error, message, 0);
        }

        public final void showShort(@NotNull Context context, @DrawableRes int icon, @Nullable CharSequence message) {
            showToast(context, icon, message, 0);
        }

        public final void showSuccess(@NotNull Context context, @Nullable CharSequence message) {
            showToast(context, R.drawable.icon_toast_success, message, 0);
        }

        public final void showToast(@NotNull Context context, @DrawableRes int icon, @Nullable CharSequence message, int duration) {
            View viewInflate = View.inflate(context, R.layout.view_icon_toast, null);
            View viewFindViewById = viewInflate.findViewById(R.id.icon);
            Objects.requireNonNull(viewFindViewById, "null cannot be cast to non-null type android.widget.ImageView");
            ((ImageView) viewFindViewById).setImageResource(icon);
            View viewFindViewById2 = viewInflate.findViewById(R.id.message);
            Objects.requireNonNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) viewFindViewById2).setText(message);
            Toast toast = new Toast(context.getApplicationContext());
            toast.setGravity(17, 0, 0);
            toast.setDuration(duration);
            toast.setView(viewInflate);
            toast.show();
        }

        public final void showError(@NotNull Context context, @StringRes int message) {
            showToast(context, R.drawable.icon_toast_error, context.getResources().getString(message), 0);
        }

        public final void showSuccess(@NotNull Context context, @StringRes int message) {
            showToast(context, R.drawable.icon_toast_success, message, 0);
        }

        public final void showToast(@NotNull Context context, @DrawableRes int icon, @StringRes int strId, int duration) {
            showToast(context, icon, context.getString(strId), duration);
        }
    }

    public IconToast(@Nullable Context context) {
        super(context);
    }
}
