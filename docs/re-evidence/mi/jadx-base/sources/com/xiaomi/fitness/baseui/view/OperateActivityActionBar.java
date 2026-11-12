package com.xiaomi.fitness.baseui.view;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0012\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\b\u001a\u00020\tH\u0016J\u0012\u0010\n\u001a\u00020\u00052\b\b\u0001\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/baseui/view/OperateActivityActionBar;", "", "getHostActivity", "Lcom/xiaomi/fitness/baseui/view/IActionBar;", "setActivityTitle", "", "title", "", "titleResId", "", "setActivitySubtitle", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface OperateActivityActionBar {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void setActivitySubtitle(@NotNull OperateActivityActionBar operateActivityActionBar, int i) {
            IActionBar hostActivity = operateActivityActionBar.getHostActivity();
            if (hostActivity != null) {
                hostActivity.setSubtitle(i);
            }
        }

        public static void setActivityTitle(@NotNull OperateActivityActionBar operateActivityActionBar, @NotNull String title) {
            Intrinsics.checkNotNullParameter(title, "title");
            IActionBar hostActivity = operateActivityActionBar.getHostActivity();
            if (hostActivity != null) {
                hostActivity.setTitle(title);
            }
        }

        public static void setActivitySubtitle(@NotNull OperateActivityActionBar operateActivityActionBar, @NotNull String title) {
            Intrinsics.checkNotNullParameter(title, "title");
            IActionBar hostActivity = operateActivityActionBar.getHostActivity();
            if (hostActivity != null) {
                hostActivity.setSubtitle(title);
            }
        }

        public static void setActivityTitle(@NotNull OperateActivityActionBar operateActivityActionBar, int i) {
            IActionBar hostActivity = operateActivityActionBar.getHostActivity();
            if (hostActivity != null) {
                hostActivity.setTitle(i);
            }
        }
    }

    @Nullable
    IActionBar getHostActivity();

    void setActivitySubtitle(int titleResId);

    void setActivitySubtitle(@NotNull String title);

    void setActivityTitle(int titleResId);

    void setActivityTitle(@NotNull String title);
}
