package com.huami.widget.toast.service;

import android.content.Context;
import androidx.annotation.DrawableRes;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u0000 \r2\u00020\u0001:\u0001\rJ*\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H&J \u0010\u000b\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H&J \u0010\f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H&¨\u0006\u000e"}, d2 = {"Lcom/huami/widget/toast/service/IconToastService;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "resId", "", "message", "duration", "", "showToast", "showError", "showSuccess", "Companion", "toast_release"}, k = 1, mv = {1, 5, 1})
public interface IconToastService {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/huami/widget/toast/service/IconToastService$Companion;", "", "Lcom/huami/widget/toast/service/IconToastService;", "b", "Lcom/huami/widget/toast/service/IconToastService;", "getToastService", "()Lcom/huami/widget/toast/service/IconToastService;", "setToastService", "(Lcom/huami/widget/toast/service/IconToastService;)V", "toastService", "<init>", "()V", "toast_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        private static IconToastService toastService;

        private Companion() {
        }

        @Nullable
        public final IconToastService getToastService() {
            return toastService;
        }

        public final void setToastService(@Nullable IconToastService iconToastService) {
            toastService = iconToastService;
        }
    }

    void showError(@NotNull Context context, @NotNull CharSequence message, int duration);

    void showSuccess(@NotNull Context context, @NotNull CharSequence message, int duration);

    void showToast(@NotNull Context context, @DrawableRes int resId, @NotNull CharSequence message, int duration);
}
