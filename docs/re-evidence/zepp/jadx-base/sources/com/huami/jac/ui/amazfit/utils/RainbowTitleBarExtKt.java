package com.huami.jac.ui.amazfit.utils;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageButton;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import com.huami.jac.ui.amazfit.R;
import com.huami.lib.rainbow.statusbar.StatusBarCompat;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.lib.rainbow.utils.RainbowUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0000¨\u0006\u0004"}, d2 = {"Lcom/huami/lib/rainbow/titlebar/RainbowTitleBar;", "", "useWhiteMode", "hideNavigationIcon", "jac-ui-amazfit_release"}, k = 2, mv = {1, 5, 1})
public final class RainbowTitleBarExtKt {
    public static final void hideNavigationIcon(@NotNull RainbowTitleBar rainbowTitleBar) {
        View viewFindViewById = rainbowTitleBar.findViewById(R.id.rainbow_navigation_icon);
        ImageButton imageButton = viewFindViewById instanceof ImageButton ? (ImageButton) viewFindViewById : null;
        if (imageButton == null) {
            return;
        }
        imageButton.setVisibility(8);
    }

    public static final void useWhiteMode(@NotNull RainbowTitleBar rainbowTitleBar) {
        Drawable drawable;
        Drawable drawableMutate;
        Context context = rainbowTitleBar.getContext();
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity == null || activity.isFinishing() || activity.isDestroyed() || RainbowUtils.isDarkMode(rainbowTitleBar.getContext())) {
            return;
        }
        int i = R.color.s5;
        rainbowTitleBar.setTitleTextColor(ContextCompat.getColor(activity, i));
        StatusBarCompat.transparent(activity);
        StatusBarCompat.setMode(activity, false);
        View viewFindViewById = rainbowTitleBar.findViewById(R.id.rainbow_navigation_icon);
        ImageButton imageButton = viewFindViewById instanceof ImageButton ? (ImageButton) viewFindViewById : null;
        if (imageButton == null || (drawable = imageButton.getDrawable()) == null || (drawableMutate = drawable.mutate()) == null) {
            return;
        }
        DrawableCompat.setTint(drawableMutate, ContextCompat.getColor(activity, i));
        rainbowTitleBar.setNavigationIcon(drawableMutate);
    }
}
