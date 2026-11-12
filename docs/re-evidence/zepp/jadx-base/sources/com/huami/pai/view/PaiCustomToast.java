package com.huami.pai.view;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.huami.pai.lib.R;
import com.huami.tools.analytics.DbUtils;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/huami/pai/view/PaiCustomToast;", "Landroid/widget/Toast;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "<init>", "(Landroid/content/Context;)V", "Companion", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class PaiCustomToast extends Toast {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J,\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006J\"\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006J$\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006J*\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006J\u0018\u0010\u000e\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0006J\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004J\u001a\u0010\u0010\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004¨\u0006\u0013"}, d2 = {"Lcom/huami/pai/view/PaiCustomToast$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "info", "", "duration", "gravity", "Landroid/widget/Toast;", "makeText", "resId", "msg", "", "showShort", "content", "showLong", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final Toast makeText(@Nullable Context context, @Nullable CharSequence info, int duration, int gravity) {
            if (context == null) {
                return null;
            }
            PaiCustomToast paiCustomToast = new PaiCustomToast(context);
            View viewInflate = View.inflate(context, R.layout.pai_custom_toast, null);
            Objects.requireNonNull(viewInflate, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) viewInflate;
            View childAt = viewGroup.getChildAt(0);
            Objects.requireNonNull(childAt, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView = (TextView) childAt;
            textView.setText(info);
            textView.setGravity(gravity);
            paiCustomToast.setView(viewGroup);
            paiCustomToast.setDuration(duration);
            return paiCustomToast;
        }

        public final void showLong(@Nullable Context context, @Nullable CharSequence content) {
            makeText(context, content, 1).show();
        }

        public final void showShort(@Nullable Context context, int resId) {
            makeText(context, resId, 0).show();
        }

        public final void showShort(@Nullable Context context, @Nullable CharSequence content) {
            makeText(context, content, 0).show();
        }

        @Nullable
        public final Toast makeText(@Nullable Context context, int resId, int duration) {
            if (context == null) {
                return null;
            }
            return makeText(context, resId, duration, 17);
        }

        @Nullable
        public final Toast makeText(@Nullable Context context, @Nullable CharSequence msg, int duration) {
            if (context == null) {
                return null;
            }
            return makeText(context, msg, duration, 17);
        }

        @Nullable
        public final Toast makeText(@Nullable Context context, int resId, int duration, int gravity) {
            if (context == null) {
                return null;
            }
            return makeText(context, context.getResources().getString(resId), duration, gravity);
        }
    }

    public PaiCustomToast(@NotNull Context context) {
        super(context);
    }
}
