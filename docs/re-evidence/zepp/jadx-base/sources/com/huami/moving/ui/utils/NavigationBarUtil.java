package com.huami.moving.ui.utils;

import android.os.Build;
import android.view.View;
import android.view.Window;
import com.airoha.android.lib.RaceCommand.constant.RaceId;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\n"}, d2 = {"Lcom/huami/moving/ui/utils/NavigationBarUtil;", "", "Landroid/view/Window;", "window", "", "hideNavigationBar", "focusNotAle", "clearFocusNotAle", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
public final class NavigationBarUtil {

    @NotNull
    public static final NavigationBarUtil INSTANCE = new NavigationBarUtil();

    private NavigationBarUtil() {
    }

    public final void clearFocusNotAle(@NotNull Window window) {
        try {
            window.clearFlags(8);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void focusNotAle(@NotNull Window window) {
        try {
            window.setFlags(8, 8);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void hideNavigationBar(@NotNull final Window window) {
        try {
            window.setFlags(1024, 1024);
            window.getDecorView().setSystemUiVisibility(2);
            window.getDecorView().setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() { // from class: com.huami.moving.ui.utils.NavigationBarUtil.hideNavigationBar.1
                @Override // android.view.View.OnSystemUiVisibilityChangeListener
                public void onSystemUiVisibilityChange(int visibility) {
                    window.getDecorView().setSystemUiVisibility(Build.VERSION.SDK_INT >= 19 ? 5894 : RaceId.RACE_FLASH_PAGE_PROGRAM);
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
